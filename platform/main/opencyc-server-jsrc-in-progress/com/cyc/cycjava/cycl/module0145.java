package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0145 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0145";
    public static final String myFingerPrint = "0c532b9731ef46bee9d9391f28a27653672de74600354b652fac5a797a0ac394";
    public static SubLSymbol $g1884$;
    public static SubLSymbol $g1885$;
    public static SubLSymbol $g1886$;
    public static SubLSymbol $g1887$;
    public static SubLSymbol $g1888$;
    public static SubLSymbol $g1889$;
    public static SubLSymbol $g1890$;
    public static SubLSymbol $g1891$;
    public static SubLSymbol $g1892$;
    public static SubLSymbol $g1893$;
    public static SubLSymbol $g1894$;
    public static SubLSymbol $g1895$;
    public static SubLSymbol $g1896$;
    public static SubLSymbol $g1897$;
    public static SubLSymbol $g1898$;
    public static SubLSymbol $g1899$;
    public static SubLSymbol $g1900$;
    public static SubLSymbol $g1901$;
    public static SubLSymbol $g1902$;
    public static SubLSymbol $g1903$;
    public static SubLSymbol $g1904$;
    public static SubLSymbol $g1905$;
    public static SubLSymbol $g1906$;
    public static SubLSymbol $g1907$;
    public static SubLSymbol $g1908$;
    public static SubLSymbol $g1909$;
    public static SubLSymbol $g1910$;
    public static SubLSymbol $g1911$;
    public static SubLSymbol $g1912$;
    public static SubLSymbol $g1913$;
    public static SubLSymbol $g1914$;
    public static SubLSymbol $g1915$;
    public static SubLSymbol $g1916$;
    public static SubLSymbol $g1917$;
    public static SubLSymbol $g1918$;
    public static SubLSymbol $g1919$;
    public static SubLSymbol $g1920$;
    public static SubLSymbol $g1921$;
    public static SubLSymbol $g1922$;
    public static SubLSymbol $g1923$;
    public static SubLSymbol $g1924$;
    public static SubLSymbol $g1925$;
    public static SubLSymbol $g1926$;
    public static SubLSymbol $g1927$;
    public static SubLSymbol $g1928$;
    public static SubLSymbol $g1929$;
    public static SubLSymbol $g1930$;
    public static SubLSymbol $g1931$;
    public static SubLSymbol $g1932$;
    public static SubLSymbol $g1933$;
    public static SubLSymbol $g1934$;
    public static SubLSymbol $g1935$;
    public static SubLSymbol $g1936$;
    public static SubLSymbol $g1937$;
    public static SubLSymbol $g1938$;
    public static SubLSymbol $g1939$;
    public static SubLSymbol $g1940$;
    public static SubLSymbol $g1941$;
    public static SubLSymbol $g1942$;
    public static SubLSymbol $g1943$;
    public static SubLSymbol $g1944$;
    public static SubLSymbol $g1945$;
    public static SubLSymbol $g1946$;
    public static SubLSymbol $g1947$;
    public static SubLSymbol $g1948$;
    public static SubLSymbol $g1949$;
    public static SubLSymbol $g1950$;
    public static SubLSymbol $g1951$;
    public static SubLSymbol $g1952$;
    public static SubLSymbol $g1953$;
    public static SubLSymbol $g1954$;
    public static SubLSymbol $g1955$;
    public static SubLSymbol $g1956$;
    public static SubLSymbol $g1957$;
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLList $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLList $ic17$;
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
    private static final SubLString $ic42$;
    private static final SubLString $ic43$;
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
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
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
    private static final SubLList $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLList $ic78$;
    private static final SubLList $ic79$;
    private static final SubLList $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLList $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLList $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLList $ic89$;
    private static final SubLList $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLList $ic94$;
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
    private static final SubLList $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLSymbol $ic110$;
    
    public static SubLObject f9471() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return $g1917$.getDynamicValue(var1);
    }
    
    public static SubLObject f9472() {
        final SubLObject var2 = f9471();
        if (NIL != assertion_handles_oc.f11035(var2)) {
            return module0178.f11287(var2);
        }
        if (NIL != module0191.f11952(var2)) {
            return module0191.f11976(var2);
        }
        return module0313.f21151((SubLObject)ONE_INTEGER, (SubLObject)$ic42$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f9473() {
        final SubLObject var2 = f9471();
        if (NIL != module0178.f11284(var2)) {
            return module0178.f11333(var2);
        }
        if (NIL != module0191.f11952(var2)) {
            return module0205.f13132(module0191.f11969(var2));
        }
        return module0313.f21151((SubLObject)ONE_INTEGER, (SubLObject)$ic43$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f9474(final SubLObject var3, final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var7;
        final SubLObject var6 = var7 = var3.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)$ic70$);
        var8 = var7.first();
        var7 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)$ic70$);
        var9 = var7.first();
        var7 = var7.rest();
        if (NIL == var7) {
            SubLObject var10 = (SubLObject)NIL;
            if (var9.isCons()) {
                SubLObject var11 = conses_high.getf(var9, (SubLObject)$ic71$, (SubLObject)UNPROVIDED);
                SubLObject var12 = conses_high.getf(var9, (SubLObject)$ic72$, (SubLObject)UNPROVIDED);
                SubLObject var13 = conses_high.getf(var9, (SubLObject)$ic73$, (SubLObject)UNPROVIDED);
                SubLObject var14 = conses_high.getf(var9, (SubLObject)$ic74$, (SubLObject)UNPROVIDED);
                final SubLObject var15 = conses_high.getf(var9, (SubLObject)$ic75$, (SubLObject)UNPROVIDED);
                SubLObject var16 = (SubLObject)$ic71$;
                if (NIL == var13) {
                    var13 = (SubLObject)ONE_INTEGER;
                }
                if (NIL == var14) {
                    var14 = (SubLObject)TWO_INTEGER;
                }
                if (!var11.isCons()) {
                    var11 = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var12, var13, var14));
                }
                if (var11.isCons() && NIL == var11.rest()) {
                    var16 = (SubLObject)$ic72$;
                    var12 = var11.first().first();
                    var13 = conses_high.second(var11.first());
                    var14 = conses_high.third(var11.first());
                }
                SubLObject var17 = (SubLObject)NIL;
                SubLObject var18 = (SubLObject)NIL;
                var17 = var9;
                var18 = var17.first();
                while (NIL != var17) {
                    if (NIL != module0004.f104(var18, $g1885$.getDynamicValue(var5), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        final SubLObject var19 = Packages.intern(module0038.f2638(conses_high.second(var17)), (SubLObject)UNPROVIDED);
                        final SubLObject var20 = module0316.f21378(var15, conses_high.third(conses_high.assoc(var18, $g1884$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)));
                        final SubLObject var21 = module0035.f1992(var20);
                        final SubLObject var22 = conses_high.second(conses_high.assoc(var18, $g1884$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                        final SubLObject var23 = var16;
                        if (var23.eql((SubLObject)$ic72$)) {
                            var10 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic76$, var19, var20, (SubLObject)ConsesLow.listS((SubLObject)$ic77$, (SubLObject)$ic78$, (SubLObject)ConsesLow.list((SubLObject)$ic77$, (SubLObject)ConsesLow.listS((SubLObject)ConsesLow.list((SubLObject)$ic7$, var12), (SubLObject)$ic79$, (SubLObject)ConsesLow.list((SubLObject)$ic10$, var13), (SubLObject)ConsesLow.list((SubLObject)$ic11$, var14), (SubLObject)$ic80$), (SubLObject)ConsesLow.list((SubLObject)$ic81$, (SubLObject)$ic82$, reader.bq_cons(var22, ConsesLow.append(var21, (SubLObject)NIL)))), (SubLObject)$ic83$)), var10);
                        }
                        else if (var23.eql((SubLObject)$ic71$)) {
                            var10 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic76$, var19, var20, (SubLObject)ConsesLow.listS((SubLObject)$ic77$, (SubLObject)$ic78$, (SubLObject)ConsesLow.list((SubLObject)$ic77$, reader.bq_cons((SubLObject)ConsesLow.list((SubLObject)$ic12$, (SubLObject)ConsesLow.list((SubLObject)$ic84$, var11)), (SubLObject)$ic85$), (SubLObject)ConsesLow.list((SubLObject)$ic81$, (SubLObject)$ic82$, reader.bq_cons(var22, ConsesLow.append(var21, (SubLObject)NIL)))), (SubLObject)$ic83$)), var10);
                        }
                    }
                    var17 = conses_high.cddr(var17);
                    var18 = var17.first();
                }
            }
            return (SubLObject)ConsesLow.listS((SubLObject)$ic86$, (SubLObject)ConsesLow.list((SubLObject)$ic87$, var8, (SubLObject)ConsesLow.list((SubLObject)$ic84$, var9)), (SubLObject)ConsesLow.listS((SubLObject)$ic88$, var8, (SubLObject)$ic89$), ConsesLow.append(var10, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var6, (SubLObject)$ic70$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9475(final SubLObject var3, final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var7;
        final SubLObject var6 = var7 = var3.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)$ic70$);
        var8 = var7.first();
        var7 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)$ic70$);
        var9 = var7.first();
        var7 = var7.rest();
        if (NIL == var7) {
            SubLObject var10 = (SubLObject)NIL;
            if (var9.isCons()) {
                final SubLObject var11 = conses_high.getf(var9, (SubLObject)$ic72$, (SubLObject)UNPROVIDED);
                final SubLObject var12 = conses_high.getf(var9, (SubLObject)$ic104$, (SubLObject)UNPROVIDED);
                final SubLObject var13 = conses_high.getf(var9, (SubLObject)$ic75$, (SubLObject)UNPROVIDED);
                final SubLObject var14 = (SubLObject)$ic72$;
                final SubLObject var15 = (SubLObject)TWO_INTEGER;
                final SubLObject var16 = (SubLObject)ONE_INTEGER;
                final SubLObject var17 = (SubLObject)ONE_INTEGER;
                final SubLObject var18 = (SubLObject)TWO_INTEGER;
                SubLObject var19 = (SubLObject)NIL;
                SubLObject var20 = (SubLObject)NIL;
                var19 = var9;
                var20 = var19.first();
                while (NIL != var19) {
                    if (NIL != module0004.f104(var20, $g1945$.getDynamicValue(var5), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        final SubLObject var21 = Packages.intern(module0038.f2638(conses_high.second(var19)), (SubLObject)UNPROVIDED);
                        final SubLObject var22 = module0316.f21378(var13, conses_high.third(conses_high.assoc(var20, $g1944$.getDynamicValue(var5), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)));
                        final SubLObject var23 = module0035.f1992(var22);
                        final SubLObject var24 = var20;
                        final SubLObject var25 = var14;
                        if (var25.eql((SubLObject)$ic72$)) {
                            var10 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic76$, var21, var22, (SubLObject)ConsesLow.listS((SubLObject)$ic77$, (SubLObject)$ic78$, (SubLObject)ConsesLow.list((SubLObject)$ic77$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic96$, var11), (SubLObject)ConsesLow.list((SubLObject)$ic7$, var12), (SubLObject)$ic79$, (SubLObject)ConsesLow.list((SubLObject)$ic99$, var15), (SubLObject)ConsesLow.list((SubLObject)$ic100$, var16), (SubLObject)ConsesLow.list((SubLObject)$ic10$, var17), (SubLObject)ConsesLow.list((SubLObject)$ic11$, var18), (SubLObject)ConsesLow.list((SubLObject)$ic103$, (SubLObject)ConsesLow.list((SubLObject)$ic105$, var12))), (SubLObject)ConsesLow.list((SubLObject)$ic81$, (SubLObject)$ic82$, (SubLObject)ConsesLow.listS((SubLObject)$ic106$, var24, ConsesLow.append(var23, (SubLObject)NIL)))), (SubLObject)$ic83$)), var10);
                        }
                    }
                    var19 = conses_high.cddr(var19);
                    var20 = var19.first();
                }
            }
            return (SubLObject)ConsesLow.listS((SubLObject)$ic86$, (SubLObject)ConsesLow.list((SubLObject)$ic107$, var8, (SubLObject)ConsesLow.list((SubLObject)$ic84$, var9)), (SubLObject)ConsesLow.listS((SubLObject)$ic88$, var8, (SubLObject)$ic108$), ConsesLow.append(var10, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var6, (SubLObject)$ic70$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9476(final SubLObject var3, final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var7;
        final SubLObject var6 = var7 = var3.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)$ic70$);
        var8 = var7.first();
        var7 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)$ic70$);
        var9 = var7.first();
        var7 = var7.rest();
        if (NIL == var7) {
            SubLObject var10 = (SubLObject)NIL;
            if (var9.isCons()) {
                final SubLObject var11 = conses_high.getf(var9, (SubLObject)$ic72$, (SubLObject)UNPROVIDED);
                final SubLObject var12 = conses_high.getf(var9, (SubLObject)$ic104$, (SubLObject)UNPROVIDED);
                final SubLObject var13 = conses_high.getf(var9, (SubLObject)$ic75$, (SubLObject)UNPROVIDED);
                final SubLObject var14 = (SubLObject)$ic72$;
                final SubLObject var15 = (SubLObject)ONE_INTEGER;
                final SubLObject var16 = (SubLObject)TWO_INTEGER;
                final SubLObject var17 = (SubLObject)ONE_INTEGER;
                final SubLObject var18 = (SubLObject)TWO_INTEGER;
                SubLObject var19 = (SubLObject)NIL;
                SubLObject var20 = (SubLObject)NIL;
                var19 = var9;
                var20 = var19.first();
                while (NIL != var19) {
                    if (NIL != module0004.f104(var20, $g1945$.getDynamicValue(var5), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        final SubLObject var21 = Packages.intern(module0038.f2638(conses_high.second(var19)), (SubLObject)UNPROVIDED);
                        final SubLObject var22 = module0316.f21378(var13, conses_high.third(conses_high.assoc(var20, $g1944$.getDynamicValue(var5), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)));
                        final SubLObject var23 = module0035.f1992(var22);
                        final SubLObject var24 = var20;
                        final SubLObject var25 = var14;
                        if (var25.eql((SubLObject)$ic72$)) {
                            var10 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic76$, var21, var22, (SubLObject)ConsesLow.listS((SubLObject)$ic77$, (SubLObject)$ic78$, (SubLObject)ConsesLow.list((SubLObject)$ic77$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic96$, var11), (SubLObject)ConsesLow.list((SubLObject)$ic7$, var12), (SubLObject)$ic79$, (SubLObject)ConsesLow.list((SubLObject)$ic99$, var15), (SubLObject)ConsesLow.list((SubLObject)$ic100$, var16), (SubLObject)ConsesLow.list((SubLObject)$ic10$, var17), (SubLObject)ConsesLow.list((SubLObject)$ic11$, var18), (SubLObject)ConsesLow.list((SubLObject)$ic103$, (SubLObject)ConsesLow.list((SubLObject)$ic105$, var12))), (SubLObject)ConsesLow.list((SubLObject)$ic81$, (SubLObject)$ic82$, (SubLObject)ConsesLow.listS((SubLObject)$ic106$, var24, ConsesLow.append(var23, (SubLObject)NIL)))), (SubLObject)$ic83$)), var10);
                        }
                    }
                    var19 = conses_high.cddr(var19);
                    var20 = var19.first();
                }
            }
            return (SubLObject)ConsesLow.listS((SubLObject)$ic86$, (SubLObject)ConsesLow.list((SubLObject)$ic107$, var8, (SubLObject)ConsesLow.list((SubLObject)$ic84$, var9)), (SubLObject)ConsesLow.listS((SubLObject)$ic88$, var8, (SubLObject)$ic108$), ConsesLow.append(var10, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var6, (SubLObject)$ic70$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9477(final SubLObject var3, final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var7;
        final SubLObject var6 = var7 = var3.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)$ic70$);
        var8 = var7.first();
        var7 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)$ic70$);
        var9 = var7.first();
        var7 = var7.rest();
        if (NIL == var7) {
            SubLObject var10 = (SubLObject)NIL;
            if (var9.isCons()) {
                final SubLObject var11 = conses_high.getf(var9, (SubLObject)$ic72$, (SubLObject)UNPROVIDED);
                final SubLObject var12 = conses_high.getf(var9, (SubLObject)$ic104$, (SubLObject)UNPROVIDED);
                final SubLObject var13 = conses_high.getf(var9, (SubLObject)$ic75$, (SubLObject)UNPROVIDED);
                final SubLObject var14 = (SubLObject)$ic72$;
                final SubLObject var15 = (SubLObject)TWO_INTEGER;
                final SubLObject var16 = (SubLObject)ONE_INTEGER;
                final SubLObject var17 = (SubLObject)TWO_INTEGER;
                final SubLObject var18 = (SubLObject)ONE_INTEGER;
                SubLObject var19 = (SubLObject)NIL;
                SubLObject var20 = (SubLObject)NIL;
                var19 = var9;
                var20 = var19.first();
                while (NIL != var19) {
                    if (NIL != module0004.f104(var20, $g1945$.getDynamicValue(var5), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        final SubLObject var21 = Packages.intern(module0038.f2638(conses_high.second(var19)), (SubLObject)UNPROVIDED);
                        final SubLObject var22 = module0316.f21378(var13, conses_high.third(conses_high.assoc(var20, $g1944$.getDynamicValue(var5), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)));
                        final SubLObject var23 = module0035.f1992(var22);
                        final SubLObject var24 = var20;
                        final SubLObject var25 = var14;
                        if (var25.eql((SubLObject)$ic72$)) {
                            var10 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic76$, var21, var22, (SubLObject)ConsesLow.listS((SubLObject)$ic77$, (SubLObject)$ic78$, (SubLObject)ConsesLow.list((SubLObject)$ic77$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic96$, var11), (SubLObject)ConsesLow.list((SubLObject)$ic7$, var12), (SubLObject)$ic79$, (SubLObject)ConsesLow.list((SubLObject)$ic99$, var15), (SubLObject)ConsesLow.list((SubLObject)$ic100$, var16), (SubLObject)ConsesLow.list((SubLObject)$ic10$, var17), (SubLObject)ConsesLow.list((SubLObject)$ic11$, var18), (SubLObject)ConsesLow.list((SubLObject)$ic103$, (SubLObject)ConsesLow.list((SubLObject)$ic105$, var12))), (SubLObject)ConsesLow.list((SubLObject)$ic81$, (SubLObject)$ic82$, (SubLObject)ConsesLow.listS((SubLObject)$ic106$, var24, ConsesLow.append(var23, (SubLObject)NIL)))), (SubLObject)$ic83$)), var10);
                        }
                    }
                    var19 = conses_high.cddr(var19);
                    var20 = var19.first();
                }
            }
            return (SubLObject)ConsesLow.listS((SubLObject)$ic86$, (SubLObject)ConsesLow.list((SubLObject)$ic107$, var8, (SubLObject)ConsesLow.list((SubLObject)$ic84$, var9)), (SubLObject)ConsesLow.listS((SubLObject)$ic88$, var8, (SubLObject)$ic108$), ConsesLow.append(var10, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var6, (SubLObject)$ic70$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9478(final SubLObject var3, final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var7;
        final SubLObject var6 = var7 = var3.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)$ic70$);
        var8 = var7.first();
        var7 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)$ic70$);
        var9 = var7.first();
        var7 = var7.rest();
        if (NIL == var7) {
            SubLObject var10 = (SubLObject)NIL;
            if (var9.isCons()) {
                final SubLObject var11 = conses_high.getf(var9, (SubLObject)$ic72$, (SubLObject)UNPROVIDED);
                final SubLObject var12 = conses_high.getf(var9, (SubLObject)$ic104$, (SubLObject)UNPROVIDED);
                final SubLObject var13 = conses_high.getf(var9, (SubLObject)$ic75$, (SubLObject)UNPROVIDED);
                final SubLObject var14 = (SubLObject)$ic72$;
                final SubLObject var15 = (SubLObject)ONE_INTEGER;
                final SubLObject var16 = (SubLObject)TWO_INTEGER;
                final SubLObject var17 = (SubLObject)TWO_INTEGER;
                final SubLObject var18 = (SubLObject)ONE_INTEGER;
                SubLObject var19 = (SubLObject)NIL;
                SubLObject var20 = (SubLObject)NIL;
                var19 = var9;
                var20 = var19.first();
                while (NIL != var19) {
                    if (NIL != module0004.f104(var20, $g1945$.getDynamicValue(var5), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        final SubLObject var21 = Packages.intern(module0038.f2638(conses_high.second(var19)), (SubLObject)UNPROVIDED);
                        final SubLObject var22 = module0316.f21378(var13, conses_high.third(conses_high.assoc(var20, $g1944$.getDynamicValue(var5), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)));
                        final SubLObject var23 = module0035.f1992(var22);
                        final SubLObject var24 = var20;
                        final SubLObject var25 = var14;
                        if (var25.eql((SubLObject)$ic72$)) {
                            var10 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic76$, var21, var22, (SubLObject)ConsesLow.listS((SubLObject)$ic77$, (SubLObject)$ic78$, (SubLObject)ConsesLow.list((SubLObject)$ic77$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic96$, var11), (SubLObject)ConsesLow.list((SubLObject)$ic7$, var12), (SubLObject)$ic79$, (SubLObject)ConsesLow.list((SubLObject)$ic99$, var15), (SubLObject)ConsesLow.list((SubLObject)$ic100$, var16), (SubLObject)ConsesLow.list((SubLObject)$ic10$, var17), (SubLObject)ConsesLow.list((SubLObject)$ic11$, var18), (SubLObject)ConsesLow.list((SubLObject)$ic103$, (SubLObject)ConsesLow.list((SubLObject)$ic105$, var12))), (SubLObject)ConsesLow.list((SubLObject)$ic81$, (SubLObject)$ic82$, (SubLObject)ConsesLow.listS((SubLObject)$ic106$, var24, ConsesLow.append(var23, (SubLObject)NIL)))), (SubLObject)$ic83$)), var10);
                        }
                    }
                    var19 = conses_high.cddr(var19);
                    var20 = var19.first();
                }
            }
            return (SubLObject)ConsesLow.listS((SubLObject)$ic86$, (SubLObject)ConsesLow.list((SubLObject)$ic107$, var8, (SubLObject)ConsesLow.list((SubLObject)$ic84$, var9)), (SubLObject)ConsesLow.listS((SubLObject)$ic88$, var8, (SubLObject)$ic108$), ConsesLow.append(var10, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var6, (SubLObject)$ic70$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9479() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return $g1957$.getDynamicValue(var1);
    }
    
    public static SubLObject f9480() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0145", "f9471", "S#11999", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0145", "f9472", "S#12000", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0145", "f9473", "S#12001", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0145", "f9474", "S#12002");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0145", "f9475", "S#12003");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0145", "f9476", "S#12004");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0145", "f9477", "S#12005");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0145", "f9478", "S#12006");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0145", "f9479", "S#12007", 0, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9481() {
        $g1884$ = SubLFiles.deflexical("S#12008", (SubLObject)$ic0$);
        $g1885$ = SubLFiles.defparameter("S#12009", Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic2$), $g1884$.getGlobalValue()));
        $g1886$ = SubLFiles.defparameter("S#12010", ConsesLow.append((SubLObject)$ic4$, $g1885$.getDynamicValue()));
        $g1887$ = SubLFiles.defparameter("S#12011", (SubLObject)NIL);
        $g1888$ = SubLFiles.defparameter("S#12012", (SubLObject)NIL);
        $g1889$ = SubLFiles.defparameter("S#12013", (SubLObject)NIL);
        $g1890$ = SubLFiles.defparameter("S#12014", (SubLObject)NIL);
        $g1891$ = SubLFiles.defparameter("S#12015", (SubLObject)ONE_INTEGER);
        $g1892$ = SubLFiles.defparameter("S#12016", (SubLObject)TWO_INTEGER);
        $g1893$ = SubLFiles.defparameter("S#12017", (SubLObject)NIL);
        $g1894$ = SubLFiles.defparameter("S#12018", (SubLObject)$ic13$);
        $g1895$ = SubLFiles.defparameter("S#12019", (SubLObject)$ic15$);
        $g1896$ = SubLFiles.defparameter("S#12020", (SubLObject)$ic17$);
        $g1897$ = SubLFiles.defparameter("S#12021", (SubLObject)$ic19$);
        $g1898$ = SubLFiles.defparameter("S#12022", (SubLObject)NIL);
        $g1899$ = SubLFiles.defparameter("S#12023", (SubLObject)NIL);
        $g1900$ = SubLFiles.defparameter("S#12024", (SubLObject)NIL);
        $g1901$ = SubLFiles.defparameter("S#12025", (SubLObject)NIL);
        $g1902$ = SubLFiles.defparameter("S#12026", (SubLObject)NIL);
        $g1903$ = SubLFiles.defparameter("S#12027", (SubLObject)NIL);
        $g1904$ = SubLFiles.defparameter("S#12028", (SubLObject)NIL);
        $g1905$ = SubLFiles.defparameter("S#12029", (SubLObject)NIL);
        $g1906$ = SubLFiles.defparameter("S#12030", (SubLObject)NIL);
        $g1907$ = SubLFiles.defparameter("S#12031", (SubLObject)NIL);
        $g1908$ = SubLFiles.defparameter("S#12032", Symbols.symbol_function((SubLObject)$ic31$));
        $g1909$ = SubLFiles.defparameter("S#12033", (SubLObject)NIL);
        $g1910$ = SubLFiles.defparameter("S#12034", Symbols.symbol_function((SubLObject)EQUAL));
        $g1911$ = SubLFiles.defparameter("S#12035", (SubLObject)NIL);
        $g1912$ = SubLFiles.defparameter("S#12036", (SubLObject)ONE_INTEGER);
        $g1913$ = SubLFiles.defparameter("S#12037", (SubLObject)TWO_INTEGER);
        $g1914$ = SubLFiles.defparameter("*GT-MAX-NODES-DIRECTION*", (SubLObject)$ic38$);
        $g1915$ = SubLFiles.defparameter("S#12038", (SubLObject)T);
        $g1916$ = SubLFiles.defparameter("S#12039", (SubLObject)NIL);
        $g1917$ = SubLFiles.defparameter("S#12040", (SubLObject)NIL);
        $g1918$ = SubLFiles.defparameter("S#12041", (SubLObject)NIL);
        $g1919$ = SubLFiles.defparameter("S#12042", (SubLObject)NIL);
        $g1920$ = SubLFiles.defparameter("S#12043", (SubLObject)NIL);
        $g1921$ = SubLFiles.defparameter("S#12044", (SubLObject)NIL);
        $g1922$ = SubLFiles.defparameter("S#12045", (SubLObject)ZERO_INTEGER);
        $g1923$ = SubLFiles.defparameter("S#12046", (SubLObject)NIL);
        $g1924$ = SubLFiles.defparameter("S#12047", (SubLObject)NIL);
        $g1925$ = SubLFiles.defparameter("S#12048", (SubLObject)NIL);
        $g1926$ = SubLFiles.defparameter("S#12049", (SubLObject)ONE_INTEGER);
        $g1927$ = SubLFiles.defparameter("S#12050", (SubLObject)NIL);
        $g1928$ = SubLFiles.defparameter("S#12051", (SubLObject)ONE_INTEGER);
        $g1929$ = SubLFiles.defparameter("S#12052", (SubLObject)NIL);
        $g1930$ = SubLFiles.defparameter("S#12053", (SubLObject)TEN_INTEGER);
        $g1931$ = SubLFiles.defparameter("S#12054", (SubLObject)ZERO_INTEGER);
        $g1932$ = SubLFiles.defparameter("S#12055", (SubLObject)NIL);
        $g1933$ = SubLFiles.defparameter("S#12056", (SubLObject)ONE_INTEGER);
        $g1934$ = SubLFiles.defparameter("S#12057", (SubLObject)ZERO_INTEGER);
        $g1935$ = SubLFiles.defparameter("S#12058", (SubLObject)NIL);
        $g1936$ = SubLFiles.defparameter("S#12059", (SubLObject)NIL);
        $g1937$ = SubLFiles.defparameter("S#12060", (SubLObject)NIL);
        $g1938$ = SubLFiles.defparameter("S#12061", (SubLObject)NIL);
        $g1939$ = SubLFiles.defparameter("S#12062", (SubLObject)NIL);
        $g1940$ = SubLFiles.defparameter("S#12063", (SubLObject)ONE_INTEGER);
        $g1941$ = SubLFiles.defparameter("S#12064", (SubLObject)THREE_INTEGER);
        $g1942$ = SubLFiles.defparameter("S#12065", (SubLObject)NIL);
        $g1943$ = SubLFiles.defparameter("S#12066", (SubLObject)NIL);
        $g1944$ = SubLFiles.defparameter("S#12067", (SubLObject)$ic90$);
        $g1945$ = SubLFiles.defparameter("S#12068", Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic2$), $g1944$.getDynamicValue()));
        $g1946$ = SubLFiles.defparameter("S#12069", (SubLObject)NIL);
        $g1947$ = SubLFiles.defparameter("S#12070", ConsesLow.append((SubLObject)$ic94$, $g1945$.getDynamicValue()));
        $g1948$ = SubLFiles.defparameter("S#12071", (SubLObject)NIL);
        $g1949$ = SubLFiles.defparameter("S#12072", (SubLObject)NIL);
        $g1950$ = SubLFiles.defparameter("S#12073", (SubLObject)NIL);
        $g1951$ = SubLFiles.defparameter("S#12074", (SubLObject)ONE_INTEGER);
        $g1952$ = SubLFiles.defparameter("S#12075", (SubLObject)TWO_INTEGER);
        $g1953$ = SubLFiles.defparameter("S#12076", (SubLObject)$ic19$);
        $g1954$ = SubLFiles.defparameter("S#12077", (SubLObject)NIL);
        $g1955$ = SubLFiles.defparameter("S#12078", (SubLObject)NIL);
        $g1956$ = SubLFiles.defparameter("S#12079", (SubLObject)T);
        $g1957$ = SubLFiles.defparameter("S#12080", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9482() {
        SubLObject var39 = (SubLObject)$ic1$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)$ic3$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)$ic5$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)$ic6$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)$ic7$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)$ic8$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)$ic9$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)$ic10$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)$ic11$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)$ic12$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)$ic14$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)$ic16$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)$ic18$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)$ic20$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)$ic21$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)$ic22$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)$ic23$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)$ic24$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)$ic25$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)$ic26$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)$ic27$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)$ic28$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)$ic29$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)$ic30$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)$ic32$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)$ic33$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)$ic34$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)$ic35$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)$ic36$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)$ic37$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)$ic39$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)$ic40$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)$ic41$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)$ic44$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)$ic45$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)$ic46$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)$ic47$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)$ic48$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)$ic49$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)$ic50$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)$ic51$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)$ic52$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)$ic53$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)$ic54$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)$ic55$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)$ic56$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)$ic57$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)$ic58$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)$ic59$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)$ic60$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)$ic61$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)$ic62$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)$ic63$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)$ic64$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)$ic65$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)$ic66$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)$ic67$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)$ic68$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)$ic69$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)$ic91$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)$ic92$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)$ic93$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)$ic95$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)$ic96$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)$ic97$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)$ic98$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)$ic99$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)$ic100$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)$ic101$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)$ic102$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)$ic103$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)$ic109$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)$ic110$;
        if (NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f9480();
    }
    
    public void initializeVariables() {
        f9481();
    }
    
    public void runTopLevelForms() {
        f9482();
    }
    
    static {
        me = (SubLFile)new module0145();
        $g1884$ = null;
        $g1885$ = null;
        $g1886$ = null;
        $g1887$ = null;
        $g1888$ = null;
        $g1889$ = null;
        $g1890$ = null;
        $g1891$ = null;
        $g1892$ = null;
        $g1893$ = null;
        $g1894$ = null;
        $g1895$ = null;
        $g1896$ = null;
        $g1897$ = null;
        $g1898$ = null;
        $g1899$ = null;
        $g1900$ = null;
        $g1901$ = null;
        $g1902$ = null;
        $g1903$ = null;
        $g1904$ = null;
        $g1905$ = null;
        $g1906$ = null;
        $g1907$ = null;
        $g1908$ = null;
        $g1909$ = null;
        $g1910$ = null;
        $g1911$ = null;
        $g1912$ = null;
        $g1913$ = null;
        $g1914$ = null;
        $g1915$ = null;
        $g1916$ = null;
        $g1917$ = null;
        $g1918$ = null;
        $g1919$ = null;
        $g1920$ = null;
        $g1921$ = null;
        $g1922$ = null;
        $g1923$ = null;
        $g1924$ = null;
        $g1925$ = null;
        $g1926$ = null;
        $g1927$ = null;
        $g1928$ = null;
        $g1929$ = null;
        $g1930$ = null;
        $g1931$ = null;
        $g1932$ = null;
        $g1933$ = null;
        $g1934$ = null;
        $g1935$ = null;
        $g1936$ = null;
        $g1937$ = null;
        $g1938$ = null;
        $g1939$ = null;
        $g1940$ = null;
        $g1941$ = null;
        $g1942$ = null;
        $g1943$ = null;
        $g1944$ = null;
        $g1945$ = null;
        $g1946$ = null;
        $g1947$ = null;
        $g1948$ = null;
        $g1949$ = null;
        $g1950$ = null;
        $g1951$ = null;
        $g1952$ = null;
        $g1953$ = null;
        $g1954$ = null;
        $g1955$ = null;
        $g1956$ = null;
        $g1957$ = null;
        $ic0$ = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)makeKeyword("SUPERIORS"), (SubLObject)makeSymbol("S#12081", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10466", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)makeKeyword("INFERIORS"), (SubLObject)makeSymbol("S#12082", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10466", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)makeKeyword("MIN-SUPERIORS"), (SubLObject)makeSymbol("S#12083", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10466", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)makeKeyword("MAX-INFERIORS"), (SubLObject)makeSymbol("S#12084", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10466", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)makeKeyword("CO-INFERIORS"), (SubLObject)makeSymbol("S#12085", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10466", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)makeKeyword("CO-SUPERIORS"), (SubLObject)makeSymbol("S#12086", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10466", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)makeKeyword("REDUNDANT-SUPERIORS"), (SubLObject)makeSymbol("S#12087", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10466", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)makeKeyword("REDUNDANT-INFERIORS"), (SubLObject)makeSymbol("S#12088", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10466", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)makeKeyword("ALL-SUPERIORS"), (SubLObject)makeSymbol("S#12089", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10466", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)makeKeyword("ALL-INFERIORS"), (SubLObject)makeSymbol("S#12090", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10466", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)makeKeyword("ALL-ACCESSIBLE"), (SubLObject)makeSymbol("S#12091", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10466", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)makeKeyword("UNION-ALL-INFERIORS"), (SubLObject)makeSymbol("S#12092", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10466", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)makeKeyword("COMPOSE-FN-SUPERIORS"), (SubLObject)makeSymbol("S#12093", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10466", "CYC"), (SubLObject)makeSymbol("S#11675", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12094", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("NCONC"))), (SubLObject)makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)makeKeyword("COMPOSE-FN-INFERIORS"), (SubLObject)makeSymbol("S#12095", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10466", "CYC"), (SubLObject)makeSymbol("S#11675", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12094", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("NCONC"))), (SubLObject)makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)makeKeyword("ALL-DEPENDENT-INFERIORS"), (SubLObject)makeSymbol("S#12096", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10466", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)makeKeyword("COMPOSE-PRED-SUPERIORS"), (SubLObject)makeSymbol("S#12097", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10466", "CYC"), (SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#134", "CYC"), (SubLObject)ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12098", "CYC"), (SubLObject)TWO_INTEGER), (SubLObject)makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)makeKeyword("COMPOSE-PRED-INFERIORS"), (SubLObject)makeSymbol("S#12099", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10466", "CYC"), (SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#134", "CYC"), (SubLObject)ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12098", "CYC"), (SubLObject)TWO_INTEGER), (SubLObject)makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)makeKeyword("ROOTS"), (SubLObject)makeSymbol("S#12100", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10466", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)makeKeyword("LEAVES"), (SubLObject)makeSymbol("S#12101", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10466", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)makeKeyword("BOOLEAN?"), (SubLObject)makeSymbol("S#12102", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#750", "CYC"), (SubLObject)makeSymbol("S#751", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)makeKeyword("SUPERIOR?"), (SubLObject)makeSymbol("S#12103", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#9185", "CYC"), (SubLObject)makeSymbol("S#12104", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)makeKeyword("INFERIOR?"), (SubLObject)makeSymbol("S#12105", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12104", "CYC"), (SubLObject)makeSymbol("S#9185", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)makeKeyword("HAS-SUPERIOR?"), (SubLObject)makeSymbol("S#12106", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12104", "CYC"), (SubLObject)makeSymbol("S#9185", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)makeKeyword("HAS-INFERIOR?"), (SubLObject)makeSymbol("S#12107", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#9185", "CYC"), (SubLObject)makeSymbol("S#12104", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)makeKeyword("GATHER-SUPERIOR"), (SubLObject)makeSymbol("S#12108", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12109", "CYC"), (SubLObject)makeSymbol("S#12110", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)makeKeyword("GATHER-INFERIOR"), (SubLObject)makeSymbol("S#12111", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12112", "CYC"), (SubLObject)makeSymbol("S#12110", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)makeKeyword("CYCLES?"), (SubLObject)makeSymbol("S#12113", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10466", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)makeKeyword("COMPLETES-CYCLE?"), (SubLObject)makeSymbol("S#12114", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12115", "CYC"), (SubLObject)makeSymbol("S#12116", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)makeKeyword("MIN-NODES"), (SubLObject)makeSymbol("S#12117", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12118", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)makeKeyword("MAX-NODES"), (SubLObject)makeSymbol("S#12119", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12118", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)makeKeyword("MIN-CEILINGS"), (SubLObject)makeSymbol("S#12120", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12118", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#12121", "CYC"), (SubLObject)makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)makeKeyword("MAX-FLOORS"), (SubLObject)makeSymbol("S#12122", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12118", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#12121", "CYC"), (SubLObject)makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)makeKeyword("MIN-SUPERIORS-EXCLUDING"), (SubLObject)makeSymbol("S#12123", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12104", "CYC"), (SubLObject)makeSymbol("S#9185", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)makeKeyword("MAX-INFERIORS-EXCLUDING"), (SubLObject)makeSymbol("S#12124", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#9185", "CYC"), (SubLObject)makeSymbol("S#12104", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)makeKeyword("ANY-SUPERIOR-PATH"), (SubLObject)makeSymbol("S#12125", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12104", "CYC"), (SubLObject)makeSymbol("S#9185", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)makeKeyword("WHY-SUPERIOR?"), (SubLObject)makeSymbol("S#12126", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#9185", "CYC"), (SubLObject)makeSymbol("S#12104", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)makeKeyword("WHY-COMPLETES-CYCLE?"), (SubLObject)makeSymbol("S#12127", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12128", "CYC"), (SubLObject)makeSymbol("S#12129", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)makeKeyword("ALL-SUPERIOR-EDGES"), (SubLObject)makeSymbol("S#12130", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12104", "CYC"), (SubLObject)makeSymbol("S#9185", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)makeKeyword("ALL-INFERIOR-EDGES"), (SubLObject)makeSymbol("S#12131", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12104", "CYC"), (SubLObject)makeSymbol("S#9185", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)makeKeyword("ALL-PATHS"), (SubLObject)makeSymbol("S#12132", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12104", "CYC"), (SubLObject)makeSymbol("S#9185", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)makeKeyword("INFERIORS-WITH-MTS"), (SubLObject)makeSymbol("S#12133", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#9185", "CYC"))), ConsesLow.list((SubLObject)makeKeyword("SUPERIOR-IN-WHAT-MTS"), (SubLObject)makeSymbol("S#12134", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12104", "CYC"), (SubLObject)makeSymbol("S#9185", "CYC"), (SubLObject)makeSymbol("S#12135", "CYC"))), ConsesLow.list((SubLObject)makeKeyword("INFERIOR-IN-WHAT-MTS"), (SubLObject)makeSymbol("S#12134", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#9185", "CYC"), (SubLObject)makeSymbol("S#12104", "CYC"), (SubLObject)makeSymbol("S#12135", "CYC"))), ConsesLow.list((SubLObject)makeKeyword("ACCESSIBLE-IN-WHAT-MTS"), (SubLObject)makeSymbol("S#12136", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12104", "CYC"), (SubLObject)makeSymbol("S#9185", "CYC"), (SubLObject)makeSymbol("S#12135", "CYC"))) });
        $ic1$ = makeSymbol("S#12008", "CYC");
        $ic2$ = makeSymbol("CAR");
        $ic3$ = makeSymbol("S#12009", "CYC");
        $ic4$ = ConsesLow.list((SubLObject)makeKeyword("PREDICATE"), (SubLObject)makeKeyword("INDEX-ARG"), (SubLObject)makeKeyword("GATHER-ARG"), (SubLObject)makeKeyword("ACCESSORS"), (SubLObject)makeKeyword("MT"));
        $ic5$ = makeSymbol("S#12010", "CYC");
        $ic6$ = makeSymbol("S#12011", "CYC");
        $ic7$ = makeSymbol("S#12012", "CYC");
        $ic8$ = makeSymbol("S#12013", "CYC");
        $ic9$ = makeSymbol("S#12014", "CYC");
        $ic10$ = makeSymbol("S#12015", "CYC");
        $ic11$ = makeSymbol("S#12016", "CYC");
        $ic12$ = makeSymbol("S#12017", "CYC");
        $ic13$ = makeKeyword("ASSERTION");
        $ic14$ = makeSymbol("S#12018", "CYC");
        $ic15$ = makeKeyword("SUPERIOR");
        $ic16$ = makeSymbol("S#12019", "CYC");
        $ic17$ = ConsesLow.list((SubLObject)makeKeyword("SUPERIOR"), (SubLObject)makeKeyword("INFERIOR"), (SubLObject)makeKeyword("ACCESSIBLE"), (SubLObject)makeKeyword("DIRECTED"), (SubLObject)makeKeyword("INVERSE"));
        $ic18$ = makeSymbol("S#12020", "CYC");
        $ic19$ = makeKeyword("TRUE");
        $ic20$ = makeSymbol("S#12021", "CYC");
        $ic21$ = makeSymbol("S#12022", "CYC");
        $ic22$ = makeSymbol("S#12023", "CYC");
        $ic23$ = makeSymbol("S#12024", "CYC");
        $ic24$ = makeSymbol("S#12025", "CYC");
        $ic25$ = makeSymbol("S#12026", "CYC");
        $ic26$ = makeSymbol("S#12027", "CYC");
        $ic27$ = makeSymbol("S#12028", "CYC");
        $ic28$ = makeSymbol("S#12029", "CYC");
        $ic29$ = makeSymbol("S#12030", "CYC");
        $ic30$ = makeSymbol("S#12031", "CYC");
        $ic31$ = makeSymbol("NCONC");
        $ic32$ = makeSymbol("S#12032", "CYC");
        $ic33$ = makeSymbol("S#12033", "CYC");
        $ic34$ = makeSymbol("S#12034", "CYC");
        $ic35$ = makeSymbol("S#12035", "CYC");
        $ic36$ = makeSymbol("S#12036", "CYC");
        $ic37$ = makeSymbol("S#12037", "CYC");
        $ic38$ = makeKeyword("DOWN");
        $ic39$ = makeSymbol("*GT-MAX-NODES-DIRECTION*");
        $ic40$ = makeSymbol("S#12038", "CYC");
        $ic41$ = makeSymbol("S#12039", "CYC");
        $ic42$ = makeString("Current link support ~a is not a valid support for determining link mt.");
        $ic43$ = makeString("Current link support ~a is not a valid support for determining link predicate.");
        $ic44$ = makeSymbol("S#12041", "CYC");
        $ic45$ = makeSymbol("S#12042", "CYC");
        $ic46$ = makeSymbol("S#12043", "CYC");
        $ic47$ = makeSymbol("S#12044", "CYC");
        $ic48$ = makeSymbol("S#12045", "CYC");
        $ic49$ = makeSymbol("S#12046", "CYC");
        $ic50$ = makeSymbol("S#12047", "CYC");
        $ic51$ = makeSymbol("S#12048", "CYC");
        $ic52$ = makeSymbol("S#12049", "CYC");
        $ic53$ = makeSymbol("S#12050", "CYC");
        $ic54$ = makeSymbol("S#12051", "CYC");
        $ic55$ = makeSymbol("S#12052", "CYC");
        $ic56$ = makeSymbol("S#12053", "CYC");
        $ic57$ = makeSymbol("S#12054", "CYC");
        $ic58$ = makeSymbol("S#12055", "CYC");
        $ic59$ = makeSymbol("S#12056", "CYC");
        $ic60$ = makeSymbol("S#12057", "CYC");
        $ic61$ = makeSymbol("S#12058", "CYC");
        $ic62$ = makeSymbol("S#12059", "CYC");
        $ic63$ = makeSymbol("S#12060", "CYC");
        $ic64$ = makeSymbol("S#12061", "CYC");
        $ic65$ = makeSymbol("S#12062", "CYC");
        $ic66$ = makeSymbol("S#12063", "CYC");
        $ic67$ = makeSymbol("S#12064", "CYC");
        $ic68$ = makeSymbol("S#12065", "CYC");
        $ic69$ = makeSymbol("S#12066", "CYC");
        $ic70$ = ConsesLow.list((SubLObject)makeSymbol("S#205", "CYC"), (SubLObject)makeSymbol("S#138", "CYC"));
        $ic71$ = makeKeyword("ACCESSORS");
        $ic72$ = makeKeyword("PREDICATE");
        $ic73$ = makeKeyword("INDEX-ARG");
        $ic74$ = makeKeyword("GATHER-ARG");
        $ic75$ = makeKeyword("MT");
        $ic76$ = makeSymbol("DEFINE");
        $ic77$ = makeSymbol("CLET");
        $ic78$ = ConsesLow.list((SubLObject)makeSymbol("S#3267", "CYC"));
        $ic79$ = ConsesLow.list((SubLObject)makeSymbol("S#12018", "CYC"), (SubLObject)makeKeyword("ASSERTION"));
        $ic80$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12047", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("MAKE-HASH-TABLE"), (SubLObject)makeInteger(128))));
        $ic81$ = makeSymbol("CSETQ");
        $ic82$ = makeSymbol("S#3267", "CYC");
        $ic83$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("RET"), (SubLObject)makeSymbol("S#3267", "CYC")));
        $ic84$ = makeSymbol("QUOTE");
        $ic85$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12018", "CYC"), (SubLObject)makeKeyword("ACCESSORS")));
        $ic86$ = makeSymbol("PROGN");
        $ic87$ = makeSymbol("S#12137", "CYC");
        $ic88$ = makeSymbol("CPUSHNEW");
        $ic89$ = ConsesLow.list((SubLObject)makeSymbol("S#12011", "CYC"));
        $ic90$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("ALL-TARGETS"), (SubLObject)makeSymbol("S#12138", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10466", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("ALL-SOURCES"), (SubLObject)makeSymbol("S#12139", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10466", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BOOLEAN?"), (SubLObject)makeSymbol("S#12140", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10466", "CYC"), (SubLObject)makeSymbol("S#12141", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("ACCESSES-IN-WHAT-MTS"), (SubLObject)makeSymbol("S#12142", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10466", "CYC"), (SubLObject)makeSymbol("S#12141", "CYC"))));
        $ic91$ = makeSymbol("S#12067", "CYC");
        $ic92$ = makeSymbol("S#12068", "CYC");
        $ic93$ = makeSymbol("S#12069", "CYC");
        $ic94$ = ConsesLow.list((SubLObject)makeKeyword("PREDICATE"), (SubLObject)makeKeyword("CONDUIT-PRED"), (SubLObject)makeKeyword("TT-INDEX-ARG"), (SubLObject)makeKeyword("TT-GATHER-ARG"), (SubLObject)makeKeyword("GT-INDEX-ARG"), (SubLObject)makeKeyword("GT-GATHER-ARG"), (SubLObject)makeKeyword("MT"));
        $ic95$ = makeSymbol("S#12070", "CYC");
        $ic96$ = makeSymbol("S#12071", "CYC");
        $ic97$ = makeSymbol("S#12072", "CYC");
        $ic98$ = makeSymbol("S#12073", "CYC");
        $ic99$ = makeSymbol("S#12074", "CYC");
        $ic100$ = makeSymbol("S#12075", "CYC");
        $ic101$ = makeSymbol("S#12076", "CYC");
        $ic102$ = makeSymbol("S#12077", "CYC");
        $ic103$ = makeSymbol("S#12078", "CYC");
        $ic104$ = makeKeyword("CONDUIT-PRED");
        $ic105$ = makeSymbol("TRANSITIVE-PREDICATE?");
        $ic106$ = makeSymbol("S#12143", "CYC");
        $ic107$ = makeSymbol("S#12144", "CYC");
        $ic108$ = ConsesLow.list((SubLObject)makeSymbol("S#12069", "CYC"));
        $ic109$ = makeSymbol("S#12079", "CYC");
        $ic110$ = makeSymbol("S#12080", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 358 ms
	
	Decompiled with Procyon 0.5.32.
*/