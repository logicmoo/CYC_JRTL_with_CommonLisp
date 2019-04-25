package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0665 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0665";
    public static final String myFingerPrint = "b0731d562dcf1290ce7e0f707503dbbf861322974dac6c5f939a43fbf8a35864";
    private static SubLSymbol $g5233$;
    private static SubLSymbol $g5234$;
    private static SubLSymbol $g5235$;
    public static SubLSymbol $g5236$;
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
    private static final SubLString $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLList $ic43$;
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
    private static final SubLList $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLList $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLString $ic59$;
    private static final SubLString $ic60$;
    private static final SubLList $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLList $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLList $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLList $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLString $ic69$;
    private static final SubLString $ic70$;
    private static final SubLString $ic71$;
    private static final SubLList $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLString $ic74$;
    private static final SubLString $ic75$;
    private static final SubLString $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLString $ic79$;
    private static final SubLString $ic80$;
    private static final SubLString $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLList $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLList $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLString $ic88$;
    private static final SubLInteger $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLString $ic92$;
    private static final SubLString $ic93$;
    private static final SubLList $ic94$;
    private static final SubLList $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLString $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLList $ic107$;
    private static final SubLList $ic108$;
    private static final SubLList $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLSymbol $ic115$;
    private static final SubLList $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLSymbol $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLList $ic125$;
    private static final SubLSymbol $ic126$;
    private static final SubLSymbol $ic127$;
    private static final SubLSymbol $ic128$;
    private static final SubLSymbol $ic129$;
    private static final SubLSymbol $ic130$;
    private static final SubLSymbol $ic131$;
    private static final SubLSymbol $ic132$;
    private static final SubLString $ic133$;
    private static final SubLString $ic134$;
    private static final SubLSymbol $ic135$;
    private static final SubLSymbol $ic136$;
    private static final SubLString $ic137$;
    private static final SubLString $ic138$;
    private static final SubLSymbol $ic139$;
    private static final SubLSymbol $ic140$;
    private static final SubLSymbol $ic141$;
    private static final SubLSymbol $ic142$;
    private static final SubLSymbol $ic143$;
    private static final SubLSymbol $ic144$;
    private static final SubLSymbol $ic145$;
    private static final SubLSymbol $ic146$;
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
    private static final SubLSymbol $ic160$;
    private static final SubLSymbol $ic161$;
    private static final SubLString $ic162$;
    private static final SubLString $ic163$;
    private static final SubLSymbol $ic164$;
    private static final SubLString $ic165$;
    private static final SubLString $ic166$;
    private static final SubLString $ic167$;
    private static final SubLString $ic168$;
    private static final SubLString $ic169$;
    private static final SubLSymbol $ic170$;
    private static final SubLObject $ic171$;
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
    private static final SubLSymbol $ic186$;
    private static final SubLString $ic187$;
    private static final SubLSymbol $ic188$;
    private static final SubLString $ic189$;
    
    public static SubLObject f40368(final SubLObject var1, final SubLObject var2, final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        if (module0665.NIL != print_high.$print_level$.getDynamicValue(var4) && var3.numG(print_high.$print_level$.getDynamicValue(var4))) {
            print_high.princ((SubLObject)module0665.$ic0$, var2);
        }
        else if (module0665.NIL != print_high.$print_readably$.getDynamicValue(var4)) {
            print_high.print_not_readable(var1, var2);
        }
        else {
            streams_high.write_string((SubLObject)module0665.$ic1$, var2, (SubLObject)module0665.UNPROVIDED, (SubLObject)module0665.UNPROVIDED);
            PrintLow.write((SubLObject)Types.type_of(var1), new SubLObject[] { module0665.$ic2$, var2 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var2);
            print_high.princ(f40369(var1), var2);
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var2);
        }
        return var1;
    }
    
    public static SubLObject f40370(final SubLObject var9, final SubLObject var2) {
        f40368(var9, var2, (SubLObject)module0665.ZERO_INTEGER);
        return (SubLObject)module0665.NIL;
    }
    
    public static SubLObject f40371(final SubLObject var9) {
        return (SubLObject)((var9.getClass() == $sX44455_native.class) ? module0665.T : module0665.NIL);
    }
    
    public static SubLObject f40369(final SubLObject var9) {
        assert module0665.NIL != f40371(var9) : var9;
        return var9.getField2();
    }
    
    public static SubLObject f40372(final SubLObject var9) {
        assert module0665.NIL != f40371(var9) : var9;
        return var9.getField3();
    }
    
    public static SubLObject f40373(final SubLObject var9) {
        assert module0665.NIL != f40371(var9) : var9;
        return var9.getField4();
    }
    
    public static SubLObject f40374(final SubLObject var9) {
        assert module0665.NIL != f40371(var9) : var9;
        return var9.getField5();
    }
    
    public static SubLObject f40375(final SubLObject var9) {
        assert module0665.NIL != f40371(var9) : var9;
        return var9.getField6();
    }
    
    public static SubLObject f40376(final SubLObject var9) {
        assert module0665.NIL != f40371(var9) : var9;
        return var9.getField7();
    }
    
    public static SubLObject f40377(final SubLObject var9) {
        assert module0665.NIL != f40371(var9) : var9;
        return var9.getField8();
    }
    
    public static SubLObject f40378(final SubLObject var9) {
        assert module0665.NIL != f40371(var9) : var9;
        return var9.getField9();
    }
    
    public static SubLObject f40379(final SubLObject var9, final SubLObject var11) {
        assert module0665.NIL != f40371(var9) : var9;
        return var9.setField2(var11);
    }
    
    public static SubLObject f40380(final SubLObject var9, final SubLObject var11) {
        assert module0665.NIL != f40371(var9) : var9;
        return var9.setField3(var11);
    }
    
    public static SubLObject f40381(final SubLObject var9, final SubLObject var11) {
        assert module0665.NIL != f40371(var9) : var9;
        return var9.setField4(var11);
    }
    
    public static SubLObject f40382(final SubLObject var9, final SubLObject var11) {
        assert module0665.NIL != f40371(var9) : var9;
        return var9.setField5(var11);
    }
    
    public static SubLObject f40383(final SubLObject var9, final SubLObject var11) {
        assert module0665.NIL != f40371(var9) : var9;
        return var9.setField6(var11);
    }
    
    public static SubLObject f40384(final SubLObject var9, final SubLObject var11) {
        assert module0665.NIL != f40371(var9) : var9;
        return var9.setField7(var11);
    }
    
    public static SubLObject f40385(final SubLObject var9, final SubLObject var11) {
        assert module0665.NIL != f40371(var9) : var9;
        return var9.setField8(var11);
    }
    
    public static SubLObject f40386(final SubLObject var9, final SubLObject var11) {
        assert module0665.NIL != f40371(var9) : var9;
        return var9.setField9(var11);
    }
    
    public static SubLObject f40387(SubLObject var12) {
        if (var12 == module0665.UNPROVIDED) {
            var12 = (SubLObject)module0665.NIL;
        }
        final SubLObject var13 = (SubLObject)new $sX44455_native();
        SubLObject var14;
        SubLObject var15;
        SubLObject var16;
        SubLObject var17;
        for (var14 = (SubLObject)module0665.NIL, var14 = var12; module0665.NIL != var14; var14 = conses_high.cddr(var14)) {
            var15 = var14.first();
            var16 = conses_high.cadr(var14);
            var17 = var15;
            if (var17.eql((SubLObject)module0665.$ic29$)) {
                f40379(var13, var16);
            }
            else if (var17.eql((SubLObject)module0665.$ic30$)) {
                f40380(var13, var16);
            }
            else if (var17.eql((SubLObject)module0665.$ic31$)) {
                f40381(var13, var16);
            }
            else if (var17.eql((SubLObject)module0665.$ic32$)) {
                f40382(var13, var16);
            }
            else if (var17.eql((SubLObject)module0665.$ic33$)) {
                f40383(var13, var16);
            }
            else if (var17.eql((SubLObject)module0665.$ic34$)) {
                f40384(var13, var16);
            }
            else if (var17.eql((SubLObject)module0665.$ic35$)) {
                f40385(var13, var16);
            }
            else if (var17.eql((SubLObject)module0665.$ic36$)) {
                f40386(var13, var16);
            }
            else {
                Errors.error((SubLObject)module0665.$ic37$, var15);
            }
        }
        return var13;
    }
    
    public static SubLObject f40388(final SubLObject var18, final SubLObject var19) {
        Functions.funcall(var19, var18, (SubLObject)module0665.$ic38$, (SubLObject)module0665.$ic39$, (SubLObject)module0665.EIGHT_INTEGER);
        Functions.funcall(var19, var18, (SubLObject)module0665.$ic40$, (SubLObject)module0665.$ic29$, f40369(var18));
        Functions.funcall(var19, var18, (SubLObject)module0665.$ic40$, (SubLObject)module0665.$ic30$, f40372(var18));
        Functions.funcall(var19, var18, (SubLObject)module0665.$ic40$, (SubLObject)module0665.$ic31$, f40373(var18));
        Functions.funcall(var19, var18, (SubLObject)module0665.$ic40$, (SubLObject)module0665.$ic32$, f40374(var18));
        Functions.funcall(var19, var18, (SubLObject)module0665.$ic40$, (SubLObject)module0665.$ic33$, f40375(var18));
        Functions.funcall(var19, var18, (SubLObject)module0665.$ic40$, (SubLObject)module0665.$ic34$, f40376(var18));
        Functions.funcall(var19, var18, (SubLObject)module0665.$ic40$, (SubLObject)module0665.$ic35$, f40377(var18));
        Functions.funcall(var19, var18, (SubLObject)module0665.$ic40$, (SubLObject)module0665.$ic36$, f40378(var18));
        Functions.funcall(var19, var18, (SubLObject)module0665.$ic41$, (SubLObject)module0665.$ic39$, (SubLObject)module0665.EIGHT_INTEGER);
        return var18;
    }
    
    public static SubLObject f40389(final SubLObject var18, final SubLObject var19) {
        return f40388(var18, var19);
    }
    
    public static SubLObject f40390(final SubLObject var20, final SubLObject var21) {
        SubLObject var23;
        final SubLObject var22 = var23 = var20.rest();
        SubLObject var24 = (SubLObject)module0665.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0665.$ic43$);
        var24 = var23.first();
        final SubLObject var25;
        var23 = (var25 = var23.rest());
        final SubLObject var26 = (SubLObject)module0665.$ic44$;
        return (SubLObject)ConsesLow.list((SubLObject)module0665.$ic45$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var26, (SubLObject)ConsesLow.list((SubLObject)module0665.$ic39$, (SubLObject)ConsesLow.list((SubLObject)module0665.$ic46$, var25)))), (SubLObject)ConsesLow.list((SubLObject)module0665.$ic47$, (SubLObject)ConsesLow.list((SubLObject)module0665.$ic13$, var26), (SubLObject)ConsesLow.list((SubLObject)module0665.$ic46$, var24)), (SubLObject)ConsesLow.list((SubLObject)module0665.$ic48$, (SubLObject)ConsesLow.list((SubLObject)module0665.$ic15$, var26), (SubLObject)module0665.$ic49$, var26), (SubLObject)ConsesLow.list((SubLObject)module0665.$ic48$, (SubLObject)ConsesLow.list((SubLObject)module0665.$ic17$, var26), (SubLObject)module0665.$ic50$, var26), (SubLObject)ConsesLow.list((SubLObject)module0665.$ic51$, (SubLObject)module0665.$ic52$, (SubLObject)ConsesLow.list((SubLObject)module0665.$ic53$, var26, (SubLObject)ConsesLow.listS((SubLObject)module0665.$ic54$, (SubLObject)ConsesLow.list((SubLObject)module0665.$ic46$, var24), (SubLObject)module0665.$ic55$))));
    }
    
    public static SubLObject f40391(final SubLObject var27) {
        final SubLThread var28 = SubLProcess.currentSubLThread();
        return Hashtables.gethash(var27, module0665.$g5234$.getDynamicValue(var28), (SubLObject)module0665.UNPROVIDED);
    }
    
    public static SubLObject f40392(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        return Hashtables.gethash(var28, module0665.$g5235$.getDynamicValue(var29), (SubLObject)module0665.UNPROVIDED);
    }
    
    public static SubLObject f40393(final SubLObject var27) {
        final SubLThread var28 = SubLProcess.currentSubLThread();
        if (module0665.NIL != Hashtables.gethash(var27, module0665.$g5234$.getDynamicValue(var28), (SubLObject)module0665.UNPROVIDED)) {
            return (SubLObject)module0665.T;
        }
        return (SubLObject)module0665.NIL;
    }
    
    public static SubLObject f40394() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return Sort.sort(conses_high.copy_list(module0665.$g5233$.getDynamicValue(var4)), Symbols.symbol_function((SubLObject)module0665.$ic56$), (SubLObject)module0665.$ic27$);
    }
    
    public static SubLObject f40395(final SubLObject var29) {
        return module0038.f2965(Strings.string_upcase(var29, (SubLObject)module0665.UNPROVIDED, (SubLObject)module0665.UNPROVIDED));
    }
    
    public static SubLObject f40396(final SubLObject var27) {
        return Strings.string_downcase(module0038.f2968(var27), (SubLObject)module0665.UNPROVIDED, (SubLObject)module0665.UNPROVIDED);
    }
    
    public static SubLObject f40397(final SubLObject var30) {
        if (module0665.NIL != constant_handles_oc.f8449(var30)) {
            return PrintLow.format((SubLObject)module0665.NIL, (SubLObject)module0665.$ic59$, constants_high_oc.f10749(var30));
        }
        if (module0665.NIL != module0167.f10813(var30)) {
            return PrintLow.format((SubLObject)module0665.NIL, (SubLObject)module0665.$ic59$, Numbers.minus(module0167.f10803(var30)));
        }
        return (SubLObject)module0665.$ic60$;
    }
    
    public static SubLObject f40398(final SubLObject var29) {
        SubLObject var30 = (SubLObject)module0665.NIL;
        if (module0665.NIL != module0048.f3407(var29)) {
            final SubLObject var31 = reader.parse_integer(var29, (SubLObject)module0665.UNPROVIDED, (SubLObject)module0665.UNPROVIDED, (SubLObject)module0665.UNPROVIDED, (SubLObject)module0665.UNPROVIDED);
            if (var31.numGE((SubLObject)module0665.ZERO_INTEGER)) {
                var30 = constants_high_oc.f10752(var31);
            }
            else if (var31.numL((SubLObject)module0665.ZERO_INTEGER)) {
                var30 = module0167.f10832(Numbers.minus(var31));
            }
        }
        else {
            var30 = module0656.f39943(var29, (SubLObject)module0665.UNPROVIDED);
        }
        return var30;
    }
    
    public static SubLObject f40399(final SubLObject var33) {
        return PrintLow.format((SubLObject)module0665.NIL, (SubLObject)module0665.$ic59$, assertion_handles_oc.f11025(var33));
    }
    
    public static SubLObject f40400(final SubLObject var29) {
        SubLObject var30 = (SubLObject)module0665.NIL;
        if (module0665.NIL != module0048.f3407(var29)) {
            final SubLObject var31 = reader.parse_integer(var29, (SubLObject)module0665.UNPROVIDED, (SubLObject)module0665.UNPROVIDED, (SubLObject)module0665.UNPROVIDED, (SubLObject)module0665.UNPROVIDED);
            var30 = assertion_handles_oc.f11053(var31);
        }
        return var30;
    }
    
    public static SubLObject f40401(final SubLObject var29) {
        return reader.parse_integer(var29, (SubLObject)module0665.ZERO_INTEGER, (SubLObject)module0665.NIL, (SubLObject)module0665.TEN_INTEGER, (SubLObject)module0665.T);
    }
    
    public static SubLObject f40402(final SubLObject var34) {
        return PrintLow.format((SubLObject)module0665.NIL, (SubLObject)module0665.$ic59$, var34);
    }
    
    public static SubLObject f40403(final SubLObject var29) {
        if (module0665.NIL == var29 || module0665.$ic69$.equal(Strings.string_upcase(var29, (SubLObject)module0665.UNPROVIDED, (SubLObject)module0665.UNPROVIDED)) || module0665.ZERO_INTEGER.eql(reader.parse_integer(var29, (SubLObject)module0665.ZERO_INTEGER, (SubLObject)module0665.NIL, (SubLObject)module0665.TEN_INTEGER, (SubLObject)module0665.T)) || module0665.NIL != module0038.f2716(var29)) {
            return (SubLObject)module0665.NIL;
        }
        return (SubLObject)module0665.T;
    }
    
    public static SubLObject f40404(final SubLObject var1) {
        if (var1 == module0665.T || var1 == module0665.NIL) {
            return (SubLObject)module0665.T;
        }
        return (SubLObject)module0665.NIL;
    }
    
    public static SubLObject f40405(final SubLObject var35) {
        if (module0665.NIL == var35) {
            return (SubLObject)module0665.$ic70$;
        }
        return (SubLObject)module0665.$ic71$;
    }
    
    public static SubLObject f40406(final SubLObject var36) {
        final SubLObject var37 = f40392(Strings.sublisp_char(var36, (SubLObject)module0665.ZERO_INTEGER));
        SubLObject var38 = module0038.f2623(var36, (SubLObject)module0665.ONE_INTEGER, (SubLObject)module0665.UNPROVIDED);
        var38 = module0038.f2659((SubLObject)module0665.$ic74$, (SubLObject)module0665.$ic75$, var38, (SubLObject)module0665.UNPROVIDED);
        return f40407(var38, var37);
    }
    
    public static SubLObject f40408(SubLObject var29) {
        var29 = module0038.f2659((SubLObject)module0665.$ic75$, (SubLObject)module0665.$ic74$, var29, (SubLObject)module0665.UNPROVIDED);
        var29 = module0038.f2659((SubLObject)module0665.$ic74$, (SubLObject)module0665.$ic76$, var29, (SubLObject)module0665.UNPROVIDED);
        final SubLObject var30 = module0038.f2872(var29, (SubLObject)module0665.UNPROVIDED).first();
        return module0035.f2460((SubLObject)module0665.$ic77$, var30, Symbols.symbol_function((SubLObject)module0665.$ic78$), (SubLObject)module0665.UNPROVIDED, (SubLObject)module0665.UNPROVIDED);
    }
    
    public static SubLObject f40409(final SubLObject var39) {
        final SubLThread var40 = SubLProcess.currentSubLThread();
        if (module0665.NIL == var39) {
            return (SubLObject)module0665.$ic60$;
        }
        SubLObject var41 = (SubLObject)module0665.NIL;
        var41 = (SubLObject)ConsesLow.cons((SubLObject)module0665.$ic79$, var41);
        SubLObject var42 = var39;
        SubLObject var43 = (SubLObject)module0665.NIL;
        var43 = var42.first();
        while (module0665.NIL != var42) {
            if (var43.isList()) {
                var41 = (SubLObject)ConsesLow.cons(f40409(var43), var41);
            }
            else {
                var40.resetMultipleValues();
                final SubLObject var44 = f40410(var43, (SubLObject)module0665.UNPROVIDED);
                final SubLObject var45 = var40.secondMultipleValue();
                var40.resetMultipleValues();
                if (module0665.NIL != var44) {
                    var41 = (SubLObject)ConsesLow.cons(Sequences.cconcatenate(Strings.make_string((SubLObject)module0665.ONE_INTEGER, var44), var45), var41);
                }
                else {
                    var41 = (SubLObject)ConsesLow.cons(Sequences.cconcatenate((SubLObject)module0665.$ic80$, var45), var41);
                }
            }
            var41 = (SubLObject)ConsesLow.cons((SubLObject)module0665.$ic76$, var41);
            var42 = var42.rest();
            var43 = var42.first();
        }
        var41 = (SubLObject)ConsesLow.cons((SubLObject)module0665.$ic81$, var41);
        return Functions.apply(Symbols.symbol_function((SubLObject)module0665.$ic82$), Sequences.nreverse(var41));
    }
    
    public static SubLObject f40411(final SubLObject var29) {
        return module0657.f40024(module0657.f40025(var29), (SubLObject)module0665.NIL);
    }
    
    public static SubLObject f40412(final SubLObject var45) {
        return module0194.f12113(var45, (SubLObject)module0665.ZERO_INTEGER);
    }
    
    public static SubLObject f40413(final SubLObject var1) {
        if (module0665.NIL == var1) {
            return (SubLObject)module0665.$ic60$;
        }
        return module0038.f2626(var1);
    }
    
    public static SubLObject f40407(final SubLObject var29, final SubLObject var37) {
        if (!var29.isString()) {
            return Values.values((SubLObject)module0665.NIL, (SubLObject)module0665.NIL);
        }
        if (module0665.NIL == f40371(var37)) {
            return Values.values(var29, (SubLObject)module0665.NIL);
        }
        if (f40374(var37).isFunctionSpec() && module0665.NIL == Functions.funcall(f40374(var37), var29)) {
            return Values.values(var29, (SubLObject)module0665.NIL);
        }
        return Functions.funcall(f40375(var37), var29);
    }
    
    public static SubLObject f40414(SubLObject var46, SubLObject var47) {
        if (var47 == module0665.UNPROVIDED) {
            var47 = (SubLObject)module0665.NIL;
        }
        final SubLObject var48 = Sequences.length(var46);
        final SubLObject var49 = (SubLObject)(module0665.ZERO_INTEGER.numL(var48) ? Sequences.elt(var46, (SubLObject)module0665.ZERO_INTEGER) : module0665.NIL);
        final SubLObject var50 = (SubLObject)(module0665.ONE_INTEGER.numL(var48) ? Sequences.elt(var46, (SubLObject)module0665.ONE_INTEGER) : module0665.NIL);
        final SubLObject var51 = f40392(var49);
        final SubLObject var52 = f40392(var50);
        SubLObject var53 = var46;
        SubLObject var54 = var47;
        if (module0665.NIL != f40371(var51)) {
            if (module0665.NIL != f40371(var52)) {
                var46 = Sequences.subseq(var46, (SubLObject)module0665.TWO_INTEGER, (SubLObject)module0665.UNPROVIDED);
            }
            else {
                var46 = Sequences.subseq(var46, (SubLObject)module0665.ONE_INTEGER, (SubLObject)module0665.UNPROVIDED);
            }
        }
        if (module0665.NIL != f40371(var51)) {
            var53 = f40407(var46, var51);
        }
        if (module0665.NIL != f40371(var52)) {
            var54 = f40407(var47, var52);
        }
        return Values.values(var53, var54);
    }
    
    public static SubLObject f40410(final SubLObject var1, SubLObject var55) {
        if (var55 == module0665.UNPROVIDED) {
            var55 = (SubLObject)module0665.NIL;
        }
        if (module0665.NIL != var55 && var55 != module0665.$ic87$) {
            final SubLObject var56 = f40391(var55);
            if (module0665.NIL != f40371(var56)) {
                return Values.values(f40373(var56), Functions.funcall(f40377(var56), var1));
            }
        }
        SubLObject var57 = f40394();
        SubLObject var58 = (SubLObject)module0665.NIL;
        var58 = var57.first();
        while (module0665.NIL != var57) {
            if (f40376(var58).isFunctionSpec() && module0665.NIL != Functions.funcall(f40376(var58), var1) && f40377(var58).isFunctionSpec()) {
                return Values.values(f40373(var58), Functions.funcall(f40377(var58), var1));
            }
            var57 = var57.rest();
            var58 = var57.first();
        }
        return Values.values((SubLObject)Characters.CHAR_underbar, PrintLow.format((SubLObject)module0665.NIL, (SubLObject)module0665.$ic88$, var1));
    }
    
    public static SubLObject f40415(final SubLObject var1, SubLObject var55) {
        if (var55 == module0665.UNPROVIDED) {
            var55 = (SubLObject)module0665.NIL;
        }
        final SubLThread var56 = SubLProcess.currentSubLThread();
        var56.resetMultipleValues();
        final SubLObject var57 = f40410(var1, var55);
        final SubLObject var58 = var56.secondMultipleValue();
        var56.resetMultipleValues();
        return var58;
    }
    
    public static SubLObject f40416(final SubLObject var53, final SubLObject var54, SubLObject var57) {
        if (var57 == module0665.UNPROVIDED) {
            var57 = (SubLObject)module0665.$ic87$;
        }
        final SubLThread var58 = SubLProcess.currentSubLThread();
        var58.resetMultipleValues();
        final SubLObject var59 = f40410(var53, (SubLObject)module0665.UNPROVIDED);
        SubLObject var60 = var58.secondMultipleValue();
        var58.resetMultipleValues();
        var58.resetMultipleValues();
        final SubLObject var61 = f40410(var54, var57);
        final SubLObject var62 = var58.secondMultipleValue();
        var58.resetMultipleValues();
        if (module0665.NIL != var59) {
            if (module0665.NIL == var61) {
                var60 = Sequences.cconcatenate(Strings.make_string((SubLObject)module0665.ONE_INTEGER, var59), var60);
            }
            else {
                var60 = Sequences.cconcatenate(Strings.make_string((SubLObject)module0665.ONE_INTEGER, var59), new SubLObject[] { Strings.make_string((SubLObject)module0665.ONE_INTEGER, var61), var60 });
            }
        }
        return Values.values(var60, var62);
    }
    
    public static SubLObject f40417(final SubLObject var53, SubLObject var57) {
        if (var57 == module0665.UNPROVIDED) {
            var57 = (SubLObject)module0665.$ic87$;
        }
        final SubLThread var58 = SubLProcess.currentSubLThread();
        var58.resetMultipleValues();
        final SubLObject var59 = f40410(var53, (SubLObject)module0665.UNPROVIDED);
        SubLObject var60 = var58.secondMultipleValue();
        var58.resetMultipleValues();
        final SubLObject var61 = f40391(var57);
        SubLObject var62 = (SubLObject)module0665.NIL;
        if (module0665.NIL != f40371(var61)) {
            var62 = f40373(var61);
        }
        if (module0665.NIL != var59) {
            if (module0665.NIL == var62) {
                var60 = Sequences.cconcatenate(Strings.make_string((SubLObject)module0665.ONE_INTEGER, var59), new SubLObject[] { Strings.make_string((SubLObject)module0665.ONE_INTEGER, (SubLObject)Characters.CHAR_underbar), var60 });
            }
            else {
                var60 = Sequences.cconcatenate(Strings.make_string((SubLObject)module0665.ONE_INTEGER, var59), new SubLObject[] { Strings.make_string((SubLObject)module0665.ONE_INTEGER, var62), var60 });
            }
        }
        return var60;
    }
    
    public static SubLObject f40418(final SubLObject var53, final SubLObject var60) {
        final SubLThread var61 = SubLProcess.currentSubLThread();
        var61.resetMultipleValues();
        final SubLObject var62 = Hashtables.gethash(var53, var60, (SubLObject)module0665.UNPROVIDED);
        final SubLObject var63 = var61.secondMultipleValue();
        var61.resetMultipleValues();
        return var63;
    }
    
    public static SubLObject f40419(final SubLObject var53, final SubLObject var60) {
        return module0030.f1606(var53, var60, (SubLObject)module0665.UNPROVIDED);
    }
    
    public static SubLObject f40420(final SubLObject var53, final SubLObject var60) {
        return Hashtables.gethash(var53, var60, (SubLObject)module0665.UNPROVIDED);
    }
    
    public static SubLObject f40421(final SubLObject var53, final SubLObject var60, final SubLObject var54) {
        return module0030.f1607(var53, var60, var54);
    }
    
    public static SubLObject f40422(final SubLObject var53, final SubLObject var60, final SubLObject var54) {
        return Hashtables.sethash(var53, var60, var54);
    }
    
    public static SubLObject f40423(final SubLObject var53, final SubLObject var54, final SubLObject var60) {
        return module0030.f1601(var53, var54, var60);
    }
    
    public static SubLObject f40424(final SubLObject var53, final SubLObject var54, final SubLObject var60) {
        return module0030.f1600(var53, var54, var60, (SubLObject)module0665.UNPROVIDED);
    }
    
    public static SubLObject f40425(final SubLObject var53, final SubLObject var60) {
        return Hashtables.remhash(var53, var60);
    }
    
    public static SubLObject f40426(final SubLObject var62, final SubLObject var60) {
        SubLObject var63 = var62;
        SubLObject var64 = (SubLObject)module0665.NIL;
        var64 = var63.first();
        while (module0665.NIL != var63) {
            Hashtables.remhash(var64, var60);
            var63 = var63.rest();
            var64 = var63.first();
        }
        return (SubLObject)module0665.NIL;
    }
    
    public static SubLObject f40427(final SubLObject var63, final SubLObject var60) {
        SubLObject var64 = (SubLObject)module0665.NIL;
        SubLObject var65 = (SubLObject)module0665.NIL;
        final Iterator var66 = Hashtables.getEntrySetIterator(var60);
        try {
            while (Hashtables.iteratorHasNext(var66)) {
                final Map.Entry var67 = Hashtables.iteratorNextEntry(var66);
                var64 = Hashtables.getEntryKey(var67);
                var65 = Hashtables.getEntryValue(var67);
                if (module0665.NIL == module0004.f104(var64, var63, (SubLObject)module0665.UNPROVIDED, (SubLObject)module0665.UNPROVIDED)) {
                    Hashtables.remhash(var64, var60);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var66);
        }
        return (SubLObject)module0665.NIL;
    }
    
    public static SubLObject f40428(SubLObject var68) {
        if (var68 == module0665.UNPROVIDED) {
            var68 = (SubLObject)module0665.$ic89$;
        }
        return Hashtables.make_hash_table(var68, Symbols.symbol_function((SubLObject)module0665.EQUAL), (SubLObject)module0665.UNPROVIDED);
    }
    
    public static SubLObject f40429(final SubLObject var1) {
        return Types.hash_table_p(var1);
    }
    
    public static SubLObject f40430(final SubLObject var60) {
        final SubLObject var61 = f40428((SubLObject)module0665.UNPROVIDED);
        module0030.f1610(var60, var61);
        return var61;
    }
    
    public static SubLObject f40431(final SubLObject var60) {
        return module0030.f1625(var60);
    }
    
    public static SubLObject f40432(final SubLObject var70) {
        final SubLThread var71 = SubLProcess.currentSubLThread();
        final SubLObject var72 = f40428((SubLObject)module0665.$ic89$);
        SubLObject var73 = var70;
        SubLObject var74 = (SubLObject)module0665.NIL;
        var74 = var73.first();
        while (module0665.NIL != var73) {
            if (var74.isString()) {
                final SubLObject var75 = module0656.f39943(var74, (SubLObject)module0665.UNPROVIDED);
                if (module0665.NIL != var75) {
                    module0030.f1601((SubLObject)module0665.$ic90$, var75, var72);
                }
                else {
                    module0030.f1601((SubLObject)module0665.$ic91$, var74, var72);
                }
            }
            if (var74.isList()) {
                final SubLObject var76 = var74.first();
                final SubLObject var77 = conses_high.second(var74);
                var71.resetMultipleValues();
                final SubLObject var78 = f40414(var76, var77);
                final SubLObject var79 = var71.secondMultipleValue();
                var71.resetMultipleValues();
                module0030.f1601(var78, var79, var72);
            }
            var73 = var73.rest();
            var74 = var73.first();
        }
        return var72;
    }
    
    public static SubLObject f40433(final SubLObject var74) {
        final SubLObject var75 = f40428((SubLObject)module0665.$ic89$);
        SubLObject var76 = var74;
        SubLObject var77 = (SubLObject)module0665.NIL;
        var77 = var76.first();
        while (module0665.NIL != var76) {
            if (module0665.NIL != module0173.f10955(var77)) {
                f40423((SubLObject)module0665.$ic90$, var77, var75);
            }
            else if (var77.isString()) {
                f40423((SubLObject)module0665.$ic91$, var77, var75);
            }
            else if (module0665.NIL != module0035.f1995(var77, (SubLObject)module0665.TWO_INTEGER, (SubLObject)module0665.UNPROVIDED)) {
                f40423(var77.first(), conses_high.second(var77), var75);
            }
            var76 = var76.rest();
            var77 = var76.first();
        }
        return var75;
    }
    
    public static SubLObject f40434(final SubLObject var60, final SubLObject var76) {
        final SubLThread var77 = SubLProcess.currentSubLThread();
        SubLObject var78 = (SubLObject)module0665.NIL;
        SubLObject var79 = (SubLObject)module0665.NIL;
        var79 = (SubLObject)ConsesLow.cons(var76, var79);
        SubLObject var80 = (SubLObject)module0665.NIL;
        SubLObject var81 = (SubLObject)module0665.NIL;
        final Iterator var82 = Hashtables.getEntrySetIterator(var60);
        try {
            while (Hashtables.iteratorHasNext(var82)) {
                final Map.Entry var83 = Hashtables.iteratorNextEntry(var82);
                var80 = Hashtables.getEntryKey(var83);
                SubLObject var84;
                var81 = (var84 = Hashtables.getEntryValue(var83));
                SubLObject var85 = (SubLObject)module0665.NIL;
                var85 = var84.first();
                while (module0665.NIL != var84) {
                    var77.resetMultipleValues();
                    final SubLObject var86 = f40416(var80, var85, (SubLObject)module0665.UNPROVIDED);
                    final SubLObject var87 = var77.secondMultipleValue();
                    var77.resetMultipleValues();
                    var79 = (SubLObject)ConsesLow.cons((SubLObject)module0665.$ic92$, var79);
                    var79 = (SubLObject)ConsesLow.cons(module0589.f35898(var86, (SubLObject)module0665.UNPROVIDED), var79);
                    var79 = (SubLObject)ConsesLow.cons((SubLObject)module0665.$ic93$, var79);
                    var79 = (SubLObject)ConsesLow.cons(module0589.f35898(var87, (SubLObject)module0665.UNPROVIDED), var79);
                    var84 = var84.rest();
                    var85 = var84.first();
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var82);
        }
        var78 = Functions.apply(Symbols.symbol_function((SubLObject)module0665.$ic82$), Sequences.nreverse(var79));
        return var78;
    }
    
    public static SubLObject f40435(final SubLObject var20, final SubLObject var21) {
        SubLObject var23;
        final SubLObject var22 = var23 = var20.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0665.$ic94$);
        final SubLObject var24 = var23.rest();
        var23 = var23.first();
        SubLObject var25 = (SubLObject)module0665.NIL;
        SubLObject var26 = (SubLObject)module0665.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0665.$ic94$);
        var25 = var23.first();
        var23 = var23.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0665.$ic94$);
        var26 = var23.first();
        var23 = var23.rest();
        SubLObject var27 = (SubLObject)module0665.NIL;
        SubLObject var28 = var23;
        SubLObject var29 = (SubLObject)module0665.NIL;
        SubLObject var86_87 = (SubLObject)module0665.NIL;
        while (module0665.NIL != var28) {
            cdestructuring_bind.destructuring_bind_must_consp(var28, var22, (SubLObject)module0665.$ic94$);
            var86_87 = var28.first();
            var28 = var28.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var28, var22, (SubLObject)module0665.$ic94$);
            if (module0665.NIL == conses_high.member(var86_87, (SubLObject)module0665.$ic95$, (SubLObject)module0665.UNPROVIDED, (SubLObject)module0665.UNPROVIDED)) {
                var29 = (SubLObject)module0665.T;
            }
            if (var86_87 == module0665.$ic96$) {
                var27 = var28.first();
            }
            var28 = var28.rest();
        }
        if (module0665.NIL != var29 && module0665.NIL == var27) {
            cdestructuring_bind.cdestructuring_bind_error(var22, (SubLObject)module0665.$ic94$);
        }
        final SubLObject var30 = cdestructuring_bind.property_list_member((SubLObject)module0665.$ic29$, var23);
        final SubLObject var31 = (SubLObject)((module0665.NIL != var30) ? conses_high.cadr(var30) : module0665.NIL);
        final SubLObject var32 = cdestructuring_bind.property_list_member((SubLObject)module0665.$ic97$, var23);
        final SubLObject var33 = (SubLObject)((module0665.NIL != var32) ? conses_high.cadr(var32) : module0665.NIL);
        final SubLObject var34 = cdestructuring_bind.property_list_member((SubLObject)module0665.$ic98$, var23);
        final SubLObject var35 = (SubLObject)((module0665.NIL != var34) ? conses_high.cadr(var34) : module0665.NIL);
        final SubLObject var36 = cdestructuring_bind.property_list_member((SubLObject)module0665.$ic99$, var23);
        final SubLObject var37 = (SubLObject)((module0665.NIL != var36) ? conses_high.cadr(var36) : module0665.NIL);
        final SubLObject var38;
        var23 = (var38 = var24);
        final SubLObject var39 = (SubLObject)module0665.$ic100$;
        return (SubLObject)ConsesLow.list((SubLObject)module0665.$ic45$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var39, (SubLObject)ConsesLow.list((SubLObject)module0665.$ic101$, (SubLObject)module0665.NIL, (SubLObject)module0665.$ic102$, (SubLObject)module0665.$ic103$, (SubLObject)ConsesLow.list((SubLObject)module0665.$ic104$, var25, var26)))), (SubLObject)ConsesLow.listS((SubLObject)module0665.$ic105$, (SubLObject)ConsesLow.list(new SubLObject[] { module0665.$ic106$, var39, module0665.$ic29$, var31, module0665.$ic97$, var33, module0665.$ic98$, var35, module0665.$ic99$, var37 }), ConsesLow.append(var38, (SubLObject)module0665.NIL)));
    }
    
    public static SubLObject f40436(final SubLObject var60, final SubLObject var53, final SubLObject var54, SubLObject var92, SubLObject var96) {
        if (var92 == module0665.UNPROVIDED) {
            var92 = (SubLObject)module0665.NIL;
        }
        if (var96 == module0665.UNPROVIDED) {
            var96 = (SubLObject)module0665.NIL;
        }
        final SubLThread var97 = SubLProcess.currentSubLThread();
        final SubLObject var98 = f40420(var53, var60);
        var97.resetMultipleValues();
        final SubLObject var99 = f40416(var53, var54, (SubLObject)module0665.UNPROVIDED);
        final SubLObject var100 = var97.secondMultipleValue();
        var97.resetMultipleValues();
        final SubLObject var101 = module0035.f2171(var54, var98);
        module0642.f39068(var99, var100, var101, var92, var96, (SubLObject)module0665.UNPROVIDED);
        return (SubLObject)module0665.NIL;
    }
    
    public static SubLObject f40437(final SubLObject var60, final SubLObject var53, final SubLObject var54) {
        final SubLThread var61 = SubLProcess.currentSubLThread();
        final SubLObject var62 = f40420(var53, var60);
        var61.resetMultipleValues();
        final SubLObject var63 = f40416(var53, var54, (SubLObject)module0665.UNPROVIDED);
        final SubLObject var64 = var61.secondMultipleValue();
        var61.resetMultipleValues();
        final SubLObject var65 = module0035.f2171(var54, var62);
        module0642.f39072(var63, var64, var65, (SubLObject)module0665.UNPROVIDED);
        return (SubLObject)module0665.NIL;
    }
    
    public static SubLObject f40438(final SubLObject var60, final SubLObject var53, final SubLObject var99, final SubLObject var100, final SubLObject var54, SubLObject var57) {
        if (var57 == module0665.UNPROVIDED) {
            var57 = (SubLObject)module0665.$ic87$;
        }
        final SubLThread var101 = SubLProcess.currentSubLThread();
        final SubLObject var102 = f40420(var53, var60);
        final SubLObject var103 = f40417(var99, var100);
        var101.resetMultipleValues();
        final SubLObject var104 = f40416(var53, var54, var57);
        final SubLObject var105 = var101.secondMultipleValue();
        var101.resetMultipleValues();
        final SubLObject var106 = module0035.f2171(var54, var102);
        module0644.f39188(var104, var103, var105, var106);
        return (SubLObject)module0665.NIL;
    }
    
    public static SubLObject f40439(final SubLObject var60, final SubLObject var53, final SubLObject var102, final SubLObject var103, final SubLObject var54, SubLObject var57) {
        if (var57 == module0665.UNPROVIDED) {
            var57 = (SubLObject)module0665.$ic87$;
        }
        final SubLThread var104 = SubLProcess.currentSubLThread();
        final SubLObject var105 = f40420(var53, var60);
        final SubLObject var106 = f40417(var102, var103);
        var104.resetMultipleValues();
        final SubLObject var107 = f40416(var53, var54, var57);
        final SubLObject var108 = var104.secondMultipleValue();
        var104.resetMultipleValues();
        final SubLObject var109 = module0035.f2171(var54, var105);
        module0644.f39187(var107, var106, var108, var109);
        return (SubLObject)module0665.NIL;
    }
    
    public static SubLObject f40440(final SubLObject var60, final SubLObject var53, SubLObject var105, SubLObject var106) {
        if (var105 == module0665.UNPROVIDED) {
            var105 = (SubLObject)module0665.NIL;
        }
        if (var106 == module0665.UNPROVIDED) {
            var106 = (SubLObject)module0665.NIL;
        }
        SubLObject var107 = f40420(var53, var60);
        if (var107.equal((SubLObject)module0665.$ic107$)) {
            var107 = (SubLObject)module0665.NIL;
        }
        if (module0665.NIL == var107 && module0665.NIL != var105) {
            var107 = (SubLObject)ConsesLow.list(var105);
        }
        SubLObject var108 = var107;
        SubLObject var109 = (SubLObject)module0665.NIL;
        var109 = var108.first();
        while (module0665.NIL != var108) {
            f40441(var60, var53, var109, var106, (SubLObject)module0665.UNPROVIDED);
            var108 = var108.rest();
            var109 = var108.first();
        }
        return (SubLObject)module0665.NIL;
    }
    
    public static SubLObject f40441(final SubLObject var60, final SubLObject var53, final SubLObject var54, SubLObject var57, SubLObject var106) {
        if (var57 == module0665.UNPROVIDED) {
            var57 = (SubLObject)module0665.$ic87$;
        }
        if (var106 == module0665.UNPROVIDED) {
            var106 = (SubLObject)module0665.NIL;
        }
        final SubLThread var107 = SubLProcess.currentSubLThread();
        var107.resetMultipleValues();
        final SubLObject var108 = f40416(var53, var54, var57);
        final SubLObject var109 = var107.secondMultipleValue();
        var107.resetMultipleValues();
        module0642.f39069(var108, var109, var106);
        return (SubLObject)module0665.NIL;
    }
    
    public static SubLObject f40442(final SubLObject var20, final SubLObject var21) {
        SubLObject var23;
        final SubLObject var22 = var23 = var20.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0665.$ic108$);
        final SubLObject var24 = var23.rest();
        var23 = var23.first();
        SubLObject var25 = (SubLObject)module0665.NIL;
        SubLObject var26 = (SubLObject)module0665.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0665.$ic108$);
        var25 = var23.first();
        var23 = var23.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0665.$ic108$);
        var26 = var23.first();
        var23 = var23.rest();
        SubLObject var27 = (SubLObject)module0665.NIL;
        SubLObject var28 = var23;
        SubLObject var29 = (SubLObject)module0665.NIL;
        SubLObject var115_116 = (SubLObject)module0665.NIL;
        while (module0665.NIL != var28) {
            cdestructuring_bind.destructuring_bind_must_consp(var28, var22, (SubLObject)module0665.$ic108$);
            var115_116 = var28.first();
            var28 = var28.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var28, var22, (SubLObject)module0665.$ic108$);
            if (module0665.NIL == conses_high.member(var115_116, (SubLObject)module0665.$ic109$, (SubLObject)module0665.UNPROVIDED, (SubLObject)module0665.UNPROVIDED)) {
                var29 = (SubLObject)module0665.T;
            }
            if (var115_116 == module0665.$ic96$) {
                var27 = var28.first();
            }
            var28 = var28.rest();
        }
        if (module0665.NIL != var29 && module0665.NIL == var27) {
            cdestructuring_bind.cdestructuring_bind_error(var22, (SubLObject)module0665.$ic108$);
        }
        final SubLObject var30 = cdestructuring_bind.property_list_member((SubLObject)module0665.$ic110$, var23);
        final SubLObject var31 = (SubLObject)((module0665.NIL != var30) ? conses_high.cadr(var30) : module0665.NIL);
        final SubLObject var32 = cdestructuring_bind.property_list_member((SubLObject)module0665.$ic111$, var23);
        final SubLObject var33 = (SubLObject)((module0665.NIL != var32) ? conses_high.cadr(var32) : module0665.NIL);
        final SubLObject var34 = cdestructuring_bind.property_list_member((SubLObject)module0665.$ic98$, var23);
        final SubLObject var35 = (SubLObject)((module0665.NIL != var34) ? conses_high.cadr(var34) : module0665.NIL);
        final SubLObject var36 = cdestructuring_bind.property_list_member((SubLObject)module0665.$ic112$, var23);
        final SubLObject var37 = (SubLObject)((module0665.NIL != var36) ? conses_high.cadr(var36) : module0665.NIL);
        final SubLObject var38;
        var23 = (var38 = var24);
        final SubLObject var39 = (SubLObject)module0665.$ic113$;
        return (SubLObject)ConsesLow.list((SubLObject)module0665.$ic45$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var39, (SubLObject)ConsesLow.list((SubLObject)module0665.$ic114$, var25, var26))), (SubLObject)ConsesLow.listS((SubLObject)module0665.$ic115$, (SubLObject)ConsesLow.list(new SubLObject[] { var39, module0665.$ic110$, var31, module0665.$ic111$, var33, module0665.$ic98$, var35, module0665.$ic112$, var37 }), ConsesLow.append(var38, (SubLObject)module0665.NIL)));
    }
    
    public static SubLObject f40443(final SubLObject var20, final SubLObject var21) {
        SubLObject var23;
        final SubLObject var22 = var23 = var20.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0665.$ic116$);
        final SubLObject var24 = var23.rest();
        var23 = var23.first();
        SubLObject var25 = (SubLObject)module0665.NIL;
        SubLObject var26 = (SubLObject)module0665.NIL;
        SubLObject var27 = (SubLObject)module0665.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0665.$ic116$);
        var25 = var23.first();
        var23 = var23.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0665.$ic116$);
        var26 = var23.first();
        var23 = var23.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0665.$ic116$);
        var27 = var23.first();
        var23 = var23.rest();
        final SubLObject var28 = (SubLObject)(var23.isCons() ? var23.first() : module0665.$ic87$);
        cdestructuring_bind.destructuring_bind_must_listp(var23, var22, (SubLObject)module0665.$ic116$);
        var23 = var23.rest();
        if (module0665.NIL == var23) {
            final SubLObject var29;
            var23 = (var29 = var24);
            final SubLObject var30 = (SubLObject)module0665.$ic117$;
            final SubLObject var31 = (SubLObject)module0665.$ic118$;
            return (SubLObject)ConsesLow.list((SubLObject)module0665.$ic45$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var31, (SubLObject)ConsesLow.list((SubLObject)module0665.$ic119$, var27, (SubLObject)ConsesLow.list((SubLObject)module0665.$ic120$, var26, var25))), (SubLObject)ConsesLow.list(var30, (SubLObject)ConsesLow.list((SubLObject)module0665.$ic121$, var27, var28))), (SubLObject)ConsesLow.listS((SubLObject)module0665.$ic122$, (SubLObject)ConsesLow.list((SubLObject)module0665.$ic123$, var31, (SubLObject)module0665.$ic124$, var30), ConsesLow.append(var29, (SubLObject)module0665.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var22, (SubLObject)module0665.$ic116$);
        return (SubLObject)module0665.NIL;
    }
    
    public static SubLObject f40444(final SubLObject var20, final SubLObject var21) {
        SubLObject var23;
        final SubLObject var22 = var23 = var20.rest();
        SubLObject var24 = (SubLObject)module0665.NIL;
        SubLObject var25 = (SubLObject)module0665.NIL;
        SubLObject var26 = (SubLObject)module0665.NIL;
        SubLObject var27 = (SubLObject)module0665.NIL;
        SubLObject var28 = (SubLObject)module0665.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0665.$ic125$);
        var24 = var23.first();
        var23 = var23.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0665.$ic125$);
        var25 = var23.first();
        var23 = var23.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0665.$ic125$);
        var26 = var23.first();
        var23 = var23.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0665.$ic125$);
        var27 = var23.first();
        var23 = var23.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0665.$ic125$);
        var28 = var23.first();
        var23 = var23.rest();
        SubLObject var29 = (SubLObject)module0665.NIL;
        SubLObject var30 = var23;
        SubLObject var31 = (SubLObject)module0665.NIL;
        SubLObject var133_134 = (SubLObject)module0665.NIL;
        while (module0665.NIL != var30) {
            cdestructuring_bind.destructuring_bind_must_consp(var30, var22, (SubLObject)module0665.$ic125$);
            var133_134 = var30.first();
            var30 = var30.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var30, var22, (SubLObject)module0665.$ic125$);
            if (module0665.NIL == conses_high.member(var133_134, (SubLObject)module0665.$ic109$, (SubLObject)module0665.UNPROVIDED, (SubLObject)module0665.UNPROVIDED)) {
                var31 = (SubLObject)module0665.T;
            }
            if (var133_134 == module0665.$ic96$) {
                var29 = var30.first();
            }
            var30 = var30.rest();
        }
        if (module0665.NIL != var31 && module0665.NIL == var29) {
            cdestructuring_bind.cdestructuring_bind_error(var22, (SubLObject)module0665.$ic125$);
        }
        final SubLObject var32 = cdestructuring_bind.property_list_member((SubLObject)module0665.$ic110$, var23);
        final SubLObject var33 = (SubLObject)((module0665.NIL != var32) ? conses_high.cadr(var32) : module0665.NIL);
        final SubLObject var34 = cdestructuring_bind.property_list_member((SubLObject)module0665.$ic111$, var23);
        final SubLObject var35 = (SubLObject)((module0665.NIL != var34) ? conses_high.cadr(var34) : module0665.NIL);
        final SubLObject var36 = cdestructuring_bind.property_list_member((SubLObject)module0665.$ic98$, var23);
        final SubLObject var37 = (SubLObject)((module0665.NIL != var36) ? conses_high.cadr(var36) : module0665.NIL);
        final SubLObject var38 = cdestructuring_bind.property_list_member((SubLObject)module0665.$ic112$, var23);
        final SubLObject var39 = (SubLObject)((module0665.NIL != var38) ? conses_high.cadr(var38) : module0665.NIL);
        final SubLObject var40 = (SubLObject)module0665.$ic126$;
        final SubLObject var41 = (SubLObject)module0665.$ic127$;
        return (SubLObject)ConsesLow.list((SubLObject)module0665.$ic128$, (SubLObject)ConsesLow.list(new SubLObject[] { var25, var26, module0665.$ic110$, var33, module0665.$ic111$, var35, module0665.$ic98$, var37, module0665.$ic112$, var39 }), (SubLObject)ConsesLow.list((SubLObject)module0665.$ic129$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var40, var27), (SubLObject)ConsesLow.list(var41, var28)), (SubLObject)ConsesLow.list((SubLObject)module0665.$ic130$, (SubLObject)ConsesLow.list(var24, var25, var40, var26), (SubLObject)ConsesLow.list((SubLObject)module0665.$ic131$, var41))));
    }
    
    public static SubLObject f40445(final SubLObject var60, final SubLObject var139, final SubLObject var53, SubLObject var92) {
        if (var92 == module0665.UNPROVIDED) {
            var92 = (SubLObject)module0665.NIL;
        }
        final SubLObject var140 = f40417(var53, (SubLObject)module0665.$ic132$);
        return module0642.f39074(var139, var140, var92);
    }
    
    public static SubLObject f40446(final SubLObject var60, final SubLObject var53, final SubLObject var57, SubLObject var54) {
        if (var54 == module0665.UNPROVIDED) {
            var54 = (SubLObject)module0665.NIL;
        }
        final SubLObject var61 = f40417(var53, var57);
        return module0644.f39184(var61, var54);
    }
    
    public static SubLObject f40447(final SubLObject var60, final SubLObject var53, final SubLObject var57, SubLObject var140, SubLObject var139, SubLObject var141) {
        if (var140 == module0665.UNPROVIDED) {
            var140 = (SubLObject)module0665.NIL;
        }
        if (var139 == module0665.UNPROVIDED) {
            var139 = (SubLObject)module0665.$ic133$;
        }
        if (var141 == module0665.UNPROVIDED) {
            var141 = (SubLObject)module0665.NIL;
        }
        final SubLObject var142 = f40417(var53, var57);
        return module0666.f40467(var142, var139, var140, var141, (SubLObject)module0665.UNPROVIDED, (SubLObject)module0665.UNPROVIDED);
    }
    
    public static SubLObject f40448(final SubLObject var60, final SubLObject var53, SubLObject var105, SubLObject var68, SubLObject var57) {
        if (var105 == module0665.UNPROVIDED) {
            var105 = (SubLObject)module0665.NIL;
        }
        if (var68 == module0665.UNPROVIDED) {
            var68 = (SubLObject)module0665.NIL;
        }
        if (var57 == module0665.UNPROVIDED) {
            var57 = (SubLObject)module0665.$ic87$;
        }
        final SubLThread var106 = SubLProcess.currentSubLThread();
        SubLObject var107 = f40419(var53, var60);
        if (module0665.NIL == var107) {
            var107 = var105;
        }
        if (module0665.NIL != var107) {
            var106.resetMultipleValues();
            final SubLObject var108 = f40416(var53, var107, var57);
            final SubLObject var109 = var106.secondMultipleValue();
            var106.resetMultipleValues();
            module0642.f39075(var108, var109, var68);
        }
        else {
            final SubLObject var108 = f40417(var53, var57);
            module0642.f39075(var108, (SubLObject)module0665.$ic60$, var68);
        }
        return (SubLObject)module0665.NIL;
    }
    
    public static SubLObject f40449(final SubLObject var60, final SubLObject var53, SubLObject var105, SubLObject var142, SubLObject var143, SubLObject var144, SubLObject var57) {
        if (var105 == module0665.UNPROVIDED) {
            var105 = (SubLObject)module0665.NIL;
        }
        if (var142 == module0665.UNPROVIDED) {
            var142 = (SubLObject)module0665.NIL;
        }
        if (var143 == module0665.UNPROVIDED) {
            var143 = (SubLObject)module0665.NIL;
        }
        if (var144 == module0665.UNPROVIDED) {
            var144 = (SubLObject)module0665.NIL;
        }
        if (var57 == module0665.UNPROVIDED) {
            var57 = (SubLObject)module0665.$ic87$;
        }
        final SubLThread var145 = SubLProcess.currentSubLThread();
        SubLObject var146 = f40419(var53, var60);
        if (module0665.NIL == var146) {
            var146 = var105;
        }
        if (module0665.NIL != var146) {
            var145.resetMultipleValues();
            final SubLObject var147 = f40416(var53, var146, var57);
            final SubLObject var148 = var145.secondMultipleValue();
            var145.resetMultipleValues();
            module0642.f39020(module0015.$g336$.getGlobalValue());
            module0642.f39020(module0015.$g338$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0665.UNPROVIDED);
            module0642.f39020(var147);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0665.UNPROVIDED);
            if (module0665.NIL != var142) {
                module0642.f39020(module0015.$g340$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0665.UNPROVIDED);
                module0642.f39020(var142);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0665.UNPROVIDED);
            }
            if (module0665.NIL != var143) {
                module0642.f39020(module0015.$g339$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0665.UNPROVIDED);
                module0642.f39020(var143);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0665.UNPROVIDED);
            }
            if (module0665.NIL != var144) {
                module0642.f39020(module0015.$g350$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0665.UNPROVIDED);
                module0642.f39020((SubLObject)module0665.$ic134$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0665.UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0665.UNPROVIDED);
            final SubLObject var149 = module0015.$g533$.currentBinding(var145);
            try {
                module0015.$g533$.bind((SubLObject)module0665.T, var145);
                module0642.f39019(var148);
            }
            finally {
                module0015.$g533$.rebind(var149, var145);
            }
            module0642.f39020(module0015.$g337$.getGlobalValue());
        }
        else {
            final SubLObject var147 = f40417(var53, var57);
            module0642.f39020(module0015.$g336$.getGlobalValue());
            module0642.f39020(module0015.$g338$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0665.UNPROVIDED);
            module0642.f39020(var147);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0665.UNPROVIDED);
            if (module0665.NIL != var142) {
                module0642.f39020(module0015.$g340$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0665.UNPROVIDED);
                module0642.f39020(var142);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0665.UNPROVIDED);
            }
            if (module0665.NIL != var143) {
                module0642.f39020(module0015.$g339$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0665.UNPROVIDED);
                module0642.f39020(var143);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0665.UNPROVIDED);
            }
            if (module0665.NIL != var144) {
                module0642.f39020(module0015.$g350$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0665.UNPROVIDED);
                module0642.f39020((SubLObject)module0665.$ic134$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0665.UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0665.UNPROVIDED);
            final SubLObject var150 = module0015.$g533$.currentBinding(var145);
            try {
                module0015.$g533$.bind((SubLObject)module0665.T, var145);
            }
            finally {
                module0015.$g533$.rebind(var150, var145);
            }
            module0642.f39020(module0015.$g337$.getGlobalValue());
        }
        return (SubLObject)module0665.NIL;
    }
    
    public static SubLObject f40450(final SubLObject var60, final SubLObject var53, SubLObject var105, SubLObject var68, SubLObject var146, SubLObject var147) {
        if (var105 == module0665.UNPROVIDED) {
            var105 = (SubLObject)module0665.NIL;
        }
        if (var68 == module0665.UNPROVIDED) {
            var68 = (SubLObject)module0665.NIL;
        }
        if (var146 == module0665.UNPROVIDED) {
            var146 = (SubLObject)module0665.$ic133$;
        }
        if (var147 == module0665.UNPROVIDED) {
            var147 = (SubLObject)module0665.NIL;
        }
        final SubLThread var148 = SubLProcess.currentSubLThread();
        final SubLObject var149 = f40419(var53, var60);
        final SubLObject var150 = module0597.f36628(var149);
        if (module0665.NIL != module0173.f10955(var149)) {
            var148.resetMultipleValues();
            final SubLObject var151 = f40416(var53, var149, (SubLObject)module0665.UNPROVIDED);
            final SubLObject var152 = var148.secondMultipleValue();
            var148.resetMultipleValues();
            module0666.f40467(var151, var146, var147, (SubLObject)module0665.UNPROVIDED, (SubLObject)module0665.UNPROVIDED, (SubLObject)module0665.UNPROVIDED);
            module0642.f39027((SubLObject)module0665.$ic135$, (SubLObject)module0665.UNPROVIDED);
            module0642.f39075(var151, var150, var68);
        }
        else {
            final SubLObject var151 = f40417(var53, (SubLObject)module0665.$ic136$);
            module0666.f40467(var151, var146, var147, (SubLObject)module0665.UNPROVIDED, (SubLObject)module0665.UNPROVIDED, (SubLObject)module0665.UNPROVIDED);
            module0642.f39027((SubLObject)module0665.$ic135$, (SubLObject)module0665.UNPROVIDED);
            module0642.f39075(var151, var105, var68);
        }
        return (SubLObject)module0665.NIL;
    }
    
    public static SubLObject f40451(final SubLObject var60, final SubLObject var53, SubLObject var105, SubLObject var143, SubLObject var142, SubLObject var146, SubLObject var149, SubLObject var150) {
        if (var105 == module0665.UNPROVIDED) {
            var105 = (SubLObject)module0665.NIL;
        }
        if (var143 == module0665.UNPROVIDED) {
            var143 = (SubLObject)module0665.NIL;
        }
        if (var142 == module0665.UNPROVIDED) {
            var142 = (SubLObject)module0665.NIL;
        }
        if (var146 == module0665.UNPROVIDED) {
            var146 = (SubLObject)module0665.$ic133$;
        }
        if (var149 == module0665.UNPROVIDED) {
            var149 = (SubLObject)module0665.$ic137$;
        }
        if (var150 == module0665.UNPROVIDED) {
            var150 = (SubLObject)module0665.$ic138$;
        }
        final SubLThread var151 = SubLProcess.currentSubLThread();
        final SubLObject var152 = f40419(var53, var60);
        final SubLObject var153 = (module0665.NIL != assertion_handles_oc.f11035(var152)) ? module0289.f19396(var152) : module0289.f19436(var152, (SubLObject)module0665.UNPROVIDED);
        if (module0665.NIL != module0207.f13509(var153)) {
            var151.resetMultipleValues();
            final SubLObject var154 = f40416(var53, var153, (SubLObject)module0665.$ic139$);
            final SubLObject var155 = var151.secondMultipleValue();
            var151.resetMultipleValues();
            module0657.f40017(var153, (SubLObject)ConsesLow.list(new SubLObject[] { module0665.$ic140$, var154, module0665.$ic141$, var146, module0665.$ic142$, var149, module0665.$ic143$, var150, module0665.$ic144$, var143, module0665.$ic145$, var142 }));
        }
        else {
            final SubLObject var154 = f40417(var53, (SubLObject)module0665.$ic139$);
            final SubLObject var152_153 = (module0665.NIL != assertion_handles_oc.f11035(var105)) ? module0289.f19396(var105) : module0289.f19436(var105, (SubLObject)module0665.UNPROVIDED);
            module0657.f40017(var152_153, (SubLObject)ConsesLow.list(new SubLObject[] { module0665.$ic140$, var154, module0665.$ic141$, var146, module0665.$ic142$, var149, module0665.$ic143$, var150, module0665.$ic144$, var143, module0665.$ic145$, var142 }));
        }
        return (SubLObject)module0665.NIL;
    }
    
    public static SubLObject f40452(final SubLObject var60, final SubLObject var154, SubLObject var155, SubLObject var156, SubLObject var157, SubLObject var158, SubLObject var147) {
        if (var155 == module0665.UNPROVIDED) {
            var155 = (SubLObject)module0665.NIL;
        }
        if (var156 == module0665.UNPROVIDED) {
            var156 = (SubLObject)module0665.$ic146$;
        }
        if (var157 == module0665.UNPROVIDED) {
            var157 = (SubLObject)module0665.T;
        }
        if (var158 == module0665.UNPROVIDED) {
            var158 = (SubLObject)module0665.NIL;
        }
        if (var147 == module0665.UNPROVIDED) {
            var147 = (SubLObject)module0665.NIL;
        }
        final SubLThread var159 = SubLProcess.currentSubLThread();
        final SubLObject var160 = module0038.f2968(var154);
        final SubLObject var161 = module0038.f2965(Sequences.cconcatenate(var160, (SubLObject)module0665.$ic147$));
        final SubLObject var162 = module0038.f2965(Sequences.cconcatenate(var160, (SubLObject)module0665.$ic148$));
        final SubLObject var163 = module0038.f2965(Sequences.cconcatenate(var160, (SubLObject)module0665.$ic149$));
        final SubLObject var164 = module0038.f2965(Sequences.cconcatenate(var160, (SubLObject)module0665.$ic150$));
        final SubLObject var165 = module0038.f2965(Sequences.cconcatenate(var160, (SubLObject)module0665.$ic151$));
        final SubLObject var166 = module0038.f2965(Sequences.cconcatenate(var160, (SubLObject)module0665.$ic152$));
        final SubLObject var167 = module0038.f2965(Sequences.cconcatenate(var160, (SubLObject)module0665.$ic153$));
        module0642.f39020(module0015.$g459$.getGlobalValue());
        module0642.f39020(module0015.$g219$.getGlobalValue());
        module0642.f39020(module0015.$g221$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0665.UNPROVIDED);
        module0642.f39020((SubLObject)module0665.$ic154$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0665.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0665.UNPROVIDED);
        SubLObject var168 = module0015.$g533$.currentBinding(var159);
        try {
            module0015.$g533$.bind((SubLObject)module0665.T, var159);
            if (module0665.NIL != var157) {
                if (module0665.NIL != f40419(var166, var60)) {
                    module0642.f39019((SubLObject)module0665.$ic155$);
                }
                else {
                    module0642.f39020(module0015.$g219$.getGlobalValue());
                    if (module0665.NIL != module0015.$g495$.getGlobalValue()) {
                        module0642.f39020(module0015.$g222$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0665.UNPROVIDED);
                        module0642.f39020(module0642.f39042(module0015.$g495$.getGlobalValue()));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0665.UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0665.UNPROVIDED);
                    final SubLObject var145_167 = module0015.$g533$.currentBinding(var159);
                    try {
                        module0015.$g533$.bind((SubLObject)module0665.T, var159);
                        module0642.f39019((SubLObject)module0665.$ic155$);
                    }
                    finally {
                        module0015.$g533$.rebind(var145_167, var159);
                    }
                    module0642.f39020(module0015.$g220$.getGlobalValue());
                }
            }
            else {
                module0642.f39027((SubLObject)module0665.$ic135$, (SubLObject)module0665.TWO_INTEGER);
            }
        }
        finally {
            module0015.$g533$.rebind(var168, var159);
        }
        module0642.f39020(module0015.$g220$.getGlobalValue());
        if (module0665.NIL != f40420(var165, var60)) {
            final SubLObject var169 = f40417(var161, (SubLObject)module0665.$ic136$);
            module0642.f39020(module0015.$g318$.getGlobalValue());
            module0642.f39020(module0015.$g320$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0665.UNPROVIDED);
            module0642.f39020(var169);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0665.UNPROVIDED);
            module0642.f39032((SubLObject)module0665.ONE_INTEGER);
            module0642.f39020((SubLObject)module0665.$ic156$);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0665.UNPROVIDED);
            final SubLObject var170 = module0015.$g533$.currentBinding(var159);
            try {
                module0015.$g533$.bind((SubLObject)module0665.T, var159);
                final SubLObject var171 = module0035.f2171((SubLObject)module0665.NIL, f40420(var161, var60));
                final SubLObject var172 = f40415((SubLObject)module0665.NIL, (SubLObject)module0665.$ic87$);
                module0642.f39020(module0015.$g324$.getGlobalValue());
                if (module0665.NIL != var171) {
                    module0642.f39046(module0015.$g327$.getGlobalValue());
                }
                if (module0665.NIL != var172) {
                    module0642.f39020(module0015.$g326$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0665.UNPROVIDED);
                    module0642.f39020(var172);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0665.UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0665.UNPROVIDED);
                final SubLObject var145_168 = module0015.$g533$.currentBinding(var159);
                try {
                    module0015.$g533$.bind((SubLObject)module0665.T, var159);
                    module0642.f39019((SubLObject)module0665.$ic157$);
                }
                finally {
                    module0015.$g533$.rebind(var145_168, var159);
                }
                module0642.f39020(module0015.$g325$.getGlobalValue());
                SubLObject var173 = f40420(var165, var60);
                SubLObject var174 = (SubLObject)module0665.NIL;
                var174 = var173.first();
                while (module0665.NIL != var173) {
                    final SubLObject var175 = module0035.f2171(var174, f40420(var161, var60));
                    final SubLObject var176 = f40415(var174, (SubLObject)module0665.$ic87$);
                    module0642.f39020(module0015.$g324$.getGlobalValue());
                    if (module0665.NIL != var175) {
                        module0642.f39046(module0015.$g327$.getGlobalValue());
                    }
                    if (module0665.NIL != var176) {
                        module0642.f39020(module0015.$g326$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0665.UNPROVIDED);
                        module0642.f39020(var176);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0665.UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0665.UNPROVIDED);
                    final SubLObject var145_169 = module0015.$g533$.currentBinding(var159);
                    try {
                        module0015.$g533$.bind((SubLObject)module0665.T, var159);
                        module0642.f39019(Functions.funcall(var156, var174));
                    }
                    finally {
                        module0015.$g533$.rebind(var145_169, var159);
                    }
                    module0642.f39020(module0015.$g325$.getGlobalValue());
                    var173 = var173.rest();
                    var174 = var173.first();
                }
            }
            finally {
                module0015.$g533$.rebind(var170, var159);
            }
            module0642.f39020(module0015.$g319$.getGlobalValue());
            f40445(var60, (SubLObject)module0665.$ic158$, var164, (SubLObject)module0665.UNPROVIDED);
            f40421(var162, var60, f40419(var163, var60));
            f40425(var163, var60);
            f40440(var60, var162, (SubLObject)module0665.UNPROVIDED, (SubLObject)module0665.UNPROVIDED);
            f40440(var60, var165, (SubLObject)module0665.UNPROVIDED, (SubLObject)module0665.UNPROVIDED);
        }
        else {
            f40448(var60, var163, (SubLObject)module0665.$ic60$, module0655.$g5135$.getDynamicValue(var159), (SubLObject)module0665.UNPROVIDED);
            module0642.f39027((SubLObject)module0665.$ic135$, (SubLObject)module0665.UNPROVIDED);
            f40445(var60, (SubLObject)module0665.$ic159$, (SubLObject)module0665.$ic160$, (SubLObject)module0665.UNPROVIDED);
            if (module0665.NIL == f40419(var166, var60) && module0665.NIL != var158) {
                module0642.f39027((SubLObject)module0665.$ic135$, (SubLObject)module0665.UNPROVIDED);
                f40447(var60, var163, (SubLObject)module0665.$ic161$, var147, (SubLObject)module0665.UNPROVIDED, (SubLObject)module0665.UNPROVIDED);
            }
            f40440(var60, var162, (SubLObject)module0665.UNPROVIDED, (SubLObject)module0665.UNPROVIDED);
        }
        f40440(var60, var154, (SubLObject)module0665.UNPROVIDED, (SubLObject)module0665.UNPROVIDED);
        if (module0665.NIL != f40419(var167, var60)) {
            module0642.f39027((SubLObject)module0665.$ic135$, (SubLObject)module0665.UNPROVIDED);
            module0642.f39020(module0015.$g219$.getGlobalValue());
            if (module0665.NIL != module0015.$g495$.getGlobalValue()) {
                module0642.f39020(module0015.$g222$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0665.UNPROVIDED);
                module0642.f39020(module0642.f39042(module0015.$g495$.getGlobalValue()));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0665.UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0665.UNPROVIDED);
            var168 = module0015.$g533$.currentBinding(var159);
            try {
                module0015.$g533$.bind((SubLObject)module0665.T, var159);
                module0642.f39019(f40419(var167, var60));
            }
            finally {
                module0015.$g533$.rebind(var168, var159);
            }
            module0642.f39020(module0015.$g220$.getGlobalValue());
        }
        module0642.f39028((SubLObject)module0665.UNPROVIDED);
        module0642.f39020(module0015.$g460$.getGlobalValue());
        return (SubLObject)module0665.NIL;
    }
    
    public static SubLObject f40453(final SubLObject var60, final SubLObject var154) {
        final SubLObject var155 = module0038.f2968(var154);
        final SubLObject var156 = module0038.f2965(Sequences.cconcatenate(var155, (SubLObject)module0665.$ic147$));
        final SubLObject var157 = module0038.f2965(Sequences.cconcatenate(var155, (SubLObject)module0665.$ic148$));
        final SubLObject var158 = module0038.f2965(Sequences.cconcatenate(var155, (SubLObject)module0665.$ic149$));
        final SubLObject var159 = module0038.f2965(Sequences.cconcatenate(var155, (SubLObject)module0665.$ic151$));
        final SubLObject var160 = module0038.f2965(Sequences.cconcatenate(var155, (SubLObject)module0665.$ic152$));
        final SubLObject var161 = module0038.f2965(Sequences.cconcatenate(var155, (SubLObject)module0665.$ic153$));
        if (module0665.NIL == f40419(var156, var60)) {
            f40421(var156, var60, f40419(var154, var60));
        }
        f40440(var60, var154, (SubLObject)module0665.UNPROVIDED, (SubLObject)module0665.UNPROVIDED);
        f40440(var60, var157, (SubLObject)module0665.UNPROVIDED, (SubLObject)module0665.UNPROVIDED);
        f40440(var60, var156, (SubLObject)module0665.UNPROVIDED, (SubLObject)module0665.UNPROVIDED);
        f40440(var60, var158, (SubLObject)module0665.UNPROVIDED, (SubLObject)module0665.UNPROVIDED);
        f40440(var60, var159, (SubLObject)module0665.UNPROVIDED, (SubLObject)module0665.UNPROVIDED);
        f40440(var60, var160, (SubLObject)module0665.UNPROVIDED, (SubLObject)module0665.UNPROVIDED);
        f40440(var60, var161, (SubLObject)module0665.UNPROVIDED, (SubLObject)module0665.UNPROVIDED);
        return (SubLObject)module0665.NIL;
    }
    
    public static SubLObject f40454(final SubLObject var60, final SubLObject var154) {
        final SubLObject var155 = module0038.f2968(var154);
        final SubLObject var156 = module0038.f2965(Sequences.cconcatenate(var155, (SubLObject)module0665.$ic147$));
        final SubLObject var157 = module0038.f2965(Sequences.cconcatenate(var155, (SubLObject)module0665.$ic149$));
        final SubLObject var158 = module0038.f2965(Sequences.cconcatenate(var155, (SubLObject)module0665.$ic151$));
        if (module0665.NIL != module0173.f10955(f40419(var156, var60)) || module0665.NIL != module0038.f2653(f40419(var157, var60)) || module0665.NIL != f40419(var158, var60)) {
            return (SubLObject)module0665.T;
        }
        return (SubLObject)module0665.NIL;
    }
    
    public static SubLObject f40455(final SubLObject var60, final SubLObject var154) {
        final SubLObject var155 = module0038.f2968(var154);
        final SubLObject var156 = module0038.f2965(Sequences.cconcatenate(var155, (SubLObject)module0665.$ic152$));
        if (module0665.NIL != f40419(var156, var60)) {
            return (SubLObject)module0665.T;
        }
        return (SubLObject)module0665.NIL;
    }
    
    public static SubLObject f40456(final SubLObject var60, final SubLObject var154) {
        final SubLObject var155 = module0038.f2968(var154);
        final SubLObject var156 = module0038.f2965(Sequences.cconcatenate(var155, (SubLObject)module0665.$ic147$));
        final SubLObject var157 = module0038.f2965(Sequences.cconcatenate(var155, (SubLObject)module0665.$ic148$));
        final SubLObject var158 = module0038.f2965(Sequences.cconcatenate(var155, (SubLObject)module0665.$ic149$));
        final SubLObject var159 = module0038.f2965(Sequences.cconcatenate(var155, (SubLObject)module0665.$ic151$));
        f40425(var156, var60);
        f40425(var158, var60);
        f40425(var154, var60);
        f40425(var157, var60);
        f40425(var159, var60);
        return var60;
    }
    
    public static SubLObject f40457(final SubLObject var60, final SubLObject var154, final SubLObject var105, SubLObject var156, SubLObject var155) {
        if (var156 == module0665.UNPROVIDED) {
            var156 = (SubLObject)module0665.$ic146$;
        }
        if (var155 == module0665.UNPROVIDED) {
            var155 = (SubLObject)module0665.NIL;
        }
        final SubLObject var157 = module0038.f2968(var154);
        final SubLObject var158 = module0038.f2965(Sequences.cconcatenate(var157, (SubLObject)module0665.$ic149$));
        final SubLObject var159 = module0038.f2965(Sequences.cconcatenate(var157, (SubLObject)module0665.$ic147$));
        final SubLObject var160 = module0038.f2965(Sequences.cconcatenate(var157, (SubLObject)module0665.$ic151$));
        final SubLObject var161 = module0038.f2965(Sequences.cconcatenate(var157, (SubLObject)module0665.$ic152$));
        if (module0665.NIL == f40419(var161, var60) && module0665.NIL != module0038.f2608(f40419(var158, var60)) && module0665.NIL == f40419(var160, var60)) {
            if (module0665.NIL != var155) {
                module0642.f39019((SubLObject)module0665.$ic162$);
                module0642.f39019(var154);
                module0642.f39019((SubLObject)module0665.$ic163$);
                module0642.f39019(var105);
                module0642.f39026((SubLObject)module0665.UNPROVIDED);
            }
            f40421(var159, var60, var105);
            f40421(var161, var60, (SubLObject)module0665.T);
            f40421(var158, var60, Functions.funcall(var156, f40419(var154, var60)));
        }
        return var60;
    }
    
    public static SubLObject f40458(final SubLObject var60, final SubLObject var174, final SubLObject var175, final SubLObject var176, SubLObject var156) {
        if (var156 == module0665.UNPROVIDED) {
            var156 = (SubLObject)module0665.$ic146$;
        }
        SubLObject var177 = (SubLObject)module0665.NIL;
        SubLObject var30_178 = (SubLObject)module0665.NIL;
        SubLObject var178 = (SubLObject)module0665.NIL;
        SubLObject var154_180 = (SubLObject)module0665.NIL;
        var177 = var176;
        var30_178 = var177.first();
        var178 = var175;
        var154_180 = var178.first();
        while (module0665.NIL != var178 || module0665.NIL != var177) {
            f40459(var60, var154_180, var30_178, var156);
            var177 = var177.rest();
            var30_178 = var177.first();
            var178 = var178.rest();
            var154_180 = var178.first();
        }
        return var60;
    }
    
    public static SubLObject f40459(final SubLObject var60, final SubLObject var154, final SubLObject var30, SubLObject var156) {
        if (var156 == module0665.UNPROVIDED) {
            var156 = (SubLObject)module0665.$ic146$;
        }
        final SubLObject var157 = module0038.f2968(var154);
        final SubLObject var158 = module0038.f2965(Sequences.cconcatenate(var157, (SubLObject)module0665.$ic147$));
        final SubLObject var159 = module0038.f2965(Sequences.cconcatenate(var157, (SubLObject)module0665.$ic148$));
        final SubLObject var160 = module0038.f2965(Sequences.cconcatenate(var157, (SubLObject)module0665.$ic149$));
        final SubLObject var161 = module0038.f2965(Sequences.cconcatenate(var157, (SubLObject)module0665.$ic152$));
        final SubLObject var162 = Functions.funcall(var156, var30);
        f40421(var154, var60, var30);
        f40421(var159, var60, var162);
        f40421(var158, var60, var30);
        f40421(var160, var60, var162);
        f40421(var161, var60, (SubLObject)module0665.T);
        return var60;
    }
    
    public static SubLObject f40460(SubLObject var60, final SubLObject var154, SubLObject var155, SubLObject var156, SubLObject var182, SubLObject var147, SubLObject var183) {
        if (var155 == module0665.UNPROVIDED) {
            var155 = (SubLObject)module0665.NIL;
        }
        if (var156 == module0665.UNPROVIDED) {
            var156 = (SubLObject)module0665.$ic146$;
        }
        if (var182 == module0665.UNPROVIDED) {
            var182 = (SubLObject)module0665.$ic164$;
        }
        if (var147 == module0665.UNPROVIDED) {
            var147 = (SubLObject)module0665.NIL;
        }
        if (var183 == module0665.UNPROVIDED) {
            var183 = (SubLObject)module0665.NIL;
        }
        final SubLThread var184 = SubLProcess.currentSubLThread();
        final SubLObject var185 = module0038.f2968(var154);
        final SubLObject var186 = module0038.f2965(Sequences.cconcatenate(var185, (SubLObject)module0665.$ic147$));
        final SubLObject var187 = module0038.f2965(Sequences.cconcatenate(var185, (SubLObject)module0665.$ic148$));
        final SubLObject var188 = module0038.f2965(Sequences.cconcatenate(var185, (SubLObject)module0665.$ic149$));
        final SubLObject var189 = module0038.f2965(Sequences.cconcatenate(var185, (SubLObject)module0665.$ic150$));
        final SubLObject var190 = module0038.f2965(Sequences.cconcatenate(var185, (SubLObject)module0665.$ic151$));
        final SubLObject var191 = module0038.f2965(Sequences.cconcatenate(var185, (SubLObject)module0665.$ic153$));
        SubLObject var192 = (SubLObject)module0665.NIL;
        if (module0665.NIL != var155) {
            module0642.f39019((SubLObject)module0665.$ic165$);
            module0642.f39019(var154);
            module0642.f39019((SubLObject)module0665.$ic166$);
        }
        if (module0665.NIL != f40419(var189, var60)) {
            if (module0665.NIL != var155) {
                module0642.f39019((SubLObject)module0665.$ic167$);
                module0642.f39026((SubLObject)module0665.UNPROVIDED);
            }
            f40421(var188, var60, f40419(var187, var60));
            f40425(var187, var60);
            f40425(var186, var60);
            f40425(var154, var60);
            f40425(var190, var60);
        }
        else if (module0665.NIL != f40419(var186, var60) && !f40419(var186, var60).equal(f40419(var154, var60))) {
            if (module0665.NIL != var155) {
                module0642.f39019((SubLObject)module0665.$ic168$);
                module0642.f39026((SubLObject)module0665.UNPROVIDED);
            }
            f40425(var190, var60);
            var60 = f40459(var60, var154, f40419(var186, var60), var156);
        }
        else if (module0665.NIL == f40419(var186, var60) && !f40419(var187, var60).equal(f40419(var188, var60))) {
            if (module0665.NIL != var155) {
                module0642.f39019((SubLObject)module0665.$ic169$);
            }
            f40425(var186, var60);
            if (!f40419(var188, var60).isString()) {
                f40421(var188, var60, (SubLObject)module0665.$ic60$);
            }
            var192 = Functions.funcall(var182, f40419(var188, var60));
            if (module0665.NIL != var192 && module0665.NIL != module0269.f17705(var147)) {
                if (module0665.NIL != module0269.f17707(var183)) {
                    var192 = module0259.f16860(var147, var192, var183);
                }
                else {
                    final SubLObject var193 = module0147.$g2094$.currentBinding(var184);
                    final SubLObject var194 = module0147.$g2095$.currentBinding(var184);
                    try {
                        module0147.$g2094$.bind((SubLObject)module0665.$ic170$, var184);
                        module0147.$g2095$.bind(module0665.$ic171$, var184);
                        var192 = module0259.f16860(var147, var192, (SubLObject)module0665.UNPROVIDED);
                    }
                    finally {
                        module0147.$g2095$.rebind(var194, var184);
                        module0147.$g2094$.rebind(var193, var184);
                    }
                }
            }
            if (module0665.NIL == var192) {
                if (module0665.NIL != var155) {
                    PrintLow.format(module0015.$g131$.getDynamicValue(var184), (SubLObject)module0665.$ic172$, f40419(var188, var60));
                    module0642.f39026((SubLObject)module0665.UNPROVIDED);
                }
                if (module0665.NIL == module0038.f2608(f40419(var188, var60))) {
                    if (var156.isFunctionSpec() && module0665.NIL != module0269.f17709(var147)) {
                        f40421(var191, var60, Sequences.cconcatenate(Functions.funcall(var156, var147), new SubLObject[] { module0665.$ic173$, f40419(var188, var60), module0665.$ic174$ }));
                    }
                    else {
                        f40421(var191, var60, Sequences.cconcatenate((SubLObject)module0665.$ic175$, new SubLObject[] { f40419(var188, var60), module0665.$ic174$ }));
                    }
                }
            }
            else if (module0665.NIL != module0035.f1997(var192)) {
                if (module0665.NIL != var155) {
                    PrintLow.format(module0015.$g131$.getDynamicValue(var184), (SubLObject)module0665.$ic176$, f40419(var188, var60), var192.first());
                    module0642.f39026((SubLObject)module0665.UNPROVIDED);
                }
                var60 = f40459(var60, var154, var192.first(), var156);
                var192 = (SubLObject)module0665.NIL;
            }
            else {
                if (module0665.NIL != var155) {
                    PrintLow.format(module0015.$g131$.getDynamicValue(var184), (SubLObject)module0665.$ic177$, f40419(var188, var60), var192);
                    module0642.f39026((SubLObject)module0665.UNPROVIDED);
                }
                f40422(var190, var60, var192);
            }
        }
        else if (module0665.NIL != module0038.f2608(f40419(var188, var60))) {
            if (module0665.NIL != var155) {
                module0642.f39019((SubLObject)module0665.$ic178$);
                module0642.f39026((SubLObject)module0665.UNPROVIDED);
            }
        }
        else if (module0665.NIL != f40419(var154, var60)) {
            if (module0665.NIL != var155) {
                module0642.f39019((SubLObject)module0665.$ic179$);
                module0642.f39026((SubLObject)module0665.UNPROVIDED);
            }
            var60 = f40459(var60, var154, f40419(var154, var60), var156);
        }
        else if (module0665.NIL != var155) {
            module0642.f39019((SubLObject)module0665.$ic180$);
            module0642.f39026((SubLObject)module0665.UNPROVIDED);
        }
        f40421(var154, var60, f40419(var186, var60));
        return var60;
    }
    
    public static SubLObject f40461(final SubLObject var60, final SubLObject var174, final SubLObject var175, SubLObject var155, SubLObject var156, SubLObject var186, SubLObject var187, SubLObject var158, SubLObject var147) {
        if (var155 == module0665.UNPROVIDED) {
            var155 = (SubLObject)module0665.NIL;
        }
        if (var156 == module0665.UNPROVIDED) {
            var156 = (SubLObject)module0665.$ic146$;
        }
        if (var186 == module0665.UNPROVIDED) {
            var186 = (SubLObject)module0665.ONE_INTEGER;
        }
        if (var187 == module0665.UNPROVIDED) {
            var187 = (SubLObject)module0665.ONE_INTEGER;
        }
        if (var158 == module0665.UNPROVIDED) {
            var158 = (SubLObject)module0665.NIL;
        }
        if (var147 == module0665.UNPROVIDED) {
            var147 = (SubLObject)module0665.NIL;
        }
        final SubLObject var188 = Sequences.length(var175);
        SubLObject var189 = (SubLObject)module0665.ZERO_INTEGER;
        SubLObject var190 = (SubLObject)module0665.NIL;
        SubLObject var191 = (SubLObject)module0665.NIL;
        SubLObject var192 = var175;
        SubLObject var193 = (SubLObject)module0665.NIL;
        var193 = var192.first();
        while (module0665.NIL != var192) {
            final SubLObject var194 = module0038.f2968(var193);
            final SubLObject var195 = module0038.f2965(Sequences.cconcatenate(var194, (SubLObject)module0665.$ic181$));
            final SubLObject var196 = Numbers.numL(var189, var186);
            if (module0665.NIL != f40454(var60, var193)) {
                var189 = Numbers.add(var189, (SubLObject)module0665.ONE_INTEGER);
                f40452(var60, var193, var155, var156, var196, var158, var147);
                f40445(var60, (SubLObject)module0665.$ic182$, var195, (SubLObject)module0665.UNPROVIDED);
                module0642.f39026((SubLObject)module0665.UNPROVIDED);
                if (module0665.NIL != f40419(var193, var60)) {
                    var190 = (SubLObject)ConsesLow.cons(f40419(var193, var60), var190);
                }
            }
            else {
                var191 = (SubLObject)ConsesLow.cons(var193, var191);
            }
            var192 = var192.rest();
            var193 = var192.first();
        }
        var190 = Sequences.nreverse(var190);
        f40422(var174, var60, var190);
        var191 = Sequences.nreverse(var191);
        if (var189.numE(var188)) {
            if (module0665.NIL != var155) {
                module0642.f39019((SubLObject)module0665.$ic183$);
            }
        }
        else if (var189.numG(var188)) {
            if (module0665.NIL != var155) {
                module0642.f39019((SubLObject)module0665.$ic184$);
            }
        }
        else if (module0665.NIL != var191) {
            if (Numbers.subtract(var186, var189).numGE((SubLObject)module0665.ZERO_INTEGER) && module0665.NIL != var155) {
                module0642.f39019((SubLObject)module0665.$ic79$);
                module0642.f39019(Numbers.subtract(var186, var189));
                module0642.f39019((SubLObject)module0665.$ic185$);
                module0642.f39026((SubLObject)module0665.UNPROVIDED);
            }
            SubLObject var197 = (SubLObject)module0665.NIL;
            if (module0665.NIL == var197) {
                SubLObject var198 = var191;
                SubLObject var199 = (SubLObject)module0665.NIL;
                var199 = var198.first();
                while (module0665.NIL == var197 && module0665.NIL != var198) {
                    final SubLObject var200 = Numbers.numL(var189, var186);
                    var189 = Numbers.add(var189, (SubLObject)module0665.ONE_INTEGER);
                    if (var189.numGE(Numbers.max(var186, var187))) {
                        var197 = (SubLObject)module0665.T;
                    }
                    f40452(var60, var199, var155, Symbols.symbol_function((SubLObject)module0665.$ic186$), var200, var158, var147);
                    module0642.f39026((SubLObject)module0665.UNPROVIDED);
                    var198 = var198.rest();
                    var199 = var198.first();
                }
            }
        }
        else {
            module0642.f39019((SubLObject)module0665.$ic187$);
        }
        f40440(var60, var174, (SubLObject)module0665.UNPROVIDED, (SubLObject)module0665.UNPROVIDED);
        return (SubLObject)module0665.NIL;
    }
    
    public static SubLObject f40462(final SubLObject var60, final SubLObject var174, final SubLObject var175, SubLObject var155, SubLObject var156, SubLObject var182, SubLObject var147, SubLObject var183) {
        if (var155 == module0665.UNPROVIDED) {
            var155 = (SubLObject)module0665.NIL;
        }
        if (var156 == module0665.UNPROVIDED) {
            var156 = (SubLObject)module0665.$ic146$;
        }
        if (var182 == module0665.UNPROVIDED) {
            var182 = (SubLObject)module0665.$ic164$;
        }
        if (var147 == module0665.UNPROVIDED) {
            var147 = (SubLObject)module0665.NIL;
        }
        if (var183 == module0665.UNPROVIDED) {
            var183 = (SubLObject)module0665.NIL;
        }
        SubLObject var184 = (SubLObject)module0665.NIL;
        SubLObject var185 = var175;
        SubLObject var186 = (SubLObject)module0665.NIL;
        var186 = var185.first();
        while (module0665.NIL != var185) {
            final SubLObject var187 = module0038.f2968(var186);
            final SubLObject var188 = module0038.f2965(Sequences.cconcatenate(var187, (SubLObject)module0665.$ic181$));
            if (module0665.NIL != f40419(var188, var60)) {
                f40456(var60, var186);
            }
            f40460(var60, var186, var155, var156, var182, var147, var183);
            if (module0665.NIL != module0173.f10955(f40419(var186, var60))) {
                var184 = (SubLObject)ConsesLow.cons(f40419(var186, var60), var184);
            }
            var184 = Sequences.nreverse(var184);
            f40422(var174, var60, var184);
            var185 = var185.rest();
            var186 = var185.first();
        }
        return (SubLObject)module0665.NIL;
    }
    
    public static SubLObject f40463(final SubLObject var195) {
        assert module0665.NIL != module0004.f106(var195) : var195;
        SubLObject var196 = (SubLObject)module0665.NIL;
        SubLObject var197;
        for (var197 = (SubLObject)module0665.NIL, var197 = (SubLObject)module0665.ZERO_INTEGER; var197.numL(var195); var197 = Numbers.add(var197, (SubLObject)module0665.ONE_INTEGER)) {
            var196 = (SubLObject)ConsesLow.cons(Symbols.make_keyword(Sequences.cconcatenate((SubLObject)module0665.$ic189$, module0006.f203(var197))), var196);
        }
        return Sequences.nreverse(var196);
    }
    
    public static SubLObject f40464() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40368", "S#44457", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40370", "S#44458", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40371", "S#44456", 1, 0, false);
        new $f40371$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40369", "S#44459", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40372", "S#44460", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40373", "S#44461", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40374", "S#44462", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40375", "S#44463", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40376", "S#44464", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40377", "S#44465", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40378", "S#44466", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40379", "S#44467", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40380", "S#44468", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40381", "S#44469", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40382", "S#44470", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40383", "S#44471", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40384", "S#44472", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40385", "S#44473", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40386", "S#44474", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40387", "S#44475", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40388", "S#44476", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40389", "S#44477", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0665", "f40390", "S#44478");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40391", "S#44479", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40392", "S#44480", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40393", "S#44481", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40394", "S#44482", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40395", "S#44483", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40396", "S#44484", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40397", "S#44485", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40398", "S#44486", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40399", "S#44487", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40400", "S#44488", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40401", "S#44489", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40402", "S#44490", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40403", "S#44491", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40404", "S#44492", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40405", "S#44493", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40406", "S#44494", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40408", "S#44495", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40409", "S#44496", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40411", "S#44497", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40412", "S#44498", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40413", "S#44499", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40407", "S#44500", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40414", "S#44501", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40410", "S#44502", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40415", "S#44503", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40416", "S#44504", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40417", "S#44505", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40418", "S#44506", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40419", "S#44507", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40420", "S#44508", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40421", "S#44509", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40422", "S#44510", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40423", "S#44511", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40424", "S#44512", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40425", "S#44513", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40426", "S#44514", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40427", "S#44515", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40428", "S#44516", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40429", "S#44517", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40430", "S#44518", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40431", "S#44519", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40432", "S#44520", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40433", "S#44521", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40434", "S#44522", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0665", "f40435", "S#44523");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40436", "S#44524", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40437", "S#44525", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40438", "S#44526", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40439", "S#44527", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40440", "S#44528", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40441", "S#44529", 3, 2, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0665", "f40442", "S#44530");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0665", "f40443", "S#44531");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0665", "f40444", "S#44532");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40445", "S#44533", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40446", "S#44534", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40447", "S#44535", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40448", "S#44536", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40449", "S#44537", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40450", "S#44538", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40451", "S#44539", 2, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40452", "S#44540", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40453", "S#44541", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40454", "S#44542", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40455", "S#44543", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40456", "S#44544", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40457", "S#44545", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40458", "S#44546", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40459", "S#44547", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40460", "S#44548", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40461", "S#44549", 3, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40462", "S#44550", 3, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0665", "f40463", "S#44551", 1, 0, false);
        return (SubLObject)module0665.NIL;
    }
    
    public static SubLObject f40465() {
        module0665.$g5233$ = SubLFiles.defparameter("S#44552", (SubLObject)module0665.NIL);
        module0665.$g5234$ = SubLFiles.defparameter("S#44553", Hashtables.make_hash_table((SubLObject)module0665.TEN_INTEGER, (SubLObject)module0665.UNPROVIDED, (SubLObject)module0665.UNPROVIDED));
        module0665.$g5235$ = SubLFiles.defparameter("S#44554", Hashtables.make_hash_table((SubLObject)module0665.TEN_INTEGER, (SubLObject)module0665.UNPROVIDED, (SubLObject)module0665.UNPROVIDED));
        module0665.$g5236$ = SubLFiles.defconstant("S#44555", (SubLObject)module0665.$ic4$);
        return (SubLObject)module0665.NIL;
    }
    
    public static SubLObject f40466() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0665.$g5236$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0665.$ic11$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0665.$ic12$);
        Structures.def_csetf((SubLObject)module0665.$ic13$, (SubLObject)module0665.$ic14$);
        Structures.def_csetf((SubLObject)module0665.$ic15$, (SubLObject)module0665.$ic16$);
        Structures.def_csetf((SubLObject)module0665.$ic17$, (SubLObject)module0665.$ic18$);
        Structures.def_csetf((SubLObject)module0665.$ic19$, (SubLObject)module0665.$ic20$);
        Structures.def_csetf((SubLObject)module0665.$ic21$, (SubLObject)module0665.$ic22$);
        Structures.def_csetf((SubLObject)module0665.$ic23$, (SubLObject)module0665.$ic24$);
        Structures.def_csetf((SubLObject)module0665.$ic25$, (SubLObject)module0665.$ic26$);
        Structures.def_csetf((SubLObject)module0665.$ic27$, (SubLObject)module0665.$ic28$);
        Equality.identity((SubLObject)module0665.$ic4$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0665.$g5236$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0665.$ic42$));
        SubLObject var197 = f40387((SubLObject)module0665.$ic57$);
        f40379(var197, (SubLObject)module0665.$ic58$);
        Hashtables.sethash(f40372(var197), module0665.$g5234$.getDynamicValue(), var197);
        Hashtables.sethash(f40373(var197), module0665.$g5235$.getDynamicValue(), var197);
        module0665.$g5233$.setDynamicValue((SubLObject)ConsesLow.cons(var197, Sequences.delete((SubLObject)module0665.$ic58$, module0665.$g5233$.getDynamicValue(), Symbols.symbol_function((SubLObject)module0665.EQUAL), (SubLObject)module0665.$ic13$, (SubLObject)module0665.UNPROVIDED, (SubLObject)module0665.UNPROVIDED, (SubLObject)module0665.UNPROVIDED)));
        var197 = f40387((SubLObject)module0665.$ic61$);
        f40379(var197, (SubLObject)module0665.$ic62$);
        Hashtables.sethash(f40372(var197), module0665.$g5234$.getDynamicValue(), var197);
        Hashtables.sethash(f40373(var197), module0665.$g5235$.getDynamicValue(), var197);
        module0665.$g5233$.setDynamicValue((SubLObject)ConsesLow.cons(var197, Sequences.delete((SubLObject)module0665.$ic62$, module0665.$g5233$.getDynamicValue(), Symbols.symbol_function((SubLObject)module0665.EQUAL), (SubLObject)module0665.$ic13$, (SubLObject)module0665.UNPROVIDED, (SubLObject)module0665.UNPROVIDED, (SubLObject)module0665.UNPROVIDED)));
        var197 = f40387((SubLObject)module0665.$ic63$);
        f40379(var197, (SubLObject)module0665.$ic64$);
        Hashtables.sethash(f40372(var197), module0665.$g5234$.getDynamicValue(), var197);
        Hashtables.sethash(f40373(var197), module0665.$g5235$.getDynamicValue(), var197);
        module0665.$g5233$.setDynamicValue((SubLObject)ConsesLow.cons(var197, Sequences.delete((SubLObject)module0665.$ic64$, module0665.$g5233$.getDynamicValue(), Symbols.symbol_function((SubLObject)module0665.EQUAL), (SubLObject)module0665.$ic13$, (SubLObject)module0665.UNPROVIDED, (SubLObject)module0665.UNPROVIDED, (SubLObject)module0665.UNPROVIDED)));
        var197 = f40387((SubLObject)module0665.$ic65$);
        f40379(var197, (SubLObject)module0665.$ic66$);
        Hashtables.sethash(f40372(var197), module0665.$g5234$.getDynamicValue(), var197);
        Hashtables.sethash(f40373(var197), module0665.$g5235$.getDynamicValue(), var197);
        module0665.$g5233$.setDynamicValue((SubLObject)ConsesLow.cons(var197, Sequences.delete((SubLObject)module0665.$ic66$, module0665.$g5233$.getDynamicValue(), Symbols.symbol_function((SubLObject)module0665.EQUAL), (SubLObject)module0665.$ic13$, (SubLObject)module0665.UNPROVIDED, (SubLObject)module0665.UNPROVIDED, (SubLObject)module0665.UNPROVIDED)));
        var197 = f40387((SubLObject)module0665.$ic67$);
        f40379(var197, (SubLObject)module0665.$ic68$);
        Hashtables.sethash(f40372(var197), module0665.$g5234$.getDynamicValue(), var197);
        Hashtables.sethash(f40373(var197), module0665.$g5235$.getDynamicValue(), var197);
        module0665.$g5233$.setDynamicValue((SubLObject)ConsesLow.cons(var197, Sequences.delete((SubLObject)module0665.$ic68$, module0665.$g5233$.getDynamicValue(), Symbols.symbol_function((SubLObject)module0665.EQUAL), (SubLObject)module0665.$ic13$, (SubLObject)module0665.UNPROVIDED, (SubLObject)module0665.UNPROVIDED, (SubLObject)module0665.UNPROVIDED)));
        var197 = f40387((SubLObject)module0665.$ic72$);
        f40379(var197, (SubLObject)module0665.$ic73$);
        Hashtables.sethash(f40372(var197), module0665.$g5234$.getDynamicValue(), var197);
        Hashtables.sethash(f40373(var197), module0665.$g5235$.getDynamicValue(), var197);
        module0665.$g5233$.setDynamicValue((SubLObject)ConsesLow.cons(var197, Sequences.delete((SubLObject)module0665.$ic73$, module0665.$g5233$.getDynamicValue(), Symbols.symbol_function((SubLObject)module0665.EQUAL), (SubLObject)module0665.$ic13$, (SubLObject)module0665.UNPROVIDED, (SubLObject)module0665.UNPROVIDED, (SubLObject)module0665.UNPROVIDED)));
        var197 = f40387((SubLObject)module0665.$ic83$);
        f40379(var197, (SubLObject)module0665.$ic84$);
        Hashtables.sethash(f40372(var197), module0665.$g5234$.getDynamicValue(), var197);
        Hashtables.sethash(f40373(var197), module0665.$g5235$.getDynamicValue(), var197);
        module0665.$g5233$.setDynamicValue((SubLObject)ConsesLow.cons(var197, Sequences.delete((SubLObject)module0665.$ic84$, module0665.$g5233$.getDynamicValue(), Symbols.symbol_function((SubLObject)module0665.EQUAL), (SubLObject)module0665.$ic13$, (SubLObject)module0665.UNPROVIDED, (SubLObject)module0665.UNPROVIDED, (SubLObject)module0665.UNPROVIDED)));
        var197 = f40387((SubLObject)module0665.$ic85$);
        f40379(var197, (SubLObject)module0665.$ic86$);
        Hashtables.sethash(f40372(var197), module0665.$g5234$.getDynamicValue(), var197);
        Hashtables.sethash(f40373(var197), module0665.$g5235$.getDynamicValue(), var197);
        module0665.$g5233$.setDynamicValue((SubLObject)ConsesLow.cons(var197, Sequences.delete((SubLObject)module0665.$ic86$, module0665.$g5233$.getDynamicValue(), Symbols.symbol_function((SubLObject)module0665.EQUAL), (SubLObject)module0665.$ic13$, (SubLObject)module0665.UNPROVIDED, (SubLObject)module0665.UNPROVIDED, (SubLObject)module0665.UNPROVIDED)));
        return (SubLObject)module0665.NIL;
    }
    
    public void declareFunctions() {
        f40464();
    }
    
    public void initializeVariables() {
        f40465();
    }
    
    public void runTopLevelForms() {
        f40466();
    }
    
    static {
        me = (SubLFile)new module0665();
        module0665.$g5233$ = null;
        module0665.$g5234$ = null;
        module0665.$g5235$ = null;
        module0665.$g5236$ = null;
        $ic0$ = SubLObjectFactory.makeString("#");
        $ic1$ = SubLObjectFactory.makeString("#<");
        $ic2$ = SubLObjectFactory.makeKeyword("STREAM");
        $ic3$ = SubLObjectFactory.makeKeyword("BASE");
        $ic4$ = SubLObjectFactory.makeSymbol("S#44455", "CYC");
        $ic5$ = SubLObjectFactory.makeSymbol("S#44456", "CYC");
        $ic6$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORD"), (SubLObject)SubLObjectFactory.makeSymbol("CHARACTER"), (SubLObject)SubLObjectFactory.makeSymbol("S#44556", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#44557", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#44558", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#44559", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9485", "CYC"));
        $ic7$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("KEYWORD"), (SubLObject)SubLObjectFactory.makeKeyword("CHARACTER"), (SubLObject)SubLObjectFactory.makeKeyword("STRING-VALIDATOR"), (SubLObject)SubLObjectFactory.makeKeyword("STRING-TO-OBJECT-FN"), (SubLObject)SubLObjectFactory.makeKeyword("OBJECT-DETECTOR"), (SubLObject)SubLObjectFactory.makeKeyword("OBJECT-TO-STRING-FN"), (SubLObject)SubLObjectFactory.makeKeyword("PRIORITY"));
        $ic8$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#44459", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#44460", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#44461", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#44462", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#44463", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#44464", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#44465", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#44466", "CYC"));
        $ic9$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#44467", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#44468", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#44469", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#44470", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#44471", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#44472", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#44473", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#44474", "CYC"));
        $ic10$ = SubLObjectFactory.makeSymbol("S#44457", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#44458", "CYC");
        $ic12$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#44456", "CYC"));
        $ic13$ = SubLObjectFactory.makeSymbol("S#44459", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("S#44467", "CYC");
        $ic15$ = SubLObjectFactory.makeSymbol("S#44460", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("S#44468", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("S#44461", "CYC");
        $ic18$ = SubLObjectFactory.makeSymbol("S#44469", "CYC");
        $ic19$ = SubLObjectFactory.makeSymbol("S#44462", "CYC");
        $ic20$ = SubLObjectFactory.makeSymbol("S#44470", "CYC");
        $ic21$ = SubLObjectFactory.makeSymbol("S#44463", "CYC");
        $ic22$ = SubLObjectFactory.makeSymbol("S#44471", "CYC");
        $ic23$ = SubLObjectFactory.makeSymbol("S#44464", "CYC");
        $ic24$ = SubLObjectFactory.makeSymbol("S#44472", "CYC");
        $ic25$ = SubLObjectFactory.makeSymbol("S#44465", "CYC");
        $ic26$ = SubLObjectFactory.makeSymbol("S#44473", "CYC");
        $ic27$ = SubLObjectFactory.makeSymbol("S#44466", "CYC");
        $ic28$ = SubLObjectFactory.makeSymbol("S#44474", "CYC");
        $ic29$ = SubLObjectFactory.makeKeyword("NAME");
        $ic30$ = SubLObjectFactory.makeKeyword("KEYWORD");
        $ic31$ = SubLObjectFactory.makeKeyword("CHARACTER");
        $ic32$ = SubLObjectFactory.makeKeyword("STRING-VALIDATOR");
        $ic33$ = SubLObjectFactory.makeKeyword("STRING-TO-OBJECT-FN");
        $ic34$ = SubLObjectFactory.makeKeyword("OBJECT-DETECTOR");
        $ic35$ = SubLObjectFactory.makeKeyword("OBJECT-TO-STRING-FN");
        $ic36$ = SubLObjectFactory.makeKeyword("PRIORITY");
        $ic37$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic38$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic39$ = SubLObjectFactory.makeSymbol("S#44475", "CYC");
        $ic40$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic41$ = SubLObjectFactory.makeKeyword("END");
        $ic42$ = SubLObjectFactory.makeSymbol("S#44477", "CYC");
        $ic43$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#30", "CYC"));
        $ic44$ = SubLObjectFactory.makeUninternedSymbol("US#629884F");
        $ic45$ = SubLObjectFactory.makeSymbol("CLET");
        $ic46$ = SubLObjectFactory.makeSymbol("QUOTE");
        $ic47$ = SubLObjectFactory.makeSymbol("CSETF");
        $ic48$ = SubLObjectFactory.makeSymbol("SETHASH");
        $ic49$ = SubLObjectFactory.makeSymbol("S#44553", "CYC");
        $ic50$ = SubLObjectFactory.makeSymbol("S#44554", "CYC");
        $ic51$ = SubLObjectFactory.makeSymbol("CSETQ");
        $ic52$ = SubLObjectFactory.makeSymbol("S#44552", "CYC");
        $ic53$ = SubLObjectFactory.makeSymbol("CONS");
        $ic54$ = SubLObjectFactory.makeSymbol("DELETE");
        $ic55$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#44552", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)module0665.EQUAL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#44459", "CYC")));
        $ic56$ = SubLObjectFactory.makeSymbol("<");
        $ic57$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("keyword"), SubLObjectFactory.makeKeyword("KEYWORD"), SubLObjectFactory.makeKeyword("KEYWORD"), SubLObjectFactory.makeKeyword("CHARACTER"), Characters.CHAR_colon, SubLObjectFactory.makeKeyword("STRING-VALIDATOR"), SubLObjectFactory.makeSymbol("STRINGP"), SubLObjectFactory.makeKeyword("STRING-TO-OBJECT-FN"), SubLObjectFactory.makeSymbol("S#44483", "CYC"), SubLObjectFactory.makeKeyword("OBJECT-DETECTOR"), SubLObjectFactory.makeSymbol("KEYWORDP"), SubLObjectFactory.makeKeyword("OBJECT-TO-STRING-FN"), SubLObjectFactory.makeSymbol("S#44484", "CYC"), SubLObjectFactory.makeKeyword("PRIORITY"), module0665.ONE_INTEGER });
        $ic58$ = SubLObjectFactory.makeSymbol("KEYWORD");
        $ic59$ = SubLObjectFactory.makeString("~A");
        $ic60$ = SubLObjectFactory.makeString("");
        $ic61$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("fort"), SubLObjectFactory.makeKeyword("KEYWORD"), SubLObjectFactory.makeKeyword("FORT"), SubLObjectFactory.makeKeyword("CHARACTER"), Characters.CHAR_dollar, SubLObjectFactory.makeKeyword("STRING-VALIDATOR"), SubLObjectFactory.makeSymbol("STRINGP"), SubLObjectFactory.makeKeyword("STRING-TO-OBJECT-FN"), SubLObjectFactory.makeSymbol("S#44486", "CYC"), SubLObjectFactory.makeKeyword("OBJECT-DETECTOR"), SubLObjectFactory.makeSymbol("FORT-P"), SubLObjectFactory.makeKeyword("OBJECT-TO-STRING-FN"), SubLObjectFactory.makeSymbol("S#44485", "CYC"), SubLObjectFactory.makeKeyword("PRIORITY"), module0665.TWO_INTEGER });
        $ic62$ = SubLObjectFactory.makeSymbol("S#10466", "CYC");
        $ic63$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("assertion"), SubLObjectFactory.makeKeyword("KEYWORD"), SubLObjectFactory.makeKeyword("ASSERTION"), SubLObjectFactory.makeKeyword("CHARACTER"), Characters.CHAR_a, SubLObjectFactory.makeKeyword("STRING-VALIDATOR"), SubLObjectFactory.makeSymbol("S#3937", "CYC"), SubLObjectFactory.makeKeyword("STRING-TO-OBJECT-FN"), SubLObjectFactory.makeSymbol("S#44488", "CYC"), SubLObjectFactory.makeKeyword("OBJECT-DETECTOR"), SubLObjectFactory.makeSymbol("ASSERTION-P"), SubLObjectFactory.makeKeyword("OBJECT-TO-STRING-FN"), SubLObjectFactory.makeSymbol("S#44487", "CYC"), SubLObjectFactory.makeKeyword("PRIORITY"), module0665.TWO_INTEGER });
        $ic64$ = SubLObjectFactory.makeSymbol("ASSERTION", "CYC");
        $ic65$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("integer"), SubLObjectFactory.makeKeyword("KEYWORD"), SubLObjectFactory.makeKeyword("INTEGER"), SubLObjectFactory.makeKeyword("CHARACTER"), Characters.CHAR_period, SubLObjectFactory.makeKeyword("STRING-VALIDATOR"), SubLObjectFactory.makeSymbol("S#3937", "CYC"), SubLObjectFactory.makeKeyword("STRING-TO-OBJECT-FN"), SubLObjectFactory.makeSymbol("S#44489", "CYC"), SubLObjectFactory.makeKeyword("OBJECT-DETECTOR"), SubLObjectFactory.makeSymbol("INTEGERP"), SubLObjectFactory.makeKeyword("OBJECT-TO-STRING-FN"), SubLObjectFactory.makeSymbol("S#44490", "CYC"), SubLObjectFactory.makeKeyword("PRIORITY"), module0665.THREE_INTEGER });
        $ic66$ = SubLObjectFactory.makeSymbol("INTEGER");
        $ic67$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("boolean"), SubLObjectFactory.makeKeyword("KEYWORD"), SubLObjectFactory.makeKeyword("BOOLEAN"), SubLObjectFactory.makeKeyword("CHARACTER"), Characters.CHAR_question, SubLObjectFactory.makeKeyword("STRING-VALIDATOR"), module0665.NIL, SubLObjectFactory.makeKeyword("STRING-TO-OBJECT-FN"), SubLObjectFactory.makeSymbol("S#44491", "CYC"), SubLObjectFactory.makeKeyword("OBJECT-DETECTOR"), SubLObjectFactory.makeSymbol("S#44492", "CYC"), SubLObjectFactory.makeKeyword("OBJECT-TO-STRING-FN"), SubLObjectFactory.makeSymbol("S#44493", "CYC"), SubLObjectFactory.makeKeyword("PRIORITY"), module0665.FOUR_INTEGER });
        $ic68$ = SubLObjectFactory.makeSymbol("BOOLEAN");
        $ic69$ = SubLObjectFactory.makeString("NIL");
        $ic70$ = SubLObjectFactory.makeString("nil");
        $ic71$ = SubLObjectFactory.makeString("t");
        $ic72$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("list"), SubLObjectFactory.makeKeyword("KEYWORD"), SubLObjectFactory.makeKeyword("LIST"), SubLObjectFactory.makeKeyword("CHARACTER"), Characters.CHAR_lparen, SubLObjectFactory.makeKeyword("STRING-VALIDATOR"), module0665.NIL, SubLObjectFactory.makeKeyword("STRING-TO-OBJECT-FN"), SubLObjectFactory.makeSymbol("S#44495", "CYC"), SubLObjectFactory.makeKeyword("OBJECT-DETECTOR"), SubLObjectFactory.makeSymbol("CONSP"), SubLObjectFactory.makeKeyword("OBJECT-TO-STRING-FN"), SubLObjectFactory.makeSymbol("S#44496", "CYC"), SubLObjectFactory.makeKeyword("PRIORITY"), module0665.FIVE_INTEGER });
        $ic73$ = SubLObjectFactory.makeSymbol("LIST");
        $ic74$ = SubLObjectFactory.makeString(" ");
        $ic75$ = SubLObjectFactory.makeString("%20");
        $ic76$ = SubLObjectFactory.makeString("+");
        $ic77$ = SubLObjectFactory.makeSymbol("S#44494", "CYC");
        $ic78$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic79$ = SubLObjectFactory.makeString("(");
        $ic80$ = SubLObjectFactory.makeString("_");
        $ic81$ = SubLObjectFactory.makeString(")");
        $ic82$ = SubLObjectFactory.makeSymbol("CCONCATENATE");
        $ic83$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("el-formula"), SubLObjectFactory.makeKeyword("KEYWORD"), SubLObjectFactory.makeKeyword("EL-FORMULA"), SubLObjectFactory.makeKeyword("CHARACTER"), Characters.CHAR_lbrace, SubLObjectFactory.makeKeyword("STRING-VALIDATOR"), module0665.NIL, SubLObjectFactory.makeKeyword("STRING-TO-OBJECT-FN"), SubLObjectFactory.makeSymbol("S#44497", "CYC"), SubLObjectFactory.makeKeyword("OBJECT-DETECTOR"), module0665.NIL, SubLObjectFactory.makeKeyword("OBJECT-TO-STRING-FN"), SubLObjectFactory.makeSymbol("S#44498", "CYC"), SubLObjectFactory.makeKeyword("PRIORITY"), SubLObjectFactory.makeInteger(888) });
        $ic84$ = SubLObjectFactory.makeSymbol("S#22101", "CYC");
        $ic85$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("default"), SubLObjectFactory.makeKeyword("KEYWORD"), SubLObjectFactory.makeKeyword("DEFAULT"), SubLObjectFactory.makeKeyword("CHARACTER"), Characters.CHAR_underbar, SubLObjectFactory.makeKeyword("STRING-VALIDATOR"), SubLObjectFactory.makeSymbol("TRUE"), SubLObjectFactory.makeKeyword("STRING-TO-OBJECT-FN"), module0665.IDENTITY, SubLObjectFactory.makeKeyword("OBJECT-DETECTOR"), SubLObjectFactory.makeSymbol("TRUE"), SubLObjectFactory.makeKeyword("OBJECT-TO-STRING-FN"), SubLObjectFactory.makeSymbol("S#44499", "CYC"), SubLObjectFactory.makeKeyword("PRIORITY"), SubLObjectFactory.makeInteger(999) });
        $ic86$ = SubLObjectFactory.makeSymbol("S#9672", "CYC");
        $ic87$ = SubLObjectFactory.makeKeyword("DEFAULT");
        $ic88$ = SubLObjectFactory.makeString("--~A");
        $ic89$ = SubLObjectFactory.makeInteger(32);
        $ic90$ = SubLObjectFactory.makeKeyword("JUST-FORT");
        $ic91$ = SubLObjectFactory.makeKeyword("JUST-STRING");
        $ic92$ = SubLObjectFactory.makeString("&");
        $ic93$ = SubLObjectFactory.makeString("=");
        $ic94$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#44560", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#44561", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#1553", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#1512", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#1520", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic95$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("TARGET"), (SubLObject)SubLObjectFactory.makeKeyword("SCRIPT"), (SubLObject)SubLObjectFactory.makeKeyword("STYLE"));
        $ic96$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic97$ = SubLObjectFactory.makeKeyword("TARGET");
        $ic98$ = SubLObjectFactory.makeKeyword("SCRIPT");
        $ic99$ = SubLObjectFactory.makeKeyword("STYLE");
        $ic100$ = SubLObjectFactory.makeUninternedSymbol("US#34A40D4");
        $ic101$ = SubLObjectFactory.makeSymbol("FORMAT");
        $ic102$ = SubLObjectFactory.makeString("~A?~A");
        $ic103$ = SubLObjectFactory.makeSymbol("*CYC-CGI-PROGRAM*");
        $ic104$ = SubLObjectFactory.makeSymbol("S#44522", "CYC");
        $ic105$ = SubLObjectFactory.makeSymbol("S#1039", "CYC");
        $ic106$ = SubLObjectFactory.makeKeyword("HREF");
        $ic107$ = ConsesLow.list((SubLObject)module0665.NIL);
        $ic108$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#131", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#44562", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#1568", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#1534", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#1512", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#1561", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic109$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MULTIPLE"), (SubLObject)SubLObjectFactory.makeKeyword("SIZE"), (SubLObject)SubLObjectFactory.makeKeyword("SCRIPT"), (SubLObject)SubLObjectFactory.makeKeyword("ONCHANGE"));
        $ic110$ = SubLObjectFactory.makeKeyword("MULTIPLE");
        $ic111$ = SubLObjectFactory.makeKeyword("SIZE");
        $ic112$ = SubLObjectFactory.makeKeyword("ONCHANGE");
        $ic113$ = SubLObjectFactory.makeUninternedSymbol("US#1426F20");
        $ic114$ = SubLObjectFactory.makeSymbol("S#44505", "CYC");
        $ic115$ = SubLObjectFactory.makeSymbol("S#1016", "CYC");
        $ic116$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#44560", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#131", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#44562", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("DEFAULT"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic117$ = SubLObjectFactory.makeUninternedSymbol("US#4F8F488");
        $ic118$ = SubLObjectFactory.makeUninternedSymbol("US#1A3B910");
        $ic119$ = SubLObjectFactory.makeSymbol("S#3481", "CYC");
        $ic120$ = SubLObjectFactory.makeSymbol("S#44508", "CYC");
        $ic121$ = SubLObjectFactory.makeSymbol("S#44503", "CYC");
        $ic122$ = SubLObjectFactory.makeSymbol("S#1017", "CYC");
        $ic123$ = SubLObjectFactory.makeKeyword("SELECTED");
        $ic124$ = SubLObjectFactory.makeKeyword("VALUE");
        $ic125$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#44560", "CYC"), SubLObjectFactory.makeSymbol("S#131", "CYC"), SubLObjectFactory.makeSymbol("S#44562", "CYC"), SubLObjectFactory.makeSymbol("VALUES"), SubLObjectFactory.makeSymbol("S#44563", "CYC"), SubLObjectFactory.makeSymbol("&KEY"), SubLObjectFactory.makeSymbol("S#1568", "CYC"), SubLObjectFactory.makeSymbol("S#1534", "CYC"), SubLObjectFactory.makeSymbol("S#1512", "CYC"), SubLObjectFactory.makeSymbol("S#1561", "CYC") });
        $ic126$ = SubLObjectFactory.makeUninternedSymbol("US#1069245");
        $ic127$ = SubLObjectFactory.makeUninternedSymbol("US#4F8F488");
        $ic128$ = SubLObjectFactory.makeSymbol("S#44530", "CYC");
        $ic129$ = SubLObjectFactory.makeSymbol("S#3318", "CYC");
        $ic130$ = SubLObjectFactory.makeSymbol("S#44531", "CYC");
        $ic131$ = SubLObjectFactory.makeSymbol("S#1531", "CYC");
        $ic132$ = SubLObjectFactory.makeKeyword("BOOLEAN");
        $ic133$ = SubLObjectFactory.makeString("Complete");
        $ic134$ = SubLObjectFactory.makeString("virtual");
        $ic135$ = SubLObjectFactory.makeKeyword("NBSP");
        $ic136$ = SubLObjectFactory.makeKeyword("FORT");
        $ic137$ = SubLObjectFactory.makeString("Cyclify");
        $ic138$ = SubLObjectFactory.makeString("Clear");
        $ic139$ = SubLObjectFactory.makeKeyword("EL-FORMULA");
        $ic140$ = SubLObjectFactory.makeKeyword("INPUT-NAME");
        $ic141$ = SubLObjectFactory.makeKeyword("COMPLETE-LABEL");
        $ic142$ = SubLObjectFactory.makeKeyword("CYCLIFY-LABEL");
        $ic143$ = SubLObjectFactory.makeKeyword("CLEAR-LABEL");
        $ic144$ = SubLObjectFactory.makeKeyword("HEIGHT");
        $ic145$ = SubLObjectFactory.makeKeyword("WIDTH");
        $ic146$ = SubLObjectFactory.makeSymbol("GENERATE-PHRASE");
        $ic147$ = SubLObjectFactory.makeString("_NEW_FORT");
        $ic148$ = SubLObjectFactory.makeString("_STRING");
        $ic149$ = SubLObjectFactory.makeString("_NEW_STRING");
        $ic150$ = SubLObjectFactory.makeString("_UNDO");
        $ic151$ = SubLObjectFactory.makeString("_CANDIDATES");
        $ic152$ = SubLObjectFactory.makeString("_DONE");
        $ic153$ = SubLObjectFactory.makeString("_ERROR");
        $ic154$ = SubLObjectFactory.makeString("+2");
        $ic155$ = SubLObjectFactory.makeString("*");
        $ic156$ = SubLObjectFactory.makeString("onChange=javascript:this.form.submit();");
        $ic157$ = SubLObjectFactory.makeString("???");
        $ic158$ = SubLObjectFactory.makeString("Undo");
        $ic159$ = SubLObjectFactory.makeString("Submit");
        $ic160$ = SubLObjectFactory.makeKeyword("SUBMIT");
        $ic161$ = SubLObjectFactory.makeKeyword("STRING");
        $ic162$ = SubLObjectFactory.makeString("(nl-fort-input-force-default-if-unset ");
        $ic163$ = SubLObjectFactory.makeString("): setting to ");
        $ic164$ = SubLObjectFactory.makeSymbol("S#44216", "CYC");
        $ic165$ = SubLObjectFactory.makeString("(nl-fort-input-validate ");
        $ic166$ = SubLObjectFactory.makeString("): ");
        $ic167$ = SubLObjectFactory.makeString("Case 1: clicked undo button");
        $ic168$ = SubLObjectFactory.makeString("Case 2: chose fort from pulldown");
        $ic169$ = SubLObjectFactory.makeString("Case 3: text typed in, ");
        $ic170$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic171$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic172$ = SubLObjectFactory.makeString("Case 3a: No parse for \"~A\"");
        $ic173$ = SubLObjectFactory.makeString(" called \"");
        $ic174$ = SubLObjectFactory.makeString("\" not found.");
        $ic175$ = SubLObjectFactory.makeString("\"");
        $ic176$ = SubLObjectFactory.makeString("Case 3b: One parse for \"~A\" = ~A");
        $ic177$ = SubLObjectFactory.makeString("Case 3c: Many parses for \"~A\" = ~A");
        $ic178$ = SubLObjectFactory.makeString("Case 4: no text typed in");
        $ic179$ = SubLObjectFactory.makeString("Case 5: fort set, so use fort as 'new-fort'");
        $ic180$ = SubLObjectFactory.makeString("Case 6: fallthrough!");
        $ic181$ = SubLObjectFactory.makeString("_REMOVE");
        $ic182$ = SubLObjectFactory.makeString("Remove");
        $ic183$ = SubLObjectFactory.makeString("(max reached)");
        $ic184$ = SubLObjectFactory.makeString("(max exceeded)");
        $ic185$ = SubLObjectFactory.makeString(" more required)");
        $ic186$ = SubLObjectFactory.makeSymbol("S#18405", "CYC");
        $ic187$ = SubLObjectFactory.makeString("(key list length reached)");
        $ic188$ = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $ic189$ = SubLObjectFactory.makeString("X");
    }
    
    public static final class $sX44455_native extends SubLStructNative
    {
        public SubLObject $name;
        public SubLObject $keyword;
        public SubLObject $character;
        public SubLObject $string_validator;
        public SubLObject $string_to_object_fn;
        public SubLObject $object_detector;
        public SubLObject $object_to_string_fn;
        public SubLObject $priority;
        private static final SubLStructDeclNative structDecl;
        
        public $sX44455_native() {
            this.$name = (SubLObject)CommonSymbols.NIL;
            this.$keyword = (SubLObject)CommonSymbols.NIL;
            this.$character = (SubLObject)CommonSymbols.NIL;
            this.$string_validator = (SubLObject)CommonSymbols.NIL;
            this.$string_to_object_fn = (SubLObject)CommonSymbols.NIL;
            this.$object_detector = (SubLObject)CommonSymbols.NIL;
            this.$object_to_string_fn = (SubLObject)CommonSymbols.NIL;
            this.$priority = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX44455_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$name;
        }
        
        public SubLObject getField3() {
            return this.$keyword;
        }
        
        public SubLObject getField4() {
            return this.$character;
        }
        
        public SubLObject getField5() {
            return this.$string_validator;
        }
        
        public SubLObject getField6() {
            return this.$string_to_object_fn;
        }
        
        public SubLObject getField7() {
            return this.$object_detector;
        }
        
        public SubLObject getField8() {
            return this.$object_to_string_fn;
        }
        
        public SubLObject getField9() {
            return this.$priority;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$name = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$keyword = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$character = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$string_validator = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$string_to_object_fn = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$object_detector = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$object_to_string_fn = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$priority = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX44455_native.class, module0665.$ic4$, module0665.$ic5$, module0665.$ic6$, module0665.$ic7$, new String[] { "$name", "$keyword", "$character", "$string_validator", "$string_to_object_fn", "$object_detector", "$object_to_string_fn", "$priority" }, module0665.$ic8$, module0665.$ic9$, module0665.$ic10$);
        }
    }
    
    public static final class $f40371$UnaryFunction extends UnaryFunction
    {
        public $f40371$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#44456"));
        }
        
        public SubLObject processItem(final SubLObject var10) {
            return module0665.f40371(var10);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0665.class
	Total time: 693 ms
	
	Decompiled with Procyon 0.5.32.
*/