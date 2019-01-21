package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class subl_macros extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.subl_macros";
    public static final String myFingerPrint = "83c70bf0e3123160608f92d661c9ab0ea0f69353ab9d704f32c0457e35519520";
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 19527L)
    public static SubLSymbol $ignore_assert_typesP$;
    private static final SubLSymbol $sym0$UNTIL;
    private static final SubLList $list1;
    private static final SubLSymbol $sym2$CDO;
    private static final SubLSymbol $sym3$WHILE;
    private static final SubLSymbol $sym4$CNOT;
    private static final SubLSymbol $sym5$REPEAT_FOREVER;
    private static final SubLSymbol $sym6$DO_NUMBERS;
    private static final SubLList $list7;
    private static final SubLList $list8;
    private static final SubLSymbol $kw9$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw10$START;
    private static final SubLSymbol $kw11$END;
    private static final SubLSymbol $kw12$DELTA;
    private static final SubLSymbol $kw13$DONE;
    private static final SubLSymbol $sym14$CDOTIMES;
    private static final SubLSymbol $sym15$1_;
    private static final SubLSymbol $sym16$_;
    private static final SubLSymbol $sym17$DELTA_VAR;
    private static final SubLSymbol $sym18$END_VAR;
    private static final SubLSymbol $sym19$DO_NUMBERS_ENDTEST_MACRO;
    private static final SubLSymbol $sym20$COR;
    private static final SubLSymbol $sym21$CLET;
    private static final SubLSymbol $sym22$PUNLESS;
    private static final SubLList $list23;
    private static final SubLSymbol $sym24$__;
    private static final SubLSymbol $sym25$__;
    private static final SubLSymbol $sym26$_;
    private static final SubLSymbol $sym27$DO_NUMBERS_ENDTEST;
    private static final SubLSymbol $sym28$DO_LIST;
    private static final SubLList $list29;
    private static final SubLList $list30;
    private static final SubLSymbol $kw31$PROGRESS_MESSAGE;
    private static final SubLSymbol $sym32$MESSAGE_VAR;
    private static final SubLSymbol $sym33$LIST_VAR;
    private static final SubLSymbol $sym34$SOFAR;
    private static final SubLSymbol $sym35$TOTAL;
    private static final SubLList $list36;
    private static final SubLSymbol $sym37$LENGTH;
    private static final SubLSymbol $sym38$NOTING_PERCENT_PROGRESS;
    private static final SubLSymbol $sym39$NOTE_PERCENT_PROGRESS;
    private static final SubLSymbol $sym40$CINC;
    private static final SubLSymbol $sym41$REST;
    private static final SubLSymbol $sym42$CDR;
    private static final SubLSymbol $sym43$NULL;
    private static final SubLSymbol $sym44$CAR;
    private static final SubLSymbol $sym45$CDOLIST;
    private static final SubLSymbol $sym46$DO_LIST_INDEX;
    private static final SubLList $list47;
    private static final SubLList $list48;
    private static final SubLSymbol $sym49$LIST_VAR;
    private static final SubLSymbol $sym50$DO_ALIST;
    private static final SubLList $list51;
    private static final SubLList $list52;
    private static final SubLSymbol $kw53$INDEX;
    private static final SubLSymbol $sym54$CONS;
    private static final SubLSymbol $sym55$CDESTRUCTURING_BIND;
    private static final SubLSymbol $sym56$DO_ALIST_VALUES;
    private static final SubLList $list57;
    private static final SubLSymbol $sym58$KEY;
    private static final SubLSymbol $sym59$IGNORE;
    private static final SubLSymbol $sym60$DO_ALIST_KEYS;
    private static final SubLList $list61;
    private static final SubLSymbol $sym62$VALUE;
    private static final SubLSymbol $sym63$CINC_ALIST;
    private static final SubLList $list64;
    private static final SubLSymbol $sym65$ENTRY;
    private static final SubLSymbol $sym66$ASSOC;
    private static final SubLSymbol $sym67$QUOTE;
    private static final SubLSymbol $sym68$CSETQ;
    private static final SubLSymbol $sym69$CONS;
    private static final SubLSymbol $sym70$CPUSH;
    private static final SubLSymbol $sym71$RPLACD;
    private static final SubLSymbol $sym72$CDEC_ALIST;
    private static final SubLList $list73;
    private static final SubLSymbol $sym74$DO_PLIST;
    private static final SubLList $list75;
    private static final SubLSymbol $sym76$REMAINDER;
    private static final SubLSymbol $sym77$CDDR;
    private static final SubLSymbol $sym78$CADR;
    private static final SubLSymbol $sym79$DO_PLIST_PROPERTIES;
    private static final SubLList $list80;
    private static final SubLSymbol $sym81$VALUE;
    private static final SubLSymbol $sym82$DO_PLIST_VALUES;
    private static final SubLList $list83;
    private static final SubLSymbol $sym84$PROPERTY;
    private static final SubLList $list85;
    private static final SubLSymbol $sym86$CDOCONS;
    private static final SubLList $list87;
    private static final SubLSymbol $sym88$ATOM;
    private static final SubLSymbol $sym89$DO_PAIRS;
    private static final SubLList $list90;
    private static final SubLSymbol $sym91$LIST;
    private static final SubLSymbol $sym92$FIRST;
    private static final SubLSymbol $sym93$CSOME;
    private static final SubLSymbol $sym94$REST;
    private static final SubLSymbol $sym95$DO_LIST_WITH_TAIL;
    private static final SubLList $list96;
    private static final SubLSymbol $sym97$CDR_VAR;
    private static final SubLSymbol $sym98$DOLISTS;
    private static final SubLList $list99;
    private static final SubLString $str100$CURRENT__A;
    private static final SubLSymbol $sym101$CAND;
    private static final SubLSymbol $sym102$DO_STRING;
    private static final SubLList $list103;
    private static final SubLList $list104;
    private static final SubLSymbol $kw105$CHAR_NUM;
    private static final SubLSymbol $sym106$DO_STRING_INDEX;
    private static final SubLSymbol $sym107$CHAR_NUM;
    private static final SubLList $list108;
    private static final SubLList $list109;
    private static final SubLSymbol $sym110$STRING_VAR;
    private static final SubLSymbol $sym111$END_VAR;
    private static final SubLSymbol $sym112$FIF;
    private static final SubLSymbol $sym113$CHAR;
    private static final SubLSymbol $sym114$DO_VECTOR;
    private static final SubLList $list115;
    private static final SubLList $list116;
    private static final SubLSymbol $kw117$ELEMENT_NUM;
    private static final SubLSymbol $kw118$BACKWARD_;
    private static final SubLSymbol $sym119$DO_VECTOR_INDEX;
    private static final SubLSymbol $sym120$ELEMENT_NUM;
    private static final SubLList $list121;
    private static final SubLList $list122;
    private static final SubLSymbol $sym123$VECTOR_VAR;
    private static final SubLSymbol $sym124$BACKWARD__VAR;
    private static final SubLSymbol $sym125$LENGTH;
    private static final SubLSymbol $sym126$START;
    private static final SubLSymbol $sym127$END;
    private static final SubLSymbol $sym128$DELTA;
    private static final SubLSymbol $sym129$LIST;
    private static final SubLSymbol $sym130$_;
    private static final SubLList $list131;
    private static final SubLList $list132;
    private static final SubLSymbol $sym133$AREF;
    private static final SubLSymbol $sym134$ITERATION;
    private static final SubLSymbol $sym135$CDOVECTOR;
    private static final SubLList $list136;
    private static final SubLSymbol $sym137$CSOME_VECTOR;
    private static final SubLList $list138;
    private static final SubLSymbol $sym139$SMART_CSOMEVECTOR;
    private static final SubLSymbol $sym140$DO_SEQUENCE;
    private static final SubLList $list141;
    private static final SubLList $list142;
    private static final SubLSymbol $sym143$DO_SEQUENCE_INDEX;
    private static final SubLSymbol $sym144$ELEMENT_NUM;
    private static final SubLList $list145;
    private static final SubLSymbol $sym146$SEQUENCE_VAR;
    private static final SubLSymbol $sym147$END_INDEX;
    private static final SubLSymbol $sym148$SEQUENCE_DONE_;
    private static final SubLSymbol $sym149$FUNLESS;
    private static final SubLSymbol $sym150$LISTP;
    private static final SubLSymbol $sym151$DO_SEQUENCE_INDEX_DONE_;
    private static final SubLSymbol $sym152$DO_SEQUENCE_INDEX_VALUE_;
    private static final SubLSymbol $sym153$PROGN;
    private static final SubLSymbol $sym154$DO_SEQUENCE_INDEX_UPDATE;
    private static final SubLSymbol $sym155$DO_HASH_TABLE;
    private static final SubLList $list156;
    private static final SubLSymbol $sym157$MESSAGE_VAR;
    private static final SubLSymbol $sym158$SILENT_;
    private static final SubLSymbol $sym159$TABLE_VAR;
    private static final SubLSymbol $sym160$INDEX_VAR;
    private static final SubLSymbol $sym161$COUNT_VAR;
    private static final SubLList $list162;
    private static final SubLSymbol $sym163$_SILENT_PROGRESS__;
    private static final SubLSymbol $sym164$FIRST_OF;
    private static final SubLList $list165;
    private static final SubLSymbol $sym166$HASH_TABLE_COUNT;
    private static final SubLSymbol $sym167$CCATCH_IGNORE;
    private static final SubLSymbol $kw168$DO_HASH_TABLE;
    private static final SubLSymbol $sym169$DO_HASH_TABLE_DONE_CHECK;
    private static final SubLSymbol $sym170$CDOHASH;
    private static final SubLSymbol $sym171$DO_HASH_TABLE_KEYS;
    private static final SubLList $list172;
    private static final SubLSymbol $sym173$NO_VALUE;
    private static final SubLList $list174;
    private static final SubLSymbol $sym175$CATCH_VAR;
    private static final SubLSymbol $sym176$CCATCH;
    private static final SubLSymbol $sym177$PUNLESS_ERROR;
    private static final SubLList $list178;
    private static final SubLSymbol $sym179$ERROR;
    private static final SubLSymbol $sym180$CATCH_ERROR_MESSAGE;
    private static final SubLSymbol $sym181$PWHEN_ERROR;
    private static final SubLSymbol $sym182$ERROR;
    private static final SubLSymbol $sym183$PWHEN;
    private static final SubLSymbol $sym184$WARN_ON_ERRORS;
    private static final SubLSymbol $sym185$MESSAGE_VAR;
    private static final SubLSymbol $sym186$WITHOUT_APPENDING_STACK_TRACES_TO_ERROR_MESSAGES;
    private static final SubLSymbol $sym187$STRINGP;
    private static final SubLSymbol $sym188$WARN;
    private static final SubLString $str189$_A;
    private static final SubLSymbol $sym190$POSSIBLY_WARN_ON_ERRORS;
    private static final SubLList $list191;
    private static final SubLSymbol $sym192$PIF;
    private static final SubLSymbol $sym193$POSSIBLY_IGNORE_ERRORS;
    private static final SubLSymbol $sym194$IGNORE_ERRORS;
    private static final SubLSymbol $sym195$WARN_OR_IGNORE_ERRORS;
    private static final SubLSymbol $sym196$WITH_DEFAULT_ERROR_HANDLING;
    private static final SubLSymbol $sym197$WITH_ERROR_HANDLER;
    private static final SubLSymbol $sym198$CUNWIND_ON_FAILURE;
    private static final SubLList $list199;
    private static final SubLSymbol $sym200$SUCCESS_VAR;
    private static final SubLSymbol $sym201$CUNWIND_PROTECT;
    private static final SubLList $list202;
    private static final SubLSymbol $sym203$CUNWIND_PROTECT_WITH_FAIL_CLAUSE;
    private static final SubLList $list204;
    private static final SubLSymbol $sym205$SUCCESS_VAR;
    private static final SubLSymbol $sym206$_IGNORE_ASSERT_TYPES__;
    private static final SubLSymbol $sym207$ASSERT_TYPE;
    private static final SubLList $list208;
    private static final SubLSymbol $sym209$CHECK_TYPE;
    private static final SubLSymbol $sym210$ASSERT_TYPE_IF_PRESENT;
    private static final SubLSymbol $sym211$CHECK_TYPE_IF_PRESENT;
    private static final SubLSymbol $sym212$ASSERT_LIST_TYPE;
    private static final SubLList $list213;
    private static final SubLSymbol $sym214$CHECK_LIST_TYPE;
    private static final SubLSymbol $sym215$ASSERT_PLIST_TYPE;
    private static final SubLList $list216;
    private static final SubLSymbol $sym217$CHECK_PLIST_TYPE;
    private static final SubLSymbol $sym218$ASSERT_MUST;
    private static final SubLList $list219;
    private static final SubLList $list220;
    private static final SubLSymbol $sym221$MUST;
    private static final SubLSymbol $sym222$PCASE_FEATURE;
    private static final SubLList $list223;
    private static final SubLSymbol $sym224$OTHERWISE;
    private static final SubLSymbol $sym225$PIF_FEATURE;
    private static final SubLList $list226;
    private static final SubLList $list227;
    private static final SubLSymbol $sym228$PWHEN_FEATURE;
    private static final SubLList $list229;
    private static final SubLSymbol $sym230$PUNLESS_FEATURE;
    private static final SubLSymbol $sym231$FCASE_FEATURE;
    private static final SubLList $list232;
    private static final SubLSymbol $sym233$FIF_FEATURE;
    private static final SubLSymbol $sym234$FWHEN_FEATURE;
    private static final SubLSymbol $sym235$FEATURE_MATCH;
    private static final SubLList $list236;
    private static final SubLSymbol $sym237$FUNLESS_FEATURE;
    private static final SubLList $list238;
    private static final SubLSymbol $sym239$FIMPLIES_FEATURE;
    private static final SubLList $list240;
    private static final SubLSymbol $sym241$ATOMIC_FEATURE_MATCH;
    private static final SubLSymbol $sym242$FEATURE_EXPRESSION_MATCH;
    private static final SubLList $list243;
    private static final SubLSymbol $kw244$NOT;
    private static final SubLSymbol $sym245$NOT;
    private static final SubLSymbol $kw246$OR;
    private static final SubLSymbol $sym247$OR;
    private static final SubLSymbol $kw248$AND;
    private static final SubLSymbol $sym249$AND;
    private static final SubLString $str250$_S_is_not_a_well_formed_feature_e;
    private static final SubLSymbol $sym251$FUNCALL_IF;
    private static final SubLList $list252;
    private static final SubLList $list253;
    private static final SubLSymbol $sym254$FWHEN;
    private static final SubLSymbol $sym255$FUNCALL;
    private static final SubLSymbol $sym256$CPUSH_IF;
    private static final SubLList $list257;
    private static final SubLSymbol $sym258$VAR;
    private static final SubLSymbol $sym259$CPUSHNEW_IF;
    private static final SubLList $list260;
    private static final SubLList $list261;
    private static final SubLList $list262;
    private static final SubLSymbol $sym263$VAR;
    private static final SubLSymbol $sym264$CPUSHNEW;
    private static final SubLSymbol $sym265$CPUSH_ALL;
    private static final SubLList $list266;
    private static final SubLSymbol $sym267$ITEM;
    private static final SubLSymbol $sym268$ITEMS_VAR;
    private static final SubLSymbol $sym269$VECTORP;
    private static final SubLSymbol $sym270$CPUSHNEW_ALL;
    private static final SubLList $list271;
    private static final SubLSymbol $sym272$ITEM;
    private static final SubLSymbol $sym273$ITEMS_VAR;
    private static final SubLSymbol $sym274$CSETF_DELETE;
    private static final SubLList $list275;
    private static final SubLList $list276;
    private static final SubLSymbol $kw277$TEST;
    private static final SubLSymbol $kw278$KEY;
    private static final SubLSymbol $sym279$CSETF;
    private static final SubLSymbol $sym280$DELETE;
    private static final SubLSymbol $sym281$CPUSH_END;
    private static final SubLSymbol $sym282$NEW_CONS;
    private static final SubLSymbol $sym283$LIST;
    private static final SubLSymbol $sym284$RPLACD_LAST;
    private static final SubLSymbol $sym285$CPUSHNEW_END;
    private static final SubLSymbol $sym286$ITEM_VAR;
    private static final SubLSymbol $sym287$MEMBER;
    private static final SubLSymbol $sym288$WAS_APPENDING_;
    private static final SubLSymbol $kw289$SL2JAVA;
    private static final SubLList $list290;
    private static final SubLList $list291;
    private static final SubLSymbol $sym292$EVAL;
    private static final SubLList $list293;
    private static final SubLList $list294;
    private static final SubLSymbol $sym295$SILENTLY;
    private static final SubLList $list296;
    private static final SubLSymbol $sym297$FIMPLIES;
    private static final SubLList $list298;
    private static final SubLSymbol $sym299$FXOR;
    private static final SubLList $list300;
    private static final SubLSymbol $sym301$FEQUIV;
    private static final SubLList $list302;
    private static final SubLSymbol $sym303$WITH_STATIC_AREA;
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 660L)
    public static SubLObject until(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject test = (SubLObject)subl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list1);
        test = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)subl_macros.$sym2$CDO, (SubLObject)subl_macros.NIL, (SubLObject)ConsesLow.list(test), ConsesLow.append(body, (SubLObject)subl_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 826L)
    public static SubLObject sublisp_while(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject test = (SubLObject)subl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list1);
        test = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)subl_macros.$sym0$UNTIL, (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym4$CNOT, test), ConsesLow.append(body, (SubLObject)subl_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 961L)
    public static SubLObject repeat_forever(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)subl_macros.$sym3$WHILE, (SubLObject)subl_macros.T, ConsesLow.append(body, (SubLObject)subl_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 1074L)
    public static SubLObject do_numbers(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list7);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject number_var = (SubLObject)subl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list7);
        number_var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)subl_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)subl_macros.NIL;
        SubLObject current_$1 = (SubLObject)subl_macros.NIL;
        while (subl_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)subl_macros.$list7);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)subl_macros.$list7);
            if (subl_macros.NIL == conses_high.member(current_$1, (SubLObject)subl_macros.$list8, (SubLObject)subl_macros.UNPROVIDED, (SubLObject)subl_macros.UNPROVIDED)) {
                bad = (SubLObject)subl_macros.T;
            }
            if (current_$1 == subl_macros.$kw9$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (subl_macros.NIL != bad && subl_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)subl_macros.$list7);
        }
        final SubLObject start_tail = cdestructuring_bind.property_list_member((SubLObject)subl_macros.$kw10$START, current);
        final SubLObject start = (SubLObject)((subl_macros.NIL != start_tail) ? conses_high.cadr(start_tail) : subl_macros.ZERO_INTEGER);
        final SubLObject end_tail = cdestructuring_bind.property_list_member((SubLObject)subl_macros.$kw11$END, current);
        final SubLObject end = (SubLObject)((subl_macros.NIL != end_tail) ? conses_high.cadr(end_tail) : subl_macros.NIL);
        final SubLObject delta_tail = cdestructuring_bind.property_list_member((SubLObject)subl_macros.$kw12$DELTA, current);
        final SubLObject delta = (SubLObject)((subl_macros.NIL != delta_tail) ? conses_high.cadr(delta_tail) : subl_macros.ONE_INTEGER);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)subl_macros.$kw13$DONE, current);
        final SubLObject done = (SubLObject)((subl_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : subl_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        if (subl_macros.ZERO_INTEGER.eql(start) && end.isInteger() && !end.isNegative() && subl_macros.ONE_INTEGER.eql(delta) && subl_macros.NIL == done) {
            return (SubLObject)ConsesLow.listS((SubLObject)subl_macros.$sym14$CDOTIMES, (SubLObject)ConsesLow.list(number_var, end), ConsesLow.append(body, (SubLObject)subl_macros.NIL));
        }
        SubLObject clet_initializations = (SubLObject)subl_macros.NIL;
        SubLObject delta_form = (SubLObject)subl_macros.NIL;
        SubLObject update_form = (SubLObject)subl_macros.NIL;
        SubLObject end_test_form = (SubLObject)subl_macros.NIL;
        SubLObject iteration_form = (SubLObject)subl_macros.NIL;
        if (subl_macros.ONE_INTEGER.eql(delta)) {
            delta_form = (SubLObject)subl_macros.ONE_INTEGER;
            update_form = (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym15$1_, number_var);
        }
        else if (delta.isAtom()) {
            delta_form = delta;
            update_form = (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym16$_, number_var, delta);
        }
        else {
            final SubLObject delta_var = (SubLObject)subl_macros.$sym17$DELTA_VAR;
            clet_initializations = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(delta_var, delta), clet_initializations);
            delta_form = delta_var;
            update_form = (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym16$_, number_var, delta_var);
        }
        if (subl_macros.NIL != end) {
            final SubLObject end_var = (SubLObject)subl_macros.$sym18$END_VAR;
            clet_initializations = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(end_var, end), clet_initializations);
            end_test_form = (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym19$DO_NUMBERS_ENDTEST_MACRO, number_var, delta_form, end_var);
        }
        if (subl_macros.NIL != done) {
            if (subl_macros.NIL != end_test_form) {
                end_test_form = (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym20$COR, done, end_test_form);
            }
            else {
                end_test_form = done;
            }
        }
        iteration_form = (SubLObject)ConsesLow.listS((SubLObject)subl_macros.$sym2$CDO, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(number_var, start, update_form)), (SubLObject)ConsesLow.list(end_test_form), ConsesLow.append(body, (SubLObject)subl_macros.NIL));
        if (subl_macros.NIL != clet_initializations) {
            iteration_form = (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym21$CLET, clet_initializations, iteration_form);
        }
        if (subl_macros.NIL != done) {
            iteration_form = (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym22$PUNLESS, done, iteration_form);
        }
        return iteration_form;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 3260L)
    public static SubLObject do_numbers_endtest_macro(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject number_var = (SubLObject)subl_macros.NIL;
        SubLObject delta_form = (SubLObject)subl_macros.NIL;
        SubLObject end_var = (SubLObject)subl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list23);
        number_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list23);
        delta_form = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list23);
        end_var = current.first();
        current = current.rest();
        if (subl_macros.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)subl_macros.$list23);
            return (SubLObject)subl_macros.NIL;
        }
        if (!delta_form.isNumber()) {
            return (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym27$DO_NUMBERS_ENDTEST, number_var, delta_form, end_var);
        }
        if (delta_form.isPositive()) {
            return (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym24$__, number_var, end_var);
        }
        if (delta_form.isNegative()) {
            return (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym25$__, number_var, end_var);
        }
        return (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym26$_, number_var, end_var);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 3658L)
    public static SubLObject do_numbers_endtest(final SubLObject number, final SubLObject delta, final SubLObject end) {
        if (delta.isPositive()) {
            return Numbers.numGE(number, end);
        }
        if (delta.isNegative()) {
            return Numbers.numLE(number, end);
        }
        return Numbers.numE(number, end);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 3875L)
    public static SubLObject do_list(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list29);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)subl_macros.NIL;
        SubLObject list = (SubLObject)subl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list29);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list29);
        list = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)subl_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)subl_macros.NIL;
        SubLObject current_$2 = (SubLObject)subl_macros.NIL;
        while (subl_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)subl_macros.$list29);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)subl_macros.$list29);
            if (subl_macros.NIL == conses_high.member(current_$2, (SubLObject)subl_macros.$list30, (SubLObject)subl_macros.UNPROVIDED, (SubLObject)subl_macros.UNPROVIDED)) {
                bad = (SubLObject)subl_macros.T;
            }
            if (current_$2 == subl_macros.$kw9$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (subl_macros.NIL != bad && subl_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)subl_macros.$list29);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)subl_macros.$kw13$DONE, current);
        final SubLObject done = (SubLObject)((subl_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : subl_macros.NIL);
        final SubLObject progress_message_tail = cdestructuring_bind.property_list_member((SubLObject)subl_macros.$kw31$PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (SubLObject)((subl_macros.NIL != progress_message_tail) ? conses_high.cadr(progress_message_tail) : subl_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        if (subl_macros.NIL != progress_message) {
            final SubLObject message_var = (SubLObject)subl_macros.$sym32$MESSAGE_VAR;
            final SubLObject list_var = (SubLObject)subl_macros.$sym33$LIST_VAR;
            final SubLObject sofar = (SubLObject)subl_macros.$sym34$SOFAR;
            final SubLObject total = (SubLObject)subl_macros.$sym35$TOTAL;
            return (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym21$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(message_var, progress_message), (SubLObject)ConsesLow.list(list_var, list), reader.bq_cons(sofar, (SubLObject)subl_macros.$list36), (SubLObject)ConsesLow.list(total, (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym37$LENGTH, list_var))), (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym38$NOTING_PERCENT_PROGRESS, message_var, (SubLObject)ConsesLow.listS((SubLObject)subl_macros.$sym28$DO_LIST, (SubLObject)ConsesLow.list(var, list_var, (SubLObject)subl_macros.$kw13$DONE, done), (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym39$NOTE_PERCENT_PROGRESS, sofar, total), (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym40$CINC, sofar), ConsesLow.append(body, (SubLObject)subl_macros.NIL))));
        }
        if (subl_macros.NIL != done) {
            final SubLObject rest_$3 = (SubLObject)subl_macros.$sym41$REST;
            return (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym2$CDO, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(rest_$3, list, (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym42$CDR, rest_$3))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym20$COR, done, (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym43$NULL, rest_$3))), (SubLObject)ConsesLow.listS((SubLObject)subl_macros.$sym21$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var, (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym44$CAR, rest_$3))), ConsesLow.append(body, (SubLObject)subl_macros.NIL)));
        }
        return (SubLObject)ConsesLow.listS((SubLObject)subl_macros.$sym45$CDOLIST, (SubLObject)ConsesLow.list(var, list), ConsesLow.append(body, (SubLObject)subl_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 4635L)
    public static SubLObject do_list_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list47);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = (SubLObject)subl_macros.NIL;
        SubLObject value = (SubLObject)subl_macros.NIL;
        SubLObject list = (SubLObject)subl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list47);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list47);
        value = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list47);
        list = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)subl_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)subl_macros.NIL;
        SubLObject current_$4 = (SubLObject)subl_macros.NIL;
        while (subl_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)subl_macros.$list47);
            current_$4 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)subl_macros.$list47);
            if (subl_macros.NIL == conses_high.member(current_$4, (SubLObject)subl_macros.$list48, (SubLObject)subl_macros.UNPROVIDED, (SubLObject)subl_macros.UNPROVIDED)) {
                bad = (SubLObject)subl_macros.T;
            }
            if (current_$4 == subl_macros.$kw9$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (subl_macros.NIL != bad && subl_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)subl_macros.$list47);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)subl_macros.$kw13$DONE, current);
        final SubLObject done = (SubLObject)((subl_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : subl_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject list_var = (SubLObject)subl_macros.$sym49$LIST_VAR;
        return (SubLObject)ConsesLow.listS((SubLObject)subl_macros.$sym2$CDO, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(list_var, list, (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym42$CDR, list_var)), (SubLObject)ConsesLow.list(value, (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym44$CAR, list_var), (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym44$CAR, list_var)), (SubLObject)ConsesLow.list(key, (SubLObject)subl_macros.ZERO_INTEGER, (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym15$1_, key))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym20$COR, done, (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym43$NULL, list_var))), ConsesLow.append(body, (SubLObject)subl_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 4992L)
    public static SubLObject do_alist(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list51);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = (SubLObject)subl_macros.NIL;
        SubLObject value = (SubLObject)subl_macros.NIL;
        SubLObject alist = (SubLObject)subl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list51);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list51);
        value = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list51);
        alist = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)subl_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)subl_macros.NIL;
        SubLObject current_$5 = (SubLObject)subl_macros.NIL;
        while (subl_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)subl_macros.$list51);
            current_$5 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)subl_macros.$list51);
            if (subl_macros.NIL == conses_high.member(current_$5, (SubLObject)subl_macros.$list52, (SubLObject)subl_macros.UNPROVIDED, (SubLObject)subl_macros.UNPROVIDED)) {
                bad = (SubLObject)subl_macros.T;
            }
            if (current_$5 == subl_macros.$kw9$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (subl_macros.NIL != bad && subl_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)subl_macros.$list51);
        }
        final SubLObject index_tail = cdestructuring_bind.property_list_member((SubLObject)subl_macros.$kw53$INDEX, current);
        final SubLObject index = (SubLObject)((subl_macros.NIL != index_tail) ? conses_high.cadr(index_tail) : subl_macros.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)subl_macros.$kw13$DONE, current);
        final SubLObject done = (SubLObject)((subl_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : subl_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        if (subl_macros.NIL != index) {
            return (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym21$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(index, (SubLObject)subl_macros.$list36)), (SubLObject)ConsesLow.listS((SubLObject)subl_macros.$sym50$DO_ALIST, (SubLObject)ConsesLow.list(key, value, alist, (SubLObject)subl_macros.$kw13$DONE, done), ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym40$CINC, index)))));
        }
        final SubLObject cons = (SubLObject)subl_macros.$sym54$CONS;
        return (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym28$DO_LIST, (SubLObject)ConsesLow.list(cons, alist, (SubLObject)subl_macros.$kw13$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)subl_macros.$sym55$CDESTRUCTURING_BIND, reader.bq_cons(key, value), cons, ConsesLow.append(body, (SubLObject)subl_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 5409L)
    public static SubLObject do_alist_values(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list57);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject value = (SubLObject)subl_macros.NIL;
        SubLObject alist = (SubLObject)subl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list57);
        value = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list57);
        alist = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)subl_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)subl_macros.NIL;
        SubLObject current_$6 = (SubLObject)subl_macros.NIL;
        while (subl_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)subl_macros.$list57);
            current_$6 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)subl_macros.$list57);
            if (subl_macros.NIL == conses_high.member(current_$6, (SubLObject)subl_macros.$list48, (SubLObject)subl_macros.UNPROVIDED, (SubLObject)subl_macros.UNPROVIDED)) {
                bad = (SubLObject)subl_macros.T;
            }
            if (current_$6 == subl_macros.$kw9$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (subl_macros.NIL != bad && subl_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)subl_macros.$list57);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)subl_macros.$kw13$DONE, current);
        final SubLObject done = (SubLObject)((subl_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : subl_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject key = (SubLObject)subl_macros.$sym58$KEY;
        return (SubLObject)ConsesLow.listS((SubLObject)subl_macros.$sym50$DO_ALIST, (SubLObject)ConsesLow.list(key, value, alist, (SubLObject)subl_macros.$kw13$DONE, done), (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym59$IGNORE, key), ConsesLow.append(body, (SubLObject)subl_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 5594L)
    public static SubLObject do_alist_keys(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list61);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = (SubLObject)subl_macros.NIL;
        SubLObject alist = (SubLObject)subl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list61);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list61);
        alist = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)subl_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)subl_macros.NIL;
        SubLObject current_$7 = (SubLObject)subl_macros.NIL;
        while (subl_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)subl_macros.$list61);
            current_$7 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)subl_macros.$list61);
            if (subl_macros.NIL == conses_high.member(current_$7, (SubLObject)subl_macros.$list48, (SubLObject)subl_macros.UNPROVIDED, (SubLObject)subl_macros.UNPROVIDED)) {
                bad = (SubLObject)subl_macros.T;
            }
            if (current_$7 == subl_macros.$kw9$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (subl_macros.NIL != bad && subl_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)subl_macros.$list61);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)subl_macros.$kw13$DONE, current);
        final SubLObject done = (SubLObject)((subl_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : subl_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject value = (SubLObject)subl_macros.$sym62$VALUE;
        return (SubLObject)ConsesLow.listS((SubLObject)subl_macros.$sym50$DO_ALIST, (SubLObject)ConsesLow.list(key, value, alist, (SubLObject)subl_macros.$kw13$DONE, done), (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym59$IGNORE, value), ConsesLow.append(body, (SubLObject)subl_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 5779L)
    public static SubLObject cinc_alist(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject key = (SubLObject)subl_macros.NIL;
        SubLObject alist = (SubLObject)subl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list64);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list64);
        alist = current.first();
        current = current.rest();
        final SubLObject test = (SubLObject)(current.isCons() ? current.first() : subl_macros.EQL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)subl_macros.$list64);
        current = current.rest();
        final SubLObject increment = (SubLObject)(current.isCons() ? current.first() : subl_macros.ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)subl_macros.$list64);
        current = current.rest();
        if (subl_macros.NIL == current) {
            final SubLObject entry = (SubLObject)subl_macros.$sym65$ENTRY;
            return (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym21$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(entry, (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym66$ASSOC, key, alist, (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym67$QUOTE, test)))), (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym22$PUNLESS, entry, (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym68$CSETQ, entry, (SubLObject)ConsesLow.listS((SubLObject)subl_macros.$sym69$CONS, key, (SubLObject)subl_macros.$list36)), (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym70$CPUSH, entry, alist)), (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym71$RPLACD, entry, (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym16$_, (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym42$CDR, entry), increment)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)subl_macros.$list64);
        return (SubLObject)subl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 6324L)
    public static SubLObject cdec_alist(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject key = (SubLObject)subl_macros.NIL;
        SubLObject alist = (SubLObject)subl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list73);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list73);
        alist = current.first();
        current = current.rest();
        final SubLObject test = (SubLObject)(current.isCons() ? current.first() : subl_macros.EQL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)subl_macros.$list73);
        current = current.rest();
        final SubLObject decrement = (SubLObject)(current.isCons() ? current.first() : subl_macros.ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)subl_macros.$list73);
        current = current.rest();
        if (subl_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym63$CINC_ALIST, key, alist, test, Numbers.minus(decrement));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)subl_macros.$list73);
        return (SubLObject)subl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 6709L)
    public static SubLObject do_plist(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list75);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject property = (SubLObject)subl_macros.NIL;
        SubLObject value = (SubLObject)subl_macros.NIL;
        SubLObject plist = (SubLObject)subl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list75);
        property = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list75);
        value = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list75);
        plist = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)subl_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)subl_macros.NIL;
        SubLObject current_$8 = (SubLObject)subl_macros.NIL;
        while (subl_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)subl_macros.$list75);
            current_$8 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)subl_macros.$list75);
            if (subl_macros.NIL == conses_high.member(current_$8, (SubLObject)subl_macros.$list48, (SubLObject)subl_macros.UNPROVIDED, (SubLObject)subl_macros.UNPROVIDED)) {
                bad = (SubLObject)subl_macros.T;
            }
            if (current_$8 == subl_macros.$kw9$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (subl_macros.NIL != bad && subl_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)subl_macros.$list75);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)subl_macros.$kw13$DONE, current);
        final SubLObject done = (SubLObject)((subl_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : subl_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject remainder = (SubLObject)subl_macros.$sym76$REMAINDER;
        return (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym2$CDO, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(remainder, plist, (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym77$CDDR, remainder))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym20$COR, done, (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym43$NULL, remainder))), (SubLObject)ConsesLow.listS((SubLObject)subl_macros.$sym21$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(property, (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym44$CAR, remainder)), (SubLObject)ConsesLow.list(value, (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym78$CADR, remainder))), ConsesLow.append(body, (SubLObject)subl_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 7134L)
    public static SubLObject do_plist_properties(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list80);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject property = (SubLObject)subl_macros.NIL;
        SubLObject plist = (SubLObject)subl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list80);
        property = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list80);
        plist = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)subl_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)subl_macros.NIL;
        SubLObject current_$9 = (SubLObject)subl_macros.NIL;
        while (subl_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)subl_macros.$list80);
            current_$9 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)subl_macros.$list80);
            if (subl_macros.NIL == conses_high.member(current_$9, (SubLObject)subl_macros.$list48, (SubLObject)subl_macros.UNPROVIDED, (SubLObject)subl_macros.UNPROVIDED)) {
                bad = (SubLObject)subl_macros.T;
            }
            if (current_$9 == subl_macros.$kw9$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (subl_macros.NIL != bad && subl_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)subl_macros.$list80);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)subl_macros.$kw13$DONE, current);
        final SubLObject done = (SubLObject)((subl_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : subl_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject value = (SubLObject)subl_macros.$sym81$VALUE;
        return (SubLObject)ConsesLow.listS((SubLObject)subl_macros.$sym74$DO_PLIST, (SubLObject)ConsesLow.list(property, value, plist, (SubLObject)subl_macros.$kw13$DONE, done), (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym59$IGNORE, value), ConsesLow.append(body, (SubLObject)subl_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 7335L)
    public static SubLObject do_plist_values(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list83);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject value = (SubLObject)subl_macros.NIL;
        SubLObject plist = (SubLObject)subl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list83);
        value = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list83);
        plist = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)subl_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)subl_macros.NIL;
        SubLObject current_$10 = (SubLObject)subl_macros.NIL;
        while (subl_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)subl_macros.$list83);
            current_$10 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)subl_macros.$list83);
            if (subl_macros.NIL == conses_high.member(current_$10, (SubLObject)subl_macros.$list48, (SubLObject)subl_macros.UNPROVIDED, (SubLObject)subl_macros.UNPROVIDED)) {
                bad = (SubLObject)subl_macros.T;
            }
            if (current_$10 == subl_macros.$kw9$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (subl_macros.NIL != bad && subl_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)subl_macros.$list83);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)subl_macros.$kw13$DONE, current);
        final SubLObject done = (SubLObject)((subl_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : subl_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject property = (SubLObject)subl_macros.$sym84$PROPERTY;
        return (SubLObject)ConsesLow.listS((SubLObject)subl_macros.$sym74$DO_PLIST, (SubLObject)ConsesLow.list(property, value, plist, (SubLObject)subl_macros.$kw13$DONE, done), (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym59$IGNORE, property), ConsesLow.append(body, (SubLObject)subl_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 7535L)
    public static SubLObject smart_csome(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list85);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)subl_macros.NIL;
        SubLObject list = (SubLObject)subl_macros.NIL;
        SubLObject donevar = (SubLObject)subl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list85);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list85);
        list = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list85);
        donevar = current.first();
        current = current.rest();
        if (subl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)subl_macros.$sym28$DO_LIST, (SubLObject)ConsesLow.list(var, list, (SubLObject)subl_macros.$kw13$DONE, donevar), ConsesLow.append(body, (SubLObject)subl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)subl_macros.$list85);
        return (SubLObject)subl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 7683L)
    public static SubLObject cdocons(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list87);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)subl_macros.NIL;
        SubLObject listform = (SubLObject)subl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list87);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list87);
        listform = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)subl_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)subl_macros.NIL;
        SubLObject current_$11 = (SubLObject)subl_macros.NIL;
        while (subl_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)subl_macros.$list87);
            current_$11 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)subl_macros.$list87);
            if (subl_macros.NIL == conses_high.member(current_$11, (SubLObject)subl_macros.$list48, (SubLObject)subl_macros.UNPROVIDED, (SubLObject)subl_macros.UNPROVIDED)) {
                bad = (SubLObject)subl_macros.T;
            }
            if (current_$11 == subl_macros.$kw9$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (subl_macros.NIL != bad && subl_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)subl_macros.$list87);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)subl_macros.$kw13$DONE, current);
        final SubLObject done = (SubLObject)((subl_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : subl_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        if (subl_macros.NIL != done) {
            return (SubLObject)ConsesLow.listS((SubLObject)subl_macros.$sym2$CDO, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var, listform, (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym42$CDR, var))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym20$COR, done, (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym88$ATOM, var))), ConsesLow.append(body, (SubLObject)subl_macros.NIL));
        }
        return (SubLObject)ConsesLow.listS((SubLObject)subl_macros.$sym2$CDO, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var, listform, (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym42$CDR, var))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym88$ATOM, var)), ConsesLow.append(body, (SubLObject)subl_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 8078L)
    public static SubLObject do_pairs(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list90);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var1 = (SubLObject)subl_macros.NIL;
        SubLObject var2 = (SubLObject)subl_macros.NIL;
        SubLObject listform = (SubLObject)subl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list90);
        var1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list90);
        var2 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list90);
        listform = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)subl_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)subl_macros.NIL;
        SubLObject current_$12 = (SubLObject)subl_macros.NIL;
        while (subl_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)subl_macros.$list90);
            current_$12 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)subl_macros.$list90);
            if (subl_macros.NIL == conses_high.member(current_$12, (SubLObject)subl_macros.$list48, (SubLObject)subl_macros.UNPROVIDED, (SubLObject)subl_macros.UNPROVIDED)) {
                bad = (SubLObject)subl_macros.T;
            }
            if (current_$12 == subl_macros.$kw9$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (subl_macros.NIL != bad && subl_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)subl_macros.$list90);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)subl_macros.$kw13$DONE, current);
        final SubLObject done = (SubLObject)((subl_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : subl_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject list = (SubLObject)subl_macros.$sym91$LIST;
        return (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym86$CDOCONS, (SubLObject)ConsesLow.list(list, listform, (SubLObject)subl_macros.$kw13$DONE, done), (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym21$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var1, (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym92$FIRST, list))), (SubLObject)ConsesLow.listS((SubLObject)subl_macros.$sym93$CSOME, (SubLObject)ConsesLow.list(var2, (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym94$REST, list), done), ConsesLow.append(body, (SubLObject)subl_macros.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 8419L)
    public static SubLObject do_list_with_tail(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list96);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject item = (SubLObject)subl_macros.NIL;
        SubLObject tail = (SubLObject)subl_macros.NIL;
        SubLObject listform = (SubLObject)subl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list96);
        item = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list96);
        tail = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list96);
        listform = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)subl_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)subl_macros.NIL;
        SubLObject current_$13 = (SubLObject)subl_macros.NIL;
        while (subl_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)subl_macros.$list96);
            current_$13 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)subl_macros.$list96);
            if (subl_macros.NIL == conses_high.member(current_$13, (SubLObject)subl_macros.$list48, (SubLObject)subl_macros.UNPROVIDED, (SubLObject)subl_macros.UNPROVIDED)) {
                bad = (SubLObject)subl_macros.T;
            }
            if (current_$13 == subl_macros.$kw9$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (subl_macros.NIL != bad && subl_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)subl_macros.$list96);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)subl_macros.$kw13$DONE, current);
        final SubLObject done = (SubLObject)((subl_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : subl_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject cdr_var = (SubLObject)subl_macros.$sym97$CDR_VAR;
        return (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym86$CDOCONS, (SubLObject)ConsesLow.list(cdr_var, listform, (SubLObject)subl_macros.$kw13$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)subl_macros.$sym21$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(item, (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym44$CAR, cdr_var)), (SubLObject)ConsesLow.list(tail, (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym42$CDR, cdr_var))), ConsesLow.append(body, (SubLObject)subl_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 8664L)
    public static SubLObject dolists(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list99);
        final SubLObject temp = current.rest();
        final SubLObject specs;
        current = (specs = current.first());
        final SubLObject body;
        current = (body = temp);
        SubLObject forms = (SubLObject)subl_macros.NIL;
        SubLObject steppers = (SubLObject)subl_macros.NIL;
        SubLObject cdolist_list_var = specs;
        SubLObject spec = (SubLObject)subl_macros.NIL;
        spec = cdolist_list_var.first();
        while (subl_macros.NIL != cdolist_list_var) {
            final SubLObject var = spec.first();
            final SubLObject list = conses_high.cadr(spec);
            final SubLObject listvar = Symbols.make_symbol(PrintLow.format((SubLObject)subl_macros.NIL, (SubLObject)subl_macros.$str100$CURRENT__A, var));
            forms = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(listvar, list, (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym42$CDR, listvar)), forms);
            forms = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var, (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym44$CAR, listvar), (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym44$CAR, listvar)), forms);
            cdolist_list_var = cdolist_list_var.rest();
            spec = cdolist_list_var.first();
        }
        forms = Sequences.nreverse(forms);
        SubLObject current_forms = (SubLObject)subl_macros.NIL;
        SubLObject stepper = (SubLObject)subl_macros.NIL;
        current_forms = forms;
        stepper = conses_high.caar(current_forms);
        while (subl_macros.NIL != current_forms) {
            steppers = (SubLObject)ConsesLow.cons(stepper, steppers);
            current_forms = conses_high.cddr(current_forms);
            stepper = conses_high.caar(current_forms);
        }
        return (SubLObject)ConsesLow.listS((SubLObject)subl_macros.$sym2$CDO, forms, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym4$CNOT, reader.bq_cons((SubLObject)subl_macros.$sym101$CAND, ConsesLow.append(steppers, (SubLObject)subl_macros.NIL)))), ConsesLow.append(body, (SubLObject)subl_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 9265L)
    public static SubLObject do_string(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list103);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject v_char = (SubLObject)subl_macros.NIL;
        SubLObject string = (SubLObject)subl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list103);
        v_char = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list103);
        string = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)subl_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)subl_macros.NIL;
        SubLObject current_$14 = (SubLObject)subl_macros.NIL;
        while (subl_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)subl_macros.$list103);
            current_$14 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)subl_macros.$list103);
            if (subl_macros.NIL == conses_high.member(current_$14, (SubLObject)subl_macros.$list104, (SubLObject)subl_macros.UNPROVIDED, (SubLObject)subl_macros.UNPROVIDED)) {
                bad = (SubLObject)subl_macros.T;
            }
            if (current_$14 == subl_macros.$kw9$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (subl_macros.NIL != bad && subl_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)subl_macros.$list103);
        }
        final SubLObject start_tail = cdestructuring_bind.property_list_member((SubLObject)subl_macros.$kw10$START, current);
        final SubLObject start = (SubLObject)((subl_macros.NIL != start_tail) ? conses_high.cadr(start_tail) : subl_macros.ZERO_INTEGER);
        final SubLObject end_tail = cdestructuring_bind.property_list_member((SubLObject)subl_macros.$kw11$END, current);
        final SubLObject end = (SubLObject)((subl_macros.NIL != end_tail) ? conses_high.cadr(end_tail) : subl_macros.NIL);
        final SubLObject char_num_tail = cdestructuring_bind.property_list_member((SubLObject)subl_macros.$kw105$CHAR_NUM, current);
        final SubLObject char_num = (SubLObject)((subl_macros.NIL != char_num_tail) ? conses_high.cadr(char_num_tail) : subl_macros.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)subl_macros.$kw13$DONE, current);
        final SubLObject done = (SubLObject)((subl_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : subl_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        if (subl_macros.NIL != char_num) {
            return (SubLObject)ConsesLow.listS((SubLObject)subl_macros.$sym106$DO_STRING_INDEX, (SubLObject)ConsesLow.list(new SubLObject[] { char_num, v_char, string, subl_macros.$kw10$START, start, subl_macros.$kw11$END, end, subl_macros.$kw13$DONE, done }), ConsesLow.append(body, (SubLObject)subl_macros.NIL));
        }
        final SubLObject char_num_$15 = (SubLObject)subl_macros.$sym107$CHAR_NUM;
        return (SubLObject)ConsesLow.listS((SubLObject)subl_macros.$sym102$DO_STRING, (SubLObject)ConsesLow.list(new SubLObject[] { v_char, string, subl_macros.$kw105$CHAR_NUM, char_num_$15, subl_macros.$kw10$START, start, subl_macros.$kw11$END, end, subl_macros.$kw13$DONE, done }), (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym59$IGNORE, char_num_$15), ConsesLow.append(body, (SubLObject)subl_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 10034L)
    public static SubLObject do_string_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list108);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject char_num = (SubLObject)subl_macros.NIL;
        SubLObject v_char = (SubLObject)subl_macros.NIL;
        SubLObject string = (SubLObject)subl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list108);
        char_num = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list108);
        v_char = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list108);
        string = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)subl_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)subl_macros.NIL;
        SubLObject current_$16 = (SubLObject)subl_macros.NIL;
        while (subl_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)subl_macros.$list108);
            current_$16 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)subl_macros.$list108);
            if (subl_macros.NIL == conses_high.member(current_$16, (SubLObject)subl_macros.$list109, (SubLObject)subl_macros.UNPROVIDED, (SubLObject)subl_macros.UNPROVIDED)) {
                bad = (SubLObject)subl_macros.T;
            }
            if (current_$16 == subl_macros.$kw9$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (subl_macros.NIL != bad && subl_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)subl_macros.$list108);
        }
        final SubLObject start_tail = cdestructuring_bind.property_list_member((SubLObject)subl_macros.$kw10$START, current);
        final SubLObject start = (SubLObject)((subl_macros.NIL != start_tail) ? conses_high.cadr(start_tail) : subl_macros.ZERO_INTEGER);
        final SubLObject end_tail = cdestructuring_bind.property_list_member((SubLObject)subl_macros.$kw11$END, current);
        final SubLObject end = (SubLObject)((subl_macros.NIL != end_tail) ? conses_high.cadr(end_tail) : subl_macros.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)subl_macros.$kw13$DONE, current);
        final SubLObject done = (SubLObject)((subl_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : subl_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject string_var = (SubLObject)subl_macros.$sym110$STRING_VAR;
        final SubLObject end_var = (SubLObject)subl_macros.$sym111$END_VAR;
        SubLObject end_init_form = (SubLObject)subl_macros.NIL;
        if (end.isInteger()) {
            end_init_form = end;
        }
        else if (subl_macros.NIL == end) {
            end_init_form = (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym37$LENGTH, string_var);
        }
        else {
            end_init_form = (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym112$FIF, end, end, (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym37$LENGTH, string_var));
        }
        return (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym21$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(string_var, string), (SubLObject)ConsesLow.list(end_var, end_init_form)), (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym6$DO_NUMBERS, (SubLObject)ConsesLow.list(char_num, (SubLObject)subl_macros.$kw10$START, start, (SubLObject)subl_macros.$kw11$END, end_var, (SubLObject)subl_macros.$kw13$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)subl_macros.$sym21$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(v_char, (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym113$CHAR, string_var, char_num))), ConsesLow.append(body, (SubLObject)subl_macros.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 10849L)
    public static SubLObject do_vector(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list115);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)subl_macros.NIL;
        SubLObject vector = (SubLObject)subl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list115);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list115);
        vector = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)subl_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)subl_macros.NIL;
        SubLObject current_$17 = (SubLObject)subl_macros.NIL;
        while (subl_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)subl_macros.$list115);
            current_$17 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)subl_macros.$list115);
            if (subl_macros.NIL == conses_high.member(current_$17, (SubLObject)subl_macros.$list116, (SubLObject)subl_macros.UNPROVIDED, (SubLObject)subl_macros.UNPROVIDED)) {
                bad = (SubLObject)subl_macros.T;
            }
            if (current_$17 == subl_macros.$kw9$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (subl_macros.NIL != bad && subl_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)subl_macros.$list115);
        }
        final SubLObject element_num_tail = cdestructuring_bind.property_list_member((SubLObject)subl_macros.$kw117$ELEMENT_NUM, current);
        final SubLObject element_num = (SubLObject)((subl_macros.NIL != element_num_tail) ? conses_high.cadr(element_num_tail) : subl_macros.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)subl_macros.$kw13$DONE, current);
        final SubLObject done = (SubLObject)((subl_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : subl_macros.NIL);
        final SubLObject backwardP_tail = cdestructuring_bind.property_list_member((SubLObject)subl_macros.$kw118$BACKWARD_, current);
        final SubLObject backwardP = (SubLObject)((subl_macros.NIL != backwardP_tail) ? conses_high.cadr(backwardP_tail) : subl_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        if (subl_macros.NIL != element_num) {
            return (SubLObject)ConsesLow.listS((SubLObject)subl_macros.$sym119$DO_VECTOR_INDEX, (SubLObject)ConsesLow.list(element_num, var, vector, (SubLObject)subl_macros.$kw13$DONE, done, (SubLObject)subl_macros.$kw118$BACKWARD_, backwardP), ConsesLow.append(body, (SubLObject)subl_macros.NIL));
        }
        final SubLObject element_num_$18 = (SubLObject)subl_macros.$sym120$ELEMENT_NUM;
        return (SubLObject)ConsesLow.listS((SubLObject)subl_macros.$sym119$DO_VECTOR_INDEX, (SubLObject)ConsesLow.list(element_num_$18, var, vector, (SubLObject)subl_macros.$kw13$DONE, done, (SubLObject)subl_macros.$kw118$BACKWARD_, backwardP), (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym59$IGNORE, element_num_$18), ConsesLow.append(body, (SubLObject)subl_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 11518L)
    public static SubLObject do_vector_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list121);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = (SubLObject)subl_macros.NIL;
        SubLObject value = (SubLObject)subl_macros.NIL;
        SubLObject vector = (SubLObject)subl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list121);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list121);
        value = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list121);
        vector = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)subl_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)subl_macros.NIL;
        SubLObject current_$19 = (SubLObject)subl_macros.NIL;
        while (subl_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)subl_macros.$list121);
            current_$19 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)subl_macros.$list121);
            if (subl_macros.NIL == conses_high.member(current_$19, (SubLObject)subl_macros.$list122, (SubLObject)subl_macros.UNPROVIDED, (SubLObject)subl_macros.UNPROVIDED)) {
                bad = (SubLObject)subl_macros.T;
            }
            if (current_$19 == subl_macros.$kw9$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (subl_macros.NIL != bad && subl_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)subl_macros.$list121);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)subl_macros.$kw13$DONE, current);
        final SubLObject done = (SubLObject)((subl_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : subl_macros.NIL);
        final SubLObject backwardP_tail = cdestructuring_bind.property_list_member((SubLObject)subl_macros.$kw118$BACKWARD_, current);
        final SubLObject backwardP = (SubLObject)((subl_macros.NIL != backwardP_tail) ? conses_high.cadr(backwardP_tail) : subl_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject vector_var = (SubLObject)subl_macros.$sym123$VECTOR_VAR;
        final SubLObject backwardP_var = (SubLObject)subl_macros.$sym124$BACKWARD__VAR;
        final SubLObject length = (SubLObject)subl_macros.$sym125$LENGTH;
        if (subl_macros.NIL != done) {
            final SubLObject start = (SubLObject)subl_macros.$sym126$START;
            final SubLObject end = (SubLObject)subl_macros.$sym127$END;
            final SubLObject delta = (SubLObject)subl_macros.$sym128$DELTA;
            return (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym21$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(vector_var, vector), (SubLObject)ConsesLow.list(backwardP_var, backwardP), (SubLObject)ConsesLow.list(length, (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym37$LENGTH, vector_var))), (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym55$CDESTRUCTURING_BIND, (SubLObject)ConsesLow.list(start, end, delta), (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym112$FIF, backwardP_var, (SubLObject)ConsesLow.listS((SubLObject)subl_macros.$sym129$LIST, (SubLObject)ConsesLow.listS((SubLObject)subl_macros.$sym130$_, length, (SubLObject)subl_macros.$list131), (SubLObject)subl_macros.$list132), (SubLObject)ConsesLow.listS((SubLObject)subl_macros.$sym129$LIST, (SubLObject)subl_macros.ZERO_INTEGER, length, (SubLObject)subl_macros.$list131)), (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym6$DO_NUMBERS, (SubLObject)ConsesLow.list(new SubLObject[] { key, subl_macros.$kw10$START, start, subl_macros.$kw11$END, end, subl_macros.$kw13$DONE, done, subl_macros.$kw12$DELTA, delta }), (SubLObject)ConsesLow.listS((SubLObject)subl_macros.$sym21$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(value, (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym133$AREF, vector_var, key))), ConsesLow.append(body, (SubLObject)subl_macros.NIL)))));
        }
        final SubLObject v_iteration = (SubLObject)subl_macros.$sym134$ITERATION;
        return (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym21$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(vector_var, vector), (SubLObject)ConsesLow.list(backwardP_var, backwardP), (SubLObject)ConsesLow.list(length, (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym37$LENGTH, vector_var))), (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym14$CDOTIMES, (SubLObject)ConsesLow.list(v_iteration, length), (SubLObject)ConsesLow.listS((SubLObject)subl_macros.$sym21$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(key, (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym112$FIF, backwardP_var, (SubLObject)ConsesLow.listS((SubLObject)subl_macros.$sym130$_, length, v_iteration, (SubLObject)subl_macros.$list131), v_iteration)), (SubLObject)ConsesLow.list(value, (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym133$AREF, vector_var, key))), ConsesLow.append(body, (SubLObject)subl_macros.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 12500L)
    public static SubLObject cdovector(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list136);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)subl_macros.NIL;
        SubLObject vector = (SubLObject)subl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list136);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list136);
        vector = current.first();
        current = current.rest();
        if (subl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)subl_macros.$sym114$DO_VECTOR, (SubLObject)ConsesLow.list(var, vector), ConsesLow.append(body, (SubLObject)subl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)subl_macros.$list136);
        return (SubLObject)subl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 12641L)
    public static SubLObject csome_vector(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list138);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)subl_macros.NIL;
        SubLObject vector = (SubLObject)subl_macros.NIL;
        SubLObject donevar = (SubLObject)subl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list138);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list138);
        vector = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list138);
        donevar = current.first();
        current = current.rest();
        if (subl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)subl_macros.$sym114$DO_VECTOR, (SubLObject)ConsesLow.list(var, vector, (SubLObject)subl_macros.$kw13$DONE, donevar), ConsesLow.append(body, (SubLObject)subl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)subl_macros.$list138);
        return (SubLObject)subl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 12807L)
    public static SubLObject smart_csomevector(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list138);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)subl_macros.NIL;
        SubLObject vector = (SubLObject)subl_macros.NIL;
        SubLObject donevar = (SubLObject)subl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list138);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list138);
        vector = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list138);
        donevar = current.first();
        current = current.rest();
        if (subl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)subl_macros.$sym114$DO_VECTOR, (SubLObject)ConsesLow.list(var, vector, (SubLObject)subl_macros.$kw13$DONE, donevar), ConsesLow.append(body, (SubLObject)subl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)subl_macros.$list138);
        return (SubLObject)subl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 12978L)
    public static SubLObject do_sequence(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list141);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)subl_macros.NIL;
        SubLObject sequence = (SubLObject)subl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list141);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list141);
        sequence = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)subl_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)subl_macros.NIL;
        SubLObject current_$20 = (SubLObject)subl_macros.NIL;
        while (subl_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)subl_macros.$list141);
            current_$20 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)subl_macros.$list141);
            if (subl_macros.NIL == conses_high.member(current_$20, (SubLObject)subl_macros.$list142, (SubLObject)subl_macros.UNPROVIDED, (SubLObject)subl_macros.UNPROVIDED)) {
                bad = (SubLObject)subl_macros.T;
            }
            if (current_$20 == subl_macros.$kw9$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (subl_macros.NIL != bad && subl_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)subl_macros.$list141);
        }
        final SubLObject element_num_tail = cdestructuring_bind.property_list_member((SubLObject)subl_macros.$kw117$ELEMENT_NUM, current);
        final SubLObject element_num = (SubLObject)((subl_macros.NIL != element_num_tail) ? conses_high.cadr(element_num_tail) : subl_macros.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)subl_macros.$kw13$DONE, current);
        final SubLObject done = (SubLObject)((subl_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : subl_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        if (subl_macros.NIL != element_num) {
            return (SubLObject)ConsesLow.listS((SubLObject)subl_macros.$sym143$DO_SEQUENCE_INDEX, (SubLObject)ConsesLow.list(element_num, var, sequence, (SubLObject)subl_macros.$kw13$DONE, done), ConsesLow.append(body, (SubLObject)subl_macros.NIL));
        }
        final SubLObject element_num_$21 = (SubLObject)subl_macros.$sym144$ELEMENT_NUM;
        return (SubLObject)ConsesLow.listS((SubLObject)subl_macros.$sym143$DO_SEQUENCE_INDEX, (SubLObject)ConsesLow.list(element_num_$21, var, sequence, (SubLObject)subl_macros.$kw13$DONE, done), (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym59$IGNORE, element_num_$21), ConsesLow.append(body, (SubLObject)subl_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 13552L)
    public static SubLObject do_sequence_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list145);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key_var = (SubLObject)subl_macros.NIL;
        SubLObject value_var = (SubLObject)subl_macros.NIL;
        SubLObject sequence = (SubLObject)subl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list145);
        key_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list145);
        value_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list145);
        sequence = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)subl_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)subl_macros.NIL;
        SubLObject current_$22 = (SubLObject)subl_macros.NIL;
        while (subl_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)subl_macros.$list145);
            current_$22 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)subl_macros.$list145);
            if (subl_macros.NIL == conses_high.member(current_$22, (SubLObject)subl_macros.$list48, (SubLObject)subl_macros.UNPROVIDED, (SubLObject)subl_macros.UNPROVIDED)) {
                bad = (SubLObject)subl_macros.T;
            }
            if (current_$22 == subl_macros.$kw9$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (subl_macros.NIL != bad && subl_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)subl_macros.$list145);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)subl_macros.$kw13$DONE, current);
        final SubLObject done = (SubLObject)((subl_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : subl_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject sequence_var = (SubLObject)subl_macros.$sym146$SEQUENCE_VAR;
        final SubLObject end_index = (SubLObject)subl_macros.$sym147$END_INDEX;
        final SubLObject sequence_doneP = (SubLObject)subl_macros.$sym148$SEQUENCE_DONE_;
        return (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym21$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(sequence_var, sequence), (SubLObject)ConsesLow.list(end_index, (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym149$FUNLESS, (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym150$LISTP, sequence_var), (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym37$LENGTH, sequence_var))), reader.bq_cons(key_var, (SubLObject)subl_macros.$list36), (SubLObject)ConsesLow.list(sequence_doneP, (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym151$DO_SEQUENCE_INDEX_DONE_, key_var, end_index, sequence_var))), (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym3$WHILE, (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym101$CAND, (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym4$CNOT, sequence_doneP), (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym4$CNOT, done)), (SubLObject)ConsesLow.listS((SubLObject)subl_macros.$sym21$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(value_var, (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym152$DO_SEQUENCE_INDEX_VALUE_, key_var, sequence_var))), ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym153$PROGN, (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym68$CSETQ, sequence_var, (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym154$DO_SEQUENCE_INDEX_UPDATE, sequence_var)), (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym40$CINC, key_var), (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym68$CSETQ, sequence_doneP, (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym151$DO_SEQUENCE_INDEX_DONE_, key_var, end_index, sequence_var))))))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 14352L)
    public static SubLObject do_sequence_index_doneP(final SubLObject index, final SubLObject end_index, final SubLObject sequence) {
        if (sequence.isList()) {
            return Types.sublisp_null(sequence);
        }
        return Numbers.numE(index, end_index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 14560L)
    public static SubLObject do_sequence_index_valueP(final SubLObject index, final SubLObject sequence) {
        if (sequence.isList()) {
            return sequence.first();
        }
        if (sequence.isVector()) {
            return Vectors.aref(sequence, index);
        }
        return Strings.sublisp_char(sequence, index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 14830L)
    public static SubLObject do_sequence_index_update(final SubLObject sequence) {
        if (sequence.isList()) {
            return sequence.rest();
        }
        return sequence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 14994L)
    public static SubLObject do_hash_table(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list156);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = (SubLObject)subl_macros.NIL;
        SubLObject value = (SubLObject)subl_macros.NIL;
        SubLObject hash_table = (SubLObject)subl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list156);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list156);
        value = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list156);
        hash_table = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)subl_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)subl_macros.NIL;
        SubLObject current_$23 = (SubLObject)subl_macros.NIL;
        while (subl_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)subl_macros.$list156);
            current_$23 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)subl_macros.$list156);
            if (subl_macros.NIL == conses_high.member(current_$23, (SubLObject)subl_macros.$list30, (SubLObject)subl_macros.UNPROVIDED, (SubLObject)subl_macros.UNPROVIDED)) {
                bad = (SubLObject)subl_macros.T;
            }
            if (current_$23 == subl_macros.$kw9$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (subl_macros.NIL != bad && subl_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)subl_macros.$list156);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)subl_macros.$kw13$DONE, current);
        final SubLObject done = (SubLObject)((subl_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : subl_macros.NIL);
        final SubLObject progress_message_tail = cdestructuring_bind.property_list_member((SubLObject)subl_macros.$kw31$PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (SubLObject)((subl_macros.NIL != progress_message_tail) ? conses_high.cadr(progress_message_tail) : subl_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        if (subl_macros.NIL != progress_message) {
            final SubLObject message_var = (SubLObject)subl_macros.$sym157$MESSAGE_VAR;
            final SubLObject silentP = (SubLObject)subl_macros.$sym158$SILENT_;
            final SubLObject table_var = (SubLObject)subl_macros.$sym159$TABLE_VAR;
            final SubLObject index_var = (SubLObject)subl_macros.$sym160$INDEX_VAR;
            final SubLObject count_var = (SubLObject)subl_macros.$sym161$COUNT_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym21$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(message_var, progress_message), reader.bq_cons(silentP, (SubLObject)subl_macros.$list162), (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym163$_SILENT_PROGRESS__, (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym20$COR, silentP, (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym43$NULL, message_var)))), (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym38$NOTING_PERCENT_PROGRESS, (SubLObject)ConsesLow.listS((SubLObject)subl_macros.$sym164$FIRST_OF, message_var, (SubLObject)subl_macros.$list165), (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym21$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(table_var, hash_table), reader.bq_cons(index_var, (SubLObject)subl_macros.$list36), (SubLObject)ConsesLow.list(count_var, (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym166$HASH_TABLE_COUNT, table_var))), (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym155$DO_HASH_TABLE, (SubLObject)ConsesLow.list(key, value, table_var, (SubLObject)subl_macros.$kw13$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)subl_macros.$sym21$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym163$_SILENT_PROGRESS__, silentP)), ConsesLow.append(body, (SubLObject)subl_macros.NIL)), (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym68$CSETQ, index_var, (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym15$1_, index_var)), (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym39$NOTE_PERCENT_PROGRESS, index_var, count_var)))));
        }
        if (subl_macros.NIL != done) {
            return (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym22$PUNLESS, done, (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym167$CCATCH_IGNORE, (SubLObject)subl_macros.$kw168$DO_HASH_TABLE, (SubLObject)ConsesLow.listS((SubLObject)subl_macros.$sym155$DO_HASH_TABLE, (SubLObject)ConsesLow.list(key, value, hash_table), (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym169$DO_HASH_TABLE_DONE_CHECK, done), ConsesLow.append(body, (SubLObject)subl_macros.NIL))));
        }
        return (SubLObject)ConsesLow.listS((SubLObject)subl_macros.$sym170$CDOHASH, (SubLObject)ConsesLow.list(key, value, hash_table), ConsesLow.append(body, (SubLObject)subl_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 16171L)
    public static SubLObject do_hash_table_done_check(final SubLObject done) {
        if (subl_macros.NIL != done) {
            Dynamic.sublisp_throw((SubLObject)subl_macros.$kw168$DO_HASH_TABLE, (SubLObject)subl_macros.NIL);
        }
        return (SubLObject)subl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 16305L)
    public static SubLObject do_hash_table_keys(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list172);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = (SubLObject)subl_macros.NIL;
        SubLObject hash_table = (SubLObject)subl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list172);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list172);
        hash_table = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)subl_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)subl_macros.NIL;
        SubLObject current_$24 = (SubLObject)subl_macros.NIL;
        while (subl_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)subl_macros.$list172);
            current_$24 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)subl_macros.$list172);
            if (subl_macros.NIL == conses_high.member(current_$24, (SubLObject)subl_macros.$list30, (SubLObject)subl_macros.UNPROVIDED, (SubLObject)subl_macros.UNPROVIDED)) {
                bad = (SubLObject)subl_macros.T;
            }
            if (current_$24 == subl_macros.$kw9$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (subl_macros.NIL != bad && subl_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)subl_macros.$list172);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)subl_macros.$kw13$DONE, current);
        final SubLObject done = (SubLObject)((subl_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : subl_macros.NIL);
        final SubLObject progress_message_tail = cdestructuring_bind.property_list_member((SubLObject)subl_macros.$kw31$PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (SubLObject)((subl_macros.NIL != progress_message_tail) ? conses_high.cadr(progress_message_tail) : subl_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject no_value = (SubLObject)subl_macros.$sym173$NO_VALUE;
        return (SubLObject)ConsesLow.listS((SubLObject)subl_macros.$sym155$DO_HASH_TABLE, (SubLObject)ConsesLow.list(key, no_value, hash_table, (SubLObject)subl_macros.$kw13$DONE, done, (SubLObject)subl_macros.$kw31$PROGRESS_MESSAGE, progress_message), (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym59$IGNORE, no_value), ConsesLow.append(body, (SubLObject)subl_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 16572L)
    public static SubLObject ccatch_ignore(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject tag = (SubLObject)subl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list174);
        tag = current.first();
        final SubLObject body;
        current = (body = current.rest());
        final SubLObject catch_var = (SubLObject)subl_macros.$sym175$CATCH_VAR;
        return (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym21$CLET, (SubLObject)ConsesLow.list(catch_var), (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym59$IGNORE, catch_var), (SubLObject)ConsesLow.listS((SubLObject)subl_macros.$sym176$CCATCH, tag, catch_var, ConsesLow.append(body, (SubLObject)subl_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 16896L)
    public static SubLObject punless_error(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject form = (SubLObject)subl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list178);
        form = current.first();
        final SubLObject body;
        current = (body = current.rest());
        final SubLObject error = (SubLObject)subl_macros.$sym179$ERROR;
        return (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym21$CLET, (SubLObject)ConsesLow.list(error), (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym180$CATCH_ERROR_MESSAGE, (SubLObject)ConsesLow.list(error), form), (SubLObject)ConsesLow.listS((SubLObject)subl_macros.$sym22$PUNLESS, error, ConsesLow.append(body, (SubLObject)subl_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 17187L)
    public static SubLObject pwhen_error(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject form = (SubLObject)subl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list178);
        form = current.first();
        final SubLObject body;
        current = (body = current.rest());
        final SubLObject error = (SubLObject)subl_macros.$sym182$ERROR;
        return (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym21$CLET, (SubLObject)ConsesLow.list(error), (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym180$CATCH_ERROR_MESSAGE, (SubLObject)ConsesLow.list(error), form), (SubLObject)ConsesLow.listS((SubLObject)subl_macros.$sym183$PWHEN, error, ConsesLow.append(body, (SubLObject)subl_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 17419L)
    public static SubLObject warn_on_errors(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        final SubLObject message_var = (SubLObject)subl_macros.$sym185$MESSAGE_VAR;
        return (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym21$CLET, (SubLObject)ConsesLow.list(message_var), (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym186$WITHOUT_APPENDING_STACK_TRACES_TO_ERROR_MESSAGES, (SubLObject)ConsesLow.listS((SubLObject)subl_macros.$sym180$CATCH_ERROR_MESSAGE, (SubLObject)ConsesLow.list(message_var), ConsesLow.append(body, (SubLObject)subl_macros.NIL))), (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym183$PWHEN, (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym187$STRINGP, message_var), (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym188$WARN, (SubLObject)subl_macros.$str189$_A, message_var)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 17841L)
    public static SubLObject possibly_warn_on_errors(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject var = (SubLObject)subl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list191);
        var = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym192$PIF, var, reader.bq_cons((SubLObject)subl_macros.$sym184$WARN_ON_ERRORS, ConsesLow.append(body, (SubLObject)subl_macros.NIL)), reader.bq_cons((SubLObject)subl_macros.$sym153$PROGN, ConsesLow.append(body, (SubLObject)subl_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 18019L)
    public static SubLObject possibly_ignore_errors(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject var = (SubLObject)subl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list191);
        var = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym192$PIF, var, reader.bq_cons((SubLObject)subl_macros.$sym194$IGNORE_ERRORS, ConsesLow.append(body, (SubLObject)subl_macros.NIL)), reader.bq_cons((SubLObject)subl_macros.$sym153$PROGN, ConsesLow.append(body, (SubLObject)subl_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 18166L)
    public static SubLObject warn_or_ignore_errors(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject var = (SubLObject)subl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list191);
        var = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym192$PIF, var, reader.bq_cons((SubLObject)subl_macros.$sym184$WARN_ON_ERRORS, ConsesLow.append(body, (SubLObject)subl_macros.NIL)), reader.bq_cons((SubLObject)subl_macros.$sym194$IGNORE_ERRORS, ConsesLow.append(body, (SubLObject)subl_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 18421L)
    public static SubLObject with_default_error_handling(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)subl_macros.$sym197$WITH_ERROR_HANDLER, (SubLObject)subl_macros.NIL, ConsesLow.append(body, (SubLObject)subl_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 18577L)
    public static SubLObject cunwind_on_failure(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject protected_form = (SubLObject)subl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list199);
        protected_form = current.first();
        final SubLObject body;
        current = (body = current.rest());
        final SubLObject success_var = (SubLObject)subl_macros.$sym200$SUCCESS_VAR;
        return (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym21$CLET, (SubLObject)ConsesLow.list(success_var), (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym201$CUNWIND_PROTECT, (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym153$PROGN, protected_form, (SubLObject)ConsesLow.listS((SubLObject)subl_macros.$sym68$CSETQ, success_var, (SubLObject)subl_macros.$list202)), (SubLObject)ConsesLow.listS((SubLObject)subl_macros.$sym22$PUNLESS, success_var, ConsesLow.append(body, (SubLObject)subl_macros.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 18955L)
    public static SubLObject cunwind_protect_with_fail_clause(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject protected_form = (SubLObject)subl_macros.NIL;
        SubLObject failure_form = (SubLObject)subl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list204);
        protected_form = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list204);
        failure_form = current.first();
        final SubLObject body;
        current = (body = current.rest());
        final SubLObject success_var = (SubLObject)subl_macros.$sym205$SUCCESS_VAR;
        return (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym21$CLET, (SubLObject)ConsesLow.list(success_var), (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym201$CUNWIND_PROTECT, (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym153$PROGN, protected_form, (SubLObject)ConsesLow.listS((SubLObject)subl_macros.$sym68$CSETQ, success_var, (SubLObject)subl_macros.$list202)), (SubLObject)ConsesLow.listS((SubLObject)subl_macros.$sym201$CUNWIND_PROTECT, (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym22$PUNLESS, success_var, failure_form), ConsesLow.append(body, (SubLObject)subl_macros.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 19827L)
    public static SubLObject assert_type(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_object = (SubLObject)subl_macros.NIL;
        SubLObject pred = (SubLObject)subl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list208);
        v_object = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list208);
        pred = current.first();
        current = current.rest();
        if (subl_macros.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)subl_macros.$list208);
            return (SubLObject)subl_macros.NIL;
        }
        if (subl_macros.NIL != subl_macros.$ignore_assert_typesP$.getGlobalValue()) {
            return (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym59$IGNORE, v_object);
        }
        return (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym209$CHECK_TYPE, v_object, pred);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 20030L)
    public static SubLObject assert_type_if_present(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_object = (SubLObject)subl_macros.NIL;
        SubLObject pred = (SubLObject)subl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list208);
        v_object = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list208);
        pred = current.first();
        current = current.rest();
        if (subl_macros.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)subl_macros.$list208);
            return (SubLObject)subl_macros.NIL;
        }
        if (subl_macros.NIL != subl_macros.$ignore_assert_typesP$.getGlobalValue()) {
            return (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym59$IGNORE, v_object);
        }
        return (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym211$CHECK_TYPE_IF_PRESENT, v_object, pred);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 20279L)
    public static SubLObject assert_list_type(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject list = (SubLObject)subl_macros.NIL;
        SubLObject pred = (SubLObject)subl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list213);
        list = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list213);
        pred = current.first();
        current = current.rest();
        if (subl_macros.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)subl_macros.$list213);
            return (SubLObject)subl_macros.NIL;
        }
        if (subl_macros.NIL != subl_macros.$ignore_assert_typesP$.getGlobalValue()) {
            return (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym59$IGNORE, list);
        }
        return (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym214$CHECK_LIST_TYPE, list, pred);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 20554L)
    public static SubLObject assert_plist_type(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject plist = (SubLObject)subl_macros.NIL;
        SubLObject pred = (SubLObject)subl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list216);
        plist = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list216);
        pred = current.first();
        current = current.rest();
        if (subl_macros.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)subl_macros.$list216);
            return (SubLObject)subl_macros.NIL;
        }
        if (subl_macros.NIL != subl_macros.$ignore_assert_typesP$.getGlobalValue()) {
            return (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym59$IGNORE, plist);
        }
        return (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym217$CHECK_PLIST_TYPE, plist, pred);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 20835L)
    public static SubLObject assert_must(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject form = (SubLObject)subl_macros.NIL;
        SubLObject format_string = (SubLObject)subl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list219);
        form = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list219);
        format_string = current.first();
        final SubLObject v_arguments;
        current = (v_arguments = current.rest());
        if (subl_macros.NIL != subl_macros.$ignore_assert_typesP$.getGlobalValue()) {
            return (SubLObject)subl_macros.$list220;
        }
        return (SubLObject)ConsesLow.listS((SubLObject)subl_macros.$sym221$MUST, form, format_string, ConsesLow.append(v_arguments, (SubLObject)subl_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 21012L)
    public static SubLObject pcase_feature(final SubLObject macroform, final SubLObject environment) {
        final SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject cdolist_list_var;
        final SubLObject feature_clauses = cdolist_list_var = current;
        SubLObject feature_clause = (SubLObject)subl_macros.NIL;
        feature_clause = cdolist_list_var.first();
        while (subl_macros.NIL != cdolist_list_var) {
            SubLObject current_$26;
            final SubLObject datum_$25 = current_$26 = feature_clause;
            SubLObject feature_expression = (SubLObject)subl_macros.NIL;
            SubLObject body = (SubLObject)subl_macros.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current_$26, datum_$25, (SubLObject)subl_macros.$list223);
            feature_expression = current_$26.first();
            current_$26 = (body = current_$26.rest());
            if (subl_macros.$sym224$OTHERWISE == feature_expression || subl_macros.NIL != feature_expression_match(feature_expression)) {
                return reader.bq_cons((SubLObject)subl_macros.$sym153$PROGN, ConsesLow.append(body, (SubLObject)subl_macros.NIL));
            }
            cdolist_list_var = cdolist_list_var.rest();
            feature_clause = cdolist_list_var.first();
        }
        return (SubLObject)subl_macros.$list220;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 22127L)
    public static SubLObject pif_feature(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject feature_clause = (SubLObject)subl_macros.NIL;
        SubLObject action = (SubLObject)subl_macros.NIL;
        SubLObject else_action = (SubLObject)subl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list226);
        feature_clause = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list226);
        action = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list226);
        else_action = current.first();
        current = current.rest();
        if (subl_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym222$PCASE_FEATURE, (SubLObject)ConsesLow.list(feature_clause, action), (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym224$OTHERWISE, else_action));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)subl_macros.$list226);
        return (SubLObject)subl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 22491L)
    public static SubLObject pwhen_feature(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject feature_clause = (SubLObject)subl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list229);
        feature_clause = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym222$PCASE_FEATURE, reader.bq_cons(feature_clause, ConsesLow.append(body, (SubLObject)subl_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 22668L)
    public static SubLObject punless_feature(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject feature_clause = (SubLObject)subl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list229);
        feature_clause = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym222$PCASE_FEATURE, (SubLObject)ConsesLow.list(feature_clause), reader.bq_cons((SubLObject)subl_macros.$sym224$OTHERWISE, ConsesLow.append(body, (SubLObject)subl_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 22871L)
    public static SubLObject fcase_feature(final SubLObject macroform, final SubLObject environment) {
        final SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject cdolist_list_var;
        final SubLObject feature_clauses = cdolist_list_var = current;
        SubLObject feature_clause = (SubLObject)subl_macros.NIL;
        feature_clause = cdolist_list_var.first();
        while (subl_macros.NIL != cdolist_list_var) {
            SubLObject current_$28;
            final SubLObject datum_$27 = current_$28 = feature_clause;
            SubLObject feature_expression = (SubLObject)subl_macros.NIL;
            SubLObject form = (SubLObject)subl_macros.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current_$28, datum_$27, (SubLObject)subl_macros.$list232);
            feature_expression = current_$28.first();
            current_$28 = current_$28.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$28, datum_$27, (SubLObject)subl_macros.$list232);
            form = current_$28.first();
            current_$28 = current_$28.rest();
            if (subl_macros.NIL == current_$28) {
                if (subl_macros.$sym224$OTHERWISE == feature_expression || subl_macros.NIL != feature_expression_match(feature_expression)) {
                    return form;
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum_$27, (SubLObject)subl_macros.$list232);
            }
            cdolist_list_var = cdolist_list_var.rest();
            feature_clause = cdolist_list_var.first();
        }
        return (SubLObject)subl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 23615L)
    public static SubLObject fif_feature(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject feature_clause = (SubLObject)subl_macros.NIL;
        SubLObject action = (SubLObject)subl_macros.NIL;
        SubLObject else_action = (SubLObject)subl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list226);
        feature_clause = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list226);
        action = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list226);
        else_action = current.first();
        current = current.rest();
        if (subl_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym231$FCASE_FEATURE, (SubLObject)ConsesLow.list(feature_clause, action), (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym224$OTHERWISE, else_action));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)subl_macros.$list226);
        return (SubLObject)subl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 23967L)
    public static SubLObject fwhen_feature(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject feature_clause = (SubLObject)subl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list229);
        feature_clause = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym231$FCASE_FEATURE, reader.bq_cons(feature_clause, ConsesLow.append(body, (SubLObject)subl_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 24144L)
    public static SubLObject feature_match(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject feature_clause = (SubLObject)subl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list236);
        feature_clause = current.first();
        current = current.rest();
        if (subl_macros.NIL == current) {
            return (SubLObject)ConsesLow.listS((SubLObject)subl_macros.$sym234$FWHEN_FEATURE, feature_clause, (SubLObject)subl_macros.$list202);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)subl_macros.$list236);
        return (SubLObject)subl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 24296L)
    public static SubLObject funless_feature(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject feature_clause = (SubLObject)subl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list229);
        feature_clause = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym231$FCASE_FEATURE, reader.bq_cons(feature_clause, (SubLObject)subl_macros.$list238), reader.bq_cons((SubLObject)subl_macros.$sym224$OTHERWISE, ConsesLow.append(body, (SubLObject)subl_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 24507L)
    public static SubLObject fimplies_feature(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject feature_clause = (SubLObject)subl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list229);
        feature_clause = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)subl_macros.$sym231$FCASE_FEATURE, reader.bq_cons(feature_clause, ConsesLow.append(body, (SubLObject)subl_macros.NIL)), (SubLObject)subl_macros.$list240);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 24715L)
    public static SubLObject atomic_feature_match(final SubLObject atomic_feature) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)((subl_macros.NIL != conses_high.member(atomic_feature, reader.$features$.getDynamicValue(thread), (SubLObject)subl_macros.UNPROVIDED, (SubLObject)subl_macros.UNPROVIDED)) ? subl_macros.T : subl_macros.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 24897L)
    public static SubLObject feature_expression_match(final SubLObject feature_expression) {
        if (feature_expression.isAtom()) {
            if (feature_expression.isSymbol()) {
                return atomic_feature_match(feature_expression);
            }
        }
        else {
            SubLObject operator = (SubLObject)subl_macros.NIL;
            SubLObject subexpressions = (SubLObject)subl_macros.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(feature_expression, feature_expression, (SubLObject)subl_macros.$list243);
            operator = feature_expression.first();
            final SubLObject current = subexpressions = feature_expression.rest();
            final SubLObject pcase_var = operator;
            if (pcase_var.eql((SubLObject)subl_macros.$kw244$NOT) || pcase_var.eql((SubLObject)subl_macros.$sym245$NOT) || pcase_var.eql((SubLObject)subl_macros.$sym4$CNOT)) {
                return (SubLObject)SubLObjectFactory.makeBoolean(subl_macros.NIL == feature_expression_match(subexpressions.first()));
            }
            if (pcase_var.eql((SubLObject)subl_macros.$kw246$OR) || pcase_var.eql((SubLObject)subl_macros.$sym247$OR) || pcase_var.eql((SubLObject)subl_macros.$sym20$COR)) {
                SubLObject some_sub_match_succeeds = (SubLObject)subl_macros.NIL;
                if (subl_macros.NIL == some_sub_match_succeeds) {
                    SubLObject csome_list_var;
                    SubLObject subexpression;
                    for (csome_list_var = subexpressions, subexpression = (SubLObject)subl_macros.NIL, subexpression = csome_list_var.first(); subl_macros.NIL == some_sub_match_succeeds && subl_macros.NIL != csome_list_var; some_sub_match_succeeds = feature_expression_match(subexpression), csome_list_var = csome_list_var.rest(), subexpression = csome_list_var.first()) {}
                }
                return some_sub_match_succeeds;
            }
            if (pcase_var.eql((SubLObject)subl_macros.$kw248$AND) || pcase_var.eql((SubLObject)subl_macros.$sym249$AND) || pcase_var.eql((SubLObject)subl_macros.$sym101$CAND)) {
                SubLObject some_sub_match_fails = (SubLObject)subl_macros.NIL;
                if (subl_macros.NIL == some_sub_match_fails) {
                    SubLObject csome_list_var;
                    SubLObject subexpression;
                    for (csome_list_var = subexpressions, subexpression = (SubLObject)subl_macros.NIL, subexpression = csome_list_var.first(); subl_macros.NIL == some_sub_match_fails && subl_macros.NIL != csome_list_var; some_sub_match_fails = (SubLObject)SubLObjectFactory.makeBoolean(subl_macros.NIL == feature_expression_match(subexpression)), csome_list_var = csome_list_var.rest(), subexpression = csome_list_var.first()) {}
                }
                return (SubLObject)SubLObjectFactory.makeBoolean(subl_macros.NIL == some_sub_match_fails);
            }
        }
        Errors.error((SubLObject)subl_macros.$str250$_S_is_not_a_well_formed_feature_e, feature_expression);
        return (SubLObject)subl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 26122L)
    public static SubLObject funcall_if(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject func = (SubLObject)subl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list252);
        func = current.first();
        final SubLObject args;
        current = (args = current.rest());
        if (subl_macros.NIL == func) {
            return (SubLObject)subl_macros.$list253;
        }
        return (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym254$FWHEN, func, (SubLObject)ConsesLow.listS((SubLObject)subl_macros.$sym255$FUNCALL, func, ConsesLow.append(args, (SubLObject)subl_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 26347L)
    public static SubLObject cpush_if(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject item = (SubLObject)subl_macros.NIL;
        SubLObject place = (SubLObject)subl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list257);
        item = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list257);
        place = current.first();
        current = current.rest();
        if (subl_macros.NIL == current) {
            final SubLObject var = (SubLObject)subl_macros.$sym258$VAR;
            return (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym21$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var, item)), (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym183$PWHEN, var, (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym70$CPUSH, var, place)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)subl_macros.$list257);
        return (SubLObject)subl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 26493L)
    public static SubLObject cpushnew_if(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject item = (SubLObject)subl_macros.NIL;
        SubLObject place = (SubLObject)subl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list260);
        item = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list260);
        place = current.first();
        current = current.rest();
        final SubLObject test = (SubLObject)(current.isCons() ? current.first() : subl_macros.$list261);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)subl_macros.$list260);
        current = current.rest();
        final SubLObject key = (SubLObject)(current.isCons() ? current.first() : subl_macros.$list262);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)subl_macros.$list260);
        current = current.rest();
        if (subl_macros.NIL == current) {
            final SubLObject var = (SubLObject)subl_macros.$sym263$VAR;
            return (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym21$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var, item)), (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym183$PWHEN, var, (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym264$CPUSHNEW, var, place, test, key)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)subl_macros.$list260);
        return (SubLObject)subl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 26698L)
    public static SubLObject cpush_all(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject items = (SubLObject)subl_macros.NIL;
        SubLObject place = (SubLObject)subl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list266);
        items = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list266);
        place = current.first();
        current = current.rest();
        if (subl_macros.NIL == current) {
            final SubLObject item = (SubLObject)subl_macros.$sym267$ITEM;
            final SubLObject items_var = (SubLObject)subl_macros.$sym268$ITEMS_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym21$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(items_var, items)), (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym192$PIF, (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym269$VECTORP, items_var), (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym114$DO_VECTOR, (SubLObject)ConsesLow.list(item, items_var), (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym70$CPUSH, item, place)), (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym45$CDOLIST, (SubLObject)ConsesLow.list(item, items_var), (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym70$CPUSH, item, place))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)subl_macros.$list266);
        return (SubLObject)subl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 26964L)
    public static SubLObject cpushnew_all(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject items = (SubLObject)subl_macros.NIL;
        SubLObject place = (SubLObject)subl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list271);
        items = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list271);
        place = current.first();
        current = current.rest();
        final SubLObject test = (SubLObject)(current.isCons() ? current.first() : subl_macros.$list261);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)subl_macros.$list271);
        current = current.rest();
        final SubLObject key = (SubLObject)(current.isCons() ? current.first() : subl_macros.$list262);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)subl_macros.$list271);
        current = current.rest();
        if (subl_macros.NIL == current) {
            final SubLObject item = (SubLObject)subl_macros.$sym272$ITEM;
            final SubLObject items_var = (SubLObject)subl_macros.$sym273$ITEMS_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym21$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(items_var, items)), (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym192$PIF, (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym269$VECTORP, items_var), (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym114$DO_VECTOR, (SubLObject)ConsesLow.list(item, items_var), (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym264$CPUSHNEW, item, place, test, key)), (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym45$CDOLIST, (SubLObject)ConsesLow.list(item, items_var), (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym264$CPUSHNEW, item, place, test, key))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)subl_macros.$list271);
        return (SubLObject)subl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 27325L)
    public static SubLObject csetf_delete(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject item = (SubLObject)subl_macros.NIL;
        SubLObject place = (SubLObject)subl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list275);
        item = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list275);
        place = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)subl_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)subl_macros.NIL;
        SubLObject current_$29 = (SubLObject)subl_macros.NIL;
        while (subl_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)subl_macros.$list275);
            current_$29 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)subl_macros.$list275);
            if (subl_macros.NIL == conses_high.member(current_$29, (SubLObject)subl_macros.$list276, (SubLObject)subl_macros.UNPROVIDED, (SubLObject)subl_macros.UNPROVIDED)) {
                bad = (SubLObject)subl_macros.T;
            }
            if (current_$29 == subl_macros.$kw9$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (subl_macros.NIL != bad && subl_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)subl_macros.$list275);
        }
        final SubLObject test_tail = cdestructuring_bind.property_list_member((SubLObject)subl_macros.$kw277$TEST, current);
        final SubLObject test = (SubLObject)((subl_macros.NIL != test_tail) ? conses_high.cadr(test_tail) : subl_macros.$list261);
        final SubLObject key_tail = cdestructuring_bind.property_list_member((SubLObject)subl_macros.$kw278$KEY, current);
        final SubLObject key = (SubLObject)((subl_macros.NIL != key_tail) ? conses_high.cadr(key_tail) : subl_macros.$list262);
        if (!key.equal((SubLObject)subl_macros.$list262)) {
            return (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym279$CSETF, place, (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym280$DELETE, item, place, test, key));
        }
        if (test.equal((SubLObject)subl_macros.$list261)) {
            return (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym279$CSETF, place, (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym280$DELETE, item, place));
        }
        return (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym279$CSETF, place, (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym280$DELETE, item, place, test));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 27640L)
    public static SubLObject cpush_end(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject item = (SubLObject)subl_macros.NIL;
        SubLObject place = (SubLObject)subl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list257);
        item = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list257);
        place = current.first();
        current = current.rest();
        if (subl_macros.NIL == current) {
            final SubLObject new_cons = (SubLObject)subl_macros.$sym282$NEW_CONS;
            final SubLObject list = (SubLObject)subl_macros.$sym283$LIST;
            return (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym21$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new_cons, (SubLObject)ConsesLow.listS((SubLObject)subl_macros.$sym69$CONS, item, (SubLObject)subl_macros.$list238)), (SubLObject)ConsesLow.list(list, place)), (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym192$PIF, list, (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym284$RPLACD_LAST, list, new_cons), (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym279$CSETF, place, new_cons)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)subl_macros.$list257);
        return (SubLObject)subl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 28000L)
    public static SubLObject cpushnew_end(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject item = (SubLObject)subl_macros.NIL;
        SubLObject place = (SubLObject)subl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list275);
        item = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list275);
        place = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)subl_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)subl_macros.NIL;
        SubLObject current_$30 = (SubLObject)subl_macros.NIL;
        while (subl_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)subl_macros.$list275);
            current_$30 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)subl_macros.$list275);
            if (subl_macros.NIL == conses_high.member(current_$30, (SubLObject)subl_macros.$list276, (SubLObject)subl_macros.UNPROVIDED, (SubLObject)subl_macros.UNPROVIDED)) {
                bad = (SubLObject)subl_macros.T;
            }
            if (current_$30 == subl_macros.$kw9$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (subl_macros.NIL != bad && subl_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)subl_macros.$list275);
        }
        final SubLObject test_tail = cdestructuring_bind.property_list_member((SubLObject)subl_macros.$kw277$TEST, current);
        final SubLObject test = (SubLObject)((subl_macros.NIL != test_tail) ? conses_high.cadr(test_tail) : subl_macros.$list261);
        final SubLObject key_tail = cdestructuring_bind.property_list_member((SubLObject)subl_macros.$kw278$KEY, current);
        final SubLObject key = (SubLObject)((subl_macros.NIL != key_tail) ? conses_high.cadr(key_tail) : subl_macros.$list262);
        final SubLObject item_var = (SubLObject)subl_macros.$sym286$ITEM_VAR;
        return (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym21$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(item_var, item)), (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym22$PUNLESS, (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym287$MEMBER, item_var, place, test, key), (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym281$CPUSH_END, item_var, place)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 28443L)
    public static SubLObject rplacd_last(final SubLObject non_empty_list, final SubLObject new_last_cdr) {
        return ConsesLow.rplacd(conses_high.last(non_empty_list, (SubLObject)subl_macros.UNPROVIDED), new_last_cdr);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 28651L)
    public static SubLObject without_appending_stack_traces_to_error_messages(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        final SubLObject was_appendingP = (SubLObject)subl_macros.$sym288$WAS_APPENDING_;
        return (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym225$PIF_FEATURE, (SubLObject)subl_macros.$kw289$SL2JAVA, (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym21$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(was_appendingP, (SubLObject)subl_macros.$list290)), (SubLObject)subl_macros.$list291, (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym201$CUNWIND_PROTECT, reader.bq_cons((SubLObject)subl_macros.$sym153$PROGN, ConsesLow.append(body, (SubLObject)subl_macros.NIL)), (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym292$EVAL, (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym129$LIST, (SubLObject)subl_macros.$list293, (SubLObject)subl_macros.$list294, was_appendingP)))), reader.bq_cons((SubLObject)subl_macros.$sym153$PROGN, ConsesLow.append(body, (SubLObject)subl_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 29170L)
    public static SubLObject silently(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)subl_macros.$sym21$CLET, (SubLObject)subl_macros.$list296, ConsesLow.append(body, (SubLObject)subl_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 29643L)
    public static SubLObject fimplies(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject lhs = (SubLObject)subl_macros.NIL;
        SubLObject rhs = (SubLObject)subl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list298);
        lhs = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list298);
        rhs = current.first();
        current = current.rest();
        if (subl_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym20$COR, (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym4$CNOT, lhs), rhs);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)subl_macros.$list298);
        return (SubLObject)subl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 29764L)
    public static SubLObject fxor(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject a = (SubLObject)subl_macros.NIL;
        SubLObject b = (SubLObject)subl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list300);
        a = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list300);
        b = current.first();
        current = current.rest();
        if (subl_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym4$CNOT, (SubLObject)ConsesLow.list((SubLObject)subl_macros.EQ, (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym4$CNOT, a), (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym4$CNOT, b)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)subl_macros.$list300);
        return (SubLObject)subl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 29953L)
    public static SubLObject fequiv(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject a = (SubLObject)subl_macros.NIL;
        SubLObject b = (SubLObject)subl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list300);
        a = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list300);
        b = current.first();
        current = current.rest();
        if (subl_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)subl_macros.EQ, (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym4$CNOT, a), (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym4$CNOT, b));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)subl_macros.$list300);
        return (SubLObject)subl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 30146L)
    public static SubLObject possibly_with_static_area(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject varP = (SubLObject)subl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subl_macros.$list302);
        varP = current.first();
        final SubLObject body;
        current = (body = current.rest());
        if (subl_macros.NIL != Sequences.find((SubLObject)subl_macros.$kw289$SL2JAVA, reader.$features$.getDynamicValue(thread), (SubLObject)subl_macros.UNPROVIDED, (SubLObject)subl_macros.UNPROVIDED, (SubLObject)subl_macros.UNPROVIDED, (SubLObject)subl_macros.UNPROVIDED)) {
            return reader.bq_cons((SubLObject)subl_macros.$sym153$PROGN, ConsesLow.append(body, (SubLObject)subl_macros.NIL));
        }
        return (SubLObject)ConsesLow.list((SubLObject)subl_macros.$sym192$PIF, varP, reader.bq_cons((SubLObject)subl_macros.$sym303$WITH_STATIC_AREA, ConsesLow.append(body, (SubLObject)subl_macros.NIL)), reader.bq_cons((SubLObject)subl_macros.$sym153$PROGN, ConsesLow.append(body, (SubLObject)subl_macros.NIL)));
    }
    
    public static SubLObject declare_subl_macros_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macros", "until", "UNTIL");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macros", "sublisp_while", "WHILE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macros", "repeat_forever", "REPEAT-FOREVER");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macros", "do_numbers", "DO-NUMBERS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macros", "do_numbers_endtest_macro", "DO-NUMBERS-ENDTEST-MACRO");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subl_macros", "do_numbers_endtest", "DO-NUMBERS-ENDTEST", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macros", "do_list", "DO-LIST");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macros", "do_list_index", "DO-LIST-INDEX");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macros", "do_alist", "DO-ALIST");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macros", "do_alist_values", "DO-ALIST-VALUES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macros", "do_alist_keys", "DO-ALIST-KEYS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macros", "cinc_alist", "CINC-ALIST");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macros", "cdec_alist", "CDEC-ALIST");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macros", "do_plist", "DO-PLIST");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macros", "do_plist_properties", "DO-PLIST-PROPERTIES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macros", "do_plist_values", "DO-PLIST-VALUES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macros", "smart_csome", "SMART-CSOME");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macros", "cdocons", "CDOCONS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macros", "do_pairs", "DO-PAIRS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macros", "do_list_with_tail", "DO-LIST-WITH-TAIL");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macros", "dolists", "DOLISTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macros", "do_string", "DO-STRING");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macros", "do_string_index", "DO-STRING-INDEX");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macros", "do_vector", "DO-VECTOR");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macros", "do_vector_index", "DO-VECTOR-INDEX");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macros", "cdovector", "CDOVECTOR");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macros", "csome_vector", "CSOME-VECTOR");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macros", "smart_csomevector", "SMART-CSOMEVECTOR");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macros", "do_sequence", "DO-SEQUENCE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macros", "do_sequence_index", "DO-SEQUENCE-INDEX");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subl_macros", "do_sequence_index_doneP", "DO-SEQUENCE-INDEX-DONE?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subl_macros", "do_sequence_index_valueP", "DO-SEQUENCE-INDEX-VALUE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subl_macros", "do_sequence_index_update", "DO-SEQUENCE-INDEX-UPDATE", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macros", "do_hash_table", "DO-HASH-TABLE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subl_macros", "do_hash_table_done_check", "DO-HASH-TABLE-DONE-CHECK", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macros", "do_hash_table_keys", "DO-HASH-TABLE-KEYS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macros", "ccatch_ignore", "CCATCH-IGNORE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macros", "punless_error", "PUNLESS-ERROR");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macros", "pwhen_error", "PWHEN-ERROR");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macros", "warn_on_errors", "WARN-ON-ERRORS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macros", "possibly_warn_on_errors", "POSSIBLY-WARN-ON-ERRORS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macros", "possibly_ignore_errors", "POSSIBLY-IGNORE-ERRORS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macros", "warn_or_ignore_errors", "WARN-OR-IGNORE-ERRORS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macros", "with_default_error_handling", "WITH-DEFAULT-ERROR-HANDLING");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macros", "cunwind_on_failure", "CUNWIND-ON-FAILURE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macros", "cunwind_protect_with_fail_clause", "CUNWIND-PROTECT-WITH-FAIL-CLAUSE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macros", "assert_type", "ASSERT-TYPE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macros", "assert_type_if_present", "ASSERT-TYPE-IF-PRESENT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macros", "assert_list_type", "ASSERT-LIST-TYPE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macros", "assert_plist_type", "ASSERT-PLIST-TYPE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macros", "assert_must", "ASSERT-MUST");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macros", "pcase_feature", "PCASE-FEATURE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macros", "pif_feature", "PIF-FEATURE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macros", "pwhen_feature", "PWHEN-FEATURE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macros", "punless_feature", "PUNLESS-FEATURE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macros", "fcase_feature", "FCASE-FEATURE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macros", "fif_feature", "FIF-FEATURE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macros", "fwhen_feature", "FWHEN-FEATURE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macros", "feature_match", "FEATURE-MATCH");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macros", "funless_feature", "FUNLESS-FEATURE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macros", "fimplies_feature", "FIMPLIES-FEATURE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subl_macros", "atomic_feature_match", "ATOMIC-FEATURE-MATCH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subl_macros", "feature_expression_match", "FEATURE-EXPRESSION-MATCH", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macros", "funcall_if", "FUNCALL-IF");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macros", "cpush_if", "CPUSH-IF");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macros", "cpushnew_if", "CPUSHNEW-IF");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macros", "cpush_all", "CPUSH-ALL");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macros", "cpushnew_all", "CPUSHNEW-ALL");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macros", "csetf_delete", "CSETF-DELETE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macros", "cpush_end", "CPUSH-END");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macros", "cpushnew_end", "CPUSHNEW-END");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subl_macros", "rplacd_last", "RPLACD-LAST", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macros", "without_appending_stack_traces_to_error_messages", "WITHOUT-APPENDING-STACK-TRACES-TO-ERROR-MESSAGES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macros", "silently", "SILENTLY");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macros", "fimplies", "FIMPLIES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macros", "fxor", "FXOR");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macros", "fequiv", "FEQUIV");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subl_macros", "possibly_with_static_area", "POSSIBLY-WITH-STATIC-AREA");
        return (SubLObject)subl_macros.NIL;
    }
    
    public static SubLObject init_subl_macros_file() {
        subl_macros.$ignore_assert_typesP$ = SubLFiles.deflexical("*IGNORE-ASSERT-TYPES?*", (SubLObject)subl_macros.T);
        return (SubLObject)subl_macros.NIL;
    }
    
    public static SubLObject setup_subl_macros_file() {
        access_macros.register_external_symbol((SubLObject)subl_macros.$sym0$UNTIL);
        access_macros.register_external_symbol((SubLObject)subl_macros.$sym3$WHILE);
        access_macros.register_external_symbol((SubLObject)subl_macros.$sym5$REPEAT_FOREVER);
        access_macros.register_external_symbol((SubLObject)subl_macros.$sym6$DO_NUMBERS);
        access_macros.register_macro_helper((SubLObject)subl_macros.$sym19$DO_NUMBERS_ENDTEST_MACRO, (SubLObject)subl_macros.$sym6$DO_NUMBERS);
        access_macros.register_macro_helper((SubLObject)subl_macros.$sym27$DO_NUMBERS_ENDTEST, (SubLObject)subl_macros.$sym6$DO_NUMBERS);
        access_macros.register_external_symbol((SubLObject)subl_macros.$sym28$DO_LIST);
        access_macros.register_external_symbol((SubLObject)subl_macros.$sym46$DO_LIST_INDEX);
        access_macros.register_external_symbol((SubLObject)subl_macros.$sym50$DO_ALIST);
        access_macros.register_external_symbol((SubLObject)subl_macros.$sym56$DO_ALIST_VALUES);
        access_macros.register_external_symbol((SubLObject)subl_macros.$sym60$DO_ALIST_KEYS);
        access_macros.register_external_symbol((SubLObject)subl_macros.$sym63$CINC_ALIST);
        access_macros.register_external_symbol((SubLObject)subl_macros.$sym72$CDEC_ALIST);
        access_macros.register_external_symbol((SubLObject)subl_macros.$sym74$DO_PLIST);
        access_macros.register_external_symbol((SubLObject)subl_macros.$sym79$DO_PLIST_PROPERTIES);
        access_macros.register_external_symbol((SubLObject)subl_macros.$sym82$DO_PLIST_VALUES);
        access_macros.register_external_symbol((SubLObject)subl_macros.$sym86$CDOCONS);
        access_macros.register_external_symbol((SubLObject)subl_macros.$sym89$DO_PAIRS);
        access_macros.register_external_symbol((SubLObject)subl_macros.$sym95$DO_LIST_WITH_TAIL);
        access_macros.register_external_symbol((SubLObject)subl_macros.$sym98$DOLISTS);
        access_macros.register_external_symbol((SubLObject)subl_macros.$sym102$DO_STRING);
        access_macros.register_external_symbol((SubLObject)subl_macros.$sym106$DO_STRING_INDEX);
        access_macros.register_external_symbol((SubLObject)subl_macros.$sym114$DO_VECTOR);
        access_macros.register_external_symbol((SubLObject)subl_macros.$sym119$DO_VECTOR_INDEX);
        access_macros.register_external_symbol((SubLObject)subl_macros.$sym135$CDOVECTOR);
        access_macros.register_external_symbol((SubLObject)subl_macros.$sym137$CSOME_VECTOR);
        access_macros.register_external_symbol((SubLObject)subl_macros.$sym139$SMART_CSOMEVECTOR);
        access_macros.register_external_symbol((SubLObject)subl_macros.$sym140$DO_SEQUENCE);
        access_macros.register_external_symbol((SubLObject)subl_macros.$sym143$DO_SEQUENCE_INDEX);
        access_macros.register_macro_helper((SubLObject)subl_macros.$sym151$DO_SEQUENCE_INDEX_DONE_, (SubLObject)subl_macros.$sym143$DO_SEQUENCE_INDEX);
        access_macros.register_macro_helper((SubLObject)subl_macros.$sym152$DO_SEQUENCE_INDEX_VALUE_, (SubLObject)subl_macros.$sym143$DO_SEQUENCE_INDEX);
        access_macros.register_macro_helper((SubLObject)subl_macros.$sym154$DO_SEQUENCE_INDEX_UPDATE, (SubLObject)subl_macros.$sym143$DO_SEQUENCE_INDEX);
        access_macros.register_external_symbol((SubLObject)subl_macros.$sym155$DO_HASH_TABLE);
        access_macros.register_macro_helper((SubLObject)subl_macros.$sym169$DO_HASH_TABLE_DONE_CHECK, (SubLObject)subl_macros.$sym155$DO_HASH_TABLE);
        access_macros.register_external_symbol((SubLObject)subl_macros.$sym171$DO_HASH_TABLE_KEYS);
        access_macros.register_external_symbol((SubLObject)subl_macros.$sym167$CCATCH_IGNORE);
        access_macros.register_external_symbol((SubLObject)subl_macros.$sym177$PUNLESS_ERROR);
        access_macros.register_external_symbol((SubLObject)subl_macros.$sym181$PWHEN_ERROR);
        access_macros.register_external_symbol((SubLObject)subl_macros.$sym184$WARN_ON_ERRORS);
        access_macros.register_external_symbol((SubLObject)subl_macros.$sym190$POSSIBLY_WARN_ON_ERRORS);
        access_macros.register_external_symbol((SubLObject)subl_macros.$sym193$POSSIBLY_IGNORE_ERRORS);
        access_macros.register_external_symbol((SubLObject)subl_macros.$sym195$WARN_OR_IGNORE_ERRORS);
        access_macros.register_external_symbol((SubLObject)subl_macros.$sym196$WITH_DEFAULT_ERROR_HANDLING);
        access_macros.register_external_symbol((SubLObject)subl_macros.$sym198$CUNWIND_ON_FAILURE);
        access_macros.register_external_symbol((SubLObject)subl_macros.$sym203$CUNWIND_PROTECT_WITH_FAIL_CLAUSE);
        access_macros.register_external_symbol((SubLObject)subl_macros.$sym206$_IGNORE_ASSERT_TYPES__);
        access_macros.register_external_symbol((SubLObject)subl_macros.$sym207$ASSERT_TYPE);
        access_macros.register_external_symbol((SubLObject)subl_macros.$sym210$ASSERT_TYPE_IF_PRESENT);
        access_macros.register_external_symbol((SubLObject)subl_macros.$sym212$ASSERT_LIST_TYPE);
        access_macros.register_external_symbol((SubLObject)subl_macros.$sym215$ASSERT_PLIST_TYPE);
        access_macros.register_external_symbol((SubLObject)subl_macros.$sym218$ASSERT_MUST);
        access_macros.register_external_symbol((SubLObject)subl_macros.$sym222$PCASE_FEATURE);
        access_macros.register_external_symbol((SubLObject)subl_macros.$sym225$PIF_FEATURE);
        meta_macros.declare_indention_pattern((SubLObject)subl_macros.$sym225$PIF_FEATURE, (SubLObject)subl_macros.$list227);
        access_macros.register_external_symbol((SubLObject)subl_macros.$sym228$PWHEN_FEATURE);
        access_macros.register_external_symbol((SubLObject)subl_macros.$sym230$PUNLESS_FEATURE);
        access_macros.register_external_symbol((SubLObject)subl_macros.$sym231$FCASE_FEATURE);
        access_macros.register_external_symbol((SubLObject)subl_macros.$sym233$FIF_FEATURE);
        meta_macros.declare_indention_pattern((SubLObject)subl_macros.$sym233$FIF_FEATURE, (SubLObject)subl_macros.$list227);
        access_macros.register_external_symbol((SubLObject)subl_macros.$sym234$FWHEN_FEATURE);
        access_macros.register_external_symbol((SubLObject)subl_macros.$sym235$FEATURE_MATCH);
        access_macros.register_external_symbol((SubLObject)subl_macros.$sym237$FUNLESS_FEATURE);
        access_macros.register_external_symbol((SubLObject)subl_macros.$sym239$FIMPLIES_FEATURE);
        access_macros.register_external_symbol((SubLObject)subl_macros.$sym241$ATOMIC_FEATURE_MATCH);
        access_macros.register_external_symbol((SubLObject)subl_macros.$sym242$FEATURE_EXPRESSION_MATCH);
        access_macros.register_external_symbol((SubLObject)subl_macros.$sym251$FUNCALL_IF);
        access_macros.register_external_symbol((SubLObject)subl_macros.$sym256$CPUSH_IF);
        access_macros.register_external_symbol((SubLObject)subl_macros.$sym259$CPUSHNEW_IF);
        access_macros.register_external_symbol((SubLObject)subl_macros.$sym265$CPUSH_ALL);
        access_macros.register_external_symbol((SubLObject)subl_macros.$sym270$CPUSHNEW_ALL);
        access_macros.register_external_symbol((SubLObject)subl_macros.$sym274$CSETF_DELETE);
        access_macros.register_external_symbol((SubLObject)subl_macros.$sym281$CPUSH_END);
        access_macros.register_external_symbol((SubLObject)subl_macros.$sym285$CPUSHNEW_END);
        access_macros.register_external_symbol((SubLObject)subl_macros.$sym295$SILENTLY);
        access_macros.register_external_symbol((SubLObject)subl_macros.$sym297$FIMPLIES);
        access_macros.register_external_symbol((SubLObject)subl_macros.$sym299$FXOR);
        access_macros.register_external_symbol((SubLObject)subl_macros.$sym301$FEQUIV);
        return (SubLObject)subl_macros.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_subl_macros_file();
    }
    
    @Override
	public void initializeVariables() {
        init_subl_macros_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_subl_macros_file();
    }
    
    static {
        me = (SubLFile)new subl_macros();
        subl_macros.$ignore_assert_typesP$ = null;
        $sym0$UNTIL = SubLObjectFactory.makeSymbol("UNTIL");
        $list1 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym2$CDO = SubLObjectFactory.makeSymbol("CDO");
        $sym3$WHILE = SubLObjectFactory.makeSymbol("WHILE");
        $sym4$CNOT = SubLObjectFactory.makeSymbol("CNOT");
        $sym5$REPEAT_FOREVER = SubLObjectFactory.makeSymbol("REPEAT-FOREVER");
        $sym6$DO_NUMBERS = SubLObjectFactory.makeSymbol("DO-NUMBERS");
        $list7 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUMBER-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("START"), (SubLObject)subl_macros.ZERO_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("END"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DELTA"), (SubLObject)subl_macros.ONE_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("START"), (SubLObject)SubLObjectFactory.makeKeyword("END"), (SubLObject)SubLObjectFactory.makeKeyword("DELTA"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw9$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw10$START = SubLObjectFactory.makeKeyword("START");
        $kw11$END = SubLObjectFactory.makeKeyword("END");
        $kw12$DELTA = SubLObjectFactory.makeKeyword("DELTA");
        $kw13$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym14$CDOTIMES = SubLObjectFactory.makeSymbol("CDOTIMES");
        $sym15$1_ = SubLObjectFactory.makeSymbol("1+");
        $sym16$_ = SubLObjectFactory.makeSymbol("+");
        $sym17$DELTA_VAR = SubLObjectFactory.makeUninternedSymbol("DELTA-VAR");
        $sym18$END_VAR = SubLObjectFactory.makeUninternedSymbol("END-VAR");
        $sym19$DO_NUMBERS_ENDTEST_MACRO = SubLObjectFactory.makeSymbol("DO-NUMBERS-ENDTEST-MACRO");
        $sym20$COR = SubLObjectFactory.makeSymbol("COR");
        $sym21$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym22$PUNLESS = SubLObjectFactory.makeSymbol("PUNLESS");
        $list23 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUMBER-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("DELTA-FORM"), (SubLObject)SubLObjectFactory.makeSymbol("END-VAR"));
        $sym24$__ = SubLObjectFactory.makeSymbol(">=");
        $sym25$__ = SubLObjectFactory.makeSymbol("<=");
        $sym26$_ = SubLObjectFactory.makeSymbol("=");
        $sym27$DO_NUMBERS_ENDTEST = SubLObjectFactory.makeSymbol("DO-NUMBERS-ENDTEST");
        $sym28$DO_LIST = SubLObjectFactory.makeSymbol("DO-LIST");
        $list29 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE"), (SubLObject)SubLObjectFactory.makeSymbol("PROGRESS-MESSAGE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list30 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"), (SubLObject)SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE"));
        $kw31$PROGRESS_MESSAGE = SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE");
        $sym32$MESSAGE_VAR = SubLObjectFactory.makeUninternedSymbol("MESSAGE-VAR");
        $sym33$LIST_VAR = SubLObjectFactory.makeUninternedSymbol("LIST-VAR");
        $sym34$SOFAR = SubLObjectFactory.makeUninternedSymbol("SOFAR");
        $sym35$TOTAL = SubLObjectFactory.makeUninternedSymbol("TOTAL");
        $list36 = ConsesLow.list((SubLObject)subl_macros.ZERO_INTEGER);
        $sym37$LENGTH = SubLObjectFactory.makeSymbol("LENGTH");
        $sym38$NOTING_PERCENT_PROGRESS = SubLObjectFactory.makeSymbol("NOTING-PERCENT-PROGRESS");
        $sym39$NOTE_PERCENT_PROGRESS = SubLObjectFactory.makeSymbol("NOTE-PERCENT-PROGRESS");
        $sym40$CINC = SubLObjectFactory.makeSymbol("CINC");
        $sym41$REST = SubLObjectFactory.makeUninternedSymbol("REST");
        $sym42$CDR = SubLObjectFactory.makeSymbol("CDR");
        $sym43$NULL = SubLObjectFactory.makeSymbol("NULL");
        $sym44$CAR = SubLObjectFactory.makeSymbol("CAR");
        $sym45$CDOLIST = SubLObjectFactory.makeSymbol("CDOLIST");
        $sym46$DO_LIST_INDEX = SubLObjectFactory.makeSymbol("DO-LIST-INDEX");
        $list47 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list48 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $sym49$LIST_VAR = SubLObjectFactory.makeUninternedSymbol("LIST-VAR");
        $sym50$DO_ALIST = SubLObjectFactory.makeSymbol("DO-ALIST");
        $list51 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ALIST"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list52 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INDEX"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw53$INDEX = SubLObjectFactory.makeKeyword("INDEX");
        $sym54$CONS = SubLObjectFactory.makeUninternedSymbol("CONS");
        $sym55$CDESTRUCTURING_BIND = SubLObjectFactory.makeSymbol("CDESTRUCTURING-BIND");
        $sym56$DO_ALIST_VALUES = SubLObjectFactory.makeSymbol("DO-ALIST-VALUES");
        $list57 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ALIST"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym58$KEY = SubLObjectFactory.makeUninternedSymbol("KEY");
        $sym59$IGNORE = SubLObjectFactory.makeSymbol("IGNORE");
        $sym60$DO_ALIST_KEYS = SubLObjectFactory.makeSymbol("DO-ALIST-KEYS");
        $list61 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("ALIST"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym62$VALUE = SubLObjectFactory.makeUninternedSymbol("VALUE");
        $sym63$CINC_ALIST = SubLObjectFactory.makeSymbol("CINC-ALIST");
        $list64 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("ALIST"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)subl_macros.EQL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INCREMENT"), (SubLObject)subl_macros.ONE_INTEGER));
        $sym65$ENTRY = SubLObjectFactory.makeUninternedSymbol("ENTRY");
        $sym66$ASSOC = SubLObjectFactory.makeSymbol("ASSOC");
        $sym67$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $sym68$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $sym69$CONS = SubLObjectFactory.makeSymbol("CONS");
        $sym70$CPUSH = SubLObjectFactory.makeSymbol("CPUSH");
        $sym71$RPLACD = SubLObjectFactory.makeSymbol("RPLACD");
        $sym72$CDEC_ALIST = SubLObjectFactory.makeSymbol("CDEC-ALIST");
        $list73 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("ALIST"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)subl_macros.EQL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DECREMENT"), (SubLObject)subl_macros.ONE_INTEGER));
        $sym74$DO_PLIST = SubLObjectFactory.makeSymbol("DO-PLIST");
        $list75 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROPERTY"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("PLIST"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym76$REMAINDER = SubLObjectFactory.makeUninternedSymbol("REMAINDER");
        $sym77$CDDR = SubLObjectFactory.makeSymbol("CDDR");
        $sym78$CADR = SubLObjectFactory.makeSymbol("CADR");
        $sym79$DO_PLIST_PROPERTIES = SubLObjectFactory.makeSymbol("DO-PLIST-PROPERTIES");
        $list80 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROPERTY"), (SubLObject)SubLObjectFactory.makeSymbol("PLIST"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym81$VALUE = SubLObjectFactory.makeUninternedSymbol("VALUE");
        $sym82$DO_PLIST_VALUES = SubLObjectFactory.makeSymbol("DO-PLIST-VALUES");
        $list83 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("PLIST"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym84$PROPERTY = SubLObjectFactory.makeUninternedSymbol("PROPERTY");
        $list85 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("DONEVAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym86$CDOCONS = SubLObjectFactory.makeSymbol("CDOCONS");
        $list87 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("LISTFORM"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym88$ATOM = SubLObjectFactory.makeSymbol("ATOM");
        $sym89$DO_PAIRS = SubLObjectFactory.makeSymbol("DO-PAIRS");
        $list90 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR1"), (SubLObject)SubLObjectFactory.makeSymbol("VAR2"), (SubLObject)SubLObjectFactory.makeSymbol("LISTFORM"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym91$LIST = SubLObjectFactory.makeUninternedSymbol("LIST");
        $sym92$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $sym93$CSOME = SubLObjectFactory.makeSymbol("CSOME");
        $sym94$REST = SubLObjectFactory.makeSymbol("REST");
        $sym95$DO_LIST_WITH_TAIL = SubLObjectFactory.makeSymbol("DO-LIST-WITH-TAIL");
        $list96 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ITEM"), (SubLObject)SubLObjectFactory.makeSymbol("TAIL"), (SubLObject)SubLObjectFactory.makeSymbol("LISTFORM"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym97$CDR_VAR = SubLObjectFactory.makeUninternedSymbol("CDR-VAR");
        $sym98$DOLISTS = SubLObjectFactory.makeSymbol("DOLISTS");
        $list99 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("SPECS")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $str100$CURRENT__A = SubLObjectFactory.makeString("CURRENT-~A");
        $sym101$CAND = SubLObjectFactory.makeSymbol("CAND");
        $sym102$DO_STRING = SubLObjectFactory.makeSymbol("DO-STRING");
        $list103 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHAR"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("START"), (SubLObject)subl_macros.ZERO_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("END"), (SubLObject)SubLObjectFactory.makeSymbol("CHAR-NUM"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list104 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("START"), (SubLObject)SubLObjectFactory.makeKeyword("END"), (SubLObject)SubLObjectFactory.makeKeyword("CHAR-NUM"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw105$CHAR_NUM = SubLObjectFactory.makeKeyword("CHAR-NUM");
        $sym106$DO_STRING_INDEX = SubLObjectFactory.makeSymbol("DO-STRING-INDEX");
        $sym107$CHAR_NUM = SubLObjectFactory.makeUninternedSymbol("CHAR-NUM");
        $list108 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHAR-NUM"), (SubLObject)SubLObjectFactory.makeSymbol("CHAR"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("START"), (SubLObject)subl_macros.ZERO_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("END"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list109 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("START"), (SubLObject)SubLObjectFactory.makeKeyword("END"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $sym110$STRING_VAR = SubLObjectFactory.makeUninternedSymbol("STRING-VAR");
        $sym111$END_VAR = SubLObjectFactory.makeUninternedSymbol("END-VAR");
        $sym112$FIF = SubLObjectFactory.makeSymbol("FIF");
        $sym113$CHAR = SubLObjectFactory.makeSymbol("CHAR");
        $sym114$DO_VECTOR = SubLObjectFactory.makeSymbol("DO-VECTOR");
        $list115 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("VECTOR"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT-NUM"), (SubLObject)SubLObjectFactory.makeSymbol("DONE"), (SubLObject)SubLObjectFactory.makeSymbol("BACKWARD?")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list116 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ELEMENT-NUM"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"), (SubLObject)SubLObjectFactory.makeKeyword("BACKWARD?"));
        $kw117$ELEMENT_NUM = SubLObjectFactory.makeKeyword("ELEMENT-NUM");
        $kw118$BACKWARD_ = SubLObjectFactory.makeKeyword("BACKWARD?");
        $sym119$DO_VECTOR_INDEX = SubLObjectFactory.makeSymbol("DO-VECTOR-INDEX");
        $sym120$ELEMENT_NUM = SubLObjectFactory.makeUninternedSymbol("ELEMENT-NUM");
        $list121 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("VECTOR"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE"), (SubLObject)SubLObjectFactory.makeSymbol("BACKWARD?")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list122 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"), (SubLObject)SubLObjectFactory.makeKeyword("BACKWARD?"));
        $sym123$VECTOR_VAR = SubLObjectFactory.makeUninternedSymbol("VECTOR-VAR");
        $sym124$BACKWARD__VAR = SubLObjectFactory.makeUninternedSymbol("BACKWARD?-VAR");
        $sym125$LENGTH = SubLObjectFactory.makeUninternedSymbol("LENGTH");
        $sym126$START = SubLObjectFactory.makeUninternedSymbol("START");
        $sym127$END = SubLObjectFactory.makeUninternedSymbol("END");
        $sym128$DELTA = SubLObjectFactory.makeUninternedSymbol("DELTA");
        $sym129$LIST = SubLObjectFactory.makeSymbol("LIST");
        $sym130$_ = SubLObjectFactory.makeSymbol("-");
        $list131 = ConsesLow.list((SubLObject)subl_macros.ONE_INTEGER);
        $list132 = ConsesLow.list((SubLObject)subl_macros.MINUS_ONE_INTEGER, (SubLObject)subl_macros.MINUS_ONE_INTEGER);
        $sym133$AREF = SubLObjectFactory.makeSymbol("AREF");
        $sym134$ITERATION = SubLObjectFactory.makeUninternedSymbol("ITERATION");
        $sym135$CDOVECTOR = SubLObjectFactory.makeSymbol("CDOVECTOR");
        $list136 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("VECTOR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym137$CSOME_VECTOR = SubLObjectFactory.makeSymbol("CSOME-VECTOR");
        $list138 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("VECTOR"), (SubLObject)SubLObjectFactory.makeSymbol("DONEVAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym139$SMART_CSOMEVECTOR = SubLObjectFactory.makeSymbol("SMART-CSOMEVECTOR");
        $sym140$DO_SEQUENCE = SubLObjectFactory.makeSymbol("DO-SEQUENCE");
        $list141 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("SEQUENCE"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT-NUM"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list142 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ELEMENT-NUM"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $sym143$DO_SEQUENCE_INDEX = SubLObjectFactory.makeSymbol("DO-SEQUENCE-INDEX");
        $sym144$ELEMENT_NUM = SubLObjectFactory.makeUninternedSymbol("ELEMENT-NUM");
        $list145 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("SEQUENCE"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym146$SEQUENCE_VAR = SubLObjectFactory.makeUninternedSymbol("SEQUENCE-VAR");
        $sym147$END_INDEX = SubLObjectFactory.makeUninternedSymbol("END-INDEX");
        $sym148$SEQUENCE_DONE_ = SubLObjectFactory.makeUninternedSymbol("SEQUENCE-DONE?");
        $sym149$FUNLESS = SubLObjectFactory.makeSymbol("FUNLESS");
        $sym150$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym151$DO_SEQUENCE_INDEX_DONE_ = SubLObjectFactory.makeSymbol("DO-SEQUENCE-INDEX-DONE?");
        $sym152$DO_SEQUENCE_INDEX_VALUE_ = SubLObjectFactory.makeSymbol("DO-SEQUENCE-INDEX-VALUE?");
        $sym153$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym154$DO_SEQUENCE_INDEX_UPDATE = SubLObjectFactory.makeSymbol("DO-SEQUENCE-INDEX-UPDATE");
        $sym155$DO_HASH_TABLE = SubLObjectFactory.makeSymbol("DO-HASH-TABLE");
        $list156 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("HASH-TABLE"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE"), (SubLObject)SubLObjectFactory.makeSymbol("PROGRESS-MESSAGE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym157$MESSAGE_VAR = SubLObjectFactory.makeUninternedSymbol("MESSAGE-VAR");
        $sym158$SILENT_ = SubLObjectFactory.makeUninternedSymbol("SILENT?");
        $sym159$TABLE_VAR = SubLObjectFactory.makeUninternedSymbol("TABLE-VAR");
        $sym160$INDEX_VAR = SubLObjectFactory.makeUninternedSymbol("INDEX-VAR");
        $sym161$COUNT_VAR = SubLObjectFactory.makeUninternedSymbol("COUNT-VAR");
        $list162 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SILENT-PROGRESS?*"));
        $sym163$_SILENT_PROGRESS__ = SubLObjectFactory.makeSymbol("*SILENT-PROGRESS?*");
        $sym164$FIRST_OF = SubLObjectFactory.makeSymbol("FIRST-OF");
        $list165 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString(""));
        $sym166$HASH_TABLE_COUNT = SubLObjectFactory.makeSymbol("HASH-TABLE-COUNT");
        $sym167$CCATCH_IGNORE = SubLObjectFactory.makeSymbol("CCATCH-IGNORE");
        $kw168$DO_HASH_TABLE = SubLObjectFactory.makeKeyword("DO-HASH-TABLE");
        $sym169$DO_HASH_TABLE_DONE_CHECK = SubLObjectFactory.makeSymbol("DO-HASH-TABLE-DONE-CHECK");
        $sym170$CDOHASH = SubLObjectFactory.makeSymbol("CDOHASH");
        $sym171$DO_HASH_TABLE_KEYS = SubLObjectFactory.makeSymbol("DO-HASH-TABLE-KEYS");
        $list172 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("HASH-TABLE"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE"), (SubLObject)SubLObjectFactory.makeSymbol("PROGRESS-MESSAGE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym173$NO_VALUE = SubLObjectFactory.makeUninternedSymbol("NO-VALUE");
        $list174 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TAG"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym175$CATCH_VAR = SubLObjectFactory.makeUninternedSymbol("CATCH-VAR");
        $sym176$CCATCH = SubLObjectFactory.makeSymbol("CCATCH");
        $sym177$PUNLESS_ERROR = SubLObjectFactory.makeSymbol("PUNLESS-ERROR");
        $list178 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORM"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym179$ERROR = SubLObjectFactory.makeUninternedSymbol("ERROR");
        $sym180$CATCH_ERROR_MESSAGE = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE");
        $sym181$PWHEN_ERROR = SubLObjectFactory.makeSymbol("PWHEN-ERROR");
        $sym182$ERROR = SubLObjectFactory.makeUninternedSymbol("ERROR");
        $sym183$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym184$WARN_ON_ERRORS = SubLObjectFactory.makeSymbol("WARN-ON-ERRORS");
        $sym185$MESSAGE_VAR = SubLObjectFactory.makeUninternedSymbol("MESSAGE-VAR");
        $sym186$WITHOUT_APPENDING_STACK_TRACES_TO_ERROR_MESSAGES = SubLObjectFactory.makeSymbol("WITHOUT-APPENDING-STACK-TRACES-TO-ERROR-MESSAGES");
        $sym187$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym188$WARN = SubLObjectFactory.makeSymbol("WARN");
        $str189$_A = SubLObjectFactory.makeString("~A");
        $sym190$POSSIBLY_WARN_ON_ERRORS = SubLObjectFactory.makeSymbol("POSSIBLY-WARN-ON-ERRORS");
        $list191 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym192$PIF = SubLObjectFactory.makeSymbol("PIF");
        $sym193$POSSIBLY_IGNORE_ERRORS = SubLObjectFactory.makeSymbol("POSSIBLY-IGNORE-ERRORS");
        $sym194$IGNORE_ERRORS = SubLObjectFactory.makeSymbol("IGNORE-ERRORS");
        $sym195$WARN_OR_IGNORE_ERRORS = SubLObjectFactory.makeSymbol("WARN-OR-IGNORE-ERRORS");
        $sym196$WITH_DEFAULT_ERROR_HANDLING = SubLObjectFactory.makeSymbol("WITH-DEFAULT-ERROR-HANDLING");
        $sym197$WITH_ERROR_HANDLER = SubLObjectFactory.makeSymbol("WITH-ERROR-HANDLER");
        $sym198$CUNWIND_ON_FAILURE = SubLObjectFactory.makeSymbol("CUNWIND-ON-FAILURE");
        $list199 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROTECTED-FORM"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym200$SUCCESS_VAR = SubLObjectFactory.makeUninternedSymbol("SUCCESS-VAR");
        $sym201$CUNWIND_PROTECT = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
        $list202 = ConsesLow.list((SubLObject)subl_macros.T);
        $sym203$CUNWIND_PROTECT_WITH_FAIL_CLAUSE = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT-WITH-FAIL-CLAUSE");
        $list204 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROTECTED-FORM"), (SubLObject)SubLObjectFactory.makeSymbol("FAILURE-FORM"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym205$SUCCESS_VAR = SubLObjectFactory.makeUninternedSymbol("SUCCESS-VAR");
        $sym206$_IGNORE_ASSERT_TYPES__ = SubLObjectFactory.makeSymbol("*IGNORE-ASSERT-TYPES?*");
        $sym207$ASSERT_TYPE = SubLObjectFactory.makeSymbol("ASSERT-TYPE");
        $list208 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"));
        $sym209$CHECK_TYPE = SubLObjectFactory.makeSymbol("CHECK-TYPE");
        $sym210$ASSERT_TYPE_IF_PRESENT = SubLObjectFactory.makeSymbol("ASSERT-TYPE-IF-PRESENT");
        $sym211$CHECK_TYPE_IF_PRESENT = SubLObjectFactory.makeSymbol("CHECK-TYPE-IF-PRESENT");
        $sym212$ASSERT_LIST_TYPE = SubLObjectFactory.makeSymbol("ASSERT-LIST-TYPE");
        $list213 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"));
        $sym214$CHECK_LIST_TYPE = SubLObjectFactory.makeSymbol("CHECK-LIST-TYPE");
        $sym215$ASSERT_PLIST_TYPE = SubLObjectFactory.makeSymbol("ASSERT-PLIST-TYPE");
        $list216 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PLIST"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"));
        $sym217$CHECK_PLIST_TYPE = SubLObjectFactory.makeSymbol("CHECK-PLIST-TYPE");
        $sym218$ASSERT_MUST = SubLObjectFactory.makeSymbol("ASSERT-MUST");
        $list219 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORM"), (SubLObject)SubLObjectFactory.makeSymbol("FORMAT-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("ARGUMENTS"));
        $list220 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"));
        $sym221$MUST = SubLObjectFactory.makeSymbol("MUST");
        $sym222$PCASE_FEATURE = SubLObjectFactory.makeSymbol("PCASE-FEATURE");
        $list223 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("FEATURE-EXPRESSION"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym224$OTHERWISE = SubLObjectFactory.makeSymbol("OTHERWISE");
        $sym225$PIF_FEATURE = SubLObjectFactory.makeSymbol("PIF-FEATURE");
        $list226 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FEATURE-CLAUSE"), (SubLObject)SubLObjectFactory.makeSymbol("ACTION"), (SubLObject)SubLObjectFactory.makeSymbol("ELSE-ACTION"));
        $list227 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FEATURE-CLAUSE"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("FEATURE-CLAUSES"));
        $sym228$PWHEN_FEATURE = SubLObjectFactory.makeSymbol("PWHEN-FEATURE");
        $list229 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FEATURE-CLAUSE"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym230$PUNLESS_FEATURE = SubLObjectFactory.makeSymbol("PUNLESS-FEATURE");
        $sym231$FCASE_FEATURE = SubLObjectFactory.makeSymbol("FCASE-FEATURE");
        $list232 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FEATURE-EXPRESSION"), (SubLObject)SubLObjectFactory.makeSymbol("FORM"));
        $sym233$FIF_FEATURE = SubLObjectFactory.makeSymbol("FIF-FEATURE");
        $sym234$FWHEN_FEATURE = SubLObjectFactory.makeSymbol("FWHEN-FEATURE");
        $sym235$FEATURE_MATCH = SubLObjectFactory.makeSymbol("FEATURE-MATCH");
        $list236 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FEATURE-CLAUSE"));
        $sym237$FUNLESS_FEATURE = SubLObjectFactory.makeSymbol("FUNLESS-FEATURE");
        $list238 = ConsesLow.list((SubLObject)subl_macros.NIL);
        $sym239$FIMPLIES_FEATURE = SubLObjectFactory.makeSymbol("FIMPLIES-FEATURE");
        $list240 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OTHERWISE"), (SubLObject)subl_macros.T));
        $sym241$ATOMIC_FEATURE_MATCH = SubLObjectFactory.makeSymbol("ATOMIC-FEATURE-MATCH");
        $sym242$FEATURE_EXPRESSION_MATCH = SubLObjectFactory.makeSymbol("FEATURE-EXPRESSION-MATCH");
        $list243 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("SUBEXPRESSIONS"));
        $kw244$NOT = SubLObjectFactory.makeKeyword("NOT");
        $sym245$NOT = SubLObjectFactory.makeSymbol("NOT");
        $kw246$OR = SubLObjectFactory.makeKeyword("OR");
        $sym247$OR = SubLObjectFactory.makeSymbol("OR");
        $kw248$AND = SubLObjectFactory.makeKeyword("AND");
        $sym249$AND = SubLObjectFactory.makeSymbol("AND");
        $str250$_S_is_not_a_well_formed_feature_e = SubLObjectFactory.makeString("~S is not a well-formed feature expression");
        $sym251$FUNCALL_IF = SubLObjectFactory.makeSymbol("FUNCALL-IF");
        $list252 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS"));
        $list253 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FALSE"));
        $sym254$FWHEN = SubLObjectFactory.makeSymbol("FWHEN");
        $sym255$FUNCALL = SubLObjectFactory.makeSymbol("FUNCALL");
        $sym256$CPUSH_IF = SubLObjectFactory.makeSymbol("CPUSH-IF");
        $list257 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ITEM"), (SubLObject)SubLObjectFactory.makeSymbol("PLACE"));
        $sym258$VAR = SubLObjectFactory.makeUninternedSymbol("VAR");
        $sym259$CPUSHNEW_IF = SubLObjectFactory.makeSymbol("CPUSHNEW-IF");
        $list260 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ITEM"), (SubLObject)SubLObjectFactory.makeSymbol("PLACE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)subl_macros.EQL))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)subl_macros.IDENTITY))));
        $list261 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)subl_macros.EQL);
        $list262 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)subl_macros.IDENTITY);
        $sym263$VAR = SubLObjectFactory.makeUninternedSymbol("VAR");
        $sym264$CPUSHNEW = SubLObjectFactory.makeSymbol("CPUSHNEW");
        $sym265$CPUSH_ALL = SubLObjectFactory.makeSymbol("CPUSH-ALL");
        $list266 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ITEMS"), (SubLObject)SubLObjectFactory.makeSymbol("PLACE"));
        $sym267$ITEM = SubLObjectFactory.makeUninternedSymbol("ITEM");
        $sym268$ITEMS_VAR = SubLObjectFactory.makeUninternedSymbol("ITEMS-VAR");
        $sym269$VECTORP = SubLObjectFactory.makeSymbol("VECTORP");
        $sym270$CPUSHNEW_ALL = SubLObjectFactory.makeSymbol("CPUSHNEW-ALL");
        $list271 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ITEMS"), (SubLObject)SubLObjectFactory.makeSymbol("PLACE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)subl_macros.EQL))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)subl_macros.IDENTITY))));
        $sym272$ITEM = SubLObjectFactory.makeUninternedSymbol("ITEM");
        $sym273$ITEMS_VAR = SubLObjectFactory.makeUninternedSymbol("ITEMS-VAR");
        $sym274$CSETF_DELETE = SubLObjectFactory.makeSymbol("CSETF-DELETE");
        $list275 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ITEM"), (SubLObject)SubLObjectFactory.makeSymbol("PLACE"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)subl_macros.EQL))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)subl_macros.IDENTITY))));
        $list276 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeKeyword("KEY"));
        $kw277$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw278$KEY = SubLObjectFactory.makeKeyword("KEY");
        $sym279$CSETF = SubLObjectFactory.makeSymbol("CSETF");
        $sym280$DELETE = SubLObjectFactory.makeSymbol("DELETE");
        $sym281$CPUSH_END = SubLObjectFactory.makeSymbol("CPUSH-END");
        $sym282$NEW_CONS = SubLObjectFactory.makeUninternedSymbol("NEW-CONS");
        $sym283$LIST = SubLObjectFactory.makeUninternedSymbol("LIST");
        $sym284$RPLACD_LAST = SubLObjectFactory.makeSymbol("RPLACD-LAST");
        $sym285$CPUSHNEW_END = SubLObjectFactory.makeSymbol("CPUSHNEW-END");
        $sym286$ITEM_VAR = SubLObjectFactory.makeUninternedSymbol("ITEM-VAR");
        $sym287$MEMBER = SubLObjectFactory.makeSymbol("MEMBER");
        $sym288$WAS_APPENDING_ = SubLObjectFactory.makeUninternedSymbol("WAS-APPENDING?");
        $kw289$SL2JAVA = SubLObjectFactory.makeKeyword("SL2JAVA");
        $list290 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EVAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*"))));
        $list291 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EVAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*"), (SubLObject)subl_macros.NIL)));
        $sym292$EVAL = SubLObjectFactory.makeSymbol("EVAL");
        $list293 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CSETQ"));
        $list294 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*"));
        $sym295$SILENTLY = SubLObjectFactory.makeSymbol("SILENTLY");
        $list296 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*IGNORE-WARNS?*"), (SubLObject)subl_macros.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*IGNORE-BREAKS?*"), (SubLObject)subl_macros.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SILENT-PROGRESS?*"), (SubLObject)subl_macros.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CONTINUE-CERROR?*"), (SubLObject)subl_macros.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*STANDARD-OUTPUT*"), (SubLObject)SubLObjectFactory.makeSymbol("*NULL-OUTPUT*")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*ERROR-OUTPUT*"), (SubLObject)SubLObjectFactory.makeSymbol("*NULL-OUTPUT*")));
        $sym297$FIMPLIES = SubLObjectFactory.makeSymbol("FIMPLIES");
        $list298 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LHS"), (SubLObject)SubLObjectFactory.makeSymbol("RHS"));
        $sym299$FXOR = SubLObjectFactory.makeSymbol("FXOR");
        $list300 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("A"), (SubLObject)SubLObjectFactory.makeSymbol("B"));
        $sym301$FEQUIV = SubLObjectFactory.makeSymbol("FEQUIV");
        $list302 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR?"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym303$WITH_STATIC_AREA = SubLObjectFactory.makeSymbol("WITH-STATIC-AREA");
    }
}

/*

	Total time: 734 ms
	
*/