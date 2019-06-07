package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Processes;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0075 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0075";
    public static final String myFingerPrint = "632fbbdeb836c4088ac92d595bb5c57576e72a05ecbbed664339d85965306197";
    private static SubLSymbol $g1138$;
    private static SubLSymbol $g1139$;
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLList $ic3$;
    private static final SubLList $ic4$;
    private static final SubLList $ic5$;
    private static final SubLSymbol $ic6$;
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
    private static final SubLString $ic19$;
    private static final SubLString $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLList $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLString $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLString $ic26$;
    private static final SubLInteger $ic27$;
    private static final SubLString $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLList $ic36$;
    private static final SubLList $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLList $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLList $ic50$;
    private static final SubLList $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLList $ic56$;
    private static final SubLList $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLList $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLString $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLString $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLList $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLList $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLList $ic82$;
    private static final SubLList $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLList $ic92$;
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
    private static final SubLList $ic105$;
    private static final SubLList $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLList $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLList $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLList $ic114$;
    private static final SubLSymbol $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLList $ic118$;
    private static final SubLList $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLSymbol $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLList $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLSymbol $ic126$;
    private static final SubLList $ic127$;
    private static final SubLList $ic128$;
    private static final SubLSymbol $ic129$;
    private static final SubLSymbol $ic130$;
    private static final SubLSymbol $ic131$;
    private static final SubLSymbol $ic132$;
    private static final SubLList $ic133$;
    private static final SubLSymbol $ic134$;
    private static final SubLSymbol $ic135$;
    private static final SubLSymbol $ic136$;
    private static final SubLSymbol $ic137$;
    private static final SubLList $ic138$;
    private static final SubLSymbol $ic139$;
    private static final SubLSymbol $ic140$;
    private static final SubLList $ic141$;
    private static final SubLSymbol $ic142$;
    private static final SubLSymbol $ic143$;
    private static final SubLSymbol $ic144$;
    private static final SubLSymbol $ic145$;
    private static final SubLSymbol $ic146$;
    private static final SubLSymbol $ic147$;
    private static final SubLList $ic148$;
    private static final SubLSymbol $ic149$;
    private static final SubLList $ic150$;
    private static final SubLList $ic151$;
    private static final SubLSymbol $ic152$;
    private static final SubLSymbol $ic153$;
    private static final SubLSymbol $ic154$;
    private static final SubLSymbol $ic155$;
    private static final SubLSymbol $ic156$;
    private static final SubLList $ic157$;
    private static final SubLSymbol $ic158$;
    private static final SubLSymbol $ic159$;
    private static final SubLSymbol $ic160$;
    private static final SubLSymbol $ic161$;
    private static final SubLSymbol $ic162$;
    private static final SubLSymbol $ic163$;
    private static final SubLList $ic164$;
    private static final SubLList $ic165$;
    private static final SubLSymbol $ic166$;
    private static final SubLSymbol $ic167$;
    private static final SubLSymbol $ic168$;
    private static final SubLSymbol $ic169$;
    private static final SubLList $ic170$;
    private static final SubLSymbol $ic171$;
    private static final SubLString $ic172$;
    private static final SubLSymbol $ic173$;
    private static final SubLList $ic174$;
    private static final SubLList $ic175$;
    private static final SubLList $ic176$;
    private static final SubLString $ic177$;
    private static final SubLSymbol $ic178$;
    private static final SubLSymbol $ic179$;
    private static final SubLSymbol $ic180$;
    private static final SubLSymbol $ic181$;
    private static final SubLSymbol $ic182$;
    private static final SubLSymbol $ic183$;
    private static final SubLSymbol $ic184$;
    private static final SubLString $ic185$;
    private static final SubLSymbol $ic186$;
    private static final SubLSymbol $ic187$;
    private static final SubLString $ic188$;
    private static final SubLList $ic189$;
    private static final SubLString $ic190$;
    private static final SubLString $ic191$;
    private static final SubLString $ic192$;
    private static final SubLString $ic193$;
    private static final SubLSymbol $ic194$;
    private static final SubLSymbol $ic195$;
    private static final SubLString $ic196$;
    private static final SubLSymbol $ic197$;
    private static final SubLString $ic198$;
    private static final SubLString $ic199$;
    private static final SubLString $ic200$;
    private static final SubLString $ic201$;
    private static final SubLString $ic202$;
    private static final SubLString $ic203$;
    private static final SubLString $ic204$;
    private static final SubLString $ic205$;
    private static final SubLString $ic206$;
    private static final SubLString $ic207$;
    private static final SubLString $ic208$;
    private static final SubLString $ic209$;
    private static final SubLString $ic210$;
    private static final SubLSymbol $ic211$;
    private static final SubLSymbol $ic212$;
    private static final SubLSymbol $ic213$;
    private static final SubLString $ic214$;
    private static final SubLSymbol $ic215$;
    private static final SubLSymbol $ic216$;
    private static final SubLSymbol $ic217$;
    private static final SubLSymbol $ic218$;
    private static final SubLSymbol $ic219$;
    private static final SubLSymbol $ic220$;
    private static final SubLSymbol $ic221$;
    private static final SubLSymbol $ic222$;
    private static final SubLList $ic223$;
    private static final SubLSymbol $ic224$;
    private static final SubLList $ic225$;
    private static final SubLList $ic226$;
    private static final SubLString $ic227$;
    private static final SubLString $ic228$;
    private static final SubLSymbol $ic229$;
    private static final SubLSymbol $ic230$;
    private static final SubLSymbol $ic231$;
    private static final SubLSymbol $ic232$;
    private static final SubLSymbol $ic233$;
    private static final SubLSymbol $ic234$;
    private static final SubLSymbol $ic235$;
    private static final SubLList $ic236$;
    private static final SubLString $ic237$;
    private static final SubLSymbol $ic238$;
    private static final SubLSymbol $ic239$;
    private static final SubLList $ic240$;
    private static final SubLList $ic241$;
    
    
    public static SubLObject f5164(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var7;
            var4 = (var7 = var5);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic1$, reader.bq_cons((SubLObject)ConsesLow.list((SubLObject)$ic2$, var6), (SubLObject)$ic3$), (SubLObject)$ic4$, ConsesLow.append(var7, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic0$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5165(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic5$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic5$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic5$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic5$);
        var8 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var9;
            var4 = (var9 = var5);
            final SubLObject var10 = (SubLObject)$ic6$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var10, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic7$, var10, (SubLObject)ConsesLow.listS((SubLObject)$ic8$, (SubLObject)ConsesLow.list(var6, var10, var8), ConsesLow.append(var9, (SubLObject)NIL)), (SubLObject)ConsesLow.listS((SubLObject)$ic1$, (SubLObject)ConsesLow.list(reader.bq_cons(var6, (SubLObject)$ic9$)), ConsesLow.append(var9, (SubLObject)NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic5$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5166(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic5$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic5$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic5$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic5$);
        var8 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var9;
            var4 = (var9 = var5);
            final SubLObject var10 = (SubLObject)$ic10$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var10, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic7$, var10, (SubLObject)ConsesLow.listS((SubLObject)$ic11$, (SubLObject)ConsesLow.list(var6, var10, var8), ConsesLow.append(var9, (SubLObject)NIL)), (SubLObject)ConsesLow.listS((SubLObject)$ic1$, (SubLObject)ConsesLow.list(reader.bq_cons(var6, (SubLObject)$ic9$)), ConsesLow.append(var9, (SubLObject)NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic5$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5167(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic5$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic5$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic5$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic5$);
        var8 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var9;
            var4 = (var9 = var5);
            final SubLObject var10 = (SubLObject)$ic12$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var10, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic7$, var10, (SubLObject)ConsesLow.listS((SubLObject)$ic13$, (SubLObject)ConsesLow.list(var6, var10, var8), ConsesLow.append(var9, (SubLObject)NIL)), (SubLObject)ConsesLow.listS((SubLObject)$ic1$, (SubLObject)ConsesLow.list(reader.bq_cons(var6, (SubLObject)$ic9$)), ConsesLow.append(var9, (SubLObject)NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic5$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5168(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic5$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic5$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic5$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic5$);
        var8 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var9;
            var4 = (var9 = var5);
            final SubLObject var10 = (SubLObject)$ic14$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var10, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic7$, var10, (SubLObject)ConsesLow.listS((SubLObject)$ic15$, (SubLObject)ConsesLow.list(var6, var10, var8), ConsesLow.append(var9, (SubLObject)NIL)), (SubLObject)ConsesLow.listS((SubLObject)$ic1$, (SubLObject)ConsesLow.list(reader.bq_cons(var6, (SubLObject)$ic9$)), ConsesLow.append(var9, (SubLObject)NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic5$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5169(SubLObject var11, SubLObject var24, SubLObject var25) {
        if (var11 == UNPROVIDED) {
            var11 = StreamsLow.$standard_input$.getDynamicValue();
        }
        if (var24 == UNPROVIDED) {
            var24 = (SubLObject)T;
        }
        if (var25 == UNPROVIDED) {
            var25 = (SubLObject)NIL;
        }
        final SubLObject var26 = streams_high.peek_char((SubLObject)NIL, var11, (SubLObject)NIL, (SubLObject)$ic16$, (SubLObject)UNPROVIDED);
        if ($ic16$ != var26) {
            return Characters.char_code(var26);
        }
        if (NIL == var24) {
            return var25;
        }
        return streams_high.peek_char((SubLObject)NIL, var11, (SubLObject)T, var25, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f5170(SubLObject var11, SubLObject var24, SubLObject var25) {
        if (var11 == UNPROVIDED) {
            var11 = StreamsLow.$standard_input$.getDynamicValue();
        }
        if (var24 == UNPROVIDED) {
            var24 = (SubLObject)T;
        }
        if (var25 == UNPROVIDED) {
            var25 = (SubLObject)NIL;
        }
        final SubLObject var26 = streams_high.read_char(var11, (SubLObject)NIL, (SubLObject)$ic16$, (SubLObject)UNPROVIDED);
        if ($ic16$ != var26) {
            return Characters.char_code(var26);
        }
        if (NIL == var24) {
            return var25;
        }
        return streams_high.read_char(var11, (SubLObject)T, var25, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f5171(final SubLObject var27, SubLObject var11) {
        if (var11 == UNPROVIDED) {
            var11 = StreamsLow.$standard_input$.getDynamicValue();
        }
        final SubLObject var28 = Characters.code_char(var27);
        return streams_high.unread_char(var28, var11);
    }
    
    public static SubLObject f5172(final SubLObject var27, SubLObject var11) {
        if (var11 == UNPROVIDED) {
            var11 = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLObject var28 = Characters.code_char(var27);
        return streams_high.write_char(var28, var11);
    }
    
    public static SubLObject f5173(final SubLObject var28) {
        return (SubLObject)makeBoolean(var28.isStream() || var28 == T || var28 == NIL);
    }
    
    public static SubLObject f5174(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        SubLObject var30 = (SubLObject)NIL;
        try {
            var29.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var31 = Errors.$error_handler$.currentBinding(var29);
            try {
                Errors.$error_handler$.bind((SubLObject)$ic17$, var29);
                try {
                    Filesys.probe_file(var28);
                }
                catch (Throwable var32) {
                    Errors.handleThrowable(var32, (SubLObject)NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var31, var29);
            }
        }
        catch (Throwable var33) {
            var30 = Errors.handleThrowable(var33, module0003.$g3$.getGlobalValue());
        }
        finally {
            var29.throwStack.pop();
        }
        return Types.sublisp_null(var30);
    }
    
    public static SubLObject f5175(final SubLObject var34, final SubLObject var12, SubLObject var35) {
        if (var35 == UNPROVIDED) {
            var35 = (SubLObject)NIL;
        }
        assert NIL != Types.listp(var34) : var34;
        return f5176(module0011.$g34$.getGlobalValue(), Filesys.construct_filename(var34, var12, var35, (SubLObject)T), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f5177(final SubLObject var34) {
        assert NIL != Types.listp(var34) : var34;
        return f5176(module0011.$g34$.getGlobalValue(), Filesys.construct_filename(var34, (SubLObject)$ic19$, (SubLObject)NIL, (SubLObject)T), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f5178() {
        return module0038.f2624(Filesys.probe_file((SubLObject)$ic20$));
    }
    
    public static SubLObject f5176(final SubLObject var36, final SubLObject var12, SubLObject var35) {
        if (var35 == UNPROVIDED) {
            var35 = (SubLObject)NIL;
        }
        assert NIL != Types.stringp(var36) : var36;
        return Sequences.cconcatenate(var36, f5179(var12, var35));
    }
    
    public static SubLObject f5179(final SubLObject var12, SubLObject var35) {
        if (var35 == UNPROVIDED) {
            var35 = (SubLObject)NIL;
        }
        if (NIL == var35) {
            return var12;
        }
        return Filesys.construct_filename((SubLObject)NIL, var12, var35, (SubLObject)T);
    }
    
    public static SubLObject f5180() {
        return $g1138$.getGlobalValue();
    }
    
    public static SubLObject f5181() {
        return Strings.sublisp_char($g1139$.getGlobalValue(), random.random((SubLObject)$ic27$));
    }
    
    public static SubLObject f5182(SubLObject var36) {
        if (var36 == UNPROVIDED) {
            var36 = $g1138$.getGlobalValue();
        }
        assert NIL != Types.stringp(var36) : var36;
        final SubLObject var37 = f5183((SubLObject)EIGHT_INTEGER);
        return f5176(var36, var37, (SubLObject)$ic28$);
    }
    
    public static SubLObject f5183(SubLObject var37) {
        if (var37 == UNPROVIDED) {
            var37 = (SubLObject)EIGHT_INTEGER;
        }
        final SubLObject var38 = Strings.make_string(var37, (SubLObject)Characters.CHAR_space);
        SubLObject var39;
        for (var39 = (SubLObject)NIL, var39 = (SubLObject)ZERO_INTEGER; var39.numL(var37); var39 = Numbers.add(var39, (SubLObject)ONE_INTEGER)) {
            Strings.set_char(var38, var39, f5181());
        }
        return var38;
    }
    
    public static SubLObject f5184(SubLObject var36) {
        if (var36 == UNPROVIDED) {
            var36 = $g1138$.getGlobalValue();
        }
        SubLObject var37;
        for (var37 = (SubLObject)NIL; NIL == var37 || NIL != Filesys.probe_file(var37); var37 = Strings.string_downcase(f5182(var36), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {}
        return var37;
    }
    
    public static SubLObject f5185(final SubLObject var40, SubLObject var36) {
        if (var36 == UNPROVIDED) {
            var36 = $g1138$.getGlobalValue();
        }
        assert NIL != Types.stringp(var36) : var36;
        final SubLObject var41 = f5183((SubLObject)EIGHT_INTEGER);
        final SubLObject var42 = Sequences.cconcatenate(var40, var41);
        return f5176(var36, var42, (SubLObject)$ic28$);
    }
    
    public static SubLObject f5186(SubLObject var42, SubLObject var43) {
        if (var42 == UNPROVIDED) {
            var42 = (SubLObject)$ic29$;
        }
        if (var43 == UNPROVIDED) {
            var43 = $g1138$.getGlobalValue();
        }
        SubLObject var44;
        for (var44 = (SubLObject)NIL; NIL == var44; var44 = StreamsLow.open(f5182(var43), new SubLObject[] { $ic30$, $ic31$, $ic32$, NIL, $ic33$, $ic34$, $ic35$, var42 })) {}
        return var44;
    }
    
    public static SubLObject f5187(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic36$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic36$);
        var6 = var4.first();
        var4 = var4.rest();
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = var4;
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var50_51 = (SubLObject)NIL;
        while (NIL != var8) {
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)$ic36$);
            var50_51 = var8.first();
            var8 = var8.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)$ic36$);
            if (NIL == conses_high.member(var50_51, (SubLObject)$ic37$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var9 = (SubLObject)T;
            }
            if (var50_51 == $ic38$) {
                var7 = var8.first();
            }
            var8 = var8.rest();
        }
        if (NIL != var9 && NIL == var7) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic36$);
        }
        final SubLObject var10 = cdestructuring_bind.property_list_member((SubLObject)$ic35$, var4);
        final SubLObject var11 = (SubLObject)((NIL != var10) ? conses_high.cadr(var10) : $ic29$);
        final SubLObject var12;
        var4 = (var12 = var5);
        return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)$ic39$, var11))), reader.bq_cons((SubLObject)$ic40$, ConsesLow.append(var12, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic41$, (SubLObject)ConsesLow.list((SubLObject)$ic42$, var6), (SubLObject)ConsesLow.list((SubLObject)$ic43$, var6), (SubLObject)ConsesLow.list((SubLObject)$ic44$, var6))))));
    }
    
    public static SubLObject f5188(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic45$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic45$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic45$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var59_60 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic45$);
            var59_60 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic45$);
            if (NIL == conses_high.member(var59_60, (SubLObject)$ic37$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var59_60 == $ic38$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic45$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic35$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : $ic29$);
        final SubLObject var13;
        var4 = (var13 = var5);
        return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)$ic39$, var12))), reader.bq_cons((SubLObject)$ic40$, ConsesLow.append(var13, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic41$, (SubLObject)ConsesLow.list((SubLObject)$ic42$, var6), (SubLObject)ConsesLow.list((SubLObject)$ic46$, var6), (SubLObject)ConsesLow.list((SubLObject)$ic41$, (SubLObject)ConsesLow.list((SubLObject)$ic47$, var7), (SubLObject)ConsesLow.list((SubLObject)$ic43$, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic48$, (SubLObject)ConsesLow.list((SubLObject)$ic49$, (SubLObject)ConsesLow.list((SubLObject)$ic47$, var6)), var7), (SubLObject)ConsesLow.list((SubLObject)$ic43$, var6), (SubLObject)ConsesLow.list((SubLObject)$ic44$, var6))))));
    }
    
    public static SubLObject f5189(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic50$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic50$);
        var6 = var4.first();
        var4 = var4.rest();
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = var4;
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var68_69 = (SubLObject)NIL;
        while (NIL != var8) {
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)$ic50$);
            var68_69 = var8.first();
            var8 = var8.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)$ic50$);
            if (NIL == conses_high.member(var68_69, (SubLObject)$ic51$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var9 = (SubLObject)T;
            }
            if (var68_69 == $ic38$) {
                var7 = var8.first();
            }
            var8 = var8.rest();
        }
        if (NIL != var9 && NIL == var7) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic50$);
        }
        final SubLObject var10 = cdestructuring_bind.property_list_member((SubLObject)$ic52$, var4);
        final SubLObject var11 = (NIL != var10) ? conses_high.cadr(var10) : $g1138$.getGlobalValue();
        final SubLObject var12;
        var4 = (var12 = var5);
        return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)$ic53$, var11))), (SubLObject)ConsesLow.list((SubLObject)$ic40$, reader.bq_cons((SubLObject)$ic54$, ConsesLow.append(var12, (SubLObject)NIL)), (SubLObject)ConsesLow.list((SubLObject)$ic55$, (SubLObject)ConsesLow.list((SubLObject)$ic43$, var6))));
    }
    
    public static SubLObject f5190(SubLObject var42, SubLObject var43) {
        if (var42 == UNPROVIDED) {
            var42 = (SubLObject)$ic29$;
        }
        if (var43 == UNPROVIDED) {
            var43 = $g1138$.getGlobalValue();
        }
        return f5186(var42, var43);
    }
    
    public static SubLObject f5191(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic57$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic57$);
        var6 = var4.first();
        var4 = var4.rest();
        final SubLObject var7 = (SubLObject)(var4.isCons() ? var4.first() : $ic29$);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic57$);
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var8;
            var4 = (var8 = var5);
            module0002.f37((SubLObject)$ic58$, (SubLObject)$ic59$);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic60$, (SubLObject)ConsesLow.list(var6, (SubLObject)$ic35$, var7), ConsesLow.append(var8, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic57$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5192(final SubLObject var36, SubLObject var74) {
        if (var74 == UNPROVIDED) {
            var74 = (SubLObject)ZERO_INTEGER;
        }
        final SubLThread var75 = SubLProcess.currentSubLThread();
        assert NIL != Types.stringp(var36) : var36;
        assert NIL != Types.integerp(var74) : var74;
        if (NIL == Filesys.directory_p(var36)) {
            return (SubLObject)NIL;
        }
        final SubLObject var76 = f5182(var36);
        SubLObject var77 = (SubLObject)NIL;
        SubLObject var78 = (SubLObject)NIL;
        SubLObject var79 = (SubLObject)NIL;
        SubLObject var80 = (SubLObject)NIL;
        try {
            var75.throwStack.push($ic62$);
            final SubLObject var81 = Errors.$error_handler$.currentBinding(var75);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic63$), var75);
                try {
                    try {
                        SubLObject var82 = (SubLObject)NIL;
                        try {
                            var82 = compatibility.open_binary(var76, (SubLObject)$ic64$);
                            if (!var82.isStream()) {
                                Errors.error((SubLObject)$ic65$, var76);
                            }
                            final SubLObject var83 = var82;
                            var77 = (SubLObject)T;
                            var78 = (SubLObject)T;
                        }
                        finally {
                            final SubLObject var31_82 = Threads.$is_thread_performing_cleanupP$.currentBinding(var75);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var75);
                                if (var82.isStream()) {
                                    streams_high.close(var82, (SubLObject)UNPROVIDED);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var31_82, var75);
                            }
                        }
                    }
                    finally {
                        final SubLObject var31_83 = Threads.$is_thread_performing_cleanupP$.currentBinding(var75);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var75);
                            if (NIL != var77) {
                                if (NIL != var78) {
                                    var79 = module0035.sublisp_boolean(Filesys.probe_file(var76));
                                }
                                Filesys.delete_file(var76);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var31_83, var75);
                        }
                    }
                }
                catch (Throwable var84) {
                    Errors.handleThrowable(var84, (SubLObject)NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var81, var75);
            }
        }
        catch (Throwable var85) {
            var80 = Errors.handleThrowable(var85, (SubLObject)$ic62$);
        }
        finally {
            var75.throwStack.pop();
        }
        return var79;
    }
    
    public static SubLObject f5193(final SubLObject var84) {
        final SubLThread var85 = SubLProcess.currentSubLThread();
        SubLObject var86 = (SubLObject)NIL;
        if (var84.isString()) {
            SubLObject var87 = (SubLObject)NIL;
            try {
                var85.throwStack.push($ic62$);
                final SubLObject var88 = Errors.$error_handler$.currentBinding(var85);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic63$), var85);
                    try {
                        if (NIL != Filesys.probe_file(var84) || NIL != f5192(f5194(f5195(var84), (SubLObject)$ic19$, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED)) {
                            var86 = (SubLObject)T;
                        }
                    }
                    catch (Throwable var89) {
                        Errors.handleThrowable(var89, (SubLObject)NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var88, var85);
                }
            }
            catch (Throwable var90) {
                var87 = Errors.handleThrowable(var90, (SubLObject)$ic62$);
            }
            finally {
                var85.throwStack.pop();
            }
        }
        return var86;
    }
    
    public static SubLObject f5196(final SubLObject var12) {
        if (NIL != Filesys.probe_file(var12)) {
            return Filesys.delete_file(var12);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5197(final SubLObject var12) {
        final SubLObject var14;
        final SubLObject var13 = var14 = Sequences.copy_seq(var12);
        SubLObject var90_91;
        SubLObject var15;
        SubLObject var16;
        SubLObject var17;
        for (var15 = (var90_91 = Sequences.length(var14)), var16 = (SubLObject)NIL, var16 = (SubLObject)ZERO_INTEGER; !var16.numGE(var90_91); var16 = module0048.f_1X(var16)) {
            var17 = Strings.sublisp_char(var14, var16);
            if (NIL == Characters.alphanumericp(var17)) {
                Strings.set_char(var13, var16, (SubLObject)Characters.CHAR_hyphen);
            }
        }
        return var13;
    }
    
    public static SubLObject f5198(final SubLObject var93, final SubLObject var94, SubLObject var95) {
        if (var95 == UNPROVIDED) {
            var95 = (SubLObject)$ic29$;
        }
        SubLObject var96 = (SubLObject)NIL;
        SubLObject var97 = (SubLObject)NIL;
        final SubLObject var98 = var95;
        if (var98.eql((SubLObject)$ic29$)) {
            var96 = Symbols.symbol_function((SubLObject)$ic66$);
            var97 = Symbols.symbol_function((SubLObject)$ic67$);
        }
        else if (var98.eql((SubLObject)$ic68$) || var98.eql((SubLObject)$ic69$)) {
            var96 = Symbols.symbol_function((SubLObject)$ic70$);
            var97 = Symbols.symbol_function((SubLObject)$ic71$);
        }
        else {
            Errors.error((SubLObject)$ic72$, var95);
        }
        SubLObject var99 = (SubLObject)NIL;
        try {
            final SubLObject var100;
            var99 = (var100 = StreamsLow.open(var93, new SubLObject[] { $ic35$, var95, $ic33$, NIL }));
            if (NIL != var100) {
                SubLObject var101_102 = (SubLObject)NIL;
                try {
                    final SubLObject var101;
                    var101_102 = (var101 = StreamsLow.open(var94, new SubLObject[] { $ic30$, $ic64$, $ic32$, $ic73$, $ic35$, var95, $ic33$, $ic34$ }));
                    SubLObject var102;
                    for (var102 = (SubLObject)NIL, var102 = Functions.funcall(var96, var100, (SubLObject)NIL, (SubLObject)NIL); NIL != var102; var102 = Functions.funcall(var96, var100, (SubLObject)NIL, (SubLObject)NIL)) {
                        Functions.funcall(var97, var102, var101);
                    }
                }
                finally {
                    final SubLObject var103 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                    try {
                        Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                        if (NIL != var101_102) {
                            streams_high.close(var101_102, (SubLObject)UNPROVIDED);
                        }
                    }
                    finally {
                        Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var103);
                    }
                }
            }
        }
        finally {
            final SubLObject var104 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                if (NIL != var99) {
                    streams_high.close(var99, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var104);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5199(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic74$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic74$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic74$);
        var7 = var4.first();
        var4 = var4.rest();
        final SubLObject var8 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic74$);
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var9;
            var4 = (var9 = var5);
            final SubLObject var10 = (SubLObject)$ic75$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic8$, (SubLObject)ConsesLow.listS(var10, var7, (SubLObject)$ic76$), (SubLObject)ConsesLow.list((SubLObject)$ic41$, (SubLObject)ConsesLow.list((SubLObject)$ic42$, var10), (SubLObject)ConsesLow.listS((SubLObject)$ic77$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)$ic78$, var10), (SubLObject)ConsesLow.list((SubLObject)$ic78$, var10))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic79$, (SubLObject)ConsesLow.list((SubLObject)$ic80$, var6), var8)), ConsesLow.append(var9, (SubLObject)NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic74$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5200(final SubLObject var111) {
        return module0038.f2835(var111, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)T);
    }
    
    public static SubLObject f5201(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic82$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic82$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic82$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var119_120 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic82$);
            var119_120 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic82$);
            if (NIL == conses_high.member(var119_120, (SubLObject)$ic83$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var119_120 == $ic38$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic82$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic84$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic85$, var4);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : NIL);
        final SubLObject var15;
        var4 = (var15 = var5);
        if (NIL == var12) {
            final SubLObject var16 = (SubLObject)$ic86$;
            return (SubLObject)ConsesLow.listS((SubLObject)$ic87$, (SubLObject)ConsesLow.list(var6, var7, (SubLObject)$ic84$, var16, (SubLObject)$ic85$, var14), ConsesLow.append(var15, (SubLObject)NIL));
        }
        final SubLObject var17 = (SubLObject)$ic88$;
        assert NIL != Types.symbolp(var12) : var12;
        return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var17, var7)), (SubLObject)ConsesLow.listS((SubLObject)$ic77$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var12, (SubLObject)ZERO_INTEGER, (SubLObject)ConsesLow.list((SubLObject)$ic90$, var12)), (SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)$ic91$, var17), (SubLObject)ConsesLow.list((SubLObject)$ic91$, var17))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic79$, var14, (SubLObject)ConsesLow.list((SubLObject)$ic80$, var6))), ConsesLow.append(var15, (SubLObject)NIL)));
    }
    
    public static SubLObject f5202(final SubLObject var11) {
        return module0038.f2835(var11, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)T);
    }
    
    public static SubLObject f5203(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic92$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic92$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic92$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var132_133 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic92$);
            var132_133 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic92$);
            if (NIL == conses_high.member(var132_133, (SubLObject)$ic93$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var132_133 == $ic38$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic92$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic84$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic94$, var4);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : NIL);
        final SubLObject var15 = cdestructuring_bind.property_list_member((SubLObject)$ic85$, var4);
        final SubLObject var16 = (SubLObject)((NIL != var15) ? conses_high.cadr(var15) : NIL);
        final SubLObject var17;
        var4 = (var17 = var5);
        if (NIL == var14) {
            final SubLObject var18 = (SubLObject)$ic95$;
            final SubLObject var19 = (SubLObject)$ic96$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var18, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic11$, (SubLObject)ConsesLow.listS(var19, var18, (SubLObject)$ic76$), (SubLObject)ConsesLow.list((SubLObject)$ic41$, (SubLObject)ConsesLow.list((SubLObject)$ic42$, var19), (SubLObject)ConsesLow.listS((SubLObject)$ic87$, (SubLObject)ConsesLow.list(var6, var19, (SubLObject)$ic84$, var12, (SubLObject)$ic85$, var16), ConsesLow.append(var17, (SubLObject)NIL)))));
        }
        final SubLObject var18 = (SubLObject)$ic97$;
        final SubLObject var19 = (SubLObject)$ic98$;
        final SubLObject var20 = (SubLObject)$ic99$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic100$, var14, (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var18, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic11$, (SubLObject)ConsesLow.listS(var19, var18, (SubLObject)$ic76$), (SubLObject)ConsesLow.list((SubLObject)$ic41$, (SubLObject)ConsesLow.list((SubLObject)$ic42$, var19), (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var20, (SubLObject)ConsesLow.list((SubLObject)$ic101$, var19))), (SubLObject)ConsesLow.listS((SubLObject)$ic87$, (SubLObject)ConsesLow.list(var6, var19, (SubLObject)$ic84$, var12, (SubLObject)$ic85$, var16), ConsesLow.append(var17, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic102$, (SubLObject)ConsesLow.list((SubLObject)$ic103$, var19), var20)))))))));
    }
    
    public static SubLObject f5204(final SubLObject var109) {
        final SubLThread var110 = SubLProcess.currentSubLThread();
        SubLObject var111 = (SubLObject)ZERO_INTEGER;
        SubLObject var112 = (SubLObject)NIL;
        try {
            final SubLObject var113 = stream_macros.$stream_requires_locking$.currentBinding(var110);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var110);
                var112 = compatibility.open_text(var109, (SubLObject)$ic104$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var113, var110);
            }
            if (!var112.isStream()) {
                Errors.error((SubLObject)$ic65$, var109);
            }
            final SubLObject var114 = var112;
            if (var114.isStream()) {
                final SubLObject var144_145 = var114;
                SubLObject var115 = (SubLObject)NIL;
                SubLObject var116 = (SubLObject)NIL;
                var115 = (SubLObject)ZERO_INTEGER;
                for (var116 = f5202(var144_145); NIL != var116; var116 = f5202(var144_145)) {
                    var111 = Numbers.add(var111, (SubLObject)ONE_INTEGER);
                    var115 = module0048.f_1X(var115);
                }
            }
        }
        finally {
            final SubLObject var117 = Threads.$is_thread_performing_cleanupP$.currentBinding(var110);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var110);
                if (var112.isStream()) {
                    streams_high.close(var112, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var117, var110);
            }
        }
        return var111;
    }
    
    public static SubLObject f5205(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic105$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic105$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic105$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var155_156 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic105$);
            var155_156 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic105$);
            if (NIL == conses_high.member(var155_156, (SubLObject)$ic106$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var155_156 == $ic38$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic105$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic107$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : $ic108$);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic109$, var4);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : $ic110$);
        final SubLObject var15 = cdestructuring_bind.property_list_member((SubLObject)$ic111$, var4);
        final SubLObject var16 = (SubLObject)((NIL != var15) ? conses_high.cadr(var15) : NIL);
        final SubLObject var17 = cdestructuring_bind.property_list_member((SubLObject)$ic112$, var4);
        final SubLObject var18 = (SubLObject)((NIL != var17) ? conses_high.cadr(var17) : NIL);
        final SubLObject var19 = cdestructuring_bind.property_list_member((SubLObject)$ic113$, var4);
        final SubLObject var20 = (SubLObject)((NIL != var19) ? conses_high.cadr(var19) : $ic114$);
        final SubLObject var21;
        var4 = (var21 = var5);
        final SubLObject var22 = (SubLObject)$ic115$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic116$, (SubLObject)ConsesLow.list(var22, var7), (SubLObject)ConsesLow.listS((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)$ic117$, var22, var12, var14, var16, var18, var20))), ConsesLow.append(var21, (SubLObject)NIL)));
    }
    
    public static SubLObject f5206(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic118$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic118$);
        var6 = var4.first();
        var4 = var4.rest();
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = var4;
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var173_174 = (SubLObject)NIL;
        while (NIL != var8) {
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)$ic118$);
            var173_174 = var8.first();
            var8 = var8.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)$ic118$);
            if (NIL == conses_high.member(var173_174, (SubLObject)$ic106$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var9 = (SubLObject)T;
            }
            if (var173_174 == $ic38$) {
                var7 = var8.first();
            }
            var8 = var8.rest();
        }
        if (NIL != var9 && NIL == var7) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic118$);
        }
        final SubLObject var10 = cdestructuring_bind.property_list_member((SubLObject)$ic107$, var4);
        final SubLObject var11 = (SubLObject)((NIL != var10) ? conses_high.cadr(var10) : $ic119$);
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)$ic109$, var4);
        final SubLObject var13 = (SubLObject)((NIL != var12) ? conses_high.cadr(var12) : NIL);
        final SubLObject var14 = cdestructuring_bind.property_list_member((SubLObject)$ic111$, var4);
        final SubLObject var15 = (SubLObject)((NIL != var14) ? conses_high.cadr(var14) : NIL);
        final SubLObject var16 = cdestructuring_bind.property_list_member((SubLObject)$ic112$, var4);
        final SubLObject var17 = (SubLObject)((NIL != var16) ? conses_high.cadr(var16) : T);
        final SubLObject var18 = cdestructuring_bind.property_list_member((SubLObject)$ic113$, var4);
        final SubLObject var19 = (SubLObject)((NIL != var18) ? conses_high.cadr(var18) : NIL);
        var4 = var5;
        SubLObject var20 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic118$);
        var20 = var4.first();
        final SubLObject var21;
        var4 = (var21 = var4.rest());
        final SubLObject var22 = (SubLObject)$ic120$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic81$, (SubLObject)ConsesLow.list(var22, var6), (SubLObject)ConsesLow.listS((SubLObject)$ic121$, var20, (SubLObject)ConsesLow.list((SubLObject)$ic122$, (SubLObject)$ic123$, (SubLObject)ConsesLow.listS((SubLObject)$ic117$, var22, ConsesLow.append((SubLObject)ConsesLow.list(var11, var13, var15, var17, var19), (SubLObject)NIL))), ConsesLow.append(var21, (SubLObject)NIL)));
    }
    
    public static SubLObject f5207(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic74$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic74$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic74$);
        var7 = var4.first();
        var4 = var4.rest();
        final SubLObject var8 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic74$);
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var9;
            var4 = (var9 = var5);
            final SubLObject var10 = (SubLObject)$ic124$;
            final SubLObject var11 = (SubLObject)$ic125$;
            final SubLObject var12 = (SubLObject)$ic126$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list(var12), (SubLObject)ConsesLow.list((SubLObject)$ic81$, (SubLObject)ConsesLow.list(var10, var7, var12), (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list(reader.bq_cons(var11, (SubLObject)$ic127$), reader.bq_cons(var6, (SubLObject)$ic128$)), (SubLObject)ConsesLow.list((SubLObject)$ic129$, (SubLObject)ConsesLow.list((SubLObject)$ic130$, var11, (SubLObject)ConsesLow.list((SubLObject)$ic131$, var10)), (SubLObject)ConsesLow.list((SubLObject)$ic132$, (SubLObject)$ic133$, (SubLObject)ConsesLow.list((SubLObject)$ic134$, var10, (SubLObject)NIL, (SubLObject)NIL, var11), (SubLObject)ConsesLow.list((SubLObject)$ic135$, (SubLObject)$ic136$, var6), (SubLObject)ConsesLow.listS((SubLObject)$ic137$, var11, (SubLObject)$ic138$))), (SubLObject)ConsesLow.list((SubLObject)$ic137$, var6, (SubLObject)ConsesLow.list((SubLObject)$ic139$, var6)), (SubLObject)ConsesLow.list((SubLObject)$ic137$, var12, var8), (SubLObject)ConsesLow.listS((SubLObject)$ic140$, var8, ConsesLow.append(var9, (SubLObject)NIL)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic74$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5208(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic141$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic141$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic141$);
        var7 = var4.first();
        var4 = var4.rest();
        final SubLObject var8 = var4.isCons() ? var4.first() : Symbols.symbol_function((SubLObject)$ic142$);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic141$);
        var4 = var4.rest();
        final SubLObject var9 = var4.isCons() ? var4.first() : Symbols.symbol_function((SubLObject)$ic143$);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic141$);
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var10;
            var4 = (var10 = var5);
            final SubLObject var11 = (SubLObject)$ic144$;
            final SubLObject var12 = (SubLObject)$ic145$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic8$, (SubLObject)ConsesLow.listS(var11, var7, (SubLObject)$ic76$), (SubLObject)ConsesLow.list((SubLObject)$ic41$, (SubLObject)ConsesLow.list((SubLObject)$ic146$, var11), (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list(var6), (SubLObject)ConsesLow.list((SubLObject)$ic77$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var12, (SubLObject)ConsesLow.listS((SubLObject)$ic147$, var11, (SubLObject)$ic148$), (SubLObject)ConsesLow.listS((SubLObject)$ic147$, var11, (SubLObject)$ic148$))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic80$, var12)), (SubLObject)ConsesLow.listS((SubLObject)$ic137$, var6, (SubLObject)$ic9$), (SubLObject)ConsesLow.list((SubLObject)$ic140$, (SubLObject)ConsesLow.list((SubLObject)$ic79$, (SubLObject)ConsesLow.list((SubLObject)$ic149$, var9, var12), (SubLObject)ConsesLow.list((SubLObject)$ic149$, var8, var12)), (SubLObject)ConsesLow.list((SubLObject)$ic135$, var12, var6), (SubLObject)ConsesLow.list((SubLObject)$ic77$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var12, (SubLObject)ConsesLow.listS((SubLObject)$ic147$, var11, (SubLObject)$ic148$), (SubLObject)ConsesLow.listS((SubLObject)$ic147$, var11, (SubLObject)$ic148$))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic79$, (SubLObject)ConsesLow.list((SubLObject)$ic80$, var12), (SubLObject)ConsesLow.list((SubLObject)$ic149$, var8, var12))), (SubLObject)ConsesLow.list((SubLObject)$ic140$, (SubLObject)ConsesLow.list((SubLObject)$ic149$, var9, var12), (SubLObject)ConsesLow.list((SubLObject)$ic135$, var12, var6)))), (SubLObject)ConsesLow.listS((SubLObject)$ic41$, var6, (SubLObject)ConsesLow.list((SubLObject)$ic137$, var6, (SubLObject)ConsesLow.list((SubLObject)$ic139$, var6)), ConsesLow.append(var10, (SubLObject)NIL))))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic141$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5209(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic150$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic150$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic150$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var199_200 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic150$);
            var199_200 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic150$);
            if (NIL == conses_high.member(var199_200, (SubLObject)$ic151$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var199_200 == $ic38$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic150$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic152$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : T);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic94$, var4);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : NIL);
        final SubLObject var15 = cdestructuring_bind.property_list_member((SubLObject)$ic85$, var4);
        final SubLObject var16 = (SubLObject)((NIL != var15) ? conses_high.cadr(var15) : NIL);
        final SubLObject var17 = cdestructuring_bind.property_list_member((SubLObject)$ic153$, var4);
        final SubLObject var18 = (SubLObject)((NIL != var17) ? conses_high.cadr(var17) : NIL);
        final SubLObject var19;
        var4 = (var19 = var5);
        final SubLObject var20 = (SubLObject)$ic154$;
        final SubLObject var21 = (SubLObject)$ic155$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic54$, (SubLObject)ConsesLow.listS((SubLObject)$ic156$, var7, (SubLObject)$ic157$), (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var20, (SubLObject)ConsesLow.list((SubLObject)$ic158$, var7, var12)), (SubLObject)ConsesLow.list(var21, var14), (SubLObject)ConsesLow.list((SubLObject)$ic159$, (SubLObject)ConsesLow.list((SubLObject)$ic160$, (SubLObject)ConsesLow.list((SubLObject)$ic21$, var21)))), (SubLObject)ConsesLow.list((SubLObject)$ic41$, (SubLObject)ConsesLow.list((SubLObject)$ic161$, var18), (SubLObject)ConsesLow.list((SubLObject)$ic137$, var20, (SubLObject)ConsesLow.list((SubLObject)$ic162$, var20, var18))), (SubLObject)ConsesLow.listS((SubLObject)$ic163$, (SubLObject)ConsesLow.list(var6, var20, var21, var16), ConsesLow.append(var19, (SubLObject)NIL))));
    }
    
    public static SubLObject f5210(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic164$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic164$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic164$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var216_217 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic164$);
            var216_217 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic164$);
            if (NIL == conses_high.member(var216_217, (SubLObject)$ic165$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var216_217 == $ic38$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic164$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic152$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : T);
        final SubLObject var13;
        var4 = (var13 = var5);
        return (SubLObject)ConsesLow.list((SubLObject)$ic166$, (SubLObject)ConsesLow.list(var6, var7, (SubLObject)$ic152$, var12), (SubLObject)ConsesLow.listS((SubLObject)$ic41$, (SubLObject)ConsesLow.list((SubLObject)$ic167$, (SubLObject)ConsesLow.list((SubLObject)$ic168$, (SubLObject)ConsesLow.list(var12, var6), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)$ic169$, var7, (SubLObject)$ic170$), (SubLObject)ConsesLow.list((SubLObject)$ic171$, var7, var6)), (SubLObject)ConsesLow.list((SubLObject)T, (SubLObject)ConsesLow.list((SubLObject)$ic171$, var7, (SubLObject)$ic172$, var6)))), (SubLObject)ConsesLow.list((SubLObject)$ic140$, (SubLObject)ConsesLow.listS((SubLObject)EQL, (SubLObject)ConsesLow.list((SubLObject)$ic173$, var6), (SubLObject)$ic174$), (SubLObject)ConsesLow.list((SubLObject)$ic137$, var6, (SubLObject)ConsesLow.listS((SubLObject)$ic171$, var6, (SubLObject)$ic170$))), ConsesLow.append(var13, (SubLObject)NIL)));
    }
    
    public static SubLObject f5211(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic175$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic175$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic175$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var225_226 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic175$);
            var225_226 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic175$);
            if (NIL == conses_high.member(var225_226, (SubLObject)$ic176$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var225_226 == $ic38$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic175$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic152$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : T);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic94$, var4);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : $ic177$);
        final SubLObject var15;
        var4 = (var15 = var5);
        final SubLObject var16 = (SubLObject)$ic178$;
        final SubLObject var17 = (SubLObject)$ic179$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic54$, (SubLObject)ConsesLow.listS((SubLObject)$ic156$, var7, (SubLObject)$ic157$), (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var16, (SubLObject)ConsesLow.list((SubLObject)$ic180$, var7))), (SubLObject)ConsesLow.list((SubLObject)$ic77$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var17, (SubLObject)ConsesLow.list((SubLObject)$ic181$, var16), (SubLObject)ConsesLow.list((SubLObject)$ic181$, var16))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic80$, var16)), (SubLObject)ConsesLow.list((SubLObject)$ic182$, var16), (SubLObject)ConsesLow.list((SubLObject)$ic166$, (SubLObject)ConsesLow.list(var6, var17, (SubLObject)$ic152$, var12, (SubLObject)$ic94$, (SubLObject)ConsesLow.list((SubLObject)$ic183$, (SubLObject)ConsesLow.list((SubLObject)$ic21$, var14), (SubLObject)ConsesLow.list((SubLObject)$ic171$, var14, (SubLObject)ConsesLow.list((SubLObject)$ic184$, (SubLObject)$ic185$, var17)))), (SubLObject)ConsesLow.list((SubLObject)$ic7$, (SubLObject)ConsesLow.list((SubLObject)$ic167$, var6), (SubLObject)ConsesLow.list((SubLObject)$ic135$, var6, var16), reader.bq_cons((SubLObject)$ic54$, ConsesLow.append(var15, (SubLObject)NIL)))))));
    }
    
    public static SubLObject f5212(final SubLObject var43) {
        final SubLThread var44 = SubLProcess.currentSubLThread();
        assert NIL != Filesys.directory_p(var43) : var43;
        SubLObject var45 = (SubLObject)NIL;
        if (!var45.isInteger()) {
            var45 = (SubLObject)ZERO_INTEGER;
            assert NIL != Filesys.directory_p(var43) : var43;
            SubLObject var46 = Filesys.directory(var43, (SubLObject)T);
            final SubLObject var47 = (SubLObject)NIL;
            final SubLObject var48 = module0012.$silent_progressP$.currentBinding(var44);
            try {
                module0012.$silent_progressP$.bind((SubLObject)makeBoolean(!var47.isString()), var44);
                if (NIL.isFunctionSpec()) {
                    var46 = Sort.sort(var46, (SubLObject)NIL, (SubLObject)UNPROVIDED);
                }
                final SubLObject var49 = var46;
                module0012.$g82$.setDynamicValue(var47, var44);
                module0012.$g73$.setDynamicValue(Time.get_universal_time(), var44);
                module0012.$g83$.setDynamicValue(Sequences.length(var49), var44);
                module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var44);
                final SubLObject var31_234 = module0012.$g75$.currentBinding(var44);
                final SubLObject var50 = module0012.$g76$.currentBinding(var44);
                final SubLObject var51 = module0012.$g77$.currentBinding(var44);
                final SubLObject var52 = module0012.$g78$.currentBinding(var44);
                try {
                    module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var44);
                    module0012.$g76$.bind((SubLObject)NIL, var44);
                    module0012.$g77$.bind((SubLObject)T, var44);
                    module0012.$g78$.bind(Time.get_universal_time(), var44);
                    module0012.f478(module0012.$g82$.getDynamicValue(var44));
                    SubLObject var53 = var49;
                    SubLObject var54 = (SubLObject)NIL;
                    var54 = var53.first();
                    while (NIL != var53) {
                        module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var44), module0012.$g83$.getDynamicValue(var44));
                        module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var44), (SubLObject)ONE_INTEGER), var44);
                        var45 = Numbers.add(var45, (SubLObject)ONE_INTEGER);
                        var53 = var53.rest();
                        var54 = var53.first();
                    }
                    module0012.f479();
                }
                finally {
                    module0012.$g78$.rebind(var52, var44);
                    module0012.$g77$.rebind(var51, var44);
                    module0012.$g76$.rebind(var50, var44);
                    module0012.$g75$.rebind(var31_234, var44);
                }
            }
            finally {
                module0012.$silent_progressP$.rebind(var48, var44);
            }
        }
        return var45;
    }
    
    public static SubLObject f5213(final SubLObject var43, final SubLObject var239, SubLObject var240, SubLObject var241, SubLObject var242) {
        if (var240 == UNPROVIDED) {
            var240 = (SubLObject)NIL;
        }
        if (var241 == UNPROVIDED) {
            var241 = (SubLObject)NIL;
        }
        if (var242 == UNPROVIDED) {
            var242 = (SubLObject)NIL;
        }
        return Mapping.mapcar((SubLObject)$ic186$, module0045.f3157(var239, Filesys.directory(var43, var240), var241, var242));
    }
    
    public static SubLObject f5214(final SubLObject var243) {
        return Sort.sort(var243, (SubLObject)$ic130$, (SubLObject)$ic187$);
    }
    
    public static SubLObject f5215(final SubLObject var244) {
        SubLObject var245 = (SubLObject)NIL;
        SubLObject var246 = (SubLObject)NIL;
        try {
            var246 = streams_high.make_private_string_output_stream();
            SubLObject var246_247 = (SubLObject)NIL;
            try {
                var246_247 = compatibility.open_text(var244, (SubLObject)$ic104$);
                if (!var246_247.isStream()) {
                    Errors.error((SubLObject)$ic65$, var244);
                }
                final SubLObject var247 = var246_247;
                if (var247.isStream()) {
                    SubLObject var248;
                    for (var248 = (SubLObject)NIL, var248 = f5200(var247); NIL != var248; var248 = f5200(var247)) {
                        streams_high.write_string(var248, var246, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        streams_high.terpri(var246);
                    }
                }
            }
            finally {
                final SubLObject var249 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                    if (var246_247.isStream()) {
                        streams_high.close(var246_247, (SubLObject)UNPROVIDED);
                    }
                }
                finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var249);
                }
            }
            var245 = streams_high.get_output_stream_string(var246);
        }
        finally {
            final SubLObject var250 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                streams_high.close(var246, (SubLObject)UNPROVIDED);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var250);
            }
        }
        return var245;
    }
    
    public static SubLObject f5216(final SubLObject var244) {
        if (NIL != Filesys.probe_file(var244)) {
            return f5215(var244);
        }
        return (SubLObject)$ic19$;
    }
    
    public static SubLObject f5217(final SubLObject var244) {
        final SubLThread var245 = SubLProcess.currentSubLThread();
        SubLObject var246 = (SubLObject)NIL;
        SubLObject var247 = (SubLObject)NIL;
        try {
            final SubLObject var248 = stream_macros.$stream_requires_locking$.currentBinding(var245);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var245);
                var247 = compatibility.open_text(var244, (SubLObject)$ic104$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var248, var245);
            }
            if (!var247.isStream()) {
                Errors.error((SubLObject)$ic65$, var244);
            }
            final SubLObject var249 = var247;
            if (var249.isStream()) {
                final SubLObject var144_251 = var249;
                SubLObject var250 = (SubLObject)NIL;
                SubLObject var251 = (SubLObject)NIL;
                var250 = (SubLObject)ZERO_INTEGER;
                for (var251 = f5202(var144_251); NIL != var251; var251 = f5202(var144_251)) {
                    var246 = (SubLObject)ConsesLow.cons(var251, var246);
                    var250 = module0048.f_1X(var250);
                }
            }
        }
        finally {
            final SubLObject var252 = Threads.$is_thread_performing_cleanupP$.currentBinding(var245);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var245);
                if (var247.isStream()) {
                    streams_high.close(var247, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var252, var245);
            }
        }
        return Sequences.nreverse(var246);
    }
    
    public static SubLObject f5218(final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        try {
            var13.throwStack.push($ic62$);
            final SubLObject var16 = Errors.$error_handler$.currentBinding(var13);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic63$), var13);
                try {
                    var14 = module0035.sublisp_boolean(Filesys.probe_file(var12));
                }
                catch (Throwable var17) {
                    Errors.handleThrowable(var17, (SubLObject)NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var16, var13);
            }
        }
        catch (Throwable var18) {
            var15 = Errors.handleThrowable(var18, (SubLObject)$ic62$);
        }
        finally {
            var13.throwStack.pop();
        }
        return var14;
    }
    
    public static SubLObject f5219(final SubLObject var12) {
        if (NIL != Filesys.probe_file(var12)) {
            return (SubLObject)NIL;
        }
        final SubLObject var13 = (SubLObject)((NIL != module0038.f2702((SubLObject)Characters.CHAR_backslash, var12, (SubLObject)UNPROVIDED)) ? $ic188$ : $ic172$);
        SubLObject var14 = module0038.f2738(var12, (SubLObject)$ic189$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var15 = Equality.eq(Strings.sublisp_char(var13, (SubLObject)ZERO_INTEGER), Strings.sublisp_char(var12, (SubLObject)ZERO_INTEGER));
        SubLObject var16 = (SubLObject)((NIL != var15) ? var13 : $ic19$);
        SubLObject var17 = (SubLObject)NIL;
        SubLObject var18 = (SubLObject)NIL;
        if (NIL != var15) {
            var14 = var14.rest();
        }
        if (NIL == var17) {
            SubLObject var19 = var14;
            SubLObject var20 = (SubLObject)NIL;
            var20 = var19.first();
            while (NIL == var17 && NIL != var19) {
                var16 = Sequences.cconcatenate(var16, var20);
                if (NIL == Filesys.probe_file(var16)) {
                    if (NIL != var15 || NIL == Filesys.probe_file((SubLObject)$ic19$)) {
                        var18 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic190$, var16);
                    }
                    else {
                        var18 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic191$, Filesys.probe_file((SubLObject)$ic19$), var16);
                    }
                    var17 = (SubLObject)T;
                }
                var16 = Sequences.cconcatenate(var16, var13);
                var19 = var19.rest();
                var20 = var19.first();
            }
        }
        if (NIL == var17) {
            if (NIL != var15) {
                var18 = (SubLObject)$ic192$;
            }
            else {
                var18 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic193$, Filesys.probe_file((SubLObject)$ic19$));
            }
        }
        return var18;
    }
    
    public static SubLObject f5220(final SubLObject var244) {
        if (NIL != module0038.f2702((SubLObject)Characters.CHAR_slash, var244, (SubLObject)UNPROVIDED)) {
            return (SubLObject)$ic194$;
        }
        if (NIL != module0038.f2702((SubLObject)Characters.CHAR_backslash, var244, (SubLObject)UNPROVIDED)) {
            return (SubLObject)$ic195$;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5221(final SubLObject var244) {
        final SubLObject var245 = f5220(var244);
        return (SubLObject)((NIL != var245) ? var245 : $ic194$);
    }
    
    public static SubLObject f5222() {
        return f5223(module0006.f202(Filesys.probe_file((SubLObject)$ic20$)));
    }
    
    public static SubLObject f5223(final SubLObject var262) {
        final SubLObject var263 = f5221(var262);
        final SubLObject var264 = f5224(var263);
        final SubLObject var265 = module0038.f2637(var262).eql(var264) ? var262 : module0038.f2656(var264, var262);
        return var265;
    }
    
    public static SubLObject f5225(final SubLObject var264) {
        return Sequences.cconcatenate(f5222(), f5226(f5227(var264)));
    }
    
    public static SubLObject f5228(final SubLObject var244) {
        final SubLObject var245 = Sequences.length(var244);
        if (var245.eql((SubLObject)ZERO_INTEGER)) {
            return (SubLObject)NIL;
        }
        final SubLObject var246 = f5220(var244);
        if (var246.eql((SubLObject)$ic194$)) {
            return Equality.eq((SubLObject)Characters.CHAR_slash, Strings.sublisp_char(var244, (SubLObject)ZERO_INTEGER));
        }
        if (var246.eql((SubLObject)$ic195$)) {
            return (SubLObject)makeBoolean(var245.numG((SubLObject)TWO_INTEGER) && ((Characters.CHAR_colon.eql(Strings.sublisp_char(var244, (SubLObject)ONE_INTEGER)) && NIL != Characters.alpha_char_p(Strings.sublisp_char(var244, (SubLObject)ZERO_INTEGER))) || NIL != module0038.f2684(var244, (SubLObject)$ic196$)));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5224(final SubLObject var261) {
        final SubLObject var262 = f5229(var261);
        if (var262.isString()) {
            return Strings.sublisp_char(var262, (SubLObject)ZERO_INTEGER);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5229(final SubLObject var261) {
        if (var261.eql((SubLObject)$ic194$)) {
            return (SubLObject)$ic172$;
        }
        if (var261.eql((SubLObject)$ic195$)) {
            return (SubLObject)$ic188$;
        }
        if (var261.eql((SubLObject)$ic197$)) {
            return (SubLObject)$ic198$;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5195(final SubLObject var244) {
        final SubLObject var245 = f5220(var244);
        if (NIL == var245) {
            return Values.values((SubLObject)NIL, var244, (SubLObject)NIL);
        }
        SubLObject var246 = module0038.f2738(var244, (SubLObject)ConsesLow.list(f5229(var245)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var247 = (SubLObject)NIL;
        var246 = Sequences.nreverse(var246);
        var247 = var246.first();
        var246 = var246.rest();
        var246 = Sequences.nreverse(var246);
        return Values.values(var246, var247, var245);
    }
    
    public static SubLObject f5194(final SubLObject var266, final SubLObject var12, SubLObject var261) {
        if (var261 == UNPROVIDED) {
            var261 = (SubLObject)$ic194$;
        }
        SubLObject var267 = (SubLObject)NIL;
        final SubLObject var268 = f5229(var261);
        SubLObject var269 = var266;
        SubLObject var270 = (SubLObject)NIL;
        var270 = var269.first();
        while (NIL != var269) {
            var267 = (SubLObject)ConsesLow.cons(var270, var267);
            var267 = (SubLObject)ConsesLow.cons(var268, var267);
            var269 = var269.rest();
            var270 = var269.first();
        }
        var267 = (SubLObject)ConsesLow.cons(var12, var267);
        return Functions.apply(Symbols.symbol_function((SubLObject)$ic171$), Sequences.nreverse(var267));
    }
    
    public static SubLObject f5230(final SubLObject var271, final SubLObject var244) {
        final SubLThread var272 = SubLProcess.currentSubLThread();
        if (NIL != f5228(var244)) {
            return var244;
        }
        var272.resetMultipleValues();
        SubLObject var273 = f5195(var271);
        final SubLObject var274 = var272.secondMultipleValue();
        final SubLObject var275 = var272.thirdMultipleValue();
        var272.resetMultipleValues();
        var272.resetMultipleValues();
        final SubLObject var276 = f5195(var244);
        final SubLObject var277 = var272.secondMultipleValue();
        SubLObject var278 = var272.thirdMultipleValue();
        var272.resetMultipleValues();
        if (!var275.eql(var278)) {
            if (NIL != var278) {
                return Values.values((SubLObject)NIL, (SubLObject)$ic199$);
            }
            var278 = var275;
        }
        var273 = Sequences.nreverse(var273);
        SubLObject var279 = var276;
        SubLObject var280 = (SubLObject)NIL;
        var280 = var279.first();
        while (NIL != var279) {
            if (!var280.equal((SubLObject)$ic20$)) {
                if (var280.equal((SubLObject)$ic200$)) {
                    var273 = var273.rest();
                }
                else {
                    var273 = (SubLObject)ConsesLow.cons(var280, var273);
                }
            }
            var279 = var279.rest();
            var280 = var279.first();
        }
        return f5194(Sequences.nreverse(var273), var277, var278);
    }
    
    public static SubLObject f5231(final SubLObject var271, final SubLObject var279) {
        final SubLThread var280 = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var280) && NIL == f5228(var271)) {
            Errors.error((SubLObject)$ic201$, var271);
        }
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var280) && NIL == f5228(var279)) {
            Errors.error((SubLObject)$ic202$, var279, var271);
        }
        return module0038.f2674(var271, f5223(var279), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f5232(final SubLObject var280) {
        final SubLThread var281 = SubLProcess.currentSubLThread();
        if (NIL != Filesys.directory_p(var280)) {
            return (SubLObject)NIL;
        }
        final SubLObject var282 = module0004.f103(var280);
        SubLObject var283 = (SubLObject)NIL;
        var281.resetMultipleValues();
        final SubLObject var284 = f5195(var282);
        final SubLObject var285 = var281.secondMultipleValue();
        final SubLObject var286 = var281.thirdMultipleValue();
        var281.resetMultipleValues();
        var283 = var285;
        return var283;
    }
    
    public static SubLObject f5233(final SubLObject var280) {
        final SubLThread var281 = SubLProcess.currentSubLThread();
        var281.resetMultipleValues();
        final SubLObject var282 = f5234(var280);
        final SubLObject var283 = var281.secondMultipleValue();
        var281.resetMultipleValues();
        return var282;
    }
    
    public static SubLObject f5234(final SubLObject var280) {
        final SubLObject var281 = f5232(var280);
        final SubLObject var282 = Sequences.length(var281);
        final SubLObject var283 = module0038.f2623(var280, (SubLObject)ZERO_INTEGER, Numbers.subtract(Sequences.length(var280), var282));
        return Values.values(var283, var281);
    }
    
    public static SubLObject f5235(final SubLObject var286) {
        final SubLThread var287 = SubLProcess.currentSubLThread();
        if (NIL == module0038.f2653(var286) || NIL == Filesys.probe_file(var286)) {
            PrintLow.format(StreamsLow.$trace_output$.getDynamicValue(var287), (SubLObject)$ic203$, var286);
            return (SubLObject)NIL;
        }
        SubLObject var288 = (SubLObject)NIL;
        SubLObject var289 = (SubLObject)NIL;
        try {
            var289 = compatibility.open_text(var286, (SubLObject)$ic104$);
            if (!var289.isStream()) {
                Errors.error((SubLObject)$ic65$, var286);
            }
            SubLObject var290;
            SubLObject var291;
            for (var290 = var289, var291 = (SubLObject)NIL, var291 = module0038.f2835(var290, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED); var291 != $ic16$ && NIL != var291; var291 = module0038.f2835(var290, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var288 = (SubLObject)ConsesLow.cons(var291, var288);
            }
        }
        finally {
            final SubLObject var292 = Threads.$is_thread_performing_cleanupP$.currentBinding(var287);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var287);
                if (var289.isStream()) {
                    streams_high.close(var289, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var292, var287);
            }
        }
        return Sequences.reverse(var288);
    }
    
    public static SubLObject f5236(final SubLObject var286, final SubLObject var249, SubLObject var288) {
        if (var288 == UNPROVIDED) {
            var288 = (SubLObject)$ic64$;
        }
        SubLObject var289 = (SubLObject)NIL;
        try {
            var289 = compatibility.open_text(var286, var288);
            if (!var289.isStream()) {
                Errors.error((SubLObject)$ic65$, var286);
            }
            final SubLObject var290 = var289;
            SubLObject var291 = var249;
            SubLObject var292 = (SubLObject)NIL;
            var292 = var291.first();
            while (NIL != var291) {
                streams_high.write_string(var292, var290, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                streams_high.terpri(var290);
                var291 = var291.rest();
                var292 = var291.first();
            }
        }
        finally {
            final SubLObject var293 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                if (var289.isStream()) {
                    streams_high.close(var289, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var293);
            }
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f5237(final SubLObject var286, final SubLObject var249) {
        return f5236(var286, var249, (SubLObject)$ic64$);
    }
    
    public static SubLObject f5238(final SubLObject var286, final SubLObject var249) {
        return f5236(var286, var249, (SubLObject)$ic73$);
    }
    
    public static SubLObject f5239(final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        SubLObject var14 = (SubLObject)NIL;
        try {
            final SubLObject var15 = stream_macros.$stream_requires_locking$.currentBinding(var13);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var13);
                var14 = compatibility.open_binary(var12, (SubLObject)$ic64$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var15, var13);
            }
            if (!var14.isStream()) {
                Errors.error((SubLObject)$ic65$, var12);
            }
            final SubLObject var16 = var14;
        }
        finally {
            final SubLObject var17 = Threads.$is_thread_performing_cleanupP$.currentBinding(var13);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var13);
                if (var14.isStream()) {
                    streams_high.close(var14, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var17, var13);
            }
        }
        return var12;
    }
    
    public static SubLObject f5240(final SubLObject var12) {
        if (NIL != Filesys.probe_file(var12)) {
            SubLObject var13 = (SubLObject)NIL;
            final SubLObject var14 = compatibility.open_binary(var12, (SubLObject)$ic104$);
            var13 = streams_high.file_length(var14);
            streams_high.close(var14, (SubLObject)UNPROVIDED);
            return Numbers.zerop(var13);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject ensure_directories_exist(final SubLObject var291) {
        return f5241(f5233(var291), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f5241(final SubLObject var292, SubLObject var293, SubLObject var294) {
        if (var293 == UNPROVIDED) {
            var293 = (SubLObject)NIL;
        }
        if (var294 == UNPROVIDED) {
            var294 = (SubLObject)NIL;
        }
        final SubLThread var295 = SubLProcess.currentSubLThread();
        if (NIL != var294 && !areAssertionsDisabledFor(me) && NIL == Types.stringp(var294)) {
            throw new AssertionError(var294);
        }
        assert NIL != Types.stringp(var292) : var292;
        final SubLObject var296 = module0004.f103(var292);
        SubLObject var297 = (SubLObject)NIL;
        SubLObject var298 = (SubLObject)NIL;
        SubLObject var299 = (SubLObject)NIL;
        var295.resetMultipleValues();
        SubLObject var300 = f5195(var296);
        final SubLObject var301 = var295.secondMultipleValue();
        final SubLObject var302 = var295.thirdMultipleValue();
        var295.resetMultipleValues();
        var298 = var302;
        SubLObject var303;
        var300 = (var303 = module0035.f2084(var301, var300));
        SubLObject var304 = (SubLObject)NIL;
        var304 = var303.first();
        while (NIL != var303) {
            final SubLObject var305 = f5194(var297, var304, var298);
            var297 = module0035.f2084(var304, var297);
            if (NIL == Filesys.directory_p(var305) && (var298 != $ic195$ || NIL == module0038.f2673(var305, (SubLObject)$ic198$, (SubLObject)UNPROVIDED))) {
                if (NIL != Filesys.probe_file(var305)) {
                    if (NIL != var293) {
                        Filesys.delete_file(var305);
                    }
                    else {
                        Errors.error((SubLObject)$ic204$, var305);
                    }
                }
                Filesys.make_directory(var305, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                var299 = (SubLObject)ConsesLow.cons(var305, var299);
            }
            var303 = var303.rest();
            var304 = var303.first();
        }
        if (NIL != var294) {
            var303 = var299;
            SubLObject var306 = (SubLObject)NIL;
            var306 = var303.first();
            while (NIL != var303) {
                f5242(var306, var294);
                var303 = var303.rest();
                var306 = var303.first();
            }
        }
        return Filesys.probe_file(f5194(conses_high.butlast(var297, (SubLObject)UNPROVIDED), conses_high.last(var297, (SubLObject)UNPROVIDED).first(), var298));
    }
    
    public static SubLObject f5227(final SubLObject var303) {
        return module0004.f103(var303);
    }
    
    public static SubLObject f5243(final SubLObject var244) {
        if (NIL == Filesys.directory_p(var244)) {
            return (SubLObject)NIL;
        }
        SubLObject var246;
        final SubLObject var245 = var246 = Filesys.directory(var244, (SubLObject)UNPROVIDED);
        SubLObject var247 = (SubLObject)NIL;
        var247 = var246.first();
        while (NIL != var246) {
            final SubLObject var248 = Sequences.cconcatenate(var244, new SubLObject[] { $ic172$, var247 });
            if (NIL != Filesys.directory_p(var248)) {
                f5243(var248);
            }
            else {
                Filesys.delete_file(var248);
            }
            var246 = var246.rest();
            var247 = var246.first();
        }
        return Filesys.delete_directory(var244, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f5244(final SubLObject var307, final SubLObject var308) {
        if (NIL == Filesys.directory_p(var307)) {
            return (SubLObject)NIL;
        }
        Filesys.make_directory(var308, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var310;
        final SubLObject var309 = var310 = Filesys.directory(var307, (SubLObject)UNPROVIDED);
        SubLObject var311 = (SubLObject)NIL;
        var311 = var310.first();
        while (NIL != var310) {
            final SubLObject var312 = Sequences.cconcatenate(var307, new SubLObject[] { $ic172$, var311 });
            final SubLObject var313 = Sequences.cconcatenate(var308, new SubLObject[] { $ic172$, var311 });
            if (NIL != Filesys.directory_p(var312)) {
                f5244(var312, var313);
            }
            else {
                Filesys.copy_file(var312, var313);
            }
            var310 = var310.rest();
            var311 = var310.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5242(final SubLObject var303, final SubLObject var311) {
        final SubLThread var312 = SubLProcess.currentSubLThread();
        if (NIL == Processes.external_processes_supportedP()) {
            return (SubLObject)NIL;
        }
        return module0060.f4438((SubLObject)$ic205$, (SubLObject)ConsesLow.list(var311, var303), (SubLObject)ZERO_INTEGER, StreamsLow.$null_input$.getDynamicValue(var312), StreamsLow.$null_output$.getDynamicValue(var312), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f5245(final SubLObject var12) {
        assert NIL != Types.stringp(var12) : var12;
        return Filesys.delete_file(var12);
    }
    
    public static SubLObject f5246(final SubLObject var312, final SubLObject var313) {
        assert NIL != Types.stringp(var313) : var313;
        assert NIL != Types.stringp(var312) : var312;
        if (NIL != Processes.external_processes_supportedP()) {
            return module0060.f4438((SubLObject)$ic206$, (SubLObject)ConsesLow.list((SubLObject)$ic207$, var313, var312), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5247(final SubLObject var307, final SubLObject var308) {
        return (SubLObject)makeBoolean(NIL != f5246(var308, var307) || NIL != Filesys.copy_file(var307, var308));
    }
    
    public static SubLObject f5248(final SubLObject var307, final SubLObject var308) {
        final SubLThread var309 = SubLProcess.currentSubLThread();
        SubLObject var310 = (SubLObject)T;
        SubLObject var311 = (SubLObject)NIL;
        try {
            var309.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var312 = Errors.$error_handler$.currentBinding(var309);
            try {
                Errors.$error_handler$.bind((SubLObject)$ic17$, var309);
                try {
                    var310 = Filesys.copy_file(var307, var308);
                }
                catch (Throwable var313) {
                    Errors.handleThrowable(var313, (SubLObject)NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var312, var309);
            }
        }
        catch (Throwable var314) {
            var311 = Errors.handleThrowable(var314, module0003.$g3$.getGlobalValue());
        }
        finally {
            var309.throwStack.pop();
        }
        if (NIL != var310 && NIL == var311) {
            try {
                var309.throwStack.push(module0003.$g3$.getGlobalValue());
                final SubLObject var312 = Errors.$error_handler$.currentBinding(var309);
                try {
                    Errors.$error_handler$.bind((SubLObject)$ic17$, var309);
                    try {
                        var310 = Filesys.delete_file(var307);
                    }
                    catch (Throwable var313) {
                        Errors.handleThrowable(var313, (SubLObject)NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var312, var309);
                }
            }
            catch (Throwable var314) {
                var311 = Errors.handleThrowable(var314, module0003.$g3$.getGlobalValue());
            }
            finally {
                var309.throwStack.pop();
            }
        }
        if (NIL != var311) {
            var310 = (SubLObject)NIL;
        }
        return Values.values(var310, var311);
    }
    
    public static SubLObject f5249(final SubLObject var303) {
        SubLObject var304 = (SubLObject)ZERO_INTEGER;
        if (var303.isString() && NIL != Filesys.probe_file(var303)) {
            SubLObject var305 = (SubLObject)NIL;
            try {
                var305 = compatibility.open_text(var303, (SubLObject)$ic104$);
                if (!var305.isStream()) {
                    Errors.error((SubLObject)$ic65$, var303);
                }
                final SubLObject var11_317 = var305;
                var304 = streams_high.file_length(var11_317);
            }
            finally {
                final SubLObject var306 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                    if (var305.isStream()) {
                        streams_high.close(var305, (SubLObject)UNPROVIDED);
                    }
                }
                finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var306);
                }
            }
        }
        return var304;
    }
    
    public static SubLObject f5250(final SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        try {
            var14 = compatibility.open_text(var12, (SubLObject)$ic104$);
            if (!var14.isStream()) {
                Errors.error((SubLObject)$ic65$, var12);
            }
            final SubLObject var15 = var14;
            if (var15.isStream()) {
                SubLObject var16;
                for (var16 = (SubLObject)NIL, var16 = f5200(var15); NIL != var16; var16 = f5200(var15)) {
                    var13 = (SubLObject)ConsesLow.cons(var16, var13);
                }
            }
        }
        finally {
            final SubLObject var17 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                if (var14.isStream()) {
                    streams_high.close(var14, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var17);
            }
        }
        return Sequences.nreverse(var13);
    }
    
    public static SubLObject f5251(final SubLObject var303) {
        SubLObject var304 = (SubLObject)ZERO_INTEGER;
        if (var303.isString() && NIL != Filesys.probe_file(var303)) {
            SubLObject var305 = (SubLObject)NIL;
            try {
                var305 = compatibility.open_text(var303, (SubLObject)$ic104$);
                if (!var305.isStream()) {
                    Errors.error((SubLObject)$ic65$, var303);
                }
                final SubLObject var306 = var305;
                if (var306.isStream()) {
                    SubLObject var307;
                    for (var307 = (SubLObject)NIL, var307 = f5200(var306); NIL != var307; var307 = f5200(var306)) {
                        var304 = Numbers.add(var304, (SubLObject)ONE_INTEGER);
                    }
                }
            }
            finally {
                final SubLObject var308 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                    if (var305.isStream()) {
                        streams_high.close(var305, (SubLObject)UNPROVIDED);
                    }
                }
                finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var308);
                }
            }
        }
        return var304;
    }
    
    public static SubLObject f5252(final SubLObject var303) {
        final SubLThread var304 = SubLProcess.currentSubLThread();
        SubLObject var305 = (SubLObject)NIL;
        SubLObject var306 = (SubLObject)NIL;
        try {
            var304.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var307 = Errors.$error_handler$.currentBinding(var304);
            try {
                Errors.$error_handler$.bind((SubLObject)$ic17$, var304);
                try {
                    Eval.load(var303);
                    var306 = (SubLObject)T;
                }
                catch (Throwable var308) {
                    Errors.handleThrowable(var308, (SubLObject)NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var307, var304);
            }
        }
        catch (Throwable var309) {
            var305 = Errors.handleThrowable(var309, module0003.$g3$.getGlobalValue());
        }
        finally {
            var304.throwStack.pop();
        }
        return Values.values(var306, var305);
    }
    
    public static SubLObject f5226(final SubLObject var280) {
        final SubLObject var281 = Filesys.probe_file(var280);
        if (NIL != var281) {
            return var281;
        }
        return var280;
    }
    
    public static SubLObject f5253(final SubLObject var322) {
        if (NIL != var322) {
            return f5254(var322);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5254(final SubLObject var322) {
        final SubLThread var323 = SubLProcess.currentSubLThread();
        SubLObject var324 = (SubLObject)NIL;
        try {
            final SubLObject var325 = stream_macros.$stream_requires_locking$.currentBinding(var323);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var323);
                var324 = compatibility.open_text(var322, (SubLObject)$ic64$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var325, var323);
            }
            if (!var324.isStream()) {
                Errors.error((SubLObject)$ic65$, var322);
            }
            final SubLObject var11_324 = var324;
            PrintLow.format(var11_324, (SubLObject)$ic208$);
        }
        finally {
            final SubLObject var326 = Threads.$is_thread_performing_cleanupP$.currentBinding(var323);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var323);
                if (var324.isStream()) {
                    streams_high.close(var324, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var326, var323);
            }
        }
        return var322;
    }
    
    public static SubLObject f5255(final SubLObject var325, SubLObject var244) {
        if (var244 == UNPROVIDED) {
            var244 = (SubLObject)NIL;
        }
        return f5256(var325, var244, (SubLObject)T);
    }
    
    public static SubLObject f5256(final SubLObject var325, SubLObject var244, SubLObject var326) {
        if (var244 == UNPROVIDED) {
            var244 = (SubLObject)NIL;
        }
        if (var326 == UNPROVIDED) {
            var326 = (SubLObject)NIL;
        }
        final SubLObject var327 = Filesys.make_directory(var325, var244, (SubLObject)UNPROVIDED);
        if (NIL != var326 && NIL == var327) {
            Errors.error((SubLObject)$ic209$, var325, var244);
        }
        return var327;
    }
    
    public static SubLObject f5257(final SubLObject var303) {
        return f5255(f5258(var303), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f5258(SubLObject var303) {
        var303 = f5223(var303);
        final SubLObject var304 = module0051.f3556((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var305 = Sequences.cconcatenate(var303, var304);
        return f5223(var305);
    }
    
    public static SubLObject f5259(final SubLObject var12, SubLObject var329) {
        if (var329 == UNPROVIDED) {
            var329 = (SubLObject)T;
        }
        assert NIL != Types.stringp(var12) : var12;
        if (NIL != f5218(var12)) {
            if (NIL != var329) {
                Filesys.delete_file(var12);
                return var12;
            }
            Errors.error((SubLObject)$ic210$, var12);
        }
        return f5241(f5234(var12), var329, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f5260(final SubLObject var244, SubLObject var95, SubLObject var330) {
        if (var95 == UNPROVIDED) {
            var95 = (SubLObject)$ic29$;
        }
        if (var330 == UNPROVIDED) {
            var330 = (SubLObject)$ic211$;
        }
        assert NIL != Types.function_spec_p(var330) : var330;
        final SubLObject var331 = (SubLObject)(($ic29$ == var95) ? $ic212$ : $ic213$);
        final SubLObject var332 = Functions.funcall(var331, var244, (SubLObject)$ic64$);
        if (NIL == streams_high.open_stream_p(var332) || NIL == streams_high.output_stream_p(var332)) {
            Errors.error((SubLObject)$ic214$, var244);
        }
        final SubLObject var333 = f5261(var332, var330);
        return module0083.f5696(var333, (SubLObject)$ic215$, (SubLObject)$ic216$, (SubLObject)$ic217$, (SubLObject)$ic218$, (SubLObject)$ic219$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f5262(final SubLObject var333) {
        f5263(module0083.f5706(var333));
        return var333;
    }
    
    public static SubLObject f5261(final SubLObject var11, final SubLObject var330) {
        final SubLObject var331 = var330.isSymbol() ? Symbols.symbol_function(var330) : var330;
        return (SubLObject)ConsesLow.list((SubLObject)$ic220$, var11, (SubLObject)$ic221$, var331, (SubLObject)$ic222$, (SubLObject)ZERO_INTEGER);
    }
    
    public static SubLObject f5264(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic223$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic223$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic223$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic223$);
        var8 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic223$);
        var9 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var10;
            var4 = (var10 = var5);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic121$, (SubLObject)ConsesLow.list((SubLObject)$ic224$, var7, var8, var9), var6, ConsesLow.append(var10, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic223$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5265(final SubLObject var332, final SubLObject var140) {
        return conses_high.putf(var332, (SubLObject)$ic222$, var140);
    }
    
    public static SubLObject f5266(final SubLObject var332) {
        return f5265(var332, (SubLObject)ZERO_INTEGER);
    }
    
    public static SubLObject f5267(final SubLObject var332) {
        return conses_high.getf(var332, (SubLObject)$ic220$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f5268(final SubLObject var332) {
        final SubLObject var333 = f5267(var332);
        streams_high.file_position(var333, (SubLObject)ZERO_INTEGER);
        return f5266(var332);
    }
    
    public static SubLObject f5269(final SubLObject var332, final SubLObject var339) {
        SubLObject var340 = (SubLObject)NIL;
        SubLObject var341 = var332;
        SubLObject var342 = (SubLObject)NIL;
        SubLObject var345_346 = (SubLObject)NIL;
        while (NIL != var341) {
            cdestructuring_bind.destructuring_bind_must_consp(var341, var332, (SubLObject)$ic225$);
            var345_346 = var341.first();
            var341 = var341.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var341, var332, (SubLObject)$ic225$);
            if (NIL == conses_high.member(var345_346, (SubLObject)$ic226$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var342 = (SubLObject)T;
            }
            if (var345_346 == $ic38$) {
                var340 = var341.first();
            }
            var341 = var341.rest();
        }
        if (NIL != var342 && NIL == var340) {
            cdestructuring_bind.cdestructuring_bind_error(var332, (SubLObject)$ic225$);
        }
        final SubLObject var343 = cdestructuring_bind.property_list_member((SubLObject)$ic220$, var332);
        final SubLObject var344 = (SubLObject)((NIL != var343) ? conses_high.cadr(var343) : NIL);
        final SubLObject var345 = cdestructuring_bind.property_list_member((SubLObject)$ic221$, var332);
        final SubLObject var346 = (SubLObject)((NIL != var345) ? conses_high.cadr(var345) : NIL);
        final SubLObject var347 = cdestructuring_bind.property_list_member((SubLObject)$ic222$, var332);
        final SubLObject var348 = (SubLObject)((NIL != var347) ? conses_high.cadr(var347) : NIL);
        Functions.funcall(var346, var339, var344);
        return f5265(var332, Numbers.add(var348, (SubLObject)ONE_INTEGER));
    }
    
    public static SubLObject f5270(final SubLObject var332) {
        SubLObject var333 = (SubLObject)NIL;
        SubLObject var334 = var332;
        SubLObject var335 = (SubLObject)NIL;
        SubLObject var355_356 = (SubLObject)NIL;
        while (NIL != var334) {
            cdestructuring_bind.destructuring_bind_must_consp(var334, var332, (SubLObject)$ic225$);
            var355_356 = var334.first();
            var334 = var334.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var334, var332, (SubLObject)$ic225$);
            if (NIL == conses_high.member(var355_356, (SubLObject)$ic226$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var335 = (SubLObject)T;
            }
            if (var355_356 == $ic38$) {
                var333 = var334.first();
            }
            var334 = var334.rest();
        }
        if (NIL != var335 && NIL == var333) {
            cdestructuring_bind.cdestructuring_bind_error(var332, (SubLObject)$ic225$);
        }
        final SubLObject var336 = cdestructuring_bind.property_list_member((SubLObject)$ic220$, var332);
        final SubLObject var337 = (SubLObject)((NIL != var336) ? conses_high.cadr(var336) : NIL);
        final SubLObject var338 = cdestructuring_bind.property_list_member((SubLObject)$ic221$, var332);
        final SubLObject var339 = (SubLObject)((NIL != var338) ? conses_high.cadr(var338) : NIL);
        final SubLObject var340 = cdestructuring_bind.property_list_member((SubLObject)$ic222$, var332);
        final SubLObject var341 = (SubLObject)((NIL != var340) ? conses_high.cadr(var340) : NIL);
        return var341;
    }
    
    public static SubLObject f5271(final SubLObject var332, final SubLObject var360) {
        return Errors.error((SubLObject)$ic227$, var332);
    }
    
    public static SubLObject f5272(final SubLObject var332) {
        return Errors.error((SubLObject)$ic228$, var332);
    }
    
    public static SubLObject f5263(final SubLObject var332) {
        final SubLObject var333 = f5267(var332);
        streams_high.close(var333, (SubLObject)UNPROVIDED);
        return var332;
    }
    
    public static SubLObject f5273(final SubLObject var361, final SubLObject var362, final SubLObject var363, SubLObject var364) {
        if (var364 == UNPROVIDED) {
            var364 = streams_high.file_length(var361);
        }
        final SubLThread var365 = SubLProcess.currentSubLThread();
        SubLObject var366 = var363;
        compatibility.set_file_position(var361, var363);
        while (var366.numL(var364)) {
            final SubLObject var367 = streams_high.read_byte(var361, (SubLObject)NIL, (SubLObject)$ic16$);
            if (var367.isFixnum()) {
                var365.resetMultipleValues();
                final SubLObject var368 = module0037.f2584(var367);
                final SubLObject var369 = var365.secondMultipleValue();
                var365.resetMultipleValues();
                print_high.princ(var368, var362);
                print_high.princ(var369, var362);
            }
            var366 = Numbers.add(var366, (SubLObject)ONE_INTEGER);
        }
        return var362;
    }
    
    public static SubLObject f5274(final SubLObject var11, final SubLObject var363, SubLObject var364) {
        if (var364 == UNPROVIDED) {
            var364 = streams_high.file_length(var11);
        }
        SubLObject var365 = (SubLObject)NIL;
        SubLObject var366 = (SubLObject)NIL;
        try {
            var366 = streams_high.make_private_string_output_stream();
            f5273(var11, var366, var363, var364);
            var365 = streams_high.get_output_stream_string(var366);
        }
        finally {
            final SubLObject var367 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                streams_high.close(var366, (SubLObject)UNPROVIDED);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var367);
            }
        }
        return var365;
    }
    
    public static SubLObject f5275(final SubLObject var369) {
        final SubLThread var370 = SubLProcess.currentSubLThread();
        final SubLObject var371 = f5182($g1138$.getGlobalValue());
        SubLObject var372 = (SubLObject)NIL;
        try {
            SubLObject var373 = (SubLObject)NIL;
            try {
                final SubLObject var374 = stream_macros.$stream_requires_locking$.currentBinding(var370);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var370);
                    var373 = compatibility.open_binary(var371, (SubLObject)$ic64$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var374, var370);
                }
                if (!var373.isStream()) {
                    Errors.error((SubLObject)$ic65$, var371);
                }
                final SubLObject var375 = var373;
                final SubLObject var376 = module0021.f1031();
                try {
                    SubLObject var377 = var369;
                    SubLObject var378 = (SubLObject)NIL;
                    var378 = var377.first();
                    while (NIL != var377) {
                        module0021.f1038(var378, var376);
                        module0021.f1038(var378, var375);
                        var377 = var377.rest();
                        var378 = var377.first();
                    }
                    var372 = module0021.f1029(var376);
                }
                finally {
                    final SubLObject var379 = Threads.$is_thread_performing_cleanupP$.currentBinding(var370);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var370);
                        module0021.f1034(var376);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var379, var370);
                    }
                }
            }
            finally {
                final SubLObject var380 = Threads.$is_thread_performing_cleanupP$.currentBinding(var370);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var370);
                    if (var373.isStream()) {
                        streams_high.close(var373, (SubLObject)UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var380, var370);
                }
            }
            SubLObject var374_375 = (SubLObject)NIL;
            try {
                final SubLObject var381 = stream_macros.$stream_requires_locking$.currentBinding(var370);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var370);
                    var374_375 = compatibility.open_binary(var371, (SubLObject)$ic104$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var381, var370);
                }
                if (!var374_375.isStream()) {
                    Errors.error((SubLObject)$ic65$, var371);
                }
                final SubLObject var382 = var374_375;
                final SubLObject var383 = Numbers.integerDivide(Sequences.length(var372), (SubLObject)TWO_INTEGER);
                SubLObject var384;
                SubLObject var385;
                SubLObject var386;
                SubLObject var387;
                SubLObject var388;
                SubLObject var389;
                SubLObject var390;
                SubLObject var391;
                for (var384 = Numbers.max((SubLObject)ONE_INTEGER, Numbers.integerDivide(var383, (SubLObject)THREE_INTEGER)), var385 = (SubLObject)NIL, var385 = (SubLObject)ZERO_INTEGER; var385.numL(var384); var385 = Numbers.add(var385, (SubLObject)ONE_INTEGER)) {
                    var386 = var385;
                    var387 = Numbers.subtract(var383, var385);
                    var388 = f5274(var382, var386, var387);
                    var389 = Numbers.multiply(var386, (SubLObject)TWO_INTEGER);
                    var390 = Numbers.multiply(var387, (SubLObject)TWO_INTEGER);
                    var391 = module0038.f2623(var372, var389, var390);
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var370) && NIL == Strings.string_equal(var388, var391, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        Errors.error((SubLObject)$ic237$, new SubLObject[] { var391, var386, var387, var372, var388 });
                    }
                }
            }
            finally {
                final SubLObject var392 = Threads.$is_thread_performing_cleanupP$.currentBinding(var370);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var370);
                    if (var374_375.isStream()) {
                        streams_high.close(var374_375, (SubLObject)UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var392, var370);
                }
            }
        }
        finally {
            final SubLObject var393 = Threads.$is_thread_performing_cleanupP$.currentBinding(var370);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var370);
                SubLObject var394 = (SubLObject)NIL;
                try {
                    var370.throwStack.push($ic62$);
                    final SubLObject var31_384 = Errors.$error_handler$.currentBinding(var370);
                    try {
                        Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic63$), var370);
                        try {
                            Filesys.delete_file(var371);
                        }
                        catch (Throwable var395) {
                            Errors.handleThrowable(var395, (SubLObject)NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(var31_384, var370);
                    }
                }
                catch (Throwable var396) {
                    var394 = Errors.handleThrowable(var396, (SubLObject)$ic62$);
                    var370.throwStack.pop();
                }
                finally {
                    var370.throwStack.pop();
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var393, var370);
            }
        }
        return (SubLObject)$ic238$;
    }
    
    public static SubLObject f5276(final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        try {
            final SubLObject var16 = stream_macros.$stream_requires_locking$.currentBinding(var13);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var13);
                var15 = compatibility.open_binary(var12, (SubLObject)$ic104$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var16, var13);
            }
            if (!var15.isStream()) {
                Errors.error((SubLObject)$ic65$, var12);
            }
            final SubLObject var17 = var15;
            var14 = f5274(var17, (SubLObject)ZERO_INTEGER, (SubLObject)UNPROVIDED);
        }
        finally {
            final SubLObject var18 = Threads.$is_thread_performing_cleanupP$.currentBinding(var13);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var13);
                if (var15.isStream()) {
                    streams_high.close(var15, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var18, var13);
            }
        }
        return var14;
    }
    
    public static SubLObject f5277(final SubLObject var368, final SubLObject var12) {
        final SubLThread var369 = SubLProcess.currentSubLThread();
        SubLObject var370 = (SubLObject)NIL;
        SubLObject var371 = (SubLObject)NIL;
        SubLObject var372 = (SubLObject)NIL;
        try {
            final SubLObject var373 = stream_macros.$stream_requires_locking$.currentBinding(var369);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var369);
                var372 = compatibility.open_binary(var12, (SubLObject)$ic64$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var373, var369);
            }
            if (!var372.isStream()) {
                Errors.error((SubLObject)$ic65$, var12);
            }
            final SubLObject var374 = var372;
            SubLObject var90_389;
            SubLObject var375;
            SubLObject var376;
            SubLObject var377;
            SubLObject var378;
            for (var375 = (var90_389 = Sequences.length(var368)), var376 = (SubLObject)NIL, var376 = (SubLObject)ZERO_INTEGER; !var376.numGE(var90_389); var376 = module0048.f_1X(var376)) {
                var377 = Strings.sublisp_char(var368, var376);
                if (NIL != module0038.f2791(var377)) {
                    if (NIL == var371) {
                        var371 = var377;
                    }
                    else {
                        var378 = module0037.f2588(var371, var377);
                        streams_high.write_byte(var378, var374);
                        var371 = (SubLObject)NIL;
                    }
                }
            }
            streams_high.force_output(var374);
            var370 = streams_high.file_length(var374);
        }
        finally {
            final SubLObject var379 = Threads.$is_thread_performing_cleanupP$.currentBinding(var369);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var369);
                if (var372.isStream()) {
                    streams_high.close(var372, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var379, var369);
            }
        }
        return var370;
    }
    
    public static SubLObject f5278(final SubLObject var392) {
        if (NIL == streams_high.output_stream_p(var392)) {
            return (SubLObject)$ic104$;
        }
        if (NIL != streams_high.input_stream_p(var392)) {
            return (SubLObject)$ic31$;
        }
        return (SubLObject)$ic64$;
    }
    
    public static SubLObject f5279(final SubLObject var393, final SubLObject var394) {
        final SubLThread var395 = SubLProcess.currentSubLThread();
        if (NIL != streams_high.output_stream_p(var393)) {
            streams_high.force_output(var393);
        }
        final SubLObject var396 = streams_high.file_position(var393, (SubLObject)UNPROVIDED);
        final SubLObject var397 = module0038.f2624(Filesys.probe_file(var393));
        final SubLObject var398 = streams_high.stream_element_type(var393);
        final SubLObject var399 = f5278(var393);
        SubLObject var400 = (SubLObject)NIL;
        streams_high.close(var393, (SubLObject)UNPROVIDED);
        final SubLObject var401 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(var395);
        final SubLObject var402 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(var395);
        try {
            StreamsLow.$stream_initial_input_buffer_size$.bind(var394, var395);
            StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(var395), var395);
            if ($ic29$ == var398) {
                var400 = StreamsLow.open(var397, new SubLObject[] { $ic30$, var399, $ic32$, $ic73$, $ic33$, $ic239$, $ic35$, $ic29$ });
            }
            else {
                var400 = StreamsLow.open(var397, new SubLObject[] { $ic30$, var399, $ic32$, $ic73$, $ic33$, $ic239$, $ic35$, $ic68$ });
            }
        }
        finally {
            StreamsLow.$stream_initial_output_buffer_size$.rebind(var402, var395);
            StreamsLow.$stream_initial_input_buffer_size$.rebind(var401, var395);
        }
        streams_high.file_position(var400, var396);
        return var400;
    }
    
    public static SubLObject f5280(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)$ic240$, reader.bq_cons((SubLObject)$ic54$, ConsesLow.append(var5, (SubLObject)NIL)));
    }
    
    public static SubLObject f5281(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)$ic241$, reader.bq_cons((SubLObject)$ic54$, ConsesLow.append(var5, (SubLObject)NIL)));
    }
    
    public static SubLObject f5282(final SubLObject var392) {
        return StreamsLow.isMemoryMappedStream(var392);
    }
    
    public static SubLObject f5283(final SubLObject var393) {
        final SubLThread var394 = SubLProcess.currentSubLThread();
        if (NIL == streams_high.open_stream_p(var393)) {
            return var393;
        }
        if (NIL != f5282(var393)) {
            return var393;
        }
        if (NIL != streams_high.output_stream_p(var393)) {
            streams_high.force_output(var393);
        }
        final SubLObject var395 = streams_high.file_position(var393, (SubLObject)UNPROVIDED);
        final SubLObject var396 = module0038.f2624(Filesys.probe_file(var393));
        final SubLObject var397 = streams_high.stream_element_type(var393);
        final SubLObject var398 = f5278(var393);
        SubLObject var399 = (SubLObject)NIL;
        streams_high.close(var393, (SubLObject)UNPROVIDED);
        final SubLObject var400 = StreamsLow.$should_memory_map_files$.currentBinding(var394);
        try {
            StreamsLow.$should_memory_map_files$.bind((SubLObject)T, var394);
            if ($ic29$ == var397) {
                var399 = StreamsLow.open(var396, new SubLObject[] { $ic30$, var398, $ic32$, $ic73$, $ic33$, $ic239$, $ic35$, $ic29$ });
            }
            else {
                var399 = StreamsLow.open(var396, new SubLObject[] { $ic30$, var398, $ic32$, $ic73$, $ic33$, $ic239$, $ic35$, $ic68$ });
            }
        }
        finally {
            StreamsLow.$should_memory_map_files$.rebind(var400, var394);
        }
        streams_high.file_position(var399, var395);
        return var399;
    }
    
    public static SubLObject f5284() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0075", "f5164", "S#6776");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0075", "f5165", "S#6777");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0075", "f5166", "S#6778");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0075", "f5167", "S#6779");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0075", "f5168", "S#6780");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5169", "S#6781", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5170", "S#6782", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5171", "S#6783", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5172", "S#6784", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5173", "S#6785", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5174", "S#6786", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5175", "CYC-HOME-FILENAME", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5177", "S#6787", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5178", "S#329", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5176", "S#6788", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5179", "S#6789", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5180", "S#6790", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5181", "S#6791", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5182", "S#6792", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5183", "S#6793", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5184", "MAKE-UNUSED-TEMP-FILENAME", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5185", "S#6794", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5186", "S#6795", 0, 2, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0075", "f5187", "S#6796");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0075", "f5188", "S#6797");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0075", "f5189", "S#6798");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5190", "S#6799", 0, 2, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0075", "f5191", "S#6800");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5192", "S#6801", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5193", "S#6802", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5196", "S#6803", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5197", "S#6804", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5198", "S#6805", 2, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0075", "f5199", "S#6806");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5200", "S#6807", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0075", "f5201", "S#6808");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5202", "S#6809", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0075", "f5203", "S#6810");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5204", "S#6811", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0075", "f5205", "S#6812");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0075", "f5206", "S#6813");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0075", "f5207", "S#6814");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0075", "f5208", "S#6815");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0075", "f5209", "S#6816");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0075", "f5210", "S#6817");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0075", "f5211", "S#6818");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5212", "S#6819", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5213", "S#6820", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5214", "S#6821", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5215", "S#6822", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5216", "S#6823", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5217", "S#6824", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5218", "S#6825", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5219", "S#6826", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5220", "S#6827", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5221", "S#6828", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5222", "S#6829", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5223", "S#2682", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5225", "S#6830", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5228", "S#6831", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5224", "S#6832", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5229", "S#6833", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5195", "S#6834", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5194", "S#6835", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5230", "S#6836", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5231", "S#6837", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5232", "S#4571", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5233", "S#6838", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5234", "S#2680", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5235", "S#5862", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5236", "S#6839", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5237", "S#6840", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5238", "S#6841", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5239", "S#6842", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5240", "S#6843", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "ensure_directories_exist", "ENSURE-DIRECTORIES-EXIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5241", "S#6844", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5227", "S#6845", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5243", "S#6846", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5244", "S#6847", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5242", "S#6848", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5245", "S#6849", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5246", "S#6850", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5247", "S#6851", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5248", "S#6852", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5249", "S#6853", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5250", "S#6854", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5251", "S#6855", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5252", "S#6856", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5226", "S#6857", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5253", "S#6858", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5254", "S#6859", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5255", "S#6860", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5256", "S#6861", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5257", "S#6862", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5258", "S#6863", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5259", "S#6864", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5260", "S#6865", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5262", "S#6866", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5261", "S#6867", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0075", "f5264", "S#6868");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5265", "S#6869", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5266", "S#6870", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5267", "S#6871", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5268", "S#6872", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5269", "S#6873", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5270", "S#6874", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5271", "S#6875", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5272", "S#6876", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5263", "S#6877", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5273", "S#6878", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5274", "S#6879", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5275", "S#6880", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5276", "S#6881", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5277", "S#6882", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5278", "S#6883", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5279", "S#6884", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0075", "f5280", "S#6885");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0075", "f5281", "S#6886");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5282", "S#6887", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0075", "f5283", "S#6888", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5285() {
        $g1138$ = SubLFiles.deflexical("S#6889", module0073.f5143((SubLObject)($ic22$.isSymbol() ? Symbols.symbol_value((SubLObject)$ic22$) : $ic22$), (SubLObject)$ic23$, (SubLObject)($ic24$.isSymbol() ? Symbols.symbol_value((SubLObject)$ic24$) : $ic24$), (SubLObject)$ic25$, (SubLObject)UNPROVIDED));
        $g1139$ = SubLFiles.deflexical("S#6890", (SubLObject)$ic26$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5286() {
        module0002.f35((SubLObject)$ic39$, (SubLObject)$ic56$);
        module0002.f50((SubLObject)$ic78$, (SubLObject)$ic81$);
        module0002.f50((SubLObject)$ic91$, (SubLObject)$ic87$);
        module0027.f1449((SubLObject)$ic229$, (SubLObject)ConsesLow.list(new SubLObject[] { $ic230$, NIL, $ic231$, NIL, $ic232$, NIL, $ic233$, $ic234$, $ic235$, T }), (SubLObject)$ic236$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f5284();
    }
    
    public void initializeVariables() {
        f5285();
    }
    
    public void runTopLevelForms() {
        f5286();
    }
    
    static {
        me = (SubLFile)new module0075();
        $g1138$ = null;
        $g1139$ = null;
        $ic0$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#1534", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic1$ = makeSymbol("CLET");
        $ic2$ = makeSymbol("*STREAM-INITIAL-INPUT-BUFFER-SIZE*");
        $ic3$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("*STREAM-INITIAL-OUTPUT-BUFFER-SIZE*"), (SubLObject)makeSymbol("*STREAM-INITIAL-INPUT-BUFFER-SIZE*")));
        $ic4$ = ConsesLow.list((SubLObject)makeSymbol("IGNORE"), (SubLObject)makeSymbol("*STREAM-INITIAL-INPUT-BUFFER-SIZE*"), (SubLObject)makeSymbol("*STREAM-INITIAL-OUTPUT-BUFFER-SIZE*"));
        $ic5$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("STREAM"), (SubLObject)makeSymbol("S#885", "CYC"), (SubLObject)makeSymbol("S#5432", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic6$ = makeUninternedSymbol("US#2150FF3");
        $ic7$ = makeSymbol("PIF");
        $ic8$ = makeSymbol("WITH-TEXT-FILE");
        $ic9$ = ConsesLow.list((SubLObject)NIL);
        $ic10$ = makeUninternedSymbol("US#2150FF3");
        $ic11$ = makeSymbol("WITH-PRIVATE-TEXT-FILE");
        $ic12$ = makeUninternedSymbol("US#2150FF3");
        $ic13$ = makeSymbol("WITH-BINARY-FILE");
        $ic14$ = makeUninternedSymbol("US#2150FF3");
        $ic15$ = makeSymbol("WITH-PRIVATE-BINARY-FILE");
        $ic16$ = makeKeyword("EOF");
        $ic17$ = makeSymbol("S#38", "CYC");
        $ic18$ = makeSymbol("LISTP");
        $ic19$ = makeString("");
        $ic20$ = makeString(".");
        $ic21$ = makeSymbol("STRINGP");
        $ic22$ = ConsesLow.list((SubLObject)makeString("rck.please.put.this.in.the.right.place"));
        $ic23$ = makeSymbol("S#6889", "CYC");
        $ic24$ = makeString("/tmp/");
        $ic25$ = makeKeyword("LEXICAL");
        $ic26$ = makeString("0123456789abcdefghijklmnopqrstuvwxyz");
        $ic27$ = makeInteger(36);
        $ic28$ = makeString("tmp");
        $ic29$ = makeKeyword("TEXT");
        $ic30$ = makeKeyword("DIRECTION");
        $ic31$ = makeKeyword("IO");
        $ic32$ = makeKeyword("IF-EXISTS");
        $ic33$ = makeKeyword("IF-DOES-NOT-EXIST");
        $ic34$ = makeKeyword("CREATE");
        $ic35$ = makeKeyword("ELEMENT-TYPE");
        $ic36$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("STREAM"), (SubLObject)makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#6891", "CYC"), (SubLObject)makeKeyword("TEXT"))), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic37$ = ConsesLow.list((SubLObject)makeKeyword("ELEMENT-TYPE"));
        $ic38$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic39$ = makeSymbol("S#6799", "CYC");
        $ic40$ = makeSymbol("CUNWIND-PROTECT");
        $ic41$ = makeSymbol("PWHEN");
        $ic42$ = makeSymbol("STREAMP");
        $ic43$ = makeSymbol("DELETE-FILE");
        $ic44$ = makeSymbol("CLOSE");
        $ic45$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("STREAM"), (SubLObject)makeSymbol("S#885", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#6891", "CYC"), (SubLObject)makeKeyword("TEXT"))), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic46$ = makeSymbol("FORCE-OUTPUT");
        $ic47$ = makeSymbol("PROBE-FILE");
        $ic48$ = makeSymbol("S#6892", "CYC");
        $ic49$ = makeSymbol("S#746", "CYC");
        $ic50$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#885", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("DIRECTORY"), (SubLObject)makeSymbol("S#6889", "CYC"))), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic51$ = ConsesLow.list((SubLObject)makeKeyword("DIRECTORY"));
        $ic52$ = makeKeyword("DIRECTORY");
        $ic53$ = makeSymbol("S#6792", "CYC");
        $ic54$ = makeSymbol("PROGN");
        $ic55$ = makeSymbol("IGNORE-ERRORS");
        $ic56$ = ConsesLow.list((SubLObject)makeSymbol("S#6795", "CYC"));
        $ic57$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("STREAM"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#6891", "CYC"), (SubLObject)makeKeyword("TEXT"))), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic58$ = makeSymbol("S#6800", "CYC");
        $ic59$ = ConsesLow.list((SubLObject)makeSymbol("S#6796", "CYC"));
        $ic60$ = makeSymbol("S#6796", "CYC");
        $ic61$ = makeSymbol("INTEGERP");
        $ic62$ = makeKeyword("IGNORE-ERRORS-TARGET");
        $ic63$ = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic64$ = makeKeyword("OUTPUT");
        $ic65$ = makeString("Unable to open ~S");
        $ic66$ = makeSymbol("READ-CHAR");
        $ic67$ = makeSymbol("WRITE-CHAR");
        $ic68$ = makeKeyword("BINARY");
        $ic69$ = makeKeyword("DEFAULT");
        $ic70$ = makeSymbol("READ-BYTE");
        $ic71$ = makeSymbol("WRITE-BYTE");
        $ic72$ = makeString("~S is not a valid mode.");
        $ic73$ = makeKeyword("APPEND");
        $ic74$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("S#2813", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic75$ = makeUninternedSymbol("US#52B2EDB");
        $ic76$ = ConsesLow.list((SubLObject)makeKeyword("INPUT"));
        $ic77$ = makeSymbol("CDO");
        $ic78$ = makeSymbol("S#6807", "CYC");
        $ic79$ = makeSymbol("COR");
        $ic80$ = makeSymbol("NULL");
        $ic81$ = makeSymbol("S#6806", "CYC");
        $ic82$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#6893", "CYC"), (SubLObject)makeSymbol("STREAM"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#6894", "CYC"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic83$ = ConsesLow.list((SubLObject)makeKeyword("LINE-NUMBER"), (SubLObject)makeKeyword("DONE"));
        $ic84$ = makeKeyword("LINE-NUMBER");
        $ic85$ = makeKeyword("DONE");
        $ic86$ = makeUninternedSymbol("US#23AA01E");
        $ic87$ = makeSymbol("S#6808", "CYC");
        $ic88$ = makeUninternedSymbol("US#4E0B20C");
        $ic89$ = makeSymbol("SYMBOLP");
        $ic90$ = makeSymbol("1+");
        $ic91$ = makeSymbol("S#6809", "CYC");
        $ic92$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#6893", "CYC"), (SubLObject)makeSymbol("S#2813", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#6894", "CYC"), (SubLObject)makeSymbol("S#130", "CYC"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic93$ = ConsesLow.list((SubLObject)makeKeyword("LINE-NUMBER"), (SubLObject)makeKeyword("PROGRESS-MESSAGE"), (SubLObject)makeKeyword("DONE"));
        $ic94$ = makeKeyword("PROGRESS-MESSAGE");
        $ic95$ = makeUninternedSymbol("US#113B606");
        $ic96$ = makeUninternedSymbol("US#4E0B20C");
        $ic97$ = makeUninternedSymbol("US#113B606");
        $ic98$ = makeUninternedSymbol("US#4E0B20C");
        $ic99$ = makeUninternedSymbol("US#4A50089");
        $ic100$ = makeSymbol("NOTING-PERCENT-PROGRESS");
        $ic101$ = makeSymbol("FILE-LENGTH");
        $ic102$ = makeSymbol("NOTE-PERCENT-PROGRESS");
        $ic103$ = makeSymbol("FILE-POSITION");
        $ic104$ = makeKeyword("INPUT");
        $ic105$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#6895", "CYC"), (SubLObject)makeSymbol("S#2813", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#6896", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("LIST"), (SubLObject)Characters.CHAR_comma))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#6897", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("LIST"), (SubLObject)makeString("\""), (SubLObject)makeString("\""))))), (SubLObject)makeSymbol("S#6898", "CYC"), (SubLObject)makeSymbol("S#6899", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#6900", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("LIST"), (SubLObject)Characters.CHAR_backslash)))), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic106$ = ConsesLow.list((SubLObject)makeKeyword("BREAK-LIST"), (SubLObject)makeKeyword("EMBED-LIST"), (SubLObject)makeKeyword("INCLUDE-STOPS"), (SubLObject)makeKeyword("IGNORE-EMPTY-STRINGS"), (SubLObject)makeKeyword("QUOTE-CHARS"));
        $ic107$ = makeKeyword("BREAK-LIST");
        $ic108$ = ConsesLow.list((SubLObject)makeSymbol("LIST"), (SubLObject)Characters.CHAR_comma);
        $ic109$ = makeKeyword("EMBED-LIST");
        $ic110$ = ConsesLow.list((SubLObject)makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("LIST"), (SubLObject)makeString("\""), (SubLObject)makeString("\"")));
        $ic111$ = makeKeyword("INCLUDE-STOPS");
        $ic112$ = makeKeyword("IGNORE-EMPTY-STRINGS");
        $ic113$ = makeKeyword("QUOTE-CHARS");
        $ic114$ = ConsesLow.list((SubLObject)makeSymbol("LIST"), (SubLObject)Characters.CHAR_backslash);
        $ic115$ = makeUninternedSymbol("US#52660D5");
        $ic116$ = makeSymbol("S#6810", "CYC");
        $ic117$ = makeSymbol("S#4195", "CYC");
        $ic118$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#2813", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#6896", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("MAPCAR"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)makeSymbol("S#746", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#4140", "CYC"))))), (SubLObject)makeSymbol("S#6897", "CYC"), (SubLObject)makeSymbol("S#6898", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#6899", "CYC"), (SubLObject)T), (SubLObject)makeSymbol("S#6900", "CYC")), (SubLObject)makeSymbol("S#1983", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic119$ = ConsesLow.list((SubLObject)makeSymbol("MAPCAR"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)makeSymbol("S#746", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#4140", "CYC")));
        $ic120$ = makeUninternedSymbol("US#52660D5");
        $ic121$ = makeSymbol("CDESTRUCTURING-BIND");
        $ic122$ = makeSymbol("MAPCAR");
        $ic123$ = ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)makeSymbol("READ-FROM-STRING"));
        $ic124$ = makeUninternedSymbol("US#52660D5");
        $ic125$ = makeUninternedSymbol("US#4F54438");
        $ic126$ = makeUninternedSymbol("US#4EC6600");
        $ic127$ = ConsesLow.list((SubLObject)ZERO_INTEGER);
        $ic128$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)NIL));
        $ic129$ = makeSymbol("WHILE");
        $ic130$ = makeSymbol("<");
        $ic131$ = makeSymbol("LENGTH");
        $ic132$ = makeSymbol("CMULTIPLE-VALUE-BIND");
        $ic133$ = ConsesLow.list((SubLObject)makeSymbol("S#143", "CYC"), (SubLObject)makeSymbol("S#6901", "CYC"));
        $ic134$ = makeSymbol("READ-FROM-STRING");
        $ic135$ = makeSymbol("CPUSH");
        $ic136$ = makeSymbol("S#143", "CYC");
        $ic137$ = makeSymbol("CSETQ");
        $ic138$ = ConsesLow.list((SubLObject)makeSymbol("S#6901", "CYC"));
        $ic139$ = makeSymbol("NREVERSE");
        $ic140$ = makeSymbol("PUNLESS");
        $ic141$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#6902", "CYC"), (SubLObject)makeSymbol("S#2813", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#6903", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)makeSymbol("S#4151", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#6904", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)makeSymbol("FALSE")))), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic142$ = makeSymbol("S#4151", "CYC");
        $ic143$ = makeSymbol("FALSE");
        $ic144$ = makeUninternedSymbol("US#70B218F");
        $ic145$ = makeUninternedSymbol("US#52660D5");
        $ic146$ = makeSymbol("INPUT-STREAM-P");
        $ic147$ = makeSymbol("S#4158", "CYC");
        $ic148$ = ConsesLow.list((SubLObject)NIL, (SubLObject)NIL);
        $ic149$ = makeSymbol("FUNCALL");
        $ic150$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#6905", "CYC"), (SubLObject)makeSymbol("DIRECTORY"), (SubLObject)makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#6906", "CYC"), (SubLObject)T), (SubLObject)makeSymbol("S#130", "CYC"), (SubLObject)makeSymbol("S#127", "CYC"), (SubLObject)makeSymbol("S#6907", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic151$ = ConsesLow.list((SubLObject)makeKeyword("INCLUDE-DIRECTORY?"), (SubLObject)makeKeyword("PROGRESS-MESSAGE"), (SubLObject)makeKeyword("DONE"), (SubLObject)makeKeyword("SORT-FN"));
        $ic152$ = makeKeyword("INCLUDE-DIRECTORY?");
        $ic153$ = makeKeyword("SORT-FN");
        $ic154$ = makeUninternedSymbol("US#76B99C0");
        $ic155$ = makeUninternedSymbol("US#2BAAEA1");
        $ic156$ = makeSymbol("CHECK-TYPE");
        $ic157$ = ConsesLow.list((SubLObject)makeSymbol("DIRECTORY-P"));
        $ic158$ = makeSymbol("DIRECTORY");
        $ic159$ = makeSymbol("*SILENT-PROGRESS?*");
        $ic160$ = makeSymbol("CNOT");
        $ic161$ = makeSymbol("FUNCTION-SPEC-P");
        $ic162$ = makeSymbol("SORT");
        $ic163$ = makeSymbol("S#480", "CYC");
        $ic164$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#6908", "CYC"), (SubLObject)makeSymbol("DIRECTORY"), (SubLObject)makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#6906", "CYC"), (SubLObject)T)), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic165$ = ConsesLow.list((SubLObject)makeKeyword("INCLUDE-DIRECTORY?"));
        $ic166$ = makeSymbol("S#6816", "CYC");
        $ic167$ = makeSymbol("DIRECTORY-P");
        $ic168$ = makeSymbol("S#534", "CYC");
        $ic169$ = makeSymbol("ENDS-WITH");
        $ic170$ = ConsesLow.list((SubLObject)makeString("/"));
        $ic171$ = makeSymbol("CCONCATENATE");
        $ic172$ = makeString("/");
        $ic173$ = makeSymbol("S#3993", "CYC");
        $ic174$ = ConsesLow.list((SubLObject)Characters.CHAR_slash);
        $ic175$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#6905", "CYC"), (SubLObject)makeSymbol("DIRECTORY"), (SubLObject)makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#6906", "CYC"), (SubLObject)T), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#130", "CYC"), (SubLObject)makeString("Processing directory tree files..."))), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic176$ = ConsesLow.list((SubLObject)makeKeyword("INCLUDE-DIRECTORY?"), (SubLObject)makeKeyword("PROGRESS-MESSAGE"));
        $ic177$ = makeString("Processing directory tree files...");
        $ic178$ = makeUninternedSymbol("US#2A839A");
        $ic179$ = makeUninternedSymbol("US#608C54A");
        $ic180$ = makeSymbol("LIST");
        $ic181$ = makeSymbol("FIRST");
        $ic182$ = makeSymbol("CPOP");
        $ic183$ = makeSymbol("FWHEN");
        $ic184$ = makeSymbol("S#176", "CYC");
        $ic185$ = makeString("~% Directory: ~S");
        $ic186$ = makeSymbol("SECOND");
        $ic187$ = makeSymbol("FILE-WRITE-DATE");
        $ic188$ = makeString("\\");
        $ic189$ = ConsesLow.list((SubLObject)makeString("/"), (SubLObject)makeString("\\"));
        $ic190$ = makeString("Could not find ~A");
        $ic191$ = makeString("Could not find ~A~A");
        $ic192$ = makeString("File not found.");
        $ic193$ = makeString("File not found from directory ~A");
        $ic194$ = makeKeyword("UNIX");
        $ic195$ = makeKeyword("DOS");
        $ic196$ = makeString("\\\\");
        $ic197$ = makeKeyword("MAC");
        $ic198$ = makeString(":");
        $ic199$ = makeString("Path type mismatch.");
        $ic200$ = makeString("..");
        $ic201$ = makeString("Cannot make relative path ~A even more relative ....");
        $ic202$ = makeString("Cannot strip non-absolute prefix ~A from path ~A.");
        $ic203$ = makeString("Warning: unable to read file ~s~%");
        $ic204$ = makeString("make-directory-recursive: could not create ~A since it exists as a file.");
        $ic205$ = makeString("chmod");
        $ic206$ = makeString("ln");
        $ic207$ = makeString("-s");
        $ic208$ = makeString("I'm alive!~%");
        $ic209$ = makeString("Could not make directory ~a with path ~a");
        $ic210$ = makeString("File already exists: ~A~%");
        $ic211$ = makeSymbol("PRINT");
        $ic212$ = makeSymbol("OPEN-TEXT");
        $ic213$ = makeSymbol("OPEN-BINARY");
        $ic214$ = makeString("Cannot open ~A for writing.~%");
        $ic215$ = makeSymbol("S#6872", "CYC");
        $ic216$ = makeSymbol("S#6873", "CYC");
        $ic217$ = makeSymbol("S#6874", "CYC");
        $ic218$ = makeSymbol("S#6875", "CYC");
        $ic219$ = makeSymbol("S#6876", "CYC");
        $ic220$ = makeKeyword("STREAM");
        $ic221$ = makeKeyword("WRITER");
        $ic222$ = makeKeyword("ITEM-COUNT");
        $ic223$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#3266", "CYC"), (SubLObject)makeSymbol("STREAM"), (SubLObject)makeSymbol("S#6909", "CYC"), (SubLObject)makeSymbol("S#6910", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic224$ = makeSymbol("&KEY");
        $ic225$ = ConsesLow.list((SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("STREAM"), (SubLObject)makeSymbol("S#6909", "CYC"), (SubLObject)makeSymbol("S#6910", "CYC"));
        $ic226$ = ConsesLow.list((SubLObject)makeKeyword("STREAM"), (SubLObject)makeKeyword("WRITER"), (SubLObject)makeKeyword("ITEM-COUNT"));
        $ic227$ = makeString("Operation not supported for file accumulator ~A.");
        $ic228$ = makeString("Operation not yet supported for file accumulator ~A");
        $ic229$ = makeSymbol("S#6880", "CYC");
        $ic230$ = makeKeyword("TEST");
        $ic231$ = makeKeyword("OWNER");
        $ic232$ = makeKeyword("CLASSES");
        $ic233$ = makeKeyword("KB");
        $ic234$ = makeKeyword("TINY");
        $ic235$ = makeKeyword("WORKING?");
        $ic236$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("abc"), (SubLObject)makeInteger(123), (SubLObject)ConsesLow.list((SubLObject)ONE_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)THREE_INTEGER))), (SubLObject)makeKeyword("SUCCESS")));
        $ic237$ = makeString("Expected ~S, which is [~A,~A) of ~S, got ~S back.");
        $ic238$ = makeKeyword("SUCCESS");
        $ic239$ = makeKeyword("ERROR");
        $ic240$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("*SHOULD-MEMORY-MAP-FILES?*", "SUBLISP"), (SubLObject)T));
        $ic241$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("*SHOULD-MEMORY-MAP-FILES?*", "SUBLISP")));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 1009 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/