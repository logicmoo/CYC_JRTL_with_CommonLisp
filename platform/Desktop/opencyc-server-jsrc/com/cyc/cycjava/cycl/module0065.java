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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
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

public final class module0065 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0065";
    public static final String myFingerPrint = "c277585e86026c30788c521b7fa043d6cca454bdcae1dc66d4c94e70f9690cb1";
    public static SubLSymbol $g1078$;
    private static SubLSymbol $g1079$;
    private static SubLSymbol $g1080$;
    private static SubLSymbol $g1081$;
    private static SubLSymbol $g1082$;
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
    private static final SubLString $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLString $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLString $ic32$;
    private static final SubLString $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLList $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLInteger $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLString $ic48$;
    private static final SubLString $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLList $ic52$;
    private static final SubLList $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLList $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLList $ic57$;
    private static final SubLList $ic58$;
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
    private static final SubLList $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLList $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLList $ic80$;
    private static final SubLList $ic81$;
    private static final SubLSymbol $ic82$;
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
    private static final SubLList $ic94$;
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
    private static final SubLSymbol $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLString $ic114$;
    private static final SubLSymbol $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLSymbol $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLSymbol $ic126$;
    private static final SubLList $ic127$;
    private static final SubLSymbol $ic128$;
    private static final SubLList $ic129$;
    private static final SubLSymbol $ic130$;
    private static final SubLSymbol $ic131$;
    private static final SubLString $ic132$;
    private static final SubLInteger $ic133$;
    private static final SubLSymbol $ic134$;
    private static final SubLSymbol $ic135$;
    private static final SubLString $ic136$;
    private static final SubLString $ic137$;
    private static final SubLString $ic138$;
    private static final SubLString $ic139$;
    private static final SubLSymbol $ic140$;
    private static final SubLSymbol $ic141$;
    private static final SubLSymbol $ic142$;
    private static final SubLSymbol $ic143$;
    private static final SubLSymbol $ic144$;
    private static final SubLSymbol $ic145$;
    private static final SubLSymbol $ic146$;
    private static final SubLList $ic147$;
    private static final SubLSymbol $ic148$;
    private static final SubLString $ic149$;
    private static final SubLString $ic150$;
    private static final SubLSymbol $ic151$;
    private static final SubLSymbol $ic152$;
    private static final SubLString $ic153$;
    private static final SubLSymbol $ic154$;
    private static final SubLSymbol $ic155$;
    private static final SubLString $ic156$;
    private static final SubLSymbol $ic157$;
    private static final SubLList $ic158$;
    private static final SubLString $ic159$;
    private static final SubLSymbol $ic160$;
    private static final SubLList $ic161$;
    private static final SubLSymbol $ic162$;
    private static final SubLSymbol $ic163$;
    private static final SubLList $ic164$;
    private static final SubLString $ic165$;
    private static final SubLString $ic166$;
    private static final SubLString $ic167$;
    private static final SubLList $ic168$;
    private static final SubLSymbol $ic169$;
    private static final SubLString $ic170$;
    private static final SubLSymbol $ic171$;
    private static final SubLString $ic172$;
    private static final SubLString $ic173$;
    private static final SubLString $ic174$;
    private static final SubLSymbol $ic175$;
    private static final SubLSymbol $ic176$;
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
    private static final SubLList $ic187$;
    private static final SubLString $ic188$;
    private static final SubLString $ic189$;
    private static final SubLString $ic190$;
    
    
    public static SubLObject f4717(final SubLObject var1, final SubLObject var2) {
        f4718(var1, var2, (SubLObject)module0065.ZERO_INTEGER);
        return (SubLObject)module0065.NIL;
    }
    
    public static SubLObject f4719(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX6282_native.class) ? module0065.T : module0065.NIL);
    }
    
    public static SubLObject f4720(final SubLObject var1) {
        assert module0065.NIL != f4719(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f4721(final SubLObject var1) {
        assert module0065.NIL != f4719(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f4722(final SubLObject var1) {
        assert module0065.NIL != f4719(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f4723(final SubLObject var1) {
        assert module0065.NIL != f4719(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f4724(final SubLObject var1) {
        assert module0065.NIL != f4719(var1) : var1;
        return var1.getField6();
    }
    
    public static SubLObject f4725(final SubLObject var1, final SubLObject var4) {
        assert module0065.NIL != f4719(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f4726(final SubLObject var1, final SubLObject var4) {
        assert module0065.NIL != f4719(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f4727(final SubLObject var1, final SubLObject var4) {
        assert module0065.NIL != f4719(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f4728(final SubLObject var1, final SubLObject var4) {
        assert module0065.NIL != f4719(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f4729(final SubLObject var1, final SubLObject var4) {
        assert module0065.NIL != f4719(var1) : var1;
        return var1.setField6(var4);
    }
    
    public static SubLObject f4730(SubLObject var5) {
        if (var5 == module0065.UNPROVIDED) {
            var5 = (SubLObject)module0065.NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX6282_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0065.NIL, var7 = var5; module0065.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0065.$ic19$)) {
                f4725(var6, var9);
            }
            else if (var10.eql((SubLObject)module0065.$ic20$)) {
                f4726(var6, var9);
            }
            else if (var10.eql((SubLObject)module0065.$ic21$)) {
                f4727(var6, var9);
            }
            else if (var10.eql((SubLObject)module0065.$ic22$)) {
                f4728(var6, var9);
            }
            else if (var10.eql((SubLObject)module0065.$ic23$)) {
                f4729(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0065.$ic24$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f4731(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0065.$ic25$, (SubLObject)module0065.$ic26$, (SubLObject)module0065.FIVE_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)module0065.$ic27$, (SubLObject)module0065.$ic19$, f4720(var11));
        Functions.funcall(var12, var11, (SubLObject)module0065.$ic27$, (SubLObject)module0065.$ic20$, f4721(var11));
        Functions.funcall(var12, var11, (SubLObject)module0065.$ic27$, (SubLObject)module0065.$ic21$, f4722(var11));
        Functions.funcall(var12, var11, (SubLObject)module0065.$ic27$, (SubLObject)module0065.$ic22$, f4723(var11));
        Functions.funcall(var12, var11, (SubLObject)module0065.$ic27$, (SubLObject)module0065.$ic23$, f4724(var11));
        Functions.funcall(var12, var11, (SubLObject)module0065.$ic28$, (SubLObject)module0065.$ic26$, (SubLObject)module0065.FIVE_INTEGER);
        return var11;
    }
    
    public static SubLObject f4732(final SubLObject var11, final SubLObject var12) {
        return f4731(var11, var12);
    }
    
    public static SubLObject f4718(final SubLObject var13, final SubLObject var2, final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        if (module0065.NIL != print_high.$print_readably$.getDynamicValue(var15)) {
            print_high.print_not_readable(var13, var2);
        }
        else {
            streams_high.write_string((SubLObject)module0065.$ic30$, var2, (SubLObject)module0065.UNPROVIDED, (SubLObject)module0065.UNPROVIDED);
            PrintLow.write((SubLObject)Types.type_of(var13), new SubLObject[] { module0065.$ic31$, var2 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var2);
            streams_high.write_string((SubLObject)module0065.$ic32$, var2, (SubLObject)module0065.UNPROVIDED, (SubLObject)module0065.UNPROVIDED);
            print_high.princ(f4733(var13), var2);
            print_high.princ((SubLObject)module0065.$ic33$, var2);
            print_high.princ(f4734(var13), var2);
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var2);
        }
        return var13;
    }
    
    public static SubLObject f4733(final SubLObject var13) {
        assert module0065.NIL != f4719(var13) : var13;
        return f4721(var13);
    }
    
    public static SubLObject f4735(final SubLObject var13) {
        return Numbers.numE((SubLObject)module0065.ZERO_INTEGER, f4733(var13));
    }
    
    public static SubLObject f4736(final SubLObject var13) {
        assert module0065.NIL != f4719(var13) : var13;
        return Numbers.subtract(f4733(var13), f4737(var13));
    }
    
    public static SubLObject f4737(final SubLObject var13) {
        assert module0065.NIL != f4719(var13) : var13;
        return Hashtables.hash_table_count(f4738(var13));
    }
    
    public static SubLObject f4739(final SubLObject var13) {
        assert module0065.NIL != f4719(var13) : var13;
        return Sequences.length(f4740(var13));
    }
    
    public static SubLObject f4734(final SubLObject var13) {
        assert module0065.NIL != f4719(var13) : var13;
        return f4722(var13);
    }
    
    public static SubLObject f4741(final SubLObject var13, final SubLObject var19) {
        assert module0065.NIL != f4719(var13) : var13;
        assert module0065.NIL != Types.integerp(var19) : var19;
        f4727(var13, var19);
        return var19;
    }
    
    public static SubLObject f4740(final SubLObject var13) {
        assert module0065.NIL != f4719(var13) : var13;
        return f4723(var13);
    }
    
    public static SubLObject f4738(final SubLObject var13) {
        assert module0065.NIL != f4719(var13) : var13;
        return f4724(var13);
    }
    
    public static SubLObject f4742(final SubLObject var20, final SubLObject var21) {
        SubLObject var23;
        final SubLObject var22 = var23 = var20.rest();
        SubLObject var24 = (SubLObject)module0065.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0065.$ic40$);
        var24 = var23.first();
        final SubLObject var25;
        var23 = (var25 = var23.rest());
        final SubLObject var26 = (SubLObject)module0065.$ic41$;
        return (SubLObject)ConsesLow.list((SubLObject)module0065.$ic42$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var26, (SubLObject)ConsesLow.list((SubLObject)module0065.$ic43$, var24))), (SubLObject)ConsesLow.listS((SubLObject)module0065.$ic44$, (SubLObject)ConsesLow.list(var26), ConsesLow.append(var25, (SubLObject)module0065.NIL)));
    }
    
    public static SubLObject f4743(final SubLObject var13) {
        return f4720(var13);
    }
    
    public static SubLObject f4744(final SubLObject var13, SubLObject var26, SubLObject var27) {
        if (var26 == module0065.UNPROVIDED) {
            var26 = (SubLObject)module0065.EQL;
        }
        if (var27 == module0065.UNPROVIDED) {
            var27 = (SubLObject)module0065.EQ;
        }
        assert module0065.NIL != f4719(var13) : var13;
        final SubLObject var28 = f4738(var13);
        if (var28.isHashtable()) {
            final SubLObject var29 = module0030.f1592(Hashtables.hash_table_test(var28));
            final SubLObject var30 = module0030.f1592(var26);
            if (var30.eql(var29)) {
                final SubLObject var31 = Hashtables.make_hash_table(Hashtables.hash_table_size(var28), var27, (SubLObject)module0065.UNPROVIDED);
                SubLObject var32 = (SubLObject)module0065.NIL;
                SubLObject var33 = (SubLObject)module0065.NIL;
                final Iterator var34 = Hashtables.getEntrySetIterator(var28);
                try {
                    while (Hashtables.iteratorHasNext(var34)) {
                        final Map.Entry var35 = Hashtables.iteratorNextEntry(var34);
                        var32 = Hashtables.getEntryKey(var35);
                        var33 = Hashtables.getEntryValue(var35);
                        Hashtables.sethash(var32, var31, var33);
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var34);
                }
                f4729(var13, var31);
                return (SubLObject)module0065.T;
            }
        }
        return (SubLObject)module0065.NIL;
    }
    
    public static SubLObject f4745(SubLObject var36, SubLObject var37) {
        if (var36 == module0065.UNPROVIDED) {
            var36 = (SubLObject)module0065.ZERO_INTEGER;
        }
        if (var37 == module0065.UNPROVIDED) {
            var37 = var36;
        }
        assert module0065.NIL != module0004.f106(var37) : var37;
        assert module0065.NIL != module0004.f106(var36) : var36;
        final SubLObject var38 = Numbers.max((SubLObject)module0065.TEN_INTEGER, Numbers.integerDivide(var36, module0065.$g1079$.getGlobalValue()));
        final SubLObject var39 = f4730((SubLObject)module0065.UNPROVIDED);
        final SubLObject var40 = Locks.make_lock((SubLObject)module0065.$ic48$);
        final SubLObject var41 = Vectors.make_vector(var36, (SubLObject)module0065.NIL);
        final SubLObject var42 = Hashtables.make_hash_table(var38, module0065.$g1080$.getGlobalValue(), (SubLObject)module0065.UNPROVIDED);
        f4725(var39, var40);
        f4726(var39, (SubLObject)module0065.ZERO_INTEGER);
        f4727(var39, var37);
        f4728(var39, var41);
        f4729(var39, var42);
        return var39;
    }
    
    public static SubLObject f4746(final SubLObject var13) {
        assert module0065.NIL != f4719(var13) : var13;
        SubLObject var14 = (SubLObject)module0065.NIL;
        final SubLObject var16;
        final SubLObject var15 = var16 = f4743(var13);
        SubLObject var17 = (SubLObject)module0065.NIL;
        try {
            var17 = Locks.seize_lock(var16);
            final SubLObject var18 = f4734(var13);
            f4727(var13, Numbers.add(f4722(var13), (SubLObject)module0065.ONE_INTEGER));
            var14 = var18;
        }
        finally {
            if (module0065.NIL != var17) {
                Locks.release_lock(var16);
            }
        }
        return var14;
    }
    
    public static SubLObject f4747() {
        return module0065.$g1081$.getGlobalValue();
    }
    
    public static SubLObject f4748() {
        return (SubLObject)module0065.NIL;
    }
    
    public static SubLObject f4749(final SubLObject var46) {
        return Equality.eq(var46, f4748());
    }
    
    public static SubLObject f4750(final SubLObject var13, final SubLObject var42, SubLObject var47) {
        if (var47 == module0065.UNPROVIDED) {
            var47 = (SubLObject)module0065.NIL;
        }
        final SubLObject var48 = f4751(var13, var42);
        if (module0065.NIL != f4749(var48)) {
            return var47;
        }
        if (var48.eql(f4747())) {
            return (SubLObject)module0065.NIL;
        }
        return var48;
    }
    
    public static SubLObject f4751(final SubLObject var13, final SubLObject var42) {
        assert module0065.NIL != f4719(var13) : var13;
        assert module0065.NIL != Types.integerp(var42) : var42;
        if (module0065.NIL != f4752(var13, var42)) {
            final SubLObject var43 = f4740(var13);
            return Vectors.aref(var43, var42);
        }
        final SubLObject var44 = f4738(var13);
        return Hashtables.gethash_without_values(var42, var44, (SubLObject)module0065.NIL);
    }
    
    public static SubLObject f4753(final SubLObject var13, final SubLObject var42, final SubLObject var46) {
        final SubLObject var48;
        final SubLObject var47 = var48 = f4743(var13);
        SubLObject var49 = (SubLObject)module0065.NIL;
        try {
            var49 = Locks.seize_lock(var48);
            f4754(var13, var42, var46);
        }
        finally {
            if (module0065.NIL != var49) {
                Locks.release_lock(var48);
            }
        }
        return var13;
    }
    
    public static SubLObject f4754(final SubLObject var13, final SubLObject var42, final SubLObject var46) {
        assert module0065.NIL != f4719(var13) : var13;
        assert module0065.NIL != Types.integerp(var42) : var42;
        final SubLObject var47 = f4751(var13, var42);
        final SubLObject var48 = (module0065.NIL != var46) ? var46 : f4747();
        if (module0065.NIL != f4752(var13, var42)) {
            final SubLObject var49 = f4740(var13);
            Vectors.set_aref(var49, var42, var48);
        }
        else {
            final SubLObject var50 = f4755(var13, var42);
            Hashtables.sethash(var42, var50, var48);
        }
        if (module0065.NIL != f4749(var47)) {
            f4726(var13, Numbers.add(f4721(var13), (SubLObject)module0065.ONE_INTEGER));
        }
        return var13;
    }
    
    public static SubLObject f4755(final SubLObject var13, final SubLObject var42) {
        SubLObject var43 = f4738(var13);
        if (!var42.isFixnum()) {
            f4744(var13, (SubLObject)module0065.EQ, (SubLObject)module0065.EQL);
            var43 = f4738(var13);
        }
        return var43;
    }
    
    public static SubLObject f4756(final SubLObject var13, final SubLObject var42, final SubLObject var46, SubLObject var53) {
        if (var53 == module0065.UNPROVIDED) {
            var53 = (SubLObject)module0065.T;
        }
        f4753(var13, var42, var46);
        return f4757(var13, var42, var53);
    }
    
    public static SubLObject f4758(final SubLObject var13, final SubLObject var42, final SubLObject var46, SubLObject var53) {
        if (var53 == module0065.UNPROVIDED) {
            var53 = (SubLObject)module0065.T;
        }
        f4754(var13, var42, var46);
        return f4757(var13, var42, var53);
    }
    
    public static SubLObject f4757(final SubLObject var13, final SubLObject var42, final SubLObject var53) {
        if (module0065.NIL == var53 && module0065.NIL != f4759(var13)) {
            return var13;
        }
        final SubLObject var54 = f4739(var13);
        if (module0048.f_1X(var42).numGE(var54)) {
            f4760(var13, module0048.f3274(Numbers.max(var54, var42)));
        }
        return var13;
    }
    
    public static SubLObject f4761(final SubLObject var13, final SubLObject var42) {
        assert module0065.NIL != f4719(var13) : var13;
        assert module0065.NIL != Types.integerp(var42) : var42;
        final SubLObject var44;
        final SubLObject var43 = var44 = f4743(var13);
        SubLObject var45 = (SubLObject)module0065.NIL;
        try {
            var45 = Locks.seize_lock(var44);
            final SubLObject var46 = f4751(var13, var42);
            if (module0065.NIL != f4752(var13, var42)) {
                final SubLObject var47 = f4740(var13);
                Vectors.set_aref(var47, var42, f4748());
            }
            else {
                final SubLObject var48 = f4738(var13);
                Hashtables.remhash(var42, var48);
            }
            if (module0065.NIL == f4749(var46)) {
                f4726(var13, Numbers.subtract(f4721(var13), (SubLObject)module0065.ONE_INTEGER));
            }
        }
        finally {
            if (module0065.NIL != var45) {
                Locks.release_lock(var44);
            }
        }
        return var13;
    }
    
    public static SubLObject f4762(final SubLObject var13) {
        assert module0065.NIL != f4719(var13) : var13;
        final SubLObject var15;
        final SubLObject var14 = var15 = f4743(var13);
        SubLObject var16 = (SubLObject)module0065.NIL;
        try {
            var16 = Locks.seize_lock(var15);
            f4726(var13, (SubLObject)module0065.ZERO_INTEGER);
            Sequences.fill(f4740(var13), (SubLObject)module0065.NIL, (SubLObject)module0065.UNPROVIDED, (SubLObject)module0065.UNPROVIDED);
            Hashtables.clrhash(f4738(var13));
        }
        finally {
            if (module0065.NIL != var16) {
                Locks.release_lock(var15);
            }
        }
        return var13;
    }
    
    public static SubLObject f4752(final SubLObject var13, final SubLObject var42) {
        return (SubLObject)SubLObjectFactory.makeBoolean(!var42.isNegative() && var42.numL(f4739(var13)));
    }
    
    public static SubLObject f4763(final SubLObject var13) {
        assert module0065.NIL != f4719(var13) : var13;
        return module0052.f3745((SubLObject)module0065.$ic52$, (SubLObject)ConsesLow.list(var13), (SubLObject)module0065.UNPROVIDED);
    }
    
    public static SubLObject f4764(final SubLObject var13) {
        assert module0065.NIL != f4719(var13) : var13;
        return module0052.f3745((SubLObject)module0065.$ic53$, (SubLObject)ConsesLow.list(var13), (SubLObject)module0065.UNPROVIDED);
    }
    
    public static SubLObject f4765(final SubLObject var13) {
        assert module0065.NIL != f4719(var13) : var13;
        final SubLObject var14 = f4740(var13);
        final SubLObject var15 = module0052.f3729(var14);
        return module0052.f3781(var15, (SubLObject)module0065.$ic54$, (SubLObject)module0065.UNPROVIDED);
    }
    
    public static SubLObject f4766(final SubLObject var60) {
        SubLObject var61 = (SubLObject)module0065.NIL;
        SubLObject var62 = (SubLObject)module0065.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var60, var60, (SubLObject)module0065.$ic55$);
        var61 = var60.first();
        SubLObject var63 = var60.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var63, var60, (SubLObject)module0065.$ic55$);
        var62 = var63.first();
        var63 = var63.rest();
        if (module0065.NIL == var63) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0065.NIL == f4749(var62));
        }
        cdestructuring_bind.cdestructuring_bind_error(var60, (SubLObject)module0065.$ic55$);
        return (SubLObject)module0065.NIL;
    }
    
    public static SubLObject f4767(final SubLObject var13) {
        assert module0065.NIL != f4719(var13) : var13;
        final SubLObject var14 = f4740(var13);
        final SubLObject var15 = module0052.f3726(var14);
        return module0052.f3781(var15, (SubLObject)module0065.$ic56$, (SubLObject)module0065.UNPROVIDED);
    }
    
    public static SubLObject f4768(final SubLObject var13) {
        assert module0065.NIL != f4719(var13) : var13;
        final SubLObject var14 = f4738(var13);
        return module0052.f3732(var14);
    }
    
    public static SubLObject f4769(final SubLObject var13) {
        assert module0065.NIL != f4719(var13) : var13;
        final SubLObject var14 = f4738(var13);
        return module0052.f3734(var14);
    }
    
    public static SubLObject f4770(final SubLObject var20, final SubLObject var21) {
        SubLObject var23;
        final SubLObject var22 = var23 = var20.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0065.$ic57$);
        final SubLObject var24 = var23.rest();
        var23 = var23.first();
        SubLObject var25 = (SubLObject)module0065.NIL;
        SubLObject var26 = (SubLObject)module0065.NIL;
        SubLObject var27 = (SubLObject)module0065.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0065.$ic57$);
        var25 = var23.first();
        var23 = var23.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0065.$ic57$);
        var26 = var23.first();
        var23 = var23.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0065.$ic57$);
        var27 = var23.first();
        var23 = var23.rest();
        SubLObject var28 = (SubLObject)module0065.NIL;
        SubLObject var29 = var23;
        SubLObject var30 = (SubLObject)module0065.NIL;
        SubLObject var69_70 = (SubLObject)module0065.NIL;
        while (module0065.NIL != var29) {
            cdestructuring_bind.destructuring_bind_must_consp(var29, var22, (SubLObject)module0065.$ic57$);
            var69_70 = var29.first();
            var29 = var29.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var29, var22, (SubLObject)module0065.$ic57$);
            if (module0065.NIL == conses_high.member(var69_70, (SubLObject)module0065.$ic58$, (SubLObject)module0065.UNPROVIDED, (SubLObject)module0065.UNPROVIDED)) {
                var30 = (SubLObject)module0065.T;
            }
            if (var69_70 == module0065.$ic59$) {
                var28 = var29.first();
            }
            var29 = var29.rest();
        }
        if (module0065.NIL != var30 && module0065.NIL == var28) {
            cdestructuring_bind.cdestructuring_bind_error(var22, (SubLObject)module0065.$ic57$);
        }
        final SubLObject var31 = cdestructuring_bind.property_list_member((SubLObject)module0065.$ic60$, var23);
        final SubLObject var32 = (SubLObject)((module0065.NIL != var31) ? conses_high.cadr(var31) : module0065.$ic61$);
        final SubLObject var33 = cdestructuring_bind.property_list_member((SubLObject)module0065.$ic62$, var23);
        final SubLObject var34 = (SubLObject)((module0065.NIL != var33) ? conses_high.cadr(var33) : module0065.NIL);
        final SubLObject var35 = cdestructuring_bind.property_list_member((SubLObject)module0065.$ic63$, var23);
        final SubLObject var36 = (SubLObject)((module0065.NIL != var35) ? conses_high.cadr(var35) : module0065.NIL);
        final SubLObject var37 = cdestructuring_bind.property_list_member((SubLObject)module0065.$ic64$, var23);
        final SubLObject var38 = (SubLObject)((module0065.NIL != var37) ? conses_high.cadr(var37) : module0065.NIL);
        final SubLObject var39;
        var23 = (var39 = var24);
        return (SubLObject)ConsesLow.listS((SubLObject)module0065.$ic65$, (SubLObject)ConsesLow.list(new SubLObject[] { var25, var26, var27, module0065.$ic60$, var32, module0065.$ic62$, var34, module0065.$ic63$, var36, module0065.$ic64$, var38 }), ConsesLow.append(var39, (SubLObject)module0065.NIL));
    }
    
    public static SubLObject f4771(final SubLObject var20, final SubLObject var21) {
        SubLObject var23;
        final SubLObject var22 = var23 = var20.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0065.$ic57$);
        final SubLObject var24 = var23.rest();
        var23 = var23.first();
        SubLObject var25 = (SubLObject)module0065.NIL;
        SubLObject var26 = (SubLObject)module0065.NIL;
        SubLObject var27 = (SubLObject)module0065.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0065.$ic57$);
        var25 = var23.first();
        var23 = var23.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0065.$ic57$);
        var26 = var23.first();
        var23 = var23.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0065.$ic57$);
        var27 = var23.first();
        var23 = var23.rest();
        SubLObject var28 = (SubLObject)module0065.NIL;
        SubLObject var29 = var23;
        SubLObject var30 = (SubLObject)module0065.NIL;
        SubLObject var85_86 = (SubLObject)module0065.NIL;
        while (module0065.NIL != var29) {
            cdestructuring_bind.destructuring_bind_must_consp(var29, var22, (SubLObject)module0065.$ic57$);
            var85_86 = var29.first();
            var29 = var29.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var29, var22, (SubLObject)module0065.$ic57$);
            if (module0065.NIL == conses_high.member(var85_86, (SubLObject)module0065.$ic58$, (SubLObject)module0065.UNPROVIDED, (SubLObject)module0065.UNPROVIDED)) {
                var30 = (SubLObject)module0065.T;
            }
            if (var85_86 == module0065.$ic59$) {
                var28 = var29.first();
            }
            var29 = var29.rest();
        }
        if (module0065.NIL != var30 && module0065.NIL == var28) {
            cdestructuring_bind.cdestructuring_bind_error(var22, (SubLObject)module0065.$ic57$);
        }
        final SubLObject var31 = cdestructuring_bind.property_list_member((SubLObject)module0065.$ic60$, var23);
        final SubLObject var32 = (SubLObject)((module0065.NIL != var31) ? conses_high.cadr(var31) : module0065.$ic61$);
        final SubLObject var33 = cdestructuring_bind.property_list_member((SubLObject)module0065.$ic62$, var23);
        final SubLObject var34 = (SubLObject)((module0065.NIL != var33) ? conses_high.cadr(var33) : module0065.NIL);
        final SubLObject var35 = cdestructuring_bind.property_list_member((SubLObject)module0065.$ic63$, var23);
        final SubLObject var36 = (SubLObject)((module0065.NIL != var35) ? conses_high.cadr(var35) : module0065.NIL);
        final SubLObject var37 = cdestructuring_bind.property_list_member((SubLObject)module0065.$ic64$, var23);
        final SubLObject var38 = (SubLObject)((module0065.NIL != var37) ? conses_high.cadr(var37) : module0065.NIL);
        final SubLObject var39;
        var23 = (var39 = var24);
        if (module0065.NIL == var36) {
            final SubLObject var40 = (SubLObject)module0065.$ic66$;
            return (SubLObject)ConsesLow.list((SubLObject)module0065.$ic42$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var40, var27)), (SubLObject)ConsesLow.list((SubLObject)module0065.$ic67$, (SubLObject)ConsesLow.list((SubLObject)module0065.$ic68$, var40, var32), (SubLObject)ConsesLow.listS((SubLObject)module0065.$ic37$, (SubLObject)ConsesLow.list(var25, var26, var40, (SubLObject)module0065.$ic64$, var38, (SubLObject)module0065.$ic60$, var32), ConsesLow.append(var39, (SubLObject)module0065.NIL)), (SubLObject)ConsesLow.listS((SubLObject)module0065.$ic39$, (SubLObject)ConsesLow.list(new SubLObject[] { var25, var26, var40, module0065.$ic62$, var34, module0065.$ic60$, var32, module0065.$ic64$, var38 }), ConsesLow.append(var39, (SubLObject)module0065.NIL))));
        }
        final SubLObject var40 = (SubLObject)module0065.$ic69$;
        final SubLObject var41 = (SubLObject)module0065.$ic70$;
        final SubLObject var42 = (SubLObject)module0065.$ic71$;
        final SubLObject var43 = (SubLObject)module0065.$ic72$;
        return (SubLObject)ConsesLow.list((SubLObject)module0065.$ic42$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var40, var27), (SubLObject)ConsesLow.list(var41, var36), (SubLObject)ConsesLow.list(var42, (SubLObject)ConsesLow.list((SubLObject)module0065.$ic73$, var40)), reader.bq_cons(var43, (SubLObject)module0065.$ic74$)), (SubLObject)ConsesLow.listS((SubLObject)module0065.$ic75$, var41, (SubLObject)module0065.$ic76$), (SubLObject)ConsesLow.list((SubLObject)module0065.$ic77$, var41, (SubLObject)ConsesLow.listS((SubLObject)module0065.$ic51$, (SubLObject)ConsesLow.list(var25, var26, var40, (SubLObject)module0065.$ic64$, var38, (SubLObject)module0065.$ic62$, var34), (SubLObject)ConsesLow.list((SubLObject)module0065.$ic78$, var43, var42), (SubLObject)ConsesLow.list((SubLObject)module0065.$ic79$, var43), ConsesLow.append(var39, (SubLObject)module0065.NIL))));
    }
    
    public static SubLObject f4772(final SubLObject var13, final SubLObject var72) {
        if (module0065.NIL != f4773(var72)) {
            return f4735(var13);
        }
        return (SubLObject)module0065.NIL;
    }
    
    public static SubLObject f4774(final SubLObject var20, final SubLObject var21) {
        SubLObject var23;
        final SubLObject var22 = var23 = var20.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0065.$ic80$);
        final SubLObject var24 = var23.rest();
        var23 = var23.first();
        SubLObject var25 = (SubLObject)module0065.NIL;
        SubLObject var26 = (SubLObject)module0065.NIL;
        SubLObject var27 = (SubLObject)module0065.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0065.$ic80$);
        var25 = var23.first();
        var23 = var23.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0065.$ic80$);
        var26 = var23.first();
        var23 = var23.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0065.$ic80$);
        var27 = var23.first();
        var23 = var23.rest();
        SubLObject var28 = (SubLObject)module0065.NIL;
        SubLObject var29 = var23;
        SubLObject var30 = (SubLObject)module0065.NIL;
        SubLObject var101_102 = (SubLObject)module0065.NIL;
        while (module0065.NIL != var29) {
            cdestructuring_bind.destructuring_bind_must_consp(var29, var22, (SubLObject)module0065.$ic80$);
            var101_102 = var29.first();
            var29 = var29.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var29, var22, (SubLObject)module0065.$ic80$);
            if (module0065.NIL == conses_high.member(var101_102, (SubLObject)module0065.$ic81$, (SubLObject)module0065.UNPROVIDED, (SubLObject)module0065.UNPROVIDED)) {
                var30 = (SubLObject)module0065.T;
            }
            if (var101_102 == module0065.$ic59$) {
                var28 = var29.first();
            }
            var29 = var29.rest();
        }
        if (module0065.NIL != var30 && module0065.NIL == var28) {
            cdestructuring_bind.cdestructuring_bind_error(var22, (SubLObject)module0065.$ic80$);
        }
        final SubLObject var31 = cdestructuring_bind.property_list_member((SubLObject)module0065.$ic60$, var23);
        final SubLObject var32 = (SubLObject)((module0065.NIL != var31) ? conses_high.cadr(var31) : module0065.$ic61$);
        final SubLObject var33 = cdestructuring_bind.property_list_member((SubLObject)module0065.$ic63$, var23);
        final SubLObject var34 = (SubLObject)((module0065.NIL != var33) ? conses_high.cadr(var33) : module0065.NIL);
        final SubLObject var35 = cdestructuring_bind.property_list_member((SubLObject)module0065.$ic64$, var23);
        final SubLObject var36 = (SubLObject)((module0065.NIL != var35) ? conses_high.cadr(var35) : module0065.NIL);
        final SubLObject var37;
        var23 = (var37 = var24);
        if (module0065.NIL == var34) {
            final SubLObject var38 = (SubLObject)module0065.$ic82$;
            return (SubLObject)ConsesLow.list((SubLObject)module0065.$ic42$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var38, var27)), (SubLObject)ConsesLow.list((SubLObject)module0065.$ic67$, (SubLObject)ConsesLow.list((SubLObject)module0065.$ic83$, var38, var32), (SubLObject)ConsesLow.list((SubLObject)module0065.$ic84$, (SubLObject)ConsesLow.list(var25, var26, (SubLObject)ConsesLow.list((SubLObject)module0065.$ic36$, var38), (SubLObject)module0065.$ic64$, var36), (SubLObject)ConsesLow.listS((SubLObject)module0065.$ic67$, (SubLObject)ConsesLow.list((SubLObject)module0065.$ic85$, (SubLObject)ConsesLow.list((SubLObject)module0065.$ic50$, var26), (SubLObject)ConsesLow.list((SubLObject)module0065.$ic86$, var32)), (SubLObject)ConsesLow.list((SubLObject)module0065.$ic87$, (SubLObject)ConsesLow.list((SubLObject)module0065.$ic50$, var26), (SubLObject)ConsesLow.list((SubLObject)module0065.$ic88$, var26, var32)), ConsesLow.append(var37, (SubLObject)module0065.NIL)))));
        }
        final SubLObject var38 = (SubLObject)module0065.$ic89$;
        final SubLObject var39 = (SubLObject)module0065.$ic90$;
        final SubLObject var40 = (SubLObject)module0065.$ic91$;
        final SubLObject var41 = (SubLObject)module0065.$ic92$;
        return (SubLObject)ConsesLow.list((SubLObject)module0065.$ic42$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var38, var27), (SubLObject)ConsesLow.list(var39, var34), (SubLObject)ConsesLow.list(var40, (SubLObject)ConsesLow.list((SubLObject)module0065.$ic93$, var38)), reader.bq_cons(var41, (SubLObject)module0065.$ic74$)), (SubLObject)ConsesLow.listS((SubLObject)module0065.$ic75$, var39, (SubLObject)module0065.$ic76$), (SubLObject)ConsesLow.list((SubLObject)module0065.$ic77$, var39, (SubLObject)ConsesLow.listS((SubLObject)module0065.$ic37$, (SubLObject)ConsesLow.list(var25, var26, var38, (SubLObject)module0065.$ic64$, var36), (SubLObject)ConsesLow.list((SubLObject)module0065.$ic78$, var41, var40), (SubLObject)ConsesLow.list((SubLObject)module0065.$ic79$, var41), ConsesLow.append(var37, (SubLObject)module0065.NIL))));
    }
    
    public static SubLObject f4775(final SubLObject var13, final SubLObject var72) {
        if (module0065.NIL != f4773(var72)) {
            return Numbers.numE((SubLObject)module0065.ZERO_INTEGER, f4736(var13));
        }
        return (SubLObject)module0065.NIL;
    }
    
    public static SubLObject f4773(final SubLObject var72) {
        return Equality.eq((SubLObject)module0065.$ic61$, var72);
    }
    
    public static SubLObject f4776(final SubLObject var20, final SubLObject var21) {
        final SubLThread var22 = SubLProcess.currentSubLThread();
        SubLObject var24;
        final SubLObject var23 = var24 = var20.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var24, var23, (SubLObject)module0065.$ic57$);
        final SubLObject var25 = var24.rest();
        var24 = var24.first();
        SubLObject var26 = (SubLObject)module0065.NIL;
        SubLObject var27 = (SubLObject)module0065.NIL;
        SubLObject var28 = (SubLObject)module0065.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var24, var23, (SubLObject)module0065.$ic57$);
        var26 = var24.first();
        var24 = var24.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var24, var23, (SubLObject)module0065.$ic57$);
        var27 = var24.first();
        var24 = var24.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var24, var23, (SubLObject)module0065.$ic57$);
        var28 = var24.first();
        var24 = var24.rest();
        SubLObject var29 = (SubLObject)module0065.NIL;
        SubLObject var30 = var24;
        SubLObject var31 = (SubLObject)module0065.NIL;
        SubLObject var112_113 = (SubLObject)module0065.NIL;
        while (module0065.NIL != var30) {
            cdestructuring_bind.destructuring_bind_must_consp(var30, var23, (SubLObject)module0065.$ic57$);
            var112_113 = var30.first();
            var30 = var30.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var30, var23, (SubLObject)module0065.$ic57$);
            if (module0065.NIL == conses_high.member(var112_113, (SubLObject)module0065.$ic58$, (SubLObject)module0065.UNPROVIDED, (SubLObject)module0065.UNPROVIDED)) {
                var31 = (SubLObject)module0065.T;
            }
            if (var112_113 == module0065.$ic59$) {
                var29 = var30.first();
            }
            var30 = var30.rest();
        }
        if (module0065.NIL != var31 && module0065.NIL == var29) {
            cdestructuring_bind.cdestructuring_bind_error(var23, (SubLObject)module0065.$ic57$);
        }
        final SubLObject var32 = cdestructuring_bind.property_list_member((SubLObject)module0065.$ic60$, var24);
        final SubLObject var33 = (SubLObject)((module0065.NIL != var32) ? conses_high.cadr(var32) : module0065.$ic61$);
        final SubLObject var34 = cdestructuring_bind.property_list_member((SubLObject)module0065.$ic62$, var24);
        final SubLObject var35 = (SubLObject)((module0065.NIL != var34) ? conses_high.cadr(var34) : module0065.NIL);
        final SubLObject var36 = cdestructuring_bind.property_list_member((SubLObject)module0065.$ic63$, var24);
        final SubLObject var37 = (SubLObject)((module0065.NIL != var36) ? conses_high.cadr(var36) : module0065.NIL);
        final SubLObject var38 = cdestructuring_bind.property_list_member((SubLObject)module0065.$ic64$, var24);
        final SubLObject var39 = (SubLObject)((module0065.NIL != var38) ? conses_high.cadr(var38) : module0065.NIL);
        final SubLObject var40;
        var24 = (var40 = var25);
        if (module0065.NIL != var37) {
            final SubLObject var41 = (SubLObject)module0065.$ic95$;
            final SubLObject var42 = (SubLObject)module0065.$ic96$;
            final SubLObject var43 = (SubLObject)module0065.$ic97$;
            final SubLObject var44 = (SubLObject)module0065.$ic98$;
            return (SubLObject)ConsesLow.list((SubLObject)module0065.$ic42$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var41, var28), (SubLObject)ConsesLow.list(var42, var37), (SubLObject)ConsesLow.list(var43, (SubLObject)ConsesLow.list((SubLObject)module0065.$ic99$, var41)), reader.bq_cons(var44, (SubLObject)module0065.$ic74$)), (SubLObject)ConsesLow.listS((SubLObject)module0065.$ic75$, var42, (SubLObject)module0065.$ic76$), (SubLObject)ConsesLow.list((SubLObject)module0065.$ic77$, var42, (SubLObject)ConsesLow.listS((SubLObject)module0065.$ic39$, (SubLObject)ConsesLow.list(var26, var27, var41, (SubLObject)module0065.$ic62$, var35, (SubLObject)module0065.$ic64$, var39), (SubLObject)ConsesLow.list((SubLObject)module0065.$ic78$, var44, var43), (SubLObject)ConsesLow.list((SubLObject)module0065.$ic79$, var44), ConsesLow.append(var40, (SubLObject)module0065.NIL))));
        }
        if (module0065.NIL != var35 && module0065.T != var35 && module0065.NIL != var35) {
            final SubLObject var41 = (SubLObject)module0065.$ic100$;
            return (SubLObject)ConsesLow.list((SubLObject)module0065.$ic42$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var41, var28)), (SubLObject)ConsesLow.list((SubLObject)module0065.$ic101$, var35, (SubLObject)ConsesLow.listS((SubLObject)module0065.$ic39$, (SubLObject)ConsesLow.list(var26, var27, var41, (SubLObject)module0065.$ic62$, (SubLObject)module0065.T, (SubLObject)module0065.$ic64$, var39), ConsesLow.append(var40, (SubLObject)module0065.NIL)), (SubLObject)ConsesLow.listS((SubLObject)module0065.$ic39$, (SubLObject)ConsesLow.list(var26, var27, var41, (SubLObject)module0065.$ic62$, (SubLObject)module0065.NIL, (SubLObject)module0065.$ic64$, var39), ConsesLow.append(var40, (SubLObject)module0065.NIL))));
        }
        if (module0065.T == var35) {
            final SubLObject var41 = (SubLObject)module0065.$ic102$;
            final SubLObject var45 = (SubLObject)module0065.$ic103$;
            final SubLObject var46 = (SubLObject)module0065.$ic104$;
            final SubLObject var47 = (SubLObject)module0065.$ic105$;
            return (SubLObject)ConsesLow.list((SubLObject)module0065.$ic42$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var41, var28)), (SubLObject)ConsesLow.list((SubLObject)module0065.$ic67$, (SubLObject)ConsesLow.list((SubLObject)module0065.$ic85$, (SubLObject)ConsesLow.list((SubLObject)module0065.$ic106$, var41), (SubLObject)ConsesLow.list((SubLObject)module0065.$ic86$, var33)), (SubLObject)ConsesLow.list((SubLObject)module0065.$ic42$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var45, (SubLObject)ConsesLow.list((SubLObject)module0065.$ic38$, var41)), (SubLObject)ConsesLow.list(var26, (SubLObject)ConsesLow.list((SubLObject)module0065.$ic107$, var41)), (SubLObject)ConsesLow.list(var46, (SubLObject)ConsesLow.list((SubLObject)module0065.$ic108$, var41)), (SubLObject)ConsesLow.list(var47, (SubLObject)ConsesLow.list((SubLObject)module0065.$ic109$, (SubLObject)ConsesLow.list((SubLObject)module0065.$ic86$, var33), var33))), (SubLObject)ConsesLow.list((SubLObject)module0065.$ic110$, (SubLObject)ConsesLow.list((SubLObject)module0065.$ic85$, (SubLObject)ConsesLow.list((SubLObject)module0065.$ic111$, var26, var46), (SubLObject)ConsesLow.list((SubLObject)module0065.$ic112$, var39)), (SubLObject)ConsesLow.list((SubLObject)module0065.$ic42$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var27, (SubLObject)ConsesLow.list((SubLObject)module0065.$ic113$, var26, var45, var47))), (SubLObject)ConsesLow.listS((SubLObject)module0065.$ic67$, (SubLObject)ConsesLow.list((SubLObject)module0065.$ic85$, (SubLObject)ConsesLow.list((SubLObject)module0065.$ic86$, var33), (SubLObject)ConsesLow.list((SubLObject)module0065.$ic50$, var27)), ConsesLow.append(var40, (SubLObject)module0065.NIL))), (SubLObject)ConsesLow.list((SubLObject)module0065.$ic79$, var26)))));
        }
        if (module0065.NIL == Errors.$ignore_mustsP$.getDynamicValue(var22) && module0065.$ic61$ != var33) {
            Errors.error((SubLObject)module0065.$ic114$, var33);
        }
        final SubLObject var41 = (SubLObject)module0065.$ic115$;
        return (SubLObject)ConsesLow.list((SubLObject)module0065.$ic42$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var41, var28)), (SubLObject)ConsesLow.list((SubLObject)module0065.$ic67$, (SubLObject)ConsesLow.list((SubLObject)module0065.$ic106$, var41), (SubLObject)ConsesLow.listS((SubLObject)module0065.$ic116$, (SubLObject)ConsesLow.list(var26, var27, (SubLObject)ConsesLow.list((SubLObject)module0065.$ic38$, var41), (SubLObject)module0065.$ic64$, var39), ConsesLow.append(var40, (SubLObject)module0065.NIL))));
    }
    
    public static SubLObject f4777(final SubLObject var13) {
        return Numbers.numE((SubLObject)module0065.ZERO_INTEGER, f4737(var13));
    }
    
    public static SubLObject f4778(final SubLObject var13) {
        final SubLObject var14 = f4738(var13);
        final SubLObject var15 = module0030.f1625(var14);
        return Sort.sort(var15, Symbols.symbol_function((SubLObject)module0065.$ic111$), (SubLObject)module0065.UNPROVIDED);
    }
    
    public static SubLObject f4779(final SubLObject var20, final SubLObject var21) {
        SubLObject var23;
        final SubLObject var22 = var23 = var20.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0065.$ic57$);
        final SubLObject var24 = var23.rest();
        var23 = var23.first();
        SubLObject var25 = (SubLObject)module0065.NIL;
        SubLObject var26 = (SubLObject)module0065.NIL;
        SubLObject var27 = (SubLObject)module0065.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0065.$ic57$);
        var25 = var23.first();
        var23 = var23.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0065.$ic57$);
        var26 = var23.first();
        var23 = var23.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0065.$ic57$);
        var27 = var23.first();
        var23 = var23.rest();
        SubLObject var28 = (SubLObject)module0065.NIL;
        SubLObject var29 = var23;
        SubLObject var30 = (SubLObject)module0065.NIL;
        SubLObject var127_128 = (SubLObject)module0065.NIL;
        while (module0065.NIL != var29) {
            cdestructuring_bind.destructuring_bind_must_consp(var29, var22, (SubLObject)module0065.$ic57$);
            var127_128 = var29.first();
            var29 = var29.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var29, var22, (SubLObject)module0065.$ic57$);
            if (module0065.NIL == conses_high.member(var127_128, (SubLObject)module0065.$ic58$, (SubLObject)module0065.UNPROVIDED, (SubLObject)module0065.UNPROVIDED)) {
                var30 = (SubLObject)module0065.T;
            }
            if (var127_128 == module0065.$ic59$) {
                var28 = var29.first();
            }
            var29 = var29.rest();
        }
        if (module0065.NIL != var30 && module0065.NIL == var28) {
            cdestructuring_bind.cdestructuring_bind_error(var22, (SubLObject)module0065.$ic57$);
        }
        final SubLObject var31 = cdestructuring_bind.property_list_member((SubLObject)module0065.$ic60$, var23);
        final SubLObject var32 = (SubLObject)((module0065.NIL != var31) ? conses_high.cadr(var31) : module0065.$ic61$);
        final SubLObject var33 = cdestructuring_bind.property_list_member((SubLObject)module0065.$ic62$, var23);
        final SubLObject var34 = (SubLObject)((module0065.NIL != var33) ? conses_high.cadr(var33) : module0065.NIL);
        final SubLObject var35 = cdestructuring_bind.property_list_member((SubLObject)module0065.$ic63$, var23);
        final SubLObject var36 = (SubLObject)((module0065.NIL != var35) ? conses_high.cadr(var35) : module0065.NIL);
        final SubLObject var37 = cdestructuring_bind.property_list_member((SubLObject)module0065.$ic64$, var23);
        final SubLObject var38 = (SubLObject)((module0065.NIL != var37) ? conses_high.cadr(var37) : module0065.NIL);
        final SubLObject var39;
        var23 = (var39 = var24);
        if (!var27.isAtom()) {
            final SubLObject var40 = (SubLObject)module0065.$ic118$;
            return (SubLObject)ConsesLow.list((SubLObject)module0065.$ic42$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var40, var27)), (SubLObject)ConsesLow.listS((SubLObject)module0065.$ic119$, (SubLObject)ConsesLow.list(new SubLObject[] { var25, var26, var40, module0065.$ic60$, var32, module0065.$ic62$, var34, module0065.$ic63$, var36, module0065.$ic64$, var38 }), ConsesLow.append(var39, (SubLObject)module0065.NIL)));
        }
        if (!var36.isAtom()) {
            final SubLObject var41 = (SubLObject)module0065.$ic120$;
            return (SubLObject)ConsesLow.list((SubLObject)module0065.$ic42$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var41, var36)), (SubLObject)ConsesLow.listS((SubLObject)module0065.$ic119$, (SubLObject)ConsesLow.list(new SubLObject[] { var25, var26, var27, module0065.$ic60$, var32, module0065.$ic62$, var34, module0065.$ic63$, var41, module0065.$ic64$, var38 }), ConsesLow.append(var39, (SubLObject)module0065.NIL)));
        }
        if (module0065.NIL != var36) {
            final SubLObject var42 = (SubLObject)module0065.$ic121$;
            final SubLObject var43 = (SubLObject)module0065.$ic122$;
            return (SubLObject)ConsesLow.list((SubLObject)module0065.$ic42$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var42, (SubLObject)ConsesLow.list((SubLObject)module0065.$ic73$, var27)), reader.bq_cons(var43, (SubLObject)module0065.$ic74$)), (SubLObject)ConsesLow.listS((SubLObject)module0065.$ic75$, var36, (SubLObject)module0065.$ic76$), (SubLObject)ConsesLow.list((SubLObject)module0065.$ic77$, var36, (SubLObject)ConsesLow.listS((SubLObject)module0065.$ic119$, (SubLObject)ConsesLow.list(new SubLObject[] { var25, var26, var27, module0065.$ic60$, var32, module0065.$ic62$, var34, module0065.$ic64$, var38 }), (SubLObject)ConsesLow.list((SubLObject)module0065.$ic78$, var43, var42), (SubLObject)ConsesLow.list((SubLObject)module0065.$ic79$, var43), ConsesLow.append(var39, (SubLObject)module0065.NIL))));
        }
        if (!var32.isAtom()) {
            final SubLObject var44 = (SubLObject)module0065.$ic123$;
            return (SubLObject)ConsesLow.list((SubLObject)module0065.$ic42$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var44, var32)), (SubLObject)ConsesLow.listS((SubLObject)module0065.$ic119$, (SubLObject)ConsesLow.list(new SubLObject[] { var25, var26, var27, module0065.$ic60$, var44, module0065.$ic62$, var34, module0065.$ic64$, var38 }), ConsesLow.append(var39, (SubLObject)module0065.NIL)));
        }
        if (!var34.isAtom()) {
            final SubLObject var45 = (SubLObject)module0065.$ic124$;
            return (SubLObject)ConsesLow.list((SubLObject)module0065.$ic42$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var45, var34)), (SubLObject)ConsesLow.listS((SubLObject)module0065.$ic119$, (SubLObject)ConsesLow.list(new SubLObject[] { var25, var26, var27, module0065.$ic60$, var32, module0065.$ic62$, var45, module0065.$ic64$, var38 }), ConsesLow.append(var39, (SubLObject)module0065.NIL)));
        }
        final SubLObject var46 = (SubLObject)module0065.$ic125$;
        SubLObject var47 = var25;
        if (module0065.NIL != var38) {
            var47 = (SubLObject)ConsesLow.list((SubLObject)module0065.$ic85$, var47, (SubLObject)ConsesLow.list((SubLObject)module0065.$ic112$, var38));
        }
        return (SubLObject)ConsesLow.list((SubLObject)module0065.$ic67$, (SubLObject)ConsesLow.list((SubLObject)module0065.$ic68$, var27, var32), (SubLObject)ConsesLow.list((SubLObject)module0065.$ic42$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var25, (SubLObject)ConsesLow.listS((SubLObject)module0065.$ic126$, var27, var34, (SubLObject)module0065.$ic127$)), (SubLObject)ConsesLow.list(var46, (SubLObject)ConsesLow.listS((SubLObject)module0065.$ic128$, var27, var34, var25, (SubLObject)module0065.$ic129$)), var26), (SubLObject)ConsesLow.list((SubLObject)module0065.$ic110$, var47, (SubLObject)ConsesLow.list((SubLObject)module0065.$ic88$, var26, (SubLObject)ConsesLow.list((SubLObject)module0065.$ic130$, var27, var32, var25, var46)), (SubLObject)ConsesLow.listS((SubLObject)module0065.$ic87$, (SubLObject)ConsesLow.list((SubLObject)module0065.$ic131$, var26, var32), ConsesLow.append(var39, (SubLObject)module0065.NIL)), (SubLObject)ConsesLow.list((SubLObject)module0065.$ic88$, var25, (SubLObject)ConsesLow.list((SubLObject)module0065.$ic126$, var27, var34, var25, var46)), (SubLObject)ConsesLow.list((SubLObject)module0065.$ic88$, var46, (SubLObject)ConsesLow.list((SubLObject)module0065.$ic128$, var27, var34, var25, var46)))));
    }
    
    public static SubLObject f4780(final SubLObject var13, final SubLObject var137, final SubLObject var138, final SubLObject var139) {
        if (module0065.NIL == var139) {
            return (SubLObject)module0065.ZERO_INTEGER;
        }
        if (module0065.NIL == var138) {
            return (SubLObject)module0065.NIL;
        }
        final SubLObject var140 = module0048.f_1X(var138);
        if (var140.numGE(f4734(var13))) {
            return (SubLObject)module0065.NIL;
        }
        return var140;
    }
    
    public static SubLObject f4781(final SubLObject var13, final SubLObject var137, final SubLObject var42, final SubLObject var139) {
        if (module0065.NIL == var42) {
            return (SubLObject)module0065.NIL;
        }
        if (module0065.NIL != f4752(var13, var42)) {
            return var139.isVector() ? var139 : f4740(var13);
        }
        if (var139.isVector()) {
            return f4738(var13);
        }
        if (module0065.NIL == var139) {
            return (SubLObject)module0065.NIL;
        }
        return var139;
    }
    
    public static SubLObject f4782(final SubLObject var13, final SubLObject var72, final SubLObject var42, final SubLObject var139) {
        SubLObject var140 = (SubLObject)module0065.NIL;
        if (var139.isVector()) {
            var140 = Vectors.aref(var139, var42);
        }
        else if (var139.isHashtable()) {
            var140 = Hashtables.gethash_without_values(var42, var139, f4748());
        }
        else {
            Errors.error((SubLObject)module0065.$ic132$, var139);
        }
        if (module0065.NIL != f4749(var140)) {
            var140 = var72;
        }
        return var140;
    }
    
    public static SubLObject f4783(final SubLObject var46, final SubLObject var72) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0065.NIL == f4773(var72) || !var46.eql(var72));
    }
    
    public static SubLObject f4784(final SubLObject var46, final SubLObject var2) {
        return f4785(var46, var2);
    }
    
    public static SubLObject f4785(final SubLObject var13, final SubLObject var2) {
        module0021.f1110(module0065.$g1082$.getGlobalValue(), var2);
        f4786(var13, var2);
        return var13;
    }
    
    public static SubLObject f4786(final SubLObject var13, final SubLObject var2) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        final SubLObject var16;
        final SubLObject var15 = var16 = f4743(var13);
        SubLObject var17 = (SubLObject)module0065.NIL;
        try {
            var17 = Locks.seize_lock(var16);
            final SubLObject var18 = f4736(var13);
            final SubLObject var19 = f4737(var13);
            SubLObject var20 = (SubLObject)module0065.NIL;
            module0021.f1038(f4733(var13), var2);
            module0021.f1038(f4739(var13), var2);
            module0021.f1038(var18, var2);
            module0021.f1038(var19, var2);
            var20 = (SubLObject)module0065.ZERO_INTEGER;
            if (module0065.NIL == f4775(var13, (SubLObject)module0065.$ic61$)) {
                final SubLObject var21 = f4740(var13);
                final SubLObject var22 = (SubLObject)module0065.NIL;
                SubLObject var23;
                SubLObject var24;
                SubLObject var25;
                SubLObject var26;
                for (var23 = Sequences.length(var21), var24 = (SubLObject)module0065.NIL, var24 = (SubLObject)module0065.ZERO_INTEGER; var24.numL(var23); var24 = Numbers.add(var24, (SubLObject)module0065.ONE_INTEGER)) {
                    var25 = ((module0065.NIL != var22) ? Numbers.subtract(var23, var24, (SubLObject)module0065.ONE_INTEGER) : var24);
                    var26 = Vectors.aref(var21, var25);
                    if (module0065.NIL == f4749(var26) || module0065.NIL == f4773((SubLObject)module0065.$ic61$)) {
                        if (module0065.NIL != f4749(var26)) {
                            var26 = (SubLObject)module0065.$ic61$;
                        }
                        module0021.f1038(var25, var2);
                        module0021.f1038(var26, var2);
                        var20 = Numbers.add(var20, (SubLObject)module0065.ONE_INTEGER);
                    }
                }
            }
            if (module0065.NIL == Errors.$ignore_mustsP$.getDynamicValue(var14) && !var20.numE(var18)) {
                Errors.error((SubLObject)module0065.$ic136$, var18, var20);
            }
            var20 = (SubLObject)module0065.ZERO_INTEGER;
            if (module0065.NIL == f4777(var13)) {
                final SubLObject var27 = f4738(var13);
                SubLObject var28 = (SubLObject)module0065.NIL;
                SubLObject var29 = (SubLObject)module0065.NIL;
                final Iterator var30 = Hashtables.getEntrySetIterator(var27);
                try {
                    while (Hashtables.iteratorHasNext(var30)) {
                        final Map.Entry var31 = Hashtables.iteratorNextEntry(var30);
                        var28 = Hashtables.getEntryKey(var31);
                        var29 = Hashtables.getEntryValue(var31);
                        module0021.f1038(var28, var2);
                        module0021.f1038(var29, var2);
                        var20 = Numbers.add(var20, (SubLObject)module0065.ONE_INTEGER);
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var30);
                }
            }
            if (module0065.NIL == Errors.$ignore_mustsP$.getDynamicValue(var14) && !var20.numE(var19)) {
                Errors.error((SubLObject)module0065.$ic137$, var19, var20);
            }
        }
        finally {
            if (module0065.NIL != var17) {
                Locks.release_lock(var16);
            }
        }
        return var13;
    }
    
    public static SubLObject f4787(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0021.f1060(var2, (SubLObject)module0065.UNPROVIDED, (SubLObject)module0065.UNPROVIDED);
        final SubLObject var5 = module0021.f1060(var2, (SubLObject)module0065.UNPROVIDED, (SubLObject)module0065.UNPROVIDED);
        final SubLObject var6 = module0021.f1060(var2, (SubLObject)module0065.UNPROVIDED, (SubLObject)module0065.UNPROVIDED);
        final SubLObject var7 = module0021.f1060(var2, (SubLObject)module0065.UNPROVIDED, (SubLObject)module0065.UNPROVIDED);
        final SubLObject var8 = f4745(var5, (SubLObject)module0065.UNPROVIDED);
        SubLObject var9;
        SubLObject var10;
        SubLObject var11;
        for (var9 = (SubLObject)module0065.NIL, var9 = (SubLObject)module0065.ZERO_INTEGER; var9.numL(var6); var9 = Numbers.add(var9, (SubLObject)module0065.ONE_INTEGER)) {
            var10 = module0021.f1060(var2, (SubLObject)module0065.UNPROVIDED, (SubLObject)module0065.UNPROVIDED);
            var11 = module0021.f1060(var2, (SubLObject)module0065.UNPROVIDED, (SubLObject)module0065.UNPROVIDED);
            f4753(var8, var10, var11);
        }
        for (var9 = (SubLObject)module0065.NIL, var9 = (SubLObject)module0065.ZERO_INTEGER; var9.numL(var7); var9 = Numbers.add(var9, (SubLObject)module0065.ONE_INTEGER)) {
            var10 = module0021.f1060(var2, (SubLObject)module0065.UNPROVIDED, (SubLObject)module0065.UNPROVIDED);
            var11 = module0021.f1060(var2, (SubLObject)module0065.UNPROVIDED, (SubLObject)module0065.UNPROVIDED);
            f4753(var8, var10, var11);
        }
        if (module0065.NIL == Errors.$ignore_mustsP$.getDynamicValue(var3) && !var4.numE(f4733(var8))) {
            Errors.error((SubLObject)module0065.$ic138$, var4, f4733(var8));
        }
        return var8;
    }
    
    public static SubLObject f4788(final SubLObject var156, final SubLObject var157, SubLObject var158, SubLObject var159) {
        if (var158 == module0065.UNPROVIDED) {
            var158 = (SubLObject)module0065.$ic148$;
        }
        if (var159 == module0065.UNPROVIDED) {
            var159 = Symbols.symbol_function((SubLObject)module0065.EQUAL);
        }
        final SubLThread var160 = SubLProcess.currentSubLThread();
        final SubLObject var161 = f4789(var156, var157, var158);
        SubLObject var162 = (SubLObject)module0065.NIL;
        SubLObject var163;
        SubLObject var164;
        for (var163 = Numbers.max((SubLObject)module0065.FIVE_INTEGER, Numbers.integerDivide(var156, (SubLObject)module0065.TWENTY_INTEGER)), var164 = (SubLObject)module0065.NIL, var164 = (SubLObject)module0065.ZERO_INTEGER; var164.numL(var163); var164 = Numbers.add(var164, (SubLObject)module0065.ONE_INTEGER)) {
            f4761(var161, random.random(var156));
        }
        var162 = module0069.f4956(var161);
        if (module0065.NIL == Errors.$ignore_mustsP$.getDynamicValue(var160) && module0065.NIL == f4719(var162)) {
            Errors.error((SubLObject)module0065.$ic149$, var162);
        }
        if (module0065.NIL == Errors.$ignore_mustsP$.getDynamicValue(var160) && !f4733(var161).numE(f4733(var162))) {
            Errors.error((SubLObject)module0065.$ic150$, var161, var162);
        }
        return (SubLObject)module0065.$ic151$;
    }
    
    public static SubLObject f4790(final SubLObject var13) {
        return Numbers.numLE(f4734(var13), f4739(var13));
    }
    
    public static SubLObject f4760(final SubLObject var13, SubLObject var162) {
        if (var162 == module0065.UNPROVIDED) {
            var162 = (SubLObject)module0065.NIL;
        }
        assert module0065.NIL != f4719(var13) : var13;
        if (module0065.NIL != var162 && !module0065.areAssertionsDisabledFor(me) && module0065.NIL == module0004.f106(var162)) {
            throw new AssertionError(var162);
        }
        final SubLObject var164;
        final SubLObject var163 = var164 = f4743(var13);
        SubLObject var165 = (SubLObject)module0065.NIL;
        try {
            var165 = Locks.seize_lock(var164);
            final SubLObject var166 = f4734(var13);
            final SubLObject var167 = (module0065.NIL != var162) ? Numbers.max(var162, var166) : var166;
            final SubLObject var168 = f4738(var13);
            final SubLObject var169 = f4740(var13);
            final SubLObject var170 = Sequences.length(var169);
            if (var167.numG(var170)) {
                final SubLObject var171 = Vectors.make_vector(var167, (SubLObject)module0065.NIL);
                Sequences.replace(var171, var169, (SubLObject)module0065.ZERO_INTEGER, Numbers.min(var167, var170), (SubLObject)module0065.ZERO_INTEGER, Numbers.min(var167, var170));
                SubLObject var172 = (SubLObject)module0065.NIL;
                SubLObject var173 = (SubLObject)module0065.NIL;
                final Iterator var174 = Hashtables.getEntrySetIterator(var168);
                try {
                    while (Hashtables.iteratorHasNext(var174)) {
                        final Map.Entry var175 = Hashtables.iteratorNextEntry(var174);
                        var172 = Hashtables.getEntryKey(var175);
                        var173 = Hashtables.getEntryValue(var175);
                        Vectors.set_aref(var171, var172, var173);
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var174);
                }
                f4728(var13, var171);
                Hashtables.clrhash(var168);
            }
        }
        finally {
            if (module0065.NIL != var165) {
                Locks.release_lock(var164);
            }
        }
        return var13;
    }
    
    public static SubLObject f4759(final SubLObject var13) {
        return Numbers.zerop(Sequences.length(f4740(var13)));
    }
    
    public static SubLObject f4791(final SubLObject var13) {
        assert module0065.NIL != f4719(var13) : var13;
        final SubLObject var15;
        final SubLObject var14 = var15 = f4743(var13);
        SubLObject var16 = (SubLObject)module0065.NIL;
        try {
            var16 = Locks.seize_lock(var15);
            final SubLObject var17 = f4738(var13);
            if (module0065.NIL == f4775(var13, (SubLObject)module0065.$ic61$)) {
                final SubLObject var18 = f4740(var13);
                final SubLObject var19 = (SubLObject)module0065.NIL;
                SubLObject var20;
                SubLObject var21;
                SubLObject var22;
                SubLObject var23;
                for (var20 = Sequences.length(var18), var21 = (SubLObject)module0065.NIL, var21 = (SubLObject)module0065.ZERO_INTEGER; var21.numL(var20); var21 = Numbers.add(var21, (SubLObject)module0065.ONE_INTEGER)) {
                    var22 = ((module0065.NIL != var19) ? Numbers.subtract(var20, var21, (SubLObject)module0065.ONE_INTEGER) : var21);
                    var23 = Vectors.aref(var18, var22);
                    if (module0065.NIL == f4749(var23) || module0065.NIL == f4773((SubLObject)module0065.$ic61$)) {
                        if (module0065.NIL != f4749(var23)) {
                            var23 = (SubLObject)module0065.$ic61$;
                        }
                        Hashtables.sethash(var22, var17, var23);
                    }
                }
            }
            f4728(var13, Vectors.make_vector((SubLObject)module0065.ZERO_INTEGER, (SubLObject)module0065.UNPROVIDED));
        }
        finally {
            if (module0065.NIL != var16) {
                Locks.release_lock(var15);
            }
        }
        assert module0065.NIL != f4759(var13) : var13;
        return var13;
    }
    
    public static SubLObject f4792(final SubLObject var13) {
        return Numbers.numE(f4734(var13), f4733(var13));
    }
    
    public static SubLObject f4793(final SubLObject var13, SubLObject var170) {
        if (var170 == module0065.UNPROVIDED) {
            var170 = (SubLObject)module0065.NIL;
        }
        final SubLThread var171 = SubLProcess.currentSubLThread();
        assert module0065.NIL != f4719(var13) : var13;
        if (module0065.NIL != f4792(var13)) {
            return var13;
        }
        final SubLObject var173;
        final SubLObject var172 = var173 = f4743(var13);
        SubLObject var174 = (SubLObject)module0065.NIL;
        try {
            var174 = Locks.seize_lock(var173);
            final SubLObject var175 = f4733(var13);
            final SubLObject var176 = Vectors.make_vector(var175, (SubLObject)module0065.NIL);
            SubLObject var177 = (SubLObject)module0065.ZERO_INTEGER;
            final SubLObject var178 = (SubLObject)module0065.$ic153$;
            final SubLObject var179 = f4733(var13);
            SubLObject var180 = (SubLObject)module0065.ZERO_INTEGER;
            assert module0065.NIL != Types.stringp(var178) : var178;
            final SubLObject var181 = module0012.$g75$.currentBinding(var171);
            final SubLObject var182 = module0012.$g76$.currentBinding(var171);
            final SubLObject var183 = module0012.$g77$.currentBinding(var171);
            final SubLObject var184 = module0012.$g78$.currentBinding(var171);
            try {
                module0012.$g75$.bind((SubLObject)module0065.ZERO_INTEGER, var171);
                module0012.$g76$.bind((SubLObject)module0065.NIL, var171);
                module0012.$g77$.bind((SubLObject)module0065.T, var171);
                module0012.$g78$.bind(Time.get_universal_time(), var171);
                module0012.f478(var178);
                if (module0065.NIL == f4772(var13, (SubLObject)module0065.$ic61$)) {
                    if (module0065.NIL == f4775(var13, (SubLObject)module0065.$ic61$)) {
                        final SubLObject var185 = f4740(var13);
                        final SubLObject var186 = (SubLObject)module0065.NIL;
                        SubLObject var187;
                        SubLObject var188;
                        SubLObject var189;
                        SubLObject var190;
                        for (var187 = Sequences.length(var185), var188 = (SubLObject)module0065.NIL, var188 = (SubLObject)module0065.ZERO_INTEGER; var188.numL(var187); var188 = Numbers.add(var188, (SubLObject)module0065.ONE_INTEGER)) {
                            var189 = ((module0065.NIL != var186) ? Numbers.subtract(var187, var188, (SubLObject)module0065.ONE_INTEGER) : var188);
                            var190 = Vectors.aref(var185, var189);
                            if (module0065.NIL == f4749(var190) || module0065.NIL == f4773((SubLObject)module0065.$ic61$)) {
                                if (module0065.NIL != f4749(var190)) {
                                    var190 = (SubLObject)module0065.$ic61$;
                                }
                                module0012.note_percent_progress(var180, var179);
                                var180 = Numbers.add(var180, (SubLObject)module0065.ONE_INTEGER);
                                Vectors.set_aref(var176, var177, var190);
                                var177 = Numbers.add(var177, (SubLObject)module0065.ONE_INTEGER);
                            }
                        }
                    }
                    if (module0065.NIL == f4777(var13)) {
                        final SubLObject var191 = f4738(var13);
                        SubLObject var192 = (SubLObject)module0065.NIL;
                        SubLObject var193 = (SubLObject)module0065.NIL;
                        final Iterator var194 = Hashtables.getEntrySetIterator(var191);
                        try {
                            while (Hashtables.iteratorHasNext(var194)) {
                                final Map.Entry var195 = Hashtables.iteratorNextEntry(var194);
                                var192 = Hashtables.getEntryKey(var195);
                                var193 = Hashtables.getEntryValue(var195);
                                module0012.note_percent_progress(var180, var179);
                                var180 = Numbers.add(var180, (SubLObject)module0065.ONE_INTEGER);
                                Vectors.set_aref(var176, var177, var193);
                                var177 = Numbers.add(var177, (SubLObject)module0065.ONE_INTEGER);
                            }
                        }
                        finally {
                            Hashtables.releaseEntrySetIterator(var194);
                        }
                    }
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var184, var171);
                module0012.$g77$.rebind(var183, var171);
                module0012.$g76$.rebind(var182, var171);
                module0012.$g75$.rebind(var181, var171);
            }
            f4727(var13, var177);
            f4728(var13, var176);
            Hashtables.clrhash(f4738(var13));
            if (module0065.NIL != var170) {
                assert module0065.NIL != Types.function_spec_p(var170) : var170;
                final SubLObject var196 = (SubLObject)module0065.$ic156$;
                final SubLObject var197 = f4733(var13);
                SubLObject var198 = (SubLObject)module0065.ZERO_INTEGER;
                assert module0065.NIL != Types.stringp(var196) : var196;
                final SubLObject var199 = module0012.$g75$.currentBinding(var171);
                final SubLObject var200 = module0012.$g76$.currentBinding(var171);
                final SubLObject var201 = module0012.$g77$.currentBinding(var171);
                final SubLObject var202 = module0012.$g78$.currentBinding(var171);
                try {
                    module0012.$g75$.bind((SubLObject)module0065.ZERO_INTEGER, var171);
                    module0012.$g76$.bind((SubLObject)module0065.NIL, var171);
                    module0012.$g77$.bind((SubLObject)module0065.T, var171);
                    module0012.$g78$.bind(Time.get_universal_time(), var171);
                    module0012.f478(var196);
                    if (module0065.NIL == f4772(var13, (SubLObject)module0065.$ic61$)) {
                        if (module0065.NIL == f4775(var13, (SubLObject)module0065.$ic61$)) {
                            final SubLObject var203 = f4740(var13);
                            final SubLObject var204 = (SubLObject)module0065.NIL;
                            SubLObject var193;
                            SubLObject var205;
                            SubLObject var206;
                            SubLObject var207;
                            for (var205 = Sequences.length(var203), var206 = (SubLObject)module0065.NIL, var206 = (SubLObject)module0065.ZERO_INTEGER; var206.numL(var205); var206 = Numbers.add(var206, (SubLObject)module0065.ONE_INTEGER)) {
                                var207 = ((module0065.NIL != var204) ? Numbers.subtract(var205, var206, (SubLObject)module0065.ONE_INTEGER) : var206);
                                var193 = Vectors.aref(var203, var207);
                                if (module0065.NIL == f4749(var193) || module0065.NIL == f4773((SubLObject)module0065.$ic61$)) {
                                    if (module0065.NIL != f4749(var193)) {
                                        var193 = (SubLObject)module0065.$ic61$;
                                    }
                                    module0012.note_percent_progress(var198, var197);
                                    var198 = Numbers.add(var198, (SubLObject)module0065.ONE_INTEGER);
                                    Functions.funcall(var170, var193, var207);
                                }
                            }
                        }
                        if (module0065.NIL == f4777(var13)) {
                            final SubLObject var208 = f4738(var13);
                            SubLObject var209 = (SubLObject)module0065.NIL;
                            SubLObject var210 = (SubLObject)module0065.NIL;
                            final Iterator var211 = Hashtables.getEntrySetIterator(var208);
                            try {
                                while (Hashtables.iteratorHasNext(var211)) {
                                    final Map.Entry var212 = Hashtables.iteratorNextEntry(var211);
                                    var209 = Hashtables.getEntryKey(var212);
                                    var210 = Hashtables.getEntryValue(var212);
                                    module0012.note_percent_progress(var198, var197);
                                    var198 = Numbers.add(var198, (SubLObject)module0065.ONE_INTEGER);
                                    Functions.funcall(var170, var210, var209);
                                }
                            }
                            finally {
                                Hashtables.releaseEntrySetIterator(var211);
                            }
                        }
                    }
                    module0012.f479();
                }
                finally {
                    module0012.$g78$.rebind(var202, var171);
                    module0012.$g77$.rebind(var201, var171);
                    module0012.$g76$.rebind(var200, var171);
                    module0012.$g75$.rebind(var199, var171);
                }
            }
        }
        finally {
            if (module0065.NIL != var174) {
                Locks.release_lock(var173);
            }
        }
        return var13;
    }
    
    public static SubLObject f4794(final SubLObject var13) {
        assert module0065.NIL != f4719(var13) : var13;
        SubLObject var14 = (SubLObject)module0065.ZERO_INTEGER;
        SubLObject var15 = (SubLObject)module0065.NIL;
        final SubLObject var17;
        final SubLObject var16 = var17 = f4743(var13);
        SubLObject var18 = (SubLObject)module0065.NIL;
        try {
            var18 = Locks.seize_lock(var17);
            final SubLObject var19 = f4740(var13);
            final SubLObject var20 = Sequences.length(var19);
            final SubLObject var21 = f4734(var13);
            var15 = f4745(var20, var21);
            SubLObject var22;
            SubLObject var23;
            for (var22 = (SubLObject)module0065.NIL, var22 = (SubLObject)module0065.ZERO_INTEGER; var22.numL(var20); var22 = Numbers.add(var22, (SubLObject)module0065.ONE_INTEGER)) {
                var23 = Vectors.aref(var19, var22);
                if (module0065.NIL != var23) {
                    f4753(var15, var22, var14);
                    var14 = Numbers.add(var14, (SubLObject)module0065.ONE_INTEGER);
                }
            }
            final SubLObject var24 = f4738(var13);
            final SubLObject var25 = Hashtables.hash_table_count(var24);
            SubLObject var26 = Vectors.make_vector(var25, (SubLObject)module0065.NIL);
            SubLObject var27 = (SubLObject)module0065.ZERO_INTEGER;
            SubLObject var28 = (SubLObject)module0065.NIL;
            SubLObject var29 = (SubLObject)module0065.NIL;
            final Iterator var30 = Hashtables.getEntrySetIterator(var24);
            try {
                while (Hashtables.iteratorHasNext(var30)) {
                    final Map.Entry var31 = Hashtables.iteratorNextEntry(var30);
                    var28 = Hashtables.getEntryKey(var31);
                    var29 = Hashtables.getEntryValue(var31);
                    if (module0065.NIL != var29) {
                        Vectors.set_aref(var26, var27, var28);
                        var27 = Numbers.add(var27, (SubLObject)module0065.ONE_INTEGER);
                    }
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(var30);
            }
            final SubLObject var32;
            var26 = (var32 = Sort.sort(var26, Symbols.symbol_function((SubLObject)module0065.$ic111$), (SubLObject)module0065.UNPROVIDED));
            final SubLObject var33 = (SubLObject)module0065.NIL;
            SubLObject var34;
            SubLObject var35;
            SubLObject var36;
            SubLObject var37;
            for (var34 = Sequences.length(var32), var35 = (SubLObject)module0065.NIL, var35 = (SubLObject)module0065.ZERO_INTEGER; var35.numL(var34); var35 = Numbers.add(var35, (SubLObject)module0065.ONE_INTEGER)) {
                var36 = ((module0065.NIL != var33) ? Numbers.subtract(var34, var35, (SubLObject)module0065.ONE_INTEGER) : var35);
                var37 = Vectors.aref(var32, var36);
                f4753(var15, var37, var14);
                var14 = Numbers.add(var14, (SubLObject)module0065.ONE_INTEGER);
            }
        }
        finally {
            if (module0065.NIL != var18) {
                Locks.release_lock(var17);
            }
        }
        return var15;
    }
    
    public static SubLObject f4795(final SubLObject var13) {
        assert module0065.NIL != f4719(var13) : var13;
        SubLObject var14 = (SubLObject)module0065.NIL;
        if (module0065.NIL == f4772(var13, (SubLObject)module0065.$ic61$)) {
            if (module0065.NIL == f4775(var13, (SubLObject)module0065.$ic61$)) {
                final SubLObject var15 = f4740(var13);
                final SubLObject var16 = (SubLObject)module0065.NIL;
                SubLObject var17;
                SubLObject var18;
                SubLObject var19;
                SubLObject var20;
                for (var17 = Sequences.length(var15), var18 = (SubLObject)module0065.NIL, var18 = (SubLObject)module0065.ZERO_INTEGER; var18.numL(var17); var18 = Numbers.add(var18, (SubLObject)module0065.ONE_INTEGER)) {
                    var19 = ((module0065.NIL != var16) ? Numbers.subtract(var17, var18, (SubLObject)module0065.ONE_INTEGER) : var18);
                    var20 = Vectors.aref(var15, var19);
                    if (module0065.NIL == f4749(var20) || module0065.NIL == f4773((SubLObject)module0065.$ic61$)) {
                        if (module0065.NIL != f4749(var20)) {
                            var20 = (SubLObject)module0065.$ic61$;
                        }
                        var14 = (SubLObject)ConsesLow.cons(var19, var14);
                    }
                }
            }
            if (module0065.NIL == f4777(var13)) {
                final SubLObject var21 = f4738(var13);
                SubLObject var22 = (SubLObject)module0065.NIL;
                SubLObject var23 = (SubLObject)module0065.NIL;
                final Iterator var24 = Hashtables.getEntrySetIterator(var21);
                try {
                    while (Hashtables.iteratorHasNext(var24)) {
                        final Map.Entry var25 = Hashtables.iteratorNextEntry(var24);
                        var22 = Hashtables.getEntryKey(var25);
                        var23 = Hashtables.getEntryValue(var25);
                        var14 = (SubLObject)ConsesLow.cons(var22, var14);
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var24);
                }
            }
        }
        return Sequences.nreverse(var14);
    }
    
    public static SubLObject f4796(final SubLObject var13) {
        assert module0065.NIL != f4719(var13) : var13;
        SubLObject var14 = (SubLObject)module0065.NIL;
        if (module0065.NIL == f4772(var13, (SubLObject)module0065.$ic61$)) {
            if (module0065.NIL == f4775(var13, (SubLObject)module0065.$ic61$)) {
                final SubLObject var15 = f4740(var13);
                final SubLObject var16 = (SubLObject)module0065.NIL;
                SubLObject var17;
                SubLObject var18;
                SubLObject var19;
                SubLObject var20;
                for (var17 = Sequences.length(var15), var18 = (SubLObject)module0065.NIL, var18 = (SubLObject)module0065.ZERO_INTEGER; var18.numL(var17); var18 = Numbers.add(var18, (SubLObject)module0065.ONE_INTEGER)) {
                    var19 = ((module0065.NIL != var16) ? Numbers.subtract(var17, var18, (SubLObject)module0065.ONE_INTEGER) : var18);
                    var20 = Vectors.aref(var15, var19);
                    if (module0065.NIL == f4749(var20) || module0065.NIL == f4773((SubLObject)module0065.$ic61$)) {
                        if (module0065.NIL != f4749(var20)) {
                            var20 = (SubLObject)module0065.$ic61$;
                        }
                        var14 = (SubLObject)ConsesLow.cons(var20, var14);
                    }
                }
            }
            if (module0065.NIL == f4777(var13)) {
                final SubLObject var21 = f4738(var13);
                SubLObject var22 = (SubLObject)module0065.NIL;
                SubLObject var23 = (SubLObject)module0065.NIL;
                final Iterator var24 = Hashtables.getEntrySetIterator(var21);
                try {
                    while (Hashtables.iteratorHasNext(var24)) {
                        final Map.Entry var25 = Hashtables.iteratorNextEntry(var24);
                        var22 = Hashtables.getEntryKey(var25);
                        var23 = Hashtables.getEntryValue(var25);
                        var14 = (SubLObject)ConsesLow.cons(var23, var14);
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var24);
                }
            }
        }
        return Sequences.nreverse(var14);
    }
    
    public static SubLObject f4797(final SubLObject var13) {
        final SubLObject var14 = f4739(var13);
        final SubLObject var15 = f4734(var13);
        return f4745(var14, var15);
    }
    
    public static SubLObject f4798(final SubLObject var13, SubLObject var203) {
        if (var203 == module0065.UNPROVIDED) {
            var203 = (SubLObject)module0065.NIL;
        }
        final SubLObject var204 = f4734(var13);
        final SubLObject var205 = (module0065.NIL != var203) ? f4745(var204, (SubLObject)module0065.UNPROVIDED) : f4797(var13);
        if (module0065.NIL == f4772(var13, (SubLObject)module0065.$ic61$)) {
            if (module0065.NIL == f4775(var13, (SubLObject)module0065.$ic61$)) {
                final SubLObject var206 = f4740(var13);
                final SubLObject var207 = (SubLObject)module0065.NIL;
                SubLObject var208;
                SubLObject var209;
                SubLObject var210;
                SubLObject var211;
                for (var208 = Sequences.length(var206), var209 = (SubLObject)module0065.NIL, var209 = (SubLObject)module0065.ZERO_INTEGER; var209.numL(var208); var209 = Numbers.add(var209, (SubLObject)module0065.ONE_INTEGER)) {
                    var210 = ((module0065.NIL != var207) ? Numbers.subtract(var208, var209, (SubLObject)module0065.ONE_INTEGER) : var209);
                    var211 = Vectors.aref(var206, var210);
                    if (module0065.NIL == f4749(var211) || module0065.NIL == f4773((SubLObject)module0065.$ic61$)) {
                        if (module0065.NIL != f4749(var211)) {
                            var211 = (SubLObject)module0065.$ic61$;
                        }
                        f4753(var205, var210, var211);
                    }
                }
            }
            if (module0065.NIL == f4777(var13)) {
                final SubLObject var212 = f4738(var13);
                SubLObject var213 = (SubLObject)module0065.NIL;
                SubLObject var214 = (SubLObject)module0065.NIL;
                final Iterator var215 = Hashtables.getEntrySetIterator(var212);
                try {
                    while (Hashtables.iteratorHasNext(var215)) {
                        final Map.Entry var216 = Hashtables.iteratorNextEntry(var215);
                        var213 = Hashtables.getEntryKey(var216);
                        var214 = Hashtables.getEntryValue(var216);
                        f4753(var205, var213, var214);
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var215);
                }
            }
        }
        return var205;
    }
    
    public static SubLObject f4799(final SubLObject var13, SubLObject var206, SubLObject var207) {
        if (var206 == module0065.UNPROVIDED) {
            var206 = (SubLObject)module0065.$ic157$;
        }
        if (var207 == module0065.UNPROVIDED) {
            var207 = (SubLObject)module0065.NIL;
        }
        final SubLThread var208 = SubLProcess.currentSubLThread();
        assert module0065.NIL != f4719(var13) : var13;
        if (module0065.NIL == Errors.$ignore_mustsP$.getDynamicValue(var208) && module0065.NIL == conses_high.member(var206, (SubLObject)module0065.$ic158$, (SubLObject)module0065.UNPROVIDED, (SubLObject)module0065.UNPROVIDED)) {
            Errors.error((SubLObject)module0065.$ic159$);
        }
        if (module0065.NIL == var207) {
            var207 = f4734(var13);
        }
        SubLObject var209 = (SubLObject)module0065.NIL;
        if (module0065.$ic160$ != var206) {
            final SubLObject var210 = f4740(var13);
            SubLObject var211 = (SubLObject)module0065.NIL;
            final SubLObject var212 = var210;
            final SubLObject var213 = (SubLObject)module0065.NIL;
            final SubLObject var214 = Sequences.length(var212);
            SubLObject var216;
            final SubLObject var215 = var216 = (SubLObject)((module0065.NIL != var213) ? ConsesLow.list(Numbers.subtract(var214, (SubLObject)module0065.ONE_INTEGER), (SubLObject)module0065.MINUS_ONE_INTEGER, (SubLObject)module0065.MINUS_ONE_INTEGER) : ConsesLow.list((SubLObject)module0065.ZERO_INTEGER, var214, (SubLObject)module0065.ONE_INTEGER));
            SubLObject var217 = (SubLObject)module0065.NIL;
            SubLObject var218 = (SubLObject)module0065.NIL;
            SubLObject var219 = (SubLObject)module0065.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var216, var215, (SubLObject)module0065.$ic161$);
            var217 = var216.first();
            var216 = var216.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var216, var215, (SubLObject)module0065.$ic161$);
            var218 = var216.first();
            var216 = var216.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var216, var215, (SubLObject)module0065.$ic161$);
            var219 = var216.first();
            var216 = var216.rest();
            if (module0065.NIL == var216) {
                if (module0065.NIL == var211) {
                    SubLObject var220;
                    SubLObject var221;
                    SubLObject var222;
                    for (var220 = var218, var221 = (SubLObject)module0065.NIL, var221 = var217; module0065.NIL == var211 && module0065.NIL == module0005.f124(var221, var219, var220); var221 = Numbers.add(var221, var219)) {
                        var222 = Vectors.aref(var212, var221);
                        if (module0065.NIL == var222) {
                            if (var207.numLE(var221)) {
                                var211 = (SubLObject)module0065.T;
                            }
                            else {
                                var209 = (SubLObject)ConsesLow.cons(var221, var209);
                            }
                        }
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var215, (SubLObject)module0065.$ic161$);
            }
        }
        if (module0065.$ic162$ != var206) {
            final SubLObject var223 = f4738(var13);
            final SubLObject var224 = f4739(var13);
            final SubLObject var225 = f4734(var13);
            SubLObject var227;
            SubLObject var226;
            SubLObject var228;
            SubLObject var229;
            for (var226 = (var227 = Numbers.min(var207, var225)), var228 = (SubLObject)module0065.NIL, var228 = var224; !var228.numGE(var227); var228 = module0048.f_1X(var228)) {
                var229 = Hashtables.gethash_without_values(var228, var223, (SubLObject)module0065.UNPROVIDED);
                if (module0065.NIL == var229) {
                    var209 = (SubLObject)ConsesLow.cons(var228, var209);
                }
            }
        }
        return Sequences.nreverse(var209);
    }
    
    public static SubLObject f4800(final SubLObject var218, final SubLObject var118, final SubLObject var219) {
        final SubLObject var220 = f4801(var218, var118, var219, (SubLObject)module0065.UNPROVIDED);
        final SubLObject var221 = f4734(var220);
        final SubLObject var222 = module0078.f5367(f4795(var220), (SubLObject)module0065.UNPROVIDED, (SubLObject)module0065.UNPROVIDED);
        final SubLObject var223 = module0078.f5367(f4799(var220, (SubLObject)module0065.$ic157$, (SubLObject)module0065.UNPROVIDED), (SubLObject)module0065.UNPROVIDED, (SubLObject)module0065.UNPROVIDED);
        SubLObject var224;
        SubLObject var225;
        for (var224 = (SubLObject)module0065.NIL, var224 = (SubLObject)module0065.ZERO_INTEGER; var224.numL(var221); var224 = Numbers.add(var224, (SubLObject)module0065.ONE_INTEGER)) {
            if (module0065.NIL == module0077.f5320(var224, var222) && module0065.NIL == module0077.f5320(var224, var223)) {
                var225 = Types.stringp(f4750(var220, var224, (SubLObject)module0065.UNPROVIDED));
                Errors.error((SubLObject)module0065.$ic165$, (SubLObject)((module0065.NIL != var225) ? module0065.$ic166$ : module0065.$ic167$));
            }
        }
        return (SubLObject)module0065.$ic151$;
    }
    
    public static SubLObject f4802(final SubLObject var13, final SubLObject var224, SubLObject var225) {
        if (var225 == module0065.UNPROVIDED) {
            var225 = (SubLObject)module0065.NIL;
        }
        final SubLThread var226 = SubLProcess.currentSubLThread();
        if (module0065.NIL == f4772(var13, (SubLObject)module0065.$ic61$)) {
            if (module0065.NIL == f4775(var13, (SubLObject)module0065.$ic61$)) {
                final SubLObject var227 = f4740(var13);
                final SubLObject var228 = (SubLObject)module0065.NIL;
                SubLObject var229;
                SubLObject var230;
                SubLObject var231;
                SubLObject var232;
                SubLObject var233;
                SubLObject var234;
                SubLObject var235;
                for (var229 = Sequences.length(var227), var230 = (SubLObject)module0065.NIL, var230 = (SubLObject)module0065.ZERO_INTEGER; var230.numL(var229); var230 = Numbers.add(var230, (SubLObject)module0065.ONE_INTEGER)) {
                    var231 = ((module0065.NIL != var228) ? Numbers.subtract(var229, var230, (SubLObject)module0065.ONE_INTEGER) : var230);
                    var232 = Vectors.aref(var227, var231);
                    if (module0065.NIL == f4749(var232) || module0065.NIL == f4773((SubLObject)module0065.$ic61$)) {
                        if (module0065.NIL != f4749(var232)) {
                            var232 = (SubLObject)module0065.$ic61$;
                        }
                        if (module0065.NIL != var225) {
                            var226.resetMultipleValues();
                            var233 = module0079.f5414(var224, var232, (SubLObject)module0065.UNPROVIDED);
                            var234 = var226.secondMultipleValue();
                            var226.resetMultipleValues();
                            if (module0065.NIL != var234) {
                                if (var233.isList()) {
                                    var233 = (SubLObject)ConsesLow.cons(var231, var233);
                                    module0079.f5412(var224, var232, var233);
                                }
                                else {
                                    var235 = var233;
                                    module0079.f5412(var224, var232, (SubLObject)ConsesLow.list(var231, var235));
                                }
                            }
                            else {
                                module0079.f5412(var224, var232, var231);
                            }
                        }
                        else {
                            module0079.f5412(var224, var232, var231);
                        }
                    }
                }
            }
            if (module0065.NIL == f4777(var13)) {
                final SubLObject var236 = f4738(var13);
                SubLObject var237 = (SubLObject)module0065.NIL;
                SubLObject var238 = (SubLObject)module0065.NIL;
                final Iterator var239 = Hashtables.getEntrySetIterator(var236);
                try {
                    while (Hashtables.iteratorHasNext(var239)) {
                        final Map.Entry var240 = Hashtables.iteratorNextEntry(var239);
                        var237 = Hashtables.getEntryKey(var240);
                        var238 = Hashtables.getEntryValue(var240);
                        if (module0065.NIL != var225) {
                            var226.resetMultipleValues();
                            SubLObject var241 = module0079.f5414(var224, var238, (SubLObject)module0065.UNPROVIDED);
                            final SubLObject var242 = var226.secondMultipleValue();
                            var226.resetMultipleValues();
                            if (module0065.NIL != var242) {
                                if (var241.isList()) {
                                    var241 = (SubLObject)ConsesLow.cons(var237, var241);
                                    module0079.f5412(var224, var238, var241);
                                }
                                else {
                                    final SubLObject var243 = var241;
                                    module0079.f5412(var224, var238, (SubLObject)ConsesLow.list(var237, var243));
                                }
                            }
                            else {
                                module0079.f5412(var224, var238, var237);
                            }
                        }
                        else {
                            module0079.f5412(var224, var238, var237);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var239);
                }
            }
        }
        return var224;
    }
    
    public static SubLObject f4803(final SubLObject var224) {
        final SubLThread var225 = SubLProcess.currentSubLThread();
        final SubLObject var226 = f4804(var224);
        final SubLObject var227 = f4745(var226, (SubLObject)module0065.UNPROVIDED);
        final SubLObject var228 = module0079.f5424(var224);
        SubLObject var231;
        for (SubLObject var229 = (SubLObject)module0065.NIL; module0065.NIL == var229; var229 = (SubLObject)SubLObjectFactory.makeBoolean(module0065.NIL == var231)) {
            var225.resetMultipleValues();
            final SubLObject var230 = module0052.f3693(var228);
            var231 = var225.secondMultipleValue();
            var225.resetMultipleValues();
            if (module0065.NIL != var231) {
                SubLObject var233;
                final SubLObject var232 = var233 = var230;
                SubLObject var234 = (SubLObject)module0065.NIL;
                SubLObject var235 = (SubLObject)module0065.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var233, var232, (SubLObject)module0065.$ic168$);
                var234 = var233.first();
                var233 = var233.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var233, var232, (SubLObject)module0065.$ic168$);
                var235 = var233.first();
                var233 = var233.rest();
                if (module0065.NIL == var233) {
                    f4753(var227, var235, var234);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var232, (SubLObject)module0065.$ic168$);
                }
            }
        }
        return var227;
    }
    
    public static SubLObject f4804(final SubLObject var224) {
        final SubLThread var225 = SubLProcess.currentSubLThread();
        SubLObject var226 = (SubLObject)module0065.MINUS_ONE_INTEGER;
        SubLObject var227 = (SubLObject)module0065.NIL;
        final SubLObject var228 = module0079.f5424(var224);
        SubLObject var231;
        for (SubLObject var229 = (SubLObject)module0065.NIL; module0065.NIL == var229; var229 = (SubLObject)SubLObjectFactory.makeBoolean(module0065.NIL == var231)) {
            var225.resetMultipleValues();
            final SubLObject var230 = module0052.f3693(var228);
            var231 = var225.secondMultipleValue();
            var225.resetMultipleValues();
            if (module0065.NIL != var231) {
                SubLObject var233;
                final SubLObject var232 = var233 = var230;
                SubLObject var234 = (SubLObject)module0065.NIL;
                SubLObject var235 = (SubLObject)module0065.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var233, var232, (SubLObject)module0065.$ic168$);
                var234 = var233.first();
                var233 = var233.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var233, var232, (SubLObject)module0065.$ic168$);
                var235 = var233.first();
                var233 = var233.rest();
                if (module0065.NIL == var233) {
                    if (var226.numL(var235)) {
                        var226 = var235;
                        var227 = var234;
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var232, (SubLObject)module0065.$ic168$);
                }
            }
        }
        return Values.values(var226, var227);
    }
    
    public static SubLObject f4805(final SubLObject var156, final SubLObject var157, SubLObject var158, SubLObject var159) {
        if (var158 == module0065.UNPROVIDED) {
            var158 = (SubLObject)module0065.$ic148$;
        }
        if (var159 == module0065.UNPROVIDED) {
            var159 = Symbols.symbol_function((SubLObject)module0065.EQUAL);
        }
        final SubLThread var160 = SubLProcess.currentSubLThread();
        final SubLObject var161 = f4789(var156, var157, var158);
        final SubLObject var162 = f4806(var161, var159);
        final SubLObject var163 = f4803(var162);
        if (module0065.NIL == Errors.$ignore_mustsP$.getDynamicValue(var160) && !f4733(var163).numE(f4733(var161))) {
            Errors.error((SubLObject)module0065.$ic170$, var161, var163);
        }
        final SubLObject var164 = var161;
        if (module0065.NIL == f4772(var164, (SubLObject)module0065.$ic61$)) {
            final SubLObject var145_240 = var164;
            if (module0065.NIL == f4775(var145_240, (SubLObject)module0065.$ic61$)) {
                final SubLObject var165 = f4740(var145_240);
                final SubLObject var166 = (SubLObject)module0065.NIL;
                SubLObject var167;
                SubLObject var168;
                SubLObject var169;
                SubLObject var170;
                for (var167 = Sequences.length(var165), var168 = (SubLObject)module0065.NIL, var168 = (SubLObject)module0065.ZERO_INTEGER; var168.numL(var167); var168 = Numbers.add(var168, (SubLObject)module0065.ONE_INTEGER)) {
                    var169 = ((module0065.NIL != var166) ? Numbers.subtract(var167, var168, (SubLObject)module0065.ONE_INTEGER) : var168);
                    var170 = Vectors.aref(var165, var169);
                    if (module0065.NIL == f4749(var170) || module0065.NIL == f4773((SubLObject)module0065.$ic61$)) {
                        if (module0065.NIL != f4749(var170)) {
                            var170 = (SubLObject)module0065.$ic61$;
                        }
                        if (module0065.NIL == Errors.$ignore_mustsP$.getDynamicValue(var160) && !var169.numE(module0079.f5414(var162, var170, (SubLObject)module0065.$ic171$))) {
                            Errors.error((SubLObject)module0065.$ic172$, var170, var169);
                        }
                        if (module0065.NIL == Errors.$ignore_mustsP$.getDynamicValue(var160) && module0065.NIL == Functions.funcall(var159, var170, f4750(var163, var169, (SubLObject)module0065.UNPROVIDED))) {
                            Errors.error((SubLObject)module0065.$ic173$, var170, var169);
                        }
                    }
                }
            }
            final SubLObject var150_241 = var164;
            if (module0065.NIL == f4777(var150_241)) {
                final SubLObject var171 = f4738(var150_241);
                SubLObject var172 = (SubLObject)module0065.NIL;
                SubLObject var173 = (SubLObject)module0065.NIL;
                final Iterator var174 = Hashtables.getEntrySetIterator(var171);
                try {
                    while (Hashtables.iteratorHasNext(var174)) {
                        final Map.Entry var175 = Hashtables.iteratorNextEntry(var174);
                        var172 = Hashtables.getEntryKey(var175);
                        var173 = Hashtables.getEntryValue(var175);
                        if (module0065.NIL == Errors.$ignore_mustsP$.getDynamicValue(var160) && !var172.numE(module0079.f5414(var162, var173, (SubLObject)module0065.$ic171$))) {
                            Errors.error((SubLObject)module0065.$ic172$, var173, var172);
                        }
                        if (module0065.NIL == Errors.$ignore_mustsP$.getDynamicValue(var160) && module0065.NIL == Functions.funcall(var159, var173, f4750(var163, var172, (SubLObject)module0065.UNPROVIDED))) {
                            Errors.error((SubLObject)module0065.$ic173$, var173, var172);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var174);
                }
            }
        }
        return (SubLObject)module0065.$ic151$;
    }
    
    public static SubLObject f4789(final SubLObject var156, final SubLObject var157, SubLObject var158) {
        if (var158 == module0065.UNPROVIDED) {
            var158 = (SubLObject)module0065.$ic148$;
        }
        final SubLThread var159 = SubLProcess.currentSubLThread();
        final SubLObject var160 = f4745(var156, (SubLObject)module0065.UNPROVIDED);
        SubLObject var161;
        for (var161 = (SubLObject)module0065.NIL, var161 = (SubLObject)module0065.ZERO_INTEGER; var161.numL(var156); var161 = Numbers.add(var161, (SubLObject)module0065.ONE_INTEGER)) {
            f4753(var160, var161, Functions.funcall(var158, var161));
        }
        SubLObject var162;
        SubLObject var163;
        SubLObject var164;
        SubLObject var165;
        for (var162 = (SubLObject)module0065.NIL, var162 = (SubLObject)module0065.ZERO_INTEGER; var162.numL(var157); var162 = Numbers.add(var162, (SubLObject)module0065.ONE_INTEGER)) {
            var163 = Numbers.add(var162, var156);
            var164 = f4746(var160);
            if (module0065.NIL == Errors.$ignore_mustsP$.getDynamicValue(var159) && !var163.numE(var164)) {
                Errors.error((SubLObject)module0065.$ic174$, var162, var163, var164);
            }
            var165 = Functions.funcall(var158, var164);
            f4753(var160, var164, var165);
        }
        return var160;
    }
    
    public static SubLObject f4807(final SubLObject var156, final SubLObject var157, final SubLObject var244) {
        final SubLThread var245 = SubLProcess.currentSubLThread();
        var245.resetMultipleValues();
        final SubLObject var246 = f4801(var156, var157, var244, (SubLObject)module0065.UNPROVIDED);
        final SubLObject var247 = var245.secondMultipleValue();
        var245.resetMultipleValues();
        final SubLObject var248 = module0078.f5367(var247, (SubLObject)module0065.UNPROVIDED, (SubLObject)module0065.UNPROVIDED);
        final SubLObject var249 = module0077.f5313((SubLObject)module0065.UNPROVIDED, (SubLObject)module0065.UNPROVIDED);
        SubLObject var250 = (SubLObject)module0065.MINUS_ONE_INTEGER;
        final SubLObject var251 = var246;
        if (module0065.NIL == f4772(var251, (SubLObject)module0065.$ic176$)) {
            final SubLObject var145_247 = var251;
            if (module0065.NIL == f4775(var145_247, (SubLObject)module0065.$ic176$)) {
                final SubLObject var252 = f4740(var145_247);
                final SubLObject var253 = (SubLObject)module0065.NIL;
                SubLObject var254;
                SubLObject var255;
                SubLObject var256;
                SubLObject var257;
                for (var254 = Sequences.length(var252), var255 = (SubLObject)module0065.NIL, var255 = (SubLObject)module0065.ZERO_INTEGER; var255.numL(var254); var255 = Numbers.add(var255, (SubLObject)module0065.ONE_INTEGER)) {
                    var256 = ((module0065.NIL != var253) ? Numbers.subtract(var254, var255, (SubLObject)module0065.ONE_INTEGER) : var255);
                    var257 = Vectors.aref(var252, var256);
                    if (module0065.NIL == f4749(var257) || module0065.NIL == f4773((SubLObject)module0065.$ic176$)) {
                        if (module0065.NIL != f4749(var257)) {
                            var257 = (SubLObject)module0065.$ic176$;
                        }
                        if (module0065.NIL == Errors.$ignore_mustsP$.getDynamicValue(var245) && !module0065.ONE_INTEGER.numE(Numbers.subtract(var256, var250))) {
                            Errors.error((SubLObject)module0065.$ic177$, Numbers.add(var250, (SubLObject)module0065.ONE_INTEGER), var256);
                        }
                        if (module0065.NIL != module0077.f5320(var256, var248)) {
                            if (module0065.NIL == Errors.$ignore_mustsP$.getDynamicValue(var245) && module0065.$ic176$ != var257) {
                                Errors.error((SubLObject)module0065.$ic178$, var256, var257);
                            }
                            module0077.f5326(var256, var249);
                        }
                        else if (module0065.NIL == Errors.$ignore_mustsP$.getDynamicValue(var245) && module0065.$ic176$ == var257) {
                            Errors.error((SubLObject)module0065.$ic179$, var256);
                        }
                        var250 = var256;
                    }
                }
            }
            final SubLObject var248_249 = var251;
            if (module0065.NIL == f4777(var248_249) || module0065.NIL == f4773((SubLObject)module0065.$ic176$)) {
                final SubLObject var258 = f4738(var248_249);
                SubLObject var259 = f4739(var248_249);
                final SubLObject var260 = f4734(var248_249);
                final SubLObject var261 = (SubLObject)((module0065.NIL != f4773((SubLObject)module0065.$ic176$)) ? module0065.NIL : module0065.$ic176$);
                while (var259.numL(var260)) {
                    final SubLObject var262 = Hashtables.gethash_without_values(var259, var258, var261);
                    if (module0065.NIL == f4773((SubLObject)module0065.$ic176$) || module0065.NIL == f4749(var262)) {
                        if (module0065.NIL == Errors.$ignore_mustsP$.getDynamicValue(var245) && !module0065.ONE_INTEGER.numE(Numbers.subtract(var259, var250))) {
                            Errors.error((SubLObject)module0065.$ic177$, Numbers.add(var250, (SubLObject)module0065.ONE_INTEGER), var259);
                        }
                        if (module0065.NIL != module0077.f5320(var259, var248)) {
                            if (module0065.NIL == Errors.$ignore_mustsP$.getDynamicValue(var245) && module0065.$ic176$ != var262) {
                                Errors.error((SubLObject)module0065.$ic178$, var259, var262);
                            }
                            module0077.f5326(var259, var249);
                        }
                        else if (module0065.NIL == Errors.$ignore_mustsP$.getDynamicValue(var245) && module0065.$ic176$ == var262) {
                            Errors.error((SubLObject)module0065.$ic179$, var259);
                        }
                        var250 = var259;
                    }
                    var259 = Numbers.add(var259, (SubLObject)module0065.ONE_INTEGER);
                }
            }
        }
        if (module0065.NIL == Errors.$ignore_mustsP$.getDynamicValue(var245) && module0065.NIL == module0078.f5359(var248, var249)) {
            Errors.error((SubLObject)module0065.$ic180$, module0077.f5312(module0078.f5358(var248, var249)));
        }
        final SubLObject var264;
        final SubLObject var263 = var264 = Numbers.add(var156, Numbers.integerDivide(var157, (SubLObject)module0065.TWO_INTEGER));
        final SubLObject var265 = f4750(var246, var264, (SubLObject)module0065.$ic176$);
        SubLObject var266 = (SubLObject)module0065.ZERO_INTEGER;
        SubLObject var267 = (SubLObject)module0065.NIL;
        SubLObject var268 = (SubLObject)module0065.NIL;
        final SubLObject var269 = var246;
        if (module0065.NIL == f4772(var269, (SubLObject)module0065.$ic176$)) {
            final SubLObject var145_248 = var269;
            if (module0065.NIL == f4775(var145_248, (SubLObject)module0065.$ic176$)) {
                final SubLObject var270 = f4740(var145_248);
                final SubLObject var271 = (SubLObject)module0065.NIL;
                final SubLObject var272 = Sequences.length(var270);
                SubLObject var274;
                final SubLObject var273 = var274 = (SubLObject)((module0065.NIL != var271) ? ConsesLow.list(Numbers.subtract(var272, (SubLObject)module0065.ONE_INTEGER), (SubLObject)module0065.MINUS_ONE_INTEGER, (SubLObject)module0065.MINUS_ONE_INTEGER) : ConsesLow.list((SubLObject)module0065.ZERO_INTEGER, var272, (SubLObject)module0065.ONE_INTEGER));
                SubLObject var275 = (SubLObject)module0065.NIL;
                SubLObject var276 = (SubLObject)module0065.NIL;
                SubLObject var277 = (SubLObject)module0065.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var274, var273, (SubLObject)module0065.$ic161$);
                var275 = var274.first();
                var274 = var274.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var274, var273, (SubLObject)module0065.$ic161$);
                var276 = var274.first();
                var274 = var274.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var274, var273, (SubLObject)module0065.$ic161$);
                var277 = var274.first();
                var274 = var274.rest();
                if (module0065.NIL == var274) {
                    if (module0065.NIL == var268) {
                        SubLObject var278;
                        SubLObject var279;
                        SubLObject var280;
                        for (var278 = var276, var279 = (SubLObject)module0065.NIL, var279 = var275; module0065.NIL == var268 && module0065.NIL == module0005.f124(var279, var277, var278); var279 = Numbers.add(var279, var277)) {
                            var280 = Vectors.aref(var270, var279);
                            if (module0065.NIL == f4749(var280) || module0065.NIL == f4773((SubLObject)module0065.$ic176$)) {
                                if (module0065.NIL != f4749(var280)) {
                                    var280 = (SubLObject)module0065.$ic176$;
                                }
                                if (module0065.NIL == Errors.$ignore_mustsP$.getDynamicValue(var245) && !var279.numE(var266)) {
                                    Errors.error((SubLObject)module0065.$ic181$, var279, var266);
                                }
                                var266 = Numbers.add(var266, (SubLObject)module0065.ONE_INTEGER);
                                var267 = var280;
                                var268 = Numbers.numL(var264, var266);
                            }
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var273, (SubLObject)module0065.$ic161$);
                }
            }
            final SubLObject var248_250 = var269;
            if (module0065.NIL == f4777(var248_250) || module0065.NIL == f4773((SubLObject)module0065.$ic176$)) {
                final SubLObject var281 = f4738(var248_250);
                SubLObject var282 = f4739(var248_250);
                final SubLObject var283 = f4734(var248_250);
                final SubLObject var284 = (SubLObject)((module0065.NIL != f4773((SubLObject)module0065.$ic176$)) ? module0065.NIL : module0065.$ic176$);
                while (var282.numL(var283) && module0065.NIL == var268) {
                    final SubLObject var285 = Hashtables.gethash_without_values(var282, var281, var284);
                    if (module0065.NIL == f4773((SubLObject)module0065.$ic176$) || module0065.NIL == f4749(var285)) {
                        if (module0065.NIL == Errors.$ignore_mustsP$.getDynamicValue(var245) && !var282.numE(var266)) {
                            Errors.error((SubLObject)module0065.$ic181$, var282, var266);
                        }
                        var266 = Numbers.add(var266, (SubLObject)module0065.ONE_INTEGER);
                        var267 = var285;
                        var268 = Numbers.numL(var264, var266);
                    }
                    var282 = Numbers.add(var282, (SubLObject)module0065.ONE_INTEGER);
                }
            }
        }
        if (module0065.NIL == Errors.$ignore_mustsP$.getDynamicValue(var245) && !var267.eql(var265)) {
            Errors.error((SubLObject)module0065.$ic182$, var265, var267);
        }
        SubLObject var286;
        SubLObject var287;
        for (var286 = Numbers.add(var156, var157), var287 = (SubLObject)module0065.NIL, var287 = (SubLObject)module0065.ZERO_INTEGER; var287.numL(var286); var287 = Numbers.add(var287, (SubLObject)module0065.ONE_INTEGER)) {
            f4761(var246, var287);
        }
        if (module0065.NIL == Errors.$ignore_mustsP$.getDynamicValue(var245) && module0065.NIL == f4735(var246)) {
            Errors.error((SubLObject)module0065.$ic183$);
        }
        SubLObject var288 = (SubLObject)module0065.ZERO_INTEGER;
        final SubLObject var289 = var246;
        if (module0065.NIL == f4772(var289, (SubLObject)module0065.$ic176$)) {
            final SubLObject var145_249 = var289;
            if (module0065.NIL == f4775(var145_249, (SubLObject)module0065.$ic176$)) {
                final SubLObject var290 = f4740(var145_249);
                final SubLObject var291 = (SubLObject)module0065.NIL;
                SubLObject var282;
                SubLObject var292;
                SubLObject var293;
                SubLObject var294;
                for (var292 = Sequences.length(var290), var293 = (SubLObject)module0065.NIL, var293 = (SubLObject)module0065.ZERO_INTEGER; var293.numL(var292); var293 = Numbers.add(var293, (SubLObject)module0065.ONE_INTEGER)) {
                    var282 = ((module0065.NIL != var291) ? Numbers.subtract(var292, var293, (SubLObject)module0065.ONE_INTEGER) : var293);
                    var294 = Vectors.aref(var290, var282);
                    if (module0065.NIL == f4749(var294) || module0065.NIL == f4773((SubLObject)module0065.$ic176$)) {
                        if (module0065.NIL != f4749(var294)) {
                            var294 = (SubLObject)module0065.$ic176$;
                        }
                        if (module0065.NIL == Errors.$ignore_mustsP$.getDynamicValue(var245) && !var288.numE(var282)) {
                            Errors.error((SubLObject)module0065.$ic181$, var282, var288);
                        }
                        if (module0065.NIL == Errors.$ignore_mustsP$.getDynamicValue(var245) && module0065.$ic176$ != var294) {
                            Errors.error((SubLObject)module0065.$ic184$, var294);
                        }
                        var288 = Numbers.add(var288, (SubLObject)module0065.ONE_INTEGER);
                    }
                }
            }
            final SubLObject var248_251 = var289;
            if (module0065.NIL == f4777(var248_251) || module0065.NIL == f4773((SubLObject)module0065.$ic176$)) {
                final SubLObject var295 = f4738(var248_251);
                SubLObject var256 = f4739(var248_251);
                final SubLObject var296 = f4734(var248_251);
                final SubLObject var297 = (SubLObject)((module0065.NIL != f4773((SubLObject)module0065.$ic176$)) ? module0065.NIL : module0065.$ic176$);
                while (var256.numL(var296)) {
                    final SubLObject var298 = Hashtables.gethash_without_values(var256, var295, var297);
                    if (module0065.NIL == f4773((SubLObject)module0065.$ic176$) || module0065.NIL == f4749(var298)) {
                        if (module0065.NIL == Errors.$ignore_mustsP$.getDynamicValue(var245) && !var288.numE(var256)) {
                            Errors.error((SubLObject)module0065.$ic181$, var256, var288);
                        }
                        if (module0065.NIL == Errors.$ignore_mustsP$.getDynamicValue(var245) && module0065.$ic176$ != var298) {
                            Errors.error((SubLObject)module0065.$ic184$, var298);
                        }
                        var288 = Numbers.add(var288, (SubLObject)module0065.ONE_INTEGER);
                    }
                    var256 = Numbers.add(var256, (SubLObject)module0065.ONE_INTEGER);
                }
            }
        }
        if (module0065.NIL == Errors.$ignore_mustsP$.getDynamicValue(var245) && !var288.numE(var286)) {
            Errors.error((SubLObject)module0065.$ic185$, var288, var286);
        }
        return (SubLObject)module0065.$ic151$;
    }
    
    public static SubLObject f4801(final SubLObject var156, final SubLObject var157, final SubLObject var244, SubLObject var158) {
        if (var158 == module0065.UNPROVIDED) {
            var158 = (SubLObject)module0065.$ic148$;
        }
        final SubLObject var245 = f4789(var156, var157, var158);
        final SubLObject var246 = Numbers.add(var157, var156);
        final SubLObject var247 = module0077.f5313((SubLObject)module0065.UNPROVIDED, (SubLObject)module0065.UNPROVIDED);
        SubLObject var248 = (SubLObject)ConsesLow.list((SubLObject)module0065.ZERO_INTEGER, Numbers.subtract(var156, (SubLObject)module0065.ONE_INTEGER));
        SubLObject var249 = (SubLObject)module0065.NIL;
        var249 = var248.first();
        while (module0065.NIL != var248) {
            f4761(var245, var249);
            module0077.f5326(var249, var247);
            var248 = var248.rest();
            var249 = var248.first();
        }
        while (module0077.f5311(var247).numL(var244)) {
            final SubLObject var250 = random.random(var246);
            if (module0065.NIL == module0077.f5320(var250, var247)) {
                f4761(var245, var250);
                module0077.f5326(var250, var247);
            }
        }
        return Values.values(var245, module0077.f5312(var247));
    }
    
    public static SubLObject f4806(final SubLObject var13, final SubLObject var159) {
        final SubLObject var160 = module0067.f4880(var159, (SubLObject)module0065.UNPROVIDED);
        return f4802(var13, var160, (SubLObject)module0065.UNPROVIDED);
    }
    
    public static SubLObject f4808(final SubLObject var218, final SubLObject var118) {
        final SubLThread var219 = SubLProcess.currentSubLThread();
        final SubLObject var220 = f4745(var218, Numbers.$most_positive_fixnum$.getGlobalValue());
        final SubLObject var221 = module0067.f4880((SubLObject)module0065.EQL, (SubLObject)module0065.UNPROVIDED);
        final SubLObject var222 = module0077.f5313((SubLObject)module0065.EQL, (SubLObject)module0065.UNPROVIDED);
        SubLObject var223;
        SubLObject var224;
        SubLObject var225;
        for (var223 = (SubLObject)module0065.NIL, var223 = (SubLObject)module0065.ZERO_INTEGER; var223.numL(var118); var223 = Numbers.add(var223, (SubLObject)module0065.ONE_INTEGER)) {
            var224 = module0038.f2624(var223);
            var225 = f4746(var220);
            if (!var225.isFixnum()) {
                module0077.f5326(var225, var222);
            }
            f4753(var220, var225, var224);
            module0079.f5412(var221, var225, var224);
        }
        if (module0065.NIL == Errors.$ignore_mustsP$.getDynamicValue(var219) && module0065.NIL != module0077.f5316(var222)) {
            Errors.error((SubLObject)module0065.$ic188$);
        }
        SubLObject var226;
        SubLObject var227;
        SubLObject var228;
        for (var223 = (SubLObject)module0065.NIL, var223 = (SubLObject)module0065.ZERO_INTEGER; var223.numL(var118); var223 = Numbers.add(var223, (SubLObject)module0065.ONE_INTEGER)) {
            var226 = Numbers.add(Numbers.$most_positive_fixnum$.getGlobalValue(), var223);
            var227 = module0079.f5414(var221, var226, (SubLObject)module0065.UNPROVIDED);
            var228 = f4750(var220, var226, (SubLObject)module0065.$ic189$);
            if (module0065.NIL == Errors.$ignore_mustsP$.getDynamicValue(var219) && module0065.NIL == Strings.stringE(var227, var228, (SubLObject)module0065.UNPROVIDED, (SubLObject)module0065.UNPROVIDED, (SubLObject)module0065.UNPROVIDED, (SubLObject)module0065.UNPROVIDED)) {
                Errors.error((SubLObject)module0065.$ic190$, var227, var226);
            }
        }
        return (SubLObject)module0065.$ic151$;
    }
    
    public static SubLObject f4809() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4717", "S#6291", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4719", "S#6283", 1, 0, false);
        new $f4719$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4720", "S#6292", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4721", "S#6293", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4722", "S#6294", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4723", "S#6295", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4724", "S#6296", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4725", "S#6297", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4726", "S#6298", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4727", "S#6299", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4728", "S#6300", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4729", "S#6301", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4730", "S#6302", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4731", "S#6303", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4732", "S#6304", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4718", "S#6305", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4733", "ID-INDEX-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4735", "ID-INDEX-EMPTY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4736", "S#6306", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4737", "S#6307", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4739", "ID-INDEX-NEW-ID-THRESHOLD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4734", "ID-INDEX-NEXT-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4741", "S#6308", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4740", "ID-INDEX-OLD-OBJECTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4738", "S#6309", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0065", "f4742", "S#6310");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4743", "S#6311", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4744", "S#6312", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4745", "S#6313", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4746", "S#6314", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4747", "S#6315", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4748", "S#6316", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4749", "S#6317", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4750", "S#6318", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4751", "S#6319", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4753", "S#6320", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4754", "S#6321", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4755", "S#6322", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4756", "S#6323", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4758", "S#6324", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4757", "S#6325", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4761", "S#6326", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4762", "S#6327", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4752", "S#6328", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4763", "S#6329", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4764", "S#6330", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4765", "S#6331", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4766", "S#6332", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4767", "S#6333", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4768", "S#6334", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4769", "S#6335", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0065", "f4770", "DO-ID-INDEX");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0065", "f4771", "OLD-DO-ID-INDEX");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4772", "S#6336", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0065", "f4774", "S#6337");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4775", "S#6338", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4773", "S#6339", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0065", "f4776", "S#6340");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4777", "S#6341", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4778", "S#6342", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0065", "f4779", "S#6343");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4780", "S#6344", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4781", "S#6345", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4782", "S#6346", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4783", "S#6347", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4784", "S#6348", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4785", "S#6349", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4786", "S#6350", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4787", "S#6351", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4788", "S#6352", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4790", "S#6353", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4760", "S#6354", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4759", "S#6355", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4791", "S#6356", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4792", "S#6357", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4793", "S#6358", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4794", "S#6359", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4795", "S#6360", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4796", "S#6361", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4797", "S#6362", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4798", "S#6363", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4799", "S#6364", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4800", "S#6365", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4802", "S#6366", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4803", "S#6367", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4804", "S#6368", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4805", "S#6369", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4789", "S#6370", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4807", "S#6371", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4801", "S#6372", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4806", "S#6373", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0065", "f4808", "S#6374", 2, 0, false);
        return (SubLObject)module0065.NIL;
    }
    
    public static SubLObject f4810() {
        module0065.$g1078$ = SubLFiles.defconstant("S#6375", (SubLObject)module0065.$ic0$);
        module0065.$g1079$ = SubLFiles.deflexical("S#6376", (SubLObject)module0065.$ic46$);
        module0065.$g1080$ = SubLFiles.deflexical("S#6377", (SubLObject)module0065.EQ);
        module0065.$g1081$ = SubLFiles.defconstant("S#6378", Symbols.make_symbol((SubLObject)module0065.$ic49$));
        module0065.$g1082$ = SubLFiles.defconstant("S#6379", (SubLObject)module0065.$ic133$);
        return (SubLObject)module0065.NIL;
    }
    
    public static SubLObject f4811() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0065.$g1078$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0065.$ic7$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0065.$ic8$);
        Structures.def_csetf((SubLObject)module0065.$ic9$, (SubLObject)module0065.$ic10$);
        Structures.def_csetf((SubLObject)module0065.$ic11$, (SubLObject)module0065.$ic12$);
        Structures.def_csetf((SubLObject)module0065.$ic13$, (SubLObject)module0065.$ic14$);
        Structures.def_csetf((SubLObject)module0065.$ic15$, (SubLObject)module0065.$ic16$);
        Structures.def_csetf((SubLObject)module0065.$ic17$, (SubLObject)module0065.$ic18$);
        Equality.identity((SubLObject)module0065.$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0065.$g1078$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0065.$ic29$));
        module0002.f50((SubLObject)module0065.$ic36$, (SubLObject)module0065.$ic37$);
        module0002.f50((SubLObject)module0065.$ic38$, (SubLObject)module0065.$ic39$);
        module0002.f50((SubLObject)module0065.$ic43$, (SubLObject)module0065.$ic45$);
        module0002.f50((SubLObject)module0065.$ic50$, (SubLObject)module0065.$ic51$);
        module0002.f50((SubLObject)module0065.$ic68$, (SubLObject)module0065.$ic51$);
        module0002.f50((SubLObject)module0065.$ic37$, (SubLObject)module0065.$ic51$);
        module0002.f50((SubLObject)module0065.$ic83$, (SubLObject)module0065.$ic37$);
        module0002.f50((SubLObject)module0065.$ic86$, (SubLObject)module0065.$ic94$);
        module0002.f50((SubLObject)module0065.$ic39$, (SubLObject)module0065.$ic51$);
        module0002.f50((SubLObject)module0065.$ic106$, (SubLObject)module0065.$ic39$);
        module0002.f50((SubLObject)module0065.$ic117$, (SubLObject)module0065.$ic39$);
        module0002.f50((SubLObject)module0065.$ic126$, (SubLObject)module0065.$ic119$);
        module0002.f50((SubLObject)module0065.$ic128$, (SubLObject)module0065.$ic119$);
        module0002.f50((SubLObject)module0065.$ic130$, (SubLObject)module0065.$ic119$);
        module0002.f50((SubLObject)module0065.$ic131$, (SubLObject)module0065.$ic119$);
        module0021.f1193(module0065.$g1082$.getGlobalValue(), (SubLObject)module0065.$ic134$);
        Structures.register_method(module0021.$g749$.getGlobalValue(), module0065.$g1078$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0065.$ic135$));
        module0027.f1449((SubLObject)module0065.$ic140$, (SubLObject)ConsesLow.list(new SubLObject[] { module0065.$ic141$, module0065.NIL, module0065.$ic142$, module0065.NIL, module0065.$ic143$, module0065.NIL, module0065.$ic144$, module0065.$ic145$, module0065.$ic146$, module0065.T }), (SubLObject)module0065.$ic147$);
        module0027.f1449((SubLObject)module0065.$ic163$, (SubLObject)ConsesLow.list(new SubLObject[] { module0065.$ic141$, module0065.NIL, module0065.$ic142$, module0065.NIL, module0065.$ic143$, module0065.NIL, module0065.$ic144$, module0065.$ic145$, module0065.$ic146$, module0065.T }), (SubLObject)module0065.$ic164$);
        module0027.f1449((SubLObject)module0065.$ic169$, (SubLObject)ConsesLow.list(new SubLObject[] { module0065.$ic141$, module0065.NIL, module0065.$ic142$, module0065.NIL, module0065.$ic143$, module0065.NIL, module0065.$ic144$, module0065.$ic145$, module0065.$ic146$, module0065.T }), (SubLObject)module0065.$ic147$);
        module0027.f1449((SubLObject)module0065.$ic175$, (SubLObject)ConsesLow.list(new SubLObject[] { module0065.$ic141$, module0065.NIL, module0065.$ic142$, module0065.NIL, module0065.$ic143$, module0065.NIL, module0065.$ic144$, module0065.$ic145$, module0065.$ic146$, module0065.NIL }), (SubLObject)module0065.$ic164$);
        module0027.f1449((SubLObject)module0065.$ic186$, (SubLObject)ConsesLow.list(new SubLObject[] { module0065.$ic141$, module0065.NIL, module0065.$ic142$, module0065.NIL, module0065.$ic143$, module0065.NIL, module0065.$ic144$, module0065.$ic145$, module0065.$ic146$, module0065.T }), (SubLObject)module0065.$ic187$);
        return (SubLObject)module0065.NIL;
    }
    
    public void declareFunctions() {
        f4809();
    }
    
    public void initializeVariables() {
        f4810();
    }
    
    public void runTopLevelForms() {
        f4811();
    }
    
    static {
        me = (SubLFile)new module0065();
        module0065.$g1078$ = null;
        module0065.$g1079$ = null;
        module0065.$g1080$ = null;
        module0065.$g1081$ = null;
        module0065.$g1082$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#6282", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("S#6283", "CYC");
        $ic2$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#672", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("COUNT"), (SubLObject)SubLObjectFactory.makeSymbol("S#6380", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6381", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6382", "CYC"));
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LOCK"), (SubLObject)SubLObjectFactory.makeKeyword("COUNT"), (SubLObject)SubLObjectFactory.makeKeyword("NEXT-ID"), (SubLObject)SubLObjectFactory.makeKeyword("OLD-OBJECTS"), (SubLObject)SubLObjectFactory.makeKeyword("NEW-OBJECTS"));
        $ic4$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6292", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6293", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6294", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6295", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6296", "CYC"));
        $ic5$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6297", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6298", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6299", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6300", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6301", "CYC"));
        $ic6$ = SubLObjectFactory.makeSymbol("S#6305", "CYC");
        $ic7$ = SubLObjectFactory.makeSymbol("S#6291", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#6283", "CYC"));
        $ic9$ = SubLObjectFactory.makeSymbol("S#6292", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("S#6297", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#6293", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#6298", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("S#6294", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("S#6299", "CYC");
        $ic15$ = SubLObjectFactory.makeSymbol("S#6295", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("S#6300", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("S#6296", "CYC");
        $ic18$ = SubLObjectFactory.makeSymbol("S#6301", "CYC");
        $ic19$ = SubLObjectFactory.makeKeyword("LOCK");
        $ic20$ = SubLObjectFactory.makeKeyword("COUNT");
        $ic21$ = SubLObjectFactory.makeKeyword("NEXT-ID");
        $ic22$ = SubLObjectFactory.makeKeyword("OLD-OBJECTS");
        $ic23$ = SubLObjectFactory.makeKeyword("NEW-OBJECTS");
        $ic24$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic25$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic26$ = SubLObjectFactory.makeSymbol("S#6302", "CYC");
        $ic27$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic28$ = SubLObjectFactory.makeKeyword("END");
        $ic29$ = SubLObjectFactory.makeSymbol("S#6304", "CYC");
        $ic30$ = SubLObjectFactory.makeString("#<");
        $ic31$ = SubLObjectFactory.makeKeyword("STREAM");
        $ic32$ = SubLObjectFactory.makeString("COUNT=");
        $ic33$ = SubLObjectFactory.makeString(" NEXT=");
        $ic34$ = SubLObjectFactory.makeKeyword("BASE");
        $ic35$ = SubLObjectFactory.makeSymbol("INTEGERP");
        $ic36$ = SubLObjectFactory.makeSymbol("ID-INDEX-OLD-OBJECTS");
        $ic37$ = SubLObjectFactory.makeSymbol("S#6337", "CYC");
        $ic38$ = SubLObjectFactory.makeSymbol("S#6309", "CYC");
        $ic39$ = SubLObjectFactory.makeSymbol("S#6340", "CYC");
        $ic40$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6282", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic41$ = SubLObjectFactory.makeUninternedSymbol("US#3C5FBB");
        $ic42$ = SubLObjectFactory.makeSymbol("CLET");
        $ic43$ = SubLObjectFactory.makeSymbol("S#6311", "CYC");
        $ic44$ = SubLObjectFactory.makeSymbol("WITH-LOCK-HELD");
        $ic45$ = SubLObjectFactory.makeSymbol("S#6310", "CYC");
        $ic46$ = SubLObjectFactory.makeInteger(100);
        $ic47$ = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $ic48$ = SubLObjectFactory.makeString("ID-INDEX");
        $ic49$ = SubLObjectFactory.makeString("THE-EMPTY-LIST");
        $ic50$ = SubLObjectFactory.makeSymbol("S#6317", "CYC");
        $ic51$ = SubLObjectFactory.makeSymbol("DO-ID-INDEX");
        $ic52$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6331", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6334", "CYC"));
        $ic53$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6333", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6335", "CYC"));
        $ic54$ = SubLObjectFactory.makeSymbol("S#6332", "CYC");
        $ic55$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1519", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"));
        $ic56$ = SubLObjectFactory.makeSymbol("BOOLEAN");
        $ic57$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1519", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#154", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6282", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6383", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("SKIP")), (SubLObject)SubLObjectFactory.makeSymbol("S#6384", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#130", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic58$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TOMBSTONE"), (SubLObject)SubLObjectFactory.makeKeyword("ORDERED"), (SubLObject)SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $ic59$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic60$ = SubLObjectFactory.makeKeyword("TOMBSTONE");
        $ic61$ = SubLObjectFactory.makeKeyword("SKIP");
        $ic62$ = SubLObjectFactory.makeKeyword("ORDERED");
        $ic63$ = SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE");
        $ic64$ = SubLObjectFactory.makeKeyword("DONE");
        $ic65$ = SubLObjectFactory.makeSymbol("OLD-DO-ID-INDEX");
        $ic66$ = SubLObjectFactory.makeUninternedSymbol("US#1124895");
        $ic67$ = SubLObjectFactory.makeSymbol("PUNLESS");
        $ic68$ = SubLObjectFactory.makeSymbol("S#6336", "CYC");
        $ic69$ = SubLObjectFactory.makeUninternedSymbol("US#1124895");
        $ic70$ = SubLObjectFactory.makeUninternedSymbol("US#71668C4");
        $ic71$ = SubLObjectFactory.makeUninternedSymbol("US#13E86D7");
        $ic72$ = SubLObjectFactory.makeUninternedSymbol("US#53EB1D3");
        $ic73$ = SubLObjectFactory.makeSymbol("ID-INDEX-COUNT");
        $ic74$ = ConsesLow.list((SubLObject)module0065.ZERO_INTEGER);
        $ic75$ = SubLObjectFactory.makeSymbol("CHECK-TYPE");
        $ic76$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRINGP"));
        $ic77$ = SubLObjectFactory.makeSymbol("NOTING-PERCENT-PROGRESS");
        $ic78$ = SubLObjectFactory.makeSymbol("NOTE-PERCENT-PROGRESS");
        $ic79$ = SubLObjectFactory.makeSymbol("CINC");
        $ic80$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1519", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#154", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6282", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6383", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("SKIP")), (SubLObject)SubLObjectFactory.makeSymbol("S#130", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic81$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TOMBSTONE"), (SubLObject)SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $ic82$ = SubLObjectFactory.makeUninternedSymbol("US#1124895");
        $ic83$ = SubLObjectFactory.makeSymbol("S#6338", "CYC");
        $ic84$ = SubLObjectFactory.makeSymbol("DO-VECTOR-INDEX");
        $ic85$ = SubLObjectFactory.makeSymbol("CAND");
        $ic86$ = SubLObjectFactory.makeSymbol("S#6339", "CYC");
        $ic87$ = SubLObjectFactory.makeSymbol("PWHEN");
        $ic88$ = SubLObjectFactory.makeSymbol("CSETQ");
        $ic89$ = SubLObjectFactory.makeUninternedSymbol("US#1124895");
        $ic90$ = SubLObjectFactory.makeUninternedSymbol("US#71668C4");
        $ic91$ = SubLObjectFactory.makeUninternedSymbol("US#13E86D7");
        $ic92$ = SubLObjectFactory.makeUninternedSymbol("US#53EB1D3");
        $ic93$ = SubLObjectFactory.makeSymbol("S#6306", "CYC");
        $ic94$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6337", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6340", "CYC"));
        $ic95$ = SubLObjectFactory.makeUninternedSymbol("US#1124895");
        $ic96$ = SubLObjectFactory.makeUninternedSymbol("US#71668C4");
        $ic97$ = SubLObjectFactory.makeUninternedSymbol("US#13E86D7");
        $ic98$ = SubLObjectFactory.makeUninternedSymbol("US#53EB1D3");
        $ic99$ = SubLObjectFactory.makeSymbol("S#6307", "CYC");
        $ic100$ = SubLObjectFactory.makeUninternedSymbol("US#1124895");
        $ic101$ = SubLObjectFactory.makeSymbol("PIF");
        $ic102$ = SubLObjectFactory.makeUninternedSymbol("US#1124895");
        $ic103$ = SubLObjectFactory.makeUninternedSymbol("US#7167096");
        $ic104$ = SubLObjectFactory.makeUninternedSymbol("US#12B0C1F");
        $ic105$ = SubLObjectFactory.makeUninternedSymbol("US#7850A52");
        $ic106$ = SubLObjectFactory.makeSymbol("S#6341", "CYC");
        $ic107$ = SubLObjectFactory.makeSymbol("ID-INDEX-NEW-ID-THRESHOLD");
        $ic108$ = SubLObjectFactory.makeSymbol("ID-INDEX-NEXT-ID");
        $ic109$ = SubLObjectFactory.makeSymbol("FUNLESS");
        $ic110$ = SubLObjectFactory.makeSymbol("WHILE");
        $ic111$ = SubLObjectFactory.makeSymbol("<");
        $ic112$ = SubLObjectFactory.makeSymbol("CNOT");
        $ic113$ = SubLObjectFactory.makeSymbol("GETHASH-WITHOUT-VALUES");
        $ic114$ = SubLObjectFactory.makeString("Setting :TOMBSTONE to ~A requires that :ORDERED be set to T");
        $ic115$ = SubLObjectFactory.makeUninternedSymbol("US#1124895");
        $ic116$ = SubLObjectFactory.makeSymbol("DO-HASH-TABLE");
        $ic117$ = SubLObjectFactory.makeSymbol("S#6342", "CYC");
        $ic118$ = SubLObjectFactory.makeUninternedSymbol("US#1124895");
        $ic119$ = SubLObjectFactory.makeSymbol("S#6343", "CYC");
        $ic120$ = SubLObjectFactory.makeUninternedSymbol("US#71668C4");
        $ic121$ = SubLObjectFactory.makeUninternedSymbol("US#13E86D7");
        $ic122$ = SubLObjectFactory.makeUninternedSymbol("US#53EB1D3");
        $ic123$ = SubLObjectFactory.makeUninternedSymbol("US#33EA0D2");
        $ic124$ = SubLObjectFactory.makeUninternedSymbol("US#14A7892");
        $ic125$ = SubLObjectFactory.makeUninternedSymbol("US#191F897");
        $ic126$ = SubLObjectFactory.makeSymbol("S#6344", "CYC");
        $ic127$ = ConsesLow.list((SubLObject)module0065.NIL, (SubLObject)module0065.NIL);
        $ic128$ = SubLObjectFactory.makeSymbol("S#6345", "CYC");
        $ic129$ = ConsesLow.list((SubLObject)module0065.NIL);
        $ic130$ = SubLObjectFactory.makeSymbol("S#6346", "CYC");
        $ic131$ = SubLObjectFactory.makeSymbol("S#6347", "CYC");
        $ic132$ = SubLObjectFactory.makeString("unexpected new-do-id-index iteration state ~S");
        $ic133$ = SubLObjectFactory.makeInteger(128);
        $ic134$ = SubLObjectFactory.makeSymbol("S#6351", "CYC");
        $ic135$ = SubLObjectFactory.makeSymbol("S#6348", "CYC");
        $ic136$ = SubLObjectFactory.makeString("Expected ~A old elements, got ~A instead.");
        $ic137$ = SubLObjectFactory.makeString("Expected ~A new elements, got ~A instead.");
        $ic138$ = SubLObjectFactory.makeString("The new ID index should have ~A entries, but it has ~A.");
        $ic139$ = SubLObjectFactory.makeString("The new ID index should have an old space size of ~A, not ~A.");
        $ic140$ = SubLObjectFactory.makeSymbol("S#6352", "CYC");
        $ic141$ = SubLObjectFactory.makeKeyword("TEST");
        $ic142$ = SubLObjectFactory.makeKeyword("OWNER");
        $ic143$ = SubLObjectFactory.makeKeyword("CLASSES");
        $ic144$ = SubLObjectFactory.makeKeyword("KB");
        $ic145$ = SubLObjectFactory.makeKeyword("TINY");
        $ic146$ = SubLObjectFactory.makeKeyword("WORKING?");
        $ic147$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(100), (SubLObject)module0065.TWENTY_INTEGER), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(100), (SubLObject)module0065.TWENTY_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("S#3985", "CYC"), (SubLObject)module0065.EQUAL), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")));
        $ic148$ = SubLObjectFactory.makeSymbol("S#746", "CYC");
        $ic149$ = SubLObjectFactory.makeString("We did not get an ID index back, but got ~A instead.");
        $ic150$ = SubLObjectFactory.makeString("The old ID index ~A does not have the same number of elements as the new ID index ~A.");
        $ic151$ = SubLObjectFactory.makeKeyword("SUCCESS");
        $ic152$ = SubLObjectFactory.makeSymbol("S#6355", "CYC");
        $ic153$ = SubLObjectFactory.makeString("Compacting ID index");
        $ic154$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic155$ = SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P");
        $ic156$ = SubLObjectFactory.makeString("Updating object IDs");
        $ic157$ = SubLObjectFactory.makeKeyword("ALL");
        $ic158$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALL"), (SubLObject)SubLObjectFactory.makeKeyword("OLD"), (SubLObject)SubLObjectFactory.makeKeyword("NEW"));
        $ic159$ = SubLObjectFactory.makeString("Type must be one of -- :ALL :OLD :NEW");
        $ic160$ = SubLObjectFactory.makeKeyword("NEW");
        $ic161$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeUninternedSymbol("US#352B2C1"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#13A2892"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#1160044"));
        $ic162$ = SubLObjectFactory.makeKeyword("OLD");
        $ic163$ = SubLObjectFactory.makeSymbol("S#6365", "CYC");
        $ic164$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(100), (SubLObject)module0065.TWENTY_INTEGER, (SubLObject)module0065.TWENTY_INTEGER), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(1000), (SubLObject)SubLObjectFactory.makeInteger(200), (SubLObject)SubLObjectFactory.makeInteger(200)), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(255), (SubLObject)module0065.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(40)), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")));
        $ic165$ = SubLObjectFactory.makeString("ID ~A is missing; it is ~A.");
        $ic166$ = SubLObjectFactory.makeString("expected to be present");
        $ic167$ = SubLObjectFactory.makeString("expected to be absent");
        $ic168$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#131", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#1519", "CYC"));
        $ic169$ = SubLObjectFactory.makeSymbol("S#6369", "CYC");
        $ic170$ = SubLObjectFactory.makeString("The old ID index ~A is of a different size than the new ID index ~A.");
        $ic171$ = SubLObjectFactory.makeKeyword("NOT-FOUND");
        $ic172$ = SubLObjectFactory.makeString("The reverse index for ~A does not contain ~A.");
        $ic173$ = SubLObjectFactory.makeString("The new ID index does not have ~A at location ~A.");
        $ic174$ = SubLObjectFactory.makeString("There is a mismatch between the ~A-nth expected next ID, ~A and the actual ID suggested ~A.");
        $ic175$ = SubLObjectFactory.makeSymbol("S#6371", "CYC");
        $ic176$ = SubLObjectFactory.makeKeyword("RIP");
        $ic177$ = SubLObjectFactory.makeString("Error, the ID range is not truely consecutive; expected ~A got ~A.");
        $ic178$ = SubLObjectFactory.makeString("Error at index ~A, expected tombstone, got ~A.");
        $ic179$ = SubLObjectFactory.makeString("Error at index ~A, expected object, got tombstone.");
        $ic180$ = SubLObjectFactory.makeString("There are holes that we did not see: ~A were missing.");
        $ic181$ = SubLObjectFactory.makeString("Error, ID ~A is not in line with counter ~A.");
        $ic182$ = SubLObjectFactory.makeString(":DONE should have taken us to ~A but it got us to ~A.");
        $ic183$ = SubLObjectFactory.makeString("Hey, we deleted everything and the ID index is not empty?");
        $ic184$ = SubLObjectFactory.makeString("Error, an empty ID index contains non-tombstone ~A???");
        $ic185$ = SubLObjectFactory.makeString("Hey, ~A =/= ~A; they did not show us all the tombstones ...!");
        $ic186$ = SubLObjectFactory.makeSymbol("S#6374", "CYC");
        $ic187$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(100), (SubLObject)module0065.TWENTY_INTEGER), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(100), (SubLObject)SubLObjectFactory.makeInteger(200)), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")));
        $ic188$ = SubLObjectFactory.makeString("The test is badly designed, no bignum IDs were produced.~%");
        $ic189$ = SubLObjectFactory.makeString("");
        $ic190$ = SubLObjectFactory.makeString("We could not retrieve ~S from the ID index using ~A.");
    }
    
    public static final class $sX6282_native extends SubLStructNative
    {
        public SubLObject $lock;
        public SubLObject $count;
        public SubLObject $next_id;
        public SubLObject $old_objects;
        public SubLObject $new_objects;
        private static final SubLStructDeclNative structDecl;
        
        public $sX6282_native() {
            this.$lock = (SubLObject)CommonSymbols.NIL;
            this.$count = (SubLObject)CommonSymbols.NIL;
            this.$next_id = (SubLObject)CommonSymbols.NIL;
            this.$old_objects = (SubLObject)CommonSymbols.NIL;
            this.$new_objects = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX6282_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$lock;
        }
        
        public SubLObject getField3() {
            return this.$count;
        }
        
        public SubLObject getField4() {
            return this.$next_id;
        }
        
        public SubLObject getField5() {
            return this.$old_objects;
        }
        
        public SubLObject getField6() {
            return this.$new_objects;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$lock = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$count = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$next_id = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$old_objects = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$new_objects = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX6282_native.class, module0065.$ic0$, module0065.$ic1$, module0065.$ic2$, module0065.$ic3$, new String[] { "$lock", "$count", "$next_id", "$old_objects", "$new_objects" }, module0065.$ic4$, module0065.$ic5$, module0065.$ic6$);
        }
    }
    
    public static final class $f4719$UnaryFunction extends UnaryFunction
    {
        public $f4719$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#6283"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0065.f4719(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0065.class
	Total time: 871 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/