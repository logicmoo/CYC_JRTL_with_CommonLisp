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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0810 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0810";
    public static final String myFingerPrint = "8e02c8fd8d38b619f2aa31987c6a7e940131e21d1edd92f340605593711ed76b";
    private static SubLSymbol $g6435$;
    public static SubLSymbol $g6436$;
    private static SubLSymbol $g6437$;
    private static SubLSymbol $g6438$;
    private static SubLSymbol $g6439$;
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLList $ic3$;
    private static final SubLList $ic4$;
    private static final SubLList $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLList $ic9$;
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
    private static final SubLString $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLInteger $ic47$;
    private static final SubLInteger $ic48$;
    private static final SubLInteger $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLList $ic51$;
    private static final SubLString $ic52$;
    private static final SubLString $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLString $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLString $ic57$;
    private static final SubLString $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLString $ic63$;
    private static final SubLString $ic64$;
    private static final SubLString $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLString $ic67$;
    private static final SubLList $ic68$;
    private static final SubLString $ic69$;
    private static final SubLString $ic70$;
    private static final SubLString $ic71$;
    private static final SubLString $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLString $ic76$;
    private static final SubLList $ic77$;
    private static final SubLObject $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLString $ic83$;
    private static final SubLString $ic84$;
    private static final SubLString $ic85$;
    private static final SubLString $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLString $ic88$;
    private static final SubLString $ic89$;
    private static final SubLString $ic90$;
    private static final SubLString $ic91$;
    private static final SubLString $ic92$;
    private static final SubLString $ic93$;
    private static final SubLString $ic94$;
    private static final SubLString $ic95$;
    private static final SubLString $ic96$;
    private static final SubLString $ic97$;
    private static final SubLString $ic98$;
    private static final SubLString $ic99$;
    private static final SubLString $ic100$;
    private static final SubLString $ic101$;
    private static final SubLString $ic102$;
    private static final SubLString $ic103$;
    
    public static SubLObject f51702(final SubLObject var1) {
        return module0035.f2169(var1, $g6435$.getGlobalValue());
    }
    
    public static SubLObject f51703(final SubLObject var2, final SubLObject var3) {
        compatibility.default_struct_print_function(var2, var3, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51704(final SubLObject var2) {
        return (SubLObject)((var2.getClass() == $sX56414_native.class) ? T : NIL);
    }
    
    public static SubLObject f51705(final SubLObject var2) {
        assert NIL != f51704(var2) : var2;
        return var2.getField2();
    }
    
    public static SubLObject f51706(final SubLObject var2) {
        assert NIL != f51704(var2) : var2;
        return var2.getField3();
    }
    
    public static SubLObject f51707(final SubLObject var2) {
        assert NIL != f51704(var2) : var2;
        return var2.getField4();
    }
    
    public static SubLObject f51708(final SubLObject var2) {
        assert NIL != f51704(var2) : var2;
        return var2.getField5();
    }
    
    public static SubLObject f51709(final SubLObject var2) {
        assert NIL != f51704(var2) : var2;
        return var2.getField6();
    }
    
    public static SubLObject f51710(final SubLObject var2) {
        assert NIL != f51704(var2) : var2;
        return var2.getField7();
    }
    
    public static SubLObject f51711(final SubLObject var2) {
        assert NIL != f51704(var2) : var2;
        return var2.getField8();
    }
    
    public static SubLObject f51712(final SubLObject var2) {
        assert NIL != f51704(var2) : var2;
        return var2.getField9();
    }
    
    public static SubLObject f51713(final SubLObject var2) {
        assert NIL != f51704(var2) : var2;
        return var2.getField10();
    }
    
    public static SubLObject f51714(final SubLObject var2) {
        assert NIL != f51704(var2) : var2;
        return var2.getField11();
    }
    
    public static SubLObject f51715(final SubLObject var2, final SubLObject var5) {
        assert NIL != f51704(var2) : var2;
        return var2.setField2(var5);
    }
    
    public static SubLObject f51716(final SubLObject var2, final SubLObject var5) {
        assert NIL != f51704(var2) : var2;
        return var2.setField3(var5);
    }
    
    public static SubLObject f51717(final SubLObject var2, final SubLObject var5) {
        assert NIL != f51704(var2) : var2;
        return var2.setField4(var5);
    }
    
    public static SubLObject f51718(final SubLObject var2, final SubLObject var5) {
        assert NIL != f51704(var2) : var2;
        return var2.setField5(var5);
    }
    
    public static SubLObject f51719(final SubLObject var2, final SubLObject var5) {
        assert NIL != f51704(var2) : var2;
        return var2.setField6(var5);
    }
    
    public static SubLObject f51720(final SubLObject var2, final SubLObject var5) {
        assert NIL != f51704(var2) : var2;
        return var2.setField7(var5);
    }
    
    public static SubLObject f51721(final SubLObject var2, final SubLObject var5) {
        assert NIL != f51704(var2) : var2;
        return var2.setField8(var5);
    }
    
    public static SubLObject f51722(final SubLObject var2, final SubLObject var5) {
        assert NIL != f51704(var2) : var2;
        return var2.setField9(var5);
    }
    
    public static SubLObject f51723(final SubLObject var2, final SubLObject var5) {
        assert NIL != f51704(var2) : var2;
        return var2.setField10(var5);
    }
    
    public static SubLObject f51724(final SubLObject var2, final SubLObject var5) {
        assert NIL != f51704(var2) : var2;
        return var2.setField11(var5);
    }
    
    public static SubLObject f51725(SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        final SubLObject var7 = (SubLObject)new $sX56414_native();
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        SubLObject var11;
        for (var8 = (SubLObject)NIL, var8 = var6; NIL != var8; var8 = conses_high.cddr(var8)) {
            var9 = var8.first();
            var10 = conses_high.cadr(var8);
            var11 = var9;
            if (var11.eql((SubLObject)$ic30$)) {
                f51715(var7, var10);
            }
            else if (var11.eql((SubLObject)$ic31$)) {
                f51716(var7, var10);
            }
            else if (var11.eql((SubLObject)$ic32$)) {
                f51717(var7, var10);
            }
            else if (var11.eql((SubLObject)$ic33$)) {
                f51718(var7, var10);
            }
            else if (var11.eql((SubLObject)$ic34$)) {
                f51719(var7, var10);
            }
            else if (var11.eql((SubLObject)$ic35$)) {
                f51720(var7, var10);
            }
            else if (var11.eql((SubLObject)$ic36$)) {
                f51721(var7, var10);
            }
            else if (var11.eql((SubLObject)$ic37$)) {
                f51722(var7, var10);
            }
            else if (var11.eql((SubLObject)$ic38$)) {
                f51723(var7, var10);
            }
            else if (var11.eql((SubLObject)$ic39$)) {
                f51724(var7, var10);
            }
            else {
                Errors.error((SubLObject)$ic40$, var9);
            }
        }
        return var7;
    }
    
    public static SubLObject f51726(final SubLObject var12, final SubLObject var13) {
        Functions.funcall(var13, var12, (SubLObject)$ic41$, (SubLObject)$ic42$, (SubLObject)TEN_INTEGER);
        Functions.funcall(var13, var12, (SubLObject)$ic43$, (SubLObject)$ic30$, f51705(var12));
        Functions.funcall(var13, var12, (SubLObject)$ic43$, (SubLObject)$ic31$, f51706(var12));
        Functions.funcall(var13, var12, (SubLObject)$ic43$, (SubLObject)$ic32$, f51707(var12));
        Functions.funcall(var13, var12, (SubLObject)$ic43$, (SubLObject)$ic33$, f51708(var12));
        Functions.funcall(var13, var12, (SubLObject)$ic43$, (SubLObject)$ic34$, f51709(var12));
        Functions.funcall(var13, var12, (SubLObject)$ic43$, (SubLObject)$ic35$, f51710(var12));
        Functions.funcall(var13, var12, (SubLObject)$ic43$, (SubLObject)$ic36$, f51711(var12));
        Functions.funcall(var13, var12, (SubLObject)$ic43$, (SubLObject)$ic37$, f51712(var12));
        Functions.funcall(var13, var12, (SubLObject)$ic43$, (SubLObject)$ic38$, f51713(var12));
        Functions.funcall(var13, var12, (SubLObject)$ic43$, (SubLObject)$ic39$, f51714(var12));
        Functions.funcall(var13, var12, (SubLObject)$ic44$, (SubLObject)$ic42$, (SubLObject)TEN_INTEGER);
        return var12;
    }
    
    public static SubLObject f51727(final SubLObject var12, final SubLObject var13) {
        return f51726(var12, var13);
    }
    
    public static SubLObject f51728(final SubLObject var14) {
        assert NIL != f51702(var14) : var14;
        final SubLObject var15 = f51725((SubLObject)UNPROVIDED);
        SubLObject var16 = (SubLObject)NIL;
        SubLObject var17 = (SubLObject)NIL;
        SubLObject var18 = (SubLObject)NIL;
        SubLObject var19 = (SubLObject)NIL;
        SubLObject var20 = (SubLObject)NIL;
        SubLObject var21 = (SubLObject)NIL;
        SubLObject var22 = (SubLObject)NIL;
        SubLObject var23 = (SubLObject)NIL;
        SubLObject var24 = (SubLObject)NIL;
        final SubLObject var25 = (SubLObject)$ic47$;
        var16 = module0065.f4745(var25, (SubLObject)ZERO_INTEGER);
        var17 = Hashtables.make_hash_table(var25, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
        final SubLObject var26 = (SubLObject)$ic48$;
        var18 = module0065.f4745(var26, (SubLObject)ZERO_INTEGER);
        var19 = Hashtables.make_hash_table(var26, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
        final SubLObject var27 = (SubLObject)$ic48$;
        var20 = module0065.f4745(var27, (SubLObject)ZERO_INTEGER);
        var21 = Hashtables.make_hash_table(var27, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
        final SubLObject var28 = (SubLObject)$ic48$;
        var22 = module0065.f4745(var28, (SubLObject)ZERO_INTEGER);
        var23 = Hashtables.make_hash_table(var28, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
        final SubLObject var29 = (SubLObject)$ic49$;
        var24 = module0077.f5313(Symbols.symbol_function((SubLObject)EQ), var29);
        f51729(var15, var14, var16, var17, var18, var19, var20, var21, var22, var23, var24);
        f51730(var15);
        return var15;
    }
    
    public static SubLObject f51729(final SubLObject var15, final SubLObject var14, final SubLObject var16, final SubLObject var17, final SubLObject var18, final SubLObject var19, final SubLObject var20, final SubLObject var21, final SubLObject var22, final SubLObject var23, final SubLObject var24) {
        f51715(var15, var14);
        f51716(var15, var16);
        f51717(var15, var17);
        f51718(var15, var18);
        f51719(var15, var19);
        f51720(var15, var20);
        f51721(var15, var21);
        f51723(var15, var22);
        f51724(var15, var23);
        f51722(var15, var24);
        return var15;
    }
    
    public static SubLObject f51731(final SubLObject var15) {
        assert NIL != f51704(var15) : var15;
        f51715(var15, (SubLObject)$ic50$);
        module0065.f4762(f51706(var15));
        f51716(var15, (SubLObject)$ic50$);
        Hashtables.clrhash(f51707(var15));
        f51717(var15, (SubLObject)$ic50$);
        module0065.f4762(f51708(var15));
        f51718(var15, (SubLObject)$ic50$);
        Hashtables.clrhash(f51709(var15));
        f51719(var15, (SubLObject)$ic50$);
        module0065.f4762(f51710(var15));
        f51720(var15, (SubLObject)$ic50$);
        Hashtables.clrhash(f51711(var15));
        f51721(var15, (SubLObject)$ic50$);
        Hashtables.clrhash(f51712(var15));
        f51722(var15, (SubLObject)$ic50$);
        module0065.f4762(f51713(var15));
        f51723(var15, (SubLObject)$ic50$);
        Hashtables.clrhash(f51714(var15));
        f51724(var15, (SubLObject)$ic50$);
        return var15;
    }
    
    public static SubLObject f51732(final SubLObject var15) {
        assert NIL != f51704(var15) : var15;
        return f51705(var15);
    }
    
    public static SubLObject f51733(final SubLObject var15, final SubLObject var30) {
        assert NIL != f51704(var15) : var15;
        return module0065.f4750(f51706(var15), var30, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f51734(final SubLObject var15, final SubLObject var30) {
        assert NIL != f51704(var15) : var15;
        return module0065.f4750(f51708(var15), var30, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f51735(final SubLObject var15, final SubLObject var30) {
        assert NIL != f51704(var15) : var15;
        return module0065.f4750(f51710(var15), var30, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f51736(final SubLObject var15, final SubLObject var31) {
        assert NIL != f51704(var15) : var15;
        return module0077.f5320(var31, f51712(var15));
    }
    
    public static SubLObject f51737(final SubLObject var15, final SubLObject var30) {
        assert NIL != f51704(var15) : var15;
        return module0065.f4750(f51713(var15), var30, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f51738(final SubLObject var15, final SubLObject var31) {
        final SubLObject var32 = f51732(var15);
        final SubLObject var33 = Symbols.symbol_package(var31);
        SubLObject var35;
        SubLObject var34 = var35 = Symbols.symbol_name(var31);
        if (NIL == f51739(var31) && NIL != module0035.f2169(var32, (SubLObject)$ic51$) && NIL == f51736(var15, var31)) {
            final SubLObject var36 = (SubLObject)((NIL != var33) ? $ic52$ : $ic53$);
            if (var32 == $ic54$) {
                if (NIL != var33) {
                    var34 = f51740(var15, var31);
                }
                else {
                    var34 = module0038.f2797(module0022.f1215(Symbols.symbol_name(var31)));
                }
            }
            var35 = Sequences.cconcatenate(module0006.f203(var36), new SubLObject[] { $ic55$, module0006.f203(var34) });
        }
        return var35;
    }
    
    public static SubLObject f51739(final SubLObject var1) {
        return (SubLObject)makeBoolean(var1.isSymbol() && (var1.isKeyword() || NIL != f51741(var1) || NIL != module0201.f12546(var1)));
    }
    
    public static SubLObject f51741(final SubLObject var1) {
        return (SubLObject)makeBoolean(var1.isSymbol() && var1.eql(Packages.find_symbol(Symbols.symbol_name(var1), module0018.$g576$.getGlobalValue())));
    }
    
    public static SubLObject f51742(final SubLObject var15, final SubLObject var37) {
        final SubLThread var38 = SubLProcess.currentSubLThread();
        SubLObject var39 = (SubLObject)NIL;
        try {
            final SubLObject var40 = stream_macros.$stream_requires_locking$.currentBinding(var38);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var38);
                var39 = compatibility.open_binary(var37, (SubLObject)$ic56$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var40, var38);
            }
            if (!var39.isStream()) {
                Errors.error((SubLObject)$ic57$, var37);
            }
            final SubLObject var41 = var39;
            f51743(var15, var41);
        }
        finally {
            final SubLObject var42 = Threads.$is_thread_performing_cleanupP$.currentBinding(var38);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var38);
                if (var39.isStream()) {
                    streams_high.close(var39, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var42, var38);
            }
        }
        return var37;
    }
    
    public static SubLObject f51743(final SubLObject var15, final SubLObject var3) {
        module0021.f1038(f51744(var15), var3);
        return var15;
    }
    
    public static SubLObject f51744(final SubLObject var15) {
        SubLObject var16 = (SubLObject)NIL;
        var16 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic59$, $g6437$.getGlobalValue()), var16);
        var16 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic60$, (SubLObject)ConsesLow.list((SubLObject)ONE_INTEGER, (SubLObject)ZERO_INTEGER)), var16);
        var16 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic61$, module0107.f7573()), var16);
        var16 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic30$, f51705(var15)), var16);
        var16 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic32$, f51707(var15)), var16);
        var16 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic34$, f51709(var15)), var16);
        var16 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic36$, f51711(var15)), var16);
        var16 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic39$, f51714(var15)), var16);
        var16 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic37$, f51712(var15)), var16);
        return var16;
    }
    
    public static SubLObject f51745(final SubLObject var43) {
        final SubLThread var44 = SubLProcess.currentSubLThread();
        SubLObject var45 = (SubLObject)NIL;
        SubLObject var46 = (SubLObject)NIL;
        try {
            final SubLObject var47 = stream_macros.$stream_requires_locking$.currentBinding(var44);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var44);
                var46 = compatibility.open_binary(var43, (SubLObject)$ic62$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var47, var44);
            }
            if (!var46.isStream()) {
                Errors.error((SubLObject)$ic57$, var43);
            }
            final SubLObject var48 = var46;
            var45 = f51746(var48);
        }
        finally {
            final SubLObject var49 = Threads.$is_thread_performing_cleanupP$.currentBinding(var44);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var44);
                if (var46.isStream()) {
                    streams_high.close(var46, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var49, var44);
            }
        }
        return var45;
    }
    
    public static SubLObject f51746(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        final SubLObject var5 = f51747(var3);
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var4) && !var5.isCons()) {
            Errors.error((SubLObject)$ic63$, var5);
        }
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var4) && NIL == Strings.stringE($g6437$.getGlobalValue(), f51748(var5, (SubLObject)$ic59$, (SubLObject)$ic64$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            Errors.error((SubLObject)$ic65$);
        }
        final SubLObject var6 = f51748(var5, (SubLObject)$ic60$, (SubLObject)UNPROVIDED);
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var4) && (!var6.isCons() || NIL == module0035.f2192((SubLObject)$ic66$, var6))) {
            Errors.error((SubLObject)$ic67$, var6);
        }
        return f51749(var5, var6);
    }
    
    public static SubLObject f51747(final SubLObject var3) {
        return module0021.f1060(var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f51748(final SubLObject var42, final SubLObject var46, SubLObject var47) {
        if (var47 == UNPROVIDED) {
            var47 = (SubLObject)NIL;
        }
        return module0035.f2293(var42, var46, Symbols.symbol_function((SubLObject)EQ), var47).first();
    }
    
    public static SubLObject f51749(final SubLObject var42, final SubLObject var45) {
        if ($ic68$.equal(var45)) {
            return f51750(var42);
        }
        Errors.error((SubLObject)$ic69$, var45);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51750(final SubLObject var42) {
        final SubLThread var43 = SubLProcess.currentSubLThread();
        SubLObject var44 = (SubLObject)NIL;
        SubLObject var45 = (SubLObject)NIL;
        SubLObject var46 = (SubLObject)NIL;
        SubLObject var47 = (SubLObject)NIL;
        SubLObject var48 = (SubLObject)NIL;
        SubLObject var49 = (SubLObject)NIL;
        SubLObject var50 = (SubLObject)NIL;
        SubLObject var51 = (SubLObject)NIL;
        SubLObject var52 = (SubLObject)NIL;
        SubLObject var53 = (SubLObject)NIL;
        var44 = f51748(var42, (SubLObject)$ic30$, (SubLObject)UNPROVIDED);
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var43) && NIL == f51702(var44)) {
            Errors.error((SubLObject)$ic70$, var44);
        }
        var46 = f51751(var42, (SubLObject)$ic32$);
        var48 = f51751(var42, (SubLObject)$ic34$);
        var50 = f51751(var42, (SubLObject)$ic36$);
        var52 = f51751(var42, (SubLObject)$ic39$);
        var45 = module0065.f4803(var46);
        var47 = module0065.f4803(var48);
        var49 = module0065.f4803(var50);
        var51 = module0065.f4803(var52);
        var53 = f51748(var42, (SubLObject)$ic37$, (SubLObject)UNPROVIDED);
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var43) && NIL == module0077.f5302(var53)) {
            Errors.error((SubLObject)$ic71$, var53);
        }
        return f51729(f51725((SubLObject)UNPROVIDED), var44, var45, var46, var47, var48, var49, var50, var51, var52, var53);
    }
    
    public static SubLObject f51751(final SubLObject var42, final SubLObject var48) {
        final SubLThread var49 = SubLProcess.currentSubLThread();
        final SubLObject var50 = f51748(var42, var48, (SubLObject)UNPROVIDED);
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var49) && NIL == module0079.f5404(var50)) {
            Errors.error((SubLObject)$ic72$, var50, var48);
        }
        return var50;
    }
    
    public static SubLObject f51752(final SubLObject var15, final SubLObject var50) {
        assert NIL != f51704(var15) : var15;
        assert NIL != Types.stringp(var50) : var50;
        return module0035.sublisp_boolean(Hashtables.gethash_without_values(var50, f51707(var15), (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f51753(final SubLObject var15, final SubLObject var51) {
        assert NIL != f51704(var15) : var15;
        assert NIL != Types.symbolp(var51) : var51;
        return module0035.sublisp_boolean(Hashtables.gethash_without_values(var51, f51709(var15), (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f51754(final SubLObject var15, final SubLObject var52) {
        assert NIL != f51704(var15) : var15;
        assert NIL != Types.symbolp(var52) : var52;
        return module0035.sublisp_boolean(Hashtables.gethash_without_values(var52, f51711(var15), (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f51755(final SubLObject var15, final SubLObject var50) {
        assert NIL != f51704(var15) : var15;
        assert NIL != Types.stringp(var50) : var50;
        SubLObject var51 = Hashtables.gethash_without_values(var50, f51707(var15), (SubLObject)UNPROVIDED);
        if (NIL == var51) {
            var51 = module0065.f4746(f51706(var15));
            module0065.f4753(f51706(var15), var51, var50);
            Hashtables.sethash(var50, f51707(var15), var51);
        }
        return var51;
    }
    
    public static SubLObject f51756(final SubLObject var15, final SubLObject var51) {
        assert NIL != f51704(var15) : var15;
        assert NIL != Types.symbolp(var51) : var51;
        SubLObject var52 = Hashtables.gethash_without_values(var51, f51709(var15), (SubLObject)UNPROVIDED);
        if (NIL == var52) {
            var52 = module0065.f4746(f51708(var15));
            module0065.f4753(f51708(var15), var52, var51);
            Hashtables.sethash(var51, f51709(var15), var52);
        }
        return var52;
    }
    
    public static SubLObject f51757(final SubLObject var15, final SubLObject var52) {
        assert NIL != f51704(var15) : var15;
        assert NIL != Types.symbolp(var52) : var52;
        SubLObject var53 = Hashtables.gethash_without_values(var52, f51711(var15), (SubLObject)UNPROVIDED);
        if (NIL == var53) {
            var53 = module0065.f4746(f51710(var15));
            module0065.f4753(f51710(var15), var53, var52);
            Hashtables.sethash(var52, f51711(var15), var53);
        }
        return var53;
    }
    
    public static SubLObject f51740(final SubLObject var15, final SubLObject var31) {
        assert NIL != f51704(var15) : var15;
        assert NIL != Types.symbolp(var31) : var31;
        SubLObject var32 = Hashtables.gethash_without_values(var31, f51714(var15), (SubLObject)UNPROVIDED);
        if (NIL == var32) {
            var32 = module0065.f4746(f51713(var15));
            module0065.f4753(f51713(var15), var32, var31);
            Hashtables.sethash(var31, f51714(var15), var32);
        }
        return var32;
    }
    
    public static SubLObject f51730(final SubLObject var15) {
        assert NIL != f51704(var15) : var15;
        if (NIL != module0035.f2169(f51732(var15), (SubLObject)$ic51$)) {
            final SubLObject var16 = f51712(var15);
            f51758(var16);
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51759(final SubLObject var15, final SubLObject var31) {
        assert NIL != f51704(var15) : var15;
        assert NIL != Types.symbolp(var31) : var31;
        if (NIL != module0035.f2169(f51732(var15), (SubLObject)$ic51$)) {
            module0077.f5326(var31, f51712(var15));
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51760(final SubLObject var54) {
        final SubLObject var55 = module0813.f52032();
        if (NIL != var55) {
            final SubLObject var56 = module0813.f52078(var55);
            if (NIL != var56) {
                return f51733(var56, var54);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51761(final SubLObject var56) {
        final SubLObject var57 = module0813.f52032();
        if (NIL != var57) {
            final SubLObject var58 = module0813.f52078(var57);
            if (NIL != var58) {
                return f51734(var58, var56);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51762(final SubLObject var57) {
        final SubLObject var58 = module0813.f52032();
        if (NIL != var58) {
            final SubLObject var59 = module0813.f52078(var58);
            if (NIL != var59) {
                return f51735(var59, var57);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51763(final SubLObject var58) {
        final SubLObject var59 = module0813.f52032();
        if (NIL != var59) {
            final SubLObject var60 = module0813.f52078(var59);
            if (NIL != var60) {
                return f51737(var60, var58);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51758(final SubLObject var53) {
        f51764(var53);
        f51765(var53);
        f51766(var53);
        f51767(var53);
        f51768(var53);
        f51769(var53);
        f51770(var53);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51764(final SubLObject var53) {
        SubLObject var54 = (SubLObject)NIL;
        SubLObject var55 = (SubLObject)NIL;
        Iterator var56 = Hashtables.getEntrySetIterator(module0012.$g40$.getGlobalValue());
        try {
            while (Hashtables.iteratorHasNext(var56)) {
                final Map.Entry var57 = Hashtables.iteratorNextEntry(var56);
                var54 = Hashtables.getEntryKey(var57);
                var55 = Hashtables.getEntryValue(var57);
                module0077.f5326(var54, var53);
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var56);
        }
        var54 = (SubLObject)NIL;
        var55 = (SubLObject)NIL;
        var56 = Hashtables.getEntrySetIterator(module0012.$g43$.getGlobalValue());
        try {
            while (Hashtables.iteratorHasNext(var56)) {
                final Map.Entry var57 = Hashtables.iteratorNextEntry(var56);
                var54 = Hashtables.getEntryKey(var57);
                var55 = Hashtables.getEntryValue(var57);
                module0077.f5326(var54, var53);
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var56);
        }
        module0077.f5326((SubLObject)$ic75$, var53);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51771(final SubLObject var53, final SubLObject var62) {
        final SubLObject var63 = Packages.find_package((SubLObject)$ic76$);
        SubLObject var64 = (SubLObject)ZERO_INTEGER;
        SubLObject var65 = var62;
        SubLObject var66 = (SubLObject)NIL;
        var66 = var65.first();
        while (NIL != var65) {
            if (var63.eql(Symbols.symbol_package(var66))) {
                var64 = Numbers.add(var64, (SubLObject)ONE_INTEGER);
                module0077.f5326(var66, var53);
            }
            var65 = var65.rest();
            var66 = var65.first();
        }
        return var64;
    }
    
    public static SubLObject f51765(final SubLObject var53) {
        return f51771(var53, module0002.f42());
    }
    
    public static SubLObject f51766(final SubLObject var53) {
        return f51771(var53, module0110.f7667());
    }
    
    public static SubLObject f51767(final SubLObject var53) {
        return f51771(var53, module0015.f875());
    }
    
    public static SubLObject f51768(final SubLObject var53) {
        return f51771(var53, module0012.f415());
    }
    
    public static SubLObject f51769(final SubLObject var53) {
        return f51771(var53, $g6438$.getGlobalValue());
    }
    
    public static SubLObject f51770(final SubLObject var53) {
        return f51771(var53, $g6439$.getGlobalValue());
    }
    
    public static SubLObject f51772(SubLObject var62) {
        if (var62 == UNPROVIDED) {
            var62 = $g6439$.getGlobalValue();
        }
        final SubLObject var63 = module0813.f52032();
        if (NIL != var63) {
            final SubLObject var64 = module0813.f52078(var63);
            final SubLObject var65 = f51712(var64);
            f51771(var65, var62);
        }
        SubLObject var66 = (SubLObject)NIL;
        SubLObject var67 = var62;
        SubLObject var68 = (SubLObject)NIL;
        var68 = var67.first();
        while (NIL != var67) {
            final SubLObject var69 = module0809.f51534(var68);
            final SubLObject var70 = (NIL != var69) ? var69 : module0809.f51540(var68);
            if (NIL != var70) {
                final SubLObject var71 = var70;
                if (NIL == conses_high.member(var71, var66, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                    var66 = (SubLObject)ConsesLow.cons(var71, var66);
                }
            }
            var67 = var67.rest();
            var68 = var67.first();
        }
        module0813.f52156(var66);
        return Sequences.length(var66);
    }
    
    public static SubLObject f51773(final SubLObject var37, SubLObject var70) {
        if (var70 == UNPROVIDED) {
            var70 = (SubLObject)NIL;
        }
        final SubLThread var71 = SubLProcess.currentSubLThread();
        if (NIL == module0077.f5302(var70)) {
            var70 = module0077.f5313((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        SubLObject var72 = (SubLObject)NIL;
        try {
            final SubLObject var73 = stream_macros.$stream_requires_locking$.currentBinding(var71);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var71);
                var72 = compatibility.open_text(var37, (SubLObject)$ic62$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var73, var71);
            }
            if (!var72.isStream()) {
                Errors.error((SubLObject)$ic57$, var37);
            }
            SubLObject var74;
            SubLObject var75;
            SubLObject var76;
            for (var74 = var72, var75 = (SubLObject)NIL, var75 = reader.read(var74, (SubLObject)NIL, (SubLObject)$ic79$, (SubLObject)UNPROVIDED); $ic79$ != var75; var75 = reader.read(var74, (SubLObject)NIL, (SubLObject)$ic79$, (SubLObject)UNPROVIDED)) {
                var76 = module0035.remove_if_not((SubLObject)$ic80$, module0035.f2399(var75, (SubLObject)$ic74$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0078.f5374(var76, var70);
            }
        }
        finally {
            final SubLObject var77 = Threads.$is_thread_performing_cleanupP$.currentBinding(var71);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var71);
                if (var72.isStream()) {
                    streams_high.close(var72, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var77, var71);
            }
        }
        return var70;
    }
    
    public static SubLObject f51774(final SubLObject var74, SubLObject var70) {
        if (var70 == UNPROVIDED) {
            var70 = (SubLObject)NIL;
        }
        SubLObject var75 = var74;
        SubLObject var76 = (SubLObject)NIL;
        var76 = var75.first();
        while (NIL != var75) {
            var70 = f51773(var76, var70);
            var75 = var75.rest();
            var76 = var75.first();
        }
        return var70;
    }
    
    public static SubLObject f51775(final SubLObject var15, final SubLObject var75) {
        SubLObject var76 = (SubLObject)NIL;
        final SubLObject var77 = module0077.f5333(var75);
        SubLObject var78;
        SubLObject var79;
        SubLObject var80;
        for (var78 = module0032.f1741(var77), var79 = (SubLObject)NIL, var79 = module0032.f1742(var78, var77); NIL == module0032.f1744(var78, var79); var79 = module0032.f1743(var79)) {
            var80 = module0032.f1745(var78, var79);
            if (NIL != module0032.f1746(var79, var80) && NIL != f51753(var15, var80) && NIL == f51736(var15, var80)) {
                var76 = (SubLObject)ConsesLow.cons(var80, var76);
            }
        }
        return Sort.sort(var76, (SubLObject)$ic81$, (SubLObject)$ic82$);
    }
    
    public static SubLObject f51776(final SubLObject var15, final SubLObject var75, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)T;
        }
        f51777(var3);
        SubLObject var76 = f51775(var15, var75);
        SubLObject var77 = (SubLObject)NIL;
        var77 = var76.first();
        while (NIL != var76) {
            final SubLObject var78 = f51738(var15, var77);
            if (var77.isMacroOperator()) {
                f51778(var77, var78, var3);
            }
            else if (NIL != module0004.f85(var77)) {
                final SubLObject var79 = f51779(var77);
                f51780(var77, var78, var79, var3);
            }
            else {
                Errors.error((SubLObject)$ic83$, var77);
            }
            var76 = var76.rest();
            var77 = var76.first();
        }
        return var15;
    }
    
    public static SubLObject f51779(final SubLObject var51) {
        final SubLObject var52 = module0004.f86(var51);
        SubLObject var53 = (SubLObject)NIL;
        SubLObject var54 = var52;
        SubLObject var55 = (SubLObject)NIL;
        var55 = var54.first();
        while (NIL != var54) {
            if (var55.isCons()) {
                var55 = var55.first();
            }
            var53 = (SubLObject)ConsesLow.cons(var55, var53);
            var54 = var54.rest();
            var55 = var54.first();
        }
        return Sequences.nreverse(var53);
    }
    
    public static SubLObject f51777(final SubLObject var3) {
        PrintLow.format(var3, (SubLObject)$ic84$);
        PrintLow.format(var3, (SubLObject)$ic85$);
        return var3;
    }
    
    public static SubLObject f51780(final SubLObject var51, final SubLObject var80, final SubLObject var81, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)T;
        }
        PrintLow.format(var3, (SubLObject)$ic86$, var51);
        SubLObject var82 = var81;
        final SubLObject var83 = Sequences.position((SubLObject)$ic87$, var81, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var84 = (SubLObject)NIL;
        if (var83.isInteger()) {
            var82 = Sequences.subseq(var81, (SubLObject)ZERO_INTEGER, var83);
            var84 = Sequences.subseq(var81, Numbers.add(var83, (SubLObject)ONE_INTEGER), (SubLObject)UNPROVIDED);
        }
        f51781(var82, var84, var3);
        streams_high.terpri(var3);
        module0038.f2648(var3, (SubLObject)TWO_INTEGER);
        if (NIL == var84) {
            f51782(var80, var82, var3);
        }
        else {
            f51783(var80, var82, var84, var3);
        }
        PrintLow.format(var3, (SubLObject)$ic88$);
        return var80;
    }
    
    public static SubLObject f51778(final SubLObject var51, final SubLObject var80, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)T;
        }
        PrintLow.format(var3, (SubLObject)$ic89$, var51);
        streams_high.terpri(var3);
        module0038.f2648(var3, (SubLObject)TWO_INTEGER);
        streams_high.write_string((SubLObject)$ic90$, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        streams_high.write_string(var80, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        streams_high.write_string((SubLObject)$ic91$, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        streams_high.terpri(var3);
        streams_high.terpri(var3);
        return var80;
    }
    
    public static SubLObject f51781(final SubLObject var85, final SubLObject var87, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)T;
        }
        SubLObject var88 = (SubLObject)NIL;
        streams_high.write_string((SubLObject)$ic92$, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var89 = var85;
        SubLObject var90 = (SubLObject)NIL;
        var90 = var89.first();
        while (NIL != var89) {
            if (NIL != var88) {
                streams_high.write_string((SubLObject)$ic93$, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            streams_high.write_string(Symbols.symbol_name(var90), var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var88 = (SubLObject)T;
            var89 = var89.rest();
            var90 = var89.first();
        }
        if (NIL != module0035.sublisp_boolean(var87)) {
            if (NIL != var88) {
                streams_high.write_string((SubLObject)$ic93$, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            streams_high.write_string((SubLObject)$ic94$, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var89 = var87;
            SubLObject var91 = (SubLObject)NIL;
            var91 = var89.first();
            while (NIL != var89) {
                streams_high.write_string((SubLObject)$ic95$, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                streams_high.write_string(Symbols.symbol_name(var91), var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                streams_high.write_string((SubLObject)$ic96$, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                var89 = var89.rest();
                var91 = var89.first();
            }
        }
        streams_high.write_string((SubLObject)$ic97$, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return var85;
    }
    
    public static SubLObject f51782(final SubLObject var80, final SubLObject var91, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)T;
        }
        PrintLow.format(var3, (SubLObject)$ic98$, var80);
        SubLObject var92 = var91;
        SubLObject var93 = (SubLObject)NIL;
        var93 = var92.first();
        while (NIL != var92) {
            streams_high.write_string((SubLObject)$ic93$, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            streams_high.write_string(Symbols.symbol_name(var93), var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var92 = var92.rest();
            var93 = var92.first();
        }
        streams_high.write_string((SubLObject)$ic99$, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return var80;
    }
    
    public static SubLObject f51783(final SubLObject var80, final SubLObject var85, final SubLObject var87, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)T;
        }
        streams_high.write_string((SubLObject)$ic100$, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var88 = conses_high.copy_list(var85);
        SubLObject var89 = var87;
        SubLObject var90 = (SubLObject)NIL;
        var90 = var89.first();
        while (NIL != var89) {
            streams_high.terpri(var3);
            module0038.f2648(var3, (SubLObject)FOUR_INTEGER);
            streams_high.write_string((SubLObject)$ic101$, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            streams_high.write_string(Symbols.symbol_name(var90), var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            streams_high.write_string((SubLObject)$ic102$, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            f51782(var80, var88, var3);
            streams_high.write_string((SubLObject)$ic97$, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var88 = ConsesLow.append(var88, (SubLObject)ConsesLow.list(var90));
            var89 = var89.rest();
            var90 = var89.first();
        }
        streams_high.terpri(var3);
        module0038.f2648(var3, (SubLObject)FOUR_INTEGER);
        streams_high.write_string((SubLObject)$ic103$, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        f51782(var80, var88, var3);
        streams_high.write_string((SubLObject)$ic97$, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        streams_high.write_string((SubLObject)$ic97$, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return var80;
    }
    
    public static SubLObject f51784() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51702", "S#56418", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51703", "S#56419", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51704", "S#56415", 1, 0, false);
        new $f51704$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51705", "S#56420", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51706", "S#56421", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51707", "S#56422", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51708", "S#56423", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51709", "S#56424", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51710", "S#56425", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51711", "S#56426", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51712", "S#56427", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51713", "S#56428", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51714", "S#56429", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51715", "S#56430", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51716", "S#56431", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51717", "S#56432", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51718", "S#56433", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51719", "S#56434", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51720", "S#56435", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51721", "S#56436", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51722", "S#56437", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51723", "S#56438", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51724", "S#56439", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51725", "S#56440", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51726", "S#56441", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51727", "S#56442", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51728", "S#56443", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51729", "S#56444", 11, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51731", "S#56445", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51732", "S#56446", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51733", "S#56447", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51734", "S#56448", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51735", "S#56449", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51736", "S#56450", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51737", "S#56451", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51738", "S#56452", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51739", "S#56453", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51741", "S#56454", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51742", "S#56455", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51743", "S#56456", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51744", "S#56457", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51745", "S#56458", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51746", "S#56459", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51747", "S#56460", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51748", "S#56461", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51749", "S#56462", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51750", "S#56463", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51751", "S#56464", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51752", "S#56465", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51753", "S#56466", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51754", "S#56467", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51755", "S#56468", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51756", "S#56469", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51757", "S#56470", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51740", "S#56471", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51730", "S#56472", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51759", "S#56473", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51760", "S#56474", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51761", "S#56475", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51762", "S#56476", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51763", "S#56477", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51758", "S#56478", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51764", "S#56479", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51771", "S#56480", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51765", "S#56481", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51766", "S#56482", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51767", "S#56483", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51768", "S#56484", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51769", "S#56485", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51770", "S#56486", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51772", "S#56487", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51773", "S#56488", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51774", "S#56489", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51775", "S#56490", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51776", "S#56491", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51779", "S#56492", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51777", "S#56493", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51780", "S#56494", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51778", "S#56495", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51781", "S#56496", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51782", "S#56497", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0810", "f51783", "S#56498", 3, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51785() {
        $g6435$ = SubLFiles.deflexical("S#56499", (SubLObject)$ic0$);
        $g6436$ = SubLFiles.defconstant("S#56500", (SubLObject)$ic1$);
        $g6437$ = SubLFiles.deflexical("S#56501", (SubLObject)$ic58$);
        $g6438$ = SubLFiles.deflexical("S#56502", (SubLObject)$ic77$);
        $g6439$ = SubLFiles.deflexical("S#56503", $ic78$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51786() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g6436$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic8$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic9$);
        Structures.def_csetf((SubLObject)$ic10$, (SubLObject)$ic11$);
        Structures.def_csetf((SubLObject)$ic12$, (SubLObject)$ic13$);
        Structures.def_csetf((SubLObject)$ic14$, (SubLObject)$ic15$);
        Structures.def_csetf((SubLObject)$ic16$, (SubLObject)$ic17$);
        Structures.def_csetf((SubLObject)$ic18$, (SubLObject)$ic19$);
        Structures.def_csetf((SubLObject)$ic20$, (SubLObject)$ic21$);
        Structures.def_csetf((SubLObject)$ic22$, (SubLObject)$ic23$);
        Structures.def_csetf((SubLObject)$ic24$, (SubLObject)$ic25$);
        Structures.def_csetf((SubLObject)$ic26$, (SubLObject)$ic27$);
        Structures.def_csetf((SubLObject)$ic28$, (SubLObject)$ic29$);
        Equality.identity((SubLObject)$ic1$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g6436$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic45$));
        return (SubLObject)NIL;
    }
    
    private static SubLObject _constant_78_initializer() {
        return (SubLObject)ConsesLow.list(new SubLObject[] { makeSymbol("*CACHE-INFERENCE-RESULTS*"), makeSymbol("*HL-FAILURE-BACKCHAINING*"), makeSymbol("*ENABLE-REWRITE-OF-PROPAGATION?*"), makeSymbol("*FORWARD-PROPAGATE-FROM-NEGATIONS*"), makeSymbol("KB-STATISTICS"), makeSymbol("SERVER-SUMMARY"), makeSymbol("HALT-CYC-IMAGE"), makeSymbol("ALL"), makeSymbol("NONE"), makeSymbol("*INIT-FILE-LOADED?*"), makeSymbol("*THESAURUS-FILENAME*"), makeSymbol("*THESAURUS-FILENAME-EXTENSION*"), makeSymbol("*THESAURUS-SUBDIRECTORIES*"), makeSymbol("INITIALIZE-AGENDA"), makeSymbol("INITIALIZE-TRANSCRIPT-HANDLING"), makeSymbol("LOAD-SYSTEM-PARAMETERS"), makeSymbol("LOAD-THESAURUS-INIT-FILE"), makeSymbol("PROBE-FILE"), makeSymbol("SYSTEM-CODE-INITIALIZATIONS"), makeSymbol("SYSTEM-KB-INITIALIZATIONS"), makeSymbol("LOAD-API"), makeSymbol("CORE-KB-FINALIZATION"), makeSymbol("CORE-KB-FINISH-BOOTSTRAPPING"), makeSymbol("CORE-KB-FINISH-DEFINITIONS"), makeSymbol("CORE-KB-INITIALIZATION"), makeSymbol("CORE-KB-START-BOOTSTRAPPING"), makeSymbol("CORE-KB-START-DEFINITIONS"), makeSymbol("CYC-FUNCTION-TO-ARG"), makeSymbol("FI-ASSERT-INT"), makeSymbol("HL-EXTERNAL-ID-STRING-P"), makeSymbol("HL-FIND-OR-CREATE-NART"), makeSymbol("LOW-ASSERT-LITERAL"), makeSymbol("RELEVANT-MT?"), makeSymbol("DUMP-STANDARD-KB"), makeSymbol("DUMP-KB"), makeSymbol("LOAD-KB"), makeSymbol("*STANDARD-INPUT*"), makeSymbol("READ-IGNORING-ERRORS"), makeSymbol("*INFERENCE-TRACE-PORT*"), makeSymbol("API-PORT"), makeSymbol("API-SERVER-TOP-LEVEL"), makeSymbol("CFASL-PORT"), makeSymbol("CFASL-SERVER-TOP-LEVEL"), makeSymbol("CYC-HTML-FEATURE"), makeSymbol("CYC-THESAURUS-FEATURE"), makeSymbol("ENABLE-TCP-SERVER"), makeSymbol("FINISH-OUTPUT"), makeSymbol("HTML-PORT"), makeSymbol("HTTP-PORT"), makeSymbol("HTML-SERVER-TOP-LEVEL"), makeSymbol("HTTP-SERVER-TOP-LEVEL"), makeSymbol("ROBUST-ENABLE-TCP-SERVER"), makeSymbol("START-AGENDA"), makeSymbol("THESAURUS-MANAGER-ACCESS-PROTOCOL-SERVER-TOP-LEVEL"), makeSymbol("TMAP-PORT"), makeSymbol("HOSTNAME"), makeSymbol("*EVAL-IN-API?*"), makeSymbol("*SILENT-PROGRESS?*"), makeSymbol("CYC-HOME-FILENAME"), makeSymbol("HALT-AGENDA"), makeSymbol("LOAD-INFERENCE-TESTS"), makeSymbol("SET-COMMUNICATION-MODE"), makeSymbol("LOAD-INFERENCE-TESTS"), makeSymbol("DEF-INFERENCE-TEST"), makeSymbol("DEFINE-INFERENCE-TEST"), makeSymbol("DEFINE-SUBTEST"), makeSymbol("CYC-HOME-FILENAME"), makeSymbol("LOAD-ALL-CYC-TESTS"), makeSymbol("RUN-ALL-CYC-TESTS"), makeSymbol("RUN-CYC-TESTS"), makeSymbol("RUN-ALL-INFERENCE-UNIT-TESTS"), makeSymbol("RUN-ALL-REMOVAL-MODULE-TESTS"), makeSymbol("RUN-ALL-EVALUATABLE-RELATION-TESTS"), makeSymbol("*SECONDS-IN-A-NON-LEAP-YEAR*"), makeSymbol("CLOSED-QUERY-SUCCESS-TOKEN"), makeSymbol("DEFINE-EVALUATABLE-PREDICATE-TEST"), makeSymbol("DEFINE-SIMPLE-EVALUATABLE-FUNCTION-TEST-BLOCK"), makeSymbol("DEFINE-SIMPLE-EVALUATABLE-PREDICATE-TEST-BLOCK"), makeSymbol("EQUALS-EL?"), makeSymbol("HTML-ESCAPED-TO-UNICODE-VECTOR"), makeSymbol("LENGTH="), makeSymbol("LENGTH>="), makeSymbol("LENGTHS="), makeSymbol("NEW-INFERENCE-ERROR-SUSPEND-STATUS"), makeSymbol("NOT-EQ"), makeSymbol("TREE-MATCHES-PATTERN"), makeSymbol("UNICODE-VECTOR-TO-DISPLAY"), makeSymbol("DECLARE-CYC-TEST-FILE"), makeSymbol("DEFINE-EVALUATABLE-FUNCTION-TEST"), makeSymbol("DEFINE-INFERENCE-UNIT-TEST"), makeSymbol("DEFINE-TRANSFORMATION-MODULE-TEST"), makeSymbol("LOAD-ALL-KB-CONTENT-POST-BUILD-TESTS"), makeSymbol("PWHEN-FEATURE"), makeSymbol("*TRANSFORMATION-DEPTH-COMPUTATION*"), makeSymbol("GENL-CARDINALITY"), makeSymbol("PROBLEM-MIN-TRANSFORMATION-DEPTH"), makeSymbol("PROBLEM-MIN-TRANSFORMATION-DEPTH"), makeSymbol("PROBLEM-PROOF-COUNT"), makeSymbol("PROBLEM-SOLE-CLAUSE"), makeSymbol("PROBLEM-STORE-UNMANIFESTED-NON-FOCAL-COUNT"), makeSymbol("QUERY-ABORT"), makeSymbol("RESIDUAL-TRANSFORMATION-LINK-RESIDUAL-PROBLEM"), makeSymbol("RESIDUAL-TRANSFORMATION-LINK-RESIDUAL-PROBLEM"), makeSymbol("SPEC-CARDINALITY"), makeSymbol("STRATEGICALLY-PENDING-PROBLEM-P"), makeSymbol("STRATEGICALLY-POSSIBLE-PROBLEM-P"), makeSymbol("STRATEGICALLY-POSSIBLE-PROBLEM-P"), makeSymbol("TACTICALLY-PENDING-PROBLEM-P"), makeSymbol("TACTICALLY-PENDING-PROBLEM-P"), makeSymbol("TACTICALLY-POSSIBLE-PROBLEM-P"), makeSymbol("TRANSFORMATION-RULE-SUCCESS-COUNT"), makeSymbol("CONSTANT-SUID"), makeSymbol("*ACCUMULATING-AT-VIOLATIONS?*"), makeSymbol("*ACCUMULATING-WFF-VIOLATIONS?*"), makeSymbol("*ADDITIONAL-FORT-TYPING-COLLECTIONS*"), makeSymbol("*ADMIT-NART-MTS-IN-MT-GAFS-IN-MT-MT?*"), makeSymbol("*ANECT-MT*"), makeSymbol("*ASSUME-SBHL-EXTENSIONS-NONEMPTY*"), makeSymbol("*AT-ADMIT-CONSISTENT-NAUTS?*"), makeSymbol("*AT-APPLY-NECESSARY-DEFNS?*"), makeSymbol("*AT-CHECK-ARG-GENLS?*"), makeSymbol("*AT-CHECK-ARG-ISA?*"), makeSymbol("*AT-CHECK-GENL-INVERSES?*"), makeSymbol("*AT-CHECK-GENL-PREDS?*"), makeSymbol("*AT-CHECK-INTER-ARG-GENL?*"), makeSymbol("*AT-CHECK-INTER-ARG-ISA?*"), makeSymbol("*AT-CHECK-NON-CONSTANT-INTER-ARG-ISA?*"), makeSymbol("*AT-CHECK-NOT-GENLS-DISJOINT?*"), makeSymbol("*AT-CHECK-NOT-ISA-DISJOINT?*"), makeSymbol("*AT-CHECK-NOT-MDW?*"), makeSymbol("*AT-CHECK-NOT-SDC?*"), makeSymbol("*AT-POSSIBLY-CHECK-DEFINING-MTS?*"), makeSymbol("*AT-SOME-ARG-ISA-REQUIRED?*"), makeSymbol("*AT-TRACE-LEVEL*"), makeSymbol("*BREAK-ON-FAILURE*"), makeSymbol("*CACHE-INFERENCE-RESULTS*"), makeSymbol("*CACHED-GENL-PREDICATES*"), makeSymbol("*CACHED-GENL-PREDICATES-SET*"), makeSymbol("*CACHED-GENLS*"), makeSymbol("*CACHED-GENLS-SET*"), makeSymbol("*CACHED-ISAS*"), makeSymbol("*CACHED-ISAS-SET*"), makeSymbol("*CANONICALIZE-ALL-SENTENCE-ARGS?*"), makeSymbol("*CATCH-ERROR-MESSAGE-TARGET*"), makeSymbol("*CHECK-WFF-COHERENCE?*"), makeSymbol("*CHEMISTRY-LEXICAL-MT*"), makeSymbol("*CIRCULAR-COMPLEXITY-COUNT-LIMIT*"), makeSymbol("*CONTINUE-CERROR?*"), makeSymbol("*CONTROL-1*"), makeSymbol("*CONTROL-2*"), makeSymbol("*CONTROL-3*"), makeSymbol("*CONTROL-4*"), makeSymbol("*CONTROL-5*"), makeSymbol("*CONTROL-6*"), makeSymbol("*CONTROL?*"), makeSymbol("*CORE-MT-FLOOR*"), makeSymbol("*CURRENT-TEST*"), makeSymbol("*DEBUG-CONTINUE*"), makeSymbol("*DEFINITIONAL-FORT-TYPING-COLLECTIONS*"), makeSymbol("*DEFN-TRACE-LEVEL*"), makeSymbol("*DETERMINERS-BEFORE-VARIABLES*"), makeSymbol("*EL-SUPPORTS-CONTRACTIONS?*"), makeSymbol("*EL-SUPPORTS-DOT-SYNTAX?*"), makeSymbol("*ENCAPSULATE-INTENSIONAL-FORMULA?*"), makeSymbol("*ENFORCE-ONLY-DEFINITIONAL-GAFS-IN-VOCAB-MT?*"), makeSymbol("*EVALUATABLE-BACKCHAIN-ENABLED*"), makeSymbol("*EXPRESS-AS-ASYMMETRIC?*"), makeSymbol("*EXPRESS-AS-DISJOINT-WITH?*"), makeSymbol("*EXPRESS-AS-GENLS?*"), makeSymbol("*EXPRESS-AS-IRREFLEXIVE?*"), makeSymbol("*EXPRESS-AS-NEGATION-INVERSE?*"), makeSymbol("*EXPRESS-AS-NEGATION-PREDICATES?*"), makeSymbol("*EXPRESS-AS-REFLEXIVE?*"), makeSymbol("*EXPRESS-AS-RELATION-TYPE?*"), makeSymbol("*EXPRESS-AS-RULE-MACRO?*"), makeSymbol("*EXPRESS-AS-SYMMETRIC?*"), makeSymbol("*EXPRESS-AS-TRANSITIVE?*"), makeSymbol("*FI-ERROR*"), makeSymbol("*FI-WARNING*"), makeSymbol("*FORWARD-PROPAGATE-FROM-NEGATIONS*"), makeSymbol("*GT-MAX-NODES-DIRECTION*"), makeSymbol("*HL-FAILURE-BACKCHAINING*"), makeSymbol("*IMPLICIT-FORT-TYPING-COLLECTIONS*"), makeSymbol("*IMPLICITIFY-UNIVERSALS?*"), makeSymbol("*INCLUDE-AT-CONSTRAINT-GAF?*"), makeSymbol("*INDEX-CONVERT-COMPLEX-THRESHOLD*"), makeSymbol("*INDEX-CONVERT-SIMPLE-THRESHOLD*"), makeSymbol("*INDEX-OVERLAP-ENABLED?*"), makeSymbol("*INHIBIT-CYCLIC-COMMUTATIVE-IN-ARGS?*"), makeSymbol("*IT-BACKCHAIN*"), makeSymbol("*IT-DEPTH*"), makeSymbol("*IT-NUMBER*"), makeSymbol("*IT-TIME*"), makeSymbol("*IT-VERBOSE*"), makeSymbol("*KNOWN-ANTECEDENT-RULE-ENABLED?*"), makeSymbol("*LEXICON-LOOKUP-MT*"), makeSymbol("*LOOKUP-OVERLAP-WATERMARK*"), makeSymbol("*MT*"), makeSymbol("*MT-MT*"), makeSymbol("*MUST-ENFORCE-SEMANTICS?*"), makeSymbol("*NL-TRIE-ROTATION-INDEX*"), makeSymbol("*NOTING-AT-VIOLATIONS?*"), makeSymbol("*PARAPHRASE-MODE*"), makeSymbol("*PPH-COERCE-DEFINITE-DESCRIPTIONS-FOR-UNLEXIFIED-TERMS?*"), makeSymbol("*PPH-DOMAIN-MT*"), makeSymbol("*PPH-EXPAND-E-NOTATION-FOR-FLOATS?*"), makeSymbol("*PPH-LANGUAGE-MT*"), makeSymbol("*PPH-LINK-ARG0?*"), makeSymbol("*PPH-QUANTIFY-VARS?*"), makeSymbol("*PPH-USE-BULLETED-LISTS?*"), makeSymbol("*PPH-USE-SMART-VARIABLE-REPLACEMENT?*"), makeSymbol("*PPH-USE-WHOM?*"), makeSymbol("*READ-REQUIRE-CONSTANT-EXISTS*"), makeSymbol("*RESIDUAL-TRANSFORMATION-LINKS-ENABLED?*"), makeSymbol("*REWRITE-MODULES*"), makeSymbol("*SBHL-TEMPORALITY-ACTIVE?*"), makeSymbol("*SDC-COMMON-SPEC-EXCEPTION?*"), makeSymbol("*SDC-EXCEPTION-TRANSFERS-THRU-SPECS?*"), makeSymbol("*SIMPLIFY-SENTENCE?*"), makeSymbol("*SIMPLIFY-SEQUENCE-VARS-USING-KB-ARITY?*"), makeSymbol("*SKOLEM-AXIOM-TABLE*"), makeSymbol("*STANDARDIZE-VARIABLES-MEMORY*"), makeSymbol("*TERM-FUNCTIONAL-COMPLEXITY-CUTOFF*"), makeSymbol("*TEST-DIRECTION*"), makeSymbol("*TEST-STATUS*"), makeSymbol("*THE-CYCLIST*"), makeSymbol("*KE-PURPOSE*"), makeSymbol("*CB-CONSTANT-HISTORY*"), makeSymbol("*CB-NAT-HISTORY*"), makeSymbol("*CB-SENTENCE-HISTORY*"), makeSymbol("*CB-ASSERTION-HISTORY*"), makeSymbol("*PPH-REPLACE-BULLETED-LIST-TAGS?*"), makeSymbol("*PARAPHRASE-PRECISION*"), makeSymbol("*PPH-TERSE-MT-SCOPE?*"), makeSymbol("*PPH-MAXIMIZE-LINKS?*"), makeSymbol("*PPH-USE-TITLE-CAPITALIZATION?*"), makeSymbol("*PPH-USE-INDEXICAL-DATES?*"), makeSymbol("*PPH-ADDRESSEE*"), makeSymbol("*PPH-SPEAKER*"), makeSymbol("*TVA-PRECOMPUTE-CLOSURE-THRESHOLD*"), makeSymbol("*UNBOUND-RULE-BACKCHAIN-ENABLED*"), makeSymbol("*USE-TRANSCRIPT?*"), makeSymbol("*VALIDATE-EXPANSIONS?*"), makeSymbol("*WFF-VIOLATION-DATA-TERSE?*"), makeSymbol("*WITHIN-ASK*"), makeSymbol("1+"), makeSymbol("ABORT-CURRENT-CONTROLLING-INFERENCE"), makeSymbol("ALL-CONSTANTS"), makeSymbol("ALL-CONTIGUOUS-AFTER"), makeSymbol("ALL-CONTIGUOUS-AFTER-INVERSE"), makeSymbol("ALL-COTEMPORAL"), makeSymbol("ALL-DENOTS-OF-STRING"), makeSymbol("ALL-ENDS-AFTER-ENDING-OF"), makeSymbol("ALL-ENDS-AFTER-ENDING-OF-INVERSE"), makeSymbol("ALL-ENDS-AFTER-STARTING-OF"), makeSymbol("ALL-ENDS-AFTER-STARTING-OF-INVERSE"), makeSymbol("ALL-ENDS-DURING"), makeSymbol("ALL-ENDS-DURING-INVERSE"), makeSymbol("ALL-LEXICON-STRING-PREDICATES"), makeSymbol("ALL-NEGATION-INVERSES"), makeSymbol("ALL-NEGATION-PREDICATES"), makeSymbol("ALL-NEGATION-PREDS"), makeSymbol("ALL-OVERLAPS-START"), makeSymbol("ALL-OVERLAPS-START-INVERSE"), makeSymbol("ALL-SPEC-PREDS"), makeSymbol("ALL-STARTS-AFTER-ENDING-OF"), makeSymbol("ALL-STARTS-AFTER-ENDING-OF-INVERSE"), makeSymbol("ALL-STARTS-AFTER-STARTING-OF"), makeSymbol("ALL-STARTS-AFTER-STARTING-OF-INVERSE"), makeSymbol("ALL-STARTS-DURING"), makeSymbol("ALL-STARTS-DURING-INVERSE"), makeSymbol("ALL-TEMPORAL-BOUNDS-CONTAIN"), makeSymbol("ALL-TEMPORAL-BOUNDS-CONTAIN-INVERSE"), makeSymbol("ALL-TEMPORAL-BOUNDS-IDENTICAL"), makeSymbol("ALL-TEMPORAL-BOUNDS-INTERSECT"), makeSymbol("ALL-TEMPORALLY-COORIGINATING"), makeSymbol("ALL-TEMPORALLY-COTERMINAL"), makeSymbol("ALL-TEMPORALLY-FINISHED-BY"), makeSymbol("ALL-TEMPORALLY-FINISHED-BY-INVERSE"), makeSymbol("ALL-TEMPORALLY-STARTED-BY"), makeSymbol("ALL-TEMPORALLY-STARTED-BY-INVERSE"), makeSymbol("ALL-TEMPORALLY-SUBSUMES"), makeSymbol("ALL-TEMPORALLY-SUBSUMES-INVERSE"), makeSymbol("ANY-SDC-WRT?"), makeSymbol("ASENT-SENSE-AND-MT-TO-PROBLEM-QUERY"), makeSymbol("ASSERT-QUERY-TEST"), makeSymbol("ASSERT-RETURN-UNCANON"), makeSymbol("ASSERTED-SECOND"), makeSymbol("ASSERTED-WHY"), makeSymbol("ASSERTION-ARGUMENTS"), makeSymbol("ASSERTION-CONS"), makeSymbol("ASSERTION-FI-FORMULA"), makeSymbol("ASSERTION-FIND-IF"), makeSymbol("ASSERTION-GATHER"), makeSymbol("ASSERTION-HL-FORMULA"), makeSymbol("ATOMIC-SENTENCE-ARG1"), makeSymbol("ATOMIC-SENTENCE-ARG2"), makeSymbol("ATOMIC-SENTENCE-ARG3"), makeSymbol("ATOMIC-SENTENCE-ARG4"), makeSymbol("ATOMIC-SENTENCE-ARGS"), makeSymbol("ATOMIC-SENTENCE-PREDICATE"), makeSymbol("B-TEST-FORM"), makeSymbol("BELIEF-P"), makeSymbol("BINDING-VERIFY"), makeSymbol("BULL"), makeSymbol("CANON-ASSERT-EQUAL?"), makeSymbol("CANON-ASSERT-ISOMORPHIC?"), makeSymbol("CANON-EQUAL-HL-NAMES?"), makeSymbol("CANON-EQUAL?"), makeSymbol("CANON-FORMS-EQUAL?"), makeSymbol("CANON-QUERY-EQUAL?"), makeSymbol("CANONICALIZE-AND-RETURN-SKOLEM-VARS"), makeSymbol("CANONICALIZE-ASK"), makeSymbol("CANONICALIZE-CYCL"), makeSymbol("CANONICALIZE-CYCL-SENTENCE"), makeSymbol("CANONICALIZE-DEFAULT-EL-VARS"), makeSymbol("CANONICALIZE-PROBLEM-QUERY"), makeSymbol("CANONICALIZE-QUERY"), makeSymbol("CANONICALIZE-QUERY-SENTENCE"), makeSymbol("CANONICALIZE-WF-CYCL"), makeSymbol("CATCH-ERROR-MESSAGE"), makeSymbol("CB-GUESS-FORT"), makeSymbol("CDOHASH"), makeSymbol("CHECK-DENOT"), makeSymbol("CLEAR-SBHL-CACHES"), makeSymbol("CLOSED-QUERY-SUCCESS-TOKEN"), makeSymbol("CMULTIPLE-VALUE-SETQ"), makeSymbol("COLLECTION-P"), makeSymbol("COMPLEX-INDEX-P"), makeSymbol("COMPLEX-INDEXED-TERM-P"), makeSymbol("CONTIGUOUS-AFTER?"), makeSymbol("CONTINUE-INFERENCE"), makeSymbol("COPY-FORMULA"), makeSymbol("COTEMPORAL?"), makeSymbol("CPUSHNEW"), makeSymbol("CSOME"), makeSymbol("CURRENT-CONTROLLING-INFERENCE"), makeSymbol("CURRENT-MT-RELEVANCE-MT"), makeSymbol("CURRENT-REWRITE-MT"), makeSymbol("CURRENTLY-ACTIVE-PROBLEM"), makeSymbol("CURRENTLY-ACTIVE-PROBLEM-STORE"), makeSymbol("CVS-ID"), makeSymbol("CYC-EVALUATE"), makeSymbol("CYC-FIND-OR-CREATE-NART"), makeSymbol("CYCL-PROBLEM-DECODE"), makeSymbol("CYCL-PROBLEM-STORE-DECODE"), makeSymbol("CYCL-SENTENCE-P"), makeSymbol("CYCL-SUBL-SYMBOL-SYMBOL"), makeSymbol("CYCL-TERM-P"), makeSymbol("DATE-KB-LOADED-P"), makeSymbol("DECLARE-CYC-TEST-FILE"), makeSymbol("DEDUCTION-SUPPORTS"), makeSymbol("DEFAULT-EL-VAR?"), makeSymbol("DEFAULT-REFORMULATOR-MODE-PRECEDENCE"), makeSymbol("DEFGLOBAL-PRIVATE"), makeSymbol("DEFINE-EVALUATABLE-FUNCTION-TEST"), makeSymbol("DEFINE-EVALUATABLE-PREDICATE-TEST"), makeSymbol("DEFINE-INFERENCE-UNIT-TEST"), makeSymbol("DEFINE-REMOVAL-MODULE-COST-TEST"), makeSymbol("DEFINE-REMOVAL-MODULE-TEST"), makeSymbol("DEFINE-SIMPLE-EVALUATABLE-FUNCTION-TEST-BLOCK"), makeSymbol("DEFINE-SIMPLE-EVALUATABLE-PREDICATE-TEST-BLOCK"), makeSymbol("DEFINE-SUBTEST"), makeSymbol("DEFINE-TRANSFORMATION-MODULE-TEST"), makeSymbol("DEFLEXICAL-PRIVATE"), makeSymbol("DEFNS"), makeSymbol("DEFPARAMETER"), makeSymbol("DEFPARAMETER-PRIVATE"), makeSymbol("DELETE-FILE"), makeSymbol("DENOT-WS-LOOKUP"), makeSymbol("DENOTS-OF-ABBREVIATION-STRING"), makeSymbol("DENOTS-OF-COMPLEX-WORD-STRING"), makeSymbol("DENOTS-OF-NAME-STRING"), makeSymbol("DENOTS-OF-PARTIAL-STRING"), makeSymbol("DENOTS-OF-STRING&POS"), makeSymbol("DENOTS-OF-STRING&PRED"), makeSymbol("DEPENDENT-NARTS"), makeSymbol("DEREGISTER-SKSI-HL-STORAGE-MODULES-FOR-SKS"), makeSymbol("DEREGISTER-SKSI-REMOVAL-MODULES-FOR-SKS"), makeSymbol("DESTROY-ALL-PROBLEM-STORES"), makeSymbol("DESTROY-INFERENCE"), makeSymbol("DESTROY-PROBLEM-STORE"), makeSymbol("DESTROYING-NEW-PPH-PHRASES-WHEN-DONE"), makeSymbol("DETERMINE-DENOTATION-PREDS"), makeSymbol("DISJOIN"), makeSymbol("DNF-AND-MT-TO-HL-QUERY"), makeSymbol("DO-INDEXED-TERMS"), makeSymbol("DO-INTERMEDIATE-INDEX"), makeSymbol("DO-PREDICATE-EXTENT-INDEX"), makeSymbol("DO-PROBLEM-STORE-LINKS"), makeSymbol("DO-PROBLEM-STORE-PROBLEMS"), makeSymbol("DO-PROBLEM-TACTICS"), makeSymbol("DOUBLETON?"), makeSymbol("DUPLICATE-NART-TUPLES"), makeSymbol("EL-BINARY-FORMULA-P"), makeSymbol("EL-CONTRACTION"), makeSymbol("EL-EXPAND-ALL"), makeSymbol("EL-FIND-NART"), makeSymbol("EL-UNARY-FORMULA-P"), makeSymbol("EL-VERSION"), makeSymbol("EL-WFE?"), makeSymbol("EL-WFF-ASSERTIBLE?"), makeSymbol("EL-WFT?"), makeSymbol("EL-ZERO-ARITY-FORMULA-P"), makeSymbol("ENDS-AFTER-ENDING-OF?"), makeSymbol("ENDS-AFTER-STARTING-OF?"), makeSymbol("ENDS-DURING?"), makeSymbol("ENDS-WITH"), makeSymbol("EQUAL-WRT-SVM"), makeSymbol("ASSERTION-FI-FORMULA"), makeSymbol("EQUALS-EL?"), makeSymbol("EXPRESSION-FIND"), makeSymbol("EXPRESSION-FIND-IF"), makeSymbol("EXPRESSION-GATHER"), makeSymbol("EXPRESSION-NSUBLIS"), makeSymbol("EXPRESSION-NSUBST"), makeSymbol("EXPRESSION-NTRANSFORM"), makeSymbol("EXPRESSION-SUBLIS"), makeSymbol("EXPRESSION-SUBST"), makeSymbol("EXPRESSION-TRANSFORM"), makeSymbol("EXTRACT-EL-CLAUSES"), makeSymbol("FAILING-IT-FORM-IDENTIFIER"), makeSymbol("FAST-DELETE-DUPLICATES"), makeSymbol("FAST-SKOLEM-NART?"), makeSymbol("FI-CREATE-INT"), makeSymbol("FI-KILL-INT"), makeSymbol("FI-REASSERT-INT"), makeSymbol("FI-RENAME-INT"), makeSymbol("FI-RENAME-VARIABLES-INT"), makeSymbol("FI-UNASSERT-INT"), makeSymbol("ASSERTION-FI-FORMULA"), makeSymbol("FIMPLIES"), makeSymbol("FIND-ALL-MATCHES-FOR-REGULAR-EXPRESSION"), makeSymbol("FIND-ASSERTION-CYCL"), makeSymbol("FIND-ASSERTIONS-CYCL"), makeSymbol("FIND-ASSERTIONS-VIA-TL"), makeSymbol("FIND-CONSTANT-BY-GUID"), makeSymbol("FIND-CONSTANT-BY-NAME"), makeSymbol("FIND-IF-NOT"), makeSymbol("FIND-INFERENCE-ANSWER-BY-ID"), makeSymbol("FIND-INFERENCE-BY-IDS"), makeSymbol("FIND-OR-CREATE-ASSERTION"), makeSymbol("FIND-PREVIOUS-INFERENCE-PROBLEM-BY-EL-ASENT"), makeSymbol("FIND-PROBLEM-BY-EL-QUERY"), makeSymbol("FIND-PROBLEM-BY-ID"), makeSymbol("FIND-PROBLEM-BY-QUERY"), makeSymbol("FIND-PROOF-BY-ID"), makeSymbol("FIND-REFORMULATOR-RULE-FOR-RULE-ASSERTION"), makeSymbol("FIND-STRATEGY-BY-ID"), makeSymbol("FIND-VISIBLE-ASSERTION-CYCL"), makeSymbol("FIND-VISIBLE-ASSERTIONS-CYCL"), makeSymbol("FIRST-CHAR"), makeSymbol("FIRST-OF"), makeSymbol("FMAKUNBOUND"), makeSymbol("FORM-VERIFY"), makeSymbol("FORMULA-ARGS"), makeSymbol("FORMULA-ARGS-OK-WRT-TYPE?"), makeSymbol("FORMULA-ARITY>"), makeSymbol("FORMULA-VARIABLES-ARG-CONSTRAINTS"), makeSymbol("FWHEN"), makeSymbol("GAF-ARG"), makeSymbol("GAF-CNF-LITERAL"), makeSymbol("GAF-FORMULA"), makeSymbol("GAF-OK-WRT-ANTI-TRANSITIVE-PRED?"), makeSymbol("GATHER-PREDICATE-RULE-INDEX-IN-ALL-MTS"), makeSymbol("GENERATE-DISAMBIGUATION-PHRASES"), makeSymbol("GENERATE-GENFORMAT-ARG"), makeSymbol("GENERATE-QUESTION"), makeSymbol("GENERATE-REGULAR-STRING"), makeSymbol("GENERATE-SPEECH-ACT"), makeSymbol("GENERATE-TEXT"), makeSymbol("GENLS?"), makeSymbol("GET-CYCLS-FOR-STRING-ESCALATING"), makeSymbol("GET-NL-TRIE"), makeSymbol("GET-STRINGS-OF-TYPE"), makeSymbol("GET-VARIABLE"), makeSymbol("GT-INFERIOR?"), makeSymbol("GT-SUPERIOR-IN-WHAT-MTS"), makeSymbol("GT-SUPERIOR?"), makeSymbol("GTM"), makeSymbol("HL-MODULE-NAME"), makeSymbol("HL-TO-EL"), makeSymbol("HL-VAR-FOR-DEFAULT-EL-VAR"), makeSymbol("HL-WFF?"), makeSymbol("HLMT-EQUAL"), makeSymbol("HTML-GENERATE-PHRASE"), makeSymbol("HTML-GENERATE-TEXT"), makeSymbol("INFERENCE-ABORT"), makeSymbol("INFERENCE-ANSWER-BINDINGS-EQUAL?"), makeSymbol("INFERENCE-ANSWER-JUSTIFICATION-PROOFS"), makeSymbol("INFERENCE-ANSWER-JUSTIFICATIONS"), makeSymbol("INFERENCE-ANSWER-P"), makeSymbol("INFERENCE-ANSWERS-TO-BINDINGS"), makeSymbol("INFERENCE-CANONICALIZE-ASK-INT"), makeSymbol("INFERENCE-COMPLETELY-ASSERTED-ASENT-GAFS"), makeSymbol("INFERENCE-COMPLETELY-DECIDABLE-ASENT-GAFS"), makeSymbol("INFERENCE-COMPLETELY-ENUMERABLE-ASENT-GAFS"), makeSymbol("INFERENCE-ERROR-SUSPEND-STATUS-P"), makeSymbol("INFERENCE-HL-MTS"), makeSymbol("INFERENCE-INTERRUPT"), makeSymbol("INFERENCE-P"), makeSymbol("INFERENCE-PROBLEM-STORE"), makeSymbol("INFERENCE-REWRITE-MODULE"), makeSymbol("INFERENCE-ROOT-PROBLEM"), makeSymbol("INFERENCE-SOME-SPEC-PRED-OR-INVERSE?"), makeSymbol("INFERENCE-SUID"), makeSymbol("INITIALIZE-ALL-SBHL-CACHING"), makeSymbol("INITIALIZE-INFERENCE-TEST-CARDINALITIES"), makeSymbol("INITIALIZE-NL-TRIE-ROTATION-INDEX"), makeSymbol("INTERMEDIATE-INDEX-KEYS"), makeSymbol("INTERMEDIATE-INDEX-LOOKUP"), makeSymbol("INTERMEDIATE-INDEX-P"), makeSymbol("INTERSECT?"), makeSymbol("INTERVAL-TOKEN-VALUE"), makeSymbol("IS-REGULAR-EXPRESSIONS-SUPPORT-AVAILABLE?"), makeSymbol("KE-UNASSERT-ASSERTION-NOW"), makeSymbol("KEYWORD-FOR-POS"), makeSymbol("LEGACY-B-VERIFY"), makeSymbol("LEGACY-BINDING-VERIFY"), makeSymbol("LEGACY-VERIFY-NOT"), makeSymbol("LENGTH="), makeSymbol("LENGTH>="), makeSymbol("LOAD-PARTITION"), makeSymbol("M-VERIFY"), makeSymbol("MAKE-BINARY-FORMULA"), makeSymbol("MAKE-CONJUNCTION"), makeSymbol("MAKE-DISJUNCTION"), makeSymbol("MAKE-EL-FORMULA"), makeSymbol("MAKE-EL-VAR"), makeSymbol("MAKE-EXISTENTIAL"), makeSymbol("MAKE-EXISTENTIAL-EXACT"), makeSymbol("MAKE-EXISTENTIAL-MAX"), makeSymbol("MAKE-EXISTENTIAL-MIN"), makeSymbol("MAKE-FORMULA"), makeSymbol("MAKE-GAF-CNF"), makeSymbol("MAKE-PROCESS-WITH-ARGS"), makeSymbol("MAKE-SET-FROM-LIST"), makeSymbol("MAKE-SYMBOL"), makeSymbol("MAKE-TERNARY-FORMULA"), makeSymbol("MAKE-UNARY-FORMULA"), makeSymbol("MAKE-UNUSED-TEMP-FILENAME"), makeSymbol("MAL-VARIABLES"), makeSymbol("MAPEXP"), makeSymbol("MAPPED-PROBLEM-PROBLEM"), makeSymbol("MAPPED-PROBLEM-VARIABLE-MAP"), makeSymbol("MAX-FLOOR-MTS-OF-GENL-PRED-PATHS"), makeSymbol("MAX-FLOOR-MTS-OF-NAT"), makeSymbol("MAX-FLOOR-MTS-OF-NEGATION-INVERSE-PATHS"), makeSymbol("MAX-FLOOR-MTS-OF-NEGATION-PRED-PATHS"), makeSymbol("MAX-NEGATION-INVERSES"), makeSymbol("MAXIMIZING-PPH-LINKS"), makeSymbol("MDW?"), makeSymbol("MIN-GENL-MTS"), makeSymbol("MIN-MTS-OF-GENL-INVERSE-PATHS"), makeSymbol("MIN-MTS-OF-GENL-PRED-PATHS"), makeSymbol("MIN-MTS-OF-GENLS-PATHS"), makeSymbol("MIN-MTS-OF-ISA-PATHS"), makeSymbol("MIN-MTS-OF-NEGATION-INVERSE-PATHS"), makeSymbol("MIN-MTS-OF-NEGATION-PRED-PATHS"), makeSymbol("NAT-ARG1"), makeSymbol("NAT-ARG2"), makeSymbol("NAT-FUNCTION"), makeSymbol("NAT-FUNCTOR"), makeSymbol("NAUT-TO-NART"), makeSymbol("NEGATION-INVERSE?"), makeSymbol("NEGATION-PRED?"), makeSymbol("NEGATION-PREDS"), makeSymbol("NEW-CONTINUABLE-INFERENCE"), makeSymbol("NEW-INFERENCE-ERROR-SUSPEND-STATUS"), makeSymbol("NEW-PROBLEM-STORE"), makeSymbol("NEW-SET"), makeSymbol("NEXT-AVAILABLE-WS"), makeSymbol("NL-TRIE-ENTRY-DENOTS"), makeSymbol("NL-TRIE-INDEX-ITEM-TERM"), makeSymbol("NL-TRIE-MATCHING-PHRASES"), makeSymbol("NL-TRIE-ROTATION-INDEX-INITIALIZED?"), makeSymbol("NL-TRIE-SEARCH"), makeSymbol("NL-TRIE-SEMTRANS-TEMPLATES-OF-STRING"), makeSymbol("NL-TRIE-SENTENCE-TOKENIZE"), makeSymbol("NON-EMPTY-STRING?"), makeSymbol("NON-HL-PREDICATE-P"), makeSymbol("NOT-ENDS-AFTER-ENDING-OF?"), makeSymbol("NOT-ENDS-AFTER-STARTING-OF?"), makeSymbol("NOT-EQ"), makeSymbol("NOT-GENLS?"), makeSymbol("NOT-MDW?"), makeSymbol("NOT-STARTS-AFTER-ENDING-OF?"), makeSymbol("NOT-STARTS-AFTER-STARTING-OF?"), makeSymbol("NTH-VALUE"), makeSymbol("NUM-INDEX-SLOW"), makeSymbol("NUMBER"), makeSymbol("OBJECT-TO-STRING"), makeSymbol("ORDERED-LEXIFICATION-PREDS-FOR-KEYWORD"), makeSymbol("ORDERED-LEXIFICATION-PREDS-OF-STRING"), makeSymbol("ORDERED-STRINGS-OF-WORD-UNIT"), makeSymbol("ORDERED-WORD-VARIANTS"), makeSymbol("OVERLAPS-START?"), makeSymbol("PAD-TABLE-INITIALIZED?"), makeSymbol("PARAMETERIZED-TEST-VALUE"), makeSymbol("PARSE-LEXICAL-SEMANTIC-FORMULA"), makeSymbol("PIF-FEATURE"), makeSymbol("PLACEHOLDER-DENOTS-OF-SENSE"), makeSymbol("POS-FOR-KEYWORD"), makeSymbol("POS-LIT-VARIABLE-GENL-CONSTRAINTS"), makeSymbol("POS-LIT-VARIABLE-INTER-ARG-GENL-CONSTRAINTS"), makeSymbol("POS-LIT-VARIABLE-INTER-ARG-ISA-CONSTRAINTS"), makeSymbol("POS-LIT-VARIABLE-ISA-CONSTRAINTS"), makeSymbol("POS-OF-STRING"), makeSymbol("POS-OF-STRING&WORD"), makeSymbol("POSITIVE-INTEGER-P"), makeSymbol("POWERSET"), makeSymbol("PPH-IDENTIFY-TYPE"), makeSymbol("PPH-PHRASE-OUTPUT-LIST-STRING"), makeSymbol("PPH-SYMBOL-STRING"), makeSymbol("PRECISE-KEYWORD-FOR-POS"), makeSymbol("PREDS-FOR-KEYWORD"), makeSymbol("PREDS-OF-STRING"), makeSymbol("PREDS-OF-STRING&WORD"), makeSymbol("PRINT-DICTIONARY-CONTENTS"), makeSymbol("PRINT-FAILING-FORM"), makeSymbol("PRINT-JUSTIFY"), makeSymbol("PRINT-TMS-FORMULA"), makeSymbol("PRINT-TMS-MT"), makeSymbol("PRINT-UNASSERT"), makeSymbol("PRINTED-FORMS-EQUAL?"), makeSymbol("PROBLEM-ARGUMENT-LINK-COUNT"), makeSymbol("PROBLEM-DEPENDENT-LINK-COUNT"), makeSymbol("PROBLEM-DISCARDED-TACTIC-COUNT"), makeSymbol("PROBLEM-EXECUTED-TACTIC-COUNT"), makeSymbol("PROBLEM-EXECUTED-TACTICS"), makeSymbol("PROBLEM-HAS-TACTIC-OF-TYPE-WITH-STATUS?"), makeSymbol("PROBLEM-LINK-SUPPORTED-PROBLEM"), makeSymbol("PROBLEM-QUERY-SOLE-CLAUSE"), makeSymbol("PROBLEM-RELEVANT-TO-INFERENCE?"), makeSymbol("PROBLEM-STORE"), makeSymbol("PROBLEM-STORE-FIRST-LINK-OF-TYPE"), makeSymbol("PROBLEM-STORE-REJECTED-PROOF-COUNT"), makeSymbol("PROBLEM-STORE-RESIDUAL-TRANSFORMATION-LINK-COUNT"), makeSymbol("PROBLEM-STORE-RESTRICTION-LINK-COUNT"), makeSymbol("PROBLEM-STORE-REWRITE-LINK-COUNT"), makeSymbol("PROBLEM-STORE-STRATEGY-COUNT"), makeSymbol("PROBLEM-STORE-SUID"), makeSymbol("PROBLEM-STORE-TACTIC-OF-TYPE-WITH-STATUS-COUNT"), makeSymbol("PROOF-REJECTED?"), makeSymbol("PUTF"), makeSymbol("PWHEN-FEATURE"), makeSymbol("QUERY-PROPERTIES-FROM-LEGACY-ASK-PARAMETERS"), makeSymbol("READ-LINE"), makeSymbol("REBUILD-MODULE-TESTS"), makeSymbol("RECLASSIFY-REMOVAL-MODULES"), makeSymbol("REDECLARE-INFERENCE-REMOVAL-MODULE"), makeSymbol("REFORMULATE-CYCL"), makeSymbol("REGISTER-SKSI-HL-STORAGE-MODULES-FOR-SKS"), makeSymbol("REGISTER-SKSI-REMOVAL-MODULES-FOR-SKS"), makeSymbol("REIFIABLE-FUNCTION-TERM?"), makeSymbol("REIFIABLE-FUNCTOR?"), makeSymbol("REIFIED-SKOLEM-FN?"), makeSymbol("RELATED-DENOTS-OF-SENSE"), makeSymbol("RELATION-VARIABLE-GENL-CONSTRAINTS"), makeSymbol("RELATION-VARIABLE-INTER-ARG-GENL-CONSTRAINTS"), makeSymbol("RELATION-VARIABLE-INTER-ARG-ISA-CONSTRAINTS"), makeSymbol("RELATION-VARIABLE-ISA-CONSTRAINTS"), makeSymbol("RELATIONAL-NOUN-POSSESSED-ARGNUMS"), makeSymbol("REMOVE-IF-NOT"), makeSymbol("RESIDUAL-TRANSFORMATION-LINK-SUPPORTING-MAPPED-PROBLEM"), makeSymbol("RESIDUAL-TRANSFORMATION-LINK-SUPPORTING-PROBLEM"), makeSymbol("RESTRICTION-REWRITE-ADD-LINK"), makeSymbol("RESULT-GENL"), makeSymbol("RESULT-INTER-ARG-GENL-RELN"), makeSymbol("RESULT-INTER-ARG-ISA-RELN"), makeSymbol("RETURN-UNCANON"), makeSymbol("REWRITE-ADD-LINK"), makeSymbol("REWRITE-LINK-TACTIC"), makeSymbol("STRENGTHEN-PREDICATE-W/TYPED-AND-ALL-SUGGESTIONS"), makeSymbol("STRENGTHEN-PREDICATE-W/TYPED-AND-MINIMAL-SUGGESTIONS"), makeSymbol("STRENGTHEN-PREDICATE-W/TYPED-LINKS-ONLY"), makeSymbol("STRENGTHENED-PREDS"), makeSymbol("TYPED-PRED-STRENGTHEN-FORMULA"), makeSymbol("RSUBLIS"), makeSymbol("RULES-MENTIONING"), makeSymbol("RUN-ALL-CYC-TESTS"), makeSymbol("RUN-EVALUATABLE-RELATION-TESTS"), makeSymbol("RUN-TEST-CASE-TABLES-OF-CLASS"), makeSymbol("RUN-TEST-SUITE"), makeSymbol("SAFE-FI"), makeSymbol("SAMPLE-DIFFERENT-LEAF-INSTANCES"), makeSymbol("SAMPLE-DIFFERENT-LEAF-SPECS"), makeSymbol("SAMPLE-LEAF-INSTANCES"), makeSymbol("SAVE-PARTITION"), makeSymbol("SBHL-CACHED-PREDICATE-RELATION-P"), makeSymbol("SBHL-CACHED-RELATIONS-FOR-NODE"), makeSymbol("SBHL-MARKED-NODES"), makeSymbol("SDC"), makeSymbol("SDC?"), makeSymbol("SEMANTICALLY-WF-LITERAL?"), makeSymbol("SENTENCE-ASSERTIONS"), makeSymbol("SENTENCE-ASSERTIONS-IN-MT"), makeSymbol("SENTENCE-FREE-SEQUENCE-VARIABLES"), makeSymbol("SENTENCE-FREE-VARIABLES"), makeSymbol("SENTENCE-VARIABLES"), makeSymbol("SET"), makeSymbol("SET-ADD"), makeSymbol("SET-ASSERTION-ASSERTED-BY"), makeSymbol("SET-ASSERTION-ASSERTED-SECOND"), makeSymbol("SETHASH"), makeSymbol("SETS-EQUAL-EQUAL?"), makeSymbol("SETS-EQUAL?"), makeSymbol("SIMPLE-INDEX-P"), makeSymbol("SIMPLEST-INFERENCE-STRATEGY"), makeSymbol("SIMPLIFY-TRANSITIVE-REDUNDANCIES"), makeSymbol("SINGLE-LITERAL-PROBLEM-ATOMIC-SENTENCE"), makeSymbol("SINGLETON?"), makeSymbol("SKOLEM-DEFN-ASSERTIONS"), makeSymbol("SKOLEM-FUNCTION-P"), makeSymbol("SKOLEM-FUNCTION?"), makeSymbol("SKOLEM-NART?"), makeSymbol("SKOLEM-RULE-HOSED?"), makeSymbol("SOME-GENL-PRED-OR-INVERSE?"), makeSymbol("SOME-NEGATION-PRED-OR-INVERSE?"), makeSymbol("SOME-SPEC-PRED-OR-INVERSE?"), makeSymbol("SPEC-POS-PRED?"), makeSymbol("STARTS-AFTER-ENDING-OF?"), makeSymbol("STARTS-AFTER-STARTING-OF?"), makeSymbol("STARTS-DURING?"), makeSymbol("STARTS-WITH"), makeSymbol("STRATEGICALLY-FINISHED-PROBLEM-P"), makeSymbol("STRATEGICALLY-NO-GOOD-PROBLEM-P"), makeSymbol("STRING-IS-POS-ON-WU?"), makeSymbol("STRING-TOKEN-VALUE"), makeSymbol("STRINGS-OF-WORD-UNIT"), makeSymbol("SUBINDEX-LEAF-COUNT"), makeSymbol("SUBINDEX-LEAVES"), makeSymbol("SUBINDEX-P"), makeSymbol("SUBL-ESCAPE-P"), makeSymbol("SUBL-STRING-P"), makeSymbol("SUBSTRING?"), makeSymbol("SUF-DEFN?"), makeSymbol("SUPERSETP"), makeSymbol("TACTIC-HL-MODULE"), makeSymbol("TACTIC-HL-MODULE-NAME"), makeSymbol("TACTICALLY-FINISHED-PROBLEM-P"), makeSymbol("TACTICALLY-NO-GOOD-PROBLEM-P"), makeSymbol("TACTICALLY-UNEXAMINED-PROBLEM-P"), makeSymbol("TEMPORAL-BOUNDS-CONTAIN?"), makeSymbol("TEMPORAL-BOUNDS-IDENTICAL?"), makeSymbol("TEMPORAL-BOUNDS-INTERSECT?"), makeSymbol("TEMPORALLY-COORIGINATING?"), makeSymbol("TEMPORALLY-COTERMINAL?"), makeSymbol("TEMPORALLY-FINISHED-BY?"), makeSymbol("TEMPORALLY-STARTED-BY?"), makeSymbol("TEMPORALLY-SUBSUMES?"), makeSymbol("TERM-INDEX"), makeSymbol("TERM-OF-UNIT"), makeSymbol("TERM-UNIFY"), makeSymbol("TEST-CANONICALIZE-ASSERT"), makeSymbol("TEST-CANONICALIZE-ASSERT-SENTENCE"), makeSymbol("TEST-ERROR"), makeSymbol("TEST-SUITE-DEFINED-P"), makeSymbol("TEST-VERIFY"), makeSymbol("TEST-VERIFY-NEW"), makeSymbol("THROW-UNEVALUATABLE"), makeSymbol("TIME"), makeSymbol("TRANSFORM"), makeSymbol("TREE-FIND"), makeSymbol("TREE-FIND-IF"), makeSymbol("TREE-GATHER"), makeSymbol("TREE-MATCHES-PATTERN"), makeSymbol("TYPED-DENOTS-OF-STRING-AT-PLACE"), makeSymbol("UNCANON-TEST"), makeSymbol("UNDECLARE-INFERENCE-REMOVAL-MODULE"), makeSymbol("UNKNOWN-ASSERTION?"), makeSymbol("UNWRAP-IF-IST-PERMISSIVE"), makeSymbol("USELESS-NART?"), makeSymbol("VALID-ASSERTION?"), makeSymbol("VALID-EL-VAR?"), makeSymbol("VALID-SBHL-LINKS-P"), makeSymbol("VAR-NAMES-IN-STRING"), makeSymbol("VARIABLE-LOOKUP"), makeSymbol("VERIFY-NOT"), makeSymbol("WHY-NOT-QUERY-OK"), makeSymbol("WHY-NOT-SEMANTICALLY-WF-WRT-TYPES"), makeSymbol("WHY-NOT-WFF"), makeSymbol("WHY-NOT-WFF-ASK"), makeSymbol("WHY-NOT-WFF-ASSERT"), makeSymbol("WHY-NOT-WFT"), makeSymbol("WITH-ALL-PREDICATES"), makeSymbol("WITH-INFERENCE-ERROR-HANDLING"), makeSymbol("WITH-INFERENCE-MT-RELEVANCE"), makeSymbol("WITH-NL-TRIE-CASE-SENSITIVITY-OFF"), makeSymbol("WITH-NL-TRIE-CASE-SENSITIVITY-ON"), makeSymbol("WITH-PARAPHRASE-MAPPINGS"), makeSymbol("WITH-PPH-DEMERIT-CUTOFF"), makeSymbol("WITH-PPH-MEMOIZATION"), makeSymbol("WITH-PRECISE-PARAPHRASE-OFF"), makeSymbol("WITH-ALL-SPEC-PREDICATES"), makeSymbol("WITH-TEST-ASSERTION-LISTS"), makeSymbol("WITH-TEST-ASSERTIONS"), makeSymbol("WITH-TEST-CONSTANTS"), makeSymbol("WITH-TEXT-FILE"), makeSymbol("WITH-THE-CYCLIST"), makeSymbol("WITH-TVA-PRECOMPUTE-CLOSURE-THRESHOLD"), makeSymbol("WITHOUT-SBHL-CACHES"), makeSymbol("WITHOUT-UNLEXIFIED-TERM-DISCOVERY-LOGGING"), makeSymbol("WORD-HAS-POS?"), makeSymbol("WORD-VARIANTS"), makeSymbol("WORDS-OF-STRING&POS"), makeSymbol("WORDS-OF-STRING&PRED"), makeSymbol("WORDS-OF-STRING&SPEECH-PART") });
    }
    
    public void declareFunctions() {
        f51784();
    }
    
    public void initializeVariables() {
        f51785();
    }
    
    public void runTopLevelForms() {
        f51786();
    }
    
    static {
        me = (SubLFile)new module0810();
        $g6435$ = null;
        $g6436$ = null;
        $g6437$ = null;
        $g6438$ = null;
        $g6439$ = null;
        $ic0$ = ConsesLow.list((SubLObject)makeKeyword("NONE"), (SubLObject)makeKeyword("LOW"), (SubLObject)makeKeyword("MEDIUM"), (SubLObject)makeKeyword("HIGH"));
        $ic1$ = makeSymbol("S#56414", "CYC");
        $ic2$ = makeSymbol("S#56415", "CYC");
        $ic3$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#56504", "CYC"), makeSymbol("S#56505", "CYC"), makeSymbol("S#56506", "CYC"), makeSymbol("S#56507", "CYC"), makeSymbol("S#56508", "CYC"), makeSymbol("S#56509", "CYC"), makeSymbol("S#56510", "CYC"), makeSymbol("S#56511", "CYC"), makeSymbol("S#56512", "CYC"), makeSymbol("S#56513", "CYC") });
        $ic4$ = ConsesLow.list(new SubLObject[] { makeKeyword("SECURITY-LEVEL"), makeKeyword("ID-MODULE-TABLE"), makeKeyword("MODULE-ID-TABLE"), makeKeyword("ID-METHOD-TABLE"), makeKeyword("METHOD-ID-TABLE"), makeKeyword("ID-GLOBAL-TABLE"), makeKeyword("GLOBAL-ID-TABLE"), makeKeyword("SYMBOL-EXCEPTIONS"), makeKeyword("ID-SYMBOL-TABLE"), makeKeyword("SYMBOL-ID-TABLE") });
        $ic5$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#56420", "CYC"), makeSymbol("S#56421", "CYC"), makeSymbol("S#56422", "CYC"), makeSymbol("S#56423", "CYC"), makeSymbol("S#56424", "CYC"), makeSymbol("S#56425", "CYC"), makeSymbol("S#56426", "CYC"), makeSymbol("S#56427", "CYC"), makeSymbol("S#56428", "CYC"), makeSymbol("S#56429", "CYC") });
        $ic6$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#56430", "CYC"), makeSymbol("S#56431", "CYC"), makeSymbol("S#56432", "CYC"), makeSymbol("S#56433", "CYC"), makeSymbol("S#56434", "CYC"), makeSymbol("S#56435", "CYC"), makeSymbol("S#56436", "CYC"), makeSymbol("S#56437", "CYC"), makeSymbol("S#56438", "CYC"), makeSymbol("S#56439", "CYC") });
        $ic7$ = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $ic8$ = makeSymbol("S#56419", "CYC");
        $ic9$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#56415", "CYC"));
        $ic10$ = makeSymbol("S#56420", "CYC");
        $ic11$ = makeSymbol("S#56430", "CYC");
        $ic12$ = makeSymbol("S#56421", "CYC");
        $ic13$ = makeSymbol("S#56431", "CYC");
        $ic14$ = makeSymbol("S#56422", "CYC");
        $ic15$ = makeSymbol("S#56432", "CYC");
        $ic16$ = makeSymbol("S#56423", "CYC");
        $ic17$ = makeSymbol("S#56433", "CYC");
        $ic18$ = makeSymbol("S#56424", "CYC");
        $ic19$ = makeSymbol("S#56434", "CYC");
        $ic20$ = makeSymbol("S#56425", "CYC");
        $ic21$ = makeSymbol("S#56435", "CYC");
        $ic22$ = makeSymbol("S#56426", "CYC");
        $ic23$ = makeSymbol("S#56436", "CYC");
        $ic24$ = makeSymbol("S#56427", "CYC");
        $ic25$ = makeSymbol("S#56437", "CYC");
        $ic26$ = makeSymbol("S#56428", "CYC");
        $ic27$ = makeSymbol("S#56438", "CYC");
        $ic28$ = makeSymbol("S#56429", "CYC");
        $ic29$ = makeSymbol("S#56439", "CYC");
        $ic30$ = makeKeyword("SECURITY-LEVEL");
        $ic31$ = makeKeyword("ID-MODULE-TABLE");
        $ic32$ = makeKeyword("MODULE-ID-TABLE");
        $ic33$ = makeKeyword("ID-METHOD-TABLE");
        $ic34$ = makeKeyword("METHOD-ID-TABLE");
        $ic35$ = makeKeyword("ID-GLOBAL-TABLE");
        $ic36$ = makeKeyword("GLOBAL-ID-TABLE");
        $ic37$ = makeKeyword("SYMBOL-EXCEPTIONS");
        $ic38$ = makeKeyword("ID-SYMBOL-TABLE");
        $ic39$ = makeKeyword("SYMBOL-ID-TABLE");
        $ic40$ = makeString("Invalid slot ~S for construction function");
        $ic41$ = makeKeyword("BEGIN");
        $ic42$ = makeSymbol("S#56440", "CYC");
        $ic43$ = makeKeyword("SLOT");
        $ic44$ = makeKeyword("END");
        $ic45$ = makeSymbol("S#56442", "CYC");
        $ic46$ = makeSymbol("S#56418", "CYC");
        $ic47$ = makeInteger(1500);
        $ic48$ = makeInteger(10000);
        $ic49$ = makeInteger(1000);
        $ic50$ = makeKeyword("FREE");
        $ic51$ = ConsesLow.list((SubLObject)makeKeyword("MEDIUM"), (SubLObject)makeKeyword("HIGH"));
        $ic52$ = makeString("S");
        $ic53$ = makeString("US");
        $ic54$ = makeKeyword("HIGH");
        $ic55$ = makeString("#");
        $ic56$ = makeKeyword("OUTPUT");
        $ic57$ = makeString("Unable to open ~S");
        $ic58$ = makeString("c3edef08-eef1-11dd-9624-00219b50e0e5");
        $ic59$ = makeKeyword("TYPE");
        $ic60$ = makeKeyword("VERSION");
        $ic61$ = makeKeyword("COPYRIGHT");
        $ic62$ = makeKeyword("INPUT");
        $ic63$ = makeString("Invalid format: ~A cannot be interpreted as a secure ID database.~%");
        $ic64$ = makeString("");
        $ic65$ = makeString("Invalid format: The type ID is missing or invalid.~%");
        $ic66$ = makeSymbol("FIXNUMP");
        $ic67$ = makeString("Invalid format: ~A is not a valid version specification.~%");
        $ic68$ = ConsesLow.list((SubLObject)ONE_INTEGER, (SubLObject)ZERO_INTEGER);
        $ic69$ = makeString("Invalid format: ~A is not a known version specification.~%");
        $ic70$ = makeString("Invalid format: ~A is not a valid security level.~%");
        $ic71$ = makeString("Invalid format: ~A is not a valid symbol exceptions set.~%");
        $ic72$ = makeString("Invalid format: ~A is not a valid table mapping to ids of type ~A.");
        $ic73$ = makeSymbol("STRINGP");
        $ic74$ = makeSymbol("SYMBOLP");
        $ic75$ = makeSymbol("API-MUTABLE-GLOBAL-P");
        $ic76$ = makeString("CYC");
        $ic77$ = ConsesLow.list(new SubLObject[] { makeSymbol("READER-WRITER-LOCK-P"), makeSymbol("RW-LOCK-P"), makeSymbol("NEW-RW-LOCK"), makeSymbol("RW-LOCK-NAME"), makeSymbol("RW-LOCK-SEIZE-READ-LOCK"), makeSymbol("RW-LOCK-SEIZE-WRITE-LOCK"), makeSymbol("RW-LOCK-RELEASE-READ-LOCK"), makeSymbol("RW-LOCK-RELEASE-WRITE-LOCK"), makeSymbol("SEMAPHORE-P"), makeSymbol("NEW-SEMAPHORE"), makeSymbol("SEMAPHORE-NAME"), makeSymbol("SEMAPHORE-SIGNAL"), makeSymbol("SEMAPHORE-CURRENT-COUNT"), makeSymbol("SEMAPHORE-WAIT"), makeSymbol("SEMAPHORE-DRAIN"), makeSymbol("SEMAPHORE-WAIT-WITH-TIMEOUT") });
        $ic78$ = _constant_78_initializer();
        $ic79$ = makeKeyword("EOF");
        $ic80$ = makeSymbol("FBOUNDP");
        $ic81$ = makeSymbol("STRING<");
        $ic82$ = makeSymbol("SYMBOL-NAME");
        $ic83$ = makeString("Stuck on ~A which is neither method nor macro.~%");
        $ic84$ = makeString("~%(in-package :cyc)~%");
        $ic85$ = makeString("~%(deflexical *unprovided-trampoline-arg* '|the unprovided trampoline argument|)~%");
        $ic86$ = makeString("~%(define ~A ");
        $ic87$ = makeSymbol("&OPTIONAL");
        $ic88$ = makeString(")~%~%");
        $ic89$ = makeString("~%(defmacro ~A (&rest rest)");
        $ic90$ = makeString("(ret `(");
        $ic91$ = makeString(" ,@rest)))");
        $ic92$ = makeString("(");
        $ic93$ = makeString(" ");
        $ic94$ = makeString("&optional");
        $ic95$ = makeString(" (");
        $ic96$ = makeString(" *unprovided-trampoline-arg*)");
        $ic97$ = makeString(")");
        $ic98$ = makeString("(ret (~A");
        $ic99$ = makeString("))");
        $ic100$ = makeString("(pcond");
        $ic101$ = makeString("((eq *unprovided-trampoline-arg* ");
        $ic102$ = makeString(") ");
        $ic103$ = makeString("(t ");
    }
    
    public static final class $sX56414_native extends SubLStructNative
    {
        public SubLObject $security_level;
        public SubLObject $id_module_table;
        public SubLObject $module_id_table;
        public SubLObject $id_method_table;
        public SubLObject $method_id_table;
        public SubLObject $id_global_table;
        public SubLObject $global_id_table;
        public SubLObject $symbol_exceptions;
        public SubLObject $id_symbol_table;
        public SubLObject $symbol_id_table;
        public static final SubLStructDeclNative structDecl;
        
        public $sX56414_native() {
            this.$security_level = (SubLObject)CommonSymbols.NIL;
            this.$id_module_table = (SubLObject)CommonSymbols.NIL;
            this.$module_id_table = (SubLObject)CommonSymbols.NIL;
            this.$id_method_table = (SubLObject)CommonSymbols.NIL;
            this.$method_id_table = (SubLObject)CommonSymbols.NIL;
            this.$id_global_table = (SubLObject)CommonSymbols.NIL;
            this.$global_id_table = (SubLObject)CommonSymbols.NIL;
            this.$symbol_exceptions = (SubLObject)CommonSymbols.NIL;
            this.$id_symbol_table = (SubLObject)CommonSymbols.NIL;
            this.$symbol_id_table = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX56414_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$security_level;
        }
        
        public SubLObject getField3() {
            return this.$id_module_table;
        }
        
        public SubLObject getField4() {
            return this.$module_id_table;
        }
        
        public SubLObject getField5() {
            return this.$id_method_table;
        }
        
        public SubLObject getField6() {
            return this.$method_id_table;
        }
        
        public SubLObject getField7() {
            return this.$id_global_table;
        }
        
        public SubLObject getField8() {
            return this.$global_id_table;
        }
        
        public SubLObject getField9() {
            return this.$symbol_exceptions;
        }
        
        public SubLObject getField10() {
            return this.$id_symbol_table;
        }
        
        public SubLObject getField11() {
            return this.$symbol_id_table;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$security_level = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$id_module_table = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$module_id_table = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$id_method_table = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$method_id_table = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$id_global_table = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$global_id_table = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$symbol_exceptions = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$id_symbol_table = value;
        }
        
        public SubLObject setField11(final SubLObject value) {
            return this.$symbol_id_table = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX56414_native.class, $ic1$, $ic2$, $ic3$, $ic4$, new String[] { "$security_level", "$id_module_table", "$module_id_table", "$id_method_table", "$method_id_table", "$id_global_table", "$global_id_table", "$symbol_exceptions", "$id_symbol_table", "$symbol_id_table" }, $ic5$, $ic6$, $ic7$);
        }
    }
    
    public static final class $f51704$UnaryFunction extends UnaryFunction
    {
        public $f51704$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#56415"));
        }
        
        public SubLObject processItem(final SubLObject var4) {
            return f51704(var4);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 533 ms
	
	Decompiled with Procyon 0.5.32.
*/