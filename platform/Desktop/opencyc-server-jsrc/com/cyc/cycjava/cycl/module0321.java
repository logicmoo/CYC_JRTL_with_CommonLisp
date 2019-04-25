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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0321 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0321";
    public static final String myFingerPrint = "e4deae80b7b9b84d7da951a411ea5db9875a98350d197bb9c4fa57a03337aeab";
    private static SubLSymbol $g2815$;
    public static SubLSymbol $g2816$;
    public static SubLSymbol $g2817$;
    private static SubLSymbol $g2818$;
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
    private static final SubLString $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLString $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLList $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLObject $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLString $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLString $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLString $ic67$;
    private static final SubLObject $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLString $ic74$;
    private static final SubLString $ic75$;
    private static final SubLString $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLList $ic78$;
    private static final SubLList $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLList $ic84$;
    private static final SubLList $ic85$;
    private static final SubLList $ic86$;
    private static final SubLList $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLList $ic91$;
    
    public static SubLObject f21631(final SubLObject var1, final SubLObject var2) {
        f21632(var1, var2, (SubLObject)module0321.ZERO_INTEGER);
        return (SubLObject)module0321.NIL;
    }
    
    public static SubLObject f21633(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX24186_native.class) ? module0321.T : module0321.NIL);
    }
    
    public static SubLObject f21634(final SubLObject var1) {
        assert module0321.NIL != f21633(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f21635(final SubLObject var1) {
        assert module0321.NIL != f21633(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f21636(final SubLObject var1) {
        assert module0321.NIL != f21633(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f21637(final SubLObject var1) {
        assert module0321.NIL != f21633(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f21638(final SubLObject var1) {
        assert module0321.NIL != f21633(var1) : var1;
        return var1.getField6();
    }
    
    public static SubLObject f21639(final SubLObject var1) {
        assert module0321.NIL != f21633(var1) : var1;
        return var1.getField7();
    }
    
    public static SubLObject f21640(final SubLObject var1) {
        assert module0321.NIL != f21633(var1) : var1;
        return var1.getField8();
    }
    
    public static SubLObject f21641(final SubLObject var1) {
        assert module0321.NIL != f21633(var1) : var1;
        return var1.getField9();
    }
    
    public static SubLObject f21642(final SubLObject var1) {
        assert module0321.NIL != f21633(var1) : var1;
        return var1.getField10();
    }
    
    public static SubLObject f21643(final SubLObject var1) {
        assert module0321.NIL != f21633(var1) : var1;
        return var1.getField11();
    }
    
    public static SubLObject f21644(final SubLObject var1) {
        assert module0321.NIL != f21633(var1) : var1;
        return var1.getField12();
    }
    
    public static SubLObject f21645(final SubLObject var1) {
        assert module0321.NIL != f21633(var1) : var1;
        return var1.getField13();
    }
    
    public static SubLObject f21646(final SubLObject var1, final SubLObject var4) {
        assert module0321.NIL != f21633(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f21647(final SubLObject var1, final SubLObject var4) {
        assert module0321.NIL != f21633(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f21648(final SubLObject var1, final SubLObject var4) {
        assert module0321.NIL != f21633(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f21649(final SubLObject var1, final SubLObject var4) {
        assert module0321.NIL != f21633(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f21650(final SubLObject var1, final SubLObject var4) {
        assert module0321.NIL != f21633(var1) : var1;
        return var1.setField6(var4);
    }
    
    public static SubLObject f21651(final SubLObject var1, final SubLObject var4) {
        assert module0321.NIL != f21633(var1) : var1;
        return var1.setField7(var4);
    }
    
    public static SubLObject f21652(final SubLObject var1, final SubLObject var4) {
        assert module0321.NIL != f21633(var1) : var1;
        return var1.setField8(var4);
    }
    
    public static SubLObject f21653(final SubLObject var1, final SubLObject var4) {
        assert module0321.NIL != f21633(var1) : var1;
        return var1.setField9(var4);
    }
    
    public static SubLObject f21654(final SubLObject var1, final SubLObject var4) {
        assert module0321.NIL != f21633(var1) : var1;
        return var1.setField10(var4);
    }
    
    public static SubLObject f21655(final SubLObject var1, final SubLObject var4) {
        assert module0321.NIL != f21633(var1) : var1;
        return var1.setField11(var4);
    }
    
    public static SubLObject f21656(final SubLObject var1, final SubLObject var4) {
        assert module0321.NIL != f21633(var1) : var1;
        return var1.setField12(var4);
    }
    
    public static SubLObject f21657(final SubLObject var1, final SubLObject var4) {
        assert module0321.NIL != f21633(var1) : var1;
        return var1.setField13(var4);
    }
    
    public static SubLObject f21658(SubLObject var5) {
        if (var5 == module0321.UNPROVIDED) {
            var5 = (SubLObject)module0321.NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX24186_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0321.NIL, var7 = var5; module0321.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0321.$ic33$)) {
                f21646(var6, var9);
            }
            else if (var10.eql((SubLObject)module0321.$ic34$)) {
                f21647(var6, var9);
            }
            else if (var10.eql((SubLObject)module0321.$ic35$)) {
                f21648(var6, var9);
            }
            else if (var10.eql((SubLObject)module0321.$ic36$)) {
                f21649(var6, var9);
            }
            else if (var10.eql((SubLObject)module0321.$ic37$)) {
                f21650(var6, var9);
            }
            else if (var10.eql((SubLObject)module0321.$ic38$)) {
                f21651(var6, var9);
            }
            else if (var10.eql((SubLObject)module0321.$ic39$)) {
                f21652(var6, var9);
            }
            else if (var10.eql((SubLObject)module0321.$ic40$)) {
                f21653(var6, var9);
            }
            else if (var10.eql((SubLObject)module0321.$ic41$)) {
                f21654(var6, var9);
            }
            else if (var10.eql((SubLObject)module0321.$ic42$)) {
                f21655(var6, var9);
            }
            else if (var10.eql((SubLObject)module0321.$ic43$)) {
                f21656(var6, var9);
            }
            else if (var10.eql((SubLObject)module0321.$ic44$)) {
                f21657(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0321.$ic45$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f21659(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0321.$ic46$, (SubLObject)module0321.$ic47$, (SubLObject)module0321.TWELVE_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)module0321.$ic48$, (SubLObject)module0321.$ic33$, f21634(var11));
        Functions.funcall(var12, var11, (SubLObject)module0321.$ic48$, (SubLObject)module0321.$ic34$, f21635(var11));
        Functions.funcall(var12, var11, (SubLObject)module0321.$ic48$, (SubLObject)module0321.$ic35$, f21636(var11));
        Functions.funcall(var12, var11, (SubLObject)module0321.$ic48$, (SubLObject)module0321.$ic36$, f21637(var11));
        Functions.funcall(var12, var11, (SubLObject)module0321.$ic48$, (SubLObject)module0321.$ic37$, f21638(var11));
        Functions.funcall(var12, var11, (SubLObject)module0321.$ic48$, (SubLObject)module0321.$ic38$, f21639(var11));
        Functions.funcall(var12, var11, (SubLObject)module0321.$ic48$, (SubLObject)module0321.$ic39$, f21640(var11));
        Functions.funcall(var12, var11, (SubLObject)module0321.$ic48$, (SubLObject)module0321.$ic40$, f21641(var11));
        Functions.funcall(var12, var11, (SubLObject)module0321.$ic48$, (SubLObject)module0321.$ic41$, f21642(var11));
        Functions.funcall(var12, var11, (SubLObject)module0321.$ic48$, (SubLObject)module0321.$ic42$, f21643(var11));
        Functions.funcall(var12, var11, (SubLObject)module0321.$ic48$, (SubLObject)module0321.$ic43$, f21644(var11));
        Functions.funcall(var12, var11, (SubLObject)module0321.$ic48$, (SubLObject)module0321.$ic44$, f21645(var11));
        Functions.funcall(var12, var11, (SubLObject)module0321.$ic49$, (SubLObject)module0321.$ic47$, (SubLObject)module0321.TWELVE_INTEGER);
        return var11;
    }
    
    public static SubLObject f21660(final SubLObject var11, final SubLObject var12) {
        return f21659(var11, var12);
    }
    
    public static SubLObject f21632(final SubLObject var13, final SubLObject var2, final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        if (module0321.NIL != print_high.$print_readably$.getDynamicValue(var15)) {
            print_high.print_not_readable(var13, var2);
        }
        else {
            streams_high.write_string((SubLObject)module0321.$ic51$, var2, (SubLObject)module0321.UNPROVIDED, (SubLObject)module0321.UNPROVIDED);
            PrintLow.write((SubLObject)Types.type_of(var13), new SubLObject[] { module0321.$ic52$, var2 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var2);
            PrintLow.write(Equality.pointer(var13), new SubLObject[] { module0321.$ic52$, var2, module0321.$ic53$, module0321.SIXTEEN_INTEGER });
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var2);
        }
        return (SubLObject)module0321.NIL;
    }
    
    public static SubLObject f21661(final SubLObject var19, final SubLObject var20, final SubLObject var21) {
        final SubLThread var22 = SubLProcess.currentSubLThread();
        final SubLObject var23 = module0321.$g2817$.getDynamicValue(var22);
        f21647(var23, module0205.f13333(var19));
        f21648(var23, f21662(var19));
        f21649(var23, f21663(var19));
        f21650(var23, f21664(var19));
        f21651(var23, f21665(var19));
        f21652(var23, module0067.f4880((SubLObject)module0321.UNPROVIDED, (SubLObject)module0321.UNPROVIDED));
        f21653(var23, module0067.f4880(Symbols.symbol_function((SubLObject)module0321.EQUAL), (SubLObject)module0321.UNPROVIDED));
        f21654(var23, var20);
        f21656(var23, f21666(var19));
        f21655(var23, var21);
        return var23;
    }
    
    public static SubLObject f21667(final SubLObject var22) {
        return f21635(var22);
    }
    
    public static SubLObject f21668(final SubLObject var22) {
        return f21636(var22);
    }
    
    public static SubLObject f21669(final SubLObject var22) {
        return f21637(var22);
    }
    
    public static SubLObject f21670(final SubLObject var22) {
        return f21638(var22);
    }
    
    public static SubLObject f21671(final SubLObject var22) {
        return f21639(var22);
    }
    
    public static SubLObject f21672(final SubLObject var22) {
        return f21640(var22);
    }
    
    public static SubLObject f21673(final SubLObject var22) {
        return f21641(var22);
    }
    
    public static SubLObject f21674(final SubLObject var22) {
        return f21643(var22);
    }
    
    public static SubLObject f21675(final SubLObject var22) {
        return f21642(var22);
    }
    
    public static SubLObject f21676(final SubLObject var22) {
        return f21644(var22);
    }
    
    public static SubLObject f21677(final SubLObject var22) {
        return f21645(var22);
    }
    
    public static SubLObject f21678(final SubLObject var22, final SubLObject var23) {
        return Vectors.aref(f21668(var22), var23);
    }
    
    public static SubLObject f21679(final SubLObject var22, final SubLObject var23) {
        return Vectors.aref(f21669(var22), var23);
    }
    
    public static SubLObject f21680(final SubLObject var22, final SubLObject var24, final SubLObject var25) {
        module0067.f4886(f21640(var22), var24, var25);
        return (SubLObject)module0321.NIL;
    }
    
    public static SubLObject f21681(final SubLObject var22, final SubLObject var26, final SubLObject var27) {
        module0067.f4886(f21641(var22), var26, var27);
        return (SubLObject)module0321.NIL;
    }
    
    public static SubLObject f21682(final SubLObject var22, final SubLObject var23, final SubLObject var28) {
        Vectors.set_aref(f21669(var22), module0048.f_1_(var23), var28);
        return (SubLObject)module0321.NIL;
    }
    
    public static SubLObject f21683(final SubLObject var29, final SubLObject var30) {
        final SubLObject var31 = var29.rest();
        final SubLObject var33;
        final SubLObject var32 = var33 = var31;
        return (SubLObject)ConsesLow.listS((SubLObject)module0321.$ic54$, (SubLObject)module0321.$ic55$, ConsesLow.append(var33, (SubLObject)module0321.NIL));
    }
    
    public static SubLObject f21684() {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        return f21667(module0321.$g2817$.getDynamicValue(var15));
    }
    
    public static SubLObject f21685() {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        return f21671(module0321.$g2817$.getDynamicValue(var15));
    }
    
    public static SubLObject f21686(final SubLObject var34) {
        SubLObject var35 = (SubLObject)module0321.NIL;
        if (module0321.NIL == var35) {
            SubLObject var36 = f21685();
            SubLObject var37 = (SubLObject)module0321.NIL;
            var37 = var36.first();
            while (module0321.NIL == var35 && module0321.NIL != var36) {
                if (var37.first().eql(var34)) {
                    var35 = conses_high.second(var37);
                }
                var36 = var36.rest();
                var37 = var36.first();
            }
        }
        return var35;
    }
    
    public static SubLObject f21687() {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        return f21670(module0321.$g2817$.getDynamicValue(var15));
    }
    
    public static SubLObject f21688(final SubLObject var23) {
        final SubLThread var24 = SubLProcess.currentSubLThread();
        return f21678(module0321.$g2817$.getDynamicValue(var24), module0048.f_1_(var23));
    }
    
    public static SubLObject f21689(final SubLObject var23) {
        final SubLThread var24 = SubLProcess.currentSubLThread();
        return f21679(module0321.$g2817$.getDynamicValue(var24), module0048.f_1_(var23));
    }
    
    public static SubLObject f21690(final SubLObject var23) {
        final SubLThread var24 = SubLProcess.currentSubLThread();
        f21682(module0321.$g2817$.getDynamicValue(var24), var23, (SubLObject)module0321.T);
        return (SubLObject)module0321.NIL;
    }
    
    public static SubLObject f21691(final SubLObject var23) {
        final SubLThread var24 = SubLProcess.currentSubLThread();
        f21682(module0321.$g2817$.getDynamicValue(var24), var23, (SubLObject)module0321.$ic56$);
        return (SubLObject)module0321.NIL;
    }
    
    public static SubLObject f21692() {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        return f21675(module0321.$g2817$.getDynamicValue(var15));
    }
    
    public static SubLObject f21693() {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        return f21674(module0321.$g2817$.getDynamicValue(var15));
    }
    
    public static SubLObject f21694(final SubLObject var24) {
        final SubLThread var25 = SubLProcess.currentSubLThread();
        return module0067.f4884(f21672(module0321.$g2817$.getDynamicValue(var25)), var24, (SubLObject)module0321.UNPROVIDED);
    }
    
    public static SubLObject f21695(final SubLObject var24, final SubLObject var25) {
        final SubLThread var26 = SubLProcess.currentSubLThread();
        f21680(module0321.$g2817$.getDynamicValue(var26), var24, var25);
        return (SubLObject)module0321.NIL;
    }
    
    public static SubLObject f21696(final SubLObject var37) {
        final SubLThread var38 = SubLProcess.currentSubLThread();
        return Equality.eq(var37, f21676(module0321.$g2817$.getDynamicValue(var38)));
    }
    
    public static SubLObject f21697() {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        return f21673(module0321.$g2817$.getDynamicValue(var15));
    }
    
    public static SubLObject f21698(final SubLObject var26, final SubLObject var27) {
        final SubLThread var28 = SubLProcess.currentSubLThread();
        f21681(module0321.$g2817$.getDynamicValue(var28), var26, var27);
        return (SubLObject)module0321.NIL;
    }
    
    public static SubLObject f21699(final SubLObject var38, final SubLObject var39) {
        final SubLThread var40 = SubLProcess.currentSubLThread();
        final SubLObject var41 = (SubLObject)ConsesLow.list(var38, var39);
        SubLObject var42 = module0067.f4884(f21697(), var41, (SubLObject)module0321.UNPROVIDED);
        if (module0321.NIL != var42) {
            return var42;
        }
        final SubLObject var43 = module0240.f15611();
        final SubLObject var44 = module0240.f15611();
        var42 = (SubLObject)ConsesLow.list(var43, var44);
        if (module0321.NIL != module0321.$g2818$.getDynamicValue(var40)) {
            f21698(var41, var42);
        }
        return var42;
    }
    
    public static SubLObject f21700() {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        return f21677(module0321.$g2817$.getDynamicValue(var15));
    }
    
    public static SubLObject f21701(final SubLObject var42) {
        final SubLThread var43 = SubLProcess.currentSubLThread();
        f21657(module0321.$g2817$.getDynamicValue(var43), ConsesLow.nconc(var42, f21700()));
        return (SubLObject)module0321.NIL;
    }
    
    public static SubLObject f21664(final SubLObject var19) {
        SubLObject var20 = (SubLObject)module0321.NIL;
        SubLObject var21 = module0035.f2160(module0202.f12728(var19, (SubLObject)module0321.UNPROVIDED), (SubLObject)module0321.UNPROVIDED).rest();
        SubLObject var22 = (SubLObject)module0321.NIL;
        var22 = var21.first();
        while (module0321.NIL != var21) {
            if (module0321.NIL != module0193.f12105(module0205.f13384(var19, var22, (SubLObject)module0321.UNPROVIDED))) {
                var20 = (SubLObject)ConsesLow.cons(var22, var20);
            }
            var21 = var21.rest();
            var22 = var21.first();
        }
        return Sequences.nreverse(var20);
    }
    
    public static SubLObject f21665(final SubLObject var19) {
        SubLObject var20 = (SubLObject)module0321.NIL;
        SubLObject var21 = module0035.f2160(module0202.f12728(var19, (SubLObject)module0321.UNPROVIDED), (SubLObject)module0321.UNPROVIDED).rest();
        SubLObject var22 = (SubLObject)module0321.NIL;
        var22 = var21.first();
        while (module0321.NIL != var21) {
            if (module0321.NIL != module0206.f13500(module0205.f13384(var19, var22, (SubLObject)module0321.UNPROVIDED))) {
                var20 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(module0205.f13384(var19, var22, (SubLObject)module0321.UNPROVIDED), var22), var20);
            }
            var21 = var21.rest();
            var22 = var21.first();
        }
        return Sequences.nreverse(var20);
    }
    
    public static SubLObject f21666(final SubLObject var19) {
        if (module0321.NIL != module0193.f12105(var19)) {
            return module0288.f19338(var19, (SubLObject)module0321.UNPROVIDED);
        }
        return (SubLObject)module0321.NIL;
    }
    
    public static SubLObject f21662(final SubLObject var19) {
        final SubLObject var20 = module0202.f12725(var19, (SubLObject)module0321.UNPROVIDED);
        final SubLObject var21 = Vectors.make_vector(var20, (SubLObject)module0321.UNPROVIDED);
        SubLObject var22;
        for (var22 = (SubLObject)module0321.NIL, var22 = (SubLObject)module0321.ZERO_INTEGER; var22.numL(var20); var22 = Numbers.add(var22, (SubLObject)module0321.ONE_INTEGER)) {
            Vectors.set_aref(var21, var22, module0205.f13384(var19, Numbers.add((SubLObject)module0321.ONE_INTEGER, var22), (SubLObject)module0321.UNPROVIDED));
        }
        return var21;
    }
    
    public static SubLObject f21663(final SubLObject var19) {
        final SubLObject var20 = module0202.f12725(var19, (SubLObject)module0321.UNPROVIDED);
        final SubLObject var21 = Vectors.make_vector(var20, (SubLObject)module0321.UNPROVIDED);
        return var21;
    }
    
    public static SubLObject f21702(final SubLObject var19, SubLObject var49, SubLObject var50, SubLObject var51, SubLObject var52, SubLObject var53, SubLObject var54) {
        if (var49 == module0321.UNPROVIDED) {
            var49 = (SubLObject)module0321.NIL;
        }
        if (var50 == module0321.UNPROVIDED) {
            var50 = (SubLObject)module0321.NIL;
        }
        if (var51 == module0321.UNPROVIDED) {
            var51 = (SubLObject)module0321.NIL;
        }
        if (var52 == module0321.UNPROVIDED) {
            var52 = (SubLObject)module0321.$ic57$;
        }
        if (var53 == module0321.UNPROVIDED) {
            var53 = (SubLObject)module0321.T;
        }
        if (var54 == module0321.UNPROVIDED) {
            var54 = (SubLObject)module0321.NIL;
        }
        final SubLThread var55 = SubLProcess.currentSubLThread();
        var55.resetMultipleValues();
        SubLObject var56 = f21703(var19, var49, var50, var51);
        final SubLObject var57 = var55.secondMultipleValue();
        var55.resetMultipleValues();
        if (module0321.NIL != var57) {
            SubLObject var58 = (SubLObject)module0321.NIL;
            final SubLObject var59 = var49;
            final SubLObject var60 = module0147.$g2095$.currentBinding(var55);
            final SubLObject var61 = module0147.$g2094$.currentBinding(var55);
            final SubLObject var62 = module0147.$g2096$.currentBinding(var55);
            final SubLObject var63 = module0321.$g2817$.currentBinding(var55);
            try {
                module0147.$g2095$.bind(module0147.f9545(var59), var55);
                module0147.$g2094$.bind(module0147.f9546(var59), var55);
                module0147.$g2096$.bind(module0147.f9549(var59), var55);
                module0321.$g2817$.bind(f21658((SubLObject)module0321.UNPROVIDED), var55);
                f21661(var19, var50, var51);
                try {
                    var55.throwStack.push(module0321.$ic58$);
                    final SubLObject var64 = module0320.f21619();
                    final SubLObject var59_64 = module0141.$g1670$.currentBinding(var55);
                    final SubLObject var60_65 = module0141.$g1671$.currentBinding(var55);
                    final SubLObject var61_66 = module0141.$g1672$.currentBinding(var55);
                    final SubLObject var62_67 = module0141.$g1674$.currentBinding(var55);
                    final SubLObject var65 = module0137.$g1605$.currentBinding(var55);
                    try {
                        module0141.$g1670$.bind(module0137.f8955(module0321.$ic59$), var55);
                        module0141.$g1671$.bind(module0244.f15739(module0137.f8955(module0321.$ic59$)), var55);
                        module0141.$g1672$.bind(module0244.f15746(module0137.f8955(module0321.$ic59$)), var55);
                        module0141.$g1674$.bind((SubLObject)module0321.NIL, var55);
                        module0137.$g1605$.bind(module0137.f8955(module0321.$ic59$), var55);
                        final SubLObject var58_69 = var49;
                        final SubLObject var59_65 = module0147.$g2095$.currentBinding(var55);
                        final SubLObject var60_66 = module0147.$g2094$.currentBinding(var55);
                        final SubLObject var61_67 = module0147.$g2096$.currentBinding(var55);
                        try {
                            module0147.$g2095$.bind(module0147.f9545(var58_69), var55);
                            module0147.$g2094$.bind(module0147.f9546(var58_69), var55);
                            module0147.$g2096$.bind(module0147.f9549(var58_69), var55);
                            final SubLObject var66 = (SubLObject)module0321.NIL;
                            final SubLObject var59_66 = module0141.$g1714$.currentBinding(var55);
                            final SubLObject var60_67 = module0141.$g1715$.currentBinding(var55);
                            try {
                                module0141.$g1714$.bind((module0321.NIL != var66) ? var66 : module0141.f9283(), var55);
                                module0141.$g1715$.bind((SubLObject)((module0321.NIL != var66) ? module0321.$ic60$ : module0141.$g1715$.getDynamicValue(var55)), var55);
                                if (module0321.NIL != var66 && module0321.NIL != module0136.f8864() && module0321.NIL == module0141.f9279(var66)) {
                                    final SubLObject var67 = module0136.$g1591$.getDynamicValue(var55);
                                    if (var67.eql((SubLObject)module0321.$ic61$)) {
                                        module0136.f8870((SubLObject)module0321.ONE_INTEGER, (SubLObject)module0321.$ic62$, var66, (SubLObject)module0321.$ic63$, (SubLObject)module0321.UNPROVIDED, (SubLObject)module0321.UNPROVIDED, (SubLObject)module0321.UNPROVIDED);
                                    }
                                    else if (var67.eql((SubLObject)module0321.$ic64$)) {
                                        module0136.f8871((SubLObject)module0321.ONE_INTEGER, (SubLObject)module0321.$ic65$, (SubLObject)module0321.$ic62$, var66, (SubLObject)module0321.$ic63$, (SubLObject)module0321.UNPROVIDED, (SubLObject)module0321.UNPROVIDED, (SubLObject)module0321.UNPROVIDED);
                                    }
                                    else if (var67.eql((SubLObject)module0321.$ic66$)) {
                                        Errors.warn((SubLObject)module0321.$ic62$, var66, (SubLObject)module0321.$ic63$);
                                    }
                                    else {
                                        Errors.warn((SubLObject)module0321.$ic67$, module0136.$g1591$.getDynamicValue(var55));
                                        Errors.cerror((SubLObject)module0321.$ic65$, (SubLObject)module0321.$ic62$, var66, (SubLObject)module0321.$ic63$);
                                    }
                                }
                                final SubLObject var59_67 = module0141.$g1710$.currentBinding(var55);
                                final SubLObject var60_68 = module0141.$g1677$.currentBinding(var55);
                                final SubLObject var61_68 = module0138.$g1619$.currentBinding(var55);
                                try {
                                    module0141.$g1710$.bind(module0321.$ic68$, var55);
                                    module0141.$g1677$.bind(module0141.f9210(), var55);
                                    module0138.$g1619$.bind(module0244.f15780(module0137.f8955((SubLObject)module0321.UNPROVIDED)), var55);
                                    final SubLObject var68 = module0139.f9036();
                                    final SubLObject var59_68 = module0139.$g1635$.currentBinding(var55);
                                    try {
                                        module0139.$g1635$.bind((var68 == module0321.$ic69$) ? module0139.$g1635$.getDynamicValue(var55) : module0139.f9038(var68), var55);
                                        final SubLObject var59_69 = module0139.$g1636$.currentBinding(var55);
                                        try {
                                            module0139.$g1636$.bind((var68 == module0321.$ic69$) ? module0139.$g1636$.getDynamicValue(var55) : module0139.f9038(var68), var55);
                                            final SubLObject var59_70 = module0141.$g1685$.currentBinding(var55);
                                            final SubLObject var60_69 = module0141.$g1686$.currentBinding(var55);
                                            final SubLObject var61_69 = module0141.$g1683$.currentBinding(var55);
                                            final SubLObject var62_68 = module0141.$g1684$.currentBinding(var55);
                                            final SubLObject var68_86 = module0141.$g1674$.currentBinding(var55);
                                            try {
                                                module0141.$g1685$.bind((SubLObject)module0321.NIL, var55);
                                                module0141.$g1686$.bind((SubLObject)module0321.NIL, var55);
                                                module0141.$g1683$.bind((SubLObject)module0321.NIL, var55);
                                                module0141.$g1684$.bind((SubLObject)module0321.NIL, var55);
                                                module0141.$g1674$.bind((SubLObject)module0321.NIL, var55);
                                                final SubLObject var69 = module0138.$g1626$.getGlobalValue();
                                                SubLObject var70 = (SubLObject)module0321.NIL;
                                                try {
                                                    var70 = ReadWriteLocks.rw_lock_seize_read_lock(var69);
                                                    var55.resetMultipleValues();
                                                    final SubLObject var71 = module0318.f21450(f21684(), var54);
                                                    final SubLObject var72 = var55.secondMultipleValue();
                                                    var55.resetMultipleValues();
                                                    SubLObject var73;
                                                    SubLObject var74;
                                                    for (var73 = (SubLObject)module0321.NIL, var73 = var71; (module0321.NIL == f21692() || module0321.NIL == f21700()) && module0321.NIL != var73; var73 = var73.rest()) {
                                                        var74 = var73.first();
                                                        f21704(var74, var64);
                                                    }
                                                    final SubLObject var59_71 = module0141.$g1674$.currentBinding(var55);
                                                    try {
                                                        module0141.$g1674$.bind((SubLObject)module0321.T, var55);
                                                        SubLObject var75;
                                                        SubLObject var76;
                                                        for (var75 = (SubLObject)module0321.NIL, var75 = var72; (module0321.NIL == f21692() || module0321.NIL == f21700()) && module0321.NIL != var75; var75 = var75.rest()) {
                                                            var76 = var75.first();
                                                            f21704(var76, var64);
                                                        }
                                                    }
                                                    finally {
                                                        module0141.$g1674$.rebind(var59_71, var55);
                                                    }
                                                }
                                                finally {
                                                    if (module0321.NIL != var70) {
                                                        ReadWriteLocks.rw_lock_release_read_lock(var69);
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var68_86, var55);
                                                module0141.$g1684$.rebind(var62_68, var55);
                                                module0141.$g1683$.rebind(var61_69, var55);
                                                module0141.$g1686$.rebind(var60_69, var55);
                                                module0141.$g1685$.rebind(var59_70, var55);
                                            }
                                            if (var68 == module0321.$ic70$) {
                                                module0139.f9012(module0139.$g1636$.getDynamicValue(var55));
                                            }
                                        }
                                        finally {
                                            module0139.$g1636$.rebind(var59_69, var55);
                                        }
                                        if (var68 == module0321.$ic70$) {
                                            module0139.f9012(module0139.$g1635$.getDynamicValue(var55));
                                        }
                                    }
                                    finally {
                                        module0139.$g1635$.rebind(var59_68, var55);
                                    }
                                }
                                finally {
                                    module0138.$g1619$.rebind(var61_68, var55);
                                    module0141.$g1677$.rebind(var60_68, var55);
                                    module0141.$g1710$.rebind(var59_67, var55);
                                }
                            }
                            finally {
                                module0141.$g1715$.rebind(var60_67, var55);
                                module0141.$g1714$.rebind(var59_66, var55);
                            }
                        }
                        finally {
                            module0147.$g2096$.rebind(var61_67, var55);
                            module0147.$g2094$.rebind(var60_66, var55);
                            module0147.$g2095$.rebind(var59_65, var55);
                        }
                    }
                    finally {
                        module0137.$g1605$.rebind(var65, var55);
                        module0141.$g1674$.rebind(var62_67, var55);
                        module0141.$g1672$.rebind(var61_66, var55);
                        module0141.$g1671$.rebind(var60_65, var55);
                        module0141.$g1670$.rebind(var59_64, var55);
                    }
                }
                catch (Throwable var77) {
                    var58 = Errors.handleThrowable(var77, (SubLObject)module0321.$ic58$);
                }
                finally {
                    var55.throwStack.pop();
                }
                var56 = module0035.f2269(f21700(), Symbols.symbol_function((SubLObject)module0321.EQUAL), (SubLObject)module0321.UNPROVIDED, (SubLObject)module0321.UNPROVIDED, (SubLObject)module0321.UNPROVIDED, (SubLObject)module0321.UNPROVIDED);
                if (module0321.NIL == var50) {
                    var56 = f21705(var56, var52);
                }
            }
            finally {
                module0321.$g2817$.rebind(var63, var55);
                module0147.$g2096$.rebind(var62, var55);
                module0147.$g2094$.rebind(var61, var55);
                module0147.$g2095$.rebind(var60, var55);
            }
        }
        else if (module0321.NIL == var53) {
            final SubLObject var79;
            final SubLObject var78 = var79 = module0205.f13333(var19);
            final SubLObject var80 = (SubLObject)module0321.$ic73$;
            final SubLObject var81 = module0056.f4145(var80);
            SubLObject var82 = (SubLObject)module0321.NIL;
            final SubLObject var83 = module0139.$g1635$.currentBinding(var55);
            try {
                module0139.$g1635$.bind(module0139.f9007(), var55);
                final SubLObject var84 = (SubLObject)module0321.NIL;
                final SubLObject var59_72 = module0141.$g1714$.currentBinding(var55);
                final SubLObject var85 = module0141.$g1715$.currentBinding(var55);
                try {
                    module0141.$g1714$.bind((module0321.NIL != var84) ? var84 : module0141.f9283(), var55);
                    module0141.$g1715$.bind((SubLObject)((module0321.NIL != var84) ? module0321.$ic60$ : module0141.$g1715$.getDynamicValue(var55)), var55);
                    if (module0321.NIL != var84 && module0321.NIL != module0136.f8864() && module0321.NIL == module0141.f9279(var84)) {
                        final SubLObject var86 = module0136.$g1591$.getDynamicValue(var55);
                        if (var86.eql((SubLObject)module0321.$ic61$)) {
                            module0136.f8870((SubLObject)module0321.ONE_INTEGER, (SubLObject)module0321.$ic62$, var84, (SubLObject)module0321.$ic63$, (SubLObject)module0321.UNPROVIDED, (SubLObject)module0321.UNPROVIDED, (SubLObject)module0321.UNPROVIDED);
                        }
                        else if (var86.eql((SubLObject)module0321.$ic64$)) {
                            module0136.f8871((SubLObject)module0321.ONE_INTEGER, (SubLObject)module0321.$ic65$, (SubLObject)module0321.$ic62$, var84, (SubLObject)module0321.$ic63$, (SubLObject)module0321.UNPROVIDED, (SubLObject)module0321.UNPROVIDED, (SubLObject)module0321.UNPROVIDED);
                        }
                        else if (var86.eql((SubLObject)module0321.$ic66$)) {
                            Errors.warn((SubLObject)module0321.$ic62$, var84, (SubLObject)module0321.$ic63$);
                        }
                        else {
                            Errors.warn((SubLObject)module0321.$ic67$, module0136.$g1591$.getDynamicValue(var55));
                            Errors.cerror((SubLObject)module0321.$ic65$, (SubLObject)module0321.$ic62$, var84, (SubLObject)module0321.$ic63$);
                        }
                    }
                    final SubLObject var59_73 = module0141.$g1670$.currentBinding(var55);
                    final SubLObject var60_70 = module0141.$g1671$.currentBinding(var55);
                    final SubLObject var87 = module0141.$g1672$.currentBinding(var55);
                    final SubLObject var88 = module0141.$g1674$.currentBinding(var55);
                    final SubLObject var89 = module0137.$g1605$.currentBinding(var55);
                    try {
                        module0141.$g1670$.bind(module0137.f8955(module0321.$ic59$), var55);
                        module0141.$g1671$.bind(module0244.f15739(module0137.f8955(module0321.$ic59$)), var55);
                        module0141.$g1672$.bind(module0244.f15746(module0137.f8955(module0321.$ic59$)), var55);
                        module0141.$g1674$.bind((SubLObject)module0321.NIL, var55);
                        module0137.$g1605$.bind(module0137.f8955(module0321.$ic59$), var55);
                        if (module0321.NIL != module0136.f8865() || module0321.NIL != module0244.f15795(var78, module0137.f8955((SubLObject)module0321.UNPROVIDED))) {
                            final SubLObject var59_74 = module0141.$g1677$.currentBinding(var55);
                            final SubLObject var60_71 = module0138.$g1619$.currentBinding(var55);
                            final SubLObject var61_70 = module0141.$g1674$.currentBinding(var55);
                            try {
                                module0141.$g1677$.bind(module0141.f9210(), var55);
                                module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0137.f8955(module0321.$ic59$)), var55);
                                module0141.$g1674$.bind((SubLObject)module0321.NIL, var55);
                                module0249.f16055(var79, (SubLObject)module0321.UNPROVIDED);
                                for (var82 = (SubLObject)ConsesLow.list(var78, module0141.f9195()); module0321.NIL != var82; var82 = module0056.f4150(var81)) {
                                    final SubLObject var96_106 = var82.first();
                                    final SubLObject var90 = conses_high.second(var82);
                                    final SubLObject var91 = var96_106;
                                    final SubLObject var59_75 = module0141.$g1674$.currentBinding(var55);
                                    try {
                                        module0141.$g1674$.bind(var90, var55);
                                        final SubLObject var92 = var90;
                                        if (!var91.equal(var78) && module0321.NIL != module0318.f21438(var91)) {
                                            final SubLObject var93 = (module0321.NIL != var92) ? module0202.f12720(var91, Sequences.reverse(module0205.f13385(var19, (SubLObject)module0321.UNPROVIDED)), (SubLObject)module0321.UNPROVIDED) : module0202.f12817((SubLObject)module0321.ZERO_INTEGER, var91, var19);
                                            SubLObject var94 = f21702(var93, var49, var50, var51, var52, (SubLObject)module0321.T, (SubLObject)module0321.UNPROVIDED);
                                            SubLObject var95 = (SubLObject)module0321.NIL;
                                            var95 = var94.first();
                                            while (module0321.NIL != var94) {
                                                final SubLObject var96 = var95;
                                                if (module0321.NIL == conses_high.member(var96, var56, Symbols.symbol_function((SubLObject)module0321.EQUAL), Symbols.symbol_function((SubLObject)module0321.IDENTITY))) {
                                                    var56 = (SubLObject)ConsesLow.cons(var96, var56);
                                                }
                                                var94 = var94.rest();
                                                var95 = var94.first();
                                            }
                                        }
                                        SubLObject var94;
                                        final SubLObject var97 = var94 = module0200.f12443(module0137.f8955(module0321.$ic59$));
                                        SubLObject var98 = (SubLObject)module0321.NIL;
                                        var98 = var94.first();
                                        while (module0321.NIL != var94) {
                                            final SubLObject var59_76 = module0137.$g1605$.currentBinding(var55);
                                            final SubLObject var60_72 = module0141.$g1674$.currentBinding(var55);
                                            try {
                                                module0137.$g1605$.bind(var98, var55);
                                                module0141.$g1674$.bind((SubLObject)((module0321.NIL != module0141.f9205((SubLObject)module0321.UNPROVIDED, (SubLObject)module0321.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0321.NIL == module0141.$g1674$.getDynamicValue(var55)) : module0141.$g1674$.getDynamicValue(var55)), var55);
                                                final SubLObject var99 = module0228.f15229(var96_106);
                                                if (module0321.NIL != module0138.f8992(var99)) {
                                                    final SubLObject var100 = module0242.f15664(var99, module0137.f8955((SubLObject)module0321.UNPROVIDED));
                                                    if (module0321.NIL != var100) {
                                                        final SubLObject var101 = module0245.f15834(var100, module0138.f8979(), module0137.f8955((SubLObject)module0321.UNPROVIDED));
                                                        if (module0321.NIL != var101) {
                                                            SubLObject var102;
                                                            for (var102 = module0066.f4838(module0067.f4891(var101)); module0321.NIL == module0066.f4841(var102); var102 = module0066.f4840(var102)) {
                                                                var55.resetMultipleValues();
                                                                final SubLObject var122_123 = module0066.f4839(var102);
                                                                final SubLObject var103 = var55.secondMultipleValue();
                                                                var55.resetMultipleValues();
                                                                if (module0321.NIL != module0147.f9507(var122_123)) {
                                                                    final SubLObject var59_77 = module0138.$g1623$.currentBinding(var55);
                                                                    try {
                                                                        module0138.$g1623$.bind(var122_123, var55);
                                                                        SubLObject var121_126;
                                                                        for (var121_126 = module0066.f4838(module0067.f4891(var103)); module0321.NIL == module0066.f4841(var121_126); var121_126 = module0066.f4840(var121_126)) {
                                                                            var55.resetMultipleValues();
                                                                            final SubLObject var104 = module0066.f4839(var121_126);
                                                                            final SubLObject var105 = var55.secondMultipleValue();
                                                                            var55.resetMultipleValues();
                                                                            if (module0321.NIL != module0141.f9289(var104)) {
                                                                                final SubLObject var59_78 = module0138.$g1624$.currentBinding(var55);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var104, var55);
                                                                                    final SubLObject var106 = var105;
                                                                                    if (module0321.NIL != module0077.f5302(var106)) {
                                                                                        final SubLObject var107 = module0077.f5333(var106);
                                                                                        SubLObject var108;
                                                                                        SubLObject var109;
                                                                                        SubLObject var110;
                                                                                        for (var108 = module0032.f1741(var107), var109 = (SubLObject)module0321.NIL, var109 = module0032.f1742(var108, var107); module0321.NIL == module0032.f1744(var108, var109); var109 = module0032.f1743(var109)) {
                                                                                            var110 = module0032.f1745(var108, var109);
                                                                                            if (module0321.NIL != module0032.f1746(var109, var110) && module0321.NIL == module0249.f16059(var110, (SubLObject)module0321.UNPROVIDED)) {
                                                                                                module0249.f16055(var110, (SubLObject)module0321.UNPROVIDED);
                                                                                                module0056.f4149((SubLObject)ConsesLow.list(var110, module0141.f9195()), var81);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var106.isList()) {
                                                                                        SubLObject var111 = var106;
                                                                                        SubLObject var112 = (SubLObject)module0321.NIL;
                                                                                        var112 = var111.first();
                                                                                        while (module0321.NIL != var111) {
                                                                                            if (module0321.NIL == module0249.f16059(var112, (SubLObject)module0321.UNPROVIDED)) {
                                                                                                module0249.f16055(var112, (SubLObject)module0321.UNPROVIDED);
                                                                                                module0056.f4149((SubLObject)ConsesLow.list(var112, module0141.f9195()), var81);
                                                                                            }
                                                                                            var111 = var111.rest();
                                                                                            var112 = var111.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0321.$ic74$, var106);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var59_78, var55);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var121_126);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var59_77, var55);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var102);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)module0321.FIVE_INTEGER, (SubLObject)module0321.$ic75$, (SubLObject)module0321.UNPROVIDED, (SubLObject)module0321.UNPROVIDED, (SubLObject)module0321.UNPROVIDED, (SubLObject)module0321.UNPROVIDED, (SubLObject)module0321.UNPROVIDED);
                                                    }
                                                }
                                                else if (module0321.NIL != module0155.f9785(var99, (SubLObject)module0321.UNPROVIDED)) {
                                                    SubLObject var44_136;
                                                    final SubLObject var113 = var44_136 = ((module0321.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var55), module0137.f8955((SubLObject)module0321.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var55), module0137.f8955((SubLObject)module0321.UNPROVIDED)));
                                                    SubLObject var114 = (SubLObject)module0321.NIL;
                                                    var114 = var44_136.first();
                                                    while (module0321.NIL != var44_136) {
                                                        final SubLObject var59_79 = module0138.$g1625$.currentBinding(var55);
                                                        try {
                                                            module0138.$g1625$.bind(var114, var55);
                                                            final SubLObject var116;
                                                            final SubLObject var115 = var116 = Functions.funcall(var114, var99);
                                                            if (module0321.NIL != module0077.f5302(var116)) {
                                                                final SubLObject var117 = module0077.f5333(var116);
                                                                SubLObject var118;
                                                                SubLObject var119;
                                                                SubLObject var120;
                                                                for (var118 = module0032.f1741(var117), var119 = (SubLObject)module0321.NIL, var119 = module0032.f1742(var118, var117); module0321.NIL == module0032.f1744(var118, var119); var119 = module0032.f1743(var119)) {
                                                                    var120 = module0032.f1745(var118, var119);
                                                                    if (module0321.NIL != module0032.f1746(var119, var120) && module0321.NIL == module0249.f16059(var120, (SubLObject)module0321.UNPROVIDED)) {
                                                                        module0249.f16055(var120, (SubLObject)module0321.UNPROVIDED);
                                                                        module0056.f4149((SubLObject)ConsesLow.list(var120, module0141.f9195()), var81);
                                                                    }
                                                                }
                                                            }
                                                            else if (var116.isList()) {
                                                                SubLObject var121 = var116;
                                                                SubLObject var122 = (SubLObject)module0321.NIL;
                                                                var122 = var121.first();
                                                                while (module0321.NIL != var121) {
                                                                    if (module0321.NIL == module0249.f16059(var122, (SubLObject)module0321.UNPROVIDED)) {
                                                                        module0249.f16055(var122, (SubLObject)module0321.UNPROVIDED);
                                                                        module0056.f4149((SubLObject)ConsesLow.list(var122, module0141.f9195()), var81);
                                                                    }
                                                                    var121 = var121.rest();
                                                                    var122 = var121.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)module0321.$ic74$, var116);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var59_79, var55);
                                                        }
                                                        var44_136 = var44_136.rest();
                                                        var114 = var44_136.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var60_72, var55);
                                                module0137.$g1605$.rebind(var59_76, var55);
                                            }
                                            var94 = var94.rest();
                                            var98 = var94.first();
                                        }
                                    }
                                    finally {
                                        module0141.$g1674$.rebind(var59_75, var55);
                                    }
                                }
                            }
                            finally {
                                module0141.$g1674$.rebind(var61_70, var55);
                                module0138.$g1619$.rebind(var60_71, var55);
                                module0141.$g1677$.rebind(var59_74, var55);
                            }
                        }
                        else {
                            module0136.f8872((SubLObject)module0321.TWO_INTEGER, (SubLObject)module0321.$ic76$, var78, module0244.f15748(module0137.f8955((SubLObject)module0321.UNPROVIDED)), (SubLObject)module0321.UNPROVIDED, (SubLObject)module0321.UNPROVIDED, (SubLObject)module0321.UNPROVIDED);
                        }
                    }
                    finally {
                        module0137.$g1605$.rebind(var89, var55);
                        module0141.$g1674$.rebind(var88, var55);
                        module0141.$g1672$.rebind(var87, var55);
                        module0141.$g1671$.rebind(var60_70, var55);
                        module0141.$g1670$.rebind(var59_73, var55);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var85, var55);
                    module0141.$g1714$.rebind(var59_72, var55);
                }
                module0139.f9011(module0139.$g1635$.getDynamicValue(var55));
            }
            finally {
                module0139.$g1635$.rebind(var83, var55);
            }
        }
        return var56;
    }
    
    public static SubLObject f21703(final SubLObject var19, final SubLObject var49, SubLObject var50, SubLObject var51) {
        if (var50 == module0321.UNPROVIDED) {
            var50 = (SubLObject)module0321.NIL;
        }
        if (var51 == module0321.UNPROVIDED) {
            var51 = (SubLObject)module0321.NIL;
        }
        final SubLThread var52 = SubLProcess.currentSubLThread();
        SubLObject var53 = (SubLObject)module0321.T;
        SubLObject var54 = (SubLObject)module0321.NIL;
        final SubLObject var55 = module0205.f13333(var19);
        SubLObject var56 = (SubLObject)module0321.NIL;
        if (module0321.NIL != module0322.f21736()) {
            final SubLObject var57 = module0147.$g2095$.currentBinding(var52);
            final SubLObject var58 = module0147.$g2094$.currentBinding(var52);
            final SubLObject var59 = module0147.$g2096$.currentBinding(var52);
            try {
                module0147.$g2095$.bind(module0147.f9545(var49), var52);
                module0147.$g2094$.bind(module0147.f9546(var49), var52);
                module0147.$g2096$.bind(module0147.f9549(var49), var52);
                SubLObject var60 = (SubLObject)module0321.ZERO_INTEGER;
                final SubLObject var61 = module0205.f13207(var19, (SubLObject)module0321.$ic77$);
                SubLObject var62;
                SubLObject var63;
                SubLObject var64;
                SubLObject var65;
                SubLObject var59_145;
                SubLObject var91_146;
                SubLObject var66;
                SubLObject var68;
                SubLObject var67;
                SubLObject var69;
                SubLObject var70;
                SubLObject var71;
                SubLObject var72;
                for (var62 = (SubLObject)module0321.NIL, var62 = var61; module0321.NIL == var56 && module0321.NIL != var62; var62 = var62.rest()) {
                    var63 = var62.first();
                    var60 = Numbers.add(var60, (SubLObject)module0321.ONE_INTEGER);
                    if (module0321.NIL != module0193.f12105(var63) && module0321.NIL != module0322.f21730(var55, var60)) {
                        var64 = module0205.f13384(var19, Numbers.subtract((SubLObject)module0321.THREE_INTEGER, var60), (SubLObject)module0321.UNPROVIDED);
                        var65 = ((module0321.NIL != module0193.f12105(var64)) ? module0322.f21729(var63, var55, var60, var64, Symbols.symbol_function((SubLObject)module0321.EQUAL), var51) : module0322.f21725(var63, var55, var60, var51));
                        var59_145 = module0234.$g2436$.currentBinding(var52);
                        try {
                            module0234.$g2436$.bind(var51, var52);
                            for (var91_146 = (SubLObject)module0321.NIL, var91_146 = var65; module0321.NIL == var56 && module0321.NIL != var91_146; var91_146 = var91_146.rest()) {
                                var66 = var91_146.first();
                                var67 = (var68 = var66);
                                var69 = (SubLObject)module0321.NIL;
                                var70 = (SubLObject)module0321.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(var68, var67, (SubLObject)module0321.$ic78$);
                                var69 = var68.first();
                                var68 = (var70 = var68.rest());
                                var52.resetMultipleValues();
                                var71 = module0235.f15474(var64, var69, (SubLObject)module0321.T, (SubLObject)module0321.UNPROVIDED);
                                var72 = var52.secondMultipleValue();
                                var52.resetMultipleValues();
                                var54 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var71, ConsesLow.append(var70, var72)), var54);
                                if (module0321.NIL != module0193.f12105(var64) && module0321.NIL == var51) {
                                    var56 = (SubLObject)module0321.T;
                                }
                            }
                        }
                        finally {
                            module0234.$g2436$.rebind(var59_145, var52);
                        }
                        var53 = (SubLObject)module0321.NIL;
                    }
                }
            }
            finally {
                module0147.$g2096$.rebind(var59, var52);
                module0147.$g2094$.rebind(var58, var52);
                module0147.$g2095$.rebind(var57, var52);
            }
        }
        return Values.values(var54, var53);
    }
    
    public static SubLObject f21705(final SubLObject var55, final SubLObject var52) {
        if (var52.eql((SubLObject)module0321.$ic57$)) {
            return var55;
        }
        SubLObject var56 = (SubLObject)module0321.NIL;
        SubLObject var57 = var55;
        SubLObject var58 = (SubLObject)module0321.NIL;
        var58 = var57.first();
        while (module0321.NIL != var57) {
            SubLObject var60;
            final SubLObject var59 = var60 = var58;
            SubLObject var61 = (SubLObject)module0321.NIL;
            SubLObject var62 = (SubLObject)module0321.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var60, var59, (SubLObject)module0321.$ic79$);
            var61 = var60.first();
            var60 = var60.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var60, var59, (SubLObject)module0321.$ic79$);
            var62 = var60.first();
            var60 = var60.rest();
            if (module0321.NIL == var60) {
                SubLObject var63 = (SubLObject)module0321.NIL;
                SubLObject var44_158 = var61;
                SubLObject var64 = (SubLObject)module0321.NIL;
                var64 = var44_158.first();
                while (module0321.NIL != var44_158) {
                    final SubLObject var65 = module0233.f15355(var64);
                    final SubLObject var66 = module0233.f15370(var64);
                    final SubLObject var67 = f21686(var65);
                    SubLObject var68 = (SubLObject)ConsesLow.list(var64);
                    SubLObject var69 = module0318.f21423();
                    SubLObject var70 = (SubLObject)module0321.NIL;
                    var70 = var69.first();
                    while (module0321.NIL != var69) {
                        final SubLObject var71 = module0318.f21463(module0318.f21460(var70));
                        SubLObject var44_159 = module0318.f21455(var70, f21684(), var67, (SubLObject)module0321.NIL);
                        SubLObject var72 = (SubLObject)module0321.NIL;
                        var72 = var44_159.first();
                        while (module0321.NIL != var44_159) {
                            if (var52 != module0321.$ic80$ || !var71.eql(module0134.f8805(var72))) {
                                SubLObject var44_160 = module0266.f17530(var72, var66, var71, (SubLObject)module0321.UNPROVIDED, (SubLObject)module0321.UNPROVIDED);
                                SubLObject var73 = (SubLObject)module0321.NIL;
                                var73 = var44_160.first();
                                while (module0321.NIL != var44_160) {
                                    var68 = (SubLObject)ConsesLow.cons(module0233.f15340(var65, var73), var68);
                                    var44_160 = var44_160.rest();
                                    var73 = var44_160.first();
                                }
                            }
                            var44_159 = var44_159.rest();
                            var72 = var44_159.first();
                        }
                        var69 = var69.rest();
                        var70 = var69.first();
                    }
                    var63 = (SubLObject)ConsesLow.cons(module0035.f2269(var68, Symbols.symbol_function((SubLObject)module0321.EQUAL), (SubLObject)module0321.UNPROVIDED, (SubLObject)module0321.UNPROVIDED, (SubLObject)module0321.UNPROVIDED, (SubLObject)module0321.UNPROVIDED), var63);
                    var44_158 = var44_158.rest();
                    var64 = var44_158.first();
                }
                SubLObject var44_161 = module0035.f2489(Sequences.nreverse(var63), (SubLObject)module0321.UNPROVIDED, (SubLObject)module0321.UNPROVIDED, (SubLObject)module0321.UNPROVIDED);
                SubLObject var74 = (SubLObject)module0321.NIL;
                var74 = var44_161.first();
                while (module0321.NIL != var44_161) {
                    var56 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var74, var62), var56);
                    var44_161 = var44_161.rest();
                    var74 = var44_161.first();
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var59, (SubLObject)module0321.$ic79$);
            }
            var57 = var57.rest();
            var58 = var57.first();
        }
        return module0035.f2269(ConsesLow.append(var55, var56), Symbols.symbol_function((SubLObject)module0321.EQUAL), (SubLObject)module0321.UNPROVIDED, (SubLObject)module0321.UNPROVIDED, (SubLObject)module0321.UNPROVIDED, (SubLObject)module0321.UNPROVIDED);
    }
    
    public static SubLObject f21706(final SubLObject var92, final SubLObject var169) {
        SubLObject var170 = (SubLObject)module0321.NIL;
        if (module0321.NIL == var170) {
            SubLObject var171 = module0249.f16019(var92, (SubLObject)module0321.UNPROVIDED);
            SubLObject var172 = (SubLObject)module0321.NIL;
            var172 = var171.first();
            while (module0321.NIL == var170 && module0321.NIL != var171) {
                if (module0321.NIL != module0320.f21592(var172, var169)) {
                    var170 = (SubLObject)module0321.T;
                }
                var171 = var171.rest();
                var172 = var171.first();
            }
        }
        return var170;
    }
    
    public static SubLObject f21707(final SubLObject var92, final SubLObject var63) {
        module0249.f16038(var92, var63, (SubLObject)module0321.UNPROVIDED);
        return (SubLObject)module0321.NIL;
    }
    
    public static SubLObject f21704(final SubLObject var92, final SubLObject var63) {
        final SubLThread var93 = SubLProcess.currentSubLThread();
        if (module0321.NIL != module0321.$g2815$.getGlobalValue() && module0321.NIL != module0408.f28448()) {
            Dynamic.sublisp_throw((SubLObject)module0321.$ic58$, (SubLObject)module0321.T);
        }
        final SubLObject var94 = (SubLObject)SubLObjectFactory.makeBoolean(!module0320.f21587(var63).eql(module0141.f9195()));
        final SubLObject var95 = module0320.f21622(var92, var63, var94);
        if (module0321.NIL == f21706(var92, var95)) {
            f21707(var92, var95);
            if (module0321.NIL != module0320.f21561(var95)) {
                f21701(module0320.f21626(var95));
            }
            if (module0321.NIL != f21692() && module0321.NIL != f21700()) {
                module0141.$g1685$.setDynamicValue((SubLObject)module0321.T, var93);
            }
            if (module0321.NIL != module0320.f21561(var95)) {
                final SubLObject var96 = module0200.f12443(module0137.f8955((SubLObject)module0321.UNPROVIDED));
                SubLObject var97;
                SubLObject var98;
                SubLObject var99;
                SubLObject var100;
                SubLObject var101;
                SubLObject var102;
                SubLObject var103;
                SubLObject var104;
                SubLObject var105;
                SubLObject var106;
                SubLObject var59_173;
                SubLObject var121_174;
                SubLObject var107;
                SubLObject var108;
                SubLObject var59_174;
                SubLObject var109;
                SubLObject var110;
                SubLObject var111;
                SubLObject var112;
                SubLObject var113;
                SubLObject var114;
                SubLObject var115;
                SubLObject var116;
                SubLObject var91_177;
                SubLObject var117;
                SubLObject var59_175;
                SubLObject var119;
                SubLObject var118;
                SubLObject var120;
                SubLObject var121;
                SubLObject var122;
                SubLObject var123;
                SubLObject var124;
                SubLObject var125;
                for (var97 = (SubLObject)module0321.NIL, var97 = var96; module0321.NIL == module0141.$g1685$.getDynamicValue(var93) && module0321.NIL != var97; var97 = var97.rest()) {
                    var98 = var97.first();
                    var99 = module0137.$g1605$.currentBinding(var93);
                    var100 = module0141.$g1674$.currentBinding(var93);
                    try {
                        module0137.$g1605$.bind(var98, var93);
                        module0141.$g1674$.bind((SubLObject)((module0321.NIL != module0141.f9205((SubLObject)module0321.UNPROVIDED, (SubLObject)module0321.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0321.NIL == module0141.$g1674$.getDynamicValue(var93)) : module0141.$g1674$.getDynamicValue(var93)), var93);
                        var101 = module0228.f15229(var92);
                        if (module0321.NIL != module0138.f8992(var101)) {
                            var102 = module0242.f15664(var101, module0137.f8955((SubLObject)module0321.UNPROVIDED));
                            if (module0321.NIL != var102) {
                                var103 = module0245.f15834(var102, module0138.f8979(), module0137.f8955((SubLObject)module0321.UNPROVIDED));
                                if (module0321.NIL != var103) {
                                    for (var104 = module0066.f4838(module0067.f4891(var103)); module0321.NIL == module0141.$g1685$.getDynamicValue(var93) && module0321.NIL == module0066.f4841(var104); var104 = module0066.f4840(var104)) {
                                        var93.resetMultipleValues();
                                        var105 = module0066.f4839(var104);
                                        var106 = var93.secondMultipleValue();
                                        var93.resetMultipleValues();
                                        if (module0321.NIL != module0147.f9507(var105)) {
                                            var59_173 = module0138.$g1623$.currentBinding(var93);
                                            try {
                                                module0138.$g1623$.bind(var105, var93);
                                                for (var121_174 = module0066.f4838(module0067.f4891(var106)); module0321.NIL == module0141.$g1685$.getDynamicValue(var93) && module0321.NIL == module0066.f4841(var121_174); var121_174 = module0066.f4840(var121_174)) {
                                                    var93.resetMultipleValues();
                                                    var107 = module0066.f4839(var121_174);
                                                    var108 = var93.secondMultipleValue();
                                                    var93.resetMultipleValues();
                                                    if (module0321.NIL != module0141.f9289(var107)) {
                                                        var59_174 = module0138.$g1624$.currentBinding(var93);
                                                        try {
                                                            module0138.$g1624$.bind(var107, var93);
                                                            var109 = var108;
                                                            if (module0321.NIL != module0077.f5302(var109)) {
                                                                var110 = module0077.f5333(var109);
                                                                for (var111 = module0032.f1741(var110), var112 = (SubLObject)module0321.NIL, var112 = module0032.f1742(var111, var110); module0321.NIL == module0141.$g1685$.getDynamicValue(var93) && module0321.NIL == module0032.f1744(var111, var112); var112 = module0032.f1743(var112)) {
                                                                    var113 = module0032.f1745(var111, var112);
                                                                    if (module0321.NIL != module0032.f1746(var112, var113)) {
                                                                        f21704(var113, var95);
                                                                    }
                                                                }
                                                            }
                                                            else if (var109.isList()) {
                                                                if (module0321.NIL == module0141.$g1685$.getDynamicValue(var93)) {
                                                                    var114 = var109;
                                                                    var115 = (SubLObject)module0321.NIL;
                                                                    var115 = var114.first();
                                                                    while (module0321.NIL == module0141.$g1685$.getDynamicValue(var93) && module0321.NIL != var114) {
                                                                        f21704(var115, var95);
                                                                        var114 = var114.rest();
                                                                        var115 = var114.first();
                                                                    }
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)module0321.$ic74$, var109);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1624$.rebind(var59_174, var93);
                                                        }
                                                    }
                                                }
                                                module0066.f4842(var121_174);
                                            }
                                            finally {
                                                module0138.$g1623$.rebind(var59_173, var93);
                                            }
                                        }
                                    }
                                    module0066.f4842(var104);
                                }
                            }
                            else {
                                module0136.f8870((SubLObject)module0321.FIVE_INTEGER, (SubLObject)module0321.$ic75$, (SubLObject)module0321.UNPROVIDED, (SubLObject)module0321.UNPROVIDED, (SubLObject)module0321.UNPROVIDED, (SubLObject)module0321.UNPROVIDED, (SubLObject)module0321.UNPROVIDED);
                            }
                        }
                        else if (module0321.NIL != module0155.f9785(var101, (SubLObject)module0321.UNPROVIDED)) {
                            var116 = ((module0321.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var93), module0137.f8955((SubLObject)module0321.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var93), module0137.f8955((SubLObject)module0321.UNPROVIDED)));
                            for (var91_177 = (SubLObject)module0321.NIL, var91_177 = var116; module0321.NIL == module0141.$g1685$.getDynamicValue(var93) && module0321.NIL != var91_177; var91_177 = var91_177.rest()) {
                                var117 = var91_177.first();
                                var59_175 = module0138.$g1625$.currentBinding(var93);
                                try {
                                    module0138.$g1625$.bind(var117, var93);
                                    var118 = (var119 = Functions.funcall(var117, var101));
                                    if (module0321.NIL != module0077.f5302(var119)) {
                                        var120 = module0077.f5333(var119);
                                        for (var121 = module0032.f1741(var120), var122 = (SubLObject)module0321.NIL, var122 = module0032.f1742(var121, var120); module0321.NIL == module0141.$g1685$.getDynamicValue(var93) && module0321.NIL == module0032.f1744(var121, var122); var122 = module0032.f1743(var122)) {
                                            var123 = module0032.f1745(var121, var122);
                                            if (module0321.NIL != module0032.f1746(var122, var123)) {
                                                f21704(var123, var95);
                                            }
                                        }
                                    }
                                    else if (var119.isList()) {
                                        if (module0321.NIL == module0141.$g1685$.getDynamicValue(var93)) {
                                            var124 = var119;
                                            var125 = (SubLObject)module0321.NIL;
                                            var125 = var124.first();
                                            while (module0321.NIL == module0141.$g1685$.getDynamicValue(var93) && module0321.NIL != var124) {
                                                f21704(var125, var95);
                                                var124 = var124.rest();
                                                var125 = var124.first();
                                            }
                                        }
                                    }
                                    else {
                                        Errors.error((SubLObject)module0321.$ic74$, var119);
                                    }
                                }
                                finally {
                                    module0138.$g1625$.rebind(var59_175, var93);
                                }
                            }
                        }
                    }
                    finally {
                        module0141.$g1674$.rebind(var100, var93);
                        module0137.$g1605$.rebind(var99, var93);
                    }
                }
            }
        }
        return (SubLObject)module0321.NIL;
    }
    
    public static SubLObject f21708(final SubLObject var19, SubLObject var49, SubLObject var52) {
        if (var49 == module0321.UNPROVIDED) {
            var49 = (SubLObject)module0321.NIL;
        }
        if (var52 == module0321.UNPROVIDED) {
            var52 = (SubLObject)module0321.$ic57$;
        }
        final SubLThread var53 = SubLProcess.currentSubLThread();
        SubLObject var54 = (SubLObject)module0321.NIL;
        SubLObject var55 = (SubLObject)module0321.NIL;
        final SubLObject var56 = var49;
        final SubLObject var57 = module0147.$g2095$.currentBinding(var53);
        final SubLObject var58 = module0147.$g2094$.currentBinding(var53);
        final SubLObject var59 = module0147.$g2096$.currentBinding(var53);
        final SubLObject var60 = module0321.$g2817$.currentBinding(var53);
        try {
            module0147.$g2095$.bind(module0147.f9545(var56), var53);
            module0147.$g2094$.bind(module0147.f9546(var56), var53);
            module0147.$g2096$.bind(module0147.f9549(var56), var53);
            module0321.$g2817$.bind(f21658((SubLObject)module0321.UNPROVIDED), var53);
            f21661(var19, (SubLObject)module0321.NIL, (SubLObject)module0321.NIL);
            try {
                var53.throwStack.push(module0321.$ic58$);
                final SubLObject var61 = module0320.f21619();
                final SubLObject var59_180 = module0141.$g1670$.currentBinding(var53);
                final SubLObject var60_181 = module0141.$g1671$.currentBinding(var53);
                final SubLObject var61_182 = module0141.$g1672$.currentBinding(var53);
                final SubLObject var62_183 = module0141.$g1674$.currentBinding(var53);
                final SubLObject var62 = module0137.$g1605$.currentBinding(var53);
                try {
                    module0141.$g1670$.bind(module0137.f8955(module0321.$ic59$), var53);
                    module0141.$g1671$.bind(module0244.f15739(module0137.f8955(module0321.$ic59$)), var53);
                    module0141.$g1672$.bind(module0244.f15746(module0137.f8955(module0321.$ic59$)), var53);
                    module0141.$g1674$.bind((SubLObject)module0321.NIL, var53);
                    module0137.$g1605$.bind(module0137.f8955(module0321.$ic59$), var53);
                    final SubLObject var58_184 = var49;
                    final SubLObject var59_181 = module0147.$g2095$.currentBinding(var53);
                    final SubLObject var60_182 = module0147.$g2094$.currentBinding(var53);
                    final SubLObject var61_183 = module0147.$g2096$.currentBinding(var53);
                    try {
                        module0147.$g2095$.bind(module0147.f9545(var58_184), var53);
                        module0147.$g2094$.bind(module0147.f9546(var58_184), var53);
                        module0147.$g2096$.bind(module0147.f9549(var58_184), var53);
                        final SubLObject var63 = (SubLObject)module0321.NIL;
                        final SubLObject var59_182 = module0141.$g1714$.currentBinding(var53);
                        final SubLObject var60_183 = module0141.$g1715$.currentBinding(var53);
                        try {
                            module0141.$g1714$.bind((module0321.NIL != var63) ? var63 : module0141.f9283(), var53);
                            module0141.$g1715$.bind((SubLObject)((module0321.NIL != var63) ? module0321.$ic60$ : module0141.$g1715$.getDynamicValue(var53)), var53);
                            if (module0321.NIL != var63 && module0321.NIL != module0136.f8864() && module0321.NIL == module0141.f9279(var63)) {
                                final SubLObject var64 = module0136.$g1591$.getDynamicValue(var53);
                                if (var64.eql((SubLObject)module0321.$ic61$)) {
                                    module0136.f8870((SubLObject)module0321.ONE_INTEGER, (SubLObject)module0321.$ic62$, var63, (SubLObject)module0321.$ic63$, (SubLObject)module0321.UNPROVIDED, (SubLObject)module0321.UNPROVIDED, (SubLObject)module0321.UNPROVIDED);
                                }
                                else if (var64.eql((SubLObject)module0321.$ic64$)) {
                                    module0136.f8871((SubLObject)module0321.ONE_INTEGER, (SubLObject)module0321.$ic65$, (SubLObject)module0321.$ic62$, var63, (SubLObject)module0321.$ic63$, (SubLObject)module0321.UNPROVIDED, (SubLObject)module0321.UNPROVIDED, (SubLObject)module0321.UNPROVIDED);
                                }
                                else if (var64.eql((SubLObject)module0321.$ic66$)) {
                                    Errors.warn((SubLObject)module0321.$ic62$, var63, (SubLObject)module0321.$ic63$);
                                }
                                else {
                                    Errors.warn((SubLObject)module0321.$ic67$, module0136.$g1591$.getDynamicValue(var53));
                                    Errors.cerror((SubLObject)module0321.$ic65$, (SubLObject)module0321.$ic62$, var63, (SubLObject)module0321.$ic63$);
                                }
                            }
                            final SubLObject var59_183 = module0141.$g1710$.currentBinding(var53);
                            final SubLObject var60_184 = module0141.$g1677$.currentBinding(var53);
                            final SubLObject var61_184 = module0138.$g1619$.currentBinding(var53);
                            try {
                                module0141.$g1710$.bind(module0321.$ic68$, var53);
                                module0141.$g1677$.bind(module0141.f9210(), var53);
                                module0138.$g1619$.bind(module0244.f15780(module0137.f8955((SubLObject)module0321.UNPROVIDED)), var53);
                                final SubLObject var65 = module0139.f9036();
                                final SubLObject var59_184 = module0139.$g1635$.currentBinding(var53);
                                try {
                                    module0139.$g1635$.bind((var65 == module0321.$ic69$) ? module0139.$g1635$.getDynamicValue(var53) : module0139.f9038(var65), var53);
                                    final SubLObject var59_185 = module0139.$g1636$.currentBinding(var53);
                                    try {
                                        module0139.$g1636$.bind((var65 == module0321.$ic69$) ? module0139.$g1636$.getDynamicValue(var53) : module0139.f9038(var65), var53);
                                        final SubLObject var59_186 = module0141.$g1685$.currentBinding(var53);
                                        final SubLObject var60_185 = module0141.$g1686$.currentBinding(var53);
                                        final SubLObject var61_185 = module0141.$g1683$.currentBinding(var53);
                                        final SubLObject var62_184 = module0141.$g1684$.currentBinding(var53);
                                        final SubLObject var68_199 = module0141.$g1674$.currentBinding(var53);
                                        try {
                                            module0141.$g1685$.bind((SubLObject)module0321.NIL, var53);
                                            module0141.$g1686$.bind((SubLObject)module0321.NIL, var53);
                                            module0141.$g1683$.bind((SubLObject)module0321.NIL, var53);
                                            module0141.$g1684$.bind((SubLObject)module0321.NIL, var53);
                                            module0141.$g1674$.bind((SubLObject)module0321.NIL, var53);
                                            final SubLObject var66 = module0138.$g1626$.getGlobalValue();
                                            SubLObject var67 = (SubLObject)module0321.NIL;
                                            try {
                                                var67 = ReadWriteLocks.rw_lock_seize_read_lock(var66);
                                                f21704(f21684(), var61);
                                            }
                                            finally {
                                                if (module0321.NIL != var67) {
                                                    ReadWriteLocks.rw_lock_release_read_lock(var66);
                                                }
                                            }
                                        }
                                        finally {
                                            module0141.$g1674$.rebind(var68_199, var53);
                                            module0141.$g1684$.rebind(var62_184, var53);
                                            module0141.$g1683$.rebind(var61_185, var53);
                                            module0141.$g1686$.rebind(var60_185, var53);
                                            module0141.$g1685$.rebind(var59_186, var53);
                                        }
                                        if (var65 == module0321.$ic70$) {
                                            module0139.f9012(module0139.$g1636$.getDynamicValue(var53));
                                        }
                                    }
                                    finally {
                                        module0139.$g1636$.rebind(var59_185, var53);
                                    }
                                    if (var65 == module0321.$ic70$) {
                                        module0139.f9012(module0139.$g1635$.getDynamicValue(var53));
                                    }
                                }
                                finally {
                                    module0139.$g1635$.rebind(var59_184, var53);
                                }
                            }
                            finally {
                                module0138.$g1619$.rebind(var61_184, var53);
                                module0141.$g1677$.rebind(var60_184, var53);
                                module0141.$g1710$.rebind(var59_183, var53);
                            }
                        }
                        finally {
                            module0141.$g1715$.rebind(var60_183, var53);
                            module0141.$g1714$.rebind(var59_182, var53);
                        }
                    }
                    finally {
                        module0147.$g2096$.rebind(var61_183, var53);
                        module0147.$g2094$.rebind(var60_182, var53);
                        module0147.$g2095$.rebind(var59_181, var53);
                    }
                }
                finally {
                    module0137.$g1605$.rebind(var62, var53);
                    module0141.$g1674$.rebind(var62_183, var53);
                    module0141.$g1672$.rebind(var61_182, var53);
                    module0141.$g1671$.rebind(var60_181, var53);
                    module0141.$g1670$.rebind(var59_180, var53);
                }
            }
            catch (Throwable var68) {
                var55 = Errors.handleThrowable(var68, (SubLObject)module0321.$ic58$);
            }
            finally {
                var53.throwStack.pop();
            }
            var54 = f21709(module0035.f2269(f21700(), Symbols.symbol_function((SubLObject)module0321.EQUAL), (SubLObject)module0321.UNPROVIDED, (SubLObject)module0321.UNPROVIDED, (SubLObject)module0321.UNPROVIDED, (SubLObject)module0321.UNPROVIDED), var52);
        }
        finally {
            module0321.$g2817$.rebind(var60, var53);
            module0147.$g2096$.rebind(var59, var53);
            module0147.$g2094$.rebind(var58, var53);
            module0147.$g2095$.rebind(var57, var53);
        }
        return var54;
    }
    
    public static SubLObject f21709(final SubLObject var200, final SubLObject var52) {
        return (module0321.$ic57$ == var52) ? module0052.f3709(var200) : module0052.f3689(f21710(var200, var52), (SubLObject)module0321.$ic81$, (SubLObject)module0321.$ic82$, (SubLObject)module0321.$ic83$);
    }
    
    public static SubLObject f21710(final SubLObject var200, final SubLObject var52) {
        final SubLObject var201 = module0067.f4880(Symbols.symbol_function((SubLObject)module0321.EQ), (SubLObject)module0321.UNPROVIDED);
        SubLObject var202 = f21685();
        SubLObject var203 = (SubLObject)module0321.NIL;
        var203 = var202.first();
        while (module0321.NIL != var202) {
            SubLObject var205;
            final SubLObject var204 = var205 = var203;
            SubLObject var206 = (SubLObject)module0321.NIL;
            SubLObject var207 = (SubLObject)module0321.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var205, var204, (SubLObject)module0321.$ic84$);
            var206 = var205.first();
            var205 = var205.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var205, var204, (SubLObject)module0321.$ic84$);
            var207 = var205.first();
            var205 = var205.rest();
            if (module0321.NIL == var205) {
                SubLObject var208 = module0318.f21423();
                SubLObject var209 = (SubLObject)module0321.NIL;
                var209 = var208.first();
                while (module0321.NIL != var208) {
                    final SubLObject var210 = module0318.f21463(module0318.f21460(var209));
                    SubLObject var44_205 = module0318.f21455(var209, f21684(), var207, (SubLObject)module0321.NIL);
                    SubLObject var211 = (SubLObject)module0321.NIL;
                    var211 = var44_205.first();
                    while (module0321.NIL != var44_205) {
                        if (var52 != module0321.$ic80$ || !var210.eql(module0134.f8805(var211))) {
                            module0084.f5765(var201, var206, (SubLObject)ConsesLow.list(var211, var210), Symbols.symbol_function((SubLObject)module0321.EQUAL), (SubLObject)module0321.UNPROVIDED);
                        }
                        var44_205 = var44_205.rest();
                        var211 = var44_205.first();
                    }
                    var208 = var208.rest();
                    var209 = var208.first();
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var204, (SubLObject)module0321.$ic84$);
            }
            var202 = var202.rest();
            var203 = var202.first();
        }
        return (SubLObject)ConsesLow.list((SubLObject)module0321.NIL, var200, var201);
    }
    
    public static SubLObject f21711(final SubLObject var206) {
        SubLObject var207 = (SubLObject)module0321.NIL;
        SubLObject var208 = (SubLObject)module0321.NIL;
        SubLObject var209 = (SubLObject)module0321.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var206, var206, (SubLObject)module0321.$ic85$);
        var207 = var206.first();
        SubLObject var210 = var206.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var210, var206, (SubLObject)module0321.$ic85$);
        var208 = var210.first();
        var210 = var210.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var210, var206, (SubLObject)module0321.$ic85$);
        var209 = var210.first();
        var210 = var210.rest();
        if (module0321.NIL == var210) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0321.NIL == var208 && (module0321.NIL == var207 || module0321.NIL != module0052.f3687(var207)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var206, (SubLObject)module0321.$ic85$);
        return (SubLObject)module0321.NIL;
    }
    
    public static SubLObject f21712(final SubLObject var206) {
        SubLObject var207 = (SubLObject)module0321.NIL;
        SubLObject var208 = (SubLObject)module0321.NIL;
        SubLObject var209 = (SubLObject)module0321.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var206, var206, (SubLObject)module0321.$ic85$);
        var207 = var206.first();
        SubLObject var210 = var206.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var210, var206, (SubLObject)module0321.$ic85$);
        var208 = var210.first();
        var210 = var210.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var210, var206, (SubLObject)module0321.$ic85$);
        var209 = var210.first();
        var210 = var210.rest();
        if (module0321.NIL == var210) {
            SubLObject var211 = (SubLObject)module0321.NIL;
            SubLObject var212 = (SubLObject)module0321.NIL;
            while (module0321.NIL == var211 && module0321.NIL == var212) {
                if (module0321.NIL == var207) {
                    var207 = f21713(var208.first(), var209);
                    ConsesLow.set_nth((SubLObject)module0321.ZERO_INTEGER, var206, var207);
                    ConsesLow.set_nth((SubLObject)module0321.ONE_INTEGER, var206, var208.rest());
                    if (module0321.NIL != module0052.f3674(var207)) {
                        continue;
                    }
                    var212 = (SubLObject)module0321.T;
                }
                else if (module0321.NIL != module0052.f3687(var207)) {
                    var207 = (SubLObject)module0321.NIL;
                    ConsesLow.set_nth((SubLObject)module0321.ZERO_INTEGER, var206, (SubLObject)module0321.NIL);
                }
                else {
                    var211 = module0052.f3694(var207, (SubLObject)module0321.UNPROVIDED);
                }
            }
            return Values.values(var211, var206, Types.sublisp_null(var211));
        }
        cdestructuring_bind.cdestructuring_bind_error(var206, (SubLObject)module0321.$ic85$);
        return (SubLObject)module0321.NIL;
    }
    
    public static SubLObject f21714(final SubLObject var206) {
        SubLObject var207 = (SubLObject)module0321.NIL;
        SubLObject var208 = (SubLObject)module0321.NIL;
        SubLObject var209 = (SubLObject)module0321.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var206, var206, (SubLObject)module0321.$ic85$);
        var207 = var206.first();
        SubLObject var210 = var206.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var210, var206, (SubLObject)module0321.$ic85$);
        var208 = var210.first();
        var210 = var210.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var210, var206, (SubLObject)module0321.$ic85$);
        var209 = var210.first();
        var210 = var210.rest();
        if (module0321.NIL == var210) {
            module0067.f4881(var209);
            if (module0321.NIL != var207) {
                module0052.f3696(var207);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var206, (SubLObject)module0321.$ic85$);
        }
        return (SubLObject)module0321.T;
    }
    
    public static SubLObject f21713(final SubLObject var213, final SubLObject var201) {
        SubLObject var214 = (SubLObject)module0321.NIL;
        SubLObject var215 = (SubLObject)module0321.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var213, var213, (SubLObject)module0321.$ic86$);
        var214 = var213.first();
        SubLObject var216 = var213.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var216, var213, (SubLObject)module0321.$ic86$);
        var215 = var216.first();
        var216 = var216.rest();
        if (module0321.NIL == var216) {
            final SubLObject var217 = f21715(var214, var201);
            return module0052.f3775(var217);
        }
        cdestructuring_bind.cdestructuring_bind_error(var213, (SubLObject)module0321.$ic86$);
        return (SubLObject)module0321.NIL;
    }
    
    public static SubLObject f21715(final SubLObject var152, final SubLObject var201) {
        SubLObject var202 = (SubLObject)module0321.NIL;
        SubLObject var203 = var152;
        SubLObject var204 = (SubLObject)module0321.NIL;
        var204 = var203.first();
        while (module0321.NIL != var203) {
            final SubLObject var205 = module0233.f15355(var204);
            final SubLObject var206 = module0233.f15370(var204);
            SubLObject var207 = (SubLObject)module0321.NIL;
            SubLObject var44_219 = module0067.f4885(var201, var205, (SubLObject)module0321.UNPROVIDED);
            SubLObject var208 = (SubLObject)module0321.NIL;
            var208 = var44_219.first();
            while (module0321.NIL != var44_219) {
                SubLObject var210;
                final SubLObject var209 = var210 = var208;
                SubLObject var211 = (SubLObject)module0321.NIL;
                SubLObject var212 = (SubLObject)module0321.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var210, var209, (SubLObject)module0321.$ic87$);
                var211 = var210.first();
                var210 = var210.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var210, var209, (SubLObject)module0321.$ic87$);
                var212 = var210.first();
                var210 = var210.rest();
                if (module0321.NIL == var210) {
                    final SubLObject var213 = module0266.f17523(var211, var206, var212, (SubLObject)module0321.UNPROVIDED, (SubLObject)module0321.UNPROVIDED, (SubLObject)module0321.UNPROVIDED, (SubLObject)module0321.UNPROVIDED);
                    final SubLObject var214 = f21716(var205, var213);
                    var207 = (SubLObject)ConsesLow.cons(var214, var207);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var209, (SubLObject)module0321.$ic87$);
                }
                var44_219 = var44_219.rest();
                var208 = var44_219.first();
            }
            var207 = (SubLObject)ConsesLow.cons(module0052.f3710(var204), var207);
            final SubLObject var215 = module0052.f3755(var207);
            final SubLObject var216 = module0052.f3766(var215);
            var202 = (SubLObject)ConsesLow.cons(var216, var202);
            var203 = var203.rest();
            var204 = var203.first();
        }
        return Sequences.nreverse(var202);
    }
    
    public static SubLObject f21716(final SubLObject var34, final SubLObject var179) {
        return module0052.f3689((SubLObject)ConsesLow.list(var34, var179), (SubLObject)module0321.$ic88$, (SubLObject)module0321.$ic89$, (SubLObject)module0321.$ic90$);
    }
    
    public static SubLObject f21717(final SubLObject var206) {
        SubLObject var207 = (SubLObject)module0321.NIL;
        SubLObject var208 = (SubLObject)module0321.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var206, var206, (SubLObject)module0321.$ic91$);
        var207 = var206.first();
        SubLObject var209 = var206.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var209, var206, (SubLObject)module0321.$ic91$);
        var208 = var209.first();
        var209 = var209.rest();
        if (module0321.NIL == var209) {
            return module0052.f3687(var208);
        }
        cdestructuring_bind.cdestructuring_bind_error(var206, (SubLObject)module0321.$ic91$);
        return (SubLObject)module0321.NIL;
    }
    
    public static SubLObject f21718(final SubLObject var206) {
        SubLObject var207 = (SubLObject)module0321.NIL;
        SubLObject var208 = (SubLObject)module0321.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var206, var206, (SubLObject)module0321.$ic91$);
        var207 = var206.first();
        SubLObject var209 = var206.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var209, var206, (SubLObject)module0321.$ic91$);
        var208 = var209.first();
        var209 = var209.rest();
        if (module0321.NIL == var209) {
            final SubLObject var210 = module0052.f3694(var208, (SubLObject)module0321.UNPROVIDED);
            return (module0321.NIL != var210) ? Values.values(module0233.f15340(var207, var210), var206, (SubLObject)module0321.NIL) : Values.values((SubLObject)module0321.NIL, var206, (SubLObject)module0321.T);
        }
        cdestructuring_bind.cdestructuring_bind_error(var206, (SubLObject)module0321.$ic91$);
        return (SubLObject)module0321.NIL;
    }
    
    public static SubLObject f21719(final SubLObject var206) {
        SubLObject var207 = (SubLObject)module0321.NIL;
        SubLObject var208 = (SubLObject)module0321.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var206, var206, (SubLObject)module0321.$ic91$);
        var207 = var206.first();
        SubLObject var209 = var206.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var209, var206, (SubLObject)module0321.$ic91$);
        var208 = var209.first();
        var209 = var209.rest();
        if (module0321.NIL == var209) {
            return module0052.f3696(var208);
        }
        cdestructuring_bind.cdestructuring_bind_error(var206, (SubLObject)module0321.$ic91$);
        return (SubLObject)module0321.NIL;
    }
    
    public static SubLObject f21720() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21631", "S#24193", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21633", "S#24187", 1, 0, false);
        new $f21633$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21634", "S#24194", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21635", "S#24195", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21636", "S#24196", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21637", "S#24197", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21638", "S#24198", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21639", "S#24199", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21640", "S#24200", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21641", "S#24201", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21642", "S#24202", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21643", "S#24203", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21644", "S#24204", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21645", "S#24205", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21646", "S#24206", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21647", "S#24207", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21648", "S#24208", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21649", "S#24209", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21650", "S#24210", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21651", "S#24211", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21652", "S#24212", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21653", "S#24213", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21654", "S#24214", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21655", "S#24215", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21656", "S#24216", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21657", "S#24217", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21658", "S#24218", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21659", "S#24219", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21660", "S#24220", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21632", "S#24221", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21661", "S#24222", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21667", "S#24223", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21668", "S#24224", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21669", "S#24225", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21670", "S#24226", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21671", "S#24227", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21672", "S#24228", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21673", "S#24229", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21674", "S#24230", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21675", "S#24231", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21676", "S#24232", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21677", "S#24233", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21678", "S#24234", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21679", "S#24235", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21680", "S#24236", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21681", "S#24237", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21682", "S#24238", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0321", "f21683", "S#24239");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21684", "S#23940", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21685", "S#23949", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21686", "S#24240", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21687", "S#24002", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21688", "S#23939", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21689", "S#23938", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21690", "S#23941", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21691", "S#23942", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21692", "S#24108", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21693", "S#24007", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21694", "S#24241", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21695", "S#24005", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21696", "S#24242", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21697", "S#24243", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21698", "S#24244", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21699", "S#24008", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21700", "S#24245", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21701", "S#24246", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21664", "S#24247", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21665", "S#24248", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21666", "S#24249", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21662", "S#24250", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21663", "S#24251", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21702", "S#24252", 1, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21703", "S#24253", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21705", "S#24254", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21706", "S#24255", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21707", "S#24256", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21704", "S#24257", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21708", "S#24258", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21709", "S#24259", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21710", "S#24260", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21711", "S#24261", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21712", "S#24262", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21714", "S#24263", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21713", "S#24264", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21715", "S#24265", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21716", "S#24266", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21717", "S#24267", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21718", "S#24268", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0321", "f21719", "S#24269", 1, 0, false);
        return (SubLObject)module0321.NIL;
    }
    
    public static SubLObject f21721() {
        module0321.$g2815$ = SubLFiles.deflexical("S#24270", (SubLObject)module0321.T);
        module0321.$g2816$ = SubLFiles.defconstant("S#24271", (SubLObject)module0321.$ic0$);
        module0321.$g2817$ = SubLFiles.defparameter("S#24272", (SubLObject)module0321.NIL);
        module0321.$g2818$ = SubLFiles.defparameter("S#24273", (SubLObject)module0321.NIL);
        return (SubLObject)module0321.NIL;
    }
    
    public static SubLObject f21722() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0321.$g2816$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0321.$ic7$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0321.$ic8$);
        Structures.def_csetf((SubLObject)module0321.$ic9$, (SubLObject)module0321.$ic10$);
        Structures.def_csetf((SubLObject)module0321.$ic11$, (SubLObject)module0321.$ic12$);
        Structures.def_csetf((SubLObject)module0321.$ic13$, (SubLObject)module0321.$ic14$);
        Structures.def_csetf((SubLObject)module0321.$ic15$, (SubLObject)module0321.$ic16$);
        Structures.def_csetf((SubLObject)module0321.$ic17$, (SubLObject)module0321.$ic18$);
        Structures.def_csetf((SubLObject)module0321.$ic19$, (SubLObject)module0321.$ic20$);
        Structures.def_csetf((SubLObject)module0321.$ic21$, (SubLObject)module0321.$ic22$);
        Structures.def_csetf((SubLObject)module0321.$ic23$, (SubLObject)module0321.$ic24$);
        Structures.def_csetf((SubLObject)module0321.$ic25$, (SubLObject)module0321.$ic26$);
        Structures.def_csetf((SubLObject)module0321.$ic27$, (SubLObject)module0321.$ic28$);
        Structures.def_csetf((SubLObject)module0321.$ic29$, (SubLObject)module0321.$ic30$);
        Structures.def_csetf((SubLObject)module0321.$ic31$, (SubLObject)module0321.$ic32$);
        Equality.identity((SubLObject)module0321.$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0321.$g2816$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0321.$ic50$));
        return (SubLObject)module0321.NIL;
    }
    
    public void declareFunctions() {
        f21720();
    }
    
    public void initializeVariables() {
        f21721();
    }
    
    public void runTopLevelForms() {
        f21722();
    }
    
    static {
        me = (SubLFile)new module0321();
        module0321.$g2815$ = null;
        module0321.$g2816$ = null;
        module0321.$g2817$ = null;
        module0321.$g2818$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#24186", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("S#24187", "CYC");
        $ic2$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#24274", "CYC"), SubLObjectFactory.makeSymbol("S#24275", "CYC"), SubLObjectFactory.makeSymbol("S#24276", "CYC"), SubLObjectFactory.makeSymbol("S#24277", "CYC"), SubLObjectFactory.makeSymbol("S#24278", "CYC"), SubLObjectFactory.makeSymbol("S#24279", "CYC"), SubLObjectFactory.makeSymbol("S#24280", "CYC"), SubLObjectFactory.makeSymbol("S#24281", "CYC"), SubLObjectFactory.makeSymbol("S#24282", "CYC"), SubLObjectFactory.makeSymbol("S#10884", "CYC"), SubLObjectFactory.makeSymbol("S#24283", "CYC"), SubLObjectFactory.makeSymbol("S#24284", "CYC") });
        $ic3$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("PROBLEM"), SubLObjectFactory.makeKeyword("ASENT-PRED"), SubLObjectFactory.makeKeyword("ASENT-ARGS"), SubLObjectFactory.makeKeyword("ARGS-ADMITTED"), SubLObjectFactory.makeKeyword("TERM-ARGNUMS"), SubLObjectFactory.makeKeyword("VAR-ARGNUMS"), SubLObjectFactory.makeKeyword("PRECOMPUTATIONS"), SubLObjectFactory.makeKeyword("REUSED-SPACES"), SubLObjectFactory.makeKeyword("ONE-ANSWER?"), SubLObjectFactory.makeKeyword("JUSTIFY?"), SubLObjectFactory.makeKeyword("RESTRICTED-ASSERTION"), SubLObjectFactory.makeKeyword("ANSWERS") });
        $ic4$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#24194", "CYC"), SubLObjectFactory.makeSymbol("S#24195", "CYC"), SubLObjectFactory.makeSymbol("S#24196", "CYC"), SubLObjectFactory.makeSymbol("S#24197", "CYC"), SubLObjectFactory.makeSymbol("S#24198", "CYC"), SubLObjectFactory.makeSymbol("S#24199", "CYC"), SubLObjectFactory.makeSymbol("S#24200", "CYC"), SubLObjectFactory.makeSymbol("S#24201", "CYC"), SubLObjectFactory.makeSymbol("S#24202", "CYC"), SubLObjectFactory.makeSymbol("S#24203", "CYC"), SubLObjectFactory.makeSymbol("S#24204", "CYC"), SubLObjectFactory.makeSymbol("S#24205", "CYC") });
        $ic5$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#24206", "CYC"), SubLObjectFactory.makeSymbol("S#24207", "CYC"), SubLObjectFactory.makeSymbol("S#24208", "CYC"), SubLObjectFactory.makeSymbol("S#24209", "CYC"), SubLObjectFactory.makeSymbol("S#24210", "CYC"), SubLObjectFactory.makeSymbol("S#24211", "CYC"), SubLObjectFactory.makeSymbol("S#24212", "CYC"), SubLObjectFactory.makeSymbol("S#24213", "CYC"), SubLObjectFactory.makeSymbol("S#24214", "CYC"), SubLObjectFactory.makeSymbol("S#24215", "CYC"), SubLObjectFactory.makeSymbol("S#24216", "CYC"), SubLObjectFactory.makeSymbol("S#24217", "CYC") });
        $ic6$ = SubLObjectFactory.makeSymbol("S#24221", "CYC");
        $ic7$ = SubLObjectFactory.makeSymbol("S#24193", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#24187", "CYC"));
        $ic9$ = SubLObjectFactory.makeSymbol("S#24194", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("S#24206", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#24195", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#24207", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("S#24196", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("S#24208", "CYC");
        $ic15$ = SubLObjectFactory.makeSymbol("S#24197", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("S#24209", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("S#24198", "CYC");
        $ic18$ = SubLObjectFactory.makeSymbol("S#24210", "CYC");
        $ic19$ = SubLObjectFactory.makeSymbol("S#24199", "CYC");
        $ic20$ = SubLObjectFactory.makeSymbol("S#24211", "CYC");
        $ic21$ = SubLObjectFactory.makeSymbol("S#24200", "CYC");
        $ic22$ = SubLObjectFactory.makeSymbol("S#24212", "CYC");
        $ic23$ = SubLObjectFactory.makeSymbol("S#24201", "CYC");
        $ic24$ = SubLObjectFactory.makeSymbol("S#24213", "CYC");
        $ic25$ = SubLObjectFactory.makeSymbol("S#24202", "CYC");
        $ic26$ = SubLObjectFactory.makeSymbol("S#24214", "CYC");
        $ic27$ = SubLObjectFactory.makeSymbol("S#24203", "CYC");
        $ic28$ = SubLObjectFactory.makeSymbol("S#24215", "CYC");
        $ic29$ = SubLObjectFactory.makeSymbol("S#24204", "CYC");
        $ic30$ = SubLObjectFactory.makeSymbol("S#24216", "CYC");
        $ic31$ = SubLObjectFactory.makeSymbol("S#24205", "CYC");
        $ic32$ = SubLObjectFactory.makeSymbol("S#24217", "CYC");
        $ic33$ = SubLObjectFactory.makeKeyword("PROBLEM");
        $ic34$ = SubLObjectFactory.makeKeyword("ASENT-PRED");
        $ic35$ = SubLObjectFactory.makeKeyword("ASENT-ARGS");
        $ic36$ = SubLObjectFactory.makeKeyword("ARGS-ADMITTED");
        $ic37$ = SubLObjectFactory.makeKeyword("TERM-ARGNUMS");
        $ic38$ = SubLObjectFactory.makeKeyword("VAR-ARGNUMS");
        $ic39$ = SubLObjectFactory.makeKeyword("PRECOMPUTATIONS");
        $ic40$ = SubLObjectFactory.makeKeyword("REUSED-SPACES");
        $ic41$ = SubLObjectFactory.makeKeyword("ONE-ANSWER?");
        $ic42$ = SubLObjectFactory.makeKeyword("JUSTIFY?");
        $ic43$ = SubLObjectFactory.makeKeyword("RESTRICTED-ASSERTION");
        $ic44$ = SubLObjectFactory.makeKeyword("ANSWERS");
        $ic45$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic46$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic47$ = SubLObjectFactory.makeSymbol("S#24218", "CYC");
        $ic48$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic49$ = SubLObjectFactory.makeKeyword("END");
        $ic50$ = SubLObjectFactory.makeSymbol("S#24220", "CYC");
        $ic51$ = SubLObjectFactory.makeString("#<");
        $ic52$ = SubLObjectFactory.makeKeyword("STREAM");
        $ic53$ = SubLObjectFactory.makeKeyword("BASE");
        $ic54$ = SubLObjectFactory.makeSymbol("CLET");
        $ic55$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#24272", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#24218", "CYC"))));
        $ic56$ = SubLObjectFactory.makeKeyword("FAIL");
        $ic57$ = SubLObjectFactory.makeKeyword("NONE");
        $ic58$ = SubLObjectFactory.makeKeyword("TVA-MAX-TIME");
        $ic59$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $ic60$ = SubLObjectFactory.makeSymbol("S#11450", "CYC");
        $ic61$ = SubLObjectFactory.makeKeyword("ERROR");
        $ic62$ = SubLObjectFactory.makeString("~A is not a ~A");
        $ic63$ = SubLObjectFactory.makeSymbol("S#11592", "CYC");
        $ic64$ = SubLObjectFactory.makeKeyword("CERROR");
        $ic65$ = SubLObjectFactory.makeString("continue anyway");
        $ic66$ = SubLObjectFactory.makeKeyword("WARN");
        $ic67$ = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic68$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("True-JustificationTruth"));
        $ic69$ = SubLObjectFactory.makeKeyword("OLD");
        $ic70$ = SubLObjectFactory.makeKeyword("RESOURCE");
        $ic71$ = SubLObjectFactory.makeKeyword("DEPTH");
        $ic72$ = SubLObjectFactory.makeKeyword("STACK");
        $ic73$ = SubLObjectFactory.makeKeyword("QUEUE");
        $ic74$ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $ic75$ = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $ic76$ = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $ic77$ = SubLObjectFactory.makeKeyword("IGNORE");
        $ic78$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#24285", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#14510", "CYC"));
        $ic79$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#14510", "CYC"));
        $ic80$ = SubLObjectFactory.makeKeyword("FOCUSED");
        $ic81$ = SubLObjectFactory.makeSymbol("S#24261", "CYC");
        $ic82$ = SubLObjectFactory.makeSymbol("S#24262", "CYC");
        $ic83$ = SubLObjectFactory.makeSymbol("S#24263", "CYC");
        $ic84$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#15200", "CYC"));
        $ic85$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#5090", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#24245", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#24286", "CYC"));
        $ic86$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#14595", "CYC"));
        $ic87$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5432", "CYC"));
        $ic88$ = SubLObjectFactory.makeSymbol("S#24267", "CYC");
        $ic89$ = SubLObjectFactory.makeSymbol("S#24268", "CYC");
        $ic90$ = SubLObjectFactory.makeSymbol("S#24269", "CYC");
        $ic91$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5090", "CYC"));
    }
    
    public static final class $sX24186_native extends SubLStructNative
    {
        public SubLObject $problem;
        public SubLObject $asent_pred;
        public SubLObject $asent_args;
        public SubLObject $args_admitted;
        public SubLObject $term_argnums;
        public SubLObject $var_argnums;
        public SubLObject $precomputations;
        public SubLObject $reused_spaces;
        public SubLObject $one_answerP;
        public SubLObject $justifyP;
        public SubLObject $restricted_assertion;
        public SubLObject $answers;
        private static final SubLStructDeclNative structDecl;
        
        public $sX24186_native() {
            this.$problem = (SubLObject)CommonSymbols.NIL;
            this.$asent_pred = (SubLObject)CommonSymbols.NIL;
            this.$asent_args = (SubLObject)CommonSymbols.NIL;
            this.$args_admitted = (SubLObject)CommonSymbols.NIL;
            this.$term_argnums = (SubLObject)CommonSymbols.NIL;
            this.$var_argnums = (SubLObject)CommonSymbols.NIL;
            this.$precomputations = (SubLObject)CommonSymbols.NIL;
            this.$reused_spaces = (SubLObject)CommonSymbols.NIL;
            this.$one_answerP = (SubLObject)CommonSymbols.NIL;
            this.$justifyP = (SubLObject)CommonSymbols.NIL;
            this.$restricted_assertion = (SubLObject)CommonSymbols.NIL;
            this.$answers = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX24186_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$problem;
        }
        
        public SubLObject getField3() {
            return this.$asent_pred;
        }
        
        public SubLObject getField4() {
            return this.$asent_args;
        }
        
        public SubLObject getField5() {
            return this.$args_admitted;
        }
        
        public SubLObject getField6() {
            return this.$term_argnums;
        }
        
        public SubLObject getField7() {
            return this.$var_argnums;
        }
        
        public SubLObject getField8() {
            return this.$precomputations;
        }
        
        public SubLObject getField9() {
            return this.$reused_spaces;
        }
        
        public SubLObject getField10() {
            return this.$one_answerP;
        }
        
        public SubLObject getField11() {
            return this.$justifyP;
        }
        
        public SubLObject getField12() {
            return this.$restricted_assertion;
        }
        
        public SubLObject getField13() {
            return this.$answers;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$problem = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$asent_pred = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$asent_args = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$args_admitted = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$term_argnums = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$var_argnums = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$precomputations = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$reused_spaces = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$one_answerP = value;
        }
        
        public SubLObject setField11(final SubLObject value) {
            return this.$justifyP = value;
        }
        
        public SubLObject setField12(final SubLObject value) {
            return this.$restricted_assertion = value;
        }
        
        public SubLObject setField13(final SubLObject value) {
            return this.$answers = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX24186_native.class, module0321.$ic0$, module0321.$ic1$, module0321.$ic2$, module0321.$ic3$, new String[] { "$problem", "$asent_pred", "$asent_args", "$args_admitted", "$term_argnums", "$var_argnums", "$precomputations", "$reused_spaces", "$one_answerP", "$justifyP", "$restricted_assertion", "$answers" }, module0321.$ic4$, module0321.$ic5$, module0321.$ic6$);
        }
    }
    
    public static final class $f21633$UnaryFunction extends UnaryFunction
    {
        public $f21633$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#24187"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0321.f21633(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0321.class
	Total time: 1339 ms
	
	Decompiled with Procyon 0.5.32.
*/