package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
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
        return module0145.$g1917$.getDynamicValue(var1);
    }
    
    public static SubLObject f9472() {
        final SubLObject var2 = f9471();
        if (module0145.NIL != module0174.f11035(var2)) {
            return module0178.f11287(var2);
        }
        if (module0145.NIL != module0191.f11952(var2)) {
            return module0191.f11976(var2);
        }
        return module0313.f21151((SubLObject)module0145.ONE_INTEGER, (SubLObject)module0145.$ic42$, var2, (SubLObject)module0145.UNPROVIDED, (SubLObject)module0145.UNPROVIDED, (SubLObject)module0145.UNPROVIDED, (SubLObject)module0145.UNPROVIDED);
    }
    
    public static SubLObject f9473() {
        final SubLObject var2 = f9471();
        if (module0145.NIL != module0178.f11284(var2)) {
            return module0178.f11333(var2);
        }
        if (module0145.NIL != module0191.f11952(var2)) {
            return module0205.f13132(module0191.f11969(var2));
        }
        return module0313.f21151((SubLObject)module0145.ONE_INTEGER, (SubLObject)module0145.$ic43$, var2, (SubLObject)module0145.UNPROVIDED, (SubLObject)module0145.UNPROVIDED, (SubLObject)module0145.UNPROVIDED, (SubLObject)module0145.UNPROVIDED);
    }
    
    public static SubLObject f9474(final SubLObject var3, final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var7;
        final SubLObject var6 = var7 = var3.rest();
        SubLObject var8 = (SubLObject)module0145.NIL;
        SubLObject var9 = (SubLObject)module0145.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)module0145.$ic70$);
        var8 = var7.first();
        var7 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)module0145.$ic70$);
        var9 = var7.first();
        var7 = var7.rest();
        if (module0145.NIL == var7) {
            SubLObject var10 = (SubLObject)module0145.NIL;
            if (var9.isCons()) {
                SubLObject var11 = conses_high.getf(var9, (SubLObject)module0145.$ic71$, (SubLObject)module0145.UNPROVIDED);
                SubLObject var12 = conses_high.getf(var9, (SubLObject)module0145.$ic72$, (SubLObject)module0145.UNPROVIDED);
                SubLObject var13 = conses_high.getf(var9, (SubLObject)module0145.$ic73$, (SubLObject)module0145.UNPROVIDED);
                SubLObject var14 = conses_high.getf(var9, (SubLObject)module0145.$ic74$, (SubLObject)module0145.UNPROVIDED);
                final SubLObject var15 = conses_high.getf(var9, (SubLObject)module0145.$ic75$, (SubLObject)module0145.UNPROVIDED);
                SubLObject var16 = (SubLObject)module0145.$ic71$;
                if (module0145.NIL == var13) {
                    var13 = (SubLObject)module0145.ONE_INTEGER;
                }
                if (module0145.NIL == var14) {
                    var14 = (SubLObject)module0145.TWO_INTEGER;
                }
                if (!var11.isCons()) {
                    var11 = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var12, var13, var14));
                }
                if (var11.isCons() && module0145.NIL == var11.rest()) {
                    var16 = (SubLObject)module0145.$ic72$;
                    var12 = var11.first().first();
                    var13 = conses_high.second(var11.first());
                    var14 = conses_high.third(var11.first());
                }
                SubLObject var17 = (SubLObject)module0145.NIL;
                SubLObject var18 = (SubLObject)module0145.NIL;
                var17 = var9;
                var18 = var17.first();
                while (module0145.NIL != var17) {
                    if (module0145.NIL != module0004.f104(var18, module0145.$g1885$.getDynamicValue(var5), (SubLObject)module0145.UNPROVIDED, (SubLObject)module0145.UNPROVIDED)) {
                        final SubLObject var19 = Packages.intern(module0038.f2638(conses_high.second(var17)), (SubLObject)module0145.UNPROVIDED);
                        final SubLObject var20 = module0316.f21378(var15, conses_high.third(conses_high.assoc(var18, module0145.$g1884$.getGlobalValue(), (SubLObject)module0145.UNPROVIDED, (SubLObject)module0145.UNPROVIDED)));
                        final SubLObject var21 = module0035.f1992(var20);
                        final SubLObject var22 = conses_high.second(conses_high.assoc(var18, module0145.$g1884$.getGlobalValue(), (SubLObject)module0145.UNPROVIDED, (SubLObject)module0145.UNPROVIDED));
                        final SubLObject var23 = var16;
                        if (var23.eql((SubLObject)module0145.$ic72$)) {
                            var10 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0145.$ic76$, var19, var20, (SubLObject)ConsesLow.listS((SubLObject)module0145.$ic77$, (SubLObject)module0145.$ic78$, (SubLObject)ConsesLow.list((SubLObject)module0145.$ic77$, (SubLObject)ConsesLow.listS((SubLObject)ConsesLow.list((SubLObject)module0145.$ic7$, var12), (SubLObject)module0145.$ic79$, (SubLObject)ConsesLow.list((SubLObject)module0145.$ic10$, var13), (SubLObject)ConsesLow.list((SubLObject)module0145.$ic11$, var14), (SubLObject)module0145.$ic80$), (SubLObject)ConsesLow.list((SubLObject)module0145.$ic81$, (SubLObject)module0145.$ic82$, reader.bq_cons(var22, ConsesLow.append(var21, (SubLObject)module0145.NIL)))), (SubLObject)module0145.$ic83$)), var10);
                        }
                        else if (var23.eql((SubLObject)module0145.$ic71$)) {
                            var10 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0145.$ic76$, var19, var20, (SubLObject)ConsesLow.listS((SubLObject)module0145.$ic77$, (SubLObject)module0145.$ic78$, (SubLObject)ConsesLow.list((SubLObject)module0145.$ic77$, reader.bq_cons((SubLObject)ConsesLow.list((SubLObject)module0145.$ic12$, (SubLObject)ConsesLow.list((SubLObject)module0145.$ic84$, var11)), (SubLObject)module0145.$ic85$), (SubLObject)ConsesLow.list((SubLObject)module0145.$ic81$, (SubLObject)module0145.$ic82$, reader.bq_cons(var22, ConsesLow.append(var21, (SubLObject)module0145.NIL)))), (SubLObject)module0145.$ic83$)), var10);
                        }
                    }
                    var17 = conses_high.cddr(var17);
                    var18 = var17.first();
                }
            }
            return (SubLObject)ConsesLow.listS((SubLObject)module0145.$ic86$, (SubLObject)ConsesLow.list((SubLObject)module0145.$ic87$, var8, (SubLObject)ConsesLow.list((SubLObject)module0145.$ic84$, var9)), (SubLObject)ConsesLow.listS((SubLObject)module0145.$ic88$, var8, (SubLObject)module0145.$ic89$), ConsesLow.append(var10, (SubLObject)module0145.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var6, (SubLObject)module0145.$ic70$);
        return (SubLObject)module0145.NIL;
    }
    
    public static SubLObject f9475(final SubLObject var3, final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var7;
        final SubLObject var6 = var7 = var3.rest();
        SubLObject var8 = (SubLObject)module0145.NIL;
        SubLObject var9 = (SubLObject)module0145.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)module0145.$ic70$);
        var8 = var7.first();
        var7 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)module0145.$ic70$);
        var9 = var7.first();
        var7 = var7.rest();
        if (module0145.NIL == var7) {
            SubLObject var10 = (SubLObject)module0145.NIL;
            if (var9.isCons()) {
                final SubLObject var11 = conses_high.getf(var9, (SubLObject)module0145.$ic72$, (SubLObject)module0145.UNPROVIDED);
                final SubLObject var12 = conses_high.getf(var9, (SubLObject)module0145.$ic104$, (SubLObject)module0145.UNPROVIDED);
                final SubLObject var13 = conses_high.getf(var9, (SubLObject)module0145.$ic75$, (SubLObject)module0145.UNPROVIDED);
                final SubLObject var14 = (SubLObject)module0145.$ic72$;
                final SubLObject var15 = (SubLObject)module0145.TWO_INTEGER;
                final SubLObject var16 = (SubLObject)module0145.ONE_INTEGER;
                final SubLObject var17 = (SubLObject)module0145.ONE_INTEGER;
                final SubLObject var18 = (SubLObject)module0145.TWO_INTEGER;
                SubLObject var19 = (SubLObject)module0145.NIL;
                SubLObject var20 = (SubLObject)module0145.NIL;
                var19 = var9;
                var20 = var19.first();
                while (module0145.NIL != var19) {
                    if (module0145.NIL != module0004.f104(var20, module0145.$g1945$.getDynamicValue(var5), (SubLObject)module0145.UNPROVIDED, (SubLObject)module0145.UNPROVIDED)) {
                        final SubLObject var21 = Packages.intern(module0038.f2638(conses_high.second(var19)), (SubLObject)module0145.UNPROVIDED);
                        final SubLObject var22 = module0316.f21378(var13, conses_high.third(conses_high.assoc(var20, module0145.$g1944$.getDynamicValue(var5), (SubLObject)module0145.UNPROVIDED, (SubLObject)module0145.UNPROVIDED)));
                        final SubLObject var23 = module0035.f1992(var22);
                        final SubLObject var24 = var20;
                        final SubLObject var25 = var14;
                        if (var25.eql((SubLObject)module0145.$ic72$)) {
                            var10 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0145.$ic76$, var21, var22, (SubLObject)ConsesLow.listS((SubLObject)module0145.$ic77$, (SubLObject)module0145.$ic78$, (SubLObject)ConsesLow.list((SubLObject)module0145.$ic77$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0145.$ic96$, var11), (SubLObject)ConsesLow.list((SubLObject)module0145.$ic7$, var12), (SubLObject)module0145.$ic79$, (SubLObject)ConsesLow.list((SubLObject)module0145.$ic99$, var15), (SubLObject)ConsesLow.list((SubLObject)module0145.$ic100$, var16), (SubLObject)ConsesLow.list((SubLObject)module0145.$ic10$, var17), (SubLObject)ConsesLow.list((SubLObject)module0145.$ic11$, var18), (SubLObject)ConsesLow.list((SubLObject)module0145.$ic103$, (SubLObject)ConsesLow.list((SubLObject)module0145.$ic105$, var12))), (SubLObject)ConsesLow.list((SubLObject)module0145.$ic81$, (SubLObject)module0145.$ic82$, (SubLObject)ConsesLow.listS((SubLObject)module0145.$ic106$, var24, ConsesLow.append(var23, (SubLObject)module0145.NIL)))), (SubLObject)module0145.$ic83$)), var10);
                        }
                    }
                    var19 = conses_high.cddr(var19);
                    var20 = var19.first();
                }
            }
            return (SubLObject)ConsesLow.listS((SubLObject)module0145.$ic86$, (SubLObject)ConsesLow.list((SubLObject)module0145.$ic107$, var8, (SubLObject)ConsesLow.list((SubLObject)module0145.$ic84$, var9)), (SubLObject)ConsesLow.listS((SubLObject)module0145.$ic88$, var8, (SubLObject)module0145.$ic108$), ConsesLow.append(var10, (SubLObject)module0145.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var6, (SubLObject)module0145.$ic70$);
        return (SubLObject)module0145.NIL;
    }
    
    public static SubLObject f9476(final SubLObject var3, final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var7;
        final SubLObject var6 = var7 = var3.rest();
        SubLObject var8 = (SubLObject)module0145.NIL;
        SubLObject var9 = (SubLObject)module0145.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)module0145.$ic70$);
        var8 = var7.first();
        var7 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)module0145.$ic70$);
        var9 = var7.first();
        var7 = var7.rest();
        if (module0145.NIL == var7) {
            SubLObject var10 = (SubLObject)module0145.NIL;
            if (var9.isCons()) {
                final SubLObject var11 = conses_high.getf(var9, (SubLObject)module0145.$ic72$, (SubLObject)module0145.UNPROVIDED);
                final SubLObject var12 = conses_high.getf(var9, (SubLObject)module0145.$ic104$, (SubLObject)module0145.UNPROVIDED);
                final SubLObject var13 = conses_high.getf(var9, (SubLObject)module0145.$ic75$, (SubLObject)module0145.UNPROVIDED);
                final SubLObject var14 = (SubLObject)module0145.$ic72$;
                final SubLObject var15 = (SubLObject)module0145.ONE_INTEGER;
                final SubLObject var16 = (SubLObject)module0145.TWO_INTEGER;
                final SubLObject var17 = (SubLObject)module0145.ONE_INTEGER;
                final SubLObject var18 = (SubLObject)module0145.TWO_INTEGER;
                SubLObject var19 = (SubLObject)module0145.NIL;
                SubLObject var20 = (SubLObject)module0145.NIL;
                var19 = var9;
                var20 = var19.first();
                while (module0145.NIL != var19) {
                    if (module0145.NIL != module0004.f104(var20, module0145.$g1945$.getDynamicValue(var5), (SubLObject)module0145.UNPROVIDED, (SubLObject)module0145.UNPROVIDED)) {
                        final SubLObject var21 = Packages.intern(module0038.f2638(conses_high.second(var19)), (SubLObject)module0145.UNPROVIDED);
                        final SubLObject var22 = module0316.f21378(var13, conses_high.third(conses_high.assoc(var20, module0145.$g1944$.getDynamicValue(var5), (SubLObject)module0145.UNPROVIDED, (SubLObject)module0145.UNPROVIDED)));
                        final SubLObject var23 = module0035.f1992(var22);
                        final SubLObject var24 = var20;
                        final SubLObject var25 = var14;
                        if (var25.eql((SubLObject)module0145.$ic72$)) {
                            var10 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0145.$ic76$, var21, var22, (SubLObject)ConsesLow.listS((SubLObject)module0145.$ic77$, (SubLObject)module0145.$ic78$, (SubLObject)ConsesLow.list((SubLObject)module0145.$ic77$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0145.$ic96$, var11), (SubLObject)ConsesLow.list((SubLObject)module0145.$ic7$, var12), (SubLObject)module0145.$ic79$, (SubLObject)ConsesLow.list((SubLObject)module0145.$ic99$, var15), (SubLObject)ConsesLow.list((SubLObject)module0145.$ic100$, var16), (SubLObject)ConsesLow.list((SubLObject)module0145.$ic10$, var17), (SubLObject)ConsesLow.list((SubLObject)module0145.$ic11$, var18), (SubLObject)ConsesLow.list((SubLObject)module0145.$ic103$, (SubLObject)ConsesLow.list((SubLObject)module0145.$ic105$, var12))), (SubLObject)ConsesLow.list((SubLObject)module0145.$ic81$, (SubLObject)module0145.$ic82$, (SubLObject)ConsesLow.listS((SubLObject)module0145.$ic106$, var24, ConsesLow.append(var23, (SubLObject)module0145.NIL)))), (SubLObject)module0145.$ic83$)), var10);
                        }
                    }
                    var19 = conses_high.cddr(var19);
                    var20 = var19.first();
                }
            }
            return (SubLObject)ConsesLow.listS((SubLObject)module0145.$ic86$, (SubLObject)ConsesLow.list((SubLObject)module0145.$ic107$, var8, (SubLObject)ConsesLow.list((SubLObject)module0145.$ic84$, var9)), (SubLObject)ConsesLow.listS((SubLObject)module0145.$ic88$, var8, (SubLObject)module0145.$ic108$), ConsesLow.append(var10, (SubLObject)module0145.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var6, (SubLObject)module0145.$ic70$);
        return (SubLObject)module0145.NIL;
    }
    
    public static SubLObject f9477(final SubLObject var3, final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var7;
        final SubLObject var6 = var7 = var3.rest();
        SubLObject var8 = (SubLObject)module0145.NIL;
        SubLObject var9 = (SubLObject)module0145.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)module0145.$ic70$);
        var8 = var7.first();
        var7 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)module0145.$ic70$);
        var9 = var7.first();
        var7 = var7.rest();
        if (module0145.NIL == var7) {
            SubLObject var10 = (SubLObject)module0145.NIL;
            if (var9.isCons()) {
                final SubLObject var11 = conses_high.getf(var9, (SubLObject)module0145.$ic72$, (SubLObject)module0145.UNPROVIDED);
                final SubLObject var12 = conses_high.getf(var9, (SubLObject)module0145.$ic104$, (SubLObject)module0145.UNPROVIDED);
                final SubLObject var13 = conses_high.getf(var9, (SubLObject)module0145.$ic75$, (SubLObject)module0145.UNPROVIDED);
                final SubLObject var14 = (SubLObject)module0145.$ic72$;
                final SubLObject var15 = (SubLObject)module0145.TWO_INTEGER;
                final SubLObject var16 = (SubLObject)module0145.ONE_INTEGER;
                final SubLObject var17 = (SubLObject)module0145.TWO_INTEGER;
                final SubLObject var18 = (SubLObject)module0145.ONE_INTEGER;
                SubLObject var19 = (SubLObject)module0145.NIL;
                SubLObject var20 = (SubLObject)module0145.NIL;
                var19 = var9;
                var20 = var19.first();
                while (module0145.NIL != var19) {
                    if (module0145.NIL != module0004.f104(var20, module0145.$g1945$.getDynamicValue(var5), (SubLObject)module0145.UNPROVIDED, (SubLObject)module0145.UNPROVIDED)) {
                        final SubLObject var21 = Packages.intern(module0038.f2638(conses_high.second(var19)), (SubLObject)module0145.UNPROVIDED);
                        final SubLObject var22 = module0316.f21378(var13, conses_high.third(conses_high.assoc(var20, module0145.$g1944$.getDynamicValue(var5), (SubLObject)module0145.UNPROVIDED, (SubLObject)module0145.UNPROVIDED)));
                        final SubLObject var23 = module0035.f1992(var22);
                        final SubLObject var24 = var20;
                        final SubLObject var25 = var14;
                        if (var25.eql((SubLObject)module0145.$ic72$)) {
                            var10 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0145.$ic76$, var21, var22, (SubLObject)ConsesLow.listS((SubLObject)module0145.$ic77$, (SubLObject)module0145.$ic78$, (SubLObject)ConsesLow.list((SubLObject)module0145.$ic77$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0145.$ic96$, var11), (SubLObject)ConsesLow.list((SubLObject)module0145.$ic7$, var12), (SubLObject)module0145.$ic79$, (SubLObject)ConsesLow.list((SubLObject)module0145.$ic99$, var15), (SubLObject)ConsesLow.list((SubLObject)module0145.$ic100$, var16), (SubLObject)ConsesLow.list((SubLObject)module0145.$ic10$, var17), (SubLObject)ConsesLow.list((SubLObject)module0145.$ic11$, var18), (SubLObject)ConsesLow.list((SubLObject)module0145.$ic103$, (SubLObject)ConsesLow.list((SubLObject)module0145.$ic105$, var12))), (SubLObject)ConsesLow.list((SubLObject)module0145.$ic81$, (SubLObject)module0145.$ic82$, (SubLObject)ConsesLow.listS((SubLObject)module0145.$ic106$, var24, ConsesLow.append(var23, (SubLObject)module0145.NIL)))), (SubLObject)module0145.$ic83$)), var10);
                        }
                    }
                    var19 = conses_high.cddr(var19);
                    var20 = var19.first();
                }
            }
            return (SubLObject)ConsesLow.listS((SubLObject)module0145.$ic86$, (SubLObject)ConsesLow.list((SubLObject)module0145.$ic107$, var8, (SubLObject)ConsesLow.list((SubLObject)module0145.$ic84$, var9)), (SubLObject)ConsesLow.listS((SubLObject)module0145.$ic88$, var8, (SubLObject)module0145.$ic108$), ConsesLow.append(var10, (SubLObject)module0145.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var6, (SubLObject)module0145.$ic70$);
        return (SubLObject)module0145.NIL;
    }
    
    public static SubLObject f9478(final SubLObject var3, final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var7;
        final SubLObject var6 = var7 = var3.rest();
        SubLObject var8 = (SubLObject)module0145.NIL;
        SubLObject var9 = (SubLObject)module0145.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)module0145.$ic70$);
        var8 = var7.first();
        var7 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)module0145.$ic70$);
        var9 = var7.first();
        var7 = var7.rest();
        if (module0145.NIL == var7) {
            SubLObject var10 = (SubLObject)module0145.NIL;
            if (var9.isCons()) {
                final SubLObject var11 = conses_high.getf(var9, (SubLObject)module0145.$ic72$, (SubLObject)module0145.UNPROVIDED);
                final SubLObject var12 = conses_high.getf(var9, (SubLObject)module0145.$ic104$, (SubLObject)module0145.UNPROVIDED);
                final SubLObject var13 = conses_high.getf(var9, (SubLObject)module0145.$ic75$, (SubLObject)module0145.UNPROVIDED);
                final SubLObject var14 = (SubLObject)module0145.$ic72$;
                final SubLObject var15 = (SubLObject)module0145.ONE_INTEGER;
                final SubLObject var16 = (SubLObject)module0145.TWO_INTEGER;
                final SubLObject var17 = (SubLObject)module0145.TWO_INTEGER;
                final SubLObject var18 = (SubLObject)module0145.ONE_INTEGER;
                SubLObject var19 = (SubLObject)module0145.NIL;
                SubLObject var20 = (SubLObject)module0145.NIL;
                var19 = var9;
                var20 = var19.first();
                while (module0145.NIL != var19) {
                    if (module0145.NIL != module0004.f104(var20, module0145.$g1945$.getDynamicValue(var5), (SubLObject)module0145.UNPROVIDED, (SubLObject)module0145.UNPROVIDED)) {
                        final SubLObject var21 = Packages.intern(module0038.f2638(conses_high.second(var19)), (SubLObject)module0145.UNPROVIDED);
                        final SubLObject var22 = module0316.f21378(var13, conses_high.third(conses_high.assoc(var20, module0145.$g1944$.getDynamicValue(var5), (SubLObject)module0145.UNPROVIDED, (SubLObject)module0145.UNPROVIDED)));
                        final SubLObject var23 = module0035.f1992(var22);
                        final SubLObject var24 = var20;
                        final SubLObject var25 = var14;
                        if (var25.eql((SubLObject)module0145.$ic72$)) {
                            var10 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0145.$ic76$, var21, var22, (SubLObject)ConsesLow.listS((SubLObject)module0145.$ic77$, (SubLObject)module0145.$ic78$, (SubLObject)ConsesLow.list((SubLObject)module0145.$ic77$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0145.$ic96$, var11), (SubLObject)ConsesLow.list((SubLObject)module0145.$ic7$, var12), (SubLObject)module0145.$ic79$, (SubLObject)ConsesLow.list((SubLObject)module0145.$ic99$, var15), (SubLObject)ConsesLow.list((SubLObject)module0145.$ic100$, var16), (SubLObject)ConsesLow.list((SubLObject)module0145.$ic10$, var17), (SubLObject)ConsesLow.list((SubLObject)module0145.$ic11$, var18), (SubLObject)ConsesLow.list((SubLObject)module0145.$ic103$, (SubLObject)ConsesLow.list((SubLObject)module0145.$ic105$, var12))), (SubLObject)ConsesLow.list((SubLObject)module0145.$ic81$, (SubLObject)module0145.$ic82$, (SubLObject)ConsesLow.listS((SubLObject)module0145.$ic106$, var24, ConsesLow.append(var23, (SubLObject)module0145.NIL)))), (SubLObject)module0145.$ic83$)), var10);
                        }
                    }
                    var19 = conses_high.cddr(var19);
                    var20 = var19.first();
                }
            }
            return (SubLObject)ConsesLow.listS((SubLObject)module0145.$ic86$, (SubLObject)ConsesLow.list((SubLObject)module0145.$ic107$, var8, (SubLObject)ConsesLow.list((SubLObject)module0145.$ic84$, var9)), (SubLObject)ConsesLow.listS((SubLObject)module0145.$ic88$, var8, (SubLObject)module0145.$ic108$), ConsesLow.append(var10, (SubLObject)module0145.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var6, (SubLObject)module0145.$ic70$);
        return (SubLObject)module0145.NIL;
    }
    
    public static SubLObject f9479() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return module0145.$g1957$.getDynamicValue(var1);
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
        return (SubLObject)module0145.NIL;
    }
    
    public static SubLObject f9481() {
        module0145.$g1884$ = SubLFiles.deflexical("S#12008", (SubLObject)module0145.$ic0$);
        module0145.$g1885$ = SubLFiles.defparameter("S#12009", Mapping.mapcar(Symbols.symbol_function((SubLObject)module0145.$ic2$), module0145.$g1884$.getGlobalValue()));
        module0145.$g1886$ = SubLFiles.defparameter("S#12010", ConsesLow.append((SubLObject)module0145.$ic4$, module0145.$g1885$.getDynamicValue()));
        module0145.$g1887$ = SubLFiles.defparameter("S#12011", (SubLObject)module0145.NIL);
        module0145.$g1888$ = SubLFiles.defparameter("S#12012", (SubLObject)module0145.NIL);
        module0145.$g1889$ = SubLFiles.defparameter("S#12013", (SubLObject)module0145.NIL);
        module0145.$g1890$ = SubLFiles.defparameter("S#12014", (SubLObject)module0145.NIL);
        module0145.$g1891$ = SubLFiles.defparameter("S#12015", (SubLObject)module0145.ONE_INTEGER);
        module0145.$g1892$ = SubLFiles.defparameter("S#12016", (SubLObject)module0145.TWO_INTEGER);
        module0145.$g1893$ = SubLFiles.defparameter("S#12017", (SubLObject)module0145.NIL);
        module0145.$g1894$ = SubLFiles.defparameter("S#12018", (SubLObject)module0145.$ic13$);
        module0145.$g1895$ = SubLFiles.defparameter("S#12019", (SubLObject)module0145.$ic15$);
        module0145.$g1896$ = SubLFiles.defparameter("S#12020", (SubLObject)module0145.$ic17$);
        module0145.$g1897$ = SubLFiles.defparameter("S#12021", (SubLObject)module0145.$ic19$);
        module0145.$g1898$ = SubLFiles.defparameter("S#12022", (SubLObject)module0145.NIL);
        module0145.$g1899$ = SubLFiles.defparameter("S#12023", (SubLObject)module0145.NIL);
        module0145.$g1900$ = SubLFiles.defparameter("S#12024", (SubLObject)module0145.NIL);
        module0145.$g1901$ = SubLFiles.defparameter("S#12025", (SubLObject)module0145.NIL);
        module0145.$g1902$ = SubLFiles.defparameter("S#12026", (SubLObject)module0145.NIL);
        module0145.$g1903$ = SubLFiles.defparameter("S#12027", (SubLObject)module0145.NIL);
        module0145.$g1904$ = SubLFiles.defparameter("S#12028", (SubLObject)module0145.NIL);
        module0145.$g1905$ = SubLFiles.defparameter("S#12029", (SubLObject)module0145.NIL);
        module0145.$g1906$ = SubLFiles.defparameter("S#12030", (SubLObject)module0145.NIL);
        module0145.$g1907$ = SubLFiles.defparameter("S#12031", (SubLObject)module0145.NIL);
        module0145.$g1908$ = SubLFiles.defparameter("S#12032", Symbols.symbol_function((SubLObject)module0145.$ic31$));
        module0145.$g1909$ = SubLFiles.defparameter("S#12033", (SubLObject)module0145.NIL);
        module0145.$g1910$ = SubLFiles.defparameter("S#12034", Symbols.symbol_function((SubLObject)module0145.EQUAL));
        module0145.$g1911$ = SubLFiles.defparameter("S#12035", (SubLObject)module0145.NIL);
        module0145.$g1912$ = SubLFiles.defparameter("S#12036", (SubLObject)module0145.ONE_INTEGER);
        module0145.$g1913$ = SubLFiles.defparameter("S#12037", (SubLObject)module0145.TWO_INTEGER);
        module0145.$g1914$ = SubLFiles.defparameter("*GT-MAX-NODES-DIRECTION*", (SubLObject)module0145.$ic38$);
        module0145.$g1915$ = SubLFiles.defparameter("S#12038", (SubLObject)module0145.T);
        module0145.$g1916$ = SubLFiles.defparameter("S#12039", (SubLObject)module0145.NIL);
        module0145.$g1917$ = SubLFiles.defparameter("S#12040", (SubLObject)module0145.NIL);
        module0145.$g1918$ = SubLFiles.defparameter("S#12041", (SubLObject)module0145.NIL);
        module0145.$g1919$ = SubLFiles.defparameter("S#12042", (SubLObject)module0145.NIL);
        module0145.$g1920$ = SubLFiles.defparameter("S#12043", (SubLObject)module0145.NIL);
        module0145.$g1921$ = SubLFiles.defparameter("S#12044", (SubLObject)module0145.NIL);
        module0145.$g1922$ = SubLFiles.defparameter("S#12045", (SubLObject)module0145.ZERO_INTEGER);
        module0145.$g1923$ = SubLFiles.defparameter("S#12046", (SubLObject)module0145.NIL);
        module0145.$g1924$ = SubLFiles.defparameter("S#12047", (SubLObject)module0145.NIL);
        module0145.$g1925$ = SubLFiles.defparameter("S#12048", (SubLObject)module0145.NIL);
        module0145.$g1926$ = SubLFiles.defparameter("S#12049", (SubLObject)module0145.ONE_INTEGER);
        module0145.$g1927$ = SubLFiles.defparameter("S#12050", (SubLObject)module0145.NIL);
        module0145.$g1928$ = SubLFiles.defparameter("S#12051", (SubLObject)module0145.ONE_INTEGER);
        module0145.$g1929$ = SubLFiles.defparameter("S#12052", (SubLObject)module0145.NIL);
        module0145.$g1930$ = SubLFiles.defparameter("S#12053", (SubLObject)module0145.TEN_INTEGER);
        module0145.$g1931$ = SubLFiles.defparameter("S#12054", (SubLObject)module0145.ZERO_INTEGER);
        module0145.$g1932$ = SubLFiles.defparameter("S#12055", (SubLObject)module0145.NIL);
        module0145.$g1933$ = SubLFiles.defparameter("S#12056", (SubLObject)module0145.ONE_INTEGER);
        module0145.$g1934$ = SubLFiles.defparameter("S#12057", (SubLObject)module0145.ZERO_INTEGER);
        module0145.$g1935$ = SubLFiles.defparameter("S#12058", (SubLObject)module0145.NIL);
        module0145.$g1936$ = SubLFiles.defparameter("S#12059", (SubLObject)module0145.NIL);
        module0145.$g1937$ = SubLFiles.defparameter("S#12060", (SubLObject)module0145.NIL);
        module0145.$g1938$ = SubLFiles.defparameter("S#12061", (SubLObject)module0145.NIL);
        module0145.$g1939$ = SubLFiles.defparameter("S#12062", (SubLObject)module0145.NIL);
        module0145.$g1940$ = SubLFiles.defparameter("S#12063", (SubLObject)module0145.ONE_INTEGER);
        module0145.$g1941$ = SubLFiles.defparameter("S#12064", (SubLObject)module0145.THREE_INTEGER);
        module0145.$g1942$ = SubLFiles.defparameter("S#12065", (SubLObject)module0145.NIL);
        module0145.$g1943$ = SubLFiles.defparameter("S#12066", (SubLObject)module0145.NIL);
        module0145.$g1944$ = SubLFiles.defparameter("S#12067", (SubLObject)module0145.$ic90$);
        module0145.$g1945$ = SubLFiles.defparameter("S#12068", Mapping.mapcar(Symbols.symbol_function((SubLObject)module0145.$ic2$), module0145.$g1944$.getDynamicValue()));
        module0145.$g1946$ = SubLFiles.defparameter("S#12069", (SubLObject)module0145.NIL);
        module0145.$g1947$ = SubLFiles.defparameter("S#12070", ConsesLow.append((SubLObject)module0145.$ic94$, module0145.$g1945$.getDynamicValue()));
        module0145.$g1948$ = SubLFiles.defparameter("S#12071", (SubLObject)module0145.NIL);
        module0145.$g1949$ = SubLFiles.defparameter("S#12072", (SubLObject)module0145.NIL);
        module0145.$g1950$ = SubLFiles.defparameter("S#12073", (SubLObject)module0145.NIL);
        module0145.$g1951$ = SubLFiles.defparameter("S#12074", (SubLObject)module0145.ONE_INTEGER);
        module0145.$g1952$ = SubLFiles.defparameter("S#12075", (SubLObject)module0145.TWO_INTEGER);
        module0145.$g1953$ = SubLFiles.defparameter("S#12076", (SubLObject)module0145.$ic19$);
        module0145.$g1954$ = SubLFiles.defparameter("S#12077", (SubLObject)module0145.NIL);
        module0145.$g1955$ = SubLFiles.defparameter("S#12078", (SubLObject)module0145.NIL);
        module0145.$g1956$ = SubLFiles.defparameter("S#12079", (SubLObject)module0145.T);
        module0145.$g1957$ = SubLFiles.defparameter("S#12080", (SubLObject)module0145.NIL);
        return (SubLObject)module0145.NIL;
    }
    
    public static SubLObject f9482() {
        SubLObject var39 = (SubLObject)module0145.$ic1$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)module0145.$ic3$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)module0145.$ic5$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)module0145.$ic6$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)module0145.$ic7$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)module0145.$ic8$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)module0145.$ic9$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)module0145.$ic10$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)module0145.$ic11$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)module0145.$ic12$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)module0145.$ic14$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)module0145.$ic16$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)module0145.$ic18$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)module0145.$ic20$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)module0145.$ic21$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)module0145.$ic22$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)module0145.$ic23$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)module0145.$ic24$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)module0145.$ic25$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)module0145.$ic26$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)module0145.$ic27$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)module0145.$ic28$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)module0145.$ic29$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)module0145.$ic30$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)module0145.$ic32$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)module0145.$ic33$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)module0145.$ic34$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)module0145.$ic35$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)module0145.$ic36$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)module0145.$ic37$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)module0145.$ic39$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)module0145.$ic40$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)module0145.$ic41$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)module0145.$ic44$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)module0145.$ic45$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)module0145.$ic46$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)module0145.$ic47$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)module0145.$ic48$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)module0145.$ic49$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)module0145.$ic50$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)module0145.$ic51$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)module0145.$ic52$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)module0145.$ic53$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)module0145.$ic54$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)module0145.$ic55$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)module0145.$ic56$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)module0145.$ic57$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)module0145.$ic58$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)module0145.$ic59$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)module0145.$ic60$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)module0145.$ic61$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)module0145.$ic62$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)module0145.$ic63$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)module0145.$ic64$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)module0145.$ic65$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)module0145.$ic66$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)module0145.$ic67$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)module0145.$ic68$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)module0145.$ic69$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)module0145.$ic91$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)module0145.$ic92$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)module0145.$ic93$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)module0145.$ic95$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)module0145.$ic96$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)module0145.$ic97$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)module0145.$ic98$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)module0145.$ic99$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)module0145.$ic100$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)module0145.$ic101$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)module0145.$ic102$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)module0145.$ic103$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)module0145.$ic109$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        var39 = (SubLObject)module0145.$ic110$;
        if (module0145.NIL == conses_high.member(var39, module0012.$g55$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0145.EQL), Symbols.symbol_function((SubLObject)module0145.IDENTITY))) {
            module0012.$g55$.setGlobalValue((SubLObject)ConsesLow.cons(var39, module0012.$g55$.getGlobalValue()));
        }
        return (SubLObject)module0145.NIL;
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
        module0145.$g1884$ = null;
        module0145.$g1885$ = null;
        module0145.$g1886$ = null;
        module0145.$g1887$ = null;
        module0145.$g1888$ = null;
        module0145.$g1889$ = null;
        module0145.$g1890$ = null;
        module0145.$g1891$ = null;
        module0145.$g1892$ = null;
        module0145.$g1893$ = null;
        module0145.$g1894$ = null;
        module0145.$g1895$ = null;
        module0145.$g1896$ = null;
        module0145.$g1897$ = null;
        module0145.$g1898$ = null;
        module0145.$g1899$ = null;
        module0145.$g1900$ = null;
        module0145.$g1901$ = null;
        module0145.$g1902$ = null;
        module0145.$g1903$ = null;
        module0145.$g1904$ = null;
        module0145.$g1905$ = null;
        module0145.$g1906$ = null;
        module0145.$g1907$ = null;
        module0145.$g1908$ = null;
        module0145.$g1909$ = null;
        module0145.$g1910$ = null;
        module0145.$g1911$ = null;
        module0145.$g1912$ = null;
        module0145.$g1913$ = null;
        module0145.$g1914$ = null;
        module0145.$g1915$ = null;
        module0145.$g1916$ = null;
        module0145.$g1917$ = null;
        module0145.$g1918$ = null;
        module0145.$g1919$ = null;
        module0145.$g1920$ = null;
        module0145.$g1921$ = null;
        module0145.$g1922$ = null;
        module0145.$g1923$ = null;
        module0145.$g1924$ = null;
        module0145.$g1925$ = null;
        module0145.$g1926$ = null;
        module0145.$g1927$ = null;
        module0145.$g1928$ = null;
        module0145.$g1929$ = null;
        module0145.$g1930$ = null;
        module0145.$g1931$ = null;
        module0145.$g1932$ = null;
        module0145.$g1933$ = null;
        module0145.$g1934$ = null;
        module0145.$g1935$ = null;
        module0145.$g1936$ = null;
        module0145.$g1937$ = null;
        module0145.$g1938$ = null;
        module0145.$g1939$ = null;
        module0145.$g1940$ = null;
        module0145.$g1941$ = null;
        module0145.$g1942$ = null;
        module0145.$g1943$ = null;
        module0145.$g1944$ = null;
        module0145.$g1945$ = null;
        module0145.$g1946$ = null;
        module0145.$g1947$ = null;
        module0145.$g1948$ = null;
        module0145.$g1949$ = null;
        module0145.$g1950$ = null;
        module0145.$g1951$ = null;
        module0145.$g1952$ = null;
        module0145.$g1953$ = null;
        module0145.$g1954$ = null;
        module0145.$g1955$ = null;
        module0145.$g1956$ = null;
        module0145.$g1957$ = null;
        $ic0$ = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUPERIORS"), (SubLObject)SubLObjectFactory.makeSymbol("S#12081", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10466", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INFERIORS"), (SubLObject)SubLObjectFactory.makeSymbol("S#12082", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10466", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MIN-SUPERIORS"), (SubLObject)SubLObjectFactory.makeSymbol("S#12083", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10466", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-INFERIORS"), (SubLObject)SubLObjectFactory.makeSymbol("S#12084", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10466", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CO-INFERIORS"), (SubLObject)SubLObjectFactory.makeSymbol("S#12085", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10466", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CO-SUPERIORS"), (SubLObject)SubLObjectFactory.makeSymbol("S#12086", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10466", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REDUNDANT-SUPERIORS"), (SubLObject)SubLObjectFactory.makeSymbol("S#12087", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10466", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REDUNDANT-INFERIORS"), (SubLObject)SubLObjectFactory.makeSymbol("S#12088", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10466", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALL-SUPERIORS"), (SubLObject)SubLObjectFactory.makeSymbol("S#12089", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10466", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALL-INFERIORS"), (SubLObject)SubLObjectFactory.makeSymbol("S#12090", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10466", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALL-ACCESSIBLE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12091", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10466", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("UNION-ALL-INFERIORS"), (SubLObject)SubLObjectFactory.makeSymbol("S#12092", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10466", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COMPOSE-FN-SUPERIORS"), (SubLObject)SubLObjectFactory.makeSymbol("S#12093", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10466", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11675", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12094", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NCONC"))), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COMPOSE-FN-INFERIORS"), (SubLObject)SubLObjectFactory.makeSymbol("S#12095", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10466", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11675", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12094", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NCONC"))), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALL-DEPENDENT-INFERIORS"), (SubLObject)SubLObjectFactory.makeSymbol("S#12096", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10466", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COMPOSE-PRED-SUPERIORS"), (SubLObject)SubLObjectFactory.makeSymbol("S#12097", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10466", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#134", "CYC"), (SubLObject)module0145.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12098", "CYC"), (SubLObject)module0145.TWO_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COMPOSE-PRED-INFERIORS"), (SubLObject)SubLObjectFactory.makeSymbol("S#12099", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10466", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#134", "CYC"), (SubLObject)module0145.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12098", "CYC"), (SubLObject)module0145.TWO_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ROOTS"), (SubLObject)SubLObjectFactory.makeSymbol("S#12100", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10466", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LEAVES"), (SubLObject)SubLObjectFactory.makeSymbol("S#12101", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10466", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BOOLEAN?"), (SubLObject)SubLObjectFactory.makeSymbol("S#12102", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#750", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#751", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUPERIOR?"), (SubLObject)SubLObjectFactory.makeSymbol("S#12103", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9185", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12104", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INFERIOR?"), (SubLObject)SubLObjectFactory.makeSymbol("S#12105", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12104", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9185", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HAS-SUPERIOR?"), (SubLObject)SubLObjectFactory.makeSymbol("S#12106", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12104", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9185", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HAS-INFERIOR?"), (SubLObject)SubLObjectFactory.makeSymbol("S#12107", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9185", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12104", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("GATHER-SUPERIOR"), (SubLObject)SubLObjectFactory.makeSymbol("S#12108", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12109", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12110", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("GATHER-INFERIOR"), (SubLObject)SubLObjectFactory.makeSymbol("S#12111", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12112", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12110", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CYCLES?"), (SubLObject)SubLObjectFactory.makeSymbol("S#12113", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10466", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COMPLETES-CYCLE?"), (SubLObject)SubLObjectFactory.makeSymbol("S#12114", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12115", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12116", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MIN-NODES"), (SubLObject)SubLObjectFactory.makeSymbol("S#12117", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12118", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-NODES"), (SubLObject)SubLObjectFactory.makeSymbol("S#12119", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12118", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MIN-CEILINGS"), (SubLObject)SubLObjectFactory.makeSymbol("S#12120", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12118", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#12121", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-FLOORS"), (SubLObject)SubLObjectFactory.makeSymbol("S#12122", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12118", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#12121", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MIN-SUPERIORS-EXCLUDING"), (SubLObject)SubLObjectFactory.makeSymbol("S#12123", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12104", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9185", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-INFERIORS-EXCLUDING"), (SubLObject)SubLObjectFactory.makeSymbol("S#12124", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9185", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12104", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANY-SUPERIOR-PATH"), (SubLObject)SubLObjectFactory.makeSymbol("S#12125", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12104", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9185", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("WHY-SUPERIOR?"), (SubLObject)SubLObjectFactory.makeSymbol("S#12126", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9185", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12104", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("WHY-COMPLETES-CYCLE?"), (SubLObject)SubLObjectFactory.makeSymbol("S#12127", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12128", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12129", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALL-SUPERIOR-EDGES"), (SubLObject)SubLObjectFactory.makeSymbol("S#12130", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12104", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9185", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALL-INFERIOR-EDGES"), (SubLObject)SubLObjectFactory.makeSymbol("S#12131", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12104", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9185", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALL-PATHS"), (SubLObject)SubLObjectFactory.makeSymbol("S#12132", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12104", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9185", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INFERIORS-WITH-MTS"), (SubLObject)SubLObjectFactory.makeSymbol("S#12133", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9185", "CYC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUPERIOR-IN-WHAT-MTS"), (SubLObject)SubLObjectFactory.makeSymbol("S#12134", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12104", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9185", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12135", "CYC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INFERIOR-IN-WHAT-MTS"), (SubLObject)SubLObjectFactory.makeSymbol("S#12134", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9185", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12104", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12135", "CYC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ACCESSIBLE-IN-WHAT-MTS"), (SubLObject)SubLObjectFactory.makeSymbol("S#12136", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12104", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9185", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12135", "CYC"))) });
        $ic1$ = SubLObjectFactory.makeSymbol("S#12008", "CYC");
        $ic2$ = SubLObjectFactory.makeSymbol("CAR");
        $ic3$ = SubLObjectFactory.makeSymbol("S#12009", "CYC");
        $ic4$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), (SubLObject)SubLObjectFactory.makeKeyword("INDEX-ARG"), (SubLObject)SubLObjectFactory.makeKeyword("GATHER-ARG"), (SubLObject)SubLObjectFactory.makeKeyword("ACCESSORS"), (SubLObject)SubLObjectFactory.makeKeyword("MT"));
        $ic5$ = SubLObjectFactory.makeSymbol("S#12010", "CYC");
        $ic6$ = SubLObjectFactory.makeSymbol("S#12011", "CYC");
        $ic7$ = SubLObjectFactory.makeSymbol("S#12012", "CYC");
        $ic8$ = SubLObjectFactory.makeSymbol("S#12013", "CYC");
        $ic9$ = SubLObjectFactory.makeSymbol("S#12014", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("S#12015", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#12016", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#12017", "CYC");
        $ic13$ = SubLObjectFactory.makeKeyword("ASSERTION");
        $ic14$ = SubLObjectFactory.makeSymbol("S#12018", "CYC");
        $ic15$ = SubLObjectFactory.makeKeyword("SUPERIOR");
        $ic16$ = SubLObjectFactory.makeSymbol("S#12019", "CYC");
        $ic17$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUPERIOR"), (SubLObject)SubLObjectFactory.makeKeyword("INFERIOR"), (SubLObject)SubLObjectFactory.makeKeyword("ACCESSIBLE"), (SubLObject)SubLObjectFactory.makeKeyword("DIRECTED"), (SubLObject)SubLObjectFactory.makeKeyword("INVERSE"));
        $ic18$ = SubLObjectFactory.makeSymbol("S#12020", "CYC");
        $ic19$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic20$ = SubLObjectFactory.makeSymbol("S#12021", "CYC");
        $ic21$ = SubLObjectFactory.makeSymbol("S#12022", "CYC");
        $ic22$ = SubLObjectFactory.makeSymbol("S#12023", "CYC");
        $ic23$ = SubLObjectFactory.makeSymbol("S#12024", "CYC");
        $ic24$ = SubLObjectFactory.makeSymbol("S#12025", "CYC");
        $ic25$ = SubLObjectFactory.makeSymbol("S#12026", "CYC");
        $ic26$ = SubLObjectFactory.makeSymbol("S#12027", "CYC");
        $ic27$ = SubLObjectFactory.makeSymbol("S#12028", "CYC");
        $ic28$ = SubLObjectFactory.makeSymbol("S#12029", "CYC");
        $ic29$ = SubLObjectFactory.makeSymbol("S#12030", "CYC");
        $ic30$ = SubLObjectFactory.makeSymbol("S#12031", "CYC");
        $ic31$ = SubLObjectFactory.makeSymbol("NCONC");
        $ic32$ = SubLObjectFactory.makeSymbol("S#12032", "CYC");
        $ic33$ = SubLObjectFactory.makeSymbol("S#12033", "CYC");
        $ic34$ = SubLObjectFactory.makeSymbol("S#12034", "CYC");
        $ic35$ = SubLObjectFactory.makeSymbol("S#12035", "CYC");
        $ic36$ = SubLObjectFactory.makeSymbol("S#12036", "CYC");
        $ic37$ = SubLObjectFactory.makeSymbol("S#12037", "CYC");
        $ic38$ = SubLObjectFactory.makeKeyword("DOWN");
        $ic39$ = SubLObjectFactory.makeSymbol("*GT-MAX-NODES-DIRECTION*");
        $ic40$ = SubLObjectFactory.makeSymbol("S#12038", "CYC");
        $ic41$ = SubLObjectFactory.makeSymbol("S#12039", "CYC");
        $ic42$ = SubLObjectFactory.makeString("Current link support ~a is not a valid support for determining link mt.");
        $ic43$ = SubLObjectFactory.makeString("Current link support ~a is not a valid support for determining link predicate.");
        $ic44$ = SubLObjectFactory.makeSymbol("S#12041", "CYC");
        $ic45$ = SubLObjectFactory.makeSymbol("S#12042", "CYC");
        $ic46$ = SubLObjectFactory.makeSymbol("S#12043", "CYC");
        $ic47$ = SubLObjectFactory.makeSymbol("S#12044", "CYC");
        $ic48$ = SubLObjectFactory.makeSymbol("S#12045", "CYC");
        $ic49$ = SubLObjectFactory.makeSymbol("S#12046", "CYC");
        $ic50$ = SubLObjectFactory.makeSymbol("S#12047", "CYC");
        $ic51$ = SubLObjectFactory.makeSymbol("S#12048", "CYC");
        $ic52$ = SubLObjectFactory.makeSymbol("S#12049", "CYC");
        $ic53$ = SubLObjectFactory.makeSymbol("S#12050", "CYC");
        $ic54$ = SubLObjectFactory.makeSymbol("S#12051", "CYC");
        $ic55$ = SubLObjectFactory.makeSymbol("S#12052", "CYC");
        $ic56$ = SubLObjectFactory.makeSymbol("S#12053", "CYC");
        $ic57$ = SubLObjectFactory.makeSymbol("S#12054", "CYC");
        $ic58$ = SubLObjectFactory.makeSymbol("S#12055", "CYC");
        $ic59$ = SubLObjectFactory.makeSymbol("S#12056", "CYC");
        $ic60$ = SubLObjectFactory.makeSymbol("S#12057", "CYC");
        $ic61$ = SubLObjectFactory.makeSymbol("S#12058", "CYC");
        $ic62$ = SubLObjectFactory.makeSymbol("S#12059", "CYC");
        $ic63$ = SubLObjectFactory.makeSymbol("S#12060", "CYC");
        $ic64$ = SubLObjectFactory.makeSymbol("S#12061", "CYC");
        $ic65$ = SubLObjectFactory.makeSymbol("S#12062", "CYC");
        $ic66$ = SubLObjectFactory.makeSymbol("S#12063", "CYC");
        $ic67$ = SubLObjectFactory.makeSymbol("S#12064", "CYC");
        $ic68$ = SubLObjectFactory.makeSymbol("S#12065", "CYC");
        $ic69$ = SubLObjectFactory.makeSymbol("S#12066", "CYC");
        $ic70$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#205", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#138", "CYC"));
        $ic71$ = SubLObjectFactory.makeKeyword("ACCESSORS");
        $ic72$ = SubLObjectFactory.makeKeyword("PREDICATE");
        $ic73$ = SubLObjectFactory.makeKeyword("INDEX-ARG");
        $ic74$ = SubLObjectFactory.makeKeyword("GATHER-ARG");
        $ic75$ = SubLObjectFactory.makeKeyword("MT");
        $ic76$ = SubLObjectFactory.makeSymbol("DEFINE");
        $ic77$ = SubLObjectFactory.makeSymbol("CLET");
        $ic78$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#3267", "CYC"));
        $ic79$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12018", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("ASSERTION"));
        $ic80$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12047", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAKE-HASH-TABLE"), (SubLObject)SubLObjectFactory.makeInteger(128))));
        $ic81$ = SubLObjectFactory.makeSymbol("CSETQ");
        $ic82$ = SubLObjectFactory.makeSymbol("S#3267", "CYC");
        $ic83$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("S#3267", "CYC")));
        $ic84$ = SubLObjectFactory.makeSymbol("QUOTE");
        $ic85$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12018", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("ACCESSORS")));
        $ic86$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic87$ = SubLObjectFactory.makeSymbol("S#12137", "CYC");
        $ic88$ = SubLObjectFactory.makeSymbol("CPUSHNEW");
        $ic89$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12011", "CYC"));
        $ic90$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALL-TARGETS"), (SubLObject)SubLObjectFactory.makeSymbol("S#12138", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10466", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALL-SOURCES"), (SubLObject)SubLObjectFactory.makeSymbol("S#12139", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10466", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BOOLEAN?"), (SubLObject)SubLObjectFactory.makeSymbol("S#12140", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10466", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ACCESSES-IN-WHAT-MTS"), (SubLObject)SubLObjectFactory.makeSymbol("S#12142", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10466", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"))));
        $ic91$ = SubLObjectFactory.makeSymbol("S#12067", "CYC");
        $ic92$ = SubLObjectFactory.makeSymbol("S#12068", "CYC");
        $ic93$ = SubLObjectFactory.makeSymbol("S#12069", "CYC");
        $ic94$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), (SubLObject)SubLObjectFactory.makeKeyword("CONDUIT-PRED"), (SubLObject)SubLObjectFactory.makeKeyword("TT-INDEX-ARG"), (SubLObject)SubLObjectFactory.makeKeyword("TT-GATHER-ARG"), (SubLObject)SubLObjectFactory.makeKeyword("GT-INDEX-ARG"), (SubLObject)SubLObjectFactory.makeKeyword("GT-GATHER-ARG"), (SubLObject)SubLObjectFactory.makeKeyword("MT"));
        $ic95$ = SubLObjectFactory.makeSymbol("S#12070", "CYC");
        $ic96$ = SubLObjectFactory.makeSymbol("S#12071", "CYC");
        $ic97$ = SubLObjectFactory.makeSymbol("S#12072", "CYC");
        $ic98$ = SubLObjectFactory.makeSymbol("S#12073", "CYC");
        $ic99$ = SubLObjectFactory.makeSymbol("S#12074", "CYC");
        $ic100$ = SubLObjectFactory.makeSymbol("S#12075", "CYC");
        $ic101$ = SubLObjectFactory.makeSymbol("S#12076", "CYC");
        $ic102$ = SubLObjectFactory.makeSymbol("S#12077", "CYC");
        $ic103$ = SubLObjectFactory.makeSymbol("S#12078", "CYC");
        $ic104$ = SubLObjectFactory.makeKeyword("CONDUIT-PRED");
        $ic105$ = SubLObjectFactory.makeSymbol("TRANSITIVE-PREDICATE?");
        $ic106$ = SubLObjectFactory.makeSymbol("S#12143", "CYC");
        $ic107$ = SubLObjectFactory.makeSymbol("S#12144", "CYC");
        $ic108$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12069", "CYC"));
        $ic109$ = SubLObjectFactory.makeSymbol("S#12079", "CYC");
        $ic110$ = SubLObjectFactory.makeSymbol("S#12080", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0145.class
	Total time: 358 ms
	
	Decompiled with Procyon 0.5.32.
*/