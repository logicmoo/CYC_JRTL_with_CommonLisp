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
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0648 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0648";
    public static final String myFingerPrint = "ef2475bcbc7d9d072a980a2ad5319490c89018321af98a1955033c448dcdd186";
    public static SubLSymbol $g5051$;
    public static SubLSymbol $g5052$;
    public static SubLSymbol $g5053$;
    public static SubLSymbol $g5054$;
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
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLString $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLString $ic54$;
    private static final SubLString $ic55$;
    private static final SubLString $ic56$;
    private static final SubLString $ic57$;
    private static final SubLString $ic58$;
    private static final SubLString $ic59$;
    private static final SubLString $ic60$;
    private static final SubLString $ic61$;
    private static final SubLString $ic62$;
    private static final SubLString $ic63$;
    private static final SubLString $ic64$;
    private static final SubLString $ic65$;
    private static final SubLString $ic66$;
    private static final SubLString $ic67$;
    private static final SubLString $ic68$;
    private static final SubLString $ic69$;
    private static final SubLString $ic70$;
    private static final SubLString $ic71$;
    private static final SubLString $ic72$;
    private static final SubLString $ic73$;
    private static final SubLString $ic74$;
    private static final SubLString $ic75$;
    private static final SubLString $ic76$;
    private static final SubLString $ic77$;
    private static final SubLString $ic78$;
    private static final SubLString $ic79$;
    private static final SubLString $ic80$;
    private static final SubLString $ic81$;
    private static final SubLSymbol $ic82$;
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
    private static final SubLObject $ic104$;
    private static final SubLList $ic105$;
    private static final SubLObject $ic106$;
    private static final SubLList $ic107$;
    private static final SubLObject $ic108$;
    private static final SubLObject $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLObject $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLObject $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLObject $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLList $ic118$;
    private static final SubLList $ic119$;
    private static final SubLList $ic120$;
    private static final SubLList $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLList $ic124$;
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
    private static final SubLString $ic137$;
    private static final SubLString $ic138$;
    private static final SubLString $ic139$;
    private static final SubLString $ic140$;
    private static final SubLObject $ic141$;
    private static final SubLList $ic142$;
    private static final SubLSymbol $ic143$;
    private static final SubLSymbol $ic144$;
    private static final SubLList $ic145$;
    private static final SubLList $ic146$;
    private static final SubLList $ic147$;
    private static final SubLList $ic148$;
    private static final SubLSymbol $ic149$;
    private static final SubLSymbol $ic150$;
    private static final SubLList $ic151$;
    private static final SubLSymbol $ic152$;
    private static final SubLSymbol $ic153$;
    private static final SubLSymbol $ic154$;
    private static final SubLSymbol $ic155$;
    private static final SubLSymbol $ic156$;
    private static final SubLSymbol $ic157$;
    private static final SubLSymbol $ic158$;
    private static final SubLSymbol $ic159$;
    private static final SubLSymbol $ic160$;
    private static final SubLSymbol $ic161$;
    private static final SubLSymbol $ic162$;
    private static final SubLSymbol $ic163$;
    private static final SubLSymbol $ic164$;
    private static final SubLSymbol $ic165$;
    private static final SubLSymbol $ic166$;
    private static final SubLSymbol $ic167$;
    private static final SubLString $ic168$;
    private static final SubLString $ic169$;
    private static final SubLString $ic170$;
    private static final SubLString $ic171$;
    private static final SubLObject $ic172$;
    private static final SubLObject $ic173$;
    private static final SubLList $ic174$;
    private static final SubLObject $ic175$;
    private static final SubLSymbol $ic176$;
    private static final SubLSymbol $ic177$;
    private static final SubLList $ic178$;
    private static final SubLSymbol $ic179$;
    private static final SubLSymbol $ic180$;
    private static final SubLList $ic181$;
    private static final SubLList $ic182$;
    private static final SubLList $ic183$;
    private static final SubLList $ic184$;
    private static final SubLSymbol $ic185$;
    private static final SubLSymbol $ic186$;
    private static final SubLList $ic187$;
    private static final SubLSymbol $ic188$;
    private static final SubLSymbol $ic189$;
    private static final SubLSymbol $ic190$;
    private static final SubLSymbol $ic191$;
    private static final SubLSymbol $ic192$;
    private static final SubLString $ic193$;
    private static final SubLString $ic194$;
    private static final SubLObject $ic195$;
    
    public static SubLObject f39508(final SubLObject var1, final SubLObject var2) {
        f39509(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39510(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX43359_native.class) ? T : NIL);
    }
    
    public static SubLObject f39511(final SubLObject var1) {
        assert NIL != f39510(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f39512(final SubLObject var1) {
        assert NIL != f39510(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f39513(final SubLObject var1) {
        assert NIL != f39510(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f39514(final SubLObject var1) {
        assert NIL != f39510(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f39515(final SubLObject var1) {
        assert NIL != f39510(var1) : var1;
        return var1.getField6();
    }
    
    public static SubLObject f39516(final SubLObject var1) {
        assert NIL != f39510(var1) : var1;
        return var1.getField7();
    }
    
    public static SubLObject f39517(final SubLObject var1) {
        assert NIL != f39510(var1) : var1;
        return var1.getField8();
    }
    
    public static SubLObject f39518(final SubLObject var1) {
        assert NIL != f39510(var1) : var1;
        return var1.getField9();
    }
    
    public static SubLObject f39519(final SubLObject var1) {
        assert NIL != f39510(var1) : var1;
        return var1.getField10();
    }
    
    public static SubLObject f39520(final SubLObject var1) {
        assert NIL != f39510(var1) : var1;
        return var1.getField11();
    }
    
    public static SubLObject f39521(final SubLObject var1) {
        assert NIL != f39510(var1) : var1;
        return var1.getField12();
    }
    
    public static SubLObject f39522(final SubLObject var1) {
        assert NIL != f39510(var1) : var1;
        return var1.getField13();
    }
    
    public static SubLObject f39523(final SubLObject var1) {
        assert NIL != f39510(var1) : var1;
        return var1.getField14();
    }
    
    public static SubLObject f39524(final SubLObject var1, final SubLObject var4) {
        assert NIL != f39510(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f39525(final SubLObject var1, final SubLObject var4) {
        assert NIL != f39510(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f39526(final SubLObject var1, final SubLObject var4) {
        assert NIL != f39510(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f39527(final SubLObject var1, final SubLObject var4) {
        assert NIL != f39510(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f39528(final SubLObject var1, final SubLObject var4) {
        assert NIL != f39510(var1) : var1;
        return var1.setField6(var4);
    }
    
    public static SubLObject f39529(final SubLObject var1, final SubLObject var4) {
        assert NIL != f39510(var1) : var1;
        return var1.setField7(var4);
    }
    
    public static SubLObject f39530(final SubLObject var1, final SubLObject var4) {
        assert NIL != f39510(var1) : var1;
        return var1.setField8(var4);
    }
    
    public static SubLObject f39531(final SubLObject var1, final SubLObject var4) {
        assert NIL != f39510(var1) : var1;
        return var1.setField9(var4);
    }
    
    public static SubLObject f39532(final SubLObject var1, final SubLObject var4) {
        assert NIL != f39510(var1) : var1;
        return var1.setField10(var4);
    }
    
    public static SubLObject f39533(final SubLObject var1, final SubLObject var4) {
        assert NIL != f39510(var1) : var1;
        return var1.setField11(var4);
    }
    
    public static SubLObject f39534(final SubLObject var1, final SubLObject var4) {
        assert NIL != f39510(var1) : var1;
        return var1.setField12(var4);
    }
    
    public static SubLObject f39535(final SubLObject var1, final SubLObject var4) {
        assert NIL != f39510(var1) : var1;
        return var1.setField13(var4);
    }
    
    public static SubLObject f39536(final SubLObject var1, final SubLObject var4) {
        assert NIL != f39510(var1) : var1;
        return var1.setField14(var4);
    }
    
    public static SubLObject f39537(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX43359_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic35$)) {
                f39524(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic36$)) {
                f39525(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic37$)) {
                f39526(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic38$)) {
                f39527(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic39$)) {
                f39528(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic40$)) {
                f39529(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic41$)) {
                f39530(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic42$)) {
                f39531(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic43$)) {
                f39532(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic44$)) {
                f39533(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic45$)) {
                f39534(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic46$)) {
                f39535(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic47$)) {
                f39536(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic48$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f39538(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic49$, (SubLObject)$ic50$, (SubLObject)THIRTEEN_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic35$, f39511(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic36$, f39512(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic37$, f39513(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic38$, f39514(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic39$, f39515(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic40$, f39516(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic41$, f39517(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic42$, f39518(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic43$, f39519(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic44$, f39520(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic45$, f39521(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic46$, f39522(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic47$, f39523(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic52$, (SubLObject)$ic50$, (SubLObject)THIRTEEN_INTEGER);
        return var11;
    }
    
    public static SubLObject f39539(final SubLObject var11, final SubLObject var12) {
        return f39538(var11, var12);
    }
    
    public static SubLObject f39540(final SubLObject var13) {
        return Numbers.plusp(module0077.f5311(f39515(var13)));
    }
    
    public static SubLObject f39541(final SubLObject var13) {
        return Numbers.plusp(module0077.f5311(f39518(var13)));
    }
    
    public static SubLObject f39542(final SubLObject var13) {
        return Numbers.plusp(module0077.f5311(f39521(var13)));
    }
    
    public static SubLObject f39543(final SubLObject var13) {
        return Numbers.plusp(module0077.f5311(f39522(var13)));
    }
    
    public static SubLObject f39544(final SubLObject var13) {
        return (SubLObject)makeBoolean(NIL == module0067.f4882(f39523(var13)));
    }
    
    public static SubLObject f39545(final SubLObject var13) {
        return module0035.sublisp_boolean(f39514(var13));
    }
    
    public static SubLObject f39546(final SubLObject var13) {
        return module0035.sublisp_boolean(f39517(var13));
    }
    
    public static SubLObject f39509(final SubLObject var14, final SubLObject var2, final SubLObject var15) {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        module0038.f2648(var2, var15);
        streams_high.write_string((SubLObject)$ic54$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        print_high.prin1(f39511(var14), var2);
        streams_high.write_string((SubLObject)$ic55$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        print_high.prin1(f39512(var14), var2);
        streams_high.terpri(var2);
        module0038.f2648(var2, var15);
        streams_high.write_string((SubLObject)$ic56$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        print_high.prin1(f39513(var14), var2);
        SubLObject var17 = (SubLObject)NIL;
        streams_high.terpri(var2);
        module0038.f2648(var2, var15);
        streams_high.write_string((SubLObject)$ic57$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != f39540(var14)) {
            var17 = (SubLObject)T;
            streams_high.terpri(var2);
            module0038.f2648(var2, var15);
            streams_high.write_string((SubLObject)$ic58$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            print_high.prin1(f39515(var14), var2);
        }
        if (NIL != f39541(var14)) {
            var17 = (SubLObject)T;
            streams_high.terpri(var2);
            module0038.f2648(var2, var15);
            streams_high.write_string((SubLObject)$ic59$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            print_high.prin1(f39518(var14), var2);
        }
        if (NIL != f39542(var14)) {
            var17 = (SubLObject)T;
            streams_high.terpri(var2);
            module0038.f2648(var2, var15);
            streams_high.write_string((SubLObject)$ic60$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            print_high.prin1(f39521(var14), var2);
        }
        if (NIL != f39543(var14)) {
            var17 = (SubLObject)T;
            streams_high.terpri(var2);
            module0038.f2648(var2, var15);
            streams_high.write_string((SubLObject)$ic61$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            print_high.prin1(f39522(var14), var2);
        }
        if (NIL == var17) {
            streams_high.write_string((SubLObject)$ic62$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        SubLObject var18 = (SubLObject)NIL;
        streams_high.terpri(var2);
        module0038.f2648(var2, var15);
        streams_high.write_string((SubLObject)$ic63$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != f39514(var14)) {
            var18 = (SubLObject)T;
            streams_high.terpri(var2);
            module0038.f2648(var2, var15);
            streams_high.write_string((SubLObject)$ic64$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL != f39516(var14)) {
                streams_high.terpri(var2);
                f39547(f39516(var14), var2, Numbers.add(var15, (SubLObject)THREE_INTEGER));
            }
            SubLObject var19 = f39514(var14);
            SubLObject var20 = (SubLObject)NIL;
            var20 = var19.first();
            while (NIL != var19) {
                if (!var20.eql(f39516(var14))) {
                    streams_high.terpri(var2);
                    f39547(var20, var2, Numbers.add(var15, (SubLObject)THREE_INTEGER));
                }
                var19 = var19.rest();
                var20 = var19.first();
            }
        }
        if (NIL != f39517(var14)) {
            var18 = (SubLObject)T;
            streams_high.terpri(var2);
            module0038.f2648(var2, var15);
            streams_high.write_string((SubLObject)$ic65$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var19 = f39517(var14);
            SubLObject var21 = (SubLObject)NIL;
            var21 = var19.first();
            while (NIL != var19) {
                streams_high.terpri(var2);
                f39548(var21, var2, Numbers.add(var15, (SubLObject)THREE_INTEGER));
                var19 = var19.rest();
                var21 = var19.first();
            }
        }
        if (NIL == var18) {
            streams_high.write_string((SubLObject)$ic66$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (NIL != f39544(var14)) {
            streams_high.terpri(var2);
            module0038.f2648(var2, var15);
            streams_high.write_string((SubLObject)$ic67$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var22;
            for (var22 = module0066.f4838(module0067.f4891(f39523(var14))); NIL == module0066.f4841(var22); var22 = module0066.f4840(var22)) {
                var16.resetMultipleValues();
                final SubLObject var23 = module0066.f4839(var22);
                final SubLObject var24 = var16.secondMultipleValue();
                var16.resetMultipleValues();
                streams_high.terpri(var2);
                module0038.f2648(var2, var15);
                streams_high.write_string((SubLObject)$ic68$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                print_high.prin1(var23, var2);
                streams_high.write_string((SubLObject)$ic69$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                f39549(var24, var2, Numbers.add(var15, (SubLObject)THREE_INTEGER));
            }
            module0066.f4842(var22);
        }
        streams_high.write_string((SubLObject)$ic70$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return var14;
    }
    
    public static SubLObject f39550(final SubLObject var25, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0587.$g4457$.getDynamicValue();
        }
        final SubLThread var26 = SubLProcess.currentSubLThread();
        assert NIL != f39510(var25) : var25;
        final SubLObject var27 = module0587.$g4457$.currentBinding(var26);
        try {
            module0587.$g4457$.bind(var2, var26);
            try {
                final SubLObject var26_27 = module0601.$g4652$.currentBinding(var26);
                final SubLObject var28 = module0601.$g4654$.currentBinding(var26);
                try {
                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var26), module0601.$g4652$.getDynamicValue(var26)), var26);
                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var26), var26);
                    module0601.f36758((SubLObject)$ic71$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                    f39551(var25, var2);
                    f39552(var25, var2);
                    f39553(var25, var2);
                    f39554(var25, var2);
                }
                finally {
                    module0601.$g4654$.rebind(var28, var26);
                    module0601.$g4652$.rebind(var26_27, var26);
                }
            }
            finally {
                final SubLObject var26_28 = Threads.$is_thread_performing_cleanupP$.currentBinding(var26);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var26);
                    module0601.f36746();
                    module0601.f36760((SubLObject)$ic71$);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var26_28, var26);
                }
            }
        }
        finally {
            module0587.$g4457$.rebind(var27, var26);
        }
        return var25;
    }
    
    public static SubLObject f39551(final SubLObject var25, final SubLObject var2) {
        final SubLThread var26 = SubLProcess.currentSubLThread();
        try {
            final SubLObject var27 = module0601.$g4652$.currentBinding(var26);
            final SubLObject var28 = module0601.$g4654$.currentBinding(var26);
            try {
                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var26), module0601.$g4652$.getDynamicValue(var26)), var26);
                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var26), var26);
                module0601.f36758((SubLObject)$ic72$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                if (NIL != f39540(var25)) {
                    try {
                        final SubLObject var26_30 = module0601.$g4652$.currentBinding(var26);
                        final SubLObject var28_31 = module0601.$g4654$.currentBinding(var26);
                        try {
                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var26), module0601.$g4652$.getDynamicValue(var26)), var26);
                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var26), var26);
                            module0601.f36758((SubLObject)$ic73$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                            final SubLObject var29 = module0077.f5333(f39515(var25));
                            SubLObject var30;
                            SubLObject var31;
                            SubLObject var32;
                            SubLObject var26_31;
                            SubLObject var28_32;
                            SubLObject var26_32;
                            for (var30 = module0032.f1741(var29), var31 = (SubLObject)NIL, var31 = module0032.f1742(var30, var29); NIL == module0032.f1744(var30, var31); var31 = module0032.f1743(var31)) {
                                var32 = module0032.f1745(var30, var31);
                                if (NIL != module0032.f1746(var31, var32)) {
                                    try {
                                        var26_31 = module0601.$g4652$.currentBinding(var26);
                                        var28_32 = module0601.$g4654$.currentBinding(var26);
                                        try {
                                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var26), module0601.$g4652$.getDynamicValue(var26)), var26);
                                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var26), var26);
                                            module0601.f36758((SubLObject)$ic74$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                                            module0797.f50965(var32);
                                        }
                                        finally {
                                            module0601.$g4654$.rebind(var28_32, var26);
                                            module0601.$g4652$.rebind(var26_31, var26);
                                        }
                                    }
                                    finally {
                                        var26_32 = Threads.$is_thread_performing_cleanupP$.currentBinding(var26);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var26);
                                            module0601.f36746();
                                            module0601.f36760((SubLObject)$ic74$);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var26_32, var26);
                                        }
                                    }
                                }
                            }
                        }
                        finally {
                            module0601.$g4654$.rebind(var28_31, var26);
                            module0601.$g4652$.rebind(var26_30, var26);
                        }
                    }
                    finally {
                        final SubLObject var26_33 = Threads.$is_thread_performing_cleanupP$.currentBinding(var26);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var26);
                            module0601.f36746();
                            module0601.f36760((SubLObject)$ic73$);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var26_33, var26);
                        }
                    }
                }
                if (NIL != f39541(var25)) {
                    try {
                        final SubLObject var26_34 = module0601.$g4652$.currentBinding(var26);
                        final SubLObject var28_33 = module0601.$g4654$.currentBinding(var26);
                        try {
                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var26), module0601.$g4652$.getDynamicValue(var26)), var26);
                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var26), var26);
                            module0601.f36758((SubLObject)$ic75$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                            final SubLObject var29 = module0077.f5333(f39518(var25));
                            SubLObject var30;
                            SubLObject var31;
                            SubLObject var32;
                            SubLObject var26_35;
                            SubLObject var28_34;
                            SubLObject var26_36;
                            for (var30 = module0032.f1741(var29), var31 = (SubLObject)NIL, var31 = module0032.f1742(var30, var29); NIL == module0032.f1744(var30, var31); var31 = module0032.f1743(var31)) {
                                var32 = module0032.f1745(var30, var31);
                                if (NIL != module0032.f1746(var31, var32)) {
                                    try {
                                        var26_35 = module0601.$g4652$.currentBinding(var26);
                                        var28_34 = module0601.$g4654$.currentBinding(var26);
                                        try {
                                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var26), module0601.$g4652$.getDynamicValue(var26)), var26);
                                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var26), var26);
                                            module0601.f36758((SubLObject)$ic76$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                                            module0797.f50965(var32);
                                        }
                                        finally {
                                            module0601.$g4654$.rebind(var28_34, var26);
                                            module0601.$g4652$.rebind(var26_35, var26);
                                        }
                                    }
                                    finally {
                                        var26_36 = Threads.$is_thread_performing_cleanupP$.currentBinding(var26);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var26);
                                            module0601.f36746();
                                            module0601.f36760((SubLObject)$ic76$);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var26_36, var26);
                                        }
                                    }
                                }
                            }
                        }
                        finally {
                            module0601.$g4654$.rebind(var28_33, var26);
                            module0601.$g4652$.rebind(var26_34, var26);
                        }
                    }
                    finally {
                        final SubLObject var26_37 = Threads.$is_thread_performing_cleanupP$.currentBinding(var26);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var26);
                            module0601.f36746();
                            module0601.f36760((SubLObject)$ic75$);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var26_37, var26);
                        }
                    }
                }
            }
            finally {
                module0601.$g4654$.rebind(var28, var26);
                module0601.$g4652$.rebind(var27, var26);
            }
        }
        finally {
            final SubLObject var33 = Threads.$is_thread_performing_cleanupP$.currentBinding(var26);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var26);
                module0601.f36746();
                module0601.f36760((SubLObject)$ic72$);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var33, var26);
            }
        }
        return var25;
    }
    
    public static SubLObject f39552(final SubLObject var25, final SubLObject var2) {
        final SubLThread var26 = SubLProcess.currentSubLThread();
        try {
            final SubLObject var27 = module0601.$g4652$.currentBinding(var26);
            final SubLObject var28 = module0601.$g4654$.currentBinding(var26);
            try {
                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var26), module0601.$g4652$.getDynamicValue(var26)), var26);
                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var26), var26);
                module0601.f36758((SubLObject)$ic77$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                try {
                    final SubLObject var26_46 = module0601.$g4652$.currentBinding(var26);
                    final SubLObject var28_47 = module0601.$g4654$.currentBinding(var26);
                    try {
                        module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var26), module0601.$g4652$.getDynamicValue(var26)), var26);
                        module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var26), var26);
                        module0601.f36758((SubLObject)$ic78$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                        module0797.f50965(f39511(var25));
                    }
                    finally {
                        module0601.$g4654$.rebind(var28_47, var26);
                        module0601.$g4652$.rebind(var26_46, var26);
                    }
                }
                finally {
                    final SubLObject var26_47 = Threads.$is_thread_performing_cleanupP$.currentBinding(var26);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var26);
                        module0601.f36746();
                        module0601.f36760((SubLObject)$ic78$);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var26_47, var26);
                    }
                }
                if (NIL != f39545(var25)) {
                    try {
                        final SubLObject var26_48 = module0601.$g4652$.currentBinding(var26);
                        final SubLObject var28_48 = module0601.$g4654$.currentBinding(var26);
                        try {
                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var26), module0601.$g4652$.getDynamicValue(var26)), var26);
                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var26), var26);
                            module0601.f36758((SubLObject)$ic79$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                            SubLObject var29 = f39514(var25);
                            SubLObject var30 = (SubLObject)NIL;
                            var30 = var29.first();
                            while (NIL != var29) {
                                try {
                                    final SubLObject var26_49 = module0601.$g4652$.currentBinding(var26);
                                    final SubLObject var28_49 = module0601.$g4654$.currentBinding(var26);
                                    try {
                                        module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var26), module0601.$g4652$.getDynamicValue(var26)), var26);
                                        module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var26), var26);
                                        module0601.f36758((SubLObject)$ic80$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                                        if (var30.eql(f39516(var25))) {
                                            try {
                                                final SubLObject var26_50 = module0601.$g4652$.currentBinding(var26);
                                                final SubLObject var28_50 = module0601.$g4654$.currentBinding(var26);
                                                try {
                                                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var26), module0601.$g4652$.getDynamicValue(var26)), var26);
                                                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var26), var26);
                                                    module0601.f36758((SubLObject)$ic81$, (SubLObject)NIL, (SubLObject)$ic82$, (SubLObject)NIL);
                                                }
                                                finally {
                                                    module0601.$g4654$.rebind(var28_50, var26);
                                                    module0601.$g4652$.rebind(var26_50, var26);
                                                }
                                            }
                                            finally {
                                                final SubLObject var26_51 = Threads.$is_thread_performing_cleanupP$.currentBinding(var26);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var26);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(var26_51, var26);
                                                }
                                            }
                                        }
                                        try {
                                            final SubLObject var26_52 = module0601.$g4652$.currentBinding(var26);
                                            final SubLObject var28_51 = module0601.$g4654$.currentBinding(var26);
                                            try {
                                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var26), module0601.$g4652$.getDynamicValue(var26)), var26);
                                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var26), var26);
                                                module0601.f36758((SubLObject)$ic78$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                                                module0797.f50965(f39555(var30));
                                            }
                                            finally {
                                                module0601.$g4654$.rebind(var28_51, var26);
                                                module0601.$g4652$.rebind(var26_52, var26);
                                            }
                                        }
                                        finally {
                                            final SubLObject var26_53 = Threads.$is_thread_performing_cleanupP$.currentBinding(var26);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var26);
                                                module0601.f36746();
                                                module0601.f36760((SubLObject)$ic78$);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var26_53, var26);
                                            }
                                        }
                                        try {
                                            final SubLObject var26_54 = module0601.$g4652$.currentBinding(var26);
                                            final SubLObject var28_52 = module0601.$g4654$.currentBinding(var26);
                                            try {
                                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var26), module0601.$g4652$.getDynamicValue(var26)), var26);
                                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var26), var26);
                                                module0601.f36758((SubLObject)$ic83$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                                                SubLObject var19_61 = f39556(var30);
                                                SubLObject var31 = (SubLObject)NIL;
                                                var31 = var19_61.first();
                                                while (NIL != var19_61) {
                                                    try {
                                                        final SubLObject var26_55 = module0601.$g4652$.currentBinding(var26);
                                                        final SubLObject var28_53 = module0601.$g4654$.currentBinding(var26);
                                                        try {
                                                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var26), module0601.$g4652$.getDynamicValue(var26)), var26);
                                                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var26), var26);
                                                            module0601.f36758((SubLObject)$ic84$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                                                            try {
                                                                final SubLObject var26_56 = module0601.$g4652$.currentBinding(var26);
                                                                final SubLObject var28_54 = module0601.$g4654$.currentBinding(var26);
                                                                try {
                                                                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var26), module0601.$g4652$.getDynamicValue(var26)), var26);
                                                                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var26), var26);
                                                                    module0601.f36758((SubLObject)$ic78$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                                                                    module0797.f50965(var31);
                                                                }
                                                                finally {
                                                                    module0601.$g4654$.rebind(var28_54, var26);
                                                                    module0601.$g4652$.rebind(var26_56, var26);
                                                                }
                                                            }
                                                            finally {
                                                                final SubLObject var26_57 = Threads.$is_thread_performing_cleanupP$.currentBinding(var26);
                                                                try {
                                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var26);
                                                                    module0601.f36746();
                                                                    module0601.f36760((SubLObject)$ic78$);
                                                                }
                                                                finally {
                                                                    Threads.$is_thread_performing_cleanupP$.rebind(var26_57, var26);
                                                                }
                                                            }
                                                        }
                                                        finally {
                                                            module0601.$g4654$.rebind(var28_53, var26);
                                                            module0601.$g4652$.rebind(var26_55, var26);
                                                        }
                                                    }
                                                    finally {
                                                        final SubLObject var26_58 = Threads.$is_thread_performing_cleanupP$.currentBinding(var26);
                                                        try {
                                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var26);
                                                            module0601.f36746();
                                                            module0601.f36760((SubLObject)$ic84$);
                                                        }
                                                        finally {
                                                            Threads.$is_thread_performing_cleanupP$.rebind(var26_58, var26);
                                                        }
                                                    }
                                                    var19_61 = var19_61.rest();
                                                    var31 = var19_61.first();
                                                }
                                            }
                                            finally {
                                                module0601.$g4654$.rebind(var28_52, var26);
                                                module0601.$g4652$.rebind(var26_54, var26);
                                            }
                                        }
                                        finally {
                                            final SubLObject var26_59 = Threads.$is_thread_performing_cleanupP$.currentBinding(var26);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var26);
                                                module0601.f36746();
                                                module0601.f36760((SubLObject)$ic83$);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var26_59, var26);
                                            }
                                        }
                                    }
                                    finally {
                                        module0601.$g4654$.rebind(var28_49, var26);
                                        module0601.$g4652$.rebind(var26_49, var26);
                                    }
                                }
                                finally {
                                    final SubLObject var26_60 = Threads.$is_thread_performing_cleanupP$.currentBinding(var26);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var26);
                                        module0601.f36746();
                                        module0601.f36760((SubLObject)$ic80$);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var26_60, var26);
                                    }
                                }
                                var29 = var29.rest();
                                var30 = var29.first();
                            }
                        }
                        finally {
                            module0601.$g4654$.rebind(var28_48, var26);
                            module0601.$g4652$.rebind(var26_48, var26);
                        }
                    }
                    finally {
                        final SubLObject var26_61 = Threads.$is_thread_performing_cleanupP$.currentBinding(var26);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var26);
                            module0601.f36746();
                            module0601.f36760((SubLObject)$ic79$);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var26_61, var26);
                        }
                    }
                }
                if (NIL != f39546(var25)) {
                    try {
                        final SubLObject var26_62 = module0601.$g4652$.currentBinding(var26);
                        final SubLObject var28_55 = module0601.$g4654$.currentBinding(var26);
                        try {
                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var26), module0601.$g4652$.getDynamicValue(var26)), var26);
                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var26), var26);
                            module0601.f36758((SubLObject)$ic85$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                            SubLObject var29 = f39517(var25);
                            SubLObject var32 = (SubLObject)NIL;
                            var32 = var29.first();
                            while (NIL != var29) {
                                try {
                                    final SubLObject var26_63 = module0601.$g4652$.currentBinding(var26);
                                    final SubLObject var28_56 = module0601.$g4654$.currentBinding(var26);
                                    try {
                                        module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var26), module0601.$g4652$.getDynamicValue(var26)), var26);
                                        module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var26), var26);
                                        module0601.f36758((SubLObject)$ic86$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                                        try {
                                            final SubLObject var26_64 = module0601.$g4652$.currentBinding(var26);
                                            final SubLObject var28_57 = module0601.$g4654$.currentBinding(var26);
                                            try {
                                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var26), module0601.$g4652$.getDynamicValue(var26)), var26);
                                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var26), var26);
                                                module0601.f36758((SubLObject)$ic78$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                                                module0797.f50965(f39557(var32));
                                            }
                                            finally {
                                                module0601.$g4654$.rebind(var28_57, var26);
                                                module0601.$g4652$.rebind(var26_64, var26);
                                            }
                                        }
                                        finally {
                                            final SubLObject var26_65 = Threads.$is_thread_performing_cleanupP$.currentBinding(var26);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var26);
                                                module0601.f36746();
                                                module0601.f36760((SubLObject)$ic78$);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var26_65, var26);
                                            }
                                        }
                                        try {
                                            final SubLObject var26_66 = module0601.$g4652$.currentBinding(var26);
                                            final SubLObject var28_58 = module0601.$g4654$.currentBinding(var26);
                                            try {
                                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var26), module0601.$g4652$.getDynamicValue(var26)), var26);
                                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var26), var26);
                                                module0601.f36758((SubLObject)$ic83$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                                                SubLObject var19_62 = f39558(var32);
                                                SubLObject var31 = (SubLObject)NIL;
                                                var31 = var19_62.first();
                                                while (NIL != var19_62) {
                                                    try {
                                                        final SubLObject var26_67 = module0601.$g4652$.currentBinding(var26);
                                                        final SubLObject var28_59 = module0601.$g4654$.currentBinding(var26);
                                                        try {
                                                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var26), module0601.$g4652$.getDynamicValue(var26)), var26);
                                                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var26), var26);
                                                            module0601.f36758((SubLObject)$ic84$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                                                            try {
                                                                final SubLObject var26_68 = module0601.$g4652$.currentBinding(var26);
                                                                final SubLObject var28_60 = module0601.$g4654$.currentBinding(var26);
                                                                try {
                                                                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var26), module0601.$g4652$.getDynamicValue(var26)), var26);
                                                                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var26), var26);
                                                                    module0601.f36758((SubLObject)$ic78$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                                                                    module0797.f50965(var31);
                                                                }
                                                                finally {
                                                                    module0601.$g4654$.rebind(var28_60, var26);
                                                                    module0601.$g4652$.rebind(var26_68, var26);
                                                                }
                                                            }
                                                            finally {
                                                                final SubLObject var26_69 = Threads.$is_thread_performing_cleanupP$.currentBinding(var26);
                                                                try {
                                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var26);
                                                                    module0601.f36746();
                                                                    module0601.f36760((SubLObject)$ic78$);
                                                                }
                                                                finally {
                                                                    Threads.$is_thread_performing_cleanupP$.rebind(var26_69, var26);
                                                                }
                                                            }
                                                        }
                                                        finally {
                                                            module0601.$g4654$.rebind(var28_59, var26);
                                                            module0601.$g4652$.rebind(var26_67, var26);
                                                        }
                                                    }
                                                    finally {
                                                        final SubLObject var26_70 = Threads.$is_thread_performing_cleanupP$.currentBinding(var26);
                                                        try {
                                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var26);
                                                            module0601.f36746();
                                                            module0601.f36760((SubLObject)$ic84$);
                                                        }
                                                        finally {
                                                            Threads.$is_thread_performing_cleanupP$.rebind(var26_70, var26);
                                                        }
                                                    }
                                                    var19_62 = var19_62.rest();
                                                    var31 = var19_62.first();
                                                }
                                            }
                                            finally {
                                                module0601.$g4654$.rebind(var28_58, var26);
                                                module0601.$g4652$.rebind(var26_66, var26);
                                            }
                                        }
                                        finally {
                                            final SubLObject var26_71 = Threads.$is_thread_performing_cleanupP$.currentBinding(var26);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var26);
                                                module0601.f36746();
                                                module0601.f36760((SubLObject)$ic83$);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var26_71, var26);
                                            }
                                        }
                                        try {
                                            final SubLObject var26_72 = module0601.$g4652$.currentBinding(var26);
                                            final SubLObject var28_61 = module0601.$g4654$.currentBinding(var26);
                                            try {
                                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var26), module0601.$g4652$.getDynamicValue(var26)), var26);
                                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var26), var26);
                                                module0601.f36758((SubLObject)$ic87$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                                                final SubLObject var33 = module0077.f5333(f39559(var32));
                                                SubLObject var34;
                                                SubLObject var35;
                                                SubLObject var36;
                                                SubLObject var26_73;
                                                SubLObject var28_62;
                                                SubLObject var26_74;
                                                SubLObject var28_63;
                                                SubLObject var26_75;
                                                SubLObject var26_76;
                                                for (var34 = module0032.f1741(var33), var35 = (SubLObject)NIL, var35 = module0032.f1742(var34, var33); NIL == module0032.f1744(var34, var35); var35 = module0032.f1743(var35)) {
                                                    var36 = module0032.f1745(var34, var35);
                                                    if (NIL != module0032.f1746(var35, var36)) {
                                                        try {
                                                            var26_73 = module0601.$g4652$.currentBinding(var26);
                                                            var28_62 = module0601.$g4654$.currentBinding(var26);
                                                            try {
                                                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var26), module0601.$g4652$.getDynamicValue(var26)), var26);
                                                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var26), var26);
                                                                module0601.f36758((SubLObject)$ic88$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                                                                try {
                                                                    var26_74 = module0601.$g4652$.currentBinding(var26);
                                                                    var28_63 = module0601.$g4654$.currentBinding(var26);
                                                                    try {
                                                                        module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var26), module0601.$g4652$.getDynamicValue(var26)), var26);
                                                                        module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var26), var26);
                                                                        module0601.f36758((SubLObject)$ic78$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                                                                        module0797.f50965(var36);
                                                                    }
                                                                    finally {
                                                                        module0601.$g4654$.rebind(var28_63, var26);
                                                                        module0601.$g4652$.rebind(var26_74, var26);
                                                                    }
                                                                }
                                                                finally {
                                                                    var26_75 = Threads.$is_thread_performing_cleanupP$.currentBinding(var26);
                                                                    try {
                                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var26);
                                                                        module0601.f36746();
                                                                        module0601.f36760((SubLObject)$ic78$);
                                                                    }
                                                                    finally {
                                                                        Threads.$is_thread_performing_cleanupP$.rebind(var26_75, var26);
                                                                    }
                                                                }
                                                            }
                                                            finally {
                                                                module0601.$g4654$.rebind(var28_62, var26);
                                                                module0601.$g4652$.rebind(var26_73, var26);
                                                            }
                                                        }
                                                        finally {
                                                            var26_76 = Threads.$is_thread_performing_cleanupP$.currentBinding(var26);
                                                            try {
                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var26);
                                                                module0601.f36746();
                                                                module0601.f36760((SubLObject)$ic88$);
                                                            }
                                                            finally {
                                                                Threads.$is_thread_performing_cleanupP$.rebind(var26_76, var26);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            finally {
                                                module0601.$g4654$.rebind(var28_61, var26);
                                                module0601.$g4652$.rebind(var26_72, var26);
                                            }
                                        }
                                        finally {
                                            final SubLObject var26_77 = Threads.$is_thread_performing_cleanupP$.currentBinding(var26);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var26);
                                                module0601.f36746();
                                                module0601.f36760((SubLObject)$ic87$);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var26_77, var26);
                                            }
                                        }
                                        try {
                                            final SubLObject var26_78 = module0601.$g4652$.currentBinding(var26);
                                            final SubLObject var28_64 = module0601.$g4654$.currentBinding(var26);
                                            try {
                                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var26), module0601.$g4652$.getDynamicValue(var26)), var26);
                                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var26), var26);
                                                module0601.f36758((SubLObject)$ic89$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                                                final SubLObject var33 = module0077.f5333(f39560(var32));
                                                SubLObject var34;
                                                SubLObject var35;
                                                SubLObject var37;
                                                SubLObject var26_79;
                                                SubLObject var28_65;
                                                SubLObject var26_80;
                                                SubLObject var28_66;
                                                SubLObject var26_81;
                                                SubLObject var26_82;
                                                for (var34 = module0032.f1741(var33), var35 = (SubLObject)NIL, var35 = module0032.f1742(var34, var33); NIL == module0032.f1744(var34, var35); var35 = module0032.f1743(var35)) {
                                                    var37 = module0032.f1745(var34, var35);
                                                    if (NIL != module0032.f1746(var35, var37)) {
                                                        try {
                                                            var26_79 = module0601.$g4652$.currentBinding(var26);
                                                            var28_65 = module0601.$g4654$.currentBinding(var26);
                                                            try {
                                                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var26), module0601.$g4652$.getDynamicValue(var26)), var26);
                                                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var26), var26);
                                                                module0601.f36758((SubLObject)$ic90$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                                                                try {
                                                                    var26_80 = module0601.$g4652$.currentBinding(var26);
                                                                    var28_66 = module0601.$g4654$.currentBinding(var26);
                                                                    try {
                                                                        module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var26), module0601.$g4652$.getDynamicValue(var26)), var26);
                                                                        module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var26), var26);
                                                                        module0601.f36758((SubLObject)$ic78$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                                                                        module0797.f50965(var37);
                                                                    }
                                                                    finally {
                                                                        module0601.$g4654$.rebind(var28_66, var26);
                                                                        module0601.$g4652$.rebind(var26_80, var26);
                                                                    }
                                                                }
                                                                finally {
                                                                    var26_81 = Threads.$is_thread_performing_cleanupP$.currentBinding(var26);
                                                                    try {
                                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var26);
                                                                        module0601.f36746();
                                                                        module0601.f36760((SubLObject)$ic78$);
                                                                    }
                                                                    finally {
                                                                        Threads.$is_thread_performing_cleanupP$.rebind(var26_81, var26);
                                                                    }
                                                                }
                                                            }
                                                            finally {
                                                                module0601.$g4654$.rebind(var28_65, var26);
                                                                module0601.$g4652$.rebind(var26_79, var26);
                                                            }
                                                        }
                                                        finally {
                                                            var26_82 = Threads.$is_thread_performing_cleanupP$.currentBinding(var26);
                                                            try {
                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var26);
                                                                module0601.f36746();
                                                                module0601.f36760((SubLObject)$ic90$);
                                                            }
                                                            finally {
                                                                Threads.$is_thread_performing_cleanupP$.rebind(var26_82, var26);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            finally {
                                                module0601.$g4654$.rebind(var28_64, var26);
                                                module0601.$g4652$.rebind(var26_78, var26);
                                            }
                                        }
                                        finally {
                                            final SubLObject var26_83 = Threads.$is_thread_performing_cleanupP$.currentBinding(var26);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var26);
                                                module0601.f36746();
                                                module0601.f36760((SubLObject)$ic89$);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var26_83, var26);
                                            }
                                        }
                                    }
                                    finally {
                                        module0601.$g4654$.rebind(var28_56, var26);
                                        module0601.$g4652$.rebind(var26_63, var26);
                                    }
                                }
                                finally {
                                    final SubLObject var26_84 = Threads.$is_thread_performing_cleanupP$.currentBinding(var26);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var26);
                                        module0601.f36746();
                                        module0601.f36760((SubLObject)$ic86$);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var26_84, var26);
                                    }
                                }
                                var29 = var29.rest();
                                var32 = var29.first();
                            }
                        }
                        finally {
                            module0601.$g4654$.rebind(var28_55, var26);
                            module0601.$g4652$.rebind(var26_62, var26);
                        }
                    }
                    finally {
                        final SubLObject var26_85 = Threads.$is_thread_performing_cleanupP$.currentBinding(var26);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var26);
                            module0601.f36746();
                            module0601.f36760((SubLObject)$ic85$);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var26_85, var26);
                        }
                    }
                }
            }
            finally {
                module0601.$g4654$.rebind(var28, var26);
                module0601.$g4652$.rebind(var27, var26);
            }
        }
        finally {
            final SubLObject var38 = Threads.$is_thread_performing_cleanupP$.currentBinding(var26);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var26);
                module0601.f36746();
                module0601.f36760((SubLObject)$ic77$);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var38, var26);
            }
        }
        return var25;
    }
    
    public static SubLObject f39553(final SubLObject var25, final SubLObject var2) {
        final SubLThread var26 = SubLProcess.currentSubLThread();
        try {
            final SubLObject var27 = module0601.$g4652$.currentBinding(var26);
            final SubLObject var28 = module0601.$g4654$.currentBinding(var26);
            try {
                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var26), module0601.$g4652$.getDynamicValue(var26)), var26);
                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var26), var26);
                module0601.f36758((SubLObject)$ic91$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                if (NIL != f39544(var25)) {
                    final SubLObject var29 = f39523(var25);
                    if (NIL != f39545(var25)) {
                        try {
                            final SubLObject var26_111 = module0601.$g4652$.currentBinding(var26);
                            final SubLObject var28_112 = module0601.$g4654$.currentBinding(var26);
                            try {
                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var26), module0601.$g4652$.getDynamicValue(var26)), var26);
                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var26), var26);
                                module0601.f36758((SubLObject)$ic92$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                                SubLObject var30 = f39514(var25);
                                SubLObject var31 = (SubLObject)NIL;
                                var31 = var30.first();
                                while (NIL != var30) {
                                    final SubLObject var32 = module0067.f4884(var29, f39555(var31), (SubLObject)UNPROVIDED);
                                    try {
                                        final SubLObject var26_112 = module0601.$g4652$.currentBinding(var26);
                                        final SubLObject var28_113 = module0601.$g4654$.currentBinding(var26);
                                        try {
                                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var26), module0601.$g4652$.getDynamicValue(var26)), var26);
                                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var26), var26);
                                            module0601.f36758((SubLObject)$ic93$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                                            try {
                                                final SubLObject var26_113 = module0601.$g4652$.currentBinding(var26);
                                                final SubLObject var28_114 = module0601.$g4654$.currentBinding(var26);
                                                try {
                                                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var26), module0601.$g4652$.getDynamicValue(var26)), var26);
                                                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var26), var26);
                                                    module0601.f36758((SubLObject)$ic78$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                                                    module0797.f50965(f39555(var31));
                                                }
                                                finally {
                                                    module0601.$g4654$.rebind(var28_114, var26);
                                                    module0601.$g4652$.rebind(var26_113, var26);
                                                }
                                            }
                                            finally {
                                                final SubLObject var26_114 = Threads.$is_thread_performing_cleanupP$.currentBinding(var26);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var26);
                                                    module0601.f36746();
                                                    module0601.f36760((SubLObject)$ic78$);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(var26_114, var26);
                                                }
                                            }
                                            f39561(var32, var2);
                                        }
                                        finally {
                                            module0601.$g4654$.rebind(var28_113, var26);
                                            module0601.$g4652$.rebind(var26_112, var26);
                                        }
                                    }
                                    finally {
                                        final SubLObject var26_115 = Threads.$is_thread_performing_cleanupP$.currentBinding(var26);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var26);
                                            module0601.f36746();
                                            module0601.f36760((SubLObject)$ic93$);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var26_115, var26);
                                        }
                                    }
                                    var30 = var30.rest();
                                    var31 = var30.first();
                                }
                            }
                            finally {
                                module0601.$g4654$.rebind(var28_112, var26);
                                module0601.$g4652$.rebind(var26_111, var26);
                            }
                        }
                        finally {
                            final SubLObject var26_116 = Threads.$is_thread_performing_cleanupP$.currentBinding(var26);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var26);
                                module0601.f36746();
                                module0601.f36760((SubLObject)$ic92$);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var26_116, var26);
                            }
                        }
                    }
                    if (NIL != f39546(var25)) {
                        try {
                            final SubLObject var26_117 = module0601.$g4652$.currentBinding(var26);
                            final SubLObject var28_115 = module0601.$g4654$.currentBinding(var26);
                            try {
                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var26), module0601.$g4652$.getDynamicValue(var26)), var26);
                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var26), var26);
                                module0601.f36758((SubLObject)$ic94$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                                SubLObject var30 = f39517(var25);
                                SubLObject var33 = (SubLObject)NIL;
                                var33 = var30.first();
                                while (NIL != var30) {
                                    try {
                                        final SubLObject var26_118 = module0601.$g4652$.currentBinding(var26);
                                        final SubLObject var28_116 = module0601.$g4654$.currentBinding(var26);
                                        try {
                                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var26), module0601.$g4652$.getDynamicValue(var26)), var26);
                                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var26), var26);
                                            module0601.f36758((SubLObject)$ic95$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                                            try {
                                                final SubLObject var26_119 = module0601.$g4652$.currentBinding(var26);
                                                final SubLObject var28_117 = module0601.$g4654$.currentBinding(var26);
                                                try {
                                                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var26), module0601.$g4652$.getDynamicValue(var26)), var26);
                                                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var26), var26);
                                                    module0601.f36758((SubLObject)$ic78$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                                                    module0797.f50965(f39557(var33));
                                                }
                                                finally {
                                                    module0601.$g4654$.rebind(var28_117, var26);
                                                    module0601.$g4652$.rebind(var26_119, var26);
                                                }
                                            }
                                            finally {
                                                final SubLObject var26_120 = Threads.$is_thread_performing_cleanupP$.currentBinding(var26);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var26);
                                                    module0601.f36746();
                                                    module0601.f36760((SubLObject)$ic78$);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(var26_120, var26);
                                                }
                                            }
                                            final SubLObject var34 = module0067.f4884(var29, f39557(var33), (SubLObject)UNPROVIDED);
                                            f39561(var34, var2);
                                        }
                                        finally {
                                            module0601.$g4654$.rebind(var28_116, var26);
                                            module0601.$g4652$.rebind(var26_118, var26);
                                        }
                                    }
                                    finally {
                                        final SubLObject var26_121 = Threads.$is_thread_performing_cleanupP$.currentBinding(var26);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var26);
                                            module0601.f36746();
                                            module0601.f36760((SubLObject)$ic95$);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var26_121, var26);
                                        }
                                    }
                                    var30 = var30.rest();
                                    var33 = var30.first();
                                }
                            }
                            finally {
                                module0601.$g4654$.rebind(var28_115, var26);
                                module0601.$g4652$.rebind(var26_117, var26);
                            }
                        }
                        finally {
                            final SubLObject var26_122 = Threads.$is_thread_performing_cleanupP$.currentBinding(var26);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var26);
                                module0601.f36746();
                                module0601.f36760((SubLObject)$ic94$);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var26_122, var26);
                            }
                        }
                    }
                }
            }
            finally {
                module0601.$g4654$.rebind(var28, var26);
                module0601.$g4652$.rebind(var27, var26);
            }
        }
        finally {
            final SubLObject var35 = Threads.$is_thread_performing_cleanupP$.currentBinding(var26);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var26);
                module0601.f36746();
                module0601.f36760((SubLObject)$ic91$);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var35, var26);
            }
        }
        return var25;
    }
    
    public static SubLObject f39561(final SubLObject var24, final SubLObject var2) {
        final SubLThread var25 = SubLProcess.currentSubLThread();
        try {
            final SubLObject var26 = module0601.$g4652$.currentBinding(var25);
            final SubLObject var27 = module0601.$g4654$.currentBinding(var25);
            try {
                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var25), module0601.$g4652$.getDynamicValue(var25)), var25);
                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var25), var25);
                module0601.f36758((SubLObject)$ic96$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                if (NIL != f39562(var24)) {
                    try {
                        final SubLObject var26_129 = module0601.$g4652$.currentBinding(var25);
                        final SubLObject var28_130 = module0601.$g4654$.currentBinding(var25);
                        try {
                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var25), module0601.$g4652$.getDynamicValue(var25)), var25);
                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var25), var25);
                            module0601.f36758((SubLObject)$ic97$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                            module0797.f50965(f39562(var24));
                        }
                        finally {
                            module0601.$g4654$.rebind(var28_130, var25);
                            module0601.$g4652$.rebind(var26_129, var25);
                        }
                    }
                    finally {
                        final SubLObject var26_130 = Threads.$is_thread_performing_cleanupP$.currentBinding(var25);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var25);
                            module0601.f36746();
                            module0601.f36760((SubLObject)$ic97$);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var26_130, var25);
                        }
                    }
                }
            }
            finally {
                module0601.$g4654$.rebind(var27, var25);
                module0601.$g4652$.rebind(var26, var25);
            }
        }
        finally {
            final SubLObject var28 = Threads.$is_thread_performing_cleanupP$.currentBinding(var25);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var25);
                module0601.f36746();
                module0601.f36760((SubLObject)$ic96$);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var28, var25);
            }
        }
        return var24;
    }
    
    public static SubLObject f39554(final SubLObject var25, final SubLObject var2) {
        final SubLThread var26 = SubLProcess.currentSubLThread();
        try {
            final SubLObject var27 = module0601.$g4652$.currentBinding(var26);
            final SubLObject var28 = module0601.$g4654$.currentBinding(var26);
            try {
                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var26), module0601.$g4652$.getDynamicValue(var26)), var26);
                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var26), var26);
                module0601.f36758((SubLObject)$ic98$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                if (NIL != f39545(var25)) {
                    try {
                        final SubLObject var26_132 = module0601.$g4652$.currentBinding(var26);
                        final SubLObject var28_133 = module0601.$g4654$.currentBinding(var26);
                        try {
                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var26), module0601.$g4652$.getDynamicValue(var26)), var26);
                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var26), var26);
                            module0601.f36758((SubLObject)$ic99$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                            SubLObject var29 = f39514(var25);
                            SubLObject var30 = (SubLObject)NIL;
                            var30 = var29.first();
                            while (NIL != var29) {
                                if (NIL != f39563(var30)) {
                                    try {
                                        final SubLObject var26_133 = module0601.$g4652$.currentBinding(var26);
                                        final SubLObject var28_134 = module0601.$g4654$.currentBinding(var26);
                                        try {
                                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var26), module0601.$g4652$.getDynamicValue(var26)), var26);
                                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var26), var26);
                                            module0601.f36758((SubLObject)$ic100$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                                            try {
                                                final SubLObject var26_134 = module0601.$g4652$.currentBinding(var26);
                                                final SubLObject var28_135 = module0601.$g4654$.currentBinding(var26);
                                                try {
                                                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var26), module0601.$g4652$.getDynamicValue(var26)), var26);
                                                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var26), var26);
                                                    module0601.f36758((SubLObject)$ic78$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                                                    module0797.f50965(f39555(var30));
                                                }
                                                finally {
                                                    module0601.$g4654$.rebind(var28_135, var26);
                                                    module0601.$g4652$.rebind(var26_134, var26);
                                                }
                                            }
                                            finally {
                                                final SubLObject var26_135 = Threads.$is_thread_performing_cleanupP$.currentBinding(var26);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var26);
                                                    module0601.f36746();
                                                    module0601.f36760((SubLObject)$ic78$);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(var26_135, var26);
                                                }
                                            }
                                            try {
                                                final SubLObject var26_136 = module0601.$g4652$.currentBinding(var26);
                                                final SubLObject var28_136 = module0601.$g4654$.currentBinding(var26);
                                                try {
                                                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var26), module0601.$g4652$.getDynamicValue(var26)), var26);
                                                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var26), var26);
                                                    module0601.f36758((SubLObject)$ic101$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                                                    module0797.f50965(f39563(var30));
                                                }
                                                finally {
                                                    module0601.$g4654$.rebind(var28_136, var26);
                                                    module0601.$g4652$.rebind(var26_136, var26);
                                                }
                                            }
                                            finally {
                                                final SubLObject var26_137 = Threads.$is_thread_performing_cleanupP$.currentBinding(var26);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var26);
                                                    module0601.f36746();
                                                    module0601.f36760((SubLObject)$ic101$);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(var26_137, var26);
                                                }
                                            }
                                        }
                                        finally {
                                            module0601.$g4654$.rebind(var28_134, var26);
                                            module0601.$g4652$.rebind(var26_133, var26);
                                        }
                                    }
                                    finally {
                                        final SubLObject var26_138 = Threads.$is_thread_performing_cleanupP$.currentBinding(var26);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var26);
                                            module0601.f36746();
                                            module0601.f36760((SubLObject)$ic100$);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var26_138, var26);
                                        }
                                    }
                                }
                                var29 = var29.rest();
                                var30 = var29.first();
                            }
                        }
                        finally {
                            module0601.$g4654$.rebind(var28_133, var26);
                            module0601.$g4652$.rebind(var26_132, var26);
                        }
                    }
                    finally {
                        final SubLObject var26_139 = Threads.$is_thread_performing_cleanupP$.currentBinding(var26);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var26);
                            module0601.f36746();
                            module0601.f36760((SubLObject)$ic99$);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var26_139, var26);
                        }
                    }
                }
                if (NIL != f39546(var25)) {
                    try {
                        final SubLObject var26_140 = module0601.$g4652$.currentBinding(var26);
                        final SubLObject var28_137 = module0601.$g4654$.currentBinding(var26);
                        try {
                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var26), module0601.$g4652$.getDynamicValue(var26)), var26);
                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var26), var26);
                            module0601.f36758((SubLObject)$ic102$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                            SubLObject var29 = f39517(var25);
                            SubLObject var31 = (SubLObject)NIL;
                            var31 = var29.first();
                            while (NIL != var29) {
                                if (NIL != f39564(var31)) {
                                    try {
                                        final SubLObject var26_141 = module0601.$g4652$.currentBinding(var26);
                                        final SubLObject var28_138 = module0601.$g4654$.currentBinding(var26);
                                        try {
                                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var26), module0601.$g4652$.getDynamicValue(var26)), var26);
                                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var26), var26);
                                            module0601.f36758((SubLObject)$ic103$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                                            try {
                                                final SubLObject var26_142 = module0601.$g4652$.currentBinding(var26);
                                                final SubLObject var28_139 = module0601.$g4654$.currentBinding(var26);
                                                try {
                                                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var26), module0601.$g4652$.getDynamicValue(var26)), var26);
                                                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var26), var26);
                                                    module0601.f36758((SubLObject)$ic78$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                                                    module0797.f50965(f39557(var31));
                                                }
                                                finally {
                                                    module0601.$g4654$.rebind(var28_139, var26);
                                                    module0601.$g4652$.rebind(var26_142, var26);
                                                }
                                            }
                                            finally {
                                                final SubLObject var26_143 = Threads.$is_thread_performing_cleanupP$.currentBinding(var26);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var26);
                                                    module0601.f36746();
                                                    module0601.f36760((SubLObject)$ic78$);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(var26_143, var26);
                                                }
                                            }
                                            try {
                                                final SubLObject var26_144 = module0601.$g4652$.currentBinding(var26);
                                                final SubLObject var28_140 = module0601.$g4654$.currentBinding(var26);
                                                try {
                                                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var26), module0601.$g4652$.getDynamicValue(var26)), var26);
                                                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var26), var26);
                                                    module0601.f36758((SubLObject)$ic101$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                                                    module0797.f50965(f39564(var31));
                                                }
                                                finally {
                                                    module0601.$g4654$.rebind(var28_140, var26);
                                                    module0601.$g4652$.rebind(var26_144, var26);
                                                }
                                            }
                                            finally {
                                                final SubLObject var26_145 = Threads.$is_thread_performing_cleanupP$.currentBinding(var26);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var26);
                                                    module0601.f36746();
                                                    module0601.f36760((SubLObject)$ic101$);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(var26_145, var26);
                                                }
                                            }
                                        }
                                        finally {
                                            module0601.$g4654$.rebind(var28_138, var26);
                                            module0601.$g4652$.rebind(var26_141, var26);
                                        }
                                    }
                                    finally {
                                        final SubLObject var26_146 = Threads.$is_thread_performing_cleanupP$.currentBinding(var26);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var26);
                                            module0601.f36746();
                                            module0601.f36760((SubLObject)$ic103$);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var26_146, var26);
                                        }
                                    }
                                }
                                var29 = var29.rest();
                                var31 = var29.first();
                            }
                        }
                        finally {
                            module0601.$g4654$.rebind(var28_137, var26);
                            module0601.$g4652$.rebind(var26_140, var26);
                        }
                    }
                    finally {
                        final SubLObject var26_147 = Threads.$is_thread_performing_cleanupP$.currentBinding(var26);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var26);
                            module0601.f36746();
                            module0601.f36760((SubLObject)$ic102$);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var26_147, var26);
                        }
                    }
                }
            }
            finally {
                module0601.$g4654$.rebind(var28, var26);
                module0601.$g4652$.rebind(var27, var26);
            }
        }
        finally {
            final SubLObject var32 = Threads.$is_thread_performing_cleanupP$.currentBinding(var26);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var26);
                module0601.f36746();
                module0601.f36760((SubLObject)$ic98$);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var32, var26);
            }
        }
        return var25;
    }
    
    public static SubLObject f39565(final SubLObject var156) {
        final SubLObject var157 = module0217.f14423((SubLObject)ConsesLow.listS($ic104$, var156, (SubLObject)$ic105$));
        final SubLObject var158 = module0178.f11287(var157);
        return var158;
    }
    
    public static SubLObject f39566(final SubLObject var156, final SubLObject var158) {
        final SubLObject var159 = f39567(var156, var158);
        f39568(var159, var158);
        f39569(var159, var158);
        return var159;
    }
    
    public static SubLObject f39570(final SubLObject var156, final SubLObject var158) {
        return module0434.f30579((SubLObject)$ic37$, (SubLObject)ConsesLow.listS($ic106$, var156, (SubLObject)$ic107$), var158, (SubLObject)ZERO_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).first();
    }
    
    public static SubLObject f39567(final SubLObject var156, final SubLObject var158) {
        final SubLObject var159 = f39537((SubLObject)UNPROVIDED);
        f39524(var159, var156);
        f39525(var159, module0259.f16822(var156, var158, (SubLObject)UNPROVIDED));
        f39526(var159, f39570(var156, var158));
        f39528(var159, module0077.f5313(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED));
        f39571(var159, var158);
        f39531(var159, module0077.f5313(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED));
        f39572(var159, var158);
        f39534(var159, module0077.f5313(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED));
        f39535(var159, module0077.f5313(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED));
        f39536(var159, module0067.f4880(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED));
        return var159;
    }
    
    public static SubLObject f39571(final SubLObject var13, final SubLObject var158) {
        SubLObject var159 = module0256.f16634($ic108$, var158, (SubLObject)UNPROVIDED);
        SubLObject var160 = (SubLObject)NIL;
        var160 = var159.first();
        while (NIL != var159) {
            f39573(var13, var160);
            var159 = var159.rest();
            var160 = var159.first();
        }
        return var13;
    }
    
    public static SubLObject f39573(final SubLObject var13, final SubLObject var160) {
        module0077.f5326(var160, f39515(var13));
        return var13;
    }
    
    public static SubLObject f39572(final SubLObject var13, final SubLObject var158) {
        SubLObject var159 = module0256.f16634($ic109$, var158, (SubLObject)UNPROVIDED);
        SubLObject var160 = (SubLObject)NIL;
        var160 = var159.first();
        while (NIL != var159) {
            f39574(var13, var160);
            var159 = var159.rest();
            var160 = var159.first();
        }
        return var13;
    }
    
    public static SubLObject f39574(final SubLObject var13, final SubLObject var161) {
        module0077.f5326(var161, f39518(var13));
        return var13;
    }
    
    public static SubLObject f39568(final SubLObject var13, final SubLObject var158) {
        final SubLObject var159 = f39513(var13);
        final SubLObject var160 = module0434.f30579((SubLObject)$ic110$, (SubLObject)ConsesLow.list($ic111$, (SubLObject)$ic110$, var159), var158, (SubLObject)ZERO_INTEGER, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var161 = module0434.f30579((SubLObject)$ic112$, (SubLObject)ConsesLow.list($ic113$, (SubLObject)$ic112$, var159), var158, (SubLObject)ZERO_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).first();
        SubLObject var162 = var160;
        SubLObject var163 = (SubLObject)NIL;
        var163 = var162.first();
        while (NIL != var162) {
            final SubLObject var164 = f39575(var13, var163, var158);
            if (var163.eql(var161)) {
                f39529(var13, var164);
            }
            var162 = var162.rest();
            var163 = var162.first();
        }
        return var13;
    }
    
    public static SubLObject f39575(final SubLObject var13, final SubLObject var165, final SubLObject var158) {
        final SubLObject var166 = f39576(var13, var165, var158);
        final SubLObject var167 = f39577(var13, var165, var158);
        SubLObject var168 = f39556(var166);
        SubLObject var169 = (SubLObject)NIL;
        var169 = var168.first();
        while (NIL != var168) {
            f39573(var13, var169);
            var168 = var168.rest();
            var169 = var168.first();
        }
        f39527(var13, (SubLObject)ConsesLow.cons(var166, f39514(var13)));
        module0067.f4886(f39523(var13), var165, var167);
        return var166;
    }
    
    public static SubLObject f39569(final SubLObject var13, final SubLObject var158) {
        final SubLObject var159 = f39513(var13);
        SubLObject var161;
        final SubLObject var160 = var161 = module0434.f30579((SubLObject)$ic114$, (SubLObject)ConsesLow.list($ic115$, (SubLObject)$ic114$, var159), var158, (SubLObject)ZERO_INTEGER, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var162 = (SubLObject)NIL;
        var162 = var161.first();
        while (NIL != var161) {
            f39578(var13, var162, var158);
            var161 = var161.rest();
            var162 = var161.first();
        }
        return var13;
    }
    
    public static SubLObject f39578(final SubLObject var13, final SubLObject var167, final SubLObject var158) {
        final SubLObject var168 = f39579(var13, var167, var158);
        final SubLObject var169 = f39577(var13, var167, var158);
        SubLObject var170 = f39558(var168);
        SubLObject var171 = (SubLObject)NIL;
        var171 = var170.first();
        while (NIL != var170) {
            f39574(var13, var171);
            var170 = var170.rest();
            var171 = var170.first();
        }
        f39530(var13, (SubLObject)ConsesLow.cons(var168, f39517(var13)));
        module0067.f4886(f39523(var13), var167, var169);
        return var168;
    }
    
    public static SubLObject f39580(final SubLObject var1, final SubLObject var2) {
        f39547(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39581(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX43361_native.class) ? T : NIL);
    }
    
    public static SubLObject f39555(final SubLObject var1) {
        assert NIL != f39581(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f39556(final SubLObject var1) {
        assert NIL != f39581(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f39582(final SubLObject var1) {
        assert NIL != f39581(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f39563(final SubLObject var1) {
        assert NIL != f39581(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f39583(final SubLObject var1, final SubLObject var4) {
        assert NIL != f39581(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f39584(final SubLObject var1, final SubLObject var4) {
        assert NIL != f39581(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f39585(final SubLObject var1, final SubLObject var4) {
        assert NIL != f39581(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f39586(final SubLObject var1, final SubLObject var4) {
        assert NIL != f39581(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f39587(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX43361_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic35$)) {
                f39583(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic36$)) {
                f39584(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic133$)) {
                f39585(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic134$)) {
                f39586(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic48$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f39588(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic49$, (SubLObject)$ic135$, (SubLObject)FOUR_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic35$, f39555(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic36$, f39556(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic133$, f39582(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic134$, f39563(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic52$, (SubLObject)$ic135$, (SubLObject)FOUR_INTEGER);
        return var11;
    }
    
    public static SubLObject f39589(final SubLObject var11, final SubLObject var12) {
        return f39588(var11, var12);
    }
    
    public static SubLObject f39547(final SubLObject var14, final SubLObject var2, final SubLObject var15) {
        module0038.f2648(var2, var15);
        streams_high.write_string((SubLObject)$ic137$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        print_high.prin1(f39555(var14), var2);
        streams_high.write_string((SubLObject)$ic55$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        print_high.prin1(f39556(var14), var2);
        streams_high.terpri(var2);
        module0038.f2648(var2, var15);
        streams_high.write_string((SubLObject)$ic138$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        print_high.prin1(f39511(f39582(var14)), var2);
        streams_high.terpri(var2);
        module0038.f2648(var2, var15);
        if (NIL != f39563(var14)) {
            streams_high.write_string((SubLObject)$ic139$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            print_high.prin1(f39563(var14), var2);
        }
        else {
            streams_high.write_string((SubLObject)$ic140$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        streams_high.write_string((SubLObject)$ic70$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return var14;
    }
    
    public static SubLObject f39576(final SubLObject var25, final SubLObject var165, final SubLObject var158) {
        final SubLObject var166 = f39587((SubLObject)UNPROVIDED);
        f39583(var166, var165);
        f39585(var166, var25);
        f39584(var166, module0259.f16822(var165, var158, (SubLObject)UNPROVIDED));
        f39586(var166, module0434.f30579((SubLObject)$ic134$, (SubLObject)ConsesLow.listS($ic141$, var165, (SubLObject)$ic142$), var158, (SubLObject)ZERO_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).first());
        return var166;
    }
    
    public static SubLObject f39590(final SubLObject var1, final SubLObject var2) {
        f39548(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39591(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX43363_native.class) ? T : NIL);
    }
    
    public static SubLObject f39557(final SubLObject var1) {
        assert NIL != f39591(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f39558(final SubLObject var1) {
        assert NIL != f39591(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f39592(final SubLObject var1) {
        assert NIL != f39591(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f39559(final SubLObject var1) {
        assert NIL != f39591(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f39560(final SubLObject var1) {
        assert NIL != f39591(var1) : var1;
        return var1.getField6();
    }
    
    public static SubLObject f39564(final SubLObject var1) {
        assert NIL != f39591(var1) : var1;
        return var1.getField7();
    }
    
    public static SubLObject f39593(final SubLObject var1, final SubLObject var4) {
        assert NIL != f39591(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f39594(final SubLObject var1, final SubLObject var4) {
        assert NIL != f39591(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f39595(final SubLObject var1, final SubLObject var4) {
        assert NIL != f39591(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f39596(final SubLObject var1, final SubLObject var4) {
        assert NIL != f39591(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f39597(final SubLObject var1, final SubLObject var4) {
        assert NIL != f39591(var1) : var1;
        return var1.setField6(var4);
    }
    
    public static SubLObject f39598(final SubLObject var1, final SubLObject var4) {
        assert NIL != f39591(var1) : var1;
        return var1.setField7(var4);
    }
    
    public static SubLObject f39599(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX43363_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic35$)) {
                f39593(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic36$)) {
                f39594(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic133$)) {
                f39595(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic164$)) {
                f39596(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic165$)) {
                f39597(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic134$)) {
                f39598(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic48$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f39600(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic49$, (SubLObject)$ic166$, (SubLObject)SIX_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic35$, f39557(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic36$, f39558(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic133$, f39592(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic164$, f39559(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic165$, f39560(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic134$, f39564(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic52$, (SubLObject)$ic166$, (SubLObject)SIX_INTEGER);
        return var11;
    }
    
    public static SubLObject f39601(final SubLObject var11, final SubLObject var12) {
        return f39600(var11, var12);
    }
    
    public static SubLObject f39548(final SubLObject var14, final SubLObject var2, final SubLObject var15) {
        module0038.f2648(var2, var15);
        streams_high.write_string((SubLObject)$ic168$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        print_high.prin1(f39557(var14), var2);
        streams_high.write_string((SubLObject)$ic55$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        print_high.prin1(f39558(var14), var2);
        streams_high.terpri(var2);
        module0038.f2648(var2, var15);
        streams_high.write_string((SubLObject)$ic138$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        print_high.prin1(f39511(f39592(var14)), var2);
        if (module0077.f5311(f39559(var14)).isPositive()) {
            streams_high.terpri(var2);
            module0038.f2648(var2, var15);
            streams_high.write_string((SubLObject)$ic169$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            print_high.prin1(module0077.f5312(f39559(var14)), var2);
        }
        if (module0077.f5311(f39560(var14)).isPositive()) {
            streams_high.terpri(var2);
            module0038.f2648(var2, var15);
            streams_high.write_string((SubLObject)$ic170$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            print_high.prin1(module0077.f5312(f39560(var14)), var2);
        }
        if (NIL != f39564(var14)) {
            streams_high.terpri(var2);
            module0038.f2648(var2, var15);
            streams_high.write_string((SubLObject)$ic171$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            print_high.prin1(f39564(var14), var2);
        }
        streams_high.write_string((SubLObject)$ic70$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return var14;
    }
    
    public static SubLObject f39579(final SubLObject var25, final SubLObject var167, final SubLObject var158) {
        final SubLObject var168 = f39599((SubLObject)UNPROVIDED);
        final SubLObject var169 = f39511(var25);
        final SubLObject var170 = f39513(var25);
        f39593(var168, var167);
        f39595(var168, var25);
        f39594(var168, module0259.f16822(var167, var158, (SubLObject)UNPROVIDED));
        f39598(var168, module0434.f30579((SubLObject)$ic134$, (SubLObject)ConsesLow.list($ic172$, (SubLObject)$ic134$, var167, (SubLObject)ConsesLow.list($ic173$, var169)), var158, (SubLObject)ZERO_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).first());
        final SubLObject var171 = module0077.f5313(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
        final SubLObject var172 = module0077.f5313(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
        SubLObject var174;
        final SubLObject var173 = var174 = module0434.f30577((SubLObject)$ic174$, (SubLObject)ConsesLow.list($ic175$, var167, (SubLObject)$ic176$, (SubLObject)$ic177$, var170), var158, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var175 = (SubLObject)NIL;
        var175 = var174.first();
        while (NIL != var174) {
            SubLObject var177;
            final SubLObject var176 = var177 = var175;
            SubLObject var178 = (SubLObject)NIL;
            SubLObject var179 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var177, var176, (SubLObject)$ic178$);
            var178 = var177.first();
            var177 = var177.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var177, var176, (SubLObject)$ic178$);
            var179 = var177.first();
            var177 = var177.rest();
            if (NIL == var177) {
                module0077.f5326(var178, var171);
                module0077.f5326(var179, var172);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var176, (SubLObject)$ic178$);
            }
            var174 = var174.rest();
            var175 = var174.first();
        }
        f39597(var168, var172);
        f39596(var168, var171);
        return var168;
    }
    
    public static SubLObject f39602(final SubLObject var1, final SubLObject var2) {
        f39549(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39603(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX43365_native.class) ? T : NIL);
    }
    
    public static SubLObject f39562(final SubLObject var1) {
        assert NIL != f39603(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f39604(final SubLObject var1, final SubLObject var4) {
        assert NIL != f39603(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f39605(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX43365_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic190$)) {
                f39604(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic48$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f39606(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic49$, (SubLObject)$ic191$, (SubLObject)ONE_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic190$, f39562(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic52$, (SubLObject)$ic191$, (SubLObject)ONE_INTEGER);
        return var11;
    }
    
    public static SubLObject f39607(final SubLObject var11, final SubLObject var12) {
        return f39606(var11, var12);
    }
    
    public static SubLObject f39549(final SubLObject var14, final SubLObject var2, final SubLObject var15) {
        module0038.f2648(var2, var15);
        streams_high.write_string((SubLObject)$ic193$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != f39562(var14)) {
            streams_high.terpri(var2);
            module0038.f2648(var2, var15);
            streams_high.write_string((SubLObject)$ic194$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            streams_high.write_string(f39562(var14), var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        streams_high.write_string((SubLObject)$ic70$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return var14;
    }
    
    public static SubLObject f39577(final SubLObject var25, final SubLObject var23, final SubLObject var158) {
        final SubLObject var159 = f39605((SubLObject)UNPROVIDED);
        final SubLObject var160 = f39513(var25);
        f39604(var159, module0434.f30579((SubLObject)$ic190$, (SubLObject)ConsesLow.list($ic195$, var23, (SubLObject)$ic190$, var160), var158, (SubLObject)ZERO_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).first());
        return var159;
    }
    
    public static SubLObject f39608() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39508", "S#43367", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39510", "S#43360", 1, 0, false);
        new $f39510$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39511", "S#43368", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39512", "S#43369", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39513", "S#43370", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39514", "S#43371", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39515", "S#43372", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39516", "S#43373", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39517", "S#43374", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39518", "S#43375", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39519", "S#43376", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39520", "S#43377", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39521", "S#43378", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39522", "S#43379", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39523", "S#43380", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39524", "S#43381", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39525", "S#43382", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39526", "S#43383", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39527", "S#43384", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39528", "S#43385", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39529", "S#43386", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39530", "S#43387", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39531", "S#43388", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39532", "S#43389", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39533", "S#43390", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39534", "S#43391", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39535", "S#43392", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39536", "S#43393", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39537", "S#43394", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39538", "S#43395", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39539", "S#43396", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39540", "S#43397", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39541", "S#43398", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39542", "S#43399", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39543", "S#43400", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39544", "S#43401", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39545", "S#43402", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39546", "S#43403", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39509", "S#43404", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39550", "S#43405", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39551", "S#43406", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39552", "S#43407", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39553", "S#43408", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39561", "S#43409", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39554", "S#43410", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39565", "S#43411", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39566", "S#43412", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39570", "S#43413", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39567", "S#43414", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39571", "S#43415", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39573", "S#43416", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39572", "S#43417", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39574", "S#43418", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39568", "S#43419", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39575", "S#43420", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39569", "S#43421", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39578", "S#43422", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39580", "S#43423", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39581", "S#43362", 1, 0, false);
        new $f39581$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39555", "S#43424", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39556", "S#43425", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39582", "S#43426", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39563", "S#43427", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39583", "S#43428", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39584", "S#43429", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39585", "S#43430", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39586", "S#43431", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39587", "S#43432", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39588", "S#43433", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39589", "S#43434", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39547", "S#43435", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39576", "S#43436", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39590", "S#43437", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39591", "S#43364", 1, 0, false);
        new $f39591$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39557", "S#43438", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39558", "S#43439", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39592", "S#43440", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39559", "S#43441", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39560", "S#43442", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39564", "S#43443", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39593", "S#43444", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39594", "S#43445", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39595", "S#43446", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39596", "S#43447", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39597", "S#43448", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39598", "S#43449", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39599", "S#43450", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39600", "S#43451", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39601", "S#43452", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39548", "S#43453", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39579", "S#43454", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39602", "S#43455", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39603", "S#43366", 1, 0, false);
        new $f39603$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39562", "S#43456", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39604", "S#43457", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39605", "S#43458", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39606", "S#43459", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39607", "S#43460", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39549", "S#43461", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0648", "f39577", "S#43462", 3, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39609() {
        $g5051$ = SubLFiles.defconstant("S#43463", (SubLObject)$ic0$);
        $g5052$ = SubLFiles.defconstant("S#43464", (SubLObject)$ic116$);
        $g5053$ = SubLFiles.defconstant("S#43465", (SubLObject)$ic143$);
        $g5054$ = SubLFiles.defconstant("S#43466", (SubLObject)$ic179$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39610() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g5051$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic7$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic8$);
        Structures.def_csetf((SubLObject)$ic9$, (SubLObject)$ic10$);
        Structures.def_csetf((SubLObject)$ic11$, (SubLObject)$ic12$);
        Structures.def_csetf((SubLObject)$ic13$, (SubLObject)$ic14$);
        Structures.def_csetf((SubLObject)$ic15$, (SubLObject)$ic16$);
        Structures.def_csetf((SubLObject)$ic17$, (SubLObject)$ic18$);
        Structures.def_csetf((SubLObject)$ic19$, (SubLObject)$ic20$);
        Structures.def_csetf((SubLObject)$ic21$, (SubLObject)$ic22$);
        Structures.def_csetf((SubLObject)$ic23$, (SubLObject)$ic24$);
        Structures.def_csetf((SubLObject)$ic25$, (SubLObject)$ic26$);
        Structures.def_csetf((SubLObject)$ic27$, (SubLObject)$ic28$);
        Structures.def_csetf((SubLObject)$ic29$, (SubLObject)$ic30$);
        Structures.def_csetf((SubLObject)$ic31$, (SubLObject)$ic32$);
        Structures.def_csetf((SubLObject)$ic33$, (SubLObject)$ic34$);
        Equality.identity((SubLObject)$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g5051$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic53$));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g5052$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic123$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic124$);
        Structures.def_csetf((SubLObject)$ic125$, (SubLObject)$ic126$);
        Structures.def_csetf((SubLObject)$ic127$, (SubLObject)$ic128$);
        Structures.def_csetf((SubLObject)$ic129$, (SubLObject)$ic130$);
        Structures.def_csetf((SubLObject)$ic131$, (SubLObject)$ic132$);
        Equality.identity((SubLObject)$ic116$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g5052$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic136$));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g5053$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic150$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic151$);
        Structures.def_csetf((SubLObject)$ic152$, (SubLObject)$ic153$);
        Structures.def_csetf((SubLObject)$ic154$, (SubLObject)$ic155$);
        Structures.def_csetf((SubLObject)$ic156$, (SubLObject)$ic157$);
        Structures.def_csetf((SubLObject)$ic158$, (SubLObject)$ic159$);
        Structures.def_csetf((SubLObject)$ic160$, (SubLObject)$ic161$);
        Structures.def_csetf((SubLObject)$ic162$, (SubLObject)$ic163$);
        Equality.identity((SubLObject)$ic143$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g5053$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic167$));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g5054$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic186$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic187$);
        Structures.def_csetf((SubLObject)$ic188$, (SubLObject)$ic189$);
        Equality.identity((SubLObject)$ic179$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g5054$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic192$));
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f39608();
    }
    
    public void initializeVariables() {
        f39609();
    }
    
    public void runTopLevelForms() {
        f39610();
    }
    
    static {
        me = (SubLFile)new module0648();
        $g5051$ = null;
        $g5052$ = null;
        $g5053$ = null;
        $g5054$ = null;
        $ic0$ = makeSymbol("S#43359", "CYC");
        $ic1$ = makeSymbol("S#43360", "CYC");
        $ic2$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#1519", "CYC"), makeSymbol("S#43467", "CYC"), makeSymbol("S#43468", "CYC"), makeSymbol("S#2953", "CYC"), makeSymbol("S#43469", "CYC"), makeSymbol("S#43470", "CYC"), makeSymbol("S#43471", "CYC"), makeSymbol("S#43472", "CYC"), makeSymbol("S#43473", "CYC"), makeSymbol("S#43474", "CYC"), makeSymbol("S#43475", "CYC"), makeSymbol("S#43476", "CYC"), makeSymbol("S#43477", "CYC") });
        $ic3$ = ConsesLow.list(new SubLObject[] { makeKeyword("ID"), makeKeyword("TYPES"), makeKeyword("AIS"), makeKeyword("NODES"), makeKeyword("NODE-TYPES"), makeKeyword("SOURCE-NODE"), makeKeyword("ARCS"), makeKeyword("ARC-TYPES"), makeKeyword("INCOMING-CONNECTORS"), makeKeyword("OUTGOING-CONNECTORS"), makeKeyword("INCOMING-CONNECTOR-TYPES"), makeKeyword("OUTGOING-CONNECTOR-TYPES"), makeKeyword("RENDERING-INFO") });
        $ic4$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#43368", "CYC"), makeSymbol("S#43369", "CYC"), makeSymbol("S#43370", "CYC"), makeSymbol("S#43371", "CYC"), makeSymbol("S#43372", "CYC"), makeSymbol("S#43373", "CYC"), makeSymbol("S#43374", "CYC"), makeSymbol("S#43375", "CYC"), makeSymbol("S#43376", "CYC"), makeSymbol("S#43377", "CYC"), makeSymbol("S#43378", "CYC"), makeSymbol("S#43379", "CYC"), makeSymbol("S#43380", "CYC") });
        $ic5$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#43381", "CYC"), makeSymbol("S#43382", "CYC"), makeSymbol("S#43383", "CYC"), makeSymbol("S#43384", "CYC"), makeSymbol("S#43385", "CYC"), makeSymbol("S#43386", "CYC"), makeSymbol("S#43387", "CYC"), makeSymbol("S#43388", "CYC"), makeSymbol("S#43389", "CYC"), makeSymbol("S#43390", "CYC"), makeSymbol("S#43391", "CYC"), makeSymbol("S#43392", "CYC"), makeSymbol("S#43393", "CYC") });
        $ic6$ = makeSymbol("S#43404", "CYC");
        $ic7$ = makeSymbol("S#43367", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#43360", "CYC"));
        $ic9$ = makeSymbol("S#43368", "CYC");
        $ic10$ = makeSymbol("S#43381", "CYC");
        $ic11$ = makeSymbol("S#43369", "CYC");
        $ic12$ = makeSymbol("S#43382", "CYC");
        $ic13$ = makeSymbol("S#43370", "CYC");
        $ic14$ = makeSymbol("S#43383", "CYC");
        $ic15$ = makeSymbol("S#43371", "CYC");
        $ic16$ = makeSymbol("S#43384", "CYC");
        $ic17$ = makeSymbol("S#43372", "CYC");
        $ic18$ = makeSymbol("S#43385", "CYC");
        $ic19$ = makeSymbol("S#43373", "CYC");
        $ic20$ = makeSymbol("S#43386", "CYC");
        $ic21$ = makeSymbol("S#43374", "CYC");
        $ic22$ = makeSymbol("S#43387", "CYC");
        $ic23$ = makeSymbol("S#43375", "CYC");
        $ic24$ = makeSymbol("S#43388", "CYC");
        $ic25$ = makeSymbol("S#43376", "CYC");
        $ic26$ = makeSymbol("S#43389", "CYC");
        $ic27$ = makeSymbol("S#43377", "CYC");
        $ic28$ = makeSymbol("S#43390", "CYC");
        $ic29$ = makeSymbol("S#43378", "CYC");
        $ic30$ = makeSymbol("S#43391", "CYC");
        $ic31$ = makeSymbol("S#43379", "CYC");
        $ic32$ = makeSymbol("S#43392", "CYC");
        $ic33$ = makeSymbol("S#43380", "CYC");
        $ic34$ = makeSymbol("S#43393", "CYC");
        $ic35$ = makeKeyword("ID");
        $ic36$ = makeKeyword("TYPES");
        $ic37$ = makeKeyword("AIS");
        $ic38$ = makeKeyword("NODES");
        $ic39$ = makeKeyword("NODE-TYPES");
        $ic40$ = makeKeyword("SOURCE-NODE");
        $ic41$ = makeKeyword("ARCS");
        $ic42$ = makeKeyword("ARC-TYPES");
        $ic43$ = makeKeyword("INCOMING-CONNECTORS");
        $ic44$ = makeKeyword("OUTGOING-CONNECTORS");
        $ic45$ = makeKeyword("INCOMING-CONNECTOR-TYPES");
        $ic46$ = makeKeyword("OUTGOING-CONNECTOR-TYPES");
        $ic47$ = makeKeyword("RENDERING-INFO");
        $ic48$ = makeString("Invalid slot ~S for construction function");
        $ic49$ = makeKeyword("BEGIN");
        $ic50$ = makeSymbol("S#43394", "CYC");
        $ic51$ = makeKeyword("SLOT");
        $ic52$ = makeKeyword("END");
        $ic53$ = makeSymbol("S#43396", "CYC");
        $ic54$ = makeString("<GLF-Graph ");
        $ic55$ = makeString(" of types ");
        $ic56$ = makeString(" corresponding AIS: ");
        $ic57$ = makeString(" Types: ");
        $ic58$ = makeString("  Node-Types: ");
        $ic59$ = makeString("  Arc-Types: ");
        $ic60$ = makeString("  In-Connectors: ");
        $ic61$ = makeString("  Out-Connectors: ");
        $ic62$ = makeString(" no information available ");
        $ic63$ = makeString(" Content: ");
        $ic64$ = makeString("  Nodes (first is source): ");
        $ic65$ = makeString("  Arcs: ");
        $ic66$ = makeString(" currently empty ");
        $ic67$ = makeString(" Rendering Information ");
        $ic68$ = makeString("  ");
        $ic69$ = makeString(" -> ");
        $ic70$ = makeString("> ");
        $ic71$ = makeString("glfGraph");
        $ic72$ = makeString("glfCore");
        $ic73$ = makeString("glfNodeTypes");
        $ic74$ = makeString("glfNodeType");
        $ic75$ = makeString("glfArcTypes");
        $ic76$ = makeString("glfArcType");
        $ic77$ = makeString("glfDiagram");
        $ic78$ = makeString("glfId");
        $ic79$ = makeString("glfOwnsNodes");
        $ic80$ = makeString("glfOwnsNode");
        $ic81$ = makeString("glfIsHeadNode");
        $ic82$ = makeKeyword("ATOMIC");
        $ic83$ = makeString("glfHasTypes");
        $ic84$ = makeString("glfHasType");
        $ic85$ = makeString("glfOwnsArcs");
        $ic86$ = makeString("glfOwnsArc");
        $ic87$ = makeString("glfFromSet");
        $ic88$ = makeString("glfFrom");
        $ic89$ = makeString("glfToSet");
        $ic90$ = makeString("glfTo");
        $ic91$ = makeString("glfRendering");
        $ic92$ = makeString("glfRenderNodes");
        $ic93$ = makeString("glfRenderNode");
        $ic94$ = makeString("glfRenderArcs");
        $ic95$ = makeString("glfRenderArc");
        $ic96$ = makeString("glfRenderInfo");
        $ic97$ = makeString("glfRenderLabel");
        $ic98$ = makeString("glfFlowModel");
        $ic99$ = makeString("glfSemanticForNodes");
        $ic100$ = makeString("glfSemanticForNode");
        $ic101$ = makeString("glfHasSemantic");
        $ic102$ = makeString("glfSemanticForArcs");
        $ic103$ = makeString("glfSemanticForArc");
        $ic104$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic105$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Graph-CW")));
        $ic106$ = constant_handles_oc.f8479((SubLObject)makeString("correspondingAIS"));
        $ic107$ = ConsesLow.list((SubLObject)makeKeyword("AIS"));
        $ic108$ = constant_handles_oc.f8479((SubLObject)makeString("GLFNode"));
        $ic109$ = constant_handles_oc.f8479((SubLObject)makeString("GLFArc"));
        $ic110$ = makeKeyword("NODE");
        $ic111$ = constant_handles_oc.f8479((SubLObject)makeString("nodeInSystem"));
        $ic112$ = makeKeyword("SOURCE");
        $ic113$ = constant_handles_oc.f8479((SubLObject)makeString("sourceNodeInSystem"));
        $ic114$ = makeKeyword("ARC");
        $ic115$ = constant_handles_oc.f8479((SubLObject)makeString("linkInSystem"));
        $ic116$ = makeSymbol("S#43361", "CYC");
        $ic117$ = makeSymbol("S#43362", "CYC");
        $ic118$ = ConsesLow.list((SubLObject)makeSymbol("S#1519", "CYC"), (SubLObject)makeSymbol("S#43467", "CYC"), (SubLObject)makeSymbol("S#10127", "CYC"), (SubLObject)makeSymbol("S#43478", "CYC"));
        $ic119$ = ConsesLow.list((SubLObject)makeKeyword("ID"), (SubLObject)makeKeyword("TYPES"), (SubLObject)makeKeyword("PARENT"), (SubLObject)makeKeyword("SEMANTICS"));
        $ic120$ = ConsesLow.list((SubLObject)makeSymbol("S#43424", "CYC"), (SubLObject)makeSymbol("S#43425", "CYC"), (SubLObject)makeSymbol("S#43426", "CYC"), (SubLObject)makeSymbol("S#43427", "CYC"));
        $ic121$ = ConsesLow.list((SubLObject)makeSymbol("S#43428", "CYC"), (SubLObject)makeSymbol("S#43429", "CYC"), (SubLObject)makeSymbol("S#43430", "CYC"), (SubLObject)makeSymbol("S#43431", "CYC"));
        $ic122$ = makeSymbol("S#43435", "CYC");
        $ic123$ = makeSymbol("S#43423", "CYC");
        $ic124$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#43362", "CYC"));
        $ic125$ = makeSymbol("S#43424", "CYC");
        $ic126$ = makeSymbol("S#43428", "CYC");
        $ic127$ = makeSymbol("S#43425", "CYC");
        $ic128$ = makeSymbol("S#43429", "CYC");
        $ic129$ = makeSymbol("S#43426", "CYC");
        $ic130$ = makeSymbol("S#43430", "CYC");
        $ic131$ = makeSymbol("S#43427", "CYC");
        $ic132$ = makeSymbol("S#43431", "CYC");
        $ic133$ = makeKeyword("PARENT");
        $ic134$ = makeKeyword("SEMANTICS");
        $ic135$ = makeSymbol("S#43432", "CYC");
        $ic136$ = makeSymbol("S#43434", "CYC");
        $ic137$ = makeString("<GLF-Node ");
        $ic138$ = makeString(" of graph ");
        $ic139$ = makeString(" with semantics ");
        $ic140$ = makeString(" without semantics ");
        $ic141$ = constant_handles_oc.f8479((SubLObject)makeString("glfNodeSemantics-Underspecified"));
        $ic142$ = ConsesLow.list((SubLObject)makeKeyword("SEMANTICS"));
        $ic143$ = makeSymbol("S#43363", "CYC");
        $ic144$ = makeSymbol("S#43364", "CYC");
        $ic145$ = ConsesLow.list((SubLObject)makeSymbol("S#1519", "CYC"), (SubLObject)makeSymbol("S#43467", "CYC"), (SubLObject)makeSymbol("S#10127", "CYC"), (SubLObject)makeSymbol("S#4562", "CYC"), (SubLObject)makeSymbol("S#4563", "CYC"), (SubLObject)makeSymbol("S#43478", "CYC"));
        $ic146$ = ConsesLow.list((SubLObject)makeKeyword("ID"), (SubLObject)makeKeyword("TYPES"), (SubLObject)makeKeyword("PARENT"), (SubLObject)makeKeyword("FROM"), (SubLObject)makeKeyword("TO"), (SubLObject)makeKeyword("SEMANTICS"));
        $ic147$ = ConsesLow.list((SubLObject)makeSymbol("S#43438", "CYC"), (SubLObject)makeSymbol("S#43439", "CYC"), (SubLObject)makeSymbol("S#43440", "CYC"), (SubLObject)makeSymbol("S#43441", "CYC"), (SubLObject)makeSymbol("S#43442", "CYC"), (SubLObject)makeSymbol("S#43443", "CYC"));
        $ic148$ = ConsesLow.list((SubLObject)makeSymbol("S#43444", "CYC"), (SubLObject)makeSymbol("S#43445", "CYC"), (SubLObject)makeSymbol("S#43446", "CYC"), (SubLObject)makeSymbol("S#43447", "CYC"), (SubLObject)makeSymbol("S#43448", "CYC"), (SubLObject)makeSymbol("S#43449", "CYC"));
        $ic149$ = makeSymbol("S#43453", "CYC");
        $ic150$ = makeSymbol("S#43437", "CYC");
        $ic151$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#43364", "CYC"));
        $ic152$ = makeSymbol("S#43438", "CYC");
        $ic153$ = makeSymbol("S#43444", "CYC");
        $ic154$ = makeSymbol("S#43439", "CYC");
        $ic155$ = makeSymbol("S#43445", "CYC");
        $ic156$ = makeSymbol("S#43440", "CYC");
        $ic157$ = makeSymbol("S#43446", "CYC");
        $ic158$ = makeSymbol("S#43441", "CYC");
        $ic159$ = makeSymbol("S#43447", "CYC");
        $ic160$ = makeSymbol("S#43442", "CYC");
        $ic161$ = makeSymbol("S#43448", "CYC");
        $ic162$ = makeSymbol("S#43443", "CYC");
        $ic163$ = makeSymbol("S#43449", "CYC");
        $ic164$ = makeKeyword("FROM");
        $ic165$ = makeKeyword("TO");
        $ic166$ = makeSymbol("S#43450", "CYC");
        $ic167$ = makeSymbol("S#43452", "CYC");
        $ic168$ = makeString("<GLF-Arc ");
        $ic169$ = makeString(" from: ");
        $ic170$ = makeString(" to:   ");
        $ic171$ = makeString(" meaning: ");
        $ic172$ = constant_handles_oc.f8479((SubLObject)makeString("variableMappingTableForGLFArcInDiagram"));
        $ic173$ = constant_handles_oc.f8479((SubLObject)makeString("AISForFn"));
        $ic174$ = ConsesLow.list((SubLObject)makeSymbol("?FROM"), (SubLObject)makeSymbol("?TO"));
        $ic175$ = constant_handles_oc.f8479((SubLObject)makeString("linkFromToInSystem"));
        $ic176$ = makeSymbol("?FROM");
        $ic177$ = makeSymbol("?TO");
        $ic178$ = ConsesLow.list((SubLObject)makeSymbol("S#10134", "CYC"), (SubLObject)makeSymbol("S#1553", "CYC"));
        $ic179$ = makeSymbol("S#43365", "CYC");
        $ic180$ = makeSymbol("S#43366", "CYC");
        $ic181$ = ConsesLow.list((SubLObject)makeSymbol("S#1572", "CYC"));
        $ic182$ = ConsesLow.list((SubLObject)makeKeyword("LABEL"));
        $ic183$ = ConsesLow.list((SubLObject)makeSymbol("S#43456", "CYC"));
        $ic184$ = ConsesLow.list((SubLObject)makeSymbol("S#43457", "CYC"));
        $ic185$ = makeSymbol("S#43461", "CYC");
        $ic186$ = makeSymbol("S#43455", "CYC");
        $ic187$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#43366", "CYC"));
        $ic188$ = makeSymbol("S#43456", "CYC");
        $ic189$ = makeSymbol("S#43457", "CYC");
        $ic190$ = makeKeyword("LABEL");
        $ic191$ = makeSymbol("S#43458", "CYC");
        $ic192$ = makeSymbol("S#43460", "CYC");
        $ic193$ = makeString("#<GLF-Rendering ");
        $ic194$ = makeString(" label: ");
        $ic195$ = constant_handles_oc.f8479((SubLObject)makeString("glfComponentLabel"));
    }
    
    public static final class $sX43359_native extends SubLStructNative
    {
        public SubLObject $id;
        public SubLObject $types;
        public SubLObject $ais;
        public SubLObject $nodes;
        public SubLObject $node_types;
        public SubLObject $source_node;
        public SubLObject $arcs;
        public SubLObject $arc_types;
        public SubLObject $incoming_connectors;
        public SubLObject $outgoing_connectors;
        public SubLObject $incoming_connector_types;
        public SubLObject $outgoing_connector_types;
        public SubLObject $rendering_info;
        private static final SubLStructDeclNative structDecl;
        
        public $sX43359_native() {
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$types = (SubLObject)CommonSymbols.NIL;
            this.$ais = (SubLObject)CommonSymbols.NIL;
            this.$nodes = (SubLObject)CommonSymbols.NIL;
            this.$node_types = (SubLObject)CommonSymbols.NIL;
            this.$source_node = (SubLObject)CommonSymbols.NIL;
            this.$arcs = (SubLObject)CommonSymbols.NIL;
            this.$arc_types = (SubLObject)CommonSymbols.NIL;
            this.$incoming_connectors = (SubLObject)CommonSymbols.NIL;
            this.$outgoing_connectors = (SubLObject)CommonSymbols.NIL;
            this.$incoming_connector_types = (SubLObject)CommonSymbols.NIL;
            this.$outgoing_connector_types = (SubLObject)CommonSymbols.NIL;
            this.$rendering_info = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX43359_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$id;
        }
        
        public SubLObject getField3() {
            return this.$types;
        }
        
        public SubLObject getField4() {
            return this.$ais;
        }
        
        public SubLObject getField5() {
            return this.$nodes;
        }
        
        public SubLObject getField6() {
            return this.$node_types;
        }
        
        public SubLObject getField7() {
            return this.$source_node;
        }
        
        public SubLObject getField8() {
            return this.$arcs;
        }
        
        public SubLObject getField9() {
            return this.$arc_types;
        }
        
        public SubLObject getField10() {
            return this.$incoming_connectors;
        }
        
        public SubLObject getField11() {
            return this.$outgoing_connectors;
        }
        
        public SubLObject getField12() {
            return this.$incoming_connector_types;
        }
        
        public SubLObject getField13() {
            return this.$outgoing_connector_types;
        }
        
        public SubLObject getField14() {
            return this.$rendering_info;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$types = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$ais = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$nodes = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$node_types = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$source_node = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$arcs = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$arc_types = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$incoming_connectors = value;
        }
        
        public SubLObject setField11(final SubLObject value) {
            return this.$outgoing_connectors = value;
        }
        
        public SubLObject setField12(final SubLObject value) {
            return this.$incoming_connector_types = value;
        }
        
        public SubLObject setField13(final SubLObject value) {
            return this.$outgoing_connector_types = value;
        }
        
        public SubLObject setField14(final SubLObject value) {
            return this.$rendering_info = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX43359_native.class, $ic0$, $ic1$, $ic2$, $ic3$, new String[] { "$id", "$types", "$ais", "$nodes", "$node_types", "$source_node", "$arcs", "$arc_types", "$incoming_connectors", "$outgoing_connectors", "$incoming_connector_types", "$outgoing_connector_types", "$rendering_info" }, $ic4$, $ic5$, $ic6$);
        }
    }
    
    public static final class $f39510$UnaryFunction extends UnaryFunction
    {
        public $f39510$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#43360"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f39510(var3);
        }
    }
    
    public static final class $sX43361_native extends SubLStructNative
    {
        public SubLObject $id;
        public SubLObject $types;
        public SubLObject $parent;
        public SubLObject $semantics;
        private static final SubLStructDeclNative structDecl;
        
        public $sX43361_native() {
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$types = (SubLObject)CommonSymbols.NIL;
            this.$parent = (SubLObject)CommonSymbols.NIL;
            this.$semantics = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX43361_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$id;
        }
        
        public SubLObject getField3() {
            return this.$types;
        }
        
        public SubLObject getField4() {
            return this.$parent;
        }
        
        public SubLObject getField5() {
            return this.$semantics;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$types = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$parent = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$semantics = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX43361_native.class, $ic116$, $ic117$, $ic118$, $ic119$, new String[] { "$id", "$types", "$parent", "$semantics" }, $ic120$, $ic121$, $ic122$);
        }
    }
    
    public static final class $f39581$UnaryFunction extends UnaryFunction
    {
        public $f39581$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#43362"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f39581(var3);
        }
    }
    
    public static final class $sX43363_native extends SubLStructNative
    {
        public SubLObject $id;
        public SubLObject $types;
        public SubLObject $parent;
        public SubLObject $from;
        public SubLObject $to;
        public SubLObject $semantics;
        private static final SubLStructDeclNative structDecl;
        
        public $sX43363_native() {
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$types = (SubLObject)CommonSymbols.NIL;
            this.$parent = (SubLObject)CommonSymbols.NIL;
            this.$from = (SubLObject)CommonSymbols.NIL;
            this.$to = (SubLObject)CommonSymbols.NIL;
            this.$semantics = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX43363_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$id;
        }
        
        public SubLObject getField3() {
            return this.$types;
        }
        
        public SubLObject getField4() {
            return this.$parent;
        }
        
        public SubLObject getField5() {
            return this.$from;
        }
        
        public SubLObject getField6() {
            return this.$to;
        }
        
        public SubLObject getField7() {
            return this.$semantics;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$types = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$parent = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$from = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$to = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$semantics = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX43363_native.class, $ic143$, $ic144$, $ic145$, $ic146$, new String[] { "$id", "$types", "$parent", "$from", "$to", "$semantics" }, $ic147$, $ic148$, $ic149$);
        }
    }
    
    public static final class $f39591$UnaryFunction extends UnaryFunction
    {
        public $f39591$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#43364"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f39591(var3);
        }
    }
    
    public static final class $sX43365_native extends SubLStructNative
    {
        public SubLObject $label;
        private static final SubLStructDeclNative structDecl;
        
        public $sX43365_native() {
            this.$label = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX43365_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$label;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$label = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX43365_native.class, $ic179$, $ic180$, $ic181$, $ic182$, new String[] { "$label" }, $ic183$, $ic184$, $ic185$);
        }
    }
    
    public static final class $f39603$UnaryFunction extends UnaryFunction
    {
        public $f39603$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#43366"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f39603(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 3539 ms
	
	Decompiled with Procyon 0.5.32.
*/