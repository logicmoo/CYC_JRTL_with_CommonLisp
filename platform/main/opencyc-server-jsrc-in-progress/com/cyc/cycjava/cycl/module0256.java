package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0256 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0256";
    public static final String myFingerPrint = "77e0481b0776508b0d727f5ecdbf00a18d8c1b6b231c644cd7b87b36b3da671d";
    private static SubLSymbol $g2484$;
    private static final SubLObject $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLString $ic3$;
    private static final SubLList $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLString $ic7$;
    private static final SubLList $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLString $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLString $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLString $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLString $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLString $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLObject $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLString $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLString $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLString $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLString $ic37$;
    private static final SubLString $ic38$;
    private static final SubLString $ic39$;
    private static final SubLString $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLList $ic46$;
    private static final SubLString $ic47$;
    private static final SubLList $ic48$;
    private static final SubLList $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLList $ic51$;
    private static final SubLString $ic52$;
    private static final SubLList $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLList $ic56$;
    private static final SubLString $ic57$;
    private static final SubLList $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLString $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLString $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLList $ic64$;
    private static final SubLString $ic65$;
    private static final SubLList $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLString $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLList $ic71$;
    private static final SubLString $ic72$;
    private static final SubLList $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLString $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLString $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLList $ic80$;
    private static final SubLString $ic81$;
    private static final SubLList $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLString $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLString $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLString $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLString $ic90$;
    private static final SubLList $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLList $ic93$;
    private static final SubLList $ic94$;
    private static final SubLObject $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLList $ic97$;
    private static final SubLString $ic98$;
    private static final SubLList $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLList $ic101$;
    private static final SubLString $ic102$;
    private static final SubLList $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLString $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLString $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLList $ic109$;
    private static final SubLString $ic110$;
    private static final SubLList $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLString $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLString $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLList $ic117$;
    private static final SubLString $ic118$;
    private static final SubLList $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLList $ic121$;
    private static final SubLString $ic122$;
    private static final SubLList $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLList $ic125$;
    private static final SubLString $ic126$;
    private static final SubLList $ic127$;
    private static final SubLSymbol $ic128$;
    private static final SubLSymbol $ic129$;
    private static final SubLSymbol $ic130$;
    private static final SubLList $ic131$;
    private static final SubLString $ic132$;
    private static final SubLList $ic133$;
    private static final SubLSymbol $ic134$;
    private static final SubLString $ic135$;
    private static final SubLSymbol $ic136$;
    private static final SubLSymbol $ic137$;
    private static final SubLSymbol $ic138$;
    private static final SubLList $ic139$;
    private static final SubLString $ic140$;
    private static final SubLList $ic141$;
    private static final SubLObject $ic142$;
    private static final SubLList $ic143$;
    private static final SubLObject $ic144$;
    private static final SubLObject $ic145$;
    private static final SubLObject $ic146$;
    private static final SubLObject $ic147$;
    private static final SubLSymbol $ic148$;
    private static final SubLString $ic149$;
    private static final SubLSymbol $ic150$;
    private static final SubLList $ic151$;
    private static final SubLString $ic152$;
    private static final SubLSymbol $ic153$;
    private static final SubLString $ic154$;
    private static final SubLSymbol $ic155$;
    private static final SubLSymbol $ic156$;
    private static final SubLString $ic157$;
    private static final SubLList $ic158$;
    private static final SubLSymbol $ic159$;
    private static final SubLString $ic160$;
    private static final SubLList $ic161$;
    private static final SubLSymbol $ic162$;
    private static final SubLString $ic163$;
    private static final SubLSymbol $ic164$;
    private static final SubLList $ic165$;
    private static final SubLString $ic166$;
    private static final SubLSymbol $ic167$;
    private static final SubLString $ic168$;
    private static final SubLSymbol $ic169$;
    private static final SubLList $ic170$;
    private static final SubLString $ic171$;
    private static final SubLList $ic172$;
    private static final SubLSymbol $ic173$;
    private static final SubLList $ic174$;
    private static final SubLString $ic175$;
    private static final SubLList $ic176$;
    private static final SubLSymbol $ic177$;
    private static final SubLList $ic178$;
    private static final SubLString $ic179$;
    private static final SubLSymbol $ic180$;
    private static final SubLString $ic181$;
    private static final SubLSymbol $ic182$;
    private static final SubLList $ic183$;
    private static final SubLString $ic184$;
    private static final SubLObject $ic185$;
    private static final SubLSymbol $ic186$;
    private static final SubLSymbol $ic187$;
    
    
    public static SubLObject f16524(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0248.f15931(module0137.f8955($ic0$), var1, var2, var3, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f16525(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0252.f16303(module0137.f8955($ic0$), var1, var2, var3);
    }
    
    public static SubLObject f16526(final SubLObject var4, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLObject var5 = module0172.f10921(var4);
        if (NIL != module0167.f10813(var5)) {
            return f16524(var5, var2, var3);
        }
        return f16527(var4, var2);
    }
    
    public static SubLObject f16528(final SubLObject var4, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLObject var5 = module0172.f10921(var4);
        if (NIL != module0167.f10813(var5)) {
            return f16525(var5, var2, var3);
        }
        return f16529(f16527(var4, var2), var2, var3);
    }
    
    public static SubLObject f16530(final SubLObject var1, final SubLObject var6, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLObject var7 = f16531(var1, var2, var3);
        final SubLObject var8 = module0259.f16841(var6, var7, var2, var3);
        return f16529(var8, var2, var3);
    }
    
    public static SubLObject f16532(final SubLObject var1, final SubLObject var6, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLObject var7 = f16531(var1, var2, var3);
        final SubLObject var8 = module0259.f16841(var6, var7, var2, var3);
        return f16529(Sequences.remove(var1, var8, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var2, var3);
    }
    
    public static SubLObject f16527(final SubLObject var4, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return module0035.f2272(ConsesLow.append(new SubLObject[] { module0226.f15014(module0205.f13276(var4), var2, (SubLObject)UNPROVIDED), module0226.f15016(var4, var2), module0226.f15019(var4, var2), module0226.f15020(var4, var2), module0226.f15018(var4, var2) }));
    }
    
    public static SubLObject f16533(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0248.f15932(module0137.f8955($ic0$), var1, var2, var3, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f16534(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0210.f13565(var1) : var1;
        return module0252.f16306(module0137.f8955($ic0$), var1, var2, var3);
    }
    
    public static SubLObject f16535(final SubLObject var4, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLObject var5 = module0172.f10921(var4);
        if (NIL != module0167.f10813(var5)) {
            return f16533(var5, var2, var3);
        }
        return f16536(var4, var2);
    }
    
    public static SubLObject f16537(final SubLObject var9, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLObject var10 = module0172.f10921(var9);
        if (NIL != module0167.f10813(var10)) {
            return f16534(var10, var2, var3);
        }
        return f16538(f16536(var10, var2), var2, var3);
    }
    
    public static SubLObject f16536(final SubLObject var4, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return module0226.f15014(module0205.f13276(var4), var2, (SubLObject)$ic9$);
    }
    
    public static SubLObject f16539(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0248.f15933(module0137.f8955($ic0$), var1, var2, var3, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f16540(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return (SubLObject)makeBoolean(NIL == module0248.f15934(module0137.f8955($ic0$), var1, var2, var3));
    }
    
    public static SubLObject f16541(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0210.f13565(var1) : var1;
        return module0252.f16308(module0137.f8955($ic0$), var1, var2, var3);
    }
    
    public static SubLObject f16542(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0248.f15935(module0137.f8955($ic0$), var1, var2, var3, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f16543(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0210.f13565(var1) : var1;
        return module0252.f16309(module0137.f8955($ic0$), var1, var2, var3);
    }
    
    public static SubLObject f16544(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0210.f13565(var1) : var1;
        return module0248.f15937(module0137.f8955($ic0$), var1, var2, var3);
    }
    
    public static SubLObject f16545(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0210.f13565(var1) : var1;
        return module0248.f15938(module0137.f8955($ic0$), var1, var2, var3);
    }
    
    public static SubLObject f16531(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0210.f13565(var1) : var1;
        if (NIL == module0173.f10955(var1) || NIL != module0269.f17705(var1)) {
            return module0252.f16245(module0137.f8955($ic0$), var1, var2, var3);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16546(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = module0147.$g2094$.currentBinding(var2);
        final SubLObject var5 = module0147.$g2095$.currentBinding(var2);
        try {
            module0147.$g2094$.bind((SubLObject)$ic20$, var2);
            module0147.$g2095$.bind($ic21$, var2);
            var3 = f16531(var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var5, var2);
            module0147.$g2094$.rebind(var4, var2);
        }
        return var3;
    }
    
    public static SubLObject f16547(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)NIL;
        final SubLObject var5 = module0147.$g2094$.currentBinding(var3);
        final SubLObject var6 = module0147.$g2095$.currentBinding(var3);
        try {
            module0147.$g2094$.bind((SubLObject)$ic22$, var3);
            module0147.$g2095$.bind(var2, var3);
            var4 = f16531(var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var6, var3);
            module0147.$g2094$.rebind(var5, var3);
        }
        return var4;
    }
    
    public static SubLObject f16548(final SubLObject var1, SubLObject var14) {
        if (var14 == UNPROVIDED) {
            var14 = module0262.f17362(module0147.$g2095$.getDynamicValue());
        }
        final SubLThread var15 = SubLProcess.currentSubLThread();
        SubLObject var16 = (SubLObject)NIL;
        final SubLObject var17 = module0147.$g2094$.currentBinding(var15);
        final SubLObject var18 = module0147.$g2096$.currentBinding(var15);
        try {
            module0147.$g2094$.bind((SubLObject)$ic23$, var15);
            module0147.$g2096$.bind(var14, var15);
            var16 = f16531(var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            module0147.$g2096$.rebind(var18, var15);
            module0147.$g2094$.rebind(var17, var15);
        }
        return var16;
    }
    
    public static SubLObject f16549(final SubLObject var9, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLObject var10 = module0172.f10921(var9);
        if (NIL != module0167.f10813(var10)) {
            return f16531(var10, var2, var3);
        }
        return f16550(f16526(var9, var2, var3), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f16551(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return Sequences.remove(var1, f16531(var1, var2, var3), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f16552(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0210.f13565(var1) : var1;
        if (NIL == module0173.f10955(var1) || NIL != module0269.f17705(var1)) {
            return module0252.f16248(module0137.f8955($ic0$), var1, var2, var3);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16553(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return Sequences.remove(var1, f16552(var1, var2, var3), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f16554(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = module0147.$g2094$.currentBinding(var2);
        final SubLObject var5 = module0147.$g2095$.currentBinding(var2);
        try {
            module0147.$g2094$.bind((SubLObject)$ic20$, var2);
            module0147.$g2095$.bind($ic21$, var2);
            var3 = module0549.f33908(f16553(var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)$ic26$);
        }
        finally {
            module0147.$g2095$.rebind(var5, var2);
            module0147.$g2094$.rebind(var4, var2);
        }
        return var3;
    }
    
    public static SubLObject f16555(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = Numbers.integerDivide(module0549.f33901(var1), (SubLObject)TWO_INTEGER);
        final SubLObject var4 = module0077.f5313(Symbols.symbol_function((SubLObject)EQL), var3);
        final SubLObject var5 = module0147.$g2094$.currentBinding(var2);
        final SubLObject var6 = module0147.$g2095$.currentBinding(var2);
        try {
            module0147.$g2094$.bind((SubLObject)$ic20$, var2);
            module0147.$g2095$.bind($ic21$, var2);
            SubLObject var7 = var1;
            final SubLObject var8 = (SubLObject)$ic29$;
            final SubLObject var9 = module0056.f4145(var8);
            final SubLObject var12_21 = module0139.$g1635$.currentBinding(var2);
            try {
                module0139.$g1635$.bind(module0139.f9007(), var2);
                final SubLObject var10 = (SubLObject)NIL;
                final SubLObject var12_22 = module0141.$g1714$.currentBinding(var2);
                final SubLObject var13_24 = module0141.$g1715$.currentBinding(var2);
                try {
                    module0141.$g1714$.bind((NIL != var10) ? var10 : module0141.f9283(), var2);
                    module0141.$g1715$.bind((SubLObject)((NIL != var10) ? $ic30$ : module0141.$g1715$.getDynamicValue(var2)), var2);
                    if (NIL != var10 && NIL != module0136.f8864() && NIL == module0141.f9279(var10)) {
                        final SubLObject var11 = module0136.$g1591$.getDynamicValue(var2);
                        if (var11.eql((SubLObject)$ic31$)) {
                            module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic32$, var10, (SubLObject)$ic33$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                        else if (var11.eql((SubLObject)$ic34$)) {
                            module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic35$, (SubLObject)$ic32$, var10, (SubLObject)$ic33$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                        else if (var11.eql((SubLObject)$ic36$)) {
                            Errors.warn((SubLObject)$ic32$, var10, (SubLObject)$ic33$);
                        }
                        else {
                            Errors.warn((SubLObject)$ic37$, module0136.$g1591$.getDynamicValue(var2));
                            Errors.cerror((SubLObject)$ic35$, (SubLObject)$ic32$, var10, (SubLObject)$ic33$);
                        }
                    }
                    final SubLObject var12_23 = module0141.$g1670$.currentBinding(var2);
                    final SubLObject var13_25 = module0141.$g1671$.currentBinding(var2);
                    final SubLObject var12 = module0141.$g1672$.currentBinding(var2);
                    final SubLObject var13 = module0141.$g1674$.currentBinding(var2);
                    final SubLObject var14 = module0137.$g1605$.currentBinding(var2);
                    try {
                        module0141.$g1670$.bind(module0137.f8955($ic0$), var2);
                        module0141.$g1671$.bind(module0244.f15739(module0137.f8955($ic0$)), var2);
                        module0141.$g1672$.bind(module0244.f15746(module0137.f8955($ic0$)), var2);
                        module0141.$g1674$.bind((SubLObject)NIL, var2);
                        module0137.$g1605$.bind(module0137.f8955($ic0$), var2);
                        if (NIL != module0136.f8865() || NIL != module0244.f15795(var1, module0137.f8955((SubLObject)UNPROVIDED))) {
                            final SubLObject var12_24 = module0141.$g1677$.currentBinding(var2);
                            final SubLObject var13_26 = module0138.$g1619$.currentBinding(var2);
                            final SubLObject var28_33 = module0141.$g1674$.currentBinding(var2);
                            try {
                                module0141.$g1677$.bind(module0141.f9210(), var2);
                                module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0137.f8955($ic0$)), var2);
                                module0141.$g1674$.bind((SubLObject)NIL, var2);
                                module0249.f16055(var7, (SubLObject)UNPROVIDED);
                                while (NIL != var7) {
                                    final SubLObject var15 = var7;
                                    if (NIL != f16540(var15, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                                        module0077.f5326(var15, var4);
                                    }
                                    SubLObject var17;
                                    final SubLObject var16 = var17 = module0200.f12443(module0137.f8955($ic0$));
                                    SubLObject var18 = (SubLObject)NIL;
                                    var18 = var17.first();
                                    while (NIL != var17) {
                                        final SubLObject var12_25 = module0137.$g1605$.currentBinding(var2);
                                        final SubLObject var13_27 = module0141.$g1674$.currentBinding(var2);
                                        try {
                                            module0137.$g1605$.bind(var18, var2);
                                            module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var2)) : module0141.$g1674$.getDynamicValue(var2)), var2);
                                            final SubLObject var19 = module0228.f15229(var7);
                                            if (NIL != module0138.f8992(var19)) {
                                                final SubLObject var20 = module0242.f15664(var19, module0137.f8955((SubLObject)UNPROVIDED));
                                                if (NIL != var20) {
                                                    final SubLObject var21 = module0245.f15834(var20, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                    if (NIL != var21) {
                                                        SubLObject var22;
                                                        for (var22 = module0066.f4838(module0067.f4891(var21)); NIL == module0066.f4841(var22); var22 = module0066.f4840(var22)) {
                                                            var2.resetMultipleValues();
                                                            final SubLObject var23 = module0066.f4839(var22);
                                                            final SubLObject var24 = var2.secondMultipleValue();
                                                            var2.resetMultipleValues();
                                                            if (NIL != module0147.f9507(var23)) {
                                                                final SubLObject var12_26 = module0138.$g1623$.currentBinding(var2);
                                                                try {
                                                                    module0138.$g1623$.bind(var23, var2);
                                                                    SubLObject var43_47;
                                                                    for (var43_47 = module0066.f4838(module0067.f4891(var24)); NIL == module0066.f4841(var43_47); var43_47 = module0066.f4840(var43_47)) {
                                                                        var2.resetMultipleValues();
                                                                        final SubLObject var25 = module0066.f4839(var43_47);
                                                                        final SubLObject var26 = var2.secondMultipleValue();
                                                                        var2.resetMultipleValues();
                                                                        if (NIL != module0141.f9289(var25)) {
                                                                            final SubLObject var12_27 = module0138.$g1624$.currentBinding(var2);
                                                                            try {
                                                                                module0138.$g1624$.bind(var25, var2);
                                                                                final SubLObject var27 = var26;
                                                                                if (NIL != module0077.f5302(var27)) {
                                                                                    final SubLObject var28 = module0077.f5333(var27);
                                                                                    SubLObject var29;
                                                                                    SubLObject var30;
                                                                                    SubLObject var31;
                                                                                    for (var29 = module0032.f1741(var28), var30 = (SubLObject)NIL, var30 = module0032.f1742(var29, var28); NIL == module0032.f1744(var29, var30); var30 = module0032.f1743(var30)) {
                                                                                        var31 = module0032.f1745(var29, var30);
                                                                                        if (NIL != module0032.f1746(var30, var31) && NIL == module0249.f16059(var31, (SubLObject)UNPROVIDED)) {
                                                                                            module0249.f16055(var31, (SubLObject)UNPROVIDED);
                                                                                            module0056.f4149(var31, var9);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (var27.isList()) {
                                                                                    SubLObject var32 = var27;
                                                                                    SubLObject var33 = (SubLObject)NIL;
                                                                                    var33 = var32.first();
                                                                                    while (NIL != var32) {
                                                                                        if (NIL == module0249.f16059(var33, (SubLObject)UNPROVIDED)) {
                                                                                            module0249.f16055(var33, (SubLObject)UNPROVIDED);
                                                                                            module0056.f4149(var33, var9);
                                                                                        }
                                                                                        var32 = var32.rest();
                                                                                        var33 = var32.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)$ic38$, var27);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1624$.rebind(var12_27, var2);
                                                                            }
                                                                        }
                                                                    }
                                                                    module0066.f4842(var43_47);
                                                                }
                                                                finally {
                                                                    module0138.$g1623$.rebind(var12_26, var2);
                                                                }
                                                            }
                                                        }
                                                        module0066.f4842(var22);
                                                    }
                                                }
                                                else {
                                                    module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic39$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                }
                                            }
                                            else if (NIL != module0155.f9785(var19, (SubLObject)UNPROVIDED)) {
                                                SubLObject var36_58;
                                                final SubLObject var34 = var36_58 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var2), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var2), module0137.f8955((SubLObject)UNPROVIDED)));
                                                SubLObject var35 = (SubLObject)NIL;
                                                var35 = var36_58.first();
                                                while (NIL != var36_58) {
                                                    final SubLObject var12_28 = module0138.$g1625$.currentBinding(var2);
                                                    try {
                                                        module0138.$g1625$.bind(var35, var2);
                                                        final SubLObject var37;
                                                        final SubLObject var36 = var37 = Functions.funcall(var35, var19);
                                                        if (NIL != module0077.f5302(var37)) {
                                                            final SubLObject var38 = module0077.f5333(var37);
                                                            SubLObject var39;
                                                            SubLObject var40;
                                                            SubLObject var41;
                                                            for (var39 = module0032.f1741(var38), var40 = (SubLObject)NIL, var40 = module0032.f1742(var39, var38); NIL == module0032.f1744(var39, var40); var40 = module0032.f1743(var40)) {
                                                                var41 = module0032.f1745(var39, var40);
                                                                if (NIL != module0032.f1746(var40, var41) && NIL == module0249.f16059(var41, (SubLObject)UNPROVIDED)) {
                                                                    module0249.f16055(var41, (SubLObject)UNPROVIDED);
                                                                    module0056.f4149(var41, var9);
                                                                }
                                                            }
                                                        }
                                                        else if (var37.isList()) {
                                                            SubLObject var42 = var37;
                                                            SubLObject var43 = (SubLObject)NIL;
                                                            var43 = var42.first();
                                                            while (NIL != var42) {
                                                                if (NIL == module0249.f16059(var43, (SubLObject)UNPROVIDED)) {
                                                                    module0249.f16055(var43, (SubLObject)UNPROVIDED);
                                                                    module0056.f4149(var43, var9);
                                                                }
                                                                var42 = var42.rest();
                                                                var43 = var42.first();
                                                            }
                                                        }
                                                        else {
                                                            Errors.error((SubLObject)$ic38$, var37);
                                                        }
                                                    }
                                                    finally {
                                                        module0138.$g1625$.rebind(var12_28, var2);
                                                    }
                                                    var36_58 = var36_58.rest();
                                                    var35 = var36_58.first();
                                                }
                                            }
                                        }
                                        finally {
                                            module0141.$g1674$.rebind(var13_27, var2);
                                            module0137.$g1605$.rebind(var12_25, var2);
                                        }
                                        var17 = var17.rest();
                                        var18 = var17.first();
                                    }
                                    var7 = module0056.f4150(var9);
                                }
                            }
                            finally {
                                module0141.$g1674$.rebind(var28_33, var2);
                                module0138.$g1619$.rebind(var13_26, var2);
                                module0141.$g1677$.rebind(var12_24, var2);
                            }
                        }
                        else {
                            module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic40$, var1, module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                    }
                    finally {
                        module0137.$g1605$.rebind(var14, var2);
                        module0141.$g1674$.rebind(var13, var2);
                        module0141.$g1672$.rebind(var12, var2);
                        module0141.$g1671$.rebind(var13_25, var2);
                        module0141.$g1670$.rebind(var12_23, var2);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var13_24, var2);
                    module0141.$g1714$.rebind(var12_22, var2);
                }
                module0139.f9011(module0139.$g1635$.getDynamicValue(var2));
            }
            finally {
                module0139.$g1635$.rebind(var12_21, var2);
            }
        }
        finally {
            module0147.$g2095$.rebind(var6, var2);
            module0147.$g2094$.rebind(var5, var2);
        }
        return module0077.f5312(var4);
    }
    
    public static SubLObject f16556(final SubLObject var61, final SubLObject var62) {
        assert NIL != Types.integerp(var62) : var62;
        if (NIL == module0269.f17710(var61)) {
            return (SubLObject)NIL;
        }
        final SubLObject var63 = module0227.f15185(var61);
        SubLObject var64 = (SubLObject)NIL;
        SubLObject var65 = (SubLObject)NIL;
        SubLObject var66;
        for (var66 = (SubLObject)NIL, var66 = (SubLObject)ZERO_INTEGER; var66.numL(var62); var66 = Numbers.add(var66, (SubLObject)ONE_INTEGER)) {
            if (NIL != module0052.f3687(var63)) {
                return var65;
            }
            var64 = module0052.f3694(var63, (SubLObject)$ic43$);
            if (var64 != $ic43$) {
                var65 = (SubLObject)ConsesLow.cons(var64, var65);
            }
        }
        return var65;
    }
    
    public static SubLObject f16557(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        final SubLObject var5 = module0147.$g2094$.currentBinding(var4);
        final SubLObject var6 = module0147.$g2095$.currentBinding(var4);
        try {
            module0147.$g2094$.bind((SubLObject)$ic20$, var4);
            module0147.$g2095$.bind($ic21$, var4);
            return f16552(var1, var2, var3);
        }
        finally {
            module0147.$g2095$.rebind(var6, var4);
            module0147.$g2094$.rebind(var5, var4);
        }
    }
    
    public static SubLObject f16558(final SubLObject var66, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var67 = SubLProcess.currentSubLThread();
        assert NIL != module0210.f13565(var66) : var66;
        SubLObject var68 = (SubLObject)ZERO_INTEGER;
        SubLObject var69 = var66;
        final SubLObject var70 = (SubLObject)$ic29$;
        final SubLObject var71 = module0056.f4145(var70);
        final SubLObject var72 = module0139.$g1635$.currentBinding(var67);
        try {
            module0139.$g1635$.bind(module0139.f9007(), var67);
            final SubLObject var73 = var2;
            final SubLObject var12_69 = module0147.$g2095$.currentBinding(var67);
            final SubLObject var74 = module0147.$g2094$.currentBinding(var67);
            final SubLObject var75 = module0147.$g2096$.currentBinding(var67);
            try {
                module0147.$g2095$.bind(module0147.f9545(var73), var67);
                module0147.$g2094$.bind(module0147.f9546(var73), var67);
                module0147.$g2096$.bind(module0147.f9549(var73), var67);
                final SubLObject var76 = var3;
                final SubLObject var12_70 = module0141.$g1714$.currentBinding(var67);
                final SubLObject var13_71 = module0141.$g1715$.currentBinding(var67);
                try {
                    module0141.$g1714$.bind((NIL != var76) ? var76 : module0141.f9283(), var67);
                    module0141.$g1715$.bind((SubLObject)((NIL != var76) ? $ic30$ : module0141.$g1715$.getDynamicValue(var67)), var67);
                    if (NIL != var76 && NIL != module0136.f8864() && NIL == module0141.f9279(var76)) {
                        final SubLObject var77 = module0136.$g1591$.getDynamicValue(var67);
                        if (var77.eql((SubLObject)$ic31$)) {
                            module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic32$, var76, (SubLObject)$ic33$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                        else if (var77.eql((SubLObject)$ic34$)) {
                            module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic35$, (SubLObject)$ic32$, var76, (SubLObject)$ic33$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                        else if (var77.eql((SubLObject)$ic36$)) {
                            Errors.warn((SubLObject)$ic32$, var76, (SubLObject)$ic33$);
                        }
                        else {
                            Errors.warn((SubLObject)$ic37$, module0136.$g1591$.getDynamicValue(var67));
                            Errors.cerror((SubLObject)$ic35$, (SubLObject)$ic32$, var76, (SubLObject)$ic33$);
                        }
                    }
                    final SubLObject var12_71 = module0141.$g1670$.currentBinding(var67);
                    final SubLObject var13_72 = module0141.$g1671$.currentBinding(var67);
                    final SubLObject var28_74 = module0141.$g1672$.currentBinding(var67);
                    final SubLObject var78 = module0141.$g1674$.currentBinding(var67);
                    final SubLObject var79 = module0137.$g1605$.currentBinding(var67);
                    try {
                        module0141.$g1670$.bind(module0137.f8955($ic0$), var67);
                        module0141.$g1671$.bind(module0244.f15739(module0137.f8955($ic0$)), var67);
                        module0141.$g1672$.bind(module0244.f15746(module0137.f8955($ic0$)), var67);
                        module0141.$g1674$.bind((SubLObject)NIL, var67);
                        module0137.$g1605$.bind(module0137.f8955($ic0$), var67);
                        if (NIL != module0136.f8865() || NIL != module0244.f15795(var66, module0137.f8955((SubLObject)UNPROVIDED))) {
                            final SubLObject var12_72 = module0141.$g1677$.currentBinding(var67);
                            final SubLObject var13_73 = module0138.$g1619$.currentBinding(var67);
                            final SubLObject var28_75 = module0141.$g1674$.currentBinding(var67);
                            try {
                                module0141.$g1677$.bind(module0141.f9210(), var67);
                                module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0137.f8955($ic0$)), var67);
                                module0141.$g1674$.bind((SubLObject)NIL, var67);
                                module0249.f16055(var69, (SubLObject)UNPROVIDED);
                                while (NIL != var69) {
                                    final SubLObject var80 = var69;
                                    var68 = Numbers.add(var68, (SubLObject)ONE_INTEGER);
                                    SubLObject var82;
                                    final SubLObject var81 = var82 = module0200.f12443(module0137.f8955($ic0$));
                                    SubLObject var83 = (SubLObject)NIL;
                                    var83 = var82.first();
                                    while (NIL != var82) {
                                        final SubLObject var12_73 = module0137.$g1605$.currentBinding(var67);
                                        final SubLObject var13_74 = module0141.$g1674$.currentBinding(var67);
                                        try {
                                            module0137.$g1605$.bind(var83, var67);
                                            module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var67)) : module0141.$g1674$.getDynamicValue(var67)), var67);
                                            final SubLObject var84 = module0228.f15229(var69);
                                            if (NIL != module0138.f8992(var84)) {
                                                final SubLObject var85 = module0242.f15664(var84, module0137.f8955((SubLObject)UNPROVIDED));
                                                if (NIL != var85) {
                                                    final SubLObject var86 = module0245.f15834(var85, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                    if (NIL != var86) {
                                                        SubLObject var87;
                                                        for (var87 = module0066.f4838(module0067.f4891(var86)); NIL == module0066.f4841(var87); var87 = module0066.f4840(var87)) {
                                                            var67.resetMultipleValues();
                                                            final SubLObject var44_80 = module0066.f4839(var87);
                                                            final SubLObject var88 = var67.secondMultipleValue();
                                                            var67.resetMultipleValues();
                                                            if (NIL != module0147.f9507(var44_80)) {
                                                                final SubLObject var12_74 = module0138.$g1623$.currentBinding(var67);
                                                                try {
                                                                    module0138.$g1623$.bind(var44_80, var67);
                                                                    SubLObject var43_82;
                                                                    for (var43_82 = module0066.f4838(module0067.f4891(var88)); NIL == module0066.f4841(var43_82); var43_82 = module0066.f4840(var43_82)) {
                                                                        var67.resetMultipleValues();
                                                                        final SubLObject var48_83 = module0066.f4839(var43_82);
                                                                        final SubLObject var89 = var67.secondMultipleValue();
                                                                        var67.resetMultipleValues();
                                                                        if (NIL != module0141.f9289(var48_83)) {
                                                                            final SubLObject var12_75 = module0138.$g1624$.currentBinding(var67);
                                                                            try {
                                                                                module0138.$g1624$.bind(var48_83, var67);
                                                                                final SubLObject var90 = var89;
                                                                                if (NIL != module0077.f5302(var90)) {
                                                                                    final SubLObject var91 = module0077.f5333(var90);
                                                                                    SubLObject var92;
                                                                                    SubLObject var93;
                                                                                    SubLObject var94;
                                                                                    for (var92 = module0032.f1741(var91), var93 = (SubLObject)NIL, var93 = module0032.f1742(var92, var91); NIL == module0032.f1744(var92, var93); var93 = module0032.f1743(var93)) {
                                                                                        var94 = module0032.f1745(var92, var93);
                                                                                        if (NIL != module0032.f1746(var93, var94) && NIL == module0249.f16059(var94, (SubLObject)UNPROVIDED)) {
                                                                                            module0249.f16055(var94, (SubLObject)UNPROVIDED);
                                                                                            module0056.f4149(var94, var71);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (var90.isList()) {
                                                                                    SubLObject var95 = var90;
                                                                                    SubLObject var96 = (SubLObject)NIL;
                                                                                    var96 = var95.first();
                                                                                    while (NIL != var95) {
                                                                                        if (NIL == module0249.f16059(var96, (SubLObject)UNPROVIDED)) {
                                                                                            module0249.f16055(var96, (SubLObject)UNPROVIDED);
                                                                                            module0056.f4149(var96, var71);
                                                                                        }
                                                                                        var95 = var95.rest();
                                                                                        var96 = var95.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)$ic38$, var90);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1624$.rebind(var12_75, var67);
                                                                            }
                                                                        }
                                                                    }
                                                                    module0066.f4842(var43_82);
                                                                }
                                                                finally {
                                                                    module0138.$g1623$.rebind(var12_74, var67);
                                                                }
                                                            }
                                                        }
                                                        module0066.f4842(var87);
                                                    }
                                                }
                                                else {
                                                    module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic39$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                }
                                            }
                                            else if (NIL != module0155.f9785(var84, (SubLObject)UNPROVIDED)) {
                                                SubLObject var36_85;
                                                final SubLObject var97 = var36_85 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var67), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var67), module0137.f8955((SubLObject)UNPROVIDED)));
                                                SubLObject var98 = (SubLObject)NIL;
                                                var98 = var36_85.first();
                                                while (NIL != var36_85) {
                                                    final SubLObject var12_76 = module0138.$g1625$.currentBinding(var67);
                                                    try {
                                                        module0138.$g1625$.bind(var98, var67);
                                                        final SubLObject var100;
                                                        final SubLObject var99 = var100 = Functions.funcall(var98, var84);
                                                        if (NIL != module0077.f5302(var100)) {
                                                            final SubLObject var101 = module0077.f5333(var100);
                                                            SubLObject var102;
                                                            SubLObject var103;
                                                            SubLObject var104;
                                                            for (var102 = module0032.f1741(var101), var103 = (SubLObject)NIL, var103 = module0032.f1742(var102, var101); NIL == module0032.f1744(var102, var103); var103 = module0032.f1743(var103)) {
                                                                var104 = module0032.f1745(var102, var103);
                                                                if (NIL != module0032.f1746(var103, var104) && NIL == module0249.f16059(var104, (SubLObject)UNPROVIDED)) {
                                                                    module0249.f16055(var104, (SubLObject)UNPROVIDED);
                                                                    module0056.f4149(var104, var71);
                                                                }
                                                            }
                                                        }
                                                        else if (var100.isList()) {
                                                            SubLObject var105 = var100;
                                                            SubLObject var106 = (SubLObject)NIL;
                                                            var106 = var105.first();
                                                            while (NIL != var105) {
                                                                if (NIL == module0249.f16059(var106, (SubLObject)UNPROVIDED)) {
                                                                    module0249.f16055(var106, (SubLObject)UNPROVIDED);
                                                                    module0056.f4149(var106, var71);
                                                                }
                                                                var105 = var105.rest();
                                                                var106 = var105.first();
                                                            }
                                                        }
                                                        else {
                                                            Errors.error((SubLObject)$ic38$, var100);
                                                        }
                                                    }
                                                    finally {
                                                        module0138.$g1625$.rebind(var12_76, var67);
                                                    }
                                                    var36_85 = var36_85.rest();
                                                    var98 = var36_85.first();
                                                }
                                            }
                                        }
                                        finally {
                                            module0141.$g1674$.rebind(var13_74, var67);
                                            module0137.$g1605$.rebind(var12_73, var67);
                                        }
                                        var82 = var82.rest();
                                        var83 = var82.first();
                                    }
                                    var69 = module0056.f4150(var71);
                                }
                            }
                            finally {
                                module0141.$g1674$.rebind(var28_75, var67);
                                module0138.$g1619$.rebind(var13_73, var67);
                                module0141.$g1677$.rebind(var12_72, var67);
                            }
                        }
                        else {
                            module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic40$, var66, module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                    }
                    finally {
                        module0137.$g1605$.rebind(var79, var67);
                        module0141.$g1674$.rebind(var78, var67);
                        module0141.$g1672$.rebind(var28_74, var67);
                        module0141.$g1671$.rebind(var13_72, var67);
                        module0141.$g1670$.rebind(var12_71, var67);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var13_71, var67);
                    module0141.$g1714$.rebind(var12_70, var67);
                }
            }
            finally {
                module0147.$g2096$.rebind(var75, var67);
                module0147.$g2094$.rebind(var74, var67);
                module0147.$g2095$.rebind(var12_69, var67);
            }
            module0139.f9011(module0139.$g1635$.getDynamicValue(var67));
        }
        finally {
            module0139.$g1635$.rebind(var72, var67);
        }
        return var68;
    }
    
    public static SubLObject f16559(final SubLObject var66, final SubLObject var87, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var88 = SubLProcess.currentSubLThread();
        SubLObject var89 = (SubLObject)ZERO_INTEGER;
        SubLObject var90 = var66;
        final SubLObject var91 = (SubLObject)$ic29$;
        final SubLObject var92 = module0056.f4145(var91);
        final SubLObject var93 = module0139.$g1635$.currentBinding(var88);
        try {
            module0139.$g1635$.bind(module0139.f9007(), var88);
            final SubLObject var94 = var2;
            final SubLObject var12_88 = module0147.$g2095$.currentBinding(var88);
            final SubLObject var95 = module0147.$g2094$.currentBinding(var88);
            final SubLObject var96 = module0147.$g2096$.currentBinding(var88);
            try {
                module0147.$g2095$.bind(module0147.f9545(var94), var88);
                module0147.$g2094$.bind(module0147.f9546(var94), var88);
                module0147.$g2096$.bind(module0147.f9549(var94), var88);
                final SubLObject var97 = var3;
                final SubLObject var12_89 = module0141.$g1714$.currentBinding(var88);
                final SubLObject var13_90 = module0141.$g1715$.currentBinding(var88);
                try {
                    module0141.$g1714$.bind((NIL != var97) ? var97 : module0141.f9283(), var88);
                    module0141.$g1715$.bind((SubLObject)((NIL != var97) ? $ic30$ : module0141.$g1715$.getDynamicValue(var88)), var88);
                    if (NIL != var97 && NIL != module0136.f8864() && NIL == module0141.f9279(var97)) {
                        final SubLObject var98 = module0136.$g1591$.getDynamicValue(var88);
                        if (var98.eql((SubLObject)$ic31$)) {
                            module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic32$, var97, (SubLObject)$ic33$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                        else if (var98.eql((SubLObject)$ic34$)) {
                            module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic35$, (SubLObject)$ic32$, var97, (SubLObject)$ic33$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                        else if (var98.eql((SubLObject)$ic36$)) {
                            Errors.warn((SubLObject)$ic32$, var97, (SubLObject)$ic33$);
                        }
                        else {
                            Errors.warn((SubLObject)$ic37$, module0136.$g1591$.getDynamicValue(var88));
                            Errors.cerror((SubLObject)$ic35$, (SubLObject)$ic32$, var97, (SubLObject)$ic33$);
                        }
                    }
                    final SubLObject var12_90 = module0141.$g1670$.currentBinding(var88);
                    final SubLObject var13_91 = module0141.$g1671$.currentBinding(var88);
                    final SubLObject var28_93 = module0141.$g1672$.currentBinding(var88);
                    final SubLObject var99 = module0141.$g1674$.currentBinding(var88);
                    final SubLObject var100 = module0137.$g1605$.currentBinding(var88);
                    try {
                        module0141.$g1670$.bind(module0137.f8955($ic0$), var88);
                        module0141.$g1671$.bind(module0244.f15739(module0137.f8955($ic0$)), var88);
                        module0141.$g1672$.bind(module0244.f15746(module0137.f8955($ic0$)), var88);
                        module0141.$g1674$.bind((SubLObject)NIL, var88);
                        module0137.$g1605$.bind(module0137.f8955($ic0$), var88);
                        if (NIL != module0136.f8865() || NIL != module0244.f15795(var66, module0137.f8955((SubLObject)UNPROVIDED))) {
                            final SubLObject var12_91 = module0141.$g1677$.currentBinding(var88);
                            final SubLObject var13_92 = module0138.$g1619$.currentBinding(var88);
                            final SubLObject var28_94 = module0141.$g1674$.currentBinding(var88);
                            try {
                                module0141.$g1677$.bind(module0141.f9210(), var88);
                                module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0137.f8955($ic0$)), var88);
                                module0141.$g1674$.bind((SubLObject)NIL, var88);
                                module0249.f16055(var90, (SubLObject)UNPROVIDED);
                                while (NIL != var90) {
                                    final SubLObject var101 = var90;
                                    if (NIL != Functions.funcall(var87, var101)) {
                                        var89 = Numbers.add(var89, (SubLObject)ONE_INTEGER);
                                    }
                                    SubLObject var103;
                                    final SubLObject var102 = var103 = module0200.f12443(module0137.f8955($ic0$));
                                    SubLObject var104 = (SubLObject)NIL;
                                    var104 = var103.first();
                                    while (NIL != var103) {
                                        final SubLObject var12_92 = module0137.$g1605$.currentBinding(var88);
                                        final SubLObject var13_93 = module0141.$g1674$.currentBinding(var88);
                                        try {
                                            module0137.$g1605$.bind(var104, var88);
                                            module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var88)) : module0141.$g1674$.getDynamicValue(var88)), var88);
                                            final SubLObject var105 = module0228.f15229(var90);
                                            if (NIL != module0138.f8992(var105)) {
                                                final SubLObject var106 = module0242.f15664(var105, module0137.f8955((SubLObject)UNPROVIDED));
                                                if (NIL != var106) {
                                                    final SubLObject var107 = module0245.f15834(var106, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                    if (NIL != var107) {
                                                        SubLObject var108;
                                                        for (var108 = module0066.f4838(module0067.f4891(var107)); NIL == module0066.f4841(var108); var108 = module0066.f4840(var108)) {
                                                            var88.resetMultipleValues();
                                                            final SubLObject var44_99 = module0066.f4839(var108);
                                                            final SubLObject var109 = var88.secondMultipleValue();
                                                            var88.resetMultipleValues();
                                                            if (NIL != module0147.f9507(var44_99)) {
                                                                final SubLObject var12_93 = module0138.$g1623$.currentBinding(var88);
                                                                try {
                                                                    module0138.$g1623$.bind(var44_99, var88);
                                                                    SubLObject var43_101;
                                                                    for (var43_101 = module0066.f4838(module0067.f4891(var109)); NIL == module0066.f4841(var43_101); var43_101 = module0066.f4840(var43_101)) {
                                                                        var88.resetMultipleValues();
                                                                        final SubLObject var48_102 = module0066.f4839(var43_101);
                                                                        final SubLObject var110 = var88.secondMultipleValue();
                                                                        var88.resetMultipleValues();
                                                                        if (NIL != module0141.f9289(var48_102)) {
                                                                            final SubLObject var12_94 = module0138.$g1624$.currentBinding(var88);
                                                                            try {
                                                                                module0138.$g1624$.bind(var48_102, var88);
                                                                                final SubLObject var111 = var110;
                                                                                if (NIL != module0077.f5302(var111)) {
                                                                                    final SubLObject var112 = module0077.f5333(var111);
                                                                                    SubLObject var113;
                                                                                    SubLObject var114;
                                                                                    SubLObject var115;
                                                                                    for (var113 = module0032.f1741(var112), var114 = (SubLObject)NIL, var114 = module0032.f1742(var113, var112); NIL == module0032.f1744(var113, var114); var114 = module0032.f1743(var114)) {
                                                                                        var115 = module0032.f1745(var113, var114);
                                                                                        if (NIL != module0032.f1746(var114, var115) && NIL == module0249.f16059(var115, (SubLObject)UNPROVIDED)) {
                                                                                            module0249.f16055(var115, (SubLObject)UNPROVIDED);
                                                                                            module0056.f4149(var115, var92);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (var111.isList()) {
                                                                                    SubLObject var116 = var111;
                                                                                    SubLObject var117 = (SubLObject)NIL;
                                                                                    var117 = var116.first();
                                                                                    while (NIL != var116) {
                                                                                        if (NIL == module0249.f16059(var117, (SubLObject)UNPROVIDED)) {
                                                                                            module0249.f16055(var117, (SubLObject)UNPROVIDED);
                                                                                            module0056.f4149(var117, var92);
                                                                                        }
                                                                                        var116 = var116.rest();
                                                                                        var117 = var116.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)$ic38$, var111);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1624$.rebind(var12_94, var88);
                                                                            }
                                                                        }
                                                                    }
                                                                    module0066.f4842(var43_101);
                                                                }
                                                                finally {
                                                                    module0138.$g1623$.rebind(var12_93, var88);
                                                                }
                                                            }
                                                        }
                                                        module0066.f4842(var108);
                                                    }
                                                }
                                                else {
                                                    module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic39$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                }
                                            }
                                            else if (NIL != module0155.f9785(var105, (SubLObject)UNPROVIDED)) {
                                                SubLObject var36_104;
                                                final SubLObject var118 = var36_104 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var88), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var88), module0137.f8955((SubLObject)UNPROVIDED)));
                                                SubLObject var119 = (SubLObject)NIL;
                                                var119 = var36_104.first();
                                                while (NIL != var36_104) {
                                                    final SubLObject var12_95 = module0138.$g1625$.currentBinding(var88);
                                                    try {
                                                        module0138.$g1625$.bind(var119, var88);
                                                        final SubLObject var121;
                                                        final SubLObject var120 = var121 = Functions.funcall(var119, var105);
                                                        if (NIL != module0077.f5302(var121)) {
                                                            final SubLObject var122 = module0077.f5333(var121);
                                                            SubLObject var123;
                                                            SubLObject var124;
                                                            SubLObject var125;
                                                            for (var123 = module0032.f1741(var122), var124 = (SubLObject)NIL, var124 = module0032.f1742(var123, var122); NIL == module0032.f1744(var123, var124); var124 = module0032.f1743(var124)) {
                                                                var125 = module0032.f1745(var123, var124);
                                                                if (NIL != module0032.f1746(var124, var125) && NIL == module0249.f16059(var125, (SubLObject)UNPROVIDED)) {
                                                                    module0249.f16055(var125, (SubLObject)UNPROVIDED);
                                                                    module0056.f4149(var125, var92);
                                                                }
                                                            }
                                                        }
                                                        else if (var121.isList()) {
                                                            SubLObject var126 = var121;
                                                            SubLObject var127 = (SubLObject)NIL;
                                                            var127 = var126.first();
                                                            while (NIL != var126) {
                                                                if (NIL == module0249.f16059(var127, (SubLObject)UNPROVIDED)) {
                                                                    module0249.f16055(var127, (SubLObject)UNPROVIDED);
                                                                    module0056.f4149(var127, var92);
                                                                }
                                                                var126 = var126.rest();
                                                                var127 = var126.first();
                                                            }
                                                        }
                                                        else {
                                                            Errors.error((SubLObject)$ic38$, var121);
                                                        }
                                                    }
                                                    finally {
                                                        module0138.$g1625$.rebind(var12_95, var88);
                                                    }
                                                    var36_104 = var36_104.rest();
                                                    var119 = var36_104.first();
                                                }
                                            }
                                        }
                                        finally {
                                            module0141.$g1674$.rebind(var13_93, var88);
                                            module0137.$g1605$.rebind(var12_92, var88);
                                        }
                                        var103 = var103.rest();
                                        var104 = var103.first();
                                    }
                                    var90 = module0056.f4150(var92);
                                }
                            }
                            finally {
                                module0141.$g1674$.rebind(var28_94, var88);
                                module0138.$g1619$.rebind(var13_92, var88);
                                module0141.$g1677$.rebind(var12_91, var88);
                            }
                        }
                        else {
                            module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic40$, var66, module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                    }
                    finally {
                        module0137.$g1605$.rebind(var100, var88);
                        module0141.$g1674$.rebind(var99, var88);
                        module0141.$g1672$.rebind(var28_93, var88);
                        module0141.$g1671$.rebind(var13_91, var88);
                        module0141.$g1670$.rebind(var12_90, var88);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var13_90, var88);
                    module0141.$g1714$.rebind(var12_89, var88);
                }
            }
            finally {
                module0147.$g2096$.rebind(var96, var88);
                module0147.$g2094$.rebind(var95, var88);
                module0147.$g2095$.rebind(var12_88, var88);
            }
            module0139.f9011(module0139.$g1635$.getDynamicValue(var88));
        }
        finally {
            module0139.$g1635$.rebind(var93, var88);
        }
        return var89;
    }
    
    public static SubLObject f16560(final SubLObject var66, final SubLObject var106, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var107 = SubLProcess.currentSubLThread();
        SubLObject var108 = (SubLObject)ZERO_INTEGER;
        SubLObject var109 = (SubLObject)NIL;
        if (NIL == var109) {
            SubLObject var110 = var66;
            final SubLObject var111 = (SubLObject)$ic29$;
            final SubLObject var112 = module0056.f4145(var111);
            final SubLObject var113 = module0139.$g1635$.currentBinding(var107);
            try {
                module0139.$g1635$.bind(module0139.f9007(), var107);
                final SubLObject var114 = var2;
                final SubLObject var12_108 = module0147.$g2095$.currentBinding(var107);
                final SubLObject var115 = module0147.$g2094$.currentBinding(var107);
                final SubLObject var116 = module0147.$g2096$.currentBinding(var107);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var114), var107);
                    module0147.$g2094$.bind(module0147.f9546(var114), var107);
                    module0147.$g2096$.bind(module0147.f9549(var114), var107);
                    final SubLObject var117 = var3;
                    final SubLObject var12_109 = module0141.$g1714$.currentBinding(var107);
                    final SubLObject var13_110 = module0141.$g1715$.currentBinding(var107);
                    try {
                        module0141.$g1714$.bind((NIL != var117) ? var117 : module0141.f9283(), var107);
                        module0141.$g1715$.bind((SubLObject)((NIL != var117) ? $ic30$ : module0141.$g1715$.getDynamicValue(var107)), var107);
                        if (NIL != var117 && NIL != module0136.f8864() && NIL == module0141.f9279(var117)) {
                            final SubLObject var118 = module0136.$g1591$.getDynamicValue(var107);
                            if (var118.eql((SubLObject)$ic31$)) {
                                module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic32$, var117, (SubLObject)$ic33$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var118.eql((SubLObject)$ic34$)) {
                                module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic35$, (SubLObject)$ic32$, var117, (SubLObject)$ic33$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var118.eql((SubLObject)$ic36$)) {
                                Errors.warn((SubLObject)$ic32$, var117, (SubLObject)$ic33$);
                            }
                            else {
                                Errors.warn((SubLObject)$ic37$, module0136.$g1591$.getDynamicValue(var107));
                                Errors.cerror((SubLObject)$ic35$, (SubLObject)$ic32$, var117, (SubLObject)$ic33$);
                            }
                        }
                        final SubLObject var12_110 = module0141.$g1670$.currentBinding(var107);
                        final SubLObject var13_111 = module0141.$g1671$.currentBinding(var107);
                        final SubLObject var28_113 = module0141.$g1672$.currentBinding(var107);
                        final SubLObject var119 = module0141.$g1674$.currentBinding(var107);
                        final SubLObject var120 = module0137.$g1605$.currentBinding(var107);
                        try {
                            module0141.$g1670$.bind(module0137.f8955($ic0$), var107);
                            module0141.$g1671$.bind(module0244.f15739(module0137.f8955($ic0$)), var107);
                            module0141.$g1672$.bind(module0244.f15746(module0137.f8955($ic0$)), var107);
                            module0141.$g1674$.bind((SubLObject)NIL, var107);
                            module0137.$g1605$.bind(module0137.f8955($ic0$), var107);
                            if (NIL != module0136.f8865() || NIL != module0244.f15795(var66, module0137.f8955((SubLObject)UNPROVIDED))) {
                                final SubLObject var12_111 = module0141.$g1677$.currentBinding(var107);
                                final SubLObject var13_112 = module0138.$g1619$.currentBinding(var107);
                                final SubLObject var28_114 = module0141.$g1674$.currentBinding(var107);
                                try {
                                    module0141.$g1677$.bind(module0141.f9210(), var107);
                                    module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0137.f8955($ic0$)), var107);
                                    module0141.$g1674$.bind((SubLObject)NIL, var107);
                                    module0249.f16055(var110, (SubLObject)UNPROVIDED);
                                    while (NIL != var110 && NIL == var109) {
                                        final SubLObject var121 = var110;
                                        var108 = Numbers.add(var108, (SubLObject)ONE_INTEGER);
                                        if (var108.numG(var106)) {
                                            var109 = (SubLObject)T;
                                        }
                                        final SubLObject var122 = module0200.f12443(module0137.f8955($ic0$));
                                        SubLObject var123;
                                        SubLObject var124;
                                        SubLObject var12_112;
                                        SubLObject var13_113;
                                        SubLObject var125;
                                        SubLObject var126;
                                        SubLObject var127;
                                        SubLObject var128;
                                        SubLObject var44_120;
                                        SubLObject var129;
                                        SubLObject var12_113;
                                        SubLObject var43_122;
                                        SubLObject var48_123;
                                        SubLObject var130;
                                        SubLObject var12_114;
                                        SubLObject var131;
                                        SubLObject var132;
                                        SubLObject var133;
                                        SubLObject var134;
                                        SubLObject var135;
                                        SubLObject var136;
                                        SubLObject var137;
                                        SubLObject var138;
                                        SubLObject var117_125;
                                        SubLObject var139;
                                        SubLObject var12_115;
                                        SubLObject var141;
                                        SubLObject var140;
                                        SubLObject var142;
                                        SubLObject var143;
                                        SubLObject var144;
                                        SubLObject var145;
                                        SubLObject var146;
                                        SubLObject var147;
                                        for (var123 = (SubLObject)NIL, var123 = var122; NIL == var109 && NIL != var123; var123 = var123.rest()) {
                                            var124 = var123.first();
                                            var12_112 = module0137.$g1605$.currentBinding(var107);
                                            var13_113 = module0141.$g1674$.currentBinding(var107);
                                            try {
                                                module0137.$g1605$.bind(var124, var107);
                                                module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var107)) : module0141.$g1674$.getDynamicValue(var107)), var107);
                                                var125 = module0228.f15229(var110);
                                                if (NIL != module0138.f8992(var125)) {
                                                    var126 = module0242.f15664(var125, module0137.f8955((SubLObject)UNPROVIDED));
                                                    if (NIL != var126) {
                                                        var127 = module0245.f15834(var126, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                        if (NIL != var127) {
                                                            for (var128 = module0066.f4838(module0067.f4891(var127)); NIL == var109 && NIL == module0066.f4841(var128); var128 = module0066.f4840(var128)) {
                                                                var107.resetMultipleValues();
                                                                var44_120 = module0066.f4839(var128);
                                                                var129 = var107.secondMultipleValue();
                                                                var107.resetMultipleValues();
                                                                if (NIL != module0147.f9507(var44_120)) {
                                                                    var12_113 = module0138.$g1623$.currentBinding(var107);
                                                                    try {
                                                                        module0138.$g1623$.bind(var44_120, var107);
                                                                        for (var43_122 = module0066.f4838(module0067.f4891(var129)); NIL == var109 && NIL == module0066.f4841(var43_122); var43_122 = module0066.f4840(var43_122)) {
                                                                            var107.resetMultipleValues();
                                                                            var48_123 = module0066.f4839(var43_122);
                                                                            var130 = var107.secondMultipleValue();
                                                                            var107.resetMultipleValues();
                                                                            if (NIL != module0141.f9289(var48_123)) {
                                                                                var12_114 = module0138.$g1624$.currentBinding(var107);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var48_123, var107);
                                                                                    var131 = var130;
                                                                                    if (NIL != module0077.f5302(var131)) {
                                                                                        var132 = module0077.f5333(var131);
                                                                                        for (var133 = module0032.f1741(var132), var134 = (SubLObject)NIL, var134 = module0032.f1742(var133, var132); NIL == var109 && NIL == module0032.f1744(var133, var134); var134 = module0032.f1743(var134)) {
                                                                                            var135 = module0032.f1745(var133, var134);
                                                                                            if (NIL != module0032.f1746(var134, var135) && NIL == module0249.f16059(var135, (SubLObject)UNPROVIDED)) {
                                                                                                module0249.f16055(var135, (SubLObject)UNPROVIDED);
                                                                                                module0056.f4149(var135, var112);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var131.isList()) {
                                                                                        if (NIL == var109) {
                                                                                            var136 = var131;
                                                                                            var137 = (SubLObject)NIL;
                                                                                            var137 = var136.first();
                                                                                            while (NIL == var109 && NIL != var136) {
                                                                                                if (NIL == module0249.f16059(var137, (SubLObject)UNPROVIDED)) {
                                                                                                    module0249.f16055(var137, (SubLObject)UNPROVIDED);
                                                                                                    module0056.f4149(var137, var112);
                                                                                                }
                                                                                                var136 = var136.rest();
                                                                                                var137 = var136.first();
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)$ic38$, var131);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var12_114, var107);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var43_122);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var12_113, var107);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var128);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic39$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                    }
                                                }
                                                else if (NIL != module0155.f9785(var125, (SubLObject)UNPROVIDED)) {
                                                    var138 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var107), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var107), module0137.f8955((SubLObject)UNPROVIDED)));
                                                    for (var117_125 = (SubLObject)NIL, var117_125 = var138; NIL == var109 && NIL != var117_125; var117_125 = var117_125.rest()) {
                                                        var139 = var117_125.first();
                                                        var12_115 = module0138.$g1625$.currentBinding(var107);
                                                        try {
                                                            module0138.$g1625$.bind(var139, var107);
                                                            var140 = (var141 = Functions.funcall(var139, var125));
                                                            if (NIL != module0077.f5302(var141)) {
                                                                var142 = module0077.f5333(var141);
                                                                for (var143 = module0032.f1741(var142), var144 = (SubLObject)NIL, var144 = module0032.f1742(var143, var142); NIL == var109 && NIL == module0032.f1744(var143, var144); var144 = module0032.f1743(var144)) {
                                                                    var145 = module0032.f1745(var143, var144);
                                                                    if (NIL != module0032.f1746(var144, var145) && NIL == module0249.f16059(var145, (SubLObject)UNPROVIDED)) {
                                                                        module0249.f16055(var145, (SubLObject)UNPROVIDED);
                                                                        module0056.f4149(var145, var112);
                                                                    }
                                                                }
                                                            }
                                                            else if (var141.isList()) {
                                                                if (NIL == var109) {
                                                                    var146 = var141;
                                                                    var147 = (SubLObject)NIL;
                                                                    var147 = var146.first();
                                                                    while (NIL == var109 && NIL != var146) {
                                                                        if (NIL == module0249.f16059(var147, (SubLObject)UNPROVIDED)) {
                                                                            module0249.f16055(var147, (SubLObject)UNPROVIDED);
                                                                            module0056.f4149(var147, var112);
                                                                        }
                                                                        var146 = var146.rest();
                                                                        var147 = var146.first();
                                                                    }
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)$ic38$, var141);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var12_115, var107);
                                                        }
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var13_113, var107);
                                                module0137.$g1605$.rebind(var12_112, var107);
                                            }
                                        }
                                        var110 = module0056.f4150(var112);
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var28_114, var107);
                                    module0138.$g1619$.rebind(var13_112, var107);
                                    module0141.$g1677$.rebind(var12_111, var107);
                                }
                            }
                            else {
                                module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic40$, var66, module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var120, var107);
                            module0141.$g1674$.rebind(var119, var107);
                            module0141.$g1672$.rebind(var28_113, var107);
                            module0141.$g1671$.rebind(var13_111, var107);
                            module0141.$g1670$.rebind(var12_110, var107);
                        }
                    }
                    finally {
                        module0141.$g1715$.rebind(var13_110, var107);
                        module0141.$g1714$.rebind(var12_109, var107);
                    }
                }
                finally {
                    module0147.$g2096$.rebind(var116, var107);
                    module0147.$g2094$.rebind(var115, var107);
                    module0147.$g2095$.rebind(var12_108, var107);
                }
                module0139.f9011(module0139.$g1635$.getDynamicValue(var107));
            }
            finally {
                module0139.$g1635$.rebind(var113, var107);
            }
        }
        return Numbers.numE(var108, var106);
    }
    
    public static SubLObject f16561(final SubLObject var66, final SubLObject var106, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var107 = SubLProcess.currentSubLThread();
        SubLObject var108 = (SubLObject)ZERO_INTEGER;
        SubLObject var109 = (SubLObject)NIL;
        if (NIL == var109) {
            SubLObject var110 = var66;
            final SubLObject var111 = (SubLObject)$ic29$;
            final SubLObject var112 = module0056.f4145(var111);
            final SubLObject var113 = module0139.$g1635$.currentBinding(var107);
            try {
                module0139.$g1635$.bind(module0139.f9007(), var107);
                final SubLObject var114 = var2;
                final SubLObject var12_127 = module0147.$g2095$.currentBinding(var107);
                final SubLObject var115 = module0147.$g2094$.currentBinding(var107);
                final SubLObject var116 = module0147.$g2096$.currentBinding(var107);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var114), var107);
                    module0147.$g2094$.bind(module0147.f9546(var114), var107);
                    module0147.$g2096$.bind(module0147.f9549(var114), var107);
                    final SubLObject var117 = var3;
                    final SubLObject var12_128 = module0141.$g1714$.currentBinding(var107);
                    final SubLObject var13_129 = module0141.$g1715$.currentBinding(var107);
                    try {
                        module0141.$g1714$.bind((NIL != var117) ? var117 : module0141.f9283(), var107);
                        module0141.$g1715$.bind((SubLObject)((NIL != var117) ? $ic30$ : module0141.$g1715$.getDynamicValue(var107)), var107);
                        if (NIL != var117 && NIL != module0136.f8864() && NIL == module0141.f9279(var117)) {
                            final SubLObject var118 = module0136.$g1591$.getDynamicValue(var107);
                            if (var118.eql((SubLObject)$ic31$)) {
                                module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic32$, var117, (SubLObject)$ic33$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var118.eql((SubLObject)$ic34$)) {
                                module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic35$, (SubLObject)$ic32$, var117, (SubLObject)$ic33$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var118.eql((SubLObject)$ic36$)) {
                                Errors.warn((SubLObject)$ic32$, var117, (SubLObject)$ic33$);
                            }
                            else {
                                Errors.warn((SubLObject)$ic37$, module0136.$g1591$.getDynamicValue(var107));
                                Errors.cerror((SubLObject)$ic35$, (SubLObject)$ic32$, var117, (SubLObject)$ic33$);
                            }
                        }
                        final SubLObject var12_129 = module0141.$g1670$.currentBinding(var107);
                        final SubLObject var13_130 = module0141.$g1671$.currentBinding(var107);
                        final SubLObject var28_132 = module0141.$g1672$.currentBinding(var107);
                        final SubLObject var119 = module0141.$g1674$.currentBinding(var107);
                        final SubLObject var120 = module0137.$g1605$.currentBinding(var107);
                        try {
                            module0141.$g1670$.bind(module0137.f8955($ic0$), var107);
                            module0141.$g1671$.bind(module0244.f15739(module0137.f8955($ic0$)), var107);
                            module0141.$g1672$.bind(module0244.f15746(module0137.f8955($ic0$)), var107);
                            module0141.$g1674$.bind((SubLObject)NIL, var107);
                            module0137.$g1605$.bind(module0137.f8955($ic0$), var107);
                            if (NIL != module0136.f8865() || NIL != module0244.f15795(var66, module0137.f8955((SubLObject)UNPROVIDED))) {
                                final SubLObject var12_130 = module0141.$g1677$.currentBinding(var107);
                                final SubLObject var13_131 = module0138.$g1619$.currentBinding(var107);
                                final SubLObject var28_133 = module0141.$g1674$.currentBinding(var107);
                                try {
                                    module0141.$g1677$.bind(module0141.f9210(), var107);
                                    module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0137.f8955($ic0$)), var107);
                                    module0141.$g1674$.bind((SubLObject)NIL, var107);
                                    module0249.f16055(var110, (SubLObject)UNPROVIDED);
                                    while (NIL != var110 && NIL == var109) {
                                        final SubLObject var121 = var110;
                                        var108 = Numbers.add(var108, (SubLObject)ONE_INTEGER);
                                        if (var108.numG(var106)) {
                                            var109 = (SubLObject)T;
                                        }
                                        final SubLObject var122 = module0200.f12443(module0137.f8955($ic0$));
                                        SubLObject var123;
                                        SubLObject var124;
                                        SubLObject var12_131;
                                        SubLObject var13_132;
                                        SubLObject var125;
                                        SubLObject var126;
                                        SubLObject var127;
                                        SubLObject var128;
                                        SubLObject var44_138;
                                        SubLObject var129;
                                        SubLObject var12_132;
                                        SubLObject var43_140;
                                        SubLObject var48_141;
                                        SubLObject var130;
                                        SubLObject var12_133;
                                        SubLObject var131;
                                        SubLObject var132;
                                        SubLObject var133;
                                        SubLObject var134;
                                        SubLObject var135;
                                        SubLObject var136;
                                        SubLObject var137;
                                        SubLObject var138;
                                        SubLObject var117_143;
                                        SubLObject var139;
                                        SubLObject var12_134;
                                        SubLObject var141;
                                        SubLObject var140;
                                        SubLObject var142;
                                        SubLObject var143;
                                        SubLObject var144;
                                        SubLObject var145;
                                        SubLObject var146;
                                        SubLObject var147;
                                        for (var123 = (SubLObject)NIL, var123 = var122; NIL == var109 && NIL != var123; var123 = var123.rest()) {
                                            var124 = var123.first();
                                            var12_131 = module0137.$g1605$.currentBinding(var107);
                                            var13_132 = module0141.$g1674$.currentBinding(var107);
                                            try {
                                                module0137.$g1605$.bind(var124, var107);
                                                module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var107)) : module0141.$g1674$.getDynamicValue(var107)), var107);
                                                var125 = module0228.f15229(var110);
                                                if (NIL != module0138.f8992(var125)) {
                                                    var126 = module0242.f15664(var125, module0137.f8955((SubLObject)UNPROVIDED));
                                                    if (NIL != var126) {
                                                        var127 = module0245.f15834(var126, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                        if (NIL != var127) {
                                                            for (var128 = module0066.f4838(module0067.f4891(var127)); NIL == var109 && NIL == module0066.f4841(var128); var128 = module0066.f4840(var128)) {
                                                                var107.resetMultipleValues();
                                                                var44_138 = module0066.f4839(var128);
                                                                var129 = var107.secondMultipleValue();
                                                                var107.resetMultipleValues();
                                                                if (NIL != module0147.f9507(var44_138)) {
                                                                    var12_132 = module0138.$g1623$.currentBinding(var107);
                                                                    try {
                                                                        module0138.$g1623$.bind(var44_138, var107);
                                                                        for (var43_140 = module0066.f4838(module0067.f4891(var129)); NIL == var109 && NIL == module0066.f4841(var43_140); var43_140 = module0066.f4840(var43_140)) {
                                                                            var107.resetMultipleValues();
                                                                            var48_141 = module0066.f4839(var43_140);
                                                                            var130 = var107.secondMultipleValue();
                                                                            var107.resetMultipleValues();
                                                                            if (NIL != module0141.f9289(var48_141)) {
                                                                                var12_133 = module0138.$g1624$.currentBinding(var107);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var48_141, var107);
                                                                                    var131 = var130;
                                                                                    if (NIL != module0077.f5302(var131)) {
                                                                                        var132 = module0077.f5333(var131);
                                                                                        for (var133 = module0032.f1741(var132), var134 = (SubLObject)NIL, var134 = module0032.f1742(var133, var132); NIL == var109 && NIL == module0032.f1744(var133, var134); var134 = module0032.f1743(var134)) {
                                                                                            var135 = module0032.f1745(var133, var134);
                                                                                            if (NIL != module0032.f1746(var134, var135) && NIL == module0249.f16059(var135, (SubLObject)UNPROVIDED)) {
                                                                                                module0249.f16055(var135, (SubLObject)UNPROVIDED);
                                                                                                module0056.f4149(var135, var112);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var131.isList()) {
                                                                                        if (NIL == var109) {
                                                                                            var136 = var131;
                                                                                            var137 = (SubLObject)NIL;
                                                                                            var137 = var136.first();
                                                                                            while (NIL == var109 && NIL != var136) {
                                                                                                if (NIL == module0249.f16059(var137, (SubLObject)UNPROVIDED)) {
                                                                                                    module0249.f16055(var137, (SubLObject)UNPROVIDED);
                                                                                                    module0056.f4149(var137, var112);
                                                                                                }
                                                                                                var136 = var136.rest();
                                                                                                var137 = var136.first();
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)$ic38$, var131);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var12_133, var107);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var43_140);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var12_132, var107);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var128);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic39$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                    }
                                                }
                                                else if (NIL != module0155.f9785(var125, (SubLObject)UNPROVIDED)) {
                                                    var138 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var107), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var107), module0137.f8955((SubLObject)UNPROVIDED)));
                                                    for (var117_143 = (SubLObject)NIL, var117_143 = var138; NIL == var109 && NIL != var117_143; var117_143 = var117_143.rest()) {
                                                        var139 = var117_143.first();
                                                        var12_134 = module0138.$g1625$.currentBinding(var107);
                                                        try {
                                                            module0138.$g1625$.bind(var139, var107);
                                                            var140 = (var141 = Functions.funcall(var139, var125));
                                                            if (NIL != module0077.f5302(var141)) {
                                                                var142 = module0077.f5333(var141);
                                                                for (var143 = module0032.f1741(var142), var144 = (SubLObject)NIL, var144 = module0032.f1742(var143, var142); NIL == var109 && NIL == module0032.f1744(var143, var144); var144 = module0032.f1743(var144)) {
                                                                    var145 = module0032.f1745(var143, var144);
                                                                    if (NIL != module0032.f1746(var144, var145) && NIL == module0249.f16059(var145, (SubLObject)UNPROVIDED)) {
                                                                        module0249.f16055(var145, (SubLObject)UNPROVIDED);
                                                                        module0056.f4149(var145, var112);
                                                                    }
                                                                }
                                                            }
                                                            else if (var141.isList()) {
                                                                if (NIL == var109) {
                                                                    var146 = var141;
                                                                    var147 = (SubLObject)NIL;
                                                                    var147 = var146.first();
                                                                    while (NIL == var109 && NIL != var146) {
                                                                        if (NIL == module0249.f16059(var147, (SubLObject)UNPROVIDED)) {
                                                                            module0249.f16055(var147, (SubLObject)UNPROVIDED);
                                                                            module0056.f4149(var147, var112);
                                                                        }
                                                                        var146 = var146.rest();
                                                                        var147 = var146.first();
                                                                    }
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)$ic38$, var141);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var12_134, var107);
                                                        }
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var13_132, var107);
                                                module0137.$g1605$.rebind(var12_131, var107);
                                            }
                                        }
                                        var110 = module0056.f4150(var112);
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var28_133, var107);
                                    module0138.$g1619$.rebind(var13_131, var107);
                                    module0141.$g1677$.rebind(var12_130, var107);
                                }
                            }
                            else {
                                module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic40$, var66, module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var120, var107);
                            module0141.$g1674$.rebind(var119, var107);
                            module0141.$g1672$.rebind(var28_132, var107);
                            module0141.$g1671$.rebind(var13_130, var107);
                            module0141.$g1670$.rebind(var12_129, var107);
                        }
                    }
                    finally {
                        module0141.$g1715$.rebind(var13_129, var107);
                        module0141.$g1714$.rebind(var12_128, var107);
                    }
                }
                finally {
                    module0147.$g2096$.rebind(var116, var107);
                    module0147.$g2094$.rebind(var115, var107);
                    module0147.$g2095$.rebind(var12_127, var107);
                }
                module0139.f9011(module0139.$g1635$.getDynamicValue(var107));
            }
            finally {
                module0139.$g1635$.rebind(var113, var107);
            }
        }
        return var109;
    }
    
    public static SubLObject f16562(final SubLObject var66, final SubLObject var106, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var107 = SubLProcess.currentSubLThread();
        SubLObject var108 = (SubLObject)ZERO_INTEGER;
        SubLObject var109 = (SubLObject)NIL;
        if (NIL == var109) {
            SubLObject var110 = var66;
            final SubLObject var111 = (SubLObject)$ic29$;
            final SubLObject var112 = module0056.f4145(var111);
            final SubLObject var113 = module0139.$g1635$.currentBinding(var107);
            try {
                module0139.$g1635$.bind(module0139.f9007(), var107);
                final SubLObject var114 = var2;
                final SubLObject var12_146 = module0147.$g2095$.currentBinding(var107);
                final SubLObject var115 = module0147.$g2094$.currentBinding(var107);
                final SubLObject var116 = module0147.$g2096$.currentBinding(var107);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var114), var107);
                    module0147.$g2094$.bind(module0147.f9546(var114), var107);
                    module0147.$g2096$.bind(module0147.f9549(var114), var107);
                    final SubLObject var117 = var3;
                    final SubLObject var12_147 = module0141.$g1714$.currentBinding(var107);
                    final SubLObject var13_148 = module0141.$g1715$.currentBinding(var107);
                    try {
                        module0141.$g1714$.bind((NIL != var117) ? var117 : module0141.f9283(), var107);
                        module0141.$g1715$.bind((SubLObject)((NIL != var117) ? $ic30$ : module0141.$g1715$.getDynamicValue(var107)), var107);
                        if (NIL != var117 && NIL != module0136.f8864() && NIL == module0141.f9279(var117)) {
                            final SubLObject var118 = module0136.$g1591$.getDynamicValue(var107);
                            if (var118.eql((SubLObject)$ic31$)) {
                                module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic32$, var117, (SubLObject)$ic33$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var118.eql((SubLObject)$ic34$)) {
                                module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic35$, (SubLObject)$ic32$, var117, (SubLObject)$ic33$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var118.eql((SubLObject)$ic36$)) {
                                Errors.warn((SubLObject)$ic32$, var117, (SubLObject)$ic33$);
                            }
                            else {
                                Errors.warn((SubLObject)$ic37$, module0136.$g1591$.getDynamicValue(var107));
                                Errors.cerror((SubLObject)$ic35$, (SubLObject)$ic32$, var117, (SubLObject)$ic33$);
                            }
                        }
                        final SubLObject var12_148 = module0141.$g1670$.currentBinding(var107);
                        final SubLObject var13_149 = module0141.$g1671$.currentBinding(var107);
                        final SubLObject var28_151 = module0141.$g1672$.currentBinding(var107);
                        final SubLObject var119 = module0141.$g1674$.currentBinding(var107);
                        final SubLObject var120 = module0137.$g1605$.currentBinding(var107);
                        try {
                            module0141.$g1670$.bind(module0137.f8955($ic0$), var107);
                            module0141.$g1671$.bind(module0244.f15739(module0137.f8955($ic0$)), var107);
                            module0141.$g1672$.bind(module0244.f15746(module0137.f8955($ic0$)), var107);
                            module0141.$g1674$.bind((SubLObject)NIL, var107);
                            module0137.$g1605$.bind(module0137.f8955($ic0$), var107);
                            if (NIL != module0136.f8865() || NIL != module0244.f15795(var66, module0137.f8955((SubLObject)UNPROVIDED))) {
                                final SubLObject var12_149 = module0141.$g1677$.currentBinding(var107);
                                final SubLObject var13_150 = module0138.$g1619$.currentBinding(var107);
                                final SubLObject var28_152 = module0141.$g1674$.currentBinding(var107);
                                try {
                                    module0141.$g1677$.bind(module0141.f9210(), var107);
                                    module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0137.f8955($ic0$)), var107);
                                    module0141.$g1674$.bind((SubLObject)NIL, var107);
                                    module0249.f16055(var110, (SubLObject)UNPROVIDED);
                                    while (NIL != var110 && NIL == var109) {
                                        final SubLObject var121 = var110;
                                        var108 = Numbers.add(var108, (SubLObject)ONE_INTEGER);
                                        if (var108.numGE(var106)) {
                                            var109 = (SubLObject)T;
                                        }
                                        final SubLObject var122 = module0200.f12443(module0137.f8955($ic0$));
                                        SubLObject var123;
                                        SubLObject var124;
                                        SubLObject var12_150;
                                        SubLObject var13_151;
                                        SubLObject var125;
                                        SubLObject var126;
                                        SubLObject var127;
                                        SubLObject var128;
                                        SubLObject var44_157;
                                        SubLObject var129;
                                        SubLObject var12_151;
                                        SubLObject var43_159;
                                        SubLObject var48_160;
                                        SubLObject var130;
                                        SubLObject var12_152;
                                        SubLObject var131;
                                        SubLObject var132;
                                        SubLObject var133;
                                        SubLObject var134;
                                        SubLObject var135;
                                        SubLObject var136;
                                        SubLObject var137;
                                        SubLObject var138;
                                        SubLObject var117_162;
                                        SubLObject var139;
                                        SubLObject var12_153;
                                        SubLObject var141;
                                        SubLObject var140;
                                        SubLObject var142;
                                        SubLObject var143;
                                        SubLObject var144;
                                        SubLObject var145;
                                        SubLObject var146;
                                        SubLObject var147;
                                        for (var123 = (SubLObject)NIL, var123 = var122; NIL == var109 && NIL != var123; var123 = var123.rest()) {
                                            var124 = var123.first();
                                            var12_150 = module0137.$g1605$.currentBinding(var107);
                                            var13_151 = module0141.$g1674$.currentBinding(var107);
                                            try {
                                                module0137.$g1605$.bind(var124, var107);
                                                module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var107)) : module0141.$g1674$.getDynamicValue(var107)), var107);
                                                var125 = module0228.f15229(var110);
                                                if (NIL != module0138.f8992(var125)) {
                                                    var126 = module0242.f15664(var125, module0137.f8955((SubLObject)UNPROVIDED));
                                                    if (NIL != var126) {
                                                        var127 = module0245.f15834(var126, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                        if (NIL != var127) {
                                                            for (var128 = module0066.f4838(module0067.f4891(var127)); NIL == var109 && NIL == module0066.f4841(var128); var128 = module0066.f4840(var128)) {
                                                                var107.resetMultipleValues();
                                                                var44_157 = module0066.f4839(var128);
                                                                var129 = var107.secondMultipleValue();
                                                                var107.resetMultipleValues();
                                                                if (NIL != module0147.f9507(var44_157)) {
                                                                    var12_151 = module0138.$g1623$.currentBinding(var107);
                                                                    try {
                                                                        module0138.$g1623$.bind(var44_157, var107);
                                                                        for (var43_159 = module0066.f4838(module0067.f4891(var129)); NIL == var109 && NIL == module0066.f4841(var43_159); var43_159 = module0066.f4840(var43_159)) {
                                                                            var107.resetMultipleValues();
                                                                            var48_160 = module0066.f4839(var43_159);
                                                                            var130 = var107.secondMultipleValue();
                                                                            var107.resetMultipleValues();
                                                                            if (NIL != module0141.f9289(var48_160)) {
                                                                                var12_152 = module0138.$g1624$.currentBinding(var107);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var48_160, var107);
                                                                                    var131 = var130;
                                                                                    if (NIL != module0077.f5302(var131)) {
                                                                                        var132 = module0077.f5333(var131);
                                                                                        for (var133 = module0032.f1741(var132), var134 = (SubLObject)NIL, var134 = module0032.f1742(var133, var132); NIL == var109 && NIL == module0032.f1744(var133, var134); var134 = module0032.f1743(var134)) {
                                                                                            var135 = module0032.f1745(var133, var134);
                                                                                            if (NIL != module0032.f1746(var134, var135) && NIL == module0249.f16059(var135, (SubLObject)UNPROVIDED)) {
                                                                                                module0249.f16055(var135, (SubLObject)UNPROVIDED);
                                                                                                module0056.f4149(var135, var112);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var131.isList()) {
                                                                                        if (NIL == var109) {
                                                                                            var136 = var131;
                                                                                            var137 = (SubLObject)NIL;
                                                                                            var137 = var136.first();
                                                                                            while (NIL == var109 && NIL != var136) {
                                                                                                if (NIL == module0249.f16059(var137, (SubLObject)UNPROVIDED)) {
                                                                                                    module0249.f16055(var137, (SubLObject)UNPROVIDED);
                                                                                                    module0056.f4149(var137, var112);
                                                                                                }
                                                                                                var136 = var136.rest();
                                                                                                var137 = var136.first();
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)$ic38$, var131);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var12_152, var107);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var43_159);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var12_151, var107);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var128);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic39$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                    }
                                                }
                                                else if (NIL != module0155.f9785(var125, (SubLObject)UNPROVIDED)) {
                                                    var138 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var107), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var107), module0137.f8955((SubLObject)UNPROVIDED)));
                                                    for (var117_162 = (SubLObject)NIL, var117_162 = var138; NIL == var109 && NIL != var117_162; var117_162 = var117_162.rest()) {
                                                        var139 = var117_162.first();
                                                        var12_153 = module0138.$g1625$.currentBinding(var107);
                                                        try {
                                                            module0138.$g1625$.bind(var139, var107);
                                                            var140 = (var141 = Functions.funcall(var139, var125));
                                                            if (NIL != module0077.f5302(var141)) {
                                                                var142 = module0077.f5333(var141);
                                                                for (var143 = module0032.f1741(var142), var144 = (SubLObject)NIL, var144 = module0032.f1742(var143, var142); NIL == var109 && NIL == module0032.f1744(var143, var144); var144 = module0032.f1743(var144)) {
                                                                    var145 = module0032.f1745(var143, var144);
                                                                    if (NIL != module0032.f1746(var144, var145) && NIL == module0249.f16059(var145, (SubLObject)UNPROVIDED)) {
                                                                        module0249.f16055(var145, (SubLObject)UNPROVIDED);
                                                                        module0056.f4149(var145, var112);
                                                                    }
                                                                }
                                                            }
                                                            else if (var141.isList()) {
                                                                if (NIL == var109) {
                                                                    var146 = var141;
                                                                    var147 = (SubLObject)NIL;
                                                                    var147 = var146.first();
                                                                    while (NIL == var109 && NIL != var146) {
                                                                        if (NIL == module0249.f16059(var147, (SubLObject)UNPROVIDED)) {
                                                                            module0249.f16055(var147, (SubLObject)UNPROVIDED);
                                                                            module0056.f4149(var147, var112);
                                                                        }
                                                                        var146 = var146.rest();
                                                                        var147 = var146.first();
                                                                    }
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)$ic38$, var141);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var12_153, var107);
                                                        }
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var13_151, var107);
                                                module0137.$g1605$.rebind(var12_150, var107);
                                            }
                                        }
                                        var110 = module0056.f4150(var112);
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var28_152, var107);
                                    module0138.$g1619$.rebind(var13_150, var107);
                                    module0141.$g1677$.rebind(var12_149, var107);
                                }
                            }
                            else {
                                module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic40$, var66, module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var120, var107);
                            module0141.$g1674$.rebind(var119, var107);
                            module0141.$g1672$.rebind(var28_151, var107);
                            module0141.$g1671$.rebind(var13_149, var107);
                            module0141.$g1670$.rebind(var12_148, var107);
                        }
                    }
                    finally {
                        module0141.$g1715$.rebind(var13_148, var107);
                        module0141.$g1714$.rebind(var12_147, var107);
                    }
                }
                finally {
                    module0147.$g2096$.rebind(var116, var107);
                    module0147.$g2094$.rebind(var115, var107);
                    module0147.$g2095$.rebind(var12_146, var107);
                }
                module0139.f9011(module0139.$g1635$.getDynamicValue(var107));
            }
            finally {
                module0139.$g1635$.rebind(var113, var107);
            }
        }
        return var109;
    }
    
    public static SubLObject f16563(final SubLObject var66, final SubLObject var106, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return Numbers.numL(f16558(var66, var2, var3), var106);
    }
    
    public static SubLObject f16564(final SubLObject var66, final SubLObject var106, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return Numbers.numLE(f16558(var66, var2, var3), var106);
    }
    
    public static SubLObject f16565(final SubLObject var34, final SubLObject var164, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0210.f13565(var34) : var34;
        assert NIL != module0210.f13565(var164) : var164;
        return module0252.f16330(module0137.f8955($ic0$), var34, var164, var2, var3);
    }
    
    public static SubLObject f16550(final SubLObject var165, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != Types.listp(var165) : var165;
        if (NIL == var165) {
            return (SubLObject)NIL;
        }
        if (NIL != module0035.f1997(var165)) {
            return f16531(var165.first(), var2, var3);
        }
        return module0252.f16252(module0137.f8955($ic0$), var165, var2, var3);
    }
    
    public static SubLObject f16566(final SubLObject var165, final SubLObject var6, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLObject var166 = f16550(var165, var2, var3);
        final SubLObject var167 = module0259.f16841(var6, var166, var2, var3);
        return f16529(var167, var2, var3);
    }
    
    public static SubLObject f16567(final SubLObject var165, final SubLObject var166, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0076.f5290(f16550(var165, var2, var3), var166, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f16568(final SubLObject var167, final SubLObject var168, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return conses_high.subsetp(var168, f16567(var167, var168, var2, var3), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f16569(final SubLObject var165, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != Types.listp(var165) : var165;
        if (NIL == var165) {
            return (SubLObject)NIL;
        }
        if (NIL != module0035.f1997(var165)) {
            return f16552(var165.first(), var2, var3);
        }
        return module0252.f16254(module0137.f8955($ic0$), var165, var2, var3);
    }
    
    public static SubLObject f16570(final SubLObject var165, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return Sequences.length(f16569(var165, var2, var3));
    }
    
    public static SubLObject f16571(final SubLObject var165, final SubLObject var164, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return f16538(f16572(var164, var165, var2, (SubLObject)UNPROVIDED), var2, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f16573(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0210.f13565(var1) : var1;
        return module0252.f16340(module0137.f8955($ic0$), var1, var2, var3);
    }
    
    public static SubLObject f16574(final SubLObject var1, final SubLObject var166, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return f16529(f16575(var1, var166, var2, var3), var2, var3);
    }
    
    public static SubLObject f16575(final SubLObject var1, final SubLObject var166, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0210.f13565(var1) : var1;
        assert NIL != Types.listp(var166) : var166;
        if (NIL == var166) {
            return (SubLObject)NIL;
        }
        if (NIL == module0035.f1997(var166)) {
            return module0252.f16332(module0137.f8955($ic0$), var1, var166, var2, var3);
        }
        if (NIL != f16576(var1, var166.first(), var2, var3)) {
            return var166;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16572(final SubLObject var1, final SubLObject var166, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0210.f13565(var1) : var1;
        assert NIL != Types.listp(var166) : var166;
        if (NIL == var166) {
            return (SubLObject)NIL;
        }
        if (NIL == module0035.f1997(var166)) {
            return module0252.f16334(module0137.f8955($ic0$), var1, var166, var2, var3);
        }
        if (NIL != f16577(var1, var166.first(), var2, var3)) {
            return var166;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16578(final SubLObject var1, final SubLObject var166, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return f16538(f16572(var1, var166, var2, var3), var2, var3);
    }
    
    public static SubLObject f16579(final SubLObject var169, final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != Types.function_spec_p(var169) : var169;
        assert NIL != module0210.f13565(var1) : var1;
        return module0252.f16291(module0137.f8955($ic0$), var1, var169, var2, var3);
    }
    
    public static SubLObject f16580(final SubLObject var169, final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != Types.function_spec_p(var169) : var169;
        assert NIL != module0210.f13565(var1) : var1;
        return module0252.f16293(module0137.f8955($ic0$), var1, var169, var2, var3);
    }
    
    public static SubLObject f16581(final SubLObject var169, final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0252.f16294(module0137.f8955($ic0$), var1, var169, var2, var3);
    }
    
    public static SubLObject f16582(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0210.f13565(var1) : var1;
        return module0254.f16477(module0137.f8955($ic0$), var1, var2, var3);
    }
    
    public static SubLObject f16583(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0210.f13565(var1) : var1;
        return module0254.f16478(module0137.f8955($ic0$), var1, var2, var3);
    }
    
    public static SubLObject f16584(final SubLObject var167, final SubLObject var168, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0252.f16328(module0137.f8955($ic0$), var167, var168, var2, var3);
    }
    
    public static SubLObject f16585(final SubLObject var170, final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != Types.function_spec_p(var170) : var170;
        assert NIL != module0210.f13565(var1) : var1;
        module0252.f16269(module0137.f8955($ic0$), var1, var170, var2, var3);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16586(final SubLObject var170, final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != Types.function_spec_p(var170) : var170;
        assert NIL != module0210.f13565(var1) : var1;
        module0252.f16272(module0137.f8955($ic0$), var1, var170, var2, var3);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16587(final SubLObject var170, final SubLObject var165, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        module0252.f16274(module0137.f8955($ic0$), var165, var170, var2, var3);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16588(final SubLObject var170, final SubLObject var171, final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        module0252.f16270(module0137.f8955($ic0$), var1, var170, var171, var2, var3);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16589(final SubLObject var170, final SubLObject var1, SubLObject var2, SubLObject var3, SubLObject var172) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (var172 == UNPROVIDED) {
            var172 = (SubLObject)NIL;
        }
        return module0252.f16279(module0137.f8955($ic0$), var1, var170, var2, var3, var172);
    }
    
    public static SubLObject f16590(final SubLObject var170, final SubLObject var1, SubLObject var2, SubLObject var3, SubLObject var172) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (var172 == UNPROVIDED) {
            var172 = (SubLObject)NIL;
        }
        return module0252.f16281(module0137.f8955($ic0$), var1, var170, var2, var3, var172);
    }
    
    public static SubLObject f16591(final SubLObject var170, final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != Types.function_spec_p(var170) : var170;
        assert NIL != module0210.f13565(var1) : var1;
        return module0252.f16282(module0137.f8955($ic0$), var1, var170, var2, var3, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f16592(final SubLObject var170, final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != Types.function_spec_p(var170) : var170;
        assert NIL != module0210.f13565(var1) : var1;
        return module0252.f16285(module0137.f8955($ic0$), var1, var170, var2, var3, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f16593(final SubLObject var1, SubLObject var173, SubLObject var2, SubLObject var3) {
        if (var173 == UNPROVIDED) {
            var173 = (SubLObject)ONE_INTEGER;
        }
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0252.f16266(module0137.f8955($ic0$), var1, var173, var2, var3);
    }
    
    public static SubLObject f16594(final SubLObject var174, final SubLObject var1, SubLObject var173, SubLObject var2, SubLObject var3) {
        if (var173 == UNPROVIDED) {
            var173 = (SubLObject)ONE_INTEGER;
        }
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0252.f16268(module0137.f8955($ic0$), var174, var1, var173, var2, var3);
    }
    
    public static SubLObject f16576(final SubLObject var34, final SubLObject var164, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0210.f13565(var34) : var34;
        assert NIL != module0210.f13565(var164) : var164;
        if (NIL == module0173.f10955(var34) || NIL != module0269.f17705(var34)) {
            return (SubLObject)makeBoolean(NIL != module0252.f16343(module0137.f8955($ic0$), var34, var164, var2, var3) || NIL != ((NIL != module0206.f13453(var34)) ? f16595(var34, var164, var2) : NIL));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16596(final SubLObject var34, final SubLObject var164, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return f16576(var34, var164, var2, var3);
    }
    
    public static SubLObject f16597(final SubLObject var34, final SubLObject var164, SubLObject var14) {
        if (var14 == UNPROVIDED) {
            var14 = module0262.f17362(module0147.$g2095$.getDynamicValue());
        }
        final SubLThread var165 = SubLProcess.currentSubLThread();
        SubLObject var166 = (SubLObject)NIL;
        final SubLObject var167 = module0147.$g2094$.currentBinding(var165);
        final SubLObject var168 = module0147.$g2096$.currentBinding(var165);
        try {
            module0147.$g2094$.bind((SubLObject)$ic23$, var165);
            module0147.$g2096$.bind(var14, var165);
            var166 = f16576(var34, var164, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            module0147.$g2096$.rebind(var168, var165);
            module0147.$g2094$.rebind(var167, var165);
        }
        return var166;
    }
    
    public static SubLObject f16598(final SubLObject var34, final SubLObject var164) {
        final SubLThread var165 = SubLProcess.currentSubLThread();
        SubLObject var166 = (SubLObject)NIL;
        final SubLObject var167 = module0147.$g2094$.currentBinding(var165);
        final SubLObject var168 = module0147.$g2095$.currentBinding(var165);
        try {
            module0147.$g2094$.bind((SubLObject)$ic20$, var165);
            module0147.$g2095$.bind($ic21$, var165);
            var166 = f16576(var34, var164, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var168, var165);
            module0147.$g2094$.rebind(var167, var165);
        }
        return var166;
    }
    
    public static SubLObject f16577(final SubLObject var164, final SubLObject var34, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0210.f13565(var164) : var164;
        assert NIL != module0210.f13565(var34) : var34;
        return f16576(var34, var164, var2, var3);
    }
    
    public static SubLObject f16599(final SubLObject var9, final SubLObject var164, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLObject var165 = module0205.f13330(var9);
        if (NIL != module0167.f10813(var165)) {
            return f16576(var165, var164, var2, (SubLObject)UNPROVIDED);
        }
        return f16600(var9, var164, var2);
    }
    
    public static SubLObject f16600(final SubLObject var9, final SubLObject var164, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return (SubLObject)makeBoolean(NIL != f16601(module0205.f13276(var9), var164, var2) || NIL != f16602(var9, var164, var2) || NIL != f16603(var9, var164, var2) || NIL != f16595(var9, var164, var2));
    }
    
    public static SubLObject f16601(final SubLObject var176, final SubLObject var66, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return f16604(var66, module0226.f15014(var176, var2, (SubLObject)UNPROVIDED), var2, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f16602(final SubLObject var9, final SubLObject var66, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return f16604(var66, module0226.f15016(var9, var2), var2, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f16603(final SubLObject var9, final SubLObject var66, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return f16604(var66, module0226.f15019(var9, var2), var2, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f16595(final SubLObject var9, final SubLObject var66, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var67 = SubLProcess.currentSubLThread();
        if (NIL != module0018.$g666$.getDynamicValue(var67) && module0205.f13276(var9).eql(module0205.f13276(var66))) {
            final SubLObject var68 = module0205.f13276(var66);
            SubLObject var69 = (SubLObject)NIL;
            if (NIL == var69) {
                SubLObject var70;
                SubLObject var71;
                for (var70 = module0220.f14566(var68, $ic95$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var71 = (SubLObject)NIL, var71 = var70.first(); NIL == var69 && NIL != var70; var69 = f16596(module0205.f13362(var9, var71, (SubLObject)UNPROVIDED), module0205.f13362(var66, var71, (SubLObject)UNPROVIDED), var2, (SubLObject)UNPROVIDED), var70 = var70.rest(), var71 = var70.first()) {}
            }
            return var69;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16605(final SubLObject var164, final SubLObject var34, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0252.f16345(module0137.f8955($ic0$), var164, var34, var2, var3);
    }
    
    public static SubLObject f16606(final SubLObject var34, final SubLObject var168, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0210.f13565(var34) : var34;
        assert NIL != Types.listp(var168) : var168;
        if (NIL == var168) {
            return (SubLObject)NIL;
        }
        if (NIL != module0035.f1997(var168)) {
            return f16576(var34, var168.first(), var2, var3);
        }
        return module0252.f16352(module0137.f8955($ic0$), var34, var168, var2, var3);
    }
    
    public static SubLObject f16604(final SubLObject var164, final SubLObject var167, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var168 = SubLProcess.currentSubLThread();
        assert NIL != module0210.f13565(var164) : var164;
        assert NIL != Types.listp(var167) : var167;
        SubLObject var169 = (SubLObject)NIL;
        final SubLObject var170 = module0141.$g1598$.currentBinding(var168);
        final SubLObject var171 = module0141.$g1682$.currentBinding(var168);
        try {
            module0141.$g1598$.bind((SubLObject)NIL, var168);
            module0141.$g1682$.bind((SubLObject)NIL, var168);
            if (NIL == var167) {
                var169 = (SubLObject)NIL;
            }
            else if (NIL != module0035.f1997(var167)) {
                var169 = f16577(var164, var167.first(), var2, var3);
            }
            else {
                var169 = module0252.f16360(module0137.f8955($ic0$), var167, var164, var2, var3);
            }
        }
        finally {
            module0141.$g1682$.rebind(var171, var168);
            module0141.$g1598$.rebind(var170, var168);
        }
        return var169;
    }
    
    public static SubLObject f16607(final SubLObject var34, final SubLObject var168, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0210.f13565(var34) : var34;
        assert NIL != Types.listp(var168) : var168;
        if (NIL == var168) {
            return (SubLObject)T;
        }
        if (NIL != module0035.f1997(var168)) {
            return f16576(var34, var168.first(), var2, var3);
        }
        return module0252.f16358(module0137.f8955($ic0$), var34, var168, var2, var3);
    }
    
    public static SubLObject f16608(final SubLObject var164, final SubLObject var167, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0210.f13565(var164) : var164;
        assert NIL != Types.listp(var167) : var167;
        if (NIL == var167) {
            return (SubLObject)T;
        }
        if (NIL != module0035.f1997(var167)) {
            return f16577(var164, var167.first(), var2, var3);
        }
        return module0252.f16365(module0137.f8955($ic0$), var167, var164, var2, var3);
    }
    
    public static SubLObject f16609(final SubLObject var167, final SubLObject var168, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != Types.listp(var167) : var167;
        assert NIL != Types.listp(var168) : var168;
        if (NIL == var167) {
            return (SubLObject)NIL;
        }
        if (NIL == var168) {
            return (SubLObject)NIL;
        }
        if (NIL != module0035.f1997(var167)) {
            return f16606(var167.first(), var168, var2, var3);
        }
        return module0252.f16370(module0137.f8955($ic0$), var167, var168, var2, var3);
    }
    
    public static SubLObject f16610(final SubLObject var167, final SubLObject var168, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != Types.listp(var167) : var167;
        assert NIL != Types.listp(var168) : var168;
        return module0252.f16374(module0137.f8955($ic0$), var167, var168, var2, var3);
    }
    
    public static SubLObject f16611(final SubLObject var167, final SubLObject var168, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != Types.listp(var167) : var167;
        assert NIL != Types.listp(var168) : var168;
        return module0252.f16372(module0137.f8955($ic0$), var167, var168, var2, var3);
    }
    
    public static SubLObject f16612(final SubLObject var1, final SubLObject var178, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return f16613(var1, var178, var2, var3);
    }
    
    public static SubLObject f16613(final SubLObject var1, final SubLObject var178, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0210.f13565(var1) : var1;
        assert NIL != module0210.f13565(var178) : var178;
        return module0254.f16488(module0137.f8955($ic0$), var1, var178, var2, var3);
    }
    
    public static SubLObject f16614(final SubLObject var1, final SubLObject var178, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0254.f16487(module0137.f8955($ic0$), var1, var178, var2, var3);
    }
    
    public static SubLObject f16615(final SubLObject var1, final SubLObject var179, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0210.f13565(var1) : var1;
        assert NIL != Types.listp(var179) : var179;
        if (NIL == var179) {
            return (SubLObject)T;
        }
        if (NIL != module0035.f1997(var179)) {
            return f16613(var179.first(), var1, var2, var3);
        }
        return module0254.f16493(module0137.f8955($ic0$), var179, var1, var2, var3);
    }
    
    public static SubLObject f16616(final SubLObject var1, final SubLObject var180, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0210.f13565(var1) : var1;
        assert NIL != Types.listp(var180) : var180;
        if (NIL == var180) {
            return (SubLObject)NIL;
        }
        if (NIL != module0035.f1997(var180)) {
            return f16613(var1, var180.first(), var2, var3);
        }
        return module0254.f16491(module0137.f8955($ic0$), var180, var1, var2, var3);
    }
    
    public static SubLObject f16617(final SubLObject var66, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var66) : var66;
        if (NIL != var2 && !areAssertionsDisabledFor(me) && NIL == module0161.f10481(var2)) {
            throw new AssertionError(var2);
        }
        return module0035.f2099(f16531(var66, var2, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f16618(final SubLObject var66, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var66) : var66;
        if (NIL != var2 && !areAssertionsDisabledFor(me) && NIL == module0161.f10481(var2)) {
            throw new AssertionError(var2);
        }
        return module0035.f2099(f16552(var66, var2, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f16619(final SubLObject var181, final SubLObject var182, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        assert NIL != module0210.f13565(var181) : var181;
        assert NIL != module0210.f13565(var182) : var182;
        return (SubLObject)makeBoolean(var181.eql(var182) || NIL != f16620(var181, var182, var2) || NIL != f16621(var181, var182, var2));
    }
    
    public static SubLObject f16621(final SubLObject var181, final SubLObject var182, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return (SubLObject)makeBoolean(NIL != f16576(var181, var182, var2, (SubLObject)UNPROVIDED) && NIL != f16576(var182, var181, var2, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f16622(final SubLObject var181, final SubLObject var182, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16623(final SubLObject var181, final SubLObject var182, SubLObject var2, SubLObject var3, SubLObject var183) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (var183 == UNPROVIDED) {
            var183 = (SubLObject)NIL;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16624(final SubLObject var181, final SubLObject var182, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var183 = SubLProcess.currentSubLThread();
        assert NIL != module0210.f13565(var181) : var181;
        assert NIL != module0210.f13565(var182) : var182;
        return (SubLObject)makeBoolean(NIL != f16576(var181, var182, var2, (SubLObject)UNPROVIDED) || NIL != f16576(var182, var181, var2, (SubLObject)UNPROVIDED) || NIL != module0257.f16699(var181, var182, var2, (SubLObject)UNPROVIDED) || (NIL != $g2484$.getDynamicValue(var183) && NIL != f16622(var181, var182, var2)));
    }
    
    public static SubLObject f16625(final SubLObject var181, final SubLObject var182, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return (SubLObject)makeBoolean(NIL != f16576(var181, var182, var2, (SubLObject)UNPROVIDED) || NIL != f16576(var182, var181, var2, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f16626(final SubLObject var66, final SubLObject var184, final SubLObject var87, SubLObject var2, SubLObject var185, SubLObject var186, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var185 == UNPROVIDED) {
            var185 = (SubLObject)ONE_INTEGER;
        }
        if (var186 == UNPROVIDED) {
            var186 = (SubLObject)TWO_INTEGER;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)$ic136$;
        }
        if (NIL == var66 || NIL == var184) {
            return (SubLObject)NIL;
        }
        if (NIL != module0210.f13593(var66, (SubLObject)UNPROVIDED)) {
            return f16626(module0172.f10921(var66), var184, var87, var2, var185, var186, var3);
        }
        if (NIL != module0210.f13593(var184, (SubLObject)UNPROVIDED)) {
            return f16626(var66, module0172.f10921(var184), var87, var2, var185, var186, var3);
        }
        if (NIL == module0269.f17705(var66)) {
            return (SubLObject)NIL;
        }
        if (NIL == module0173.f10955(var184)) {
            return (SubLObject)NIL;
        }
        return f16627(var66, var184, var87, var2, var185, var186, var3);
    }
    
    public static SubLObject f16627(final SubLObject var66, final SubLObject var184, final SubLObject var87, final SubLObject var2, final SubLObject var185, final SubLObject var186, final SubLObject var3) {
        final SubLThread var187 = SubLProcess.currentSubLThread();
        SubLObject var188 = (SubLObject)NIL;
        final SubLObject var189 = module0147.$g2095$.currentBinding(var187);
        final SubLObject var190 = module0147.$g2094$.currentBinding(var187);
        final SubLObject var191 = module0147.$g2096$.currentBinding(var187);
        try {
            module0147.$g2095$.bind(module0147.f9545(var2), var187);
            module0147.$g2094$.bind(module0147.f9546(var2), var187);
            module0147.$g2096$.bind(module0147.f9549(var2), var187);
            if (module0217.f14221(var184, var185, var87, (SubLObject)UNPROVIDED).numL(Numbers.divide(module0549.f33901(var66), (SubLObject)THREE_INTEGER))) {
                if (NIL != module0158.f10010(var184, var185, var87)) {
                    final SubLObject var192 = module0158.f10011(var184, var185, var87);
                    SubLObject var193 = var188;
                    final SubLObject var194 = (SubLObject)NIL;
                    while (NIL == var193) {
                        final SubLObject var195 = module0052.f3695(var192, var194);
                        final SubLObject var196 = (SubLObject)makeBoolean(!var194.eql(var195));
                        if (NIL != var196) {
                            SubLObject var197 = (SubLObject)NIL;
                            try {
                                var197 = module0158.f10316(var195, (SubLObject)$ic137$, var3, (SubLObject)NIL);
                                SubLObject var189_194 = var188;
                                final SubLObject var190_195 = (SubLObject)NIL;
                                while (NIL == var189_194) {
                                    final SubLObject var198 = module0052.f3695(var197, var190_195);
                                    final SubLObject var192_197 = (SubLObject)makeBoolean(!var190_195.eql(var198));
                                    if (NIL != var192_197 && NIL != f16576(module0178.f11331(var198, var186), var66, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                                        var188 = (SubLObject)T;
                                    }
                                    var189_194 = (SubLObject)makeBoolean(NIL == var192_197 || NIL != var188);
                                }
                            }
                            finally {
                                final SubLObject var12_198 = Threads.$is_thread_performing_cleanupP$.currentBinding(var187);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var187);
                                    if (NIL != var197) {
                                        module0158.f10319(var197);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var12_198, var187);
                                }
                            }
                        }
                        var193 = (SubLObject)makeBoolean(NIL == var196 || NIL != var188);
                    }
                }
            }
            else {
                final SubLObject var199 = f16552(var66, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (NIL != module0158.f10010(var184, var185, var87)) {
                    final SubLObject var200 = module0158.f10011(var184, var185, var87);
                    SubLObject var201 = var188;
                    final SubLObject var202 = (SubLObject)NIL;
                    while (NIL == var201) {
                        final SubLObject var203 = module0052.f3695(var200, var202);
                        final SubLObject var204 = (SubLObject)makeBoolean(!var202.eql(var203));
                        if (NIL != var204) {
                            SubLObject var205 = (SubLObject)NIL;
                            try {
                                var205 = module0158.f10316(var203, (SubLObject)$ic137$, var3, (SubLObject)NIL);
                                SubLObject var189_195 = var188;
                                final SubLObject var190_196 = (SubLObject)NIL;
                                while (NIL == var189_195) {
                                    final SubLObject var206 = module0052.f3695(var205, var190_196);
                                    final SubLObject var192_198 = (SubLObject)makeBoolean(!var190_196.eql(var206));
                                    if (NIL != var192_198 && NIL != module0035.f2169(module0178.f11331(var206, var186), var199)) {
                                        var188 = (SubLObject)T;
                                    }
                                    var189_195 = (SubLObject)makeBoolean(NIL == var192_198 || NIL != var188);
                                }
                            }
                            finally {
                                final SubLObject var12_199 = Threads.$is_thread_performing_cleanupP$.currentBinding(var187);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var187);
                                    if (NIL != var205) {
                                        module0158.f10319(var205);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var12_199, var187);
                                }
                            }
                        }
                        var201 = (SubLObject)makeBoolean(NIL == var204 || NIL != var188);
                    }
                }
            }
        }
        finally {
            module0147.$g2096$.rebind(var191, var187);
            module0147.$g2094$.rebind(var190, var187);
            module0147.$g2095$.rebind(var189, var187);
        }
        return var188;
    }
    
    public static SubLObject f16628(final SubLObject var34, final SubLObject var164, SubLObject var2, SubLObject var3, SubLObject var183) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (var183 == UNPROVIDED) {
            var183 = (SubLObject)NIL;
        }
        assert NIL != module0210.f13565(var34) : var34;
        assert NIL != module0210.f13565(var164) : var164;
        if (NIL != module0210.f13598(var34)) {
            return f16629(var34, var164, var2);
        }
        return module0252.f16349(module0137.f8955($ic0$), var34, var164, var2, var3, var183);
    }
    
    public static SubLObject f16629(final SubLObject var10, final SubLObject var66, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var67 = SubLProcess.currentSubLThread();
        final SubLObject var68 = module0205.f13330(var10);
        final SubLObject var69 = f16628(var68, var66, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != var69) {
            return (SubLObject)ConsesLow.cons(reader.bq_cons((SubLObject)ConsesLow.list($ic142$, var68, var10), (SubLObject)$ic143$), var69);
        }
        SubLObject var70 = (SubLObject)NIL;
        if (NIL == var70) {
            SubLObject var71 = module0226.f15014(module0205.f13276(var10), var2, (SubLObject)UNPROVIDED);
            SubLObject var72 = (SubLObject)NIL;
            var72 = var71.first();
            while (NIL == var70 && NIL != var71) {
                if (!var72.equal(var66)) {
                    var70 = f16628(var72, var66, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                if (NIL != var70 || var72.equal(var66)) {
                    return (SubLObject)ConsesLow.cons(reader.bq_cons((SubLObject)ConsesLow.list($ic144$, module0205.f13276(var10), var72), (SubLObject)$ic143$), var70);
                }
                var71 = var71.rest();
                var72 = var71.first();
            }
        }
        if (NIL == var70) {
            SubLObject var71 = module0226.f15016(var10, var2);
            SubLObject var72 = (SubLObject)NIL;
            var72 = var71.first();
            while (NIL == var70 && NIL != var71) {
                if (!var72.equal(var66)) {
                    var70 = f16628(var72, var66, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                if (NIL != var70 || var72.equal(var66)) {
                    final SubLObject var73 = module0226.f15023(var10, var66, var2, (SubLObject)UNPROVIDED);
                    if (NIL != var73) {
                        return (SubLObject)ConsesLow.cons(reader.bq_cons((SubLObject)ConsesLow.list($ic145$, module0205.f13276(var10), var73.first()), (SubLObject)$ic143$), var70);
                    }
                }
                var71 = var71.rest();
                var72 = var71.first();
            }
        }
        if (NIL == var70) {
            SubLObject var71 = module0226.f15019(var10, var2);
            SubLObject var72 = (SubLObject)NIL;
            var72 = var71.first();
            while (NIL == var70 && NIL != var71) {
                if (!var72.equal(var66)) {
                    var70 = f16628(var72, var66, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                if (NIL != var70 || var72.equal(var66)) {
                    final SubLObject var73 = module0226.f15028(var10, var66, var2).first();
                    if (var73.isCons()) {
                        final SubLObject var74 = var73.first();
                        final SubLObject var75 = conses_high.second(var73);
                        final SubLObject var76 = conses_high.third(var73);
                        final SubLObject var77 = module0205.f13362(var10, var74, (SubLObject)UNPROVIDED);
                        if (!var77.equal(var75)) {
                            var70 = ConsesLow.nconc(var70, f16628(var77, var75, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                        }
                        if (!var76.equal(var66)) {
                            var70 = ConsesLow.nconc(var70, f16628(var76, var66, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                        }
                        return (SubLObject)ConsesLow.cons(reader.bq_cons((SubLObject)ConsesLow.list($ic146$, module0205.f13276(var10), var74, var75, var76), (SubLObject)$ic143$), var70);
                    }
                }
                var71 = var71.rest();
                var72 = var71.first();
            }
        }
        if (NIL == var70) {
            SubLObject var71 = module0226.f15020(var10, var2);
            SubLObject var72 = (SubLObject)NIL;
            var72 = var71.first();
            while (NIL == var70 && NIL != var71) {
                if (!var72.equal(var66)) {
                    var70 = f16628(var72, var66, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                if (NIL != var70 || var72.equal(var66)) {
                    final SubLObject var73 = module0226.f15029(var10, var66, var2, (SubLObject)UNPROVIDED).first();
                    if (var73.isCons()) {
                        final SubLObject var78 = var73.first().first();
                        final SubLObject var79 = conses_high.second(var73);
                        final SubLObject var80 = module0205.f13136(var78);
                        final SubLObject var81 = conses_high.third(var73);
                        final SubLObject var82 = conses_high.fourth(var73);
                        final SubLObject var83 = module0205.f13134(var78, var82, (SubLObject)UNPROVIDED);
                        if (!var83.equal(var66)) {
                            var70 = ConsesLow.nconc(var70, f16628(var83, var66, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                        }
                        return ConsesLow.append((SubLObject)ConsesLow.list(reader.bq_cons((SubLObject)ConsesLow.list($ic147$, module0205.f13276(var10), var79, var80, var81, var82), (SubLObject)$ic143$), reader.bq_cons(var78, (SubLObject)$ic143$)), var70);
                    }
                }
                var71 = var71.rest();
                var72 = var71.first();
            }
        }
        if (NIL == var70 && NIL != module0018.$g666$.getDynamicValue(var67) && NIL != module0210.f13598(var66) && module0205.f13276(var10).eql(module0205.f13276(var66))) {
            final SubLObject var84 = module0205.f13276(var66);
            if (NIL == var70) {
                SubLObject var85 = module0220.f14566(var84, $ic95$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                SubLObject var86 = (SubLObject)NIL;
                var86 = var85.first();
                while (NIL == var70 && NIL != var85) {
                    var70 = f16628(module0205.f13362(var10, var86, (SubLObject)UNPROVIDED), module0205.f13362(var66, var86, (SubLObject)UNPROVIDED), var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    if (NIL != var70) {
                        var70 = (SubLObject)ConsesLow.cons(reader.bq_cons((SubLObject)ConsesLow.list($ic95$, var84, var86), (SubLObject)$ic143$), var70);
                    }
                    var85 = var85.rest();
                    var86 = var85.first();
                }
            }
            return var70;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16630(final SubLObject var34, final SubLObject var164, SubLObject var2, SubLObject var3, SubLObject var183) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (var183 == UNPROVIDED) {
            var183 = (SubLObject)NIL;
        }
        assert NIL != module0210.f13565(var34) : var34;
        assert NIL != module0210.f13565(var164) : var164;
        return module0254.f16496(module0137.f8955($ic0$), var34, var164, var2, var3, var183);
    }
    
    public static SubLObject f16631(final SubLObject var34, final SubLObject var164, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        assert NIL != module0210.f13565(var34) : var34;
        assert NIL != module0210.f13565(var164) : var164;
        return f16630(var34, var164, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f16632(final SubLObject var181, final SubLObject var182, SubLObject var2, SubLObject var3, SubLObject var183) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (var183 == UNPROVIDED) {
            var183 = (SubLObject)NIL;
        }
        final SubLThread var184 = SubLProcess.currentSubLThread();
        SubLObject var185 = f16628(var181, var182, var2, var3, var183);
        if (NIL != var185) {
            return var185;
        }
        var185 = f16628(var182, var181, var2, var3, var183);
        if (NIL != var185) {
            return var185;
        }
        var185 = module0257.f16706(var181, var182, var2, var3, var183);
        if (NIL != var185) {
            return var185;
        }
        if (NIL != $g2484$.getDynamicValue(var184)) {
            return f16623(var181, var182, var2, var3, var183);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16633(final SubLObject var181, final SubLObject var182, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return f16632(var181, var182, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f16634(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0210.f13565(var1) : var1;
        return module0252.f16257(module0137.f8955($ic0$), var1, var2, var3);
    }
    
    public static SubLObject f16529(final SubLObject var165, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0269.f17712(var165) : var165;
        return module0252.f16262(module0137.f8955($ic0$), var165, var2, var3);
    }
    
    public static SubLObject f16635(final SubLObject var165, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != Types.listp(var165) : var165;
        final SubLObject var166 = f16529(var165, var2, var3);
        SubLObject var167 = var166.first();
        SubLObject var168 = Sequences.length(f16531(var167, var2, (SubLObject)UNPROVIDED));
        SubLObject var169 = (SubLObject)NIL;
        SubLObject var170 = var166.rest();
        SubLObject var171 = (SubLObject)NIL;
        var171 = var170.first();
        while (NIL != var170) {
            var169 = Sequences.length(f16531(var171, var2, (SubLObject)UNPROVIDED));
            if (var169.numG(var168)) {
                var168 = var169;
                var167 = var171;
            }
            var170 = var170.rest();
            var171 = var170.first();
        }
        return var167;
    }
    
    public static SubLObject f16538(final SubLObject var165, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != Types.listp(var165) : var165;
        return module0252.f16260(module0137.f8955($ic0$), var165, var2, var3, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f16636(final SubLObject var165, SubLObject var166, SubLObject var2, SubLObject var3) {
        if (var166 == UNPROVIDED) {
            var166 = (SubLObject)NIL;
        }
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return f16637(var165, var166, var2, var3);
    }
    
    public static SubLObject f16637(final SubLObject var165, SubLObject var166, SubLObject var2, SubLObject var3) {
        if (var166 == UNPROVIDED) {
            var166 = (SubLObject)NIL;
        }
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != Types.listp(var165) : var165;
        return module0252.f16314(module0137.f8955($ic0$), var165, var166, var2, var3);
    }
    
    public static SubLObject f16638(final SubLObject var165, SubLObject var166, SubLObject var2, SubLObject var3) {
        if (var166 == UNPROVIDED) {
            var166 = (SubLObject)NIL;
        }
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return f16639(var165, var166, var2, var3);
    }
    
    public static SubLObject f16639(final SubLObject var165, SubLObject var166, SubLObject var2, SubLObject var3) {
        if (var166 == UNPROVIDED) {
            var166 = (SubLObject)NIL;
        }
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != Types.listp(var165) : var165;
        return module0252.f16316(module0137.f8955($ic0$), var165, var166, var2, var3, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f16640(final SubLObject var181, final SubLObject var182, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return module0035.sublisp_boolean(f16641(var181, var182, var2, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f16641(final SubLObject var181, final SubLObject var182, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0252.f16326(module0137.f8955($ic0$), var181, var182, var2, var3);
    }
    
    public static SubLObject f16642(final SubLObject var165, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return f16569(f16638(var165, (SubLObject)NIL, var2, var3), var2, var3);
    }
    
    public static SubLObject f16643(final SubLObject var1, final SubLObject var218, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0210.f13565(var1) : var1;
        assert NIL != module0210.f13565(var218) : var218;
        return module0259.f16872($ic0$, var1, var218, var2, var3);
    }
    
    public static SubLObject f16644(final SubLObject var219, final SubLObject var220) {
        assert NIL != module0210.f13565(var219) : var219;
        assert NIL != module0210.f13565(var220) : var220;
        if (NIL != module0210.f13593(var219, (SubLObject)UNPROVIDED)) {
            return f16644(module0172.f10921(var219), var220);
        }
        if (NIL != module0210.f13593(var220, (SubLObject)UNPROVIDED)) {
            return f16644(var219, module0172.f10921(var220));
        }
        if (NIL == module0173.f10955(var219)) {
            return (SubLObject)NIL;
        }
        if (NIL == module0173.f10955(var220)) {
            return (SubLObject)NIL;
        }
        return module0549.f33904(var219, var220);
    }
    
    public static SubLObject f16645(final SubLObject var219, final SubLObject var220) {
        return module0549.f33904(var219, var220);
    }
    
    public static SubLObject f16646(final SubLObject var165) {
        assert NIL != Types.listp(var165) : var165;
        if (NIL == var165) {
            return (SubLObject)NIL;
        }
        SubLObject var166 = var165.first();
        SubLObject var167 = var165.rest();
        SubLObject var168 = (SubLObject)NIL;
        var168 = var167.first();
        while (NIL != var167) {
            var166 = f16645(var166, var168);
            var167 = var167.rest();
            var168 = var167.first();
        }
        return var166;
    }
    
    public static SubLObject f16647(final SubLObject var219, final SubLObject var220) {
        assert NIL != module0210.f13565(var219) : var219;
        assert NIL != module0210.f13565(var220) : var220;
        if (NIL != module0210.f13593(var219, (SubLObject)UNPROVIDED)) {
            return f16647(module0172.f10921(var219), var220);
        }
        if (NIL != module0210.f13593(var220, (SubLObject)UNPROVIDED)) {
            return f16647(var219, module0172.f10921(var220));
        }
        if (NIL == module0173.f10955(var219)) {
            return (SubLObject)NIL;
        }
        if (NIL == module0173.f10955(var220)) {
            return (SubLObject)NIL;
        }
        return module0549.f33905(var219, var220);
    }
    
    public static SubLObject f16648(final SubLObject var219, final SubLObject var220) {
        return module0549.f33905(var219, var220);
    }
    
    public static SubLObject f16649(final SubLObject var34, final SubLObject var164, final SubLObject var2) {
        return module0262.f17327(var2, f16650(var34, var164, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f16650(final SubLObject var34, final SubLObject var164, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0210.f13565(var34) : var34;
        assert NIL != module0210.f13565(var164) : var164;
        if (NIL != module0210.f13598(var34)) {
            return f16651(var34, var164, var3);
        }
        return module0253.f16446(module0137.f8955($ic0$), var34, var164, var3);
    }
    
    public static SubLObject f16651(final SubLObject var34, final SubLObject var164, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var165 = SubLProcess.currentSubLThread();
        final SubLObject var166 = module0172.f10921(var34);
        if (NIL != var166) {
            return f16650(var166, var164, var3);
        }
        final SubLObject var167 = module0205.f13276(var34);
        SubLObject var168 = (SubLObject)NIL;
        SubLObject var169 = (SubLObject)NIL;
        final SubLObject var170 = module0147.$g2094$.currentBinding(var165);
        final SubLObject var171 = module0147.$g2095$.currentBinding(var165);
        try {
            module0147.$g2094$.bind((SubLObject)$ic20$, var165);
            module0147.$g2095$.bind($ic21$, var165);
            SubLObject var172 = module0226.f15014(var167, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var173 = (SubLObject)NIL;
            var173 = var172.first();
            while (NIL != var172) {
                SubLObject var36_224;
                var169 = (var36_224 = f16650(var173, var164, (SubLObject)UNPROVIDED));
                SubLObject var174 = (SubLObject)NIL;
                var174 = var36_224.first();
                while (NIL != var36_224) {
                    if (NIL != module0004.f104(var173, module0226.f15014(var167, var174, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        var168 = (SubLObject)ConsesLow.cons(var174, var168);
                    }
                    var36_224 = var36_224.rest();
                    var174 = var36_224.first();
                }
                var172 = var172.rest();
                var173 = var172.first();
            }
            var172 = module0226.f15016(var34, (SubLObject)UNPROVIDED);
            var173 = (SubLObject)NIL;
            var173 = var172.first();
            while (NIL != var172) {
                SubLObject var36_225;
                var169 = (var36_225 = f16650(var173, var164, (SubLObject)UNPROVIDED));
                SubLObject var174 = (SubLObject)NIL;
                var174 = var36_225.first();
                while (NIL != var36_225) {
                    if (NIL != module0004.f104(var173, module0226.f15016(var34, var174), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        var168 = (SubLObject)ConsesLow.cons(var174, var168);
                    }
                    var36_225 = var36_225.rest();
                    var174 = var36_225.first();
                }
                var172 = var172.rest();
                var173 = var172.first();
            }
            var172 = module0226.f15019(var34, (SubLObject)UNPROVIDED);
            var173 = (SubLObject)NIL;
            var173 = var172.first();
            while (NIL != var172) {
                SubLObject var36_226;
                var169 = (var36_226 = f16650(var173, var164, (SubLObject)UNPROVIDED));
                SubLObject var174 = (SubLObject)NIL;
                var174 = var36_226.first();
                while (NIL != var36_226) {
                    if (NIL != module0004.f104(var173, module0226.f15019(var34, var174), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        var168 = (SubLObject)ConsesLow.cons(var174, var168);
                    }
                    var36_226 = var36_226.rest();
                    var174 = var36_226.first();
                }
                var172 = var172.rest();
                var173 = var172.first();
            }
            var172 = module0226.f15018(var34, (SubLObject)UNPROVIDED);
            var173 = (SubLObject)NIL;
            var173 = var172.first();
            while (NIL != var172) {
                SubLObject var36_227;
                var169 = (var36_227 = f16650(var173, var164, (SubLObject)UNPROVIDED));
                SubLObject var174 = (SubLObject)NIL;
                var174 = var36_227.first();
                while (NIL != var36_227) {
                    if (NIL != module0004.f104(var173, module0226.f15018(var34, var174), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        var168 = (SubLObject)ConsesLow.cons(var174, var168);
                    }
                    var36_227 = var36_227.rest();
                    var174 = var36_227.first();
                }
                var172 = var172.rest();
                var173 = var172.first();
            }
            if (NIL != module0018.$g666$.getDynamicValue(var165) && NIL != module0210.f13598(var164) && module0205.f13276(var34).eql(module0205.f13276(var164))) {
                var172 = module0220.f14566(var167, $ic95$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                SubLObject var175 = (SubLObject)NIL;
                var175 = var172.first();
                while (NIL != var172) {
                    SubLObject var36_228;
                    var169 = (var36_228 = f16650(module0205.f13362(var34, var175, (SubLObject)UNPROVIDED), module0205.f13362(var164, var175, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED));
                    SubLObject var174 = (SubLObject)NIL;
                    var174 = var36_228.first();
                    while (NIL != var36_228) {
                        if (NIL != module0004.f104(var175, module0220.f14566(var167, $ic95$, var174, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                            var168 = (SubLObject)ConsesLow.cons(var174, var168);
                        }
                        var36_228 = var36_228.rest();
                        var174 = var36_228.first();
                    }
                    var172 = var172.rest();
                    var175 = var172.first();
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var171, var165);
            module0147.$g2094$.rebind(var170, var165);
        }
        return Sequences.remove_duplicates(var168, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f16652(final SubLObject var34, final SubLObject var164, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0253.f16440(module0137.f8955($ic0$), var34, var164, var3);
    }
    
    public static SubLObject f16653(final SubLObject var34, final SubLObject var178, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0253.f16449(module0137.f8955($ic0$), var178, var34, var3);
    }
    
    public static SubLObject f16654(final SubLObject var34, final SubLObject var178, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0253.f16443(module0137.f8955($ic0$), var178, var34, var3);
    }
    
    public static SubLObject f16655(final SubLObject var1) {
        return module0226.f15062(var1, $ic0$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f16656(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return module0248.f16006(module0137.f8955($ic0$), var1, var2);
    }
    
    public static SubLObject f16657(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return module0248.f16007(module0137.f8955($ic0$), var1, var2);
    }
    
    public static SubLObject f16658(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return module0248.f16008(module0137.f8955($ic0$), var1, var2);
    }
    
    public static SubLObject f16659(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return module0248.f16011(module0137.f8955($ic0$), var1, var2);
    }
    
    public static SubLObject f16660(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return module0248.f16012(module0137.f8955($ic0$), var1, var2);
    }
    
    public static SubLObject f16661(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return module0248.f16009(module0137.f8955($ic0$), var1, var2);
    }
    
    public static SubLObject f16662(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return module0248.f16010(module0137.f8955($ic0$), var1, var2);
    }
    
    public static SubLObject f16663(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return module0248.f16013(module0137.f8955($ic0$), var1, var2);
    }
    
    public static SubLObject f16664(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return module0248.f16014(module0137.f8955($ic0$), var1, var2);
    }
    
    public static SubLObject f16620(final SubLObject var229, final SubLObject var230, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        return (SubLObject)makeBoolean(NIL != module0220.f14582($ic185$, var229, var230, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) || NIL != module0220.f14582($ic185$, var230, var229, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f16665(final SubLObject var231, final SubLObject var196) {
        module0248.f15957(var231, var196, module0137.f8955($ic0$));
        module0268.f17665(var196);
        module0603.f36869(var196);
        final SubLObject var232 = module0178.f11334(var196);
        final SubLObject var233 = module0178.f11335(var196);
        if (NIL != module0178.f11343(var196, (SubLObject)$ic136$)) {
            module0305.f20504(var232, var233);
            module0305.f20547(var232, var233);
            module0305.f20595(var232, var233);
            module0549.f33949(var232, var233);
        }
        f16666(var232, var233);
        module0534.f33252(var196);
        module0345.f23236(var231, var196);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16666(final SubLObject var34, final SubLObject var164) {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16667(final SubLObject var34, final SubLObject var164) {
        final SubLObject var165 = module0078.f5370(f16551(var164, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
        final SubLObject var166 = module0219.f14509(var34, (SubLObject)ONE_INTEGER, $ic0$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var167 = (SubLObject)NIL;
        SubLObject var168 = var166;
        SubLObject var169 = (SubLObject)NIL;
        var169 = var168.first();
        while (NIL != var168) {
            if (NIL != module0077.f5320(module0178.f11335(var169), var165)) {
                var167 = (SubLObject)ConsesLow.cons(var169, var167);
            }
            var168 = var168.rest();
            var169 = var168.first();
        }
        return var167;
    }
    
    public static SubLObject f16668(final SubLObject var231, final SubLObject var196) {
        module0603.f36869(var196);
        module0248.f15962(var231, var196, module0137.f8955($ic0$));
        module0268.f17676(var196);
        final SubLObject var232 = module0178.f11334(var196);
        final SubLObject var233 = module0178.f11335(var196);
        if (NIL != module0178.f11343(var196, (SubLObject)$ic136$)) {
            module0305.f20509(var232, var233);
            module0305.f20552(var232, var233);
            module0305.f20599(var232, var233);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16669() {
        module0248.f16004(module0137.f8955($ic0$));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16670(final SubLObject var235) {
        final SubLThread var236 = SubLProcess.currentSubLThread();
        final SubLObject var237 = module0141.$g1670$.currentBinding(var236);
        final SubLObject var238 = module0141.$g1671$.currentBinding(var236);
        final SubLObject var239 = module0141.$g1672$.currentBinding(var236);
        final SubLObject var240 = module0141.$g1674$.currentBinding(var236);
        final SubLObject var241 = module0137.$g1605$.currentBinding(var236);
        try {
            module0141.$g1670$.bind(module0137.f8955($ic0$), var236);
            module0141.$g1671$.bind(module0244.f15739(module0137.f8955($ic0$)), var236);
            module0141.$g1672$.bind(module0244.f15746(module0137.f8955($ic0$)), var236);
            module0141.$g1674$.bind((SubLObject)NIL, var236);
            module0137.$g1605$.bind(module0137.f8955($ic0$), var236);
            SubLObject var242 = module0248.f15925(module0137.f8955($ic0$), var235);
            SubLObject var243 = (SubLObject)NIL;
            var243 = var242.first();
            while (NIL != var242) {
                if (NIL != module0269.f17705(var235)) {
                    module0248.f15999(var235, var243, (SubLObject)UNPROVIDED);
                }
                var242 = var242.rest();
                var243 = var242.first();
            }
        }
        finally {
            module0137.$g1605$.rebind(var241, var236);
            module0141.$g1674$.rebind(var240, var236);
            module0141.$g1672$.rebind(var239, var236);
            module0141.$g1671$.rebind(var238, var236);
            module0141.$g1670$.rebind(var237, var236);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16671(final SubLObject var1) {
        final SubLObject var2 = f16655(var1);
        f16670(var1);
        SubLObject var3 = var2;
        SubLObject var4 = (SubLObject)NIL;
        var4 = var3.first();
        while (NIL != var3) {
            if (NIL != module0269.f17705(var1)) {
                f16672(var1, var4);
            }
            var3 = var3.rest();
            var4 = var3.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16672(final SubLObject var1, final SubLObject var2) {
        module0248.f15951(var1, var2, module0137.f8955($ic0$));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16673(SubLObject var236) {
        if (var236 == UNPROVIDED) {
            var236 = (SubLObject)T;
        }
        if (NIL != var236) {
            f16669();
        }
        module0248.f15952(module0137.f8955($ic0$));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16674() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16524", "GENLS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16525", "MIN-GENLS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16526", "S#19282", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16528", "S#17594", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16530", "S#19283", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16532", "S#19284", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16527", "S#19285", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16533", "S#19286", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16534", "MAX-NOT-GENLS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16535", "S#19287", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16537", "S#19288", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16536", "S#19289", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16539", "SPECS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16540", "S#19290", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16541", "MAX-SPECS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16542", "S#19291", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16543", "MIN-NOT-SPECS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16544", "GENL-SIBLINGS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16545", "SPEC-SIBLINGS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16531", "ALL-GENLS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16546", "ALL-GENLS-IN-ANY-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16547", "S#19292", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16548", "S#19293", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16549", "S#19294", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16551", "S#19295", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16552", "ALL-SPECS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16553", "S#19296", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16554", "S#19297", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16555", "S#19298", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16556", "ALL-SPECS-WITH-MAX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16557", "S#19299", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16558", "COUNT-ALL-SPECS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16559", "S#19300", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16560", "S#19301", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16561", "S#19302", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16562", "S#19303", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16563", "S#19304", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16564", "S#19305", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16565", "ALL-GENLS-WRT", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16550", "UNION-ALL-GENLS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16566", "S#19306", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16567", "S#19307", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16568", "S#19308", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16569", "UNION-ALL-SPECS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16570", "S#16709", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16571", "S#19309", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16573", "ALL-DEPENDENT-SPECS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16574", "S#19310", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16575", "ALL-GENLS-AMONG", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16572", "ALL-SPECS-AMONG", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16578", "S#19311", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16579", "ALL-GENLS-IF", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16580", "ALL-SPECS-IF", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16581", "S#19312", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16582", "ALL-NOT-GENLS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16583", "ALL-NOT-SPECS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16584", "S#19313", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16585", "MAP-ALL-GENLS", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16586", "MAP-ALL-SPECS", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16587", "S#19314", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16588", "S#19315", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16589", "S#17595", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16590", "S#19316", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16591", "ANY-ALL-GENLS", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16592", "ANY-ALL-SPECS", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16593", "SAMPLE-LEAF-SPECS", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16594", "SAMPLE-DIFFERENT-LEAF-SPECS", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16576", "GENL?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16596", "GENLS?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16597", "S#19317", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16598", "GENL-IN-ANY-MT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16577", "SPEC?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16599", "S#19318", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16600", "S#19319", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16601", "S#19320", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16602", "S#19321", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16603", "S#19322", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16595", "S#19323", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16605", "S#19324", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16606", "ANY-GENL?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16604", "ANY-SPEC?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16607", "ALL-GENL?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16608", "ALL-SPEC?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16609", "ANY-GENL-ANY?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16610", "ANY-GENL-ALL?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16611", "ALL-SPEC-ANY?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16612", "NOT-GENLS?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16613", "NOT-GENL?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16614", "S#19325", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16615", "ALL-NOT-SPEC?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16616", "ANY-NOT-GENL?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16617", "S#19326", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16618", "S#19327", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16619", "COLLECTIONS-COEXTENSIONAL?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16621", "TACIT-COEXTENSIONAL?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16622", "S#19328", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16623", "S#19329", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16624", "COLLECTIONS-INTERSECT?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16625", "HIERARCHICAL-COLLECTIONS?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16626", "S#19330", 3, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16627", "S#19331", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16628", "WHY-GENL?", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16629", "S#19332", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16630", "WHY-NOT-GENL?", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16631", "WHY-NOT-ASSERT-GENLS?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16632", "WHY-COLLECTIONS-INTERSECT?", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16633", "S#19333", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16634", "COLLECTION-LEAVES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16529", "MIN-COLS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16635", "MIN-COL", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16538", "MAX-COLS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16636", "S#19334", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16637", "MIN-CEILING-COLS", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16638", "S#19335", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16639", "MAX-FLOOR-COLS", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16640", "S#19336", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16641", "S#19337", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16642", "S#19338", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16643", "ANY-GENL-ISA", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16644", "LIGHTER-COL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16645", "S#19339", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16646", "LIGHTEST-OF-COLS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16647", "SHALLOWER-COL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16648", "S#19340", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16649", "S#19341", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16650", "MAX-FLOOR-MTS-OF-GENLS-PATHS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16651", "S#19342", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16652", "MIN-MTS-OF-GENLS-PATHS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16653", "S#19343", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16654", "S#19344", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16655", "S#19345", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16656", "S#19346", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16657", "S#19347", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16658", "S#19348", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16659", "S#19349", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16660", "S#19350", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16661", "S#19351", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16662", "S#19352", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16663", "S#19353", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16664", "S#19354", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16620", "S#19355", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16665", "GENLS-AFTER-ADDING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16666", "S#19356", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16667", "S#19357", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16668", "GENLS-AFTER-REMOVING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16669", "S#19358", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16670", "S#19359", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16671", "S#19360", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16672", "S#19361", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0256", "f16673", "S#19362", 0, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16675() {
        $g2484$ = SubLFiles.defvar("S#19363", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f16676() {
        module0012.f368((SubLObject)$ic1$, (SubLObject)$ic2$, (SubLObject)$ic3$, (SubLObject)NIL, (SubLObject)$ic4$);
        module0012.f368((SubLObject)$ic6$, (SubLObject)$ic2$, (SubLObject)$ic7$, (SubLObject)$ic8$, (SubLObject)$ic4$);
        module0012.f368((SubLObject)$ic10$, (SubLObject)$ic2$, (SubLObject)$ic11$, (SubLObject)$ic8$, (SubLObject)$ic4$);
        module0012.f368((SubLObject)$ic12$, (SubLObject)$ic2$, (SubLObject)$ic13$, (SubLObject)$ic8$, (SubLObject)$ic4$);
        module0012.f368((SubLObject)$ic14$, (SubLObject)$ic2$, (SubLObject)$ic15$, (SubLObject)$ic8$, (SubLObject)$ic4$);
        module0012.f368((SubLObject)$ic16$, (SubLObject)$ic2$, (SubLObject)$ic17$, (SubLObject)$ic8$, (SubLObject)$ic4$);
        module0012.f368((SubLObject)$ic18$, (SubLObject)$ic2$, (SubLObject)$ic19$, (SubLObject)$ic8$, (SubLObject)$ic4$);
        module0012.f368((SubLObject)$ic24$, (SubLObject)$ic2$, (SubLObject)$ic25$, (SubLObject)$ic8$, (SubLObject)$ic4$);
        module0002.f38((SubLObject)$ic41$);
        module0012.f368((SubLObject)$ic45$, (SubLObject)$ic46$, (SubLObject)$ic47$, (SubLObject)$ic48$, (SubLObject)$ic49$);
        module0012.f368((SubLObject)$ic50$, (SubLObject)$ic51$, (SubLObject)$ic52$, (SubLObject)$ic53$, (SubLObject)$ic4$);
        module0012.f368((SubLObject)$ic55$, (SubLObject)$ic56$, (SubLObject)$ic57$, (SubLObject)$ic58$, (SubLObject)$ic4$);
        module0012.f368((SubLObject)$ic59$, (SubLObject)$ic56$, (SubLObject)$ic60$, (SubLObject)$ic58$, (SubLObject)$ic4$);
        module0012.f368((SubLObject)$ic61$, (SubLObject)$ic2$, (SubLObject)$ic62$, (SubLObject)$ic8$, (SubLObject)$ic4$);
        module0012.f368((SubLObject)$ic63$, (SubLObject)$ic64$, (SubLObject)$ic65$, (SubLObject)$ic66$, (SubLObject)$ic4$);
        module0012.f368((SubLObject)$ic67$, (SubLObject)$ic64$, (SubLObject)$ic68$, (SubLObject)$ic66$, (SubLObject)$ic4$);
        module0012.f368((SubLObject)$ic70$, (SubLObject)$ic71$, (SubLObject)$ic72$, (SubLObject)$ic73$, (SubLObject)$ic4$);
        module0012.f368((SubLObject)$ic74$, (SubLObject)$ic71$, (SubLObject)$ic72$, (SubLObject)$ic73$, (SubLObject)$ic4$);
        module0012.f368((SubLObject)$ic75$, (SubLObject)$ic2$, (SubLObject)$ic76$, (SubLObject)$ic8$, (SubLObject)$ic4$);
        module0012.f368((SubLObject)$ic77$, (SubLObject)$ic2$, (SubLObject)$ic78$, (SubLObject)$ic8$, (SubLObject)$ic4$);
        module0012.f368((SubLObject)$ic79$, (SubLObject)$ic80$, (SubLObject)$ic81$, (SubLObject)$ic82$, (SubLObject)NIL);
        module0012.f368((SubLObject)$ic83$, (SubLObject)$ic80$, (SubLObject)$ic84$, (SubLObject)$ic82$, (SubLObject)NIL);
        module0012.f368((SubLObject)$ic85$, (SubLObject)$ic80$, (SubLObject)$ic86$, (SubLObject)$ic82$, (SubLObject)NIL);
        module0012.f368((SubLObject)$ic87$, (SubLObject)$ic80$, (SubLObject)$ic88$, (SubLObject)$ic82$, (SubLObject)NIL);
        module0012.f368((SubLObject)$ic89$, (SubLObject)$ic51$, (SubLObject)$ic90$, (SubLObject)$ic53$, (SubLObject)$ic91$);
        module0012.f368((SubLObject)$ic92$, (SubLObject)$ic93$, (SubLObject)$ic90$, (SubLObject)$ic94$, (SubLObject)$ic91$);
        module0012.f368((SubLObject)$ic96$, (SubLObject)$ic97$, (SubLObject)$ic98$, (SubLObject)$ic99$, (SubLObject)$ic91$);
        module0012.f368((SubLObject)$ic100$, (SubLObject)$ic101$, (SubLObject)$ic102$, (SubLObject)$ic103$, (SubLObject)$ic91$);
        module0012.f368((SubLObject)$ic104$, (SubLObject)$ic97$, (SubLObject)$ic105$, (SubLObject)$ic99$, (SubLObject)$ic91$);
        module0012.f368((SubLObject)$ic106$, (SubLObject)$ic101$, (SubLObject)$ic107$, (SubLObject)$ic103$, (SubLObject)$ic91$);
        module0012.f368((SubLObject)$ic108$, (SubLObject)$ic109$, (SubLObject)$ic110$, (SubLObject)$ic111$, (SubLObject)$ic91$);
        module0012.f368((SubLObject)$ic112$, (SubLObject)$ic109$, (SubLObject)$ic113$, (SubLObject)$ic111$, (SubLObject)$ic91$);
        module0012.f368((SubLObject)$ic114$, (SubLObject)$ic109$, (SubLObject)$ic115$, (SubLObject)$ic111$, (SubLObject)$ic91$);
        module0012.f368((SubLObject)$ic116$, (SubLObject)$ic117$, (SubLObject)$ic118$, (SubLObject)$ic119$, (SubLObject)$ic91$);
        module0012.f368((SubLObject)$ic120$, (SubLObject)$ic121$, (SubLObject)$ic122$, (SubLObject)$ic123$, (SubLObject)$ic91$);
        module0012.f368((SubLObject)$ic124$, (SubLObject)$ic125$, (SubLObject)$ic126$, (SubLObject)$ic127$, (SubLObject)$ic91$);
        module0012.f368((SubLObject)$ic130$, (SubLObject)$ic131$, (SubLObject)$ic132$, (SubLObject)$ic133$, (SubLObject)$ic91$);
        module0012.f368((SubLObject)$ic134$, (SubLObject)$ic131$, (SubLObject)$ic135$, (SubLObject)$ic133$, (SubLObject)$ic91$);
        module0012.f368((SubLObject)$ic138$, (SubLObject)$ic139$, (SubLObject)$ic140$, (SubLObject)$ic53$, (SubLObject)$ic141$);
        module0012.f368((SubLObject)$ic148$, (SubLObject)$ic139$, (SubLObject)$ic149$, (SubLObject)$ic53$, (SubLObject)$ic141$);
        module0012.f368((SubLObject)$ic150$, (SubLObject)$ic151$, (SubLObject)$ic152$, (SubLObject)$ic53$, (SubLObject)$ic141$);
        module0012.f368((SubLObject)$ic153$, (SubLObject)$ic2$, (SubLObject)$ic154$, (SubLObject)$ic8$, (SubLObject)$ic4$);
        module0012.f368((SubLObject)$ic156$, (SubLObject)$ic56$, (SubLObject)$ic157$, (SubLObject)$ic158$, (SubLObject)$ic4$);
        module0012.f368((SubLObject)$ic159$, (SubLObject)$ic56$, (SubLObject)$ic160$, (SubLObject)$ic58$, (SubLObject)$ic161$);
        module0012.f368((SubLObject)$ic162$, (SubLObject)$ic56$, (SubLObject)$ic163$, (SubLObject)$ic58$, (SubLObject)$ic4$);
        module0012.f368((SubLObject)$ic164$, (SubLObject)$ic165$, (SubLObject)$ic166$, (SubLObject)$ic58$, (SubLObject)$ic4$);
        module0012.f368((SubLObject)$ic167$, (SubLObject)$ic165$, (SubLObject)$ic168$, (SubLObject)$ic58$, (SubLObject)$ic4$);
        module0012.f368((SubLObject)$ic169$, (SubLObject)$ic170$, (SubLObject)$ic171$, (SubLObject)$ic172$, (SubLObject)$ic161$);
        module0012.f368((SubLObject)$ic173$, (SubLObject)$ic174$, (SubLObject)$ic175$, (SubLObject)$ic176$, (SubLObject)$ic161$);
        module0012.f368((SubLObject)$ic177$, (SubLObject)$ic178$, (SubLObject)$ic179$, (SubLObject)$ic58$, (SubLObject)$ic161$);
        module0012.f368((SubLObject)$ic180$, (SubLObject)$ic174$, (SubLObject)$ic181$, (SubLObject)$ic176$, (SubLObject)$ic161$);
        module0012.f368((SubLObject)$ic182$, (SubLObject)$ic183$, (SubLObject)$ic184$, (SubLObject)$ic53$, (SubLObject)NIL);
        module0012.f416((SubLObject)$ic186$);
        module0012.f416((SubLObject)$ic187$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f16674();
    }
    
    public void initializeVariables() {
        f16675();
    }
    
    public void runTopLevelForms() {
        f16676();
    }
    
    static {
        me = (SubLFile)new module0256();
        $g2484$ = null;
        $ic0$ = constant_handles_oc.f8479((SubLObject)makeString("genls"));
        $ic1$ = makeSymbol("MIN-GENLS");
        $ic2$ = ConsesLow.list((SubLObject)makeSymbol("S#12455", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#10995", "CYC"));
        $ic3$ = makeString("Returns the most-specific genls of collection COL");
        $ic4$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("LIST"), (SubLObject)makeSymbol("FORT-P")));
        $ic5$ = makeSymbol("EL-FORT-P");
        $ic6$ = makeSymbol("MAX-NOT-GENLS");
        $ic7$ = makeString("Returns the least-specific negated genls of collection COL");
        $ic8$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12455", "CYC"), (SubLObject)makeSymbol("EL-FORT-P")));
        $ic9$ = makeKeyword("FALSE");
        $ic10$ = makeSymbol("MAX-SPECS");
        $ic11$ = makeString("Returns the least-specific specs of collection COL");
        $ic12$ = makeSymbol("MIN-NOT-SPECS");
        $ic13$ = makeString("Returns the most-specific negated specs of collection COL");
        $ic14$ = makeSymbol("GENL-SIBLINGS");
        $ic15$ = makeString("Returns the direct genls of those direct spec collections of COL");
        $ic16$ = makeSymbol("SPEC-SIBLINGS");
        $ic17$ = makeString("Returns the direct specs of those direct genls collections of COL");
        $ic18$ = makeSymbol("ALL-GENLS");
        $ic19$ = makeString("Returns all genls of collection COL\n   (ascending transitive closure; inexpensive)");
        $ic20$ = makeSymbol("S#12274", "CYC");
        $ic21$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic22$ = makeSymbol("S#12276", "CYC");
        $ic23$ = makeSymbol("S#12280", "CYC");
        $ic24$ = makeSymbol("ALL-SPECS");
        $ic25$ = makeString("Returns all specs of collection COL \n   (descending transitive closure; expensive)");
        $ic26$ = makeKeyword("DESCENDING");
        $ic27$ = makeKeyword("BREADTH");
        $ic28$ = makeKeyword("QUEUE");
        $ic29$ = makeKeyword("STACK");
        $ic30$ = makeSymbol("S#11450", "CYC");
        $ic31$ = makeKeyword("ERROR");
        $ic32$ = makeString("~A is not a ~A");
        $ic33$ = makeSymbol("S#11592", "CYC");
        $ic34$ = makeKeyword("CERROR");
        $ic35$ = makeString("continue anyway");
        $ic36$ = makeKeyword("WARN");
        $ic37$ = makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic38$ = makeString("~A is neither SET-P nor LISTP.");
        $ic39$ = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $ic40$ = makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $ic41$ = makeSymbol("ALL-SPECS-WITH-MAX");
        $ic42$ = makeSymbol("INTEGERP");
        $ic43$ = makeKeyword("INVALID-ITERATION-TERM");
        $ic44$ = makeSymbol("S#5859", "CYC");
        $ic45$ = makeSymbol("COUNT-ALL-SPECS");
        $ic46$ = ConsesLow.list((SubLObject)makeSymbol("S#12458", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#10995", "CYC"));
        $ic47$ = makeString("Counts the number of specs in COLLECTION and then returns the count.");
        $ic48$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12458", "CYC"), (SubLObject)makeSymbol("EL-FORT-P")));
        $ic49$ = ConsesLow.list((SubLObject)makeSymbol("INTEGERP"));
        $ic50$ = makeSymbol("ALL-GENLS-WRT");
        $ic51$ = ConsesLow.list((SubLObject)makeSymbol("S#12109", "CYC"), (SubLObject)makeSymbol("S#12112", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#10995", "CYC"));
        $ic52$ = makeString("Returns all genls of collection SPEC that are also specs of collection GENL (ascending transitive closure; inexpensive)");
        $ic53$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12109", "CYC"), (SubLObject)makeSymbol("EL-FORT-P")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12112", "CYC"), (SubLObject)makeSymbol("EL-FORT-P")));
        $ic54$ = makeSymbol("LISTP");
        $ic55$ = makeSymbol("UNION-ALL-GENLS");
        $ic56$ = ConsesLow.list((SubLObject)makeSymbol("S#1573", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#10995", "CYC"));
        $ic57$ = makeString("Returns all genls of each collection in COLs");
        $ic58$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#1573", "CYC"), (SubLObject)makeSymbol("LISTP")));
        $ic59$ = makeSymbol("UNION-ALL-SPECS");
        $ic60$ = makeString("Returns all specs of each collection in COLs");
        $ic61$ = makeSymbol("ALL-DEPENDENT-SPECS");
        $ic62$ = makeString("Returns all specs s of COL s.t. every path connecting\n   s to any genl of COL must pass through COL");
        $ic63$ = makeSymbol("ALL-GENLS-AMONG");
        $ic64$ = ConsesLow.list((SubLObject)makeSymbol("S#12455", "CYC"), (SubLObject)makeSymbol("S#12121", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#10995", "CYC"));
        $ic65$ = makeString("Returns those genls of COL that are included among CANDIDATES");
        $ic66$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12455", "CYC"), (SubLObject)makeSymbol("EL-FORT-P")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12121", "CYC"), (SubLObject)makeSymbol("LISTP")));
        $ic67$ = makeSymbol("ALL-SPECS-AMONG");
        $ic68$ = makeString("Returns those specs of COL that are included among CANDIDATEs");
        $ic69$ = makeSymbol("FUNCTION-SPEC-P");
        $ic70$ = makeSymbol("ALL-GENLS-IF");
        $ic71$ = ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)makeSymbol("S#12455", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#10995", "CYC"));
        $ic72$ = makeString("Returns all genls of collection COL that satisfy FUNCTION\n   (FUNCTION must not effect sbhl search state)");
        $ic73$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)makeSymbol("FUNCTION-SPEC-P")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12455", "CYC"), (SubLObject)makeSymbol("EL-FORT-P")));
        $ic74$ = makeSymbol("ALL-SPECS-IF");
        $ic75$ = makeSymbol("ALL-NOT-GENLS");
        $ic76$ = makeString("Returns all negated genls of collection COL \n   (descending transitive closure; expensive)");
        $ic77$ = makeSymbol("ALL-NOT-SPECS");
        $ic78$ = makeString("Returns all negated specs of collection COL \n   (ascending transitive closure; inexpensive)");
        $ic79$ = makeSymbol("MAP-ALL-GENLS");
        $ic80$ = ConsesLow.list((SubLObject)makeSymbol("S#11675", "CYC"), (SubLObject)makeSymbol("S#12455", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#10995", "CYC"));
        $ic81$ = makeString("Applies FN to every (all) genls of COL\n   (FN must not effect the current sbhl space)");
        $ic82$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11675", "CYC"), (SubLObject)makeSymbol("FUNCTION-SPEC-P")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12455", "CYC"), (SubLObject)makeSymbol("EL-FORT-P")));
        $ic83$ = makeSymbol("MAP-ALL-SPECS");
        $ic84$ = makeString("Applies FN to every (all) specs of COL\n   (FN must not effect the current sbhl space)");
        $ic85$ = makeSymbol("ANY-ALL-GENLS");
        $ic86$ = makeString("Return a non-nil result of applying FN to some all-genl of COL\n   (FN must not effect the current sbhl space)");
        $ic87$ = makeSymbol("ANY-ALL-SPECS");
        $ic88$ = makeString("Return a non-nil result of applying FN to some all-spec of COL\n   (FN must not effect the current sbhl space)");
        $ic89$ = makeSymbol("GENL?");
        $ic90$ = makeString("Returns whether (#$genls SPEC GENL) can be inferred.\n   (ascending transitive search; inexpensive)");
        $ic91$ = ConsesLow.list((SubLObject)makeSymbol("BOOLEANP"));
        $ic92$ = makeSymbol("SPEC?");
        $ic93$ = ConsesLow.list((SubLObject)makeSymbol("S#12112", "CYC"), (SubLObject)makeSymbol("S#12109", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#10995", "CYC"));
        $ic94$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12112", "CYC"), (SubLObject)makeSymbol("EL-FORT-P")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12109", "CYC"), (SubLObject)makeSymbol("EL-FORT-P")));
        $ic95$ = constant_handles_oc.f8479((SubLObject)makeString("preservesGenlsInArg"));
        $ic96$ = makeSymbol("ANY-GENL?");
        $ic97$ = ConsesLow.list((SubLObject)makeSymbol("S#12109", "CYC"), (SubLObject)makeSymbol("GENLS"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#10995", "CYC"));
        $ic98$ = makeString("(any-genl? spec genls) is t iff (genl? spec genl) for some genl in genls\n   (ascending transitive search; inexpensive)");
        $ic99$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12109", "CYC"), (SubLObject)makeSymbol("EL-FORT-P")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("GENLS"), (SubLObject)makeSymbol("LISTP")));
        $ic100$ = makeSymbol("ANY-SPEC?");
        $ic101$ = ConsesLow.list((SubLObject)makeSymbol("S#12112", "CYC"), (SubLObject)makeSymbol("SPECS"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#10995", "CYC"));
        $ic102$ = makeString("Returns T iff (spec? genl spec) for some spec in SPECS");
        $ic103$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12112", "CYC"), (SubLObject)makeSymbol("EL-FORT-P")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("SPECS"), (SubLObject)makeSymbol("LISTP")));
        $ic104$ = makeSymbol("ALL-GENL?");
        $ic105$ = makeString("Returns T iff (genl? spec genl) for every genl in GENLS\n   (ascending transitive search; inexpensive)");
        $ic106$ = makeSymbol("ALL-SPEC?");
        $ic107$ = makeString("Returns T iff (spec? genl spec) for every spec in SPECS");
        $ic108$ = makeSymbol("ANY-GENL-ANY?");
        $ic109$ = ConsesLow.list((SubLObject)makeSymbol("SPECS"), (SubLObject)makeSymbol("GENLS"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#10995", "CYC"));
        $ic110$ = makeString("Return T iff (genl? spec genl mt) for any spec in SPECS, genl in GENLS");
        $ic111$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("SPECS"), (SubLObject)makeSymbol("LISTP")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("GENLS"), (SubLObject)makeSymbol("LISTP")));
        $ic112$ = makeSymbol("ANY-GENL-ALL?");
        $ic113$ = makeString("Return T iff (genl? spec genl mt) for any spec in SPECS and all genl in GENLS");
        $ic114$ = makeSymbol("ALL-SPEC-ANY?");
        $ic115$ = makeString("Return T iff for each spec in SPECS there is some genl in GENLS s.t. (genl? spec genl mt)");
        $ic116$ = makeSymbol("NOT-GENL?");
        $ic117$ = ConsesLow.list((SubLObject)makeSymbol("S#12455", "CYC"), (SubLObject)makeSymbol("S#19364", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#10995", "CYC"));
        $ic118$ = makeString("Return whether collection NOT-GENL is not a genl of COL.");
        $ic119$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12455", "CYC"), (SubLObject)makeSymbol("EL-FORT-P")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#19364", "CYC"), (SubLObject)makeSymbol("EL-FORT-P")));
        $ic120$ = makeSymbol("ALL-NOT-SPEC?");
        $ic121$ = ConsesLow.list((SubLObject)makeSymbol("S#12455", "CYC"), (SubLObject)makeSymbol("S#19291", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#10995", "CYC"));
        $ic122$ = makeString("Return whether every collection in NOT-SPECS is not a spec of COL.");
        $ic123$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12455", "CYC"), (SubLObject)makeSymbol("EL-FORT-P")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#19291", "CYC"), (SubLObject)makeSymbol("LISTP")));
        $ic124$ = makeSymbol("ANY-NOT-GENL?");
        $ic125$ = ConsesLow.list((SubLObject)makeSymbol("S#12455", "CYC"), (SubLObject)makeSymbol("S#19286", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#10995", "CYC"));
        $ic126$ = makeString("Returns whether any collection in NOT-GENLS is not a genl of COL.");
        $ic127$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12455", "CYC"), (SubLObject)makeSymbol("EL-FORT-P")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#19286", "CYC"), (SubLObject)makeSymbol("LISTP")));
        $ic128$ = makeSymbol("FORT-P");
        $ic129$ = makeSymbol("S#12263", "CYC");
        $ic130$ = makeSymbol("COLLECTIONS-COEXTENSIONAL?");
        $ic131$ = ConsesLow.list((SubLObject)makeSymbol("S#19365", "CYC"), (SubLObject)makeSymbol("S#19366", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"));
        $ic132$ = makeString("Are COL-1 and COL-2 coextensional?");
        $ic133$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#19365", "CYC"), (SubLObject)makeSymbol("EL-FORT-P")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#19366", "CYC"), (SubLObject)makeSymbol("EL-FORT-P")));
        $ic134$ = makeSymbol("COLLECTIONS-INTERSECT?");
        $ic135$ = makeString("Do collections COL-1 and COL-2 intersect?\n   (uses only sbhl graphs: their extensions are not searched\n    nor are their sufficient conditions analyzed)");
        $ic136$ = makeKeyword("TRUE");
        $ic137$ = makeKeyword("GAF");
        $ic138$ = makeSymbol("WHY-GENL?");
        $ic139$ = ConsesLow.list((SubLObject)makeSymbol("S#12109", "CYC"), (SubLObject)makeSymbol("S#12112", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#10995", "CYC"), (SubLObject)makeSymbol("S#11669", "CYC"));
        $ic140$ = makeString("Justification of (genls SPEC GENL)");
        $ic141$ = ConsesLow.list((SubLObject)makeSymbol("LISTP"));
        $ic142$ = constant_handles_oc.f8479((SubLObject)makeString("termOfUnit"));
        $ic143$ = ConsesLow.list((SubLObject)makeKeyword("TRUE"));
        $ic144$ = constant_handles_oc.f8479((SubLObject)makeString("resultGenl"));
        $ic145$ = constant_handles_oc.f8479((SubLObject)makeString("resultGenlArg"));
        $ic146$ = constant_handles_oc.f8479((SubLObject)makeString("interArgResultGenl"));
        $ic147$ = constant_handles_oc.f8479((SubLObject)makeString("interArgResultGenlReln"));
        $ic148$ = makeSymbol("WHY-NOT-GENL?");
        $ic149$ = makeString("Justification of (not (genls SPEC GENL))");
        $ic150$ = makeSymbol("WHY-NOT-ASSERT-GENLS?");
        $ic151$ = ConsesLow.list((SubLObject)makeSymbol("S#12109", "CYC"), (SubLObject)makeSymbol("S#12112", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"));
        $ic152$ = makeString("Justification of why asserting (genls SPEC GENL) is not consistent");
        $ic153$ = makeSymbol("COLLECTION-LEAVES");
        $ic154$ = makeString("Returns the minimally-general (the most specific) among all-specs of COL");
        $ic155$ = makeSymbol("S#19266", "CYC");
        $ic156$ = makeSymbol("MIN-COLS");
        $ic157$ = makeString("Returns the minimally-general (the most specific) among reified collections COLS,\n   collections that have no proper specs among COLS");
        $ic158$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#1573", "CYC"), (SubLObject)makeSymbol("S#19266", "CYC")));
        $ic159$ = makeSymbol("MIN-COL");
        $ic160$ = makeString("Returns the single minimally-general (the most specific) among reified collections COLS.\nTies are broken by comparing the number of all-genls which is a rough depth estimate.");
        $ic161$ = ConsesLow.list((SubLObject)makeSymbol("FORT-P"));
        $ic162$ = makeSymbol("MAX-COLS");
        $ic163$ = makeString("Returns the most-general among reified collections COLS, collections\n   that have no proper genls among COLS");
        $ic164$ = makeSymbol("MIN-CEILING-COLS");
        $ic165$ = ConsesLow.list((SubLObject)makeSymbol("S#1573", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#12121", "CYC"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#10995", "CYC"));
        $ic166$ = makeString("Returns the most specific common generalizations among reified collections COLS\n   (if CANDIDATES is non-nil, then result is a subset of CANDIDATES)");
        $ic167$ = makeSymbol("MAX-FLOOR-COLS");
        $ic168$ = makeString("Returns the most general common specializations among reified collections COLS\n   (if CANDIDATES is non-nil, then result is a subset of CANDIDATES)");
        $ic169$ = makeSymbol("ANY-GENL-ISA");
        $ic170$ = ConsesLow.list((SubLObject)makeSymbol("S#12455", "CYC"), (SubLObject)makeSymbol("ISA"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#10995", "CYC"));
        $ic171$ = makeString("Return some genl of COL that isa instance of ISA (if any such genl exists)");
        $ic172$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12455", "CYC"), (SubLObject)makeSymbol("EL-FORT-P")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("ISA"), (SubLObject)makeSymbol("EL-FORT-P")));
        $ic173$ = makeSymbol("LIGHTER-COL");
        $ic174$ = ConsesLow.list((SubLObject)makeSymbol("S#19367", "CYC"), (SubLObject)makeSymbol("S#19368", "CYC"));
        $ic175$ = makeString("Return COL-B iff it has fewer specs than COL-A, else return COL-A");
        $ic176$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#19367", "CYC"), (SubLObject)makeSymbol("EL-FORT-P")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#19368", "CYC"), (SubLObject)makeSymbol("EL-FORT-P")));
        $ic177$ = makeSymbol("LIGHTEST-OF-COLS");
        $ic178$ = ConsesLow.list((SubLObject)makeSymbol("S#1573", "CYC"));
        $ic179$ = makeString("Return the collection having the fewest specs given a list of collections.");
        $ic180$ = makeSymbol("SHALLOWER-COL");
        $ic181$ = makeString("Return COL-B iff it has fewer genls than COL-A, else return COL-A");
        $ic182$ = makeSymbol("MAX-FLOOR-MTS-OF-GENLS-PATHS");
        $ic183$ = ConsesLow.list((SubLObject)makeSymbol("S#12109", "CYC"), (SubLObject)makeSymbol("S#12112", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#10995", "CYC"));
        $ic184$ = makeString("@return listp; Returns in what (most-genl) mts GENL is a genls of SPEC");
        $ic185$ = constant_handles_oc.f8479((SubLObject)makeString("coExtensional"));
        $ic186$ = makeSymbol("GENLS-AFTER-ADDING");
        $ic187$ = makeSymbol("GENLS-AFTER-REMOVING");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 2372 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/