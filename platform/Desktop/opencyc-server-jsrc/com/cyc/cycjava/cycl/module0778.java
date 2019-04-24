package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0778 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0778";
    public static final String myFingerPrint = "22ca457d371425ad47799988fc84c6d77c7a6947a035870549866e442b6d9233";
    public static SubLSymbol $g6267$;
    public static SubLSymbol $g6268$;
    public static SubLSymbol $g6269$;
    public static SubLSymbol $g6270$;
    public static SubLSymbol $g6271$;
    public static SubLSymbol $g6272$;
    public static SubLSymbol $g6273$;
    public static SubLSymbol $g6274$;
    public static SubLSymbol $g6275$;
    public static SubLSymbol $g6276$;
    public static SubLSymbol $g6277$;
    private static SubLSymbol $g6278$;
    public static SubLSymbol $g6279$;
    public static SubLSymbol $g6280$;
    public static SubLSymbol $g6281$;
    public static SubLSymbol $g6282$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLList $ic3$;
    private static final SubLList $ic4$;
    private static final SubLList $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLInteger $ic7$;
    private static final SubLInteger $ic8$;
    private static final SubLInteger $ic9$;
    private static final SubLInteger $ic10$;
    private static final SubLInteger $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLList $ic13$;
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
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
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
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLString $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLList $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLString $ic98$;
    private static final SubLObject $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLString $ic102$;
    private static final SubLString $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLString $ic106$;
    private static final SubLString $ic107$;
    private static final SubLList $ic108$;
    private static final SubLString $ic109$;
    private static final SubLString $ic110$;
    private static final SubLObject $ic111$;
    private static final SubLObject $ic112$;
    private static final SubLObject $ic113$;
    private static final SubLString $ic114$;
    private static final SubLString $ic115$;
    private static final SubLObject $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLList $ic120$;
    private static final SubLString $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLObject $ic123$;
    private static final SubLString $ic124$;
    private static final SubLString $ic125$;
    private static final SubLString $ic126$;
    private static final SubLString $ic127$;
    private static final SubLSymbol $ic128$;
    private static final SubLObject $ic129$;
    private static final SubLObject $ic130$;
    private static final SubLObject $ic131$;
    private static final SubLSymbol $ic132$;
    private static final SubLSymbol $ic133$;
    private static final SubLSymbol $ic134$;
    private static final SubLObject $ic135$;
    private static final SubLSymbol $ic136$;
    private static final SubLSymbol $ic137$;
    private static final SubLObject $ic138$;
    private static final SubLSymbol $ic139$;
    private static final SubLString $ic140$;
    private static final SubLObject $ic141$;
    private static final SubLSymbol $ic142$;
    private static final SubLList $ic143$;
    private static final SubLObject $ic144$;
    private static final SubLObject $ic145$;
    private static final SubLList $ic146$;
    private static final SubLSymbol $ic147$;
    private static final SubLSymbol $ic148$;
    private static final SubLSymbol $ic149$;
    private static final SubLObject $ic150$;
    private static final SubLObject $ic151$;
    private static final SubLObject $ic152$;
    private static final SubLObject $ic153$;
    
    public static SubLObject f50148(final SubLObject var1, final SubLObject var2) {
        compatibility.default_struct_print_function(var1, var2, (SubLObject)module0778.ZERO_INTEGER);
        return (SubLObject)module0778.NIL;
    }
    
    public static SubLObject f50149(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX54689_native.class) ? module0778.T : module0778.NIL);
    }
    
    public static SubLObject f50150(final SubLObject var1) {
        assert module0778.NIL != f50149(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f50151(final SubLObject var1) {
        assert module0778.NIL != f50149(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f50152(final SubLObject var1) {
        assert module0778.NIL != f50149(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f50153(final SubLObject var1) {
        assert module0778.NIL != f50149(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f50154(final SubLObject var1) {
        assert module0778.NIL != f50149(var1) : var1;
        return var1.getField6();
    }
    
    public static SubLObject f50155(final SubLObject var1) {
        assert module0778.NIL != f50149(var1) : var1;
        return var1.getField7();
    }
    
    public static SubLObject f50156(final SubLObject var1) {
        assert module0778.NIL != f50149(var1) : var1;
        return var1.getField8();
    }
    
    public static SubLObject f50157(final SubLObject var1) {
        assert module0778.NIL != f50149(var1) : var1;
        return var1.getField9();
    }
    
    public static SubLObject f50158(final SubLObject var1) {
        assert module0778.NIL != f50149(var1) : var1;
        return var1.getField10();
    }
    
    public static SubLObject f50159(final SubLObject var1) {
        assert module0778.NIL != f50149(var1) : var1;
        return var1.getField11();
    }
    
    public static SubLObject f50160(final SubLObject var1) {
        assert module0778.NIL != f50149(var1) : var1;
        return var1.getField12();
    }
    
    public static SubLObject f50161(final SubLObject var1) {
        assert module0778.NIL != f50149(var1) : var1;
        return var1.getField13();
    }
    
    public static SubLObject f50162(final SubLObject var1) {
        assert module0778.NIL != f50149(var1) : var1;
        return var1.getField14();
    }
    
    public static SubLObject f50163(final SubLObject var1) {
        assert module0778.NIL != f50149(var1) : var1;
        return var1.getField15();
    }
    
    public static SubLObject f50164(final SubLObject var1) {
        assert module0778.NIL != f50149(var1) : var1;
        return var1.getField16();
    }
    
    public static SubLObject f50165(final SubLObject var1) {
        assert module0778.NIL != f50149(var1) : var1;
        return var1.getField17();
    }
    
    public static SubLObject f50166(final SubLObject var1) {
        assert module0778.NIL != f50149(var1) : var1;
        return var1.getField18();
    }
    
    public static SubLObject f50167(final SubLObject var1) {
        assert module0778.NIL != f50149(var1) : var1;
        return var1.getField19();
    }
    
    public static SubLObject f50168(final SubLObject var1) {
        assert module0778.NIL != f50149(var1) : var1;
        return var1.getField20();
    }
    
    public static SubLObject f50169(final SubLObject var1) {
        assert module0778.NIL != f50149(var1) : var1;
        return (($sX54689_native)var1).$parse_template;
    }
    
    public static SubLObject f50170(final SubLObject var1) {
        assert module0778.NIL != f50149(var1) : var1;
        return (($sX54689_native)var1).$parse_template_formula;
    }
    
    public static SubLObject f50171(final SubLObject var1) {
        assert module0778.NIL != f50149(var1) : var1;
        return (($sX54689_native)var1).$lexical_mt;
    }
    
    public static SubLObject f50172(final SubLObject var1) {
        assert module0778.NIL != f50149(var1) : var1;
        return (($sX54689_native)var1).$syntactic_mt;
    }
    
    public static SubLObject f50173(final SubLObject var1) {
        assert module0778.NIL != f50149(var1) : var1;
        return (($sX54689_native)var1).$generation_mt;
    }
    
    public static SubLObject f50174(final SubLObject var1, final SubLObject var4) {
        assert module0778.NIL != f50149(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f50175(final SubLObject var1, final SubLObject var4) {
        assert module0778.NIL != f50149(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f50176(final SubLObject var1, final SubLObject var4) {
        assert module0778.NIL != f50149(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f50177(final SubLObject var1, final SubLObject var4) {
        assert module0778.NIL != f50149(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f50178(final SubLObject var1, final SubLObject var4) {
        assert module0778.NIL != f50149(var1) : var1;
        return var1.setField6(var4);
    }
    
    public static SubLObject f50179(final SubLObject var1, final SubLObject var4) {
        assert module0778.NIL != f50149(var1) : var1;
        return var1.setField7(var4);
    }
    
    public static SubLObject f50180(final SubLObject var1, final SubLObject var4) {
        assert module0778.NIL != f50149(var1) : var1;
        return var1.setField8(var4);
    }
    
    public static SubLObject f50181(final SubLObject var1, final SubLObject var4) {
        assert module0778.NIL != f50149(var1) : var1;
        return var1.setField9(var4);
    }
    
    public static SubLObject f50182(final SubLObject var1, final SubLObject var4) {
        assert module0778.NIL != f50149(var1) : var1;
        return var1.setField10(var4);
    }
    
    public static SubLObject f50183(final SubLObject var1, final SubLObject var4) {
        assert module0778.NIL != f50149(var1) : var1;
        return var1.setField11(var4);
    }
    
    public static SubLObject f50184(final SubLObject var1, final SubLObject var4) {
        assert module0778.NIL != f50149(var1) : var1;
        return var1.setField12(var4);
    }
    
    public static SubLObject f50185(final SubLObject var1, final SubLObject var4) {
        assert module0778.NIL != f50149(var1) : var1;
        return var1.setField13(var4);
    }
    
    public static SubLObject f50186(final SubLObject var1, final SubLObject var4) {
        assert module0778.NIL != f50149(var1) : var1;
        return var1.setField14(var4);
    }
    
    public static SubLObject f50187(final SubLObject var1, final SubLObject var4) {
        assert module0778.NIL != f50149(var1) : var1;
        return var1.setField15(var4);
    }
    
    public static SubLObject f50188(final SubLObject var1, final SubLObject var4) {
        assert module0778.NIL != f50149(var1) : var1;
        return var1.setField16(var4);
    }
    
    public static SubLObject f50189(final SubLObject var1, final SubLObject var4) {
        assert module0778.NIL != f50149(var1) : var1;
        return var1.setField17(var4);
    }
    
    public static SubLObject f50190(final SubLObject var1, final SubLObject var4) {
        assert module0778.NIL != f50149(var1) : var1;
        return var1.setField18(var4);
    }
    
    public static SubLObject f50191(final SubLObject var1, final SubLObject var4) {
        assert module0778.NIL != f50149(var1) : var1;
        return var1.setField19(var4);
    }
    
    public static SubLObject f50192(final SubLObject var1, final SubLObject var4) {
        assert module0778.NIL != f50149(var1) : var1;
        return var1.setField20(var4);
    }
    
    public static SubLObject f50193(final SubLObject var1, final SubLObject var4) {
        assert module0778.NIL != f50149(var1) : var1;
        return (($sX54689_native)var1).$parse_template = var4;
    }
    
    public static SubLObject f50194(final SubLObject var1, final SubLObject var4) {
        assert module0778.NIL != f50149(var1) : var1;
        return (($sX54689_native)var1).$parse_template_formula = var4;
    }
    
    public static SubLObject f50195(final SubLObject var1, final SubLObject var4) {
        assert module0778.NIL != f50149(var1) : var1;
        return (($sX54689_native)var1).$lexical_mt = var4;
    }
    
    public static SubLObject f50196(final SubLObject var1, final SubLObject var4) {
        assert module0778.NIL != f50149(var1) : var1;
        return (($sX54689_native)var1).$syntactic_mt = var4;
    }
    
    public static SubLObject f50197(final SubLObject var1, final SubLObject var4) {
        assert module0778.NIL != f50149(var1) : var1;
        return (($sX54689_native)var1).$generation_mt = var4;
    }
    
    public static SubLObject f50198(SubLObject var5) {
        if (var5 == module0778.UNPROVIDED) {
            var5 = (SubLObject)module0778.NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX54689_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0778.NIL, var7 = var5; module0778.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0778.$ic62$)) {
                f50174(var6, var9);
            }
            else if (var10.eql((SubLObject)module0778.$ic63$)) {
                f50175(var6, var9);
            }
            else if (var10.eql((SubLObject)module0778.$ic64$)) {
                f50176(var6, var9);
            }
            else if (var10.eql((SubLObject)module0778.$ic65$)) {
                f50177(var6, var9);
            }
            else if (var10.eql((SubLObject)module0778.$ic66$)) {
                f50178(var6, var9);
            }
            else if (var10.eql((SubLObject)module0778.$ic67$)) {
                f50179(var6, var9);
            }
            else if (var10.eql((SubLObject)module0778.$ic68$)) {
                f50180(var6, var9);
            }
            else if (var10.eql((SubLObject)module0778.$ic69$)) {
                f50181(var6, var9);
            }
            else if (var10.eql((SubLObject)module0778.$ic70$)) {
                f50182(var6, var9);
            }
            else if (var10.eql((SubLObject)module0778.$ic71$)) {
                f50183(var6, var9);
            }
            else if (var10.eql((SubLObject)module0778.$ic72$)) {
                f50184(var6, var9);
            }
            else if (var10.eql((SubLObject)module0778.$ic73$)) {
                f50185(var6, var9);
            }
            else if (var10.eql((SubLObject)module0778.$ic74$)) {
                f50186(var6, var9);
            }
            else if (var10.eql((SubLObject)module0778.$ic75$)) {
                f50187(var6, var9);
            }
            else if (var10.eql((SubLObject)module0778.$ic76$)) {
                f50188(var6, var9);
            }
            else if (var10.eql((SubLObject)module0778.$ic77$)) {
                f50189(var6, var9);
            }
            else if (var10.eql((SubLObject)module0778.$ic78$)) {
                f50190(var6, var9);
            }
            else if (var10.eql((SubLObject)module0778.$ic79$)) {
                f50191(var6, var9);
            }
            else if (var10.eql((SubLObject)module0778.$ic80$)) {
                f50192(var6, var9);
            }
            else if (var10.eql((SubLObject)module0778.$ic81$)) {
                f50193(var6, var9);
            }
            else if (var10.eql((SubLObject)module0778.$ic82$)) {
                f50194(var6, var9);
            }
            else if (var10.eql((SubLObject)module0778.$ic83$)) {
                f50195(var6, var9);
            }
            else if (var10.eql((SubLObject)module0778.$ic84$)) {
                f50196(var6, var9);
            }
            else if (var10.eql((SubLObject)module0778.$ic85$)) {
                f50197(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0778.$ic86$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f50199(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0778.$ic87$, (SubLObject)module0778.$ic88$, (SubLObject)module0778.$ic10$);
        Functions.funcall(var12, var11, (SubLObject)module0778.$ic89$, (SubLObject)module0778.$ic62$, f50150(var11));
        Functions.funcall(var12, var11, (SubLObject)module0778.$ic89$, (SubLObject)module0778.$ic63$, f50151(var11));
        Functions.funcall(var12, var11, (SubLObject)module0778.$ic89$, (SubLObject)module0778.$ic64$, f50152(var11));
        Functions.funcall(var12, var11, (SubLObject)module0778.$ic89$, (SubLObject)module0778.$ic65$, f50153(var11));
        Functions.funcall(var12, var11, (SubLObject)module0778.$ic89$, (SubLObject)module0778.$ic66$, f50154(var11));
        Functions.funcall(var12, var11, (SubLObject)module0778.$ic89$, (SubLObject)module0778.$ic67$, f50155(var11));
        Functions.funcall(var12, var11, (SubLObject)module0778.$ic89$, (SubLObject)module0778.$ic68$, f50156(var11));
        Functions.funcall(var12, var11, (SubLObject)module0778.$ic89$, (SubLObject)module0778.$ic69$, f50157(var11));
        Functions.funcall(var12, var11, (SubLObject)module0778.$ic89$, (SubLObject)module0778.$ic70$, f50158(var11));
        Functions.funcall(var12, var11, (SubLObject)module0778.$ic89$, (SubLObject)module0778.$ic71$, f50159(var11));
        Functions.funcall(var12, var11, (SubLObject)module0778.$ic89$, (SubLObject)module0778.$ic72$, f50160(var11));
        Functions.funcall(var12, var11, (SubLObject)module0778.$ic89$, (SubLObject)module0778.$ic73$, f50161(var11));
        Functions.funcall(var12, var11, (SubLObject)module0778.$ic89$, (SubLObject)module0778.$ic74$, f50162(var11));
        Functions.funcall(var12, var11, (SubLObject)module0778.$ic89$, (SubLObject)module0778.$ic75$, f50163(var11));
        Functions.funcall(var12, var11, (SubLObject)module0778.$ic89$, (SubLObject)module0778.$ic76$, f50164(var11));
        Functions.funcall(var12, var11, (SubLObject)module0778.$ic89$, (SubLObject)module0778.$ic77$, f50165(var11));
        Functions.funcall(var12, var11, (SubLObject)module0778.$ic89$, (SubLObject)module0778.$ic78$, f50166(var11));
        Functions.funcall(var12, var11, (SubLObject)module0778.$ic89$, (SubLObject)module0778.$ic79$, f50167(var11));
        Functions.funcall(var12, var11, (SubLObject)module0778.$ic89$, (SubLObject)module0778.$ic80$, f50168(var11));
        Functions.funcall(var12, var11, (SubLObject)module0778.$ic89$, (SubLObject)module0778.$ic81$, f50169(var11));
        Functions.funcall(var12, var11, (SubLObject)module0778.$ic89$, (SubLObject)module0778.$ic82$, f50170(var11));
        Functions.funcall(var12, var11, (SubLObject)module0778.$ic89$, (SubLObject)module0778.$ic83$, f50171(var11));
        Functions.funcall(var12, var11, (SubLObject)module0778.$ic89$, (SubLObject)module0778.$ic84$, f50172(var11));
        Functions.funcall(var12, var11, (SubLObject)module0778.$ic89$, (SubLObject)module0778.$ic85$, f50173(var11));
        Functions.funcall(var12, var11, (SubLObject)module0778.$ic90$, (SubLObject)module0778.$ic88$, (SubLObject)module0778.$ic10$);
        return var11;
    }
    
    public static SubLObject f50200(final SubLObject var11, final SubLObject var12) {
        return f50199(var11, var12);
    }
    
    public static SubLObject f50201(SubLObject var13, SubLObject var14, SubLObject var15) {
        if (var13 == module0778.UNPROVIDED) {
            var13 = module0778.$g6268$.getDynamicValue();
        }
        if (var14 == module0778.UNPROVIDED) {
            var14 = (SubLObject)module0778.NIL;
        }
        if (var15 == module0778.UNPROVIDED) {
            var15 = (SubLObject)module0778.NIL;
        }
        SubLObject var16 = (SubLObject)ConsesLow.list(new SubLObject[] { f50150(var13), f50151(var13), f50152(var13), f50153(var13), f50154(var13), f50155(var13), f50156(var13), f50157(var13), f50158(var13), f50159(var13), f50160(var13), f50161(var13), f50171(var13), f50172(var13), f50173(var13), f50168(var13), f50169(var13), f50170(var13) });
        final SubLObject var17 = (SubLObject)ConsesLow.list(f50167(var13), f50162(var13), f50163(var13), f50164(var13), f50165(var13), f50166(var13));
        if (module0778.NIL == var15) {
            var16 = ConsesLow.append(var16, var17);
        }
        if (module0778.NIL != var14) {
            var16 = (SubLObject)ConsesLow.cons(var13, var16);
        }
        return var16;
    }
    
    public static SubLObject f50202(final SubLObject var13) {
        return f50201(var13, (SubLObject)module0778.NIL, (SubLObject)module0778.T);
    }
    
    public static SubLObject f50203(final SubLObject var18, final SubLObject var13) {
        f50174(var18, f50150(var13));
        f50175(var18, f50151(var13));
        f50176(var18, f50152(var13));
        f50177(var18, f50153(var13));
        f50178(var18, f50154(var13));
        f50179(var18, f50155(var13));
        f50180(var18, f50156(var13));
        f50181(var18, f50157(var13));
        f50182(var18, f50158(var13));
        f50183(var18, f50159(var13));
        f50184(var18, f50160(var13));
        f50185(var18, f50161(var13));
        f50186(var18, f50162(var13));
        f50187(var18, f50163(var13));
        f50188(var18, f50164(var13));
        f50189(var18, f50165(var13));
        f50190(var18, f50166(var13));
        f50191(var18, f50167(var13));
        f50195(var18, f50171(var13));
        f50196(var18, f50172(var13));
        f50197(var18, f50173(var13));
        f50192(var18, f50168(var13));
        f50193(var18, f50169(var13));
        f50194(var18, f50170(var13));
        return (SubLObject)module0778.NIL;
    }
    
    public static SubLObject f50204(final SubLObject var13) {
        final SubLObject var14 = f50198((SubLObject)module0778.UNPROVIDED);
        f50203(var14, var13);
        return var14;
    }
    
    public static SubLObject f50205() {
        return Guids.guid_to_string(Guids.new_guid());
    }
    
    public static SubLObject f50206(final SubLObject var19, final SubLObject var13) {
        if (module0778.NIL != module0778.$g6277$.getGlobalValue()) {
            return Hashtables.sethash(var19, module0778.$g6277$.getGlobalValue(), var13);
        }
        return (SubLObject)module0778.NIL;
    }
    
    public static SubLObject f50207(final SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        SubLObject var21 = (SubLObject)module0778.NIL;
        if (module0778.NIL != module0778.$g6277$.getGlobalValue()) {
            var21 = (SubLObject)((module0778.NIL != var19) ? Hashtables.gethash(var19, module0778.$g6277$.getGlobalValue(), (SubLObject)module0778.UNPROVIDED) : module0778.NIL);
        }
        else if (module0777.$g6251$.getDynamicValue(var20).numGE(Numbers.max(module0777.$g6251$.getDynamicValue(var20), module0777.$g6242$.getGlobalValue()))) {
            PrintLow.format(StreamsLow.$trace_output$.getDynamicValue(var20), Sequences.cconcatenate((SubLObject)module0778.$ic102$, (SubLObject)module0778.$ic103$));
            streams_high.force_output(StreamsLow.$trace_output$.getDynamicValue(var20));
        }
        return var21;
    }
    
    public static SubLObject f50208(SubLObject var21) {
        final SubLThread var22 = SubLProcess.currentSubLThread();
        SubLObject var23 = (SubLObject)module0778.NIL;
        SubLObject var24 = (SubLObject)module0778.NIL;
        var21 = module0038.f2735(var21);
        SubLObject var25 = (SubLObject)module0778.NIL;
        try {
            var22.throwStack.push(module0778.$ic104$);
            final SubLObject var26 = Errors.$error_handler$.currentBinding(var22);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)module0778.$ic105$), var22);
                try {
                    var22.resetMultipleValues();
                    final SubLObject var26_27 = reader.read_from_string_ignoring_errors(var21, (SubLObject)module0778.UNPROVIDED, (SubLObject)module0778.UNPROVIDED, (SubLObject)module0778.UNPROVIDED, (SubLObject)module0778.UNPROVIDED);
                    final SubLObject var28_29 = var22.secondMultipleValue();
                    var22.resetMultipleValues();
                    var23 = var26_27;
                    var24 = var28_29;
                    if (var24.numL(Sequences.length(var21)) || (module0778.NIL != var23 && var23.isAtom())) {
                        var21 = Sequences.cconcatenate((SubLObject)module0778.$ic106$, new SubLObject[] { var21, module0778.$ic107$ });
                        var23 = reader.read_from_string_ignoring_errors(var21, (SubLObject)module0778.UNPROVIDED, (SubLObject)module0778.UNPROVIDED, (SubLObject)module0778.UNPROVIDED, (SubLObject)module0778.UNPROVIDED);
                    }
                }
                catch (Throwable var27) {
                    Errors.handleThrowable(var27, (SubLObject)module0778.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var26, var22);
            }
        }
        catch (Throwable var28) {
            var25 = Errors.handleThrowable(var28, (SubLObject)module0778.$ic104$);
        }
        finally {
            var22.throwStack.pop();
        }
        return var23;
    }
    
    public static SubLObject f50209(final SubLObject var32) {
        SubLObject var33 = (SubLObject)module0778.ZERO_INTEGER;
        final SubLObject var34 = Sequences.length(var32);
        SubLObject var35 = (SubLObject)module0778.NIL;
        SubLObject var38_39;
        SubLObject var36;
        SubLObject var37;
        SubLObject var38;
        SubLObject var39;
        for (var36 = (var38_39 = Sequences.length(var32)), var37 = (SubLObject)module0778.NIL, var37 = (SubLObject)module0778.ZERO_INTEGER; !var37.numGE(var38_39); var37 = module0048.f_1X(var37)) {
            var38 = Strings.sublisp_char(var32, var37);
            var39 = (SubLObject)(Numbers.add(var37, (SubLObject)module0778.ONE_INTEGER).numL(var34) ? Sequences.elt(var32, Numbers.add(var37, (SubLObject)module0778.ONE_INTEGER)) : module0778.NIL);
            if (var38.eql((SubLObject)Characters.CHAR_tilde) && !var35.eql((SubLObject)Characters.CHAR_tilde) && module0778.NIL == module0004.f104(var39, (SubLObject)module0778.$ic108$, (SubLObject)module0778.UNPROVIDED, (SubLObject)module0778.UNPROVIDED)) {
                var33 = Numbers.add(var33, (SubLObject)module0778.ONE_INTEGER);
            }
            var35 = var38;
        }
        return var33;
    }
    
    public static SubLObject f50210(final SubLObject var43, final SubLObject var44) {
        SubLObject var45 = module0777.f50049(var43, (SubLObject)module0778.MINUS_ONE_INTEGER);
        if (var43.equalp((SubLObject)module0778.$ic109$)) {
            var45 = (SubLObject)module0778.ONE_INTEGER;
        }
        else if (var43.equalp((SubLObject)module0778.$ic110$)) {
            var45 = var44;
        }
        return var45;
    }
    
    public static SubLObject f50211(final SubLObject var46, final SubLObject var47) {
        SubLObject var48 = (SubLObject)module0778.NIL;
        if (var47.numE((SubLObject)module0778.ONE_INTEGER)) {
            var48 = module0778.$g6276$.getGlobalValue();
        }
        else if (var46.numE((SubLObject)module0778.ONE_INTEGER)) {
            var48 = module0778.$ic111$;
        }
        else if (var46.numE(var47)) {
            var48 = module0778.$ic112$;
        }
        else {
            var48 = module0778.$ic113$;
        }
        return var48;
    }
    
    public static SubLObject f50212(final SubLObject var49, final SubLObject var50, final SubLObject var51, final SubLObject var52, SubLObject var53) {
        if (var53 == module0778.UNPROVIDED) {
            var53 = module0584.$g4396$.getDynamicValue();
        }
        final SubLObject var54 = module0777.f50108(var50, (SubLObject)module0778.NIL);
        final SubLObject var55 = Sequences.length(var54);
        final SubLObject var56 = module0603.f36871(var52);
        SubLObject var57 = f50213(var51, var56, var50, var55);
        SubLObject var58 = (SubLObject)module0778.NIL;
        if (module0778.NIL == var57) {
            final SubLObject var59 = Numbers.subtract(var51, (SubLObject)module0778.ONE_INTEGER);
            final SubLObject var60 = f50211(var51, var55);
            final SubLObject var61 = Sequences.elt(var54, var59);
            final SubLObject var62 = module0035.f2131(var59, var54);
            SubLObject var63 = module0202.f12787(var62, (SubLObject)module0778.UNPROVIDED);
            SubLObject var64 = (SubLObject)module0778.NIL;
            final SubLObject var65 = f50214(var61, var56, var53);
            if (module0778.NIL == var65) {
                var57 = PrintLow.format((SubLObject)module0778.NIL, (SubLObject)module0778.$ic114$, var61, var52);
            }
            else if (var60.eql(module0778.$ic111$)) {
                var58 = (SubLObject)ConsesLow.list(module0778.$ic111$, var65, var63, var56, var49);
            }
            else if (var60.eql(module0778.$ic112$)) {
                var58 = (SubLObject)ConsesLow.list(module0778.$ic112$, var63, var65, var56, var49);
            }
            else if (var60.eql(module0778.$ic113$)) {
                var64 = module0202.f12787(conses_high.nthcdr(var59, var62), (SubLObject)module0778.UNPROVIDED);
                var63 = module0202.f12787(module0035.f2124(var59, var62), (SubLObject)module0778.UNPROVIDED);
                var58 = (SubLObject)ConsesLow.list(module0778.$ic113$, var63, var65, var64, var56, var49);
            }
            else if (var60.eql(module0778.$g6276$.getGlobalValue()) && module0778.NIL == var62) {
                final SubLObject var66 = module0732.f44913(var65, var56, var49);
                var58 = (SubLObject)ConsesLow.list(module0778.$g6276$.getGlobalValue(), var65, var56, var66, var49);
            }
            else {
                var57 = (SubLObject)module0778.$ic115$;
            }
        }
        return Values.values(var58, var57);
    }
    
    public static SubLObject f50215(final SubLObject var65, final SubLObject var55, final SubLObject var66, SubLObject var67) {
        if (var67 == module0778.UNPROVIDED) {
            var67 = module0778.$ic116$;
        }
        return f50216(var65, var55, var66, var67, (SubLObject)module0778.T, (SubLObject)module0778.UNPROVIDED, (SubLObject)module0778.UNPROVIDED);
    }
    
    public static SubLObject f50217(final SubLObject var65, final SubLObject var55, final SubLObject var66, SubLObject var67) {
        if (var67 == module0778.UNPROVIDED) {
            var67 = module0778.$ic116$;
        }
        return f50216(var65, var55, var66, var67, (SubLObject)module0778.NIL, (SubLObject)module0778.UNPROVIDED, (SubLObject)module0778.UNPROVIDED);
    }
    
    public static SubLObject f50216(final SubLObject var65, final SubLObject var55, final SubLObject var66, final SubLObject var67, final SubLObject var68, SubLObject var69, SubLObject var70) {
        if (var69 == module0778.UNPROVIDED) {
            var69 = Symbols.symbol_function((SubLObject)module0778.$ic117$);
        }
        if (var70 == module0778.UNPROVIDED) {
            var70 = (SubLObject)module0778.NIL;
        }
        final SubLThread var71 = SubLProcess.currentSubLThread();
        final SubLObject var72 = module0777.f50061(var55, (SubLObject)module0778.UNPROVIDED);
        final SubLObject var73 = module0777.f50094(var65, var72);
        final SubLObject var74 = (module0778.NIL != var68) ? Symbols.symbol_function((SubLObject)module0778.$ic118$) : Symbols.symbol_function((SubLObject)module0778.$ic119$);
        final SubLObject var75 = module0732.f44933(var55).first();
        final SubLObject var76 = (module0778.NIL != conses_high.member(var72, (SubLObject)module0778.$ic120$, (SubLObject)module0778.UNPROVIDED, (SubLObject)module0778.UNPROVIDED)) ? var73 : var65;
        SubLObject var77 = module0731.f44730(var76, var75, (SubLObject)module0778.NIL, var66, (SubLObject)module0778.UNPROVIDED).first();
        if (module0778.NIL == var77 && module0778.NIL == var77) {
            SubLObject var78 = module0730.f44560(var73, (SubLObject)module0778.NIL, var66, (SubLObject)module0778.UNPROVIDED);
            SubLObject var79 = (SubLObject)module0778.NIL;
            var79 = var78.first();
            while (module0778.NIL == var77 && module0778.NIL != var78) {
                if (module0778.NIL == module0731.f44711(var79, var55, (SubLObject)module0778.UNPROVIDED, (SubLObject)module0778.UNPROVIDED, (SubLObject)module0778.UNPROVIDED)) {
                    var77 = var79;
                }
                var78 = var78.rest();
                var79 = var78.first();
            }
        }
        if (module0778.NIL == var77) {
            final SubLObject var80 = module0126.f8395(module0732.f44915(var73), (SubLObject)module0778.UNPROVIDED);
            if (module0778.NIL != var70) {
                var77 = Functions.funcall(var69, var70, var80);
            }
            else {
                var77 = Functions.funcall(var69, var80);
            }
            if (module0778.NIL == var77 && module0777.$g6251$.getDynamicValue(var71).numGE(Numbers.max(module0777.$g6251$.getDynamicValue(var71), module0777.$g6242$.getGlobalValue()))) {
                PrintLow.format(StreamsLow.$trace_output$.getDynamicValue(var71), Sequences.cconcatenate((SubLObject)module0778.$ic102$, (SubLObject)module0778.$ic121$), (SubLObject)module0778.$ic122$);
                streams_high.force_output(StreamsLow.$trace_output$.getDynamicValue(var71));
            }
            module0777.f50107((SubLObject)ConsesLow.list(module0778.$ic123$, var77, var67), var66, (SubLObject)module0778.UNPROVIDED, (SubLObject)module0778.UNPROVIDED);
        }
        return Functions.funcall(var74, (SubLObject)ConsesLow.list(var75, var77, var76), var66);
    }
    
    public static SubLObject f50213(final SubLObject var51, final SubLObject var55, final SubLObject var50, final SubLObject var47) {
        SubLObject var56 = (SubLObject)module0778.NIL;
        if (var50.eql((SubLObject)module0778.$ic124$)) {
            var56 = (SubLObject)module0778.$ic125$;
        }
        else if (var51.numL((SubLObject)module0778.ONE_INTEGER) || var51.numG(var47)) {
            var56 = (SubLObject)module0778.$ic126$;
        }
        else if (module0778.NIL == var55) {
            var56 = (SubLObject)module0778.$ic127$;
        }
        return var56;
    }
    
    public static SubLObject f50214(final SubLObject var59, final SubLObject var55, SubLObject var53) {
        if (var53 == module0778.UNPROVIDED) {
            var53 = module0584.$g4396$.getDynamicValue();
        }
        SubLObject var60 = (SubLObject)module0778.NIL;
        if (module0778.NIL == var60) {
            SubLObject var61 = module0732.f44933(var55);
            SubLObject var62 = (SubLObject)module0778.NIL;
            var62 = var61.first();
            while (module0778.NIL == var60 && module0778.NIL != var61) {
                final SubLObject var63 = module0777.f50065(var62, (SubLObject)module0778.UNPROVIDED);
                if (module0778.NIL == var60) {
                    SubLObject var77_81 = (SubLObject)ConsesLow.list(var59, module0728.f44519(var59, var63));
                    SubLObject var64 = (SubLObject)module0778.NIL;
                    var64 = var77_81.first();
                    while (module0778.NIL == var60 && module0778.NIL != var77_81) {
                        final SubLObject var65 = module0731.f44730(var64, var62, (SubLObject)module0778.NIL, var53, (SubLObject)module0778.UNPROVIDED);
                        var60 = var65.first();
                        var77_81 = var77_81.rest();
                        var64 = var77_81.first();
                    }
                }
                var61 = var61.rest();
                var62 = var61.first();
            }
        }
        return var60;
    }
    
    public static SubLObject f50218(final SubLObject var13) {
        f50219(var13, (SubLObject)module0778.UNPROVIDED);
        final SubLObject var14 = module0603.f36871(f50150(var13));
        final SubLObject var15 = module0603.f36871(f50152(var13));
        final SubLObject var16 = f50165(var13);
        final SubLObject var17 = (SubLObject)SubLObjectFactory.makeBoolean(module0778.NIL != module0777.f50125(var14) && module0778.NIL == f50155(var13));
        SubLObject var18 = (SubLObject)((module0778.NIL != var16) ? module0777.f50107(var16, var15, (SubLObject)module0778.UNPROVIDED, (SubLObject)module0778.UNPROVIDED) : module0778.NIL);
        if (module0778.NIL != var18) {
            SubLObject var19 = f50166(var13);
            SubLObject var57_88 = (SubLObject)module0778.NIL;
            var57_88 = var19.first();
            while (module0778.NIL != var19) {
                var18 = module0777.f50107(var57_88, var15, (SubLObject)module0778.UNPROVIDED, (SubLObject)module0778.UNPROVIDED);
                var19 = var19.rest();
                var57_88 = var19.first();
            }
            if (module0778.NIL != f50153(var13) && module0778.NIL == var17) {
                final SubLObject var20 = Equality.eq(f50153(var13), (SubLObject)module0778.$ic128$);
                final SubLObject var21 = (module0778.NIL != var20) ? module0778.$ic129$ : module0778.$ic130$;
                f50220(var14, var21, (SubLObject)module0778.UNPROVIDED);
                module0777.f50045((SubLObject)ConsesLow.list(var21, var14, (SubLObject)ConsesLow.list(module0778.$ic131$, var15, var16)), var15, (SubLObject)module0778.UNPROVIDED, (SubLObject)module0778.UNPROVIDED);
            }
            if (module0778.NIL != f50170(var13)) {
                final SubLObject var22 = module0603.f36871(f50168(var13));
                module0777.f50045(f50170(var13), var22, (SubLObject)module0778.UNPROVIDED, (SubLObject)module0778.UNPROVIDED);
            }
            if (module0778.NIL != f50167(var13)) {
                module0780.f50265(var13, f50167(var13));
            }
            f50221(f50150(var13), f50151(var13), (SubLObject)module0778.UNPROVIDED);
        }
        return var18;
    }
    
    public static SubLObject f50221(final SubLObject var91, SubLObject var50, SubLObject var92) {
        if (var50 == module0778.UNPROVIDED) {
            var50 = (SubLObject)module0778.NIL;
        }
        if (var92 == module0778.UNPROVIDED) {
            var92 = (SubLObject)module0778.NIL;
        }
        SubLObject var93 = module0732.f45103(module0603.f36871(var91));
        SubLObject var94 = (SubLObject)module0778.NIL;
        var94 = var93.first();
        while (module0778.NIL != var93) {
            if (module0778.NIL != module0178.f11284(var94)) {
                final SubLObject var95 = (SubLObject)((module0778.NIL != var92) ? module0778.$ic132$ : module0778.$ic133$);
                Functions.funcall(var95, var94);
            }
            var93 = var93.rest();
            var94 = var93.first();
        }
        return (SubLObject)module0778.T;
    }
    
    public static SubLObject f50220(final SubLObject var95, SubLObject var74, SubLObject var92) {
        if (var74 == module0778.UNPROVIDED) {
            var74 = module0778.$ic130$;
        }
        if (var92 == module0778.UNPROVIDED) {
            var92 = (SubLObject)module0778.NIL;
        }
        final SubLThread var96 = SubLProcess.currentSubLThread();
        final SubLObject var97 = module0147.$g2094$.currentBinding(var96);
        final SubLObject var98 = module0147.$g2095$.currentBinding(var96);
        try {
            module0147.$g2094$.bind((SubLObject)module0778.$ic134$, var96);
            module0147.$g2095$.bind(module0778.$ic135$, var96);
            final SubLObject var99 = var74;
            if (module0778.NIL != module0158.f10010(var95, (SubLObject)module0778.ONE_INTEGER, var99)) {
                final SubLObject var100 = module0158.f10011(var95, (SubLObject)module0778.ONE_INTEGER, var99);
                SubLObject var101 = (SubLObject)module0778.NIL;
                final SubLObject var102 = (SubLObject)module0778.NIL;
                while (module0778.NIL == var101) {
                    final SubLObject var103 = module0052.f3695(var100, var102);
                    final SubLObject var104 = (SubLObject)SubLObjectFactory.makeBoolean(!var102.eql(var103));
                    if (module0778.NIL != var104) {
                        SubLObject var105 = (SubLObject)module0778.NIL;
                        try {
                            var105 = module0158.f10316(var103, (SubLObject)module0778.$ic136$, (SubLObject)module0778.$ic137$, (SubLObject)module0778.NIL);
                            SubLObject var99_104 = (SubLObject)module0778.NIL;
                            final SubLObject var100_105 = (SubLObject)module0778.NIL;
                            while (module0778.NIL == var99_104) {
                                final SubLObject var106 = module0052.f3695(var105, var100_105);
                                final SubLObject var102_106 = (SubLObject)SubLObjectFactory.makeBoolean(!var100_105.eql(var106));
                                if (module0778.NIL != var102_106) {
                                    final SubLObject var107 = (SubLObject)((module0778.NIL != var92) ? module0778.$ic132$ : module0778.$ic133$);
                                    Functions.funcall(var107, var106);
                                }
                                var99_104 = (SubLObject)SubLObjectFactory.makeBoolean(module0778.NIL == var102_106);
                            }
                        }
                        finally {
                            final SubLObject var25_107 = Threads.$is_thread_performing_cleanupP$.currentBinding(var96);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0778.T, var96);
                                if (module0778.NIL != var105) {
                                    module0158.f10319(var105);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var25_107, var96);
                            }
                        }
                    }
                    var101 = (SubLObject)SubLObjectFactory.makeBoolean(module0778.NIL == var104);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var98, var96);
            module0147.$g2094$.rebind(var97, var96);
        }
        return (SubLObject)module0778.T;
    }
    
    public static SubLObject f50222(final SubLObject var13) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        final SubLObject var15 = module0603.f36871(f50150(var13));
        final SubLObject var16 = (SubLObject)SubLObjectFactory.makeBoolean(module0778.NIL != module0777.f50125(var15) && module0778.NIL == f50155(var13));
        SubLObject var17 = module0603.f36871(f50152(var13));
        if (module0778.NIL == var17) {
            f50176(var13, (module0778.NIL != var16) ? module0584.$g4443$.getDynamicValue(var14) : module0584.$g4441$.getDynamicValue(var14));
            var17 = module0603.f36871(f50152(var13));
        }
        if (module0778.NIL != f50154(var13)) {
            f50223(var13);
        }
        else if (module0778.NIL != var16) {
            f50224(var13);
        }
        else {
            f50225(var13);
        }
        if (module0778.NIL != f50165(var13) && (module0778.NIL == module0778.$g6279$.getDynamicValue(var14) || module0778.NIL == f50162(var13))) {
            f50186(var13, module0777.f50071(f50165(var13), var17));
        }
        return (SubLObject)module0778.NIL;
    }
    
    public static SubLObject f50223(final SubLObject var13) {
        final SubLObject var14 = module0603.f36871(f50150(var13));
        final SubLObject var15 = f50151(var13);
        SubLObject var16 = module0603.f36871(f50156(var13));
        if (module0778.NIL == var16) {
            var16 = module0603.f36871(module0778.$g6275$.getGlobalValue());
        }
        f50189(var13, (SubLObject)ConsesLow.list(var16, var14, var15));
        f50186(var13, (SubLObject)module0778.NIL);
        return (SubLObject)module0778.NIL;
    }
    
    public static SubLObject f50225(final SubLObject var13) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        final SubLObject var15 = module0603.f36871(f50150(var13));
        var14.resetMultipleValues();
        final SubLObject var16 = f50212(var15, f50151(var13), f50160(var13), f50161(var13), f50226(f50152(var13), (SubLObject)module0778.UNPROVIDED));
        final SubLObject var17 = var14.secondMultipleValue();
        var14.resetMultipleValues();
        f50189(var13, var16);
        f50186(var13, var17);
        return (SubLObject)module0778.NIL;
    }
    
    public static SubLObject f50224(final SubLObject var13) {
        final SubLObject var14 = module0603.f36871(f50150(var13));
        final SubLObject var15 = f50157(var13);
        final SubLObject var16 = f50158(var13);
        final SubLObject var17 = (SubLObject)((module0778.NIL != var16) ? f50208(var16) : module0778.NIL);
        if (var15.isString()) {
            f50189(var13, (SubLObject)ConsesLow.list(module0778.$ic138$, var14, var15, var17));
        }
        else if (module0778.NIL != module0202.f12590(var15)) {
            f50189(var13, var15);
        }
        f50227(var13);
        return (SubLObject)module0778.NIL;
    }
    
    public static SubLObject f50227(final SubLObject var13) {
        final SubLObject var14 = f50169(var13);
        SubLObject var15 = f50170(var13);
        final SubLObject var16 = module0603.f36871(f50168(var13));
        if (module0778.NIL != module0038.f2653(var14)) {
            var15 = reader.read_from_string_ignoring_errors(module0038.f2933(f50169(var13)), (SubLObject)module0778.UNPROVIDED, (SubLObject)module0778.UNPROVIDED, (SubLObject)module0778.UNPROVIDED, (SubLObject)module0778.UNPROVIDED);
            f50194(var13, var15);
        }
        if (module0778.NIL != var15) {
            f50186(var13, module0777.f50071(f50170(var13), var16));
        }
        return (SubLObject)module0778.NIL;
    }
    
    public static SubLObject f50228(SubLObject var13) {
        if (var13 == module0778.UNPROVIDED) {
            var13 = module0778.$g6268$.getDynamicValue();
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        f50203(var13, f50198((SubLObject)module0778.UNPROVIDED));
        f50180(var13, module0778.$g6275$.getGlobalValue());
        f50187(var13, (SubLObject)module0778.$ic139$);
        f50195(var13, module0603.f36871(module0584.$g4441$.getDynamicValue(var14)));
        f50196(var13, module0603.f36871(module0584.$g4442$.getDynamicValue(var14)));
        f50197(var13, module0603.f36871(module0584.$g4443$.getDynamicValue(var14)));
        f50192(var13, module0603.f36871(module0584.$g4444$.getDynamicValue(var14)));
        return (SubLObject)module0778.T;
    }
    
    public static SubLObject f50219(SubLObject var13, SubLObject var115) {
        if (var13 == module0778.UNPROVIDED) {
            var13 = module0778.$g6268$.getDynamicValue();
        }
        if (var115 == module0778.UNPROVIDED) {
            var115 = module0777.$g6245$.getGlobalValue();
        }
        final SubLThread var116 = SubLProcess.currentSubLThread();
        if (module0777.$g6251$.getDynamicValue(var116).numGE(var115)) {
            PrintLow.format(StreamsLow.$trace_output$.getDynamicValue(var116), (SubLObject)module0778.$ic140$, f50201(var13, (SubLObject)module0778.T, (SubLObject)module0778.UNPROVIDED));
            streams_high.force_output(StreamsLow.$trace_output$.getDynamicValue(var116));
        }
        return (SubLObject)module0778.T;
    }
    
    public static SubLObject f50229(final SubLObject var116) {
        final SubLObject var117 = module0603.f36871(var116);
        final SubLObject var118 = module0259.f16842(var117);
        SubLObject var119 = (SubLObject)module0778.NIL;
        SubLObject var120 = (SubLObject)module0778.NIL;
        SubLObject var121 = (SubLObject)module0778.NIL;
        SubLObject var122 = (SubLObject)module0778.NIL;
        var120 = module0778.$g6273$.getGlobalValue();
        var121 = var120.first();
        for (var122 = (SubLObject)module0778.ZERO_INTEGER; module0778.NIL != var120; var120 = var120.rest(), var121 = var120.first(), var122 = Numbers.add((SubLObject)module0778.ONE_INTEGER, var122)) {
            if (module0778.NIL == var117 || var121.eql(module0778.$ic141$) || module0778.NIL != conses_high.member(var121, var118, (SubLObject)module0778.UNPROVIDED, (SubLObject)module0778.UNPROVIDED)) {
                final SubLObject var123 = Sequences.elt(module0778.$g6272$.getGlobalValue(), var122);
                if (module0778.NIL == conses_high.member(var123, var119, Symbols.symbol_function((SubLObject)module0778.EQL), Symbols.symbol_function((SubLObject)module0778.IDENTITY))) {
                    var119 = (SubLObject)ConsesLow.cons(var123, var119);
                }
            }
        }
        return Sequences.reverse(var119);
    }
    
    public static SubLObject f50230(SubLObject var122) {
        if (var122 == module0778.UNPROVIDED) {
            var122 = (SubLObject)module0778.NIL;
        }
        final SubLThread var123 = SubLProcess.currentSubLThread();
        if (module0778.NIL != module0778.$g6278$.getDynamicValue(var123) && module0778.NIL == var122) {
            return (SubLObject)module0778.T;
        }
        module0778.$g6268$.setDynamicValue(f50198((SubLObject)module0778.UNPROVIDED), var123);
        f50228((SubLObject)module0778.UNPROVIDED);
        module0778.$g6277$.setGlobalValue(Hashtables.make_hash_table((SubLObject)module0778.$ic11$, Symbols.symbol_function((SubLObject)module0778.EQUAL), (SubLObject)module0778.UNPROVIDED));
        module0778.$g6270$.setGlobalValue(Mapping.mapcar(Symbols.symbol_function((SubLObject)module0778.$ic142$), (SubLObject)module0778.$ic143$));
        final SubLObject var125;
        final SubLObject var124 = var125 = Sequences.remove_duplicates(ConsesLow.append(module0260.f17034(module0778.$ic144$, (SubLObject)module0778.UNPROVIDED, (SubLObject)module0778.UNPROVIDED), module0259.f16848(module0778.$ic145$, (SubLObject)module0778.UNPROVIDED, (SubLObject)module0778.UNPROVIDED)), (SubLObject)module0778.UNPROVIDED, (SubLObject)module0778.UNPROVIDED, (SubLObject)module0778.UNPROVIDED, (SubLObject)module0778.UNPROVIDED);
        final SubLObject var126 = module0777.f50050(var125);
        final SubLObject var127 = module0035.f2218(var126, (SubLObject)module0778.$ic146$, (SubLObject)module0778.UNPROVIDED, (SubLObject)module0778.UNPROVIDED);
        module0778.$g6272$.setGlobalValue(Mapping.mapcar(Symbols.symbol_function((SubLObject)module0778.$ic147$), var127));
        module0778.$g6273$.setGlobalValue(Mapping.mapcar(Symbols.symbol_function((SubLObject)module0778.$ic148$), var127));
        SubLObject var128 = (SubLObject)module0778.NIL;
        SubLObject var129 = module0778.$g6269$.getGlobalValue();
        SubLObject var130 = (SubLObject)module0778.NIL;
        var130 = var129.first();
        while (module0778.NIL != var129) {
            SubLObject var87_129 = module0777.f50072(var130);
            SubLObject var131 = (SubLObject)module0778.NIL;
            var131 = var87_129.first();
            while (module0778.NIL != var87_129) {
                final SubLObject var132 = var131;
                if (module0778.NIL == conses_high.member(var132, var128, Symbols.symbol_function((SubLObject)module0778.EQL), Symbols.symbol_function((SubLObject)module0778.IDENTITY))) {
                    var128 = (SubLObject)ConsesLow.cons(var132, var128);
                }
                var87_129 = var87_129.rest();
                var131 = var87_129.first();
            }
            var129 = var129.rest();
            var130 = var129.first();
        }
        var128 = Sort.sort(var128, Symbols.symbol_function((SubLObject)module0778.$ic149$), Symbols.symbol_function((SubLObject)module0778.$ic147$));
        module0778.$g6271$.setGlobalValue(Mapping.mapcar(Symbols.symbol_function((SubLObject)module0778.$ic147$), var128));
        final SubLObject var133 = Mapping.mapcar(Symbols.symbol_function((SubLObject)module0778.$ic147$), f50231());
        module0778.$g6274$.setGlobalValue((SubLObject)ConsesLow.cons((SubLObject)module0778.$ic124$, Sort.sort(var133, Symbols.symbol_function((SubLObject)module0778.$ic149$), (SubLObject)module0778.UNPROVIDED)));
        final SubLObject var134 = Mapping.mapcar(Symbols.symbol_function((SubLObject)module0778.$ic147$), module0262.f17312(module0778.$ic150$, (SubLObject)module0778.UNPROVIDED, (SubLObject)module0778.UNPROVIDED));
        module0778.$g6280$.setGlobalValue(Sort.sort(var134, Symbols.symbol_function((SubLObject)module0778.$ic149$), (SubLObject)module0778.UNPROVIDED));
        module0778.$g6278$.setDynamicValue((SubLObject)module0778.T, var123);
        return (SubLObject)module0778.T;
    }
    
    public static SubLObject f50231() {
        return conses_high.set_difference(module0259.f16848(module0778.$ic151$, module0778.$ic152$, (SubLObject)module0778.UNPROVIDED), module0259.f16848(module0778.$ic153$, module0778.$ic152$, (SubLObject)module0778.UNPROVIDED), (SubLObject)module0778.UNPROVIDED, (SubLObject)module0778.UNPROVIDED);
    }
    
    public static SubLObject f50232(final SubLObject var91, SubLObject var53) {
        if (var53 == module0778.UNPROVIDED) {
            var53 = module0584.$g4396$.getDynamicValue();
        }
        return (SubLObject)module0778.NIL;
    }
    
    public static SubLObject f50226(final SubLObject var133, SubLObject var134) {
        if (var134 == module0778.UNPROVIDED) {
            var134 = module0584.$g4441$.getDynamicValue();
        }
        SubLObject var135 = module0603.f36871(var134);
        if (module0778.NIL != module0778.$g6281$.getGlobalValue()) {
            var135 = module0603.f36871(var133);
        }
        return var135;
    }
    
    public static SubLObject f50233() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50148", "S#54692", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50149", "S#54690", 1, 0, false);
        new $f50149$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50150", "S#54693", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50151", "S#54694", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50152", "S#54695", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50153", "S#54696", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50154", "S#54697", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50155", "S#54698", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50156", "S#54699", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50157", "S#54700", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50158", "S#54701", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50159", "S#54702", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50160", "S#54703", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50161", "S#54704", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50162", "S#54705", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50163", "S#54706", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50164", "S#54707", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50165", "S#54708", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50166", "S#54709", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50167", "S#54710", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50168", "S#54711", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50169", "S#54712", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50170", "S#54713", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50171", "S#54714", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50172", "S#54715", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50173", "S#54716", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50174", "S#54717", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50175", "S#54718", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50176", "S#54719", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50177", "S#54720", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50178", "S#54721", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50179", "S#54722", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50180", "S#54723", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50181", "S#54724", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50182", "S#54725", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50183", "S#54726", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50184", "S#54727", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50185", "S#54728", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50186", "S#54729", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50187", "S#54730", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50188", "S#54731", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50189", "S#54732", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50190", "S#54733", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50191", "S#54734", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50192", "S#54735", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50193", "S#54736", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50194", "S#54737", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50195", "S#54738", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50196", "S#54739", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50197", "S#54740", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50198", "S#54741", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50199", "S#54742", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50200", "S#54743", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50201", "S#54744", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50202", "S#54745", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50203", "S#54746", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50204", "S#54747", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50205", "S#54748", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50206", "S#54749", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50207", "S#54750", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50208", "S#54751", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50209", "S#54752", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50210", "S#54753", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50211", "S#54754", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50212", "S#54755", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50215", "S#54756", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50217", "S#54757", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50216", "S#54758", 5, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50213", "S#54759", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50214", "S#54760", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50218", "S#54761", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50221", "S#54762", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50220", "S#54763", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50222", "S#54764", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50223", "S#54765", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50225", "S#54766", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50224", "S#54767", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50227", "S#54768", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50228", "S#54769", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50219", "S#54770", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50229", "S#54771", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50230", "S#54772", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50231", "S#54773", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50232", "S#54774", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0778", "f50226", "S#54775", 1, 1, false);
        return (SubLObject)module0778.NIL;
    }
    
    public static SubLObject f50234() {
        module0778.$g6267$ = SubLFiles.defconstant("S#54776", (SubLObject)module0778.$ic0$);
        module0778.$g6268$ = SubLFiles.defparameter("S#54777", (SubLObject)module0778.NIL);
        module0778.$g6269$ = SubLFiles.deflexical("S#54778", (SubLObject)module0778.$ic92$);
        module0778.$g6270$ = SubLFiles.deflexical("S#54779", (SubLObject)((module0778.NIL != Symbols.boundp((SubLObject)module0778.$ic93$)) ? module0778.$g6270$.getGlobalValue() : module0778.NIL));
        module0778.$g6271$ = SubLFiles.deflexical("S#54780", (SubLObject)((module0778.NIL != Symbols.boundp((SubLObject)module0778.$ic94$)) ? module0778.$g6271$.getGlobalValue() : module0778.NIL));
        module0778.$g6272$ = SubLFiles.deflexical("S#54781", (SubLObject)((module0778.NIL != Symbols.boundp((SubLObject)module0778.$ic95$)) ? module0778.$g6272$.getGlobalValue() : module0778.NIL));
        module0778.$g6273$ = SubLFiles.deflexical("S#54782", (SubLObject)((module0778.NIL != Symbols.boundp((SubLObject)module0778.$ic96$)) ? module0778.$g6273$.getGlobalValue() : module0778.NIL));
        module0778.$g6274$ = SubLFiles.deflexical("S#54783", (SubLObject)((module0778.NIL != Symbols.boundp((SubLObject)module0778.$ic97$)) ? module0778.$g6274$.getGlobalValue() : module0778.NIL));
        module0778.$g6275$ = SubLFiles.deflexical("S#54784", (SubLObject)module0778.$ic98$);
        module0778.$g6276$ = SubLFiles.deflexical("S#54785", module0778.$ic99$);
        module0778.$g6277$ = SubLFiles.deflexical("S#54786", (SubLObject)((module0778.NIL != Symbols.boundp((SubLObject)module0778.$ic100$)) ? module0778.$g6277$.getGlobalValue() : module0778.NIL));
        module0778.$g6278$ = SubLFiles.defparameter("S#54787", (SubLObject)module0778.NIL);
        module0778.$g6279$ = SubLFiles.defvar("S#54788", (SubLObject)module0778.NIL);
        module0778.$g6280$ = SubLFiles.deflexical("S#54789", (SubLObject)((module0778.NIL != Symbols.boundp((SubLObject)module0778.$ic101$)) ? module0778.$g6280$.getGlobalValue() : module0778.NIL));
        module0778.$g6281$ = SubLFiles.deflexical("S#54790", (SubLObject)module0778.T);
        module0778.$g6282$ = SubLFiles.deflexical("S#54791", (SubLObject)module0778.T);
        return (SubLObject)module0778.NIL;
    }
    
    public static SubLObject f50235() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0778.$g6267$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0778.$ic12$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0778.$ic13$);
        Structures.def_csetf((SubLObject)module0778.$ic14$, (SubLObject)module0778.$ic15$);
        Structures.def_csetf((SubLObject)module0778.$ic16$, (SubLObject)module0778.$ic17$);
        Structures.def_csetf((SubLObject)module0778.$ic18$, (SubLObject)module0778.$ic19$);
        Structures.def_csetf((SubLObject)module0778.$ic20$, (SubLObject)module0778.$ic21$);
        Structures.def_csetf((SubLObject)module0778.$ic22$, (SubLObject)module0778.$ic23$);
        Structures.def_csetf((SubLObject)module0778.$ic24$, (SubLObject)module0778.$ic25$);
        Structures.def_csetf((SubLObject)module0778.$ic26$, (SubLObject)module0778.$ic27$);
        Structures.def_csetf((SubLObject)module0778.$ic28$, (SubLObject)module0778.$ic29$);
        Structures.def_csetf((SubLObject)module0778.$ic30$, (SubLObject)module0778.$ic31$);
        Structures.def_csetf((SubLObject)module0778.$ic32$, (SubLObject)module0778.$ic33$);
        Structures.def_csetf((SubLObject)module0778.$ic34$, (SubLObject)module0778.$ic35$);
        Structures.def_csetf((SubLObject)module0778.$ic36$, (SubLObject)module0778.$ic37$);
        Structures.def_csetf((SubLObject)module0778.$ic38$, (SubLObject)module0778.$ic39$);
        Structures.def_csetf((SubLObject)module0778.$ic40$, (SubLObject)module0778.$ic41$);
        Structures.def_csetf((SubLObject)module0778.$ic42$, (SubLObject)module0778.$ic43$);
        Structures.def_csetf((SubLObject)module0778.$ic44$, (SubLObject)module0778.$ic45$);
        Structures.def_csetf((SubLObject)module0778.$ic46$, (SubLObject)module0778.$ic47$);
        Structures.def_csetf((SubLObject)module0778.$ic48$, (SubLObject)module0778.$ic49$);
        Structures.def_csetf((SubLObject)module0778.$ic50$, (SubLObject)module0778.$ic51$);
        Structures.def_csetf((SubLObject)module0778.$ic52$, (SubLObject)module0778.$ic53$);
        Structures.def_csetf((SubLObject)module0778.$ic54$, (SubLObject)module0778.$ic55$);
        Structures.def_csetf((SubLObject)module0778.$ic56$, (SubLObject)module0778.$ic57$);
        Structures.def_csetf((SubLObject)module0778.$ic58$, (SubLObject)module0778.$ic59$);
        Structures.def_csetf((SubLObject)module0778.$ic60$, (SubLObject)module0778.$ic61$);
        Equality.identity((SubLObject)module0778.$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0778.$g6267$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0778.$ic91$));
        module0003.f57((SubLObject)module0778.$ic93$);
        module0003.f57((SubLObject)module0778.$ic94$);
        module0003.f57((SubLObject)module0778.$ic95$);
        module0003.f57((SubLObject)module0778.$ic96$);
        module0003.f57((SubLObject)module0778.$ic97$);
        module0003.f57((SubLObject)module0778.$ic100$);
        module0003.f57((SubLObject)module0778.$ic101$);
        return (SubLObject)module0778.NIL;
    }
    
    public void declareFunctions() {
        f50233();
    }
    
    public void initializeVariables() {
        f50234();
    }
    
    public void runTopLevelForms() {
        f50235();
    }
    
    static {
        me = (SubLFile)new module0778();
        module0778.$g6267$ = null;
        module0778.$g6268$ = null;
        module0778.$g6269$ = null;
        module0778.$g6270$ = null;
        module0778.$g6271$ = null;
        module0778.$g6272$ = null;
        module0778.$g6273$ = null;
        module0778.$g6274$ = null;
        module0778.$g6275$ = null;
        module0778.$g6276$ = null;
        module0778.$g6277$ = null;
        module0778.$g6278$ = null;
        module0778.$g6279$ = null;
        module0778.$g6280$ = null;
        module0778.$g6281$ = null;
        module0778.$g6282$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#54689", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("S#54690", "CYC");
        $ic2$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#12141", "CYC"), SubLObjectFactory.makeSymbol("S#39298", "CYC"), SubLObjectFactory.makeSymbol("S#11445", "CYC"), SubLObjectFactory.makeSymbol("S#54792", "CYC"), SubLObjectFactory.makeSymbol("S#54793", "CYC"), SubLObjectFactory.makeSymbol("S#54794", "CYC"), SubLObjectFactory.makeSymbol("S#54795", "CYC"), SubLObjectFactory.makeSymbol("S#33867", "CYC"), SubLObjectFactory.makeSymbol("S#54796", "CYC"), SubLObjectFactory.makeSymbol("S#54797", "CYC"), SubLObjectFactory.makeSymbol("S#54798", "CYC"), SubLObjectFactory.makeSymbol("S#54799", "CYC"), SubLObjectFactory.makeSymbol("S#5851", "CYC"), SubLObjectFactory.makeSymbol("S#3266", "CYC"), SubLObjectFactory.makeSymbol("S#54800", "CYC"), SubLObjectFactory.makeSymbol("S#6061", "CYC"), SubLObjectFactory.makeSymbol("S#54801", "CYC"), SubLObjectFactory.makeSymbol("S#38848", "CYC"), SubLObjectFactory.makeSymbol("S#54802", "CYC"), SubLObjectFactory.makeSymbol("S#54803", "CYC"), SubLObjectFactory.makeSymbol("S#54804", "CYC"), SubLObjectFactory.makeSymbol("S#54805", "CYC"), SubLObjectFactory.makeSymbol("S#54806", "CYC"), SubLObjectFactory.makeSymbol("S#39289", "CYC") });
        $ic3$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("TERM"), SubLObjectFactory.makeKeyword("PHRASE"), SubLObjectFactory.makeKeyword("MT"), SubLObjectFactory.makeKeyword("IS-PREFERRED?"), SubLObjectFactory.makeKeyword("IS-PROPER?"), SubLObjectFactory.makeKeyword("NONRELATIONAL?"), SubLObjectFactory.makeKeyword("PROPER-NAME-PRED"), SubLObjectFactory.makeKeyword("TEMPLATE"), SubLObjectFactory.makeKeyword("TEMPLATE-ARGS"), SubLObjectFactory.makeKeyword("IGNORE-ARITY?"), SubLObjectFactory.makeKeyword("HEADWORD-POSITION"), SubLObjectFactory.makeKeyword("HEADWORD-PART-OF-SPEECH"), SubLObjectFactory.makeKeyword("ERROR-MESSAGE"), SubLObjectFactory.makeKeyword("STATE"), SubLObjectFactory.makeKeyword("READY?"), SubLObjectFactory.makeKeyword("FORMULA"), SubLObjectFactory.makeKeyword("OTHER-FORMULAS"), SubLObjectFactory.makeKeyword("USER-ACTION"), SubLObjectFactory.makeKeyword("PARSE-TEMPLATE-MT"), SubLObjectFactory.makeKeyword("PARSE-TEMPLATE"), SubLObjectFactory.makeKeyword("PARSE-TEMPLATE-FORMULA"), SubLObjectFactory.makeKeyword("LEXICAL-MT"), SubLObjectFactory.makeKeyword("SYNTACTIC-MT"), SubLObjectFactory.makeKeyword("GENERATION-MT") });
        $ic4$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#54693", "CYC"), SubLObjectFactory.makeSymbol("S#54694", "CYC"), SubLObjectFactory.makeSymbol("S#54695", "CYC"), SubLObjectFactory.makeSymbol("S#54696", "CYC"), SubLObjectFactory.makeSymbol("S#54697", "CYC"), SubLObjectFactory.makeSymbol("S#54698", "CYC"), SubLObjectFactory.makeSymbol("S#54699", "CYC"), SubLObjectFactory.makeSymbol("S#54700", "CYC"), SubLObjectFactory.makeSymbol("S#54701", "CYC"), SubLObjectFactory.makeSymbol("S#54702", "CYC"), SubLObjectFactory.makeSymbol("S#54703", "CYC"), SubLObjectFactory.makeSymbol("S#54704", "CYC"), SubLObjectFactory.makeSymbol("S#54705", "CYC"), SubLObjectFactory.makeSymbol("S#54706", "CYC"), SubLObjectFactory.makeSymbol("S#54707", "CYC"), SubLObjectFactory.makeSymbol("S#54708", "CYC"), SubLObjectFactory.makeSymbol("S#54709", "CYC"), SubLObjectFactory.makeSymbol("S#54710", "CYC"), SubLObjectFactory.makeSymbol("S#54711", "CYC"), SubLObjectFactory.makeSymbol("S#54712", "CYC"), SubLObjectFactory.makeSymbol("S#54713", "CYC"), SubLObjectFactory.makeSymbol("S#54714", "CYC"), SubLObjectFactory.makeSymbol("S#54715", "CYC"), SubLObjectFactory.makeSymbol("S#54716", "CYC") });
        $ic5$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#54717", "CYC"), SubLObjectFactory.makeSymbol("S#54718", "CYC"), SubLObjectFactory.makeSymbol("S#54719", "CYC"), SubLObjectFactory.makeSymbol("S#54720", "CYC"), SubLObjectFactory.makeSymbol("S#54721", "CYC"), SubLObjectFactory.makeSymbol("S#54722", "CYC"), SubLObjectFactory.makeSymbol("S#54723", "CYC"), SubLObjectFactory.makeSymbol("S#54724", "CYC"), SubLObjectFactory.makeSymbol("S#54725", "CYC"), SubLObjectFactory.makeSymbol("S#54726", "CYC"), SubLObjectFactory.makeSymbol("S#54727", "CYC"), SubLObjectFactory.makeSymbol("S#54728", "CYC"), SubLObjectFactory.makeSymbol("S#54729", "CYC"), SubLObjectFactory.makeSymbol("S#54730", "CYC"), SubLObjectFactory.makeSymbol("S#54731", "CYC"), SubLObjectFactory.makeSymbol("S#54732", "CYC"), SubLObjectFactory.makeSymbol("S#54733", "CYC"), SubLObjectFactory.makeSymbol("S#54734", "CYC"), SubLObjectFactory.makeSymbol("S#54735", "CYC"), SubLObjectFactory.makeSymbol("S#54736", "CYC"), SubLObjectFactory.makeSymbol("S#54737", "CYC"), SubLObjectFactory.makeSymbol("S#54738", "CYC"), SubLObjectFactory.makeSymbol("S#54739", "CYC"), SubLObjectFactory.makeSymbol("S#54740", "CYC") });
        $ic6$ = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $ic7$ = SubLObjectFactory.makeInteger(21);
        $ic8$ = SubLObjectFactory.makeInteger(22);
        $ic9$ = SubLObjectFactory.makeInteger(23);
        $ic10$ = SubLObjectFactory.makeInteger(24);
        $ic11$ = SubLObjectFactory.makeInteger(25);
        $ic12$ = SubLObjectFactory.makeSymbol("S#54692", "CYC");
        $ic13$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#54690", "CYC"));
        $ic14$ = SubLObjectFactory.makeSymbol("S#54693", "CYC");
        $ic15$ = SubLObjectFactory.makeSymbol("S#54717", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("S#54694", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("S#54718", "CYC");
        $ic18$ = SubLObjectFactory.makeSymbol("S#54695", "CYC");
        $ic19$ = SubLObjectFactory.makeSymbol("S#54719", "CYC");
        $ic20$ = SubLObjectFactory.makeSymbol("S#54696", "CYC");
        $ic21$ = SubLObjectFactory.makeSymbol("S#54720", "CYC");
        $ic22$ = SubLObjectFactory.makeSymbol("S#54697", "CYC");
        $ic23$ = SubLObjectFactory.makeSymbol("S#54721", "CYC");
        $ic24$ = SubLObjectFactory.makeSymbol("S#54698", "CYC");
        $ic25$ = SubLObjectFactory.makeSymbol("S#54722", "CYC");
        $ic26$ = SubLObjectFactory.makeSymbol("S#54699", "CYC");
        $ic27$ = SubLObjectFactory.makeSymbol("S#54723", "CYC");
        $ic28$ = SubLObjectFactory.makeSymbol("S#54700", "CYC");
        $ic29$ = SubLObjectFactory.makeSymbol("S#54724", "CYC");
        $ic30$ = SubLObjectFactory.makeSymbol("S#54701", "CYC");
        $ic31$ = SubLObjectFactory.makeSymbol("S#54725", "CYC");
        $ic32$ = SubLObjectFactory.makeSymbol("S#54702", "CYC");
        $ic33$ = SubLObjectFactory.makeSymbol("S#54726", "CYC");
        $ic34$ = SubLObjectFactory.makeSymbol("S#54703", "CYC");
        $ic35$ = SubLObjectFactory.makeSymbol("S#54727", "CYC");
        $ic36$ = SubLObjectFactory.makeSymbol("S#54704", "CYC");
        $ic37$ = SubLObjectFactory.makeSymbol("S#54728", "CYC");
        $ic38$ = SubLObjectFactory.makeSymbol("S#54705", "CYC");
        $ic39$ = SubLObjectFactory.makeSymbol("S#54729", "CYC");
        $ic40$ = SubLObjectFactory.makeSymbol("S#54706", "CYC");
        $ic41$ = SubLObjectFactory.makeSymbol("S#54730", "CYC");
        $ic42$ = SubLObjectFactory.makeSymbol("S#54707", "CYC");
        $ic43$ = SubLObjectFactory.makeSymbol("S#54731", "CYC");
        $ic44$ = SubLObjectFactory.makeSymbol("S#54708", "CYC");
        $ic45$ = SubLObjectFactory.makeSymbol("S#54732", "CYC");
        $ic46$ = SubLObjectFactory.makeSymbol("S#54709", "CYC");
        $ic47$ = SubLObjectFactory.makeSymbol("S#54733", "CYC");
        $ic48$ = SubLObjectFactory.makeSymbol("S#54710", "CYC");
        $ic49$ = SubLObjectFactory.makeSymbol("S#54734", "CYC");
        $ic50$ = SubLObjectFactory.makeSymbol("S#54711", "CYC");
        $ic51$ = SubLObjectFactory.makeSymbol("S#54735", "CYC");
        $ic52$ = SubLObjectFactory.makeSymbol("S#54712", "CYC");
        $ic53$ = SubLObjectFactory.makeSymbol("S#54736", "CYC");
        $ic54$ = SubLObjectFactory.makeSymbol("S#54713", "CYC");
        $ic55$ = SubLObjectFactory.makeSymbol("S#54737", "CYC");
        $ic56$ = SubLObjectFactory.makeSymbol("S#54714", "CYC");
        $ic57$ = SubLObjectFactory.makeSymbol("S#54738", "CYC");
        $ic58$ = SubLObjectFactory.makeSymbol("S#54715", "CYC");
        $ic59$ = SubLObjectFactory.makeSymbol("S#54739", "CYC");
        $ic60$ = SubLObjectFactory.makeSymbol("S#54716", "CYC");
        $ic61$ = SubLObjectFactory.makeSymbol("S#54740", "CYC");
        $ic62$ = SubLObjectFactory.makeKeyword("TERM");
        $ic63$ = SubLObjectFactory.makeKeyword("PHRASE");
        $ic64$ = SubLObjectFactory.makeKeyword("MT");
        $ic65$ = SubLObjectFactory.makeKeyword("IS-PREFERRED?");
        $ic66$ = SubLObjectFactory.makeKeyword("IS-PROPER?");
        $ic67$ = SubLObjectFactory.makeKeyword("NONRELATIONAL?");
        $ic68$ = SubLObjectFactory.makeKeyword("PROPER-NAME-PRED");
        $ic69$ = SubLObjectFactory.makeKeyword("TEMPLATE");
        $ic70$ = SubLObjectFactory.makeKeyword("TEMPLATE-ARGS");
        $ic71$ = SubLObjectFactory.makeKeyword("IGNORE-ARITY?");
        $ic72$ = SubLObjectFactory.makeKeyword("HEADWORD-POSITION");
        $ic73$ = SubLObjectFactory.makeKeyword("HEADWORD-PART-OF-SPEECH");
        $ic74$ = SubLObjectFactory.makeKeyword("ERROR-MESSAGE");
        $ic75$ = SubLObjectFactory.makeKeyword("STATE");
        $ic76$ = SubLObjectFactory.makeKeyword("READY?");
        $ic77$ = SubLObjectFactory.makeKeyword("FORMULA");
        $ic78$ = SubLObjectFactory.makeKeyword("OTHER-FORMULAS");
        $ic79$ = SubLObjectFactory.makeKeyword("USER-ACTION");
        $ic80$ = SubLObjectFactory.makeKeyword("PARSE-TEMPLATE-MT");
        $ic81$ = SubLObjectFactory.makeKeyword("PARSE-TEMPLATE");
        $ic82$ = SubLObjectFactory.makeKeyword("PARSE-TEMPLATE-FORMULA");
        $ic83$ = SubLObjectFactory.makeKeyword("LEXICAL-MT");
        $ic84$ = SubLObjectFactory.makeKeyword("SYNTACTIC-MT");
        $ic85$ = SubLObjectFactory.makeKeyword("GENERATION-MT");
        $ic86$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic87$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic88$ = SubLObjectFactory.makeSymbol("S#54741", "CYC");
        $ic89$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic90$ = SubLObjectFactory.makeKeyword("END");
        $ic91$ = SubLObjectFactory.makeSymbol("S#54743", "CYC");
        $ic92$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOUN"), (SubLObject)SubLObjectFactory.makeKeyword("PROPER-NOUN"), (SubLObject)SubLObjectFactory.makeKeyword("VERB"), (SubLObject)SubLObjectFactory.makeKeyword("ADJECTIVE"), (SubLObject)SubLObjectFactory.makeKeyword("ADVERB"));
        $ic93$ = SubLObjectFactory.makeSymbol("S#54779", "CYC");
        $ic94$ = SubLObjectFactory.makeSymbol("S#54780", "CYC");
        $ic95$ = SubLObjectFactory.makeSymbol("S#54781", "CYC");
        $ic96$ = SubLObjectFactory.makeSymbol("S#54782", "CYC");
        $ic97$ = SubLObjectFactory.makeSymbol("S#54783", "CYC");
        $ic98$ = SubLObjectFactory.makeString("nameString");
        $ic99$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("denotation"));
        $ic100$ = SubLObjectFactory.makeSymbol("S#54786", "CYC");
        $ic101$ = SubLObjectFactory.makeSymbol("S#54789", "CYC");
        $ic102$ = SubLObjectFactory.makeString("Warning: ");
        $ic103$ = SubLObjectFactory.makeString("Object hash table not initialized");
        $ic104$ = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $ic105$ = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic106$ = SubLObjectFactory.makeString("(");
        $ic107$ = SubLObjectFactory.makeString(")");
        $ic108$ = ConsesLow.list((SubLObject)Characters.CHAR_null, (SubLObject)Characters.CHAR_tilde, (SubLObject)Characters.CHAR_percent);
        $ic109$ = SubLObjectFactory.makeString("First");
        $ic110$ = SubLObjectFactory.makeString("Last");
        $ic111$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("compoundString"));
        $ic112$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("multiWordString"));
        $ic113$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("headMedialString"));
        $ic114$ = SubLObjectFactory.makeString("Unable to map headword ~s in part-of-speech ~s");
        $ic115$ = SubLObjectFactory.makeString("Unexpected lexification error");
        $ic116$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("EnglishWord"));
        $ic117$ = SubLObjectFactory.makeSymbol("KE-CREATE-NOW");
        $ic118$ = SubLObjectFactory.makeSymbol("S#54623", "CYC");
        $ic119$ = SubLObjectFactory.makeSymbol("S#40663", "CYC");
        $ic120$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SIMPLE-NOUN"), (SubLObject)SubLObjectFactory.makeKeyword("VERB"));
        $ic121$ = SubLObjectFactory.makeString("*** assertion failed: ~a ***~%");
        $ic122$ = SubLObjectFactory.makeSymbol("S#54807", "CYC");
        $ic123$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic124$ = SubLObjectFactory.makeString("");
        $ic125$ = SubLObjectFactory.makeString("Missing lexification phrase");
        $ic126$ = SubLObjectFactory.makeString("Invalid headword specification");
        $ic127$ = SubLObjectFactory.makeString("Missing part of speech");
        $ic128$ = SubLObjectFactory.makeKeyword("PRECISE");
        $ic129$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genStringAssertion-Precise"));
        $ic130$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genStringAssertion"));
        $ic131$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ist"));
        $ic132$ = SubLObjectFactory.makeSymbol("KE-UNASSERT-ASSERTION-NOW");
        $ic133$ = SubLObjectFactory.makeSymbol("S#37047", "CYC");
        $ic134$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic135$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic136$ = SubLObjectFactory.makeKeyword("GAF");
        $ic137$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic138$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genFormat"));
        $ic139$ = SubLObjectFactory.makeKeyword("FRESH");
        $ic140$ = SubLObjectFactory.makeString("Lexification parameters:~%~S~%");
        $ic141$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CycLReifiableDenotationalTerm"));
        $ic142$ = SubLObjectFactory.makeSymbol("FORT-FOR-STRING");
        $ic143$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("CountNoun"), (SubLObject)SubLObjectFactory.makeString("MassNoun"), (SubLObject)SubLObjectFactory.makeString("Verb"));
        $ic144$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("properNameStrings"));
        $ic145$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ProperNamePredicate-Strict"));
        $ic146$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("properNameStrings")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("preferredNameString")));
        $ic147$ = SubLObjectFactory.makeSymbol("S#54637", "CYC");
        $ic148$ = SubLObjectFactory.makeSymbol("S#54571", "CYC");
        $ic149$ = SubLObjectFactory.makeSymbol("STRING<");
        $ic150$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TemplateParsingMt"));
        $ic151$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("LexicalMicrotheory"));
        $ic152$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $ic153$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("LexicalMicrotheory-NonLexWiz"));
    }
    
    public static final class $sX54689_native extends SubLStructNative
    {
        public SubLObject $term;
        public SubLObject $phrase;
        public SubLObject $mt;
        public SubLObject $is_preferredP;
        public SubLObject $is_properP;
        public SubLObject $nonrelationalP;
        public SubLObject $proper_name_pred;
        public SubLObject $template;
        public SubLObject $template_args;
        public SubLObject $ignore_arityP;
        public SubLObject $headword_position;
        public SubLObject $headword_part_of_speech;
        public SubLObject $error_message;
        public SubLObject $state;
        public SubLObject $readyP;
        public SubLObject $formula;
        public SubLObject $other_formulas;
        public SubLObject $user_action;
        public SubLObject $parse_template_mt;
        public SubLObject $parse_template;
        public SubLObject $parse_template_formula;
        public SubLObject $lexical_mt;
        public SubLObject $syntactic_mt;
        public SubLObject $generation_mt;
        private static final SubLStructDeclNative structDecl;
        
        public $sX54689_native() {
            this.$term = (SubLObject)CommonSymbols.NIL;
            this.$phrase = (SubLObject)CommonSymbols.NIL;
            this.$mt = (SubLObject)CommonSymbols.NIL;
            this.$is_preferredP = (SubLObject)CommonSymbols.NIL;
            this.$is_properP = (SubLObject)CommonSymbols.NIL;
            this.$nonrelationalP = (SubLObject)CommonSymbols.NIL;
            this.$proper_name_pred = (SubLObject)CommonSymbols.NIL;
            this.$template = (SubLObject)CommonSymbols.NIL;
            this.$template_args = (SubLObject)CommonSymbols.NIL;
            this.$ignore_arityP = (SubLObject)CommonSymbols.NIL;
            this.$headword_position = (SubLObject)CommonSymbols.NIL;
            this.$headword_part_of_speech = (SubLObject)CommonSymbols.NIL;
            this.$error_message = (SubLObject)CommonSymbols.NIL;
            this.$state = (SubLObject)CommonSymbols.NIL;
            this.$readyP = (SubLObject)CommonSymbols.NIL;
            this.$formula = (SubLObject)CommonSymbols.NIL;
            this.$other_formulas = (SubLObject)CommonSymbols.NIL;
            this.$user_action = (SubLObject)CommonSymbols.NIL;
            this.$parse_template_mt = (SubLObject)CommonSymbols.NIL;
            this.$parse_template = (SubLObject)CommonSymbols.NIL;
            this.$parse_template_formula = (SubLObject)CommonSymbols.NIL;
            this.$lexical_mt = (SubLObject)CommonSymbols.NIL;
            this.$syntactic_mt = (SubLObject)CommonSymbols.NIL;
            this.$generation_mt = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX54689_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$term;
        }
        
        public SubLObject getField3() {
            return this.$phrase;
        }
        
        public SubLObject getField4() {
            return this.$mt;
        }
        
        public SubLObject getField5() {
            return this.$is_preferredP;
        }
        
        public SubLObject getField6() {
            return this.$is_properP;
        }
        
        public SubLObject getField7() {
            return this.$nonrelationalP;
        }
        
        public SubLObject getField8() {
            return this.$proper_name_pred;
        }
        
        public SubLObject getField9() {
            return this.$template;
        }
        
        public SubLObject getField10() {
            return this.$template_args;
        }
        
        public SubLObject getField11() {
            return this.$ignore_arityP;
        }
        
        public SubLObject getField12() {
            return this.$headword_position;
        }
        
        public SubLObject getField13() {
            return this.$headword_part_of_speech;
        }
        
        public SubLObject getField14() {
            return this.$error_message;
        }
        
        public SubLObject getField15() {
            return this.$state;
        }
        
        public SubLObject getField16() {
            return this.$readyP;
        }
        
        public SubLObject getField17() {
            return this.$formula;
        }
        
        public SubLObject getField18() {
            return this.$other_formulas;
        }
        
        public SubLObject getField19() {
            return this.$user_action;
        }
        
        public SubLObject getField20() {
            return this.$parse_template_mt;
        }
        
        public SubLObject getField21() {
            return this.$parse_template;
        }
        
        public SubLObject getField22() {
            return this.$parse_template_formula;
        }
        
        public SubLObject getField23() {
            return this.$lexical_mt;
        }
        
        public SubLObject getField24() {
            return this.$syntactic_mt;
        }
        
        public SubLObject getField25() {
            return this.$generation_mt;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$term = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$phrase = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$mt = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$is_preferredP = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$is_properP = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$nonrelationalP = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$proper_name_pred = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$template = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$template_args = value;
        }
        
        public SubLObject setField11(final SubLObject value) {
            return this.$ignore_arityP = value;
        }
        
        public SubLObject setField12(final SubLObject value) {
            return this.$headword_position = value;
        }
        
        public SubLObject setField13(final SubLObject value) {
            return this.$headword_part_of_speech = value;
        }
        
        public SubLObject setField14(final SubLObject value) {
            return this.$error_message = value;
        }
        
        public SubLObject setField15(final SubLObject value) {
            return this.$state = value;
        }
        
        public SubLObject setField16(final SubLObject value) {
            return this.$readyP = value;
        }
        
        public SubLObject setField17(final SubLObject value) {
            return this.$formula = value;
        }
        
        public SubLObject setField18(final SubLObject value) {
            return this.$other_formulas = value;
        }
        
        public SubLObject setField19(final SubLObject value) {
            return this.$user_action = value;
        }
        
        public SubLObject setField20(final SubLObject value) {
            return this.$parse_template_mt = value;
        }
        
        public SubLObject setField21(final SubLObject value) {
            return this.$parse_template = value;
        }
        
        public SubLObject setField22(final SubLObject value) {
            return this.$parse_template_formula = value;
        }
        
        public SubLObject setField23(final SubLObject value) {
            return this.$lexical_mt = value;
        }
        
        public SubLObject setField24(final SubLObject value) {
            return this.$syntactic_mt = value;
        }
        
        public SubLObject setField25(final SubLObject value) {
            return this.$generation_mt = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX54689_native.class, module0778.$ic0$, module0778.$ic1$, module0778.$ic2$, module0778.$ic3$, new String[] { "$term", "$phrase", "$mt", "$is_preferredP", "$is_properP", "$nonrelationalP", "$proper_name_pred", "$template", "$template_args", "$ignore_arityP", "$headword_position", "$headword_part_of_speech", "$error_message", "$state", "$readyP", "$formula", "$other_formulas", "$user_action", "$parse_template_mt", "$parse_template", "$parse_template_formula", "$lexical_mt", "$syntactic_mt", "$generation_mt" }, module0778.$ic4$, module0778.$ic5$, module0778.$ic6$);
        }
    }
    
    public static final class $f50149$UnaryFunction extends UnaryFunction
    {
        public $f50149$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#54690"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0778.f50149(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0778.class
	Total time: 482 ms
	
	Decompiled with Procyon 0.5.32.
*/