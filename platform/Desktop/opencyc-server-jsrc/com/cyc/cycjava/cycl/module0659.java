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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0659 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0659";
    public static final String myFingerPrint = "d29731d1c7bed7f77c033c26713c3f64e9c62cee1c5afed6997ac109d91979ec";
    private static SubLSymbol $g5189$;
    private static SubLSymbol $g5190$;
    private static SubLSymbol $g5191$;
    private static SubLSymbol $g5192$;
    private static SubLSymbol $g5193$;
    private static SubLSymbol $g5194$;
    private static SubLSymbol $g5195$;
    public static SubLSymbol $g5196$;
    public static SubLSymbol $g5197$;
    public static SubLSymbol $g5198$;
    private static final SubLSymbol $ic0$;
    private static final SubLList $ic1$;
    private static final SubLString $ic2$;
    private static final SubLString $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLList $ic8$;
    private static final SubLList $ic9$;
    private static final SubLList $ic10$;
    private static final SubLList $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLList $ic14$;
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
    private static final SubLString $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLList $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLList $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLList $ic77$;
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
    private static final SubLString $ic88$;
    private static final SubLString $ic89$;
    private static final SubLString $ic90$;
    private static final SubLString $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLString $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLString $ic98$;
    private static final SubLList $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLList $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLString $ic104$;
    private static final SubLList $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLString $ic108$;
    private static final SubLList $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLObject $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLString $ic113$;
    private static final SubLList $ic114$;
    private static final SubLSymbol $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLString $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLString $ic119$;
    private static final SubLList $ic120$;
    private static final SubLSymbol $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLString $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLString $ic125$;
    private static final SubLList $ic126$;
    private static final SubLSymbol $ic127$;
    private static final SubLSymbol $ic128$;
    private static final SubLString $ic129$;
    private static final SubLString $ic130$;
    private static final SubLSymbol $ic131$;
    private static final SubLString $ic132$;
    private static final SubLSymbol $ic133$;
    private static final SubLString $ic134$;
    private static final SubLSymbol $ic135$;
    private static final SubLSymbol $ic136$;
    private static final SubLSymbol $ic137$;
    private static final SubLSymbol $ic138$;
    private static final SubLList $ic139$;
    private static final SubLSymbol $ic140$;
    private static final SubLSymbol $ic141$;
    private static final SubLList $ic142$;
    private static final SubLSymbol $ic143$;
    private static final SubLSymbol $ic144$;
    private static final SubLList $ic145$;
    private static final SubLSymbol $ic146$;
    private static final SubLString $ic147$;
    private static final SubLSymbol $ic148$;
    private static final SubLString $ic149$;
    private static final SubLSymbol $ic150$;
    private static final SubLString $ic151$;
    private static final SubLList $ic152$;
    private static final SubLSymbol $ic153$;
    private static final SubLSymbol $ic154$;
    private static final SubLString $ic155$;
    private static final SubLList $ic156$;
    private static final SubLSymbol $ic157$;
    private static final SubLSymbol $ic158$;
    private static final SubLSymbol $ic159$;
    private static final SubLString $ic160$;
    private static final SubLList $ic161$;
    private static final SubLString $ic162$;
    private static final SubLString $ic163$;
    private static final SubLString $ic164$;
    private static final SubLSymbol $ic165$;
    private static final SubLString $ic166$;
    private static final SubLString $ic167$;
    private static final SubLSymbol $ic168$;
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
    private static final SubLSymbol $ic181$;
    private static final SubLString $ic182$;
    private static final SubLString $ic183$;
    private static final SubLSymbol $ic184$;
    private static final SubLString $ic185$;
    private static final SubLString $ic186$;
    private static final SubLString $ic187$;
    private static final SubLString $ic188$;
    private static final SubLString $ic189$;
    private static final SubLString $ic190$;
    private static final SubLString $ic191$;
    private static final SubLSymbol $ic192$;
    private static final SubLString $ic193$;
    private static final SubLString $ic194$;
    private static final SubLString $ic195$;
    private static final SubLString $ic196$;
    private static final SubLString $ic197$;
    private static final SubLSymbol $ic198$;
    private static final SubLSymbol $ic199$;
    private static final SubLString $ic200$;
    private static final SubLString $ic201$;
    private static final SubLString $ic202$;
    private static final SubLSymbol $ic203$;
    private static final SubLString $ic204$;
    private static final SubLString $ic205$;
    private static final SubLSymbol $ic206$;
    private static final SubLSymbol $ic207$;
    private static final SubLString $ic208$;
    
    
    public static SubLObject f40063(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0659.NIL != module0178.f11284(var1) && module0659.NIL != module0269.f17754(module0178.f11332(var1)));
    }
    
    public static SubLObject f40064(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0659.NIL != module0178.f11284(var1) && module0659.NIL != module0226.f14802(module0178.f11332(var1)));
    }
    
    public static SubLObject f40065(final SubLObject var2, final SubLObject var3, final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        if (module0659.NIL != print_high.$print_level$.getDynamicValue(var5) && var4.numG(print_high.$print_level$.getDynamicValue(var5))) {
            print_high.princ((SubLObject)module0659.$ic2$, var3);
        }
        else if (module0659.NIL != print_high.$print_readably$.getDynamicValue(var5)) {
            print_high.print_not_readable(var2, var3);
        }
        else {
            streams_high.write_string((SubLObject)module0659.$ic3$, var3, (SubLObject)module0659.UNPROVIDED, (SubLObject)module0659.UNPROVIDED);
            PrintLow.write((SubLObject)Types.type_of(var2), new SubLObject[] { module0659.$ic4$, var3 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var3);
            print_high.princ(f40066(var2), var3);
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var3);
        }
        return var2;
    }
    
    public static SubLObject f40067(final SubLObject var10, final SubLObject var3) {
        f40065(var10, var3, (SubLObject)module0659.ZERO_INTEGER);
        return (SubLObject)module0659.NIL;
    }
    
    public static SubLObject f40068(final SubLObject var10) {
        return (SubLObject)((var10.getClass() == $sX44077_native.class) ? module0659.T : module0659.NIL);
    }
    
    public static SubLObject f40066(final SubLObject var10) {
        assert module0659.NIL != f40068(var10) : var10;
        return var10.getField2();
    }
    
    public static SubLObject f40069(final SubLObject var10) {
        assert module0659.NIL != f40068(var10) : var10;
        return var10.getField3();
    }
    
    public static SubLObject f40070(final SubLObject var10) {
        assert module0659.NIL != f40068(var10) : var10;
        return var10.getField4();
    }
    
    public static SubLObject f40071(final SubLObject var10) {
        assert module0659.NIL != f40068(var10) : var10;
        return var10.getField5();
    }
    
    public static SubLObject f40072(final SubLObject var10) {
        assert module0659.NIL != f40068(var10) : var10;
        return var10.getField6();
    }
    
    public static SubLObject f40073(final SubLObject var10) {
        assert module0659.NIL != f40068(var10) : var10;
        return var10.getField7();
    }
    
    public static SubLObject f40074(final SubLObject var10) {
        assert module0659.NIL != f40068(var10) : var10;
        return var10.getField8();
    }
    
    public static SubLObject f40075(final SubLObject var10) {
        assert module0659.NIL != f40068(var10) : var10;
        return var10.getField9();
    }
    
    public static SubLObject f40076(final SubLObject var10) {
        assert module0659.NIL != f40068(var10) : var10;
        return var10.getField10();
    }
    
    public static SubLObject f40077(final SubLObject var10) {
        assert module0659.NIL != f40068(var10) : var10;
        return var10.getField11();
    }
    
    public static SubLObject f40078(final SubLObject var10) {
        assert module0659.NIL != f40068(var10) : var10;
        return var10.getField12();
    }
    
    public static SubLObject f40079(final SubLObject var10) {
        assert module0659.NIL != f40068(var10) : var10;
        return var10.getField13();
    }
    
    public static SubLObject f40080(final SubLObject var10) {
        assert module0659.NIL != f40068(var10) : var10;
        return var10.getField14();
    }
    
    public static SubLObject f40081(final SubLObject var10) {
        assert module0659.NIL != f40068(var10) : var10;
        return var10.getField15();
    }
    
    public static SubLObject f40082(final SubLObject var10) {
        assert module0659.NIL != f40068(var10) : var10;
        return var10.getField16();
    }
    
    public static SubLObject f40083(final SubLObject var10, final SubLObject var12) {
        assert module0659.NIL != f40068(var10) : var10;
        return var10.setField2(var12);
    }
    
    public static SubLObject f40084(final SubLObject var10, final SubLObject var12) {
        assert module0659.NIL != f40068(var10) : var10;
        return var10.setField3(var12);
    }
    
    public static SubLObject f40085(final SubLObject var10, final SubLObject var12) {
        assert module0659.NIL != f40068(var10) : var10;
        return var10.setField4(var12);
    }
    
    public static SubLObject f40086(final SubLObject var10, final SubLObject var12) {
        assert module0659.NIL != f40068(var10) : var10;
        return var10.setField5(var12);
    }
    
    public static SubLObject f40087(final SubLObject var10, final SubLObject var12) {
        assert module0659.NIL != f40068(var10) : var10;
        return var10.setField6(var12);
    }
    
    public static SubLObject f40088(final SubLObject var10, final SubLObject var12) {
        assert module0659.NIL != f40068(var10) : var10;
        return var10.setField7(var12);
    }
    
    public static SubLObject f40089(final SubLObject var10, final SubLObject var12) {
        assert module0659.NIL != f40068(var10) : var10;
        return var10.setField8(var12);
    }
    
    public static SubLObject f40090(final SubLObject var10, final SubLObject var12) {
        assert module0659.NIL != f40068(var10) : var10;
        return var10.setField9(var12);
    }
    
    public static SubLObject f40091(final SubLObject var10, final SubLObject var12) {
        assert module0659.NIL != f40068(var10) : var10;
        return var10.setField10(var12);
    }
    
    public static SubLObject f40092(final SubLObject var10, final SubLObject var12) {
        assert module0659.NIL != f40068(var10) : var10;
        return var10.setField11(var12);
    }
    
    public static SubLObject f40093(final SubLObject var10, final SubLObject var12) {
        assert module0659.NIL != f40068(var10) : var10;
        return var10.setField12(var12);
    }
    
    public static SubLObject f40094(final SubLObject var10, final SubLObject var12) {
        assert module0659.NIL != f40068(var10) : var10;
        return var10.setField13(var12);
    }
    
    public static SubLObject f40095(final SubLObject var10, final SubLObject var12) {
        assert module0659.NIL != f40068(var10) : var10;
        return var10.setField14(var12);
    }
    
    public static SubLObject f40096(final SubLObject var10, final SubLObject var12) {
        assert module0659.NIL != f40068(var10) : var10;
        return var10.setField15(var12);
    }
    
    public static SubLObject f40097(final SubLObject var10, final SubLObject var12) {
        assert module0659.NIL != f40068(var10) : var10;
        return var10.setField16(var12);
    }
    
    public static SubLObject f40098(SubLObject var13) {
        if (var13 == module0659.UNPROVIDED) {
            var13 = (SubLObject)module0659.NIL;
        }
        final SubLObject var14 = (SubLObject)new $sX44077_native();
        SubLObject var15;
        SubLObject var16;
        SubLObject var17;
        SubLObject var18;
        for (var15 = (SubLObject)module0659.NIL, var15 = var13; module0659.NIL != var15; var15 = conses_high.cddr(var15)) {
            var16 = var15.first();
            var17 = conses_high.cadr(var15);
            var18 = var16;
            if (var18.eql((SubLObject)module0659.$ic45$)) {
                f40083(var14, var17);
            }
            else if (var18.eql((SubLObject)module0659.$ic46$)) {
                f40084(var14, var17);
            }
            else if (var18.eql((SubLObject)module0659.$ic47$)) {
                f40085(var14, var17);
            }
            else if (var18.eql((SubLObject)module0659.$ic48$)) {
                f40086(var14, var17);
            }
            else if (var18.eql((SubLObject)module0659.$ic49$)) {
                f40087(var14, var17);
            }
            else if (var18.eql((SubLObject)module0659.$ic50$)) {
                f40088(var14, var17);
            }
            else if (var18.eql((SubLObject)module0659.$ic51$)) {
                f40089(var14, var17);
            }
            else if (var18.eql((SubLObject)module0659.$ic52$)) {
                f40090(var14, var17);
            }
            else if (var18.eql((SubLObject)module0659.$ic53$)) {
                f40091(var14, var17);
            }
            else if (var18.eql((SubLObject)module0659.$ic54$)) {
                f40092(var14, var17);
            }
            else if (var18.eql((SubLObject)module0659.$ic55$)) {
                f40093(var14, var17);
            }
            else if (var18.eql((SubLObject)module0659.$ic56$)) {
                f40094(var14, var17);
            }
            else if (var18.eql((SubLObject)module0659.$ic57$)) {
                f40095(var14, var17);
            }
            else if (var18.eql((SubLObject)module0659.$ic58$)) {
                f40096(var14, var17);
            }
            else if (var18.eql((SubLObject)module0659.$ic59$)) {
                f40097(var14, var17);
            }
            else {
                Errors.error((SubLObject)module0659.$ic60$, var16);
            }
        }
        return var14;
    }
    
    public static SubLObject f40099(final SubLObject var19, final SubLObject var20) {
        Functions.funcall(var20, var19, (SubLObject)module0659.$ic61$, (SubLObject)module0659.$ic62$, (SubLObject)module0659.FIFTEEN_INTEGER);
        Functions.funcall(var20, var19, (SubLObject)module0659.$ic63$, (SubLObject)module0659.$ic45$, f40066(var19));
        Functions.funcall(var20, var19, (SubLObject)module0659.$ic63$, (SubLObject)module0659.$ic46$, f40069(var19));
        Functions.funcall(var20, var19, (SubLObject)module0659.$ic63$, (SubLObject)module0659.$ic47$, f40070(var19));
        Functions.funcall(var20, var19, (SubLObject)module0659.$ic63$, (SubLObject)module0659.$ic48$, f40071(var19));
        Functions.funcall(var20, var19, (SubLObject)module0659.$ic63$, (SubLObject)module0659.$ic49$, f40072(var19));
        Functions.funcall(var20, var19, (SubLObject)module0659.$ic63$, (SubLObject)module0659.$ic50$, f40073(var19));
        Functions.funcall(var20, var19, (SubLObject)module0659.$ic63$, (SubLObject)module0659.$ic51$, f40074(var19));
        Functions.funcall(var20, var19, (SubLObject)module0659.$ic63$, (SubLObject)module0659.$ic52$, f40075(var19));
        Functions.funcall(var20, var19, (SubLObject)module0659.$ic63$, (SubLObject)module0659.$ic53$, f40076(var19));
        Functions.funcall(var20, var19, (SubLObject)module0659.$ic63$, (SubLObject)module0659.$ic54$, f40077(var19));
        Functions.funcall(var20, var19, (SubLObject)module0659.$ic63$, (SubLObject)module0659.$ic55$, f40078(var19));
        Functions.funcall(var20, var19, (SubLObject)module0659.$ic63$, (SubLObject)module0659.$ic56$, f40079(var19));
        Functions.funcall(var20, var19, (SubLObject)module0659.$ic63$, (SubLObject)module0659.$ic57$, f40080(var19));
        Functions.funcall(var20, var19, (SubLObject)module0659.$ic63$, (SubLObject)module0659.$ic58$, f40081(var19));
        Functions.funcall(var20, var19, (SubLObject)module0659.$ic63$, (SubLObject)module0659.$ic59$, f40082(var19));
        Functions.funcall(var20, var19, (SubLObject)module0659.$ic64$, (SubLObject)module0659.$ic62$, (SubLObject)module0659.FIFTEEN_INTEGER);
        return var19;
    }
    
    public static SubLObject f40100(final SubLObject var19, final SubLObject var20) {
        return f40099(var19, var20);
    }
    
    public static SubLObject f40101(final SubLObject var21, SubLObject var22) {
        if (var22 == module0659.UNPROVIDED) {
            var22 = module0659.$g5194$.getDynamicValue();
        }
        if (module0659.NIL != var22) {
            if (f40069(var21).eql(var22) && module0659.NIL != f40102(var21)) {
                return (SubLObject)ConsesLow.list(var21);
            }
        }
        else if (module0659.NIL != f40102(var21)) {
            return (SubLObject)ConsesLow.list(var21);
        }
        return (SubLObject)module0659.NIL;
    }
    
    public static SubLObject f40102(final SubLObject var21) {
        final SubLObject var22 = f40070(var21);
        if (var22.isFunctionSpec()) {
            return Functions.funcall(var22);
        }
        return var22;
    }
    
    public static SubLObject f40103(final SubLObject var24, SubLObject var25) {
        if (var25 == module0659.UNPROVIDED) {
            var25 = (SubLObject)module0659.T;
        }
        final SubLObject var26 = f40104(var24);
        if (module0659.NIL != var26) {
            f40085(var26, var25);
            return var25;
        }
        return (SubLObject)module0659.NIL;
    }
    
    public static SubLObject f40105(final SubLObject var26, final SubLObject var27) {
        SubLObject var29;
        final SubLObject var28 = var29 = var26.rest();
        SubLObject var30 = (SubLObject)module0659.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var29, var28, (SubLObject)module0659.$ic67$);
        var30 = var29.first();
        final SubLObject var31;
        var29 = (var31 = var29.rest());
        final SubLObject var32 = (SubLObject)module0659.$ic68$;
        final SubLObject var33 = (SubLObject)module0659.$ic69$;
        return (SubLObject)ConsesLow.list((SubLObject)module0659.$ic70$, (SubLObject)ConsesLow.list(reader.bq_cons(var32, (SubLObject)module0659.$ic71$), (SubLObject)ConsesLow.list(var33, (SubLObject)ConsesLow.list((SubLObject)module0659.$ic62$, (SubLObject)ConsesLow.list((SubLObject)module0659.$ic72$, var31)))), (SubLObject)ConsesLow.list((SubLObject)module0659.$ic73$, (SubLObject)ConsesLow.list((SubLObject)module0659.$ic15$, var33), (SubLObject)ConsesLow.list((SubLObject)module0659.$ic72$, var30)), (SubLObject)ConsesLow.list((SubLObject)module0659.$ic74$, (SubLObject)module0659.$ic66$, (SubLObject)ConsesLow.list((SubLObject)module0659.$ic75$, var33, (SubLObject)ConsesLow.listS((SubLObject)module0659.$ic76$, (SubLObject)ConsesLow.list((SubLObject)module0659.$ic72$, var30), var32, (SubLObject)module0659.$ic77$))));
    }
    
    public static SubLObject f40104(final SubLObject var30) {
        return Sequences.find(var30, module0659.$g5197$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0659.EQUAL), Symbols.symbol_function((SubLObject)module0659.$ic15$), (SubLObject)module0659.UNPROVIDED, (SubLObject)module0659.UNPROVIDED);
    }
    
    public static SubLObject f40106(final SubLObject var22) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        SubLObject var24 = (SubLObject)module0659.NIL;
        final SubLObject var25 = module0659.$g5194$.currentBinding(var23);
        try {
            module0659.$g5194$.bind(var22, var23);
            var24 = Mapping.mapcan(Symbols.symbol_function((SubLObject)module0659.$ic78$), module0659.$g5197$.getGlobalValue(), module0659.EMPTY_SUBL_OBJECT_ARRAY);
        }
        finally {
            module0659.$g5194$.rebind(var25, var23);
        }
        return var24;
    }
    
    public static SubLObject f40107(final SubLObject var22, final SubLObject var36) {
        if (var22.eql((SubLObject)module0659.$ic79$)) {
            return module0174.f11025(var36);
        }
        if (var22.eql((SubLObject)module0659.$ic80$)) {
            return module0184.f11649(var36);
        }
        if (var22.eql((SubLObject)module0659.$ic81$)) {
            return module0166.f10743(var36);
        }
        if (var22.eql((SubLObject)module0659.$ic82$) || var22.eql((SubLObject)module0659.$ic83$) || var22.eql((SubLObject)module0659.$ic84$) || var22.eql((SubLObject)module0659.$ic85$)) {
            return module0656.f39842(var36);
        }
        if (var22.eql((SubLObject)module0659.$ic86$)) {
            return module0656.f39932(var36);
        }
        return module0656.f39932(var36);
    }
    
    public static SubLObject f40108(final SubLObject var21, final SubLObject var36, SubLObject var37, SubLObject var38) {
        if (var37 == module0659.UNPROVIDED) {
            var37 = (SubLObject)module0659.NIL;
        }
        if (var38 == module0659.UNPROVIDED) {
            var38 = (SubLObject)module0659.NIL;
        }
        final SubLObject var39 = f40073(var21);
        if (module0659.NIL == var39 || var39.isString()) {
            return var39;
        }
        if (module0659.NIL != var37) {
            return Functions.funcall(f40073(var21), var36, var37, var38);
        }
        return Functions.funcall(f40073(var21), var36);
    }
    
    public static SubLObject f40109(final SubLObject var21, final SubLObject var22, final SubLObject var36, final SubLObject var37, final SubLObject var38, final SubLObject var40) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        SubLObject var42 = f40078(var21);
        final SubLObject var43 = f40107(var22, var36);
        final SubLObject var44 = f40071(var21);
        final SubLObject var45 = f40108(var21, var36, var37, var38);
        if (module0659.$g5189$.getDynamicValue(var41).eql((SubLObject)module0659.$ic87$)) {
            var42 = Sequences.cconcatenate((SubLObject)module0659.$ic88$, var42);
        }
        SubLObject var46 = PrintLow.format((SubLObject)module0659.NIL, (SubLObject)module0659.$ic89$, var42, var43);
        final SubLObject var47 = f40082(var21);
        if (module0659.NIL != var37) {
            if (module0659.NIL != var40) {
                var46 = PrintLow.format((SubLObject)module0659.NIL, (SubLObject)module0659.$ic90$, new SubLObject[] { var46, var37, module0656.f39842(var38), module0656.f39842(var40) });
            }
            else {
                var46 = PrintLow.format((SubLObject)module0659.NIL, (SubLObject)module0659.$ic91$, new SubLObject[] { var46, var37, module0656.f39842(var38) });
            }
        }
        if (module0659.NIL != var44) {
            final SubLObject var48 = f40110(var44, var21, var36, var37, var38);
            final SubLObject var49 = module0656.f39832(module0659.$g5189$.getDynamicValue(var41));
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
            module0655.f39768();
            module0642.f39019(var46);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
            if (module0659.NIL != var47) {
                module0642.f39020(module0015.$g386$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                module0642.f39020(var47);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
            }
            if (module0659.NIL != var49) {
                module0642.f39020(module0015.$g387$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                module0642.f39020(var49);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0659.UNPROVIDED);
            final SubLObject var50 = module0015.$g533$.currentBinding(var41);
            try {
                module0015.$g533$.bind((SubLObject)module0659.T, var41);
                module0642.f39090(var48, var45, (SubLObject)module0659.$ic92$, (SubLObject)module0659.UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var50, var41);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
        }
        else {
            final SubLObject var51 = module0656.f39832(module0659.$g5189$.getDynamicValue(var41));
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
            module0655.f39768();
            module0642.f39019(var46);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
            if (module0659.NIL != var47) {
                module0642.f39020(module0015.$g386$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                module0642.f39020(var47);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
            }
            if (module0659.NIL != var51) {
                module0642.f39020(module0015.$g387$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                module0642.f39020(var51);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0659.UNPROVIDED);
            final SubLObject var52 = module0015.$g533$.currentBinding(var41);
            try {
                module0015.$g533$.bind((SubLObject)module0659.T, var41);
                final SubLObject var53 = f40075(var21);
                module0642.f39020(module0015.$g219$.getGlobalValue());
                if (module0659.NIL != var53) {
                    module0642.f39020(module0015.$g222$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                    module0642.f39020(module0642.f39042(var53));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0659.UNPROVIDED);
                final SubLObject var35_50 = module0015.$g533$.currentBinding(var41);
                try {
                    module0015.$g533$.bind((SubLObject)module0659.T, var41);
                    module0642.f39019(f40076(var21));
                }
                finally {
                    module0015.$g533$.rebind(var35_50, var41);
                }
                module0642.f39020(module0015.$g220$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var52, var41);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
        }
        return var36;
    }
    
    public static SubLObject f40111(final SubLObject var21, SubLObject var22, SubLObject var36, SubLObject var37, SubLObject var38, SubLObject var40) {
        if (var22 == module0659.UNPROVIDED) {
            var22 = (SubLObject)module0659.NIL;
        }
        if (var36 == module0659.UNPROVIDED) {
            var36 = (SubLObject)module0659.NIL;
        }
        if (var37 == module0659.UNPROVIDED) {
            var37 = (SubLObject)module0659.NIL;
        }
        if (var38 == module0659.UNPROVIDED) {
            var38 = (SubLObject)module0659.NIL;
        }
        if (var40 == module0659.UNPROVIDED) {
            var40 = (SubLObject)module0659.NIL;
        }
        final SubLObject var41 = f40110(f40072(var21), var21, var36, var37, var38);
        module0642.f39090(var41, f40108(var21, var36, var37, var38), (SubLObject)module0659.$ic87$, (SubLObject)module0659.UNPROVIDED);
        return (SubLObject)module0659.NIL;
    }
    
    public static SubLObject f40112(final SubLObject var21, SubLObject var22, SubLObject var36, SubLObject var37, SubLObject var38, SubLObject var40) {
        if (var22 == module0659.UNPROVIDED) {
            var22 = (SubLObject)module0659.NIL;
        }
        if (var36 == module0659.UNPROVIDED) {
            var36 = (SubLObject)module0659.NIL;
        }
        if (var37 == module0659.UNPROVIDED) {
            var37 = (SubLObject)module0659.NIL;
        }
        if (var38 == module0659.UNPROVIDED) {
            var38 = (SubLObject)module0659.NIL;
        }
        if (var40 == module0659.UNPROVIDED) {
            var40 = (SubLObject)module0659.NIL;
        }
        final SubLThread var41 = SubLProcess.currentSubLThread();
        final SubLObject var42 = f40071(var21);
        if (module0659.NIL != f40078(var21) && module0659.NIL != var36) {
            f40109(var21, var22, var36, var37, var38, var40);
        }
        else if (module0659.NIL != var42) {
            final SubLObject var43 = f40110(var42, var21, var36, var37, var38);
            module0642.f39090(var43, f40108(var21, var36, var37, var38), (SubLObject)module0659.$ic87$, (SubLObject)module0659.UNPROVIDED);
        }
        else {
            final SubLObject var44 = f40075(var21);
            module0642.f39020(module0015.$g219$.getGlobalValue());
            if (module0659.NIL != var44) {
                module0642.f39020(module0015.$g222$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                module0642.f39020(module0642.f39042(var44));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0659.UNPROVIDED);
            final SubLObject var45 = module0015.$g533$.currentBinding(var41);
            try {
                module0015.$g533$.bind((SubLObject)module0659.T, var41);
                module0642.f39019(f40076(var21));
            }
            finally {
                module0015.$g533$.rebind(var45, var41);
            }
            module0642.f39020(module0015.$g220$.getGlobalValue());
        }
        return var36;
    }
    
    public static SubLObject f40113(SubLObject var22) {
        if (var22 == module0659.UNPROVIDED) {
            var22 = (SubLObject)module0659.NIL;
        }
        Mapping.mapc(Symbols.symbol_function((SubLObject)module0659.$ic93$), f40106(var22), module0659.EMPTY_SUBL_OBJECT_ARRAY);
        return (SubLObject)module0659.NIL;
    }
    
    public static SubLObject f40110(final SubLObject var43, SubLObject var21, SubLObject var36, SubLObject var37, SubLObject var38) {
        if (var21 == module0659.UNPROVIDED) {
            var21 = (SubLObject)module0659.NIL;
        }
        if (var36 == module0659.UNPROVIDED) {
            var36 = (SubLObject)module0659.NIL;
        }
        if (var37 == module0659.UNPROVIDED) {
            var37 = (SubLObject)module0659.NIL;
        }
        if (var38 == module0659.UNPROVIDED) {
            var38 = (SubLObject)module0659.NIL;
        }
        if (module0659.NIL != var21 && !module0659.areAssertionsDisabledFor(me) && module0659.NIL == f40068(var21)) {
            throw new AssertionError(var21);
        }
        if (var43.isKeyword()) {
            return module0014.f698(var43);
        }
        if (var43.isString()) {
            return var43;
        }
        if (var43.isFunctionSpec()) {
            return f40110(Functions.funcall(var43, (SubLObject)((module0659.NIL != var36) ? f40114(var21, var36, var37, var38) : module0659.NIL)), (SubLObject)module0659.UNPROVIDED, (SubLObject)module0659.UNPROVIDED, (SubLObject)module0659.UNPROVIDED, (SubLObject)module0659.UNPROVIDED);
        }
        return module0014.f696();
    }
    
    public static SubLObject f40114(final SubLObject var21, final SubLObject var36, SubLObject var37, SubLObject var38) {
        if (var37 == module0659.UNPROVIDED) {
            var37 = (SubLObject)module0659.NIL;
        }
        if (var38 == module0659.UNPROVIDED) {
            var38 = (SubLObject)module0659.NIL;
        }
        if (!f40077(var21).isFunctionSpec()) {
            return (SubLObject)module0659.NIL;
        }
        if (module0659.NIL != var37) {
            return Functions.funcall(f40077(var21), var36, var37, var38);
        }
        return Functions.funcall(f40077(var21), var36);
    }
    
    public static SubLObject f40115(final SubLObject var21) {
        final SubLThread var22 = SubLProcess.currentSubLThread();
        final SubLObject var23 = module0659.$g5190$.getDynamicValue(var22);
        final SubLObject var24 = module0659.$g5191$.getDynamicValue(var22);
        final SubLObject var25 = module0659.$g5192$.getDynamicValue(var22);
        final SubLObject var26 = module0659.$g5193$.getDynamicValue(var22);
        final SubLObject var27 = module0659.$g5194$.getDynamicValue(var22);
        if (module0659.NIL != f40114(var21, var23, var24, var25)) {
            f40112(var21, var27, var23, var24, var25, var26);
            return (SubLObject)module0659.T;
        }
        return (SubLObject)module0659.NIL;
    }
    
    public static SubLObject f40116(final SubLObject var22, final SubLObject var51, final SubLObject var36, SubLObject var37, SubLObject var38, SubLObject var40) {
        if (var37 == module0659.UNPROVIDED) {
            var37 = (SubLObject)module0659.NIL;
        }
        if (var38 == module0659.UNPROVIDED) {
            var38 = (SubLObject)module0659.NIL;
        }
        if (var40 == module0659.UNPROVIDED) {
            var40 = (SubLObject)module0659.NIL;
        }
        final SubLThread var52 = SubLProcess.currentSubLThread();
        final SubLObject var53 = f40106(var22);
        final SubLObject var54 = module0659.$g5189$.currentBinding(var52);
        final SubLObject var55 = module0659.$g5190$.currentBinding(var52);
        final SubLObject var56 = module0659.$g5191$.currentBinding(var52);
        final SubLObject var57 = module0659.$g5192$.currentBinding(var52);
        final SubLObject var58 = module0659.$g5193$.currentBinding(var52);
        final SubLObject var59 = module0659.$g5194$.currentBinding(var52);
        try {
            module0659.$g5189$.bind(var51, var52);
            module0659.$g5190$.bind(var36, var52);
            module0659.$g5191$.bind(var37, var52);
            module0659.$g5192$.bind(var38, var52);
            module0659.$g5193$.bind(var40, var52);
            module0659.$g5194$.bind(var22, var52);
            Mapping.mapc((SubLObject)module0659.$ic94$, var53, module0659.EMPTY_SUBL_OBJECT_ARRAY);
        }
        finally {
            module0659.$g5194$.rebind(var59, var52);
            module0659.$g5193$.rebind(var58, var52);
            module0659.$g5192$.rebind(var57, var52);
            module0659.$g5191$.rebind(var56, var52);
            module0659.$g5190$.rebind(var55, var52);
            module0659.$g5189$.rebind(var54, var52);
        }
        return (SubLObject)module0659.NIL;
    }
    
    public static SubLObject f40117(final SubLObject var22, final SubLObject var30, final SubLObject var51, final SubLObject var36, SubLObject var37, SubLObject var38, SubLObject var40) {
        if (var37 == module0659.UNPROVIDED) {
            var37 = (SubLObject)module0659.NIL;
        }
        if (var38 == module0659.UNPROVIDED) {
            var38 = (SubLObject)module0659.NIL;
        }
        if (var40 == module0659.UNPROVIDED) {
            var40 = (SubLObject)module0659.NIL;
        }
        final SubLThread var52 = SubLProcess.currentSubLThread();
        final SubLObject var53 = module0659.$g5189$.currentBinding(var52);
        final SubLObject var54 = module0659.$g5190$.currentBinding(var52);
        final SubLObject var55 = module0659.$g5191$.currentBinding(var52);
        final SubLObject var56 = module0659.$g5192$.currentBinding(var52);
        final SubLObject var57 = module0659.$g5193$.currentBinding(var52);
        final SubLObject var58 = module0659.$g5194$.currentBinding(var52);
        try {
            module0659.$g5189$.bind(var51, var52);
            module0659.$g5190$.bind(var36, var52);
            module0659.$g5191$.bind(var37, var52);
            module0659.$g5192$.bind(var38, var52);
            module0659.$g5193$.bind(var40, var52);
            module0659.$g5194$.bind(var22, var52);
            final SubLObject var59 = f40104(var30);
            if (module0659.NIL != f40101(var59, var22)) {
                f40115(var59);
            }
        }
        finally {
            module0659.$g5194$.rebind(var58, var52);
            module0659.$g5193$.rebind(var57, var52);
            module0659.$g5192$.rebind(var56, var52);
            module0659.$g5191$.rebind(var55, var52);
            module0659.$g5190$.rebind(var54, var52);
            module0659.$g5189$.rebind(var53, var52);
        }
        return (SubLObject)module0659.NIL;
    }
    
    public static SubLObject f40118(final SubLObject var37, final SubLObject var58) {
        final SubLThread var59 = SubLProcess.currentSubLThread();
        if (module0659.NIL != module0004.f104(var37, (SubLObject)module0659.$ic109$, (SubLObject)module0659.UNPROVIDED, (SubLObject)module0659.UNPROVIDED)) {
            SubLObject var60 = (SubLObject)module0659.NIL;
            final SubLObject var61 = module0147.$g2094$.currentBinding(var59);
            final SubLObject var62 = module0147.$g2095$.currentBinding(var59);
            try {
                module0147.$g2094$.bind((SubLObject)module0659.$ic110$, var59);
                module0147.$g2095$.bind(module0659.$ic111$, var59);
                var60 = module0226.f14800(var58);
            }
            finally {
                module0147.$g2095$.rebind(var62, var59);
                module0147.$g2094$.rebind(var61, var59);
            }
            return var60;
        }
        return (SubLObject)module0659.NIL;
    }
    
    public static SubLObject f40119(final SubLObject var60, final SubLObject var37, final SubLObject var38) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0659.NIL != module0173.f10955(var60) && module0659.NIL != f40118(var37, var38));
    }
    
    public static SubLObject f40120(final SubLObject var61) {
        return module0128.f8449(var61);
    }
    
    public static SubLObject f40121(final SubLObject var60, final SubLObject var37, final SubLObject var38, SubLObject var40) {
        if (var40 == module0659.UNPROVIDED) {
            var40 = (SubLObject)module0659.NIL;
        }
        if (module0659.NIL != module0173.f10955(var60)) {
            return module0683.f41823(var60, var37, var38, (SubLObject)module0659.$ic138$);
        }
        return (SubLObject)module0659.NIL;
    }
    
    public static SubLObject f40122(final SubLObject var60, final SubLObject var37, final SubLObject var38) {
        if (module0659.NIL != module0173.f10955(var60)) {
            return module0683.f41823(var60, var37, var38, (SubLObject)module0659.$ic141$);
        }
        return (SubLObject)module0659.NIL;
    }
    
    public static SubLObject f40123(final SubLObject var22) {
        if (module0659.NIL != var22) {
            return var22;
        }
        return (SubLObject)module0659.$ic128$;
    }
    
    public static SubLObject f40124(final SubLObject var22) {
        if (module0659.NIL != var22) {
            return var22;
        }
        return (SubLObject)module0659.$ic131$;
    }
    
    public static SubLObject f40125(final SubLObject var22) {
        if (module0659.NIL != var22) {
            return var22;
        }
        return (SubLObject)module0659.$ic133$;
    }
    
    public static SubLObject f40126(final SubLObject var60, final SubLObject var37, final SubLObject var38) {
        if (module0659.NIL != module0173.f10955(var60)) {
            return module0683.f41823(var60, var37, var38, (SubLObject)module0659.$ic144$);
        }
        return (SubLObject)module0659.NIL;
    }
    
    public static SubLObject f40127(final SubLObject var1) {
        if (module0659.NIL != var1) {
            return module0178.f11378(var1);
        }
        return (SubLObject)module0659.$ic147$;
    }
    
    public static SubLObject f40128(final SubLObject var62) {
        final SubLObject var63 = module0188.f11788(var62);
        return module0289.f19396(var63);
    }
    
    public static SubLObject f40129(final SubLObject var1) {
        if (module0659.NIL != var1) {
            return Mapping.mapcar(Symbols.symbol_function((SubLObject)module0659.$ic148$), module0178.f11380(var1));
        }
        return (SubLObject)module0659.$ic149$;
    }
    
    public static SubLObject f40130(final SubLObject var63, final SubLObject var64) {
        final SubLObject var65 = Sequences.position(f40066(var63), module0659.$g5195$.getGlobalValue(), (SubLObject)module0659.UNPROVIDED, (SubLObject)module0659.UNPROVIDED, (SubLObject)module0659.UNPROVIDED, (SubLObject)module0659.UNPROVIDED);
        final SubLObject var66 = Sequences.position(f40066(var64), module0659.$g5195$.getGlobalValue(), (SubLObject)module0659.UNPROVIDED, (SubLObject)module0659.UNPROVIDED, (SubLObject)module0659.UNPROVIDED, (SubLObject)module0659.UNPROVIDED);
        if (module0659.NIL == var65 || module0659.NIL == var66) {
            return (SubLObject)module0659.NIL;
        }
        return Numbers.numL(var65, var66);
    }
    
    public static SubLObject f40131(SubLObject var67) {
        if (var67 == module0659.UNPROVIDED) {
            var67 = (SubLObject)module0659.NIL;
        }
        final SubLThread var68 = SubLProcess.currentSubLThread();
        SubLObject var70;
        final SubLObject var69 = var70 = var67;
        SubLObject var71 = (SubLObject)module0659.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var70, var69, (SubLObject)module0659.$ic161$);
        var71 = var70.first();
        var70 = var70.rest();
        if (module0659.NIL == var70) {
            final SubLObject var72 = module0656.f39969(var71);
            if (module0659.NIL == module0656.f39930(var72)) {
                module0656.f39789((SubLObject)module0659.$ic162$, var72, (SubLObject)module0659.UNPROVIDED, (SubLObject)module0659.UNPROVIDED, (SubLObject)module0659.UNPROVIDED, (SubLObject)module0659.UNPROVIDED);
                return (SubLObject)module0659.NIL;
            }
            final SubLObject var73 = (SubLObject)module0659.$ic163$;
            final SubLObject var74 = module0015.$g538$.currentBinding(var68);
            try {
                module0015.$g538$.bind((module0659.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var68))) ? module0015.$g538$.getDynamicValue(var68) : module0057.f4173((SubLObject)module0659.UNPROVIDED, (SubLObject)module0659.UNPROVIDED, (SubLObject)module0659.UNPROVIDED), var68);
                module0642.f39020((SubLObject)module0659.$ic164$);
                module0642.f39029((SubLObject)module0659.UNPROVIDED);
                module0642.f39020(module0015.$g155$.getGlobalValue());
                module0642.f39020(module0015.$g153$.getGlobalValue());
                module0015.f718();
                module0655.f39766();
                module0642.f39064(module0655.$g5143$.getDynamicValue(var68), module0655.$g5142$.getDynamicValue(var68));
                final SubLObject var75 = module0014.f672((SubLObject)module0659.$ic165$);
                module0642.f39029((SubLObject)module0659.UNPROVIDED);
                module0642.f39020(module0015.$g175$.getGlobalValue());
                module0642.f39020(module0015.$g176$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                module0642.f39020((SubLObject)module0659.$ic166$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                if (module0659.NIL != var75) {
                    module0642.f39020(module0015.$g178$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                    module0642.f39020(var75);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                }
                module0642.f39020(module0015.$g177$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                module0642.f39020((SubLObject)module0659.$ic167$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0659.UNPROVIDED);
                module0016.f941();
                if (module0659.NIL != var73) {
                    module0642.f39029((SubLObject)module0659.UNPROVIDED);
                    module0642.f39020(module0015.$g173$.getGlobalValue());
                    module0642.f39019(var73);
                    module0642.f39020(module0015.$g174$.getGlobalValue());
                }
                module0642.f39020(module0015.$g154$.getGlobalValue());
                module0642.f39029((SubLObject)module0659.UNPROVIDED);
                final SubLObject var35_73 = module0015.$g535$.currentBinding(var68);
                try {
                    module0015.$g535$.bind((SubLObject)module0659.T, var68);
                    module0642.f39020(module0015.$g133$.getGlobalValue());
                    if (module0659.NIL != module0015.$g132$.getDynamicValue(var68)) {
                        module0642.f39020(module0015.$g135$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                        module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var68)));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g137$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                    module0642.f39020((SubLObject)module0659.$ic170$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0659.UNPROVIDED);
                    final SubLObject var35_74 = module0015.$g533$.currentBinding(var68);
                    try {
                        module0015.$g533$.bind((SubLObject)module0659.T, var68);
                        module0642.f39020(module0015.$g144$.getGlobalValue());
                        module0642.f39020(module0015.$g157$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                        module0642.f39020((SubLObject)module0659.$ic171$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0659.UNPROVIDED);
                        final SubLObject var35_75 = module0015.$g533$.currentBinding(var68);
                        try {
                            module0015.$g533$.bind((SubLObject)module0659.T, var68);
                            module0642.f39020(module0015.$g295$.getGlobalValue());
                            module0642.f39020(module0015.$g305$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                            module0642.f39020((SubLObject)module0659.$ic172$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                            module0642.f39020(module0015.$g302$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                            module0642.f39020((SubLObject)module0659.$ic173$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                            module0642.f39020(module0015.$g307$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                            module0642.f39019((SubLObject)module0659.$ic174$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0659.UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var35_75, var68);
                        }
                        module0642.f39020(module0015.$g145$.getGlobalValue());
                        if (module0659.NIL != var73) {
                            module0642.f39020(module0015.$g189$.getGlobalValue());
                            module0642.f39020((SubLObject)module0659.TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0659.UNPROVIDED);
                            module0642.f39019(var73);
                            module0642.f39020(module0015.$g190$.getGlobalValue());
                            module0642.f39020((SubLObject)module0659.TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0659.UNPROVIDED);
                        }
                        final SubLObject var76 = module0656.f39832((SubLObject)module0659.NIL);
                        module0642.f39020(module0015.$g282$.getGlobalValue());
                        module0642.f39020(module0015.$g284$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                        module0642.f39020(module0110.$g570$.getDynamicValue(var68));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                        module0642.f39020(module0015.$g285$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                        module0642.f39020((SubLObject)module0659.$ic175$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                        if (module0659.NIL != var76) {
                            module0642.f39020(module0015.$g286$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                            module0642.f39020(var76);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                        }
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0659.UNPROVIDED);
                        final SubLObject var35_76 = module0015.$g533$.currentBinding(var68);
                        final SubLObject var77 = module0015.$g541$.currentBinding(var68);
                        final SubLObject var78 = module0015.$g539$.currentBinding(var68);
                        try {
                            module0015.$g533$.bind((SubLObject)module0659.T, var68);
                            module0015.$g541$.bind((SubLObject)module0659.T, var68);
                            module0015.$g539$.bind(module0015.f797(), var68);
                            module0642.f39069((SubLObject)module0659.$ic176$, (SubLObject)module0659.T, (SubLObject)module0659.UNPROVIDED);
                            module0656.f39870((SubLObject)module0659.$ic159$, (SubLObject)module0659.UNPROVIDED, (SubLObject)module0659.UNPROVIDED);
                            module0642.f39026((SubLObject)module0659.TWO_INTEGER);
                            module0642.f39073((SubLObject)module0659.$ic177$);
                            module0642.f39032((SubLObject)module0659.UNPROVIDED);
                            module0642.f39074((SubLObject)module0659.$ic178$, (SubLObject)module0659.UNPROVIDED, (SubLObject)module0659.UNPROVIDED);
                            module0642.f39026((SubLObject)module0659.UNPROVIDED);
                            module0642.f39051((SubLObject)module0659.UNPROVIDED, (SubLObject)module0659.UNPROVIDED);
                            module0642.f39026((SubLObject)module0659.UNPROVIDED);
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            module0642.f39019((SubLObject)module0659.$ic179$);
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                            f40113((SubLObject)module0659.UNPROVIDED);
                            module0642.f39026((SubLObject)module0659.TWO_INTEGER);
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            module0642.f39019((SubLObject)module0659.$ic180$);
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                            module0642.f39026((SubLObject)module0659.UNPROVIDED);
                            module0642.f39020(module0015.$g346$.getGlobalValue());
                            module0642.f39020(module0015.$g352$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                            module0642.f39020((SubLObject)module0659.TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                            module0642.f39020(module0015.$g353$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                            module0642.f39020((SubLObject)module0659.ZERO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                            module0642.f39020(module0015.$g354$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                            module0642.f39020((SubLObject)module0659.ZERO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0659.UNPROVIDED);
                            final SubLObject var35_77 = module0015.$g533$.currentBinding(var68);
                            try {
                                module0015.$g533$.bind((SubLObject)module0659.T, var68);
                                module0642.f39020(module0015.$g364$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0659.UNPROVIDED);
                                final SubLObject var35_78 = module0015.$g533$.currentBinding(var68);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0659.T, var68);
                                    module0642.f39020(module0015.$g360$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0659.UNPROVIDED);
                                    final SubLObject var35_79 = module0015.$g533$.currentBinding(var68);
                                    try {
                                        module0015.$g533$.bind((SubLObject)module0659.T, var68);
                                        module0642.f39020(module0015.$g346$.getGlobalValue());
                                        module0642.f39046(module0015.$g348$.getGlobalValue());
                                        module0642.f39020(module0015.$g352$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                                        module0642.f39020((SubLObject)module0659.ZERO_INTEGER);
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                                        module0642.f39020(module0015.$g353$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                                        module0642.f39020((SubLObject)module0659.THREE_INTEGER);
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                                        module0642.f39020(module0015.$g354$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                                        module0642.f39020((SubLObject)module0659.ZERO_INTEGER);
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0659.UNPROVIDED);
                                        final SubLObject var35_80 = module0015.$g533$.currentBinding(var68);
                                        try {
                                            module0015.$g533$.bind((SubLObject)module0659.T, var68);
                                            module0642.f39020(module0015.$g364$.getGlobalValue());
                                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0659.UNPROVIDED);
                                            final SubLObject var35_81 = module0015.$g533$.currentBinding(var68);
                                            try {
                                                module0015.$g533$.bind((SubLObject)module0659.T, var68);
                                                module0642.f39020(module0015.$g362$.getGlobalValue());
                                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                                                module0642.f39020(module0642.f39049((SubLObject)module0659.$ic181$));
                                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                                                module0642.f39020(module0642.f39049((SubLObject)module0659.$ic87$));
                                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0659.UNPROVIDED);
                                                final SubLObject var35_82 = module0015.$g533$.currentBinding(var68);
                                                try {
                                                    module0015.$g533$.bind((SubLObject)module0659.T, var68);
                                                    module0642.f39020(module0015.$g234$.getGlobalValue());
                                                    module0642.f39019((SubLObject)module0659.$ic182$);
                                                    module0642.f39020(module0015.$g235$.getGlobalValue());
                                                }
                                                finally {
                                                    module0015.$g533$.rebind(var35_82, var68);
                                                }
                                                module0642.f39020(module0015.$g363$.getGlobalValue());
                                                module0642.f39020(module0015.$g362$.getGlobalValue());
                                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                                                module0642.f39020(module0642.f39049((SubLObject)module0659.$ic181$));
                                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                                                module0642.f39020(module0642.f39049((SubLObject)module0659.$ic87$));
                                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0659.UNPROVIDED);
                                                final SubLObject var35_83 = module0015.$g533$.currentBinding(var68);
                                                try {
                                                    module0015.$g533$.bind((SubLObject)module0659.T, var68);
                                                    module0642.f39020(module0015.$g234$.getGlobalValue());
                                                    module0642.f39019((SubLObject)module0659.$ic183$);
                                                    module0642.f39020(module0015.$g235$.getGlobalValue());
                                                }
                                                finally {
                                                    module0015.$g533$.rebind(var35_83, var68);
                                                }
                                                module0642.f39020(module0015.$g363$.getGlobalValue());
                                                module0642.f39020(module0015.$g362$.getGlobalValue());
                                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                                                module0642.f39020(module0642.f39049((SubLObject)module0659.$ic184$));
                                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                                                module0642.f39020(module0642.f39049((SubLObject)module0659.$ic87$));
                                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0659.UNPROVIDED);
                                                final SubLObject var35_84 = module0015.$g533$.currentBinding(var68);
                                                try {
                                                    module0015.$g533$.bind((SubLObject)module0659.T, var68);
                                                    module0642.f39020(module0015.$g234$.getGlobalValue());
                                                    module0642.f39019((SubLObject)module0659.$ic185$);
                                                    module0642.f39020(module0015.$g235$.getGlobalValue());
                                                }
                                                finally {
                                                    module0015.$g533$.rebind(var35_84, var68);
                                                }
                                                module0642.f39020(module0015.$g363$.getGlobalValue());
                                                module0642.f39020(module0015.$g362$.getGlobalValue());
                                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                                                module0642.f39020(module0642.f39049((SubLObject)module0659.$ic184$));
                                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                                                module0642.f39020(module0642.f39049((SubLObject)module0659.$ic87$));
                                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0659.UNPROVIDED);
                                                final SubLObject var35_85 = module0015.$g533$.currentBinding(var68);
                                                try {
                                                    module0015.$g533$.bind((SubLObject)module0659.T, var68);
                                                    module0642.f39020(module0015.$g234$.getGlobalValue());
                                                    module0642.f39019((SubLObject)module0659.$ic186$);
                                                    module0642.f39020(module0015.$g235$.getGlobalValue());
                                                }
                                                finally {
                                                    module0015.$g533$.rebind(var35_85, var68);
                                                }
                                                module0642.f39020(module0015.$g363$.getGlobalValue());
                                                module0642.f39020(module0015.$g362$.getGlobalValue());
                                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                                                module0642.f39020(module0642.f39049((SubLObject)module0659.$ic184$));
                                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                                                module0642.f39020(module0642.f39049((SubLObject)module0659.$ic87$));
                                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0659.UNPROVIDED);
                                                final SubLObject var35_86 = module0015.$g533$.currentBinding(var68);
                                                try {
                                                    module0015.$g533$.bind((SubLObject)module0659.T, var68);
                                                    module0642.f39020(module0015.$g234$.getGlobalValue());
                                                    module0642.f39019((SubLObject)module0659.$ic187$);
                                                    module0642.f39020(module0015.$g235$.getGlobalValue());
                                                }
                                                finally {
                                                    module0015.$g533$.rebind(var35_86, var68);
                                                }
                                                module0642.f39020(module0015.$g363$.getGlobalValue());
                                                module0642.f39020(module0015.$g362$.getGlobalValue());
                                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                                                module0642.f39020(module0642.f39049((SubLObject)module0659.$ic184$));
                                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                                                module0642.f39020(module0642.f39049((SubLObject)module0659.$ic87$));
                                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0659.UNPROVIDED);
                                                final SubLObject var35_87 = module0015.$g533$.currentBinding(var68);
                                                try {
                                                    module0015.$g533$.bind((SubLObject)module0659.T, var68);
                                                    module0642.f39020(module0015.$g234$.getGlobalValue());
                                                    module0642.f39019((SubLObject)module0659.$ic188$);
                                                    module0642.f39020(module0015.$g235$.getGlobalValue());
                                                }
                                                finally {
                                                    module0015.$g533$.rebind(var35_87, var68);
                                                }
                                                module0642.f39020(module0015.$g363$.getGlobalValue());
                                                module0642.f39020(module0015.$g362$.getGlobalValue());
                                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                                                module0642.f39020(module0642.f39049((SubLObject)module0659.$ic184$));
                                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                                                module0642.f39020(module0642.f39049((SubLObject)module0659.$ic87$));
                                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0659.UNPROVIDED);
                                                final SubLObject var35_88 = module0015.$g533$.currentBinding(var68);
                                                try {
                                                    module0015.$g533$.bind((SubLObject)module0659.T, var68);
                                                    module0642.f39020(module0015.$g234$.getGlobalValue());
                                                    module0642.f39019((SubLObject)module0659.$ic189$);
                                                    module0642.f39020(module0015.$g235$.getGlobalValue());
                                                }
                                                finally {
                                                    module0015.$g533$.rebind(var35_88, var68);
                                                }
                                                module0642.f39020(module0015.$g363$.getGlobalValue());
                                                if (module0659.NIL != module0659.$g5198$.getDynamicValue(var68)) {
                                                    module0642.f39020(module0015.$g362$.getGlobalValue());
                                                    module0642.f39020(module0015.$g370$.getGlobalValue());
                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                                                    module0642.f39020(module0642.f39049((SubLObject)module0659.$ic181$));
                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                                                    module0642.f39020(module0015.$g373$.getGlobalValue());
                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                                                    module0642.f39020(module0642.f39049((SubLObject)module0659.$ic87$));
                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0659.UNPROVIDED);
                                                    final SubLObject var35_89 = module0015.$g533$.currentBinding(var68);
                                                    try {
                                                        module0015.$g533$.bind((SubLObject)module0659.T, var68);
                                                        module0642.f39020(module0015.$g234$.getGlobalValue());
                                                        module0642.f39019((SubLObject)module0659.$ic190$);
                                                        module0642.f39020(module0015.$g235$.getGlobalValue());
                                                    }
                                                    finally {
                                                        module0015.$g533$.rebind(var35_89, var68);
                                                    }
                                                    module0642.f39020(module0015.$g363$.getGlobalValue());
                                                }
                                            }
                                            finally {
                                                module0015.$g533$.rebind(var35_81, var68);
                                            }
                                            module0642.f39020(module0015.$g365$.getGlobalValue());
                                            module0642.f39029((SubLObject)module0659.UNPROVIDED);
                                            SubLObject var79 = (SubLObject)module0659.NIL;
                                            if (module0659.NIL == module0655.$g5111$.getDynamicValue(var68)) {
                                                var79 = (SubLObject)module0659.$ic191$;
                                            }
                                            SubLObject var80 = (SubLObject)module0659.NIL;
                                            SubLObject var81 = (SubLObject)module0659.NIL;
                                            SubLObject var82 = (SubLObject)module0659.NIL;
                                            SubLObject var83 = (SubLObject)module0659.NIL;
                                            var81 = Sort.sort(conses_high.copy_list(module0659.$g5197$.getGlobalValue()), Symbols.symbol_function((SubLObject)module0659.$ic192$), (SubLObject)module0659.UNPROVIDED);
                                            var82 = var81.first();
                                            for (var83 = (SubLObject)module0659.ZERO_INTEGER; module0659.NIL != var81; var81 = var81.rest(), var82 = var81.first(), var83 = Numbers.add((SubLObject)module0659.ONE_INTEGER, var83)) {
                                                if (module0659.NIL != module0655.$g5111$.getDynamicValue(var68)) {
                                                    if (module0659.NIL != var80) {
                                                        var80 = (SubLObject)module0659.NIL;
                                                    }
                                                    else {
                                                        var80 = (SubLObject)module0659.T;
                                                    }
                                                    var79 = (SubLObject)((module0659.NIL != var80) ? module0659.$ic193$ : module0659.$ic191$);
                                                }
                                                final SubLObject var84 = Strings.string(f40066(var82));
                                                module0642.f39020(module0015.$g364$.getGlobalValue());
                                                if (module0659.NIL != var79) {
                                                    module0642.f39020(module0015.$g366$.getGlobalValue());
                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                                                    module0642.f39020(var79);
                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                                                }
                                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0659.UNPROVIDED);
                                                final SubLObject var35_90 = module0015.$g533$.currentBinding(var68);
                                                try {
                                                    module0015.$g533$.bind((SubLObject)module0659.T, var68);
                                                    module0642.f39020(module0015.$g360$.getGlobalValue());
                                                    module0642.f39046(module0015.$g369$.getGlobalValue());
                                                    module0642.f39020(module0015.$g370$.getGlobalValue());
                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                                                    module0642.f39020(module0642.f39049((SubLObject)module0659.$ic181$));
                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0659.UNPROVIDED);
                                                    final SubLObject var35_91 = module0015.$g533$.currentBinding(var68);
                                                    try {
                                                        module0015.$g533$.bind((SubLObject)module0659.T, var68);
                                                        f40112(var82, (SubLObject)module0659.UNPROVIDED, (SubLObject)module0659.UNPROVIDED, (SubLObject)module0659.UNPROVIDED, (SubLObject)module0659.UNPROVIDED, (SubLObject)module0659.UNPROVIDED);
                                                    }
                                                    finally {
                                                        module0015.$g533$.rebind(var35_91, var68);
                                                    }
                                                    module0642.f39020(module0015.$g361$.getGlobalValue());
                                                    module0642.f39020(module0015.$g360$.getGlobalValue());
                                                    module0642.f39046(module0015.$g369$.getGlobalValue());
                                                    module0642.f39020(module0015.$g370$.getGlobalValue());
                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                                                    module0642.f39020(module0642.f39049((SubLObject)module0659.$ic181$));
                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0659.UNPROVIDED);
                                                    final SubLObject var35_92 = module0015.$g533$.currentBinding(var68);
                                                    try {
                                                        module0015.$g533$.bind((SubLObject)module0659.T, var68);
                                                        module0642.f39068(Strings.string(var84), Strings.string(var84), f40070(var82), (SubLObject)module0659.UNPROVIDED, (SubLObject)module0659.UNPROVIDED, (SubLObject)module0659.UNPROVIDED);
                                                    }
                                                    finally {
                                                        module0015.$g533$.rebind(var35_92, var68);
                                                    }
                                                    module0642.f39020(module0015.$g361$.getGlobalValue());
                                                    module0642.f39020(module0015.$g360$.getGlobalValue());
                                                    module0642.f39046(module0015.$g369$.getGlobalValue());
                                                    module0642.f39020(module0015.$g370$.getGlobalValue());
                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                                                    module0642.f39020(module0642.f39049((SubLObject)module0659.$ic184$));
                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0659.UNPROVIDED);
                                                    final SubLObject var35_93 = module0015.$g533$.currentBinding(var68);
                                                    try {
                                                        module0015.$g533$.bind((SubLObject)module0659.T, var68);
                                                        module0642.f39020(module0015.$g209$.getGlobalValue());
                                                        module0642.f39019(Strings.string_downcase(var84, (SubLObject)module0659.UNPROVIDED, (SubLObject)module0659.UNPROVIDED));
                                                        module0642.f39020(module0015.$g210$.getGlobalValue());
                                                    }
                                                    finally {
                                                        module0015.$g533$.rebind(var35_93, var68);
                                                    }
                                                    module0642.f39020(module0015.$g361$.getGlobalValue());
                                                    module0642.f39020(module0015.$g360$.getGlobalValue());
                                                    module0642.f39046(module0015.$g369$.getGlobalValue());
                                                    module0642.f39020(module0015.$g370$.getGlobalValue());
                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                                                    module0642.f39020(module0642.f39049((SubLObject)module0659.$ic184$));
                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0659.UNPROVIDED);
                                                    final SubLObject var35_94 = module0015.$g533$.currentBinding(var68);
                                                    try {
                                                        module0015.$g533$.bind((SubLObject)module0659.T, var68);
                                                        if (module0659.NIL != f40074(var82)) {
                                                            module0642.f39068(PrintLow.format((SubLObject)module0659.NIL, (SubLObject)module0659.$ic194$, var84), PrintLow.format((SubLObject)module0659.NIL, (SubLObject)module0659.$ic194$, var84), (SubLObject)SubLObjectFactory.makeBoolean(module0659.NIL != f40073(var82) && !f40073(var82).isString()), (SubLObject)module0659.UNPROVIDED, (SubLObject)module0659.UNPROVIDED, (SubLObject)module0659.UNPROVIDED);
                                                            module0642.f39032((SubLObject)module0659.UNPROVIDED);
                                                            if (module0659.NIL != f40081(var82)) {
                                                                module0642.f39019(f40081(var82));
                                                            }
                                                            else {
                                                                module0642.f39019((SubLObject)module0659.$ic195$);
                                                            }
                                                        }
                                                        else {
                                                            module0642.f39019((SubLObject)module0659.$ic196$);
                                                        }
                                                    }
                                                    finally {
                                                        module0015.$g533$.rebind(var35_94, var68);
                                                    }
                                                    module0642.f39020(module0015.$g361$.getGlobalValue());
                                                    module0642.f39020(module0015.$g360$.getGlobalValue());
                                                    module0642.f39046(module0015.$g369$.getGlobalValue());
                                                    module0642.f39020(module0015.$g370$.getGlobalValue());
                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                                                    module0642.f39020(module0642.f39049((SubLObject)module0659.$ic184$));
                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0659.UNPROVIDED);
                                                    final SubLObject var35_95 = module0015.$g533$.currentBinding(var68);
                                                    try {
                                                        module0015.$g533$.bind((SubLObject)module0659.T, var68);
                                                        module0642.f39019((SubLObject)((module0659.NIL != f40078(var82)) ? module0659.$ic197$ : module0659.$ic196$));
                                                    }
                                                    finally {
                                                        module0015.$g533$.rebind(var35_95, var68);
                                                    }
                                                    module0642.f39020(module0015.$g361$.getGlobalValue());
                                                    module0642.f39020(module0015.$g360$.getGlobalValue());
                                                    module0642.f39046(module0015.$g369$.getGlobalValue());
                                                    module0642.f39020(module0015.$g370$.getGlobalValue());
                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                                                    module0642.f39020(module0642.f39049((SubLObject)module0659.$ic184$));
                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0659.UNPROVIDED);
                                                    final SubLObject var35_96 = module0015.$g533$.currentBinding(var68);
                                                    try {
                                                        module0015.$g533$.bind((SubLObject)module0659.T, var68);
                                                        module0642.f39019(Strings.string_downcase(Strings.string(f40069(var82)), (SubLObject)module0659.UNPROVIDED, (SubLObject)module0659.UNPROVIDED));
                                                    }
                                                    finally {
                                                        module0015.$g533$.rebind(var35_96, var68);
                                                    }
                                                    module0642.f39020(module0015.$g361$.getGlobalValue());
                                                    module0642.f39020(module0015.$g360$.getGlobalValue());
                                                    module0642.f39020(module0015.$g370$.getGlobalValue());
                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                                                    module0642.f39020(module0642.f39049((SubLObject)module0659.$ic184$));
                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0659.UNPROVIDED);
                                                    final SubLObject var35_97 = module0015.$g533$.currentBinding(var68);
                                                    try {
                                                        module0015.$g533$.bind((SubLObject)module0659.T, var68);
                                                        final SubLObject var85 = f40079(var82);
                                                        if (module0659.NIL != var85 && module0659.NIL != module0656.f39838(var85)) {
                                                            module0656.f39837(var85, module0656.f39823(var85), (SubLObject)module0659.UNPROVIDED, (SubLObject)module0659.UNPROVIDED, (SubLObject)module0659.UNPROVIDED, (SubLObject)module0659.UNPROVIDED);
                                                        }
                                                        else {
                                                            module0642.f39027((SubLObject)module0659.$ic198$, (SubLObject)module0659.UNPROVIDED);
                                                        }
                                                    }
                                                    finally {
                                                        module0015.$g533$.rebind(var35_97, var68);
                                                    }
                                                    module0642.f39020(module0015.$g361$.getGlobalValue());
                                                    if (module0659.NIL != module0659.$g5198$.getDynamicValue(var68)) {
                                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                                        module0642.f39046(module0015.$g369$.getGlobalValue());
                                                        module0642.f39020(module0015.$g370$.getGlobalValue());
                                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                                                        module0642.f39020(module0642.f39049((SubLObject)module0659.$ic184$));
                                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0659.UNPROVIDED);
                                                        final SubLObject var35_98 = module0015.$g533$.currentBinding(var68);
                                                        try {
                                                            module0015.$g533$.bind((SubLObject)module0659.T, var68);
                                                            module0642.f39019(Strings.string(f40077(var82)));
                                                        }
                                                        finally {
                                                            module0015.$g533$.rebind(var35_98, var68);
                                                        }
                                                        module0642.f39020(module0015.$g361$.getGlobalValue());
                                                    }
                                                }
                                                finally {
                                                    module0015.$g533$.rebind(var35_90, var68);
                                                }
                                                module0642.f39020(module0015.$g365$.getGlobalValue());
                                                module0642.f39029((SubLObject)module0659.UNPROVIDED);
                                                module0642.f39020(module0015.$g364$.getGlobalValue());
                                                if (module0659.NIL != var79) {
                                                    module0642.f39020(module0015.$g366$.getGlobalValue());
                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                                                    module0642.f39020(var79);
                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                                                }
                                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0659.UNPROVIDED);
                                                final SubLObject var35_99 = module0015.$g533$.currentBinding(var68);
                                                try {
                                                    module0015.$g533$.bind((SubLObject)module0659.T, var68);
                                                    module0642.f39020(module0015.$g360$.getGlobalValue());
                                                    module0642.f39020(module0015.$g371$.getGlobalValue());
                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                                                    module0642.f39020((SubLObject)module0659.TWO_INTEGER);
                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0659.UNPROVIDED);
                                                    final SubLObject var35_100 = module0015.$g533$.currentBinding(var68);
                                                    try {
                                                        module0015.$g533$.bind((SubLObject)module0659.T, var68);
                                                        module0642.f39067();
                                                    }
                                                    finally {
                                                        module0015.$g533$.rebind(var35_100, var68);
                                                    }
                                                    module0642.f39020(module0015.$g361$.getGlobalValue());
                                                    module0642.f39020(module0015.$g360$.getGlobalValue());
                                                    module0642.f39020(module0015.$g371$.getGlobalValue());
                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                                                    module0642.f39020((SubLObject)module0659.FIVE_INTEGER);
                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                                                    module0642.f39020(module0015.$g370$.getGlobalValue());
                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                                                    module0642.f39020(module0642.f39049((SubLObject)module0659.$ic184$));
                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0659.UNPROVIDED);
                                                    final SubLObject var35_101 = module0015.$g533$.currentBinding(var68);
                                                    try {
                                                        module0015.$g533$.bind((SubLObject)module0659.T, var68);
                                                        if (module0659.NIL != f40080(var82)) {
                                                            module0642.f39019(f40080(var82));
                                                        }
                                                        else {
                                                            module0642.f39019((SubLObject)module0659.$ic195$);
                                                        }
                                                    }
                                                    finally {
                                                        module0015.$g533$.rebind(var35_101, var68);
                                                    }
                                                    module0642.f39020(module0015.$g361$.getGlobalValue());
                                                    module0642.f39020(module0015.$g364$.getGlobalValue());
                                                    if (module0659.NIL != var79) {
                                                        module0642.f39020(module0015.$g366$.getGlobalValue());
                                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                                                        module0642.f39020(var79);
                                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                                                    }
                                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0659.UNPROVIDED);
                                                    final SubLObject var35_102 = module0015.$g533$.currentBinding(var68);
                                                    try {
                                                        module0015.$g533$.bind((SubLObject)module0659.T, var68);
                                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                                        module0642.f39020(module0015.$g371$.getGlobalValue());
                                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                                                        module0642.f39020((SubLObject)module0659.SEVEN_INTEGER);
                                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
                                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0659.UNPROVIDED);
                                                        final SubLObject var35_103 = module0015.$g533$.currentBinding(var68);
                                                        try {
                                                            module0015.$g533$.bind((SubLObject)module0659.T, var68);
                                                            module0642.f39067();
                                                        }
                                                        finally {
                                                            module0015.$g533$.rebind(var35_103, var68);
                                                        }
                                                        module0642.f39020(module0015.$g361$.getGlobalValue());
                                                    }
                                                    finally {
                                                        module0015.$g533$.rebind(var35_102, var68);
                                                    }
                                                    module0642.f39020(module0015.$g365$.getGlobalValue());
                                                    module0642.f39029((SubLObject)module0659.UNPROVIDED);
                                                }
                                                finally {
                                                    module0015.$g533$.rebind(var35_99, var68);
                                                }
                                                module0642.f39020(module0015.$g365$.getGlobalValue());
                                                module0642.f39029((SubLObject)module0659.UNPROVIDED);
                                            }
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var35_80, var68);
                                        }
                                        module0642.f39020(module0015.$g347$.getGlobalValue());
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var35_79, var68);
                                    }
                                    module0642.f39020(module0015.$g361$.getGlobalValue());
                                }
                                finally {
                                    module0015.$g533$.rebind(var35_78, var68);
                                }
                                module0642.f39020(module0015.$g365$.getGlobalValue());
                                module0642.f39029((SubLObject)module0659.UNPROVIDED);
                            }
                            finally {
                                module0015.$g533$.rebind(var35_77, var68);
                            }
                            module0642.f39020(module0015.$g347$.getGlobalValue());
                            module0642.f39026((SubLObject)module0659.UNPROVIDED);
                            module0642.f39073((SubLObject)module0659.$ic177$);
                            module0642.f39032((SubLObject)module0659.UNPROVIDED);
                            module0642.f39074((SubLObject)module0659.$ic178$, (SubLObject)module0659.UNPROVIDED, (SubLObject)module0659.UNPROVIDED);
                            module0015.f799(module0015.$g539$.getDynamicValue(var68));
                        }
                        finally {
                            module0015.$g539$.rebind(var78, var68);
                            module0015.$g541$.rebind(var77, var68);
                            module0015.$g533$.rebind(var35_76, var68);
                        }
                        module0642.f39020(module0015.$g283$.getGlobalValue());
                        module0642.f39029((SubLObject)module0659.UNPROVIDED);
                        module0642.f39050();
                    }
                    finally {
                        module0015.$g533$.rebind(var35_74, var68);
                    }
                    module0642.f39020(module0015.$g134$.getGlobalValue());
                    module0642.f39029((SubLObject)module0659.UNPROVIDED);
                }
                finally {
                    module0015.$g535$.rebind(var35_73, var68);
                }
                module0642.f39020(module0015.$g156$.getGlobalValue());
                module0642.f39029((SubLObject)module0659.UNPROVIDED);
            }
            finally {
                module0015.$g538$.rebind(var74, var68);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var69, (SubLObject)module0659.$ic161$);
        }
        return (SubLObject)module0659.NIL;
    }
    
    public static SubLObject f40132(final SubLObject var67) {
        module0659.$g5198$.setDynamicValue((SubLObject)SubLObjectFactory.makeBoolean(module0659.NIL != module0642.f39104((SubLObject)module0659.$ic200$, var67)));
        SubLObject var68 = Mapping.mapcar(Symbols.symbol_function((SubLObject)module0659.$ic15$), module0659.$g5197$.getGlobalValue());
        SubLObject var69 = (SubLObject)module0659.NIL;
        var69 = var68.first();
        while (module0659.NIL != var68) {
            final SubLObject var70 = PrintLow.format((SubLObject)module0659.NIL, (SubLObject)module0659.$ic194$, var69);
            final SubLObject var71 = f40104(var69);
            if (module0659.NIL != module0642.f39104(Strings.string(var69), var67)) {
                f40103(var69, (SubLObject)module0659.T);
            }
            else {
                f40103(var69, (SubLObject)module0659.NIL);
            }
            if (module0659.NIL != module0642.f39104(var70, var67)) {
                f40088(var71, f40074(var71));
            }
            else {
                f40088(var71, PrintLow.format((SubLObject)module0659.NIL, (SubLObject)module0659.$ic201$, f40066(var71)));
            }
            var68 = var68.rest();
            var69 = var68.first();
        }
        module0656.f39793((SubLObject)module0659.$ic202$, (SubLObject)module0659.UNPROVIDED);
        return (SubLObject)module0659.NIL;
    }
    
    public static SubLObject f40133(final SubLObject var60, SubLObject var113) {
        if (var113 == module0659.UNPROVIDED) {
            var113 = (SubLObject)module0659.NIL;
        }
        final SubLThread var114 = SubLProcess.currentSubLThread();
        if (module0659.NIL == var113) {
            var113 = (SubLObject)module0659.$ic204$;
        }
        final SubLObject var115 = module0656.f39832((SubLObject)module0659.$ic0$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var114), (SubLObject)module0659.$ic205$, module0656.f39931(var60));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
        if (module0659.NIL != var115) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
            module0642.f39020(var115);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0659.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0659.UNPROVIDED);
        final SubLObject var116 = module0015.$g533$.currentBinding(var114);
        try {
            module0015.$g533$.bind((SubLObject)module0659.T, var114);
            module0642.f39019(var113);
        }
        finally {
            module0015.$g533$.rebind(var116, var114);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var60;
    }
    
    public static SubLObject f40134(final SubLObject var60) {
        module0642.f39020(module0015.$g209$.getGlobalValue());
        module0656.f39837((SubLObject)module0659.$ic206$, var60, (SubLObject)module0659.$ic163$, (SubLObject)module0659.UNPROVIDED, (SubLObject)module0659.UNPROVIDED, (SubLObject)module0659.UNPROVIDED);
        module0642.f39019((SubLObject)module0659.$ic208$);
        module0642.f39020(module0015.$g210$.getGlobalValue());
        f40113((SubLObject)module0659.UNPROVIDED);
        module0642.f39026((SubLObject)module0659.TWO_INTEGER);
        return (SubLObject)module0659.NIL;
    }
    
    public static SubLObject f40135() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0659", "f40063", "S#44080", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0659", "f40064", "S#44081", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0659", "f40065", "S#44082", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0659", "f40067", "S#44083", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0659", "f40068", "S#44078", 1, 0, false);
        new $f40068$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0659", "f40066", "S#44084", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0659", "f40069", "S#44085", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0659", "f40070", "S#44086", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0659", "f40071", "S#44087", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0659", "f40072", "S#44088", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0659", "f40073", "S#44089", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0659", "f40074", "S#44090", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0659", "f40075", "S#44091", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0659", "f40076", "S#44092", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0659", "f40077", "S#44093", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0659", "f40078", "S#44094", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0659", "f40079", "S#44095", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0659", "f40080", "S#44096", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0659", "f40081", "S#44097", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0659", "f40082", "S#44098", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0659", "f40083", "S#44099", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0659", "f40084", "S#44100", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0659", "f40085", "S#44101", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0659", "f40086", "S#44102", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0659", "f40087", "S#44103", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0659", "f40088", "S#44104", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0659", "f40089", "S#44105", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0659", "f40090", "S#44106", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0659", "f40091", "S#44107", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0659", "f40092", "S#44108", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0659", "f40093", "S#44109", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0659", "f40094", "S#44110", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0659", "f40095", "S#44111", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0659", "f40096", "S#44112", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0659", "f40097", "S#44113", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0659", "f40098", "S#44114", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0659", "f40099", "S#44115", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0659", "f40100", "S#44116", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0659", "f40101", "S#44117", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0659", "f40102", "S#44118", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0659", "f40103", "S#44119", 1, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0659", "f40105", "S#44120");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0659", "f40104", "S#44121", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0659", "f40106", "S#44122", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0659", "f40107", "S#44123", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0659", "f40108", "S#44124", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0659", "f40109", "S#44125", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0659", "f40111", "S#44126", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0659", "f40112", "S#44127", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0659", "f40113", "S#44128", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0659", "f40110", "S#44129", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0659", "f40114", "S#44130", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0659", "f40115", "S#44131", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0659", "f40116", "S#43762", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0659", "f40117", "S#44132", 4, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0659", "f40118", "S#44133", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0659", "f40119", "S#44134", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0659", "f40120", "S#44135", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0659", "f40121", "S#44136", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0659", "f40122", "S#44137", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0659", "f40123", "S#44138", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0659", "f40124", "S#44139", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0659", "f40125", "S#44140", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0659", "f40126", "S#44141", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0659", "f40127", "S#44142", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0659", "f40128", "S#44143", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0659", "f40129", "S#44144", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0659", "f40130", "S#44145", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0659", "f40131", "CB-VIEW-ADORN", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0659", "f40132", "CB-ADORNMENT-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0659", "f40133", "S#44146", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0659", "f40134", "S#44147", 1, 0, false);
        return (SubLObject)module0659.NIL;
    }
    
    public static SubLObject f40136() {
        module0659.$g5189$ = SubLFiles.defparameter("S#44148", (SubLObject)module0659.$ic0$);
        module0659.$g5190$ = SubLFiles.defparameter("S#44149", (SubLObject)module0659.NIL);
        module0659.$g5191$ = SubLFiles.defparameter("S#44150", (SubLObject)module0659.NIL);
        module0659.$g5192$ = SubLFiles.defparameter("S#44151", (SubLObject)module0659.NIL);
        module0659.$g5193$ = SubLFiles.defparameter("S#44152", (SubLObject)module0659.NIL);
        module0659.$g5194$ = SubLFiles.defparameter("S#44153", (SubLObject)module0659.NIL);
        module0659.$g5195$ = SubLFiles.deflexical("S#44154", (SubLObject)module0659.$ic1$);
        module0659.$g5196$ = SubLFiles.defconstant("S#44155", (SubLObject)module0659.$ic6$);
        module0659.$g5197$ = SubLFiles.deflexical("S#44156", (SubLObject)((module0659.NIL != Symbols.boundp((SubLObject)module0659.$ic66$)) ? module0659.$g5197$.getGlobalValue() : module0659.NIL));
        module0659.$g5198$ = SubLFiles.defparameter("S#44157", (SubLObject)module0659.NIL);
        return (SubLObject)module0659.NIL;
    }
    
    public static SubLObject f40137() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0659.$g5196$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0659.$ic13$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0659.$ic14$);
        Structures.def_csetf((SubLObject)module0659.$ic15$, (SubLObject)module0659.$ic16$);
        Structures.def_csetf((SubLObject)module0659.$ic17$, (SubLObject)module0659.$ic18$);
        Structures.def_csetf((SubLObject)module0659.$ic19$, (SubLObject)module0659.$ic20$);
        Structures.def_csetf((SubLObject)module0659.$ic21$, (SubLObject)module0659.$ic22$);
        Structures.def_csetf((SubLObject)module0659.$ic23$, (SubLObject)module0659.$ic24$);
        Structures.def_csetf((SubLObject)module0659.$ic25$, (SubLObject)module0659.$ic26$);
        Structures.def_csetf((SubLObject)module0659.$ic27$, (SubLObject)module0659.$ic28$);
        Structures.def_csetf((SubLObject)module0659.$ic29$, (SubLObject)module0659.$ic30$);
        Structures.def_csetf((SubLObject)module0659.$ic31$, (SubLObject)module0659.$ic32$);
        Structures.def_csetf((SubLObject)module0659.$ic33$, (SubLObject)module0659.$ic34$);
        Structures.def_csetf((SubLObject)module0659.$ic35$, (SubLObject)module0659.$ic36$);
        Structures.def_csetf((SubLObject)module0659.$ic37$, (SubLObject)module0659.$ic38$);
        Structures.def_csetf((SubLObject)module0659.$ic39$, (SubLObject)module0659.$ic40$);
        Structures.def_csetf((SubLObject)module0659.$ic41$, (SubLObject)module0659.$ic42$);
        Structures.def_csetf((SubLObject)module0659.$ic43$, (SubLObject)module0659.$ic44$);
        Equality.identity((SubLObject)module0659.$ic6$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0659.$g5196$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0659.$ic65$));
        module0003.f57((SubLObject)module0659.$ic66$);
        Hashtables.sethash((SubLObject)module0659.$ic95$, module0014.$g128$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0659.$ic96$, (SubLObject)module0659.NIL));
        Hashtables.sethash((SubLObject)module0659.$ic97$, module0014.$g128$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0659.$ic98$, (SubLObject)module0659.NIL));
        SubLObject var114 = module0659.$g5197$.getGlobalValue();
        SubLObject var115 = f40098((SubLObject)module0659.$ic99$);
        f40083(var115, (SubLObject)module0659.$ic100$);
        module0659.$g5197$.setGlobalValue((SubLObject)ConsesLow.cons(var115, Sequences.delete((SubLObject)module0659.$ic100$, var114, Symbols.symbol_function((SubLObject)module0659.EQUAL), Symbols.symbol_function((SubLObject)module0659.$ic15$), (SubLObject)module0659.UNPROVIDED, (SubLObject)module0659.UNPROVIDED, (SubLObject)module0659.UNPROVIDED)));
        var114 = module0659.$g5197$.getGlobalValue();
        var115 = f40098((SubLObject)module0659.$ic101$);
        f40083(var115, (SubLObject)module0659.$ic102$);
        module0659.$g5197$.setGlobalValue((SubLObject)ConsesLow.cons(var115, Sequences.delete((SubLObject)module0659.$ic102$, var114, Symbols.symbol_function((SubLObject)module0659.EQUAL), Symbols.symbol_function((SubLObject)module0659.$ic15$), (SubLObject)module0659.UNPROVIDED, (SubLObject)module0659.UNPROVIDED, (SubLObject)module0659.UNPROVIDED)));
        Hashtables.sethash((SubLObject)module0659.$ic103$, module0014.$g128$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0659.$ic104$, (SubLObject)module0659.NIL));
        var114 = module0659.$g5197$.getGlobalValue();
        var115 = f40098((SubLObject)module0659.$ic105$);
        f40083(var115, (SubLObject)module0659.$ic106$);
        module0659.$g5197$.setGlobalValue((SubLObject)ConsesLow.cons(var115, Sequences.delete((SubLObject)module0659.$ic106$, var114, Symbols.symbol_function((SubLObject)module0659.EQUAL), Symbols.symbol_function((SubLObject)module0659.$ic15$), (SubLObject)module0659.UNPROVIDED, (SubLObject)module0659.UNPROVIDED, (SubLObject)module0659.UNPROVIDED)));
        Hashtables.sethash((SubLObject)module0659.$ic107$, module0014.$g128$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0659.$ic108$, (SubLObject)module0659.NIL));
        Hashtables.sethash((SubLObject)module0659.$ic112$, module0014.$g128$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0659.$ic113$, (SubLObject)module0659.NIL));
        var114 = module0659.$g5197$.getGlobalValue();
        var115 = f40098((SubLObject)module0659.$ic114$);
        f40083(var115, (SubLObject)module0659.$ic115$);
        module0659.$g5197$.setGlobalValue((SubLObject)ConsesLow.cons(var115, Sequences.delete((SubLObject)module0659.$ic115$, var114, Symbols.symbol_function((SubLObject)module0659.EQUAL), Symbols.symbol_function((SubLObject)module0659.$ic15$), (SubLObject)module0659.UNPROVIDED, (SubLObject)module0659.UNPROVIDED, (SubLObject)module0659.UNPROVIDED)));
        Hashtables.sethash((SubLObject)module0659.$ic116$, module0014.$g128$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0659.$ic117$, (SubLObject)module0659.NIL));
        Hashtables.sethash((SubLObject)module0659.$ic118$, module0014.$g128$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0659.$ic119$, (SubLObject)module0659.NIL));
        var114 = module0659.$g5197$.getGlobalValue();
        var115 = f40098((SubLObject)module0659.$ic120$);
        f40083(var115, (SubLObject)module0659.$ic121$);
        module0659.$g5197$.setGlobalValue((SubLObject)ConsesLow.cons(var115, Sequences.delete((SubLObject)module0659.$ic121$, var114, Symbols.symbol_function((SubLObject)module0659.EQUAL), Symbols.symbol_function((SubLObject)module0659.$ic15$), (SubLObject)module0659.UNPROVIDED, (SubLObject)module0659.UNPROVIDED, (SubLObject)module0659.UNPROVIDED)));
        Hashtables.sethash((SubLObject)module0659.$ic122$, module0014.$g128$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0659.$ic123$, (SubLObject)module0659.NIL));
        Hashtables.sethash((SubLObject)module0659.$ic124$, module0014.$g128$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0659.$ic125$, (SubLObject)module0659.NIL));
        var114 = module0659.$g5197$.getGlobalValue();
        var115 = f40098((SubLObject)module0659.$ic126$);
        f40083(var115, (SubLObject)module0659.$ic127$);
        module0659.$g5197$.setGlobalValue((SubLObject)ConsesLow.cons(var115, Sequences.delete((SubLObject)module0659.$ic127$, var114, Symbols.symbol_function((SubLObject)module0659.EQUAL), Symbols.symbol_function((SubLObject)module0659.$ic15$), (SubLObject)module0659.UNPROVIDED, (SubLObject)module0659.UNPROVIDED, (SubLObject)module0659.UNPROVIDED)));
        Hashtables.sethash((SubLObject)module0659.$ic128$, module0014.$g128$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0659.$ic129$, (SubLObject)module0659.$ic130$));
        Hashtables.sethash((SubLObject)module0659.$ic131$, module0014.$g128$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0659.$ic132$, (SubLObject)module0659.$ic130$));
        Hashtables.sethash((SubLObject)module0659.$ic133$, module0014.$g128$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0659.$ic134$, (SubLObject)module0659.$ic130$));
        Hashtables.sethash((SubLObject)module0659.$ic135$, module0014.$g128$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0659.$ic129$, (SubLObject)module0659.$ic130$));
        Hashtables.sethash((SubLObject)module0659.$ic136$, module0014.$g128$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0659.$ic132$, (SubLObject)module0659.$ic130$));
        Hashtables.sethash((SubLObject)module0659.$ic137$, module0014.$g128$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0659.$ic134$, (SubLObject)module0659.$ic130$));
        var114 = module0659.$g5197$.getGlobalValue();
        var115 = f40098((SubLObject)module0659.$ic139$);
        f40083(var115, (SubLObject)module0659.$ic140$);
        module0659.$g5197$.setGlobalValue((SubLObject)ConsesLow.cons(var115, Sequences.delete((SubLObject)module0659.$ic140$, var114, Symbols.symbol_function((SubLObject)module0659.EQUAL), Symbols.symbol_function((SubLObject)module0659.$ic15$), (SubLObject)module0659.UNPROVIDED, (SubLObject)module0659.UNPROVIDED, (SubLObject)module0659.UNPROVIDED)));
        var114 = module0659.$g5197$.getGlobalValue();
        var115 = f40098((SubLObject)module0659.$ic142$);
        f40083(var115, (SubLObject)module0659.$ic143$);
        module0659.$g5197$.setGlobalValue((SubLObject)ConsesLow.cons(var115, Sequences.delete((SubLObject)module0659.$ic143$, var114, Symbols.symbol_function((SubLObject)module0659.EQUAL), Symbols.symbol_function((SubLObject)module0659.$ic15$), (SubLObject)module0659.UNPROVIDED, (SubLObject)module0659.UNPROVIDED, (SubLObject)module0659.UNPROVIDED)));
        var114 = module0659.$g5197$.getGlobalValue();
        var115 = f40098((SubLObject)module0659.$ic145$);
        f40083(var115, (SubLObject)module0659.$ic146$);
        module0659.$g5197$.setGlobalValue((SubLObject)ConsesLow.cons(var115, Sequences.delete((SubLObject)module0659.$ic146$, var114, Symbols.symbol_function((SubLObject)module0659.EQUAL), Symbols.symbol_function((SubLObject)module0659.$ic15$), (SubLObject)module0659.UNPROVIDED, (SubLObject)module0659.UNPROVIDED, (SubLObject)module0659.UNPROVIDED)));
        Hashtables.sethash((SubLObject)module0659.$ic150$, module0014.$g128$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0659.$ic151$, (SubLObject)module0659.NIL));
        var114 = module0659.$g5197$.getGlobalValue();
        var115 = f40098((SubLObject)module0659.$ic152$);
        f40083(var115, (SubLObject)module0659.$ic153$);
        module0659.$g5197$.setGlobalValue((SubLObject)ConsesLow.cons(var115, Sequences.delete((SubLObject)module0659.$ic153$, var114, Symbols.symbol_function((SubLObject)module0659.EQUAL), Symbols.symbol_function((SubLObject)module0659.$ic15$), (SubLObject)module0659.UNPROVIDED, (SubLObject)module0659.UNPROVIDED, (SubLObject)module0659.UNPROVIDED)));
        Hashtables.sethash((SubLObject)module0659.$ic154$, module0014.$g128$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0659.$ic155$, (SubLObject)module0659.NIL));
        var114 = module0659.$g5197$.getGlobalValue();
        var115 = f40098((SubLObject)module0659.$ic156$);
        f40083(var115, (SubLObject)module0659.$ic157$);
        module0659.$g5197$.setGlobalValue((SubLObject)ConsesLow.cons(var115, Sequences.delete((SubLObject)module0659.$ic157$, var114, Symbols.symbol_function((SubLObject)module0659.EQUAL), Symbols.symbol_function((SubLObject)module0659.$ic15$), (SubLObject)module0659.UNPROVIDED, (SubLObject)module0659.UNPROVIDED, (SubLObject)module0659.UNPROVIDED)));
        module0012.f441((SubLObject)module0659.$ic158$);
        Hashtables.sethash((SubLObject)module0659.$ic159$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0659.$ic160$, (SubLObject)module0659.NIL));
        module0015.f873((SubLObject)module0659.$ic199$);
        module0015.f873((SubLObject)module0659.$ic203$);
        module0656.f39840((SubLObject)module0659.$ic206$, (SubLObject)module0659.$ic207$, (SubLObject)module0659.TWO_INTEGER);
        return (SubLObject)module0659.NIL;
    }
    
    public void declareFunctions() {
        f40135();
    }
    
    public void initializeVariables() {
        f40136();
    }
    
    public void runTopLevelForms() {
        f40137();
    }
    
    static {
        me = (SubLFile)new module0659();
        module0659.$g5189$ = null;
        module0659.$g5190$ = null;
        module0659.$g5191$ = null;
        module0659.$g5192$ = null;
        module0659.$g5193$ = null;
        module0659.$g5194$ = null;
        module0659.$g5195$ = null;
        module0659.$g5196$ = null;
        module0659.$g5197$ = null;
        module0659.$g5198$ = null;
        $ic0$ = SubLObjectFactory.makeKeyword("MAIN");
        $ic1$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#44158", "CYC"), SubLObjectFactory.makeSymbol("S#44159", "CYC"), SubLObjectFactory.makeSymbol("S#44160", "CYC"), SubLObjectFactory.makeSymbol("S#44161", "CYC"), SubLObjectFactory.makeSymbol("S#44162", "CYC"), SubLObjectFactory.makeSymbol("S#44163", "CYC"), SubLObjectFactory.makeSymbol("S#44164", "CYC"), SubLObjectFactory.makeSymbol("S#44165", "CYC"), SubLObjectFactory.makeSymbol("S#44166", "CYC"), SubLObjectFactory.makeSymbol("S#44167", "CYC"), SubLObjectFactory.makeSymbol("S#44168", "CYC"), SubLObjectFactory.makeSymbol("S#44169", "CYC"), SubLObjectFactory.makeSymbol("S#44170", "CYC") });
        $ic2$ = SubLObjectFactory.makeString("#");
        $ic3$ = SubLObjectFactory.makeString("#<");
        $ic4$ = SubLObjectFactory.makeKeyword("STREAM");
        $ic5$ = SubLObjectFactory.makeKeyword("BASE");
        $ic6$ = SubLObjectFactory.makeSymbol("S#44077", "CYC");
        $ic7$ = SubLObjectFactory.makeSymbol("S#44078", "CYC");
        $ic8$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#29", "CYC"), SubLObjectFactory.makeSymbol("TYPE"), SubLObjectFactory.makeSymbol("S#44171", "CYC"), SubLObjectFactory.makeSymbol("S#9329", "CYC"), SubLObjectFactory.makeSymbol("S#44172", "CYC"), SubLObjectFactory.makeSymbol("S#44173", "CYC"), SubLObjectFactory.makeSymbol("S#44174", "CYC"), SubLObjectFactory.makeSymbol("S#1518", "CYC"), SubLObjectFactory.makeSymbol("S#44175", "CYC"), SubLObjectFactory.makeSymbol("S#44176", "CYC"), SubLObjectFactory.makeSymbol("S#1755", "CYC"), SubLObjectFactory.makeSymbol("S#44177", "CYC"), SubLObjectFactory.makeSymbol("COMMENT"), SubLObjectFactory.makeSymbol("S#44178", "CYC"), SubLObjectFactory.makeSymbol("S#1523", "CYC") });
        $ic9$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeKeyword("TYPE"), SubLObjectFactory.makeKeyword("ACTIVE-P"), SubLObjectFactory.makeKeyword("IMAGE"), SubLObjectFactory.makeKeyword("IMAGE-DISABLED"), SubLObjectFactory.makeKeyword("IMAGE-ALT"), SubLObjectFactory.makeKeyword("DYNAMIC-TAGFN"), SubLObjectFactory.makeKeyword("COLOR"), SubLObjectFactory.makeKeyword("LETTER"), SubLObjectFactory.makeKeyword("EFFECTIVE-FN"), SubLObjectFactory.makeKeyword("HANDLER"), SubLObjectFactory.makeKeyword("TOOL"), SubLObjectFactory.makeKeyword("COMMENT"), SubLObjectFactory.makeKeyword("DYNAMIC-COMMENT"), SubLObjectFactory.makeKeyword("TITLE") });
        $ic10$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#44084", "CYC"), SubLObjectFactory.makeSymbol("S#44085", "CYC"), SubLObjectFactory.makeSymbol("S#44086", "CYC"), SubLObjectFactory.makeSymbol("S#44087", "CYC"), SubLObjectFactory.makeSymbol("S#44088", "CYC"), SubLObjectFactory.makeSymbol("S#44089", "CYC"), SubLObjectFactory.makeSymbol("S#44090", "CYC"), SubLObjectFactory.makeSymbol("S#44091", "CYC"), SubLObjectFactory.makeSymbol("S#44092", "CYC"), SubLObjectFactory.makeSymbol("S#44093", "CYC"), SubLObjectFactory.makeSymbol("S#44094", "CYC"), SubLObjectFactory.makeSymbol("S#44095", "CYC"), SubLObjectFactory.makeSymbol("S#44096", "CYC"), SubLObjectFactory.makeSymbol("S#44097", "CYC"), SubLObjectFactory.makeSymbol("S#44098", "CYC") });
        $ic11$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#44099", "CYC"), SubLObjectFactory.makeSymbol("S#44100", "CYC"), SubLObjectFactory.makeSymbol("S#44101", "CYC"), SubLObjectFactory.makeSymbol("S#44102", "CYC"), SubLObjectFactory.makeSymbol("S#44103", "CYC"), SubLObjectFactory.makeSymbol("S#44104", "CYC"), SubLObjectFactory.makeSymbol("S#44105", "CYC"), SubLObjectFactory.makeSymbol("S#44106", "CYC"), SubLObjectFactory.makeSymbol("S#44107", "CYC"), SubLObjectFactory.makeSymbol("S#44108", "CYC"), SubLObjectFactory.makeSymbol("S#44109", "CYC"), SubLObjectFactory.makeSymbol("S#44110", "CYC"), SubLObjectFactory.makeSymbol("S#44111", "CYC"), SubLObjectFactory.makeSymbol("S#44112", "CYC"), SubLObjectFactory.makeSymbol("S#44113", "CYC") });
        $ic12$ = SubLObjectFactory.makeSymbol("S#44082", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("S#44083", "CYC");
        $ic14$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#44078", "CYC"));
        $ic15$ = SubLObjectFactory.makeSymbol("S#44084", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("S#44099", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("S#44085", "CYC");
        $ic18$ = SubLObjectFactory.makeSymbol("S#44100", "CYC");
        $ic19$ = SubLObjectFactory.makeSymbol("S#44086", "CYC");
        $ic20$ = SubLObjectFactory.makeSymbol("S#44101", "CYC");
        $ic21$ = SubLObjectFactory.makeSymbol("S#44087", "CYC");
        $ic22$ = SubLObjectFactory.makeSymbol("S#44102", "CYC");
        $ic23$ = SubLObjectFactory.makeSymbol("S#44088", "CYC");
        $ic24$ = SubLObjectFactory.makeSymbol("S#44103", "CYC");
        $ic25$ = SubLObjectFactory.makeSymbol("S#44089", "CYC");
        $ic26$ = SubLObjectFactory.makeSymbol("S#44104", "CYC");
        $ic27$ = SubLObjectFactory.makeSymbol("S#44090", "CYC");
        $ic28$ = SubLObjectFactory.makeSymbol("S#44105", "CYC");
        $ic29$ = SubLObjectFactory.makeSymbol("S#44091", "CYC");
        $ic30$ = SubLObjectFactory.makeSymbol("S#44106", "CYC");
        $ic31$ = SubLObjectFactory.makeSymbol("S#44092", "CYC");
        $ic32$ = SubLObjectFactory.makeSymbol("S#44107", "CYC");
        $ic33$ = SubLObjectFactory.makeSymbol("S#44093", "CYC");
        $ic34$ = SubLObjectFactory.makeSymbol("S#44108", "CYC");
        $ic35$ = SubLObjectFactory.makeSymbol("S#44094", "CYC");
        $ic36$ = SubLObjectFactory.makeSymbol("S#44109", "CYC");
        $ic37$ = SubLObjectFactory.makeSymbol("S#44095", "CYC");
        $ic38$ = SubLObjectFactory.makeSymbol("S#44110", "CYC");
        $ic39$ = SubLObjectFactory.makeSymbol("S#44096", "CYC");
        $ic40$ = SubLObjectFactory.makeSymbol("S#44111", "CYC");
        $ic41$ = SubLObjectFactory.makeSymbol("S#44097", "CYC");
        $ic42$ = SubLObjectFactory.makeSymbol("S#44112", "CYC");
        $ic43$ = SubLObjectFactory.makeSymbol("S#44098", "CYC");
        $ic44$ = SubLObjectFactory.makeSymbol("S#44113", "CYC");
        $ic45$ = SubLObjectFactory.makeKeyword("NAME");
        $ic46$ = SubLObjectFactory.makeKeyword("TYPE");
        $ic47$ = SubLObjectFactory.makeKeyword("ACTIVE-P");
        $ic48$ = SubLObjectFactory.makeKeyword("IMAGE");
        $ic49$ = SubLObjectFactory.makeKeyword("IMAGE-DISABLED");
        $ic50$ = SubLObjectFactory.makeKeyword("IMAGE-ALT");
        $ic51$ = SubLObjectFactory.makeKeyword("DYNAMIC-TAGFN");
        $ic52$ = SubLObjectFactory.makeKeyword("COLOR");
        $ic53$ = SubLObjectFactory.makeKeyword("LETTER");
        $ic54$ = SubLObjectFactory.makeKeyword("EFFECTIVE-FN");
        $ic55$ = SubLObjectFactory.makeKeyword("HANDLER");
        $ic56$ = SubLObjectFactory.makeKeyword("TOOL");
        $ic57$ = SubLObjectFactory.makeKeyword("COMMENT");
        $ic58$ = SubLObjectFactory.makeKeyword("DYNAMIC-COMMENT");
        $ic59$ = SubLObjectFactory.makeKeyword("TITLE");
        $ic60$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic61$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic62$ = SubLObjectFactory.makeSymbol("S#44114", "CYC");
        $ic63$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic64$ = SubLObjectFactory.makeKeyword("END");
        $ic65$ = SubLObjectFactory.makeSymbol("S#44116", "CYC");
        $ic66$ = SubLObjectFactory.makeSymbol("S#44156", "CYC");
        $ic67$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#30", "CYC"));
        $ic68$ = SubLObjectFactory.makeUninternedSymbol("US#1327892");
        $ic69$ = SubLObjectFactory.makeUninternedSymbol("US#7167096");
        $ic70$ = SubLObjectFactory.makeSymbol("CLET");
        $ic71$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#44156", "CYC"));
        $ic72$ = SubLObjectFactory.makeSymbol("QUOTE");
        $ic73$ = SubLObjectFactory.makeSymbol("CSETF");
        $ic74$ = SubLObjectFactory.makeSymbol("CSETQ");
        $ic75$ = SubLObjectFactory.makeSymbol("CONS");
        $ic76$ = SubLObjectFactory.makeSymbol("DELETE");
        $ic77$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)module0659.EQUAL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("S#44084", "CYC")));
        $ic78$ = SubLObjectFactory.makeSymbol("S#44117", "CYC");
        $ic79$ = SubLObjectFactory.makeKeyword("ASSERTION");
        $ic80$ = SubLObjectFactory.makeKeyword("DEDUCTION");
        $ic81$ = SubLObjectFactory.makeKeyword("INDEX-CONSTANT-NAME");
        $ic82$ = SubLObjectFactory.makeKeyword("INDEX-FORT");
        $ic83$ = SubLObjectFactory.makeKeyword("INDEX-CONSTANT");
        $ic84$ = SubLObjectFactory.makeKeyword("CONSTANT");
        $ic85$ = SubLObjectFactory.makeKeyword("GAF-ARG-PREDICATE");
        $ic86$ = SubLObjectFactory.makeKeyword("INDEX-TERM");
        $ic87$ = SubLObjectFactory.makeKeyword("TOP");
        $ic88$ = SubLObjectFactory.makeString("cb-start|");
        $ic89$ = SubLObjectFactory.makeString("~a&~a");
        $ic90$ = SubLObjectFactory.makeString("~a&~a&~a&~a");
        $ic91$ = SubLObjectFactory.makeString("~a&~a&~a");
        $ic92$ = SubLObjectFactory.makeKeyword("CENTER");
        $ic93$ = SubLObjectFactory.makeSymbol("S#44127", "CYC");
        $ic94$ = SubLObjectFactory.makeSymbol("S#44131", "CYC");
        $ic95$ = SubLObjectFactory.makeKeyword("INDEX-BROWSER");
        $ic96$ = SubLObjectFactory.makeString("index-browser.gif");
        $ic97$ = SubLObjectFactory.makeKeyword("INDEX-BROWSER-DISABLED");
        $ic98$ = SubLObjectFactory.makeString("index-browser-disabled.gif");
        $ic99$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("TYPE"), SubLObjectFactory.makeKeyword("INDEX-TERM"), SubLObjectFactory.makeKeyword("ACTIVE-P"), module0659.T, SubLObjectFactory.makeKeyword("IMAGE"), SubLObjectFactory.makeKeyword("INDEX-BROWSER"), SubLObjectFactory.makeKeyword("IMAGE-DISABLED"), SubLObjectFactory.makeKeyword("INDEX-BROWSER-DISABLED"), SubLObjectFactory.makeKeyword("IMAGE-ALT"), SubLObjectFactory.makeString("[Indices]"), SubLObjectFactory.makeKeyword("EFFECTIVE-FN"), SubLObjectFactory.makeSymbol("S#37390", "CYC"), SubLObjectFactory.makeKeyword("HANDLER"), SubLObjectFactory.makeString("cb-cf"), SubLObjectFactory.makeKeyword("TITLE"), SubLObjectFactory.makeString("Index Browser"), SubLObjectFactory.makeKeyword("COMMENT"), SubLObjectFactory.makeString("Links you to the index view for a term.") });
        $ic100$ = SubLObjectFactory.makeSymbol("S#44179", "CYC");
        $ic101$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("TYPE"), SubLObjectFactory.makeKeyword("ASSERTION"), SubLObjectFactory.makeKeyword("ACTIVE-P"), module0659.T, SubLObjectFactory.makeKeyword("COLOR"), SubLObjectFactory.makeKeyword("YELLOW"), SubLObjectFactory.makeKeyword("LETTER"), SubLObjectFactory.makeString("M"), SubLObjectFactory.makeKeyword("EFFECTIVE-FN"), SubLObjectFactory.makeSymbol("ASSERTION-HAS-META-ASSERTIONS?"), SubLObjectFactory.makeKeyword("COMMENT"), SubLObjectFactory.makeString("Indicates that some meta-assertion has been made, that is, an assertion where one of the arguments is this assertion.") });
        $ic102$ = SubLObjectFactory.makeSymbol("S#44168", "CYC");
        $ic103$ = SubLObjectFactory.makeKeyword("CY-MENU");
        $ic104$ = SubLObjectFactory.makeString("cy_menu.gif");
        $ic105$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("TYPE"), SubLObjectFactory.makeKeyword("ASSERTION"), SubLObjectFactory.makeKeyword("ACTIVE-P"), module0659.NIL, SubLObjectFactory.makeKeyword("IMAGE"), SubLObjectFactory.makeKeyword("CY-MENU"), SubLObjectFactory.makeKeyword("IMAGE-ALT"), SubLObjectFactory.makeString("[KE Assertion Review]"), SubLObjectFactory.makeKeyword("EFFECTIVE-FN"), SubLObjectFactory.makeSymbol("S#44180", "CYC"), SubLObjectFactory.makeKeyword("HANDLER"), SubLObjectFactory.makeString("cb-taf"), SubLObjectFactory.makeKeyword("TOOL"), SubLObjectFactory.makeKeyword("KE-REVIEW"), SubLObjectFactory.makeKeyword("COMMENT"), SubLObjectFactory.makeString("Links to a special page for reviewing this assertion (support of #$MyReviewer).") });
        $ic106$ = SubLObjectFactory.makeSymbol("S#44167", "CYC");
        $ic107$ = SubLObjectFactory.makeKeyword("BL-MENU");
        $ic108$ = SubLObjectFactory.makeString("bl_menu.gif");
        $ic109$ = ConsesLow.list((SubLObject)module0659.ONE_INTEGER, (SubLObject)module0659.TWO_INTEGER);
        $ic110$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic111$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic112$ = SubLObjectFactory.makeKeyword("RED-DIAMOND");
        $ic113$ = SubLObjectFactory.makeString("red_diam.gif");
        $ic114$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("TYPE"), SubLObjectFactory.makeKeyword("GAF-ARG-PREDICATE"), SubLObjectFactory.makeKeyword("ACTIVE-P"), module0659.T, SubLObjectFactory.makeKeyword("IMAGE"), SubLObjectFactory.makeKeyword("RED-DIAMOND"), SubLObjectFactory.makeKeyword("IMAGE-ALT"), SubLObjectFactory.makeString("[Hier]"), SubLObjectFactory.makeKeyword("EFFECTIVE-FN"), SubLObjectFactory.makeSymbol("S#44134", "CYC"), SubLObjectFactory.makeKeyword("HANDLER"), SubLObjectFactory.makeString("cb-hier"), SubLObjectFactory.makeKeyword("TOOL"), SubLObjectFactory.makeKeyword("HIERARCHY-BROWSER"), SubLObjectFactory.makeKeyword("TITLE"), SubLObjectFactory.makeString("Hierarchy Browser"), SubLObjectFactory.makeKeyword("COMMENT"), SubLObjectFactory.makeString("Lets you browse the isa hierarchy.") });
        $ic115$ = SubLObjectFactory.makeSymbol("S#44162", "CYC");
        $ic116$ = SubLObjectFactory.makeKeyword("HIERARCHY-BROWSER");
        $ic117$ = SubLObjectFactory.makeString("hierarchy-browser.gif");
        $ic118$ = SubLObjectFactory.makeKeyword("HIERARCHY-BROWSER-DISABLED");
        $ic119$ = SubLObjectFactory.makeString("hierarchy-browser-disabled.gif");
        $ic120$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("TYPE"), SubLObjectFactory.makeKeyword("INDEX-CONSTANT"), SubLObjectFactory.makeKeyword("ACTIVE-P"), module0659.T, SubLObjectFactory.makeKeyword("IMAGE"), SubLObjectFactory.makeKeyword("HIERARCHY-BROWSER"), SubLObjectFactory.makeKeyword("IMAGE-DISABLED"), SubLObjectFactory.makeKeyword("HIERARCHY-BROWSER-DISABLED"), SubLObjectFactory.makeKeyword("IMAGE-ALT"), SubLObjectFactory.makeString("[Hier]"), SubLObjectFactory.makeKeyword("EFFECTIVE-FN"), SubLObjectFactory.makeSymbol("S#44181", "CYC"), SubLObjectFactory.makeKeyword("HANDLER"), SubLObjectFactory.makeString("cb-hier-default"), SubLObjectFactory.makeKeyword("TOOL"), SubLObjectFactory.makeKeyword("HIERARCHY-BROWSER"), SubLObjectFactory.makeKeyword("TITLE"), SubLObjectFactory.makeString("Hierarchy Browser"), SubLObjectFactory.makeKeyword("COMMENT"), SubLObjectFactory.makeString("Lets you browse the isa hierarchy.") });
        $ic121$ = SubLObjectFactory.makeSymbol("S#44161", "CYC");
        $ic122$ = SubLObjectFactory.makeKeyword("ALPHA-BROWSER");
        $ic123$ = SubLObjectFactory.makeString("alpha-browser.gif");
        $ic124$ = SubLObjectFactory.makeKeyword("ALPHA-BROWSER-DISABLED");
        $ic125$ = SubLObjectFactory.makeString("alpha-browser-disabled.gif");
        $ic126$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("TYPE"), SubLObjectFactory.makeKeyword("INDEX-CONSTANT-NAME"), SubLObjectFactory.makeKeyword("ACTIVE-P"), module0659.T, SubLObjectFactory.makeKeyword("IMAGE"), SubLObjectFactory.makeKeyword("ALPHA-BROWSER"), SubLObjectFactory.makeKeyword("IMAGE-DISABLED"), SubLObjectFactory.makeKeyword("ALPHA-BROWSER-DISABLED"), SubLObjectFactory.makeKeyword("IMAGE-ALT"), SubLObjectFactory.makeString("[Alpha]"), SubLObjectFactory.makeKeyword("EFFECTIVE-FN"), SubLObjectFactory.makeSymbol("S#44135", "CYC"), SubLObjectFactory.makeKeyword("HANDLER"), SubLObjectFactory.makeString("cb-ad"), SubLObjectFactory.makeKeyword("TOOL"), SubLObjectFactory.makeKeyword("ALPHA-TOP"), SubLObjectFactory.makeKeyword("TITLE"), SubLObjectFactory.makeString("Alphabetical Browser"), SubLObjectFactory.makeKeyword("COMMENT"), SubLObjectFactory.makeString("Links you to the alphabetical list of FORTs") });
        $ic127$ = SubLObjectFactory.makeSymbol("S#44158", "CYC");
        $ic128$ = SubLObjectFactory.makeKeyword("PLUS-GREEN");
        $ic129$ = SubLObjectFactory.makeString("plus-green.gif");
        $ic130$ = SubLObjectFactory.makeString("[LitQ]");
        $ic131$ = SubLObjectFactory.makeKeyword("PLUS-YELLOW");
        $ic132$ = SubLObjectFactory.makeString("plus-yellow.gif");
        $ic133$ = SubLObjectFactory.makeKeyword("PLUS-PURPLE");
        $ic134$ = SubLObjectFactory.makeString("plus-purple.gif");
        $ic135$ = SubLObjectFactory.makeKeyword("LIKELY");
        $ic136$ = SubLObjectFactory.makeKeyword("KNOWN");
        $ic137$ = SubLObjectFactory.makeKeyword("POSSIBLE");
        $ic138$ = SubLObjectFactory.makeKeyword("INDEX");
        $ic139$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("TYPE"), SubLObjectFactory.makeKeyword("GAF-ARG-PREDICATE-CONTENT"), SubLObjectFactory.makeKeyword("ACTIVE-P"), module0659.T, SubLObjectFactory.makeKeyword("IMAGE"), SubLObjectFactory.makeSymbol("S#44138", "CYC"), SubLObjectFactory.makeKeyword("IMAGE-ALT"), SubLObjectFactory.makeString("[LitQ]"), SubLObjectFactory.makeKeyword("EFFECTIVE-FN"), SubLObjectFactory.makeSymbol("S#44136", "CYC"), SubLObjectFactory.makeKeyword("HANDLER"), SubLObjectFactory.makeString("cb-lq"), SubLObjectFactory.makeKeyword("TOOL"), SubLObjectFactory.makeKeyword("ASK"), SubLObjectFactory.makeKeyword("COMMENT"), SubLObjectFactory.makeString("There are likely to be some additional derivable relations; this establishes them.") });
        $ic140$ = SubLObjectFactory.makeSymbol("S#44165", "CYC");
        $ic141$ = SubLObjectFactory.makeKeyword("NORMAL");
        $ic142$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("TYPE"), SubLObjectFactory.makeKeyword("GAF-ARG-PREDICATEX"), SubLObjectFactory.makeKeyword("ACTIVE-P"), module0659.T, SubLObjectFactory.makeKeyword("IMAGE"), SubLObjectFactory.makeSymbol("S#44139", "CYC"), SubLObjectFactory.makeKeyword("IMAGE-ALT"), SubLObjectFactory.makeString("[LitQ]"), SubLObjectFactory.makeKeyword("EFFECTIVE-FN"), SubLObjectFactory.makeSymbol("S#44137", "CYC"), SubLObjectFactory.makeKeyword("HANDLER"), SubLObjectFactory.makeString("cb-lq"), SubLObjectFactory.makeKeyword("TOOL"), SubLObjectFactory.makeKeyword("ASK"), SubLObjectFactory.makeKeyword("COMMENT"), SubLObjectFactory.makeString("If Green, there are likely to be some additional derivable relations; if yellow, it is possible there are additional relations. This establishes them.") });
        $ic143$ = SubLObjectFactory.makeSymbol("S#44164", "CYC");
        $ic144$ = SubLObjectFactory.makeKeyword("INDEX-DISPLAY");
        $ic145$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("TYPE"), SubLObjectFactory.makeKeyword("GAF-ARG-PREDICATEX"), SubLObjectFactory.makeKeyword("ACTIVE-P"), module0659.T, SubLObjectFactory.makeKeyword("IMAGE"), SubLObjectFactory.makeSymbol("S#44140", "CYC"), SubLObjectFactory.makeKeyword("IMAGE-ALT"), SubLObjectFactory.makeString("[LitQ]"), SubLObjectFactory.makeKeyword("EFFECTIVE-FN"), SubLObjectFactory.makeSymbol("S#44141", "CYC"), SubLObjectFactory.makeKeyword("HANDLER"), SubLObjectFactory.makeString("cb-lq"), SubLObjectFactory.makeKeyword("TOOL"), SubLObjectFactory.makeKeyword("ASK"), SubLObjectFactory.makeKeyword("COMMENT"), SubLObjectFactory.makeString("If Green, there are likely to be some additional derivable relations; if yellow, it is possible there are additional relations. If purple, additional relations are unlikely to be found (but you won't know until you try). This establishes them.") });
        $ic146$ = SubLObjectFactory.makeSymbol("S#44163", "CYC");
        $ic147$ = SubLObjectFactory.makeString("[Asserted Argument]");
        $ic148$ = SubLObjectFactory.makeSymbol("S#44143", "CYC");
        $ic149$ = SubLObjectFactory.makeString("[Assertion Deductions]");
        $ic150$ = SubLObjectFactory.makeKeyword("BL-SDI");
        $ic151$ = SubLObjectFactory.makeString("bl_sdi.gif");
        $ic152$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("TYPE"), SubLObjectFactory.makeKeyword("ASSERTION"), SubLObjectFactory.makeKeyword("ACTIVE-P"), module0659.NIL, SubLObjectFactory.makeKeyword("IMAGE"), SubLObjectFactory.makeKeyword("BL-SDI"), SubLObjectFactory.makeKeyword("DYNAMIC-TAGFN"), SubLObjectFactory.makeSymbol("S#44142", "CYC"), SubLObjectFactory.makeKeyword("IMAGE-ALT"), SubLObjectFactory.makeSymbol("S#44142", "CYC"), SubLObjectFactory.makeKeyword("EFFECTIVE-FN"), SubLObjectFactory.makeSymbol("ASSERTED-ASSERTION?"), SubLObjectFactory.makeKeyword("COMMENT"), SubLObjectFactory.makeString("effective when the assertion has some asserted argument."), SubLObjectFactory.makeKeyword("DYNAMIC-COMMENT"), SubLObjectFactory.makeString("The asserted argument") });
        $ic153$ = SubLObjectFactory.makeSymbol("S#44170", "CYC");
        $ic154$ = SubLObjectFactory.makeKeyword("GR-SDI");
        $ic155$ = SubLObjectFactory.makeString("gr_sdi.gif");
        $ic156$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("TYPE"), SubLObjectFactory.makeKeyword("ASSERTION"), SubLObjectFactory.makeKeyword("ACTIVE-P"), module0659.NIL, SubLObjectFactory.makeKeyword("IMAGE"), SubLObjectFactory.makeKeyword("GR-SDI"), SubLObjectFactory.makeKeyword("DYNAMIC-TAGFN"), SubLObjectFactory.makeSymbol("S#44144", "CYC"), SubLObjectFactory.makeKeyword("IMAGE-ALT"), SubLObjectFactory.makeSymbol("S#44144", "CYC"), SubLObjectFactory.makeKeyword("EFFECTIVE-FN"), SubLObjectFactory.makeSymbol("DEDUCED-ASSERTION?"), SubLObjectFactory.makeKeyword("COMMENT"), SubLObjectFactory.makeString("effective when the assertion has some deduced argument."), SubLObjectFactory.makeKeyword("DYNAMIC-COMMENT"), SubLObjectFactory.makeString("List of deduced formulas") });
        $ic157$ = SubLObjectFactory.makeSymbol("S#44169", "CYC");
        $ic158$ = SubLObjectFactory.makeSymbol("S#44157", "CYC");
        $ic159$ = SubLObjectFactory.makeKeyword("CB-VIEW-ADORN");
        $ic160$ = SubLObjectFactory.makeString("cb-view-adorn.html");
        $ic161$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#44182", "CYC"));
        $ic162$ = SubLObjectFactory.makeString("~a does not specify an index");
        $ic163$ = SubLObjectFactory.makeString("Adornments");
        $ic164$ = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $ic165$ = SubLObjectFactory.makeKeyword("CB-CYC");
        $ic166$ = SubLObjectFactory.makeString("stylesheet");
        $ic167$ = SubLObjectFactory.makeString("text/css");
        $ic168$ = SubLObjectFactory.makeKeyword("SHA1");
        $ic169$ = SubLObjectFactory.makeString("text/javascript");
        $ic170$ = SubLObjectFactory.makeString("yui-skin-sam");
        $ic171$ = SubLObjectFactory.makeString("reloadFrameButton");
        $ic172$ = SubLObjectFactory.makeString("button");
        $ic173$ = SubLObjectFactory.makeString("reload");
        $ic174$ = SubLObjectFactory.makeString("Refresh Frames");
        $ic175$ = SubLObjectFactory.makeString("post");
        $ic176$ = SubLObjectFactory.makeString("cb-adornment-handler");
        $ic177$ = SubLObjectFactory.makeString("Current Values");
        $ic178$ = SubLObjectFactory.makeString("Update Adornment Settings");
        $ic179$ = SubLObjectFactory.makeString("Currently Active Adornments: ");
        $ic180$ = SubLObjectFactory.makeString("Adornment Associations");
        $ic181$ = SubLObjectFactory.makeKeyword("MIDDLE");
        $ic182$ = SubLObjectFactory.makeString("Icon");
        $ic183$ = SubLObjectFactory.makeString("Active?");
        $ic184$ = SubLObjectFactory.makeKeyword("LEFT");
        $ic185$ = SubLObjectFactory.makeString("Name");
        $ic186$ = SubLObjectFactory.makeString("Dynamic?");
        $ic187$ = SubLObjectFactory.makeString("Has Link?");
        $ic188$ = SubLObjectFactory.makeString("Type");
        $ic189$ = SubLObjectFactory.makeString("Tool");
        $ic190$ = SubLObjectFactory.makeString("effective-fn");
        $ic191$ = SubLObjectFactory.makeString("#cccccc");
        $ic192$ = SubLObjectFactory.makeSymbol("S#44145", "CYC");
        $ic193$ = SubLObjectFactory.makeString("#dddddd");
        $ic194$ = SubLObjectFactory.makeString("~A-dynamic");
        $ic195$ = SubLObjectFactory.makeString("?");
        $ic196$ = SubLObjectFactory.makeString("No");
        $ic197$ = SubLObjectFactory.makeString("Yes");
        $ic198$ = SubLObjectFactory.makeKeyword("NBSP");
        $ic199$ = SubLObjectFactory.makeSymbol("CB-VIEW-ADORN");
        $ic200$ = SubLObjectFactory.makeString("debug");
        $ic201$ = SubLObjectFactory.makeString("[~A]");
        $ic202$ = SubLObjectFactory.makeString("Active adornments have been changed");
        $ic203$ = SubLObjectFactory.makeSymbol("CB-ADORNMENT-HANDLER");
        $ic204$ = SubLObjectFactory.makeString("[View Adornments]");
        $ic205$ = SubLObjectFactory.makeString("cb-view-adorn&~A");
        $ic206$ = SubLObjectFactory.makeKeyword("VIEW-ADORN");
        $ic207$ = SubLObjectFactory.makeSymbol("S#44146", "CYC");
        $ic208$ = SubLObjectFactory.makeString(" : ");
    }
    
    public static final class $sX44077_native extends SubLStructNative
    {
        public SubLObject $name;
        public SubLObject $type;
        public SubLObject $active_p;
        public SubLObject $image;
        public SubLObject $image_disabled;
        public SubLObject $image_alt;
        public SubLObject $dynamic_tagfn;
        public SubLObject $color;
        public SubLObject $letter;
        public SubLObject $effective_fn;
        public SubLObject $handler;
        public SubLObject $tool;
        public SubLObject $comment;
        public SubLObject $dynamic_comment;
        public SubLObject $title;
        private static final SubLStructDeclNative structDecl;
        
        public $sX44077_native() {
            this.$name = (SubLObject)CommonSymbols.NIL;
            this.$type = (SubLObject)CommonSymbols.NIL;
            this.$active_p = (SubLObject)CommonSymbols.NIL;
            this.$image = (SubLObject)CommonSymbols.NIL;
            this.$image_disabled = (SubLObject)CommonSymbols.NIL;
            this.$image_alt = (SubLObject)CommonSymbols.NIL;
            this.$dynamic_tagfn = (SubLObject)CommonSymbols.NIL;
            this.$color = (SubLObject)CommonSymbols.NIL;
            this.$letter = (SubLObject)CommonSymbols.NIL;
            this.$effective_fn = (SubLObject)CommonSymbols.NIL;
            this.$handler = (SubLObject)CommonSymbols.NIL;
            this.$tool = (SubLObject)CommonSymbols.NIL;
            this.$comment = (SubLObject)CommonSymbols.NIL;
            this.$dynamic_comment = (SubLObject)CommonSymbols.NIL;
            this.$title = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX44077_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$name;
        }
        
        public SubLObject getField3() {
            return this.$type;
        }
        
        public SubLObject getField4() {
            return this.$active_p;
        }
        
        public SubLObject getField5() {
            return this.$image;
        }
        
        public SubLObject getField6() {
            return this.$image_disabled;
        }
        
        public SubLObject getField7() {
            return this.$image_alt;
        }
        
        public SubLObject getField8() {
            return this.$dynamic_tagfn;
        }
        
        public SubLObject getField9() {
            return this.$color;
        }
        
        public SubLObject getField10() {
            return this.$letter;
        }
        
        public SubLObject getField11() {
            return this.$effective_fn;
        }
        
        public SubLObject getField12() {
            return this.$handler;
        }
        
        public SubLObject getField13() {
            return this.$tool;
        }
        
        public SubLObject getField14() {
            return this.$comment;
        }
        
        public SubLObject getField15() {
            return this.$dynamic_comment;
        }
        
        public SubLObject getField16() {
            return this.$title;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$name = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$type = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$active_p = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$image = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$image_disabled = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$image_alt = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$dynamic_tagfn = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$color = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$letter = value;
        }
        
        public SubLObject setField11(final SubLObject value) {
            return this.$effective_fn = value;
        }
        
        public SubLObject setField12(final SubLObject value) {
            return this.$handler = value;
        }
        
        public SubLObject setField13(final SubLObject value) {
            return this.$tool = value;
        }
        
        public SubLObject setField14(final SubLObject value) {
            return this.$comment = value;
        }
        
        public SubLObject setField15(final SubLObject value) {
            return this.$dynamic_comment = value;
        }
        
        public SubLObject setField16(final SubLObject value) {
            return this.$title = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX44077_native.class, module0659.$ic6$, module0659.$ic7$, module0659.$ic8$, module0659.$ic9$, new String[] { "$name", "$type", "$active_p", "$image", "$image_disabled", "$image_alt", "$dynamic_tagfn", "$color", "$letter", "$effective_fn", "$handler", "$tool", "$comment", "$dynamic_comment", "$title" }, module0659.$ic10$, module0659.$ic11$, module0659.$ic12$);
        }
    }
    
    public static final class $f40068$UnaryFunction extends UnaryFunction
    {
        public $f40068$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#44078"));
        }
        
        public SubLObject processItem(final SubLObject var11) {
            return module0659.f40068(var11);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0659.class
	Total time: 1468 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/