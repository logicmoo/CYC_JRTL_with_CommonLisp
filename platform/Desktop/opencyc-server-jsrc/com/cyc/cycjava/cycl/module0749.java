package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0749 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0749";
    public static final String myFingerPrint = "1029e1b404adefb0defac87b23d46391e96d580ef614f185c6f75010d804384f";
    private static SubLSymbol $g5967$;
    private static SubLSymbol $g5968$;
    private static SubLSymbol $g5969$;
    public static SubLSymbol $g5970$;
    private static SubLSymbol $g5971$;
    public static SubLSymbol $g5972$;
    private static SubLSymbol $g5973$;
    public static SubLSymbol $g5974$;
    private static SubLSymbol $g5975$;
    public static SubLSymbol $g5977$;
    private static SubLSymbol $g5978$;
    private static SubLSymbol $g5979$;
    public static SubLSymbol $g5976$;
    private static SubLSymbol $g5980$;
    public static SubLSymbol $g5981$;
    public static SubLSymbol $g5982$;
    private static SubLSymbol $g5983$;
    public static SubLSymbol $g5984$;
    private static final SubLString $ic0$;
    private static final SubLInteger $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLList $ic9$;
    private static final SubLList $ic10$;
    private static final SubLList $ic11$;
    private static final SubLList $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLList $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
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
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLString $ic34$;
    private static final SubLString $ic35$;
    private static final SubLString $ic36$;
    private static final SubLString $ic37$;
    private static final SubLString $ic38$;
    private static final SubLInteger $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLList $ic44$;
    private static final SubLList $ic45$;
    private static final SubLList $ic46$;
    private static final SubLList $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLList $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLString $ic59$;
    private static final SubLString $ic60$;
    private static final SubLString $ic61$;
    private static final SubLString $ic62$;
    private static final SubLString $ic63$;
    private static final SubLString $ic64$;
    private static final SubLInteger $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLString $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLList $ic71$;
    private static final SubLList $ic72$;
    private static final SubLList $ic73$;
    private static final SubLList $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLList $ic77$;
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
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLList $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLString $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLList $ic107$;
    private static final SubLList $ic108$;
    private static final SubLList $ic109$;
    private static final SubLList $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLList $ic113$;
    private static final SubLSymbol $ic114$;
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
    private static final SubLSymbol $ic127$;
    private static final SubLSymbol $ic128$;
    private static final SubLSymbol $ic129$;
    private static final SubLSymbol $ic130$;
    private static final SubLSymbol $ic131$;
    private static final SubLSymbol $ic132$;
    private static final SubLString $ic133$;
    private static final SubLString $ic134$;
    private static final SubLSymbol $ic135$;
    private static final SubLSymbol $ic136$;
    private static final SubLSymbol $ic137$;
    private static final SubLSymbol $ic138$;
    private static final SubLString $ic139$;
    private static final SubLSymbol $ic140$;
    private static final SubLSymbol $ic141$;
    private static final SubLSymbol $ic142$;
    private static final SubLString $ic143$;
    private static final SubLSymbol $ic144$;
    private static final SubLInteger $ic145$;
    private static final SubLSymbol $ic146$;
    private static final SubLSymbol $ic147$;
    private static final SubLString $ic148$;
    private static final SubLInteger $ic149$;
    private static final SubLInteger $ic150$;
    private static final SubLInteger $ic151$;
    private static final SubLString $ic152$;
    private static final SubLString $ic153$;
    private static final SubLList $ic154$;
    private static final SubLSymbol $ic155$;
    private static final SubLSymbol $ic156$;
    private static final SubLString $ic157$;
    private static final SubLSymbol $ic158$;
    private static final SubLString $ic159$;
    private static final SubLSymbol $ic160$;
    private static final SubLSymbol $ic161$;
    private static final SubLString $ic162$;
    private static final SubLString $ic163$;
    private static final SubLSymbol $ic164$;
    private static final SubLSymbol $ic165$;
    private static final SubLSymbol $ic166$;
    private static final SubLSymbol $ic167$;
    private static final SubLList $ic168$;
    private static final SubLList $ic169$;
    private static final SubLList $ic170$;
    private static final SubLList $ic171$;
    private static final SubLSymbol $ic172$;
    private static final SubLSymbol $ic173$;
    private static final SubLList $ic174$;
    private static final SubLSymbol $ic175$;
    private static final SubLSymbol $ic176$;
    private static final SubLSymbol $ic177$;
    private static final SubLSymbol $ic178$;
    private static final SubLSymbol $ic179$;
    private static final SubLSymbol $ic180$;
    private static final SubLSymbol $ic181$;
    private static final SubLSymbol $ic182$;
    private static final SubLSymbol $ic183$;
    private static final SubLSymbol $ic184$;
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
    private static final SubLSymbol $ic206$;
    private static final SubLSymbol $ic207$;
    private static final SubLSymbol $ic208$;
    private static final SubLSymbol $ic209$;
    private static final SubLSymbol $ic210$;
    private static final SubLSymbol $ic211$;
    private static final SubLString $ic212$;
    private static final SubLSymbol $ic213$;
    private static final SubLSymbol $ic214$;
    private static final SubLSymbol $ic215$;
    private static final SubLSymbol $ic216$;
    private static final SubLSymbol $ic217$;
    private static final SubLString $ic218$;
    private static final SubLString $ic219$;
    private static final SubLSymbol $ic220$;
    private static final SubLSymbol $ic221$;
    private static final SubLList $ic222$;
    private static final SubLList $ic223$;
    private static final SubLList $ic224$;
    private static final SubLList $ic225$;
    private static final SubLSymbol $ic226$;
    private static final SubLSymbol $ic227$;
    private static final SubLList $ic228$;
    private static final SubLSymbol $ic229$;
    private static final SubLSymbol $ic230$;
    private static final SubLSymbol $ic231$;
    private static final SubLSymbol $ic232$;
    private static final SubLSymbol $ic233$;
    private static final SubLString $ic234$;
    private static final SubLString $ic235$;
    private static final SubLString $ic236$;
    
    
    public static SubLObject f46336() {
        return module0067.f4852(module0749.$g5968$.getGlobalValue());
    }
    
    public static SubLObject f46337() {
        module0749.$g5969$.setGlobalValue((SubLObject)module0749.T);
        module0750.f46583();
        module0750.f46573();
        return module0749.$g5968$.getGlobalValue();
    }
    
    public static SubLObject f46338() {
        final SubLObject var1 = module0579.$g4316$.getGlobalValue();
        SubLObject var2 = (SubLObject)module0749.NIL;
        try {
            var2 = Locks.seize_lock(var1);
            module0067.f4881(module0749.$g5968$.getGlobalValue());
            module0749.$g5969$.setGlobalValue((SubLObject)module0749.NIL);
            module0756.f47615();
            module0763.f48373();
        }
        finally {
            if (module0749.NIL != var2) {
                Locks.release_lock(var1);
            }
        }
        return module0749.$g5968$.getGlobalValue();
    }
    
    public static SubLObject f46339() {
        return module0749.$g5969$.getGlobalValue();
    }
    
    public static SubLObject f46340() {
        if (module0749.NIL == f46339() || (module0749.NIL == module0750.f46576() && module0749.NIL != module0750.f46577())) {
            module0763.f48234();
        }
        return (SubLObject)module0749.$ic4$;
    }
    
    public static SubLObject f46341() {
        return module0067.f4861(module0749.$g5968$.getGlobalValue());
    }
    
    public static SubLObject f46342() {
        return module0067.f4889(module0749.$g5968$.getGlobalValue());
    }
    
    public static SubLObject f46343(final SubLObject var3, SubLObject var4) {
        if (var4 == module0749.UNPROVIDED) {
            var4 = (SubLObject)module0749.T;
        }
        SubLObject var5 = (SubLObject)module0749.NIL;
        final SubLObject var6 = module0579.$g4316$.getGlobalValue();
        SubLObject var7 = (SubLObject)module0749.NIL;
        try {
            var7 = Locks.seize_lock(var6);
            if (module0749.NIL != var4) {
                f46340();
            }
            var5 = module0067.f4884(module0749.$g5968$.getGlobalValue(), var3, (SubLObject)module0749.UNPROVIDED);
        }
        finally {
            if (module0749.NIL != var7) {
                Locks.release_lock(var6);
            }
        }
        return var5;
    }
    
    public static SubLObject f46344(final SubLObject var3, final SubLObject var8) {
        module0067.f4886(module0749.$g5968$.getGlobalValue(), var3, var8);
        return (SubLObject)module0749.$ic5$;
    }
    
    public static SubLObject f46345(final SubLObject var3) {
        f46346(var3);
        module0067.f4887(module0749.$g5968$.getGlobalValue(), var3);
        return (SubLObject)module0749.$ic6$;
    }
    
    public static SubLObject f46346(final SubLObject var3) {
        SubLObject var4 = module0763.f48241(var3, (SubLObject)module0749.NIL);
        SubLObject var5 = (SubLObject)module0749.NIL;
        var5 = var4.first();
        while (module0749.NIL != var4) {
            final SubLObject var6 = module0077.f5333(var5);
            SubLObject var7;
            SubLObject var8;
            SubLObject var9;
            for (var7 = module0032.f1741(var6), var8 = (SubLObject)module0749.NIL, var8 = module0032.f1742(var7, var6); module0749.NIL == module0032.f1744(var7, var8); var8 = module0032.f1743(var8)) {
                var9 = module0032.f1745(var7, var8);
                if (module0749.NIL != module0032.f1746(var8, var9)) {
                    f46347(var9);
                }
            }
            var4 = var4.rest();
            var5 = var4.first();
        }
        return var3;
    }
    
    public static SubLObject f46347(final SubLObject var14) {
        final SubLObject var15 = f46348(var14);
        if (module0749.NIL != module0756.f47497(var15, (SubLObject)module0749.UNPROVIDED)) {
            module0756.f47613(var15, (SubLObject)module0749.UNPROVIDED);
        }
        return var14;
    }
    
    public static SubLObject f46349(final SubLObject var16, final SubLObject var17) {
        f46350(var16, var17, (SubLObject)module0749.ZERO_INTEGER);
        return (SubLObject)module0749.NIL;
    }
    
    public static SubLObject f46351(final SubLObject var16) {
        return (SubLObject)((var16.getClass() == $sX50672_native.class) ? module0749.T : module0749.NIL);
    }
    
    public static SubLObject f46352(final SubLObject var16) {
        assert module0749.NIL != f46351(var16) : var16;
        return var16.getField2();
    }
    
    public static SubLObject f46353(final SubLObject var16) {
        assert module0749.NIL != f46351(var16) : var16;
        return var16.getField3();
    }
    
    public static SubLObject f46354(final SubLObject var16) {
        assert module0749.NIL != f46351(var16) : var16;
        return var16.getField4();
    }
    
    public static SubLObject f46355(final SubLObject var16, final SubLObject var19) {
        assert module0749.NIL != f46351(var16) : var16;
        return var16.setField2(var19);
    }
    
    public static SubLObject f46356(final SubLObject var16, final SubLObject var19) {
        assert module0749.NIL != f46351(var16) : var16;
        return var16.setField3(var19);
    }
    
    public static SubLObject f46357(final SubLObject var16, final SubLObject var19) {
        assert module0749.NIL != f46351(var16) : var16;
        return var16.setField4(var19);
    }
    
    public static SubLObject f46358(SubLObject var20) {
        if (var20 == module0749.UNPROVIDED) {
            var20 = (SubLObject)module0749.NIL;
        }
        final SubLObject var21 = (SubLObject)new $sX50672_native();
        SubLObject var22;
        SubLObject var23;
        SubLObject var24;
        SubLObject var25;
        for (var22 = (SubLObject)module0749.NIL, var22 = var20; module0749.NIL != var22; var22 = conses_high.cddr(var22)) {
            var23 = var22.first();
            var24 = conses_high.cadr(var22);
            var25 = var23;
            if (var25.eql((SubLObject)module0749.$ic22$)) {
                f46355(var21, var24);
            }
            else if (var25.eql((SubLObject)module0749.$ic23$)) {
                f46356(var21, var24);
            }
            else if (var25.eql((SubLObject)module0749.$ic24$)) {
                f46357(var21, var24);
            }
            else {
                Errors.error((SubLObject)module0749.$ic25$, var23);
            }
        }
        return var21;
    }
    
    public static SubLObject f46359(final SubLObject var26, final SubLObject var27) {
        Functions.funcall(var27, var26, (SubLObject)module0749.$ic26$, (SubLObject)module0749.$ic27$, (SubLObject)module0749.THREE_INTEGER);
        Functions.funcall(var27, var26, (SubLObject)module0749.$ic28$, (SubLObject)module0749.$ic22$, f46352(var26));
        Functions.funcall(var27, var26, (SubLObject)module0749.$ic28$, (SubLObject)module0749.$ic23$, f46353(var26));
        Functions.funcall(var27, var26, (SubLObject)module0749.$ic28$, (SubLObject)module0749.$ic24$, f46354(var26));
        Functions.funcall(var27, var26, (SubLObject)module0749.$ic29$, (SubLObject)module0749.$ic27$, (SubLObject)module0749.THREE_INTEGER);
        return var26;
    }
    
    public static SubLObject f46360(final SubLObject var26, final SubLObject var27) {
        return f46359(var26, var27);
    }
    
    public static SubLObject f46361(final SubLObject var28) {
        return Sxhash.sxhash(f46354(var28));
    }
    
    public static SubLObject f46362(SubLObject var15, SubLObject var29, SubLObject var30) {
        if (var15 == module0749.UNPROVIDED) {
            var15 = (SubLObject)module0749.NIL;
        }
        if (var29 == module0749.UNPROVIDED) {
            var29 = (SubLObject)module0749.NIL;
        }
        if (var30 == module0749.UNPROVIDED) {
            var30 = (SubLObject)module0749.NIL;
        }
        if (module0749.NIL != var15 && !module0749.areAssertionsDisabledFor(me) && module0749.NIL == module0756.f47497(var15, (SubLObject)module0749.UNPROVIDED)) {
            throw new AssertionError(var15);
        }
        if (module0749.NIL != var30 && !module0749.areAssertionsDisabledFor(me) && module0749.NIL == module0174.f11035(var30)) {
            throw new AssertionError(var30);
        }
        final SubLObject var31 = f46358((SubLObject)module0749.UNPROVIDED);
        f46355(var31, var15);
        f46356(var31, var29);
        f46357(var31, var30);
        return var31;
    }
    
    public static SubLObject f46350(final SubLObject var31, SubLObject var17, SubLObject var32) {
        if (var17 == module0749.UNPROVIDED) {
            var17 = (SubLObject)module0749.NIL;
        }
        if (var32 == module0749.UNPROVIDED) {
            var32 = (SubLObject)module0749.NIL;
        }
        PrintLow.format(var17, (SubLObject)module0749.$ic34$, f46352(var31));
        return (SubLObject)module0749.NIL;
    }
    
    public static SubLObject f46363(final SubLObject var14) {
        final SubLObject var15 = f46353(var14);
        if (module0749.NIL == var15) {
            return (SubLObject)module0749.NIL;
        }
        if (module0749.NIL != module0232.f15323(var15)) {
            return module0232.f15333(var15);
        }
        if (module0749.NIL != module0202.f12590(var15)) {
            return var15;
        }
        return (SubLObject)module0749.NIL;
    }
    
    public static SubLObject f46364(final SubLObject var14, final SubLObject var29) {
        f46356(var14, var29);
        return var14;
    }
    
    public static SubLObject f46348(final SubLObject var14) {
        return f46352(var14);
    }
    
    public static SubLObject f46365(final SubLObject var14) {
        return f46353(var14);
    }
    
    public static SubLObject f46366(final SubLObject var14) {
        final SubLObject var15 = f46354(var14);
        if (module0749.NIL != module0174.f11035(var15)) {
            return var15;
        }
        if (module0749.NIL != module0161.f10479(var15)) {
            return Sequences.find_if((SubLObject)module0749.$ic33$, module0756.f47510(f46348(var14)), (SubLObject)module0749.UNPROVIDED, (SubLObject)module0749.UNPROVIDED, (SubLObject)module0749.UNPROVIDED);
        }
        final SubLObject var16 = Sequences.cconcatenate((SubLObject)module0749.$ic35$, new SubLObject[] { module0006.f205((SubLObject)module0749.ONE_INTEGER), module0749.$ic36$, module0006.f203((SubLObject)module0749.$ic37$) });
        module0578.f35476(var16, (SubLObject)ConsesLow.list(var14, var15));
        return (SubLObject)module0749.NIL;
    }
    
    public static SubLObject f46367(final SubLObject var14) {
        final SubLObject var15 = f46354(var14);
        if (module0749.NIL != module0174.f11035(var15)) {
            return module0178.f11287(var15);
        }
        if (module0749.NIL != module0161.f10479(var15)) {
            return var15;
        }
        final SubLObject var16 = Sequences.cconcatenate((SubLObject)module0749.$ic35$, new SubLObject[] { module0006.f205((SubLObject)module0749.ONE_INTEGER), module0749.$ic36$, module0006.f203((SubLObject)module0749.$ic38$) });
        module0578.f35476(var16, (SubLObject)ConsesLow.list(var14, var15));
        return (SubLObject)module0749.NIL;
    }
    
    public static SubLObject f46368(final SubLObject var28, final SubLObject var17) {
        return f46369(var28, var17);
    }
    
    public static SubLObject f46369(final SubLObject var35, final SubLObject var17) {
        module0021.f1086(module0749.$g5971$.getGlobalValue(), var17);
        module0021.f1038(module0756.f47475(f46352(var35)), var17);
        module0021.f1038(f46353(var35), var17);
        module0021.f1038(f46354(var35), var17);
        return var35;
    }
    
    public static SubLObject f46370(final SubLObject var17) {
        SubLObject var18 = (SubLObject)module0749.NIL;
        var18 = f46358((SubLObject)module0749.UNPROVIDED);
        f46355(var18, f46371(module0021.f1060(var17, (SubLObject)module0749.UNPROVIDED, (SubLObject)module0749.UNPROVIDED)));
        f46356(var18, module0021.f1060(var17, (SubLObject)module0749.UNPROVIDED, (SubLObject)module0749.UNPROVIDED));
        f46357(var18, module0021.f1060(var17, (SubLObject)module0749.UNPROVIDED, (SubLObject)module0749.UNPROVIDED));
        return var18;
    }
    
    public static SubLObject f46372(final SubLObject var16, final SubLObject var17) {
        f46373(var16, var17, (SubLObject)module0749.ZERO_INTEGER);
        return (SubLObject)module0749.NIL;
    }
    
    public static SubLObject f46374(final SubLObject var16) {
        return (SubLObject)((var16.getClass() == $sX39306_native.class) ? module0749.T : module0749.NIL);
    }
    
    public static SubLObject f46375(final SubLObject var16) {
        assert module0749.NIL != f46374(var16) : var16;
        return var16.getField2();
    }
    
    public static SubLObject f46376(final SubLObject var16) {
        assert module0749.NIL != f46374(var16) : var16;
        return var16.getField3();
    }
    
    public static SubLObject f46377(final SubLObject var16, final SubLObject var19) {
        assert module0749.NIL != f46374(var16) : var16;
        return var16.setField2(var19);
    }
    
    public static SubLObject f46378(final SubLObject var16, final SubLObject var19) {
        assert module0749.NIL != f46374(var16) : var16;
        return var16.setField3(var19);
    }
    
    public static SubLObject f46379(SubLObject var20) {
        if (var20 == module0749.UNPROVIDED) {
            var20 = (SubLObject)module0749.NIL;
        }
        final SubLObject var21 = (SubLObject)new $sX39306_native();
        SubLObject var22;
        SubLObject var23;
        SubLObject var24;
        SubLObject var25;
        for (var22 = (SubLObject)module0749.NIL, var22 = var20; module0749.NIL != var22; var22 = conses_high.cddr(var22)) {
            var23 = var22.first();
            var24 = conses_high.cadr(var22);
            var25 = var23;
            if (var25.eql((SubLObject)module0749.$ic55$)) {
                f46377(var21, var24);
            }
            else if (var25.eql((SubLObject)module0749.$ic56$)) {
                f46378(var21, var24);
            }
            else {
                Errors.error((SubLObject)module0749.$ic25$, var23);
            }
        }
        return var21;
    }
    
    public static SubLObject f46380(final SubLObject var26, final SubLObject var27) {
        Functions.funcall(var27, var26, (SubLObject)module0749.$ic26$, (SubLObject)module0749.$ic57$, (SubLObject)module0749.TWO_INTEGER);
        Functions.funcall(var27, var26, (SubLObject)module0749.$ic28$, (SubLObject)module0749.$ic55$, f46375(var26));
        Functions.funcall(var27, var26, (SubLObject)module0749.$ic28$, (SubLObject)module0749.$ic56$, f46376(var26));
        Functions.funcall(var27, var26, (SubLObject)module0749.$ic29$, (SubLObject)module0749.$ic57$, (SubLObject)module0749.TWO_INTEGER);
        return var26;
    }
    
    public static SubLObject f46381(final SubLObject var26, final SubLObject var27) {
        return f46380(var26, var27);
    }
    
    public static SubLObject f46373(final SubLObject var39, final SubLObject var17, final SubLObject var32) {
        final SubLObject var40 = f46375(var39);
        final SubLObject var41 = f46376(var39);
        PrintLow.format(var17, (SubLObject)module0749.$ic59$);
        if (module0749.NIL != module0751.f47165(var40)) {
            final SubLObject var42 = module0751.f47173(var40);
            PrintLow.format(var17, (SubLObject)module0749.$ic60$, module0751.f47170(var40));
            if (module0749.NIL != module0756.f47497(var42, (SubLObject)module0749.UNPROVIDED)) {
                PrintLow.format(var17, (SubLObject)module0749.$ic61$, module0756.f47475(var42));
            }
            else {
                PrintLow.format(var17, (SubLObject)module0749.$ic62$, var42);
            }
            print_high.princ((SubLObject)module0749.$ic63$, var17);
        }
        if (module0749.NIL != module0751.f47165(var41)) {
            final SubLObject var42 = module0751.f47173(var41);
            PrintLow.format(var17, (SubLObject)module0749.$ic60$, module0751.f47170(var41));
            if (module0749.NIL != module0756.f47497(var42, (SubLObject)module0749.UNPROVIDED)) {
                PrintLow.format(var17, (SubLObject)module0749.$ic61$, module0756.f47475(var42));
            }
            else {
                PrintLow.format(var17, (SubLObject)module0749.$ic62$, var42);
            }
            print_high.princ((SubLObject)module0749.$ic63$, var17);
        }
        print_high.princ((SubLObject)module0749.$ic64$, var17);
        return var39;
    }
    
    public static SubLObject f46382(SubLObject var43, SubLObject var44) {
        if (var43 == module0749.UNPROVIDED) {
            var43 = module0751.f47163();
        }
        if (var44 == module0749.UNPROVIDED) {
            var44 = (SubLObject)module0749.NIL;
        }
        return f46383(var43, var44);
    }
    
    public static SubLObject f46383(final SubLObject var43, final SubLObject var44) {
        final SubLObject var45 = f46379((SubLObject)module0749.UNPROVIDED);
        f46377(var45, var43);
        f46378(var45, var44);
        return var45;
    }
    
    public static SubLObject f46384() {
        return f46383(module0751.f47163(), (SubLObject)module0749.NIL);
    }
    
    public static SubLObject f46385(final SubLObject var45) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0749.NIL != f46374(var45) && module0749.NIL != module0751.f47169(f46375(var45)) && module0749.NIL == f46376(var45));
    }
    
    public static SubLObject f46386(final SubLObject var46, final SubLObject var29) {
        f46377(var46, var29);
        return var46;
    }
    
    public static SubLObject f46387(final SubLObject var46, final SubLObject var29) {
        f46378(var46, var29);
        return var46;
    }
    
    public static SubLObject f46388(final SubLObject var46, SubLObject var47) {
        if (var47 == module0749.UNPROVIDED) {
            var47 = module0067.f4880((SubLObject)module0749.UNPROVIDED, (SubLObject)module0749.UNPROVIDED);
        }
        final SubLObject var48 = f46375(var46);
        final SubLObject var49 = f46376(var46);
        final SubLObject var50 = f46389(var49, var47);
        return f46382(var48, var50);
    }
    
    public static SubLObject f46389(final SubLObject var29, final SubLObject var47) {
        if (module0749.NIL == module0751.f47165(var29)) {
            return (SubLObject)module0749.NIL;
        }
        final SubLObject var48 = module0751.f47170(var29);
        final SubLObject var49 = module0751.f47173(var29);
        final SubLObject var50 = f46390(var49, var47);
        if (module0749.NIL != module0756.f47497(var50, (SubLObject)module0749.UNPROVIDED)) {
            module0067.f4886(var47, var49, var50);
        }
        return module0751.f46991(var48, var50);
    }
    
    public static SubLObject f46390(final SubLObject var51, final SubLObject var47) {
        final SubLThread var52 = SubLProcess.currentSubLThread();
        if (module0749.NIL == module0756.f47497(var51, (SubLObject)module0749.UNPROVIDED)) {
            return var51;
        }
        final SubLObject var53 = module0067.f4884(var47, var51, (SubLObject)module0749.UNPROVIDED);
        if (module0749.NIL != var53) {
            return var53;
        }
        if (module0749.NIL != module0579.$g4339$.getDynamicValue(var52)) {
            return var51;
        }
        return module0756.f47493(var51, var47, (SubLObject)module0749.NIL, (SubLObject)module0749.NIL, (SubLObject)module0749.UNPROVIDED);
    }
    
    public static SubLObject f46391(final SubLObject var28, final SubLObject var17) {
        return f46392(var28, var17);
    }
    
    public static SubLObject f46392(final SubLObject var55, final SubLObject var17) {
        module0021.f1086(module0749.$g5973$.getGlobalValue(), var17);
        module0021.f1038(f46375(var55), var17);
        final SubLObject var56 = f46376(var55);
        if (module0749.NIL != module0751.f47165(var56)) {
            final SubLObject var57 = module0751.f47170(var56);
            final SubLObject var58 = module0751.f47173(var56);
            if (module0749.NIL != module0756.f47497(var58, (SubLObject)module0749.UNPROVIDED)) {
                module0021.f1038((SubLObject)ConsesLow.cons(var57, module0756.f47475(var58)), var17);
            }
            else {
                module0021.f1038(var56, var17);
            }
        }
        else {
            module0021.f1038(var56, var17);
        }
        return var55;
    }
    
    public static SubLObject f46393(final SubLObject var17) {
        SubLObject var18 = (SubLObject)module0749.NIL;
        var18 = f46379((SubLObject)module0749.UNPROVIDED);
        f46377(var18, module0021.f1060(var17, (SubLObject)module0749.UNPROVIDED, (SubLObject)module0749.UNPROVIDED));
        final SubLObject var19 = module0021.f1060(var17, (SubLObject)module0749.UNPROVIDED, (SubLObject)module0749.UNPROVIDED);
        final SubLObject var20 = module0751.f47170(var19);
        SubLObject var21 = module0751.f47173(var19);
        if (var21.isInteger()) {
            final SubLObject var22 = f46371(var21);
            if (module0749.NIL != module0756.f47497(var22, (SubLObject)module0749.UNPROVIDED)) {
                var21 = var22;
            }
            else {
                Errors.warn((SubLObject)module0749.$ic68$);
            }
        }
        f46378(var18, module0751.f46991(var20, var21));
        return var18;
    }
    
    public static SubLObject f46394(final SubLObject var16, final SubLObject var17) {
        f46395(var16, var17, (SubLObject)module0749.ZERO_INTEGER);
        return (SubLObject)module0749.NIL;
    }
    
    public static SubLObject f46396(final SubLObject var16) {
        return (SubLObject)((var16.getClass() == $sX50687_native.class) ? module0749.T : module0749.NIL);
    }
    
    public static SubLObject f46397(final SubLObject var16) {
        assert module0749.NIL != f46396(var16) : var16;
        return var16.getField2();
    }
    
    public static SubLObject f46398(final SubLObject var16) {
        assert module0749.NIL != f46396(var16) : var16;
        return var16.getField3();
    }
    
    public static SubLObject f46399(final SubLObject var16) {
        assert module0749.NIL != f46396(var16) : var16;
        return var16.getField4();
    }
    
    public static SubLObject f46400(final SubLObject var16) {
        assert module0749.NIL != f46396(var16) : var16;
        return var16.getField5();
    }
    
    public static SubLObject f46401(final SubLObject var16) {
        assert module0749.NIL != f46396(var16) : var16;
        return var16.getField6();
    }
    
    public static SubLObject f46402(final SubLObject var16) {
        assert module0749.NIL != f46396(var16) : var16;
        return var16.getField7();
    }
    
    public static SubLObject f46403(final SubLObject var16, final SubLObject var19) {
        assert module0749.NIL != f46396(var16) : var16;
        return var16.setField2(var19);
    }
    
    public static SubLObject f46404(final SubLObject var16, final SubLObject var19) {
        assert module0749.NIL != f46396(var16) : var16;
        return var16.setField3(var19);
    }
    
    public static SubLObject f46405(final SubLObject var16, final SubLObject var19) {
        assert module0749.NIL != f46396(var16) : var16;
        return var16.setField4(var19);
    }
    
    public static SubLObject f46406(final SubLObject var16, final SubLObject var19) {
        assert module0749.NIL != f46396(var16) : var16;
        return var16.setField5(var19);
    }
    
    public static SubLObject f46407(final SubLObject var16, final SubLObject var19) {
        assert module0749.NIL != f46396(var16) : var16;
        return var16.setField6(var19);
    }
    
    public static SubLObject f46408(final SubLObject var16, final SubLObject var19) {
        assert module0749.NIL != f46396(var16) : var16;
        return var16.setField7(var19);
    }
    
    public static SubLObject f46409(SubLObject var20) {
        if (var20 == module0749.UNPROVIDED) {
            var20 = (SubLObject)module0749.NIL;
        }
        final SubLObject var21 = (SubLObject)new $sX50687_native();
        SubLObject var22;
        SubLObject var23;
        SubLObject var24;
        SubLObject var25;
        for (var22 = (SubLObject)module0749.NIL, var22 = var20; module0749.NIL != var22; var22 = conses_high.cddr(var22)) {
            var23 = var22.first();
            var24 = conses_high.cadr(var22);
            var25 = var23;
            if (var25.eql((SubLObject)module0749.$ic90$)) {
                f46403(var21, var24);
            }
            else if (var25.eql((SubLObject)module0749.$ic91$)) {
                f46404(var21, var24);
            }
            else if (var25.eql((SubLObject)module0749.$ic92$)) {
                f46405(var21, var24);
            }
            else if (var25.eql((SubLObject)module0749.$ic93$)) {
                f46406(var21, var24);
            }
            else if (var25.eql((SubLObject)module0749.$ic94$)) {
                f46407(var21, var24);
            }
            else if (var25.eql((SubLObject)module0749.$ic95$)) {
                f46408(var21, var24);
            }
            else {
                Errors.error((SubLObject)module0749.$ic25$, var23);
            }
        }
        return var21;
    }
    
    public static SubLObject f46410(final SubLObject var26, final SubLObject var27) {
        Functions.funcall(var27, var26, (SubLObject)module0749.$ic26$, (SubLObject)module0749.$ic96$, (SubLObject)module0749.SIX_INTEGER);
        Functions.funcall(var27, var26, (SubLObject)module0749.$ic28$, (SubLObject)module0749.$ic90$, f46397(var26));
        Functions.funcall(var27, var26, (SubLObject)module0749.$ic28$, (SubLObject)module0749.$ic91$, f46398(var26));
        Functions.funcall(var27, var26, (SubLObject)module0749.$ic28$, (SubLObject)module0749.$ic92$, f46399(var26));
        Functions.funcall(var27, var26, (SubLObject)module0749.$ic28$, (SubLObject)module0749.$ic93$, f46400(var26));
        Functions.funcall(var27, var26, (SubLObject)module0749.$ic28$, (SubLObject)module0749.$ic94$, f46401(var26));
        Functions.funcall(var27, var26, (SubLObject)module0749.$ic28$, (SubLObject)module0749.$ic95$, f46402(var26));
        Functions.funcall(var27, var26, (SubLObject)module0749.$ic29$, (SubLObject)module0749.$ic96$, (SubLObject)module0749.SIX_INTEGER);
        return var26;
    }
    
    public static SubLObject f46411(final SubLObject var26, final SubLObject var27) {
        return f46410(var26, var27);
    }
    
    public static SubLObject f46412(final SubLObject var15) {
        final SubLObject var16 = f46413(var15);
        return f46414(var16);
    }
    
    public static SubLObject f46415(final SubLObject var28) {
        return Equality.eq(var28, module0749.$g5975$.getGlobalValue());
    }
    
    public static SubLObject f46414(final SubLObject var28) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var28.isVector() || module0749.NIL != f46415(var28));
    }
    
    public static SubLObject f46416(final SubLObject var15) {
        final SubLObject var16 = f46402(module0743.f45994(var15));
        return (module0749.NIL != f46412(var15)) ? var16.rest() : var16;
    }
    
    public static SubLObject f46417(final SubLObject var63, final SubLObject var64) {
        SubLObject var66;
        final SubLObject var65 = var66 = var63.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var66, var65, (SubLObject)module0749.$ic99$);
        final SubLObject var67 = var66.rest();
        var66 = var66.first();
        SubLObject var68 = (SubLObject)module0749.NIL;
        SubLObject var69 = (SubLObject)module0749.NIL;
        SubLObject var70 = (SubLObject)module0749.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var66, var65, (SubLObject)module0749.$ic99$);
        var68 = var66.first();
        var66 = var66.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var66, var65, (SubLObject)module0749.$ic99$);
        var69 = var66.first();
        var66 = var66.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var66, var65, (SubLObject)module0749.$ic99$);
        var70 = var66.first();
        var66 = var66.rest();
        if (module0749.NIL == var66) {
            final SubLObject var71;
            var66 = (var71 = var67);
            final SubLObject var72 = (SubLObject)module0749.$ic100$;
            return (SubLObject)ConsesLow.list((SubLObject)module0749.$ic101$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var72, (SubLObject)ConsesLow.list((SubLObject)module0749.$ic102$, var70))), (SubLObject)ConsesLow.listS((SubLObject)module0749.$ic103$, (SubLObject)ConsesLow.list(var68, var69, var72), ConsesLow.append(var71, (SubLObject)module0749.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var65, (SubLObject)module0749.$ic99$);
        return (SubLObject)module0749.NIL;
    }
    
    public static SubLObject f46418(final SubLObject var15, final SubLObject var68, SubLObject var72) {
        if (var72 == module0749.UNPROVIDED) {
            var72 = (SubLObject)module0749.NIL;
        }
        if (module0749.NIL != module0004.f106(var68)) {
            return f46419(var15, var68, var72);
        }
        final SubLObject var73 = f46416(var15);
        return conses_high.getf(var73, var68, var72);
    }
    
    public static SubLObject f46420(final SubLObject var15, final SubLObject var73, final SubLObject var74, SubLObject var72) {
        if (var72 == module0749.UNPROVIDED) {
            var72 = (SubLObject)module0749.NIL;
        }
        return (module0749.NIL != f46412(var15)) ? f46418(var15, var74, var72) : f46418(var15, var73, var72);
    }
    
    public static SubLObject f46421(final SubLObject var15, final SubLObject var68, final SubLObject var75) {
        final SubLThread var76 = SubLProcess.currentSubLThread();
        if (module0749.NIL == Errors.$ignore_mustsP$.getDynamicValue(var76) && !var75.eql(Sequences.position(var68, f46422(), (SubLObject)module0749.UNPROVIDED, (SubLObject)module0749.UNPROVIDED, (SubLObject)module0749.UNPROVIDED, (SubLObject)module0749.UNPROVIDED))) {
            Errors.error((SubLObject)module0749.$ic104$, var68, Sequences.position(var68, f46422(), (SubLObject)module0749.UNPROVIDED, (SubLObject)module0749.UNPROVIDED, (SubLObject)module0749.UNPROVIDED, (SubLObject)module0749.UNPROVIDED), var75);
        }
        return (SubLObject)((module0749.NIL != f46412(var15)) ? SubLObjectFactory.makeBoolean(!module0749.$g5976$.getGlobalValue().eql(f46423(var15, var75))) : module0035.f2346(f46416(var15), var68));
    }
    
    public static SubLObject f46424(final SubLObject var15, final SubLObject var68, final SubLObject var69) {
        if (module0749.NIL != module0004.f106(var68)) {
            f46425(var15, var68, var69);
        }
        else if (module0749.NIL != f46412(var15)) {
            ConsesLow.rplacd(f46402(module0743.f45994(var15)), conses_high.putf(f46416(var15), var68, var69));
        }
        else {
            f46408(module0743.f45994(var15), conses_high.putf(f46416(var15), var68, var69));
        }
        return var69;
    }
    
    public static SubLObject f46426(final SubLObject var15, final SubLObject var73, final SubLObject var74, final SubLObject var69) {
        return (module0749.NIL != f46412(var15)) ? f46424(var15, var74, var69) : f46424(var15, var73, var69);
    }
    
    public static SubLObject f46427(final SubLObject var15, final SubLObject var68) {
        if (module0749.NIL != f46412(var15)) {
            ConsesLow.rplacd(f46402(module0743.f45994(var15)), conses_high.remf(f46416(var15), var68));
        }
        else {
            f46408(module0743.f45994(var15), conses_high.remf(f46416(var15), var68));
        }
        return f46418(var15, var68, (SubLObject)module0749.UNPROVIDED);
    }
    
    public static SubLObject f46428(final SubLObject var16, final SubLObject var17) {
        f46429(var16, var17, (SubLObject)module0749.ZERO_INTEGER);
        return (SubLObject)module0749.NIL;
    }
    
    public static SubLObject f46430(final SubLObject var16) {
        return (SubLObject)((var16.getClass() == $sX50689_native.class) ? module0749.T : module0749.NIL);
    }
    
    public static SubLObject f46431(final SubLObject var16) {
        assert module0749.NIL != f46430(var16) : var16;
        return var16.getField2();
    }
    
    public static SubLObject f46432(final SubLObject var16) {
        assert module0749.NIL != f46430(var16) : var16;
        return var16.getField3();
    }
    
    public static SubLObject f46433(final SubLObject var16) {
        assert module0749.NIL != f46430(var16) : var16;
        return var16.getField4();
    }
    
    public static SubLObject f46434(final SubLObject var16) {
        assert module0749.NIL != f46430(var16) : var16;
        return var16.getField5();
    }
    
    public static SubLObject f46435(final SubLObject var16) {
        assert module0749.NIL != f46430(var16) : var16;
        return var16.getField6();
    }
    
    public static SubLObject f46436(final SubLObject var16) {
        assert module0749.NIL != f46430(var16) : var16;
        return var16.getField7();
    }
    
    public static SubLObject f46437(final SubLObject var16, final SubLObject var19) {
        assert module0749.NIL != f46430(var16) : var16;
        return var16.setField2(var19);
    }
    
    public static SubLObject f46438(final SubLObject var16, final SubLObject var19) {
        assert module0749.NIL != f46430(var16) : var16;
        return var16.setField3(var19);
    }
    
    public static SubLObject f46439(final SubLObject var16, final SubLObject var19) {
        assert module0749.NIL != f46430(var16) : var16;
        return var16.setField4(var19);
    }
    
    public static SubLObject f46440(final SubLObject var16, final SubLObject var19) {
        assert module0749.NIL != f46430(var16) : var16;
        return var16.setField5(var19);
    }
    
    public static SubLObject f46441(final SubLObject var16, final SubLObject var19) {
        assert module0749.NIL != f46430(var16) : var16;
        return var16.setField6(var19);
    }
    
    public static SubLObject f46442(final SubLObject var16, final SubLObject var19) {
        assert module0749.NIL != f46430(var16) : var16;
        return var16.setField7(var19);
    }
    
    public static SubLObject f46443(SubLObject var20) {
        if (var20 == module0749.UNPROVIDED) {
            var20 = (SubLObject)module0749.NIL;
        }
        final SubLObject var21 = (SubLObject)new $sX50689_native();
        SubLObject var22;
        SubLObject var23;
        SubLObject var24;
        SubLObject var25;
        for (var22 = (SubLObject)module0749.NIL, var22 = var20; module0749.NIL != var22; var22 = conses_high.cddr(var22)) {
            var23 = var22.first();
            var24 = conses_high.cadr(var22);
            var25 = var23;
            if (var25.eql((SubLObject)module0749.$ic126$)) {
                f46437(var21, var24);
            }
            else if (var25.eql((SubLObject)module0749.$ic127$)) {
                f46438(var21, var24);
            }
            else if (var25.eql((SubLObject)module0749.$ic90$)) {
                f46439(var21, var24);
            }
            else if (var25.eql((SubLObject)module0749.$ic128$)) {
                f46440(var21, var24);
            }
            else if (var25.eql((SubLObject)module0749.$ic129$)) {
                f46441(var21, var24);
            }
            else if (var25.eql((SubLObject)module0749.$ic91$)) {
                f46442(var21, var24);
            }
            else {
                Errors.error((SubLObject)module0749.$ic25$, var23);
            }
        }
        return var21;
    }
    
    public static SubLObject f46444(final SubLObject var26, final SubLObject var27) {
        Functions.funcall(var27, var26, (SubLObject)module0749.$ic26$, (SubLObject)module0749.$ic130$, (SubLObject)module0749.SIX_INTEGER);
        Functions.funcall(var27, var26, (SubLObject)module0749.$ic28$, (SubLObject)module0749.$ic126$, f46431(var26));
        Functions.funcall(var27, var26, (SubLObject)module0749.$ic28$, (SubLObject)module0749.$ic127$, f46432(var26));
        Functions.funcall(var27, var26, (SubLObject)module0749.$ic28$, (SubLObject)module0749.$ic90$, f46433(var26));
        Functions.funcall(var27, var26, (SubLObject)module0749.$ic28$, (SubLObject)module0749.$ic128$, f46434(var26));
        Functions.funcall(var27, var26, (SubLObject)module0749.$ic28$, (SubLObject)module0749.$ic129$, f46435(var26));
        Functions.funcall(var27, var26, (SubLObject)module0749.$ic28$, (SubLObject)module0749.$ic91$, f46436(var26));
        Functions.funcall(var27, var26, (SubLObject)module0749.$ic29$, (SubLObject)module0749.$ic130$, (SubLObject)module0749.SIX_INTEGER);
        return var26;
    }
    
    public static SubLObject f46445(final SubLObject var26, final SubLObject var27) {
        return f46444(var26, var27);
    }
    
    public static SubLObject f46446(SubLObject var79, SubLObject var80, SubLObject var81, SubLObject var82, SubLObject var83, SubLObject var39) {
        if (var79 == module0749.UNPROVIDED) {
            var79 = module0038.$g916$.getGlobalValue();
        }
        if (var80 == module0749.UNPROVIDED) {
            var80 = module0751.f46705();
        }
        if (var81 == module0749.UNPROVIDED) {
            var81 = (SubLObject)module0749.NIL;
        }
        if (var82 == module0749.UNPROVIDED) {
            var82 = (SubLObject)module0749.NIL;
        }
        if (var83 == module0749.UNPROVIDED) {
            var83 = (SubLObject)module0749.NIL;
        }
        if (var39 == module0749.UNPROVIDED) {
            var39 = (SubLObject)module0749.NIL;
        }
        assert module0749.NIL != module0581.f35648(var79) : var79;
        final SubLObject var84 = f46443((SubLObject)module0749.UNPROVIDED);
        f46437(var84, var79);
        f46438(var84, var80);
        f46439(var84, var81);
        f46440(var84, var82);
        f46441(var84, var83);
        f46442(var84, var39);
        return var84;
    }
    
    public static SubLObject f46447(final SubLObject var85) {
        if (module0749.NIL != f46430(var85)) {
            final SubLObject var86 = f46431(var85);
            final SubLObject var87 = f46432(var85);
            final SubLObject var88 = f46433(var85);
            final SubLObject var89 = f46434(var85);
            final SubLObject var90 = f46435(var85);
            final SubLObject var91 = f46436(var85);
            return f46446(var86, var87, var88, var89, var90, var91);
        }
        if (module0749.NIL != f46448(var85)) {
            return f46449(var85);
        }
        if (module0749.NIL != f46450(var85)) {
            return f46451(f46447(f46452(var85)), f46453(var85), conses_high.copy_list(f46454(var85)));
        }
        return (SubLObject)module0749.NIL;
    }
    
    public static SubLObject f46429(final SubLObject var84, SubLObject var17, SubLObject var32) {
        if (var17 == module0749.UNPROVIDED) {
            var17 = (SubLObject)module0749.NIL;
        }
        if (var32 == module0749.UNPROVIDED) {
            var32 = (SubLObject)module0749.NIL;
        }
        PrintLow.format(var17, (SubLObject)module0749.$ic133$, new SubLObject[] { f46431(var84), f46432(var84), f46433(var84), f46434(var84), f46435(var84), f46436(var84) });
        return var84;
    }
    
    public static SubLObject f46455(final SubLObject var84) {
        if (module0749.NIL != f46430(var84)) {
            return f46431(var84);
        }
        if (module0749.NIL != f46448(var84)) {
            return f46456(var84);
        }
        if (module0749.NIL != f46450(var84)) {
            return f46455(f46452(var84));
        }
        return (SubLObject)module0749.NIL;
    }
    
    public static SubLObject f46457(final SubLObject var84, final SubLObject var79) {
        assert module0749.NIL != module0581.f35648(var79) : var79;
        if (module0749.NIL != f46430(var84)) {
            f46437(var84, var79);
        }
        else if (module0749.NIL != f46450(var84)) {
            f46457(f46452(var84), var79);
        }
        return var84;
    }
    
    public static SubLObject f46458(final SubLObject var84, final SubLObject var86) {
        if (module0749.NIL != f46430(var84)) {
            final SubLObject var87 = f46455(var84);
            final SubLObject var88 = (module0749.NIL != module0581.f35648(var87)) ? module0581.f35665(var86, var87) : var86;
            return f46457(var84, var88);
        }
        if (module0749.NIL != f46448(var84)) {
            final SubLObject var89 = f46459(var84);
            final SubLObject var90 = (SubLObject)ConsesLow.list(f46446(var86, (SubLObject)module0749.UNPROVIDED, (SubLObject)module0749.UNPROVIDED, (SubLObject)module0749.UNPROVIDED, (SubLObject)module0749.UNPROVIDED, (SubLObject)module0749.UNPROVIDED));
            final SubLObject var91 = (SubLObject)ConsesLow.cons(var90, var89);
            f46460(var84, var91);
            return var84;
        }
        if (module0749.NIL != f46450(var84)) {
            return f46458(f46452(var84), var86);
        }
        return (SubLObject)module0749.NIL;
    }
    
    public static SubLObject f46461(final SubLObject var84, final SubLObject var92) {
        if (module0749.NIL != f46430(var84)) {
            final SubLObject var93 = f46455(var84);
            final SubLObject var94 = (module0749.NIL != module0581.f35648(var93)) ? module0581.f35665(var93, var92) : var92;
            return f46457(var84, var94);
        }
        if (module0749.NIL != f46448(var84)) {
            final SubLObject var95 = f46459(var84);
            final SubLObject var96 = (SubLObject)ConsesLow.list(f46446(var92, (SubLObject)module0749.UNPROVIDED, (SubLObject)module0749.UNPROVIDED, (SubLObject)module0749.UNPROVIDED, (SubLObject)module0749.UNPROVIDED, (SubLObject)module0749.UNPROVIDED));
            final SubLObject var97 = module0035.f1973(var96, var95);
            f46460(var84, var97);
            return var84;
        }
        if (module0749.NIL != f46450(var84)) {
            return f46461(f46452(var84), var92);
        }
        return (SubLObject)module0749.NIL;
    }
    
    public static SubLObject f46462(final SubLObject var84) {
        if (module0749.NIL != f46430(var84)) {
            return f46432(var84);
        }
        if (module0749.NIL != f46448(var84)) {
            return f46463(var84);
        }
        if (module0749.NIL != f46450(var84)) {
            return f46462(f46452(var84));
        }
        return (SubLObject)module0749.NIL;
    }
    
    public static SubLObject f46464(final SubLObject var84, final SubLObject var80) {
        if (module0749.NIL != f46430(var84)) {
            f46438(var84, var80);
        }
        else {
            if (module0749.NIL != f46448(var84)) {
                return f46465(var84, var80);
            }
            if (module0749.NIL != f46450(var84)) {
                return f46464(f46452(var84), var80);
            }
        }
        return var84;
    }
    
    public static SubLObject f46466(final SubLObject var84) {
        if (module0749.NIL != f46430(var84)) {
            return f46433(var84);
        }
        if (module0749.NIL != f46448(var84)) {
            return f46467(var84);
        }
        if (module0749.NIL != f46450(var84)) {
            return f46466(f46452(var84));
        }
        return (SubLObject)module0749.NIL;
    }
    
    public static SubLObject f46468(final SubLObject var84, final SubLObject var81) {
        if (module0749.NIL != module0756.f47694(var81) && module0749.NIL != module0579.f35493(var81, f46455(var84))) {
            final SubLObject var85 = Sequences.cconcatenate((SubLObject)module0749.$ic35$, new SubLObject[] { module0006.f205((SubLObject)module0749.TWO_INTEGER), module0749.$ic36$, module0006.f203((SubLObject)module0749.$ic134$) });
            module0578.f35476(var85, (SubLObject)ConsesLow.list(f46455(var84), var81));
        }
        else if (module0749.NIL != f46430(var84)) {
            f46439(var84, var81);
        }
        else {
            if (module0749.NIL != f46448(var84)) {
                return f46469(var84, var81);
            }
            if (module0749.NIL != f46450(var84)) {
                return f46468(f46452(var84), var81);
            }
        }
        return var84;
    }
    
    public static SubLObject f46470(final SubLObject var84) {
        if (module0749.NIL != f46430(var84)) {
            return f46436(var84);
        }
        if (module0749.NIL != f46448(var84)) {
            return f46471(var84);
        }
        if (module0749.NIL != f46450(var84)) {
            return f46470(f46452(var84));
        }
        return (SubLObject)module0749.NIL;
    }
    
    public static SubLObject f46472(final SubLObject var84, final SubLObject var93) {
        if (module0749.NIL != f46430(var84)) {
            f46442(var84, var93);
        }
        else {
            if (module0749.NIL != f46448(var84)) {
                return f46473(var84, var93);
            }
            if (module0749.NIL != f46450(var84)) {
                return f46472(f46452(var84), var93);
            }
        }
        return var84;
    }
    
    public static SubLObject f46474(final SubLObject var84) {
        if (module0749.NIL != f46430(var84)) {
            return f46434(var84);
        }
        if (module0749.NIL != f46448(var84)) {
            return f46475(var84);
        }
        if (module0749.NIL != f46450(var84)) {
            return f46474(f46452(var84));
        }
        return (SubLObject)module0749.NIL;
    }
    
    public static SubLObject f46476(final SubLObject var84) {
        if (module0749.NIL != f46430(var84)) {
            return f46435(var84);
        }
        if (module0749.NIL != f46448(var84)) {
            return f46477(var84);
        }
        if (module0749.NIL != f46450(var84)) {
            return f46476(f46452(var84));
        }
        return (SubLObject)module0749.NIL;
    }
    
    public static SubLObject f46478(final SubLObject var84) {
        return (SubLObject)ConsesLow.list(f46474(var84), f46476(var84));
    }
    
    public static SubLObject f46479(final SubLObject var84, final SubLObject var94, final SubLObject var95) {
        if (module0749.NIL != f46430(var84)) {
            f46440(var84, var94);
            f46441(var84, var95);
        }
        else {
            if (module0749.NIL != f46448(var84)) {
                return f46480(var84, var94, var95);
            }
            if (module0749.NIL != f46450(var84)) {
                f46479(f46452(var84), var94, var95);
            }
        }
        return var84;
    }
    
    public static SubLObject f46481(final SubLObject var84) {
        assert module0749.NIL != f46482(var84) : var84;
        if (module0749.NIL != f46450(var84)) {
            return f46453(var84);
        }
        return (SubLObject)module0749.ZERO_INTEGER;
    }
    
    public static SubLObject f46483(final SubLObject var84) {
        assert module0749.NIL != f46482(var84) : var84;
        if (module0749.NIL != f46450(var84)) {
            return f46454(var84);
        }
        return (SubLObject)module0749.NIL;
    }
    
    public static SubLObject f46484(final SubLObject var96) {
        return f46485(Mapping.mapcar((SubLObject)module0749.$ic136$, module0035.remove_if_not((SubLObject)module0749.$ic135$, var96, (SubLObject)module0749.UNPROVIDED, (SubLObject)module0749.UNPROVIDED, (SubLObject)module0749.UNPROVIDED, (SubLObject)module0749.UNPROVIDED)));
    }
    
    public static SubLObject f46485(final SubLObject var97) {
        return (SubLObject)ConsesLow.cons((SubLObject)module0749.$ic137$, (SubLObject)ConsesLow.cons(f46446((SubLObject)module0749.UNPROVIDED, (SubLObject)module0749.UNPROVIDED, (SubLObject)module0749.UNPROVIDED, (SubLObject)module0749.UNPROVIDED, (SubLObject)module0749.UNPROVIDED, (SubLObject)module0749.UNPROVIDED), var97));
    }
    
    public static SubLObject f46448(final SubLObject var45) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0749.NIL != module0035.f2014(var45) && module0749.$ic137$ == var45.first() && module0749.NIL != f46430(conses_high.second(var45)) && module0749.NIL != module0035.f2370((SubLObject)module0749.$ic138$, f46459(var45), (SubLObject)module0749.UNPROVIDED));
    }
    
    public static SubLObject f46459(final SubLObject var45) {
        return var45.rest().rest();
    }
    
    public static SubLObject f46460(final SubLObject var45, final SubLObject var96) {
        ConsesLow.rplacd(var45.rest(), var96);
        return var45;
    }
    
    public static SubLObject f46456(final SubLObject var45) {
        SubLObject var46 = (SubLObject)module0749.$ic139$;
        SubLObject var47 = f46459(var45);
        SubLObject var48 = (SubLObject)module0749.NIL;
        var48 = var47.first();
        while (module0749.NIL != var47) {
            var46 = module0581.f35665(var46, module0756.f47713(var48, (SubLObject)module0749.NIL));
            var47 = var47.rest();
            var48 = var47.first();
        }
        return var46;
    }
    
    public static SubLObject f46486(final SubLObject var84, final SubLObject var99) {
        final SubLObject var100 = f46474(var84);
        final SubLObject var101 = (module0749.NIL != var100) ? var100 : module0038.$g916$.getGlobalValue();
        final SubLObject var102 = f46476(var84);
        final SubLObject var103 = (module0749.NIL != var102) ? var102 : module0038.$g916$.getGlobalValue();
        SubLObject var104 = (SubLObject)module0749.$ic139$;
        if (module0749.NIL != var99 && module0749.NIL != module0038.f2653(var101)) {
            var104 = module0581.f35665(var104, var101);
        }
        SubLObject var105 = f46459(var84);
        SubLObject var106 = (SubLObject)module0749.NIL;
        var106 = var105.first();
        while (module0749.NIL != var105) {
            final SubLObject var107 = module0756.f47713(var106, var99);
            if (module0749.NIL != module0581.f35648(var107)) {
                var104 = module0581.f35665(var104, var107);
            }
            var105 = var105.rest();
            var106 = var105.first();
        }
        if (module0749.NIL != var99 && var103.isString()) {
            var104 = module0581.f35665(var104, var103);
        }
        return var104;
    }
    
    public static SubLObject f46449(final SubLObject var45) {
        SubLObject var46 = (SubLObject)module0749.NIL;
        SubLObject var47 = f46459(var45);
        SubLObject var48 = (SubLObject)module0749.NIL;
        var48 = var47.first();
        while (module0749.NIL != var47) {
            final SubLObject var49 = Mapping.mapcar((SubLObject)module0749.$ic140$, var48);
            var46 = (SubLObject)ConsesLow.cons(var49, var46);
            var47 = var47.rest();
            var48 = var47.first();
        }
        final SubLObject var50 = f46485(Sequences.nreverse(var46));
        ConsesLow.set_nth((SubLObject)module0749.ONE_INTEGER, var50, f46447(conses_high.second(var45)));
        return var50;
    }
    
    public static SubLObject f46463(final SubLObject var45) {
        return f46462(conses_high.second(var45));
    }
    
    public static SubLObject f46465(final SubLObject var45, final SubLObject var80) {
        return f46464(conses_high.second(var45), var80);
    }
    
    public static SubLObject f46467(final SubLObject var45) {
        return f46466(conses_high.second(var45));
    }
    
    public static SubLObject f46469(final SubLObject var45, final SubLObject var81) {
        return f46468(conses_high.second(var45), var81);
    }
    
    public static SubLObject f46471(final SubLObject var45) {
        return f46470(conses_high.second(var45));
    }
    
    public static SubLObject f46473(final SubLObject var45, final SubLObject var39) {
        return f46472(conses_high.second(var45), var39);
    }
    
    public static SubLObject f46480(final SubLObject var45, final SubLObject var94, final SubLObject var95) {
        return f46479(conses_high.second(var45), var94, var95);
    }
    
    public static SubLObject f46475(final SubLObject var45) {
        return f46474(conses_high.second(var45));
    }
    
    public static SubLObject f46477(final SubLObject var45) {
        return f46476(conses_high.second(var45));
    }
    
    public static SubLObject f46482(final SubLObject var45) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0749.NIL != f46430(var45) || module0749.NIL != f46448(var45) || module0749.NIL != f46450(var45));
    }
    
    public static SubLObject f46450(final SubLObject var28) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var28.isVector() && module0749.NIL != module0035.f1995(var28, (SubLObject)module0749.THREE_INTEGER, (SubLObject)module0749.UNPROVIDED) && module0749.NIL != module0004.f106(Vectors.aref(var28, (SubLObject)module0749.ONE_INTEGER)) && Vectors.aref(var28, (SubLObject)module0749.TWO_INTEGER).isList() && module0749.NIL != f46482(Vectors.aref(var28, (SubLObject)module0749.ZERO_INTEGER)) && module0749.NIL == f46450(Vectors.aref(var28, (SubLObject)module0749.ZERO_INTEGER)));
    }
    
    public static SubLObject f46451(final SubLObject var107, final SubLObject var108, final SubLObject var109) {
        final SubLThread var110 = SubLProcess.currentSubLThread();
        assert module0749.NIL != f46482(var107) : var107;
        assert module0749.NIL != module0004.f106(var108) : var108;
        assert module0749.NIL != Types.listp(var109) : var109;
        if (module0749.NIL == Errors.$ignore_mustsP$.getDynamicValue(var110) && module0749.NIL != f46450(var107)) {
            Errors.error((SubLObject)module0749.$ic143$);
        }
        final SubLObject var111 = Vectors.make_vector((SubLObject)module0749.THREE_INTEGER, (SubLObject)module0749.UNPROVIDED);
        Vectors.set_aref(var111, (SubLObject)module0749.ZERO_INTEGER, var107);
        Vectors.set_aref(var111, (SubLObject)module0749.ONE_INTEGER, var108);
        Vectors.set_aref(var111, (SubLObject)module0749.TWO_INTEGER, var109);
        return var111;
    }
    
    public static SubLObject f46452(final SubLObject var110) {
        assert module0749.NIL != f46450(var110) : var110;
        return Vectors.aref(var110, (SubLObject)module0749.ZERO_INTEGER);
    }
    
    public static SubLObject f46453(final SubLObject var110) {
        assert module0749.NIL != f46450(var110) : var110;
        return Vectors.aref(var110, (SubLObject)module0749.ONE_INTEGER);
    }
    
    public static SubLObject f46454(final SubLObject var110) {
        assert module0749.NIL != f46450(var110) : var110;
        return Vectors.aref(var110, (SubLObject)module0749.TWO_INTEGER);
    }
    
    public static SubLObject f46487(final SubLObject var110, final SubLObject var108) {
        assert module0749.NIL != f46450(var110) : var110;
        assert module0749.NIL != module0004.f106(var108) : var108;
        Vectors.set_aref(var110, (SubLObject)module0749.ONE_INTEGER, var108);
        return var110;
    }
    
    public static SubLObject f46488(final SubLObject var110, final SubLObject var109) {
        assert module0749.NIL != f46450(var110) : var110;
        assert module0749.NIL != Types.listp(var109) : var109;
        Vectors.set_aref(var110, (SubLObject)module0749.TWO_INTEGER, var109);
        return var110;
    }
    
    public static SubLObject f46489(final SubLObject var28, final SubLObject var17) {
        return f46490(var28, var17);
    }
    
    public static SubLObject f46490(final SubLObject var111, final SubLObject var17) {
        module0021.f1086(module0749.$g5978$.getGlobalValue(), var17);
        module0021.f1038(f46431(var111), var17);
        module0021.f1038(f46432(var111), var17);
        module0021.f1038(f46433(var111), var17);
        module0021.f1038(f46434(var111), var17);
        module0021.f1038(f46435(var111), var17);
        module0021.f1038(f46436(var111), var17);
        return var111;
    }
    
    public static SubLObject f46491(final SubLObject var17) {
        SubLObject var18 = (SubLObject)module0749.NIL;
        var18 = f46443((SubLObject)module0749.UNPROVIDED);
        f46437(var18, module0021.f1060(var17, (SubLObject)module0749.UNPROVIDED, (SubLObject)module0749.UNPROVIDED));
        f46438(var18, module0021.f1060(var17, (SubLObject)module0749.UNPROVIDED, (SubLObject)module0749.UNPROVIDED));
        f46439(var18, module0021.f1060(var17, (SubLObject)module0749.UNPROVIDED, (SubLObject)module0749.UNPROVIDED));
        f46440(var18, module0021.f1060(var17, (SubLObject)module0749.UNPROVIDED, (SubLObject)module0749.UNPROVIDED));
        f46441(var18, module0021.f1060(var17, (SubLObject)module0749.UNPROVIDED, (SubLObject)module0749.UNPROVIDED));
        f46442(var18, module0021.f1060(var17, (SubLObject)module0749.UNPROVIDED, (SubLObject)module0749.UNPROVIDED));
        return var18;
    }
    
    public static SubLObject f46395(final SubLObject var112, SubLObject var17, SubLObject var32) {
        if (var17 == module0749.UNPROVIDED) {
            var17 = (SubLObject)module0749.NIL;
        }
        if (var32 == module0749.UNPROVIDED) {
            var32 = (SubLObject)module0749.NIL;
        }
        final SubLObject var113 = f46397(var112);
        PrintLow.format(var17, (SubLObject)module0749.$ic148$, f46398(var112), var113);
        return var112;
    }
    
    public static SubLObject f46492() {
        return (SubLObject)((module0749.NIL != module0579.f35485()) ? ((module0749.NIL != module0579.f35488()) ? module0749.$ic149$ : module0749.$ic150$) : module0749.$ic151$);
    }
    
    public static SubLObject f46493(final SubLObject var114) {
        final SubLObject var115 = module0743.f46009();
        module0756.f47622(var115, var114);
        module0743.f46001(var115, f46409((SubLObject)module0749.UNPROVIDED));
        return var115;
    }
    
    public static SubLObject f46494(SubLObject var79, SubLObject var81, SubLObject var39) {
        if (var79 == module0749.UNPROVIDED) {
            var79 = (SubLObject)module0749.NIL;
        }
        if (var81 == module0749.UNPROVIDED) {
            var81 = module0756.f47746();
        }
        if (var39 == module0749.UNPROVIDED) {
            var39 = f46384();
        }
        final SubLThread var82 = SubLProcess.currentSubLThread();
        if (module0749.NIL == module0580.$g4365$.getDynamicValue(var82)) {
            final SubLObject var83 = f46492();
            if (module0580.f35565().numG(var83)) {
                final SubLObject var84 = Sequences.cconcatenate((SubLObject)module0749.$ic35$, new SubLObject[] { module0006.f205((SubLObject)module0749.ONE_INTEGER), module0749.$ic36$, module0006.f203((SubLObject)module0749.$ic152$) });
                module0578.f35476(var84, (SubLObject)ConsesLow.list(var83));
            }
        }
        final SubLObject var85 = module0743.f46009();
        final SubLObject var86 = f46409((SubLObject)module0749.UNPROVIDED);
        f46403(var86, var81);
        f46404(var86, var39);
        f46408(var86, (SubLObject)ConsesLow.cons(module0749.$g5975$.getGlobalValue(), (SubLObject)module0749.NIL));
        module0743.f46001(var85, var86);
        module0756.f47622(var85, f46495());
        if (module0749.NIL == var79) {
            module0743.f45999(var85, (SubLObject)module0749.NIL);
        }
        else {
            module0756.f47723(var85, var79);
        }
        module0756.f47464(var85, module0751.f47200());
        if (module0749.NIL == module0580.$g4365$.getDynamicValue(var82)) {
            if (module0749.NIL != module0107.f7629(module0580.$g4363$.getDynamicValue(var82))) {
                module0580.f35564(var85);
            }
            else {
                final SubLObject var87 = Sequences.cconcatenate((SubLObject)module0749.$ic35$, new SubLObject[] { module0006.f205((SubLObject)module0749.ONE_INTEGER), module0749.$ic36$, module0006.f203((SubLObject)module0749.$ic153$) });
                module0578.f35476(var87, (SubLObject)ConsesLow.list(var85));
            }
        }
        return var85;
    }
    
    public static SubLObject f46496(final SubLObject var57, final SubLObject var81, final SubLObject var39, SubLObject var109, SubLObject var117, SubLObject var118, SubLObject var119) {
        if (var109 == module0749.UNPROVIDED) {
            var109 = (SubLObject)module0749.NIL;
        }
        if (var117 == module0749.UNPROVIDED) {
            var117 = (SubLObject)module0749.NIL;
        }
        if (var118 == module0749.UNPROVIDED) {
            var118 = module0751.f47200();
        }
        if (var119 == module0749.UNPROVIDED) {
            var119 = (SubLObject)ConsesLow.cons(module0749.$g5975$.getGlobalValue(), (SubLObject)module0749.NIL);
        }
        final SubLThread var120 = SubLProcess.currentSubLThread();
        final SubLObject var121 = module0743.f45994(var57);
        f46403(var121, var81);
        f46404(var121, var39);
        f46405(var121, var109);
        f46406(var121, var117);
        f46408(var121, var119);
        module0756.f47464(var57, var118);
        if (module0749.NIL == module0580.$g4365$.getDynamicValue(var120)) {
            if (module0749.NIL == module0580.$g4364$.getDynamicValue(var120)) {
                final SubLObject var122 = Sequences.cconcatenate((SubLObject)module0749.$ic35$, new SubLObject[] { module0006.f205((SubLObject)module0749.ONE_INTEGER), module0749.$ic36$, module0006.f203((SubLObject)module0749.$ic153$) });
                module0578.f35476(var122, (SubLObject)ConsesLow.list(var57));
            }
            module0580.f35564(var57);
        }
        return var57;
    }
    
    public static SubLObject f46422() {
        return module0749.$g5979$.getGlobalValue();
    }
    
    public static SubLObject f46497() {
        final SubLObject var120 = Sequences.length(module0749.$g5979$.getGlobalValue());
        final SubLObject var121 = module0749.$g5976$.getGlobalValue();
        return Vectors.make_vector(var120, var121);
    }
    
    public static SubLObject f46413(final SubLObject var15) {
        return f46402(module0743.f45994(var15)).first();
    }
    
    public static SubLObject f46419(final SubLObject var15, final SubLObject var121, SubLObject var72) {
        if (var72 == module0749.UNPROVIDED) {
            var72 = (SubLObject)module0749.NIL;
        }
        final SubLObject var122 = f46413(var15);
        return f46498(var122, var121, var72);
    }
    
    public static SubLObject f46423(final SubLObject var15, final SubLObject var121) {
        final SubLObject var122 = f46413(var15);
        return f46499(var122, var121);
    }
    
    public static SubLObject f46500(final SubLObject var15, final SubLObject var121) {
        f46425(var15, var121, module0749.$g5976$.getGlobalValue());
        return var121;
    }
    
    public static SubLObject f46498(final SubLObject var61, final SubLObject var121, final SubLObject var72) {
        final SubLObject var122 = f46499(var61, var121);
        return var122.eql(module0749.$g5976$.getGlobalValue()) ? var72 : var122;
    }
    
    public static SubLObject f46499(final SubLObject var61, final SubLObject var121) {
        assert module0749.NIL != f46414(var61) : var61;
        return var61.isVector() ? Vectors.aref(var61, var121) : module0749.$g5976$.getGlobalValue();
    }
    
    public static SubLObject f46425(final SubLObject var15, final SubLObject var121, final SubLObject var69) {
        SubLObject var122 = f46413(var15);
        if (!var122.isVector() && !var69.eql(module0749.$g5976$.getGlobalValue())) {
            var122 = f46497();
            ConsesLow.rplaca(f46402(module0743.f45994(var15)), var122);
        }
        if (var122.isVector()) {
            Vectors.set_aref(var122, var121, var69);
        }
        return var69;
    }
    
    public static SubLObject f46501() {
        return module0749.$g5980$.getGlobalValue();
    }
    
    public static SubLObject f46502() {
        return Hashtables.hash_table_size(module0065.f4738(module0749.$g5980$.getGlobalValue()));
    }
    
    public static SubLObject f46503() {
        return module0065.f4737(module0749.$g5980$.getGlobalValue());
    }
    
    public static SubLObject f46504(SubLObject var122) {
        if (var122 == module0749.UNPROVIDED) {
            var122 = (SubLObject)module0749.ZERO_INTEGER;
        }
        module0749.$g5980$.setGlobalValue(module0065.f4745(var122, (SubLObject)module0749.UNPROVIDED));
        return (SubLObject)module0749.NIL;
    }
    
    public static SubLObject f46505(final SubLObject var57, final SubLObject var114) {
        final SubLObject var115 = module0749.$g5981$.getGlobalValue();
        SubLObject var116 = (SubLObject)module0749.NIL;
        try {
            var116 = Locks.seize_lock(var115);
            module0065.f4753(f46501(), var114, var57);
        }
        finally {
            if (module0749.NIL != var116) {
                Locks.release_lock(var115);
            }
        }
        return var114;
    }
    
    public static SubLObject f46506(final SubLObject var114) {
        final SubLObject var115 = module0749.$g5981$.getGlobalValue();
        SubLObject var116 = (SubLObject)module0749.NIL;
        try {
            var116 = Locks.seize_lock(var115);
            module0065.f4761(f46501(), var114);
        }
        finally {
            if (module0749.NIL != var116) {
                Locks.release_lock(var115);
            }
        }
        return var114;
    }
    
    public static SubLObject f46507(SubLObject var127) {
        if (var127 == module0749.UNPROVIDED) {
            var127 = (SubLObject)module0749.T;
        }
        final SubLObject var128 = f46501();
        if (module0749.NIL != var127) {
            f46508();
        }
        final SubLObject var129 = module0749.$g5981$.getGlobalValue();
        SubLObject var130 = (SubLObject)module0749.NIL;
        try {
            var130 = Locks.seize_lock(var129);
            module0065.f4760(module0065.f4793(var128, (SubLObject)module0749.$ic158$), (SubLObject)module0749.UNPROVIDED);
        }
        finally {
            if (module0749.NIL != var130) {
                Locks.release_lock(var129);
            }
        }
        return var128;
    }
    
    public static SubLObject f46508() {
        final SubLThread var53 = SubLProcess.currentSubLThread();
        final SubLObject var54 = f46501();
        SubLObject var55 = (SubLObject)module0749.ZERO_INTEGER;
        SubLObject var56 = module0107.f7627();
        while (module0749.NIL != module0107.f7628(var56) || module0749.NIL != module0035.f2013(var56)) {
            final SubLObject var57 = module0749.$g5981$.getGlobalValue();
            SubLObject var58 = (SubLObject)module0749.NIL;
            try {
                var58 = Locks.seize_lock(var57);
                var56 = (SubLObject)module0749.NIL;
                final SubLObject var59 = var54;
                final SubLObject var60 = (SubLObject)module0749.$ic159$;
                final SubLObject var61 = module0065.f4733(var59);
                SubLObject var62 = (SubLObject)module0749.ZERO_INTEGER;
                assert module0749.NIL != Types.stringp(var60) : var60;
                final SubLObject var63 = module0012.$g75$.currentBinding(var53);
                final SubLObject var64 = module0012.$g76$.currentBinding(var53);
                final SubLObject var65 = module0012.$g77$.currentBinding(var53);
                final SubLObject var66 = module0012.$g78$.currentBinding(var53);
                try {
                    module0012.$g75$.bind((SubLObject)module0749.ZERO_INTEGER, var53);
                    module0012.$g76$.bind((SubLObject)module0749.NIL, var53);
                    module0012.$g77$.bind((SubLObject)module0749.T, var53);
                    module0012.$g78$.bind(Time.get_universal_time(), var53);
                    module0012.f478(var60);
                    final SubLObject var143_144 = var59;
                    if (module0749.NIL == module0065.f4772(var143_144, (SubLObject)module0749.$ic161$)) {
                        final SubLObject var145_146 = var143_144;
                        if (module0749.NIL == module0065.f4775(var145_146, (SubLObject)module0749.$ic161$)) {
                            final SubLObject var67 = module0065.f4740(var145_146);
                            final SubLObject var68 = (SubLObject)module0749.NIL;
                            SubLObject var69;
                            SubLObject var70;
                            SubLObject var71;
                            SubLObject var72;
                            for (var69 = Sequences.length(var67), var70 = (SubLObject)module0749.NIL, var70 = (SubLObject)module0749.ZERO_INTEGER; var70.numL(var69); var70 = Numbers.add(var70, (SubLObject)module0749.ONE_INTEGER)) {
                                var71 = ((module0749.NIL != var68) ? Numbers.subtract(var69, var70, (SubLObject)module0749.ONE_INTEGER) : var70);
                                var72 = Vectors.aref(var67, var71);
                                if (module0749.NIL == module0065.f4749(var72) || module0749.NIL == module0065.f4773((SubLObject)module0749.$ic161$)) {
                                    if (module0749.NIL != module0065.f4749(var72)) {
                                        var72 = (SubLObject)module0749.$ic161$;
                                    }
                                    module0012.note_percent_progress(var62, var61);
                                    var62 = Numbers.add(var62, (SubLObject)module0749.ONE_INTEGER);
                                    if (module0749.NIL == f46509(var72)) {
                                        var56 = (SubLObject)ConsesLow.cons(var71, var56);
                                    }
                                }
                            }
                        }
                        final SubLObject var151_152 = var143_144;
                        if (module0749.NIL == module0065.f4777(var151_152)) {
                            final SubLObject var73 = module0065.f4738(var151_152);
                            SubLObject var74 = (SubLObject)module0749.NIL;
                            SubLObject var75 = (SubLObject)module0749.NIL;
                            final Iterator var76 = Hashtables.getEntrySetIterator(var73);
                            try {
                                while (Hashtables.iteratorHasNext(var76)) {
                                    final Map.Entry var77 = Hashtables.iteratorNextEntry(var76);
                                    var74 = Hashtables.getEntryKey(var77);
                                    var75 = Hashtables.getEntryValue(var77);
                                    module0012.note_percent_progress(var62, var61);
                                    var62 = Numbers.add(var62, (SubLObject)module0749.ONE_INTEGER);
                                    if (module0749.NIL == f46509(var75)) {
                                        var56 = (SubLObject)ConsesLow.cons(var74, var56);
                                    }
                                }
                            }
                            finally {
                                Hashtables.releaseEntrySetIterator(var76);
                            }
                        }
                    }
                    module0012.f479();
                }
                finally {
                    module0012.$g78$.rebind(var66, var53);
                    module0012.$g77$.rebind(var65, var53);
                    module0012.$g76$.rebind(var64, var53);
                    module0012.$g75$.rebind(var63, var53);
                }
                SubLObject var78 = var56;
                SubLObject var79 = (SubLObject)module0749.NIL;
                var79 = var78.first();
                while (module0749.NIL != var78) {
                    module0065.f4761(var54, var79);
                    var55 = Numbers.add(var55, (SubLObject)module0749.ONE_INTEGER);
                    var78 = var78.rest();
                    var79 = var78.first();
                }
            }
            finally {
                if (module0749.NIL != var58) {
                    Locks.release_lock(var57);
                }
            }
        }
        if (var55.isPositive()) {
            Errors.warn((SubLObject)module0749.$ic162$, var55);
        }
        else {
            print_high.princ((SubLObject)module0749.$ic163$, (SubLObject)module0749.UNPROVIDED);
        }
        return var55;
    }
    
    public static SubLObject f46509(final SubLObject var28) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0749.NIL != module0756.f47497(var28, (SubLObject)module0749.UNPROVIDED) && module0749.$ic164$ != module0756.f47633(var28));
    }
    
    public static SubLObject f46510(final SubLObject var15, final SubLObject var114) {
        if (module0749.NIL != module0756.f47497(var15, (SubLObject)module0749.UNPROVIDED)) {
            module0756.f47622(var15, var114);
        }
        return var15;
    }
    
    public static SubLObject f46495() {
        final SubLObject var128 = f46501();
        return module0065.f4746(var128);
    }
    
    public static SubLObject f46371(final SubLObject var157) {
        assert module0749.NIL != Types.integerp(var157) : var157;
        return module0065.f4750(f46501(), var157, (SubLObject)module0749.UNPROVIDED);
    }
    
    public static SubLObject f46511() {
        return module0065.f4733(f46501());
    }
    
    public static SubLObject f46512(final SubLObject var57) {
        SubLObject var58 = (SubLObject)module0749.NIL;
        final SubLObject var59 = module0743.f45996(var57);
        final SubLObject var60 = (SubLObject)module0749.NIL;
        SubLObject var61;
        SubLObject var62;
        SubLObject var63;
        SubLObject var64;
        for (var61 = Sequences.length(var59), var62 = (SubLObject)module0749.NIL, var62 = (SubLObject)module0749.ZERO_INTEGER; var62.numL(var61); var62 = Numbers.add(var62, (SubLObject)module0749.ONE_INTEGER)) {
            var63 = ((module0749.NIL != var60) ? Numbers.subtract(var61, var62, (SubLObject)module0749.ONE_INTEGER) : var62);
            var64 = Vectors.aref(var59, var63);
            var58 = (SubLObject)ConsesLow.cons(module0756.f47475(var64), var58);
        }
        return Sequences.nreverse(var58);
    }
    
    public static SubLObject f46513(final SubLObject var161) {
        final SubLObject var162 = Vectors.make_vector(Sequences.length(var161), (SubLObject)module0749.UNPROVIDED);
        SubLObject var163 = (SubLObject)module0749.ZERO_INTEGER;
        SubLObject var164 = var161;
        SubLObject var165 = (SubLObject)module0749.NIL;
        var165 = var164.first();
        while (module0749.NIL != var164) {
            Vectors.set_aref(var162, var163, f46371(var165));
            var163 = Numbers.add(var163, (SubLObject)module0749.ONE_INTEGER);
            var164 = var164.rest();
            var165 = var164.first();
        }
        return var162;
    }
    
    public static SubLObject f46514(final SubLObject var57, final SubLObject var17) {
        module0021.f1038(module0743.f45992(var57), var17);
        module0021.f1038(module0743.f45993(var57), var17);
        module0021.f1038(module0743.f45995(var57), var17);
        module0021.f1038(f46512(var57), var17);
        module0021.f1038(module0743.f45997(var57), var17);
        module0021.f1038((SubLObject)((module0749.NIL != module0756.f47497(module0743.f45998(var57), (SubLObject)module0749.UNPROVIDED)) ? module0756.f47475(module0743.f45998(var57)) : module0749.NIL), var17);
        final SubLObject var58 = module0743.f45994(var57);
        module0021.f1038(f46397(var58), var17);
        module0021.f1038(f46398(var58), var17);
        module0021.f1038(f46399(var58), var17);
        module0021.f1038(f46400(var58), var17);
        module0021.f1038(f46401(var58), var17);
        module0021.f1038(f46402(var58), var17);
        return (SubLObject)module0749.NIL;
    }
    
    public static SubLObject f46515(final SubLObject var57, final SubLObject var17) {
        final SubLThread var58 = SubLProcess.currentSubLThread();
        final SubLObject var59 = module0021.f1060(var17, (SubLObject)module0749.UNPROVIDED, (SubLObject)module0749.UNPROVIDED);
        final SubLObject var60 = module0021.f1060(var17, (SubLObject)module0749.UNPROVIDED, (SubLObject)module0749.UNPROVIDED);
        final SubLObject var61 = module0021.f1060(var17, (SubLObject)module0749.UNPROVIDED, (SubLObject)module0749.UNPROVIDED);
        SubLObject var62 = module0021.f1060(var17, (SubLObject)module0749.UNPROVIDED, (SubLObject)module0749.UNPROVIDED);
        final SubLObject var63 = module0021.f1060(var17, (SubLObject)module0749.UNPROVIDED, (SubLObject)module0749.UNPROVIDED);
        SubLObject var64 = module0021.f1060(var17, (SubLObject)module0749.UNPROVIDED, (SubLObject)module0749.UNPROVIDED);
        final SubLObject var65 = module0021.f1060(var17, (SubLObject)module0749.UNPROVIDED, (SubLObject)module0749.UNPROVIDED);
        final SubLObject var66 = module0021.f1060(var17, (SubLObject)module0749.UNPROVIDED, (SubLObject)module0749.UNPROVIDED);
        final SubLObject var67 = module0021.f1060(var17, (SubLObject)module0749.UNPROVIDED, (SubLObject)module0749.UNPROVIDED);
        final SubLObject var68 = module0021.f1060(var17, (SubLObject)module0749.UNPROVIDED, (SubLObject)module0749.UNPROVIDED);
        final SubLObject var69 = module0021.f1060(var17, (SubLObject)module0749.UNPROVIDED, (SubLObject)module0749.UNPROVIDED);
        final SubLObject var70 = module0021.f1060(var17, (SubLObject)module0749.UNPROVIDED, (SubLObject)module0749.UNPROVIDED);
        final SubLObject var71 = module0580.$g4363$.currentBinding(var58);
        final SubLObject var72 = module0580.$g4366$.currentBinding(var58);
        final SubLObject var73 = module0580.$g4365$.currentBinding(var58);
        try {
            module0580.$g4363$.bind(module0054.f3968(), var58);
            module0580.$g4366$.bind((SubLObject)module0749.ZERO_INTEGER, var58);
            module0580.$g4365$.bind((SubLObject)module0749.T, var58);
            if (var64.isInteger()) {
                var64 = f46371(var64);
            }
            if (var62.isCons() && module0749.NIL != module0035.f2192((SubLObject)module0749.$ic165$, var62)) {
                var62 = f46513(var62);
            }
            module0743.f45999(var57, var59);
            module0743.f46000(var57, var60);
            module0743.f46002(var57, var61);
            module0743.f46003(var57, var62);
            module0743.f46004(var57, var63);
            module0743.f46005(var57, var64);
            f46496(var57, var65, var66, var67, var68, var69, var70);
        }
        finally {
            module0580.$g4365$.rebind(var73, var58);
            module0580.$g4366$.rebind(var72, var58);
            module0580.$g4363$.rebind(var71, var58);
        }
        return var57;
    }
    
    public static SubLObject f46516() {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0749.NIL == f46339() || module0749.NIL == module0770.f49099());
    }
    
    public static SubLObject f46517() {
        return module0770.f49101();
    }
    
    public static SubLObject f46518(final SubLObject var17) {
        module0021.f1038(module0749.$g5968$.getGlobalValue(), var17);
        return (SubLObject)module0749.NIL;
    }
    
    public static SubLObject f46519(final SubLObject var17) {
        module0749.$g5968$.setGlobalValue(module0021.f1060(var17, (SubLObject)module0749.UNPROVIDED, (SubLObject)module0749.UNPROVIDED));
        return (SubLObject)module0749.NIL;
    }
    
    public static SubLObject f46520(final SubLObject var16, final SubLObject var17) {
        f46521(var16, var17, (SubLObject)module0749.ZERO_INTEGER);
        return (SubLObject)module0749.NIL;
    }
    
    public static SubLObject f46522(final SubLObject var16) {
        return (SubLObject)((var16.getClass() == $sX50701_native.class) ? module0749.T : module0749.NIL);
    }
    
    public static SubLObject f46523(final SubLObject var16) {
        assert module0749.NIL != f46522(var16) : var16;
        return var16.getField2();
    }
    
    public static SubLObject f46524(final SubLObject var16) {
        assert module0749.NIL != f46522(var16) : var16;
        return var16.getField3();
    }
    
    public static SubLObject f46525(final SubLObject var16) {
        assert module0749.NIL != f46522(var16) : var16;
        return var16.getField4();
    }
    
    public static SubLObject f46526(final SubLObject var16) {
        assert module0749.NIL != f46522(var16) : var16;
        return var16.getField5();
    }
    
    public static SubLObject f46527(final SubLObject var16) {
        assert module0749.NIL != f46522(var16) : var16;
        return var16.getField6();
    }
    
    public static SubLObject f46528(final SubLObject var16) {
        assert module0749.NIL != f46522(var16) : var16;
        return var16.getField7();
    }
    
    public static SubLObject f46529(final SubLObject var16) {
        assert module0749.NIL != f46522(var16) : var16;
        return var16.getField8();
    }
    
    public static SubLObject f46530(final SubLObject var16) {
        assert module0749.NIL != f46522(var16) : var16;
        return var16.getField9();
    }
    
    public static SubLObject f46531(final SubLObject var16) {
        assert module0749.NIL != f46522(var16) : var16;
        return var16.getField10();
    }
    
    public static SubLObject f46532(final SubLObject var16) {
        assert module0749.NIL != f46522(var16) : var16;
        return var16.getField11();
    }
    
    public static SubLObject f46533(final SubLObject var16) {
        assert module0749.NIL != f46522(var16) : var16;
        return var16.getField12();
    }
    
    public static SubLObject f46534(final SubLObject var16) {
        assert module0749.NIL != f46522(var16) : var16;
        return var16.getField13();
    }
    
    public static SubLObject f46535(final SubLObject var16, final SubLObject var19) {
        assert module0749.NIL != f46522(var16) : var16;
        return var16.setField2(var19);
    }
    
    public static SubLObject f46536(final SubLObject var16, final SubLObject var19) {
        assert module0749.NIL != f46522(var16) : var16;
        return var16.setField3(var19);
    }
    
    public static SubLObject f46537(final SubLObject var16, final SubLObject var19) {
        assert module0749.NIL != f46522(var16) : var16;
        return var16.setField4(var19);
    }
    
    public static SubLObject f46538(final SubLObject var16, final SubLObject var19) {
        assert module0749.NIL != f46522(var16) : var16;
        return var16.setField5(var19);
    }
    
    public static SubLObject f46539(final SubLObject var16, final SubLObject var19) {
        assert module0749.NIL != f46522(var16) : var16;
        return var16.setField6(var19);
    }
    
    public static SubLObject f46540(final SubLObject var16, final SubLObject var19) {
        assert module0749.NIL != f46522(var16) : var16;
        return var16.setField7(var19);
    }
    
    public static SubLObject f46541(final SubLObject var16, final SubLObject var19) {
        assert module0749.NIL != f46522(var16) : var16;
        return var16.setField8(var19);
    }
    
    public static SubLObject f46542(final SubLObject var16, final SubLObject var19) {
        assert module0749.NIL != f46522(var16) : var16;
        return var16.setField9(var19);
    }
    
    public static SubLObject f46543(final SubLObject var16, final SubLObject var19) {
        assert module0749.NIL != f46522(var16) : var16;
        return var16.setField10(var19);
    }
    
    public static SubLObject f46544(final SubLObject var16, final SubLObject var19) {
        assert module0749.NIL != f46522(var16) : var16;
        return var16.setField11(var19);
    }
    
    public static SubLObject f46545(final SubLObject var16, final SubLObject var19) {
        assert module0749.NIL != f46522(var16) : var16;
        return var16.setField12(var19);
    }
    
    public static SubLObject f46546(final SubLObject var16, final SubLObject var19) {
        assert module0749.NIL != f46522(var16) : var16;
        return var16.setField13(var19);
    }
    
    public static SubLObject f46547(SubLObject var20) {
        if (var20 == module0749.UNPROVIDED) {
            var20 = (SubLObject)module0749.NIL;
        }
        final SubLObject var21 = (SubLObject)new $sX50701_native();
        SubLObject var22;
        SubLObject var23;
        SubLObject var24;
        SubLObject var25;
        for (var22 = (SubLObject)module0749.NIL, var22 = var20; module0749.NIL != var22; var22 = conses_high.cddr(var22)) {
            var23 = var22.first();
            var24 = conses_high.cadr(var22);
            var25 = var23;
            if (var25.eql((SubLObject)module0749.$ic199$)) {
                f46535(var21, var24);
            }
            else if (var25.eql((SubLObject)module0749.$ic200$)) {
                f46536(var21, var24);
            }
            else if (var25.eql((SubLObject)module0749.$ic201$)) {
                f46537(var21, var24);
            }
            else if (var25.eql((SubLObject)module0749.$ic202$)) {
                f46538(var21, var24);
            }
            else if (var25.eql((SubLObject)module0749.$ic203$)) {
                f46539(var21, var24);
            }
            else if (var25.eql((SubLObject)module0749.$ic204$)) {
                f46540(var21, var24);
            }
            else if (var25.eql((SubLObject)module0749.$ic205$)) {
                f46541(var21, var24);
            }
            else if (var25.eql((SubLObject)module0749.$ic206$)) {
                f46542(var21, var24);
            }
            else if (var25.eql((SubLObject)module0749.$ic207$)) {
                f46543(var21, var24);
            }
            else if (var25.eql((SubLObject)module0749.$ic208$)) {
                f46544(var21, var24);
            }
            else if (var25.eql((SubLObject)module0749.$ic209$)) {
                f46545(var21, var24);
            }
            else if (var25.eql((SubLObject)module0749.$ic94$)) {
                f46546(var21, var24);
            }
            else {
                Errors.error((SubLObject)module0749.$ic25$, var23);
            }
        }
        return var21;
    }
    
    public static SubLObject f46548(final SubLObject var26, final SubLObject var27) {
        Functions.funcall(var27, var26, (SubLObject)module0749.$ic26$, (SubLObject)module0749.$ic210$, (SubLObject)module0749.TWELVE_INTEGER);
        Functions.funcall(var27, var26, (SubLObject)module0749.$ic28$, (SubLObject)module0749.$ic199$, f46523(var26));
        Functions.funcall(var27, var26, (SubLObject)module0749.$ic28$, (SubLObject)module0749.$ic200$, f46524(var26));
        Functions.funcall(var27, var26, (SubLObject)module0749.$ic28$, (SubLObject)module0749.$ic201$, f46525(var26));
        Functions.funcall(var27, var26, (SubLObject)module0749.$ic28$, (SubLObject)module0749.$ic202$, f46526(var26));
        Functions.funcall(var27, var26, (SubLObject)module0749.$ic28$, (SubLObject)module0749.$ic203$, f46527(var26));
        Functions.funcall(var27, var26, (SubLObject)module0749.$ic28$, (SubLObject)module0749.$ic204$, f46528(var26));
        Functions.funcall(var27, var26, (SubLObject)module0749.$ic28$, (SubLObject)module0749.$ic205$, f46529(var26));
        Functions.funcall(var27, var26, (SubLObject)module0749.$ic28$, (SubLObject)module0749.$ic206$, f46530(var26));
        Functions.funcall(var27, var26, (SubLObject)module0749.$ic28$, (SubLObject)module0749.$ic207$, f46531(var26));
        Functions.funcall(var27, var26, (SubLObject)module0749.$ic28$, (SubLObject)module0749.$ic208$, f46532(var26));
        Functions.funcall(var27, var26, (SubLObject)module0749.$ic28$, (SubLObject)module0749.$ic209$, f46533(var26));
        Functions.funcall(var27, var26, (SubLObject)module0749.$ic28$, (SubLObject)module0749.$ic94$, f46534(var26));
        Functions.funcall(var27, var26, (SubLObject)module0749.$ic29$, (SubLObject)module0749.$ic210$, (SubLObject)module0749.TWELVE_INTEGER);
        return var26;
    }
    
    public static SubLObject f46549(final SubLObject var26, final SubLObject var27) {
        return f46548(var26, var27);
    }
    
    public static SubLObject f46521(final SubLObject var171, SubLObject var17, SubLObject var32) {
        if (var17 == module0749.UNPROVIDED) {
            var17 = (SubLObject)module0749.NIL;
        }
        if (var32 == module0749.UNPROVIDED) {
            var32 = (SubLObject)module0749.NIL;
        }
        PrintLow.format(var17, (SubLObject)module0749.$ic212$, f46523(var171));
        return var171;
    }
    
    public static SubLObject f46550(final SubLObject var171, final SubLObject var172, final SubLObject var173, final SubLObject var174, final SubLObject var175, final SubLObject var176, final SubLObject var118) {
        final SubLThread var177 = SubLProcess.currentSubLThread();
        f46535(var171, var172);
        f46536(var171, var176);
        f46537(var171, var173);
        f46538(var171, var174);
        f46539(var171, var175);
        f46540(var171, (SubLObject)module0749.NIL);
        f46541(var171, module0751.f46622());
        f46542(var171, (SubLObject)module0749.ZERO_INTEGER);
        SubLObject var178 = (SubLObject)module0749.NIL;
        try {
            var177.throwStack.push(module0749.$ic213$);
            final SubLObject var179 = Errors.$error_handler$.currentBinding(var177);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)module0749.$ic214$), var177);
                try {
                    f46546(var171, var118);
                }
                catch (Throwable var180) {
                    Errors.handleThrowable(var180, (SubLObject)module0749.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var179, var177);
            }
        }
        catch (Throwable var181) {
            var178 = Errors.handleThrowable(var181, (SubLObject)module0749.$ic213$);
        }
        finally {
            var177.throwStack.pop();
        }
        module0055.f4018(f46531(var171));
        module0055.f4018(f46532(var171));
        module0055.f4018(f46533(var171));
        module0763.f48353(var171);
        return var171;
    }
    
    public static SubLObject f46551(final SubLObject var171) {
        return f46528(var171);
    }
    
    public static SubLObject f46552(final SubLObject var172, SubLObject var173, SubLObject var174, SubLObject var175, SubLObject var118, SubLObject var176) {
        if (var173 == module0749.UNPROVIDED) {
            var173 = (SubLObject)module0749.NIL;
        }
        if (var174 == module0749.UNPROVIDED) {
            var174 = (SubLObject)module0749.NIL;
        }
        if (var175 == module0749.UNPROVIDED) {
            var175 = (SubLObject)module0749.$ic216$;
        }
        if (var118 == module0749.UNPROVIDED) {
            var118 = module0751.f46691();
        }
        if (var176 == module0749.UNPROVIDED) {
            var176 = module0579.$g4262$.getDynamicValue();
        }
        assert module0749.NIL != module0161.f10481(var176) : var176;
        SubLObject var177 = module0055.f4023(module0749.$g5983$.getGlobalValue());
        if (module0749.NIL == f46522(var177)) {
            if (module0749.NIL != module0578.f35470((SubLObject)module0749.ONE_INTEGER)) {
                PrintLow.format((SubLObject)module0749.T, (SubLObject)module0749.$ic218$);
            }
            var177 = f46547((SubLObject)ConsesLow.list((SubLObject)module0749.$ic207$, module0055.f4017(), (SubLObject)module0749.$ic208$, module0055.f4017(), (SubLObject)module0749.$ic209$, module0055.f4017()));
        }
        f46550(var177, var172, var173, var174, var175, var176, var118);
        return var177;
    }
    
    public static SubLObject f46553(final SubLObject var171) {
        f46535(var171, (SubLObject)module0749.$ic164$);
        f46536(var171, (SubLObject)module0749.$ic164$);
        f46537(var171, (SubLObject)module0749.$ic164$);
        f46538(var171, (SubLObject)module0749.$ic164$);
        f46539(var171, (SubLObject)module0749.$ic164$);
        f46540(var171, (SubLObject)module0749.$ic164$);
        f46541(var171, (SubLObject)module0749.$ic164$);
        f46542(var171, (SubLObject)module0749.$ic164$);
        module0055.f4018(f46531(var171));
        module0055.f4018(f46532(var171));
        module0055.f4018(f46533(var171));
        module0055.f4021(var171, module0749.$g5983$.getGlobalValue());
        if (module0749.NIL != module0578.f35470((SubLObject)module0749.TWO_INTEGER)) {
            PrintLow.format((SubLObject)module0749.T, (SubLObject)module0749.$ic219$, module0055.f4016(module0749.$g5983$.getGlobalValue()));
        }
        return var171;
    }
    
    public static SubLObject f46554(final SubLObject var16, final SubLObject var17) {
        f46555(var16, var17, (SubLObject)module0749.ZERO_INTEGER);
        return (SubLObject)module0749.NIL;
    }
    
    public static SubLObject f46556(final SubLObject var16) {
        return (SubLObject)((var16.getClass() == $sX50705_native.class) ? module0749.T : module0749.NIL);
    }
    
    public static SubLObject f46557(final SubLObject var16) {
        assert module0749.NIL != f46556(var16) : var16;
        return var16.getField2();
    }
    
    public static SubLObject f46558(final SubLObject var16, final SubLObject var19) {
        assert module0749.NIL != f46556(var16) : var16;
        return var16.setField2(var19);
    }
    
    public static SubLObject f46559(SubLObject var20) {
        if (var20 == module0749.UNPROVIDED) {
            var20 = (SubLObject)module0749.NIL;
        }
        final SubLObject var21 = (SubLObject)new $sX50705_native();
        SubLObject var22;
        SubLObject var23;
        SubLObject var24;
        SubLObject var25;
        for (var22 = (SubLObject)module0749.NIL, var22 = var20; module0749.NIL != var22; var22 = conses_high.cddr(var22)) {
            var23 = var22.first();
            var24 = conses_high.cadr(var22);
            var25 = var23;
            if (var25.eql((SubLObject)module0749.$ic231$)) {
                f46558(var21, var24);
            }
            else {
                Errors.error((SubLObject)module0749.$ic25$, var23);
            }
        }
        return var21;
    }
    
    public static SubLObject f46560(final SubLObject var26, final SubLObject var27) {
        Functions.funcall(var27, var26, (SubLObject)module0749.$ic26$, (SubLObject)module0749.$ic232$, (SubLObject)module0749.ONE_INTEGER);
        Functions.funcall(var27, var26, (SubLObject)module0749.$ic28$, (SubLObject)module0749.$ic231$, f46557(var26));
        Functions.funcall(var27, var26, (SubLObject)module0749.$ic29$, (SubLObject)module0749.$ic232$, (SubLObject)module0749.ONE_INTEGER);
        return var26;
    }
    
    public static SubLObject f46561(final SubLObject var26, final SubLObject var27) {
        return f46560(var26, var27);
    }
    
    public static SubLObject f46555(final SubLObject var183, SubLObject var17, SubLObject var32) {
        if (var17 == module0749.UNPROVIDED) {
            var17 = (SubLObject)module0749.NIL;
        }
        if (var32 == module0749.UNPROVIDED) {
            var32 = (SubLObject)module0749.NIL;
        }
        PrintLow.format(var17, (SubLObject)module0749.$ic234$);
        return var183;
    }
    
    public static SubLObject f46562(final SubLObject var117) {
        final SubLObject var118 = f46559((SubLObject)module0749.UNPROVIDED);
        final SubLObject var119 = module0055.f4017();
        SubLObject var120 = var117;
        SubLObject var121 = (SubLObject)module0749.NIL;
        var121 = var120.first();
        while (module0749.NIL != var120) {
            module0055.f4021(f46447(var121), var119);
            var120 = var120.rest();
            var121 = var120.first();
        }
        f46558(var118, var119);
        return var118;
    }
    
    public static SubLObject f46563(final SubLObject var183) {
        return module0055.f4019(f46557(var183));
    }
    
    public static SubLObject f46564(final SubLObject var183) {
        if (module0749.NIL != f46563(var183)) {
            final SubLObject var184 = Sequences.cconcatenate((SubLObject)module0749.$ic35$, new SubLObject[] { module0006.f205((SubLObject)module0749.ONE_INTEGER), module0749.$ic36$, module0006.f203((SubLObject)module0749.$ic235$) });
            module0578.f35476(var184, (SubLObject)ConsesLow.list(var183));
        }
        final SubLObject var185 = f46557(var183);
        final SubLObject var186 = module0055.f4030(var185);
        if (module0749.NIL != f46430(var186)) {
            module0055.f4023(var185);
            return var186;
        }
        if (module0749.NIL != f46448(var186)) {
            final SubLObject var187 = f46565(var186);
            if (module0749.NIL == f46459(var186)) {
                module0055.f4023(var185);
            }
            return var187;
        }
        if (module0749.NIL != f46450(var186)) {
            module0055.f4023(var185);
            return var186;
        }
        final SubLObject var188 = Sequences.cconcatenate((SubLObject)module0749.$ic35$, new SubLObject[] { module0006.f205((SubLObject)module0749.ONE_INTEGER), module0749.$ic36$, module0006.f203((SubLObject)module0749.$ic236$) });
        module0578.f35476(var188, (SubLObject)ConsesLow.list(var183));
        return (SubLObject)module0749.NIL;
    }
    
    public static SubLObject f46565(final SubLObject var188) {
        final SubLObject var189 = f46459(var188);
        final SubLObject var190 = var189.first();
        SubLObject var191 = var190.first();
        if (module0749.NIL != f46448(var191)) {
            final SubLObject var192 = f46565(var191);
            if (module0749.NIL == f46459(var191)) {
                f46566(var188);
            }
            var191 = var192;
        }
        else if (module0749.NIL != f46482(var191)) {
            f46566(var188);
        }
        if (module0749.NIL != f46430(var191)) {
            f46567(var191, var188);
        }
        return var191;
    }
    
    public static SubLObject f46566(final SubLObject var188) {
        final SubLObject var189 = f46459(var188);
        SubLObject var190 = var189.first();
        var190 = var190.rest();
        final SubLObject var191 = (SubLObject)((module0749.NIL == var190) ? var189.rest() : ConsesLow.cons(var190, var189.rest()));
        f46460(var188, var191);
        return var188;
    }
    
    public static SubLObject f46567(final SubLObject var84, final SubLObject var188) {
        if (module0749.NIL == module0756.f47694(f46466(var84))) {
            f46468(var84, f46467(var188));
            f46464(var84, f46463(var188));
        }
        final SubLObject var189 = f46474(var84);
        final SubLObject var190 = f46475(var188);
        final SubLObject var191 = var189.isString() ? (var190.isString() ? Sequences.cconcatenate(var190, var189) : var189) : var190;
        final SubLObject var192 = f46476(var84);
        final SubLObject var193 = f46477(var188);
        final SubLObject var194 = Types.sublisp_null(f46459(var188));
        final SubLObject var195 = (SubLObject)(var192.isString() ? ((var193.isString() && module0749.NIL != var194) ? Sequences.cconcatenate(var192, var193) : var192) : ((module0749.NIL != var194) ? var193 : module0749.NIL));
        f46480(var188, (SubLObject)module0749.NIL, var193);
        f46479(var84, var191, var195);
        return var84;
    }
    
    public static SubLObject f46568() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46336", "S#50707", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46337", "S#41512", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46338", "S#41510", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46339", "S#50708", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46340", "S#50709", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46341", "S#50710", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46342", "S#50711", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46343", "S#50712", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46344", "S#50713", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46345", "S#50714", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46346", "S#50715", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46347", "S#50716", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46349", "S#50717", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46351", "S#50673", 1, 0, false);
        new $f46351$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46352", "S#50718", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46353", "S#50719", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46354", "S#50720", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46355", "S#50721", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46356", "S#50722", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46357", "S#50723", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46358", "S#50724", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46359", "S#50725", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46360", "S#50726", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46361", "S#50674", 1, 0, false);
        new $f46361$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46362", "S#50727", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46350", "S#50728", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46363", "S#50729", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46364", "S#50730", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46348", "S#50731", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46365", "S#50732", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46366", "S#50676", 1, 0, false);
        new $f46366$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46367", "S#50733", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46368", "S#50734", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46369", "S#50735", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46370", "S#50677", 1, 0, false);
        new $f46370$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46372", "S#50736", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46374", "S#50678", 1, 0, false);
        new $f46374$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46375", "S#50737", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46376", "S#50738", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46377", "S#50739", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46378", "S#50740", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46379", "S#50741", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46380", "S#50742", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46381", "S#50743", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46373", "S#50744", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46382", "S#50745", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46383", "S#50746", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46384", "S#50747", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46385", "S#50748", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46386", "S#50749", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46387", "S#50750", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46388", "S#50751", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46389", "S#50752", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46390", "S#50753", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46391", "S#50754", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46392", "S#50755", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46393", "S#50686", 1, 0, false);
        new $f46393$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46394", "S#50756", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46396", "S#50688", 1, 0, false);
        new $f46396$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46397", "S#50757", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46398", "S#50758", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46399", "S#50759", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46400", "S#50760", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46401", "S#50761", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46402", "S#50762", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46403", "S#50763", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46404", "S#50764", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46405", "S#50765", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46406", "S#50766", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46407", "S#50767", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46408", "S#50768", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46409", "S#50769", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46410", "S#50770", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46411", "S#50771", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46412", "S#50772", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46415", "S#50773", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46414", "S#50774", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46416", "S#50775", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0749", "f46417", "S#50776");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46418", "S#50777", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46420", "S#50778", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46421", "S#50779", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46424", "S#50780", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46426", "S#50781", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46427", "S#50782", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46428", "S#50783", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46430", "S#50690", 1, 0, false);
        new $f46430$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46431", "S#50784", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46432", "S#50785", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46433", "S#50786", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46434", "S#50787", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46435", "S#50788", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46436", "S#50789", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46437", "S#50790", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46438", "S#50791", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46439", "S#50792", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46440", "S#50793", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46441", "S#50794", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46442", "S#50795", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46443", "S#50796", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46444", "S#50797", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46445", "S#50798", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46446", "S#50799", 0, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46447", "S#50800", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46429", "S#50801", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46455", "S#50691", 1, 0, false);
        new $f46455$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46457", "S#50802", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46458", "S#50803", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46461", "S#50804", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46462", "S#39276", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46464", "S#50805", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46466", "S#39279", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46468", "S#50806", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46470", "S#50807", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46472", "S#50808", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46474", "S#39277", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46476", "S#39278", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46478", "S#50809", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46479", "S#50810", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46481", "S#50811", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46483", "S#50812", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46484", "S#50813", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46485", "S#50814", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46448", "S#50815", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46459", "S#50816", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46460", "S#50817", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46456", "S#50818", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46486", "S#50819", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46449", "S#50820", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46463", "S#50821", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46465", "S#50822", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46467", "S#50823", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46469", "S#50824", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46471", "S#50825", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46473", "S#50826", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46480", "S#50827", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46475", "S#50828", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46477", "S#50829", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46482", "S#50692", 1, 0, false);
        new $f46482$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46450", "S#50830", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46451", "S#50831", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46452", "S#50832", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46453", "S#50833", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46454", "S#50834", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46487", "S#50835", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46488", "S#50836", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46489", "S#50837", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46490", "S#50838", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46491", "S#50693", 1, 0, false);
        new $f46491$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46395", "S#50839", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46492", "S#50840", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46493", "S#41500", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46494", "S#39101", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46496", "S#50841", 3, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46422", "S#50842", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46497", "S#50843", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46413", "S#50844", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46419", "S#50845", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46423", "S#50846", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46500", "S#50847", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46498", "S#50848", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46499", "S#50849", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46425", "S#50850", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46501", "S#41497", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46502", "S#39067", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46503", "S#39066", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46504", "S#41499", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46505", "S#50851", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46506", "S#50852", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46507", "S#41509", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46508", "S#50853", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46509", "S#50854", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46510", "S#50855", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46495", "S#50856", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46371", "S#41502", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46511", "S#41496", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46512", "S#50857", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46513", "S#50858", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46514", "S#41501", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46515", "S#41503", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46516", "S#50859", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46517", "S#50860", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46518", "S#41504", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46519", "S#41505", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46520", "S#50861", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46522", "S#50702", 1, 0, false);
        new $f46522$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46523", "S#50862", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46524", "S#50863", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46525", "S#50864", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46526", "S#50865", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46527", "S#50866", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46528", "S#50867", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46529", "S#50868", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46530", "S#50869", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46531", "S#50870", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46532", "S#50871", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46533", "S#50872", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46534", "S#50873", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46535", "S#50874", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46536", "S#50875", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46537", "S#50876", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46538", "S#50877", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46539", "S#50878", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46540", "S#50879", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46541", "S#50880", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46542", "S#50881", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46543", "S#50882", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46544", "S#50883", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46545", "S#50884", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46546", "S#50885", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46547", "S#50886", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46548", "S#50887", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46549", "S#50888", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46521", "S#50889", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46550", "S#50890", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46551", "S#39311", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46552", "S#39310", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46553", "S#39313", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46554", "S#50891", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46556", "S#50706", 1, 0, false);
        new $f46556$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46557", "S#50892", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46558", "S#50893", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46559", "S#50894", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46560", "S#50895", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46561", "S#50896", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46555", "S#50897", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46562", "S#39268", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46563", "S#39269", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46564", "S#39270", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46565", "S#50898", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46566", "S#50899", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0749", "f46567", "S#50900", 2, 0, false);
        return (SubLObject)module0749.NIL;
    }
    
    public static SubLObject f46569() {
        module0749.$g5967$ = SubLFiles.deflexical("S#50901", (SubLObject)module0749.$ic1$);
        module0749.$g5968$ = SubLFiles.deflexical("S#50902", (module0749.NIL != Symbols.boundp((SubLObject)module0749.$ic2$)) ? module0749.$g5968$.getGlobalValue() : module0067.f4880(Symbols.symbol_function((SubLObject)module0749.EQ), module0749.$g5967$.getGlobalValue()));
        module0749.$g5969$ = SubLFiles.deflexical("S#50903", (SubLObject)((module0749.NIL != Symbols.boundp((SubLObject)module0749.$ic3$)) ? module0749.$g5969$.getGlobalValue() : module0749.NIL));
        module0749.$g5970$ = SubLFiles.defconstant("S#50904", (SubLObject)module0749.$ic7$);
        module0749.$g5971$ = SubLFiles.defconstant("S#50905", (SubLObject)module0749.$ic39$);
        module0749.$g5972$ = SubLFiles.defconstant("S#50906", (SubLObject)module0749.$ic42$);
        module0749.$g5973$ = SubLFiles.defconstant("S#50907", (SubLObject)module0749.$ic65$);
        module0749.$g5974$ = SubLFiles.defconstant("S#50908", (SubLObject)module0749.$ic69$);
        module0749.$g5975$ = SubLFiles.deflexical("S#50909", (SubLObject)module0749.$ic98$);
        module0749.$g5977$ = SubLFiles.defconstant("S#50910", (SubLObject)module0749.$ic105$);
        module0749.$g5978$ = SubLFiles.defconstant("S#50911", (SubLObject)module0749.$ic145$);
        module0749.$g5979$ = SubLFiles.deflexical("S#50912", (SubLObject)module0749.$ic154$);
        module0749.$g5976$ = SubLFiles.deflexical("S#50913", (SubLObject)Characters.CHAR_vertical);
        module0749.$g5980$ = SubLFiles.deflexical("S#50914", (module0749.NIL != Symbols.boundp((SubLObject)module0749.$ic156$)) ? module0749.$g5980$.getGlobalValue() : module0065.f4745((SubLObject)module0749.UNPROVIDED, (SubLObject)module0749.UNPROVIDED));
        module0749.$g5981$ = SubLFiles.deflexical("S#50915", Locks.make_lock((SubLObject)module0749.$ic157$));
        module0749.$g5982$ = SubLFiles.defconstant("S#50916", (SubLObject)module0749.$ic166$);
        module0749.$g5983$ = SubLFiles.deflexical("S#50917", (module0749.NIL != Symbols.boundp((SubLObject)module0749.$ic215$)) ? module0749.$g5983$.getGlobalValue() : module0055.f4017());
        module0749.$g5984$ = SubLFiles.defconstant("S#50918", (SubLObject)module0749.$ic220$);
        return (SubLObject)module0749.NIL;
    }
    
    public static SubLObject f46570() {
        module0579.$g4319$.setGlobalValue((SubLObject)module0749.$ic0$);
        module0003.f57((SubLObject)module0749.$ic2$);
        module0003.f57((SubLObject)module0749.$ic3$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0749.$g5970$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0749.$ic14$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0749.$ic15$);
        Structures.def_csetf((SubLObject)module0749.$ic16$, (SubLObject)module0749.$ic17$);
        Structures.def_csetf((SubLObject)module0749.$ic18$, (SubLObject)module0749.$ic19$);
        Structures.def_csetf((SubLObject)module0749.$ic20$, (SubLObject)module0749.$ic21$);
        Equality.identity((SubLObject)module0749.$ic7$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0749.$g5970$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0749.$ic30$));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), module0749.$g5970$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0749.$ic31$));
        module0021.f1098(module0749.$g5971$.getGlobalValue(), (SubLObject)module0749.$ic40$);
        Structures.register_method(module0021.$g749$.getGlobalValue(), module0749.$g5970$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0749.$ic41$));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0749.$g5972$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0749.$ic49$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0749.$ic50$);
        Structures.def_csetf((SubLObject)module0749.$ic51$, (SubLObject)module0749.$ic52$);
        Structures.def_csetf((SubLObject)module0749.$ic53$, (SubLObject)module0749.$ic54$);
        Equality.identity((SubLObject)module0749.$ic42$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0749.$g5972$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0749.$ic58$));
        module0021.f1098(module0749.$g5973$.getGlobalValue(), (SubLObject)module0749.$ic66$);
        Structures.register_method(module0021.$g749$.getGlobalValue(), module0749.$g5972$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0749.$ic67$));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0749.$g5974$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0749.$ic76$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0749.$ic77$);
        Structures.def_csetf((SubLObject)module0749.$ic78$, (SubLObject)module0749.$ic79$);
        Structures.def_csetf((SubLObject)module0749.$ic80$, (SubLObject)module0749.$ic81$);
        Structures.def_csetf((SubLObject)module0749.$ic82$, (SubLObject)module0749.$ic83$);
        Structures.def_csetf((SubLObject)module0749.$ic84$, (SubLObject)module0749.$ic85$);
        Structures.def_csetf((SubLObject)module0749.$ic86$, (SubLObject)module0749.$ic87$);
        Structures.def_csetf((SubLObject)module0749.$ic88$, (SubLObject)module0749.$ic89$);
        Equality.identity((SubLObject)module0749.$ic69$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0749.$g5974$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0749.$ic97$));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0749.$g5977$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0749.$ic112$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0749.$ic113$);
        Structures.def_csetf((SubLObject)module0749.$ic114$, (SubLObject)module0749.$ic115$);
        Structures.def_csetf((SubLObject)module0749.$ic116$, (SubLObject)module0749.$ic117$);
        Structures.def_csetf((SubLObject)module0749.$ic118$, (SubLObject)module0749.$ic119$);
        Structures.def_csetf((SubLObject)module0749.$ic120$, (SubLObject)module0749.$ic121$);
        Structures.def_csetf((SubLObject)module0749.$ic122$, (SubLObject)module0749.$ic123$);
        Structures.def_csetf((SubLObject)module0749.$ic124$, (SubLObject)module0749.$ic125$);
        Equality.identity((SubLObject)module0749.$ic105$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0749.$g5977$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0749.$ic131$));
        module0021.f1098(module0749.$g5978$.getGlobalValue(), (SubLObject)module0749.$ic146$);
        Structures.register_method(module0021.$g749$.getGlobalValue(), module0749.$g5977$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0749.$ic147$));
        module0003.f57((SubLObject)module0749.$ic156$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0749.$g5982$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0749.$ic173$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0749.$ic174$);
        Structures.def_csetf((SubLObject)module0749.$ic175$, (SubLObject)module0749.$ic176$);
        Structures.def_csetf((SubLObject)module0749.$ic177$, (SubLObject)module0749.$ic178$);
        Structures.def_csetf((SubLObject)module0749.$ic179$, (SubLObject)module0749.$ic180$);
        Structures.def_csetf((SubLObject)module0749.$ic181$, (SubLObject)module0749.$ic182$);
        Structures.def_csetf((SubLObject)module0749.$ic183$, (SubLObject)module0749.$ic184$);
        Structures.def_csetf((SubLObject)module0749.$ic185$, (SubLObject)module0749.$ic186$);
        Structures.def_csetf((SubLObject)module0749.$ic187$, (SubLObject)module0749.$ic188$);
        Structures.def_csetf((SubLObject)module0749.$ic189$, (SubLObject)module0749.$ic190$);
        Structures.def_csetf((SubLObject)module0749.$ic191$, (SubLObject)module0749.$ic192$);
        Structures.def_csetf((SubLObject)module0749.$ic193$, (SubLObject)module0749.$ic194$);
        Structures.def_csetf((SubLObject)module0749.$ic195$, (SubLObject)module0749.$ic196$);
        Structures.def_csetf((SubLObject)module0749.$ic197$, (SubLObject)module0749.$ic198$);
        Equality.identity((SubLObject)module0749.$ic166$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0749.$g5982$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0749.$ic211$));
        module0003.f57((SubLObject)module0749.$ic215$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0749.$g5984$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0749.$ic227$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0749.$ic228$);
        Structures.def_csetf((SubLObject)module0749.$ic229$, (SubLObject)module0749.$ic230$);
        Equality.identity((SubLObject)module0749.$ic220$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0749.$g5984$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0749.$ic233$));
        return (SubLObject)module0749.NIL;
    }
    
    public void declareFunctions() {
        f46568();
    }
    
    public void initializeVariables() {
        f46569();
    }
    
    public void runTopLevelForms() {
        f46570();
    }
    
    static {
        me = (SubLFile)new module0749();
        module0749.$g5967$ = null;
        module0749.$g5968$ = null;
        module0749.$g5969$ = null;
        module0749.$g5970$ = null;
        module0749.$g5971$ = null;
        module0749.$g5972$ = null;
        module0749.$g5973$ = null;
        module0749.$g5974$ = null;
        module0749.$g5975$ = null;
        module0749.$g5977$ = null;
        module0749.$g5978$ = null;
        module0749.$g5979$ = null;
        module0749.$g5976$ = null;
        module0749.$g5980$ = null;
        module0749.$g5981$ = null;
        module0749.$g5982$ = null;
        module0749.$g5983$ = null;
        module0749.$g5984$ = null;
        $ic0$ = SubLObjectFactory.makeString("$Revision: 140335 $");
        $ic1$ = SubLObjectFactory.makeInteger(12000);
        $ic2$ = SubLObjectFactory.makeSymbol("S#50902", "CYC");
        $ic3$ = SubLObjectFactory.makeSymbol("S#50903", "CYC");
        $ic4$ = SubLObjectFactory.makeKeyword("INITIALIZED");
        $ic5$ = SubLObjectFactory.makeKeyword("ENTERED");
        $ic6$ = SubLObjectFactory.makeKeyword("CLEARED");
        $ic7$ = SubLObjectFactory.makeSymbol("S#50672", "CYC");
        $ic8$ = SubLObjectFactory.makeSymbol("S#50673", "CYC");
        $ic9$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39298", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#43350", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC"));
        $ic10$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PHRASE"), (SubLObject)SubLObjectFactory.makeKeyword("CONSTRAINT"), (SubLObject)SubLObjectFactory.makeKeyword("ASSERTION"));
        $ic11$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#50718", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#50719", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#50720", "CYC"));
        $ic12$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#50721", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#50722", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#50723", "CYC"));
        $ic13$ = SubLObjectFactory.makeSymbol("S#50728", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("S#50717", "CYC");
        $ic15$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#50673", "CYC"));
        $ic16$ = SubLObjectFactory.makeSymbol("S#50718", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("S#50721", "CYC");
        $ic18$ = SubLObjectFactory.makeSymbol("S#50719", "CYC");
        $ic19$ = SubLObjectFactory.makeSymbol("S#50722", "CYC");
        $ic20$ = SubLObjectFactory.makeSymbol("S#50720", "CYC");
        $ic21$ = SubLObjectFactory.makeSymbol("S#50723", "CYC");
        $ic22$ = SubLObjectFactory.makeKeyword("PHRASE");
        $ic23$ = SubLObjectFactory.makeKeyword("CONSTRAINT");
        $ic24$ = SubLObjectFactory.makeKeyword("ASSERTION");
        $ic25$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic26$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic27$ = SubLObjectFactory.makeSymbol("S#50724", "CYC");
        $ic28$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic29$ = SubLObjectFactory.makeKeyword("END");
        $ic30$ = SubLObjectFactory.makeSymbol("S#50726", "CYC");
        $ic31$ = SubLObjectFactory.makeSymbol("S#50674", "CYC");
        $ic32$ = SubLObjectFactory.makeSymbol("S#39064", "CYC");
        $ic33$ = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $ic34$ = SubLObjectFactory.makeString("#<GEN-TEMPLATE ~S>");
        $ic35$ = SubLObjectFactory.makeString("(PPH error level ");
        $ic36$ = SubLObjectFactory.makeString(") ");
        $ic37$ = SubLObjectFactory.makeString("Can't get assertion from ~S~% Found ~S");
        $ic38$ = SubLObjectFactory.makeString("Can't get mt from ~S~% Found ~S");
        $ic39$ = SubLObjectFactory.makeInteger(72);
        $ic40$ = SubLObjectFactory.makeSymbol("S#50677", "CYC");
        $ic41$ = SubLObjectFactory.makeSymbol("S#50734", "CYC");
        $ic42$ = SubLObjectFactory.makeSymbol("S#39306", "CYC");
        $ic43$ = SubLObjectFactory.makeSymbol("S#50678", "CYC");
        $ic44$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#50919", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#50920", "CYC"));
        $ic45$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ABSOLUTE-CONSTRAINT"), (SubLObject)SubLObjectFactory.makeKeyword("RELATIVE-CONSTRAINT"));
        $ic46$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#50737", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#50738", "CYC"));
        $ic47$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#50739", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#50740", "CYC"));
        $ic48$ = SubLObjectFactory.makeSymbol("S#50744", "CYC");
        $ic49$ = SubLObjectFactory.makeSymbol("S#50736", "CYC");
        $ic50$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#50678", "CYC"));
        $ic51$ = SubLObjectFactory.makeSymbol("S#50737", "CYC");
        $ic52$ = SubLObjectFactory.makeSymbol("S#50739", "CYC");
        $ic53$ = SubLObjectFactory.makeSymbol("S#50738", "CYC");
        $ic54$ = SubLObjectFactory.makeSymbol("S#50740", "CYC");
        $ic55$ = SubLObjectFactory.makeKeyword("ABSOLUTE-CONSTRAINT");
        $ic56$ = SubLObjectFactory.makeKeyword("RELATIVE-CONSTRAINT");
        $ic57$ = SubLObjectFactory.makeSymbol("S#50741", "CYC");
        $ic58$ = SubLObjectFactory.makeSymbol("S#50743", "CYC");
        $ic59$ = SubLObjectFactory.makeString("<AGR");
        $ic60$ = SubLObjectFactory.makeString(" (~S ");
        $ic61$ = SubLObjectFactory.makeString("<PPH-PHRASE ~A [...]>");
        $ic62$ = SubLObjectFactory.makeString("~A");
        $ic63$ = SubLObjectFactory.makeString(")");
        $ic64$ = SubLObjectFactory.makeString(">");
        $ic65$ = SubLObjectFactory.makeInteger(73);
        $ic66$ = SubLObjectFactory.makeSymbol("S#50686", "CYC");
        $ic67$ = SubLObjectFactory.makeSymbol("S#50754", "CYC");
        $ic68$ = SubLObjectFactory.makeString("Could not find pph-phrase with suid ~A");
        $ic69$ = SubLObjectFactory.makeSymbol("S#50687", "CYC");
        $ic70$ = SubLObjectFactory.makeSymbol("S#50688", "CYC");
        $ic71$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#42702", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#50921", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#14271", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#39260", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#39307", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#50922", "CYC"));
        $ic72$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CYCL"), (SubLObject)SubLObjectFactory.makeKeyword("AGR"), (SubLObject)SubLObjectFactory.makeKeyword("JUSTIFICATION"), (SubLObject)SubLObjectFactory.makeKeyword("OUTPUT-LIST"), (SubLObject)SubLObjectFactory.makeKeyword("ARG-POSITION-MAP"), (SubLObject)SubLObjectFactory.makeKeyword("OTHER"));
        $ic73$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#50757", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#50758", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#50759", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#50760", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#50761", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#50762", "CYC"));
        $ic74$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#50763", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#50764", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#50765", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#50766", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#50767", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#50768", "CYC"));
        $ic75$ = SubLObjectFactory.makeSymbol("S#50839", "CYC");
        $ic76$ = SubLObjectFactory.makeSymbol("S#50756", "CYC");
        $ic77$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#50688", "CYC"));
        $ic78$ = SubLObjectFactory.makeSymbol("S#50757", "CYC");
        $ic79$ = SubLObjectFactory.makeSymbol("S#50763", "CYC");
        $ic80$ = SubLObjectFactory.makeSymbol("S#50758", "CYC");
        $ic81$ = SubLObjectFactory.makeSymbol("S#50764", "CYC");
        $ic82$ = SubLObjectFactory.makeSymbol("S#50759", "CYC");
        $ic83$ = SubLObjectFactory.makeSymbol("S#50765", "CYC");
        $ic84$ = SubLObjectFactory.makeSymbol("S#50760", "CYC");
        $ic85$ = SubLObjectFactory.makeSymbol("S#50766", "CYC");
        $ic86$ = SubLObjectFactory.makeSymbol("S#50761", "CYC");
        $ic87$ = SubLObjectFactory.makeSymbol("S#50767", "CYC");
        $ic88$ = SubLObjectFactory.makeSymbol("S#50762", "CYC");
        $ic89$ = SubLObjectFactory.makeSymbol("S#50768", "CYC");
        $ic90$ = SubLObjectFactory.makeKeyword("CYCL");
        $ic91$ = SubLObjectFactory.makeKeyword("AGR");
        $ic92$ = SubLObjectFactory.makeKeyword("JUSTIFICATION");
        $ic93$ = SubLObjectFactory.makeKeyword("OUTPUT-LIST");
        $ic94$ = SubLObjectFactory.makeKeyword("ARG-POSITION-MAP");
        $ic95$ = SubLObjectFactory.makeKeyword("OTHER");
        $ic96$ = SubLObjectFactory.makeSymbol("S#50769", "CYC");
        $ic97$ = SubLObjectFactory.makeSymbol("S#50771", "CYC");
        $ic98$ = SubLObjectFactory.makeKeyword("PPH-EMPTY-INFO-VECTOR");
        $ic99$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#137", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#39298", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic100$ = SubLObjectFactory.makeUninternedSymbol("US#332AAC2");
        $ic101$ = SubLObjectFactory.makeSymbol("CLET");
        $ic102$ = SubLObjectFactory.makeSymbol("S#50775", "CYC");
        $ic103$ = SubLObjectFactory.makeSymbol("DO-PLIST");
        $ic104$ = SubLObjectFactory.makeString("~S should be ~S, not ~S");
        $ic105$ = SubLObjectFactory.makeSymbol("S#50689", "CYC");
        $ic106$ = SubLObjectFactory.makeSymbol("S#50690", "CYC");
        $ic107$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("S#33826", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#42702", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#39263", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#39264", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#50921", "CYC"));
        $ic108$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("STRING"), (SubLObject)SubLObjectFactory.makeKeyword("ARG-POSITION"), (SubLObject)SubLObjectFactory.makeKeyword("CYCL"), (SubLObject)SubLObjectFactory.makeKeyword("HTML-OPEN-TAG"), (SubLObject)SubLObjectFactory.makeKeyword("HTML-CLOSE-TAG"), (SubLObject)SubLObjectFactory.makeKeyword("AGR"));
        $ic109$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#50784", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#50785", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#50786", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#50787", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#50788", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#50789", "CYC"));
        $ic110$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#50790", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#50791", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#50792", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#50793", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#50794", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#50795", "CYC"));
        $ic111$ = SubLObjectFactory.makeSymbol("S#50801", "CYC");
        $ic112$ = SubLObjectFactory.makeSymbol("S#50783", "CYC");
        $ic113$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#50690", "CYC"));
        $ic114$ = SubLObjectFactory.makeSymbol("S#50784", "CYC");
        $ic115$ = SubLObjectFactory.makeSymbol("S#50790", "CYC");
        $ic116$ = SubLObjectFactory.makeSymbol("S#50785", "CYC");
        $ic117$ = SubLObjectFactory.makeSymbol("S#50791", "CYC");
        $ic118$ = SubLObjectFactory.makeSymbol("S#50786", "CYC");
        $ic119$ = SubLObjectFactory.makeSymbol("S#50792", "CYC");
        $ic120$ = SubLObjectFactory.makeSymbol("S#50787", "CYC");
        $ic121$ = SubLObjectFactory.makeSymbol("S#50793", "CYC");
        $ic122$ = SubLObjectFactory.makeSymbol("S#50788", "CYC");
        $ic123$ = SubLObjectFactory.makeSymbol("S#50794", "CYC");
        $ic124$ = SubLObjectFactory.makeSymbol("S#50789", "CYC");
        $ic125$ = SubLObjectFactory.makeSymbol("S#50795", "CYC");
        $ic126$ = SubLObjectFactory.makeKeyword("STRING");
        $ic127$ = SubLObjectFactory.makeKeyword("ARG-POSITION");
        $ic128$ = SubLObjectFactory.makeKeyword("HTML-OPEN-TAG");
        $ic129$ = SubLObjectFactory.makeKeyword("HTML-CLOSE-TAG");
        $ic130$ = SubLObjectFactory.makeSymbol("S#50796", "CYC");
        $ic131$ = SubLObjectFactory.makeSymbol("S#50798", "CYC");
        $ic132$ = SubLObjectFactory.makeSymbol("S#39070", "CYC");
        $ic133$ = SubLObjectFactory.makeString("<PPH-OI ~S ~S ~S ~S ~S ~S>~%");
        $ic134$ = SubLObjectFactory.makeString("~S is a forbidden paraphrase for ~S");
        $ic135$ = SubLObjectFactory.makeSymbol("S#50692", "CYC");
        $ic136$ = SubLObjectFactory.makeSymbol("LIST");
        $ic137$ = SubLObjectFactory.makeKeyword("NOSPACE");
        $ic138$ = SubLObjectFactory.makeSymbol("S#39267", "CYC");
        $ic139$ = SubLObjectFactory.makeString("");
        $ic140$ = SubLObjectFactory.makeSymbol("S#50800", "CYC");
        $ic141$ = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $ic142$ = SubLObjectFactory.makeSymbol("LISTP");
        $ic143$ = SubLObjectFactory.makeString("Can't make nested enhanced output item.");
        $ic144$ = SubLObjectFactory.makeSymbol("S#50830", "CYC");
        $ic145$ = SubLObjectFactory.makeInteger(74);
        $ic146$ = SubLObjectFactory.makeSymbol("S#50693", "CYC");
        $ic147$ = SubLObjectFactory.makeSymbol("S#50837", "CYC");
        $ic148$ = SubLObjectFactory.makeString("~S ~S");
        $ic149$ = SubLObjectFactory.makeInteger(500000);
        $ic150$ = SubLObjectFactory.makeInteger(200000);
        $ic151$ = SubLObjectFactory.makeInteger(50000);
        $ic152$ = SubLObjectFactory.makeString("new PPH phrase limit of ~S exceeded.");
        $ic153$ = SubLObjectFactory.makeString("New PPH phrase not expected to be destroyed: ~S");
        $ic154$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("CASE"), SubLObjectFactory.makeKeyword("RESERVED-FOR-MATRIX-ARG0"), SubLObjectFactory.makeKeyword("ALTERNATIVES"), SubLObjectFactory.makeKeyword("LINK-CYCL"), SubLObjectFactory.makeKeyword("WU"), SubLObjectFactory.makeKeyword("HEAD-DTR-NUM"), SubLObjectFactory.makeKeyword("NON-LOCAL-FEATURES-IGNORED?"), SubLObjectFactory.makeKeyword("DONE?"), SubLObjectFactory.makeKeyword("QUERY-EL-FORMULA"), SubLObjectFactory.makeKeyword("SPECIAL-TYPE"), SubLObjectFactory.makeKeyword("DEMERITS") });
        $ic155$ = SubLObjectFactory.makeSymbol("S#50774", "CYC");
        $ic156$ = SubLObjectFactory.makeSymbol("S#50914", "CYC");
        $ic157$ = SubLObjectFactory.makeString("PPH phrase ID index");
        $ic158$ = SubLObjectFactory.makeSymbol("S#50694", "CYC");
        $ic159$ = SubLObjectFactory.makeString("Removing invalid PPH phrases");
        $ic160$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic161$ = SubLObjectFactory.makeKeyword("SKIP");
        $ic162$ = SubLObjectFactory.makeString("Removed ~S items from *PPH-PHRASE-ID-INDEX* that failed VALID-PPH-PHRASE-P test.");
        $ic163$ = SubLObjectFactory.makeString("Found no invalid PPH phrases.");
        $ic164$ = SubLObjectFactory.makeKeyword("FREE");
        $ic165$ = SubLObjectFactory.makeSymbol("INTEGERP");
        $ic166$ = SubLObjectFactory.makeSymbol("S#50701", "CYC");
        $ic167$ = SubLObjectFactory.makeSymbol("S#50702", "CYC");
        $ic168$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#6061", "CYC"), SubLObjectFactory.makeSymbol("S#11445", "CYC"), SubLObjectFactory.makeSymbol("S#39315", "CYC"), SubLObjectFactory.makeSymbol("S#50923", "CYC"), SubLObjectFactory.makeSymbol("S#39308", "CYC"), SubLObjectFactory.makeSymbol("S#15403", "CYC"), SubLObjectFactory.makeSymbol("S#50924", "CYC"), SubLObjectFactory.makeSymbol("S#50925", "CYC"), SubLObjectFactory.makeSymbol("S#50926", "CYC"), SubLObjectFactory.makeSymbol("S#50927", "CYC"), SubLObjectFactory.makeSymbol("S#50928", "CYC"), SubLObjectFactory.makeSymbol("S#39307", "CYC") });
        $ic169$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("FORMULA"), SubLObjectFactory.makeKeyword("MT"), SubLObjectFactory.makeKeyword("FOCUS-ARG"), SubLObjectFactory.makeKeyword("SPECIFIED-RELN"), SubLObjectFactory.makeKeyword("NL-PREDS"), SubLObjectFactory.makeKeyword("DONE?"), SubLObjectFactory.makeKeyword("SEARCH-LIMIT"), SubLObjectFactory.makeKeyword("SEARCH-LEVEL"), SubLObjectFactory.makeKeyword("RELNS-TO-USE"), SubLObjectFactory.makeKeyword("GEN-TEMPLATE-SETS"), SubLObjectFactory.makeKeyword("GEN-TEMPLATES"), SubLObjectFactory.makeKeyword("ARG-POSITION-MAP") });
        $ic170$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#50862", "CYC"), SubLObjectFactory.makeSymbol("S#50863", "CYC"), SubLObjectFactory.makeSymbol("S#50864", "CYC"), SubLObjectFactory.makeSymbol("S#50865", "CYC"), SubLObjectFactory.makeSymbol("S#50866", "CYC"), SubLObjectFactory.makeSymbol("S#50867", "CYC"), SubLObjectFactory.makeSymbol("S#50868", "CYC"), SubLObjectFactory.makeSymbol("S#50869", "CYC"), SubLObjectFactory.makeSymbol("S#50870", "CYC"), SubLObjectFactory.makeSymbol("S#50871", "CYC"), SubLObjectFactory.makeSymbol("S#50872", "CYC"), SubLObjectFactory.makeSymbol("S#50873", "CYC") });
        $ic171$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#50874", "CYC"), SubLObjectFactory.makeSymbol("S#50875", "CYC"), SubLObjectFactory.makeSymbol("S#50876", "CYC"), SubLObjectFactory.makeSymbol("S#50877", "CYC"), SubLObjectFactory.makeSymbol("S#50878", "CYC"), SubLObjectFactory.makeSymbol("S#50879", "CYC"), SubLObjectFactory.makeSymbol("S#50880", "CYC"), SubLObjectFactory.makeSymbol("S#50881", "CYC"), SubLObjectFactory.makeSymbol("S#50882", "CYC"), SubLObjectFactory.makeSymbol("S#50883", "CYC"), SubLObjectFactory.makeSymbol("S#50884", "CYC"), SubLObjectFactory.makeSymbol("S#50885", "CYC") });
        $ic172$ = SubLObjectFactory.makeSymbol("S#50889", "CYC");
        $ic173$ = SubLObjectFactory.makeSymbol("S#50861", "CYC");
        $ic174$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#50702", "CYC"));
        $ic175$ = SubLObjectFactory.makeSymbol("S#50862", "CYC");
        $ic176$ = SubLObjectFactory.makeSymbol("S#50874", "CYC");
        $ic177$ = SubLObjectFactory.makeSymbol("S#50863", "CYC");
        $ic178$ = SubLObjectFactory.makeSymbol("S#50875", "CYC");
        $ic179$ = SubLObjectFactory.makeSymbol("S#50864", "CYC");
        $ic180$ = SubLObjectFactory.makeSymbol("S#50876", "CYC");
        $ic181$ = SubLObjectFactory.makeSymbol("S#50865", "CYC");
        $ic182$ = SubLObjectFactory.makeSymbol("S#50877", "CYC");
        $ic183$ = SubLObjectFactory.makeSymbol("S#50866", "CYC");
        $ic184$ = SubLObjectFactory.makeSymbol("S#50878", "CYC");
        $ic185$ = SubLObjectFactory.makeSymbol("S#50867", "CYC");
        $ic186$ = SubLObjectFactory.makeSymbol("S#50879", "CYC");
        $ic187$ = SubLObjectFactory.makeSymbol("S#50868", "CYC");
        $ic188$ = SubLObjectFactory.makeSymbol("S#50880", "CYC");
        $ic189$ = SubLObjectFactory.makeSymbol("S#50869", "CYC");
        $ic190$ = SubLObjectFactory.makeSymbol("S#50881", "CYC");
        $ic191$ = SubLObjectFactory.makeSymbol("S#50870", "CYC");
        $ic192$ = SubLObjectFactory.makeSymbol("S#50882", "CYC");
        $ic193$ = SubLObjectFactory.makeSymbol("S#50871", "CYC");
        $ic194$ = SubLObjectFactory.makeSymbol("S#50883", "CYC");
        $ic195$ = SubLObjectFactory.makeSymbol("S#50872", "CYC");
        $ic196$ = SubLObjectFactory.makeSymbol("S#50884", "CYC");
        $ic197$ = SubLObjectFactory.makeSymbol("S#50873", "CYC");
        $ic198$ = SubLObjectFactory.makeSymbol("S#50885", "CYC");
        $ic199$ = SubLObjectFactory.makeKeyword("FORMULA");
        $ic200$ = SubLObjectFactory.makeKeyword("MT");
        $ic201$ = SubLObjectFactory.makeKeyword("FOCUS-ARG");
        $ic202$ = SubLObjectFactory.makeKeyword("SPECIFIED-RELN");
        $ic203$ = SubLObjectFactory.makeKeyword("NL-PREDS");
        $ic204$ = SubLObjectFactory.makeKeyword("DONE?");
        $ic205$ = SubLObjectFactory.makeKeyword("SEARCH-LIMIT");
        $ic206$ = SubLObjectFactory.makeKeyword("SEARCH-LEVEL");
        $ic207$ = SubLObjectFactory.makeKeyword("RELNS-TO-USE");
        $ic208$ = SubLObjectFactory.makeKeyword("GEN-TEMPLATE-SETS");
        $ic209$ = SubLObjectFactory.makeKeyword("GEN-TEMPLATES");
        $ic210$ = SubLObjectFactory.makeSymbol("S#50886", "CYC");
        $ic211$ = SubLObjectFactory.makeSymbol("S#50888", "CYC");
        $ic212$ = SubLObjectFactory.makeString("<PPH-Phrase-Template-Generator: ~S>");
        $ic213$ = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $ic214$ = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic215$ = SubLObjectFactory.makeSymbol("S#50917", "CYC");
        $ic216$ = SubLObjectFactory.makeKeyword("ANY");
        $ic217$ = SubLObjectFactory.makeSymbol("S#12263", "CYC");
        $ic218$ = SubLObjectFactory.makeString("Making new PPH phrase template generator.");
        $ic219$ = SubLObjectFactory.makeString("Freeing PPH phrase template generator (~S total).");
        $ic220$ = SubLObjectFactory.makeSymbol("S#50705", "CYC");
        $ic221$ = SubLObjectFactory.makeSymbol("S#50706", "CYC");
        $ic222$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#50929", "CYC"));
        $ic223$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ITEM-QUEUE"));
        $ic224$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#50892", "CYC"));
        $ic225$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#50893", "CYC"));
        $ic226$ = SubLObjectFactory.makeSymbol("S#50897", "CYC");
        $ic227$ = SubLObjectFactory.makeSymbol("S#50891", "CYC");
        $ic228$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#50706", "CYC"));
        $ic229$ = SubLObjectFactory.makeSymbol("S#50892", "CYC");
        $ic230$ = SubLObjectFactory.makeSymbol("S#50893", "CYC");
        $ic231$ = SubLObjectFactory.makeKeyword("ITEM-QUEUE");
        $ic232$ = SubLObjectFactory.makeSymbol("S#50894", "CYC");
        $ic233$ = SubLObjectFactory.makeSymbol("S#50896", "CYC");
        $ic234$ = SubLObjectFactory.makeString("<PPH-OL-Iterator>");
        $ic235$ = SubLObjectFactory.makeString("~& Iterator empty: ~S~%");
        $ic236$ = SubLObjectFactory.makeString("~& Can't get next item from ~S");
    }
    
    public static final class $sX50672_native extends SubLStructNative
    {
        public SubLObject $phrase;
        public SubLObject $constraint;
        public SubLObject $assertion;
        private static final SubLStructDeclNative structDecl;
        
        public $sX50672_native() {
            this.$phrase = (SubLObject)CommonSymbols.NIL;
            this.$constraint = (SubLObject)CommonSymbols.NIL;
            this.$assertion = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX50672_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$phrase;
        }
        
        public SubLObject getField3() {
            return this.$constraint;
        }
        
        public SubLObject getField4() {
            return this.$assertion;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$phrase = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$constraint = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$assertion = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX50672_native.class, module0749.$ic7$, module0749.$ic8$, module0749.$ic9$, module0749.$ic10$, new String[] { "$phrase", "$constraint", "$assertion" }, module0749.$ic11$, module0749.$ic12$, module0749.$ic13$);
        }
    }
    
    public static final class $f46351$UnaryFunction extends UnaryFunction
    {
        public $f46351$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#50673"));
        }
        
        public SubLObject processItem(final SubLObject var18) {
            return module0749.f46351(var18);
        }
    }
    
    public static final class $f46361$UnaryFunction extends UnaryFunction
    {
        public $f46361$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#50674"));
        }
        
        public SubLObject processItem(final SubLObject var18) {
            return module0749.f46361(var18);
        }
    }
    
    public static final class $f46366$UnaryFunction extends UnaryFunction
    {
        public $f46366$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#50676"));
        }
        
        public SubLObject processItem(final SubLObject var18) {
            return module0749.f46366(var18);
        }
    }
    
    public static final class $f46370$UnaryFunction extends UnaryFunction
    {
        public $f46370$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#50677"));
        }
        
        public SubLObject processItem(final SubLObject var18) {
            return module0749.f46370(var18);
        }
    }
    
    public static final class $sX39306_native extends SubLStructNative
    {
        public SubLObject $absolute_constraint;
        public SubLObject $relative_constraint;
        private static final SubLStructDeclNative structDecl;
        
        public $sX39306_native() {
            this.$absolute_constraint = (SubLObject)CommonSymbols.NIL;
            this.$relative_constraint = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX39306_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$absolute_constraint;
        }
        
        public SubLObject getField3() {
            return this.$relative_constraint;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$absolute_constraint = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$relative_constraint = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX39306_native.class, module0749.$ic42$, module0749.$ic43$, module0749.$ic44$, module0749.$ic45$, new String[] { "$absolute_constraint", "$relative_constraint" }, module0749.$ic46$, module0749.$ic47$, module0749.$ic48$);
        }
    }
    
    public static final class $f46374$UnaryFunction extends UnaryFunction
    {
        public $f46374$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#50678"));
        }
        
        public SubLObject processItem(final SubLObject var18) {
            return module0749.f46374(var18);
        }
    }
    
    public static final class $f46393$UnaryFunction extends UnaryFunction
    {
        public $f46393$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#50686"));
        }
        
        public SubLObject processItem(final SubLObject var18) {
            return module0749.f46393(var18);
        }
    }
    
    public static final class $sX50687_native extends SubLStructNative
    {
        public SubLObject $cycl;
        public SubLObject $agr;
        public SubLObject $justification;
        public SubLObject $output_list;
        public SubLObject $arg_position_map;
        public SubLObject $other;
        private static final SubLStructDeclNative structDecl;
        
        public $sX50687_native() {
            this.$cycl = (SubLObject)CommonSymbols.NIL;
            this.$agr = (SubLObject)CommonSymbols.NIL;
            this.$justification = (SubLObject)CommonSymbols.NIL;
            this.$output_list = (SubLObject)CommonSymbols.NIL;
            this.$arg_position_map = (SubLObject)CommonSymbols.NIL;
            this.$other = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX50687_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$cycl;
        }
        
        public SubLObject getField3() {
            return this.$agr;
        }
        
        public SubLObject getField4() {
            return this.$justification;
        }
        
        public SubLObject getField5() {
            return this.$output_list;
        }
        
        public SubLObject getField6() {
            return this.$arg_position_map;
        }
        
        public SubLObject getField7() {
            return this.$other;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$cycl = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$agr = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$justification = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$output_list = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$arg_position_map = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$other = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX50687_native.class, module0749.$ic69$, module0749.$ic70$, module0749.$ic71$, module0749.$ic72$, new String[] { "$cycl", "$agr", "$justification", "$output_list", "$arg_position_map", "$other" }, module0749.$ic73$, module0749.$ic74$, module0749.$ic75$);
        }
    }
    
    public static final class $f46396$UnaryFunction extends UnaryFunction
    {
        public $f46396$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#50688"));
        }
        
        public SubLObject processItem(final SubLObject var18) {
            return module0749.f46396(var18);
        }
    }
    
    public static final class $sX50689_native extends SubLStructNative
    {
        public SubLObject $string;
        public SubLObject $arg_position;
        public SubLObject $cycl;
        public SubLObject $html_open_tag;
        public SubLObject $html_close_tag;
        public SubLObject $agr;
        private static final SubLStructDeclNative structDecl;
        
        public $sX50689_native() {
            this.$string = (SubLObject)CommonSymbols.NIL;
            this.$arg_position = (SubLObject)CommonSymbols.NIL;
            this.$cycl = (SubLObject)CommonSymbols.NIL;
            this.$html_open_tag = (SubLObject)CommonSymbols.NIL;
            this.$html_close_tag = (SubLObject)CommonSymbols.NIL;
            this.$agr = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX50689_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$string;
        }
        
        public SubLObject getField3() {
            return this.$arg_position;
        }
        
        public SubLObject getField4() {
            return this.$cycl;
        }
        
        public SubLObject getField5() {
            return this.$html_open_tag;
        }
        
        public SubLObject getField6() {
            return this.$html_close_tag;
        }
        
        public SubLObject getField7() {
            return this.$agr;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$string = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$arg_position = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$cycl = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$html_open_tag = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$html_close_tag = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$agr = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX50689_native.class, module0749.$ic105$, module0749.$ic106$, module0749.$ic107$, module0749.$ic108$, new String[] { "$string", "$arg_position", "$cycl", "$html_open_tag", "$html_close_tag", "$agr" }, module0749.$ic109$, module0749.$ic110$, module0749.$ic111$);
        }
    }
    
    public static final class $f46430$UnaryFunction extends UnaryFunction
    {
        public $f46430$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#50690"));
        }
        
        public SubLObject processItem(final SubLObject var18) {
            return module0749.f46430(var18);
        }
    }
    
    public static final class $f46455$UnaryFunction extends UnaryFunction
    {
        public $f46455$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#50691"));
        }
        
        public SubLObject processItem(final SubLObject var18) {
            return module0749.f46455(var18);
        }
    }
    
    public static final class $f46482$UnaryFunction extends UnaryFunction
    {
        public $f46482$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#50692"));
        }
        
        public SubLObject processItem(final SubLObject var18) {
            return module0749.f46482(var18);
        }
    }
    
    public static final class $f46491$UnaryFunction extends UnaryFunction
    {
        public $f46491$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#50693"));
        }
        
        public SubLObject processItem(final SubLObject var18) {
            return module0749.f46491(var18);
        }
    }
    
    public static final class $sX50701_native extends SubLStructNative
    {
        public SubLObject $formula;
        public SubLObject $mt;
        public SubLObject $focus_arg;
        public SubLObject $specified_reln;
        public SubLObject $nl_preds;
        public SubLObject $doneP;
        public SubLObject $search_limit;
        public SubLObject $search_level;
        public SubLObject $relns_to_use;
        public SubLObject $gen_template_sets;
        public SubLObject $gen_templates;
        public SubLObject $arg_position_map;
        private static final SubLStructDeclNative structDecl;
        
        public $sX50701_native() {
            this.$formula = (SubLObject)CommonSymbols.NIL;
            this.$mt = (SubLObject)CommonSymbols.NIL;
            this.$focus_arg = (SubLObject)CommonSymbols.NIL;
            this.$specified_reln = (SubLObject)CommonSymbols.NIL;
            this.$nl_preds = (SubLObject)CommonSymbols.NIL;
            this.$doneP = (SubLObject)CommonSymbols.NIL;
            this.$search_limit = (SubLObject)CommonSymbols.NIL;
            this.$search_level = (SubLObject)CommonSymbols.NIL;
            this.$relns_to_use = (SubLObject)CommonSymbols.NIL;
            this.$gen_template_sets = (SubLObject)CommonSymbols.NIL;
            this.$gen_templates = (SubLObject)CommonSymbols.NIL;
            this.$arg_position_map = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX50701_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$formula;
        }
        
        public SubLObject getField3() {
            return this.$mt;
        }
        
        public SubLObject getField4() {
            return this.$focus_arg;
        }
        
        public SubLObject getField5() {
            return this.$specified_reln;
        }
        
        public SubLObject getField6() {
            return this.$nl_preds;
        }
        
        public SubLObject getField7() {
            return this.$doneP;
        }
        
        public SubLObject getField8() {
            return this.$search_limit;
        }
        
        public SubLObject getField9() {
            return this.$search_level;
        }
        
        public SubLObject getField10() {
            return this.$relns_to_use;
        }
        
        public SubLObject getField11() {
            return this.$gen_template_sets;
        }
        
        public SubLObject getField12() {
            return this.$gen_templates;
        }
        
        public SubLObject getField13() {
            return this.$arg_position_map;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$formula = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$mt = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$focus_arg = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$specified_reln = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$nl_preds = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$doneP = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$search_limit = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$search_level = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$relns_to_use = value;
        }
        
        public SubLObject setField11(final SubLObject value) {
            return this.$gen_template_sets = value;
        }
        
        public SubLObject setField12(final SubLObject value) {
            return this.$gen_templates = value;
        }
        
        public SubLObject setField13(final SubLObject value) {
            return this.$arg_position_map = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX50701_native.class, module0749.$ic166$, module0749.$ic167$, module0749.$ic168$, module0749.$ic169$, new String[] { "$formula", "$mt", "$focus_arg", "$specified_reln", "$nl_preds", "$doneP", "$search_limit", "$search_level", "$relns_to_use", "$gen_template_sets", "$gen_templates", "$arg_position_map" }, module0749.$ic170$, module0749.$ic171$, module0749.$ic172$);
        }
    }
    
    public static final class $f46522$UnaryFunction extends UnaryFunction
    {
        public $f46522$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#50702"));
        }
        
        public SubLObject processItem(final SubLObject var18) {
            return module0749.f46522(var18);
        }
    }
    
    public static final class $sX50705_native extends SubLStructNative
    {
        public SubLObject $item_queue;
        private static final SubLStructDeclNative structDecl;
        
        public $sX50705_native() {
            this.$item_queue = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX50705_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$item_queue;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$item_queue = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX50705_native.class, module0749.$ic220$, module0749.$ic221$, module0749.$ic222$, module0749.$ic223$, new String[] { "$item_queue" }, module0749.$ic224$, module0749.$ic225$, module0749.$ic226$);
        }
    }
    
    public static final class $f46556$UnaryFunction extends UnaryFunction
    {
        public $f46556$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#50706"));
        }
        
        public SubLObject processItem(final SubLObject var18) {
            return module0749.f46556(var18);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0749.class
	Total time: 963 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/