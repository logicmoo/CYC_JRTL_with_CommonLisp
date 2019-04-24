package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.foreign;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Alien;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0025 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0025";
    public static final String myFingerPrint = "f860563e19f1ba0eb8e957f483ba4c3883c19df19bbf5dee6736f95c20a91237";
    private static final SubLSymbol $ic0$;
    private static final SubLList $ic1$;
    private static final SubLString $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLString $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLList $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLString $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLList $ic12$;
    private static final SubLString $ic13$;
    private static final SubLString $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLString $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLString $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLString $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLString $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLString $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLString $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLList $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLList $ic30$;
    private static final SubLString $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLList $ic33$;
    private static final SubLString $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLString $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLString $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLString $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLString $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLString $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLString $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLList $ic48$;
    private static final SubLString $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLString $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLString $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLString $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLString $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLString $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLString $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLString $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLString $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLString $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLString $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLString $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLList $ic73$;
    private static final SubLString $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLString $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLString $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLString $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLString $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLList $ic84$;
    private static final SubLString $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLString $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLList $ic89$;
    private static final SubLString $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLList $ic92$;
    private static final SubLString $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLString $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLString $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLList $ic99$;
    private static final SubLString $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLList $ic102$;
    private static final SubLString $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLString $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLList $ic107$;
    private static final SubLString $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLString $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLString $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLString $ic114$;
    private static final SubLSymbol $ic115$;
    private static final SubLString $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLString $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLString $ic120$;
    private static final SubLSymbol $ic121$;
    private static final SubLString $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLString $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLString $ic126$;
    private static final SubLSymbol $ic127$;
    private static final SubLList $ic128$;
    private static final SubLSymbol $ic129$;
    private static final SubLString $ic130$;
    private static final SubLSymbol $ic131$;
    private static final SubLString $ic132$;
    private static final SubLSymbol $ic133$;
    private static final SubLList $ic134$;
    private static final SubLString $ic135$;
    private static final SubLSymbol $ic136$;
    private static final SubLString $ic137$;
    private static final SubLSymbol $ic138$;
    private static final SubLString $ic139$;
    private static final SubLSymbol $ic140$;
    private static final SubLList $ic141$;
    private static final SubLString $ic142$;
    private static final SubLSymbol $ic143$;
    private static final SubLString $ic144$;
    private static final SubLSymbol $ic145$;
    private static final SubLList $ic146$;
    private static final SubLString $ic147$;
    private static final SubLSymbol $ic148$;
    private static final SubLString $ic149$;
    private static final SubLSymbol $ic150$;
    private static final SubLString $ic151$;
    private static final SubLSymbol $ic152$;
    private static final SubLList $ic153$;
    private static final SubLString $ic154$;
    private static final SubLSymbol $ic155$;
    private static final SubLString $ic156$;
    private static final SubLSymbol $ic157$;
    private static final SubLString $ic158$;
    private static final SubLSymbol $ic159$;
    private static final SubLList $ic160$;
    private static final SubLString $ic161$;
    private static final SubLSymbol $ic162$;
    private static final SubLString $ic163$;
    private static final SubLSymbol $ic164$;
    private static final SubLString $ic165$;
    private static final SubLSymbol $ic166$;
    private static final SubLString $ic167$;
    private static final SubLSymbol $ic168$;
    
    public static SubLObject f1262() {
        final SubLObject var1 = Functions.funcall((SubLObject)module0025.$ic3$);
        if (module0025.NIL != Alien.alien_null_ptrP(var1, (SubLObject)module0025.$ic5$)) {
            return (SubLObject)module0025.NIL;
        }
        return var1;
    }
    
    public static SubLObject f1263(final SubLObject var2) {
        final SubLObject var3 = Functions.funcall((SubLObject)module0025.$ic11$, var2);
        if (module0025.NIL != Alien.alien_null_ptrP(var3, (SubLObject)module0025.$ic5$)) {
            return (SubLObject)module0025.$ic13$;
        }
        return var3;
    }
    
    public static SubLObject f1264(final SubLObject var2) {
        final SubLObject var3 = Functions.funcall((SubLObject)module0025.$ic17$, var2);
        if (module0025.NIL != Alien.alien_null_ptrP(var3, (SubLObject)module0025.$ic5$)) {
            return (SubLObject)module0025.$ic13$;
        }
        return var3;
    }
    
    public static SubLObject f1265(final SubLObject var2) {
        final SubLObject var3 = Functions.funcall((SubLObject)module0025.$ic19$, var2);
        if (module0025.NIL != Alien.alien_null_ptrP(var3, (SubLObject)module0025.$ic5$)) {
            return (SubLObject)module0025.$ic13$;
        }
        return var3;
    }
    
    public static SubLObject f1266(final SubLObject var2) {
        final SubLObject var3 = Functions.funcall((SubLObject)module0025.$ic21$, var2);
        if (module0025.NIL != Alien.alien_null_ptrP(var3, (SubLObject)module0025.$ic5$)) {
            return (SubLObject)module0025.$ic13$;
        }
        return var3;
    }
    
    public static SubLObject f1267(final SubLObject var2) {
        final SubLObject var3 = Functions.funcall((SubLObject)module0025.$ic23$, var2);
        if (module0025.NIL != Alien.alien_null_ptrP(var3, (SubLObject)module0025.$ic5$)) {
            return (SubLObject)module0025.$ic13$;
        }
        return var3;
    }
    
    public static SubLObject f1268(final SubLObject var2, final SubLObject var3) {
        final SubLObject var4 = Functions.funcall((SubLObject)module0025.$ic27$, var2, var3);
        if (module0025.NIL != Alien.alien_null_ptrP(var4, (SubLObject)module0025.$ic5$)) {
            return (SubLObject)module0025.NIL;
        }
        return var4;
    }
    
    public static SubLObject f1269(final SubLObject var2, final SubLObject var4) {
        final SubLObject var5 = Functions.funcall((SubLObject)module0025.$ic29$, var2, var4);
        if (module0025.NIL != Alien.alien_null_ptrP(var5, (SubLObject)module0025.$ic5$)) {
            return (SubLObject)module0025.NIL;
        }
        return var5;
    }
    
    public static SubLObject f1270(final SubLObject var5) {
        final SubLObject var6 = Functions.funcall((SubLObject)module0025.$ic37$, var5);
        if (module0025.NIL != Alien.alien_null_ptrP(var6, (SubLObject)module0025.$ic5$)) {
            return (SubLObject)module0025.$ic13$;
        }
        return var6;
    }
    
    public static SubLObject f1271(final SubLObject var5) {
        final SubLObject var6 = Functions.funcall((SubLObject)module0025.$ic39$, var5);
        if (module0025.NIL != Alien.alien_null_ptrP(var6, (SubLObject)module0025.$ic5$)) {
            return (SubLObject)module0025.$ic13$;
        }
        return var6;
    }
    
    public static SubLObject f1272(final SubLObject var5) {
        final SubLObject var6 = Functions.funcall((SubLObject)module0025.$ic41$, var5);
        if (module0025.NIL != Alien.alien_null_ptrP(var6, (SubLObject)module0025.$ic5$)) {
            return (SubLObject)module0025.$ic13$;
        }
        return var6;
    }
    
    public static SubLObject f1273(final SubLObject var5) {
        final SubLObject var6 = Functions.funcall((SubLObject)module0025.$ic43$, var5);
        if (module0025.NIL != Alien.alien_null_ptrP(var6, (SubLObject)module0025.$ic5$)) {
            return (SubLObject)module0025.$ic13$;
        }
        return var6;
    }
    
    public static SubLObject f1274(final SubLObject var5) {
        final SubLObject var6 = Functions.funcall((SubLObject)module0025.$ic45$, var5);
        if (module0025.NIL != Alien.alien_null_ptrP(var6, (SubLObject)module0025.$ic5$)) {
            return (SubLObject)module0025.$ic13$;
        }
        return var6;
    }
    
    public static SubLObject f1275(final SubLObject var5) {
        final SubLObject var6 = Functions.funcall((SubLObject)module0025.$ic58$, var5);
        if (module0025.NIL != Alien.alien_null_ptrP(var6, (SubLObject)module0025.$ic5$)) {
            return (SubLObject)module0025.$ic13$;
        }
        return var6;
    }
    
    public static SubLObject f1276(final SubLObject var5) {
        final SubLObject var6 = Functions.funcall((SubLObject)module0025.$ic62$, var5);
        if (module0025.NIL != Alien.alien_null_ptrP(var6, (SubLObject)module0025.$ic5$)) {
            return (SubLObject)module0025.$ic13$;
        }
        return var6;
    }
    
    public static SubLObject f1277(final SubLObject var2) {
        final SubLObject var3 = Functions.funcall((SubLObject)module0025.$ic68$, var2);
        if (module0025.NIL != Alien.alien_null_ptrP(var3, (SubLObject)module0025.$ic5$)) {
            return (SubLObject)module0025.NIL;
        }
        return var3;
    }
    
    public static SubLObject f1278(final SubLObject var2) {
        final SubLObject var3 = Functions.funcall((SubLObject)module0025.$ic70$, var2);
        if (module0025.NIL != Alien.alien_null_ptrP(var3, (SubLObject)module0025.$ic5$)) {
            return (SubLObject)module0025.NIL;
        }
        return var3;
    }
    
    public static SubLObject f1279(final SubLObject var2, final SubLObject var6) {
        final SubLObject var7 = Functions.funcall((SubLObject)module0025.$ic72$, var2, var6);
        if (module0025.NIL != Alien.alien_null_ptrP(var7, (SubLObject)module0025.$ic5$)) {
            return (SubLObject)module0025.NIL;
        }
        return var7;
    }
    
    public static SubLObject f1280(final SubLObject var5) {
        final SubLObject var6 = Functions.funcall((SubLObject)module0025.$ic75$, var5);
        if (module0025.NIL != Alien.alien_null_ptrP(var6, (SubLObject)module0025.$ic5$)) {
            return (SubLObject)module0025.NIL;
        }
        return var6;
    }
    
    public static SubLObject f1281(final SubLObject var2) {
        final SubLObject var3 = Functions.funcall((SubLObject)module0025.$ic77$, var2);
        if (module0025.NIL != Alien.alien_null_ptrP(var3, (SubLObject)module0025.$ic5$)) {
            return (SubLObject)module0025.NIL;
        }
        return var3;
    }
    
    public static SubLObject f1282(final SubLObject var2) {
        final SubLObject var3 = Functions.funcall((SubLObject)module0025.$ic79$, var2);
        if (module0025.NIL != Alien.alien_null_ptrP(var3, (SubLObject)module0025.$ic5$)) {
            return (SubLObject)module0025.NIL;
        }
        return var3;
    }
    
    public static SubLObject f1283(final SubLObject var2) {
        final SubLObject var3 = Functions.funcall((SubLObject)module0025.$ic81$, var2);
        if (module0025.NIL != Alien.alien_null_ptrP(var3, (SubLObject)module0025.$ic5$)) {
            return (SubLObject)module0025.NIL;
        }
        return var3;
    }
    
    public static SubLObject f1284(final SubLObject var7, final SubLObject var8) {
        final SubLObject var9 = Functions.funcall((SubLObject)module0025.$ic88$, var7, var8);
        if (module0025.NIL != Alien.alien_null_ptrP(var9, (SubLObject)module0025.$ic5$)) {
            return (SubLObject)module0025.NIL;
        }
        return var9;
    }
    
    public static SubLObject f1285(final SubLObject var5) {
        final SubLObject var6 = Functions.funcall((SubLObject)module0025.$ic96$, var5);
        if (module0025.NIL != Alien.alien_null_ptrP(var6, (SubLObject)module0025.$ic5$)) {
            return (SubLObject)module0025.NIL;
        }
        return var6;
    }
    
    public static SubLObject f1286(final SubLObject var9, final SubLObject var10) {
        final SubLObject var11 = Functions.funcall((SubLObject)module0025.$ic98$, var9, var10);
        if (module0025.NIL != Alien.alien_null_ptrP(var11, (SubLObject)module0025.$ic5$)) {
            return (SubLObject)module0025.NIL;
        }
        return var11;
    }
    
    public static SubLObject f1287(final SubLObject var9) {
        final SubLObject var10 = Functions.funcall((SubLObject)module0025.$ic104$, var9);
        if (module0025.NIL != Alien.alien_null_ptrP(var10, (SubLObject)module0025.$ic5$)) {
            return (SubLObject)module0025.NIL;
        }
        return var10;
    }
    
    public static SubLObject f1288(final SubLObject var11) {
        final SubLObject var12 = Functions.funcall((SubLObject)module0025.$ic111$, var11);
        if (module0025.NIL != Alien.alien_null_ptrP(var12, (SubLObject)module0025.$ic5$)) {
            return (SubLObject)module0025.NIL;
        }
        return var12;
    }
    
    public static SubLObject f1289(final SubLObject var11) {
        final SubLObject var12 = Functions.funcall((SubLObject)module0025.$ic113$, var11);
        if (module0025.NIL != Alien.alien_null_ptrP(var12, (SubLObject)module0025.$ic5$)) {
            return (SubLObject)module0025.NIL;
        }
        return var12;
    }
    
    public static SubLObject f1290(final SubLObject var9) {
        final SubLObject var10 = Functions.funcall((SubLObject)module0025.$ic115$, var9);
        if (module0025.NIL != Alien.alien_null_ptrP(var10, (SubLObject)module0025.$ic5$)) {
            return (SubLObject)module0025.$ic13$;
        }
        return var10;
    }
    
    public static SubLObject f1291(final SubLObject var9) {
        final SubLObject var10 = Functions.funcall((SubLObject)module0025.$ic117$, var9);
        if (module0025.NIL != Alien.alien_null_ptrP(var10, (SubLObject)module0025.$ic5$)) {
            return (SubLObject)module0025.$ic13$;
        }
        return var10;
    }
    
    public static SubLObject f1292(final SubLObject var9) {
        final SubLObject var10 = Functions.funcall((SubLObject)module0025.$ic121$, var9);
        if (module0025.NIL != Alien.alien_null_ptrP(var10, (SubLObject)module0025.$ic5$)) {
            return (SubLObject)module0025.NIL;
        }
        return var10;
    }
    
    public static SubLObject f1293(final SubLObject var9) {
        final SubLObject var10 = Functions.funcall((SubLObject)module0025.$ic123$, var9);
        if (module0025.NIL != Alien.alien_null_ptrP(var10, (SubLObject)module0025.$ic5$)) {
            return (SubLObject)module0025.$ic13$;
        }
        return var10;
    }
    
    public static SubLObject f1294(final SubLObject var9) {
        final SubLObject var10 = Functions.funcall((SubLObject)module0025.$ic125$, var9);
        if (module0025.NIL != Alien.alien_null_ptrP(var10, (SubLObject)module0025.$ic5$)) {
            return (SubLObject)module0025.$ic13$;
        }
        return var10;
    }
    
    public static SubLObject f1295(final SubLObject var9) {
        foreign.ensure_foreign_shared_library_loaded((SubLObject)module0025.$ic0$, (SubLObject)module0025.UNPROVIDED);
        final SubLObject var10 = Functions.funcall((SubLObject)module0025.$ic119$, var9);
        final SubLObject var11 = foreign.vector_for_marshalling(var10, (SubLObject)module0025.$ic129$, (SubLObject)module0025.ZERO_INTEGER);
        Functions.funcall((SubLObject)module0025.$ic127$, var9, var11);
        return var11;
    }
    
    public static SubLObject f1296(final SubLObject var9) {
        foreign.ensure_foreign_shared_library_loaded((SubLObject)module0025.$ic0$, (SubLObject)module0025.UNPROVIDED);
        final SubLObject var10 = f1295(var9);
        if (var10.equal((SubLObject)module0025.ZERO_INTEGER)) {
            return (SubLObject)module0025.NIL;
        }
        return var10;
    }
    
    public static SubLObject f1297(final SubLObject var9, final SubLObject var10, final SubLObject var15) {
        final SubLObject var16 = Functions.funcall((SubLObject)module0025.$ic133$, var9, var10, var15);
        if (module0025.NIL != Alien.alien_null_ptrP(var16, (SubLObject)module0025.$ic5$)) {
            return (SubLObject)module0025.NIL;
        }
        return var16;
    }
    
    public static SubLObject f1298(final SubLObject var9, final SubLObject var10) {
        final SubLObject var11 = Functions.funcall((SubLObject)module0025.$ic136$, var9, var10);
        if (module0025.NIL != Alien.alien_null_ptrP(var11, (SubLObject)module0025.$ic5$)) {
            return (SubLObject)module0025.NIL;
        }
        return var11;
    }
    
    public static SubLObject f1299(final SubLObject var7) {
        final SubLObject var8 = Functions.funcall((SubLObject)module0025.$ic138$, var7);
        if (module0025.NIL != Alien.alien_null_ptrP(var8, (SubLObject)module0025.$ic5$)) {
            return (SubLObject)module0025.NIL;
        }
        return var8;
    }
    
    public static SubLObject f1300(final SubLObject var16, final SubLObject var10) {
        final SubLObject var17 = Functions.funcall((SubLObject)module0025.$ic140$, var16, var10);
        if (module0025.NIL != Alien.alien_null_ptrP(var17, (SubLObject)module0025.$ic5$)) {
            return (SubLObject)module0025.NIL;
        }
        return var17;
    }
    
    public static SubLObject f1301(final SubLObject var16) {
        final SubLObject var17 = Functions.funcall((SubLObject)module0025.$ic145$, var16);
        if (module0025.NIL != Alien.alien_null_ptrP(var17, (SubLObject)module0025.$ic5$)) {
            return (SubLObject)module0025.NIL;
        }
        return var17;
    }
    
    public static SubLObject f1302(final SubLObject var16) {
        final SubLObject var17 = Functions.funcall((SubLObject)module0025.$ic148$, var16);
        if (module0025.NIL != Alien.alien_null_ptrP(var17, (SubLObject)module0025.$ic5$)) {
            return (SubLObject)module0025.NIL;
        }
        return var17;
    }
    
    public static SubLObject f1303(final SubLObject var16, final SubLObject var10, final SubLObject var15) {
        final SubLObject var17 = Functions.funcall((SubLObject)module0025.$ic152$, var16, var10, var15);
        if (module0025.NIL != Alien.alien_null_ptrP(var17, (SubLObject)module0025.$ic5$)) {
            return (SubLObject)module0025.NIL;
        }
        return var17;
    }
    
    public static SubLObject f1304(final SubLObject var16, final SubLObject var10) {
        final SubLObject var17 = Functions.funcall((SubLObject)module0025.$ic155$, var16, var10);
        if (module0025.NIL != Alien.alien_null_ptrP(var17, (SubLObject)module0025.$ic5$)) {
            return (SubLObject)module0025.NIL;
        }
        return var17;
    }
    
    public static SubLObject f1305(final SubLObject var16) {
        final SubLObject var17 = Functions.funcall((SubLObject)module0025.$ic157$, var16);
        if (module0025.NIL != Alien.alien_null_ptrP(var17, (SubLObject)module0025.$ic5$)) {
            return (SubLObject)module0025.NIL;
        }
        return var17;
    }
    
    public static SubLObject f1306(final SubLObject var17) {
        final SubLObject var18 = Functions.funcall((SubLObject)module0025.$ic162$, var17);
        if (module0025.NIL != Alien.alien_null_ptrP(var18, (SubLObject)module0025.$ic5$)) {
            return (SubLObject)module0025.NIL;
        }
        return var18;
    }
    
    public static SubLObject f1307(final SubLObject var17) {
        final SubLObject var18 = Functions.funcall((SubLObject)module0025.$ic164$, var17);
        if (module0025.NIL != Alien.alien_null_ptrP(var18, (SubLObject)module0025.$ic5$)) {
            return (SubLObject)module0025.NIL;
        }
        return var18;
    }
    
    public static SubLObject f1308(final SubLObject var17) {
        final SubLObject var18 = Functions.funcall((SubLObject)module0025.$ic166$, var17);
        if (module0025.NIL != Alien.alien_null_ptrP(var18, (SubLObject)module0025.$ic5$)) {
            return (SubLObject)module0025.NIL;
        }
        return var18;
    }
    
    public static SubLObject f1309() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0025", "f1262", "S#2348", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0025", "f1263", "S#2349", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0025", "f1264", "S#2350", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0025", "f1265", "S#2351", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0025", "f1266", "S#2352", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0025", "f1267", "S#2353", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0025", "f1268", "S#2354", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0025", "f1269", "S#2355", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0025", "f1270", "S#2356", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0025", "f1271", "S#2357", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0025", "f1272", "S#2358", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0025", "f1273", "S#2359", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0025", "f1274", "S#2360", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0025", "f1275", "S#2361", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0025", "f1276", "S#2362", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0025", "f1277", "S#2363", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0025", "f1278", "S#2364", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0025", "f1279", "S#2365", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0025", "f1280", "S#2366", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0025", "f1281", "S#2367", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0025", "f1282", "S#2368", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0025", "f1283", "S#2369", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0025", "f1284", "S#2370", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0025", "f1285", "S#2371", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0025", "f1286", "S#2372", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0025", "f1287", "S#2373", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0025", "f1288", "S#2374", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0025", "f1289", "S#2375", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0025", "f1290", "S#2376", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0025", "f1291", "S#2377", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0025", "f1292", "S#2378", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0025", "f1293", "S#2379", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0025", "f1294", "S#2380", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0025", "f1295", "S#2381", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0025", "f1296", "S#2382", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0025", "f1297", "S#2383", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0025", "f1298", "S#2384", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0025", "f1299", "S#2385", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0025", "f1300", "S#2386", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0025", "f1301", "S#2387", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0025", "f1302", "S#2388", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0025", "f1303", "S#2389", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0025", "f1304", "S#2390", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0025", "f1305", "S#2391", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0025", "f1306", "S#2392", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0025", "f1307", "S#2393", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0025", "f1308", "S#2394", 1, 0, false);
        return (SubLObject)module0025.NIL;
    }
    
    public static SubLObject f1310() {
        return (SubLObject)module0025.NIL;
    }
    
    public static SubLObject f1311() {
        foreign.declare_foreign_shared_library((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic1$);
        Alien.def_foreign_function((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic2$, (SubLObject)module0025.$ic3$, (SubLObject)module0025.NIL, (SubLObject)module0025.$ic4$, (SubLObject)module0025.$ic5$, (SubLObject)module0025.NIL);
        Alien.def_foreign_function((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic6$, (SubLObject)module0025.$ic7$, (SubLObject)module0025.$ic8$, (SubLObject)module0025.$ic9$, (SubLObject)module0025.$ic5$, (SubLObject)module0025.NIL);
        Alien.def_foreign_function((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic10$, (SubLObject)module0025.$ic11$, (SubLObject)module0025.$ic8$, (SubLObject)module0025.$ic12$, (SubLObject)module0025.$ic5$, (SubLObject)module0025.$ic13$);
        Alien.def_foreign_function((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic14$, (SubLObject)module0025.$ic15$, (SubLObject)module0025.$ic8$, (SubLObject)module0025.$ic9$, (SubLObject)module0025.$ic5$, (SubLObject)module0025.NIL);
        Alien.def_foreign_function((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic16$, (SubLObject)module0025.$ic17$, (SubLObject)module0025.$ic8$, (SubLObject)module0025.$ic12$, (SubLObject)module0025.$ic5$, (SubLObject)module0025.$ic13$);
        Alien.def_foreign_function((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic18$, (SubLObject)module0025.$ic19$, (SubLObject)module0025.$ic8$, (SubLObject)module0025.$ic12$, (SubLObject)module0025.$ic5$, (SubLObject)module0025.$ic13$);
        Alien.def_foreign_function((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic20$, (SubLObject)module0025.$ic21$, (SubLObject)module0025.$ic8$, (SubLObject)module0025.$ic12$, (SubLObject)module0025.$ic5$, (SubLObject)module0025.$ic13$);
        Alien.def_foreign_function((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic22$, (SubLObject)module0025.$ic23$, (SubLObject)module0025.$ic8$, (SubLObject)module0025.$ic12$, (SubLObject)module0025.$ic5$, (SubLObject)module0025.$ic13$);
        Alien.def_foreign_function((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic24$, (SubLObject)module0025.$ic25$, (SubLObject)module0025.$ic8$, (SubLObject)module0025.NIL, (SubLObject)module0025.$ic5$, (SubLObject)module0025.NIL);
        Alien.def_foreign_function((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic26$, (SubLObject)module0025.$ic27$, (SubLObject)module0025.$ic28$, (SubLObject)module0025.$ic4$, (SubLObject)module0025.$ic5$, (SubLObject)module0025.NIL);
        Alien.def_foreign_function((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic26$, (SubLObject)module0025.$ic29$, (SubLObject)module0025.$ic30$, (SubLObject)module0025.$ic4$, (SubLObject)module0025.$ic5$, (SubLObject)module0025.NIL);
        Alien.def_foreign_function((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic31$, (SubLObject)module0025.$ic32$, (SubLObject)module0025.$ic33$, (SubLObject)module0025.NIL, (SubLObject)module0025.$ic5$, (SubLObject)module0025.NIL);
        Alien.def_foreign_function((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic34$, (SubLObject)module0025.$ic35$, (SubLObject)module0025.$ic33$, (SubLObject)module0025.$ic9$, (SubLObject)module0025.$ic5$, (SubLObject)module0025.NIL);
        Alien.def_foreign_function((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic36$, (SubLObject)module0025.$ic37$, (SubLObject)module0025.$ic33$, (SubLObject)module0025.$ic12$, (SubLObject)module0025.$ic5$, (SubLObject)module0025.$ic13$);
        Alien.def_foreign_function((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic38$, (SubLObject)module0025.$ic39$, (SubLObject)module0025.$ic33$, (SubLObject)module0025.$ic12$, (SubLObject)module0025.$ic5$, (SubLObject)module0025.$ic13$);
        Alien.def_foreign_function((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic40$, (SubLObject)module0025.$ic41$, (SubLObject)module0025.$ic33$, (SubLObject)module0025.$ic12$, (SubLObject)module0025.$ic5$, (SubLObject)module0025.$ic13$);
        Alien.def_foreign_function((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic42$, (SubLObject)module0025.$ic43$, (SubLObject)module0025.$ic33$, (SubLObject)module0025.$ic12$, (SubLObject)module0025.$ic5$, (SubLObject)module0025.$ic13$);
        Alien.def_foreign_function((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic44$, (SubLObject)module0025.$ic45$, (SubLObject)module0025.$ic33$, (SubLObject)module0025.$ic12$, (SubLObject)module0025.$ic5$, (SubLObject)module0025.$ic13$);
        Alien.def_foreign_function((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic46$, (SubLObject)module0025.$ic47$, (SubLObject)module0025.$ic48$, (SubLObject)module0025.$ic9$, (SubLObject)module0025.$ic5$, (SubLObject)module0025.NIL);
        Alien.def_foreign_function((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic49$, (SubLObject)module0025.$ic50$, (SubLObject)module0025.$ic33$, (SubLObject)module0025.$ic9$, (SubLObject)module0025.$ic5$, (SubLObject)module0025.NIL);
        Alien.def_foreign_function((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic51$, (SubLObject)module0025.$ic52$, (SubLObject)module0025.$ic33$, (SubLObject)module0025.$ic9$, (SubLObject)module0025.$ic5$, (SubLObject)module0025.NIL);
        Alien.def_foreign_function((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic53$, (SubLObject)module0025.$ic54$, (SubLObject)module0025.$ic33$, (SubLObject)module0025.$ic9$, (SubLObject)module0025.$ic5$, (SubLObject)module0025.NIL);
        Alien.def_foreign_function((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic55$, (SubLObject)module0025.$ic56$, (SubLObject)module0025.$ic33$, (SubLObject)module0025.$ic9$, (SubLObject)module0025.$ic5$, (SubLObject)module0025.NIL);
        Alien.def_foreign_function((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic57$, (SubLObject)module0025.$ic58$, (SubLObject)module0025.$ic33$, (SubLObject)module0025.$ic12$, (SubLObject)module0025.$ic5$, (SubLObject)module0025.$ic13$);
        Alien.def_foreign_function((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic59$, (SubLObject)module0025.$ic60$, (SubLObject)module0025.$ic33$, (SubLObject)module0025.$ic9$, (SubLObject)module0025.$ic5$, (SubLObject)module0025.NIL);
        Alien.def_foreign_function((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic61$, (SubLObject)module0025.$ic62$, (SubLObject)module0025.$ic33$, (SubLObject)module0025.$ic12$, (SubLObject)module0025.$ic5$, (SubLObject)module0025.$ic13$);
        Alien.def_foreign_function((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic63$, (SubLObject)module0025.$ic64$, (SubLObject)module0025.$ic8$, (SubLObject)module0025.$ic9$, (SubLObject)module0025.$ic5$, (SubLObject)module0025.NIL);
        Alien.def_foreign_function((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic65$, (SubLObject)module0025.$ic66$, (SubLObject)module0025.$ic8$, (SubLObject)module0025.$ic9$, (SubLObject)module0025.$ic5$, (SubLObject)module0025.NIL);
        Alien.def_foreign_function((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic67$, (SubLObject)module0025.$ic68$, (SubLObject)module0025.$ic8$, (SubLObject)module0025.$ic4$, (SubLObject)module0025.$ic5$, (SubLObject)module0025.NIL);
        Alien.def_foreign_function((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic69$, (SubLObject)module0025.$ic70$, (SubLObject)module0025.$ic8$, (SubLObject)module0025.$ic4$, (SubLObject)module0025.$ic5$, (SubLObject)module0025.NIL);
        Alien.def_foreign_function((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic71$, (SubLObject)module0025.$ic72$, (SubLObject)module0025.$ic73$, (SubLObject)module0025.$ic4$, (SubLObject)module0025.$ic5$, (SubLObject)module0025.NIL);
        Alien.def_foreign_function((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic74$, (SubLObject)module0025.$ic75$, (SubLObject)module0025.$ic33$, (SubLObject)module0025.$ic4$, (SubLObject)module0025.$ic5$, (SubLObject)module0025.NIL);
        Alien.def_foreign_function((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic76$, (SubLObject)module0025.$ic77$, (SubLObject)module0025.$ic8$, (SubLObject)module0025.$ic4$, (SubLObject)module0025.$ic5$, (SubLObject)module0025.NIL);
        Alien.def_foreign_function((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic78$, (SubLObject)module0025.$ic79$, (SubLObject)module0025.$ic8$, (SubLObject)module0025.$ic4$, (SubLObject)module0025.$ic5$, (SubLObject)module0025.NIL);
        Alien.def_foreign_function((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic80$, (SubLObject)module0025.$ic81$, (SubLObject)module0025.$ic8$, (SubLObject)module0025.$ic4$, (SubLObject)module0025.$ic5$, (SubLObject)module0025.NIL);
        Alien.def_foreign_function((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic82$, (SubLObject)module0025.$ic83$, (SubLObject)module0025.$ic84$, (SubLObject)module0025.NIL, (SubLObject)module0025.$ic5$, (SubLObject)module0025.NIL);
        Alien.def_foreign_function((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic85$, (SubLObject)module0025.$ic86$, (SubLObject)module0025.$ic84$, (SubLObject)module0025.$ic9$, (SubLObject)module0025.$ic5$, (SubLObject)module0025.NIL);
        Alien.def_foreign_function((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic87$, (SubLObject)module0025.$ic88$, (SubLObject)module0025.$ic89$, (SubLObject)module0025.$ic4$, (SubLObject)module0025.$ic5$, (SubLObject)module0025.NIL);
        Alien.def_foreign_function((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic90$, (SubLObject)module0025.$ic91$, (SubLObject)module0025.$ic92$, (SubLObject)module0025.$ic9$, (SubLObject)module0025.$ic5$, (SubLObject)module0025.NIL);
        Alien.def_foreign_function((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic93$, (SubLObject)module0025.$ic94$, (SubLObject)module0025.$ic84$, (SubLObject)module0025.$ic9$, (SubLObject)module0025.$ic5$, (SubLObject)module0025.NIL);
        Alien.def_foreign_function((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic95$, (SubLObject)module0025.$ic96$, (SubLObject)module0025.$ic33$, (SubLObject)module0025.$ic4$, (SubLObject)module0025.$ic5$, (SubLObject)module0025.NIL);
        Alien.def_foreign_function((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic97$, (SubLObject)module0025.$ic98$, (SubLObject)module0025.$ic99$, (SubLObject)module0025.$ic4$, (SubLObject)module0025.$ic5$, (SubLObject)module0025.NIL);
        Alien.def_foreign_function((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic100$, (SubLObject)module0025.$ic101$, (SubLObject)module0025.$ic102$, (SubLObject)module0025.$ic9$, (SubLObject)module0025.$ic5$, (SubLObject)module0025.NIL);
        Alien.def_foreign_function((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic103$, (SubLObject)module0025.$ic104$, (SubLObject)module0025.$ic102$, (SubLObject)module0025.$ic4$, (SubLObject)module0025.$ic5$, (SubLObject)module0025.NIL);
        Alien.def_foreign_function((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic105$, (SubLObject)module0025.$ic106$, (SubLObject)module0025.$ic107$, (SubLObject)module0025.NIL, (SubLObject)module0025.$ic5$, (SubLObject)module0025.NIL);
        Alien.def_foreign_function((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic108$, (SubLObject)module0025.$ic109$, (SubLObject)module0025.$ic107$, (SubLObject)module0025.$ic9$, (SubLObject)module0025.$ic5$, (SubLObject)module0025.NIL);
        Alien.def_foreign_function((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic110$, (SubLObject)module0025.$ic111$, (SubLObject)module0025.$ic107$, (SubLObject)module0025.$ic4$, (SubLObject)module0025.$ic5$, (SubLObject)module0025.NIL);
        Alien.def_foreign_function((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic112$, (SubLObject)module0025.$ic113$, (SubLObject)module0025.$ic107$, (SubLObject)module0025.$ic4$, (SubLObject)module0025.$ic5$, (SubLObject)module0025.NIL);
        Alien.def_foreign_function((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic114$, (SubLObject)module0025.$ic115$, (SubLObject)module0025.$ic102$, (SubLObject)module0025.$ic12$, (SubLObject)module0025.$ic5$, (SubLObject)module0025.$ic13$);
        Alien.def_foreign_function((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic116$, (SubLObject)module0025.$ic117$, (SubLObject)module0025.$ic102$, (SubLObject)module0025.$ic12$, (SubLObject)module0025.$ic5$, (SubLObject)module0025.$ic13$);
        Alien.def_foreign_function((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic118$, (SubLObject)module0025.$ic119$, (SubLObject)module0025.$ic102$, (SubLObject)module0025.$ic9$, (SubLObject)module0025.$ic5$, (SubLObject)module0025.NIL);
        Alien.def_foreign_function((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic120$, (SubLObject)module0025.$ic121$, (SubLObject)module0025.$ic102$, (SubLObject)module0025.$ic4$, (SubLObject)module0025.$ic5$, (SubLObject)module0025.NIL);
        Alien.def_foreign_function((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic122$, (SubLObject)module0025.$ic123$, (SubLObject)module0025.$ic102$, (SubLObject)module0025.$ic12$, (SubLObject)module0025.$ic5$, (SubLObject)module0025.$ic13$);
        Alien.def_foreign_function((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic124$, (SubLObject)module0025.$ic125$, (SubLObject)module0025.$ic102$, (SubLObject)module0025.$ic12$, (SubLObject)module0025.$ic5$, (SubLObject)module0025.$ic13$);
        Alien.def_foreign_function((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic126$, (SubLObject)module0025.$ic127$, (SubLObject)module0025.$ic128$, (SubLObject)module0025.$ic9$, (SubLObject)module0025.$ic5$, (SubLObject)module0025.NIL);
        Alien.def_foreign_function((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic130$, (SubLObject)module0025.$ic131$, (SubLObject)module0025.$ic102$, (SubLObject)module0025.$ic9$, (SubLObject)module0025.$ic5$, (SubLObject)module0025.NIL);
        Alien.def_foreign_function((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic132$, (SubLObject)module0025.$ic133$, (SubLObject)module0025.$ic134$, (SubLObject)module0025.$ic4$, (SubLObject)module0025.$ic5$, (SubLObject)module0025.NIL);
        Alien.def_foreign_function((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic135$, (SubLObject)module0025.$ic136$, (SubLObject)module0025.$ic99$, (SubLObject)module0025.$ic4$, (SubLObject)module0025.$ic5$, (SubLObject)module0025.NIL);
        Alien.def_foreign_function((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic137$, (SubLObject)module0025.$ic138$, (SubLObject)module0025.$ic84$, (SubLObject)module0025.$ic4$, (SubLObject)module0025.$ic5$, (SubLObject)module0025.NIL);
        Alien.def_foreign_function((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic139$, (SubLObject)module0025.$ic140$, (SubLObject)module0025.$ic141$, (SubLObject)module0025.$ic4$, (SubLObject)module0025.$ic5$, (SubLObject)module0025.NIL);
        Alien.def_foreign_function((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic142$, (SubLObject)module0025.$ic143$, (SubLObject)module0025.$ic141$, (SubLObject)module0025.$ic9$, (SubLObject)module0025.$ic5$, (SubLObject)module0025.NIL);
        Alien.def_foreign_function((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic144$, (SubLObject)module0025.$ic145$, (SubLObject)module0025.$ic146$, (SubLObject)module0025.$ic4$, (SubLObject)module0025.$ic5$, (SubLObject)module0025.NIL);
        Alien.def_foreign_function((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic147$, (SubLObject)module0025.$ic148$, (SubLObject)module0025.$ic146$, (SubLObject)module0025.$ic4$, (SubLObject)module0025.$ic5$, (SubLObject)module0025.NIL);
        Alien.def_foreign_function((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic149$, (SubLObject)module0025.$ic150$, (SubLObject)module0025.$ic146$, (SubLObject)module0025.NIL, (SubLObject)module0025.$ic5$, (SubLObject)module0025.NIL);
        Alien.def_foreign_function((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic151$, (SubLObject)module0025.$ic152$, (SubLObject)module0025.$ic153$, (SubLObject)module0025.$ic4$, (SubLObject)module0025.$ic5$, (SubLObject)module0025.NIL);
        Alien.def_foreign_function((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic154$, (SubLObject)module0025.$ic155$, (SubLObject)module0025.$ic141$, (SubLObject)module0025.$ic4$, (SubLObject)module0025.$ic5$, (SubLObject)module0025.NIL);
        Alien.def_foreign_function((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic156$, (SubLObject)module0025.$ic157$, (SubLObject)module0025.$ic146$, (SubLObject)module0025.$ic4$, (SubLObject)module0025.$ic5$, (SubLObject)module0025.NIL);
        Alien.def_foreign_function((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic158$, (SubLObject)module0025.$ic159$, (SubLObject)module0025.$ic160$, (SubLObject)module0025.$ic9$, (SubLObject)module0025.$ic5$, (SubLObject)module0025.NIL);
        Alien.def_foreign_function((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic161$, (SubLObject)module0025.$ic162$, (SubLObject)module0025.$ic160$, (SubLObject)module0025.$ic4$, (SubLObject)module0025.$ic5$, (SubLObject)module0025.NIL);
        Alien.def_foreign_function((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic163$, (SubLObject)module0025.$ic164$, (SubLObject)module0025.$ic160$, (SubLObject)module0025.$ic4$, (SubLObject)module0025.$ic5$, (SubLObject)module0025.NIL);
        Alien.def_foreign_function((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic165$, (SubLObject)module0025.$ic166$, (SubLObject)module0025.$ic160$, (SubLObject)module0025.$ic4$, (SubLObject)module0025.$ic5$, (SubLObject)module0025.NIL);
        Alien.def_foreign_function((SubLObject)module0025.$ic0$, (SubLObject)module0025.$ic167$, (SubLObject)module0025.$ic168$, (SubLObject)module0025.$ic160$, (SubLObject)module0025.NIL, (SubLObject)module0025.$ic5$, (SubLObject)module0025.NIL);
        return (SubLObject)module0025.NIL;
    }
    
    public void declareFunctions() {
        f1309();
    }
    
    public void initializeVariables() {
        f1310();
    }
    
    public void runTopLevelForms() {
        f1311();
    }
    
    static {
        me = (SubLFile)new module0025();
        $ic0$ = SubLObjectFactory.makeKeyword("RED-SHARED");
        $ic1$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("COMMENT"), SubLObjectFactory.makeString("RED Cyc Configuration Repository"), SubLObjectFactory.makeKeyword("AUTHOR"), SubLObjectFactory.makeString("Chester John <cjohn@cyc.com>"), SubLObjectFactory.makeKeyword("FILENAME"), SubLObjectFactory.makeString("RED Library (auto-loaded)"), SubLObjectFactory.makeKeyword("DEPENDS-ON"), module0025.NIL, SubLObjectFactory.makeKeyword("COPYRIGHT"), SubLObjectFactory.makeString("Copyright (c) 2004 - 2006 Cycorp Inc."), SubLObjectFactory.makeKeyword("URI"), SubLObjectFactory.makeString("http://www.opencyc.com") });
        $ic2$ = SubLObjectFactory.makeString("RedNew");
        $ic3$ = SubLObjectFactory.makeUninternedSymbol("US#467DB6D");
        $ic4$ = SubLObjectFactory.makeKeyword("OPAQUE");
        $ic5$ = SubLObjectFactory.makeKeyword("C");
        $ic6$ = SubLObjectFactory.makeString("RedGetReasonCode");
        $ic7$ = SubLObjectFactory.makeSymbol("S#2395", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2396", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("OPAQUE"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER")));
        $ic9$ = SubLObjectFactory.makeKeyword("INT32");
        $ic10$ = SubLObjectFactory.makeString("RedGetReasonCodeString");
        $ic11$ = SubLObjectFactory.makeUninternedSymbol("US#3C9D4D6");
        $ic12$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("POINTER"), (SubLObject)SubLObjectFactory.makeKeyword("CHAR"));
        $ic13$ = SubLObjectFactory.makeString("");
        $ic14$ = SubLObjectFactory.makeString("RedGetReasonSubCode");
        $ic15$ = SubLObjectFactory.makeSymbol("S#2397", "CYC");
        $ic16$ = SubLObjectFactory.makeString("RedGetReasonSubCodeString");
        $ic17$ = SubLObjectFactory.makeUninternedSymbol("US#6898566");
        $ic18$ = SubLObjectFactory.makeString("RedGetVersionString");
        $ic19$ = SubLObjectFactory.makeUninternedSymbol("US#7EBAD21");
        $ic20$ = SubLObjectFactory.makeString("RedGetDate");
        $ic21$ = SubLObjectFactory.makeUninternedSymbol("US#2F516A5");
        $ic22$ = SubLObjectFactory.makeString("RedGetTime");
        $ic23$ = SubLObjectFactory.makeUninternedSymbol("US#2C73625");
        $ic24$ = SubLObjectFactory.makeString("RedDispose");
        $ic25$ = SubLObjectFactory.makeSymbol("S#2398", "CYC");
        $ic26$ = SubLObjectFactory.makeString("RedLoadRedRepositoryFilename");
        $ic27$ = SubLObjectFactory.makeUninternedSymbol("US#5164112");
        $ic28$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2396", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("OPAQUE"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#885", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("POINTER"), (SubLObject)SubLObjectFactory.makeKeyword("CHAR")), (SubLObject)SubLObjectFactory.makeKeyword("STRING")));
        $ic29$ = SubLObjectFactory.makeUninternedSymbol("US#277E6B8");
        $ic30$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2396", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("OPAQUE"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("POINTER"), (SubLObject)SubLObjectFactory.makeKeyword("CHAR")), (SubLObject)SubLObjectFactory.makeKeyword("STRING")));
        $ic31$ = SubLObjectFactory.makeString("RedRepositoryDispose");
        $ic32$ = SubLObjectFactory.makeSymbol("S#2399", "CYC");
        $ic33$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2400", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("OPAQUE"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER")));
        $ic34$ = SubLObjectFactory.makeString("RedValueExists");
        $ic35$ = SubLObjectFactory.makeSymbol("S#2401", "CYC");
        $ic36$ = SubLObjectFactory.makeString("RedGetRepositoryName");
        $ic37$ = SubLObjectFactory.makeUninternedSymbol("US#48D7BBB");
        $ic38$ = SubLObjectFactory.makeString("RedGetRepositoryFilename");
        $ic39$ = SubLObjectFactory.makeUninternedSymbol("US#DF7516");
        $ic40$ = SubLObjectFactory.makeString("RedGetRepositoryTypeString");
        $ic41$ = SubLObjectFactory.makeUninternedSymbol("US#77A4C7");
        $ic42$ = SubLObjectFactory.makeString("RedGetRepositoryVersionString");
        $ic43$ = SubLObjectFactory.makeUninternedSymbol("US#319792D");
        $ic44$ = SubLObjectFactory.makeString("RedGetRepositoryDate");
        $ic45$ = SubLObjectFactory.makeUninternedSymbol("US#4877BA2");
        $ic46$ = SubLObjectFactory.makeString("RedRepositoryPointerValid");
        $ic47$ = SubLObjectFactory.makeSymbol("S#2402", "CYC");
        $ic48$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2396", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("OPAQUE"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2400", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("OPAQUE"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER")));
        $ic49$ = SubLObjectFactory.makeString("RedGetRepositoryVersionMajor");
        $ic50$ = SubLObjectFactory.makeSymbol("S#2403", "CYC");
        $ic51$ = SubLObjectFactory.makeString("RedGetRepositoryVersionMinor");
        $ic52$ = SubLObjectFactory.makeSymbol("S#2404", "CYC");
        $ic53$ = SubLObjectFactory.makeString("RedGetRepositoryVersionFix");
        $ic54$ = SubLObjectFactory.makeSymbol("S#2405", "CYC");
        $ic55$ = SubLObjectFactory.makeString("RedGetRepositoryVersionSpin");
        $ic56$ = SubLObjectFactory.makeSymbol("S#2406", "CYC");
        $ic57$ = SubLObjectFactory.makeString("RedGetRepositoryTime");
        $ic58$ = SubLObjectFactory.makeUninternedSymbol("US#977BBB");
        $ic59$ = SubLObjectFactory.makeString("RedRepositoryIsValid");
        $ic60$ = SubLObjectFactory.makeSymbol("S#2407", "CYC");
        $ic61$ = SubLObjectFactory.makeString("RedGetRepositoryReasonCodeString");
        $ic62$ = SubLObjectFactory.makeUninternedSymbol("US#35A3FF0");
        $ic63$ = SubLObjectFactory.makeString("RedNumberRepositories");
        $ic64$ = SubLObjectFactory.makeSymbol("S#2408", "CYC");
        $ic65$ = SubLObjectFactory.makeString("RedNumberApplicationRepositories");
        $ic66$ = SubLObjectFactory.makeSymbol("S#2409", "CYC");
        $ic67$ = SubLObjectFactory.makeString("RedGetSystemRepository");
        $ic68$ = SubLObjectFactory.makeUninternedSymbol("US#3FF9B01");
        $ic69$ = SubLObjectFactory.makeString("RedGetMachineRepository");
        $ic70$ = SubLObjectFactory.makeUninternedSymbol("US#4868EE0");
        $ic71$ = SubLObjectFactory.makeString("RedRepositoryListNew");
        $ic72$ = SubLObjectFactory.makeUninternedSymbol("US#3FDD50B");
        $ic73$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2396", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("OPAQUE"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2410", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INT32"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER")));
        $ic74$ = SubLObjectFactory.makeString("RedMakeRepositoryListFromRepository");
        $ic75$ = SubLObjectFactory.makeUninternedSymbol("US#5D99DE7");
        $ic76$ = SubLObjectFactory.makeString("RedGetApplicationRepositories");
        $ic77$ = SubLObjectFactory.makeUninternedSymbol("US#1D923A1");
        $ic78$ = SubLObjectFactory.makeString("RedGetRepositoryListMostPrivilegedFirst");
        $ic79$ = SubLObjectFactory.makeUninternedSymbol("US#4DEEFDD");
        $ic80$ = SubLObjectFactory.makeString("RedGetRepositoryListLeastPrivilegedFirst");
        $ic81$ = SubLObjectFactory.makeUninternedSymbol("US#15C7836");
        $ic82$ = SubLObjectFactory.makeString("RedRepositoryListDispose");
        $ic83$ = SubLObjectFactory.makeSymbol("S#2411", "CYC");
        $ic84$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2412", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("OPAQUE"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER")));
        $ic85$ = SubLObjectFactory.makeString("RedGetRepositoryListLength");
        $ic86$ = SubLObjectFactory.makeSymbol("S#2413", "CYC");
        $ic87$ = SubLObjectFactory.makeString("RedRepositoryListGetElement");
        $ic88$ = SubLObjectFactory.makeUninternedSymbol("US#244484D");
        $ic89$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2396", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("OPAQUE"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#134", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INT32"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER")));
        $ic90$ = SubLObjectFactory.makeString("RedRepositoryListAddRepository");
        $ic91$ = SubLObjectFactory.makeSymbol("S#2414", "CYC");
        $ic92$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2412", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("OPAQUE"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2400", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("OPAQUE"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER")));
        $ic93$ = SubLObjectFactory.makeString("RedRepositoryListGetMaxRepositories");
        $ic94$ = SubLObjectFactory.makeSymbol("S#2415", "CYC");
        $ic95$ = SubLObjectFactory.makeString("RedGetTopLevelKey");
        $ic96$ = SubLObjectFactory.makeUninternedSymbol("US#B938D9");
        $ic97$ = SubLObjectFactory.makeString("RedGetElementByKey");
        $ic98$ = SubLObjectFactory.makeUninternedSymbol("US#44477CD");
        $ic99$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2416", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("OPAQUE"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#131", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("POINTER"), (SubLObject)SubLObjectFactory.makeKeyword("CHAR")), (SubLObject)SubLObjectFactory.makeKeyword("STRING")));
        $ic100$ = SubLObjectFactory.makeString("RedElementNumberSubKeys");
        $ic101$ = SubLObjectFactory.makeSymbol("S#2417", "CYC");
        $ic102$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2416", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("OPAQUE"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER")));
        $ic103$ = SubLObjectFactory.makeString("RedGetSubKeyIterator");
        $ic104$ = SubLObjectFactory.makeUninternedSymbol("US#24DA330");
        $ic105$ = SubLObjectFactory.makeString("RedIteratorDispose");
        $ic106$ = SubLObjectFactory.makeSymbol("S#2418", "CYC");
        $ic107$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2419", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("OPAQUE"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER")));
        $ic108$ = SubLObjectFactory.makeString("RedIteratorHasNext");
        $ic109$ = SubLObjectFactory.makeSymbol("S#2420", "CYC");
        $ic110$ = SubLObjectFactory.makeString("RedIteratorNext");
        $ic111$ = SubLObjectFactory.makeUninternedSymbol("US#6BF7268");
        $ic112$ = SubLObjectFactory.makeString("RedIteratorPeek");
        $ic113$ = SubLObjectFactory.makeUninternedSymbol("US#76F75F7");
        $ic114$ = SubLObjectFactory.makeString("RedGetKey");
        $ic115$ = SubLObjectFactory.makeUninternedSymbol("US#2CCE7DB");
        $ic116$ = SubLObjectFactory.makeString("RedGetDataTypeString");
        $ic117$ = SubLObjectFactory.makeUninternedSymbol("US#6395D39");
        $ic118$ = SubLObjectFactory.makeString("RedGetValueSize");
        $ic119$ = SubLObjectFactory.makeSymbol("S#2421", "CYC");
        $ic120$ = SubLObjectFactory.makeString("RedGetRedElementRepository");
        $ic121$ = SubLObjectFactory.makeUninternedSymbol("US#42E1365");
        $ic122$ = SubLObjectFactory.makeString("RedGetStringValue");
        $ic123$ = SubLObjectFactory.makeUninternedSymbol("US#7FABA39");
        $ic124$ = SubLObjectFactory.makeString("RedGetBlobValue");
        $ic125$ = SubLObjectFactory.makeUninternedSymbol("US#431616");
        $ic126$ = SubLObjectFactory.makeString("RedCopyBlobValue");
        $ic127$ = SubLObjectFactory.makeSymbol("S#2422", "CYC");
        $ic128$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2416", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("OPAQUE"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2423", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("POINTER"), (SubLObject)SubLObjectFactory.makeKeyword("INT32")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VECTOR"), (SubLObject)SubLObjectFactory.makeKeyword("FIXNUM"))));
        $ic129$ = SubLObjectFactory.makeKeyword("FIXNUM");
        $ic130$ = SubLObjectFactory.makeString("RedGetIntValue32");
        $ic131$ = SubLObjectFactory.makeSymbol("S#2424", "CYC");
        $ic132$ = SubLObjectFactory.makeString("RedGetExtendedNameWithSeparator");
        $ic133$ = SubLObjectFactory.makeUninternedSymbol("US#1B1F3F");
        $ic134$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2416", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("OPAQUE"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#131", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("POINTER"), (SubLObject)SubLObjectFactory.makeKeyword("CHAR")), (SubLObject)SubLObjectFactory.makeKeyword("STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2425", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("CHAR"), (SubLObject)SubLObjectFactory.makeKeyword("FIXNUM")));
        $ic135$ = SubLObjectFactory.makeString("RedGetExtendedNameWithPeriodSeparator");
        $ic136$ = SubLObjectFactory.makeUninternedSymbol("US#3969905");
        $ic137$ = SubLObjectFactory.makeString("RedGetTopLevelSuperElement");
        $ic138$ = SubLObjectFactory.makeUninternedSymbol("US#38F321D");
        $ic139$ = SubLObjectFactory.makeString("RedGetSuperElementByKey");
        $ic140$ = SubLObjectFactory.makeUninternedSymbol("US#35B003");
        $ic141$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2426", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("OPAQUE"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#131", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("POINTER"), (SubLObject)SubLObjectFactory.makeKeyword("CHAR")), (SubLObject)SubLObjectFactory.makeKeyword("STRING")));
        $ic142$ = SubLObjectFactory.makeString("RedSuperElementSubkeyExists");
        $ic143$ = SubLObjectFactory.makeSymbol("S#2427", "CYC");
        $ic144$ = SubLObjectFactory.makeString("RedSuperElementGetElement");
        $ic145$ = SubLObjectFactory.makeUninternedSymbol("US#35C740A");
        $ic146$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2426", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("OPAQUE"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER")));
        $ic147$ = SubLObjectFactory.makeString("RedSuperElementGetRepositoryList");
        $ic148$ = SubLObjectFactory.makeUninternedSymbol("US#506D89F");
        $ic149$ = SubLObjectFactory.makeString("RedSuperElementDispose");
        $ic150$ = SubLObjectFactory.makeSymbol("S#2428", "CYC");
        $ic151$ = SubLObjectFactory.makeString("RedGetExtendedNameWithSeparatorList");
        $ic152$ = SubLObjectFactory.makeUninternedSymbol("US#36B2447");
        $ic153$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2426", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("OPAQUE"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#131", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("POINTER"), (SubLObject)SubLObjectFactory.makeKeyword("CHAR")), (SubLObject)SubLObjectFactory.makeKeyword("STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2425", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("CHAR"), (SubLObject)SubLObjectFactory.makeKeyword("FIXNUM")));
        $ic154$ = SubLObjectFactory.makeString("RedGetExtendedNameWithPeriodSeparatorList");
        $ic155$ = SubLObjectFactory.makeUninternedSymbol("US#5E4FFE4");
        $ic156$ = SubLObjectFactory.makeString("RedGetSuperElementIterator");
        $ic157$ = SubLObjectFactory.makeUninternedSymbol("US#12A4970");
        $ic158$ = SubLObjectFactory.makeString("RedSuperElementIteratorHasNext");
        $ic159$ = SubLObjectFactory.makeSymbol("S#2429", "CYC");
        $ic160$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2430", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("OPAQUE"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER")));
        $ic161$ = SubLObjectFactory.makeString("RedSuperElementIteratorNext");
        $ic162$ = SubLObjectFactory.makeUninternedSymbol("US#5C6F795");
        $ic163$ = SubLObjectFactory.makeString("RedSuperElementIteratorPeek");
        $ic164$ = SubLObjectFactory.makeUninternedSymbol("US#286E98A");
        $ic165$ = SubLObjectFactory.makeString("RedSuperElementIteratorGetRepositoryList");
        $ic166$ = SubLObjectFactory.makeUninternedSymbol("US#FB74F8");
        $ic167$ = SubLObjectFactory.makeString("RedSuperElementIteratorDispose");
        $ic168$ = SubLObjectFactory.makeSymbol("S#2431", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0025.class
	Total time: 174 ms
	
	Decompiled with Procyon 0.5.32.
*/