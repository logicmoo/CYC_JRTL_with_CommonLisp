package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0360 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0360";
    public static final String myFingerPrint = "092cb2aedff833192ee9e7a8027324f429bbaa631dabe57e79f8f34fa7605d9f";
    private static SubLSymbol $g3018$;
    private static SubLSymbol $g3019$;
    private static SubLSymbol $g3020$;
    private static SubLSymbol $g3021$;
    private static SubLSymbol $g3022$;
    private static SubLSymbol $g3023$;
    private static SubLSymbol $g3024$;
    private static SubLSymbol $g3025$;
    private static SubLSymbol $g3026$;
    private static SubLSymbol $g3027$;
    private static SubLSymbol $g3028$;
    private static SubLSymbol $g3029$;
    private static SubLSymbol $g3030$;
    private static SubLSymbol $g3031$;
    public static SubLSymbol $g3032$;
    public static SubLSymbol $g3033$;
    public static SubLSymbol $g3034$;
    public static SubLSymbol $g3036$;
    public static SubLSymbol $g3037$;
    public static SubLSymbol $g3038$;
    public static SubLSymbol $g3039$;
    public static SubLSymbol $g3040$;
    private static SubLSymbol $g3041$;
    public static SubLSymbol $g3042$;
    private static SubLSymbol $g3043$;
    public static SubLSymbol $g3044$;
    public static SubLSymbol $g3045$;
    private static SubLSymbol $g3046$;
    public static SubLSymbol $g3047$;
    private static SubLSymbol $g3048$;
    private static SubLSymbol $g3049$;
    private static SubLSymbol $g3050$;
    private static SubLSymbol $g3051$;
    private static SubLSymbol $g3052$;
    private static SubLSymbol $g3053$;
    private static SubLSymbol $g3054$;
    private static SubLSymbol $g3056$;
    private static SubLSymbol $g3057$;
    private static SubLSymbol $g3058$;
    private static SubLSymbol $g3059$;
    private static SubLSymbol $g3060$;
    private static SubLSymbol $g3061$;
    private static SubLSymbol $g3062$;
    private static SubLSymbol $g3063$;
    private static SubLSymbol $g3064$;
    private static SubLSymbol $g3065$;
    private static SubLSymbol $g3066$;
    private static SubLSymbol $g3067$;
    public static SubLSymbol $g3068$;
    public static SubLSymbol $g3069$;
    public static SubLSymbol $g3035$;
    private static SubLSymbol $g3070$;
    private static SubLSymbol $g3071$;
    private static SubLSymbol $g3072$;
    public static SubLSymbol $g3073$;
    private static SubLSymbol $g3074$;
    public static SubLSymbol $g3075$;
    private static SubLSymbol $g3076$;
    private static SubLSymbol $g3077$;
    private static SubLSymbol $g3078$;
    public static SubLSymbol $g3079$;
    private static SubLSymbol $g3080$;
    private static SubLSymbol $g3081$;
    public static SubLSymbol $g3082$;
    private static SubLSymbol $g3083$;
    private static SubLSymbol $g3084$;
    private static SubLSymbol $g3085$;
    private static SubLSymbol $g3086$;
    private static SubLSymbol $g3087$;
    private static SubLSymbol $g3088$;
    private static SubLSymbol $g3089$;
    private static SubLSymbol $g3090$;
    private static SubLSymbol $g3091$;
    private static SubLSymbol $g3092$;
    private static SubLSymbol $g3093$;
    private static SubLSymbol $g3094$;
    public static SubLSymbol $g3095$;
    private static SubLSymbol $g3096$;
    public static SubLSymbol $g3097$;
    private static SubLSymbol $g3098$;
    public static SubLSymbol $g3099$;
    private static SubLSymbol $g3100$;
    public static SubLSymbol $g3101$;
    private static SubLSymbol $g3102$;
    private static SubLSymbol $g3103$;
    public static SubLSymbol $g3104$;
    public static SubLSymbol $g3105$;
    private static SubLSymbol $g3106$;
    private static SubLSymbol $g3107$;
    private static SubLSymbol $g3055$;
    private static SubLSymbol $g3108$;
    private static SubLSymbol $g3109$;
    private static SubLSymbol $g3110$;
    public static SubLSymbol $g3111$;
    public static SubLSymbol $g3112$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLString $ic2$;
    private static final SubLList $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLList $ic7$;
    private static final SubLList $ic8$;
    private static final SubLList $ic9$;
    private static final SubLList $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLList $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLList $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLInteger $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLList $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLList $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLList $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLInteger $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLList $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLList $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLList $ic57$;
    private static final SubLList $ic58$;
    private static final SubLList $ic59$;
    private static final SubLList $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLList $ic64$;
    private static final SubLList $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLList $ic70$;
    private static final SubLList $ic71$;
    private static final SubLList $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLList $ic74$;
    private static final SubLString $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
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
    private static final SubLList $ic93$;
    private static final SubLList $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLList $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLList $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLList $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLInteger $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLList $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLList $ic110$;
    private static final SubLList $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLSymbol $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLString $ic118$;
    private static final SubLList $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLSymbol $ic121$;
    private static final SubLString $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLString $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLString $ic126$;
    private static final SubLSymbol $ic127$;
    private static final SubLString $ic128$;
    private static final SubLString $ic129$;
    private static final SubLSymbol $ic130$;
    private static final SubLSymbol $ic131$;
    private static final SubLList $ic132$;
    private static final SubLSymbol $ic133$;
    private static final SubLList $ic134$;
    private static final SubLList $ic135$;
    private static final SubLList $ic136$;
    private static final SubLSymbol $ic137$;
    private static final SubLSymbol $ic138$;
    private static final SubLString $ic139$;
    private static final SubLSymbol $ic140$;
    private static final SubLString $ic141$;
    private static final SubLSymbol $ic142$;
    private static final SubLString $ic143$;
    private static final SubLString $ic144$;
    private static final SubLString $ic145$;
    private static final SubLString $ic146$;
    private static final SubLString $ic147$;
    private static final SubLList $ic148$;
    private static final SubLList $ic149$;
    private static final SubLSymbol $ic150$;
    private static final SubLSymbol $ic151$;
    private static final SubLString $ic152$;
    private static final SubLList $ic153$;
    private static final SubLSymbol $ic154$;
    private static final SubLSymbol $ic155$;
    private static final SubLSymbol $ic156$;
    private static final SubLSymbol $ic157$;
    private static final SubLList $ic158$;
    private static final SubLSymbol $ic159$;
    private static final SubLSymbol $ic160$;
    private static final SubLList $ic161$;
    private static final SubLSymbol $ic162$;
    private static final SubLList $ic163$;
    private static final SubLSymbol $ic164$;
    private static final SubLSymbol $ic165$;
    private static final SubLList $ic166$;
    private static final SubLSymbol $ic167$;
    private static final SubLSymbol $ic168$;
    private static final SubLSymbol $ic169$;
    private static final SubLList $ic170$;
    private static final SubLSymbol $ic171$;
    private static final SubLList $ic172$;
    private static final SubLSymbol $ic173$;
    private static final SubLSymbol $ic174$;
    private static final SubLSymbol $ic175$;
    private static final SubLSymbol $ic176$;
    private static final SubLSymbol $ic177$;
    private static final SubLSymbol $ic178$;
    private static final SubLSymbol $ic179$;
    private static final SubLSymbol $ic180$;
    private static final SubLSymbol $ic181$;
    private static final SubLSymbol $ic182$;
    
    public static SubLObject f23781(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != f23782(var1) || NIL != f23783(var1));
    }
    
    public static SubLObject f23784(final SubLObject var1) {
        return module0035.f2331(var1, (SubLObject)$ic0$);
    }
    
    public static SubLObject f23785() {
        return ConsesLow.nconc(f23786(), f23787());
    }
    
    public static SubLObject f23788(SubLObject var2, final SubLObject var3) {
        if (NIL != var3) {
            var2 = conses_high.copy_list(var2);
            SubLObject var4;
            SubLObject var5;
            SubLObject var6;
            for (var4 = (SubLObject)NIL, var4 = var3; NIL != var4; var4 = conses_high.cddr(var4)) {
                var5 = var4.first();
                var6 = conses_high.cadr(var4);
                var2 = conses_high.putf(var2, var5, var6);
            }
        }
        return var2;
    }
    
    public static SubLObject f23782(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != f23789(var1) || NIL != f23790(var1) || NIL != f23791(var1));
    }
    
    public static SubLObject f23792(final SubLObject var1) {
        return module0035.f2331(var1, (SubLObject)$ic4$);
    }
    
    public static SubLObject f23793(final SubLObject var8) {
        return module0035.f2329(var8, (SubLObject)$ic4$);
    }
    
    public static SubLObject f23786() {
        return ConsesLow.nconc(f23794(), f23795(), f23796());
    }
    
    public static SubLObject f23797(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != f23782(var1) || NIL != f23798(var1));
    }
    
    public static SubLObject f23799(final SubLObject var1) {
        return module0035.f2331(var1, (SubLObject)$ic5$);
    }
    
    public static SubLObject f23800(final SubLObject var8) {
        return module0035.f2329(var8, (SubLObject)$ic5$);
    }
    
    public static SubLObject f23783(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != f23801(var1) || NIL != f23802(var1) || NIL != f23803(var1));
    }
    
    public static SubLObject f23804(final SubLObject var1) {
        return module0035.f2331(var1, (SubLObject)$ic6$);
    }
    
    public static SubLObject f23805(final SubLObject var8) {
        return module0035.f2329(var8, (SubLObject)$ic6$);
    }
    
    public static SubLObject f23787() {
        return ConsesLow.nconc(f23806(), f23807(), f23808());
    }
    
    public static SubLObject f23809(final SubLObject var1) {
        return (SubLObject)makeBoolean(var1.isKeyword() && (NIL != module0035.f2169(var1, $g3018$.getGlobalValue()) || NIL != module0035.f2169(var1, $g3019$.getGlobalValue()) || NIL != module0413.f28745(var1)));
    }
    
    public static SubLObject f23810(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != f23809(var1) && NIL == module0004.f104(var1, $g3019$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f23811() {
        return ConsesLow.append(module0413.f28746(), $g3018$.getGlobalValue(), $g3019$.getGlobalValue());
    }
    
    public static SubLObject f23812(final SubLObject var1) {
        return module0035.f2169(var1, $g3020$.getGlobalValue());
    }
    
    public static SubLObject f23813() {
        return conses_high.copy_list($g3020$.getGlobalValue());
    }
    
    public static SubLObject f23814(final SubLObject var1) {
        return module0035.f2169(var1, $g3021$.getGlobalValue());
    }
    
    public static SubLObject f23815(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != f23789(var1) || NIL != f23801(var1));
    }
    
    public static SubLObject f23816(final SubLObject var1) {
        return module0035.f2331(var1, (SubLObject)$ic11$);
    }
    
    public static SubLObject f23789(final SubLObject var1) {
        return module0035.f2169(var1, $g3022$.getGlobalValue());
    }
    
    public static SubLObject f23817(final SubLObject var1) {
        return module0035.f2331(var1, (SubLObject)$ic13$);
    }
    
    public static SubLObject f23818(final SubLObject var8) {
        return module0035.f2329(var8, (SubLObject)$ic13$);
    }
    
    public static SubLObject f23794() {
        return conses_high.copy_list($g3022$.getGlobalValue());
    }
    
    public static SubLObject f23819(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != f23789(var1) || NIL != f23798(var1));
    }
    
    public static SubLObject f23820(final SubLObject var1) {
        return module0035.f2331(var1, (SubLObject)$ic14$);
    }
    
    public static SubLObject f23821(final SubLObject var8) {
        return module0035.f2329(var8, (SubLObject)$ic14$);
    }
    
    public static SubLObject f23822(final SubLObject var8) {
        final SubLObject var9 = conses_high.getf(var8, (SubLObject)$ic15$, (SubLObject)NIL);
        if (NIL != module0004.f106(var9)) {
            return module0361.f23997(var9);
        }
        return var9;
    }
    
    public static SubLObject f23823(final SubLObject var8) {
        return conses_high.getf(var8, (SubLObject)$ic16$, $g3023$.getGlobalValue());
    }
    
    public static SubLObject f23824(final SubLObject var8) {
        return conses_high.getf(var8, (SubLObject)$ic17$, $g3024$.getGlobalValue());
    }
    
    public static SubLObject f23825(final SubLObject var8) {
        return conses_high.getf(var8, (SubLObject)$ic18$, $g3025$.getGlobalValue());
    }
    
    public static SubLObject f23826(final SubLObject var8) {
        return conses_high.getf(var8, (SubLObject)$ic19$, $g3026$.getGlobalValue());
    }
    
    public static SubLObject f23827(final SubLObject var8) {
        return conses_high.getf(var8, (SubLObject)$ic21$, $g3027$.getGlobalValue());
    }
    
    public static SubLObject f23828(final SubLObject var8) {
        return conses_high.getf(var8, (SubLObject)$ic23$, $g3028$.getGlobalValue());
    }
    
    public static SubLObject f23829(final SubLObject var8) {
        return conses_high.getf(var8, (SubLObject)$ic24$, $g3029$.getGlobalValue());
    }
    
    public static SubLObject f23830(final SubLObject var8) {
        return conses_high.getf(var8, (SubLObject)$ic25$, $g3030$.getGlobalValue());
    }
    
    public static SubLObject f23831(final SubLObject var1) {
        return module0035.f2169(var1, $g3031$.getGlobalValue());
    }
    
    public static SubLObject f23832(final SubLObject var1) {
        return module0035.f2331(var1, (SubLObject)$ic27$);
    }
    
    public static SubLObject f23833(final SubLObject var8) {
        return module0035.f2329(var8, (SubLObject)$ic27$);
    }
    
    public static SubLObject f23834(final SubLObject var8) {
        return conses_high.getf(var8, (SubLObject)$ic28$, $g3032$.getGlobalValue());
    }
    
    public static SubLObject f23835(final SubLObject var8) {
        return conses_high.getf(var8, (SubLObject)$ic29$, $g3033$.getGlobalValue());
    }
    
    public static SubLObject f23836(final SubLObject var8) {
        return conses_high.getf(var8, (SubLObject)$ic30$, $g3034$.getGlobalValue());
    }
    
    public static SubLObject f23837(final SubLObject var8) {
        return conses_high.getf(var8, (SubLObject)$ic31$, $g3035$.getGlobalValue());
    }
    
    public static SubLObject f23838(final SubLObject var8) {
        return conses_high.getf(var8, (SubLObject)$ic32$, $g3036$.getGlobalValue());
    }
    
    public static SubLObject f23839(final SubLObject var8) {
        return conses_high.getf(var8, (SubLObject)$ic33$, $g3037$.getGlobalValue());
    }
    
    public static SubLObject f23840(final SubLObject var8) {
        return conses_high.getf(var8, (SubLObject)$ic34$, $g3038$.getGlobalValue());
    }
    
    public static SubLObject f23841(final SubLObject var8) {
        return conses_high.getf(var8, (SubLObject)$ic36$, $g3039$.getGlobalValue());
    }
    
    public static SubLObject f23842(final SubLObject var8) {
        return conses_high.getf(var8, (SubLObject)$ic37$, $g3040$.getGlobalValue());
    }
    
    public static SubLObject f23801(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != f23831(var1) || NIL != module0035.f2169(var1, $g3041$.getGlobalValue()));
    }
    
    public static SubLObject f23843(final SubLObject var1) {
        return module0035.f2331(var1, (SubLObject)$ic39$);
    }
    
    public static SubLObject f23844(final SubLObject var8) {
        return module0035.f2329(var8, (SubLObject)$ic39$);
    }
    
    public static SubLObject f23806() {
        return ConsesLow.nconc(conses_high.copy_list($g3041$.getGlobalValue()), conses_high.copy_list($g3031$.getGlobalValue()));
    }
    
    public static SubLObject f23845(final SubLObject var8) {
        return conses_high.getf(var8, (SubLObject)$ic40$, $g3042$.getGlobalValue());
    }
    
    public static SubLObject f23846(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != f23791(var1) || NIL != f23803(var1));
    }
    
    public static SubLObject f23847(final SubLObject var1) {
        return module0035.f2331(var1, (SubLObject)$ic41$);
    }
    
    public static SubLObject f23791(final SubLObject var1) {
        return module0035.f2169(var1, $g3043$.getGlobalValue());
    }
    
    public static SubLObject f23848(final SubLObject var1) {
        return module0035.f2331(var1, (SubLObject)$ic43$);
    }
    
    public static SubLObject f23849(final SubLObject var8) {
        return module0035.f2329(var8, (SubLObject)$ic43$);
    }
    
    public static SubLObject f23796() {
        return conses_high.copy_list($g3043$.getGlobalValue());
    }
    
    public static SubLObject f23850(final SubLObject var8) {
        return conses_high.getf(var8, (SubLObject)$ic44$, $g3044$.getGlobalValue());
    }
    
    public static SubLObject f23851(final SubLObject var8) {
        return conses_high.getf(var8, (SubLObject)$ic46$, $g3045$.getGlobalValue());
    }
    
    public static SubLObject f23803(final SubLObject var1) {
        return module0035.f2169(var1, $g3046$.getGlobalValue());
    }
    
    public static SubLObject f23852(final SubLObject var1) {
        return module0035.f2331(var1, (SubLObject)$ic48$);
    }
    
    public static SubLObject f23853(final SubLObject var8) {
        return module0035.f2329(var8, (SubLObject)$ic48$);
    }
    
    public static SubLObject f23808() {
        return conses_high.copy_list($g3046$.getGlobalValue());
    }
    
    public static SubLObject f23854(final SubLObject var8) {
        return conses_high.getf(var8, (SubLObject)$ic50$, $g3047$.getGlobalValue());
    }
    
    public static SubLObject f23855(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != f23790(var1) || NIL != f23802(var1));
    }
    
    public static SubLObject f23856(final SubLObject var1) {
        return module0035.f2331(var1, (SubLObject)$ic51$);
    }
    
    public static SubLObject f23857() {
        return ConsesLow.nconc(f23795(), f23807());
    }
    
    public static SubLObject f23858(final SubLObject var8) {
        return module0035.f2329(var8, (SubLObject)$ic51$);
    }
    
    public static SubLObject f23790(final SubLObject var1) {
        return module0035.f2169(var1, $g3048$.getGlobalValue());
    }
    
    public static SubLObject f23859(final SubLObject var1) {
        return module0035.f2331(var1, (SubLObject)$ic53$);
    }
    
    public static SubLObject f23860(final SubLObject var8) {
        return module0035.f2329(var8, (SubLObject)$ic53$);
    }
    
    public static SubLObject f23795() {
        return conses_high.copy_list($g3048$.getGlobalValue());
    }
    
    public static SubLObject f23802(final SubLObject var1) {
        return module0035.f2169(var1, $g3049$.getGlobalValue());
    }
    
    public static SubLObject f23861(final SubLObject var1) {
        return module0035.f2331(var1, (SubLObject)$ic54$);
    }
    
    public static SubLObject f23807() {
        return conses_high.copy_list($g3049$.getGlobalValue());
    }
    
    public static SubLObject f23798(final SubLObject var1) {
        return module0035.f2169(var1, $g3050$.getGlobalValue());
    }
    
    public static SubLObject f23862() {
        return conses_high.copy_list($g3050$.getGlobalValue());
    }
    
    public static SubLObject f23863(final SubLObject var8) {
        return module0035.f2329(var8, (SubLObject)$ic56$);
    }
    
    public static SubLObject f23864(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != f23865(var1) || NIL != f23866(var1));
    }
    
    public static SubLObject f23867(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != f23868(var1) || NIL != f23866(var1));
    }
    
    public static SubLObject f23869(final SubLObject var1) {
        return module0035.f2169(var1, $g3051$.getGlobalValue());
    }
    
    public static SubLObject f23870(final SubLObject var1) {
        return module0035.f2169(var1, $g3052$.getGlobalValue());
    }
    
    public static SubLObject f23866(final SubLObject var1) {
        return module0035.f2169(var1, $g3053$.getGlobalValue());
    }
    
    public static SubLObject f23865(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != module0035.f2169(var1, $g3054$.getGlobalValue()) || NIL != module0035.f2169(var1, $g3055$.getGlobalValue()) || NIL != f23871(var1) || NIL != f23872(var1));
    }
    
    public static SubLObject f23873(final SubLObject var10) {
        assert NIL != f23869(var10) : var10;
        return (SubLObject)makeBoolean(var10 == $ic62$ || var10 == $ic63$);
    }
    
    public static SubLObject f23874(final SubLObject var1) {
        return module0035.f2169(var1, $g3056$.getGlobalValue());
    }
    
    public static SubLObject f23868(final SubLObject var1) {
        return module0035.f2169(var1, $g3057$.getGlobalValue());
    }
    
    public static SubLObject f23871(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != module0035.f1998(var1) && $ic66$ == var1.first() && conses_high.second(var1).isString());
    }
    
    public static SubLObject f23875(final SubLObject var11) {
        assert NIL != Types.stringp(var11) : var11;
        return (SubLObject)ConsesLow.list((SubLObject)$ic66$, var11);
    }
    
    public static SubLObject f23876(final SubLObject var12) {
        return conses_high.second(var12);
    }
    
    public static SubLObject f23872(final SubLObject var1) {
        return (SubLObject)makeBoolean(var1.isList() && $ic68$ == var1.first() && NIL != module0191.f11994(var1.rest()));
    }
    
    public static SubLObject f23877(final SubLObject var11) {
        assert NIL != module0191.f11994(var11) : var11;
        return (SubLObject)ConsesLow.cons((SubLObject)$ic68$, var11);
    }
    
    public static SubLObject f23878(final SubLObject var13) {
        return var13.rest();
    }
    
    public static SubLObject f23879(final SubLObject var1) {
        return module0035.f2169(var1, $g3058$.getGlobalValue());
    }
    
    public static SubLObject f23880(final SubLObject var1) {
        return module0035.f2169(var1, $g3059$.getGlobalValue());
    }
    
    public static SubLObject f23881(final SubLObject var14, final SubLObject var15) {
        return module0035.f2385(var14, var15, $g3061$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f23882(final SubLObject var14, final SubLObject var15) {
        return f23881(var15, var14);
    }
    
    public static SubLObject f23883(final SubLObject var14, final SubLObject var15) {
        return module0035.f2385(var14, var15, $g3062$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f23884(final SubLObject var1) {
        SubLObject var2 = $g3060$.getGlobalValue();
        SubLObject var3 = (SubLObject)NIL;
        var3 = var2.first();
        while (NIL != var2) {
            if (var1.eql(var3.first())) {
                return (SubLObject)T;
            }
            var2 = var2.rest();
            var3 = var2.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23885(final SubLObject var18, final SubLObject var19) {
        SubLObject var20 = $g3060$.getGlobalValue();
        SubLObject var21 = (SubLObject)NIL;
        var21 = var20.first();
        while (NIL != var20) {
            if (var18.eql(conses_high.second(var21)) && var19.eql(conses_high.third(var21))) {
                return var21.first();
            }
            var20 = var20.rest();
            var21 = var20.first();
        }
        Errors.error((SubLObject)$ic75$, var18, var19);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23886(final SubLObject var10) {
        SubLObject var11 = $g3060$.getGlobalValue();
        SubLObject var12 = (SubLObject)NIL;
        var12 = var11.first();
        while (NIL != var11) {
            if (var10.eql(var12.first())) {
                return conses_high.second(var12);
            }
            var11 = var11.rest();
            var12 = var11.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23887(final SubLObject var10) {
        SubLObject var11 = $g3060$.getGlobalValue();
        SubLObject var12 = (SubLObject)NIL;
        var12 = var11.first();
        while (NIL != var11) {
            if (var10.eql(var12.first())) {
                return conses_high.third(var12);
            }
            var11 = var11.rest();
            var12 = var11.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23888(final SubLObject var10) {
        return Equality.eq((SubLObject)$ic76$, f23887(var10));
    }
    
    public static SubLObject f23889(final SubLObject var10) {
        return Equality.eq((SubLObject)$ic77$, f23887(var10));
    }
    
    public static SubLObject f23890(final SubLObject var10) {
        return Equality.eq((SubLObject)$ic78$, f23887(var10));
    }
    
    public static SubLObject f23891(final SubLObject var10) {
        return Equality.eq((SubLObject)$ic79$, f23886(var10));
    }
    
    public static SubLObject f23892(final SubLObject var10) {
        return Equality.eq((SubLObject)$ic80$, f23886(var10));
    }
    
    public static SubLObject f23893(final SubLObject var10) {
        return Equality.eq((SubLObject)$ic81$, f23886(var10));
    }
    
    public static SubLObject f23894(final SubLObject var10) {
        return Equality.eq((SubLObject)$ic82$, f23886(var10));
    }
    
    public static SubLObject f23895(final SubLObject var10) {
        return Equality.eq((SubLObject)$ic83$, f23886(var10));
    }
    
    public static SubLObject f23896(final SubLObject var8) {
        return conses_high.getf(var8, (SubLObject)$ic84$, $g3063$.getGlobalValue());
    }
    
    public static SubLObject f23897(final SubLObject var8) {
        return conses_high.getf(var8, (SubLObject)$ic85$, $g3064$.getGlobalValue());
    }
    
    public static SubLObject f23898(final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        return conses_high.getf(var8, (SubLObject)$ic86$, module0018.$g647$.getDynamicValue(var9));
    }
    
    public static SubLObject f23899(final SubLObject var8) {
        return conses_high.getf(var8, (SubLObject)$ic87$, $g3065$.getGlobalValue());
    }
    
    public static SubLObject f23900(final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        return conses_high.getf(var8, (SubLObject)$ic88$, $g3066$.getDynamicValue(var9));
    }
    
    public static SubLObject f23901(final SubLObject var8) {
        return conses_high.getf(var8, (SubLObject)$ic89$, $g3067$.getGlobalValue());
    }
    
    public static SubLObject f23902(final SubLObject var8) {
        return conses_high.getf(var8, (SubLObject)$ic90$, $g3068$.getGlobalValue());
    }
    
    public static SubLObject f23903(final SubLObject var8) {
        return conses_high.getf(var8, (SubLObject)$ic91$, $g3069$.getGlobalValue());
    }
    
    public static SubLObject f23904() {
        return conses_high.copy_list($g3070$.getGlobalValue());
    }
    
    public static SubLObject f23905(final SubLObject var1) {
        return module0035.f2169(var1, $g3070$.getGlobalValue());
    }
    
    public static SubLObject f23906(final SubLObject var1) {
        return module0035.f2169(var1, $g3071$.getGlobalValue());
    }
    
    public static SubLObject f23907(final SubLObject var1) {
        return (SubLObject)T;
    }
    
    public static SubLObject f23908(final SubLObject var8) {
        return conses_high.getf(var8, (SubLObject)$ic95$, $g3072$.getGlobalValue());
    }
    
    public static SubLObject f23909(final SubLObject var1) {
        return module0035.f2169(var1, $g3074$.getGlobalValue());
    }
    
    public static SubLObject f23910(final SubLObject var8) {
        return conses_high.getf(var8, (SubLObject)$ic98$, $g3073$.getGlobalValue());
    }
    
    public static SubLObject f23911(final SubLObject var1) {
        return module0035.f2169(var1, $g3076$.getGlobalValue());
    }
    
    public static SubLObject f23912(final SubLObject var8) {
        return conses_high.getf(var8, (SubLObject)$ic100$, $g3075$.getGlobalValue());
    }
    
    public static SubLObject f23913(final SubLObject var1) {
        return module0035.f2169(var1, $g3078$.getGlobalValue());
    }
    
    public static SubLObject f23914(final SubLObject var8) {
        return conses_high.getf(var8, (SubLObject)$ic102$, $g3077$.getGlobalValue());
    }
    
    public static SubLObject f23915(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != module0048.f3328(var1) || NIL != module0004.f106(var1));
    }
    
    public static SubLObject f23916(final SubLObject var8) {
        return conses_high.getf(var8, (SubLObject)$ic104$, $g3079$.getGlobalValue());
    }
    
    public static SubLObject f23917(final SubLObject var21) {
        return conses_high.getf(var21, (SubLObject)$ic105$, $g3080$.getGlobalValue());
    }
    
    public static SubLObject f23918(final SubLObject var21) {
        return conses_high.getf(var21, (SubLObject)$ic106$, $g3081$.getGlobalValue());
    }
    
    public static SubLObject f23919(final SubLObject var1) {
        return module0035.f2169(var1, $g3083$.getGlobalValue());
    }
    
    public static SubLObject f23920(final SubLObject var8) {
        return conses_high.getf(var8, (SubLObject)$ic109$, $g3082$.getGlobalValue());
    }
    
    public static SubLObject f23921(final SubLObject var1) {
        return module0035.f2169(var1, $g3084$.getGlobalValue());
    }
    
    public static SubLObject f23922(final SubLObject var1) {
        return module0035.f2169(var1, $g3085$.getGlobalValue());
    }
    
    public static SubLObject f23923(final SubLObject var22) {
        if (NIL != module0340.f22913(var22)) {
            return (SubLObject)$ic112$;
        }
        if (NIL != module0340.f22976(var22)) {
            return (SubLObject)$ic113$;
        }
        if (NIL != module0340.f22996(var22)) {
            return (SubLObject)$ic114$;
        }
        if (NIL != module0340.f23001(var22)) {
            return (SubLObject)$ic114$;
        }
        if (NIL != module0340.f22959(var22)) {
            return (SubLObject)$ic115$;
        }
        if (NIL != module0340.f22986(var22)) {
            return (SubLObject)$ic116$;
        }
        if (NIL != module0340.f22967(var22)) {
            return (SubLObject)$ic117$;
        }
        if (NIL != module0340.f22981(var22)) {
            return (SubLObject)$ic113$;
        }
        Errors.error((SubLObject)$ic118$, var22);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23924(final SubLObject var23) {
        assert NIL != f23925(var23) : var23;
        if (var23.eql((SubLObject)$ic121$)) {
            return (SubLObject)$ic122$;
        }
        if (var23.eql((SubLObject)$ic123$)) {
            return (SubLObject)$ic124$;
        }
        if (var23.eql((SubLObject)$ic125$)) {
            return (SubLObject)$ic126$;
        }
        if (var23.eql((SubLObject)$ic127$)) {
            return (SubLObject)$ic128$;
        }
        Errors.error((SubLObject)$ic129$, var23);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23925(final SubLObject var1) {
        return module0035.f2169(var1, $g3086$.getGlobalValue());
    }
    
    public static SubLObject f23926(final SubLObject var1) {
        return Equality.eq((SubLObject)$ic127$, var1);
    }
    
    public static SubLObject f23927(final SubLObject var25, final SubLObject var26) {
        assert NIL != f23925(var25) : var25;
        assert NIL != f23925(var26) : var26;
        return module0035.f2385(var25, var26, $g3086$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f23928(final SubLObject var25, final SubLObject var26) {
        return f23927(var26, var25);
    }
    
    public static SubLObject f23929(final SubLObject var27) {
        return (NIL != var27) ? module0035.f2378(var27, (SubLObject)$ic130$, (SubLObject)UNPROVIDED) : conses_high.last($g3086$.getGlobalValue(), (SubLObject)UNPROVIDED).first();
    }
    
    public static SubLObject f23930(final SubLObject var25, final SubLObject var26) {
        return (NIL != f23927(var26, var25)) ? var26 : var25;
    }
    
    public static SubLObject f23931(final SubLObject var27) {
        return (NIL != var27) ? module0035.f2378(var27, (SubLObject)$ic131$, (SubLObject)UNPROVIDED) : $g3086$.getGlobalValue().first();
    }
    
    public static SubLObject f23932(final SubLObject var25, final SubLObject var26) {
        return (NIL != f23927(var26, var25)) ? var25 : var26;
    }
    
    public static SubLObject f23933(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != module0048.f3328(var1) || NIL != module0004.f106(var1));
    }
    
    public static SubLObject f23934(final SubLObject var1) {
        return module0048.f3328(var1);
    }
    
    public static SubLObject f23935(final SubLObject var28) {
        if (var28.isInteger()) {
            return Numbers.multiply((SubLObject)$ic49$, var28);
        }
        SubLObject var29 = module0035.f2294($g3087$.getGlobalValue(), var28, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL == var29) {
            var29 = Numbers.truncate(Numbers.multiply((SubLObject)$ic49$, var28), (SubLObject)UNPROVIDED);
        }
        return var29;
    }
    
    public static SubLObject f23936(final SubLObject var29) {
        return Numbers.integerDivide(var29, (SubLObject)$ic49$);
    }
    
    public static SubLObject f23937(final SubLObject var29) {
        return Numbers.divide(var29, (SubLObject)$ic49$);
    }
    
    public static SubLObject f23938(final SubLObject var29) {
        assert NIL != f23933(var29) : var29;
        if (NIL != module0048.f3328(var29)) {
            return (SubLObject)NIL;
        }
        return f23937(var29);
    }
    
    public static SubLObject f23939(final SubLObject var30, final SubLObject var31) {
        return module0048.f3359(var30, var31);
    }
    
    public static SubLObject f23940(final SubLObject var30, final SubLObject var31) {
        assert NIL != f23933(var30) : var30;
        assert NIL != f23933(var31) : var31;
        return module0048.f3360(var30, var31);
    }
    
    public static SubLObject f23941(final SubLObject var30, final SubLObject var31) {
        return module0048.f3362(var30, var31);
    }
    
    public static SubLObject f23942(final SubLObject var30, final SubLObject var31) {
        return module0048.f3361(var30, var31);
    }
    
    public static SubLObject f23943(final SubLObject var30, final SubLObject var31) {
        return module0048.f3363(var30, var31);
    }
    
    public static SubLObject f23944(final SubLObject var30, final SubLObject var31) {
        return module0048.f3364(var30, var31);
    }
    
    public static SubLObject f23945(final SubLObject var30, final SubLObject var31) {
        return (NIL != f23940(var30, var31)) ? var31 : var30;
    }
    
    public static SubLObject f23946(final SubLObject var32) {
        SubLObject var33 = (SubLObject)ZERO_INTEGER;
        SubLObject var34 = var32;
        SubLObject var35 = (SubLObject)NIL;
        var35 = var34.first();
        while (NIL != var34) {
            var33 = f23944(var33, var35);
            var34 = var34.rest();
            var35 = var34.first();
        }
        return var33;
    }
    
    public static SubLObject f23947(final SubLObject var29, final SubLObject var34) {
        return module0048.f3367(var29, var34);
    }
    
    public static SubLObject f23948(final SubLObject var29, final SubLObject var34) {
        return module0048.f3369(var29, var34);
    }
    
    public static SubLObject f23949(final SubLObject var29, SubLObject var34) {
        if (var34 == UNPROVIDED) {
            var34 = (SubLObject)ONE_INTEGER;
        }
        return f23935(Numbers.subtract(f23936(var29), var34));
    }
    
    public static SubLObject f23950(final SubLObject var1) {
        return module0035.f2169(var1, $g3088$.getGlobalValue());
    }
    
    public static SubLObject f23951(final SubLObject var1) {
        return module0035.f2169(var1, $g3089$.getGlobalValue());
    }
    
    public static SubLObject f23952(final SubLObject var35) {
        assert NIL != f23953(var35) : var35;
        if (var35.eql((SubLObject)$ic138$)) {
            return (SubLObject)$ic139$;
        }
        if (var35.eql((SubLObject)$ic140$)) {
            return (SubLObject)$ic141$;
        }
        if (var35.eql((SubLObject)$ic142$)) {
            return (SubLObject)$ic143$;
        }
        Errors.error((SubLObject)$ic144$, var35);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23954(final SubLObject var35) {
        assert NIL != f23953(var35) : var35;
        if (var35.eql((SubLObject)$ic138$)) {
            return (SubLObject)$ic145$;
        }
        if (var35.eql((SubLObject)$ic140$)) {
            return (SubLObject)$ic146$;
        }
        if (var35.eql((SubLObject)$ic142$)) {
            return (SubLObject)$ic147$;
        }
        Errors.error((SubLObject)$ic144$, var35);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23953(final SubLObject var1) {
        return module0035.f2169(var1, $g3090$.getGlobalValue());
    }
    
    public static SubLObject f23955(final SubLObject var35) {
        assert NIL != f23953(var35) : var35;
        return Equality.eq((SubLObject)$ic140$, var35);
    }
    
    public static SubLObject f23956(final SubLObject var1) {
        return module0035.f2302($g3093$.getGlobalValue(), var1, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f23957(final SubLObject var36) {
        assert NIL != f23956(var36) : var36;
        final SubLObject var37 = module0035.f2294($g3093$.getGlobalValue(), var36, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if ($ic151$ == var37) {
            return Errors.error((SubLObject)$ic152$, var36);
        }
        return var37;
    }
    
    public static SubLObject f23958(final SubLObject var1) {
        return module0035.f2169(var1, $g3094$.getGlobalValue());
    }
    
    public static SubLObject f23959(final SubLObject var2) {
        return f23958(f23960(var2));
    }
    
    public static SubLObject f23961(final SubLObject var1) {
        return (SubLObject)makeBoolean(var1.isCons() && $ic155$ == var1.first());
    }
    
    public static SubLObject f23962(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != module0035.f2014(var1) && $ic156$ == var1.first() && NIL != module0035.f2000(var1, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED) && conses_high.second(var1).isString());
    }
    
    public static SubLObject f23963(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != f23958(var1) || NIL != f23961(var1) || NIL != f23962(var1));
    }
    
    public static SubLObject f23960(final SubLObject var8) {
        return conses_high.getf(var8, (SubLObject)$ic157$, $g3095$.getGlobalValue());
    }
    
    public static SubLObject f23964(final SubLObject var1) {
        return module0035.f2169(var1, $g3096$.getGlobalValue());
    }
    
    public static SubLObject f23965(final SubLObject var8) {
        return conses_high.getf(var8, (SubLObject)$ic160$, $g3097$.getGlobalValue());
    }
    
    public static SubLObject f23966(final SubLObject var1) {
        return module0035.f2169(var1, $g3098$.getGlobalValue());
    }
    
    public static SubLObject f23967(final SubLObject var8) {
        return conses_high.getf(var8, (SubLObject)$ic162$, $g3099$.getGlobalValue());
    }
    
    public static SubLObject f23968(final SubLObject var1) {
        return module0035.f2169(var1, $g3100$.getGlobalValue());
    }
    
    public static SubLObject f23969(final SubLObject var8) {
        return conses_high.getf(var8, (SubLObject)$ic165$, $g3101$.getGlobalValue());
    }
    
    public static SubLObject f23970(final SubLObject var1) {
        return module0035.f2169(var1, $g3102$.getGlobalValue());
    }
    
    public static SubLObject f23971(final SubLObject var8) {
        return conses_high.getf(var8, (SubLObject)$ic167$, $g3103$.getGlobalValue());
    }
    
    public static SubLObject f23972(final SubLObject var8) {
        return conses_high.getf(var8, (SubLObject)$ic168$, $g3104$.getGlobalValue());
    }
    
    public static SubLObject f23973(final SubLObject var8) {
        return conses_high.getf(var8, (SubLObject)$ic169$, $g3105$.getGlobalValue());
    }
    
    public static SubLObject f23974(final SubLObject var1) {
        return module0035.f2169(var1, $g3106$.getGlobalValue());
    }
    
    public static SubLObject f23975(final SubLObject var8) {
        return conses_high.getf(var8, (SubLObject)$ic171$, $g3107$.getGlobalValue());
    }
    
    public static SubLObject f23976(final SubLObject var1) {
        return module0035.f2169(var1, $g3055$.getGlobalValue());
    }
    
    public static SubLObject f23977(final SubLObject var1) {
        return module0035.f2302($g3108$.getGlobalValue(), var1, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f23978(final SubLObject var38) {
        assert NIL != f23977(var38) : var38;
        final SubLObject var39 = module0035.f2294($g3108$.getGlobalValue(), var38, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return Functions.funcall(var39);
    }
    
    public static SubLObject f23979(final SubLObject var8) {
        return conses_high.getf(var8, (SubLObject)$ic174$, $g3109$.getGlobalValue());
    }
    
    public static SubLObject f23980(final SubLObject var8) {
        return conses_high.getf(var8, (SubLObject)$ic175$, $g3110$.getGlobalValue());
    }
    
    public static SubLObject f23981(final SubLObject var8) {
        return (SubLObject)makeBoolean(NIL != conses_high.getf(var8, (SubLObject)$ic176$, $g3111$.getGlobalValue()) || NIL != f23982(var8));
    }
    
    public static SubLObject f23982(final SubLObject var8) {
        return conses_high.getf(var8, (SubLObject)$ic177$, $g3112$.getGlobalValue());
    }
    
    public static SubLObject f23983(final SubLObject var8) {
        return conses_high.getf(var8, (SubLObject)$ic178$, (SubLObject)NIL);
    }
    
    public static SubLObject f23984(final SubLObject var2, final SubLObject var5) {
        final SubLObject var6 = conses_high.getf(var2, var5, (SubLObject)$ic179$);
        if ($ic179$ == var6) {
            return f23985(var5);
        }
        return var6;
    }
    
    public static SubLObject f23985(final SubLObject var40) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        assert NIL != f23781(var40) : var40;
        SubLObject var42 = (SubLObject)NIL;
        SubLObject var43 = (SubLObject)NIL;
        if (var40.eql((SubLObject)$ic165$)) {
            var42 = $g3101$.getGlobalValue();
            var43 = (SubLObject)T;
        }
        else if (var40.eql((SubLObject)$ic162$)) {
            var42 = $g3099$.getGlobalValue();
            var43 = (SubLObject)T;
        }
        else if (var40.eql((SubLObject)$ic15$)) {
            var42 = (SubLObject)NIL;
            var43 = (SubLObject)NIL;
        }
        else if (var40.eql((SubLObject)$ic180$)) {
            var42 = (SubLObject)NIL;
            var43 = (SubLObject)T;
        }
        else if (var40.eql((SubLObject)$ic181$)) {
            var42 = (SubLObject)NIL;
            var43 = (SubLObject)T;
        }
        else if (var40.eql((SubLObject)$ic16$)) {
            var42 = $g3023$.getGlobalValue();
            var43 = (SubLObject)T;
        }
        else if (var40.eql((SubLObject)$ic17$)) {
            var42 = $g3024$.getGlobalValue();
            var43 = (SubLObject)T;
        }
        else if (var40.eql((SubLObject)$ic18$)) {
            var42 = $g3025$.getGlobalValue();
            var43 = (SubLObject)T;
        }
        else if (var40.eql((SubLObject)$ic19$)) {
            var42 = $g3026$.getGlobalValue();
            var43 = (SubLObject)T;
        }
        else if (var40.eql((SubLObject)$ic21$)) {
            var42 = $g3027$.getGlobalValue();
            var43 = (SubLObject)T;
        }
        else if (var40.eql((SubLObject)$ic24$)) {
            var42 = $g3029$.getGlobalValue();
            var43 = (SubLObject)T;
        }
        else if (var40.eql((SubLObject)$ic23$)) {
            var42 = $g3028$.getGlobalValue();
            var43 = (SubLObject)T;
        }
        else if (var40.eql((SubLObject)$ic25$)) {
            var42 = $g3030$.getGlobalValue();
            var43 = (SubLObject)T;
        }
        else if (var40.eql((SubLObject)$ic167$)) {
            var42 = $g3103$.getGlobalValue();
            var43 = (SubLObject)T;
        }
        else if (var40.eql((SubLObject)$ic28$)) {
            var42 = $g3032$.getGlobalValue();
            var43 = (SubLObject)T;
        }
        else if (var40.eql((SubLObject)$ic29$)) {
            var42 = $g3033$.getGlobalValue();
            var43 = (SubLObject)T;
        }
        else if (var40.eql((SubLObject)$ic30$)) {
            var42 = $g3034$.getGlobalValue();
            var43 = (SubLObject)T;
        }
        else if (var40.eql((SubLObject)$ic32$)) {
            var42 = $g3036$.getGlobalValue();
            var43 = (SubLObject)T;
        }
        else if (var40.eql((SubLObject)$ic33$)) {
            var42 = $g3037$.getGlobalValue();
            var43 = (SubLObject)T;
        }
        else if (var40.eql((SubLObject)$ic34$)) {
            var42 = $g3038$.getGlobalValue();
            var43 = (SubLObject)T;
        }
        else if (var40.eql((SubLObject)$ic36$)) {
            var42 = $g3039$.getGlobalValue();
            var43 = (SubLObject)T;
        }
        else if (var40.eql((SubLObject)$ic37$)) {
            var42 = $g3040$.getGlobalValue();
            var43 = (SubLObject)T;
        }
        else if (var40.eql((SubLObject)$ic157$)) {
            var42 = $g3095$.getGlobalValue();
            var43 = (SubLObject)T;
        }
        else if (var40.eql((SubLObject)$ic40$)) {
            var42 = $g3042$.getGlobalValue();
            var43 = (SubLObject)T;
        }
        else if (var40.eql((SubLObject)$ic160$)) {
            var42 = $g3097$.getGlobalValue();
            var43 = (SubLObject)T;
        }
        else if (var40.eql((SubLObject)$ic175$)) {
            var42 = $g3110$.getGlobalValue();
            var43 = (SubLObject)T;
        }
        else if (var40.eql((SubLObject)$ic174$)) {
            var42 = $g3109$.getGlobalValue();
            var43 = (SubLObject)T;
        }
        else if (var40.eql((SubLObject)$ic176$)) {
            var42 = $g3111$.getGlobalValue();
            var43 = (SubLObject)T;
        }
        else if (var40.eql((SubLObject)$ic177$)) {
            var42 = $g3112$.getGlobalValue();
            var43 = (SubLObject)T;
        }
        else if (var40.eql((SubLObject)$ic178$)) {
            var42 = (SubLObject)NIL;
            var43 = (SubLObject)T;
        }
        else if (var40.eql((SubLObject)$ic98$)) {
            var42 = $g3073$.getGlobalValue();
            var43 = (SubLObject)T;
        }
        else if (var40.eql((SubLObject)$ic100$)) {
            var42 = $g3075$.getGlobalValue();
            var43 = (SubLObject)T;
        }
        else if (var40.eql((SubLObject)$ic102$)) {
            var42 = $g3077$.getGlobalValue();
            var43 = (SubLObject)T;
        }
        else if (var40.eql((SubLObject)$ic104$)) {
            var42 = $g3079$.getGlobalValue();
            var43 = (SubLObject)T;
        }
        else if (var40.eql((SubLObject)$ic105$)) {
            var42 = $g3080$.getGlobalValue();
            var43 = (SubLObject)T;
        }
        else if (var40.eql((SubLObject)$ic106$)) {
            var42 = $g3081$.getGlobalValue();
            var43 = (SubLObject)T;
        }
        else if (var40.eql((SubLObject)$ic84$)) {
            var42 = $g3063$.getGlobalValue();
            var43 = (SubLObject)T;
        }
        else if (var40.eql((SubLObject)$ic85$)) {
            var42 = $g3064$.getGlobalValue();
            var43 = (SubLObject)T;
        }
        else if (var40.eql((SubLObject)$ic86$)) {
            var42 = module0018.$g647$.getDynamicValue(var41);
            var43 = (SubLObject)T;
        }
        else if (var40.eql((SubLObject)$ic109$)) {
            var42 = $g3082$.getGlobalValue();
            var43 = (SubLObject)T;
        }
        else if (var40.eql((SubLObject)$ic87$)) {
            var42 = $g3065$.getGlobalValue();
            var43 = (SubLObject)T;
        }
        else if (var40.eql((SubLObject)$ic88$)) {
            var42 = $g3066$.getDynamicValue(var41);
            var43 = (SubLObject)T;
        }
        else if (var40.eql((SubLObject)$ic89$)) {
            var42 = $g3067$.getGlobalValue();
            var43 = (SubLObject)T;
        }
        else if (var40.eql((SubLObject)$ic90$)) {
            var42 = $g3068$.getGlobalValue();
            var43 = (SubLObject)T;
        }
        else if (var40.eql((SubLObject)$ic31$)) {
            var42 = $g3035$.getGlobalValue();
            var43 = (SubLObject)T;
        }
        else if (var40.eql((SubLObject)$ic168$)) {
            var42 = $g3104$.getGlobalValue();
            var43 = (SubLObject)T;
        }
        else if (var40.eql((SubLObject)$ic169$)) {
            var42 = $g3105$.getGlobalValue();
            var43 = (SubLObject)T;
        }
        else if (var40.eql((SubLObject)$ic171$)) {
            var42 = $g3107$.getGlobalValue();
            var43 = (SubLObject)T;
        }
        else if (var40.eql((SubLObject)$ic95$)) {
            var42 = $g3072$.getGlobalValue();
            var43 = (SubLObject)T;
        }
        else if (var40.eql((SubLObject)$ic50$)) {
            var42 = $g3047$.getGlobalValue();
            var43 = (SubLObject)T;
        }
        else if (var40.eql((SubLObject)$ic44$)) {
            var42 = $g3044$.getGlobalValue();
            var43 = (SubLObject)T;
        }
        else if (var40.eql((SubLObject)$ic46$)) {
            var42 = $g3045$.getGlobalValue();
            var43 = (SubLObject)T;
        }
        else {
            var42 = (SubLObject)$ic142$;
            var43 = (SubLObject)NIL;
        }
        return Values.values(var42, var43);
    }
    
    public static SubLObject f23986(final SubLObject var5, final SubLObject var6) {
        return Equality.equal(var6, f23985(var5));
    }
    
    public static SubLObject f23987(final SubLObject var42) {
        assert NIL != inference_datastructures_inference_oc.f25275(var42) : var42;
        final SubLObject var43 = inference_datastructures_inference_oc.f25483(var42);
        SubLObject var44 = (SubLObject)NIL;
        SubLObject var45;
        SubLObject var46;
        SubLObject var47;
        SubLObject var48;
        for (var45 = (SubLObject)NIL, var45 = var43; NIL != var45; var45 = conses_high.cddr(var45)) {
            var46 = var45.first();
            var47 = conses_high.cadr(var45);
            var48 = f23985(var46);
            if (!var48.equal(var47)) {
                var44 = conses_high.putf(var44, var46, var47);
            }
        }
        return var44;
    }
    
    public static SubLObject f23988() {
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = f23785();
        SubLObject var10 = (SubLObject)NIL;
        var10 = var9.first();
        while (NIL != var9) {
            final SubLObject var11 = f23985(var10);
            var8 = (SubLObject)ConsesLow.cons(var10, var8);
            var8 = (SubLObject)ConsesLow.cons(var11, var8);
            var9 = var9.rest();
            var10 = var9.first();
        }
        return Sequences.nreverse(var8);
    }
    
    public static SubLObject f23989(final SubLObject var2) {
        return module0035.f2340(f23988(), var2);
    }
    
    public static SubLObject f23990() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23781", "QUERY-PROPERTY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23784", "S#26487", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23785", "ALL-QUERY-PROPERTIES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23788", "S#26488", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23782", "S#26477", 1, 0, false);
        new $f23782$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23792", "S#26489", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23793", "S#26490", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23786", "S#26491", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23797", "S#26492", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23799", "S#26493", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23800", "S#26494", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23783", "S#26478", 1, 0, false);
        new $f23783$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23804", "S#26495", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23805", "S#26496", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23787", "S#26497", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23809", "S#26498", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23810", "S#26480", 1, 0, false);
        new $f23810$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23811", "S#26499", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23812", "S#26500", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23813", "S#26501", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23814", "S#26502", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23815", "S#26503", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23816", "S#26504", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23789", "S#26482", 1, 0, false);
        new $f23789$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23817", "S#26505", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23818", "S#26506", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23794", "S#26507", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23819", "S#26508", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23820", "S#26509", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23821", "S#26510", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23822", "S#26511", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23823", "S#26512", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23824", "S#26513", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23825", "S#26514", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23826", "S#26515", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23827", "S#26516", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23828", "S#26517", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23829", "S#26518", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23830", "S#25999", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23831", "S#26519", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23832", "S#26520", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23833", "S#26521", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23834", "S#26522", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23835", "S#26523", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23836", "S#26524", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23837", "S#26525", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23838", "S#26526", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23839", "S#26527", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23840", "S#26528", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23841", "S#26529", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23842", "S#26530", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23801", "S#26483", 1, 0, false);
        new $f23801$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23843", "S#26531", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23844", "S#26532", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23806", "S#26533", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23845", "S#26534", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23846", "S#26535", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23847", "S#26536", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23791", "S#26484", 1, 0, false);
        new $f23791$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23848", "S#26537", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23849", "S#26538", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23796", "S#26539", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23850", "S#26540", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23851", "S#26541", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23803", "S#26485", 1, 0, false);
        new $f23803$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23852", "S#26542", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23853", "S#26543", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23808", "S#26544", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23854", "S#26545", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23855", "PROBLEM-STORE-PROPERTY-P", 1, 0, false);
        new $f23855$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23856", "S#26546", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23857", "S#26547", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23858", "S#26548", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23790", "S#26549", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23859", "S#26550", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23860", "S#26551", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23795", "S#26552", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23802", "S#26553", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23861", "S#26554", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23807", "S#26555", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23798", "S#26556", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23862", "S#26557", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23863", "S#26558", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23864", "S#26559", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23867", "S#26086", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23869", "S#26560", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23870", "S#26561", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23866", "S#26562", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23865", "S#26563", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23873", "S#26564", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23874", "S#26565", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23868", "S#26566", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23871", "INFERENCE-ERROR-SUSPEND-STATUS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23875", "NEW-INFERENCE-ERROR-SUSPEND-STATUS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23876", "S#26567", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23872", "S#26568", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23877", "S#26569", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23878", "S#26570", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23879", "S#26571", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23880", "S#26572", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23881", "S#26573", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23882", "S#26574", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23883", "S#26575", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23884", "S#26576", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23885", "S#26577", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23886", "S#26578", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23887", "S#26579", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23888", "S#26580", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23889", "S#26581", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23890", "S#26582", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23891", "S#26583", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23892", "S#26584", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23893", "S#26585", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23894", "S#26586", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23895", "S#26587", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23896", "S#26588", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23897", "S#26589", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23898", "S#26590", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23899", "S#26591", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23900", "S#26592", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23901", "S#26593", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23902", "S#26594", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23903", "S#26595", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23904", "S#26596", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23905", "S#26597", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23906", "S#26598", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23907", "S#26599", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23908", "S#26600", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23909", "S#26601", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23910", "S#26602", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23911", "S#26603", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23912", "S#26604", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23913", "S#26605", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23914", "S#26606", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23915", "S#26607", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23916", "S#26608", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23917", "S#26609", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23918", "S#26610", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23919", "S#26611", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23920", "S#26612", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23921", "S#26613", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23922", "S#26614", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23923", "S#26615", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23924", "S#26616", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23925", "S#26617", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23926", "S#26618", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23927", "S#26619", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23928", "S#26620", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23929", "S#26621", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23930", "S#26622", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23931", "S#26623", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23932", "S#26624", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23933", "S#26625", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23934", "S#26626", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23935", "S#26627", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23936", "S#26628", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23937", "S#25998", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23938", "S#26629", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23939", "S#26630", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23940", "S#26631", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23941", "S#26632", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23942", "S#26633", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23943", "S#26634", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23944", "S#26635", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23945", "S#26636", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23946", "S#26637", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23947", "S#26638", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23948", "S#26639", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23949", "S#26640", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23950", "S#26641", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23951", "S#26642", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23952", "S#26643", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23954", "S#26644", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23953", "S#26645", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23955", "S#26646", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23956", "S#26647", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23957", "S#26648", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23958", "S#26649", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23959", "S#26650", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23961", "S#26651", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23962", "S#26652", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23963", "S#26653", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23960", "S#26654", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23964", "S#26655", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23965", "S#26656", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23966", "S#26657", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23967", "S#26658", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23968", "S#26659", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23969", "S#26660", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23970", "S#26661", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23971", "S#26662", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23972", "S#26663", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23973", "S#26664", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23974", "S#26665", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23975", "S#26666", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23976", "S#26667", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23977", "S#26668", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23978", "S#26669", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23979", "S#26670", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23980", "S#26671", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23981", "S#26672", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23982", "S#26673", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23983", "S#26674", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23984", "S#26675", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23985", "S#26676", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23986", "S#26677", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23987", "S#26678", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23988", "S#26679", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0360", "f23989", "S#26680", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23991() {
        $g3018$ = SubLFiles.deflexical("S#26681", (SubLObject)$ic7$);
        $g3019$ = SubLFiles.deflexical("S#26682", (SubLObject)$ic8$);
        $g3020$ = SubLFiles.deflexical("S#26683", (SubLObject)$ic9$);
        $g3021$ = SubLFiles.deflexical("S#26684", (SubLObject)$ic10$);
        $g3022$ = SubLFiles.deflexical("S#26685", (SubLObject)$ic12$);
        $g3023$ = SubLFiles.deflexical("S#26686", (SubLObject)NIL);
        $g3024$ = SubLFiles.deflexical("S#26687", (SubLObject)NIL);
        $g3025$ = SubLFiles.deflexical("S#26688", (SubLObject)NIL);
        $g3026$ = SubLFiles.deflexical("S#26689", (SubLObject)T);
        $g3027$ = SubLFiles.deflexical("S#26690", (SubLObject)$ic20$);
        $g3028$ = SubLFiles.deflexical("S#26691", (SubLObject)$ic22$);
        $g3029$ = SubLFiles.deflexical("S#26692", (SubLObject)$ic20$);
        $g3030$ = SubLFiles.deflexical("S#26693", (SubLObject)T);
        $g3031$ = SubLFiles.deflexical("S#26694", (SubLObject)$ic26$);
        $g3032$ = SubLFiles.deflexical("S#26695", (SubLObject)NIL);
        $g3033$ = SubLFiles.deflexical("S#26696", (SubLObject)NIL);
        $g3034$ = SubLFiles.deflexical("S#26697", (SubLObject)NIL);
        $g3036$ = SubLFiles.deflexical("S#26698", (SubLObject)ZERO_INTEGER);
        $g3037$ = SubLFiles.deflexical("S#26699", (SubLObject)NIL);
        $g3038$ = SubLFiles.deflexical("S#26700", (SubLObject)ZERO_INTEGER);
        $g3039$ = SubLFiles.deflexical("S#26701", (SubLObject)$ic35$);
        $g3040$ = SubLFiles.deflexical("S#26702", (SubLObject)ONE_INTEGER);
        $g3041$ = SubLFiles.deflexical("S#26703", (SubLObject)$ic38$);
        $g3042$ = SubLFiles.deflexical("S#26704", (SubLObject)NIL);
        $g3043$ = SubLFiles.deflexical("S#26705", (SubLObject)$ic42$);
        $g3044$ = SubLFiles.deflexical("S#26706", (SubLObject)ZERO_INTEGER);
        $g3045$ = SubLFiles.deflexical("S#26707", (SubLObject)$ic45$);
        $g3046$ = SubLFiles.deflexical("S#26708", (SubLObject)$ic47$);
        $g3047$ = SubLFiles.deflexical("S#26709", Numbers.multiply((SubLObject)TWO_INTEGER, (SubLObject)$ic49$, module0018.$g649$.getGlobalValue()));
        $g3048$ = SubLFiles.deflexical("S#26710", (SubLObject)$ic52$);
        $g3049$ = SubLFiles.deflexical("S#26711", (SubLObject)NIL);
        $g3050$ = SubLFiles.deflexical("S#26712", (SubLObject)$ic55$);
        $g3051$ = SubLFiles.deflexical("S#26713", (SubLObject)$ic57$);
        $g3052$ = SubLFiles.deflexical("S#26714", (SubLObject)$ic58$);
        $g3053$ = SubLFiles.deflexical("S#26715", (SubLObject)$ic59$);
        $g3054$ = SubLFiles.deflexical("S#26716", (SubLObject)$ic60$);
        $g3056$ = SubLFiles.deflexical("S#26717", (SubLObject)$ic64$);
        $g3057$ = SubLFiles.deflexical("S#26718", (SubLObject)$ic65$);
        $g3058$ = SubLFiles.deflexical("S#26719", (SubLObject)$ic70$);
        $g3059$ = SubLFiles.deflexical("S#26720", (SubLObject)$ic71$);
        $g3060$ = SubLFiles.deflexical("S#26721", (SubLObject)$ic72$);
        $g3061$ = SubLFiles.deflexical("S#26722", module0035.f2288(Mapping.mapcar((SubLObject)$ic73$, $g3060$.getGlobalValue()), (SubLObject)UNPROVIDED));
        $g3062$ = SubLFiles.deflexical("S#26723", (SubLObject)$ic74$);
        $g3063$ = SubLFiles.deflexical("S#26724", (SubLObject)NIL);
        $g3064$ = SubLFiles.deflexical("S#26725", (SubLObject)NIL);
        $g3065$ = SubLFiles.deflexical("S#26726", (SubLObject)T);
        $g3066$ = SubLFiles.defparameter("S#26727", (SubLObject)NIL);
        $g3067$ = SubLFiles.deflexical("S#26728", (SubLObject)NIL);
        $g3068$ = SubLFiles.deflexical("S#26729", (SubLObject)T);
        $g3069$ = SubLFiles.deflexical("S#26730", (SubLObject)T);
        $g3035$ = SubLFiles.deflexical("S#26731", (SubLObject)$ic92$);
        $g3070$ = SubLFiles.deflexical("S#26732", (SubLObject)$ic93$);
        $g3071$ = SubLFiles.deflexical("S#26733", (SubLObject)$ic94$);
        $g3072$ = SubLFiles.deflexical("S#26734", (SubLObject)NIL);
        $g3073$ = SubLFiles.deflexical("S#26735", (SubLObject)$ic96$);
        $g3074$ = SubLFiles.deflexical("S#26736", (SubLObject)$ic97$);
        $g3075$ = SubLFiles.deflexical("S#26737", (SubLObject)$ic20$);
        $g3076$ = SubLFiles.deflexical("S#26738", (SubLObject)$ic99$);
        $g3077$ = SubLFiles.deflexical("S#26739", (SubLObject)$ic22$);
        $g3078$ = SubLFiles.deflexical("S#26740", (SubLObject)$ic101$);
        $g3079$ = SubLFiles.deflexical("S#26741", (SubLObject)$ic103$);
        $g3080$ = SubLFiles.deflexical("S#26742", (SubLObject)T);
        $g3081$ = SubLFiles.deflexical("S#26743", (SubLObject)T);
        $g3082$ = SubLFiles.deflexical("S#26744", (SubLObject)$ic107$);
        $g3083$ = SubLFiles.deflexical("S#26745", (SubLObject)$ic108$);
        $g3084$ = SubLFiles.deflexical("S#26746", (SubLObject)$ic110$);
        $g3085$ = SubLFiles.deflexical("S#26747", (SubLObject)$ic111$);
        $g3086$ = SubLFiles.deflexical("S#26748", (SubLObject)$ic119$);
        $g3087$ = SubLFiles.deflexical("S#26749", (SubLObject)$ic132$);
        $g3088$ = SubLFiles.deflexical("S#26750", (SubLObject)$ic134$);
        $g3089$ = SubLFiles.deflexical("S#26751", (SubLObject)$ic135$);
        $g3090$ = SubLFiles.deflexical("S#26752", (SubLObject)$ic136$);
        $g3091$ = SubLFiles.deflexical("S#26753", (SubLObject)$ic148$);
        $g3092$ = SubLFiles.deflexical("S#26754", (SubLObject)$ic149$);
        $g3093$ = SubLFiles.deflexical("S#26755", ConsesLow.append($g3091$.getGlobalValue(), $g3092$.getGlobalValue()));
        $g3094$ = SubLFiles.deflexical("S#26756", (SubLObject)$ic153$);
        $g3095$ = SubLFiles.deflexical("S#26757", (SubLObject)$ic154$);
        $g3096$ = SubLFiles.deflexical("S#26758", (SubLObject)$ic158$);
        $g3097$ = SubLFiles.deflexical("S#26759", (SubLObject)$ic159$);
        $g3098$ = SubLFiles.deflexical("S#26760", (SubLObject)$ic161$);
        $g3099$ = SubLFiles.deflexical("S#26761", (SubLObject)$ic154$);
        $g3100$ = SubLFiles.deflexical("S#26762", (SubLObject)$ic163$);
        $g3101$ = SubLFiles.deflexical("S#26763", (SubLObject)$ic164$);
        $g3102$ = SubLFiles.deflexical("S#26764", (SubLObject)$ic166$);
        $g3103$ = SubLFiles.deflexical("S#26765", (SubLObject)$ic22$);
        $g3104$ = SubLFiles.deflexical("S#26766", (SubLObject)NIL);
        $g3105$ = SubLFiles.deflexical("S#26767", (SubLObject)NIL);
        $g3106$ = SubLFiles.deflexical("S#26768", (SubLObject)$ic170$);
        $g3107$ = SubLFiles.deflexical("S#26769", (SubLObject)NIL);
        $g3055$ = SubLFiles.deflexical("S#26770", (SubLObject)$ic172$);
        $g3108$ = SubLFiles.deflexical("S#26771", (SubLObject)NIL);
        $g3109$ = SubLFiles.deflexical("S#26772", (SubLObject)NIL);
        $g3110$ = SubLFiles.deflexical("S#26773", (SubLObject)NIL);
        $g3111$ = SubLFiles.deflexical("S#26774", (SubLObject)NIL);
        $g3112$ = SubLFiles.deflexical("S#26775", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23992() {
        module0002.f38((SubLObject)$ic0$);
        module0012.f368((SubLObject)$ic1$, (SubLObject)NIL, (SubLObject)$ic2$, (SubLObject)NIL, (SubLObject)$ic3$);
        module0002.f38((SubLObject)$ic51$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f23990();
    }
    
    public void initializeVariables() {
        f23991();
    }
    
    public void runTopLevelForms() {
        f23992();
    }
    
    static {
        me = (SubLFile)new module0360();
        $g3018$ = null;
        $g3019$ = null;
        $g3020$ = null;
        $g3021$ = null;
        $g3022$ = null;
        $g3023$ = null;
        $g3024$ = null;
        $g3025$ = null;
        $g3026$ = null;
        $g3027$ = null;
        $g3028$ = null;
        $g3029$ = null;
        $g3030$ = null;
        $g3031$ = null;
        $g3032$ = null;
        $g3033$ = null;
        $g3034$ = null;
        $g3036$ = null;
        $g3037$ = null;
        $g3038$ = null;
        $g3039$ = null;
        $g3040$ = null;
        $g3041$ = null;
        $g3042$ = null;
        $g3043$ = null;
        $g3044$ = null;
        $g3045$ = null;
        $g3046$ = null;
        $g3047$ = null;
        $g3048$ = null;
        $g3049$ = null;
        $g3050$ = null;
        $g3051$ = null;
        $g3052$ = null;
        $g3053$ = null;
        $g3054$ = null;
        $g3056$ = null;
        $g3057$ = null;
        $g3058$ = null;
        $g3059$ = null;
        $g3060$ = null;
        $g3061$ = null;
        $g3062$ = null;
        $g3063$ = null;
        $g3064$ = null;
        $g3065$ = null;
        $g3066$ = null;
        $g3067$ = null;
        $g3068$ = null;
        $g3069$ = null;
        $g3035$ = null;
        $g3070$ = null;
        $g3071$ = null;
        $g3072$ = null;
        $g3073$ = null;
        $g3074$ = null;
        $g3075$ = null;
        $g3076$ = null;
        $g3077$ = null;
        $g3078$ = null;
        $g3079$ = null;
        $g3080$ = null;
        $g3081$ = null;
        $g3082$ = null;
        $g3083$ = null;
        $g3084$ = null;
        $g3085$ = null;
        $g3086$ = null;
        $g3087$ = null;
        $g3088$ = null;
        $g3089$ = null;
        $g3090$ = null;
        $g3091$ = null;
        $g3092$ = null;
        $g3093$ = null;
        $g3094$ = null;
        $g3095$ = null;
        $g3096$ = null;
        $g3097$ = null;
        $g3098$ = null;
        $g3099$ = null;
        $g3100$ = null;
        $g3101$ = null;
        $g3102$ = null;
        $g3103$ = null;
        $g3104$ = null;
        $g3105$ = null;
        $g3106$ = null;
        $g3107$ = null;
        $g3055$ = null;
        $g3108$ = null;
        $g3109$ = null;
        $g3110$ = null;
        $g3111$ = null;
        $g3112$ = null;
        $ic0$ = makeSymbol("QUERY-PROPERTY-P");
        $ic1$ = makeSymbol("ALL-QUERY-PROPERTIES");
        $ic2$ = makeString("Return a list of all the query properties.\n   @note destructible");
        $ic3$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("LIST"), (SubLObject)makeSymbol("KEYWORDP")));
        $ic4$ = makeSymbol("S#26477", "CYC");
        $ic5$ = makeSymbol("S#26492", "CYC");
        $ic6$ = makeSymbol("S#26478", "CYC");
        $ic7$ = ConsesLow.list((SubLObject)makeKeyword("NEW-ROOT-TIMES"), (SubLObject)makeKeyword("NEW-ROOT-COUNT"), (SubLObject)makeKeyword("PROBLEM-CREATION-TIMES"), (SubLObject)makeKeyword("INFERENCE-ANSWER-QUERY-PROPERTIES"), (SubLObject)makeKeyword("INFERENCE-STRONGEST-QUERY-PROPERTIES"), (SubLObject)makeKeyword("INFERENCE-MOST-EFFICIENT-QUERY-PROPERTIES"), (SubLObject)makeKeyword("INFERENCE-IDS"));
        $ic8$ = ConsesLow.list((SubLObject)makeKeyword("COMPLETE-USER-TIME"), (SubLObject)makeKeyword("COMPLETE-SYSTEM-TIME"), (SubLObject)makeKeyword("COMPLETE-TOTAL-TIME"));
        $ic9$ = ConsesLow.list((SubLObject)makeKeyword("ANSWER-COUNT"), (SubLObject)makeKeyword("TIME-TO-FIRST-ANSWER"), (SubLObject)makeKeyword("TIME-TO-LAST-ANSWER"), (SubLObject)makeKeyword("TOTAL-TIME"));
        $ic10$ = ConsesLow.list(new SubLObject[] { makeKeyword("ANSWER-COUNT"), makeKeyword("TIME-TO-FIRST-ANSWER"), makeKeyword("TIME-TO-LAST-ANSWER"), makeKeyword("TIME-PER-ANSWER"), makeKeyword("LATENCY-IMPROVEMENT-FROM-ITERATIVITY"), makeKeyword("TOTAL-TIME"), makeKeyword("COMPLETE-USER-TIME"), makeKeyword("COMPLETE-SYSTEM-TIME"), makeKeyword("COMPLETE-TOTAL-TIME") });
        $ic11$ = makeSymbol("S#26503", "CYC");
        $ic12$ = ConsesLow.list(new SubLObject[] { makeKeyword("DISJUNCTION-FREE-EL-VARS-POLICY"), makeKeyword("RESULT-UNIQUENESS"), makeKeyword("PROBLEM-STORE"), makeKeyword("CONDITIONAL-SENTENCE?"), makeKeyword("NON-EXPLANATORY-SENTENCE"), makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?"), makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?"), makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?"), makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), makeKeyword("ALLOWED-RULES"), makeKeyword("FORBIDDEN-RULES"), makeKeyword("ALLOWED-MODULES"), makeKeyword("ALLOW-ABNORMALITY-CHECKING?"), makeKeyword("TRANSITIVE-CLOSURE-MODE"), makeKeyword("MAINTAIN-TERM-WORKING-SET?"), makeKeyword("EVENTS"), makeKeyword("HALT-CONDITIONS") });
        $ic13$ = makeSymbol("S#26482", "CYC");
        $ic14$ = makeSymbol("S#26508", "CYC");
        $ic15$ = makeKeyword("PROBLEM-STORE");
        $ic16$ = makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?");
        $ic17$ = makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?");
        $ic18$ = makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?");
        $ic19$ = makeKeyword("ALLOW-INDETERMINATE-RESULTS?");
        $ic20$ = makeKeyword("ALL");
        $ic21$ = makeKeyword("ALLOWED-RULES");
        $ic22$ = makeKeyword("NONE");
        $ic23$ = makeKeyword("FORBIDDEN-RULES");
        $ic24$ = makeKeyword("ALLOWED-MODULES");
        $ic25$ = makeKeyword("ALLOW-ABNORMALITY-CHECKING?");
        $ic26$ = ConsesLow.list((SubLObject)makeKeyword("MAX-NUMBER"), (SubLObject)makeKeyword("MAX-TIME"), (SubLObject)makeKeyword("MAX-STEP"), (SubLObject)makeKeyword("INFERENCE-MODE"));
        $ic27$ = makeSymbol("S#26519", "CYC");
        $ic28$ = makeKeyword("MAX-NUMBER");
        $ic29$ = makeKeyword("MAX-TIME");
        $ic30$ = makeKeyword("MAX-STEP");
        $ic31$ = makeKeyword("INFERENCE-MODE");
        $ic32$ = makeKeyword("FORWARD-MAX-TIME");
        $ic33$ = makeKeyword("MAX-PROOF-DEPTH");
        $ic34$ = makeKeyword("MAX-TRANSFORMATION-DEPTH");
        $ic35$ = makeInteger(-100);
        $ic36$ = makeKeyword("MIN-RULE-UTILITY");
        $ic37$ = makeKeyword("PROBABLY-APPROXIMATELY-DONE");
        $ic38$ = ConsesLow.list(new SubLObject[] { makeKeyword("FORWARD-MAX-TIME"), makeKeyword("MAX-PROOF-DEPTH"), makeKeyword("MAX-TRANSFORMATION-DEPTH"), makeKeyword("MIN-RULE-UTILITY"), makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeKeyword("RETURN"), makeKeyword("ANSWER-LANGUAGE"), makeKeyword("CACHE-INFERENCE-RESULTS?"), makeKeyword("FORGET-EXTRA-RESULTS?"), makeKeyword("BROWSABLE?"), makeKeyword("CONTINUABLE?"), makeKeyword("BLOCK?"), makeKeyword("METRICS") });
        $ic39$ = makeSymbol("S#26483", "CYC");
        $ic40$ = makeKeyword("METRICS");
        $ic41$ = makeSymbol("S#26535", "CYC");
        $ic42$ = ConsesLow.list((SubLObject)makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), (SubLObject)makeKeyword("PROOF-SPEC"));
        $ic43$ = makeSymbol("S#26484", "CYC");
        $ic44$ = makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT");
        $ic45$ = makeKeyword("ANYTHING");
        $ic46$ = makeKeyword("PROOF-SPEC");
        $ic47$ = ConsesLow.list((SubLObject)makeKeyword("PRODUCTIVITY-LIMIT"));
        $ic48$ = makeSymbol("S#26485", "CYC");
        $ic49$ = makeInteger(100);
        $ic50$ = makeKeyword("PRODUCTIVITY-LIMIT");
        $ic51$ = makeSymbol("PROBLEM-STORE-PROPERTY-P");
        $ic52$ = ConsesLow.list(new SubLObject[] { makeKeyword("PROBLEM-STORE-NAME"), makeKeyword("EQUALITY-REASONING-METHOD"), makeKeyword("EQUALITY-REASONING-DOMAIN"), makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL"), makeKeyword("MAX-PROBLEM-COUNT"), makeKeyword("REMOVAL-ALLOWED?"), makeKeyword("TRANSFORMATION-ALLOWED?"), makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), makeKeyword("NEGATION-BY-FAILURE?"), makeKeyword("COMPLETENESS-MINIMIZATION-ALLOWED?"), makeKeyword("DIRECTION"), makeKeyword("EVALUATE-SUBL-ALLOWED?"), makeKeyword("REWRITE-ALLOWED?"), makeKeyword("ABDUCTION-ALLOWED?"), makeKeyword("NEW-TERMS-ALLOWED?"), makeKeyword("COMPUTE-ANSWER-JUSTIFICATIONS?") });
        $ic53$ = makeSymbol("S#26549", "CYC");
        $ic54$ = makeSymbol("S#26553", "CYC");
        $ic55$ = ConsesLow.list((SubLObject)makeKeyword("INFERENCE-MODE"));
        $ic56$ = makeSymbol("S#26556", "CYC");
        $ic57$ = ConsesLow.list(new SubLObject[] { makeKeyword("NEW"), makeKeyword("PREPARED"), makeKeyword("READY"), makeKeyword("RUNNING"), makeKeyword("SUSPENDED"), makeKeyword("DEAD"), makeKeyword("TAUTOLOGY"), makeKeyword("CONTRADICTION"), makeKeyword("ILL-FORMED") });
        $ic58$ = ConsesLow.list((SubLObject)makeKeyword("PREPARED"), (SubLObject)makeKeyword("SUSPENDED"));
        $ic59$ = ConsesLow.list((SubLObject)makeKeyword("TAUTOLOGY"), (SubLObject)makeKeyword("CONTRADICTION"), (SubLObject)makeKeyword("ILL-FORMED"), (SubLObject)makeKeyword("NON-TRIVIAL"), (SubLObject)makeKeyword("NOT-A-QUERY"));
        $ic60$ = ConsesLow.list(new SubLObject[] { makeKeyword("ABORT"), makeKeyword("INTERRUPT"), makeKeyword("MAX-NUMBER"), makeKeyword("MAX-TIME"), makeKeyword("MAX-STEP"), makeKeyword("MAX-PROBLEM-COUNT"), makeKeyword("MAX-PROOF-COUNT"), makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeKeyword("EXHAUST"), makeKeyword("EXHAUST-TOTAL") });
        $ic61$ = makeSymbol("S#26560", "CYC");
        $ic62$ = makeKeyword("SUSPENDED");
        $ic63$ = makeKeyword("TAUTOLOGY");
        $ic64$ = ConsesLow.list((SubLObject)makeKeyword("INTERRUPT"), (SubLObject)makeKeyword("MAX-NUMBER"), (SubLObject)makeKeyword("MAX-TIME"), (SubLObject)makeKeyword("MAX-STEP"), (SubLObject)makeKeyword("PROBABLY-APPROXIMATELY-DONE"), (SubLObject)makeKeyword("EXHAUST"));
        $ic65$ = ConsesLow.list((SubLObject)makeKeyword("EXHAUST"), (SubLObject)makeKeyword("EXHAUST-TOTAL"));
        $ic66$ = makeKeyword("ERROR");
        $ic67$ = makeSymbol("STRINGP");
        $ic68$ = makeKeyword("JUSTIFICATION");
        $ic69$ = makeSymbol("S#14769", "CYC");
        $ic70$ = ConsesLow.list((SubLObject)makeKeyword("NEW"), (SubLObject)makeKeyword("UNEXAMINED"), (SubLObject)makeKeyword("EXAMINED"), (SubLObject)makeKeyword("POSSIBLE"), (SubLObject)makeKeyword("PENDING"), (SubLObject)makeKeyword("FINISHED"));
        $ic71$ = ConsesLow.list((SubLObject)makeKeyword("GOOD"), (SubLObject)makeKeyword("NEUTRAL"), (SubLObject)makeKeyword("NO-GOOD"));
        $ic72$ = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)makeKeyword("NEW"), (SubLObject)makeKeyword("NEW"), (SubLObject)makeKeyword("NEUTRAL")), ConsesLow.list((SubLObject)makeKeyword("UNEXAMINED"), (SubLObject)makeKeyword("UNEXAMINED"), (SubLObject)makeKeyword("NEUTRAL")), ConsesLow.list((SubLObject)makeKeyword("UNEXAMINED-GOOD"), (SubLObject)makeKeyword("UNEXAMINED"), (SubLObject)makeKeyword("GOOD")), ConsesLow.list((SubLObject)makeKeyword("UNEXAMINED-NO-GOOD"), (SubLObject)makeKeyword("UNEXAMINED"), (SubLObject)makeKeyword("NO-GOOD")), ConsesLow.list((SubLObject)makeKeyword("EXAMINED"), (SubLObject)makeKeyword("EXAMINED"), (SubLObject)makeKeyword("NEUTRAL")), ConsesLow.list((SubLObject)makeKeyword("EXAMINED-GOOD"), (SubLObject)makeKeyword("EXAMINED"), (SubLObject)makeKeyword("GOOD")), ConsesLow.list((SubLObject)makeKeyword("EXAMINED-NO-GOOD"), (SubLObject)makeKeyword("EXAMINED"), (SubLObject)makeKeyword("NO-GOOD")), ConsesLow.list((SubLObject)makeKeyword("POSSIBLE"), (SubLObject)makeKeyword("POSSIBLE"), (SubLObject)makeKeyword("NEUTRAL")), ConsesLow.list((SubLObject)makeKeyword("POSSIBLE-GOOD"), (SubLObject)makeKeyword("POSSIBLE"), (SubLObject)makeKeyword("GOOD")), ConsesLow.list((SubLObject)makeKeyword("POSSIBLE-NO-GOOD"), (SubLObject)makeKeyword("POSSIBLE"), (SubLObject)makeKeyword("NO-GOOD")), ConsesLow.list((SubLObject)makeKeyword("PENDING"), (SubLObject)makeKeyword("PENDING"), (SubLObject)makeKeyword("NEUTRAL")), ConsesLow.list((SubLObject)makeKeyword("PENDING-GOOD"), (SubLObject)makeKeyword("PENDING"), (SubLObject)makeKeyword("GOOD")), ConsesLow.list((SubLObject)makeKeyword("PENDING-NO-GOOD"), (SubLObject)makeKeyword("PENDING"), (SubLObject)makeKeyword("NO-GOOD")), ConsesLow.list((SubLObject)makeKeyword("FINISHED"), (SubLObject)makeKeyword("FINISHED"), (SubLObject)makeKeyword("NEUTRAL")), ConsesLow.list((SubLObject)makeKeyword("FINISHED-GOOD"), (SubLObject)makeKeyword("FINISHED"), (SubLObject)makeKeyword("GOOD")), ConsesLow.list((SubLObject)makeKeyword("FINISHED-NO-GOOD"), (SubLObject)makeKeyword("FINISHED"), (SubLObject)makeKeyword("NO-GOOD")) });
        $ic73$ = makeSymbol("SECOND");
        $ic74$ = ConsesLow.list((SubLObject)makeKeyword("NEW"), (SubLObject)makeKeyword("POSSIBLE"), (SubLObject)makeKeyword("PENDING"), (SubLObject)makeKeyword("EXAMINED"), (SubLObject)makeKeyword("UNEXAMINED"), (SubLObject)makeKeyword("FINISHED"));
        $ic75$ = makeString("No match to combine ~s and ~s");
        $ic76$ = makeKeyword("GOOD");
        $ic77$ = makeKeyword("NO-GOOD");
        $ic78$ = makeKeyword("NEUTRAL");
        $ic79$ = makeKeyword("UNEXAMINED");
        $ic80$ = makeKeyword("EXAMINED");
        $ic81$ = makeKeyword("POSSIBLE");
        $ic82$ = makeKeyword("PENDING");
        $ic83$ = makeKeyword("FINISHED");
        $ic84$ = makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?");
        $ic85$ = makeKeyword("NEGATION-BY-FAILURE?");
        $ic86$ = makeKeyword("COMPLETENESS-MINIMIZATION-ALLOWED?");
        $ic87$ = makeKeyword("EVALUATE-SUBL-ALLOWED?");
        $ic88$ = makeKeyword("REWRITE-ALLOWED?");
        $ic89$ = makeKeyword("ABDUCTION-ALLOWED?");
        $ic90$ = makeKeyword("NEW-TERMS-ALLOWED?");
        $ic91$ = makeKeyword("COMPUTE-ANSWER-JUSTIFICATIONS?");
        $ic92$ = makeKeyword("CUSTOM");
        $ic93$ = ConsesLow.list((SubLObject)makeKeyword("MINIMAL"), (SubLObject)makeKeyword("SHALLOW"), (SubLObject)makeKeyword("EXTENDED"), (SubLObject)makeKeyword("MAXIMAL"), (SubLObject)makeKeyword("CUSTOM"));
        $ic94$ = ConsesLow.list(new SubLObject[] { makeKeyword("REMOVAL"), makeKeyword("TRANSFORMATION"), makeKeyword("RESIDUAL-TRANSFORMATION"), makeKeyword("REWRITE"), makeKeyword("JOIN-ORDERED"), makeKeyword("JOIN"), makeKeyword("SPLIT"), makeKeyword("RESTRICTION"), makeKeyword("UNION"), makeKeyword("DISJUNCTIVE-ASSUMPTION"), makeKeyword("ANSWER"), makeKeyword("INDIRECTION") });
        $ic95$ = makeKeyword("PROBLEM-STORE-NAME");
        $ic96$ = makeKeyword("CZER-EQUAL");
        $ic97$ = ConsesLow.list((SubLObject)makeKeyword("EQUAL"), (SubLObject)makeKeyword("CZER-EQUAL"));
        $ic98$ = makeKeyword("EQUALITY-REASONING-METHOD");
        $ic99$ = ConsesLow.list((SubLObject)makeKeyword("ALL"), (SubLObject)makeKeyword("SINGLE-LITERAL"), (SubLObject)makeKeyword("NONE"));
        $ic100$ = makeKeyword("EQUALITY-REASONING-DOMAIN");
        $ic101$ = ConsesLow.list((SubLObject)makeKeyword("ALL"), (SubLObject)makeKeyword("ARG-TYPE"), (SubLObject)makeKeyword("MINIMAL"), (SubLObject)makeKeyword("NONE"));
        $ic102$ = makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL");
        $ic103$ = makeInteger(100000);
        $ic104$ = makeKeyword("MAX-PROBLEM-COUNT");
        $ic105$ = makeKeyword("REMOVAL-ALLOWED?");
        $ic106$ = makeKeyword("TRANSFORMATION-ALLOWED?");
        $ic107$ = makeKeyword("BACKWARD");
        $ic108$ = ConsesLow.list((SubLObject)makeKeyword("BACKWARD"), (SubLObject)makeKeyword("FORWARD"));
        $ic109$ = makeKeyword("DIRECTION");
        $ic110$ = ConsesLow.list((SubLObject)makeKeyword("POSSIBLE"), (SubLObject)makeKeyword("EXECUTED"), (SubLObject)makeKeyword("DISCARDED"));
        $ic111$ = ConsesLow.list((SubLObject)makeKeyword("REMOVAL"), (SubLObject)makeKeyword("META-REMOVAL"), (SubLObject)makeKeyword("TRANSFORMATION"), (SubLObject)makeKeyword("REWRITE"), (SubLObject)makeKeyword("STRUCTURAL"), (SubLObject)makeKeyword("REMOVAL-CONJUNCTIVE"));
        $ic112$ = makeKeyword("REMOVAL");
        $ic113$ = makeKeyword("TRANSFORMATION");
        $ic114$ = makeKeyword("STRUCTURAL");
        $ic115$ = makeKeyword("REMOVAL-CONJUNCTIVE");
        $ic116$ = makeKeyword("REWRITE");
        $ic117$ = makeKeyword("META-REMOVAL");
        $ic118$ = makeString("HL-Module of unknown type: ~s");
        $ic119$ = ConsesLow.list((SubLObject)makeKeyword("IMPOSSIBLE"), (SubLObject)makeKeyword("GROSSLY-INCOMPLETE"), (SubLObject)makeKeyword("INCOMPLETE"), (SubLObject)makeKeyword("COMPLETE"));
        $ic120$ = makeSymbol("S#26617", "CYC");
        $ic121$ = makeKeyword("COMPLETE");
        $ic122$ = makeString("Complete");
        $ic123$ = makeKeyword("INCOMPLETE");
        $ic124$ = makeString("Incomplete");
        $ic125$ = makeKeyword("GROSSLY-INCOMPLETE");
        $ic126$ = makeString("Grossly Incomplete");
        $ic127$ = makeKeyword("IMPOSSIBLE");
        $ic128$ = makeString("Impossible");
        $ic129$ = makeString("Unexpected completeness ~a");
        $ic130$ = makeSymbol("S#26619", "CYC");
        $ic131$ = makeSymbol("S#26620", "CYC");
        $ic132$ = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)makeDouble(0.5), (SubLObject)makeInteger(50)), (SubLObject)ConsesLow.cons((SubLObject)makeDouble(1.5), (SubLObject)makeInteger(150)));
        $ic133$ = makeSymbol("S#26625", "CYC");
        $ic134$ = ConsesLow.list((SubLObject)makeKeyword("PROVEN"), (SubLObject)makeKeyword("REJECTED"));
        $ic135$ = ConsesLow.list(new SubLObject[] { makeKeyword("CIRCULAR"), makeKeyword("ILL-FORMED"), makeKeyword("NON-ABDUCIBLE-RULE"), makeKeyword("REJECTED-SUBPROOF"), makeKeyword("MAX-PROOF-BUBBLING-DEPTH"), makeKeyword("INCONSISTENT-MT-ASSUMPTIONS"), makeKeyword("EXCEPTED-ASSERTION"), makeKeyword("ABNORMAL"), makeKeyword("PROBLEM-NO-GOOD"), makeKeyword("MODUS-TOLLENS-WITH-NON-WFF") });
        $ic136$ = ConsesLow.list((SubLObject)makeKeyword("INDESTRUCTIBLE"), (SubLObject)makeKeyword("DESTRUCTIBLE"), (SubLObject)makeKeyword("UNKNOWN"));
        $ic137$ = makeSymbol("S#26645", "CYC");
        $ic138$ = makeKeyword("INDESTRUCTIBLE");
        $ic139$ = makeString("Indestructible");
        $ic140$ = makeKeyword("DESTRUCTIBLE");
        $ic141$ = makeString("Destructible");
        $ic142$ = makeKeyword("UNKNOWN");
        $ic143$ = makeString("Unknown");
        $ic144$ = makeString("Unexpected destructibility status ~s");
        $ic145$ = makeString("I");
        $ic146$ = makeString("");
        $ic147$ = makeString("?");
        $ic148$ = ConsesLow.list(new SubLObject[] { ConsesLow.cons((SubLObject)makeKeyword("NAME"), (SubLObject)makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)makeKeyword("COMMENT"), (SubLObject)makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)makeKeyword("CONSTRUCTOR"), (SubLObject)makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)makeKeyword("DO-ONE-STEP"), (SubLObject)makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)makeKeyword("DONE?"), (SubLObject)makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)makeKeyword("POSSIBLY-ACTIVATE-PROBLEM"), (SubLObject)makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)makeKeyword("SELECT-BEST-STRATEGEM"), (SubLObject)makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)makeKeyword("EXECUTE-STRATEGEM"), (SubLObject)makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)makeKeyword("INITIAL-RELEVANT-STRATEGIES"), (SubLObject)makeSymbol("S#26776", "CYC")), ConsesLow.cons((SubLObject)makeKeyword("NEW-TACTIC"), (SubLObject)makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)makeKeyword("SPLIT-TACTICS-POSSIBLE"), (SubLObject)makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)makeKeyword("INITIALIZE-PROPERTIES"), (SubLObject)makeSymbol("S#26777", "CYC")), ConsesLow.cons((SubLObject)makeKeyword("UPDATE-PROPERTIES"), (SubLObject)makeSymbol("S#26778", "CYC")), ConsesLow.cons((SubLObject)makeKeyword("INFERENCE-DYNAMIC-PROPERTIES-UPDATED"), (SubLObject)makeSymbol("S#26779", "CYC")), ConsesLow.cons((SubLObject)makeKeyword("RECONSIDER-SET-ASIDES"), (SubLObject)makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)makeKeyword("THROW-AWAY-UNINTERESTING-SET-ASIDES"), (SubLObject)makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)makeKeyword("CONTINUATION-POSSIBLE?"), (SubLObject)makeSymbol("S#26780", "CYC")), ConsesLow.cons((SubLObject)makeKeyword("QUIESCE"), (SubLObject)makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)makeKeyword("NEW-ARGUMENT-LINK"), (SubLObject)makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)makeKeyword("RELEVANT-TACTICS-WRT-REMOVAL"), (SubLObject)makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)makeKeyword("PROBLEM-COULD-BE-PENDING"), (SubLObject)makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)makeKeyword("PROBLEM-NOTHING-TO-DO?"), (SubLObject)makeSymbol("S#26781", "CYC")), ConsesLow.cons((SubLObject)makeKeyword("THROW-AWAY-PROBLEM"), (SubLObject)makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)makeKeyword("SET-ASIDE-PROBLEM"), (SubLObject)makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)makeKeyword("THROW-AWAY-TACTIC"), (SubLObject)makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)makeKeyword("SET-ASIDE-TACTIC"), (SubLObject)makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)makeKeyword("PEEK-NEXT-STRATEGEM"), (SubLObject)makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)makeKeyword("MOTIVATE-STRATEGEM"), (SubLObject)makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)makeKeyword("ACTIVATE-STRATEGEM"), (SubLObject)makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)makeKeyword("LINK-HEAD-MOTIVATED?"), (SubLObject)makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)makeKeyword("RECONSIDER-SPLIT-SET-ASIDES"), (SubLObject)makeSymbol("S#4848", "CYC")), ConsesLow.cons((SubLObject)makeKeyword("SUBSTRATEGY-STRATEGEM-MOTIVATED"), (SubLObject)makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)makeKeyword("SUBSTRATEGY-TOTALLY-THROW-AWAY-TACTIC"), (SubLObject)makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)makeKeyword("SUBSTRATEGY-ALLOW-SPLIT-TACTIC-SET-ASIDE-WRT-REMOVAL"), (SubLObject)makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)makeKeyword("SUBSTRATEGY-PROBLEM-STATUS-CHANGE"), (SubLObject)makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)makeKeyword("HAPPINESS-TABLE"), (SubLObject)makeSymbol("NULL")) });
        $ic149$ = ConsesLow.list(new SubLObject[] { ConsesLow.cons((SubLObject)makeKeyword("EARLY-REMOVAL-PRODUCTIVITY-LIMIT"), (SubLObject)makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)makeKeyword("PEEK-NEW-ROOT"), (SubLObject)makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)makeKeyword("ACTIVATE-NEW-ROOT"), (SubLObject)makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)makeKeyword("POP-NEW-ROOT"), (SubLObject)makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)makeKeyword("NO-NEW-ROOTS"), (SubLObject)makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)makeKeyword("THROW-AWAY-NEW-ROOT"), (SubLObject)makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)makeKeyword("PEEK-REMOVAL-STRATEGEM"), (SubLObject)makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)makeKeyword("ACTIVATE-REMOVAL-STRATEGEM"), (SubLObject)makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)makeKeyword("POP-REMOVAL-STRATEGEM"), (SubLObject)makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)makeKeyword("NO-ACTIVE-REMOVAL-STRATEGEMS"), (SubLObject)makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)makeKeyword("PEEK-TRANSFORMATION-STRATEGEM"), (SubLObject)makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)makeKeyword("ACTIVATE-TRANSFORMATION-STRATEGEM"), (SubLObject)makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)makeKeyword("POP-TRANSFORMATION-STRATEGEM"), (SubLObject)makeKeyword("MUST-OVERRIDE")), ConsesLow.cons((SubLObject)makeKeyword("NO-ACTIVE-TRANSFORMATION-STRATEGEMS"), (SubLObject)makeKeyword("MUST-OVERRIDE")) });
        $ic150$ = makeSymbol("S#26647", "CYC");
        $ic151$ = makeKeyword("MUST-OVERRIDE");
        $ic152$ = makeString("Strategy must implement method ~s");
        $ic153$ = ConsesLow.list((SubLObject)makeKeyword("ANSWER"), (SubLObject)makeKeyword("BINDINGS"), (SubLObject)makeKeyword("SUPPORTS"), (SubLObject)makeKeyword("BINDINGS-AND-SUPPORTS"), (SubLObject)makeKeyword("BINDINGS-AND-SUPPORTS-AND-PRAGMATIC-SUPPORTS"), (SubLObject)makeKeyword("BINDINGS-AND-HYPOTHETICAL-BINDINGS"));
        $ic154$ = makeKeyword("BINDINGS");
        $ic155$ = makeKeyword("TEMPLATE");
        $ic156$ = makeKeyword("FORMAT");
        $ic157$ = makeKeyword("RETURN");
        $ic158$ = ConsesLow.list((SubLObject)makeKeyword("EL"), (SubLObject)makeKeyword("HL"));
        $ic159$ = makeKeyword("EL");
        $ic160$ = makeKeyword("ANSWER-LANGUAGE");
        $ic161$ = ConsesLow.list((SubLObject)makeKeyword("PROOF"), (SubLObject)makeKeyword("BINDINGS"));
        $ic162$ = makeKeyword("RESULT-UNIQUENESS");
        $ic163$ = ConsesLow.list((SubLObject)makeKeyword("REQUIRE-EQUAL"), (SubLObject)makeKeyword("COMPUTE-INTERSECTION"), (SubLObject)makeKeyword("COMPUTE-UNION"));
        $ic164$ = makeKeyword("REQUIRE-EQUAL");
        $ic165$ = makeKeyword("DISJUNCTION-FREE-EL-VARS-POLICY");
        $ic166$ = ConsesLow.list((SubLObject)makeKeyword("NONE"), (SubLObject)makeKeyword("FOCUSED"), (SubLObject)makeKeyword("ALL"));
        $ic167$ = makeKeyword("TRANSITIVE-CLOSURE-MODE");
        $ic168$ = makeKeyword("MAINTAIN-TERM-WORKING-SET?");
        $ic169$ = makeKeyword("EVENTS");
        $ic170$ = ConsesLow.list((SubLObject)makeKeyword("NEW-ANSWER"), (SubLObject)makeKeyword("STATUS-CHANGE"), (SubLObject)makeKeyword("NEW-TRANSFORMATION-DEPTH-REACHED"));
        $ic171$ = makeKeyword("HALT-CONDITIONS");
        $ic172$ = ConsesLow.list((SubLObject)makeKeyword("LOOK-NO-DEEPER-FOR-ADDITIONAL-ANSWERS"));
        $ic173$ = makeSymbol("S#26668", "CYC");
        $ic174$ = makeKeyword("FORGET-EXTRA-RESULTS?");
        $ic175$ = makeKeyword("CACHE-INFERENCE-RESULTS?");
        $ic176$ = makeKeyword("BROWSABLE?");
        $ic177$ = makeKeyword("CONTINUABLE?");
        $ic178$ = makeKeyword("BLOCK?");
        $ic179$ = makeKeyword("UNSPECIFIED");
        $ic180$ = makeKeyword("CONDITIONAL-SENTENCE?");
        $ic181$ = makeKeyword("NON-EXPLANATORY-SENTENCE");
        $ic182$ = makeSymbol("INFERENCE-P");
    }
    
    public static final class $f23782$UnaryFunction extends UnaryFunction
    {
        public $f23782$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#26477"));
        }
        
        public SubLObject processItem(final SubLObject var7) {
            return f23782(var7);
        }
    }
    
    public static final class $f23783$UnaryFunction extends UnaryFunction
    {
        public $f23783$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#26478"));
        }
        
        public SubLObject processItem(final SubLObject var7) {
            return f23783(var7);
        }
    }
    
    public static final class $f23810$UnaryFunction extends UnaryFunction
    {
        public $f23810$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#26480"));
        }
        
        public SubLObject processItem(final SubLObject var7) {
            return f23810(var7);
        }
    }
    
    public static final class $f23789$UnaryFunction extends UnaryFunction
    {
        public $f23789$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#26482"));
        }
        
        public SubLObject processItem(final SubLObject var7) {
            return f23789(var7);
        }
    }
    
    public static final class $f23801$UnaryFunction extends UnaryFunction
    {
        public $f23801$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#26483"));
        }
        
        public SubLObject processItem(final SubLObject var7) {
            return f23801(var7);
        }
    }
    
    public static final class $f23791$UnaryFunction extends UnaryFunction
    {
        public $f23791$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#26484"));
        }
        
        public SubLObject processItem(final SubLObject var7) {
            return f23791(var7);
        }
    }
    
    public static final class $f23803$UnaryFunction extends UnaryFunction
    {
        public $f23803$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#26485"));
        }
        
        public SubLObject processItem(final SubLObject var7) {
            return f23803(var7);
        }
    }
    
    public static final class $f23855$UnaryFunction extends UnaryFunction
    {
        public $f23855$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PROBLEM-STORE-PROPERTY-P"));
        }
        
        public SubLObject processItem(final SubLObject var7) {
            return f23855(var7);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 542 ms
	
	Decompiled with Procyon 0.5.32.
*/