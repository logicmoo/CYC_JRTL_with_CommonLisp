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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0679 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0679";
    public static final String myFingerPrint = "219722b85db7e85fcfe5f437f9876d339a5672f9a321667cebc20199bef6b9d4";
    private static SubLSymbol $g5340$;
    public static SubLSymbol $g5341$;
    private static SubLSymbol $g5342$;
    private static SubLSymbol $g5343$;
    private static final SubLString $ic0$;
    private static final SubLString $ic1$;
    private static final SubLSymbol $ic2$;
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
    private static final SubLString $ic36$;
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
    private static final SubLString $ic49$;
    private static final SubLList $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLString $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLString $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLString $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLString $ic63$;
    private static final SubLString $ic64$;
    private static final SubLString $ic65$;
    private static final SubLString $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLString $ic68$;
    private static final SubLString $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLString $ic71$;
    private static final SubLString $ic72$;
    private static final SubLString $ic73$;
    private static final SubLString $ic74$;
    private static final SubLString $ic75$;
    private static final SubLString $ic76$;
    private static final SubLString $ic77$;
    private static final SubLString $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLString $ic80$;
    private static final SubLString $ic81$;
    private static final SubLString $ic82$;
    private static final SubLString $ic83$;
    private static final SubLString $ic84$;
    private static final SubLString $ic85$;
    private static final SubLString $ic86$;
    private static final SubLString $ic87$;
    private static final SubLString $ic88$;
    private static final SubLString $ic89$;
    private static final SubLString $ic90$;
    private static final SubLString $ic91$;
    private static final SubLString $ic92$;
    private static final SubLInteger $ic93$;
    private static final SubLString $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLString $ic96$;
    private static final SubLString $ic97$;
    private static final SubLString $ic98$;
    private static final SubLInteger $ic99$;
    private static final SubLString $ic100$;
    private static final SubLString $ic101$;
    private static final SubLString $ic102$;
    private static final SubLString $ic103$;
    private static final SubLString $ic104$;
    private static final SubLString $ic105$;
    private static final SubLString $ic106$;
    private static final SubLString $ic107$;
    private static final SubLString $ic108$;
    private static final SubLString $ic109$;
    private static final SubLString $ic110$;
    private static final SubLObject $ic111$;
    private static final SubLString $ic112$;
    private static final SubLString $ic113$;
    private static final SubLString $ic114$;
    private static final SubLString $ic115$;
    private static final SubLString $ic116$;
    private static final SubLString $ic117$;
    private static final SubLString $ic118$;
    private static final SubLString $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLString $ic121$;
    private static final SubLString $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLString $ic124$;
    private static final SubLString $ic125$;
    private static final SubLString $ic126$;
    private static final SubLString $ic127$;
    private static final SubLSymbol $ic128$;
    private static final SubLString $ic129$;
    private static final SubLString $ic130$;
    private static final SubLSymbol $ic131$;
    private static final SubLSymbol $ic132$;
    private static final SubLString $ic133$;
    private static final SubLString $ic134$;
    private static final SubLString $ic135$;
    private static final SubLString $ic136$;
    private static final SubLString $ic137$;
    private static final SubLString $ic138$;
    private static final SubLSymbol $ic139$;
    private static final SubLString $ic140$;
    private static final SubLString $ic141$;
    private static final SubLString $ic142$;
    private static final SubLString $ic143$;
    private static final SubLString $ic144$;
    private static final SubLInteger $ic145$;
    private static final SubLString $ic146$;
    private static final SubLString $ic147$;
    private static final SubLSymbol $ic148$;
    private static final SubLString $ic149$;
    private static final SubLString $ic150$;
    private static final SubLSymbol $ic151$;
    private static final SubLString $ic152$;
    private static final SubLString $ic153$;
    private static final SubLString $ic154$;
    private static final SubLString $ic155$;
    private static final SubLString $ic156$;
    private static final SubLSymbol $ic157$;
    private static final SubLList $ic158$;
    private static final SubLString $ic159$;
    private static final SubLString $ic160$;
    
    
    public static SubLObject f41505(final SubLObject var1, final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (NIL == var3) {
            var3 = $g5340$.getGlobalValue();
        }
        return Sequences.cconcatenate(var1, new SubLObject[] { var2, $ic1$, var3 });
    }
    
    public static SubLObject f41506(final SubLObject var4) {
        assert NIL != Filesys.directory_p(var4) : var4;
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = Filesys.directory(var4, (SubLObject)UNPROVIDED);
        SubLObject var7 = (SubLObject)NIL;
        var7 = var6.first();
        while (NIL != var6) {
            if (NIL != module0038.f2673(var7, $g5340$.getGlobalValue(), (SubLObject)UNPROVIDED)) {
                var5 = (SubLObject)ConsesLow.cons(var7, var5);
            }
            var6 = var6.rest();
            var7 = var6.first();
        }
        return var5;
    }
    
    public static SubLObject f41507() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41508() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41509() {
        return f41507();
    }
    
    public static SubLObject f41510() {
        return f41508();
    }
    
    public static SubLObject f41511(final SubLObject var8, final SubLObject var9) {
        compatibility.default_struct_print_function(var8, var9, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41512(final SubLObject var8) {
        return (SubLObject)((var8.getClass() == $cb_partition_save_native.class) ? T : NIL);
    }
    
    public static SubLObject f41513(final SubLObject var8) {
        assert NIL != f41512(var8) : var8;
        return var8.getField2();
    }
    
    public static SubLObject f41514(final SubLObject var8) {
        assert NIL != f41512(var8) : var8;
        return var8.getField3();
    }
    
    public static SubLObject f41515(final SubLObject var8) {
        assert NIL != f41512(var8) : var8;
        return var8.getField4();
    }
    
    public static SubLObject f41516(final SubLObject var8) {
        assert NIL != f41512(var8) : var8;
        return var8.getField5();
    }
    
    public static SubLObject f41517(final SubLObject var8) {
        assert NIL != f41512(var8) : var8;
        return var8.getField6();
    }
    
    public static SubLObject f41518(final SubLObject var8) {
        assert NIL != f41512(var8) : var8;
        return var8.getField7();
    }
    
    public static SubLObject f41519(final SubLObject var8) {
        assert NIL != f41512(var8) : var8;
        return var8.getField8();
    }
    
    public static SubLObject f41520(final SubLObject var8) {
        assert NIL != f41512(var8) : var8;
        return var8.getField9();
    }
    
    public static SubLObject f41521(final SubLObject var8, final SubLObject var11) {
        assert NIL != f41512(var8) : var8;
        return var8.setField2(var11);
    }
    
    public static SubLObject f41522(final SubLObject var8, final SubLObject var11) {
        assert NIL != f41512(var8) : var8;
        return var8.setField3(var11);
    }
    
    public static SubLObject f41523(final SubLObject var8, final SubLObject var11) {
        assert NIL != f41512(var8) : var8;
        return var8.setField4(var11);
    }
    
    public static SubLObject f41524(final SubLObject var8, final SubLObject var11) {
        assert NIL != f41512(var8) : var8;
        return var8.setField5(var11);
    }
    
    public static SubLObject f41525(final SubLObject var8, final SubLObject var11) {
        assert NIL != f41512(var8) : var8;
        return var8.setField6(var11);
    }
    
    public static SubLObject f41526(final SubLObject var8, final SubLObject var11) {
        assert NIL != f41512(var8) : var8;
        return var8.setField7(var11);
    }
    
    public static SubLObject f41527(final SubLObject var8, final SubLObject var11) {
        assert NIL != f41512(var8) : var8;
        return var8.setField8(var11);
    }
    
    public static SubLObject f41528(final SubLObject var8, final SubLObject var11) {
        assert NIL != f41512(var8) : var8;
        return var8.setField9(var11);
    }
    
    public static SubLObject f41529(SubLObject var12) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        final SubLObject var13 = (SubLObject)new $cb_partition_save_native();
        SubLObject var14;
        SubLObject var15;
        SubLObject var16;
        SubLObject var17;
        for (var14 = (SubLObject)NIL, var14 = var12; NIL != var14; var14 = conses_high.cddr(var14)) {
            var15 = var14.first();
            var16 = conses_high.cadr(var14);
            var17 = var15;
            if (var17.eql((SubLObject)$ic28$)) {
                f41521(var13, var16);
            }
            else if (var17.eql((SubLObject)$ic29$)) {
                f41522(var13, var16);
            }
            else if (var17.eql((SubLObject)$ic30$)) {
                f41523(var13, var16);
            }
            else if (var17.eql((SubLObject)$ic31$)) {
                f41524(var13, var16);
            }
            else if (var17.eql((SubLObject)$ic32$)) {
                f41525(var13, var16);
            }
            else if (var17.eql((SubLObject)$ic33$)) {
                f41526(var13, var16);
            }
            else if (var17.eql((SubLObject)$ic34$)) {
                f41527(var13, var16);
            }
            else if (var17.eql((SubLObject)$ic35$)) {
                f41528(var13, var16);
            }
            else {
                Errors.error((SubLObject)$ic36$, var15);
            }
        }
        return var13;
    }
    
    public static SubLObject f41530(final SubLObject var18, final SubLObject var19) {
        Functions.funcall(var19, var18, (SubLObject)$ic37$, (SubLObject)$ic38$, (SubLObject)EIGHT_INTEGER);
        Functions.funcall(var19, var18, (SubLObject)$ic39$, (SubLObject)$ic28$, f41513(var18));
        Functions.funcall(var19, var18, (SubLObject)$ic39$, (SubLObject)$ic29$, f41514(var18));
        Functions.funcall(var19, var18, (SubLObject)$ic39$, (SubLObject)$ic30$, f41515(var18));
        Functions.funcall(var19, var18, (SubLObject)$ic39$, (SubLObject)$ic31$, f41516(var18));
        Functions.funcall(var19, var18, (SubLObject)$ic39$, (SubLObject)$ic32$, f41517(var18));
        Functions.funcall(var19, var18, (SubLObject)$ic39$, (SubLObject)$ic33$, f41518(var18));
        Functions.funcall(var19, var18, (SubLObject)$ic39$, (SubLObject)$ic34$, f41519(var18));
        Functions.funcall(var19, var18, (SubLObject)$ic39$, (SubLObject)$ic35$, f41520(var18));
        Functions.funcall(var19, var18, (SubLObject)$ic40$, (SubLObject)$ic38$, (SubLObject)EIGHT_INTEGER);
        return var18;
    }
    
    public static SubLObject f41531(final SubLObject var18, final SubLObject var19) {
        return f41530(var18, var19);
    }
    
    public static SubLObject f41532() {
        final SubLObject var20 = f41529((SubLObject)UNPROVIDED);
        f41533(var20);
        f41534(var20);
        return var20;
    }
    
    public static SubLObject f41535(final SubLObject var20) {
        assert NIL != f41512(var20) : var20;
        return f41513(var20);
    }
    
    public static SubLObject f41536(final SubLObject var20) {
        assert NIL != f41512(var20) : var20;
        return f41514(var20);
    }
    
    public static SubLObject f41537(final SubLObject var20) {
        assert NIL != f41512(var20) : var20;
        return f41515(var20);
    }
    
    public static SubLObject f41538(final SubLObject var20) {
        assert NIL != f41512(var20) : var20;
        return f41516(var20);
    }
    
    public static SubLObject f41539(final SubLObject var20) {
        assert NIL != f41512(var20) : var20;
        return f41517(var20);
    }
    
    public static SubLObject f41540(final SubLObject var20) {
        assert NIL != f41512(var20) : var20;
        return f41518(var20);
    }
    
    public static SubLObject f41541(final SubLObject var20) {
        assert NIL != f41512(var20) : var20;
        return f41519(var20);
    }
    
    public static SubLObject f41542(final SubLObject var20) {
        assert NIL != f41512(var20) : var20;
        return f41520(var20);
    }
    
    public static SubLObject f41543(final SubLObject var20, final SubLObject var4) {
        assert NIL != f41512(var20) : var20;
        assert NIL != Types.stringp(var4) : var4;
        f41521(var20, var4);
        return var20;
    }
    
    public static SubLObject f41544(final SubLObject var20, final SubLObject var4) {
        assert NIL != f41512(var20) : var20;
        if (NIL != var4 && !areAssertionsDisabledFor(me) && NIL == Types.stringp(var4)) {
            throw new AssertionError(var4);
        }
        f41522(var20, var4);
        return var20;
    }
    
    public static SubLObject f41545(final SubLObject var20, final SubLObject var4) {
        assert NIL != f41512(var20) : var20;
        if (NIL != var4 && !areAssertionsDisabledFor(me) && NIL == Types.stringp(var4)) {
            throw new AssertionError(var4);
        }
        f41523(var20, var4);
        return var20;
    }
    
    public static SubLObject f41546(final SubLObject var20, final SubLObject var2) {
        assert NIL != f41512(var20) : var20;
        assert NIL != Types.stringp(var2) : var2;
        f41524(var20, var2);
        return var20;
    }
    
    public static SubLObject f41547(final SubLObject var20, final SubLObject var21) {
        assert NIL != f41512(var20) : var20;
        f41525(var20, var21);
        return var20;
    }
    
    public static SubLObject f41548(final SubLObject var20, final SubLObject var22) {
        assert NIL != f41512(var20) : var20;
        assert NIL != Types.listp(var22) : var22;
        f41526(var20, var22);
        return var20;
    }
    
    public static SubLObject f41549(final SubLObject var20, final SubLObject var23) {
        assert NIL != f41512(var20) : var20;
        assert NIL != Types.listp(var23) : var23;
        f41527(var20, var23);
        return var20;
    }
    
    public static SubLObject f41550(final SubLObject var20, final SubLObject var24) {
        assert NIL != f41512(var20) : var20;
        assert NIL != Types.listp(var24) : var24;
        f41528(var20, var24);
        return var20;
    }
    
    public static SubLObject f41551(final SubLObject var20) {
        assert NIL != f41512(var20) : var20;
        SubLObject var21 = (SubLObject)NIL;
        SubLObject var22 = f41539(var20);
        SubLObject var23 = (SubLObject)NIL;
        var23 = var22.first();
        while (NIL != var22) {
            var21 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic44$, var23), var21);
            var22 = var22.rest();
            var23 = var22.first();
        }
        var22 = f41540(var20);
        SubLObject var24 = (SubLObject)NIL;
        var24 = var22.first();
        while (NIL != var22) {
            var21 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic45$, var24), var21);
            var22 = var22.rest();
            var24 = var22.first();
        }
        var22 = f41541(var20);
        SubLObject var25 = (SubLObject)NIL;
        var25 = var22.first();
        while (NIL != var22) {
            var21 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic46$, var25), var21);
            var22 = var22.rest();
            var25 = var22.first();
        }
        var22 = f41542(var20);
        SubLObject var26 = (SubLObject)NIL;
        var26 = var22.first();
        while (NIL != var22) {
            var21 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic47$, var26), var21);
            var22 = var22.rest();
            var26 = var22.first();
        }
        var21 = Sequences.nreverse(var21);
        return var21;
    }
    
    public static SubLObject f41552(final SubLObject var20, final SubLObject var27) {
        assert NIL != f41512(var20) : var20;
        assert NIL != module0173.f10955(var27) : var27;
        if (NIL == conses_high.member(var27, f41518(var20), Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            final SubLObject var28 = (SubLObject)ConsesLow.cons(var27, (SubLObject)NIL);
            final SubLObject var29 = f41518(var20);
            if (NIL != var29) {
                module0005.f188(var29, var28);
            }
            else {
                f41526(var20, var28);
            }
        }
        return var20;
    }
    
    public static SubLObject f41553(final SubLObject var20, final SubLObject var28) {
        assert NIL != f41512(var20) : var20;
        assert NIL != module0173.f10955(var28) : var28;
        if (NIL == conses_high.member(var28, f41519(var20), Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            final SubLObject var29 = (SubLObject)ConsesLow.cons(var28, (SubLObject)NIL);
            final SubLObject var30 = f41519(var20);
            if (NIL != var30) {
                module0005.f188(var30, var29);
            }
            else {
                f41527(var20, var29);
            }
        }
        return var20;
    }
    
    public static SubLObject f41554(final SubLObject var20, final SubLObject var29) {
        assert NIL != f41512(var20) : var20;
        assert NIL != module0173.f10955(var29) : var29;
        if (NIL == conses_high.member(var29, f41520(var20), Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            final SubLObject var30 = (SubLObject)ConsesLow.cons(var29, (SubLObject)NIL);
            final SubLObject var31 = f41520(var20);
            if (NIL != var31) {
                module0005.f188(var31, var30);
            }
            else {
                f41528(var20, var30);
            }
        }
        return var20;
    }
    
    public static SubLObject f41533(final SubLObject var20) {
        f41543(var20, (SubLObject)$ic49$);
        f41545(var20, f41507());
        f41544(var20, f41508());
        f41546(var20, (SubLObject)$ic49$);
        return var20;
    }
    
    public static SubLObject f41534(final SubLObject var20) {
        f41547(var20, (SubLObject)NIL);
        f41548(var20, (SubLObject)NIL);
        f41549(var20, (SubLObject)NIL);
        f41550(var20, (SubLObject)NIL);
        return var20;
    }
    
    public static SubLObject f41555(final SubLObject var2, final SubLObject var20) {
        final SubLObject var21 = f41551(var20);
        module0559.f34397(var2, var21);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41556(final SubLObject var5) {
        SubLObject var6 = var5;
        SubLObject var7 = (SubLObject)NIL;
        var7 = var6.first();
        while (NIL != var6) {
            module0559.f34429(var7, (SubLObject)UNPROVIDED);
            var6 = var6.rest();
            var7 = var6.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41557() {
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic51$), $g5342$.getGlobalValue());
    }
    
    public static SubLObject f41558(final SubLObject var26) {
        return Sequences.position(var26, $g5342$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQ), Symbols.symbol_function((SubLObject)$ic51$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f41559(final SubLObject var26) {
        return conses_high.second(Sequences.find(var26, $g5342$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQ), Symbols.symbol_function((SubLObject)$ic51$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f41560() {
        final SubLObject var33 = Numbers.add((SubLObject)ONE_INTEGER, module0164.f10677());
        SubLObject var34 = constant_handles_oc.f8425();
        if (NIL == module0065.f4772(var34, (SubLObject)$ic53$)) {
            final SubLObject var35_36 = var34;
            if (NIL == module0065.f4775(var35_36, (SubLObject)$ic53$)) {
                final SubLObject var35 = module0065.f4740(var35_36);
                final SubLObject var36 = (SubLObject)NIL;
                SubLObject var37;
                SubLObject var38;
                SubLObject var39;
                SubLObject var40;
                for (var37 = Sequences.length(var35), var38 = (SubLObject)NIL, var38 = (SubLObject)ZERO_INTEGER; var38.numL(var37); var38 = Numbers.add(var38, (SubLObject)ONE_INTEGER)) {
                    var39 = ((NIL != var36) ? Numbers.subtract(var37, var38, (SubLObject)ONE_INTEGER) : var38);
                    var40 = Vectors.aref(var35, var39);
                    if (NIL == module0065.f4749(var40) || NIL == module0065.f4773((SubLObject)$ic53$)) {
                        if (NIL != module0065.f4749(var40)) {
                            var40 = (SubLObject)$ic53$;
                        }
                        if (!var39.numL(var33)) {
                            module0559.f34343(var40);
                        }
                    }
                }
            }
            final SubLObject var43_44 = var34;
            if (NIL == module0065.f4777(var43_44) || NIL == module0065.f4773((SubLObject)$ic53$)) {
                final SubLObject var41 = module0065.f4738(var43_44);
                SubLObject var42 = module0065.f4739(var43_44);
                final SubLObject var43 = module0065.f4734(var43_44);
                final SubLObject var44 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic53$)) ? NIL : $ic53$);
                while (var42.numL(var43)) {
                    final SubLObject var45 = Hashtables.gethash_without_values(var42, var41, var44);
                    if ((NIL == module0065.f4773((SubLObject)$ic53$) || NIL == module0065.f4749(var45)) && !var42.numL(var33)) {
                        module0559.f34343(var45);
                    }
                    var42 = Numbers.add(var42, (SubLObject)ONE_INTEGER);
                }
            }
        }
        final SubLObject var46 = Numbers.add((SubLObject)ONE_INTEGER, module0167.f10810());
        var34 = module0167.f10788();
        if (NIL == module0065.f4772(var34, (SubLObject)$ic53$)) {
            final SubLObject var35_37 = var34;
            if (NIL == module0065.f4775(var35_37, (SubLObject)$ic53$)) {
                final SubLObject var35 = module0065.f4740(var35_37);
                final SubLObject var36 = (SubLObject)NIL;
                SubLObject var37;
                SubLObject var38;
                SubLObject var39;
                SubLObject var47;
                for (var37 = Sequences.length(var35), var38 = (SubLObject)NIL, var38 = (SubLObject)ZERO_INTEGER; var38.numL(var37); var38 = Numbers.add(var38, (SubLObject)ONE_INTEGER)) {
                    var39 = ((NIL != var36) ? Numbers.subtract(var37, var38, (SubLObject)ONE_INTEGER) : var38);
                    var47 = Vectors.aref(var35, var39);
                    if (NIL == module0065.f4749(var47) || NIL == module0065.f4773((SubLObject)$ic53$)) {
                        if (NIL != module0065.f4749(var47)) {
                            var47 = (SubLObject)$ic53$;
                        }
                        if (!var39.numL(var46)) {
                            module0559.f34343(var47);
                        }
                    }
                }
            }
            final SubLObject var43_45 = var34;
            if (NIL == module0065.f4777(var43_45) || NIL == module0065.f4773((SubLObject)$ic53$)) {
                final SubLObject var41 = module0065.f4738(var43_45);
                SubLObject var42 = module0065.f4739(var43_45);
                final SubLObject var43 = module0065.f4734(var43_45);
                final SubLObject var44 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic53$)) ? NIL : $ic53$);
                while (var42.numL(var43)) {
                    final SubLObject var48 = Hashtables.gethash_without_values(var42, var41, var44);
                    if ((NIL == module0065.f4773((SubLObject)$ic53$) || NIL == module0065.f4749(var48)) && !var42.numL(var46)) {
                        module0559.f34343(var48);
                    }
                    var42 = Numbers.add(var42, (SubLObject)ONE_INTEGER);
                }
            }
        }
        final SubLObject var49 = Numbers.add((SubLObject)ONE_INTEGER, assertion_handles_oc.f11032());
        var34 = assertion_handles_oc.f11010();
        if (NIL == module0065.f4772(var34, (SubLObject)$ic53$)) {
            final SubLObject var35_38 = var34;
            if (NIL == module0065.f4775(var35_38, (SubLObject)$ic53$)) {
                final SubLObject var35 = module0065.f4740(var35_38);
                final SubLObject var36 = (SubLObject)NIL;
                SubLObject var37;
                SubLObject var38;
                SubLObject var39;
                SubLObject var50;
                for (var37 = Sequences.length(var35), var38 = (SubLObject)NIL, var38 = (SubLObject)ZERO_INTEGER; var38.numL(var37); var38 = Numbers.add(var38, (SubLObject)ONE_INTEGER)) {
                    var39 = ((NIL != var36) ? Numbers.subtract(var37, var38, (SubLObject)ONE_INTEGER) : var38);
                    var50 = Vectors.aref(var35, var39);
                    if (NIL == module0065.f4749(var50) || NIL == module0065.f4773((SubLObject)$ic53$)) {
                        if (NIL != module0065.f4749(var50)) {
                            var50 = (SubLObject)$ic53$;
                        }
                        if (!var39.numL(var49)) {
                            module0559.f34348(var50);
                        }
                    }
                }
            }
            final SubLObject var43_46 = var34;
            if (NIL == module0065.f4777(var43_46) || NIL == module0065.f4773((SubLObject)$ic53$)) {
                final SubLObject var41 = module0065.f4738(var43_46);
                SubLObject var42 = module0065.f4739(var43_46);
                final SubLObject var43 = module0065.f4734(var43_46);
                final SubLObject var44 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic53$)) ? NIL : $ic53$);
                while (var42.numL(var43)) {
                    final SubLObject var51 = Hashtables.gethash_without_values(var42, var41, var44);
                    if ((NIL == module0065.f4773((SubLObject)$ic53$) || NIL == module0065.f4749(var51)) && !var42.numL(var49)) {
                        module0559.f34348(var51);
                    }
                    var42 = Numbers.add(var42, (SubLObject)ONE_INTEGER);
                }
            }
        }
        final SubLObject var52 = Numbers.add((SubLObject)ONE_INTEGER, deduction_handles_oc.f11656());
        var34 = deduction_handles_oc.f11634();
        if (NIL == module0065.f4772(var34, (SubLObject)$ic53$)) {
            final SubLObject var35_39 = var34;
            if (NIL == module0065.f4775(var35_39, (SubLObject)$ic53$)) {
                final SubLObject var35 = module0065.f4740(var35_39);
                final SubLObject var36 = (SubLObject)NIL;
                SubLObject var37;
                SubLObject var38;
                SubLObject var39;
                SubLObject var53;
                for (var37 = Sequences.length(var35), var38 = (SubLObject)NIL, var38 = (SubLObject)ZERO_INTEGER; var38.numL(var37); var38 = Numbers.add(var38, (SubLObject)ONE_INTEGER)) {
                    var39 = ((NIL != var36) ? Numbers.subtract(var37, var38, (SubLObject)ONE_INTEGER) : var38);
                    var53 = Vectors.aref(var35, var39);
                    if (NIL == module0065.f4749(var53) || NIL == module0065.f4773((SubLObject)$ic53$)) {
                        if (NIL != module0065.f4749(var53)) {
                            var53 = (SubLObject)$ic53$;
                        }
                        if (!var39.numL(var52)) {
                            module0559.f34364(var53);
                        }
                    }
                }
            }
            final SubLObject var43_47 = var34;
            if (NIL == module0065.f4777(var43_47) || NIL == module0065.f4773((SubLObject)$ic53$)) {
                final SubLObject var41 = module0065.f4738(var43_47);
                SubLObject var42 = module0065.f4739(var43_47);
                final SubLObject var43 = module0065.f4734(var43_47);
                final SubLObject var44 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic53$)) ? NIL : $ic53$);
                while (var42.numL(var43)) {
                    final SubLObject var54 = Hashtables.gethash_without_values(var42, var41, var44);
                    if ((NIL == module0065.f4773((SubLObject)$ic53$) || NIL == module0065.f4749(var54)) && !var42.numL(var52)) {
                        module0559.f34364(var54);
                    }
                    var42 = Numbers.add(var42, (SubLObject)ONE_INTEGER);
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41561() {
        final SubLThread var60 = SubLProcess.currentSubLThread();
        final SubLObject var61 = assertion_handles_oc.f11010();
        final SubLObject var62 = (SubLObject)$ic55$;
        final SubLObject var63 = module0065.f4733(var61);
        SubLObject var64 = (SubLObject)ZERO_INTEGER;
        assert NIL != Types.stringp(var62) : var62;
        final SubLObject var65 = module0012.$g75$.currentBinding(var60);
        final SubLObject var66 = module0012.$g76$.currentBinding(var60);
        final SubLObject var67 = module0012.$g77$.currentBinding(var60);
        final SubLObject var68 = module0012.$g78$.currentBinding(var60);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var60);
            module0012.$g76$.bind((SubLObject)NIL, var60);
            module0012.$g77$.bind((SubLObject)T, var60);
            module0012.$g78$.bind(Time.get_universal_time(), var60);
            module0012.f478(var62);
            final SubLObject var34_69 = var61;
            if (NIL == module0065.f4772(var34_69, (SubLObject)$ic53$)) {
                final SubLObject var35_70 = var34_69;
                if (NIL == module0065.f4775(var35_70, (SubLObject)$ic53$)) {
                    final SubLObject var69 = module0065.f4740(var35_70);
                    final SubLObject var70 = (SubLObject)NIL;
                    SubLObject var71;
                    SubLObject var72;
                    SubLObject var73;
                    SubLObject var74;
                    for (var71 = Sequences.length(var69), var72 = (SubLObject)NIL, var72 = (SubLObject)ZERO_INTEGER; var72.numL(var71); var72 = Numbers.add(var72, (SubLObject)ONE_INTEGER)) {
                        var73 = ((NIL != var70) ? Numbers.subtract(var71, var72, (SubLObject)ONE_INTEGER) : var72);
                        var74 = Vectors.aref(var69, var73);
                        if (NIL == module0065.f4749(var74) || NIL == module0065.f4773((SubLObject)$ic53$)) {
                            if (NIL != module0065.f4749(var74)) {
                                var74 = (SubLObject)$ic53$;
                            }
                            module0012.note_percent_progress(var64, var63);
                            var64 = Numbers.add(var64, (SubLObject)ONE_INTEGER);
                            if (NIL != f41562(var74)) {
                                module0559.f34349(var74);
                            }
                        }
                    }
                }
                final SubLObject var43_72 = var34_69;
                if (NIL == module0065.f4777(var43_72) || NIL == module0065.f4773((SubLObject)$ic53$)) {
                    final SubLObject var75 = module0065.f4738(var43_72);
                    SubLObject var76 = module0065.f4739(var43_72);
                    final SubLObject var77 = module0065.f4734(var43_72);
                    final SubLObject var78 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic53$)) ? NIL : $ic53$);
                    while (var76.numL(var77)) {
                        final SubLObject var79 = Hashtables.gethash_without_values(var76, var75, var78);
                        if (NIL == module0065.f4773((SubLObject)$ic53$) || NIL == module0065.f4749(var79)) {
                            module0012.note_percent_progress(var64, var63);
                            var64 = Numbers.add(var64, (SubLObject)ONE_INTEGER);
                            if (NIL != f41562(var79)) {
                                module0559.f34349(var79);
                            }
                        }
                        var76 = Numbers.add(var76, (SubLObject)ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var68, var60);
            module0012.$g77$.rebind(var67, var60);
            module0012.$g76$.rebind(var66, var60);
            module0012.$g75$.rebind(var65, var60);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41562(final SubLObject var73) {
        return (SubLObject)makeBoolean(NIL != assertion_handles_oc.f11035(var73) && NIL != module0161.f10489(module0178.f11287(var73)));
    }
    
    public static SubLObject f41563() {
        final SubLThread var60 = SubLProcess.currentSubLThread();
        return $g5343$.getDynamicValue(var60);
    }
    
    public static SubLObject f41564() {
        final SubLThread var60 = SubLProcess.currentSubLThread();
        if (NIL == $g5343$.getDynamicValue(var60)) {
            $g5343$.setDynamicValue(f41532(), var60);
        }
        SubLObject var61 = (SubLObject)NIL;
        try {
            var60.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var62 = Errors.$error_handler$.currentBinding(var60);
            try {
                Errors.$error_handler$.bind((SubLObject)$ic57$, var60);
                try {
                    f41542($g5343$.getDynamicValue(var60));
                }
                catch (Throwable var63) {
                    Errors.handleThrowable(var63, (SubLObject)NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var62, var60);
            }
        }
        catch (Throwable var64) {
            var61 = Errors.handleThrowable(var64, module0003.$g3$.getGlobalValue());
        }
        finally {
            var60.throwStack.pop();
        }
        if (NIL != var61) {
            $g5343$.setDynamicValue(f41532(), var60);
        }
        return f41563();
    }
    
    public static SubLObject f41565(SubLObject var77) {
        if (var77 == UNPROVIDED) {
            var77 = (SubLObject)NIL;
        }
        return f41566();
    }
    
    public static SubLObject f41567(SubLObject var78) {
        if (var78 == UNPROVIDED) {
            var78 = (SubLObject)NIL;
        }
        final SubLThread var79 = SubLProcess.currentSubLThread();
        if (NIL == var78) {
            var78 = (SubLObject)$ic58$;
        }
        final SubLObject var80 = module0656.f39832((SubLObject)$ic59$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)$ic60$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var80) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var80);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var81 = module0015.$g533$.currentBinding(var79);
        try {
            module0015.$g533$.bind((SubLObject)T, var79);
            module0642.f39019(var78);
        }
        finally {
            module0015.$g533$.rebind(var81, var79);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41566() {
        final SubLThread var60 = SubLProcess.currentSubLThread();
        f41564();
        final SubLObject var61 = f41563();
        final SubLObject var62 = (SubLObject)$ic63$;
        final SubLObject var63 = module0015.$g538$.currentBinding(var60);
        try {
            module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var60))) ? module0015.$g538$.getDynamicValue(var60) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var60);
            module0642.f39020((SubLObject)$ic66$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var60), module0655.$g5142$.getDynamicValue(var60));
            final SubLObject var64 = module0014.f672((SubLObject)$ic67$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic68$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var64) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var64);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic69$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0016.f941();
            if (NIL != var62) {
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var62);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0666.f40471();
            module0666.f40487();
            module0666.f40535();
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var65_82 = module0015.$g535$.currentBinding(var60);
            try {
                module0015.$g535$.bind((SubLObject)T, var60);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (NIL != module0015.$g132$.getDynamicValue(var60)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var60)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic72$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var65_83 = module0015.$g533$.currentBinding(var60);
                try {
                    module0015.$g533$.bind((SubLObject)T, var60);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic73$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var65_84 = module0015.$g533$.currentBinding(var60);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var60);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic74$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic75$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic76$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var65_84, var60);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (NIL != var62) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        module0642.f39019(var62);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    final SubLObject var65 = module0656.f39832((SubLObject)NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var60));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic77$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    if (NIL != var65) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var65);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var65_85 = module0015.$g533$.currentBinding(var60);
                    final SubLObject var66 = module0015.$g541$.currentBinding(var60);
                    final SubLObject var67 = module0015.$g539$.currentBinding(var60);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var60);
                        module0015.$g541$.bind((SubLObject)T, var60);
                        module0015.$g539$.bind(module0015.f797(), var60);
                        module0642.f39069((SubLObject)$ic78$, (SubLObject)T, (SubLObject)UNPROVIDED);
                        f41568(var61);
                        module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        f41569(var61);
                        module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        f41570(var61);
                        module0015.f799(module0015.$g539$.getDynamicValue(var60));
                    }
                    finally {
                        module0015.$g539$.rebind(var67, var60);
                        module0015.$g541$.rebind(var66, var60);
                        module0015.$g533$.rebind(var65_85, var60);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var65_83, var60);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var65_82, var60);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var63, var60);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41568(final SubLObject var20) {
        module0656.f39870((SubLObject)$ic79$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39073((SubLObject)$ic81$);
        module0642.f39032((SubLObject)UNPROVIDED);
        module0642.f39074((SubLObject)$ic82$, (SubLObject)$ic83$, (SubLObject)UNPROVIDED);
        module0642.f39032((SubLObject)UNPROVIDED);
        module0642.f39074((SubLObject)$ic84$, (SubLObject)$ic85$, (SubLObject)UNPROVIDED);
        module0642.f39032((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41569(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g207$.getGlobalValue());
        module0642.f39021((SubLObject)$ic86$);
        module0642.f39020(module0015.$g208$.getGlobalValue());
        final SubLObject var22 = f41536(var20);
        final SubLObject var23 = f41537(var20);
        final SubLObject var24 = f41535(var20);
        module0642.f39026((SubLObject)TWO_INTEGER);
        module0642.f39021((SubLObject)$ic87$);
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var25 = module0015.$g533$.currentBinding(var21);
        try {
            module0015.$g533$.bind((SubLObject)T, var21);
            if (NIL != var22) {
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var65_90 = module0015.$g533$.currentBinding(var21);
                try {
                    module0015.$g533$.bind((SubLObject)T, var21);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var65_91 = module0015.$g533$.currentBinding(var21);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var21);
                        module0642.f39072((SubLObject)$ic88$, (SubLObject)$ic89$, module0038.f2608(var24), (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var65_92 = module0015.$g533$.currentBinding(var21);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var21);
                            module0642.f39020(module0015.$g240$.getGlobalValue());
                            module0642.f39019(var22);
                            module0642.f39020(module0015.$g241$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var65_92, var21);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var65_91, var21);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var65_90, var21);
                }
                module0642.f39020(module0015.$g365$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            if (NIL != var23) {
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var65_93 = module0015.$g533$.currentBinding(var21);
                try {
                    module0015.$g533$.bind((SubLObject)T, var21);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var65_94 = module0015.$g533$.currentBinding(var21);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var21);
                        module0642.f39072((SubLObject)$ic88$, (SubLObject)$ic90$, (SubLObject)makeBoolean(NIL != module0038.f2608(var24) && NIL == var22), (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var65_94, var21);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var65_95 = module0015.$g533$.currentBinding(var21);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var21);
                        module0642.f39020(module0015.$g240$.getGlobalValue());
                        module0642.f39019(var23);
                        module0642.f39020(module0015.$g241$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var65_95, var21);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var65_93, var21);
                }
                module0642.f39020(module0015.$g365$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var65_96 = module0015.$g533$.currentBinding(var21);
            try {
                module0015.$g533$.bind((SubLObject)T, var21);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var65_97 = module0015.$g533$.currentBinding(var21);
                try {
                    module0015.$g533$.bind((SubLObject)T, var21);
                    module0644.f39188((SubLObject)$ic88$, (SubLObject)$ic91$, (SubLObject)$ic92$, (SubLObject)makeBoolean(NIL == module0038.f2608(var24)));
                }
                finally {
                    module0015.$g533$.rebind(var65_97, var21);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var65_98 = module0015.$g533$.currentBinding(var21);
                try {
                    module0015.$g533$.bind((SubLObject)T, var21);
                    module0642.f39075((SubLObject)$ic91$, var24, (SubLObject)$ic93$);
                    module0644.f39184((SubLObject)$ic91$, (SubLObject)$ic94$);
                }
                finally {
                    module0015.$g533$.rebind(var65_98, var21);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var65_96, var21);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var25, var21);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        final SubLObject var26 = f41538(var20);
        final SubLObject var27 = $g5340$.getGlobalValue();
        module0642.f39026((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var28 = module0015.$g533$.currentBinding(var21);
        try {
            module0015.$g533$.bind((SubLObject)T, var21);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var65_99 = module0015.$g533$.currentBinding(var21);
            try {
                module0015.$g533$.bind((SubLObject)T, var21);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic95$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var65_100 = module0015.$g533$.currentBinding(var21);
                try {
                    module0015.$g533$.bind((SubLObject)T, var21);
                    module0642.f39021((SubLObject)$ic96$);
                }
                finally {
                    module0015.$g533$.rebind(var65_100, var21);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var65_101 = module0015.$g533$.currentBinding(var21);
                try {
                    module0015.$g533$.bind((SubLObject)T, var21);
                }
                finally {
                    module0015.$g533$.rebind(var65_101, var21);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic95$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var65_102 = module0015.$g533$.currentBinding(var21);
                try {
                    module0015.$g533$.bind((SubLObject)T, var21);
                    module0642.f39021((SubLObject)$ic97$);
                }
                finally {
                    module0015.$g533$.rebind(var65_102, var21);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var65_99, var21);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var65_103 = module0015.$g533$.currentBinding(var21);
            try {
                module0015.$g533$.bind((SubLObject)T, var21);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var65_104 = module0015.$g533$.currentBinding(var21);
                try {
                    module0015.$g533$.bind((SubLObject)T, var21);
                    module0644.f39184((SubLObject)$ic98$, (SubLObject)$ic94$);
                    module0642.f39075((SubLObject)$ic98$, var26, (SubLObject)$ic99$);
                }
                finally {
                    module0015.$g533$.rebind(var65_104, var21);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var65_105 = module0015.$g533$.currentBinding(var21);
                try {
                    module0015.$g533$.bind((SubLObject)T, var21);
                    module0642.f39020(module0015.$g240$.getGlobalValue());
                    module0642.f39019((SubLObject)$ic1$);
                    module0642.f39020(module0015.$g241$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var65_105, var21);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var65_106 = module0015.$g533$.currentBinding(var21);
                try {
                    module0015.$g533$.bind((SubLObject)T, var21);
                    module0642.f39020(module0015.$g240$.getGlobalValue());
                    module0642.f39019(var27);
                    module0642.f39020(module0015.$g241$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var65_106, var21);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var65_103, var21);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var28, var21);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41570(final SubLObject var20) {
        module0642.f39020(module0015.$g207$.getGlobalValue());
        module0642.f39021((SubLObject)$ic100$);
        module0642.f39020(module0015.$g208$.getGlobalValue());
        module0642.f39032((SubLObject)FOUR_INTEGER);
        module0642.f39074((SubLObject)$ic101$, (SubLObject)$ic102$, (SubLObject)UNPROVIDED);
        module0642.f39026((SubLObject)TWO_INTEGER);
        f41571(var20);
        module0642.f39026((SubLObject)TWO_INTEGER);
        f41572(var20);
        module0642.f39026((SubLObject)TWO_INTEGER);
        f41573(var20);
        module0642.f39026((SubLObject)TWO_INTEGER);
        f41574(var20);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41571(final SubLObject var20) {
        final SubLObject var21 = f41539(var20);
        final SubLObject var22 = f41557();
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019((SubLObject)$ic103$);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        SubLObject var23 = var22;
        SubLObject var24 = (SubLObject)NIL;
        var24 = var23.first();
        while (NIL != var23) {
            final SubLObject var25 = module0004.f104(var24, var21, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39026((SubLObject)UNPROVIDED);
            f41575(var24, var25);
            var23 = var23.rest();
            var24 = var23.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41575(final SubLObject var26, final SubLObject var110) {
        final SubLObject var111 = f41558(var26);
        final SubLObject var112 = f41559(var26);
        final SubLObject var113 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic104$, var111);
        module0642.f39068(var113, var111, var110, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39019(var112);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41572(final SubLObject var20) {
        final SubLObject var21 = f41540(var20);
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019((SubLObject)$ic105$);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        if (NIL == var21) {
            module0642.f39019((SubLObject)$ic106$);
        }
        else {
            module0642.f39026((SubLObject)UNPROVIDED);
            SubLObject var22 = (SubLObject)NIL;
            SubLObject var23 = (SubLObject)NIL;
            SubLObject var24 = (SubLObject)NIL;
            var22 = var21;
            var23 = var22.first();
            for (var24 = (SubLObject)ZERO_INTEGER; NIL != var22; var22 = var22.rest(), var23 = var22.first(), var24 = Numbers.add((SubLObject)ONE_INTEGER, var24)) {
                final SubLObject var25 = module0656.f39842(var23);
                final SubLObject var26 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic107$, var24);
                module0642.f39020(module0015.$g459$.getGlobalValue());
                module0642.f39068(var26, var25, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0656.f39804(var23, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g460$.getGlobalValue());
                module0642.f39032((SubLObject)TWO_INTEGER);
            }
        }
        module0642.f39026((SubLObject)UNPROVIDED);
        module0642.f39021((SubLObject)$ic108$);
        module0642.f39032((SubLObject)FOUR_INTEGER);
        module0642.f39074((SubLObject)$ic82$, (SubLObject)$ic83$, (SubLObject)UNPROVIDED);
        module0642.f39026((SubLObject)UNPROVIDED);
        module0666.f40467((SubLObject)$ic109$, (SubLObject)$ic110$, $ic111$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39075((SubLObject)$ic109$, (SubLObject)NIL, (SubLObject)$ic99$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41573(final SubLObject var20) {
        final SubLObject var21 = f41541(var20);
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019((SubLObject)$ic112$);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        if (NIL == var21) {
            module0642.f39019((SubLObject)$ic106$);
        }
        else {
            module0642.f39026((SubLObject)UNPROVIDED);
            SubLObject var22 = (SubLObject)NIL;
            SubLObject var23 = (SubLObject)NIL;
            SubLObject var24 = (SubLObject)NIL;
            var22 = var21;
            var23 = var22.first();
            for (var24 = (SubLObject)ZERO_INTEGER; NIL != var22; var22 = var22.rest(), var23 = var22.first(), var24 = Numbers.add((SubLObject)ONE_INTEGER, var24)) {
                final SubLObject var25 = module0656.f39842(var23);
                final SubLObject var26 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic113$, var24);
                module0642.f39020(module0015.$g459$.getGlobalValue());
                module0642.f39068(var26, var25, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0656.f39804(var23, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g460$.getGlobalValue());
                module0642.f39032((SubLObject)TWO_INTEGER);
            }
        }
        module0642.f39026((SubLObject)UNPROVIDED);
        module0642.f39021((SubLObject)$ic114$);
        module0642.f39032((SubLObject)FOUR_INTEGER);
        module0642.f39074((SubLObject)$ic82$, (SubLObject)$ic83$, (SubLObject)UNPROVIDED);
        module0642.f39026((SubLObject)UNPROVIDED);
        module0666.f40467((SubLObject)$ic115$, (SubLObject)$ic110$, $ic111$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39075((SubLObject)$ic115$, (SubLObject)NIL, (SubLObject)$ic99$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41574(final SubLObject var20) {
        final SubLObject var21 = f41542(var20);
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019((SubLObject)$ic116$);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        if (NIL == var21) {
            module0642.f39019((SubLObject)$ic106$);
        }
        else {
            module0642.f39026((SubLObject)UNPROVIDED);
            SubLObject var22 = (SubLObject)NIL;
            SubLObject var23 = (SubLObject)NIL;
            SubLObject var24 = (SubLObject)NIL;
            var22 = var21;
            var23 = var22.first();
            for (var24 = (SubLObject)ZERO_INTEGER; NIL != var22; var22 = var22.rest(), var23 = var22.first(), var24 = Numbers.add((SubLObject)ONE_INTEGER, var24)) {
                final SubLObject var25 = module0656.f39842(var23);
                final SubLObject var26 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic117$, var24);
                module0642.f39020(module0015.$g459$.getGlobalValue());
                module0642.f39068(var26, var25, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0656.f39804(var23, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g460$.getGlobalValue());
                module0642.f39032((SubLObject)TWO_INTEGER);
            }
        }
        module0642.f39026((SubLObject)UNPROVIDED);
        module0642.f39021((SubLObject)$ic118$);
        module0642.f39032((SubLObject)FOUR_INTEGER);
        module0642.f39074((SubLObject)$ic82$, (SubLObject)$ic83$, (SubLObject)UNPROVIDED);
        module0642.f39026((SubLObject)UNPROVIDED);
        module0666.f40467((SubLObject)$ic119$, (SubLObject)$ic110$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39075((SubLObject)$ic119$, (SubLObject)NIL, (SubLObject)$ic99$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41576(final SubLObject var77) {
        final SubLThread var78 = SubLProcess.currentSubLThread();
        final SubLObject var79 = f41563();
        SubLObject var80 = module0642.f39104((SubLObject)$ic91$, var77);
        SubLObject var81 = module0642.f39104((SubLObject)$ic98$, var77);
        if (NIL != var80) {
            var80 = module0038.f2735(var80);
            f41543(var79, var80);
        }
        else {
            f41543(var79, (SubLObject)$ic49$);
        }
        if (NIL != var81) {
            var81 = module0038.f2735(var81);
            f41546(var79, var81);
        }
        else {
            f41546(var79, (SubLObject)$ic49$);
        }
        if (NIL != module0642.f39104((SubLObject)$ic102$, var77)) {
            f41534(var79);
            return f41566();
        }
        final SubLObject var82 = f41577(var77);
        SubLObject var83 = (SubLObject)NIL;
        SubLObject var84 = (SubLObject)NIL;
        SubLObject var85 = (SubLObject)NIL;
        SubLObject var86 = (SubLObject)NIL;
        SubLObject var87 = (SubLObject)NIL;
        SubLObject var88 = (SubLObject)NIL;
        var78.resetMultipleValues();
        final SubLObject var125_126 = f41578(var77);
        final SubLObject var127_128 = var78.secondMultipleValue();
        var78.resetMultipleValues();
        var83 = var125_126;
        var84 = var127_128;
        if ($ic120$ == var84) {
            final SubLObject var89 = module0642.f39104((SubLObject)$ic109$, var77);
            return module0656.f39789((SubLObject)$ic121$, var89, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        var78.resetMultipleValues();
        final SubLObject var130_131 = f41579(var77);
        final SubLObject var132_133 = var78.secondMultipleValue();
        var78.resetMultipleValues();
        var85 = var130_131;
        var86 = var132_133;
        if ($ic120$ == var86) {
            final SubLObject var90 = module0642.f39104((SubLObject)$ic115$, var77);
            return module0656.f39789((SubLObject)$ic121$, var90, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        var78.resetMultipleValues();
        final SubLObject var135_136 = f41580(var77);
        final SubLObject var137_138 = var78.secondMultipleValue();
        var78.resetMultipleValues();
        var87 = var135_136;
        var88 = var137_138;
        if ($ic120$ == var88) {
            final SubLObject var91 = module0642.f39104((SubLObject)$ic119$, var77);
            return module0656.f39789((SubLObject)$ic121$, var91, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        f41547(var79, var82);
        f41548(var79, var83);
        f41549(var79, var85);
        f41550(var79, var87);
        if (NIL != var84) {
            f41552(var79, var84);
        }
        if (NIL != var86) {
            f41553(var79, var86);
        }
        if (NIL != var88) {
            f41554(var79, var88);
        }
        if (NIL != module0642.f39104((SubLObject)$ic83$, var77)) {
            return f41566();
        }
        if (NIL != module0642.f39104((SubLObject)$ic85$, var77)) {
            final SubLObject var92 = f41538(var79);
            final SubLObject var93 = module0642.f39104((SubLObject)$ic88$, var77);
            SubLObject var94 = (SubLObject)NIL;
            if (var93.equal((SubLObject)$ic89$)) {
                var94 = f41536(var79);
            }
            else if (var93.equal((SubLObject)$ic90$)) {
                var94 = f41537(var79);
            }
            else if (var93.equal((SubLObject)$ic92$)) {
                var94 = f41535(var79);
            }
            final SubLObject var95 = f41505(var94, var92, (SubLObject)UNPROVIDED);
            f41555(var95, var79);
            return module0656.f39793((SubLObject)$ic122$, (SubLObject)NIL);
        }
        return f41566();
    }
    
    public static SubLObject f41577(final SubLObject var77) {
        SubLObject var78 = (SubLObject)NIL;
        SubLObject var79 = var77;
        SubLObject var80 = (SubLObject)NIL;
        var80 = var79.first();
        while (NIL != var79) {
            if (var80.isCons() && NIL != module0038.f2684(var80.first(), (SubLObject)$ic124$)) {
                final SubLObject var81 = conses_high.second(var80);
                final SubLObject var82 = reader.parse_integer(var81, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (NIL != var82) {
                    var78 = (SubLObject)ConsesLow.cons(var82, var78);
                }
            }
            var79 = var79.rest();
            var80 = var79.first();
        }
        SubLObject var83 = (SubLObject)NIL;
        SubLObject var84 = f41557();
        SubLObject var85 = (SubLObject)NIL;
        var85 = var84.first();
        while (NIL != var84) {
            final SubLObject var86 = f41558(var85);
            if (NIL != module0004.f104(var86, var78, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var83 = (SubLObject)ConsesLow.cons(var85, var83);
            }
            var84 = var84.rest();
            var85 = var84.first();
        }
        return Sequences.nreverse(var83);
    }
    
    public static SubLObject f41578(final SubLObject var77) {
        SubLObject var78 = (SubLObject)NIL;
        SubLObject var79 = var77;
        SubLObject var80 = (SubLObject)NIL;
        var80 = var79.first();
        while (NIL != var79) {
            if (var80.isCons() && NIL != module0038.f2684(var80.first(), (SubLObject)$ic125$)) {
                final SubLObject var81 = conses_high.second(var80);
                final SubLObject var82 = module0656.f39943(var81, (SubLObject)UNPROVIDED);
                if (NIL != module0173.f10955(var82)) {
                    var78 = (SubLObject)ConsesLow.cons(var82, var78);
                }
            }
            var79 = var79.rest();
            var80 = var79.first();
        }
        var78 = Sequences.nreverse(var78);
        SubLObject var83 = module0642.f39104((SubLObject)$ic109$, var77);
        SubLObject var84 = (SubLObject)NIL;
        if (NIL != var83) {
            var83 = module0038.f2735(var83);
        }
        if (NIL == module0038.f2610(var83)) {
            var84 = module0656.f39943(var83, (SubLObject)UNPROVIDED);
            if (NIL == var84 || NIL == module0269.f17705(var84)) {
                var84 = (SubLObject)$ic120$;
            }
        }
        return Values.values(var78, var84);
    }
    
    public static SubLObject f41579(final SubLObject var77) {
        SubLObject var78 = (SubLObject)NIL;
        SubLObject var79 = var77;
        SubLObject var80 = (SubLObject)NIL;
        var80 = var79.first();
        while (NIL != var79) {
            if (var80.isCons() && NIL != module0038.f2684(var80.first(), (SubLObject)$ic126$)) {
                final SubLObject var81 = conses_high.second(var80);
                final SubLObject var82 = module0656.f39943(var81, (SubLObject)UNPROVIDED);
                if (NIL != module0173.f10955(var82)) {
                    var78 = (SubLObject)ConsesLow.cons(var82, var78);
                }
            }
            var79 = var79.rest();
            var80 = var79.first();
        }
        var78 = Sequences.nreverse(var78);
        SubLObject var83 = module0642.f39104((SubLObject)$ic115$, var77);
        SubLObject var84 = (SubLObject)NIL;
        if (NIL != var83) {
            var83 = module0038.f2735(var83);
        }
        if (NIL == module0038.f2610(var83)) {
            var84 = module0656.f39943(var83, (SubLObject)UNPROVIDED);
            if (NIL == var84 || NIL == module0269.f17705(var84)) {
                var84 = (SubLObject)$ic120$;
            }
        }
        return Values.values(var78, var84);
    }
    
    public static SubLObject f41580(final SubLObject var77) {
        SubLObject var78 = (SubLObject)NIL;
        SubLObject var79 = var77;
        SubLObject var80 = (SubLObject)NIL;
        var80 = var79.first();
        while (NIL != var79) {
            if (var80.isCons() && NIL != module0038.f2684(var80.first(), (SubLObject)$ic127$)) {
                final SubLObject var81 = conses_high.second(var80);
                final SubLObject var82 = module0656.f39943(var81, (SubLObject)UNPROVIDED);
                if (NIL != module0173.f10955(var82)) {
                    var78 = (SubLObject)ConsesLow.cons(var82, var78);
                }
            }
            var79 = var79.rest();
            var80 = var79.first();
        }
        var78 = Sequences.nreverse(var78);
        SubLObject var83 = module0642.f39104((SubLObject)$ic119$, var77);
        SubLObject var84 = (SubLObject)NIL;
        if (NIL != var83) {
            var83 = module0038.f2735(var83);
        }
        if (NIL == module0038.f2610(var83)) {
            var84 = module0656.f39943(var83, (SubLObject)UNPROVIDED);
            if (NIL == var84) {
                var84 = (SubLObject)$ic120$;
            }
        }
        return Values.values(var78, var84);
    }
    
    public static SubLObject f41581(SubLObject var77) {
        if (var77 == UNPROVIDED) {
            var77 = (SubLObject)NIL;
        }
        return f41582();
    }
    
    public static SubLObject f41583(SubLObject var78) {
        if (var78 == UNPROVIDED) {
            var78 = (SubLObject)NIL;
        }
        final SubLThread var79 = SubLProcess.currentSubLThread();
        if (NIL == var78) {
            var78 = (SubLObject)$ic129$;
        }
        final SubLObject var80 = module0656.f39832((SubLObject)$ic59$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)$ic130$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var80) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var80);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var81 = module0015.$g533$.currentBinding(var79);
        try {
            module0015.$g533$.bind((SubLObject)T, var79);
            module0642.f39019(var78);
        }
        finally {
            module0015.$g533$.rebind(var81, var79);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41582() {
        final SubLThread var60 = SubLProcess.currentSubLThread();
        if (NIL != module0543.f33698()) {
            return module0667.f40583((SubLObject)$ic136$);
        }
        final SubLObject var61 = (SubLObject)$ic133$;
        final SubLObject var62 = module0015.$g538$.currentBinding(var60);
        try {
            module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var60))) ? module0015.$g538$.getDynamicValue(var60) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var60);
            module0642.f39020((SubLObject)$ic66$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var60), module0655.$g5142$.getDynamicValue(var60));
            final SubLObject var63 = module0014.f672((SubLObject)$ic67$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic68$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var63) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var63);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic69$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0016.f941();
            if (NIL != var61) {
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var61);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var65_154 = module0015.$g535$.currentBinding(var60);
            try {
                module0015.$g535$.bind((SubLObject)T, var60);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (NIL != module0015.$g132$.getDynamicValue(var60)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var60)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic72$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var65_155 = module0015.$g533$.currentBinding(var60);
                try {
                    module0015.$g533$.bind((SubLObject)T, var60);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic73$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var65_156 = module0015.$g533$.currentBinding(var60);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var60);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic74$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic75$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic76$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var65_156, var60);
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
                    module0642.f39020(module0110.$g570$.getDynamicValue(var60));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic77$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    if (NIL != var64) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var64);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var65_157 = module0015.$g533$.currentBinding(var60);
                    final SubLObject var65 = module0015.$g541$.currentBinding(var60);
                    final SubLObject var66 = module0015.$g539$.currentBinding(var60);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var60);
                        module0015.$g541$.bind((SubLObject)T, var60);
                        module0015.$g539$.bind(module0015.f797(), var60);
                        module0642.f39069((SubLObject)$ic137$, (SubLObject)T, (SubLObject)UNPROVIDED);
                        f41584();
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        module0642.f39021((SubLObject)$ic138$);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        f41585();
                        module0642.f39026((SubLObject)UNPROVIDED);
                        f41586();
                        module0642.f39026((SubLObject)UNPROVIDED);
                        f41587();
                        f41588();
                        module0015.f799(module0015.$g539$.getDynamicValue(var60));
                    }
                    finally {
                        module0015.$g539$.rebind(var66, var60);
                        module0015.$g541$.rebind(var65, var60);
                        module0015.$g533$.rebind(var65_157, var60);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var65_155, var60);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var65_154, var60);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var62, var60);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41584() {
        module0656.f39870((SubLObject)$ic139$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39073((SubLObject)$ic81$);
        module0642.f39032((SubLObject)UNPROVIDED);
        module0642.f39074((SubLObject)$ic141$, (SubLObject)$ic142$, (SubLObject)UNPROVIDED);
        module0642.f39032((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41585() {
        module0642.f39019((SubLObject)$ic143$);
        module0642.f39026((SubLObject)UNPROVIDED);
        module0642.f39139((SubLObject)$ic144$, (SubLObject)$ic49$, (SubLObject)$ic145$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41586() {
        module0642.f39068((SubLObject)$ic146$, (SubLObject)T, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39019((SubLObject)$ic147$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41587() {
        final SubLThread var60 = SubLProcess.currentSubLThread();
        final SubLObject var61 = f41510();
        if (NIL != var61 && NIL != Filesys.directory_p(var61)) {
            final SubLObject var62 = f41506(var61);
            if (NIL != var62) {
                module0642.f39026((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g346$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var63 = module0015.$g533$.currentBinding(var60);
                try {
                    module0015.$g533$.bind((SubLObject)T, var60);
                    module0642.f39020(module0015.$g364$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var65_158 = module0015.$g533$.currentBinding(var60);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var60);
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39020(module0015.$g371$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)FOUR_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g370$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)$ic95$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g373$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)$ic148$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var65_159 = module0015.$g533$.currentBinding(var60);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var60);
                            module0642.f39021((SubLObject)$ic149$);
                            module0642.f39032((SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g240$.getGlobalValue());
                            module0642.f39019(var61);
                            module0642.f39020(module0015.$g241$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var65_159, var60);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var65_158, var60);
                    }
                    module0642.f39020(module0015.$g365$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                    SubLObject var64 = (SubLObject)NIL;
                    SubLObject var65 = (SubLObject)NIL;
                    SubLObject var66 = (SubLObject)NIL;
                    var64 = var62;
                    var65 = var64.first();
                    for (var66 = (SubLObject)ZERO_INTEGER; NIL != var64; var64 = var64.rest(), var65 = var64.first(), var66 = Numbers.add((SubLObject)ONE_INTEGER, var66)) {
                        final SubLObject var67 = Sequences.cconcatenate(var61, var65);
                        final SubLObject var68 = Filesys.file_write_date(var67);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var65_160 = module0015.$g533$.currentBinding(var60);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var60);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic95$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic148$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var65_161 = module0015.$g533$.currentBinding(var60);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var60);
                                final SubLObject var69 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic150$, var66);
                                module0642.f39068(var69, var66, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            finally {
                                module0015.$g533$.rebind(var65_161, var60);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic95$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic148$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var65_162 = module0015.$g533$.currentBinding(var60);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var60);
                                module0642.f39020(module0015.$g240$.getGlobalValue());
                                module0642.f39019(var65);
                                module0642.f39020(module0015.$g241$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var65_162, var60);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var65_163 = module0015.$g533$.currentBinding(var60);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var60);
                                module0642.f39032((SubLObject)TWO_INTEGER);
                            }
                            finally {
                                module0015.$g533$.rebind(var65_163, var60);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic151$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic148$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var65_164 = module0015.$g533$.currentBinding(var60);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var60);
                                module0642.f39020(module0015.$g230$.getGlobalValue());
                                module0642.f39019(module0051.f3554(var68));
                                module0642.f39020(module0015.$g231$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var65_164, var60);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var65_160, var60);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)UNPROVIDED);
                    }
                }
                finally {
                    module0015.$g533$.rebind(var63, var60);
                }
                module0642.f39020(module0015.$g347$.getGlobalValue());
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41588() {
        final SubLThread var60 = SubLProcess.currentSubLThread();
        final SubLObject var61 = f41509();
        if (NIL != var61 && NIL != Filesys.directory_p(var61)) {
            final SubLObject var62 = f41506(var61);
            if (NIL != var62) {
                module0642.f39026((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g346$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var63 = module0015.$g533$.currentBinding(var60);
                try {
                    module0015.$g533$.bind((SubLObject)T, var60);
                    module0642.f39020(module0015.$g364$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var65_167 = module0015.$g533$.currentBinding(var60);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var60);
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39020(module0015.$g371$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)FOUR_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g370$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)$ic95$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g373$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)$ic148$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var65_168 = module0015.$g533$.currentBinding(var60);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var60);
                            module0642.f39021((SubLObject)$ic152$);
                            module0642.f39032((SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g240$.getGlobalValue());
                            module0642.f39019(var61);
                            module0642.f39020(module0015.$g241$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var65_168, var60);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var65_167, var60);
                    }
                    module0642.f39020(module0015.$g365$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                    SubLObject var64 = (SubLObject)NIL;
                    SubLObject var65 = (SubLObject)NIL;
                    SubLObject var66 = (SubLObject)NIL;
                    var64 = var62;
                    var65 = var64.first();
                    for (var66 = (SubLObject)ZERO_INTEGER; NIL != var64; var64 = var64.rest(), var65 = var64.first(), var66 = Numbers.add((SubLObject)ONE_INTEGER, var66)) {
                        final SubLObject var67 = Sequences.cconcatenate(var61, var65);
                        final SubLObject var68 = Filesys.file_write_date(var67);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var65_169 = module0015.$g533$.currentBinding(var60);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var60);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic95$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic148$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var65_170 = module0015.$g533$.currentBinding(var60);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var60);
                                final SubLObject var69 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic153$, var66);
                                module0642.f39068(var69, var66, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            finally {
                                module0015.$g533$.rebind(var65_170, var60);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic95$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic148$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var65_171 = module0015.$g533$.currentBinding(var60);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var60);
                                module0642.f39020(module0015.$g240$.getGlobalValue());
                                module0642.f39019(var65);
                                module0642.f39020(module0015.$g241$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var65_171, var60);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var65_172 = module0015.$g533$.currentBinding(var60);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var60);
                                module0642.f39032((SubLObject)TWO_INTEGER);
                            }
                            finally {
                                module0015.$g533$.rebind(var65_172, var60);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic151$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic148$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var65_173 = module0015.$g533$.currentBinding(var60);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var60);
                                module0642.f39020(module0015.$g230$.getGlobalValue());
                                module0642.f39019(module0051.f3554(var68));
                                module0642.f39020(module0015.$g231$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var65_173, var60);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var65_169, var60);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)UNPROVIDED);
                    }
                }
                finally {
                    module0015.$g533$.rebind(var63, var60);
                }
                module0642.f39020(module0015.$g347$.getGlobalValue());
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41589(final SubLObject var77) {
        final SubLThread var78 = SubLProcess.currentSubLThread();
        SubLObject var79 = (SubLObject)NIL;
        var78.resetMultipleValues();
        final SubLObject var80 = f41590(var77);
        final SubLObject var81 = var78.secondMultipleValue();
        var78.resetMultipleValues();
        if (NIL != var81) {
            return module0656.f39789((SubLObject)$ic154$, var80, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (NIL != var80) {
            var79 = (SubLObject)ConsesLow.cons(var80, var79);
        }
        SubLObject var83;
        final SubLObject var82 = var83 = f41591(var77);
        SubLObject var84 = (SubLObject)NIL;
        var84 = var83.first();
        while (NIL != var83) {
            var79 = (SubLObject)ConsesLow.cons(var84, var79);
            var83 = var83.rest();
            var84 = var83.first();
        }
        final SubLObject var85 = var83 = f41592(var77);
        var84 = (SubLObject)NIL;
        var84 = var83.first();
        while (NIL != var83) {
            var79 = (SubLObject)ConsesLow.cons(var84, var79);
            var83 = var83.rest();
            var84 = var83.first();
        }
        var79 = Sequences.nreverse(var79);
        if (NIL == var79) {
            return f41582();
        }
        f41556(var79);
        if (NIL != f41593(var77)) {
            module0559.f34430();
        }
        if (NIL != module0035.f1997(var79)) {
            return module0656.f39793((SubLObject)$ic155$, (SubLObject)NIL);
        }
        return module0656.f39793((SubLObject)$ic156$, (SubLObject)NIL);
    }
    
    public static SubLObject f41590(final SubLObject var77) {
        SubLObject var78 = module0642.f39104((SubLObject)$ic144$, var77);
        SubLObject var79 = (SubLObject)NIL;
        if (NIL != var78) {
            var78 = module0038.f2735(var78);
            if (NIL != module0038.f2610(var78)) {
                var78 = (SubLObject)NIL;
            }
        }
        if (NIL != var78) {
            var79 = (SubLObject)makeBoolean(NIL == Filesys.probe_file(var78));
        }
        return Values.values(var78, var79);
    }
    
    public static SubLObject f41593(final SubLObject var77) {
        return module0642.f39104((SubLObject)$ic146$, var77);
    }
    
    public static SubLObject f41591(final SubLObject var77) {
        final SubLObject var78 = f41510();
        if (NIL != var78 && NIL != Filesys.directory_p(var78)) {
            final SubLObject var79 = f41506(var78);
            if (NIL != var79) {
                SubLObject var80 = (SubLObject)NIL;
                SubLObject var81 = var77;
                SubLObject var82 = (SubLObject)NIL;
                var82 = var81.first();
                while (NIL != var81) {
                    if (var82.isCons()) {
                        SubLObject var84;
                        final SubLObject var83 = var84 = var82;
                        SubLObject var85 = (SubLObject)NIL;
                        SubLObject var86 = (SubLObject)NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic158$);
                        var85 = var84.first();
                        var84 = var84.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic158$);
                        var86 = var84.first();
                        var84 = var84.rest();
                        if (NIL == var84) {
                            if (NIL != module0038.f2684(var85, (SubLObject)$ic159$)) {
                                final SubLObject var87 = reader.parse_integer(var86, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                if (var87.isInteger()) {
                                    final SubLObject var88 = ConsesLow.nth(var87, var79);
                                    if (NIL != var88) {
                                        final SubLObject var89 = Sequences.cconcatenate(var78, var88);
                                        if (NIL != Filesys.probe_file(var89)) {
                                            var80 = (SubLObject)ConsesLow.cons(var89, var80);
                                        }
                                    }
                                }
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var83, (SubLObject)$ic158$);
                        }
                    }
                    var81 = var81.rest();
                    var82 = var81.first();
                }
                return Sequences.nreverse(var80);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41592(final SubLObject var77) {
        final SubLObject var78 = f41509();
        if (NIL != var78 && NIL != Filesys.directory_p(var78)) {
            final SubLObject var79 = f41506(var78);
            if (NIL != var79) {
                SubLObject var80 = (SubLObject)NIL;
                SubLObject var81 = var77;
                SubLObject var82 = (SubLObject)NIL;
                var82 = var81.first();
                while (NIL != var81) {
                    if (var82.isCons()) {
                        SubLObject var84;
                        final SubLObject var83 = var84 = var82;
                        SubLObject var85 = (SubLObject)NIL;
                        SubLObject var86 = (SubLObject)NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic158$);
                        var85 = var84.first();
                        var84 = var84.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic158$);
                        var86 = var84.first();
                        var84 = var84.rest();
                        if (NIL == var84) {
                            if (NIL != module0038.f2684(var85, (SubLObject)$ic160$)) {
                                final SubLObject var87 = reader.parse_integer(var86, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                if (var87.isInteger()) {
                                    final SubLObject var88 = ConsesLow.nth(var87, var79);
                                    if (NIL != var88) {
                                        final SubLObject var89 = Sequences.cconcatenate(var78, var88);
                                        if (NIL != Filesys.probe_file(var89)) {
                                            var80 = (SubLObject)ConsesLow.cons(var89, var80);
                                        }
                                    }
                                }
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var83, (SubLObject)$ic158$);
                        }
                    }
                    var81 = var81.rest();
                    var82 = var81.first();
                }
                return Sequences.nreverse(var80);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41594() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41505", "S#45494", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41506", "S#45495", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41507", "S#45496", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41508", "S#45497", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41509", "S#45498", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41510", "S#45499", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41511", "S#45500", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41512", "S#45493", 1, 0, false);
        new $f41512$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41513", "S#45501", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41514", "S#45502", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41515", "S#45503", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41516", "S#45504", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41517", "S#45505", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41518", "S#45506", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41519", "S#45507", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41520", "S#45508", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41521", "S#45509", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41522", "S#45510", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41523", "S#45511", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41524", "S#45512", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41525", "S#45513", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41526", "S#45514", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41527", "S#45515", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41528", "S#45516", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41529", "S#45517", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41530", "S#45518", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41531", "S#45519", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41532", "S#45520", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41535", "S#45521", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41536", "S#45522", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41537", "S#45523", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41538", "S#45524", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41539", "S#45525", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41540", "S#45526", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41541", "S#45527", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41542", "S#45528", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41543", "S#45529", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41544", "S#45530", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41545", "S#45531", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41546", "S#45532", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41547", "S#45533", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41548", "S#45534", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41549", "S#45535", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41550", "S#45536", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41551", "S#45537", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41552", "S#45538", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41553", "S#45539", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41554", "S#45540", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41533", "S#45541", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41534", "S#45542", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41555", "S#45543", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41556", "S#45544", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41557", "S#45545", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41558", "S#45546", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41559", "S#45547", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41560", "SCOPE-PARTITION-ALL-KB-ADDITIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41561", "SCOPE-PARTITION-ALL-ASSERTIONS-IN-HLMT-NAUT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41562", "S#45548", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41563", "S#45549", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41564", "S#45550", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41565", "CB-PARTITION-SAVE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41567", "S#45551", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41566", "S#45552", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41568", "S#45553", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41569", "S#45554", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41570", "S#45555", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41571", "S#45556", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41575", "S#45557", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41572", "S#45558", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41573", "S#45559", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41574", "S#45560", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41576", "CB-HANDLE-PARTITION-SAVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41577", "S#45561", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41578", "S#45562", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41579", "S#45563", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41580", "S#45564", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41581", "CB-PARTITION-LOAD", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41583", "S#45565", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41582", "S#45566", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41584", "S#45567", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41585", "S#45568", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41586", "S#45569", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41587", "S#45570", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41588", "S#45571", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41589", "CB-HANDLE-PARTITION-LOAD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41590", "S#45572", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41593", "S#45573", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41591", "S#45574", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0679", "f41592", "S#45575", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41595() {
        $g5340$ = SubLFiles.deflexical("S#45576", (SubLObject)$ic0$);
        $g5341$ = SubLFiles.defconstant("S#45577", (SubLObject)$ic3$);
        $g5342$ = SubLFiles.deflexical("S#45578", (SubLObject)$ic50$);
        $g5343$ = SubLFiles.defvar("S#45579", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41596() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g5341$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic10$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic11$);
        Structures.def_csetf((SubLObject)$ic12$, (SubLObject)$ic13$);
        Structures.def_csetf((SubLObject)$ic14$, (SubLObject)$ic15$);
        Structures.def_csetf((SubLObject)$ic16$, (SubLObject)$ic17$);
        Structures.def_csetf((SubLObject)$ic18$, (SubLObject)$ic19$);
        Structures.def_csetf((SubLObject)$ic20$, (SubLObject)$ic21$);
        Structures.def_csetf((SubLObject)$ic22$, (SubLObject)$ic23$);
        Structures.def_csetf((SubLObject)$ic24$, (SubLObject)$ic25$);
        Structures.def_csetf((SubLObject)$ic26$, (SubLObject)$ic27$);
        Equality.identity((SubLObject)$ic3$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g5341$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic41$));
        module0002.f38((SubLObject)$ic52$);
        module0002.f38((SubLObject)$ic54$);
        module0012.f441((SubLObject)$ic56$);
        module0015.f873((SubLObject)$ic3$);
        module0656.f39840((SubLObject)$ic61$, (SubLObject)$ic62$, (SubLObject)ONE_INTEGER);
        module0656.f39819((SubLObject)$ic61$, (SubLObject)$ic63$, (SubLObject)$ic64$, (SubLObject)$ic65$);
        Hashtables.sethash((SubLObject)$ic79$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic80$, (SubLObject)NIL));
        module0015.f873((SubLObject)$ic123$);
        module0015.f873((SubLObject)$ic128$);
        module0656.f39840((SubLObject)$ic131$, (SubLObject)$ic132$, (SubLObject)ONE_INTEGER);
        module0656.f39819((SubLObject)$ic131$, (SubLObject)$ic133$, (SubLObject)$ic134$, (SubLObject)$ic135$);
        Hashtables.sethash((SubLObject)$ic139$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic140$, (SubLObject)NIL));
        module0015.f873((SubLObject)$ic157$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f41594();
    }
    
    public void initializeVariables() {
        f41595();
    }
    
    public void runTopLevelForms() {
        f41596();
    }
    
    static {
        me = (SubLFile)new module0679();
        $g5340$ = null;
        $g5341$ = null;
        $g5342$ = null;
        $g5343$ = null;
        $ic0$ = makeString("cpart");
        $ic1$ = makeString(".");
        $ic2$ = makeSymbol("DIRECTORY-P");
        $ic3$ = makeSymbol("CB-PARTITION-SAVE");
        $ic4$ = makeSymbol("S#45493", "CYC");
        $ic5$ = ConsesLow.list((SubLObject)makeSymbol("S#45580", "CYC"), (SubLObject)makeSymbol("S#45581", "CYC"), (SubLObject)makeSymbol("S#45582", "CYC"), (SubLObject)makeSymbol("S#885", "CYC"), (SubLObject)makeSymbol("S#45583", "CYC"), (SubLObject)makeSymbol("S#45584", "CYC"), (SubLObject)makeSymbol("S#45585", "CYC"), (SubLObject)makeSymbol("S#13098", "CYC"));
        $ic6$ = ConsesLow.list((SubLObject)makeKeyword("SPECIFIED-DIRECTORY"), (SubLObject)makeKeyword("PERSONAL-DIRECTORY"), (SubLObject)makeKeyword("PUBLIC-DIRECTORY"), (SubLObject)makeKeyword("FILENAME"), (SubLObject)makeKeyword("PREDEFINED-METHODS"), (SubLObject)makeKeyword("ONTOLOGIES"), (SubLObject)makeKeyword("QUOTED-ONTOLOGIES"), (SubLObject)makeKeyword("TERMS"));
        $ic7$ = ConsesLow.list((SubLObject)makeSymbol("S#45501", "CYC"), (SubLObject)makeSymbol("S#45502", "CYC"), (SubLObject)makeSymbol("S#45503", "CYC"), (SubLObject)makeSymbol("S#45504", "CYC"), (SubLObject)makeSymbol("S#45505", "CYC"), (SubLObject)makeSymbol("S#45506", "CYC"), (SubLObject)makeSymbol("S#45507", "CYC"), (SubLObject)makeSymbol("S#45508", "CYC"));
        $ic8$ = ConsesLow.list((SubLObject)makeSymbol("S#45509", "CYC"), (SubLObject)makeSymbol("S#45510", "CYC"), (SubLObject)makeSymbol("S#45511", "CYC"), (SubLObject)makeSymbol("S#45512", "CYC"), (SubLObject)makeSymbol("S#45513", "CYC"), (SubLObject)makeSymbol("S#45514", "CYC"), (SubLObject)makeSymbol("S#45515", "CYC"), (SubLObject)makeSymbol("S#45516", "CYC"));
        $ic9$ = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $ic10$ = makeSymbol("S#45500", "CYC");
        $ic11$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#45493", "CYC"));
        $ic12$ = makeSymbol("S#45501", "CYC");
        $ic13$ = makeSymbol("S#45509", "CYC");
        $ic14$ = makeSymbol("S#45502", "CYC");
        $ic15$ = makeSymbol("S#45510", "CYC");
        $ic16$ = makeSymbol("S#45503", "CYC");
        $ic17$ = makeSymbol("S#45511", "CYC");
        $ic18$ = makeSymbol("S#45504", "CYC");
        $ic19$ = makeSymbol("S#45512", "CYC");
        $ic20$ = makeSymbol("S#45505", "CYC");
        $ic21$ = makeSymbol("S#45513", "CYC");
        $ic22$ = makeSymbol("S#45506", "CYC");
        $ic23$ = makeSymbol("S#45514", "CYC");
        $ic24$ = makeSymbol("S#45507", "CYC");
        $ic25$ = makeSymbol("S#45515", "CYC");
        $ic26$ = makeSymbol("S#45508", "CYC");
        $ic27$ = makeSymbol("S#45516", "CYC");
        $ic28$ = makeKeyword("SPECIFIED-DIRECTORY");
        $ic29$ = makeKeyword("PERSONAL-DIRECTORY");
        $ic30$ = makeKeyword("PUBLIC-DIRECTORY");
        $ic31$ = makeKeyword("FILENAME");
        $ic32$ = makeKeyword("PREDEFINED-METHODS");
        $ic33$ = makeKeyword("ONTOLOGIES");
        $ic34$ = makeKeyword("QUOTED-ONTOLOGIES");
        $ic35$ = makeKeyword("TERMS");
        $ic36$ = makeString("Invalid slot ~S for construction function");
        $ic37$ = makeKeyword("BEGIN");
        $ic38$ = makeSymbol("S#45517", "CYC");
        $ic39$ = makeKeyword("SLOT");
        $ic40$ = makeKeyword("END");
        $ic41$ = makeSymbol("S#45519", "CYC");
        $ic42$ = makeSymbol("STRINGP");
        $ic43$ = makeSymbol("LISTP");
        $ic44$ = makeKeyword("FUNCTION");
        $ic45$ = makeKeyword("ONTOLOGY");
        $ic46$ = makeKeyword("QUOTED-ONTOLOGY");
        $ic47$ = makeKeyword("TERM");
        $ic48$ = makeSymbol("FORT-P");
        $ic49$ = makeString("");
        $ic50$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("SCOPE-PARTITION-ALL-KB-ADDITIONS"), (SubLObject)makeString("All additions to this KB since it was initially built.")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("SCOPE-PARTITION-ALL-ASSERTIONS-IN-HLMT-NAUT"), (SubLObject)makeString("All assertions in MT space microtheories.")));
        $ic51$ = makeSymbol("FIRST");
        $ic52$ = makeSymbol("SCOPE-PARTITION-ALL-KB-ADDITIONS");
        $ic53$ = makeKeyword("SKIP");
        $ic54$ = makeSymbol("SCOPE-PARTITION-ALL-ASSERTIONS-IN-HLMT-NAUT");
        $ic55$ = makeString("Scoping assertions in microtheories that are a HLMT NAUT.");
        $ic56$ = makeSymbol("S#45579", "CYC");
        $ic57$ = makeSymbol("S#38", "CYC");
        $ic58$ = makeString("[Partition Save]");
        $ic59$ = makeKeyword("MAIN");
        $ic60$ = makeString("cb-partition-save");
        $ic61$ = makeKeyword("PARTITION-SAVE");
        $ic62$ = makeSymbol("S#45551", "CYC");
        $ic63$ = makeString("Partition Save");
        $ic64$ = makeString("PartSave");
        $ic65$ = makeString("Save out a KB partition");
        $ic66$ = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $ic67$ = makeKeyword("CB-CYC");
        $ic68$ = makeString("stylesheet");
        $ic69$ = makeString("text/css");
        $ic70$ = makeKeyword("SHA1");
        $ic71$ = makeString("text/javascript");
        $ic72$ = makeString("yui-skin-sam");
        $ic73$ = makeString("reloadFrameButton");
        $ic74$ = makeString("button");
        $ic75$ = makeString("reload");
        $ic76$ = makeString("Refresh Frames");
        $ic77$ = makeString("post");
        $ic78$ = makeString("cb-handle-partition-save");
        $ic79$ = makeKeyword("CB-PARTITION-SAVE");
        $ic80$ = makeString("cb-partition-save.html");
        $ic81$ = makeString("Reset Form");
        $ic82$ = makeString("Update Partition Scope");
        $ic83$ = makeString("update");
        $ic84$ = makeString("Save Partition");
        $ic85$ = makeString("save");
        $ic86$ = makeString("Partition Filename");
        $ic87$ = makeString("Choose or specify a directory :");
        $ic88$ = makeString("directory");
        $ic89$ = makeString("personal");
        $ic90$ = makeString("public");
        $ic91$ = makeString("specified_directory");
        $ic92$ = makeString("specified");
        $ic93$ = makeInteger(60);
        $ic94$ = makeString("Clear");
        $ic95$ = makeKeyword("LEFT");
        $ic96$ = makeString("Specify the filename :");
        $ic97$ = makeString("Extension");
        $ic98$ = makeString("partition_filename");
        $ic99$ = makeInteger(40);
        $ic100$ = makeString("Partition Scope");
        $ic101$ = makeString("Clear Partition Scope");
        $ic102$ = makeString("reset_scope");
        $ic103$ = makeString("Predefined Methods : ");
        $ic104$ = makeString("method-~A");
        $ic105$ = makeString("Ontologies (instances and specs) : ");
        $ic106$ = makeString("None");
        $ic107$ = makeString("ontology-~A");
        $ic108$ = makeString("Add Ontology :");
        $ic109$ = makeString("ontology");
        $ic110$ = makeString("Complete");
        $ic111$ = constant_handles_oc.f8479((SubLObject)makeString("Collection"));
        $ic112$ = makeString("Quoted Ontologies (quoted instances) : ");
        $ic113$ = makeString("quoted-ontology-~A");
        $ic114$ = makeString("Add Quoted Ontology :");
        $ic115$ = makeString("quoted-ontology");
        $ic116$ = makeString("Terms : ");
        $ic117$ = makeString("term-~A");
        $ic118$ = makeString("Add Term : ");
        $ic119$ = makeString("term");
        $ic120$ = makeKeyword("ERROR");
        $ic121$ = makeString("~S does not specify a Cyc collection.");
        $ic122$ = makeString("Partition has been saved.");
        $ic123$ = makeSymbol("CB-HANDLE-PARTITION-SAVE");
        $ic124$ = makeString("method-");
        $ic125$ = makeString("ontology-");
        $ic126$ = makeString("quoted-ontology-");
        $ic127$ = makeString("term-");
        $ic128$ = makeSymbol("CB-PARTITION-LOAD");
        $ic129$ = makeString("[Partition Load]");
        $ic130$ = makeString("cb-partition-load");
        $ic131$ = makeKeyword("PARTITION-LOAD");
        $ic132$ = makeSymbol("S#45565", "CYC");
        $ic133$ = makeString("Partition Load");
        $ic134$ = makeString("PartLoad");
        $ic135$ = makeString("Load a KB partition");
        $ic136$ = makeString("the Partition Load page");
        $ic137$ = makeString("cb-handle-partition-load");
        $ic138$ = makeString("Specify or select one or more partitions to load.");
        $ic139$ = makeKeyword("CB-PARTITION-LOAD");
        $ic140$ = makeString("cb-partition-load.html");
        $ic141$ = makeString("Load Partitions");
        $ic142$ = makeString("load");
        $ic143$ = makeString("Full pathname of a partition file to load :");
        $ic144$ = makeString("specified_filename");
        $ic145$ = makeInteger(80);
        $ic146$ = makeString("finalize");
        $ic147$ = makeString(" Clean up after load.  (Only uncheck when more partitions will be loaded after these and those partitions depend on these.)");
        $ic148$ = makeKeyword("TOP");
        $ic149$ = makeString("Personal partitions from");
        $ic150$ = makeString("personal-~A");
        $ic151$ = makeKeyword("RIGHT");
        $ic152$ = makeString("Public partitions from");
        $ic153$ = makeString("public-~A");
        $ic154$ = makeString("The specified filename ~S could not be found.");
        $ic155$ = makeString("Partition has been loaded.");
        $ic156$ = makeString("Partition files have been loaded.");
        $ic157$ = makeSymbol("CB-HANDLE-PARTITION-LOAD");
        $ic158$ = ConsesLow.list((SubLObject)makeSymbol("S#7692", "CYC"), (SubLObject)makeSymbol("S#132", "CYC"));
        $ic159$ = makeString("personal-");
        $ic160$ = makeString("public-");
    }
    
    public static final class $cb_partition_save_native extends SubLStructNative
    {
        public SubLObject $specified_directory;
        public SubLObject $personal_directory;
        public SubLObject $public_directory;
        public SubLObject $filename;
        public SubLObject $predefined_methods;
        public SubLObject $ontologies;
        public SubLObject $quoted_ontologies;
        public SubLObject $terms;
        public static final SubLStructDeclNative structDecl;
        
        public $cb_partition_save_native() {
            this.$specified_directory = (SubLObject)CommonSymbols.NIL;
            this.$personal_directory = (SubLObject)CommonSymbols.NIL;
            this.$public_directory = (SubLObject)CommonSymbols.NIL;
            this.$filename = (SubLObject)CommonSymbols.NIL;
            this.$predefined_methods = (SubLObject)CommonSymbols.NIL;
            this.$ontologies = (SubLObject)CommonSymbols.NIL;
            this.$quoted_ontologies = (SubLObject)CommonSymbols.NIL;
            this.$terms = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$cb_partition_save_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$specified_directory;
        }
        
        public SubLObject getField3() {
            return this.$personal_directory;
        }
        
        public SubLObject getField4() {
            return this.$public_directory;
        }
        
        public SubLObject getField5() {
            return this.$filename;
        }
        
        public SubLObject getField6() {
            return this.$predefined_methods;
        }
        
        public SubLObject getField7() {
            return this.$ontologies;
        }
        
        public SubLObject getField8() {
            return this.$quoted_ontologies;
        }
        
        public SubLObject getField9() {
            return this.$terms;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$specified_directory = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$personal_directory = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$public_directory = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$filename = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$predefined_methods = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$ontologies = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$quoted_ontologies = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$terms = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$cb_partition_save_native.class, $ic3$, $ic4$, $ic5$, $ic6$, new String[] { "$specified_directory", "$personal_directory", "$public_directory", "$filename", "$predefined_methods", "$ontologies", "$quoted_ontologies", "$terms" }, $ic7$, $ic8$, $ic9$);
        }
    }
    
    public static final class $f41512$UnaryFunction extends UnaryFunction
    {
        public $f41512$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#45493"));
        }
        
        public SubLObject processItem(final SubLObject var10) {
            return f41512(var10);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 930 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/