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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0809 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0809";
    public static final String myFingerPrint = "5903266a683532bf099586ca2323ed9d160c58170e258380d50515b5a255088c";
    public static SubLSymbol $g6426$;
    public static SubLSymbol $g6427$;
    public static SubLSymbol $g6428$;
    public static SubLSymbol $g6429$;
    public static SubLSymbol $g6430$;
    public static SubLSymbol $g6431$;
    public static SubLSymbol $g6432$;
    public static SubLSymbol $g6433$;
    public static SubLSymbol $g6434$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLList $ic3$;
    private static final SubLList $ic4$;
    private static final SubLList $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLList $ic8$;
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
    private static final SubLString $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLString $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLString $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLList $ic81$;
    private static final SubLList $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLList $ic99$;
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
    private static final SubLList $ic110$;
    private static final SubLList $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLSymbol $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLList $ic117$;
    private static final SubLList $ic118$;
    private static final SubLList $ic119$;
    private static final SubLList $ic120$;
    private static final SubLSymbol $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLList $ic123$;
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
    private static final SubLSymbol $ic146$;
    private static final SubLSymbol $ic147$;
    private static final SubLSymbol $ic148$;
    private static final SubLSymbol $ic149$;
    private static final SubLSymbol $ic150$;
    private static final SubLSymbol $ic151$;
    private static final SubLSymbol $ic152$;
    private static final SubLSymbol $ic153$;
    private static final SubLSymbol $ic154$;
    private static final SubLSymbol $ic155$;
    private static final SubLSymbol $ic156$;
    private static final SubLSymbol $ic157$;
    private static final SubLSymbol $ic158$;
    private static final SubLSymbol $ic159$;
    private static final SubLSymbol $ic160$;
    private static final SubLSymbol $ic161$;
    private static final SubLSymbol $ic162$;
    private static final SubLSymbol $ic163$;
    private static final SubLSymbol $ic164$;
    private static final SubLSymbol $ic165$;
    private static final SubLSymbol $ic166$;
    private static final SubLSymbol $ic167$;
    private static final SubLSymbol $ic168$;
    private static final SubLString $ic169$;
    private static final SubLInteger $ic170$;
    private static final SubLInteger $ic171$;
    private static final SubLInteger $ic172$;
    private static final SubLString $ic173$;
    private static final SubLSymbol $ic174$;
    private static final SubLSymbol $ic175$;
    private static final SubLString $ic176$;
    private static final SubLSymbol $ic177$;
    private static final SubLSymbol $ic178$;
    private static final SubLSymbol $ic179$;
    private static final SubLSymbol $ic180$;
    private static final SubLSymbol $ic181$;
    private static final SubLSymbol $ic182$;
    private static final SubLSymbol $ic183$;
    private static final SubLSymbol $ic184$;
    private static final SubLString $ic185$;
    private static final SubLString $ic186$;
    private static final SubLSymbol $ic187$;
    private static final SubLSymbol $ic188$;
    private static final SubLList $ic189$;
    private static final SubLList $ic190$;
    private static final SubLSymbol $ic191$;
    private static final SubLSymbol $ic192$;
    private static final SubLList $ic193$;
    private static final SubLSymbol $ic194$;
    private static final SubLSymbol $ic195$;
    private static final SubLSymbol $ic196$;
    private static final SubLSymbol $ic197$;
    private static final SubLSymbol $ic198$;
    private static final SubLList $ic199$;
    private static final SubLList $ic200$;
    private static final SubLSymbol $ic201$;
    private static final SubLSymbol $ic202$;
    private static final SubLList $ic203$;
    private static final SubLSymbol $ic204$;
    private static final SubLSymbol $ic205$;
    private static final SubLList $ic206$;
    private static final SubLSymbol $ic207$;
    private static final SubLList $ic208$;
    private static final SubLSymbol $ic209$;
    private static final SubLList $ic210$;
    private static final SubLSymbol $ic211$;
    private static final SubLList $ic212$;
    private static final SubLSymbol $ic213$;
    private static final SubLList $ic214$;
    private static final SubLSymbol $ic215$;
    private static final SubLList $ic216$;
    private static final SubLSymbol $ic217$;
    private static final SubLList $ic218$;
    private static final SubLSymbol $ic219$;
    private static final SubLSymbol $ic220$;
    private static final SubLSymbol $ic221$;
    private static final SubLSymbol $ic222$;
    private static final SubLSymbol $ic223$;
    private static final SubLString $ic224$;
    private static final SubLString $ic225$;
    private static final SubLString $ic226$;
    private static final SubLString $ic227$;
    private static final SubLString $ic228$;
    private static final SubLString $ic229$;
    private static final SubLString $ic230$;
    private static final SubLString $ic231$;
    private static final SubLString $ic232$;
    private static final SubLString $ic233$;
    private static final SubLString $ic234$;
    private static final SubLString $ic235$;
    private static final SubLString $ic236$;
    private static final SubLSymbol $ic237$;
    private static final SubLSymbol $ic238$;
    private static final SubLSymbol $ic239$;
    private static final SubLSymbol $ic240$;
    private static final SubLSymbol $ic241$;
    
    public static SubLObject f51383(final SubLObject var1, final SubLObject var2) {
        f51384(var1, var2, (SubLObject)module0809.ZERO_INTEGER);
        return (SubLObject)module0809.NIL;
    }
    
    public static SubLObject f51385(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX56038_native.class) ? module0809.T : module0809.NIL);
    }
    
    public static SubLObject f51386(final SubLObject var1) {
        assert module0809.NIL != f51385(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f51387(final SubLObject var1) {
        assert module0809.NIL != f51385(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f51388(final SubLObject var1) {
        assert module0809.NIL != f51385(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f51389(final SubLObject var1) {
        assert module0809.NIL != f51385(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f51390(final SubLObject var1) {
        assert module0809.NIL != f51385(var1) : var1;
        return var1.getField6();
    }
    
    public static SubLObject f51391(final SubLObject var1) {
        assert module0809.NIL != f51385(var1) : var1;
        return var1.getField7();
    }
    
    public static SubLObject f51392(final SubLObject var1) {
        assert module0809.NIL != f51385(var1) : var1;
        return var1.getField8();
    }
    
    public static SubLObject f51393(final SubLObject var1) {
        assert module0809.NIL != f51385(var1) : var1;
        return var1.getField9();
    }
    
    public static SubLObject f51394(final SubLObject var1) {
        assert module0809.NIL != f51385(var1) : var1;
        return var1.getField10();
    }
    
    public static SubLObject f51395(final SubLObject var1) {
        assert module0809.NIL != f51385(var1) : var1;
        return var1.getField11();
    }
    
    public static SubLObject f51396(final SubLObject var1) {
        assert module0809.NIL != f51385(var1) : var1;
        return var1.getField12();
    }
    
    public static SubLObject f51397(final SubLObject var1) {
        assert module0809.NIL != f51385(var1) : var1;
        return var1.getField13();
    }
    
    public static SubLObject f51398(final SubLObject var1) {
        assert module0809.NIL != f51385(var1) : var1;
        return var1.getField14();
    }
    
    public static SubLObject f51399(final SubLObject var1) {
        assert module0809.NIL != f51385(var1) : var1;
        return var1.getField15();
    }
    
    public static SubLObject f51400(final SubLObject var1) {
        assert module0809.NIL != f51385(var1) : var1;
        return var1.getField16();
    }
    
    public static SubLObject f51401(final SubLObject var1) {
        assert module0809.NIL != f51385(var1) : var1;
        return var1.getField17();
    }
    
    public static SubLObject f51402(final SubLObject var1) {
        assert module0809.NIL != f51385(var1) : var1;
        return var1.getField18();
    }
    
    public static SubLObject f51403(final SubLObject var1) {
        assert module0809.NIL != f51385(var1) : var1;
        return var1.getField19();
    }
    
    public static SubLObject f51404(final SubLObject var1) {
        assert module0809.NIL != f51385(var1) : var1;
        return var1.getField20();
    }
    
    public static SubLObject f51405(final SubLObject var1, final SubLObject var4) {
        assert module0809.NIL != f51385(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f51406(final SubLObject var1, final SubLObject var4) {
        assert module0809.NIL != f51385(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f51407(final SubLObject var1, final SubLObject var4) {
        assert module0809.NIL != f51385(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f51408(final SubLObject var1, final SubLObject var4) {
        assert module0809.NIL != f51385(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f51409(final SubLObject var1, final SubLObject var4) {
        assert module0809.NIL != f51385(var1) : var1;
        return var1.setField6(var4);
    }
    
    public static SubLObject f51410(final SubLObject var1, final SubLObject var4) {
        assert module0809.NIL != f51385(var1) : var1;
        return var1.setField7(var4);
    }
    
    public static SubLObject f51411(final SubLObject var1, final SubLObject var4) {
        assert module0809.NIL != f51385(var1) : var1;
        return var1.setField8(var4);
    }
    
    public static SubLObject f51412(final SubLObject var1, final SubLObject var4) {
        assert module0809.NIL != f51385(var1) : var1;
        return var1.setField9(var4);
    }
    
    public static SubLObject f51413(final SubLObject var1, final SubLObject var4) {
        assert module0809.NIL != f51385(var1) : var1;
        return var1.setField10(var4);
    }
    
    public static SubLObject f51414(final SubLObject var1, final SubLObject var4) {
        assert module0809.NIL != f51385(var1) : var1;
        return var1.setField11(var4);
    }
    
    public static SubLObject f51415(final SubLObject var1, final SubLObject var4) {
        assert module0809.NIL != f51385(var1) : var1;
        return var1.setField12(var4);
    }
    
    public static SubLObject f51416(final SubLObject var1, final SubLObject var4) {
        assert module0809.NIL != f51385(var1) : var1;
        return var1.setField13(var4);
    }
    
    public static SubLObject f51417(final SubLObject var1, final SubLObject var4) {
        assert module0809.NIL != f51385(var1) : var1;
        return var1.setField14(var4);
    }
    
    public static SubLObject f51418(final SubLObject var1, final SubLObject var4) {
        assert module0809.NIL != f51385(var1) : var1;
        return var1.setField15(var4);
    }
    
    public static SubLObject f51419(final SubLObject var1, final SubLObject var4) {
        assert module0809.NIL != f51385(var1) : var1;
        return var1.setField16(var4);
    }
    
    public static SubLObject f51420(final SubLObject var1, final SubLObject var4) {
        assert module0809.NIL != f51385(var1) : var1;
        return var1.setField17(var4);
    }
    
    public static SubLObject f51421(final SubLObject var1, final SubLObject var4) {
        assert module0809.NIL != f51385(var1) : var1;
        return var1.setField18(var4);
    }
    
    public static SubLObject f51422(final SubLObject var1, final SubLObject var4) {
        assert module0809.NIL != f51385(var1) : var1;
        return var1.setField19(var4);
    }
    
    public static SubLObject f51423(final SubLObject var1, final SubLObject var4) {
        assert module0809.NIL != f51385(var1) : var1;
        return var1.setField20(var4);
    }
    
    public static SubLObject f51424(SubLObject var5) {
        if (var5 == module0809.UNPROVIDED) {
            var5 = (SubLObject)module0809.NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX56038_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0809.NIL, var7 = var5; module0809.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0809.$ic47$)) {
                f51405(var6, var9);
            }
            else if (var10.eql((SubLObject)module0809.$ic48$)) {
                f51406(var6, var9);
            }
            else if (var10.eql((SubLObject)module0809.$ic49$)) {
                f51407(var6, var9);
            }
            else if (var10.eql((SubLObject)module0809.$ic50$)) {
                f51408(var6, var9);
            }
            else if (var10.eql((SubLObject)module0809.$ic51$)) {
                f51409(var6, var9);
            }
            else if (var10.eql((SubLObject)module0809.$ic52$)) {
                f51410(var6, var9);
            }
            else if (var10.eql((SubLObject)module0809.$ic53$)) {
                f51411(var6, var9);
            }
            else if (var10.eql((SubLObject)module0809.$ic54$)) {
                f51412(var6, var9);
            }
            else if (var10.eql((SubLObject)module0809.$ic55$)) {
                f51413(var6, var9);
            }
            else if (var10.eql((SubLObject)module0809.$ic56$)) {
                f51414(var6, var9);
            }
            else if (var10.eql((SubLObject)module0809.$ic57$)) {
                f51415(var6, var9);
            }
            else if (var10.eql((SubLObject)module0809.$ic58$)) {
                f51416(var6, var9);
            }
            else if (var10.eql((SubLObject)module0809.$ic59$)) {
                f51417(var6, var9);
            }
            else if (var10.eql((SubLObject)module0809.$ic60$)) {
                f51418(var6, var9);
            }
            else if (var10.eql((SubLObject)module0809.$ic61$)) {
                f51419(var6, var9);
            }
            else if (var10.eql((SubLObject)module0809.$ic62$)) {
                f51420(var6, var9);
            }
            else if (var10.eql((SubLObject)module0809.$ic63$)) {
                f51421(var6, var9);
            }
            else if (var10.eql((SubLObject)module0809.$ic64$)) {
                f51422(var6, var9);
            }
            else if (var10.eql((SubLObject)module0809.$ic65$)) {
                f51423(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0809.$ic66$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f51425(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0809.$ic67$, (SubLObject)module0809.$ic68$, (SubLObject)module0809.NINETEEN_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)module0809.$ic69$, (SubLObject)module0809.$ic47$, f51386(var11));
        Functions.funcall(var12, var11, (SubLObject)module0809.$ic69$, (SubLObject)module0809.$ic48$, f51387(var11));
        Functions.funcall(var12, var11, (SubLObject)module0809.$ic69$, (SubLObject)module0809.$ic49$, f51388(var11));
        Functions.funcall(var12, var11, (SubLObject)module0809.$ic69$, (SubLObject)module0809.$ic50$, f51389(var11));
        Functions.funcall(var12, var11, (SubLObject)module0809.$ic69$, (SubLObject)module0809.$ic51$, f51390(var11));
        Functions.funcall(var12, var11, (SubLObject)module0809.$ic69$, (SubLObject)module0809.$ic52$, f51391(var11));
        Functions.funcall(var12, var11, (SubLObject)module0809.$ic69$, (SubLObject)module0809.$ic53$, f51392(var11));
        Functions.funcall(var12, var11, (SubLObject)module0809.$ic69$, (SubLObject)module0809.$ic54$, f51393(var11));
        Functions.funcall(var12, var11, (SubLObject)module0809.$ic69$, (SubLObject)module0809.$ic55$, f51394(var11));
        Functions.funcall(var12, var11, (SubLObject)module0809.$ic69$, (SubLObject)module0809.$ic56$, f51395(var11));
        Functions.funcall(var12, var11, (SubLObject)module0809.$ic69$, (SubLObject)module0809.$ic57$, f51396(var11));
        Functions.funcall(var12, var11, (SubLObject)module0809.$ic69$, (SubLObject)module0809.$ic58$, f51397(var11));
        Functions.funcall(var12, var11, (SubLObject)module0809.$ic69$, (SubLObject)module0809.$ic59$, f51398(var11));
        Functions.funcall(var12, var11, (SubLObject)module0809.$ic69$, (SubLObject)module0809.$ic60$, f51399(var11));
        Functions.funcall(var12, var11, (SubLObject)module0809.$ic69$, (SubLObject)module0809.$ic61$, f51400(var11));
        Functions.funcall(var12, var11, (SubLObject)module0809.$ic69$, (SubLObject)module0809.$ic62$, f51401(var11));
        Functions.funcall(var12, var11, (SubLObject)module0809.$ic69$, (SubLObject)module0809.$ic63$, f51402(var11));
        Functions.funcall(var12, var11, (SubLObject)module0809.$ic69$, (SubLObject)module0809.$ic64$, f51403(var11));
        Functions.funcall(var12, var11, (SubLObject)module0809.$ic69$, (SubLObject)module0809.$ic65$, f51404(var11));
        Functions.funcall(var12, var11, (SubLObject)module0809.$ic70$, (SubLObject)module0809.$ic68$, (SubLObject)module0809.NINETEEN_INTEGER);
        return var11;
    }
    
    public static SubLObject f51426(final SubLObject var11, final SubLObject var12) {
        return f51425(var11, var12);
    }
    
    public static SubLObject f51384(final SubLObject var13, final SubLObject var2, final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        if (module0809.NIL != print_high.$print_readably$.getDynamicValue(var15)) {
            print_high.print_not_readable(var13, var2);
        }
        else {
            streams_high.write_string((SubLObject)module0809.$ic72$, var2, (SubLObject)module0809.UNPROVIDED, (SubLObject)module0809.UNPROVIDED);
            PrintLow.write((SubLObject)Types.type_of(var13), new SubLObject[] { module0809.$ic73$, var2 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var2);
            final SubLObject var16 = f51427(var13);
            final SubLObject var17 = f51428(var13);
            final SubLObject var18 = f51429(var13);
            PrintLow.format(var2, (SubLObject)module0809.$ic74$, new SubLObject[] { var16, var17, var18 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var2);
            PrintLow.write(Equality.pointer(var13), new SubLObject[] { module0809.$ic73$, var2, module0809.$ic75$, module0809.SIXTEEN_INTEGER });
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var2);
        }
        return var13;
    }
    
    public static SubLObject f51430(final SubLObject var13) {
        return Sxhash.sxhash(f51386(var13));
    }
    
    public static SubLObject f51431(final SubLObject var23, final SubLObject var20, final SubLObject var24) {
        assert module0809.NIL != Types.stringp(var20) : var20;
        assert module0809.NIL != f51432(var23) : var23;
        assert module0809.NIL != module0035.f2015(var24) : var24;
        SubLObject var25 = var24;
        SubLObject var26 = (SubLObject)module0809.NIL;
        var26 = var25.first();
        while (module0809.NIL != var25) {
            assert module0809.NIL != Types.symbolp(var26) : var26;
            var25 = var25.rest();
            var26 = var25.first();
        }
        final SubLObject var27 = f51424((SubLObject)module0809.UNPROVIDED);
        f51405(var27, var20);
        f51406(var27, var23);
        f51407(var27, var24);
        f51408(var27, (SubLObject)module0809.NIL);
        f51409(var27, module0067.f4880(Symbols.symbol_function((SubLObject)module0809.EQ), (SubLObject)module0809.UNPROVIDED));
        f51410(var27, module0067.f4880(Symbols.symbol_function((SubLObject)module0809.EQ), (SubLObject)module0809.UNPROVIDED));
        f51411(var27, module0067.f4880(Symbols.symbol_function((SubLObject)module0809.EQ), (SubLObject)module0809.UNPROVIDED));
        f51412(var27, module0067.f4880(Symbols.symbol_function((SubLObject)module0809.EQ), (SubLObject)module0809.UNPROVIDED));
        f51413(var27, module0067.f4880(Symbols.symbol_function((SubLObject)module0809.EQ), (SubLObject)module0809.UNPROVIDED));
        f51414(var27, (SubLObject)module0809.NIL);
        f51415(var27, module0067.f4880(Symbols.symbol_function((SubLObject)module0809.EQ), (SubLObject)module0809.UNPROVIDED));
        f51416(var27, module0067.f4880(Symbols.symbol_function((SubLObject)module0809.EQ), (SubLObject)module0809.UNPROVIDED));
        f51417(var27, module0067.f4880(Symbols.symbol_function((SubLObject)module0809.EQ), (SubLObject)module0809.UNPROVIDED));
        f51418(var27, module0067.f4880(Symbols.symbol_function((SubLObject)module0809.EQ), (SubLObject)module0809.UNPROVIDED));
        f51419(var27, module0067.f4880(Symbols.symbol_function((SubLObject)module0809.EQ), (SubLObject)module0809.UNPROVIDED));
        f51420(var27, module0067.f4880(Symbols.symbol_function((SubLObject)module0809.EQ), (SubLObject)module0809.UNPROVIDED));
        f51421(var27, module0067.f4880(Symbols.symbol_function((SubLObject)module0809.EQ), (SubLObject)module0809.UNPROVIDED));
        f51422(var27, module0067.f4880(Symbols.symbol_function((SubLObject)module0809.EQ), (SubLObject)module0809.UNPROVIDED));
        f51423(var27, module0067.f4880(Symbols.symbol_function((SubLObject)module0809.EQ), (SubLObject)module0809.UNPROVIDED));
        return var27;
    }
    
    public static SubLObject f51433(final SubLObject var29, final SubLObject var30) {
        SubLObject var32;
        final SubLObject var31 = var32 = var29.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)module0809.$ic81$);
        final SubLObject var33 = var32.rest();
        var32 = var32.first();
        SubLObject var34 = (SubLObject)module0809.NIL;
        SubLObject var35 = (SubLObject)module0809.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)module0809.$ic81$);
        var34 = var32.first();
        var32 = var32.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)module0809.$ic81$);
        var35 = var32.first();
        var32 = var32.rest();
        SubLObject var36 = (SubLObject)module0809.NIL;
        SubLObject var37 = var32;
        SubLObject var38 = (SubLObject)module0809.NIL;
        SubLObject var38_39 = (SubLObject)module0809.NIL;
        while (module0809.NIL != var37) {
            cdestructuring_bind.destructuring_bind_must_consp(var37, var31, (SubLObject)module0809.$ic81$);
            var38_39 = var37.first();
            var37 = var37.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var37, var31, (SubLObject)module0809.$ic81$);
            if (module0809.NIL == conses_high.member(var38_39, (SubLObject)module0809.$ic82$, (SubLObject)module0809.UNPROVIDED, (SubLObject)module0809.UNPROVIDED)) {
                var38 = (SubLObject)module0809.T;
            }
            if (var38_39 == module0809.$ic83$) {
                var36 = var37.first();
            }
            var37 = var37.rest();
        }
        if (module0809.NIL != var38 && module0809.NIL == var36) {
            cdestructuring_bind.cdestructuring_bind_error(var31, (SubLObject)module0809.$ic81$);
        }
        final SubLObject var39 = cdestructuring_bind.property_list_member((SubLObject)module0809.$ic84$, var32);
        final SubLObject var40 = (SubLObject)((module0809.NIL != var39) ? conses_high.cadr(var39) : module0809.NIL);
        final SubLObject var41;
        var32 = (var41 = var33);
        final SubLObject var42 = (SubLObject)module0809.$ic85$;
        final SubLObject var43 = (SubLObject)module0809.$ic86$;
        final SubLObject var44 = (SubLObject)module0809.$ic87$;
        return (SubLObject)ConsesLow.list((SubLObject)module0809.$ic88$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var42, var35)), (SubLObject)ConsesLow.list((SubLObject)module0809.$ic89$, (SubLObject)ConsesLow.list(var43, (SubLObject)ConsesLow.list((SubLObject)module0809.$ic90$, var42), (SubLObject)module0809.$ic84$, var40), (SubLObject)ConsesLow.listS((SubLObject)module0809.$ic91$, reader.bq_cons(var34, var44), var43, (SubLObject)ConsesLow.list((SubLObject)module0809.$ic92$, var44), ConsesLow.append(var41, (SubLObject)module0809.NIL))));
    }
    
    public static SubLObject f51434(final SubLObject var28) {
        assert module0809.NIL != f51385(var28) : var28;
        return f51389(var28);
    }
    
    public static SubLObject f51435(final SubLObject var29, final SubLObject var30) {
        SubLObject var32;
        final SubLObject var31 = var32 = var29.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)module0809.$ic81$);
        final SubLObject var33 = var32.rest();
        var32 = var32.first();
        SubLObject var34 = (SubLObject)module0809.NIL;
        SubLObject var35 = (SubLObject)module0809.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)module0809.$ic81$);
        var34 = var32.first();
        var32 = var32.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)module0809.$ic81$);
        var35 = var32.first();
        var32 = var32.rest();
        SubLObject var36 = (SubLObject)module0809.NIL;
        SubLObject var37 = var32;
        SubLObject var38 = (SubLObject)module0809.NIL;
        SubLObject var52_53 = (SubLObject)module0809.NIL;
        while (module0809.NIL != var37) {
            cdestructuring_bind.destructuring_bind_must_consp(var37, var31, (SubLObject)module0809.$ic81$);
            var52_53 = var37.first();
            var37 = var37.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var37, var31, (SubLObject)module0809.$ic81$);
            if (module0809.NIL == conses_high.member(var52_53, (SubLObject)module0809.$ic82$, (SubLObject)module0809.UNPROVIDED, (SubLObject)module0809.UNPROVIDED)) {
                var38 = (SubLObject)module0809.T;
            }
            if (var52_53 == module0809.$ic83$) {
                var36 = var37.first();
            }
            var37 = var37.rest();
        }
        if (module0809.NIL != var38 && module0809.NIL == var36) {
            cdestructuring_bind.cdestructuring_bind_error(var31, (SubLObject)module0809.$ic81$);
        }
        final SubLObject var39 = cdestructuring_bind.property_list_member((SubLObject)module0809.$ic84$, var32);
        final SubLObject var40 = (SubLObject)((module0809.NIL != var39) ? conses_high.cadr(var39) : module0809.NIL);
        final SubLObject var41;
        var32 = (var41 = var33);
        final SubLObject var42 = (SubLObject)module0809.$ic94$;
        final SubLObject var43 = (SubLObject)module0809.$ic95$;
        return (SubLObject)ConsesLow.list((SubLObject)module0809.$ic88$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var42, var35)), (SubLObject)ConsesLow.listS((SubLObject)module0809.$ic96$, (SubLObject)ConsesLow.list(var34, var43, (SubLObject)ConsesLow.list((SubLObject)module0809.$ic97$, var42), var40), (SubLObject)ConsesLow.list((SubLObject)module0809.$ic92$, var43), ConsesLow.append(var41, (SubLObject)module0809.NIL)));
    }
    
    public static SubLObject f51436(final SubLObject var28) {
        return f51390(var28);
    }
    
    public static SubLObject f51437(final SubLObject var29, final SubLObject var30) {
        SubLObject var32;
        final SubLObject var31 = var32 = var29.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)module0809.$ic99$);
        final SubLObject var33 = var32.rest();
        var32 = var32.first();
        SubLObject var34 = (SubLObject)module0809.NIL;
        SubLObject var35 = (SubLObject)module0809.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)module0809.$ic99$);
        var34 = var32.first();
        var32 = var32.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)module0809.$ic99$);
        var35 = var32.first();
        var32 = var32.rest();
        SubLObject var36 = (SubLObject)module0809.NIL;
        SubLObject var37 = var32;
        SubLObject var38 = (SubLObject)module0809.NIL;
        SubLObject var62_63 = (SubLObject)module0809.NIL;
        while (module0809.NIL != var37) {
            cdestructuring_bind.destructuring_bind_must_consp(var37, var31, (SubLObject)module0809.$ic99$);
            var62_63 = var37.first();
            var37 = var37.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var37, var31, (SubLObject)module0809.$ic99$);
            if (module0809.NIL == conses_high.member(var62_63, (SubLObject)module0809.$ic82$, (SubLObject)module0809.UNPROVIDED, (SubLObject)module0809.UNPROVIDED)) {
                var38 = (SubLObject)module0809.T;
            }
            if (var62_63 == module0809.$ic83$) {
                var36 = var37.first();
            }
            var37 = var37.rest();
        }
        if (module0809.NIL != var38 && module0809.NIL == var36) {
            cdestructuring_bind.cdestructuring_bind_error(var31, (SubLObject)module0809.$ic99$);
        }
        final SubLObject var39 = cdestructuring_bind.property_list_member((SubLObject)module0809.$ic84$, var32);
        final SubLObject var40 = (SubLObject)((module0809.NIL != var39) ? conses_high.cadr(var39) : module0809.NIL);
        final SubLObject var41;
        var32 = (var41 = var33);
        final SubLObject var42 = (SubLObject)module0809.$ic100$;
        final SubLObject var43 = (SubLObject)module0809.$ic101$;
        final SubLObject var44 = (SubLObject)module0809.$ic102$;
        return (SubLObject)ConsesLow.list((SubLObject)module0809.$ic88$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var42, var35)), (SubLObject)ConsesLow.list((SubLObject)module0809.$ic89$, (SubLObject)ConsesLow.list(var43, (SubLObject)ConsesLow.list((SubLObject)module0809.$ic103$, var42), (SubLObject)module0809.$ic84$, var40), (SubLObject)ConsesLow.listS((SubLObject)module0809.$ic91$, reader.bq_cons(var34, var44), var43, (SubLObject)ConsesLow.list((SubLObject)module0809.$ic92$, var44), ConsesLow.append(var41, (SubLObject)module0809.NIL))));
    }
    
    public static SubLObject f51438(final SubLObject var28) {
        assert module0809.NIL != f51385(var28) : var28;
        return f51395(var28);
    }
    
    public static SubLObject f51439(final SubLObject var29, final SubLObject var30) {
        SubLObject var32;
        final SubLObject var31 = var32 = var29.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)module0809.$ic99$);
        final SubLObject var33 = var32.rest();
        var32 = var32.first();
        SubLObject var34 = (SubLObject)module0809.NIL;
        SubLObject var35 = (SubLObject)module0809.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)module0809.$ic99$);
        var34 = var32.first();
        var32 = var32.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)module0809.$ic99$);
        var35 = var32.first();
        var32 = var32.rest();
        SubLObject var36 = (SubLObject)module0809.NIL;
        SubLObject var37 = var32;
        SubLObject var38 = (SubLObject)module0809.NIL;
        SubLObject var71_72 = (SubLObject)module0809.NIL;
        while (module0809.NIL != var37) {
            cdestructuring_bind.destructuring_bind_must_consp(var37, var31, (SubLObject)module0809.$ic99$);
            var71_72 = var37.first();
            var37 = var37.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var37, var31, (SubLObject)module0809.$ic99$);
            if (module0809.NIL == conses_high.member(var71_72, (SubLObject)module0809.$ic82$, (SubLObject)module0809.UNPROVIDED, (SubLObject)module0809.UNPROVIDED)) {
                var38 = (SubLObject)module0809.T;
            }
            if (var71_72 == module0809.$ic83$) {
                var36 = var37.first();
            }
            var37 = var37.rest();
        }
        if (module0809.NIL != var38 && module0809.NIL == var36) {
            cdestructuring_bind.cdestructuring_bind_error(var31, (SubLObject)module0809.$ic99$);
        }
        final SubLObject var39 = cdestructuring_bind.property_list_member((SubLObject)module0809.$ic84$, var32);
        final SubLObject var40 = (SubLObject)((module0809.NIL != var39) ? conses_high.cadr(var39) : module0809.NIL);
        final SubLObject var41;
        var32 = (var41 = var33);
        final SubLObject var42 = (SubLObject)module0809.$ic105$;
        final SubLObject var43 = (SubLObject)module0809.$ic106$;
        return (SubLObject)ConsesLow.list((SubLObject)module0809.$ic88$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var42, var35)), (SubLObject)ConsesLow.listS((SubLObject)module0809.$ic96$, (SubLObject)ConsesLow.list(var34, var43, (SubLObject)ConsesLow.list((SubLObject)module0809.$ic107$, var42), var40), (SubLObject)ConsesLow.list((SubLObject)module0809.$ic92$, var43), ConsesLow.append(var41, (SubLObject)module0809.NIL)));
    }
    
    public static SubLObject f51440(final SubLObject var28) {
        return f51396(var28);
    }
    
    public static SubLObject f51427(final SubLObject var28) {
        assert module0809.NIL != f51385(var28) : var28;
        return f51386(var28);
    }
    
    public static SubLObject f51441(final SubLObject var28) {
        assert module0809.NIL != f51385(var28) : var28;
        return f51387(var28);
    }
    
    public static SubLObject f51442(final SubLObject var28) {
        assert module0809.NIL != f51385(var28) : var28;
        return f51388(var28);
    }
    
    public static SubLObject f51443(final SubLObject var28, final SubLObject var34) {
        assert module0809.NIL != f51385(var28) : var28;
        assert module0809.NIL != Types.symbolp(var34) : var34;
        return Sequences.count(var34, f51389(var28), Symbols.symbol_function((SubLObject)module0809.EQ), Symbols.symbol_function((SubLObject)module0809.$ic109$), (SubLObject)module0809.UNPROVIDED, (SubLObject)module0809.UNPROVIDED);
    }
    
    public static SubLObject f51444(final SubLObject var28) {
        assert module0809.NIL != f51385(var28) : var28;
        return Sequences.length(f51389(var28));
    }
    
    public static SubLObject f51428(final SubLObject var28) {
        assert module0809.NIL != f51385(var28) : var28;
        return module0067.f4861(f51390(var28));
    }
    
    public static SubLObject f51445(final SubLObject var28) {
        return (SubLObject)SubLObjectFactory.makeBoolean(!f51444(var28).numE(f51428(var28)));
    }
    
    public static SubLObject f51446(final SubLObject var28, final SubLObject var58) {
        assert module0809.NIL != f51385(var28) : var28;
        assert module0809.NIL != Types.symbolp(var58) : var58;
        return Sequences.count(var58, f51395(var28), Symbols.symbol_function((SubLObject)module0809.EQ), Symbols.symbol_function((SubLObject)module0809.$ic109$), (SubLObject)module0809.UNPROVIDED, (SubLObject)module0809.UNPROVIDED);
    }
    
    public static SubLObject f51447(final SubLObject var28) {
        assert module0809.NIL != f51385(var28) : var28;
        return Sequences.length(f51395(var28));
    }
    
    public static SubLObject f51429(final SubLObject var28) {
        assert module0809.NIL != f51385(var28) : var28;
        return module0067.f4861(f51396(var28));
    }
    
    public static SubLObject f51448(final SubLObject var28) {
        return (SubLObject)SubLObjectFactory.makeBoolean(!f51447(var28).numE(f51429(var28)));
    }
    
    public static SubLObject f51449(final SubLObject var28, final SubLObject var34) {
        assert module0809.NIL != f51385(var28) : var28;
        assert module0809.NIL != Types.symbolp(var34) : var34;
        return module0067.f4885(f51390(var28), var34, (SubLObject)module0809.MINUS_ONE_INTEGER);
    }
    
    public static SubLObject f51450(final SubLObject var28, final SubLObject var34) {
        assert module0809.NIL != f51385(var28) : var28;
        assert module0809.NIL != Types.symbolp(var34) : var34;
        SubLObject var35 = (SubLObject)module0809.NIL;
        SubLObject var36 = f51389(var28);
        SubLObject var37 = (SubLObject)module0809.NIL;
        var37 = var36.first();
        while (module0809.NIL != var36) {
            SubLObject var39;
            final SubLObject var38 = var39 = var37;
            SubLObject var40 = (SubLObject)module0809.NIL;
            SubLObject var41 = (SubLObject)module0809.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var39, var38, (SubLObject)module0809.$ic110$);
            var40 = var39.first();
            var39 = (var41 = var39.rest());
            if (var40.eql(var34)) {
                var35 = (SubLObject)ConsesLow.cons(var41, var35);
            }
            var36 = var36.rest();
            var37 = var36.first();
        }
        return Sequences.nreverse(var35);
    }
    
    public static SubLObject f51451(final SubLObject var28, final SubLObject var58) {
        assert module0809.NIL != f51385(var28) : var28;
        assert module0809.NIL != Types.symbolp(var58) : var58;
        return module0067.f4885(f51396(var28), var58, (SubLObject)module0809.MINUS_ONE_INTEGER);
    }
    
    public static SubLObject f51452(final SubLObject var28, final SubLObject var58) {
        assert module0809.NIL != f51385(var28) : var28;
        assert module0809.NIL != Types.symbolp(var58) : var58;
        SubLObject var59 = (SubLObject)module0809.NIL;
        SubLObject var60 = f51395(var28);
        SubLObject var61 = (SubLObject)module0809.NIL;
        var61 = var60.first();
        while (module0809.NIL != var60) {
            SubLObject var63;
            final SubLObject var62 = var63 = var61;
            SubLObject var64 = (SubLObject)module0809.NIL;
            SubLObject var65 = (SubLObject)module0809.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var63, var62, (SubLObject)module0809.$ic111$);
            var64 = var63.first();
            var63 = (var65 = var63.rest());
            if (var64.eql(var58)) {
                var59 = (SubLObject)ConsesLow.cons(var65, var59);
            }
            var60 = var60.rest();
            var61 = var60.first();
        }
        return Sequences.nreverse(var59);
    }
    
    public static SubLObject f51453(final SubLObject var28, final SubLObject var34) {
        assert module0809.NIL != f51385(var28) : var28;
        assert module0809.NIL != Types.symbolp(var34) : var34;
        return module0067.f4885(f51403(var28), var34, (SubLObject)module0809.$ic112$);
    }
    
    public static SubLObject f51454(final SubLObject var28, final SubLObject var58) {
        assert module0809.NIL != f51385(var28) : var28;
        assert module0809.NIL != Types.symbolp(var58) : var58;
        return module0067.f4885(f51404(var28), var58, (SubLObject)module0809.$ic112$);
    }
    
    public static SubLObject f51455(final SubLObject var28, final SubLObject var34, final SubLObject var45) {
        assert module0809.NIL != f51385(var28) : var28;
        assert module0809.NIL != Types.symbolp(var34) : var34;
        assert module0809.NIL != module0004.f106(var45) : var45;
        f51408(var28, (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var34, var45), f51389(var28)));
        module0067.f4886(f51436(var28), var34, var45);
        return var28;
    }
    
    public static SubLObject f51456(final SubLObject var28, final SubLObject var34) {
        assert module0809.NIL != f51385(var28) : var28;
        assert module0809.NIL != Types.symbolp(var34) : var34;
        f51408(var28, Sequences.delete(var34, f51389(var28), Symbols.symbol_function((SubLObject)module0809.EQ), Symbols.symbol_function((SubLObject)module0809.$ic109$), (SubLObject)module0809.UNPROVIDED, (SubLObject)module0809.UNPROVIDED, (SubLObject)module0809.UNPROVIDED));
        module0067.f4887(f51436(var28), var34);
        return var28;
    }
    
    public static SubLObject f51457(final SubLObject var28, final SubLObject var34, final SubLObject var82) {
        assert module0809.NIL != f51385(var28) : var28;
        assert module0809.NIL != Types.symbolp(var34) : var34;
        assert module0809.NIL != Types.listp(var82) : var82;
        module0067.f4886(f51403(var28), var34, var82);
        return var28;
    }
    
    public static SubLObject f51458(final SubLObject var28, final SubLObject var58, final SubLObject var83) {
        assert module0809.NIL != f51385(var28) : var28;
        assert module0809.NIL != Types.symbolp(var58) : var58;
        assert module0809.NIL != module0811.f51808(var83) : var83;
        module0067.f4886(f51404(var28), var58, var83);
        return var28;
    }
    
    public static SubLObject f51459(final SubLObject var28, final SubLObject var58, final SubLObject var45) {
        assert module0809.NIL != f51385(var28) : var28;
        assert module0809.NIL != Types.symbolp(var58) : var58;
        assert module0809.NIL != module0004.f106(var45) : var45;
        f51414(var28, (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var58, var45), f51395(var28)));
        module0067.f4886(f51440(var28), var58, var45);
        return var28;
    }
    
    public static SubLObject f51460(final SubLObject var28, final SubLObject var58) {
        assert module0809.NIL != f51385(var28) : var28;
        assert module0809.NIL != Types.symbolp(var58) : var58;
        f51414(var28, Sequences.delete(var58, f51395(var28), Symbols.symbol_function((SubLObject)module0809.EQ), Symbols.symbol_function((SubLObject)module0809.$ic109$), (SubLObject)module0809.UNPROVIDED, (SubLObject)module0809.UNPROVIDED, (SubLObject)module0809.UNPROVIDED));
        module0067.f4887(f51440(var28), var58);
        return var28;
    }
    
    public static SubLObject f51461(final SubLObject var28, final SubLObject var84, final SubLObject var85) {
        assert module0809.NIL != f51385(var28) : var28;
        assert module0809.NIL != Types.symbolp(var84) : var84;
        assert module0809.NIL != Types.symbolp(var85) : var85;
        module0084.f5765(f51391(var28), var84, var85, Symbols.symbol_function((SubLObject)module0809.EQ), (SubLObject)module0809.UNPROVIDED);
        return var28;
    }
    
    public static SubLObject f51462(final SubLObject var28, final SubLObject var84, final SubLObject var86) {
        assert module0809.NIL != f51385(var28) : var28;
        assert module0809.NIL != Types.symbolp(var84) : var84;
        assert module0809.NIL != Types.symbolp(var86) : var86;
        module0084.f5765(f51392(var28), var84, var86, Symbols.symbol_function((SubLObject)module0809.EQ), (SubLObject)module0809.UNPROVIDED);
        return var28;
    }
    
    public static SubLObject f51463(final SubLObject var28, final SubLObject var84, final SubLObject var87) {
        assert module0809.NIL != f51385(var28) : var28;
        assert module0809.NIL != Types.symbolp(var84) : var84;
        assert module0809.NIL != Types.symbolp(var87) : var87;
        module0084.f5765(f51393(var28), var84, var87, Symbols.symbol_function((SubLObject)module0809.EQ), (SubLObject)module0809.UNPROVIDED);
        return var28;
    }
    
    public static SubLObject f51464(final SubLObject var28, final SubLObject var84, final SubLObject var88) {
        assert module0809.NIL != f51385(var28) : var28;
        assert module0809.NIL != Types.symbolp(var84) : var84;
        assert module0809.NIL != Types.symbolp(var88) : var88;
        module0084.f5765(f51394(var28), var84, var88, Symbols.symbol_function((SubLObject)module0809.EQ), (SubLObject)module0809.UNPROVIDED);
        return var28;
    }
    
    public static SubLObject f51465(final SubLObject var28, final SubLObject var89, final SubLObject var85) {
        assert module0809.NIL != f51385(var28) : var28;
        assert module0809.NIL != Types.symbolp(var89) : var89;
        assert module0809.NIL != Types.symbolp(var85) : var85;
        module0084.f5765(f51397(var28), var89, var85, Symbols.symbol_function((SubLObject)module0809.EQ), (SubLObject)module0809.UNPROVIDED);
        return var28;
    }
    
    public static SubLObject f51466(final SubLObject var28, final SubLObject var89, final SubLObject var86) {
        assert module0809.NIL != f51385(var28) : var28;
        assert module0809.NIL != Types.symbolp(var89) : var89;
        assert module0809.NIL != Types.symbolp(var86) : var86;
        module0084.f5765(f51398(var28), var89, var86, Symbols.symbol_function((SubLObject)module0809.EQ), (SubLObject)module0809.UNPROVIDED);
        return var28;
    }
    
    public static SubLObject f51467(final SubLObject var28, final SubLObject var85, final SubLObject var45) {
        assert module0809.NIL != f51385(var28) : var28;
        assert module0809.NIL != Types.symbolp(var85) : var85;
        assert module0809.NIL != module0004.f106(var45) : var45;
        SubLObject var86 = module0067.f4885(f51399(var28), var85, (SubLObject)module0809.UNPROVIDED);
        if (!var45.eql(var86.first())) {
            var86 = (SubLObject)ConsesLow.cons(var45, var86);
            module0067.f4886(f51399(var28), var85, var86);
        }
        return var28;
    }
    
    public static SubLObject f51468(final SubLObject var28, final SubLObject var86, final SubLObject var45) {
        assert module0809.NIL != f51385(var28) : var28;
        assert module0809.NIL != Types.symbolp(var86) : var86;
        assert module0809.NIL != module0004.f106(var45) : var45;
        SubLObject var87 = module0067.f4885(f51400(var28), var86, (SubLObject)module0809.UNPROVIDED);
        if (!var45.eql(var87.first())) {
            var87 = (SubLObject)ConsesLow.cons(var45, var87);
            module0067.f4886(f51400(var28), var86, var87);
        }
        return var28;
    }
    
    public static SubLObject f51469(final SubLObject var28, final SubLObject var87, final SubLObject var45) {
        assert module0809.NIL != f51385(var28) : var28;
        assert module0809.NIL != Types.symbolp(var87) : var87;
        assert module0809.NIL != module0004.f106(var45) : var45;
        SubLObject var88 = module0067.f4885(f51401(var28), var87, (SubLObject)module0809.UNPROVIDED);
        if (!var45.eql(var88.first())) {
            var88 = (SubLObject)ConsesLow.cons(var45, var88);
            module0067.f4886(f51401(var28), var87, var88);
        }
        return var28;
    }
    
    public static SubLObject f51470(final SubLObject var28, final SubLObject var88, final SubLObject var45) {
        assert module0809.NIL != f51385(var28) : var28;
        assert module0809.NIL != Types.symbolp(var88) : var88;
        assert module0809.NIL != module0004.f106(var45) : var45;
        SubLObject var89 = module0067.f4885(f51402(var28), var88, (SubLObject)module0809.UNPROVIDED);
        if (!var45.eql(var89.first())) {
            var89 = (SubLObject)ConsesLow.cons(var45, var89);
            module0067.f4886(f51402(var28), var88, var89);
        }
        return var28;
    }
    
    public static SubLObject f51471(final SubLObject var1, final SubLObject var2) {
        f51472(var1, var2, (SubLObject)module0809.ZERO_INTEGER);
        return (SubLObject)module0809.NIL;
    }
    
    public static SubLObject f51432(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX56041_native.class) ? module0809.T : module0809.NIL);
    }
    
    public static SubLObject f51473(final SubLObject var1) {
        assert module0809.NIL != f51432(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f51474(final SubLObject var1) {
        assert module0809.NIL != f51432(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f51475(final SubLObject var1) {
        assert module0809.NIL != f51432(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f51476(final SubLObject var1) {
        assert module0809.NIL != f51432(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f51477(final SubLObject var1) {
        assert module0809.NIL != f51432(var1) : var1;
        return var1.getField6();
    }
    
    public static SubLObject f51478(final SubLObject var1) {
        assert module0809.NIL != f51432(var1) : var1;
        return var1.getField7();
    }
    
    public static SubLObject f51479(final SubLObject var1) {
        assert module0809.NIL != f51432(var1) : var1;
        return var1.getField8();
    }
    
    public static SubLObject f51480(final SubLObject var1) {
        assert module0809.NIL != f51432(var1) : var1;
        return var1.getField9();
    }
    
    public static SubLObject f51481(final SubLObject var1) {
        assert module0809.NIL != f51432(var1) : var1;
        return var1.getField10();
    }
    
    public static SubLObject f51482(final SubLObject var1) {
        assert module0809.NIL != f51432(var1) : var1;
        return var1.getField11();
    }
    
    public static SubLObject f51483(final SubLObject var1) {
        assert module0809.NIL != f51432(var1) : var1;
        return var1.getField12();
    }
    
    public static SubLObject f51484(final SubLObject var1) {
        assert module0809.NIL != f51432(var1) : var1;
        return var1.getField13();
    }
    
    public static SubLObject f51485(final SubLObject var1) {
        assert module0809.NIL != f51432(var1) : var1;
        return var1.getField14();
    }
    
    public static SubLObject f51486(final SubLObject var1) {
        assert module0809.NIL != f51432(var1) : var1;
        return var1.getField15();
    }
    
    public static SubLObject f51487(final SubLObject var1) {
        assert module0809.NIL != f51432(var1) : var1;
        return var1.getField16();
    }
    
    public static SubLObject f51488(final SubLObject var1, final SubLObject var4) {
        assert module0809.NIL != f51432(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f51489(final SubLObject var1, final SubLObject var4) {
        assert module0809.NIL != f51432(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f51490(final SubLObject var1, final SubLObject var4) {
        assert module0809.NIL != f51432(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f51491(final SubLObject var1, final SubLObject var4) {
        assert module0809.NIL != f51432(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f51492(final SubLObject var1, final SubLObject var4) {
        assert module0809.NIL != f51432(var1) : var1;
        return var1.setField6(var4);
    }
    
    public static SubLObject f51493(final SubLObject var1, final SubLObject var4) {
        assert module0809.NIL != f51432(var1) : var1;
        return var1.setField7(var4);
    }
    
    public static SubLObject f51494(final SubLObject var1, final SubLObject var4) {
        assert module0809.NIL != f51432(var1) : var1;
        return var1.setField8(var4);
    }
    
    public static SubLObject f51495(final SubLObject var1, final SubLObject var4) {
        assert module0809.NIL != f51432(var1) : var1;
        return var1.setField9(var4);
    }
    
    public static SubLObject f51496(final SubLObject var1, final SubLObject var4) {
        assert module0809.NIL != f51432(var1) : var1;
        return var1.setField10(var4);
    }
    
    public static SubLObject f51497(final SubLObject var1, final SubLObject var4) {
        assert module0809.NIL != f51432(var1) : var1;
        return var1.setField11(var4);
    }
    
    public static SubLObject f51498(final SubLObject var1, final SubLObject var4) {
        assert module0809.NIL != f51432(var1) : var1;
        return var1.setField12(var4);
    }
    
    public static SubLObject f51499(final SubLObject var1, final SubLObject var4) {
        assert module0809.NIL != f51432(var1) : var1;
        return var1.setField13(var4);
    }
    
    public static SubLObject f51500(final SubLObject var1, final SubLObject var4) {
        assert module0809.NIL != f51432(var1) : var1;
        return var1.setField14(var4);
    }
    
    public static SubLObject f51501(final SubLObject var1, final SubLObject var4) {
        assert module0809.NIL != f51432(var1) : var1;
        return var1.setField15(var4);
    }
    
    public static SubLObject f51502(final SubLObject var1, final SubLObject var4) {
        assert module0809.NIL != f51432(var1) : var1;
        return var1.setField16(var4);
    }
    
    public static SubLObject f51503(SubLObject var5) {
        if (var5 == module0809.UNPROVIDED) {
            var5 = (SubLObject)module0809.NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX56041_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0809.NIL, var7 = var5; module0809.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0809.$ic47$)) {
                f51488(var6, var9);
            }
            else if (var10.eql((SubLObject)module0809.$ic49$)) {
                f51489(var6, var9);
            }
            else if (var10.eql((SubLObject)module0809.$ic154$)) {
                f51490(var6, var9);
            }
            else if (var10.eql((SubLObject)module0809.$ic155$)) {
                f51491(var6, var9);
            }
            else if (var10.eql((SubLObject)module0809.$ic156$)) {
                f51492(var6, var9);
            }
            else if (var10.eql((SubLObject)module0809.$ic157$)) {
                f51493(var6, var9);
            }
            else if (var10.eql((SubLObject)module0809.$ic158$)) {
                f51494(var6, var9);
            }
            else if (var10.eql((SubLObject)module0809.$ic159$)) {
                f51495(var6, var9);
            }
            else if (var10.eql((SubLObject)module0809.$ic160$)) {
                f51496(var6, var9);
            }
            else if (var10.eql((SubLObject)module0809.$ic161$)) {
                f51497(var6, var9);
            }
            else if (var10.eql((SubLObject)module0809.$ic162$)) {
                f51498(var6, var9);
            }
            else if (var10.eql((SubLObject)module0809.$ic163$)) {
                f51499(var6, var9);
            }
            else if (var10.eql((SubLObject)module0809.$ic164$)) {
                f51500(var6, var9);
            }
            else if (var10.eql((SubLObject)module0809.$ic165$)) {
                f51501(var6, var9);
            }
            else if (var10.eql((SubLObject)module0809.$ic166$)) {
                f51502(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0809.$ic66$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f51504(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0809.$ic67$, (SubLObject)module0809.$ic167$, (SubLObject)module0809.FIFTEEN_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)module0809.$ic69$, (SubLObject)module0809.$ic47$, f51473(var11));
        Functions.funcall(var12, var11, (SubLObject)module0809.$ic69$, (SubLObject)module0809.$ic49$, f51474(var11));
        Functions.funcall(var12, var11, (SubLObject)module0809.$ic69$, (SubLObject)module0809.$ic154$, f51475(var11));
        Functions.funcall(var12, var11, (SubLObject)module0809.$ic69$, (SubLObject)module0809.$ic155$, f51476(var11));
        Functions.funcall(var12, var11, (SubLObject)module0809.$ic69$, (SubLObject)module0809.$ic156$, f51477(var11));
        Functions.funcall(var12, var11, (SubLObject)module0809.$ic69$, (SubLObject)module0809.$ic157$, f51478(var11));
        Functions.funcall(var12, var11, (SubLObject)module0809.$ic69$, (SubLObject)module0809.$ic158$, f51479(var11));
        Functions.funcall(var12, var11, (SubLObject)module0809.$ic69$, (SubLObject)module0809.$ic159$, f51480(var11));
        Functions.funcall(var12, var11, (SubLObject)module0809.$ic69$, (SubLObject)module0809.$ic160$, f51481(var11));
        Functions.funcall(var12, var11, (SubLObject)module0809.$ic69$, (SubLObject)module0809.$ic161$, f51482(var11));
        Functions.funcall(var12, var11, (SubLObject)module0809.$ic69$, (SubLObject)module0809.$ic162$, f51483(var11));
        Functions.funcall(var12, var11, (SubLObject)module0809.$ic69$, (SubLObject)module0809.$ic163$, f51484(var11));
        Functions.funcall(var12, var11, (SubLObject)module0809.$ic69$, (SubLObject)module0809.$ic164$, f51485(var11));
        Functions.funcall(var12, var11, (SubLObject)module0809.$ic69$, (SubLObject)module0809.$ic165$, f51486(var11));
        Functions.funcall(var12, var11, (SubLObject)module0809.$ic69$, (SubLObject)module0809.$ic166$, f51487(var11));
        Functions.funcall(var12, var11, (SubLObject)module0809.$ic70$, (SubLObject)module0809.$ic167$, (SubLObject)module0809.FIFTEEN_INTEGER);
        return var11;
    }
    
    public static SubLObject f51505(final SubLObject var11, final SubLObject var12) {
        return f51504(var11, var12);
    }
    
    public static SubLObject f51472(final SubLObject var13, final SubLObject var2, final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        if (module0809.NIL != print_high.$print_readably$.getDynamicValue(var15)) {
            print_high.print_not_readable(var13, var2);
        }
        else {
            streams_high.write_string((SubLObject)module0809.$ic72$, var2, (SubLObject)module0809.UNPROVIDED, (SubLObject)module0809.UNPROVIDED);
            PrintLow.write((SubLObject)Types.type_of(var13), new SubLObject[] { module0809.$ic73$, var2 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var2);
            final SubLObject var16 = f51506(var13);
            final SubLObject var17 = Sequences.length(f51474(var13));
            final SubLObject var18 = f51507(var13);
            PrintLow.format(var2, (SubLObject)module0809.$ic169$, new SubLObject[] { var16, var17, var18 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var2);
            PrintLow.write(Equality.pointer(var13), new SubLObject[] { module0809.$ic73$, var2, module0809.$ic75$, module0809.SIXTEEN_INTEGER });
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var2);
        }
        return var13;
    }
    
    public static SubLObject f51508(final SubLObject var20, final SubLObject var24) {
        assert module0809.NIL != Types.stringp(var20) : var20;
        assert module0809.NIL != module0035.f2015(var24) : var24;
        SubLObject var25 = var24;
        SubLObject var26 = (SubLObject)module0809.NIL;
        var26 = var25.first();
        while (module0809.NIL != var25) {
            assert module0809.NIL != Types.symbolp(var26) : var26;
            var25 = var25.rest();
            var26 = var25.first();
        }
        final SubLObject var27 = (SubLObject)module0809.$ic170$;
        final SubLObject var28 = (SubLObject)module0809.$ic171$;
        final SubLObject var29 = (SubLObject)module0809.$ic172$;
        final SubLObject var30 = f51503((SubLObject)module0809.UNPROVIDED);
        f51488(var30, var20);
        f51489(var30, var24);
        f51490(var30, Hashtables.make_hash_table(var29, Symbols.symbol_function((SubLObject)module0809.EQUAL), (SubLObject)module0809.UNPROVIDED));
        f51491(var30, Hashtables.make_hash_table(var27, Symbols.symbol_function((SubLObject)module0809.EQ), (SubLObject)module0809.UNPROVIDED));
        f51492(var30, Hashtables.make_hash_table(var28, Symbols.symbol_function((SubLObject)module0809.EQ), (SubLObject)module0809.UNPROVIDED));
        f51493(var30, Hashtables.make_hash_table(var27, Symbols.symbol_function((SubLObject)module0809.EQ), (SubLObject)module0809.UNPROVIDED));
        f51494(var30, Hashtables.make_hash_table(var27, Symbols.symbol_function((SubLObject)module0809.EQ), (SubLObject)module0809.UNPROVIDED));
        f51495(var30, Hashtables.make_hash_table(var27, Symbols.symbol_function((SubLObject)module0809.EQ), (SubLObject)module0809.UNPROVIDED));
        f51496(var30, Hashtables.make_hash_table(var28, Symbols.symbol_function((SubLObject)module0809.EQ), (SubLObject)module0809.UNPROVIDED));
        f51497(var30, Hashtables.make_hash_table(var28, Symbols.symbol_function((SubLObject)module0809.EQ), (SubLObject)module0809.UNPROVIDED));
        f51498(var30, Hashtables.make_hash_table(var28, Symbols.symbol_function((SubLObject)module0809.EQ), (SubLObject)module0809.UNPROVIDED));
        f51499(var30, Hashtables.make_hash_table(var28, Symbols.symbol_function((SubLObject)module0809.EQ), (SubLObject)module0809.UNPROVIDED));
        f51500(var30, Hashtables.make_hash_table(var28, Symbols.symbol_function((SubLObject)module0809.EQ), (SubLObject)module0809.UNPROVIDED));
        f51501(var30, Hashtables.make_hash_table(var28, Symbols.symbol_function((SubLObject)module0809.EQ), (SubLObject)module0809.UNPROVIDED));
        f51502(var30, Hashtables.make_hash_table(var28, Symbols.symbol_function((SubLObject)module0809.EQ), (SubLObject)module0809.UNPROVIDED));
        return var30;
    }
    
    public static SubLObject f51506(final SubLObject var99) {
        assert module0809.NIL != f51432(var99) : var99;
        return f51473(var99);
    }
    
    public static SubLObject f51509(final SubLObject var99) {
        assert module0809.NIL != f51432(var99) : var99;
        return f51474(var99);
    }
    
    public static SubLObject f51507(final SubLObject var99) {
        assert module0809.NIL != f51432(var99) : var99;
        return Hashtables.hash_table_count(f51475(var99));
    }
    
    public static SubLObject f51510(final SubLObject var99, final SubLObject var100) {
        assert module0809.NIL != f51432(var99) : var99;
        assert module0809.NIL != Types.stringp(var100) : var100;
        return Hashtables.gethash_without_values(var100, f51475(var99), (SubLObject)module0809.NIL);
    }
    
    public static SubLObject f51511(final SubLObject var99, final SubLObject var34) {
        assert module0809.NIL != f51432(var99) : var99;
        assert module0809.NIL != Types.symbolp(var34) : var34;
        final SubLObject var100 = f51476(var99);
        final SubLObject var101 = Hashtables.gethash_without_values(var34, var100, (SubLObject)module0809.NIL);
        if (module0809.NIL != f51385(var101)) {
            return var101;
        }
        return var101.first();
    }
    
    public static SubLObject f51512(final SubLObject var99, final SubLObject var34) {
        assert module0809.NIL != f51432(var99) : var99;
        assert module0809.NIL != Types.symbolp(var34) : var34;
        final SubLObject var100 = f51476(var99);
        final SubLObject var101 = Hashtables.gethash_without_values(var34, var100, (SubLObject)module0809.NIL);
        if (module0809.NIL != f51385(var101)) {
            return (SubLObject)ConsesLow.list(var101);
        }
        return conses_high.copy_list(var101);
    }
    
    public static SubLObject f51513(final SubLObject var99, final SubLObject var34) {
        assert module0809.NIL != f51432(var99) : var99;
        final SubLObject var100 = f51476(var99);
        final SubLObject var101 = Hashtables.gethash_without_values(var34, var100, (SubLObject)module0809.NIL);
        SubLObject var102 = (SubLObject)module0809.ZERO_INTEGER;
        if (module0809.NIL != f51385(var101)) {
            final SubLObject var103 = var101;
            var102 = Numbers.add(var102, f51443(var103, var34));
        }
        else {
            SubLObject var104 = var101;
            SubLObject var105 = (SubLObject)module0809.NIL;
            var105 = var104.first();
            while (module0809.NIL != var104) {
                var102 = Numbers.add(var102, f51443(var105, var34));
                var104 = var104.rest();
                var105 = var104.first();
            }
        }
        return var102;
    }
    
    public static SubLObject f51514(final SubLObject var99, final SubLObject var58) {
        assert module0809.NIL != f51432(var99) : var99;
        assert module0809.NIL != Types.symbolp(var58) : var58;
        final SubLObject var100 = f51477(var99);
        final SubLObject var101 = Hashtables.gethash_without_values(var58, var100, (SubLObject)module0809.NIL);
        if (module0809.NIL != f51385(var101)) {
            return var101;
        }
        return var101.first();
    }
    
    public static SubLObject f51515(final SubLObject var99, final SubLObject var58) {
        assert module0809.NIL != f51432(var99) : var99;
        assert module0809.NIL != Types.symbolp(var58) : var58;
        final SubLObject var100 = f51477(var99);
        final SubLObject var101 = Hashtables.gethash_without_values(var58, var100, (SubLObject)module0809.NIL);
        if (module0809.NIL != f51385(var101)) {
            return (SubLObject)ConsesLow.list(var101);
        }
        return conses_high.copy_list(var101);
    }
    
    public static SubLObject f51516(final SubLObject var99, final SubLObject var58) {
        assert module0809.NIL != f51432(var99) : var99;
        final SubLObject var100 = f51477(var99);
        final SubLObject var101 = Hashtables.gethash_without_values(var58, var100, (SubLObject)module0809.NIL);
        SubLObject var102 = (SubLObject)module0809.ZERO_INTEGER;
        if (module0809.NIL != f51385(var101)) {
            final SubLObject var103 = var101;
            var102 = Numbers.add(var102, f51446(var103, var58));
        }
        else {
            SubLObject var104 = var101;
            SubLObject var105 = (SubLObject)module0809.NIL;
            var105 = var104.first();
            while (module0809.NIL != var104) {
                var102 = Numbers.add(var102, f51446(var105, var58));
                var104 = var104.rest();
                var105 = var104.first();
            }
        }
        return var102;
    }
    
    public static SubLObject f51517(final SubLObject var99, final SubLObject var104, final SubLObject var105) {
        assert module0809.NIL != f51432(var99) : var99;
        assert module0809.NIL != Types.stringp(var104) : var104;
        final SubLObject var106 = f51510(var99, var104);
        if (module0809.NIL != var106) {
            final SubLObject var107 = f51442(var106);
            if (!var107.equal(var105)) {
                Errors.warn((SubLObject)module0809.$ic173$, var104, var105);
                f51407(var106, var105);
                return (SubLObject)module0809.T;
            }
        }
        return (SubLObject)module0809.NIL;
    }
    
    public static SubLObject f51518() {
        final SubLObject var107 = module0813.f52032();
        if (module0809.NIL != var107) {
            return module0813.f52077(var107);
        }
        return (SubLObject)module0809.NIL;
    }
    
    public static SubLObject f51519() {
        final SubLObject var107 = module0813.f52032();
        if (module0809.NIL != var107) {
            return conses_high.copy_list(module0813.f52079(var107));
        }
        return (SubLObject)module0809.NIL;
    }
    
    public static SubLObject f51520() {
        final SubLObject var107 = module0813.f52032();
        if (module0809.NIL != var107) {
            return conses_high.copy_tree(module0813.f52073(var107));
        }
        return (SubLObject)module0809.NIL;
    }
    
    public static SubLObject f51521(final SubLObject var108) {
        final SubLObject var109 = module0813.f52032();
        if (module0809.NIL != var109) {
            SubLObject var110 = (SubLObject)module0809.NIL;
            SubLObject var111 = var108;
            SubLObject var112 = (SubLObject)module0809.NIL;
            var112 = var111.first();
            while (module0809.NIL != var111) {
                if (module0809.NIL != module0813.f52082(var109, var112)) {
                    var110 = (SubLObject)ConsesLow.cons(var112, var110);
                }
                var111 = var111.rest();
                var112 = var111.first();
            }
            return Sequences.nreverse(var110);
        }
        return (SubLObject)module0809.NIL;
    }
    
    public static SubLObject f51522(final SubLObject var104) {
        return module0035.sublisp_boolean(f51523(var104));
    }
    
    public static SubLObject f51523(final SubLObject var104) {
        assert module0809.NIL != Types.stringp(var104) : var104;
        final SubLObject var105 = f51518();
        if (module0809.NIL != var105) {
            return f51510(var105, var104);
        }
        return (SubLObject)module0809.NIL;
    }
    
    public static SubLObject f51524(final SubLObject var104) {
        assert module0809.NIL != Types.stringp(var104) : var104;
        final SubLObject var105 = module0813.f52032();
        if (module0809.NIL != var105) {
            return conses_high.copy_tree(module0813.f52086(var105, var104));
        }
        return (SubLObject)module0809.NIL;
    }
    
    public static SubLObject f51525(final SubLObject var104) {
        assert module0809.NIL != Types.stringp(var104) : var104;
        final SubLObject var105 = module0813.f52032();
        if (module0809.NIL != var105) {
            return module0813.f52083(var105, var104);
        }
        return (SubLObject)module0809.NIL;
    }
    
    public static SubLObject f51526(final SubLObject var34) {
        assert module0809.NIL != Types.symbolp(var34) : var34;
        if (var34.isMacroOperator()) {
            return (SubLObject)SubLObjectFactory.makeBoolean(!module0018.$g577$.getGlobalValue().eql(Symbols.symbol_package(var34)));
        }
        final SubLObject var35 = module0813.f52032();
        if (module0809.NIL == var35) {
            return (SubLObject)module0809.NIL;
        }
        final SubLObject var37;
        final SubLObject var36 = var37 = module0813.f52072(var35);
        if (var37.eql((SubLObject)module0809.$ic174$)) {
            return module0815.f52207(var34);
        }
        if (var37.eql((SubLObject)module0809.$ic175$)) {
            return module0818.f52393(var34);
        }
        return Errors.error((SubLObject)module0809.$ic176$, var36);
    }
    
    public static SubLObject f51527(final SubLObject var58) {
        assert module0809.NIL != Types.symbolp(var58) : var58;
        final SubLObject var59 = module0813.f52032();
        if (module0809.NIL == var59) {
            return (SubLObject)module0809.NIL;
        }
        final SubLObject var61;
        final SubLObject var60 = var61 = module0813.f52072(var59);
        if (var61.eql((SubLObject)module0809.$ic174$)) {
            return module0815.f52214(var58);
        }
        if (var61.eql((SubLObject)module0809.$ic175$)) {
            return module0818.f52409(var58);
        }
        return Errors.error((SubLObject)module0809.$ic176$, var60);
    }
    
    public static SubLObject f51528(final SubLObject var34) {
        final SubLObject var35 = f51518();
        if (module0809.NIL != var35) {
            final SubLObject var36 = f51511(var35, var34);
            if (module0809.NIL != var36) {
                return f51453(var36, var34);
            }
        }
        return (SubLObject)module0809.$ic112$;
    }
    
    public static SubLObject f51529(final SubLObject var34) {
        assert module0809.NIL != Types.symbolp(var34) : var34;
        SubLObject var35 = f51528(var34);
        if (var35 == module0809.$ic112$ && module0809.NIL != module0004.f85(var34)) {
            var35 = module0004.f86(var34);
        }
        return var35;
    }
    
    public static SubLObject f51530(final SubLObject var58) {
        final SubLObject var59 = f51518();
        if (module0809.NIL != var59) {
            final SubLObject var60 = f51514(var59, var58);
            if (module0809.NIL != var60) {
                return f51454(var60, var58);
            }
        }
        return (SubLObject)module0809.$ic112$;
    }
    
    public static SubLObject f51531(final SubLObject var34) {
        final SubLObject var35 = f51518();
        return (SubLObject)((module0809.NIL != var35) ? f51513(var35, var34) : module0809.ZERO_INTEGER);
    }
    
    public static SubLObject f51532(final SubLObject var34) {
        return Numbers.numE((SubLObject)module0809.ZERO_INTEGER, f51531(var34));
    }
    
    public static SubLObject f51533(final SubLObject var34) {
        final SubLObject var35 = f51518();
        if (module0809.NIL != var35) {
            return f51511(var35, var34);
        }
        return (SubLObject)module0809.NIL;
    }
    
    public static SubLObject f51534(final SubLObject var34) {
        final SubLObject var35 = f51533(var34);
        return (SubLObject)((module0809.NIL != var35) ? f51427(var35) : module0809.NIL);
    }
    
    public static SubLObject f51535(final SubLObject var34) {
        return Numbers.numLE((SubLObject)module0809.TWO_INTEGER, f51531(var34));
    }
    
    public static SubLObject f51536(final SubLObject var34) {
        final SubLObject var35 = f51518();
        if (module0809.NIL != var35) {
            return module0035.f2076(Symbols.symbol_function((SubLObject)module0809.$ic177$), f51512(var35, var34));
        }
        return (SubLObject)module0809.NIL;
    }
    
    public static SubLObject f51537(final SubLObject var58) {
        final SubLObject var59 = f51518();
        return (SubLObject)((module0809.NIL != var59) ? f51516(var59, var58) : module0809.ZERO_INTEGER);
    }
    
    public static SubLObject f51538(final SubLObject var58) {
        return Numbers.numE((SubLObject)module0809.ZERO_INTEGER, f51537(var58));
    }
    
    public static SubLObject f51539(final SubLObject var58) {
        final SubLObject var59 = f51518();
        if (module0809.NIL != var59) {
            return f51514(var59, var58);
        }
        return (SubLObject)module0809.NIL;
    }
    
    public static SubLObject f51540(final SubLObject var58) {
        final SubLObject var59 = f51539(var58);
        return (SubLObject)((module0809.NIL != var59) ? f51427(var59) : module0809.NIL);
    }
    
    public static SubLObject f51541(final SubLObject var58) {
        return Numbers.numLE((SubLObject)module0809.TWO_INTEGER, f51537(var58));
    }
    
    public static SubLObject f51542(final SubLObject var58) {
        final SubLObject var59 = f51518();
        if (module0809.NIL != var59) {
            return module0035.f2076(Symbols.symbol_function((SubLObject)module0809.$ic177$), f51515(var59, var58));
        }
        return (SubLObject)module0809.NIL;
    }
    
    public static SubLObject f51543(final SubLObject var34) {
        final SubLObject var35 = f51518();
        if (module0809.NIL != var35) {
            final SubLObject var36 = f51511(var35, var34);
            if (module0809.NIL != var36) {
                return f51449(var36, var34);
            }
        }
        return (SubLObject)module0809.NIL;
    }
    
    public static SubLObject f51544(final SubLObject var34) {
        final SubLObject var35 = f51531(var34);
        if (var35.eql((SubLObject)module0809.ZERO_INTEGER)) {
            return (SubLObject)module0809.NIL;
        }
        if (var35.eql((SubLObject)module0809.ONE_INTEGER)) {
            final SubLObject var36 = f51534(var34);
            final SubLObject var37 = f51543(var34);
            return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons(var36, var37));
        }
        final SubLObject var38 = f51518();
        SubLObject var39 = (SubLObject)module0809.NIL;
        SubLObject var40 = f51512(var38, var34);
        SubLObject var41 = (SubLObject)module0809.NIL;
        var41 = var40.first();
        while (module0809.NIL != var40) {
            final SubLObject var42 = f51427(var41);
            SubLObject var26_113;
            final SubLObject var43 = var26_113 = f51450(var41, var34);
            SubLObject var44 = (SubLObject)module0809.NIL;
            var44 = var26_113.first();
            while (module0809.NIL != var26_113) {
                var39 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var42, var44), var39);
                var26_113 = var26_113.rest();
                var44 = var26_113.first();
            }
            var40 = var40.rest();
            var41 = var40.first();
        }
        return Sequences.nreverse(var39);
    }
    
    public static SubLObject f51545(final SubLObject var58) {
        final SubLObject var59 = f51518();
        if (module0809.NIL != var59) {
            final SubLObject var60 = f51514(var59, var58);
            if (module0809.NIL != var60) {
                return f51451(var60, var58);
            }
        }
        return (SubLObject)module0809.NIL;
    }
    
    public static SubLObject f51546(final SubLObject var58) {
        final SubLObject var59 = f51537(var58);
        if (var59.eql((SubLObject)module0809.ZERO_INTEGER)) {
            return (SubLObject)module0809.NIL;
        }
        if (var59.eql((SubLObject)module0809.ONE_INTEGER)) {
            final SubLObject var60 = f51540(var58);
            final SubLObject var61 = f51545(var58);
            return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons(var60, var61));
        }
        final SubLObject var62 = f51518();
        SubLObject var63 = (SubLObject)module0809.NIL;
        SubLObject var64 = f51515(var62, var58);
        SubLObject var65 = (SubLObject)module0809.NIL;
        var65 = var64.first();
        while (module0809.NIL != var64) {
            final SubLObject var66 = f51427(var65);
            SubLObject var26_114;
            final SubLObject var67 = var26_114 = f51452(var65, var58);
            SubLObject var68 = (SubLObject)module0809.NIL;
            var68 = var26_114.first();
            while (module0809.NIL != var26_114) {
                var63 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var66, var68), var63);
                var26_114 = var26_114.rest();
                var68 = var26_114.first();
            }
            var64 = var64.rest();
            var65 = var64.first();
        }
        return Sequences.nreverse(var63);
    }
    
    public static SubLObject f51547(final SubLObject var104) {
        assert module0809.NIL != Types.stringp(var104) : var104;
        final SubLObject var105 = f51523(var104);
        if (module0809.NIL == var105) {
            return (SubLObject)module0809.NIL;
        }
        final SubLObject var106 = Sequences.nreverse(Mapping.mapcar(Symbols.symbol_function((SubLObject)module0809.$ic109$), f51434(var105)));
        if (module0809.NIL != f51445(var105)) {
            return module0035.f2269(var106, Symbols.symbol_function((SubLObject)module0809.EQ), (SubLObject)module0809.UNPROVIDED, (SubLObject)module0809.UNPROVIDED, (SubLObject)module0809.UNPROVIDED, (SubLObject)module0809.UNPROVIDED);
        }
        return var106;
    }
    
    public static SubLObject f51548(final SubLObject var104, final SubLObject var34) {
        assert module0809.NIL != Types.stringp(var104) : var104;
        assert module0809.NIL != Types.symbolp(var34) : var34;
        final SubLObject var105 = f51523(var104);
        if (module0809.NIL == var105) {
            return (SubLObject)module0809.ZERO_INTEGER;
        }
        if (module0809.NIL != f51445(var105)) {
            return Sequences.count(var34, f51434(var105), Symbols.symbol_function((SubLObject)module0809.EQ), Symbols.symbol_function((SubLObject)module0809.$ic109$), (SubLObject)module0809.UNPROVIDED, (SubLObject)module0809.UNPROVIDED);
        }
        return (SubLObject)((module0809.NIL != module0067.f4885(f51436(var105), var34, (SubLObject)module0809.UNPROVIDED)) ? module0809.ONE_INTEGER : module0809.ZERO_INTEGER);
    }
    
    public static SubLObject f51549(final SubLObject var104, final SubLObject var34) {
        assert module0809.NIL != Types.stringp(var104) : var104;
        assert module0809.NIL != Types.symbolp(var34) : var34;
        final SubLObject var105 = f51523(var104);
        if (module0809.NIL == var105) {
            return (SubLObject)module0809.NIL;
        }
        if (module0809.NIL != f51445(var105)) {
            final SubLObject var106 = f51434(var105);
            final SubLObject var107 = Sequences.remove(var34, var106, Symbols.symbol_function((SubLObject)module0809.$ic178$), Symbols.symbol_function((SubLObject)module0809.$ic109$), (SubLObject)module0809.UNPROVIDED, (SubLObject)module0809.UNPROVIDED, (SubLObject)module0809.UNPROVIDED);
            final SubLObject var108 = module0035.f2076(Symbols.symbol_function((SubLObject)module0809.$ic179$), var107);
            return var108;
        }
        final SubLObject var109 = f51436(var105);
        final SubLObject var110 = module0067.f4885(var109, var34, (SubLObject)module0809.UNPROVIDED);
        return (SubLObject)((module0809.NIL != var110) ? ConsesLow.list(var110) : module0809.NIL);
    }
    
    public static SubLObject f51550(final SubLObject var104) {
        assert module0809.NIL != Types.stringp(var104) : var104;
        final SubLObject var105 = f51523(var104);
        if (module0809.NIL == var105) {
            return (SubLObject)module0809.NIL;
        }
        final SubLObject var106 = Sequences.nreverse(Mapping.mapcar(Symbols.symbol_function((SubLObject)module0809.$ic109$), f51438(var105)));
        if (module0809.NIL != f51448(var105)) {
            return module0035.f2269(var106, Symbols.symbol_function((SubLObject)module0809.EQ), (SubLObject)module0809.UNPROVIDED, (SubLObject)module0809.UNPROVIDED, (SubLObject)module0809.UNPROVIDED, (SubLObject)module0809.UNPROVIDED);
        }
        return var106;
    }
    
    public static SubLObject f51551(final SubLObject var104, final SubLObject var58) {
        assert module0809.NIL != Types.stringp(var104) : var104;
        assert module0809.NIL != Types.symbolp(var58) : var58;
        final SubLObject var105 = f51523(var104);
        if (module0809.NIL == var105) {
            return (SubLObject)module0809.ZERO_INTEGER;
        }
        if (module0809.NIL != f51448(var105)) {
            return Sequences.count(var58, f51438(var105), Symbols.symbol_function((SubLObject)module0809.EQ), Symbols.symbol_function((SubLObject)module0809.$ic109$), (SubLObject)module0809.UNPROVIDED, (SubLObject)module0809.UNPROVIDED);
        }
        return (SubLObject)((module0809.NIL != module0067.f4885(f51440(var105), var58, (SubLObject)module0809.UNPROVIDED)) ? module0809.ONE_INTEGER : module0809.ZERO_INTEGER);
    }
    
    public static SubLObject f51552(final SubLObject var104, final SubLObject var58) {
        assert module0809.NIL != Types.stringp(var104) : var104;
        assert module0809.NIL != Types.symbolp(var58) : var58;
        final SubLObject var105 = f51523(var104);
        if (module0809.NIL == var105) {
            return (SubLObject)module0809.NIL;
        }
        if (module0809.NIL != f51448(var105)) {
            final SubLObject var106 = f51438(var105);
            final SubLObject var107 = Sequences.remove(var58, var106, Symbols.symbol_function((SubLObject)module0809.$ic178$), Symbols.symbol_function((SubLObject)module0809.$ic109$), (SubLObject)module0809.UNPROVIDED, (SubLObject)module0809.UNPROVIDED, (SubLObject)module0809.UNPROVIDED);
            final SubLObject var108 = module0035.f2076(Symbols.symbol_function((SubLObject)module0809.$ic179$), var107);
            return var108;
        }
        final SubLObject var109 = f51440(var105);
        final SubLObject var110 = module0067.f4885(var109, var58, (SubLObject)module0809.UNPROVIDED);
        return (SubLObject)((module0809.NIL != var110) ? ConsesLow.list(var110) : module0809.NIL);
    }
    
    public static SubLObject f51553(final SubLObject var119, final SubLObject var34) {
        final SubLObject var120 = f51533(var34);
        if (module0809.NIL != var120) {
            final SubLObject var121 = f51391(var120);
            final SubLObject var122 = module0067.f4885(var121, var34, (SubLObject)module0809.NIL);
            return module0035.f2169(var119, var122);
        }
        return (SubLObject)module0809.NIL;
    }
    
    public static SubLObject f51554(final SubLObject var34) {
        final SubLObject var35 = f51533(var34);
        if (module0809.NIL != var35) {
            final SubLObject var36 = f51391(var35);
            final SubLObject var37 = module0067.f4885(var36, var34, (SubLObject)module0809.NIL);
            return conses_high.copy_list(var37);
        }
        return (SubLObject)module0809.NIL;
    }
    
    public static SubLObject f51555(final SubLObject var34) {
        final SubLObject var35 = f51533(var34);
        if (module0809.NIL != var35) {
            final SubLObject var36 = f51392(var35);
            final SubLObject var37 = module0067.f4885(var36, var34, (SubLObject)module0809.NIL);
            return conses_high.copy_list(var37);
        }
        return (SubLObject)module0809.NIL;
    }
    
    public static SubLObject f51556(final SubLObject var34) {
        final SubLObject var35 = f51533(var34);
        if (module0809.NIL != var35) {
            final SubLObject var36 = f51393(var35);
            final SubLObject var37 = module0067.f4885(var36, var34, (SubLObject)module0809.NIL);
            return conses_high.copy_list(var37);
        }
        return (SubLObject)module0809.NIL;
    }
    
    public static SubLObject f51557(final SubLObject var34) {
        final SubLObject var35 = f51533(var34);
        if (module0809.NIL != var35) {
            final SubLObject var36 = f51394(var35);
            final SubLObject var37 = module0067.f4885(var36, var34, (SubLObject)module0809.NIL);
            return conses_high.copy_list(var37);
        }
        return (SubLObject)module0809.NIL;
    }
    
    public static SubLObject f51558(final SubLObject var34) {
        return module0035.f2269(ConsesLow.nconc(f51555(var34), f51556(var34), f51557(var34)), Symbols.symbol_function((SubLObject)module0809.EQ), (SubLObject)module0809.UNPROVIDED, (SubLObject)module0809.UNPROVIDED, (SubLObject)module0809.UNPROVIDED, (SubLObject)module0809.UNPROVIDED);
    }
    
    public static SubLObject f51559(final SubLObject var119, final SubLObject var58) {
        final SubLObject var120 = f51539(var58);
        if (module0809.NIL != var120) {
            final SubLObject var121 = f51397(var120);
            final SubLObject var122 = module0067.f4885(var121, var58, (SubLObject)module0809.NIL);
            return module0035.f2169(var119, var122);
        }
        return (SubLObject)module0809.NIL;
    }
    
    public static SubLObject f51560(final SubLObject var58) {
        final SubLObject var59 = f51539(var58);
        if (module0809.NIL != var59) {
            final SubLObject var60 = f51397(var59);
            final SubLObject var61 = module0067.f4885(var60, var58, (SubLObject)module0809.NIL);
            return conses_high.copy_list(var61);
        }
        return (SubLObject)module0809.NIL;
    }
    
    public static SubLObject f51561(final SubLObject var58) {
        final SubLObject var59 = f51539(var58);
        if (module0809.NIL != var59) {
            final SubLObject var60 = f51398(var59);
            final SubLObject var61 = module0067.f4885(var60, var58, (SubLObject)module0809.NIL);
            return conses_high.copy_list(var61);
        }
        return (SubLObject)module0809.NIL;
    }
    
    public static SubLObject f51562(final SubLObject var119, final SubLObject var104) {
        final SubLObject var120 = f51523(var104);
        if (module0809.NIL != var120) {
            final SubLObject var121 = f51399(var120);
            final SubLObject var122 = module0067.f4885(var121, var119, (SubLObject)module0809.NIL);
            return module0035.sublisp_boolean(var122);
        }
        return (SubLObject)module0809.NIL;
    }
    
    public static SubLObject f51563(final SubLObject var104, final SubLObject var119) {
        final SubLObject var120 = f51523(var104);
        if (module0809.NIL != var120) {
            final SubLObject var121 = f51399(var120);
            final SubLObject var122 = module0067.f4885(var121, var119, (SubLObject)module0809.NIL);
            return conses_high.copy_list(var122);
        }
        return (SubLObject)module0809.NIL;
    }
    
    public static SubLObject f51564(final SubLObject var104) {
        final SubLObject var105 = f51523(var104);
        if (module0809.NIL != var105) {
            final SubLObject var106 = f51399(var105);
            return module0067.f4902(var106);
        }
        return (SubLObject)module0809.NIL;
    }
    
    public static SubLObject f51565(final SubLObject var104, final SubLObject var122) {
        final SubLObject var123 = f51523(var104);
        if (module0809.NIL != var123) {
            final SubLObject var124 = f51400(var123);
            final SubLObject var125 = module0067.f4885(var124, var122, (SubLObject)module0809.NIL);
            return conses_high.copy_list(var125);
        }
        return (SubLObject)module0809.NIL;
    }
    
    public static SubLObject f51566(final SubLObject var104) {
        final SubLObject var105 = f51523(var104);
        if (module0809.NIL != var105) {
            final SubLObject var106 = f51400(var105);
            return module0067.f4902(var106);
        }
        return (SubLObject)module0809.NIL;
    }
    
    public static SubLObject f51567(final SubLObject var104, final SubLObject var122) {
        final SubLObject var123 = f51523(var104);
        if (module0809.NIL != var123) {
            final SubLObject var124 = f51401(var123);
            final SubLObject var125 = module0067.f4885(var124, var122, (SubLObject)module0809.NIL);
            return conses_high.copy_list(var125);
        }
        return (SubLObject)module0809.NIL;
    }
    
    public static SubLObject f51568(final SubLObject var104) {
        final SubLObject var105 = f51523(var104);
        if (module0809.NIL != var105) {
            final SubLObject var106 = f51401(var105);
            return module0067.f4902(var106);
        }
        return (SubLObject)module0809.NIL;
    }
    
    public static SubLObject f51569(final SubLObject var104, final SubLObject var122) {
        final SubLObject var123 = f51523(var104);
        if (module0809.NIL != var123) {
            final SubLObject var124 = f51402(var123);
            final SubLObject var125 = module0067.f4885(var124, var122, (SubLObject)module0809.NIL);
            return conses_high.copy_list(var125);
        }
        return (SubLObject)module0809.NIL;
    }
    
    public static SubLObject f51570(final SubLObject var104) {
        final SubLObject var105 = f51523(var104);
        if (module0809.NIL != var105) {
            final SubLObject var106 = f51402(var105);
            return module0067.f4902(var106);
        }
        return (SubLObject)module0809.NIL;
    }
    
    public static SubLObject f51571(final SubLObject var104, final SubLObject var122) {
        return module0035.f2269(ConsesLow.nconc(f51565(var104, var122), f51567(var104, var122), f51569(var104, var122)), Symbols.symbol_function((SubLObject)module0809.EQL), (SubLObject)module0809.UNPROVIDED, (SubLObject)module0809.UNPROVIDED, (SubLObject)module0809.UNPROVIDED, (SubLObject)module0809.UNPROVIDED);
    }
    
    public static SubLObject f51572(final SubLObject var104) {
        return module0035.f2269(ConsesLow.nconc(f51566(var104), f51568(var104), f51570(var104)), Symbols.symbol_function((SubLObject)module0809.EQ), (SubLObject)module0809.UNPROVIDED, (SubLObject)module0809.UNPROVIDED, (SubLObject)module0809.UNPROVIDED, (SubLObject)module0809.UNPROVIDED);
    }
    
    public static SubLObject f51573(final SubLObject var34) {
        final SubLObject var35 = f51518();
        if (module0809.NIL != var35) {
            final SubLObject var36 = f51478(var35);
            final SubLObject var37 = Hashtables.gethash_without_values(var34, var36, (SubLObject)module0809.UNPROVIDED);
            return module0032.f1753(var37);
        }
        return (SubLObject)module0809.NIL;
    }
    
    public static SubLObject f51574(final SubLObject var34) {
        final SubLObject var35 = f51518();
        if (module0809.NIL != var35) {
            final SubLObject var36 = f51479(var35);
            final SubLObject var37 = Hashtables.gethash_without_values(var34, var36, (SubLObject)module0809.UNPROVIDED);
            return module0032.f1753(var37);
        }
        return (SubLObject)module0809.NIL;
    }
    
    public static SubLObject f51575(final SubLObject var34) {
        final SubLObject var35 = f51518();
        if (module0809.NIL != var35) {
            final SubLObject var36 = f51480(var35);
            final SubLObject var37 = Hashtables.gethash_without_values(var34, var36, (SubLObject)module0809.UNPROVIDED);
            return module0032.f1753(var37);
        }
        return (SubLObject)module0809.NIL;
    }
    
    public static SubLObject f51576(final SubLObject var34) {
        return module0035.f2076(Symbols.symbol_function((SubLObject)module0809.$ic177$), f51575(var34));
    }
    
    public static SubLObject f51577(final SubLObject var34) {
        final SubLObject var35 = f51518();
        SubLObject var36 = (SubLObject)module0809.ZERO_INTEGER;
        if (module0809.NIL != var35) {
            SubLObject var37 = f51478(var35);
            final SubLObject var38 = Hashtables.gethash_without_values(var34, var37, (SubLObject)module0809.UNPROVIDED);
            var36 = Numbers.add(var36, module0032.f1728(var38));
            var37 = f51479(var35);
            final SubLObject var39 = Hashtables.gethash_without_values(var34, var37, (SubLObject)module0809.UNPROVIDED);
            var36 = Numbers.add(var36, module0032.f1728(var39));
            var37 = f51480(var35);
            final SubLObject var40 = Hashtables.gethash_without_values(var34, var37, (SubLObject)module0809.UNPROVIDED);
            var36 = Numbers.add(var36, module0032.f1728(var40));
        }
        return var36;
    }
    
    public static SubLObject f51578(final SubLObject var34) {
        return Numbers.numE((SubLObject)module0809.ZERO_INTEGER, f51577(var34));
    }
    
    public static SubLObject f51579(final SubLObject var58) {
        final SubLObject var59 = f51518();
        if (module0809.NIL != var59) {
            final SubLObject var60 = f51481(var59);
            final SubLObject var61 = Hashtables.gethash_without_values(var58, var60, (SubLObject)module0809.UNPROVIDED);
            return module0032.f1753(var61);
        }
        return (SubLObject)module0809.NIL;
    }
    
    public static SubLObject f51580(final SubLObject var58) {
        final SubLObject var59 = f51518();
        if (module0809.NIL != var59) {
            final SubLObject var60 = f51484(var59);
            final SubLObject var61 = Hashtables.gethash_without_values(var58, var60, (SubLObject)module0809.UNPROVIDED);
            return module0032.f1753(var61);
        }
        return (SubLObject)module0809.NIL;
    }
    
    public static SubLObject f51581(final SubLObject var58) {
        final SubLObject var59 = f51518();
        if (module0809.NIL != var59) {
            final SubLObject var60 = f51485(var59);
            final SubLObject var61 = Hashtables.gethash_without_values(var58, var60, (SubLObject)module0809.UNPROVIDED);
            return module0032.f1753(var61);
        }
        return (SubLObject)module0809.NIL;
    }
    
    public static SubLObject f51582(final SubLObject var58) {
        return module0035.f2076(Symbols.symbol_function((SubLObject)module0809.$ic177$), f51581(var58));
    }
    
    public static SubLObject f51583(final SubLObject var58) {
        final SubLObject var59 = f51518();
        SubLObject var60 = (SubLObject)module0809.ZERO_INTEGER;
        if (module0809.NIL != var59) {
            SubLObject var61 = f51481(var59);
            final SubLObject var62 = Hashtables.gethash_without_values(var58, var61, (SubLObject)module0809.UNPROVIDED);
            var60 = Numbers.add(var60, module0032.f1728(var62));
            var61 = f51484(var59);
            final SubLObject var63 = Hashtables.gethash_without_values(var58, var61, (SubLObject)module0809.UNPROVIDED);
            var60 = Numbers.add(var60, module0032.f1728(var63));
            var61 = f51485(var59);
            final SubLObject var64 = Hashtables.gethash_without_values(var58, var61, (SubLObject)module0809.UNPROVIDED);
            var60 = Numbers.add(var60, module0032.f1728(var64));
        }
        return var60;
    }
    
    public static SubLObject f51584(final SubLObject var58) {
        return Numbers.numE((SubLObject)module0809.ZERO_INTEGER, f51583(var58));
    }
    
    public static SubLObject f51585(final SubLObject var58) {
        final SubLObject var59 = f51518();
        if (module0809.NIL != var59) {
            final SubLObject var60 = f51482(var59);
            final SubLObject var61 = Hashtables.gethash_without_values(var58, var60, (SubLObject)module0809.UNPROVIDED);
            return module0032.f1753(var61);
        }
        return (SubLObject)module0809.NIL;
    }
    
    public static SubLObject f51586(final SubLObject var58) {
        final SubLObject var59 = f51518();
        if (module0809.NIL != var59) {
            final SubLObject var60 = f51486(var59);
            final SubLObject var61 = Hashtables.gethash_without_values(var58, var60, (SubLObject)module0809.UNPROVIDED);
            return module0032.f1753(var61);
        }
        return (SubLObject)module0809.NIL;
    }
    
    public static SubLObject f51587(final SubLObject var58) {
        return module0035.f2076(Symbols.symbol_function((SubLObject)module0809.$ic177$), f51586(var58));
    }
    
    public static SubLObject f51588(final SubLObject var58) {
        final SubLObject var59 = f51518();
        SubLObject var60 = (SubLObject)module0809.ZERO_INTEGER;
        if (module0809.NIL != var59) {
            SubLObject var61 = f51482(var59);
            final SubLObject var62 = Hashtables.gethash_without_values(var58, var61, (SubLObject)module0809.UNPROVIDED);
            var60 = Numbers.add(var60, module0032.f1728(var62));
            var61 = f51486(var59);
            final SubLObject var63 = Hashtables.gethash_without_values(var58, var61, (SubLObject)module0809.UNPROVIDED);
            var60 = Numbers.add(var60, module0032.f1728(var63));
        }
        return var60;
    }
    
    public static SubLObject f51589(final SubLObject var58) {
        return Numbers.numE((SubLObject)module0809.ZERO_INTEGER, f51588(var58));
    }
    
    public static SubLObject f51590(final SubLObject var58) {
        final SubLObject var59 = f51518();
        if (module0809.NIL != var59) {
            final SubLObject var60 = f51483(var59);
            final SubLObject var61 = Hashtables.gethash_without_values(var58, var60, (SubLObject)module0809.UNPROVIDED);
            return module0032.f1753(var61);
        }
        return (SubLObject)module0809.NIL;
    }
    
    public static SubLObject f51591(final SubLObject var58) {
        final SubLObject var59 = f51518();
        if (module0809.NIL != var59) {
            final SubLObject var60 = f51487(var59);
            final SubLObject var61 = Hashtables.gethash_without_values(var58, var60, (SubLObject)module0809.UNPROVIDED);
            return module0032.f1753(var61);
        }
        return (SubLObject)module0809.NIL;
    }
    
    public static SubLObject f51592(final SubLObject var58) {
        return module0035.f2076(Symbols.symbol_function((SubLObject)module0809.$ic177$), f51591(var58));
    }
    
    public static SubLObject f51593(final SubLObject var58) {
        final SubLObject var59 = f51518();
        SubLObject var60 = (SubLObject)module0809.ZERO_INTEGER;
        if (module0809.NIL != var59) {
            SubLObject var61 = f51483(var59);
            final SubLObject var62 = Hashtables.gethash_without_values(var58, var61, (SubLObject)module0809.UNPROVIDED);
            var60 = Numbers.add(var60, module0032.f1728(var62));
            var61 = f51487(var59);
            final SubLObject var63 = Hashtables.gethash_without_values(var58, var61, (SubLObject)module0809.UNPROVIDED);
            var60 = Numbers.add(var60, module0032.f1728(var63));
        }
        return var60;
    }
    
    public static SubLObject f51594(final SubLObject var58) {
        return Numbers.numE((SubLObject)module0809.ZERO_INTEGER, f51593(var58));
    }
    
    public static SubLObject f51595(final SubLObject var58) {
        return module0035.f2269(ConsesLow.nconc(f51579(var58), f51585(var58), f51590(var58)), Symbols.symbol_function((SubLObject)module0809.EQ), (SubLObject)module0809.UNPROVIDED, (SubLObject)module0809.UNPROVIDED, (SubLObject)module0809.UNPROVIDED, (SubLObject)module0809.UNPROVIDED);
    }
    
    public static SubLObject f51596(final SubLObject var58) {
        return module0035.f2269(ConsesLow.nconc(f51581(var58), f51586(var58), f51591(var58)), Symbols.symbol_function((SubLObject)module0809.EQ), (SubLObject)module0809.UNPROVIDED, (SubLObject)module0809.UNPROVIDED, (SubLObject)module0809.UNPROVIDED, (SubLObject)module0809.UNPROVIDED);
    }
    
    public static SubLObject f51597(final SubLObject var58) {
        return module0035.f2076(Symbols.symbol_function((SubLObject)module0809.$ic177$), f51596(var58));
    }
    
    public static SubLObject f51598(final SubLObject var58) {
        return Numbers.add(f51583(var58), f51588(var58), f51593(var58));
    }
    
    public static SubLObject f51599(final SubLObject var58) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0809.NIL != f51584(var58) && module0809.NIL != f51589(var58) && module0809.NIL != f51594(var58));
    }
    
    public static SubLObject f51600(final SubLObject var34) {
        final SubLObject var35 = f51533(var34);
        if (module0809.NIL != var35) {
            SubLObject var36 = module0032.f1726((SubLObject)module0809.ZERO_INTEGER, Symbols.symbol_function((SubLObject)module0809.EQ));
            SubLObject var37 = f51392(var35);
            SubLObject var39;
            final SubLObject var38 = var39 = module0067.f4885(var37, var34, (SubLObject)module0809.NIL);
            SubLObject var40 = (SubLObject)module0809.NIL;
            var40 = var39.first();
            while (module0809.NIL != var39) {
                final SubLObject var41 = f51539(var40);
                if (module0809.NIL != var41) {
                    var36 = module0032.f1736(var41, var36, Symbols.symbol_function((SubLObject)module0809.EQ));
                }
                var39 = var39.rest();
                var40 = var39.first();
            }
            var37 = f51393(var35);
            final SubLObject var42 = var39 = module0067.f4885(var37, var34, (SubLObject)module0809.NIL);
            SubLObject var43 = (SubLObject)module0809.NIL;
            var43 = var39.first();
            while (module0809.NIL != var39) {
                final SubLObject var41 = f51539(var43);
                if (module0809.NIL != var41) {
                    var36 = module0032.f1736(var41, var36, Symbols.symbol_function((SubLObject)module0809.EQ));
                }
                var39 = var39.rest();
                var43 = var39.first();
            }
            var37 = f51394(var35);
            final SubLObject var44 = var39 = module0067.f4885(var37, var34, (SubLObject)module0809.NIL);
            SubLObject var45 = (SubLObject)module0809.NIL;
            var45 = var39.first();
            while (module0809.NIL != var39) {
                final SubLObject var41 = f51539(var45);
                if (module0809.NIL != var41) {
                    var36 = module0032.f1736(var41, var36, Symbols.symbol_function((SubLObject)module0809.EQ));
                }
                var39 = var39.rest();
                var45 = var39.first();
            }
            var37 = f51391(var35);
            final SubLObject var46 = var39 = module0067.f4885(var37, var34, (SubLObject)module0809.NIL);
            SubLObject var47 = (SubLObject)module0809.NIL;
            var47 = var39.first();
            while (module0809.NIL != var39) {
                final SubLObject var41 = f51533(var47);
                if (module0809.NIL != var41) {
                    var36 = module0032.f1736(var41, var36, Symbols.symbol_function((SubLObject)module0809.EQ));
                }
                var39 = var39.rest();
                var47 = var39.first();
            }
            return module0032.f1753(var36);
        }
        return (SubLObject)module0809.NIL;
    }
    
    public static SubLObject f51601(final SubLObject var34) {
        return module0035.f2076(Symbols.symbol_function((SubLObject)module0809.$ic177$), f51600(var34));
    }
    
    public static SubLObject f51602(final SubLObject var58) {
        final SubLObject var59 = f51539(var58);
        if (module0809.NIL != var59) {
            SubLObject var60 = module0032.f1726((SubLObject)module0809.ZERO_INTEGER, Symbols.symbol_function((SubLObject)module0809.EQ));
            SubLObject var61 = f51398(var59);
            SubLObject var63;
            final SubLObject var62 = var63 = module0067.f4885(var61, var58, (SubLObject)module0809.NIL);
            SubLObject var64 = (SubLObject)module0809.NIL;
            var64 = var63.first();
            while (module0809.NIL != var63) {
                final SubLObject var65 = f51539(var64);
                if (module0809.NIL != var65) {
                    var60 = module0032.f1736(var65, var60, Symbols.symbol_function((SubLObject)module0809.EQ));
                }
                var63 = var63.rest();
                var64 = var63.first();
            }
            var61 = f51397(var59);
            final SubLObject var66 = var63 = module0067.f4885(var61, var58, (SubLObject)module0809.NIL);
            SubLObject var67 = (SubLObject)module0809.NIL;
            var67 = var63.first();
            while (module0809.NIL != var63) {
                final SubLObject var65 = f51533(var67);
                if (module0809.NIL != var65) {
                    var60 = module0032.f1736(var65, var60, Symbols.symbol_function((SubLObject)module0809.EQ));
                }
                var63 = var63.rest();
                var67 = var63.first();
            }
            return module0032.f1753(var60);
        }
        return (SubLObject)module0809.NIL;
    }
    
    public static SubLObject f51603(final SubLObject var58) {
        return module0035.f2076(Symbols.symbol_function((SubLObject)module0809.$ic177$), f51602(var58));
    }
    
    public static SubLObject f51604(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        assert module0809.NIL != f51385(var28) : var28;
        SubLObject var30 = module0032.f1726((SubLObject)module0809.ZERO_INTEGER, Symbols.symbol_function((SubLObject)module0809.EQ));
        SubLObject var31 = f51400(var28);
        SubLObject var32;
        for (var32 = module0066.f4838(module0067.f4891(var31)); module0809.NIL == module0066.f4841(var32); var32 = module0066.f4840(var32)) {
            var29.resetMultipleValues();
            final SubLObject var33 = module0066.f4839(var32);
            final SubLObject var34 = var29.secondMultipleValue();
            var29.resetMultipleValues();
            final SubLObject var35 = f51539(var33);
            if (module0809.NIL != var35) {
                var30 = module0032.f1736(var35, var30, Symbols.symbol_function((SubLObject)module0809.EQ));
            }
        }
        module0066.f4842(var32);
        var31 = f51401(var28);
        for (var32 = module0066.f4838(module0067.f4891(var31)); module0809.NIL == module0066.f4841(var32); var32 = module0066.f4840(var32)) {
            var29.resetMultipleValues();
            final SubLObject var36 = module0066.f4839(var32);
            final SubLObject var34 = var29.secondMultipleValue();
            var29.resetMultipleValues();
            final SubLObject var35 = f51539(var36);
            if (module0809.NIL != var35) {
                var30 = module0032.f1736(var35, var30, Symbols.symbol_function((SubLObject)module0809.EQ));
            }
        }
        module0066.f4842(var32);
        var31 = f51402(var28);
        for (var32 = module0066.f4838(module0067.f4891(var31)); module0809.NIL == module0066.f4841(var32); var32 = module0066.f4840(var32)) {
            var29.resetMultipleValues();
            final SubLObject var37 = module0066.f4839(var32);
            final SubLObject var34 = var29.secondMultipleValue();
            var29.resetMultipleValues();
            final SubLObject var35 = f51539(var37);
            if (module0809.NIL != var35) {
                var30 = module0032.f1736(var35, var30, Symbols.symbol_function((SubLObject)module0809.EQ));
            }
        }
        module0066.f4842(var32);
        var31 = f51399(var28);
        for (var32 = module0066.f4838(module0067.f4891(var31)); module0809.NIL == module0066.f4841(var32); var32 = module0066.f4840(var32)) {
            var29.resetMultipleValues();
            final SubLObject var38 = module0066.f4839(var32);
            final SubLObject var34 = var29.secondMultipleValue();
            var29.resetMultipleValues();
            final SubLObject var35 = f51533(var38);
            if (module0809.NIL != var35) {
                var30 = module0032.f1736(var35, var30, Symbols.symbol_function((SubLObject)module0809.EQ));
            }
        }
        module0066.f4842(var32);
        return module0032.f1753(var30);
    }
    
    public static SubLObject f51605(final SubLObject var104) {
        final SubLObject var105 = f51523(var104);
        if (module0809.NIL != var105) {
            return module0035.f2076(Symbols.symbol_function((SubLObject)module0809.$ic177$), f51604(var105));
        }
        return (SubLObject)module0809.NIL;
    }
    
    public static SubLObject f51606(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        SubLObject var30 = module0032.f1726((SubLObject)module0809.ZERO_INTEGER, Symbols.symbol_function((SubLObject)module0809.EQ));
        SubLObject var31;
        for (var31 = module0066.f4838(module0067.f4891(f51440(var28))); module0809.NIL == module0066.f4841(var31); var31 = module0066.f4840(var31)) {
            var29.resetMultipleValues();
            final SubLObject var32 = module0066.f4839(var31);
            final SubLObject var33 = var29.secondMultipleValue();
            var29.resetMultipleValues();
            SubLObject var34 = f51602(var32);
            SubLObject var35 = (SubLObject)module0809.NIL;
            var35 = var34.first();
            while (module0809.NIL != var34) {
                var30 = module0032.f1736(var35, var30, Symbols.symbol_function((SubLObject)module0809.EQ));
                var34 = var34.rest();
                var35 = var34.first();
            }
        }
        module0066.f4842(var31);
        for (var31 = module0066.f4838(module0067.f4891(f51436(var28))); module0809.NIL == module0066.f4841(var31); var31 = module0066.f4840(var31)) {
            var29.resetMultipleValues();
            final SubLObject var36 = module0066.f4839(var31);
            final SubLObject var37 = var29.secondMultipleValue();
            var29.resetMultipleValues();
            SubLObject var34 = f51600(var36);
            SubLObject var35 = (SubLObject)module0809.NIL;
            var35 = var34.first();
            while (module0809.NIL != var34) {
                var30 = module0032.f1736(var35, var30, Symbols.symbol_function((SubLObject)module0809.EQ));
                var34 = var34.rest();
                var35 = var34.first();
            }
        }
        module0066.f4842(var31);
        SubLObject var38 = f51604(var28);
        SubLObject var39 = (SubLObject)module0809.NIL;
        var39 = var38.first();
        while (module0809.NIL != var38) {
            var30 = module0032.f1736(var39, var30, Symbols.symbol_function((SubLObject)module0809.EQ));
            var38 = var38.rest();
            var39 = var38.first();
        }
        return module0032.f1753(var30);
    }
    
    public static SubLObject f51607(final SubLObject var104) {
        final SubLObject var105 = f51523(var104);
        if (module0809.NIL != var105) {
            return module0035.f2076(Symbols.symbol_function((SubLObject)module0809.$ic177$), f51606(var105));
        }
        return (SubLObject)module0809.NIL;
    }
    
    public static SubLObject f51608(final SubLObject var104) {
        final SubLThread var105 = SubLProcess.currentSubLThread();
        final SubLObject var106 = f51523(var104);
        if (module0809.NIL != var106) {
            SubLObject var107 = module0032.f1726((SubLObject)module0809.ZERO_INTEGER, Symbols.symbol_function((SubLObject)module0809.EQ));
            final SubLObject var108 = var106;
            SubLObject var109;
            for (var109 = module0066.f4838(module0067.f4891(f51440(var108))); module0809.NIL == module0066.f4841(var109); var109 = module0066.f4840(var109)) {
                var105.resetMultipleValues();
                final SubLObject var110 = module0066.f4839(var109);
                final SubLObject var111 = var105.secondMultipleValue();
                var105.resetMultipleValues();
                SubLObject var112 = f51561(var110);
                SubLObject var113 = (SubLObject)module0809.NIL;
                var113 = var112.first();
                while (module0809.NIL != var112) {
                    var107 = module0032.f1736(var113, var107, Symbols.symbol_function((SubLObject)module0809.EQ));
                    var112 = var112.rest();
                    var113 = var112.first();
                }
            }
            module0066.f4842(var109);
            final SubLObject var114 = var106;
            for (var109 = module0066.f4838(module0067.f4891(f51436(var114))); module0809.NIL == module0066.f4841(var109); var109 = module0066.f4840(var109)) {
                var105.resetMultipleValues();
                final SubLObject var115 = module0066.f4839(var109);
                final SubLObject var116 = var105.secondMultipleValue();
                var105.resetMultipleValues();
                SubLObject var112 = f51558(var115);
                SubLObject var113 = (SubLObject)module0809.NIL;
                var113 = var112.first();
                while (module0809.NIL != var112) {
                    var107 = module0032.f1736(var113, var107, Symbols.symbol_function((SubLObject)module0809.EQ));
                    var112 = var112.rest();
                    var113 = var112.first();
                }
            }
            module0066.f4842(var109);
            SubLObject var117 = f51572(var104);
            SubLObject var118 = (SubLObject)module0809.NIL;
            var118 = var117.first();
            while (module0809.NIL != var117) {
                var107 = module0032.f1736(var118, var107, Symbols.symbol_function((SubLObject)module0809.EQ));
                var117 = var117.rest();
                var118 = var117.first();
            }
            return module0032.f1753(var107);
        }
        return (SubLObject)module0809.NIL;
    }
    
    public static SubLObject f51609(final SubLObject var104) {
        final SubLThread var105 = SubLProcess.currentSubLThread();
        final SubLObject var106 = f51523(var104);
        if (module0809.NIL != var106) {
            SubLObject var107 = module0032.f1726((SubLObject)module0809.ZERO_INTEGER, Symbols.symbol_function((SubLObject)module0809.EQ));
            final SubLObject var108 = var106;
            SubLObject var109;
            for (var109 = module0066.f4838(module0067.f4891(f51440(var108))); module0809.NIL == module0066.f4841(var109); var109 = module0066.f4840(var109)) {
                var105.resetMultipleValues();
                final SubLObject var110 = module0066.f4839(var109);
                final SubLObject var111 = var105.secondMultipleValue();
                var105.resetMultipleValues();
                SubLObject var112 = f51560(var110);
                SubLObject var113 = (SubLObject)module0809.NIL;
                var113 = var112.first();
                while (module0809.NIL != var112) {
                    var107 = module0032.f1736(var113, var107, Symbols.symbol_function((SubLObject)module0809.EQ));
                    var112 = var112.rest();
                    var113 = var112.first();
                }
            }
            module0066.f4842(var109);
            final SubLObject var114 = var106;
            for (var109 = module0066.f4838(module0067.f4891(f51436(var114))); module0809.NIL == module0066.f4841(var109); var109 = module0066.f4840(var109)) {
                var105.resetMultipleValues();
                final SubLObject var115 = module0066.f4839(var109);
                final SubLObject var116 = var105.secondMultipleValue();
                var105.resetMultipleValues();
                SubLObject var112 = f51554(var115);
                SubLObject var113 = (SubLObject)module0809.NIL;
                var113 = var112.first();
                while (module0809.NIL != var112) {
                    var107 = module0032.f1736(var113, var107, Symbols.symbol_function((SubLObject)module0809.EQ));
                    var112 = var112.rest();
                    var113 = var112.first();
                }
            }
            module0066.f4842(var109);
            SubLObject var117 = f51564(var104);
            SubLObject var118 = (SubLObject)module0809.NIL;
            var118 = var117.first();
            while (module0809.NIL != var117) {
                var107 = module0032.f1736(var118, var107, Symbols.symbol_function((SubLObject)module0809.EQ));
                var117 = var117.rest();
                var118 = var117.first();
            }
            return module0032.f1753(var107);
        }
        return (SubLObject)module0809.NIL;
    }
    
    public static SubLObject f51610(final SubLObject var34) {
        SubLObject var35 = module0032.f1726((SubLObject)module0809.ZERO_INTEGER, Symbols.symbol_function((SubLObject)module0809.EQ));
        SubLObject var36 = f51574(var34);
        SubLObject var37 = (SubLObject)module0809.NIL;
        var37 = var36.first();
        while (module0809.NIL != var36) {
            final SubLObject var38 = f51539(var37);
            var35 = module0032.f1736(var38, var35, Symbols.symbol_function((SubLObject)module0809.EQ));
            var36 = var36.rest();
            var37 = var36.first();
        }
        var36 = f51573(var34);
        SubLObject var39 = (SubLObject)module0809.NIL;
        var39 = var36.first();
        while (module0809.NIL != var36) {
            final SubLObject var38 = f51533(var39);
            var35 = module0032.f1736(var38, var35, Symbols.symbol_function((SubLObject)module0809.EQ));
            var36 = var36.rest();
            var39 = var36.first();
        }
        var36 = f51575(var34);
        SubLObject var40 = (SubLObject)module0809.NIL;
        var40 = var36.first();
        while (module0809.NIL != var36) {
            var35 = module0032.f1736(var40, var35, Symbols.symbol_function((SubLObject)module0809.EQ));
            var36 = var36.rest();
            var40 = var36.first();
        }
        return module0032.f1753(var35);
    }
    
    public static SubLObject f51611(final SubLObject var34) {
        return module0035.f2076(Symbols.symbol_function((SubLObject)module0809.$ic177$), f51610(var34));
    }
    
    public static SubLObject f51612(final SubLObject var58) {
        SubLObject var59 = module0032.f1726((SubLObject)module0809.ZERO_INTEGER, Symbols.symbol_function((SubLObject)module0809.EQ));
        SubLObject var60 = f51580(var58);
        SubLObject var61 = (SubLObject)module0809.NIL;
        var61 = var60.first();
        while (module0809.NIL != var60) {
            final SubLObject var62 = f51539(var61);
            var59 = module0032.f1736(var62, var59, Symbols.symbol_function((SubLObject)module0809.EQ));
            var60 = var60.rest();
            var61 = var60.first();
        }
        var60 = f51595(var58);
        SubLObject var63 = (SubLObject)module0809.NIL;
        var63 = var60.first();
        while (module0809.NIL != var60) {
            final SubLObject var62 = f51533(var63);
            var59 = module0032.f1736(var62, var59, Symbols.symbol_function((SubLObject)module0809.EQ));
            var60 = var60.rest();
            var63 = var60.first();
        }
        var60 = f51596(var58);
        SubLObject var64 = (SubLObject)module0809.NIL;
        var64 = var60.first();
        while (module0809.NIL != var60) {
            var59 = module0032.f1736(var64, var59, Symbols.symbol_function((SubLObject)module0809.EQ));
            var60 = var60.rest();
            var64 = var60.first();
        }
        return module0032.f1753(var59);
    }
    
    public static SubLObject f51613(final SubLObject var58) {
        return module0035.f2076(Symbols.symbol_function((SubLObject)module0809.$ic177$), f51612(var58));
    }
    
    public static SubLObject f51614(final SubLObject var142) {
        final SubLThread var143 = SubLProcess.currentSubLThread();
        SubLObject var144 = module0032.f1726((SubLObject)module0809.ZERO_INTEGER, Symbols.symbol_function((SubLObject)module0809.EQ));
        SubLObject var145;
        for (var145 = module0066.f4838(module0067.f4891(f51436(var142))); module0809.NIL == module0066.f4841(var145); var145 = module0066.f4840(var145)) {
            var143.resetMultipleValues();
            final SubLObject var146 = module0066.f4839(var145);
            final SubLObject var147 = var143.secondMultipleValue();
            var143.resetMultipleValues();
            SubLObject var148 = f51610(var146);
            SubLObject var149 = (SubLObject)module0809.NIL;
            var149 = var148.first();
            while (module0809.NIL != var148) {
                var144 = module0032.f1736(var149, var144, Symbols.symbol_function((SubLObject)module0809.EQ));
                var148 = var148.rest();
                var149 = var148.first();
            }
        }
        module0066.f4842(var145);
        for (var145 = module0066.f4838(module0067.f4891(f51440(var142))); module0809.NIL == module0066.f4841(var145); var145 = module0066.f4840(var145)) {
            var143.resetMultipleValues();
            final SubLObject var150 = module0066.f4839(var145);
            final SubLObject var151 = var143.secondMultipleValue();
            var143.resetMultipleValues();
            SubLObject var148 = f51612(var150);
            SubLObject var149 = (SubLObject)module0809.NIL;
            var149 = var148.first();
            while (module0809.NIL != var148) {
                var144 = module0032.f1736(var149, var144, Symbols.symbol_function((SubLObject)module0809.EQ));
                var148 = var148.rest();
                var149 = var148.first();
            }
        }
        module0066.f4842(var145);
        return module0032.f1753(var144);
    }
    
    public static SubLObject f51615(final SubLObject var145) {
        final SubLObject var146 = f51523(var145);
        if (module0809.NIL != var146) {
            return module0035.f2076(Symbols.symbol_function((SubLObject)module0809.$ic177$), f51614(var146));
        }
        return (SubLObject)module0809.NIL;
    }
    
    public static SubLObject f51616(final SubLObject var146, final SubLObject var145) {
        SubLObject var147 = (SubLObject)module0809.NIL;
        SubLObject var148 = (SubLObject)module0809.NIL;
        SubLObject var150;
        final SubLObject var149 = var150 = f51547(var145);
        SubLObject var151 = (SubLObject)module0809.NIL;
        var151 = var150.first();
        while (module0809.NIL != var150) {
            final SubLObject var152 = f51611(var151);
            if (module0809.NIL != module0035.f2171(var146, var152)) {
                var147 = (SubLObject)ConsesLow.cons(var151, var147);
            }
            var150 = var150.rest();
            var151 = var150.first();
        }
        final SubLObject var153 = var150 = f51550(var145);
        SubLObject var154 = (SubLObject)module0809.NIL;
        var154 = var150.first();
        while (module0809.NIL != var150) {
            final SubLObject var152 = f51613(var154);
            if (module0809.NIL != module0035.f2171(var146, var152)) {
                var148 = (SubLObject)ConsesLow.cons(var154, var148);
            }
            var150 = var150.rest();
            var154 = var150.first();
        }
        return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0809.$ic180$, var147), (SubLObject)ConsesLow.list((SubLObject)module0809.$ic181$, var148));
    }
    
    public static SubLObject f51617(final SubLObject var34) {
        final SubLObject var35 = f51533(var34);
        SubLObject var37;
        final SubLObject var36 = var37 = f51610(var34);
        SubLObject var38 = (SubLObject)module0809.NIL;
        var38 = var37.first();
        while (module0809.NIL != var37) {
            if (!var35.eql(var38)) {
                return (SubLObject)module0809.T;
            }
            var37 = var37.rest();
            var38 = var37.first();
        }
        return (SubLObject)module0809.NIL;
    }
    
    public static SubLObject f51618(final SubLObject var34) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0809.NIL == module0811.f51804(var34) && module0809.NIL == f51617(var34));
    }
    
    public static SubLObject f51619(final SubLObject var104) {
        return module0035.delete_if_not((SubLObject)module0809.$ic182$, f51547(var104), (SubLObject)module0809.UNPROVIDED, (SubLObject)module0809.UNPROVIDED, (SubLObject)module0809.UNPROVIDED, (SubLObject)module0809.UNPROVIDED);
    }
    
    public static SubLObject f51620(final SubLObject var58) {
        final SubLObject var59 = f51539(var58);
        SubLObject var61;
        final SubLObject var60 = var61 = f51612(var58);
        SubLObject var62 = (SubLObject)module0809.NIL;
        var62 = var61.first();
        while (module0809.NIL != var61) {
            if (!var59.eql(var62)) {
                return (SubLObject)module0809.T;
            }
            var61 = var61.rest();
            var62 = var61.first();
        }
        return (SubLObject)module0809.NIL;
    }
    
    public static SubLObject f51621(final SubLObject var58) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0809.NIL == module0811.f51803(var58) && module0809.NIL == f51620(var58));
    }
    
    public static SubLObject f51622(final SubLObject var104) {
        return module0035.delete_if_not((SubLObject)module0809.$ic183$, f51550(var104), (SubLObject)module0809.UNPROVIDED, (SubLObject)module0809.UNPROVIDED, (SubLObject)module0809.UNPROVIDED, (SubLObject)module0809.UNPROVIDED);
    }
    
    public static SubLObject f51623(final SubLObject var34) {
        final SubLObject var35 = f51543(var34);
        if (module0809.NIL != var35) {
            final SubLObject var36 = f51534(var34);
            if (module0809.NIL != var36) {
                final SubLObject var37 = f51624(var36);
                if (module0809.NIL != var37) {
                    return Values.values(var37, var35);
                }
            }
        }
        return Values.values((SubLObject)module0809.NIL, (SubLObject)module0809.NIL);
    }
    
    public static SubLObject f51625(final SubLObject var58) {
        final SubLObject var59 = f51545(var58);
        if (module0809.NIL != var59) {
            final SubLObject var60 = f51540(var58);
            if (module0809.NIL != var60) {
                final SubLObject var61 = f51624(var60);
                if (module0809.NIL != var61) {
                    return Values.values(var61, var59);
                }
            }
        }
        return Values.values((SubLObject)module0809.NIL, (SubLObject)module0809.NIL);
    }
    
    public static SubLObject f51626(final SubLObject var34) {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        var35.resetMultipleValues();
        final SubLObject var36 = f51623(var34);
        final SubLObject var37 = var35.secondMultipleValue();
        var35.resetMultipleValues();
        if (module0809.NIL != var36 && module0809.NIL != var37) {
            return f51627(var36, var37);
        }
        return (SubLObject)module0809.NIL;
    }
    
    public static SubLObject f51628(final SubLObject var58) {
        final SubLThread var59 = SubLProcess.currentSubLThread();
        var59.resetMultipleValues();
        final SubLObject var60 = f51625(var58);
        final SubLObject var61 = var59.secondMultipleValue();
        var59.resetMultipleValues();
        if (module0809.NIL != var60 && module0809.NIL != var61) {
            return f51627(var60, var61);
        }
        return (SubLObject)module0809.NIL;
    }
    
    public static SubLObject f51627(final SubLObject var153, final SubLObject var45) {
        assert module0809.NIL != Types.stringp(var153) : var153;
        assert module0809.NIL != module0004.f106(var45) : var45;
        return (SubLObject)ConsesLow.list((SubLObject)module0809.$ic184$, Sequences.cconcatenate((SubLObject)module0809.$ic185$, new SubLObject[] { module0006.f203(var153), module0809.$ic186$, module0006.f203(var45) }));
    }
    
    public static SubLObject f51629(final SubLObject var104) {
        final SubLObject var105 = module0813.f52032();
        if (module0809.NIL != var105) {
            return module0813.f52085(var105, var104);
        }
        return (SubLObject)module0809.NIL;
    }
    
    public static SubLObject f51624(final SubLObject var104) {
        final SubLThread var105 = SubLProcess.currentSubLThread();
        final SubLObject var106 = module0034.$g879$.getDynamicValue(var105);
        SubLObject var107 = (SubLObject)module0809.NIL;
        if (module0809.NIL == var106) {
            return f51629(var104);
        }
        var107 = module0034.f1857(var106, (SubLObject)module0809.$ic187$, (SubLObject)module0809.UNPROVIDED);
        if (module0809.NIL == var107) {
            var107 = module0034.f1807(module0034.f1842(var106), (SubLObject)module0809.$ic187$, (SubLObject)module0809.ONE_INTEGER, (SubLObject)module0809.NIL, (SubLObject)module0809.EQUAL, (SubLObject)module0809.UNPROVIDED);
            module0034.f1860(var106, (SubLObject)module0809.$ic187$, var107);
        }
        SubLObject var108 = module0034.f1814(var107, var104, (SubLObject)module0809.$ic188$);
        if (var108 == module0809.$ic188$) {
            var108 = Values.arg2(var105.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f51629(var104)));
            module0034.f1816(var107, var104, var108, (SubLObject)module0809.UNPROVIDED);
        }
        return module0034.f1959(var108);
    }
    
    public static SubLObject f51630(final SubLObject var99, final SubLObject var157) {
        assert module0809.NIL != f51432(var99) : var99;
        assert module0809.NIL != f51385(var157) : var157;
        final SubLObject var158 = f51427(var157);
        final SubLObject var159 = f51510(var99, var158);
        if (module0809.NIL != var159) {
            f51631(var99, var159);
        }
        f51632(var99, var157);
        return var99;
    }
    
    public static SubLObject f51632(final SubLObject var99, final SubLObject var157) {
        final SubLObject var158 = f51427(var157);
        final SubLObject var159 = f51475(var99);
        Hashtables.sethash(var158, var159, var157);
        f51633(var99, var157);
        f51634(var99, var157);
        f51635(var99, var157);
        f51636(var99, var157);
        f51637(var99, var157);
        f51638(var99, var157);
        f51639(var99, var157);
        f51640(var99, var157);
        f51641(var99, var157);
        f51642(var99, var157);
        f51643(var99, var157);
        f51644(var99, var157);
        return var99;
    }
    
    public static SubLObject f51645(final SubLObject var157, final SubLObject var159, final SubLObject var160) {
        final SubLObject var161 = Hashtables.gethash_without_values(var159, var160, (SubLObject)module0809.UNPROVIDED);
        SubLObject var162 = (SubLObject)module0809.NIL;
        if (module0809.NIL == var161) {
            var162 = var157;
        }
        else if (module0809.NIL != f51385(var161)) {
            var162 = (SubLObject)ConsesLow.list(var157, var161);
        }
        else {
            var162 = (SubLObject)ConsesLow.cons(var157, var161);
        }
        Hashtables.sethash(var159, var160, var162);
        return (SubLObject)module0809.NIL;
    }
    
    public static SubLObject f51633(final SubLObject var99, final SubLObject var157) {
        final SubLThread var158 = SubLProcess.currentSubLThread();
        final SubLObject var159 = f51476(var99);
        SubLObject var160;
        for (var160 = module0066.f4838(module0067.f4891(f51436(var157))); module0809.NIL == module0066.f4841(var160); var160 = module0066.f4840(var160)) {
            var158.resetMultipleValues();
            final SubLObject var161 = module0066.f4839(var160);
            final SubLObject var162 = var158.secondMultipleValue();
            var158.resetMultipleValues();
            f51645(var157, var161, var159);
        }
        module0066.f4842(var160);
        return var99;
    }
    
    public static SubLObject f51634(final SubLObject var99, final SubLObject var157) {
        final SubLThread var158 = SubLProcess.currentSubLThread();
        final SubLObject var159 = f51477(var99);
        SubLObject var160;
        for (var160 = module0066.f4838(module0067.f4891(f51440(var157))); module0809.NIL == module0066.f4841(var160); var160 = module0066.f4840(var160)) {
            var158.resetMultipleValues();
            final SubLObject var161 = module0066.f4839(var160);
            final SubLObject var162 = var158.secondMultipleValue();
            var158.resetMultipleValues();
            f51645(var157, var161, var159);
        }
        module0066.f4842(var160);
        return var99;
    }
    
    public static SubLObject f51646(final SubLObject var163, final SubLObject var164, final SubLObject var160) {
        SubLObject var165 = Hashtables.gethash_without_values(var164, var160, module0809.$g6426$.getGlobalValue());
        var165 = module0032.f1736(var163, var165, Symbols.symbol_function((SubLObject)module0809.EQ));
        Hashtables.sethash(var164, var160, var165);
        return (SubLObject)module0809.NIL;
    }
    
    public static SubLObject f51635(final SubLObject var99, final SubLObject var157) {
        final SubLThread var158 = SubLProcess.currentSubLThread();
        final SubLObject var159 = f51391(var157);
        final SubLObject var160 = f51478(var99);
        SubLObject var161;
        for (var161 = module0066.f4838(module0067.f4891(var159)); module0809.NIL == module0066.f4841(var161); var161 = module0066.f4840(var161)) {
            var158.resetMultipleValues();
            final SubLObject var162 = module0066.f4839(var161);
            final SubLObject var163 = var158.secondMultipleValue();
            var158.resetMultipleValues();
            SubLObject var164 = var163;
            SubLObject var165 = (SubLObject)module0809.NIL;
            var165 = var164.first();
            while (module0809.NIL != var164) {
                f51646(var162, var165, var160);
                var164 = var164.rest();
                var165 = var164.first();
            }
        }
        module0066.f4842(var161);
        return var99;
    }
    
    public static SubLObject f51636(final SubLObject var99, final SubLObject var157) {
        final SubLThread var158 = SubLProcess.currentSubLThread();
        final SubLObject var159 = f51397(var157);
        final SubLObject var160 = f51479(var99);
        SubLObject var161;
        for (var161 = module0066.f4838(module0067.f4891(var159)); module0809.NIL == module0066.f4841(var161); var161 = module0066.f4840(var161)) {
            var158.resetMultipleValues();
            final SubLObject var162 = module0066.f4839(var161);
            final SubLObject var163 = var158.secondMultipleValue();
            var158.resetMultipleValues();
            SubLObject var164 = var163;
            SubLObject var165 = (SubLObject)module0809.NIL;
            var165 = var164.first();
            while (module0809.NIL != var164) {
                f51646(var162, var165, var160);
                var164 = var164.rest();
                var165 = var164.first();
            }
        }
        module0066.f4842(var161);
        return var99;
    }
    
    public static SubLObject f51637(final SubLObject var99, final SubLObject var157) {
        final SubLThread var158 = SubLProcess.currentSubLThread();
        final SubLObject var159 = f51399(var157);
        final SubLObject var160 = f51480(var99);
        SubLObject var161;
        for (var161 = module0066.f4838(module0067.f4891(var159)); module0809.NIL == module0066.f4841(var161); var161 = module0066.f4840(var161)) {
            var158.resetMultipleValues();
            final SubLObject var162 = module0066.f4839(var161);
            final SubLObject var163 = var158.secondMultipleValue();
            var158.resetMultipleValues();
            f51646(var157, var162, var160);
        }
        module0066.f4842(var161);
        return var99;
    }
    
    public static SubLObject f51638(final SubLObject var99, final SubLObject var157) {
        final SubLThread var158 = SubLProcess.currentSubLThread();
        final SubLObject var159 = f51392(var157);
        final SubLObject var160 = f51481(var99);
        SubLObject var161;
        for (var161 = module0066.f4838(module0067.f4891(var159)); module0809.NIL == module0066.f4841(var161); var161 = module0066.f4840(var161)) {
            var158.resetMultipleValues();
            final SubLObject var162 = module0066.f4839(var161);
            final SubLObject var163 = var158.secondMultipleValue();
            var158.resetMultipleValues();
            SubLObject var164 = var163;
            SubLObject var165 = (SubLObject)module0809.NIL;
            var165 = var164.first();
            while (module0809.NIL != var164) {
                f51646(var162, var165, var160);
                var164 = var164.rest();
                var165 = var164.first();
            }
        }
        module0066.f4842(var161);
        return var99;
    }
    
    public static SubLObject f51639(final SubLObject var99, final SubLObject var157) {
        final SubLThread var158 = SubLProcess.currentSubLThread();
        final SubLObject var159 = f51398(var157);
        final SubLObject var160 = f51484(var99);
        SubLObject var161;
        for (var161 = module0066.f4838(module0067.f4891(var159)); module0809.NIL == module0066.f4841(var161); var161 = module0066.f4840(var161)) {
            var158.resetMultipleValues();
            final SubLObject var162 = module0066.f4839(var161);
            final SubLObject var163 = var158.secondMultipleValue();
            var158.resetMultipleValues();
            SubLObject var164 = var163;
            SubLObject var165 = (SubLObject)module0809.NIL;
            var165 = var164.first();
            while (module0809.NIL != var164) {
                f51646(var162, var165, var160);
                var164 = var164.rest();
                var165 = var164.first();
            }
        }
        module0066.f4842(var161);
        return var99;
    }
    
    public static SubLObject f51640(final SubLObject var99, final SubLObject var157) {
        final SubLThread var158 = SubLProcess.currentSubLThread();
        final SubLObject var159 = f51400(var157);
        final SubLObject var160 = f51485(var99);
        SubLObject var161;
        for (var161 = module0066.f4838(module0067.f4891(var159)); module0809.NIL == module0066.f4841(var161); var161 = module0066.f4840(var161)) {
            var158.resetMultipleValues();
            final SubLObject var162 = module0066.f4839(var161);
            final SubLObject var163 = var158.secondMultipleValue();
            var158.resetMultipleValues();
            f51646(var157, var162, var160);
        }
        module0066.f4842(var161);
        return var99;
    }
    
    public static SubLObject f51641(final SubLObject var99, final SubLObject var157) {
        final SubLThread var158 = SubLProcess.currentSubLThread();
        final SubLObject var159 = f51393(var157);
        final SubLObject var160 = f51482(var99);
        SubLObject var161;
        for (var161 = module0066.f4838(module0067.f4891(var159)); module0809.NIL == module0066.f4841(var161); var161 = module0066.f4840(var161)) {
            var158.resetMultipleValues();
            final SubLObject var162 = module0066.f4839(var161);
            final SubLObject var163 = var158.secondMultipleValue();
            var158.resetMultipleValues();
            SubLObject var164 = var163;
            SubLObject var165 = (SubLObject)module0809.NIL;
            var165 = var164.first();
            while (module0809.NIL != var164) {
                f51646(var162, var165, var160);
                var164 = var164.rest();
                var165 = var164.first();
            }
        }
        module0066.f4842(var161);
        return var99;
    }
    
    public static SubLObject f51642(final SubLObject var99, final SubLObject var157) {
        final SubLThread var158 = SubLProcess.currentSubLThread();
        final SubLObject var159 = f51401(var157);
        final SubLObject var160 = f51486(var99);
        SubLObject var161;
        for (var161 = module0066.f4838(module0067.f4891(var159)); module0809.NIL == module0066.f4841(var161); var161 = module0066.f4840(var161)) {
            var158.resetMultipleValues();
            final SubLObject var162 = module0066.f4839(var161);
            final SubLObject var163 = var158.secondMultipleValue();
            var158.resetMultipleValues();
            f51646(var157, var162, var160);
        }
        module0066.f4842(var161);
        return var99;
    }
    
    public static SubLObject f51643(final SubLObject var99, final SubLObject var157) {
        final SubLThread var158 = SubLProcess.currentSubLThread();
        final SubLObject var159 = f51394(var157);
        final SubLObject var160 = f51483(var99);
        SubLObject var161;
        for (var161 = module0066.f4838(module0067.f4891(var159)); module0809.NIL == module0066.f4841(var161); var161 = module0066.f4840(var161)) {
            var158.resetMultipleValues();
            final SubLObject var162 = module0066.f4839(var161);
            final SubLObject var163 = var158.secondMultipleValue();
            var158.resetMultipleValues();
            SubLObject var164 = var163;
            SubLObject var165 = (SubLObject)module0809.NIL;
            var165 = var164.first();
            while (module0809.NIL != var164) {
                f51646(var162, var165, var160);
                var164 = var164.rest();
                var165 = var164.first();
            }
        }
        module0066.f4842(var161);
        return var99;
    }
    
    public static SubLObject f51644(final SubLObject var99, final SubLObject var157) {
        final SubLThread var158 = SubLProcess.currentSubLThread();
        final SubLObject var159 = f51402(var157);
        final SubLObject var160 = f51487(var99);
        SubLObject var161;
        for (var161 = module0066.f4838(module0067.f4891(var159)); module0809.NIL == module0066.f4841(var161); var161 = module0066.f4840(var161)) {
            var158.resetMultipleValues();
            final SubLObject var162 = module0066.f4839(var161);
            final SubLObject var163 = var158.secondMultipleValue();
            var158.resetMultipleValues();
            f51646(var157, var162, var160);
        }
        module0066.f4842(var161);
        return var99;
    }
    
    public static SubLObject f51631(final SubLObject var99, final SubLObject var158) {
        final SubLObject var159 = f51427(var158);
        final SubLObject var160 = f51475(var99);
        Hashtables.remhash(var159, var160);
        f51647(var99, var158);
        f51648(var99, var158);
        f51649(var99, var158);
        f51650(var99, var158);
        f51651(var99, var158);
        f51652(var99, var158);
        f51653(var99, var158);
        f51654(var99, var158);
        f51655(var99, var158);
        f51656(var99, var158);
        f51657(var99, var158);
        f51658(var99, var158);
        return var99;
    }
    
    public static SubLObject f51659(final SubLObject var158, final SubLObject var168, final SubLObject var160) {
        final SubLObject var169 = Hashtables.gethash_without_values(var168, var160, (SubLObject)module0809.UNPROVIDED);
        SubLObject var170 = (SubLObject)module0809.NIL;
        if (module0809.NIL != var169) {
            if (module0809.NIL != f51385(var169)) {
                var170 = (SubLObject)module0809.NIL;
            }
            else {
                var170 = Sequences.delete(var158, var169, Symbols.symbol_function((SubLObject)module0809.EQ), (SubLObject)module0809.UNPROVIDED, (SubLObject)module0809.UNPROVIDED, (SubLObject)module0809.UNPROVIDED, (SubLObject)module0809.UNPROVIDED);
                if (module0809.NIL != module0035.f1997(var170)) {
                    var170 = var170.first();
                }
            }
        }
        if (module0809.NIL == var170) {
            Hashtables.remhash(var168, var160);
        }
        else {
            Hashtables.sethash(var168, var160, var170);
        }
        return (SubLObject)module0809.NIL;
    }
    
    public static SubLObject f51647(final SubLObject var99, final SubLObject var158) {
        final SubLThread var159 = SubLProcess.currentSubLThread();
        final SubLObject var160 = f51476(var99);
        SubLObject var161;
        for (var161 = module0066.f4838(module0067.f4891(f51436(var158))); module0809.NIL == module0066.f4841(var161); var161 = module0066.f4840(var161)) {
            var159.resetMultipleValues();
            final SubLObject var162 = module0066.f4839(var161);
            final SubLObject var163 = var159.secondMultipleValue();
            var159.resetMultipleValues();
            f51659(var158, var162, var160);
        }
        module0066.f4842(var161);
        return var99;
    }
    
    public static SubLObject f51648(final SubLObject var99, final SubLObject var158) {
        final SubLThread var159 = SubLProcess.currentSubLThread();
        final SubLObject var160 = f51477(var99);
        SubLObject var161;
        for (var161 = module0066.f4838(module0067.f4891(f51440(var158))); module0809.NIL == module0066.f4841(var161); var161 = module0066.f4840(var161)) {
            var159.resetMultipleValues();
            final SubLObject var162 = module0066.f4839(var161);
            final SubLObject var163 = var159.secondMultipleValue();
            var159.resetMultipleValues();
            f51659(var158, var162, var160);
        }
        module0066.f4842(var161);
        return var99;
    }
    
    public static SubLObject f51660(final SubLObject var163, final SubLObject var164, final SubLObject var160) {
        SubLObject var165 = Hashtables.gethash_without_values(var164, var160, module0809.$g6426$.getGlobalValue());
        var165 = module0032.f1737(var163, var165, Symbols.symbol_function((SubLObject)module0809.EQ));
        if (module0809.NIL != module0032.f1729(var165)) {
            Hashtables.remhash(var164, var160);
        }
        else {
            Hashtables.sethash(var164, var160, var165);
        }
        return (SubLObject)module0809.NIL;
    }
    
    public static SubLObject f51649(final SubLObject var99, final SubLObject var158) {
        final SubLThread var159 = SubLProcess.currentSubLThread();
        final SubLObject var160 = f51391(var158);
        final SubLObject var161 = f51478(var99);
        SubLObject var162;
        for (var162 = module0066.f4838(module0067.f4891(var160)); module0809.NIL == module0066.f4841(var162); var162 = module0066.f4840(var162)) {
            var159.resetMultipleValues();
            final SubLObject var163 = module0066.f4839(var162);
            final SubLObject var164 = var159.secondMultipleValue();
            var159.resetMultipleValues();
            SubLObject var165 = var164;
            SubLObject var166 = (SubLObject)module0809.NIL;
            var166 = var165.first();
            while (module0809.NIL != var165) {
                f51660(var163, var166, var161);
                var165 = var165.rest();
                var166 = var165.first();
            }
        }
        module0066.f4842(var162);
        return var99;
    }
    
    public static SubLObject f51650(final SubLObject var99, final SubLObject var158) {
        final SubLThread var159 = SubLProcess.currentSubLThread();
        final SubLObject var160 = f51397(var158);
        final SubLObject var161 = f51479(var99);
        SubLObject var162;
        for (var162 = module0066.f4838(module0067.f4891(var160)); module0809.NIL == module0066.f4841(var162); var162 = module0066.f4840(var162)) {
            var159.resetMultipleValues();
            final SubLObject var163 = module0066.f4839(var162);
            final SubLObject var164 = var159.secondMultipleValue();
            var159.resetMultipleValues();
            SubLObject var165 = var164;
            SubLObject var166 = (SubLObject)module0809.NIL;
            var166 = var165.first();
            while (module0809.NIL != var165) {
                f51660(var163, var166, var161);
                var165 = var165.rest();
                var166 = var165.first();
            }
        }
        module0066.f4842(var162);
        return var99;
    }
    
    public static SubLObject f51651(final SubLObject var99, final SubLObject var158) {
        final SubLThread var159 = SubLProcess.currentSubLThread();
        final SubLObject var160 = f51399(var158);
        final SubLObject var161 = f51480(var99);
        SubLObject var162;
        for (var162 = module0066.f4838(module0067.f4891(var160)); module0809.NIL == module0066.f4841(var162); var162 = module0066.f4840(var162)) {
            var159.resetMultipleValues();
            final SubLObject var163 = module0066.f4839(var162);
            final SubLObject var164 = var159.secondMultipleValue();
            var159.resetMultipleValues();
            f51660(var158, var163, var161);
        }
        module0066.f4842(var162);
        return var99;
    }
    
    public static SubLObject f51652(final SubLObject var99, final SubLObject var158) {
        final SubLThread var159 = SubLProcess.currentSubLThread();
        final SubLObject var160 = f51392(var158);
        final SubLObject var161 = f51481(var99);
        SubLObject var162;
        for (var162 = module0066.f4838(module0067.f4891(var160)); module0809.NIL == module0066.f4841(var162); var162 = module0066.f4840(var162)) {
            var159.resetMultipleValues();
            final SubLObject var163 = module0066.f4839(var162);
            final SubLObject var164 = var159.secondMultipleValue();
            var159.resetMultipleValues();
            SubLObject var165 = var164;
            SubLObject var166 = (SubLObject)module0809.NIL;
            var166 = var165.first();
            while (module0809.NIL != var165) {
                f51660(var163, var166, var161);
                var165 = var165.rest();
                var166 = var165.first();
            }
        }
        module0066.f4842(var162);
        return var99;
    }
    
    public static SubLObject f51653(final SubLObject var99, final SubLObject var158) {
        final SubLThread var159 = SubLProcess.currentSubLThread();
        final SubLObject var160 = f51398(var158);
        final SubLObject var161 = f51484(var99);
        SubLObject var162;
        for (var162 = module0066.f4838(module0067.f4891(var160)); module0809.NIL == module0066.f4841(var162); var162 = module0066.f4840(var162)) {
            var159.resetMultipleValues();
            final SubLObject var163 = module0066.f4839(var162);
            final SubLObject var164 = var159.secondMultipleValue();
            var159.resetMultipleValues();
            SubLObject var165 = var164;
            SubLObject var166 = (SubLObject)module0809.NIL;
            var166 = var165.first();
            while (module0809.NIL != var165) {
                f51660(var163, var166, var161);
                var165 = var165.rest();
                var166 = var165.first();
            }
        }
        module0066.f4842(var162);
        return var99;
    }
    
    public static SubLObject f51654(final SubLObject var99, final SubLObject var158) {
        final SubLThread var159 = SubLProcess.currentSubLThread();
        final SubLObject var160 = f51400(var158);
        final SubLObject var161 = f51485(var99);
        SubLObject var162;
        for (var162 = module0066.f4838(module0067.f4891(var160)); module0809.NIL == module0066.f4841(var162); var162 = module0066.f4840(var162)) {
            var159.resetMultipleValues();
            final SubLObject var163 = module0066.f4839(var162);
            final SubLObject var164 = var159.secondMultipleValue();
            var159.resetMultipleValues();
            f51660(var158, var163, var161);
        }
        module0066.f4842(var162);
        return var99;
    }
    
    public static SubLObject f51655(final SubLObject var99, final SubLObject var158) {
        final SubLThread var159 = SubLProcess.currentSubLThread();
        final SubLObject var160 = f51393(var158);
        final SubLObject var161 = f51482(var99);
        SubLObject var162;
        for (var162 = module0066.f4838(module0067.f4891(var160)); module0809.NIL == module0066.f4841(var162); var162 = module0066.f4840(var162)) {
            var159.resetMultipleValues();
            final SubLObject var163 = module0066.f4839(var162);
            final SubLObject var164 = var159.secondMultipleValue();
            var159.resetMultipleValues();
            SubLObject var165 = var164;
            SubLObject var166 = (SubLObject)module0809.NIL;
            var166 = var165.first();
            while (module0809.NIL != var165) {
                f51660(var163, var166, var161);
                var165 = var165.rest();
                var166 = var165.first();
            }
        }
        module0066.f4842(var162);
        return var99;
    }
    
    public static SubLObject f51656(final SubLObject var99, final SubLObject var158) {
        final SubLThread var159 = SubLProcess.currentSubLThread();
        final SubLObject var160 = f51401(var158);
        final SubLObject var161 = f51486(var99);
        SubLObject var162;
        for (var162 = module0066.f4838(module0067.f4891(var160)); module0809.NIL == module0066.f4841(var162); var162 = module0066.f4840(var162)) {
            var159.resetMultipleValues();
            final SubLObject var163 = module0066.f4839(var162);
            final SubLObject var164 = var159.secondMultipleValue();
            var159.resetMultipleValues();
            f51660(var158, var163, var161);
        }
        module0066.f4842(var162);
        return var99;
    }
    
    public static SubLObject f51657(final SubLObject var99, final SubLObject var158) {
        final SubLThread var159 = SubLProcess.currentSubLThread();
        final SubLObject var160 = f51394(var158);
        final SubLObject var161 = f51483(var99);
        SubLObject var162;
        for (var162 = module0066.f4838(module0067.f4891(var160)); module0809.NIL == module0066.f4841(var162); var162 = module0066.f4840(var162)) {
            var159.resetMultipleValues();
            final SubLObject var163 = module0066.f4839(var162);
            final SubLObject var164 = var159.secondMultipleValue();
            var159.resetMultipleValues();
            SubLObject var165 = var164;
            SubLObject var166 = (SubLObject)module0809.NIL;
            var166 = var165.first();
            while (module0809.NIL != var165) {
                f51660(var163, var166, var161);
                var165 = var165.rest();
                var166 = var165.first();
            }
        }
        module0066.f4842(var162);
        return var99;
    }
    
    public static SubLObject f51658(final SubLObject var99, final SubLObject var158) {
        final SubLThread var159 = SubLProcess.currentSubLThread();
        final SubLObject var160 = f51402(var158);
        final SubLObject var161 = f51487(var99);
        SubLObject var162;
        for (var162 = module0066.f4838(module0067.f4891(var160)); module0809.NIL == module0066.f4841(var162); var162 = module0066.f4840(var162)) {
            var159.resetMultipleValues();
            final SubLObject var163 = module0066.f4839(var162);
            final SubLObject var164 = var159.secondMultipleValue();
            var159.resetMultipleValues();
            f51660(var158, var163, var161);
        }
        module0066.f4842(var162);
        return var99;
    }
    
    public static SubLObject f51661(final SubLObject var58, final SubLObject var157) {
        final SubLObject var158 = f51539(var58);
        if (module0809.NIL != var158 && !f51427(var158).equal(f51427(var157))) {
            final SubLObject var159 = f51441(var158);
            f51662(var159, var158, var58);
            f51460(var158, var58);
            return (SubLObject)module0809.T;
        }
        return (SubLObject)module0809.NIL;
    }
    
    public static SubLObject f51662(final SubLObject var99, final SubLObject var158, final SubLObject var58) {
        SubLObject var159 = f51479(var99);
        SubLObject var160 = f51397(var158);
        SubLObject var162;
        final SubLObject var161 = var162 = module0067.f4885(var160, var58, (SubLObject)module0809.UNPROVIDED);
        SubLObject var163 = (SubLObject)module0809.NIL;
        var163 = var162.first();
        while (module0809.NIL != var162) {
            f51660(var58, var163, var159);
            var162 = var162.rest();
            var163 = var162.first();
        }
        var159 = f51484(var99);
        var160 = f51398(var158);
        final SubLObject var164 = var162 = module0067.f4885(var160, var58, (SubLObject)module0809.UNPROVIDED);
        SubLObject var165 = (SubLObject)module0809.NIL;
        var165 = var162.first();
        while (module0809.NIL != var162) {
            f51660(var58, var165, var159);
            var162 = var162.rest();
            var165 = var162.first();
        }
        var159 = f51477(var99);
        f51659(var158, var58, var159);
        return var99;
    }
    
    public static SubLObject f51663(final SubLObject var34, final SubLObject var157) {
        final SubLObject var158 = f51533(var34);
        if (module0809.NIL != var158 && !f51427(var158).equal(f51427(var157))) {
            final SubLObject var159 = f51441(var158);
            f51664(var159, var158, var34);
            f51456(var158, var34);
            return (SubLObject)module0809.T;
        }
        return (SubLObject)module0809.NIL;
    }
    
    public static SubLObject f51664(final SubLObject var99, final SubLObject var158, final SubLObject var34) {
        SubLObject var159 = f51478(var99);
        SubLObject var160 = f51391(var158);
        SubLObject var162;
        final SubLObject var161 = var162 = module0067.f4885(var160, var34, (SubLObject)module0809.UNPROVIDED);
        SubLObject var163 = (SubLObject)module0809.NIL;
        var163 = var162.first();
        while (module0809.NIL != var162) {
            f51660(var34, var163, var159);
            var162 = var162.rest();
            var163 = var162.first();
        }
        var159 = f51481(var99);
        var160 = f51392(var158);
        final SubLObject var164 = var162 = module0067.f4885(var160, var34, (SubLObject)module0809.UNPROVIDED);
        SubLObject var165 = (SubLObject)module0809.NIL;
        var165 = var162.first();
        while (module0809.NIL != var162) {
            f51660(var34, var165, var159);
            var162 = var162.rest();
            var165 = var162.first();
        }
        var159 = f51482(var99);
        var160 = f51393(var158);
        final SubLObject var166 = var162 = module0067.f4885(var160, var34, (SubLObject)module0809.UNPROVIDED);
        SubLObject var167 = (SubLObject)module0809.NIL;
        var167 = var162.first();
        while (module0809.NIL != var162) {
            f51660(var34, var167, var159);
            var162 = var162.rest();
            var167 = var162.first();
        }
        var159 = f51483(var99);
        var160 = f51394(var158);
        final SubLObject var168 = var162 = module0067.f4885(var160, var34, (SubLObject)module0809.UNPROVIDED);
        SubLObject var169 = (SubLObject)module0809.NIL;
        var169 = var162.first();
        while (module0809.NIL != var162) {
            f51660(var34, var169, var159);
            var162 = var162.rest();
            var169 = var162.first();
        }
        var159 = f51476(var99);
        f51659(var158, var34, var159);
        return var99;
    }
    
    public static SubLObject f51665(final SubLObject var29, final SubLObject var30) {
        SubLObject var32;
        final SubLObject var31 = var32 = var29.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)module0809.$ic189$);
        final SubLObject var33 = var32.rest();
        var32 = var32.first();
        SubLObject var34 = (SubLObject)module0809.NIL;
        SubLObject var35 = var32;
        SubLObject var36 = (SubLObject)module0809.NIL;
        SubLObject var175_176 = (SubLObject)module0809.NIL;
        while (module0809.NIL != var35) {
            cdestructuring_bind.destructuring_bind_must_consp(var35, var31, (SubLObject)module0809.$ic189$);
            var175_176 = var35.first();
            var35 = var35.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var35, var31, (SubLObject)module0809.$ic189$);
            if (module0809.NIL == conses_high.member(var175_176, (SubLObject)module0809.$ic190$, (SubLObject)module0809.UNPROVIDED, (SubLObject)module0809.UNPROVIDED)) {
                var36 = (SubLObject)module0809.T;
            }
            if (var175_176 == module0809.$ic83$) {
                var34 = var35.first();
            }
            var35 = var35.rest();
        }
        if (module0809.NIL != var36 && module0809.NIL == var34) {
            cdestructuring_bind.cdestructuring_bind_error(var31, (SubLObject)module0809.$ic189$);
        }
        final SubLObject var37 = cdestructuring_bind.property_list_member((SubLObject)module0809.$ic47$, var32);
        final SubLObject var38 = (SubLObject)((module0809.NIL != var37) ? conses_high.cadr(var37) : module0809.NIL);
        final SubLObject var39 = cdestructuring_bind.property_list_member((SubLObject)module0809.$ic49$, var32);
        final SubLObject var40 = (SubLObject)((module0809.NIL != var39) ? conses_high.cadr(var39) : module0809.NIL);
        final SubLObject var41;
        var32 = (var41 = var33);
        final SubLObject var42 = (SubLObject)module0809.$ic191$;
        final SubLObject var43 = (SubLObject)module0809.$ic192$;
        return (SubLObject)ConsesLow.list((SubLObject)module0809.$ic88$, (SubLObject)ConsesLow.list(reader.bq_cons(var42, (SubLObject)module0809.$ic193$), (SubLObject)ConsesLow.list(var43, (SubLObject)ConsesLow.list((SubLObject)module0809.$ic194$, var42, (SubLObject)ConsesLow.list((SubLObject)module0809.$ic195$, var42, var38, var40)))), (SubLObject)ConsesLow.listS((SubLObject)module0809.$ic88$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0809.$ic196$, var43)), ConsesLow.append(var41, (SubLObject)module0809.NIL)), (SubLObject)ConsesLow.list((SubLObject)module0809.$ic197$, var43, (SubLObject)ConsesLow.list((SubLObject)module0809.$ic198$, var42, var43)));
    }
    
    public static SubLObject f51666(final SubLObject var29, final SubLObject var30) {
        SubLObject var32;
        final SubLObject var31 = var32 = var29.rest();
        SubLObject var33 = (SubLObject)module0809.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)module0809.$ic199$);
        var33 = var32.first();
        final SubLObject var34;
        var32 = (var34 = var32.rest());
        return (SubLObject)ConsesLow.list((SubLObject)module0809.$ic88$, (SubLObject)ConsesLow.list(reader.bq_cons(var33, (SubLObject)module0809.$ic200$)), (SubLObject)ConsesLow.listS((SubLObject)module0809.$ic197$, var33, ConsesLow.append(var34, (SubLObject)module0809.NIL)));
    }
    
    public static SubLObject f51667() {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        return module0809.$g6429$.getDynamicValue(var15);
    }
    
    public static SubLObject f51668(final SubLObject var29, final SubLObject var30) {
        SubLObject var32;
        final SubLObject var31 = var32 = var29.rest();
        SubLObject var33 = (SubLObject)module0809.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)module0809.$ic203$);
        var33 = var32.first();
        final SubLObject var34;
        var32 = (var34 = var32.rest());
        final SubLObject var35 = (SubLObject)module0809.$ic204$;
        return (SubLObject)ConsesLow.list((SubLObject)module0809.$ic88$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var35, var33)), (SubLObject)ConsesLow.listS((SubLObject)module0809.$ic205$, var35, (SubLObject)module0809.$ic206$), (SubLObject)ConsesLow.listS((SubLObject)module0809.$ic88$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0809.$ic207$, var35)), ConsesLow.append(var34, (SubLObject)module0809.NIL)));
    }
    
    public static SubLObject f51669() {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        return module0809.$g6430$.getDynamicValue(var15);
    }
    
    public static SubLObject f51670(final SubLObject var29, final SubLObject var30) {
        SubLObject var32;
        final SubLObject var31 = var32 = var29.rest();
        SubLObject var33 = (SubLObject)module0809.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)module0809.$ic208$);
        var33 = var32.first();
        final SubLObject var34;
        var32 = (var34 = var32.rest());
        final SubLObject var35 = (SubLObject)module0809.$ic209$;
        return (SubLObject)ConsesLow.list((SubLObject)module0809.$ic88$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var35, var33)), (SubLObject)ConsesLow.listS((SubLObject)module0809.$ic205$, var35, (SubLObject)module0809.$ic210$), (SubLObject)ConsesLow.listS((SubLObject)module0809.$ic88$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0809.$ic211$, var35)), ConsesLow.append(var34, (SubLObject)module0809.NIL)));
    }
    
    public static SubLObject f51671() {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        return module0809.$g6431$.getDynamicValue(var15);
    }
    
    public static SubLObject f51672(final SubLObject var29, final SubLObject var30) {
        SubLObject var32;
        final SubLObject var31 = var32 = var29.rest();
        SubLObject var33 = (SubLObject)module0809.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)module0809.$ic212$);
        var33 = var32.first();
        final SubLObject var34;
        var32 = (var34 = var32.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0809.$ic213$, var33, ConsesLow.append(var34, (SubLObject)module0809.NIL));
    }
    
    public static SubLObject f51673(final SubLObject var29, final SubLObject var30) {
        SubLObject var32;
        final SubLObject var31 = var32 = var29.rest();
        SubLObject var33 = (SubLObject)module0809.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)module0809.$ic212$);
        var33 = var32.first();
        final SubLObject var34;
        var32 = (var34 = var32.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0809.$ic213$, var33, ConsesLow.append(var34, (SubLObject)module0809.NIL));
    }
    
    public static SubLObject f51674(final SubLObject var29, final SubLObject var30) {
        SubLObject var32;
        final SubLObject var31 = var32 = var29.rest();
        SubLObject var33 = (SubLObject)module0809.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)module0809.$ic214$);
        var33 = var32.first();
        final SubLObject var34;
        var32 = (var34 = var32.rest());
        final SubLObject var35 = (SubLObject)module0809.$ic215$;
        return (SubLObject)ConsesLow.list((SubLObject)module0809.$ic88$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var35, var33)), (SubLObject)ConsesLow.listS((SubLObject)module0809.$ic205$, var35, (SubLObject)module0809.$ic216$), (SubLObject)ConsesLow.listS((SubLObject)module0809.$ic88$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0809.$ic217$, var35)), ConsesLow.append(var34, (SubLObject)module0809.NIL)));
    }
    
    public static SubLObject f51675() {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        return module0809.$g6432$.getDynamicValue(var15);
    }
    
    public static SubLObject f51676(final SubLObject var29, final SubLObject var30) {
        SubLObject var32;
        final SubLObject var31 = var32 = var29.rest();
        SubLObject var33 = (SubLObject)module0809.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)module0809.$ic218$);
        var33 = var32.first();
        final SubLObject var34;
        var32 = (var34 = var32.rest());
        final SubLObject var35 = (SubLObject)module0809.$ic219$;
        return (SubLObject)ConsesLow.list((SubLObject)module0809.$ic88$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var35, var33)), (SubLObject)ConsesLow.listS((SubLObject)module0809.$ic205$, var35, (SubLObject)module0809.$ic216$), (SubLObject)ConsesLow.listS((SubLObject)module0809.$ic88$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0809.$ic220$, var35)), ConsesLow.append(var34, (SubLObject)module0809.NIL)));
    }
    
    public static SubLObject f51677() {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        return module0809.$g6433$.getDynamicValue(var15);
    }
    
    public static SubLObject f51678() {
        final SubLObject var200 = f51671();
        if (module0809.NIL != f51675()) {
            return Values.values((SubLObject)module0809.$ic221$, f51675(), var200);
        }
        if (module0809.NIL != f51677()) {
            return Values.values((SubLObject)module0809.$ic222$, f51677(), var200);
        }
        if (module0809.NIL != f51669()) {
            return Values.values((SubLObject)module0809.$ic223$, f51669(), var200);
        }
        return Values.values((SubLObject)module0809.NIL, (SubLObject)module0809.NIL, (SubLObject)module0809.NIL);
    }
    
    public static SubLObject f51679(final SubLObject var58) {
        f51680((SubLObject)module0809.$ic224$, var58, (SubLObject)module0809.UNPROVIDED);
        final SubLObject var59 = f51667();
        if (module0809.NIL != var59) {
            final SubLObject var60 = f51671();
            f51661(var58, var59);
            f51459(var59, var58, var60);
        }
        return var58;
    }
    
    public static SubLObject f51681(final SubLObject var201) {
        f51680((SubLObject)module0809.$ic225$, var201, (SubLObject)module0809.UNPROVIDED);
        final SubLObject var202 = f51667();
        if (module0809.NIL != var202) {
            final SubLObject var203 = f51671();
            f51663(var201, var202);
            f51455(var202, var201, var203);
        }
        return var201;
    }
    
    public static SubLObject f51682(final SubLObject var202) {
        f51680((SubLObject)module0809.$ic226$, var202, (SubLObject)module0809.UNPROVIDED);
        final SubLObject var203 = f51667();
        if (module0809.NIL != var203) {
            final SubLObject var204 = f51671();
            f51663(var202, var203);
            f51455(var203, var202, var204);
        }
        return var202;
    }
    
    public static SubLObject f51683(final SubLObject var34, final SubLObject var111) {
        f51680((SubLObject)module0809.$ic227$, var111, (SubLObject)module0809.UNPROVIDED);
        final SubLObject var112 = f51667();
        if (module0809.NIL != var112) {
            f51457(var112, var34, var111);
        }
        return var34;
    }
    
    public static SubLObject f51684(final SubLObject var58, final SubLObject var83) {
        f51680((SubLObject)module0809.$ic228$, var83, (SubLObject)module0809.UNPROVIDED);
        final SubLObject var84 = f51667();
        if (module0809.NIL != var84) {
            f51458(var84, var58, var83);
        }
        return var58;
    }
    
    public static SubLObject f51685(final SubLObject var58) {
        final SubLThread var59 = SubLProcess.currentSubLThread();
        f51680((SubLObject)module0809.$ic229$, var58, (SubLObject)module0809.UNPROVIDED);
        final SubLObject var60 = f51667();
        if (module0809.NIL != var60) {
            var59.resetMultipleValues();
            final SubLObject var61 = f51678();
            final SubLObject var62 = var59.secondMultipleValue();
            final SubLObject var63 = var59.thirdMultipleValue();
            var59.resetMultipleValues();
            final SubLObject var64 = var61;
            if (var64.eql((SubLObject)module0809.$ic221$)) {
                f51462(var60, var62, var58);
            }
            else if (var64.eql((SubLObject)module0809.$ic222$)) {
                f51466(var60, var62, var58);
            }
            else if (var64.eql((SubLObject)module0809.$ic223$)) {
                f51468(var60, var58, var63);
            }
        }
        return var58;
    }
    
    public static SubLObject f51686(final SubLObject var58) {
        final SubLThread var59 = SubLProcess.currentSubLThread();
        f51680((SubLObject)module0809.$ic230$, var58, (SubLObject)module0809.UNPROVIDED);
        final SubLObject var60 = f51667();
        if (module0809.NIL != var60) {
            var59.resetMultipleValues();
            final SubLObject var61 = f51678();
            final SubLObject var62 = var59.secondMultipleValue();
            final SubLObject var63 = var59.thirdMultipleValue();
            var59.resetMultipleValues();
            final SubLObject var64 = var61;
            if (var64.eql((SubLObject)module0809.$ic221$)) {
                f51463(var60, var62, var58);
            }
            else if (var64.eql((SubLObject)module0809.$ic222$)) {
                Errors.error((SubLObject)module0809.$ic231$, var62, var58);
            }
            else if (var64.eql((SubLObject)module0809.$ic223$)) {
                f51469(var60, var58, var63);
            }
        }
        return var58;
    }
    
    public static SubLObject f51687(final SubLObject var58) {
        final SubLThread var59 = SubLProcess.currentSubLThread();
        f51680((SubLObject)module0809.$ic232$, var58, (SubLObject)module0809.UNPROVIDED);
        final SubLObject var60 = f51667();
        if (module0809.NIL != var60) {
            var59.resetMultipleValues();
            final SubLObject var61 = f51678();
            final SubLObject var62 = var59.secondMultipleValue();
            final SubLObject var63 = var59.thirdMultipleValue();
            var59.resetMultipleValues();
            final SubLObject var64 = var61;
            if (var64.eql((SubLObject)module0809.$ic221$)) {
                f51464(var60, var62, var58);
            }
            else if (var64.eql((SubLObject)module0809.$ic222$)) {
                Errors.error((SubLObject)module0809.$ic233$, var62, var58);
            }
            else if (var64.eql((SubLObject)module0809.$ic223$)) {
                f51470(var60, var58, var63);
            }
        }
        return var58;
    }
    
    public static SubLObject f51688(final SubLObject var201) {
        final SubLThread var202 = SubLProcess.currentSubLThread();
        f51680((SubLObject)module0809.$ic234$, var201, (SubLObject)module0809.UNPROVIDED);
        final SubLObject var203 = f51667();
        if (module0809.NIL != var203) {
            var202.resetMultipleValues();
            final SubLObject var204 = f51678();
            final SubLObject var205 = var202.secondMultipleValue();
            final SubLObject var206 = var202.thirdMultipleValue();
            var202.resetMultipleValues();
            final SubLObject var207 = var204;
            if (var207.eql((SubLObject)module0809.$ic221$)) {
                f51461(var203, var205, var201);
            }
            else if (var207.eql((SubLObject)module0809.$ic222$)) {
                f51465(var203, var205, var201);
            }
            else if (var207.eql((SubLObject)module0809.$ic223$)) {
                f51467(var203, var201, var206);
            }
        }
        return var201;
    }
    
    public static SubLObject f51689(final SubLObject var202) {
        final SubLThread var203 = SubLProcess.currentSubLThread();
        f51680((SubLObject)module0809.$ic235$, var202, (SubLObject)module0809.UNPROVIDED);
        final SubLObject var204 = f51667();
        if (module0809.NIL != var204) {
            var203.resetMultipleValues();
            final SubLObject var205 = f51678();
            final SubLObject var206 = var203.secondMultipleValue();
            final SubLObject var207 = var203.thirdMultipleValue();
            var203.resetMultipleValues();
            final SubLObject var208 = var205;
            if (var208.eql((SubLObject)module0809.$ic221$)) {
                f51461(var204, var206, var202);
            }
            else if (var208.eql((SubLObject)module0809.$ic222$)) {
                f51465(var204, var206, var202);
            }
            else if (var208.eql((SubLObject)module0809.$ic223$)) {
                f51467(var204, var202, var207);
            }
        }
        return var202;
    }
    
    public static SubLObject f51690(final SubLObject var100) {
        f51680((SubLObject)module0809.$ic236$, var100, (SubLObject)module0809.UNPROVIDED);
        final SubLObject var101 = f51518();
        if (module0809.NIL != var101) {
            final SubLObject var102 = f51510(var101, var100);
            if (module0809.NIL != var102) {
                f51631(var101, var102);
            }
        }
        return var100;
    }
    
    public static SubLObject f51680(final SubLObject var205, SubLObject var3, SubLObject var206) {
        if (var3 == module0809.UNPROVIDED) {
            var3 = (SubLObject)module0809.NIL;
        }
        if (var206 == module0809.UNPROVIDED) {
            var206 = (SubLObject)module0809.NIL;
        }
        final SubLThread var207 = SubLProcess.currentSubLThread();
        if (module0809.NIL != module0809.$g6434$.getDynamicValue(var207)) {
            PrintLow.format(StreamsLow.$standard_output$.getDynamicValue(var207), var205, var3, var206);
            streams_high.force_output(StreamsLow.$standard_output$.getDynamicValue(var207));
            return (SubLObject)module0809.T;
        }
        return (SubLObject)module0809.NIL;
    }
    
    public static SubLObject f51691(SubLObject var118) {
        var118 = Sort.sort(var118, Symbols.symbol_function((SubLObject)module0809.$ic237$), Symbols.symbol_function((SubLObject)module0809.$ic238$));
        if (module0809.NIL != f51518()) {
            var118 = Sort.stable_sort(var118, Symbols.symbol_function((SubLObject)module0809.$ic239$), Symbols.symbol_function((SubLObject)module0809.$ic240$));
        }
        return var118;
    }
    
    public static SubLObject f51692(SubLObject var115) {
        var115 = Sort.sort(var115, Symbols.symbol_function((SubLObject)module0809.$ic237$), Symbols.symbol_function((SubLObject)module0809.$ic238$));
        if (module0809.NIL != f51518()) {
            var115 = Sort.stable_sort(var115, Symbols.symbol_function((SubLObject)module0809.$ic239$), Symbols.symbol_function((SubLObject)module0809.$ic241$));
        }
        return var115;
    }
    
    public static SubLObject f51693(final SubLObject var207) {
        return Sort.sort(var207, Symbols.symbol_function((SubLObject)module0809.$ic237$), Symbols.symbol_function((SubLObject)module0809.$ic177$));
    }
    
    public static SubLObject f51694(final SubLObject var208) {
        return Sort.sort(var208, Symbols.symbol_function((SubLObject)module0809.$ic237$), (SubLObject)module0809.UNPROVIDED);
    }
    
    public static SubLObject f51695(final SubLObject var118) {
        return Sort.sort(var118, Symbols.symbol_function((SubLObject)module0809.$ic237$), Symbols.symbol_function((SubLObject)module0809.$ic238$));
    }
    
    public static SubLObject f51696(final SubLObject var115) {
        return Sort.sort(var115, Symbols.symbol_function((SubLObject)module0809.$ic237$), Symbols.symbol_function((SubLObject)module0809.$ic238$));
    }
    
    public static SubLObject f51697(final SubLObject var207) {
        return f51693(var207);
    }
    
    public static SubLObject f51698(final SubLObject var208) {
        return f51694(var208);
    }
    
    public static SubLObject f51699() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51383", "S#56058", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51385", "S#56039", 1, 0, false);
        new $f51385$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51386", "S#56059", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51387", "S#56060", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51388", "S#56061", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51389", "S#56062", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51390", "S#56063", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51391", "S#56064", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51392", "S#56065", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51393", "S#56066", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51394", "S#56067", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51395", "S#56068", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51396", "S#56069", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51397", "S#56070", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51398", "S#56071", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51399", "S#56072", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51400", "S#56073", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51401", "S#56074", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51402", "S#56075", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51403", "S#56076", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51404", "S#56077", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51405", "S#56078", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51406", "S#56079", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51407", "S#56080", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51408", "S#56081", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51409", "S#56082", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51410", "S#56083", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51411", "S#56084", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51412", "S#56085", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51413", "S#56086", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51414", "S#56087", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51415", "S#56088", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51416", "S#56089", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51417", "S#56090", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51418", "S#56091", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51419", "S#56092", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51420", "S#56093", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51421", "S#56094", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51422", "S#56095", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51423", "S#56096", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51424", "S#56097", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51425", "S#56098", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51426", "S#56099", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51384", "S#56100", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51430", "S#56101", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51431", "S#56102", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0809", "f51433", "S#56103");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51434", "S#56104", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0809", "f51435", "S#56105");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51436", "S#56106", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0809", "f51437", "S#56107");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51438", "S#56108", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0809", "f51439", "S#56109");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51440", "S#56110", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51427", "S#56111", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51441", "S#56112", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51442", "S#56113", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51443", "S#56114", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51444", "S#56115", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51428", "S#56116", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51445", "S#56117", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51446", "S#56118", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51447", "S#56119", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51429", "S#56120", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51448", "S#56121", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51449", "S#56122", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51450", "S#56123", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51451", "S#56124", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51452", "S#56125", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51453", "S#56126", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51454", "S#56127", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51455", "S#56128", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51456", "S#56129", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51457", "S#56130", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51458", "S#56131", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51459", "S#56132", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51460", "S#56133", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51461", "S#56134", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51462", "S#56135", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51463", "S#56136", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51464", "S#56137", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51465", "S#56138", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51466", "S#56139", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51467", "S#56140", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51468", "S#56141", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51469", "S#56142", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51470", "S#56143", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51471", "S#56144", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51432", "S#56042", 1, 0, false);
        new $f51432$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51473", "S#56145", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51474", "S#56146", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51475", "S#56147", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51476", "S#56148", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51477", "S#56149", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51478", "S#56150", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51479", "S#56151", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51480", "S#56152", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51481", "S#56153", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51482", "S#56154", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51483", "S#56155", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51484", "S#56156", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51485", "S#56157", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51486", "S#56158", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51487", "S#56159", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51488", "S#56160", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51489", "S#56161", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51490", "S#56162", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51491", "S#56163", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51492", "S#56164", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51493", "S#56165", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51494", "S#56166", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51495", "S#56167", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51496", "S#56168", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51497", "S#56169", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51498", "S#56170", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51499", "S#56171", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51500", "S#56172", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51501", "S#56173", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51502", "S#56174", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51503", "S#56175", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51504", "S#56176", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51505", "S#56177", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51472", "S#56178", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51508", "S#56179", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51506", "S#56180", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51509", "S#56181", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51507", "S#56182", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51510", "S#56183", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51511", "S#56184", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51512", "S#56185", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51513", "S#56186", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51514", "S#56187", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51515", "S#56188", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51516", "S#56189", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51517", "S#56190", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51518", "S#56191", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51519", "S#56192", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51520", "S#56193", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51521", "S#56194", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51522", "S#56195", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51523", "S#56196", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51524", "S#56197", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51525", "S#56198", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51526", "S#56199", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51527", "S#56200", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51528", "S#56201", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51529", "S#56202", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51530", "S#56203", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51531", "S#56204", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51532", "S#56205", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51533", "S#56206", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51534", "S#56207", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51535", "S#56208", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51536", "S#56209", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51537", "S#56210", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51538", "S#56211", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51539", "S#56212", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51540", "S#56213", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51541", "S#56214", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51542", "S#56215", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51543", "S#56216", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51544", "S#56217", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51545", "S#56218", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51546", "S#56219", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51547", "S#56220", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51548", "S#56221", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51549", "S#56222", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51550", "S#56223", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51551", "S#56224", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51552", "S#56225", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51553", "S#56226", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51554", "S#56227", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51555", "S#56228", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51556", "S#56229", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51557", "S#56230", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51558", "S#56231", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51559", "S#56232", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51560", "S#56233", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51561", "S#56234", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51562", "S#56235", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51563", "S#56236", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51564", "S#56237", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51565", "S#56238", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51566", "S#56239", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51567", "S#56240", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51568", "S#56241", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51569", "S#56242", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51570", "S#56243", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51571", "S#56244", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51572", "S#56245", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51573", "S#56246", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51574", "S#56247", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51575", "S#56248", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51576", "S#56249", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51577", "S#56250", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51578", "S#56251", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51579", "S#56252", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51580", "S#56253", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51581", "S#56254", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51582", "S#56255", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51583", "S#56256", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51584", "S#56257", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51585", "S#56258", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51586", "S#56259", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51587", "S#56260", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51588", "S#56261", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51589", "S#56262", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51590", "S#56263", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51591", "S#56264", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51592", "S#56265", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51593", "S#56266", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51594", "S#56267", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51595", "S#56268", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51596", "S#56269", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51597", "S#56270", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51598", "S#56271", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51599", "S#56272", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51600", "S#56273", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51601", "S#56274", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51602", "S#56275", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51603", "S#56276", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51604", "S#56277", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51605", "S#56278", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51606", "S#56279", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51607", "S#56280", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51608", "S#56281", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51609", "S#56282", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51610", "S#56283", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51611", "S#56284", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51612", "S#56285", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51613", "S#56286", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51614", "S#56287", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51615", "S#56288", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51616", "S#56289", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51617", "S#56290", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51618", "S#56291", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51619", "S#56292", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51620", "S#56293", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51621", "S#56294", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51622", "S#56295", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51623", "S#56296", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51625", "S#56297", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51626", "S#56298", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51628", "S#56299", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51627", "S#56300", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51629", "S#56301", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51624", "S#56302", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51630", "S#56303", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51632", "S#56304", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51645", "S#56305", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51633", "S#56306", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51634", "S#56307", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51646", "S#56308", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51635", "S#56309", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51636", "S#56310", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51637", "S#56311", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51638", "S#56312", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51639", "S#56313", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51640", "S#56314", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51641", "S#56315", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51642", "S#56316", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51643", "S#56317", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51644", "S#56318", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51631", "S#56319", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51659", "S#56320", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51647", "S#56321", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51648", "S#56322", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51660", "S#56323", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51649", "S#56324", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51650", "S#56325", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51651", "S#56326", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51652", "S#56327", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51653", "S#56328", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51654", "S#56329", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51655", "S#56330", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51656", "S#56331", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51657", "S#56332", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51658", "S#56333", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51661", "S#56334", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51662", "S#56335", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51663", "S#56336", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51664", "S#56337", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0809", "f51665", "S#56338");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0809", "f51666", "S#56339");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51667", "S#56340", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0809", "f51668", "S#56341");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51669", "S#56342", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0809", "f51670", "S#56343");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51671", "S#56344", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0809", "f51672", "S#56345");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0809", "f51673", "S#56346");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0809", "f51674", "S#56347");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51675", "S#56348", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0809", "f51676", "S#56349");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51677", "S#56350", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51678", "S#56351", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51679", "S#56352", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51681", "S#56353", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51682", "S#56354", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51683", "S#56355", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51684", "S#56356", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51685", "S#56357", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51686", "S#56358", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51687", "S#56359", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51688", "S#56360", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51689", "S#56361", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51690", "S#56362", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51680", "S#56363", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51691", "S#56364", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51692", "S#56365", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51693", "S#56366", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51694", "S#56367", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51695", "S#56368", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51696", "S#56369", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51697", "S#56370", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0809", "f51698", "S#56371", 1, 0, false);
        return (SubLObject)module0809.NIL;
    }
    
    public static SubLObject f51700() {
        module0809.$g6426$ = SubLFiles.deflexical("S#56372", module0032.f1726((SubLObject)module0809.ZERO_INTEGER, (SubLObject)module0809.UNPROVIDED));
        module0809.$g6427$ = SubLFiles.defconstant("S#56373", (SubLObject)module0809.$ic0$);
        module0809.$g6428$ = SubLFiles.defconstant("S#56374", (SubLObject)module0809.$ic116$);
        module0809.$g6429$ = SubLFiles.defparameter("S#56375", (SubLObject)module0809.NIL);
        module0809.$g6430$ = SubLFiles.defparameter("S#56376", (SubLObject)module0809.NIL);
        module0809.$g6431$ = SubLFiles.defparameter("S#56377", (SubLObject)module0809.NIL);
        module0809.$g6432$ = SubLFiles.defparameter("S#56378", (SubLObject)module0809.NIL);
        module0809.$g6433$ = SubLFiles.defparameter("S#56379", (SubLObject)module0809.NIL);
        module0809.$g6434$ = SubLFiles.defvar("S#56380", (SubLObject)module0809.NIL);
        return (SubLObject)module0809.NIL;
    }
    
    public static SubLObject f51701() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0809.$g6427$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0809.$ic7$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0809.$ic8$);
        Structures.def_csetf((SubLObject)module0809.$ic9$, (SubLObject)module0809.$ic10$);
        Structures.def_csetf((SubLObject)module0809.$ic11$, (SubLObject)module0809.$ic12$);
        Structures.def_csetf((SubLObject)module0809.$ic13$, (SubLObject)module0809.$ic14$);
        Structures.def_csetf((SubLObject)module0809.$ic15$, (SubLObject)module0809.$ic16$);
        Structures.def_csetf((SubLObject)module0809.$ic17$, (SubLObject)module0809.$ic18$);
        Structures.def_csetf((SubLObject)module0809.$ic19$, (SubLObject)module0809.$ic20$);
        Structures.def_csetf((SubLObject)module0809.$ic21$, (SubLObject)module0809.$ic22$);
        Structures.def_csetf((SubLObject)module0809.$ic23$, (SubLObject)module0809.$ic24$);
        Structures.def_csetf((SubLObject)module0809.$ic25$, (SubLObject)module0809.$ic26$);
        Structures.def_csetf((SubLObject)module0809.$ic27$, (SubLObject)module0809.$ic28$);
        Structures.def_csetf((SubLObject)module0809.$ic29$, (SubLObject)module0809.$ic30$);
        Structures.def_csetf((SubLObject)module0809.$ic31$, (SubLObject)module0809.$ic32$);
        Structures.def_csetf((SubLObject)module0809.$ic33$, (SubLObject)module0809.$ic34$);
        Structures.def_csetf((SubLObject)module0809.$ic35$, (SubLObject)module0809.$ic36$);
        Structures.def_csetf((SubLObject)module0809.$ic37$, (SubLObject)module0809.$ic38$);
        Structures.def_csetf((SubLObject)module0809.$ic39$, (SubLObject)module0809.$ic40$);
        Structures.def_csetf((SubLObject)module0809.$ic41$, (SubLObject)module0809.$ic42$);
        Structures.def_csetf((SubLObject)module0809.$ic43$, (SubLObject)module0809.$ic44$);
        Structures.def_csetf((SubLObject)module0809.$ic45$, (SubLObject)module0809.$ic46$);
        Equality.identity((SubLObject)module0809.$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0809.$g6427$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0809.$ic71$));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), module0809.$g6427$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0809.$ic76$));
        module0002.f50((SubLObject)module0809.$ic90$, (SubLObject)module0809.$ic93$);
        module0002.f50((SubLObject)module0809.$ic97$, (SubLObject)module0809.$ic98$);
        module0002.f50((SubLObject)module0809.$ic103$, (SubLObject)module0809.$ic104$);
        module0002.f50((SubLObject)module0809.$ic107$, (SubLObject)module0809.$ic108$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0809.$g6428$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0809.$ic122$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0809.$ic123$);
        Structures.def_csetf((SubLObject)module0809.$ic124$, (SubLObject)module0809.$ic125$);
        Structures.def_csetf((SubLObject)module0809.$ic126$, (SubLObject)module0809.$ic127$);
        Structures.def_csetf((SubLObject)module0809.$ic128$, (SubLObject)module0809.$ic129$);
        Structures.def_csetf((SubLObject)module0809.$ic130$, (SubLObject)module0809.$ic131$);
        Structures.def_csetf((SubLObject)module0809.$ic132$, (SubLObject)module0809.$ic133$);
        Structures.def_csetf((SubLObject)module0809.$ic134$, (SubLObject)module0809.$ic135$);
        Structures.def_csetf((SubLObject)module0809.$ic136$, (SubLObject)module0809.$ic137$);
        Structures.def_csetf((SubLObject)module0809.$ic138$, (SubLObject)module0809.$ic139$);
        Structures.def_csetf((SubLObject)module0809.$ic140$, (SubLObject)module0809.$ic141$);
        Structures.def_csetf((SubLObject)module0809.$ic142$, (SubLObject)module0809.$ic143$);
        Structures.def_csetf((SubLObject)module0809.$ic144$, (SubLObject)module0809.$ic145$);
        Structures.def_csetf((SubLObject)module0809.$ic146$, (SubLObject)module0809.$ic147$);
        Structures.def_csetf((SubLObject)module0809.$ic148$, (SubLObject)module0809.$ic149$);
        Structures.def_csetf((SubLObject)module0809.$ic150$, (SubLObject)module0809.$ic151$);
        Structures.def_csetf((SubLObject)module0809.$ic152$, (SubLObject)module0809.$ic153$);
        Equality.identity((SubLObject)module0809.$ic116$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0809.$g6428$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0809.$ic168$));
        module0034.f1895((SubLObject)module0809.$ic187$);
        module0002.f50((SubLObject)module0809.$ic201$, (SubLObject)module0809.$ic202$);
        return (SubLObject)module0809.NIL;
    }
    
    public void declareFunctions() {
        f51699();
    }
    
    public void initializeVariables() {
        f51700();
    }
    
    public void runTopLevelForms() {
        f51701();
    }
    
    static {
        me = (SubLFile)new module0809();
        module0809.$g6426$ = null;
        module0809.$g6427$ = null;
        module0809.$g6428$ = null;
        module0809.$g6429$ = null;
        module0809.$g6430$ = null;
        module0809.$g6431$ = null;
        module0809.$g6432$ = null;
        module0809.$g6433$ = null;
        module0809.$g6434$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#56038", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("S#56039", "CYC");
        $ic2$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#29", "CYC"), SubLObjectFactory.makeSymbol("S#56041", "CYC"), SubLObjectFactory.makeSymbol("S#56381", "CYC"), SubLObjectFactory.makeSymbol("S#56382", "CYC"), SubLObjectFactory.makeSymbol("S#56383", "CYC"), SubLObjectFactory.makeSymbol("S#56384", "CYC"), SubLObjectFactory.makeSymbol("S#56385", "CYC"), SubLObjectFactory.makeSymbol("S#56386", "CYC"), SubLObjectFactory.makeSymbol("S#56387", "CYC"), SubLObjectFactory.makeSymbol("S#56388", "CYC"), SubLObjectFactory.makeSymbol("S#56389", "CYC"), SubLObjectFactory.makeSymbol("S#56390", "CYC"), SubLObjectFactory.makeSymbol("S#56391", "CYC"), SubLObjectFactory.makeSymbol("S#56392", "CYC"), SubLObjectFactory.makeSymbol("S#56393", "CYC"), SubLObjectFactory.makeSymbol("S#56394", "CYC"), SubLObjectFactory.makeSymbol("S#56395", "CYC"), SubLObjectFactory.makeSymbol("S#56396", "CYC"), SubLObjectFactory.makeSymbol("S#56397", "CYC") });
        $ic3$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeKeyword("XREF-SYSTEM"), SubLObjectFactory.makeKeyword("FEATURES"), SubLObjectFactory.makeKeyword("METHOD-DEFINITIONS"), SubLObjectFactory.makeKeyword("METHOD-POSITION-TABLE"), SubLObjectFactory.makeKeyword("METHOD-METHOD-TABLE"), SubLObjectFactory.makeKeyword("METHOD-GLOBAL-REFERENCE-TABLE"), SubLObjectFactory.makeKeyword("METHOD-GLOBAL-MODIFICATION-TABLE"), SubLObjectFactory.makeKeyword("METHOD-GLOBAL-BINDING-TABLE"), SubLObjectFactory.makeKeyword("GLOBAL-DEFINITIONS"), SubLObjectFactory.makeKeyword("GLOBAL-POSITION-TABLE"), SubLObjectFactory.makeKeyword("GLOBAL-METHOD-TABLE"), SubLObjectFactory.makeKeyword("GLOBAL-GLOBAL-REFERENCE-TABLE"), SubLObjectFactory.makeKeyword("TOP-METHOD-TABLE"), SubLObjectFactory.makeKeyword("TOP-GLOBAL-REFERENCE-TABLE"), SubLObjectFactory.makeKeyword("TOP-GLOBAL-MODIFICATION-TABLE"), SubLObjectFactory.makeKeyword("TOP-GLOBAL-BINDING-TABLE"), SubLObjectFactory.makeKeyword("METHOD-FORMAL-ARGLIST-TABLE"), SubLObjectFactory.makeKeyword("GLOBAL-BINDING-TYPE-TABLE") });
        $ic4$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#56059", "CYC"), SubLObjectFactory.makeSymbol("S#56060", "CYC"), SubLObjectFactory.makeSymbol("S#56061", "CYC"), SubLObjectFactory.makeSymbol("S#56062", "CYC"), SubLObjectFactory.makeSymbol("S#56063", "CYC"), SubLObjectFactory.makeSymbol("S#56064", "CYC"), SubLObjectFactory.makeSymbol("S#56065", "CYC"), SubLObjectFactory.makeSymbol("S#56066", "CYC"), SubLObjectFactory.makeSymbol("S#56067", "CYC"), SubLObjectFactory.makeSymbol("S#56068", "CYC"), SubLObjectFactory.makeSymbol("S#56069", "CYC"), SubLObjectFactory.makeSymbol("S#56070", "CYC"), SubLObjectFactory.makeSymbol("S#56071", "CYC"), SubLObjectFactory.makeSymbol("S#56072", "CYC"), SubLObjectFactory.makeSymbol("S#56073", "CYC"), SubLObjectFactory.makeSymbol("S#56074", "CYC"), SubLObjectFactory.makeSymbol("S#56075", "CYC"), SubLObjectFactory.makeSymbol("S#56076", "CYC"), SubLObjectFactory.makeSymbol("S#56077", "CYC") });
        $ic5$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#56078", "CYC"), SubLObjectFactory.makeSymbol("S#56079", "CYC"), SubLObjectFactory.makeSymbol("S#56080", "CYC"), SubLObjectFactory.makeSymbol("S#56081", "CYC"), SubLObjectFactory.makeSymbol("S#56082", "CYC"), SubLObjectFactory.makeSymbol("S#56083", "CYC"), SubLObjectFactory.makeSymbol("S#56084", "CYC"), SubLObjectFactory.makeSymbol("S#56085", "CYC"), SubLObjectFactory.makeSymbol("S#56086", "CYC"), SubLObjectFactory.makeSymbol("S#56087", "CYC"), SubLObjectFactory.makeSymbol("S#56088", "CYC"), SubLObjectFactory.makeSymbol("S#56089", "CYC"), SubLObjectFactory.makeSymbol("S#56090", "CYC"), SubLObjectFactory.makeSymbol("S#56091", "CYC"), SubLObjectFactory.makeSymbol("S#56092", "CYC"), SubLObjectFactory.makeSymbol("S#56093", "CYC"), SubLObjectFactory.makeSymbol("S#56094", "CYC"), SubLObjectFactory.makeSymbol("S#56095", "CYC"), SubLObjectFactory.makeSymbol("S#56096", "CYC") });
        $ic6$ = SubLObjectFactory.makeSymbol("S#56100", "CYC");
        $ic7$ = SubLObjectFactory.makeSymbol("S#56058", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#56039", "CYC"));
        $ic9$ = SubLObjectFactory.makeSymbol("S#56059", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("S#56078", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#56060", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#56079", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("S#56061", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("S#56080", "CYC");
        $ic15$ = SubLObjectFactory.makeSymbol("S#56062", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("S#56081", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("S#56063", "CYC");
        $ic18$ = SubLObjectFactory.makeSymbol("S#56082", "CYC");
        $ic19$ = SubLObjectFactory.makeSymbol("S#56064", "CYC");
        $ic20$ = SubLObjectFactory.makeSymbol("S#56083", "CYC");
        $ic21$ = SubLObjectFactory.makeSymbol("S#56065", "CYC");
        $ic22$ = SubLObjectFactory.makeSymbol("S#56084", "CYC");
        $ic23$ = SubLObjectFactory.makeSymbol("S#56066", "CYC");
        $ic24$ = SubLObjectFactory.makeSymbol("S#56085", "CYC");
        $ic25$ = SubLObjectFactory.makeSymbol("S#56067", "CYC");
        $ic26$ = SubLObjectFactory.makeSymbol("S#56086", "CYC");
        $ic27$ = SubLObjectFactory.makeSymbol("S#56068", "CYC");
        $ic28$ = SubLObjectFactory.makeSymbol("S#56087", "CYC");
        $ic29$ = SubLObjectFactory.makeSymbol("S#56069", "CYC");
        $ic30$ = SubLObjectFactory.makeSymbol("S#56088", "CYC");
        $ic31$ = SubLObjectFactory.makeSymbol("S#56070", "CYC");
        $ic32$ = SubLObjectFactory.makeSymbol("S#56089", "CYC");
        $ic33$ = SubLObjectFactory.makeSymbol("S#56071", "CYC");
        $ic34$ = SubLObjectFactory.makeSymbol("S#56090", "CYC");
        $ic35$ = SubLObjectFactory.makeSymbol("S#56072", "CYC");
        $ic36$ = SubLObjectFactory.makeSymbol("S#56091", "CYC");
        $ic37$ = SubLObjectFactory.makeSymbol("S#56073", "CYC");
        $ic38$ = SubLObjectFactory.makeSymbol("S#56092", "CYC");
        $ic39$ = SubLObjectFactory.makeSymbol("S#56074", "CYC");
        $ic40$ = SubLObjectFactory.makeSymbol("S#56093", "CYC");
        $ic41$ = SubLObjectFactory.makeSymbol("S#56075", "CYC");
        $ic42$ = SubLObjectFactory.makeSymbol("S#56094", "CYC");
        $ic43$ = SubLObjectFactory.makeSymbol("S#56076", "CYC");
        $ic44$ = SubLObjectFactory.makeSymbol("S#56095", "CYC");
        $ic45$ = SubLObjectFactory.makeSymbol("S#56077", "CYC");
        $ic46$ = SubLObjectFactory.makeSymbol("S#56096", "CYC");
        $ic47$ = SubLObjectFactory.makeKeyword("NAME");
        $ic48$ = SubLObjectFactory.makeKeyword("XREF-SYSTEM");
        $ic49$ = SubLObjectFactory.makeKeyword("FEATURES");
        $ic50$ = SubLObjectFactory.makeKeyword("METHOD-DEFINITIONS");
        $ic51$ = SubLObjectFactory.makeKeyword("METHOD-POSITION-TABLE");
        $ic52$ = SubLObjectFactory.makeKeyword("METHOD-METHOD-TABLE");
        $ic53$ = SubLObjectFactory.makeKeyword("METHOD-GLOBAL-REFERENCE-TABLE");
        $ic54$ = SubLObjectFactory.makeKeyword("METHOD-GLOBAL-MODIFICATION-TABLE");
        $ic55$ = SubLObjectFactory.makeKeyword("METHOD-GLOBAL-BINDING-TABLE");
        $ic56$ = SubLObjectFactory.makeKeyword("GLOBAL-DEFINITIONS");
        $ic57$ = SubLObjectFactory.makeKeyword("GLOBAL-POSITION-TABLE");
        $ic58$ = SubLObjectFactory.makeKeyword("GLOBAL-METHOD-TABLE");
        $ic59$ = SubLObjectFactory.makeKeyword("GLOBAL-GLOBAL-REFERENCE-TABLE");
        $ic60$ = SubLObjectFactory.makeKeyword("TOP-METHOD-TABLE");
        $ic61$ = SubLObjectFactory.makeKeyword("TOP-GLOBAL-REFERENCE-TABLE");
        $ic62$ = SubLObjectFactory.makeKeyword("TOP-GLOBAL-MODIFICATION-TABLE");
        $ic63$ = SubLObjectFactory.makeKeyword("TOP-GLOBAL-BINDING-TABLE");
        $ic64$ = SubLObjectFactory.makeKeyword("METHOD-FORMAL-ARGLIST-TABLE");
        $ic65$ = SubLObjectFactory.makeKeyword("GLOBAL-BINDING-TYPE-TABLE");
        $ic66$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic67$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic68$ = SubLObjectFactory.makeSymbol("S#56097", "CYC");
        $ic69$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic70$ = SubLObjectFactory.makeKeyword("END");
        $ic71$ = SubLObjectFactory.makeSymbol("S#56099", "CYC");
        $ic72$ = SubLObjectFactory.makeString("#<");
        $ic73$ = SubLObjectFactory.makeKeyword("STREAM");
        $ic74$ = SubLObjectFactory.makeString("~A : ~S methods, ~S globals");
        $ic75$ = SubLObjectFactory.makeKeyword("BASE");
        $ic76$ = SubLObjectFactory.makeSymbol("S#56101", "CYC");
        $ic77$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic78$ = SubLObjectFactory.makeSymbol("S#56042", "CYC");
        $ic79$ = SubLObjectFactory.makeSymbol("S#747", "CYC");
        $ic80$ = SubLObjectFactory.makeSymbol("SYMBOLP");
        $ic81$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("S#56398", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic82$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $ic83$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic84$ = SubLObjectFactory.makeKeyword("DONE");
        $ic85$ = SubLObjectFactory.makeUninternedSymbol("US#11AAB9C");
        $ic86$ = SubLObjectFactory.makeUninternedSymbol("US#7857DEB");
        $ic87$ = SubLObjectFactory.makeUninternedSymbol("US#6CCEA91");
        $ic88$ = SubLObjectFactory.makeSymbol("CLET");
        $ic89$ = SubLObjectFactory.makeSymbol("DO-LIST");
        $ic90$ = SubLObjectFactory.makeSymbol("S#56104", "CYC");
        $ic91$ = SubLObjectFactory.makeSymbol("CDESTRUCTURING-BIND");
        $ic92$ = SubLObjectFactory.makeSymbol("IGNORE");
        $ic93$ = SubLObjectFactory.makeSymbol("S#56103", "CYC");
        $ic94$ = SubLObjectFactory.makeUninternedSymbol("US#11AAB9C");
        $ic95$ = SubLObjectFactory.makeUninternedSymbol("US#6CCEA91");
        $ic96$ = SubLObjectFactory.makeSymbol("DO-DICTIONARY");
        $ic97$ = SubLObjectFactory.makeSymbol("S#56106", "CYC");
        $ic98$ = SubLObjectFactory.makeSymbol("S#56105", "CYC");
        $ic99$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#673", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#56398", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic100$ = SubLObjectFactory.makeUninternedSymbol("US#11AAB9C");
        $ic101$ = SubLObjectFactory.makeUninternedSymbol("US#7857DEB");
        $ic102$ = SubLObjectFactory.makeUninternedSymbol("US#6CCEA91");
        $ic103$ = SubLObjectFactory.makeSymbol("S#56108", "CYC");
        $ic104$ = SubLObjectFactory.makeSymbol("S#56107", "CYC");
        $ic105$ = SubLObjectFactory.makeUninternedSymbol("US#11AAB9C");
        $ic106$ = SubLObjectFactory.makeUninternedSymbol("US#6CCEA91");
        $ic107$ = SubLObjectFactory.makeSymbol("S#56110", "CYC");
        $ic108$ = SubLObjectFactory.makeSymbol("S#56109", "CYC");
        $ic109$ = SubLObjectFactory.makeSymbol("CAR");
        $ic110$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#56399", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("POSITION"));
        $ic111$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#56400", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("POSITION"));
        $ic112$ = SubLObjectFactory.makeKeyword("UNSPECIFIED");
        $ic113$ = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $ic114$ = SubLObjectFactory.makeSymbol("LISTP");
        $ic115$ = SubLObjectFactory.makeSymbol("S#56040", "CYC");
        $ic116$ = SubLObjectFactory.makeSymbol("S#56041", "CYC");
        $ic117$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#29", "CYC"), SubLObjectFactory.makeSymbol("S#56381", "CYC"), SubLObjectFactory.makeSymbol("S#56401", "CYC"), SubLObjectFactory.makeSymbol("S#56402", "CYC"), SubLObjectFactory.makeSymbol("S#56403", "CYC"), SubLObjectFactory.makeSymbol("S#56404", "CYC"), SubLObjectFactory.makeSymbol("S#56405", "CYC"), SubLObjectFactory.makeSymbol("S#56406", "CYC"), SubLObjectFactory.makeSymbol("S#56407", "CYC"), SubLObjectFactory.makeSymbol("S#56408", "CYC"), SubLObjectFactory.makeSymbol("S#56409", "CYC"), SubLObjectFactory.makeSymbol("S#56410", "CYC"), SubLObjectFactory.makeSymbol("S#56411", "CYC"), SubLObjectFactory.makeSymbol("S#56412", "CYC"), SubLObjectFactory.makeSymbol("S#56413", "CYC") });
        $ic118$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeKeyword("FEATURES"), SubLObjectFactory.makeKeyword("XREF-MODULE-TABLE"), SubLObjectFactory.makeKeyword("METHOD-DEFINITION-TABLE"), SubLObjectFactory.makeKeyword("GLOBAL-DEFINITION-TABLE"), SubLObjectFactory.makeKeyword("METHOD-CALLED-BY-METHOD-TABLE"), SubLObjectFactory.makeKeyword("METHOD-CALLED-BY-GLOBAL-TABLE"), SubLObjectFactory.makeKeyword("METHOD-CALLED-AT-TOP-LEVEL-TABLE"), SubLObjectFactory.makeKeyword("GLOBAL-REFERENCED-BY-METHOD-TABLE"), SubLObjectFactory.makeKeyword("GLOBAL-MODIFIED-BY-METHOD-TABLE"), SubLObjectFactory.makeKeyword("GLOBAL-REBOUND-BY-METHOD-TABLE"), SubLObjectFactory.makeKeyword("GLOBAL-REFERENCED-BY-GLOBAL-TABLE"), SubLObjectFactory.makeKeyword("GLOBAL-REFERENCED-AT-TOP-LEVEL-TABLE"), SubLObjectFactory.makeKeyword("GLOBAL-MODIFIED-AT-TOP-LEVEL-TABLE"), SubLObjectFactory.makeKeyword("GLOBAL-REBOUND-AT-TOP-LEVEL-TABLE") });
        $ic119$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#56145", "CYC"), SubLObjectFactory.makeSymbol("S#56146", "CYC"), SubLObjectFactory.makeSymbol("S#56147", "CYC"), SubLObjectFactory.makeSymbol("S#56148", "CYC"), SubLObjectFactory.makeSymbol("S#56149", "CYC"), SubLObjectFactory.makeSymbol("S#56150", "CYC"), SubLObjectFactory.makeSymbol("S#56151", "CYC"), SubLObjectFactory.makeSymbol("S#56152", "CYC"), SubLObjectFactory.makeSymbol("S#56153", "CYC"), SubLObjectFactory.makeSymbol("S#56154", "CYC"), SubLObjectFactory.makeSymbol("S#56155", "CYC"), SubLObjectFactory.makeSymbol("S#56156", "CYC"), SubLObjectFactory.makeSymbol("S#56157", "CYC"), SubLObjectFactory.makeSymbol("S#56158", "CYC"), SubLObjectFactory.makeSymbol("S#56159", "CYC") });
        $ic120$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#56160", "CYC"), SubLObjectFactory.makeSymbol("S#56161", "CYC"), SubLObjectFactory.makeSymbol("S#56162", "CYC"), SubLObjectFactory.makeSymbol("S#56163", "CYC"), SubLObjectFactory.makeSymbol("S#56164", "CYC"), SubLObjectFactory.makeSymbol("S#56165", "CYC"), SubLObjectFactory.makeSymbol("S#56166", "CYC"), SubLObjectFactory.makeSymbol("S#56167", "CYC"), SubLObjectFactory.makeSymbol("S#56168", "CYC"), SubLObjectFactory.makeSymbol("S#56169", "CYC"), SubLObjectFactory.makeSymbol("S#56170", "CYC"), SubLObjectFactory.makeSymbol("S#56171", "CYC"), SubLObjectFactory.makeSymbol("S#56172", "CYC"), SubLObjectFactory.makeSymbol("S#56173", "CYC"), SubLObjectFactory.makeSymbol("S#56174", "CYC") });
        $ic121$ = SubLObjectFactory.makeSymbol("S#56178", "CYC");
        $ic122$ = SubLObjectFactory.makeSymbol("S#56144", "CYC");
        $ic123$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#56042", "CYC"));
        $ic124$ = SubLObjectFactory.makeSymbol("S#56145", "CYC");
        $ic125$ = SubLObjectFactory.makeSymbol("S#56160", "CYC");
        $ic126$ = SubLObjectFactory.makeSymbol("S#56146", "CYC");
        $ic127$ = SubLObjectFactory.makeSymbol("S#56161", "CYC");
        $ic128$ = SubLObjectFactory.makeSymbol("S#56147", "CYC");
        $ic129$ = SubLObjectFactory.makeSymbol("S#56162", "CYC");
        $ic130$ = SubLObjectFactory.makeSymbol("S#56148", "CYC");
        $ic131$ = SubLObjectFactory.makeSymbol("S#56163", "CYC");
        $ic132$ = SubLObjectFactory.makeSymbol("S#56149", "CYC");
        $ic133$ = SubLObjectFactory.makeSymbol("S#56164", "CYC");
        $ic134$ = SubLObjectFactory.makeSymbol("S#56150", "CYC");
        $ic135$ = SubLObjectFactory.makeSymbol("S#56165", "CYC");
        $ic136$ = SubLObjectFactory.makeSymbol("S#56151", "CYC");
        $ic137$ = SubLObjectFactory.makeSymbol("S#56166", "CYC");
        $ic138$ = SubLObjectFactory.makeSymbol("S#56152", "CYC");
        $ic139$ = SubLObjectFactory.makeSymbol("S#56167", "CYC");
        $ic140$ = SubLObjectFactory.makeSymbol("S#56153", "CYC");
        $ic141$ = SubLObjectFactory.makeSymbol("S#56168", "CYC");
        $ic142$ = SubLObjectFactory.makeSymbol("S#56154", "CYC");
        $ic143$ = SubLObjectFactory.makeSymbol("S#56169", "CYC");
        $ic144$ = SubLObjectFactory.makeSymbol("S#56155", "CYC");
        $ic145$ = SubLObjectFactory.makeSymbol("S#56170", "CYC");
        $ic146$ = SubLObjectFactory.makeSymbol("S#56156", "CYC");
        $ic147$ = SubLObjectFactory.makeSymbol("S#56171", "CYC");
        $ic148$ = SubLObjectFactory.makeSymbol("S#56157", "CYC");
        $ic149$ = SubLObjectFactory.makeSymbol("S#56172", "CYC");
        $ic150$ = SubLObjectFactory.makeSymbol("S#56158", "CYC");
        $ic151$ = SubLObjectFactory.makeSymbol("S#56173", "CYC");
        $ic152$ = SubLObjectFactory.makeSymbol("S#56159", "CYC");
        $ic153$ = SubLObjectFactory.makeSymbol("S#56174", "CYC");
        $ic154$ = SubLObjectFactory.makeKeyword("XREF-MODULE-TABLE");
        $ic155$ = SubLObjectFactory.makeKeyword("METHOD-DEFINITION-TABLE");
        $ic156$ = SubLObjectFactory.makeKeyword("GLOBAL-DEFINITION-TABLE");
        $ic157$ = SubLObjectFactory.makeKeyword("METHOD-CALLED-BY-METHOD-TABLE");
        $ic158$ = SubLObjectFactory.makeKeyword("METHOD-CALLED-BY-GLOBAL-TABLE");
        $ic159$ = SubLObjectFactory.makeKeyword("METHOD-CALLED-AT-TOP-LEVEL-TABLE");
        $ic160$ = SubLObjectFactory.makeKeyword("GLOBAL-REFERENCED-BY-METHOD-TABLE");
        $ic161$ = SubLObjectFactory.makeKeyword("GLOBAL-MODIFIED-BY-METHOD-TABLE");
        $ic162$ = SubLObjectFactory.makeKeyword("GLOBAL-REBOUND-BY-METHOD-TABLE");
        $ic163$ = SubLObjectFactory.makeKeyword("GLOBAL-REFERENCED-BY-GLOBAL-TABLE");
        $ic164$ = SubLObjectFactory.makeKeyword("GLOBAL-REFERENCED-AT-TOP-LEVEL-TABLE");
        $ic165$ = SubLObjectFactory.makeKeyword("GLOBAL-MODIFIED-AT-TOP-LEVEL-TABLE");
        $ic166$ = SubLObjectFactory.makeKeyword("GLOBAL-REBOUND-AT-TOP-LEVEL-TABLE");
        $ic167$ = SubLObjectFactory.makeSymbol("S#56175", "CYC");
        $ic168$ = SubLObjectFactory.makeSymbol("S#56177", "CYC");
        $ic169$ = SubLObjectFactory.makeString("~A : ~S features, ~S modules");
        $ic170$ = SubLObjectFactory.makeInteger(10000);
        $ic171$ = SubLObjectFactory.makeInteger(1000);
        $ic172$ = SubLObjectFactory.makeInteger(500);
        $ic173$ = SubLObjectFactory.makeString("Module ~A features changed to ~S");
        $ic174$ = SubLObjectFactory.makeKeyword("SL2C");
        $ic175$ = SubLObjectFactory.makeKeyword("SL2JAVA");
        $ic176$ = SubLObjectFactory.makeString("Unexpected backend ~S");
        $ic177$ = SubLObjectFactory.makeSymbol("S#56111", "CYC");
        $ic178$ = SubLObjectFactory.makeSymbol("NOT-EQ");
        $ic179$ = SubLObjectFactory.makeSymbol("CDR");
        $ic180$ = SubLObjectFactory.makeKeyword("METHODS");
        $ic181$ = SubLObjectFactory.makeKeyword("GLOBALS");
        $ic182$ = SubLObjectFactory.makeSymbol("S#56291", "CYC");
        $ic183$ = SubLObjectFactory.makeSymbol("S#56294", "CYC");
        $ic184$ = SubLObjectFactory.makeSymbol("S#51", "CYC");
        $ic185$ = SubLObjectFactory.makeString("@subl ");
        $ic186$ = SubLObjectFactory.makeString(" ");
        $ic187$ = SubLObjectFactory.makeSymbol("S#56302", "CYC");
        $ic188$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic189$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#56381", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic190$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("FEATURES"));
        $ic191$ = SubLObjectFactory.makeUninternedSymbol("US#6D4B01D");
        $ic192$ = SubLObjectFactory.makeUninternedSymbol("US#8E4499");
        $ic193$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#56191", "CYC")));
        $ic194$ = SubLObjectFactory.makeSymbol("FWHEN");
        $ic195$ = SubLObjectFactory.makeSymbol("S#56102", "CYC");
        $ic196$ = SubLObjectFactory.makeSymbol("S#56375", "CYC");
        $ic197$ = SubLObjectFactory.makeSymbol("PWHEN");
        $ic198$ = SubLObjectFactory.makeSymbol("S#56303", "CYC");
        $ic199$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#56398", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic200$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#56340", "CYC")));
        $ic201$ = SubLObjectFactory.makeSymbol("S#56340", "CYC");
        $ic202$ = SubLObjectFactory.makeSymbol("S#56339", "CYC");
        $ic203$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#214", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic204$ = SubLObjectFactory.makeUninternedSymbol("US#333F606");
        $ic205$ = SubLObjectFactory.makeSymbol("CHECK-TYPE");
        $ic206$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRINGP"));
        $ic207$ = SubLObjectFactory.makeSymbol("S#56376", "CYC");
        $ic208$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FILE-POSITION"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic209$ = SubLObjectFactory.makeUninternedSymbol("US#44FB2F3");
        $ic210$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P"));
        $ic211$ = SubLObjectFactory.makeSymbol("S#56377", "CYC");
        $ic212$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic213$ = SubLObjectFactory.makeSymbol("S#56347", "CYC");
        $ic214$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic215$ = SubLObjectFactory.makeUninternedSymbol("US#A60500");
        $ic216$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYMBOLP"));
        $ic217$ = SubLObjectFactory.makeSymbol("S#56378", "CYC");
        $ic218$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#673", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic219$ = SubLObjectFactory.makeUninternedSymbol("US#680520C");
        $ic220$ = SubLObjectFactory.makeSymbol("S#56379", "CYC");
        $ic221$ = SubLObjectFactory.makeKeyword("METHOD");
        $ic222$ = SubLObjectFactory.makeKeyword("GLOBAL");
        $ic223$ = SubLObjectFactory.makeKeyword("FILE");
        $ic224$ = SubLObjectFactory.makeString("~% def glob : ~S");
        $ic225$ = SubLObjectFactory.makeString("~% defmacro : ~S");
        $ic226$ = SubLObjectFactory.makeString("~% define   : ~S");
        $ic227$ = SubLObjectFactory.makeString("~%  arglist : ~S");
        $ic228$ = SubLObjectFactory.makeString("~%  binding-type : ~S");
        $ic229$ = SubLObjectFactory.makeString("~%  ref glob  : ~S");
        $ic230$ = SubLObjectFactory.makeString("~%  mod glob  : ~S");
        $ic231$ = SubLObjectFactory.makeString("Initializer for ~S modifies ~S");
        $ic232$ = SubLObjectFactory.makeString("~%  bind glob  : ~S");
        $ic233$ = SubLObjectFactory.makeString("Initializer for ~S rebinds ~S");
        $ic234$ = SubLObjectFactory.makeString("~%  macro use : ~S");
        $ic235$ = SubLObjectFactory.makeString("~%  fun call  : ~S");
        $ic236$ = SubLObjectFactory.makeString("~%module removed  : ~A");
        $ic237$ = SubLObjectFactory.makeSymbol("STRING-LESSP");
        $ic238$ = SubLObjectFactory.makeSymbol("SYMBOL-NAME");
        $ic239$ = SubLObjectFactory.makeSymbol("<");
        $ic240$ = SubLObjectFactory.makeSymbol("S#56271", "CYC");
        $ic241$ = SubLObjectFactory.makeSymbol("S#56250", "CYC");
    }
    
    public static final class $sX56038_native extends SubLStructNative
    {
        public SubLObject $name;
        public SubLObject $xref_system;
        public SubLObject $features;
        public SubLObject $method_definitions;
        public SubLObject $method_position_table;
        public SubLObject $method_method_table;
        public SubLObject $method_global_reference_table;
        public SubLObject $method_global_modification_table;
        public SubLObject $method_global_binding_table;
        public SubLObject $global_definitions;
        public SubLObject $global_position_table;
        public SubLObject $global_method_table;
        public SubLObject $global_global_reference_table;
        public SubLObject $top_method_table;
        public SubLObject $top_global_reference_table;
        public SubLObject $top_global_modification_table;
        public SubLObject $top_global_binding_table;
        public SubLObject $method_formal_arglist_table;
        public SubLObject $global_binding_type_table;
        private static final SubLStructDeclNative structDecl;
        
        public $sX56038_native() {
            this.$name = (SubLObject)CommonSymbols.NIL;
            this.$xref_system = (SubLObject)CommonSymbols.NIL;
            this.$features = (SubLObject)CommonSymbols.NIL;
            this.$method_definitions = (SubLObject)CommonSymbols.NIL;
            this.$method_position_table = (SubLObject)CommonSymbols.NIL;
            this.$method_method_table = (SubLObject)CommonSymbols.NIL;
            this.$method_global_reference_table = (SubLObject)CommonSymbols.NIL;
            this.$method_global_modification_table = (SubLObject)CommonSymbols.NIL;
            this.$method_global_binding_table = (SubLObject)CommonSymbols.NIL;
            this.$global_definitions = (SubLObject)CommonSymbols.NIL;
            this.$global_position_table = (SubLObject)CommonSymbols.NIL;
            this.$global_method_table = (SubLObject)CommonSymbols.NIL;
            this.$global_global_reference_table = (SubLObject)CommonSymbols.NIL;
            this.$top_method_table = (SubLObject)CommonSymbols.NIL;
            this.$top_global_reference_table = (SubLObject)CommonSymbols.NIL;
            this.$top_global_modification_table = (SubLObject)CommonSymbols.NIL;
            this.$top_global_binding_table = (SubLObject)CommonSymbols.NIL;
            this.$method_formal_arglist_table = (SubLObject)CommonSymbols.NIL;
            this.$global_binding_type_table = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX56038_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$name;
        }
        
        public SubLObject getField3() {
            return this.$xref_system;
        }
        
        public SubLObject getField4() {
            return this.$features;
        }
        
        public SubLObject getField5() {
            return this.$method_definitions;
        }
        
        public SubLObject getField6() {
            return this.$method_position_table;
        }
        
        public SubLObject getField7() {
            return this.$method_method_table;
        }
        
        public SubLObject getField8() {
            return this.$method_global_reference_table;
        }
        
        public SubLObject getField9() {
            return this.$method_global_modification_table;
        }
        
        public SubLObject getField10() {
            return this.$method_global_binding_table;
        }
        
        public SubLObject getField11() {
            return this.$global_definitions;
        }
        
        public SubLObject getField12() {
            return this.$global_position_table;
        }
        
        public SubLObject getField13() {
            return this.$global_method_table;
        }
        
        public SubLObject getField14() {
            return this.$global_global_reference_table;
        }
        
        public SubLObject getField15() {
            return this.$top_method_table;
        }
        
        public SubLObject getField16() {
            return this.$top_global_reference_table;
        }
        
        public SubLObject getField17() {
            return this.$top_global_modification_table;
        }
        
        public SubLObject getField18() {
            return this.$top_global_binding_table;
        }
        
        public SubLObject getField19() {
            return this.$method_formal_arglist_table;
        }
        
        public SubLObject getField20() {
            return this.$global_binding_type_table;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$name = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$xref_system = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$features = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$method_definitions = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$method_position_table = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$method_method_table = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$method_global_reference_table = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$method_global_modification_table = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$method_global_binding_table = value;
        }
        
        public SubLObject setField11(final SubLObject value) {
            return this.$global_definitions = value;
        }
        
        public SubLObject setField12(final SubLObject value) {
            return this.$global_position_table = value;
        }
        
        public SubLObject setField13(final SubLObject value) {
            return this.$global_method_table = value;
        }
        
        public SubLObject setField14(final SubLObject value) {
            return this.$global_global_reference_table = value;
        }
        
        public SubLObject setField15(final SubLObject value) {
            return this.$top_method_table = value;
        }
        
        public SubLObject setField16(final SubLObject value) {
            return this.$top_global_reference_table = value;
        }
        
        public SubLObject setField17(final SubLObject value) {
            return this.$top_global_modification_table = value;
        }
        
        public SubLObject setField18(final SubLObject value) {
            return this.$top_global_binding_table = value;
        }
        
        public SubLObject setField19(final SubLObject value) {
            return this.$method_formal_arglist_table = value;
        }
        
        public SubLObject setField20(final SubLObject value) {
            return this.$global_binding_type_table = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX56038_native.class, module0809.$ic0$, module0809.$ic1$, module0809.$ic2$, module0809.$ic3$, new String[] { "$name", "$xref_system", "$features", "$method_definitions", "$method_position_table", "$method_method_table", "$method_global_reference_table", "$method_global_modification_table", "$method_global_binding_table", "$global_definitions", "$global_position_table", "$global_method_table", "$global_global_reference_table", "$top_method_table", "$top_global_reference_table", "$top_global_modification_table", "$top_global_binding_table", "$method_formal_arglist_table", "$global_binding_type_table" }, module0809.$ic4$, module0809.$ic5$, module0809.$ic6$);
        }
    }
    
    public static final class $f51385$UnaryFunction extends UnaryFunction
    {
        public $f51385$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#56039"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0809.f51385(var3);
        }
    }
    
    public static final class $sX56041_native extends SubLStructNative
    {
        public SubLObject $name;
        public SubLObject $features;
        public SubLObject $xref_module_table;
        public SubLObject $method_definition_table;
        public SubLObject $global_definition_table;
        public SubLObject $method_called_by_method_table;
        public SubLObject $method_called_by_global_table;
        public SubLObject $method_called_at_top_level_table;
        public SubLObject $global_referenced_by_method_table;
        public SubLObject $global_modified_by_method_table;
        public SubLObject $global_rebound_by_method_table;
        public SubLObject $global_referenced_by_global_table;
        public SubLObject $global_referenced_at_top_level_table;
        public SubLObject $global_modified_at_top_level_table;
        public SubLObject $global_rebound_at_top_level_table;
        private static final SubLStructDeclNative structDecl;
        
        public $sX56041_native() {
            this.$name = (SubLObject)CommonSymbols.NIL;
            this.$features = (SubLObject)CommonSymbols.NIL;
            this.$xref_module_table = (SubLObject)CommonSymbols.NIL;
            this.$method_definition_table = (SubLObject)CommonSymbols.NIL;
            this.$global_definition_table = (SubLObject)CommonSymbols.NIL;
            this.$method_called_by_method_table = (SubLObject)CommonSymbols.NIL;
            this.$method_called_by_global_table = (SubLObject)CommonSymbols.NIL;
            this.$method_called_at_top_level_table = (SubLObject)CommonSymbols.NIL;
            this.$global_referenced_by_method_table = (SubLObject)CommonSymbols.NIL;
            this.$global_modified_by_method_table = (SubLObject)CommonSymbols.NIL;
            this.$global_rebound_by_method_table = (SubLObject)CommonSymbols.NIL;
            this.$global_referenced_by_global_table = (SubLObject)CommonSymbols.NIL;
            this.$global_referenced_at_top_level_table = (SubLObject)CommonSymbols.NIL;
            this.$global_modified_at_top_level_table = (SubLObject)CommonSymbols.NIL;
            this.$global_rebound_at_top_level_table = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX56041_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$name;
        }
        
        public SubLObject getField3() {
            return this.$features;
        }
        
        public SubLObject getField4() {
            return this.$xref_module_table;
        }
        
        public SubLObject getField5() {
            return this.$method_definition_table;
        }
        
        public SubLObject getField6() {
            return this.$global_definition_table;
        }
        
        public SubLObject getField7() {
            return this.$method_called_by_method_table;
        }
        
        public SubLObject getField8() {
            return this.$method_called_by_global_table;
        }
        
        public SubLObject getField9() {
            return this.$method_called_at_top_level_table;
        }
        
        public SubLObject getField10() {
            return this.$global_referenced_by_method_table;
        }
        
        public SubLObject getField11() {
            return this.$global_modified_by_method_table;
        }
        
        public SubLObject getField12() {
            return this.$global_rebound_by_method_table;
        }
        
        public SubLObject getField13() {
            return this.$global_referenced_by_global_table;
        }
        
        public SubLObject getField14() {
            return this.$global_referenced_at_top_level_table;
        }
        
        public SubLObject getField15() {
            return this.$global_modified_at_top_level_table;
        }
        
        public SubLObject getField16() {
            return this.$global_rebound_at_top_level_table;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$name = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$features = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$xref_module_table = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$method_definition_table = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$global_definition_table = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$method_called_by_method_table = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$method_called_by_global_table = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$method_called_at_top_level_table = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$global_referenced_by_method_table = value;
        }
        
        public SubLObject setField11(final SubLObject value) {
            return this.$global_modified_by_method_table = value;
        }
        
        public SubLObject setField12(final SubLObject value) {
            return this.$global_rebound_by_method_table = value;
        }
        
        public SubLObject setField13(final SubLObject value) {
            return this.$global_referenced_by_global_table = value;
        }
        
        public SubLObject setField14(final SubLObject value) {
            return this.$global_referenced_at_top_level_table = value;
        }
        
        public SubLObject setField15(final SubLObject value) {
            return this.$global_modified_at_top_level_table = value;
        }
        
        public SubLObject setField16(final SubLObject value) {
            return this.$global_rebound_at_top_level_table = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX56041_native.class, module0809.$ic116$, module0809.$ic78$, module0809.$ic117$, module0809.$ic118$, new String[] { "$name", "$features", "$xref_module_table", "$method_definition_table", "$global_definition_table", "$method_called_by_method_table", "$method_called_by_global_table", "$method_called_at_top_level_table", "$global_referenced_by_method_table", "$global_modified_by_method_table", "$global_rebound_by_method_table", "$global_referenced_by_global_table", "$global_referenced_at_top_level_table", "$global_modified_at_top_level_table", "$global_rebound_at_top_level_table" }, module0809.$ic119$, module0809.$ic120$, module0809.$ic121$);
        }
    }
    
    public static final class $f51432$UnaryFunction extends UnaryFunction
    {
        public $f51432$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#56042"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0809.f51432(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0809.class
	Total time: 1140 ms
	
	Decompiled with Procyon 0.5.32.
*/