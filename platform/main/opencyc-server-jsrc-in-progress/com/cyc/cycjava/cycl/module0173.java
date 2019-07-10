package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0173 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0173";
    public static final String myFingerPrint = "0cb1dcbec91f638896ec3e504bc4469be5e8e5e535cee92e1195144bda4d4d4f";
    public static SubLSymbol $g2191$;
    private static SubLSymbol $g2192$;
    private static final SubLSymbol $ic0$;
    private static final SubLList $ic1$;
    private static final SubLString $ic2$;
    private static final SubLList $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLList $ic5$;
    private static final SubLString $ic6$;
    private static final SubLList $ic7$;
    private static final SubLList $ic8$;
    private static final SubLList $ic9$;
    private static final SubLString $ic10$;
    private static final SubLList $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLList $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLList $ic23$;
    private static final SubLList $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLString $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLString $ic32$;
    private static final SubLList $ic33$;
    private static final SubLString $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLString $ic36$;
    private static final SubLList $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLList $ic40$;
    private static final SubLList $ic41$;
    private static final SubLList $ic42$;
    private static final SubLList $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLList $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLString $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLString $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLString $ic61$;
    private static final SubLString $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLList $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLList $ic67$;
    private static final SubLList $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLList $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLList $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLList $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLInteger $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLString $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLString $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLString $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLString $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLString $ic103$;
    
    public static SubLObject f10955(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != constant_handles_oc.f8449(var1) || NIL != module0167.f10813(var1));
    }
    
    public static SubLObject f10956(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL == f10955(var1));
    }
    
    public static SubLObject f10957(final SubLObject var1) {
        return module0035.f2192((SubLObject)$ic0$, var1);
    }
    
    public static SubLObject f10958(final SubLObject var3) {
        assert NIL != f10955(var3) : var3;
        if (NIL != constant_handles_oc.f8449(var3)) {
            return var3;
        }
        return module0172.f10920(var3);
    }
    
    public static SubLObject f10959() {
        return module0052.f3749((SubLObject)ConsesLow.list(constant_handles_oc.f8423(), module0167.f10786()));
    }
    
    public static SubLObject f10960(final SubLObject var4, final SubLObject var5) {
        SubLObject var7;
        final SubLObject var6 = var7 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)$ic9$);
        final SubLObject var8 = var7.rest();
        var7 = var7.first();
        SubLObject var9 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)$ic9$);
        var9 = var7.first();
        var7 = var7.rest();
        final SubLObject var10 = (SubLObject)(var7.isCons() ? var7.first() : $ic10$);
        cdestructuring_bind.destructuring_bind_must_listp(var7, var6, (SubLObject)$ic9$);
        var7 = var7.rest();
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = var7;
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14_15 = (SubLObject)NIL;
        while (NIL != var12) {
            cdestructuring_bind.destructuring_bind_must_consp(var12, var6, (SubLObject)$ic9$);
            var14_15 = var12.first();
            var12 = var12.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var12, var6, (SubLObject)$ic9$);
            if (NIL == conses_high.member(var14_15, (SubLObject)$ic11$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var13 = (SubLObject)T;
            }
            if (var14_15 == $ic12$) {
                var11 = var12.first();
            }
            var12 = var12.rest();
        }
        if (NIL != var13 && NIL == var11) {
            cdestructuring_bind.cdestructuring_bind_error(var6, (SubLObject)$ic9$);
        }
        final SubLObject var14 = cdestructuring_bind.property_list_member((SubLObject)$ic13$, var7);
        final SubLObject var15 = (SubLObject)((NIL != var14) ? conses_high.cadr(var14) : NIL);
        final SubLObject var16;
        var7 = (var16 = var8);
        if (NIL == var10) {
            final SubLObject var17 = (SubLObject)$ic14$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic15$, (SubLObject)ConsesLow.list(var17, (SubLObject)$ic16$, (SubLObject)$ic13$, var15), (SubLObject)ConsesLow.listS((SubLObject)$ic17$, (SubLObject)ConsesLow.list(var9, var17, (SubLObject)$ic18$, (SubLObject)NIL, (SubLObject)$ic13$, var15), ConsesLow.append(var16, (SubLObject)NIL)));
        }
        final SubLObject var18 = (SubLObject)$ic19$;
        final SubLObject var19 = (SubLObject)$ic20$;
        final SubLObject var20 = (SubLObject)$ic21$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic22$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var18, var10), reader.bq_cons(var19, (SubLObject)$ic23$), reader.bq_cons(var20, (SubLObject)$ic24$)), (SubLObject)ConsesLow.list((SubLObject)$ic25$, var18, (SubLObject)ConsesLow.listS((SubLObject)$ic26$, (SubLObject)ConsesLow.list(var9, (SubLObject)NIL, (SubLObject)$ic13$, var15), (SubLObject)ConsesLow.list((SubLObject)$ic27$, var20), (SubLObject)ConsesLow.list((SubLObject)$ic28$, var20, var19), ConsesLow.append(var16, (SubLObject)NIL))));
    }
    
    public static SubLObject f10961() {
        return (SubLObject)ConsesLow.list(constant_handles_oc.f8425(), module0167.f10788());
    }
    
    public static SubLObject f10962() {
        return Numbers.add(constant_handles_oc.f8433(), module0167.f10796());
    }
    
    public static SubLObject f10963() {
        final SubLObject var23 = f10962();
        final SubLObject var24 = random.random(var23);
        final SubLObject var25 = constant_handles_oc.f8433();
        if (var24.numL(var25)) {
            return constants_high_oc.f10773((SubLObject)UNPROVIDED);
        }
        return module0172.f10923((SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f10964(final SubLObject var3) {
        if (NIL != constant_handles_oc.f8449(var3)) {
            return module0165.f10719(var3);
        }
        if (NIL != module0167.f10813(var3)) {
            return module0171.f10901(var3);
        }
        Errors.error((SubLObject)$ic34$, var3);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10965(final SubLObject var3, final SubLObject var26) {
        assert NIL != f10955(var3) : var3;
        if (NIL != constant_handles_oc.f8449(var3)) {
            return module0165.f10725(var3, var26);
        }
        return module0171.f10910(var3, var26);
    }
    
    public static SubLObject f10966(final SubLObject var3) {
        return f10965(var3, module0212.f13757());
    }
    
    public static SubLObject f10967(final SubLObject var3) {
        if (NIL != constant_handles_oc.f8449(var3)) {
            return constants_high_oc.f10749(var3);
        }
        return module0048.f_1_(Numbers.minus(module0167.f10803(var3)));
    }
    
    public static SubLObject f10968(final SubLObject var3) {
        if (NIL != constant_handles_oc.f8449(var3)) {
            return constants_high_oc.f10757(var3);
        }
        return module0048.f_1_(Numbers.minus(module0167.f10803(var3)));
    }
    
    public static SubLObject f10969(final SubLObject var3) {
        if (NIL != constant_handles_oc.f8449(var3)) {
            return constant_handles_oc.f8463(var3, (SubLObject)UNPROVIDED);
        }
        if (NIL != module0167.f10813(var3)) {
            return module0167.f10824(var3, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10970(final SubLObject var3) {
        if (NIL != constant_handles_oc.f8449(var3)) {
            return constant_handles_oc.f8464(var3);
        }
        if (NIL != module0167.f10813(var3)) {
            return module0167.f10825(var3);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10971(final SubLObject var3) {
        if (NIL != constant_handles_oc.f8449(var3)) {
            return constant_handles_oc.f8467(var3, (SubLObject)UNPROVIDED);
        }
        if (NIL != module0167.f10813(var3)) {
            return module0172.f10918(var3, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10972(final SubLObject var3) {
        if (NIL != constant_handles_oc.f8449(var3)) {
            return constant_handles_oc.f8468(var3);
        }
        if (NIL != module0167.f10813(var3)) {
            return module0172.f10919(var3);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10973(final SubLObject var3) {
        assert NIL != f10955(var3) : var3;
        if (NIL != constant_handles_oc.f8449(var3)) {
            return constants_high_oc.f10741(var3);
        }
        return module0172.f10929(var3);
    }
    
    public static SubLObject f10974(final SubLObject var27, final SubLObject var28) {
        f10975(var27, var28, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10976(final SubLObject var27) {
        return (SubLObject)((var27.getClass() == $sX13756_native.class) ? T : NIL);
    }
    
    public static SubLObject f10977(final SubLObject var27) {
        assert NIL != f10976(var27) : var27;
        return var27.getField2();
    }
    
    public static SubLObject f10978(final SubLObject var27) {
        assert NIL != f10976(var27) : var27;
        return var27.getField3();
    }
    
    public static SubLObject f10979(final SubLObject var27, final SubLObject var29) {
        assert NIL != f10976(var27) : var27;
        return var27.setField2(var29);
    }
    
    public static SubLObject f10980(final SubLObject var27, final SubLObject var29) {
        assert NIL != f10976(var27) : var27;
        return var27.setField3(var29);
    }
    
    public static SubLObject f10981(SubLObject var30) {
        if (var30 == UNPROVIDED) {
            var30 = (SubLObject)NIL;
        }
        final SubLObject var31 = (SubLObject)new $sX13756_native();
        SubLObject var32;
        SubLObject var33;
        SubLObject var34;
        SubLObject var35;
        for (var32 = (SubLObject)NIL, var32 = var30; NIL != var32; var32 = conses_high.cddr(var32)) {
            var33 = var32.first();
            var34 = conses_high.cadr(var32);
            var35 = var33;
            if (var35.eql((SubLObject)$ic51$)) {
                f10979(var31, var34);
            }
            else if (var35.eql((SubLObject)$ic52$)) {
                f10980(var31, var34);
            }
            else {
                Errors.error((SubLObject)$ic53$, var33);
            }
        }
        return var31;
    }
    
    public static SubLObject f10982(final SubLObject var36, final SubLObject var37) {
        Functions.funcall(var37, var36, (SubLObject)$ic54$, (SubLObject)$ic55$, (SubLObject)TWO_INTEGER);
        Functions.funcall(var37, var36, (SubLObject)$ic56$, (SubLObject)$ic51$, f10977(var36));
        Functions.funcall(var37, var36, (SubLObject)$ic56$, (SubLObject)$ic52$, f10978(var36));
        Functions.funcall(var37, var36, (SubLObject)$ic57$, (SubLObject)$ic55$, (SubLObject)TWO_INTEGER);
        return var36;
    }
    
    public static SubLObject f10983(final SubLObject var36, final SubLObject var37) {
        return f10982(var36, var37);
    }
    
    public static SubLObject f10975(final SubLObject var38, final SubLObject var28, final SubLObject var39) {
        final SubLThread var40 = SubLProcess.currentSubLThread();
        if (NIL != print_high.$print_readably$.getDynamicValue(var40)) {
            print_high.print_not_readable(var38, var28);
        }
        else {
            streams_high.write_string((SubLObject)$ic59$, var28, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            PrintLow.write((SubLObject)Types.type_of(var38), new SubLObject[] { $ic60$, var28 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var28);
            streams_high.write_string((SubLObject)$ic61$, var28, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            print_high.princ(f10977(var38), var28);
            streams_high.write_string((SubLObject)$ic62$, var28, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            print_high.princ(f10978(var38), var28);
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var28);
        }
        return var38;
    }
    
    public static SubLObject f10984(final SubLObject var4, final SubLObject var5) {
        SubLObject var7;
        final SubLObject var6 = var7 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)$ic64$);
        final SubLObject var8 = var7.rest();
        var7 = var7.first();
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)$ic64$);
        var9 = var7.first();
        var7 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)$ic64$);
        var10 = var7.first();
        var7 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)$ic64$);
        var11 = var7.first();
        var7 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)$ic64$);
        var12 = var7.first();
        var7 = var7.rest();
        if (NIL == var7) {
            final SubLObject var13;
            var7 = (var13 = var8);
            return (SubLObject)ConsesLow.list((SubLObject)$ic65$, (SubLObject)ConsesLow.listS((SubLObject)$ic66$, var11, (SubLObject)$ic67$), (SubLObject)ConsesLow.listS((SubLObject)$ic66$, var12, (SubLObject)$ic68$), (SubLObject)ConsesLow.list((SubLObject)$ic69$, (SubLObject)ConsesLow.list((SubLObject)$ic70$, var11), (SubLObject)ConsesLow.listS((SubLObject)$ic22$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var9, (SubLObject)ConsesLow.list((SubLObject)$ic71$, (SubLObject)ConsesLow.list((SubLObject)$ic72$, var11), (SubLObject)ConsesLow.list((SubLObject)$ic47$, var12), (SubLObject)ConsesLow.list((SubLObject)$ic49$, var12))), (SubLObject)ConsesLow.list(var10, (SubLObject)ConsesLow.list((SubLObject)$ic71$, (SubLObject)ConsesLow.list((SubLObject)$ic72$, var11), (SubLObject)ConsesLow.list((SubLObject)$ic73$, var11), (SubLObject)ConsesLow.list((SubLObject)$ic74$, var11)))), ConsesLow.append(var13, (SubLObject)NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var6, (SubLObject)$ic64$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10985() {
        final SubLObject var38 = f10981((SubLObject)UNPROVIDED);
        f10979(var38, f10986());
        f10980(var38, f10987());
        return var38;
    }
    
    public static SubLObject f10988(final SubLObject var38) {
        assert NIL != f10976(var38) : var38;
        return Numbers.add(module0065.f4733(f10977(var38)), module0065.f4733(f10978(var38)));
    }
    
    public static SubLObject f10989(final SubLObject var38) {
        assert NIL != f10976(var38) : var38;
        return Equality.eq(f10988(var38), (SubLObject)ZERO_INTEGER);
    }
    
    public static SubLObject f10990(final SubLObject var38, final SubLObject var3) {
        SubLObject var39 = (SubLObject)NIL;
        assert NIL != f10955(var3) : var3;
        assert NIL != f10976(var38) : var38;
        if (NIL != f10969(var3)) {
            final SubLObject var40 = (NIL != constant_handles_oc.f8449(var3)) ? f10977(var38) : f10978(var38);
            final SubLObject var41 = (NIL != constant_handles_oc.f8449(var3)) ? constants_high_oc.f10749(var3) : module0167.f10803(var3);
            var39 = module0065.f4750(var40, var41, (SubLObject)UNPROVIDED);
        }
        return var39;
    }
    
    public static SubLObject f10991(final SubLObject var38, final SubLObject var3, final SubLObject var1) {
        assert NIL != f10955(var3) : var3;
        assert NIL != f10976(var38) : var38;
        if (NIL != f10969(var3)) {
            final SubLObject var39 = (NIL != constant_handles_oc.f8449(var3)) ? f10977(var38) : f10978(var38);
            final SubLObject var40 = (NIL != constant_handles_oc.f8449(var3)) ? constants_high_oc.f10749(var3) : module0167.f10803(var3);
            module0065.f4753(var39, var40, var1);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10992(final SubLObject var38, final SubLObject var3) {
        assert NIL != f10955(var3) : var3;
        assert NIL != f10976(var38) : var38;
        if (NIL != f10969(var3)) {
            final SubLObject var39 = (NIL != constant_handles_oc.f8449(var3)) ? f10977(var38) : f10978(var38);
            final SubLObject var40 = (NIL != constant_handles_oc.f8449(var3)) ? constants_high_oc.f10749(var3) : module0167.f10803(var3);
            module0065.f4761(var39, var40);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10993(final SubLObject var38) {
        assert NIL != f10976(var38) : var38;
        module0065.f4762(f10977(var38));
        module0065.f4762(f10978(var38));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10994(final SubLObject var38) {
        assert NIL != f10976(var38) : var38;
        module0065.f4760(f10977(var38), (SubLObject)UNPROVIDED);
        module0065.f4760(f10978(var38), (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f10995(final SubLObject var38) {
        assert NIL != f10976(var38) : var38;
        return (SubLObject)makeBoolean(NIL != module0065.f4790(f10977(var38)) && NIL != module0065.f4790(f10978(var38)));
    }
    
    public static SubLObject f10986() {
        return module0065.f4745(constants_high_oc.f10756(), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f10987() {
        return module0065.f4745(module0167.f10799(), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f10996(final SubLObject var4, final SubLObject var5) {
        SubLObject var7;
        final SubLObject var6 = var7 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)$ic75$);
        final SubLObject var8 = var7.rest();
        var7 = var7.first();
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var11 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)$ic75$);
        var9 = var7.first();
        var7 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)$ic75$);
        var10 = var7.first();
        var7 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)$ic75$);
        var11 = var7.first();
        var7 = var7.rest();
        SubLObject var12 = (SubLObject)NIL;
        SubLObject var13 = var7;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var59_60 = (SubLObject)NIL;
        while (NIL != var13) {
            cdestructuring_bind.destructuring_bind_must_consp(var13, var6, (SubLObject)$ic75$);
            var59_60 = var13.first();
            var13 = var13.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var13, var6, (SubLObject)$ic75$);
            if (NIL == conses_high.member(var59_60, (SubLObject)$ic11$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var14 = (SubLObject)T;
            }
            if (var59_60 == $ic12$) {
                var12 = var13.first();
            }
            var13 = var13.rest();
        }
        if (NIL != var14 && NIL == var12) {
            cdestructuring_bind.cdestructuring_bind_error(var6, (SubLObject)$ic75$);
        }
        final SubLObject var15 = cdestructuring_bind.property_list_member((SubLObject)$ic13$, var7);
        final SubLObject var16 = (SubLObject)((NIL != var15) ? conses_high.cadr(var15) : NIL);
        final SubLObject var17;
        var7 = (var17 = var8);
        final SubLObject var18 = (SubLObject)$ic76$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic22$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var18, var11)), (SubLObject)ConsesLow.listS((SubLObject)$ic77$, (SubLObject)ConsesLow.list(var9, var10, var18, (SubLObject)$ic13$, var16), ConsesLow.append(var17, (SubLObject)NIL)), (SubLObject)ConsesLow.listS((SubLObject)$ic78$, (SubLObject)ConsesLow.list(var9, var10, var18, (SubLObject)$ic13$, var16), ConsesLow.append(var17, (SubLObject)NIL)));
    }
    
    public static SubLObject f10997(final SubLObject var4, final SubLObject var5) {
        SubLObject var7;
        final SubLObject var6 = var7 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)$ic80$);
        final SubLObject var8 = var7.rest();
        var7 = var7.first();
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var11 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)$ic80$);
        var9 = var7.first();
        var7 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)$ic80$);
        var10 = var7.first();
        var7 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)$ic80$);
        var11 = var7.first();
        var7 = var7.rest();
        SubLObject var12 = (SubLObject)NIL;
        SubLObject var13 = var7;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var70_71 = (SubLObject)NIL;
        while (NIL != var13) {
            cdestructuring_bind.destructuring_bind_must_consp(var13, var6, (SubLObject)$ic80$);
            var70_71 = var13.first();
            var13 = var13.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var13, var6, (SubLObject)$ic80$);
            if (NIL == conses_high.member(var70_71, (SubLObject)$ic11$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var14 = (SubLObject)T;
            }
            if (var70_71 == $ic12$) {
                var12 = var13.first();
            }
            var13 = var13.rest();
        }
        if (NIL != var14 && NIL == var12) {
            cdestructuring_bind.cdestructuring_bind_error(var6, (SubLObject)$ic80$);
        }
        final SubLObject var15 = cdestructuring_bind.property_list_member((SubLObject)$ic13$, var7);
        final SubLObject var16 = (SubLObject)((NIL != var15) ? conses_high.cadr(var15) : NIL);
        final SubLObject var17;
        var7 = (var17 = var8);
        final SubLObject var18 = (SubLObject)$ic81$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic82$, (SubLObject)ConsesLow.list(var18, var10, (SubLObject)ConsesLow.list((SubLObject)$ic83$, var11), (SubLObject)$ic13$, var16), (SubLObject)ConsesLow.list((SubLObject)$ic22$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var9, (SubLObject)ConsesLow.list((SubLObject)$ic84$, var18))), (SubLObject)ConsesLow.listS((SubLObject)$ic69$, var9, ConsesLow.append(var17, (SubLObject)NIL))));
    }
    
    public static SubLObject f10998(final SubLObject var38) {
        return f10977(var38);
    }
    
    public static SubLObject f10999(final SubLObject var4, final SubLObject var5) {
        SubLObject var7;
        final SubLObject var6 = var7 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)$ic85$);
        final SubLObject var8 = var7.rest();
        var7 = var7.first();
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var11 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)$ic85$);
        var9 = var7.first();
        var7 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)$ic85$);
        var10 = var7.first();
        var7 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)$ic85$);
        var11 = var7.first();
        var7 = var7.rest();
        SubLObject var12 = (SubLObject)NIL;
        SubLObject var13 = var7;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var80_81 = (SubLObject)NIL;
        while (NIL != var13) {
            cdestructuring_bind.destructuring_bind_must_consp(var13, var6, (SubLObject)$ic85$);
            var80_81 = var13.first();
            var13 = var13.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var13, var6, (SubLObject)$ic85$);
            if (NIL == conses_high.member(var80_81, (SubLObject)$ic11$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var14 = (SubLObject)T;
            }
            if (var80_81 == $ic12$) {
                var12 = var13.first();
            }
            var13 = var13.rest();
        }
        if (NIL != var14 && NIL == var12) {
            cdestructuring_bind.cdestructuring_bind_error(var6, (SubLObject)$ic85$);
        }
        final SubLObject var15 = cdestructuring_bind.property_list_member((SubLObject)$ic13$, var7);
        final SubLObject var16 = (SubLObject)((NIL != var15) ? conses_high.cadr(var15) : NIL);
        final SubLObject var17;
        var7 = (var17 = var8);
        final SubLObject var18 = (SubLObject)$ic86$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic82$, (SubLObject)ConsesLow.list(var18, var10, (SubLObject)ConsesLow.list((SubLObject)$ic87$, var11), (SubLObject)$ic13$, var16), (SubLObject)ConsesLow.list((SubLObject)$ic22$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var9, (SubLObject)ConsesLow.list((SubLObject)$ic88$, var18))), (SubLObject)ConsesLow.listS((SubLObject)$ic69$, var9, ConsesLow.append(var17, (SubLObject)NIL))));
    }
    
    public static SubLObject f11000(final SubLObject var38) {
        return f10978(var38);
    }
    
    public static SubLObject f11001(final SubLObject var1, final SubLObject var28) {
        return f11002(var1, var28);
    }
    
    public static SubLObject f11002(final SubLObject var38, final SubLObject var28) {
        module0021.f1086($g2192$.getGlobalValue(), var28);
        final SubLObject var39 = f10988(var38);
        module0021.f1038(var39, var28);
        SubLObject var40 = f10998(var38);
        if (NIL == module0065.f4772(var40, (SubLObject)$ic92$)) {
            final SubLObject var86_87 = var40;
            if (NIL == module0065.f4775(var86_87, (SubLObject)$ic92$)) {
                final SubLObject var41 = module0065.f4740(var86_87);
                final SubLObject var42 = (SubLObject)NIL;
                SubLObject var43;
                SubLObject var44;
                SubLObject var45;
                SubLObject var46;
                SubLObject var47;
                for (var43 = Sequences.length(var41), var44 = (SubLObject)NIL, var44 = (SubLObject)ZERO_INTEGER; var44.numL(var43); var44 = Numbers.add(var44, (SubLObject)ONE_INTEGER)) {
                    var45 = ((NIL != var42) ? Numbers.subtract(var43, var44, (SubLObject)ONE_INTEGER) : var44);
                    var46 = Vectors.aref(var41, var45);
                    if (NIL == module0065.f4749(var46) || NIL == module0065.f4773((SubLObject)$ic92$)) {
                        if (NIL != module0065.f4749(var46)) {
                            var46 = (SubLObject)$ic92$;
                        }
                        var47 = constants_high_oc.f10752(var45);
                        if (NIL != var47) {
                            module0021.f1038(var47, var28);
                            module0021.f1038(var46, var28);
                        }
                    }
                }
            }
            final SubLObject var93_94 = var40;
            if (NIL == module0065.f4777(var93_94)) {
                final SubLObject var48 = module0065.f4738(var93_94);
                SubLObject var49 = (SubLObject)NIL;
                SubLObject var50 = (SubLObject)NIL;
                final Iterator var51 = Hashtables.getEntrySetIterator(var48);
                try {
                    while (Hashtables.iteratorHasNext(var51)) {
                        final Map.Entry var52 = Hashtables.iteratorNextEntry(var51);
                        var49 = Hashtables.getEntryKey(var52);
                        var50 = Hashtables.getEntryValue(var52);
                        final SubLObject var53 = constants_high_oc.f10752(var49);
                        if (NIL != var53) {
                            module0021.f1038(var53, var28);
                            module0021.f1038(var50, var28);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var51);
                }
            }
        }
        var40 = f11000(var38);
        if (NIL == module0065.f4772(var40, (SubLObject)$ic92$)) {
            final SubLObject var86_88 = var40;
            if (NIL == module0065.f4775(var86_88, (SubLObject)$ic92$)) {
                final SubLObject var41 = module0065.f4740(var86_88);
                final SubLObject var42 = (SubLObject)NIL;
                SubLObject var43;
                SubLObject var44;
                SubLObject var46;
                SubLObject var47;
                SubLObject var54;
                for (var43 = Sequences.length(var41), var44 = (SubLObject)NIL, var44 = (SubLObject)ZERO_INTEGER; var44.numL(var43); var44 = Numbers.add(var44, (SubLObject)ONE_INTEGER)) {
                    var54 = ((NIL != var42) ? Numbers.subtract(var43, var44, (SubLObject)ONE_INTEGER) : var44);
                    var46 = Vectors.aref(var41, var54);
                    if (NIL == module0065.f4749(var46) || NIL == module0065.f4773((SubLObject)$ic92$)) {
                        if (NIL != module0065.f4749(var46)) {
                            var46 = (SubLObject)$ic92$;
                        }
                        var47 = module0167.f10832(var54);
                        if (NIL != var47) {
                            module0021.f1038(var47, var28);
                            module0021.f1038(var46, var28);
                        }
                    }
                }
            }
            final SubLObject var93_95 = var40;
            if (NIL == module0065.f4777(var93_95)) {
                final SubLObject var48 = module0065.f4738(var93_95);
                SubLObject var55 = (SubLObject)NIL;
                SubLObject var50 = (SubLObject)NIL;
                final Iterator var51 = Hashtables.getEntrySetIterator(var48);
                try {
                    while (Hashtables.iteratorHasNext(var51)) {
                        final Map.Entry var52 = Hashtables.iteratorNextEntry(var51);
                        var55 = Hashtables.getEntryKey(var52);
                        var50 = Hashtables.getEntryValue(var52);
                        final SubLObject var53 = module0167.f10832(var55);
                        if (NIL != var53) {
                            module0021.f1038(var53, var28);
                            module0021.f1038(var50, var28);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var51);
                }
            }
        }
        return var38;
    }
    
    public static SubLObject f11003(final SubLObject var28) {
        final SubLObject var29 = module0021.f1060(var28, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var30 = (SubLObject)NIL;
        var30 = f10985();
        SubLObject var31;
        SubLObject var32;
        SubLObject var33;
        for (var31 = (SubLObject)NIL, var31 = (SubLObject)ZERO_INTEGER; var31.numL(var29); var31 = Numbers.add(var31, (SubLObject)ONE_INTEGER)) {
            var32 = module0021.f1090(var28);
            var33 = module0021.f1090(var28);
            f10991(var30, var32, var33);
        }
        return var30;
    }
    
    public static SubLObject f11004() {
        final SubLThread var40 = SubLProcess.currentSubLThread();
        SubLObject var41 = (SubLObject)ZERO_INTEGER;
        final SubLObject var42 = f10959();
        final SubLObject var43 = (SubLObject)$ic93$;
        final SubLObject var44 = f10962();
        SubLObject var45 = (SubLObject)ZERO_INTEGER;
        final SubLObject var46 = module0012.$g75$.currentBinding(var40);
        final SubLObject var47 = module0012.$g76$.currentBinding(var40);
        final SubLObject var48 = module0012.$g77$.currentBinding(var40);
        final SubLObject var49 = module0012.$g78$.currentBinding(var40);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var40);
            module0012.$g76$.bind((SubLObject)NIL, var40);
            module0012.$g77$.bind((SubLObject)T, var40);
            module0012.$g78$.bind(Time.get_universal_time(), var40);
            module0012.f478(var43);
            SubLObject var50 = f10961();
            SubLObject var51 = (SubLObject)NIL;
            var51 = var50.first();
            while (NIL != var50) {
                final SubLObject var52 = var51;
                if (NIL == module0065.f4772(var52, (SubLObject)$ic92$)) {
                    final SubLObject var86_113 = var52;
                    if (NIL == module0065.f4775(var86_113, (SubLObject)$ic92$)) {
                        final SubLObject var53 = module0065.f4740(var86_113);
                        final SubLObject var54 = (SubLObject)NIL;
                        SubLObject var55;
                        SubLObject var56;
                        SubLObject var57;
                        SubLObject var58;
                        SubLObject var59;
                        for (var55 = Sequences.length(var53), var56 = (SubLObject)NIL, var56 = (SubLObject)ZERO_INTEGER; var56.numL(var55); var56 = Numbers.add(var56, (SubLObject)ONE_INTEGER)) {
                            var57 = ((NIL != var54) ? Numbers.subtract(var55, var56, (SubLObject)ONE_INTEGER) : var56);
                            var58 = Vectors.aref(var53, var57);
                            if (NIL == module0065.f4749(var58) || NIL == module0065.f4773((SubLObject)$ic92$)) {
                                if (NIL != module0065.f4749(var58)) {
                                    var58 = (SubLObject)$ic92$;
                                }
                                var45 = Numbers.add(var45, (SubLObject)ONE_INTEGER);
                                module0012.note_percent_progress(var45, var44);
                                var41 = Numbers.add(var41, (SubLObject)ONE_INTEGER);
                                var59 = module0052.f3694(var42, (SubLObject)$ic94$);
                                if (NIL == f10955(var59)) {
                                    if (var59 == $ic94$) {
                                        return (SubLObject)ConsesLow.list((SubLObject)$ic96$, (SubLObject)$ic97$, (SubLObject)$ic98$, var41);
                                    }
                                    return (SubLObject)ConsesLow.list((SubLObject)$ic96$, (SubLObject)$ic99$, (SubLObject)$ic100$, var59, (SubLObject)$ic98$, var41);
                                }
                                else if (!var59.eql(var58)) {
                                    return (SubLObject)ConsesLow.list((SubLObject)$ic96$, (SubLObject)$ic101$, (SubLObject)$ic100$, var59, (SubLObject)$ic102$, var58, (SubLObject)$ic98$, var41);
                                }
                            }
                        }
                    }
                    final SubLObject var116_117 = var52;
                    if (NIL == module0065.f4777(var116_117) || NIL == module0065.f4773((SubLObject)$ic92$)) {
                        final SubLObject var60 = module0065.f4738(var116_117);
                        SubLObject var61 = module0065.f4739(var116_117);
                        final SubLObject var62 = module0065.f4734(var116_117);
                        final SubLObject var63 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic92$)) ? NIL : $ic92$);
                        while (var61.numL(var62)) {
                            final SubLObject var64 = Hashtables.gethash_without_values(var61, var60, var63);
                            if (NIL == module0065.f4773((SubLObject)$ic92$) || NIL == module0065.f4749(var64)) {
                                var45 = Numbers.add(var45, (SubLObject)ONE_INTEGER);
                                module0012.note_percent_progress(var45, var44);
                                var41 = Numbers.add(var41, (SubLObject)ONE_INTEGER);
                                final SubLObject var65 = module0052.f3694(var42, (SubLObject)$ic94$);
                                if (NIL == f10955(var65)) {
                                    if (var65 == $ic94$) {
                                        return (SubLObject)ConsesLow.list((SubLObject)$ic96$, (SubLObject)$ic97$, (SubLObject)$ic98$, var41);
                                    }
                                    return (SubLObject)ConsesLow.list((SubLObject)$ic96$, (SubLObject)$ic99$, (SubLObject)$ic100$, var65, (SubLObject)$ic98$, var41);
                                }
                                else if (!var65.eql(var64)) {
                                    return (SubLObject)ConsesLow.list((SubLObject)$ic96$, (SubLObject)$ic101$, (SubLObject)$ic100$, var65, (SubLObject)$ic102$, var64, (SubLObject)$ic98$, var41);
                                }
                            }
                            var61 = Numbers.add(var61, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                var50 = var50.rest();
                var51 = var50.first();
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var49, var40);
            module0012.$g77$.rebind(var48, var40);
            module0012.$g76$.rebind(var47, var40);
            module0012.$g75$.rebind(var46, var40);
        }
        final SubLObject var66 = module0052.f3694(var42, (SubLObject)$ic94$);
        if ($ic94$ != var66) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic96$, (SubLObject)$ic103$, (SubLObject)$ic98$, var41, (SubLObject)$ic100$, var66);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f11005() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0173", "f10955", "FORT-P", 1, 0, false);
        new $f10955$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0173", "f10956", "S#13758", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0173", "f10957", "S#13759", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0173", "f10958", "FORT-EL-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0173", "f10959", "S#13760", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0173", "f10960", "DO-FORTS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0173", "f10961", "S#13761", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0173", "f10962", "FORT-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0173", "f10963", "S#13762", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0173", "f10964", "S#13763", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0173", "f10965", "S#13764", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0173", "f10966", "S#13765", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0173", "f10967", "S#13754", 1, 0, false);
        new $f10967$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0173", "f10968", "S#13766", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0173", "f10969", "S#11103", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0173", "f10970", "S#13767", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0173", "f10971", "S#13755", 1, 0, false);
        new $f10971$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0173", "f10972", "S#13768", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0173", "f10973", "REMOVE-FORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0173", "f10974", "S#13769", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0173", "f10976", "S#13757", 1, 0, false);
        new $f10976$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0173", "f10977", "S#13770", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0173", "f10978", "S#13771", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0173", "f10979", "S#13772", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0173", "f10980", "S#13773", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0173", "f10981", "S#13774", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0173", "f10982", "S#13775", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0173", "f10983", "S#13776", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0173", "f10975", "S#13777", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0173", "f10984", "S#13778");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0173", "f10985", "S#13779", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0173", "f10988", "S#13780", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0173", "f10989", "S#13781", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0173", "f10990", "S#13782", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0173", "f10991", "S#13783", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0173", "f10992", "S#13784", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0173", "f10993", "S#13785", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0173", "f10994", "S#13786", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0173", "f10995", "S#13787", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0173", "f10986", "S#13788", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0173", "f10987", "S#13789", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0173", "f10996", "S#13790");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0173", "f10997", "S#13791");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0173", "f10998", "S#13792", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0173", "f10999", "S#13793");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0173", "f11000", "S#13794", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0173", "f11001", "S#13795", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0173", "f11002", "S#13796", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0173", "f11003", "S#13797", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0173", "f11004", "S#13798", 0, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f11006() {
        $g2191$ = SubLFiles.defconstant("S#13799", (SubLObject)$ic38$);
        $g2192$ = SubLFiles.defconstant("S#13800", (SubLObject)$ic89$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f11007() {
        module0012.f368((SubLObject)$ic0$, (SubLObject)$ic1$, (SubLObject)$ic2$, (SubLObject)NIL, (SubLObject)$ic3$);
        module0012.f368((SubLObject)$ic4$, (SubLObject)$ic5$, (SubLObject)$ic6$, (SubLObject)$ic7$, (SubLObject)$ic8$);
        module0012.f375((SubLObject)$ic26$, (SubLObject)$ic9$, (SubLObject)$ic29$);
        module0002.f50((SubLObject)$ic30$, (SubLObject)$ic26$);
        module0012.f368((SubLObject)$ic31$, (SubLObject)NIL, (SubLObject)$ic32$, (SubLObject)NIL, (SubLObject)$ic33$);
        module0012.f368((SubLObject)$ic35$, (SubLObject)$ic5$, (SubLObject)$ic36$, (SubLObject)$ic7$, (SubLObject)$ic37$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g2191$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic45$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic46$);
        Structures.def_csetf((SubLObject)$ic47$, (SubLObject)$ic48$);
        Structures.def_csetf((SubLObject)$ic49$, (SubLObject)$ic50$);
        Equality.identity((SubLObject)$ic38$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g2191$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic58$));
        module0002.f50((SubLObject)$ic77$, (SubLObject)$ic79$);
        module0002.f50((SubLObject)$ic83$, (SubLObject)$ic77$);
        module0002.f50((SubLObject)$ic78$, (SubLObject)$ic79$);
        module0002.f50((SubLObject)$ic87$, (SubLObject)$ic78$);
        module0021.f1098($g2192$.getGlobalValue(), (SubLObject)$ic90$);
        Structures.register_method(module0021.$g749$.getGlobalValue(), $g2191$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic91$));
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f11005();
    }
    
    public void initializeVariables() {
        f11006();
    }
    
    public void runTopLevelForms() {
        f11007();
    }
    
    static {
        me = (SubLFile)new module0173();
        $g2191$ = null;
        $g2192$ = null;
        $ic0$ = makeSymbol("FORT-P");
        $ic1$ = ConsesLow.list((SubLObject)makeSymbol("OBJECT", "CYC"));
        $ic2$ = makeString("Return T iff OBJECT is a first order reified term (FORT).");
        $ic3$ = ConsesLow.list((SubLObject)makeSymbol("BOOLEANP"));
        $ic4$ = makeSymbol("FORT-EL-FORMULA");
        $ic5$ = ConsesLow.list((SubLObject)makeSymbol("S#10466", "CYC"));
        $ic6$ = makeString("Return the EL formula for any FORT.");
        $ic7$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10466", "CYC"), (SubLObject)makeSymbol("FORT-P")));
        $ic8$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#664", "CYC"), (SubLObject)makeSymbol("CONSP")));
        $ic9$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#130", "CYC"), (SubLObject)makeString("mapping Cyc FORTs")), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic10$ = makeString("mapping Cyc FORTs");
        $ic11$ = ConsesLow.list((SubLObject)makeKeyword("DONE"));
        $ic12$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic13$ = makeKeyword("DONE");
        $ic14$ = makeUninternedSymbol("US#7C5C08F");
        $ic15$ = makeSymbol("DO-LIST");
        $ic16$ = ConsesLow.list((SubLObject)makeSymbol("S#13761", "CYC"));
        $ic17$ = makeSymbol("DO-KB-SUID-TABLE");
        $ic18$ = makeKeyword("PROGRESS-MESSAGE");
        $ic19$ = makeUninternedSymbol("US#7A78845");
        $ic20$ = makeUninternedSymbol("US#13E86D7");
        $ic21$ = makeUninternedSymbol("US#53EB1D3");
        $ic22$ = makeSymbol("CLET");
        $ic23$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("FORT-COUNT")));
        $ic24$ = ConsesLow.list((SubLObject)ZERO_INTEGER);
        $ic25$ = makeSymbol("NOTING-PERCENT-PROGRESS");
        $ic26$ = makeSymbol("DO-FORTS");
        $ic27$ = makeSymbol("CINC");
        $ic28$ = makeSymbol("NOTE-PERCENT-PROGRESS");
        $ic29$ = makeString("Iterate over all HL FORT datastructures, executing BODY within the scope of VAR.\n   VAR is bound to the FORT.\n   PROGRESS-MESSAGE is a progress message string.\n   Iteration halts as soon as DONE becomes non-nil.");
        $ic30$ = makeSymbol("S#13761", "CYC");
        $ic31$ = makeSymbol("FORT-COUNT");
        $ic32$ = makeString("Return the total number of FORTs.");
        $ic33$ = ConsesLow.list((SubLObject)makeSymbol("INTEGERP"));
        $ic34$ = makeString("~S was not a FORT");
        $ic35$ = makeSymbol("REMOVE-FORT");
        $ic36$ = makeString("Remove FORT from the KB.");
        $ic37$ = ConsesLow.list((SubLObject)makeSymbol("NULL"));
        $ic38$ = makeSymbol("S#13756", "CYC");
        $ic39$ = makeSymbol("S#13757", "CYC");
        $ic40$ = ConsesLow.list((SubLObject)makeSymbol("S#13801", "CYC"), (SubLObject)makeSymbol("S#13802", "CYC"));
        $ic41$ = ConsesLow.list((SubLObject)makeKeyword("CONSTANTS"), (SubLObject)makeKeyword("NARTS"));
        $ic42$ = ConsesLow.list((SubLObject)makeSymbol("S#13770", "CYC"), (SubLObject)makeSymbol("S#13771", "CYC"));
        $ic43$ = ConsesLow.list((SubLObject)makeSymbol("S#13772", "CYC"), (SubLObject)makeSymbol("S#13773", "CYC"));
        $ic44$ = makeSymbol("S#13777", "CYC");
        $ic45$ = makeSymbol("S#13769", "CYC");
        $ic46$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#13757", "CYC"));
        $ic47$ = makeSymbol("S#13770", "CYC");
        $ic48$ = makeSymbol("S#13772", "CYC");
        $ic49$ = makeSymbol("S#13771", "CYC");
        $ic50$ = makeSymbol("S#13773", "CYC");
        $ic51$ = makeKeyword("CONSTANTS");
        $ic52$ = makeKeyword("NARTS");
        $ic53$ = makeString("Invalid slot ~S for construction function");
        $ic54$ = makeKeyword("BEGIN");
        $ic55$ = makeSymbol("S#13774", "CYC");
        $ic56$ = makeKeyword("SLOT");
        $ic57$ = makeKeyword("END");
        $ic58$ = makeSymbol("S#13776", "CYC");
        $ic59$ = makeString("#<");
        $ic60$ = makeKeyword("STREAM");
        $ic61$ = makeString("Constant Index:");
        $ic62$ = makeString("Nart Index:");
        $ic63$ = makeKeyword("BASE");
        $ic64$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#13803", "CYC"), (SubLObject)makeSymbol("S#13804", "CYC"), (SubLObject)makeSymbol("S#10466", "CYC"), (SubLObject)makeSymbol("S#13756", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic65$ = makeSymbol("PROGN");
        $ic66$ = makeSymbol("CHECK-TYPE");
        $ic67$ = ConsesLow.list((SubLObject)makeSymbol("FORT-P"));
        $ic68$ = ConsesLow.list((SubLObject)makeSymbol("S#13757", "CYC"));
        $ic69$ = makeSymbol("PWHEN");
        $ic70$ = makeSymbol("S#11103", "CYC");
        $ic71$ = makeSymbol("FIF");
        $ic72$ = makeSymbol("CONSTANT-P");
        $ic73$ = makeSymbol("CONSTANT-INTERNAL-ID");
        $ic74$ = makeSymbol("NART-ID");
        $ic75$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10466", "CYC"), (SubLObject)makeSymbol("S#132", "CYC"), (SubLObject)makeSymbol("S#13756", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic76$ = makeUninternedSymbol("US#3263091");
        $ic77$ = makeSymbol("S#13791", "CYC");
        $ic78$ = makeSymbol("S#13793", "CYC");
        $ic79$ = makeSymbol("S#13790", "CYC");
        $ic80$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("CONSTANT", "CYC"), (SubLObject)makeSymbol("S#132", "CYC"), (SubLObject)makeSymbol("S#13756", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic81$ = makeUninternedSymbol("US#1124883");
        $ic82$ = makeSymbol("DO-ID-INDEX");
        $ic83$ = makeSymbol("S#13792", "CYC");
        $ic84$ = makeSymbol("FIND-CONSTANT-BY-INTERNAL-ID");
        $ic85$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#13601", "CYC"), (SubLObject)makeSymbol("S#132", "CYC"), (SubLObject)makeSymbol("S#13756", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic86$ = makeUninternedSymbol("US#1124883");
        $ic87$ = makeSymbol("S#13794", "CYC");
        $ic88$ = makeSymbol("FIND-NART-BY-ID");
        $ic89$ = makeInteger(99);
        $ic90$ = makeSymbol("S#13797", "CYC");
        $ic91$ = makeSymbol("S#13795", "CYC");
        $ic92$ = makeKeyword("SKIP");
        $ic93$ = makeString("Checking that forts iterators work.");
        $ic94$ = makeKeyword("EXHAUSTED");
        $ic95$ = makeSymbol("S#5859", "CYC");
        $ic96$ = makeKeyword("ERROR");
        $ic97$ = makeString("FORTS-ITERATOR exhausted before DO-FORTS");
        $ic98$ = makeKeyword("INDEX");
        $ic99$ = makeString("FORTS-ITERATOR returned non-fort!");
        $ic100$ = makeKeyword("CANDIDATE");
        $ic101$ = makeString("FORTS-ITERATOR and DO-FORTS differ in which FORT they think is next");
        $ic102$ = makeKeyword("FORT");
        $ic103$ = makeString("The FORTS iterator has more values than DO-FORTS.");
    }
    
    public static final class $f10955$UnaryFunction extends UnaryFunction
    {
        public $f10955$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("FORT-P"));
        }
        
        public SubLObject processItem(final SubLObject var2) {
            return f10955(var2);
        }
    }
    
    public static final class $f10967$UnaryFunction extends UnaryFunction
    {
        public $f10967$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#13754"));
        }
        
        public SubLObject processItem(final SubLObject var2) {
            return f10967(var2);
        }
    }
    
    public static final class $f10971$UnaryFunction extends UnaryFunction
    {
        public $f10971$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#13755"));
        }
        
        public SubLObject processItem(final SubLObject var2) {
            return f10971(var2);
        }
    }
    
    public static final class $sX13756_native extends SubLStructNative
    {
        public SubLObject $constants;
        public SubLObject $narts;
        public static final SubLStructDeclNative structDecl;
        
        public $sX13756_native() {
            this.$constants = (SubLObject)CommonSymbols.NIL;
            this.$narts = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX13756_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$constants;
        }
        
        public SubLObject getField3() {
            return this.$narts;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$constants = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$narts = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX13756_native.class, $ic38$, $ic39$, $ic40$, $ic41$, new String[] { "$constants", "$narts" }, $ic42$, $ic43$, $ic44$);
        }
    }
    
    public static final class $f10976$UnaryFunction extends UnaryFunction
    {
        public $f10976$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#13757"));
        }
        
        public SubLObject processItem(final SubLObject var2) {
            return f10976(var2);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 323 ms
	
	Decompiled with Procyon 0.5.32.
*/