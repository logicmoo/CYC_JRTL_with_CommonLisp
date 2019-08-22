package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0260 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0260";
    public static final String myFingerPrint = "9ba1136ee21b221b0b5166d4eb69870f9c68a08640f9d9ff9e8e63980902c038";
    private static SubLSymbol $g2505$;
    private static SubLSymbol $g2506$;
    private static SubLSymbol $g2507$;
    private static SubLSymbol $g2508$;
    private static final SubLSymbol $ic0$;
    private static final SubLObject $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLList $ic3$;
    private static final SubLString $ic4$;
    private static final SubLList $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLString $ic8$;
    private static final SubLObject $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLString $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLString $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLString $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLString $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLString $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLString $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLString $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLString $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLString $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLString $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLString $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLString $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLString $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLString $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLString $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLString $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLString $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLString $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLString $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLString $ic58$;
    private static final SubLString $ic59$;
    private static final SubLString $ic60$;
    private static final SubLString $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLString $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLString $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLString $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLList $ic71$;
    private static final SubLString $ic72$;
    private static final SubLList $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLString $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLString $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLString $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLList $ic82$;
    private static final SubLString $ic83$;
    private static final SubLList $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLString $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLString $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLString $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLList $ic93$;
    private static final SubLString $ic94$;
    private static final SubLList $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLString $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLObject $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLList $ic105$;
    private static final SubLString $ic106$;
    private static final SubLList $ic107$;
    private static final SubLObject $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLList $ic110$;
    private static final SubLString $ic111$;
    private static final SubLList $ic112$;
    private static final SubLList $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLSymbol $ic115$;
    private static final SubLList $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLObject $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLSymbol $ic121$;
    private static final SubLObject $ic122$;
    private static final SubLObject $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLSymbol $ic126$;
    private static final SubLString $ic127$;
    private static final SubLSymbol $ic128$;
    private static final SubLString $ic129$;
    private static final SubLSymbol $ic130$;
    private static final SubLList $ic131$;
    private static final SubLString $ic132$;
    private static final SubLList $ic133$;
    private static final SubLSymbol $ic134$;
    private static final SubLString $ic135$;
    private static final SubLSymbol $ic136$;
    private static final SubLList $ic137$;
    private static final SubLString $ic138$;
    private static final SubLList $ic139$;
    private static final SubLList $ic140$;
    private static final SubLSymbol $ic141$;
    private static final SubLObject $ic142$;
    private static final SubLSymbol $ic143$;
    private static final SubLList $ic144$;
    private static final SubLList $ic145$;
    private static final SubLSymbol $ic146$;
    private static final SubLString $ic147$;
    private static final SubLSymbol $ic148$;
    private static final SubLSymbol $ic149$;
    private static final SubLList $ic150$;
    private static final SubLString $ic151$;
    private static final SubLList $ic152$;
    private static final SubLSymbol $ic153$;
    private static final SubLList $ic154$;
    private static final SubLString $ic155$;
    private static final SubLList $ic156$;
    private static final SubLSymbol $ic157$;
    private static final SubLString $ic158$;
    private static final SubLSymbol $ic159$;
    private static final SubLList $ic160$;
    private static final SubLString $ic161$;
    private static final SubLList $ic162$;
    private static final SubLSymbol $ic163$;
    private static final SubLSymbol $ic164$;
    private static final SubLSymbol $ic165$;
    private static final SubLList $ic166$;
    private static final SubLString $ic167$;
    private static final SubLList $ic168$;
    private static final SubLSymbol $ic169$;
    private static final SubLList $ic170$;
    private static final SubLString $ic171$;
    private static final SubLList $ic172$;
    private static final SubLSymbol $ic173$;
    private static final SubLString $ic174$;
    private static final SubLSymbol $ic175$;
    private static final SubLList $ic176$;
    private static final SubLString $ic177$;
    private static final SubLList $ic178$;
    private static final SubLObject $ic179$;
    private static final SubLSymbol $ic180$;
    private static final SubLString $ic181$;
    private static final SubLSymbol $ic182$;
    private static final SubLSymbol $ic183$;
    private static final SubLList $ic184$;
    private static final SubLString $ic185$;
    private static final SubLSymbol $ic186$;
    private static final SubLList $ic187$;
    private static final SubLString $ic188$;
    private static final SubLList $ic189$;
    private static final SubLSymbol $ic190$;
    private static final SubLSymbol $ic191$;
    private static final SubLInteger $ic192$;
    private static final SubLInteger $ic193$;
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
    private static final SubLSymbol $ic206$;
    private static final SubLSymbol $ic207$;
    private static final SubLSymbol $ic208$;
    private static final SubLSymbol $ic209$;
    private static final SubLSymbol $ic210$;
    
    
    public static SubLObject f17006(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        return module0248.f15931(module0137.f8955($ic1$), var1, var2, var3, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f17007(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        return module0252.f16303(module0137.f8955($ic1$), var1, var2, var3);
    }
    
    public static SubLObject f17008(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        return module0248.f15931(module0137.f8955($ic9$), var1, var2, var3, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f17009(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        return module0252.f16303(module0137.f8955($ic9$), var1, var2, var3);
    }
    
    public static SubLObject f17010(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        return module0248.f15932(module0137.f8955($ic1$), var1, var2, var3, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f17011(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        return module0252.f16306(module0137.f8955($ic1$), var1, var2, var3);
    }
    
    public static SubLObject f17012(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        return module0248.f15932(module0137.f8955($ic9$), var1, var2, var3, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f17013(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        return module0252.f16306(module0137.f8955($ic9$), var1, var2, var3);
    }
    
    public static SubLObject f17014(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        return module0248.f15933(module0137.f8955($ic1$), var1, var2, var3, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f17015(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        return module0252.f16308(module0137.f8955($ic1$), var1, var2, var3);
    }
    
    public static SubLObject f17016(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        return module0248.f15933(module0137.f8955($ic9$), var1, var2, var3, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f17017(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        return module0252.f16308(module0137.f8955($ic9$), var1, var2, var3);
    }
    
    public static SubLObject f17018(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        return module0248.f15935(module0137.f8955($ic1$), var1, var2, var3, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f17019(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        return module0252.f16309(module0137.f8955($ic1$), var1, var2, var3);
    }
    
    public static SubLObject f17020(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        return module0248.f15935(module0137.f8955($ic9$), var1, var2, var3, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f17021(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        return module0252.f16309(module0137.f8955($ic9$), var1, var2, var3);
    }
    
    public static SubLObject f17022(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        return module0248.f15937(module0137.f8955($ic1$), var1, var2, var3);
    }
    
    public static SubLObject f17023(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        return module0248.f15937(module0137.f8955($ic9$), var1, var2, var3);
    }
    
    public static SubLObject f17024(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        return module0248.f15938(module0137.f8955($ic1$), var1, var2, var3);
    }
    
    public static SubLObject f17025(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        return module0248.f15938(module0137.f8955($ic9$), var1, var2, var3);
    }
    
    public static SubLObject f17026(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        return f17027(f17028(var1, var2, var3), var2, var3);
    }
    
    public static SubLObject f17029(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        return f17027(f17030(var1, var2, var3), var2, var3);
    }
    
    public static SubLObject f17028(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        return module0252.f16245(module0137.f8955($ic1$), var1, var2, var3);
    }
    
    public static SubLObject f17031(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        SubLObject var5 = (SubLObject)NIL;
        final SubLObject var6 = (SubLObject)$ic50$;
        final SubLObject var7 = module0056.f4145(var6);
        SubLObject var8 = (SubLObject)NIL;
        final SubLObject var9 = module0139.$g1635$.currentBinding(var4);
        try {
            module0139.$g1635$.bind(module0139.f9007(), var4);
            final SubLObject var10 = var2;
            final SubLObject var10_12 = module0147.$g2095$.currentBinding(var4);
            final SubLObject var11 = module0147.$g2094$.currentBinding(var4);
            final SubLObject var12 = module0147.$g2096$.currentBinding(var4);
            try {
                module0147.$g2095$.bind(module0147.f9545(var10), var4);
                module0147.$g2094$.bind(module0147.f9546(var10), var4);
                module0147.$g2096$.bind(module0147.f9549(var10), var4);
                final SubLObject var13 = var3;
                final SubLObject var10_13 = module0141.$g1714$.currentBinding(var4);
                final SubLObject var13_17 = module0141.$g1715$.currentBinding(var4);
                try {
                    module0141.$g1714$.bind((NIL != var13) ? var13 : module0141.f9283(), var4);
                    module0141.$g1715$.bind((SubLObject)((NIL != var13) ? $ic51$ : module0141.$g1715$.getDynamicValue(var4)), var4);
                    if (NIL != var13 && NIL != module0136.f8864() && NIL == module0141.f9279(var13)) {
                        final SubLObject var14 = module0136.$g1591$.getDynamicValue(var4);
                        if (var14.eql((SubLObject)$ic52$)) {
                            module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic53$, var13, (SubLObject)$ic54$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                        else if (var14.eql((SubLObject)$ic55$)) {
                            module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic56$, (SubLObject)$ic53$, var13, (SubLObject)$ic54$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                        else if (var14.eql((SubLObject)$ic57$)) {
                            Errors.warn((SubLObject)$ic53$, var13, (SubLObject)$ic54$);
                        }
                        else {
                            Errors.warn((SubLObject)$ic58$, module0136.$g1591$.getDynamicValue(var4));
                            Errors.cerror((SubLObject)$ic56$, (SubLObject)$ic53$, var13, (SubLObject)$ic54$);
                        }
                    }
                    final SubLObject var10_14 = module0141.$g1670$.currentBinding(var4);
                    final SubLObject var13_18 = module0141.$g1671$.currentBinding(var4);
                    final SubLObject var14_21 = module0141.$g1672$.currentBinding(var4);
                    final SubLObject var15 = module0141.$g1674$.currentBinding(var4);
                    final SubLObject var16 = module0137.$g1605$.currentBinding(var4);
                    try {
                        module0141.$g1670$.bind(module0137.f8955($ic1$), var4);
                        module0141.$g1671$.bind(module0244.f15739(module0137.f8955($ic1$)), var4);
                        module0141.$g1672$.bind(module0244.f15746(module0137.f8955($ic1$)), var4);
                        module0141.$g1674$.bind((SubLObject)NIL, var4);
                        module0137.$g1605$.bind(module0137.f8955($ic1$), var4);
                        if (NIL != module0136.f8865() || NIL != module0244.f15795(var1, module0137.f8955((SubLObject)UNPROVIDED))) {
                            final SubLObject var10_15 = module0141.$g1677$.currentBinding(var4);
                            final SubLObject var13_19 = module0138.$g1619$.currentBinding(var4);
                            final SubLObject var14_22 = module0141.$g1674$.currentBinding(var4);
                            try {
                                module0141.$g1677$.bind(module0141.f9208(), var4);
                                module0138.$g1619$.bind(module0244.f15782(module0141.f9208(), module0137.f8955($ic1$)), var4);
                                module0141.$g1674$.bind((SubLObject)NIL, var4);
                                module0249.f16055(var1, (SubLObject)UNPROVIDED);
                                for (var8 = (SubLObject)ConsesLow.list(var1, module0141.f9195()); NIL != var8; var8 = module0056.f4150(var7)) {
                                    final SubLObject var6_27 = var8.first();
                                    final SubLObject var17 = conses_high.second(var8);
                                    final SubLObject var18 = var6_27;
                                    final SubLObject var10_16 = module0141.$g1674$.currentBinding(var4);
                                    try {
                                        module0141.$g1674$.bind(var17, var4);
                                        final SubLObject var19 = var17;
                                        var5 = (SubLObject)ConsesLow.cons(var18, var5);
                                        SubLObject var21;
                                        final SubLObject var20 = var21 = module0200.f12443(module0137.f8955($ic1$));
                                        SubLObject var22 = (SubLObject)NIL;
                                        var22 = var21.first();
                                        while (NIL != var21) {
                                            final SubLObject var10_17 = module0137.$g1605$.currentBinding(var4);
                                            final SubLObject var13_20 = module0141.$g1674$.currentBinding(var4);
                                            try {
                                                module0137.$g1605$.bind(var22, var4);
                                                module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var4)) : module0141.$g1674$.getDynamicValue(var4)), var4);
                                                final SubLObject var23 = module0228.f15229(var6_27);
                                                if (NIL != module0138.f8992(var23)) {
                                                    final SubLObject var24 = module0242.f15664(var23, module0137.f8955((SubLObject)UNPROVIDED));
                                                    if (NIL != var24) {
                                                        final SubLObject var25 = module0245.f15834(var24, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                        if (NIL != var25) {
                                                            SubLObject var26;
                                                            for (var26 = module0066.f4838(module0067.f4891(var25)); NIL == module0066.f4841(var26); var26 = module0066.f4840(var26)) {
                                                                var4.resetMultipleValues();
                                                                final SubLObject var41_42 = module0066.f4839(var26);
                                                                final SubLObject var27 = var4.secondMultipleValue();
                                                                var4.resetMultipleValues();
                                                                if (NIL != module0147.f9507(var41_42)) {
                                                                    final SubLObject var10_18 = module0138.$g1623$.currentBinding(var4);
                                                                    try {
                                                                        module0138.$g1623$.bind(var41_42, var4);
                                                                        SubLObject var40_45;
                                                                        for (var40_45 = module0066.f4838(module0067.f4891(var27)); NIL == module0066.f4841(var40_45); var40_45 = module0066.f4840(var40_45)) {
                                                                            var4.resetMultipleValues();
                                                                            final SubLObject var46_47 = module0066.f4839(var40_45);
                                                                            final SubLObject var28 = var4.secondMultipleValue();
                                                                            var4.resetMultipleValues();
                                                                            if (NIL != module0141.f9289(var46_47)) {
                                                                                final SubLObject var10_19 = module0138.$g1624$.currentBinding(var4);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var46_47, var4);
                                                                                    final SubLObject var29 = var28;
                                                                                    if (NIL != module0077.f5302(var29)) {
                                                                                        final SubLObject var30 = module0077.f5333(var29);
                                                                                        SubLObject var31;
                                                                                        SubLObject var32;
                                                                                        SubLObject var33;
                                                                                        for (var31 = module0032.f1741(var30), var32 = (SubLObject)NIL, var32 = module0032.f1742(var31, var30); NIL == module0032.f1744(var31, var32); var32 = module0032.f1743(var32)) {
                                                                                            var33 = module0032.f1745(var31, var32);
                                                                                            if (NIL != module0032.f1746(var32, var33) && NIL == module0249.f16059(var33, (SubLObject)UNPROVIDED)) {
                                                                                                module0249.f16055(var33, (SubLObject)UNPROVIDED);
                                                                                                module0056.f4149((SubLObject)ConsesLow.list(var33, module0141.f9195()), var7);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var29.isList()) {
                                                                                        SubLObject var34 = var29;
                                                                                        SubLObject var35 = (SubLObject)NIL;
                                                                                        var35 = var34.first();
                                                                                        while (NIL != var34) {
                                                                                            if (NIL == module0249.f16059(var35, (SubLObject)UNPROVIDED)) {
                                                                                                module0249.f16055(var35, (SubLObject)UNPROVIDED);
                                                                                                module0056.f4149((SubLObject)ConsesLow.list(var35, module0141.f9195()), var7);
                                                                                            }
                                                                                            var34 = var34.rest();
                                                                                            var35 = var34.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)$ic59$, var29);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var10_19, var4);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var40_45);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var10_18, var4);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var26);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic60$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                    }
                                                }
                                                else if (NIL != module0155.f9785(var23, (SubLObject)UNPROVIDED)) {
                                                    SubLObject var33_57;
                                                    final SubLObject var36 = var33_57 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var4), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var4), module0137.f8955((SubLObject)UNPROVIDED)));
                                                    SubLObject var37 = (SubLObject)NIL;
                                                    var37 = var33_57.first();
                                                    while (NIL != var33_57) {
                                                        final SubLObject var10_20 = module0138.$g1625$.currentBinding(var4);
                                                        try {
                                                            module0138.$g1625$.bind(var37, var4);
                                                            final SubLObject var39;
                                                            final SubLObject var38 = var39 = Functions.funcall(var37, var23);
                                                            if (NIL != module0077.f5302(var39)) {
                                                                final SubLObject var40 = module0077.f5333(var39);
                                                                SubLObject var41;
                                                                SubLObject var42;
                                                                SubLObject var43;
                                                                for (var41 = module0032.f1741(var40), var42 = (SubLObject)NIL, var42 = module0032.f1742(var41, var40); NIL == module0032.f1744(var41, var42); var42 = module0032.f1743(var42)) {
                                                                    var43 = module0032.f1745(var41, var42);
                                                                    if (NIL != module0032.f1746(var42, var43) && NIL == module0249.f16059(var43, (SubLObject)UNPROVIDED)) {
                                                                        module0249.f16055(var43, (SubLObject)UNPROVIDED);
                                                                        module0056.f4149((SubLObject)ConsesLow.list(var43, module0141.f9195()), var7);
                                                                    }
                                                                }
                                                            }
                                                            else if (var39.isList()) {
                                                                SubLObject var44 = var39;
                                                                SubLObject var45 = (SubLObject)NIL;
                                                                var45 = var44.first();
                                                                while (NIL != var44) {
                                                                    if (NIL == module0249.f16059(var45, (SubLObject)UNPROVIDED)) {
                                                                        module0249.f16055(var45, (SubLObject)UNPROVIDED);
                                                                        module0056.f4149((SubLObject)ConsesLow.list(var45, module0141.f9195()), var7);
                                                                    }
                                                                    var44 = var44.rest();
                                                                    var45 = var44.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)$ic59$, var39);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var10_20, var4);
                                                        }
                                                        var33_57 = var33_57.rest();
                                                        var37 = var33_57.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var13_20, var4);
                                                module0137.$g1605$.rebind(var10_17, var4);
                                            }
                                            var21 = var21.rest();
                                            var22 = var21.first();
                                        }
                                    }
                                    finally {
                                        module0141.$g1674$.rebind(var10_16, var4);
                                    }
                                }
                            }
                            finally {
                                module0141.$g1674$.rebind(var14_22, var4);
                                module0138.$g1619$.rebind(var13_19, var4);
                                module0141.$g1677$.rebind(var10_15, var4);
                            }
                        }
                        else {
                            module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic61$, var1, module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                    }
                    finally {
                        module0137.$g1605$.rebind(var16, var4);
                        module0141.$g1674$.rebind(var15, var4);
                        module0141.$g1672$.rebind(var14_21, var4);
                        module0141.$g1671$.rebind(var13_18, var4);
                        module0141.$g1670$.rebind(var10_14, var4);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var13_17, var4);
                    module0141.$g1714$.rebind(var10_13, var4);
                }
            }
            finally {
                module0147.$g2096$.rebind(var12, var4);
                module0147.$g2094$.rebind(var11, var4);
                module0147.$g2095$.rebind(var10_12, var4);
            }
            module0139.f9011(module0139.$g1635$.getDynamicValue(var4));
        }
        finally {
            module0139.$g1635$.rebind(var9, var4);
        }
        return Sequences.nreverse(var5);
    }
    
    public static SubLObject f17032(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return f17028(var1, var2, var3);
    }
    
    public static SubLObject f17030(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        return module0252.f16245(module0137.f8955($ic9$), var1, var2, var3);
    }
    
    public static SubLObject f17033(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        return module0252.f16248(module0137.f8955($ic1$), var1, var2, var3);
    }
    
    public static SubLObject f17034(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return f17033(var1, var2, var3);
    }
    
    public static SubLObject f17035(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        return module0252.f16248(module0137.f8955($ic9$), var1, var2, var3);
    }
    
    public static SubLObject f17036(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        SubLObject var5 = (SubLObject)NIL;
        final SubLObject var6 = (SubLObject)$ic50$;
        final SubLObject var7 = module0056.f4145(var6);
        SubLObject var8 = (SubLObject)NIL;
        final SubLObject var9 = module0139.$g1635$.currentBinding(var4);
        try {
            module0139.$g1635$.bind(module0139.f9007(), var4);
            final SubLObject var10 = var2;
            final SubLObject var10_60 = module0147.$g2095$.currentBinding(var4);
            final SubLObject var11 = module0147.$g2094$.currentBinding(var4);
            final SubLObject var12 = module0147.$g2096$.currentBinding(var4);
            try {
                module0147.$g2095$.bind(module0147.f9545(var10), var4);
                module0147.$g2094$.bind(module0147.f9546(var10), var4);
                module0147.$g2096$.bind(module0147.f9549(var10), var4);
                final SubLObject var13 = var3;
                final SubLObject var10_61 = module0141.$g1714$.currentBinding(var4);
                final SubLObject var13_62 = module0141.$g1715$.currentBinding(var4);
                try {
                    module0141.$g1714$.bind((NIL != var13) ? var13 : module0141.f9283(), var4);
                    module0141.$g1715$.bind((SubLObject)((NIL != var13) ? $ic51$ : module0141.$g1715$.getDynamicValue(var4)), var4);
                    if (NIL != var13 && NIL != module0136.f8864() && NIL == module0141.f9279(var13)) {
                        final SubLObject var14 = module0136.$g1591$.getDynamicValue(var4);
                        if (var14.eql((SubLObject)$ic52$)) {
                            module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic53$, var13, (SubLObject)$ic54$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                        else if (var14.eql((SubLObject)$ic55$)) {
                            module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic56$, (SubLObject)$ic53$, var13, (SubLObject)$ic54$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                        else if (var14.eql((SubLObject)$ic57$)) {
                            Errors.warn((SubLObject)$ic53$, var13, (SubLObject)$ic54$);
                        }
                        else {
                            Errors.warn((SubLObject)$ic58$, module0136.$g1591$.getDynamicValue(var4));
                            Errors.cerror((SubLObject)$ic56$, (SubLObject)$ic53$, var13, (SubLObject)$ic54$);
                        }
                    }
                    final SubLObject var10_62 = module0141.$g1670$.currentBinding(var4);
                    final SubLObject var13_63 = module0141.$g1671$.currentBinding(var4);
                    final SubLObject var14_65 = module0141.$g1672$.currentBinding(var4);
                    final SubLObject var15 = module0141.$g1674$.currentBinding(var4);
                    final SubLObject var16 = module0137.$g1605$.currentBinding(var4);
                    try {
                        module0141.$g1670$.bind(module0137.f8955($ic1$), var4);
                        module0141.$g1671$.bind(module0244.f15739(module0137.f8955($ic1$)), var4);
                        module0141.$g1672$.bind(module0244.f15746(module0137.f8955($ic1$)), var4);
                        module0141.$g1674$.bind((SubLObject)NIL, var4);
                        module0137.$g1605$.bind(module0137.f8955($ic1$), var4);
                        if (NIL != module0136.f8865() || NIL != module0244.f15795(var1, module0137.f8955((SubLObject)UNPROVIDED))) {
                            final SubLObject var10_63 = module0141.$g1677$.currentBinding(var4);
                            final SubLObject var13_64 = module0138.$g1619$.currentBinding(var4);
                            final SubLObject var14_66 = module0141.$g1674$.currentBinding(var4);
                            try {
                                module0141.$g1677$.bind(module0141.f9210(), var4);
                                module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0137.f8955($ic1$)), var4);
                                module0141.$g1674$.bind((SubLObject)NIL, var4);
                                module0249.f16055(var1, (SubLObject)UNPROVIDED);
                                for (var8 = (SubLObject)ConsesLow.list(var1, module0141.f9195()); NIL != var8; var8 = module0056.f4150(var7)) {
                                    final SubLObject var6_69 = var8.first();
                                    final SubLObject var17 = conses_high.second(var8);
                                    final SubLObject var18 = var6_69;
                                    final SubLObject var10_64 = module0141.$g1674$.currentBinding(var4);
                                    try {
                                        module0141.$g1674$.bind(var17, var4);
                                        final SubLObject var19 = var17;
                                        var5 = (SubLObject)ConsesLow.cons(var18, var5);
                                        SubLObject var21;
                                        final SubLObject var20 = var21 = module0200.f12443(module0137.f8955($ic1$));
                                        SubLObject var22 = (SubLObject)NIL;
                                        var22 = var21.first();
                                        while (NIL != var21) {
                                            final SubLObject var10_65 = module0137.$g1605$.currentBinding(var4);
                                            final SubLObject var13_65 = module0141.$g1674$.currentBinding(var4);
                                            try {
                                                module0137.$g1605$.bind(var22, var4);
                                                module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var4)) : module0141.$g1674$.getDynamicValue(var4)), var4);
                                                final SubLObject var23 = module0228.f15229(var6_69);
                                                if (NIL != module0138.f8992(var23)) {
                                                    final SubLObject var24 = module0242.f15664(var23, module0137.f8955((SubLObject)UNPROVIDED));
                                                    if (NIL != var24) {
                                                        final SubLObject var25 = module0245.f15834(var24, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                        if (NIL != var25) {
                                                            SubLObject var26;
                                                            for (var26 = module0066.f4838(module0067.f4891(var25)); NIL == module0066.f4841(var26); var26 = module0066.f4840(var26)) {
                                                                var4.resetMultipleValues();
                                                                final SubLObject var41_74 = module0066.f4839(var26);
                                                                final SubLObject var27 = var4.secondMultipleValue();
                                                                var4.resetMultipleValues();
                                                                if (NIL != module0147.f9507(var41_74)) {
                                                                    final SubLObject var10_66 = module0138.$g1623$.currentBinding(var4);
                                                                    try {
                                                                        module0138.$g1623$.bind(var41_74, var4);
                                                                        SubLObject var40_76;
                                                                        for (var40_76 = module0066.f4838(module0067.f4891(var27)); NIL == module0066.f4841(var40_76); var40_76 = module0066.f4840(var40_76)) {
                                                                            var4.resetMultipleValues();
                                                                            final SubLObject var46_77 = module0066.f4839(var40_76);
                                                                            final SubLObject var28 = var4.secondMultipleValue();
                                                                            var4.resetMultipleValues();
                                                                            if (NIL != module0141.f9289(var46_77)) {
                                                                                final SubLObject var10_67 = module0138.$g1624$.currentBinding(var4);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var46_77, var4);
                                                                                    final SubLObject var29 = var28;
                                                                                    if (NIL != module0077.f5302(var29)) {
                                                                                        final SubLObject var30 = module0077.f5333(var29);
                                                                                        SubLObject var31;
                                                                                        SubLObject var32;
                                                                                        SubLObject var33;
                                                                                        for (var31 = module0032.f1741(var30), var32 = (SubLObject)NIL, var32 = module0032.f1742(var31, var30); NIL == module0032.f1744(var31, var32); var32 = module0032.f1743(var32)) {
                                                                                            var33 = module0032.f1745(var31, var32);
                                                                                            if (NIL != module0032.f1746(var32, var33) && NIL == module0249.f16059(var33, (SubLObject)UNPROVIDED)) {
                                                                                                module0249.f16055(var33, (SubLObject)UNPROVIDED);
                                                                                                module0056.f4149((SubLObject)ConsesLow.list(var33, module0141.f9195()), var7);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var29.isList()) {
                                                                                        SubLObject var34 = var29;
                                                                                        SubLObject var35 = (SubLObject)NIL;
                                                                                        var35 = var34.first();
                                                                                        while (NIL != var34) {
                                                                                            if (NIL == module0249.f16059(var35, (SubLObject)UNPROVIDED)) {
                                                                                                module0249.f16055(var35, (SubLObject)UNPROVIDED);
                                                                                                module0056.f4149((SubLObject)ConsesLow.list(var35, module0141.f9195()), var7);
                                                                                            }
                                                                                            var34 = var34.rest();
                                                                                            var35 = var34.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)$ic59$, var29);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var10_67, var4);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var40_76);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var10_66, var4);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var26);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic60$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                    }
                                                }
                                                else if (NIL != module0155.f9785(var23, (SubLObject)UNPROVIDED)) {
                                                    SubLObject var33_79;
                                                    final SubLObject var36 = var33_79 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var4), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var4), module0137.f8955((SubLObject)UNPROVIDED)));
                                                    SubLObject var37 = (SubLObject)NIL;
                                                    var37 = var33_79.first();
                                                    while (NIL != var33_79) {
                                                        final SubLObject var10_68 = module0138.$g1625$.currentBinding(var4);
                                                        try {
                                                            module0138.$g1625$.bind(var37, var4);
                                                            final SubLObject var39;
                                                            final SubLObject var38 = var39 = Functions.funcall(var37, var23);
                                                            if (NIL != module0077.f5302(var39)) {
                                                                final SubLObject var40 = module0077.f5333(var39);
                                                                SubLObject var41;
                                                                SubLObject var42;
                                                                SubLObject var43;
                                                                for (var41 = module0032.f1741(var40), var42 = (SubLObject)NIL, var42 = module0032.f1742(var41, var40); NIL == module0032.f1744(var41, var42); var42 = module0032.f1743(var42)) {
                                                                    var43 = module0032.f1745(var41, var42);
                                                                    if (NIL != module0032.f1746(var42, var43) && NIL == module0249.f16059(var43, (SubLObject)UNPROVIDED)) {
                                                                        module0249.f16055(var43, (SubLObject)UNPROVIDED);
                                                                        module0056.f4149((SubLObject)ConsesLow.list(var43, module0141.f9195()), var7);
                                                                    }
                                                                }
                                                            }
                                                            else if (var39.isList()) {
                                                                SubLObject var44 = var39;
                                                                SubLObject var45 = (SubLObject)NIL;
                                                                var45 = var44.first();
                                                                while (NIL != var44) {
                                                                    if (NIL == module0249.f16059(var45, (SubLObject)UNPROVIDED)) {
                                                                        module0249.f16055(var45, (SubLObject)UNPROVIDED);
                                                                        module0056.f4149((SubLObject)ConsesLow.list(var45, module0141.f9195()), var7);
                                                                    }
                                                                    var44 = var44.rest();
                                                                    var45 = var44.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)$ic59$, var39);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var10_68, var4);
                                                        }
                                                        var33_79 = var33_79.rest();
                                                        var37 = var33_79.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var13_65, var4);
                                                module0137.$g1605$.rebind(var10_65, var4);
                                            }
                                            var21 = var21.rest();
                                            var22 = var21.first();
                                        }
                                    }
                                    finally {
                                        module0141.$g1674$.rebind(var10_64, var4);
                                    }
                                }
                            }
                            finally {
                                module0141.$g1674$.rebind(var14_66, var4);
                                module0138.$g1619$.rebind(var13_64, var4);
                                module0141.$g1677$.rebind(var10_63, var4);
                            }
                        }
                        else {
                            module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic61$, var1, module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                    }
                    finally {
                        module0137.$g1605$.rebind(var16, var4);
                        module0141.$g1674$.rebind(var15, var4);
                        module0141.$g1672$.rebind(var14_65, var4);
                        module0141.$g1671$.rebind(var13_63, var4);
                        module0141.$g1670$.rebind(var10_62, var4);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var13_62, var4);
                    module0141.$g1714$.rebind(var10_61, var4);
                }
            }
            finally {
                module0147.$g2096$.rebind(var12, var4);
                module0147.$g2094$.rebind(var11, var4);
                module0147.$g2095$.rebind(var10_60, var4);
            }
            module0139.f9011(module0139.$g1635$.getDynamicValue(var4));
        }
        finally {
            module0139.$g1635$.rebind(var9, var4);
        }
        return Sequences.nreverse(var5);
    }
    
    public static SubLObject f17037(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return Sequences.delete(var1, f17028(var1, var2, var3), Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f17038(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return Sequences.delete(var1, f17030(var1, var2, var3), Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f17039(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return Sequences.delete(var1, f17031(var1, var2, var3), Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f17040(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return Sequences.delete(var1, f17033(var1, var2, var3), Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f17041(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return Sequences.delete(var1, f17035(var1, var2, var3), Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f17042(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return Sequences.delete(var1, f17036(var1, var2, var3), Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f17043(final SubLObject var1, final SubLObject var81, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0210.f13565(var1) : var1;
        assert NIL != Types.listp(var81) : var81;
        return module0252.f16332(module0137.f8955($ic1$), var1, var81, var2, var3);
    }
    
    public static SubLObject f17044(final SubLObject var29, final SubLObject var82, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0252.f16334(module0137.f8955($ic1$), var29, var82, var2, var3);
    }
    
    public static SubLObject f17045(final SubLObject var1, final SubLObject var81, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0252.f16332(module0137.f8955($ic9$), var1, var81, var2, var3);
    }
    
    public static SubLObject f17046(final SubLObject var29, final SubLObject var82, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0076.f5290(f17035(var29, var2, var3), var82, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f17047(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        return module0254.f16477(module0137.f8955($ic1$), var1, var2, var3);
    }
    
    public static SubLObject f17048(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return f17047(var1, var2, var3);
    }
    
    public static SubLObject f17049(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        return module0254.f16477(module0137.f8955($ic9$), var1, var2, var3);
    }
    
    public static SubLObject f17050(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        return module0254.f16478(module0137.f8955($ic1$), var1, var2, var3);
    }
    
    public static SubLObject f17051(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return f17050(var1, var2, var3);
    }
    
    public static SubLObject f17052(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        return module0254.f16478(module0137.f8955($ic9$), var1, var2, var3);
    }
    
    public static SubLObject f17053(final SubLObject var5, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != Types.listp(var5) : var5;
        return module0252.f16252(module0137.f8955($ic1$), var5, var2, var3);
    }
    
    public static SubLObject f17054(final SubLObject var5, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != Types.listp(var5) : var5;
        return module0252.f16254(module0137.f8955($ic1$), var5, var2, var3);
    }
    
    public static SubLObject f17055(final SubLObject var5, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != Types.listp(var5) : var5;
        return module0252.f16252(module0137.f8955($ic9$), var5, var2, var3);
    }
    
    public static SubLObject f17056(final SubLObject var5, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != Types.listp(var5) : var5;
        return module0252.f16254(module0137.f8955($ic9$), var5, var2, var3);
    }
    
    public static SubLObject f17057(final SubLObject var5, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var6 = SubLProcess.currentSubLThread();
        SubLObject var7 = (SubLObject)NIL;
        final SubLObject var8 = module0141.$g1691$.currentBinding(var6);
        try {
            module0141.$g1691$.bind((SubLObject)NIL, var6);
            try {
                module0252.f16276(module0137.f8955($ic1$), var5, var2, var3);
            }
            finally {
                final SubLObject var10_84 = Threads.$is_thread_performing_cleanupP$.currentBinding(var6);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var6);
                    var7 = module0141.$g1691$.getDynamicValue(var6);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var10_84, var6);
                }
            }
        }
        finally {
            module0141.$g1691$.rebind(var8, var6);
        }
        return module0035.f2269(var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f17058(final SubLObject var1, final SubLObject var85, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        assert NIL != Types.function_spec_p(var85) : var85;
        module0252.f16269(module0137.f8955($ic1$), var1, var85, var2, var3);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17059(final SubLObject var1, final SubLObject var85, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        assert NIL != Types.function_spec_p(var85) : var85;
        return module0252.f16282(module0137.f8955($ic1$), var1, var85, var2, var3, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f17060(final SubLObject var1, final SubLObject var85, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        assert NIL != Types.function_spec_p(var85) : var85;
        return module0252.f16282(module0137.f8955($ic9$), var1, var85, var2, var3, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f17061(final SubLObject var1, final SubLObject var85, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0252.f16286(module0137.f8955($ic1$), var1, var85, var2, var3, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f17062(final SubLObject var1, final SubLObject var85, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        assert NIL != Types.function_spec_p(var85) : var85;
        module0252.f16272(module0137.f8955($ic1$), var1, var85, var2, var3);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17063(final SubLObject var1, final SubLObject var85, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return f17062(var1, var85, var2, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f17064(final SubLObject var85, final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        module0252.f16273(module0137.f8955($ic1$), var1, var85, var2, var3);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17065(final SubLObject var1, final SubLObject var85, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        assert NIL != Types.function_spec_p(var85) : var85;
        return module0252.f16285(module0137.f8955($ic1$), var1, var85, var2, var3, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f17066(final SubLObject var1, final SubLObject var85, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0252.f16287(module0137.f8955($ic1$), var1, var85, var2, var3, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f17067(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return Sequences.length(f17028(var1, var2, var3));
    }
    
    public static SubLObject f17068(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return Sequences.length(f17031(var1, var2, var3));
    }
    
    public static SubLObject f17069(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return Sequences.length(f17033(var1, var2, var3));
    }
    
    public static SubLObject f17070(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return Sequences.length(f17036(var1, var2, var3));
    }
    
    public static SubLObject f17071(final SubLObject var1, final SubLObject var86, final SubLObject var87, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var88 = SubLProcess.currentSubLThread();
        assert NIL != module0173.f10955(var1) : var1;
        assert NIL != module0173.f10955(var86) : var86;
        assert NIL != Types.integerp(var87) : var87;
        if (NIL != module0269.f17706(var1) && NIL != module0269.f17705(var86) && NIL != module0004.f104(var87, module0146.$g1959$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            SubLObject var89 = (SubLObject)NIL;
            final SubLObject var90 = module0139.$g1635$.currentBinding(var88);
            try {
                module0139.$g1635$.bind(module0139.f9007(), var88);
                final SubLObject var10_88 = module0139.$g1636$.currentBinding(var88);
                try {
                    module0139.$g1636$.bind(module0139.f9007(), var88);
                    final SubLObject var10_89 = module0139.$g1646$.currentBinding(var88);
                    try {
                        module0139.$g1646$.bind(module0139.f9007(), var88);
                        final SubLObject var10_90 = module0139.$g1647$.currentBinding(var88);
                        try {
                            module0139.$g1647$.bind(module0139.f9007(), var88);
                            final SubLObject var10_91 = module0139.$g1635$.currentBinding(var88);
                            try {
                                module0139.$g1635$.bind(module0139.$g1646$.getDynamicValue(var88), var88);
                                module0251.f16202(module0137.f8955($ic102$), var86, var2, var3);
                            }
                            finally {
                                module0139.$g1635$.rebind(var10_91, var88);
                            }
                            final SubLObject var10_92 = module0141.$g1699$.currentBinding(var88);
                            final SubLObject var91 = module0141.$g1691$.currentBinding(var88);
                            try {
                                module0141.$g1699$.bind(var87, var88);
                                module0141.$g1691$.bind((SubLObject)NIL, var88);
                                try {
                                    module0252.f16272(module0137.f8955($ic1$), var1, (SubLObject)$ic103$, var2, var3);
                                }
                                finally {
                                    final SubLObject var10_93 = Threads.$is_thread_performing_cleanupP$.currentBinding(var88);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var88);
                                        var89 = module0141.$g1691$.getDynamicValue(var88);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var10_93, var88);
                                    }
                                }
                            }
                            finally {
                                module0141.$g1691$.rebind(var91, var88);
                                module0141.$g1699$.rebind(var10_92, var88);
                            }
                            module0139.f9011(module0139.$g1647$.getDynamicValue(var88));
                        }
                        finally {
                            module0139.$g1647$.rebind(var10_90, var88);
                        }
                        module0139.f9011(module0139.$g1646$.getDynamicValue(var88));
                    }
                    finally {
                        module0139.$g1646$.rebind(var10_89, var88);
                    }
                    module0139.f9011(module0139.$g1636$.getDynamicValue(var88));
                }
                finally {
                    module0139.$g1636$.rebind(var10_88, var88);
                }
                module0139.f9011(module0139.$g1635$.getDynamicValue(var88));
            }
            finally {
                module0139.$g1635$.rebind(var90, var88);
            }
            return var89;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17072(final SubLObject var1, final SubLObject var94, final SubLObject var87, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var95 = SubLProcess.currentSubLThread();
        assert NIL != module0173.f10955(var1) : var1;
        assert NIL != module0173.f10955(var94) : var94;
        assert NIL != Types.integerp(var87) : var87;
        if (NIL != module0269.f17706(var1) && NIL != module0173.f10955(var94) && NIL != module0004.f104(var87, module0146.$g1959$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            SubLObject var96 = (SubLObject)NIL;
            final SubLObject var97 = module0139.$g1635$.currentBinding(var95);
            try {
                module0139.$g1635$.bind(module0139.f9007(), var95);
                final SubLObject var10_95 = module0139.$g1636$.currentBinding(var95);
                try {
                    module0139.$g1636$.bind(module0139.f9007(), var95);
                    final SubLObject var10_96 = module0139.$g1646$.currentBinding(var95);
                    try {
                        module0139.$g1646$.bind(module0139.f9007(), var95);
                        final SubLObject var10_97 = module0139.$g1647$.currentBinding(var95);
                        try {
                            module0139.$g1647$.bind(module0139.f9007(), var95);
                            final SubLObject var10_98 = module0139.$g1635$.currentBinding(var95);
                            try {
                                module0139.$g1635$.bind(module0139.$g1646$.getDynamicValue(var95), var95);
                                module0251.f16202(module0137.f8955($ic108$), var94, var2, var3);
                                if (NIL != module0269.f17705(var94)) {
                                    module0251.f16202(module0137.f8955($ic102$), var94, var2, var3);
                                }
                            }
                            finally {
                                module0139.$g1635$.rebind(var10_98, var95);
                            }
                            final SubLObject var10_99 = module0141.$g1699$.currentBinding(var95);
                            final SubLObject var98 = module0141.$g1691$.currentBinding(var95);
                            try {
                                module0141.$g1699$.bind(var87, var95);
                                module0141.$g1691$.bind((SubLObject)NIL, var95);
                                try {
                                    module0252.f16272(module0137.f8955($ic1$), var1, (SubLObject)$ic103$, var2, var3);
                                }
                                finally {
                                    final SubLObject var10_100 = Threads.$is_thread_performing_cleanupP$.currentBinding(var95);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var95);
                                        var96 = module0141.$g1691$.getDynamicValue(var95);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var10_100, var95);
                                    }
                                }
                            }
                            finally {
                                module0141.$g1691$.rebind(var98, var95);
                                module0141.$g1699$.rebind(var10_99, var95);
                            }
                            module0139.f9011(module0139.$g1647$.getDynamicValue(var95));
                        }
                        finally {
                            module0139.$g1647$.rebind(var10_97, var95);
                        }
                        module0139.f9011(module0139.$g1646$.getDynamicValue(var95));
                    }
                    finally {
                        module0139.$g1646$.rebind(var10_96, var95);
                    }
                    module0139.f9011(module0139.$g1636$.getDynamicValue(var95));
                }
                finally {
                    module0139.$g1636$.rebind(var10_95, var95);
                }
                module0139.f9011(module0139.$g1635$.getDynamicValue(var95));
            }
            finally {
                module0139.$g1635$.rebind(var97, var95);
            }
            return var96;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17073(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0226.f14882(var1, module0141.$g1699$.getDynamicValue(var2), (SubLObject)UNPROVIDED);
        SubLObject var4 = Types.sublisp_null(var3);
        final SubLObject var5 = module0139.$g1635$.currentBinding(var2);
        try {
            module0139.$g1635$.bind(module0139.$g1646$.getDynamicValue(var2), var2);
            if (NIL == var4) {
                SubLObject var6;
                SubLObject var7;
                for (var6 = var3, var7 = (SubLObject)NIL, var7 = var6.first(); NIL == var4 && NIL != var6; var4 = (SubLObject)makeBoolean(NIL == module0249.f16020(var7, (SubLObject)UNPROVIDED)), var6 = var6.rest(), var7 = var6.first()) {}
            }
            if (NIL == var4) {
                SubLObject var6;
                SubLObject var8;
                for (var6 = module0226.f14935(var1, module0141.$g1699$.getDynamicValue(var2), (SubLObject)UNPROVIDED), var8 = (SubLObject)NIL, var8 = var6.first(); NIL == var4 && NIL != var6; var4 = (SubLObject)makeBoolean(NIL == module0249.f16020(var8, (SubLObject)UNPROVIDED)), var6 = var6.rest(), var8 = var6.first()) {}
            }
        }
        finally {
            module0139.$g1635$.rebind(var5, var2);
        }
        if (NIL == var4) {
            module0141.$g1691$.setDynamicValue((SubLObject)ConsesLow.cons(var1, module0141.$g1691$.getDynamicValue(var2)), var2);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17074() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return $g2505$.getDynamicValue(var4);
    }
    
    public static SubLObject f17075(final SubLObject var105, final SubLObject var106) {
        SubLObject var108;
        final SubLObject var107 = var108 = var105.rest();
        SubLObject var109 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var108, var107, (SubLObject)$ic113$);
        var109 = var108.first();
        final SubLObject var110;
        var108 = (var110 = var108.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic114$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic115$, var109)), ConsesLow.append(var110, (SubLObject)NIL));
    }
    
    public static SubLObject f17076(final SubLObject var111) {
        final SubLThread var112 = SubLProcess.currentSubLThread();
        return module0067.f4884($g2506$.getDynamicValue(var112), var111, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f17077(final SubLObject var105, final SubLObject var106) {
        SubLObject var108;
        final SubLObject var107 = var108 = var105.rest();
        SubLObject var109 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var108, var107, (SubLObject)$ic113$);
        var109 = var108.first();
        final SubLObject var110;
        var108 = (var110 = var108.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic114$, (SubLObject)$ic116$, (SubLObject)ConsesLow.list((SubLObject)$ic117$, var109), ConsesLow.append(var110, (SubLObject)NIL));
    }
    
    public static SubLObject f17078(final SubLObject var109) {
        final SubLThread var110 = SubLProcess.currentSubLThread();
        SubLObject var111 = var109;
        SubLObject var112 = (SubLObject)NIL;
        var112 = var111.first();
        while (NIL != var111) {
            final SubLObject var113 = var112.first();
            SubLObject var33_115 = conses_high.second(var112);
            SubLObject var114 = (SubLObject)NIL;
            var114 = var33_115.first();
            while (NIL != var33_115) {
                final SubLObject var115 = var114.first();
                SubLObject var33_116 = var114.rest();
                SubLObject var116 = (SubLObject)NIL;
                var116 = var33_116.first();
                while (NIL != var33_116) {
                    final SubLObject var117 = module0139.$g1635$.currentBinding(var110);
                    try {
                        module0139.$g1635$.bind(module0139.f9007(), var110);
                        module0251.f16202(module0137.f8955($ic102$), var116, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0067.f4886($g2506$.getDynamicValue(var110), (SubLObject)ConsesLow.list(var113, var115, var116), module0139.$g1635$.getDynamicValue(var110));
                        module0139.f9011(module0139.$g1635$.getDynamicValue(var110));
                    }
                    finally {
                        module0139.$g1635$.rebind(var117, var110);
                    }
                    var33_116 = var33_116.rest();
                    var116 = var33_116.first();
                }
                var33_115 = var33_115.rest();
                var114 = var33_115.first();
            }
            var111 = var111.rest();
            var112 = var111.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17079(final SubLObject var1) {
        SubLObject var2 = (SubLObject)NIL;
        if (NIL == var2) {
            SubLObject var3 = f17074();
            SubLObject var4 = (SubLObject)NIL;
            var4 = var3.first();
            while (NIL == var2 && NIL != var3) {
                SubLObject var6;
                final SubLObject var5 = var6 = var4.first();
                if (NIL != module0141.f9195() && (var5.numE((SubLObject)ONE_INTEGER) || var5.numE((SubLObject)TWO_INTEGER))) {
                    var6 = module0107.f7613(var5);
                }
                if (NIL == var2) {
                    SubLObject var55_122 = conses_high.second(var4);
                    SubLObject var7 = (SubLObject)NIL;
                    var7 = var55_122.first();
                    while (NIL == var2 && NIL != var55_122) {
                        final SubLObject var8 = var7.first();
                        final SubLObject var9 = var7.rest();
                        SubLObject var116_124 = (SubLObject)NIL;
                        SubLObject var10 = (SubLObject)NIL;
                        final SubLObject var11 = var8;
                        if (var11.eql($ic108$)) {
                            var116_124 = module0226.f14882(var1, var6, (SubLObject)UNPROVIDED);
                        }
                        else if (var11.eql($ic102$)) {
                            var116_124 = module0226.f14935(var1, var6, (SubLObject)UNPROVIDED);
                        }
                        if (NIL == var116_124) {
                            var10 = (SubLObject)T;
                        }
                        else if (NIL == var10) {
                            SubLObject var55_123 = var9;
                            SubLObject var12 = (SubLObject)NIL;
                            var12 = var55_123.first();
                            while (NIL == var10 && NIL != var55_123) {
                                final SubLObject var13 = (SubLObject)ConsesLow.list(var5, var8, var12);
                                if (NIL == var10) {
                                    SubLObject var55_124 = var116_124;
                                    SubLObject var14 = (SubLObject)NIL;
                                    var14 = var55_124.first();
                                    while (NIL == var10 && NIL != var55_124) {
                                        if (NIL != module0249.f16020(var14, f17076(var13))) {
                                            var10 = (SubLObject)T;
                                        }
                                        var55_124 = var55_124.rest();
                                        var14 = var55_124.first();
                                    }
                                }
                                var55_123 = var55_123.rest();
                                var12 = var55_123.first();
                            }
                        }
                        if (NIL == var10) {
                            var2 = (SubLObject)T;
                        }
                        var55_122 = var55_122.rest();
                        var7 = var55_122.first();
                    }
                }
                var3 = var3.rest();
                var4 = var3.first();
            }
        }
        return (SubLObject)makeBoolean(NIL == var2);
    }
    
    public static SubLObject f17080(final SubLObject var1, final SubLObject var109) {
        final SubLThread var110 = SubLProcess.currentSubLThread();
        SubLObject var111 = (SubLObject)NIL;
        final SubLObject var112 = $g2505$.currentBinding(var110);
        final SubLObject var113 = $g2506$.currentBinding(var110);
        try {
            $g2505$.bind(var109, var110);
            $g2506$.bind(module0067.f4880((SubLObject)EQUAL, (SubLObject)UNPROVIDED), var110);
            f17078(var109);
            var111 = module0250.f16190(module0137.f8955($ic1$), var1, (SubLObject)$ic118$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            $g2506$.rebind(var113, var110);
            $g2505$.rebind(var112, var110);
        }
        return var111;
    }
    
    public static SubLObject f17081(final SubLObject var130) {
        final SubLThread var131 = SubLProcess.currentSubLThread();
        if (NIL != module0141.f9195()) {
            module0141.$g1691$.setDynamicValue(module0035.f2057(module0137.f8955($ic9$), var130, module0141.$g1691$.getDynamicValue(var131), (SubLObject)UNPROVIDED), var131);
        }
        else {
            module0141.$g1691$.setDynamicValue(module0035.f2057(module0137.f8955($ic1$), var130, module0141.$g1691$.getDynamicValue(var131), (SubLObject)UNPROVIDED), var131);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17082(final SubLObject var130, final SubLObject var131) {
        SubLObject var132 = (SubLObject)NIL;
        if (module0137.f8955((SubLObject)UNPROVIDED).eql(module0137.f8955($ic1$))) {
            final SubLObject var133 = $ic119$;
            if (NIL != module0158.f10010(var130, (SubLObject)ONE_INTEGER, var133)) {
                final SubLObject var134 = module0158.f10011(var130, (SubLObject)ONE_INTEGER, var133);
                SubLObject var135 = var132;
                final SubLObject var136 = (SubLObject)NIL;
                while (NIL == var135) {
                    final SubLObject var137 = module0052.f3695(var134, var136);
                    final SubLObject var138 = (SubLObject)makeBoolean(!var136.eql(var137));
                    if (NIL != var138) {
                        SubLObject var139 = (SubLObject)NIL;
                        try {
                            var139 = module0158.f10316(var137, (SubLObject)$ic120$, (SubLObject)$ic121$, (SubLObject)NIL);
                            SubLObject var135_140 = var132;
                            final SubLObject var136_141 = (SubLObject)NIL;
                            while (NIL == var135_140) {
                                final SubLObject var140 = module0052.f3695(var139, var136_141);
                                final SubLObject var138_143 = (SubLObject)makeBoolean(!var136_141.eql(var140));
                                if (NIL != var138_143 && var131.eql(conses_high.third(module0178.f11285(var140)))) {
                                    var132 = (SubLObject)T;
                                }
                                var135_140 = (SubLObject)makeBoolean(NIL == var138_143 || NIL != var132);
                            }
                        }
                        finally {
                            final SubLObject var141 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                                if (NIL != var139) {
                                    module0158.f10319(var139);
                                }
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var141);
                            }
                        }
                    }
                    var135 = (SubLObject)makeBoolean(NIL == var138 || NIL != var132);
                }
            }
        }
        else {
            final SubLObject var133 = $ic122$;
            if (NIL != module0158.f10010(var130, (SubLObject)ONE_INTEGER, var133)) {
                final SubLObject var134 = module0158.f10011(var130, (SubLObject)ONE_INTEGER, var133);
                SubLObject var135 = var132;
                final SubLObject var136 = (SubLObject)NIL;
                while (NIL == var135) {
                    final SubLObject var137 = module0052.f3695(var134, var136);
                    final SubLObject var138 = (SubLObject)makeBoolean(!var136.eql(var137));
                    if (NIL != var138) {
                        SubLObject var139 = (SubLObject)NIL;
                        try {
                            var139 = module0158.f10316(var137, (SubLObject)$ic120$, (SubLObject)$ic121$, (SubLObject)NIL);
                            SubLObject var135_141 = var132;
                            final SubLObject var136_142 = (SubLObject)NIL;
                            while (NIL == var135_141) {
                                final SubLObject var140 = module0052.f3695(var139, var136_142);
                                final SubLObject var138_144 = (SubLObject)makeBoolean(!var136_142.eql(var140));
                                if (NIL != var138_144 && var131.eql(conses_high.third(module0178.f11285(var140)))) {
                                    var132 = (SubLObject)T;
                                }
                                var135_141 = (SubLObject)makeBoolean(NIL == var138_144 || NIL != var132);
                            }
                        }
                        finally {
                            final SubLObject var142 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                                if (NIL != var139) {
                                    module0158.f10319(var139);
                                }
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var142);
                            }
                        }
                    }
                    var135 = (SubLObject)makeBoolean(NIL == var138 || NIL != var132);
                }
            }
        }
        return var132;
    }
    
    public static SubLObject f17083(final SubLObject var1, final SubLObject var109) {
        final SubLThread var110 = SubLProcess.currentSubLThread();
        SubLObject var111 = (SubLObject)NIL;
        final SubLObject var112 = module0141.$g1691$.currentBinding(var110);
        try {
            module0141.$g1691$.bind((SubLObject)NIL, var110);
            try {
                final SubLObject var10_147 = $g2505$.currentBinding(var110);
                final SubLObject var113 = $g2506$.currentBinding(var110);
                try {
                    $g2505$.bind(var109, var110);
                    $g2506$.bind(module0067.f4880((SubLObject)EQUAL, (SubLObject)UNPROVIDED), var110);
                    f17078(var109);
                    final SubLObject var10_148 = module0141.$g1670$.currentBinding(var110);
                    final SubLObject var13_149 = module0141.$g1671$.currentBinding(var110);
                    final SubLObject var114 = module0141.$g1672$.currentBinding(var110);
                    final SubLObject var115 = module0141.$g1674$.currentBinding(var110);
                    final SubLObject var116 = module0137.$g1605$.currentBinding(var110);
                    try {
                        module0141.$g1670$.bind(module0137.f8955($ic1$), var110);
                        module0141.$g1671$.bind(module0244.f15739(module0137.f8955($ic1$)), var110);
                        module0141.$g1672$.bind(module0244.f15746(module0137.f8955($ic1$)), var110);
                        module0141.$g1674$.bind((SubLObject)NIL, var110);
                        module0137.$g1605$.bind(module0137.f8955($ic1$), var110);
                        final SubLObject var117 = (SubLObject)NIL;
                        final SubLObject var10_149 = module0141.$g1714$.currentBinding(var110);
                        final SubLObject var13_150 = module0141.$g1715$.currentBinding(var110);
                        try {
                            module0141.$g1714$.bind((NIL != var117) ? var117 : module0141.f9283(), var110);
                            module0141.$g1715$.bind((SubLObject)((NIL != var117) ? $ic51$ : module0141.$g1715$.getDynamicValue(var110)), var110);
                            if (NIL != var117 && NIL != module0136.f8864() && NIL == module0141.f9279(var117)) {
                                final SubLObject var118 = module0136.$g1591$.getDynamicValue(var110);
                                if (var118.eql((SubLObject)$ic52$)) {
                                    module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic53$, var117, (SubLObject)$ic54$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                }
                                else if (var118.eql((SubLObject)$ic55$)) {
                                    module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic56$, (SubLObject)$ic53$, var117, (SubLObject)$ic54$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                }
                                else if (var118.eql((SubLObject)$ic57$)) {
                                    Errors.warn((SubLObject)$ic53$, var117, (SubLObject)$ic54$);
                                }
                                else {
                                    Errors.warn((SubLObject)$ic58$, module0136.$g1591$.getDynamicValue(var110));
                                    Errors.cerror((SubLObject)$ic56$, (SubLObject)$ic53$, var117, (SubLObject)$ic54$);
                                }
                            }
                            final SubLObject var10_150 = module0141.$g1710$.currentBinding(var110);
                            final SubLObject var13_151 = module0141.$g1677$.currentBinding(var110);
                            final SubLObject var14_154 = module0138.$g1619$.currentBinding(var110);
                            try {
                                module0141.$g1710$.bind($ic123$, var110);
                                module0141.$g1677$.bind(module0141.f9210(), var110);
                                module0138.$g1619$.bind(module0244.f15780(module0137.f8955((SubLObject)UNPROVIDED)), var110);
                                final SubLObject var119 = module0139.f9036();
                                final SubLObject var10_151 = module0139.$g1635$.currentBinding(var110);
                                try {
                                    module0139.$g1635$.bind((var119 == $ic124$) ? module0139.$g1635$.getDynamicValue(var110) : module0139.f9038(var119), var110);
                                    final SubLObject var10_152 = module0139.$g1636$.currentBinding(var110);
                                    try {
                                        module0139.$g1636$.bind((var119 == $ic124$) ? module0139.$g1636$.getDynamicValue(var110) : module0139.f9038(var119), var110);
                                        final SubLObject var10_153 = module0141.$g1685$.currentBinding(var110);
                                        final SubLObject var13_152 = module0141.$g1686$.currentBinding(var110);
                                        final SubLObject var14_155 = module0141.$g1683$.currentBinding(var110);
                                        final SubLObject var22_161 = module0141.$g1684$.currentBinding(var110);
                                        final SubLObject var23_162 = module0141.$g1674$.currentBinding(var110);
                                        try {
                                            module0141.$g1685$.bind((SubLObject)NIL, var110);
                                            module0141.$g1686$.bind((SubLObject)NIL, var110);
                                            module0141.$g1683$.bind((SubLObject)NIL, var110);
                                            module0141.$g1684$.bind((SubLObject)NIL, var110);
                                            module0141.$g1674$.bind((SubLObject)NIL, var110);
                                            final SubLObject var120 = module0138.$g1626$.getGlobalValue();
                                            SubLObject var121 = (SubLObject)NIL;
                                            try {
                                                var121 = ReadWriteLocks.rw_lock_seize_read_lock(var120);
                                                f17084(var1);
                                            }
                                            finally {
                                                if (NIL != var121) {
                                                    ReadWriteLocks.rw_lock_release_read_lock(var120);
                                                }
                                            }
                                        }
                                        finally {
                                            module0141.$g1674$.rebind(var23_162, var110);
                                            module0141.$g1684$.rebind(var22_161, var110);
                                            module0141.$g1683$.rebind(var14_155, var110);
                                            module0141.$g1686$.rebind(var13_152, var110);
                                            module0141.$g1685$.rebind(var10_153, var110);
                                        }
                                        if (var119 == $ic125$) {
                                            module0139.f9012(module0139.$g1636$.getDynamicValue(var110));
                                        }
                                    }
                                    finally {
                                        module0139.$g1636$.rebind(var10_152, var110);
                                    }
                                    if (var119 == $ic125$) {
                                        module0139.f9012(module0139.$g1635$.getDynamicValue(var110));
                                    }
                                }
                                finally {
                                    module0139.$g1635$.rebind(var10_151, var110);
                                }
                            }
                            finally {
                                module0138.$g1619$.rebind(var14_154, var110);
                                module0141.$g1677$.rebind(var13_151, var110);
                                module0141.$g1710$.rebind(var10_150, var110);
                            }
                        }
                        finally {
                            module0141.$g1715$.rebind(var13_150, var110);
                            module0141.$g1714$.rebind(var10_149, var110);
                        }
                    }
                    finally {
                        module0137.$g1605$.rebind(var116, var110);
                        module0141.$g1674$.rebind(var115, var110);
                        module0141.$g1672$.rebind(var114, var110);
                        module0141.$g1671$.rebind(var13_149, var110);
                        module0141.$g1670$.rebind(var10_148, var110);
                    }
                }
                finally {
                    $g2506$.rebind(var113, var110);
                    $g2505$.rebind(var10_147, var110);
                }
            }
            finally {
                final SubLObject var10_154 = Threads.$is_thread_performing_cleanupP$.currentBinding(var110);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var110);
                    var111 = module0141.$g1691$.getDynamicValue(var110);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var10_154, var110);
                }
            }
        }
        finally {
            module0141.$g1691$.rebind(var112, var110);
        }
        return var111;
    }
    
    public static SubLObject f17084(final SubLObject var130) {
        final SubLThread var131 = SubLProcess.currentSubLThread();
        if (NIL == module0249.f16020(var130, (SubLObject)UNPROVIDED)) {
            module0249.f16036(var130, (SubLObject)UNPROVIDED);
            final SubLObject var132 = module0200.f12443(module0137.f8955((SubLObject)UNPROVIDED));
            SubLObject var133;
            SubLObject var134;
            SubLObject var135;
            SubLObject var136;
            SubLObject var37_167;
            SubLObject var137;
            SubLObject var138;
            SubLObject var139;
            SubLObject var140;
            SubLObject var141;
            SubLObject var10_168;
            SubLObject var40_169;
            SubLObject var142;
            SubLObject var143;
            SubLObject var10_169;
            SubLObject var144;
            SubLObject var145;
            SubLObject var146;
            SubLObject var147;
            SubLObject var148;
            SubLObject var149;
            SubLObject var150;
            SubLObject var151;
            SubLObject var166_172;
            SubLObject var152;
            SubLObject var10_170;
            SubLObject var154;
            SubLObject var153;
            SubLObject var155;
            SubLObject var156;
            SubLObject var157;
            SubLObject var158;
            SubLObject var159;
            SubLObject var160;
            for (var133 = (SubLObject)NIL, var133 = var132; NIL == module0141.$g1685$.getDynamicValue(var131) && NIL != var133; var133 = var133.rest()) {
                var134 = var133.first();
                var135 = module0137.$g1605$.currentBinding(var131);
                var136 = module0141.$g1674$.currentBinding(var131);
                try {
                    module0137.$g1605$.bind(var134, var131);
                    module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var131)) : module0141.$g1674$.getDynamicValue(var131)), var131);
                    var37_167 = module0228.f15229(var130);
                    if (NIL != module0138.f8992(var37_167)) {
                        var137 = module0242.f15664(var37_167, module0137.f8955((SubLObject)UNPROVIDED));
                        if (NIL != var137) {
                            var138 = module0245.f15834(var137, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                            if (NIL != var138) {
                                for (var139 = module0066.f4838(module0067.f4891(var138)); NIL == module0141.$g1685$.getDynamicValue(var131) && NIL == module0066.f4841(var139); var139 = module0066.f4840(var139)) {
                                    var131.resetMultipleValues();
                                    var140 = module0066.f4839(var139);
                                    var141 = var131.secondMultipleValue();
                                    var131.resetMultipleValues();
                                    if (NIL != module0147.f9507(var140)) {
                                        var10_168 = module0138.$g1623$.currentBinding(var131);
                                        try {
                                            module0138.$g1623$.bind(var140, var131);
                                            for (var40_169 = module0066.f4838(module0067.f4891(var141)); NIL == module0141.$g1685$.getDynamicValue(var131) && NIL == module0066.f4841(var40_169); var40_169 = module0066.f4840(var40_169)) {
                                                var131.resetMultipleValues();
                                                var142 = module0066.f4839(var40_169);
                                                var143 = var131.secondMultipleValue();
                                                var131.resetMultipleValues();
                                                if (NIL != module0141.f9289(var142)) {
                                                    var10_169 = module0138.$g1624$.currentBinding(var131);
                                                    try {
                                                        module0138.$g1624$.bind(var142, var131);
                                                        var144 = var143;
                                                        if (NIL != module0077.f5302(var144)) {
                                                            var145 = module0077.f5333(var144);
                                                            for (var146 = module0032.f1741(var145), var147 = (SubLObject)NIL, var147 = module0032.f1742(var146, var145); NIL == module0141.$g1685$.getDynamicValue(var131) && NIL == module0032.f1744(var146, var147); var147 = module0032.f1743(var147)) {
                                                                var148 = module0032.f1745(var146, var147);
                                                                if (NIL != module0032.f1746(var147, var148) && NIL != f17079(var148)) {
                                                                    if (NIL != f17082(var148, var130)) {
                                                                        f17081(var148);
                                                                    }
                                                                    f17084(var148);
                                                                }
                                                            }
                                                        }
                                                        else if (var144.isList()) {
                                                            if (NIL == module0141.$g1685$.getDynamicValue(var131)) {
                                                                var149 = var144;
                                                                var150 = (SubLObject)NIL;
                                                                var150 = var149.first();
                                                                while (NIL == module0141.$g1685$.getDynamicValue(var131) && NIL != var149) {
                                                                    if (NIL != f17079(var150)) {
                                                                        if (NIL != f17082(var150, var130)) {
                                                                            f17081(var150);
                                                                        }
                                                                        f17084(var150);
                                                                    }
                                                                    var149 = var149.rest();
                                                                    var150 = var149.first();
                                                                }
                                                            }
                                                        }
                                                        else {
                                                            Errors.error((SubLObject)$ic59$, var144);
                                                        }
                                                    }
                                                    finally {
                                                        module0138.$g1624$.rebind(var10_169, var131);
                                                    }
                                                }
                                            }
                                            module0066.f4842(var40_169);
                                        }
                                        finally {
                                            module0138.$g1623$.rebind(var10_168, var131);
                                        }
                                    }
                                }
                                module0066.f4842(var139);
                            }
                        }
                        else {
                            module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic60$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                    }
                    else if (NIL != module0155.f9785(var37_167, (SubLObject)UNPROVIDED)) {
                        var151 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var131), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var131), module0137.f8955((SubLObject)UNPROVIDED)));
                        for (var166_172 = (SubLObject)NIL, var166_172 = var151; NIL == module0141.$g1685$.getDynamicValue(var131) && NIL != var166_172; var166_172 = var166_172.rest()) {
                            var152 = var166_172.first();
                            var10_170 = module0138.$g1625$.currentBinding(var131);
                            try {
                                module0138.$g1625$.bind(var152, var131);
                                var153 = (var154 = Functions.funcall(var152, var37_167));
                                if (NIL != module0077.f5302(var154)) {
                                    var155 = module0077.f5333(var154);
                                    for (var156 = module0032.f1741(var155), var157 = (SubLObject)NIL, var157 = module0032.f1742(var156, var155); NIL == module0141.$g1685$.getDynamicValue(var131) && NIL == module0032.f1744(var156, var157); var157 = module0032.f1743(var157)) {
                                        var158 = module0032.f1745(var156, var157);
                                        if (NIL != module0032.f1746(var157, var158) && NIL != f17079(var158)) {
                                            if (NIL != f17082(var158, var130)) {
                                                f17081(var158);
                                            }
                                            f17084(var158);
                                        }
                                    }
                                }
                                else if (var154.isList()) {
                                    if (NIL == module0141.$g1685$.getDynamicValue(var131)) {
                                        var159 = var154;
                                        var160 = (SubLObject)NIL;
                                        var160 = var159.first();
                                        while (NIL == module0141.$g1685$.getDynamicValue(var131) && NIL != var159) {
                                            if (NIL != f17079(var160)) {
                                                if (NIL != f17082(var160, var130)) {
                                                    f17081(var160);
                                                }
                                                f17084(var160);
                                            }
                                            var159 = var159.rest();
                                            var160 = var159.first();
                                        }
                                    }
                                }
                                else {
                                    Errors.error((SubLObject)$ic59$, var154);
                                }
                            }
                            finally {
                                module0138.$g1625$.rebind(var10_170, var131);
                            }
                        }
                    }
                }
                finally {
                    module0141.$g1674$.rebind(var136, var131);
                    module0137.$g1605$.rebind(var135, var131);
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17085(final SubLObject var5, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != Types.listp(var5) : var5;
        return module0252.f16262(module0137.f8955($ic1$), var5, var2, var3);
    }
    
    public static SubLObject f17027(final SubLObject var5, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != Types.listp(var5) : var5;
        return module0252.f16260(module0137.f8955($ic1$), var5, var2, var3, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f17086(final SubLObject var5, SubLObject var81, SubLObject var2, SubLObject var3) {
        if (var81 == UNPROVIDED) {
            var81 = (SubLObject)NIL;
        }
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != Types.listp(var5) : var5;
        return module0252.f16314(module0137.f8955($ic1$), var5, var81, var2, var3);
    }
    
    public static SubLObject f17087(final SubLObject var5, SubLObject var81, SubLObject var2, SubLObject var3) {
        if (var81 == UNPROVIDED) {
            var81 = (SubLObject)NIL;
        }
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != Types.listp(var5) : var5;
        if (NIL != module0035.f1998(var5)) {
            SubLObject var82 = (SubLObject)NIL;
            SubLObject var83 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var5, var5, (SubLObject)$ic133$);
            var82 = var5.first();
            SubLObject var84 = var5.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var84, var5, (SubLObject)$ic133$);
            var83 = var84.first();
            var84 = var84.rest();
            if (NIL == var84) {
                if (var82.eql(var83)) {
                    return (SubLObject)ConsesLow.list(var82);
                }
                final SubLObject var85 = f17088(var82);
                final SubLObject var86 = f17088(var83);
                if (NIL == var85 && NIL == var86) {
                    return (SubLObject)NIL;
                }
                if (NIL == var85) {
                    if (NIL != f17089(var82, var83, var2, var3)) {
                        return (SubLObject)ConsesLow.list(var82);
                    }
                    return (SubLObject)NIL;
                }
                else if (NIL == var86) {
                    if (NIL != f17089(var83, var82, var2, var3)) {
                        return (SubLObject)ConsesLow.list(var83);
                    }
                    return (SubLObject)NIL;
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)$ic133$);
            }
        }
        return module0252.f16316(module0137.f8955($ic1$), var5, var81, var2, var3, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f17088(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != module0222.f14635($ic1$, var1, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED) || NIL != module0222.f14635($ic9$, var1, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f17089(final SubLObject var180, final SubLObject var181, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var180) : var180;
        assert NIL != module0173.f10955(var181) : var181;
        if (!var180.eql(var181) && NIL == f17088(var181)) {
            return (SubLObject)NIL;
        }
        return module0252.f16335(module0137.f8955($ic1$), var180, var181, var2, var3);
    }
    
    public static SubLObject f17090(final SubLObject var180, final SubLObject var181) {
        final SubLThread var182 = SubLProcess.currentSubLThread();
        SubLObject var183 = (SubLObject)NIL;
        final SubLObject var184 = module0147.$g2094$.currentBinding(var182);
        final SubLObject var185 = module0147.$g2095$.currentBinding(var182);
        try {
            module0147.$g2094$.bind((SubLObject)$ic141$, var182);
            module0147.$g2095$.bind($ic142$, var182);
            var183 = f17089(var180, var181, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var185, var182);
            module0147.$g2094$.rebind(var184, var182);
        }
        return var183;
    }
    
    public static SubLObject f17091(final SubLObject var180, final SubLObject var181, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return f17089(var180, var181, var2, var3);
    }
    
    public static SubLObject f17092(final SubLObject var181, final SubLObject var180, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return f17089(var180, var181, var2, var3);
    }
    
    public static SubLObject f17093(final SubLObject var181, final SubLObject var180, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var181) : var181;
        assert NIL != module0173.f10955(var180) : var180;
        return f17089(var180, var181, var2, var3);
    }
    
    public static SubLObject f17094(final SubLObject var180, final SubLObject var181, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var180) : var180;
        assert NIL != module0173.f10955(var181) : var181;
        if (!var180.eql(var181) && NIL == f17088(var181)) {
            return (SubLObject)NIL;
        }
        return module0252.f16335(module0137.f8955($ic9$), var180, var181, var2, var3);
    }
    
    public static SubLObject f17095(final SubLObject var181, final SubLObject var180, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var180) : var180;
        assert NIL != module0173.f10955(var181) : var181;
        return f17094(var180, var181, var2, var3);
    }
    
    public static SubLObject f17096(final SubLObject var181, final SubLObject var180, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0252.f16345(module0137.f8955($ic1$), var181, var180, var2, var3);
    }
    
    public static SubLObject f17097(final SubLObject var181, final SubLObject var180, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0252.f16345(module0137.f8955($ic9$), var181, var180, var2, var3);
    }
    
    public static SubLObject f17098(final SubLObject var180, final SubLObject var182, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var180) : var180;
        assert NIL != Types.listp(var182) : var182;
        return module0252.f16352(module0137.f8955($ic1$), var180, var182, var2, var3);
    }
    
    public static SubLObject f17099(final SubLObject var180, final SubLObject var182, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return f17098(var180, var182, var2, var3);
    }
    
    public static SubLObject f17100(final SubLObject var180, final SubLObject var182) {
        final SubLThread var183 = SubLProcess.currentSubLThread();
        SubLObject var184 = (SubLObject)NIL;
        final SubLObject var185 = module0147.$g2094$.currentBinding(var183);
        final SubLObject var186 = module0147.$g2095$.currentBinding(var183);
        try {
            module0147.$g2094$.bind((SubLObject)$ic141$, var183);
            module0147.$g2095$.bind($ic142$, var183);
            var184 = f17098(var180, var182, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var186, var183);
            module0147.$g2094$.rebind(var185, var183);
        }
        return var184;
    }
    
    public static SubLObject f17101(final SubLObject var180, final SubLObject var182, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0252.f16352(module0137.f8955($ic9$), var180, var182, var2, var3);
    }
    
    public static SubLObject f17102(final SubLObject var180, final SubLObject var183, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var180) : var180;
        assert NIL != module0173.f10955(var183) : var183;
        return module0254.f16488(module0137.f8955($ic1$), var180, var183, var2, var3);
    }
    
    public static SubLObject f17103(final SubLObject var180, final SubLObject var183, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return f17102(var180, var183, var2, var3);
    }
    
    public static SubLObject f17104(final SubLObject var181, final SubLObject var180, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return f17102(var180, var181, var2, var3);
    }
    
    public static SubLObject f17105(final SubLObject var1, final SubLObject var183, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0254.f16487(module0137.f8955($ic1$), var1, var183, var2, var3);
    }
    
    public static SubLObject f17106(final SubLObject var180, final SubLObject var183, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var180) : var180;
        assert NIL != module0173.f10955(var183) : var183;
        return module0252.f16346(module0137.f8955($ic9$), var180, var183, var2, var3);
    }
    
    public static SubLObject f17107(final SubLObject var181, final SubLObject var180, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return f17106(var180, var181, var2, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f17108(final SubLObject var1, final SubLObject var183, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0254.f16487(module0137.f8955($ic9$), var1, var183, var2, var3);
    }
    
    public static SubLObject f17109(final SubLObject var1, final SubLObject var184, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        assert NIL != Types.listp(var184) : var184;
        return module0254.f16492(module0137.f8955($ic1$), var1, var184, var2, var3);
    }
    
    public static SubLObject f17110(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        if (NIL != var2 && !areAssertionsDisabledFor(me) && NIL == module0161.f10481(var2)) {
            throw new AssertionError(var2);
        }
        if (NIL != var3 && !areAssertionsDisabledFor(me) && NIL == module0130.f8520(var3)) {
            throw new AssertionError(var3);
        }
        return module0035.f2099(f17028(var1, var2, var3));
    }
    
    public static SubLObject f17111(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        if (NIL != var2 && !areAssertionsDisabledFor(me) && NIL == module0161.f10481(var2)) {
            throw new AssertionError(var2);
        }
        if (NIL != var3 && !areAssertionsDisabledFor(me) && NIL == module0130.f8520(var3)) {
            throw new AssertionError(var3);
        }
        return module0035.f2099(f17033(var1, var2, var3));
    }
    
    public static SubLObject f17112(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        if (NIL != var2 && !areAssertionsDisabledFor(me) && NIL == module0161.f10481(var2)) {
            throw new AssertionError(var2);
        }
        if (NIL != var3 && !areAssertionsDisabledFor(me) && NIL == module0130.f8520(var3)) {
            throw new AssertionError(var3);
        }
        return module0035.f2099(f17037(var1, var2, var3));
    }
    
    public static SubLObject f17113(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        if (NIL != var2 && !areAssertionsDisabledFor(me) && NIL == module0161.f10481(var2)) {
            throw new AssertionError(var2);
        }
        if (NIL != var3 && !areAssertionsDisabledFor(me) && NIL == module0130.f8520(var3)) {
            throw new AssertionError(var3);
        }
        return module0035.f2099(f17040(var1, var2, var3));
    }
    
    public static SubLObject f17114(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        if (NIL != var2 && !areAssertionsDisabledFor(me) && NIL == module0161.f10481(var2)) {
            throw new AssertionError(var2);
        }
        if (NIL != var3 && !areAssertionsDisabledFor(me) && NIL == module0130.f8520(var3)) {
            throw new AssertionError(var3);
        }
        return module0035.f2099(f17030(var1, var2, var3));
    }
    
    public static SubLObject f17115(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        if (NIL != var2 && !areAssertionsDisabledFor(me) && NIL == module0161.f10481(var2)) {
            throw new AssertionError(var2);
        }
        if (NIL != var3 && !areAssertionsDisabledFor(me) && NIL == module0130.f8520(var3)) {
            throw new AssertionError(var3);
        }
        return module0035.f2099(f17035(var1, var2, var3));
    }
    
    public static SubLObject f17116(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        if (NIL != var2 && !areAssertionsDisabledFor(me) && NIL == module0161.f10481(var2)) {
            throw new AssertionError(var2);
        }
        if (NIL != var3 && !areAssertionsDisabledFor(me) && NIL == module0130.f8520(var3)) {
            throw new AssertionError(var3);
        }
        return module0035.f2099(f17038(var1, var2, var3));
    }
    
    public static SubLObject f17117(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        if (NIL != var2 && !areAssertionsDisabledFor(me) && NIL == module0161.f10481(var2)) {
            throw new AssertionError(var2);
        }
        if (NIL != var3 && !areAssertionsDisabledFor(me) && NIL == module0130.f8520(var3)) {
            throw new AssertionError(var3);
        }
        return module0035.f2099(f17041(var1, var2, var3));
    }
    
    public static SubLObject f17118(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        if (NIL != var2 && !areAssertionsDisabledFor(me) && NIL == module0161.f10481(var2)) {
            throw new AssertionError(var2);
        }
        if (NIL != var3 && !areAssertionsDisabledFor(me) && NIL == module0130.f8520(var3)) {
            throw new AssertionError(var3);
        }
        return module0035.f2099(f17031(var1, var2, var3));
    }
    
    public static SubLObject f17119(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        if (NIL != var2 && !areAssertionsDisabledFor(me) && NIL == module0161.f10481(var2)) {
            throw new AssertionError(var2);
        }
        if (NIL != var3 && !areAssertionsDisabledFor(me) && NIL == module0130.f8520(var3)) {
            throw new AssertionError(var3);
        }
        return module0035.f2099(f17036(var1, var2, var3));
    }
    
    public static SubLObject f17120(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        if (NIL != var2 && !areAssertionsDisabledFor(me) && NIL == module0161.f10481(var2)) {
            throw new AssertionError(var2);
        }
        if (NIL != var3 && !areAssertionsDisabledFor(me) && NIL == module0130.f8520(var3)) {
            throw new AssertionError(var3);
        }
        return module0035.f2099(f17039(var1, var2, var3));
    }
    
    public static SubLObject f17121(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        if (NIL != var2 && !areAssertionsDisabledFor(me) && NIL == module0161.f10481(var2)) {
            throw new AssertionError(var2);
        }
        if (NIL != var3 && !areAssertionsDisabledFor(me) && NIL == module0130.f8520(var3)) {
            throw new AssertionError(var3);
        }
        return module0035.f2099(f17042(var1, var2, var3));
    }
    
    public static SubLObject f17122(final SubLObject var1, final SubLObject var185, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0252.f16360(module0137.f8955($ic1$), var185, var1, var2, var3);
    }
    
    public static SubLObject f17123(final SubLObject var1, final SubLObject var186, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0252.f16360(module0137.f8955($ic9$), var186, var1, var2, var3);
    }
    
    public static SubLObject f17124(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return f17125(var1, var2, var3);
    }
    
    public static SubLObject f17125(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return (SubLObject)makeBoolean(NIL != module0248.f15931(module0137.f8955($ic1$), var1, var2, var3, (SubLObject)UNPROVIDED) || NIL != module0248.f15931(module0137.f8955($ic9$), var1, var2, var3, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f17126(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return f17127(var1, var2, var3);
    }
    
    public static SubLObject f17127(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return (SubLObject)makeBoolean(NIL != module0248.f15933(module0137.f8955($ic1$), var1, var2, var3, (SubLObject)UNPROVIDED) || NIL != module0248.f15933(module0137.f8955($ic9$), var1, var2, var3, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f17128(final SubLObject var176, final SubLObject var177, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var176) : var176;
        assert NIL != module0173.f10955(var177) : var177;
        return f17129(var176, var177, var2);
    }
    
    public static SubLObject f17129(final SubLObject var176, final SubLObject var177, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (NIL != module0269.f17706(var176) && NIL != module0269.f17706(var177)) {
            return (SubLObject)makeBoolean(NIL != f17089(var176, var177, var2, (SubLObject)UNPROVIDED) || NIL != f17089(var177, var176, var2, (SubLObject)UNPROVIDED) || NIL != module0261.f17253(var176, var177, var2, (SubLObject)UNPROVIDED));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17130(final SubLObject var176, final SubLObject var177, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return f17129(var176, var177, var2);
    }
    
    public static SubLObject f17131(final SubLObject var180, final SubLObject var181, SubLObject var2, SubLObject var3, SubLObject var187) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (var187 == UNPROVIDED) {
            var187 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var180) : var180;
        assert NIL != module0173.f10955(var181) : var181;
        return module0252.f16349(module0137.f8955($ic1$), var180, var181, var2, var3, var187);
    }
    
    public static SubLObject f17132(final SubLObject var180, final SubLObject var181, SubLObject var2, SubLObject var3, SubLObject var187) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (var187 == UNPROVIDED) {
            var187 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var180) : var180;
        assert NIL != module0173.f10955(var181) : var181;
        return module0254.f16496(module0137.f8955($ic1$), var180, var181, var2, var3, var187);
    }
    
    public static SubLObject f17133(final SubLObject var1, final SubLObject var188, SubLObject var2, SubLObject var3, SubLObject var187) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (var187 == UNPROVIDED) {
            var187 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        assert NIL != module0173.f10955(var188) : var188;
        return module0252.f16349(module0137.f8955($ic9$), var1, var188, var2, var3, var187);
    }
    
    public static SubLObject f17134(final SubLObject var1, final SubLObject var189, SubLObject var2, SubLObject var3, SubLObject var187) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (var187 == UNPROVIDED) {
            var187 = (SubLObject)NIL;
        }
        return module0252.f16349(module0137.f8955($ic9$), var189, var1, var2, var3, var187);
    }
    
    public static SubLObject f17135(final SubLObject var180, final SubLObject var181, SubLObject var2, SubLObject var3, SubLObject var187) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (var187 == UNPROVIDED) {
            var187 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var180) : var180;
        assert NIL != module0173.f10955(var181) : var181;
        return module0254.f16496(module0137.f8955($ic179$), var180, var181, var2, var3, var187);
    }
    
    public static SubLObject f17136(final SubLObject var180, final SubLObject var182, SubLObject var2, SubLObject var3, SubLObject var187) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (var187 == UNPROVIDED) {
            var187 = (SubLObject)$ic182$;
        }
        return module0252.f16353(module0137.f8955($ic1$), var180, var182, var2, var3, var187);
    }
    
    public static SubLObject f17137(final SubLObject var180, final SubLObject var190, SubLObject var2, SubLObject var3, SubLObject var187) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (var187 == UNPROVIDED) {
            var187 = (SubLObject)$ic182$;
        }
        return module0252.f16353(module0137.f8955($ic9$), var180, var190, var2, var3, var187);
    }
    
    public static SubLObject f17138(final SubLObject var180, final SubLObject var181, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var180) : var180;
        assert NIL != module0173.f10955(var181) : var181;
        return module0253.f16446(module0137.f8955($ic1$), var180, var181, var3);
    }
    
    public static SubLObject f17139(final SubLObject var180, final SubLObject var181) {
        return f17138(var180, var181, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f17140(final SubLObject var180, final SubLObject var181, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0253.f16440(module0137.f8955($ic1$), var180, var181, var3);
    }
    
    public static SubLObject f17141(final SubLObject var180, final SubLObject var181, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return f17140(var180, var181, var3);
    }
    
    public static SubLObject f17142(final SubLObject var180, final SubLObject var183, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0253.f16449(module0137.f8955($ic1$), var183, var180, var3);
    }
    
    public static SubLObject f17143(final SubLObject var180, final SubLObject var183, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0253.f16443(module0137.f8955($ic1$), var183, var180, var3);
    }
    
    public static SubLObject f17144(final SubLObject var180, final SubLObject var188, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var180) : var180;
        assert NIL != module0173.f10955(var188) : var188;
        return module0253.f16446(module0137.f8955($ic9$), var180, var188, var3);
    }
    
    public static SubLObject f17145(final SubLObject var180, final SubLObject var188, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0253.f16440(module0137.f8955($ic9$), var180, var188, var3);
    }
    
    public static SubLObject f17146(final SubLObject var180, final SubLObject var191, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0253.f16449(module0137.f8955($ic9$), var191, var180, var3);
    }
    
    public static SubLObject f17147(final SubLObject var180, final SubLObject var191, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0253.f16443(module0137.f8955($ic9$), var191, var180, var3);
    }
    
    public static SubLObject f17148(final SubLObject var1, SubLObject var192, SubLObject var2) {
        if (var192 == UNPROVIDED) {
            var192 = (SubLObject)NIL;
        }
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return f17149(f17085(conses_high.set_difference(Sequences.remove(var1, f17150(var1, var2), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var192, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var2, (SubLObject)UNPROVIDED), var2);
    }
    
    public static SubLObject f17151(final SubLObject var1, SubLObject var192) {
        if (var192 == UNPROVIDED) {
            var192 = (SubLObject)NIL;
        }
        return f17149(f17085(conses_high.set_difference(Sequences.remove(var1, f17152(var1), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var192, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f17153(final SubLObject var1, final SubLObject var2, SubLObject var192) {
        if (var192 == UNPROVIDED) {
            var192 = (SubLObject)NIL;
        }
        return f17149(f17085(conses_high.set_difference(Sequences.remove(var1, f17154(var1, var2), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var192, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var2, (SubLObject)UNPROVIDED), var2);
    }
    
    public static SubLObject f17155() {
        final SubLObject var193 = $g2507$.getGlobalValue();
        if (NIL != var193) {
            module0034.f1818(var193);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17156(final SubLObject var1) {
        return module0034.f1829($g2507$.getGlobalValue(), (SubLObject)ConsesLow.list(var1), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f17157(final SubLObject var1) {
        return f17150(var1, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f17152(final SubLObject var1) {
        SubLObject var2 = $g2507$.getGlobalValue();
        if (NIL == var2) {
            var2 = module0034.f1934((SubLObject)$ic190$, (SubLObject)$ic191$, (SubLObject)$ic192$, (SubLObject)EQL, (SubLObject)ONE_INTEGER, (SubLObject)$ic193$);
        }
        SubLObject var3 = module0034.f1814(var2, var1, (SubLObject)$ic194$);
        if (var3 == $ic194$) {
            var3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f17157(var1)));
            module0034.f1816(var2, var1, var3, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var3);
    }
    
    public static SubLObject f17158() {
        final SubLObject var193 = $g2508$.getGlobalValue();
        if (NIL != var193) {
            module0034.f1818(var193);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17159(final SubLObject var1, final SubLObject var2) {
        return module0034.f1829($g2508$.getGlobalValue(), (SubLObject)ConsesLow.list(var1, var2), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f17160(final SubLObject var1, final SubLObject var2) {
        return f17150(var1, var2);
    }
    
    public static SubLObject f17154(final SubLObject var1, final SubLObject var2) {
        SubLObject var3 = $g2508$.getGlobalValue();
        if (NIL == var3) {
            var3 = module0034.f1934((SubLObject)$ic195$, (SubLObject)$ic196$, (SubLObject)$ic192$, (SubLObject)EQL, (SubLObject)TWO_INTEGER, (SubLObject)$ic193$);
        }
        final SubLObject var4 = module0034.f1782(var1, var2);
        final SubLObject var5 = module0034.f1814(var3, var4, (SubLObject)UNPROVIDED);
        if (var5 != $ic194$) {
            SubLObject var6 = var5;
            SubLObject var7 = (SubLObject)NIL;
            var7 = var6.first();
            while (NIL != var6) {
                SubLObject var8 = var7.first();
                final SubLObject var9 = conses_high.second(var7);
                if (var1.eql(var8.first())) {
                    var8 = var8.rest();
                    if (NIL != var8 && NIL == var8.rest() && var2.eql(var8.first())) {
                        return module0034.f1959(var9);
                    }
                }
                var6 = var6.rest();
                var7 = var6.first();
            }
        }
        final SubLObject var10 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f17160(var1, var2)));
        module0034.f1836(var3, var4, var5, var10, (SubLObject)ConsesLow.list(var1, var2));
        return module0034.f1959(var10);
    }
    
    public static SubLObject f17150(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (NIL != module0269.f17706(var1)) {
            final SubLObject var4 = module0225.f14739(var1);
            final SubLObject var5 = (SubLObject)makeBoolean(NIL != var4 && var4.numG((SubLObject)ZERO_INTEGER));
            SubLObject var6 = (SubLObject)NIL;
            if (NIL == var4 || NIL != module0202.f12909(var4)) {}
            final SubLObject var7 = module0141.$g1700$.currentBinding(var3);
            try {
                module0141.$g1700$.bind(var4, var3);
                if (NIL != var5) {
                    final SubLObject var8 = module0226.f14882(var1, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
                    final SubLObject var10_205 = module0139.$g1646$.currentBinding(var3);
                    try {
                        module0139.$g1646$.bind(module0139.f9007(), var3);
                        final SubLObject var10_206 = module0139.$g1635$.currentBinding(var3);
                        try {
                            module0139.$g1635$.bind(module0139.$g1646$.getDynamicValue(var3), var3);
                            SubLObject var9 = var8;
                            SubLObject var10 = (SubLObject)NIL;
                            var10 = var9.first();
                            while (NIL != var9) {
                                module0251.f16202(module0137.f8955($ic102$), var10, var2, (SubLObject)UNPROVIDED);
                                var9 = var9.rest();
                                var10 = var9.first();
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var10_206, var3);
                        }
                        SubLObject var11 = var8;
                        SubLObject var12 = (SubLObject)NIL;
                        var12 = var11.first();
                        while (NIL != var11) {
                            var6 = ConsesLow.nconc(var6, f17161(var12, (SubLObject)ONE_INTEGER, (SubLObject)$ic197$, var2));
                            var11 = var11.rest();
                            var12 = var11.first();
                        }
                        module0139.f9011(module0139.$g1646$.getDynamicValue(var3));
                    }
                    finally {
                        module0139.$g1646$.rebind(var10_205, var3);
                    }
                    SubLObject var13;
                    SubLObject var14;
                    SubLObject var15;
                    SubLObject var16;
                    SubLObject var10_207;
                    SubLObject var10_208;
                    SubLObject var17;
                    SubLObject var18;
                    SubLObject var19;
                    SubLObject var20;
                    for (var13 = Numbers.subtract(var4, (SubLObject)ONE_INTEGER), var14 = (SubLObject)NIL, var14 = (SubLObject)ZERO_INTEGER; var14.numL(var13); var14 = Numbers.add(var14, (SubLObject)ONE_INTEGER)) {
                        if (NIL != var6) {
                            var15 = Numbers.add((SubLObject)TWO_INTEGER, var14);
                            var16 = module0226.f14882(var1, var15, (SubLObject)UNPROVIDED);
                            var10_207 = module0139.$g1646$.currentBinding(var3);
                            try {
                                module0139.$g1646$.bind(module0139.f9007(), var3);
                                var10_208 = module0139.$g1635$.currentBinding(var3);
                                try {
                                    module0139.$g1635$.bind(module0139.$g1646$.getDynamicValue(var3), var3);
                                    var17 = var16;
                                    var18 = (SubLObject)NIL;
                                    var18 = var17.first();
                                    while (NIL != var17) {
                                        module0251.f16202(module0137.f8955($ic102$), var18, var2, (SubLObject)UNPROVIDED);
                                        var17 = var17.rest();
                                        var18 = var17.first();
                                    }
                                }
                                finally {
                                    module0139.$g1635$.rebind(var10_208, var3);
                                }
                                var19 = var16;
                                var20 = (SubLObject)NIL;
                                var20 = var19.first();
                                while (NIL != var19) {
                                    var6 = module0076.f5292(var6, f17161(var20, var15, (SubLObject)$ic197$, var2));
                                    var19 = var19.rest();
                                    var20 = var19.first();
                                }
                                module0139.f9011(module0139.$g1646$.getDynamicValue(var3));
                            }
                            finally {
                                module0139.$g1646$.rebind(var10_207, var3);
                            }
                        }
                    }
                }
                final SubLObject var21 = module0226.f14888(var1, (SubLObject)UNPROVIDED);
                if (NIL != var21) {
                    final SubLObject var10_209 = module0139.$g1646$.currentBinding(var3);
                    try {
                        module0139.$g1646$.bind(module0139.f9007(), var3);
                        final SubLObject var10_210 = module0139.$g1635$.currentBinding(var3);
                        try {
                            module0139.$g1635$.bind(module0139.$g1646$.getDynamicValue(var3), var3);
                            SubLObject var9 = var21;
                            SubLObject var10 = (SubLObject)NIL;
                            var10 = var9.first();
                            while (NIL != var9) {
                                module0251.f16202(module0137.f8955($ic102$), var10, var2, (SubLObject)UNPROVIDED);
                                var9 = var9.rest();
                                var10 = var9.first();
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var10_210, var3);
                        }
                        SubLObject var11 = var21;
                        SubLObject var12 = (SubLObject)NIL;
                        var12 = var11.first();
                        while (NIL != var11) {
                            if (NIL != var5) {
                                var6 = module0076.f5292(var6, f17161(var12, (SubLObject)ZERO_INTEGER, (SubLObject)$ic197$, (SubLObject)UNPROVIDED));
                            }
                            else {
                                var6 = ConsesLow.nconc(var6, f17161(var12, (SubLObject)ZERO_INTEGER, (SubLObject)$ic197$, var2));
                            }
                            var11 = var11.rest();
                            var12 = var11.first();
                        }
                        module0139.f9011(module0139.$g1646$.getDynamicValue(var3));
                    }
                    finally {
                        module0139.$g1646$.rebind(var10_209, var3);
                    }
                }
                SubLObject var13;
                SubLObject var19;
                SubLObject var22;
                SubLObject var23;
                SubLObject var10_211;
                SubLObject var10_212;
                SubLObject var24;
                SubLObject var25;
                SubLObject var26;
                for (var13 = Numbers.add((SubLObject)ONE_INTEGER, (SubLObject)((NIL != var5) ? var4 : ZERO_INTEGER)), var22 = (SubLObject)NIL, var22 = (SubLObject)ZERO_INTEGER; var22.numL(var13); var22 = Numbers.add(var22, (SubLObject)ONE_INTEGER)) {
                    if (NIL != var6) {
                        var23 = module0226.f14935(var1, var22, (SubLObject)UNPROVIDED);
                        if (NIL != var23) {
                            var10_211 = module0139.$g1646$.currentBinding(var3);
                            try {
                                module0139.$g1646$.bind(module0139.f9007(), var3);
                                var10_212 = module0139.$g1635$.currentBinding(var3);
                                try {
                                    module0139.$g1635$.bind(module0139.$g1646$.getDynamicValue(var3), var3);
                                    var19 = var23;
                                    var24 = (SubLObject)NIL;
                                    var24 = var19.first();
                                    while (NIL != var19) {
                                        module0251.f16202(module0137.f8955($ic102$), var24, var2, (SubLObject)UNPROVIDED);
                                        var19 = var19.rest();
                                        var24 = var19.first();
                                    }
                                }
                                finally {
                                    module0139.$g1635$.rebind(var10_212, var3);
                                }
                                var25 = var23;
                                var26 = (SubLObject)NIL;
                                var26 = var25.first();
                                while (NIL != var25) {
                                    var6 = module0076.f5292(var6, f17161(var26, var22, (SubLObject)$ic198$, var2));
                                    var25 = var25.rest();
                                    var26 = var25.first();
                                }
                                module0139.f9011(module0139.$g1646$.getDynamicValue(var3));
                            }
                            finally {
                                module0139.$g1646$.rebind(var10_211, var3);
                            }
                        }
                    }
                }
            }
            finally {
                module0141.$g1700$.rebind(var7, var3);
            }
            return var6;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17161(final SubLObject var86, final SubLObject var87, SubLObject var217, SubLObject var2) {
        if (var217 == UNPROVIDED) {
            var217 = (SubLObject)$ic197$;
        }
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var218 = SubLProcess.currentSubLThread();
        SubLObject var219 = (SubLObject)NIL;
        final SubLObject var220 = module0141.$g1699$.currentBinding(var218);
        final SubLObject var221 = module0141.$g1691$.currentBinding(var218);
        try {
            module0141.$g1699$.bind(var87, var218);
            module0141.$g1691$.bind((SubLObject)NIL, var218);
            try {
                final SubLObject var222 = var217;
                if (var222.eql((SubLObject)$ic197$)) {
                    module0256.f16585((SubLObject)$ic199$, var86, var2, (SubLObject)UNPROVIDED);
                }
                else if (var222.eql((SubLObject)$ic198$)) {
                    module0256.f16585((SubLObject)$ic200$, var86, var2, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                final SubLObject var10_218 = Threads.$is_thread_performing_cleanupP$.currentBinding(var218);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var218);
                    var219 = module0141.$g1691$.getDynamicValue(var218);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var10_218, var218);
                }
            }
        }
        finally {
            module0141.$g1691$.rebind(var221, var218);
            module0141.$g1699$.rebind(var220, var218);
        }
        return var219;
    }
    
    public static SubLObject f17162(final SubLObject var86) {
        final SubLThread var87 = SubLProcess.currentSubLThread();
        SubLObject var88 = module0226.f14925(var86, module0141.$g1699$.getDynamicValue(var87), (SubLObject)UNPROVIDED);
        SubLObject var89 = (SubLObject)NIL;
        var89 = var88.first();
        while (NIL != var88) {
            if (NIL != module0269.f17706(var89)) {
                SubLObject var90 = (SubLObject)makeBoolean(!module0141.$g1700$.getDynamicValue(var87).eql(module0225.f14739(var89)));
                if (NIL == var90) {
                    SubLObject var91;
                    SubLObject var92;
                    for (var91 = module0226.f14882(var89, module0141.$g1699$.getDynamicValue(var87), module0147.$g2095$.getDynamicValue(var87)), var92 = (SubLObject)NIL, var92 = var91.first(); NIL == var90 && NIL != var91; var90 = (SubLObject)makeBoolean(NIL == module0249.f16062(var92)), var91 = var91.rest(), var92 = var91.first()) {}
                }
                if (NIL == var90) {
                    module0141.$g1691$.setDynamicValue((SubLObject)ConsesLow.cons(var89, module0141.$g1691$.getDynamicValue(var87)), var87);
                }
            }
            var88 = var88.rest();
            var89 = var88.first();
        }
        return module0141.$g1691$.getDynamicValue(var87);
    }
    
    public static SubLObject f17163(final SubLObject var86) {
        final SubLThread var87 = SubLProcess.currentSubLThread();
        SubLObject var88 = module0226.f14953(var86, module0141.$g1699$.getDynamicValue(var87), (SubLObject)UNPROVIDED);
        SubLObject var89 = (SubLObject)NIL;
        var89 = var88.first();
        while (NIL != var88) {
            if (NIL != module0269.f17706(var89)) {
                SubLObject var90 = (SubLObject)NIL;
                if (NIL == var90) {
                    SubLObject var91;
                    SubLObject var92;
                    for (var91 = module0226.f14935(var89, module0141.$g1699$.getDynamicValue(var87), (SubLObject)UNPROVIDED), var92 = (SubLObject)NIL, var92 = var91.first(); NIL == var90 && NIL != var91; var90 = (SubLObject)makeBoolean(NIL == module0249.f16062(var92)), var91 = var91.rest(), var92 = var91.first()) {}
                }
                if (NIL == var90) {
                    module0141.$g1691$.setDynamicValue((SubLObject)ConsesLow.cons(var89, module0141.$g1691$.getDynamicValue(var87)), var87);
                }
            }
            var88 = var88.rest();
            var89 = var88.first();
        }
        return module0141.$g1691$.getDynamicValue(var87);
    }
    
    public static SubLObject f17149(final SubLObject var5, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return f17164(f17165(var5, var2), var2);
    }
    
    public static SubLObject f17165(final SubLObject var5, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var6 = SubLProcess.currentSubLThread();
        if (NIL != var5) {
            SubLObject var7 = (SubLObject)NIL;
            final SubLObject var8 = var2;
            final SubLObject var9 = module0147.$g2094$.currentBinding(var6);
            final SubLObject var10 = module0147.$g2095$.currentBinding(var6);
            try {
                module0147.$g2094$.bind(module0147.f9531(var8), var6);
                module0147.$g2095$.bind(module0147.f9534(var8), var6);
                final SubLObject var11 = Hashtables.make_hash_table(Sequences.length(var5), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                SubLObject var12;
                SubLObject var13;
                SubLObject var14;
                SubLObject var15;
                SubLObject var16;
                SubLObject var33_222;
                SubLObject var17;
                SubLObject var18;
                SubLObject var33_223;
                SubLObject var19;
                for (var12 = Sequences.creduce((SubLObject)$ic201$, Mapping.mapcar((SubLObject)$ic202$, var5), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var13 = (SubLObject)NIL, var13 = (SubLObject)ZERO_INTEGER; var13.numL(var12); var13 = Numbers.add(var13, (SubLObject)ONE_INTEGER)) {
                    var14 = (SubLObject)NIL;
                    var15 = var5;
                    var16 = (SubLObject)NIL;
                    var16 = var15.first();
                    while (NIL != var15) {
                        var33_222 = module0226.f14882(var16, var13, var2);
                        var17 = (SubLObject)NIL;
                        var17 = var33_222.first();
                        while (NIL != var33_222) {
                            module0030.f1599(var17, var16, var11);
                            var18 = var17;
                            if (NIL == conses_high.member(var18, var14, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                                var14 = (SubLObject)ConsesLow.cons(var18, var14);
                            }
                            var33_222 = var33_222.rest();
                            var17 = var33_222.first();
                        }
                        var33_223 = module0226.f14888(var16, var2);
                        var17 = (SubLObject)NIL;
                        var17 = var33_223.first();
                        while (NIL != var33_223) {
                            module0030.f1599(var17, var16, var11);
                            var18 = var17;
                            if (NIL == conses_high.member(var18, var14, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                                var14 = (SubLObject)ConsesLow.cons(var18, var14);
                            }
                            var33_223 = var33_223.rest();
                            var17 = var33_223.first();
                        }
                        var15 = var15.rest();
                        var16 = var15.first();
                    }
                    var15 = module0256.f16529(var14, var2, (SubLObject)UNPROVIDED);
                    var19 = (SubLObject)NIL;
                    var19 = var15.first();
                    while (NIL != var15) {
                        var7 = ConsesLow.nconc(var7, Hashtables.gethash(var19, var11, (SubLObject)UNPROVIDED));
                        var15 = var15.rest();
                        var19 = var15.first();
                    }
                }
            }
            finally {
                module0147.$g2095$.rebind(var10, var6);
                module0147.$g2094$.rebind(var9, var6);
            }
            return module0035.f2272(var7);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17164(final SubLObject var5, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var6 = SubLProcess.currentSubLThread();
        if (NIL != var5) {
            SubLObject var7 = (SubLObject)NIL;
            final SubLObject var8 = var2;
            final SubLObject var9 = module0147.$g2094$.currentBinding(var6);
            final SubLObject var10 = module0147.$g2095$.currentBinding(var6);
            try {
                module0147.$g2094$.bind(module0147.f9531(var8), var6);
                module0147.$g2095$.bind(module0147.f9534(var8), var6);
                final SubLObject var11 = Hashtables.make_hash_table(Sequences.length(var5), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                SubLObject var12;
                SubLObject var13;
                SubLObject var14;
                SubLObject var15;
                SubLObject var16;
                SubLObject var17;
                SubLObject var33_227;
                SubLObject var18;
                SubLObject var19;
                SubLObject var20;
                SubLObject var33_228;
                SubLObject var21;
                for (var12 = Sequences.creduce((SubLObject)$ic201$, Mapping.mapcar((SubLObject)$ic202$, var5), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var13 = (SubLObject)NIL, var13 = (SubLObject)ZERO_INTEGER; var13.numL(var12); var13 = Numbers.add(var13, (SubLObject)ONE_INTEGER)) {
                    var14 = (SubLObject)NIL;
                    var15 = var5;
                    var16 = (SubLObject)NIL;
                    var16 = var15.first();
                    while (NIL != var15) {
                        var17 = module0226.f14935(var16, var13, var2);
                        if (NIL != var17) {
                            var33_227 = var17;
                            var18 = (SubLObject)NIL;
                            var18 = var33_227.first();
                            while (NIL != var33_227) {
                                module0030.f1599(var18, var16, var11);
                                var19 = var18;
                                if (NIL == conses_high.member(var19, var14, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                                    var14 = (SubLObject)ConsesLow.cons(var19, var14);
                                }
                                var33_227 = var33_227.rest();
                                var18 = var33_227.first();
                            }
                        }
                        else {
                            var7 = (SubLObject)ConsesLow.cons(var16, var7);
                        }
                        var20 = module0226.f14941(var16, var2);
                        if (NIL != var20) {
                            var33_228 = var20;
                            var18 = (SubLObject)NIL;
                            var18 = var33_228.first();
                            while (NIL != var33_228) {
                                module0030.f1599(var18, var16, var11);
                                var19 = var18;
                                if (NIL == conses_high.member(var19, var14, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                                    var14 = (SubLObject)ConsesLow.cons(var19, var14);
                                }
                                var33_228 = var33_228.rest();
                                var18 = var33_228.first();
                            }
                        }
                        else {
                            var7 = (SubLObject)ConsesLow.cons(var16, var7);
                        }
                        var15 = var15.rest();
                        var16 = var15.first();
                    }
                    var15 = module0256.f16529(var14, var2, (SubLObject)UNPROVIDED);
                    var21 = (SubLObject)NIL;
                    var21 = var15.first();
                    while (NIL != var15) {
                        var7 = ConsesLow.nconc(var7, Hashtables.gethash(var21, var11, (SubLObject)UNPROVIDED));
                        var15 = var15.rest();
                        var21 = var15.first();
                    }
                }
            }
            finally {
                module0147.$g2095$.rebind(var10, var6);
                module0147.$g2094$.rebind(var9, var6);
            }
            return module0035.f2272(var7);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17166(final SubLObject var1) {
        return module0226.f15062(var1, $ic1$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f17167(final SubLObject var1) {
        return module0248.f15926(module0137.f8955($ic1$), var1);
    }
    
    public static SubLObject f17168(final SubLObject var1) {
        return module0248.f15927(module0137.f8955($ic1$), var1);
    }
    
    public static SubLObject f17169(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return module0248.f16006(module0137.f8955($ic1$), var1, var2);
    }
    
    public static SubLObject f17170(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return module0248.f16007(module0137.f8955($ic1$), var1, var2);
    }
    
    public static SubLObject f17171(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return module0248.f16008(module0137.f8955($ic1$), var1, var2);
    }
    
    public static SubLObject f17172(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return module0248.f16011(module0137.f8955($ic1$), var1, var2);
    }
    
    public static SubLObject f17173(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return module0248.f16012(module0137.f8955($ic1$), var1, var2);
    }
    
    public static SubLObject f17174(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return module0248.f16009(module0137.f8955($ic1$), var1, var2);
    }
    
    public static SubLObject f17175(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return module0248.f16010(module0137.f8955($ic1$), var1, var2);
    }
    
    public static SubLObject f17176(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return module0248.f16013(module0137.f8955($ic1$), var1, var2);
    }
    
    public static SubLObject f17177(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return module0248.f16014(module0137.f8955($ic1$), var1, var2);
    }
    
    public static SubLObject f17178(final SubLObject var1) {
        return module0226.f15062(var1, $ic9$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f17179(final SubLObject var1) {
        return module0248.f15926(module0137.f8955($ic9$), var1);
    }
    
    public static SubLObject f17180(final SubLObject var1) {
        return module0248.f15927(module0137.f8955($ic9$), var1);
    }
    
    public static SubLObject f17181(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return module0248.f16006(module0137.f8955($ic9$), var1, var2);
    }
    
    public static SubLObject f17182(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return module0248.f16007(module0137.f8955($ic9$), var1, var2);
    }
    
    public static SubLObject f17183(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return module0248.f16008(module0137.f8955($ic9$), var1, var2);
    }
    
    public static SubLObject f17184(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return module0248.f16011(module0137.f8955($ic9$), var1, var2);
    }
    
    public static SubLObject f17185(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return module0248.f16012(module0137.f8955($ic9$), var1, var2);
    }
    
    public static SubLObject f17186(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return module0248.f16009(module0137.f8955($ic9$), var1, var2);
    }
    
    public static SubLObject f17187(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return module0248.f16010(module0137.f8955($ic9$), var1, var2);
    }
    
    public static SubLObject f17188(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return module0248.f16013(module0137.f8955($ic9$), var1, var2);
    }
    
    public static SubLObject f17189(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return module0248.f16014(module0137.f8955($ic9$), var1, var2);
    }
    
    public static SubLObject f17190(final SubLObject var230, final SubLObject var231) {
        module0248.f15957(var230, var231, module0137.f8955($ic1$));
        module0268.f17665(var231);
        module0345.f23241(var230, var231);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17191(final SubLObject var230, final SubLObject var231) {
        f17190(var230, var231);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17192(final SubLObject var230, final SubLObject var231) {
        module0248.f15957(var230, var231, module0137.f8955($ic9$));
        module0268.f17665(var231);
        module0345.f23241(var230, var231);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17193(final SubLObject var230, final SubLObject var231) {
        f17192(var230, var231);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17194(final SubLObject var230, final SubLObject var231) {
        f17195(var230, var231);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17196(final SubLObject var230, final SubLObject var231) {
        f17197(var230, var231);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17195(final SubLObject var230, final SubLObject var231) {
        module0248.f15962(var230, var231, module0137.f8955($ic1$));
        module0268.f17676(var231);
        module0345.f23241(var230, var231);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17197(final SubLObject var230, final SubLObject var231) {
        module0248.f15962(var230, var231, module0137.f8955($ic9$));
        module0268.f17676(var231);
        module0345.f23241(var230, var231);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17198() {
        f17199();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17199() {
        module0248.f16004(module0137.f8955($ic1$));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17200() {
        module0248.f16004(module0137.f8955($ic9$));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17201(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0141.$g1670$.currentBinding(var2);
        final SubLObject var4 = module0141.$g1671$.currentBinding(var2);
        final SubLObject var5 = module0141.$g1672$.currentBinding(var2);
        final SubLObject var6 = module0141.$g1674$.currentBinding(var2);
        final SubLObject var7 = module0137.$g1605$.currentBinding(var2);
        try {
            module0141.$g1670$.bind(module0137.f8955($ic1$), var2);
            module0141.$g1671$.bind(module0244.f15739(module0137.f8955($ic1$)), var2);
            module0141.$g1672$.bind(module0244.f15746(module0137.f8955($ic1$)), var2);
            module0141.$g1674$.bind((SubLObject)NIL, var2);
            module0137.$g1605$.bind(module0137.f8955($ic1$), var2);
            SubLObject var8 = module0248.f15925(module0137.f8955($ic1$), var1);
            SubLObject var9 = (SubLObject)NIL;
            var9 = var8.first();
            while (NIL != var8) {
                if (NIL != module0269.f17706(var1)) {
                    module0248.f15999(var1, var9, (SubLObject)UNPROVIDED);
                }
                var8 = var8.rest();
                var9 = var8.first();
            }
        }
        finally {
            module0137.$g1605$.rebind(var7, var2);
            module0141.$g1674$.rebind(var6, var2);
            module0141.$g1672$.rebind(var5, var2);
            module0141.$g1671$.rebind(var4, var2);
            module0141.$g1670$.rebind(var3, var2);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17202(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0141.$g1670$.currentBinding(var2);
        final SubLObject var4 = module0141.$g1671$.currentBinding(var2);
        final SubLObject var5 = module0141.$g1672$.currentBinding(var2);
        final SubLObject var6 = module0141.$g1674$.currentBinding(var2);
        final SubLObject var7 = module0137.$g1605$.currentBinding(var2);
        try {
            module0141.$g1670$.bind(module0137.f8955($ic9$), var2);
            module0141.$g1671$.bind(module0244.f15739(module0137.f8955($ic9$)), var2);
            module0141.$g1672$.bind(module0244.f15746(module0137.f8955($ic9$)), var2);
            module0141.$g1674$.bind((SubLObject)NIL, var2);
            module0137.$g1605$.bind(module0137.f8955($ic9$), var2);
            SubLObject var8 = module0248.f15925(module0137.f8955($ic9$), var1);
            SubLObject var9 = (SubLObject)NIL;
            var9 = var8.first();
            while (NIL != var8) {
                if (NIL != module0269.f17706(var1)) {
                    module0248.f15999(var1, var9, (SubLObject)UNPROVIDED);
                }
                var8 = var8.rest();
                var9 = var8.first();
            }
        }
        finally {
            module0137.$g1605$.rebind(var7, var2);
            module0141.$g1674$.rebind(var6, var2);
            module0141.$g1672$.rebind(var5, var2);
            module0141.$g1671$.rebind(var4, var2);
            module0141.$g1670$.rebind(var3, var2);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17203(final SubLObject var1) {
        final SubLObject var2 = f17166(var1);
        f17201(var1);
        SubLObject var3 = var2;
        SubLObject var4 = (SubLObject)NIL;
        var4 = var3.first();
        while (NIL != var3) {
            if (NIL != module0269.f17706(var1)) {
                f17204(var1, var4);
            }
            var3 = var3.rest();
            var4 = var3.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17205(final SubLObject var1) {
        final SubLObject var2 = f17178(var1);
        f17202(var1);
        SubLObject var3 = var2;
        SubLObject var4 = (SubLObject)NIL;
        var4 = var3.first();
        while (NIL != var3) {
            if (NIL != module0269.f17706(var1)) {
                f17206(var1, var4);
            }
            var3 = var3.rest();
            var4 = var3.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17207(final SubLObject var1, final SubLObject var2) {
        return f17204(var1, var2);
    }
    
    public static SubLObject f17204(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0141.$g1670$.currentBinding(var3);
        final SubLObject var5 = module0141.$g1671$.currentBinding(var3);
        final SubLObject var6 = module0141.$g1672$.currentBinding(var3);
        final SubLObject var7 = module0141.$g1674$.currentBinding(var3);
        final SubLObject var8 = module0137.$g1605$.currentBinding(var3);
        try {
            module0141.$g1670$.bind(module0137.f8955($ic1$), var3);
            module0141.$g1671$.bind(module0244.f15739(module0137.f8955($ic1$)), var3);
            module0141.$g1672$.bind(module0244.f15746(module0137.f8955($ic1$)), var3);
            module0141.$g1674$.bind((SubLObject)NIL, var3);
            module0137.$g1605$.bind(module0137.f8955($ic1$), var3);
            module0248.f15951(var1, var2, (SubLObject)UNPROVIDED);
        }
        finally {
            module0137.$g1605$.rebind(var8, var3);
            module0141.$g1674$.rebind(var7, var3);
            module0141.$g1672$.rebind(var6, var3);
            module0141.$g1671$.rebind(var5, var3);
            module0141.$g1670$.rebind(var4, var3);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17206(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0141.$g1670$.currentBinding(var3);
        final SubLObject var5 = module0141.$g1671$.currentBinding(var3);
        final SubLObject var6 = module0141.$g1672$.currentBinding(var3);
        final SubLObject var7 = module0141.$g1674$.currentBinding(var3);
        final SubLObject var8 = module0137.$g1605$.currentBinding(var3);
        try {
            module0141.$g1670$.bind(module0137.f8955($ic9$), var3);
            module0141.$g1671$.bind(module0244.f15739(module0137.f8955($ic9$)), var3);
            module0141.$g1672$.bind(module0244.f15746(module0137.f8955($ic9$)), var3);
            module0141.$g1674$.bind((SubLObject)NIL, var3);
            module0137.$g1605$.bind(module0137.f8955($ic9$), var3);
            module0248.f15951(var1, var2, (SubLObject)UNPROVIDED);
        }
        finally {
            module0137.$g1605$.rebind(var8, var3);
            module0141.$g1674$.rebind(var7, var3);
            module0141.$g1672$.rebind(var6, var3);
            module0141.$g1671$.rebind(var5, var3);
            module0141.$g1670$.rebind(var4, var3);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17208(SubLObject var233) {
        if (var233 == UNPROVIDED) {
            var233 = (SubLObject)T;
        }
        f17209(var233);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17209(SubLObject var233) {
        if (var233 == UNPROVIDED) {
            var233 = (SubLObject)T;
        }
        if (NIL != var233) {
            f17199();
        }
        module0248.f15952(module0137.f8955($ic1$));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17210(SubLObject var233) {
        if (var233 == UNPROVIDED) {
            var233 = (SubLObject)T;
        }
        if (NIL != var233) {
            f17199();
        }
        module0248.f15952(module0137.f8955($ic9$));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17211() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17006", "GENL-PREDICATES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17007", "MIN-GENL-PREDICATES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17008", "GENL-INVERSES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17009", "MIN-GENL-INVERSES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17010", "NOT-GENL-PREDICATES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17011", "MAX-NOT-GENL-PREDICATES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17012", "NOT-GENL-INVERSES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17013", "MAX-NOT-GENL-INVERSES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17014", "SPEC-PREDICATES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17015", "MAX-SPEC-PREDICATES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17016", "SPEC-INVERSES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17017", "MAX-SPEC-INVERSES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17018", "NOT-SPEC-PREDICATES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17019", "MIN-NOT-SPEC-PREDICATES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17020", "NOT-SPEC-INVERSES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17021", "MIN-NOT-SPEC-INVERSES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17022", "GENL-PREDICATE-SIBLINGS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17023", "GENL-INVERSE-SIBLINGS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17024", "SPEC-PREDICATE-SIBLINGS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17025", "SPEC-INVERSE-SIBLINGS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17026", "GENL-PREDICATE-ROOTS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17029", "GENL-INVERSE-ROOTS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17028", "ALL-GENL-PREDICATES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17031", "S#19646", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17032", "S#19647", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17030", "ALL-GENL-INVERSES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17033", "ALL-SPEC-PREDICATES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17034", "ALL-SPEC-PREDS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17035", "ALL-SPEC-INVERSES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17036", "S#19648", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17037", "S#15415", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17038", "S#15417", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17039", "S#19649", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17040", "S#19650", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17041", "S#19651", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17042", "S#19652", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17043", "ALL-GENL-PREDS-AMONG", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17044", "S#19653", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17045", "S#19654", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17046", "S#19655", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17047", "ALL-NOT-GENL-PREDICATES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17048", "S#19656", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17049", "ALL-NOT-GENL-INVERSES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17050", "ALL-NOT-SPEC-PREDICATES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17051", "S#19657", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17052", "ALL-NOT-SPEC-INVERSES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17053", "UNION-ALL-GENL-PREDICATES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17054", "UNION-ALL-SPEC-PREDICATES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17055", "UNION-ALL-GENL-INVERSES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17056", "UNION-ALL-SPEC-INVERSES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17057", "S#19658", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17058", "MAP-ALL-GENL-PREDS", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17059", "SOME-ALL-GENL-PREDS", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17060", "SOME-ALL-GENL-INVERSES", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17061", "S#19659", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17062", "MAP-ALL-SPEC-PREDS", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17063", "S#19660", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17064", "S#19661", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17065", "SOME-ALL-SPEC-PREDS", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17066", "S#19662", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17067", "S#19663", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17068", "S#19664", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17069", "S#19665", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17070", "S#19666", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17071", "ALL-SPEC-PREDS-WRT-TYPE", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17072", "ALL-SPEC-PREDS-WRT-ARG", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17073", "S#19667", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17074", "S#19668", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0260", "f17075", "S#19669");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17076", "S#19670", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0260", "f17077", "S#19671");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17078", "S#19672", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17079", "S#19673", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17080", "S#19674", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17081", "S#19675", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17082", "S#19676", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17083", "S#19677", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17084", "S#19678", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17085", "MIN-PREDICATES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17027", "MAX-PREDICATES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17086", "MIN-CEILING-PREDICATES", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17087", "MAX-FLOOR-PREDICATES", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17088", "S#19679", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17089", "GENL-PREDICATE?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17090", "S#19680", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17091", "S#15517", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17092", "S#19681", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17093", "SPEC-PREDICATE?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17094", "GENL-INVERSE?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17095", "SPEC-INVERSE?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17096", "S#19682", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17097", "S#19683", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17098", "ANY-GENL-PREDICATE?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17099", "S#19684", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17100", "S#19685", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17101", "S#19686", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17102", "NOT-GENL-PREDICATE?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17103", "S#19687", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17104", "S#19688", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17105", "S#19689", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17106", "NOT-GENL-INVERSE?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17107", "S#19690", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17108", "S#19691", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17109", "ANY-NOT-GENL-PREDICATE?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17110", "S#19692", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17111", "S#19693", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17112", "S#19694", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17113", "S#19695", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17114", "S#19696", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17115", "S#19697", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17116", "S#19698", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17117", "S#19699", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17118", "S#19700", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17119", "S#19701", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17120", "S#19702", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17121", "S#19703", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17122", "S#19704", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17123", "S#19705", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17124", "SOME-GENL-PRED-OR-INVERSE?", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17125", "S#19706", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17126", "SOME-SPEC-PRED-OR-INVERSE?", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17127", "S#19707", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17128", "INTERSECTING-PREDICATES?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17129", "S#19708", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17130", "S#19709", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17131", "WHY-GENL-PREDICATE?", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17132", "WHY-NOT-GENL-PREDICATE?", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17133", "WHY-GENL-INVERSE?", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17134", "S#19710", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17135", "WHY-NOT-GENL-INVERSE?", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17136", "S#19711", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17137", "S#19712", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17138", "MAX-FLOOR-MTS-OF-GENL-PREDICATE-PATHS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17139", "MAX-FLOOR-MTS-OF-GENL-PRED-PATHS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17140", "S#19713", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17141", "MIN-MTS-OF-GENL-PRED-PATHS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17142", "S#19714", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17143", "S#19715", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17144", "MAX-FLOOR-MTS-OF-GENL-INVERSE-PATHS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17145", "MIN-MTS-OF-GENL-INVERSE-PATHS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17146", "S#19716", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17147", "S#19717", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17148", "S#19718", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17151", "S#19719", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17153", "S#19720", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17155", "S#19721", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17156", "S#19722", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17157", "S#19723", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17152", "S#19724", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17158", "S#19725", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17159", "S#19726", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17160", "S#19727", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17154", "S#19728", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17150", "S#19729", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17161", "S#19730", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17162", "S#19731", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17163", "S#19732", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17149", "S#19733", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17165", "S#19734", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17164", "S#19735", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17166", "S#19736", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17167", "S#19737", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17168", "S#19738", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17169", "S#19739", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17170", "S#19740", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17171", "S#19741", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17172", "S#19742", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17173", "S#19743", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17174", "S#19744", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17175", "S#19745", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17176", "S#19746", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17177", "S#19747", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17178", "S#19748", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17179", "S#19749", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17180", "S#19750", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17181", "S#19751", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17182", "S#19752", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17183", "S#19753", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17184", "S#19754", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17185", "S#19755", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17186", "S#19756", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17187", "S#19757", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17188", "S#19758", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17189", "S#19759", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17190", "GENL-PREDICATE-AFTER-ADDING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17191", "ADD-GENL-PREDICATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17192", "GENL-INVERSE-AFTER-ADDING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17193", "ADD-GENL-INVERSE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17194", "REMOVE-GENL-PREDICATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17196", "REMOVE-GENL-INVERSE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17195", "GENL-PREDICATE-AFTER-REMOVING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17197", "GENL-INVERSE-AFTER-REMOVING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17198", "S#19760", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17199", "S#19761", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17200", "S#19762", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17201", "S#19763", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17202", "S#19764", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17203", "S#19765", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17205", "S#19766", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17207", "S#19767", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17204", "S#19768", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17206", "S#19769", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17208", "S#19770", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17209", "S#19771", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0260", "f17210", "S#19772", 0, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17212() {
        $g2505$ = SubLFiles.defparameter("S#19773", (SubLObject)NIL);
        $g2506$ = SubLFiles.defparameter("S#19774", (SubLObject)NIL);
        $g2507$ = SubLFiles.deflexical("S#19775", (SubLObject)NIL);
        $g2508$ = SubLFiles.deflexical("S#19776", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17213() {
        module0012.f368((SubLObject)$ic2$, (SubLObject)$ic3$, (SubLObject)$ic4$, (SubLObject)$ic5$, (SubLObject)$ic6$);
        module0012.f368((SubLObject)$ic7$, (SubLObject)$ic3$, (SubLObject)$ic8$, (SubLObject)$ic5$, (SubLObject)$ic6$);
        module0012.f368((SubLObject)$ic10$, (SubLObject)$ic3$, (SubLObject)$ic11$, (SubLObject)$ic5$, (SubLObject)$ic6$);
        module0012.f368((SubLObject)$ic12$, (SubLObject)$ic3$, (SubLObject)$ic13$, (SubLObject)$ic5$, (SubLObject)$ic6$);
        module0012.f368((SubLObject)$ic14$, (SubLObject)$ic3$, (SubLObject)$ic15$, (SubLObject)$ic5$, (SubLObject)$ic6$);
        module0012.f368((SubLObject)$ic16$, (SubLObject)$ic3$, (SubLObject)$ic17$, (SubLObject)$ic5$, (SubLObject)$ic6$);
        module0012.f368((SubLObject)$ic18$, (SubLObject)$ic3$, (SubLObject)$ic15$, (SubLObject)$ic5$, (SubLObject)$ic6$);
        module0012.f368((SubLObject)$ic19$, (SubLObject)$ic3$, (SubLObject)$ic17$, (SubLObject)$ic5$, (SubLObject)$ic6$);
        module0012.f368((SubLObject)$ic20$, (SubLObject)$ic3$, (SubLObject)$ic21$, (SubLObject)$ic5$, (SubLObject)$ic6$);
        module0012.f368((SubLObject)$ic22$, (SubLObject)$ic3$, (SubLObject)$ic23$, (SubLObject)$ic5$, (SubLObject)$ic6$);
        module0012.f368((SubLObject)$ic24$, (SubLObject)$ic3$, (SubLObject)$ic25$, (SubLObject)$ic5$, (SubLObject)$ic6$);
        module0012.f368((SubLObject)$ic26$, (SubLObject)$ic3$, (SubLObject)$ic27$, (SubLObject)$ic5$, (SubLObject)$ic6$);
        module0012.f368((SubLObject)$ic28$, (SubLObject)$ic3$, (SubLObject)$ic29$, (SubLObject)$ic5$, (SubLObject)$ic6$);
        module0012.f368((SubLObject)$ic30$, (SubLObject)$ic3$, (SubLObject)$ic31$, (SubLObject)$ic5$, (SubLObject)$ic6$);
        module0012.f368((SubLObject)$ic32$, (SubLObject)$ic3$, (SubLObject)$ic31$, (SubLObject)$ic5$, (SubLObject)$ic6$);
        module0012.f368((SubLObject)$ic33$, (SubLObject)$ic3$, (SubLObject)$ic31$, (SubLObject)$ic5$, (SubLObject)$ic6$);
        module0012.f368((SubLObject)$ic34$, (SubLObject)$ic3$, (SubLObject)$ic35$, (SubLObject)$ic5$, (SubLObject)$ic6$);
        module0012.f368((SubLObject)$ic36$, (SubLObject)$ic3$, (SubLObject)$ic37$, (SubLObject)$ic5$, (SubLObject)$ic6$);
        module0012.f368((SubLObject)$ic38$, (SubLObject)$ic3$, (SubLObject)$ic39$, (SubLObject)$ic5$, (SubLObject)$ic6$);
        module0012.f368((SubLObject)$ic40$, (SubLObject)$ic3$, (SubLObject)$ic41$, (SubLObject)$ic5$, (SubLObject)$ic6$);
        module0012.f368((SubLObject)$ic42$, (SubLObject)$ic3$, (SubLObject)$ic43$, (SubLObject)$ic5$, (SubLObject)$ic6$);
        module0012.f368((SubLObject)$ic44$, (SubLObject)$ic3$, (SubLObject)$ic45$, (SubLObject)$ic5$, (SubLObject)$ic6$);
        module0012.f368((SubLObject)$ic46$, (SubLObject)$ic3$, (SubLObject)$ic47$, (SubLObject)$ic5$, (SubLObject)$ic6$);
        module0012.f368((SubLObject)$ic62$, (SubLObject)$ic3$, (SubLObject)$ic63$, (SubLObject)$ic5$, (SubLObject)$ic6$);
        module0012.f368((SubLObject)$ic64$, (SubLObject)$ic3$, (SubLObject)$ic65$, (SubLObject)$ic5$, (SubLObject)$ic6$);
        module0012.f368((SubLObject)$ic66$, (SubLObject)$ic3$, (SubLObject)$ic67$, (SubLObject)$ic5$, (SubLObject)$ic6$);
        module0012.f368((SubLObject)$ic70$, (SubLObject)$ic71$, (SubLObject)$ic72$, (SubLObject)$ic73$, (SubLObject)$ic6$);
        module0012.f368((SubLObject)$ic74$, (SubLObject)$ic3$, (SubLObject)$ic75$, (SubLObject)$ic5$, (SubLObject)$ic6$);
        module0012.f368((SubLObject)$ic76$, (SubLObject)$ic3$, (SubLObject)$ic75$, (SubLObject)$ic5$, (SubLObject)$ic6$);
        module0012.f368((SubLObject)$ic77$, (SubLObject)$ic3$, (SubLObject)$ic78$, (SubLObject)$ic5$, (SubLObject)$ic6$);
        module0012.f368((SubLObject)$ic79$, (SubLObject)$ic3$, (SubLObject)$ic80$, (SubLObject)$ic5$, (SubLObject)$ic6$);
        module0012.f368((SubLObject)$ic81$, (SubLObject)$ic82$, (SubLObject)$ic83$, (SubLObject)$ic84$, (SubLObject)$ic6$);
        module0012.f368((SubLObject)$ic85$, (SubLObject)$ic82$, (SubLObject)$ic86$, (SubLObject)$ic84$, (SubLObject)$ic6$);
        module0012.f368((SubLObject)$ic87$, (SubLObject)$ic82$, (SubLObject)$ic88$, (SubLObject)$ic84$, (SubLObject)$ic6$);
        module0012.f368((SubLObject)$ic89$, (SubLObject)$ic82$, (SubLObject)$ic90$, (SubLObject)$ic84$, (SubLObject)$ic6$);
        module0012.f368((SubLObject)$ic92$, (SubLObject)$ic93$, (SubLObject)$ic94$, (SubLObject)$ic95$, (SubLObject)NIL);
        module0012.f368((SubLObject)$ic96$, (SubLObject)$ic93$, (SubLObject)$ic97$, (SubLObject)$ic95$, (SubLObject)NIL);
        module0012.f368((SubLObject)$ic98$, (SubLObject)$ic93$, (SubLObject)$ic97$, (SubLObject)$ic95$, (SubLObject)NIL);
        module0012.f368((SubLObject)$ic99$, (SubLObject)$ic93$, (SubLObject)$ic94$, (SubLObject)$ic95$, (SubLObject)NIL);
        module0012.f368((SubLObject)$ic100$, (SubLObject)$ic93$, (SubLObject)$ic97$, (SubLObject)$ic95$, (SubLObject)NIL);
        module0012.f368((SubLObject)$ic104$, (SubLObject)$ic105$, (SubLObject)$ic106$, (SubLObject)$ic107$, (SubLObject)$ic6$);
        module0012.f368((SubLObject)$ic109$, (SubLObject)$ic110$, (SubLObject)$ic111$, (SubLObject)$ic112$, (SubLObject)$ic6$);
        module0012.f368((SubLObject)$ic126$, (SubLObject)$ic82$, (SubLObject)$ic127$, (SubLObject)$ic84$, (SubLObject)$ic6$);
        module0012.f368((SubLObject)$ic128$, (SubLObject)$ic82$, (SubLObject)$ic129$, (SubLObject)$ic84$, (SubLObject)$ic6$);
        module0012.f368((SubLObject)$ic130$, (SubLObject)$ic131$, (SubLObject)$ic132$, (SubLObject)$ic84$, (SubLObject)$ic6$);
        module0012.f368((SubLObject)$ic134$, (SubLObject)$ic131$, (SubLObject)$ic135$, (SubLObject)$ic84$, (SubLObject)$ic6$);
        module0012.f368((SubLObject)$ic136$, (SubLObject)$ic137$, (SubLObject)$ic138$, (SubLObject)$ic139$, (SubLObject)$ic140$);
        module0012.f368((SubLObject)$ic143$, (SubLObject)$ic144$, (SubLObject)$ic138$, (SubLObject)$ic145$, (SubLObject)$ic140$);
        module0012.f368((SubLObject)$ic146$, (SubLObject)$ic137$, (SubLObject)$ic147$, (SubLObject)$ic139$, (SubLObject)$ic140$);
        module0012.f368((SubLObject)$ic148$, (SubLObject)$ic144$, (SubLObject)$ic147$, (SubLObject)$ic139$, (SubLObject)$ic140$);
        module0012.f368((SubLObject)$ic149$, (SubLObject)$ic150$, (SubLObject)$ic151$, (SubLObject)$ic152$, (SubLObject)$ic140$);
        module0012.f368((SubLObject)$ic153$, (SubLObject)$ic154$, (SubLObject)$ic155$, (SubLObject)$ic156$, (SubLObject)$ic140$);
        module0012.f368((SubLObject)$ic157$, (SubLObject)$ic154$, (SubLObject)$ic158$, (SubLObject)$ic156$, (SubLObject)$ic140$);
        module0012.f368((SubLObject)$ic159$, (SubLObject)$ic160$, (SubLObject)$ic161$, (SubLObject)$ic162$, (SubLObject)$ic140$);
        module0012.f368((SubLObject)$ic165$, (SubLObject)$ic166$, (SubLObject)$ic167$, (SubLObject)$ic168$, (SubLObject)$ic140$);
        module0012.f368((SubLObject)$ic169$, (SubLObject)$ic170$, (SubLObject)$ic171$, (SubLObject)$ic139$, (SubLObject)$ic172$);
        module0012.f368((SubLObject)$ic173$, (SubLObject)$ic170$, (SubLObject)$ic174$, (SubLObject)$ic139$, (SubLObject)$ic172$);
        module0012.f368((SubLObject)$ic175$, (SubLObject)$ic176$, (SubLObject)$ic177$, (SubLObject)$ic178$, (SubLObject)$ic172$);
        module0012.f368((SubLObject)$ic180$, (SubLObject)$ic170$, (SubLObject)$ic181$, (SubLObject)$ic139$, (SubLObject)$ic172$);
        module0012.f368((SubLObject)$ic183$, (SubLObject)$ic184$, (SubLObject)$ic185$, (SubLObject)$ic139$, (SubLObject)NIL);
        module0012.f368((SubLObject)$ic186$, (SubLObject)$ic187$, (SubLObject)$ic188$, (SubLObject)$ic189$, (SubLObject)NIL);
        module0034.f1909((SubLObject)$ic190$);
        module0034.f1909((SubLObject)$ic195$);
        module0012.f416((SubLObject)$ic203$);
        module0012.f416((SubLObject)$ic204$);
        module0012.f416((SubLObject)$ic205$);
        module0012.f416((SubLObject)$ic206$);
        module0012.f416((SubLObject)$ic207$);
        module0012.f416((SubLObject)$ic208$);
        module0012.f416((SubLObject)$ic209$);
        module0012.f416((SubLObject)$ic210$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f17211();
    }
    
    public void initializeVariables() {
        f17212();
    }
    
    public void runTopLevelForms() {
        f17213();
    }
    
    static {
        me = (SubLFile)new module0260();
        $g2505$ = null;
        $g2506$ = null;
        $g2507$ = null;
        $g2508$ = null;
        $ic0$ = makeSymbol("FORT-P");
        $ic1$ = constant_handles_oc.f8479((SubLObject)makeString("genlPreds"));
        $ic2$ = makeSymbol("GENL-PREDICATES");
        $ic3$ = ConsesLow.list((SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#10995", "CYC"));
        $ic4$ = makeString("Returns the local genlPreds of PRED");
        $ic5$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("FORT-P")));
        $ic6$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("LIST"), (SubLObject)makeSymbol("FORT-P")));
        $ic7$ = makeSymbol("MIN-GENL-PREDICATES");
        $ic8$ = makeString("Returns the most-specific local genlPreds of PRED");
        $ic9$ = constant_handles_oc.f8479((SubLObject)makeString("genlInverse"));
        $ic10$ = makeSymbol("GENL-INVERSES");
        $ic11$ = makeString("Returns the local genlInverses of PRED");
        $ic12$ = makeSymbol("MIN-GENL-INVERSES");
        $ic13$ = makeString("Returns the most-specific local genlInverses of PRED");
        $ic14$ = makeSymbol("NOT-GENL-PREDICATES");
        $ic15$ = makeString("Returns the local negated genlPreds of PRED");
        $ic16$ = makeSymbol("MAX-NOT-GENL-PREDICATES");
        $ic17$ = makeString("Returns the most-general local negated genlPreds of PRED");
        $ic18$ = makeSymbol("NOT-GENL-INVERSES");
        $ic19$ = makeSymbol("MAX-NOT-GENL-INVERSES");
        $ic20$ = makeSymbol("SPEC-PREDICATES");
        $ic21$ = makeString("Returns the specPreds of PRED");
        $ic22$ = makeSymbol("MAX-SPEC-PREDICATES");
        $ic23$ = makeString("Returns the most-general specPreds of PRED");
        $ic24$ = makeSymbol("SPEC-INVERSES");
        $ic25$ = makeString("Returns the specInverses of PRED");
        $ic26$ = makeSymbol("MAX-SPEC-INVERSES");
        $ic27$ = makeString("Returns the most-general specInverses of PRED");
        $ic28$ = makeSymbol("NOT-SPEC-PREDICATES");
        $ic29$ = makeString("Returns the negated specPreds of PRED");
        $ic30$ = makeSymbol("MIN-NOT-SPEC-PREDICATES");
        $ic31$ = makeString("Returns the most-specific negated specPreds of PRED");
        $ic32$ = makeSymbol("NOT-SPEC-INVERSES");
        $ic33$ = makeSymbol("MIN-NOT-SPEC-INVERSES");
        $ic34$ = makeSymbol("GENL-PREDICATE-SIBLINGS");
        $ic35$ = makeString("Returns the direct #$genlPreds of those predicates having direct spec-preds PRED");
        $ic36$ = makeSymbol("GENL-INVERSE-SIBLINGS");
        $ic37$ = makeString("Returns the direct #$genlInverse of those predicates having direct spec-inverses PRED");
        $ic38$ = makeSymbol("SPEC-PREDICATE-SIBLINGS");
        $ic39$ = makeString("Returns the direct spec-preds of those collections having direct #$genlPreds PRED");
        $ic40$ = makeSymbol("SPEC-INVERSE-SIBLINGS");
        $ic41$ = makeString("Returns the direct spec-inverses of those collections having direct #$genlInverse PRED");
        $ic42$ = makeSymbol("GENL-PREDICATE-ROOTS");
        $ic43$ = makeString("Returns the most general genlPreds of PRED.");
        $ic44$ = makeSymbol("GENL-INVERSE-ROOTS");
        $ic45$ = makeString("Returns the most general genlInverses of PRED.");
        $ic46$ = makeSymbol("ALL-GENL-PREDICATES");
        $ic47$ = makeString("Returns all genlPreds of predicate PRED \n   (ascending transitive closure; inexpensive)");
        $ic48$ = makeKeyword("DEPTH");
        $ic49$ = makeKeyword("STACK");
        $ic50$ = makeKeyword("QUEUE");
        $ic51$ = makeSymbol("S#11450", "CYC");
        $ic52$ = makeKeyword("ERROR");
        $ic53$ = makeString("~A is not a ~A");
        $ic54$ = makeSymbol("S#11592", "CYC");
        $ic55$ = makeKeyword("CERROR");
        $ic56$ = makeString("continue anyway");
        $ic57$ = makeKeyword("WARN");
        $ic58$ = makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic59$ = makeString("~A is neither SET-P nor LISTP.");
        $ic60$ = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $ic61$ = makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $ic62$ = makeSymbol("ALL-GENL-INVERSES");
        $ic63$ = makeString("Returns all genlInverses of predicate PRED \n   (ascending transitive closure; inexpensive)");
        $ic64$ = makeSymbol("ALL-SPEC-PREDICATES");
        $ic65$ = makeString("Returns all predicates having PRED as a genlPred \n   (descending transitive closure; expensive)");
        $ic66$ = makeSymbol("ALL-SPEC-INVERSES");
        $ic67$ = makeString("Returns all predicates having PRED as a genlInverse\n   (descending transitive closure; expensive)");
        $ic68$ = makeSymbol("EL-FORT-P");
        $ic69$ = makeSymbol("LISTP");
        $ic70$ = makeSymbol("ALL-GENL-PREDS-AMONG");
        $ic71$ = ConsesLow.list((SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("S#12121", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#10995", "CYC"));
        $ic72$ = makeString("Returns those genlPreds of PRED that are included among CANDIDATEs");
        $ic73$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("EL-FORT-P")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12121", "CYC"), (SubLObject)makeSymbol("LISTP")));
        $ic74$ = makeSymbol("ALL-NOT-GENL-PREDICATES");
        $ic75$ = makeString("Returns all negated genlPreds of predicate PRED \n   (descending transitive closure; expensive)");
        $ic76$ = makeSymbol("ALL-NOT-GENL-INVERSES");
        $ic77$ = makeSymbol("ALL-NOT-SPEC-PREDICATES");
        $ic78$ = makeString("Returns all negated specPreds of predicate PRED \n   (ascending transitive closure; inexpensive)");
        $ic79$ = makeSymbol("ALL-NOT-SPEC-INVERSES");
        $ic80$ = makeString("Returns all predicates having PRED as a negated genlInverse\n   (ascending transitive closure; inexpensive)");
        $ic81$ = makeSymbol("UNION-ALL-GENL-PREDICATES");
        $ic82$ = ConsesLow.list((SubLObject)makeSymbol("S#19777", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#10995", "CYC"));
        $ic83$ = makeString("Returns all genl-predicates of each predicate in PREDS");
        $ic84$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#19777", "CYC"), (SubLObject)makeSymbol("LISTP")));
        $ic85$ = makeSymbol("UNION-ALL-SPEC-PREDICATES");
        $ic86$ = makeString("Returns all spec-predicates of each predicate in PREDS");
        $ic87$ = makeSymbol("UNION-ALL-GENL-INVERSES");
        $ic88$ = makeString("Returns all genl-inverses of each predicate in PREDS");
        $ic89$ = makeSymbol("UNION-ALL-SPEC-INVERSES");
        $ic90$ = makeString("Returns all specs of each predicate in PREDS");
        $ic91$ = makeSymbol("FUNCTION-SPEC-P");
        $ic92$ = makeSymbol("MAP-ALL-GENL-PREDS");
        $ic93$ = ConsesLow.list((SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("S#11675", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#10995", "CYC"));
        $ic94$ = makeString("Apply FN to each genlPred of PRED");
        $ic95$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11675", "CYC"), (SubLObject)makeSymbol("FUNCTION-SPEC-P")));
        $ic96$ = makeSymbol("SOME-ALL-GENL-PREDS");
        $ic97$ = makeString("Apply FN to each genlPred of PRED until FN returns a non-nil result");
        $ic98$ = makeSymbol("SOME-ALL-GENL-INVERSES");
        $ic99$ = makeSymbol("MAP-ALL-SPEC-PREDS");
        $ic100$ = makeSymbol("SOME-ALL-SPEC-PREDS");
        $ic101$ = makeSymbol("INTEGERP");
        $ic102$ = constant_handles_oc.f8479((SubLObject)makeString("genls"));
        $ic103$ = makeSymbol("S#19667", "CYC");
        $ic104$ = makeSymbol("ALL-SPEC-PREDS-WRT-TYPE");
        $ic105$ = ConsesLow.list((SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("S#12455", "CYC"), (SubLObject)makeSymbol("S#202", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#10995", "CYC"));
        $ic106$ = makeString("Returns those all-spec-preds of PRED for which instances \nof COL are legal in arguments in position ARG");
        $ic107$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12455", "CYC"), (SubLObject)makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#202", "CYC"), (SubLObject)makeSymbol("INTEGERP")));
        $ic108$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic109$ = makeSymbol("ALL-SPEC-PREDS-WRT-ARG");
        $ic110$ = ConsesLow.list((SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("S#10466", "CYC"), (SubLObject)makeSymbol("S#202", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#10995", "CYC"));
        $ic111$ = makeString("Returns those all-spec-preds of PRED for which FORT\nis legal as arguments in position ARG");
        $ic112$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10466", "CYC"), (SubLObject)makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#202", "CYC"), (SubLObject)makeSymbol("INTEGERP")));
        $ic113$ = ConsesLow.list((SubLObject)makeSymbol("S#133", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic114$ = makeSymbol("CLET");
        $ic115$ = makeSymbol("S#19773", "CYC");
        $ic116$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#19774", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("NEW-DICTIONARY"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)EQUAL))));
        $ic117$ = makeSymbol("S#19672", "CYC");
        $ic118$ = makeSymbol("S#19673", "CYC");
        $ic119$ = constant_handles_oc.f8479((SubLObject)makeString("typedGenlPreds"));
        $ic120$ = makeKeyword("GAF");
        $ic121$ = makeKeyword("TRUE");
        $ic122$ = constant_handles_oc.f8479((SubLObject)makeString("typedGenlInverse"));
        $ic123$ = constant_handles_oc.f8479((SubLObject)makeString("True-JustificationTruth"));
        $ic124$ = makeKeyword("OLD");
        $ic125$ = makeKeyword("RESOURCE");
        $ic126$ = makeSymbol("MIN-PREDICATES");
        $ic127$ = makeString("Returns the most-specific predicates in PREDS");
        $ic128$ = makeSymbol("MAX-PREDICATES");
        $ic129$ = makeString("Returns the most-general predicates in PREDS");
        $ic130$ = makeSymbol("MIN-CEILING-PREDICATES");
        $ic131$ = ConsesLow.list((SubLObject)makeSymbol("S#19777", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#12121", "CYC"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#10995", "CYC"));
        $ic132$ = makeString("Returns the most-specific common generalizations (ceilings) of PREDS");
        $ic133$ = ConsesLow.list((SubLObject)makeSymbol("S#19778", "CYC"), (SubLObject)makeSymbol("S#19779", "CYC"));
        $ic134$ = makeSymbol("MAX-FLOOR-PREDICATES");
        $ic135$ = makeString("Returns the most-general common specializations (floors) of PREDS");
        $ic136$ = makeSymbol("GENL-PREDICATE?");
        $ic137$ = ConsesLow.list((SubLObject)makeSymbol("S#12109", "CYC"), (SubLObject)makeSymbol("S#12112", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#10995", "CYC"));
        $ic138$ = makeString("Is GENL a genlPred of SPEC?\n   (ascending transitive search; inexpensive)");
        $ic139$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12109", "CYC"), (SubLObject)makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12112", "CYC"), (SubLObject)makeSymbol("FORT-P")));
        $ic140$ = ConsesLow.list((SubLObject)makeSymbol("BOOLEANP"));
        $ic141$ = makeSymbol("S#12274", "CYC");
        $ic142$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic143$ = makeSymbol("SPEC-PREDICATE?");
        $ic144$ = ConsesLow.list((SubLObject)makeSymbol("S#12112", "CYC"), (SubLObject)makeSymbol("S#12109", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#10995", "CYC"));
        $ic145$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12112", "CYC"), (SubLObject)makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12109", "CYC"), (SubLObject)makeSymbol("FORT-P")));
        $ic146$ = makeSymbol("GENL-INVERSE?");
        $ic147$ = makeString("Is GENL a genlInverse of SPEC?\n   (ascending transitive search; inexpensive)");
        $ic148$ = makeSymbol("SPEC-INVERSE?");
        $ic149$ = makeSymbol("ANY-GENL-PREDICATE?");
        $ic150$ = ConsesLow.list((SubLObject)makeSymbol("S#12109", "CYC"), (SubLObject)makeSymbol("GENLS"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#10995", "CYC"));
        $ic151$ = makeString("Returns T iff (genl-predicate? SPEC GENL) for some genl in GENLS\n   (ascending transitive search; inexpensive)");
        $ic152$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12109", "CYC"), (SubLObject)makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("GENLS"), (SubLObject)makeSymbol("LISTP")));
        $ic153$ = makeSymbol("NOT-GENL-PREDICATE?");
        $ic154$ = ConsesLow.list((SubLObject)makeSymbol("S#12109", "CYC"), (SubLObject)makeSymbol("S#19364", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#10995", "CYC"));
        $ic155$ = makeString("Is NOT-GENL known to be not a genlPred of SPEC?\n   (descending transitive search; expensive)");
        $ic156$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12109", "CYC"), (SubLObject)makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#19364", "CYC"), (SubLObject)makeSymbol("FORT-P")));
        $ic157$ = makeSymbol("NOT-GENL-INVERSE?");
        $ic158$ = makeString("Is NOT-GENL a negated genlInverse of SPEC?\n   (descending transitive search; expensive)");
        $ic159$ = makeSymbol("ANY-NOT-GENL-PREDICATE?");
        $ic160$ = ConsesLow.list((SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("S#19286", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#10995", "CYC"));
        $ic161$ = makeString("Is any predicate in NOT-GENLS not a genlPred of PRED?\n   (descending transitive search; expensive)");
        $ic162$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#19286", "CYC"), (SubLObject)makeSymbol("LISTP")));
        $ic163$ = makeSymbol("S#12263", "CYC");
        $ic164$ = makeSymbol("S#10615", "CYC");
        $ic165$ = makeSymbol("INTERSECTING-PREDICATES?");
        $ic166$ = ConsesLow.list((SubLObject)makeSymbol("S#19778", "CYC"), (SubLObject)makeSymbol("S#19779", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"));
        $ic167$ = makeString("Does the extension of PRED1 include some tuple in the extension of PRED2?");
        $ic168$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#19778", "CYC"), (SubLObject)makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#19779", "CYC"), (SubLObject)makeSymbol("FORT-P")));
        $ic169$ = makeSymbol("WHY-GENL-PREDICATE?");
        $ic170$ = ConsesLow.list((SubLObject)makeSymbol("S#12109", "CYC"), (SubLObject)makeSymbol("S#12112", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#10995", "CYC"), (SubLObject)makeSymbol("S#11669", "CYC"));
        $ic171$ = makeString("A justification of (genlPreds SPEC GENL)");
        $ic172$ = ConsesLow.list((SubLObject)makeSymbol("LISTP"));
        $ic173$ = makeSymbol("WHY-NOT-GENL-PREDICATE?");
        $ic174$ = makeString("A justification of (not (genlPreds SPEC GENL))");
        $ic175$ = makeSymbol("WHY-GENL-INVERSE?");
        $ic176$ = ConsesLow.list((SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("S#19780", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#10995", "CYC"), (SubLObject)makeSymbol("S#11669", "CYC"));
        $ic177$ = makeString("A justification of (genlInverse PRED GENL-INVERSE)");
        $ic178$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#19780", "CYC"), (SubLObject)makeSymbol("FORT-P")));
        $ic179$ = constant_handles_oc.f8479((SubLObject)makeString("genlMt"));
        $ic180$ = makeSymbol("WHY-NOT-GENL-INVERSE?");
        $ic181$ = makeString("A justification of (not (genlInverse SPEC GENL)");
        $ic182$ = makeKeyword("ASSERTION");
        $ic183$ = makeSymbol("MAX-FLOOR-MTS-OF-GENL-PREDICATE-PATHS");
        $ic184$ = ConsesLow.list((SubLObject)makeSymbol("S#12109", "CYC"), (SubLObject)makeSymbol("S#12112", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#10995", "CYC"));
        $ic185$ = makeString("@return listp; In what (most-genl) mts is GENL a genlPred of SPEC?");
        $ic186$ = makeSymbol("MAX-FLOOR-MTS-OF-GENL-INVERSE-PATHS");
        $ic187$ = ConsesLow.list((SubLObject)makeSymbol("S#12109", "CYC"), (SubLObject)makeSymbol("S#19780", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#10995", "CYC"));
        $ic188$ = makeString("In what (most-genl) mts is GENL-INVERSE a genlInverse of SPEC?");
        $ic189$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12109", "CYC"), (SubLObject)makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#19780", "CYC"), (SubLObject)makeSymbol("FORT-P")));
        $ic190$ = makeSymbol("S#19724", "CYC");
        $ic191$ = makeSymbol("S#19775", "CYC");
        $ic192$ = makeInteger(512);
        $ic193$ = makeInteger(64);
        $ic194$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic195$ = makeSymbol("S#19728", "CYC");
        $ic196$ = makeSymbol("S#19776", "CYC");
        $ic197$ = makeKeyword("ISA");
        $ic198$ = makeKeyword("GENL");
        $ic199$ = makeSymbol("S#19731", "CYC");
        $ic200$ = makeSymbol("S#19732", "CYC");
        $ic201$ = makeSymbol("MAX");
        $ic202$ = makeSymbol("ARITY");
        $ic203$ = makeSymbol("GENL-PREDICATE-AFTER-ADDING");
        $ic204$ = makeSymbol("ADD-GENL-PREDICATE");
        $ic205$ = makeSymbol("GENL-INVERSE-AFTER-ADDING");
        $ic206$ = makeSymbol("ADD-GENL-INVERSE");
        $ic207$ = makeSymbol("REMOVE-GENL-PREDICATE");
        $ic208$ = makeSymbol("REMOVE-GENL-INVERSE");
        $ic209$ = makeSymbol("GENL-PREDICATE-AFTER-REMOVING");
        $ic210$ = makeSymbol("GENL-INVERSE-AFTER-REMOVING");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 1883 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/