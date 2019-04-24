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
        return module0035.f2169(var1, module0810.$g6435$.getGlobalValue());
    }
    
    public static SubLObject f51703(final SubLObject var2, final SubLObject var3) {
        compatibility.default_struct_print_function(var2, var3, (SubLObject)module0810.ZERO_INTEGER);
        return (SubLObject)module0810.NIL;
    }
    
    public static SubLObject f51704(final SubLObject var2) {
        return (SubLObject)((var2.getClass() == $sX56414_native.class) ? module0810.T : module0810.NIL);
    }
    
    public static SubLObject f51705(final SubLObject var2) {
        assert module0810.NIL != f51704(var2) : var2;
        return var2.getField2();
    }
    
    public static SubLObject f51706(final SubLObject var2) {
        assert module0810.NIL != f51704(var2) : var2;
        return var2.getField3();
    }
    
    public static SubLObject f51707(final SubLObject var2) {
        assert module0810.NIL != f51704(var2) : var2;
        return var2.getField4();
    }
    
    public static SubLObject f51708(final SubLObject var2) {
        assert module0810.NIL != f51704(var2) : var2;
        return var2.getField5();
    }
    
    public static SubLObject f51709(final SubLObject var2) {
        assert module0810.NIL != f51704(var2) : var2;
        return var2.getField6();
    }
    
    public static SubLObject f51710(final SubLObject var2) {
        assert module0810.NIL != f51704(var2) : var2;
        return var2.getField7();
    }
    
    public static SubLObject f51711(final SubLObject var2) {
        assert module0810.NIL != f51704(var2) : var2;
        return var2.getField8();
    }
    
    public static SubLObject f51712(final SubLObject var2) {
        assert module0810.NIL != f51704(var2) : var2;
        return var2.getField9();
    }
    
    public static SubLObject f51713(final SubLObject var2) {
        assert module0810.NIL != f51704(var2) : var2;
        return var2.getField10();
    }
    
    public static SubLObject f51714(final SubLObject var2) {
        assert module0810.NIL != f51704(var2) : var2;
        return var2.getField11();
    }
    
    public static SubLObject f51715(final SubLObject var2, final SubLObject var5) {
        assert module0810.NIL != f51704(var2) : var2;
        return var2.setField2(var5);
    }
    
    public static SubLObject f51716(final SubLObject var2, final SubLObject var5) {
        assert module0810.NIL != f51704(var2) : var2;
        return var2.setField3(var5);
    }
    
    public static SubLObject f51717(final SubLObject var2, final SubLObject var5) {
        assert module0810.NIL != f51704(var2) : var2;
        return var2.setField4(var5);
    }
    
    public static SubLObject f51718(final SubLObject var2, final SubLObject var5) {
        assert module0810.NIL != f51704(var2) : var2;
        return var2.setField5(var5);
    }
    
    public static SubLObject f51719(final SubLObject var2, final SubLObject var5) {
        assert module0810.NIL != f51704(var2) : var2;
        return var2.setField6(var5);
    }
    
    public static SubLObject f51720(final SubLObject var2, final SubLObject var5) {
        assert module0810.NIL != f51704(var2) : var2;
        return var2.setField7(var5);
    }
    
    public static SubLObject f51721(final SubLObject var2, final SubLObject var5) {
        assert module0810.NIL != f51704(var2) : var2;
        return var2.setField8(var5);
    }
    
    public static SubLObject f51722(final SubLObject var2, final SubLObject var5) {
        assert module0810.NIL != f51704(var2) : var2;
        return var2.setField9(var5);
    }
    
    public static SubLObject f51723(final SubLObject var2, final SubLObject var5) {
        assert module0810.NIL != f51704(var2) : var2;
        return var2.setField10(var5);
    }
    
    public static SubLObject f51724(final SubLObject var2, final SubLObject var5) {
        assert module0810.NIL != f51704(var2) : var2;
        return var2.setField11(var5);
    }
    
    public static SubLObject f51725(SubLObject var6) {
        if (var6 == module0810.UNPROVIDED) {
            var6 = (SubLObject)module0810.NIL;
        }
        final SubLObject var7 = (SubLObject)new $sX56414_native();
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        SubLObject var11;
        for (var8 = (SubLObject)module0810.NIL, var8 = var6; module0810.NIL != var8; var8 = conses_high.cddr(var8)) {
            var9 = var8.first();
            var10 = conses_high.cadr(var8);
            var11 = var9;
            if (var11.eql((SubLObject)module0810.$ic30$)) {
                f51715(var7, var10);
            }
            else if (var11.eql((SubLObject)module0810.$ic31$)) {
                f51716(var7, var10);
            }
            else if (var11.eql((SubLObject)module0810.$ic32$)) {
                f51717(var7, var10);
            }
            else if (var11.eql((SubLObject)module0810.$ic33$)) {
                f51718(var7, var10);
            }
            else if (var11.eql((SubLObject)module0810.$ic34$)) {
                f51719(var7, var10);
            }
            else if (var11.eql((SubLObject)module0810.$ic35$)) {
                f51720(var7, var10);
            }
            else if (var11.eql((SubLObject)module0810.$ic36$)) {
                f51721(var7, var10);
            }
            else if (var11.eql((SubLObject)module0810.$ic37$)) {
                f51722(var7, var10);
            }
            else if (var11.eql((SubLObject)module0810.$ic38$)) {
                f51723(var7, var10);
            }
            else if (var11.eql((SubLObject)module0810.$ic39$)) {
                f51724(var7, var10);
            }
            else {
                Errors.error((SubLObject)module0810.$ic40$, var9);
            }
        }
        return var7;
    }
    
    public static SubLObject f51726(final SubLObject var12, final SubLObject var13) {
        Functions.funcall(var13, var12, (SubLObject)module0810.$ic41$, (SubLObject)module0810.$ic42$, (SubLObject)module0810.TEN_INTEGER);
        Functions.funcall(var13, var12, (SubLObject)module0810.$ic43$, (SubLObject)module0810.$ic30$, f51705(var12));
        Functions.funcall(var13, var12, (SubLObject)module0810.$ic43$, (SubLObject)module0810.$ic31$, f51706(var12));
        Functions.funcall(var13, var12, (SubLObject)module0810.$ic43$, (SubLObject)module0810.$ic32$, f51707(var12));
        Functions.funcall(var13, var12, (SubLObject)module0810.$ic43$, (SubLObject)module0810.$ic33$, f51708(var12));
        Functions.funcall(var13, var12, (SubLObject)module0810.$ic43$, (SubLObject)module0810.$ic34$, f51709(var12));
        Functions.funcall(var13, var12, (SubLObject)module0810.$ic43$, (SubLObject)module0810.$ic35$, f51710(var12));
        Functions.funcall(var13, var12, (SubLObject)module0810.$ic43$, (SubLObject)module0810.$ic36$, f51711(var12));
        Functions.funcall(var13, var12, (SubLObject)module0810.$ic43$, (SubLObject)module0810.$ic37$, f51712(var12));
        Functions.funcall(var13, var12, (SubLObject)module0810.$ic43$, (SubLObject)module0810.$ic38$, f51713(var12));
        Functions.funcall(var13, var12, (SubLObject)module0810.$ic43$, (SubLObject)module0810.$ic39$, f51714(var12));
        Functions.funcall(var13, var12, (SubLObject)module0810.$ic44$, (SubLObject)module0810.$ic42$, (SubLObject)module0810.TEN_INTEGER);
        return var12;
    }
    
    public static SubLObject f51727(final SubLObject var12, final SubLObject var13) {
        return f51726(var12, var13);
    }
    
    public static SubLObject f51728(final SubLObject var14) {
        assert module0810.NIL != f51702(var14) : var14;
        final SubLObject var15 = f51725((SubLObject)module0810.UNPROVIDED);
        SubLObject var16 = (SubLObject)module0810.NIL;
        SubLObject var17 = (SubLObject)module0810.NIL;
        SubLObject var18 = (SubLObject)module0810.NIL;
        SubLObject var19 = (SubLObject)module0810.NIL;
        SubLObject var20 = (SubLObject)module0810.NIL;
        SubLObject var21 = (SubLObject)module0810.NIL;
        SubLObject var22 = (SubLObject)module0810.NIL;
        SubLObject var23 = (SubLObject)module0810.NIL;
        SubLObject var24 = (SubLObject)module0810.NIL;
        final SubLObject var25 = (SubLObject)module0810.$ic47$;
        var16 = module0065.f4745(var25, (SubLObject)module0810.ZERO_INTEGER);
        var17 = Hashtables.make_hash_table(var25, Symbols.symbol_function((SubLObject)module0810.EQUAL), (SubLObject)module0810.UNPROVIDED);
        final SubLObject var26 = (SubLObject)module0810.$ic48$;
        var18 = module0065.f4745(var26, (SubLObject)module0810.ZERO_INTEGER);
        var19 = Hashtables.make_hash_table(var26, Symbols.symbol_function((SubLObject)module0810.EQ), (SubLObject)module0810.UNPROVIDED);
        final SubLObject var27 = (SubLObject)module0810.$ic48$;
        var20 = module0065.f4745(var27, (SubLObject)module0810.ZERO_INTEGER);
        var21 = Hashtables.make_hash_table(var27, Symbols.symbol_function((SubLObject)module0810.EQ), (SubLObject)module0810.UNPROVIDED);
        final SubLObject var28 = (SubLObject)module0810.$ic48$;
        var22 = module0065.f4745(var28, (SubLObject)module0810.ZERO_INTEGER);
        var23 = Hashtables.make_hash_table(var28, Symbols.symbol_function((SubLObject)module0810.EQ), (SubLObject)module0810.UNPROVIDED);
        final SubLObject var29 = (SubLObject)module0810.$ic49$;
        var24 = module0077.f5313(Symbols.symbol_function((SubLObject)module0810.EQ), var29);
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
        assert module0810.NIL != f51704(var15) : var15;
        f51715(var15, (SubLObject)module0810.$ic50$);
        module0065.f4762(f51706(var15));
        f51716(var15, (SubLObject)module0810.$ic50$);
        Hashtables.clrhash(f51707(var15));
        f51717(var15, (SubLObject)module0810.$ic50$);
        module0065.f4762(f51708(var15));
        f51718(var15, (SubLObject)module0810.$ic50$);
        Hashtables.clrhash(f51709(var15));
        f51719(var15, (SubLObject)module0810.$ic50$);
        module0065.f4762(f51710(var15));
        f51720(var15, (SubLObject)module0810.$ic50$);
        Hashtables.clrhash(f51711(var15));
        f51721(var15, (SubLObject)module0810.$ic50$);
        Hashtables.clrhash(f51712(var15));
        f51722(var15, (SubLObject)module0810.$ic50$);
        module0065.f4762(f51713(var15));
        f51723(var15, (SubLObject)module0810.$ic50$);
        Hashtables.clrhash(f51714(var15));
        f51724(var15, (SubLObject)module0810.$ic50$);
        return var15;
    }
    
    public static SubLObject f51732(final SubLObject var15) {
        assert module0810.NIL != f51704(var15) : var15;
        return f51705(var15);
    }
    
    public static SubLObject f51733(final SubLObject var15, final SubLObject var30) {
        assert module0810.NIL != f51704(var15) : var15;
        return module0065.f4750(f51706(var15), var30, (SubLObject)module0810.UNPROVIDED);
    }
    
    public static SubLObject f51734(final SubLObject var15, final SubLObject var30) {
        assert module0810.NIL != f51704(var15) : var15;
        return module0065.f4750(f51708(var15), var30, (SubLObject)module0810.UNPROVIDED);
    }
    
    public static SubLObject f51735(final SubLObject var15, final SubLObject var30) {
        assert module0810.NIL != f51704(var15) : var15;
        return module0065.f4750(f51710(var15), var30, (SubLObject)module0810.UNPROVIDED);
    }
    
    public static SubLObject f51736(final SubLObject var15, final SubLObject var31) {
        assert module0810.NIL != f51704(var15) : var15;
        return module0077.f5320(var31, f51712(var15));
    }
    
    public static SubLObject f51737(final SubLObject var15, final SubLObject var30) {
        assert module0810.NIL != f51704(var15) : var15;
        return module0065.f4750(f51713(var15), var30, (SubLObject)module0810.UNPROVIDED);
    }
    
    public static SubLObject f51738(final SubLObject var15, final SubLObject var31) {
        final SubLObject var32 = f51732(var15);
        final SubLObject var33 = Symbols.symbol_package(var31);
        SubLObject var35;
        SubLObject var34 = var35 = Symbols.symbol_name(var31);
        if (module0810.NIL == f51739(var31) && module0810.NIL != module0035.f2169(var32, (SubLObject)module0810.$ic51$) && module0810.NIL == f51736(var15, var31)) {
            final SubLObject var36 = (SubLObject)((module0810.NIL != var33) ? module0810.$ic52$ : module0810.$ic53$);
            if (var32 == module0810.$ic54$) {
                if (module0810.NIL != var33) {
                    var34 = f51740(var15, var31);
                }
                else {
                    var34 = module0038.f2797(module0022.f1215(Symbols.symbol_name(var31)));
                }
            }
            var35 = Sequences.cconcatenate(module0006.f203(var36), new SubLObject[] { module0810.$ic55$, module0006.f203(var34) });
        }
        return var35;
    }
    
    public static SubLObject f51739(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var1.isSymbol() && (var1.isKeyword() || module0810.NIL != f51741(var1) || module0810.NIL != module0201.f12546(var1)));
    }
    
    public static SubLObject f51741(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var1.isSymbol() && var1.eql(Packages.find_symbol(Symbols.symbol_name(var1), module0018.$g576$.getGlobalValue())));
    }
    
    public static SubLObject f51742(final SubLObject var15, final SubLObject var37) {
        final SubLThread var38 = SubLProcess.currentSubLThread();
        SubLObject var39 = (SubLObject)module0810.NIL;
        try {
            final SubLObject var40 = stream_macros.$stream_requires_locking$.currentBinding(var38);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0810.NIL, var38);
                var39 = compatibility.open_binary(var37, (SubLObject)module0810.$ic56$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var40, var38);
            }
            if (!var39.isStream()) {
                Errors.error((SubLObject)module0810.$ic57$, var37);
            }
            final SubLObject var41 = var39;
            f51743(var15, var41);
        }
        finally {
            final SubLObject var42 = Threads.$is_thread_performing_cleanupP$.currentBinding(var38);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0810.T, var38);
                if (var39.isStream()) {
                    streams_high.close(var39, (SubLObject)module0810.UNPROVIDED);
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
        SubLObject var16 = (SubLObject)module0810.NIL;
        var16 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0810.$ic59$, module0810.$g6437$.getGlobalValue()), var16);
        var16 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0810.$ic60$, (SubLObject)ConsesLow.list((SubLObject)module0810.ONE_INTEGER, (SubLObject)module0810.ZERO_INTEGER)), var16);
        var16 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0810.$ic61$, module0107.f7573()), var16);
        var16 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0810.$ic30$, f51705(var15)), var16);
        var16 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0810.$ic32$, f51707(var15)), var16);
        var16 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0810.$ic34$, f51709(var15)), var16);
        var16 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0810.$ic36$, f51711(var15)), var16);
        var16 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0810.$ic39$, f51714(var15)), var16);
        var16 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0810.$ic37$, f51712(var15)), var16);
        return var16;
    }
    
    public static SubLObject f51745(final SubLObject var43) {
        final SubLThread var44 = SubLProcess.currentSubLThread();
        SubLObject var45 = (SubLObject)module0810.NIL;
        SubLObject var46 = (SubLObject)module0810.NIL;
        try {
            final SubLObject var47 = stream_macros.$stream_requires_locking$.currentBinding(var44);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0810.NIL, var44);
                var46 = compatibility.open_binary(var43, (SubLObject)module0810.$ic62$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var47, var44);
            }
            if (!var46.isStream()) {
                Errors.error((SubLObject)module0810.$ic57$, var43);
            }
            final SubLObject var48 = var46;
            var45 = f51746(var48);
        }
        finally {
            final SubLObject var49 = Threads.$is_thread_performing_cleanupP$.currentBinding(var44);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0810.T, var44);
                if (var46.isStream()) {
                    streams_high.close(var46, (SubLObject)module0810.UNPROVIDED);
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
        if (module0810.NIL == Errors.$ignore_mustsP$.getDynamicValue(var4) && !var5.isCons()) {
            Errors.error((SubLObject)module0810.$ic63$, var5);
        }
        if (module0810.NIL == Errors.$ignore_mustsP$.getDynamicValue(var4) && module0810.NIL == Strings.stringE(module0810.$g6437$.getGlobalValue(), f51748(var5, (SubLObject)module0810.$ic59$, (SubLObject)module0810.$ic64$), (SubLObject)module0810.UNPROVIDED, (SubLObject)module0810.UNPROVIDED, (SubLObject)module0810.UNPROVIDED, (SubLObject)module0810.UNPROVIDED)) {
            Errors.error((SubLObject)module0810.$ic65$);
        }
        final SubLObject var6 = f51748(var5, (SubLObject)module0810.$ic60$, (SubLObject)module0810.UNPROVIDED);
        if (module0810.NIL == Errors.$ignore_mustsP$.getDynamicValue(var4) && (!var6.isCons() || module0810.NIL == module0035.f2192((SubLObject)module0810.$ic66$, var6))) {
            Errors.error((SubLObject)module0810.$ic67$, var6);
        }
        return f51749(var5, var6);
    }
    
    public static SubLObject f51747(final SubLObject var3) {
        return module0021.f1060(var3, (SubLObject)module0810.UNPROVIDED, (SubLObject)module0810.UNPROVIDED);
    }
    
    public static SubLObject f51748(final SubLObject var42, final SubLObject var46, SubLObject var47) {
        if (var47 == module0810.UNPROVIDED) {
            var47 = (SubLObject)module0810.NIL;
        }
        return module0035.f2293(var42, var46, Symbols.symbol_function((SubLObject)module0810.EQ), var47).first();
    }
    
    public static SubLObject f51749(final SubLObject var42, final SubLObject var45) {
        if (module0810.$ic68$.equal(var45)) {
            return f51750(var42);
        }
        Errors.error((SubLObject)module0810.$ic69$, var45);
        return (SubLObject)module0810.NIL;
    }
    
    public static SubLObject f51750(final SubLObject var42) {
        final SubLThread var43 = SubLProcess.currentSubLThread();
        SubLObject var44 = (SubLObject)module0810.NIL;
        SubLObject var45 = (SubLObject)module0810.NIL;
        SubLObject var46 = (SubLObject)module0810.NIL;
        SubLObject var47 = (SubLObject)module0810.NIL;
        SubLObject var48 = (SubLObject)module0810.NIL;
        SubLObject var49 = (SubLObject)module0810.NIL;
        SubLObject var50 = (SubLObject)module0810.NIL;
        SubLObject var51 = (SubLObject)module0810.NIL;
        SubLObject var52 = (SubLObject)module0810.NIL;
        SubLObject var53 = (SubLObject)module0810.NIL;
        var44 = f51748(var42, (SubLObject)module0810.$ic30$, (SubLObject)module0810.UNPROVIDED);
        if (module0810.NIL == Errors.$ignore_mustsP$.getDynamicValue(var43) && module0810.NIL == f51702(var44)) {
            Errors.error((SubLObject)module0810.$ic70$, var44);
        }
        var46 = f51751(var42, (SubLObject)module0810.$ic32$);
        var48 = f51751(var42, (SubLObject)module0810.$ic34$);
        var50 = f51751(var42, (SubLObject)module0810.$ic36$);
        var52 = f51751(var42, (SubLObject)module0810.$ic39$);
        var45 = module0065.f4803(var46);
        var47 = module0065.f4803(var48);
        var49 = module0065.f4803(var50);
        var51 = module0065.f4803(var52);
        var53 = f51748(var42, (SubLObject)module0810.$ic37$, (SubLObject)module0810.UNPROVIDED);
        if (module0810.NIL == Errors.$ignore_mustsP$.getDynamicValue(var43) && module0810.NIL == module0077.f5302(var53)) {
            Errors.error((SubLObject)module0810.$ic71$, var53);
        }
        return f51729(f51725((SubLObject)module0810.UNPROVIDED), var44, var45, var46, var47, var48, var49, var50, var51, var52, var53);
    }
    
    public static SubLObject f51751(final SubLObject var42, final SubLObject var48) {
        final SubLThread var49 = SubLProcess.currentSubLThread();
        final SubLObject var50 = f51748(var42, var48, (SubLObject)module0810.UNPROVIDED);
        if (module0810.NIL == Errors.$ignore_mustsP$.getDynamicValue(var49) && module0810.NIL == module0079.f5404(var50)) {
            Errors.error((SubLObject)module0810.$ic72$, var50, var48);
        }
        return var50;
    }
    
    public static SubLObject f51752(final SubLObject var15, final SubLObject var50) {
        assert module0810.NIL != f51704(var15) : var15;
        assert module0810.NIL != Types.stringp(var50) : var50;
        return module0035.sublisp_boolean(Hashtables.gethash_without_values(var50, f51707(var15), (SubLObject)module0810.UNPROVIDED));
    }
    
    public static SubLObject f51753(final SubLObject var15, final SubLObject var51) {
        assert module0810.NIL != f51704(var15) : var15;
        assert module0810.NIL != Types.symbolp(var51) : var51;
        return module0035.sublisp_boolean(Hashtables.gethash_without_values(var51, f51709(var15), (SubLObject)module0810.UNPROVIDED));
    }
    
    public static SubLObject f51754(final SubLObject var15, final SubLObject var52) {
        assert module0810.NIL != f51704(var15) : var15;
        assert module0810.NIL != Types.symbolp(var52) : var52;
        return module0035.sublisp_boolean(Hashtables.gethash_without_values(var52, f51711(var15), (SubLObject)module0810.UNPROVIDED));
    }
    
    public static SubLObject f51755(final SubLObject var15, final SubLObject var50) {
        assert module0810.NIL != f51704(var15) : var15;
        assert module0810.NIL != Types.stringp(var50) : var50;
        SubLObject var51 = Hashtables.gethash_without_values(var50, f51707(var15), (SubLObject)module0810.UNPROVIDED);
        if (module0810.NIL == var51) {
            var51 = module0065.f4746(f51706(var15));
            module0065.f4753(f51706(var15), var51, var50);
            Hashtables.sethash(var50, f51707(var15), var51);
        }
        return var51;
    }
    
    public static SubLObject f51756(final SubLObject var15, final SubLObject var51) {
        assert module0810.NIL != f51704(var15) : var15;
        assert module0810.NIL != Types.symbolp(var51) : var51;
        SubLObject var52 = Hashtables.gethash_without_values(var51, f51709(var15), (SubLObject)module0810.UNPROVIDED);
        if (module0810.NIL == var52) {
            var52 = module0065.f4746(f51708(var15));
            module0065.f4753(f51708(var15), var52, var51);
            Hashtables.sethash(var51, f51709(var15), var52);
        }
        return var52;
    }
    
    public static SubLObject f51757(final SubLObject var15, final SubLObject var52) {
        assert module0810.NIL != f51704(var15) : var15;
        assert module0810.NIL != Types.symbolp(var52) : var52;
        SubLObject var53 = Hashtables.gethash_without_values(var52, f51711(var15), (SubLObject)module0810.UNPROVIDED);
        if (module0810.NIL == var53) {
            var53 = module0065.f4746(f51710(var15));
            module0065.f4753(f51710(var15), var53, var52);
            Hashtables.sethash(var52, f51711(var15), var53);
        }
        return var53;
    }
    
    public static SubLObject f51740(final SubLObject var15, final SubLObject var31) {
        assert module0810.NIL != f51704(var15) : var15;
        assert module0810.NIL != Types.symbolp(var31) : var31;
        SubLObject var32 = Hashtables.gethash_without_values(var31, f51714(var15), (SubLObject)module0810.UNPROVIDED);
        if (module0810.NIL == var32) {
            var32 = module0065.f4746(f51713(var15));
            module0065.f4753(f51713(var15), var32, var31);
            Hashtables.sethash(var31, f51714(var15), var32);
        }
        return var32;
    }
    
    public static SubLObject f51730(final SubLObject var15) {
        assert module0810.NIL != f51704(var15) : var15;
        if (module0810.NIL != module0035.f2169(f51732(var15), (SubLObject)module0810.$ic51$)) {
            final SubLObject var16 = f51712(var15);
            f51758(var16);
            return (SubLObject)module0810.T;
        }
        return (SubLObject)module0810.NIL;
    }
    
    public static SubLObject f51759(final SubLObject var15, final SubLObject var31) {
        assert module0810.NIL != f51704(var15) : var15;
        assert module0810.NIL != Types.symbolp(var31) : var31;
        if (module0810.NIL != module0035.f2169(f51732(var15), (SubLObject)module0810.$ic51$)) {
            module0077.f5326(var31, f51712(var15));
            return (SubLObject)module0810.T;
        }
        return (SubLObject)module0810.NIL;
    }
    
    public static SubLObject f51760(final SubLObject var54) {
        final SubLObject var55 = module0813.f52032();
        if (module0810.NIL != var55) {
            final SubLObject var56 = module0813.f52078(var55);
            if (module0810.NIL != var56) {
                return f51733(var56, var54);
            }
        }
        return (SubLObject)module0810.NIL;
    }
    
    public static SubLObject f51761(final SubLObject var56) {
        final SubLObject var57 = module0813.f52032();
        if (module0810.NIL != var57) {
            final SubLObject var58 = module0813.f52078(var57);
            if (module0810.NIL != var58) {
                return f51734(var58, var56);
            }
        }
        return (SubLObject)module0810.NIL;
    }
    
    public static SubLObject f51762(final SubLObject var57) {
        final SubLObject var58 = module0813.f52032();
        if (module0810.NIL != var58) {
            final SubLObject var59 = module0813.f52078(var58);
            if (module0810.NIL != var59) {
                return f51735(var59, var57);
            }
        }
        return (SubLObject)module0810.NIL;
    }
    
    public static SubLObject f51763(final SubLObject var58) {
        final SubLObject var59 = module0813.f52032();
        if (module0810.NIL != var59) {
            final SubLObject var60 = module0813.f52078(var59);
            if (module0810.NIL != var60) {
                return f51737(var60, var58);
            }
        }
        return (SubLObject)module0810.NIL;
    }
    
    public static SubLObject f51758(final SubLObject var53) {
        f51764(var53);
        f51765(var53);
        f51766(var53);
        f51767(var53);
        f51768(var53);
        f51769(var53);
        f51770(var53);
        return (SubLObject)module0810.NIL;
    }
    
    public static SubLObject f51764(final SubLObject var53) {
        SubLObject var54 = (SubLObject)module0810.NIL;
        SubLObject var55 = (SubLObject)module0810.NIL;
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
        var54 = (SubLObject)module0810.NIL;
        var55 = (SubLObject)module0810.NIL;
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
        module0077.f5326((SubLObject)module0810.$ic75$, var53);
        return (SubLObject)module0810.NIL;
    }
    
    public static SubLObject f51771(final SubLObject var53, final SubLObject var62) {
        final SubLObject var63 = Packages.find_package((SubLObject)module0810.$ic76$);
        SubLObject var64 = (SubLObject)module0810.ZERO_INTEGER;
        SubLObject var65 = var62;
        SubLObject var66 = (SubLObject)module0810.NIL;
        var66 = var65.first();
        while (module0810.NIL != var65) {
            if (var63.eql(Symbols.symbol_package(var66))) {
                var64 = Numbers.add(var64, (SubLObject)module0810.ONE_INTEGER);
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
        return f51771(var53, module0810.$g6438$.getGlobalValue());
    }
    
    public static SubLObject f51770(final SubLObject var53) {
        return f51771(var53, module0810.$g6439$.getGlobalValue());
    }
    
    public static SubLObject f51772(SubLObject var62) {
        if (var62 == module0810.UNPROVIDED) {
            var62 = module0810.$g6439$.getGlobalValue();
        }
        final SubLObject var63 = module0813.f52032();
        if (module0810.NIL != var63) {
            final SubLObject var64 = module0813.f52078(var63);
            final SubLObject var65 = f51712(var64);
            f51771(var65, var62);
        }
        SubLObject var66 = (SubLObject)module0810.NIL;
        SubLObject var67 = var62;
        SubLObject var68 = (SubLObject)module0810.NIL;
        var68 = var67.first();
        while (module0810.NIL != var67) {
            final SubLObject var69 = module0809.f51534(var68);
            final SubLObject var70 = (module0810.NIL != var69) ? var69 : module0809.f51540(var68);
            if (module0810.NIL != var70) {
                final SubLObject var71 = var70;
                if (module0810.NIL == conses_high.member(var71, var66, Symbols.symbol_function((SubLObject)module0810.EQUAL), Symbols.symbol_function((SubLObject)module0810.IDENTITY))) {
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
        if (var70 == module0810.UNPROVIDED) {
            var70 = (SubLObject)module0810.NIL;
        }
        final SubLThread var71 = SubLProcess.currentSubLThread();
        if (module0810.NIL == module0077.f5302(var70)) {
            var70 = module0077.f5313((SubLObject)module0810.UNPROVIDED, (SubLObject)module0810.UNPROVIDED);
        }
        SubLObject var72 = (SubLObject)module0810.NIL;
        try {
            final SubLObject var73 = stream_macros.$stream_requires_locking$.currentBinding(var71);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0810.NIL, var71);
                var72 = compatibility.open_text(var37, (SubLObject)module0810.$ic62$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var73, var71);
            }
            if (!var72.isStream()) {
                Errors.error((SubLObject)module0810.$ic57$, var37);
            }
            SubLObject var74;
            SubLObject var75;
            SubLObject var76;
            for (var74 = var72, var75 = (SubLObject)module0810.NIL, var75 = reader.read(var74, (SubLObject)module0810.NIL, (SubLObject)module0810.$ic79$, (SubLObject)module0810.UNPROVIDED); module0810.$ic79$ != var75; var75 = reader.read(var74, (SubLObject)module0810.NIL, (SubLObject)module0810.$ic79$, (SubLObject)module0810.UNPROVIDED)) {
                var76 = module0035.remove_if_not((SubLObject)module0810.$ic80$, module0035.f2399(var75, (SubLObject)module0810.$ic74$, (SubLObject)module0810.UNPROVIDED, (SubLObject)module0810.UNPROVIDED, (SubLObject)module0810.UNPROVIDED), (SubLObject)module0810.UNPROVIDED, (SubLObject)module0810.UNPROVIDED, (SubLObject)module0810.UNPROVIDED, (SubLObject)module0810.UNPROVIDED);
                module0078.f5374(var76, var70);
            }
        }
        finally {
            final SubLObject var77 = Threads.$is_thread_performing_cleanupP$.currentBinding(var71);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0810.T, var71);
                if (var72.isStream()) {
                    streams_high.close(var72, (SubLObject)module0810.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var77, var71);
            }
        }
        return var70;
    }
    
    public static SubLObject f51774(final SubLObject var74, SubLObject var70) {
        if (var70 == module0810.UNPROVIDED) {
            var70 = (SubLObject)module0810.NIL;
        }
        SubLObject var75 = var74;
        SubLObject var76 = (SubLObject)module0810.NIL;
        var76 = var75.first();
        while (module0810.NIL != var75) {
            var70 = f51773(var76, var70);
            var75 = var75.rest();
            var76 = var75.first();
        }
        return var70;
    }
    
    public static SubLObject f51775(final SubLObject var15, final SubLObject var75) {
        SubLObject var76 = (SubLObject)module0810.NIL;
        final SubLObject var77 = module0077.f5333(var75);
        SubLObject var78;
        SubLObject var79;
        SubLObject var80;
        for (var78 = module0032.f1741(var77), var79 = (SubLObject)module0810.NIL, var79 = module0032.f1742(var78, var77); module0810.NIL == module0032.f1744(var78, var79); var79 = module0032.f1743(var79)) {
            var80 = module0032.f1745(var78, var79);
            if (module0810.NIL != module0032.f1746(var79, var80) && module0810.NIL != f51753(var15, var80) && module0810.NIL == f51736(var15, var80)) {
                var76 = (SubLObject)ConsesLow.cons(var80, var76);
            }
        }
        return Sort.sort(var76, (SubLObject)module0810.$ic81$, (SubLObject)module0810.$ic82$);
    }
    
    public static SubLObject f51776(final SubLObject var15, final SubLObject var75, SubLObject var3) {
        if (var3 == module0810.UNPROVIDED) {
            var3 = (SubLObject)module0810.T;
        }
        f51777(var3);
        SubLObject var76 = f51775(var15, var75);
        SubLObject var77 = (SubLObject)module0810.NIL;
        var77 = var76.first();
        while (module0810.NIL != var76) {
            final SubLObject var78 = f51738(var15, var77);
            if (var77.isMacroOperator()) {
                f51778(var77, var78, var3);
            }
            else if (module0810.NIL != module0004.f85(var77)) {
                final SubLObject var79 = f51779(var77);
                f51780(var77, var78, var79, var3);
            }
            else {
                Errors.error((SubLObject)module0810.$ic83$, var77);
            }
            var76 = var76.rest();
            var77 = var76.first();
        }
        return var15;
    }
    
    public static SubLObject f51779(final SubLObject var51) {
        final SubLObject var52 = module0004.f86(var51);
        SubLObject var53 = (SubLObject)module0810.NIL;
        SubLObject var54 = var52;
        SubLObject var55 = (SubLObject)module0810.NIL;
        var55 = var54.first();
        while (module0810.NIL != var54) {
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
        PrintLow.format(var3, (SubLObject)module0810.$ic84$);
        PrintLow.format(var3, (SubLObject)module0810.$ic85$);
        return var3;
    }
    
    public static SubLObject f51780(final SubLObject var51, final SubLObject var80, final SubLObject var81, SubLObject var3) {
        if (var3 == module0810.UNPROVIDED) {
            var3 = (SubLObject)module0810.T;
        }
        PrintLow.format(var3, (SubLObject)module0810.$ic86$, var51);
        SubLObject var82 = var81;
        final SubLObject var83 = Sequences.position((SubLObject)module0810.$ic87$, var81, (SubLObject)module0810.UNPROVIDED, (SubLObject)module0810.UNPROVIDED, (SubLObject)module0810.UNPROVIDED, (SubLObject)module0810.UNPROVIDED);
        SubLObject var84 = (SubLObject)module0810.NIL;
        if (var83.isInteger()) {
            var82 = Sequences.subseq(var81, (SubLObject)module0810.ZERO_INTEGER, var83);
            var84 = Sequences.subseq(var81, Numbers.add(var83, (SubLObject)module0810.ONE_INTEGER), (SubLObject)module0810.UNPROVIDED);
        }
        f51781(var82, var84, var3);
        streams_high.terpri(var3);
        module0038.f2648(var3, (SubLObject)module0810.TWO_INTEGER);
        if (module0810.NIL == var84) {
            f51782(var80, var82, var3);
        }
        else {
            f51783(var80, var82, var84, var3);
        }
        PrintLow.format(var3, (SubLObject)module0810.$ic88$);
        return var80;
    }
    
    public static SubLObject f51778(final SubLObject var51, final SubLObject var80, SubLObject var3) {
        if (var3 == module0810.UNPROVIDED) {
            var3 = (SubLObject)module0810.T;
        }
        PrintLow.format(var3, (SubLObject)module0810.$ic89$, var51);
        streams_high.terpri(var3);
        module0038.f2648(var3, (SubLObject)module0810.TWO_INTEGER);
        streams_high.write_string((SubLObject)module0810.$ic90$, var3, (SubLObject)module0810.UNPROVIDED, (SubLObject)module0810.UNPROVIDED);
        streams_high.write_string(var80, var3, (SubLObject)module0810.UNPROVIDED, (SubLObject)module0810.UNPROVIDED);
        streams_high.write_string((SubLObject)module0810.$ic91$, var3, (SubLObject)module0810.UNPROVIDED, (SubLObject)module0810.UNPROVIDED);
        streams_high.terpri(var3);
        streams_high.terpri(var3);
        return var80;
    }
    
    public static SubLObject f51781(final SubLObject var85, final SubLObject var87, SubLObject var3) {
        if (var3 == module0810.UNPROVIDED) {
            var3 = (SubLObject)module0810.T;
        }
        SubLObject var88 = (SubLObject)module0810.NIL;
        streams_high.write_string((SubLObject)module0810.$ic92$, var3, (SubLObject)module0810.UNPROVIDED, (SubLObject)module0810.UNPROVIDED);
        SubLObject var89 = var85;
        SubLObject var90 = (SubLObject)module0810.NIL;
        var90 = var89.first();
        while (module0810.NIL != var89) {
            if (module0810.NIL != var88) {
                streams_high.write_string((SubLObject)module0810.$ic93$, var3, (SubLObject)module0810.UNPROVIDED, (SubLObject)module0810.UNPROVIDED);
            }
            streams_high.write_string(Symbols.symbol_name(var90), var3, (SubLObject)module0810.UNPROVIDED, (SubLObject)module0810.UNPROVIDED);
            var88 = (SubLObject)module0810.T;
            var89 = var89.rest();
            var90 = var89.first();
        }
        if (module0810.NIL != module0035.sublisp_boolean(var87)) {
            if (module0810.NIL != var88) {
                streams_high.write_string((SubLObject)module0810.$ic93$, var3, (SubLObject)module0810.UNPROVIDED, (SubLObject)module0810.UNPROVIDED);
            }
            streams_high.write_string((SubLObject)module0810.$ic94$, var3, (SubLObject)module0810.UNPROVIDED, (SubLObject)module0810.UNPROVIDED);
            var89 = var87;
            SubLObject var91 = (SubLObject)module0810.NIL;
            var91 = var89.first();
            while (module0810.NIL != var89) {
                streams_high.write_string((SubLObject)module0810.$ic95$, var3, (SubLObject)module0810.UNPROVIDED, (SubLObject)module0810.UNPROVIDED);
                streams_high.write_string(Symbols.symbol_name(var91), var3, (SubLObject)module0810.UNPROVIDED, (SubLObject)module0810.UNPROVIDED);
                streams_high.write_string((SubLObject)module0810.$ic96$, var3, (SubLObject)module0810.UNPROVIDED, (SubLObject)module0810.UNPROVIDED);
                var89 = var89.rest();
                var91 = var89.first();
            }
        }
        streams_high.write_string((SubLObject)module0810.$ic97$, var3, (SubLObject)module0810.UNPROVIDED, (SubLObject)module0810.UNPROVIDED);
        return var85;
    }
    
    public static SubLObject f51782(final SubLObject var80, final SubLObject var91, SubLObject var3) {
        if (var3 == module0810.UNPROVIDED) {
            var3 = (SubLObject)module0810.T;
        }
        PrintLow.format(var3, (SubLObject)module0810.$ic98$, var80);
        SubLObject var92 = var91;
        SubLObject var93 = (SubLObject)module0810.NIL;
        var93 = var92.first();
        while (module0810.NIL != var92) {
            streams_high.write_string((SubLObject)module0810.$ic93$, var3, (SubLObject)module0810.UNPROVIDED, (SubLObject)module0810.UNPROVIDED);
            streams_high.write_string(Symbols.symbol_name(var93), var3, (SubLObject)module0810.UNPROVIDED, (SubLObject)module0810.UNPROVIDED);
            var92 = var92.rest();
            var93 = var92.first();
        }
        streams_high.write_string((SubLObject)module0810.$ic99$, var3, (SubLObject)module0810.UNPROVIDED, (SubLObject)module0810.UNPROVIDED);
        return var80;
    }
    
    public static SubLObject f51783(final SubLObject var80, final SubLObject var85, final SubLObject var87, SubLObject var3) {
        if (var3 == module0810.UNPROVIDED) {
            var3 = (SubLObject)module0810.T;
        }
        streams_high.write_string((SubLObject)module0810.$ic100$, var3, (SubLObject)module0810.UNPROVIDED, (SubLObject)module0810.UNPROVIDED);
        SubLObject var88 = conses_high.copy_list(var85);
        SubLObject var89 = var87;
        SubLObject var90 = (SubLObject)module0810.NIL;
        var90 = var89.first();
        while (module0810.NIL != var89) {
            streams_high.terpri(var3);
            module0038.f2648(var3, (SubLObject)module0810.FOUR_INTEGER);
            streams_high.write_string((SubLObject)module0810.$ic101$, var3, (SubLObject)module0810.UNPROVIDED, (SubLObject)module0810.UNPROVIDED);
            streams_high.write_string(Symbols.symbol_name(var90), var3, (SubLObject)module0810.UNPROVIDED, (SubLObject)module0810.UNPROVIDED);
            streams_high.write_string((SubLObject)module0810.$ic102$, var3, (SubLObject)module0810.UNPROVIDED, (SubLObject)module0810.UNPROVIDED);
            f51782(var80, var88, var3);
            streams_high.write_string((SubLObject)module0810.$ic97$, var3, (SubLObject)module0810.UNPROVIDED, (SubLObject)module0810.UNPROVIDED);
            var88 = ConsesLow.append(var88, (SubLObject)ConsesLow.list(var90));
            var89 = var89.rest();
            var90 = var89.first();
        }
        streams_high.terpri(var3);
        module0038.f2648(var3, (SubLObject)module0810.FOUR_INTEGER);
        streams_high.write_string((SubLObject)module0810.$ic103$, var3, (SubLObject)module0810.UNPROVIDED, (SubLObject)module0810.UNPROVIDED);
        f51782(var80, var88, var3);
        streams_high.write_string((SubLObject)module0810.$ic97$, var3, (SubLObject)module0810.UNPROVIDED, (SubLObject)module0810.UNPROVIDED);
        streams_high.write_string((SubLObject)module0810.$ic97$, var3, (SubLObject)module0810.UNPROVIDED, (SubLObject)module0810.UNPROVIDED);
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
        return (SubLObject)module0810.NIL;
    }
    
    public static SubLObject f51785() {
        module0810.$g6435$ = SubLFiles.deflexical("S#56499", (SubLObject)module0810.$ic0$);
        module0810.$g6436$ = SubLFiles.defconstant("S#56500", (SubLObject)module0810.$ic1$);
        module0810.$g6437$ = SubLFiles.deflexical("S#56501", (SubLObject)module0810.$ic58$);
        module0810.$g6438$ = SubLFiles.deflexical("S#56502", (SubLObject)module0810.$ic77$);
        module0810.$g6439$ = SubLFiles.deflexical("S#56503", module0810.$ic78$);
        return (SubLObject)module0810.NIL;
    }
    
    public static SubLObject f51786() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0810.$g6436$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0810.$ic8$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0810.$ic9$);
        Structures.def_csetf((SubLObject)module0810.$ic10$, (SubLObject)module0810.$ic11$);
        Structures.def_csetf((SubLObject)module0810.$ic12$, (SubLObject)module0810.$ic13$);
        Structures.def_csetf((SubLObject)module0810.$ic14$, (SubLObject)module0810.$ic15$);
        Structures.def_csetf((SubLObject)module0810.$ic16$, (SubLObject)module0810.$ic17$);
        Structures.def_csetf((SubLObject)module0810.$ic18$, (SubLObject)module0810.$ic19$);
        Structures.def_csetf((SubLObject)module0810.$ic20$, (SubLObject)module0810.$ic21$);
        Structures.def_csetf((SubLObject)module0810.$ic22$, (SubLObject)module0810.$ic23$);
        Structures.def_csetf((SubLObject)module0810.$ic24$, (SubLObject)module0810.$ic25$);
        Structures.def_csetf((SubLObject)module0810.$ic26$, (SubLObject)module0810.$ic27$);
        Structures.def_csetf((SubLObject)module0810.$ic28$, (SubLObject)module0810.$ic29$);
        Equality.identity((SubLObject)module0810.$ic1$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0810.$g6436$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0810.$ic45$));
        return (SubLObject)module0810.NIL;
    }
    
    private static SubLObject _constant_78_initializer() {
        return (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("*CACHE-INFERENCE-RESULTS*"), SubLObjectFactory.makeSymbol("*HL-FAILURE-BACKCHAINING*"), SubLObjectFactory.makeSymbol("*ENABLE-REWRITE-OF-PROPAGATION?*"), SubLObjectFactory.makeSymbol("*FORWARD-PROPAGATE-FROM-NEGATIONS*"), SubLObjectFactory.makeSymbol("KB-STATISTICS"), SubLObjectFactory.makeSymbol("SERVER-SUMMARY"), SubLObjectFactory.makeSymbol("HALT-CYC-IMAGE"), SubLObjectFactory.makeSymbol("ALL"), SubLObjectFactory.makeSymbol("NONE"), SubLObjectFactory.makeSymbol("*INIT-FILE-LOADED?*"), SubLObjectFactory.makeSymbol("*THESAURUS-FILENAME*"), SubLObjectFactory.makeSymbol("*THESAURUS-FILENAME-EXTENSION*"), SubLObjectFactory.makeSymbol("*THESAURUS-SUBDIRECTORIES*"), SubLObjectFactory.makeSymbol("INITIALIZE-AGENDA"), SubLObjectFactory.makeSymbol("INITIALIZE-TRANSCRIPT-HANDLING"), SubLObjectFactory.makeSymbol("LOAD-SYSTEM-PARAMETERS"), SubLObjectFactory.makeSymbol("LOAD-THESAURUS-INIT-FILE"), SubLObjectFactory.makeSymbol("PROBE-FILE"), SubLObjectFactory.makeSymbol("SYSTEM-CODE-INITIALIZATIONS"), SubLObjectFactory.makeSymbol("SYSTEM-KB-INITIALIZATIONS"), SubLObjectFactory.makeSymbol("LOAD-API"), SubLObjectFactory.makeSymbol("CORE-KB-FINALIZATION"), SubLObjectFactory.makeSymbol("CORE-KB-FINISH-BOOTSTRAPPING"), SubLObjectFactory.makeSymbol("CORE-KB-FINISH-DEFINITIONS"), SubLObjectFactory.makeSymbol("CORE-KB-INITIALIZATION"), SubLObjectFactory.makeSymbol("CORE-KB-START-BOOTSTRAPPING"), SubLObjectFactory.makeSymbol("CORE-KB-START-DEFINITIONS"), SubLObjectFactory.makeSymbol("CYC-FUNCTION-TO-ARG"), SubLObjectFactory.makeSymbol("FI-ASSERT-INT"), SubLObjectFactory.makeSymbol("HL-EXTERNAL-ID-STRING-P"), SubLObjectFactory.makeSymbol("HL-FIND-OR-CREATE-NART"), SubLObjectFactory.makeSymbol("LOW-ASSERT-LITERAL"), SubLObjectFactory.makeSymbol("RELEVANT-MT?"), SubLObjectFactory.makeSymbol("DUMP-STANDARD-KB"), SubLObjectFactory.makeSymbol("DUMP-KB"), SubLObjectFactory.makeSymbol("LOAD-KB"), SubLObjectFactory.makeSymbol("*STANDARD-INPUT*"), SubLObjectFactory.makeSymbol("READ-IGNORING-ERRORS"), SubLObjectFactory.makeSymbol("*INFERENCE-TRACE-PORT*"), SubLObjectFactory.makeSymbol("API-PORT"), SubLObjectFactory.makeSymbol("API-SERVER-TOP-LEVEL"), SubLObjectFactory.makeSymbol("CFASL-PORT"), SubLObjectFactory.makeSymbol("CFASL-SERVER-TOP-LEVEL"), SubLObjectFactory.makeSymbol("CYC-HTML-FEATURE"), SubLObjectFactory.makeSymbol("CYC-THESAURUS-FEATURE"), SubLObjectFactory.makeSymbol("ENABLE-TCP-SERVER"), SubLObjectFactory.makeSymbol("FINISH-OUTPUT"), SubLObjectFactory.makeSymbol("HTML-PORT"), SubLObjectFactory.makeSymbol("HTTP-PORT"), SubLObjectFactory.makeSymbol("HTML-SERVER-TOP-LEVEL"), SubLObjectFactory.makeSymbol("HTTP-SERVER-TOP-LEVEL"), SubLObjectFactory.makeSymbol("ROBUST-ENABLE-TCP-SERVER"), SubLObjectFactory.makeSymbol("START-AGENDA"), SubLObjectFactory.makeSymbol("THESAURUS-MANAGER-ACCESS-PROTOCOL-SERVER-TOP-LEVEL"), SubLObjectFactory.makeSymbol("TMAP-PORT"), SubLObjectFactory.makeSymbol("HOSTNAME"), SubLObjectFactory.makeSymbol("*EVAL-IN-API?*"), SubLObjectFactory.makeSymbol("*SILENT-PROGRESS?*"), SubLObjectFactory.makeSymbol("CYC-HOME-FILENAME"), SubLObjectFactory.makeSymbol("HALT-AGENDA"), SubLObjectFactory.makeSymbol("LOAD-INFERENCE-TESTS"), SubLObjectFactory.makeSymbol("SET-COMMUNICATION-MODE"), SubLObjectFactory.makeSymbol("LOAD-INFERENCE-TESTS"), SubLObjectFactory.makeSymbol("DEF-INFERENCE-TEST"), SubLObjectFactory.makeSymbol("DEFINE-INFERENCE-TEST"), SubLObjectFactory.makeSymbol("DEFINE-SUBTEST"), SubLObjectFactory.makeSymbol("CYC-HOME-FILENAME"), SubLObjectFactory.makeSymbol("LOAD-ALL-CYC-TESTS"), SubLObjectFactory.makeSymbol("RUN-ALL-CYC-TESTS"), SubLObjectFactory.makeSymbol("RUN-CYC-TESTS"), SubLObjectFactory.makeSymbol("RUN-ALL-INFERENCE-UNIT-TESTS"), SubLObjectFactory.makeSymbol("RUN-ALL-REMOVAL-MODULE-TESTS"), SubLObjectFactory.makeSymbol("RUN-ALL-EVALUATABLE-RELATION-TESTS"), SubLObjectFactory.makeSymbol("*SECONDS-IN-A-NON-LEAP-YEAR*"), SubLObjectFactory.makeSymbol("CLOSED-QUERY-SUCCESS-TOKEN"), SubLObjectFactory.makeSymbol("DEFINE-EVALUATABLE-PREDICATE-TEST"), SubLObjectFactory.makeSymbol("DEFINE-SIMPLE-EVALUATABLE-FUNCTION-TEST-BLOCK"), SubLObjectFactory.makeSymbol("DEFINE-SIMPLE-EVALUATABLE-PREDICATE-TEST-BLOCK"), SubLObjectFactory.makeSymbol("EQUALS-EL?"), SubLObjectFactory.makeSymbol("HTML-ESCAPED-TO-UNICODE-VECTOR"), SubLObjectFactory.makeSymbol("LENGTH="), SubLObjectFactory.makeSymbol("LENGTH>="), SubLObjectFactory.makeSymbol("LENGTHS="), SubLObjectFactory.makeSymbol("NEW-INFERENCE-ERROR-SUSPEND-STATUS"), SubLObjectFactory.makeSymbol("NOT-EQ"), SubLObjectFactory.makeSymbol("TREE-MATCHES-PATTERN"), SubLObjectFactory.makeSymbol("UNICODE-VECTOR-TO-DISPLAY"), SubLObjectFactory.makeSymbol("DECLARE-CYC-TEST-FILE"), SubLObjectFactory.makeSymbol("DEFINE-EVALUATABLE-FUNCTION-TEST"), SubLObjectFactory.makeSymbol("DEFINE-INFERENCE-UNIT-TEST"), SubLObjectFactory.makeSymbol("DEFINE-TRANSFORMATION-MODULE-TEST"), SubLObjectFactory.makeSymbol("LOAD-ALL-KB-CONTENT-POST-BUILD-TESTS"), SubLObjectFactory.makeSymbol("PWHEN-FEATURE"), SubLObjectFactory.makeSymbol("*TRANSFORMATION-DEPTH-COMPUTATION*"), SubLObjectFactory.makeSymbol("GENL-CARDINALITY"), SubLObjectFactory.makeSymbol("PROBLEM-MIN-TRANSFORMATION-DEPTH"), SubLObjectFactory.makeSymbol("PROBLEM-MIN-TRANSFORMATION-DEPTH"), SubLObjectFactory.makeSymbol("PROBLEM-PROOF-COUNT"), SubLObjectFactory.makeSymbol("PROBLEM-SOLE-CLAUSE"), SubLObjectFactory.makeSymbol("PROBLEM-STORE-UNMANIFESTED-NON-FOCAL-COUNT"), SubLObjectFactory.makeSymbol("QUERY-ABORT"), SubLObjectFactory.makeSymbol("RESIDUAL-TRANSFORMATION-LINK-RESIDUAL-PROBLEM"), SubLObjectFactory.makeSymbol("RESIDUAL-TRANSFORMATION-LINK-RESIDUAL-PROBLEM"), SubLObjectFactory.makeSymbol("SPEC-CARDINALITY"), SubLObjectFactory.makeSymbol("STRATEGICALLY-PENDING-PROBLEM-P"), SubLObjectFactory.makeSymbol("STRATEGICALLY-POSSIBLE-PROBLEM-P"), SubLObjectFactory.makeSymbol("STRATEGICALLY-POSSIBLE-PROBLEM-P"), SubLObjectFactory.makeSymbol("TACTICALLY-PENDING-PROBLEM-P"), SubLObjectFactory.makeSymbol("TACTICALLY-PENDING-PROBLEM-P"), SubLObjectFactory.makeSymbol("TACTICALLY-POSSIBLE-PROBLEM-P"), SubLObjectFactory.makeSymbol("TRANSFORMATION-RULE-SUCCESS-COUNT"), SubLObjectFactory.makeSymbol("CONSTANT-SUID"), SubLObjectFactory.makeSymbol("*ACCUMULATING-AT-VIOLATIONS?*"), SubLObjectFactory.makeSymbol("*ACCUMULATING-WFF-VIOLATIONS?*"), SubLObjectFactory.makeSymbol("*ADDITIONAL-FORT-TYPING-COLLECTIONS*"), SubLObjectFactory.makeSymbol("*ADMIT-NART-MTS-IN-MT-GAFS-IN-MT-MT?*"), SubLObjectFactory.makeSymbol("*ANECT-MT*"), SubLObjectFactory.makeSymbol("*ASSUME-SBHL-EXTENSIONS-NONEMPTY*"), SubLObjectFactory.makeSymbol("*AT-ADMIT-CONSISTENT-NAUTS?*"), SubLObjectFactory.makeSymbol("*AT-APPLY-NECESSARY-DEFNS?*"), SubLObjectFactory.makeSymbol("*AT-CHECK-ARG-GENLS?*"), SubLObjectFactory.makeSymbol("*AT-CHECK-ARG-ISA?*"), SubLObjectFactory.makeSymbol("*AT-CHECK-GENL-INVERSES?*"), SubLObjectFactory.makeSymbol("*AT-CHECK-GENL-PREDS?*"), SubLObjectFactory.makeSymbol("*AT-CHECK-INTER-ARG-GENL?*"), SubLObjectFactory.makeSymbol("*AT-CHECK-INTER-ARG-ISA?*"), SubLObjectFactory.makeSymbol("*AT-CHECK-NON-CONSTANT-INTER-ARG-ISA?*"), SubLObjectFactory.makeSymbol("*AT-CHECK-NOT-GENLS-DISJOINT?*"), SubLObjectFactory.makeSymbol("*AT-CHECK-NOT-ISA-DISJOINT?*"), SubLObjectFactory.makeSymbol("*AT-CHECK-NOT-MDW?*"), SubLObjectFactory.makeSymbol("*AT-CHECK-NOT-SDC?*"), SubLObjectFactory.makeSymbol("*AT-POSSIBLY-CHECK-DEFINING-MTS?*"), SubLObjectFactory.makeSymbol("*AT-SOME-ARG-ISA-REQUIRED?*"), SubLObjectFactory.makeSymbol("*AT-TRACE-LEVEL*"), SubLObjectFactory.makeSymbol("*BREAK-ON-FAILURE*"), SubLObjectFactory.makeSymbol("*CACHE-INFERENCE-RESULTS*"), SubLObjectFactory.makeSymbol("*CACHED-GENL-PREDICATES*"), SubLObjectFactory.makeSymbol("*CACHED-GENL-PREDICATES-SET*"), SubLObjectFactory.makeSymbol("*CACHED-GENLS*"), SubLObjectFactory.makeSymbol("*CACHED-GENLS-SET*"), SubLObjectFactory.makeSymbol("*CACHED-ISAS*"), SubLObjectFactory.makeSymbol("*CACHED-ISAS-SET*"), SubLObjectFactory.makeSymbol("*CANONICALIZE-ALL-SENTENCE-ARGS?*"), SubLObjectFactory.makeSymbol("*CATCH-ERROR-MESSAGE-TARGET*"), SubLObjectFactory.makeSymbol("*CHECK-WFF-COHERENCE?*"), SubLObjectFactory.makeSymbol("*CHEMISTRY-LEXICAL-MT*"), SubLObjectFactory.makeSymbol("*CIRCULAR-COMPLEXITY-COUNT-LIMIT*"), SubLObjectFactory.makeSymbol("*CONTINUE-CERROR?*"), SubLObjectFactory.makeSymbol("*CONTROL-1*"), SubLObjectFactory.makeSymbol("*CONTROL-2*"), SubLObjectFactory.makeSymbol("*CONTROL-3*"), SubLObjectFactory.makeSymbol("*CONTROL-4*"), SubLObjectFactory.makeSymbol("*CONTROL-5*"), SubLObjectFactory.makeSymbol("*CONTROL-6*"), SubLObjectFactory.makeSymbol("*CONTROL?*"), SubLObjectFactory.makeSymbol("*CORE-MT-FLOOR*"), SubLObjectFactory.makeSymbol("*CURRENT-TEST*"), SubLObjectFactory.makeSymbol("*DEBUG-CONTINUE*"), SubLObjectFactory.makeSymbol("*DEFINITIONAL-FORT-TYPING-COLLECTIONS*"), SubLObjectFactory.makeSymbol("*DEFN-TRACE-LEVEL*"), SubLObjectFactory.makeSymbol("*DETERMINERS-BEFORE-VARIABLES*"), SubLObjectFactory.makeSymbol("*EL-SUPPORTS-CONTRACTIONS?*"), SubLObjectFactory.makeSymbol("*EL-SUPPORTS-DOT-SYNTAX?*"), SubLObjectFactory.makeSymbol("*ENCAPSULATE-INTENSIONAL-FORMULA?*"), SubLObjectFactory.makeSymbol("*ENFORCE-ONLY-DEFINITIONAL-GAFS-IN-VOCAB-MT?*"), SubLObjectFactory.makeSymbol("*EVALUATABLE-BACKCHAIN-ENABLED*"), SubLObjectFactory.makeSymbol("*EXPRESS-AS-ASYMMETRIC?*"), SubLObjectFactory.makeSymbol("*EXPRESS-AS-DISJOINT-WITH?*"), SubLObjectFactory.makeSymbol("*EXPRESS-AS-GENLS?*"), SubLObjectFactory.makeSymbol("*EXPRESS-AS-IRREFLEXIVE?*"), SubLObjectFactory.makeSymbol("*EXPRESS-AS-NEGATION-INVERSE?*"), SubLObjectFactory.makeSymbol("*EXPRESS-AS-NEGATION-PREDICATES?*"), SubLObjectFactory.makeSymbol("*EXPRESS-AS-REFLEXIVE?*"), SubLObjectFactory.makeSymbol("*EXPRESS-AS-RELATION-TYPE?*"), SubLObjectFactory.makeSymbol("*EXPRESS-AS-RULE-MACRO?*"), SubLObjectFactory.makeSymbol("*EXPRESS-AS-SYMMETRIC?*"), SubLObjectFactory.makeSymbol("*EXPRESS-AS-TRANSITIVE?*"), SubLObjectFactory.makeSymbol("*FI-ERROR*"), SubLObjectFactory.makeSymbol("*FI-WARNING*"), SubLObjectFactory.makeSymbol("*FORWARD-PROPAGATE-FROM-NEGATIONS*"), SubLObjectFactory.makeSymbol("*GT-MAX-NODES-DIRECTION*"), SubLObjectFactory.makeSymbol("*HL-FAILURE-BACKCHAINING*"), SubLObjectFactory.makeSymbol("*IMPLICIT-FORT-TYPING-COLLECTIONS*"), SubLObjectFactory.makeSymbol("*IMPLICITIFY-UNIVERSALS?*"), SubLObjectFactory.makeSymbol("*INCLUDE-AT-CONSTRAINT-GAF?*"), SubLObjectFactory.makeSymbol("*INDEX-CONVERT-COMPLEX-THRESHOLD*"), SubLObjectFactory.makeSymbol("*INDEX-CONVERT-SIMPLE-THRESHOLD*"), SubLObjectFactory.makeSymbol("*INDEX-OVERLAP-ENABLED?*"), SubLObjectFactory.makeSymbol("*INHIBIT-CYCLIC-COMMUTATIVE-IN-ARGS?*"), SubLObjectFactory.makeSymbol("*IT-BACKCHAIN*"), SubLObjectFactory.makeSymbol("*IT-DEPTH*"), SubLObjectFactory.makeSymbol("*IT-NUMBER*"), SubLObjectFactory.makeSymbol("*IT-TIME*"), SubLObjectFactory.makeSymbol("*IT-VERBOSE*"), SubLObjectFactory.makeSymbol("*KNOWN-ANTECEDENT-RULE-ENABLED?*"), SubLObjectFactory.makeSymbol("*LEXICON-LOOKUP-MT*"), SubLObjectFactory.makeSymbol("*LOOKUP-OVERLAP-WATERMARK*"), SubLObjectFactory.makeSymbol("*MT*"), SubLObjectFactory.makeSymbol("*MT-MT*"), SubLObjectFactory.makeSymbol("*MUST-ENFORCE-SEMANTICS?*"), SubLObjectFactory.makeSymbol("*NL-TRIE-ROTATION-INDEX*"), SubLObjectFactory.makeSymbol("*NOTING-AT-VIOLATIONS?*"), SubLObjectFactory.makeSymbol("*PARAPHRASE-MODE*"), SubLObjectFactory.makeSymbol("*PPH-COERCE-DEFINITE-DESCRIPTIONS-FOR-UNLEXIFIED-TERMS?*"), SubLObjectFactory.makeSymbol("*PPH-DOMAIN-MT*"), SubLObjectFactory.makeSymbol("*PPH-EXPAND-E-NOTATION-FOR-FLOATS?*"), SubLObjectFactory.makeSymbol("*PPH-LANGUAGE-MT*"), SubLObjectFactory.makeSymbol("*PPH-LINK-ARG0?*"), SubLObjectFactory.makeSymbol("*PPH-QUANTIFY-VARS?*"), SubLObjectFactory.makeSymbol("*PPH-USE-BULLETED-LISTS?*"), SubLObjectFactory.makeSymbol("*PPH-USE-SMART-VARIABLE-REPLACEMENT?*"), SubLObjectFactory.makeSymbol("*PPH-USE-WHOM?*"), SubLObjectFactory.makeSymbol("*READ-REQUIRE-CONSTANT-EXISTS*"), SubLObjectFactory.makeSymbol("*RESIDUAL-TRANSFORMATION-LINKS-ENABLED?*"), SubLObjectFactory.makeSymbol("*REWRITE-MODULES*"), SubLObjectFactory.makeSymbol("*SBHL-TEMPORALITY-ACTIVE?*"), SubLObjectFactory.makeSymbol("*SDC-COMMON-SPEC-EXCEPTION?*"), SubLObjectFactory.makeSymbol("*SDC-EXCEPTION-TRANSFERS-THRU-SPECS?*"), SubLObjectFactory.makeSymbol("*SIMPLIFY-SENTENCE?*"), SubLObjectFactory.makeSymbol("*SIMPLIFY-SEQUENCE-VARS-USING-KB-ARITY?*"), SubLObjectFactory.makeSymbol("*SKOLEM-AXIOM-TABLE*"), SubLObjectFactory.makeSymbol("*STANDARDIZE-VARIABLES-MEMORY*"), SubLObjectFactory.makeSymbol("*TERM-FUNCTIONAL-COMPLEXITY-CUTOFF*"), SubLObjectFactory.makeSymbol("*TEST-DIRECTION*"), SubLObjectFactory.makeSymbol("*TEST-STATUS*"), SubLObjectFactory.makeSymbol("*THE-CYCLIST*"), SubLObjectFactory.makeSymbol("*KE-PURPOSE*"), SubLObjectFactory.makeSymbol("*CB-CONSTANT-HISTORY*"), SubLObjectFactory.makeSymbol("*CB-NAT-HISTORY*"), SubLObjectFactory.makeSymbol("*CB-SENTENCE-HISTORY*"), SubLObjectFactory.makeSymbol("*CB-ASSERTION-HISTORY*"), SubLObjectFactory.makeSymbol("*PPH-REPLACE-BULLETED-LIST-TAGS?*"), SubLObjectFactory.makeSymbol("*PARAPHRASE-PRECISION*"), SubLObjectFactory.makeSymbol("*PPH-TERSE-MT-SCOPE?*"), SubLObjectFactory.makeSymbol("*PPH-MAXIMIZE-LINKS?*"), SubLObjectFactory.makeSymbol("*PPH-USE-TITLE-CAPITALIZATION?*"), SubLObjectFactory.makeSymbol("*PPH-USE-INDEXICAL-DATES?*"), SubLObjectFactory.makeSymbol("*PPH-ADDRESSEE*"), SubLObjectFactory.makeSymbol("*PPH-SPEAKER*"), SubLObjectFactory.makeSymbol("*TVA-PRECOMPUTE-CLOSURE-THRESHOLD*"), SubLObjectFactory.makeSymbol("*UNBOUND-RULE-BACKCHAIN-ENABLED*"), SubLObjectFactory.makeSymbol("*USE-TRANSCRIPT?*"), SubLObjectFactory.makeSymbol("*VALIDATE-EXPANSIONS?*"), SubLObjectFactory.makeSymbol("*WFF-VIOLATION-DATA-TERSE?*"), SubLObjectFactory.makeSymbol("*WITHIN-ASK*"), SubLObjectFactory.makeSymbol("1+"), SubLObjectFactory.makeSymbol("ABORT-CURRENT-CONTROLLING-INFERENCE"), SubLObjectFactory.makeSymbol("ALL-CONSTANTS"), SubLObjectFactory.makeSymbol("ALL-CONTIGUOUS-AFTER"), SubLObjectFactory.makeSymbol("ALL-CONTIGUOUS-AFTER-INVERSE"), SubLObjectFactory.makeSymbol("ALL-COTEMPORAL"), SubLObjectFactory.makeSymbol("ALL-DENOTS-OF-STRING"), SubLObjectFactory.makeSymbol("ALL-ENDS-AFTER-ENDING-OF"), SubLObjectFactory.makeSymbol("ALL-ENDS-AFTER-ENDING-OF-INVERSE"), SubLObjectFactory.makeSymbol("ALL-ENDS-AFTER-STARTING-OF"), SubLObjectFactory.makeSymbol("ALL-ENDS-AFTER-STARTING-OF-INVERSE"), SubLObjectFactory.makeSymbol("ALL-ENDS-DURING"), SubLObjectFactory.makeSymbol("ALL-ENDS-DURING-INVERSE"), SubLObjectFactory.makeSymbol("ALL-LEXICON-STRING-PREDICATES"), SubLObjectFactory.makeSymbol("ALL-NEGATION-INVERSES"), SubLObjectFactory.makeSymbol("ALL-NEGATION-PREDICATES"), SubLObjectFactory.makeSymbol("ALL-NEGATION-PREDS"), SubLObjectFactory.makeSymbol("ALL-OVERLAPS-START"), SubLObjectFactory.makeSymbol("ALL-OVERLAPS-START-INVERSE"), SubLObjectFactory.makeSymbol("ALL-SPEC-PREDS"), SubLObjectFactory.makeSymbol("ALL-STARTS-AFTER-ENDING-OF"), SubLObjectFactory.makeSymbol("ALL-STARTS-AFTER-ENDING-OF-INVERSE"), SubLObjectFactory.makeSymbol("ALL-STARTS-AFTER-STARTING-OF"), SubLObjectFactory.makeSymbol("ALL-STARTS-AFTER-STARTING-OF-INVERSE"), SubLObjectFactory.makeSymbol("ALL-STARTS-DURING"), SubLObjectFactory.makeSymbol("ALL-STARTS-DURING-INVERSE"), SubLObjectFactory.makeSymbol("ALL-TEMPORAL-BOUNDS-CONTAIN"), SubLObjectFactory.makeSymbol("ALL-TEMPORAL-BOUNDS-CONTAIN-INVERSE"), SubLObjectFactory.makeSymbol("ALL-TEMPORAL-BOUNDS-IDENTICAL"), SubLObjectFactory.makeSymbol("ALL-TEMPORAL-BOUNDS-INTERSECT"), SubLObjectFactory.makeSymbol("ALL-TEMPORALLY-COORIGINATING"), SubLObjectFactory.makeSymbol("ALL-TEMPORALLY-COTERMINAL"), SubLObjectFactory.makeSymbol("ALL-TEMPORALLY-FINISHED-BY"), SubLObjectFactory.makeSymbol("ALL-TEMPORALLY-FINISHED-BY-INVERSE"), SubLObjectFactory.makeSymbol("ALL-TEMPORALLY-STARTED-BY"), SubLObjectFactory.makeSymbol("ALL-TEMPORALLY-STARTED-BY-INVERSE"), SubLObjectFactory.makeSymbol("ALL-TEMPORALLY-SUBSUMES"), SubLObjectFactory.makeSymbol("ALL-TEMPORALLY-SUBSUMES-INVERSE"), SubLObjectFactory.makeSymbol("ANY-SDC-WRT?"), SubLObjectFactory.makeSymbol("ASENT-SENSE-AND-MT-TO-PROBLEM-QUERY"), SubLObjectFactory.makeSymbol("ASSERT-QUERY-TEST"), SubLObjectFactory.makeSymbol("ASSERT-RETURN-UNCANON"), SubLObjectFactory.makeSymbol("ASSERTED-SECOND"), SubLObjectFactory.makeSymbol("ASSERTED-WHY"), SubLObjectFactory.makeSymbol("ASSERTION-ARGUMENTS"), SubLObjectFactory.makeSymbol("ASSERTION-CONS"), SubLObjectFactory.makeSymbol("ASSERTION-FI-FORMULA"), SubLObjectFactory.makeSymbol("ASSERTION-FIND-IF"), SubLObjectFactory.makeSymbol("ASSERTION-GATHER"), SubLObjectFactory.makeSymbol("ASSERTION-HL-FORMULA"), SubLObjectFactory.makeSymbol("ATOMIC-SENTENCE-ARG1"), SubLObjectFactory.makeSymbol("ATOMIC-SENTENCE-ARG2"), SubLObjectFactory.makeSymbol("ATOMIC-SENTENCE-ARG3"), SubLObjectFactory.makeSymbol("ATOMIC-SENTENCE-ARG4"), SubLObjectFactory.makeSymbol("ATOMIC-SENTENCE-ARGS"), SubLObjectFactory.makeSymbol("ATOMIC-SENTENCE-PREDICATE"), SubLObjectFactory.makeSymbol("B-TEST-FORM"), SubLObjectFactory.makeSymbol("BELIEF-P"), SubLObjectFactory.makeSymbol("BINDING-VERIFY"), SubLObjectFactory.makeSymbol("BULL"), SubLObjectFactory.makeSymbol("CANON-ASSERT-EQUAL?"), SubLObjectFactory.makeSymbol("CANON-ASSERT-ISOMORPHIC?"), SubLObjectFactory.makeSymbol("CANON-EQUAL-HL-NAMES?"), SubLObjectFactory.makeSymbol("CANON-EQUAL?"), SubLObjectFactory.makeSymbol("CANON-FORMS-EQUAL?"), SubLObjectFactory.makeSymbol("CANON-QUERY-EQUAL?"), SubLObjectFactory.makeSymbol("CANONICALIZE-AND-RETURN-SKOLEM-VARS"), SubLObjectFactory.makeSymbol("CANONICALIZE-ASK"), SubLObjectFactory.makeSymbol("CANONICALIZE-CYCL"), SubLObjectFactory.makeSymbol("CANONICALIZE-CYCL-SENTENCE"), SubLObjectFactory.makeSymbol("CANONICALIZE-DEFAULT-EL-VARS"), SubLObjectFactory.makeSymbol("CANONICALIZE-PROBLEM-QUERY"), SubLObjectFactory.makeSymbol("CANONICALIZE-QUERY"), SubLObjectFactory.makeSymbol("CANONICALIZE-QUERY-SENTENCE"), SubLObjectFactory.makeSymbol("CANONICALIZE-WF-CYCL"), SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE"), SubLObjectFactory.makeSymbol("CB-GUESS-FORT"), SubLObjectFactory.makeSymbol("CDOHASH"), SubLObjectFactory.makeSymbol("CHECK-DENOT"), SubLObjectFactory.makeSymbol("CLEAR-SBHL-CACHES"), SubLObjectFactory.makeSymbol("CLOSED-QUERY-SUCCESS-TOKEN"), SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-SETQ"), SubLObjectFactory.makeSymbol("COLLECTION-P"), SubLObjectFactory.makeSymbol("COMPLEX-INDEX-P"), SubLObjectFactory.makeSymbol("COMPLEX-INDEXED-TERM-P"), SubLObjectFactory.makeSymbol("CONTIGUOUS-AFTER?"), SubLObjectFactory.makeSymbol("CONTINUE-INFERENCE"), SubLObjectFactory.makeSymbol("COPY-FORMULA"), SubLObjectFactory.makeSymbol("COTEMPORAL?"), SubLObjectFactory.makeSymbol("CPUSHNEW"), SubLObjectFactory.makeSymbol("CSOME"), SubLObjectFactory.makeSymbol("CURRENT-CONTROLLING-INFERENCE"), SubLObjectFactory.makeSymbol("CURRENT-MT-RELEVANCE-MT"), SubLObjectFactory.makeSymbol("CURRENT-REWRITE-MT"), SubLObjectFactory.makeSymbol("CURRENTLY-ACTIVE-PROBLEM"), SubLObjectFactory.makeSymbol("CURRENTLY-ACTIVE-PROBLEM-STORE"), SubLObjectFactory.makeSymbol("CVS-ID"), SubLObjectFactory.makeSymbol("CYC-EVALUATE"), SubLObjectFactory.makeSymbol("CYC-FIND-OR-CREATE-NART"), SubLObjectFactory.makeSymbol("CYCL-PROBLEM-DECODE"), SubLObjectFactory.makeSymbol("CYCL-PROBLEM-STORE-DECODE"), SubLObjectFactory.makeSymbol("CYCL-SENTENCE-P"), SubLObjectFactory.makeSymbol("CYCL-SUBL-SYMBOL-SYMBOL"), SubLObjectFactory.makeSymbol("CYCL-TERM-P"), SubLObjectFactory.makeSymbol("DATE-KB-LOADED-P"), SubLObjectFactory.makeSymbol("DECLARE-CYC-TEST-FILE"), SubLObjectFactory.makeSymbol("DEDUCTION-SUPPORTS"), SubLObjectFactory.makeSymbol("DEFAULT-EL-VAR?"), SubLObjectFactory.makeSymbol("DEFAULT-REFORMULATOR-MODE-PRECEDENCE"), SubLObjectFactory.makeSymbol("DEFGLOBAL-PRIVATE"), SubLObjectFactory.makeSymbol("DEFINE-EVALUATABLE-FUNCTION-TEST"), SubLObjectFactory.makeSymbol("DEFINE-EVALUATABLE-PREDICATE-TEST"), SubLObjectFactory.makeSymbol("DEFINE-INFERENCE-UNIT-TEST"), SubLObjectFactory.makeSymbol("DEFINE-REMOVAL-MODULE-COST-TEST"), SubLObjectFactory.makeSymbol("DEFINE-REMOVAL-MODULE-TEST"), SubLObjectFactory.makeSymbol("DEFINE-SIMPLE-EVALUATABLE-FUNCTION-TEST-BLOCK"), SubLObjectFactory.makeSymbol("DEFINE-SIMPLE-EVALUATABLE-PREDICATE-TEST-BLOCK"), SubLObjectFactory.makeSymbol("DEFINE-SUBTEST"), SubLObjectFactory.makeSymbol("DEFINE-TRANSFORMATION-MODULE-TEST"), SubLObjectFactory.makeSymbol("DEFLEXICAL-PRIVATE"), SubLObjectFactory.makeSymbol("DEFNS"), SubLObjectFactory.makeSymbol("DEFPARAMETER"), SubLObjectFactory.makeSymbol("DEFPARAMETER-PRIVATE"), SubLObjectFactory.makeSymbol("DELETE-FILE"), SubLObjectFactory.makeSymbol("DENOT-WS-LOOKUP"), SubLObjectFactory.makeSymbol("DENOTS-OF-ABBREVIATION-STRING"), SubLObjectFactory.makeSymbol("DENOTS-OF-COMPLEX-WORD-STRING"), SubLObjectFactory.makeSymbol("DENOTS-OF-NAME-STRING"), SubLObjectFactory.makeSymbol("DENOTS-OF-PARTIAL-STRING"), SubLObjectFactory.makeSymbol("DENOTS-OF-STRING&POS"), SubLObjectFactory.makeSymbol("DENOTS-OF-STRING&PRED"), SubLObjectFactory.makeSymbol("DEPENDENT-NARTS"), SubLObjectFactory.makeSymbol("DEREGISTER-SKSI-HL-STORAGE-MODULES-FOR-SKS"), SubLObjectFactory.makeSymbol("DEREGISTER-SKSI-REMOVAL-MODULES-FOR-SKS"), SubLObjectFactory.makeSymbol("DESTROY-ALL-PROBLEM-STORES"), SubLObjectFactory.makeSymbol("DESTROY-INFERENCE"), SubLObjectFactory.makeSymbol("DESTROY-PROBLEM-STORE"), SubLObjectFactory.makeSymbol("DESTROYING-NEW-PPH-PHRASES-WHEN-DONE"), SubLObjectFactory.makeSymbol("DETERMINE-DENOTATION-PREDS"), SubLObjectFactory.makeSymbol("DISJOIN"), SubLObjectFactory.makeSymbol("DNF-AND-MT-TO-HL-QUERY"), SubLObjectFactory.makeSymbol("DO-INDEXED-TERMS"), SubLObjectFactory.makeSymbol("DO-INTERMEDIATE-INDEX"), SubLObjectFactory.makeSymbol("DO-PREDICATE-EXTENT-INDEX"), SubLObjectFactory.makeSymbol("DO-PROBLEM-STORE-LINKS"), SubLObjectFactory.makeSymbol("DO-PROBLEM-STORE-PROBLEMS"), SubLObjectFactory.makeSymbol("DO-PROBLEM-TACTICS"), SubLObjectFactory.makeSymbol("DOUBLETON?"), SubLObjectFactory.makeSymbol("DUPLICATE-NART-TUPLES"), SubLObjectFactory.makeSymbol("EL-BINARY-FORMULA-P"), SubLObjectFactory.makeSymbol("EL-CONTRACTION"), SubLObjectFactory.makeSymbol("EL-EXPAND-ALL"), SubLObjectFactory.makeSymbol("EL-FIND-NART"), SubLObjectFactory.makeSymbol("EL-UNARY-FORMULA-P"), SubLObjectFactory.makeSymbol("EL-VERSION"), SubLObjectFactory.makeSymbol("EL-WFE?"), SubLObjectFactory.makeSymbol("EL-WFF-ASSERTIBLE?"), SubLObjectFactory.makeSymbol("EL-WFT?"), SubLObjectFactory.makeSymbol("EL-ZERO-ARITY-FORMULA-P"), SubLObjectFactory.makeSymbol("ENDS-AFTER-ENDING-OF?"), SubLObjectFactory.makeSymbol("ENDS-AFTER-STARTING-OF?"), SubLObjectFactory.makeSymbol("ENDS-DURING?"), SubLObjectFactory.makeSymbol("ENDS-WITH"), SubLObjectFactory.makeSymbol("EQUAL-WRT-SVM"), SubLObjectFactory.makeSymbol("ASSERTION-FI-FORMULA"), SubLObjectFactory.makeSymbol("EQUALS-EL?"), SubLObjectFactory.makeSymbol("EXPRESSION-FIND"), SubLObjectFactory.makeSymbol("EXPRESSION-FIND-IF"), SubLObjectFactory.makeSymbol("EXPRESSION-GATHER"), SubLObjectFactory.makeSymbol("EXPRESSION-NSUBLIS"), SubLObjectFactory.makeSymbol("EXPRESSION-NSUBST"), SubLObjectFactory.makeSymbol("EXPRESSION-NTRANSFORM"), SubLObjectFactory.makeSymbol("EXPRESSION-SUBLIS"), SubLObjectFactory.makeSymbol("EXPRESSION-SUBST"), SubLObjectFactory.makeSymbol("EXPRESSION-TRANSFORM"), SubLObjectFactory.makeSymbol("EXTRACT-EL-CLAUSES"), SubLObjectFactory.makeSymbol("FAILING-IT-FORM-IDENTIFIER"), SubLObjectFactory.makeSymbol("FAST-DELETE-DUPLICATES"), SubLObjectFactory.makeSymbol("FAST-SKOLEM-NART?"), SubLObjectFactory.makeSymbol("FI-CREATE-INT"), SubLObjectFactory.makeSymbol("FI-KILL-INT"), SubLObjectFactory.makeSymbol("FI-REASSERT-INT"), SubLObjectFactory.makeSymbol("FI-RENAME-INT"), SubLObjectFactory.makeSymbol("FI-RENAME-VARIABLES-INT"), SubLObjectFactory.makeSymbol("FI-UNASSERT-INT"), SubLObjectFactory.makeSymbol("ASSERTION-FI-FORMULA"), SubLObjectFactory.makeSymbol("FIMPLIES"), SubLObjectFactory.makeSymbol("FIND-ALL-MATCHES-FOR-REGULAR-EXPRESSION"), SubLObjectFactory.makeSymbol("FIND-ASSERTION-CYCL"), SubLObjectFactory.makeSymbol("FIND-ASSERTIONS-CYCL"), SubLObjectFactory.makeSymbol("FIND-ASSERTIONS-VIA-TL"), SubLObjectFactory.makeSymbol("FIND-CONSTANT-BY-GUID"), SubLObjectFactory.makeSymbol("FIND-CONSTANT-BY-NAME"), SubLObjectFactory.makeSymbol("FIND-IF-NOT"), SubLObjectFactory.makeSymbol("FIND-INFERENCE-ANSWER-BY-ID"), SubLObjectFactory.makeSymbol("FIND-INFERENCE-BY-IDS"), SubLObjectFactory.makeSymbol("FIND-OR-CREATE-ASSERTION"), SubLObjectFactory.makeSymbol("FIND-PREVIOUS-INFERENCE-PROBLEM-BY-EL-ASENT"), SubLObjectFactory.makeSymbol("FIND-PROBLEM-BY-EL-QUERY"), SubLObjectFactory.makeSymbol("FIND-PROBLEM-BY-ID"), SubLObjectFactory.makeSymbol("FIND-PROBLEM-BY-QUERY"), SubLObjectFactory.makeSymbol("FIND-PROOF-BY-ID"), SubLObjectFactory.makeSymbol("FIND-REFORMULATOR-RULE-FOR-RULE-ASSERTION"), SubLObjectFactory.makeSymbol("FIND-STRATEGY-BY-ID"), SubLObjectFactory.makeSymbol("FIND-VISIBLE-ASSERTION-CYCL"), SubLObjectFactory.makeSymbol("FIND-VISIBLE-ASSERTIONS-CYCL"), SubLObjectFactory.makeSymbol("FIRST-CHAR"), SubLObjectFactory.makeSymbol("FIRST-OF"), SubLObjectFactory.makeSymbol("FMAKUNBOUND"), SubLObjectFactory.makeSymbol("FORM-VERIFY"), SubLObjectFactory.makeSymbol("FORMULA-ARGS"), SubLObjectFactory.makeSymbol("FORMULA-ARGS-OK-WRT-TYPE?"), SubLObjectFactory.makeSymbol("FORMULA-ARITY>"), SubLObjectFactory.makeSymbol("FORMULA-VARIABLES-ARG-CONSTRAINTS"), SubLObjectFactory.makeSymbol("FWHEN"), SubLObjectFactory.makeSymbol("GAF-ARG"), SubLObjectFactory.makeSymbol("GAF-CNF-LITERAL"), SubLObjectFactory.makeSymbol("GAF-FORMULA"), SubLObjectFactory.makeSymbol("GAF-OK-WRT-ANTI-TRANSITIVE-PRED?"), SubLObjectFactory.makeSymbol("GATHER-PREDICATE-RULE-INDEX-IN-ALL-MTS"), SubLObjectFactory.makeSymbol("GENERATE-DISAMBIGUATION-PHRASES"), SubLObjectFactory.makeSymbol("GENERATE-GENFORMAT-ARG"), SubLObjectFactory.makeSymbol("GENERATE-QUESTION"), SubLObjectFactory.makeSymbol("GENERATE-REGULAR-STRING"), SubLObjectFactory.makeSymbol("GENERATE-SPEECH-ACT"), SubLObjectFactory.makeSymbol("GENERATE-TEXT"), SubLObjectFactory.makeSymbol("GENLS?"), SubLObjectFactory.makeSymbol("GET-CYCLS-FOR-STRING-ESCALATING"), SubLObjectFactory.makeSymbol("GET-NL-TRIE"), SubLObjectFactory.makeSymbol("GET-STRINGS-OF-TYPE"), SubLObjectFactory.makeSymbol("GET-VARIABLE"), SubLObjectFactory.makeSymbol("GT-INFERIOR?"), SubLObjectFactory.makeSymbol("GT-SUPERIOR-IN-WHAT-MTS"), SubLObjectFactory.makeSymbol("GT-SUPERIOR?"), SubLObjectFactory.makeSymbol("GTM"), SubLObjectFactory.makeSymbol("HL-MODULE-NAME"), SubLObjectFactory.makeSymbol("HL-TO-EL"), SubLObjectFactory.makeSymbol("HL-VAR-FOR-DEFAULT-EL-VAR"), SubLObjectFactory.makeSymbol("HL-WFF?"), SubLObjectFactory.makeSymbol("HLMT-EQUAL"), SubLObjectFactory.makeSymbol("HTML-GENERATE-PHRASE"), SubLObjectFactory.makeSymbol("HTML-GENERATE-TEXT"), SubLObjectFactory.makeSymbol("INFERENCE-ABORT"), SubLObjectFactory.makeSymbol("INFERENCE-ANSWER-BINDINGS-EQUAL?"), SubLObjectFactory.makeSymbol("INFERENCE-ANSWER-JUSTIFICATION-PROOFS"), SubLObjectFactory.makeSymbol("INFERENCE-ANSWER-JUSTIFICATIONS"), SubLObjectFactory.makeSymbol("INFERENCE-ANSWER-P"), SubLObjectFactory.makeSymbol("INFERENCE-ANSWERS-TO-BINDINGS"), SubLObjectFactory.makeSymbol("INFERENCE-CANONICALIZE-ASK-INT"), SubLObjectFactory.makeSymbol("INFERENCE-COMPLETELY-ASSERTED-ASENT-GAFS"), SubLObjectFactory.makeSymbol("INFERENCE-COMPLETELY-DECIDABLE-ASENT-GAFS"), SubLObjectFactory.makeSymbol("INFERENCE-COMPLETELY-ENUMERABLE-ASENT-GAFS"), SubLObjectFactory.makeSymbol("INFERENCE-ERROR-SUSPEND-STATUS-P"), SubLObjectFactory.makeSymbol("INFERENCE-HL-MTS"), SubLObjectFactory.makeSymbol("INFERENCE-INTERRUPT"), SubLObjectFactory.makeSymbol("INFERENCE-P"), SubLObjectFactory.makeSymbol("INFERENCE-PROBLEM-STORE"), SubLObjectFactory.makeSymbol("INFERENCE-REWRITE-MODULE"), SubLObjectFactory.makeSymbol("INFERENCE-ROOT-PROBLEM"), SubLObjectFactory.makeSymbol("INFERENCE-SOME-SPEC-PRED-OR-INVERSE?"), SubLObjectFactory.makeSymbol("INFERENCE-SUID"), SubLObjectFactory.makeSymbol("INITIALIZE-ALL-SBHL-CACHING"), SubLObjectFactory.makeSymbol("INITIALIZE-INFERENCE-TEST-CARDINALITIES"), SubLObjectFactory.makeSymbol("INITIALIZE-NL-TRIE-ROTATION-INDEX"), SubLObjectFactory.makeSymbol("INTERMEDIATE-INDEX-KEYS"), SubLObjectFactory.makeSymbol("INTERMEDIATE-INDEX-LOOKUP"), SubLObjectFactory.makeSymbol("INTERMEDIATE-INDEX-P"), SubLObjectFactory.makeSymbol("INTERSECT?"), SubLObjectFactory.makeSymbol("INTERVAL-TOKEN-VALUE"), SubLObjectFactory.makeSymbol("IS-REGULAR-EXPRESSIONS-SUPPORT-AVAILABLE?"), SubLObjectFactory.makeSymbol("KE-UNASSERT-ASSERTION-NOW"), SubLObjectFactory.makeSymbol("KEYWORD-FOR-POS"), SubLObjectFactory.makeSymbol("LEGACY-B-VERIFY"), SubLObjectFactory.makeSymbol("LEGACY-BINDING-VERIFY"), SubLObjectFactory.makeSymbol("LEGACY-VERIFY-NOT"), SubLObjectFactory.makeSymbol("LENGTH="), SubLObjectFactory.makeSymbol("LENGTH>="), SubLObjectFactory.makeSymbol("LOAD-PARTITION"), SubLObjectFactory.makeSymbol("M-VERIFY"), SubLObjectFactory.makeSymbol("MAKE-BINARY-FORMULA"), SubLObjectFactory.makeSymbol("MAKE-CONJUNCTION"), SubLObjectFactory.makeSymbol("MAKE-DISJUNCTION"), SubLObjectFactory.makeSymbol("MAKE-EL-FORMULA"), SubLObjectFactory.makeSymbol("MAKE-EL-VAR"), SubLObjectFactory.makeSymbol("MAKE-EXISTENTIAL"), SubLObjectFactory.makeSymbol("MAKE-EXISTENTIAL-EXACT"), SubLObjectFactory.makeSymbol("MAKE-EXISTENTIAL-MAX"), SubLObjectFactory.makeSymbol("MAKE-EXISTENTIAL-MIN"), SubLObjectFactory.makeSymbol("MAKE-FORMULA"), SubLObjectFactory.makeSymbol("MAKE-GAF-CNF"), SubLObjectFactory.makeSymbol("MAKE-PROCESS-WITH-ARGS"), SubLObjectFactory.makeSymbol("MAKE-SET-FROM-LIST"), SubLObjectFactory.makeSymbol("MAKE-SYMBOL"), SubLObjectFactory.makeSymbol("MAKE-TERNARY-FORMULA"), SubLObjectFactory.makeSymbol("MAKE-UNARY-FORMULA"), SubLObjectFactory.makeSymbol("MAKE-UNUSED-TEMP-FILENAME"), SubLObjectFactory.makeSymbol("MAL-VARIABLES"), SubLObjectFactory.makeSymbol("MAPEXP"), SubLObjectFactory.makeSymbol("MAPPED-PROBLEM-PROBLEM"), SubLObjectFactory.makeSymbol("MAPPED-PROBLEM-VARIABLE-MAP"), SubLObjectFactory.makeSymbol("MAX-FLOOR-MTS-OF-GENL-PRED-PATHS"), SubLObjectFactory.makeSymbol("MAX-FLOOR-MTS-OF-NAT"), SubLObjectFactory.makeSymbol("MAX-FLOOR-MTS-OF-NEGATION-INVERSE-PATHS"), SubLObjectFactory.makeSymbol("MAX-FLOOR-MTS-OF-NEGATION-PRED-PATHS"), SubLObjectFactory.makeSymbol("MAX-NEGATION-INVERSES"), SubLObjectFactory.makeSymbol("MAXIMIZING-PPH-LINKS"), SubLObjectFactory.makeSymbol("MDW?"), SubLObjectFactory.makeSymbol("MIN-GENL-MTS"), SubLObjectFactory.makeSymbol("MIN-MTS-OF-GENL-INVERSE-PATHS"), SubLObjectFactory.makeSymbol("MIN-MTS-OF-GENL-PRED-PATHS"), SubLObjectFactory.makeSymbol("MIN-MTS-OF-GENLS-PATHS"), SubLObjectFactory.makeSymbol("MIN-MTS-OF-ISA-PATHS"), SubLObjectFactory.makeSymbol("MIN-MTS-OF-NEGATION-INVERSE-PATHS"), SubLObjectFactory.makeSymbol("MIN-MTS-OF-NEGATION-PRED-PATHS"), SubLObjectFactory.makeSymbol("NAT-ARG1"), SubLObjectFactory.makeSymbol("NAT-ARG2"), SubLObjectFactory.makeSymbol("NAT-FUNCTION"), SubLObjectFactory.makeSymbol("NAT-FUNCTOR"), SubLObjectFactory.makeSymbol("NAUT-TO-NART"), SubLObjectFactory.makeSymbol("NEGATION-INVERSE?"), SubLObjectFactory.makeSymbol("NEGATION-PRED?"), SubLObjectFactory.makeSymbol("NEGATION-PREDS"), SubLObjectFactory.makeSymbol("NEW-CONTINUABLE-INFERENCE"), SubLObjectFactory.makeSymbol("NEW-INFERENCE-ERROR-SUSPEND-STATUS"), SubLObjectFactory.makeSymbol("NEW-PROBLEM-STORE"), SubLObjectFactory.makeSymbol("NEW-SET"), SubLObjectFactory.makeSymbol("NEXT-AVAILABLE-WS"), SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY-DENOTS"), SubLObjectFactory.makeSymbol("NL-TRIE-INDEX-ITEM-TERM"), SubLObjectFactory.makeSymbol("NL-TRIE-MATCHING-PHRASES"), SubLObjectFactory.makeSymbol("NL-TRIE-ROTATION-INDEX-INITIALIZED?"), SubLObjectFactory.makeSymbol("NL-TRIE-SEARCH"), SubLObjectFactory.makeSymbol("NL-TRIE-SEMTRANS-TEMPLATES-OF-STRING"), SubLObjectFactory.makeSymbol("NL-TRIE-SENTENCE-TOKENIZE"), SubLObjectFactory.makeSymbol("NON-EMPTY-STRING?"), SubLObjectFactory.makeSymbol("NON-HL-PREDICATE-P"), SubLObjectFactory.makeSymbol("NOT-ENDS-AFTER-ENDING-OF?"), SubLObjectFactory.makeSymbol("NOT-ENDS-AFTER-STARTING-OF?"), SubLObjectFactory.makeSymbol("NOT-EQ"), SubLObjectFactory.makeSymbol("NOT-GENLS?"), SubLObjectFactory.makeSymbol("NOT-MDW?"), SubLObjectFactory.makeSymbol("NOT-STARTS-AFTER-ENDING-OF?"), SubLObjectFactory.makeSymbol("NOT-STARTS-AFTER-STARTING-OF?"), SubLObjectFactory.makeSymbol("NTH-VALUE"), SubLObjectFactory.makeSymbol("NUM-INDEX-SLOW"), SubLObjectFactory.makeSymbol("NUMBER"), SubLObjectFactory.makeSymbol("OBJECT-TO-STRING"), SubLObjectFactory.makeSymbol("ORDERED-LEXIFICATION-PREDS-FOR-KEYWORD"), SubLObjectFactory.makeSymbol("ORDERED-LEXIFICATION-PREDS-OF-STRING"), SubLObjectFactory.makeSymbol("ORDERED-STRINGS-OF-WORD-UNIT"), SubLObjectFactory.makeSymbol("ORDERED-WORD-VARIANTS"), SubLObjectFactory.makeSymbol("OVERLAPS-START?"), SubLObjectFactory.makeSymbol("PAD-TABLE-INITIALIZED?"), SubLObjectFactory.makeSymbol("PARAMETERIZED-TEST-VALUE"), SubLObjectFactory.makeSymbol("PARSE-LEXICAL-SEMANTIC-FORMULA"), SubLObjectFactory.makeSymbol("PIF-FEATURE"), SubLObjectFactory.makeSymbol("PLACEHOLDER-DENOTS-OF-SENSE"), SubLObjectFactory.makeSymbol("POS-FOR-KEYWORD"), SubLObjectFactory.makeSymbol("POS-LIT-VARIABLE-GENL-CONSTRAINTS"), SubLObjectFactory.makeSymbol("POS-LIT-VARIABLE-INTER-ARG-GENL-CONSTRAINTS"), SubLObjectFactory.makeSymbol("POS-LIT-VARIABLE-INTER-ARG-ISA-CONSTRAINTS"), SubLObjectFactory.makeSymbol("POS-LIT-VARIABLE-ISA-CONSTRAINTS"), SubLObjectFactory.makeSymbol("POS-OF-STRING"), SubLObjectFactory.makeSymbol("POS-OF-STRING&WORD"), SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P"), SubLObjectFactory.makeSymbol("POWERSET"), SubLObjectFactory.makeSymbol("PPH-IDENTIFY-TYPE"), SubLObjectFactory.makeSymbol("PPH-PHRASE-OUTPUT-LIST-STRING"), SubLObjectFactory.makeSymbol("PPH-SYMBOL-STRING"), SubLObjectFactory.makeSymbol("PRECISE-KEYWORD-FOR-POS"), SubLObjectFactory.makeSymbol("PREDS-FOR-KEYWORD"), SubLObjectFactory.makeSymbol("PREDS-OF-STRING"), SubLObjectFactory.makeSymbol("PREDS-OF-STRING&WORD"), SubLObjectFactory.makeSymbol("PRINT-DICTIONARY-CONTENTS"), SubLObjectFactory.makeSymbol("PRINT-FAILING-FORM"), SubLObjectFactory.makeSymbol("PRINT-JUSTIFY"), SubLObjectFactory.makeSymbol("PRINT-TMS-FORMULA"), SubLObjectFactory.makeSymbol("PRINT-TMS-MT"), SubLObjectFactory.makeSymbol("PRINT-UNASSERT"), SubLObjectFactory.makeSymbol("PRINTED-FORMS-EQUAL?"), SubLObjectFactory.makeSymbol("PROBLEM-ARGUMENT-LINK-COUNT"), SubLObjectFactory.makeSymbol("PROBLEM-DEPENDENT-LINK-COUNT"), SubLObjectFactory.makeSymbol("PROBLEM-DISCARDED-TACTIC-COUNT"), SubLObjectFactory.makeSymbol("PROBLEM-EXECUTED-TACTIC-COUNT"), SubLObjectFactory.makeSymbol("PROBLEM-EXECUTED-TACTICS"), SubLObjectFactory.makeSymbol("PROBLEM-HAS-TACTIC-OF-TYPE-WITH-STATUS?"), SubLObjectFactory.makeSymbol("PROBLEM-LINK-SUPPORTED-PROBLEM"), SubLObjectFactory.makeSymbol("PROBLEM-QUERY-SOLE-CLAUSE"), SubLObjectFactory.makeSymbol("PROBLEM-RELEVANT-TO-INFERENCE?"), SubLObjectFactory.makeSymbol("PROBLEM-STORE"), SubLObjectFactory.makeSymbol("PROBLEM-STORE-FIRST-LINK-OF-TYPE"), SubLObjectFactory.makeSymbol("PROBLEM-STORE-REJECTED-PROOF-COUNT"), SubLObjectFactory.makeSymbol("PROBLEM-STORE-RESIDUAL-TRANSFORMATION-LINK-COUNT"), SubLObjectFactory.makeSymbol("PROBLEM-STORE-RESTRICTION-LINK-COUNT"), SubLObjectFactory.makeSymbol("PROBLEM-STORE-REWRITE-LINK-COUNT"), SubLObjectFactory.makeSymbol("PROBLEM-STORE-STRATEGY-COUNT"), SubLObjectFactory.makeSymbol("PROBLEM-STORE-SUID"), SubLObjectFactory.makeSymbol("PROBLEM-STORE-TACTIC-OF-TYPE-WITH-STATUS-COUNT"), SubLObjectFactory.makeSymbol("PROOF-REJECTED?"), SubLObjectFactory.makeSymbol("PUTF"), SubLObjectFactory.makeSymbol("PWHEN-FEATURE"), SubLObjectFactory.makeSymbol("QUERY-PROPERTIES-FROM-LEGACY-ASK-PARAMETERS"), SubLObjectFactory.makeSymbol("READ-LINE"), SubLObjectFactory.makeSymbol("REBUILD-MODULE-TESTS"), SubLObjectFactory.makeSymbol("RECLASSIFY-REMOVAL-MODULES"), SubLObjectFactory.makeSymbol("REDECLARE-INFERENCE-REMOVAL-MODULE"), SubLObjectFactory.makeSymbol("REFORMULATE-CYCL"), SubLObjectFactory.makeSymbol("REGISTER-SKSI-HL-STORAGE-MODULES-FOR-SKS"), SubLObjectFactory.makeSymbol("REGISTER-SKSI-REMOVAL-MODULES-FOR-SKS"), SubLObjectFactory.makeSymbol("REIFIABLE-FUNCTION-TERM?"), SubLObjectFactory.makeSymbol("REIFIABLE-FUNCTOR?"), SubLObjectFactory.makeSymbol("REIFIED-SKOLEM-FN?"), SubLObjectFactory.makeSymbol("RELATED-DENOTS-OF-SENSE"), SubLObjectFactory.makeSymbol("RELATION-VARIABLE-GENL-CONSTRAINTS"), SubLObjectFactory.makeSymbol("RELATION-VARIABLE-INTER-ARG-GENL-CONSTRAINTS"), SubLObjectFactory.makeSymbol("RELATION-VARIABLE-INTER-ARG-ISA-CONSTRAINTS"), SubLObjectFactory.makeSymbol("RELATION-VARIABLE-ISA-CONSTRAINTS"), SubLObjectFactory.makeSymbol("RELATIONAL-NOUN-POSSESSED-ARGNUMS"), SubLObjectFactory.makeSymbol("REMOVE-IF-NOT"), SubLObjectFactory.makeSymbol("RESIDUAL-TRANSFORMATION-LINK-SUPPORTING-MAPPED-PROBLEM"), SubLObjectFactory.makeSymbol("RESIDUAL-TRANSFORMATION-LINK-SUPPORTING-PROBLEM"), SubLObjectFactory.makeSymbol("RESTRICTION-REWRITE-ADD-LINK"), SubLObjectFactory.makeSymbol("RESULT-GENL"), SubLObjectFactory.makeSymbol("RESULT-INTER-ARG-GENL-RELN"), SubLObjectFactory.makeSymbol("RESULT-INTER-ARG-ISA-RELN"), SubLObjectFactory.makeSymbol("RETURN-UNCANON"), SubLObjectFactory.makeSymbol("REWRITE-ADD-LINK"), SubLObjectFactory.makeSymbol("REWRITE-LINK-TACTIC"), SubLObjectFactory.makeSymbol("STRENGTHEN-PREDICATE-W/TYPED-AND-ALL-SUGGESTIONS"), SubLObjectFactory.makeSymbol("STRENGTHEN-PREDICATE-W/TYPED-AND-MINIMAL-SUGGESTIONS"), SubLObjectFactory.makeSymbol("STRENGTHEN-PREDICATE-W/TYPED-LINKS-ONLY"), SubLObjectFactory.makeSymbol("STRENGTHENED-PREDS"), SubLObjectFactory.makeSymbol("TYPED-PRED-STRENGTHEN-FORMULA"), SubLObjectFactory.makeSymbol("RSUBLIS"), SubLObjectFactory.makeSymbol("RULES-MENTIONING"), SubLObjectFactory.makeSymbol("RUN-ALL-CYC-TESTS"), SubLObjectFactory.makeSymbol("RUN-EVALUATABLE-RELATION-TESTS"), SubLObjectFactory.makeSymbol("RUN-TEST-CASE-TABLES-OF-CLASS"), SubLObjectFactory.makeSymbol("RUN-TEST-SUITE"), SubLObjectFactory.makeSymbol("SAFE-FI"), SubLObjectFactory.makeSymbol("SAMPLE-DIFFERENT-LEAF-INSTANCES"), SubLObjectFactory.makeSymbol("SAMPLE-DIFFERENT-LEAF-SPECS"), SubLObjectFactory.makeSymbol("SAMPLE-LEAF-INSTANCES"), SubLObjectFactory.makeSymbol("SAVE-PARTITION"), SubLObjectFactory.makeSymbol("SBHL-CACHED-PREDICATE-RELATION-P"), SubLObjectFactory.makeSymbol("SBHL-CACHED-RELATIONS-FOR-NODE"), SubLObjectFactory.makeSymbol("SBHL-MARKED-NODES"), SubLObjectFactory.makeSymbol("SDC"), SubLObjectFactory.makeSymbol("SDC?"), SubLObjectFactory.makeSymbol("SEMANTICALLY-WF-LITERAL?"), SubLObjectFactory.makeSymbol("SENTENCE-ASSERTIONS"), SubLObjectFactory.makeSymbol("SENTENCE-ASSERTIONS-IN-MT"), SubLObjectFactory.makeSymbol("SENTENCE-FREE-SEQUENCE-VARIABLES"), SubLObjectFactory.makeSymbol("SENTENCE-FREE-VARIABLES"), SubLObjectFactory.makeSymbol("SENTENCE-VARIABLES"), SubLObjectFactory.makeSymbol("SET"), SubLObjectFactory.makeSymbol("SET-ADD"), SubLObjectFactory.makeSymbol("SET-ASSERTION-ASSERTED-BY"), SubLObjectFactory.makeSymbol("SET-ASSERTION-ASSERTED-SECOND"), SubLObjectFactory.makeSymbol("SETHASH"), SubLObjectFactory.makeSymbol("SETS-EQUAL-EQUAL?"), SubLObjectFactory.makeSymbol("SETS-EQUAL?"), SubLObjectFactory.makeSymbol("SIMPLE-INDEX-P"), SubLObjectFactory.makeSymbol("SIMPLEST-INFERENCE-STRATEGY"), SubLObjectFactory.makeSymbol("SIMPLIFY-TRANSITIVE-REDUNDANCIES"), SubLObjectFactory.makeSymbol("SINGLE-LITERAL-PROBLEM-ATOMIC-SENTENCE"), SubLObjectFactory.makeSymbol("SINGLETON?"), SubLObjectFactory.makeSymbol("SKOLEM-DEFN-ASSERTIONS"), SubLObjectFactory.makeSymbol("SKOLEM-FUNCTION-P"), SubLObjectFactory.makeSymbol("SKOLEM-FUNCTION?"), SubLObjectFactory.makeSymbol("SKOLEM-NART?"), SubLObjectFactory.makeSymbol("SKOLEM-RULE-HOSED?"), SubLObjectFactory.makeSymbol("SOME-GENL-PRED-OR-INVERSE?"), SubLObjectFactory.makeSymbol("SOME-NEGATION-PRED-OR-INVERSE?"), SubLObjectFactory.makeSymbol("SOME-SPEC-PRED-OR-INVERSE?"), SubLObjectFactory.makeSymbol("SPEC-POS-PRED?"), SubLObjectFactory.makeSymbol("STARTS-AFTER-ENDING-OF?"), SubLObjectFactory.makeSymbol("STARTS-AFTER-STARTING-OF?"), SubLObjectFactory.makeSymbol("STARTS-DURING?"), SubLObjectFactory.makeSymbol("STARTS-WITH"), SubLObjectFactory.makeSymbol("STRATEGICALLY-FINISHED-PROBLEM-P"), SubLObjectFactory.makeSymbol("STRATEGICALLY-NO-GOOD-PROBLEM-P"), SubLObjectFactory.makeSymbol("STRING-IS-POS-ON-WU?"), SubLObjectFactory.makeSymbol("STRING-TOKEN-VALUE"), SubLObjectFactory.makeSymbol("STRINGS-OF-WORD-UNIT"), SubLObjectFactory.makeSymbol("SUBINDEX-LEAF-COUNT"), SubLObjectFactory.makeSymbol("SUBINDEX-LEAVES"), SubLObjectFactory.makeSymbol("SUBINDEX-P"), SubLObjectFactory.makeSymbol("SUBL-ESCAPE-P"), SubLObjectFactory.makeSymbol("SUBL-STRING-P"), SubLObjectFactory.makeSymbol("SUBSTRING?"), SubLObjectFactory.makeSymbol("SUF-DEFN?"), SubLObjectFactory.makeSymbol("SUPERSETP"), SubLObjectFactory.makeSymbol("TACTIC-HL-MODULE"), SubLObjectFactory.makeSymbol("TACTIC-HL-MODULE-NAME"), SubLObjectFactory.makeSymbol("TACTICALLY-FINISHED-PROBLEM-P"), SubLObjectFactory.makeSymbol("TACTICALLY-NO-GOOD-PROBLEM-P"), SubLObjectFactory.makeSymbol("TACTICALLY-UNEXAMINED-PROBLEM-P"), SubLObjectFactory.makeSymbol("TEMPORAL-BOUNDS-CONTAIN?"), SubLObjectFactory.makeSymbol("TEMPORAL-BOUNDS-IDENTICAL?"), SubLObjectFactory.makeSymbol("TEMPORAL-BOUNDS-INTERSECT?"), SubLObjectFactory.makeSymbol("TEMPORALLY-COORIGINATING?"), SubLObjectFactory.makeSymbol("TEMPORALLY-COTERMINAL?"), SubLObjectFactory.makeSymbol("TEMPORALLY-FINISHED-BY?"), SubLObjectFactory.makeSymbol("TEMPORALLY-STARTED-BY?"), SubLObjectFactory.makeSymbol("TEMPORALLY-SUBSUMES?"), SubLObjectFactory.makeSymbol("TERM-INDEX"), SubLObjectFactory.makeSymbol("TERM-OF-UNIT"), SubLObjectFactory.makeSymbol("TERM-UNIFY"), SubLObjectFactory.makeSymbol("TEST-CANONICALIZE-ASSERT"), SubLObjectFactory.makeSymbol("TEST-CANONICALIZE-ASSERT-SENTENCE"), SubLObjectFactory.makeSymbol("TEST-ERROR"), SubLObjectFactory.makeSymbol("TEST-SUITE-DEFINED-P"), SubLObjectFactory.makeSymbol("TEST-VERIFY"), SubLObjectFactory.makeSymbol("TEST-VERIFY-NEW"), SubLObjectFactory.makeSymbol("THROW-UNEVALUATABLE"), SubLObjectFactory.makeSymbol("TIME"), SubLObjectFactory.makeSymbol("TRANSFORM"), SubLObjectFactory.makeSymbol("TREE-FIND"), SubLObjectFactory.makeSymbol("TREE-FIND-IF"), SubLObjectFactory.makeSymbol("TREE-GATHER"), SubLObjectFactory.makeSymbol("TREE-MATCHES-PATTERN"), SubLObjectFactory.makeSymbol("TYPED-DENOTS-OF-STRING-AT-PLACE"), SubLObjectFactory.makeSymbol("UNCANON-TEST"), SubLObjectFactory.makeSymbol("UNDECLARE-INFERENCE-REMOVAL-MODULE"), SubLObjectFactory.makeSymbol("UNKNOWN-ASSERTION?"), SubLObjectFactory.makeSymbol("UNWRAP-IF-IST-PERMISSIVE"), SubLObjectFactory.makeSymbol("USELESS-NART?"), SubLObjectFactory.makeSymbol("VALID-ASSERTION?"), SubLObjectFactory.makeSymbol("VALID-EL-VAR?"), SubLObjectFactory.makeSymbol("VALID-SBHL-LINKS-P"), SubLObjectFactory.makeSymbol("VAR-NAMES-IN-STRING"), SubLObjectFactory.makeSymbol("VARIABLE-LOOKUP"), SubLObjectFactory.makeSymbol("VERIFY-NOT"), SubLObjectFactory.makeSymbol("WHY-NOT-QUERY-OK"), SubLObjectFactory.makeSymbol("WHY-NOT-SEMANTICALLY-WF-WRT-TYPES"), SubLObjectFactory.makeSymbol("WHY-NOT-WFF"), SubLObjectFactory.makeSymbol("WHY-NOT-WFF-ASK"), SubLObjectFactory.makeSymbol("WHY-NOT-WFF-ASSERT"), SubLObjectFactory.makeSymbol("WHY-NOT-WFT"), SubLObjectFactory.makeSymbol("WITH-ALL-PREDICATES"), SubLObjectFactory.makeSymbol("WITH-INFERENCE-ERROR-HANDLING"), SubLObjectFactory.makeSymbol("WITH-INFERENCE-MT-RELEVANCE"), SubLObjectFactory.makeSymbol("WITH-NL-TRIE-CASE-SENSITIVITY-OFF"), SubLObjectFactory.makeSymbol("WITH-NL-TRIE-CASE-SENSITIVITY-ON"), SubLObjectFactory.makeSymbol("WITH-PARAPHRASE-MAPPINGS"), SubLObjectFactory.makeSymbol("WITH-PPH-DEMERIT-CUTOFF"), SubLObjectFactory.makeSymbol("WITH-PPH-MEMOIZATION"), SubLObjectFactory.makeSymbol("WITH-PRECISE-PARAPHRASE-OFF"), SubLObjectFactory.makeSymbol("WITH-ALL-SPEC-PREDICATES"), SubLObjectFactory.makeSymbol("WITH-TEST-ASSERTION-LISTS"), SubLObjectFactory.makeSymbol("WITH-TEST-ASSERTIONS"), SubLObjectFactory.makeSymbol("WITH-TEST-CONSTANTS"), SubLObjectFactory.makeSymbol("WITH-TEXT-FILE"), SubLObjectFactory.makeSymbol("WITH-THE-CYCLIST"), SubLObjectFactory.makeSymbol("WITH-TVA-PRECOMPUTE-CLOSURE-THRESHOLD"), SubLObjectFactory.makeSymbol("WITHOUT-SBHL-CACHES"), SubLObjectFactory.makeSymbol("WITHOUT-UNLEXIFIED-TERM-DISCOVERY-LOGGING"), SubLObjectFactory.makeSymbol("WORD-HAS-POS?"), SubLObjectFactory.makeSymbol("WORD-VARIANTS"), SubLObjectFactory.makeSymbol("WORDS-OF-STRING&POS"), SubLObjectFactory.makeSymbol("WORDS-OF-STRING&PRED"), SubLObjectFactory.makeSymbol("WORDS-OF-STRING&SPEECH-PART") });
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
        module0810.$g6435$ = null;
        module0810.$g6436$ = null;
        module0810.$g6437$ = null;
        module0810.$g6438$ = null;
        module0810.$g6439$ = null;
        $ic0$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NONE"), (SubLObject)SubLObjectFactory.makeKeyword("LOW"), (SubLObject)SubLObjectFactory.makeKeyword("MEDIUM"), (SubLObject)SubLObjectFactory.makeKeyword("HIGH"));
        $ic1$ = SubLObjectFactory.makeSymbol("S#56414", "CYC");
        $ic2$ = SubLObjectFactory.makeSymbol("S#56415", "CYC");
        $ic3$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#56504", "CYC"), SubLObjectFactory.makeSymbol("S#56505", "CYC"), SubLObjectFactory.makeSymbol("S#56506", "CYC"), SubLObjectFactory.makeSymbol("S#56507", "CYC"), SubLObjectFactory.makeSymbol("S#56508", "CYC"), SubLObjectFactory.makeSymbol("S#56509", "CYC"), SubLObjectFactory.makeSymbol("S#56510", "CYC"), SubLObjectFactory.makeSymbol("S#56511", "CYC"), SubLObjectFactory.makeSymbol("S#56512", "CYC"), SubLObjectFactory.makeSymbol("S#56513", "CYC") });
        $ic4$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SECURITY-LEVEL"), SubLObjectFactory.makeKeyword("ID-MODULE-TABLE"), SubLObjectFactory.makeKeyword("MODULE-ID-TABLE"), SubLObjectFactory.makeKeyword("ID-METHOD-TABLE"), SubLObjectFactory.makeKeyword("METHOD-ID-TABLE"), SubLObjectFactory.makeKeyword("ID-GLOBAL-TABLE"), SubLObjectFactory.makeKeyword("GLOBAL-ID-TABLE"), SubLObjectFactory.makeKeyword("SYMBOL-EXCEPTIONS"), SubLObjectFactory.makeKeyword("ID-SYMBOL-TABLE"), SubLObjectFactory.makeKeyword("SYMBOL-ID-TABLE") });
        $ic5$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#56420", "CYC"), SubLObjectFactory.makeSymbol("S#56421", "CYC"), SubLObjectFactory.makeSymbol("S#56422", "CYC"), SubLObjectFactory.makeSymbol("S#56423", "CYC"), SubLObjectFactory.makeSymbol("S#56424", "CYC"), SubLObjectFactory.makeSymbol("S#56425", "CYC"), SubLObjectFactory.makeSymbol("S#56426", "CYC"), SubLObjectFactory.makeSymbol("S#56427", "CYC"), SubLObjectFactory.makeSymbol("S#56428", "CYC"), SubLObjectFactory.makeSymbol("S#56429", "CYC") });
        $ic6$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#56430", "CYC"), SubLObjectFactory.makeSymbol("S#56431", "CYC"), SubLObjectFactory.makeSymbol("S#56432", "CYC"), SubLObjectFactory.makeSymbol("S#56433", "CYC"), SubLObjectFactory.makeSymbol("S#56434", "CYC"), SubLObjectFactory.makeSymbol("S#56435", "CYC"), SubLObjectFactory.makeSymbol("S#56436", "CYC"), SubLObjectFactory.makeSymbol("S#56437", "CYC"), SubLObjectFactory.makeSymbol("S#56438", "CYC"), SubLObjectFactory.makeSymbol("S#56439", "CYC") });
        $ic7$ = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $ic8$ = SubLObjectFactory.makeSymbol("S#56419", "CYC");
        $ic9$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#56415", "CYC"));
        $ic10$ = SubLObjectFactory.makeSymbol("S#56420", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#56430", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#56421", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("S#56431", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("S#56422", "CYC");
        $ic15$ = SubLObjectFactory.makeSymbol("S#56432", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("S#56423", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("S#56433", "CYC");
        $ic18$ = SubLObjectFactory.makeSymbol("S#56424", "CYC");
        $ic19$ = SubLObjectFactory.makeSymbol("S#56434", "CYC");
        $ic20$ = SubLObjectFactory.makeSymbol("S#56425", "CYC");
        $ic21$ = SubLObjectFactory.makeSymbol("S#56435", "CYC");
        $ic22$ = SubLObjectFactory.makeSymbol("S#56426", "CYC");
        $ic23$ = SubLObjectFactory.makeSymbol("S#56436", "CYC");
        $ic24$ = SubLObjectFactory.makeSymbol("S#56427", "CYC");
        $ic25$ = SubLObjectFactory.makeSymbol("S#56437", "CYC");
        $ic26$ = SubLObjectFactory.makeSymbol("S#56428", "CYC");
        $ic27$ = SubLObjectFactory.makeSymbol("S#56438", "CYC");
        $ic28$ = SubLObjectFactory.makeSymbol("S#56429", "CYC");
        $ic29$ = SubLObjectFactory.makeSymbol("S#56439", "CYC");
        $ic30$ = SubLObjectFactory.makeKeyword("SECURITY-LEVEL");
        $ic31$ = SubLObjectFactory.makeKeyword("ID-MODULE-TABLE");
        $ic32$ = SubLObjectFactory.makeKeyword("MODULE-ID-TABLE");
        $ic33$ = SubLObjectFactory.makeKeyword("ID-METHOD-TABLE");
        $ic34$ = SubLObjectFactory.makeKeyword("METHOD-ID-TABLE");
        $ic35$ = SubLObjectFactory.makeKeyword("ID-GLOBAL-TABLE");
        $ic36$ = SubLObjectFactory.makeKeyword("GLOBAL-ID-TABLE");
        $ic37$ = SubLObjectFactory.makeKeyword("SYMBOL-EXCEPTIONS");
        $ic38$ = SubLObjectFactory.makeKeyword("ID-SYMBOL-TABLE");
        $ic39$ = SubLObjectFactory.makeKeyword("SYMBOL-ID-TABLE");
        $ic40$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic41$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic42$ = SubLObjectFactory.makeSymbol("S#56440", "CYC");
        $ic43$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic44$ = SubLObjectFactory.makeKeyword("END");
        $ic45$ = SubLObjectFactory.makeSymbol("S#56442", "CYC");
        $ic46$ = SubLObjectFactory.makeSymbol("S#56418", "CYC");
        $ic47$ = SubLObjectFactory.makeInteger(1500);
        $ic48$ = SubLObjectFactory.makeInteger(10000);
        $ic49$ = SubLObjectFactory.makeInteger(1000);
        $ic50$ = SubLObjectFactory.makeKeyword("FREE");
        $ic51$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MEDIUM"), (SubLObject)SubLObjectFactory.makeKeyword("HIGH"));
        $ic52$ = SubLObjectFactory.makeString("S");
        $ic53$ = SubLObjectFactory.makeString("US");
        $ic54$ = SubLObjectFactory.makeKeyword("HIGH");
        $ic55$ = SubLObjectFactory.makeString("#");
        $ic56$ = SubLObjectFactory.makeKeyword("OUTPUT");
        $ic57$ = SubLObjectFactory.makeString("Unable to open ~S");
        $ic58$ = SubLObjectFactory.makeString("c3edef08-eef1-11dd-9624-00219b50e0e5");
        $ic59$ = SubLObjectFactory.makeKeyword("TYPE");
        $ic60$ = SubLObjectFactory.makeKeyword("VERSION");
        $ic61$ = SubLObjectFactory.makeKeyword("COPYRIGHT");
        $ic62$ = SubLObjectFactory.makeKeyword("INPUT");
        $ic63$ = SubLObjectFactory.makeString("Invalid format: ~A cannot be interpreted as a secure ID database.~%");
        $ic64$ = SubLObjectFactory.makeString("");
        $ic65$ = SubLObjectFactory.makeString("Invalid format: The type ID is missing or invalid.~%");
        $ic66$ = SubLObjectFactory.makeSymbol("FIXNUMP");
        $ic67$ = SubLObjectFactory.makeString("Invalid format: ~A is not a valid version specification.~%");
        $ic68$ = ConsesLow.list((SubLObject)module0810.ONE_INTEGER, (SubLObject)module0810.ZERO_INTEGER);
        $ic69$ = SubLObjectFactory.makeString("Invalid format: ~A is not a known version specification.~%");
        $ic70$ = SubLObjectFactory.makeString("Invalid format: ~A is not a valid security level.~%");
        $ic71$ = SubLObjectFactory.makeString("Invalid format: ~A is not a valid symbol exceptions set.~%");
        $ic72$ = SubLObjectFactory.makeString("Invalid format: ~A is not a valid table mapping to ids of type ~A.");
        $ic73$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic74$ = SubLObjectFactory.makeSymbol("SYMBOLP");
        $ic75$ = SubLObjectFactory.makeSymbol("API-MUTABLE-GLOBAL-P");
        $ic76$ = SubLObjectFactory.makeString("CYC");
        $ic77$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("READER-WRITER-LOCK-P"), SubLObjectFactory.makeSymbol("RW-LOCK-P"), SubLObjectFactory.makeSymbol("NEW-RW-LOCK"), SubLObjectFactory.makeSymbol("RW-LOCK-NAME"), SubLObjectFactory.makeSymbol("RW-LOCK-SEIZE-READ-LOCK"), SubLObjectFactory.makeSymbol("RW-LOCK-SEIZE-WRITE-LOCK"), SubLObjectFactory.makeSymbol("RW-LOCK-RELEASE-READ-LOCK"), SubLObjectFactory.makeSymbol("RW-LOCK-RELEASE-WRITE-LOCK"), SubLObjectFactory.makeSymbol("SEMAPHORE-P"), SubLObjectFactory.makeSymbol("NEW-SEMAPHORE"), SubLObjectFactory.makeSymbol("SEMAPHORE-NAME"), SubLObjectFactory.makeSymbol("SEMAPHORE-SIGNAL"), SubLObjectFactory.makeSymbol("SEMAPHORE-CURRENT-COUNT"), SubLObjectFactory.makeSymbol("SEMAPHORE-WAIT"), SubLObjectFactory.makeSymbol("SEMAPHORE-DRAIN"), SubLObjectFactory.makeSymbol("SEMAPHORE-WAIT-WITH-TIMEOUT") });
        $ic78$ = _constant_78_initializer();
        $ic79$ = SubLObjectFactory.makeKeyword("EOF");
        $ic80$ = SubLObjectFactory.makeSymbol("FBOUNDP");
        $ic81$ = SubLObjectFactory.makeSymbol("STRING<");
        $ic82$ = SubLObjectFactory.makeSymbol("SYMBOL-NAME");
        $ic83$ = SubLObjectFactory.makeString("Stuck on ~A which is neither method nor macro.~%");
        $ic84$ = SubLObjectFactory.makeString("~%(in-package :cyc)~%");
        $ic85$ = SubLObjectFactory.makeString("~%(deflexical *unprovided-trampoline-arg* '|the unprovided trampoline argument|)~%");
        $ic86$ = SubLObjectFactory.makeString("~%(define ~A ");
        $ic87$ = SubLObjectFactory.makeSymbol("&OPTIONAL");
        $ic88$ = SubLObjectFactory.makeString(")~%~%");
        $ic89$ = SubLObjectFactory.makeString("~%(defmacro ~A (&rest rest)");
        $ic90$ = SubLObjectFactory.makeString("(ret `(");
        $ic91$ = SubLObjectFactory.makeString(" ,@rest)))");
        $ic92$ = SubLObjectFactory.makeString("(");
        $ic93$ = SubLObjectFactory.makeString(" ");
        $ic94$ = SubLObjectFactory.makeString("&optional");
        $ic95$ = SubLObjectFactory.makeString(" (");
        $ic96$ = SubLObjectFactory.makeString(" *unprovided-trampoline-arg*)");
        $ic97$ = SubLObjectFactory.makeString(")");
        $ic98$ = SubLObjectFactory.makeString("(ret (~A");
        $ic99$ = SubLObjectFactory.makeString("))");
        $ic100$ = SubLObjectFactory.makeString("(pcond");
        $ic101$ = SubLObjectFactory.makeString("((eq *unprovided-trampoline-arg* ");
        $ic102$ = SubLObjectFactory.makeString(") ");
        $ic103$ = SubLObjectFactory.makeString("(t ");
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
        private static final SubLStructDeclNative structDecl;
        
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
            structDecl = Structures.makeStructDeclNative((Class)$sX56414_native.class, module0810.$ic1$, module0810.$ic2$, module0810.$ic3$, module0810.$ic4$, new String[] { "$security_level", "$id_module_table", "$module_id_table", "$id_method_table", "$method_id_table", "$id_global_table", "$global_id_table", "$symbol_exceptions", "$id_symbol_table", "$symbol_id_table" }, module0810.$ic5$, module0810.$ic6$, module0810.$ic7$);
        }
    }
    
    public static final class $f51704$UnaryFunction extends UnaryFunction
    {
        public $f51704$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#56415"));
        }
        
        public SubLObject processItem(final SubLObject var4) {
            return module0810.f51704(var4);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0810.class
	Total time: 533 ms
	
	Decompiled with Procyon 0.5.32.
*/