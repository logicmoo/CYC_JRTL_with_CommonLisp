package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0363 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0363";
    public static final String myFingerPrint = "a3ac127cf4de3d6662ae07606d86d3036923d3e32e3284fe37462f8c10b36243";
    public static SubLSymbol $g3129$;
    public static SubLSymbol $g3130$;
    private static SubLSymbol $g3131$;
    public static SubLSymbol $g3132$;
    public static SubLSymbol $g3133$;
    public static SubLSymbol $g3134$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLInteger $ic2$;
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
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLString $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLString $ic50$;
    private static final SubLString $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLString $ic55$;
    private static final SubLString $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLString $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLList $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLList $ic65$;
    private static final SubLList $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLList $ic71$;
    private static final SubLList $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
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
    private static final SubLList $ic93$;
    private static final SubLSymbol $ic94$;
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
    private static final SubLList $ic112$;
    private static final SubLList $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLSymbol $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLList $ic118$;
    private static final SubLList $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLSymbol $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLList $ic125$;
    private static final SubLSymbol $ic126$;
    private static final SubLSymbol $ic127$;
    private static final SubLList $ic128$;
    private static final SubLSymbol $ic129$;
    private static final SubLSymbol $ic130$;
    private static final SubLList $ic131$;
    private static final SubLSymbol $ic132$;
    private static final SubLSymbol $ic133$;
    private static final SubLList $ic134$;
    private static final SubLList $ic135$;
    private static final SubLSymbol $ic136$;
    private static final SubLSymbol $ic137$;
    private static final SubLSymbol $ic138$;
    private static final SubLSymbol $ic139$;
    private static final SubLSymbol $ic140$;
    private static final SubLSymbol $ic141$;
    private static final SubLSymbol $ic142$;
    private static final SubLSymbol $ic143$;
    private static final SubLSymbol $ic144$;
    private static final SubLList $ic145$;
    private static final SubLSymbol $ic146$;
    private static final SubLSymbol $ic147$;
    private static final SubLSymbol $ic148$;
    private static final SubLList $ic149$;
    private static final SubLSymbol $ic150$;
    private static final SubLSymbol $ic151$;
    private static final SubLSymbol $ic152$;
    private static final SubLSymbol $ic153$;
    private static final SubLSymbol $ic154$;
    private static final SubLList $ic155$;
    private static final SubLSymbol $ic156$;
    private static final SubLSymbol $ic157$;
    private static final SubLSymbol $ic158$;
    private static final SubLSymbol $ic159$;
    private static final SubLList $ic160$;
    private static final SubLSymbol $ic161$;
    private static final SubLSymbol $ic162$;
    private static final SubLSymbol $ic163$;
    private static final SubLList $ic164$;
    private static final SubLSymbol $ic165$;
    private static final SubLList $ic166$;
    private static final SubLSymbol $ic167$;
    private static final SubLSymbol $ic168$;
    private static final SubLSymbol $ic169$;
    private static final SubLString $ic170$;
    private static final SubLSymbol $ic171$;
    private static final SubLList $ic172$;
    private static final SubLSymbol $ic173$;
    private static final SubLObject $ic174$;
    private static final SubLObject $ic175$;
    private static final SubLString $ic176$;
    private static final SubLList $ic177$;
    private static final SubLString $ic178$;
    private static final SubLString $ic179$;
    private static final SubLSymbol $ic180$;
    private static final SubLSymbol $ic181$;
    private static final SubLSymbol $ic182$;
    private static final SubLString $ic183$;
    private static final SubLString $ic184$;
    private static final SubLSymbol $ic185$;
    private static final SubLSymbol $ic186$;
    private static final SubLSymbol $ic187$;
    private static final SubLSymbol $ic188$;
    private static final SubLSymbol $ic189$;
    private static final SubLSymbol $ic190$;
    private static final SubLSymbol $ic191$;
    private static final SubLSymbol $ic192$;
    private static final SubLSymbol $ic193$;
    private static final SubLSymbol $ic194$;
    private static final SubLSymbol $ic195$;
    private static final SubLSymbol $ic196$;
    private static final SubLSymbol $ic197$;
    private static final SubLSymbol $ic198$;
    private static final SubLSymbol $ic199$;
    private static final SubLSymbol $ic200$;
    private static final SubLSymbol $ic201$;
    private static final SubLSymbol $ic202$;
    private static final SubLSymbol $ic203$;
    private static final SubLSymbol $ic204$;
    private static final SubLSymbol $ic205$;
    private static final SubLInteger $ic206$;
    private static final SubLSymbol $ic207$;
    private static final SubLString $ic208$;
    private static final SubLSymbol $ic209$;
    private static final SubLSymbol $ic210$;
    private static final SubLSymbol $ic211$;
    private static final SubLSymbol $ic212$;
    private static final SubLSymbol $ic213$;
    private static final SubLSymbol $ic214$;
    private static final SubLSymbol $ic215$;
    
    
    public static SubLObject f24476(final SubLObject var1, final SubLObject var2) {
        f24477(var1, var2, (SubLObject)module0363.ZERO_INTEGER);
        return (SubLObject)module0363.NIL;
    }
    
    public static SubLObject f24478(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX24274_native.class) ? module0363.T : module0363.NIL);
    }
    
    public static SubLObject f24479(final SubLObject var1) {
        assert module0363.NIL != f24478(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f24480(final SubLObject var1) {
        assert module0363.NIL != f24478(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f24481(final SubLObject var1) {
        assert module0363.NIL != f24478(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f24482(final SubLObject var1) {
        assert module0363.NIL != f24478(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f24483(final SubLObject var1) {
        assert module0363.NIL != f24478(var1) : var1;
        return var1.getField6();
    }
    
    public static SubLObject f24484(final SubLObject var1) {
        assert module0363.NIL != f24478(var1) : var1;
        return var1.getField7();
    }
    
    public static SubLObject f24485(final SubLObject var1) {
        assert module0363.NIL != f24478(var1) : var1;
        return var1.getField8();
    }
    
    public static SubLObject f24486(final SubLObject var1) {
        assert module0363.NIL != f24478(var1) : var1;
        return var1.getField9();
    }
    
    public static SubLObject f24487(final SubLObject var1) {
        assert module0363.NIL != f24478(var1) : var1;
        return var1.getField10();
    }
    
    public static SubLObject f24488(final SubLObject var1) {
        assert module0363.NIL != f24478(var1) : var1;
        return var1.getField11();
    }
    
    public static SubLObject f24489(final SubLObject var1) {
        assert module0363.NIL != f24478(var1) : var1;
        return var1.getField12();
    }
    
    public static SubLObject f24490(final SubLObject var1, final SubLObject var4) {
        assert module0363.NIL != f24478(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f24491(final SubLObject var1, final SubLObject var4) {
        assert module0363.NIL != f24478(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f24492(final SubLObject var1, final SubLObject var4) {
        assert module0363.NIL != f24478(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f24493(final SubLObject var1, final SubLObject var4) {
        assert module0363.NIL != f24478(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f24494(final SubLObject var1, final SubLObject var4) {
        assert module0363.NIL != f24478(var1) : var1;
        return var1.setField6(var4);
    }
    
    public static SubLObject f24495(final SubLObject var1, final SubLObject var4) {
        assert module0363.NIL != f24478(var1) : var1;
        return var1.setField7(var4);
    }
    
    public static SubLObject f24496(final SubLObject var1, final SubLObject var4) {
        assert module0363.NIL != f24478(var1) : var1;
        return var1.setField8(var4);
    }
    
    public static SubLObject f24497(final SubLObject var1, final SubLObject var4) {
        assert module0363.NIL != f24478(var1) : var1;
        return var1.setField9(var4);
    }
    
    public static SubLObject f24498(final SubLObject var1, final SubLObject var4) {
        assert module0363.NIL != f24478(var1) : var1;
        return var1.setField10(var4);
    }
    
    public static SubLObject f24499(final SubLObject var1, final SubLObject var4) {
        assert module0363.NIL != f24478(var1) : var1;
        return var1.setField11(var4);
    }
    
    public static SubLObject f24500(final SubLObject var1, final SubLObject var4) {
        assert module0363.NIL != f24478(var1) : var1;
        return var1.setField12(var4);
    }
    
    public static SubLObject f24501(SubLObject var5) {
        if (var5 == module0363.UNPROVIDED) {
            var5 = (SubLObject)module0363.NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX24274_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0363.NIL, var7 = var5; module0363.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0363.$ic32$)) {
                f24490(var6, var9);
            }
            else if (var10.eql((SubLObject)module0363.$ic33$)) {
                f24491(var6, var9);
            }
            else if (var10.eql((SubLObject)module0363.$ic34$)) {
                f24492(var6, var9);
            }
            else if (var10.eql((SubLObject)module0363.$ic35$)) {
                f24493(var6, var9);
            }
            else if (var10.eql((SubLObject)module0363.$ic36$)) {
                f24494(var6, var9);
            }
            else if (var10.eql((SubLObject)module0363.$ic37$)) {
                f24495(var6, var9);
            }
            else if (var10.eql((SubLObject)module0363.$ic38$)) {
                f24496(var6, var9);
            }
            else if (var10.eql((SubLObject)module0363.$ic39$)) {
                f24497(var6, var9);
            }
            else if (var10.eql((SubLObject)module0363.$ic40$)) {
                f24498(var6, var9);
            }
            else if (var10.eql((SubLObject)module0363.$ic41$)) {
                f24499(var6, var9);
            }
            else if (var10.eql((SubLObject)module0363.$ic42$)) {
                f24500(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0363.$ic43$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f24502(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0363.$ic44$, (SubLObject)module0363.$ic45$, (SubLObject)module0363.ELEVEN_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)module0363.$ic46$, (SubLObject)module0363.$ic32$, f24479(var11));
        Functions.funcall(var12, var11, (SubLObject)module0363.$ic46$, (SubLObject)module0363.$ic33$, f24480(var11));
        Functions.funcall(var12, var11, (SubLObject)module0363.$ic46$, (SubLObject)module0363.$ic34$, f24481(var11));
        Functions.funcall(var12, var11, (SubLObject)module0363.$ic46$, (SubLObject)module0363.$ic35$, f24482(var11));
        Functions.funcall(var12, var11, (SubLObject)module0363.$ic46$, (SubLObject)module0363.$ic36$, f24483(var11));
        Functions.funcall(var12, var11, (SubLObject)module0363.$ic46$, (SubLObject)module0363.$ic37$, f24484(var11));
        Functions.funcall(var12, var11, (SubLObject)module0363.$ic46$, (SubLObject)module0363.$ic38$, f24485(var11));
        Functions.funcall(var12, var11, (SubLObject)module0363.$ic46$, (SubLObject)module0363.$ic39$, f24486(var11));
        Functions.funcall(var12, var11, (SubLObject)module0363.$ic46$, (SubLObject)module0363.$ic40$, f24487(var11));
        Functions.funcall(var12, var11, (SubLObject)module0363.$ic46$, (SubLObject)module0363.$ic41$, f24488(var11));
        Functions.funcall(var12, var11, (SubLObject)module0363.$ic46$, (SubLObject)module0363.$ic42$, f24489(var11));
        Functions.funcall(var12, var11, (SubLObject)module0363.$ic47$, (SubLObject)module0363.$ic45$, (SubLObject)module0363.ELEVEN_INTEGER);
        return var11;
    }
    
    public static SubLObject f24503(final SubLObject var11, final SubLObject var12) {
        return f24502(var11, var12);
    }
    
    public static SubLObject f24504(final SubLObject var13) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0363.NIL != f24478(var13) && module0363.NIL == f24505(var13));
    }
    
    public static SubLObject f24505(final SubLObject var14) {
        return Equality.eq((SubLObject)module0363.$ic49$, f24506(var14));
    }
    
    public static SubLObject f24477(final SubLObject var13, final SubLObject var2, final SubLObject var15) {
        if (module0363.NIL != f24505(var13)) {
            PrintLow.format(var2, (SubLObject)module0363.$ic50$, f24479(var13));
        }
        else {
            PrintLow.format(var2, (SubLObject)module0363.$ic51$, new SubLObject[] { f24506(var13), module0361.f23996(f24507(var13)), f24508(var13), f24509(var13) });
        }
        return (SubLObject)module0363.NIL;
    }
    
    public static SubLObject f24510(final SubLObject var13) {
        return f24479(var13);
    }
    
    public static SubLObject f24511(final SubLObject var16, final SubLObject var17) {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        assert module0363.NIL != module0361.f24009(var16) : var16;
        enforceType(var17, module0363.$ic54$);
        module0427.f30303();
        if (module0363.NIL != module0018.$g629$.getDynamicValue(var18) && module0363.NIL != module0361.f24234(var16)) {
            Errors.cerror((SubLObject)module0363.$ic55$, (SubLObject)module0363.$ic56$, module0361.f24228(var16), var16);
        }
        final SubLObject var19 = f24501((SubLObject)module0363.UNPROVIDED);
        final SubLObject var20 = module0361.f24358(var16);
        module0413.f28760();
        if (module0363.NIL != module0362.f24461(var17)) {
            module0413.f28769();
        }
        f24490(var19, var20);
        f24491(var19, var16);
        f24492(var19, var17);
        f24512(var19, (SubLObject)module0363.$ic57$);
        f24495(var19, module0032.f1726((SubLObject)module0363.ZERO_INTEGER, Symbols.symbol_function((SubLObject)module0363.EQ)));
        f24494(var19, module0032.f1726((SubLObject)module0363.ZERO_INTEGER, Symbols.symbol_function((SubLObject)module0363.EQ)));
        f24496(var19, (SubLObject)module0363.NIL);
        f24497(var19, module0066.f4824((SubLObject)module0363.ZERO_INTEGER, Symbols.symbol_function((SubLObject)module0363.EQUAL)));
        f24498(var19, module0066.f4824((SubLObject)module0363.ZERO_INTEGER, Symbols.symbol_function((SubLObject)module0363.EQUAL)));
        f24499(var19, (SubLObject)module0363.$ic58$);
        f24500(var19, module0034.f1854((SubLObject)module0363.$ic59$, (SubLObject)module0363.UNPROVIDED, (SubLObject)module0363.UNPROVIDED, (SubLObject)module0363.UNPROVIDED));
        module0361.f24390(var16, var19);
        module0373.f26294(var19);
        return var19;
    }
    
    public static SubLObject f24513(final SubLObject var20, final SubLObject var21) {
        SubLObject var23;
        final SubLObject var22 = var23 = var20.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0363.$ic61$);
        final SubLObject var24 = var23.rest();
        var23 = var23.first();
        SubLObject var25 = (SubLObject)module0363.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0363.$ic61$);
        var25 = var23.first();
        var23 = var23.rest();
        if (module0363.NIL == var23) {
            final SubLObject var26;
            var23 = (var26 = var24);
            return (SubLObject)ConsesLow.listS((SubLObject)module0363.$ic62$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0363.$ic63$, var25)), ConsesLow.append(var26, (SubLObject)module0363.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var22, (SubLObject)module0363.$ic61$);
        return (SubLObject)module0363.NIL;
    }
    
    public static SubLObject f24514(final SubLObject var14) {
        return f24489(var14);
    }
    
    public static SubLObject f24515(final SubLObject var20, final SubLObject var21) {
        SubLObject var23;
        final SubLObject var22 = var23 = var20.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0363.$ic65$);
        final SubLObject var24 = var23.rest();
        var23 = var23.first();
        SubLObject var25 = (SubLObject)module0363.NIL;
        SubLObject var26 = (SubLObject)module0363.NIL;
        SubLObject var27 = (SubLObject)module0363.NIL;
        SubLObject var28 = (SubLObject)module0363.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0363.$ic65$);
        var25 = var23.first();
        var23 = var23.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0363.$ic65$);
        var26 = var23.first();
        var23 = var23.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0363.$ic65$);
        var27 = var23.first();
        var23 = var23.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0363.$ic65$);
        var28 = var23.first();
        var23 = var23.rest();
        SubLObject var29 = (SubLObject)module0363.NIL;
        SubLObject var30 = var23;
        SubLObject var31 = (SubLObject)module0363.NIL;
        SubLObject var35_36 = (SubLObject)module0363.NIL;
        while (module0363.NIL != var30) {
            cdestructuring_bind.destructuring_bind_must_consp(var30, var22, (SubLObject)module0363.$ic65$);
            var35_36 = var30.first();
            var30 = var30.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var30, var22, (SubLObject)module0363.$ic65$);
            if (module0363.NIL == conses_high.member(var35_36, (SubLObject)module0363.$ic66$, (SubLObject)module0363.UNPROVIDED, (SubLObject)module0363.UNPROVIDED)) {
                var31 = (SubLObject)module0363.T;
            }
            if (var35_36 == module0363.$ic67$) {
                var29 = var30.first();
            }
            var30 = var30.rest();
        }
        if (module0363.NIL != var31 && module0363.NIL == var29) {
            cdestructuring_bind.cdestructuring_bind_error(var22, (SubLObject)module0363.$ic65$);
        }
        final SubLObject var32 = cdestructuring_bind.property_list_member((SubLObject)module0363.$ic68$, var23);
        final SubLObject var33 = (SubLObject)((module0363.NIL != var32) ? conses_high.cadr(var32) : module0363.NIL);
        final SubLObject var34;
        var23 = (var34 = var24);
        return (SubLObject)ConsesLow.listS((SubLObject)module0363.$ic69$, (SubLObject)ConsesLow.list(var25, var26, var27, (SubLObject)ConsesLow.list((SubLObject)module0363.$ic70$, var28), (SubLObject)module0363.$ic68$, var33), ConsesLow.append(var34, (SubLObject)module0363.NIL));
    }
    
    public static SubLObject f24516(final SubLObject var20, final SubLObject var21) {
        SubLObject var23;
        final SubLObject var22 = var23 = var20.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0363.$ic71$);
        final SubLObject var24 = var23.rest();
        var23 = var23.first();
        SubLObject var25 = (SubLObject)module0363.NIL;
        SubLObject var26 = (SubLObject)module0363.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0363.$ic71$);
        var25 = var23.first();
        var23 = var23.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0363.$ic71$);
        var26 = var23.first();
        var23 = var23.rest();
        SubLObject var27 = (SubLObject)module0363.NIL;
        SubLObject var28 = var23;
        SubLObject var29 = (SubLObject)module0363.NIL;
        SubLObject var46_47 = (SubLObject)module0363.NIL;
        while (module0363.NIL != var28) {
            cdestructuring_bind.destructuring_bind_must_consp(var28, var22, (SubLObject)module0363.$ic71$);
            var46_47 = var28.first();
            var28 = var28.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var28, var22, (SubLObject)module0363.$ic71$);
            if (module0363.NIL == conses_high.member(var46_47, (SubLObject)module0363.$ic72$, (SubLObject)module0363.UNPROVIDED, (SubLObject)module0363.UNPROVIDED)) {
                var29 = (SubLObject)module0363.T;
            }
            if (var46_47 == module0363.$ic67$) {
                var27 = var28.first();
            }
            var28 = var28.rest();
        }
        if (module0363.NIL != var29 && module0363.NIL == var27) {
            cdestructuring_bind.cdestructuring_bind_error(var22, (SubLObject)module0363.$ic71$);
        }
        final SubLObject var30 = cdestructuring_bind.property_list_member((SubLObject)module0363.$ic68$, var23);
        final SubLObject var31 = (SubLObject)((module0363.NIL != var30) ? conses_high.cadr(var30) : module0363.NIL);
        final SubLObject var32 = cdestructuring_bind.property_list_member((SubLObject)module0363.$ic35$, var23);
        final SubLObject var33 = (SubLObject)((module0363.NIL != var32) ? conses_high.cadr(var32) : module0363.NIL);
        final SubLObject var34 = cdestructuring_bind.property_list_member((SubLObject)module0363.$ic73$, var23);
        final SubLObject var35 = (SubLObject)((module0363.NIL != var34) ? conses_high.cadr(var34) : module0363.NIL);
        final SubLObject var36 = cdestructuring_bind.property_list_member((SubLObject)module0363.$ic74$, var23);
        final SubLObject var37 = (SubLObject)((module0363.NIL != var36) ? conses_high.cadr(var36) : module0363.NIL);
        final SubLObject var38 = cdestructuring_bind.property_list_member((SubLObject)module0363.$ic75$, var23);
        final SubLObject var39 = (SubLObject)((module0363.NIL != var38) ? conses_high.cadr(var38) : module0363.NIL);
        final SubLObject var40 = cdestructuring_bind.property_list_member((SubLObject)module0363.$ic76$, var23);
        final SubLObject var41 = (SubLObject)((module0363.NIL != var40) ? conses_high.cadr(var40) : module0363.NIL);
        final SubLObject var42 = cdestructuring_bind.property_list_member((SubLObject)module0363.$ic77$, var23);
        final SubLObject var43 = (SubLObject)((module0363.NIL != var42) ? conses_high.cadr(var42) : module0363.NIL);
        final SubLObject var44;
        var23 = (var44 = var24);
        SubLObject var45 = (SubLObject)module0363.NIL;
        if (module0363.NIL != var41) {
            var45 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0363.$ic78$, var25, var41), var45);
        }
        if (module0363.NIL != var33) {
            var45 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0363.$ic79$, var25, var33), var45);
        }
        if (module0363.NIL != var35) {
            var45 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0363.$ic80$, var25, var35), var45);
        }
        if (module0363.NIL != var37) {
            var45 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0363.$ic81$, var25, var37), var45);
        }
        if (module0363.NIL != var39) {
            var45 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0363.$ic82$, var25, var39), var45);
        }
        if (module0363.NIL != var43) {
            var45 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0363.$ic83$, var25, var43), var45);
        }
        var45 = Sequences.nreverse(var45);
        if (module0363.NIL == var45) {
            return (SubLObject)ConsesLow.listS((SubLObject)module0363.$ic84$, (SubLObject)ConsesLow.list(var25, (SubLObject)ConsesLow.list((SubLObject)module0363.$ic85$, var26), (SubLObject)module0363.$ic68$, var31), ConsesLow.append(var44, (SubLObject)module0363.NIL));
        }
        return (SubLObject)ConsesLow.list((SubLObject)module0363.$ic86$, (SubLObject)ConsesLow.list(var25, var26, (SubLObject)module0363.$ic68$, var31), (SubLObject)ConsesLow.listS((SubLObject)module0363.$ic87$, (module0363.NIL != module0035.f1997(var45)) ? var45.first() : reader.bq_cons((SubLObject)module0363.$ic88$, ConsesLow.append(var45, (SubLObject)module0363.NIL)), ConsesLow.append(var44, (SubLObject)module0363.NIL)));
    }
    
    public static SubLObject f24517(final SubLObject var14) {
        assert module0363.NIL != f24478(var14) : var14;
        return f24485(var14);
    }
    
    public static SubLObject f24518(final SubLObject var62, final SubLObject var63) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0363.NIL == var63 || module0363.NIL != module0365.f24887(var62, var63));
    }
    
    public static SubLObject f24519(final SubLObject var62, final SubLObject var64) {
        if (module0363.NIL == var64) {
            return (SubLObject)module0363.T;
        }
        assert module0363.NIL != module0360.f23925(var64) : var64;
        return Equality.eq(var64, module0365.f24867(var62));
    }
    
    public static SubLObject f24520(final SubLObject var62, final SubLObject var65) {
        if (module0363.NIL == var65) {
            return (SubLObject)module0363.T;
        }
        assert module0363.NIL != module0358.f23680(var65) : var65;
        return Equality.eq(var65, module0365.f24868(var62));
    }
    
    public static SubLObject f24521(final SubLObject var62, final SubLObject var66) {
        if (module0363.NIL == var66) {
            return (SubLObject)module0363.T;
        }
        assert module0363.NIL != module0360.f23933(var66) : var66;
        return module0360.f23939(var66, module0365.f24852(var62));
    }
    
    public static SubLObject f24522(final SubLObject var62, final SubLObject var67) {
        if (module0363.NIL == var67) {
            return (SubLObject)module0363.T;
        }
        assert module0363.NIL != module0340.f22789(var67) : var67;
        return Equality.eq(var67, module0365.f24865(var62));
    }
    
    public static SubLObject f24523(final SubLObject var13) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0363.NIL != module0360.f23922(var13) || module0363.NIL != module0035.f2169(var13, module0363.$g3131$.getGlobalValue()));
    }
    
    public static SubLObject f24524(final SubLObject var62, final SubLObject var68) {
        return f24525(var62, var68);
    }
    
    public static SubLObject f24525(final SubLObject var62, final SubLObject var68) {
        if (module0363.NIL == var68) {
            return (SubLObject)module0363.T;
        }
        assert module0363.NIL != f24523(var68) : var68;
        if (var68.eql((SubLObject)module0363.$ic95$)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0363.NIL == module0377.f26771(var62));
        }
        if (var68.eql((SubLObject)module0363.$ic96$)) {
            return module0376.f26618(var62);
        }
        if (var68.eql((SubLObject)module0363.$ic97$)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0363.NIL != module0376.f26618(var62) || module0363.NIL != module0379.f26934(var62));
        }
        if (var68.eql((SubLObject)module0363.$ic98$)) {
            return module0373.f26151(var62);
        }
        if (var68.eql((SubLObject)module0363.$ic99$)) {
            return module0373.f26145(var62);
        }
        if (var68.eql((SubLObject)module0363.$ic100$)) {
            return module0373.f26136(var62);
        }
        if (var68.eql((SubLObject)module0363.$ic101$)) {
            return module0373.f26163(var62);
        }
        if (var68.eql((SubLObject)module0363.$ic102$)) {
            return module0373.f26155(var62);
        }
        if (var68.eql((SubLObject)module0363.$ic103$)) {
            return module0373.f26155(var62);
        }
        if (var68.eql((SubLObject)module0363.$ic104$)) {
            return module0373.f26148(var62);
        }
        if (var68.eql((SubLObject)module0363.$ic105$)) {
            return module0373.f26176(var62);
        }
        if (var68.eql((SubLObject)module0363.$ic106$)) {
            return module0383.f27235(var62);
        }
        if (var68.eql((SubLObject)module0363.$ic107$)) {
            return module0380.f26969(var62);
        }
        if (var68.eql((SubLObject)module0363.$ic108$)) {
            return module0381.f27067(var62);
        }
        if (var68.eql((SubLObject)module0363.$ic109$)) {
            return module0382.f27206(var62);
        }
        return Equality.eq(var68, module0365.f24866(var62));
    }
    
    public static SubLObject f24526(final SubLObject var62, final SubLObject var69) {
        SubLObject var70 = var69;
        SubLObject var71 = (SubLObject)module0363.NIL;
        var71 = var70.first();
        while (module0363.NIL != var70) {
            if (module0363.NIL != f24525(var62, var71)) {
                return (SubLObject)module0363.T;
            }
            var70 = var70.rest();
            var71 = var70.first();
        }
        return (SubLObject)module0363.NIL;
    }
    
    public static SubLObject f24527(final SubLObject var14) {
        return f24484(var14);
    }
    
    public static SubLObject f24528(final SubLObject var14) {
        return module0032.f1753(f24484(var14));
    }
    
    public static SubLObject f24529(final SubLObject var20, final SubLObject var21) {
        SubLObject var23;
        final SubLObject var22 = var23 = var20.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0363.$ic112$);
        final SubLObject var24 = var23.rest();
        var23 = var23.first();
        SubLObject var25 = (SubLObject)module0363.NIL;
        SubLObject var26 = (SubLObject)module0363.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0363.$ic112$);
        var25 = var23.first();
        var23 = var23.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0363.$ic112$);
        var26 = var23.first();
        var23 = var23.rest();
        SubLObject var27 = (SubLObject)module0363.NIL;
        SubLObject var28 = var23;
        SubLObject var29 = (SubLObject)module0363.NIL;
        SubLObject var78_79 = (SubLObject)module0363.NIL;
        while (module0363.NIL != var28) {
            cdestructuring_bind.destructuring_bind_must_consp(var28, var22, (SubLObject)module0363.$ic112$);
            var78_79 = var28.first();
            var28 = var28.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var28, var22, (SubLObject)module0363.$ic112$);
            if (module0363.NIL == conses_high.member(var78_79, (SubLObject)module0363.$ic113$, (SubLObject)module0363.UNPROVIDED, (SubLObject)module0363.UNPROVIDED)) {
                var29 = (SubLObject)module0363.T;
            }
            if (var78_79 == module0363.$ic67$) {
                var27 = var28.first();
            }
            var28 = var28.rest();
        }
        if (module0363.NIL != var29 && module0363.NIL == var27) {
            cdestructuring_bind.cdestructuring_bind_error(var22, (SubLObject)module0363.$ic112$);
        }
        final SubLObject var30 = cdestructuring_bind.property_list_member((SubLObject)module0363.$ic76$, var23);
        final SubLObject var31 = (SubLObject)((module0363.NIL != var30) ? conses_high.cadr(var30) : module0363.NIL);
        final SubLObject var32 = cdestructuring_bind.property_list_member((SubLObject)module0363.$ic68$, var23);
        final SubLObject var33 = (SubLObject)((module0363.NIL != var32) ? conses_high.cadr(var32) : module0363.NIL);
        final SubLObject var34;
        var23 = (var34 = var24);
        if (module0363.NIL == var31) {
            return (SubLObject)ConsesLow.listS((SubLObject)module0363.$ic114$, (SubLObject)ConsesLow.list(var25, (SubLObject)ConsesLow.list((SubLObject)module0363.$ic115$, var26), (SubLObject)module0363.$ic68$, var33), ConsesLow.append(var34, (SubLObject)module0363.NIL));
        }
        return (SubLObject)ConsesLow.list((SubLObject)module0363.$ic116$, (SubLObject)ConsesLow.list(var25, var26, (SubLObject)module0363.$ic68$, var33), (SubLObject)ConsesLow.listS((SubLObject)module0363.$ic87$, (SubLObject)ConsesLow.list((SubLObject)module0363.$ic117$, var25, var31), ConsesLow.append(var34, (SubLObject)module0363.NIL)));
    }
    
    public static SubLObject f24530(final SubLObject var14) {
        return f24483(var14);
    }
    
    public static SubLObject f24531(final SubLObject var14) {
        return module0032.f1753(f24530(var14));
    }
    
    public static SubLObject f24532(final SubLObject var20, final SubLObject var21) {
        SubLObject var23;
        final SubLObject var22 = var23 = var20.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0363.$ic118$);
        final SubLObject var24 = var23.rest();
        var23 = var23.first();
        SubLObject var25 = (SubLObject)module0363.NIL;
        SubLObject var26 = (SubLObject)module0363.NIL;
        SubLObject var27 = (SubLObject)module0363.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0363.$ic118$);
        var25 = var23.first();
        var23 = var23.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0363.$ic118$);
        var26 = var23.first();
        var23 = var23.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0363.$ic118$);
        var27 = var23.first();
        var23 = var23.rest();
        SubLObject var28 = (SubLObject)module0363.NIL;
        SubLObject var29 = var23;
        SubLObject var30 = (SubLObject)module0363.NIL;
        SubLObject var89_90 = (SubLObject)module0363.NIL;
        while (module0363.NIL != var29) {
            cdestructuring_bind.destructuring_bind_must_consp(var29, var22, (SubLObject)module0363.$ic118$);
            var89_90 = var29.first();
            var29 = var29.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var29, var22, (SubLObject)module0363.$ic118$);
            if (module0363.NIL == conses_high.member(var89_90, (SubLObject)module0363.$ic119$, (SubLObject)module0363.UNPROVIDED, (SubLObject)module0363.UNPROVIDED)) {
                var30 = (SubLObject)module0363.T;
            }
            if (var89_90 == module0363.$ic67$) {
                var28 = var29.first();
            }
            var29 = var29.rest();
        }
        if (module0363.NIL != var30 && module0363.NIL == var28) {
            cdestructuring_bind.cdestructuring_bind_error(var22, (SubLObject)module0363.$ic118$);
        }
        final SubLObject var31 = cdestructuring_bind.property_list_member((SubLObject)module0363.$ic76$, var23);
        final SubLObject var32 = (SubLObject)((module0363.NIL != var31) ? conses_high.cadr(var31) : module0363.NIL);
        final SubLObject var33 = cdestructuring_bind.property_list_member((SubLObject)module0363.$ic120$, var23);
        final SubLObject var34 = (SubLObject)((module0363.NIL != var33) ? conses_high.cadr(var33) : module0363.NIL);
        final SubLObject var35 = cdestructuring_bind.property_list_member((SubLObject)module0363.$ic68$, var23);
        final SubLObject var36 = (SubLObject)((module0363.NIL != var35) ? conses_high.cadr(var35) : module0363.NIL);
        final SubLObject var37;
        var23 = (var37 = var24);
        final SubLObject var38 = (SubLObject)module0363.$ic121$;
        return (SubLObject)ConsesLow.list((SubLObject)module0363.$ic122$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var38, var27)), (SubLObject)ConsesLow.list((SubLObject)module0363.$ic116$, (SubLObject)ConsesLow.list(var25, var27, (SubLObject)module0363.$ic76$, var32, (SubLObject)module0363.$ic68$, var36), (SubLObject)ConsesLow.list((SubLObject)module0363.$ic123$, (SubLObject)ConsesLow.list(var26, var25, (SubLObject)module0363.$ic120$, var34, (SubLObject)module0363.$ic68$, var36), (SubLObject)ConsesLow.listS((SubLObject)module0363.$ic87$, (SubLObject)ConsesLow.list((SubLObject)module0363.EQ, var38, (SubLObject)ConsesLow.list((SubLObject)module0363.$ic124$, var26)), ConsesLow.append(var37, (SubLObject)module0363.NIL)))));
    }
    
    public static SubLObject f24533(final SubLObject var20, final SubLObject var21) {
        SubLObject var23;
        final SubLObject var22 = var23 = var20.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0363.$ic125$);
        final SubLObject var24 = var23.rest();
        var23 = var23.first();
        SubLObject var25 = (SubLObject)module0363.NIL;
        SubLObject var26 = (SubLObject)module0363.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0363.$ic125$);
        var25 = var23.first();
        var23 = var23.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0363.$ic125$);
        var26 = var23.first();
        var23 = var23.rest();
        SubLObject var27 = (SubLObject)module0363.NIL;
        SubLObject var28 = var23;
        SubLObject var29 = (SubLObject)module0363.NIL;
        SubLObject var103_104 = (SubLObject)module0363.NIL;
        while (module0363.NIL != var28) {
            cdestructuring_bind.destructuring_bind_must_consp(var28, var22, (SubLObject)module0363.$ic125$);
            var103_104 = var28.first();
            var28 = var28.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var28, var22, (SubLObject)module0363.$ic125$);
            if (module0363.NIL == conses_high.member(var103_104, (SubLObject)module0363.$ic66$, (SubLObject)module0363.UNPROVIDED, (SubLObject)module0363.UNPROVIDED)) {
                var29 = (SubLObject)module0363.T;
            }
            if (var103_104 == module0363.$ic67$) {
                var27 = var28.first();
            }
            var28 = var28.rest();
        }
        if (module0363.NIL != var29 && module0363.NIL == var27) {
            cdestructuring_bind.cdestructuring_bind_error(var22, (SubLObject)module0363.$ic125$);
        }
        final SubLObject var30 = cdestructuring_bind.property_list_member((SubLObject)module0363.$ic68$, var23);
        final SubLObject var31 = (SubLObject)((module0363.NIL != var30) ? conses_high.cadr(var30) : module0363.NIL);
        final SubLObject var32;
        var23 = (var32 = var24);
        final SubLObject var33 = (SubLObject)module0363.$ic126$;
        return (SubLObject)ConsesLow.list((SubLObject)module0363.$ic116$, (SubLObject)ConsesLow.list(var33, var26, (SubLObject)module0363.$ic68$, var31), (SubLObject)ConsesLow.list((SubLObject)module0363.$ic122$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var25, (SubLObject)ConsesLow.list((SubLObject)module0363.$ic127$, var33))), (SubLObject)ConsesLow.listS((SubLObject)module0363.$ic87$, var25, ConsesLow.append(var32, (SubLObject)module0363.NIL))));
    }
    
    public static SubLObject f24534(final SubLObject var20, final SubLObject var21) {
        SubLObject var23;
        final SubLObject var22 = var23 = var20.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0363.$ic128$);
        final SubLObject var24 = var23.rest();
        var23 = var23.first();
        SubLObject var25 = (SubLObject)module0363.NIL;
        SubLObject var26 = (SubLObject)module0363.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0363.$ic128$);
        var25 = var23.first();
        var23 = var23.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0363.$ic128$);
        var26 = var23.first();
        var23 = var23.rest();
        if (module0363.NIL == var23) {
            final SubLObject var27;
            var23 = (var27 = var24);
            final SubLObject var28 = (SubLObject)module0363.$ic129$;
            return (SubLObject)ConsesLow.list((SubLObject)module0363.$ic116$, (SubLObject)ConsesLow.list(var28, var26), (SubLObject)ConsesLow.list((SubLObject)module0363.$ic122$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var25, (SubLObject)ConsesLow.list((SubLObject)module0363.$ic130$, var28))), (SubLObject)ConsesLow.listS((SubLObject)module0363.$ic87$, var25, ConsesLow.append(var27, (SubLObject)module0363.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var22, (SubLObject)module0363.$ic128$);
        return (SubLObject)module0363.NIL;
    }
    
    public static SubLObject f24535(final SubLObject var20, final SubLObject var21) {
        SubLObject var23;
        final SubLObject var22 = var23 = var20.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0363.$ic131$);
        final SubLObject var24 = var23.rest();
        var23 = var23.first();
        SubLObject var25 = (SubLObject)module0363.NIL;
        SubLObject var26 = (SubLObject)module0363.NIL;
        SubLObject var27 = (SubLObject)module0363.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0363.$ic131$);
        var25 = var23.first();
        var23 = var23.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0363.$ic131$);
        var26 = var23.first();
        var23 = var23.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0363.$ic131$);
        var27 = var23.first();
        var23 = var23.rest();
        if (module0363.NIL == var23) {
            final SubLObject var28;
            var23 = (var28 = var24);
            final SubLObject var29 = (SubLObject)module0363.$ic132$;
            return (SubLObject)ConsesLow.list((SubLObject)module0363.$ic111$, (SubLObject)ConsesLow.list(var29, var27), (SubLObject)ConsesLow.listS((SubLObject)module0363.$ic133$, (SubLObject)ConsesLow.list(var25, var26, var29), ConsesLow.append(var28, (SubLObject)module0363.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var22, (SubLObject)module0363.$ic131$);
        return (SubLObject)module0363.NIL;
    }
    
    public static SubLObject f24536(final SubLObject var20, final SubLObject var21) {
        SubLObject var23;
        final SubLObject var22 = var23 = var20.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0363.$ic134$);
        final SubLObject var24 = var23.rest();
        var23 = var23.first();
        SubLObject var25 = (SubLObject)module0363.NIL;
        SubLObject var26 = (SubLObject)module0363.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0363.$ic134$);
        var25 = var23.first();
        var23 = var23.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0363.$ic134$);
        var26 = var23.first();
        var23 = var23.rest();
        SubLObject var27 = (SubLObject)module0363.NIL;
        SubLObject var28 = var23;
        SubLObject var29 = (SubLObject)module0363.NIL;
        SubLObject var123_124 = (SubLObject)module0363.NIL;
        while (module0363.NIL != var28) {
            cdestructuring_bind.destructuring_bind_must_consp(var28, var22, (SubLObject)module0363.$ic134$);
            var123_124 = var28.first();
            var28 = var28.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var28, var22, (SubLObject)module0363.$ic134$);
            if (module0363.NIL == conses_high.member(var123_124, (SubLObject)module0363.$ic135$, (SubLObject)module0363.UNPROVIDED, (SubLObject)module0363.UNPROVIDED)) {
                var29 = (SubLObject)module0363.T;
            }
            if (var123_124 == module0363.$ic67$) {
                var27 = var28.first();
            }
            var28 = var28.rest();
        }
        if (module0363.NIL != var29 && module0363.NIL == var27) {
            cdestructuring_bind.cdestructuring_bind_error(var22, (SubLObject)module0363.$ic134$);
        }
        final SubLObject var30 = cdestructuring_bind.property_list_member((SubLObject)module0363.$ic136$, var23);
        final SubLObject var31 = (SubLObject)((module0363.NIL != var30) ? conses_high.cadr(var30) : module0363.NIL);
        final SubLObject var32 = cdestructuring_bind.property_list_member((SubLObject)module0363.$ic68$, var23);
        final SubLObject var33 = (SubLObject)((module0363.NIL != var32) ? conses_high.cadr(var32) : module0363.NIL);
        final SubLObject var34;
        var23 = (var34 = var24);
        final SubLObject var35 = (SubLObject)module0363.$ic137$;
        final SubLObject var36 = (SubLObject)module0363.$ic138$;
        if (module0363.NIL == var31) {
            return (SubLObject)ConsesLow.list((SubLObject)module0363.$ic139$, (SubLObject)ConsesLow.list(var36, var35, (SubLObject)ConsesLow.list((SubLObject)module0363.$ic140$, var26), (SubLObject)module0363.$ic68$, var33), (SubLObject)ConsesLow.list((SubLObject)module0363.$ic141$, var36), (SubLObject)ConsesLow.listS((SubLObject)module0363.$ic84$, (SubLObject)ConsesLow.list(var25, var35, (SubLObject)module0363.$ic68$, var33), ConsesLow.append(var34, (SubLObject)module0363.NIL)));
        }
        final SubLObject var37 = (SubLObject)module0363.$ic142$;
        return (SubLObject)ConsesLow.list((SubLObject)module0363.$ic122$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var37, var31)), (SubLObject)ConsesLow.list((SubLObject)module0363.$ic143$, (SubLObject)ConsesLow.list(var25, var26, (SubLObject)module0363.$ic68$, var33), (SubLObject)ConsesLow.listS((SubLObject)module0363.$ic87$, (SubLObject)ConsesLow.list((SubLObject)module0363.$ic144$, var25, var37), ConsesLow.append(var34, (SubLObject)module0363.NIL))));
    }
    
    public static SubLObject f24537(final SubLObject var14) {
        return f24486(var14);
    }
    
    public static SubLObject f24538(final SubLObject var131, final SubLObject var50) {
        if (module0363.NIL == var50) {
            return (SubLObject)module0363.T;
        }
        return Equality.eq(var50, module0366.f24981(var131));
    }
    
    public static SubLObject f24539(final SubLObject var20, final SubLObject var21) {
        SubLObject var23;
        final SubLObject var22 = var23 = var20.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0363.$ic145$);
        final SubLObject var24 = var23.rest();
        var23 = var23.first();
        SubLObject var25 = (SubLObject)module0363.NIL;
        SubLObject var26 = (SubLObject)module0363.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0363.$ic145$);
        var25 = var23.first();
        var23 = var23.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0363.$ic145$);
        var26 = var23.first();
        var23 = var23.rest();
        if (module0363.NIL == var23) {
            final SubLObject var27;
            var23 = (var27 = var24);
            final SubLObject var28 = (SubLObject)module0363.$ic146$;
            return (SubLObject)ConsesLow.list((SubLObject)module0363.$ic147$, (SubLObject)ConsesLow.list(var28, var26), (SubLObject)ConsesLow.listS((SubLObject)module0363.$ic122$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var25, (SubLObject)ConsesLow.list((SubLObject)module0363.$ic148$, var28))), ConsesLow.append(var27, (SubLObject)module0363.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var22, (SubLObject)module0363.$ic145$);
        return (SubLObject)module0363.NIL;
    }
    
    public static SubLObject f24540(final SubLObject var20, final SubLObject var21) {
        SubLObject var23;
        final SubLObject var22 = var23 = var20.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0363.$ic149$);
        final SubLObject var24 = var23.rest();
        var23 = var23.first();
        SubLObject var25 = (SubLObject)module0363.NIL;
        SubLObject var26 = (SubLObject)module0363.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0363.$ic149$);
        var25 = var23.first();
        var23 = var23.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0363.$ic149$);
        var26 = var23.first();
        var23 = var23.rest();
        SubLObject var27 = (SubLObject)module0363.NIL;
        SubLObject var28 = var23;
        SubLObject var29 = (SubLObject)module0363.NIL;
        SubLObject var143_144 = (SubLObject)module0363.NIL;
        while (module0363.NIL != var28) {
            cdestructuring_bind.destructuring_bind_must_consp(var28, var22, (SubLObject)module0363.$ic149$);
            var143_144 = var28.first();
            var28 = var28.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var28, var22, (SubLObject)module0363.$ic149$);
            if (module0363.NIL == conses_high.member(var143_144, (SubLObject)module0363.$ic66$, (SubLObject)module0363.UNPROVIDED, (SubLObject)module0363.UNPROVIDED)) {
                var29 = (SubLObject)module0363.T;
            }
            if (var143_144 == module0363.$ic67$) {
                var27 = var28.first();
            }
            var28 = var28.rest();
        }
        if (module0363.NIL != var29 && module0363.NIL == var27) {
            cdestructuring_bind.cdestructuring_bind_error(var22, (SubLObject)module0363.$ic149$);
        }
        final SubLObject var30 = cdestructuring_bind.property_list_member((SubLObject)module0363.$ic68$, var23);
        final SubLObject var31 = (SubLObject)((module0363.NIL != var30) ? conses_high.cadr(var30) : module0363.NIL);
        final SubLObject var32;
        var23 = (var32 = var24);
        final SubLObject var33 = (SubLObject)module0363.$ic150$;
        final SubLObject var34 = (SubLObject)module0363.$ic151$;
        return (SubLObject)ConsesLow.list((SubLObject)module0363.$ic122$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var34, var26), (SubLObject)ConsesLow.list(var33, (SubLObject)ConsesLow.list((SubLObject)module0363.$ic152$, var34))), (SubLObject)ConsesLow.list((SubLObject)module0363.$ic153$, (SubLObject)ConsesLow.list(var25, var33, (SubLObject)module0363.$ic68$, var31), (SubLObject)ConsesLow.listS((SubLObject)module0363.$ic87$, (SubLObject)ConsesLow.list((SubLObject)module0363.$ic154$, var34, var25), ConsesLow.append(var32, (SubLObject)module0363.NIL))));
    }
    
    public static SubLObject f24541(final SubLObject var20, final SubLObject var21) {
        SubLObject var23;
        final SubLObject var22 = var23 = var20.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0363.$ic155$);
        final SubLObject var24 = var23.rest();
        var23 = var23.first();
        SubLObject var25 = (SubLObject)module0363.NIL;
        SubLObject var26 = (SubLObject)module0363.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0363.$ic155$);
        var25 = var23.first();
        var23 = var23.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0363.$ic155$);
        var26 = var23.first();
        var23 = var23.rest();
        if (module0363.NIL == var23) {
            final SubLObject var27;
            var23 = (var27 = var24);
            final SubLObject var28 = (SubLObject)module0363.$ic156$;
            final SubLObject var29 = (SubLObject)module0363.$ic157$;
            return (SubLObject)ConsesLow.list((SubLObject)module0363.$ic122$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var29, var26), (SubLObject)ConsesLow.list(var28, (SubLObject)ConsesLow.list((SubLObject)module0363.$ic152$, var29))), (SubLObject)ConsesLow.list((SubLObject)module0363.$ic158$, (SubLObject)ConsesLow.list(var25, var28), (SubLObject)ConsesLow.listS((SubLObject)module0363.$ic87$, (SubLObject)ConsesLow.list((SubLObject)module0363.$ic159$, var29, var25), ConsesLow.append(var27, (SubLObject)module0363.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var22, (SubLObject)module0363.$ic155$);
        return (SubLObject)module0363.NIL;
    }
    
    public static SubLObject f24542(final SubLObject var20, final SubLObject var21) {
        SubLObject var23;
        final SubLObject var22 = var23 = var20.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0363.$ic160$);
        final SubLObject var24 = var23.rest();
        var23 = var23.first();
        SubLObject var25 = (SubLObject)module0363.NIL;
        SubLObject var26 = (SubLObject)module0363.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0363.$ic160$);
        var25 = var23.first();
        var23 = var23.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0363.$ic160$);
        var26 = var23.first();
        var23 = var23.rest();
        SubLObject var27 = (SubLObject)module0363.NIL;
        SubLObject var28 = var23;
        SubLObject var29 = (SubLObject)module0363.NIL;
        SubLObject var157_158 = (SubLObject)module0363.NIL;
        while (module0363.NIL != var28) {
            cdestructuring_bind.destructuring_bind_must_consp(var28, var22, (SubLObject)module0363.$ic160$);
            var157_158 = var28.first();
            var28 = var28.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var28, var22, (SubLObject)module0363.$ic160$);
            if (module0363.NIL == conses_high.member(var157_158, (SubLObject)module0363.$ic66$, (SubLObject)module0363.UNPROVIDED, (SubLObject)module0363.UNPROVIDED)) {
                var29 = (SubLObject)module0363.T;
            }
            if (var157_158 == module0363.$ic67$) {
                var27 = var28.first();
            }
            var28 = var28.rest();
        }
        if (module0363.NIL != var29 && module0363.NIL == var27) {
            cdestructuring_bind.cdestructuring_bind_error(var22, (SubLObject)module0363.$ic160$);
        }
        final SubLObject var30 = cdestructuring_bind.property_list_member((SubLObject)module0363.$ic68$, var23);
        final SubLObject var31 = (SubLObject)((module0363.NIL != var30) ? conses_high.cadr(var30) : module0363.NIL);
        final SubLObject var32;
        var23 = (var32 = var24);
        final SubLObject var33 = (SubLObject)module0363.$ic161$;
        return (SubLObject)ConsesLow.list((SubLObject)module0363.$ic162$, (SubLObject)ConsesLow.list(var33, var26, (SubLObject)module0363.$ic68$, var31), (SubLObject)ConsesLow.listS((SubLObject)module0363.$ic163$, (SubLObject)ConsesLow.list(var25, var33), ConsesLow.append(var32, (SubLObject)module0363.NIL)));
    }
    
    public static SubLObject f24543(final SubLObject var20, final SubLObject var21) {
        SubLObject var23;
        final SubLObject var22 = var23 = var20.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0363.$ic164$);
        final SubLObject var24 = var23.rest();
        var23 = var23.first();
        SubLObject var25 = (SubLObject)module0363.NIL;
        SubLObject var26 = (SubLObject)module0363.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0363.$ic164$);
        var25 = var23.first();
        var23 = var23.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0363.$ic164$);
        var26 = var23.first();
        var23 = var23.rest();
        SubLObject var27 = (SubLObject)module0363.NIL;
        SubLObject var28 = var23;
        SubLObject var29 = (SubLObject)module0363.NIL;
        SubLObject var168_169 = (SubLObject)module0363.NIL;
        while (module0363.NIL != var28) {
            cdestructuring_bind.destructuring_bind_must_consp(var28, var22, (SubLObject)module0363.$ic164$);
            var168_169 = var28.first();
            var28 = var28.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var28, var22, (SubLObject)module0363.$ic164$);
            if (module0363.NIL == conses_high.member(var168_169, (SubLObject)module0363.$ic66$, (SubLObject)module0363.UNPROVIDED, (SubLObject)module0363.UNPROVIDED)) {
                var29 = (SubLObject)module0363.T;
            }
            if (var168_169 == module0363.$ic67$) {
                var27 = var28.first();
            }
            var28 = var28.rest();
        }
        if (module0363.NIL != var29 && module0363.NIL == var27) {
            cdestructuring_bind.cdestructuring_bind_error(var22, (SubLObject)module0363.$ic164$);
        }
        final SubLObject var30 = cdestructuring_bind.property_list_member((SubLObject)module0363.$ic68$, var23);
        final SubLObject var31 = (SubLObject)((module0363.NIL != var30) ? conses_high.cadr(var30) : module0363.NIL);
        final SubLObject var32;
        var23 = (var32 = var24);
        return (SubLObject)ConsesLow.list((SubLObject)module0363.$ic165$, (SubLObject)ConsesLow.listS((SubLObject)module0363.$ic122$, (SubLObject)ConsesLow.list(reader.bq_cons(var25, (SubLObject)module0363.$ic166$)), ConsesLow.append(var32, (SubLObject)module0363.NIL)), (SubLObject)ConsesLow.listS((SubLObject)module0363.$ic167$, (SubLObject)ConsesLow.list(var25, var26, (SubLObject)module0363.$ic68$, var31), ConsesLow.append(var32, (SubLObject)module0363.NIL)));
    }
    
    public static SubLObject f24544(final SubLObject var14) {
        if (module0363.NIL != f24504(var14)) {
            f24545(var14);
            SubLObject var15 = f24527(var14);
            SubLObject var16;
            SubLObject var17;
            SubLObject var18;
            for (var16 = module0032.f1741(var15), var17 = (SubLObject)module0363.NIL, var17 = module0032.f1742(var16, var15); module0363.NIL == module0032.f1744(var16, var17); var17 = module0032.f1743(var17)) {
                var18 = module0032.f1745(var16, var17);
                if (module0363.NIL != module0032.f1746(var17, var18) && module0363.NIL != module0364.f24719(var18)) {
                    module0364.f24731(var18);
                }
            }
            var15 = f24530(var14);
            SubLObject var19;
            for (var16 = module0032.f1741(var15), var17 = (SubLObject)module0363.NIL, var17 = module0032.f1742(var16, var15); module0363.NIL == module0032.f1744(var16, var17); var17 = module0032.f1743(var17)) {
                var19 = module0032.f1745(var16, var17);
                if (module0363.NIL != module0032.f1746(var17, var19)) {
                    if (module0363.NIL != module0375.f26571(var19)) {
                        module0381.f27121(var19);
                    }
                    if (module0363.NIL != module0364.f24719(var19)) {
                        module0364.f24731(var19);
                    }
                }
            }
            if (module0363.NIL != f24546(var14)) {
                module0361.f24380(f24507(var14), var14);
            }
            final SubLObject var20 = f24507(var14);
            module0361.f24391(var20, var14);
            final SubLObject var21 = f24507(var14);
            final SubLObject var22 = module0361.f24123(var21);
            if (module0363.NIL == module0065.f4772(var22, (SubLObject)module0363.$ic168$)) {
                final SubLObject var179_180 = var22;
                if (module0363.NIL == module0065.f4775(var179_180, (SubLObject)module0363.$ic168$)) {
                    final SubLObject var23 = module0065.f4740(var179_180);
                    final SubLObject var24 = (SubLObject)module0363.NIL;
                    SubLObject var25;
                    SubLObject var26;
                    SubLObject var27;
                    SubLObject var28;
                    SubLObject var29;
                    SubLObject var30;
                    SubLObject var31;
                    SubLObject var32;
                    SubLObject var33;
                    for (var25 = Sequences.length(var23), var26 = (SubLObject)module0363.NIL, var26 = (SubLObject)module0363.ZERO_INTEGER; var26.numL(var25); var26 = Numbers.add(var26, (SubLObject)module0363.ONE_INTEGER)) {
                        var27 = ((module0363.NIL != var24) ? Numbers.subtract(var25, var26, (SubLObject)module0363.ONE_INTEGER) : var26);
                        var28 = Vectors.aref(var23, var27);
                        if (module0363.NIL == module0065.f4749(var28) || module0363.NIL == module0065.f4773((SubLObject)module0363.$ic168$)) {
                            if (module0363.NIL != module0065.f4749(var28)) {
                                var28 = (SubLObject)module0363.$ic168$;
                            }
                            if (module0363.NIL != f24547(var14, var28)) {
                                var29 = var28;
                                var30 = module0077.f5333(module0369.f25473(var29));
                                for (var31 = module0032.f1741(var30), var32 = (SubLObject)module0363.NIL, var32 = module0032.f1742(var31, var30); module0363.NIL == module0032.f1744(var31, var32); var32 = module0032.f1743(var32)) {
                                    var33 = module0032.f1745(var31, var32);
                                    if (module0363.NIL != module0032.f1746(var32, var33)) {
                                        module0367.f25049(var33, var14);
                                    }
                                }
                            }
                        }
                    }
                }
                final SubLObject var188_189 = var22;
                if (module0363.NIL == module0065.f4777(var188_189)) {
                    final SubLObject var34 = module0065.f4738(var188_189);
                    SubLObject var35 = (SubLObject)module0363.NIL;
                    SubLObject var36 = (SubLObject)module0363.NIL;
                    final Iterator var37 = Hashtables.getEntrySetIterator(var34);
                    try {
                        while (Hashtables.iteratorHasNext(var37)) {
                            final Map.Entry var38 = Hashtables.iteratorNextEntry(var37);
                            var35 = Hashtables.getEntryKey(var38);
                            var36 = Hashtables.getEntryValue(var38);
                            if (module0363.NIL != f24547(var14, var36)) {
                                final SubLObject var39 = var36;
                                final SubLObject var40 = module0077.f5333(module0369.f25473(var39));
                                SubLObject var41;
                                SubLObject var42;
                                SubLObject var43;
                                for (var41 = module0032.f1741(var40), var42 = (SubLObject)module0363.NIL, var42 = module0032.f1742(var41, var40); module0363.NIL == module0032.f1744(var41, var42); var42 = module0032.f1743(var42)) {
                                    var43 = module0032.f1745(var41, var42);
                                    if (module0363.NIL != module0032.f1746(var42, var43)) {
                                        module0367.f25049(var43, var14);
                                    }
                                }
                            }
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(var37);
                    }
                }
            }
            return f24548(var14);
        }
        return (SubLObject)module0363.NIL;
    }
    
    public static SubLObject f24549(final SubLObject var14) {
        if (module0363.NIL != f24504(var14)) {
            f24545(var14);
            return f24548(var14);
        }
        return (SubLObject)module0363.NIL;
    }
    
    public static SubLObject f24548(final SubLObject var14) {
        module0066.f4835(f24487(var14));
        f24498(var14, (SubLObject)module0363.$ic49$);
        module0066.f4835(f24486(var14));
        f24497(var14, (SubLObject)module0363.$ic49$);
        SubLObject var15 = f24517(var14);
        SubLObject var16 = (SubLObject)module0363.NIL;
        var16 = var15.first();
        while (module0363.NIL != var15) {
            module0365.f24857(var16);
            var15 = var15.rest();
            var16 = var15.first();
        }
        f24496(var14, (SubLObject)module0363.$ic49$);
        module0032.f1738(f24483(var14));
        f24494(var14, (SubLObject)module0363.$ic49$);
        module0032.f1738(f24484(var14));
        f24495(var14, (SubLObject)module0363.$ic49$);
        f24492(var14, (SubLObject)module0363.$ic49$);
        f24491(var14, (SubLObject)module0363.$ic49$);
        f24500(var14, (SubLObject)module0363.$ic49$);
        return (SubLObject)module0363.NIL;
    }
    
    public static SubLObject f24545(final SubLObject var14) {
        f24493(var14, (SubLObject)module0363.$ic49$);
        return var14;
    }
    
    public static SubLObject f24508(final SubLObject var14) {
        assert module0363.NIL != f24478(var14) : var14;
        return f24479(var14);
    }
    
    public static SubLObject f24507(final SubLObject var14) {
        assert module0363.NIL != f24478(var14) : var14;
        return f24480(var14);
    }
    
    public static SubLObject f24509(final SubLObject var14) {
        assert module0363.NIL != f24478(var14) : var14;
        return f24481(var14);
    }
    
    public static SubLObject f24506(final SubLObject var14) {
        assert module0363.NIL != f24478(var14) : var14;
        return f24482(var14);
    }
    
    public static SubLObject f24550(final SubLObject var14) {
        final SubLObject var15 = f24506(var14);
        if (module0363.NIL != module0373.f26329(var14)) {
            final SubLObject var16 = module0373.f26381(var15);
            return var16;
        }
        return var15;
    }
    
    public static SubLObject f24512(final SubLObject var14, final SubLObject var50) {
        final SubLThread var51 = SubLProcess.currentSubLThread();
        assert module0363.NIL != f24478(var14) : var14;
        assert module0363.NIL != module0360.f23884(var50) : var50;
        if (module0363.NIL == Errors.$ignore_mustsP$.getDynamicValue(var51) && module0363.NIL != module0360.f23888(var50)) {
            Errors.error((SubLObject)module0363.$ic170$, var50, var14);
        }
        f24493(var14, var50);
        return var14;
    }
    
    public static SubLObject f24551(final SubLObject var14) {
        assert module0363.NIL != f24478(var14) : var14;
        return module0370.f25911(f24509(var14));
    }
    
    public static SubLObject f24552(final SubLObject var14) {
        assert module0363.NIL != f24478(var14) : var14;
        return module0370.f25910(f24509(var14));
    }
    
    public static SubLObject f24553(final SubLObject var14) {
        return f24554(f24509(var14));
    }
    
    public static SubLObject f24555(final SubLObject var14) {
        return f24556(f24509(var14));
    }
    
    public static SubLObject f24554(final SubLObject var17) {
        return module0202.f12690(var17);
    }
    
    public static SubLObject f24556(final SubLObject var17) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0363.NIL == module0202.f12690(var17));
    }
    
    public static SubLObject f24557(final SubLObject var13) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0363.NIL != module0362.f24460(var13) && module0363.NIL != f24554(var13));
    }
    
    public static SubLObject f24558(final SubLObject var13) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0363.NIL != module0362.f24460(var13) && module0363.NIL == f24554(var13));
    }
    
    public static SubLObject f24559(final SubLObject var14) {
        return module0362.f24457(f24509(var14));
    }
    
    public static SubLObject f24560(final SubLObject var14, SubLObject var194) {
        if (var194 == module0363.UNPROVIDED) {
            var194 = (SubLObject)module0363.NIL;
        }
        final SubLObject var195 = f24509(var14);
        return f24561(var195, var194);
    }
    
    public static SubLObject f24561(final SubLObject var17, SubLObject var194) {
        if (var194 == module0363.UNPROVIDED) {
            var194 = (SubLObject)module0363.NIL;
        }
        SubLObject var195 = (SubLObject)module0363.ZERO_INTEGER;
        SubLObject var196 = var17;
        SubLObject var197 = (SubLObject)module0363.NIL;
        var197 = var196.first();
        while (module0363.NIL != var196) {
            SubLObject var198 = (SubLObject)module0363.$ic171$;
            SubLObject var199 = (SubLObject)module0363.ZERO_INTEGER;
            SubLObject var70_199 = module0232.f15306(var197);
            SubLObject var200 = (SubLObject)module0363.NIL;
            var200 = var70_199.first();
            while (module0363.NIL != var70_199) {
                SubLObject var202;
                final SubLObject var201 = var202 = var200;
                SubLObject var203 = (SubLObject)module0363.NIL;
                SubLObject var204 = (SubLObject)module0363.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var202, var201, (SubLObject)module0363.$ic172$);
                var203 = var202.first();
                var202 = var202.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var202, var201, (SubLObject)module0363.$ic172$);
                var204 = var202.first();
                var202 = var202.rest();
                if (module0363.NIL == var202) {
                    if (module0363.NIL == var194 || var194.eql(var198)) {
                        var195 = Numbers.add(var195, (SubLObject)module0363.ONE_INTEGER);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var201, (SubLObject)module0363.$ic172$);
                }
                var199 = Numbers.add(var199, (SubLObject)module0363.ONE_INTEGER);
                var70_199 = var70_199.rest();
                var200 = var70_199.first();
            }
            var198 = (SubLObject)module0363.$ic173$;
            var199 = (SubLObject)module0363.ZERO_INTEGER;
            SubLObject var70_200 = module0232.f15308(var197);
            var200 = (SubLObject)module0363.NIL;
            var200 = var70_200.first();
            while (module0363.NIL != var70_200) {
                SubLObject var206;
                final SubLObject var205 = var206 = var200;
                SubLObject var203 = (SubLObject)module0363.NIL;
                SubLObject var204 = (SubLObject)module0363.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var206, var205, (SubLObject)module0363.$ic172$);
                var203 = var206.first();
                var206 = var206.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var206, var205, (SubLObject)module0363.$ic172$);
                var204 = var206.first();
                var206 = var206.rest();
                if (module0363.NIL == var206) {
                    if (module0363.NIL == var194 || var194.eql(var198)) {
                        var195 = Numbers.add(var195, (SubLObject)module0363.ONE_INTEGER);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var205, (SubLObject)module0363.$ic172$);
                }
                var199 = Numbers.add(var199, (SubLObject)module0363.ONE_INTEGER);
                var70_200 = var70_200.rest();
                var200 = var70_200.first();
            }
            var196 = var196.rest();
            var197 = var196.first();
        }
        return var195;
    }
    
    public static SubLObject f24562(final SubLObject var13) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0363.NIL != f24478(var13) && module0363.NIL != module0362.f24461(f24509(var13)));
    }
    
    public static SubLObject f24563(final SubLObject var14) {
        return module0362.f24466(f24509(var14));
    }
    
    public static SubLObject f24564(final SubLObject var14) {
        return module0362.f24465(f24509(var14));
    }
    
    public static SubLObject f24565(final SubLObject var14) {
        return module0362.f24464(f24509(var14));
    }
    
    public static SubLObject f24566(final SubLObject var14) {
        SubLObject var15 = (SubLObject)module0363.NIL;
        SubLObject var16 = f24509(var14);
        SubLObject var17 = (SubLObject)module0363.NIL;
        var17 = var16.first();
        while (module0363.NIL != var16) {
            SubLObject var18 = (SubLObject)module0363.$ic171$;
            SubLObject var19 = (SubLObject)module0363.ZERO_INTEGER;
            SubLObject var70_209 = module0232.f15306(var17);
            SubLObject var20 = (SubLObject)module0363.NIL;
            var20 = var70_209.first();
            while (module0363.NIL != var70_209) {
                SubLObject var22;
                final SubLObject var21 = var22 = var20;
                SubLObject var23 = (SubLObject)module0363.NIL;
                SubLObject var24 = (SubLObject)module0363.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)module0363.$ic172$);
                var23 = var22.first();
                var22 = var22.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)module0363.$ic172$);
                var24 = var22.first();
                var22 = var22.rest();
                if (module0363.NIL == var22) {
                    if (module0363.NIL != var15) {
                        if (!var23.equal(var15)) {
                            return (SubLObject)module0363.NIL;
                        }
                    }
                    else {
                        var15 = var23;
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var21, (SubLObject)module0363.$ic172$);
                }
                var19 = Numbers.add(var19, (SubLObject)module0363.ONE_INTEGER);
                var70_209 = var70_209.rest();
                var20 = var70_209.first();
            }
            var18 = (SubLObject)module0363.$ic173$;
            var19 = (SubLObject)module0363.ZERO_INTEGER;
            SubLObject var70_210 = module0232.f15308(var17);
            var20 = (SubLObject)module0363.NIL;
            var20 = var70_210.first();
            while (module0363.NIL != var70_210) {
                SubLObject var26;
                final SubLObject var25 = var26 = var20;
                SubLObject var23 = (SubLObject)module0363.NIL;
                SubLObject var24 = (SubLObject)module0363.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var26, var25, (SubLObject)module0363.$ic172$);
                var23 = var26.first();
                var26 = var26.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var26, var25, (SubLObject)module0363.$ic172$);
                var24 = var26.first();
                var26 = var26.rest();
                if (module0363.NIL == var26) {
                    if (module0363.NIL != var15) {
                        if (!var23.equal(var15)) {
                            return (SubLObject)module0363.NIL;
                        }
                    }
                    else {
                        var15 = var23;
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var25, (SubLObject)module0363.$ic172$);
                }
                var19 = Numbers.add(var19, (SubLObject)module0363.ONE_INTEGER);
                var70_210 = var70_210.rest();
                var20 = var70_210.first();
            }
            var16 = var16.rest();
            var17 = var16.first();
        }
        return var15;
    }
    
    public static SubLObject f24567(final SubLObject var14) {
        final SubLObject var15 = f24566(var14);
        if (module0363.NIL != var15) {
            return (SubLObject)ConsesLow.list(var15);
        }
        final SubLObject var16 = module0077.f5313(Symbols.symbol_function((SubLObject)module0363.EQUAL), (SubLObject)module0363.UNPROVIDED);
        SubLObject var17 = f24509(var14);
        SubLObject var18 = (SubLObject)module0363.NIL;
        var18 = var17.first();
        while (module0363.NIL != var17) {
            SubLObject var19 = (SubLObject)module0363.$ic171$;
            SubLObject var20 = (SubLObject)module0363.ZERO_INTEGER;
            SubLObject var70_217 = module0232.f15306(var18);
            SubLObject var21 = (SubLObject)module0363.NIL;
            var21 = var70_217.first();
            while (module0363.NIL != var70_217) {
                SubLObject var23;
                final SubLObject var22 = var23 = var21;
                SubLObject var24 = (SubLObject)module0363.NIL;
                SubLObject var25 = (SubLObject)module0363.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0363.$ic172$);
                var24 = var23.first();
                var23 = var23.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0363.$ic172$);
                var25 = var23.first();
                var23 = var23.rest();
                if (module0363.NIL == var23) {
                    module0077.f5326(var24, var16);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var22, (SubLObject)module0363.$ic172$);
                }
                var20 = Numbers.add(var20, (SubLObject)module0363.ONE_INTEGER);
                var70_217 = var70_217.rest();
                var21 = var70_217.first();
            }
            var19 = (SubLObject)module0363.$ic173$;
            var20 = (SubLObject)module0363.ZERO_INTEGER;
            SubLObject var70_218 = module0232.f15308(var18);
            var21 = (SubLObject)module0363.NIL;
            var21 = var70_218.first();
            while (module0363.NIL != var70_218) {
                SubLObject var27;
                final SubLObject var26 = var27 = var21;
                SubLObject var24 = (SubLObject)module0363.NIL;
                SubLObject var25 = (SubLObject)module0363.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var27, var26, (SubLObject)module0363.$ic172$);
                var24 = var27.first();
                var27 = var27.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var27, var26, (SubLObject)module0363.$ic172$);
                var25 = var27.first();
                var27 = var27.rest();
                if (module0363.NIL == var27) {
                    module0077.f5326(var24, var16);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var26, (SubLObject)module0363.$ic172$);
                }
                var20 = Numbers.add(var20, (SubLObject)module0363.ONE_INTEGER);
                var70_218 = var70_218.rest();
                var21 = var70_218.first();
            }
            var17 = var17.rest();
            var18 = var17.first();
        }
        return module0077.f5312(var16);
    }
    
    public static SubLObject f24568(final SubLObject var14) {
        return module0362.f24463(f24509(var14));
    }
    
    public static SubLObject f24569(final SubLObject var14) {
        return module0362.f24467(f24509(var14));
    }
    
    public static SubLObject f24570(final SubLObject var13, final SubLObject var223) {
        if (module0363.NIL != f24562(var13)) {
            return Equality.eql(var223, f24563(var13));
        }
        return (SubLObject)module0363.NIL;
    }
    
    public static SubLObject f24571(final SubLObject var13) {
        if (module0363.NIL != f24478(var13)) {
            final SubLObject var14 = f24509(var13);
            return module0362.f24458(var14);
        }
        return (SubLObject)module0363.NIL;
    }
    
    public static SubLObject f24572(final SubLObject var13) {
        return f24573(var13);
    }
    
    public static SubLObject f24574(final SubLObject var13) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0363.NIL != f24562(var13) && (module0363.$ic174$.eql(f24563(var13)) || (module0363.NIL != module0012.f464() && !module0147.$g2095$.getDynamicValue(var14).eql(module0363.$ic175$))));
    }
    
    public static SubLObject f24575(final SubLObject var13) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0363.NIL != f24572(var13) && module0363.NIL != module0380.f26987(f24509(var13).first()));
    }
    
    public static SubLObject f24576(final SubLObject var13) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0363.NIL != f24572(var13) && module0363.NIL == module0380.f26987(f24509(var13).first()));
    }
    
    public static SubLObject f24573(final SubLObject var13) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0363.NIL != f24571(var13) && module0363.NIL == f24562(var13));
    }
    
    public static SubLObject f24577(final SubLObject var13) {
        return f24578(var13);
    }
    
    public static SubLObject f24578(final SubLObject var13) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0363.NIL != f24478(var13) && module0363.NIL == f24571(var13));
    }
    
    public static SubLObject f24579(final SubLObject var13) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0363.NIL != module0362.f24446(var13) && module0363.NIL == module0362.f24458(var13));
    }
    
    public static SubLObject f24580(final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        final SubLObject var16 = f24509(var14);
        if (module0363.NIL == Errors.$ignore_mustsP$.getDynamicValue(var15) && module0363.NIL == module0035.f1997(var16)) {
            Errors.error((SubLObject)module0363.$ic176$, var14);
        }
        return f24581(var16);
    }
    
    public static SubLObject f24581(final SubLObject var17) {
        SubLObject var18 = (SubLObject)module0363.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var17, var17, (SubLObject)module0363.$ic177$);
        var18 = var17.first();
        final SubLObject var19 = var17.rest();
        if (module0363.NIL == var19) {
            return var18;
        }
        cdestructuring_bind.cdestructuring_bind_error(var17, (SubLObject)module0363.$ic177$);
        return (SubLObject)module0363.NIL;
    }
    
    public static SubLObject f24582(final SubLObject var14) {
        final SubLObject var15 = f24509(var14);
        final SubLObject var16 = f24507(var14);
        final SubLObject var17 = module0361.f24159(var16);
        return module0362.f24456(var15, var17);
    }
    
    public static SubLObject f24583(final SubLObject var14) {
        return module0035.sublisp_boolean(f24584(var14));
    }
    
    public static SubLObject f24584(final SubLObject var14) {
        final SubLObject var15 = f24507(var14);
        final SubLObject var16 = module0361.f24123(var15);
        if (module0363.NIL == module0065.f4772(var16, (SubLObject)module0363.$ic168$)) {
            final SubLObject var179_228 = var16;
            if (module0363.NIL == module0065.f4775(var179_228, (SubLObject)module0363.$ic168$)) {
                final SubLObject var17 = module0065.f4740(var179_228);
                final SubLObject var18 = (SubLObject)module0363.NIL;
                SubLObject var19;
                SubLObject var20;
                SubLObject var21;
                SubLObject var22;
                for (var19 = Sequences.length(var17), var20 = (SubLObject)module0363.NIL, var20 = (SubLObject)module0363.ZERO_INTEGER; var20.numL(var19); var20 = Numbers.add(var20, (SubLObject)module0363.ONE_INTEGER)) {
                    var21 = ((module0363.NIL != var18) ? Numbers.subtract(var19, var20, (SubLObject)module0363.ONE_INTEGER) : var20);
                    var22 = Vectors.aref(var17, var21);
                    if (module0363.NIL == module0065.f4749(var22) || module0363.NIL == module0065.f4773((SubLObject)module0363.$ic168$)) {
                        if (module0363.NIL != module0065.f4749(var22)) {
                            var22 = (SubLObject)module0363.$ic168$;
                        }
                        if (module0363.NIL != f24547(var14, var22)) {
                            return var22;
                        }
                    }
                }
            }
            final SubLObject var188_229 = var16;
            if (module0363.NIL == module0065.f4777(var188_229)) {
                final SubLObject var23 = module0065.f4738(var188_229);
                SubLObject var24 = (SubLObject)module0363.NIL;
                SubLObject var25 = (SubLObject)module0363.NIL;
                final Iterator var26 = Hashtables.getEntrySetIterator(var23);
                try {
                    while (Hashtables.iteratorHasNext(var26)) {
                        final Map.Entry var27 = Hashtables.iteratorNextEntry(var26);
                        var24 = Hashtables.getEntryKey(var27);
                        var25 = Hashtables.getEntryValue(var27);
                        if (module0363.NIL != f24547(var14, var25)) {
                            return var25;
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var26);
                }
            }
        }
        return (SubLObject)module0363.NIL;
    }
    
    public static SubLObject f24585(final SubLObject var14) {
        SubLObject var15 = (SubLObject)module0363.NIL;
        final SubLObject var16 = f24507(var14);
        final SubLObject var17 = module0361.f24123(var16);
        if (module0363.NIL == module0065.f4772(var17, (SubLObject)module0363.$ic168$)) {
            final SubLObject var179_231 = var17;
            if (module0363.NIL == module0065.f4775(var179_231, (SubLObject)module0363.$ic168$)) {
                final SubLObject var18 = module0065.f4740(var179_231);
                final SubLObject var19 = (SubLObject)module0363.NIL;
                SubLObject var20;
                SubLObject var21;
                SubLObject var22;
                SubLObject var23;
                for (var20 = Sequences.length(var18), var21 = (SubLObject)module0363.NIL, var21 = (SubLObject)module0363.ZERO_INTEGER; var21.numL(var20); var21 = Numbers.add(var21, (SubLObject)module0363.ONE_INTEGER)) {
                    var22 = ((module0363.NIL != var19) ? Numbers.subtract(var20, var21, (SubLObject)module0363.ONE_INTEGER) : var21);
                    var23 = Vectors.aref(var18, var22);
                    if (module0363.NIL == module0065.f4749(var23) || module0363.NIL == module0065.f4773((SubLObject)module0363.$ic168$)) {
                        if (module0363.NIL != module0065.f4749(var23)) {
                            var23 = (SubLObject)module0363.$ic168$;
                        }
                        if (module0363.NIL != f24547(var14, var23)) {
                            if (module0363.NIL != var15) {
                                return (SubLObject)module0363.NIL;
                            }
                            var15 = var23;
                        }
                    }
                }
            }
            final SubLObject var188_232 = var17;
            if (module0363.NIL == module0065.f4777(var188_232)) {
                final SubLObject var24 = module0065.f4738(var188_232);
                SubLObject var25 = (SubLObject)module0363.NIL;
                SubLObject var26 = (SubLObject)module0363.NIL;
                final Iterator var27 = Hashtables.getEntrySetIterator(var24);
                try {
                    while (Hashtables.iteratorHasNext(var27)) {
                        final Map.Entry var28 = Hashtables.iteratorNextEntry(var27);
                        var25 = Hashtables.getEntryKey(var28);
                        var26 = Hashtables.getEntryValue(var28);
                        if (module0363.NIL != f24547(var14, var26)) {
                            if (module0363.NIL != var15) {
                                return (SubLObject)module0363.NIL;
                            }
                            var15 = var26;
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var27);
                }
            }
        }
        return module0035.sublisp_boolean(var15);
    }
    
    public static SubLObject f24547(final SubLObject var14, final SubLObject var160) {
        return (SubLObject)((module0363.NIL != module0369.f25417(var160)) ? module0077.f5320(var14, module0369.f25496(var160)) : module0363.NIL);
    }
    
    public static SubLObject f24586(final SubLObject var14, final SubLObject var136) {
        return f24547(var14, module0367.f25037(var136));
    }
    
    public static SubLObject f24587(final SubLObject var14) {
        SubLObject var15 = (SubLObject)module0363.NIL;
        final SubLObject var16 = f24507(var14);
        final SubLObject var17 = module0361.f24123(var16);
        if (module0363.NIL == module0065.f4772(var17, (SubLObject)module0363.$ic168$)) {
            final SubLObject var179_233 = var17;
            if (module0363.NIL == module0065.f4775(var179_233, (SubLObject)module0363.$ic168$)) {
                final SubLObject var18 = module0065.f4740(var179_233);
                final SubLObject var19 = (SubLObject)module0363.NIL;
                SubLObject var20;
                SubLObject var21;
                SubLObject var22;
                SubLObject var23;
                SubLObject var24;
                SubLObject var25;
                SubLObject var26;
                SubLObject var27;
                SubLObject var28;
                for (var20 = Sequences.length(var18), var21 = (SubLObject)module0363.NIL, var21 = (SubLObject)module0363.ZERO_INTEGER; var21.numL(var20); var21 = Numbers.add(var21, (SubLObject)module0363.ONE_INTEGER)) {
                    var22 = ((module0363.NIL != var19) ? Numbers.subtract(var20, var21, (SubLObject)module0363.ONE_INTEGER) : var21);
                    var23 = Vectors.aref(var18, var22);
                    if (module0363.NIL == module0065.f4749(var23) || module0363.NIL == module0065.f4773((SubLObject)module0363.$ic168$)) {
                        if (module0363.NIL != module0065.f4749(var23)) {
                            var23 = (SubLObject)module0363.$ic168$;
                        }
                        if (module0363.NIL != f24547(var14, var23)) {
                            var24 = var23;
                            var25 = module0077.f5333(module0369.f25473(var24));
                            for (var26 = module0032.f1741(var25), var27 = (SubLObject)module0363.NIL, var27 = module0032.f1742(var26, var25); module0363.NIL == module0032.f1744(var26, var27); var27 = module0032.f1743(var27)) {
                                var28 = module0032.f1745(var26, var27);
                                if (module0363.NIL != module0032.f1746(var27, var28)) {
                                    var15 = (SubLObject)ConsesLow.cons(var28, var15);
                                }
                            }
                        }
                    }
                }
            }
            final SubLObject var188_234 = var17;
            if (module0363.NIL == module0065.f4777(var188_234)) {
                final SubLObject var29 = module0065.f4738(var188_234);
                SubLObject var30 = (SubLObject)module0363.NIL;
                SubLObject var31 = (SubLObject)module0363.NIL;
                final Iterator var32 = Hashtables.getEntrySetIterator(var29);
                try {
                    while (Hashtables.iteratorHasNext(var32)) {
                        final Map.Entry var33 = Hashtables.iteratorNextEntry(var32);
                        var30 = Hashtables.getEntryKey(var33);
                        var31 = Hashtables.getEntryValue(var33);
                        if (module0363.NIL != f24547(var14, var31)) {
                            final SubLObject var34 = var31;
                            final SubLObject var35 = module0077.f5333(module0369.f25473(var34));
                            SubLObject var36;
                            SubLObject var37;
                            SubLObject var38;
                            for (var36 = module0032.f1741(var35), var37 = (SubLObject)module0363.NIL, var37 = module0032.f1742(var36, var35); module0363.NIL == module0032.f1744(var36, var37); var37 = module0032.f1743(var37)) {
                                var38 = module0032.f1745(var36, var37);
                                if (module0363.NIL != module0032.f1746(var37, var38)) {
                                    var15 = (SubLObject)ConsesLow.cons(var38, var15);
                                }
                            }
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var32);
                }
            }
        }
        return Sequences.nreverse(var15);
    }
    
    public static SubLObject f24588(final SubLObject var14) {
        return module0035.sublisp_boolean(f24589(var14));
    }
    
    public static SubLObject f24589(final SubLObject var14) {
        final SubLObject var15 = f24507(var14);
        final SubLObject var16 = module0361.f24125(var15);
        if (module0363.NIL == module0065.f4772(var16, (SubLObject)module0363.$ic168$)) {
            final SubLObject var179_237 = var16;
            if (module0363.NIL == module0065.f4775(var179_237, (SubLObject)module0363.$ic168$)) {
                final SubLObject var17 = module0065.f4740(var179_237);
                final SubLObject var18 = (SubLObject)module0363.NIL;
                SubLObject var19;
                SubLObject var20;
                SubLObject var21;
                SubLObject var22;
                for (var19 = Sequences.length(var17), var20 = (SubLObject)module0363.NIL, var20 = (SubLObject)module0363.ZERO_INTEGER; var20.numL(var19); var20 = Numbers.add(var20, (SubLObject)module0363.ONE_INTEGER)) {
                    var21 = ((module0363.NIL != var18) ? Numbers.subtract(var19, var20, (SubLObject)module0363.ONE_INTEGER) : var20);
                    var22 = Vectors.aref(var17, var21);
                    if (module0363.NIL == module0065.f4749(var22) || module0363.NIL == module0065.f4773((SubLObject)module0363.$ic168$)) {
                        if (module0363.NIL != module0065.f4749(var22)) {
                            var22 = (SubLObject)module0363.$ic168$;
                        }
                        if (module0363.NIL != module0367.f25082(var14, var22)) {
                            return var22;
                        }
                    }
                }
            }
            final SubLObject var188_239 = var16;
            if (module0363.NIL == module0065.f4777(var188_239)) {
                final SubLObject var23 = module0065.f4738(var188_239);
                SubLObject var24 = (SubLObject)module0363.NIL;
                SubLObject var25 = (SubLObject)module0363.NIL;
                final Iterator var26 = Hashtables.getEntrySetIterator(var23);
                try {
                    while (Hashtables.iteratorHasNext(var26)) {
                        final Map.Entry var27 = Hashtables.iteratorNextEntry(var26);
                        var24 = Hashtables.getEntryKey(var27);
                        var25 = Hashtables.getEntryValue(var27);
                        if (module0363.NIL != module0367.f25082(var14, var25)) {
                            return var25;
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var26);
                }
            }
        }
        return (SubLObject)module0363.NIL;
    }
    
    public static SubLObject f24590(final SubLObject var14) {
        return module0032.f1728(f24484(var14));
    }
    
    public static SubLObject f24591(final SubLObject var14, final SubLObject var58) {
        SubLObject var59 = (SubLObject)module0363.ZERO_INTEGER;
        final SubLObject var60 = f24527(var14);
        SubLObject var61;
        SubLObject var62;
        SubLObject var63;
        for (var61 = module0032.f1741(var60), var62 = (SubLObject)module0363.NIL, var62 = module0032.f1742(var61, var60); module0363.NIL == module0032.f1744(var61, var62); var62 = module0032.f1743(var62)) {
            var63 = module0032.f1745(var61, var62);
            if (module0363.NIL != module0032.f1746(var62, var63) && module0363.NIL != module0364.f24748(var63, var58)) {
                var59 = Numbers.add(var59, (SubLObject)module0363.ONE_INTEGER);
            }
        }
        return var59;
    }
    
    public static SubLObject f24592(final SubLObject var14) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0363.NIL == module0032.f1729(f24484(var14)));
    }
    
    public static SubLObject f24593(final SubLObject var14, final SubLObject var58) {
        return module0035.sublisp_boolean(f24594(var14, var58));
    }
    
    public static SubLObject f24594(final SubLObject var14, final SubLObject var58) {
        SubLObject var59 = (SubLObject)module0363.NIL;
        final SubLObject var60 = f24527(var14);
        SubLObject var61;
        SubLObject var62;
        SubLObject var63;
        for (var61 = module0032.f1741(var60), var62 = (SubLObject)module0363.NIL, var62 = module0032.f1742(var61, var60); module0363.NIL == module0032.f1744(var61, var62); var62 = module0032.f1743(var62)) {
            var63 = module0032.f1745(var61, var62);
            if (module0363.NIL != module0032.f1746(var62, var63) && module0363.NIL != module0364.f24748(var63, var58) && module0363.NIL == var59) {
                var59 = var63;
            }
        }
        return var59;
    }
    
    public static SubLObject f24595(final SubLObject var14, final SubLObject var58) {
        final SubLThread var59 = SubLProcess.currentSubLThread();
        SubLObject var60 = (SubLObject)module0363.NIL;
        final SubLObject var61 = f24527(var14);
        SubLObject var62;
        SubLObject var63;
        SubLObject var64;
        for (var62 = module0032.f1741(var61), var63 = (SubLObject)module0363.NIL, var63 = module0032.f1742(var62, var61); module0363.NIL == module0032.f1744(var62, var63); var63 = module0032.f1743(var63)) {
            var64 = module0032.f1745(var62, var63);
            if (module0363.NIL != module0032.f1746(var63, var64) && module0363.NIL != module0364.f24748(var64, var58)) {
                if (module0363.NIL != var60) {
                    Errors.error((SubLObject)module0363.$ic178$, var58, var14);
                }
                else {
                    var60 = var64;
                }
            }
        }
        if (module0363.NIL == Errors.$ignore_mustsP$.getDynamicValue(var59) && module0363.NIL == var60) {
            Errors.error((SubLObject)module0363.$ic179$, var14, var58);
        }
        return var60;
    }
    
    public static SubLObject f24596(final SubLObject var14, final SubLObject var241) {
        assert module0363.NIL != f24478(var14) : var14;
        assert module0363.NIL != module0360.f23906(var241) : var241;
        SubLObject var242 = (SubLObject)module0363.NIL;
        final SubLObject var243 = f24527(var14);
        SubLObject var244;
        SubLObject var245;
        SubLObject var246;
        for (var244 = module0032.f1741(var243), var245 = (SubLObject)module0363.NIL, var245 = module0032.f1742(var244, var243); module0363.NIL == var242 && module0363.NIL == module0032.f1744(var244, var245); var245 = module0032.f1743(var245)) {
            var246 = module0032.f1745(var244, var245);
            if (module0363.NIL != module0032.f1746(var245, var246) && !var241.eql(module0364.f24721(var246))) {
                var242 = (SubLObject)module0363.T;
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0363.NIL == var242);
    }
    
    public static SubLObject f24597(final SubLObject var14) {
        final SubLObject var15 = f24527(var14);
        SubLObject var16;
        SubLObject var17;
        SubLObject var18;
        for (var16 = module0032.f1741(var15), var17 = (SubLObject)module0363.NIL, var17 = module0032.f1742(var16, var15); module0363.NIL == module0032.f1744(var16, var17); var17 = module0032.f1743(var17)) {
            var18 = module0032.f1745(var16, var17);
            if (module0363.NIL != module0032.f1746(var17, var18) && module0363.NIL != module0364.f24749(var18)) {
                return (SubLObject)module0363.T;
            }
        }
        return (SubLObject)module0363.NIL;
    }
    
    public static SubLObject f24598(final SubLObject var14) {
        SubLObject var15 = module0032.f1726(f24590(var14), Symbols.symbol_function((SubLObject)module0363.EQ));
        var15 = f24599(var14, var15);
        return Sort.sort(module0032.f1753(var15), (SubLObject)module0363.$ic181$, (SubLObject)module0363.$ic182$);
    }
    
    public static SubLObject f24599(final SubLObject var14, SubLObject var243) {
        if (module0363.NIL == module0032.f1731(var14, var243, Symbols.symbol_function((SubLObject)module0363.EQ))) {
            var243 = module0032.f1736(var14, var243, Symbols.symbol_function((SubLObject)module0363.EQ));
            final SubLObject var244 = f24527(var14);
            SubLObject var245;
            SubLObject var246;
            SubLObject var247;
            SubLObject var248;
            SubLObject var249;
            SubLObject var250;
            SubLObject var251;
            SubLObject var252;
            for (var245 = module0032.f1741(var244), var246 = (SubLObject)module0363.NIL, var246 = module0032.f1742(var245, var244); module0363.NIL == module0032.f1744(var245, var246); var246 = module0032.f1743(var246)) {
                var247 = module0032.f1745(var245, var246);
                if (module0363.NIL != module0032.f1746(var246, var247)) {
                    var248 = var247;
                    var249 = module0364.f24735(var248);
                    var250 = (SubLObject)module0363.NIL;
                    var250 = var249.first();
                    while (module0363.NIL != var249) {
                        if (module0363.NIL != module0339.f22743((SubLObject)module0363.NIL, var248, var250)) {
                            var251 = module0364.f24736(var250);
                            var252 = module0364.f24737(var250);
                            var243 = f24599(var251, var243);
                        }
                        var249 = var249.rest();
                        var250 = var249.first();
                    }
                }
            }
        }
        return var243;
    }
    
    public static SubLObject f24600(final SubLObject var14) {
        return module0032.f1728(f24483(var14));
    }
    
    public static SubLObject f24601(final SubLObject var14) {
        SubLObject var15 = (SubLObject)module0363.NIL;
        final SubLObject var16 = f24530(var14);
        SubLObject var17;
        SubLObject var18;
        SubLObject var19;
        for (var17 = module0032.f1741(var16), var18 = (SubLObject)module0363.NIL, var18 = module0032.f1742(var17, var16); module0363.NIL == module0032.f1744(var17, var18); var18 = module0032.f1743(var18)) {
            var19 = module0032.f1745(var17, var18);
            if (module0363.NIL != module0032.f1746(var18, var19)) {
                if (module0363.NIL != var15) {
                    return Errors.error((SubLObject)module0363.$ic183$, var14);
                }
                var15 = var19;
            }
        }
        if (module0363.NIL != var15) {
            return var15;
        }
        return Errors.error((SubLObject)module0363.$ic184$, var14);
    }
    
    public static SubLObject f24602(final SubLObject var14) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0363.NIL == module0032.f1729(f24483(var14)));
    }
    
    public static SubLObject f24603(final SubLObject var14, final SubLObject var58) {
        final SubLObject var59 = f24530(var14);
        SubLObject var60;
        SubLObject var61;
        SubLObject var62;
        for (var60 = module0032.f1741(var59), var61 = (SubLObject)module0363.NIL, var61 = module0032.f1742(var60, var59); module0363.NIL == module0032.f1744(var60, var61); var61 = module0032.f1743(var61)) {
            var62 = module0032.f1745(var60, var61);
            if (module0363.NIL != module0032.f1746(var61, var62) && module0363.NIL != module0364.f24748(var62, var58)) {
                return (SubLObject)module0363.T;
            }
        }
        return (SubLObject)module0363.NIL;
    }
    
    public static SubLObject f24604(final SubLObject var14) {
        return f24603(var14, (SubLObject)module0363.$ic185$);
    }
    
    public static SubLObject f24605(final SubLObject var14) {
        if (module0363.NIL == f24602(var14)) {
            return (SubLObject)module0363.NIL;
        }
        final SubLObject var15 = f24530(var14);
        SubLObject var16;
        SubLObject var17;
        SubLObject var18;
        for (var16 = module0032.f1741(var15), var17 = (SubLObject)module0363.NIL, var17 = module0032.f1742(var16, var15); module0363.NIL == module0032.f1744(var16, var17); var17 = module0032.f1743(var17)) {
            var18 = module0032.f1745(var16, var17);
            if (module0363.NIL != module0032.f1746(var17, var18) && module0363.NIL == module0374.f26529(var18)) {
                return (SubLObject)module0363.T;
            }
        }
        return (SubLObject)module0363.NIL;
    }
    
    public static SubLObject f24606(final SubLObject var14) {
        SubLObject var15 = (SubLObject)module0363.NIL;
        SubLObject var16 = (SubLObject)module0363.NIL;
        final SubLObject var17 = f24530(var14);
        SubLObject var18;
        SubLObject var19;
        SubLObject var20;
        for (var18 = module0032.f1741(var17), var19 = (SubLObject)module0363.NIL, var19 = module0032.f1742(var18, var17); module0363.NIL == var15 && module0363.NIL == module0032.f1744(var18, var19); var19 = module0032.f1743(var19)) {
            var20 = module0032.f1745(var18, var19);
            if (module0363.NIL != module0032.f1746(var19, var20)) {
                if (module0363.NIL != module0364.f24748(var20, (SubLObject)module0363.$ic186$)) {
                    if (module0363.NIL != module0226.f15163(module0377.f26749(var20))) {
                        var16 = (SubLObject)module0363.T;
                    }
                    else {
                        var16 = (SubLObject)module0363.NIL;
                        var15 = (SubLObject)module0363.T;
                    }
                }
                else {
                    var15 = (SubLObject)module0363.T;
                    var16 = (SubLObject)module0363.NIL;
                }
            }
        }
        return var16;
    }
    
    public static SubLObject f24607(final SubLObject var14) {
        SubLObject var15 = (SubLObject)module0363.NIL;
        final SubLObject var16 = f24530(var14);
        SubLObject var17;
        SubLObject var18;
        SubLObject var19;
        SubLObject var20;
        for (var17 = module0032.f1741(var16), var18 = (SubLObject)module0363.NIL, var18 = module0032.f1742(var17, var16); module0363.NIL == module0032.f1744(var17, var18); var18 = module0032.f1743(var18)) {
            var19 = module0032.f1745(var17, var18);
            if (module0363.NIL != module0032.f1746(var18, var19)) {
                var20 = module0364.f24725(var19);
                if (module0363.NIL != var20) {
                    var15 = (SubLObject)ConsesLow.cons(var20, var15);
                }
            }
        }
        return Sequences.nreverse(var15);
    }
    
    public static SubLObject f24608(final SubLObject var14) {
        final SubLObject var15 = module0077.f5313(Symbols.symbol_function((SubLObject)module0363.EQ), (SubLObject)module0363.UNPROVIDED);
        final SubLObject var16 = f24530(var14);
        SubLObject var17;
        SubLObject var18;
        SubLObject var19;
        SubLObject var20;
        for (var17 = module0032.f1741(var16), var18 = (SubLObject)module0363.NIL, var18 = module0032.f1742(var17, var16); module0363.NIL == module0032.f1744(var17, var18); var18 = module0032.f1743(var18)) {
            var19 = module0032.f1745(var17, var18);
            if (module0363.NIL != module0032.f1746(var18, var19)) {
                var20 = module0364.f24725(var19);
                if (module0363.NIL != var20) {
                    module0077.f5326(var20, var15);
                }
            }
        }
        return module0077.f5311(var15);
    }
    
    public static SubLObject f24609(final SubLObject var14) {
        SubLObject var15 = (SubLObject)module0363.NIL;
        SubLObject var16 = (SubLObject)module0363.NIL;
        final SubLObject var17 = f24530(var14);
        SubLObject var18;
        SubLObject var19;
        SubLObject var20;
        SubLObject var21;
        for (var18 = module0032.f1741(var17), var19 = (SubLObject)module0363.NIL, var19 = module0032.f1742(var18, var17); module0363.NIL == module0032.f1744(var18, var19); var19 = module0032.f1743(var19)) {
            var20 = module0032.f1745(var18, var19);
            if (module0363.NIL != module0032.f1746(var19, var20)) {
                var21 = module0364.f24725(var20);
                if (module0363.NIL != var21) {
                    if (module0363.NIL == var15) {
                        var15 = var21;
                    }
                    else if (!var21.eql(var15)) {
                        var16 = (SubLObject)module0363.T;
                    }
                }
            }
        }
        return var16;
    }
    
    public static SubLObject f24610(final SubLObject var14) {
        return f24611(var14);
    }
    
    public static SubLObject f24611(final SubLObject var14) {
        final SubLObject var15 = f24517(var14);
        if (module0363.NIL != var15) {
            return module0048.f_1X(module0365.f24849(var15.first()));
        }
        return (SubLObject)module0363.ZERO_INTEGER;
    }
    
    public static SubLObject f24612(final SubLObject var14) {
        return Types.sublisp_null(f24517(var14));
    }
    
    public static SubLObject f24613(final SubLObject var14, final SubLObject var255) {
        SubLObject var256 = (SubLObject)module0363.ZERO_INTEGER;
        SubLObject var257 = f24517(var14);
        SubLObject var258 = (SubLObject)module0363.NIL;
        var258 = var257.first();
        while (module0363.NIL != var257) {
            if (module0363.NIL != f24522(var258, var255)) {
                var256 = Numbers.add(var256, (SubLObject)module0363.ONE_INTEGER);
            }
            var257 = var257.rest();
            var258 = var257.first();
        }
        return var256;
    }
    
    public static SubLObject f24614(final SubLObject var14, final SubLObject var255, final SubLObject var256) {
        SubLObject var257 = (SubLObject)module0363.ZERO_INTEGER;
        SubLObject var258 = f24517(var14);
        SubLObject var259 = (SubLObject)module0363.NIL;
        var259 = var258.first();
        while (module0363.NIL != var258) {
            if (module0363.NIL != f24518(var259, var256) && module0363.NIL != f24522(var259, var255)) {
                var257 = Numbers.add(var257, (SubLObject)module0363.ONE_INTEGER);
            }
            var258 = var258.rest();
            var259 = var258.first();
        }
        return var257;
    }
    
    public static SubLObject f24615(final SubLObject var14) {
        assert module0363.NIL != f24478(var14) : var14;
        return module0035.remove_if_not((SubLObject)module0363.$ic187$, f24517(var14), (SubLObject)module0363.UNPROVIDED, (SubLObject)module0363.UNPROVIDED, (SubLObject)module0363.UNPROVIDED, (SubLObject)module0363.UNPROVIDED);
    }
    
    public static SubLObject f24616(final SubLObject var14) {
        assert module0363.NIL != f24478(var14) : var14;
        return module0035.sublisp_boolean(Sequences.find_if((SubLObject)module0363.$ic187$, f24517(var14), (SubLObject)module0363.UNPROVIDED, (SubLObject)module0363.UNPROVIDED, (SubLObject)module0363.UNPROVIDED));
    }
    
    public static SubLObject f24617(final SubLObject var14) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0363.NIL == f24616(var14));
    }
    
    public static SubLObject f24618(final SubLObject var14) {
        assert module0363.NIL != f24478(var14) : var14;
        return module0035.remove_if_not((SubLObject)module0363.$ic188$, f24517(var14), (SubLObject)module0363.UNPROVIDED, (SubLObject)module0363.UNPROVIDED, (SubLObject)module0363.UNPROVIDED, (SubLObject)module0363.UNPROVIDED);
    }
    
    public static SubLObject f24619(final SubLObject var14) {
        assert module0363.NIL != f24478(var14) : var14;
        return module0035.remove_if_not((SubLObject)module0363.$ic189$, f24517(var14), (SubLObject)module0363.UNPROVIDED, (SubLObject)module0363.UNPROVIDED, (SubLObject)module0363.UNPROVIDED, (SubLObject)module0363.UNPROVIDED);
    }
    
    public static SubLObject f24620(final SubLObject var14) {
        return f24621(var14, (SubLObject)module0363.$ic190$);
    }
    
    public static SubLObject f24622(final SubLObject var14) {
        return f24621(var14, (SubLObject)module0363.$ic191$);
    }
    
    public static SubLObject f24623(final SubLObject var14) {
        return f24621(var14, (SubLObject)module0363.$ic192$);
    }
    
    public static SubLObject f24624(final SubLObject var14, SubLObject var58, SubLObject var50) {
        if (var58 == module0363.UNPROVIDED) {
            var58 = (SubLObject)module0363.NIL;
        }
        if (var50 == module0363.UNPROVIDED) {
            var50 = (SubLObject)module0363.NIL;
        }
        assert module0363.NIL != f24478(var14) : var14;
        if (module0363.NIL != var58 && !module0363.areAssertionsDisabledFor(me) && module0363.NIL == f24523(var58)) {
            throw new AssertionError(var58);
        }
        if (module0363.NIL != var50 && !module0363.areAssertionsDisabledFor(me) && module0363.NIL == module0360.f23921(var50)) {
            throw new AssertionError(var50);
        }
        SubLObject var59 = (SubLObject)module0363.ZERO_INTEGER;
        SubLObject var60 = f24517(var14);
        SubLObject var61 = (SubLObject)module0363.NIL;
        var61 = var60.first();
        while (module0363.NIL != var60) {
            if (module0363.NIL != f24524(var61, var58) && module0363.NIL != f24518(var61, var50)) {
                var59 = Numbers.add(var59, (SubLObject)module0363.ONE_INTEGER);
            }
            var60 = var60.rest();
            var61 = var60.first();
        }
        return var59;
    }
    
    public static SubLObject f24621(final SubLObject var14, SubLObject var50) {
        if (var50 == module0363.UNPROVIDED) {
            var50 = (SubLObject)module0363.NIL;
        }
        return f24624(var14, (SubLObject)module0363.NIL, var50);
    }
    
    public static SubLObject f24625(final SubLObject var14, final SubLObject var58, SubLObject var50) {
        if (var50 == module0363.UNPROVIDED) {
            var50 = (SubLObject)module0363.NIL;
        }
        SubLObject var59;
        SubLObject var60;
        SubLObject var61;
        for (var59 = (SubLObject)module0363.NIL, var60 = (SubLObject)module0363.NIL, var60 = f24517(var14); module0363.NIL == var59 && module0363.NIL != var60; var60 = var60.rest()) {
            var61 = var60.first();
            if (module0363.NIL != f24524(var61, var58) && module0363.NIL != f24518(var61, var50)) {
                var59 = (SubLObject)module0363.T;
            }
        }
        return var59;
    }
    
    public static SubLObject f24626(final SubLObject var14, final SubLObject var58) {
        return f24625(var14, var58, (SubLObject)module0363.UNPROVIDED);
    }
    
    public static SubLObject f24627(final SubLObject var14) {
        return f24626(var14, (SubLObject)module0363.$ic96$);
    }
    
    public static SubLObject f24628(final SubLObject var14) {
        return f24626(var14, (SubLObject)module0363.$ic186$);
    }
    
    public static SubLObject f24629(final SubLObject var14) {
        return f24625(var14, (SubLObject)module0363.$ic186$, (SubLObject)module0363.$ic190$);
    }
    
    public static SubLObject f24630(final SubLObject var14, final SubLObject var259) {
        assert module0363.NIL != f24478(var14) : var14;
        assert module0363.NIL != module0373.f26190(var259) : var259;
        return f24625(var14, (SubLObject)module0363.$ic195$, (SubLObject)module0363.$ic190$);
    }
    
    public static SubLObject f24631(final SubLObject var14, final SubLObject var259) {
        assert module0363.NIL != f24478(var14) : var14;
        assert module0363.NIL != module0373.f26190(var259) : var259;
        SubLObject var260 = f24517(var14);
        SubLObject var261 = (SubLObject)module0363.NIL;
        var261 = var260.first();
        while (module0363.NIL != var260) {
            if (module0363.NIL != f24524(var261, (SubLObject)module0363.$ic195$) && module0363.NIL != f24518(var261, (SubLObject)module0363.$ic190$) && module0363.NIL != module0384.f27359(var261, var259)) {
                return (SubLObject)module0363.T;
            }
            var260 = var260.rest();
            var261 = var260.first();
        }
        return (SubLObject)module0363.NIL;
    }
    
    public static SubLObject f24632(final SubLObject var14) {
        SubLObject var15;
        SubLObject var16;
        SubLObject var17;
        for (var15 = (SubLObject)module0363.NIL, var16 = (SubLObject)module0363.NIL, var16 = f24517(var14); module0363.NIL == var15 && module0363.NIL != var16; var15 = module0380.f26969(var17), var16 = var16.rest()) {
            var17 = var16.first();
        }
        return var15;
    }
    
    public static SubLObject f24633(final SubLObject var14) {
        SubLObject var15;
        SubLObject var16;
        SubLObject var17;
        for (var15 = (SubLObject)module0363.NIL, var16 = (SubLObject)module0363.NIL, var16 = f24517(var14); module0363.NIL == var15 && module0363.NIL != var16; var16 = var16.rest()) {
            var17 = var16.first();
            if (module0363.NIL != module0365.f24883(var17)) {
                var15 = (SubLObject)module0363.T;
            }
        }
        return var15;
    }
    
    public static SubLObject f24634(final SubLObject var14, final SubLObject var259) {
        SubLObject var260;
        SubLObject var261;
        SubLObject var262;
        for (var260 = (SubLObject)module0363.NIL, var261 = (SubLObject)module0363.NIL, var261 = f24517(var14); module0363.NIL == var260 && module0363.NIL != var261; var261 = var261.rest()) {
            var262 = var261.first();
            if (module0363.NIL != f24524(var262, (SubLObject)module0363.$ic195$) && module0363.NIL != module0384.f27359(var262, var259) && module0363.NIL != module0365.f24883(var262)) {
                var260 = (SubLObject)module0363.T;
            }
        }
        return var260;
    }
    
    public static SubLObject f24635(final SubLObject var261) {
        return module0035.f2369((SubLObject)module0363.$ic196$, var261, (SubLObject)module0363.UNPROVIDED);
    }
    
    public static SubLObject f24636(final SubLObject var14) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0363.NIL == f24626(var14, (SubLObject)module0363.$ic101$));
    }
    
    public static SubLObject f24637(final SubLObject var14) {
        assert module0363.NIL != f24478(var14) : var14;
        SubLObject var15 = (SubLObject)module0363.ZERO_INTEGER;
        SubLObject var16 = f24517(var14);
        SubLObject var17 = (SubLObject)module0363.NIL;
        var17 = var16.first();
        while (module0363.NIL != var16) {
            if (module0363.NIL != f24524(var17, (SubLObject)module0363.$ic195$) && module0363.NIL != f24518(var17, (SubLObject)module0363.$ic190$)) {
                final SubLObject var18 = module0365.f24852(var17);
                var15 = module0360.f23944(var15, var18);
            }
            var16 = var16.rest();
            var17 = var16.first();
        }
        return var15;
    }
    
    public static SubLObject f24638(final SubLObject var14) {
        assert module0363.NIL != f24478(var14) : var14;
        SubLObject var15 = (SubLObject)module0363.ZERO_INTEGER;
        SubLObject var16 = f24517(var14);
        SubLObject var17 = (SubLObject)module0363.NIL;
        var17 = var16.first();
        while (module0363.NIL != var16) {
            if (module0363.NIL != f24524(var17, (SubLObject)module0363.$ic195$) && module0363.NIL != f24518(var17, (SubLObject)module0363.$ic190$) && module0363.NIL == module0365.f24888(var17)) {
                final SubLObject var18 = module0365.f24852(var17);
                var15 = module0360.f23944(var15, var18);
            }
            var16 = var16.rest();
            var17 = var16.first();
        }
        return var15;
    }
    
    public static SubLObject f24639(final SubLObject var14) {
        assert module0363.NIL != f24478(var14) : var14;
        SubLObject var15 = (SubLObject)module0363.ZERO_INTEGER;
        SubLObject var16 = f24517(var14);
        SubLObject var17 = (SubLObject)module0363.NIL;
        var17 = var16.first();
        while (module0363.NIL != var16) {
            if (module0363.NIL != f24524(var17, (SubLObject)module0363.$ic195$) && module0363.NIL == module0365.f24886(var17)) {
                final SubLObject var18 = module0373.f26182(var17);
                var15 = module0360.f23944(var15, var18);
            }
            var16 = var16.rest();
            var17 = var16.first();
        }
        return var15;
    }
    
    public static SubLObject f24640(final SubLObject var14) {
        assert module0363.NIL != f24478(var14) : var14;
        SubLObject var15 = (SubLObject)module0363.NIL;
        SubLObject var16 = f24517(var14);
        SubLObject var17 = (SubLObject)module0363.NIL;
        var17 = var16.first();
        while (module0363.NIL != var16) {
            if (module0363.NIL != f24524(var17, (SubLObject)module0363.$ic195$) && module0363.NIL != f24518(var17, (SubLObject)module0363.$ic190$)) {
                var15 = (SubLObject)ConsesLow.cons(var17, var15);
            }
            var16 = var16.rest();
            var17 = var16.first();
        }
        return var15;
    }
    
    public static SubLObject f24641(final SubLObject var14) {
        assert module0363.NIL != f24478(var14) : var14;
        SubLObject var15 = (SubLObject)module0363.NIL;
        SubLObject var16 = f24517(var14);
        SubLObject var17 = (SubLObject)module0363.NIL;
        var17 = var16.first();
        while (module0363.NIL != var16) {
            if (module0363.NIL != f24524(var17, (SubLObject)module0363.$ic195$) && module0363.NIL != f24518(var17, (SubLObject)module0363.$ic191$)) {
                final SubLObject var18 = module0365.f24865(var17);
                final SubLObject var19 = module0340.f22825(var18);
                final SubLObject var20 = module0365.f24870(var17);
                final SubLObject var21 = module0373.f26182(var17);
                var15 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var19, var20, var21), var15);
            }
            var16 = var16.rest();
            var17 = var16.first();
        }
        return Sequences.nreverse(var15);
    }
    
    public static SubLObject f24642(final SubLObject var14, SubLObject var126) {
        if (var126 == module0363.UNPROVIDED) {
            var126 = (SubLObject)module0363.NIL;
        }
        final SubLThread var127 = SubLProcess.currentSubLThread();
        SubLObject var128 = (SubLObject)module0363.NIL;
        final SubLObject var129 = var126;
        SubLObject var130;
        for (var130 = module0066.f4838(f24537(var14)); module0363.NIL == module0066.f4841(var130); var130 = module0066.f4840(var130)) {
            var127.resetMultipleValues();
            final SubLObject var131 = module0066.f4839(var130);
            final SubLObject var132 = var127.secondMultipleValue();
            var127.resetMultipleValues();
            SubLObject var133 = var132;
            SubLObject var134 = (SubLObject)module0363.NIL;
            var134 = var133.first();
            while (module0363.NIL != var133) {
                if (module0363.NIL != f24538(var134, var129)) {
                    var128 = (SubLObject)ConsesLow.cons(var134, var128);
                }
                var133 = var133.rest();
                var134 = var133.first();
            }
        }
        module0066.f4842(var130);
        return var128;
    }
    
    public static SubLObject f24643(final SubLObject var14, SubLObject var126) {
        if (var126 == module0363.UNPROVIDED) {
            var126 = (SubLObject)module0363.NIL;
        }
        final SubLThread var127 = SubLProcess.currentSubLThread();
        final SubLObject var128 = f24507(var14);
        if (module0363.NIL != var126 && module0363.NIL != module0361.f24321(var128)) {
            SubLObject var129 = (SubLObject)module0363.ZERO_INTEGER;
            final SubLObject var130 = var126;
            SubLObject var131;
            for (var131 = module0066.f4838(f24537(var14)); module0363.NIL == module0066.f4841(var131); var131 = module0066.f4840(var131)) {
                var127.resetMultipleValues();
                final SubLObject var132 = module0066.f4839(var131);
                final SubLObject var133 = var127.secondMultipleValue();
                var127.resetMultipleValues();
                SubLObject var134 = var133;
                SubLObject var135 = (SubLObject)module0363.NIL;
                var135 = var134.first();
                while (module0363.NIL != var134) {
                    if (module0363.NIL != f24538(var135, var130)) {
                        var129 = Numbers.add(var129, (SubLObject)module0363.ONE_INTEGER);
                    }
                    var134 = var134.rest();
                    var135 = var134.first();
                }
            }
            module0066.f4842(var131);
            return var129;
        }
        if (var126 == module0363.$ic197$) {
            return (SubLObject)module0363.ZERO_INTEGER;
        }
        return module0066.f4826(f24486(var14));
    }
    
    public static SubLObject f24644(final SubLObject var14) {
        return f24643(var14, (SubLObject)module0363.$ic198$);
    }
    
    public static SubLObject f24645(final SubLObject var14, SubLObject var126) {
        if (var126 == module0363.UNPROVIDED) {
            var126 = (SubLObject)module0363.NIL;
        }
        final SubLThread var127 = SubLProcess.currentSubLThread();
        final SubLObject var128 = f24507(var14);
        if (module0363.NIL != var126 && module0363.NIL != module0361.f24321(var128)) {
            final SubLObject var129 = var126;
            SubLObject var130;
            for (var130 = module0066.f4838(f24537(var14)); module0363.NIL == module0066.f4841(var130); var130 = module0066.f4840(var130)) {
                var127.resetMultipleValues();
                final SubLObject var131 = module0066.f4839(var130);
                final SubLObject var132 = var127.secondMultipleValue();
                var127.resetMultipleValues();
                SubLObject var133 = var132;
                SubLObject var134 = (SubLObject)module0363.NIL;
                var134 = var133.first();
                while (module0363.NIL != var133) {
                    if (module0363.NIL != f24538(var134, var129)) {
                        return (SubLObject)module0363.T;
                    }
                    var133 = var133.rest();
                    var134 = var133.first();
                }
            }
            module0066.f4842(var130);
            return (SubLObject)module0363.NIL;
        }
        if (var126 == module0363.$ic197$) {
            return (SubLObject)module0363.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0363.NIL == module0066.f4827(f24486(var14)));
    }
    
    public static SubLObject f24646(final SubLObject var14) {
        return f24645(var14, (SubLObject)module0363.$ic198$);
    }
    
    public static SubLObject f24647(final SubLObject var14) {
        return f24645(var14, (SubLObject)module0363.$ic197$);
    }
    
    public static SubLObject f24648(final SubLObject var14, final SubLObject var129) {
        final SubLObject var130 = f24486(var14);
        final SubLObject var131 = module0066.f4831(var130, var129, Symbols.symbol_function((SubLObject)module0363.EQUAL), (SubLObject)module0363.UNPROVIDED);
        return var131;
    }
    
    public static SubLObject f24649(final SubLObject var14, final SubLObject var129) {
        final SubLObject var130 = f24487(var14);
        final SubLObject var131 = module0066.f4831(var130, var129, Symbols.symbol_function((SubLObject)module0363.EQUAL), (SubLObject)module0363.UNPROVIDED);
        return var131;
    }
    
    public static SubLObject f24546(final SubLObject var14) {
        final SubLObject var15 = f24507(var14);
        final SubLObject var16 = module0361.f24150(var15);
        return module0077.f5320(var14, var16);
    }
    
    public static SubLObject f24650(final SubLObject var14) {
        return module0361.f24379(f24507(var14), var14);
    }
    
    public static SubLObject f24651(final SubLObject var14) {
        final SubLObject var15 = module0361.f24179(f24507(var14));
        final SubLObject var16 = module0361.f24412(var15);
        return module0077.f5320(var14, var16);
    }
    
    public static SubLObject f24652(final SubLObject var14) {
        final SubLObject var15 = module0361.f24179(f24507(var14));
        return (SubLObject)SubLObjectFactory.makeBoolean(module0363.NIL == module0361.f24334(var15) && module0363.NIL == f24651(var14));
    }
    
    public static SubLObject f24653(final SubLObject var14) {
        if (module0363.NIL != f24651(var14)) {
            return (SubLObject)module0363.$ic199$;
        }
        if (module0363.NIL != f24652(var14)) {
            return (SubLObject)module0363.$ic200$;
        }
        return (SubLObject)module0363.$ic201$;
    }
    
    public static SubLObject f24654(final SubLObject var14) {
        final SubLObject var15 = f24507(var14);
        final SubLObject var16 = module0361.f24157(var15);
        final SubLObject var17 = Hashtables.gethash_without_values(var14, var16, (SubLObject)module0363.$ic58$);
        return var17;
    }
    
    public static SubLObject f24655(final SubLObject var14, final SubLObject var160) {
        final SubLObject var161 = f24507(var14);
        final SubLObject var162 = module0067.f4885(module0361.f24154(var161), var160, (SubLObject)module0363.UNPROVIDED);
        if (module0363.NIL != var162) {
            final SubLObject var163 = Hashtables.gethash_without_values(var14, var162, (SubLObject)module0363.UNPROVIDED);
            if (module0363.NIL != module0004.f106(var163)) {
                return var163;
            }
        }
        return (SubLObject)module0363.$ic58$;
    }
    
    public static SubLObject f24656(final SubLObject var14, final SubLObject var160) {
        final SubLThread var161 = SubLProcess.currentSubLThread();
        final SubLObject var162 = module0363.$g3132$.currentBinding(var161);
        try {
            module0363.$g3132$.bind((SubLObject)module0363.$ic203$, var161);
            return f24657(var14, var160);
        }
        finally {
            module0363.$g3132$.rebind(var162, var161);
        }
    }
    
    public static SubLObject f24657(final SubLObject var14, final SubLObject var160) {
        final SubLThread var161 = SubLProcess.currentSubLThread();
        if (module0363.NIL != module0363.$g3133$.getDynamicValue(var161)) {
            return module0386.f27415(var14, var160);
        }
        final SubLObject var162 = f24507(var14);
        final SubLObject var163 = module0067.f4885(module0361.f24155(var162), var160, (SubLObject)module0363.UNPROVIDED);
        if (module0363.NIL != var163) {
            final SubLObject var164 = Hashtables.gethash_without_values(var14, var163, (SubLObject)module0363.UNPROVIDED);
            if (module0363.NIL != module0004.f106(var164)) {
                return var164;
            }
        }
        return (SubLObject)module0363.$ic58$;
    }
    
    public static SubLObject f24658(final SubLObject var14, final SubLObject var160) {
        final SubLObject var161 = f24507(var14);
        final SubLObject var162 = module0067.f4885(module0361.f24156(var161), var160, (SubLObject)module0363.UNPROVIDED);
        if (module0363.NIL != var162) {
            final SubLObject var163 = Hashtables.gethash_without_values(var14, var162, (SubLObject)module0363.UNPROVIDED);
            if (module0363.NIL != var163) {
                return var163;
            }
        }
        return (SubLObject)module0363.$ic58$;
    }
    
    public static SubLObject f24659(final SubLObject var14) {
        final SubLObject var15 = f24488(var14);
        if (module0363.NIL != Types.booleanp(var15)) {
            return var15;
        }
        final SubLObject var16 = module0349.f23460(var14);
        f24499(var14, var16);
        return var16;
    }
    
    public static SubLObject f24660(final SubLObject var14, final SubLObject var174) {
        assert module0363.NIL != f24478(var14) : var14;
        assert module0363.NIL != module0364.f24699(var174) : var174;
        f24495(var14, module0032.f1736(var174, f24484(var14), Symbols.symbol_function((SubLObject)module0363.EQ)));
        return var14;
    }
    
    public static SubLObject f24661(final SubLObject var14, final SubLObject var174) {
        assert module0363.NIL != f24478(var14) : var14;
        assert module0363.NIL != module0364.f24699(var174) : var174;
        f24495(var14, module0032.f1737(var174, f24484(var14), Symbols.symbol_function((SubLObject)module0363.EQ)));
        return var14;
    }
    
    public static SubLObject f24662(final SubLObject var14, final SubLObject var174) {
        final SubLObject var175 = f24487(var14);
        final SubLObject var176 = (SubLObject)((module0363.NIL != module0376.f26613(var174)) ? module0376.f26614(var174) : ((module0363.NIL != module0375.f26571(var174)) ? module0375.f26570(var174) : module0363.NIL));
        SubLObject var177 = module0066.f4831(var175, var176, Symbols.symbol_function((SubLObject)module0363.EQUAL), (SubLObject)module0363.UNPROVIDED);
        var177 = (SubLObject)ConsesLow.cons(var174, var177);
        f24498(var14, module0066.f4833(var175, var176, var177, Symbols.symbol_function((SubLObject)module0363.EQUAL)));
        return var14;
    }
    
    public static SubLObject f24663(final SubLObject var14, final SubLObject var174) {
        final SubLObject var175 = f24487(var14);
        final SubLObject var176 = (SubLObject)((module0363.NIL != module0376.f26613(var174)) ? module0376.f26614(var174) : ((module0363.NIL != module0375.f26571(var174)) ? module0375.f26570(var174) : module0363.NIL));
        final SubLObject var177 = module0066.f4831(var175, var176, Symbols.symbol_function((SubLObject)module0363.EQUAL), (SubLObject)module0363.UNPROVIDED);
        final SubLObject var178 = module0035.f2073(var174, var177, Symbols.symbol_function((SubLObject)module0363.EQ));
        if (!var177.eql(var178)) {
            if (module0363.NIL == var178) {
                f24498(var14, module0066.f4834(var175, var176, Symbols.symbol_function((SubLObject)module0363.EQUAL)));
            }
            else {
                f24498(var14, module0066.f4833(var175, var176, var178, Symbols.symbol_function((SubLObject)module0363.EQUAL)));
            }
        }
        return var14;
    }
    
    public static SubLObject f24664(final SubLObject var14, final SubLObject var175) {
        assert module0363.NIL != f24478(var14) : var14;
        assert module0363.NIL != module0364.f24699(var175) : var175;
        f24494(var14, module0032.f1736(var175, f24483(var14), Symbols.symbol_function((SubLObject)module0363.EQ)));
        module0413.f28777();
        if (module0363.NIL != f24562(var14)) {
            module0413.f28780();
        }
        return var14;
    }
    
    public static SubLObject f24665(final SubLObject var14, final SubLObject var175) {
        assert module0363.NIL != f24478(var14) : var14;
        assert module0363.NIL != module0364.f24699(var175) : var175;
        f24494(var14, module0032.f1737(var175, f24483(var14), Symbols.symbol_function((SubLObject)module0363.EQ)));
        return var14;
    }
    
    public static SubLObject f24666(final SubLObject var14, final SubLObject var62) {
        final SubLThread var63 = SubLProcess.currentSubLThread();
        assert module0363.NIL != f24478(var14) : var14;
        assert module0363.NIL != module0365.f24819(var62) : var62;
        if (module0363.NIL == Errors.$ignore_mustsP$.getDynamicValue(var63) && !f24611(var14).numLE(module0363.$g3134$.getGlobalValue())) {
            Errors.error((SubLObject)module0363.$ic208$, new SubLObject[] { var62, var14, module0363.$g3134$.getGlobalValue(), var14 });
        }
        f24496(var14, (SubLObject)ConsesLow.cons(var62, f24485(var14)));
        return var14;
    }
    
    public static SubLObject f24667(final SubLObject var14, final SubLObject var62) {
        assert module0363.NIL != module0365.f24819(var62) : var62;
        f24496(var14, Sequences.delete(var62, f24485(var14), (SubLObject)module0363.UNPROVIDED, (SubLObject)module0363.UNPROVIDED, (SubLObject)module0363.UNPROVIDED, (SubLObject)module0363.UNPROVIDED, (SubLObject)module0363.UNPROVIDED));
        return var14;
    }
    
    public static SubLObject f24668(final SubLObject var14, final SubLObject var131) {
        assert module0363.NIL != f24478(var14) : var14;
        assert module0363.NIL != module0366.f24916(var131) : var131;
        final SubLObject var132 = f24486(var14);
        final SubLObject var133 = module0366.f24934(var131);
        SubLObject var134 = module0066.f4831(var132, var133, Symbols.symbol_function((SubLObject)module0363.EQUAL), (SubLObject)module0363.UNPROVIDED);
        var134 = (SubLObject)ConsesLow.cons(var131, var134);
        f24497(var14, module0066.f4833(var132, var133, var134, Symbols.symbol_function((SubLObject)module0363.EQUAL)));
        return var14;
    }
    
    public static SubLObject f24669(final SubLObject var14, final SubLObject var131) {
        final SubLObject var132 = module0366.f24934(var131);
        return f24670(var14, var131, var132);
    }
    
    public static SubLObject f24670(final SubLObject var14, final SubLObject var131, final SubLObject var129) {
        assert module0363.NIL != f24478(var14) : var14;
        assert module0363.NIL != module0366.f24916(var131) : var131;
        assert module0363.NIL != module0233.f15349(var129) : var129;
        SubLObject var132 = f24530(var14);
        SubLObject var133;
        SubLObject var134;
        SubLObject var135;
        for (var133 = module0032.f1741(var132), var134 = (SubLObject)module0363.NIL, var134 = module0032.f1742(var133, var132); module0363.NIL == module0032.f1744(var133, var134); var134 = module0032.f1743(var134)) {
            var135 = module0032.f1745(var133, var134);
            if (module0363.NIL != module0032.f1746(var134, var135) && module0363.NIL != module0364.f24748(var135, (SubLObject)module0363.$ic108$)) {
                module0381.f27147(var135, var131, var129);
            }
        }
        var132 = f24530(var14);
        SubLObject var136;
        for (var133 = module0032.f1741(var132), var134 = (SubLObject)module0363.NIL, var134 = module0032.f1742(var133, var132); module0363.NIL == module0032.f1744(var133, var134); var134 = module0032.f1743(var134)) {
            var136 = module0032.f1745(var133, var134);
            if (module0363.NIL != module0032.f1746(var134, var136) && module0363.NIL != module0364.f24748(var136, (SubLObject)module0363.$ic109$)) {
                module0382.f27201(var136, var131, var129);
            }
        }
        final SubLObject var137 = f24486(var14);
        final SubLObject var138 = module0066.f4831(var137, var129, Symbols.symbol_function((SubLObject)module0363.EQUAL), (SubLObject)module0363.UNPROVIDED);
        final SubLObject var139 = module0035.f2073(var131, var138, Symbols.symbol_function((SubLObject)module0363.EQ));
        if (!var138.eql(var139)) {
            if (module0363.NIL == var139) {
                f24497(var14, module0066.f4834(var137, var129, Symbols.symbol_function((SubLObject)module0363.EQUAL)));
            }
            else {
                f24497(var14, module0066.f4833(var137, var129, var139, Symbols.symbol_function((SubLObject)module0363.EQUAL)));
            }
        }
        return var14;
    }
    
    public static SubLObject f24671(final SubLObject var14, final SubLObject var15) {
        assert module0363.NIL != f24478(var14) : var14;
        assert module0363.NIL != module0004.f106(var15) : var15;
        final SubLObject var16 = f24507(var14);
        final SubLObject var17 = module0361.f24157(var16);
        Hashtables.sethash(var14, var17, var15);
        return var14;
    }
    
    public static SubLObject f24672(final SubLObject var14, final SubLObject var160, final SubLObject var15) {
        assert module0363.NIL != f24478(var14) : var14;
        assert module0363.NIL != module0369.f25275(var160) : var160;
        assert module0363.NIL != module0004.f106(var15) : var15;
        final SubLObject var161 = f24507(var14);
        SubLObject var162 = module0067.f4885(module0361.f24154(var161), var160, (SubLObject)module0363.UNPROVIDED);
        if (module0363.NIL == var162) {
            var162 = Hashtables.make_hash_table(module0361.f24228(var161), Symbols.symbol_function((SubLObject)module0363.EQ), (SubLObject)module0363.UNPROVIDED);
            module0067.f4886(module0361.f24154(var161), var160, var162);
        }
        Hashtables.sethash(var14, var162, var15);
        return var14;
    }
    
    public static SubLObject f24673(final SubLObject var14, final SubLObject var160, final SubLObject var15) {
        assert module0363.NIL != f24478(var14) : var14;
        assert module0363.NIL != module0369.f25275(var160) : var160;
        assert module0363.NIL != module0004.f106(var15) : var15;
        final SubLObject var161 = f24507(var14);
        SubLObject var162 = module0067.f4885(module0361.f24155(var161), var160, (SubLObject)module0363.UNPROVIDED);
        if (module0363.NIL == var162) {
            var162 = Hashtables.make_hash_table(module0361.f24228(var161), Symbols.symbol_function((SubLObject)module0363.EQ), (SubLObject)module0363.UNPROVIDED);
            module0067.f4886(module0361.f24155(var161), var160, var162);
        }
        Hashtables.sethash(var14, var162, var15);
        module0369.f25650(var160, var15);
        return var14;
    }
    
    public static SubLObject f24674(final SubLObject var14, final SubLObject var160, final SubLObject var288) {
        assert module0363.NIL != f24478(var14) : var14;
        assert module0363.NIL != module0369.f25275(var160) : var160;
        assert module0363.NIL != module0386.f27448(var288) : var288;
        final SubLObject var289 = f24507(var14);
        SubLObject var290 = module0067.f4885(module0361.f24156(var289), var160, (SubLObject)module0363.UNPROVIDED);
        if (module0363.NIL == var290) {
            var290 = Hashtables.make_hash_table(module0361.f24228(var289), Symbols.symbol_function((SubLObject)module0363.EQ), (SubLObject)module0363.UNPROVIDED);
            module0067.f4886(module0361.f24156(var289), var160, var290);
        }
        Hashtables.sethash(var14, var290, var288);
        final SubLObject var291 = module0386.f27416(var288);
        module0369.f25650(var160, var291);
        return var14;
    }
    
    public static SubLObject f24675(final SubLObject var14, final SubLObject var160) {
        final SubLObject var161 = f24509(var14);
        final SubLObject var162 = module0386.f27433(var161, (SubLObject)module0363.UNPROVIDED);
        return f24674(var14, var160, var162);
    }
    
    public static SubLObject f24676(final SubLObject var14) {
        if (module0363.NIL == f24651(var14)) {
            final SubLObject var15 = module0361.f24179(f24507(var14));
            module0361.f24418(var15, var14);
        }
        return var14;
    }
    
    public static SubLObject f24677(final SubLObject var14) {
        if (module0363.NIL == f24652(var14)) {
            final SubLObject var15 = module0361.f24179(f24507(var14));
            module0361.f24419(var15, var14);
        }
        return var14;
    }
    
    public static SubLObject f24678(final SubLObject var14, final SubLObject var160, final SubLObject var291) {
        final SubLObject var292 = f24658(var14, var160);
        final SubLObject var293 = (module0363.$ic58$ == var292) ? var291 : module0386.f27458(var292, var291);
        if (!var292.equal(var293)) {
            f24674(var14, var160, var293);
            return (SubLObject)module0363.T;
        }
        return (SubLObject)module0363.NIL;
    }
    
    public static SubLObject f24679(final SubLObject var14) {
        final SubLObject var15 = f24550(var14);
        return module0360.f23887(var15);
    }
    
    public static SubLObject f24680(final SubLObject var14) {
        return module0373.f26329(var14);
    }
    
    public static SubLObject f24681(final SubLObject var14) {
        return module0360.f23889(f24506(var14));
    }
    
    public static SubLObject f24682(final SubLObject var14) {
        return module0360.f23890(f24506(var14));
    }
    
    public static SubLObject f24683(final SubLObject var14) {
        final SubLObject var15 = f24506(var14);
        return module0360.f23886(var15);
    }
    
    public static SubLObject f24684(final SubLObject var14) {
        return Equality.eq((SubLObject)module0363.$ic57$, module0360.f23886(f24506(var14)));
    }
    
    public static SubLObject f24685(final SubLObject var14) {
        return module0360.f23891(f24506(var14));
    }
    
    public static SubLObject f24686(final SubLObject var14) {
        return module0360.f23892(f24506(var14));
    }
    
    public static SubLObject f24687(final SubLObject var14) {
        return module0360.f23893(f24506(var14));
    }
    
    public static SubLObject f24688(final SubLObject var14) {
        return module0360.f23894(f24506(var14));
    }
    
    public static SubLObject f24689(final SubLObject var14) {
        return module0360.f23895(f24506(var14));
    }
    
    public static SubLObject f24690(final SubLObject var14) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0363.NIL != f24687(var14) || module0363.NIL != f24688(var14) || module0363.NIL != f24689(var14));
    }
    
    public static SubLObject f24691(final SubLObject var14) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0363.NIL != f24687(var14) || module0363.NIL != f24685(var14));
    }
    
    public static SubLObject f24692(final SubLObject var14) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0363.NIL != f24686(var14) || module0363.NIL != f24688(var14) || module0363.NIL != f24689(var14));
    }
    
    public static SubLObject f24693(final SubLObject var16) {
        assert module0363.NIL != module0361.f24009(var16) : var16;
        final SubLObject var17 = module0067.f4880(Symbols.symbol_function((SubLObject)module0363.EQ), (SubLObject)module0363.UNPROVIDED);
        final SubLObject var18 = module0361.f24128(var16);
        if (module0363.NIL == module0065.f4772(var18, (SubLObject)module0363.$ic168$)) {
            final SubLObject var179_295 = var18;
            if (module0363.NIL == module0065.f4775(var179_295, (SubLObject)module0363.$ic168$)) {
                final SubLObject var19 = module0065.f4740(var179_295);
                final SubLObject var20 = (SubLObject)module0363.NIL;
                SubLObject var21;
                SubLObject var22;
                SubLObject var23;
                SubLObject var24;
                SubLObject var25;
                SubLObject var26;
                SubLObject var27;
                SubLObject var28;
                for (var21 = Sequences.length(var19), var22 = (SubLObject)module0363.NIL, var22 = (SubLObject)module0363.ZERO_INTEGER; var22.numL(var21); var22 = Numbers.add(var22, (SubLObject)module0363.ONE_INTEGER)) {
                    var23 = ((module0363.NIL != var20) ? Numbers.subtract(var21, var22, (SubLObject)module0363.ONE_INTEGER) : var22);
                    var24 = Vectors.aref(var19, var23);
                    if (module0363.NIL == module0065.f4749(var24) || module0363.NIL == module0065.f4773((SubLObject)module0363.$ic168$)) {
                        if (module0363.NIL != module0065.f4749(var24)) {
                            var24 = (SubLObject)module0363.$ic168$;
                        }
                        var25 = f24517(var24);
                        var26 = (SubLObject)module0363.NIL;
                        var26 = var25.first();
                        while (module0363.NIL != var25) {
                            var27 = module0365.f24865(var26);
                            var28 = module0340.f22825(var27);
                            module0084.f5775(var17, var28, (SubLObject)module0363.UNPROVIDED);
                            var25 = var25.rest();
                            var26 = var25.first();
                        }
                    }
                }
            }
            final SubLObject var188_298 = var18;
            if (module0363.NIL == module0065.f4777(var188_298)) {
                final SubLObject var29 = module0065.f4738(var188_298);
                SubLObject var30 = (SubLObject)module0363.NIL;
                SubLObject var31 = (SubLObject)module0363.NIL;
                final Iterator var32 = Hashtables.getEntrySetIterator(var29);
                try {
                    while (Hashtables.iteratorHasNext(var32)) {
                        final Map.Entry var33 = Hashtables.iteratorNextEntry(var32);
                        var30 = Hashtables.getEntryKey(var33);
                        var31 = Hashtables.getEntryValue(var33);
                        SubLObject var34 = f24517(var31);
                        SubLObject var35 = (SubLObject)module0363.NIL;
                        var35 = var34.first();
                        while (module0363.NIL != var34) {
                            final SubLObject var36 = module0365.f24865(var35);
                            final SubLObject var37 = module0340.f22825(var36);
                            module0084.f5775(var17, var37, (SubLObject)module0363.UNPROVIDED);
                            var34 = var34.rest();
                            var35 = var34.first();
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var32);
                }
            }
        }
        return Sort.sort(module0084.f5780(var17), Symbols.symbol_function((SubLObject)module0363.$ic214$), Symbols.symbol_function((SubLObject)module0363.$ic215$));
    }
    
    public static SubLObject f24694() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24476", "S#27395", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24478", "S#26082", 1, 0, false);
        new $f24478$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24479", "S#27396", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24480", "S#27397", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24481", "S#27398", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24482", "S#27399", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24483", "S#27400", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24484", "S#27401", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24485", "S#27402", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24486", "S#27403", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24487", "S#27404", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24488", "S#27405", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24489", "S#27406", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24490", "S#27407", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24491", "S#27408", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24492", "S#27409", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24493", "S#27410", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24494", "S#27411", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24495", "S#27412", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24496", "S#27413", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24497", "S#27414", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24498", "S#27415", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24499", "S#27416", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24500", "S#27417", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24501", "S#27418", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24502", "S#27419", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24503", "S#27420", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24504", "S#27421", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24505", "S#27422", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24477", "S#27423", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24510", "S#27331", 1, 0, false);
        new $f24510$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24511", "S#27424", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0363", "f24513", "S#27425");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24514", "S#27426", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0363", "f24515", "S#27427");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0363", "f24516", "DO-PROBLEM-TACTICS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24517", "S#27428", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24518", "S#27429", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24519", "S#27430", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24520", "S#27431", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24521", "S#27432", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24522", "S#27433", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24523", "S#27434", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24524", "S#27435", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24525", "S#27436", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24526", "S#27437", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24527", "S#25403", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24528", "S#27438", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0363", "f24529", "S#25413");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24530", "S#27439", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24531", "S#27440", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0363", "f24532", "S#27441");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0363", "f24533", "S#27442");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0363", "f24534", "S#27443");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0363", "f24535", "S#27444");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0363", "f24536", "S#27445");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24537", "S#27446", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24538", "S#25418", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0363", "f24539", "S#27447");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0363", "f24540", "S#27448");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0363", "f24541", "S#27449");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0363", "f24542", "S#27450");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0363", "f24543", "S#27451");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24544", "S#27452", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24549", "S#26789", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24548", "S#27453", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24545", "S#27454", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24508", "S#26813", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24507", "PROBLEM-STORE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24509", "S#26083", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24506", "S#27455", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24550", "S#27456", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24512", "S#27457", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24551", "S#27458", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24552", "S#27459", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24553", "S#27460", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24555", "S#27461", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24554", "S#27462", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24556", "S#27463", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24557", "S#27464", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24558", "S#27465", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24559", "S#27466", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24560", "S#27467", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24561", "S#27293", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24562", "S#26331", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24563", "S#27468", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24564", "SINGLE-LITERAL-PROBLEM-ATOMIC-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24565", "S#26810", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24566", "S#27469", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24567", "S#27470", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24568", "S#27471", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24569", "S#26332", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24570", "S#27472", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24571", "S#27473", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24572", "S#26799", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24574", "S#27474", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24575", "S#26800", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24576", "S#26801", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24573", "S#27475", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24577", "S#26802", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24578", "S#27476", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24579", "S#27477", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24580", "PROBLEM-SOLE-CLAUSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24581", "PROBLEM-QUERY-SOLE-CLAUSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24582", "S#26814", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24583", "S#27478", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24584", "S#27479", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24585", "S#27480", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24547", "PROBLEM-RELEVANT-TO-INFERENCE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24586", "S#27481", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24587", "S#27482", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24588", "S#27483", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24589", "S#27484", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24590", "PROBLEM-ARGUMENT-LINK-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24591", "S#27485", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24592", "S#27486", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24593", "S#27487", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24594", "S#27488", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24595", "S#27489", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24596", "S#27490", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24597", "S#27491", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24598", "S#27492", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24599", "S#27493", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24600", "PROBLEM-DEPENDENT-LINK-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24601", "S#27494", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24602", "S#27495", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24603", "S#27496", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24604", "S#27497", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24605", "S#27498", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24606", "S#27499", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24607", "S#27500", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24608", "S#27501", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24609", "S#27502", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24610", "S#27503", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24611", "S#27504", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24612", "S#27505", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24613", "S#27506", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24614", "S#27507", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24615", "S#27508", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24616", "S#27509", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24617", "S#27510", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24618", "PROBLEM-EXECUTED-TACTICS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24619", "S#27511", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24620", "S#27512", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24622", "PROBLEM-EXECUTED-TACTIC-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24623", "PROBLEM-DISCARDED-TACTIC-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24624", "S#26805", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24621", "S#26804", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24625", "PROBLEM-HAS-TACTIC-OF-TYPE-WITH-STATUS?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24626", "S#27513", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24627", "S#27514", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24628", "S#27515", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24629", "S#27516", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24630", "S#27517", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24631", "S#27518", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24632", "S#27519", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24633", "S#27520", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24634", "S#27521", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24635", "S#27522", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24636", "S#27523", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24637", "S#27524", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24638", "S#27525", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24639", "S#27526", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24640", "S#27527", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24641", "S#26803", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24642", "S#27528", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24643", "PROBLEM-PROOF-COUNT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24644", "S#27529", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24645", "S#27530", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24646", "S#27531", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24647", "S#27532", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24648", "S#27533", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24649", "S#27534", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24546", "S#27535", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24650", "S#27536", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24651", "S#27537", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24652", "S#27291", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24653", "S#27538", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24654", "S#27539", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24655", "S#27540", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24656", "S#27541", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24657", "PROBLEM-MIN-TRANSFORMATION-DEPTH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24658", "S#27542", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24659", "S#27543", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24660", "S#27544", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24661", "S#27545", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24662", "S#27546", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24663", "S#27547", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24664", "S#27548", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24665", "S#27549", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24666", "S#27550", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24667", "S#27551", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24668", "S#27552", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24669", "S#27553", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24670", "S#27554", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24671", "S#27555", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24672", "S#27556", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24673", "S#27557", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24674", "S#27558", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24675", "S#27559", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24676", "S#27560", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24677", "S#27561", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24678", "S#27562", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24679", "S#27563", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24680", "S#26797", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24681", "TACTICALLY-NO-GOOD-PROBLEM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24682", "S#26798", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24683", "S#27564", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24684", "S#27565", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24685", "TACTICALLY-UNEXAMINED-PROBLEM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24686", "S#26796", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24687", "TACTICALLY-POSSIBLE-PROBLEM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24688", "TACTICALLY-PENDING-PROBLEM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24689", "TACTICALLY-FINISHED-PROBLEM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24690", "S#26795", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24691", "S#27566", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24692", "S#27567", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0363", "f24693", "S#27568", 1, 0, false);
        return (SubLObject)module0363.NIL;
    }
    
    public static SubLObject f24695() {
        module0363.$g3129$ = SubLFiles.defconstant("S#27569", (SubLObject)module0363.$ic0$);
        module0363.$g3130$ = SubLFiles.deflexical("S#27570", (SubLObject)((module0363.NIL != Symbols.boundp((SubLObject)module0363.$ic60$)) ? module0363.$g3130$.getGlobalValue() : ConsesLow.list(module0232.f15315())));
        module0363.$g3131$ = SubLFiles.deflexical("S#27571", (SubLObject)module0363.$ic93$);
        module0363.$g3132$ = SubLFiles.defvar("*TRANSFORMATION-DEPTH-COMPUTATION*", (SubLObject)module0363.$ic202$);
        module0363.$g3133$ = SubLFiles.defparameter("S#27572", (SubLObject)module0363.T);
        module0363.$g3134$ = SubLFiles.deflexical("S#27573", (SubLObject)module0363.$ic206$);
        return (SubLObject)module0363.NIL;
    }
    
    public static SubLObject f24696() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0363.$g3129$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0363.$ic8$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0363.$ic9$);
        Structures.def_csetf((SubLObject)module0363.$ic10$, (SubLObject)module0363.$ic11$);
        Structures.def_csetf((SubLObject)module0363.$ic12$, (SubLObject)module0363.$ic13$);
        Structures.def_csetf((SubLObject)module0363.$ic14$, (SubLObject)module0363.$ic15$);
        Structures.def_csetf((SubLObject)module0363.$ic16$, (SubLObject)module0363.$ic17$);
        Structures.def_csetf((SubLObject)module0363.$ic18$, (SubLObject)module0363.$ic19$);
        Structures.def_csetf((SubLObject)module0363.$ic20$, (SubLObject)module0363.$ic21$);
        Structures.def_csetf((SubLObject)module0363.$ic22$, (SubLObject)module0363.$ic23$);
        Structures.def_csetf((SubLObject)module0363.$ic24$, (SubLObject)module0363.$ic25$);
        Structures.def_csetf((SubLObject)module0363.$ic26$, (SubLObject)module0363.$ic27$);
        Structures.def_csetf((SubLObject)module0363.$ic28$, (SubLObject)module0363.$ic29$);
        Structures.def_csetf((SubLObject)module0363.$ic30$, (SubLObject)module0363.$ic31$);
        Equality.identity((SubLObject)module0363.$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0363.$g3129$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0363.$ic48$));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), module0363.$g3129$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0363.$ic52$));
        module0003.f57((SubLObject)module0363.$ic60$);
        module0002.f50((SubLObject)module0363.$ic63$, (SubLObject)module0363.$ic64$);
        module0002.f50((SubLObject)module0363.$ic85$, (SubLObject)module0363.$ic86$);
        module0002.f50((SubLObject)module0363.$ic79$, (SubLObject)module0363.$ic86$);
        module0002.f50((SubLObject)module0363.$ic80$, (SubLObject)module0363.$ic86$);
        module0002.f50((SubLObject)module0363.$ic81$, (SubLObject)module0363.$ic86$);
        module0002.f50((SubLObject)module0363.$ic83$, (SubLObject)module0363.$ic86$);
        module0002.f50((SubLObject)module0363.$ic82$, (SubLObject)module0363.$ic86$);
        module0002.f50((SubLObject)module0363.$ic78$, (SubLObject)module0363.$ic86$);
        module0002.f50((SubLObject)module0363.$ic110$, (SubLObject)module0363.$ic111$);
        module0002.f50((SubLObject)module0363.$ic115$, (SubLObject)module0363.$ic116$);
        module0002.f50((SubLObject)module0363.$ic140$, (SubLObject)module0363.$ic143$);
        module0002.f50((SubLObject)module0363.$ic144$, (SubLObject)module0363.$ic143$);
        return (SubLObject)module0363.NIL;
    }
    
    public void declareFunctions() {
        f24694();
    }
    
    public void initializeVariables() {
        f24695();
    }
    
    public void runTopLevelForms() {
        f24696();
    }
    
    static {
        me = (SubLFile)new module0363();
        module0363.$g3129$ = null;
        module0363.$g3130$ = null;
        module0363.$g3131$ = null;
        module0363.$g3132$ = null;
        module0363.$g3133$ = null;
        module0363.$g3134$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#24274", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("S#26082", "CYC");
        $ic2$ = SubLObjectFactory.makeInteger(212);
        $ic3$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#10593", "CYC"), SubLObjectFactory.makeSymbol("S#3268", "CYC"), SubLObjectFactory.makeSymbol("S#9148", "CYC"), SubLObjectFactory.makeSymbol("S#5846", "CYC"), SubLObjectFactory.makeSymbol("S#27574", "CYC"), SubLObjectFactory.makeSymbol("S#27575", "CYC"), SubLObjectFactory.makeSymbol("S#24180", "CYC"), SubLObjectFactory.makeSymbol("S#27576", "CYC"), SubLObjectFactory.makeSymbol("S#27577", "CYC"), SubLObjectFactory.makeSymbol("S#27578", "CYC"), SubLObjectFactory.makeSymbol("S#3043", "CYC") });
        $ic4$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SUID"), SubLObjectFactory.makeKeyword("STORE"), SubLObjectFactory.makeKeyword("QUERY"), SubLObjectFactory.makeKeyword("STATUS"), SubLObjectFactory.makeKeyword("DEPENDENT-LINKS"), SubLObjectFactory.makeKeyword("ARGUMENT-LINKS"), SubLObjectFactory.makeKeyword("TACTICS"), SubLObjectFactory.makeKeyword("PROOF-BINDINGS-INDEX"), SubLObjectFactory.makeKeyword("ARGUMENT-LINK-BINDINGS-INDEX"), SubLObjectFactory.makeKeyword("BACKCHAIN-REQUIRED"), SubLObjectFactory.makeKeyword("MEMOIZATION-STATE") });
        $ic5$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#27396", "CYC"), SubLObjectFactory.makeSymbol("S#27397", "CYC"), SubLObjectFactory.makeSymbol("S#27398", "CYC"), SubLObjectFactory.makeSymbol("S#27399", "CYC"), SubLObjectFactory.makeSymbol("S#27400", "CYC"), SubLObjectFactory.makeSymbol("S#27401", "CYC"), SubLObjectFactory.makeSymbol("S#27402", "CYC"), SubLObjectFactory.makeSymbol("S#27403", "CYC"), SubLObjectFactory.makeSymbol("S#27404", "CYC"), SubLObjectFactory.makeSymbol("S#27405", "CYC"), SubLObjectFactory.makeSymbol("S#27406", "CYC") });
        $ic6$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#27407", "CYC"), SubLObjectFactory.makeSymbol("S#27408", "CYC"), SubLObjectFactory.makeSymbol("S#27409", "CYC"), SubLObjectFactory.makeSymbol("S#27410", "CYC"), SubLObjectFactory.makeSymbol("S#27411", "CYC"), SubLObjectFactory.makeSymbol("S#27412", "CYC"), SubLObjectFactory.makeSymbol("S#27413", "CYC"), SubLObjectFactory.makeSymbol("S#27414", "CYC"), SubLObjectFactory.makeSymbol("S#27415", "CYC"), SubLObjectFactory.makeSymbol("S#27416", "CYC"), SubLObjectFactory.makeSymbol("S#27417", "CYC") });
        $ic7$ = SubLObjectFactory.makeSymbol("S#27423", "CYC");
        $ic8$ = SubLObjectFactory.makeSymbol("S#27395", "CYC");
        $ic9$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#26082", "CYC"));
        $ic10$ = SubLObjectFactory.makeSymbol("S#27396", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#27407", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#27397", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("S#27408", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("S#27398", "CYC");
        $ic15$ = SubLObjectFactory.makeSymbol("S#27409", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("S#27399", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("S#27410", "CYC");
        $ic18$ = SubLObjectFactory.makeSymbol("S#27400", "CYC");
        $ic19$ = SubLObjectFactory.makeSymbol("S#27411", "CYC");
        $ic20$ = SubLObjectFactory.makeSymbol("S#27401", "CYC");
        $ic21$ = SubLObjectFactory.makeSymbol("S#27412", "CYC");
        $ic22$ = SubLObjectFactory.makeSymbol("S#27402", "CYC");
        $ic23$ = SubLObjectFactory.makeSymbol("S#27413", "CYC");
        $ic24$ = SubLObjectFactory.makeSymbol("S#27403", "CYC");
        $ic25$ = SubLObjectFactory.makeSymbol("S#27414", "CYC");
        $ic26$ = SubLObjectFactory.makeSymbol("S#27404", "CYC");
        $ic27$ = SubLObjectFactory.makeSymbol("S#27415", "CYC");
        $ic28$ = SubLObjectFactory.makeSymbol("S#27405", "CYC");
        $ic29$ = SubLObjectFactory.makeSymbol("S#27416", "CYC");
        $ic30$ = SubLObjectFactory.makeSymbol("S#27406", "CYC");
        $ic31$ = SubLObjectFactory.makeSymbol("S#27417", "CYC");
        $ic32$ = SubLObjectFactory.makeKeyword("SUID");
        $ic33$ = SubLObjectFactory.makeKeyword("STORE");
        $ic34$ = SubLObjectFactory.makeKeyword("QUERY");
        $ic35$ = SubLObjectFactory.makeKeyword("STATUS");
        $ic36$ = SubLObjectFactory.makeKeyword("DEPENDENT-LINKS");
        $ic37$ = SubLObjectFactory.makeKeyword("ARGUMENT-LINKS");
        $ic38$ = SubLObjectFactory.makeKeyword("TACTICS");
        $ic39$ = SubLObjectFactory.makeKeyword("PROOF-BINDINGS-INDEX");
        $ic40$ = SubLObjectFactory.makeKeyword("ARGUMENT-LINK-BINDINGS-INDEX");
        $ic41$ = SubLObjectFactory.makeKeyword("BACKCHAIN-REQUIRED");
        $ic42$ = SubLObjectFactory.makeKeyword("MEMOIZATION-STATE");
        $ic43$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic44$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic45$ = SubLObjectFactory.makeSymbol("S#27418", "CYC");
        $ic46$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic47$ = SubLObjectFactory.makeKeyword("END");
        $ic48$ = SubLObjectFactory.makeSymbol("S#27420", "CYC");
        $ic49$ = SubLObjectFactory.makeKeyword("FREE");
        $ic50$ = SubLObjectFactory.makeString("<Invalid PROBLEM ~s>");
        $ic51$ = SubLObjectFactory.makeString("<~a PROBLEM ~a.~a:~s>");
        $ic52$ = SubLObjectFactory.makeSymbol("S#27331", "CYC");
        $ic53$ = SubLObjectFactory.makeSymbol("S#26782", "CYC");
        $ic54$ = SubLObjectFactory.makeSymbol("S#27302", "CYC");
        $ic55$ = SubLObjectFactory.makeString("Ignore the crazy problems");
        $ic56$ = SubLObjectFactory.makeString("Crazy amount of problems (~a) in store ~a");
        $ic57$ = SubLObjectFactory.makeKeyword("NEW");
        $ic58$ = SubLObjectFactory.makeKeyword("UNDETERMINED");
        $ic59$ = SubLObjectFactory.makeString("problem memoization state");
        $ic60$ = SubLObjectFactory.makeSymbol("S#27570", "CYC");
        $ic61$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#24274", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic62$ = SubLObjectFactory.makeSymbol("S#3165", "CYC");
        $ic63$ = SubLObjectFactory.makeSymbol("S#27426", "CYC");
        $ic64$ = SubLObjectFactory.makeSymbol("S#27425", "CYC");
        $ic65$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#15218", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#15358", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#15217", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#24274", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic66$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $ic67$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic68$ = SubLObjectFactory.makeKeyword("DONE");
        $ic69$ = SubLObjectFactory.makeSymbol("S#27315", "CYC");
        $ic70$ = SubLObjectFactory.makeSymbol("S#26083", "CYC");
        $ic71$ = ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#24182", "CYC"), SubLObjectFactory.makeSymbol("S#24274", "CYC"), SubLObjectFactory.makeSymbol("&KEY"), SubLObjectFactory.makeSymbol("S#127", "CYC"), SubLObjectFactory.makeSymbol("S#5846", "CYC"), SubLObjectFactory.makeSymbol("S#25691", "CYC"), SubLObjectFactory.makeSymbol("S#26474", "CYC"), SubLObjectFactory.makeSymbol("S#14781", "CYC"), SubLObjectFactory.makeSymbol("TYPE"), SubLObjectFactory.makeSymbol("S#26071", "CYC") }), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic72$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"), (SubLObject)SubLObjectFactory.makeKeyword("STATUS"), (SubLObject)SubLObjectFactory.makeKeyword("COMPLETENESS"), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("HL-MODULE"), (SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("PRODUCTIVITY"));
        $ic73$ = SubLObjectFactory.makeKeyword("COMPLETENESS");
        $ic74$ = SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL");
        $ic75$ = SubLObjectFactory.makeKeyword("HL-MODULE");
        $ic76$ = SubLObjectFactory.makeKeyword("TYPE");
        $ic77$ = SubLObjectFactory.makeKeyword("PRODUCTIVITY");
        $ic78$ = SubLObjectFactory.makeSymbol("S#27435", "CYC");
        $ic79$ = SubLObjectFactory.makeSymbol("S#27429", "CYC");
        $ic80$ = SubLObjectFactory.makeSymbol("S#27430", "CYC");
        $ic81$ = SubLObjectFactory.makeSymbol("S#27431", "CYC");
        $ic82$ = SubLObjectFactory.makeSymbol("S#27433", "CYC");
        $ic83$ = SubLObjectFactory.makeSymbol("S#27432", "CYC");
        $ic84$ = SubLObjectFactory.makeSymbol("DO-LIST");
        $ic85$ = SubLObjectFactory.makeSymbol("S#27428", "CYC");
        $ic86$ = SubLObjectFactory.makeSymbol("DO-PROBLEM-TACTICS");
        $ic87$ = SubLObjectFactory.makeSymbol("PWHEN");
        $ic88$ = SubLObjectFactory.makeSymbol("CAND");
        $ic89$ = SubLObjectFactory.makeSymbol("S#26617", "CYC");
        $ic90$ = SubLObjectFactory.makeSymbol("S#26357", "CYC");
        $ic91$ = SubLObjectFactory.makeSymbol("S#26625", "CYC");
        $ic92$ = SubLObjectFactory.makeSymbol("S#14902", "CYC");
        $ic93$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NON-TRANSFORMATION"), SubLObjectFactory.makeKeyword("GENERALIZED-REMOVAL"), SubLObjectFactory.makeKeyword("GENERALIZED-REMOVAL-OR-REWRITE"), SubLObjectFactory.makeKeyword("CONNECTED-CONJUNCTION"), SubLObjectFactory.makeKeyword("CONJUNCTIVE"), SubLObjectFactory.makeKeyword("DISJUNCTIVE"), SubLObjectFactory.makeKeyword("LOGICAL"), SubLObjectFactory.makeKeyword("LOGICAL-CONJUNCTIVE"), SubLObjectFactory.makeKeyword("STRUCTURAL-CONJUNCTIVE"), SubLObjectFactory.makeKeyword("META-STRUCTURAL"), SubLObjectFactory.makeKeyword("CONTENT"), SubLObjectFactory.makeKeyword("UNION"), SubLObjectFactory.makeKeyword("SPLIT"), SubLObjectFactory.makeKeyword("JOIN-ORDERED"), SubLObjectFactory.makeKeyword("JOIN") });
        $ic94$ = SubLObjectFactory.makeSymbol("S#27434", "CYC");
        $ic95$ = SubLObjectFactory.makeKeyword("NON-TRANSFORMATION");
        $ic96$ = SubLObjectFactory.makeKeyword("GENERALIZED-REMOVAL");
        $ic97$ = SubLObjectFactory.makeKeyword("GENERALIZED-REMOVAL-OR-REWRITE");
        $ic98$ = SubLObjectFactory.makeKeyword("CONNECTED-CONJUNCTION");
        $ic99$ = SubLObjectFactory.makeKeyword("CONJUNCTIVE");
        $ic100$ = SubLObjectFactory.makeKeyword("DISJUNCTIVE");
        $ic101$ = SubLObjectFactory.makeKeyword("LOGICAL");
        $ic102$ = SubLObjectFactory.makeKeyword("LOGICAL-CONJUNCTIVE");
        $ic103$ = SubLObjectFactory.makeKeyword("STRUCTURAL-CONJUNCTIVE");
        $ic104$ = SubLObjectFactory.makeKeyword("META-STRUCTURAL");
        $ic105$ = SubLObjectFactory.makeKeyword("CONTENT");
        $ic106$ = SubLObjectFactory.makeKeyword("UNION");
        $ic107$ = SubLObjectFactory.makeKeyword("SPLIT");
        $ic108$ = SubLObjectFactory.makeKeyword("JOIN-ORDERED");
        $ic109$ = SubLObjectFactory.makeKeyword("JOIN");
        $ic110$ = SubLObjectFactory.makeSymbol("S#25403", "CYC");
        $ic111$ = SubLObjectFactory.makeSymbol("S#25369", "CYC");
        $ic112$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#15376", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#24274", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic113$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $ic114$ = SubLObjectFactory.makeSymbol("S#2964", "CYC");
        $ic115$ = SubLObjectFactory.makeSymbol("S#27439", "CYC");
        $ic116$ = SubLObjectFactory.makeSymbol("S#25413", "CYC");
        $ic117$ = SubLObjectFactory.makeSymbol("S#25404", "CYC");
        $ic118$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#15376", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#27579", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#24274", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("S#25406", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic119$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("OPEN?"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $ic120$ = SubLObjectFactory.makeKeyword("OPEN?");
        $ic121$ = SubLObjectFactory.makeUninternedSymbol("US#65EE06E");
        $ic122$ = SubLObjectFactory.makeSymbol("CLET");
        $ic123$ = SubLObjectFactory.makeSymbol("S#25370", "CYC");
        $ic124$ = SubLObjectFactory.makeSymbol("MAPPED-PROBLEM-PROBLEM");
        $ic125$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#27580", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#24274", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic126$ = SubLObjectFactory.makeUninternedSymbol("US#52660DB");
        $ic127$ = SubLObjectFactory.makeSymbol("PROBLEM-LINK-SUPPORTED-PROBLEM");
        $ic128$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#27581", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#24274", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic129$ = SubLObjectFactory.makeUninternedSymbol("US#52660DB");
        $ic130$ = SubLObjectFactory.makeSymbol("S#27582", "CYC");
        $ic131$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#25408", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#25409", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#24274", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic132$ = SubLObjectFactory.makeUninternedSymbol("US#52660DB");
        $ic133$ = SubLObjectFactory.makeSymbol("S#25373", "CYC");
        $ic134$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#25415", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#24274", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#25416", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic135$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROOF-STATUS"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $ic136$ = SubLObjectFactory.makeKeyword("PROOF-STATUS");
        $ic137$ = SubLObjectFactory.makeUninternedSymbol("US#6C8B10F");
        $ic138$ = SubLObjectFactory.makeUninternedSymbol("US#5D5B406");
        $ic139$ = SubLObjectFactory.makeSymbol("S#6410", "CYC");
        $ic140$ = SubLObjectFactory.makeSymbol("S#27446", "CYC");
        $ic141$ = SubLObjectFactory.makeSymbol("IGNORE");
        $ic142$ = SubLObjectFactory.makeUninternedSymbol("US#2E73819");
        $ic143$ = SubLObjectFactory.makeSymbol("S#27445", "CYC");
        $ic144$ = SubLObjectFactory.makeSymbol("S#25418", "CYC");
        $ic145$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#25400", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#24274", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic146$ = SubLObjectFactory.makeUninternedSymbol("US#5A3F28E");
        $ic147$ = SubLObjectFactory.makeSymbol("S#27449", "CYC");
        $ic148$ = SubLObjectFactory.makeSymbol("S#27367", "CYC");
        $ic149$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#25400", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#24274", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic150$ = SubLObjectFactory.makeUninternedSymbol("US#752BA42");
        $ic151$ = SubLObjectFactory.makeUninternedSymbol("US#74A80D2");
        $ic152$ = SubLObjectFactory.makeSymbol("PROBLEM-STORE");
        $ic153$ = SubLObjectFactory.makeSymbol("S#26944", "CYC");
        $ic154$ = SubLObjectFactory.makeSymbol("PROBLEM-RELEVANT-TO-INFERENCE?");
        $ic155$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#24185", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#24274", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic156$ = SubLObjectFactory.makeUninternedSymbol("US#752BA42");
        $ic157$ = SubLObjectFactory.makeUninternedSymbol("US#74A80D2");
        $ic158$ = SubLObjectFactory.makeSymbol("S#26946", "CYC");
        $ic159$ = SubLObjectFactory.makeSymbol("S#27368", "CYC");
        $ic160$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#24185", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#24274", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic161$ = SubLObjectFactory.makeUninternedSymbol("US#4EB23BD");
        $ic162$ = SubLObjectFactory.makeSymbol("S#27448", "CYC");
        $ic163$ = SubLObjectFactory.makeSymbol("S#26955", "CYC");
        $ic164$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#27286", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#24274", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic165$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic166$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TACTICAL"));
        $ic167$ = SubLObjectFactory.makeSymbol("S#27450", "CYC");
        $ic168$ = SubLObjectFactory.makeKeyword("SKIP");
        $ic169$ = SubLObjectFactory.makeSymbol("S#26576", "CYC");
        $ic170$ = SubLObjectFactory.makeString("poking good status ~s into problem ~s");
        $ic171$ = SubLObjectFactory.makeKeyword("NEG");
        $ic172$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC"));
        $ic173$ = SubLObjectFactory.makeKeyword("POS");
        $ic174$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ist"));
        $ic175$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $ic176$ = SubLObjectFactory.makeString("The problem ~S did not have a single-clause query.");
        $ic177$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#26473", "CYC"));
        $ic178$ = SubLObjectFactory.makeString("Found more than one ~a argument link on ~a");
        $ic179$ = SubLObjectFactory.makeString("Expected ~a to have a ~a argument link");
        $ic180$ = SubLObjectFactory.makeSymbol("S#26598", "CYC");
        $ic181$ = SubLObjectFactory.makeSymbol("<");
        $ic182$ = SubLObjectFactory.makeSymbol("S#26813", "CYC");
        $ic183$ = SubLObjectFactory.makeString("~a had more than one dependent link");
        $ic184$ = SubLObjectFactory.makeString("~a had no dependent links");
        $ic185$ = SubLObjectFactory.makeKeyword("ANSWER");
        $ic186$ = SubLObjectFactory.makeKeyword("TRANSFORMATION");
        $ic187$ = SubLObjectFactory.makeSymbol("S#27583", "CYC");
        $ic188$ = SubLObjectFactory.makeSymbol("S#27584", "CYC");
        $ic189$ = SubLObjectFactory.makeSymbol("S#27377", "CYC");
        $ic190$ = SubLObjectFactory.makeKeyword("POSSIBLE");
        $ic191$ = SubLObjectFactory.makeKeyword("EXECUTED");
        $ic192$ = SubLObjectFactory.makeKeyword("DISCARDED");
        $ic193$ = SubLObjectFactory.makeSymbol("S#26613", "CYC");
        $ic194$ = SubLObjectFactory.makeSymbol("S#27373", "CYC");
        $ic195$ = SubLObjectFactory.makeKeyword("REMOVAL");
        $ic196$ = SubLObjectFactory.makeSymbol("S#27520", "CYC");
        $ic197$ = SubLObjectFactory.makeKeyword("REJECTED");
        $ic198$ = SubLObjectFactory.makeKeyword("PROVEN");
        $ic199$ = SubLObjectFactory.makeKeyword("INDESTRUCTIBLE");
        $ic200$ = SubLObjectFactory.makeKeyword("DESTRUCTIBLE");
        $ic201$ = SubLObjectFactory.makeKeyword("UNKNOWN");
        $ic202$ = SubLObjectFactory.makeKeyword("COUNTERINTUITIVE");
        $ic203$ = SubLObjectFactory.makeKeyword("INTUITIVE");
        $ic204$ = SubLObjectFactory.makeSymbol("S#5859", "CYC");
        $ic205$ = SubLObjectFactory.makeSymbol("S#27381", "CYC");
        $ic206$ = SubLObjectFactory.makeInteger(10000);
        $ic207$ = SubLObjectFactory.makeSymbol("S#26790", "CYC");
        $ic208$ = SubLObjectFactory.makeString("Tried to add ~s to ~s, which would result in more than ~s tactics on ~s");
        $ic209$ = SubLObjectFactory.makeSymbol("S#26816", "CYC");
        $ic210$ = SubLObjectFactory.makeSymbol("S#18087", "CYC");
        $ic211$ = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $ic212$ = SubLObjectFactory.makeSymbol("INFERENCE-P");
        $ic213$ = SubLObjectFactory.makeSymbol("S#27391", "CYC");
        $ic214$ = SubLObjectFactory.makeSymbol(">");
        $ic215$ = SubLObjectFactory.makeSymbol("CDR");
    }
    
    public static final class $sX24274_native extends SubLStructNative
    {
        public SubLObject $suid;
        public SubLObject $store;
        public SubLObject $query;
        public SubLObject $status;
        public SubLObject $dependent_links;
        public SubLObject $argument_links;
        public SubLObject $tactics;
        public SubLObject $proof_bindings_index;
        public SubLObject $argument_link_bindings_index;
        public SubLObject $backchain_required;
        public SubLObject $memoization_state;
        private static final SubLStructDeclNative structDecl;
        
        public $sX24274_native() {
            this.$suid = (SubLObject)CommonSymbols.NIL;
            this.$store = (SubLObject)CommonSymbols.NIL;
            this.$query = (SubLObject)CommonSymbols.NIL;
            this.$status = (SubLObject)CommonSymbols.NIL;
            this.$dependent_links = (SubLObject)CommonSymbols.NIL;
            this.$argument_links = (SubLObject)CommonSymbols.NIL;
            this.$tactics = (SubLObject)CommonSymbols.NIL;
            this.$proof_bindings_index = (SubLObject)CommonSymbols.NIL;
            this.$argument_link_bindings_index = (SubLObject)CommonSymbols.NIL;
            this.$backchain_required = (SubLObject)CommonSymbols.NIL;
            this.$memoization_state = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX24274_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$suid;
        }
        
        public SubLObject getField3() {
            return this.$store;
        }
        
        public SubLObject getField4() {
            return this.$query;
        }
        
        public SubLObject getField5() {
            return this.$status;
        }
        
        public SubLObject getField6() {
            return this.$dependent_links;
        }
        
        public SubLObject getField7() {
            return this.$argument_links;
        }
        
        public SubLObject getField8() {
            return this.$tactics;
        }
        
        public SubLObject getField9() {
            return this.$proof_bindings_index;
        }
        
        public SubLObject getField10() {
            return this.$argument_link_bindings_index;
        }
        
        public SubLObject getField11() {
            return this.$backchain_required;
        }
        
        public SubLObject getField12() {
            return this.$memoization_state;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$suid = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$store = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$query = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$status = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$dependent_links = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$argument_links = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$tactics = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$proof_bindings_index = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$argument_link_bindings_index = value;
        }
        
        public SubLObject setField11(final SubLObject value) {
            return this.$backchain_required = value;
        }
        
        public SubLObject setField12(final SubLObject value) {
            return this.$memoization_state = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX24274_native.class, module0363.$ic0$, module0363.$ic1$, module0363.$ic3$, module0363.$ic4$, new String[] { "$suid", "$store", "$query", "$status", "$dependent_links", "$argument_links", "$tactics", "$proof_bindings_index", "$argument_link_bindings_index", "$backchain_required", "$memoization_state" }, module0363.$ic5$, module0363.$ic6$, module0363.$ic7$);
        }
    }
    
    public static final class $f24478$UnaryFunction extends UnaryFunction
    {
        public $f24478$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#26082"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0363.f24478(var3);
        }
    }
    
    public static final class $f24510$UnaryFunction extends UnaryFunction
    {
        public $f24510$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#27331"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0363.f24510(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0363.class
	Total time: 1053 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/