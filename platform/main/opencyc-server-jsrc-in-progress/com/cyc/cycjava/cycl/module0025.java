package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
        final SubLObject var1 = Functions.funcall((SubLObject)$ic3$);
        if (NIL != Alien.alien_null_ptrP(var1, (SubLObject)$ic5$)) {
            return (SubLObject)NIL;
        }
        return var1;
    }
    
    public static SubLObject f1263(final SubLObject var2) {
        final SubLObject var3 = Functions.funcall((SubLObject)$ic11$, var2);
        if (NIL != Alien.alien_null_ptrP(var3, (SubLObject)$ic5$)) {
            return (SubLObject)$ic13$;
        }
        return var3;
    }
    
    public static SubLObject f1264(final SubLObject var2) {
        final SubLObject var3 = Functions.funcall((SubLObject)$ic17$, var2);
        if (NIL != Alien.alien_null_ptrP(var3, (SubLObject)$ic5$)) {
            return (SubLObject)$ic13$;
        }
        return var3;
    }
    
    public static SubLObject f1265(final SubLObject var2) {
        final SubLObject var3 = Functions.funcall((SubLObject)$ic19$, var2);
        if (NIL != Alien.alien_null_ptrP(var3, (SubLObject)$ic5$)) {
            return (SubLObject)$ic13$;
        }
        return var3;
    }
    
    public static SubLObject f1266(final SubLObject var2) {
        final SubLObject var3 = Functions.funcall((SubLObject)$ic21$, var2);
        if (NIL != Alien.alien_null_ptrP(var3, (SubLObject)$ic5$)) {
            return (SubLObject)$ic13$;
        }
        return var3;
    }
    
    public static SubLObject f1267(final SubLObject var2) {
        final SubLObject var3 = Functions.funcall((SubLObject)$ic23$, var2);
        if (NIL != Alien.alien_null_ptrP(var3, (SubLObject)$ic5$)) {
            return (SubLObject)$ic13$;
        }
        return var3;
    }
    
    public static SubLObject f1268(final SubLObject var2, final SubLObject var3) {
        final SubLObject var4 = Functions.funcall((SubLObject)$ic27$, var2, var3);
        if (NIL != Alien.alien_null_ptrP(var4, (SubLObject)$ic5$)) {
            return (SubLObject)NIL;
        }
        return var4;
    }
    
    public static SubLObject f1269(final SubLObject var2, final SubLObject var4) {
        final SubLObject var5 = Functions.funcall((SubLObject)$ic29$, var2, var4);
        if (NIL != Alien.alien_null_ptrP(var5, (SubLObject)$ic5$)) {
            return (SubLObject)NIL;
        }
        return var5;
    }
    
    public static SubLObject f1270(final SubLObject var5) {
        final SubLObject var6 = Functions.funcall((SubLObject)$ic37$, var5);
        if (NIL != Alien.alien_null_ptrP(var6, (SubLObject)$ic5$)) {
            return (SubLObject)$ic13$;
        }
        return var6;
    }
    
    public static SubLObject f1271(final SubLObject var5) {
        final SubLObject var6 = Functions.funcall((SubLObject)$ic39$, var5);
        if (NIL != Alien.alien_null_ptrP(var6, (SubLObject)$ic5$)) {
            return (SubLObject)$ic13$;
        }
        return var6;
    }
    
    public static SubLObject f1272(final SubLObject var5) {
        final SubLObject var6 = Functions.funcall((SubLObject)$ic41$, var5);
        if (NIL != Alien.alien_null_ptrP(var6, (SubLObject)$ic5$)) {
            return (SubLObject)$ic13$;
        }
        return var6;
    }
    
    public static SubLObject f1273(final SubLObject var5) {
        final SubLObject var6 = Functions.funcall((SubLObject)$ic43$, var5);
        if (NIL != Alien.alien_null_ptrP(var6, (SubLObject)$ic5$)) {
            return (SubLObject)$ic13$;
        }
        return var6;
    }
    
    public static SubLObject f1274(final SubLObject var5) {
        final SubLObject var6 = Functions.funcall((SubLObject)$ic45$, var5);
        if (NIL != Alien.alien_null_ptrP(var6, (SubLObject)$ic5$)) {
            return (SubLObject)$ic13$;
        }
        return var6;
    }
    
    public static SubLObject f1275(final SubLObject var5) {
        final SubLObject var6 = Functions.funcall((SubLObject)$ic58$, var5);
        if (NIL != Alien.alien_null_ptrP(var6, (SubLObject)$ic5$)) {
            return (SubLObject)$ic13$;
        }
        return var6;
    }
    
    public static SubLObject f1276(final SubLObject var5) {
        final SubLObject var6 = Functions.funcall((SubLObject)$ic62$, var5);
        if (NIL != Alien.alien_null_ptrP(var6, (SubLObject)$ic5$)) {
            return (SubLObject)$ic13$;
        }
        return var6;
    }
    
    public static SubLObject f1277(final SubLObject var2) {
        final SubLObject var3 = Functions.funcall((SubLObject)$ic68$, var2);
        if (NIL != Alien.alien_null_ptrP(var3, (SubLObject)$ic5$)) {
            return (SubLObject)NIL;
        }
        return var3;
    }
    
    public static SubLObject f1278(final SubLObject var2) {
        final SubLObject var3 = Functions.funcall((SubLObject)$ic70$, var2);
        if (NIL != Alien.alien_null_ptrP(var3, (SubLObject)$ic5$)) {
            return (SubLObject)NIL;
        }
        return var3;
    }
    
    public static SubLObject f1279(final SubLObject var2, final SubLObject var6) {
        final SubLObject var7 = Functions.funcall((SubLObject)$ic72$, var2, var6);
        if (NIL != Alien.alien_null_ptrP(var7, (SubLObject)$ic5$)) {
            return (SubLObject)NIL;
        }
        return var7;
    }
    
    public static SubLObject f1280(final SubLObject var5) {
        final SubLObject var6 = Functions.funcall((SubLObject)$ic75$, var5);
        if (NIL != Alien.alien_null_ptrP(var6, (SubLObject)$ic5$)) {
            return (SubLObject)NIL;
        }
        return var6;
    }
    
    public static SubLObject f1281(final SubLObject var2) {
        final SubLObject var3 = Functions.funcall((SubLObject)$ic77$, var2);
        if (NIL != Alien.alien_null_ptrP(var3, (SubLObject)$ic5$)) {
            return (SubLObject)NIL;
        }
        return var3;
    }
    
    public static SubLObject f1282(final SubLObject var2) {
        final SubLObject var3 = Functions.funcall((SubLObject)$ic79$, var2);
        if (NIL != Alien.alien_null_ptrP(var3, (SubLObject)$ic5$)) {
            return (SubLObject)NIL;
        }
        return var3;
    }
    
    public static SubLObject f1283(final SubLObject var2) {
        final SubLObject var3 = Functions.funcall((SubLObject)$ic81$, var2);
        if (NIL != Alien.alien_null_ptrP(var3, (SubLObject)$ic5$)) {
            return (SubLObject)NIL;
        }
        return var3;
    }
    
    public static SubLObject f1284(final SubLObject var7, final SubLObject var8) {
        final SubLObject var9 = Functions.funcall((SubLObject)$ic88$, var7, var8);
        if (NIL != Alien.alien_null_ptrP(var9, (SubLObject)$ic5$)) {
            return (SubLObject)NIL;
        }
        return var9;
    }
    
    public static SubLObject f1285(final SubLObject var5) {
        final SubLObject var6 = Functions.funcall((SubLObject)$ic96$, var5);
        if (NIL != Alien.alien_null_ptrP(var6, (SubLObject)$ic5$)) {
            return (SubLObject)NIL;
        }
        return var6;
    }
    
    public static SubLObject f1286(final SubLObject var9, final SubLObject var10) {
        final SubLObject var11 = Functions.funcall((SubLObject)$ic98$, var9, var10);
        if (NIL != Alien.alien_null_ptrP(var11, (SubLObject)$ic5$)) {
            return (SubLObject)NIL;
        }
        return var11;
    }
    
    public static SubLObject f1287(final SubLObject var9) {
        final SubLObject var10 = Functions.funcall((SubLObject)$ic104$, var9);
        if (NIL != Alien.alien_null_ptrP(var10, (SubLObject)$ic5$)) {
            return (SubLObject)NIL;
        }
        return var10;
    }
    
    public static SubLObject f1288(final SubLObject var11) {
        final SubLObject var12 = Functions.funcall((SubLObject)$ic111$, var11);
        if (NIL != Alien.alien_null_ptrP(var12, (SubLObject)$ic5$)) {
            return (SubLObject)NIL;
        }
        return var12;
    }
    
    public static SubLObject f1289(final SubLObject var11) {
        final SubLObject var12 = Functions.funcall((SubLObject)$ic113$, var11);
        if (NIL != Alien.alien_null_ptrP(var12, (SubLObject)$ic5$)) {
            return (SubLObject)NIL;
        }
        return var12;
    }
    
    public static SubLObject f1290(final SubLObject var9) {
        final SubLObject var10 = Functions.funcall((SubLObject)$ic115$, var9);
        if (NIL != Alien.alien_null_ptrP(var10, (SubLObject)$ic5$)) {
            return (SubLObject)$ic13$;
        }
        return var10;
    }
    
    public static SubLObject f1291(final SubLObject var9) {
        final SubLObject var10 = Functions.funcall((SubLObject)$ic117$, var9);
        if (NIL != Alien.alien_null_ptrP(var10, (SubLObject)$ic5$)) {
            return (SubLObject)$ic13$;
        }
        return var10;
    }
    
    public static SubLObject f1292(final SubLObject var9) {
        final SubLObject var10 = Functions.funcall((SubLObject)$ic121$, var9);
        if (NIL != Alien.alien_null_ptrP(var10, (SubLObject)$ic5$)) {
            return (SubLObject)NIL;
        }
        return var10;
    }
    
    public static SubLObject f1293(final SubLObject var9) {
        final SubLObject var10 = Functions.funcall((SubLObject)$ic123$, var9);
        if (NIL != Alien.alien_null_ptrP(var10, (SubLObject)$ic5$)) {
            return (SubLObject)$ic13$;
        }
        return var10;
    }
    
    public static SubLObject f1294(final SubLObject var9) {
        final SubLObject var10 = Functions.funcall((SubLObject)$ic125$, var9);
        if (NIL != Alien.alien_null_ptrP(var10, (SubLObject)$ic5$)) {
            return (SubLObject)$ic13$;
        }
        return var10;
    }
    
    public static SubLObject f1295(final SubLObject var9) {
        foreign.ensure_foreign_shared_library_loaded((SubLObject)$ic0$, (SubLObject)UNPROVIDED);
        final SubLObject var10 = Functions.funcall((SubLObject)$ic119$, var9);
        final SubLObject var11 = foreign.vector_for_marshalling(var10, (SubLObject)$ic129$, (SubLObject)ZERO_INTEGER);
        Functions.funcall((SubLObject)$ic127$, var9, var11);
        return var11;
    }
    
    public static SubLObject f1296(final SubLObject var9) {
        foreign.ensure_foreign_shared_library_loaded((SubLObject)$ic0$, (SubLObject)UNPROVIDED);
        final SubLObject var10 = f1295(var9);
        if (var10.equal((SubLObject)ZERO_INTEGER)) {
            return (SubLObject)NIL;
        }
        return var10;
    }
    
    public static SubLObject f1297(final SubLObject var9, final SubLObject var10, final SubLObject var15) {
        final SubLObject var16 = Functions.funcall((SubLObject)$ic133$, var9, var10, var15);
        if (NIL != Alien.alien_null_ptrP(var16, (SubLObject)$ic5$)) {
            return (SubLObject)NIL;
        }
        return var16;
    }
    
    public static SubLObject f1298(final SubLObject var9, final SubLObject var10) {
        final SubLObject var11 = Functions.funcall((SubLObject)$ic136$, var9, var10);
        if (NIL != Alien.alien_null_ptrP(var11, (SubLObject)$ic5$)) {
            return (SubLObject)NIL;
        }
        return var11;
    }
    
    public static SubLObject f1299(final SubLObject var7) {
        final SubLObject var8 = Functions.funcall((SubLObject)$ic138$, var7);
        if (NIL != Alien.alien_null_ptrP(var8, (SubLObject)$ic5$)) {
            return (SubLObject)NIL;
        }
        return var8;
    }
    
    public static SubLObject f1300(final SubLObject var16, final SubLObject var10) {
        final SubLObject var17 = Functions.funcall((SubLObject)$ic140$, var16, var10);
        if (NIL != Alien.alien_null_ptrP(var17, (SubLObject)$ic5$)) {
            return (SubLObject)NIL;
        }
        return var17;
    }
    
    public static SubLObject f1301(final SubLObject var16) {
        final SubLObject var17 = Functions.funcall((SubLObject)$ic145$, var16);
        if (NIL != Alien.alien_null_ptrP(var17, (SubLObject)$ic5$)) {
            return (SubLObject)NIL;
        }
        return var17;
    }
    
    public static SubLObject f1302(final SubLObject var16) {
        final SubLObject var17 = Functions.funcall((SubLObject)$ic148$, var16);
        if (NIL != Alien.alien_null_ptrP(var17, (SubLObject)$ic5$)) {
            return (SubLObject)NIL;
        }
        return var17;
    }
    
    public static SubLObject f1303(final SubLObject var16, final SubLObject var10, final SubLObject var15) {
        final SubLObject var17 = Functions.funcall((SubLObject)$ic152$, var16, var10, var15);
        if (NIL != Alien.alien_null_ptrP(var17, (SubLObject)$ic5$)) {
            return (SubLObject)NIL;
        }
        return var17;
    }
    
    public static SubLObject f1304(final SubLObject var16, final SubLObject var10) {
        final SubLObject var17 = Functions.funcall((SubLObject)$ic155$, var16, var10);
        if (NIL != Alien.alien_null_ptrP(var17, (SubLObject)$ic5$)) {
            return (SubLObject)NIL;
        }
        return var17;
    }
    
    public static SubLObject f1305(final SubLObject var16) {
        final SubLObject var17 = Functions.funcall((SubLObject)$ic157$, var16);
        if (NIL != Alien.alien_null_ptrP(var17, (SubLObject)$ic5$)) {
            return (SubLObject)NIL;
        }
        return var17;
    }
    
    public static SubLObject f1306(final SubLObject var17) {
        final SubLObject var18 = Functions.funcall((SubLObject)$ic162$, var17);
        if (NIL != Alien.alien_null_ptrP(var18, (SubLObject)$ic5$)) {
            return (SubLObject)NIL;
        }
        return var18;
    }
    
    public static SubLObject f1307(final SubLObject var17) {
        final SubLObject var18 = Functions.funcall((SubLObject)$ic164$, var17);
        if (NIL != Alien.alien_null_ptrP(var18, (SubLObject)$ic5$)) {
            return (SubLObject)NIL;
        }
        return var18;
    }
    
    public static SubLObject f1308(final SubLObject var17) {
        final SubLObject var18 = Functions.funcall((SubLObject)$ic166$, var17);
        if (NIL != Alien.alien_null_ptrP(var18, (SubLObject)$ic5$)) {
            return (SubLObject)NIL;
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f1310() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f1311() {
        foreign.declare_foreign_shared_library((SubLObject)$ic0$, (SubLObject)$ic1$);
        Alien.def_foreign_function((SubLObject)$ic0$, (SubLObject)$ic2$, (SubLObject)$ic3$, (SubLObject)NIL, (SubLObject)$ic4$, (SubLObject)$ic5$, (SubLObject)NIL);
        Alien.def_foreign_function((SubLObject)$ic0$, (SubLObject)$ic6$, (SubLObject)$ic7$, (SubLObject)$ic8$, (SubLObject)$ic9$, (SubLObject)$ic5$, (SubLObject)NIL);
        Alien.def_foreign_function((SubLObject)$ic0$, (SubLObject)$ic10$, (SubLObject)$ic11$, (SubLObject)$ic8$, (SubLObject)$ic12$, (SubLObject)$ic5$, (SubLObject)$ic13$);
        Alien.def_foreign_function((SubLObject)$ic0$, (SubLObject)$ic14$, (SubLObject)$ic15$, (SubLObject)$ic8$, (SubLObject)$ic9$, (SubLObject)$ic5$, (SubLObject)NIL);
        Alien.def_foreign_function((SubLObject)$ic0$, (SubLObject)$ic16$, (SubLObject)$ic17$, (SubLObject)$ic8$, (SubLObject)$ic12$, (SubLObject)$ic5$, (SubLObject)$ic13$);
        Alien.def_foreign_function((SubLObject)$ic0$, (SubLObject)$ic18$, (SubLObject)$ic19$, (SubLObject)$ic8$, (SubLObject)$ic12$, (SubLObject)$ic5$, (SubLObject)$ic13$);
        Alien.def_foreign_function((SubLObject)$ic0$, (SubLObject)$ic20$, (SubLObject)$ic21$, (SubLObject)$ic8$, (SubLObject)$ic12$, (SubLObject)$ic5$, (SubLObject)$ic13$);
        Alien.def_foreign_function((SubLObject)$ic0$, (SubLObject)$ic22$, (SubLObject)$ic23$, (SubLObject)$ic8$, (SubLObject)$ic12$, (SubLObject)$ic5$, (SubLObject)$ic13$);
        Alien.def_foreign_function((SubLObject)$ic0$, (SubLObject)$ic24$, (SubLObject)$ic25$, (SubLObject)$ic8$, (SubLObject)NIL, (SubLObject)$ic5$, (SubLObject)NIL);
        Alien.def_foreign_function((SubLObject)$ic0$, (SubLObject)$ic26$, (SubLObject)$ic27$, (SubLObject)$ic28$, (SubLObject)$ic4$, (SubLObject)$ic5$, (SubLObject)NIL);
        Alien.def_foreign_function((SubLObject)$ic0$, (SubLObject)$ic26$, (SubLObject)$ic29$, (SubLObject)$ic30$, (SubLObject)$ic4$, (SubLObject)$ic5$, (SubLObject)NIL);
        Alien.def_foreign_function((SubLObject)$ic0$, (SubLObject)$ic31$, (SubLObject)$ic32$, (SubLObject)$ic33$, (SubLObject)NIL, (SubLObject)$ic5$, (SubLObject)NIL);
        Alien.def_foreign_function((SubLObject)$ic0$, (SubLObject)$ic34$, (SubLObject)$ic35$, (SubLObject)$ic33$, (SubLObject)$ic9$, (SubLObject)$ic5$, (SubLObject)NIL);
        Alien.def_foreign_function((SubLObject)$ic0$, (SubLObject)$ic36$, (SubLObject)$ic37$, (SubLObject)$ic33$, (SubLObject)$ic12$, (SubLObject)$ic5$, (SubLObject)$ic13$);
        Alien.def_foreign_function((SubLObject)$ic0$, (SubLObject)$ic38$, (SubLObject)$ic39$, (SubLObject)$ic33$, (SubLObject)$ic12$, (SubLObject)$ic5$, (SubLObject)$ic13$);
        Alien.def_foreign_function((SubLObject)$ic0$, (SubLObject)$ic40$, (SubLObject)$ic41$, (SubLObject)$ic33$, (SubLObject)$ic12$, (SubLObject)$ic5$, (SubLObject)$ic13$);
        Alien.def_foreign_function((SubLObject)$ic0$, (SubLObject)$ic42$, (SubLObject)$ic43$, (SubLObject)$ic33$, (SubLObject)$ic12$, (SubLObject)$ic5$, (SubLObject)$ic13$);
        Alien.def_foreign_function((SubLObject)$ic0$, (SubLObject)$ic44$, (SubLObject)$ic45$, (SubLObject)$ic33$, (SubLObject)$ic12$, (SubLObject)$ic5$, (SubLObject)$ic13$);
        Alien.def_foreign_function((SubLObject)$ic0$, (SubLObject)$ic46$, (SubLObject)$ic47$, (SubLObject)$ic48$, (SubLObject)$ic9$, (SubLObject)$ic5$, (SubLObject)NIL);
        Alien.def_foreign_function((SubLObject)$ic0$, (SubLObject)$ic49$, (SubLObject)$ic50$, (SubLObject)$ic33$, (SubLObject)$ic9$, (SubLObject)$ic5$, (SubLObject)NIL);
        Alien.def_foreign_function((SubLObject)$ic0$, (SubLObject)$ic51$, (SubLObject)$ic52$, (SubLObject)$ic33$, (SubLObject)$ic9$, (SubLObject)$ic5$, (SubLObject)NIL);
        Alien.def_foreign_function((SubLObject)$ic0$, (SubLObject)$ic53$, (SubLObject)$ic54$, (SubLObject)$ic33$, (SubLObject)$ic9$, (SubLObject)$ic5$, (SubLObject)NIL);
        Alien.def_foreign_function((SubLObject)$ic0$, (SubLObject)$ic55$, (SubLObject)$ic56$, (SubLObject)$ic33$, (SubLObject)$ic9$, (SubLObject)$ic5$, (SubLObject)NIL);
        Alien.def_foreign_function((SubLObject)$ic0$, (SubLObject)$ic57$, (SubLObject)$ic58$, (SubLObject)$ic33$, (SubLObject)$ic12$, (SubLObject)$ic5$, (SubLObject)$ic13$);
        Alien.def_foreign_function((SubLObject)$ic0$, (SubLObject)$ic59$, (SubLObject)$ic60$, (SubLObject)$ic33$, (SubLObject)$ic9$, (SubLObject)$ic5$, (SubLObject)NIL);
        Alien.def_foreign_function((SubLObject)$ic0$, (SubLObject)$ic61$, (SubLObject)$ic62$, (SubLObject)$ic33$, (SubLObject)$ic12$, (SubLObject)$ic5$, (SubLObject)$ic13$);
        Alien.def_foreign_function((SubLObject)$ic0$, (SubLObject)$ic63$, (SubLObject)$ic64$, (SubLObject)$ic8$, (SubLObject)$ic9$, (SubLObject)$ic5$, (SubLObject)NIL);
        Alien.def_foreign_function((SubLObject)$ic0$, (SubLObject)$ic65$, (SubLObject)$ic66$, (SubLObject)$ic8$, (SubLObject)$ic9$, (SubLObject)$ic5$, (SubLObject)NIL);
        Alien.def_foreign_function((SubLObject)$ic0$, (SubLObject)$ic67$, (SubLObject)$ic68$, (SubLObject)$ic8$, (SubLObject)$ic4$, (SubLObject)$ic5$, (SubLObject)NIL);
        Alien.def_foreign_function((SubLObject)$ic0$, (SubLObject)$ic69$, (SubLObject)$ic70$, (SubLObject)$ic8$, (SubLObject)$ic4$, (SubLObject)$ic5$, (SubLObject)NIL);
        Alien.def_foreign_function((SubLObject)$ic0$, (SubLObject)$ic71$, (SubLObject)$ic72$, (SubLObject)$ic73$, (SubLObject)$ic4$, (SubLObject)$ic5$, (SubLObject)NIL);
        Alien.def_foreign_function((SubLObject)$ic0$, (SubLObject)$ic74$, (SubLObject)$ic75$, (SubLObject)$ic33$, (SubLObject)$ic4$, (SubLObject)$ic5$, (SubLObject)NIL);
        Alien.def_foreign_function((SubLObject)$ic0$, (SubLObject)$ic76$, (SubLObject)$ic77$, (SubLObject)$ic8$, (SubLObject)$ic4$, (SubLObject)$ic5$, (SubLObject)NIL);
        Alien.def_foreign_function((SubLObject)$ic0$, (SubLObject)$ic78$, (SubLObject)$ic79$, (SubLObject)$ic8$, (SubLObject)$ic4$, (SubLObject)$ic5$, (SubLObject)NIL);
        Alien.def_foreign_function((SubLObject)$ic0$, (SubLObject)$ic80$, (SubLObject)$ic81$, (SubLObject)$ic8$, (SubLObject)$ic4$, (SubLObject)$ic5$, (SubLObject)NIL);
        Alien.def_foreign_function((SubLObject)$ic0$, (SubLObject)$ic82$, (SubLObject)$ic83$, (SubLObject)$ic84$, (SubLObject)NIL, (SubLObject)$ic5$, (SubLObject)NIL);
        Alien.def_foreign_function((SubLObject)$ic0$, (SubLObject)$ic85$, (SubLObject)$ic86$, (SubLObject)$ic84$, (SubLObject)$ic9$, (SubLObject)$ic5$, (SubLObject)NIL);
        Alien.def_foreign_function((SubLObject)$ic0$, (SubLObject)$ic87$, (SubLObject)$ic88$, (SubLObject)$ic89$, (SubLObject)$ic4$, (SubLObject)$ic5$, (SubLObject)NIL);
        Alien.def_foreign_function((SubLObject)$ic0$, (SubLObject)$ic90$, (SubLObject)$ic91$, (SubLObject)$ic92$, (SubLObject)$ic9$, (SubLObject)$ic5$, (SubLObject)NIL);
        Alien.def_foreign_function((SubLObject)$ic0$, (SubLObject)$ic93$, (SubLObject)$ic94$, (SubLObject)$ic84$, (SubLObject)$ic9$, (SubLObject)$ic5$, (SubLObject)NIL);
        Alien.def_foreign_function((SubLObject)$ic0$, (SubLObject)$ic95$, (SubLObject)$ic96$, (SubLObject)$ic33$, (SubLObject)$ic4$, (SubLObject)$ic5$, (SubLObject)NIL);
        Alien.def_foreign_function((SubLObject)$ic0$, (SubLObject)$ic97$, (SubLObject)$ic98$, (SubLObject)$ic99$, (SubLObject)$ic4$, (SubLObject)$ic5$, (SubLObject)NIL);
        Alien.def_foreign_function((SubLObject)$ic0$, (SubLObject)$ic100$, (SubLObject)$ic101$, (SubLObject)$ic102$, (SubLObject)$ic9$, (SubLObject)$ic5$, (SubLObject)NIL);
        Alien.def_foreign_function((SubLObject)$ic0$, (SubLObject)$ic103$, (SubLObject)$ic104$, (SubLObject)$ic102$, (SubLObject)$ic4$, (SubLObject)$ic5$, (SubLObject)NIL);
        Alien.def_foreign_function((SubLObject)$ic0$, (SubLObject)$ic105$, (SubLObject)$ic106$, (SubLObject)$ic107$, (SubLObject)NIL, (SubLObject)$ic5$, (SubLObject)NIL);
        Alien.def_foreign_function((SubLObject)$ic0$, (SubLObject)$ic108$, (SubLObject)$ic109$, (SubLObject)$ic107$, (SubLObject)$ic9$, (SubLObject)$ic5$, (SubLObject)NIL);
        Alien.def_foreign_function((SubLObject)$ic0$, (SubLObject)$ic110$, (SubLObject)$ic111$, (SubLObject)$ic107$, (SubLObject)$ic4$, (SubLObject)$ic5$, (SubLObject)NIL);
        Alien.def_foreign_function((SubLObject)$ic0$, (SubLObject)$ic112$, (SubLObject)$ic113$, (SubLObject)$ic107$, (SubLObject)$ic4$, (SubLObject)$ic5$, (SubLObject)NIL);
        Alien.def_foreign_function((SubLObject)$ic0$, (SubLObject)$ic114$, (SubLObject)$ic115$, (SubLObject)$ic102$, (SubLObject)$ic12$, (SubLObject)$ic5$, (SubLObject)$ic13$);
        Alien.def_foreign_function((SubLObject)$ic0$, (SubLObject)$ic116$, (SubLObject)$ic117$, (SubLObject)$ic102$, (SubLObject)$ic12$, (SubLObject)$ic5$, (SubLObject)$ic13$);
        Alien.def_foreign_function((SubLObject)$ic0$, (SubLObject)$ic118$, (SubLObject)$ic119$, (SubLObject)$ic102$, (SubLObject)$ic9$, (SubLObject)$ic5$, (SubLObject)NIL);
        Alien.def_foreign_function((SubLObject)$ic0$, (SubLObject)$ic120$, (SubLObject)$ic121$, (SubLObject)$ic102$, (SubLObject)$ic4$, (SubLObject)$ic5$, (SubLObject)NIL);
        Alien.def_foreign_function((SubLObject)$ic0$, (SubLObject)$ic122$, (SubLObject)$ic123$, (SubLObject)$ic102$, (SubLObject)$ic12$, (SubLObject)$ic5$, (SubLObject)$ic13$);
        Alien.def_foreign_function((SubLObject)$ic0$, (SubLObject)$ic124$, (SubLObject)$ic125$, (SubLObject)$ic102$, (SubLObject)$ic12$, (SubLObject)$ic5$, (SubLObject)$ic13$);
        Alien.def_foreign_function((SubLObject)$ic0$, (SubLObject)$ic126$, (SubLObject)$ic127$, (SubLObject)$ic128$, (SubLObject)$ic9$, (SubLObject)$ic5$, (SubLObject)NIL);
        Alien.def_foreign_function((SubLObject)$ic0$, (SubLObject)$ic130$, (SubLObject)$ic131$, (SubLObject)$ic102$, (SubLObject)$ic9$, (SubLObject)$ic5$, (SubLObject)NIL);
        Alien.def_foreign_function((SubLObject)$ic0$, (SubLObject)$ic132$, (SubLObject)$ic133$, (SubLObject)$ic134$, (SubLObject)$ic4$, (SubLObject)$ic5$, (SubLObject)NIL);
        Alien.def_foreign_function((SubLObject)$ic0$, (SubLObject)$ic135$, (SubLObject)$ic136$, (SubLObject)$ic99$, (SubLObject)$ic4$, (SubLObject)$ic5$, (SubLObject)NIL);
        Alien.def_foreign_function((SubLObject)$ic0$, (SubLObject)$ic137$, (SubLObject)$ic138$, (SubLObject)$ic84$, (SubLObject)$ic4$, (SubLObject)$ic5$, (SubLObject)NIL);
        Alien.def_foreign_function((SubLObject)$ic0$, (SubLObject)$ic139$, (SubLObject)$ic140$, (SubLObject)$ic141$, (SubLObject)$ic4$, (SubLObject)$ic5$, (SubLObject)NIL);
        Alien.def_foreign_function((SubLObject)$ic0$, (SubLObject)$ic142$, (SubLObject)$ic143$, (SubLObject)$ic141$, (SubLObject)$ic9$, (SubLObject)$ic5$, (SubLObject)NIL);
        Alien.def_foreign_function((SubLObject)$ic0$, (SubLObject)$ic144$, (SubLObject)$ic145$, (SubLObject)$ic146$, (SubLObject)$ic4$, (SubLObject)$ic5$, (SubLObject)NIL);
        Alien.def_foreign_function((SubLObject)$ic0$, (SubLObject)$ic147$, (SubLObject)$ic148$, (SubLObject)$ic146$, (SubLObject)$ic4$, (SubLObject)$ic5$, (SubLObject)NIL);
        Alien.def_foreign_function((SubLObject)$ic0$, (SubLObject)$ic149$, (SubLObject)$ic150$, (SubLObject)$ic146$, (SubLObject)NIL, (SubLObject)$ic5$, (SubLObject)NIL);
        Alien.def_foreign_function((SubLObject)$ic0$, (SubLObject)$ic151$, (SubLObject)$ic152$, (SubLObject)$ic153$, (SubLObject)$ic4$, (SubLObject)$ic5$, (SubLObject)NIL);
        Alien.def_foreign_function((SubLObject)$ic0$, (SubLObject)$ic154$, (SubLObject)$ic155$, (SubLObject)$ic141$, (SubLObject)$ic4$, (SubLObject)$ic5$, (SubLObject)NIL);
        Alien.def_foreign_function((SubLObject)$ic0$, (SubLObject)$ic156$, (SubLObject)$ic157$, (SubLObject)$ic146$, (SubLObject)$ic4$, (SubLObject)$ic5$, (SubLObject)NIL);
        Alien.def_foreign_function((SubLObject)$ic0$, (SubLObject)$ic158$, (SubLObject)$ic159$, (SubLObject)$ic160$, (SubLObject)$ic9$, (SubLObject)$ic5$, (SubLObject)NIL);
        Alien.def_foreign_function((SubLObject)$ic0$, (SubLObject)$ic161$, (SubLObject)$ic162$, (SubLObject)$ic160$, (SubLObject)$ic4$, (SubLObject)$ic5$, (SubLObject)NIL);
        Alien.def_foreign_function((SubLObject)$ic0$, (SubLObject)$ic163$, (SubLObject)$ic164$, (SubLObject)$ic160$, (SubLObject)$ic4$, (SubLObject)$ic5$, (SubLObject)NIL);
        Alien.def_foreign_function((SubLObject)$ic0$, (SubLObject)$ic165$, (SubLObject)$ic166$, (SubLObject)$ic160$, (SubLObject)$ic4$, (SubLObject)$ic5$, (SubLObject)NIL);
        Alien.def_foreign_function((SubLObject)$ic0$, (SubLObject)$ic167$, (SubLObject)$ic168$, (SubLObject)$ic160$, (SubLObject)NIL, (SubLObject)$ic5$, (SubLObject)NIL);
        return (SubLObject)NIL;
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
        $ic0$ = makeKeyword("RED-SHARED");
        $ic1$ = ConsesLow.list(new SubLObject[] { makeKeyword("COMMENT"), makeString("RED Cyc Configuration Repository"), makeKeyword("AUTHOR"), makeString("Chester John <cjohn@cyc.com>"), makeKeyword("FILENAME"), makeString("RED Library (auto-loaded)"), makeKeyword("DEPENDS-ON"), NIL, makeKeyword("COPYRIGHT"), makeString("Copyright (c) 2004 - 2006 Cycorp Inc."), makeKeyword("URI"), makeString("http://www.opencyc.com") });
        $ic2$ = makeString("RedNew");
        $ic3$ = makeUninternedSymbol("US#467DB6D");
        $ic4$ = makeKeyword("OPAQUE");
        $ic5$ = makeKeyword("C");
        $ic6$ = makeString("RedGetReasonCode");
        $ic7$ = makeSymbol("S#2395", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#2396", "CYC"), (SubLObject)makeKeyword("OPAQUE"), (SubLObject)makeKeyword("INTEGER")));
        $ic9$ = makeKeyword("INT32");
        $ic10$ = makeString("RedGetReasonCodeString");
        $ic11$ = makeUninternedSymbol("US#3C9D4D6");
        $ic12$ = ConsesLow.list((SubLObject)makeKeyword("POINTER"), (SubLObject)makeKeyword("CHAR"));
        $ic13$ = makeString("");
        $ic14$ = makeString("RedGetReasonSubCode");
        $ic15$ = makeSymbol("S#2397", "CYC");
        $ic16$ = makeString("RedGetReasonSubCodeString");
        $ic17$ = makeUninternedSymbol("US#6898566");
        $ic18$ = makeString("RedGetVersionString");
        $ic19$ = makeUninternedSymbol("US#7EBAD21");
        $ic20$ = makeString("RedGetDate");
        $ic21$ = makeUninternedSymbol("US#2F516A5");
        $ic22$ = makeString("RedGetTime");
        $ic23$ = makeUninternedSymbol("US#2C73625");
        $ic24$ = makeString("RedDispose");
        $ic25$ = makeSymbol("S#2398", "CYC");
        $ic26$ = makeString("RedLoadRedRepositoryFilename");
        $ic27$ = makeUninternedSymbol("US#5164112");
        $ic28$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#2396", "CYC"), (SubLObject)makeKeyword("OPAQUE"), (SubLObject)makeKeyword("INTEGER")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#885", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("POINTER"), (SubLObject)makeKeyword("CHAR")), (SubLObject)makeKeyword("STRING")));
        $ic29$ = makeUninternedSymbol("US#277E6B8");
        $ic30$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#2396", "CYC"), (SubLObject)makeKeyword("OPAQUE"), (SubLObject)makeKeyword("INTEGER")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#29", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("POINTER"), (SubLObject)makeKeyword("CHAR")), (SubLObject)makeKeyword("STRING")));
        $ic31$ = makeString("RedRepositoryDispose");
        $ic32$ = makeSymbol("S#2399", "CYC");
        $ic33$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#2400", "CYC"), (SubLObject)makeKeyword("OPAQUE"), (SubLObject)makeKeyword("INTEGER")));
        $ic34$ = makeString("RedValueExists");
        $ic35$ = makeSymbol("S#2401", "CYC");
        $ic36$ = makeString("RedGetRepositoryName");
        $ic37$ = makeUninternedSymbol("US#48D7BBB");
        $ic38$ = makeString("RedGetRepositoryFilename");
        $ic39$ = makeUninternedSymbol("US#DF7516");
        $ic40$ = makeString("RedGetRepositoryTypeString");
        $ic41$ = makeUninternedSymbol("US#77A4C7");
        $ic42$ = makeString("RedGetRepositoryVersionString");
        $ic43$ = makeUninternedSymbol("US#319792D");
        $ic44$ = makeString("RedGetRepositoryDate");
        $ic45$ = makeUninternedSymbol("US#4877BA2");
        $ic46$ = makeString("RedRepositoryPointerValid");
        $ic47$ = makeSymbol("S#2402", "CYC");
        $ic48$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#2396", "CYC"), (SubLObject)makeKeyword("OPAQUE"), (SubLObject)makeKeyword("INTEGER")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#2400", "CYC"), (SubLObject)makeKeyword("OPAQUE"), (SubLObject)makeKeyword("INTEGER")));
        $ic49$ = makeString("RedGetRepositoryVersionMajor");
        $ic50$ = makeSymbol("S#2403", "CYC");
        $ic51$ = makeString("RedGetRepositoryVersionMinor");
        $ic52$ = makeSymbol("S#2404", "CYC");
        $ic53$ = makeString("RedGetRepositoryVersionFix");
        $ic54$ = makeSymbol("S#2405", "CYC");
        $ic55$ = makeString("RedGetRepositoryVersionSpin");
        $ic56$ = makeSymbol("S#2406", "CYC");
        $ic57$ = makeString("RedGetRepositoryTime");
        $ic58$ = makeUninternedSymbol("US#977BBB");
        $ic59$ = makeString("RedRepositoryIsValid");
        $ic60$ = makeSymbol("S#2407", "CYC");
        $ic61$ = makeString("RedGetRepositoryReasonCodeString");
        $ic62$ = makeUninternedSymbol("US#35A3FF0");
        $ic63$ = makeString("RedNumberRepositories");
        $ic64$ = makeSymbol("S#2408", "CYC");
        $ic65$ = makeString("RedNumberApplicationRepositories");
        $ic66$ = makeSymbol("S#2409", "CYC");
        $ic67$ = makeString("RedGetSystemRepository");
        $ic68$ = makeUninternedSymbol("US#3FF9B01");
        $ic69$ = makeString("RedGetMachineRepository");
        $ic70$ = makeUninternedSymbol("US#4868EE0");
        $ic71$ = makeString("RedRepositoryListNew");
        $ic72$ = makeUninternedSymbol("US#3FDD50B");
        $ic73$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#2396", "CYC"), (SubLObject)makeKeyword("OPAQUE"), (SubLObject)makeKeyword("INTEGER")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#2410", "CYC"), (SubLObject)makeKeyword("INT32"), (SubLObject)makeKeyword("INTEGER")));
        $ic74$ = makeString("RedMakeRepositoryListFromRepository");
        $ic75$ = makeUninternedSymbol("US#5D99DE7");
        $ic76$ = makeString("RedGetApplicationRepositories");
        $ic77$ = makeUninternedSymbol("US#1D923A1");
        $ic78$ = makeString("RedGetRepositoryListMostPrivilegedFirst");
        $ic79$ = makeUninternedSymbol("US#4DEEFDD");
        $ic80$ = makeString("RedGetRepositoryListLeastPrivilegedFirst");
        $ic81$ = makeUninternedSymbol("US#15C7836");
        $ic82$ = makeString("RedRepositoryListDispose");
        $ic83$ = makeSymbol("S#2411", "CYC");
        $ic84$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#2412", "CYC"), (SubLObject)makeKeyword("OPAQUE"), (SubLObject)makeKeyword("INTEGER")));
        $ic85$ = makeString("RedGetRepositoryListLength");
        $ic86$ = makeSymbol("S#2413", "CYC");
        $ic87$ = makeString("RedRepositoryListGetElement");
        $ic88$ = makeUninternedSymbol("US#244484D");
        $ic89$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#2396", "CYC"), (SubLObject)makeKeyword("OPAQUE"), (SubLObject)makeKeyword("INTEGER")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#134", "CYC"), (SubLObject)makeKeyword("INT32"), (SubLObject)makeKeyword("INTEGER")));
        $ic90$ = makeString("RedRepositoryListAddRepository");
        $ic91$ = makeSymbol("S#2414", "CYC");
        $ic92$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#2412", "CYC"), (SubLObject)makeKeyword("OPAQUE"), (SubLObject)makeKeyword("INTEGER")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#2400", "CYC"), (SubLObject)makeKeyword("OPAQUE"), (SubLObject)makeKeyword("INTEGER")));
        $ic93$ = makeString("RedRepositoryListGetMaxRepositories");
        $ic94$ = makeSymbol("S#2415", "CYC");
        $ic95$ = makeString("RedGetTopLevelKey");
        $ic96$ = makeUninternedSymbol("US#B938D9");
        $ic97$ = makeString("RedGetElementByKey");
        $ic98$ = makeUninternedSymbol("US#44477CD");
        $ic99$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#2416", "CYC"), (SubLObject)makeKeyword("OPAQUE"), (SubLObject)makeKeyword("INTEGER")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#131", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("POINTER"), (SubLObject)makeKeyword("CHAR")), (SubLObject)makeKeyword("STRING")));
        $ic100$ = makeString("RedElementNumberSubKeys");
        $ic101$ = makeSymbol("S#2417", "CYC");
        $ic102$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#2416", "CYC"), (SubLObject)makeKeyword("OPAQUE"), (SubLObject)makeKeyword("INTEGER")));
        $ic103$ = makeString("RedGetSubKeyIterator");
        $ic104$ = makeUninternedSymbol("US#24DA330");
        $ic105$ = makeString("RedIteratorDispose");
        $ic106$ = makeSymbol("S#2418", "CYC");
        $ic107$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#2419", "CYC"), (SubLObject)makeKeyword("OPAQUE"), (SubLObject)makeKeyword("INTEGER")));
        $ic108$ = makeString("RedIteratorHasNext");
        $ic109$ = makeSymbol("S#2420", "CYC");
        $ic110$ = makeString("RedIteratorNext");
        $ic111$ = makeUninternedSymbol("US#6BF7268");
        $ic112$ = makeString("RedIteratorPeek");
        $ic113$ = makeUninternedSymbol("US#76F75F7");
        $ic114$ = makeString("RedGetKey");
        $ic115$ = makeUninternedSymbol("US#2CCE7DB");
        $ic116$ = makeString("RedGetDataTypeString");
        $ic117$ = makeUninternedSymbol("US#6395D39");
        $ic118$ = makeString("RedGetValueSize");
        $ic119$ = makeSymbol("S#2421", "CYC");
        $ic120$ = makeString("RedGetRedElementRepository");
        $ic121$ = makeUninternedSymbol("US#42E1365");
        $ic122$ = makeString("RedGetStringValue");
        $ic123$ = makeUninternedSymbol("US#7FABA39");
        $ic124$ = makeString("RedGetBlobValue");
        $ic125$ = makeUninternedSymbol("US#431616");
        $ic126$ = makeString("RedCopyBlobValue");
        $ic127$ = makeSymbol("S#2422", "CYC");
        $ic128$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#2416", "CYC"), (SubLObject)makeKeyword("OPAQUE"), (SubLObject)makeKeyword("INTEGER")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#2423", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("POINTER"), (SubLObject)makeKeyword("INT32")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VECTOR"), (SubLObject)makeKeyword("FIXNUM"))));
        $ic129$ = makeKeyword("FIXNUM");
        $ic130$ = makeString("RedGetIntValue32");
        $ic131$ = makeSymbol("S#2424", "CYC");
        $ic132$ = makeString("RedGetExtendedNameWithSeparator");
        $ic133$ = makeUninternedSymbol("US#1B1F3F");
        $ic134$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#2416", "CYC"), (SubLObject)makeKeyword("OPAQUE"), (SubLObject)makeKeyword("INTEGER")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#131", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("POINTER"), (SubLObject)makeKeyword("CHAR")), (SubLObject)makeKeyword("STRING")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#2425", "CYC"), (SubLObject)makeKeyword("CHAR"), (SubLObject)makeKeyword("FIXNUM")));
        $ic135$ = makeString("RedGetExtendedNameWithPeriodSeparator");
        $ic136$ = makeUninternedSymbol("US#3969905");
        $ic137$ = makeString("RedGetTopLevelSuperElement");
        $ic138$ = makeUninternedSymbol("US#38F321D");
        $ic139$ = makeString("RedGetSuperElementByKey");
        $ic140$ = makeUninternedSymbol("US#35B003");
        $ic141$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#2426", "CYC"), (SubLObject)makeKeyword("OPAQUE"), (SubLObject)makeKeyword("INTEGER")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#131", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("POINTER"), (SubLObject)makeKeyword("CHAR")), (SubLObject)makeKeyword("STRING")));
        $ic142$ = makeString("RedSuperElementSubkeyExists");
        $ic143$ = makeSymbol("S#2427", "CYC");
        $ic144$ = makeString("RedSuperElementGetElement");
        $ic145$ = makeUninternedSymbol("US#35C740A");
        $ic146$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#2426", "CYC"), (SubLObject)makeKeyword("OPAQUE"), (SubLObject)makeKeyword("INTEGER")));
        $ic147$ = makeString("RedSuperElementGetRepositoryList");
        $ic148$ = makeUninternedSymbol("US#506D89F");
        $ic149$ = makeString("RedSuperElementDispose");
        $ic150$ = makeSymbol("S#2428", "CYC");
        $ic151$ = makeString("RedGetExtendedNameWithSeparatorList");
        $ic152$ = makeUninternedSymbol("US#36B2447");
        $ic153$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#2426", "CYC"), (SubLObject)makeKeyword("OPAQUE"), (SubLObject)makeKeyword("INTEGER")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#131", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("POINTER"), (SubLObject)makeKeyword("CHAR")), (SubLObject)makeKeyword("STRING")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#2425", "CYC"), (SubLObject)makeKeyword("CHAR"), (SubLObject)makeKeyword("FIXNUM")));
        $ic154$ = makeString("RedGetExtendedNameWithPeriodSeparatorList");
        $ic155$ = makeUninternedSymbol("US#5E4FFE4");
        $ic156$ = makeString("RedGetSuperElementIterator");
        $ic157$ = makeUninternedSymbol("US#12A4970");
        $ic158$ = makeString("RedSuperElementIteratorHasNext");
        $ic159$ = makeSymbol("S#2429", "CYC");
        $ic160$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#2430", "CYC"), (SubLObject)makeKeyword("OPAQUE"), (SubLObject)makeKeyword("INTEGER")));
        $ic161$ = makeString("RedSuperElementIteratorNext");
        $ic162$ = makeUninternedSymbol("US#5C6F795");
        $ic163$ = makeString("RedSuperElementIteratorPeek");
        $ic164$ = makeUninternedSymbol("US#286E98A");
        $ic165$ = makeString("RedSuperElementIteratorGetRepositoryList");
        $ic166$ = makeUninternedSymbol("US#FB74F8");
        $ic167$ = makeString("RedSuperElementIteratorDispose");
        $ic168$ = makeSymbol("S#2431", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 174 ms
	
	Decompiled with Procyon 0.5.32.
*/