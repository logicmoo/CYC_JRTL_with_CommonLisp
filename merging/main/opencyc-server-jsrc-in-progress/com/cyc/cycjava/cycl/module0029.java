package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0029 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0029";
    public static final String myFingerPrint = "72865df3150146a34bf7388c7cc4d801a81899c8679a5475a737afa34a7b1f13";
    public static SubLSymbol $g839$;
    public static SubLSymbol $g840$;
    public static SubLSymbol $g835$;
    private static SubLSymbol $g841$;
    private static SubLSymbol $g842$;
    public static SubLSymbol $g836$;
    public static SubLSymbol $g843$;
    private static SubLSymbol $g844$;
    private static SubLSymbol $g845$;
    private static SubLSymbol $g846$;
    private static SubLSymbol $g847$;
    private static SubLSymbol $g848$;
    private static SubLSymbol $g849$;
    private static SubLSymbol $g850$;
    private static SubLSymbol $g851$;
    public static SubLSymbol $g852$;
    private static SubLSymbol $g853$;
    private static SubLSymbol $g854$;
    public static SubLSymbol $g855$;
    private static SubLSymbol $g856$;
    private static SubLSymbol $g857$;
    private static final SubLSymbol $ic0$;
    private static final SubLList $ic1$;
    private static final SubLList $ic2$;
    private static final SubLList $ic3$;
    private static final SubLList $ic4$;
    private static final SubLList $ic5$;
    private static final SubLList $ic6$;
    private static final SubLList $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLList $ic11$;
    private static final SubLList $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLList $ic16$;
    private static final SubLList $ic17$;
    private static final SubLString $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLInteger $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLString $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLList $ic30$;
    private static final SubLList $ic31$;
    private static final SubLList $ic32$;
    private static final SubLList $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLList $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLString $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLString $ic49$;
    private static final SubLString $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLString $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLString $ic56$;
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
    private static final SubLInteger $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLList $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLString $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLString $ic86$;
    private static final SubLString $ic87$;
    private static final SubLString $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLString $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLList $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLList $ic94$;
    private static final SubLList $ic95$;
    private static final SubLString $ic96$;
    private static final SubLList $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLList $ic100$;
    private static final SubLList $ic101$;
    private static final SubLList $ic102$;
    private static final SubLList $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLList $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLSymbol $ic108$;
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
    private static final SubLSymbol $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLList $ic121$;
    private static final SubLList $ic122$;
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
    private static final SubLList $ic138$;
    private static final SubLList $ic139$;
    private static final SubLSymbol $ic140$;
    private static final SubLSymbol $ic141$;
    private static final SubLSymbol $ic142$;
    private static final SubLList $ic143$;
    private static final SubLList $ic144$;
    private static final SubLSymbol $ic145$;
    private static final SubLList $ic146$;
    private static final SubLList $ic147$;
    private static final SubLSymbol $ic148$;
    private static final SubLSymbol $ic149$;
    private static final SubLSymbol $ic150$;
    private static final SubLSymbol $ic151$;
    private static final SubLString $ic152$;
    private static final SubLString $ic153$;
    private static final SubLString $ic154$;
    private static final SubLString $ic155$;
    private static final SubLString $ic156$;
    private static final SubLSymbol $ic157$;
    private static final SubLSymbol $ic158$;
    
    
    public static SubLObject f1471() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return $g841$.getDynamicValue(var1);
    }
    
    public static SubLObject f1472(final SubLObject var2) {
        return module0004.f104(var2, (SubLObject)$ic2$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f1473(final SubLObject var2) {
        return module0004.f104(var2, $g842$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f1474(final SubLObject var2) {
        return module0004.f104(var2, (SubLObject)$ic3$, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f1475(final SubLObject var2) {
        return module0004.f104(var2, $g847$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f1476(final SubLObject var2) {
        return module0004.f104(var2, $g844$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f1477(final SubLObject var2) {
        return module0004.f104(var2, $g845$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f1478(final SubLObject var2) {
        return module0004.f104(var2, $g846$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f1479(final SubLObject var3, final SubLObject var4) {
        return module0035.f2385(var3, var4, $g847$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f1480(final SubLObject var2) {
        return module0004.f104(var2, $g848$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQ), Symbols.symbol_function((SubLObject)$ic8$));
    }
    
    public static SubLObject f1481(final SubLObject var2) {
        return (SubLObject)makeBoolean($ic9$ == var2 || NIL != f1480(var2));
    }
    
    public static SubLObject f1482(final SubLObject var5) {
        assert NIL != f1480(var5) : var5;
        return module0035.f2293($g848$.getGlobalValue(), var5, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).first();
    }
    
    public static SubLObject f1483() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return $g849$.getDynamicValue(var1);
    }
    
    public static SubLObject f1484() {
        $g849$.setDynamicValue((SubLObject)NIL);
        Hashtables.clrhash($g850$.getGlobalValue());
        Hashtables.clrhash($g851$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f1485(final SubLObject var6, final SubLObject var7) {
        SubLObject var9;
        final SubLObject var8 = var9 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic11$);
        final SubLObject var10 = var9.rest();
        var9 = var9.first();
        SubLObject var11 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic11$);
        var11 = var9.first();
        var9 = var9.rest();
        SubLObject var12 = (SubLObject)NIL;
        SubLObject var13 = var9;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15_16 = (SubLObject)NIL;
        while (NIL != var13) {
            cdestructuring_bind.destructuring_bind_must_consp(var13, var8, (SubLObject)$ic11$);
            var15_16 = var13.first();
            var13 = var13.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var13, var8, (SubLObject)$ic11$);
            if (NIL == conses_high.member(var15_16, (SubLObject)$ic12$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var14 = (SubLObject)T;
            }
            if (var15_16 == $ic13$) {
                var12 = var13.first();
            }
            var13 = var13.rest();
        }
        if (NIL != var14 && NIL == var12) {
            cdestructuring_bind.cdestructuring_bind_error(var8, (SubLObject)$ic11$);
        }
        final SubLObject var15 = cdestructuring_bind.property_list_member((SubLObject)$ic14$, var9);
        final SubLObject var16 = (SubLObject)((NIL != var15) ? conses_high.cadr(var15) : NIL);
        final SubLObject var17;
        var9 = (var17 = var10);
        return (SubLObject)ConsesLow.listS((SubLObject)$ic15$, (SubLObject)ConsesLow.list(var11, (SubLObject)$ic16$, var16), ConsesLow.append(var17, (SubLObject)NIL));
    }
    
    public static SubLObject f1486(final SubLObject var6, final SubLObject var7) {
        SubLObject var9;
        final SubLObject var8 = var9 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic17$);
        final SubLObject var10 = var9.rest();
        var9 = var9.first();
        SubLObject var11 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic17$);
        var11 = var9.first();
        var9 = var9.rest();
        final SubLObject var12 = (SubLObject)(var9.isCons() ? var9.first() : $ic18$);
        cdestructuring_bind.destructuring_bind_must_listp(var9, var8, (SubLObject)$ic17$);
        var9 = var9.rest();
        if (NIL == var9) {
            final SubLObject var13;
            var9 = (var13 = var10);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic19$, (SubLObject)ConsesLow.list(var11, (SubLObject)$ic16$, var12), ConsesLow.append(var13, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var8, (SubLObject)$ic17$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f1487() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return Sequences.length($g849$.getDynamicValue(var1));
    }
    
    public static SubLObject f1488() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(NIL == $g849$.getDynamicValue(var1));
    }
    
    public static SubLObject f1489(final SubLObject var24, final SubLObject var25) {
        final SubLThread var26 = SubLProcess.currentSubLThread();
        if (NIL != $g843$.getDynamicValue(var26) && NIL != Hashtables.gethash(var25, $g850$.getGlobalValue(), (SubLObject)UNPROVIDED)) {
            Errors.warn((SubLObject)$ic23$, var25);
        }
        Hashtables.sethash(var25, $g850$.getGlobalValue(), var24);
        Hashtables.sethash(var25, $g851$.getGlobalValue(), ConsesLow.nconc(Hashtables.gethash(var25, $g851$.getGlobalValue(), (SubLObject)UNPROVIDED), (SubLObject)ConsesLow.list(var24)));
        if (var25.isCons()) {
            f1490(var25.first(), var24, $g851$.getGlobalValue());
        }
        if (NIL != module0028.f1466()) {
            final SubLObject var27 = f1491(var24);
            if (NIL != Functions.funcall((SubLObject)$ic24$, var27)) {
                f1490(Functions.funcall((SubLObject)$ic25$, var27), var24, $g851$.getGlobalValue());
            }
        }
        if (NIL != module0028.f1466()) {
            final SubLObject var28 = f1491(var24);
            if (NIL != Functions.funcall((SubLObject)$ic26$, var28)) {
                f1490(Functions.funcall((SubLObject)$ic27$, var28), var24, $g851$.getGlobalValue());
            }
        }
        return var24;
    }
    
    public static SubLObject f1492(final SubLObject var24, final SubLObject var25) {
        Hashtables.remhash(var25, $g850$.getGlobalValue());
        f1493(var25, var24, $g851$.getGlobalValue());
        if (var25.isCons()) {
            f1493(var25.first(), var24, $g851$.getGlobalValue());
        }
        if (NIL != module0028.f1466()) {
            final SubLObject var26 = f1491(var24);
            if (NIL != Functions.funcall((SubLObject)$ic24$, var26)) {
                f1493(Functions.funcall((SubLObject)$ic25$, var26), var24, $g851$.getGlobalValue());
            }
        }
        if (NIL != module0028.f1466()) {
            final SubLObject var27 = f1491(var24);
            if (NIL != Functions.funcall((SubLObject)$ic26$, var27)) {
                f1493(Functions.funcall((SubLObject)$ic27$, var27), var24, $g851$.getGlobalValue());
            }
        }
        return var24;
    }
    
    public static SubLObject f1490(final SubLObject var28, final SubLObject var29, final SubLObject var30) {
        return Hashtables.sethash(var28, var30, ConsesLow.nconc(Sequences.delete(var29, Hashtables.gethash(var28, var30, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)ConsesLow.list(var29)));
    }
    
    public static SubLObject f1493(final SubLObject var28, final SubLObject var29, final SubLObject var30) {
        return Hashtables.sethash(var28, var30, Sequences.delete(var29, Hashtables.gethash(var28, var30, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f1494() {
        SubLObject var31 = f1483();
        SubLObject var32 = (SubLObject)NIL;
        var32 = var31.first();
        while (NIL != var31) {
            f1489(var32, f1495(var32));
            var31 = var31.rest();
            var32 = var31.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f1496(final SubLObject var32, final SubLObject var33) {
        f1497(var32, var33, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f1498(final SubLObject var32) {
        return (SubLObject)((var32.getClass() == $sX2620_native.class) ? T : NIL);
    }
    
    public static SubLObject f1499(final SubLObject var32) {
        assert NIL != f1498(var32) : var32;
        return var32.getField2();
    }
    
    public static SubLObject f1500(final SubLObject var32) {
        assert NIL != f1498(var32) : var32;
        return var32.getField3();
    }
    
    public static SubLObject f1501(final SubLObject var32, final SubLObject var35) {
        assert NIL != f1498(var32) : var32;
        return var32.setField2(var35);
    }
    
    public static SubLObject f1502(final SubLObject var32, final SubLObject var35) {
        assert NIL != f1498(var32) : var32;
        return var32.setField3(var35);
    }
    
    public static SubLObject f1503(SubLObject var36) {
        if (var36 == UNPROVIDED) {
            var36 = (SubLObject)NIL;
        }
        final SubLObject var37 = (SubLObject)new $sX2620_native();
        SubLObject var38;
        SubLObject var39;
        SubLObject var40;
        SubLObject var41;
        for (var38 = (SubLObject)NIL, var38 = var36; NIL != var38; var38 = conses_high.cddr(var38)) {
            var39 = var38.first();
            var40 = conses_high.cadr(var38);
            var41 = var39;
            if (var41.eql((SubLObject)$ic41$)) {
                f1501(var37, var40);
            }
            else if (var41.eql((SubLObject)$ic42$)) {
                f1502(var37, var40);
            }
            else {
                Errors.error((SubLObject)$ic43$, var39);
            }
        }
        return var37;
    }
    
    public static SubLObject f1504(final SubLObject var42, final SubLObject var43) {
        Functions.funcall(var43, var42, (SubLObject)$ic44$, (SubLObject)$ic45$, (SubLObject)TWO_INTEGER);
        Functions.funcall(var43, var42, (SubLObject)$ic46$, (SubLObject)$ic41$, f1499(var42));
        Functions.funcall(var43, var42, (SubLObject)$ic46$, (SubLObject)$ic42$, f1500(var42));
        Functions.funcall(var43, var42, (SubLObject)$ic47$, (SubLObject)$ic45$, (SubLObject)TWO_INTEGER);
        return var42;
    }
    
    public static SubLObject f1505(final SubLObject var42, final SubLObject var43) {
        return f1504(var42, var43);
    }
    
    public static SubLObject f1497(final SubLObject var2, final SubLObject var33, final SubLObject var44) {
        final SubLObject var45 = f1499(var2);
        if (NIL != var45) {
            PrintLow.format(var33, (SubLObject)$ic49$, Strings.string_upcase(var45, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), f1500(var2));
        }
        else {
            PrintLow.format(var33, (SubLObject)$ic50$, f1500(var2));
        }
        return var2;
    }
    
    public static SubLObject f1506(final SubLObject var45, final SubLObject var46) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        if (NIL != var45 && !areAssertionsDisabledFor(me) && NIL == Types.stringp(var45)) {
            throw new AssertionError(var45);
        }
        if (NIL != module0028.f1466()) {
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var47) && NIL == Functions.funcall((SubLObject)$ic52$, var46)) {
                Errors.error((SubLObject)$ic53$, var46);
            }
        }
        else {
            assert NIL != module0027.f1400(var46) : var46;
        }
        final SubLObject var48 = f1503((SubLObject)UNPROVIDED);
        f1501(var48, var45);
        f1502(var48, var46);
        final SubLObject var49 = (NIL != module0028.f1466()) ? Functions.funcall((SubLObject)$ic55$, var48) : module0027.f1420(var46);
        final SubLObject var50 = f1507(var49);
        if (NIL != var50) {
            $g849$.setDynamicValue(Sequences.delete(var50, $g849$.getDynamicValue(var47), Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var47);
            f1492(var50, var49);
        }
        final SubLObject var51 = (SubLObject)ConsesLow.cons(var48, (SubLObject)NIL);
        final SubLObject var52 = $g849$.getDynamicValue(var47);
        if (NIL != var52) {
            module0005.f188(var52, var51);
        }
        else {
            $g849$.setDynamicValue(var51, var47);
        }
        f1489(var48, var49);
        return var48;
    }
    
    public static SubLObject f1508(final SubLObject var50) {
        final SubLThread var51 = SubLProcess.currentSubLThread();
        final SubLObject var52 = f1507(var50);
        if (NIL != var52) {
            $g849$.setDynamicValue(Sequences.delete(var52, $g849$.getDynamicValue(var51), Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var51);
            f1492(var52, var50);
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f1509(final SubLObject var24) {
        return f1499(var24);
    }
    
    public static SubLObject f1491(final SubLObject var24) {
        return f1500(var24);
    }
    
    public static SubLObject f1510(final SubLObject var24) {
        final SubLObject var25 = f1511(var24);
        if (NIL != var25) {
            return var25;
        }
        return Errors.error((SubLObject)$ic56$, var24);
    }
    
    public static SubLObject f1512(final SubLObject var2) {
        return module0035.sublisp_boolean(f1513(var2));
    }
    
    public static SubLObject f1511(final SubLObject var24) {
        final SubLObject var25 = f1491(var24);
        return f1513(var25);
    }
    
    public static SubLObject f1513(final SubLObject var46) {
        if (NIL != module0027.f1400(var46)) {
            return (SubLObject)$ic57$;
        }
        if (NIL != module0416.f29093(var46)) {
            return (SubLObject)$ic58$;
        }
        if (NIL != module0417.f29191(var46)) {
            return (SubLObject)$ic59$;
        }
        if (NIL != module0422.f29474(var46)) {
            return (SubLObject)$ic60$;
        }
        if (NIL != module0418.f29256(var46)) {
            return (SubLObject)$ic61$;
        }
        if (NIL != module0419.f29317(var46)) {
            return (SubLObject)$ic62$;
        }
        if (NIL != module0421.f29427(var46)) {
            return (SubLObject)$ic63$;
        }
        if (NIL != module0633.f38717(var46)) {
            return (SubLObject)$ic64$;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f1495(final SubLObject var24) {
        final SubLObject var25 = f1491(var24);
        final SubLObject var26 = f1510(var24);
        if (var26.eql((SubLObject)$ic58$)) {
            return module0416.f29129(var25);
        }
        if (var26.eql((SubLObject)$ic63$)) {
            return var25;
        }
        if (var26.eql((SubLObject)$ic59$)) {
            return module0417.f29222(var25);
        }
        if (var26.eql((SubLObject)$ic61$)) {
            return module0418.f29287(var25);
        }
        if (var26.eql((SubLObject)$ic60$)) {
            return module0422.f29503(var25);
        }
        if (var26.eql((SubLObject)$ic62$)) {
            return module0419.f29335(var25);
        }
        if (var26.eql((SubLObject)$ic57$)) {
            return module0027.f1420(var25);
        }
        if (var26.eql((SubLObject)$ic64$)) {
            return module0634.f38755(var25);
        }
        return Errors.error((SubLObject)$ic56$, var25);
    }
    
    public static SubLObject f1514(final SubLObject var24) {
        final SubLObject var25 = f1491(var24);
        final SubLObject var26 = f1510(var24);
        if (var26.eql((SubLObject)$ic58$)) {
            return module0416.f29138(var25);
        }
        if (var26.eql((SubLObject)$ic63$)) {
            return module0421.f29446(var25);
        }
        if (var26.eql((SubLObject)$ic59$)) {
            return module0417.f29227(var25);
        }
        if (var26.eql((SubLObject)$ic61$)) {
            return module0418.f29292(var25);
        }
        if (var26.eql((SubLObject)$ic60$)) {
            return module0422.f29508(var25);
        }
        if (var26.eql((SubLObject)$ic62$)) {
            return module0419.f29340(var25);
        }
        if (var26.eql((SubLObject)$ic57$)) {
            return module0027.f1422(var25);
        }
        if (var26.eql((SubLObject)$ic64$)) {
            return module0634.f38756(var25);
        }
        return Errors.error((SubLObject)$ic56$, var25);
    }
    
    public static SubLObject f1515(final SubLObject var24) {
        final SubLObject var25 = f1491(var24);
        final SubLObject var26 = f1510(var24);
        if (var26.eql((SubLObject)$ic58$)) {
            return module0416.f29139(var25);
        }
        if (var26.eql((SubLObject)$ic63$)) {
            return module0421.f29420(var25);
        }
        if (var26.eql((SubLObject)$ic59$)) {
            return module0417.f29225(var25);
        }
        if (var26.eql((SubLObject)$ic61$)) {
            return module0418.f29290(var25);
        }
        if (var26.eql((SubLObject)$ic60$)) {
            return module0422.f29506(var25);
        }
        if (var26.eql((SubLObject)$ic62$)) {
            return module0419.f29336(var25);
        }
        if (var26.eql((SubLObject)$ic57$)) {
            return module0027.f1423(var25);
        }
        if (var26.eql((SubLObject)$ic64$)) {
            return module0634.f38757(var25);
        }
        return Errors.error((SubLObject)$ic56$, var25);
    }
    
    public static SubLObject f1516(final SubLObject var24) {
        final SubLObject var25 = f1491(var24);
        final SubLObject var26 = f1510(var24);
        if (var26.eql((SubLObject)$ic58$)) {
            return module0416.f29143(var25);
        }
        if (var26.eql((SubLObject)$ic63$)) {
            return module0421.f29464(var25);
        }
        if (var26.eql((SubLObject)$ic59$)) {
            return module0417.f29228(var25);
        }
        if (var26.eql((SubLObject)$ic61$)) {
            return module0418.f29293(var25);
        }
        if (var26.eql((SubLObject)$ic60$)) {
            return module0422.f29509(var25);
        }
        if (var26.eql((SubLObject)$ic62$)) {
            return module0419.f29341(var25);
        }
        if (var26.eql((SubLObject)$ic57$)) {
            return module0027.f1424(var25);
        }
        if (var26.eql((SubLObject)$ic64$)) {
            return module0634.f38761(var25);
        }
        return Errors.error((SubLObject)$ic56$, var25);
    }
    
    public static SubLObject f1517(final SubLObject var24) {
        final SubLObject var25 = f1491(var24);
        final SubLObject var26 = f1510(var24);
        if (var26.eql((SubLObject)$ic58$)) {
            return module0416.f29130(var25);
        }
        if (var26.eql((SubLObject)$ic63$)) {
            return module0421.f29460(var25);
        }
        if (var26.eql((SubLObject)$ic59$)) {
            return module0417.f29226(var25);
        }
        if (var26.eql((SubLObject)$ic61$)) {
            return module0418.f29291(var25);
        }
        if (var26.eql((SubLObject)$ic60$)) {
            return module0422.f29507(var25);
        }
        if (var26.eql((SubLObject)$ic62$)) {
            return module0419.f29337(var25);
        }
        if (var26.eql((SubLObject)$ic57$)) {
            return module0027.f1425(var25);
        }
        if (var26.eql((SubLObject)$ic64$)) {
            return module0634.f38764(var25);
        }
        return Errors.error((SubLObject)$ic56$, var25);
    }
    
    public static SubLObject f1518(final SubLObject var24) {
        final SubLObject var25 = f1491(var24);
        final SubLObject var26 = f1510(var24);
        if (var26.eql((SubLObject)$ic58$)) {
            return (SubLObject)NIL;
        }
        if (var26.eql((SubLObject)$ic63$)) {
            return (SubLObject)NIL;
        }
        if (var26.eql((SubLObject)$ic59$)) {
            return (SubLObject)NIL;
        }
        if (var26.eql((SubLObject)$ic61$)) {
            return (SubLObject)NIL;
        }
        if (var26.eql((SubLObject)$ic60$)) {
            return (SubLObject)NIL;
        }
        if (var26.eql((SubLObject)$ic62$)) {
            return (SubLObject)NIL;
        }
        if (var26.eql((SubLObject)$ic57$)) {
            return (SubLObject)NIL;
        }
        if (var26.eql((SubLObject)$ic64$)) {
            return module0634.f38759(var25);
        }
        return Errors.error((SubLObject)$ic56$, var25);
    }
    
    public static SubLObject f1519(SubLObject var52) {
        if (var52 == UNPROVIDED) {
            var52 = f1483();
        }
        SubLObject var53 = (SubLObject)NIL;
        SubLObject var54 = var52;
        SubLObject var55 = (SubLObject)NIL;
        var55 = var54.first();
        while (NIL != var54) {
            SubLObject var54_57;
            final SubLObject var56 = var54_57 = f1520(var55);
            SubLObject var57 = (SubLObject)NIL;
            var57 = var54_57.first();
            while (NIL != var54_57) {
                var53 = (SubLObject)ConsesLow.cons(var57, var53);
                var54_57 = var54_57.rest();
                var57 = var54_57.first();
            }
            var54 = var54.rest();
            var55 = var54.first();
        }
        return Sequences.nreverse(var53);
    }
    
    public static SubLObject f1520(final SubLObject var24) {
        final SubLObject var25 = f1491(var24);
        final SubLObject var26 = f1510(var24);
        if (var26.eql((SubLObject)$ic58$)) {
            if (NIL != module0416.f29145(var25)) {
                return (SubLObject)ConsesLow.list(f1495(var24));
            }
        }
        else if (var26.eql((SubLObject)$ic63$)) {
            if (NIL != module0421.f29428(var25)) {
                return (SubLObject)ConsesLow.list(f1495(var24));
            }
        }
        else if (var26.eql((SubLObject)$ic59$)) {
            if (NIL != module0417.f29230(var25)) {
                return (SubLObject)ConsesLow.list(f1495(var24));
            }
        }
        else if (var26.eql((SubLObject)$ic61$)) {
            if (NIL != module0418.f29294(var25)) {
                return (SubLObject)ConsesLow.list(f1495(var24));
            }
        }
        else if (var26.eql((SubLObject)$ic60$)) {
            if (NIL != module0422.f29511(var25)) {
                return (SubLObject)ConsesLow.list(f1495(var24));
            }
        }
        else if (var26.eql((SubLObject)$ic62$)) {
            if (NIL != module0419.f29342(var25)) {
                return (SubLObject)ConsesLow.list(f1495(var24));
            }
        }
        else {
            if (var26.eql((SubLObject)$ic57$)) {
                return module0027.f1426(var25);
            }
            if (!var26.eql((SubLObject)$ic64$)) {
                return Errors.error((SubLObject)$ic56$, var25);
            }
            if (NIL != module0634.f38762(var25)) {
                return (SubLObject)ConsesLow.list(f1495(var24));
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f1521(SubLObject var52) {
        if (var52 == UNPROVIDED) {
            var52 = f1483();
        }
        SubLObject var53 = (SubLObject)NIL;
        SubLObject var54 = var52;
        SubLObject var55 = (SubLObject)NIL;
        var55 = var54.first();
        while (NIL != var54) {
            if (NIL != f1516(var55) && NIL != f1522(var55)) {
                var53 = (SubLObject)ConsesLow.cons(var55, var53);
            }
            var54 = var54.rest();
            var55 = var54.first();
        }
        return Sequences.nreverse(var53);
    }
    
    public static SubLObject f1522(final SubLObject var24) {
        return module0035.sublisp_boolean(f1523(var24));
    }
    
    public static SubLObject f1523(final SubLObject var24) {
        final SubLObject var25 = f1491(var24);
        final SubLObject var26 = f1510(var24);
        if (var26.eql((SubLObject)$ic58$)) {
            return module0416.f29146(var25);
        }
        if (var26.eql((SubLObject)$ic63$)) {
            return module0421.f29429(var25);
        }
        if (var26.eql((SubLObject)$ic59$)) {
            return module0417.f29231(var25);
        }
        if (var26.eql((SubLObject)$ic61$)) {
            return module0418.f29295(var25);
        }
        if (var26.eql((SubLObject)$ic60$)) {
            return module0422.f29512(var25);
        }
        if (var26.eql((SubLObject)$ic62$)) {
            return module0419.f29343(var25);
        }
        if (var26.eql((SubLObject)$ic57$)) {
            return module0027.f1428(var25);
        }
        if (var26.eql((SubLObject)$ic64$)) {
            return module0634.f38763(var25);
        }
        return Errors.error((SubLObject)$ic56$, var25);
    }
    
    public static SubLObject f1524(final SubLObject var2) {
        if (NIL != f1498(var2)) {
            final SubLObject var3 = f1514(var2);
            return (SubLObject)makeBoolean($ic65$ == var3 || $ic66$ == var3);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f1525(final SubLObject var2) {
        if (NIL != f1498(var2)) {
            final SubLObject var3 = f1514(var2);
            return (SubLObject)makeBoolean($ic67$ == var3 || $ic66$ == var3);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f1526(SubLObject var51) {
        if (var51 == UNPROVIDED) {
            var51 = (SubLObject)NIL;
        }
        if (NIL != var51 && !areAssertionsDisabledFor(me) && NIL == f1481(var51)) {
            throw new AssertionError(var51);
        }
        final SubLObject var52 = f1483();
        SubLObject var53 = Sequences.remove_if(Symbols.symbol_function((SubLObject)$ic69$), var52, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != var51) {
            var53 = Sequences.remove(var51, var53, Symbols.symbol_function((SubLObject)$ic70$), Symbols.symbol_function((SubLObject)$ic71$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return var53;
    }
    
    public static SubLObject f1507(final SubLObject var25) {
        return Hashtables.gethash(var25, $g850$.getGlobalValue(), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f1527(final SubLObject var25) {
        return f1528(var25).first();
    }
    
    public static SubLObject f1528(final SubLObject var25) {
        SubLObject var26 = (SubLObject)NIL;
        SubLObject var28;
        final SubLObject var27 = var28 = (SubLObject)ConsesLow.cons(var25, module0027.f1440(var25));
        SubLObject var29 = (SubLObject)NIL;
        var29 = var28.first();
        while (NIL != var28) {
            SubLObject var54_65 = Hashtables.gethash_without_values(var29, $g851$.getGlobalValue(), (SubLObject)UNPROVIDED);
            SubLObject var30 = (SubLObject)NIL;
            var30 = var54_65.first();
            while (NIL != var54_65) {
                final SubLObject var31 = var30;
                if (NIL == conses_high.member(var31, var26, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                    var26 = (SubLObject)ConsesLow.cons(var31, var26);
                }
                var54_65 = var54_65.rest();
                var30 = var54_65.first();
            }
            var28 = var28.rest();
            var29 = var28.first();
        }
        return var26;
    }
    
    public static SubLObject f1529(final SubLObject var67) {
        return Sequences.delete((SubLObject)NIL, Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic72$), var67), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f1530(final SubLObject var25) {
        final SubLObject var26 = f1527(var25);
        if (NIL != var26) {
            return f1509(var26);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f1531(final SubLObject var2, final SubLObject var33) {
        return f1532(var2, var33);
    }
    
    public static SubLObject f1532(final SubLObject var11, final SubLObject var33) {
        module0021.f1110($g853$.getGlobalValue(), var33);
        return f1533(var11, var33);
    }
    
    public static SubLObject f1533(final SubLObject var11, final SubLObject var33) {
        module0021.f1038(f1509(var11), var33);
        module0021.f1038(f1491(var11), var33);
        return var11;
    }
    
    public static SubLObject f1534(final SubLObject var33) {
        final SubLObject var34 = module0021.f1060(var33, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var35 = module0021.f1060(var33, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return f1506(var34, var35);
    }
    
    public static SubLObject f1535(final SubLObject var51, final SubLObject var25, final SubLObject var59, final SubLObject var68) {
        assert NIL != f1480(var51) : var51;
        assert NIL != f1475(var59) : var59;
        if (NIL != var68 && !areAssertionsDisabledFor(me) && NIL == module0048.f3294(var68)) {
            throw new AssertionError(var68);
        }
        return (SubLObject)ConsesLow.list(var51, var25, var59, var68);
    }
    
    public static SubLObject f1536(final SubLObject var2) {
        return (SubLObject)makeBoolean(var2.isCons() && NIL != module0035.f1995(var2, (SubLObject)FOUR_INTEGER, (SubLObject)UNPROVIDED) && NIL != f1480(var2.first()) && NIL != f1475(conses_high.third(var2)));
    }
    
    public static SubLObject f1537(final SubLObject var69) {
        assert NIL != f1536(var69) : var69;
        return var69.first();
    }
    
    public static SubLObject f1538(final SubLObject var69) {
        assert NIL != f1536(var69) : var69;
        return conses_high.second(var69);
    }
    
    public static SubLObject f1539(final SubLObject var69) {
        assert NIL != f1536(var69) : var69;
        return conses_high.third(var69);
    }
    
    public static SubLObject f1540(final SubLObject var69) {
        assert NIL != f1536(var69) : var69;
        return conses_high.fourth(var69);
    }
    
    public static SubLObject f1541(final SubLObject var69) {
        SubLObject var70 = f1538(var69);
        if ($ic63$ == f1537(var69) && NIL == module0035.f2169(f1539(var69), (SubLObject)$ic79$)) {
            var70 = var70.first();
        }
        if ($ic57$ == f1537(var69) && f1539(var69) != $ic80$) {
            var70 = var70.first();
        }
        return f1507(var70);
    }
    
    public static SubLObject f1542(final SubLObject var70) {
        SubLObject var71 = (SubLObject)$ic80$;
        SubLObject var72 = var70;
        SubLObject var73 = (SubLObject)NIL;
        var73 = var72.first();
        while (NIL != var72) {
            final SubLObject var74 = f1539(var73);
            var71 = f1543(var71, var74);
            var72 = var72.rest();
            var73 = var72.first();
        }
        return var71;
    }
    
    public static SubLObject f1543(final SubLObject var71, final SubLObject var72) {
        if (NIL != f1478(var71)) {
            return var72;
        }
        if (NIL != f1477(var71)) {
            return (SubLObject)$ic81$;
        }
        if (NIL == f1476(var71)) {
            return (SubLObject)NIL;
        }
        if (NIL != f1477(var72)) {
            return (SubLObject)$ic81$;
        }
        return (SubLObject)$ic82$;
    }
    
    public static SubLObject f1544(final SubLObject var70) {
        SubLObject var71 = (SubLObject)ZERO_INTEGER;
        SubLObject var72 = var70;
        SubLObject var73 = (SubLObject)NIL;
        var73 = var72.first();
        while (NIL != var72) {
            final SubLObject var74 = f1540(var73);
            if (NIL != var74) {
                var71 = Numbers.add(var71, var74);
            }
            var72 = var72.rest();
            var73 = var72.first();
        }
        return var71;
    }
    
    public static SubLObject f1545(final SubLObject var69) {
        final SubLObject var70 = f1539(var69);
        return f1477(var70);
    }
    
    public static SubLObject f1546(final SubLObject var69) {
        final SubLObject var70 = f1539(var69);
        return f1476(var70);
    }
    
    public static SubLObject f1547(final SubLObject var69) {
        final SubLObject var70 = f1539(var69);
        return f1478(var70);
    }
    
    public static SubLObject f1548(final SubLObject var69) {
        final SubLObject var70 = f1541(var69);
        if (NIL != var70) {
            return f1515(var70);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f1549(final SubLObject var69) {
        final SubLObject var70 = f1541(var69);
        if (NIL != var70) {
            return f1518(var70);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f1550(final SubLObject var69, final SubLObject var33, final SubLObject var75, final SubLObject var76) {
        if ($ic83$ != var76) {
            final SubLObject var77 = f1538(var69);
            final SubLObject var78 = f1537(var69);
            final SubLObject var79 = f1539(var69);
            final SubLObject var80 = f1540(var69);
            if (var75.eql((SubLObject)$ic0$)) {
                PrintLow.format(var33, (SubLObject)$ic84$, new SubLObject[] { var78, var77, var79, var80 });
            }
            else if (var75.eql((SubLObject)$ic85$)) {
                PrintLow.format(var33, (SubLObject)$ic86$, new SubLObject[] { var79, var78, var77, var80 });
            }
            else {
                PrintLow.format(var33, (SubLObject)$ic87$, var75);
            }
            streams_high.force_output(var33);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f1551(final SubLObject var69, final SubLObject var75, final SubLObject var76) {
        if ($ic83$ == var76) {
            return (SubLObject)NIL;
        }
        final SubLObject var77 = f1538(var69);
        final SubLObject var78 = f1537(var69);
        final SubLObject var79 = f1539(var69);
        final SubLObject var80 = f1548(var69);
        final SubLObject var81 = f1540(var69);
        if (var75.eql((SubLObject)$ic0$)) {
            return PrintLow.format((SubLObject)NIL, (SubLObject)$ic84$, new SubLObject[] { var78, var77, var79, var81 });
        }
        if (var75.eql((SubLObject)$ic85$)) {
            return Sequences.cconcatenate(module0006.f205(var79), new SubLObject[] { $ic88$, module0006.f205(var81), $ic88$, module0006.f205(var78), $ic88$, module0006.f205(var77), module0006.$g11$.getGlobalValue() });
        }
        if (var75.eql((SubLObject)$ic89$)) {
            return Sequences.cconcatenate(module0006.f205(var79), new SubLObject[] { $ic88$, module0006.f205(var81), $ic88$, module0006.f205(var78), $ic88$, module0006.f205(var77), $ic88$, module0006.f205(var80), module0006.$g11$.getGlobalValue() });
        }
        return Sequences.cconcatenate((SubLObject)$ic90$, module0006.f203(var75));
    }
    
    public static SubLObject f1552() {
        return $g854$.getGlobalValue();
    }
    
    public static SubLObject f1553(final SubLObject var6, final SubLObject var7) {
        SubLObject var9;
        final SubLObject var8 = var9 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic92$);
        final SubLObject var10 = var9.rest();
        var9 = var9.first();
        SubLObject var11 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic92$);
        var11 = var9.first();
        var9 = var9.rest();
        if (NIL == var9) {
            final SubLObject var12;
            var9 = (var12 = var10);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic93$, reader.bq_cons(var11, (SubLObject)$ic94$), ConsesLow.append(var12, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var8, (SubLObject)$ic92$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f1554(final SubLObject var6, final SubLObject var7) {
        SubLObject var9;
        final SubLObject var8 = var9 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic95$);
        final SubLObject var10 = var9.rest();
        var9 = var9.first();
        SubLObject var11 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic95$);
        var11 = var9.first();
        var9 = var9.rest();
        final SubLObject var12 = (SubLObject)(var9.isCons() ? var9.first() : $ic96$);
        cdestructuring_bind.destructuring_bind_must_listp(var9, var8, (SubLObject)$ic95$);
        var9 = var9.rest();
        if (NIL == var9) {
            final SubLObject var13;
            var9 = (var13 = var10);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic19$, (SubLObject)ConsesLow.list(var11, (SubLObject)$ic97$, var12), ConsesLow.append(var13, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var8, (SubLObject)$ic95$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f1555() {
        return Sequences.length($g854$.getGlobalValue());
    }
    
    public static SubLObject f1556(final SubLObject var32, final SubLObject var33) {
        f1557(var32, var33, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f1558(final SubLObject var32) {
        return (SubLObject)((var32.getClass() == $sX2678_native.class) ? T : NIL);
    }
    
    public static SubLObject f1559(final SubLObject var32) {
        assert NIL != f1558(var32) : var32;
        return var32.getField2();
    }
    
    public static SubLObject f1560(final SubLObject var32) {
        assert NIL != f1558(var32) : var32;
        return var32.getField3();
    }
    
    public static SubLObject f1561(final SubLObject var32, final SubLObject var35) {
        assert NIL != f1558(var32) : var32;
        return var32.setField2(var35);
    }
    
    public static SubLObject f1562(final SubLObject var32, final SubLObject var35) {
        assert NIL != f1558(var32) : var32;
        return var32.setField3(var35);
    }
    
    public static SubLObject f1563(SubLObject var36) {
        if (var36 == UNPROVIDED) {
            var36 = (SubLObject)NIL;
        }
        final SubLObject var37 = (SubLObject)new $sX2678_native();
        SubLObject var38;
        SubLObject var39;
        SubLObject var40;
        SubLObject var41;
        for (var38 = (SubLObject)NIL, var38 = var36; NIL != var38; var38 = conses_high.cddr(var38)) {
            var39 = var38.first();
            var40 = conses_high.cadr(var38);
            var41 = var39;
            if (var41.eql((SubLObject)$ic111$)) {
                f1561(var37, var40);
            }
            else if (var41.eql((SubLObject)$ic112$)) {
                f1562(var37, var40);
            }
            else {
                Errors.error((SubLObject)$ic43$, var39);
            }
        }
        return var37;
    }
    
    public static SubLObject f1564(final SubLObject var42, final SubLObject var43) {
        Functions.funcall(var43, var42, (SubLObject)$ic44$, (SubLObject)$ic113$, (SubLObject)TWO_INTEGER);
        Functions.funcall(var43, var42, (SubLObject)$ic46$, (SubLObject)$ic111$, f1559(var42));
        Functions.funcall(var43, var42, (SubLObject)$ic46$, (SubLObject)$ic112$, f1560(var42));
        Functions.funcall(var43, var42, (SubLObject)$ic47$, (SubLObject)$ic113$, (SubLObject)TWO_INTEGER);
        return var42;
    }
    
    public static SubLObject f1565(final SubLObject var42, final SubLObject var43) {
        return f1564(var42, var43);
    }
    
    public static SubLObject f1557(final SubLObject var2, final SubLObject var33, final SubLObject var44) {
        PrintLow.format(var33, (SubLObject)$ic115$, f1559(var2));
        return var2;
    }
    
    public static SubLObject f1566(final SubLObject var88, final SubLObject var60) {
        assert NIL != Types.stringp(var88) : var88;
        assert NIL != f1472(var60) : var60;
        final SubLObject var89 = f1563((SubLObject)UNPROVIDED);
        f1561(var89, var88);
        f1562(var89, var60);
        return var89;
    }
    
    public static SubLObject f1567(final SubLObject var81) {
        return f1559(var81);
    }
    
    public static SubLObject f1568(final SubLObject var88) {
        SubLObject var89 = $g854$.getGlobalValue();
        SubLObject var90 = (SubLObject)NIL;
        var90 = var89.first();
        while (NIL != var89) {
            if (var88.equal(f1559(var90))) {
                return var90;
            }
            var89 = var89.rest();
            var90 = var89.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f1569() {
        return $g856$.getGlobalValue();
    }
    
    public static SubLObject f1570() {
        return module0035.remove_if_not((SubLObject)$ic119$, f1569(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f1571() {
        return Mapping.mapcar((SubLObject)$ic120$, f1570());
    }
    
    public static SubLObject f1572() {
        return $g857$.getGlobalValue();
    }
    
    public static SubLObject f1573(final SubLObject var6, final SubLObject var7) {
        SubLObject var9;
        final SubLObject var8 = var9 = var6.rest();
        SubLObject var10 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic121$);
        var10 = var9.first();
        var9 = var9.rest();
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = var9;
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var95_96 = (SubLObject)NIL;
        while (NIL != var12) {
            cdestructuring_bind.destructuring_bind_must_consp(var12, var8, (SubLObject)$ic121$);
            var95_96 = var12.first();
            var12 = var12.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var12, var8, (SubLObject)$ic121$);
            if (NIL == conses_high.member(var95_96, (SubLObject)$ic122$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var13 = (SubLObject)T;
            }
            if (var95_96 == $ic13$) {
                var11 = var12.first();
            }
            var12 = var12.rest();
        }
        if (NIL != var13 && NIL == var11) {
            cdestructuring_bind.cdestructuring_bind_error(var8, (SubLObject)$ic121$);
        }
        final SubLObject var14 = cdestructuring_bind.property_list_member((SubLObject)$ic123$, var9);
        final SubLObject var15 = (SubLObject)((NIL != var14) ? conses_high.cadr(var14) : $ic124$);
        final SubLObject var16 = cdestructuring_bind.property_list_member((SubLObject)$ic125$, var9);
        final SubLObject var17 = (SubLObject)((NIL != var16) ? conses_high.cadr(var16) : $ic126$);
        final SubLObject var18 = cdestructuring_bind.property_list_member((SubLObject)$ic127$, var9);
        final SubLObject var19 = (SubLObject)((NIL != var18) ? conses_high.cadr(var18) : NIL);
        final SubLObject var20 = cdestructuring_bind.property_list_member((SubLObject)$ic128$, var9);
        final SubLObject var21 = (SubLObject)((NIL != var20) ? conses_high.cadr(var20) : $ic0$);
        final SubLObject var22 = cdestructuring_bind.property_list_member((SubLObject)$ic129$, var9);
        final SubLObject var23 = (SubLObject)((NIL != var22) ? conses_high.cadr(var22) : $ic130$);
        final SubLObject var24 = cdestructuring_bind.property_list_member((SubLObject)$ic131$, var9);
        final SubLObject var25 = (SubLObject)((NIL != var24) ? conses_high.cadr(var24) : T);
        final SubLObject var26 = cdestructuring_bind.property_list_member((SubLObject)$ic132$, var9);
        final SubLObject var27 = (SubLObject)((NIL != var26) ? conses_high.cadr(var26) : NIL);
        final SubLObject var28 = cdestructuring_bind.property_list_member((SubLObject)$ic133$, var9);
        final SubLObject var29 = (SubLObject)((NIL != var28) ? conses_high.cadr(var28) : $ic9$);
        final SubLObject var30 = cdestructuring_bind.property_list_member((SubLObject)$ic134$, var9);
        final SubLObject var31 = (SubLObject)((NIL != var30) ? conses_high.cadr(var30) : NIL);
        final SubLObject var32 = cdestructuring_bind.property_list_member((SubLObject)$ic135$, var9);
        final SubLObject var33 = (SubLObject)((NIL != var32) ? conses_high.cadr(var32) : NIL);
        final SubLObject var34 = cdestructuring_bind.property_list_member((SubLObject)$ic136$, var9);
        final SubLObject var35 = (SubLObject)((NIL != var34) ? conses_high.cadr(var34) : NIL);
        return (SubLObject)ConsesLow.list(new SubLObject[] { $ic137$, var10, var15, var17, var19, var21, var23, var25, var27, var29, var31, var33, var35 });
    }
    
    public static SubLObject f1574(final SubLObject var91, SubLObject var33, SubLObject var76, SubLObject var100, SubLObject var75, SubLObject var103, SubLObject var105, SubLObject var107, SubLObject var51, SubLObject var110, SubLObject var112, SubLObject var114, SubLObject var115, SubLObject var116) {
        if (var33 == UNPROVIDED) {
            var33 = (SubLObject)$ic124$;
        }
        if (var76 == UNPROVIDED) {
            var76 = (SubLObject)$ic126$;
        }
        if (var100 == UNPROVIDED) {
            var100 = (SubLObject)NIL;
        }
        if (var75 == UNPROVIDED) {
            var75 = (SubLObject)$ic0$;
        }
        if (var103 == UNPROVIDED) {
            var103 = (SubLObject)$ic130$;
        }
        if (var105 == UNPROVIDED) {
            var105 = (SubLObject)T;
        }
        if (var107 == UNPROVIDED) {
            var107 = (SubLObject)NIL;
        }
        if (var51 == UNPROVIDED) {
            var51 = (SubLObject)$ic9$;
        }
        if (var110 == UNPROVIDED) {
            var110 = (SubLObject)NIL;
        }
        if (var112 == UNPROVIDED) {
            var112 = (SubLObject)NIL;
        }
        if (var114 == UNPROVIDED) {
            var114 = (SubLObject)NIL;
        }
        if (var115 == UNPROVIDED) {
            var115 = (SubLObject)ZERO_INTEGER;
        }
        if (var116 == UNPROVIDED) {
            var116 = (SubLObject)ONE_INTEGER;
        }
        if (NIL != var91) {
            f1575();
            f1576(var91, var33, var103, var76);
        }
        return f1577(var33, var76, var100, var75, var103, var105, var107, var51, var110, var112, var114, f1483(), var115, var116);
    }
    
    public static SubLObject f1578(final SubLObject var6, final SubLObject var7) {
        final SubLObject var9;
        final SubLObject var8 = var9 = var6.rest();
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var11 = var9;
        SubLObject var12 = (SubLObject)NIL;
        SubLObject var122_123 = (SubLObject)NIL;
        while (NIL != var11) {
            cdestructuring_bind.destructuring_bind_must_consp(var11, var8, (SubLObject)$ic138$);
            var122_123 = var11.first();
            var11 = var11.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var11, var8, (SubLObject)$ic138$);
            if (NIL == conses_high.member(var122_123, (SubLObject)$ic139$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var12 = (SubLObject)T;
            }
            if (var122_123 == $ic13$) {
                var10 = var11.first();
            }
            var11 = var11.rest();
        }
        if (NIL != var12 && NIL == var10) {
            cdestructuring_bind.cdestructuring_bind_error(var8, (SubLObject)$ic138$);
        }
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic123$, var9);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : $ic124$);
        final SubLObject var15 = cdestructuring_bind.property_list_member((SubLObject)$ic125$, var9);
        final SubLObject var16 = (SubLObject)((NIL != var15) ? conses_high.cadr(var15) : $ic140$);
        final SubLObject var17 = cdestructuring_bind.property_list_member((SubLObject)$ic127$, var9);
        final SubLObject var18 = (SubLObject)((NIL != var17) ? conses_high.cadr(var17) : NIL);
        final SubLObject var19 = cdestructuring_bind.property_list_member((SubLObject)$ic128$, var9);
        final SubLObject var20 = (SubLObject)((NIL != var19) ? conses_high.cadr(var19) : $ic0$);
        final SubLObject var21 = cdestructuring_bind.property_list_member((SubLObject)$ic132$, var9);
        final SubLObject var22 = (SubLObject)((NIL != var21) ? conses_high.cadr(var21) : NIL);
        final SubLObject var23 = cdestructuring_bind.property_list_member((SubLObject)$ic133$, var9);
        final SubLObject var24 = (SubLObject)((NIL != var23) ? conses_high.cadr(var23) : $ic9$);
        final SubLObject var25 = cdestructuring_bind.property_list_member((SubLObject)$ic134$, var9);
        final SubLObject var26 = (SubLObject)((NIL != var25) ? conses_high.cadr(var25) : NIL);
        final SubLObject var27 = cdestructuring_bind.property_list_member((SubLObject)$ic135$, var9);
        final SubLObject var28 = (SubLObject)((NIL != var27) ? conses_high.cadr(var27) : NIL);
        final SubLObject var29 = cdestructuring_bind.property_list_member((SubLObject)$ic136$, var9);
        final SubLObject var30 = (SubLObject)((NIL != var29) ? conses_high.cadr(var29) : NIL);
        return (SubLObject)ConsesLow.list(new SubLObject[] { $ic141$, var14, var16, var18, var20, T, T, var22, var24, var26, var28, var30, ConsesLow.list((SubLObject)$ic142$, f1571()) });
    }
    
    public static SubLObject f1579(final SubLObject var6, final SubLObject var7) {
        SubLObject var9;
        final SubLObject var8 = var9 = var6.rest();
        SubLObject var10 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic143$);
        var10 = var9.first();
        var9 = var9.rest();
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = var9;
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var138_139 = (SubLObject)NIL;
        while (NIL != var12) {
            cdestructuring_bind.destructuring_bind_must_consp(var12, var8, (SubLObject)$ic143$);
            var138_139 = var12.first();
            var12 = var12.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var12, var8, (SubLObject)$ic143$);
            if (NIL == conses_high.member(var138_139, (SubLObject)$ic144$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var13 = (SubLObject)T;
            }
            if (var138_139 == $ic13$) {
                var11 = var12.first();
            }
            var12 = var12.rest();
        }
        if (NIL != var13 && NIL == var11) {
            cdestructuring_bind.cdestructuring_bind_error(var8, (SubLObject)$ic143$);
        }
        final SubLObject var14 = cdestructuring_bind.property_list_member((SubLObject)$ic112$, var9);
        final SubLObject var15 = (SubLObject)((NIL != var14) ? conses_high.cadr(var14) : NIL);
        return (SubLObject)ConsesLow.list((SubLObject)$ic145$, var10, var15);
    }
    
    public static SubLObject f1580(final SubLObject var6, final SubLObject var7) {
        SubLObject var9;
        final SubLObject var8 = var9 = var6.rest();
        SubLObject var10 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic146$);
        var10 = var9.first();
        var9 = var9.rest();
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = var9;
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var146_147 = (SubLObject)NIL;
        while (NIL != var12) {
            cdestructuring_bind.destructuring_bind_must_consp(var12, var8, (SubLObject)$ic146$);
            var146_147 = var12.first();
            var12 = var12.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var12, var8, (SubLObject)$ic146$);
            if (NIL == conses_high.member(var146_147, (SubLObject)$ic147$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var13 = (SubLObject)T;
            }
            if (var146_147 == $ic13$) {
                var11 = var12.first();
            }
            var12 = var12.rest();
        }
        if (NIL != var13 && NIL == var11) {
            cdestructuring_bind.cdestructuring_bind_error(var8, (SubLObject)$ic146$);
        }
        final SubLObject var14 = cdestructuring_bind.property_list_member((SubLObject)$ic123$, var9);
        final SubLObject var15 = (SubLObject)((NIL != var14) ? conses_high.cadr(var14) : $ic124$);
        final SubLObject var16 = cdestructuring_bind.property_list_member((SubLObject)$ic125$, var9);
        final SubLObject var17 = (SubLObject)((NIL != var16) ? conses_high.cadr(var16) : $ic140$);
        final SubLObject var18 = cdestructuring_bind.property_list_member((SubLObject)$ic127$, var9);
        final SubLObject var19 = (SubLObject)((NIL != var18) ? conses_high.cadr(var18) : NIL);
        final SubLObject var20 = cdestructuring_bind.property_list_member((SubLObject)$ic128$, var9);
        final SubLObject var21 = (SubLObject)((NIL != var20) ? conses_high.cadr(var20) : $ic0$);
        final SubLObject var22 = cdestructuring_bind.property_list_member((SubLObject)$ic132$, var9);
        final SubLObject var23 = (SubLObject)((NIL != var22) ? conses_high.cadr(var22) : NIL);
        final SubLObject var24 = cdestructuring_bind.property_list_member((SubLObject)$ic133$, var9);
        final SubLObject var25 = (SubLObject)((NIL != var24) ? conses_high.cadr(var24) : $ic9$);
        final SubLObject var26 = cdestructuring_bind.property_list_member((SubLObject)$ic134$, var9);
        final SubLObject var27 = (SubLObject)((NIL != var26) ? conses_high.cadr(var26) : NIL);
        return (SubLObject)ConsesLow.list(new SubLObject[] { $ic141$, var15, var17, var19, var21, T, T, var23, var25, var27, NIL, NIL, ConsesLow.list((SubLObject)$ic148$, var10) });
    }
    
    public static SubLObject f1576(final SubLObject var91, SubLObject var33, SubLObject var155, SubLObject var76) {
        if (var33 == UNPROVIDED) {
            var33 = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (var155 == UNPROVIDED) {
            var155 = $g835$.getDynamicValue();
        }
        if (var76 == UNPROVIDED) {
            var76 = (SubLObject)$ic126$;
        }
        final SubLThread var156 = SubLProcess.currentSubLThread();
        assert NIL != Types.stringp(var91) : var91;
        assert NIL != Types.streamp(var33) : var33;
        assert NIL != Types.booleanp(var155) : var155;
        assert NIL != f1473(var76) : var76;
        var156.resetMultipleValues();
        final SubLObject var157 = f1581(var91);
        final SubLObject var158 = var156.secondMultipleValue();
        var156.resetMultipleValues();
        SubLObject var159 = (SubLObject)ZERO_INTEGER;
        final SubLObject var160 = f1488();
        final SubLObject var161 = StreamsLow.$standard_output$.currentBinding(var156);
        try {
            StreamsLow.$standard_output$.bind(var33, var156);
            if (NIL == f1582(var157, var158)) {
                Errors.error((SubLObject)$ic152$, (SubLObject)((NIL != var158) ? var158 : $ic153$), var157);
            }
            if ($ic140$ == var76) {
                final SubLObject var162 = f1552();
                module0012.$g82$.setDynamicValue((SubLObject)$ic154$, var156);
                module0012.$g73$.setDynamicValue(Time.get_universal_time(), var156);
                module0012.$g83$.setDynamicValue(Sequences.length(var162), var156);
                module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var156);
                final SubLObject var160_162 = module0012.$g75$.currentBinding(var156);
                final SubLObject var163 = module0012.$g76$.currentBinding(var156);
                final SubLObject var164 = module0012.$g77$.currentBinding(var156);
                final SubLObject var165 = module0012.$g78$.currentBinding(var156);
                try {
                    module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var156);
                    module0012.$g76$.bind((SubLObject)NIL, var156);
                    module0012.$g77$.bind((SubLObject)T, var156);
                    module0012.$g78$.bind(Time.get_universal_time(), var156);
                    module0012.f478(module0012.$g82$.getDynamicValue(var156));
                    SubLObject var166 = var162;
                    SubLObject var167 = (SubLObject)NIL;
                    var167 = var166.first();
                    while (NIL != var166) {
                        module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var156), module0012.$g83$.getDynamicValue(var156));
                        module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var156), (SubLObject)ONE_INTEGER), var156);
                        if (NIL != f1583(var167, var157, var155, var160)) {
                            var159 = Numbers.add(var159, (SubLObject)ONE_INTEGER);
                        }
                        var166 = var166.rest();
                        var167 = var166.first();
                    }
                    module0012.f479();
                }
                finally {
                    module0012.$g78$.rebind(var165, var156);
                    module0012.$g77$.rebind(var164, var156);
                    module0012.$g76$.rebind(var163, var156);
                    module0012.$g75$.rebind(var160_162, var156);
                }
            }
            else {
                SubLObject var168 = f1552();
                SubLObject var169 = (SubLObject)NIL;
                var169 = var168.first();
                while (NIL != var168) {
                    if (NIL != f1583(var169, var157, var155, var160)) {
                        var159 = Numbers.add(var159, (SubLObject)ONE_INTEGER);
                    }
                    else if (NIL != module0421.f29447(f1560(var169), var155)) {
                        $g857$.setGlobalValue((SubLObject)ConsesLow.cons(var169, $g857$.getGlobalValue()));
                    }
                    var168 = var168.rest();
                    var169 = var168.first();
                }
            }
        }
        finally {
            StreamsLow.$standard_output$.rebind(var161, var156);
        }
        return var159;
    }
    
    public static SubLObject f1581(SubLObject var91) {
        final SubLThread var92 = SubLProcess.currentSubLThread();
        SubLObject var93 = (SubLObject)NIL;
        if (NIL != module0038.f2673(var91, (SubLObject)$ic155$, (SubLObject)UNPROVIDED)) {
            var92.resetMultipleValues();
            final SubLObject var94 = module0075.f5234(var91);
            final SubLObject var95 = var92.secondMultipleValue();
            var92.resetMultipleValues();
            var93 = module0038.f2621(var95, (SubLObject)$ic155$, (SubLObject)UNPROVIDED);
            var91 = var94;
        }
        var91 = module0075.f5223(var91);
        return Values.values(var91, var93);
    }
    
    public static SubLObject f1577(SubLObject var33, SubLObject var76, SubLObject var100, SubLObject var75, SubLObject var103, SubLObject var105, SubLObject var107, SubLObject var51, SubLObject var110, SubLObject var112, SubLObject var114, SubLObject var52, SubLObject var115, SubLObject var116) {
        if (var33 == UNPROVIDED) {
            var33 = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (var76 == UNPROVIDED) {
            var76 = (SubLObject)$ic126$;
        }
        if (var100 == UNPROVIDED) {
            var100 = (SubLObject)NIL;
        }
        if (var75 == UNPROVIDED) {
            var75 = (SubLObject)$ic0$;
        }
        if (var103 == UNPROVIDED) {
            var103 = $g835$.getDynamicValue();
        }
        if (var105 == UNPROVIDED) {
            var105 = (SubLObject)T;
        }
        if (var107 == UNPROVIDED) {
            var107 = (SubLObject)NIL;
        }
        if (var51 == UNPROVIDED) {
            var51 = (SubLObject)$ic9$;
        }
        if (var110 == UNPROVIDED) {
            var110 = (SubLObject)NIL;
        }
        if (var112 == UNPROVIDED) {
            var112 = (SubLObject)NIL;
        }
        if (var114 == UNPROVIDED) {
            var114 = (SubLObject)NIL;
        }
        if (var52 == UNPROVIDED) {
            var52 = f1483();
        }
        if (var115 == UNPROVIDED) {
            var115 = (SubLObject)ZERO_INTEGER;
        }
        if (var116 == UNPROVIDED) {
            var116 = (SubLObject)ONE_INTEGER;
        }
        final SubLThread var117 = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var117) && !var115.numL(var116)) {
            Errors.error((SubLObject)$ic156$, var115, var116);
        }
        var117.resetMultipleValues();
        final SubLObject var118 = module0104.f7428(var33, var76, var100, var75, var103, var105, var51, var110, var112, var114, var52, var115, var116);
        final SubLObject var119 = var117.secondMultipleValue();
        var117.resetMultipleValues();
        $g856$.setGlobalValue(var119);
        return Values.values(var118, (SubLObject)((NIL != var107) ? var119 : NIL));
    }
    
    public static SubLObject f1575() {
        $g854$.setGlobalValue((SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f1584(final SubLObject var88) {
        final SubLObject var89 = f1568(var88);
        if (NIL != var89) {
            $g854$.setGlobalValue(Sequences.delete(var89, $g854$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f1585(final SubLObject var88, final SubLObject var60) {
        f1584(var88);
        final SubLObject var89 = f1566(var88, var60);
        final SubLObject var90 = (SubLObject)ConsesLow.cons(var89, (SubLObject)NIL);
        final SubLObject var91 = $g854$.getGlobalValue();
        if (NIL != var91) {
            module0005.f188(var91, var90);
        }
        else {
            $g854$.setGlobalValue(var90);
        }
        return var89;
    }
    
    public static SubLObject f1583(final SubLObject var81, final SubLObject var91, final SubLObject var155, final SubLObject var159) {
        final SubLThread var160 = SubLProcess.currentSubLThread();
        SubLObject var161 = (SubLObject)NIL;
        final SubLObject var162 = f1560(var81);
        if (NIL != module0421.f29447(var162, var155)) {
            final SubLObject var163 = f1559(var81);
            final SubLObject var164 = $g836$.currentBinding(var160);
            final SubLObject var165 = $g843$.currentBinding(var160);
            try {
                $g836$.bind(var163, var160);
                $g843$.bind(var159, var160);
                if (NIL != module0104.f7410(var91, var163)) {
                    var161 = (SubLObject)T;
                }
            }
            finally {
                $g843$.rebind(var165, var160);
                $g836$.rebind(var164, var160);
            }
        }
        return var161;
    }
    
    public static SubLObject f1582(final SubLObject var91, SubLObject var157) {
        if (var157 == UNPROVIDED) {
            var157 = (SubLObject)NIL;
        }
        return (SubLObject)makeBoolean(NIL != module0104.f7410(var91, (SubLObject)$ic153$) && (NIL == var157 || NIL != module0104.f7410(var91, var157)));
    }
    
    public static SubLObject f1586() {
        final SubLObject var170 = (NIL != module0018.f973()) ? f1483() : module0035.f2110((SubLObject)$ic158$, f1483(), (SubLObject)UNPROVIDED);
        final SubLObject var171 = f1521(var170);
        SubLObject var172 = (SubLObject)NIL;
        SubLObject var173 = var171;
        SubLObject var174 = (SubLObject)NIL;
        var174 = var173.first();
        while (NIL != var173) {
            final SubLObject var175 = f1495(var174);
            final SubLObject var176 = f1510(var174);
            final SubLObject var177 = f1515(var174);
            final SubLObject var178 = f1523(var174);
            var172 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var176, var175, var177, var178), var172);
            var173 = var173.rest();
            var174 = var173.first();
        }
        return var172;
    }
    
    public static SubLObject f1587() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1471", "S#2686", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1472", "S#2526", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1473", "S#2687", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1474", "S#2688", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1475", "S#2689", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1476", "S#2690", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1477", "S#2691", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1478", "S#2692", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1479", "S#2693", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1480", "S#2694", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1481", "S#2695", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1482", "S#2696", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1483", "S#2697", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1484", "S#2698", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0029", "f1485", "S#2699");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0029", "f1486", "S#2700");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1487", "S#2701", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1488", "S#2702", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1489", "S#2703", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1492", "S#2704", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1490", "S#2705", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1493", "S#2706", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1494", "S#2614", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1496", "S#2707", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1498", "S#2621", 1, 0, false);
        new $f1498$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1499", "S#2708", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1500", "S#2709", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1501", "S#2710", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1502", "S#2711", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1503", "S#2712", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1504", "S#2713", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1505", "S#2714", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1497", "S#2715", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1506", "S#2530", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1508", "S#2716", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1509", "S#2678", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1491", "S#2717", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1510", "S#2718", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1512", "S#2719", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1511", "S#2720", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1513", "S#2721", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1495", "S#2722", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1514", "S#2723", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1515", "S#2724", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1516", "S#2725", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1517", "S#2726", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1518", "S#2727", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1519", "S#2728", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1520", "S#2729", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1521", "S#2730", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1522", "S#2731", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1523", "S#2732", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1524", "S#2733", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1525", "S#2734", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1526", "S#2735", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1507", "S#2736", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1527", "S#2737", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1528", "S#2738", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1529", "S#2739", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1530", "S#2740", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1531", "S#2741", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1532", "S#2742", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1533", "S#2743", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1534", "S#2744", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1535", "S#2528", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1536", "S#2745", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1537", "S#2746", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1538", "S#2747", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1539", "S#2748", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1540", "S#2749", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1541", "S#2750", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1542", "S#2751", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1543", "S#2752", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1544", "S#2753", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1545", "S#2754", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1546", "S#2755", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1547", "S#2756", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1548", "S#2757", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1549", "S#2758", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1550", "S#2759", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1551", "S#2760", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1552", "S#2761", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0029", "f1553", "S#2762");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0029", "f1554", "S#2763");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1555", "S#2764", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1556", "S#2765", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1558", "S#2679", 1, 0, false);
        new $f1558$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1559", "S#2766", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1560", "S#2767", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1561", "S#2768", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1562", "S#2769", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1563", "S#2770", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1564", "S#2771", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1565", "S#2772", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1557", "S#2773", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1566", "S#2774", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1567", "S#2775", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1568", "S#2776", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1569", "S#2777", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1570", "S#2778", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1571", "S#2779", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1572", "S#2780", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0029", "f1573", "RUN-ALL-CYC-TESTS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1574", "S#2781", 1, 13, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0029", "f1578", "S#2782");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0029", "f1579", "DECLARE-CYC-TEST-FILE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0029", "f1580", "RUN-CYC-TESTS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1576", "LOAD-ALL-CYC-TESTS", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1581", "S#2783", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1577", "S#2529", 0, 14, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1575", "S#2784", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1584", "S#2785", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1585", "S#2786", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1583", "S#2787", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1582", "S#2788", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0029", "f1586", "S#2789", 0, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f1588() {
        $g839$ = SubLFiles.defparameter("S#2790", (SubLObject)$ic0$);
        $g840$ = SubLFiles.defparameter("S#2791", (SubLObject)NIL);
        $g835$ = SubLFiles.defparameter("S#2792", (SubLObject)T);
        $g841$ = SubLFiles.defparameter("S#2793", (SubLObject)NIL);
        $g842$ = SubLFiles.deflexical("S#2794", (SubLObject)$ic1$);
        $g836$ = SubLFiles.defparameter("S#2795", (SubLObject)NIL);
        $g843$ = SubLFiles.defparameter("S#2796", (SubLObject)NIL);
        $g844$ = SubLFiles.deflexical("S#2797", (SubLObject)$ic4$);
        $g845$ = SubLFiles.deflexical("S#2798", (SubLObject)$ic5$);
        $g846$ = SubLFiles.deflexical("S#2799", (SubLObject)$ic6$);
        $g847$ = SubLFiles.deflexical("S#2800", ConsesLow.append($g844$.getGlobalValue(), $g845$.getGlobalValue(), $g846$.getGlobalValue()));
        $g848$ = SubLFiles.deflexical("S#2801", (SubLObject)$ic7$);
        $g849$ = SubLFiles.defvar("S#2802", (SubLObject)NIL);
        $g850$ = SubLFiles.deflexical("S#2803", (NIL != Symbols.boundp((SubLObject)$ic20$)) ? $g850$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)$ic21$, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED));
        $g851$ = SubLFiles.deflexical("S#2804", (NIL != Symbols.boundp((SubLObject)$ic22$)) ? $g851$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)$ic21$, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED));
        $g852$ = SubLFiles.defconstant("S#2805", (SubLObject)$ic28$);
        $g853$ = SubLFiles.defconstant("S#2806", (SubLObject)$ic73$);
        $g854$ = SubLFiles.deflexical("S#2807", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic91$)) ? $g854$.getGlobalValue() : NIL));
        $g855$ = SubLFiles.defconstant("S#2808", (SubLObject)$ic98$);
        $g856$ = SubLFiles.deflexical("S#2809", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic117$)) ? $g856$.getGlobalValue() : NIL));
        $g857$ = SubLFiles.deflexical("S#2810", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic118$)) ? $g857$.getGlobalValue() : NIL));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f1589() {
        module0003.f57((SubLObject)$ic20$);
        module0003.f57((SubLObject)$ic22$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g852$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic35$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic36$);
        Structures.def_csetf((SubLObject)$ic37$, (SubLObject)$ic38$);
        Structures.def_csetf((SubLObject)$ic39$, (SubLObject)$ic40$);
        Equality.identity((SubLObject)$ic28$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g852$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic48$));
        module0021.f1193($g853$.getGlobalValue(), (SubLObject)$ic74$);
        Structures.register_method(module0021.$g749$.getGlobalValue(), $g852$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic75$));
        module0003.f57((SubLObject)$ic91$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g855$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic105$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic106$);
        Structures.def_csetf((SubLObject)$ic107$, (SubLObject)$ic108$);
        Structures.def_csetf((SubLObject)$ic109$, (SubLObject)$ic110$);
        Equality.identity((SubLObject)$ic98$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g855$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic114$));
        module0003.f57((SubLObject)$ic117$);
        module0003.f57((SubLObject)$ic118$);
        module0002.f50((SubLObject)$ic145$, (SubLObject)$ic157$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f1587();
    }
    
    public void initializeVariables() {
        f1588();
    }
    
    public void runTopLevelForms() {
        f1589();
    }
    
    static {
        me = (SubLFile)new module0029();
        $g839$ = null;
        $g840$ = null;
        $g835$ = null;
        $g841$ = null;
        $g842$ = null;
        $g836$ = null;
        $g843$ = null;
        $g844$ = null;
        $g845$ = null;
        $g846$ = null;
        $g847$ = null;
        $g848$ = null;
        $g849$ = null;
        $g850$ = null;
        $g851$ = null;
        $g852$ = null;
        $g853$ = null;
        $g854$ = null;
        $g855$ = null;
        $g856$ = null;
        $g857$ = null;
        $ic0$ = makeKeyword("STANDARD");
        $ic1$ = ConsesLow.list((SubLObject)makeKeyword("SILENT"), (SubLObject)makeKeyword("TERSE"), (SubLObject)makeKeyword("VERBOSE"));
        $ic2$ = ConsesLow.list((SubLObject)makeKeyword("TINY"), (SubLObject)makeKeyword("FULL"), (SubLObject)makeKeyword("BOTH"));
        $ic3$ = ConsesLow.list((SubLObject)makeKeyword("STANDARD"), (SubLObject)makeKeyword("POST-BUILD"));
        $ic4$ = ConsesLow.list((SubLObject)makeKeyword("SUCCESS"), (SubLObject)makeKeyword("REGRESSION-SUCCESS"));
        $ic5$ = ConsesLow.list((SubLObject)makeKeyword("FAILURE"), (SubLObject)makeKeyword("REGRESSION-FAILURE"), (SubLObject)makeKeyword("ABNORMAL"), (SubLObject)makeKeyword("ERROR"));
        $ic6$ = ConsesLow.list((SubLObject)makeKeyword("NON-REGRESSION-SUCCESS"), (SubLObject)makeKeyword("NON-REGRESSION-FAILURE"), (SubLObject)makeKeyword("NOT-RUN"), (SubLObject)makeKeyword("INVALID"));
        $ic7$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("IUT"), (SubLObject)makeString("inference unit test")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("IT"), (SubLObject)makeString("inference test")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("RMT"), (SubLObject)makeString("removal module test")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TMT"), (SubLObject)makeString("transformation module test")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("RMCT"), (SubLObject)makeString("removal module cost test")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("ERT"), (SubLObject)makeString("evaluatable relation test")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TCT"), (SubLObject)makeString("test case table")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("KCT"), (SubLObject)makeString("KB content test")));
        $ic8$ = makeSymbol("FIRST");
        $ic9$ = makeKeyword("ALL");
        $ic10$ = makeSymbol("S#2694", "CYC");
        $ic11$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#2620", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic12$ = ConsesLow.list((SubLObject)makeKeyword("DONE"));
        $ic13$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic14$ = makeKeyword("DONE");
        $ic15$ = makeSymbol("CSOME");
        $ic16$ = ConsesLow.list((SubLObject)makeSymbol("S#2697", "CYC"));
        $ic17$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#2620", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#295", "CYC"), (SubLObject)makeString("Iterating over all Cyc tests"))), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic18$ = makeString("Iterating over all Cyc tests");
        $ic19$ = makeSymbol("PROGRESS-CDOLIST");
        $ic20$ = makeSymbol("S#2803", "CYC");
        $ic21$ = makeInteger(212);
        $ic22$ = makeSymbol("S#2804", "CYC");
        $ic23$ = makeString("A Cyc test named ~a already existed; overwriting");
        $ic24$ = makeSymbol("S#2623", "CYC");
        $ic25$ = makeSymbol("S#2811", "CYC");
        $ic26$ = makeSymbol("S#2624", "CYC");
        $ic27$ = makeSymbol("S#2812", "CYC");
        $ic28$ = makeSymbol("S#2620", "CYC");
        $ic29$ = makeSymbol("S#2621", "CYC");
        $ic30$ = ConsesLow.list((SubLObject)makeSymbol("S#2813", "CYC"), (SubLObject)makeSymbol("S#2814", "CYC"));
        $ic31$ = ConsesLow.list((SubLObject)makeKeyword("FILE"), (SubLObject)makeKeyword("GUTS"));
        $ic32$ = ConsesLow.list((SubLObject)makeSymbol("S#2708", "CYC"), (SubLObject)makeSymbol("S#2709", "CYC"));
        $ic33$ = ConsesLow.list((SubLObject)makeSymbol("S#2710", "CYC"), (SubLObject)makeSymbol("S#2711", "CYC"));
        $ic34$ = makeSymbol("S#2715", "CYC");
        $ic35$ = makeSymbol("S#2707", "CYC");
        $ic36$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#2621", "CYC"));
        $ic37$ = makeSymbol("S#2708", "CYC");
        $ic38$ = makeSymbol("S#2710", "CYC");
        $ic39$ = makeSymbol("S#2709", "CYC");
        $ic40$ = makeSymbol("S#2711", "CYC");
        $ic41$ = makeKeyword("FILE");
        $ic42$ = makeKeyword("GUTS");
        $ic43$ = makeString("Invalid slot ~S for construction function");
        $ic44$ = makeKeyword("BEGIN");
        $ic45$ = makeSymbol("S#2712", "CYC");
        $ic46$ = makeKeyword("SLOT");
        $ic47$ = makeKeyword("END");
        $ic48$ = makeSymbol("S#2714", "CYC");
        $ic49$ = makeString("#<CYC-TEST:~a:~a>");
        $ic50$ = makeString("#<CYC-TEST:~a>");
        $ic51$ = makeSymbol("STRINGP");
        $ic52$ = makeSymbol("S#2719", "CYC");
        $ic53$ = makeString("~s is not a CYC-TEST-GUTS-P");
        $ic54$ = makeSymbol("S#2525", "CYC");
        $ic55$ = makeSymbol("S#2722", "CYC");
        $ic56$ = makeString("Cyc test of unexpected type: ~s");
        $ic57$ = makeKeyword("TCT");
        $ic58$ = makeKeyword("IUT");
        $ic59$ = makeKeyword("RMT");
        $ic60$ = makeKeyword("RMCT");
        $ic61$ = makeKeyword("TMT");
        $ic62$ = makeKeyword("ERT");
        $ic63$ = makeKeyword("IT");
        $ic64$ = makeKeyword("KCT");
        $ic65$ = makeKeyword("TINY");
        $ic66$ = makeKeyword("BOTH");
        $ic67$ = makeKeyword("FULL");
        $ic68$ = makeSymbol("S#2695", "CYC");
        $ic69$ = makeSymbol("S#2725", "CYC");
        $ic70$ = makeSymbol("NOT-EQ");
        $ic71$ = makeSymbol("S#2718", "CYC");
        $ic72$ = makeSymbol("S#2737", "CYC");
        $ic73$ = makeInteger(514);
        $ic74$ = makeSymbol("S#2744", "CYC");
        $ic75$ = makeSymbol("S#2741", "CYC");
        $ic76$ = makeSymbol("S#2689", "CYC");
        $ic77$ = makeSymbol("S#65", "CYC");
        $ic78$ = makeSymbol("S#2745", "CYC");
        $ic79$ = ConsesLow.list((SubLObject)makeKeyword("NOT-RUN"), (SubLObject)makeKeyword("INVALID"));
        $ic80$ = makeKeyword("NOT-RUN");
        $ic81$ = makeKeyword("FAILURE");
        $ic82$ = makeKeyword("SUCCESS");
        $ic83$ = makeKeyword("SILENT");
        $ic84$ = makeString("~&~S ~S -> ~S (~S)");
        $ic85$ = makeKeyword("POST-BUILD");
        $ic86$ = makeString("~S ~S ~S ~S~%");
        $ic87$ = makeString("Unknown output format ~A");
        $ic88$ = makeString(" ");
        $ic89$ = makeKeyword("WITH-OWNER");
        $ic90$ = makeString("Unknown output format ");
        $ic91$ = makeSymbol("S#2807", "CYC");
        $ic92$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#2678", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic93$ = makeSymbol("CDOLIST");
        $ic94$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#2761", "CYC")));
        $ic95$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#2678", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#295", "CYC"), (SubLObject)makeString("Iterating over all test files"))), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic96$ = makeString("Iterating over all test files");
        $ic97$ = ConsesLow.list((SubLObject)makeSymbol("S#2761", "CYC"));
        $ic98$ = makeSymbol("S#2678", "CYC");
        $ic99$ = makeSymbol("S#2679", "CYC");
        $ic100$ = ConsesLow.list((SubLObject)makeSymbol("S#885", "CYC"), (SubLObject)makeSymbol("S#2607", "CYC"));
        $ic101$ = ConsesLow.list((SubLObject)makeKeyword("FILENAME"), (SubLObject)makeKeyword("KB"));
        $ic102$ = ConsesLow.list((SubLObject)makeSymbol("S#2766", "CYC"), (SubLObject)makeSymbol("S#2767", "CYC"));
        $ic103$ = ConsesLow.list((SubLObject)makeSymbol("S#2768", "CYC"), (SubLObject)makeSymbol("S#2769", "CYC"));
        $ic104$ = makeSymbol("S#2773", "CYC");
        $ic105$ = makeSymbol("S#2765", "CYC");
        $ic106$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#2679", "CYC"));
        $ic107$ = makeSymbol("S#2766", "CYC");
        $ic108$ = makeSymbol("S#2768", "CYC");
        $ic109$ = makeSymbol("S#2767", "CYC");
        $ic110$ = makeSymbol("S#2769", "CYC");
        $ic111$ = makeKeyword("FILENAME");
        $ic112$ = makeKeyword("KB");
        $ic113$ = makeSymbol("S#2770", "CYC");
        $ic114$ = makeSymbol("S#2772", "CYC");
        $ic115$ = makeString("#<CTF:~a>");
        $ic116$ = makeSymbol("S#2526", "CYC");
        $ic117$ = makeSymbol("S#2809", "CYC");
        $ic118$ = makeSymbol("S#2810", "CYC");
        $ic119$ = makeSymbol("S#2754", "CYC");
        $ic120$ = makeSymbol("S#2750", "CYC");
        $ic121$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#2815", "CYC"), makeSymbol("&KEY"), ConsesLow.list((SubLObject)makeSymbol("STREAM"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("*STANDARD-OUTPUT*"))), ConsesLow.list((SubLObject)makeSymbol("S#2816", "CYC"), (SubLObject)makeKeyword("TERSE")), ConsesLow.list((SubLObject)makeSymbol("S#2817", "CYC"), (SubLObject)NIL), ConsesLow.list((SubLObject)makeSymbol("S#2818", "CYC"), (SubLObject)makeKeyword("STANDARD")), ConsesLow.list((SubLObject)makeSymbol("S#2819", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("S#2792", "CYC"))), ConsesLow.list((SubLObject)makeSymbol("S#2820", "CYC"), (SubLObject)T), ConsesLow.list((SubLObject)makeSymbol("S#2821", "CYC"), (SubLObject)NIL), ConsesLow.list((SubLObject)makeSymbol("TYPE"), (SubLObject)makeKeyword("ALL")), ConsesLow.list((SubLObject)makeSymbol("S#2822", "CYC"), (SubLObject)NIL), ConsesLow.list((SubLObject)makeSymbol("S#2823", "CYC"), (SubLObject)NIL), ConsesLow.list((SubLObject)makeSymbol("S#2824", "CYC"), (SubLObject)NIL) });
        $ic122$ = ConsesLow.list(new SubLObject[] { makeKeyword("STREAM"), makeKeyword("VERBOSITY"), makeKeyword("STOP-AT-FIRST-FAILURE?"), makeKeyword("OUTPUT-FORMAT"), makeKeyword("RUN-TINY-KB-TESTS-IN-FULL-KB?"), makeKeyword("RUN-TEST-CASE-TABLES?"), makeKeyword("RETURN-TEST-RUNS?"), makeKeyword("TYPE"), makeKeyword("RUN-NON-WORKING-TESTS"), makeKeyword("PROGRESS-FILE"), makeKeyword("RERUN-CRASHING-TESTS") });
        $ic123$ = makeKeyword("STREAM");
        $ic124$ = makeSymbol("*STANDARD-OUTPUT*");
        $ic125$ = makeKeyword("VERBOSITY");
        $ic126$ = makeKeyword("TERSE");
        $ic127$ = makeKeyword("STOP-AT-FIRST-FAILURE?");
        $ic128$ = makeKeyword("OUTPUT-FORMAT");
        $ic129$ = makeKeyword("RUN-TINY-KB-TESTS-IN-FULL-KB?");
        $ic130$ = makeSymbol("S#2792", "CYC");
        $ic131$ = makeKeyword("RUN-TEST-CASE-TABLES?");
        $ic132$ = makeKeyword("RETURN-TEST-RUNS?");
        $ic133$ = makeKeyword("TYPE");
        $ic134$ = makeKeyword("RUN-NON-WORKING-TESTS");
        $ic135$ = makeKeyword("PROGRESS-FILE");
        $ic136$ = makeKeyword("RERUN-CRASHING-TESTS");
        $ic137$ = makeSymbol("S#2781", "CYC");
        $ic138$ = ConsesLow.list(new SubLObject[] { makeSymbol("&KEY"), ConsesLow.list((SubLObject)makeSymbol("STREAM"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("*STANDARD-OUTPUT*"))), ConsesLow.list((SubLObject)makeSymbol("S#2816", "CYC"), (SubLObject)makeKeyword("VERBOSE")), ConsesLow.list((SubLObject)makeSymbol("S#2817", "CYC"), (SubLObject)NIL), ConsesLow.list((SubLObject)makeSymbol("S#2818", "CYC"), (SubLObject)makeKeyword("STANDARD")), ConsesLow.list((SubLObject)makeSymbol("S#2821", "CYC"), (SubLObject)NIL), ConsesLow.list((SubLObject)makeSymbol("TYPE"), (SubLObject)makeKeyword("ALL")), ConsesLow.list((SubLObject)makeSymbol("S#2822", "CYC"), (SubLObject)NIL), ConsesLow.list((SubLObject)makeSymbol("S#2823", "CYC"), (SubLObject)NIL), ConsesLow.list((SubLObject)makeSymbol("S#2824", "CYC"), (SubLObject)NIL) });
        $ic139$ = ConsesLow.list(new SubLObject[] { makeKeyword("STREAM"), makeKeyword("VERBOSITY"), makeKeyword("STOP-AT-FIRST-FAILURE?"), makeKeyword("OUTPUT-FORMAT"), makeKeyword("RETURN-TEST-RUNS?"), makeKeyword("TYPE"), makeKeyword("RUN-NON-WORKING-TESTS"), makeKeyword("PROGRESS-FILE"), makeKeyword("RERUN-CRASHING-TESTS") });
        $ic140$ = makeKeyword("VERBOSE");
        $ic141$ = makeSymbol("S#2529", "CYC");
        $ic142$ = makeSymbol("QUOTE");
        $ic143$ = ConsesLow.list((SubLObject)makeSymbol("S#885", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#2607", "CYC"));
        $ic144$ = ConsesLow.list((SubLObject)makeKeyword("KB"));
        $ic145$ = makeSymbol("S#2786", "CYC");
        $ic146$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#2825", "CYC"), makeSymbol("&KEY"), ConsesLow.list((SubLObject)makeSymbol("STREAM"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("*STANDARD-OUTPUT*"))), ConsesLow.list((SubLObject)makeSymbol("S#2816", "CYC"), (SubLObject)makeKeyword("VERBOSE")), ConsesLow.list((SubLObject)makeSymbol("S#2817", "CYC"), (SubLObject)NIL), ConsesLow.list((SubLObject)makeSymbol("S#2818", "CYC"), (SubLObject)makeKeyword("STANDARD")), ConsesLow.list((SubLObject)makeSymbol("S#2821", "CYC"), (SubLObject)NIL), ConsesLow.list((SubLObject)makeSymbol("TYPE"), (SubLObject)makeKeyword("ALL")), ConsesLow.list((SubLObject)makeSymbol("S#2822", "CYC"), (SubLObject)NIL) });
        $ic147$ = ConsesLow.list((SubLObject)makeKeyword("STREAM"), (SubLObject)makeKeyword("VERBOSITY"), (SubLObject)makeKeyword("STOP-AT-FIRST-FAILURE?"), (SubLObject)makeKeyword("OUTPUT-FORMAT"), (SubLObject)makeKeyword("RETURN-TEST-RUNS?"), (SubLObject)makeKeyword("TYPE"), (SubLObject)makeKeyword("RUN-NON-WORKING-TESTS"));
        $ic148$ = makeSymbol("S#2739", "CYC");
        $ic149$ = makeSymbol("STREAMP");
        $ic150$ = makeSymbol("BOOLEANP");
        $ic151$ = makeSymbol("S#2687", "CYC");
        $ic152$ = makeString("could not load ~a.lisp from ~s");
        $ic153$ = makeString("testdcl");
        $ic154$ = makeString("Loading test files");
        $ic155$ = makeString(".lisp");
        $ic156$ = makeString("Invalid phase ~A of ~A specified.");
        $ic157$ = makeSymbol("DECLARE-CYC-TEST-FILE");
        $ic158$ = makeSymbol("S#2733", "CYC");
    }
    
    public static final class $sX2620_native extends SubLStructNative
    {
        public SubLObject $file;
        public SubLObject $guts;
        public static final SubLStructDeclNative structDecl;
        
        public $sX2620_native() {
            this.$file = (SubLObject)CommonSymbols.NIL;
            this.$guts = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SstructDecl;
        }
        
        public SubLObject getField2() {
            return this.$file;
        }
        
        public SubLObject getField3() {
            return this.$guts;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$file = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$guts = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX2620_native.class, $ic28$, $ic29$, $ic30$, $ic31$, new String[] { "$file", "$guts" }, $ic32$, $ic33$, $ic34$);
        }
    }
    
    public static final class $f1498$UnaryFunction extends UnaryFunction
    {
        public $f1498$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#2621"));
        }
        
        public SubLObject processItem(final SubLObject var34) {
            return f1498(var34);
        }
    }
    
    public static final class $sX2678_native extends SubLStructNative
    {
        public SubLObject $filename;
        public SubLObject $kb;
        public static final SubLStructDeclNative structDecl;
        
        public $sX2678_native() {
            this.$filename = (SubLObject)CommonSymbols.NIL;
            this.$kb = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SstructDecl;
        }
        
        public SubLObject getField2() {
            return this.$filename;
        }
        
        public SubLObject getField3() {
            return this.$kb;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$filename = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$kb = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX2678_native.class, $ic98$, $ic99$, $ic100$, $ic101$, new String[] { "$filename", "$kb" }, $ic102$, $ic103$, $ic104$);
        }
    }
    
    public static final class $f1558$UnaryFunction extends UnaryFunction
    {
        public $f1558$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#2679"));
        }
        
        public SubLObject processItem(final SubLObject var34) {
            return f1558(var34);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 554 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/