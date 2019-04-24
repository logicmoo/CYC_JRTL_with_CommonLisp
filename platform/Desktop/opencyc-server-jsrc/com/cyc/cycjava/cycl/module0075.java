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
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0075.$ic0$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0075.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0075.$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        if (module0075.NIL == var4) {
            final SubLObject var7;
            var4 = (var7 = var5);
            return (SubLObject)ConsesLow.listS((SubLObject)module0075.$ic1$, reader.bq_cons((SubLObject)ConsesLow.list((SubLObject)module0075.$ic2$, var6), (SubLObject)module0075.$ic3$), (SubLObject)module0075.$ic4$, ConsesLow.append(var7, (SubLObject)module0075.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0075.$ic0$);
        return (SubLObject)module0075.NIL;
    }
    
    public static SubLObject f5165(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0075.$ic5$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0075.NIL;
        SubLObject var7 = (SubLObject)module0075.NIL;
        SubLObject var8 = (SubLObject)module0075.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0075.$ic5$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0075.$ic5$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0075.$ic5$);
        var8 = var4.first();
        var4 = var4.rest();
        if (module0075.NIL == var4) {
            final SubLObject var9;
            var4 = (var9 = var5);
            final SubLObject var10 = (SubLObject)module0075.$ic6$;
            return (SubLObject)ConsesLow.list((SubLObject)module0075.$ic1$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var10, var7)), (SubLObject)ConsesLow.list((SubLObject)module0075.$ic7$, var10, (SubLObject)ConsesLow.listS((SubLObject)module0075.$ic8$, (SubLObject)ConsesLow.list(var6, var10, var8), ConsesLow.append(var9, (SubLObject)module0075.NIL)), (SubLObject)ConsesLow.listS((SubLObject)module0075.$ic1$, (SubLObject)ConsesLow.list(reader.bq_cons(var6, (SubLObject)module0075.$ic9$)), ConsesLow.append(var9, (SubLObject)module0075.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0075.$ic5$);
        return (SubLObject)module0075.NIL;
    }
    
    public static SubLObject f5166(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0075.$ic5$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0075.NIL;
        SubLObject var7 = (SubLObject)module0075.NIL;
        SubLObject var8 = (SubLObject)module0075.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0075.$ic5$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0075.$ic5$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0075.$ic5$);
        var8 = var4.first();
        var4 = var4.rest();
        if (module0075.NIL == var4) {
            final SubLObject var9;
            var4 = (var9 = var5);
            final SubLObject var10 = (SubLObject)module0075.$ic10$;
            return (SubLObject)ConsesLow.list((SubLObject)module0075.$ic1$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var10, var7)), (SubLObject)ConsesLow.list((SubLObject)module0075.$ic7$, var10, (SubLObject)ConsesLow.listS((SubLObject)module0075.$ic11$, (SubLObject)ConsesLow.list(var6, var10, var8), ConsesLow.append(var9, (SubLObject)module0075.NIL)), (SubLObject)ConsesLow.listS((SubLObject)module0075.$ic1$, (SubLObject)ConsesLow.list(reader.bq_cons(var6, (SubLObject)module0075.$ic9$)), ConsesLow.append(var9, (SubLObject)module0075.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0075.$ic5$);
        return (SubLObject)module0075.NIL;
    }
    
    public static SubLObject f5167(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0075.$ic5$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0075.NIL;
        SubLObject var7 = (SubLObject)module0075.NIL;
        SubLObject var8 = (SubLObject)module0075.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0075.$ic5$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0075.$ic5$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0075.$ic5$);
        var8 = var4.first();
        var4 = var4.rest();
        if (module0075.NIL == var4) {
            final SubLObject var9;
            var4 = (var9 = var5);
            final SubLObject var10 = (SubLObject)module0075.$ic12$;
            return (SubLObject)ConsesLow.list((SubLObject)module0075.$ic1$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var10, var7)), (SubLObject)ConsesLow.list((SubLObject)module0075.$ic7$, var10, (SubLObject)ConsesLow.listS((SubLObject)module0075.$ic13$, (SubLObject)ConsesLow.list(var6, var10, var8), ConsesLow.append(var9, (SubLObject)module0075.NIL)), (SubLObject)ConsesLow.listS((SubLObject)module0075.$ic1$, (SubLObject)ConsesLow.list(reader.bq_cons(var6, (SubLObject)module0075.$ic9$)), ConsesLow.append(var9, (SubLObject)module0075.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0075.$ic5$);
        return (SubLObject)module0075.NIL;
    }
    
    public static SubLObject f5168(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0075.$ic5$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0075.NIL;
        SubLObject var7 = (SubLObject)module0075.NIL;
        SubLObject var8 = (SubLObject)module0075.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0075.$ic5$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0075.$ic5$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0075.$ic5$);
        var8 = var4.first();
        var4 = var4.rest();
        if (module0075.NIL == var4) {
            final SubLObject var9;
            var4 = (var9 = var5);
            final SubLObject var10 = (SubLObject)module0075.$ic14$;
            return (SubLObject)ConsesLow.list((SubLObject)module0075.$ic1$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var10, var7)), (SubLObject)ConsesLow.list((SubLObject)module0075.$ic7$, var10, (SubLObject)ConsesLow.listS((SubLObject)module0075.$ic15$, (SubLObject)ConsesLow.list(var6, var10, var8), ConsesLow.append(var9, (SubLObject)module0075.NIL)), (SubLObject)ConsesLow.listS((SubLObject)module0075.$ic1$, (SubLObject)ConsesLow.list(reader.bq_cons(var6, (SubLObject)module0075.$ic9$)), ConsesLow.append(var9, (SubLObject)module0075.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0075.$ic5$);
        return (SubLObject)module0075.NIL;
    }
    
    public static SubLObject f5169(SubLObject var11, SubLObject var24, SubLObject var25) {
        if (var11 == module0075.UNPROVIDED) {
            var11 = StreamsLow.$standard_input$.getDynamicValue();
        }
        if (var24 == module0075.UNPROVIDED) {
            var24 = (SubLObject)module0075.T;
        }
        if (var25 == module0075.UNPROVIDED) {
            var25 = (SubLObject)module0075.NIL;
        }
        final SubLObject var26 = streams_high.peek_char((SubLObject)module0075.NIL, var11, (SubLObject)module0075.NIL, (SubLObject)module0075.$ic16$, (SubLObject)module0075.UNPROVIDED);
        if (module0075.$ic16$ != var26) {
            return Characters.char_code(var26);
        }
        if (module0075.NIL == var24) {
            return var25;
        }
        return streams_high.peek_char((SubLObject)module0075.NIL, var11, (SubLObject)module0075.T, var25, (SubLObject)module0075.UNPROVIDED);
    }
    
    public static SubLObject f5170(SubLObject var11, SubLObject var24, SubLObject var25) {
        if (var11 == module0075.UNPROVIDED) {
            var11 = StreamsLow.$standard_input$.getDynamicValue();
        }
        if (var24 == module0075.UNPROVIDED) {
            var24 = (SubLObject)module0075.T;
        }
        if (var25 == module0075.UNPROVIDED) {
            var25 = (SubLObject)module0075.NIL;
        }
        final SubLObject var26 = streams_high.read_char(var11, (SubLObject)module0075.NIL, (SubLObject)module0075.$ic16$, (SubLObject)module0075.UNPROVIDED);
        if (module0075.$ic16$ != var26) {
            return Characters.char_code(var26);
        }
        if (module0075.NIL == var24) {
            return var25;
        }
        return streams_high.read_char(var11, (SubLObject)module0075.T, var25, (SubLObject)module0075.UNPROVIDED);
    }
    
    public static SubLObject f5171(final SubLObject var27, SubLObject var11) {
        if (var11 == module0075.UNPROVIDED) {
            var11 = StreamsLow.$standard_input$.getDynamicValue();
        }
        final SubLObject var28 = Characters.code_char(var27);
        return streams_high.unread_char(var28, var11);
    }
    
    public static SubLObject f5172(final SubLObject var27, SubLObject var11) {
        if (var11 == module0075.UNPROVIDED) {
            var11 = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLObject var28 = Characters.code_char(var27);
        return streams_high.write_char(var28, var11);
    }
    
    public static SubLObject f5173(final SubLObject var28) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var28.isStream() || var28 == module0075.T || var28 == module0075.NIL);
    }
    
    public static SubLObject f5174(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        SubLObject var30 = (SubLObject)module0075.NIL;
        try {
            var29.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var31 = Errors.$error_handler$.currentBinding(var29);
            try {
                Errors.$error_handler$.bind((SubLObject)module0075.$ic17$, var29);
                try {
                    Filesys.probe_file(var28);
                }
                catch (Throwable var32) {
                    Errors.handleThrowable(var32, (SubLObject)module0075.NIL);
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
        if (var35 == module0075.UNPROVIDED) {
            var35 = (SubLObject)module0075.NIL;
        }
        assert module0075.NIL != Types.listp(var34) : var34;
        return f5176(module0011.$g34$.getGlobalValue(), Filesys.construct_filename(var34, var12, var35, (SubLObject)module0075.T), (SubLObject)module0075.UNPROVIDED);
    }
    
    public static SubLObject f5177(final SubLObject var34) {
        assert module0075.NIL != Types.listp(var34) : var34;
        return f5176(module0011.$g34$.getGlobalValue(), Filesys.construct_filename(var34, (SubLObject)module0075.$ic19$, (SubLObject)module0075.NIL, (SubLObject)module0075.T), (SubLObject)module0075.UNPROVIDED);
    }
    
    public static SubLObject f5178() {
        return module0038.f2624(Filesys.probe_file((SubLObject)module0075.$ic20$));
    }
    
    public static SubLObject f5176(final SubLObject var36, final SubLObject var12, SubLObject var35) {
        if (var35 == module0075.UNPROVIDED) {
            var35 = (SubLObject)module0075.NIL;
        }
        assert module0075.NIL != Types.stringp(var36) : var36;
        return Sequences.cconcatenate(var36, f5179(var12, var35));
    }
    
    public static SubLObject f5179(final SubLObject var12, SubLObject var35) {
        if (var35 == module0075.UNPROVIDED) {
            var35 = (SubLObject)module0075.NIL;
        }
        if (module0075.NIL == var35) {
            return var12;
        }
        return Filesys.construct_filename((SubLObject)module0075.NIL, var12, var35, (SubLObject)module0075.T);
    }
    
    public static SubLObject f5180() {
        return module0075.$g1138$.getGlobalValue();
    }
    
    public static SubLObject f5181() {
        return Strings.sublisp_char(module0075.$g1139$.getGlobalValue(), random.random((SubLObject)module0075.$ic27$));
    }
    
    public static SubLObject f5182(SubLObject var36) {
        if (var36 == module0075.UNPROVIDED) {
            var36 = module0075.$g1138$.getGlobalValue();
        }
        assert module0075.NIL != Types.stringp(var36) : var36;
        final SubLObject var37 = f5183((SubLObject)module0075.EIGHT_INTEGER);
        return f5176(var36, var37, (SubLObject)module0075.$ic28$);
    }
    
    public static SubLObject f5183(SubLObject var37) {
        if (var37 == module0075.UNPROVIDED) {
            var37 = (SubLObject)module0075.EIGHT_INTEGER;
        }
        final SubLObject var38 = Strings.make_string(var37, (SubLObject)Characters.CHAR_space);
        SubLObject var39;
        for (var39 = (SubLObject)module0075.NIL, var39 = (SubLObject)module0075.ZERO_INTEGER; var39.numL(var37); var39 = Numbers.add(var39, (SubLObject)module0075.ONE_INTEGER)) {
            Strings.set_char(var38, var39, f5181());
        }
        return var38;
    }
    
    public static SubLObject f5184(SubLObject var36) {
        if (var36 == module0075.UNPROVIDED) {
            var36 = module0075.$g1138$.getGlobalValue();
        }
        SubLObject var37;
        for (var37 = (SubLObject)module0075.NIL; module0075.NIL == var37 || module0075.NIL != Filesys.probe_file(var37); var37 = Strings.string_downcase(f5182(var36), (SubLObject)module0075.UNPROVIDED, (SubLObject)module0075.UNPROVIDED)) {}
        return var37;
    }
    
    public static SubLObject f5185(final SubLObject var40, SubLObject var36) {
        if (var36 == module0075.UNPROVIDED) {
            var36 = module0075.$g1138$.getGlobalValue();
        }
        assert module0075.NIL != Types.stringp(var36) : var36;
        final SubLObject var41 = f5183((SubLObject)module0075.EIGHT_INTEGER);
        final SubLObject var42 = Sequences.cconcatenate(var40, var41);
        return f5176(var36, var42, (SubLObject)module0075.$ic28$);
    }
    
    public static SubLObject f5186(SubLObject var42, SubLObject var43) {
        if (var42 == module0075.UNPROVIDED) {
            var42 = (SubLObject)module0075.$ic29$;
        }
        if (var43 == module0075.UNPROVIDED) {
            var43 = module0075.$g1138$.getGlobalValue();
        }
        SubLObject var44;
        for (var44 = (SubLObject)module0075.NIL; module0075.NIL == var44; var44 = StreamsLow.open(f5182(var43), new SubLObject[] { module0075.$ic30$, module0075.$ic31$, module0075.$ic32$, module0075.NIL, module0075.$ic33$, module0075.$ic34$, module0075.$ic35$, var42 })) {}
        return var44;
    }
    
    public static SubLObject f5187(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0075.$ic36$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0075.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0075.$ic36$);
        var6 = var4.first();
        var4 = var4.rest();
        SubLObject var7 = (SubLObject)module0075.NIL;
        SubLObject var8 = var4;
        SubLObject var9 = (SubLObject)module0075.NIL;
        SubLObject var50_51 = (SubLObject)module0075.NIL;
        while (module0075.NIL != var8) {
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)module0075.$ic36$);
            var50_51 = var8.first();
            var8 = var8.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)module0075.$ic36$);
            if (module0075.NIL == conses_high.member(var50_51, (SubLObject)module0075.$ic37$, (SubLObject)module0075.UNPROVIDED, (SubLObject)module0075.UNPROVIDED)) {
                var9 = (SubLObject)module0075.T;
            }
            if (var50_51 == module0075.$ic38$) {
                var7 = var8.first();
            }
            var8 = var8.rest();
        }
        if (module0075.NIL != var9 && module0075.NIL == var7) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0075.$ic36$);
        }
        final SubLObject var10 = cdestructuring_bind.property_list_member((SubLObject)module0075.$ic35$, var4);
        final SubLObject var11 = (SubLObject)((module0075.NIL != var10) ? conses_high.cadr(var10) : module0075.$ic29$);
        final SubLObject var12;
        var4 = (var12 = var5);
        return (SubLObject)ConsesLow.list((SubLObject)module0075.$ic1$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)module0075.$ic39$, var11))), reader.bq_cons((SubLObject)module0075.$ic40$, ConsesLow.append(var12, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0075.$ic41$, (SubLObject)ConsesLow.list((SubLObject)module0075.$ic42$, var6), (SubLObject)ConsesLow.list((SubLObject)module0075.$ic43$, var6), (SubLObject)ConsesLow.list((SubLObject)module0075.$ic44$, var6))))));
    }
    
    public static SubLObject f5188(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0075.$ic45$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0075.NIL;
        SubLObject var7 = (SubLObject)module0075.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0075.$ic45$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0075.$ic45$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)module0075.NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)module0075.NIL;
        SubLObject var59_60 = (SubLObject)module0075.NIL;
        while (module0075.NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0075.$ic45$);
            var59_60 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0075.$ic45$);
            if (module0075.NIL == conses_high.member(var59_60, (SubLObject)module0075.$ic37$, (SubLObject)module0075.UNPROVIDED, (SubLObject)module0075.UNPROVIDED)) {
                var10 = (SubLObject)module0075.T;
            }
            if (var59_60 == module0075.$ic38$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (module0075.NIL != var10 && module0075.NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0075.$ic45$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)module0075.$ic35$, var4);
        final SubLObject var12 = (SubLObject)((module0075.NIL != var11) ? conses_high.cadr(var11) : module0075.$ic29$);
        final SubLObject var13;
        var4 = (var13 = var5);
        return (SubLObject)ConsesLow.list((SubLObject)module0075.$ic1$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)module0075.$ic39$, var12))), reader.bq_cons((SubLObject)module0075.$ic40$, ConsesLow.append(var13, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0075.$ic41$, (SubLObject)ConsesLow.list((SubLObject)module0075.$ic42$, var6), (SubLObject)ConsesLow.list((SubLObject)module0075.$ic46$, var6), (SubLObject)ConsesLow.list((SubLObject)module0075.$ic41$, (SubLObject)ConsesLow.list((SubLObject)module0075.$ic47$, var7), (SubLObject)ConsesLow.list((SubLObject)module0075.$ic43$, var7)), (SubLObject)ConsesLow.list((SubLObject)module0075.$ic48$, (SubLObject)ConsesLow.list((SubLObject)module0075.$ic49$, (SubLObject)ConsesLow.list((SubLObject)module0075.$ic47$, var6)), var7), (SubLObject)ConsesLow.list((SubLObject)module0075.$ic43$, var6), (SubLObject)ConsesLow.list((SubLObject)module0075.$ic44$, var6))))));
    }
    
    public static SubLObject f5189(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0075.$ic50$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0075.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0075.$ic50$);
        var6 = var4.first();
        var4 = var4.rest();
        SubLObject var7 = (SubLObject)module0075.NIL;
        SubLObject var8 = var4;
        SubLObject var9 = (SubLObject)module0075.NIL;
        SubLObject var68_69 = (SubLObject)module0075.NIL;
        while (module0075.NIL != var8) {
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)module0075.$ic50$);
            var68_69 = var8.first();
            var8 = var8.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)module0075.$ic50$);
            if (module0075.NIL == conses_high.member(var68_69, (SubLObject)module0075.$ic51$, (SubLObject)module0075.UNPROVIDED, (SubLObject)module0075.UNPROVIDED)) {
                var9 = (SubLObject)module0075.T;
            }
            if (var68_69 == module0075.$ic38$) {
                var7 = var8.first();
            }
            var8 = var8.rest();
        }
        if (module0075.NIL != var9 && module0075.NIL == var7) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0075.$ic50$);
        }
        final SubLObject var10 = cdestructuring_bind.property_list_member((SubLObject)module0075.$ic52$, var4);
        final SubLObject var11 = (module0075.NIL != var10) ? conses_high.cadr(var10) : module0075.$g1138$.getGlobalValue();
        final SubLObject var12;
        var4 = (var12 = var5);
        return (SubLObject)ConsesLow.list((SubLObject)module0075.$ic1$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)module0075.$ic53$, var11))), (SubLObject)ConsesLow.list((SubLObject)module0075.$ic40$, reader.bq_cons((SubLObject)module0075.$ic54$, ConsesLow.append(var12, (SubLObject)module0075.NIL)), (SubLObject)ConsesLow.list((SubLObject)module0075.$ic55$, (SubLObject)ConsesLow.list((SubLObject)module0075.$ic43$, var6))));
    }
    
    public static SubLObject f5190(SubLObject var42, SubLObject var43) {
        if (var42 == module0075.UNPROVIDED) {
            var42 = (SubLObject)module0075.$ic29$;
        }
        if (var43 == module0075.UNPROVIDED) {
            var43 = module0075.$g1138$.getGlobalValue();
        }
        return f5186(var42, var43);
    }
    
    public static SubLObject f5191(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0075.$ic57$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0075.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0075.$ic57$);
        var6 = var4.first();
        var4 = var4.rest();
        final SubLObject var7 = (SubLObject)(var4.isCons() ? var4.first() : module0075.$ic29$);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0075.$ic57$);
        var4 = var4.rest();
        if (module0075.NIL == var4) {
            final SubLObject var8;
            var4 = (var8 = var5);
            module0002.f37((SubLObject)module0075.$ic58$, (SubLObject)module0075.$ic59$);
            return (SubLObject)ConsesLow.listS((SubLObject)module0075.$ic60$, (SubLObject)ConsesLow.list(var6, (SubLObject)module0075.$ic35$, var7), ConsesLow.append(var8, (SubLObject)module0075.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0075.$ic57$);
        return (SubLObject)module0075.NIL;
    }
    
    public static SubLObject f5192(final SubLObject var36, SubLObject var74) {
        if (var74 == module0075.UNPROVIDED) {
            var74 = (SubLObject)module0075.ZERO_INTEGER;
        }
        final SubLThread var75 = SubLProcess.currentSubLThread();
        assert module0075.NIL != Types.stringp(var36) : var36;
        assert module0075.NIL != Types.integerp(var74) : var74;
        if (module0075.NIL == Filesys.directory_p(var36)) {
            return (SubLObject)module0075.NIL;
        }
        final SubLObject var76 = f5182(var36);
        SubLObject var77 = (SubLObject)module0075.NIL;
        SubLObject var78 = (SubLObject)module0075.NIL;
        SubLObject var79 = (SubLObject)module0075.NIL;
        SubLObject var80 = (SubLObject)module0075.NIL;
        try {
            var75.throwStack.push(module0075.$ic62$);
            final SubLObject var81 = Errors.$error_handler$.currentBinding(var75);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)module0075.$ic63$), var75);
                try {
                    try {
                        SubLObject var82 = (SubLObject)module0075.NIL;
                        try {
                            var82 = compatibility.open_binary(var76, (SubLObject)module0075.$ic64$);
                            if (!var82.isStream()) {
                                Errors.error((SubLObject)module0075.$ic65$, var76);
                            }
                            final SubLObject var83 = var82;
                            var77 = (SubLObject)module0075.T;
                            var78 = (SubLObject)module0075.T;
                        }
                        finally {
                            final SubLObject var31_82 = Threads.$is_thread_performing_cleanupP$.currentBinding(var75);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0075.T, var75);
                                if (var82.isStream()) {
                                    streams_high.close(var82, (SubLObject)module0075.UNPROVIDED);
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
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0075.T, var75);
                            if (module0075.NIL != var77) {
                                if (module0075.NIL != var78) {
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
                    Errors.handleThrowable(var84, (SubLObject)module0075.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var81, var75);
            }
        }
        catch (Throwable var85) {
            var80 = Errors.handleThrowable(var85, (SubLObject)module0075.$ic62$);
        }
        finally {
            var75.throwStack.pop();
        }
        return var79;
    }
    
    public static SubLObject f5193(final SubLObject var84) {
        final SubLThread var85 = SubLProcess.currentSubLThread();
        SubLObject var86 = (SubLObject)module0075.NIL;
        if (var84.isString()) {
            SubLObject var87 = (SubLObject)module0075.NIL;
            try {
                var85.throwStack.push(module0075.$ic62$);
                final SubLObject var88 = Errors.$error_handler$.currentBinding(var85);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)module0075.$ic63$), var85);
                    try {
                        if (module0075.NIL != Filesys.probe_file(var84) || module0075.NIL != f5192(f5194(f5195(var84), (SubLObject)module0075.$ic19$, (SubLObject)module0075.UNPROVIDED), (SubLObject)module0075.UNPROVIDED)) {
                            var86 = (SubLObject)module0075.T;
                        }
                    }
                    catch (Throwable var89) {
                        Errors.handleThrowable(var89, (SubLObject)module0075.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var88, var85);
                }
            }
            catch (Throwable var90) {
                var87 = Errors.handleThrowable(var90, (SubLObject)module0075.$ic62$);
            }
            finally {
                var85.throwStack.pop();
            }
        }
        return var86;
    }
    
    public static SubLObject f5196(final SubLObject var12) {
        if (module0075.NIL != Filesys.probe_file(var12)) {
            return Filesys.delete_file(var12);
        }
        return (SubLObject)module0075.NIL;
    }
    
    public static SubLObject f5197(final SubLObject var12) {
        final SubLObject var14;
        final SubLObject var13 = var14 = Sequences.copy_seq(var12);
        SubLObject var90_91;
        SubLObject var15;
        SubLObject var16;
        SubLObject var17;
        for (var15 = (var90_91 = Sequences.length(var14)), var16 = (SubLObject)module0075.NIL, var16 = (SubLObject)module0075.ZERO_INTEGER; !var16.numGE(var90_91); var16 = module0048.f_1X(var16)) {
            var17 = Strings.sublisp_char(var14, var16);
            if (module0075.NIL == Characters.alphanumericp(var17)) {
                Strings.set_char(var13, var16, (SubLObject)Characters.CHAR_hyphen);
            }
        }
        return var13;
    }
    
    public static SubLObject f5198(final SubLObject var93, final SubLObject var94, SubLObject var95) {
        if (var95 == module0075.UNPROVIDED) {
            var95 = (SubLObject)module0075.$ic29$;
        }
        SubLObject var96 = (SubLObject)module0075.NIL;
        SubLObject var97 = (SubLObject)module0075.NIL;
        final SubLObject var98 = var95;
        if (var98.eql((SubLObject)module0075.$ic29$)) {
            var96 = Symbols.symbol_function((SubLObject)module0075.$ic66$);
            var97 = Symbols.symbol_function((SubLObject)module0075.$ic67$);
        }
        else if (var98.eql((SubLObject)module0075.$ic68$) || var98.eql((SubLObject)module0075.$ic69$)) {
            var96 = Symbols.symbol_function((SubLObject)module0075.$ic70$);
            var97 = Symbols.symbol_function((SubLObject)module0075.$ic71$);
        }
        else {
            Errors.error((SubLObject)module0075.$ic72$, var95);
        }
        SubLObject var99 = (SubLObject)module0075.NIL;
        try {
            final SubLObject var100;
            var99 = (var100 = StreamsLow.open(var93, new SubLObject[] { module0075.$ic35$, var95, module0075.$ic33$, module0075.NIL }));
            if (module0075.NIL != var100) {
                SubLObject var101_102 = (SubLObject)module0075.NIL;
                try {
                    final SubLObject var101;
                    var101_102 = (var101 = StreamsLow.open(var94, new SubLObject[] { module0075.$ic30$, module0075.$ic64$, module0075.$ic32$, module0075.$ic73$, module0075.$ic35$, var95, module0075.$ic33$, module0075.$ic34$ }));
                    SubLObject var102;
                    for (var102 = (SubLObject)module0075.NIL, var102 = Functions.funcall(var96, var100, (SubLObject)module0075.NIL, (SubLObject)module0075.NIL); module0075.NIL != var102; var102 = Functions.funcall(var96, var100, (SubLObject)module0075.NIL, (SubLObject)module0075.NIL)) {
                        Functions.funcall(var97, var102, var101);
                    }
                }
                finally {
                    final SubLObject var103 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                    try {
                        Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0075.T);
                        if (module0075.NIL != var101_102) {
                            streams_high.close(var101_102, (SubLObject)module0075.UNPROVIDED);
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
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0075.T);
                if (module0075.NIL != var99) {
                    streams_high.close(var99, (SubLObject)module0075.UNPROVIDED);
                }
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var104);
            }
        }
        return (SubLObject)module0075.NIL;
    }
    
    public static SubLObject f5199(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0075.$ic74$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0075.NIL;
        SubLObject var7 = (SubLObject)module0075.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0075.$ic74$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0075.$ic74$);
        var7 = var4.first();
        var4 = var4.rest();
        final SubLObject var8 = (SubLObject)(var4.isCons() ? var4.first() : module0075.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0075.$ic74$);
        var4 = var4.rest();
        if (module0075.NIL == var4) {
            final SubLObject var9;
            var4 = (var9 = var5);
            final SubLObject var10 = (SubLObject)module0075.$ic75$;
            return (SubLObject)ConsesLow.list((SubLObject)module0075.$ic8$, (SubLObject)ConsesLow.listS(var10, var7, (SubLObject)module0075.$ic76$), (SubLObject)ConsesLow.list((SubLObject)module0075.$ic41$, (SubLObject)ConsesLow.list((SubLObject)module0075.$ic42$, var10), (SubLObject)ConsesLow.listS((SubLObject)module0075.$ic77$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)module0075.$ic78$, var10), (SubLObject)ConsesLow.list((SubLObject)module0075.$ic78$, var10))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0075.$ic79$, (SubLObject)ConsesLow.list((SubLObject)module0075.$ic80$, var6), var8)), ConsesLow.append(var9, (SubLObject)module0075.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0075.$ic74$);
        return (SubLObject)module0075.NIL;
    }
    
    public static SubLObject f5200(final SubLObject var111) {
        return module0038.f2835(var111, (SubLObject)module0075.NIL, (SubLObject)module0075.NIL, (SubLObject)module0075.T);
    }
    
    public static SubLObject f5201(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0075.$ic82$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0075.NIL;
        SubLObject var7 = (SubLObject)module0075.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0075.$ic82$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0075.$ic82$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)module0075.NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)module0075.NIL;
        SubLObject var119_120 = (SubLObject)module0075.NIL;
        while (module0075.NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0075.$ic82$);
            var119_120 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0075.$ic82$);
            if (module0075.NIL == conses_high.member(var119_120, (SubLObject)module0075.$ic83$, (SubLObject)module0075.UNPROVIDED, (SubLObject)module0075.UNPROVIDED)) {
                var10 = (SubLObject)module0075.T;
            }
            if (var119_120 == module0075.$ic38$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (module0075.NIL != var10 && module0075.NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0075.$ic82$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)module0075.$ic84$, var4);
        final SubLObject var12 = (SubLObject)((module0075.NIL != var11) ? conses_high.cadr(var11) : module0075.NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)module0075.$ic85$, var4);
        final SubLObject var14 = (SubLObject)((module0075.NIL != var13) ? conses_high.cadr(var13) : module0075.NIL);
        final SubLObject var15;
        var4 = (var15 = var5);
        if (module0075.NIL == var12) {
            final SubLObject var16 = (SubLObject)module0075.$ic86$;
            return (SubLObject)ConsesLow.listS((SubLObject)module0075.$ic87$, (SubLObject)ConsesLow.list(var6, var7, (SubLObject)module0075.$ic84$, var16, (SubLObject)module0075.$ic85$, var14), ConsesLow.append(var15, (SubLObject)module0075.NIL));
        }
        final SubLObject var17 = (SubLObject)module0075.$ic88$;
        assert module0075.NIL != Types.symbolp(var12) : var12;
        return (SubLObject)ConsesLow.list((SubLObject)module0075.$ic1$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var17, var7)), (SubLObject)ConsesLow.listS((SubLObject)module0075.$ic77$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var12, (SubLObject)module0075.ZERO_INTEGER, (SubLObject)ConsesLow.list((SubLObject)module0075.$ic90$, var12)), (SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)module0075.$ic91$, var17), (SubLObject)ConsesLow.list((SubLObject)module0075.$ic91$, var17))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0075.$ic79$, var14, (SubLObject)ConsesLow.list((SubLObject)module0075.$ic80$, var6))), ConsesLow.append(var15, (SubLObject)module0075.NIL)));
    }
    
    public static SubLObject f5202(final SubLObject var11) {
        return module0038.f2835(var11, (SubLObject)module0075.NIL, (SubLObject)module0075.NIL, (SubLObject)module0075.T);
    }
    
    public static SubLObject f5203(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0075.$ic92$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0075.NIL;
        SubLObject var7 = (SubLObject)module0075.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0075.$ic92$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0075.$ic92$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)module0075.NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)module0075.NIL;
        SubLObject var132_133 = (SubLObject)module0075.NIL;
        while (module0075.NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0075.$ic92$);
            var132_133 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0075.$ic92$);
            if (module0075.NIL == conses_high.member(var132_133, (SubLObject)module0075.$ic93$, (SubLObject)module0075.UNPROVIDED, (SubLObject)module0075.UNPROVIDED)) {
                var10 = (SubLObject)module0075.T;
            }
            if (var132_133 == module0075.$ic38$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (module0075.NIL != var10 && module0075.NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0075.$ic92$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)module0075.$ic84$, var4);
        final SubLObject var12 = (SubLObject)((module0075.NIL != var11) ? conses_high.cadr(var11) : module0075.NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)module0075.$ic94$, var4);
        final SubLObject var14 = (SubLObject)((module0075.NIL != var13) ? conses_high.cadr(var13) : module0075.NIL);
        final SubLObject var15 = cdestructuring_bind.property_list_member((SubLObject)module0075.$ic85$, var4);
        final SubLObject var16 = (SubLObject)((module0075.NIL != var15) ? conses_high.cadr(var15) : module0075.NIL);
        final SubLObject var17;
        var4 = (var17 = var5);
        if (module0075.NIL == var14) {
            final SubLObject var18 = (SubLObject)module0075.$ic95$;
            final SubLObject var19 = (SubLObject)module0075.$ic96$;
            return (SubLObject)ConsesLow.list((SubLObject)module0075.$ic1$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var18, var7)), (SubLObject)ConsesLow.list((SubLObject)module0075.$ic11$, (SubLObject)ConsesLow.listS(var19, var18, (SubLObject)module0075.$ic76$), (SubLObject)ConsesLow.list((SubLObject)module0075.$ic41$, (SubLObject)ConsesLow.list((SubLObject)module0075.$ic42$, var19), (SubLObject)ConsesLow.listS((SubLObject)module0075.$ic87$, (SubLObject)ConsesLow.list(var6, var19, (SubLObject)module0075.$ic84$, var12, (SubLObject)module0075.$ic85$, var16), ConsesLow.append(var17, (SubLObject)module0075.NIL)))));
        }
        final SubLObject var18 = (SubLObject)module0075.$ic97$;
        final SubLObject var19 = (SubLObject)module0075.$ic98$;
        final SubLObject var20 = (SubLObject)module0075.$ic99$;
        return (SubLObject)ConsesLow.list((SubLObject)module0075.$ic100$, var14, (SubLObject)ConsesLow.list((SubLObject)module0075.$ic1$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var18, var7)), (SubLObject)ConsesLow.list((SubLObject)module0075.$ic11$, (SubLObject)ConsesLow.listS(var19, var18, (SubLObject)module0075.$ic76$), (SubLObject)ConsesLow.list((SubLObject)module0075.$ic41$, (SubLObject)ConsesLow.list((SubLObject)module0075.$ic42$, var19), (SubLObject)ConsesLow.list((SubLObject)module0075.$ic1$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var20, (SubLObject)ConsesLow.list((SubLObject)module0075.$ic101$, var19))), (SubLObject)ConsesLow.listS((SubLObject)module0075.$ic87$, (SubLObject)ConsesLow.list(var6, var19, (SubLObject)module0075.$ic84$, var12, (SubLObject)module0075.$ic85$, var16), ConsesLow.append(var17, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0075.$ic102$, (SubLObject)ConsesLow.list((SubLObject)module0075.$ic103$, var19), var20)))))))));
    }
    
    public static SubLObject f5204(final SubLObject var109) {
        final SubLThread var110 = SubLProcess.currentSubLThread();
        SubLObject var111 = (SubLObject)module0075.ZERO_INTEGER;
        SubLObject var112 = (SubLObject)module0075.NIL;
        try {
            final SubLObject var113 = stream_macros.$stream_requires_locking$.currentBinding(var110);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0075.NIL, var110);
                var112 = compatibility.open_text(var109, (SubLObject)module0075.$ic104$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var113, var110);
            }
            if (!var112.isStream()) {
                Errors.error((SubLObject)module0075.$ic65$, var109);
            }
            final SubLObject var114 = var112;
            if (var114.isStream()) {
                final SubLObject var144_145 = var114;
                SubLObject var115 = (SubLObject)module0075.NIL;
                SubLObject var116 = (SubLObject)module0075.NIL;
                var115 = (SubLObject)module0075.ZERO_INTEGER;
                for (var116 = f5202(var144_145); module0075.NIL != var116; var116 = f5202(var144_145)) {
                    var111 = Numbers.add(var111, (SubLObject)module0075.ONE_INTEGER);
                    var115 = module0048.f_1X(var115);
                }
            }
        }
        finally {
            final SubLObject var117 = Threads.$is_thread_performing_cleanupP$.currentBinding(var110);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0075.T, var110);
                if (var112.isStream()) {
                    streams_high.close(var112, (SubLObject)module0075.UNPROVIDED);
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
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0075.$ic105$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0075.NIL;
        SubLObject var7 = (SubLObject)module0075.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0075.$ic105$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0075.$ic105$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)module0075.NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)module0075.NIL;
        SubLObject var155_156 = (SubLObject)module0075.NIL;
        while (module0075.NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0075.$ic105$);
            var155_156 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0075.$ic105$);
            if (module0075.NIL == conses_high.member(var155_156, (SubLObject)module0075.$ic106$, (SubLObject)module0075.UNPROVIDED, (SubLObject)module0075.UNPROVIDED)) {
                var10 = (SubLObject)module0075.T;
            }
            if (var155_156 == module0075.$ic38$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (module0075.NIL != var10 && module0075.NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0075.$ic105$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)module0075.$ic107$, var4);
        final SubLObject var12 = (SubLObject)((module0075.NIL != var11) ? conses_high.cadr(var11) : module0075.$ic108$);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)module0075.$ic109$, var4);
        final SubLObject var14 = (SubLObject)((module0075.NIL != var13) ? conses_high.cadr(var13) : module0075.$ic110$);
        final SubLObject var15 = cdestructuring_bind.property_list_member((SubLObject)module0075.$ic111$, var4);
        final SubLObject var16 = (SubLObject)((module0075.NIL != var15) ? conses_high.cadr(var15) : module0075.NIL);
        final SubLObject var17 = cdestructuring_bind.property_list_member((SubLObject)module0075.$ic112$, var4);
        final SubLObject var18 = (SubLObject)((module0075.NIL != var17) ? conses_high.cadr(var17) : module0075.NIL);
        final SubLObject var19 = cdestructuring_bind.property_list_member((SubLObject)module0075.$ic113$, var4);
        final SubLObject var20 = (SubLObject)((module0075.NIL != var19) ? conses_high.cadr(var19) : module0075.$ic114$);
        final SubLObject var21;
        var4 = (var21 = var5);
        final SubLObject var22 = (SubLObject)module0075.$ic115$;
        return (SubLObject)ConsesLow.list((SubLObject)module0075.$ic116$, (SubLObject)ConsesLow.list(var22, var7), (SubLObject)ConsesLow.listS((SubLObject)module0075.$ic1$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)module0075.$ic117$, var22, var12, var14, var16, var18, var20))), ConsesLow.append(var21, (SubLObject)module0075.NIL)));
    }
    
    public static SubLObject f5206(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0075.$ic118$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0075.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0075.$ic118$);
        var6 = var4.first();
        var4 = var4.rest();
        SubLObject var7 = (SubLObject)module0075.NIL;
        SubLObject var8 = var4;
        SubLObject var9 = (SubLObject)module0075.NIL;
        SubLObject var173_174 = (SubLObject)module0075.NIL;
        while (module0075.NIL != var8) {
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)module0075.$ic118$);
            var173_174 = var8.first();
            var8 = var8.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)module0075.$ic118$);
            if (module0075.NIL == conses_high.member(var173_174, (SubLObject)module0075.$ic106$, (SubLObject)module0075.UNPROVIDED, (SubLObject)module0075.UNPROVIDED)) {
                var9 = (SubLObject)module0075.T;
            }
            if (var173_174 == module0075.$ic38$) {
                var7 = var8.first();
            }
            var8 = var8.rest();
        }
        if (module0075.NIL != var9 && module0075.NIL == var7) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0075.$ic118$);
        }
        final SubLObject var10 = cdestructuring_bind.property_list_member((SubLObject)module0075.$ic107$, var4);
        final SubLObject var11 = (SubLObject)((module0075.NIL != var10) ? conses_high.cadr(var10) : module0075.$ic119$);
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)module0075.$ic109$, var4);
        final SubLObject var13 = (SubLObject)((module0075.NIL != var12) ? conses_high.cadr(var12) : module0075.NIL);
        final SubLObject var14 = cdestructuring_bind.property_list_member((SubLObject)module0075.$ic111$, var4);
        final SubLObject var15 = (SubLObject)((module0075.NIL != var14) ? conses_high.cadr(var14) : module0075.NIL);
        final SubLObject var16 = cdestructuring_bind.property_list_member((SubLObject)module0075.$ic112$, var4);
        final SubLObject var17 = (SubLObject)((module0075.NIL != var16) ? conses_high.cadr(var16) : module0075.T);
        final SubLObject var18 = cdestructuring_bind.property_list_member((SubLObject)module0075.$ic113$, var4);
        final SubLObject var19 = (SubLObject)((module0075.NIL != var18) ? conses_high.cadr(var18) : module0075.NIL);
        var4 = var5;
        SubLObject var20 = (SubLObject)module0075.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0075.$ic118$);
        var20 = var4.first();
        final SubLObject var21;
        var4 = (var21 = var4.rest());
        final SubLObject var22 = (SubLObject)module0075.$ic120$;
        return (SubLObject)ConsesLow.list((SubLObject)module0075.$ic81$, (SubLObject)ConsesLow.list(var22, var6), (SubLObject)ConsesLow.listS((SubLObject)module0075.$ic121$, var20, (SubLObject)ConsesLow.list((SubLObject)module0075.$ic122$, (SubLObject)module0075.$ic123$, (SubLObject)ConsesLow.listS((SubLObject)module0075.$ic117$, var22, ConsesLow.append((SubLObject)ConsesLow.list(var11, var13, var15, var17, var19), (SubLObject)module0075.NIL))), ConsesLow.append(var21, (SubLObject)module0075.NIL)));
    }
    
    public static SubLObject f5207(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0075.$ic74$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0075.NIL;
        SubLObject var7 = (SubLObject)module0075.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0075.$ic74$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0075.$ic74$);
        var7 = var4.first();
        var4 = var4.rest();
        final SubLObject var8 = (SubLObject)(var4.isCons() ? var4.first() : module0075.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0075.$ic74$);
        var4 = var4.rest();
        if (module0075.NIL == var4) {
            final SubLObject var9;
            var4 = (var9 = var5);
            final SubLObject var10 = (SubLObject)module0075.$ic124$;
            final SubLObject var11 = (SubLObject)module0075.$ic125$;
            final SubLObject var12 = (SubLObject)module0075.$ic126$;
            return (SubLObject)ConsesLow.list((SubLObject)module0075.$ic1$, (SubLObject)ConsesLow.list(var12), (SubLObject)ConsesLow.list((SubLObject)module0075.$ic81$, (SubLObject)ConsesLow.list(var10, var7, var12), (SubLObject)ConsesLow.list((SubLObject)module0075.$ic1$, (SubLObject)ConsesLow.list(reader.bq_cons(var11, (SubLObject)module0075.$ic127$), reader.bq_cons(var6, (SubLObject)module0075.$ic128$)), (SubLObject)ConsesLow.list((SubLObject)module0075.$ic129$, (SubLObject)ConsesLow.list((SubLObject)module0075.$ic130$, var11, (SubLObject)ConsesLow.list((SubLObject)module0075.$ic131$, var10)), (SubLObject)ConsesLow.list((SubLObject)module0075.$ic132$, (SubLObject)module0075.$ic133$, (SubLObject)ConsesLow.list((SubLObject)module0075.$ic134$, var10, (SubLObject)module0075.NIL, (SubLObject)module0075.NIL, var11), (SubLObject)ConsesLow.list((SubLObject)module0075.$ic135$, (SubLObject)module0075.$ic136$, var6), (SubLObject)ConsesLow.listS((SubLObject)module0075.$ic137$, var11, (SubLObject)module0075.$ic138$))), (SubLObject)ConsesLow.list((SubLObject)module0075.$ic137$, var6, (SubLObject)ConsesLow.list((SubLObject)module0075.$ic139$, var6)), (SubLObject)ConsesLow.list((SubLObject)module0075.$ic137$, var12, var8), (SubLObject)ConsesLow.listS((SubLObject)module0075.$ic140$, var8, ConsesLow.append(var9, (SubLObject)module0075.NIL)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0075.$ic74$);
        return (SubLObject)module0075.NIL;
    }
    
    public static SubLObject f5208(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0075.$ic141$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0075.NIL;
        SubLObject var7 = (SubLObject)module0075.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0075.$ic141$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0075.$ic141$);
        var7 = var4.first();
        var4 = var4.rest();
        final SubLObject var8 = var4.isCons() ? var4.first() : Symbols.symbol_function((SubLObject)module0075.$ic142$);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0075.$ic141$);
        var4 = var4.rest();
        final SubLObject var9 = var4.isCons() ? var4.first() : Symbols.symbol_function((SubLObject)module0075.$ic143$);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0075.$ic141$);
        var4 = var4.rest();
        if (module0075.NIL == var4) {
            final SubLObject var10;
            var4 = (var10 = var5);
            final SubLObject var11 = (SubLObject)module0075.$ic144$;
            final SubLObject var12 = (SubLObject)module0075.$ic145$;
            return (SubLObject)ConsesLow.list((SubLObject)module0075.$ic8$, (SubLObject)ConsesLow.listS(var11, var7, (SubLObject)module0075.$ic76$), (SubLObject)ConsesLow.list((SubLObject)module0075.$ic41$, (SubLObject)ConsesLow.list((SubLObject)module0075.$ic146$, var11), (SubLObject)ConsesLow.list((SubLObject)module0075.$ic1$, (SubLObject)ConsesLow.list(var6), (SubLObject)ConsesLow.list((SubLObject)module0075.$ic77$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var12, (SubLObject)ConsesLow.listS((SubLObject)module0075.$ic147$, var11, (SubLObject)module0075.$ic148$), (SubLObject)ConsesLow.listS((SubLObject)module0075.$ic147$, var11, (SubLObject)module0075.$ic148$))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0075.$ic80$, var12)), (SubLObject)ConsesLow.listS((SubLObject)module0075.$ic137$, var6, (SubLObject)module0075.$ic9$), (SubLObject)ConsesLow.list((SubLObject)module0075.$ic140$, (SubLObject)ConsesLow.list((SubLObject)module0075.$ic79$, (SubLObject)ConsesLow.list((SubLObject)module0075.$ic149$, var9, var12), (SubLObject)ConsesLow.list((SubLObject)module0075.$ic149$, var8, var12)), (SubLObject)ConsesLow.list((SubLObject)module0075.$ic135$, var12, var6), (SubLObject)ConsesLow.list((SubLObject)module0075.$ic77$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var12, (SubLObject)ConsesLow.listS((SubLObject)module0075.$ic147$, var11, (SubLObject)module0075.$ic148$), (SubLObject)ConsesLow.listS((SubLObject)module0075.$ic147$, var11, (SubLObject)module0075.$ic148$))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0075.$ic79$, (SubLObject)ConsesLow.list((SubLObject)module0075.$ic80$, var12), (SubLObject)ConsesLow.list((SubLObject)module0075.$ic149$, var8, var12))), (SubLObject)ConsesLow.list((SubLObject)module0075.$ic140$, (SubLObject)ConsesLow.list((SubLObject)module0075.$ic149$, var9, var12), (SubLObject)ConsesLow.list((SubLObject)module0075.$ic135$, var12, var6)))), (SubLObject)ConsesLow.listS((SubLObject)module0075.$ic41$, var6, (SubLObject)ConsesLow.list((SubLObject)module0075.$ic137$, var6, (SubLObject)ConsesLow.list((SubLObject)module0075.$ic139$, var6)), ConsesLow.append(var10, (SubLObject)module0075.NIL))))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0075.$ic141$);
        return (SubLObject)module0075.NIL;
    }
    
    public static SubLObject f5209(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0075.$ic150$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0075.NIL;
        SubLObject var7 = (SubLObject)module0075.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0075.$ic150$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0075.$ic150$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)module0075.NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)module0075.NIL;
        SubLObject var199_200 = (SubLObject)module0075.NIL;
        while (module0075.NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0075.$ic150$);
            var199_200 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0075.$ic150$);
            if (module0075.NIL == conses_high.member(var199_200, (SubLObject)module0075.$ic151$, (SubLObject)module0075.UNPROVIDED, (SubLObject)module0075.UNPROVIDED)) {
                var10 = (SubLObject)module0075.T;
            }
            if (var199_200 == module0075.$ic38$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (module0075.NIL != var10 && module0075.NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0075.$ic150$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)module0075.$ic152$, var4);
        final SubLObject var12 = (SubLObject)((module0075.NIL != var11) ? conses_high.cadr(var11) : module0075.T);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)module0075.$ic94$, var4);
        final SubLObject var14 = (SubLObject)((module0075.NIL != var13) ? conses_high.cadr(var13) : module0075.NIL);
        final SubLObject var15 = cdestructuring_bind.property_list_member((SubLObject)module0075.$ic85$, var4);
        final SubLObject var16 = (SubLObject)((module0075.NIL != var15) ? conses_high.cadr(var15) : module0075.NIL);
        final SubLObject var17 = cdestructuring_bind.property_list_member((SubLObject)module0075.$ic153$, var4);
        final SubLObject var18 = (SubLObject)((module0075.NIL != var17) ? conses_high.cadr(var17) : module0075.NIL);
        final SubLObject var19;
        var4 = (var19 = var5);
        final SubLObject var20 = (SubLObject)module0075.$ic154$;
        final SubLObject var21 = (SubLObject)module0075.$ic155$;
        return (SubLObject)ConsesLow.list((SubLObject)module0075.$ic54$, (SubLObject)ConsesLow.listS((SubLObject)module0075.$ic156$, var7, (SubLObject)module0075.$ic157$), (SubLObject)ConsesLow.list((SubLObject)module0075.$ic1$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var20, (SubLObject)ConsesLow.list((SubLObject)module0075.$ic158$, var7, var12)), (SubLObject)ConsesLow.list(var21, var14), (SubLObject)ConsesLow.list((SubLObject)module0075.$ic159$, (SubLObject)ConsesLow.list((SubLObject)module0075.$ic160$, (SubLObject)ConsesLow.list((SubLObject)module0075.$ic21$, var21)))), (SubLObject)ConsesLow.list((SubLObject)module0075.$ic41$, (SubLObject)ConsesLow.list((SubLObject)module0075.$ic161$, var18), (SubLObject)ConsesLow.list((SubLObject)module0075.$ic137$, var20, (SubLObject)ConsesLow.list((SubLObject)module0075.$ic162$, var20, var18))), (SubLObject)ConsesLow.listS((SubLObject)module0075.$ic163$, (SubLObject)ConsesLow.list(var6, var20, var21, var16), ConsesLow.append(var19, (SubLObject)module0075.NIL))));
    }
    
    public static SubLObject f5210(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0075.$ic164$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0075.NIL;
        SubLObject var7 = (SubLObject)module0075.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0075.$ic164$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0075.$ic164$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)module0075.NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)module0075.NIL;
        SubLObject var216_217 = (SubLObject)module0075.NIL;
        while (module0075.NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0075.$ic164$);
            var216_217 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0075.$ic164$);
            if (module0075.NIL == conses_high.member(var216_217, (SubLObject)module0075.$ic165$, (SubLObject)module0075.UNPROVIDED, (SubLObject)module0075.UNPROVIDED)) {
                var10 = (SubLObject)module0075.T;
            }
            if (var216_217 == module0075.$ic38$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (module0075.NIL != var10 && module0075.NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0075.$ic164$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)module0075.$ic152$, var4);
        final SubLObject var12 = (SubLObject)((module0075.NIL != var11) ? conses_high.cadr(var11) : module0075.T);
        final SubLObject var13;
        var4 = (var13 = var5);
        return (SubLObject)ConsesLow.list((SubLObject)module0075.$ic166$, (SubLObject)ConsesLow.list(var6, var7, (SubLObject)module0075.$ic152$, var12), (SubLObject)ConsesLow.listS((SubLObject)module0075.$ic41$, (SubLObject)ConsesLow.list((SubLObject)module0075.$ic167$, (SubLObject)ConsesLow.list((SubLObject)module0075.$ic168$, (SubLObject)ConsesLow.list(var12, var6), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)module0075.$ic169$, var7, (SubLObject)module0075.$ic170$), (SubLObject)ConsesLow.list((SubLObject)module0075.$ic171$, var7, var6)), (SubLObject)ConsesLow.list((SubLObject)module0075.T, (SubLObject)ConsesLow.list((SubLObject)module0075.$ic171$, var7, (SubLObject)module0075.$ic172$, var6)))), (SubLObject)ConsesLow.list((SubLObject)module0075.$ic140$, (SubLObject)ConsesLow.listS((SubLObject)module0075.EQL, (SubLObject)ConsesLow.list((SubLObject)module0075.$ic173$, var6), (SubLObject)module0075.$ic174$), (SubLObject)ConsesLow.list((SubLObject)module0075.$ic137$, var6, (SubLObject)ConsesLow.listS((SubLObject)module0075.$ic171$, var6, (SubLObject)module0075.$ic170$))), ConsesLow.append(var13, (SubLObject)module0075.NIL)));
    }
    
    public static SubLObject f5211(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0075.$ic175$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0075.NIL;
        SubLObject var7 = (SubLObject)module0075.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0075.$ic175$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0075.$ic175$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)module0075.NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)module0075.NIL;
        SubLObject var225_226 = (SubLObject)module0075.NIL;
        while (module0075.NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0075.$ic175$);
            var225_226 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0075.$ic175$);
            if (module0075.NIL == conses_high.member(var225_226, (SubLObject)module0075.$ic176$, (SubLObject)module0075.UNPROVIDED, (SubLObject)module0075.UNPROVIDED)) {
                var10 = (SubLObject)module0075.T;
            }
            if (var225_226 == module0075.$ic38$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (module0075.NIL != var10 && module0075.NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0075.$ic175$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)module0075.$ic152$, var4);
        final SubLObject var12 = (SubLObject)((module0075.NIL != var11) ? conses_high.cadr(var11) : module0075.T);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)module0075.$ic94$, var4);
        final SubLObject var14 = (SubLObject)((module0075.NIL != var13) ? conses_high.cadr(var13) : module0075.$ic177$);
        final SubLObject var15;
        var4 = (var15 = var5);
        final SubLObject var16 = (SubLObject)module0075.$ic178$;
        final SubLObject var17 = (SubLObject)module0075.$ic179$;
        return (SubLObject)ConsesLow.list((SubLObject)module0075.$ic54$, (SubLObject)ConsesLow.listS((SubLObject)module0075.$ic156$, var7, (SubLObject)module0075.$ic157$), (SubLObject)ConsesLow.list((SubLObject)module0075.$ic1$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var16, (SubLObject)ConsesLow.list((SubLObject)module0075.$ic180$, var7))), (SubLObject)ConsesLow.list((SubLObject)module0075.$ic77$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var17, (SubLObject)ConsesLow.list((SubLObject)module0075.$ic181$, var16), (SubLObject)ConsesLow.list((SubLObject)module0075.$ic181$, var16))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0075.$ic80$, var16)), (SubLObject)ConsesLow.list((SubLObject)module0075.$ic182$, var16), (SubLObject)ConsesLow.list((SubLObject)module0075.$ic166$, (SubLObject)ConsesLow.list(var6, var17, (SubLObject)module0075.$ic152$, var12, (SubLObject)module0075.$ic94$, (SubLObject)ConsesLow.list((SubLObject)module0075.$ic183$, (SubLObject)ConsesLow.list((SubLObject)module0075.$ic21$, var14), (SubLObject)ConsesLow.list((SubLObject)module0075.$ic171$, var14, (SubLObject)ConsesLow.list((SubLObject)module0075.$ic184$, (SubLObject)module0075.$ic185$, var17)))), (SubLObject)ConsesLow.list((SubLObject)module0075.$ic7$, (SubLObject)ConsesLow.list((SubLObject)module0075.$ic167$, var6), (SubLObject)ConsesLow.list((SubLObject)module0075.$ic135$, var6, var16), reader.bq_cons((SubLObject)module0075.$ic54$, ConsesLow.append(var15, (SubLObject)module0075.NIL)))))));
    }
    
    public static SubLObject f5212(final SubLObject var43) {
        final SubLThread var44 = SubLProcess.currentSubLThread();
        assert module0075.NIL != Filesys.directory_p(var43) : var43;
        SubLObject var45 = (SubLObject)module0075.NIL;
        if (!var45.isInteger()) {
            var45 = (SubLObject)module0075.ZERO_INTEGER;
            assert module0075.NIL != Filesys.directory_p(var43) : var43;
            SubLObject var46 = Filesys.directory(var43, (SubLObject)module0075.T);
            final SubLObject var47 = (SubLObject)module0075.NIL;
            final SubLObject var48 = module0012.$silent_progressP$.currentBinding(var44);
            try {
                module0012.$silent_progressP$.bind((SubLObject)SubLObjectFactory.makeBoolean(!var47.isString()), var44);
                if (module0075.NIL.isFunctionSpec()) {
                    var46 = Sort.sort(var46, (SubLObject)module0075.NIL, (SubLObject)module0075.UNPROVIDED);
                }
                final SubLObject var49 = var46;
                module0012.$g82$.setDynamicValue(var47, var44);
                module0012.$g73$.setDynamicValue(Time.get_universal_time(), var44);
                module0012.$g83$.setDynamicValue(Sequences.length(var49), var44);
                module0012.$g84$.setDynamicValue((SubLObject)module0075.ZERO_INTEGER, var44);
                final SubLObject var31_234 = module0012.$g75$.currentBinding(var44);
                final SubLObject var50 = module0012.$g76$.currentBinding(var44);
                final SubLObject var51 = module0012.$g77$.currentBinding(var44);
                final SubLObject var52 = module0012.$g78$.currentBinding(var44);
                try {
                    module0012.$g75$.bind((SubLObject)module0075.ZERO_INTEGER, var44);
                    module0012.$g76$.bind((SubLObject)module0075.NIL, var44);
                    module0012.$g77$.bind((SubLObject)module0075.T, var44);
                    module0012.$g78$.bind(Time.get_universal_time(), var44);
                    module0012.f478(module0012.$g82$.getDynamicValue(var44));
                    SubLObject var53 = var49;
                    SubLObject var54 = (SubLObject)module0075.NIL;
                    var54 = var53.first();
                    while (module0075.NIL != var53) {
                        module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var44), module0012.$g83$.getDynamicValue(var44));
                        module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var44), (SubLObject)module0075.ONE_INTEGER), var44);
                        var45 = Numbers.add(var45, (SubLObject)module0075.ONE_INTEGER);
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
        if (var240 == module0075.UNPROVIDED) {
            var240 = (SubLObject)module0075.NIL;
        }
        if (var241 == module0075.UNPROVIDED) {
            var241 = (SubLObject)module0075.NIL;
        }
        if (var242 == module0075.UNPROVIDED) {
            var242 = (SubLObject)module0075.NIL;
        }
        return Mapping.mapcar((SubLObject)module0075.$ic186$, module0045.f3157(var239, Filesys.directory(var43, var240), var241, var242));
    }
    
    public static SubLObject f5214(final SubLObject var243) {
        return Sort.sort(var243, (SubLObject)module0075.$ic130$, (SubLObject)module0075.$ic187$);
    }
    
    public static SubLObject f5215(final SubLObject var244) {
        SubLObject var245 = (SubLObject)module0075.NIL;
        SubLObject var246 = (SubLObject)module0075.NIL;
        try {
            var246 = streams_high.make_private_string_output_stream();
            SubLObject var246_247 = (SubLObject)module0075.NIL;
            try {
                var246_247 = compatibility.open_text(var244, (SubLObject)module0075.$ic104$);
                if (!var246_247.isStream()) {
                    Errors.error((SubLObject)module0075.$ic65$, var244);
                }
                final SubLObject var247 = var246_247;
                if (var247.isStream()) {
                    SubLObject var248;
                    for (var248 = (SubLObject)module0075.NIL, var248 = f5200(var247); module0075.NIL != var248; var248 = f5200(var247)) {
                        streams_high.write_string(var248, var246, (SubLObject)module0075.UNPROVIDED, (SubLObject)module0075.UNPROVIDED);
                        streams_high.terpri(var246);
                    }
                }
            }
            finally {
                final SubLObject var249 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0075.T);
                    if (var246_247.isStream()) {
                        streams_high.close(var246_247, (SubLObject)module0075.UNPROVIDED);
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
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0075.T);
                streams_high.close(var246, (SubLObject)module0075.UNPROVIDED);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var250);
            }
        }
        return var245;
    }
    
    public static SubLObject f5216(final SubLObject var244) {
        if (module0075.NIL != Filesys.probe_file(var244)) {
            return f5215(var244);
        }
        return (SubLObject)module0075.$ic19$;
    }
    
    public static SubLObject f5217(final SubLObject var244) {
        final SubLThread var245 = SubLProcess.currentSubLThread();
        SubLObject var246 = (SubLObject)module0075.NIL;
        SubLObject var247 = (SubLObject)module0075.NIL;
        try {
            final SubLObject var248 = stream_macros.$stream_requires_locking$.currentBinding(var245);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0075.NIL, var245);
                var247 = compatibility.open_text(var244, (SubLObject)module0075.$ic104$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var248, var245);
            }
            if (!var247.isStream()) {
                Errors.error((SubLObject)module0075.$ic65$, var244);
            }
            final SubLObject var249 = var247;
            if (var249.isStream()) {
                final SubLObject var144_251 = var249;
                SubLObject var250 = (SubLObject)module0075.NIL;
                SubLObject var251 = (SubLObject)module0075.NIL;
                var250 = (SubLObject)module0075.ZERO_INTEGER;
                for (var251 = f5202(var144_251); module0075.NIL != var251; var251 = f5202(var144_251)) {
                    var246 = (SubLObject)ConsesLow.cons(var251, var246);
                    var250 = module0048.f_1X(var250);
                }
            }
        }
        finally {
            final SubLObject var252 = Threads.$is_thread_performing_cleanupP$.currentBinding(var245);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0075.T, var245);
                if (var247.isStream()) {
                    streams_high.close(var247, (SubLObject)module0075.UNPROVIDED);
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
        SubLObject var14 = (SubLObject)module0075.NIL;
        SubLObject var15 = (SubLObject)module0075.NIL;
        try {
            var13.throwStack.push(module0075.$ic62$);
            final SubLObject var16 = Errors.$error_handler$.currentBinding(var13);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)module0075.$ic63$), var13);
                try {
                    var14 = module0035.sublisp_boolean(Filesys.probe_file(var12));
                }
                catch (Throwable var17) {
                    Errors.handleThrowable(var17, (SubLObject)module0075.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var16, var13);
            }
        }
        catch (Throwable var18) {
            var15 = Errors.handleThrowable(var18, (SubLObject)module0075.$ic62$);
        }
        finally {
            var13.throwStack.pop();
        }
        return var14;
    }
    
    public static SubLObject f5219(final SubLObject var12) {
        if (module0075.NIL != Filesys.probe_file(var12)) {
            return (SubLObject)module0075.NIL;
        }
        final SubLObject var13 = (SubLObject)((module0075.NIL != module0038.f2702((SubLObject)Characters.CHAR_backslash, var12, (SubLObject)module0075.UNPROVIDED)) ? module0075.$ic188$ : module0075.$ic172$);
        SubLObject var14 = module0038.f2738(var12, (SubLObject)module0075.$ic189$, (SubLObject)module0075.UNPROVIDED, (SubLObject)module0075.UNPROVIDED, (SubLObject)module0075.UNPROVIDED, (SubLObject)module0075.UNPROVIDED, (SubLObject)module0075.UNPROVIDED);
        final SubLObject var15 = Equality.eq(Strings.sublisp_char(var13, (SubLObject)module0075.ZERO_INTEGER), Strings.sublisp_char(var12, (SubLObject)module0075.ZERO_INTEGER));
        SubLObject var16 = (SubLObject)((module0075.NIL != var15) ? var13 : module0075.$ic19$);
        SubLObject var17 = (SubLObject)module0075.NIL;
        SubLObject var18 = (SubLObject)module0075.NIL;
        if (module0075.NIL != var15) {
            var14 = var14.rest();
        }
        if (module0075.NIL == var17) {
            SubLObject var19 = var14;
            SubLObject var20 = (SubLObject)module0075.NIL;
            var20 = var19.first();
            while (module0075.NIL == var17 && module0075.NIL != var19) {
                var16 = Sequences.cconcatenate(var16, var20);
                if (module0075.NIL == Filesys.probe_file(var16)) {
                    if (module0075.NIL != var15 || module0075.NIL == Filesys.probe_file((SubLObject)module0075.$ic19$)) {
                        var18 = PrintLow.format((SubLObject)module0075.NIL, (SubLObject)module0075.$ic190$, var16);
                    }
                    else {
                        var18 = PrintLow.format((SubLObject)module0075.NIL, (SubLObject)module0075.$ic191$, Filesys.probe_file((SubLObject)module0075.$ic19$), var16);
                    }
                    var17 = (SubLObject)module0075.T;
                }
                var16 = Sequences.cconcatenate(var16, var13);
                var19 = var19.rest();
                var20 = var19.first();
            }
        }
        if (module0075.NIL == var17) {
            if (module0075.NIL != var15) {
                var18 = (SubLObject)module0075.$ic192$;
            }
            else {
                var18 = PrintLow.format((SubLObject)module0075.NIL, (SubLObject)module0075.$ic193$, Filesys.probe_file((SubLObject)module0075.$ic19$));
            }
        }
        return var18;
    }
    
    public static SubLObject f5220(final SubLObject var244) {
        if (module0075.NIL != module0038.f2702((SubLObject)Characters.CHAR_slash, var244, (SubLObject)module0075.UNPROVIDED)) {
            return (SubLObject)module0075.$ic194$;
        }
        if (module0075.NIL != module0038.f2702((SubLObject)Characters.CHAR_backslash, var244, (SubLObject)module0075.UNPROVIDED)) {
            return (SubLObject)module0075.$ic195$;
        }
        return (SubLObject)module0075.NIL;
    }
    
    public static SubLObject f5221(final SubLObject var244) {
        final SubLObject var245 = f5220(var244);
        return (SubLObject)((module0075.NIL != var245) ? var245 : module0075.$ic194$);
    }
    
    public static SubLObject f5222() {
        return f5223(module0006.f202(Filesys.probe_file((SubLObject)module0075.$ic20$)));
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
        if (var245.eql((SubLObject)module0075.ZERO_INTEGER)) {
            return (SubLObject)module0075.NIL;
        }
        final SubLObject var246 = f5220(var244);
        if (var246.eql((SubLObject)module0075.$ic194$)) {
            return Equality.eq((SubLObject)Characters.CHAR_slash, Strings.sublisp_char(var244, (SubLObject)module0075.ZERO_INTEGER));
        }
        if (var246.eql((SubLObject)module0075.$ic195$)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(var245.numG((SubLObject)module0075.TWO_INTEGER) && ((Characters.CHAR_colon.eql(Strings.sublisp_char(var244, (SubLObject)module0075.ONE_INTEGER)) && module0075.NIL != Characters.alpha_char_p(Strings.sublisp_char(var244, (SubLObject)module0075.ZERO_INTEGER))) || module0075.NIL != module0038.f2684(var244, (SubLObject)module0075.$ic196$)));
        }
        return (SubLObject)module0075.NIL;
    }
    
    public static SubLObject f5224(final SubLObject var261) {
        final SubLObject var262 = f5229(var261);
        if (var262.isString()) {
            return Strings.sublisp_char(var262, (SubLObject)module0075.ZERO_INTEGER);
        }
        return (SubLObject)module0075.NIL;
    }
    
    public static SubLObject f5229(final SubLObject var261) {
        if (var261.eql((SubLObject)module0075.$ic194$)) {
            return (SubLObject)module0075.$ic172$;
        }
        if (var261.eql((SubLObject)module0075.$ic195$)) {
            return (SubLObject)module0075.$ic188$;
        }
        if (var261.eql((SubLObject)module0075.$ic197$)) {
            return (SubLObject)module0075.$ic198$;
        }
        return (SubLObject)module0075.NIL;
    }
    
    public static SubLObject f5195(final SubLObject var244) {
        final SubLObject var245 = f5220(var244);
        if (module0075.NIL == var245) {
            return Values.values((SubLObject)module0075.NIL, var244, (SubLObject)module0075.NIL);
        }
        SubLObject var246 = module0038.f2738(var244, (SubLObject)ConsesLow.list(f5229(var245)), (SubLObject)module0075.UNPROVIDED, (SubLObject)module0075.UNPROVIDED, (SubLObject)module0075.UNPROVIDED, (SubLObject)module0075.UNPROVIDED, (SubLObject)module0075.UNPROVIDED);
        SubLObject var247 = (SubLObject)module0075.NIL;
        var246 = Sequences.nreverse(var246);
        var247 = var246.first();
        var246 = var246.rest();
        var246 = Sequences.nreverse(var246);
        return Values.values(var246, var247, var245);
    }
    
    public static SubLObject f5194(final SubLObject var266, final SubLObject var12, SubLObject var261) {
        if (var261 == module0075.UNPROVIDED) {
            var261 = (SubLObject)module0075.$ic194$;
        }
        SubLObject var267 = (SubLObject)module0075.NIL;
        final SubLObject var268 = f5229(var261);
        SubLObject var269 = var266;
        SubLObject var270 = (SubLObject)module0075.NIL;
        var270 = var269.first();
        while (module0075.NIL != var269) {
            var267 = (SubLObject)ConsesLow.cons(var270, var267);
            var267 = (SubLObject)ConsesLow.cons(var268, var267);
            var269 = var269.rest();
            var270 = var269.first();
        }
        var267 = (SubLObject)ConsesLow.cons(var12, var267);
        return Functions.apply(Symbols.symbol_function((SubLObject)module0075.$ic171$), Sequences.nreverse(var267));
    }
    
    public static SubLObject f5230(final SubLObject var271, final SubLObject var244) {
        final SubLThread var272 = SubLProcess.currentSubLThread();
        if (module0075.NIL != f5228(var244)) {
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
            if (module0075.NIL != var278) {
                return Values.values((SubLObject)module0075.NIL, (SubLObject)module0075.$ic199$);
            }
            var278 = var275;
        }
        var273 = Sequences.nreverse(var273);
        SubLObject var279 = var276;
        SubLObject var280 = (SubLObject)module0075.NIL;
        var280 = var279.first();
        while (module0075.NIL != var279) {
            if (!var280.equal((SubLObject)module0075.$ic20$)) {
                if (var280.equal((SubLObject)module0075.$ic200$)) {
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
        if (module0075.NIL == Errors.$ignore_mustsP$.getDynamicValue(var280) && module0075.NIL == f5228(var271)) {
            Errors.error((SubLObject)module0075.$ic201$, var271);
        }
        if (module0075.NIL == Errors.$ignore_mustsP$.getDynamicValue(var280) && module0075.NIL == f5228(var279)) {
            Errors.error((SubLObject)module0075.$ic202$, var279, var271);
        }
        return module0038.f2674(var271, f5223(var279), (SubLObject)module0075.UNPROVIDED);
    }
    
    public static SubLObject f5232(final SubLObject var280) {
        final SubLThread var281 = SubLProcess.currentSubLThread();
        if (module0075.NIL != Filesys.directory_p(var280)) {
            return (SubLObject)module0075.NIL;
        }
        final SubLObject var282 = module0004.f103(var280);
        SubLObject var283 = (SubLObject)module0075.NIL;
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
        final SubLObject var283 = module0038.f2623(var280, (SubLObject)module0075.ZERO_INTEGER, Numbers.subtract(Sequences.length(var280), var282));
        return Values.values(var283, var281);
    }
    
    public static SubLObject f5235(final SubLObject var286) {
        final SubLThread var287 = SubLProcess.currentSubLThread();
        if (module0075.NIL == module0038.f2653(var286) || module0075.NIL == Filesys.probe_file(var286)) {
            PrintLow.format(StreamsLow.$trace_output$.getDynamicValue(var287), (SubLObject)module0075.$ic203$, var286);
            return (SubLObject)module0075.NIL;
        }
        SubLObject var288 = (SubLObject)module0075.NIL;
        SubLObject var289 = (SubLObject)module0075.NIL;
        try {
            var289 = compatibility.open_text(var286, (SubLObject)module0075.$ic104$);
            if (!var289.isStream()) {
                Errors.error((SubLObject)module0075.$ic65$, var286);
            }
            SubLObject var290;
            SubLObject var291;
            for (var290 = var289, var291 = (SubLObject)module0075.NIL, var291 = module0038.f2835(var290, (SubLObject)module0075.NIL, (SubLObject)module0075.UNPROVIDED, (SubLObject)module0075.UNPROVIDED); var291 != module0075.$ic16$ && module0075.NIL != var291; var291 = module0038.f2835(var290, (SubLObject)module0075.NIL, (SubLObject)module0075.UNPROVIDED, (SubLObject)module0075.UNPROVIDED)) {
                var288 = (SubLObject)ConsesLow.cons(var291, var288);
            }
        }
        finally {
            final SubLObject var292 = Threads.$is_thread_performing_cleanupP$.currentBinding(var287);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0075.T, var287);
                if (var289.isStream()) {
                    streams_high.close(var289, (SubLObject)module0075.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var292, var287);
            }
        }
        return Sequences.reverse(var288);
    }
    
    public static SubLObject f5236(final SubLObject var286, final SubLObject var249, SubLObject var288) {
        if (var288 == module0075.UNPROVIDED) {
            var288 = (SubLObject)module0075.$ic64$;
        }
        SubLObject var289 = (SubLObject)module0075.NIL;
        try {
            var289 = compatibility.open_text(var286, var288);
            if (!var289.isStream()) {
                Errors.error((SubLObject)module0075.$ic65$, var286);
            }
            final SubLObject var290 = var289;
            SubLObject var291 = var249;
            SubLObject var292 = (SubLObject)module0075.NIL;
            var292 = var291.first();
            while (module0075.NIL != var291) {
                streams_high.write_string(var292, var290, (SubLObject)module0075.UNPROVIDED, (SubLObject)module0075.UNPROVIDED);
                streams_high.terpri(var290);
                var291 = var291.rest();
                var292 = var291.first();
            }
        }
        finally {
            final SubLObject var293 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0075.T);
                if (var289.isStream()) {
                    streams_high.close(var289, (SubLObject)module0075.UNPROVIDED);
                }
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var293);
            }
        }
        return (SubLObject)module0075.T;
    }
    
    public static SubLObject f5237(final SubLObject var286, final SubLObject var249) {
        return f5236(var286, var249, (SubLObject)module0075.$ic64$);
    }
    
    public static SubLObject f5238(final SubLObject var286, final SubLObject var249) {
        return f5236(var286, var249, (SubLObject)module0075.$ic73$);
    }
    
    public static SubLObject f5239(final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        SubLObject var14 = (SubLObject)module0075.NIL;
        try {
            final SubLObject var15 = stream_macros.$stream_requires_locking$.currentBinding(var13);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0075.NIL, var13);
                var14 = compatibility.open_binary(var12, (SubLObject)module0075.$ic64$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var15, var13);
            }
            if (!var14.isStream()) {
                Errors.error((SubLObject)module0075.$ic65$, var12);
            }
            final SubLObject var16 = var14;
        }
        finally {
            final SubLObject var17 = Threads.$is_thread_performing_cleanupP$.currentBinding(var13);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0075.T, var13);
                if (var14.isStream()) {
                    streams_high.close(var14, (SubLObject)module0075.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var17, var13);
            }
        }
        return var12;
    }
    
    public static SubLObject f5240(final SubLObject var12) {
        if (module0075.NIL != Filesys.probe_file(var12)) {
            SubLObject var13 = (SubLObject)module0075.NIL;
            final SubLObject var14 = compatibility.open_binary(var12, (SubLObject)module0075.$ic104$);
            var13 = streams_high.file_length(var14);
            streams_high.close(var14, (SubLObject)module0075.UNPROVIDED);
            return Numbers.zerop(var13);
        }
        return (SubLObject)module0075.NIL;
    }
    
    public static SubLObject ensure_directories_exist(final SubLObject var291) {
        return f5241(f5233(var291), (SubLObject)module0075.UNPROVIDED, (SubLObject)module0075.UNPROVIDED);
    }
    
    public static SubLObject f5241(final SubLObject var292, SubLObject var293, SubLObject var294) {
        if (var293 == module0075.UNPROVIDED) {
            var293 = (SubLObject)module0075.NIL;
        }
        if (var294 == module0075.UNPROVIDED) {
            var294 = (SubLObject)module0075.NIL;
        }
        final SubLThread var295 = SubLProcess.currentSubLThread();
        if (module0075.NIL != var294 && !module0075.areAssertionsDisabledFor(me) && module0075.NIL == Types.stringp(var294)) {
            throw new AssertionError(var294);
        }
        assert module0075.NIL != Types.stringp(var292) : var292;
        final SubLObject var296 = module0004.f103(var292);
        SubLObject var297 = (SubLObject)module0075.NIL;
        SubLObject var298 = (SubLObject)module0075.NIL;
        SubLObject var299 = (SubLObject)module0075.NIL;
        var295.resetMultipleValues();
        SubLObject var300 = f5195(var296);
        final SubLObject var301 = var295.secondMultipleValue();
        final SubLObject var302 = var295.thirdMultipleValue();
        var295.resetMultipleValues();
        var298 = var302;
        SubLObject var303;
        var300 = (var303 = module0035.f2084(var301, var300));
        SubLObject var304 = (SubLObject)module0075.NIL;
        var304 = var303.first();
        while (module0075.NIL != var303) {
            final SubLObject var305 = f5194(var297, var304, var298);
            var297 = module0035.f2084(var304, var297);
            if (module0075.NIL == Filesys.directory_p(var305) && (var298 != module0075.$ic195$ || module0075.NIL == module0038.f2673(var305, (SubLObject)module0075.$ic198$, (SubLObject)module0075.UNPROVIDED))) {
                if (module0075.NIL != Filesys.probe_file(var305)) {
                    if (module0075.NIL != var293) {
                        Filesys.delete_file(var305);
                    }
                    else {
                        Errors.error((SubLObject)module0075.$ic204$, var305);
                    }
                }
                Filesys.make_directory(var305, (SubLObject)module0075.UNPROVIDED, (SubLObject)module0075.UNPROVIDED);
                var299 = (SubLObject)ConsesLow.cons(var305, var299);
            }
            var303 = var303.rest();
            var304 = var303.first();
        }
        if (module0075.NIL != var294) {
            var303 = var299;
            SubLObject var306 = (SubLObject)module0075.NIL;
            var306 = var303.first();
            while (module0075.NIL != var303) {
                f5242(var306, var294);
                var303 = var303.rest();
                var306 = var303.first();
            }
        }
        return Filesys.probe_file(f5194(conses_high.butlast(var297, (SubLObject)module0075.UNPROVIDED), conses_high.last(var297, (SubLObject)module0075.UNPROVIDED).first(), var298));
    }
    
    public static SubLObject f5227(final SubLObject var303) {
        return module0004.f103(var303);
    }
    
    public static SubLObject f5243(final SubLObject var244) {
        if (module0075.NIL == Filesys.directory_p(var244)) {
            return (SubLObject)module0075.NIL;
        }
        SubLObject var246;
        final SubLObject var245 = var246 = Filesys.directory(var244, (SubLObject)module0075.UNPROVIDED);
        SubLObject var247 = (SubLObject)module0075.NIL;
        var247 = var246.first();
        while (module0075.NIL != var246) {
            final SubLObject var248 = Sequences.cconcatenate(var244, new SubLObject[] { module0075.$ic172$, var247 });
            if (module0075.NIL != Filesys.directory_p(var248)) {
                f5243(var248);
            }
            else {
                Filesys.delete_file(var248);
            }
            var246 = var246.rest();
            var247 = var246.first();
        }
        return Filesys.delete_directory(var244, (SubLObject)module0075.UNPROVIDED);
    }
    
    public static SubLObject f5244(final SubLObject var307, final SubLObject var308) {
        if (module0075.NIL == Filesys.directory_p(var307)) {
            return (SubLObject)module0075.NIL;
        }
        Filesys.make_directory(var308, (SubLObject)module0075.UNPROVIDED, (SubLObject)module0075.UNPROVIDED);
        SubLObject var310;
        final SubLObject var309 = var310 = Filesys.directory(var307, (SubLObject)module0075.UNPROVIDED);
        SubLObject var311 = (SubLObject)module0075.NIL;
        var311 = var310.first();
        while (module0075.NIL != var310) {
            final SubLObject var312 = Sequences.cconcatenate(var307, new SubLObject[] { module0075.$ic172$, var311 });
            final SubLObject var313 = Sequences.cconcatenate(var308, new SubLObject[] { module0075.$ic172$, var311 });
            if (module0075.NIL != Filesys.directory_p(var312)) {
                f5244(var312, var313);
            }
            else {
                Filesys.copy_file(var312, var313);
            }
            var310 = var310.rest();
            var311 = var310.first();
        }
        return (SubLObject)module0075.NIL;
    }
    
    public static SubLObject f5242(final SubLObject var303, final SubLObject var311) {
        final SubLThread var312 = SubLProcess.currentSubLThread();
        if (module0075.NIL == Processes.external_processes_supportedP()) {
            return (SubLObject)module0075.NIL;
        }
        return module0060.f4438((SubLObject)module0075.$ic205$, (SubLObject)ConsesLow.list(var311, var303), (SubLObject)module0075.ZERO_INTEGER, StreamsLow.$null_input$.getDynamicValue(var312), StreamsLow.$null_output$.getDynamicValue(var312), (SubLObject)module0075.UNPROVIDED);
    }
    
    public static SubLObject f5245(final SubLObject var12) {
        assert module0075.NIL != Types.stringp(var12) : var12;
        return Filesys.delete_file(var12);
    }
    
    public static SubLObject f5246(final SubLObject var312, final SubLObject var313) {
        assert module0075.NIL != Types.stringp(var313) : var313;
        assert module0075.NIL != Types.stringp(var312) : var312;
        if (module0075.NIL != Processes.external_processes_supportedP()) {
            return module0060.f4438((SubLObject)module0075.$ic206$, (SubLObject)ConsesLow.list((SubLObject)module0075.$ic207$, var313, var312), (SubLObject)module0075.UNPROVIDED, (SubLObject)module0075.UNPROVIDED, (SubLObject)module0075.UNPROVIDED, (SubLObject)module0075.UNPROVIDED);
        }
        return (SubLObject)module0075.NIL;
    }
    
    public static SubLObject f5247(final SubLObject var307, final SubLObject var308) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0075.NIL != f5246(var308, var307) || module0075.NIL != Filesys.copy_file(var307, var308));
    }
    
    public static SubLObject f5248(final SubLObject var307, final SubLObject var308) {
        final SubLThread var309 = SubLProcess.currentSubLThread();
        SubLObject var310 = (SubLObject)module0075.T;
        SubLObject var311 = (SubLObject)module0075.NIL;
        try {
            var309.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var312 = Errors.$error_handler$.currentBinding(var309);
            try {
                Errors.$error_handler$.bind((SubLObject)module0075.$ic17$, var309);
                try {
                    var310 = Filesys.copy_file(var307, var308);
                }
                catch (Throwable var313) {
                    Errors.handleThrowable(var313, (SubLObject)module0075.NIL);
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
        if (module0075.NIL != var310 && module0075.NIL == var311) {
            try {
                var309.throwStack.push(module0003.$g3$.getGlobalValue());
                final SubLObject var312 = Errors.$error_handler$.currentBinding(var309);
                try {
                    Errors.$error_handler$.bind((SubLObject)module0075.$ic17$, var309);
                    try {
                        var310 = Filesys.delete_file(var307);
                    }
                    catch (Throwable var313) {
                        Errors.handleThrowable(var313, (SubLObject)module0075.NIL);
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
        if (module0075.NIL != var311) {
            var310 = (SubLObject)module0075.NIL;
        }
        return Values.values(var310, var311);
    }
    
    public static SubLObject f5249(final SubLObject var303) {
        SubLObject var304 = (SubLObject)module0075.ZERO_INTEGER;
        if (var303.isString() && module0075.NIL != Filesys.probe_file(var303)) {
            SubLObject var305 = (SubLObject)module0075.NIL;
            try {
                var305 = compatibility.open_text(var303, (SubLObject)module0075.$ic104$);
                if (!var305.isStream()) {
                    Errors.error((SubLObject)module0075.$ic65$, var303);
                }
                final SubLObject var11_317 = var305;
                var304 = streams_high.file_length(var11_317);
            }
            finally {
                final SubLObject var306 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0075.T);
                    if (var305.isStream()) {
                        streams_high.close(var305, (SubLObject)module0075.UNPROVIDED);
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
        SubLObject var13 = (SubLObject)module0075.NIL;
        SubLObject var14 = (SubLObject)module0075.NIL;
        try {
            var14 = compatibility.open_text(var12, (SubLObject)module0075.$ic104$);
            if (!var14.isStream()) {
                Errors.error((SubLObject)module0075.$ic65$, var12);
            }
            final SubLObject var15 = var14;
            if (var15.isStream()) {
                SubLObject var16;
                for (var16 = (SubLObject)module0075.NIL, var16 = f5200(var15); module0075.NIL != var16; var16 = f5200(var15)) {
                    var13 = (SubLObject)ConsesLow.cons(var16, var13);
                }
            }
        }
        finally {
            final SubLObject var17 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0075.T);
                if (var14.isStream()) {
                    streams_high.close(var14, (SubLObject)module0075.UNPROVIDED);
                }
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var17);
            }
        }
        return Sequences.nreverse(var13);
    }
    
    public static SubLObject f5251(final SubLObject var303) {
        SubLObject var304 = (SubLObject)module0075.ZERO_INTEGER;
        if (var303.isString() && module0075.NIL != Filesys.probe_file(var303)) {
            SubLObject var305 = (SubLObject)module0075.NIL;
            try {
                var305 = compatibility.open_text(var303, (SubLObject)module0075.$ic104$);
                if (!var305.isStream()) {
                    Errors.error((SubLObject)module0075.$ic65$, var303);
                }
                final SubLObject var306 = var305;
                if (var306.isStream()) {
                    SubLObject var307;
                    for (var307 = (SubLObject)module0075.NIL, var307 = f5200(var306); module0075.NIL != var307; var307 = f5200(var306)) {
                        var304 = Numbers.add(var304, (SubLObject)module0075.ONE_INTEGER);
                    }
                }
            }
            finally {
                final SubLObject var308 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0075.T);
                    if (var305.isStream()) {
                        streams_high.close(var305, (SubLObject)module0075.UNPROVIDED);
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
        SubLObject var305 = (SubLObject)module0075.NIL;
        SubLObject var306 = (SubLObject)module0075.NIL;
        try {
            var304.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var307 = Errors.$error_handler$.currentBinding(var304);
            try {
                Errors.$error_handler$.bind((SubLObject)module0075.$ic17$, var304);
                try {
                    Eval.load(var303);
                    var306 = (SubLObject)module0075.T;
                }
                catch (Throwable var308) {
                    Errors.handleThrowable(var308, (SubLObject)module0075.NIL);
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
        if (module0075.NIL != var281) {
            return var281;
        }
        return var280;
    }
    
    public static SubLObject f5253(final SubLObject var322) {
        if (module0075.NIL != var322) {
            return f5254(var322);
        }
        return (SubLObject)module0075.NIL;
    }
    
    public static SubLObject f5254(final SubLObject var322) {
        final SubLThread var323 = SubLProcess.currentSubLThread();
        SubLObject var324 = (SubLObject)module0075.NIL;
        try {
            final SubLObject var325 = stream_macros.$stream_requires_locking$.currentBinding(var323);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0075.NIL, var323);
                var324 = compatibility.open_text(var322, (SubLObject)module0075.$ic64$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var325, var323);
            }
            if (!var324.isStream()) {
                Errors.error((SubLObject)module0075.$ic65$, var322);
            }
            final SubLObject var11_324 = var324;
            PrintLow.format(var11_324, (SubLObject)module0075.$ic208$);
        }
        finally {
            final SubLObject var326 = Threads.$is_thread_performing_cleanupP$.currentBinding(var323);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0075.T, var323);
                if (var324.isStream()) {
                    streams_high.close(var324, (SubLObject)module0075.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var326, var323);
            }
        }
        return var322;
    }
    
    public static SubLObject f5255(final SubLObject var325, SubLObject var244) {
        if (var244 == module0075.UNPROVIDED) {
            var244 = (SubLObject)module0075.NIL;
        }
        return f5256(var325, var244, (SubLObject)module0075.T);
    }
    
    public static SubLObject f5256(final SubLObject var325, SubLObject var244, SubLObject var326) {
        if (var244 == module0075.UNPROVIDED) {
            var244 = (SubLObject)module0075.NIL;
        }
        if (var326 == module0075.UNPROVIDED) {
            var326 = (SubLObject)module0075.NIL;
        }
        final SubLObject var327 = Filesys.make_directory(var325, var244, (SubLObject)module0075.UNPROVIDED);
        if (module0075.NIL != var326 && module0075.NIL == var327) {
            Errors.error((SubLObject)module0075.$ic209$, var325, var244);
        }
        return var327;
    }
    
    public static SubLObject f5257(final SubLObject var303) {
        return f5255(f5258(var303), (SubLObject)module0075.UNPROVIDED);
    }
    
    public static SubLObject f5258(SubLObject var303) {
        var303 = f5223(var303);
        final SubLObject var304 = module0051.f3556((SubLObject)module0075.UNPROVIDED, (SubLObject)module0075.UNPROVIDED);
        final SubLObject var305 = Sequences.cconcatenate(var303, var304);
        return f5223(var305);
    }
    
    public static SubLObject f5259(final SubLObject var12, SubLObject var329) {
        if (var329 == module0075.UNPROVIDED) {
            var329 = (SubLObject)module0075.T;
        }
        assert module0075.NIL != Types.stringp(var12) : var12;
        if (module0075.NIL != f5218(var12)) {
            if (module0075.NIL != var329) {
                Filesys.delete_file(var12);
                return var12;
            }
            Errors.error((SubLObject)module0075.$ic210$, var12);
        }
        return f5241(f5234(var12), var329, (SubLObject)module0075.UNPROVIDED);
    }
    
    public static SubLObject f5260(final SubLObject var244, SubLObject var95, SubLObject var330) {
        if (var95 == module0075.UNPROVIDED) {
            var95 = (SubLObject)module0075.$ic29$;
        }
        if (var330 == module0075.UNPROVIDED) {
            var330 = (SubLObject)module0075.$ic211$;
        }
        assert module0075.NIL != Types.function_spec_p(var330) : var330;
        final SubLObject var331 = (SubLObject)((module0075.$ic29$ == var95) ? module0075.$ic212$ : module0075.$ic213$);
        final SubLObject var332 = Functions.funcall(var331, var244, (SubLObject)module0075.$ic64$);
        if (module0075.NIL == streams_high.open_stream_p(var332) || module0075.NIL == streams_high.output_stream_p(var332)) {
            Errors.error((SubLObject)module0075.$ic214$, var244);
        }
        final SubLObject var333 = f5261(var332, var330);
        return module0083.f5696(var333, (SubLObject)module0075.$ic215$, (SubLObject)module0075.$ic216$, (SubLObject)module0075.$ic217$, (SubLObject)module0075.$ic218$, (SubLObject)module0075.$ic219$, (SubLObject)module0075.UNPROVIDED);
    }
    
    public static SubLObject f5262(final SubLObject var333) {
        f5263(module0083.f5706(var333));
        return var333;
    }
    
    public static SubLObject f5261(final SubLObject var11, final SubLObject var330) {
        final SubLObject var331 = var330.isSymbol() ? Symbols.symbol_function(var330) : var330;
        return (SubLObject)ConsesLow.list((SubLObject)module0075.$ic220$, var11, (SubLObject)module0075.$ic221$, var331, (SubLObject)module0075.$ic222$, (SubLObject)module0075.ZERO_INTEGER);
    }
    
    public static SubLObject f5264(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0075.$ic223$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0075.NIL;
        SubLObject var7 = (SubLObject)module0075.NIL;
        SubLObject var8 = (SubLObject)module0075.NIL;
        SubLObject var9 = (SubLObject)module0075.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0075.$ic223$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0075.$ic223$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0075.$ic223$);
        var8 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0075.$ic223$);
        var9 = var4.first();
        var4 = var4.rest();
        if (module0075.NIL == var4) {
            final SubLObject var10;
            var4 = (var10 = var5);
            return (SubLObject)ConsesLow.listS((SubLObject)module0075.$ic121$, (SubLObject)ConsesLow.list((SubLObject)module0075.$ic224$, var7, var8, var9), var6, ConsesLow.append(var10, (SubLObject)module0075.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0075.$ic223$);
        return (SubLObject)module0075.NIL;
    }
    
    public static SubLObject f5265(final SubLObject var332, final SubLObject var140) {
        return conses_high.putf(var332, (SubLObject)module0075.$ic222$, var140);
    }
    
    public static SubLObject f5266(final SubLObject var332) {
        return f5265(var332, (SubLObject)module0075.ZERO_INTEGER);
    }
    
    public static SubLObject f5267(final SubLObject var332) {
        return conses_high.getf(var332, (SubLObject)module0075.$ic220$, (SubLObject)module0075.UNPROVIDED);
    }
    
    public static SubLObject f5268(final SubLObject var332) {
        final SubLObject var333 = f5267(var332);
        streams_high.file_position(var333, (SubLObject)module0075.ZERO_INTEGER);
        return f5266(var332);
    }
    
    public static SubLObject f5269(final SubLObject var332, final SubLObject var339) {
        SubLObject var340 = (SubLObject)module0075.NIL;
        SubLObject var341 = var332;
        SubLObject var342 = (SubLObject)module0075.NIL;
        SubLObject var345_346 = (SubLObject)module0075.NIL;
        while (module0075.NIL != var341) {
            cdestructuring_bind.destructuring_bind_must_consp(var341, var332, (SubLObject)module0075.$ic225$);
            var345_346 = var341.first();
            var341 = var341.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var341, var332, (SubLObject)module0075.$ic225$);
            if (module0075.NIL == conses_high.member(var345_346, (SubLObject)module0075.$ic226$, (SubLObject)module0075.UNPROVIDED, (SubLObject)module0075.UNPROVIDED)) {
                var342 = (SubLObject)module0075.T;
            }
            if (var345_346 == module0075.$ic38$) {
                var340 = var341.first();
            }
            var341 = var341.rest();
        }
        if (module0075.NIL != var342 && module0075.NIL == var340) {
            cdestructuring_bind.cdestructuring_bind_error(var332, (SubLObject)module0075.$ic225$);
        }
        final SubLObject var343 = cdestructuring_bind.property_list_member((SubLObject)module0075.$ic220$, var332);
        final SubLObject var344 = (SubLObject)((module0075.NIL != var343) ? conses_high.cadr(var343) : module0075.NIL);
        final SubLObject var345 = cdestructuring_bind.property_list_member((SubLObject)module0075.$ic221$, var332);
        final SubLObject var346 = (SubLObject)((module0075.NIL != var345) ? conses_high.cadr(var345) : module0075.NIL);
        final SubLObject var347 = cdestructuring_bind.property_list_member((SubLObject)module0075.$ic222$, var332);
        final SubLObject var348 = (SubLObject)((module0075.NIL != var347) ? conses_high.cadr(var347) : module0075.NIL);
        Functions.funcall(var346, var339, var344);
        return f5265(var332, Numbers.add(var348, (SubLObject)module0075.ONE_INTEGER));
    }
    
    public static SubLObject f5270(final SubLObject var332) {
        SubLObject var333 = (SubLObject)module0075.NIL;
        SubLObject var334 = var332;
        SubLObject var335 = (SubLObject)module0075.NIL;
        SubLObject var355_356 = (SubLObject)module0075.NIL;
        while (module0075.NIL != var334) {
            cdestructuring_bind.destructuring_bind_must_consp(var334, var332, (SubLObject)module0075.$ic225$);
            var355_356 = var334.first();
            var334 = var334.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var334, var332, (SubLObject)module0075.$ic225$);
            if (module0075.NIL == conses_high.member(var355_356, (SubLObject)module0075.$ic226$, (SubLObject)module0075.UNPROVIDED, (SubLObject)module0075.UNPROVIDED)) {
                var335 = (SubLObject)module0075.T;
            }
            if (var355_356 == module0075.$ic38$) {
                var333 = var334.first();
            }
            var334 = var334.rest();
        }
        if (module0075.NIL != var335 && module0075.NIL == var333) {
            cdestructuring_bind.cdestructuring_bind_error(var332, (SubLObject)module0075.$ic225$);
        }
        final SubLObject var336 = cdestructuring_bind.property_list_member((SubLObject)module0075.$ic220$, var332);
        final SubLObject var337 = (SubLObject)((module0075.NIL != var336) ? conses_high.cadr(var336) : module0075.NIL);
        final SubLObject var338 = cdestructuring_bind.property_list_member((SubLObject)module0075.$ic221$, var332);
        final SubLObject var339 = (SubLObject)((module0075.NIL != var338) ? conses_high.cadr(var338) : module0075.NIL);
        final SubLObject var340 = cdestructuring_bind.property_list_member((SubLObject)module0075.$ic222$, var332);
        final SubLObject var341 = (SubLObject)((module0075.NIL != var340) ? conses_high.cadr(var340) : module0075.NIL);
        return var341;
    }
    
    public static SubLObject f5271(final SubLObject var332, final SubLObject var360) {
        return Errors.error((SubLObject)module0075.$ic227$, var332);
    }
    
    public static SubLObject f5272(final SubLObject var332) {
        return Errors.error((SubLObject)module0075.$ic228$, var332);
    }
    
    public static SubLObject f5263(final SubLObject var332) {
        final SubLObject var333 = f5267(var332);
        streams_high.close(var333, (SubLObject)module0075.UNPROVIDED);
        return var332;
    }
    
    public static SubLObject f5273(final SubLObject var361, final SubLObject var362, final SubLObject var363, SubLObject var364) {
        if (var364 == module0075.UNPROVIDED) {
            var364 = streams_high.file_length(var361);
        }
        final SubLThread var365 = SubLProcess.currentSubLThread();
        SubLObject var366 = var363;
        compatibility.set_file_position(var361, var363);
        while (var366.numL(var364)) {
            final SubLObject var367 = streams_high.read_byte(var361, (SubLObject)module0075.NIL, (SubLObject)module0075.$ic16$);
            if (var367.isFixnum()) {
                var365.resetMultipleValues();
                final SubLObject var368 = module0037.f2584(var367);
                final SubLObject var369 = var365.secondMultipleValue();
                var365.resetMultipleValues();
                print_high.princ(var368, var362);
                print_high.princ(var369, var362);
            }
            var366 = Numbers.add(var366, (SubLObject)module0075.ONE_INTEGER);
        }
        return var362;
    }
    
    public static SubLObject f5274(final SubLObject var11, final SubLObject var363, SubLObject var364) {
        if (var364 == module0075.UNPROVIDED) {
            var364 = streams_high.file_length(var11);
        }
        SubLObject var365 = (SubLObject)module0075.NIL;
        SubLObject var366 = (SubLObject)module0075.NIL;
        try {
            var366 = streams_high.make_private_string_output_stream();
            f5273(var11, var366, var363, var364);
            var365 = streams_high.get_output_stream_string(var366);
        }
        finally {
            final SubLObject var367 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0075.T);
                streams_high.close(var366, (SubLObject)module0075.UNPROVIDED);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var367);
            }
        }
        return var365;
    }
    
    public static SubLObject f5275(final SubLObject var369) {
        final SubLThread var370 = SubLProcess.currentSubLThread();
        final SubLObject var371 = f5182(module0075.$g1138$.getGlobalValue());
        SubLObject var372 = (SubLObject)module0075.NIL;
        try {
            SubLObject var373 = (SubLObject)module0075.NIL;
            try {
                final SubLObject var374 = stream_macros.$stream_requires_locking$.currentBinding(var370);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)module0075.NIL, var370);
                    var373 = compatibility.open_binary(var371, (SubLObject)module0075.$ic64$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var374, var370);
                }
                if (!var373.isStream()) {
                    Errors.error((SubLObject)module0075.$ic65$, var371);
                }
                final SubLObject var375 = var373;
                final SubLObject var376 = module0021.f1031();
                try {
                    SubLObject var377 = var369;
                    SubLObject var378 = (SubLObject)module0075.NIL;
                    var378 = var377.first();
                    while (module0075.NIL != var377) {
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
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0075.T, var370);
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
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0075.T, var370);
                    if (var373.isStream()) {
                        streams_high.close(var373, (SubLObject)module0075.UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var380, var370);
                }
            }
            SubLObject var374_375 = (SubLObject)module0075.NIL;
            try {
                final SubLObject var381 = stream_macros.$stream_requires_locking$.currentBinding(var370);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)module0075.NIL, var370);
                    var374_375 = compatibility.open_binary(var371, (SubLObject)module0075.$ic104$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var381, var370);
                }
                if (!var374_375.isStream()) {
                    Errors.error((SubLObject)module0075.$ic65$, var371);
                }
                final SubLObject var382 = var374_375;
                final SubLObject var383 = Numbers.integerDivide(Sequences.length(var372), (SubLObject)module0075.TWO_INTEGER);
                SubLObject var384;
                SubLObject var385;
                SubLObject var386;
                SubLObject var387;
                SubLObject var388;
                SubLObject var389;
                SubLObject var390;
                SubLObject var391;
                for (var384 = Numbers.max((SubLObject)module0075.ONE_INTEGER, Numbers.integerDivide(var383, (SubLObject)module0075.THREE_INTEGER)), var385 = (SubLObject)module0075.NIL, var385 = (SubLObject)module0075.ZERO_INTEGER; var385.numL(var384); var385 = Numbers.add(var385, (SubLObject)module0075.ONE_INTEGER)) {
                    var386 = var385;
                    var387 = Numbers.subtract(var383, var385);
                    var388 = f5274(var382, var386, var387);
                    var389 = Numbers.multiply(var386, (SubLObject)module0075.TWO_INTEGER);
                    var390 = Numbers.multiply(var387, (SubLObject)module0075.TWO_INTEGER);
                    var391 = module0038.f2623(var372, var389, var390);
                    if (module0075.NIL == Errors.$ignore_mustsP$.getDynamicValue(var370) && module0075.NIL == Strings.string_equal(var388, var391, (SubLObject)module0075.UNPROVIDED, (SubLObject)module0075.UNPROVIDED, (SubLObject)module0075.UNPROVIDED, (SubLObject)module0075.UNPROVIDED)) {
                        Errors.error((SubLObject)module0075.$ic237$, new SubLObject[] { var391, var386, var387, var372, var388 });
                    }
                }
            }
            finally {
                final SubLObject var392 = Threads.$is_thread_performing_cleanupP$.currentBinding(var370);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0075.T, var370);
                    if (var374_375.isStream()) {
                        streams_high.close(var374_375, (SubLObject)module0075.UNPROVIDED);
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
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0075.T, var370);
                SubLObject var394 = (SubLObject)module0075.NIL;
                try {
                    var370.throwStack.push(module0075.$ic62$);
                    final SubLObject var31_384 = Errors.$error_handler$.currentBinding(var370);
                    try {
                        Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)module0075.$ic63$), var370);
                        try {
                            Filesys.delete_file(var371);
                        }
                        catch (Throwable var395) {
                            Errors.handleThrowable(var395, (SubLObject)module0075.NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(var31_384, var370);
                    }
                }
                catch (Throwable var396) {
                    var394 = Errors.handleThrowable(var396, (SubLObject)module0075.$ic62$);
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
        return (SubLObject)module0075.$ic238$;
    }
    
    public static SubLObject f5276(final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        SubLObject var14 = (SubLObject)module0075.NIL;
        SubLObject var15 = (SubLObject)module0075.NIL;
        try {
            final SubLObject var16 = stream_macros.$stream_requires_locking$.currentBinding(var13);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0075.NIL, var13);
                var15 = compatibility.open_binary(var12, (SubLObject)module0075.$ic104$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var16, var13);
            }
            if (!var15.isStream()) {
                Errors.error((SubLObject)module0075.$ic65$, var12);
            }
            final SubLObject var17 = var15;
            var14 = f5274(var17, (SubLObject)module0075.ZERO_INTEGER, (SubLObject)module0075.UNPROVIDED);
        }
        finally {
            final SubLObject var18 = Threads.$is_thread_performing_cleanupP$.currentBinding(var13);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0075.T, var13);
                if (var15.isStream()) {
                    streams_high.close(var15, (SubLObject)module0075.UNPROVIDED);
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
        SubLObject var370 = (SubLObject)module0075.NIL;
        SubLObject var371 = (SubLObject)module0075.NIL;
        SubLObject var372 = (SubLObject)module0075.NIL;
        try {
            final SubLObject var373 = stream_macros.$stream_requires_locking$.currentBinding(var369);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0075.NIL, var369);
                var372 = compatibility.open_binary(var12, (SubLObject)module0075.$ic64$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var373, var369);
            }
            if (!var372.isStream()) {
                Errors.error((SubLObject)module0075.$ic65$, var12);
            }
            final SubLObject var374 = var372;
            SubLObject var90_389;
            SubLObject var375;
            SubLObject var376;
            SubLObject var377;
            SubLObject var378;
            for (var375 = (var90_389 = Sequences.length(var368)), var376 = (SubLObject)module0075.NIL, var376 = (SubLObject)module0075.ZERO_INTEGER; !var376.numGE(var90_389); var376 = module0048.f_1X(var376)) {
                var377 = Strings.sublisp_char(var368, var376);
                if (module0075.NIL != module0038.f2791(var377)) {
                    if (module0075.NIL == var371) {
                        var371 = var377;
                    }
                    else {
                        var378 = module0037.f2588(var371, var377);
                        streams_high.write_byte(var378, var374);
                        var371 = (SubLObject)module0075.NIL;
                    }
                }
            }
            streams_high.force_output(var374);
            var370 = streams_high.file_length(var374);
        }
        finally {
            final SubLObject var379 = Threads.$is_thread_performing_cleanupP$.currentBinding(var369);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0075.T, var369);
                if (var372.isStream()) {
                    streams_high.close(var372, (SubLObject)module0075.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var379, var369);
            }
        }
        return var370;
    }
    
    public static SubLObject f5278(final SubLObject var392) {
        if (module0075.NIL == streams_high.output_stream_p(var392)) {
            return (SubLObject)module0075.$ic104$;
        }
        if (module0075.NIL != streams_high.input_stream_p(var392)) {
            return (SubLObject)module0075.$ic31$;
        }
        return (SubLObject)module0075.$ic64$;
    }
    
    public static SubLObject f5279(final SubLObject var393, final SubLObject var394) {
        final SubLThread var395 = SubLProcess.currentSubLThread();
        if (module0075.NIL != streams_high.output_stream_p(var393)) {
            streams_high.force_output(var393);
        }
        final SubLObject var396 = streams_high.file_position(var393, (SubLObject)module0075.UNPROVIDED);
        final SubLObject var397 = module0038.f2624(Filesys.probe_file(var393));
        final SubLObject var398 = streams_high.stream_element_type(var393);
        final SubLObject var399 = f5278(var393);
        SubLObject var400 = (SubLObject)module0075.NIL;
        streams_high.close(var393, (SubLObject)module0075.UNPROVIDED);
        final SubLObject var401 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(var395);
        final SubLObject var402 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(var395);
        try {
            StreamsLow.$stream_initial_input_buffer_size$.bind(var394, var395);
            StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(var395), var395);
            if (module0075.$ic29$ == var398) {
                var400 = StreamsLow.open(var397, new SubLObject[] { module0075.$ic30$, var399, module0075.$ic32$, module0075.$ic73$, module0075.$ic33$, module0075.$ic239$, module0075.$ic35$, module0075.$ic29$ });
            }
            else {
                var400 = StreamsLow.open(var397, new SubLObject[] { module0075.$ic30$, var399, module0075.$ic32$, module0075.$ic73$, module0075.$ic33$, module0075.$ic239$, module0075.$ic35$, module0075.$ic68$ });
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
        return (SubLObject)ConsesLow.list((SubLObject)module0075.$ic1$, (SubLObject)module0075.$ic240$, reader.bq_cons((SubLObject)module0075.$ic54$, ConsesLow.append(var5, (SubLObject)module0075.NIL)));
    }
    
    public static SubLObject f5281(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.list((SubLObject)module0075.$ic1$, (SubLObject)module0075.$ic241$, reader.bq_cons((SubLObject)module0075.$ic54$, ConsesLow.append(var5, (SubLObject)module0075.NIL)));
    }
    
    public static SubLObject f5282(final SubLObject var392) {
        return StreamsLow.isMemoryMappedStream(var392);
    }
    
    public static SubLObject f5283(final SubLObject var393) {
        final SubLThread var394 = SubLProcess.currentSubLThread();
        if (module0075.NIL == streams_high.open_stream_p(var393)) {
            return var393;
        }
        if (module0075.NIL != f5282(var393)) {
            return var393;
        }
        if (module0075.NIL != streams_high.output_stream_p(var393)) {
            streams_high.force_output(var393);
        }
        final SubLObject var395 = streams_high.file_position(var393, (SubLObject)module0075.UNPROVIDED);
        final SubLObject var396 = module0038.f2624(Filesys.probe_file(var393));
        final SubLObject var397 = streams_high.stream_element_type(var393);
        final SubLObject var398 = f5278(var393);
        SubLObject var399 = (SubLObject)module0075.NIL;
        streams_high.close(var393, (SubLObject)module0075.UNPROVIDED);
        final SubLObject var400 = StreamsLow.$should_memory_map_files$.currentBinding(var394);
        try {
            StreamsLow.$should_memory_map_files$.bind((SubLObject)module0075.T, var394);
            if (module0075.$ic29$ == var397) {
                var399 = StreamsLow.open(var396, new SubLObject[] { module0075.$ic30$, var398, module0075.$ic32$, module0075.$ic73$, module0075.$ic33$, module0075.$ic239$, module0075.$ic35$, module0075.$ic29$ });
            }
            else {
                var399 = StreamsLow.open(var396, new SubLObject[] { module0075.$ic30$, var398, module0075.$ic32$, module0075.$ic73$, module0075.$ic33$, module0075.$ic239$, module0075.$ic35$, module0075.$ic68$ });
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
        return (SubLObject)module0075.NIL;
    }
    
    public static SubLObject f5285() {
        module0075.$g1138$ = SubLFiles.deflexical("S#6889", module0073.f5143((SubLObject)(module0075.$ic22$.isSymbol() ? Symbols.symbol_value((SubLObject)module0075.$ic22$) : module0075.$ic22$), (SubLObject)module0075.$ic23$, (SubLObject)(module0075.$ic24$.isSymbol() ? Symbols.symbol_value((SubLObject)module0075.$ic24$) : module0075.$ic24$), (SubLObject)module0075.$ic25$, (SubLObject)module0075.UNPROVIDED));
        module0075.$g1139$ = SubLFiles.deflexical("S#6890", (SubLObject)module0075.$ic26$);
        return (SubLObject)module0075.NIL;
    }
    
    public static SubLObject f5286() {
        module0002.f35((SubLObject)module0075.$ic39$, (SubLObject)module0075.$ic56$);
        module0002.f50((SubLObject)module0075.$ic78$, (SubLObject)module0075.$ic81$);
        module0002.f50((SubLObject)module0075.$ic91$, (SubLObject)module0075.$ic87$);
        module0027.f1449((SubLObject)module0075.$ic229$, (SubLObject)ConsesLow.list(new SubLObject[] { module0075.$ic230$, module0075.NIL, module0075.$ic231$, module0075.NIL, module0075.$ic232$, module0075.NIL, module0075.$ic233$, module0075.$ic234$, module0075.$ic235$, module0075.T }), (SubLObject)module0075.$ic236$);
        return (SubLObject)module0075.NIL;
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
        module0075.$g1138$ = null;
        module0075.$g1139$ = null;
        $ic0$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1534", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic1$ = SubLObjectFactory.makeSymbol("CLET");
        $ic2$ = SubLObjectFactory.makeSymbol("*STREAM-INITIAL-INPUT-BUFFER-SIZE*");
        $ic3$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*STREAM-INITIAL-OUTPUT-BUFFER-SIZE*"), (SubLObject)SubLObjectFactory.makeSymbol("*STREAM-INITIAL-INPUT-BUFFER-SIZE*")));
        $ic4$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("*STREAM-INITIAL-INPUT-BUFFER-SIZE*"), (SubLObject)SubLObjectFactory.makeSymbol("*STREAM-INITIAL-OUTPUT-BUFFER-SIZE*"));
        $ic5$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("S#885", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5432", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic6$ = SubLObjectFactory.makeUninternedSymbol("US#2150FF3");
        $ic7$ = SubLObjectFactory.makeSymbol("PIF");
        $ic8$ = SubLObjectFactory.makeSymbol("WITH-TEXT-FILE");
        $ic9$ = ConsesLow.list((SubLObject)module0075.NIL);
        $ic10$ = SubLObjectFactory.makeUninternedSymbol("US#2150FF3");
        $ic11$ = SubLObjectFactory.makeSymbol("WITH-PRIVATE-TEXT-FILE");
        $ic12$ = SubLObjectFactory.makeUninternedSymbol("US#2150FF3");
        $ic13$ = SubLObjectFactory.makeSymbol("WITH-BINARY-FILE");
        $ic14$ = SubLObjectFactory.makeUninternedSymbol("US#2150FF3");
        $ic15$ = SubLObjectFactory.makeSymbol("WITH-PRIVATE-BINARY-FILE");
        $ic16$ = SubLObjectFactory.makeKeyword("EOF");
        $ic17$ = SubLObjectFactory.makeSymbol("S#38", "CYC");
        $ic18$ = SubLObjectFactory.makeSymbol("LISTP");
        $ic19$ = SubLObjectFactory.makeString("");
        $ic20$ = SubLObjectFactory.makeString(".");
        $ic21$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic22$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rck.please.put.this.in.the.right.place"));
        $ic23$ = SubLObjectFactory.makeSymbol("S#6889", "CYC");
        $ic24$ = SubLObjectFactory.makeString("/tmp/");
        $ic25$ = SubLObjectFactory.makeKeyword("LEXICAL");
        $ic26$ = SubLObjectFactory.makeString("0123456789abcdefghijklmnopqrstuvwxyz");
        $ic27$ = SubLObjectFactory.makeInteger(36);
        $ic28$ = SubLObjectFactory.makeString("tmp");
        $ic29$ = SubLObjectFactory.makeKeyword("TEXT");
        $ic30$ = SubLObjectFactory.makeKeyword("DIRECTION");
        $ic31$ = SubLObjectFactory.makeKeyword("IO");
        $ic32$ = SubLObjectFactory.makeKeyword("IF-EXISTS");
        $ic33$ = SubLObjectFactory.makeKeyword("IF-DOES-NOT-EXIST");
        $ic34$ = SubLObjectFactory.makeKeyword("CREATE");
        $ic35$ = SubLObjectFactory.makeKeyword("ELEMENT-TYPE");
        $ic36$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6891", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("TEXT"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic37$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ELEMENT-TYPE"));
        $ic38$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic39$ = SubLObjectFactory.makeSymbol("S#6799", "CYC");
        $ic40$ = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
        $ic41$ = SubLObjectFactory.makeSymbol("PWHEN");
        $ic42$ = SubLObjectFactory.makeSymbol("STREAMP");
        $ic43$ = SubLObjectFactory.makeSymbol("DELETE-FILE");
        $ic44$ = SubLObjectFactory.makeSymbol("CLOSE");
        $ic45$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("S#885", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6891", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("TEXT"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic46$ = SubLObjectFactory.makeSymbol("FORCE-OUTPUT");
        $ic47$ = SubLObjectFactory.makeSymbol("PROBE-FILE");
        $ic48$ = SubLObjectFactory.makeSymbol("S#6892", "CYC");
        $ic49$ = SubLObjectFactory.makeSymbol("S#746", "CYC");
        $ic50$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#885", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DIRECTORY"), (SubLObject)SubLObjectFactory.makeSymbol("S#6889", "CYC"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic51$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DIRECTORY"));
        $ic52$ = SubLObjectFactory.makeKeyword("DIRECTORY");
        $ic53$ = SubLObjectFactory.makeSymbol("S#6792", "CYC");
        $ic54$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic55$ = SubLObjectFactory.makeSymbol("IGNORE-ERRORS");
        $ic56$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6795", "CYC"));
        $ic57$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6891", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("TEXT"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic58$ = SubLObjectFactory.makeSymbol("S#6800", "CYC");
        $ic59$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6796", "CYC"));
        $ic60$ = SubLObjectFactory.makeSymbol("S#6796", "CYC");
        $ic61$ = SubLObjectFactory.makeSymbol("INTEGERP");
        $ic62$ = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $ic63$ = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic64$ = SubLObjectFactory.makeKeyword("OUTPUT");
        $ic65$ = SubLObjectFactory.makeString("Unable to open ~S");
        $ic66$ = SubLObjectFactory.makeSymbol("READ-CHAR");
        $ic67$ = SubLObjectFactory.makeSymbol("WRITE-CHAR");
        $ic68$ = SubLObjectFactory.makeKeyword("BINARY");
        $ic69$ = SubLObjectFactory.makeKeyword("DEFAULT");
        $ic70$ = SubLObjectFactory.makeSymbol("READ-BYTE");
        $ic71$ = SubLObjectFactory.makeSymbol("WRITE-BYTE");
        $ic72$ = SubLObjectFactory.makeString("~S is not a valid mode.");
        $ic73$ = SubLObjectFactory.makeKeyword("APPEND");
        $ic74$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#54", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2813", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic75$ = SubLObjectFactory.makeUninternedSymbol("US#52B2EDB");
        $ic76$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INPUT"));
        $ic77$ = SubLObjectFactory.makeSymbol("CDO");
        $ic78$ = SubLObjectFactory.makeSymbol("S#6807", "CYC");
        $ic79$ = SubLObjectFactory.makeSymbol("COR");
        $ic80$ = SubLObjectFactory.makeSymbol("NULL");
        $ic81$ = SubLObjectFactory.makeSymbol("S#6806", "CYC");
        $ic82$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6893", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#6894", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic83$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LINE-NUMBER"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $ic84$ = SubLObjectFactory.makeKeyword("LINE-NUMBER");
        $ic85$ = SubLObjectFactory.makeKeyword("DONE");
        $ic86$ = SubLObjectFactory.makeUninternedSymbol("US#23AA01E");
        $ic87$ = SubLObjectFactory.makeSymbol("S#6808", "CYC");
        $ic88$ = SubLObjectFactory.makeUninternedSymbol("US#4E0B20C");
        $ic89$ = SubLObjectFactory.makeSymbol("SYMBOLP");
        $ic90$ = SubLObjectFactory.makeSymbol("1+");
        $ic91$ = SubLObjectFactory.makeSymbol("S#6809", "CYC");
        $ic92$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6893", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2813", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#6894", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#130", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic93$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LINE-NUMBER"), (SubLObject)SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $ic94$ = SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE");
        $ic95$ = SubLObjectFactory.makeUninternedSymbol("US#113B606");
        $ic96$ = SubLObjectFactory.makeUninternedSymbol("US#4E0B20C");
        $ic97$ = SubLObjectFactory.makeUninternedSymbol("US#113B606");
        $ic98$ = SubLObjectFactory.makeUninternedSymbol("US#4E0B20C");
        $ic99$ = SubLObjectFactory.makeUninternedSymbol("US#4A50089");
        $ic100$ = SubLObjectFactory.makeSymbol("NOTING-PERCENT-PROGRESS");
        $ic101$ = SubLObjectFactory.makeSymbol("FILE-LENGTH");
        $ic102$ = SubLObjectFactory.makeSymbol("NOTE-PERCENT-PROGRESS");
        $ic103$ = SubLObjectFactory.makeSymbol("FILE-POSITION");
        $ic104$ = SubLObjectFactory.makeKeyword("INPUT");
        $ic105$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6895", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2813", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6896", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)Characters.CHAR_comma))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6897", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeString("\""), (SubLObject)SubLObjectFactory.makeString("\""))))), (SubLObject)SubLObjectFactory.makeSymbol("S#6898", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6899", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6900", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)Characters.CHAR_backslash)))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic106$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BREAK-LIST"), (SubLObject)SubLObjectFactory.makeKeyword("EMBED-LIST"), (SubLObject)SubLObjectFactory.makeKeyword("INCLUDE-STOPS"), (SubLObject)SubLObjectFactory.makeKeyword("IGNORE-EMPTY-STRINGS"), (SubLObject)SubLObjectFactory.makeKeyword("QUOTE-CHARS"));
        $ic107$ = SubLObjectFactory.makeKeyword("BREAK-LIST");
        $ic108$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)Characters.CHAR_comma);
        $ic109$ = SubLObjectFactory.makeKeyword("EMBED-LIST");
        $ic110$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeString("\""), (SubLObject)SubLObjectFactory.makeString("\"")));
        $ic111$ = SubLObjectFactory.makeKeyword("INCLUDE-STOPS");
        $ic112$ = SubLObjectFactory.makeKeyword("IGNORE-EMPTY-STRINGS");
        $ic113$ = SubLObjectFactory.makeKeyword("QUOTE-CHARS");
        $ic114$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)Characters.CHAR_backslash);
        $ic115$ = SubLObjectFactory.makeUninternedSymbol("US#52660D5");
        $ic116$ = SubLObjectFactory.makeSymbol("S#6810", "CYC");
        $ic117$ = SubLObjectFactory.makeSymbol("S#4195", "CYC");
        $ic118$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2813", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6896", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAPCAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("S#746", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#4140", "CYC"))))), (SubLObject)SubLObjectFactory.makeSymbol("S#6897", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6898", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6899", "CYC"), (SubLObject)module0075.T), (SubLObject)SubLObjectFactory.makeSymbol("S#6900", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("S#1983", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic119$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAPCAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("S#746", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#4140", "CYC")));
        $ic120$ = SubLObjectFactory.makeUninternedSymbol("US#52660D5");
        $ic121$ = SubLObjectFactory.makeSymbol("CDESTRUCTURING-BIND");
        $ic122$ = SubLObjectFactory.makeSymbol("MAPCAR");
        $ic123$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("READ-FROM-STRING"));
        $ic124$ = SubLObjectFactory.makeUninternedSymbol("US#52660D5");
        $ic125$ = SubLObjectFactory.makeUninternedSymbol("US#4F54438");
        $ic126$ = SubLObjectFactory.makeUninternedSymbol("US#4EC6600");
        $ic127$ = ConsesLow.list((SubLObject)module0075.ZERO_INTEGER);
        $ic128$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)module0075.NIL));
        $ic129$ = SubLObjectFactory.makeSymbol("WHILE");
        $ic130$ = SubLObjectFactory.makeSymbol("<");
        $ic131$ = SubLObjectFactory.makeSymbol("LENGTH");
        $ic132$ = SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-BIND");
        $ic133$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#143", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6901", "CYC"));
        $ic134$ = SubLObjectFactory.makeSymbol("READ-FROM-STRING");
        $ic135$ = SubLObjectFactory.makeSymbol("CPUSH");
        $ic136$ = SubLObjectFactory.makeSymbol("S#143", "CYC");
        $ic137$ = SubLObjectFactory.makeSymbol("CSETQ");
        $ic138$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6901", "CYC"));
        $ic139$ = SubLObjectFactory.makeSymbol("NREVERSE");
        $ic140$ = SubLObjectFactory.makeSymbol("PUNLESS");
        $ic141$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6902", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2813", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6903", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("S#4151", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6904", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("FALSE")))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic142$ = SubLObjectFactory.makeSymbol("S#4151", "CYC");
        $ic143$ = SubLObjectFactory.makeSymbol("FALSE");
        $ic144$ = SubLObjectFactory.makeUninternedSymbol("US#70B218F");
        $ic145$ = SubLObjectFactory.makeUninternedSymbol("US#52660D5");
        $ic146$ = SubLObjectFactory.makeSymbol("INPUT-STREAM-P");
        $ic147$ = SubLObjectFactory.makeSymbol("S#4158", "CYC");
        $ic148$ = ConsesLow.list((SubLObject)module0075.NIL, (SubLObject)module0075.NIL);
        $ic149$ = SubLObjectFactory.makeSymbol("FUNCALL");
        $ic150$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6905", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTORY"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6906", "CYC"), (SubLObject)module0075.T), (SubLObject)SubLObjectFactory.makeSymbol("S#130", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6907", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic151$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INCLUDE-DIRECTORY?"), (SubLObject)SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"), (SubLObject)SubLObjectFactory.makeKeyword("SORT-FN"));
        $ic152$ = SubLObjectFactory.makeKeyword("INCLUDE-DIRECTORY?");
        $ic153$ = SubLObjectFactory.makeKeyword("SORT-FN");
        $ic154$ = SubLObjectFactory.makeUninternedSymbol("US#76B99C0");
        $ic155$ = SubLObjectFactory.makeUninternedSymbol("US#2BAAEA1");
        $ic156$ = SubLObjectFactory.makeSymbol("CHECK-TYPE");
        $ic157$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DIRECTORY-P"));
        $ic158$ = SubLObjectFactory.makeSymbol("DIRECTORY");
        $ic159$ = SubLObjectFactory.makeSymbol("*SILENT-PROGRESS?*");
        $ic160$ = SubLObjectFactory.makeSymbol("CNOT");
        $ic161$ = SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P");
        $ic162$ = SubLObjectFactory.makeSymbol("SORT");
        $ic163$ = SubLObjectFactory.makeSymbol("S#480", "CYC");
        $ic164$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6908", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTORY"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6906", "CYC"), (SubLObject)module0075.T)), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic165$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INCLUDE-DIRECTORY?"));
        $ic166$ = SubLObjectFactory.makeSymbol("S#6816", "CYC");
        $ic167$ = SubLObjectFactory.makeSymbol("DIRECTORY-P");
        $ic168$ = SubLObjectFactory.makeSymbol("S#534", "CYC");
        $ic169$ = SubLObjectFactory.makeSymbol("ENDS-WITH");
        $ic170$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("/"));
        $ic171$ = SubLObjectFactory.makeSymbol("CCONCATENATE");
        $ic172$ = SubLObjectFactory.makeString("/");
        $ic173$ = SubLObjectFactory.makeSymbol("S#3993", "CYC");
        $ic174$ = ConsesLow.list((SubLObject)Characters.CHAR_slash);
        $ic175$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6905", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTORY"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6906", "CYC"), (SubLObject)module0075.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#130", "CYC"), (SubLObject)SubLObjectFactory.makeString("Processing directory tree files..."))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic176$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INCLUDE-DIRECTORY?"), (SubLObject)SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE"));
        $ic177$ = SubLObjectFactory.makeString("Processing directory tree files...");
        $ic178$ = SubLObjectFactory.makeUninternedSymbol("US#2A839A");
        $ic179$ = SubLObjectFactory.makeUninternedSymbol("US#608C54A");
        $ic180$ = SubLObjectFactory.makeSymbol("LIST");
        $ic181$ = SubLObjectFactory.makeSymbol("FIRST");
        $ic182$ = SubLObjectFactory.makeSymbol("CPOP");
        $ic183$ = SubLObjectFactory.makeSymbol("FWHEN");
        $ic184$ = SubLObjectFactory.makeSymbol("S#176", "CYC");
        $ic185$ = SubLObjectFactory.makeString("~% Directory: ~S");
        $ic186$ = SubLObjectFactory.makeSymbol("SECOND");
        $ic187$ = SubLObjectFactory.makeSymbol("FILE-WRITE-DATE");
        $ic188$ = SubLObjectFactory.makeString("\\");
        $ic189$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("/"), (SubLObject)SubLObjectFactory.makeString("\\"));
        $ic190$ = SubLObjectFactory.makeString("Could not find ~A");
        $ic191$ = SubLObjectFactory.makeString("Could not find ~A~A");
        $ic192$ = SubLObjectFactory.makeString("File not found.");
        $ic193$ = SubLObjectFactory.makeString("File not found from directory ~A");
        $ic194$ = SubLObjectFactory.makeKeyword("UNIX");
        $ic195$ = SubLObjectFactory.makeKeyword("DOS");
        $ic196$ = SubLObjectFactory.makeString("\\\\");
        $ic197$ = SubLObjectFactory.makeKeyword("MAC");
        $ic198$ = SubLObjectFactory.makeString(":");
        $ic199$ = SubLObjectFactory.makeString("Path type mismatch.");
        $ic200$ = SubLObjectFactory.makeString("..");
        $ic201$ = SubLObjectFactory.makeString("Cannot make relative path ~A even more relative ....");
        $ic202$ = SubLObjectFactory.makeString("Cannot strip non-absolute prefix ~A from path ~A.");
        $ic203$ = SubLObjectFactory.makeString("Warning: unable to read file ~s~%");
        $ic204$ = SubLObjectFactory.makeString("make-directory-recursive: could not create ~A since it exists as a file.");
        $ic205$ = SubLObjectFactory.makeString("chmod");
        $ic206$ = SubLObjectFactory.makeString("ln");
        $ic207$ = SubLObjectFactory.makeString("-s");
        $ic208$ = SubLObjectFactory.makeString("I'm alive!~%");
        $ic209$ = SubLObjectFactory.makeString("Could not make directory ~a with path ~a");
        $ic210$ = SubLObjectFactory.makeString("File already exists: ~A~%");
        $ic211$ = SubLObjectFactory.makeSymbol("PRINT");
        $ic212$ = SubLObjectFactory.makeSymbol("OPEN-TEXT");
        $ic213$ = SubLObjectFactory.makeSymbol("OPEN-BINARY");
        $ic214$ = SubLObjectFactory.makeString("Cannot open ~A for writing.~%");
        $ic215$ = SubLObjectFactory.makeSymbol("S#6872", "CYC");
        $ic216$ = SubLObjectFactory.makeSymbol("S#6873", "CYC");
        $ic217$ = SubLObjectFactory.makeSymbol("S#6874", "CYC");
        $ic218$ = SubLObjectFactory.makeSymbol("S#6875", "CYC");
        $ic219$ = SubLObjectFactory.makeSymbol("S#6876", "CYC");
        $ic220$ = SubLObjectFactory.makeKeyword("STREAM");
        $ic221$ = SubLObjectFactory.makeKeyword("WRITER");
        $ic222$ = SubLObjectFactory.makeKeyword("ITEM-COUNT");
        $ic223$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#3266", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("S#6909", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6910", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic224$ = SubLObjectFactory.makeSymbol("&KEY");
        $ic225$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("S#6909", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6910", "CYC"));
        $ic226$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("STREAM"), (SubLObject)SubLObjectFactory.makeKeyword("WRITER"), (SubLObject)SubLObjectFactory.makeKeyword("ITEM-COUNT"));
        $ic227$ = SubLObjectFactory.makeString("Operation not supported for file accumulator ~A.");
        $ic228$ = SubLObjectFactory.makeString("Operation not yet supported for file accumulator ~A");
        $ic229$ = SubLObjectFactory.makeSymbol("S#6880", "CYC");
        $ic230$ = SubLObjectFactory.makeKeyword("TEST");
        $ic231$ = SubLObjectFactory.makeKeyword("OWNER");
        $ic232$ = SubLObjectFactory.makeKeyword("CLASSES");
        $ic233$ = SubLObjectFactory.makeKeyword("KB");
        $ic234$ = SubLObjectFactory.makeKeyword("TINY");
        $ic235$ = SubLObjectFactory.makeKeyword("WORKING?");
        $ic236$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("abc"), (SubLObject)SubLObjectFactory.makeInteger(123), (SubLObject)ConsesLow.list((SubLObject)module0075.ONE_INTEGER, (SubLObject)module0075.TWO_INTEGER, (SubLObject)module0075.THREE_INTEGER))), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")));
        $ic237$ = SubLObjectFactory.makeString("Expected ~S, which is [~A,~A) of ~S, got ~S back.");
        $ic238$ = SubLObjectFactory.makeKeyword("SUCCESS");
        $ic239$ = SubLObjectFactory.makeKeyword("ERROR");
        $ic240$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SHOULD-MEMORY-MAP-FILES?*", "SUBLISP"), (SubLObject)module0075.T));
        $ic241$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SHOULD-MEMORY-MAP-FILES?*", "SUBLISP")));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0075.class
	Total time: 1009 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/