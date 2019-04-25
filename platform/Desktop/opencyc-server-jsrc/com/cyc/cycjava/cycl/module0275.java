package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0275 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0275";
    public static final String myFingerPrint = "3fa0065d757a10722c716f1f07565eb0af751f209f5563b90c68c6d1560e0a29";
    private static SubLSymbol $g2589$;
    private static SubLSymbol $g2590$;
    public static SubLSymbol $g2591$;
    public static SubLSymbol $g2592$;
    public static SubLSymbol $g2593$;
    public static SubLSymbol $g2594$;
    private static final SubLSymbol $ic0$;
    private static final SubLList $ic1$;
    private static final SubLObject $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLObject $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLObject $ic6$;
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
    private static final SubLSymbol $ic17$;
    private static final SubLList $ic18$;
    private static final SubLObject $ic19$;
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
    private static final SubLList $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLString $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLList $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLList $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLList $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLList $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLList $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLList $ic61$;
    private static final SubLList $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLList $ic66$;
    private static final SubLList $ic67$;
    private static final SubLObject $ic68$;
    private static final SubLObject $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLList $ic74$;
    private static final SubLObject $ic75$;
    private static final SubLList $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLList $ic80$;
    private static final SubLList $ic81$;
    private static final SubLObject $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLList $ic84$;
    private static final SubLObject $ic85$;
    private static final SubLObject $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLObject $ic88$;
    private static final SubLList $ic89$;
    private static final SubLList $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLObject $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLList $ic94$;
    private static final SubLList $ic95$;
    private static final SubLObject $ic96$;
    private static final SubLObject $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLList $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLObject $ic103$;
    private static final SubLObject $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLList $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLObject $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLList $ic114$;
    private static final SubLSymbol $ic115$;
    private static final SubLObject $ic116$;
    private static final SubLObject $ic117$;
    private static final SubLList $ic118$;
    private static final SubLList $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLList $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLList $ic125$;
    private static final SubLSymbol $ic126$;
    private static final SubLList $ic127$;
    private static final SubLSymbol $ic128$;
    private static final SubLList $ic129$;
    private static final SubLSymbol $ic130$;
    private static final SubLList $ic131$;
    private static final SubLSymbol $ic132$;
    private static final SubLSymbol $ic133$;
    private static final SubLList $ic134$;
    private static final SubLSymbol $ic135$;
    private static final SubLSymbol $ic136$;
    private static final SubLSymbol $ic137$;
    private static final SubLObject $ic138$;
    private static final SubLObject $ic139$;
    private static final SubLList $ic140$;
    private static final SubLSymbol $ic141$;
    private static final SubLSymbol $ic142$;
    private static final SubLList $ic143$;
    private static final SubLSymbol $ic144$;
    private static final SubLList $ic145$;
    private static final SubLSymbol $ic146$;
    private static final SubLSymbol $ic147$;
    private static final SubLList $ic148$;
    private static final SubLSymbol $ic149$;
    private static final SubLSymbol $ic150$;
    private static final SubLList $ic151$;
    private static final SubLSymbol $ic152$;
    private static final SubLList $ic153$;
    private static final SubLList $ic154$;
    private static final SubLSymbol $ic155$;
    private static final SubLSymbol $ic156$;
    private static final SubLObject $ic157$;
    private static final SubLSymbol $ic158$;
    private static final SubLSymbol $ic159$;
    
    public static SubLObject f18234(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = module0274.f18188(var1, var2, (SubLObject)UNPROVIDED);
        return f18235(var3);
    }
    
    public static SubLObject f18235(final SubLObject var3) {
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        if (NIL == var8) {
            SubLObject var9 = var3;
            SubLObject var10 = (SubLObject)NIL;
            var10 = var9.first();
            while (NIL == var8 && NIL != var9) {
                final SubLObject var11 = module0303.f20223(var10);
                if (var11.eql((SubLObject)$ic0$)) {
                    SubLObject var13;
                    final SubLObject var12 = var13 = var10;
                    SubLObject var14 = (SubLObject)NIL;
                    SubLObject var15 = (SubLObject)NIL;
                    SubLObject var16 = (SubLObject)NIL;
                    SubLObject var17 = (SubLObject)NIL;
                    SubLObject var18 = (SubLObject)NIL;
                    SubLObject var19 = (SubLObject)NIL;
                    SubLObject var20 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)$ic1$);
                    var14 = var13.first();
                    var13 = var13.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)$ic1$);
                    var15 = var13.first();
                    var13 = var13.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)$ic1$);
                    var16 = var13.first();
                    var13 = var13.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)$ic1$);
                    var17 = var13.first();
                    var13 = var13.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)$ic1$);
                    var18 = var13.first();
                    var13 = var13.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)$ic1$);
                    var19 = var13.first();
                    var13 = (var20 = var13.rest());
                    if (NIL != module0305.f20444(var15, var18, var19)) {
                        var8 = (SubLObject)T;
                    }
                    else {
                        final SubLObject var21 = module0202.f12768($ic2$, var15, var18);
                        if (NIL == conses_high.member(var21, var4, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                            var4 = (SubLObject)ConsesLow.cons(var21, var4);
                        }
                    }
                }
                else if (var11.eql((SubLObject)$ic3$)) {
                    SubLObject var23;
                    final SubLObject var22 = var23 = var10;
                    SubLObject var14 = (SubLObject)NIL;
                    SubLObject var15 = (SubLObject)NIL;
                    SubLObject var16 = (SubLObject)NIL;
                    SubLObject var17 = (SubLObject)NIL;
                    SubLObject var18 = (SubLObject)NIL;
                    SubLObject var19 = (SubLObject)NIL;
                    SubLObject var20 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)$ic1$);
                    var14 = var23.first();
                    var23 = var23.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)$ic1$);
                    var15 = var23.first();
                    var23 = var23.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)$ic1$);
                    var16 = var23.first();
                    var23 = var23.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)$ic1$);
                    var17 = var23.first();
                    var23 = var23.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)$ic1$);
                    var18 = var23.first();
                    var23 = var23.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)$ic1$);
                    var19 = var23.first();
                    var23 = (var20 = var23.rest());
                    if (NIL != module0305.f20530(var15, var18, var19)) {
                        var8 = (SubLObject)T;
                    }
                    else {
                        final SubLObject var21 = module0202.f12768($ic4$, var15, var18);
                        if (NIL == conses_high.member(var21, var4, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                            var4 = (SubLObject)ConsesLow.cons(var21, var4);
                        }
                    }
                }
                else if (var11.eql((SubLObject)$ic5$)) {
                    SubLObject var25;
                    final SubLObject var24 = var25 = var10;
                    SubLObject var14 = (SubLObject)NIL;
                    SubLObject var15 = (SubLObject)NIL;
                    SubLObject var16 = (SubLObject)NIL;
                    SubLObject var17 = (SubLObject)NIL;
                    SubLObject var18 = (SubLObject)NIL;
                    SubLObject var19 = (SubLObject)NIL;
                    SubLObject var20 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var25, var24, (SubLObject)$ic1$);
                    var14 = var25.first();
                    var25 = var25.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var25, var24, (SubLObject)$ic1$);
                    var15 = var25.first();
                    var25 = var25.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var25, var24, (SubLObject)$ic1$);
                    var16 = var25.first();
                    var25 = var25.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var25, var24, (SubLObject)$ic1$);
                    var17 = var25.first();
                    var25 = var25.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var25, var24, (SubLObject)$ic1$);
                    var18 = var25.first();
                    var25 = var25.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var25, var24, (SubLObject)$ic1$);
                    var19 = var25.first();
                    var25 = (var20 = var25.rest());
                    if (NIL != module0256.f16613(var15, var18, var19, (SubLObject)UNPROVIDED)) {
                        var8 = (SubLObject)T;
                    }
                    else {
                        final SubLObject var21 = module0202.f12768($ic6$, var15, var18);
                        if (NIL == conses_high.member(var21, var6, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                            var6 = (SubLObject)ConsesLow.cons(var21, var6);
                        }
                    }
                }
                else if (var11.eql((SubLObject)$ic7$) || var11.eql((SubLObject)$ic8$) || var11.eql((SubLObject)$ic9$)) {
                    var8 = (SubLObject)T;
                }
                else if (!var11.eql((SubLObject)$ic10$)) {
                    if (!var11.eql((SubLObject)$ic11$)) {
                        if (!var11.eql((SubLObject)$ic12$)) {
                            if (var11.eql((SubLObject)$ic13$) || var11.eql((SubLObject)$ic14$)) {
                                var8 = (SubLObject)T;
                            }
                            else if (var11.eql((SubLObject)$ic15$) || var11.eql((SubLObject)$ic16$)) {
                                var8 = (SubLObject)T;
                            }
                            else if (var11.eql((SubLObject)$ic17$)) {
                                SubLObject var27;
                                final SubLObject var26 = var27 = var10;
                                SubLObject var14 = (SubLObject)NIL;
                                SubLObject var28 = (SubLObject)NIL;
                                SubLObject var29 = (SubLObject)NIL;
                                SubLObject var30 = (SubLObject)NIL;
                                SubLObject var31 = (SubLObject)NIL;
                                SubLObject var32 = (SubLObject)NIL;
                                SubLObject var33 = (SubLObject)NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(var27, var26, (SubLObject)$ic18$);
                                var14 = var27.first();
                                var27 = var27.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(var27, var26, (SubLObject)$ic18$);
                                var28 = var27.first();
                                var27 = var27.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(var27, var26, (SubLObject)$ic18$);
                                var29 = var27.first();
                                var27 = var27.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(var27, var26, (SubLObject)$ic18$);
                                var30 = var27.first();
                                var27 = var27.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(var27, var26, (SubLObject)$ic18$);
                                var31 = var27.first();
                                var27 = var27.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(var27, var26, (SubLObject)$ic18$);
                                var32 = var27.first();
                                var27 = var27.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(var27, var26, (SubLObject)$ic18$);
                                var33 = var27.first();
                                var27 = var27.rest();
                                final SubLObject var34 = (SubLObject)(var27.isCons() ? var27.first() : NIL);
                                cdestructuring_bind.destructuring_bind_must_listp(var27, var26, (SubLObject)$ic18$);
                                var27 = var27.rest();
                                if (NIL == var27) {
                                    if (NIL != module0331.f22370(var29, var31, var33, (SubLObject)UNPROVIDED)) {
                                        var8 = (SubLObject)T;
                                    }
                                    else {
                                        final SubLObject var35 = module0202.f12768($ic19$, var29, var31);
                                        if (NIL == conses_high.member(var35, var7, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                                            var7 = (SubLObject)ConsesLow.cons(var35, var7);
                                        }
                                    }
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(var26, (SubLObject)$ic18$);
                                }
                            }
                            else if (var11.eql((SubLObject)$ic20$)) {
                                var8 = (SubLObject)T;
                            }
                            else if (var11.eql((SubLObject)$ic21$) || var11.eql((SubLObject)$ic22$)) {
                                var8 = (SubLObject)T;
                            }
                            else if (var11.eql((SubLObject)$ic23$) || var11.eql((SubLObject)$ic24$) || var11.eql((SubLObject)$ic25$)) {
                                var8 = (SubLObject)T;
                            }
                            else if (var11.eql((SubLObject)$ic26$) || var11.eql((SubLObject)$ic27$) || var11.eql((SubLObject)$ic28$) || var11.eql((SubLObject)$ic29$)) {
                                var8 = (SubLObject)T;
                            }
                            else if (var11.eql((SubLObject)$ic30$) || var11.eql((SubLObject)$ic31$) || var11.eql((SubLObject)$ic32$) || var11.eql((SubLObject)$ic33$) || var11.eql((SubLObject)$ic34$)) {
                                var8 = (SubLObject)T;
                            }
                            else if (var11.eql((SubLObject)$ic35$) || var11.eql((SubLObject)$ic36$) || var11.eql((SubLObject)$ic37$) || var11.eql((SubLObject)$ic38$)) {
                                var8 = (SubLObject)T;
                            }
                            else if (var11.eql((SubLObject)$ic39$)) {
                                var8 = (SubLObject)T;
                            }
                        }
                    }
                }
                var9 = var9.rest();
                var10 = var9.first();
            }
        }
        var4 = module0035.f2462(var4, (SubLObject)$ic40$, (SubLObject)$ic41$);
        var5 = module0035.f2462(var5, (SubLObject)$ic40$, (SubLObject)$ic41$);
        var6 = module0035.f2462(var6, (SubLObject)$ic40$, (SubLObject)$ic41$);
        return (SubLObject)((NIL != var8) ? NIL : ConsesLow.append(var4, var5, var6, var7));
    }
    
    public static SubLObject f18236(final SubLObject var32, SubLObject var33) {
        if (var33 == UNPROVIDED) {
            var33 = (SubLObject)$ic42$;
        }
        SubLObject var34 = (SubLObject)NIL;
        SubLObject var35 = (SubLObject)NIL;
        SubLObject var36 = (SubLObject)NIL;
        SubLObject var37 = (SubLObject)NIL;
        SubLObject var38 = (SubLObject)NIL;
        SubLObject var39 = (SubLObject)NIL;
        SubLObject var40 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var32, var32, (SubLObject)$ic43$);
        var34 = var32.first();
        SubLObject var41 = var32.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var41, var32, (SubLObject)$ic43$);
        var35 = var41.first();
        var41 = var41.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var41, var32, (SubLObject)$ic43$);
        var36 = var41.first();
        var41 = var41.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var41, var32, (SubLObject)$ic43$);
        var37 = var41.first();
        var41 = var41.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var41, var32, (SubLObject)$ic43$);
        var38 = var41.first();
        var41 = var41.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var41, var32, (SubLObject)$ic43$);
        var39 = var41.first();
        var41 = (var40 = var41.rest());
        final SubLObject var42 = conses_high.cadr(conses_high.assoc((SubLObject)$ic44$, var40, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        final SubLObject var43 = conses_high.cadr(conses_high.assoc((SubLObject)$ic45$, var40, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        final SubLObject var44 = var33;
        if (var44.eql((SubLObject)$ic46$)) {
            return PrintLow.format((SubLObject)NIL, (SubLObject)$ic47$, var34);
        }
        if (var44.eql((SubLObject)$ic42$)) {
            final SubLObject var45 = conses_high.cadr(conses_high.assoc((SubLObject)$ic48$, var40, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
            final SubLObject var46 = module0178.f11285(var45);
            final SubLObject var47 = module0178.f11287(var45);
            return ConsesLow.append(new SubLObject[] { f18237(var34, var35, var38, var39), f18238(var34, var35, var46, var39), f18239(var34, $ic2$, var36, var37, var35, var38, var43, var39), f18240(var34, var36, var39, var42, var46, var47), f18241(var34, $ic2$, var35, var38, var39, var46, var47) });
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f18242(final SubLObject var32, SubLObject var33) {
        if (var33 == UNPROVIDED) {
            var33 = (SubLObject)$ic42$;
        }
        SubLObject var34 = (SubLObject)NIL;
        SubLObject var35 = (SubLObject)NIL;
        SubLObject var36 = (SubLObject)NIL;
        SubLObject var37 = (SubLObject)NIL;
        SubLObject var38 = (SubLObject)NIL;
        SubLObject var39 = (SubLObject)NIL;
        SubLObject var40 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var32, var32, (SubLObject)$ic43$);
        var34 = var32.first();
        SubLObject var41 = var32.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var41, var32, (SubLObject)$ic43$);
        var35 = var41.first();
        var41 = var41.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var41, var32, (SubLObject)$ic43$);
        var36 = var41.first();
        var41 = var41.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var41, var32, (SubLObject)$ic43$);
        var37 = var41.first();
        var41 = var41.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var41, var32, (SubLObject)$ic43$);
        var38 = var41.first();
        var41 = var41.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var41, var32, (SubLObject)$ic43$);
        var39 = var41.first();
        var41 = (var40 = var41.rest());
        final SubLObject var42 = conses_high.cadr(conses_high.assoc((SubLObject)$ic44$, var40, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        final SubLObject var43 = conses_high.cadr(conses_high.assoc((SubLObject)$ic45$, var40, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        final SubLObject var44 = var33;
        if (var44.eql((SubLObject)$ic46$)) {
            return PrintLow.format((SubLObject)NIL, (SubLObject)$ic47$, var34);
        }
        if (var44.eql((SubLObject)$ic42$)) {
            final SubLObject var45 = conses_high.cadr(conses_high.assoc((SubLObject)$ic48$, var40, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
            final SubLObject var46 = (SubLObject)((NIL != var45) ? module0178.f11285(var45) : NIL);
            final SubLObject var47 = (SubLObject)((NIL != var45) ? module0178.f11287(var45) : NIL);
            return ConsesLow.append(new SubLObject[] { f18243(var34, var35, var38, var39), f18238(var34, var35, var46, var39), f18239(var34, $ic2$, var36, var37, var35, var38, var43, var39), f18240(var34, var36, var39, var42, var46, var47), f18241(var34, $ic2$, var35, var38, var39, var46, var47) });
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f18244(final SubLObject var32, SubLObject var33) {
        if (var33 == UNPROVIDED) {
            var33 = (SubLObject)$ic42$;
        }
        SubLObject var34 = (SubLObject)NIL;
        SubLObject var35 = (SubLObject)NIL;
        SubLObject var36 = (SubLObject)NIL;
        SubLObject var37 = (SubLObject)NIL;
        SubLObject var38 = (SubLObject)NIL;
        SubLObject var39 = (SubLObject)NIL;
        SubLObject var40 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var32, var32, (SubLObject)$ic43$);
        var34 = var32.first();
        SubLObject var41 = var32.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var41, var32, (SubLObject)$ic43$);
        var35 = var41.first();
        var41 = var41.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var41, var32, (SubLObject)$ic43$);
        var36 = var41.first();
        var41 = var41.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var41, var32, (SubLObject)$ic43$);
        var37 = var41.first();
        var41 = var41.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var41, var32, (SubLObject)$ic43$);
        var38 = var41.first();
        var41 = var41.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var41, var32, (SubLObject)$ic43$);
        var39 = var41.first();
        var41 = (var40 = var41.rest());
        final SubLObject var42 = conses_high.cadr(conses_high.assoc((SubLObject)$ic44$, var40, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        final SubLObject var43 = conses_high.cadr(conses_high.assoc((SubLObject)$ic45$, var40, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        final SubLObject var44 = var33;
        if (var44.eql((SubLObject)$ic46$)) {
            return PrintLow.format((SubLObject)NIL, (SubLObject)$ic47$, var34);
        }
        if (var44.eql((SubLObject)$ic42$)) {
            final SubLObject var45 = conses_high.cadr(conses_high.assoc((SubLObject)$ic48$, var40, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
            final SubLObject var46 = module0178.f11285(var45);
            final SubLObject var47 = module0178.f11287(var45);
            return ConsesLow.append(new SubLObject[] { f18245(var34, var35, var38, var39), f18238(var34, var35, var46, var39), f18239(var34, $ic6$, var36, var37, var35, var38, var43, var39), f18240(var34, var36, var39, var42, var46, var47), f18241(var34, $ic6$, var35, var38, var39, var46, var47) });
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f18237(final SubLObject var14, final SubLObject var15, final SubLObject var18, final SubLObject var2) {
        if (NIL != f18246(var14, (SubLObject)$ic49$, (SubLObject)UNPROVIDED)) {
            final SubLObject var19 = (SubLObject)$ic50$;
            return ConsesLow.append(f18247(var14, $ic2$, var15, var18, var2, var19), f18248(var14, var15, var18, var2, var19), f18249(var14, var15, var18, var2, var19));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f18243(final SubLObject var14, final SubLObject var15, final SubLObject var18, final SubLObject var2) {
        if (NIL != f18246(var14, (SubLObject)$ic49$, (SubLObject)UNPROVIDED)) {
            final SubLObject var19 = (SubLObject)$ic50$;
            final SubLObject var20 = module0205.f13338(module0202.f12768($ic2$, var15, var18));
            return ConsesLow.append(f18250(var14, (SubLObject)$ic51$, var20, var2, var19), f18237(var14, var15, var18, var2));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f18245(final SubLObject var14, final SubLObject var15, final SubLObject var18, final SubLObject var2) {
        if (NIL != f18246(var14, (SubLObject)$ic49$, (SubLObject)UNPROVIDED)) {
            final SubLObject var19 = (SubLObject)$ic50$;
            return f18247(var14, $ic6$, var15, var18, var2, var19);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f18238(final SubLObject var14, final SubLObject var15, final SubLObject var50, final SubLObject var2) {
        if (NIL != f18246(var14, (SubLObject)$ic52$, (SubLObject)UNPROVIDED)) {
            final SubLObject var51 = (SubLObject)$ic53$;
            return ConsesLow.append(f18251(var14, var15, var50, var2, var51), f18252(var14, var15, var50, var2, var51));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f18239(final SubLObject var14, final SubLObject var51, final SubLObject var37, final SubLObject var38, final SubLObject var15, final SubLObject var18, final SubLObject var50, final SubLObject var2) {
        if (NIL != f18246(var14, (SubLObject)$ic54$, (SubLObject)UNPROVIDED)) {
            final SubLObject var52 = (SubLObject)$ic55$;
            return ConsesLow.append(new SubLObject[] { f18253(var14, var51, var37, var38, var15, var18, var50, var2, var52), f18254(var14, var51, var15, var18, var50, var2, var52), f18255(var14, var37, var38, var15, var50, var2, var52), f18256(var14, var37, var38, var15, var50, var2, var52), f18257(var14, var51, var15, var18, var2, var50, var52), f18258(var14, var50, var2, var52) });
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f18240(final SubLObject var14, final SubLObject var37, final SubLObject var2, final SubLObject var39, final SubLObject var42, final SubLObject var43) {
        if (NIL != f18246(var14, (SubLObject)$ic56$, (SubLObject)UNPROVIDED)) {
            final SubLObject var44 = (SubLObject)$ic57$;
            return ConsesLow.append(f18259(var14, var2, var42, var43, var44), f18260(var14, var37, var2, var39, var44));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f18241(final SubLObject var14, final SubLObject var51, final SubLObject var15, final SubLObject var18, final SubLObject var2, final SubLObject var42, final SubLObject var43) {
        if (NIL != f18246(var14, (SubLObject)$ic58$, (SubLObject)UNPROVIDED)) {
            final SubLObject var52 = (SubLObject)$ic59$;
            return ConsesLow.append(f18261(var14, var51, var15, var18, var2, var42, var43, var52), f18262(var14, var51, var15, var18, var2, var42, var43, var52), f18263(var14, var42, var43, var52));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f18247(final SubLObject var14, final SubLObject var51, final SubLObject var27, final SubLObject var29, final SubLObject var2, final SubLObject var48) {
        final SubLThread var52 = SubLProcess.currentSubLThread();
        if (NIL != f18246(var14, var48, (SubLObject)$ic60$)) {
            final SubLObject var53 = module0202.f12768(var51, var27, var29);
            final SubLObject var54 = (SubLObject)$ic61$;
            final SubLObject var55 = (SubLObject)$ic62$;
            final SubLObject var56 = f18264(var53, var2);
            if (NIL == $g2590$.getDynamicValue(var52) || NIL != f18265(var56)) {
                return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)$ic63$, var53, (SubLObject)ConsesLow.list((SubLObject)$ic64$, var2), ConsesLow.append(var56, (SubLObject)ConsesLow.list(var48, var54, var55))));
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f18248(final SubLObject var14, final SubLObject var15, final SubLObject var18, final SubLObject var2, final SubLObject var48) {
        final SubLThread var49 = SubLProcess.currentSubLThread();
        if (NIL != f18246(var14, var48, (SubLObject)$ic65$)) {
            final SubLObject var50 = (SubLObject)$ic66$;
            final SubLObject var51 = (SubLObject)$ic67$;
            SubLObject var52 = (SubLObject)NIL;
            SubLObject var53 = module0226.f14980(var18, var2);
            SubLObject var54 = (SubLObject)NIL;
            var54 = var53.first();
            while (NIL != var53) {
                final SubLObject var55 = (SubLObject)ConsesLow.list($ic68$, var2, (SubLObject)ConsesLow.list($ic69$, var54, var15));
                final SubLObject var56 = f18264(var55, var2);
                if (NIL == $g2590$.getDynamicValue(var49) || NIL != f18265(var56)) {
                    var52 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic70$, var54, (SubLObject)ConsesLow.listS((SubLObject)$ic71$, var55, ConsesLow.append(var56, (SubLObject)NIL)), var48, var50, var51), var52);
                }
                var53 = var53.rest();
                var54 = var53.first();
            }
            return var52;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f18249(final SubLObject var14, final SubLObject var15, final SubLObject var18, final SubLObject var2, final SubLObject var48) {
        final SubLThread var49 = SubLProcess.currentSubLThread();
        if (NIL != f18246(var14, var48, (SubLObject)$ic72$) && NIL != f18246(var14, var48, (SubLObject)$ic73$)) {
            final SubLObject var50 = (SubLObject)$ic74$;
            final SubLObject var51 = (SubLObject)$ic67$;
            final SubLObject var52 = (SubLObject)ConsesLow.listS($ic75$, var18, (SubLObject)$ic76$);
            final SubLObject var53 = f18264(var52, var2);
            final SubLObject var54 = (SubLObject)ConsesLow.list($ic68$, var2, (SubLObject)ConsesLow.list($ic69$, (SubLObject)$ic77$, var15));
            final SubLObject var55 = f18264(var54, var2);
            final SubLObject var56 = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic78$, (SubLObject)$ic77$, (SubLObject)ConsesLow.listS((SubLObject)$ic71$, var54, ConsesLow.append(var55, (SubLObject)NIL))));
            if (NIL == $g2590$.getDynamicValue(var49) || (NIL != f18265(var53) && NIL != f18265(var55))) {
                return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)$ic63$, var52, (SubLObject)ConsesLow.list((SubLObject)$ic64$, var2), ConsesLow.append(var53, var56, (SubLObject)ConsesLow.list(var48, var50, var51))));
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f18251(final SubLObject var14, final SubLObject var15, final SubLObject var50, final SubLObject var2, final SubLObject var48) {
        final SubLThread var51 = SubLProcess.currentSubLThread();
        if (NIL != f18246(var14, var48, (SubLObject)$ic79$)) {
            final SubLObject var52 = (SubLObject)$ic80$;
            final SubLObject var53 = (SubLObject)$ic81$;
            final SubLObject var54 = (SubLObject)ConsesLow.list($ic82$, var15, var50);
            final SubLObject var55 = f18264(var54, var2);
            if (NIL == $g2590$.getDynamicValue(var51) || NIL != f18265(var55)) {
                return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)$ic63$, var54, (SubLObject)ConsesLow.list((SubLObject)$ic64$, var2), ConsesLow.append(var55, (SubLObject)ConsesLow.list(var48, var52, var53))));
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f18252(final SubLObject var14, final SubLObject var15, final SubLObject var50, final SubLObject var2, final SubLObject var48) {
        final SubLThread var51 = SubLProcess.currentSubLThread();
        if (NIL != f18246(var14, var48, (SubLObject)$ic83$)) {
            final SubLObject var52 = (SubLObject)$ic84$;
            final SubLObject var53 = (SubLObject)$ic81$;
            final SubLObject var54 = (SubLObject)ConsesLow.list($ic68$, var2, (SubLObject)ConsesLow.listS($ic85$, (SubLObject)ConsesLow.list($ic86$, (SubLObject)$ic87$, (SubLObject)ConsesLow.listS($ic88$, var15, (SubLObject)$ic89$)), (SubLObject)$ic90$));
            final SubLObject var55 = f18264(var54, var2);
            final SubLObject var56 = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic78$, (SubLObject)$ic91$, (SubLObject)ConsesLow.listS((SubLObject)$ic71$, var54, ConsesLow.append(var55, (SubLObject)NIL))));
            if (NIL == $g2590$.getDynamicValue(var51) || NIL != f18265(var55)) {
                return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)$ic63$, (SubLObject)ConsesLow.list($ic92$, (SubLObject)$ic91$, var50), (SubLObject)ConsesLow.list((SubLObject)$ic64$, var2), ConsesLow.append(var56, (SubLObject)ConsesLow.list(var48, var52, var53))));
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f18253(final SubLObject var14, final SubLObject var51, final SubLObject var37, final SubLObject var38, final SubLObject var15, final SubLObject var18, final SubLObject var50, final SubLObject var2, final SubLObject var48) {
        final SubLThread var52 = SubLProcess.currentSubLThread();
        if (NIL != f18246(var14, var48, (SubLObject)$ic93$) && var51.eql($ic2$) && NIL != module0256.f16596(var15, var18, var2, (SubLObject)UNPROVIDED) && NIL != module0202.f12598(var50) && NIL != module0269.f17706(var37)) {
            final SubLObject var53 = (SubLObject)$ic94$;
            final SubLObject var54 = (SubLObject)$ic95$;
            final SubLObject var55 = ONE_INTEGER.numE(var38) ? $ic96$ : $ic97$;
            final SubLObject var56 = module0205.f13378(var50);
            final SubLObject var57 = module0205.f13379(var50, (SubLObject)UNPROVIDED);
            final SubLObject var58 = module0205.f13380(var50, (SubLObject)UNPROVIDED);
            final SubLObject var59 = module0202.f12769(var55, var56, var57, var58);
            final SubLObject var60 = (SubLObject)((NIL != $g2590$.getDynamicValue(var52)) ? f18264(var59, var2) : NIL);
            if (NIL == $g2590$.getDynamicValue(var52) || NIL != f18265(var60)) {
                return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic98$, var50, (SubLObject)ConsesLow.list((SubLObject)$ic64$, var2), (SubLObject)ConsesLow.listS((SubLObject)$ic99$, var59, (SubLObject)ConsesLow.list((SubLObject)$ic64$, var2), ConsesLow.append(var60, (SubLObject)NIL)), var48, var53, var54));
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f18254(final SubLObject var14, final SubLObject var51, final SubLObject var15, final SubLObject var18, final SubLObject var50, final SubLObject var2, final SubLObject var48) {
        final SubLThread var52 = SubLProcess.currentSubLThread();
        if (NIL != f18246(var14, var48, (SubLObject)$ic100$)) {
            final SubLObject var53 = (SubLObject)$ic101$;
            final SubLObject var54 = (SubLObject)$ic95$;
            final SubLObject var55 = conses_high.subst((SubLObject)$ic102$, var15, var50, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var56 = (SubLObject)ConsesLow.list($ic68$, var2, (SubLObject)ConsesLow.list($ic103$, (SubLObject)ConsesLow.list(var51, (SubLObject)$ic102$, var18)));
            final SubLObject var57 = (SubLObject)ConsesLow.list($ic104$, (SubLObject)$ic102$, var15);
            final SubLObject var58 = f18264(var56, var2);
            final SubLObject var59 = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)$ic78$, (SubLObject)$ic102$, (SubLObject)ConsesLow.list((SubLObject)$ic71$, var56), (SubLObject)ConsesLow.list((SubLObject)$ic105$, var57), ConsesLow.append(var58, (SubLObject)NIL)));
            if (NIL == $g2590$.getDynamicValue(var52) || NIL != f18265(var58)) {
                return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic98$, var50, (SubLObject)ConsesLow.list((SubLObject)$ic64$, var2), (SubLObject)ConsesLow.listS((SubLObject)$ic99$, var55, (SubLObject)ConsesLow.list((SubLObject)$ic64$, var2), ConsesLow.append(var59, (SubLObject)NIL)), var48, var53, var54));
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f18255(final SubLObject var14, final SubLObject var37, final SubLObject var38, final SubLObject var15, final SubLObject var50, final SubLObject var2, final SubLObject var48) {
        final SubLThread var51 = SubLProcess.currentSubLThread();
        if (NIL != f18246(var14, var48, (SubLObject)$ic106$)) {
            final SubLObject var52 = (SubLObject)$ic107$;
            final SubLObject var53 = (SubLObject)$ic95$;
            final SubLObject var54 = conses_high.subst((SubLObject)$ic108$, var37, var50, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var55 = module0205.f13207(var50, (SubLObject)UNPROVIDED);
            final SubLObject var56 = module0035.f2131(var38, var55);
            final SubLObject var57 = (SubLObject)((NIL != module0035.f1997(var56)) ? module0599.f36688(var15, var56.first(), (SubLObject)UNPROVIDED) : NIL);
            final SubLObject var58 = (SubLObject)((NIL != var57) ? module0260.f17085(var57, var2, (SubLObject)UNPROVIDED) : NIL);
            final SubLObject var59 = (SubLObject)((NIL != var57 && Sequences.length(var58).numG($g2589$.getDynamicValue(var51))) ? Sequences.length(var57) : NIL);
            final SubLObject var60 = f18266(var37, var2);
            SubLObject var61 = (SubLObject)NIL;
            if (NIL != var60) {
                var61 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons((SubLObject)$ic109$, var60), var61);
            }
            if (NIL != var59) {
                var61 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic110$, var59), var61);
            }
            else if (NIL != var58) {
                var61 = (SubLObject)ConsesLow.cons(reader.bq_cons((SubLObject)$ic111$, ConsesLow.append(var58, (SubLObject)NIL)), var61);
            }
            var61 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic71$, (SubLObject)ConsesLow.list($ic68$, var2, (SubLObject)ConsesLow.list($ic112$, (SubLObject)$ic108$, var15, var38))), var61);
            var61 = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)$ic78$, (SubLObject)$ic108$, ConsesLow.append(var61, (SubLObject)NIL)));
            return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic98$, var50, (SubLObject)ConsesLow.list((SubLObject)$ic64$, var2), (SubLObject)ConsesLow.listS((SubLObject)$ic99$, var54, (SubLObject)ConsesLow.list((SubLObject)$ic64$, var2), ConsesLow.append(var61, (SubLObject)NIL)), var48, var52, var53));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f18256(final SubLObject var14, final SubLObject var37, final SubLObject var38, final SubLObject var15, final SubLObject var50, final SubLObject var2, final SubLObject var48) {
        final SubLThread var51 = SubLProcess.currentSubLThread();
        if (NIL != f18246(var14, var48, (SubLObject)$ic113$) && NIL != module0269.f17706(var37)) {
            final SubLObject var52 = (SubLObject)$ic114$;
            final SubLObject var53 = (SubLObject)$ic95$;
            final SubLObject var54 = module0202.f12683((SubLObject)$ic115$, module0205.f13207(var50, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
            final SubLObject var55 = (SubLObject)((NIL != module0173.f10955(var15)) ? module0303.f20155(var15, var38, var37, var2) : NIL);
            final SubLObject var56 = (SubLObject)(Sequences.length(var55).numG($g2589$.getDynamicValue(var51)) ? Sequences.length(var55) : NIL);
            SubLObject var57 = (SubLObject)NIL;
            if (NIL != var55) {
                var57 = (SubLObject)ConsesLow.cons(reader.bq_cons((SubLObject)$ic111$, ConsesLow.append(var55, (SubLObject)NIL)), var57);
            }
            else if (NIL != var56) {
                var57 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic110$, var56), var57);
            }
            var57 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic71$, (SubLObject)ConsesLow.list($ic68$, var2, (SubLObject)ConsesLow.list($ic116$, (SubLObject)ConsesLow.listS($ic117$, var37, (SubLObject)$ic118$), (SubLObject)ConsesLow.list($ic112$, (SubLObject)$ic115$, var15, var38)))), var57);
            var57 = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)$ic78$, (SubLObject)$ic115$, ConsesLow.append(var57, (SubLObject)NIL)));
            return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic98$, var50, (SubLObject)ConsesLow.list((SubLObject)$ic64$, var2), (SubLObject)ConsesLow.listS((SubLObject)$ic99$, var54, (SubLObject)ConsesLow.list((SubLObject)$ic64$, var2), (SubLObject)$ic119$, ConsesLow.append(var57, (SubLObject)NIL)), var48, var52, var53));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f18257(final SubLObject var14, final SubLObject var51, final SubLObject var15, final SubLObject var18, final SubLObject var50, final SubLObject var2, final SubLObject var48) {
        final SubLThread var52 = SubLProcess.currentSubLThread();
        if (NIL != f18246(var14, var48, (SubLObject)$ic120$)) {
            final SubLObject var53 = (SubLObject)$ic121$;
            final SubLObject var54 = (SubLObject)$ic95$;
            SubLObject var55 = (SubLObject)NIL;
            SubLObject var56 = (SubLObject)NIL;
            SubLObject var57 = (SubLObject)NIL;
            if (var51.eql($ic2$)) {
                var56 = module0259.f16932(var15, var18, (SubLObject)UNPROVIDED);
            }
            else if (var51.eql($ic6$)) {
                var56 = module0256.f16650(var15, var18, (SubLObject)UNPROVIDED);
            }
            if (NIL != var56) {
                if (Sequences.length(var56).numG($g2589$.getDynamicValue(var52))) {
                    var57 = Sequences.length(var56);
                }
                if (NIL != var57) {
                    var55 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic110$, var57), var55);
                }
                else if (NIL != var56) {
                    var55 = (SubLObject)ConsesLow.cons(reader.bq_cons((SubLObject)$ic122$, ConsesLow.append(var56, (SubLObject)NIL)), var55);
                }
                var55 = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)$ic78$, (SubLObject)$ic115$, ConsesLow.append(var55, (SubLObject)NIL)));
                return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)$ic123$, var50, (SubLObject)ConsesLow.list((SubLObject)$ic124$, var2), (SubLObject)$ic125$, ConsesLow.append(var55, (SubLObject)ConsesLow.list(var48, var53, var54))));
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f18258(final SubLObject var14, final SubLObject var50, final SubLObject var2, final SubLObject var48) {
        if (NIL != f18246(var14, var48, (SubLObject)$ic126$)) {
            final SubLObject var51 = (SubLObject)$ic127$;
            final SubLObject var52 = (SubLObject)$ic95$;
            return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic126$, var50, (SubLObject)ConsesLow.list((SubLObject)$ic64$, var2), var48, var51, var52));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f18261(final SubLObject var14, final SubLObject var51, final SubLObject var15, final SubLObject var18, final SubLObject var2, final SubLObject var50, final SubLObject var43, final SubLObject var48) {
        final SubLThread var52 = SubLProcess.currentSubLThread();
        if (NIL != f18246(var14, var48, (SubLObject)$ic128$)) {
            final SubLObject var53 = (SubLObject)$ic129$;
            final SubLObject var54 = (SubLObject)$ic81$;
            final SubLObject var55 = conses_high.subst((SubLObject)$ic130$, var18, var50, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var56 = (SubLObject)ConsesLow.list($ic68$, var2, (SubLObject)ConsesLow.list($ic103$, (SubLObject)ConsesLow.list($ic116$, (SubLObject)ConsesLow.listS($ic6$, var18, (SubLObject)$ic131$), (SubLObject)ConsesLow.listS(var51, var15, (SubLObject)$ic131$))));
            final SubLObject var57 = f18264(var56, var2);
            SubLObject var58 = (SubLObject)NIL;
            if (NIL == $g2590$.getDynamicValue(var52) || NIL != f18265(var57)) {
                if (var51.eql($ic2$)) {
                    var58 = f18267(var15, var18, var2);
                }
                else if (var51.eql($ic6$)) {
                    var58 = module0256.f16637((SubLObject)ConsesLow.list(var15, var18), (SubLObject)NIL, var2, (SubLObject)UNPROVIDED);
                }
                if (NIL != var58) {
                    final SubLObject var59 = (SubLObject)(Sequences.length(var58).numG($g2589$.getDynamicValue(var52)) ? Sequences.length(var58) : NIL);
                    SubLObject var60 = (SubLObject)NIL;
                    if (NIL != var59) {
                        var60 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic110$, var59), var60);
                    }
                    else if (NIL != var58) {
                        var60 = (SubLObject)ConsesLow.cons(reader.bq_cons((SubLObject)$ic111$, ConsesLow.append(var58, (SubLObject)NIL)), var60);
                    }
                    var60 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS((SubLObject)$ic71$, var56, ConsesLow.append(var57, (SubLObject)NIL)), var60);
                    var60 = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)$ic78$, (SubLObject)$ic130$, ConsesLow.append(var60, (SubLObject)NIL)));
                    return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic132$, var50, (SubLObject)ConsesLow.list((SubLObject)$ic64$, var43), (SubLObject)ConsesLow.listS((SubLObject)$ic99$, var55, (SubLObject)ConsesLow.list((SubLObject)$ic64$, var43), (SubLObject)$ic119$, ConsesLow.append(var60, (SubLObject)NIL)), var48, var53, var54));
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f18262(final SubLObject var14, final SubLObject var51, final SubLObject var15, final SubLObject var18, final SubLObject var2, final SubLObject var50, final SubLObject var43, final SubLObject var48) {
        final SubLThread var52 = SubLProcess.currentSubLThread();
        if (NIL != f18246(var14, var48, (SubLObject)$ic133$)) {
            final SubLObject var53 = (SubLObject)$ic134$;
            final SubLObject var54 = (SubLObject)$ic81$;
            final SubLObject var55 = conses_high.subst((SubLObject)$ic130$, var18, var50, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var56 = (SubLObject)ConsesLow.list($ic68$, var2, (SubLObject)ConsesLow.list($ic103$, (SubLObject)ConsesLow.listS(var51, var15, (SubLObject)$ic131$)));
            final SubLObject var57 = f18264(var56, var2);
            if (NIL == $g2590$.getDynamicValue(var52) || NIL != f18265(var57)) {
                final SubLObject var58 = (SubLObject)((NIL != module0173.f10955(var15)) ? module0259.f16822(var15, var2, (SubLObject)UNPROVIDED) : NIL);
                final SubLObject var59 = (SubLObject)(Sequences.length(var58).numG($g2589$.getDynamicValue(var52)) ? Sequences.length(var58) : NIL);
                SubLObject var60 = (SubLObject)NIL;
                if (NIL != var59) {
                    var60 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic110$, var59), var60);
                }
                else if (NIL != var58) {
                    var60 = (SubLObject)ConsesLow.cons(reader.bq_cons((SubLObject)$ic111$, ConsesLow.append(var58, (SubLObject)NIL)), var60);
                }
                var60 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS((SubLObject)$ic71$, var56, ConsesLow.append(var57, (SubLObject)NIL)), var60);
                var60 = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)$ic78$, (SubLObject)$ic130$, ConsesLow.append(var60, (SubLObject)NIL)));
                return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic132$, var50, (SubLObject)ConsesLow.list((SubLObject)$ic64$, var43), (SubLObject)ConsesLow.listS((SubLObject)$ic99$, var55, (SubLObject)ConsesLow.list((SubLObject)$ic64$, var43), ConsesLow.append(var60, (SubLObject)NIL)), var48, var53, var54));
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f18263(final SubLObject var14, final SubLObject var50, final SubLObject var2, final SubLObject var48) {
        if (NIL != f18246(var14, var48, (SubLObject)$ic135$)) {
            final SubLObject var51 = (SubLObject)$ic121$;
            final SubLObject var52 = (SubLObject)$ic81$;
            return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic136$, var50, (SubLObject)ConsesLow.list((SubLObject)$ic64$, var2), var48, var51, var52));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f18259(final SubLObject var14, final SubLObject var2, final SubLObject var50, final SubLObject var43, final SubLObject var48) {
        if (NIL != f18246(var14, var48, (SubLObject)$ic120$)) {
            final SubLObject var51 = (SubLObject)$ic121$;
            final SubLObject var52 = (SubLObject)$ic81$;
            final SubLObject var53 = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic78$, (SubLObject)$ic137$, (SubLObject)ConsesLow.list((SubLObject)$ic71$, (SubLObject)ConsesLow.list($ic138$, (SubLObject)ConsesLow.listS($ic139$, var2, (SubLObject)$ic140$)))));
            return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)$ic141$, var50, (SubLObject)ConsesLow.list((SubLObject)$ic124$, var43), (SubLObject)$ic125$, ConsesLow.append(var53, (SubLObject)ConsesLow.list(var48, var51, var52))));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f18260(final SubLObject var14, final SubLObject var37, final SubLObject var2, final SubLObject var39, final SubLObject var48) {
        if (NIL != var39 && NIL != f18246(var14, var48, (SubLObject)$ic142$) && NIL != module0269.f17706(var37)) {
            final SubLObject var49 = (SubLObject)$ic143$;
            final SubLObject var50 = (SubLObject)$ic81$;
            final SubLObject var51 = (SubLObject)ConsesLow.list($ic117$, var37, var39);
            final SubLObject var52 = module0191.f11990((SubLObject)$ic144$, var51, var2, (SubLObject)UNPROVIDED);
            return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic142$, var52, var48, var49, var50));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f18250(final SubLObject var14, final SubLObject var36, final SubLObject var49, final SubLObject var2, final SubLObject var48) {
        if (NIL != f18246(var14, var48, (SubLObject)$ic142$)) {
            final SubLObject var50 = (SubLObject)$ic145$;
            final SubLObject var51 = (SubLObject)$ic81$;
            final SubLObject var52 = module0191.f11990(var36, var49, var2, (SubLObject)UNPROVIDED);
            return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic142$, var52, var48, var50, var51));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f18246(SubLObject var36, SubLObject var48, SubLObject var80) {
        if (var36 == UNPROVIDED) {
            var36 = (SubLObject)NIL;
        }
        if (var48 == UNPROVIDED) {
            var48 = (SubLObject)NIL;
        }
        if (var80 == UNPROVIDED) {
            var80 = (SubLObject)NIL;
        }
        return (SubLObject)makeBoolean((NIL == var36 || NIL != f18268(var36)) && (NIL == var48 || NIL != f18269(var48)) && (NIL == var80 || NIL != f18270(var80)));
    }
    
    public static SubLObject f18268(final SubLObject var36) {
        final SubLThread var37 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean($ic146$.eql($g2591$.getDynamicValue(var37)) || NIL != module0004.f104(var36, $g2591$.getDynamicValue(var37), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f18269(final SubLObject var48) {
        final SubLThread var49 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean($ic146$.eql($g2592$.getDynamicValue(var49)) || NIL != module0004.f104(var48, $g2592$.getDynamicValue(var49), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f18270(final SubLObject var80) {
        final SubLThread var81 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean($ic146$.eql($g2593$.getDynamicValue(var81)) || NIL != module0004.f104(var80, $g2593$.getDynamicValue(var81), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f18265(final SubLObject var81) {
        return (SubLObject)makeBoolean(NIL == module0035.f2428((SubLObject)$ic147$, var81, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f18264(final SubLObject var50, final SubLObject var2) {
        final SubLThread var51 = SubLProcess.currentSubLThread();
        SubLObject var52 = conses_high.copy_list(f18271(var50, var2));
        final SubLObject var53 = module0152.$g2131$.currentBinding(var51);
        try {
            module0152.$g2131$.bind((SubLObject)NIL, var51);
            if (NIL != module0274.f18060(var50, var2, (SubLObject)UNPROVIDED)) {
                var52 = (SubLObject)ConsesLow.cons((SubLObject)$ic148$, var52);
            }
            else {
                var52 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic149$, module0274.f18188(var50, var2, (SubLObject)UNPROVIDED)), var52);
            }
        }
        finally {
            module0152.$g2131$.rebind(var53, var51);
        }
        if (NIL != module0035.f2428((SubLObject)$ic149$, var52, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) || NIL != module0035.f2428((SubLObject)$ic150$, var52, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            var52 = (SubLObject)ConsesLow.cons((SubLObject)$ic151$, var52);
        }
        return Sequences.nreverse(var52);
    }
    
    public static SubLObject f18271(final SubLObject var50, final SubLObject var2) {
        final SubLObject var52;
        final SubLObject var51 = var52 = module0205.f13132(var50);
        if (var52.eql($ic68$)) {
            return f18271(module0205.f13204(var50, (SubLObject)UNPROVIDED), module0205.f13203(var50, (SubLObject)UNPROVIDED));
        }
        if (var52.eql($ic103$) || var52.eql($ic138$)) {
            return f18271(module0205.f13203(var50, (SubLObject)UNPROVIDED), var2);
        }
        if (var52.eql($ic116$)) {
            SubLObject var53 = (SubLObject)NIL;
            SubLObject var54 = module0205.f13207(var50, (SubLObject)UNPROVIDED);
            SubLObject var55 = (SubLObject)NIL;
            var55 = var54.first();
            while (NIL != var54) {
                final SubLObject var56 = f18271(var55, var2);
                if (NIL == conses_high.member(var56, var53, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                    var53 = (SubLObject)ConsesLow.cons(var56, var53);
                }
                var54 = var54.rest();
                var55 = var54.first();
            }
            return var53;
        }
        if (NIL == module0202.f12691(var50, (SubLObject)$ic152$)) {
            return (SubLObject)$ic154$;
        }
        final SubLObject var11_84 = var51;
        if (var11_84.eql($ic2$)) {
            final SubLObject var57 = module0205.f13203(var50, (SubLObject)UNPROVIDED);
            final SubLObject var58 = module0205.f13204(var50, (SubLObject)UNPROVIDED);
            if (NIL != module0259.f16867(var57, var58, var2, (SubLObject)UNPROVIDED)) {
                return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic150$, module0259.f16917(var57, var58, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)));
            }
            return (SubLObject)$ic153$;
        }
        else if (var11_84.eql($ic6$)) {
            final SubLObject var57 = module0205.f13203(var50, (SubLObject)UNPROVIDED);
            final SubLObject var58 = module0205.f13204(var50, (SubLObject)UNPROVIDED);
            if (NIL != module0256.f16613(var57, var58, var2, (SubLObject)UNPROVIDED)) {
                return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic150$, module0256.f16630(var57, var58, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)));
            }
            return (SubLObject)$ic153$;
        }
        else {
            if (NIL != module0538.f33428(module0205.f13338(var50), var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic150$, module0538.f33409(module0205.f13338(var50), var2, (SubLObject)UNPROVIDED)));
            }
            return (SubLObject)$ic153$;
        }
    }
    
    public static SubLObject f18266(final SubLObject var86, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLObject var87 = f18272(var86, var2);
        return var87;
    }
    
    public static SubLObject f18272(final SubLObject var37, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var38 = SubLProcess.currentSubLThread();
        SubLObject var39 = (SubLObject)NIL;
        final SubLObject var40 = var2;
        final SubLObject var41 = module0147.$g2094$.currentBinding(var38);
        final SubLObject var42 = module0147.$g2095$.currentBinding(var38);
        final SubLObject var43 = module0018.$g584$.currentBinding(var38);
        final SubLObject var44 = $g2594$.currentBinding(var38);
        try {
            module0147.$g2094$.bind(module0147.f9531(var40), var38);
            module0147.$g2095$.bind(module0147.f9534(var40), var38);
            module0018.$g584$.bind((SubLObject)NIL, var38);
            $g2594$.bind(var37, var38);
            module0219.f14502((SubLObject)$ic155$, var37, (SubLObject)$ic156$, (SubLObject)T);
            var39 = module0018.$g584$.getDynamicValue(var38);
        }
        finally {
            $g2594$.rebind(var44, var38);
            module0018.$g584$.rebind(var43, var38);
            module0147.$g2095$.rebind(var42, var38);
            module0147.$g2094$.rebind(var41, var38);
        }
        return var39;
    }
    
    public static SubLObject f18273(final SubLObject var92) {
        final SubLThread var93 = SubLProcess.currentSubLThread();
        final SubLObject var94 = module0178.f11333(var92);
        if (var94.eql($ic157$) && NIL != module0035.f2439(Symbols.symbol_function((SubLObject)$ic158$), module0178.f11335(var92), (SubLObject)UNPROVIDED)) {
            module0018.$g584$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(module0178.f11334(var92), (SubLObject)ConsesLow.list((SubLObject)$ic159$, var92)), module0018.$g584$.getDynamicValue(var93)), var93);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f18274(final SubLObject var50) {
        final SubLThread var51 = SubLProcess.currentSubLThread();
        if (NIL != module0202.f12590(var50)) {
            return Equality.eql(module0205.f13132(var50), $g2594$.getDynamicValue(var51));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f18267(final SubLObject var85, final SubLObject var93, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        SubLObject var94 = (SubLObject)NIL;
        SubLObject var95 = module0259.f16822(var85, var2, (SubLObject)UNPROVIDED);
        SubLObject var96 = (SubLObject)NIL;
        var96 = var95.first();
        while (NIL != var95) {
            var94 = conses_high.nunion(var94, module0256.f16637((SubLObject)ConsesLow.list(var96, var93), (SubLObject)NIL, var2, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var95 = var95.rest();
            var96 = var95.first();
        }
        return module0256.f16529(var94, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f18275() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0275", "f18234", "S#20827", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0275", "f18235", "S#20828", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0275", "f18236", "S#20501", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0275", "f18242", "S#20503", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0275", "f18244", "S#20502", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0275", "f18237", "S#20829", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0275", "f18243", "S#20830", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0275", "f18245", "S#20831", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0275", "f18238", "S#20832", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0275", "f18239", "S#20833", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0275", "f18240", "S#20834", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0275", "f18241", "S#20835", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0275", "f18247", "S#20836", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0275", "f18248", "S#20837", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0275", "f18249", "S#20838", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0275", "f18251", "S#20839", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0275", "f18252", "S#20840", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0275", "f18253", "S#20841", 9, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0275", "f18254", "S#20842", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0275", "f18255", "S#20843", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0275", "f18256", "S#20844", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0275", "f18257", "S#20845", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0275", "f18258", "S#20846", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0275", "f18261", "S#20847", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0275", "f18262", "S#20848", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0275", "f18263", "S#20849", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0275", "f18259", "S#20850", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0275", "f18260", "S#20851", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0275", "f18250", "S#20852", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0275", "f18246", "S#20853", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0275", "f18268", "S#20854", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0275", "f18269", "S#20855", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0275", "f18270", "S#20856", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0275", "f18265", "S#20857", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0275", "f18264", "S#20858", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0275", "f18271", "S#20859", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0275", "f18266", "S#20860", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0275", "f18272", "S#20861", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0275", "f18273", "S#20862", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0275", "f18274", "S#20863", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0275", "f18267", "S#20864", 2, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f18276() {
        $g2589$ = SubLFiles.defparameter("S#20865", (SubLObject)TEN_INTEGER);
        $g2590$ = SubLFiles.defparameter("S#20866", (SubLObject)T);
        $g2591$ = SubLFiles.defparameter("S#20867", (SubLObject)$ic146$);
        $g2592$ = SubLFiles.defparameter("S#20868", (SubLObject)$ic146$);
        $g2593$ = SubLFiles.defparameter("S#20869", (SubLObject)$ic146$);
        $g2594$ = SubLFiles.defparameter("S#20870", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f18277() {
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f18275();
    }
    
    public void initializeVariables() {
        f18276();
    }
    
    public void runTopLevelForms() {
        f18277();
    }
    
    static {
        me = (SubLFile)new module0275();
        $g2589$ = null;
        $g2590$ = null;
        $g2591$ = null;
        $g2592$ = null;
        $g2593$ = null;
        $g2594$ = null;
        $ic0$ = makeKeyword("MAL-ARG-WRT-ARG-ISA");
        $ic1$ = ConsesLow.listS((SubLObject)makeSymbol("S#20462", "CYC"), new SubLObject[] { makeSymbol("S#202", "CYC"), makeSymbol("S#12457", "CYC"), makeSymbol("S#20618", "CYC"), makeSymbol("S#12455", "CYC"), makeSymbol("S#11445", "CYC"), makeSymbol("S#1625", "CYC") });
        $ic2$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic3$ = makeKeyword("MAL-ARG-WRT-ARG-QUOTED-ISA");
        $ic4$ = constant_handles_oc.f8479((SubLObject)makeString("quotedIsa"));
        $ic5$ = makeKeyword("MAL-ARG-WRT-ARG-GENLS");
        $ic6$ = constant_handles_oc.f8479((SubLObject)makeString("genls"));
        $ic7$ = makeKeyword("MAL-ARG-WRT-ARG-NOT-ISA-DISJOINT");
        $ic8$ = makeKeyword("MAL-ARG-WRT-ARG-NOT-QUOTED-ISA-DISJOINT");
        $ic9$ = makeKeyword("MAL-ARG-WRT-ARG-NOT-GENLS-DISJOINT");
        $ic10$ = makeKeyword("MAL-ARG-WRT-INTER-ARG-ISA");
        $ic11$ = makeKeyword("MAL-ARG-WRT-INTER-ARG-NOT-ISA");
        $ic12$ = makeKeyword("MAL-ARG-WRT-INTER-ARG-GENL");
        $ic13$ = makeKeyword("MAL-ARG-WRT-INTER-ARG-NOT-ISA-DISJOINT");
        $ic14$ = makeKeyword("MAL-ARG-WRT-INTER-ARG-NOT-GENL-DISJOINT");
        $ic15$ = makeKeyword("MAL-ARG-WRT-ARG-FORMAT");
        $ic16$ = makeKeyword("MAL-ARG-WRT-INTER-ARG-FORMAT");
        $ic17$ = makeKeyword("MAL-ARG-WRT-INTER-ARG-DIFFERENT");
        $ic18$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#20462", "CYC"), makeSymbol("S#12457", "CYC"), makeSymbol("S#750", "CYC"), makeSymbol("S#20626", "CYC"), makeSymbol("S#751", "CYC"), makeSymbol("S#20627", "CYC"), makeSymbol("S#11445", "CYC"), makeSymbol("&OPTIONAL"), makeSymbol("S#20622", "CYC") });
        $ic19$ = constant_handles_oc.f8479((SubLObject)makeString("different"));
        $ic20$ = makeKeyword("MAL-RELN-WRT-ARG-ISA-REQUIRED");
        $ic21$ = makeKeyword("CONFLICT-ASSERTING-TRUE-SBHL");
        $ic22$ = makeKeyword("CONFLICT-ASSERTING-FALSE-SBHL");
        $ic23$ = makeKeyword("DISJOINT-ARG-ISA");
        $ic24$ = makeKeyword("DISJOINT-ARG-QUOTED-ISA");
        $ic25$ = makeKeyword("DISJOINT-ARG-GENL");
        $ic26$ = makeKeyword("RESTRICTED-SKOLEM-ASSERTION");
        $ic27$ = makeKeyword("RESTRICTED-PREDICATE-ASSERTION");
        $ic28$ = makeKeyword("RESTRICTED-COLLECTION-ASSERTION");
        $ic29$ = makeKeyword("RESTRICTED-MT-ASSERTION");
        $ic30$ = makeKeyword("EVALUATABLE-LITERAL-FALSE");
        $ic31$ = makeKeyword("MAL-PRECANONICALIZATIONS");
        $ic32$ = makeKeyword("INVALID-EXPANSION");
        $ic33$ = makeKeyword("RECURSION-LIMIT-EXCEEDED");
        $ic34$ = makeKeyword("EL-UNEVALUATABLE-EXPRESSION");
        $ic35$ = makeKeyword("QUANTIFIED-SEQUENCE-VARIABLE");
        $ic36$ = makeKeyword("TOO-MANY-SEQUENCE-VARS-IN-SKOLEM-SCOPE");
        $ic37$ = makeKeyword("AMBIGUOUS-VAR-TYPE-IN-SKOLEM-SCOPE");
        $ic38$ = makeKeyword("INHIBITED-SEQUENCE-VARIABLE");
        $ic39$ = makeKeyword("TOO-MANY-COMMUTATIVE-IN-ARGS-AND-REST");
        $ic40$ = makeSymbol("GENL?");
        $ic41$ = makeSymbol("S#15505", "CYC");
        $ic42$ = makeKeyword("EL");
        $ic43$ = ConsesLow.listS((SubLObject)makeSymbol("S#205", "CYC"), new SubLObject[] { makeSymbol("S#202", "CYC"), makeSymbol("S#17572", "CYC"), makeSymbol("S#15200", "CYC"), makeSymbol("S#12455", "CYC"), makeSymbol("S#11445", "CYC"), makeSymbol("S#1625", "CYC") });
        $ic44$ = makeKeyword("VIA-GENL-PRED");
        $ic45$ = makeKeyword("WFF-FORMULA");
        $ic46$ = makeKeyword("NL");
        $ic47$ = makeString("dont know how to describe fixes for ~a in NL.");
        $ic48$ = makeKeyword("AT-CONSTRAINT-GAF");
        $ic49$ = makeKeyword("MAKE-IT-SO");
        $ic50$ = ConsesLow.list((SubLObject)makeKeyword("SAKE-STRATEGY"), (SubLObject)makeKeyword("SATISFY-CONSTRAINT"));
        $ic51$ = makeKeyword("ISA");
        $ic52$ = makeKeyword("MAKE-EXCEPTION");
        $ic53$ = ConsesLow.list((SubLObject)makeKeyword("SAKE-STRATEGY"), (SubLObject)makeKeyword("MAKE-EXCPETION"));
        $ic54$ = makeKeyword("CORRECT-FORMULA");
        $ic55$ = ConsesLow.list((SubLObject)makeKeyword("SAKE-STRATEGY"), (SubLObject)makeKeyword("CORRECT-FORMULA"));
        $ic56$ = makeKeyword("DENY-APPLICABLILITY");
        $ic57$ = ConsesLow.list((SubLObject)makeKeyword("SAKE-STRATEGY"), (SubLObject)makeKeyword("DENY-APPLICABLILITY"));
        $ic58$ = makeKeyword("CORRECT-CONSTRAINT");
        $ic59$ = ConsesLow.list((SubLObject)makeKeyword("SAKE-STRATEGY"), (SubLObject)makeKeyword("CORRECT-CONSTRAINT"));
        $ic60$ = makeKeyword("ASSERT-GAF");
        $ic61$ = ConsesLow.list((SubLObject)makeKeyword("SAKE-TACTICS"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("ASSERT-GAF"), (SubLObject)makeSymbol("S#717", "CYC")));
        $ic62$ = ConsesLow.list((SubLObject)makeKeyword("USER-SKILLS"), (SubLObject)makeKeyword("KE-1"));
        $ic63$ = makeKeyword("ASSERT");
        $ic64$ = makeKeyword("MT");
        $ic65$ = makeKeyword("EDIT-DEFN");
        $ic66$ = ConsesLow.list((SubLObject)makeKeyword("SAKE-TACTICS"), (SubLObject)makeKeyword("EDIT-DEFN"));
        $ic67$ = ConsesLow.list((SubLObject)makeKeyword("USER-SKILLS"), (SubLObject)makeKeyword("SE-3"));
        $ic68$ = constant_handles_oc.f8479((SubLObject)makeString("ist"));
        $ic69$ = constant_handles_oc.f8479((SubLObject)makeString("defnAdmits"));
        $ic70$ = makeKeyword("EDIT-SUBL");
        $ic71$ = makeKeyword("CONSTRAINTS");
        $ic72$ = makeKeyword("SOLICIT-DEFN");
        $ic73$ = makeKeyword("ASSERT-DEFN");
        $ic74$ = ConsesLow.list((SubLObject)makeKeyword("SAKE-TACTICS"), (SubLObject)makeKeyword("SOLICIT-SUFFICIENT-DEFN"));
        $ic75$ = constant_handles_oc.f8479((SubLObject)makeString("defnSufficient"));
        $ic76$ = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("SubLQuoteFn")), (SubLObject)makeSymbol("?DEFN")));
        $ic77$ = makeSymbol("?DEFN");
        $ic78$ = makeKeyword("SOLICIT-VARIABLE-BINDING");
        $ic79$ = makeKeyword("ASSERT-EXCEPT-FOR");
        $ic80$ = ConsesLow.list((SubLObject)makeKeyword("SAKE-TACTICS"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("ASSERT-GAF"), constant_handles_oc.f8479((SubLObject)makeString("exceptFor"))));
        $ic81$ = ConsesLow.list((SubLObject)makeKeyword("USER-SKILLS"), (SubLObject)makeKeyword("KE-3"));
        $ic82$ = constant_handles_oc.f8479((SubLObject)makeString("exceptFor"));
        $ic83$ = makeKeyword("ASSERT-EXCEPT-WHEN");
        $ic84$ = ConsesLow.list((SubLObject)makeKeyword("SAKE-TACTICS"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("ASSERT-GAF"), constant_handles_oc.f8479((SubLObject)makeString("exceptWhen"))));
        $ic85$ = constant_handles_oc.f8479((SubLObject)makeString("implies"));
        $ic86$ = constant_handles_oc.f8479((SubLObject)makeString("evaluate"));
        $ic87$ = makeSymbol("?FORMULA-WRT-ARG");
        $ic88$ = constant_handles_oc.f8479((SubLObject)makeString("SubstituteFormulaFn"));
        $ic89$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("?ARG")), (SubLObject)makeSymbol("?FORMULA"));
        $ic90$ = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("knownSentence")), (SubLObject)makeSymbol("?FORMULA-WRT-ARG")));
        $ic91$ = makeSymbol("?FORMULA");
        $ic92$ = constant_handles_oc.f8479((SubLObject)makeString("exceptWhen"));
        $ic93$ = makeKeyword("CHANGE-LEVEL");
        $ic94$ = ConsesLow.list((SubLObject)makeKeyword("SAKE-TACTICS"), (SubLObject)makeKeyword("CHANGE-REFERENCE-LEVEL"), (SubLObject)makeKeyword("TERM-TO-ALL"));
        $ic95$ = ConsesLow.list((SubLObject)makeKeyword("USER-SKILLS"), (SubLObject)makeKeyword("KE-2"));
        $ic96$ = constant_handles_oc.f8479((SubLObject)makeString("relationAllInstance"));
        $ic97$ = constant_handles_oc.f8479((SubLObject)makeString("relationInstanceAll"));
        $ic98$ = makeKeyword("EDIT-FORMULA");
        $ic99$ = makeKeyword("NEW-FORMULA");
        $ic100$ = makeKeyword("CHANGE-TERM");
        $ic101$ = ConsesLow.list((SubLObject)makeKeyword("SAKE-TACTICS"), (SubLObject)makeKeyword("CHANGE-TERM"));
        $ic102$ = makeSymbol("?NEW-TERM");
        $ic103$ = constant_handles_oc.f8479((SubLObject)makeString("knownSentence"));
        $ic104$ = constant_handles_oc.f8479((SubLObject)makeString("conceptuallyRelated"));
        $ic105$ = makeKeyword("PREFERENCES");
        $ic106$ = makeKeyword("CHANGE-RELATION");
        $ic107$ = ConsesLow.list((SubLObject)makeKeyword("SAKE-TACTICS"), (SubLObject)makeKeyword("CHANGE-RELATION"));
        $ic108$ = makeSymbol("?NEW-RELATION");
        $ic109$ = makeKeyword("PROMISSING-BINDINGS");
        $ic110$ = makeKeyword("CANDIDATE-COUNT");
        $ic111$ = makeKeyword("MIN-CANDIDATES");
        $ic112$ = constant_handles_oc.f8479((SubLObject)makeString("admittedArgument"));
        $ic113$ = makeKeyword("WEAKEN-RELATION");
        $ic114$ = ConsesLow.list((SubLObject)makeKeyword("SAKE-TACTICS"), (SubLObject)makeKeyword("WEAKEN-PREDICATE"));
        $ic115$ = makeSymbol("?NEW-PREDICATE");
        $ic116$ = constant_handles_oc.f8479((SubLObject)makeString("and"));
        $ic117$ = constant_handles_oc.f8479((SubLObject)makeString("genlPreds"));
        $ic118$ = ConsesLow.list((SubLObject)makeSymbol("?NEW-PREDICATE"));
        $ic119$ = ConsesLow.list((SubLObject)makeKeyword("EDIT-TYPE"), (SubLObject)makeKeyword("WEAKEN"));
        $ic120$ = makeKeyword("CHANGE-MT");
        $ic121$ = ConsesLow.list((SubLObject)makeKeyword("SAKE-TACTICS"), (SubLObject)makeKeyword("CHANGE-MT"));
        $ic122$ = makeKeyword("MAX-CANDIDATES");
        $ic123$ = makeKeyword("CHANGE-FORMULA-MT");
        $ic124$ = makeKeyword("FROM-MT");
        $ic125$ = ConsesLow.list((SubLObject)makeKeyword("TO-MT"), (SubLObject)makeSymbol("?NEW-MT"));
        $ic126$ = makeKeyword("RETRACT-FORMULA");
        $ic127$ = ConsesLow.list((SubLObject)makeKeyword("SAKE-TACTICS"), (SubLObject)makeKeyword("RETRACT-FORMULA"));
        $ic128$ = makeKeyword("WEAKEN-CONSTRAINT");
        $ic129$ = ConsesLow.list((SubLObject)makeKeyword("SAKE-TACTICS"), (SubLObject)makeKeyword("WEAKEN-CONSTRAINT"));
        $ic130$ = makeSymbol("?NEW-COL");
        $ic131$ = ConsesLow.list((SubLObject)makeSymbol("?NEW-COL"));
        $ic132$ = makeKeyword("EDIT-ASSERTION");
        $ic133$ = makeKeyword("CHANGE-CONSTRAINT");
        $ic134$ = ConsesLow.list((SubLObject)makeKeyword("SAKE-TACTICS"), (SubLObject)makeKeyword("CHANGE-CONSTRAINT"));
        $ic135$ = makeKeyword("UNASSERT-CONSTRAINT");
        $ic136$ = makeKeyword("UNASSERT");
        $ic137$ = makeSymbol("?NEW-MT");
        $ic138$ = constant_handles_oc.f8479((SubLObject)makeString("unknownSentence"));
        $ic139$ = constant_handles_oc.f8479((SubLObject)makeString("genlMt"));
        $ic140$ = ConsesLow.list((SubLObject)makeSymbol("?NEW-MT"));
        $ic141$ = makeKeyword("CHANGE-ASSERTION-MT");
        $ic142$ = makeKeyword("DENY-HL-SUPPORT");
        $ic143$ = ConsesLow.list((SubLObject)makeKeyword("SAKE-TACTICS"), (SubLObject)makeKeyword("DENY-SUPPRT"));
        $ic144$ = makeKeyword("GENLPREDS");
        $ic145$ = ConsesLow.list((SubLObject)makeKeyword("SAKE-TACTICS"), (SubLObject)makeKeyword("DENY-SUPPORT"));
        $ic146$ = makeKeyword("ALL");
        $ic147$ = makeKeyword("UNVIABLE");
        $ic148$ = ConsesLow.list((SubLObject)makeKeyword("WFF"), (SubLObject)T);
        $ic149$ = makeKeyword("WHY-NOT-WFF");
        $ic150$ = makeKeyword("WHY-NOT-CONSISTENT");
        $ic151$ = ConsesLow.list((SubLObject)makeKeyword("SAKE-STATUS"), (SubLObject)makeKeyword("UNVIABLE"));
        $ic152$ = makeSymbol("S#12629", "CYC");
        $ic153$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("CONSISTENT"), (SubLObject)T));
        $ic154$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("CONSISTENT"), (SubLObject)makeKeyword("ASSUMED")));
        $ic155$ = makeSymbol("S#20862", "CYC");
        $ic156$ = makeKeyword("TRUE");
        $ic157$ = constant_handles_oc.f8479((SubLObject)makeString("expansion"));
        $ic158$ = makeSymbol("S#20863", "CYC");
        $ic159$ = makeKeyword("SOURCE");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 403 ms
	
	Decompiled with Procyon 0.5.32.
*/