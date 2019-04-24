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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0089 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0089";
    public static final String myFingerPrint = "5e0d10c1996b30a4a9d73fe21bc1846dfb0d464463cf8e90ca5cfd160090b124";
    public static SubLSymbol $g1179$;
    public static SubLSymbol $g1180$;
    public static SubLSymbol $g1181$;
    private static SubLSymbol $g1182$;
    private static SubLSymbol $g1183$;
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
    private static final SubLString $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLList $ic26$;
    private static final SubLList $ic27$;
    private static final SubLList $ic28$;
    private static final SubLList $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLList $ic32$;
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
    private static final SubLString $ic47$;
    private static final SubLString $ic48$;
    private static final SubLString $ic49$;
    private static final SubLString $ic50$;
    private static final SubLString $ic51$;
    private static final SubLString $ic52$;
    private static final SubLString $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLList $ic58$;
    private static final SubLList $ic59$;
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
    private static final SubLString $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLList $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLInteger $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLString $ic87$;
    private static final SubLInteger $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLFloat $ic91$;
    private static final SubLString $ic92$;
    private static final SubLString $ic93$;
    private static final SubLString $ic94$;
    private static final SubLString $ic95$;
    private static final SubLString $ic96$;
    
    public static SubLObject f6043(final SubLObject var1, final SubLObject var2) {
        f6044(var1, var2, (SubLObject)module0089.ZERO_INTEGER);
        return (SubLObject)module0089.NIL;
    }
    
    public static SubLObject f6045(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX4495_native.class) ? module0089.T : module0089.NIL);
    }
    
    public static SubLObject f6046(final SubLObject var1) {
        assert module0089.NIL != f6045(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f6047(final SubLObject var1) {
        assert module0089.NIL != f6045(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f6048(final SubLObject var1) {
        assert module0089.NIL != f6045(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f6049(final SubLObject var1, final SubLObject var4) {
        assert module0089.NIL != f6045(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f6050(final SubLObject var1, final SubLObject var4) {
        assert module0089.NIL != f6045(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f6051(final SubLObject var1, final SubLObject var4) {
        assert module0089.NIL != f6045(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f6052(SubLObject var5) {
        if (var5 == module0089.UNPROVIDED) {
            var5 = (SubLObject)module0089.NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX4495_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0089.NIL, var7 = var5; module0089.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0089.$ic15$)) {
                f6049(var6, var9);
            }
            else if (var10.eql((SubLObject)module0089.$ic16$)) {
                f6050(var6, var9);
            }
            else if (var10.eql((SubLObject)module0089.$ic17$)) {
                f6051(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0089.$ic18$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f6053(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0089.$ic19$, (SubLObject)module0089.$ic20$, (SubLObject)module0089.THREE_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)module0089.$ic21$, (SubLObject)module0089.$ic15$, f6046(var11));
        Functions.funcall(var12, var11, (SubLObject)module0089.$ic21$, (SubLObject)module0089.$ic16$, f6047(var11));
        Functions.funcall(var12, var11, (SubLObject)module0089.$ic21$, (SubLObject)module0089.$ic17$, f6048(var11));
        Functions.funcall(var12, var11, (SubLObject)module0089.$ic22$, (SubLObject)module0089.$ic20$, (SubLObject)module0089.THREE_INTEGER);
        return var11;
    }
    
    public static SubLObject f6054(final SubLObject var11, final SubLObject var12) {
        return f6053(var11, var12);
    }
    
    public static SubLObject f6055(final SubLObject var1, final SubLObject var2) {
        f6056(var1, var2, (SubLObject)module0089.ZERO_INTEGER);
        return (SubLObject)module0089.NIL;
    }
    
    public static SubLObject f6057(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX7699_native.class) ? module0089.T : module0089.NIL);
    }
    
    public static SubLObject f6058(final SubLObject var1) {
        assert module0089.NIL != f6057(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f6059(final SubLObject var1) {
        assert module0089.NIL != f6057(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f6060(final SubLObject var1) {
        assert module0089.NIL != f6057(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f6061(final SubLObject var1) {
        assert module0089.NIL != f6057(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f6062(final SubLObject var1, final SubLObject var4) {
        assert module0089.NIL != f6057(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f6063(final SubLObject var1, final SubLObject var4) {
        assert module0089.NIL != f6057(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f6064(final SubLObject var1, final SubLObject var4) {
        assert module0089.NIL != f6057(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f6065(final SubLObject var1, final SubLObject var4) {
        assert module0089.NIL != f6057(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f6066(SubLObject var5) {
        if (var5 == module0089.UNPROVIDED) {
            var5 = (SubLObject)module0089.NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX7699_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0089.NIL, var7 = var5; module0089.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0089.$ic41$)) {
                f6062(var6, var9);
            }
            else if (var10.eql((SubLObject)module0089.$ic42$)) {
                f6063(var6, var9);
            }
            else if (var10.eql((SubLObject)module0089.$ic43$)) {
                f6064(var6, var9);
            }
            else if (var10.eql((SubLObject)module0089.$ic44$)) {
                f6065(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0089.$ic18$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f6067(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0089.$ic19$, (SubLObject)module0089.$ic45$, (SubLObject)module0089.FOUR_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)module0089.$ic21$, (SubLObject)module0089.$ic41$, f6058(var11));
        Functions.funcall(var12, var11, (SubLObject)module0089.$ic21$, (SubLObject)module0089.$ic42$, f6059(var11));
        Functions.funcall(var12, var11, (SubLObject)module0089.$ic21$, (SubLObject)module0089.$ic43$, f6060(var11));
        Functions.funcall(var12, var11, (SubLObject)module0089.$ic21$, (SubLObject)module0089.$ic44$, f6061(var11));
        Functions.funcall(var12, var11, (SubLObject)module0089.$ic22$, (SubLObject)module0089.$ic45$, (SubLObject)module0089.FOUR_INTEGER);
        return var11;
    }
    
    public static SubLObject f6068(final SubLObject var11, final SubLObject var12) {
        return f6067(var11, var12);
    }
    
    public static SubLObject f6044(final SubLObject var16, final SubLObject var2, final SubLObject var17) {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        streams_high.write_string((SubLObject)module0089.$ic47$, var2, (SubLObject)module0089.UNPROVIDED, (SubLObject)module0089.UNPROVIDED);
        print_high.princ(Hashtables.hash_table_test(f6047(var16)), var2);
        streams_high.write_string((SubLObject)module0089.$ic48$, var2, (SubLObject)module0089.UNPROVIDED, (SubLObject)module0089.UNPROVIDED);
        print_high.princ(f6069(var16), var2);
        if (module0089.NIL != module0089.$g1181$.getDynamicValue(var18)) {
            streams_high.write_string((SubLObject)module0089.$ic49$, var2, (SubLObject)module0089.UNPROVIDED, (SubLObject)module0089.UNPROVIDED);
            SubLObject var19 = (SubLObject)module0089.ZERO_INTEGER;
            final SubLObject var20 = f6069(var16);
            SubLObject var21 = f6048(var16);
            while (var19.numL(Numbers.min((SubLObject)module0089.NINE_INTEGER, Numbers.subtract(var20, (SubLObject)module0089.ONE_INTEGER)))) {
                var21 = f6058(var21);
                print_high.princ(var21, var2);
                print_high.princ((SubLObject)module0089.$ic50$, var2);
                var19 = Numbers.add(var19, (SubLObject)module0089.ONE_INTEGER);
            }
            if (var20.numG((SubLObject)module0089.ZERO_INTEGER)) {
                print_high.princ(f6058(var21), var2);
            }
            if (var20.numG((SubLObject)module0089.TEN_INTEGER)) {
                print_high.princ((SubLObject)module0089.$ic51$, (SubLObject)module0089.UNPROVIDED);
            }
            streams_high.write_string((SubLObject)module0089.$ic52$, var2, (SubLObject)module0089.UNPROVIDED, (SubLObject)module0089.UNPROVIDED);
        }
        streams_high.write_string((SubLObject)module0089.$ic53$, var2, (SubLObject)module0089.UNPROVIDED, (SubLObject)module0089.UNPROVIDED);
        return var16;
    }
    
    public static SubLObject f6070(final SubLObject var22, SubLObject var23) {
        if (var23 == module0089.UNPROVIDED) {
            var23 = (SubLObject)module0089.EQL;
        }
        final SubLThread var24 = SubLProcess.currentSubLThread();
        assert module0089.NIL != module0004.f105(var22) : var22;
        assert module0089.NIL != module0030.f1591(var23) : var23;
        final SubLObject var25 = f6052((SubLObject)module0089.UNPROVIDED);
        final SubLObject var26 = f6066((SubLObject)module0089.UNPROVIDED);
        f6049(var25, var22);
        f6050(var25, Hashtables.make_hash_table(var22, var23, (SubLObject)module0089.UNPROVIDED));
        f6062(var26, var26);
        f6065(var26, var26);
        f6051(var25, var26);
        if (module0089.NIL != module0089.$g1182$.getDynamicValue(var24)) {
            f6071(var25, (SubLObject)module0089.$ic56$);
            SubLObject var27;
            for (var27 = (SubLObject)module0089.NIL, var27 = (SubLObject)module0089.ZERO_INTEGER; var27.numL(var22); var27 = Numbers.add(var27, (SubLObject)module0089.ONE_INTEGER)) {
                f6072(var25, f6066((SubLObject)module0089.UNPROVIDED));
            }
        }
        return var25;
    }
    
    public static SubLObject f6073(final SubLObject var22, SubLObject var23) {
        if (var23 == module0089.UNPROVIDED) {
            var23 = (SubLObject)module0089.EQL;
        }
        final SubLThread var24 = SubLProcess.currentSubLThread();
        SubLObject var25 = (SubLObject)module0089.NIL;
        final SubLObject var26 = module0089.$g1182$.currentBinding(var24);
        try {
            module0089.$g1182$.bind((SubLObject)module0089.T, var24);
            var25 = f6070(var22, var23);
        }
        finally {
            module0089.$g1182$.rebind(var26, var24);
        }
        return var25;
    }
    
    public static SubLObject f6074(final SubLObject var16) {
        assert module0089.NIL != f6045(var16) : var16;
        return Numbers.numGE(f6069(var16), f6046(var16));
    }
    
    public static SubLObject f6075(final SubLObject var16) {
        assert module0089.NIL != f6045(var16) : var16;
        return Equality.eq(f6076(var16), f6048(var16));
    }
    
    public static SubLObject f6077(final SubLObject var16, final SubLObject var26) {
        assert module0089.NIL != f6045(var16) : var16;
        return f6078(var16, var26, (SubLObject)module0089.NIL, (SubLObject)module0089.T);
    }
    
    public static SubLObject f6079(final SubLObject var16, final SubLObject var26, SubLObject var27) {
        if (var27 == module0089.UNPROVIDED) {
            var27 = (SubLObject)module0089.NIL;
        }
        assert module0089.NIL != f6045(var16) : var16;
        return f6078(var16, var26, var27, (SubLObject)module0089.NIL);
    }
    
    public static SubLObject f6078(final SubLObject var16, final SubLObject var26, final SubLObject var27, final SubLObject var28) {
        final SubLObject var29 = Hashtables.gethash_without_values(var26, f6047(var16), (SubLObject)module0089.UNPROVIDED);
        if (module0089.NIL == var29) {
            if (module0089.NIL != var28) {
                return Values.values((SubLObject)module0089.NIL, (SubLObject)module0089.NIL);
            }
            return var27;
        }
        else {
            f6080(var16, var29);
            if (module0089.NIL != var28) {
                return Values.values(f6060(var29), (SubLObject)module0089.T);
            }
            return f6060(var29);
        }
    }
    
    public static SubLObject f6081(final SubLObject var16, final SubLObject var26) {
        final SubLThread var27 = SubLProcess.currentSubLThread();
        var27.resetMultipleValues();
        final SubLObject var28 = Hashtables.gethash(var26, f6047(var16), (SubLObject)module0089.UNPROVIDED);
        final SubLObject var29 = var27.secondMultipleValue();
        var27.resetMultipleValues();
        return var29;
    }
    
    public static SubLObject f6082(final SubLObject var16, final SubLObject var26, final SubLObject var29) {
        assert module0089.NIL != f6045(var16) : var16;
        return f6083(var16, var26, var29, (SubLObject)module0089.T);
    }
    
    public static SubLObject f6084(final SubLObject var16, final SubLObject var26, final SubLObject var29) {
        assert module0089.NIL != f6045(var16) : var16;
        return f6083(var16, var26, var29, (SubLObject)module0089.NIL);
    }
    
    public static SubLObject f6085(final SubLObject var16, final SubLObject var26, final SubLObject var29) {
        SubLObject var30 = (SubLObject)module0089.NIL;
        SubLObject var31 = (SubLObject)module0089.NIL;
        SubLObject var32 = (SubLObject)module0089.NIL;
        if (module0089.NIL != f6074(var16) && module0089.$ic57$ == f6079(var16, var26, (SubLObject)module0089.$ic57$)) {
            var30 = f6059(f6086(var16));
            var31 = f6079(var16, var30, (SubLObject)module0089.UNPROVIDED);
            var32 = (SubLObject)module0089.T;
            f6087(var16, var30);
        }
        f6084(var16, var26, var29);
        return Values.values(var30, var31, var32);
    }
    
    public static SubLObject f6083(final SubLObject var16, final SubLObject var26, final SubLObject var29, final SubLObject var34) {
        final SubLObject var35 = Hashtables.gethash_without_values(var26, f6047(var16), (SubLObject)module0089.UNPROVIDED);
        SubLObject var36 = (SubLObject)module0089.NIL;
        if (module0089.NIL != var35) {
            var36 = f6060(var35);
            f6064(var35, var29);
            f6080(var16, var35);
        }
        else {
            SubLObject var37 = (SubLObject)module0089.NIL;
            if (module0089.NIL != f6074(var16)) {
                var37 = f6086(var16);
                Hashtables.remhash(f6059(var37), f6047(var16));
                f6088(var37);
            }
            else {
                var37 = f6089(var16);
            }
            f6063(var37, var26);
            f6064(var37, var29);
            Hashtables.sethash(var26, f6047(var16), var37);
            f6090(var16, var37);
        }
        if (module0089.NIL != var34) {
            return Values.values(var36, module0035.sublisp_boolean(var35));
        }
        return var36;
    }
    
    public static SubLObject f6087(final SubLObject var16, final SubLObject var26) {
        assert module0089.NIL != f6045(var16) : var16;
        final SubLObject var27 = Hashtables.gethash_without_values(var26, f6047(var16), (SubLObject)module0089.UNPROVIDED);
        SubLObject var28 = (SubLObject)module0089.NIL;
        if (module0089.NIL != var27) {
            f6091(var16, var27);
            Hashtables.remhash(var26, f6047(var16));
            var28 = f6060(var27);
        }
        return Values.values(var28, module0035.sublisp_boolean(var27));
    }
    
    public static SubLObject f6092(final SubLObject var16) {
        assert module0089.NIL != f6045(var16) : var16;
        if (module0089.NIL != f6093(var16)) {
            while (module0089.NIL == f6075(var16)) {
                final SubLObject var17 = f6086(var16);
                f6087(var16, f6059(var17));
            }
        }
        else {
            final SubLObject var18 = f6048(var16);
            f6062(var18, var18);
            f6065(var18, var18);
            Hashtables.clrhash(f6047(var16));
        }
        return var16;
    }
    
    public static SubLObject f6094(final SubLObject var16) {
        assert module0089.NIL != f6045(var16) : var16;
        return Hashtables.hash_table_test(f6047(var16));
    }
    
    public static SubLObject f6069(final SubLObject var16) {
        assert module0089.NIL != f6045(var16) : var16;
        return Hashtables.hash_table_count(f6047(var16));
    }
    
    public static SubLObject f6095(final SubLObject var38, final SubLObject var39) {
        SubLObject var41;
        final SubLObject var40 = var41 = var38.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var41, var40, (SubLObject)module0089.$ic58$);
        final SubLObject var42 = var41.rest();
        var41 = var41.first();
        SubLObject var43 = (SubLObject)module0089.NIL;
        SubLObject var44 = (SubLObject)module0089.NIL;
        SubLObject var45 = (SubLObject)module0089.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var41, var40, (SubLObject)module0089.$ic58$);
        var43 = var41.first();
        var41 = var41.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var41, var40, (SubLObject)module0089.$ic58$);
        var44 = var41.first();
        var41 = var41.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var41, var40, (SubLObject)module0089.$ic58$);
        var45 = var41.first();
        var41 = var41.rest();
        SubLObject var46 = (SubLObject)module0089.NIL;
        SubLObject var47 = var41;
        SubLObject var48 = (SubLObject)module0089.NIL;
        SubLObject var46_47 = (SubLObject)module0089.NIL;
        while (module0089.NIL != var47) {
            cdestructuring_bind.destructuring_bind_must_consp(var47, var40, (SubLObject)module0089.$ic58$);
            var46_47 = var47.first();
            var47 = var47.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var47, var40, (SubLObject)module0089.$ic58$);
            if (module0089.NIL == conses_high.member(var46_47, (SubLObject)module0089.$ic59$, (SubLObject)module0089.UNPROVIDED, (SubLObject)module0089.UNPROVIDED)) {
                var48 = (SubLObject)module0089.T;
            }
            if (var46_47 == module0089.$ic60$) {
                var46 = var47.first();
            }
            var47 = var47.rest();
        }
        if (module0089.NIL != var48 && module0089.NIL == var46) {
            cdestructuring_bind.cdestructuring_bind_error(var40, (SubLObject)module0089.$ic58$);
        }
        final SubLObject var49 = cdestructuring_bind.property_list_member((SubLObject)module0089.$ic61$, var41);
        final SubLObject var50 = (SubLObject)((module0089.NIL != var49) ? conses_high.cadr(var49) : module0089.$ic62$);
        final SubLObject var51;
        var41 = (var51 = var42);
        final SubLObject var52 = (SubLObject)module0089.$ic63$;
        final SubLObject var53 = (SubLObject)module0089.$ic64$;
        final SubLObject var54 = (SubLObject)module0089.$ic65$;
        return (SubLObject)ConsesLow.list((SubLObject)module0089.$ic66$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var52, var45), (SubLObject)ConsesLow.list(var53, var50), (SubLObject)ConsesLow.list(var54, (SubLObject)ConsesLow.list((SubLObject)module0089.$ic67$, var52, var53)), var43, var44), (SubLObject)ConsesLow.listS((SubLObject)module0089.$ic68$, (SubLObject)ConsesLow.list((SubLObject)module0089.$ic69$, (SubLObject)ConsesLow.list((SubLObject)module0089.$ic70$, var52, var54)), (SubLObject)ConsesLow.list((SubLObject)module0089.$ic71$, var43, (SubLObject)ConsesLow.list((SubLObject)module0089.$ic72$, var54)), (SubLObject)ConsesLow.list((SubLObject)module0089.$ic71$, var44, (SubLObject)ConsesLow.list((SubLObject)module0089.$ic73$, var54)), (SubLObject)ConsesLow.list((SubLObject)module0089.$ic71$, var54, (SubLObject)ConsesLow.list((SubLObject)module0089.$ic74$, var54, var53)), ConsesLow.append(var51, (SubLObject)module0089.NIL)));
    }
    
    public static SubLObject f6096(final SubLObject var16) {
        final SubLObject var17 = f6070(f6046(var16), f6094(var16));
        final SubLObject var18 = (SubLObject)module0089.$ic75$;
        SubLObject var19 = f6097(var16, var18);
        SubLObject var20 = (SubLObject)module0089.NIL;
        SubLObject var21 = (SubLObject)module0089.NIL;
        while (module0089.NIL == f6098(var16, var19)) {
            var20 = f6099(var19);
            var21 = f6100(var19);
            var19 = f6101(var19, var18);
            f6082(var17, var20, var21);
        }
        return var17;
    }
    
    public static SubLObject f6097(final SubLObject var16, final SubLObject var49) {
        assert module0089.NIL != f6045(var16) : var16;
        return f6101(f6048(var16), var49);
    }
    
    public static SubLObject f6098(final SubLObject var16, final SubLObject var21) {
        return Equality.eq(var21, f6048(var16));
    }
    
    public static SubLObject f6099(final SubLObject var21) {
        return f6059(var21);
    }
    
    public static SubLObject f6100(final SubLObject var21) {
        return f6060(var21);
    }
    
    public static SubLObject f6101(final SubLObject var21, final SubLObject var49) {
        if (var49.eql((SubLObject)module0089.$ic62$)) {
            return f6061(var21);
        }
        if (var49.eql((SubLObject)module0089.$ic75$)) {
            return f6058(var21);
        }
        return Errors.error((SubLObject)module0089.$ic77$, var49);
    }
    
    public static SubLObject f6102(final SubLObject var16) {
        assert module0089.NIL != f6045(var16) : var16;
        SubLObject var17 = (SubLObject)module0089.NIL;
        final SubLObject var18 = (SubLObject)module0089.$ic62$;
        SubLObject var19 = f6097(var16, var18);
        SubLObject var20 = (SubLObject)module0089.NIL;
        SubLObject var21 = (SubLObject)module0089.NIL;
        while (module0089.NIL == f6098(var16, var19)) {
            var20 = f6099(var19);
            var21 = f6100(var19);
            var19 = f6101(var19, var18);
            var17 = (SubLObject)ConsesLow.cons(var20, var17);
        }
        return Sequences.nreverse(var17);
    }
    
    public static SubLObject f6103(final SubLObject var16) {
        assert module0089.NIL != f6045(var16) : var16;
        SubLObject var17 = (SubLObject)module0089.NIL;
        final SubLObject var18 = (SubLObject)module0089.$ic62$;
        SubLObject var19 = f6097(var16, var18);
        SubLObject var20 = (SubLObject)module0089.NIL;
        for (SubLObject var21 = (SubLObject)module0089.NIL; module0089.NIL == f6098(var16, var19); var19 = f6101(var19, var18), var17 = (SubLObject)ConsesLow.cons(var21, var17)) {
            var20 = f6099(var19);
            var21 = f6100(var19);
        }
        return Sequences.nreverse(var17);
    }
    
    public static SubLObject f6104(final SubLObject var16, final SubLObject var59) {
        assert module0089.NIL != f6045(var16) : var16;
        assert module0089.NIL != Types.function_spec_p(var59) : var59;
        final SubLObject var60 = (SubLObject)module0089.$ic62$;
        SubLObject var61 = f6097(var16, var60);
        SubLObject var62 = (SubLObject)module0089.NIL;
        SubLObject var63 = (SubLObject)module0089.NIL;
        while (module0089.NIL == f6098(var16, var61)) {
            var62 = f6099(var61);
            var63 = f6100(var61);
            var61 = f6101(var61, var60);
            Functions.funcall(var59, var62, var63);
        }
        return (SubLObject)module0089.NIL;
    }
    
    public static SubLObject f6105(final SubLObject var16) {
        assert module0089.NIL != f6045(var16) : var16;
        return module0052.f3689(f6106(var16), (SubLObject)module0089.$ic79$, (SubLObject)module0089.$ic80$, (SubLObject)module0089.UNPROVIDED);
    }
    
    public static SubLObject f6106(final SubLObject var16) {
        final SubLObject var17 = f6061(f6048(var16));
        return (SubLObject)ConsesLow.list(var17, f6048(var16));
    }
    
    public static SubLObject f6107(final SubLObject var61) {
        SubLObject var60_64 = (SubLObject)module0089.NIL;
        SubLObject var62 = (SubLObject)module0089.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var61, var61, (SubLObject)module0089.$ic81$);
        var60_64 = var61.first();
        SubLObject var63 = var61.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var63, var61, (SubLObject)module0089.$ic81$);
        var62 = var63.first();
        var63 = var63.rest();
        if (module0089.NIL == var63) {
            return Equality.eq(var60_64, var62);
        }
        cdestructuring_bind.cdestructuring_bind_error(var61, (SubLObject)module0089.$ic81$);
        return (SubLObject)module0089.NIL;
    }
    
    public static SubLObject f6108(final SubLObject var61) {
        SubLObject var60_67 = (SubLObject)module0089.NIL;
        SubLObject var62 = (SubLObject)module0089.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var61, var61, (SubLObject)module0089.$ic81$);
        var60_67 = var61.first();
        SubLObject var63 = var61.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var63, var61, (SubLObject)module0089.$ic81$);
        var62 = var63.first();
        var63 = var63.rest();
        if (module0089.NIL == var63) {
            ConsesLow.rplaca(var61, f6061(var60_67));
            return Values.values(var60_67, var61, Equality.eq(var60_67, var62));
        }
        cdestructuring_bind.cdestructuring_bind_error(var61, (SubLObject)module0089.$ic81$);
        return (SubLObject)module0089.NIL;
    }
    
    public static SubLObject f6109(final SubLObject var16) {
        assert module0089.NIL != f6045(var16) : var16;
        return module0052.f3689(f6110(var16), (SubLObject)module0089.$ic82$, (SubLObject)module0089.$ic83$, (SubLObject)module0089.UNPROVIDED);
    }
    
    public static SubLObject f6110(final SubLObject var16) {
        final SubLObject var17 = f6105(var16);
        return var17;
    }
    
    public static SubLObject f6111(final SubLObject var61) {
        return module0052.f3687(var61);
    }
    
    public static SubLObject f6112(final SubLObject var61) {
        final SubLThread var62 = SubLProcess.currentSubLThread();
        var62.resetMultipleValues();
        final SubLObject var63 = module0052.f3693(var61);
        final SubLObject var64 = var62.secondMultipleValue();
        var62.resetMultipleValues();
        if (module0089.NIL != var64) {
            final SubLObject var65 = f6059(var63);
            final SubLObject var66 = f6060(var63);
            return Values.values((SubLObject)ConsesLow.cons(var65, var66), var61, (SubLObject)module0089.NIL);
        }
        return Values.values((SubLObject)module0089.NIL, var61, (SubLObject)module0089.T);
    }
    
    public static SubLObject f6113(final SubLObject var71, final SubLObject var2) {
        return f6114(var71, var2);
    }
    
    public static SubLObject f6114(final SubLObject var71, final SubLObject var2) {
        module0021.f1086(module0089.$g1183$.getGlobalValue(), var2);
        final SubLObject var72 = f6046(var71);
        final SubLObject var73 = module0030.f1592(f6094(var71));
        final SubLObject var74 = f6069(var71);
        module0021.f1038(var72, var2);
        module0021.f1038(var73, var2);
        module0021.f1038(var74, var2);
        final SubLObject var75 = (SubLObject)module0089.$ic75$;
        SubLObject var76 = f6097(var71, var75);
        SubLObject var77 = (SubLObject)module0089.NIL;
        SubLObject var78 = (SubLObject)module0089.NIL;
        while (module0089.NIL == f6098(var71, var76)) {
            var77 = f6099(var76);
            var78 = f6100(var76);
            var76 = f6101(var76, var75);
            module0021.f1038(var77, var2);
            module0021.f1038(var78, var2);
        }
        return var71;
    }
    
    public static SubLObject f6115(final SubLObject var2) {
        final SubLObject var3 = module0021.f1060(var2, (SubLObject)module0089.UNPROVIDED, (SubLObject)module0089.UNPROVIDED);
        SubLObject var4 = module0021.f1060(var2, (SubLObject)module0089.UNPROVIDED, (SubLObject)module0089.UNPROVIDED);
        final SubLObject var5 = module0021.f1060(var2, (SubLObject)module0089.UNPROVIDED, (SubLObject)module0089.UNPROVIDED);
        SubLObject var6 = (SubLObject)module0089.NIL;
        final SubLObject var7 = var4;
        if (var7.eql((SubLObject)module0089.EQ) || var7.eql((SubLObject)module0089.EQL) || var7.eql((SubLObject)module0089.EQUAL) || var7.eql((SubLObject)module0089.EQUALP)) {
            var4 = Symbols.symbol_function(var4);
        }
        var6 = f6070(var3, var4);
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var8 = (SubLObject)module0089.NIL, var8 = (SubLObject)module0089.ZERO_INTEGER; var8.numL(var5); var8 = Numbers.add(var8, (SubLObject)module0089.ONE_INTEGER)) {
            var9 = module0021.f1060(var2, (SubLObject)module0089.UNPROVIDED, (SubLObject)module0089.UNPROVIDED);
            var10 = module0021.f1060(var2, (SubLObject)module0089.UNPROVIDED, (SubLObject)module0089.UNPROVIDED);
            f6084(var6, var9, var10);
        }
        return var6;
    }
    
    public static SubLObject f6076(final SubLObject var16) {
        return f6061(f6048(var16));
    }
    
    public static SubLObject f6086(final SubLObject var16) {
        return f6058(f6048(var16));
    }
    
    public static SubLObject f6091(final SubLObject var16, final SubLObject var21) {
        f6088(var21);
        f6116(var16, var21);
        return var16;
    }
    
    public static SubLObject f6080(final SubLObject var16, final SubLObject var21) {
        f6088(var21);
        f6117(var16, var21);
        return var16;
    }
    
    public static SubLObject f6090(final SubLObject var16, final SubLObject var21) {
        return f6117(var16, var21);
    }
    
    public static SubLObject f6117(final SubLObject var16, final SubLObject var21) {
        f6062(var21, f6048(var16));
        f6065(var21, f6076(var16));
        f6062(f6076(var16), var21);
        f6065(f6048(var16), var21);
        return var16;
    }
    
    public static SubLObject f6088(final SubLObject var21) {
        f6062(f6061(var21), f6058(var21));
        f6065(f6058(var21), f6061(var21));
        return var21;
    }
    
    public static SubLObject f6093(final SubLObject var16) {
        final SubLObject var17 = f6118(var16);
        return (SubLObject)SubLObjectFactory.makeBoolean(var17 == module0089.$ic56$ || module0089.NIL != f6057(var17));
    }
    
    public static SubLObject f6089(final SubLObject var16) {
        SubLObject var17 = f6119(var16);
        if (module0089.NIL == var17) {
            var17 = f6066((SubLObject)module0089.UNPROVIDED);
        }
        return var17;
    }
    
    public static SubLObject f6118(final SubLObject var16) {
        return f6059(f6048(var16));
    }
    
    public static SubLObject f6071(final SubLObject var16, final SubLObject var74) {
        f6063(f6048(var16), var74);
        return var16;
    }
    
    public static SubLObject f6116(final SubLObject var16, final SubLObject var21) {
        if (module0089.NIL != f6093(var16)) {
            f6072(var16, var21);
        }
        return var16;
    }
    
    public static SubLObject f6072(final SubLObject var16, final SubLObject var21) {
        f6120(var21);
        f6062(var21, f6118(var16));
        return f6071(var16, var21);
    }
    
    public static SubLObject f6119(final SubLObject var16) {
        final SubLObject var17 = f6118(var16);
        SubLObject var18 = (SubLObject)module0089.NIL;
        if (module0089.NIL != f6057(var17)) {
            var18 = var17;
            f6071(var16, f6058(var18));
            f6062(var18, (SubLObject)module0089.NIL);
        }
        return var18;
    }
    
    public static SubLObject f6056(final SubLObject var21, final SubLObject var2, final SubLObject var17) {
        print_high.princ(f6059(var21), var2);
        streams_high.write_string((SubLObject)module0089.$ic87$, var2, (SubLObject)module0089.UNPROVIDED, (SubLObject)module0089.UNPROVIDED);
        print_high.princ(f6060(var21), var2);
        return var21;
    }
    
    public static SubLObject f6120(final SubLObject var21) {
        f6064(var21, (SubLObject)module0089.NIL);
        f6063(var21, (SubLObject)module0089.NIL);
        f6062(var21, (SubLObject)module0089.NIL);
        f6065(var21, (SubLObject)module0089.NIL);
        return var21;
    }
    
    public static SubLObject f6121(SubLObject var75) {
        if (var75 == module0089.UNPROVIDED) {
            var75 = (SubLObject)module0089.$ic88$;
        }
        final SubLThread var76 = SubLProcess.currentSubLThread();
        assert module0089.NIL != module0004.f105(var75) : var75;
        final SubLObject var77 = Numbers.divide(var75, (SubLObject)module0089.TEN_INTEGER);
        SubLObject var78 = (SubLObject)module0089.ZERO_INTEGER;
        SubLObject var79 = (SubLObject)module0089.T;
        SubLObject var80 = (SubLObject)module0089.NIL;
        var76.resetMultipleValues();
        final SubLObject var81 = f6122(var77);
        final SubLObject var82 = var76.secondMultipleValue();
        var76.resetMultipleValues();
        var80 = Vectors.make_vector(Hashtables.hash_table_count(var82), (SubLObject)module0089.UNPROVIDED);
        SubLObject var83 = (SubLObject)module0089.NIL;
        SubLObject var84 = (SubLObject)module0089.NIL;
        final Iterator var85 = Hashtables.getEntrySetIterator(var82);
        try {
            while (Hashtables.iteratorHasNext(var85)) {
                final Map.Entry var86 = Hashtables.iteratorNextEntry(var85);
                var83 = Hashtables.getEntryKey(var86);
                var84 = Hashtables.getEntryValue(var86);
                Vectors.set_aref(var80, var78, (SubLObject)ConsesLow.cons(var83, var84));
                var78 = Numbers.add(var78, (SubLObject)module0089.ONE_INTEGER);
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var85);
        }
        Sort.sort(var80, Symbols.symbol_function((SubLObject)module0089.$ic89$), Symbols.symbol_function((SubLObject)module0089.$ic90$));
        final SubLObject var87 = Numbers.min(var77, Hashtables.hash_table_count(var82));
        SubLObject var88 = (SubLObject)module0089.NIL;
        SubLObject var89 = (SubLObject)module0089.NIL;
        SubLObject var90;
        for (var90 = (SubLObject)module0089.NIL, var90 = (SubLObject)module0089.ZERO_INTEGER; var90.numL(var87); var90 = Numbers.add(var90, (SubLObject)module0089.ONE_INTEGER)) {
            var88 = Vectors.aref(var80, var90).first();
            var89 = f6077(var81, var88);
            var79 = (SubLObject)SubLObjectFactory.makeBoolean(module0089.NIL != var79 && var89.eql(Numbers.add(var88, (SubLObject)module0089.$ic91$)));
        }
        SubLObject var91;
        SubLObject var92;
        for (var91 = Numbers.subtract(Hashtables.hash_table_count(var82), var87), var92 = (SubLObject)module0089.NIL, var92 = (SubLObject)module0089.ZERO_INTEGER; var92.numL(var91); var92 = Numbers.add(var92, (SubLObject)module0089.ONE_INTEGER)) {
            var79 = (SubLObject)SubLObjectFactory.makeBoolean(module0089.NIL != var79 && module0089.NIL == f6077(var81, Vectors.aref(var80, Numbers.add(var92, var77)).first()));
        }
        return var79;
    }
    
    public static SubLObject f6122(final SubLObject var22) {
        final SubLObject var23 = f6070(var22, (SubLObject)module0089.UNPROVIDED);
        final SubLObject var24 = Numbers.multiply((SubLObject)module0089.TEN_INTEGER, var22);
        final SubLObject var25 = Hashtables.make_hash_table(var24, (SubLObject)module0089.UNPROVIDED, (SubLObject)module0089.UNPROVIDED);
        SubLObject var26;
        SubLObject var27;
        for (var26 = (SubLObject)module0089.NIL, var26 = (SubLObject)module0089.ZERO_INTEGER; var26.numL(var24); var26 = Numbers.add(var26, (SubLObject)module0089.ONE_INTEGER)) {
            var27 = random.random(var24);
            f6082(var23, var27, Numbers.add(var27, (SubLObject)module0089.$ic91$));
            module0079.f5412(var25, var27, var26);
        }
        return Values.values(var23, var25);
    }
    
    public static SubLObject f6123(SubLObject var75) {
        if (var75 == module0089.UNPROVIDED) {
            var75 = (SubLObject)module0089.$ic88$;
        }
        final SubLThread var76 = SubLProcess.currentSubLThread();
        var76.resetMultipleValues();
        final SubLObject var77 = f6122(Numbers.integerDivide(var75, (SubLObject)module0089.TEN_INTEGER));
        final SubLObject var78 = var76.secondMultipleValue();
        var76.resetMultipleValues();
        final SubLObject var79 = f6105(var77);
        final SubLObject var80 = f6109(var77);
        SubLObject var81 = (SubLObject)module0089.ZERO_INTEGER;
        SubLObject var84;
        for (SubLObject var82 = (SubLObject)module0089.NIL; module0089.NIL == var82; var82 = (SubLObject)SubLObjectFactory.makeBoolean(module0089.NIL == var84)) {
            var76.resetMultipleValues();
            final SubLObject var83 = module0052.f3693(var79);
            var84 = var76.secondMultipleValue();
            var76.resetMultipleValues();
            if (module0089.NIL != var84) {
                var81 = Numbers.add(var81, (SubLObject)module0089.ONE_INTEGER);
                if (module0089.NIL != module0052.f3687(var80)) {
                    Errors.warn((SubLObject)module0089.$ic92$, var80, var81, var79);
                    return (SubLObject)module0089.NIL;
                }
                var76.resetMultipleValues();
                final SubLObject var85 = module0052.f3693(var80);
                final SubLObject var86 = var76.secondMultipleValue();
                var76.resetMultipleValues();
                if (module0089.NIL == var86) {
                    Errors.warn((SubLObject)module0089.$ic92$, var80, var81, var79);
                    return (SubLObject)module0089.NIL;
                }
                final SubLObject var87 = f6059(var83);
                final SubLObject var88 = f6060(var83);
                final SubLObject var89 = var85.first();
                final SubLObject var90 = var85.rest();
                if (!var87.eql(var89)) {
                    Errors.warn((SubLObject)module0089.$ic93$, var81, var89, var87);
                    return (SubLObject)module0089.NIL;
                }
                if (!var88.eql(var90)) {
                    Errors.warn((SubLObject)module0089.$ic94$, var81, var90, var88);
                    return (SubLObject)module0089.NIL;
                }
            }
        }
        if (module0089.NIL == module0052.f3687(var80)) {
            Errors.warn((SubLObject)module0089.$ic95$, var81, var80, var79);
            return (SubLObject)module0089.NIL;
        }
        if (!var81.numE(f6069(var77))) {
            Errors.warn((SubLObject)module0089.$ic96$, var81, f6069(var77));
            return (SubLObject)module0089.NIL;
        }
        return (SubLObject)module0089.T;
    }
    
    public static SubLObject f6124() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6043", "S#7701", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6045", "S#3048", 1, 0, false);
        new $f6045$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6046", "S#3049", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6047", "S#7702", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6048", "S#7703", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6049", "S#7704", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6050", "S#7705", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6051", "S#7706", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6052", "S#7707", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6053", "S#7708", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6054", "S#7709", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6055", "S#7710", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6057", "S#7700", 1, 0, false);
        new $f6057$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6058", "S#7711", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6059", "S#7712", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6060", "S#7713", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6061", "S#7714", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6062", "S#7715", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6063", "S#7716", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6064", "S#7717", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6065", "S#7718", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6066", "S#7719", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6067", "S#7720", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6068", "S#7721", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6044", "S#7722", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6070", "S#3032", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6073", "S#7723", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6074", "S#7724", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6075", "S#7725", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6077", "S#7726", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6079", "S#3033", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6078", "S#7727", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6081", "S#7728", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6082", "S#3035", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6084", "S#7729", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6085", "S#7730", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6083", "S#7731", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6087", "S#3039", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6092", "S#3036", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6094", "S#7732", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6069", "S#3038", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0089", "f6095", "S#7733");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6096", "S#3040", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6097", "S#7734", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6098", "S#7735", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6099", "S#7736", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6100", "S#7737", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6101", "S#7738", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6102", "S#3037", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6103", "S#7739", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6104", "S#7740", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6105", "S#7741", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6106", "S#7742", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6107", "S#7743", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6108", "S#7744", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6109", "S#7745", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6110", "S#7746", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6111", "S#7747", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6112", "S#7748", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6113", "S#7749", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6114", "S#7750", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6115", "S#7751", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6076", "S#7752", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6086", "S#7753", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6091", "S#7754", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6080", "S#7755", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6090", "S#7756", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6117", "S#7757", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6088", "S#7758", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6093", "S#7759", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6089", "S#7760", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6118", "S#7761", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6071", "S#7762", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6116", "S#7763", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6072", "S#7764", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6119", "S#7765", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6056", "S#7766", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6120", "S#7767", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6121", "S#7768", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6122", "S#7769", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0089", "f6123", "S#7770", 0, 1, false);
        return (SubLObject)module0089.NIL;
    }
    
    public static SubLObject f6125() {
        module0089.$g1179$ = SubLFiles.defconstant("S#7771", (SubLObject)module0089.$ic0$);
        module0089.$g1180$ = SubLFiles.defconstant("S#7772", (SubLObject)module0089.$ic24$);
        module0089.$g1181$ = SubLFiles.defparameter("S#7773", (SubLObject)module0089.NIL);
        module0089.$g1182$ = SubLFiles.defparameter("S#7774", (SubLObject)module0089.NIL);
        module0089.$g1183$ = SubLFiles.defconstant("S#7775", (SubLObject)module0089.$ic84$);
        return (SubLObject)module0089.NIL;
    }
    
    public static SubLObject f6126() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0089.$g1179$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0089.$ic7$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0089.$ic8$);
        Structures.def_csetf((SubLObject)module0089.$ic9$, (SubLObject)module0089.$ic10$);
        Structures.def_csetf((SubLObject)module0089.$ic11$, (SubLObject)module0089.$ic12$);
        Structures.def_csetf((SubLObject)module0089.$ic13$, (SubLObject)module0089.$ic14$);
        Equality.identity((SubLObject)module0089.$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0089.$g1179$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0089.$ic23$));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0089.$g1180$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0089.$ic31$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0089.$ic32$);
        Structures.def_csetf((SubLObject)module0089.$ic33$, (SubLObject)module0089.$ic34$);
        Structures.def_csetf((SubLObject)module0089.$ic35$, (SubLObject)module0089.$ic36$);
        Structures.def_csetf((SubLObject)module0089.$ic37$, (SubLObject)module0089.$ic38$);
        Structures.def_csetf((SubLObject)module0089.$ic39$, (SubLObject)module0089.$ic40$);
        Equality.identity((SubLObject)module0089.$ic24$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0089.$g1180$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0089.$ic46$));
        module0002.f50((SubLObject)module0089.$ic67$, (SubLObject)module0089.$ic76$);
        module0002.f50((SubLObject)module0089.$ic70$, (SubLObject)module0089.$ic76$);
        module0002.f50((SubLObject)module0089.$ic72$, (SubLObject)module0089.$ic76$);
        module0002.f50((SubLObject)module0089.$ic73$, (SubLObject)module0089.$ic76$);
        module0002.f50((SubLObject)module0089.$ic74$, (SubLObject)module0089.$ic76$);
        module0021.f1098(module0089.$g1183$.getGlobalValue(), (SubLObject)module0089.$ic85$);
        Structures.register_method(module0021.$g749$.getGlobalValue(), module0089.$g1179$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0089.$ic86$));
        return (SubLObject)module0089.NIL;
    }
    
    public void declareFunctions() {
        f6124();
    }
    
    public void initializeVariables() {
        f6125();
    }
    
    public void runTopLevelForms() {
        f6126();
    }
    
    static {
        me = (SubLFile)new module0089();
        module0089.$g1179$ = null;
        module0089.$g1180$ = null;
        module0089.$g1181$ = null;
        module0089.$g1182$ = null;
        module0089.$g1183$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#4495", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("S#3048", "CYC");
        $ic2$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2959", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("MAP"), (SubLObject)SubLObjectFactory.makeSymbol("S#7776", "CYC"));
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CAPACITY"), (SubLObject)SubLObjectFactory.makeKeyword("MAP"), (SubLObject)SubLObjectFactory.makeKeyword("HEAD-ENTRY"));
        $ic4$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#3049", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#7702", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#7703", "CYC"));
        $ic5$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#7704", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#7705", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#7706", "CYC"));
        $ic6$ = SubLObjectFactory.makeSymbol("S#7722", "CYC");
        $ic7$ = SubLObjectFactory.makeSymbol("S#7701", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#3048", "CYC"));
        $ic9$ = SubLObjectFactory.makeSymbol("S#3049", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("S#7704", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#7702", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#7705", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("S#7703", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("S#7706", "CYC");
        $ic15$ = SubLObjectFactory.makeKeyword("CAPACITY");
        $ic16$ = SubLObjectFactory.makeKeyword("MAP");
        $ic17$ = SubLObjectFactory.makeKeyword("HEAD-ENTRY");
        $ic18$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic19$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic20$ = SubLObjectFactory.makeSymbol("S#7707", "CYC");
        $ic21$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic22$ = SubLObjectFactory.makeKeyword("END");
        $ic23$ = SubLObjectFactory.makeSymbol("S#7709", "CYC");
        $ic24$ = SubLObjectFactory.makeSymbol("S#7699", "CYC");
        $ic25$ = SubLObjectFactory.makeSymbol("S#7700", "CYC");
        $ic26$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#7777", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#131", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#7778", "CYC"));
        $ic27$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NEWER"), (SubLObject)SubLObjectFactory.makeKeyword("KEY"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeKeyword("OLDER"));
        $ic28$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#7711", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#7712", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#7713", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#7714", "CYC"));
        $ic29$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#7715", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#7716", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#7717", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#7718", "CYC"));
        $ic30$ = SubLObjectFactory.makeSymbol("S#7766", "CYC");
        $ic31$ = SubLObjectFactory.makeSymbol("S#7710", "CYC");
        $ic32$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#7700", "CYC"));
        $ic33$ = SubLObjectFactory.makeSymbol("S#7711", "CYC");
        $ic34$ = SubLObjectFactory.makeSymbol("S#7715", "CYC");
        $ic35$ = SubLObjectFactory.makeSymbol("S#7712", "CYC");
        $ic36$ = SubLObjectFactory.makeSymbol("S#7716", "CYC");
        $ic37$ = SubLObjectFactory.makeSymbol("S#7713", "CYC");
        $ic38$ = SubLObjectFactory.makeSymbol("S#7717", "CYC");
        $ic39$ = SubLObjectFactory.makeSymbol("S#7714", "CYC");
        $ic40$ = SubLObjectFactory.makeSymbol("S#7718", "CYC");
        $ic41$ = SubLObjectFactory.makeKeyword("NEWER");
        $ic42$ = SubLObjectFactory.makeKeyword("KEY");
        $ic43$ = SubLObjectFactory.makeKeyword("VALUE");
        $ic44$ = SubLObjectFactory.makeKeyword("OLDER");
        $ic45$ = SubLObjectFactory.makeSymbol("S#7719", "CYC");
        $ic46$ = SubLObjectFactory.makeSymbol("S#7721", "CYC");
        $ic47$ = SubLObjectFactory.makeString("#<CACHE/");
        $ic48$ = SubLObjectFactory.makeString("/");
        $ic49$ = SubLObjectFactory.makeString("(");
        $ic50$ = SubLObjectFactory.makeString(", ");
        $ic51$ = SubLObjectFactory.makeString("...");
        $ic52$ = SubLObjectFactory.makeString(")");
        $ic53$ = SubLObjectFactory.makeString(">");
        $ic54$ = SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P");
        $ic55$ = SubLObjectFactory.makeSymbol("S#2831", "CYC");
        $ic56$ = SubLObjectFactory.makeKeyword("RESOURCED");
        $ic57$ = SubLObjectFactory.makeKeyword("UNKNOWN");
        $ic58$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#131", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#4495", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#7779", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("NEWEST"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic59$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ORDER"));
        $ic60$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic61$ = SubLObjectFactory.makeKeyword("ORDER");
        $ic62$ = SubLObjectFactory.makeKeyword("NEWEST");
        $ic63$ = SubLObjectFactory.makeUninternedSymbol("US#5C5788B");
        $ic64$ = SubLObjectFactory.makeUninternedSymbol("US#3891307");
        $ic65$ = SubLObjectFactory.makeUninternedSymbol("US#13A0444");
        $ic66$ = SubLObjectFactory.makeSymbol("CLET");
        $ic67$ = SubLObjectFactory.makeSymbol("S#7734", "CYC");
        $ic68$ = SubLObjectFactory.makeSymbol("WHILE");
        $ic69$ = SubLObjectFactory.makeSymbol("CNOT");
        $ic70$ = SubLObjectFactory.makeSymbol("S#7735", "CYC");
        $ic71$ = SubLObjectFactory.makeSymbol("CSETQ");
        $ic72$ = SubLObjectFactory.makeSymbol("S#7736", "CYC");
        $ic73$ = SubLObjectFactory.makeSymbol("S#7737", "CYC");
        $ic74$ = SubLObjectFactory.makeSymbol("S#7738", "CYC");
        $ic75$ = SubLObjectFactory.makeKeyword("OLDEST");
        $ic76$ = SubLObjectFactory.makeSymbol("S#7733", "CYC");
        $ic77$ = SubLObjectFactory.makeString("~S was not either :NEWEST or :OLDEST");
        $ic78$ = SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P");
        $ic79$ = SubLObjectFactory.makeSymbol("S#7743", "CYC");
        $ic80$ = SubLObjectFactory.makeSymbol("S#7744", "CYC");
        $ic81$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#5232", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#7776", "CYC"));
        $ic82$ = SubLObjectFactory.makeSymbol("S#7747", "CYC");
        $ic83$ = SubLObjectFactory.makeSymbol("S#7748", "CYC");
        $ic84$ = SubLObjectFactory.makeInteger(63);
        $ic85$ = SubLObjectFactory.makeSymbol("S#7751", "CYC");
        $ic86$ = SubLObjectFactory.makeSymbol("S#7749", "CYC");
        $ic87$ = SubLObjectFactory.makeString(" -> ");
        $ic88$ = SubLObjectFactory.makeInteger(100);
        $ic89$ = SubLObjectFactory.makeSymbol(">");
        $ic90$ = SubLObjectFactory.makeSymbol("CDR");
        $ic91$ = (SubLFloat)SubLObjectFactory.makeDouble(0.5);
        $ic92$ = SubLObjectFactory.makeString("Content iterator ~A was exhausted at item ~A before the entry iterator ~A!");
        $ic93$ = SubLObjectFactory.makeString("The content iterator at item ~A suggests key ~A, but the entry iterator says ~A.");
        $ic94$ = SubLObjectFactory.makeString("The content iterator at item ~A suggests value ~A, but the entry iterator suggests ~A.");
        $ic95$ = SubLObjectFactory.makeString("The content iterator ~A is not exhausted after ~A items, but the entry iterator ~A is done.");
        $ic96$ = SubLObjectFactory.makeString("The two iterators do not seem to have touched every item: ~A items touched, but cache size is ~A.");
    }
    
    public static final class $sX4495_native extends SubLStructNative
    {
        public SubLObject $capacity;
        public SubLObject $map;
        public SubLObject $head_entry;
        private static final SubLStructDeclNative structDecl;
        
        public $sX4495_native() {
            this.$capacity = (SubLObject)CommonSymbols.NIL;
            this.$map = (SubLObject)CommonSymbols.NIL;
            this.$head_entry = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX4495_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$capacity;
        }
        
        public SubLObject getField3() {
            return this.$map;
        }
        
        public SubLObject getField4() {
            return this.$head_entry;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$capacity = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$map = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$head_entry = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX4495_native.class, module0089.$ic0$, module0089.$ic1$, module0089.$ic2$, module0089.$ic3$, new String[] { "$capacity", "$map", "$head_entry" }, module0089.$ic4$, module0089.$ic5$, module0089.$ic6$);
        }
    }
    
    public static final class $f6045$UnaryFunction extends UnaryFunction
    {
        public $f6045$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#3048"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0089.f6045(var3);
        }
    }
    
    public static final class $sX7699_native extends SubLStructNative
    {
        public SubLObject $newer;
        public SubLObject $key;
        public SubLObject $value;
        public SubLObject $older;
        private static final SubLStructDeclNative structDecl;
        
        public $sX7699_native() {
            this.$newer = (SubLObject)CommonSymbols.NIL;
            this.$key = (SubLObject)CommonSymbols.NIL;
            this.$value = (SubLObject)CommonSymbols.NIL;
            this.$older = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX7699_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$newer;
        }
        
        public SubLObject getField3() {
            return this.$key;
        }
        
        public SubLObject getField4() {
            return this.$value;
        }
        
        public SubLObject getField5() {
            return this.$older;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$newer = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$key = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$value = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$older = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX7699_native.class, module0089.$ic24$, module0089.$ic25$, module0089.$ic26$, module0089.$ic27$, new String[] { "$newer", "$key", "$value", "$older" }, module0089.$ic28$, module0089.$ic29$, module0089.$ic30$);
        }
    }
    
    public static final class $f6057$UnaryFunction extends UnaryFunction
    {
        public $f6057$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#7700"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0089.f6057(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0089.class
	Total time: 345 ms
	
	Decompiled with Procyon 0.5.32.
*/