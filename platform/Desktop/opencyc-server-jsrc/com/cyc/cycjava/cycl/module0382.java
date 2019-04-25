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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0382 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0382";
    public static final String myFingerPrint = "e3e40cc889d104cbf4c0443296c4edd58dc48dada178ee37498cc424142f96ea";
    public static SubLSymbol $g3220$;
    private static SubLSymbol $g3221$;
    private static SubLSymbol $g3222$;
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
    private static final SubLSymbol $ic26$;
    private static final SubLList $ic27$;
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
    private static final SubLString $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLString $ic42$;
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
    private static final SubLString $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLString $ic56$;
    private static final SubLString $ic57$;
    private static final SubLString $ic58$;
    private static final SubLString $ic59$;
    
    public static SubLObject f27159(final SubLObject var1, final SubLObject var2) {
        compatibility.default_struct_print_function(var1, var2, (SubLObject)module0382.ZERO_INTEGER);
        return (SubLObject)module0382.NIL;
    }
    
    public static SubLObject f27160(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX30281_native.class) ? module0382.T : module0382.NIL);
    }
    
    public static SubLObject f27161(final SubLObject var1) {
        assert module0382.NIL != f27160(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f27162(final SubLObject var1) {
        assert module0382.NIL != f27160(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f27163(final SubLObject var1) {
        assert module0382.NIL != f27160(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f27164(final SubLObject var1, final SubLObject var4) {
        assert module0382.NIL != f27160(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f27165(final SubLObject var1, final SubLObject var4) {
        assert module0382.NIL != f27160(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f27166(final SubLObject var1, final SubLObject var4) {
        assert module0382.NIL != f27160(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f27167(SubLObject var5) {
        if (var5 == module0382.UNPROVIDED) {
            var5 = (SubLObject)module0382.NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX30281_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0382.NIL, var7 = var5; module0382.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0382.$ic15$)) {
                f27164(var6, var9);
            }
            else if (var10.eql((SubLObject)module0382.$ic16$)) {
                f27165(var6, var9);
            }
            else if (var10.eql((SubLObject)module0382.$ic17$)) {
                f27166(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0382.$ic18$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f27168(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0382.$ic19$, (SubLObject)module0382.$ic20$, (SubLObject)module0382.THREE_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)module0382.$ic21$, (SubLObject)module0382.$ic15$, f27161(var11));
        Functions.funcall(var12, var11, (SubLObject)module0382.$ic21$, (SubLObject)module0382.$ic16$, f27162(var11));
        Functions.funcall(var12, var11, (SubLObject)module0382.$ic21$, (SubLObject)module0382.$ic17$, f27163(var11));
        Functions.funcall(var12, var11, (SubLObject)module0382.$ic22$, (SubLObject)module0382.$ic20$, (SubLObject)module0382.THREE_INTEGER);
        return var11;
    }
    
    public static SubLObject f27169(final SubLObject var11, final SubLObject var12) {
        return f27168(var11, var12);
    }
    
    public static SubLObject f27170(final SubLObject var13) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0382.NIL != f27160(var13) && module0382.NIL != module0067.f4852(f27162(var13)));
    }
    
    public static SubLObject f27171(final SubLObject var14, final SubLObject var15) {
        final SubLObject var16 = f27167((SubLObject)module0382.UNPROVIDED);
        f27164(var16, f27172(var14, var15));
        f27165(var16, module0067.f4880(Symbols.symbol_function((SubLObject)module0382.EQUAL), (SubLObject)module0382.UNPROVIDED));
        f27166(var16, module0067.f4880(Symbols.symbol_function((SubLObject)module0382.EQUAL), (SubLObject)module0382.UNPROVIDED));
        return var16;
    }
    
    public static SubLObject f27173(final SubLObject var13) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0382.NIL != module0364.f24699(var13) && module0382.$ic24$ == module0364.f24721(var13));
    }
    
    public static SubLObject f27174(final SubLObject var17, final SubLObject var18, final SubLObject var19) {
        final SubLObject var20 = module0363.f24527(var17);
        SubLObject var21;
        SubLObject var22;
        SubLObject var23;
        for (var21 = module0032.f1741(var20), var22 = (SubLObject)module0382.NIL, var22 = module0032.f1742(var21, var20); module0382.NIL == module0032.f1744(var21, var22); var22 = module0032.f1743(var22)) {
            var23 = module0032.f1745(var21, var22);
            if (module0382.NIL != module0032.f1746(var22, var23) && module0382.NIL != module0364.f24748(var23, (SubLObject)module0382.$ic24$) && module0382.NIL != module0364.f24786(var18, f27175(var23)) && module0382.NIL != module0364.f24786(var19, f27176(var23))) {
                return var23;
            }
        }
        return f27177(var17, var18, var19);
    }
    
    public static SubLObject f27177(final SubLObject var17, final SubLObject var18, final SubLObject var19) {
        assert module0382.NIL != module0364.f24774(var18) : var18;
        assert module0382.NIL != module0364.f24774(var19) : var19;
        final SubLObject var20 = module0364.f24729((SubLObject)module0382.$ic24$, var17);
        final SubLObject var21 = f27171(var18, var19);
        module0364.f24744(var20, var21);
        module0364.f24783(var19, var20);
        module0364.f24783(var18, var20);
        module0373.f26334(var20);
        return var20;
    }
    
    public static SubLObject f27178(final SubLObject var25) {
        final SubLObject var26 = f27179(var25);
        if (module0382.NIL != module0365.f24845(var26)) {
            module0365.f24861(var26);
        }
        final SubLObject var27 = module0364.f24742(var25);
        if (module0382.NIL != f27170(var27)) {
            f27164(var27, (SubLObject)module0382.$ic26$);
            module0067.f4881(f27162(var27));
            f27165(var27, (SubLObject)module0382.$ic26$);
            module0067.f4881(f27163(var27));
            f27166(var27, (SubLObject)module0382.$ic26$);
        }
        return var25;
    }
    
    public static SubLObject f27180(final SubLObject var27, final SubLObject var28) {
        SubLObject var30;
        final SubLObject var29 = var30 = var27.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var30, var29, (SubLObject)module0382.$ic27$);
        final SubLObject var31 = var30.rest();
        var30 = var30.first();
        SubLObject var32 = (SubLObject)module0382.NIL;
        SubLObject var33 = (SubLObject)module0382.NIL;
        SubLObject var34 = (SubLObject)module0382.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var30, var29, (SubLObject)module0382.$ic27$);
        var32 = var30.first();
        var30 = var30.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var30, var29, (SubLObject)module0382.$ic27$);
        var33 = var30.first();
        var30 = var30.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var30, var29, (SubLObject)module0382.$ic27$);
        var34 = var30.first();
        var30 = var30.rest();
        if (module0382.NIL == var30) {
            final SubLObject var35;
            var30 = (var35 = var31);
            final SubLObject var36 = (SubLObject)module0382.$ic28$;
            final SubLObject var37 = (SubLObject)module0382.$ic29$;
            return (SubLObject)ConsesLow.list((SubLObject)module0382.$ic30$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var36, (SubLObject)ConsesLow.list((SubLObject)module0382.$ic31$, var34))), (SubLObject)ConsesLow.list((SubLObject)module0382.$ic32$, (SubLObject)ConsesLow.list(var32, var37, var36), (SubLObject)ConsesLow.listS((SubLObject)module0382.$ic33$, (SubLObject)ConsesLow.list(var33, var37), ConsesLow.append(var35, (SubLObject)module0382.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var29, (SubLObject)module0382.$ic27$);
        return (SubLObject)module0382.NIL;
    }
    
    public static SubLObject f27181(final SubLObject var27, final SubLObject var28) {
        SubLObject var30;
        final SubLObject var29 = var30 = var27.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var30, var29, (SubLObject)module0382.$ic27$);
        final SubLObject var31 = var30.rest();
        var30 = var30.first();
        SubLObject var32 = (SubLObject)module0382.NIL;
        SubLObject var33 = (SubLObject)module0382.NIL;
        SubLObject var34 = (SubLObject)module0382.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var30, var29, (SubLObject)module0382.$ic27$);
        var32 = var30.first();
        var30 = var30.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var30, var29, (SubLObject)module0382.$ic27$);
        var33 = var30.first();
        var30 = var30.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var30, var29, (SubLObject)module0382.$ic27$);
        var34 = var30.first();
        var30 = var30.rest();
        if (module0382.NIL == var30) {
            final SubLObject var35;
            var30 = (var35 = var31);
            final SubLObject var36 = (SubLObject)module0382.$ic34$;
            final SubLObject var37 = (SubLObject)module0382.$ic35$;
            return (SubLObject)ConsesLow.list((SubLObject)module0382.$ic30$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var36, (SubLObject)ConsesLow.list((SubLObject)module0382.$ic36$, var34))), (SubLObject)ConsesLow.list((SubLObject)module0382.$ic32$, (SubLObject)ConsesLow.list(var32, var37, var36), (SubLObject)ConsesLow.listS((SubLObject)module0382.$ic33$, (SubLObject)ConsesLow.list(var33, var37), ConsesLow.append(var35, (SubLObject)module0382.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var29, (SubLObject)module0382.$ic27$);
        return (SubLObject)module0382.NIL;
    }
    
    public static SubLObject f27182(final SubLObject var25) {
        return f27161(module0364.f24742(var25));
    }
    
    public static SubLObject f27183(final SubLObject var25) {
        return f27162(module0364.f24742(var25));
    }
    
    public static SubLObject f27184(final SubLObject var25) {
        return f27163(module0364.f24742(var25));
    }
    
    public static SubLObject f27175(final SubLObject var25) {
        return module0364.f24735(var25).first();
    }
    
    public static SubLObject f27176(final SubLObject var25) {
        return conses_high.second(module0364.f24735(var25));
    }
    
    public static SubLObject f27185(final SubLObject var25) {
        return module0364.f24736(f27175(var25));
    }
    
    public static SubLObject f27186(final SubLObject var25) {
        return module0364.f24736(f27176(var25));
    }
    
    public static SubLObject f27187(final SubLObject var25, final SubLObject var40) {
        return module0364.f24737(f27188(var25, var40));
    }
    
    public static SubLObject f27188(final SubLObject var25, final SubLObject var40) {
        return (module0382.NIL != var40) ? f27175(var25) : f27176(var25);
    }
    
    public static SubLObject f27189(final SubLObject var25, final SubLObject var40) {
        return (module0382.NIL != var40) ? f27176(var25) : f27175(var25);
    }
    
    public static SubLObject f27190(final SubLObject var25, final SubLObject var41) {
        final SubLObject var42 = f27183(var25);
        final SubLObject var43 = module0373.f26258(var41);
        final SubLObject var44 = module0067.f4884(var42, var43, (SubLObject)module0382.UNPROVIDED);
        return var44;
    }
    
    public static SubLObject f27191(final SubLObject var25, final SubLObject var41) {
        final SubLObject var42 = f27184(var25);
        final SubLObject var43 = module0373.f26258(var41);
        final SubLObject var44 = module0067.f4884(var42, var43, (SubLObject)module0382.UNPROVIDED);
        return var44;
    }
    
    public static SubLObject f27192(final SubLObject var25, final SubLObject var45, final SubLObject var40) {
        return (module0382.NIL != var40) ? f27191(var25, var45) : f27190(var25, var45);
    }
    
    public static SubLObject f27193(final SubLObject var25, final SubLObject var46, final SubLObject var40) {
        final SubLObject var47 = f27182(var25);
        final SubLObject var48 = f27187(var25, var40);
        final SubLObject var49 = module0233.f15384(var48, var46);
        final SubLObject var50 = module0233.f15391(var49, var47);
        return var50;
    }
    
    public static SubLObject f27194(final SubLObject var25) {
        final SubLObject var26 = f27179(var25);
        if (module0382.NIL != var26) {
            return var26;
        }
        if (module0382.NIL == module0363.f24685(module0364.f24725(var25))) {
            return Errors.error((SubLObject)module0382.$ic39$, var25);
        }
        return (SubLObject)module0382.NIL;
    }
    
    public static SubLObject f27179(final SubLObject var25) {
        final SubLThread var26 = SubLProcess.currentSubLThread();
        final SubLObject var27 = module0364.f24725(var25);
        SubLObject var28 = module0363.f24517(var27);
        SubLObject var29 = (SubLObject)module0382.NIL;
        var29 = var28.first();
        while (module0382.NIL != var28) {
            if (module0382.NIL != module0363.f24522(var29, module0382.$g3221$.getDynamicValue(var26)) && var25.eql(f27195(var29))) {
                return var29;
            }
            var28 = var28.rest();
            var29 = var28.first();
        }
        return (SubLObject)module0382.NIL;
    }
    
    public static SubLObject f27196(final SubLObject var25, final SubLObject var53, final SubLObject var54) {
        assert module0382.NIL != f27173(var25) : var25;
        assert module0382.NIL != module0366.f24916(var54) : var54;
        final SubLObject var55 = f27183(var25);
        final SubLObject var56 = module0373.f26258(var53);
        module0084.f5762(var55, var56, var54);
        return var25;
    }
    
    public static SubLObject f27197(final SubLObject var25, final SubLObject var53, final SubLObject var54) {
        assert module0382.NIL != f27173(var25) : var25;
        assert module0382.NIL != module0366.f24916(var54) : var54;
        final SubLObject var55 = f27183(var25);
        final SubLObject var56 = module0373.f26258(var53);
        module0084.f5772(var55, var56, var54, (SubLObject)module0382.UNPROVIDED, (SubLObject)module0382.UNPROVIDED);
        return var25;
    }
    
    public static SubLObject f27198(final SubLObject var25, final SubLObject var53, final SubLObject var54) {
        assert module0382.NIL != f27173(var25) : var25;
        assert module0382.NIL != module0366.f24916(var54) : var54;
        final SubLObject var55 = f27184(var25);
        final SubLObject var56 = module0373.f26258(var53);
        module0084.f5762(var55, var56, var54);
        return var25;
    }
    
    public static SubLObject f27199(final SubLObject var25, final SubLObject var53, final SubLObject var54) {
        assert module0382.NIL != f27173(var25) : var25;
        assert module0382.NIL != module0366.f24916(var54) : var54;
        final SubLObject var55 = f27184(var25);
        final SubLObject var56 = module0373.f26258(var53);
        module0084.f5772(var55, var56, var54, (SubLObject)module0382.UNPROVIDED, (SubLObject)module0382.UNPROVIDED);
        return var25;
    }
    
    public static SubLObject f27200(final SubLObject var25, final SubLObject var56, final SubLObject var40) {
        final SubLThread var57 = SubLProcess.currentSubLThread();
        if (module0382.NIL == Errors.$ignore_mustsP$.getDynamicValue(var57) && module0382.NIL == module0366.f24983(var56)) {
            Errors.error((SubLObject)module0382.$ic42$, var56);
        }
        final SubLObject var58 = f27193(var25, module0366.f24934(var56), var40);
        if (module0382.NIL != var40) {
            f27196(var25, var58, var56);
        }
        else {
            f27198(var25, var58, var56);
        }
        return (SubLObject)module0382.NIL;
    }
    
    public static SubLObject f27201(final SubLObject var25, final SubLObject var54, final SubLObject var53) {
        f27202(var25, var54, var53, (SubLObject)module0382.T);
        f27202(var25, var54, var53, (SubLObject)module0382.NIL);
        return (SubLObject)module0382.NIL;
    }
    
    public static SubLObject f27202(final SubLObject var25, final SubLObject var56, final SubLObject var46, final SubLObject var40) {
        final SubLObject var57 = f27193(var25, var46, var40);
        if (module0382.NIL != var40) {
            f27197(var25, var57, var56);
        }
        else {
            f27199(var25, var57, var56);
        }
        return (SubLObject)module0382.NIL;
    }
    
    public static SubLObject f27203(final SubLObject var58, final SubLObject var59, final SubLObject var60) {
        final SubLObject var61 = module0373.f26438(var58, var59, var60);
        final SubLObject var62 = module0373.f26439(var58, var59, var60);
        return Values.values(var61, var62);
    }
    
    public static SubLObject f27204(final SubLObject var14, final SubLObject var15) {
        final SubLObject var16 = f27172(var14, var15);
        return module0233.f15376(module0364.f24737(var14), var16);
    }
    
    public static SubLObject f27205(final SubLObject var14, final SubLObject var15) {
        final SubLObject var16 = f27172(var14, var15);
        return module0233.f15376(module0364.f24737(var15), var16);
    }
    
    public static SubLObject f27172(final SubLObject var14, final SubLObject var15) {
        SubLObject var16 = (SubLObject)module0382.NIL;
        final SubLObject var17 = module0364.f24737(var14);
        final SubLObject var18 = module0364.f24737(var15);
        SubLObject var19 = var17;
        SubLObject var20 = (SubLObject)module0382.NIL;
        var20 = var19.first();
        while (module0382.NIL != var19) {
            final SubLObject var21 = module0233.f15370(var20);
            if (module0382.NIL != module0004.f104(var21, var18, Symbols.symbol_function((SubLObject)module0382.EQL), Symbols.symbol_function((SubLObject)module0382.$ic43$))) {
                var16 = (SubLObject)ConsesLow.cons(var21, var16);
            }
            var19 = var19.rest();
            var20 = var19.first();
        }
        return module0193.f12092(var16);
    }
    
    public static SubLObject f27206(final SubLObject var13) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0382.NIL != module0365.f24819(var13) && module0382.$g3221$.getDynamicValue(var14).eql(module0365.f24865(var13)));
    }
    
    public static SubLObject f27207(final SubLObject var25, final SubLObject var60) {
        final SubLThread var61 = SubLProcess.currentSubLThread();
        final SubLObject var62 = module0364.f24725(var25);
        final SubLObject var63 = (SubLObject)ConsesLow.list(var25, var60);
        final SubLObject var64 = module0365.f24854(var62, module0382.$g3221$.getDynamicValue(var61), var63);
        final SubLObject var65 = var62;
        final SubLObject var66 = module0363.f24507(var65);
        final SubLObject var67 = module0361.f24123(var66);
        if (module0382.NIL == module0065.f4772(var67, (SubLObject)module0382.$ic44$)) {
            final SubLObject var71_72 = var67;
            if (module0382.NIL == module0065.f4775(var71_72, (SubLObject)module0382.$ic44$)) {
                final SubLObject var68 = module0065.f4740(var71_72);
                final SubLObject var69 = (SubLObject)module0382.NIL;
                SubLObject var70;
                SubLObject var71;
                SubLObject var72;
                SubLObject var73;
                SubLObject var74;
                SubLObject var75;
                SubLObject var76;
                SubLObject var77;
                SubLObject var78;
                for (var70 = Sequences.length(var68), var71 = (SubLObject)module0382.NIL, var71 = (SubLObject)module0382.ZERO_INTEGER; var71.numL(var70); var71 = Numbers.add(var71, (SubLObject)module0382.ONE_INTEGER)) {
                    var72 = ((module0382.NIL != var69) ? Numbers.subtract(var70, var71, (SubLObject)module0382.ONE_INTEGER) : var71);
                    var73 = Vectors.aref(var68, var72);
                    if (module0382.NIL == module0065.f4749(var73) || module0382.NIL == module0065.f4773((SubLObject)module0382.$ic44$)) {
                        if (module0382.NIL != module0065.f4749(var73)) {
                            var73 = (SubLObject)module0382.$ic44$;
                        }
                        if (module0382.NIL != module0363.f24547(var65, var73)) {
                            var74 = var73;
                            var75 = module0077.f5333(oc_inference_datastructures_inference.f25473(var74));
                            for (var76 = module0032.f1741(var75), var77 = (SubLObject)module0382.NIL, var77 = module0032.f1742(var76, var75); module0382.NIL == module0032.f1744(var76, var77); var77 = module0032.f1743(var77)) {
                                var78 = module0032.f1745(var76, var77);
                                if (module0382.NIL != module0032.f1746(var77, var78)) {
                                    module0387.f27563(var78, var64);
                                }
                            }
                        }
                    }
                }
            }
            final SubLObject var81_82 = var67;
            if (module0382.NIL == module0065.f4777(var81_82)) {
                final SubLObject var79 = module0065.f4738(var81_82);
                SubLObject var80 = (SubLObject)module0382.NIL;
                SubLObject var81 = (SubLObject)module0382.NIL;
                final Iterator var82 = Hashtables.getEntrySetIterator(var79);
                try {
                    while (Hashtables.iteratorHasNext(var82)) {
                        final Map.Entry var83 = Hashtables.iteratorNextEntry(var82);
                        var80 = Hashtables.getEntryKey(var83);
                        var81 = Hashtables.getEntryValue(var83);
                        if (module0382.NIL != module0363.f24547(var65, var81)) {
                            final SubLObject var84 = var81;
                            final SubLObject var85 = module0077.f5333(oc_inference_datastructures_inference.f25473(var84));
                            SubLObject var86;
                            SubLObject var87;
                            SubLObject var88;
                            for (var86 = module0032.f1741(var85), var87 = (SubLObject)module0382.NIL, var87 = module0032.f1742(var86, var85); module0382.NIL == module0032.f1744(var86, var87); var87 = module0032.f1743(var87)) {
                                var88 = module0032.f1745(var86, var87);
                                if (module0382.NIL != module0032.f1746(var87, var88)) {
                                    module0387.f27563(var88, var64);
                                }
                            }
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var82);
                }
            }
        }
        return var64;
    }
    
    public static SubLObject f27195(final SubLObject var50) {
        return module0365.f24871(var50).first();
    }
    
    public static SubLObject f27208(final SubLObject var26) {
        return conses_high.second(module0365.f24871(var26));
    }
    
    public static SubLObject f27209(final SubLObject var50) {
        final SubLObject var51 = f27195(var50);
        if (module0382.NIL != var51) {
            return f27185(var51);
        }
        return (SubLObject)module0382.NIL;
    }
    
    public static SubLObject f27210(final SubLObject var50) {
        final SubLObject var51 = f27195(var50);
        if (module0382.NIL != var51) {
            return f27186(var51);
        }
        return (SubLObject)module0382.NIL;
    }
    
    public static SubLObject f27211(final SubLObject var50) {
        final SubLThread var51 = SubLProcess.currentSubLThread();
        SubLObject var52 = f27209(var50);
        SubLObject var53 = f27210(var50);
        if (module0382.NIL == var52 || module0382.NIL == var53) {
            var51.resetMultipleValues();
            final SubLObject var54 = f27212(var50);
            final SubLObject var55 = var51.secondMultipleValue();
            var51.resetMultipleValues();
            var52 = module0364.f24736(var54);
            var53 = module0364.f24736(var55);
        }
        return Values.values(var52, var53);
    }
    
    public static SubLObject f27213(final SubLObject var17, final SubLObject var59) {
        if (module0382.NIL != module0204.f13077(var59) && module0382.NIL == module0349.f23461(var59)) {
            SubLObject var60 = (SubLObject)module0382.NIL;
            SubLObject var61 = (SubLObject)module0382.ZERO_INTEGER;
            SubLObject var62 = module0232.f15306(var59);
            SubLObject var63 = (SubLObject)module0382.NIL;
            var63 = var62.first();
            while (module0382.NIL != var62) {
                final SubLObject var64 = (SubLObject)module0382.$ic45$;
                if (module0382.NIL == var60) {
                    final SubLObject var65 = module0204.f13103(var64, var61);
                    f27214(var17, var65, var59);
                    var60 = (SubLObject)module0382.T;
                }
                var61 = Numbers.add(var61, (SubLObject)module0382.ONE_INTEGER);
                var62 = var62.rest();
                var63 = var62.first();
            }
            var61 = (SubLObject)module0382.ZERO_INTEGER;
            var62 = module0232.f15308(var59);
            var63 = (SubLObject)module0382.NIL;
            var63 = var62.first();
            while (module0382.NIL != var62) {
                final SubLObject var64 = (SubLObject)module0382.$ic46$;
                if (module0382.NIL == var60) {
                    final SubLObject var65 = module0204.f13103(var64, var61);
                    f27214(var17, var65, var59);
                    var60 = (SubLObject)module0382.T;
                }
                var61 = Numbers.add(var61, (SubLObject)module0382.ONE_INTEGER);
                var62 = var62.rest();
                var63 = var62.first();
            }
        }
        return (SubLObject)module0382.NIL;
    }
    
    public static SubLObject f27214(final SubLObject var17, final SubLObject var60, final SubLObject var59) {
        final SubLThread var61 = SubLProcess.currentSubLThread();
        assert module0382.NIL != module0204.f13097(var60) : var60;
        final SubLObject var62 = module0363.f24507(var17);
        var61.resetMultipleValues();
        final SubLObject var63 = f27203(var62, var59, var60);
        final SubLObject var64 = var61.secondMultipleValue();
        var61.resetMultipleValues();
        final SubLObject var65 = f27174(var17, var63, var64);
        return f27207(var65, var60);
    }
    
    public static SubLObject f27215(final SubLObject var26, final SubLObject var80) {
        final SubLThread var81 = SubLProcess.currentSubLThread();
        assert module0382.NIL != f27206(var26) : var26;
        assert module0382.NIL != module0367.f24997(var80) : var80;
        final SubLObject var82 = f27195(var26);
        final SubLObject var83 = f27175(var82);
        final SubLObject var84 = f27176(var82);
        if (module0382.NIL == module0358.f23680(module0365.f24868(var26))) {
            var81.resetMultipleValues();
            final SubLObject var85 = f27216(var83, var84, (SubLObject)module0382.$ic50$);
            final SubLObject var86 = var81.secondMultipleValue();
            var81.resetMultipleValues();
            module0365.f24873(var26, var85, var86);
            if (module0382.$ic51$ == var85) {
                module0373.f26390(var26, (SubLObject)module0382.$ic50$);
            }
        }
        var81.resetMultipleValues();
        final SubLObject var85 = f27216(var83, var84, var80);
        final SubLObject var86 = var81.secondMultipleValue();
        var81.resetMultipleValues();
        module0367.f25205(var26, var80, var85, var86);
        if (module0382.$ic51$ == var85) {
            module0373.f26390(var26, var80);
        }
        final SubLObject var87 = f27217(var83, var84, var80);
        module0367.f25206(var26, var80, var87);
        return var26;
    }
    
    public static SubLObject f27217(final SubLObject var14, final SubLObject var15, final SubLObject var80) {
        final SubLThread var81 = SubLProcess.currentSubLThread();
        assert module0382.NIL != module0364.f24774(var14) : var14;
        assert module0382.NIL != module0364.f24774(var15) : var15;
        assert module0382.NIL != module0367.f24997(var80) : var80;
        final SubLObject var82 = module0364.f24736(var14);
        final SubLObject var83 = module0364.f24736(var15);
        final SubLObject var84 = module0385.f27404(var82, var80);
        final SubLObject var85 = module0385.f27404(var83, var80);
        final SubLObject var86 = module0360.f23945(var84, var85);
        final SubLObject var87 = module0360.f23948(var86, module0382.$g3222$.getDynamicValue(var81));
        return var87;
    }
    
    public static SubLObject f27216(final SubLObject var14, final SubLObject var15, final SubLObject var98) {
        final SubLThread var99 = SubLProcess.currentSubLThread();
        assert module0382.NIL != module0364.f24774(var14) : var14;
        assert module0382.NIL != module0364.f24774(var15) : var15;
        assert module0382.NIL != module0373.f26190(var98) : var98;
        final SubLObject var100 = module0364.f24736(var14);
        final SubLObject var101 = f27204(var14, var15);
        final SubLObject var102 = module0364.f24736(var15);
        final SubLObject var103 = f27205(var14, var15);
        var99.resetMultipleValues();
        final SubLObject var104 = module0388.f27577(var100, var98, var101);
        final SubLObject var105 = var99.secondMultipleValue();
        var99.resetMultipleValues();
        var99.resetMultipleValues();
        final SubLObject var106 = module0388.f27577(var102, var98, var103);
        final SubLObject var107 = var99.secondMultipleValue();
        var99.resetMultipleValues();
        if (var104 == module0382.$ic53$ && module0382.NIL != Strings.stringE(var105, (SubLObject)module0382.$ic54$, (SubLObject)module0382.UNPROVIDED, (SubLObject)module0382.UNPROVIDED, (SubLObject)module0382.UNPROVIDED, (SubLObject)module0382.UNPROVIDED) && var106 == module0382.$ic53$ && module0382.NIL != Strings.stringE(var107, (SubLObject)module0382.$ic54$, (SubLObject)module0382.UNPROVIDED, (SubLObject)module0382.UNPROVIDED, (SubLObject)module0382.UNPROVIDED, (SubLObject)module0382.UNPROVIDED)) {
            return Values.values((SubLObject)module0382.$ic55$, (SubLObject)module0382.$ic56$);
        }
        if (module0382.NIL != module0358.f23663(var104, var106)) {
            final SubLObject var108 = Sequences.cconcatenate((SubLObject)module0382.$ic57$, var105);
            return Values.values(var104, var108);
        }
        final SubLObject var108 = Sequences.cconcatenate((SubLObject)module0382.$ic58$, var107);
        return Values.values(var106, var108);
    }
    
    public static SubLObject f27218(final SubLObject var26) {
        final SubLThread var27 = SubLProcess.currentSubLThread();
        var27.resetMultipleValues();
        final SubLObject var28 = f27212(var26);
        final SubLObject var29 = var27.secondMultipleValue();
        var27.resetMultipleValues();
        final SubLObject var30 = f27195(var26);
        module0373.f26343(var30, var28);
        module0373.f26343(var30, var29);
        if (module0382.NIL != module0384.f27362(var26, (SubLObject)module0382.$ic50$)) {
            module0373.f26209(var26);
        }
        module0381.f27094(var26);
        return var26;
    }
    
    public static SubLObject f27212(final SubLObject var26) {
        final SubLThread var27 = SubLProcess.currentSubLThread();
        final SubLObject var28 = module0365.f24850(var26);
        final SubLObject var29 = module0363.f24509(var28);
        if (module0382.NIL == Errors.$ignore_mustsP$.getDynamicValue(var27) && module0382.NIL == module0035.f1997(var29)) {
            Errors.error((SubLObject)module0382.$ic59$, var26, var29);
        }
        final SubLObject var30 = module0363.f24507(var28);
        final SubLObject var31 = var29.first();
        final SubLObject var32 = f27208(var26);
        return f27203(var30, var31, var32);
    }
    
    public static SubLObject f27219(final SubLObject var25, final SubLObject var106) {
        return module0381.f27097(var25, var106);
    }
    
    public static SubLObject f27220(final SubLObject var13) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0382.NIL != module0366.f24916(var13) && module0382.$ic24$ == module0366.f24989(var13));
    }
    
    public static SubLObject f27221(final SubLObject var107, final SubLObject var108, final SubLObject var25) {
        final SubLObject var109 = f27222(var107, var108, var25);
        f27200(var25, var107, var109);
        f27223(var107, var108, var25, var109);
        return (SubLObject)module0382.NIL;
    }
    
    public static SubLObject f27222(final SubLObject var109, final SubLObject var110, final SubLObject var25) {
        final SubLObject var111 = f27175(var25);
        final SubLObject var112 = module0364.f24736(var111);
        final SubLObject var113 = module0366.f24956(var109);
        if (var112.eql(var113)) {
            final SubLObject var114 = module0364.f24737(var111);
            if (module0382.NIL != module0233.f15364(var114, var110)) {
                return (SubLObject)module0382.T;
            }
        }
        return (SubLObject)module0382.NIL;
    }
    
    public static SubLObject f27223(final SubLObject var107, final SubLObject var108, final SubLObject var25, final SubLObject var40) {
        final SubLThread var109 = SubLProcess.currentSubLThread();
        SubLObject var110 = (SubLObject)module0382.NIL;
        final SubLObject var111 = module0366.f24934(var107);
        final SubLObject var112 = f27193(var25, var111, var40);
        final SubLObject var113 = f27192(var25, var112, var40);
        if (module0382.NIL != var113) {
            final SubLObject var114 = f27189(var25, var40);
            final SubLObject var115 = module0364.f24737(var114);
            SubLObject var116 = (SubLObject)module0382.NIL;
            SubLObject var117 = var113;
            SubLObject var118 = (SubLObject)module0382.NIL;
            var118 = var117.first();
            while (module0382.NIL != var117) {
                final SubLObject var119 = module0233.f15382(var115, module0366.f24934(var118));
                var116 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var118, var119), var116);
                var117 = var117.rest();
                var118 = var117.first();
            }
            var116 = Sequences.nreverse(var116);
            final SubLObject var120 = module0233.f15382(var108, var111);
            final SubLObject var121 = (SubLObject)((module0382.NIL != var40) ? ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons(var107, var120)), var116) : ConsesLow.list(var116, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons(var107, var120))));
            SubLObject var123;
            final SubLObject var122 = var123 = module0035.f2489(var121, (SubLObject)module0382.UNPROVIDED, (SubLObject)module0382.UNPROVIDED, (SubLObject)module0382.UNPROVIDED);
            SubLObject var124 = (SubLObject)module0382.NIL;
            var124 = var123.first();
            while (module0382.NIL != var123) {
                var109.resetMultipleValues();
                final SubLObject var125 = f27219(var25, var124);
                final SubLObject var126 = var109.secondMultipleValue();
                var109.resetMultipleValues();
                if (module0382.NIL != var126) {
                    var110 = (SubLObject)ConsesLow.cons(var125, var110);
                }
                else {
                    module0373.f26245(var107);
                }
                var123 = var123.rest();
                var124 = var123.first();
            }
            SubLObject var127;
            var110 = (var127 = Sequences.nreverse(var110));
            SubLObject var128 = (SubLObject)module0382.NIL;
            var128 = var127.first();
            while (module0382.NIL != var127) {
                module0373.f26265(var128);
                var127 = var127.rest();
                var128 = var127.first();
            }
        }
        return (SubLObject)module0382.NIL;
    }
    
    public static SubLObject f27224() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0382", "f27159", "S#30283", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0382", "f27160", "S#30282", 1, 0, false);
        new $f27160$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0382", "f27161", "S#30284", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0382", "f27162", "S#30285", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0382", "f27163", "S#30286", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0382", "f27164", "S#30287", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0382", "f27165", "S#30288", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0382", "f27166", "S#30289", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0382", "f27167", "S#30290", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0382", "f27168", "S#30291", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0382", "f27169", "S#30292", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0382", "f27170", "S#30293", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0382", "f27171", "S#30294", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0382", "f27173", "S#29225", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0382", "f27174", "S#30295", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0382", "f27177", "S#30296", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0382", "f27178", "S#27592", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0382", "f27180", "S#30297");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0382", "f27181", "S#30298");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0382", "f27182", "S#30299", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0382", "f27183", "S#30300", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0382", "f27184", "S#30301", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0382", "f27175", "S#30302", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0382", "f27176", "S#30303", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0382", "f27185", "S#29299", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0382", "f27186", "S#29300", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0382", "f27187", "S#30304", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0382", "f27188", "S#30305", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0382", "f27189", "S#30306", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0382", "f27190", "S#30307", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0382", "f27191", "S#30308", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0382", "f27192", "S#30309", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0382", "f27193", "S#30310", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0382", "f27194", "S#28944", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0382", "f27179", "S#30311", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0382", "f27196", "S#30312", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0382", "f27197", "S#30313", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0382", "f27198", "S#30314", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0382", "f27199", "S#30315", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0382", "f27200", "S#30316", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0382", "f27201", "S#27389", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0382", "f27202", "S#30317", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0382", "f27203", "S#30318", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0382", "f27204", "S#30319", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0382", "f27205", "S#30320", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0382", "f27172", "S#30321", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0382", "f27206", "S#27353", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0382", "f27207", "S#30322", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0382", "f27195", "S#29227", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0382", "f27208", "S#30323", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0382", "f27209", "S#30324", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0382", "f27210", "S#30325", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0382", "f27211", "S#29247", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0382", "f27213", "S#29187", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0382", "f27214", "S#30326", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0382", "f27215", "S#29200", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0382", "f27217", "S#30327", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0382", "f27216", "S#30328", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0382", "f27218", "S#29223", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0382", "f27212", "S#28951", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0382", "f27219", "S#30329", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0382", "f27220", "S#30166", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0382", "f27221", "S#29263", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0382", "f27222", "S#30330", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0382", "f27223", "S#30331", 4, 0, false);
        return (SubLObject)module0382.NIL;
    }
    
    public static SubLObject f27225() {
        module0382.$g3220$ = SubLFiles.defconstant("S#30332", (SubLObject)module0382.$ic0$);
        module0382.$g3221$ = SubLFiles.defparameter("S#30333", module0340.f22997((SubLObject)module0382.$ic24$, (SubLObject)module0382.UNPROVIDED));
        module0382.$g3222$ = SubLFiles.defparameter("S#30334", (SubLObject)module0382.EIGHT_INTEGER);
        return (SubLObject)module0382.NIL;
    }
    
    public static SubLObject f27226() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0382.$g3220$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0382.$ic7$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0382.$ic8$);
        Structures.def_csetf((SubLObject)module0382.$ic9$, (SubLObject)module0382.$ic10$);
        Structures.def_csetf((SubLObject)module0382.$ic11$, (SubLObject)module0382.$ic12$);
        Structures.def_csetf((SubLObject)module0382.$ic13$, (SubLObject)module0382.$ic14$);
        Equality.identity((SubLObject)module0382.$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0382.$g3220$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0382.$ic23$));
        module0002.f50((SubLObject)module0382.$ic31$, (SubLObject)module0382.$ic37$);
        module0002.f50((SubLObject)module0382.$ic36$, (SubLObject)module0382.$ic38$);
        return (SubLObject)module0382.NIL;
    }
    
    public void declareFunctions() {
        f27224();
    }
    
    public void initializeVariables() {
        f27225();
    }
    
    public void runTopLevelForms() {
        f27226();
    }
    
    static {
        me = (SubLFile)new module0382();
        module0382.$g3220$ = null;
        module0382.$g3221$ = null;
        module0382.$g3222$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#30281", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("S#30282", "CYC");
        $ic2$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#30335", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#30336", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#30337", "CYC"));
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("JOIN-VARS"), (SubLObject)SubLObjectFactory.makeKeyword("FIRST-PROOF-INDEX"), (SubLObject)SubLObjectFactory.makeKeyword("SECOND-PROOF-INDEX"));
        $ic4$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#30284", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#30285", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#30286", "CYC"));
        $ic5$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#30287", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#30288", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#30289", "CYC"));
        $ic6$ = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $ic7$ = SubLObjectFactory.makeSymbol("S#30283", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#30282", "CYC"));
        $ic9$ = SubLObjectFactory.makeSymbol("S#30284", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("S#30287", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#30285", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#30288", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("S#30286", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("S#30289", "CYC");
        $ic15$ = SubLObjectFactory.makeKeyword("JOIN-VARS");
        $ic16$ = SubLObjectFactory.makeKeyword("FIRST-PROOF-INDEX");
        $ic17$ = SubLObjectFactory.makeKeyword("SECOND-PROOF-INDEX");
        $ic18$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic19$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic20$ = SubLObjectFactory.makeSymbol("S#30290", "CYC");
        $ic21$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic22$ = SubLObjectFactory.makeKeyword("END");
        $ic23$ = SubLObjectFactory.makeSymbol("S#30292", "CYC");
        $ic24$ = SubLObjectFactory.makeKeyword("JOIN");
        $ic25$ = SubLObjectFactory.makeSymbol("S#27608", "CYC");
        $ic26$ = SubLObjectFactory.makeKeyword("FREE");
        $ic27$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#30274", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#25415", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#30338", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic28$ = SubLObjectFactory.makeUninternedSymbol("US#13A64D7");
        $ic29$ = SubLObjectFactory.makeUninternedSymbol("US#D2A5C4");
        $ic30$ = SubLObjectFactory.makeSymbol("CLET");
        $ic31$ = SubLObjectFactory.makeSymbol("S#30300", "CYC");
        $ic32$ = SubLObjectFactory.makeSymbol("DO-DICTIONARY");
        $ic33$ = SubLObjectFactory.makeSymbol("DO-LIST");
        $ic34$ = SubLObjectFactory.makeUninternedSymbol("US#13A64D7");
        $ic35$ = SubLObjectFactory.makeUninternedSymbol("US#D2A5C4");
        $ic36$ = SubLObjectFactory.makeSymbol("S#30301", "CYC");
        $ic37$ = SubLObjectFactory.makeSymbol("S#30297", "CYC");
        $ic38$ = SubLObjectFactory.makeSymbol("S#30298", "CYC");
        $ic39$ = SubLObjectFactory.makeString("couldn't find the join tactic for ~s");
        $ic40$ = SubLObjectFactory.makeSymbol("S#29225", "CYC");
        $ic41$ = SubLObjectFactory.makeSymbol("S#26816", "CYC");
        $ic42$ = SubLObjectFactory.makeString("~a was a rejected proof");
        $ic43$ = SubLObjectFactory.makeSymbol("S#17993", "CYC");
        $ic44$ = SubLObjectFactory.makeKeyword("SKIP");
        $ic45$ = SubLObjectFactory.makeKeyword("NEG");
        $ic46$ = SubLObjectFactory.makeKeyword("POS");
        $ic47$ = SubLObjectFactory.makeSymbol("S#15995", "CYC");
        $ic48$ = SubLObjectFactory.makeSymbol("S#27353", "CYC");
        $ic49$ = SubLObjectFactory.makeSymbol("S#27896", "CYC");
        $ic50$ = SubLObjectFactory.makeKeyword("TACTICAL");
        $ic51$ = SubLObjectFactory.makeKeyword("DOOMED");
        $ic52$ = SubLObjectFactory.makeSymbol("S#27373", "CYC");
        $ic53$ = SubLObjectFactory.makeKeyword("DISPREFERRED");
        $ic54$ = SubLObjectFactory.makeString("TVA-POS");
        $ic55$ = SubLObjectFactory.makeKeyword("GROSSLY-DISPREFERRED");
        $ic56$ = SubLObjectFactory.makeString("DOUBLE TVA-POS");
        $ic57$ = SubLObjectFactory.makeString("first problem: ");
        $ic58$ = SubLObjectFactory.makeString("second problem: ");
        $ic59$ = SubLObjectFactory.makeString("Join tactics like ~a must only apply to singleton problem queries, but ~s was not a singleton");
    }
    
    public static final class $sX30281_native extends SubLStructNative
    {
        public SubLObject $join_vars;
        public SubLObject $first_proof_index;
        public SubLObject $second_proof_index;
        private static final SubLStructDeclNative structDecl;
        
        public $sX30281_native() {
            this.$join_vars = (SubLObject)CommonSymbols.NIL;
            this.$first_proof_index = (SubLObject)CommonSymbols.NIL;
            this.$second_proof_index = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX30281_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$join_vars;
        }
        
        public SubLObject getField3() {
            return this.$first_proof_index;
        }
        
        public SubLObject getField4() {
            return this.$second_proof_index;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$join_vars = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$first_proof_index = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$second_proof_index = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX30281_native.class, module0382.$ic0$, module0382.$ic1$, module0382.$ic2$, module0382.$ic3$, new String[] { "$join_vars", "$first_proof_index", "$second_proof_index" }, module0382.$ic4$, module0382.$ic5$, module0382.$ic6$);
        }
    }
    
    public static final class $f27160$UnaryFunction extends UnaryFunction
    {
        public $f27160$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#30282"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0382.f27160(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0382.class
	Total time: 309 ms
	
	Decompiled with Procyon 0.5.32.
*/