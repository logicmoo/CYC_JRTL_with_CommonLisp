package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class list_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.list_utilities";
    public static final String myFingerPrint = "7d779735412ae15f0d153538a0d9a668880d698995faf001e67c53613d2dd562";
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 625L)
    public static SubLSymbol $magic_hashing_cutoff$;
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 24517L)
    public static SubLSymbol $negated_test_func$;
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 26481L)
    private static SubLSymbol $position_if_binary_lambda_func$;
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 26542L)
    private static SubLSymbol $position_if_binary_lambda_arg2$;
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 79376L)
    private static SubLSymbol $num_list_cached_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 101485L)
    public static SubLSymbol $listified_vector_marker$;
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 117609L)
    private static SubLSymbol $remove_duplicates_eq_table$;
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 117768L)
    private static SubLSymbol $remove_duplicates_eql_table$;
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 117847L)
    private static SubLSymbol $remove_duplicates_equal_table$;
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 117930L)
    private static SubLSymbol $remove_duplicates_equalp_table$;
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 118015L)
    private static SubLSymbol $remove_duplicates_eq_table_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 118117L)
    private static SubLSymbol $remove_duplicates_eql_table_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 118220L)
    private static SubLSymbol $remove_duplicates_equal_table_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 118327L)
    private static SubLSymbol $remove_duplicates_equalp_table_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 156220L)
    private static SubLSymbol $plistlist_sort_indicator$;
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 164282L)
    public static SubLSymbol $subseq_subst_recursive_answers$;
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 174255L)
    private static SubLSymbol $sort_via_position_guide$;
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 174415L)
    private static SubLSymbol $sort_via_position_test$;
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 175686L)
    private static SubLSymbol $sort_via_test_function$;
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 257821L)
    private static SubLSymbol $preferred_term_set$;
    private static final SubLInteger $int0$80;
    private static final SubLString $str1$nth_cycling__width_must_be_greate;
    private static final SubLString $str2$nth_cycling__width_must_be_less_t;
    private static final SubLString $str3$nth_cycling__width_overruns_offse;
    private static final SubLList $list4;
    private static final SubLSymbol $sym5$PROGN;
    private static final SubLSymbol $sym6$CSETQ;
    private static final SubLSymbol $sym7$FIRST;
    private static final SubLSymbol $sym8$CPOP;
    private static final SubLList $list9;
    private static final SubLSymbol $sym10$CLET;
    private static final SubLList $list11;
    private static final SubLSymbol $sym12$CSETF;
    private static final SubLSymbol $sym13$CONS;
    private static final SubLSymbol $sym14$FIRST_N;
    private static final SubLSymbol $sym15$_;
    private static final SubLList $list16;
    private static final SubLList $list17;
    private static final SubLList $list18;
    private static final SubLSymbol $sym19$CDR;
    private static final SubLSymbol $sym20$CAR;
    private static final SubLSymbol $sym21$NULL;
    private static final SubLSymbol $sym22$CDO;
    private static final SubLSymbol $sym23$CAND;
    private static final SubLList $list24;
    private static final SubLList $list25;
    private static final SubLSymbol $sym26$CDOLIST_MULTIPLE;
    private static final SubLSymbol $sym27$CINC;
    private static final SubLList $list28;
    private static final SubLString $str29$Malformed_csome_multiple_____S_wa;
    private static final SubLSymbol $sym30$PUNLESS;
    private static final SubLSymbol $sym31$COR;
    private static final SubLList $list32;
    private static final SubLSymbol $sym33$LIST_VAR;
    private static final SubLSymbol $sym34$_;
    private static final SubLList $list35;
    private static final SubLSymbol $sym36$CDOLIST;
    private static final SubLSymbol $sym37$REVERSE;
    private static final SubLSymbol $sym38$LIST_VAR;
    private static final SubLSymbol $sym39$1_;
    private static final SubLSymbol $sym40$LENGTH;
    private static final SubLList $list41;
    private static final SubLSymbol $sym42$LIST_VAR;
    private static final SubLSymbol $sym43$CDOLIST_CYCLING_COMPLEX;
    private static final SubLList $list44;
    private static final SubLString $str45$COUNTER;
    private static final SubLString $str46$_orig;
    private static final SubLString $str47$_cdr;
    private static final SubLSymbol $sym48$NTH_CYCLING;
    private static final SubLList $list49;
    private static final SubLList $list50;
    private static final SubLSymbol $kw51$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw52$LIST_TYPE;
    private static final SubLSymbol $sym53$LISTP;
    private static final SubLSymbol $kw54$DONE;
    private static final SubLSymbol $sym55$SUBTREE_LIST_VAR;
    private static final SubLSymbol $sym56$CURRENT_SUBTREE_VAR;
    private static final SubLSymbol $sym57$NODE_VAR;
    private static final SubLSymbol $sym58$LIST;
    private static final SubLSymbol $sym59$DO_LIST;
    private static final SubLSymbol $sym60$PIF;
    private static final SubLSymbol $sym61$CPUSH;
    private static final SubLSymbol $sym62$_OPTIONAL;
    private static final SubLSymbol $sym63$SEQUENCEP;
    private static final SubLString $str64$;
    private static final SubLSymbol $kw65$DOT_FOR_DOTTED_LIST;
    private static final SubLSymbol $sym66$NEGATED_TEST_FUNC;
    private static final SubLSymbol $sym67$POSITION_IF_BINARY_LAMBDA;
    private static final SubLSymbol $sym68$PROPER_LIST_P;
    private static final SubLSymbol $sym69$NON_DOTTED_LIST_P;
    private static final SubLSymbol $sym70$NON_NEGATIVE_INTEGER_P;
    private static final SubLSymbol $kw71$DELETED;
    private static final SubLList $list72;
    private static final SubLSymbol $kw73$DUMMY;
    private static final SubLSymbol $sym74$TREE_POSITION_DFS;
    private static final SubLSymbol $sym75$TREE_POSITION_BFS;
    private static final SubLSymbol $sym76$LESSER_LENGTH_P;
    private static final SubLList $list77;
    private static final SubLString $str78$The_lists_of_keys_and_data_are_of;
    private static final SubLSymbol $sym79$DOUBLETON_;
    private static final SubLList $list80;
    private static final SubLString $str81$FIRST_OF_will_multiply_evaluate__;
    private static final SubLSymbol $sym82$FIF;
    private static final SubLSymbol $sym83$FUNCTION_SPEC_P;
    private static final SubLSymbol $sym84$POSITIVE_INTEGER_P;
    private static final SubLSymbol $sym85$NREVERSE;
    private static final SubLSymbol $sym86$VECTORP;
    private static final SubLString $str87$_s_was_not_a_singleton;
    private static final SubLSymbol $kw88$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym89$IGNORE_ERRORS_HANDLER;
    private static final SubLFloat $float90$0_01;
    private static final SubLSymbol $sym91$INTEGERP;
    private static final SubLString $str92$Position_is_not_valid_for_the_siz;
    private static final SubLSymbol $sym93$NUM_LIST_CACHED;
    private static final SubLSymbol $sym94$_NUM_LIST_CACHED_CACHING_STATE_;
    private static final SubLInteger $int95$100;
    private static final SubLSymbol $sym96$KBEQ;
    private static final SubLSymbol $sym97$_;
    private static final SubLSymbol $sym98$__;
    private static final SubLString $str99$Number_of_repetitions_must_be_gre;
    private static final SubLSymbol $kw100$FAILED;
    private static final SubLSymbol $kw101$SUCCEEDED;
    private static final SubLSymbol $kw102$UPDATED;
    private static final SubLSymbol $sym103$TREE_SET_EQUAL_;
    private static final SubLSymbol $sym104$FUNCTION_SYMBOL_P;
    private static final SubLSymbol $kw105$LISTIFIED_VECTOR;
    private static final SubLString $str106$_S_is_not_a_listified_vector_mark;
    private static final SubLSymbol $sym107$FLIP_CONS;
    private static final SubLSymbol $sym108$QUOTE;
    private static final SubLSymbol $sym109$STRING_;
    private static final SubLSymbol $sym110$STRING_;
    private static final SubLSymbol $sym111$SYMBOL_NAME;
    private static final SubLSymbol $sym112$SAFE_SPLICE_INTO_SORTED_LIST;
    private static final SubLSymbol $kw113$TEST;
    private static final SubLSymbol $kw114$OWNER;
    private static final SubLSymbol $kw115$CLASSES;
    private static final SubLSymbol $kw116$KB;
    private static final SubLSymbol $kw117$TINY;
    private static final SubLSymbol $kw118$WORKING_;
    private static final SubLList $list119;
    private static final SubLSymbol $sym120$_REST;
    private static final SubLList $list121;
    private static final SubLList $list122;
    private static final SubLSymbol $sym123$CAR_IS_EL_VAR_;
    private static final SubLString $str124$_s____s;
    private static final SubLList $list125;
    private static final SubLSymbol $kw126$TEMP;
    private static final SubLInteger $int127$500;
    private static final SubLString $str128$remove_duplicates_eq_table_lock;
    private static final SubLString $str129$remove_duplicates_eql_table_lock;
    private static final SubLString $str130$remove_duplicates_equal_table_loc;
    private static final SubLString $str131$remove_duplicates_equalp_table_lo;
    private static final SubLSymbol $sym132$HASH_TABLE_P;
    private static final SubLSymbol $kw133$NOT_UNIQUE;
    private static final SubLSymbol $kw134$UNIQUE;
    private static final SubLSymbol $sym135$TERM__;
    private static final SubLSymbol $sym136$SAFE__;
    private static final SubLSymbol $sym137$ALIST_P;
    private static final SubLList $list138;
    private static final SubLList $list139;
    private static final SubLSymbol $sym140$ALIST_PUSHNEW;
    private static final SubLList $list141;
    private static final SubLSymbol $sym142$ALIST_PUSH;
    private static final SubLList $list143;
    private static final SubLSymbol $sym144$ALIST_ENTER;
    private static final SubLList $list145;
    private static final SubLList $list146;
    private static final SubLList $list147;
    private static final SubLSymbol $sym148$CONS_TO_TUPLE;
    private static final SubLList $list149;
    private static final SubLSymbol $sym150$PUTF;
    private static final SubLList $list151;
    private static final SubLList $list152;
    private static final SubLSymbol $kw153$INCREMENT;
    private static final SubLSymbol $sym154$PLIST_ENTER;
    private static final SubLSymbol $sym155$PLIST_LOOKUP;
    private static final SubLList $list156;
    private static final SubLList $list157;
    private static final SubLSymbol $sym158$PLIST_EXCEPT;
    private static final SubLSymbol $sym159$PROPERTY_LIST_P;
    private static final SubLSymbol $kw160$NO_VALUE;
    private static final SubLSymbol $sym161$PLISTLIST_SORT_KEY;
    private static final SubLString $str162$_A_and__A;
    private static final SubLSymbol $sym163$PRINC_TO_STRING;
    private static final SubLString $str164$__;
    private static final SubLString $str165$__and_;
    private static final SubLString $str166$_a_____a__;
    private static final SubLSymbol $sym167$DOUBLE_FLOAT;
    private static final SubLSymbol $sym168$STR;
    private static final SubLString $str169$_a___4_2f__;
    private static final SubLString $str170$_a___a__;
    private static final SubLString $str171$_a___s__;
    private static final SubLSymbol $sym172$TO_STRING;
    private static final SubLString $str173$___;
    private static final SubLList $list174;
    private static final SubLSymbol $sym175$PLUSP;
    private static final SubLFloat $float176$0_5;
    private static final SubLSymbol $sym177$SORT_VIA_POSITION_EARLIER;
    private static final SubLSymbol $sym178$SORT_VIA_TEST_EARLIER;
    private static final SubLSymbol $sym179$_;
    private static final SubLSymbol $sym180$SAFE__;
    private static final SubLSymbol $sym181$SAFE_TREE__;
    private static final SubLSymbol $sym182$SET__;
    private static final SubLSymbol $sym183$NOT_CONSP;
    private static final SubLSymbol $sym184$LIST_STRUCTURE__;
    private static final SubLSymbol $sym185$FALSE;
    private static final SubLSymbol $sym186$_;
    private static final SubLSymbol $kw187$LESS;
    private static final SubLSymbol $kw188$EQUAL;
    private static final SubLSymbol $kw189$GREATER;
    private static final SubLSymbol $sym190$MAPCAR;
    private static final SubLList $list191;
    private static final SubLSymbol $sym192$GET_ARGLIST;
    private static final SubLList $list193;
    private static final SubLSymbol $kw194$DOCUMENTATION;
    private static final SubLSymbol $sym195$_;
    private static final SubLList $list196;
    private static final SubLSymbol $sym197$KEYWORDP;
    private static final SubLSymbol $sym198$SYMBOLP;
    private static final SubLString $str199$Expected__S__got__S;
    private static final SubLString $str200$_S_was_not_a_form_with_operator__;
    private static final SubLSymbol $sym201$ATOM;
    private static final SubLSymbol $sym202$ASSOC;
    private static final SubLSymbol $sym203$STRINGP;
    private static final SubLSymbol $sym204$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLSymbol $sym205$NEW_DICTIONARY;
    private static final SubLList $list206;
    private static final SubLString $str207$choose__S__default___;
    private static final SubLSymbol $sym208$FAST_SUPERSET_;
    private static final SubLString $str209$can_t_choose__S_since_incompatibl;
    private static final SubLString $str210$past_incompatible___S__;
    private static final SubLString $str211$future_incompatible_choosable___S;
    private static final SubLString $str212$choose__S__not_past_incompatible_;
    private static final SubLString $str213$skip__S__past_incompatible_or_fut;
    private static final SubLSymbol $sym214$SETS_EQUAL_;
    private static final SubLSymbol $sym215$TEST_COMPUTE_ALL_COMPATIBLE_SUBLISTS;
    private static final SubLSymbol $kw216$BOTH;
    private static final SubLObject $list217;
    private static final SubLList $list218;
    private static final SubLString $str219$Invalid_graph_txt_specification_r;
    private static final SubLString $str220$1;
    private static final SubLString $str221$Expected___S__;
    private static final SubLString $str222$Got___;
    private static final SubLString $str223$___S__;
    private static final SubLSymbol $sym224$TEST_FIND_MAXIMUM_INDEPENDENT_SET;
    private static final SubLList $list225;
    private static final SubLSymbol $sym226$COMPARATOR_COMPARE;
    private static final SubLSymbol $sym227$_EXIT;
    private static final SubLSymbol $sym228$A_PREFERRED_OVER_B;
    private static final SubLString $str229$__The_implementer_must_ensure_tha;
    private static final SubLString $str230$__The_implementer_must_ensure_tha;
    private static final SubLString $str231$__The_implementer_must_ensure_tha;
    private static final SubLSymbol $sym232$NINTERSECT_SORTED;
    private static final SubLObject $list233;
    private static final SubLSymbol $sym234$REMOVE_SUBSUMED_ITEMS;
    private static final SubLList $list235;
    private static final SubLSymbol $sym236$REMOVE_NTH;
    private static final SubLList $list237;
    private static final SubLSymbol $sym238$FIND_FIRST_AND_NREPLACE_TEST;
    private static final SubLList $list239;
    private static final SubLSymbol $sym240$REMOVE_NESTED_NTH;
    private static final SubLList $list241;
    private static final SubLSymbol $sym242$POSITION_FROM_END;
    private static final SubLList $list243;
    private static final SubLSymbol $sym244$FIND_AND_REPLACE;
    private static final SubLList $list245;
    private static final SubLSymbol $sym246$FIRST_N_IF;
    private static final SubLList $list247;
    private static final SubLSymbol $sym248$TREE_POSITION_IF_BFS;
    private static final SubLList $list249;
    private static final SubLList $list250;
    private static final SubLSymbol $sym251$TREE_POSITION_IF_DFS;
    private static final SubLList $list252;
    private static final SubLSymbol $sym253$ARG_POSITIONS_DFS;
    private static final SubLList $list254;
    private static final SubLSymbol $sym255$ARG_POSITIONS_BFS;
    private static final SubLSymbol $sym256$RANK_TUPLES;
    private static final SubLList $list257;
    private static final SubLSymbol $sym258$NMEMBER_;
    private static final SubLList $list259;
    private static final SubLSymbol $sym260$ALIST_NLOOKUP_WITHOUT_VALUES;
    private static final SubLList $list261;
    private static final SubLSymbol $sym262$EXACTLY_ONE_DISTINCT_MEMBER_;
    private static final SubLList $list263;
    private static final SubLSymbol $sym264$SORT_PREFERRED_LIST_TO_FRONT;
    private static final SubLList $list265;
    private static final SubLString $str266$List_Utilities_Module_Supercatego;
    private static final SubLString $str267$Utility_Subcategory;
    private static final SubLString $str268$nadd_to_end_Testing_Suite;
    private static final SubLString $str269$last1_Testing_Suite;
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 1027L)
    public static SubLObject sublisp_boolean(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(list_utilities.NIL != v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 1114L)
    public static SubLObject not_boolean(final SubLObject v_object) {
        return Types.sublisp_null(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 1198L)
    public static SubLObject not_eq(final SubLObject obj1, final SubLObject obj2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(!obj1.eql(obj2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 1324L)
    public static SubLObject not_eql(final SubLObject obj1, final SubLObject obj2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(!obj1.eql(obj2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 1385L)
    public static SubLObject not_equal(final SubLObject obj1, final SubLObject obj2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(!obj1.equal(obj2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 1450L)
    public static SubLObject not_equalp(final SubLObject obj1, final SubLObject obj2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(!obj1.equalp(obj2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 1517L)
    public static SubLObject not_assoc(final SubLObject item, final SubLObject alist, SubLObject test, SubLObject key) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(list_utilities.NIL == conses_high.assoc(item, alist, test, key));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 1633L)
    public static SubLObject not_consp(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(!v_object.isCons());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 1692L)
    public static SubLObject eq_and_not_eq(final SubLObject obj1, final SubLObject obj2) {
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 1970L)
    public static SubLObject bull(final SubLObject obj1, final SubLObject obj2) {
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 2116L)
    public static SubLObject no_op() {
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 2205L)
    public static SubLObject caadr(final SubLObject list) {
        return conses_high.cadr(list).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 2350L)
    public static SubLObject caddr(final SubLObject cons) {
        return conses_high.cddr(cons).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 2399L)
    public static SubLObject cdddr(final SubLObject cons) {
        return conses_high.cddr(cons).rest();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 2448L)
    public static SubLObject cadddr(final SubLObject cons) {
        return cdddr(cons).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 2499L)
    public static SubLObject cadadr(final SubLObject cons) {
        return conses_high.cadr(conses_high.cadr(cons));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 2550L)
    public static SubLObject cadar(final SubLObject cons) {
        return conses_high.cdar(cons).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 2599L)
    public static SubLObject cdadr(final SubLObject list) {
        return conses_high.cadr(list).rest();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 2655L)
    public static SubLObject snoc(final SubLObject x, final SubLObject l) {
        return ConsesLow.append(l, (SubLObject)ConsesLow.list(x));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 2767L)
    public static SubLObject list_rotate_left(final SubLObject list) {
        if (list.isCons()) {
            return ConsesLow.append(list.rest(), (SubLObject)ConsesLow.list(list.first()));
        }
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 2891L)
    public static SubLObject list_rotate_right(final SubLObject list) {
        if (list.isCons()) {
            return ConsesLow.append(conses_high.last(list, (SubLObject)list_utilities.UNPROVIDED), conses_high.butlast(list, (SubLObject)list_utilities.UNPROVIDED));
        }
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 3014L)
    public static SubLObject proper_subsetp(final SubLObject list1, final SubLObject list2, SubLObject test, SubLObject key) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(list_utilities.NIL != conses_high.subsetp(list1, list2, test, key) && list_utilities.NIL == conses_high.subsetp(list2, list1, test, key));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 3190L)
    public static SubLObject proper_subsetp_pre_sorted(final SubLObject list1, final SubLObject list2, SubLObject test, SubLObject key) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(list_utilities.NIL != conses_high.subsetp(list1, list2, test, key) && !list1.equal(list2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 3495L)
    public static SubLObject nth_cycling(final SubLObject n, SubLObject list, SubLObject width, SubLObject offset) {
        if (width == list_utilities.UNPROVIDED) {
            width = (SubLObject)list_utilities.NIL;
        }
        if (offset == list_utilities.UNPROVIDED) {
            offset = (SubLObject)list_utilities.ZERO_INTEGER;
        }
        final SubLObject list_length = Sequences.length(list);
        if (list_utilities.ZERO_INTEGER.numE(list_length)) {
            return (SubLObject)list_utilities.NIL;
        }
        if (list_utilities.NIL == width) {
            width = list_length;
        }
        if (width.numL((SubLObject)list_utilities.ZERO_INTEGER)) {
            Errors.error((SubLObject)list_utilities.$str1$nth_cycling__width_must_be_greate);
        }
        else if (width.numG(list_length)) {
            Errors.error((SubLObject)list_utilities.$str2$nth_cycling__width_must_be_less_t);
        }
        else if (offset.numL((SubLObject)list_utilities.ZERO_INTEGER) && width.numG(Numbers.abs(offset))) {
            Errors.error((SubLObject)list_utilities.$str3$nth_cycling__width_overruns_offse);
        }
        else if (offset.numG((SubLObject)list_utilities.ZERO_INTEGER) && width.numG(Numbers.subtract(list_length, offset))) {
            Errors.error((SubLObject)list_utilities.$str3$nth_cycling__width_overruns_offse);
        }
        if (!list_utilities.ZERO_INTEGER.numE(offset)) {
            if (list_utilities.ZERO_INTEGER.numL(offset)) {
                list = conses_high.nthcdr(offset, list);
            }
            else {
                list = conses_high.nthcdr(Numbers.add(list_length, offset), list);
            }
        }
        return ConsesLow.nth(Numbers.mod(n, width), list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 4590L)
    public static SubLObject pop_setq(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject var = (SubLObject)list_utilities.NIL;
        SubLObject place = (SubLObject)list_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list4);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list4);
        place = current.first();
        current = current.rest();
        if (list_utilities.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym5$PROGN, (SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym6$CSETQ, var, (SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym7$FIRST, place)), (SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym8$CPOP, place));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)list_utilities.$list4);
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 4817L)
    public static SubLObject pop_bind(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list9);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)list_utilities.NIL;
        SubLObject place = (SubLObject)list_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list9);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list9);
        place = current.first();
        current = current.rest();
        if (list_utilities.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)list_utilities.$sym10$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var, (SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym7$FIRST, place))), (SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym8$CPOP, place), ConsesLow.append(body, (SubLObject)list_utilities.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)list_utilities.$list9);
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 5046L)
    public static SubLObject push_max_length(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject item = (SubLObject)list_utilities.NIL;
        SubLObject place = (SubLObject)list_utilities.NIL;
        SubLObject max_length = (SubLObject)list_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list11);
        item = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list11);
        place = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list11);
        max_length = current.first();
        current = current.rest();
        if (list_utilities.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym12$CSETF, place, (SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym13$CONS, item, (SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym14$FIRST_N, (SubLObject)ConsesLow.listS((SubLObject)list_utilities.$sym15$_, max_length, (SubLObject)list_utilities.$list16), place)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)list_utilities.$list11);
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 5428L)
    public static SubLObject cdolist_multiple(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list17);
        final SubLObject temp = current.rest();
        final SubLObject var_list_forms;
        current = (var_list_forms = current.first());
        final SubLObject body;
        current = (body = temp);
        SubLObject init_forms = (SubLObject)list_utilities.NIL;
        SubLObject end_test_forms = (SubLObject)list_utilities.NIL;
        SubLObject cdolist_list_var = var_list_forms;
        SubLObject form = (SubLObject)list_utilities.NIL;
        form = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            SubLObject current_$2;
            final SubLObject datum_$1 = current_$2 = form;
            SubLObject var = (SubLObject)list_utilities.NIL;
            SubLObject listform = (SubLObject)list_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current_$2, datum_$1, (SubLObject)list_utilities.$list18);
            var = current_$2.first();
            current_$2 = current_$2.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$2, datum_$1, (SubLObject)list_utilities.$list18);
            listform = current_$2.first();
            current_$2 = current_$2.rest();
            if (list_utilities.NIL == current_$2) {
                final SubLObject list_sym = Symbols.make_symbol(Symbols.symbol_name(var));
                init_forms = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(list_sym, listform, (SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym19$CDR, list_sym)), init_forms);
                init_forms = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var, (SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym20$CAR, list_sym), (SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym20$CAR, list_sym)), init_forms);
                end_test_forms = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym21$NULL, list_sym), end_test_forms);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum_$1, (SubLObject)list_utilities.$list18);
            }
            cdolist_list_var = cdolist_list_var.rest();
            form = cdolist_list_var.first();
        }
        return (SubLObject)ConsesLow.listS((SubLObject)list_utilities.$sym22$CDO, Sequences.nreverse(init_forms), (SubLObject)ConsesLow.list(reader.bq_cons((SubLObject)list_utilities.$sym23$CAND, end_test_forms)), ConsesLow.append(body, (SubLObject)list_utilities.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 6640L)
    public static SubLObject cdolist_multiple_numbered(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list24);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject number_var = (SubLObject)list_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list24);
        number_var = current.first();
        final SubLObject var_list_forms;
        current = (var_list_forms = current.rest());
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym10$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(number_var, (SubLObject)list_utilities.$list25)), (SubLObject)ConsesLow.listS((SubLObject)list_utilities.$sym26$CDOLIST_MULTIPLE, var_list_forms, ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym27$CINC, number_var)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 6992L)
    public static SubLObject csome_multiple(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list28);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject endvar = (SubLObject)list_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list28);
        endvar = current.first();
        final SubLObject var_list_forms;
        current = (var_list_forms = current.rest());
        final SubLObject body;
        current = (body = temp);
        if (list_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !endvar.isSymbol()) {
            Errors.error((SubLObject)list_utilities.$str29$Malformed_csome_multiple_____S_wa, endvar);
        }
        SubLObject init_forms = (SubLObject)list_utilities.NIL;
        SubLObject end_test_forms = (SubLObject)list_utilities.NIL;
        SubLObject cdolist_list_var = var_list_forms;
        SubLObject form = (SubLObject)list_utilities.NIL;
        form = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            SubLObject current_$4;
            final SubLObject datum_$3 = current_$4 = form;
            SubLObject var = (SubLObject)list_utilities.NIL;
            SubLObject listform = (SubLObject)list_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current_$4, datum_$3, (SubLObject)list_utilities.$list18);
            var = current_$4.first();
            current_$4 = current_$4.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$4, datum_$3, (SubLObject)list_utilities.$list18);
            listform = current_$4.first();
            current_$4 = current_$4.rest();
            if (list_utilities.NIL == current_$4) {
                final SubLObject list_sym = Symbols.make_symbol(Symbols.symbol_name(var));
                init_forms = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(list_sym, listform, (SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym19$CDR, list_sym)), init_forms);
                init_forms = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var, (SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym20$CAR, list_sym), (SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym20$CAR, list_sym)), init_forms);
                end_test_forms = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym21$NULL, list_sym), end_test_forms);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum_$3, (SubLObject)list_utilities.$list18);
            }
            cdolist_list_var = cdolist_list_var.rest();
            form = cdolist_list_var.first();
        }
        return (SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym30$PUNLESS, endvar, (SubLObject)ConsesLow.listS((SubLObject)list_utilities.$sym22$CDO, Sequences.nreverse(init_forms), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym31$COR, endvar, reader.bq_cons((SubLObject)list_utilities.$sym23$CAND, end_test_forms))), ConsesLow.append(body, (SubLObject)list_utilities.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 8440L)
    public static SubLObject cdolist_numbered(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list32);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject elem_var = (SubLObject)list_utilities.NIL;
        SubLObject number_var = (SubLObject)list_utilities.NIL;
        SubLObject listform = (SubLObject)list_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list32);
        elem_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list32);
        number_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list32);
        listform = current.first();
        current = current.rest();
        if (list_utilities.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject list_var = (SubLObject)list_utilities.$sym33$LIST_VAR;
            return (SubLObject)ConsesLow.listS((SubLObject)list_utilities.$sym22$CDO, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(list_var, listform, (SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym19$CDR, list_var)), (SubLObject)ConsesLow.list(elem_var, (SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym20$CAR, list_var), (SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym20$CAR, list_var)), (SubLObject)ConsesLow.list(number_var, (SubLObject)list_utilities.ZERO_INTEGER, (SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym34$_, (SubLObject)list_utilities.ONE_INTEGER, number_var))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym21$NULL, list_var)), ConsesLow.append(body, (SubLObject)list_utilities.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)list_utilities.$list32);
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 8893L)
    public static SubLObject cdolist_backward(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list35);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)list_utilities.NIL;
        SubLObject listform = (SubLObject)list_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list35);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list35);
        listform = current.first();
        current = current.rest();
        if (list_utilities.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)list_utilities.$sym36$CDOLIST, (SubLObject)ConsesLow.list(var, (SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym37$REVERSE, listform)), ConsesLow.append(body, (SubLObject)list_utilities.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)list_utilities.$list35);
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 9101L)
    public static SubLObject cdolist_backward_numbered(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list32);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject elem_var = (SubLObject)list_utilities.NIL;
        SubLObject number_var = (SubLObject)list_utilities.NIL;
        SubLObject listform = (SubLObject)list_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list32);
        elem_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list32);
        number_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list32);
        listform = current.first();
        current = current.rest();
        if (list_utilities.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject list_var = (SubLObject)list_utilities.$sym38$LIST_VAR;
            return (SubLObject)ConsesLow.listS((SubLObject)list_utilities.$sym22$CDO, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(list_var, (SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym37$REVERSE, listform), (SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym19$CDR, list_var)), (SubLObject)ConsesLow.list(elem_var, (SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym20$CAR, list_var), (SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym20$CAR, list_var)), (SubLObject)ConsesLow.list(number_var, (SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym39$1_, (SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym40$LENGTH, listform)), (SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym39$1_, number_var))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym21$NULL, list_var)), ConsesLow.append(body, (SubLObject)list_utilities.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)list_utilities.$list32);
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 9591L)
    public static SubLObject csome_numbered(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list41);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject elem_var = (SubLObject)list_utilities.NIL;
        SubLObject number_var = (SubLObject)list_utilities.NIL;
        SubLObject listform = (SubLObject)list_utilities.NIL;
        SubLObject endvar = (SubLObject)list_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list41);
        elem_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list41);
        number_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list41);
        listform = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list41);
        endvar = current.first();
        current = current.rest();
        if (list_utilities.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject list_var = (SubLObject)list_utilities.$sym42$LIST_VAR;
            return (SubLObject)ConsesLow.listS((SubLObject)list_utilities.$sym22$CDO, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(list_var, listform, (SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym19$CDR, list_var)), (SubLObject)ConsesLow.list(elem_var, (SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym20$CAR, list_var), (SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym20$CAR, list_var)), (SubLObject)ConsesLow.list(number_var, (SubLObject)list_utilities.ZERO_INTEGER, (SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym34$_, (SubLObject)list_utilities.ONE_INTEGER, number_var))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym31$COR, endvar, (SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym21$NULL, list_var))), ConsesLow.append(body, (SubLObject)list_utilities.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)list_utilities.$list41);
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 10094L)
    public static SubLObject cdolist_cycling(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list17);
        final SubLObject temp = current.rest();
        final SubLObject var_list_forms;
        current = (var_list_forms = current.first());
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)list_utilities.$sym43$CDOLIST_CYCLING_COMPLEX, (SubLObject)ConsesLow.list(var_list_forms), ConsesLow.append(body, (SubLObject)list_utilities.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 10840L)
    public static SubLObject cdolist_cycling_complex(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list44);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var_list_forms = (SubLObject)list_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list44);
        var_list_forms = current.first();
        current = current.rest();
        final SubLObject secondary_lists = (SubLObject)(current.isCons() ? current.first() : list_utilities.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)list_utilities.$list44);
        current = current.rest();
        if (list_utilities.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            SubLObject init_forms = (SubLObject)list_utilities.NIL;
            SubLObject end_test_forms = (SubLObject)list_utilities.NIL;
            final SubLObject count_sym = Symbols.make_symbol((SubLObject)list_utilities.$str45$COUNTER);
            init_forms = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(count_sym, (SubLObject)list_utilities.ZERO_INTEGER, (SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym34$_, (SubLObject)list_utilities.ONE_INTEGER, count_sym)), init_forms);
            SubLObject list_var = (SubLObject)list_utilities.NIL;
            SubLObject form = (SubLObject)list_utilities.NIL;
            SubLObject form_num = (SubLObject)list_utilities.NIL;
            list_var = var_list_forms;
            form = list_var.first();
            for (form_num = (SubLObject)list_utilities.ZERO_INTEGER; list_utilities.NIL != list_var; list_var = list_var.rest(), form = list_var.first(), form_num = Numbers.add((SubLObject)list_utilities.ONE_INTEGER, form_num)) {
                SubLObject current_$6;
                final SubLObject datum_$5 = current_$6 = form;
                SubLObject var = (SubLObject)list_utilities.NIL;
                SubLObject listform = (SubLObject)list_utilities.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$6, datum_$5, (SubLObject)list_utilities.$list18);
                var = current_$6.first();
                current_$6 = current_$6.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$6, datum_$5, (SubLObject)list_utilities.$list18);
                listform = current_$6.first();
                current_$6 = current_$6.rest();
                if (list_utilities.NIL == current_$6) {
                    final SubLObject list_sym_orig = Symbols.make_symbol(Sequences.cconcatenate(Symbols.symbol_name(var), (SubLObject)list_utilities.$str46$_orig));
                    final SubLObject list_sym_cdr = Symbols.make_symbol(Sequences.cconcatenate(Symbols.symbol_name(var), (SubLObject)list_utilities.$str47$_cdr));
                    init_forms = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(list_sym_orig, listform, list_sym_orig), init_forms);
                    init_forms = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(list_sym_cdr, list_sym_orig, (SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym19$CDR, list_sym_cdr)), init_forms);
                    init_forms = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var, (SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym20$CAR, list_sym_orig), (SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym48$NTH_CYCLING, count_sym, list_sym_orig)), init_forms);
                    if (list_utilities.NIL == subl_promotions.memberP(form_num, secondary_lists, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED)) {
                        end_test_forms = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym21$NULL, list_sym_cdr), end_test_forms);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$5, (SubLObject)list_utilities.$list18);
                }
            }
            return (SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym10$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(count_sym, (SubLObject)list_utilities.$list25)), (SubLObject)ConsesLow.listS((SubLObject)list_utilities.$sym22$CDO, Sequences.nreverse(init_forms), (SubLObject)ConsesLow.list(reader.bq_cons((SubLObject)list_utilities.$sym23$CAND, end_test_forms)), ConsesLow.append(body, (SubLObject)list_utilities.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)list_utilities.$list44);
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 12436L)
    public static SubLObject do_tree_leaves(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list49);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject leaf_var = (SubLObject)list_utilities.NIL;
        SubLObject tree = (SubLObject)list_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list49);
        leaf_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list49);
        tree = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)list_utilities.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)list_utilities.NIL;
        SubLObject current_$7 = (SubLObject)list_utilities.NIL;
        while (list_utilities.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)list_utilities.$list49);
            current_$7 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)list_utilities.$list49);
            if (list_utilities.NIL == conses_high.member(current_$7, (SubLObject)list_utilities.$list50, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED)) {
                bad = (SubLObject)list_utilities.T;
            }
            if (current_$7 == list_utilities.$kw51$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (list_utilities.NIL != bad && list_utilities.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)list_utilities.$list49);
        }
        final SubLObject list_type_tail = cdestructuring_bind.property_list_member((SubLObject)list_utilities.$kw52$LIST_TYPE, current);
        final SubLObject list_type = (SubLObject)((list_utilities.NIL != list_type_tail) ? conses_high.cadr(list_type_tail) : list_utilities.$sym53$LISTP);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)list_utilities.$kw54$DONE, current);
        final SubLObject done = (SubLObject)((list_utilities.NIL != done_tail) ? conses_high.cadr(done_tail) : list_utilities.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject subtree_list_var = (SubLObject)list_utilities.$sym55$SUBTREE_LIST_VAR;
        final SubLObject current_subtree_var = (SubLObject)list_utilities.$sym56$CURRENT_SUBTREE_VAR;
        final SubLObject node_var = (SubLObject)list_utilities.$sym57$NODE_VAR;
        return (SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym10$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(subtree_list_var, (SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym58$LIST, tree))), (SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym22$CDO, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(current_subtree_var, (SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym7$FIRST, subtree_list_var), (SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym7$FIRST, subtree_list_var))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym31$COR, done, (SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym21$NULL, subtree_list_var))), (SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym8$CPOP, subtree_list_var), (SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym59$DO_LIST, (SubLObject)ConsesLow.list(node_var, current_subtree_var, (SubLObject)list_utilities.$kw54$DONE, done), (SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym60$PIF, (SubLObject)ConsesLow.list(list_type, node_var), (SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym61$CPUSH, node_var, subtree_list_var), (SubLObject)ConsesLow.listS((SubLObject)list_utilities.$sym10$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(leaf_var, node_var)), ConsesLow.append(body, (SubLObject)list_utilities.NIL))))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 13474L)
    public static SubLObject args_from_arg_list(final SubLObject arg_list) {
        SubLObject args = (SubLObject)list_utilities.NIL;
        SubLObject optionalP = (SubLObject)list_utilities.NIL;
        SubLObject cdolist_list_var = arg_list;
        SubLObject arg_spec = (SubLObject)list_utilities.NIL;
        arg_spec = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            if (arg_spec == list_utilities.$sym62$_OPTIONAL) {
                optionalP = (SubLObject)list_utilities.T;
            }
            else if (list_utilities.NIL == optionalP) {
                args = (SubLObject)ConsesLow.cons(arg_spec, args);
            }
            else if (arg_spec.isCons() && arg_spec.first().isSymbol()) {
                args = (SubLObject)ConsesLow.cons(arg_spec.first(), args);
            }
            else {
                args = (SubLObject)ConsesLow.cons(arg_spec, args);
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg_spec = cdolist_list_var.first();
        }
        return Sequences.nreverse(args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 13956L)
    public static SubLObject lengthL(final SubLObject seq, final SubLObject n, SubLObject count_dotted_listP) {
        if (count_dotted_listP == list_utilities.UNPROVIDED) {
            count_dotted_listP = (SubLObject)list_utilities.NIL;
        }
        if (!seq.isList()) {
            return Numbers.numL(Sequences.length(seq), n);
        }
        SubLObject tail = (SubLObject)list_utilities.NIL;
        SubLObject i = (SubLObject)list_utilities.NIL;
        tail = seq;
        for (i = (SubLObject)list_utilities.ZERO_INTEGER; !i.numGE(n); i = Numbers.add(i, (SubLObject)list_utilities.ONE_INTEGER)) {
            if (list_utilities.NIL == tail) {
                return (SubLObject)list_utilities.T;
            }
            if (!tail.isCons()) {
                return (SubLObject)((list_utilities.NIL != count_dotted_listP) ? Numbers.numL(Numbers.add(i, (SubLObject)list_utilities.ONE_INTEGER), n) : list_utilities.T);
            }
            tail = tail.rest();
        }
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 14543L)
    public static SubLObject lengthLE(final SubLObject seq, final SubLObject n, SubLObject count_dotted_listP) {
        if (count_dotted_listP == list_utilities.UNPROVIDED) {
            count_dotted_listP = (SubLObject)list_utilities.NIL;
        }
        return lengthL(seq, Numbers.add(n, (SubLObject)list_utilities.ONE_INTEGER), count_dotted_listP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 14866L)
    public static SubLObject lengthE(final SubLObject seq, final SubLObject n, SubLObject count_dotted_listP) {
        if (count_dotted_listP == list_utilities.UNPROVIDED) {
            count_dotted_listP = (SubLObject)list_utilities.NIL;
        }
        if (!seq.isList()) {
            return Numbers.numE(Sequences.length(seq), n);
        }
        if (list_utilities.NIL == count_dotted_listP && list_utilities.NIL == dotted_list_p(seq)) {
            if (n.eql((SubLObject)list_utilities.ZERO_INTEGER)) {
                return Types.sublisp_null(seq);
            }
            if (n.eql((SubLObject)list_utilities.ONE_INTEGER)) {
                return singletonP(seq);
            }
            if (n.eql((SubLObject)list_utilities.TWO_INTEGER)) {
                return doubletonP(seq);
            }
            if (n.eql((SubLObject)list_utilities.THREE_INTEGER)) {
                return tripleP(seq);
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(list_utilities.NIL != lengthLE(seq, n, count_dotted_listP) && list_utilities.NIL != lengthGE(seq, n, count_dotted_listP));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 15654L)
    public static SubLObject lengthsE(final SubLObject list_of_seqs, final SubLObject n, SubLObject count_dotted_listP) {
        if (count_dotted_listP == list_utilities.UNPROVIDED) {
            count_dotted_listP = (SubLObject)list_utilities.NIL;
        }
        SubLObject failureP = (SubLObject)list_utilities.NIL;
        if (list_utilities.NIL == failureP) {
            SubLObject csome_list_var = list_of_seqs;
            SubLObject seq = (SubLObject)list_utilities.NIL;
            seq = csome_list_var.first();
            while (list_utilities.NIL == failureP && list_utilities.NIL != csome_list_var) {
                if (list_utilities.NIL == lengthE(seq, n, count_dotted_listP)) {
                    failureP = (SubLObject)list_utilities.T;
                }
                csome_list_var = csome_list_var.rest();
                seq = csome_list_var.first();
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(list_utilities.NIL == failureP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 15883L)
    public static SubLObject lengthG(final SubLObject seq, final SubLObject n, SubLObject count_dotted_listP) {
        if (count_dotted_listP == list_utilities.UNPROVIDED) {
            count_dotted_listP = (SubLObject)list_utilities.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(list_utilities.NIL == lengthLE(seq, n, count_dotted_listP));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 16207L)
    public static SubLObject lengthGE(final SubLObject seq, final SubLObject n, SubLObject count_dotted_listP) {
        if (count_dotted_listP == list_utilities.UNPROVIDED) {
            count_dotted_listP = (SubLObject)list_utilities.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(list_utilities.NIL == lengthL(seq, n, count_dotted_listP));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 16534L)
    public static SubLObject zero_length_p(final SubLObject sequence) {
        assert list_utilities.NIL != Types.sequencep(sequence) : sequence;
        if (sequence.isString()) {
            return Equality.eql((SubLObject)list_utilities.$str64$, sequence);
        }
        if (sequence.isList()) {
            return Types.sublisp_null(sequence);
        }
        return lengthE(sequence, (SubLObject)list_utilities.ZERO_INTEGER, (SubLObject)list_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 16934L)
    public static SubLObject same_length_p(final SubLObject seq1, final SubLObject seq2) {
        if (list_utilities.NIL == seq1) {
            return (SubLObject)SubLObjectFactory.makeBoolean(list_utilities.NIL == seq2 || (!seq2.isCons() && Sequences.length(seq2).isZero()));
        }
        if (seq1.isCons()) {
            if (list_utilities.NIL == seq2) {
                return (SubLObject)list_utilities.NIL;
            }
            if (seq2.isCons()) {
                SubLObject sublist1;
                SubLObject sublist2;
                for (sublist1 = (SubLObject)list_utilities.NIL, sublist2 = (SubLObject)list_utilities.NIL, sublist1 = seq1, sublist2 = seq2; list_utilities.NIL != sublist1 && list_utilities.NIL != sublist2; sublist1 = sublist1.rest(), sublist2 = sublist2.rest()) {}
                return Equality.eq(sublist1, sublist2);
            }
            return Numbers.numE(Sequences.length(seq1), Sequences.length(seq2));
        }
        else {
            if (list_utilities.NIL == seq2) {
                return Numbers.zerop(Sequences.length(seq1));
            }
            return lengthE(seq2, Sequences.length(seq1), (SubLObject)list_utilities.UNPROVIDED);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 17596L)
    public static SubLObject same_lengths_p(final SubLObject list_of_seqs) {
        SubLObject differentP = (SubLObject)list_utilities.NIL;
        if (list_utilities.NIL == differentP) {
            SubLObject csome_list_var;
            SubLObject seq;
            for (csome_list_var = list_of_seqs.rest(), seq = (SubLObject)list_utilities.NIL, seq = csome_list_var.first(); list_utilities.NIL == differentP && list_utilities.NIL != csome_list_var; differentP = (SubLObject)SubLObjectFactory.makeBoolean(list_utilities.NIL == same_length_p(seq, list_of_seqs.first())), csome_list_var = csome_list_var.rest(), seq = csome_list_var.first()) {}
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(list_utilities.NIL == differentP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 17954L)
    public static SubLObject longer_p(final SubLObject seq1, final SubLObject seq2) {
        return greater_length_p(seq1, seq2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 18029L)
    public static SubLObject greater_length_p(final SubLObject seq1, final SubLObject seq2) {
        if (list_utilities.NIL == seq1) {
            return (SubLObject)list_utilities.NIL;
        }
        if (seq1.isCons()) {
            if (list_utilities.NIL == seq2) {
                return (SubLObject)list_utilities.T;
            }
            if (seq2.isCons()) {
                SubLObject sublist1;
                SubLObject sublist2;
                for (sublist1 = (SubLObject)list_utilities.NIL, sublist2 = (SubLObject)list_utilities.NIL, sublist1 = seq1, sublist2 = seq2; list_utilities.NIL != sublist1 && list_utilities.NIL != sublist2; sublist1 = sublist1.rest(), sublist2 = sublist2.rest()) {}
                return (SubLObject)SubLObjectFactory.makeBoolean(list_utilities.NIL != sublist1 && list_utilities.NIL == sublist2);
            }
            return Numbers.numG(Sequences.length(seq1), Sequences.length(seq2));
        }
        else {
            if (list_utilities.NIL == seq2) {
                return (SubLObject)SubLObjectFactory.makeBoolean(!Sequences.length(seq1).isZero());
            }
            return lengthL(seq2, Sequences.length(seq1), (SubLObject)list_utilities.UNPROVIDED);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 18682L)
    public static SubLObject greater_or_same_length_p(final SubLObject seq1, final SubLObject seq2) {
        if (list_utilities.NIL == seq1) {
            return (SubLObject)SubLObjectFactory.makeBoolean(list_utilities.NIL == seq2 || (!seq2.isCons() && Sequences.length(seq2).isZero()));
        }
        if (seq1.isCons()) {
            if (list_utilities.NIL == seq2) {
                return (SubLObject)list_utilities.T;
            }
            if (seq2.isCons()) {
                SubLObject sublist1;
                SubLObject sublist2;
                for (sublist1 = (SubLObject)list_utilities.NIL, sublist2 = (SubLObject)list_utilities.NIL, sublist1 = seq1, sublist2 = seq2; list_utilities.NIL != sublist1 && list_utilities.NIL != sublist2; sublist1 = sublist1.rest(), sublist2 = sublist2.rest()) {}
                return (SubLObject)SubLObjectFactory.makeBoolean(sublist1.eql(sublist2) || list_utilities.NIL == sublist2);
            }
            return Numbers.numGE(Sequences.length(seq1), Sequences.length(seq2));
        }
        else {
            if (list_utilities.NIL == seq2) {
                return (SubLObject)list_utilities.T;
            }
            return lengthLE(seq2, Sequences.length(seq1), (SubLObject)list_utilities.UNPROVIDED);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 19392L)
    public static SubLObject shorter_p(final SubLObject seq1, final SubLObject seq2) {
        return lesser_length_p(seq1, seq2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 19467L)
    public static SubLObject lesser_length_p(final SubLObject seq1, final SubLObject seq2) {
        return greater_length_p(seq2, seq1);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 19709L)
    public static SubLObject lesser_or_same_length_p(final SubLObject seq1, final SubLObject seq2) {
        return greater_or_same_length_p(seq2, seq1);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 19975L)
    public static SubLObject empty_list_p(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(obj.isList() && list_utilities.NIL != lengthE(obj, (SubLObject)list_utilities.ZERO_INTEGER, (SubLObject)list_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 20104L)
    public static SubLObject non_empty_list_p(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(obj.isList() && list_utilities.NIL != lengthG(obj, (SubLObject)list_utilities.ZERO_INTEGER, (SubLObject)list_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 20239L)
    public static SubLObject proper_list_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isCons() && list_utilities.NIL == conses_high.last(v_object, (SubLObject)list_utilities.UNPROVIDED).rest());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 20416L)
    public static SubLObject dotted_list_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isCons() && list_utilities.NIL != conses_high.last(v_object, (SubLObject)list_utilities.UNPROVIDED).rest());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 20505L)
    public static SubLObject non_dotted_list_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(list_utilities.NIL == v_object || list_utilities.NIL != proper_list_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 20598L)
    public static SubLObject dotted_length(final SubLObject cons) {
        final SubLObject cdr = cons.rest();
        if (!cdr.isCons()) {
            return (SubLObject)list_utilities.ONE_INTEGER;
        }
        return Numbers.add((SubLObject)list_utilities.ONE_INTEGER, dotted_length(cdr));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 20740L)
    public static SubLObject dotted_last(final SubLObject cons) {
        return conses_high.last(cons, (SubLObject)list_utilities.UNPROVIDED).rest();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 20802L)
    public static SubLObject dotted_butlast(final SubLObject cons) {
        if (!cons.isCons()) {
            return (SubLObject)list_utilities.NIL;
        }
        final SubLObject car = cons.first();
        final SubLObject cdr = cons.rest();
        if (cdr.isCons()) {
            return (SubLObject)ConsesLow.cons(car, dotted_butlast(cdr));
        }
        if (list_utilities.NIL != cdr) {
            return (SubLObject)ConsesLow.list(car);
        }
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 21104L)
    public static SubLObject undot(final SubLObject cons) {
        if (!cons.isCons()) {
            return (SubLObject)list_utilities.NIL;
        }
        final SubLObject car = cons.first();
        final SubLObject cdr = cons.rest();
        if (cdr.isCons()) {
            return (SubLObject)ConsesLow.cons(car, undot(cdr));
        }
        if (list_utilities.NIL != cdr) {
            return (SubLObject)ConsesLow.cons(car, (SubLObject)ConsesLow.cons(cdr, (SubLObject)list_utilities.NIL));
        }
        return cons;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 21432L)
    public static SubLObject add_to_dotted_end(final SubLObject v_object, final SubLObject list) {
        return nadd_to_dotted_end(v_object, conses_high.copy_list(list));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 21565L)
    public static SubLObject nadd_to_dotted_end(final SubLObject v_object, final SubLObject list) {
        if (list.isList()) {
            final SubLObject cons = conses_high.last(list, (SubLObject)list_utilities.UNPROVIDED);
            final SubLObject cdr = cons.rest();
            if (list_utilities.NIL != cdr) {
                ConsesLow.rplacd(cons, (SubLObject)ConsesLow.cons(cdr, v_object));
            }
            else {
                ConsesLow.rplacd(cons, v_object);
            }
            return list;
        }
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 21882L)
    public static SubLObject ndot_last(final SubLObject list) {
        final SubLObject last_elem = conses_high.last(list, (SubLObject)list_utilities.UNPROVIDED).first();
        return nadd_to_dotted_end(last_elem, conses_high.nbutlast(list, (SubLObject)list_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 22069L)
    public static SubLObject dot_last(final SubLObject list) {
        return ndot_last(conses_high.copy_list(list));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 22177L)
    public static SubLObject possible_dotted_list_to_dotted_list(SubLObject list, SubLObject dot) {
        if (dot == list_utilities.UNPROVIDED) {
            dot = (SubLObject)list_utilities.$kw65$DOT_FOR_DOTTED_LIST;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!list.isList()) {
            return subl_promotions.values2(list, (SubLObject)list_utilities.T);
        }
        SubLObject list_d = (SubLObject)list_utilities.NIL;
        SubLObject doneP = (SubLObject)list_utilities.NIL;
        if (list_utilities.NIL == doneP) {
            SubLObject csome_list_var = list;
            SubLObject sublist = (SubLObject)list_utilities.NIL;
            sublist = csome_list_var.first();
            while (list_utilities.NIL == doneP && list_utilities.NIL != csome_list_var) {
                thread.resetMultipleValues();
                final SubLObject sublist_d = possible_dotted_list_to_dotted_list(sublist, (SubLObject)list_utilities.UNPROVIDED);
                final SubLObject okP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                list_d = (SubLObject)ConsesLow.cons(sublist_d, list_d);
                if (list_utilities.NIL == okP) {
                    doneP = (SubLObject)list_utilities.T;
                }
                csome_list_var = csome_list_var.rest();
                sublist = csome_list_var.first();
            }
        }
        if (list_utilities.NIL != doneP) {
            return subl_promotions.values2((SubLObject)list_utilities.NIL, (SubLObject)list_utilities.NIL);
        }
        list = Sequences.nreverse(list_d);
        final SubLObject dot_at = Sequences.position(dot, list, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED);
        if (list_utilities.NIL != dot_at) {
            final SubLObject length_of_list = Sequences.length(list);
            if (list_utilities.THREE_INTEGER.numG(length_of_list)) {
                return subl_promotions.values2((SubLObject)list_utilities.NIL, (SubLObject)list_utilities.NIL);
            }
            if (!dot_at.numE(Numbers.subtract(length_of_list, (SubLObject)list_utilities.TWO_INTEGER))) {
                return subl_promotions.values2((SubLObject)list_utilities.NIL, (SubLObject)list_utilities.NIL);
            }
            if (conses_high.last(list, (SubLObject)list_utilities.UNPROVIDED).first().eql(dot)) {
                return subl_promotions.values2((SubLObject)list_utilities.NIL, (SubLObject)list_utilities.NIL);
            }
            ConsesLow.rplacd(conses_high.nthcdr(Numbers.subtract(length_of_list, (SubLObject)list_utilities.THREE_INTEGER), list), conses_high.nthcdr(Numbers.subtract(length_of_list, (SubLObject)list_utilities.ONE_INTEGER), list).first());
        }
        return subl_promotions.values2(list, (SubLObject)list_utilities.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 23503L)
    public static SubLObject list_non_dotted_through_n_p(final SubLObject list, final SubLObject n) {
        SubLObject remaining = (SubLObject)list_utilities.NIL;
        SubLObject i = (SubLObject)list_utilities.NIL;
        remaining = list;
        for (i = (SubLObject)list_utilities.ZERO_INTEGER; !i.numG(n); i = number_utilities.f_1X(i)) {
            if (!remaining.isList()) {
                return (SubLObject)list_utilities.NIL;
            }
            if (list_utilities.NIL == remaining) {
                return (SubLObject)list_utilities.NIL;
            }
            remaining = remaining.rest();
        }
        return (SubLObject)list_utilities.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 24770L)
    public static SubLObject negated_test_func(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(list_utilities.NIL == Functions.funcall(list_utilities.$negated_test_func$.getDynamicValue(thread), obj));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 24853L)
    public static SubLObject remove_if_not(final SubLObject test, final SubLObject sequence, SubLObject key, SubLObject start, SubLObject end, SubLObject count) {
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        if (start == list_utilities.UNPROVIDED) {
            start = (SubLObject)list_utilities.ZERO_INTEGER;
        }
        if (end == list_utilities.UNPROVIDED) {
            end = (SubLObject)list_utilities.NIL;
        }
        if (count == list_utilities.UNPROVIDED) {
            count = (SubLObject)list_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)list_utilities.NIL;
        final SubLObject _prev_bind_0 = list_utilities.$negated_test_func$.currentBinding(thread);
        try {
            list_utilities.$negated_test_func$.bind(test, thread);
            ans = Sequences.remove_if((SubLObject)list_utilities.$sym66$NEGATED_TEST_FUNC, sequence, key, start, end, count);
        }
        finally {
            list_utilities.$negated_test_func$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 25120L)
    public static SubLObject delete_if_not(final SubLObject test, final SubLObject sequence, SubLObject key, SubLObject start, SubLObject end, SubLObject count) {
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        if (start == list_utilities.UNPROVIDED) {
            start = (SubLObject)list_utilities.ZERO_INTEGER;
        }
        if (end == list_utilities.UNPROVIDED) {
            end = (SubLObject)list_utilities.NIL;
        }
        if (count == list_utilities.UNPROVIDED) {
            count = (SubLObject)list_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)list_utilities.NIL;
        final SubLObject _prev_bind_0 = list_utilities.$negated_test_func$.currentBinding(thread);
        try {
            list_utilities.$negated_test_func$.bind(test, thread);
            ans = Sequences.delete_if((SubLObject)list_utilities.$sym66$NEGATED_TEST_FUNC, sequence, key, start, end, count);
        }
        finally {
            list_utilities.$negated_test_func$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 25387L)
    public static SubLObject substitute_if_not(final SubLObject v_new, final SubLObject test, final SubLObject sequence, SubLObject key, SubLObject start, SubLObject end, SubLObject count) {
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        if (start == list_utilities.UNPROVIDED) {
            start = (SubLObject)list_utilities.ZERO_INTEGER;
        }
        if (end == list_utilities.UNPROVIDED) {
            end = (SubLObject)list_utilities.NIL;
        }
        if (count == list_utilities.UNPROVIDED) {
            count = (SubLObject)list_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)list_utilities.NIL;
        final SubLObject _prev_bind_0 = list_utilities.$negated_test_func$.currentBinding(thread);
        try {
            list_utilities.$negated_test_func$.bind(test, thread);
            ans = Sequences.substitute_if(v_new, (SubLObject)list_utilities.$sym66$NEGATED_TEST_FUNC, sequence, key, start, end, count);
        }
        finally {
            list_utilities.$negated_test_func$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 25674L)
    public static SubLObject nsubstitute_if_not(final SubLObject v_new, final SubLObject test, final SubLObject sequence, SubLObject key, SubLObject start, SubLObject end, SubLObject count) {
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        if (start == list_utilities.UNPROVIDED) {
            start = (SubLObject)list_utilities.ZERO_INTEGER;
        }
        if (end == list_utilities.UNPROVIDED) {
            end = (SubLObject)list_utilities.NIL;
        }
        if (count == list_utilities.UNPROVIDED) {
            count = (SubLObject)list_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)list_utilities.NIL;
        final SubLObject _prev_bind_0 = list_utilities.$negated_test_func$.currentBinding(thread);
        try {
            list_utilities.$negated_test_func$.bind(test, thread);
            ans = Sequences.nsubstitute_if(v_new, (SubLObject)list_utilities.$sym66$NEGATED_TEST_FUNC, sequence, key, start, end, count);
        }
        finally {
            list_utilities.$negated_test_func$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 25964L)
    public static SubLObject find_if_not(final SubLObject test, final SubLObject sequence, SubLObject key, SubLObject start, SubLObject end) {
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        if (start == list_utilities.UNPROVIDED) {
            start = (SubLObject)list_utilities.ZERO_INTEGER;
        }
        if (end == list_utilities.UNPROVIDED) {
            end = (SubLObject)list_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)list_utilities.NIL;
        final SubLObject _prev_bind_0 = list_utilities.$negated_test_func$.currentBinding(thread);
        try {
            list_utilities.$negated_test_func$.bind(test, thread);
            ans = Sequences.find_if((SubLObject)list_utilities.$sym66$NEGATED_TEST_FUNC, sequence, key, start, end);
        }
        finally {
            list_utilities.$negated_test_func$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 26213L)
    public static SubLObject position_if_not(final SubLObject test, final SubLObject sequence, SubLObject key, SubLObject start, SubLObject end) {
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        if (start == list_utilities.UNPROVIDED) {
            start = (SubLObject)list_utilities.ZERO_INTEGER;
        }
        if (end == list_utilities.UNPROVIDED) {
            end = (SubLObject)list_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)list_utilities.NIL;
        final SubLObject _prev_bind_0 = list_utilities.$negated_test_func$.currentBinding(thread);
        try {
            list_utilities.$negated_test_func$.bind(test, thread);
            ans = Sequences.position_if((SubLObject)list_utilities.$sym66$NEGATED_TEST_FUNC, sequence, key, start, end);
        }
        finally {
            list_utilities.$negated_test_func$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 26602L)
    public static SubLObject position_if_binary_lambda(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Functions.funcall(list_utilities.$position_if_binary_lambda_func$.getDynamicValue(thread), v_object, list_utilities.$position_if_binary_lambda_arg2$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 26745L)
    public static SubLObject position_if_binary(final SubLObject test, final SubLObject sequence, final SubLObject arg2, SubLObject key, SubLObject start, SubLObject end) {
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        if (start == list_utilities.UNPROVIDED) {
            start = (SubLObject)list_utilities.ZERO_INTEGER;
        }
        if (end == list_utilities.UNPROVIDED) {
            end = (SubLObject)list_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)list_utilities.NIL;
        final SubLObject _prev_bind_0 = list_utilities.$position_if_binary_lambda_func$.currentBinding(thread);
        final SubLObject _prev_bind_2 = list_utilities.$position_if_binary_lambda_arg2$.currentBinding(thread);
        try {
            list_utilities.$position_if_binary_lambda_func$.bind(test, thread);
            list_utilities.$position_if_binary_lambda_arg2$.bind(arg2, thread);
            result = Sequences.position_if((SubLObject)list_utilities.$sym67$POSITION_IF_BINARY_LAMBDA, sequence, key, start, end);
        }
        finally {
            list_utilities.$position_if_binary_lambda_arg2$.rebind(_prev_bind_2, thread);
            list_utilities.$position_if_binary_lambda_func$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 27130L)
    public static SubLObject position_from_end(final SubLObject item, final SubLObject sequence, SubLObject test, SubLObject key, SubLObject start, SubLObject end) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        if (start == list_utilities.UNPROVIDED) {
            start = (SubLObject)list_utilities.ZERO_INTEGER;
        }
        if (end == list_utilities.UNPROVIDED) {
            end = (SubLObject)list_utilities.NIL;
        }
        final SubLObject real_end = (list_utilities.NIL != end) ? end : number_utilities.f_1_(Sequences.length(sequence));
        final SubLObject max = Numbers.subtract(real_end, start);
        SubLObject end_var;
        SubLObject position;
        for (end_var = (SubLObject)list_utilities.MINUS_ONE_INTEGER, position = (SubLObject)list_utilities.NIL, position = max; !position.numLE(end_var); position = Numbers.add(position, (SubLObject)list_utilities.MINUS_ONE_INTEGER)) {
            if (list_utilities.NIL != Functions.funcall(test, item, Functions.funcall(key, Sequences.elt(sequence, Numbers.add(start, position))))) {
                return position;
            }
        }
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 27689L)
    public static SubLObject tree_positions(final SubLObject item, final SubLObject tree, SubLObject test, SubLObject opaque_test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (opaque_test == list_utilities.UNPROVIDED) {
            opaque_test = (SubLObject)list_utilities.NIL;
        }
        if (tree.isAtom()) {
            return (SubLObject)list_utilities.NIL;
        }
        if (list_utilities.NIL != dotted_list_p(tree)) {
            return (SubLObject)list_utilities.NIL;
        }
        SubLObject positions = (SubLObject)list_utilities.NIL;
        SubLObject pos = (SubLObject)list_utilities.ZERO_INTEGER;
        SubLObject cdolist_list_var = tree;
        SubLObject subtree = (SubLObject)list_utilities.NIL;
        subtree = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            if (list_utilities.NIL != Functions.funcall(test, item, subtree)) {
                positions = (SubLObject)ConsesLow.cons(pos, positions);
            }
            else if (list_utilities.NIL == Symbols.fboundp(opaque_test) || list_utilities.NIL == Functions.funcall(opaque_test, subtree)) {
                if (subtree.isList()) {
                    SubLObject cdolist_list_var_$8 = tree_positions(item, subtree, test, (SubLObject)list_utilities.UNPROVIDED);
                    SubLObject position = (SubLObject)list_utilities.NIL;
                    position = cdolist_list_var_$8.first();
                    while (list_utilities.NIL != cdolist_list_var_$8) {
                        if (position.isList()) {
                            positions = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(pos, position), positions);
                        }
                        else {
                            positions = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(pos, position), positions);
                        }
                        cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                        position = cdolist_list_var_$8.first();
                    }
                }
            }
            pos = Numbers.add(pos, (SubLObject)list_utilities.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            subtree = cdolist_list_var.first();
        }
        return positions;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 28545L)
    public static SubLObject tree_positions_w_parents(final SubLObject item, final SubLObject tree, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (tree.isAtom()) {
            return (SubLObject)list_utilities.NIL;
        }
        if (list_utilities.NIL != dotted_list_p(tree)) {
            return (SubLObject)list_utilities.NIL;
        }
        SubLObject positions = (SubLObject)list_utilities.NIL;
        SubLObject pos = (SubLObject)list_utilities.ZERO_INTEGER;
        SubLObject root_nodes = (SubLObject)list_utilities.NIL;
        SubLObject node = (SubLObject)list_utilities.NIL;
        SubLObject cdolist_list_var = tree;
        SubLObject subtree = (SubLObject)list_utilities.NIL;
        subtree = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            if (list_utilities.NIL != Functions.funcall(test, item, subtree)) {
                positions = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(pos), positions);
                root_nodes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(node), root_nodes);
            }
            else if (subtree.isList()) {
                final SubLObject positions_nodes = tree_positions_w_parents(item, subtree, test);
                SubLObject cdolist_list_var_$9 = positions_nodes.first();
                SubLObject position = (SubLObject)list_utilities.NIL;
                position = cdolist_list_var_$9.first();
                while (list_utilities.NIL != cdolist_list_var_$9) {
                    if (position.isList()) {
                        positions = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(pos, position), positions);
                    }
                    else {
                        positions = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(pos, position), positions);
                    }
                    cdolist_list_var_$9 = cdolist_list_var_$9.rest();
                    position = cdolist_list_var_$9.first();
                }
                SubLObject cdolist_list_var_$10 = conses_high.second(positions_nodes);
                SubLObject nodes = (SubLObject)list_utilities.NIL;
                nodes = cdolist_list_var_$10.first();
                while (list_utilities.NIL != cdolist_list_var_$10) {
                    if (nodes.isList()) {
                        root_nodes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(node, nodes), root_nodes);
                    }
                    else {
                        root_nodes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(node, nodes), root_nodes);
                    }
                    cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                    nodes = cdolist_list_var_$10.first();
                }
            }
            pos = Numbers.add(pos, (SubLObject)list_utilities.ONE_INTEGER);
            if (tree.isList()) {
                node = tree.first();
            }
            else {
                node = tree;
            }
            cdolist_list_var = cdolist_list_var.rest();
            subtree = cdolist_list_var.first();
        }
        return (SubLObject)ConsesLow.list(positions, root_nodes);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 30117L)
    public static SubLObject difference_from_head(SubLObject list1, SubLObject list2) {
        SubLObject common_path = (SubLObject)list_utilities.NIL;
        while (list_utilities.NIL != list1 && list_utilities.NIL != list2) {
            final SubLObject item1 = list1.first();
            final SubLObject item2 = list2.first();
            if (!item1.equalp(item2)) {
                return (SubLObject)ConsesLow.list(Sequences.nreverse(common_path), list1, list2);
            }
            common_path = (SubLObject)ConsesLow.cons(item1, common_path);
            list1 = list1.rest();
            list2 = list2.rest();
        }
        return (SubLObject)ConsesLow.list(Sequences.nreverse(common_path), list2, list1);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 30908L)
    public static SubLObject tree_position_bfs(final SubLObject item, final SubLObject tree, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (tree.isCons()) {
            SubLObject pos = list_position(item, tree, test, (SubLObject)list_utilities.UNPROVIDED);
            if (list_utilities.NIL != pos) {
                return (SubLObject)ConsesLow.list(pos);
            }
            pos = (SubLObject)list_utilities.ZERO_INTEGER;
            SubLObject tree_pos = (SubLObject)list_utilities.NIL;
            SubLObject rest;
            SubLObject subtree;
            for (rest = (SubLObject)list_utilities.NIL, rest = tree; !rest.isAtom(); rest = rest.rest()) {
                subtree = rest.first();
                tree_pos = tree_position_bfs(item, subtree, test);
                if (list_utilities.NIL != tree_pos) {
                    return (SubLObject)ConsesLow.cons(pos, tree_pos);
                }
                pos = Numbers.add(pos, (SubLObject)list_utilities.ONE_INTEGER);
            }
        }
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 31667L)
    public static SubLObject tree_position_dfs(final SubLObject item, final SubLObject tree, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (tree.isCons()) {
            SubLObject pos = (SubLObject)list_utilities.ZERO_INTEGER;
            SubLObject tree_pos = (SubLObject)list_utilities.NIL;
            SubLObject rest;
            SubLObject subtree;
            for (rest = (SubLObject)list_utilities.NIL, rest = tree; !rest.isAtom(); rest = rest.rest()) {
                subtree = rest.first();
                if (list_utilities.NIL != Functions.funcall(test, item, subtree)) {
                    return (SubLObject)ConsesLow.list(pos);
                }
                tree_pos = tree_position_dfs(item, subtree, test);
                if (list_utilities.NIL != tree_pos) {
                    return (SubLObject)ConsesLow.cons(pos, tree_pos);
                }
                pos = Numbers.add(pos, (SubLObject)list_utilities.ONE_INTEGER);
            }
        }
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 32401L)
    public static SubLObject list_position(final SubLObject item, final SubLObject list, SubLObject test, SubLObject key) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        assert list_utilities.NIL != Types.listp(list) : list;
        if (list_utilities.NIL != non_dotted_list_p(list)) {
            return Sequences.position(item, list, test, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED);
        }
        SubLObject i = (SubLObject)list_utilities.ZERO_INTEGER;
        SubLObject rest;
        SubLObject subtree;
        for (rest = (SubLObject)list_utilities.NIL, rest = list; !rest.isAtom(); rest = rest.rest()) {
            subtree = rest.first();
            if (list_utilities.NIL != Functions.funcall(test, item, Functions.funcall(key, subtree))) {
                return i;
            }
            i = Numbers.add(i, (SubLObject)list_utilities.ONE_INTEGER);
        }
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 33073L)
    public static SubLObject tree_position_p(final SubLObject tree_position) {
        if (!tree_position.isList()) {
            return (SubLObject)list_utilities.NIL;
        }
        SubLObject cdolist_list_var = tree_position;
        SubLObject cur_atom = (SubLObject)list_utilities.NIL;
        cur_atom = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            if (!cur_atom.isInteger()) {
                return (SubLObject)list_utilities.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            cur_atom = cdolist_list_var.first();
        }
        return (SubLObject)list_utilities.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 33438L)
    public static SubLObject tree_nested_nths(final SubLObject positions, final SubLObject tree) {
        if (tree.isAtom()) {
            return (SubLObject)list_utilities.NIL;
        }
        if (list_utilities.NIL != dotted_list_p(tree)) {
            return (SubLObject)list_utilities.NIL;
        }
        SubLObject items = (SubLObject)list_utilities.NIL;
        SubLObject cdolist_list_var = positions;
        SubLObject sub_position = (SubLObject)list_utilities.NIL;
        sub_position = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            if (sub_position.isInteger()) {
                items = (SubLObject)ConsesLow.cons(ConsesLow.nth(sub_position, tree), items);
            }
            else if (sub_position.isList()) {
                items = ConsesLow.nconc(items, tree_nested_nths(sub_position.rest(), ConsesLow.nth(sub_position.first(), tree)));
            }
            cdolist_list_var = cdolist_list_var.rest();
            sub_position = cdolist_list_var.first();
        }
        return items;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 34301L)
    public static SubLObject tree_nths(final SubLObject positions, final SubLObject tree) {
        SubLObject items = (SubLObject)list_utilities.NIL;
        SubLObject cdolist_list_var = positions;
        SubLObject position = (SubLObject)list_utilities.NIL;
        position = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            items = (SubLObject)ConsesLow.cons(get_nested_nth(tree, (SubLObject)(position.isList() ? position : ConsesLow.list(position)), (SubLObject)list_utilities.UNPROVIDED), items);
            cdolist_list_var = cdolist_list_var.rest();
            position = cdolist_list_var.first();
        }
        return Sequences.nreverse(items);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 35011L)
    public static SubLObject has_nested_nth_p(final SubLObject v_object, final SubLObject where) {
        return Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)list_utilities.ONE_INTEGER), get_nested_nth(v_object, where, (SubLObject)list_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 35115L)
    public static SubLObject get_nested_nth(final SubLObject v_object, final SubLObject where, SubLObject v_default) {
        if (v_default == list_utilities.UNPROVIDED) {
            v_default = (SubLObject)list_utilities.NIL;
        }
        final SubLObject firstwhere = where.first();
        final SubLObject subwhere = where.rest();
        if (list_utilities.NIL == firstwhere) {
            return subl_promotions.values2(v_object, (SubLObject)list_utilities.T);
        }
        if (firstwhere.isInteger() && v_object.isList() && list_utilities.NIL != lengthG(v_object, firstwhere, (SubLObject)list_utilities.UNPROVIDED)) {
            final SubLObject target = ConsesLow.nth(firstwhere, v_object);
            return get_nested_nth(target, subwhere, (SubLObject)list_utilities.UNPROVIDED);
        }
        return subl_promotions.values2(v_default, (SubLObject)list_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 35845L)
    public static SubLObject replace_nested_nth(final SubLObject list, final SubLObject where, final SubLObject new_car) {
        return nreplace_nested_nth(conses_high.copy_tree(list), where, new_car);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 36025L)
    public static SubLObject nreplace_nested_nth(final SubLObject v_object, final SubLObject where, final SubLObject new_car) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (list_utilities.NIL != where) {
            thread.resetMultipleValues();
            final SubLObject new_obj = nreplace_nested_nth(ConsesLow.nth(where.first(), v_object), where.rest(), new_car);
            final SubLObject terminalP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (list_utilities.NIL != terminalP) {
                final SubLObject target = conses_high.nthcdr(where.first(), v_object);
                if (target.isCons()) {
                    ConsesLow.rplaca(target, new_car);
                }
            }
            return subl_promotions.values2(v_object, (SubLObject)list_utilities.NIL);
        }
        return subl_promotions.values2(v_object, Types.sublisp_null(where));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 36704L)
    public static SubLObject remove_nested_nth(final SubLObject list, final SubLObject where) {
        assert list_utilities.NIL != proper_list_p(list) : list;
        assert list_utilities.NIL != proper_list_p(where) : where;
        assert list_utilities.NIL != non_dotted_list_p(where) : where;
        SubLObject cdolist_list_var = where;
        SubLObject elem = (SubLObject)list_utilities.NIL;
        elem = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            assert list_utilities.NIL != subl_promotions.non_negative_integer_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        return delete_nested_nth_internal(conses_high.copy_tree(list), where);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 37026L)
    public static SubLObject delete_nested_nth(final SubLObject list, final SubLObject where) {
        assert list_utilities.NIL != proper_list_p(list) : list;
        assert list_utilities.NIL != proper_list_p(where) : where;
        assert list_utilities.NIL != non_dotted_list_p(where) : where;
        SubLObject cdolist_list_var = where;
        SubLObject elem = (SubLObject)list_utilities.NIL;
        elem = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            assert list_utilities.NIL != subl_promotions.non_negative_integer_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        return delete_nested_nth_internal(list, where);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 37335L)
    public static SubLObject delete_nested_nth_internal(final SubLObject list, final SubLObject where) {
        if (list_utilities.NIL != lengthG(where, (SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.UNPROVIDED)) {
            final SubLObject sublist = ConsesLow.nth(where.first(), list);
            final SubLObject new_sublist = delete_nested_nth_internal(sublist, where.rest());
            return nreplace_nth(where.first(), new_sublist, list);
        }
        return delete_nth(where.first(), list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 37640L)
    public static SubLObject tree_positions_int(final SubLObject item, final SubLObject tree, final SubLObject pos_function, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (item == list_utilities.$kw71$DELETED) {
            return (SubLObject)list_utilities.NIL;
        }
        if (list_utilities.NIL != Functions.funcall(test, item, tree)) {
            return (SubLObject)list_utilities.$list72;
        }
        final SubLObject temp_tree = conses_high.copy_tree(tree);
        SubLObject result = (SubLObject)list_utilities.$kw73$DUMMY;
        SubLObject positions = (SubLObject)list_utilities.NIL;
        while (list_utilities.NIL != result) {
            result = Functions.funcall(pos_function, item, temp_tree, test);
            if (list_utilities.NIL != result) {
                positions = (SubLObject)ConsesLow.cons(result, positions);
                nreplace_nested_nth(temp_tree, result, (SubLObject)list_utilities.$kw71$DELETED);
            }
        }
        return Sequences.nreverse(positions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 38165L)
    public static SubLObject tree_positions_dfs(final SubLObject item, final SubLObject tree, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        return tree_positions_int(item, tree, (SubLObject)list_utilities.$sym74$TREE_POSITION_DFS, test);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 38705L)
    public static SubLObject tree_positions_bfs(final SubLObject item, final SubLObject tree, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        return tree_positions_int(item, tree, (SubLObject)list_utilities.$sym75$TREE_POSITION_BFS, test);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 39255L)
    public static SubLObject containing_subtrees(final SubLObject item, final SubLObject tree) {
        final SubLObject paths = tree_positions(item, tree, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED);
        SubLObject containing_trees = (SubLObject)list_utilities.NIL;
        SubLObject cdolist_list_var = paths;
        SubLObject path = (SubLObject)list_utilities.NIL;
        path = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            containing_trees = (SubLObject)ConsesLow.cons(path.isInteger() ? tree : get_nested_nth(tree, conses_high.butlast(path, (SubLObject)list_utilities.UNPROVIDED), (SubLObject)list_utilities.UNPROVIDED), containing_trees);
            cdolist_list_var = cdolist_list_var.rest();
            path = cdolist_list_var.first();
        }
        return containing_trees;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 39527L)
    public static SubLObject tree_positions_if_dfs(final SubLObject test, final SubLObject tree, SubLObject key) {
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        return tree_positions_if_dfs_int(test, tree, key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 40126L)
    public static SubLObject tree_positions_if_bfs(final SubLObject test, final SubLObject tree, SubLObject key) {
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        return Sort.stable_sort(tree_positions_if_dfs_int(test, tree, key), Symbols.symbol_function((SubLObject)list_utilities.$sym76$LESSER_LENGTH_P), (SubLObject)list_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 40773L)
    public static SubLObject tree_positions_if_dfs_int(final SubLObject test, final SubLObject tree, SubLObject key) {
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        SubLObject ans = (SubLObject)list_utilities.NIL;
        SubLObject current_index = (SubLObject)list_utilities.ZERO_INTEGER;
        SubLObject rest;
        SubLObject subtree;
        SubLObject cdolist_list_var;
        SubLObject tree_pos;
        for (rest = (SubLObject)list_utilities.NIL, rest = tree; !rest.isAtom(); rest = rest.rest()) {
            subtree = rest.first();
            if (list_utilities.NIL != Functions.funcall(test, Functions.funcall(key, subtree))) {
                ans = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(current_index), ans);
            }
            cdolist_list_var = tree_positions_if_dfs_int(test, subtree, key);
            tree_pos = (SubLObject)list_utilities.NIL;
            tree_pos = cdolist_list_var.first();
            while (list_utilities.NIL != cdolist_list_var) {
                ans = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(current_index, tree_pos), ans);
                cdolist_list_var = cdolist_list_var.rest();
                tree_pos = cdolist_list_var.first();
            }
            current_index = Numbers.add(current_index, (SubLObject)list_utilities.ONE_INTEGER);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 41211L)
    public static SubLObject tree_position_if_bfs(final SubLObject test, final SubLObject tree, SubLObject key) {
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        return tree_positions_if_bfs(test, tree, key).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 41756L)
    public static SubLObject tree_position_if_dfs(final SubLObject test, final SubLObject tree, SubLObject key) {
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        if (tree.isCons()) {
            SubLObject pos = (SubLObject)list_utilities.ZERO_INTEGER;
            SubLObject tree_pos = (SubLObject)list_utilities.NIL;
            SubLObject rest;
            SubLObject subtree;
            for (rest = (SubLObject)list_utilities.NIL, rest = tree; !rest.isAtom(); rest = rest.rest()) {
                subtree = rest.first();
                if (list_utilities.NIL != Functions.funcall(test, Functions.funcall(key, subtree))) {
                    return (SubLObject)ConsesLow.list(pos);
                }
                tree_pos = tree_position_if_dfs(test, subtree, key);
                if (list_utilities.NIL != tree_pos) {
                    return (SubLObject)ConsesLow.cons(pos, tree_pos);
                }
                pos = Numbers.add(pos, (SubLObject)list_utilities.ONE_INTEGER);
            }
        }
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 42559L)
    public static SubLObject count_if_not(final SubLObject test, final SubLObject sequence, SubLObject key, SubLObject start, SubLObject end) {
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        if (start == list_utilities.UNPROVIDED) {
            start = (SubLObject)list_utilities.ZERO_INTEGER;
        }
        if (end == list_utilities.UNPROVIDED) {
            end = (SubLObject)list_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)list_utilities.NIL;
        final SubLObject _prev_bind_0 = list_utilities.$negated_test_func$.currentBinding(thread);
        try {
            list_utilities.$negated_test_func$.bind(test, thread);
            ans = Sequences.count_if((SubLObject)list_utilities.$sym66$NEGATED_TEST_FUNC, sequence, key, start, end);
        }
        finally {
            list_utilities.$negated_test_func$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 42926L)
    public static SubLObject subst_if_not(final SubLObject v_new, final SubLObject test, final SubLObject tree, SubLObject key) {
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)list_utilities.NIL;
        final SubLObject _prev_bind_0 = list_utilities.$negated_test_func$.currentBinding(thread);
        try {
            list_utilities.$negated_test_func$.bind(test, thread);
            ans = conses_high.subst_if(v_new, (SubLObject)list_utilities.$sym66$NEGATED_TEST_FUNC, tree, key);
        }
        finally {
            list_utilities.$negated_test_func$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 43154L)
    public static SubLObject nsubst_if_not(final SubLObject v_new, final SubLObject test, final SubLObject tree, SubLObject key) {
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)list_utilities.NIL;
        final SubLObject _prev_bind_0 = list_utilities.$negated_test_func$.currentBinding(thread);
        try {
            list_utilities.$negated_test_func$.bind(test, thread);
            ans = conses_high.nsubst_if(v_new, (SubLObject)list_utilities.$sym66$NEGATED_TEST_FUNC, tree, key);
        }
        finally {
            list_utilities.$negated_test_func$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 43385L)
    public static SubLObject member_if_not(final SubLObject test, final SubLObject list, SubLObject key) {
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)list_utilities.NIL;
        final SubLObject _prev_bind_0 = list_utilities.$negated_test_func$.currentBinding(thread);
        try {
            list_utilities.$negated_test_func$.bind(test, thread);
            ans = conses_high.member_if((SubLObject)list_utilities.$sym66$NEGATED_TEST_FUNC, list, key);
        }
        finally {
            list_utilities.$negated_test_func$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 43608L)
    public static SubLObject assoc_if_not(final SubLObject predicate, final SubLObject alist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)list_utilities.NIL;
        final SubLObject _prev_bind_0 = list_utilities.$negated_test_func$.currentBinding(thread);
        try {
            list_utilities.$negated_test_func$.bind(predicate, thread);
            ans = conses_high.assoc_if((SubLObject)list_utilities.$sym66$NEGATED_TEST_FUNC, alist);
        }
        finally {
            list_utilities.$negated_test_func$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 43809L)
    public static SubLObject rassoc_if_not(final SubLObject predicate, final SubLObject alist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)list_utilities.NIL;
        final SubLObject _prev_bind_0 = list_utilities.$negated_test_func$.currentBinding(thread);
        try {
            list_utilities.$negated_test_func$.bind(predicate, thread);
            ans = conses_high.rassoc_if((SubLObject)list_utilities.$sym66$NEGATED_TEST_FUNC, alist);
        }
        finally {
            list_utilities.$negated_test_func$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 44013L)
    public static SubLObject assoc_all(final SubLObject item, final SubLObject alist, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        SubLObject result = (SubLObject)list_utilities.NIL;
        SubLObject cdolist_list_var = alist;
        SubLObject pair = (SubLObject)list_utilities.NIL;
        pair = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            if (list_utilities.NIL != Functions.funcall(test, item, pair.first())) {
                result = (SubLObject)ConsesLow.cons(pair, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 44322L)
    public static SubLObject assoc_push(final SubLObject key, final SubLObject data, SubLObject alist, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        final SubLObject spot = conses_high.assoc(key, alist, test, (SubLObject)list_utilities.UNPROVIDED);
        if (list_utilities.NIL == spot) {
            alist = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(key, (SubLObject)ConsesLow.list(data)), alist);
        }
        else {
            ConsesLow.rplacd(spot, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons(data, spot.rest().first())));
        }
        return alist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 44898L)
    public static SubLObject assoc_pushnew(final SubLObject key, final SubLObject data, SubLObject alist, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        final SubLObject spot = conses_high.assoc(key, alist, test, (SubLObject)list_utilities.UNPROVIDED);
        if (list_utilities.NIL == spot) {
            alist = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(key, (SubLObject)ConsesLow.list(data)), alist);
        }
        else if (list_utilities.NIL == subl_promotions.memberP(data, spot.rest().first(), (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED)) {
            ConsesLow.rplacd(spot, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons(data, spot.rest().first())));
        }
        return alist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 45523L)
    public static SubLObject dotted_assoc_push(final SubLObject key, final SubLObject data, SubLObject alist, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        final SubLObject spot = conses_high.assoc(key, alist, test, (SubLObject)list_utilities.UNPROVIDED);
        if (list_utilities.NIL == spot) {
            alist = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(key, data), alist);
        }
        else {
            ConsesLow.rplacd(spot, (SubLObject)ConsesLow.cons(data, spot.rest()));
        }
        return alist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 46074L)
    public static SubLObject assoc_equal(final SubLObject alist1, final SubLObject alist2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(list_utilities.NIL != assoc_subsumedP(alist1, alist2, Symbols.symbol_function((SubLObject)list_utilities.EQL)) && list_utilities.NIL != assoc_subsumedP(alist2, alist1, Symbols.symbol_function((SubLObject)list_utilities.EQL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 46496L)
    public static SubLObject assoc_subsumedP(final SubLObject alist1, final SubLObject alist2, final SubLObject test) {
        SubLObject used_keys = (SubLObject)list_utilities.NIL;
        SubLObject cdolist_list_var = alist1;
        SubLObject cons = (SubLObject)list_utilities.NIL;
        cons = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject key = (SubLObject)list_utilities.NIL;
            SubLObject value1 = (SubLObject)list_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list77);
            key = current.first();
            current = (value1 = current.rest());
            if (list_utilities.NIL == subl_promotions.memberP(key, used_keys, test, (SubLObject)list_utilities.UNPROVIDED)) {
                used_keys = (SubLObject)ConsesLow.cons(key, used_keys);
                final SubLObject association = conses_high.assoc(key, alist2, test, (SubLObject)list_utilities.UNPROVIDED);
                if (list_utilities.NIL == association || (association.isCons() && !value1.equal(association.rest()))) {
                    return (SubLObject)list_utilities.NIL;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        return (SubLObject)list_utilities.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 46935L)
    public static SubLObject alist_extend(final SubLObject alist, final SubLObject list) {
        SubLObject full_alist = conses_high.copy_alist(alist);
        final SubLObject keys = alist_keys(alist);
        SubLObject cdolist_list_var = list;
        SubLObject elem = (SubLObject)list_utilities.NIL;
        elem = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            if (list_utilities.NIL == subl_promotions.memberP(elem, keys, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED)) {
                full_alist = alist_enter(full_alist, elem, elem, (SubLObject)list_utilities.UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        return full_alist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 47509L)
    public static SubLObject make_alist(final SubLObject list, SubLObject func) {
        if (func == list_utilities.UNPROVIDED) {
            func = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        SubLObject alist = (SubLObject)list_utilities.NIL;
        SubLObject cdolist_list_var = list;
        SubLObject item = (SubLObject)list_utilities.NIL;
        item = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            alist = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(item, func.eql(Symbols.symbol_function((SubLObject)list_utilities.IDENTITY)) ? item : Functions.funcall(func, item)), alist);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        }
        return Sequences.nreverse(alist);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 47901L)
    public static SubLObject make_alist_from_keys_and_values(final SubLObject keys, final SubLObject values) {
        if (list_utilities.NIL == same_length_p(keys, values)) {
            Errors.error((SubLObject)list_utilities.$str78$The_lists_of_keys_and_data_are_of);
        }
        SubLObject alist = (SubLObject)list_utilities.NIL;
        SubLObject key = (SubLObject)list_utilities.NIL;
        SubLObject key_$11 = (SubLObject)list_utilities.NIL;
        SubLObject value = (SubLObject)list_utilities.NIL;
        SubLObject value_$12 = (SubLObject)list_utilities.NIL;
        key = keys;
        key_$11 = key.first();
        value = values;
        value_$12 = value.first();
        while (list_utilities.NIL != value || list_utilities.NIL != key) {
            alist = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(key_$11, value_$12), alist);
            key = key.rest();
            key_$11 = key.first();
            value = value.rest();
            value_$12 = value.first();
        }
        return Sequences.nreverse(alist);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 48251L)
    public static SubLObject make_pair_list(final SubLObject list_1, final SubLObject list_2) {
        if (list_utilities.NIL == same_length_p(list_1, list_2)) {
            Errors.error((SubLObject)list_utilities.$str78$The_lists_of_keys_and_data_are_of);
        }
        SubLObject result = (SubLObject)list_utilities.NIL;
        SubLObject item_1 = (SubLObject)list_utilities.NIL;
        SubLObject item_1_$13 = (SubLObject)list_utilities.NIL;
        SubLObject item_2 = (SubLObject)list_utilities.NIL;
        SubLObject item_2_$14 = (SubLObject)list_utilities.NIL;
        item_1 = list_1;
        item_1_$13 = item_1.first();
        item_2 = list_2;
        item_2_$14 = item_2.first();
        while (list_utilities.NIL != item_2 || list_utilities.NIL != item_1) {
            result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(item_1_$13, item_2_$14), result);
            item_1 = item_1.rest();
            item_1_$13 = item_1.first();
            item_2 = item_2.rest();
            item_2_$14 = item_2.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 48825L)
    public static SubLObject make_paired_lists(final SubLObject pair_list) {
        assert list_utilities.NIL != non_dotted_list_p(pair_list) : pair_list;
        SubLObject cdolist_list_var = pair_list;
        SubLObject elem = (SubLObject)list_utilities.NIL;
        elem = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            assert list_utilities.NIL != doubletonP(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        SubLObject result1 = (SubLObject)list_utilities.NIL;
        SubLObject result2 = (SubLObject)list_utilities.NIL;
        SubLObject cdolist_list_var2 = pair_list;
        SubLObject pair = (SubLObject)list_utilities.NIL;
        pair = cdolist_list_var2.first();
        while (list_utilities.NIL != cdolist_list_var2) {
            result1 = (SubLObject)ConsesLow.cons(pair.first(), result1);
            result2 = (SubLObject)ConsesLow.cons(conses_high.second(pair), result2);
            cdolist_list_var2 = cdolist_list_var2.rest();
            pair = cdolist_list_var2.first();
        }
        return (SubLObject)ConsesLow.list(Sequences.nreverse(result1), Sequences.nreverse(result2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 49233L)
    public static SubLObject first_safe_for_atoms(final SubLObject list1) {
        if (list1.isAtom()) {
            return (SubLObject)list_utilities.NIL;
        }
        return list1.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 49556L)
    public static SubLObject first_of(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject thing_one = (SubLObject)list_utilities.NIL;
        SubLObject thing_two = (SubLObject)list_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list80);
        thing_one = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list80);
        thing_two = current.first();
        current = current.rest();
        if (list_utilities.NIL == current) {
            if (list_utilities.NIL == non_side_effecting_form_p(thing_one)) {
                Errors.warn((SubLObject)list_utilities.$str81$FIRST_OF_will_multiply_evaluate__, thing_one);
            }
            return (SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym82$FIF, thing_one, thing_one, thing_two);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)list_utilities.$list80);
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 49849L)
    public static SubLObject recons(final SubLObject car, final SubLObject cdr, final SubLObject cons) {
        if (cons.first().eql(car) && cons.rest().eql(cdr)) {
            return cons;
        }
        return (SubLObject)ConsesLow.cons(car, cdr);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 50119L)
    public static SubLObject ncons(final SubLObject car, final SubLObject cdr, final SubLObject cons) {
        if (!car.eql(cons.first())) {
            ConsesLow.rplaca(cons, car);
        }
        if (!cdr.eql(cons.rest())) {
            ConsesLow.rplacd(cons, cdr);
        }
        return cons;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 50375L)
    public static SubLObject delete_first(final SubLObject obj, final SubLObject sequence, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        return Sequences.delete(obj, sequence, test, Symbols.symbol_function((SubLObject)list_utilities.IDENTITY), (SubLObject)list_utilities.ZERO_INTEGER, (SubLObject)list_utilities.NIL, (SubLObject)list_utilities.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 50518L)
    public static SubLObject remove_first(final SubLObject obj, final SubLObject sequence, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        return Sequences.remove(obj, sequence, test, Symbols.symbol_function((SubLObject)list_utilities.IDENTITY), (SubLObject)list_utilities.ZERO_INTEGER, (SubLObject)list_utilities.NIL, (SubLObject)list_utilities.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 50661L)
    public static SubLObject remove_duplicates_equal(final SubLObject sequence, SubLObject key, SubLObject start, SubLObject end) {
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        if (start == list_utilities.UNPROVIDED) {
            start = (SubLObject)list_utilities.ZERO_INTEGER;
        }
        if (end == list_utilities.UNPROVIDED) {
            end = (SubLObject)list_utilities.NIL;
        }
        return Sequences.remove_duplicates(sequence, Symbols.symbol_function((SubLObject)list_utilities.EQUAL), key, start, end);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 50816L)
    public static SubLObject nmapcar(final SubLObject function, final SubLObject list) {
        SubLObject partial_list;
        for (partial_list = (SubLObject)list_utilities.NIL, partial_list = list; list_utilities.NIL != partial_list; partial_list = partial_list.rest()) {
            ConsesLow.rplaca(partial_list, Functions.funcall(function, partial_list.first()));
        }
        return list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 51142L)
    public static SubLObject mapcar_multiple(final SubLObject functions, final SubLObject list) {
        if (list_utilities.NIL == functions) {
            return list;
        }
        return Mapping.mapcar(functions.first(), mapcar_multiple(functions.rest(), list));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 51626L)
    public static SubLObject mapappend(final SubLObject function, final SubLObject list) {
        SubLObject ans = (SubLObject)list_utilities.NIL;
        SubLObject cdolist_list_var = list;
        SubLObject old = (SubLObject)list_utilities.NIL;
        old = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$15 = Functions.funcall(function, old);
            SubLObject v_new = (SubLObject)list_utilities.NIL;
            v_new = cdolist_list_var_$15.first();
            while (list_utilities.NIL != cdolist_list_var_$15) {
                ans = (SubLObject)ConsesLow.cons(v_new, ans);
                cdolist_list_var_$15 = cdolist_list_var_$15.rest();
                v_new = cdolist_list_var_$15.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            old = cdolist_list_var.first();
        }
        return Sequences.nreverse(ans);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 51789L)
    public static SubLObject mapunion(final SubLObject function, final SubLObject list, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        SubLObject ans = (SubLObject)list_utilities.NIL;
        SubLObject cdolist_list_var = list;
        SubLObject old = (SubLObject)list_utilities.NIL;
        old = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$16 = Functions.funcall(function, old);
            SubLObject v_new = (SubLObject)list_utilities.NIL;
            v_new = cdolist_list_var_$16.first();
            while (list_utilities.NIL != cdolist_list_var_$16) {
                final SubLObject item_var = v_new;
                if (list_utilities.NIL == conses_high.member(item_var, ans, test, Symbols.symbol_function((SubLObject)list_utilities.IDENTITY))) {
                    ans = (SubLObject)ConsesLow.cons(item_var, ans);
                }
                cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                v_new = cdolist_list_var_$16.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            old = cdolist_list_var.first();
        }
        return Sequences.nreverse(ans);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 52415L)
    public static SubLObject mapnunion(final SubLObject function, final SubLObject list, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        SubLObject ans = (SubLObject)list_utilities.NIL;
        SubLObject cdolist_list_var = list;
        SubLObject old = (SubLObject)list_utilities.NIL;
        old = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            ans = conses_high.nunion(Functions.funcall(function, old), ans, test, (SubLObject)list_utilities.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            old = cdolist_list_var.first();
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 52587L)
    public static SubLObject mapcar_product(final SubLObject function, final SubLObject list1, final SubLObject list2) {
        SubLObject ans = (SubLObject)list_utilities.NIL;
        if (list_utilities.NIL != list1 && list_utilities.NIL != list2) {
            SubLObject cdolist_list_var = list1;
            SubLObject item1 = (SubLObject)list_utilities.NIL;
            item1 = cdolist_list_var.first();
            while (list_utilities.NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$17 = list2;
                SubLObject item2 = (SubLObject)list_utilities.NIL;
                item2 = cdolist_list_var_$17.first();
                while (list_utilities.NIL != cdolist_list_var_$17) {
                    ans = (SubLObject)ConsesLow.cons(Functions.funcall(function, item1, item2), ans);
                    cdolist_list_var_$17 = cdolist_list_var_$17.rest();
                    item2 = cdolist_list_var_$17.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                item1 = cdolist_list_var.first();
            }
        }
        return Sequences.nreverse(ans);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 52807L)
    public static SubLObject mapcar_unique(final SubLObject function, final SubLObject list, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        assert list_utilities.NIL != Types.function_spec_p(function) : function;
        assert list_utilities.NIL != Types.listp(list) : list;
        if (list_utilities.NIL == list) {
            return (SubLObject)list_utilities.NIL;
        }
        if (list_utilities.NIL != singletonP(list)) {
            return (SubLObject)ConsesLow.make_list((SubLObject)list_utilities.ONE_INTEGER, Functions.funcall(function, list.first()));
        }
        final SubLObject seen_set = set.new_set(test, (SubLObject)list_utilities.UNPROVIDED);
        SubLObject answers = (SubLObject)list_utilities.NIL;
        SubLObject cdolist_list_var = list;
        SubLObject element = (SubLObject)list_utilities.NIL;
        element = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            final SubLObject v_answer = Functions.funcall(function, element);
            if (list_utilities.NIL == set.set_memberP(v_answer, seen_set)) {
                set.set_add(v_answer, seen_set);
                answers = (SubLObject)ConsesLow.cons(v_answer, answers);
            }
            cdolist_list_var = cdolist_list_var.rest();
            element = cdolist_list_var.first();
        }
        set.clear_set(seen_set);
        return Sequences.nreverse(answers);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 53561L)
    public static SubLObject last1(final SubLObject list) {
        SubLObject rest;
        SubLObject next;
        for (rest = (SubLObject)list_utilities.NIL, next = (SubLObject)list_utilities.NIL, rest = list, next = rest.rest(); !next.isAtom(); next = rest.rest()) {
            rest = next;
        }
        return rest;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 53823L)
    public static SubLObject add_to_end(final SubLObject item, final SubLObject list) {
        return ConsesLow.append(list, (SubLObject)ConsesLow.list(item));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 53953L)
    public static SubLObject nadd_to_end(final SubLObject item, SubLObject list) {
        final SubLObject new_last_cons = (SubLObject)ConsesLow.cons(item, (SubLObject)list_utilities.NIL);
        if (list_utilities.NIL != list) {
            final SubLObject old_last_cons = last1(list);
            ConsesLow.rplacd(old_last_cons, new_last_cons);
        }
        else {
            list = new_last_cons;
        }
        return list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 54288L)
    public static SubLObject adjoin_to_end(final SubLObject item, final SubLObject list, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (list_utilities.NIL != subl_promotions.memberP(item, list, test, (SubLObject)list_utilities.UNPROVIDED)) {
            return list;
        }
        return add_to_end(item, list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 54441L)
    public static SubLObject nadjoin_to_end(final SubLObject item, final SubLObject list, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (list_utilities.NIL != subl_promotions.memberP(item, list, test, (SubLObject)list_utilities.UNPROVIDED)) {
            return list;
        }
        return nadd_to_end(item, list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 54589L)
    public static SubLObject add_to_end_if(final SubLObject item, final SubLObject list) {
        if (list_utilities.NIL != item) {
            return add_to_end(item, list);
        }
        return list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 54692L)
    public static SubLObject nadd_to_end_if(final SubLObject item, final SubLObject list) {
        if (list_utilities.NIL != item) {
            return nadd_to_end(item, list);
        }
        return list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 54797L)
    public static SubLObject nth_from_end(final SubLObject n, final SubLObject list) {
        final SubLObject len = Sequences.length(list);
        final SubLObject i = number_utilities.f_1_(Numbers.subtract(len, n));
        return (SubLObject)((list_utilities.NIL != subl_promotions.non_negative_integer_p(i)) ? ConsesLow.nth(i, list) : list_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 54946L)
    public static SubLObject remove_from_end(final SubLObject item, final SubLObject seq, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        return Sequences.nreverse(Sequences.delete(item, Sequences.reverse(seq), test, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 55058L)
    public static SubLObject remove_objects_from_list(final SubLObject objs_to_remove, SubLObject list, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        SubLObject cdolist_list_var = objs_to_remove;
        SubLObject obj = (SubLObject)list_utilities.NIL;
        obj = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            list = Sequences.remove(obj, list, test, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            obj = cdolist_list_var.first();
        }
        return list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 55224L)
    public static SubLObject partition_list(final SubLObject list, final SubLObject func) {
        SubLObject head = (SubLObject)list_utilities.NIL;
        SubLObject tail = (SubLObject)list_utilities.NIL;
        SubLObject cdolist_list_var = list;
        SubLObject elem = (SubLObject)list_utilities.NIL;
        elem = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            if (list_utilities.NIL != Functions.funcall(func, elem)) {
                head = (SubLObject)ConsesLow.cons(elem, head);
            }
            else {
                tail = (SubLObject)ConsesLow.cons(elem, tail);
            }
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        return subl_promotions.values2(Sequences.nreverse(head), Sequences.nreverse(tail));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 55600L)
    public static SubLObject npartition_list(final SubLObject list, final SubLObject func) {
        final SubLObject head = remove_if_not(func, list, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED);
        if (list_utilities.NIL == head) {
            return subl_promotions.values2((SubLObject)list_utilities.NIL, list);
        }
        final SubLObject tail = Sequences.delete_if(func, list, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED);
        return subl_promotions.values2(head, tail);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 55928L)
    public static SubLObject partition_list_by_equality(final SubLObject list, final SubLObject test_item, SubLObject test, SubLObject key) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        SubLObject equal_list = (SubLObject)list_utilities.NIL;
        SubLObject unequal_list = (SubLObject)list_utilities.NIL;
        SubLObject cdolist_list_var = list;
        SubLObject elem = (SubLObject)list_utilities.NIL;
        elem = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            if (list_utilities.NIL != Functions.funcall(test, test_item, Functions.funcall(key, elem))) {
                equal_list = (SubLObject)ConsesLow.cons(elem, equal_list);
            }
            else {
                unequal_list = (SubLObject)ConsesLow.cons(elem, unequal_list);
            }
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        return subl_promotions.values2(Sequences.nreverse(equal_list), Sequences.nreverse(unequal_list));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 56668L)
    public static SubLObject partition_list_n_ways(final SubLObject list, final SubLObject n) {
        assert list_utilities.NIL != subl_promotions.positive_integer_p(n) : n;
        final SubLObject result = (SubLObject)ConsesLow.make_list(n, (SubLObject)list_utilities.UNPROVIDED);
        SubLObject i = (SubLObject)list_utilities.ZERO_INTEGER;
        SubLObject cdolist_list_var = list;
        SubLObject elem = (SubLObject)list_utilities.NIL;
        elem = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            ConsesLow.set_nth(i, result, (SubLObject)ConsesLow.cons(elem, ConsesLow.nth(i, result)));
            i = Numbers.add(i, (SubLObject)list_utilities.ONE_INTEGER);
            if (i.numGE(n)) {
                i = (SubLObject)list_utilities.ZERO_INTEGER;
            }
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        return Mapping.mapcar((SubLObject)list_utilities.$sym85$NREVERSE, result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 57087L)
    public static SubLObject randomly_partition_list_n_ways(final SubLObject list, final SubLObject n) {
        return partition_list_n_ways(randomize_list(list), n);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 57388L)
    public static SubLObject split_list(final SubLObject list, final SubLObject n) {
        final SubLObject rest = conses_high.nthcdr(n, list);
        final SubLObject first_n = conses_high.ldiff(list, rest);
        return subl_promotions.values2(first_n, rest);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 57659L)
    public static SubLObject random_element(final SubLObject list) {
        assert list_utilities.NIL != Types.listp(list) : list;
        if (list_utilities.NIL == list) {
            return (SubLObject)list_utilities.NIL;
        }
        return ConsesLow.nth(random.random(Sequences.length(list)), list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 57802L)
    public static SubLObject random_aref(final SubLObject vector) {
        assert list_utilities.NIL != Types.vectorp(vector) : vector;
        return Vectors.aref(vector, random.random(Sequences.length(vector)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 57917L)
    public static SubLObject random_n(final SubLObject n, final SubLObject list) {
        final SubLObject length = Sequences.length(list);
        if (n.numG(length)) {
            return randomize_list(list);
        }
        if (number_utilities.f_2X(n).numG(length)) {
            final SubLObject ans = random_remove_n(Numbers.subtract(length, n), list);
            return randomize_list(ans);
        }
        SubLObject ans = (SubLObject)list_utilities.NIL;
        SubLObject n_$18;
        SubLObject item;
        for (SubLObject remaining_candidates = conses_high.copy_list(list); list_utilities.NIL != remaining_candidates && list_utilities.NIL == lengthGE(ans, n, (SubLObject)list_utilities.UNPROVIDED); ans = (SubLObject)ConsesLow.cons(item, ans), remaining_candidates = delete_nth(n_$18, remaining_candidates)) {
            n_$18 = random.random(Sequences.length(remaining_candidates));
            item = ConsesLow.nth(n_$18, remaining_candidates);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 58845L)
    public static SubLObject random_remove_n(final SubLObject n, final SubLObject list) {
        SubLObject remaining_candidates = conses_high.copy_list(list);
        SubLObject i;
        for (i = (SubLObject)list_utilities.NIL, i = (SubLObject)list_utilities.ZERO_INTEGER; i.numL(n); i = Numbers.add(i, (SubLObject)list_utilities.ONE_INTEGER)) {
            remaining_candidates = random_delete(remaining_candidates);
        }
        return remaining_candidates;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 59126L)
    public static SubLObject random_delete(final SubLObject list) {
        final SubLObject n = random.random(Sequences.length(list));
        final SubLObject deleted = ConsesLow.nth(n, list);
        return subl_promotions.values2(delete_nth(n, list), deleted);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 59329L)
    public static SubLObject randomize_list(final SubLObject list) {
        return vector_utilities.vector_elements(randomize_vector(list2vector(list)), (SubLObject)list_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 59561L)
    public static SubLObject randomize_vector(final SubLObject vector) {
        final SubLObject len = Sequences.length(vector);
        if (len.numLE((SubLObject)list_utilities.ONE_INTEGER)) {
            return vector;
        }
        final SubLObject random_vector = Vectors.make_vector(len, (SubLObject)list_utilities.UNPROVIDED);
        return randomize_vector_int(vector, random_vector, (SubLObject)list_utilities.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 59909L)
    public static SubLObject randomize_vector_int(final SubLObject vector, final SubLObject random_vector, final SubLObject offset) {
        final SubLObject length = Sequences.length(vector);
        final SubLObject target_length = Numbers.integerDivide(length, (SubLObject)list_utilities.TWO_INTEGER);
        final SubLObject done_vector = Vectors.make_vector(length, (SubLObject)list_utilities.UNPROVIDED);
        SubLObject i = (SubLObject)list_utilities.ZERO_INTEGER;
        SubLObject doneP = (SubLObject)list_utilities.NIL;
        while (list_utilities.NIL == doneP) {
            final SubLObject rand = random.random(length);
            if (list_utilities.NIL == Vectors.aref(done_vector, rand)) {
                Vectors.set_aref(random_vector, Numbers.add(i, offset), Vectors.aref(vector, rand));
                Vectors.set_aref(done_vector, rand, (SubLObject)list_utilities.T);
                i = Numbers.add(i, (SubLObject)list_utilities.ONE_INTEGER);
                if (length.numL((SubLObject)list_utilities.TEN_INTEGER)) {
                    if (i.numE(length)) {
                        return random_vector;
                    }
                    continue;
                }
                else {
                    if (!i.numE(target_length)) {
                        continue;
                    }
                    doneP = (SubLObject)list_utilities.T;
                }
            }
        }
        final SubLObject recursive_length = Numbers.subtract(length, target_length);
        final SubLObject recursive_vector = Vectors.make_vector(recursive_length, (SubLObject)list_utilities.UNPROVIDED);
        SubLObject j = (SubLObject)list_utilities.ZERO_INTEGER;
        final SubLObject backwardP_var = (SubLObject)list_utilities.NIL;
        SubLObject length_$19;
        SubLObject v_iteration;
        SubLObject i_$20;
        SubLObject elem;
        for (length_$19 = Sequences.length(vector), v_iteration = (SubLObject)list_utilities.NIL, v_iteration = (SubLObject)list_utilities.ZERO_INTEGER; v_iteration.numL(length_$19); v_iteration = Numbers.add(v_iteration, (SubLObject)list_utilities.ONE_INTEGER)) {
            i_$20 = ((list_utilities.NIL != backwardP_var) ? Numbers.subtract(length_$19, v_iteration, (SubLObject)list_utilities.ONE_INTEGER) : v_iteration);
            elem = Vectors.aref(vector, i_$20);
            if (list_utilities.NIL == Vectors.aref(done_vector, i_$20)) {
                Vectors.set_aref(recursive_vector, j, elem);
                j = Numbers.add(j, (SubLObject)list_utilities.ONE_INTEGER);
            }
        }
        return randomize_vector_int(recursive_vector, random_vector, Numbers.add(offset, target_length));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 61514L)
    public static SubLObject random_compare(final SubLObject obj1, final SubLObject obj2) {
        return Equality.eq((SubLObject)list_utilities.ZERO_INTEGER, random.random((SubLObject)list_utilities.TWO_INTEGER));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 61692L)
    public static SubLObject thirdL(final SubLObject list1, final SubLObject list2) {
        final SubLObject num1 = conses_high.third(list1);
        final SubLObject num2 = conses_high.third(list2);
        if (num1.isNumber() && num2.isNumber()) {
            return Numbers.numL(num1, num2);
        }
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 61999L)
    public static SubLObject gather_all(final SubLObject item, final SubLObject seq, SubLObject test, SubLObject key) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        SubLObject v_answer = (SubLObject)list_utilities.NIL;
        for (SubLObject sequence_var = seq, end_index = (SubLObject)(sequence_var.isList() ? list_utilities.NIL : Sequences.length(sequence_var)), element_num = (SubLObject)list_utilities.ZERO_INTEGER, sequence_doneP = subl_macros.do_sequence_index_doneP(element_num, end_index, sequence_var); list_utilities.NIL == sequence_doneP; sequence_doneP = subl_macros.do_sequence_index_doneP(element_num, end_index, sequence_var)) {
            final SubLObject elt = subl_macros.do_sequence_index_valueP(element_num, sequence_var);
            if (list_utilities.NIL != Functions.funcall(test, item, Functions.funcall(key, elt))) {
                v_answer = (SubLObject)ConsesLow.cons(elt, v_answer);
            }
            sequence_var = subl_macros.do_sequence_index_update(sequence_var);
            element_num = Numbers.add(element_num, (SubLObject)list_utilities.ONE_INTEGER);
        }
        return Sequences.nreverse(v_answer);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 62289L)
    public static SubLObject find_all(final SubLObject item, final SubLObject seq, SubLObject test, SubLObject key) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        SubLObject v_answer = (SubLObject)list_utilities.NIL;
        for (SubLObject sequence_var = seq, end_index = (SubLObject)(sequence_var.isList() ? list_utilities.NIL : Sequences.length(sequence_var)), element_num = (SubLObject)list_utilities.ZERO_INTEGER, sequence_doneP = subl_macros.do_sequence_index_doneP(element_num, end_index, sequence_var); list_utilities.NIL == sequence_doneP; sequence_doneP = subl_macros.do_sequence_index_doneP(element_num, end_index, sequence_var)) {
            final SubLObject elt = subl_macros.do_sequence_index_valueP(element_num, sequence_var);
            if (list_utilities.NIL != Functions.funcall(test, Functions.funcall(key, elt), item)) {
                v_answer = (SubLObject)ConsesLow.cons(elt, v_answer);
            }
            sequence_var = subl_macros.do_sequence_index_update(sequence_var);
            element_num = Numbers.add(element_num, (SubLObject)list_utilities.ONE_INTEGER);
        }
        return Sequences.nreverse(v_answer);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 62602L)
    public static SubLObject find_all_if(final SubLObject test, final SubLObject seq, SubLObject key) {
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        SubLObject v_answer = (SubLObject)list_utilities.NIL;
        for (SubLObject sequence_var = seq, end_index = (SubLObject)(sequence_var.isList() ? list_utilities.NIL : Sequences.length(sequence_var)), element_num = (SubLObject)list_utilities.ZERO_INTEGER, sequence_doneP = subl_macros.do_sequence_index_doneP(element_num, end_index, sequence_var); list_utilities.NIL == sequence_doneP; sequence_doneP = subl_macros.do_sequence_index_doneP(element_num, end_index, sequence_var)) {
            final SubLObject elt = subl_macros.do_sequence_index_valueP(element_num, sequence_var);
            if (list_utilities.NIL != Functions.funcall(test, Functions.funcall(key, elt))) {
                v_answer = (SubLObject)ConsesLow.cons(elt, v_answer);
            }
            sequence_var = subl_macros.do_sequence_index_update(sequence_var);
            element_num = Numbers.add(element_num, (SubLObject)list_utilities.ONE_INTEGER);
        }
        return Sequences.nreverse(v_answer);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 62810L)
    public static SubLObject find_all_if_not(final SubLObject test, final SubLObject seq, SubLObject key) {
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        SubLObject v_answer = (SubLObject)list_utilities.NIL;
        for (SubLObject sequence_var = seq, end_index = (SubLObject)(sequence_var.isList() ? list_utilities.NIL : Sequences.length(sequence_var)), element_num = (SubLObject)list_utilities.ZERO_INTEGER, sequence_doneP = subl_macros.do_sequence_index_doneP(element_num, end_index, sequence_var); list_utilities.NIL == sequence_doneP; sequence_doneP = subl_macros.do_sequence_index_doneP(element_num, end_index, sequence_var)) {
            final SubLObject elt = subl_macros.do_sequence_index_valueP(element_num, sequence_var);
            if (list_utilities.NIL == Functions.funcall(test, Functions.funcall(key, elt))) {
                v_answer = (SubLObject)ConsesLow.cons(elt, v_answer);
            }
            sequence_var = subl_macros.do_sequence_index_update(sequence_var);
            element_num = Numbers.add(element_num, (SubLObject)list_utilities.ONE_INTEGER);
        }
        return Sequences.nreverse(v_answer);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 63024L)
    public static SubLObject all_positions(final SubLObject item, final SubLObject seq, SubLObject test, SubLObject key, SubLObject start) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        if (start == list_utilities.UNPROVIDED) {
            start = (SubLObject)list_utilities.ZERO_INTEGER;
        }
        SubLObject result = (SubLObject)list_utilities.NIL;
        while (list_utilities.NIL != start) {
            final SubLObject next_position = Sequences.position(item, seq, test, key, start, (SubLObject)list_utilities.UNPROVIDED);
            if (list_utilities.NIL != next_position) {
                result = (SubLObject)ConsesLow.cons(next_position, result);
                start = number_utilities.f_1X(next_position);
            }
            else {
                start = (SubLObject)list_utilities.NIL;
            }
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 63385L)
    public static SubLObject only_one(final SubLObject list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (list_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && list_utilities.NIL == singletonP(list)) {
            Errors.error((SubLObject)list_utilities.$str87$_s_was_not_a_singleton, list);
        }
        return list.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 63498L)
    public static SubLObject last_one(final SubLObject list) {
        return conses_high.last(list, (SubLObject)list_utilities.UNPROVIDED).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 63550L)
    public static SubLObject penultimate_one(final SubLObject list) {
        if (list_utilities.NIL != list.rest()) {
            return ConsesLow.nth(Numbers.subtract(Sequences.length(list), (SubLObject)list_utilities.TWO_INTEGER), list);
        }
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 63645L)
    public static SubLObject cons_if(final SubLObject thing, final SubLObject list) {
        if (list_utilities.NIL != thing) {
            return (SubLObject)ConsesLow.cons(thing, list);
        }
        return list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 63739L)
    public static SubLObject list_if(final SubLObject v_object) {
        if (list_utilities.NIL != v_object) {
            return (SubLObject)ConsesLow.list(v_object);
        }
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 63803L)
    public static SubLObject adjoin_if(final SubLObject item, final SubLObject list, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (list_utilities.NIL != item) {
            return conses_high.adjoin(item, list, test, (SubLObject)list_utilities.UNPROVIDED);
        }
        return list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 63926L)
    public static SubLObject flatten(final SubLObject tree) {
        SubLObject stack = (SubLObject)ConsesLow.list(tree);
        SubLObject temp = (SubLObject)list_utilities.NIL;
        SubLObject accumulator = (SubLObject)list_utilities.NIL;
        while (list_utilities.NIL != stack) {
            temp = stack.first();
            stack = stack.rest();
            if (temp.isAtom()) {
                if (list_utilities.NIL == temp) {
                    continue;
                }
                accumulator = (SubLObject)ConsesLow.cons(temp, accumulator);
            }
            else {
                if (list_utilities.NIL != temp.rest()) {
                    stack = (SubLObject)ConsesLow.cons(temp.rest(), stack);
                }
                stack = (SubLObject)ConsesLow.cons(temp.first(), stack);
            }
        }
        return Sequences.nreverse(accumulator);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 64420L)
    public static SubLObject insert_between_each(final SubLObject list, final SubLObject v_object) {
        if (list_utilities.NIL == list) {
            return list;
        }
        SubLObject ans = (SubLObject)ConsesLow.list(list.first());
        SubLObject cdolist_list_var = list.rest();
        SubLObject item = (SubLObject)list_utilities.NIL;
        item = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            ans = (SubLObject)ConsesLow.cons(v_object, ans);
            ans = (SubLObject)ConsesLow.cons(item, ans);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        }
        return Sequences.nreverse(ans);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 64642L)
    public static SubLObject safe_nth(final SubLObject n, final SubLObject list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)list_utilities.NIL;
        SubLObject ignore_errors_tag = (SubLObject)list_utilities.NIL;
        try {
            thread.throwStack.push(list_utilities.$kw88$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)list_utilities.$sym89$IGNORE_ERRORS_HANDLER), thread);
                try {
                    result = ConsesLow.nth(n, list);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)list_utilities.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)list_utilities.$kw88$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 64836L)
    public static SubLObject nths(final SubLObject positions_list, final SubLObject list) {
        assert list_utilities.NIL != Types.listp(positions_list) : positions_list;
        assert list_utilities.NIL != Types.listp(list) : list;
        SubLObject result = (SubLObject)list_utilities.NIL;
        SubLObject cdolist_list_var = positions_list;
        SubLObject position = (SubLObject)list_utilities.NIL;
        position = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            result = (SubLObject)ConsesLow.cons(ConsesLow.nth(position, list), result);
            cdolist_list_var = cdolist_list_var.rest();
            position = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 65139L)
    public static SubLObject every_nth(final SubLObject n, final SubLObject list) {
        SubLObject result = (SubLObject)list_utilities.NIL;
        SubLObject i = (SubLObject)list_utilities.ZERO_INTEGER;
        SubLObject cdolist_list_var = list;
        SubLObject elem = (SubLObject)list_utilities.NIL;
        elem = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            if (i.numE(n)) {
                i = (SubLObject)list_utilities.ZERO_INTEGER;
            }
            if (i.isZero()) {
                result = (SubLObject)ConsesLow.cons(elem, result);
            }
            i = Numbers.add(i, (SubLObject)list_utilities.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 65500L)
    public static SubLObject first_n(final SubLObject n, final SubLObject list) {
        return conses_high.ldiff(list, conses_high.nthcdr(n, list));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 65604L)
    public static SubLObject first_n_percent(final SubLObject percentage, final SubLObject list) {
        final SubLObject length = Sequences.length(list);
        final SubLObject n = Numbers.round(Numbers.multiply(length, percentage, (SubLObject)list_utilities.$float90$0_01), (SubLObject)list_utilities.UNPROVIDED);
        return first_n(n, list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 65756L)
    public static SubLObject first_n_if(final SubLObject n, final SubLObject test, final SubLObject list, SubLObject key) {
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        SubLObject result = (SubLObject)list_utilities.NIL;
        SubLObject index;
        SubLObject rest;
        SubLObject item;
        for (index = (SubLObject)list_utilities.ZERO_INTEGER, rest = (SubLObject)list_utilities.NIL, rest = list; !index.numGE(n) && list_utilities.NIL != rest; rest = rest.rest()) {
            item = rest.first();
            if (list_utilities.NIL != Functions.funcall(test, Functions.funcall(key, item))) {
                index = Numbers.add(index, (SubLObject)list_utilities.ONE_INTEGER);
                result = (SubLObject)ConsesLow.cons(item, result);
            }
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 66189L)
    public static SubLObject first_2(final SubLObject list) {
        return first_n((SubLObject)list_utilities.TWO_INTEGER, list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 66246L)
    public static SubLObject first_10(final SubLObject list) {
        return first_n((SubLObject)list_utilities.TEN_INTEGER, list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 66305L)
    public static SubLObject last_n(final SubLObject n, final SubLObject list) {
        if (list_utilities.NIL != lengthL(list, n, (SubLObject)list_utilities.UNPROVIDED)) {
            return list;
        }
        final SubLObject starting_point = Numbers.subtract(Sequences.length(list), n);
        return conses_high.nthcdr(starting_point, list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 66499L)
    public static SubLObject nth_chunk_of_k(final SubLObject list, final SubLObject n, final SubLObject k) {
        return first_n(k, conses_high.nthcdr(Numbers.multiply(n, k), list));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 66636L)
    public static SubLObject delete_nth(final SubLObject n, final SubLObject list) {
        assert list_utilities.NIL != Types.integerp(n) : n;
        assert list_utilities.NIL != Types.listp(list) : list;
        if (n.numE((SubLObject)list_utilities.ZERO_INTEGER)) {
            return list.rest();
        }
        final SubLObject sublist = conses_high.nthcdr(number_utilities.f_1_(n), list);
        if (sublist.isCons()) {
            ConsesLow.rplacd(sublist, conses_high.cddr(sublist));
        }
        return list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 66912L)
    public static SubLObject remove_nth(final SubLObject n, final SubLObject list) {
        return delete_nth(n, conses_high.copy_list(list));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 67014L)
    public static SubLObject remove_last(final SubLObject list) {
        return remove_nth(Numbers.subtract(Sequences.length(list), (SubLObject)list_utilities.ONE_INTEGER), list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 67200L)
    public static SubLObject remove_nths(final SubLObject positions_list, final SubLObject list) {
        assert list_utilities.NIL != Types.listp(positions_list) : positions_list;
        assert list_utilities.NIL != Types.listp(list) : list;
        SubLObject result = list;
        SubLObject cdolist_list_var = positions_list;
        SubLObject position = (SubLObject)list_utilities.NIL;
        position = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            result = remove_nth(position, result);
            cdolist_list_var = cdolist_list_var.rest();
            position = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 67508L)
    public static SubLObject nreplace_last(final SubLObject list, final SubLObject v_new) {
        return nreplace_nth(number_utilities.f_1_(Sequences.length(list)), v_new, list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 67658L)
    public static SubLObject nreplace_nth(final SubLObject n, final SubLObject v_new, final SubLObject list) {
        assert list_utilities.NIL != Types.integerp(n) : n;
        assert list_utilities.NIL != Types.listp(list) : list;
        if (n.numL((SubLObject)list_utilities.ZERO_INTEGER)) {
            return list;
        }
        if (n.numG(Numbers.subtract(Sequences.length(list), (SubLObject)list_utilities.ONE_INTEGER))) {
            return list;
        }
        final SubLObject sublist = conses_high.nthcdr(n, list);
        if (sublist.isCons()) {
            ConsesLow.rplaca(sublist, v_new);
        }
        return list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 68031L)
    public static SubLObject find_and_replace(final SubLObject old, final SubLObject v_new, final SubLObject list, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQ);
        }
        return (list_utilities.NIL != Sequences.find(old, list, test, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED)) ? find_and_nreplace(old, v_new, conses_high.copy_list(list), test) : list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 68299L)
    public static SubLObject find_and_nreplace(final SubLObject old, final SubLObject v_new, final SubLObject list, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQ);
        }
        SubLObject cons;
        for (cons = (SubLObject)list_utilities.NIL, cons = list; !cons.isAtom(); cons = cons.rest()) {
            if (list_utilities.NIL != Functions.funcall(test, cons.first(), old)) {
                ConsesLow.rplaca(cons, v_new);
            }
        }
        return list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 68567L)
    public static SubLObject find_first_and_nreplace(final SubLObject old, final SubLObject v_new, final SubLObject list, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQ);
        }
        SubLObject cons;
        for (cons = (SubLObject)list_utilities.NIL, cons = list; !cons.isAtom(); cons = cons.rest()) {
            if (list_utilities.NIL != Functions.funcall(test, cons.first(), old)) {
                ConsesLow.rplaca(cons, v_new);
                return list;
            }
        }
        return list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 68861L)
    public static SubLObject ncollapse_n_from_pos(final SubLObject n, final SubLObject pos, final SubLObject v_new, final SubLObject list) {
        assert list_utilities.NIL != Types.integerp(pos) : pos;
        assert list_utilities.NIL != Types.integerp(n) : n;
        assert list_utilities.NIL != Types.listp(list) : list;
        if (Numbers.add(pos, n).numL((SubLObject)list_utilities.ZERO_INTEGER)) {
            return list;
        }
        if (pos.numG(Numbers.subtract(Sequences.length(list), (SubLObject)list_utilities.ONE_INTEGER))) {
            return list;
        }
        final SubLObject sublist = conses_high.nthcdr(Numbers.max(pos, (SubLObject)list_utilities.ZERO_INTEGER), list);
        if (sublist.isCons()) {
            ConsesLow.rplaca(sublist, v_new);
        }
        SubLObject cdotimes_end_var;
        SubLObject count;
        for (cdotimes_end_var = Numbers.subtract(n, Numbers.add((SubLObject)list_utilities.ONE_INTEGER, Numbers.max(Numbers.minus(pos), (SubLObject)list_utilities.ZERO_INTEGER))), count = (SubLObject)list_utilities.NIL, count = (SubLObject)list_utilities.ZERO_INTEGER; count.numL(cdotimes_end_var); count = Numbers.add(count, (SubLObject)list_utilities.ONE_INTEGER)) {
            delete_nth(Numbers.add(pos, (SubLObject)list_utilities.ONE_INTEGER, Numbers.max(Numbers.minus(pos), (SubLObject)list_utilities.ZERO_INTEGER)), list);
        }
        return list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 69707L)
    public static SubLObject ninsert_by_position(final SubLObject item, final SubLObject list, SubLObject position) {
        assert list_utilities.NIL != Types.integerp(position) : position;
        assert list_utilities.NIL != Types.listp(list) : list;
        final SubLObject list_length = Sequences.length(list);
        SubLObject sublist = (SubLObject)list_utilities.NIL;
        SubLObject insertion_point_on = (SubLObject)list_utilities.NIL;
        if (position.numG(list_length) || position.numL((SubLObject)list_utilities.ZERO_INTEGER)) {
            Errors.error((SubLObject)list_utilities.$str92$Position_is_not_valid_for_the_siz);
            return (SubLObject)list_utilities.NIL;
        }
        if (position.numLE((SubLObject)list_utilities.ZERO_INTEGER) || list_length.eql((SubLObject)list_utilities.ZERO_INTEGER)) {
            return (SubLObject)ConsesLow.cons(item, list);
        }
        if (position.numGE(list_length)) {
            return ConsesLow.nconc(list, (SubLObject)ConsesLow.list(item));
        }
        sublist = conses_high.nthcdr(Numbers.subtract(position, (SubLObject)list_utilities.ONE_INTEGER), list);
        insertion_point_on = (SubLObject)ConsesLow.list(item);
        ConsesLow.rplacd(insertion_point_on, sublist.rest());
        ConsesLow.rplacd(sublist, insertion_point_on);
        return list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 70803L)
    public static SubLObject ninsert_randomly(final SubLObject item, final SubLObject list) {
        final SubLObject pos = random.random(number_utilities.f_1X(Sequences.length(list)));
        return ninsert_by_position(item, list, pos);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 71054L)
    public static SubLObject ninsert_somewhere_before_and_after(final SubLObject insert_item, SubLObject list, final SubLObject pivot_item, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        final SubLObject pos = Sequences.position(pivot_item, list, test, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED);
        list = ninsert_somewhere_after(insert_item, list, pos);
        list = ninsert_somewhere_before_or_at(insert_item, list, pos);
        return list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 71365L)
    public static SubLObject ninsert_somewhere_before(final SubLObject item, final SubLObject list, final SubLObject pos) {
        final SubLObject insert_pos = random.random(pos);
        return ninsert_by_position(item, list, insert_pos);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 71589L)
    public static SubLObject ninsert_somewhere_before_or_at(final SubLObject item, final SubLObject list, final SubLObject pos) {
        final SubLObject insert_pos = random.random(number_utilities.f_1X(pos));
        return ninsert_by_position(item, list, insert_pos);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 71824L)
    public static SubLObject ninsert_somewhere_after(final SubLObject item, final SubLObject list, final SubLObject pos) {
        final SubLObject len = Sequences.length(list);
        final SubLObject offset = random.random(Numbers.subtract(len, pos));
        final SubLObject insert_pos = Numbers.add((SubLObject)list_utilities.ONE_INTEGER, pos, offset);
        return ninsert_by_position(item, list, insert_pos);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 72118L)
    public static SubLObject move_nth_to_front(final SubLObject n, final SubLObject list) {
        final SubLObject elt = ConsesLow.nth(n, list);
        return nmove_to_front(elt, list, (SubLObject)list_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 72296L)
    public static SubLObject move_nth_to_position(final SubLObject n, final SubLObject new_position, final SubLObject list) {
        final SubLObject elt = ConsesLow.nth(n, list);
        if (n.eql(new_position)) {
            return list;
        }
        if (new_position.eql((SubLObject)list_utilities.ZERO_INTEGER)) {
            return nmove_to_front(elt, list, (SubLObject)list_utilities.UNPROVIDED);
        }
        if (new_position.eql(number_utilities.f_1_(Sequences.length(list)))) {
            return nmove_to_end(elt, list);
        }
        return ninsert_by_position(elt, delete_nth(n, list), new_position);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 72866L)
    public static SubLObject nmove_to_front(final SubLObject item, final SubLObject list, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = test;
        if (pcase_var.eql((SubLObject)list_utilities.EQ)) {
            thread.resetMultipleValues();
            final SubLObject already_at_frontP = Equality.eq(item, list.first());
            thread.resetMultipleValues();
            return (SubLObject)((list_utilities.NIL != already_at_frontP) ? list : ConsesLow.cons(item, Sequences.delete(item, list, test, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED)));
        }
        if (pcase_var.eql((SubLObject)list_utilities.EQL)) {
            thread.resetMultipleValues();
            final SubLObject already_at_frontP = Equality.eql(item, list.first());
            thread.resetMultipleValues();
            return (SubLObject)((list_utilities.NIL != already_at_frontP) ? list : ConsesLow.cons(item, Sequences.delete(item, list, test, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED)));
        }
        if (pcase_var.eql((SubLObject)list_utilities.EQUAL)) {
            thread.resetMultipleValues();
            final SubLObject already_at_frontP = Equality.equal(item, list.first());
            thread.resetMultipleValues();
            return (SubLObject)((list_utilities.NIL != already_at_frontP) ? list : ConsesLow.cons(item, Sequences.delete(item, list, test, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED)));
        }
        if (pcase_var.eql((SubLObject)list_utilities.EQUALP)) {
            thread.resetMultipleValues();
            final SubLObject already_at_frontP = Equality.equalp(item, list.first());
            thread.resetMultipleValues();
            return (SubLObject)((list_utilities.NIL != already_at_frontP) ? list : ConsesLow.cons(item, Sequences.delete(item, list, test, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED)));
        }
        thread.resetMultipleValues();
        final SubLObject already_at_frontP = Functions.funcall(test, item, list.first());
        thread.resetMultipleValues();
        return (SubLObject)((list_utilities.NIL != already_at_frontP) ? list : ConsesLow.cons(item, Sequences.delete(item, list, test, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 73161L)
    public static SubLObject move_to_front(final SubLObject item, final SubLObject list, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = test;
        if (pcase_var.eql((SubLObject)list_utilities.EQ)) {
            thread.resetMultipleValues();
            final SubLObject already_at_frontP = Equality.eq(item, list.first());
            thread.resetMultipleValues();
            return (SubLObject)((list_utilities.NIL != already_at_frontP) ? list : ConsesLow.cons(item, Sequences.remove(item, list, test, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED)));
        }
        if (pcase_var.eql((SubLObject)list_utilities.EQL)) {
            thread.resetMultipleValues();
            final SubLObject already_at_frontP = Equality.eql(item, list.first());
            thread.resetMultipleValues();
            return (SubLObject)((list_utilities.NIL != already_at_frontP) ? list : ConsesLow.cons(item, Sequences.remove(item, list, test, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED)));
        }
        if (pcase_var.eql((SubLObject)list_utilities.EQUAL)) {
            thread.resetMultipleValues();
            final SubLObject already_at_frontP = Equality.equal(item, list.first());
            thread.resetMultipleValues();
            return (SubLObject)((list_utilities.NIL != already_at_frontP) ? list : ConsesLow.cons(item, Sequences.remove(item, list, test, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED)));
        }
        if (pcase_var.eql((SubLObject)list_utilities.EQUALP)) {
            thread.resetMultipleValues();
            final SubLObject already_at_frontP = Equality.equalp(item, list.first());
            thread.resetMultipleValues();
            return (SubLObject)((list_utilities.NIL != already_at_frontP) ? list : ConsesLow.cons(item, Sequences.remove(item, list, test, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED)));
        }
        thread.resetMultipleValues();
        final SubLObject already_at_frontP = Functions.funcall(test, item, list.first());
        thread.resetMultipleValues();
        return (SubLObject)((list_utilities.NIL != already_at_frontP) ? list : ConsesLow.cons(item, Sequences.remove(item, list, test, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 73746L)
    public static SubLObject nmove_to_end(final SubLObject item, final SubLObject list) {
        return ConsesLow.nconc(Sequences.delete(item, list, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED), (SubLObject)ConsesLow.list(item));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 73883L)
    public static SubLObject move_to_end(final SubLObject item, final SubLObject list) {
        return ConsesLow.append(Sequences.remove(item, list, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED), (SubLObject)ConsesLow.list(item));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 74248L)
    public static SubLObject replace_nth(final SubLObject n, final SubLObject v_new, final SubLObject list) {
        return nreplace_nth(n, v_new, conses_high.copy_list(list));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 74403L)
    public static SubLObject replace_last(final SubLObject list, final SubLObject v_new) {
        return replace_nth(number_utilities.f_1_(Sequences.length(list)), v_new, list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 74571L)
    public static SubLObject remove_duplicates_from_end(final SubLObject list, SubLObject test, SubLObject key, SubLObject start, SubLObject end) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        if (start == list_utilities.UNPROVIDED) {
            start = (SubLObject)list_utilities.ZERO_INTEGER;
        }
        if (end == list_utilities.UNPROVIDED) {
            end = (SubLObject)list_utilities.NIL;
        }
        return Sequences.remove_duplicates(list, test, key, start, end);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 75288L)
    public static SubLObject remove_duplicates_from_start(final SubLObject list, SubLObject test, SubLObject key, SubLObject start, SubLObject end) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        if (start == list_utilities.UNPROVIDED) {
            start = (SubLObject)list_utilities.ZERO_INTEGER;
        }
        if (end == list_utilities.UNPROVIDED) {
            end = (SubLObject)list_utilities.NIL;
        }
        return Sequences.nreverse(Sequences.delete_duplicates(Sequences.reverse(list), test, key, start, end));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 75987L)
    public static SubLObject delete_duplicates_from_end(final SubLObject list, SubLObject test, SubLObject key, SubLObject start, SubLObject end) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        if (start == list_utilities.UNPROVIDED) {
            start = (SubLObject)list_utilities.ZERO_INTEGER;
        }
        if (end == list_utilities.UNPROVIDED) {
            end = (SubLObject)list_utilities.NIL;
        }
        return Sequences.delete_duplicates(list, test, key, start, end);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 76617L)
    public static SubLObject delete_duplicates_from_start(final SubLObject list, SubLObject test, SubLObject key, SubLObject start, SubLObject end) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        if (start == list_utilities.UNPROVIDED) {
            start = (SubLObject)list_utilities.ZERO_INTEGER;
        }
        if (end == list_utilities.UNPROVIDED) {
            end = (SubLObject)list_utilities.NIL;
        }
        return Sequences.nreverse(Sequences.delete_duplicates(Sequences.nreverse(list), test, key, start, end));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 77248L)
    public static SubLObject remove_null(final SubLObject list, SubLObject key, SubLObject start, SubLObject end, SubLObject count) {
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        if (start == list_utilities.UNPROVIDED) {
            start = (SubLObject)list_utilities.ZERO_INTEGER;
        }
        if (end == list_utilities.UNPROVIDED) {
            end = (SubLObject)list_utilities.NIL;
        }
        if (count == list_utilities.UNPROVIDED) {
            count = (SubLObject)list_utilities.NIL;
        }
        return Sequences.remove_if((SubLObject)list_utilities.$sym21$NULL, list, key, start, end, count);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 77382L)
    public static SubLObject remove_from_end_duplicates_and_those_wXkey(final SubLObject list, final SubLObject key_value, SubLObject test, SubLObject key, SubLObject start, SubLObject end) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        if (start == list_utilities.UNPROVIDED) {
            start = (SubLObject)list_utilities.ZERO_INTEGER;
        }
        if (end == list_utilities.UNPROVIDED) {
            end = (SubLObject)list_utilities.NIL;
        }
        return Sequences.nreverse(Sequences.remove_duplicates(Sequences.nreverse((SubLObject)ConsesLow.cons(key_value, conses_high.copy_list(list))), test, key, start, end)).rest();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 77615L)
    public static SubLObject skipping_positions(final SubLObject list, final SubLObject skip_list) {
        SubLObject result = (SubLObject)list_utilities.NIL;
        SubLObject cdotimes_end_var;
        SubLObject n;
        for (cdotimes_end_var = Sequences.length(list), n = (SubLObject)list_utilities.NIL, n = (SubLObject)list_utilities.ZERO_INTEGER; n.numL(cdotimes_end_var); n = Numbers.add(n, (SubLObject)list_utilities.ONE_INTEGER)) {
            if (list_utilities.NIL == subl_promotions.memberP(n, skip_list, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED)) {
                result = (SubLObject)ConsesLow.cons(ConsesLow.nth(n, list), result);
            }
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 77912L)
    public static SubLObject num_list(final SubLObject num, SubLObject start) {
        if (start == list_utilities.UNPROVIDED) {
            start = (SubLObject)list_utilities.ZERO_INTEGER;
        }
        final SubLObject maybe_cached_list = num_list_cached(num, start);
        final SubLObject okP = verify_num_list(maybe_cached_list, num, start);
        if (list_utilities.NIL != okP) {
            return maybe_cached_list;
        }
        remove_num_list_cached(num, start);
        return num_list_cached(num, start);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 78518L)
    public static SubLObject new_num_list(final SubLObject num, SubLObject start) {
        if (start == list_utilities.UNPROVIDED) {
            start = (SubLObject)list_utilities.ZERO_INTEGER;
        }
        SubLObject ans = (SubLObject)list_utilities.NIL;
        SubLObject i;
        for (i = (SubLObject)list_utilities.NIL, i = (SubLObject)list_utilities.ZERO_INTEGER; i.numL(num); i = Numbers.add(i, (SubLObject)list_utilities.ONE_INTEGER)) {
            ans = (SubLObject)ConsesLow.cons(Numbers.add(start, i), ans);
        }
        return Sequences.nreverse(ans);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 78965L)
    public static SubLObject verify_num_list(final SubLObject num_list, final SubLObject length, final SubLObject start) {
        SubLObject badP = (SubLObject)SubLObjectFactory.makeBoolean(!num_list.isList() || !length.isInteger() || !start.isInteger() || list_utilities.NIL == lengthE(num_list, length, (SubLObject)list_utilities.UNPROVIDED));
        SubLObject list_var = (SubLObject)list_utilities.NIL;
        SubLObject num = (SubLObject)list_utilities.NIL;
        SubLObject i = (SubLObject)list_utilities.NIL;
        list_var = num_list;
        num = list_var.first();
        for (i = (SubLObject)list_utilities.ZERO_INTEGER; list_utilities.NIL == badP && list_utilities.NIL != list_var; list_var = list_var.rest(), num = list_var.first(), i = Numbers.add((SubLObject)list_utilities.ONE_INTEGER, i)) {
            if (!num.eql(Numbers.add(i, start))) {
                badP = (SubLObject)list_utilities.T;
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(list_utilities.NIL == badP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 79376L)
    public static SubLObject clear_num_list_cached() {
        final SubLObject cs = list_utilities.$num_list_cached_caching_state$.getGlobalValue();
        if (list_utilities.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 79376L)
    public static SubLObject remove_num_list_cached(final SubLObject num, final SubLObject start) {
        return memoization_state.caching_state_remove_function_results_with_args(list_utilities.$num_list_cached_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(num, start), (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 79376L)
    public static SubLObject num_list_cached_internal(final SubLObject num, final SubLObject start) {
        return new_num_list(num, start);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 79376L)
    public static SubLObject num_list_cached(final SubLObject num, final SubLObject start) {
        SubLObject caching_state = list_utilities.$num_list_cached_caching_state$.getGlobalValue();
        if (list_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)list_utilities.$sym93$NUM_LIST_CACHED, (SubLObject)list_utilities.$sym94$_NUM_LIST_CACHED_CACHING_STATE_, (SubLObject)list_utilities.NIL, (SubLObject)list_utilities.EQL, (SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.$int95$100);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(num, start);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)list_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)list_utilities.NIL;
            collision = cdolist_list_var.first();
            while (list_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (num.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (list_utilities.NIL != cached_args && list_utilities.NIL == cached_args.rest() && start.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(num_list_cached_internal(num, start)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(num, start));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 79609L)
    public static SubLObject numlist(final SubLObject length, SubLObject start) {
        if (start == list_utilities.UNPROVIDED) {
            start = (SubLObject)list_utilities.ZERO_INTEGER;
        }
        return num_list(length, start);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 79784L)
    public static SubLObject tree_ancestor(final SubLObject node, final SubLObject tree, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        SubLObject ancestor = (SubLObject)list_utilities.NIL;
        if (tree.isCons()) {
            if (list_utilities.NIL == ancestor) {
                SubLObject csome_list_var = tree.rest();
                SubLObject subtree = (SubLObject)list_utilities.NIL;
                subtree = csome_list_var.first();
                while (list_utilities.NIL == ancestor && list_utilities.NIL != csome_list_var) {
                    if (subtree.isCons() && list_utilities.NIL != Functions.funcall(test, subtree.first(), node)) {
                        ancestor = tree.first();
                    }
                    csome_list_var = csome_list_var.rest();
                    subtree = csome_list_var.first();
                }
            }
            if (list_utilities.NIL == ancestor) {
                SubLObject csome_list_var = tree.rest();
                SubLObject subtree = (SubLObject)list_utilities.NIL;
                subtree = csome_list_var.first();
                while (list_utilities.NIL == ancestor && list_utilities.NIL != csome_list_var) {
                    if (subtree.isCons()) {
                        ancestor = tree_ancestor(node, subtree, test);
                    }
                    csome_list_var = csome_list_var.rest();
                    subtree = csome_list_var.first();
                }
            }
        }
        return ancestor;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 80229L)
    public static SubLObject member_eqP(final SubLObject item, final SubLObject list) {
        return subl_promotions.memberP(item, list, Symbols.symbol_function((SubLObject)list_utilities.EQ), (SubLObject)list_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 80473L)
    public static SubLObject member_kbeqP(final SubLObject item, final SubLObject list) {
        return subl_promotions.memberP(item, list, Symbols.symbol_function((SubLObject)list_utilities.$sym96$KBEQ), (SubLObject)list_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 80725L)
    public static SubLObject member_equalP(final SubLObject item, final SubLObject list) {
        return subl_promotions.memberP(item, list, Symbols.symbol_function((SubLObject)list_utilities.EQUAL), (SubLObject)list_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 80988L)
    public static SubLObject has_member_equalP(final SubLObject list, final SubLObject item) {
        return member_equalP(item, list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 81177L)
    public static SubLObject not_has_member_equalP(final SubLObject list, final SubLObject item) {
        return (SubLObject)SubLObjectFactory.makeBoolean(list_utilities.NIL == has_member_equalP(list, item));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 81396L)
    public static SubLObject member_equalpP(final SubLObject item, final SubLObject list) {
        return subl_promotions.memberP(item, list, Symbols.symbol_function((SubLObject)list_utilities.EQUALP), (SubLObject)list_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 81662L)
    public static SubLObject nmemberP(final SubLObject item, final SubLObject list, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (test.eql(Symbols.symbol_function((SubLObject)list_utilities.EQ)) || test == list_utilities.EQ) {
            return nmember_eqP(item, list);
        }
        if (test.eql(Symbols.symbol_function((SubLObject)list_utilities.EQL)) || test == list_utilities.EQL) {
            return nmember_eqlP(item, list);
        }
        if (test.eql(Symbols.symbol_function((SubLObject)list_utilities.EQUAL)) || test == list_utilities.EQUAL) {
            return nmember_equalP(item, list);
        }
        if (test.eql(Symbols.symbol_function((SubLObject)list_utilities.EQUALP)) || test == list_utilities.EQUALP) {
            return nmember_equalpP(item, list);
        }
        return nmember_funcallP(item, list, test);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 82457L)
    public static SubLObject nmember_eqP(final SubLObject item, final SubLObject list) {
        SubLObject last_last_cons = (SubLObject)list_utilities.NIL;
        SubLObject last_cons = (SubLObject)list_utilities.NIL;
        SubLObject list_cons;
        SubLObject candidate_item;
        for (list_cons = (SubLObject)list_utilities.NIL, list_cons = list; !list_cons.isAtom(); list_cons = list_cons.rest()) {
            candidate_item = list_cons.first();
            if (item.eql(candidate_item)) {
                return nmember_success(last_last_cons, last_cons, list_cons);
            }
            last_last_cons = last_cons;
            last_cons = list_cons;
        }
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 82811L)
    public static SubLObject nmember_eqlP(final SubLObject item, final SubLObject list) {
        SubLObject last_last_cons = (SubLObject)list_utilities.NIL;
        SubLObject last_cons = (SubLObject)list_utilities.NIL;
        SubLObject list_cons;
        SubLObject candidate_item;
        for (list_cons = (SubLObject)list_utilities.NIL, list_cons = list; !list_cons.isAtom(); list_cons = list_cons.rest()) {
            candidate_item = list_cons.first();
            if (item.eql(candidate_item)) {
                return nmember_success(last_last_cons, last_cons, list_cons);
            }
            last_last_cons = last_cons;
            last_cons = list_cons;
        }
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 83167L)
    public static SubLObject nmember_equalP(final SubLObject item, final SubLObject list) {
        SubLObject last_last_cons = (SubLObject)list_utilities.NIL;
        SubLObject last_cons = (SubLObject)list_utilities.NIL;
        SubLObject list_cons;
        SubLObject candidate_item;
        for (list_cons = (SubLObject)list_utilities.NIL, list_cons = list; !list_cons.isAtom(); list_cons = list_cons.rest()) {
            candidate_item = list_cons.first();
            if (item.equal(candidate_item)) {
                return nmember_success(last_last_cons, last_cons, list_cons);
            }
            last_last_cons = last_cons;
            last_cons = list_cons;
        }
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 83527L)
    public static SubLObject nmember_equalpP(final SubLObject item, final SubLObject list) {
        SubLObject last_last_cons = (SubLObject)list_utilities.NIL;
        SubLObject last_cons = (SubLObject)list_utilities.NIL;
        SubLObject list_cons;
        SubLObject candidate_item;
        for (list_cons = (SubLObject)list_utilities.NIL, list_cons = list; !list_cons.isAtom(); list_cons = list_cons.rest()) {
            candidate_item = list_cons.first();
            if (item.equalp(candidate_item)) {
                return nmember_success(last_last_cons, last_cons, list_cons);
            }
            last_last_cons = last_cons;
            last_cons = list_cons;
        }
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 83889L)
    public static SubLObject nmember_funcallP(final SubLObject item, final SubLObject list, final SubLObject test) {
        SubLObject last_last_cons = (SubLObject)list_utilities.NIL;
        SubLObject last_cons = (SubLObject)list_utilities.NIL;
        SubLObject list_cons;
        SubLObject candidate_item;
        for (list_cons = (SubLObject)list_utilities.NIL, list_cons = list; !list_cons.isAtom(); list_cons = list_cons.rest()) {
            candidate_item = list_cons.first();
            if (list_utilities.NIL != Functions.funcall(test, item, candidate_item)) {
                return nmember_success(last_last_cons, last_cons, list_cons);
            }
            last_last_cons = last_cons;
            last_cons = list_cons;
        }
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 84263L)
    public static SubLObject nmember_success(final SubLObject last_last_cons, final SubLObject last_cons, final SubLObject list_cons) {
        if (list_utilities.NIL != last_last_cons) {
            ConsesLow.rplacd(last_last_cons, list_cons);
            ConsesLow.rplacd(last_cons, list_cons.rest());
            ConsesLow.rplacd(list_cons, last_cons);
        }
        return (SubLObject)list_utilities.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 84596L)
    public static SubLObject intersectP(final SubLObject list1, final SubLObject list2, SubLObject test, SubLObject key) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        final SubLObject length1 = Sequences.length(list1);
        final SubLObject length2 = Sequences.length(list2);
        final SubLObject list1_longer = Numbers.numG(length1, length2);
        final SubLObject set1 = (list_utilities.NIL != list1_longer) ? list2 : list1;
        final SubLObject set2 = (list_utilities.NIL != list1_longer) ? list1 : list2;
        SubLObject intersectP = (SubLObject)list_utilities.NIL;
        if (key.eql(Symbols.symbol_function((SubLObject)list_utilities.IDENTITY)) || key == list_utilities.IDENTITY) {
            if (list_utilities.NIL == intersectP) {
                SubLObject csome_list_var = set1;
                SubLObject element = (SubLObject)list_utilities.NIL;
                element = csome_list_var.first();
                while (list_utilities.NIL == intersectP && list_utilities.NIL != csome_list_var) {
                    if (list_utilities.NIL != subl_promotions.memberP(element, set2, test, key)) {
                        intersectP = (SubLObject)list_utilities.T;
                    }
                    csome_list_var = csome_list_var.rest();
                    element = csome_list_var.first();
                }
            }
        }
        else if (list_utilities.NIL == intersectP) {
            SubLObject csome_list_var = set1;
            SubLObject element = (SubLObject)list_utilities.NIL;
            element = csome_list_var.first();
            while (list_utilities.NIL == intersectP && list_utilities.NIL != csome_list_var) {
                if (list_utilities.NIL != subl_promotions.memberP(Functions.funcall(key, element), set2, test, key)) {
                    intersectP = (SubLObject)list_utilities.T;
                }
                csome_list_var = csome_list_var.rest();
                element = csome_list_var.first();
            }
        }
        return intersectP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 85323L)
    public static SubLObject intersect_sortedP(SubLObject list1, SubLObject list2, SubLObject test, SubLObject key) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.$sym97$_);
        }
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        if (key.eql(Symbols.symbol_function((SubLObject)list_utilities.IDENTITY)) || key == list_utilities.IDENTITY) {
            SubLObject elem1 = list1.first();
            SubLObject elem2 = list2.first();
            while (list_utilities.NIL != list1 && list_utilities.NIL != list2) {
                if (list_utilities.NIL != Functions.funcall(test, elem1, elem2)) {
                    list1 = list1.rest();
                    elem1 = list1.first();
                }
                else {
                    if (list_utilities.NIL == Functions.funcall(test, elem2, elem1)) {
                        return (SubLObject)list_utilities.T;
                    }
                    list2 = list2.rest();
                    elem2 = list2.first();
                }
            }
        }
        else {
            SubLObject elem1 = Functions.funcall(key, list1.first());
            SubLObject elem2 = Functions.funcall(key, list2.first());
            while (list_utilities.NIL != list1 && list_utilities.NIL != list2) {
                if (list_utilities.NIL != Functions.funcall(test, elem1, elem2)) {
                    list1 = list1.rest();
                    elem1 = Functions.funcall(key, list1.first());
                }
                else {
                    if (list_utilities.NIL == Functions.funcall(test, elem2, elem1)) {
                        return (SubLObject)list_utilities.T;
                    }
                    list2 = list2.rest();
                    elem2 = Functions.funcall(key, list2.first());
                }
            }
        }
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 86239L)
    public static SubLObject which_intersect_element_sorted(final SubLObject lists, final SubLObject n, SubLObject test, SubLObject key) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.$sym97$_);
        }
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        final SubLObject target_list = ConsesLow.nth(n, lists);
        SubLObject result = (SubLObject)list_utilities.NIL;
        SubLObject list_var = (SubLObject)list_utilities.NIL;
        SubLObject list = (SubLObject)list_utilities.NIL;
        SubLObject i = (SubLObject)list_utilities.NIL;
        list_var = lists;
        list = list_var.first();
        for (i = (SubLObject)list_utilities.ZERO_INTEGER; list_utilities.NIL != list_var; list_var = list_var.rest(), list = list_var.first(), i = Numbers.add((SubLObject)list_utilities.ONE_INTEGER, i)) {
            if (list_utilities.NIL != intersect_sortedP(list, target_list, test, key)) {
                result = (SubLObject)ConsesLow.cons(i, result);
            }
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 86753L)
    public static SubLObject sorted_subsetp(final SubLObject small_list, final SubLObject big_list, SubLObject test, SubLObject sort, SubLObject key) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (sort == list_utilities.UNPROVIDED) {
            sort = Symbols.symbol_function((SubLObject)list_utilities.$sym97$_);
        }
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject small_list_rest = small_list.rest();
        SubLObject doneP = (SubLObject)list_utilities.NIL;
        final SubLObject pcase_var = key;
        if (pcase_var.eql((SubLObject)list_utilities.IDENTITY)) {
            thread.resetMultipleValues();
            SubLObject small_elem = Equality.identity(small_list.first());
            thread.resetMultipleValues();
            if (list_utilities.NIL == doneP) {
                SubLObject csome_list_var = big_list;
                SubLObject big_elem_raw = (SubLObject)list_utilities.NIL;
                big_elem_raw = csome_list_var.first();
                while (list_utilities.NIL == doneP && list_utilities.NIL != csome_list_var) {
                    final SubLObject pcase_var_$21 = key;
                    if (pcase_var_$21.eql((SubLObject)list_utilities.IDENTITY)) {
                        thread.resetMultipleValues();
                        final SubLObject big_elem = Equality.identity(big_elem_raw);
                        thread.resetMultipleValues();
                        if (list_utilities.NIL == small_elem) {
                            doneP = (SubLObject)list_utilities.T;
                        }
                        else if (list_utilities.NIL != Functions.funcall(sort, small_elem, big_elem)) {
                            doneP = (SubLObject)list_utilities.T;
                        }
                        else if (list_utilities.NIL != Functions.funcall(test, small_elem, big_elem)) {
                            small_elem = Functions.funcall(key, small_list_rest.first());
                            small_list_rest = small_list_rest.rest();
                        }
                    }
                    else {
                        thread.resetMultipleValues();
                        final SubLObject big_elem = Functions.funcall(key, big_elem_raw);
                        thread.resetMultipleValues();
                        if (list_utilities.NIL == small_elem) {
                            doneP = (SubLObject)list_utilities.T;
                        }
                        else if (list_utilities.NIL != Functions.funcall(sort, small_elem, big_elem)) {
                            doneP = (SubLObject)list_utilities.T;
                        }
                        else if (list_utilities.NIL != Functions.funcall(test, small_elem, big_elem)) {
                            small_elem = Functions.funcall(key, small_list_rest.first());
                            small_list_rest = small_list_rest.rest();
                        }
                    }
                    csome_list_var = csome_list_var.rest();
                    big_elem_raw = csome_list_var.first();
                }
            }
            return Types.sublisp_null(small_elem);
        }
        thread.resetMultipleValues();
        SubLObject small_elem = Functions.funcall(key, small_list.first());
        thread.resetMultipleValues();
        if (list_utilities.NIL == doneP) {
            SubLObject csome_list_var = big_list;
            SubLObject big_elem_raw = (SubLObject)list_utilities.NIL;
            big_elem_raw = csome_list_var.first();
            while (list_utilities.NIL == doneP && list_utilities.NIL != csome_list_var) {
                final SubLObject pcase_var_$22 = key;
                if (pcase_var_$22.eql((SubLObject)list_utilities.IDENTITY)) {
                    thread.resetMultipleValues();
                    final SubLObject big_elem = Equality.identity(big_elem_raw);
                    thread.resetMultipleValues();
                    if (list_utilities.NIL == small_elem) {
                        doneP = (SubLObject)list_utilities.T;
                    }
                    else if (list_utilities.NIL != Functions.funcall(sort, small_elem, big_elem)) {
                        doneP = (SubLObject)list_utilities.T;
                    }
                    else if (list_utilities.NIL != Functions.funcall(test, small_elem, big_elem)) {
                        small_elem = Functions.funcall(key, small_list_rest.first());
                        small_list_rest = small_list_rest.rest();
                    }
                }
                else {
                    thread.resetMultipleValues();
                    final SubLObject big_elem = Functions.funcall(key, big_elem_raw);
                    thread.resetMultipleValues();
                    if (list_utilities.NIL == small_elem) {
                        doneP = (SubLObject)list_utilities.T;
                    }
                    else if (list_utilities.NIL != Functions.funcall(sort, small_elem, big_elem)) {
                        doneP = (SubLObject)list_utilities.T;
                    }
                    else if (list_utilities.NIL != Functions.funcall(test, small_elem, big_elem)) {
                        small_elem = Functions.funcall(key, small_list_rest.first());
                        small_list_rest = small_list_rest.rest();
                    }
                }
                csome_list_var = csome_list_var.rest();
                big_elem_raw = csome_list_var.first();
            }
        }
        return Types.sublisp_null(small_elem);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 87611L)
    public static SubLObject sortedP(final SubLObject list, SubLObject key) {
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.$sym98$__);
        }
        SubLObject previous = list.first();
        SubLObject cdolist_list_var = list.rest();
        SubLObject elem = (SubLObject)list_utilities.NIL;
        elem = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            if (list_utilities.NIL == Functions.funcall(key, previous, elem)) {
                return (SubLObject)list_utilities.NIL;
            }
            previous = elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        return (SubLObject)list_utilities.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 87895L)
    public static SubLObject occurs_onceP(final SubLObject item, final SubLObject list, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        final SubLObject itemXrest = conses_high.member(item, list, test, (SubLObject)list_utilities.UNPROVIDED);
        return (SubLObject)SubLObjectFactory.makeBoolean(list_utilities.NIL != itemXrest && list_utilities.NIL == subl_promotions.memberP(item, itemXrest.rest(), test, (SubLObject)list_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 88122L)
    public static SubLObject not_only_elementP(final SubLObject item, final SubLObject list, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(list_utilities.NIL == singletonP(list) || list_utilities.NIL == Functions.funcall(test, item, list.first()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 88263L)
    public static SubLObject occurs_at_least_n_timesP(final SubLObject item, final SubLObject list, final SubLObject n, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        SubLObject times = (SubLObject)list_utilities.ZERO_INTEGER;
        SubLObject successP = (SubLObject)list_utilities.NIL;
        if (list_utilities.NIL == successP) {
            SubLObject csome_list_var = list;
            SubLObject elem = (SubLObject)list_utilities.NIL;
            elem = csome_list_var.first();
            while (list_utilities.NIL == successP && list_utilities.NIL != csome_list_var) {
                if (list_utilities.NIL != Functions.funcall(test, elem, item)) {
                    times = Numbers.add(times, (SubLObject)list_utilities.ONE_INTEGER);
                    if (times.numGE(n)) {
                        successP = (SubLObject)list_utilities.T;
                    }
                }
                csome_list_var = csome_list_var.rest();
                elem = csome_list_var.first();
            }
        }
        return successP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 88955L)
    public static SubLObject occurs_exactly_n_timesP(final SubLObject item, final SubLObject list, final SubLObject n, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        SubLObject times = (SubLObject)list_utilities.ZERO_INTEGER;
        SubLObject cdolist_list_var = list;
        SubLObject elem = (SubLObject)list_utilities.NIL;
        elem = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            if (list_utilities.NIL != Functions.funcall(test, elem, item)) {
                times = Numbers.add(times, (SubLObject)list_utilities.ONE_INTEGER);
                if (times.numG(n)) {
                    return (SubLObject)list_utilities.NIL;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        return Numbers.numE(times, n);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 89448L)
    public static SubLObject occurs_at_most_n_timesP(final SubLObject item, final SubLObject list, final SubLObject n, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        SubLObject times = (SubLObject)list_utilities.ZERO_INTEGER;
        SubLObject cdolist_list_var = list;
        SubLObject elem = (SubLObject)list_utilities.NIL;
        elem = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            if (list_utilities.NIL != Functions.funcall(test, elem, item)) {
                times = Numbers.add(times, (SubLObject)list_utilities.ONE_INTEGER);
                if (times.numG(n)) {
                    return (SubLObject)list_utilities.NIL;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        return (SubLObject)list_utilities.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 89930L)
    public static SubLObject singletonP(final SubLObject list) {
        return (SubLObject)SubLObjectFactory.makeBoolean(list.isCons() && list_utilities.NIL == list.rest());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 90004L)
    public static SubLObject doubletonP(final SubLObject list) {
        return (SubLObject)SubLObjectFactory.makeBoolean(list.isCons() && list_utilities.NIL != list.rest() && list_utilities.NIL == conses_high.cddr(list));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 90090L)
    public static SubLObject tripleP(final SubLObject list) {
        return (SubLObject)SubLObjectFactory.makeBoolean(list.isCons() && list_utilities.NIL != conses_high.cddr(list) && list_utilities.NIL == cdddr(list));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 90175L)
    public static SubLObject list_of_length_p(final SubLObject v_object, final SubLObject length, SubLObject count_dotted_listP) {
        if (count_dotted_listP == list_utilities.UNPROVIDED) {
            count_dotted_listP = (SubLObject)list_utilities.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isList() && list_utilities.NIL != lengthE(v_object, length, count_dotted_listP));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 90333L)
    public static SubLObject list_of_doubletonP(final SubLObject list) {
        return list_of_type_p(Symbols.symbol_function((SubLObject)list_utilities.$sym79$DOUBLETON_), list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 90419L)
    public static SubLObject exactly_one_distinct_memberP(final SubLObject list, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (list_utilities.NIL != list) {
            final SubLObject first = list.first();
            SubLObject cdolist_list_var = list.rest();
            SubLObject elt = (SubLObject)list_utilities.NIL;
            elt = cdolist_list_var.first();
            while (list_utilities.NIL != cdolist_list_var) {
                if (list_utilities.NIL == Functions.funcall(test, first, elt)) {
                    return (SubLObject)list_utilities.NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                elt = cdolist_list_var.first();
            }
            return (SubLObject)list_utilities.T;
        }
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 90662L)
    public static SubLObject duplicatesP(final SubLObject list, SubLObject test, SubLObject key) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        SubLObject ans;
        SubLObject element;
        SubLObject rest;
        for (ans = (SubLObject)list_utilities.NIL, element = (SubLObject)list_utilities.NIL, rest = (SubLObject)list_utilities.NIL, element = list.first(), rest = list.rest(); list_utilities.NIL == ans && list_utilities.NIL != rest; ans = conses_high.member(Functions.funcall(key, element), rest, test, key), element = rest.first(), rest = rest.rest()) {}
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 90955L)
    public static SubLObject equal_duplicatesP(final SubLObject list, SubLObject key) {
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        return duplicatesP(list, Symbols.symbol_function((SubLObject)list_utilities.EQUAL), key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 91063L)
    public static SubLObject duplicates(final SubLObject list, SubLObject test, SubLObject key) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        SubLObject ans = (SubLObject)list_utilities.NIL;
        SubLObject element = (SubLObject)list_utilities.NIL;
        SubLObject rest = (SubLObject)list_utilities.NIL;
        element = list.first();
        for (rest = list.rest(); list_utilities.NIL != rest; rest = rest.rest()) {
            if (list_utilities.NIL != subl_promotions.memberP(Functions.funcall(key, element), rest, test, key) && list_utilities.NIL == subl_promotions.memberP(element, ans, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED)) {
                ans = (SubLObject)ConsesLow.cons(element, ans);
            }
            element = rest.first();
        }
        return Sequences.nreverse(ans);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 91394L)
    public static SubLObject duplicate_memberP(final SubLObject item, final SubLObject list, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        return occurs_at_least_n_timesP(item, list, (SubLObject)list_utilities.TWO_INTEGER, test);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 91536L)
    public static SubLObject list_starts_with_repeating_sequenceP(final SubLObject list, SubLObject test, SubLObject min_repetitions, SubLObject min_sequence_length) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (min_repetitions == list_utilities.UNPROVIDED) {
            min_repetitions = (SubLObject)list_utilities.TWO_INTEGER;
        }
        if (min_sequence_length == list_utilities.UNPROVIDED) {
            min_sequence_length = (SubLObject)list_utilities.ONE_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert list_utilities.NIL != non_dotted_list_p(list) : list;
        assert list_utilities.NIL != subl_promotions.positive_integer_p(min_repetitions) : min_repetitions;
        if (list_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !min_repetitions.numG((SubLObject)list_utilities.ONE_INTEGER)) {
            Errors.error((SubLObject)list_utilities.$str99$Number_of_repetitions_must_be_gre, min_repetitions);
        }
        assert list_utilities.NIL != subl_promotions.positive_integer_p(min_sequence_length) : min_sequence_length;
        final SubLObject first_item = list.first();
        if (list_utilities.NIL == duplicate_memberP(first_item, list, test)) {
            return (SubLObject)list_utilities.NIL;
        }
        SubLObject sequences = (SubLObject)list_utilities.NIL;
        final SubLObject length = Sequences.length(list);
        SubLObject stopP = (SubLObject)list_utilities.NIL;
        SubLObject repeating_sequence = (SubLObject)list_utilities.NIL;
        SubLObject list_var = (SubLObject)list_utilities.NIL;
        SubLObject item = (SubLObject)list_utilities.NIL;
        SubLObject i = (SubLObject)list_utilities.NIL;
        list_var = list;
        item = list_var.first();
        for (i = (SubLObject)list_utilities.ZERO_INTEGER; list_utilities.NIL == stopP && list_utilities.NIL != list_var; list_var = list_var.rest(), item = list_var.first(), i = Numbers.add((SubLObject)list_utilities.ONE_INTEGER, i)) {
            if (i.isZero()) {
                final SubLObject new_sequence = Vectors.make_vector((SubLObject)list_utilities.THREE_INTEGER, (SubLObject)list_utilities.UNPROVIDED);
                Vectors.set_aref(new_sequence, (SubLObject)list_utilities.ZERO_INTEGER, (SubLObject)ConsesLow.list(item));
                Vectors.set_aref(new_sequence, (SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.ZERO_INTEGER);
                Vectors.set_aref(new_sequence, (SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.ONE_INTEGER);
                sequences = (SubLObject)ConsesLow.cons(new_sequence, sequences);
            }
            else if (list_utilities.NIL == sequences) {
                stopP = (SubLObject)list_utilities.T;
            }
            else {
                SubLObject failed_sequences = (SubLObject)list_utilities.NIL;
                SubLObject new_sequences = (SubLObject)list_utilities.NIL;
                if (list_utilities.NIL == repeating_sequence) {
                    SubLObject csome_list_var = sequences;
                    SubLObject sequence = (SubLObject)list_utilities.NIL;
                    sequence = csome_list_var.first();
                    while (list_utilities.NIL == repeating_sequence && list_utilities.NIL != csome_list_var) {
                        thread.resetMultipleValues();
                        final SubLObject result = update_repeating_sequence(sequence, item, i, list, length, test, min_repetitions, min_sequence_length);
                        final SubLObject new_sequence2 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        final SubLObject pcase_var = result;
                        if (pcase_var.eql((SubLObject)list_utilities.$kw100$FAILED)) {
                            failed_sequences = (SubLObject)ConsesLow.cons(sequence, failed_sequences);
                        }
                        else if (pcase_var.eql((SubLObject)list_utilities.$kw101$SUCCEEDED)) {
                            repeating_sequence = sequence;
                            stopP = (SubLObject)list_utilities.T;
                        }
                        if (list_utilities.NIL != new_sequence2) {
                            new_sequences = (SubLObject)ConsesLow.cons(new_sequence2, new_sequences);
                        }
                        csome_list_var = csome_list_var.rest();
                        sequence = csome_list_var.first();
                    }
                }
                SubLObject cdolist_list_var = failed_sequences;
                SubLObject failed = (SubLObject)list_utilities.NIL;
                failed = cdolist_list_var.first();
                while (list_utilities.NIL != cdolist_list_var) {
                    sequences = Sequences.delete(failed, sequences, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED);
                    cdolist_list_var = cdolist_list_var.rest();
                    failed = cdolist_list_var.first();
                }
                cdolist_list_var = new_sequences;
                SubLObject v_new = (SubLObject)list_utilities.NIL;
                v_new = cdolist_list_var.first();
                while (list_utilities.NIL != cdolist_list_var) {
                    sequences = (SubLObject)ConsesLow.cons(v_new, sequences);
                    cdolist_list_var = cdolist_list_var.rest();
                    v_new = cdolist_list_var.first();
                }
            }
        }
        return (SubLObject)((list_utilities.NIL != repeating_sequence) ? Vectors.aref(repeating_sequence, (SubLObject)list_utilities.ZERO_INTEGER) : list_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 93379L)
    public static SubLObject update_repeating_sequence(final SubLObject sequence, final SubLObject item, final SubLObject i, final SubLObject list, final SubLObject length, final SubLObject test, final SubLObject min_repetitions, final SubLObject min_sequence_length) {
        final SubLObject sequence_items = Vectors.aref(sequence, (SubLObject)list_utilities.ZERO_INTEGER);
        final SubLObject reps = Vectors.aref(sequence, (SubLObject)list_utilities.ONE_INTEGER);
        final SubLObject items_found = Vectors.aref(sequence, (SubLObject)list_utilities.TWO_INTEGER);
        SubLObject result = (SubLObject)list_utilities.$kw100$FAILED;
        SubLObject new_sequence = (SubLObject)list_utilities.NIL;
        if (reps.isZero() && length.numGE(Numbers.multiply(min_repetitions, number_utilities.f_1X(Sequences.length(sequence_items))))) {
            new_sequence = Vectors.make_vector((SubLObject)list_utilities.THREE_INTEGER, (SubLObject)list_utilities.UNPROVIDED);
            Vectors.set_aref(new_sequence, (SubLObject)list_utilities.ZERO_INTEGER, first_n(number_utilities.f_1X(i), list));
            Vectors.set_aref(new_sequence, (SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.ZERO_INTEGER);
            Vectors.set_aref(new_sequence, (SubLObject)list_utilities.TWO_INTEGER, number_utilities.f_1X(Sequences.length(sequence_items)));
        }
        if (reps.isZero()) {
            if (list_utilities.NIL != lengthGE(sequence_items, min_sequence_length, (SubLObject)list_utilities.UNPROVIDED) && list_utilities.NIL != Functions.funcall(test, item, sequence_items.first())) {
                Vectors.set_aref(sequence, (SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.ONE_INTEGER);
                Vectors.set_aref(sequence, (SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.ONE_INTEGER);
                result = (SubLObject)list_utilities.$kw102$UPDATED;
            }
        }
        else if (list_utilities.ONE_INTEGER.eql(Numbers.subtract(Sequences.length(sequence_items), items_found)) && list_utilities.NIL != Functions.funcall(test, item, last_one(sequence_items))) {
            Vectors.set_aref(sequence, (SubLObject)list_utilities.ONE_INTEGER, Numbers.add(Vectors.aref(sequence, (SubLObject)list_utilities.ONE_INTEGER), (SubLObject)list_utilities.ONE_INTEGER));
            Vectors.set_aref(sequence, (SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.ZERO_INTEGER);
            if (number_utilities.f_1X(reps).numGE(min_repetitions)) {
                result = (SubLObject)list_utilities.$kw101$SUCCEEDED;
            }
            else {
                result = (SubLObject)list_utilities.$kw102$UPDATED;
            }
        }
        else if (list_utilities.NIL != Functions.funcall(test, item, ConsesLow.nth(items_found, sequence_items))) {
            Vectors.set_aref(sequence, (SubLObject)list_utilities.TWO_INTEGER, Numbers.add(Vectors.aref(sequence, (SubLObject)list_utilities.TWO_INTEGER), (SubLObject)list_utilities.ONE_INTEGER));
            result = (SubLObject)list_utilities.$kw102$UPDATED;
        }
        return subl_promotions.values2(result, new_sequence);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 95185L)
    public static SubLObject multisets_equalP(final SubLObject set1, final SubLObject set2, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        SubLObject result = (SubLObject)list_utilities.NIL;
        SubLObject doneP = (SubLObject)list_utilities.NIL;
        if (!Sequences.length(set1).eql(Sequences.length(set2))) {
            doneP = (SubLObject)list_utilities.T;
        }
        if (list_utilities.NIL == doneP) {
            SubLObject cdolist_list_var = set1;
            SubLObject elem = (SubLObject)list_utilities.NIL;
            elem = cdolist_list_var.first();
            while (list_utilities.NIL != cdolist_list_var) {
                if (!Sequences.count(elem, set1, test, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED).eql(Sequences.count(elem, set2, test, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED))) {
                    doneP = (SubLObject)list_utilities.T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                elem = cdolist_list_var.first();
            }
        }
        if (list_utilities.NIL == doneP) {
            result = sets_equalP(set1, set2, test);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 95578L)
    public static SubLObject sets_equalP(final SubLObject set1, final SubLObject set2, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(set1.equal(set2) || (list_utilities.NIL != conses_high.subsetp(set1, set2, test, (SubLObject)list_utilities.UNPROVIDED) && list_utilities.NIL != conses_high.subsetp(set2, set1, test, (SubLObject)list_utilities.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 95729L)
    public static SubLObject member_via_sets_equalP(final SubLObject v_set, final SubLObject list_of_sets, SubLObject element_equality_test) {
        if (element_equality_test == list_utilities.UNPROVIDED) {
            element_equality_test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        SubLObject cdolist_list_var = list_of_sets;
        SubLObject other_set = (SubLObject)list_utilities.NIL;
        other_set = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            if (list_utilities.NIL != sets_equalP(v_set, other_set, element_equality_test)) {
                return (SubLObject)list_utilities.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            other_set = cdolist_list_var.first();
        }
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 95946L)
    public static SubLObject list_has_member_via_sets_equalP(final SubLObject list_of_sets, final SubLObject v_set, SubLObject element_equality_test) {
        if (element_equality_test == list_utilities.UNPROVIDED) {
            element_equality_test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        return member_via_sets_equalP(v_set, list_of_sets, element_equality_test);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 96119L)
    public static SubLObject sets_equalp(final SubLObject set1, final SubLObject set2) {
        return sets_equalP(set1, set2, Symbols.symbol_function((SubLObject)list_utilities.EQUALP));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 96206L)
    public static SubLObject fast_sets_equalP(final SubLObject set1, final SubLObject set2, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(list_utilities.NIL != fast_subsetP(set1, set2, test) && list_utilities.NIL != fast_subsetP(set2, set1, test));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 96356L)
    public static SubLObject fast_subsetP(final SubLObject list1, final SubLObject list2, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (list_utilities.NIL != lengthL(list1, list_utilities.$magic_hashing_cutoff$.getDynamicValue(thread), (SubLObject)list_utilities.UNPROVIDED) && list_utilities.NIL != lengthL(list2, list_utilities.$magic_hashing_cutoff$.getDynamicValue(thread), (SubLObject)list_utilities.UNPROVIDED)) {
            return conses_high.subsetp(list1, list2, test, (SubLObject)list_utilities.UNPROVIDED);
        }
        final SubLObject length1 = Sequences.length(list1);
        final SubLObject length2 = Sequences.length(list2);
        if (!length1.numLE(length2)) {
            return (SubLObject)list_utilities.NIL;
        }
        final SubLObject hash2 = hash_table_utilities.hash_list_elements(list2, test, length2, (SubLObject)list_utilities.UNPROVIDED);
        SubLObject cdolist_list_var = list1;
        SubLObject elem1 = (SubLObject)list_utilities.NIL;
        elem1 = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            if (list_utilities.NIL == Hashtables.gethash(elem1, hash2, (SubLObject)list_utilities.UNPROVIDED)) {
                return (SubLObject)list_utilities.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            elem1 = cdolist_list_var.first();
        }
        return (SubLObject)list_utilities.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 96835L)
    public static SubLObject fast_subset_equalP(final SubLObject list1, final SubLObject list2) {
        return fast_subsetP(list1, list2, Symbols.symbol_function((SubLObject)list_utilities.EQUAL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 96928L)
    public static SubLObject fast_supersetP(final SubLObject list1, final SubLObject list2, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        return fast_subsetP(list2, list1, test);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 97039L)
    public static SubLObject fast_superset_equalP(final SubLObject list1, final SubLObject list2) {
        return fast_supersetP(list1, list2, Symbols.symbol_function((SubLObject)list_utilities.EQUAL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 97138L)
    public static SubLObject sets_equal_equalP(final SubLObject set1, final SubLObject set2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(list_utilities.NIL != conses_high.subsetp(set1, set2, Symbols.symbol_function((SubLObject)list_utilities.EQUAL), (SubLObject)list_utilities.UNPROVIDED) && list_utilities.NIL != conses_high.subsetp(set2, set1, Symbols.symbol_function((SubLObject)list_utilities.EQUAL), (SubLObject)list_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 97365L)
    public static SubLObject subsetp_equalP(final SubLObject small, final SubLObject big, SubLObject key) {
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        return conses_high.subsetp(small, big, Symbols.symbol_function((SubLObject)list_utilities.EQUAL), key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 97476L)
    public static SubLObject supersetp(final SubLObject list1, final SubLObject list2, SubLObject test, SubLObject key) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        return conses_high.subsetp(list2, list1, test, key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 97589L)
    public static SubLObject set_differenceP(final SubLObject set1, final SubLObject set2, SubLObject test, SubLObject key) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        SubLObject ans = (SubLObject)list_utilities.NIL;
        if (list_utilities.NIL == ans) {
            SubLObject csome_list_var;
            SubLObject element;
            for (csome_list_var = set1, element = (SubLObject)list_utilities.NIL, element = csome_list_var.first(); list_utilities.NIL == ans && list_utilities.NIL != csome_list_var; ans = (SubLObject)SubLObjectFactory.makeBoolean(list_utilities.NIL == subl_promotions.memberP(element, set2, test, key)), csome_list_var = csome_list_var.rest(), element = csome_list_var.first()) {}
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 97784L)
    public static SubLObject tree_set_equalP(final SubLObject tree1, final SubLObject tree2) {
        if (tree1.equal(tree2)) {
            return (SubLObject)list_utilities.T;
        }
        if (tree1.isCons() && tree2.isCons()) {
            return sets_equalP(tree1, tree2, (SubLObject)list_utilities.$sym103$TREE_SET_EQUAL_);
        }
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 97955L)
    public static SubLObject ordered_merge(final SubLObject list1, final SubLObject list2, SubLObject test, SubLObject key) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        SubLObject result = (SubLObject)list_utilities.NIL;
        SubLObject cdolist_list_var = list1;
        SubLObject element = (SubLObject)list_utilities.NIL;
        element = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            final SubLObject item_var = element;
            if (list_utilities.NIL == conses_high.member(item_var, result, test, key)) {
                result = (SubLObject)ConsesLow.cons(item_var, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            element = cdolist_list_var.first();
        }
        cdolist_list_var = list2;
        element = (SubLObject)list_utilities.NIL;
        element = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            final SubLObject item_var = element;
            if (list_utilities.NIL == conses_high.member(item_var, result, test, key)) {
                result = (SubLObject)ConsesLow.cons(item_var, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            element = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 98221L)
    public static SubLObject ordered_union(final SubLObject set1, final SubLObject set2, SubLObject test, SubLObject key) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        SubLObject tail = (SubLObject)list_utilities.NIL;
        SubLObject cdolist_list_var = set2;
        SubLObject element = (SubLObject)list_utilities.NIL;
        element = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            if (list_utilities.NIL == subl_promotions.memberP(element, set1, test, key)) {
                tail = (SubLObject)ConsesLow.cons(element, tail);
            }
            cdolist_list_var = cdolist_list_var.rest();
            element = cdolist_list_var.first();
        }
        return ConsesLow.append(set1, Sequences.nreverse(tail));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 98533L)
    public static SubLObject union_all(final SubLObject list_of_sets, SubLObject test, SubLObject key) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        SubLObject result = list_of_sets.first();
        SubLObject cdolist_list_var = list_of_sets.rest();
        SubLObject v_set = (SubLObject)list_utilities.NIL;
        v_set = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            result = conses_high.union(v_set, result, test, key);
            cdolist_list_var = cdolist_list_var.rest();
            v_set = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 98762L)
    public static SubLObject ordered_set_difference(final SubLObject list1, final SubLObject list2, SubLObject test, SubLObject key) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        SubLObject result = (SubLObject)list_utilities.NIL;
        SubLObject cdolist_list_var = list1;
        SubLObject element = (SubLObject)list_utilities.NIL;
        element = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            if (list_utilities.NIL == subl_promotions.memberP(element, list2, test, key)) {
                result = (SubLObject)ConsesLow.cons(element, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            element = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 99094L)
    public static SubLObject hash_set_difference(final SubLObject list1, final SubLObject list2, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        return hash_table_utilities.hash_existence_difference(hash_table_utilities.hash_list_elements(list1, test, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED), hash_table_utilities.hash_list_elements(list2, test, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 99323L)
    public static SubLObject fast_set_difference(final SubLObject list1, final SubLObject list2, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (list_utilities.NIL == hash_table_utilities.valid_hash_test_p(test) || (list_utilities.NIL != lengthLE(list1, list_utilities.$magic_hashing_cutoff$.getDynamicValue(thread), (SubLObject)list_utilities.UNPROVIDED) && list_utilities.NIL != lengthLE(list2, list_utilities.$magic_hashing_cutoff$.getDynamicValue(thread), (SubLObject)list_utilities.UNPROVIDED))) {
            return conses_high.set_difference(list1, list2, test, (SubLObject)list_utilities.UNPROVIDED);
        }
        return hash_set_difference(list1, list2, test);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 99689L)
    public static SubLObject partial_order_sort(final SubLObject list, final SubLObject pred, SubLObject key) {
        if (key == list_utilities.UNPROVIDED) {
            key = (SubLObject)list_utilities.IDENTITY;
        }
        assert list_utilities.NIL != Types.listp(list) : list;
        assert list_utilities.NIL != subl_promotions.function_symbol_p(pred) : pred;
        assert list_utilities.NIL != subl_promotions.function_symbol_p(key) : key;
        if (list_utilities.NIL == list) {
            return (SubLObject)list_utilities.NIL;
        }
        SubLObject sorted = (SubLObject)ConsesLow.list(list.first());
        SubLObject insertedP = (SubLObject)list_utilities.NIL;
        SubLObject cdolist_list_var = list.rest();
        SubLObject element = (SubLObject)list_utilities.NIL;
        element = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            if (list_utilities.NIL != Functions.funcall(pred, Functions.funcall(key, element), Functions.funcall(key, sorted.first()))) {
                sorted = (SubLObject)ConsesLow.cons(element, sorted);
                insertedP = (SubLObject)list_utilities.T;
            }
            else {
                insertedP = (SubLObject)list_utilities.NIL;
                SubLObject processed = (SubLObject)list_utilities.NIL;
                SubLObject remaining = (SubLObject)list_utilities.NIL;
                processed = (SubLObject)list_utilities.NIL;
                for (remaining = sorted; list_utilities.NIL == insertedP && list_utilities.NIL != remaining; remaining = remaining.rest()) {
                    if (list_utilities.NIL != Functions.funcall(pred, Functions.funcall(key, element), Functions.funcall(key, remaining.first()))) {
                        ConsesLow.rplacd(processed, (SubLObject)ConsesLow.cons(element, remaining));
                        insertedP = (SubLObject)list_utilities.T;
                    }
                    processed = remaining;
                }
            }
            if (list_utilities.NIL == insertedP) {
                sorted = ConsesLow.append(sorted, (SubLObject)ConsesLow.list(element));
            }
            cdolist_list_var = cdolist_list_var.rest();
            element = cdolist_list_var.first();
        }
        return sorted;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 101013L)
    public static SubLObject list2vector(final SubLObject list) {
        assert list_utilities.NIL != Types.listp(list) : list;
        final SubLObject vector = Vectors.make_vector(Sequences.length(list), (SubLObject)list_utilities.UNPROVIDED);
        SubLObject list_var = (SubLObject)list_utilities.NIL;
        SubLObject elem = (SubLObject)list_utilities.NIL;
        SubLObject i = (SubLObject)list_utilities.NIL;
        list_var = list;
        elem = list_var.first();
        for (i = (SubLObject)list_utilities.ZERO_INTEGER; list_utilities.NIL != list_var; list_var = list_var.rest(), elem = list_var.first(), i = Numbers.add((SubLObject)list_utilities.ONE_INTEGER, i)) {
            Vectors.set_aref(vector, i, elem);
        }
        return vector;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 101358L)
    public static SubLObject vector2list(final SubLObject vector) {
        SubLObject l = (SubLObject)list_utilities.NIL;
        final SubLObject backwardP_var = (SubLObject)list_utilities.T;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject elt;
        for (length = Sequences.length(vector), v_iteration = (SubLObject)list_utilities.NIL, v_iteration = (SubLObject)list_utilities.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)list_utilities.ONE_INTEGER)) {
            element_num = ((list_utilities.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)list_utilities.ONE_INTEGER) : v_iteration);
            elt = Vectors.aref(vector, element_num);
            l = (SubLObject)ConsesLow.cons(elt, l);
        }
        return l;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 101555L)
    public static SubLObject vector2list_reversible(final SubLObject vector, SubLObject marker) {
        if (marker == list_utilities.UNPROVIDED) {
            marker = list_utilities.$listified_vector_marker$.getDynamicValue();
        }
        return (SubLObject)ConsesLow.cons(marker, vector2list(vector));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 101749L)
    public static SubLObject listified_vector2vector(final SubLObject listified_vector, SubLObject marker) {
        if (marker == list_utilities.UNPROVIDED) {
            marker = list_utilities.$listified_vector_marker$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (list_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !listified_vector.first().eql(marker)) {
            Errors.error((SubLObject)list_utilities.$str106$_S_is_not_a_listified_vector_mark, listified_vector, marker);
        }
        return list2vector(listified_vector.rest());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 102130L)
    public static SubLObject list_without_repetition_p(final SubLObject list, SubLObject test, SubLObject key) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQUAL);
        }
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        assert list_utilities.NIL != Types.listp(list) : list;
        return (SubLObject)SubLObjectFactory.makeBoolean(list_utilities.NIL == duplicatesP(list, test, key));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 102294L)
    public static SubLObject sequence_elements(final SubLObject sequence, final SubLObject positions) {
        assert list_utilities.NIL != Types.sequencep(sequence) : sequence;
        if (sequence.isList()) {
            SubLObject elements = (SubLObject)list_utilities.NIL;
            SubLObject cdolist_list_var = positions;
            SubLObject position = (SubLObject)list_utilities.NIL;
            position = cdolist_list_var.first();
            while (list_utilities.NIL != cdolist_list_var) {
                elements = (SubLObject)ConsesLow.cons(ConsesLow.nth(position, sequence), elements);
                cdolist_list_var = cdolist_list_var.rest();
                position = cdolist_list_var.first();
            }
            return Sequences.nreverse(elements);
        }
        if (sequence.isVector()) {
            final SubLObject elements = Vectors.make_vector(Sequences.length(positions), (SubLObject)list_utilities.UNPROVIDED);
            SubLObject list_var = (SubLObject)list_utilities.NIL;
            SubLObject position = (SubLObject)list_utilities.NIL;
            SubLObject index = (SubLObject)list_utilities.NIL;
            list_var = positions;
            position = list_var.first();
            for (index = (SubLObject)list_utilities.ZERO_INTEGER; list_utilities.NIL != list_var; list_var = list_var.rest(), position = list_var.first(), index = Numbers.add((SubLObject)list_utilities.ONE_INTEGER, index)) {
                Vectors.set_aref(elements, index, Vectors.aref(sequence, position));
            }
            return elements;
        }
        SubLObject elements = Strings.make_string(Sequences.length(positions), (SubLObject)list_utilities.UNPROVIDED);
        SubLObject list_var = (SubLObject)list_utilities.NIL;
        SubLObject position = (SubLObject)list_utilities.NIL;
        SubLObject index = (SubLObject)list_utilities.NIL;
        list_var = positions;
        position = list_var.first();
        for (index = (SubLObject)list_utilities.ZERO_INTEGER; list_utilities.NIL != list_var; list_var = list_var.rest(), position = list_var.first(), index = Numbers.add((SubLObject)list_utilities.ONE_INTEGER, index)) {
            Strings.set_char(elements, index, Strings.sublisp_char(sequence, position));
        }
        return elements;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 103285L)
    public static SubLObject set_difference_forts(final SubLObject forts_1, final SubLObject forts_2) {
        return fast_set_difference(forts_1, forts_2, (SubLObject)list_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 103466L)
    public static SubLObject ordered_intersection(final SubLObject list1, final SubLObject list2, SubLObject test, SubLObject key) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        SubLObject result = (SubLObject)list_utilities.NIL;
        SubLObject cdolist_list_var = list1;
        SubLObject element = (SubLObject)list_utilities.NIL;
        element = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            if (list_utilities.NIL != Sequences.find(element, list2, test, key, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED)) {
                result = (SubLObject)ConsesLow.cons(element, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            element = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 103851L)
    public static SubLObject intersect_all(final SubLObject lists, SubLObject test, SubLObject key) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        SubLObject result = lists.first();
        SubLObject cdolist_list_var = lists.rest();
        SubLObject list_i = (SubLObject)list_utilities.NIL;
        list_i = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            result = conses_high.intersection(result, list_i, test, key);
            cdolist_list_var = cdolist_list_var.rest();
            list_i = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 104069L)
    public static SubLObject fast_intersect_all(final SubLObject lists, SubLObject test, SubLObject key) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        SubLObject sets = (SubLObject)list_utilities.NIL;
        SubLObject cdolist_list_var = lists;
        SubLObject list = (SubLObject)list_utilities.NIL;
        list = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            final SubLObject transformed_list = (key.eql(Symbols.symbol_function((SubLObject)list_utilities.IDENTITY)) || key == list_utilities.IDENTITY) ? list : Mapping.mapcar(key, list);
            sets = (SubLObject)ConsesLow.cons(set_utilities.construct_set_from_list(transformed_list, test, (SubLObject)list_utilities.UNPROVIDED), sets);
            cdolist_list_var = cdolist_list_var.rest();
            list = cdolist_list_var.first();
        }
        return set.set_element_list(set_utilities.set_intersection(sets, test));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 104638L)
    public static SubLObject safe_pairlis(final SubLObject keys, final SubLObject data) {
        if (list_utilities.NIL != same_length_p(keys, data)) {
            return conses_high.pairlis(keys, data, (SubLObject)list_utilities.UNPROVIDED);
        }
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 104739L)
    public static SubLObject flip_alist(final SubLObject alist) {
        return Mapping.mapcar((SubLObject)list_utilities.$sym107$FLIP_CONS, alist);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 104802L)
    public static SubLObject flip_cons(final SubLObject cons) {
        return (SubLObject)ConsesLow.cons(cons.rest(), cons.first());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 104866L)
    public static SubLObject flip_doubleton(final SubLObject doubleton) {
        return (SubLObject)ConsesLow.list(conses_high.second(doubleton), doubleton.first());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 104955L)
    public static SubLObject substitute_sequence(final SubLObject new_seq, final SubLObject old_seq, final SubLObject sequence) {
        final SubLObject old_seq_position = Sequences.search(old_seq, sequence, Symbols.symbol_function((SubLObject)list_utilities.EQUAL), (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED);
        if (list_utilities.NIL != old_seq_position) {
            return substitute_sequence_1(new_seq, old_seq, old_seq_position, sequence);
        }
        return sequence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 105198L)
    public static SubLObject substitute_sequence_1(final SubLObject new_seq, final SubLObject old_seq, final SubLObject old_seq_position, final SubLObject sequence) {
        final SubLObject old_seq_length = Sequences.length(old_seq);
        if (old_seq_position.numG((SubLObject)list_utilities.ZERO_INTEGER)) {
            ConsesLow.rplacd(conses_high.nthcdr(Numbers.subtract(old_seq_position, (SubLObject)list_utilities.ONE_INTEGER), sequence), ConsesLow.append(new_seq, conses_high.nthcdr(Numbers.add(old_seq_position, old_seq_length), sequence)));
            return substitute_sequence(new_seq, old_seq, sequence);
        }
        return substitute_sequence(new_seq, old_seq, ConsesLow.append(new_seq, conses_high.nthcdr(Numbers.add(old_seq_position, old_seq_length), sequence)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 105690L)
    public static SubLObject compare_lists(final SubLObject list1, final SubLObject list2, SubLObject test, SubLObject key) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQUAL);
        }
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (list_utilities.NIL == list1) {
            return subl_promotions.values2((SubLObject)list_utilities.NIL, list2);
        }
        if (list_utilities.NIL == list2) {
            return subl_promotions.values2(list1, (SubLObject)list_utilities.NIL);
        }
        if (list_utilities.NIL != conses_high.member(Functions.funcall(key, list1.first()), list2, test, key)) {
            return compare_lists(list1.rest(), Sequences.remove(Functions.funcall(key, list1.first()), list2, test, key, (SubLObject)list_utilities.ZERO_INTEGER, (SubLObject)list_utilities.NIL, (SubLObject)list_utilities.ONE_INTEGER), test, key);
        }
        thread.resetMultipleValues();
        final SubLObject list1_extras = compare_lists(list1.rest(), list2, test, key);
        final SubLObject list2_extras = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return subl_promotions.values2((SubLObject)ConsesLow.cons(list1.first(), list1_extras), list2_extras);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 106607L)
    public static SubLObject unique_difference_among_lists(final SubLObject lists) {
        if (!Sequences.length(lists).numG((SubLObject)list_utilities.ONE_INTEGER)) {
            return (SubLObject)list_utilities.NIL;
        }
        final SubLObject list1 = lists.first();
        final SubLObject rest = lists.rest();
        SubLObject position = (SubLObject)list_utilities.NIL;
        SubLObject cdolist_list_var = rest;
        SubLObject list2 = (SubLObject)list_utilities.NIL;
        list2 = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            final SubLObject new_position = unique_difference_between_lists(list1, list2);
            if (list_utilities.NIL == new_position) {
                return (SubLObject)list_utilities.NIL;
            }
            if (list_utilities.NIL == position) {
                position = new_position;
            }
            else if (!new_position.equal(position)) {
                return (SubLObject)list_utilities.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            list2 = cdolist_list_var.first();
        }
        return position;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 107117L)
    public static SubLObject unique_difference_between_lists(final SubLObject list1, final SubLObject list2) {
        if (!Sequences.length(list1).equal(Sequences.length(list2))) {
            return (SubLObject)list_utilities.NIL;
        }
        SubLObject differences = (SubLObject)list_utilities.NIL;
        SubLObject index = (SubLObject)list_utilities.ZERO_INTEGER;
        SubLObject elt1 = (SubLObject)list_utilities.NIL;
        SubLObject elt1_$23 = (SubLObject)list_utilities.NIL;
        SubLObject elt2 = (SubLObject)list_utilities.NIL;
        SubLObject elt2_$24 = (SubLObject)list_utilities.NIL;
        elt1 = list1;
        elt1_$23 = elt1.first();
        elt2 = list2;
        elt2_$24 = elt2.first();
        while (list_utilities.NIL != elt2 || list_utilities.NIL != elt1) {
            if (!elt1_$23.equal(elt2_$24)) {
                differences = (SubLObject)ConsesLow.cons(index, differences);
            }
            if (Sequences.length(differences).numG((SubLObject)list_utilities.ONE_INTEGER)) {
                return (SubLObject)list_utilities.NIL;
            }
            index = Numbers.add(index, (SubLObject)list_utilities.ONE_INTEGER);
            elt1 = elt1.rest();
            elt1_$23 = elt1.first();
            elt2 = elt2.rest();
            elt2_$24 = elt2.first();
        }
        if (list_utilities.NIL != differences) {
            return differences.first();
        }
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 107582L)
    public static SubLObject list_subst(final SubLObject new_sublist, final SubLObject old_sublist, final SubLObject list, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQUAL);
        }
        if (old_sublist.equalp((SubLObject)list_utilities.NIL)) {
            return subl_promotions.values2(list, (SubLObject)list_utilities.T);
        }
        final SubLObject slen = Sequences.length(list);
        final SubLObject olen = Sequences.length(old_sublist);
        final SubLObject index = Sequences.search(old_sublist, list, test, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED);
        final SubLObject front = (SubLObject)((list_utilities.NIL != index) ? Sequences.subseq(list, (SubLObject)list_utilities.ZERO_INTEGER, index) : list_utilities.NIL);
        final SubLObject rest = (list_utilities.NIL != index) ? Sequences.subseq(list, Numbers.add(olen, index), slen) : list;
        if (list_utilities.NIL != index) {
            return subl_promotions.values2(ConsesLow.append(front, new_sublist, list_subst(new_sublist, old_sublist, rest, (SubLObject)list_utilities.UNPROVIDED)), (SubLObject)list_utilities.T);
        }
        return subl_promotions.values2(list, (SubLObject)list_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 108213L)
    public static SubLObject list_subst_all_in_tree(final SubLObject new_sublist, final SubLObject old_sublist, final SubLObject list, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQUAL);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = conses_high.copy_tree(list);
        SubLObject replacedP = (SubLObject)list_utilities.NIL;
        SubLObject list_var = (SubLObject)list_utilities.NIL;
        SubLObject sub_list = (SubLObject)list_utilities.NIL;
        SubLObject n = (SubLObject)list_utilities.NIL;
        list_var = result;
        sub_list = list_var.first();
        for (n = (SubLObject)list_utilities.ZERO_INTEGER; list_utilities.NIL != list_var; list_var = list_var.rest(), sub_list = list_var.first(), n = Numbers.add((SubLObject)list_utilities.ONE_INTEGER, n)) {
            if (sub_list.isList()) {
                thread.resetMultipleValues();
                final SubLObject new_sub_list = list_subst_all_in_tree(new_sublist, old_sublist, sub_list, test);
                final SubLObject sub_replacedP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (list_utilities.NIL != sub_replacedP) {
                    replacedP = (SubLObject)list_utilities.T;
                    result = replace_nth(n, new_sub_list, result);
                }
            }
        }
        thread.resetMultipleValues();
        final SubLObject new_result = list_subst(new_sublist, old_sublist, result, test);
        final SubLObject outer_replacedP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (list_utilities.NIL != outer_replacedP) {
            replacedP = (SubLObject)list_utilities.T;
            result = new_result;
        }
        return Values.values(result, replacedP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 108879L)
    public static SubLObject subseq_subst(final SubLObject replacement, final SubLObject sequence, final SubLObject start, SubLObject end) {
        if (end == list_utilities.UNPROVIDED) {
            end = Sequences.length(sequence);
        }
        return ConsesLow.append(Sequences.subseq(sequence, (SubLObject)list_utilities.ZERO_INTEGER, start), replacement, Sequences.subseq(sequence, end, (SubLObject)list_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 109051L)
    public static SubLObject self_evaluating_form_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isAtom() && (list_utilities.NIL == v_object || list_utilities.T == v_object || v_object.isKeyword() || !v_object.isSymbol()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 109293L)
    public static SubLObject quote_form_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(list_utilities.NIL != doubletonP(v_object) && list_utilities.$sym108$QUOTE == v_object.first());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 109440L)
    public static SubLObject non_side_effecting_form_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isAtom() || list_utilities.NIL != quote_form_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 109621L)
    public static SubLObject quotify(final SubLObject v_object) {
        if (list_utilities.NIL != self_evaluating_form_p(v_object)) {
            return v_object;
        }
        return (SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym108$QUOTE, v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 109818L)
    public static SubLObject unquotify(final SubLObject v_object) {
        if (list_utilities.NIL != quote_form_p(v_object)) {
            return conses_high.second(v_object);
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 109995L)
    public static SubLObject sort_adjoin(final SubLObject item, final SubLObject sorted_list, SubLObject test, SubLObject predicate, SubLObject key) {
        if (test == list_utilities.UNPROVIDED) {
            test = (SubLObject)list_utilities.$sym109$STRING_;
        }
        if (predicate == list_utilities.UNPROVIDED) {
            predicate = (SubLObject)list_utilities.$sym110$STRING_;
        }
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.$sym111$SYMBOL_NAME);
        }
        if (key.eql(Symbols.symbol_function((SubLObject)list_utilities.$sym111$SYMBOL_NAME)) || key == list_utilities.$sym111$SYMBOL_NAME) {
            if (list_utilities.NIL == sorted_list) {
                return (SubLObject)ConsesLow.list(item);
            }
            if (list_utilities.NIL != Functions.funcall(test, Symbols.symbol_name(item), Symbols.symbol_name(sorted_list.first()))) {
                return sorted_list;
            }
            if (list_utilities.NIL != Functions.funcall(predicate, Symbols.symbol_name(item), Symbols.symbol_name(sorted_list.first()))) {
                return (SubLObject)ConsesLow.cons(item, sorted_list);
            }
            return (SubLObject)ConsesLow.cons(sorted_list.first(), sort_adjoin(item, sorted_list.rest(), test, predicate, (SubLObject)list_utilities.UNPROVIDED));
        }
        else {
            if (list_utilities.NIL == sorted_list) {
                return (SubLObject)ConsesLow.list(item);
            }
            if (list_utilities.NIL != Functions.funcall(test, Functions.funcall(key, item), Functions.funcall(key, sorted_list.first()))) {
                return sorted_list;
            }
            if (list_utilities.NIL != Functions.funcall(predicate, Functions.funcall(key, item), Functions.funcall(key, sorted_list.first()))) {
                return (SubLObject)ConsesLow.cons(item, sorted_list);
            }
            return (SubLObject)ConsesLow.cons(sorted_list.first(), sort_adjoin(item, sorted_list.rest(), test, predicate, key));
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 110916L)
    public static SubLObject sorted_add_to_list(final SubLObject item, final SubLObject sorted_list, final SubLObject predicate, SubLObject key) {
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        return splice_into_sorted_list(item, sorted_list, predicate, key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 111319L)
    public static SubLObject splice_into_sorted_list(final SubLObject v_object, SubLObject sorted_list, final SubLObject predicate, SubLObject key) {
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        assert list_utilities.NIL != Types.listp(sorted_list) : sorted_list;
        final SubLObject object_key = Functions.funcall(key, v_object);
        SubLObject back = (SubLObject)list_utilities.NIL;
        SubLObject node = (SubLObject)list_utilities.NIL;
        back = (SubLObject)list_utilities.NIL;
        for (node = sorted_list; list_utilities.NIL != node; node = node.rest()) {
            final SubLObject item = node.first();
            final SubLObject item_key = Functions.funcall(key, item);
            if (list_utilities.NIL != Functions.funcall(predicate, object_key, item_key)) {
                if (list_utilities.NIL != back) {
                    ConsesLow.rplacd(back, (SubLObject)ConsesLow.cons(v_object, node));
                }
                else {
                    sorted_list = (SubLObject)ConsesLow.cons(v_object, sorted_list);
                }
                return sorted_list;
            }
            back = node;
        }
        if (list_utilities.NIL != back) {
            ConsesLow.rplacd(back, (SubLObject)ConsesLow.cons(v_object, node));
        }
        else {
            sorted_list = (SubLObject)ConsesLow.cons(v_object, sorted_list);
        }
        return sorted_list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 112027L)
    public static SubLObject safe_splice_into_sorted_list(final SubLObject item, final SubLObject sorted_list, final SubLObject predicate, SubLObject key) {
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        return splice_into_sorted_list(item, conses_high.copy_list(sorted_list), predicate, key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 112493L)
    public static SubLObject element_precedes_specified_othersP(final SubLObject element, final SubLObject other_elements, final SubLObject sequence, SubLObject test, SubLObject key) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        SubLObject cdolist_list_var = sequence;
        SubLObject sequence_element = (SubLObject)list_utilities.NIL;
        sequence_element = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            if (list_utilities.NIL != Functions.funcall(test, element, sequence_element)) {
                return (SubLObject)list_utilities.T;
            }
            if (list_utilities.NIL != subl_promotions.memberP(sequence_element, other_elements, test, key)) {
                return (SubLObject)list_utilities.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            sequence_element = cdolist_list_var.first();
        }
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 113028L)
    public static SubLObject function_arglist_max_args(final SubLObject function_formal_arglist) {
        assert list_utilities.NIL != Types.listp(function_formal_arglist) : function_formal_arglist;
        if (list_utilities.NIL != subl_promotions.memberP((SubLObject)list_utilities.$sym120$_REST, function_formal_arglist, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED)) {
            return (SubLObject)list_utilities.NIL;
        }
        final SubLObject num = Sequences.length(function_formal_arglist);
        if (list_utilities.NIL != subl_promotions.memberP((SubLObject)list_utilities.$sym62$_OPTIONAL, function_formal_arglist, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED)) {
            return Numbers.subtract(num, (SubLObject)list_utilities.ONE_INTEGER);
        }
        return num;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 113617L)
    public static SubLObject function_arglist_min_args(final SubLObject function_formal_arglist) {
        assert list_utilities.NIL != Types.listp(function_formal_arglist) : function_formal_arglist;
        SubLObject min = (SubLObject)list_utilities.ZERO_INTEGER;
        SubLObject cdolist_list_var = function_formal_arglist;
        SubLObject arg = (SubLObject)list_utilities.NIL;
        arg = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            if (list_utilities.NIL != subl_promotions.memberP(arg, (SubLObject)list_utilities.$list121, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED)) {
                return min;
            }
            min = Numbers.add(min, (SubLObject)list_utilities.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        }
        return min;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 114004L)
    public static SubLObject remove_self_binds(final SubLObject blist, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQUAL);
        }
        SubLObject result = (SubLObject)list_utilities.NIL;
        SubLObject cdolist_list_var = blist;
        SubLObject bind = (SubLObject)list_utilities.NIL;
        bind = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            if (list_utilities.NIL == self_bindP(bind, test)) {
                result = (SubLObject)ConsesLow.cons(bind, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            bind = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 114234L)
    public static SubLObject self_bindP(final SubLObject bind, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQUAL);
        }
        if (!bind.equal((SubLObject)list_utilities.$list122)) {
            return Functions.funcall(test, bind.first(), bind.rest());
        }
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 114368L)
    public static SubLObject bind_for_var(final SubLObject var, final SubLObject blist, SubLObject test, SubLObject key) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        return conses_high.assoc(var, blist, test, key).rest();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 114484L)
    public static SubLObject remove_bind(final SubLObject var, final SubLObject blist, SubLObject test, SubLObject key) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        return Sequences.remove(conses_high.assoc(var, blist, test, key), blist, Symbols.symbol_function((SubLObject)list_utilities.EQUAL), (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 114616L)
    public static SubLObject extract_bindings(final SubLObject var, final SubLObject blists) {
        SubLObject terms = (SubLObject)list_utilities.NIL;
        SubLObject cdolist_list_var = blists;
        SubLObject form = (SubLObject)list_utilities.NIL;
        form = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            final SubLObject binding = conses_high.assoc(var, form, Symbols.symbol_function((SubLObject)list_utilities.EQUAL), (SubLObject)list_utilities.UNPROVIDED).rest();
            if (list_utilities.NIL != binding) {
                final SubLObject item_var = binding;
                if (list_utilities.NIL == conses_high.member(item_var, terms, Symbols.symbol_function((SubLObject)list_utilities.EQUAL), Symbols.symbol_function((SubLObject)list_utilities.IDENTITY))) {
                    terms = (SubLObject)ConsesLow.cons(item_var, terms);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            form = cdolist_list_var.first();
        }
        return terms;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 114826L)
    public static SubLObject car_is_el_varP(final SubLObject obj) {
        SubLObject ans = (SubLObject)list_utilities.NIL;
        if (obj.isCons() && list_utilities.NIL != cycl_variables.el_varP(obj.first())) {
            ans = (SubLObject)list_utilities.T;
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 114960L)
    public static SubLObject extract_binding_strings(final SubLObject varlist, final SubLObject blist) {
        SubLObject binding_strings = (SubLObject)list_utilities.NIL;
        SubLObject cdolist_list_var = blist;
        SubLObject b = (SubLObject)list_utilities.NIL;
        b = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            final SubLObject pairs = cons_tree_gather(b, (SubLObject)list_utilities.$sym123$CAR_IS_EL_VAR_, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED);
            SubLObject temp = (SubLObject)list_utilities.NIL;
            SubLObject cdolist_list_var_$25 = varlist;
            SubLObject var = (SubLObject)list_utilities.NIL;
            var = cdolist_list_var_$25.first();
            while (list_utilities.NIL != cdolist_list_var_$25) {
                final SubLObject v_term = conses_high.assoc(var, pairs, Symbols.symbol_function((SubLObject)list_utilities.EQUAL), (SubLObject)list_utilities.UNPROVIDED).rest();
                if (list_utilities.NIL != v_term) {
                    temp = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)list_utilities.NIL, (SubLObject)list_utilities.$str124$_s____s, var, v_term), temp);
                }
                cdolist_list_var_$25 = cdolist_list_var_$25.rest();
                var = cdolist_list_var_$25.first();
            }
            if (list_utilities.NIL != temp) {
                binding_strings = (SubLObject)ConsesLow.cons(temp, binding_strings);
            }
            cdolist_list_var = cdolist_list_var.rest();
            b = cdolist_list_var.first();
        }
        return binding_strings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 115350L)
    public static SubLObject tree_funcall_if(final SubLObject test, final SubLObject fn, final SubLObject v_object, SubLObject key) {
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        if (list_utilities.NIL != Functions.funcall(test, Functions.funcall(key, v_object))) {
            Functions.funcall(fn, v_object);
        }
        else if (v_object.isCons()) {
            tree_funcall_if(test, fn, v_object.first(), key);
            tree_funcall_if(test, fn, v_object.rest(), key);
        }
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 115703L)
    public static SubLObject tree_find_all_if(final SubLObject test, final SubLObject v_object, SubLObject key) {
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        if (list_utilities.NIL != Functions.funcall(test, Functions.funcall(key, v_object))) {
            return v_object;
        }
        if (v_object.isCons()) {
            SubLObject result = (SubLObject)list_utilities.NIL;
            SubLObject cons;
            SubLObject current;
            SubLObject datum;
            SubLObject element;
            SubLObject rest;
            SubLObject cdolist_list_var;
            SubLObject result_element;
            for (cons = (SubLObject)list_utilities.NIL, cons = v_object; !cons.isAtom(); cons = cons.rest()) {
                datum = (current = cons);
                element = (SubLObject)list_utilities.NIL;
                rest = (SubLObject)list_utilities.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list125);
                element = current.first();
                current = (rest = current.rest());
                if (list_utilities.NIL != Functions.funcall(test, Functions.funcall(key, element))) {
                    result = (SubLObject)ConsesLow.cons(element, result);
                }
                else if (element.isCons()) {
                    cdolist_list_var = tree_find_all_if(test, element, key);
                    result_element = (SubLObject)list_utilities.NIL;
                    result_element = cdolist_list_var.first();
                    while (list_utilities.NIL != cdolist_list_var) {
                        result = (SubLObject)ConsesLow.cons(result_element, result);
                        cdolist_list_var = cdolist_list_var.rest();
                        result_element = cdolist_list_var.first();
                    }
                }
                if (!rest.isList() && list_utilities.NIL != Functions.funcall(test, Functions.funcall(key, rest))) {
                    result = (SubLObject)ConsesLow.cons(rest, result);
                }
            }
            return Sequences.nreverse(result);
        }
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 116354L)
    public static SubLObject tree_remove_all_if(final SubLObject test, final SubLObject v_object, SubLObject key) {
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        if (list_utilities.NIL != Functions.funcall(test, Functions.funcall(key, v_object))) {
            return (SubLObject)list_utilities.NIL;
        }
        if (v_object.isCons()) {
            return Sequences.remove((SubLObject)list_utilities.NIL, (SubLObject)ConsesLow.cons(tree_remove_all_if(test, v_object.first(), key), tree_remove_all_if(test, v_object.rest(), key)), (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED);
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 116629L)
    public static SubLObject nswap_tree(final SubLObject item1, final SubLObject item2, SubLObject v_object, SubLObject test, SubLObject temp) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (temp == list_utilities.UNPROVIDED) {
            temp = (SubLObject)list_utilities.$kw126$TEMP;
        }
        v_object = conses_high.nsubst(temp, item2, v_object, test, (SubLObject)list_utilities.UNPROVIDED);
        v_object = conses_high.nsubst(item2, item1, v_object, test, (SubLObject)list_utilities.UNPROVIDED);
        v_object = conses_high.nsubst(item1, temp, v_object, test, (SubLObject)list_utilities.UNPROVIDED);
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 116872L)
    public static SubLObject swap_tree(final SubLObject item1, final SubLObject item2, final SubLObject v_object, SubLObject test, SubLObject temp) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (temp == list_utilities.UNPROVIDED) {
            temp = (SubLObject)list_utilities.$kw126$TEMP;
        }
        return nswap_tree(item1, item2, conses_high.copy_tree(v_object), test, temp);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 117011L)
    public static SubLObject tree_find_all_nested_if(final SubLObject test, final SubLObject v_object, SubLObject key) {
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        if (list_utilities.NIL != Functions.funcall(test, Functions.funcall(key, v_object))) {
            return ConsesLow.append((SubLObject)ConsesLow.list(v_object), tree_find_all_nested_if_int(test, v_object, key));
        }
        return tree_find_all_nested_if_int(test, v_object, key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 117403L)
    public static SubLObject tree_find_all_nested_if_int(final SubLObject test, final SubLObject v_object, final SubLObject key) {
        return (SubLObject)(v_object.isCons() ? ConsesLow.append(tree_find_all_nested_if(test, v_object.first(), key), tree_find_all_nested_if(test, v_object.rest(), key)) : list_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 118436L)
    public static SubLObject hash_delete_duplicates(final SubLObject sequence, SubLObject hashtable, SubLObject key, SubLObject start, SubLObject end) {
        if (hashtable == list_utilities.UNPROVIDED) {
            hashtable = list_utilities.$remove_duplicates_equal_table$.getGlobalValue();
        }
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        if (start == list_utilities.UNPROVIDED) {
            start = (SubLObject)list_utilities.ZERO_INTEGER;
        }
        if (end == list_utilities.UNPROVIDED) {
            end = (SubLObject)list_utilities.NIL;
        }
        assert list_utilities.NIL != Types.listp(sequence) : sequence;
        assert list_utilities.NIL != Types.hash_table_p(hashtable) : hashtable;
        SubLObject result = (SubLObject)list_utilities.NIL;
        if (hashtable.eql(list_utilities.$remove_duplicates_eq_table$.getGlobalValue())) {
            SubLObject release = (SubLObject)list_utilities.NIL;
            try {
                release = Locks.seize_lock(list_utilities.$remove_duplicates_eq_table_lock$.getGlobalValue());
                result = hash_delete_duplicates_int(sequence, hashtable, key, start, end);
            }
            finally {
                if (list_utilities.NIL != release) {
                    Locks.release_lock(list_utilities.$remove_duplicates_eq_table_lock$.getGlobalValue());
                }
            }
        }
        else if (hashtable.eql(list_utilities.$remove_duplicates_eql_table$.getGlobalValue())) {
            SubLObject release = (SubLObject)list_utilities.NIL;
            try {
                release = Locks.seize_lock(list_utilities.$remove_duplicates_eql_table_lock$.getGlobalValue());
                result = hash_delete_duplicates_int(sequence, hashtable, key, start, end);
            }
            finally {
                if (list_utilities.NIL != release) {
                    Locks.release_lock(list_utilities.$remove_duplicates_eql_table_lock$.getGlobalValue());
                }
            }
        }
        else if (hashtable.eql(list_utilities.$remove_duplicates_equal_table$.getGlobalValue())) {
            SubLObject release = (SubLObject)list_utilities.NIL;
            try {
                release = Locks.seize_lock(list_utilities.$remove_duplicates_equal_table_lock$.getGlobalValue());
                result = hash_delete_duplicates_int(sequence, hashtable, key, start, end);
            }
            finally {
                if (list_utilities.NIL != release) {
                    Locks.release_lock(list_utilities.$remove_duplicates_equal_table_lock$.getGlobalValue());
                }
            }
        }
        else if (hashtable.eql(list_utilities.$remove_duplicates_equalp_table$.getGlobalValue())) {
            SubLObject release = (SubLObject)list_utilities.NIL;
            try {
                release = Locks.seize_lock(list_utilities.$remove_duplicates_equalp_table_lock$.getGlobalValue());
                result = hash_delete_duplicates_int(sequence, hashtable, key, start, end);
            }
            finally {
                if (list_utilities.NIL != release) {
                    Locks.release_lock(list_utilities.$remove_duplicates_equalp_table_lock$.getGlobalValue());
                }
            }
        }
        else {
            result = hash_delete_duplicates_int(sequence, hashtable, key, start, end);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 119557L)
    public static SubLObject hash_delete_duplicates_int(SubLObject sequence, final SubLObject hashtable, final SubLObject key, final SubLObject start, final SubLObject end) {
        Hashtables.clrhash(hashtable);
        final SubLObject start_seq = conses_high.nthcdr(start, sequence);
        SubLObject index = start;
        SubLObject done = (SubLObject)list_utilities.NIL;
        if (list_utilities.NIL == done) {
            SubLObject csome_list_var = start_seq;
            SubLObject item = (SubLObject)list_utilities.NIL;
            item = csome_list_var.first();
            while (list_utilities.NIL == done && list_utilities.NIL != csome_list_var) {
                if (end.isInteger() && end.numE(index)) {
                    done = (SubLObject)list_utilities.T;
                }
                else {
                    Hashtables.sethash(Functions.funcall(key, item), hashtable, index);
                }
                index = Numbers.add(index, (SubLObject)list_utilities.ONE_INTEGER);
                csome_list_var = csome_list_var.rest();
                item = csome_list_var.first();
            }
        }
        SubLObject back = (SubLObject)(start.numE((SubLObject)list_utilities.ZERO_INTEGER) ? list_utilities.NIL : conses_high.nthcdr(Numbers.subtract(start, (SubLObject)list_utilities.ONE_INTEGER), sequence));
        SubLObject done2 = (SubLObject)list_utilities.NIL;
        SubLObject index2 = (SubLObject)list_utilities.NIL;
        SubLObject current = (SubLObject)list_utilities.NIL;
        SubLObject item = (SubLObject)list_utilities.NIL;
        index2 = start;
        current = ((list_utilities.NIL != back) ? back.rest() : sequence);
        item = current.first();
        while (list_utilities.NIL == done2 && list_utilities.NIL != current) {
            done2 = (SubLObject)SubLObjectFactory.makeBoolean(end.isInteger() && end.numE(index2));
            if (list_utilities.NIL == done2) {
                if (index2.eql(Hashtables.gethash(Functions.funcall(key, item), hashtable, (SubLObject)list_utilities.UNPROVIDED))) {
                    back = current;
                }
                else if (list_utilities.NIL != back) {
                    ConsesLow.rplacd(back, current.rest());
                }
                else {
                    sequence = current.rest();
                }
            }
            index2 = Numbers.add(index2, (SubLObject)list_utilities.ONE_INTEGER);
            current = current.rest();
            item = current.first();
        }
        return sequence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 120464L)
    public static SubLObject hash_remove_duplicates(final SubLObject sequence, SubLObject hashtable, SubLObject key, SubLObject start, SubLObject end) {
        if (hashtable == list_utilities.UNPROVIDED) {
            hashtable = list_utilities.$remove_duplicates_equal_table$.getGlobalValue();
        }
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        if (start == list_utilities.UNPROVIDED) {
            start = (SubLObject)list_utilities.ZERO_INTEGER;
        }
        if (end == list_utilities.UNPROVIDED) {
            end = (SubLObject)list_utilities.NIL;
        }
        return hash_delete_duplicates(conses_high.copy_list(sequence), hashtable, key, start, end);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 120671L)
    public static SubLObject fast_delete_duplicates_hashtable(final SubLObject test) {
        final SubLObject pcase_var;
        final SubLObject symbol = pcase_var = hash_table_utilities.hash_test_to_symbol(test);
        if (pcase_var.eql((SubLObject)list_utilities.$sym108$QUOTE) || pcase_var.eql((SubLObject)list_utilities.EQ)) {
            return list_utilities.$remove_duplicates_eq_table$.getGlobalValue();
        }
        if (pcase_var.eql((SubLObject)list_utilities.$sym108$QUOTE) || pcase_var.eql((SubLObject)list_utilities.EQL)) {
            return list_utilities.$remove_duplicates_eql_table$.getGlobalValue();
        }
        if (pcase_var.eql((SubLObject)list_utilities.$sym108$QUOTE) || pcase_var.eql((SubLObject)list_utilities.EQUAL)) {
            return list_utilities.$remove_duplicates_equal_table$.getGlobalValue();
        }
        return list_utilities.$remove_duplicates_equalp_table$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 121029L)
    public static SubLObject fast_delete_duplicates(final SubLObject sequence, SubLObject test, SubLObject key, SubLObject hashtable, SubLObject start, SubLObject end) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQUAL);
        }
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        if (hashtable == list_utilities.UNPROVIDED) {
            hashtable = (SubLObject)list_utilities.NIL;
        }
        if (start == list_utilities.UNPROVIDED) {
            start = (SubLObject)list_utilities.ZERO_INTEGER;
        }
        if (end == list_utilities.UNPROVIDED) {
            end = (SubLObject)list_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert list_utilities.NIL != Types.function_spec_p(test) : test;
        if (list_utilities.NIL != lengthLE(sequence, (SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.UNPROVIDED)) {
            return sequence;
        }
        if (list_utilities.NIL != lengthLE(sequence, list_utilities.$magic_hashing_cutoff$.getDynamicValue(thread), (SubLObject)list_utilities.UNPROVIDED)) {
            return Sequences.delete_duplicates(sequence, test, key, start, end);
        }
        if (list_utilities.NIL != hashtable) {
            return hash_delete_duplicates(sequence, hashtable, key, start, end);
        }
        if (list_utilities.NIL != hash_table_utilities.valid_hash_test_p(test)) {
            return hash_delete_duplicates(sequence, fast_delete_duplicates_hashtable(test), key, start, end);
        }
        return Sequences.delete_duplicates(sequence, test, key, start, end);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 121755L)
    public static SubLObject fast_remove_duplicates(final SubLObject list, SubLObject test, SubLObject key, SubLObject hashtable, SubLObject start, SubLObject end) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQUAL);
        }
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        if (hashtable == list_utilities.UNPROVIDED) {
            hashtable = (SubLObject)list_utilities.NIL;
        }
        if (start == list_utilities.UNPROVIDED) {
            start = (SubLObject)list_utilities.ZERO_INTEGER;
        }
        if (end == list_utilities.UNPROVIDED) {
            end = (SubLObject)list_utilities.NIL;
        }
        return fast_delete_duplicates(conses_high.copy_list(list), test, key, hashtable, start, end);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 122007L)
    public static SubLObject fast_remove_duplicates_preserving_first(final SubLObject list, SubLObject test, SubLObject key) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQUAL);
        }
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        final SubLObject first_item = list.first();
        return nmove_to_front(first_item, fast_delete_duplicates(conses_high.copy_list(list), test, key, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED), test);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 122357L)
    public static SubLObject remove_duplicates_preserving_order(final SubLObject list, SubLObject test, SubLObject key) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQUAL);
        }
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        SubLObject result = (SubLObject)list_utilities.NIL;
        SubLObject cdolist_list_var = list;
        SubLObject elem = (SubLObject)list_utilities.NIL;
        elem = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            if (list_utilities.NIL == subl_promotions.memberP(elem, result, test, key)) {
                result = (SubLObject)ConsesLow.cons(elem, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 122686L)
    public static SubLObject remove_duplicate_forts(final SubLObject v_forts) {
        return fast_delete_duplicates(v_forts, Symbols.symbol_function((SubLObject)list_utilities.EQ), (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 122867L)
    public static SubLObject delete_duplicate_forts(final SubLObject v_forts) {
        return fast_delete_duplicates(v_forts, Symbols.symbol_function((SubLObject)list_utilities.EQ), (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 123035L)
    public static SubLObject hash_unique_elements(final SubLObject list, final SubLObject test) {
        final SubLObject temp_hash = Hashtables.make_hash_table(Sequences.length(list), test, (SubLObject)list_utilities.UNPROVIDED);
        SubLObject result = (SubLObject)list_utilities.NIL;
        SubLObject cdolist_list_var = list;
        SubLObject elem = (SubLObject)list_utilities.NIL;
        elem = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            final SubLObject val = Hashtables.gethash(elem, temp_hash, (SubLObject)list_utilities.UNPROVIDED);
            if (list_utilities.NIL != val) {
                if (val != list_utilities.$kw133$NOT_UNIQUE) {
                    Hashtables.sethash(elem, temp_hash, (SubLObject)list_utilities.$kw133$NOT_UNIQUE);
                }
            }
            else {
                Hashtables.sethash(elem, temp_hash, (SubLObject)list_utilities.$kw134$UNIQUE);
            }
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        SubLObject elem2 = (SubLObject)list_utilities.NIL;
        SubLObject val2 = (SubLObject)list_utilities.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(temp_hash);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                elem2 = Hashtables.getEntryKey(cdohash_entry);
                val2 = Hashtables.getEntryValue(cdohash_entry);
                if (val2 == list_utilities.$kw134$UNIQUE) {
                    result = (SubLObject)ConsesLow.cons(elem2, result);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 123548L)
    public static SubLObject unique_elements(final SubLObject list, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (list_utilities.NIL != hash_table_utilities.valid_hash_test_p(test)) {
            return hash_unique_elements(list, test);
        }
        final SubLObject len = Sequences.length(list);
        final SubLObject duplicates = Hashtables.make_hash_table(len, Symbols.symbol_function((SubLObject)list_utilities.EQL), (SubLObject)list_utilities.UNPROVIDED);
        SubLObject result = (SubLObject)list_utilities.NIL;
        SubLObject i;
        SubLObject ith_elem;
        SubLObject cdotimes_end_var;
        SubLObject j_i_1;
        SubLObject j;
        SubLObject jth_elem;
        for (i = (SubLObject)list_utilities.NIL, i = (SubLObject)list_utilities.ZERO_INTEGER; i.numL(len); i = Numbers.add(i, (SubLObject)list_utilities.ONE_INTEGER)) {
            if (list_utilities.NIL == Hashtables.gethash(i, duplicates, (SubLObject)list_utilities.UNPROVIDED)) {
                ith_elem = ConsesLow.nth(i, list);
                for (cdotimes_end_var = Numbers.subtract(len, i, (SubLObject)list_utilities.ONE_INTEGER), j_i_1 = (SubLObject)list_utilities.NIL, j_i_1 = (SubLObject)list_utilities.ZERO_INTEGER; j_i_1.numL(cdotimes_end_var); j_i_1 = Numbers.add(j_i_1, (SubLObject)list_utilities.ONE_INTEGER)) {
                    j = Numbers.add(j_i_1, i, (SubLObject)list_utilities.ONE_INTEGER);
                    if (list_utilities.NIL == Hashtables.gethash(j, duplicates, (SubLObject)list_utilities.UNPROVIDED)) {
                        jth_elem = ConsesLow.nth(j, list);
                        if (list_utilities.NIL != Functions.funcall(test, ith_elem, jth_elem)) {
                            Hashtables.sethash(i, duplicates, (SubLObject)list_utilities.T);
                            Hashtables.sethash(j, duplicates, (SubLObject)list_utilities.T);
                        }
                    }
                }
            }
        }
        for (i = (SubLObject)list_utilities.NIL, i = (SubLObject)list_utilities.ZERO_INTEGER; i.numL(len); i = Numbers.add(i, (SubLObject)list_utilities.ONE_INTEGER)) {
            if (list_utilities.NIL == Hashtables.gethash(i, duplicates, (SubLObject)list_utilities.UNPROVIDED)) {
                result = (SubLObject)ConsesLow.cons(ConsesLow.nth(i, list), result);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 124341L)
    public static SubLObject remove_all_n_icates(final SubLObject n, final SubLObject list, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        final SubLObject len = Sequences.length(list);
        final SubLObject count = Vectors.make_vector(len, (SubLObject)list_utilities.ZERO_INTEGER);
        final SubLObject canonical = vector_utilities.num_vector(len);
        SubLObject result = (SubLObject)list_utilities.NIL;
        SubLObject i;
        SubLObject ith_elem;
        SubLObject cdotimes_end_var;
        SubLObject j_i_1;
        SubLObject j;
        SubLObject jth_elem;
        for (i = (SubLObject)list_utilities.NIL, i = (SubLObject)list_utilities.ZERO_INTEGER; i.numL(len); i = Numbers.add(i, (SubLObject)list_utilities.ONE_INTEGER)) {
            if (!Vectors.aref(count, Vectors.aref(canonical, i)).numGE(n)) {
                ith_elem = ConsesLow.nth(i, list);
                for (cdotimes_end_var = Numbers.subtract(len, i, (SubLObject)list_utilities.ONE_INTEGER), j_i_1 = (SubLObject)list_utilities.NIL, j_i_1 = (SubLObject)list_utilities.ZERO_INTEGER; j_i_1.numL(cdotimes_end_var); j_i_1 = Numbers.add(j_i_1, (SubLObject)list_utilities.ONE_INTEGER)) {
                    j = Numbers.add(j_i_1, i, (SubLObject)list_utilities.ONE_INTEGER);
                    if (!Vectors.aref(count, Vectors.aref(canonical, j)).numGE(n)) {
                        jth_elem = ConsesLow.nth(j, list);
                        if (list_utilities.NIL != Functions.funcall(test, ith_elem, jth_elem)) {
                            Vectors.set_aref(canonical, j, Vectors.aref(canonical, i));
                            Vectors.set_aref(count, Vectors.aref(canonical, i), Numbers.add(Vectors.aref(count, Vectors.aref(canonical, i)), (SubLObject)list_utilities.ONE_INTEGER));
                        }
                    }
                }
            }
        }
        for (i = (SubLObject)list_utilities.NIL, i = (SubLObject)list_utilities.ZERO_INTEGER; i.numL(len); i = Numbers.add(i, (SubLObject)list_utilities.ONE_INTEGER)) {
            if (Vectors.aref(count, Vectors.aref(canonical, i)).numL(n)) {
                result = (SubLObject)ConsesLow.cons(ConsesLow.nth(i, list), result);
            }
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 125700L)
    public static SubLObject nsort_intersection(final SubLObject list_1, final SubLObject list_2, SubLObject pred, SubLObject key) {
        if (pred == list_utilities.UNPROVIDED) {
            pred = (SubLObject)list_utilities.$sym135$TERM__;
        }
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        return intersect_sorted(Sort.sort(list_1, pred, key), Sort.sort(list_2, pred, key), pred, key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 125869L)
    public static SubLObject intersect_sorted_all(final SubLObject lists, SubLObject test, SubLObject key) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        SubLObject result = lists.first();
        SubLObject cdolist_list_var = lists.rest();
        SubLObject list_i = (SubLObject)list_utilities.NIL;
        list_i = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            result = intersect_sorted(result, list_i, test, key);
            cdolist_list_var = cdolist_list_var.rest();
            list_i = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 126098L)
    public static SubLObject intersect_sorted(SubLObject sort_1, SubLObject sort_2, SubLObject pred, SubLObject key) {
        if (pred == list_utilities.UNPROVIDED) {
            pred = (SubLObject)list_utilities.$sym135$TERM__;
        }
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        assert list_utilities.NIL != Types.listp(sort_1) : sort_1;
        assert list_utilities.NIL != Types.listp(sort_2) : sort_2;
        SubLObject result = (SubLObject)list_utilities.NIL;
        while (list_utilities.NIL != sort_1 && list_utilities.NIL != sort_2) {
            final SubLObject item_1 = sort_1.first();
            final SubLObject item_2 = sort_2.first();
            if (list_utilities.NIL != Functions.funcall(pred, Functions.funcall(key, item_1), Functions.funcall(key, item_2))) {
                sort_1 = sort_1.rest();
            }
            else if (list_utilities.NIL != Functions.funcall(pred, Functions.funcall(key, item_2), Functions.funcall(key, item_1))) {
                sort_2 = sort_2.rest();
            }
            else {
                result = (SubLObject)ConsesLow.cons(item_1, result);
                sort_1 = sort_1.rest();
                sort_2 = sort_2.rest();
            }
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 126621L)
    public static SubLObject nintersect_sorted(final SubLObject sort_1, final SubLObject sort_2, SubLObject pred, SubLObject key) {
        if (pred == list_utilities.UNPROVIDED) {
            pred = (SubLObject)list_utilities.$sym135$TERM__;
        }
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        assert list_utilities.NIL != Types.listp(sort_1) : sort_1;
        assert list_utilities.NIL != Types.listp(sort_2) : sort_2;
        if (list_utilities.NIL != lesser_or_same_length_p(sort_1, sort_2)) {
            return nintersect_sorted_int(sort_1, sort_2, pred, key);
        }
        return nintersect_sorted_int(sort_2, sort_1, pred, key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 126978L)
    public static SubLObject nintersect_sorted_destroy_first_only(final SubLObject sort_1, final SubLObject sort_2, SubLObject pred, SubLObject key) {
        if (pred == list_utilities.UNPROVIDED) {
            pred = (SubLObject)list_utilities.$sym135$TERM__;
        }
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        assert list_utilities.NIL != Types.listp(sort_1) : sort_1;
        assert list_utilities.NIL != Types.listp(sort_2) : sort_2;
        return nintersect_sorted_int(sort_1, sort_2, pred, key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 127226L)
    public static SubLObject nintersect_sorted_int(SubLObject sort_1, SubLObject sort_2, final SubLObject pred, final SubLObject key) {
        SubLObject result = sort_1;
        SubLObject last_good_cons = (SubLObject)list_utilities.NIL;
        while (list_utilities.NIL != sort_1 && list_utilities.NIL != sort_2) {
            final SubLObject item_1 = sort_1.first();
            final SubLObject item_2 = sort_2.first();
            if (list_utilities.NIL != Functions.funcall(pred, Functions.funcall(key, item_1), Functions.funcall(key, item_2))) {
                if (list_utilities.NIL != last_good_cons) {
                    ConsesLow.rplacd(last_good_cons, sort_1.rest());
                }
                else {
                    result = sort_1.rest();
                }
                sort_1 = sort_1.rest();
            }
            else if (list_utilities.NIL != Functions.funcall(pred, Functions.funcall(key, item_2), Functions.funcall(key, item_1))) {
                sort_2 = sort_2.rest();
            }
            else {
                last_good_cons = sort_1;
                sort_1 = sort_1.rest();
                sort_2 = sort_2.rest();
            }
        }
        if (list_utilities.NIL != last_good_cons) {
            ConsesLow.rplacd(last_good_cons, (SubLObject)list_utilities.NIL);
        }
        else {
            result = (SubLObject)list_utilities.NIL;
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 128188L)
    public static SubLObject sort_intersection(final SubLObject list_1, final SubLObject list_2, SubLObject pred, SubLObject key) {
        if (pred == list_utilities.UNPROVIDED) {
            pred = (SubLObject)list_utilities.$sym135$TERM__;
        }
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        return nsort_intersection(conses_high.copy_list(list_1), conses_high.copy_list(list_2), pred, key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 128350L)
    public static SubLObject union_sorted(final SubLObject sort_1, final SubLObject sort_2, SubLObject pred, SubLObject key) {
        if (pred == list_utilities.UNPROVIDED) {
            pred = (SubLObject)list_utilities.$sym135$TERM__;
        }
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        return union_sorted_int(sort_1, sort_2, pred, key, (SubLObject)list_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 128492L)
    public static SubLObject nunion_sorted(final SubLObject sort_1, final SubLObject sort_2, SubLObject pred, SubLObject key) {
        if (pred == list_utilities.UNPROVIDED) {
            pred = (SubLObject)list_utilities.$sym135$TERM__;
        }
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        return union_sorted_int(sort_1, sort_2, pred, key, (SubLObject)list_utilities.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 128714L)
    public static SubLObject union_sorted_int(SubLObject sort_1, SubLObject sort_2, final SubLObject pred, final SubLObject key, final SubLObject destructiveP) {
        assert list_utilities.NIL != Types.listp(sort_1) : sort_1;
        assert list_utilities.NIL != Types.listp(sort_2) : sort_2;
        SubLObject result = (SubLObject)list_utilities.NIL;
        while (list_utilities.NIL != sort_1 && list_utilities.NIL != sort_2) {
            final SubLObject item_1 = sort_1.first();
            final SubLObject item_2 = sort_2.first();
            if (list_utilities.NIL != Functions.funcall(pred, Functions.funcall(key, item_1), Functions.funcall(key, item_2))) {
                result = (SubLObject)ConsesLow.cons(item_1, result);
                sort_1 = sort_1.rest();
            }
            else if (list_utilities.NIL != Functions.funcall(pred, Functions.funcall(key, item_2), Functions.funcall(key, item_1))) {
                result = (SubLObject)ConsesLow.cons(item_2, result);
                sort_2 = sort_2.rest();
            }
            else {
                result = (SubLObject)ConsesLow.cons(item_1, result);
                sort_1 = sort_1.rest();
                sort_2 = sort_2.rest();
            }
        }
        result = Sequences.nreverse(result);
        if (list_utilities.NIL != sort_1) {
            result = ((list_utilities.NIL != destructiveP) ? ConsesLow.append(result, sort_1) : ConsesLow.nconc(result, sort_1));
        }
        else if (list_utilities.NIL != sort_2) {
            result = ((list_utilities.NIL != destructiveP) ? ConsesLow.append(result, sort_2) : ConsesLow.nconc(result, sort_2));
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 129506L)
    public static SubLObject union_of_intersecting_sorted_lists(final SubLObject sorted_lists, SubLObject pred, SubLObject key) {
        if (pred == list_utilities.UNPROVIDED) {
            pred = (SubLObject)list_utilities.$sym136$SAFE__;
        }
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        return union_of_intersecting_sorted_lists_recursive(sorted_lists, (SubLObject)list_utilities.ZERO_INTEGER, pred, key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 130216L)
    public static SubLObject union_of_intersecting_sorted_lists_recursive(final SubLObject sorted_lists, final SubLObject index, final SubLObject pred, final SubLObject key) {
        if (index.numGE(Sequences.length(sorted_lists))) {
            return sorted_lists;
        }
        final SubLObject intersection_indices = which_intersect_element_sorted(sorted_lists, index, pred, key);
        SubLObject result = (SubLObject)list_utilities.NIL;
        if (list_utilities.NIL != singletonP(intersection_indices)) {
            return union_of_intersecting_sorted_lists_recursive(sorted_lists, Numbers.add(index, (SubLObject)list_utilities.ONE_INTEGER), pred, key);
        }
        SubLObject intersected_list = (SubLObject)list_utilities.NIL;
        SubLObject cdolist_list_var = intersection_indices;
        SubLObject idx = (SubLObject)list_utilities.NIL;
        idx = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            intersected_list = ConsesLow.append(ConsesLow.nth(idx, sorted_lists), intersected_list);
            cdolist_list_var = cdolist_list_var.rest();
            idx = cdolist_list_var.first();
        }
        intersected_list = delete_duplicates_sorted(Sort.sort(intersected_list, pred, key), (SubLObject)list_utilities.UNPROVIDED);
        result = (SubLObject)ConsesLow.cons(intersected_list, result);
        SubLObject list_var = (SubLObject)list_utilities.NIL;
        SubLObject list = (SubLObject)list_utilities.NIL;
        SubLObject i = (SubLObject)list_utilities.NIL;
        list_var = sorted_lists;
        list = list_var.first();
        for (i = (SubLObject)list_utilities.ZERO_INTEGER; list_utilities.NIL != list_var; list_var = list_var.rest(), list = list_var.first(), i = Numbers.add((SubLObject)list_utilities.ONE_INTEGER, i)) {
            if (list_utilities.NIL == subl_promotions.memberP(i, intersection_indices, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED)) {
                result = (SubLObject)ConsesLow.cons(list, result);
            }
        }
        return union_of_intersecting_sorted_lists_recursive(result, (SubLObject)list_utilities.ZERO_INTEGER, pred, key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 131238L)
    public static SubLObject delete_duplicates_sorted(final SubLObject sorted_list, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        SubLObject last_cons = sorted_list;
        for (SubLObject this_cons = sorted_list.rest(); list_utilities.NIL != this_cons; this_cons = this_cons.rest()) {
            if (list_utilities.NIL != Functions.funcall(test, this_cons.first(), last_cons.first())) {
                ConsesLow.rplacd(last_cons, this_cons.rest());
            }
            else {
                last_cons = this_cons;
            }
        }
        return sorted_list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 131638L)
    public static SubLObject remove_duplicates_sorted(final SubLObject sorted_list, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        return delete_duplicates_sorted(conses_high.copy_list(sorted_list), test);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 131774L)
    public static SubLObject position_wrt(final SubLObject item, final SubLObject test, final SubLObject list, SubLObject key, SubLObject start, SubLObject end) {
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        if (start == list_utilities.UNPROVIDED) {
            start = (SubLObject)list_utilities.ZERO_INTEGER;
        }
        if (end == list_utilities.UNPROVIDED) {
            end = (SubLObject)list_utilities.NIL;
        }
        assert list_utilities.NIL != Types.integerp(start) : start;
        assert list_utilities.NIL != Types.listp(list) : list;
        SubLObject target;
        SubLObject index;
        SubLObject limit;
        SubLObject list_item;
        for (target = Functions.funcall(key, item), index = start, limit = (end.isInteger() ? Numbers.add((SubLObject)list_utilities.ONE_INTEGER, end) : Sequences.length(list)), list_item = (SubLObject)list_utilities.NIL, list_item = ConsesLow.nth(index, list); !index.numE(limit) && list_utilities.NIL == Functions.funcall(test, target, Functions.funcall(key, list_item)); index = Numbers.add(index, (SubLObject)list_utilities.ONE_INTEGER), list_item = ConsesLow.nth(index, list)) {}
        if (!index.numE(limit)) {
            return index;
        }
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 132218L)
    public static SubLObject difference_sorted(SubLObject sort_1, SubLObject sort_2, SubLObject pred, SubLObject key) {
        if (pred == list_utilities.UNPROVIDED) {
            pred = (SubLObject)list_utilities.$sym135$TERM__;
        }
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        assert list_utilities.NIL != Types.listp(sort_1) : sort_1;
        assert list_utilities.NIL != Types.listp(sort_2) : sort_2;
        SubLObject result = (SubLObject)list_utilities.NIL;
        while (list_utilities.NIL != sort_1 && list_utilities.NIL != sort_2) {
            final SubLObject item_1 = sort_1.first();
            final SubLObject item_2 = sort_2.first();
            if (list_utilities.NIL != Functions.funcall(pred, Functions.funcall(key, item_1), Functions.funcall(key, item_2))) {
                result = (SubLObject)ConsesLow.cons(item_1, result);
                sort_1 = sort_1.rest();
            }
            else if (list_utilities.NIL != Functions.funcall(pred, Functions.funcall(key, item_2), Functions.funcall(key, item_1))) {
                sort_2 = sort_2.rest();
            }
            else {
                sort_1 = sort_1.rest();
                sort_2 = sort_2.rest();
            }
        }
        return ConsesLow.append(Sequences.nreverse(result), sort_1);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 132868L)
    public static SubLObject alist_p(final SubLObject v_object) {
        return Types.listp(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 133309L)
    public static SubLObject alist_lookup(final SubLObject alist, final SubLObject key, SubLObject test, SubLObject v_default) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (v_default == list_utilities.UNPROVIDED) {
            v_default = (SubLObject)list_utilities.NIL;
        }
        assert list_utilities.NIL != alist_p(alist) : alist;
        final SubLObject pair = conses_high.assoc(key, alist, test, (SubLObject)list_utilities.UNPROVIDED);
        if (list_utilities.NIL != pair) {
            return subl_promotions.values2(pair.rest(), (SubLObject)list_utilities.T);
        }
        return subl_promotions.values2(v_default, (SubLObject)list_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 133699L)
    public static SubLObject alist_lookup_without_values(final SubLObject alist, final SubLObject key, SubLObject test, SubLObject v_default) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (v_default == list_utilities.UNPROVIDED) {
            v_default = (SubLObject)list_utilities.NIL;
        }
        final SubLObject pair = conses_high.assoc(key, alist, test, (SubLObject)list_utilities.UNPROVIDED);
        return (list_utilities.NIL != pair) ? pair.rest() : v_default;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 134070L)
    public static SubLObject alist_nlookup_without_values(final SubLObject alist, final SubLObject key, SubLObject test, SubLObject v_default) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (v_default == list_utilities.UNPROVIDED) {
            v_default = (SubLObject)list_utilities.NIL;
        }
        if (test.eql(Symbols.symbol_function((SubLObject)list_utilities.EQ)) || test == list_utilities.EQ) {
            return alist_nlookup_eq(alist, key, v_default);
        }
        if (test.eql(Symbols.symbol_function((SubLObject)list_utilities.EQL)) || test == list_utilities.EQL) {
            return alist_nlookup_eql(alist, key, v_default);
        }
        if (test.eql(Symbols.symbol_function((SubLObject)list_utilities.EQUAL)) || test == list_utilities.EQUAL) {
            return alist_nlookup_equal(alist, key, v_default);
        }
        if (test.eql(Symbols.symbol_function((SubLObject)list_utilities.EQUALP)) || test == list_utilities.EQUALP) {
            return alist_nlookup_equalp(alist, key, v_default);
        }
        return alist_nlookup_funcall(alist, key, test, v_default);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 135118L)
    public static SubLObject alist_nlookup_eq(final SubLObject alist, final SubLObject key, SubLObject v_default) {
        if (v_default == list_utilities.UNPROVIDED) {
            v_default = (SubLObject)list_utilities.NIL;
        }
        SubLObject last_last_cons = (SubLObject)list_utilities.NIL;
        SubLObject last_cons = (SubLObject)list_utilities.NIL;
        SubLObject alist_cons;
        SubLObject pair;
        SubLObject candidate_key;
        for (alist_cons = (SubLObject)list_utilities.NIL, alist_cons = alist; !alist_cons.isAtom(); alist_cons = alist_cons.rest()) {
            pair = alist_cons.first();
            candidate_key = pair.first();
            if (key.eql(candidate_key)) {
                return alist_nlookup_success(last_last_cons, last_cons, alist_cons, pair.rest());
            }
            last_last_cons = last_cons;
            last_cons = alist_cons;
        }
        return v_default;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 135544L)
    public static SubLObject alist_nlookup_eql(final SubLObject alist, final SubLObject key, SubLObject v_default) {
        if (v_default == list_utilities.UNPROVIDED) {
            v_default = (SubLObject)list_utilities.NIL;
        }
        SubLObject last_last_cons = (SubLObject)list_utilities.NIL;
        SubLObject last_cons = (SubLObject)list_utilities.NIL;
        SubLObject alist_cons;
        SubLObject pair;
        SubLObject candidate_key;
        for (alist_cons = (SubLObject)list_utilities.NIL, alist_cons = alist; !alist_cons.isAtom(); alist_cons = alist_cons.rest()) {
            pair = alist_cons.first();
            candidate_key = pair.first();
            if (key.eql(candidate_key)) {
                return alist_nlookup_success(last_last_cons, last_cons, alist_cons, pair.rest());
            }
            last_last_cons = last_cons;
            last_cons = alist_cons;
        }
        return v_default;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 135972L)
    public static SubLObject alist_nlookup_equal(final SubLObject alist, final SubLObject key, SubLObject v_default) {
        if (v_default == list_utilities.UNPROVIDED) {
            v_default = (SubLObject)list_utilities.NIL;
        }
        SubLObject last_last_cons = (SubLObject)list_utilities.NIL;
        SubLObject last_cons = (SubLObject)list_utilities.NIL;
        SubLObject alist_cons;
        SubLObject pair;
        SubLObject candidate_key;
        for (alist_cons = (SubLObject)list_utilities.NIL, alist_cons = alist; !alist_cons.isAtom(); alist_cons = alist_cons.rest()) {
            pair = alist_cons.first();
            candidate_key = pair.first();
            if (key.equal(candidate_key)) {
                return alist_nlookup_success(last_last_cons, last_cons, alist_cons, pair.rest());
            }
            last_last_cons = last_cons;
            last_cons = alist_cons;
        }
        return v_default;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 136404L)
    public static SubLObject alist_nlookup_equalp(final SubLObject alist, final SubLObject key, SubLObject v_default) {
        if (v_default == list_utilities.UNPROVIDED) {
            v_default = (SubLObject)list_utilities.NIL;
        }
        SubLObject last_last_cons = (SubLObject)list_utilities.NIL;
        SubLObject last_cons = (SubLObject)list_utilities.NIL;
        SubLObject alist_cons;
        SubLObject pair;
        SubLObject candidate_key;
        for (alist_cons = (SubLObject)list_utilities.NIL, alist_cons = alist; !alist_cons.isAtom(); alist_cons = alist_cons.rest()) {
            pair = alist_cons.first();
            candidate_key = pair.first();
            if (key.equalp(candidate_key)) {
                return alist_nlookup_success(last_last_cons, last_cons, alist_cons, pair.rest());
            }
            last_last_cons = last_cons;
            last_cons = alist_cons;
        }
        return v_default;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 136838L)
    public static SubLObject alist_nlookup_funcall(final SubLObject alist, final SubLObject key, final SubLObject test, SubLObject v_default) {
        if (v_default == list_utilities.UNPROVIDED) {
            v_default = (SubLObject)list_utilities.NIL;
        }
        SubLObject last_last_cons = (SubLObject)list_utilities.NIL;
        SubLObject last_cons = (SubLObject)list_utilities.NIL;
        SubLObject alist_cons;
        SubLObject pair;
        SubLObject candidate_key;
        for (alist_cons = (SubLObject)list_utilities.NIL, alist_cons = alist; !alist_cons.isAtom(); alist_cons = alist_cons.rest()) {
            pair = alist_cons.first();
            candidate_key = pair.first();
            if (list_utilities.NIL != Functions.funcall(test, key, candidate_key)) {
                return alist_nlookup_success(last_last_cons, last_cons, alist_cons, pair.rest());
            }
            last_last_cons = last_cons;
            last_cons = alist_cons;
        }
        return v_default;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 137284L)
    public static SubLObject alist_nlookup_success(final SubLObject last_last_cons, final SubLObject last_cons, final SubLObject alist_cons, final SubLObject value) {
        if (list_utilities.NIL != last_last_cons) {
            ConsesLow.rplacd(last_last_cons, alist_cons);
            ConsesLow.rplacd(last_cons, alist_cons.rest());
            ConsesLow.rplacd(alist_cons, last_cons);
        }
        return value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 137638L)
    public static SubLObject alist_has_keyP(final SubLObject alist, final SubLObject key, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        assert list_utilities.NIL != alist_p(alist) : alist;
        return subl_promotions.memberP(key, alist, test, Symbols.symbol_function((SubLObject)list_utilities.$sym20$CAR));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 137846L)
    public static SubLObject alist_has_valueP(final SubLObject alist, final SubLObject value, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        assert list_utilities.NIL != alist_p(alist) : alist;
        return subl_promotions.memberP(value, alist, test, Symbols.symbol_function((SubLObject)list_utilities.$sym19$CDR));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 138064L)
    public static SubLObject alist_reverse_lookup(final SubLObject alist, final SubLObject value, SubLObject test, SubLObject v_default) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (v_default == list_utilities.UNPROVIDED) {
            v_default = (SubLObject)list_utilities.NIL;
        }
        assert list_utilities.NIL != alist_p(alist) : alist;
        final SubLObject pair = conses_high.rassoc(value, alist, test, (SubLObject)list_utilities.UNPROVIDED);
        if (list_utilities.NIL != pair) {
            return subl_promotions.values2(pair.first(), (SubLObject)list_utilities.T);
        }
        return subl_promotions.values2(v_default, (SubLObject)list_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 138488L)
    public static SubLObject alist_reverse_lookup_without_values(final SubLObject alist, final SubLObject value, SubLObject test, SubLObject v_default) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (v_default == list_utilities.UNPROVIDED) {
            v_default = (SubLObject)list_utilities.NIL;
        }
        assert list_utilities.NIL != alist_p(alist) : alist;
        final SubLObject pair = conses_high.rassoc(value, alist, test, (SubLObject)list_utilities.UNPROVIDED);
        return (list_utilities.NIL != pair) ? pair.first() : v_default;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 138840L)
    public static SubLObject alist_enter(SubLObject alist, final SubLObject key, final SubLObject value, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        assert list_utilities.NIL != alist_p(alist) : alist;
        final SubLObject pair = conses_high.assoc(key, alist, test, (SubLObject)list_utilities.UNPROVIDED);
        if (list_utilities.NIL != pair) {
            ConsesLow.rplacd(pair, value);
        }
        else {
            alist = conses_high.acons(key, value, alist);
        }
        return subl_promotions.values2(alist, sublisp_boolean(pair));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 139261L)
    public static SubLObject alist_enter_without_values(SubLObject alist, final SubLObject key, final SubLObject value, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        assert list_utilities.NIL != alist_p(alist) : alist;
        final SubLObject pair = conses_high.assoc(key, alist, test, (SubLObject)list_utilities.UNPROVIDED);
        if (list_utilities.NIL != pair) {
            ConsesLow.rplacd(pair, value);
        }
        else {
            alist = conses_high.acons(key, value, alist);
        }
        return alist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 139670L)
    public static SubLObject alist_capacity_enter_without_values(SubLObject alist, final SubLObject key, final SubLObject value, final SubLObject capacity, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (capacity.isZero()) {
            return (SubLObject)list_utilities.NIL;
        }
        alist = alist_enter_without_values(alist, key, value, test);
        if (list_utilities.NIL != lengthG(alist, capacity, (SubLObject)list_utilities.UNPROVIDED)) {
            ConsesLow.rplacd(conses_high.nthcdr(number_utilities.f_1_(capacity), alist), (SubLObject)list_utilities.NIL);
        }
        return alist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 140210L)
    public static SubLObject alist_promote(SubLObject alist, final SubLObject key, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        assert list_utilities.NIL != alist_p(alist) : alist;
        final SubLObject pair = conses_high.assoc(key, alist, test, (SubLObject)list_utilities.UNPROVIDED);
        if (list_utilities.NIL != pair && !pair.eql(alist.first())) {
            alist = (SubLObject)ConsesLow.cons(pair, delete_first(pair, alist, Symbols.symbol_function((SubLObject)list_utilities.EQ)));
        }
        return alist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 140593L)
    public static SubLObject alist_delete(SubLObject alist, final SubLObject key, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        assert list_utilities.NIL != alist_p(alist) : alist;
        final SubLObject pair = conses_high.assoc(key, alist, test, (SubLObject)list_utilities.UNPROVIDED);
        if (list_utilities.NIL != pair) {
            alist = delete_first(pair, alist, (SubLObject)list_utilities.UNPROVIDED);
        }
        return subl_promotions.values2(alist, sublisp_boolean(pair));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 140987L)
    public static SubLObject alist_delete_without_values(SubLObject alist, final SubLObject key, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        assert list_utilities.NIL != alist_p(alist) : alist;
        final SubLObject pair = conses_high.assoc(key, alist, test, (SubLObject)list_utilities.UNPROVIDED);
        if (list_utilities.NIL != pair) {
            alist = delete_first(pair, alist, (SubLObject)list_utilities.UNPROVIDED);
        }
        return alist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 141372L)
    public static SubLObject alist_remove(SubLObject alist, final SubLObject key, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        assert list_utilities.NIL != alist_p(alist) : alist;
        final SubLObject pair = conses_high.assoc(key, alist, test, (SubLObject)list_utilities.UNPROVIDED);
        if (list_utilities.NIL != pair) {
            alist = remove_first(pair, alist, (SubLObject)list_utilities.UNPROVIDED);
        }
        return subl_promotions.values2(alist, sublisp_boolean(pair));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 141766L)
    public static SubLObject alist_remove_without_values(SubLObject alist, final SubLObject key, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        assert list_utilities.NIL != alist_p(alist) : alist;
        final SubLObject pair = conses_high.assoc(key, alist, test, (SubLObject)list_utilities.UNPROVIDED);
        if (list_utilities.NIL != pair) {
            alist = remove_first(pair, alist, (SubLObject)list_utilities.UNPROVIDED);
        }
        return alist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 142151L)
    public static SubLObject alist_push(SubLObject alist, final SubLObject key, final SubLObject value, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        assert list_utilities.NIL != alist_p(alist) : alist;
        final SubLObject pair = conses_high.assoc(key, alist, test, (SubLObject)list_utilities.UNPROVIDED);
        if (list_utilities.NIL != pair) {
            ConsesLow.rplacd(pair, (SubLObject)ConsesLow.cons(value, pair.rest()));
        }
        else {
            alist = conses_high.acons(key, (SubLObject)ConsesLow.list(value), alist);
        }
        return subl_promotions.values2(alist, sublisp_boolean(pair));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 142606L)
    public static SubLObject alist_pushnew(SubLObject alist, final SubLObject key, final SubLObject value, SubLObject key_test, SubLObject value_test) {
        if (key_test == list_utilities.UNPROVIDED) {
            key_test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (value_test == list_utilities.UNPROVIDED) {
            value_test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        assert list_utilities.NIL != alist_p(alist) : alist;
        final SubLObject pair = conses_high.assoc(key, alist, key_test, (SubLObject)list_utilities.UNPROVIDED);
        if (list_utilities.NIL == pair) {
            alist = conses_high.acons(key, (SubLObject)ConsesLow.list(value), alist);
        }
        else if (list_utilities.NIL == conses_high.member(value, pair.rest(), value_test, (SubLObject)list_utilities.UNPROVIDED)) {
            ConsesLow.rplacd(pair, (SubLObject)ConsesLow.cons(value, pair.rest()));
        }
        return subl_promotions.values2(alist, sublisp_boolean(pair));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 143222L)
    public static SubLObject alist_remove_from_value(final SubLObject alist, final SubLObject key, final SubLObject value, SubLObject key_test, SubLObject value_test) {
        if (key_test == list_utilities.UNPROVIDED) {
            key_test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (value_test == list_utilities.UNPROVIDED) {
            value_test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        final SubLObject pair = conses_high.assoc(key, alist, key_test, (SubLObject)list_utilities.UNPROVIDED);
        if (list_utilities.NIL != pair) {
            ConsesLow.rplacd(pair, Sequences.remove(value, pair.rest(), value_test, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED));
        }
        return alist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 143493L)
    public static SubLObject pushnew_onto_alist(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject alist_var = (SubLObject)list_utilities.NIL;
        SubLObject key = (SubLObject)list_utilities.NIL;
        SubLObject value = (SubLObject)list_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list138);
        alist_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list138);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list138);
        value = current.first();
        current = current.rest();
        final SubLObject key_test = (SubLObject)(current.isCons() ? current.first() : list_utilities.$list139);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)list_utilities.$list138);
        current = current.rest();
        final SubLObject value_test = (SubLObject)(current.isCons() ? current.first() : list_utilities.$list139);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)list_utilities.$list138);
        current = current.rest();
        if (list_utilities.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym12$CSETF, alist_var, (SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym140$ALIST_PUSHNEW, alist_var, key, value, key_test, value_test));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)list_utilities.$list138);
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 143690L)
    public static SubLObject push_onto_alist(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject alist_var = (SubLObject)list_utilities.NIL;
        SubLObject key = (SubLObject)list_utilities.NIL;
        SubLObject value = (SubLObject)list_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list141);
        alist_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list141);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list141);
        value = current.first();
        current = current.rest();
        final SubLObject key_test = (SubLObject)(current.isCons() ? current.first() : list_utilities.$list139);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)list_utilities.$list141);
        current = current.rest();
        if (list_utilities.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym12$CSETF, alist_var, (SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym142$ALIST_PUSH, alist_var, key, value, key_test));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)list_utilities.$list141);
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 143849L)
    public static SubLObject enter_into_alist(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject alist_var = (SubLObject)list_utilities.NIL;
        SubLObject key = (SubLObject)list_utilities.NIL;
        SubLObject value = (SubLObject)list_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list143);
        alist_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list143);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list143);
        value = current.first();
        current = current.rest();
        final SubLObject test = (SubLObject)(current.isCons() ? current.first() : list_utilities.$list139);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)list_utilities.$list143);
        current = current.rest();
        if (list_utilities.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym12$CSETF, alist_var, (SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym144$ALIST_ENTER, alist_var, key, value, test));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)list_utilities.$list143);
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 144002L)
    public static SubLObject alist_keys(final SubLObject alist) {
        assert list_utilities.NIL != alist_p(alist) : alist;
        SubLObject v_answer = (SubLObject)list_utilities.NIL;
        SubLObject cdolist_list_var = alist;
        SubLObject cons = (SubLObject)list_utilities.NIL;
        cons = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject key = (SubLObject)list_utilities.NIL;
            SubLObject value = (SubLObject)list_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list145);
            key = current.first();
            current = (value = current.rest());
            v_answer = (SubLObject)ConsesLow.cons(key, v_answer);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        return Sequences.nreverse(v_answer);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 144237L)
    public static SubLObject alist_values(final SubLObject alist) {
        assert list_utilities.NIL != alist_p(alist) : alist;
        SubLObject v_answer = (SubLObject)list_utilities.NIL;
        SubLObject cdolist_list_var = alist;
        SubLObject cons = (SubLObject)list_utilities.NIL;
        cons = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject key = (SubLObject)list_utilities.NIL;
            SubLObject value = (SubLObject)list_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list145);
            key = current.first();
            current = (value = current.rest());
            v_answer = (SubLObject)ConsesLow.cons(value, v_answer);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        return Sequences.nreverse(v_answer);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 144475L)
    public static SubLObject alist_optimize(final SubLObject alist, final SubLObject predicate) {
        assert list_utilities.NIL != alist_p(alist) : alist;
        return conses_high.copy_alist(Sort.stable_sort(conses_high.copy_list(alist), predicate, Symbols.symbol_function((SubLObject)list_utilities.$sym20$CAR)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 144824L)
    public static SubLObject alist_E(final SubLObject alist1, final SubLObject alist2, SubLObject key_test, SubLObject value_test) {
        if (key_test == list_utilities.UNPROVIDED) {
            key_test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (value_test == list_utilities.UNPROVIDED) {
            value_test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(list_utilities.NIL != alist_subsumesP(alist1, alist2, key_test, value_test) && list_utilities.NIL != alist_subsumesP(alist2, alist1, key_test, value_test));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 145240L)
    public static SubLObject alist_subsumesP(final SubLObject alist1, final SubLObject alist2, SubLObject key_test, SubLObject value_test) {
        if (key_test == list_utilities.UNPROVIDED) {
            key_test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (value_test == list_utilities.UNPROVIDED) {
            value_test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        SubLObject failP;
        SubLObject rest;
        SubLObject cons;
        SubLObject current;
        SubLObject datum;
        SubLObject key;
        SubLObject value;
        for (failP = (SubLObject)list_utilities.NIL, rest = (SubLObject)list_utilities.NIL, rest = alist2; list_utilities.NIL == failP && list_utilities.NIL != rest; failP = (SubLObject)SubLObjectFactory.makeBoolean(list_utilities.NIL == Functions.funcall(value_test, value, alist_lookup(alist1, key, key_test, (SubLObject)list_utilities.UNPROVIDED))), rest = rest.rest()) {
            cons = rest.first();
            datum = (current = cons);
            key = (SubLObject)list_utilities.NIL;
            value = (SubLObject)list_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list145);
            key = current.first();
            current = (value = current.rest());
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(list_utilities.NIL == failP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 145845L)
    public static SubLObject alist_to_hash_table(final SubLObject alist, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        assert list_utilities.NIL != alist_p(alist) : alist;
        final SubLObject hashtable = Hashtables.make_hash_table(Sequences.length(alist), test, (SubLObject)list_utilities.UNPROVIDED);
        SubLObject cdolist_list_var = alist;
        SubLObject cons = (SubLObject)list_utilities.NIL;
        cons = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject key = (SubLObject)list_utilities.NIL;
            SubLObject value = (SubLObject)list_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list145);
            key = current.first();
            current = (value = current.rest());
            Hashtables.sethash(key, hashtable, value);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        return hashtable;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 146214L)
    public static SubLObject alist_to_reverse_hash_table(final SubLObject alist, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        assert list_utilities.NIL != alist_p(alist) : alist;
        final SubLObject hashtable = Hashtables.make_hash_table(Sequences.length(alist), test, (SubLObject)list_utilities.UNPROVIDED);
        SubLObject cdolist_list_var = alist;
        SubLObject cons = (SubLObject)list_utilities.NIL;
        cons = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject key = (SubLObject)list_utilities.NIL;
            SubLObject value = (SubLObject)list_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list145);
            key = current.first();
            current = (value = current.rest());
            Hashtables.sethash(value, hashtable, key);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        return hashtable;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 146648L)
    public static SubLObject sort_alist_by_keys(final SubLObject alist, final SubLObject predicate) {
        return Sort.sort(alist, predicate, Symbols.symbol_function((SubLObject)list_utilities.$sym20$CAR));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 146863L)
    public static SubLObject sort_alist_by_values(final SubLObject alist, final SubLObject predicate) {
        return Sort.sort(alist, predicate, Symbols.symbol_function((SubLObject)list_utilities.$sym19$CDR));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 147076L)
    public static SubLObject cons_to_tuple(final SubLObject cons) {
        SubLObject car = (SubLObject)list_utilities.NIL;
        SubLObject cdr = (SubLObject)list_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(cons, cons, (SubLObject)list_utilities.$list146);
        car = cons.first();
        final SubLObject current = cdr = cons.rest();
        return (SubLObject)ConsesLow.list(car, cdr);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 147238L)
    public static SubLObject tuple_to_cons(final SubLObject tuple) {
        SubLObject first = (SubLObject)list_utilities.NIL;
        SubLObject second = (SubLObject)list_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(tuple, tuple, (SubLObject)list_utilities.$list147);
        first = tuple.first();
        SubLObject current = tuple.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, tuple, (SubLObject)list_utilities.$list147);
        second = current.first();
        current = current.rest();
        if (list_utilities.NIL == current) {
            return (SubLObject)ConsesLow.cons(first, second);
        }
        cdestructuring_bind.cdestructuring_bind_error(tuple, (SubLObject)list_utilities.$list147);
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 147420L)
    public static SubLObject alist_to_tuples(final SubLObject alist) {
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)list_utilities.$sym148$CONS_TO_TUPLE), alist);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 147581L)
    public static SubLObject property_list_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(list_utilities.NIL == v_object || (list_utilities.NIL != proper_list_p(v_object) && list_utilities.NIL != Numbers.evenp(Sequences.length(v_object))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 147864L)
    public static SubLObject non_empty_property_list_p(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(list_utilities.NIL != obj && list_utilities.NIL != proper_list_p(obj));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 147972L)
    public static SubLObject filter_plist(final SubLObject plist, final SubLObject pred) {
        SubLObject new_plist = (SubLObject)list_utilities.NIL;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = (SubLObject)list_utilities.NIL, remainder = plist; list_utilities.NIL != remainder; remainder = conses_high.cddr(remainder)) {
            property = remainder.first();
            value = conses_high.cadr(remainder);
            if (list_utilities.NIL != Functions.funcall(pred, property)) {
                new_plist = (SubLObject)ConsesLow.cons(property, new_plist);
                new_plist = (SubLObject)ConsesLow.cons(value, new_plist);
            }
        }
        return Sequences.nreverse(new_plist);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 148288L)
    public static SubLObject prune_plist(final SubLObject plist, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQ);
        }
        SubLObject new_plist = (SubLObject)list_utilities.NIL;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = (SubLObject)list_utilities.NIL, remainder = plist; list_utilities.NIL != remainder; remainder = conses_high.cddr(remainder)) {
            property = remainder.first();
            value = conses_high.cadr(remainder);
            if (list_utilities.NIL == Functions.funcall(test, property, value)) {
                new_plist = (SubLObject)ConsesLow.cons(property, new_plist);
                new_plist = (SubLObject)ConsesLow.cons(value, new_plist);
            }
        }
        return Sequences.nreverse(new_plist);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 148690L)
    public static SubLObject plist_of_type_p(final SubLObject v_object, final SubLObject pred) {
        if (list_utilities.NIL == property_list_p(v_object)) {
            return (SubLObject)list_utilities.NIL;
        }
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = (SubLObject)list_utilities.NIL, remainder = v_object; list_utilities.NIL != remainder; remainder = conses_high.cddr(remainder)) {
            property = remainder.first();
            value = conses_high.cadr(remainder);
            if (list_utilities.NIL == Functions.funcall(pred, property)) {
                return (SubLObject)list_utilities.NIL;
            }
        }
        return (SubLObject)list_utilities.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 149005L)
    public static SubLObject plist_of_value_type_p(final SubLObject v_object, final SubLObject pred) {
        if (list_utilities.NIL == property_list_p(v_object)) {
            return (SubLObject)list_utilities.NIL;
        }
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = (SubLObject)list_utilities.NIL, remainder = v_object; list_utilities.NIL != remainder; remainder = conses_high.cddr(remainder)) {
            property = remainder.first();
            value = conses_high.cadr(remainder);
            if (list_utilities.NIL == Functions.funcall(pred, value)) {
                return (SubLObject)list_utilities.NIL;
            }
        }
        return (SubLObject)list_utilities.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 149322L)
    public static SubLObject make_plist(final SubLObject keys, final SubLObject data) {
        if (list_utilities.NIL == same_length_p(keys, data)) {
            Errors.error((SubLObject)list_utilities.$str78$The_lists_of_keys_and_data_are_of);
        }
        SubLObject result = (SubLObject)list_utilities.NIL;
        SubLObject key = (SubLObject)list_utilities.NIL;
        SubLObject key_$26 = (SubLObject)list_utilities.NIL;
        SubLObject datum = (SubLObject)list_utilities.NIL;
        SubLObject datum_$27 = (SubLObject)list_utilities.NIL;
        key = keys;
        key_$26 = key.first();
        datum = data;
        datum_$27 = datum.first();
        while (list_utilities.NIL != datum || list_utilities.NIL != key) {
            result = conses_high.putf(result, key_$26, datum_$27);
            key = key.rest();
            key_$26 = key.first();
            datum = datum.rest();
            datum_$27 = datum.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 149753L)
    public static SubLObject plist_enter(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject plist = (SubLObject)list_utilities.NIL;
        SubLObject indicator = (SubLObject)list_utilities.NIL;
        SubLObject value = (SubLObject)list_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list149);
        plist = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list149);
        indicator = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list149);
        value = current.first();
        current = current.rest();
        if (list_utilities.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym6$CSETQ, plist, (SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym150$PUTF, plist, indicator, value));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)list_utilities.$list149);
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 149903L)
    public static SubLObject plist_lookup(final SubLObject plist, final SubLObject key, SubLObject v_default) {
        if (v_default == list_utilities.UNPROVIDED) {
            v_default = (SubLObject)list_utilities.NIL;
        }
        return conses_high.getf(plist, key, v_default);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 149997L)
    public static SubLObject plist_increment(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject plist = (SubLObject)list_utilities.NIL;
        SubLObject key = (SubLObject)list_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list151);
        plist = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list151);
        key = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)list_utilities.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)list_utilities.NIL;
        SubLObject current_$28 = (SubLObject)list_utilities.NIL;
        while (list_utilities.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)list_utilities.$list151);
            current_$28 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)list_utilities.$list151);
            if (list_utilities.NIL == conses_high.member(current_$28, (SubLObject)list_utilities.$list152, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED)) {
                bad = (SubLObject)list_utilities.T;
            }
            if (current_$28 == list_utilities.$kw51$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (list_utilities.NIL != bad && list_utilities.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)list_utilities.$list151);
        }
        final SubLObject increment_tail = cdestructuring_bind.property_list_member((SubLObject)list_utilities.$kw153$INCREMENT, current);
        final SubLObject increment = (SubLObject)((list_utilities.NIL != increment_tail) ? conses_high.cadr(increment_tail) : list_utilities.ONE_INTEGER);
        return (SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym154$PLIST_ENTER, plist, key, (SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym34$_, (SubLObject)ConsesLow.listS((SubLObject)list_utilities.$sym155$PLIST_LOOKUP, plist, key, (SubLObject)list_utilities.$list25), increment));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 150149L)
    public static SubLObject plist_push(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject plist = (SubLObject)list_utilities.NIL;
        SubLObject key = (SubLObject)list_utilities.NIL;
        SubLObject value = (SubLObject)list_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list156);
        plist = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list156);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list156);
        value = current.first();
        current = current.rest();
        if (list_utilities.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym154$PLIST_ENTER, plist, key, (SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym13$CONS, value, (SubLObject)ConsesLow.listS((SubLObject)list_utilities.$sym155$PLIST_LOOKUP, plist, key, (SubLObject)list_utilities.$list72)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)list_utilities.$list156);
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 150283L)
    public static SubLObject plist_remove(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject plist = (SubLObject)list_utilities.NIL;
        SubLObject indicator_to_remove = (SubLObject)list_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list157);
        plist = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list157);
        indicator_to_remove = current.first();
        current = current.rest();
        if (list_utilities.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym6$CSETQ, plist, (SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym158$PLIST_EXCEPT, plist, (SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym58$LIST, indicator_to_remove)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)list_utilities.$list157);
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 150499L)
    public static SubLObject alist_to_plist(final SubLObject alist) {
        SubLObject plist = (SubLObject)list_utilities.NIL;
        SubLObject cdolist_list_var = Sequences.reverse(alist);
        SubLObject cons = (SubLObject)list_utilities.NIL;
        cons = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject key = (SubLObject)list_utilities.NIL;
            SubLObject value = (SubLObject)list_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list145);
            key = current.first();
            current = (value = current.rest());
            plist = (SubLObject)ConsesLow.cons(value, plist);
            plist = (SubLObject)ConsesLow.cons(key, plist);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        return plist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 150672L)
    public static SubLObject plist_to_alist(final SubLObject plist) {
        SubLObject alist = (SubLObject)list_utilities.NIL;
        SubLObject remainder;
        SubLObject key;
        SubLObject value;
        for (remainder = (SubLObject)list_utilities.NIL, remainder = plist; list_utilities.NIL != remainder; remainder = conses_high.cddr(remainder)) {
            key = remainder.first();
            value = conses_high.cadr(remainder);
            alist = alist_enter(alist, key, value, (SubLObject)list_utilities.UNPROVIDED);
        }
        return Sequences.nreverse(alist);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 150839L)
    public static SubLObject nmerge_plist(SubLObject mutate_plist, final SubLObject overrides_plist) {
        assert list_utilities.NIL != property_list_p(mutate_plist) : mutate_plist;
        assert list_utilities.NIL != property_list_p(overrides_plist) : overrides_plist;
        if (list_utilities.NIL == overrides_plist) {
            return mutate_plist;
        }
        if (list_utilities.NIL == mutate_plist) {
            return conses_high.copy_list(overrides_plist);
        }
        SubLObject remainder;
        SubLObject param;
        SubLObject value;
        for (remainder = (SubLObject)list_utilities.NIL, remainder = overrides_plist; list_utilities.NIL != remainder; remainder = conses_high.cddr(remainder)) {
            param = remainder.first();
            value = conses_high.cadr(remainder);
            mutate_plist = conses_high.putf(mutate_plist, param, value);
        }
        return mutate_plist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 151447L)
    public static SubLObject merge_plist(final SubLObject start_plist, final SubLObject overrides_plist) {
        return nmerge_plist(conses_high.copy_list(start_plist), overrides_plist);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 151677L)
    public static SubLObject sort_plist_by_properties(final SubLObject plist, final SubLObject predicate) {
        return alist_to_plist(sort_alist_by_keys(plist_to_alist(plist), predicate));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 151886L)
    public static SubLObject sort_plist_by_values(final SubLObject plist, final SubLObject predicate) {
        return alist_to_plist(sort_alist_by_values(plist_to_alist(plist), predicate));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 152089L)
    public static SubLObject sort_plist_via_position(final SubLObject plist, final SubLObject guide_seq, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        final SubLObject alist = plist_to_alist(plist);
        final SubLObject sorted_alist = sort_via_position(alist, guide_seq, test, Symbols.symbol_function((SubLObject)list_utilities.$sym20$CAR));
        final SubLObject sorted_plist = alist_to_plist(sorted_alist);
        return sorted_plist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 152474L)
    public static SubLObject indicator_presentP(final SubLObject plist, final SubLObject indicator) {
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = (SubLObject)list_utilities.NIL, remainder = plist; list_utilities.NIL != remainder; remainder = conses_high.cddr(remainder)) {
            property = remainder.first();
            value = conses_high.cadr(remainder);
            if (indicator.eql(property)) {
                return (SubLObject)list_utilities.T;
            }
        }
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 152729L)
    public static SubLObject plist_has_keyP(final SubLObject plist, final SubLObject key) {
        return indicator_presentP(plist, key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 152812L)
    public static SubLObject plist_has_keysP(final SubLObject plist, final SubLObject keys) {
        return Equality.equal(Sequences.length(keys), Sequences.length(conses_high.intersection(keys, plist_keys(plist), (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 152936L)
    public static SubLObject member_plist_key_p(final SubLObject key, final SubLObject plist) {
        return indicator_presentP(plist, key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 153187L)
    public static SubLObject non_nil_plist_valueP(final SubLObject plist, final SubLObject indicator) {
        if (list_utilities.NIL != conses_high.getf(plist, indicator, (SubLObject)list_utilities.UNPROVIDED)) {
            return (SubLObject)list_utilities.T;
        }
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 153430L)
    public static SubLObject get_property_with_defaults(final SubLObject property, final SubLObject property_list, final SubLObject default_property_list, SubLObject v_default) {
        if (v_default == list_utilities.UNPROVIDED) {
            v_default = (SubLObject)list_utilities.$kw160$NO_VALUE;
        }
        SubLObject value = conses_high.getf(property_list, property, v_default);
        if (value.eql(v_default)) {
            value = conses_high.getf(default_property_list, property, (SubLObject)list_utilities.UNPROVIDED);
        }
        return value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 153928L)
    public static SubLObject augment_plist_with_defaults(final SubLObject original_plist, final SubLObject default_plist) {
        SubLObject plist_to_return = conses_high.copy_list(original_plist);
        SubLObject remainder;
        SubLObject prop;
        SubLObject val;
        for (remainder = (SubLObject)list_utilities.NIL, remainder = default_plist; list_utilities.NIL != remainder; remainder = conses_high.cddr(remainder)) {
            prop = remainder.first();
            val = conses_high.cadr(remainder);
            plist_to_return = maybe_putf(plist_to_return, prop, val);
        }
        return plist_to_return;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 154297L)
    public static SubLObject plist_restricted_to_indicatorsP(final SubLObject obj, final SubLObject indicator_list) {
        if (list_utilities.NIL == property_list_p(obj)) {
            return (SubLObject)list_utilities.NIL;
        }
        SubLObject remainder;
        SubLObject key;
        SubLObject val;
        for (remainder = (SubLObject)list_utilities.NIL, remainder = obj; list_utilities.NIL != remainder; remainder = conses_high.cddr(remainder)) {
            key = remainder.first();
            val = conses_high.cadr(remainder);
            if (list_utilities.NIL == subl_promotions.memberP(key, indicator_list, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED)) {
                return (SubLObject)list_utilities.NIL;
            }
        }
        return (SubLObject)list_utilities.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 154603L)
    public static SubLObject maybe_putf(SubLObject plist, final SubLObject indicator, final SubLObject value) {
        if (list_utilities.NIL == indicator_presentP(plist, indicator)) {
            plist = conses_high.putf(plist, indicator, value);
        }
        return plist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 154870L)
    public static SubLObject plist_properties(final SubLObject plist) {
        SubLObject v_properties = (SubLObject)list_utilities.NIL;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = (SubLObject)list_utilities.NIL, remainder = plist; list_utilities.NIL != remainder; remainder = conses_high.cddr(remainder)) {
            property = remainder.first();
            value = conses_high.cadr(remainder);
            v_properties = (SubLObject)ConsesLow.cons(property, v_properties);
        }
        return Sequences.nreverse(v_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 155064L)
    public static SubLObject plist_keys(final SubLObject plist) {
        return plist_properties(plist);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 155133L)
    public static SubLObject plist_values(final SubLObject plist) {
        SubLObject values = (SubLObject)list_utilities.NIL;
        SubLObject remainder;
        SubLObject key;
        SubLObject value;
        for (remainder = (SubLObject)list_utilities.NIL, remainder = plist; list_utilities.NIL != remainder; remainder = conses_high.cddr(remainder)) {
            key = remainder.first();
            value = conses_high.cadr(remainder);
            values = (SubLObject)ConsesLow.cons(value, values);
        }
        return Sequences.nreverse(values);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 155314L)
    public static SubLObject plist_restricted_to_indicators(final SubLObject plist, final SubLObject indicators_to_keep) {
        SubLObject new_plist = (SubLObject)list_utilities.NIL;
        SubLObject remainder;
        SubLObject key;
        SubLObject value;
        for (remainder = (SubLObject)list_utilities.NIL, remainder = plist; list_utilities.NIL != remainder; remainder = conses_high.cddr(remainder)) {
            key = remainder.first();
            value = conses_high.cadr(remainder);
            if (list_utilities.NIL != subl_promotions.memberP(key, indicators_to_keep, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED)) {
                new_plist = conses_high.putf(new_plist, key, value);
            }
        }
        return new_plist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 155629L)
    public static SubLObject plist_except(final SubLObject plist, final SubLObject indicators_to_remove) {
        SubLObject new_plist = conses_high.copy_list(plist);
        SubLObject cdolist_list_var = indicators_to_remove;
        SubLObject indicator_to_remove = (SubLObject)list_utilities.NIL;
        indicator_to_remove = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            new_plist = conses_high.remf(new_plist, indicator_to_remove);
            cdolist_list_var = cdolist_list_var.rest();
            indicator_to_remove = cdolist_list_var.first();
        }
        return new_plist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 155948L)
    public static SubLObject plistlist_if_getf(final SubLObject plistlist, final SubLObject indicator, final SubLObject value, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQUAL);
        }
        SubLObject result = (SubLObject)list_utilities.NIL;
        SubLObject cdolist_list_var = plistlist;
        SubLObject plist = (SubLObject)list_utilities.NIL;
        plist = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            if (list_utilities.NIL != Functions.funcall(test, conses_high.getf(plist, indicator, (SubLObject)list_utilities.UNPROVIDED), value)) {
                result = (SubLObject)ConsesLow.cons(plist, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            plist = cdolist_list_var.first();
        }
        result = Sequences.nreverse(result);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 156275L)
    public static SubLObject plistlist_sort(final SubLObject plistlist, final SubLObject indicator, final SubLObject test) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)list_utilities.NIL;
        final SubLObject _prev_bind_0 = list_utilities.$plistlist_sort_indicator$.currentBinding(thread);
        try {
            list_utilities.$plistlist_sort_indicator$.bind(indicator, thread);
            result = Sort.sort(conses_high.copy_list(plistlist), test, (SubLObject)list_utilities.$sym161$PLISTLIST_SORT_KEY);
        }
        finally {
            list_utilities.$plistlist_sort_indicator$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 156496L)
    public static SubLObject plistlist_sort_key(final SubLObject plist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return conses_high.getf(plist, list_utilities.$plistlist_sort_indicator$.getDynamicValue(thread), (SubLObject)list_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 156589L)
    public static SubLObject sub_plistP(final SubLObject sub_plist, final SubLObject super_plist, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = (SubLObject)list_utilities.EQL;
        }
        SubLObject failP;
        SubLObject remainder;
        SubLObject key;
        SubLObject value;
        for (failP = (SubLObject)list_utilities.NIL, remainder = (SubLObject)list_utilities.NIL, remainder = sub_plist; list_utilities.NIL == failP && list_utilities.NIL != remainder; remainder = conses_high.cddr(remainder)) {
            key = remainder.first();
            value = conses_high.cadr(remainder);
            if (list_utilities.NIL == plist_has_keyP(super_plist, key) || list_utilities.NIL == Functions.funcall(test, value, conses_high.getf(super_plist, key, (SubLObject)list_utilities.UNPROVIDED))) {
                failP = (SubLObject)list_utilities.T;
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(list_utilities.NIL == failP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 157128L)
    public static SubLObject slow_plists_equalP(final SubLObject plist_a, final SubLObject plist_b, SubLObject value_test) {
        if (value_test == list_utilities.UNPROVIDED) {
            value_test = (SubLObject)list_utilities.EQL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(list_utilities.NIL != sub_plistP(plist_a, plist_b, value_test) && list_utilities.NIL != sub_plistP(plist_b, plist_a, value_test));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 157490L)
    public static SubLObject format_item_list(final SubLObject list) {
        final SubLObject pcase_var = Sequences.length(list);
        if (pcase_var.eql((SubLObject)list_utilities.ZERO_INTEGER)) {
            return (SubLObject)list_utilities.$str64$;
        }
        if (pcase_var.eql((SubLObject)list_utilities.ONE_INTEGER)) {
            return print_high.princ_to_string(list.first());
        }
        if (pcase_var.eql((SubLObject)list_utilities.TWO_INTEGER)) {
            return PrintLow.format((SubLObject)list_utilities.NIL, (SubLObject)list_utilities.$str162$_A_and__A, list.first(), conses_high.second(list));
        }
        final SubLObject strings = Mapping.mapcar((SubLObject)list_utilities.$sym163$PRINC_TO_STRING, list);
        SubLObject length = Numbers.add(Numbers.multiply((SubLObject)list_utilities.TWO_INTEGER, Numbers.subtract(Sequences.length(strings), (SubLObject)list_utilities.ONE_INTEGER)), (SubLObject)list_utilities.FOUR_INTEGER);
        SubLObject cdolist_list_var = strings;
        SubLObject string = (SubLObject)list_utilities.NIL;
        string = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            length = Numbers.add(length, Sequences.length(string));
            cdolist_list_var = cdolist_list_var.rest();
            string = cdolist_list_var.first();
        }
        final SubLObject ans = Strings.make_string(length, (SubLObject)list_utilities.UNPROVIDED);
        SubLObject i = (SubLObject)list_utilities.ZERO_INTEGER;
        SubLObject rest = (SubLObject)list_utilities.NIL;
        SubLObject string2 = (SubLObject)list_utilities.NIL;
        rest = strings;
        string2 = rest.first();
        while (list_utilities.NIL != rest) {
            SubLObject cdotimes_end_var;
            SubLObject j;
            for (cdotimes_end_var = Sequences.length(string2), j = (SubLObject)list_utilities.NIL, j = (SubLObject)list_utilities.ZERO_INTEGER; j.numL(cdotimes_end_var); j = Numbers.add(j, (SubLObject)list_utilities.ONE_INTEGER)) {
                Strings.set_char(ans, i, Strings.sublisp_char(string2, j));
                i = Numbers.add(i, (SubLObject)list_utilities.ONE_INTEGER);
            }
            if (list_utilities.NIL != rest.rest()) {
                if (list_utilities.NIL != rest.rest().rest()) {
                    SubLObject k;
                    for (k = (SubLObject)list_utilities.NIL, k = (SubLObject)list_utilities.ZERO_INTEGER; k.numL((SubLObject)list_utilities.TWO_INTEGER); k = Numbers.add(k, (SubLObject)list_utilities.ONE_INTEGER)) {
                        Strings.set_char(ans, i, Strings.sublisp_char((SubLObject)list_utilities.$str164$__, k));
                        i = Numbers.add(i, (SubLObject)list_utilities.ONE_INTEGER);
                    }
                }
                else {
                    SubLObject k;
                    for (k = (SubLObject)list_utilities.NIL, k = (SubLObject)list_utilities.ZERO_INTEGER; k.numL((SubLObject)list_utilities.SIX_INTEGER); k = Numbers.add(k, (SubLObject)list_utilities.ONE_INTEGER)) {
                        Strings.set_char(ans, i, Strings.sublisp_char((SubLObject)list_utilities.$str165$__and_, k));
                        i = Numbers.add(i, (SubLObject)list_utilities.ONE_INTEGER);
                    }
                }
            }
            rest = rest.rest();
            string2 = rest.first();
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 159400L)
    public static SubLObject print_plist_readably(final SubLObject plist, SubLObject stream) {
        if (stream == list_utilities.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        assert list_utilities.NIL != property_list_p(plist) : plist;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = (SubLObject)list_utilities.NIL, remainder = plist; list_utilities.NIL != remainder; remainder = conses_high.cddr(remainder)) {
            property = remainder.first();
            value = conses_high.cadr(remainder);
            PrintLow.format(stream, (SubLObject)list_utilities.$str166$_a_____a__, property, value);
        }
        return plist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 159618L)
    public static SubLObject pretty_print_plist(final SubLObject plist, SubLObject stream) {
        if (stream == list_utilities.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert list_utilities.NIL != property_list_p(plist) : plist;
        if (list_utilities.NIL != plist) {
            final SubLObject _prev_bind_0 = reader.$read_default_float_format$.currentBinding(thread);
            try {
                reader.$read_default_float_format$.bind((SubLObject)list_utilities.$sym167$DOUBLE_FLOAT, thread);
                final SubLObject max_length = number_utilities.maximum(Mapping.mapcar(Symbols.symbol_function((SubLObject)list_utilities.$sym40$LENGTH), Mapping.mapcar(Symbols.symbol_function((SubLObject)list_utilities.$sym168$STR), plist_properties(plist))), (SubLObject)list_utilities.UNPROVIDED);
                SubLObject remainder;
                SubLObject property;
                SubLObject value;
                for (remainder = (SubLObject)list_utilities.NIL, remainder = plist; list_utilities.NIL != remainder; remainder = conses_high.cddr(remainder)) {
                    property = remainder.first();
                    value = conses_high.cadr(remainder);
                    if (value.isDouble()) {
                        PrintLow.format(stream, (SubLObject)list_utilities.$str169$_a___4_2f__, string_utilities.to_string_of_length(property, max_length), value);
                    }
                    else {
                        PrintLow.format(stream, (SubLObject)list_utilities.$str170$_a___a__, string_utilities.to_string_of_length(property, max_length), value);
                    }
                }
            }
            finally {
                reader.$read_default_float_format$.rebind(_prev_bind_0, thread);
            }
        }
        return plist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 160150L)
    public static SubLObject pretty_prin1_plist(final SubLObject plist, SubLObject stream) {
        if (stream == list_utilities.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert list_utilities.NIL != property_list_p(plist) : plist;
        if (list_utilities.NIL != plist) {
            final SubLObject _prev_bind_0 = reader.$read_default_float_format$.currentBinding(thread);
            try {
                reader.$read_default_float_format$.bind((SubLObject)list_utilities.$sym167$DOUBLE_FLOAT, thread);
                final SubLObject max_length = number_utilities.maximum(Mapping.mapcar(Symbols.symbol_function((SubLObject)list_utilities.$sym40$LENGTH), Mapping.mapcar(Symbols.symbol_function((SubLObject)list_utilities.$sym168$STR), plist_properties(plist))), (SubLObject)list_utilities.UNPROVIDED);
                SubLObject remainder;
                SubLObject property;
                SubLObject value;
                for (remainder = (SubLObject)list_utilities.NIL, remainder = plist; list_utilities.NIL != remainder; remainder = conses_high.cddr(remainder)) {
                    property = remainder.first();
                    value = conses_high.cadr(remainder);
                    if (value.isDouble()) {
                        PrintLow.format(stream, (SubLObject)list_utilities.$str169$_a___4_2f__, string_utilities.to_string_of_length(property, max_length), value);
                    }
                    else {
                        PrintLow.format(stream, (SubLObject)list_utilities.$str171$_a___s__, string_utilities.to_string_of_length(property, max_length), value);
                    }
                }
            }
            finally {
                reader.$read_default_float_format$.rebind(_prev_bind_0, thread);
            }
        }
        return plist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 160682L)
    public static SubLObject pretty_print_alist(final SubLObject alist, SubLObject stream) {
        if (stream == list_utilities.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        return pretty_print_plist(alist_to_plist(alist), stream);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 160822L)
    public static SubLObject print_list_of_lists_as_table(final SubLObject list_of_lists, SubLObject stream) {
        if (stream == list_utilities.UNPROVIDED) {
            stream = (SubLObject)list_utilities.T;
        }
        assert list_utilities.NIL != non_dotted_list_p(list_of_lists) : list_of_lists;
        SubLObject cdolist_list_var = list_of_lists;
        SubLObject elem = (SubLObject)list_utilities.NIL;
        elem = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            assert list_utilities.NIL != Types.listp(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        SubLObject list_of_string_lists = (SubLObject)list_utilities.NIL;
        cdolist_list_var = list_of_lists;
        SubLObject list = (SubLObject)list_utilities.NIL;
        list = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            list_of_string_lists = (SubLObject)ConsesLow.cons(Mapping.mapcar(Symbols.symbol_function((SubLObject)list_utilities.$sym172$TO_STRING), list), list_of_string_lists);
            cdolist_list_var = cdolist_list_var.rest();
            list = cdolist_list_var.first();
        }
        list_of_string_lists = Sequences.nreverse(list_of_string_lists);
        final SubLObject num_cols = number_utilities.maximum(Mapping.mapcar(Symbols.symbol_function((SubLObject)list_utilities.$sym40$LENGTH), list_of_string_lists), (SubLObject)list_utilities.UNPROVIDED);
        SubLObject column_widths = (SubLObject)list_utilities.NIL;
        SubLObject index;
        SubLObject width;
        SubLObject cdolist_list_var2;
        SubLObject list2;
        SubLObject string_length;
        for (index = (SubLObject)list_utilities.NIL, index = (SubLObject)list_utilities.ZERO_INTEGER; index.numL(num_cols); index = Numbers.add(index, (SubLObject)list_utilities.ONE_INTEGER)) {
            width = (SubLObject)list_utilities.ZERO_INTEGER;
            cdolist_list_var2 = list_of_string_lists;
            list2 = (SubLObject)list_utilities.NIL;
            list2 = cdolist_list_var2.first();
            while (list_utilities.NIL != cdolist_list_var2) {
                string_length = Sequences.length(ConsesLow.nth(index, list2));
                width = Numbers.max(width, string_length);
                cdolist_list_var2 = cdolist_list_var2.rest();
                list2 = cdolist_list_var2.first();
            }
            column_widths = (SubLObject)ConsesLow.cons(width, column_widths);
        }
        column_widths = Sequences.nreverse(column_widths);
        SubLObject cdolist_list_var3 = list_of_string_lists;
        SubLObject list3 = (SubLObject)list_utilities.NIL;
        list3 = cdolist_list_var3.first();
        while (list_utilities.NIL != cdolist_list_var3) {
            streams_high.terpri(stream);
            SubLObject string = (SubLObject)list_utilities.NIL;
            SubLObject string_$29 = (SubLObject)list_utilities.NIL;
            SubLObject column_width = (SubLObject)list_utilities.NIL;
            SubLObject column_width_$30 = (SubLObject)list_utilities.NIL;
            string = list3;
            string_$29 = string.first();
            column_width = column_widths;
            column_width_$30 = column_width.first();
            while (list_utilities.NIL != column_width || list_utilities.NIL != string) {
                print_high.princ((SubLObject)list_utilities.$str173$___, stream);
                if (list_utilities.NIL != string_$29) {
                    print_high.princ(string_utilities.to_string_of_length(string_$29, column_width_$30), stream);
                }
                else {
                    print_high.princ(Strings.make_string(column_width_$30, (SubLObject)list_utilities.UNPROVIDED), stream);
                }
                string = string.rest();
                string_$29 = string.first();
                column_width = column_width.rest();
                column_width_$30 = column_width.first();
            }
            cdolist_list_var3 = cdolist_list_var3.rest();
            list3 = cdolist_list_var3.first();
        }
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 162247L)
    public static SubLObject print_list_as_delimited_line(final SubLObject list, SubLObject delimiter, SubLObject stream) {
        if (delimiter == list_utilities.UNPROVIDED) {
            delimiter = (SubLObject)Characters.CHAR_comma;
        }
        if (stream == list_utilities.UNPROVIDED) {
            stream = (SubLObject)list_utilities.T;
        }
        assert list_utilities.NIL != Types.listp(list) : list;
        print_high.prin1(list.first(), stream);
        SubLObject cdolist_list_var = list.rest();
        SubLObject value = (SubLObject)list_utilities.NIL;
        value = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            print_high.princ(delimiter, stream);
            print_high.prin1(value, stream);
            cdolist_list_var = cdolist_list_var.rest();
            value = cdolist_list_var.first();
        }
        return list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 162894L)
    public static SubLObject any_in_list(final SubLObject predicate, final SubLObject list, SubLObject key) {
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        SubLObject ans = (SubLObject)list_utilities.NIL;
        if (key.eql(Symbols.symbol_function((SubLObject)list_utilities.IDENTITY)) || key == list_utilities.IDENTITY) {
            if (list_utilities.NIL == ans) {
                SubLObject csome_list_var;
                SubLObject item;
                for (csome_list_var = list, item = (SubLObject)list_utilities.NIL, item = csome_list_var.first(); list_utilities.NIL == ans && list_utilities.NIL != csome_list_var; ans = Functions.funcall(predicate, item), csome_list_var = csome_list_var.rest(), item = csome_list_var.first()) {}
            }
        }
        else if (list_utilities.NIL == ans) {
            SubLObject csome_list_var;
            SubLObject item;
            for (csome_list_var = list, item = (SubLObject)list_utilities.NIL, item = csome_list_var.first(); list_utilities.NIL == ans && list_utilities.NIL != csome_list_var; ans = Functions.funcall(predicate, Functions.funcall(key, item)), csome_list_var = csome_list_var.rest(), item = csome_list_var.first()) {}
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 163281L)
    public static SubLObject every_in_list(final SubLObject predicate, final SubLObject list, SubLObject key) {
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        SubLObject ans = (SubLObject)list_utilities.NIL;
        if (key.eql(Symbols.symbol_function((SubLObject)list_utilities.IDENTITY)) || key == list_utilities.IDENTITY) {
            if (list_utilities.NIL == ans) {
                SubLObject csome_list_var;
                SubLObject item;
                for (csome_list_var = list, item = (SubLObject)list_utilities.NIL, item = csome_list_var.first(); list_utilities.NIL == ans && list_utilities.NIL != csome_list_var; ans = (SubLObject)SubLObjectFactory.makeBoolean(list_utilities.NIL == Functions.funcall(predicate, item)), csome_list_var = csome_list_var.rest(), item = csome_list_var.first()) {}
            }
        }
        else if (list_utilities.NIL == ans) {
            SubLObject csome_list_var;
            SubLObject item;
            for (csome_list_var = list, item = (SubLObject)list_utilities.NIL, item = csome_list_var.first(); list_utilities.NIL == ans && list_utilities.NIL != csome_list_var; ans = (SubLObject)SubLObjectFactory.makeBoolean(list_utilities.NIL == Functions.funcall(predicate, Functions.funcall(key, item))), csome_list_var = csome_list_var.rest(), item = csome_list_var.first()) {}
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(list_utilities.NIL == ans);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 163602L)
    public static SubLObject not_any_in_list(final SubLObject predicate, final SubLObject list, SubLObject key) {
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(list_utilities.NIL == any_in_list(predicate, list, key));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 163720L)
    public static SubLObject not_every_in_list(final SubLObject predicate, final SubLObject list, SubLObject key) {
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(list_utilities.NIL == every_in_list(predicate, list, key));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 163842L)
    public static SubLObject plist_difference(final SubLObject plist_a, final SubLObject plist_b, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        SubLObject plus_a = (SubLObject)list_utilities.NIL;
        SubLObject plus_b = (SubLObject)list_utilities.NIL;
        SubLObject remainder;
        SubLObject indicator;
        SubLObject value;
        for (remainder = (SubLObject)list_utilities.NIL, remainder = plist_a; list_utilities.NIL != remainder; remainder = conses_high.cddr(remainder)) {
            indicator = remainder.first();
            value = conses_high.cadr(remainder);
            if (list_utilities.NIL == Functions.funcall(test, value, conses_high.getf(plist_b, indicator, (SubLObject)list_utilities.UNPROVIDED))) {
                plus_a = conses_high.putf(plus_a, indicator, value);
            }
        }
        for (remainder = (SubLObject)list_utilities.NIL, remainder = plist_b; list_utilities.NIL != remainder; remainder = conses_high.cddr(remainder)) {
            indicator = remainder.first();
            value = conses_high.cadr(remainder);
            if (list_utilities.NIL == Functions.funcall(test, value, conses_high.getf(plist_a, indicator, (SubLObject)list_utilities.UNPROVIDED))) {
                plus_b = conses_high.putf(plus_b, indicator, value);
            }
        }
        return subl_promotions.values2(plus_a, plus_b);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 164422L)
    public static SubLObject list_subseq_subst_combos(final SubLObject list, final SubLObject subseq_subst_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert list_utilities.NIL != Types.listp(list) : list;
        assert list_utilities.NIL != Types.listp(subseq_subst_spec) : subseq_subst_spec;
        if (list_utilities.NIL == subseq_subst_spec) {
            return (SubLObject)ConsesLow.list(list);
        }
        SubLObject ans = (SubLObject)list_utilities.NIL;
        final SubLObject _prev_bind_0 = list_utilities.$subseq_subst_recursive_answers$.currentBinding(thread);
        try {
            list_utilities.$subseq_subst_recursive_answers$.bind((SubLObject)list_utilities.NIL, thread);
            ans = list_subseq_subst_combos_internal(list, subseq_subst_spec, (SubLObject)list_utilities.ZERO_INTEGER);
        }
        finally {
            list_utilities.$subseq_subst_recursive_answers$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 164860L)
    public static SubLObject list_subseq_subst_combos_internal(final SubLObject list, final SubLObject subseq_subst_spec, final SubLObject index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sub_answer = conses_high.assoc(list, list_utilities.$subseq_subst_recursive_answers$.getDynamicValue(thread), (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED).rest();
        if (list_utilities.NIL != sub_answer) {
            return sub_answer;
        }
        SubLObject answer_combos = (SubLObject)list_utilities.NIL;
        if (list_utilities.NIL == list) {
            answer_combos = (SubLObject)ConsesLow.list((SubLObject)list_utilities.NIL);
        }
        else {
            final SubLObject item = list.first();
            final SubLObject rest = list.rest();
            final SubLObject rest_index = Numbers.add(index, (SubLObject)list_utilities.ONE_INTEGER);
            final SubLObject rest_spec = conses_high.member(rest_index, subseq_subst_spec, Symbols.symbol_function((SubLObject)list_utilities.$sym98$__), Symbols.symbol_function((SubLObject)list_utilities.$sym20$CAR));
            SubLObject cdolist_list_var;
            final SubLObject recursive_combos = cdolist_list_var = list_subseq_subst_combos_internal(rest, rest_spec, rest_index);
            SubLObject recursive_combo = (SubLObject)list_utilities.NIL;
            recursive_combo = cdolist_list_var.first();
            while (list_utilities.NIL != cdolist_list_var) {
                answer_combos = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(item, recursive_combo), answer_combos);
                cdolist_list_var = cdolist_list_var.rest();
                recursive_combo = cdolist_list_var.first();
            }
            final SubLObject substs = conses_high.member(index, subseq_subst_spec, Symbols.symbol_function((SubLObject)list_utilities.$sym98$__), Symbols.symbol_function((SubLObject)list_utilities.$sym20$CAR));
            SubLObject done = (SubLObject)list_utilities.NIL;
            if (list_utilities.NIL == done) {
                SubLObject csome_list_var = substs;
                SubLObject subst = (SubLObject)list_utilities.NIL;
                subst = csome_list_var.first();
                while (list_utilities.NIL == done && list_utilities.NIL != csome_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = subst;
                    SubLObject subst_index = (SubLObject)list_utilities.NIL;
                    SubLObject subst_length = (SubLObject)list_utilities.NIL;
                    SubLObject subst_item = (SubLObject)list_utilities.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list174);
                    subst_index = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list174);
                    subst_length = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list174);
                    subst_item = current.first();
                    current = current.rest();
                    if (list_utilities.NIL == current) {
                        if (index.numE(subst_index)) {
                            final SubLObject subst_rest = conses_high.nthcdr(subst_length, list);
                            final SubLObject subst_rest_index = Numbers.add(index, subst_length);
                            final SubLObject subst_rest_spec = conses_high.member(subst_rest_index, subseq_subst_spec, Symbols.symbol_function((SubLObject)list_utilities.$sym98$__), Symbols.symbol_function((SubLObject)list_utilities.$sym20$CAR));
                            SubLObject cdolist_list_var2;
                            final SubLObject subst_recursive_combos = cdolist_list_var2 = list_subseq_subst_combos_internal(subst_rest, subst_rest_spec, subst_rest_index);
                            SubLObject subst_recursive_combo = (SubLObject)list_utilities.NIL;
                            subst_recursive_combo = cdolist_list_var2.first();
                            while (list_utilities.NIL != cdolist_list_var2) {
                                answer_combos = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(subst_item, subst_recursive_combo), answer_combos);
                                cdolist_list_var2 = cdolist_list_var2.rest();
                                subst_recursive_combo = cdolist_list_var2.first();
                            }
                        }
                        else {
                            done = (SubLObject)list_utilities.T;
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)list_utilities.$list174);
                    }
                    csome_list_var = csome_list_var.rest();
                    subst = csome_list_var.first();
                }
            }
            answer_combos = Sequences.nreverse(answer_combos);
        }
        list_utilities.$subseq_subst_recursive_answers$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(list, answer_combos), list_utilities.$subseq_subst_recursive_answers$.getDynamicValue(thread)), thread);
        return answer_combos;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 166692L)
    public static SubLObject greedy_list_subseq_subst(final SubLObject list, final SubLObject subseq_subst_spec) {
        assert list_utilities.NIL != Types.listp(list) : list;
        assert list_utilities.NIL != Types.listp(subseq_subst_spec) : subseq_subst_spec;
        if (list_utilities.NIL == subseq_subst_spec) {
            return list;
        }
        return greedy_list_subseq_subst_internal(list, subseq_subst_spec, (SubLObject)list_utilities.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 167027L)
    public static SubLObject greedy_list_subseq_subst_internal(final SubLObject list, final SubLObject subseq_subst_spec, final SubLObject index) {
        if (list_utilities.NIL == list) {
            return (SubLObject)list_utilities.NIL;
        }
        SubLObject next_substs = conses_high.member(index, subseq_subst_spec, Symbols.symbol_function((SubLObject)list_utilities.$sym98$__), Symbols.symbol_function((SubLObject)list_utilities.$sym20$CAR));
        final SubLObject later_substs = conses_high.member(index, next_substs, Symbols.symbol_function((SubLObject)list_utilities.$sym97$_), Symbols.symbol_function((SubLObject)list_utilities.$sym20$CAR));
        if (next_substs.eql(later_substs)) {
            return (SubLObject)ConsesLow.cons(list.first(), greedy_list_subseq_subst_internal(list.rest(), later_substs, Numbers.add(index, (SubLObject)list_utilities.ONE_INTEGER)));
        }
        while (list_utilities.NIL != next_substs.rest() && index.numE(conses_high.caar(next_substs.rest()))) {
            next_substs = next_substs.rest();
        }
        SubLObject current;
        final SubLObject datum = current = next_substs.first();
        SubLObject subst_index = (SubLObject)list_utilities.NIL;
        SubLObject subst_length = (SubLObject)list_utilities.NIL;
        SubLObject subst_item = (SubLObject)list_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list174);
        subst_index = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list174);
        subst_length = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list174);
        subst_item = current.first();
        current = current.rest();
        if (list_utilities.NIL == current) {
            final SubLObject subst_rest = conses_high.nthcdr(subst_length, list);
            final SubLObject subst_rest_index = Numbers.add(index, subst_length);
            final SubLObject subst_rest_spec = conses_high.member(subst_rest_index, subseq_subst_spec, Symbols.symbol_function((SubLObject)list_utilities.$sym98$__), Symbols.symbol_function((SubLObject)list_utilities.$sym20$CAR));
            return (SubLObject)ConsesLow.cons(subst_item, greedy_list_subseq_subst_internal(subst_rest, subst_rest_spec, subst_rest_index));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)list_utilities.$list174);
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 168357L)
    public static SubLObject extremal(final SubLObject list, final SubLObject test, SubLObject key) {
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        assert list_utilities.NIL != Types.listp(list) : list;
        if (list_utilities.NIL == list) {
            return (SubLObject)list_utilities.NIL;
        }
        SubLObject best = list.first();
        final SubLObject rest = list.rest();
        if (key.eql(Symbols.symbol_function((SubLObject)list_utilities.IDENTITY)) || key == list_utilities.IDENTITY) {
            SubLObject cdolist_list_var = rest;
            SubLObject item = (SubLObject)list_utilities.NIL;
            item = cdolist_list_var.first();
            while (list_utilities.NIL != cdolist_list_var) {
                if (list_utilities.NIL != Functions.funcall(test, item, best)) {
                    best = item;
                }
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            }
        }
        else {
            SubLObject cdolist_list_var = rest;
            SubLObject item = (SubLObject)list_utilities.NIL;
            item = cdolist_list_var.first();
            while (list_utilities.NIL != cdolist_list_var) {
                if (list_utilities.NIL != Functions.funcall(test, Functions.funcall(key, item), Functions.funcall(key, best))) {
                    best = item;
                }
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            }
        }
        return best;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 168951L)
    public static SubLObject extremals(final SubLObject list, final SubLObject test, SubLObject key) {
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        assert list_utilities.NIL != Types.listp(list) : list;
        if (list_utilities.NIL == list) {
            return (SubLObject)list_utilities.NIL;
        }
        SubLObject bests = (SubLObject)ConsesLow.list(list.first());
        final SubLObject rest = list.rest();
        if (key.eql(Symbols.symbol_function((SubLObject)list_utilities.IDENTITY)) || key == list_utilities.IDENTITY) {
            SubLObject cdolist_list_var = rest;
            SubLObject item = (SubLObject)list_utilities.NIL;
            item = cdolist_list_var.first();
            while (list_utilities.NIL != cdolist_list_var) {
                if (list_utilities.NIL != Functions.funcall(test, item, bests.first())) {
                    bests = (SubLObject)ConsesLow.list(item);
                }
                else if (list_utilities.NIL == Functions.funcall(test, bests.first(), item)) {
                    bests = (SubLObject)ConsesLow.cons(item, bests);
                }
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            }
        }
        else {
            SubLObject cdolist_list_var = rest;
            SubLObject item = (SubLObject)list_utilities.NIL;
            item = cdolist_list_var.first();
            while (list_utilities.NIL != cdolist_list_var) {
                if (list_utilities.NIL != Functions.funcall(test, Functions.funcall(key, item), Functions.funcall(key, bests.first()))) {
                    bests = (SubLObject)ConsesLow.list(item);
                }
                else if (list_utilities.NIL == Functions.funcall(test, Functions.funcall(key, bests.first()), Functions.funcall(key, item))) {
                    bests = (SubLObject)ConsesLow.cons(item, bests);
                }
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            }
        }
        return bests;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 169669L)
    public static SubLObject nth_rank_items(final SubLObject rank, final SubLObject list, SubLObject test, SubLObject key) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        assert list_utilities.NIL != Types.integerp(rank) : rank;
        assert list_utilities.NIL != Numbers.plusp(rank) : rank;
        assert list_utilities.NIL != Types.listp(list) : list;
        if (list_utilities.NIL == list) {
            return (SubLObject)list_utilities.NIL;
        }
        SubLObject current_rank = (SubLObject)list_utilities.ONE_INTEGER;
        SubLObject index = (SubLObject)list_utilities.ONE_INTEGER;
        SubLObject obj = Functions.funcall(key, list.first());
        SubLObject v_answer = (SubLObject)list_utilities.NIL;
        SubLObject done = (SubLObject)list_utilities.NIL;
        if (current_rank.numE(rank)) {
            v_answer = (SubLObject)ConsesLow.cons(list.first(), v_answer);
        }
        if (list_utilities.NIL == done) {
            SubLObject csome_list_var = list.rest();
            SubLObject list_item = (SubLObject)list_utilities.NIL;
            list_item = csome_list_var.first();
            while (list_utilities.NIL == done && list_utilities.NIL != csome_list_var) {
                index = Numbers.add(index, (SubLObject)list_utilities.ONE_INTEGER);
                final SubLObject item_obj = Functions.funcall(key, list_item);
                if (list_utilities.NIL == Functions.funcall(test, obj, item_obj)) {
                    current_rank = index;
                }
                if (current_rank.numE(rank)) {
                    v_answer = (SubLObject)ConsesLow.cons(list_item, v_answer);
                }
                obj = item_obj;
                done = Numbers.numG(current_rank, rank);
                csome_list_var = csome_list_var.rest();
                list_item = csome_list_var.first();
            }
        }
        return Sequences.nreverse(v_answer);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 170722L)
    public static SubLObject rerank(final SubLObject ordered_items, final SubLObject alternate_ranking, SubLObject test, SubLObject base_weight, SubLObject alternate_weight) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (base_weight == list_utilities.UNPROVIDED) {
            base_weight = (SubLObject)list_utilities.$float176$0_5;
        }
        if (alternate_weight == list_utilities.UNPROVIDED) {
            alternate_weight = (SubLObject)list_utilities.$float176$0_5;
        }
        final SubLObject num_of_items = Sequences.length(ordered_items);
        final SubLObject rank_values = dictionary.new_dictionary(test, num_of_items);
        SubLObject list_var = (SubLObject)list_utilities.NIL;
        SubLObject item = (SubLObject)list_utilities.NIL;
        SubLObject index = (SubLObject)list_utilities.NIL;
        list_var = ordered_items;
        item = list_var.first();
        for (index = (SubLObject)list_utilities.ZERO_INTEGER; list_utilities.NIL != list_var; list_var = list_var.rest(), item = list_var.first(), index = Numbers.add((SubLObject)list_utilities.ONE_INTEGER, index)) {
            dictionary.dictionary_enter(rank_values, item, Numbers.multiply(index, base_weight));
        }
        list_var = (SubLObject)list_utilities.NIL;
        item = (SubLObject)list_utilities.NIL;
        index = (SubLObject)list_utilities.NIL;
        list_var = alternate_ranking;
        item = list_var.first();
        for (index = (SubLObject)list_utilities.ZERO_INTEGER; list_utilities.NIL != list_var; list_var = list_var.rest(), item = list_var.first(), index = Numbers.add((SubLObject)list_utilities.ONE_INTEGER, index)) {
            final SubLObject base_weight_$31 = dictionary.dictionary_lookup(rank_values, item, (SubLObject)list_utilities.UNPROVIDED);
            if (base_weight_$31.isNumber()) {
                final SubLObject adjusted = Numbers.add(base_weight_$31, Numbers.multiply(index, alternate_weight));
                dictionary.dictionary_enter(rank_values, item, adjusted);
            }
        }
        return dictionary_utilities.dictionary_keys_sorted_by_values(rank_values, Symbols.symbol_function((SubLObject)list_utilities.$sym97$_), (SubLObject)list_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 172263L)
    public static SubLObject powerset(final SubLObject v_set) {
        if (list_utilities.NIL == v_set) {
            return (SubLObject)ConsesLow.list(v_set);
        }
        final SubLObject item = v_set.first();
        final SubLObject rest_powerset = powerset(v_set.rest());
        final SubLObject copy_powerset = conses_high.copy_list(rest_powerset);
        SubLObject rest = (SubLObject)list_utilities.NIL;
        SubLObject copy_item = (SubLObject)list_utilities.NIL;
        rest = copy_powerset;
        copy_item = rest.first();
        while (list_utilities.NIL != rest) {
            ConsesLow.rplaca(rest, (SubLObject)ConsesLow.cons(item, copy_item));
            rest = rest.rest();
            copy_item = rest.first();
        }
        return ConsesLow.nconc(rest_powerset, copy_powerset);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 172822L)
    public static SubLObject subsets_of_size(final SubLObject v_set, final SubLObject size) {
        if (list_utilities.NIL != lengthE(v_set, size, (SubLObject)list_utilities.UNPROVIDED)) {
            return (SubLObject)ConsesLow.list(v_set);
        }
        if (list_utilities.NIL != lengthG(v_set, size, (SubLObject)list_utilities.UNPROVIDED)) {
            return subsets_of_size_int(v_set, size);
        }
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 173172L)
    public static SubLObject subsets_of_size_int(final SubLObject v_set, final SubLObject size) {
        if (size.numE((SubLObject)list_utilities.ZERO_INTEGER)) {
            return (SubLObject)list_utilities.$list72;
        }
        if (!size.numGE((SubLObject)list_utilities.ONE_INTEGER)) {
            return (SubLObject)list_utilities.NIL;
        }
        if (list_utilities.NIL == v_set) {
            return (SubLObject)list_utilities.NIL;
        }
        final SubLObject to_be_consed = subsets_of_size_int(v_set.rest(), Numbers.subtract(size, (SubLObject)list_utilities.ONE_INTEGER));
        SubLObject subsets = (SubLObject)list_utilities.NIL;
        SubLObject cdolist_list_var = to_be_consed;
        SubLObject to_be = (SubLObject)list_utilities.NIL;
        to_be = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            subsets = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(v_set.first(), to_be), subsets);
            cdolist_list_var = cdolist_list_var.rest();
            to_be = cdolist_list_var.first();
        }
        return ConsesLow.append(subsets, subsets_of_size_int(v_set.rest(), size));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 173670L)
    public static SubLObject position_L(final SubLObject item1, final SubLObject item2, final SubLObject guide_seq, SubLObject test, SubLObject key) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        final SubLObject position1 = Sequences.position(item1, guide_seq, test, key, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED);
        final SubLObject position2 = Sequences.position(item2, guide_seq, test, key, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED);
        if (!position1.isInteger()) {
            return (SubLObject)list_utilities.NIL;
        }
        if (position2.isInteger()) {
            return Numbers.numL(position1, position2);
        }
        return (SubLObject)list_utilities.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 174467L)
    public static SubLObject sort_via_position(final SubLObject seq, final SubLObject guide_seq, SubLObject test, SubLObject key) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert list_utilities.NIL != Types.sequencep(seq) : seq;
        assert list_utilities.NIL != Types.sequencep(guide_seq) : guide_seq;
        SubLObject v_answer = (SubLObject)list_utilities.NIL;
        final SubLObject _prev_bind_0 = list_utilities.$sort_via_position_guide$.currentBinding(thread);
        final SubLObject _prev_bind_2 = list_utilities.$sort_via_position_test$.currentBinding(thread);
        try {
            list_utilities.$sort_via_position_guide$.bind(guide_seq, thread);
            list_utilities.$sort_via_position_test$.bind(test, thread);
            v_answer = Sort.sort(seq, (SubLObject)list_utilities.$sym177$SORT_VIA_POSITION_EARLIER, key);
        }
        finally {
            list_utilities.$sort_via_position_test$.rebind(_prev_bind_2, thread);
            list_utilities.$sort_via_position_guide$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 174980L)
    public static SubLObject stable_sort_via_position(final SubLObject seq, final SubLObject guide_seq, SubLObject test, SubLObject key) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert list_utilities.NIL != Types.sequencep(seq) : seq;
        assert list_utilities.NIL != Types.sequencep(guide_seq) : guide_seq;
        SubLObject v_answer = (SubLObject)list_utilities.NIL;
        final SubLObject _prev_bind_0 = list_utilities.$sort_via_position_guide$.currentBinding(thread);
        final SubLObject _prev_bind_2 = list_utilities.$sort_via_position_test$.currentBinding(thread);
        try {
            list_utilities.$sort_via_position_guide$.bind(guide_seq, thread);
            list_utilities.$sort_via_position_test$.bind(test, thread);
            v_answer = Sort.stable_sort(seq, (SubLObject)list_utilities.$sym177$SORT_VIA_POSITION_EARLIER, key);
        }
        finally {
            list_utilities.$sort_via_position_test$.rebind(_prev_bind_2, thread);
            list_utilities.$sort_via_position_guide$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 175514L)
    public static SubLObject sort_via_position_earlier(final SubLObject item1, final SubLObject item2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return position_L(item1, item2, list_utilities.$sort_via_position_guide$.getDynamicValue(thread), list_utilities.$sort_via_position_test$.getDynamicValue(thread), (SubLObject)list_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 175837L)
    public static SubLObject sort_via_test(final SubLObject seq, final SubLObject test, SubLObject key) {
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = (SubLObject)list_utilities.NIL;
        final SubLObject _prev_bind_0 = list_utilities.$sort_via_test_function$.currentBinding(thread);
        try {
            list_utilities.$sort_via_test_function$.bind(test, thread);
            v_answer = Sort.sort(seq, (SubLObject)list_utilities.$sym178$SORT_VIA_TEST_EARLIER, key);
        }
        finally {
            list_utilities.$sort_via_test_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 176171L)
    public static SubLObject stable_sort_via_test(final SubLObject seq, final SubLObject test, SubLObject key) {
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = (SubLObject)list_utilities.NIL;
        final SubLObject _prev_bind_0 = list_utilities.$sort_via_test_function$.currentBinding(thread);
        try {
            list_utilities.$sort_via_test_function$.bind(test, thread);
            v_answer = Sort.stable_sort(seq, (SubLObject)list_utilities.$sym178$SORT_VIA_TEST_EARLIER, key);
        }
        finally {
            list_utilities.$sort_via_test_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 176524L)
    public static SubLObject sort_via_test_earlier(final SubLObject obj1, final SubLObject obj2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(list_utilities.NIL != Functions.funcall(list_utilities.$sort_via_test_function$.getDynamicValue(thread), obj1) && list_utilities.NIL == Functions.funcall(list_utilities.$sort_via_test_function$.getDynamicValue(thread), obj2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 176698L)
    public static SubLObject sort_L(final SubLObject list, SubLObject key) {
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        return Sort.sort(list, Symbols.symbol_function((SubLObject)list_utilities.$sym97$_), key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 176912L)
    public static SubLObject sort_G(final SubLObject list, SubLObject key) {
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        return Sort.sort(list, Symbols.symbol_function((SubLObject)list_utilities.$sym179$_), key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 176998L)
    public static SubLObject safe_sort_L(final SubLObject list, SubLObject key) {
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        return Sort.sort(list, Symbols.symbol_function((SubLObject)list_utilities.$sym136$SAFE__), key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 177094L)
    public static SubLObject safe_sort_G(final SubLObject list, SubLObject key) {
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        return Sort.sort(list, Symbols.symbol_function((SubLObject)list_utilities.$sym180$SAFE__), key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 177190L)
    public static SubLObject sets_of_sets_L(final SubLObject sets_of_sets1, final SubLObject sets_of_sets2, SubLObject elem_lt_test) {
        if (elem_lt_test == list_utilities.UNPROVIDED) {
            elem_lt_test = (SubLObject)list_utilities.$sym181$SAFE_TREE__;
        }
        SubLObject sorted_sets_of_sets1 = (SubLObject)list_utilities.NIL;
        SubLObject sorted_sets_of_sets2 = (SubLObject)list_utilities.NIL;
        SubLObject cdolist_list_var = sets_of_sets1;
        SubLObject sets1 = (SubLObject)list_utilities.NIL;
        sets1 = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            SubLObject sorted_sets1 = (SubLObject)list_utilities.NIL;
            SubLObject cdolist_list_var_$32 = sets1;
            SubLObject set1 = (SubLObject)list_utilities.NIL;
            set1 = cdolist_list_var_$32.first();
            while (list_utilities.NIL != cdolist_list_var_$32) {
                sorted_sets1 = (SubLObject)ConsesLow.cons(Sort.sort(set1, elem_lt_test, (SubLObject)list_utilities.UNPROVIDED), sorted_sets1);
                cdolist_list_var_$32 = cdolist_list_var_$32.rest();
                set1 = cdolist_list_var_$32.first();
            }
            sorted_sets_of_sets1 = (SubLObject)ConsesLow.cons(Sort.sort(sorted_sets1, (SubLObject)list_utilities.$sym182$SET__, (SubLObject)list_utilities.UNPROVIDED), sorted_sets_of_sets1);
            cdolist_list_var = cdolist_list_var.rest();
            sets1 = cdolist_list_var.first();
        }
        cdolist_list_var = sets_of_sets2;
        SubLObject sets2 = (SubLObject)list_utilities.NIL;
        sets2 = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            SubLObject sorted_sets2 = (SubLObject)list_utilities.NIL;
            SubLObject cdolist_list_var_$33 = sets2;
            SubLObject set2 = (SubLObject)list_utilities.NIL;
            set2 = cdolist_list_var_$33.first();
            while (list_utilities.NIL != cdolist_list_var_$33) {
                sorted_sets2 = (SubLObject)ConsesLow.cons(Sort.sort(set2, elem_lt_test, (SubLObject)list_utilities.UNPROVIDED), sorted_sets2);
                cdolist_list_var_$33 = cdolist_list_var_$33.rest();
                set2 = cdolist_list_var_$33.first();
            }
            sorted_sets_of_sets2 = (SubLObject)ConsesLow.cons(Sort.sort(sorted_sets2, (SubLObject)list_utilities.$sym182$SET__, (SubLObject)list_utilities.UNPROVIDED), sorted_sets_of_sets2);
            cdolist_list_var = cdolist_list_var.rest();
            sets2 = cdolist_list_var.first();
        }
        return sets_L(sorted_sets_of_sets1, sorted_sets_of_sets2, elem_lt_test);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 177800L)
    public static SubLObject sets_L(final SubLObject sets1, final SubLObject sets2, SubLObject elem_lt_test) {
        if (elem_lt_test == list_utilities.UNPROVIDED) {
            elem_lt_test = (SubLObject)list_utilities.$sym181$SAFE_TREE__;
        }
        SubLObject sorted_sets1 = (SubLObject)list_utilities.NIL;
        SubLObject sorted_sets2 = (SubLObject)list_utilities.NIL;
        SubLObject cdolist_list_var = sets1;
        SubLObject set1 = (SubLObject)list_utilities.NIL;
        set1 = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            sorted_sets1 = (SubLObject)ConsesLow.cons(Sort.sort(set1, elem_lt_test, (SubLObject)list_utilities.UNPROVIDED), sorted_sets1);
            cdolist_list_var = cdolist_list_var.rest();
            set1 = cdolist_list_var.first();
        }
        cdolist_list_var = sets2;
        SubLObject set2 = (SubLObject)list_utilities.NIL;
        set2 = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            sorted_sets2 = (SubLObject)ConsesLow.cons(Sort.sort(set2, elem_lt_test, (SubLObject)list_utilities.UNPROVIDED), sorted_sets2);
            cdolist_list_var = cdolist_list_var.rest();
            set2 = cdolist_list_var.first();
        }
        return set_L(sorted_sets1, sorted_sets2, elem_lt_test);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 178123L)
    public static SubLObject set_L(final SubLObject set1, final SubLObject set2, SubLObject elem_lt_test) {
        if (elem_lt_test == list_utilities.UNPROVIDED) {
            elem_lt_test = (SubLObject)list_utilities.$sym181$SAFE_TREE__;
        }
        return Functions.funcall(elem_lt_test, Sort.sort(set1, elem_lt_test, (SubLObject)list_utilities.UNPROVIDED), Sort.sort(set2, elem_lt_test, (SubLObject)list_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 178270L)
    public static SubLObject list_structure(final SubLObject list, SubLObject filler) {
        if (filler == list_utilities.UNPROVIDED) {
            filler = (SubLObject)list_utilities.NIL;
        }
        SubLObject list_structure = conses_high.copy_tree(list);
        SubLObject cdolist_list_var;
        final SubLObject stuff = cdolist_list_var = tree_gather(list, (SubLObject)list_utilities.$sym183$NOT_CONSP, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED);
        SubLObject thingy = (SubLObject)list_utilities.NIL;
        thingy = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            list_structure = conses_high.subst(filler, thingy, list_structure, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            thingy = cdolist_list_var.first();
        }
        return list_structure;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 178624L)
    public static SubLObject list_structure_min(final SubLObject list_structures) {
        return Sort.sort(list_structures, (SubLObject)list_utilities.$sym184$LIST_STRUCTURE__, (SubLObject)list_utilities.UNPROVIDED).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 178825L)
    public static SubLObject list_structure_L(final SubLObject ls1, final SubLObject ls2) {
        return tree_L(ls1, ls2, (SubLObject)list_utilities.$sym185$FALSE, Symbols.symbol_function((SubLObject)list_utilities.EQL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 178900L)
    public static SubLObject tree_min(final SubLObject tree) {
        return Sort.sort(tree, (SubLObject)list_utilities.$sym181$SAFE_TREE__, (SubLObject)list_utilities.UNPROVIDED).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 178967L)
    public static SubLObject safe_tree_L(final SubLObject tree1, final SubLObject tree2) {
        return tree_L(tree1, tree2, (SubLObject)list_utilities.$sym136$SAFE__, Symbols.symbol_function((SubLObject)list_utilities.EQL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 179046L)
    public static SubLObject safe_L(final SubLObject object1, final SubLObject object2) {
        return (SubLObject)(object1.isNumber() ? (object2.isNumber() ? Numbers.numL(object1, object2) : list_utilities.NIL) : (object2.isNumber() ? list_utilities.T : list_utilities.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 179302L)
    public static SubLObject safe_G(final SubLObject object1, final SubLObject object2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(!object1.eql(object2) && list_utilities.NIL == safe_L(object1, object2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 179427L)
    public static SubLObject safe_GE(final SubLObject object1, final SubLObject object2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(object1.eql(object2) || list_utilities.NIL == safe_L(object1, object2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 179543L)
    public static SubLObject safe_LE(final SubLObject object1, final SubLObject object2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(object1.eql(object2) || list_utilities.NIL != safe_L(object1, object2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 179652L)
    public static SubLObject safe_max(final SubLObject list, SubLObject v_default) {
        if (v_default == list_utilities.UNPROVIDED) {
            v_default = (SubLObject)list_utilities.ZERO_INTEGER;
        }
        final SubLObject result = extremal(list, (SubLObject)list_utilities.$sym180$SAFE__, (SubLObject)list_utilities.UNPROVIDED);
        return result.isNumber() ? result : v_default;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 179813L)
    public static SubLObject safe_difference(final SubLObject object1, final SubLObject object2) {
        if (object1.isNumber() && object2.isNumber()) {
            return Numbers.subtract(object1, object2);
        }
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 179971L)
    public static SubLObject safe_quotient(final SubLObject object1, final SubLObject object2) {
        if (object1.isNumber() && object2.isNumber() && !list_utilities.ZERO_INTEGER.numE(object2)) {
            return Numbers.divide(object1, object2);
        }
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 180154L)
    public static SubLObject safe_product(final SubLObject object1, final SubLObject object2) {
        if (object1.isNumber() && object2.isNumber()) {
            return Numbers.multiply(object1, object2);
        }
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 180309L)
    public static SubLObject safe_sum(final SubLObject object1, final SubLObject object2) {
        if (object1.isNumber() && object2.isNumber()) {
            return Numbers.add(object1, object2);
        }
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 180511L)
    public static SubLObject safe_E(final SubLObject object1, final SubLObject object2) {
        if (object1.isNumber() && object2.isNumber()) {
            return Numbers.numE(object1, object2);
        }
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 180660L)
    public static SubLObject absL(final SubLObject object1, final SubLObject object2) {
        return Numbers.numL(Numbers.abs(object1), Numbers.abs(object2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 180844L)
    public static SubLObject absG(final SubLObject object1, final SubLObject object2) {
        return Numbers.numG(Numbers.abs(object1), Numbers.abs(object2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 181031L)
    public static SubLObject equalE(final SubLObject object1, final SubLObject object2) {
        if (object1.isNumber() && object2.isNumber()) {
            return Numbers.numE(object1, object2);
        }
        return Equality.equal(object1, object2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 181257L)
    public static SubLObject tree_L(final SubLObject tree1, final SubLObject tree2, SubLObject test, SubLObject equal_test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.$sym97$_);
        }
        if (equal_test == list_utilities.UNPROVIDED) {
            equal_test = Symbols.symbol_function((SubLObject)list_utilities.$sym186$_);
        }
        return Equality.eq((SubLObject)list_utilities.$kw187$LESS, tree_lt_intP(tree1, tree2, test, equal_test));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 181390L)
    public static SubLObject tree_lt_intP(final SubLObject tree1, final SubLObject tree2, final SubLObject test, final SubLObject equal_test) {
        if (tree1.isCons()) {
            if (!tree2.isCons()) {
                return (SubLObject)list_utilities.$kw187$LESS;
            }
            SubLObject status;
            SubLObject rest_tree1;
            SubLObject subtree1;
            SubLObject rest_tree2;
            SubLObject subtree2;
            for (status = (SubLObject)list_utilities.$kw188$EQUAL, rest_tree1 = (SubLObject)list_utilities.NIL, subtree1 = (SubLObject)list_utilities.NIL, rest_tree2 = (SubLObject)list_utilities.NIL, subtree2 = (SubLObject)list_utilities.NIL, rest_tree1 = tree1, subtree1 = rest_tree1.first(), rest_tree2 = tree2, subtree2 = rest_tree2.first(); status == list_utilities.$kw188$EQUAL && list_utilities.NIL != rest_tree1 && list_utilities.NIL != rest_tree2; status = tree_lt_intP(subtree1, subtree2, test, equal_test), rest_tree1 = rest_tree1.rest(), subtree1 = rest_tree1.first(), rest_tree2 = rest_tree2.rest(), subtree2 = rest_tree2.first()) {}
            if (list_utilities.NIL == rest_tree1 && list_utilities.NIL != rest_tree2) {
                return (SubLObject)list_utilities.$kw187$LESS;
            }
            if (list_utilities.NIL == rest_tree2 && list_utilities.NIL != rest_tree1) {
                return (SubLObject)list_utilities.$kw189$GREATER;
            }
            return status;
        }
        else {
            if (tree2.isCons()) {
                return (SubLObject)list_utilities.$kw189$GREATER;
            }
            return (SubLObject)((list_utilities.NIL != Functions.funcall(test, tree1, tree2)) ? list_utilities.$kw187$LESS : ((list_utilities.NIL != Functions.funcall(equal_test, tree1, tree2)) ? list_utilities.$kw188$EQUAL : list_utilities.$kw189$GREATER));
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 182318L)
    public static SubLObject parametrized_median(final SubLObject list, final SubLObject sort_pred) {
        final SubLObject sorted_list = Sort.sort(conses_high.copy_list(list), sort_pred, (SubLObject)list_utilities.UNPROVIDED);
        final SubLObject len = Sequences.length(sorted_list);
        final SubLObject pos = Numbers.integerDivide(len, (SubLObject)list_utilities.TWO_INTEGER);
        return ConsesLow.nth(pos, sorted_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 182807L)
    public static SubLObject shortest(final SubLObject lists) {
        return extremal(lists, Symbols.symbol_function((SubLObject)list_utilities.$sym97$_), Symbols.symbol_function((SubLObject)list_utilities.$sym40$LENGTH));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 182919L)
    public static SubLObject longest(final SubLObject lists) {
        return extremal(lists, Symbols.symbol_function((SubLObject)list_utilities.$sym179$_), Symbols.symbol_function((SubLObject)list_utilities.$sym40$LENGTH));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 183029L)
    public static SubLObject cons_count(final SubLObject tree) {
        if (tree.isAtom()) {
            return (SubLObject)list_utilities.ZERO_INTEGER;
        }
        SubLObject total = (SubLObject)list_utilities.ZERO_INTEGER;
        SubLObject rest;
        for (rest = (SubLObject)list_utilities.NIL, rest = tree; !rest.isAtom(); rest = rest.rest()) {
            total = Numbers.add(total, (SubLObject)list_utilities.ONE_INTEGER);
            total = Numbers.add(total, cons_count(rest.first()));
        }
        if (list_utilities.NIL != rest) {
            total = Numbers.add(total, cons_count(rest));
        }
        return total;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 183404L)
    public static SubLObject tree_delete(final SubLObject item, final SubLObject v_object, SubLObject test, SubLObject key) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        if (list_utilities.NIL != Functions.funcall(test, item, Functions.funcall(key, v_object))) {
            return (SubLObject)list_utilities.NIL;
        }
        if (!v_object.isCons()) {
            return v_object;
        }
        if (list_utilities.NIL != Functions.funcall(test, item, Functions.funcall(key, v_object.first()))) {
            return tree_delete(item, v_object.rest(), test, key);
        }
        return ConsesLow.rplacd(ConsesLow.rplaca(v_object, tree_delete(item, v_object.first(), test, key)), tree_delete(item, v_object.rest(), test, key));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 185242L)
    public static SubLObject tree_map(final SubLObject function, final SubLObject tree, SubLObject key) {
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        if (!tree.isCons()) {
            Functions.funcall(function, Functions.funcall(key, tree));
        }
        else {
            SubLObject rest;
            for (rest = (SubLObject)list_utilities.NIL, rest = tree; !rest.isAtom(); rest = rest.rest()) {
                tree_map(function, rest.first(), key);
            }
            if (list_utilities.NIL != rest) {
                Functions.funcall(function, Functions.funcall(key, rest));
            }
        }
        return tree;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 185840L)
    public static SubLObject tree_ntransform_if(final SubLObject v_object, final SubLObject pred, final SubLObject transform_function, SubLObject key) {
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        if (v_object.isAtom()) {
            if (list_utilities.NIL != Functions.funcall(pred, Functions.funcall(key, v_object))) {
                return Functions.funcall(transform_function, v_object);
            }
            return v_object;
        }
        else {
            if (!v_object.isCons()) {
                return (SubLObject)list_utilities.NIL;
            }
            SubLObject rest;
            for (rest = (SubLObject)list_utilities.NIL, rest = v_object; rest.isCons(); rest = rest.rest()) {
                ConsesLow.rplaca(rest, tree_ntransform_if(rest.first(), pred, transform_function, key));
                if (!rest.rest().isCons()) {
                    ConsesLow.rplacd(rest, tree_ntransform_if(rest.rest(), pred, transform_function, key));
                }
            }
            if (list_utilities.NIL != Functions.funcall(pred, Functions.funcall(key, v_object))) {
                return Functions.funcall(transform_function, v_object);
            }
            return v_object;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 187044L)
    public static SubLObject tree_transform_if(final SubLObject v_object, final SubLObject pred, final SubLObject transform_function, SubLObject key) {
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        return tree_ntransform_if(conses_high.copy_tree(v_object), pred, transform_function, key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 187288L)
    public static SubLObject cons_tree_find(final SubLObject item, final SubLObject v_object, SubLObject test, SubLObject key) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        return tree_find(item, v_object, test, key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 187455L)
    public static SubLObject tree_find(final SubLObject item, final SubLObject v_object, SubLObject test, SubLObject key) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)list_utilities.NIL;
        SubLObject foundP = (SubLObject)list_utilities.NIL;
        if (list_utilities.NIL != item && (key.eql(Symbols.symbol_function((SubLObject)list_utilities.IDENTITY)) || key == list_utilities.IDENTITY)) {
            if (test.eql(Symbols.symbol_function((SubLObject)list_utilities.EQ)) || test == list_utilities.EQ) {
                result = simple_tree_find(item, v_object);
                foundP = sublisp_boolean(result);
            }
            else if (test.eql(Symbols.symbol_function((SubLObject)list_utilities.EQL)) || test == list_utilities.EQL) {
                result = simple_tree_find_via_eql(item, v_object);
                foundP = sublisp_boolean(result);
            }
            else if (test.eql(Symbols.symbol_function((SubLObject)list_utilities.EQUAL)) || test == list_utilities.EQUAL) {
                result = simple_tree_find_via_equal(item, v_object);
                foundP = sublisp_boolean(result);
            }
            else {
                result = tree_find_without_values_int(item, v_object, test, key);
                foundP = sublisp_boolean(result);
            }
        }
        else {
            thread.resetMultipleValues();
            final SubLObject result_$34 = tree_find_int(item, v_object, test, key);
            final SubLObject foundP_$35 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            result = result_$34;
            foundP = foundP_$35;
        }
        return subl_promotions.values2(result, foundP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 188540L)
    public static SubLObject tree_find_int(final SubLObject item, final SubLObject v_object, final SubLObject test, final SubLObject key) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (list_utilities.NIL != Functions.funcall(test, item, Functions.funcall(key, v_object))) {
            return subl_promotions.values2(v_object, (SubLObject)list_utilities.T);
        }
        if (!v_object.isCons()) {
            return subl_promotions.values2((SubLObject)list_utilities.NIL, (SubLObject)list_utilities.NIL);
        }
        SubLObject list = (SubLObject)list_utilities.NIL;
        SubLObject sub = (SubLObject)list_utilities.NIL;
        list = v_object;
        sub = list.first();
        while (list.rest().isCons()) {
            thread.resetMultipleValues();
            final SubLObject ans = tree_find_int(item, sub, test, key);
            final SubLObject foundP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (list_utilities.NIL != foundP) {
                return subl_promotions.values2(ans, foundP);
            }
            list = list.rest();
            sub = list.first();
        }
        thread.resetMultipleValues();
        SubLObject ans = tree_find_int(item, list.first(), test, key);
        SubLObject foundP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (list_utilities.NIL != foundP) {
            return subl_promotions.values2(ans, foundP);
        }
        if (list_utilities.NIL != list.rest()) {
            thread.resetMultipleValues();
            ans = tree_find_int(item, list.rest(), test, key);
            foundP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (list_utilities.NIL != foundP) {
                return subl_promotions.values2(ans, foundP);
            }
        }
        return subl_promotions.values2((SubLObject)list_utilities.NIL, (SubLObject)list_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 189274L)
    public static SubLObject tree_find_without_values_int(final SubLObject item, final SubLObject v_object, final SubLObject test, final SubLObject key) {
        if (list_utilities.NIL != Functions.funcall(test, item, Functions.funcall(key, v_object))) {
            return v_object;
        }
        if (!v_object.isCons()) {
            return (SubLObject)list_utilities.NIL;
        }
        SubLObject list = (SubLObject)list_utilities.NIL;
        SubLObject sub = (SubLObject)list_utilities.NIL;
        list = v_object;
        sub = list.first();
        while (list.rest().isCons()) {
            final SubLObject ans = tree_find_without_values_int(item, sub, test, key);
            if (list_utilities.NIL != ans) {
                return ans;
            }
            list = list.rest();
            sub = list.first();
        }
        SubLObject ans = tree_find_without_values_int(item, list.first(), test, key);
        if (list_utilities.NIL != ans) {
            return ans;
        }
        if (list_utilities.NIL != list.rest()) {
            ans = tree_find_without_values_int(item, list.rest(), test, key);
            if (list_utilities.NIL != ans) {
                return ans;
            }
        }
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 189888L)
    public static SubLObject simple_tree_findP(final SubLObject item, final SubLObject v_object) {
        return sublisp_boolean(simple_tree_find(item, v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 190041L)
    public static SubLObject simple_tree_find(final SubLObject item, final SubLObject v_object) {
        if (item.eql(v_object)) {
            return item;
        }
        if (!v_object.isCons()) {
            return (SubLObject)list_utilities.NIL;
        }
        SubLObject list = (SubLObject)list_utilities.NIL;
        SubLObject sub = (SubLObject)list_utilities.NIL;
        list = v_object;
        sub = list.first();
        while (list.rest().isCons()) {
            final SubLObject foundP = simple_tree_find(item, sub);
            if (list_utilities.NIL != foundP) {
                return item;
            }
            list = list.rest();
            sub = list.first();
        }
        SubLObject foundP = simple_tree_find(item, list.first());
        if (list_utilities.NIL != foundP) {
            return item;
        }
        if (list_utilities.NIL != list.rest()) {
            foundP = simple_tree_find(item, list.rest());
            if (list_utilities.NIL != foundP) {
                return item;
            }
        }
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 190626L)
    public static SubLObject simple_tree_find_via_eqlP(final SubLObject item, final SubLObject v_object) {
        return sublisp_boolean(simple_tree_find_via_eql(item, v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 190796L)
    public static SubLObject simple_tree_find_via_eql(final SubLObject item, final SubLObject v_object) {
        if (item.eql(v_object)) {
            return item;
        }
        if (!v_object.isCons()) {
            return (SubLObject)list_utilities.NIL;
        }
        SubLObject list = (SubLObject)list_utilities.NIL;
        SubLObject sub = (SubLObject)list_utilities.NIL;
        list = v_object;
        sub = list.first();
        while (list.rest().isCons()) {
            final SubLObject foundP = simple_tree_find_via_eql(item, sub);
            if (list_utilities.NIL != foundP) {
                return item;
            }
            list = list.rest();
            sub = list.first();
        }
        SubLObject foundP = simple_tree_find_via_eql(item, list.first());
        if (list_utilities.NIL != foundP) {
            return item;
        }
        if (list_utilities.NIL != list.rest()) {
            foundP = simple_tree_find_via_eql(item, list.rest());
            if (list_utilities.NIL != foundP) {
                return item;
            }
        }
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 191415L)
    public static SubLObject simple_tree_find_via_equalP(final SubLObject item, final SubLObject v_object) {
        return sublisp_boolean(simple_tree_find_via_equal(item, v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 191591L)
    public static SubLObject simple_tree_find_via_equal(final SubLObject item, final SubLObject v_object) {
        if (item.equal(v_object)) {
            return item;
        }
        if (!v_object.isCons()) {
            return (SubLObject)list_utilities.NIL;
        }
        SubLObject list = (SubLObject)list_utilities.NIL;
        SubLObject sub = (SubLObject)list_utilities.NIL;
        list = v_object;
        sub = list.first();
        while (list.rest().isCons()) {
            final SubLObject foundP = simple_tree_find_via_equal(item, sub);
            if (list_utilities.NIL != foundP) {
                return item;
            }
            list = list.rest();
            sub = list.first();
        }
        SubLObject foundP = simple_tree_find_via_equal(item, list.first());
        if (list_utilities.NIL != foundP) {
            return item;
        }
        if (list_utilities.NIL != list.rest()) {
            foundP = simple_tree_find_via_equal(item, list.rest());
            if (list_utilities.NIL != foundP) {
                return item;
            }
        }
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 192224L)
    public static SubLObject tree_find_any(final SubLObject items, final SubLObject tree, SubLObject test, SubLObject key) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        SubLObject cdolist_list_var = items;
        SubLObject item = (SubLObject)list_utilities.NIL;
        item = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            if (list_utilities.NIL != tree_find(item, tree, test, key)) {
                return item;
            }
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        }
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 192503L)
    public static SubLObject cons_tree_find_if(final SubLObject test, final SubLObject v_object, SubLObject key) {
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        return tree_find_if(test, v_object, key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 192661L)
    public static SubLObject tree_find_if(final SubLObject test, final SubLObject v_object, SubLObject key) {
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        if (list_utilities.NIL != Functions.funcall(test, Functions.funcall(key, v_object))) {
            return v_object;
        }
        if (!v_object.isCons()) {
            return (SubLObject)list_utilities.NIL;
        }
        SubLObject ans = (SubLObject)list_utilities.NIL;
        SubLObject list = (SubLObject)list_utilities.NIL;
        SubLObject sub = (SubLObject)list_utilities.NIL;
        list = v_object;
        sub = list.first();
        while (list.rest().isCons()) {
            ans = tree_find_if(test, sub, key);
            if (list_utilities.NIL != ans) {
                return ans;
            }
            list = list.rest();
            sub = list.first();
        }
        ans = tree_find_if(test, list.first(), key);
        if (list_utilities.NIL != ans) {
            return ans;
        }
        if (list_utilities.NIL != list.rest()) {
            ans = tree_find_if(test, list.rest(), key);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 193184L)
    public static SubLObject cons_tree_count(final SubLObject item, final SubLObject v_object, SubLObject test, SubLObject key) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        return tree_count(item, v_object, test, key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 193351L)
    public static SubLObject tree_count(final SubLObject item, final SubLObject v_object, SubLObject test, SubLObject key) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        return tree_count_internal(item, v_object, test, key, (SubLObject)list_utilities.NIL, (SubLObject)list_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 193563L)
    public static SubLObject tree_countG(final SubLObject item, final SubLObject v_object, final SubLObject count, SubLObject test, SubLObject key) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        return Numbers.numG(tree_count_internal(item, v_object, test, key, count, (SubLObject)list_utilities.UNPROVIDED), count);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 193787L)
    public static SubLObject tree_countGE(final SubLObject item, final SubLObject v_object, final SubLObject count, SubLObject test, SubLObject key) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        return Numbers.numGE(tree_count_internal(item, v_object, test, key, count, (SubLObject)list_utilities.UNPROVIDED), count);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 194012L)
    public static SubLObject tree_countL(final SubLObject item, final SubLObject v_object, final SubLObject count, SubLObject test, SubLObject key) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        return Numbers.numL(tree_count_internal(item, v_object, test, key, count, (SubLObject)list_utilities.UNPROVIDED), count);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 194237L)
    public static SubLObject tree_countLE(final SubLObject item, final SubLObject v_object, final SubLObject count, SubLObject test, SubLObject key) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        return Numbers.numLE(tree_count_internal(item, v_object, test, key, count, (SubLObject)list_utilities.UNPROVIDED), count);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 194466L)
    public static SubLObject tree_countE(final SubLObject item, final SubLObject v_object, final SubLObject count, SubLObject test, SubLObject key) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        return Numbers.numE(tree_count_internal(item, v_object, test, key, count, (SubLObject)list_utilities.UNPROVIDED), count);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 194688L)
    public static SubLObject tree_count_internal(final SubLObject item, SubLObject v_object, final SubLObject test, final SubLObject key, final SubLObject max, SubLObject sofar) {
        if (sofar == list_utilities.UNPROVIDED) {
            sofar = (SubLObject)list_utilities.ZERO_INTEGER;
        }
        if (list_utilities.NIL != Functions.funcall(test, item, Functions.funcall(key, v_object))) {
            return number_utilities.f_1X(sofar);
        }
        if (v_object.isCons()) {
            SubLObject datum_evaluated_var;
            for (SubLObject first_sub_tree = (SubLObject)list_utilities.NIL; v_object.isCons() && (!max.isNumber() || sofar.numLE(max)); v_object = datum_evaluated_var.rest(), sofar = tree_count_internal(item, first_sub_tree, test, key, max, sofar)) {
                datum_evaluated_var = v_object;
                first_sub_tree = datum_evaluated_var.first();
            }
            if (list_utilities.NIL != v_object && (!max.isNumber() || sofar.numLE(max))) {
                sofar = tree_count_internal(item, v_object, test, key, max, sofar);
            }
            return sofar;
        }
        return sofar;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 195289L)
    public static SubLObject simple_tree_count(final SubLObject item, final SubLObject v_object) {
        return simple_tree_count_recursive(item, v_object, (SubLObject)list_utilities.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 195468L)
    public static SubLObject simple_tree_count_recursive(final SubLObject item, final SubLObject v_object, SubLObject sofar) {
        if (item.eql(v_object)) {
            sofar = Numbers.add(sofar, (SubLObject)list_utilities.ONE_INTEGER);
        }
        else if (v_object.isCons()) {
            SubLObject list = (SubLObject)list_utilities.NIL;
            SubLObject sub = (SubLObject)list_utilities.NIL;
            list = v_object;
            sub = list.first();
            while (list.rest().isCons()) {
                sofar = simple_tree_count_recursive(item, sub, sofar);
                list = list.rest();
                sub = list.first();
            }
            sofar = simple_tree_count_recursive(item, list.first(), sofar);
            if (list_utilities.NIL != list.rest()) {
                sofar = simple_tree_count_recursive(item, list.rest(), sofar);
            }
        }
        return sofar;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 195955L)
    public static SubLObject cons_tree_count_if(final SubLObject test, final SubLObject v_object, SubLObject key) {
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        return tree_count_if(test, v_object, key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 196117L)
    public static SubLObject tree_count_if(final SubLObject test, final SubLObject v_object, SubLObject key) {
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        if (list_utilities.NIL != Functions.funcall(test, Functions.funcall(key, v_object))) {
            return (SubLObject)list_utilities.ONE_INTEGER;
        }
        if (v_object.isCons()) {
            SubLObject total = (SubLObject)list_utilities.ZERO_INTEGER;
            SubLObject list = (SubLObject)list_utilities.NIL;
            SubLObject sub = (SubLObject)list_utilities.NIL;
            list = v_object;
            sub = list.first();
            while (list.rest().isCons()) {
                total = Numbers.add(total, tree_count_if(test, sub, key));
                list = list.rest();
                sub = list.first();
            }
            total = Numbers.add(total, tree_count_if(test, list.first(), key));
            if (list_utilities.NIL != list.rest()) {
                total = Numbers.add(total, tree_count_if(test, list.rest(), key));
            }
            return total;
        }
        return (SubLObject)list_utilities.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 196610L)
    public static SubLObject tree_count_if_unique(final SubLObject tree, final SubLObject predicate, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        final SubLObject elements = tree_gather(tree, predicate, (SubLObject)list_utilities.NIL, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED);
        final SubLObject v_set = set_utilities.construct_set_from_list(elements, test, (SubLObject)list_utilities.UNPROVIDED);
        return set.set_size(v_set);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 196934L)
    public static SubLObject cons_tree_gather(final SubLObject v_object, final SubLObject predicate, SubLObject test, SubLObject key, SubLObject subs_tooP) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        if (subs_tooP == list_utilities.UNPROVIDED) {
            subs_tooP = (SubLObject)list_utilities.T;
        }
        return tree_gather(v_object, predicate, test, key, subs_tooP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 197140L)
    public static SubLObject tree_gather(final SubLObject v_object, final SubLObject predicate, SubLObject test, SubLObject key, SubLObject subs_tooP) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        if (subs_tooP == list_utilities.UNPROVIDED) {
            subs_tooP = (SubLObject)list_utilities.T;
        }
        return Sequences.nreverse(tree_gather_internal(v_object, predicate, test, key, subs_tooP, (SubLObject)list_utilities.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 197318L)
    public static SubLObject tree_gather_internal(final SubLObject v_object, final SubLObject predicate, final SubLObject test, final SubLObject key, final SubLObject subs_tooP, final SubLObject so_far) {
        SubLObject result = so_far;
        if (list_utilities.NIL != Functions.funcall(predicate, Functions.funcall(key, v_object))) {
            if (list_utilities.NIL != test) {
                if (list_utilities.NIL == conses_high.member(v_object, result, test, Symbols.symbol_function((SubLObject)list_utilities.IDENTITY))) {
                    result = (SubLObject)ConsesLow.cons(v_object, result);
                }
            }
            else {
                result = (SubLObject)ConsesLow.cons(v_object, result);
            }
            if (list_utilities.NIL == subs_tooP) {
                return result;
            }
        }
        if (v_object.isCons()) {
            SubLObject list = (SubLObject)list_utilities.NIL;
            SubLObject sub = (SubLObject)list_utilities.NIL;
            list = v_object;
            sub = list.first();
            while (list.rest().isCons()) {
                result = tree_gather_internal(sub, predicate, test, key, subs_tooP, result);
                list = list.rest();
                sub = list.first();
            }
            result = tree_gather_internal(list.first(), predicate, test, key, subs_tooP, result);
            if (list_utilities.NIL != list.rest()) {
                result = tree_gather_internal(list.rest(), predicate, test, key, subs_tooP, result);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 198046L)
    public static SubLObject tree_gather_ordered(final SubLObject v_object, final SubLObject predicate, SubLObject key, SubLObject subs_tooP) {
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        if (subs_tooP == list_utilities.UNPROVIDED) {
            subs_tooP = (SubLObject)list_utilities.T;
        }
        return (list_utilities.NIL != subs_tooP) ? tree_gather_ordered_subs(v_object, predicate, key) : tree_gather_ordered_no_subs(v_object, predicate, key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 198767L)
    public static SubLObject tree_gather_ordered_subs(final SubLObject v_object, final SubLObject predicate, final SubLObject key) {
        return (SubLObject)((list_utilities.NIL != Functions.funcall(predicate, Functions.funcall(key, v_object))) ? (v_object.isCons() ? ConsesLow.cons(v_object, ConsesLow.nconc(tree_gather_ordered_subs(v_object.first(), predicate, key), tree_gather_ordered_subs(v_object.rest(), predicate, key))) : ConsesLow.cons(v_object, (SubLObject)list_utilities.NIL)) : (v_object.isCons() ? ConsesLow.nconc(tree_gather_ordered_subs(v_object.first(), predicate, key), tree_gather_ordered_subs(v_object.rest(), predicate, key)) : list_utilities.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 199260L)
    public static SubLObject tree_gather_ordered_no_subs(final SubLObject v_object, final SubLObject predicate, final SubLObject key) {
        return (SubLObject)((list_utilities.NIL != Functions.funcall(predicate, Functions.funcall(key, v_object))) ? ConsesLow.cons(v_object, (SubLObject)list_utilities.NIL) : (v_object.isCons() ? ConsesLow.nconc(tree_gather_ordered_no_subs(v_object.first(), predicate, key), tree_gather_ordered_no_subs(v_object.rest(), predicate, key)) : list_utilities.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 199587L)
    public static SubLObject tree_substitute(final SubLObject tree, final SubLObject old_item, final SubLObject new_item) {
        SubLObject result = (SubLObject)list_utilities.NIL;
        SubLObject cdolist_list_var = tree;
        SubLObject branch = (SubLObject)list_utilities.NIL;
        branch = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            if (branch.equal(old_item)) {
                result = (SubLObject)ConsesLow.cons(new_item, result);
            }
            else if (branch.isList()) {
                result = (SubLObject)ConsesLow.cons(tree_substitute(branch, old_item, new_item), result);
            }
            else {
                result = (SubLObject)ConsesLow.cons(branch, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            branch = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 200028L)
    public static SubLObject tree_substitute_using_dictionary(final SubLObject tree, final SubLObject old_item_to_new_item_dictionary) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)list_utilities.NIL;
        SubLObject cdolist_list_var = tree;
        SubLObject branch = (SubLObject)list_utilities.NIL;
        branch = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject possible_new_branch = dictionary.dictionary_lookup(old_item_to_new_item_dictionary, branch, (SubLObject)list_utilities.UNPROVIDED);
            final SubLObject foundP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (list_utilities.NIL != foundP) {
                result = (SubLObject)ConsesLow.cons(possible_new_branch, result);
            }
            else if (branch.isList()) {
                result = (SubLObject)ConsesLow.cons(tree_substitute_using_dictionary(branch, old_item_to_new_item_dictionary), result);
            }
            else {
                result = (SubLObject)ConsesLow.cons(branch, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            branch = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 200589L)
    public static SubLObject tree_splice(final SubLObject tree, final SubLObject old_item, SubLObject new_items) {
        SubLObject result = (SubLObject)list_utilities.NIL;
        if (!new_items.isList()) {
            new_items = (SubLObject)ConsesLow.list(new_items);
        }
        SubLObject cdolist_list_var = tree;
        SubLObject branch = (SubLObject)list_utilities.NIL;
        branch = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            if (branch.equal(old_item)) {
                SubLObject cdolist_list_var_$36 = new_items;
                SubLObject new_item = (SubLObject)list_utilities.NIL;
                new_item = cdolist_list_var_$36.first();
                while (list_utilities.NIL != cdolist_list_var_$36) {
                    result = (SubLObject)ConsesLow.cons(new_item, result);
                    cdolist_list_var_$36 = cdolist_list_var_$36.rest();
                    new_item = cdolist_list_var_$36.first();
                }
            }
            else if (branch.isList()) {
                result = (SubLObject)ConsesLow.cons(tree_splice(branch, old_item, new_items), result);
            }
            else {
                result = (SubLObject)ConsesLow.cons(branch, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            branch = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 201129L)
    public static SubLObject tree_gather_transformations(final SubLObject function, final SubLObject v_object, final SubLObject predicate, SubLObject key, SubLObject mappings) {
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        if (mappings == list_utilities.UNPROVIDED) {
            mappings = (SubLObject)list_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (list_utilities.NIL != Functions.funcall(predicate, v_object)) {
            final SubLObject new_object = Functions.funcall(function, Functions.funcall(key, v_object));
            mappings = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(v_object, new_object), mappings);
            return subl_promotions.values2(new_object, mappings);
        }
        if (v_object.isCons()) {
            SubLObject new_object = (SubLObject)list_utilities.NIL;
            SubLObject cdolist_list_var = v_object;
            SubLObject object_member = (SubLObject)list_utilities.NIL;
            object_member = cdolist_list_var.first();
            while (list_utilities.NIL != cdolist_list_var) {
                thread.resetMultipleValues();
                final SubLObject new_object_member = tree_gather_transformations(function, object_member, predicate, key, (SubLObject)list_utilities.UNPROVIDED);
                final SubLObject new_mappings = thread.secondMultipleValue();
                thread.resetMultipleValues();
                new_object = (SubLObject)ConsesLow.cons(new_object_member, new_object);
                mappings = ConsesLow.append(mappings, new_mappings);
                cdolist_list_var = cdolist_list_var.rest();
                object_member = cdolist_list_var.first();
            }
            return subl_promotions.values2(Sequences.nreverse(new_object), mappings);
        }
        return subl_promotions.values2(v_object, mappings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 202074L)
    public static SubLObject remove_if_doesnt_include(final SubLObject list, final SubLObject objects) {
        assert list_utilities.NIL != Types.listp(list) : list;
        SubLObject ans = (SubLObject)list_utilities.NIL;
        SubLObject cdolist_list_var = list;
        SubLObject item = (SubLObject)list_utilities.NIL;
        item = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            SubLObject missing = (SubLObject)list_utilities.NIL;
            if (list_utilities.NIL == missing) {
                SubLObject csome_list_var;
                SubLObject v_object;
                for (csome_list_var = objects, v_object = (SubLObject)list_utilities.NIL, v_object = csome_list_var.first(); list_utilities.NIL == missing && list_utilities.NIL != csome_list_var; missing = (SubLObject)SubLObjectFactory.makeBoolean(list_utilities.NIL == cons_tree_find(v_object, item, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED)), csome_list_var = csome_list_var.rest(), v_object = csome_list_var.first()) {}
            }
            if (list_utilities.NIL == missing) {
                ans = (SubLObject)ConsesLow.cons(item, ans);
            }
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        }
        return Sequences.nreverse(ans);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 202440L)
    public static SubLObject delete_subsumed_items(final SubLObject list, final SubLObject test, SubLObject key) {
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        if (list_utilities.NIL == list) {
            return (SubLObject)list_utilities.NIL;
        }
        return delete_subsumed_items_internal(list, test, key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 202702L)
    public static SubLObject delete_subsumed_items_internal(final SubLObject list, final SubLObject test, final SubLObject key) {
        for (SubLObject remaining = list; list_utilities.NIL != remaining && list_utilities.NIL == singletonP(remaining); remaining = remaining.rest()) {
            final SubLObject this_one = ConsesLow.nth((SubLObject)list_utilities.ONE_INTEGER, remaining);
            SubLObject other_items;
            SubLObject subsumedP;
            for (other_items = list, subsumedP = (SubLObject)list_utilities.NIL; list_utilities.NIL == subsumedP && list_utilities.NIL != other_items; other_items = other_items.rest()) {
                if (!other_items.eql(remaining.rest())) {
                    if (list_utilities.NIL != subsumedP(this_one, ConsesLow.nth((SubLObject)list_utilities.ZERO_INTEGER, other_items), test, key)) {
                        subsumedP = (SubLObject)list_utilities.T;
                        delete_nth((SubLObject)list_utilities.ONE_INTEGER, remaining);
                    }
                    else if (!other_items.eql(remaining) && list_utilities.NIL != other_items.rest() && list_utilities.NIL != subsumesP(this_one, ConsesLow.nth((SubLObject)list_utilities.ONE_INTEGER, other_items), test, key)) {
                        delete_nth((SubLObject)list_utilities.ONE_INTEGER, other_items);
                    }
                }
            }
            if (list_utilities.NIL == subsumedP) {}
        }
        final SubLObject first_item = list.first();
        SubLObject first_item_subsumedP = (SubLObject)list_utilities.NIL;
        if (list_utilities.NIL == first_item_subsumedP) {
            SubLObject csome_list_var;
            SubLObject other_item;
            for (csome_list_var = list.rest(), other_item = (SubLObject)list_utilities.NIL, other_item = csome_list_var.first(); list_utilities.NIL == first_item_subsumedP && list_utilities.NIL != csome_list_var; first_item_subsumedP = subsumedP(first_item, other_item, test, key), csome_list_var = csome_list_var.rest(), other_item = csome_list_var.first()) {}
        }
        return (list_utilities.NIL != first_item_subsumedP) ? list.rest() : list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 204018L)
    public static SubLObject subsumedP(final SubLObject item1, final SubLObject item2, final SubLObject test, final SubLObject key) {
        return subsumesP_internal(item2, item1, test, key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 204119L)
    public static SubLObject subsumesP(final SubLObject item1, final SubLObject item2, final SubLObject test, final SubLObject key) {
        return subsumesP_internal(item1, item2, test, key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 204220L)
    public static SubLObject subsumesP_internal(final SubLObject item1, final SubLObject item2, final SubLObject test, final SubLObject key) {
        return sublisp_boolean(Functions.funcall(test, Functions.funcall(key, item1), Functions.funcall(key, item2)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 204353L)
    public static SubLObject remove_subsumed_items(final SubLObject list, final SubLObject test, SubLObject key) {
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        return delete_subsumed_items(conses_high.copy_list(list), test, key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 204482L)
    public static SubLObject cross_products(final SubLObject sets) {
        if (Sequences.length(sets).eql((SubLObject)list_utilities.ONE_INTEGER)) {
            return Mapping.mapcar(Symbols.symbol_function((SubLObject)list_utilities.$sym58$LIST), sets.first());
        }
        final SubLObject sets2 = Sequences.reverse(sets);
        SubLObject result = map_pairs(conses_high.second(sets2), sets2.first(), (SubLObject)list_utilities.$sym58$LIST);
        SubLObject cdolist_list_var = conses_high.cddr(sets2);
        SubLObject v_set = (SubLObject)list_utilities.NIL;
        v_set = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            result = map_pairs(v_set, result, (SubLObject)list_utilities.$sym13$CONS);
            cdolist_list_var = cdolist_list_var.rest();
            v_set = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 204860L)
    public static SubLObject map_pairs(final SubLObject set1, final SubLObject set2, final SubLObject fn) {
        SubLObject ans = (SubLObject)list_utilities.NIL;
        SubLObject cdolist_list_var = set1;
        SubLObject old = (SubLObject)list_utilities.NIL;
        old = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$37 = fn_with_each(old, set2, fn);
            SubLObject v_new = (SubLObject)list_utilities.NIL;
            v_new = cdolist_list_var_$37.first();
            while (list_utilities.NIL != cdolist_list_var_$37) {
                ans = (SubLObject)ConsesLow.cons(v_new, ans);
                cdolist_list_var_$37 = cdolist_list_var_$37.rest();
                v_new = cdolist_list_var_$37.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            old = cdolist_list_var.first();
        }
        return Sequences.nreverse(ans);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 205026L)
    public static SubLObject fn_with_each(final SubLObject sym, final SubLObject v_set, final SubLObject fn) {
        SubLObject result = (SubLObject)list_utilities.NIL;
        SubLObject cdolist_list_var = v_set;
        SubLObject e = (SubLObject)list_utilities.NIL;
        e = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            result = (SubLObject)ConsesLow.cons(Functions.funcall(fn, sym, e), result);
            cdolist_list_var = cdolist_list_var.rest();
            e = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 205170L)
    public static SubLObject indexed_products(final SubLObject lists) {
        if (list_utilities.NIL != lists) {
            return Functions.apply((SubLObject)list_utilities.$sym190$MAPCAR, (SubLObject)ConsesLow.cons((SubLObject)list_utilities.$sym58$LIST, lists));
        }
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 205417L)
    public static SubLObject explicate_permutations(final SubLObject sets, SubLObject tag) {
        if (tag == list_utilities.UNPROVIDED) {
            tag = (SubLObject)list_utilities.NIL;
        }
        final SubLObject translation = translate_elements_to_tagged_sets(tag, sets);
        final SubLObject permutations = cross_products(translation);
        final SubLObject result = untranslate_elements_from_tagged_sets(tag, permutations, (SubLObject)list_utilities.UNPROVIDED);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 205911L)
    public static SubLObject untranslate_elements_from_tagged_sets(final SubLObject tag, final SubLObject v_set, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        SubLObject result = (SubLObject)list_utilities.NIL;
        SubLObject cdolist_list_var = v_set;
        SubLObject element = (SubLObject)list_utilities.NIL;
        element = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            if (list_utilities.NIL != subl_promotions.memberP(tag, element, test, (SubLObject)list_utilities.UNPROVIDED)) {
                result = (SubLObject)ConsesLow.cons(remove_from_end(tag, element, test), result);
            }
            else {
                result = (SubLObject)ConsesLow.cons(element, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            element = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 206186L)
    public static SubLObject translate_elements_to_tagged_sets(final SubLObject tag, final SubLObject v_set) {
        SubLObject result = (SubLObject)list_utilities.NIL;
        SubLObject cdolist_list_var = v_set;
        SubLObject element = (SubLObject)list_utilities.NIL;
        element = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            if (element.isCons()) {
                result = (SubLObject)ConsesLow.cons(adjoin_to_end(tag, element, (SubLObject)list_utilities.UNPROVIDED), result);
            }
            else {
                result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(element), result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            element = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 206423L)
    public static SubLObject permute_list(final SubLObject elements, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQUAL);
        }
        if (list_utilities.NIL == elements) {
            return (SubLObject)list_utilities.NIL;
        }
        final SubLObject number_of_elements = Sequences.length(elements);
        SubLObject result = (SubLObject)list_utilities.NIL;
        if (list_utilities.NIL == test) {
            SubLObject cdolist_list_var = all_permutations(Sequences.length(elements));
            SubLObject permutation = (SubLObject)list_utilities.NIL;
            permutation = cdolist_list_var.first();
            while (list_utilities.NIL != cdolist_list_var) {
                result = (SubLObject)ConsesLow.cons(permute(elements, permutation), result);
                cdolist_list_var = cdolist_list_var.rest();
                permutation = cdolist_list_var.first();
            }
        }
        else if (number_of_elements.numL((SubLObject)list_utilities.FIVE_INTEGER)) {
            SubLObject cdolist_list_var = all_permutations(Sequences.length(elements));
            SubLObject permutation = (SubLObject)list_utilities.NIL;
            permutation = cdolist_list_var.first();
            while (list_utilities.NIL != cdolist_list_var) {
                final SubLObject item_var = permute(elements, permutation);
                if (list_utilities.NIL == conses_high.member(item_var, result, test, Symbols.symbol_function((SubLObject)list_utilities.IDENTITY))) {
                    result = (SubLObject)ConsesLow.cons(item_var, result);
                }
                cdolist_list_var = cdolist_list_var.rest();
                permutation = cdolist_list_var.first();
            }
        }
        else {
            SubLObject cdolist_list_var = all_permutations(Sequences.length(elements));
            SubLObject permutation = (SubLObject)list_utilities.NIL;
            permutation = cdolist_list_var.first();
            while (list_utilities.NIL != cdolist_list_var) {
                result = (SubLObject)ConsesLow.cons(permute(elements, permutation), result);
                cdolist_list_var = cdolist_list_var.rest();
                permutation = cdolist_list_var.first();
            }
            result = fast_delete_duplicates(result, test, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 207892L)
    public static SubLObject permute_list_int(final SubLObject elements, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQ);
        }
        if (list_utilities.NIL == elements) {
            return (SubLObject)list_utilities.NIL;
        }
        if (elements.isAtom()) {
            return (SubLObject)ConsesLow.list(elements);
        }
        if (list_utilities.NIL == elements.rest()) {
            return (SubLObject)ConsesLow.list(elements);
        }
        if (list_utilities.NIL == elements.rest().rest()) {
            return (SubLObject)ConsesLow.list(elements, Sequences.reverse(elements));
        }
        SubLObject perms = (SubLObject)list_utilities.NIL;
        SubLObject cdolist_list_var = elements;
        SubLObject elem = (SubLObject)list_utilities.NIL;
        elem = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$38 = permute_list_int(Sequences.remove(elem, elements, test, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED), (SubLObject)list_utilities.UNPROVIDED);
            SubLObject perm = (SubLObject)list_utilities.NIL;
            perm = cdolist_list_var_$38.first();
            while (list_utilities.NIL != cdolist_list_var_$38) {
                perms = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(elem, perm), perms);
                cdolist_list_var_$38 = cdolist_list_var_$38.rest();
                perm = cdolist_list_var_$38.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        return perms;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 208509L)
    public static SubLObject all_permutations(final SubLObject n) {
        if (n.numE((SubLObject)list_utilities.ZERO_INTEGER)) {
            return (SubLObject)ConsesLow.list((SubLObject)list_utilities.NIL);
        }
        return permute_list_int(num_list(n, (SubLObject)list_utilities.UNPROVIDED), (SubLObject)list_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 209013L)
    public static SubLObject nsublis_permute(final SubLObject list, final SubLObject permutation, final SubLObject tree) {
        SubLObject alist = (SubLObject)list_utilities.NIL;
        SubLObject cdotimes_end_var;
        SubLObject i;
        SubLObject j;
        SubLObject old;
        SubLObject v_new;
        for (cdotimes_end_var = Sequences.length(permutation), i = (SubLObject)list_utilities.NIL, i = (SubLObject)list_utilities.ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject)list_utilities.ONE_INTEGER)) {
            j = ConsesLow.nth(i, permutation);
            if (!i.numE(j)) {
                old = ConsesLow.nth(i, list);
                v_new = ConsesLow.nth(j, list);
                alist = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(old, v_new), alist);
            }
        }
        return conses_high.nsublis(alist, tree, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 209353L)
    public static SubLObject sublis_permute(final SubLObject list, final SubLObject permutation, final SubLObject tree) {
        return nsublis_permute(list, permutation, conses_high.copy_tree(tree));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 209530L)
    public static SubLObject permute(final SubLObject list, final SubLObject permutation) {
        if (list_utilities.NIL != permutation) {
            SubLObject result = (SubLObject)list_utilities.NIL;
            SubLObject cdolist_list_var = permutation;
            SubLObject elem = (SubLObject)list_utilities.NIL;
            elem = cdolist_list_var.first();
            while (list_utilities.NIL != cdolist_list_var) {
                result = (SubLObject)ConsesLow.cons(ConsesLow.nth(elem, list), result);
                cdolist_list_var = cdolist_list_var.rest();
                elem = cdolist_list_var.first();
            }
            return Sequences.nreverse(result);
        }
        return list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 209808L)
    public static SubLObject random_permutation(final SubLObject list) {
        SubLObject random_index = (SubLObject)list_utilities.NIL;
        SubLObject remaining_list = list;
        SubLObject permuted_list = (SubLObject)list_utilities.NIL;
        if (list_utilities.NIL == list) {
            return (SubLObject)list_utilities.NIL;
        }
        while (list_utilities.NIL == singletonP(remaining_list)) {
            random_index = random.random(Sequences.length(remaining_list));
            permuted_list = (SubLObject)ConsesLow.cons(ConsesLow.nth(random_index, remaining_list), permuted_list);
            remaining_list = remove_nth(random_index, remaining_list);
        }
        return (SubLObject)ConsesLow.cons(remaining_list.first(), permuted_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 210312L)
    public static SubLObject choose_n_between(final SubLObject n, final SubLObject max) {
        SubLObject result = (SubLObject)list_utilities.NIL;
        if (n.numE((SubLObject)list_utilities.ONE_INTEGER)) {
            SubLObject i;
            for (i = (SubLObject)list_utilities.NIL, i = (SubLObject)list_utilities.ZERO_INTEGER; i.numL(max); i = Numbers.add(i, (SubLObject)list_utilities.ONE_INTEGER)) {
                result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(i), result);
            }
        }
        else {
            SubLObject cdolist_list_var;
            final SubLObject shorter_lists = cdolist_list_var = choose_n_between(number_utilities.f_1_(n), max);
            SubLObject list = (SubLObject)list_utilities.NIL;
            list = cdolist_list_var.first();
            while (list_utilities.NIL != cdolist_list_var) {
                SubLObject j;
                for (j = (SubLObject)list_utilities.NIL, j = (SubLObject)list_utilities.ZERO_INTEGER; j.numL(max); j = Numbers.add(j, (SubLObject)list_utilities.ONE_INTEGER)) {
                    if (list_utilities.NIL == subl_promotions.memberP(j, list, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED)) {
                        result = (SubLObject)ConsesLow.cons(ConsesLow.append(list, (SubLObject)ConsesLow.list(j)), result);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                list = cdolist_list_var.first();
            }
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 210960L)
    public static SubLObject trigram_transform(final SubLObject object_list, final SubLObject trigram_rules, SubLObject start_token, SubLObject end_token) {
        if (start_token == list_utilities.UNPROVIDED) {
            start_token = (SubLObject)list_utilities.NIL;
        }
        if (end_token == list_utilities.UNPROVIDED) {
            end_token = (SubLObject)list_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert list_utilities.NIL != Types.listp(object_list) : object_list;
        if (list_utilities.NIL != object_list) {
            SubLObject expanded_object_list = (SubLObject)ConsesLow.cons(start_token, object_list);
            try {
                ConsesLow.rplacd(conses_high.last(expanded_object_list, (SubLObject)list_utilities.UNPROVIDED), (SubLObject)ConsesLow.cons(end_token, (SubLObject)list_utilities.NIL));
                while (list_utilities.NIL != conses_high.cddr(expanded_object_list)) {
                    SubLObject current;
                    final SubLObject datum = current = expanded_object_list;
                    SubLObject one = (SubLObject)list_utilities.NIL;
                    SubLObject two = (SubLObject)list_utilities.NIL;
                    SubLObject three = (SubLObject)list_utilities.NIL;
                    SubLObject rest = (SubLObject)list_utilities.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list191);
                    one = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list191);
                    two = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list191);
                    three = current.first();
                    current = (rest = current.rest());
                    SubLObject cdolist_list_var = trigram_rules;
                    SubLObject trigram = (SubLObject)list_utilities.NIL;
                    trigram = cdolist_list_var.first();
                    while (list_utilities.NIL != cdolist_list_var) {
                        if (trigram.isFunctionSpec()) {
                            thread.resetMultipleValues();
                            final SubLObject changeP = Functions.funcall(trigram, one, two, three);
                            final SubLObject new_one = thread.secondMultipleValue();
                            final SubLObject new_two = thread.thirdMultipleValue();
                            final SubLObject new_three = thread.fourthMultipleValue();
                            thread.resetMultipleValues();
                            if (list_utilities.NIL != changeP) {
                                if (!one.eql(new_one)) {
                                    ConsesLow.set_nth((SubLObject)list_utilities.ZERO_INTEGER, expanded_object_list, new_one);
                                }
                                if (!two.eql(new_two)) {
                                    ConsesLow.set_nth((SubLObject)list_utilities.ONE_INTEGER, expanded_object_list, new_two);
                                }
                                if (!three.eql(new_three)) {
                                    ConsesLow.set_nth((SubLObject)list_utilities.TWO_INTEGER, expanded_object_list, new_three);
                                }
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        trigram = cdolist_list_var.first();
                    }
                    expanded_object_list = expanded_object_list.rest();
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)list_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    ConsesLow.rplacd(conses_high.last(expanded_object_list, (SubLObject)list_utilities.TWO_INTEGER), (SubLObject)list_utilities.NIL);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return object_list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 213004L)
    public static SubLObject chunk(final SubLObject lst, final SubLObject n) {
        assert list_utilities.NIL != Types.integerp(n) : n;
        if (n.numLE((SubLObject)list_utilities.ZERO_INTEGER)) {
            return (SubLObject)list_utilities.NIL;
        }
        if (list_utilities.NIL == lst) {
            return (SubLObject)list_utilities.NIL;
        }
        SubLObject cur_list = (SubLObject)list_utilities.NIL;
        SubLObject cur_item = (SubLObject)list_utilities.NIL;
        SubLObject output = (SubLObject)list_utilities.NIL;
        SubLObject i = (SubLObject)list_utilities.NIL;
        cur_list = lst;
        cur_item = cur_list.first();
        output = (SubLObject)ConsesLow.list((SubLObject)list_utilities.NIL);
        for (i = (SubLObject)list_utilities.ZERO_INTEGER; list_utilities.NIL != cur_list; cur_list = cur_list.rest(), cur_item = cur_list.first(), output = output, i = Numbers.add(i, (SubLObject)list_utilities.ONE_INTEGER)) {
            if (i.numL(n)) {
                ConsesLow.rplaca(output, (SubLObject)ConsesLow.cons(cur_item, output.first()));
            }
            else {
                ConsesLow.rplaca(output, Sequences.nreverse(output.first()));
                output = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(cur_item), output);
                i = (SubLObject)list_utilities.ZERO_INTEGER;
            }
        }
        ConsesLow.rplaca(output, Sequences.nreverse(output.first()));
        return Sequences.nreverse(output);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 213884L)
    public static SubLObject get_arglist(final SubLObject symbol) {
        return subl_promotions.function_symbol_arglist(symbol);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 214161L)
    public static SubLObject get_documentation(final SubLObject symbol) {
        SubLObject v_answer = (SubLObject)list_utilities.NIL;
        if (symbol.isSymbol() && list_utilities.NIL == v_answer) {
            v_answer = conses_high.second(Symbols.get(symbol, (SubLObject)list_utilities.$kw194$DOCUMENTATION, (SubLObject)list_utilities.NIL));
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 214542L)
    public static SubLObject push_on_car(final SubLObject list, final SubLObject v_object) {
        final SubLObject car_list = list.first();
        final SubLObject cdr_list = list.rest();
        if (list_utilities.NIL == car_list) {
            return (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(v_object), cdr_list);
        }
        return (SubLObject)ConsesLow.cons(ConsesLow.append((SubLObject)ConsesLow.list(v_object), car_list), cdr_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 215415L)
    public static SubLObject pop_and_reverse_car_and_push_on_cadr(final SubLObject list) {
        final SubLObject car_list = Sequences.nreverse(list.first());
        final SubLObject cdr_list = list.rest();
        if (list_utilities.NIL == car_list) {
            return push_on_car(cdr_list, (SubLObject)list_utilities.NIL);
        }
        return push_on_car(cdr_list, car_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 215885L)
    public static SubLObject cartesian_product(final SubLObject l, SubLObject fun, SubLObject start, SubLObject test) {
        if (fun == list_utilities.UNPROVIDED) {
            fun = Symbols.symbol_function((SubLObject)list_utilities.$sym13$CONS);
        }
        if (start == list_utilities.UNPROVIDED) {
            start = (SubLObject)list_utilities.NIL;
        }
        if (test == list_utilities.UNPROVIDED) {
            test = (SubLObject)list_utilities.NIL;
        }
        SubLObject accum = (SubLObject)ConsesLow.list(start);
        if (list_utilities.NIL != Symbols.fboundp(test)) {
            SubLObject cdolist_list_var = l;
            SubLObject this_one = (SubLObject)list_utilities.NIL;
            this_one = cdolist_list_var.first();
            while (list_utilities.NIL != cdolist_list_var) {
                accum = cartesian_helper_with_test(this_one, accum, fun, test);
                cdolist_list_var = cdolist_list_var.rest();
                this_one = cdolist_list_var.first();
            }
        }
        else {
            SubLObject cdolist_list_var = l;
            SubLObject this_one = (SubLObject)list_utilities.NIL;
            this_one = cdolist_list_var.first();
            while (list_utilities.NIL != cdolist_list_var) {
                accum = cartesian_helper(this_one, accum, fun);
                cdolist_list_var = cdolist_list_var.rest();
                this_one = cdolist_list_var.first();
            }
        }
        return nmapcar(Symbols.symbol_function((SubLObject)list_utilities.$sym37$REVERSE), accum);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 216774L)
    public static SubLObject cartesian_product_cardinality(final SubLObject l) {
        return Functions.apply((SubLObject)list_utilities.$sym195$_, Mapping.mapcar((SubLObject)list_utilities.$sym40$LENGTH, l));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 216863L)
    public static SubLObject cartesian_helper(final SubLObject a, final SubLObject b, final SubLObject fun) {
        SubLObject accum = (SubLObject)list_utilities.NIL;
        SubLObject cdolist_list_var = b;
        SubLObject b_er = (SubLObject)list_utilities.NIL;
        b_er = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$39 = a;
            SubLObject a_er = (SubLObject)list_utilities.NIL;
            a_er = cdolist_list_var_$39.first();
            while (list_utilities.NIL != cdolist_list_var_$39) {
                accum = (SubLObject)ConsesLow.cons(Functions.funcall(fun, a_er, b_er), accum);
                cdolist_list_var_$39 = cdolist_list_var_$39.rest();
                a_er = cdolist_list_var_$39.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            b_er = cdolist_list_var.first();
        }
        return Sequences.nreverse(accum);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 217126L)
    public static SubLObject cartesian_helper_with_test(final SubLObject a, final SubLObject b, final SubLObject fun, final SubLObject test) {
        SubLObject accum = (SubLObject)list_utilities.NIL;
        SubLObject cdolist_list_var = b;
        SubLObject b_er = (SubLObject)list_utilities.NIL;
        b_er = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$40 = a;
            SubLObject a_er = (SubLObject)list_utilities.NIL;
            a_er = cdolist_list_var_$40.first();
            while (list_utilities.NIL != cdolist_list_var_$40) {
                if (list_utilities.NIL != Functions.funcall(test, a_er, b_er)) {
                    accum = (SubLObject)ConsesLow.cons(Functions.funcall(fun, a_er, b_er), accum);
                }
                cdolist_list_var_$40 = cdolist_list_var_$40.rest();
                a_er = cdolist_list_var_$40.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            b_er = cdolist_list_var.first();
        }
        return Sequences.nreverse(accum);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 217572L)
    public static SubLObject pick_two(final SubLObject lyst) {
        SubLObject result = (SubLObject)list_utilities.NIL;
        SubLObject list1;
        SubLObject cdolist_list_var;
        SubLObject item2;
        for (list1 = (SubLObject)list_utilities.NIL, list1 = lyst; list_utilities.NIL == lengthL(list1, (SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.UNPROVIDED); list1 = list1.rest()) {
            cdolist_list_var = list1.rest();
            item2 = (SubLObject)list_utilities.NIL;
            item2 = cdolist_list_var.first();
            while (list_utilities.NIL != cdolist_list_var) {
                result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(list1.first(), item2), result);
                cdolist_list_var = cdolist_list_var.rest();
                item2 = cdolist_list_var.first();
            }
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 218245L)
    public static SubLObject mapexp(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list196);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject result = (SubLObject)list_utilities.NIL;
        SubLObject var = (SubLObject)list_utilities.NIL;
        SubLObject list = (SubLObject)list_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list196);
        result = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list196);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list196);
        list = current.first();
        current = current.rest();
        if (list_utilities.NIL == current) {
            current = temp;
            SubLObject exp = (SubLObject)list_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)list_utilities.$list196);
            exp = current.first();
            final SubLObject body;
            current = (body = current.rest());
            return (SubLObject)ConsesLow.listS((SubLObject)list_utilities.$sym10$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(result, (SubLObject)list_utilities.$list72)), (SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym36$CDOLIST, (SubLObject)ConsesLow.list(var, (SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym37$REVERSE, list)), (SubLObject)ConsesLow.list((SubLObject)list_utilities.$sym61$CPUSH, exp, result)), ConsesLow.append(body, (SubLObject)list_utilities.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)list_utilities.$list196);
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 218428L)
    public static SubLObject recursive_member(final SubLObject elem, final SubLObject form, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (list_utilities.NIL != Functions.funcall(test, elem, form)) {
            return (SubLObject)list_utilities.T;
        }
        if (form.isList()) {
            SubLObject cdolist_list_var = form;
            SubLObject rec = (SubLObject)list_utilities.NIL;
            rec = cdolist_list_var.first();
            while (list_utilities.NIL != cdolist_list_var) {
                if (list_utilities.NIL != recursive_member(elem, rec, test)) {
                    return (SubLObject)list_utilities.T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                rec = cdolist_list_var.first();
            }
        }
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 218793L)
    public static SubLObject list_of_type_p(final SubLObject pred, final SubLObject v_object) {
        if (list_utilities.NIL != non_dotted_list_p(v_object)) {
            SubLObject cdolist_list_var = v_object;
            SubLObject subobject = (SubLObject)list_utilities.NIL;
            subobject = cdolist_list_var.first();
            while (list_utilities.NIL != cdolist_list_var) {
                if (list_utilities.NIL == Functions.funcall(pred, subobject)) {
                    return (SubLObject)list_utilities.NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                subobject = cdolist_list_var.first();
            }
            return (SubLObject)list_utilities.T;
        }
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 219347L)
    public static SubLObject non_empty_list_of_type_p(final SubLObject pred, final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(list_utilities.NIL != non_empty_list_p(v_object) && list_utilities.NIL != list_of_type_p(pred, v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 219479L)
    public static SubLObject list_of_list_p(final SubLObject v_object) {
        return list_of_type_p(Symbols.symbol_function((SubLObject)list_utilities.$sym53$LISTP), v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 219560L)
    public static SubLObject list_of_keyword_p(final SubLObject v_object) {
        return list_of_type_p(Symbols.symbol_function((SubLObject)list_utilities.$sym197$KEYWORDP), v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 219647L)
    public static SubLObject string_list_p(final SubLObject v_object) {
        return string_utilities.list_of_string_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 219851L)
    public static SubLObject symbol_list_p(final SubLObject v_object) {
        if (list_utilities.NIL != non_dotted_list_p(v_object)) {
            return every_in_list(Symbols.symbol_function((SubLObject)list_utilities.$sym198$SYMBOLP), v_object, (SubLObject)list_utilities.UNPROVIDED);
        }
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 220029L)
    public static SubLObject function_symbol_list_p(final SubLObject v_object) {
        if (list_utilities.NIL != non_dotted_list_p(v_object)) {
            return every_in_list(Symbols.symbol_function((SubLObject)list_utilities.$sym104$FUNCTION_SYMBOL_P), v_object, (SubLObject)list_utilities.UNPROVIDED);
        }
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 220236L)
    public static SubLObject form_with_operator_p(final SubLObject form, final SubLObject operator) {
        return (SubLObject)SubLObjectFactory.makeBoolean(form.isCons() && operator.eql(form.first()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 220440L)
    public static SubLObject verify_operator(final SubLObject operator, final SubLObject expected_operator) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (list_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !operator.eql(expected_operator)) {
            Errors.error((SubLObject)list_utilities.$str199$Expected__S__got__S, expected_operator, operator);
        }
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 220675L)
    public static SubLObject verify_form_with_operator(final SubLObject form, final SubLObject expected_operator) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (list_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && list_utilities.NIL == form_with_operator_p(form, expected_operator)) {
            Errors.error((SubLObject)list_utilities.$str200$_S_was_not_a_form_with_operator__, form, expected_operator);
        }
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 220949L)
    public static SubLObject functor_in_expression_p(final SubLObject functor, final SubLObject expression) {
        if (expression.isAtom()) {
            return (SubLObject)list_utilities.NIL;
        }
        final SubLObject expression_functor = expression.first();
        final SubLObject expression_args = expression.rest();
        if (functor.equal(expression_functor)) {
            return (SubLObject)list_utilities.T;
        }
        SubLObject cdolist_list_var = expression_args;
        SubLObject arg = (SubLObject)list_utilities.NIL;
        arg = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            if (list_utilities.NIL != functor_in_expression_p(functor, arg)) {
                return (SubLObject)list_utilities.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        }
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 221353L)
    public static SubLObject functor_in_body_p(final SubLObject symbol, final SubLObject body) {
        if (list_utilities.NIL == body) {
            return (SubLObject)list_utilities.NIL;
        }
        if (body.isCons()) {
            SubLObject expression = (SubLObject)list_utilities.NIL;
            SubLObject functor = (SubLObject)list_utilities.NIL;
            while (body.isCons()) {
                expression = body.first();
                if (expression.isCons()) {
                    functor = expression.first();
                    if (functor.eql(symbol)) {
                        return (SubLObject)list_utilities.T;
                    }
                    if (list_utilities.NIL != functor_in_body_p(symbol, expression.rest())) {
                        return (SubLObject)list_utilities.T;
                    }
                    continue;
                }
            }
            return (SubLObject)list_utilities.NIL;
        }
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 221782L)
    public static SubLObject variable_value_used_in_body_p(final SubLObject symbol, final SubLObject body) {
        if (list_utilities.NIL != proper_list_p(body)) {
            SubLObject cdolist_list_var = body;
            SubLObject expression = (SubLObject)list_utilities.NIL;
            expression = cdolist_list_var.first();
            while (list_utilities.NIL != cdolist_list_var) {
                if (list_utilities.NIL != variable_value_used_in_expression_p(symbol, expression)) {
                    return (SubLObject)list_utilities.T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                expression = cdolist_list_var.first();
            }
            return (SubLObject)list_utilities.NIL;
        }
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 222028L)
    public static SubLObject variable_value_used_in_expression_p(final SubLObject symbol, final SubLObject expression) {
        if (!expression.isCons()) {
            return Equality.eq(symbol, expression);
        }
        final SubLObject args = expression.rest();
        if (expression.first() == list_utilities.$sym108$QUOTE) {
            return (SubLObject)list_utilities.NIL;
        }
        return variable_value_used_in_body_p(symbol, args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 222315L)
    public static SubLObject object_in_expression_p(final SubLObject v_object, final SubLObject expression) {
        if (expression.isAtom()) {
            return Equality.equal(v_object, expression);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(list_utilities.NIL != object_in_expression_p(v_object, expression.first()) || list_utilities.NIL != object_in_expression_p(v_object, expression.rest()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 222560L)
    public static SubLObject parse_to_list_of_strings(final SubLObject string, SubLObject symbol_start_char, SubLObject symbol_end_char) {
        if (symbol_start_char == list_utilities.UNPROVIDED) {
            symbol_start_char = (SubLObject)Characters.CHAR_question;
        }
        if (symbol_end_char == list_utilities.UNPROVIDED) {
            symbol_end_char = (SubLObject)Characters.CHAR_space;
        }
        if (list_utilities.NIL == string) {
            return (SubLObject)list_utilities.NIL;
        }
        if (!string.isString()) {
            return (SubLObject)list_utilities.NIL;
        }
        if (list_utilities.NIL != Strings.string_equal(string, (SubLObject)list_utilities.$str64$, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED)) {
            return (SubLObject)list_utilities.NIL;
        }
        SubLObject list_of_strings = (SubLObject)list_utilities.NIL;
        SubLObject current_index = (SubLObject)list_utilities.ZERO_INTEGER;
        SubLObject start_of_string_index = (SubLObject)list_utilities.ZERO_INTEGER;
        SubLObject start_of_symbol_index = (SubLObject)list_utilities.ZERO_INTEGER;
        final SubLObject string_length = Sequences.length(string);
        SubLObject current_char = (SubLObject)list_utilities.NIL;
        SubLObject new_string_length = (SubLObject)list_utilities.NIL;
        SubLObject new_string = (SubLObject)list_utilities.NIL;
        SubLObject symbol_length = (SubLObject)list_utilities.NIL;
        SubLObject symbol_string = (SubLObject)list_utilities.NIL;
        while (current_index.numL(string_length)) {
            current_char = Vectors.aref(string, current_index);
            if (list_utilities.NIL != Characters.charE(current_char, symbol_start_char)) {
                if (!start_of_string_index.numE(current_index)) {
                    new_string_length = Numbers.subtract(current_index, start_of_string_index);
                    new_string = Strings.make_string(new_string_length, (SubLObject)list_utilities.UNPROVIDED);
                    SubLObject new_string_index;
                    for (new_string_index = (SubLObject)list_utilities.NIL, new_string_index = (SubLObject)list_utilities.ZERO_INTEGER; new_string_index.numL(new_string_length); new_string_index = Numbers.add(new_string_index, (SubLObject)list_utilities.ONE_INTEGER)) {
                        Vectors.set_aref(new_string, new_string_index, Vectors.aref(string, Numbers.add(start_of_string_index, new_string_index)));
                    }
                    list_of_strings = (SubLObject)ConsesLow.cons(new_string, list_of_strings);
                }
                start_of_symbol_index = current_index;
                for (current_index = Numbers.add(current_index, (SubLObject)list_utilities.ONE_INTEGER); current_index.numL(string_length) && list_utilities.NIL == Characters.charE(Vectors.aref(string, current_index), symbol_end_char); current_index = Numbers.add(current_index, (SubLObject)list_utilities.ONE_INTEGER)) {}
                start_of_string_index = current_index;
                symbol_length = Numbers.subtract(current_index, start_of_symbol_index);
                symbol_string = Strings.make_string(symbol_length, (SubLObject)list_utilities.UNPROVIDED);
                SubLObject new_symbol_index;
                for (new_symbol_index = (SubLObject)list_utilities.NIL, new_symbol_index = (SubLObject)list_utilities.ZERO_INTEGER; new_symbol_index.numL(symbol_length); new_symbol_index = Numbers.add(new_symbol_index, (SubLObject)list_utilities.ONE_INTEGER)) {
                    Vectors.set_aref(symbol_string, new_symbol_index, Vectors.aref(string, Numbers.add(start_of_symbol_index, new_symbol_index)));
                }
                list_of_strings = (SubLObject)ConsesLow.cons(Packages.intern(symbol_string, (SubLObject)list_utilities.UNPROVIDED), list_of_strings);
            }
            else {
                current_index = Numbers.add(current_index, (SubLObject)list_utilities.ONE_INTEGER);
            }
        }
        if (!start_of_string_index.numE(current_index)) {
            new_string_length = Numbers.subtract(current_index, start_of_string_index);
            new_string = Strings.make_string(new_string_length, (SubLObject)list_utilities.UNPROVIDED);
            SubLObject new_string_index;
            for (new_string_index = (SubLObject)list_utilities.NIL, new_string_index = (SubLObject)list_utilities.ZERO_INTEGER; new_string_index.numL(new_string_length); new_string_index = Numbers.add(new_string_index, (SubLObject)list_utilities.ONE_INTEGER)) {
                Vectors.set_aref(new_string, new_string_index, Vectors.aref(string, Numbers.add(start_of_string_index, new_string_index)));
            }
            list_of_strings = (SubLObject)ConsesLow.cons(new_string, list_of_strings);
        }
        return Sequences.nreverse(list_of_strings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 225042L)
    public static SubLObject tree_substitute_by_association(final SubLObject tree, final SubLObject assoc_struct, SubLObject candidate_pred, SubLObject assoc_getter, SubLObject value_accessor) {
        if (candidate_pred == list_utilities.UNPROVIDED) {
            candidate_pred = (SubLObject)list_utilities.$sym201$ATOM;
        }
        if (assoc_getter == list_utilities.UNPROVIDED) {
            assoc_getter = (SubLObject)list_utilities.$sym202$ASSOC;
        }
        if (value_accessor == list_utilities.UNPROVIDED) {
            value_accessor = (SubLObject)list_utilities.$sym19$CDR;
        }
        SubLObject isa_candidate = (SubLObject)list_utilities.NIL;
        SubLObject association = (SubLObject)list_utilities.NIL;
        SubLObject value = (SubLObject)list_utilities.NIL;
        SubLObject pcase_var = candidate_pred;
        if (pcase_var.eql((SubLObject)list_utilities.$sym201$ATOM)) {
            isa_candidate = Types.atom(tree);
        }
        else if (pcase_var.eql((SubLObject)list_utilities.$sym198$SYMBOLP)) {
            isa_candidate = Types.symbolp(tree);
        }
        else if (pcase_var.eql((SubLObject)list_utilities.$sym197$KEYWORDP)) {
            isa_candidate = Types.keywordp(tree);
        }
        else if (pcase_var.eql((SubLObject)list_utilities.$sym203$STRINGP)) {
            isa_candidate = Types.stringp(tree);
        }
        else {
            isa_candidate = Functions.funcall(candidate_pred, tree);
        }
        if (list_utilities.NIL != isa_candidate) {
            pcase_var = assoc_getter;
            if (pcase_var.eql((SubLObject)list_utilities.$sym202$ASSOC)) {
                association = conses_high.assoc(tree, assoc_struct, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED);
            }
            else {
                association = Functions.funcall(assoc_getter, tree, assoc_struct);
            }
            if (list_utilities.NIL != association) {
                pcase_var = value_accessor;
                if (pcase_var.eql((SubLObject)list_utilities.$sym19$CDR)) {
                    value = association.rest();
                }
                else {
                    value = Functions.funcall(value_accessor, association);
                }
                return value;
            }
            return tree;
        }
        else {
            if (tree.isCons()) {
                return (SubLObject)ConsesLow.cons(tree_substitute_by_association(tree.first(), assoc_struct, candidate_pred, assoc_getter, value_accessor), tree_substitute_by_association(tree.rest(), assoc_struct, candidate_pred, assoc_getter, value_accessor));
            }
            return tree;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 225881L)
    public static SubLObject safe_read_delimited_list(final SubLObject v_char, SubLObject input_stream, SubLObject recursive_p) {
        if (input_stream == list_utilities.UNPROVIDED) {
            input_stream = StreamsLow.$standard_input$.getDynamicValue();
        }
        if (recursive_p == list_utilities.UNPROVIDED) {
            recursive_p = (SubLObject)list_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject msg = (SubLObject)list_utilities.NIL;
        SubLObject l = (SubLObject)list_utilities.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)list_utilities.$sym204$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    l = reader.read_delimited_list(v_char, input_stream, recursive_p);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)list_utilities.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            msg = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (list_utilities.NIL != msg) {
            return msg;
        }
        return l;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 226270L)
    public static SubLObject multi_sublis(final SubLObject multi_alist, final SubLObject tree, SubLObject test, SubLObject key) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        if (list_utilities.NIL == tree) {
            return (SubLObject)ConsesLow.cons((SubLObject)list_utilities.NIL, (SubLObject)list_utilities.NIL);
        }
        SubLObject trees = multi_assoc(tree, multi_alist, test, key);
        if (list_utilities.NIL == trees) {
            if (tree.isCons()) {
                final SubLObject car_trees = multi_sublis(multi_alist, tree.first(), test, key);
                final SubLObject cdr_trees = multi_sublis(multi_alist, tree.rest(), test, key);
                SubLObject cdolist_list_var = car_trees;
                SubLObject car_tree = (SubLObject)list_utilities.NIL;
                car_tree = cdolist_list_var.first();
                while (list_utilities.NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$41 = cdr_trees;
                    SubLObject cdr_tree = (SubLObject)list_utilities.NIL;
                    cdr_tree = cdolist_list_var_$41.first();
                    while (list_utilities.NIL != cdolist_list_var_$41) {
                        trees = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(car_tree, cdr_tree), trees);
                        cdolist_list_var_$41 = cdolist_list_var_$41.rest();
                        cdr_tree = cdolist_list_var_$41.first();
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    car_tree = cdolist_list_var.first();
                }
            }
            else {
                trees = (SubLObject)ConsesLow.cons(tree, (SubLObject)list_utilities.NIL);
            }
        }
        return trees;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 227333L)
    public static SubLObject multi_assoc(final SubLObject item, final SubLObject multi_alist, SubLObject test, SubLObject key) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        SubLObject associations = (SubLObject)list_utilities.NIL;
        SubLObject cdolist_list_var = multi_alist;
        SubLObject key_values = (SubLObject)list_utilities.NIL;
        key_values = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            if (list_utilities.NIL != Functions.funcall(test, item, Functions.funcall(key, key_values.first()))) {
                associations = ConsesLow.append(key_values.rest(), associations);
            }
            cdolist_list_var = cdolist_list_var.rest();
            key_values = cdolist_list_var.first();
        }
        return associations;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 228213L)
    public static SubLObject valid_and_conformant_alist_p(final SubLObject v_object, SubLObject valid_keys, SubLObject test) {
        if (valid_keys == list_utilities.UNPROVIDED) {
            valid_keys = (SubLObject)list_utilities.NIL;
        }
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (!v_object.isList()) {
            return (SubLObject)list_utilities.NIL;
        }
        if (list_utilities.NIL != valid_keys) {
            SubLObject sublist = (SubLObject)list_utilities.NIL;
            SubLObject element = (SubLObject)list_utilities.NIL;
            sublist = v_object;
            element = (SubLObject)(sublist.isCons() ? sublist.first() : list_utilities.NIL);
            while (sublist.isCons()) {
                if (!element.isCons()) {
                    return (SubLObject)list_utilities.NIL;
                }
                if (list_utilities.NIL == subl_promotions.memberP(element.first(), valid_keys, test, (SubLObject)list_utilities.UNPROVIDED)) {
                    return (SubLObject)list_utilities.NIL;
                }
                sublist = sublist.rest();
                element = (SubLObject)(sublist.isCons() ? sublist.first() : list_utilities.NIL);
            }
            return (SubLObject)((list_utilities.NIL == sublist) ? list_utilities.T : list_utilities.NIL);
        }
        SubLObject sublist = (SubLObject)list_utilities.NIL;
        SubLObject element = (SubLObject)list_utilities.NIL;
        sublist = v_object;
        element = (SubLObject)(sublist.isCons() ? sublist.first() : list_utilities.NIL);
        while (sublist.isCons()) {
            if (!element.isCons()) {
                return (SubLObject)list_utilities.NIL;
            }
            sublist = sublist.rest();
            element = (SubLObject)(sublist.isCons() ? sublist.first() : list_utilities.NIL);
        }
        return (SubLObject)((list_utilities.NIL == sublist) ? list_utilities.T : list_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 229313L)
    public static SubLObject histogram(final SubLObject list, SubLObject sort_pred, SubLObject key, SubLObject key_sort_pred) {
        if (sort_pred == list_utilities.UNPROVIDED) {
            sort_pred = Symbols.symbol_function((SubLObject)list_utilities.$sym97$_);
        }
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (key_sort_pred == list_utilities.UNPROVIDED) {
            key_sort_pred = (SubLObject)list_utilities.NIL;
        }
        final SubLObject dict = dictionary.new_dictionary(key, Sequences.length(list));
        SubLObject cdolist_list_var = list;
        SubLObject elem = (SubLObject)list_utilities.NIL;
        elem = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            dictionary_utilities.dictionary_increment(dict, elem, (SubLObject)list_utilities.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        SubLObject alist = dictionary_utilities.sort_dictionary_by_values(dict, sort_pred);
        if (list_utilities.NIL != key_sort_pred) {
            alist = Sort.stable_sort(alist, key_sort_pred, Symbols.symbol_function((SubLObject)list_utilities.$sym20$CAR));
        }
        return alist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 229760L)
    public static SubLObject histogram_as_plist(final SubLObject list, SubLObject sort_pred, SubLObject key, SubLObject key_sort_pred) {
        if (sort_pred == list_utilities.UNPROVIDED) {
            sort_pred = Symbols.symbol_function((SubLObject)list_utilities.$sym97$_);
        }
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.EQL);
        }
        if (key_sort_pred == list_utilities.UNPROVIDED) {
            key_sort_pred = (SubLObject)list_utilities.NIL;
        }
        return alist_to_plist(histogram(list, sort_pred, key, key_sort_pred));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 229925L)
    public static SubLObject pretty_print_histogram(final SubLObject histogram) {
        return pretty_print_plist(alist_to_plist(histogram), (SubLObject)list_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 230033L)
    public static SubLObject n_within(final SubLObject list, final SubLObject i, final SubLObject width) {
        SubLObject result = (SubLObject)list_utilities.NIL;
        SubLObject end_var;
        SubLObject num;
        for (end_var = Numbers.add(i, width, (SubLObject)list_utilities.ONE_INTEGER), num = (SubLObject)list_utilities.NIL, num = Numbers.subtract(i, width); !num.numGE(end_var); num = number_utilities.f_1X(num)) {
            result = (SubLObject)ConsesLow.cons(ConsesLow.nth(num, list), result);
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 230488L)
    public static SubLObject middle_sublist(final SubLObject list, final SubLObject width) {
        return n_within(list, Numbers.integerDivide(Sequences.length(list), (SubLObject)list_utilities.TWO_INTEGER), width);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 230816L)
    public static SubLObject categorize_list_elements(final SubLObject list, final SubLObject category_methods, SubLObject key) {
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        SubLObject categories = (SubLObject)ConsesLow.make_list(Sequences.length(category_methods), (SubLObject)list_utilities.UNPROVIDED);
        SubLObject remainders = (SubLObject)list_utilities.NIL;
        SubLObject cdolist_list_var = list;
        SubLObject item = (SubLObject)list_utilities.NIL;
        item = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            final SubLObject item_key = Functions.funcall(key, item);
            SubLObject categorizedP = (SubLObject)list_utilities.NIL;
            SubLObject list_var = (SubLObject)list_utilities.NIL;
            SubLObject category_method = (SubLObject)list_utilities.NIL;
            SubLObject index = (SubLObject)list_utilities.NIL;
            list_var = category_methods;
            category_method = list_var.first();
            for (index = (SubLObject)list_utilities.ZERO_INTEGER; list_utilities.NIL == categorizedP && list_utilities.NIL != list_var; list_var = list_var.rest(), category_method = list_var.first(), index = number_utilities.f_1X(index)) {
                if (list_utilities.NIL != Functions.funcall(category_method, item_key)) {
                    categorizedP = (SubLObject)list_utilities.T;
                    ConsesLow.set_nth(index, categories, (SubLObject)ConsesLow.cons(item, ConsesLow.nth(index, categories)));
                }
            }
            if (list_utilities.NIL == categorizedP) {
                remainders = (SubLObject)ConsesLow.cons(item, remainders);
            }
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        }
        categories = nmapcar(Symbols.symbol_function((SubLObject)list_utilities.$sym85$NREVERSE), categories);
        if (list_utilities.NIL != remainders) {
            categories = ConsesLow.nconc(categories, (SubLObject)ConsesLow.list(Sequences.nreverse(remainders)));
        }
        return categories;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 231924L)
    public static SubLObject rank_tuples(final SubLObject tuples) {
        final SubLObject length = Sequences.length(tuples.first());
        final SubLObject rank_dictionaries = Mapping.mapcar(Symbols.symbol_function((SubLObject)list_utilities.$sym205$NEW_DICTIONARY), (SubLObject)ConsesLow.make_list(length, Symbols.symbol_function((SubLObject)list_utilities.EQ)));
        SubLObject index;
        SubLObject key_func;
        SubLObject sorted_tuples;
        SubLObject rank_dictionary;
        SubLObject list_var;
        SubLObject tuple;
        SubLObject rank;
        for (index = (SubLObject)list_utilities.NIL, index = (SubLObject)list_utilities.ZERO_INTEGER; index.numL(length); index = Numbers.add(index, (SubLObject)list_utilities.ONE_INTEGER)) {
            key_func = ConsesLow.nth(index, (SubLObject)list_utilities.$list206);
            assert list_utilities.NIL != Types.function_spec_p(key_func) : key_func;
            sorted_tuples = Sort.stable_sort(conses_high.copy_list(tuples), Symbols.symbol_function((SubLObject)list_utilities.$sym97$_), key_func);
            rank_dictionary = ConsesLow.nth(index, rank_dictionaries);
            list_var = (SubLObject)list_utilities.NIL;
            tuple = (SubLObject)list_utilities.NIL;
            rank = (SubLObject)list_utilities.NIL;
            list_var = sorted_tuples;
            tuple = list_var.first();
            for (rank = (SubLObject)list_utilities.ZERO_INTEGER; list_utilities.NIL != list_var; list_var = list_var.rest(), tuple = list_var.first(), rank = Numbers.add((SubLObject)list_utilities.ONE_INTEGER, rank)) {
                dictionary.dictionary_enter(rank_dictionary, tuple, rank);
            }
        }
        SubLObject ranked_tuples = (SubLObject)list_utilities.NIL;
        SubLObject cdolist_list_var = tuples;
        SubLObject tuple2 = (SubLObject)list_utilities.NIL;
        tuple2 = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            SubLObject ranked_tuple = (SubLObject)list_utilities.NIL;
            list_var = (SubLObject)list_utilities.NIL;
            SubLObject value = (SubLObject)list_utilities.NIL;
            SubLObject index2 = (SubLObject)list_utilities.NIL;
            list_var = tuple2;
            value = list_var.first();
            for (index2 = (SubLObject)list_utilities.ZERO_INTEGER; list_utilities.NIL != list_var; list_var = list_var.rest(), value = list_var.first(), index2 = Numbers.add((SubLObject)list_utilities.ONE_INTEGER, index2)) {
                final SubLObject rank2 = dictionary.dictionary_lookup(ConsesLow.nth(index2, rank_dictionaries), tuple2, (SubLObject)list_utilities.UNPROVIDED);
                ranked_tuple = (SubLObject)ConsesLow.cons(rank2, ranked_tuple);
                ranked_tuple = (SubLObject)ConsesLow.cons(value, ranked_tuple);
            }
            ranked_tuples = (SubLObject)ConsesLow.cons(Sequences.nreverse(ranked_tuple), ranked_tuples);
            cdolist_list_var = cdolist_list_var.rest();
            tuple2 = cdolist_list_var.first();
        }
        return Sequences.nreverse(ranked_tuples);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 233028L)
    public static SubLObject collate(final SubLObject tuples_list) {
        if (list_utilities.NIL != singletonP(tuples_list)) {
            return tuples_list.first();
        }
        SubLObject result_tuples = (SubLObject)list_utilities.NIL;
        SubLObject i = (SubLObject)list_utilities.ZERO_INTEGER;
        SubLObject doneP = (SubLObject)list_utilities.NIL;
        while (list_utilities.NIL == doneP) {
            SubLObject result_tuple = (SubLObject)list_utilities.NIL;
            if (list_utilities.NIL == doneP) {
                SubLObject csome_list_var = tuples_list;
                SubLObject tuples = (SubLObject)list_utilities.NIL;
                tuples = csome_list_var.first();
                while (list_utilities.NIL == doneP && list_utilities.NIL != csome_list_var) {
                    final SubLObject tuple = ConsesLow.nth(i, tuples);
                    if (list_utilities.NIL != tuple) {
                        result_tuple = ConsesLow.append(result_tuple, tuple);
                    }
                    else {
                        doneP = (SubLObject)list_utilities.T;
                    }
                    csome_list_var = csome_list_var.rest();
                    tuples = csome_list_var.first();
                }
            }
            if (list_utilities.NIL == doneP) {
                i = Numbers.add(i, (SubLObject)list_utilities.ONE_INTEGER);
                result_tuples = (SubLObject)ConsesLow.cons(result_tuple, result_tuples);
            }
        }
        return Sequences.nreverse(result_tuples);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 233747L)
    public static SubLObject list_with_first_p(final SubLObject v_object, final SubLObject first) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isCons() && first.equal(v_object.first()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 233952L)
    public static SubLObject elements_incompatibleP(final SubLObject elem1, final SubLObject elem2, final SubLObject incompatible_pairs) {
        if (elem1.equal(elem2)) {
            return (SubLObject)list_utilities.NIL;
        }
        if (elem1.equal(elem2)) {
            return (SubLObject)list_utilities.NIL;
        }
        SubLObject cdolist_list_var = incompatible_pairs;
        SubLObject incompatible_pair = (SubLObject)list_utilities.NIL;
        incompatible_pair = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            if (list_utilities.NIL != member_equalP(elem1, incompatible_pair) && list_utilities.NIL != member_equalP(elem2, incompatible_pair)) {
                return (SubLObject)list_utilities.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            incompatible_pair = cdolist_list_var.first();
        }
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 234281L)
    public static SubLObject element_incompatible_with_any_of(final SubLObject elem, final SubLObject elems, final SubLObject incompatible_pairs) {
        SubLObject other_incompatible_elems = (SubLObject)list_utilities.NIL;
        SubLObject cdolist_list_var = elems;
        SubLObject other_elem = (SubLObject)list_utilities.NIL;
        other_elem = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            if (list_utilities.NIL != elements_incompatibleP(elem, other_elem, incompatible_pairs)) {
                other_incompatible_elems = (SubLObject)ConsesLow.cons(other_elem, other_incompatible_elems);
            }
            cdolist_list_var = cdolist_list_var.rest();
            other_elem = cdolist_list_var.first();
        }
        return other_incompatible_elems;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 234586L)
    public static SubLObject compute_all_compatible_sublists(final SubLObject list, final SubLObject incompatible_pairs, SubLObject prefix_list, SubLObject skip_list) {
        if (prefix_list == list_utilities.UNPROVIDED) {
            prefix_list = (SubLObject)list_utilities.NIL;
        }
        if (skip_list == list_utilities.UNPROVIDED) {
            skip_list = (SubLObject)list_utilities.NIL;
        }
        final SubLObject debugP = (SubLObject)list_utilities.NIL;
        if (list_utilities.NIL == list) {
            if (list_utilities.NIL != prefix_list) {
                return (SubLObject)ConsesLow.list((SubLObject)list_utilities.NIL);
            }
            return (SubLObject)list_utilities.NIL;
        }
        else {
            final SubLObject first_elem = list.first();
            SubLObject relevant_incompatibility_sets = (SubLObject)list_utilities.NIL;
            SubLObject results = (SubLObject)list_utilities.NIL;
            SubLObject cdolist_list_var = incompatible_pairs;
            SubLObject incompatible_pair = (SubLObject)list_utilities.NIL;
            incompatible_pair = cdolist_list_var.first();
            while (list_utilities.NIL != cdolist_list_var) {
                if (list_utilities.NIL != member_equalP(first_elem, incompatible_pair)) {
                    relevant_incompatibility_sets = (SubLObject)ConsesLow.cons(incompatible_pair, relevant_incompatibility_sets);
                }
                cdolist_list_var = cdolist_list_var.rest();
                incompatible_pair = cdolist_list_var.first();
            }
            if (list_utilities.NIL == relevant_incompatibility_sets) {
                if (list_utilities.NIL != debugP) {
                    PrintLow.format((SubLObject)list_utilities.T, (SubLObject)list_utilities.$str207$choose__S__default___, first_elem);
                }
                cdolist_list_var = compute_all_compatible_sublists(list.rest(), incompatible_pairs, snoc(first_elem, prefix_list), skip_list);
                SubLObject future_result = (SubLObject)list_utilities.NIL;
                future_result = cdolist_list_var.first();
                while (list_utilities.NIL != cdolist_list_var) {
                    results = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(first_elem, future_result), results);
                    cdolist_list_var = cdolist_list_var.rest();
                    future_result = cdolist_list_var.first();
                }
                return remove_subsumed_items(results, (SubLObject)list_utilities.$sym208$FAST_SUPERSET_, (SubLObject)list_utilities.UNPROVIDED);
            }
            if (list_utilities.NIL != relevant_incompatibility_sets) {
                SubLObject past_incompatibleP = (SubLObject)list_utilities.NIL;
                SubLObject future_incompatible_choosable_list = (SubLObject)list_utilities.NIL;
                SubLObject choice_incompatible_with_previous_skipsP = (SubLObject)list_utilities.NIL;
                if (list_utilities.NIL != element_incompatible_with_any_of(first_elem, prefix_list, incompatible_pairs)) {
                    past_incompatibleP = (SubLObject)list_utilities.T;
                }
                SubLObject cdolist_list_var2;
                final SubLObject future_incompatible_choosable_elems = cdolist_list_var2 = element_incompatible_with_any_of(first_elem, list.rest(), incompatible_pairs);
                SubLObject future_incompatible_choosable_elem = (SubLObject)list_utilities.NIL;
                future_incompatible_choosable_elem = cdolist_list_var2.first();
                while (list_utilities.NIL != cdolist_list_var2) {
                    if (list_utilities.NIL == element_incompatible_with_any_of(future_incompatible_choosable_elem, prefix_list, incompatible_pairs)) {
                        future_incompatible_choosable_list = (SubLObject)ConsesLow.cons(future_incompatible_choosable_elem, future_incompatible_choosable_list);
                    }
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    future_incompatible_choosable_elem = cdolist_list_var2.first();
                }
                SubLObject incompatible_with_all_skipsP = sublisp_boolean(skip_list);
                cdolist_list_var2 = skip_list;
                SubLObject skip = (SubLObject)list_utilities.NIL;
                skip = cdolist_list_var2.first();
                while (list_utilities.NIL != cdolist_list_var2) {
                    if (list_utilities.NIL != member_equalP(first_elem, skip) || list_utilities.NIL == element_incompatible_with_any_of(first_elem, skip.rest(), incompatible_pairs)) {
                        incompatible_with_all_skipsP = (SubLObject)list_utilities.NIL;
                    }
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    skip = cdolist_list_var2.first();
                }
                if (list_utilities.NIL != incompatible_with_all_skipsP) {
                    if (list_utilities.NIL != debugP) {
                        PrintLow.format((SubLObject)list_utilities.T, (SubLObject)list_utilities.$str209$can_t_choose__S_since_incompatibl, first_elem, Mapping.mapcar((SubLObject)list_utilities.$sym19$CDR, skip_list));
                    }
                    choice_incompatible_with_previous_skipsP = (SubLObject)list_utilities.T;
                }
                if (list_utilities.NIL != debugP) {
                    PrintLow.format((SubLObject)list_utilities.T, (SubLObject)list_utilities.$str210$past_incompatible___S__, past_incompatibleP);
                    PrintLow.format((SubLObject)list_utilities.T, (SubLObject)list_utilities.$str211$future_incompatible_choosable___S, future_incompatible_choosable_list);
                }
                if (list_utilities.NIL == past_incompatibleP && list_utilities.NIL == choice_incompatible_with_previous_skipsP) {
                    if (list_utilities.NIL != debugP) {
                        PrintLow.format((SubLObject)list_utilities.T, (SubLObject)list_utilities.$str212$choose__S__not_past_incompatible_, first_elem);
                    }
                    SubLObject cdolist_list_var3 = compute_all_compatible_sublists(list.rest(), incompatible_pairs, snoc(first_elem, prefix_list), skip_list);
                    SubLObject future_result2 = (SubLObject)list_utilities.NIL;
                    future_result2 = cdolist_list_var3.first();
                    while (list_utilities.NIL != cdolist_list_var3) {
                        results = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(first_elem, future_result2), results);
                        cdolist_list_var3 = cdolist_list_var3.rest();
                        future_result2 = cdolist_list_var3.first();
                    }
                }
                if (list_utilities.NIL != future_incompatible_choosable_list || list_utilities.NIL != past_incompatibleP) {
                    if (list_utilities.NIL != debugP) {
                        PrintLow.format((SubLObject)list_utilities.T, (SubLObject)list_utilities.$str213$skip__S__past_incompatible_or_fut, first_elem);
                    }
                    SubLObject cdolist_list_var3 = compute_all_compatible_sublists(list.rest(), incompatible_pairs, prefix_list, snoc((SubLObject)ConsesLow.cons(first_elem, future_incompatible_choosable_list), skip_list));
                    SubLObject future_result2 = (SubLObject)list_utilities.NIL;
                    future_result2 = cdolist_list_var3.first();
                    while (list_utilities.NIL != cdolist_list_var3) {
                        results = (SubLObject)ConsesLow.cons(future_result2, results);
                        cdolist_list_var3 = cdolist_list_var3.rest();
                        future_result2 = cdolist_list_var3.first();
                    }
                }
            }
            if (list_utilities.NIL != results) {
                return remove_subsumed_items(results, (SubLObject)list_utilities.$sym208$FAST_SUPERSET_, (SubLObject)list_utilities.UNPROVIDED);
            }
            if (list_utilities.NIL != prefix_list) {
                return (SubLObject)ConsesLow.list((SubLObject)list_utilities.NIL);
            }
            return (SubLObject)list_utilities.NIL;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 238018L)
    public static SubLObject test_compute_all_compatible_sublists(final SubLObject list, final SubLObject incompatible_pairs, final SubLObject v_answer) {
        return sets_equalP(compute_all_compatible_sublists(list, incompatible_pairs, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED), v_answer, (SubLObject)list_utilities.$sym214$SETS_EQUAL_);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 238018L)
    public static SubLObject gather_nodes_and_incompatible_pairs_from_graph_txt(final SubLObject graph_string) {
        final SubLObject lines = string_utilities.string_tokenize(string_utilities.trim_whitespace(graph_string), (SubLObject)list_utilities.$list218, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED);
        final SubLObject node_count = Sequences.length(lines);
        SubLObject node_numbers = (SubLObject)list_utilities.NIL;
        SubLObject incompatible_pairs = (SubLObject)list_utilities.NIL;
        SubLObject list_var = (SubLObject)list_utilities.NIL;
        SubLObject line = (SubLObject)list_utilities.NIL;
        SubLObject x = (SubLObject)list_utilities.NIL;
        list_var = lines;
        line = list_var.first();
        for (x = (SubLObject)list_utilities.ZERO_INTEGER; list_utilities.NIL != list_var; list_var = list_var.rest(), line = list_var.first(), x = Numbers.add((SubLObject)list_utilities.ONE_INTEGER, x)) {
            final SubLObject elems = string_utilities.string_tokenize(string_utilities.trim_whitespace(line), (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED);
            if (!node_count.eql(Sequences.length(elems))) {
                Errors.error((SubLObject)list_utilities.$str219$Invalid_graph_txt_specification_r, line, node_count);
            }
            node_numbers = (SubLObject)ConsesLow.cons(Numbers.add(x, (SubLObject)list_utilities.ONE_INTEGER), node_numbers);
            SubLObject list_var_$42 = (SubLObject)list_utilities.NIL;
            SubLObject elem = (SubLObject)list_utilities.NIL;
            SubLObject y = (SubLObject)list_utilities.NIL;
            list_var_$42 = elems;
            elem = list_var_$42.first();
            for (y = (SubLObject)list_utilities.ZERO_INTEGER; list_utilities.NIL != list_var_$42; list_var_$42 = list_var_$42.rest(), elem = list_var_$42.first(), y = Numbers.add((SubLObject)list_utilities.ONE_INTEGER, y)) {
                if (elem.equal((SubLObject)list_utilities.$str220$1)) {
                    incompatible_pairs = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(Numbers.add(x, (SubLObject)list_utilities.ONE_INTEGER), Numbers.add(y, (SubLObject)list_utilities.ONE_INTEGER)), incompatible_pairs);
                }
            }
        }
        return Values.values(Sequences.nreverse(node_numbers), incompatible_pairs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 238018L)
    public static SubLObject test_find_maximum_independent_set(final SubLObject graph_txt, final SubLObject answer_max_length, final SubLObject answers) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject node_numbers = gather_nodes_and_incompatible_pairs_from_graph_txt(graph_txt);
        final SubLObject incompatible_pairs = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject sets = compute_all_compatible_sublists(node_numbers, incompatible_pairs, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED);
        SubLObject max_length = (SubLObject)list_utilities.ZERO_INTEGER;
        SubLObject cdolist_list_var = sets;
        SubLObject v_set = (SubLObject)list_utilities.NIL;
        v_set = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            max_length = Numbers.max(max_length, Sequences.length(v_set));
            cdolist_list_var = cdolist_list_var.rest();
            v_set = cdolist_list_var.first();
        }
        if (max_length.eql(answer_max_length) && list_utilities.NIL != conses_high.subsetp(answers, sets, Symbols.symbol_function((SubLObject)list_utilities.EQUAL), (SubLObject)list_utilities.UNPROVIDED)) {
            return (SubLObject)list_utilities.T;
        }
        PrintLow.format((SubLObject)list_utilities.T, (SubLObject)list_utilities.$str221$Expected___S__, answers);
        PrintLow.format((SubLObject)list_utilities.T, (SubLObject)list_utilities.$str222$Got___);
        cdolist_list_var = sets;
        v_set = (SubLObject)list_utilities.NIL;
        v_set = cdolist_list_var.first();
        while (list_utilities.NIL != cdolist_list_var) {
            PrintLow.format((SubLObject)list_utilities.T, (SubLObject)list_utilities.$str223$___S__, v_set);
            cdolist_list_var = cdolist_list_var.rest();
            v_set = cdolist_list_var.first();
        }
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 256672L)
    public static SubLObject comparator_compare_internal(final SubLObject predicate, final SubLObject val1, final SubLObject val2) {
        final SubLObject predicate_1_2 = Functions.funcall(predicate, val1, val2);
        final SubLObject predicate_2_1 = Functions.funcall(predicate, val2, val1);
        return (SubLObject)((list_utilities.NIL != predicate_1_2) ? ((list_utilities.NIL != predicate_2_1) ? list_utilities.ZERO_INTEGER : list_utilities.ONE_INTEGER) : ((list_utilities.NIL != predicate_2_1) ? list_utilities.MINUS_ONE_INTEGER : list_utilities.ZERO_INTEGER));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 256672L)
    public static SubLObject comparator_compare(final SubLObject predicate, final SubLObject val1, final SubLObject val2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)list_utilities.NIL;
        if (list_utilities.NIL == v_memoization_state) {
            return comparator_compare_internal(predicate, val1, val2);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)list_utilities.$sym226$COMPARATOR_COMPARE, (SubLObject)list_utilities.UNPROVIDED);
        if (list_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)list_utilities.$sym226$COMPARATOR_COMPARE, (SubLObject)list_utilities.THREE_INTEGER, (SubLObject)list_utilities.NIL, (SubLObject)list_utilities.EQUAL, (SubLObject)list_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)list_utilities.$sym226$COMPARATOR_COMPARE, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(predicate, val1, val2);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)list_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)list_utilities.NIL;
            collision = cdolist_list_var.first();
            while (list_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (predicate.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (val1.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (list_utilities.NIL != cached_args && list_utilities.NIL == cached_args.rest() && val2.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(comparator_compare_internal(predicate, val1, val2)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(predicate, val1, val2));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 257080L)
    public static SubLObject sort_preferred_list_to_front(final SubLObject l, final SubLObject preferred_list, SubLObject key) {
        if (key == list_utilities.UNPROVIDED) {
            key = (SubLObject)list_utilities.IDENTITY;
        }
        return sort_preferred_to_front(l, set_utilities.construct_set_from_list(preferred_list, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED), key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 257944L)
    public static SubLObject sort_preferred_to_front(final SubLObject l, final SubLObject preferred, SubLObject key) {
        if (key == list_utilities.UNPROVIDED) {
            key = (SubLObject)list_utilities.IDENTITY;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = list_utilities.$preferred_term_set$.currentBinding(thread);
        try {
            list_utilities.$preferred_term_set$.bind(preferred, thread);
            return Sort.stable_sort(l, (SubLObject)list_utilities.$sym228$A_PREFERRED_OVER_B, key);
        }
        finally {
            list_utilities.$preferred_term_set$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 258524L)
    public static SubLObject a_preferred_over_b(final SubLObject a, final SubLObject b) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(list_utilities.NIL != set.set_memberP(a, list_utilities.$preferred_term_set$.getDynamicValue(thread)) && list_utilities.NIL == set.set_memberP(b, list_utilities.$preferred_term_set$.getDynamicValue(thread)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 258671L)
    public static SubLObject debug_comparison_method_violates_its_general_contract(final SubLObject seq, final SubLObject predicate, SubLObject key, SubLObject print_all_violationsP) {
        if (key == list_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)list_utilities.IDENTITY);
        }
        if (print_all_violationsP == list_utilities.UNPROVIDED) {
            print_all_violationsP = (SubLObject)list_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state((SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                SubLObject cdolist_list_var = seq;
                SubLObject elem1 = (SubLObject)list_utilities.NIL;
                elem1 = cdolist_list_var.first();
                while (list_utilities.NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$43 = seq;
                    SubLObject elem2 = (SubLObject)list_utilities.NIL;
                    elem2 = cdolist_list_var_$43.first();
                    while (list_utilities.NIL != cdolist_list_var_$43) {
                        final SubLObject elem1_key = Functions.funcall(key, elem1);
                        final SubLObject elem2_key = Functions.funcall(key, elem2);
                        final SubLObject compare_1_2 = comparator_compare(predicate, elem1_key, elem2_key);
                        final SubLObject compare_2_1 = comparator_compare(predicate, elem2_key, elem1_key);
                        if (!compare_1_2.numE(Numbers.minus(compare_2_1))) {
                            PrintLow.format((SubLObject)list_utilities.T, (SubLObject)list_utilities.$str229$__The_implementer_must_ensure_tha, new SubLObject[] { elem1, elem2, compare_1_2, predicate, quotify(elem1), quotify(elem2), compare_2_1, predicate, quotify(elem2), quotify(elem1) });
                            if (list_utilities.NIL == print_all_violationsP) {
                                return (SubLObject)list_utilities.NIL;
                            }
                        }
                        if (compare_1_2.numG((SubLObject)list_utilities.ZERO_INTEGER)) {
                            SubLObject cdolist_list_var_$44 = seq;
                            SubLObject elem3 = (SubLObject)list_utilities.NIL;
                            elem3 = cdolist_list_var_$44.first();
                            while (list_utilities.NIL != cdolist_list_var_$44) {
                                final SubLObject elem3_key = Functions.funcall(key, elem3);
                                final SubLObject compare_2_2 = comparator_compare(predicate, elem2_key, elem3_key);
                                if (compare_2_2.numG((SubLObject)list_utilities.ZERO_INTEGER)) {
                                    final SubLObject compare_1_3 = comparator_compare(predicate, elem1_key, elem3_key);
                                    if (!compare_1_3.numG((SubLObject)list_utilities.ZERO_INTEGER)) {
                                        PrintLow.format((SubLObject)list_utilities.T, (SubLObject)list_utilities.$str230$__The_implementer_must_ensure_tha, new SubLObject[] { elem1, elem2, elem3, compare_1_2, predicate, quotify(elem1), quotify(elem2), compare_2_2, predicate, quotify(elem2), quotify(elem3), compare_1_3, predicate, quotify(elem1), quotify(elem3) });
                                        if (list_utilities.NIL == print_all_violationsP) {
                                            return (SubLObject)list_utilities.NIL;
                                        }
                                    }
                                }
                                cdolist_list_var_$44 = cdolist_list_var_$44.rest();
                                elem3 = cdolist_list_var_$44.first();
                            }
                        }
                        if (list_utilities.ZERO_INTEGER.numE(compare_1_2)) {
                            SubLObject cdolist_list_var_$45 = seq;
                            SubLObject elem3 = (SubLObject)list_utilities.NIL;
                            elem3 = cdolist_list_var_$45.first();
                            while (list_utilities.NIL != cdolist_list_var_$45) {
                                final SubLObject elem3_key = Functions.funcall(key, elem3);
                                final SubLObject compare_1_4 = comparator_compare(predicate, elem1_key, elem3_key);
                                final SubLObject compare_2_3 = comparator_compare(predicate, elem2_key, elem3_key);
                                if (!compare_1_4.numE(compare_2_3)) {
                                    PrintLow.format((SubLObject)list_utilities.T, (SubLObject)list_utilities.$str231$__The_implementer_must_ensure_tha, new SubLObject[] { elem1, elem2, elem3, compare_1_2, predicate, quotify(elem1), quotify(elem2), compare_1_4, predicate, quotify(elem1), quotify(elem3), compare_2_3, predicate, quotify(elem2), quotify(elem3) });
                                    if (list_utilities.NIL == print_all_violationsP) {
                                        return (SubLObject)list_utilities.NIL;
                                    }
                                }
                                cdolist_list_var_$45 = cdolist_list_var_$45.rest();
                                elem3 = cdolist_list_var_$45.first();
                            }
                        }
                        cdolist_list_var_$43 = cdolist_list_var_$43.rest();
                        elem2 = cdolist_list_var_$43.first();
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    elem1 = cdolist_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$46 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)list_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$46, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)list_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/list-utilities.lisp", position = 262668L)
    public static SubLObject find_first_and_nreplace_test(final SubLObject old, final SubLObject v_new, final SubLObject list, SubLObject test) {
        if (test == list_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)list_utilities.EQ);
        }
        return find_first_and_nreplace(old, v_new, conses_high.copy_list(list), test);
    }
    
    public static SubLObject declare_list_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "sublisp_boolean", "BOOLEAN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "not_boolean", "NOT-BOOLEAN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "not_eq", "NOT-EQ", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "not_eql", "NOT-EQL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "not_equal", "NOT-EQUAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "not_equalp", "NOT-EQUALP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "not_assoc", "NOT-ASSOC", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "not_consp", "NOT-CONSP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "eq_and_not_eq", "EQ-AND-NOT-EQ", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "bull", "BULL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "no_op", "NO-OP", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "caadr", "CAADR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "caddr", "CADDR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "cdddr", "CDDDR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "cadddr", "CADDDR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "cadadr", "CADADR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "cadar", "CADAR", 1, 0, false);
        new $cadar$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "cdadr", "CDADR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "snoc", "SNOC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "list_rotate_left", "LIST-ROTATE-LEFT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "list_rotate_right", "LIST-ROTATE-RIGHT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "proper_subsetp", "PROPER-SUBSETP", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "proper_subsetp_pre_sorted", "PROPER-SUBSETP-PRE-SORTED", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "nth_cycling", "NTH-CYCLING", 2, 2, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.list_utilities", "pop_setq", "POP-SETQ");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.list_utilities", "pop_bind", "POP-BIND");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.list_utilities", "push_max_length", "PUSH-MAX-LENGTH");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.list_utilities", "cdolist_multiple", "CDOLIST-MULTIPLE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.list_utilities", "cdolist_multiple_numbered", "CDOLIST-MULTIPLE-NUMBERED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.list_utilities", "csome_multiple", "CSOME-MULTIPLE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.list_utilities", "cdolist_numbered", "CDOLIST-NUMBERED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.list_utilities", "cdolist_backward", "CDOLIST-BACKWARD");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.list_utilities", "cdolist_backward_numbered", "CDOLIST-BACKWARD-NUMBERED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.list_utilities", "csome_numbered", "CSOME-NUMBERED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.list_utilities", "cdolist_cycling", "CDOLIST-CYCLING");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.list_utilities", "cdolist_cycling_complex", "CDOLIST-CYCLING-COMPLEX");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.list_utilities", "do_tree_leaves", "DO-TREE-LEAVES");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "args_from_arg_list", "ARGS-FROM-ARG-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "lengthL", "LENGTH<", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "lengthLE", "LENGTH<=", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "lengthE", "LENGTH=", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "lengthsE", "LENGTHS=", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "lengthG", "LENGTH>", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "lengthGE", "LENGTH>=", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "zero_length_p", "ZERO-LENGTH-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "same_length_p", "SAME-LENGTH-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "same_lengths_p", "SAME-LENGTHS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "longer_p", "LONGER-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "greater_length_p", "GREATER-LENGTH-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "greater_or_same_length_p", "GREATER-OR-SAME-LENGTH-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "shorter_p", "SHORTER-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "lesser_length_p", "LESSER-LENGTH-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "lesser_or_same_length_p", "LESSER-OR-SAME-LENGTH-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "empty_list_p", "EMPTY-LIST-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "non_empty_list_p", "NON-EMPTY-LIST-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "proper_list_p", "PROPER-LIST-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "dotted_list_p", "DOTTED-LIST-P", 1, 0, false);
        new $dotted_list_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "non_dotted_list_p", "NON-DOTTED-LIST-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "dotted_length", "DOTTED-LENGTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "dotted_last", "DOTTED-LAST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "dotted_butlast", "DOTTED-BUTLAST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "undot", "UNDOT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "add_to_dotted_end", "ADD-TO-DOTTED-END", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "nadd_to_dotted_end", "NADD-TO-DOTTED-END", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "ndot_last", "NDOT-LAST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "dot_last", "DOT-LAST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "possible_dotted_list_to_dotted_list", "POSSIBLE-DOTTED-LIST-TO-DOTTED-LIST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "list_non_dotted_through_n_p", "LIST-NON-DOTTED-THROUGH-N-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "negated_test_func", "NEGATED-TEST-FUNC", 1, 0, false);
        new $negated_test_func$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "remove_if_not", "REMOVE-IF-NOT", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "delete_if_not", "DELETE-IF-NOT", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "substitute_if_not", "SUBSTITUTE-IF-NOT", 3, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "nsubstitute_if_not", "NSUBSTITUTE-IF-NOT", 3, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "find_if_not", "FIND-IF-NOT", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "position_if_not", "POSITION-IF-NOT", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "position_if_binary_lambda", "POSITION-IF-BINARY-LAMBDA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "position_if_binary", "POSITION-IF-BINARY", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "position_from_end", "POSITION-FROM-END", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "tree_positions", "TREE-POSITIONS", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "tree_positions_w_parents", "TREE-POSITIONS-W-PARENTS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "difference_from_head", "DIFFERENCE-FROM-HEAD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "tree_position_bfs", "TREE-POSITION-BFS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "tree_position_dfs", "TREE-POSITION-DFS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "list_position", "LIST-POSITION", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "tree_position_p", "TREE-POSITION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "tree_nested_nths", "TREE-NESTED-NTHS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "tree_nths", "TREE-NTHS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "has_nested_nth_p", "HAS-NESTED-NTH-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "get_nested_nth", "GET-NESTED-NTH", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "replace_nested_nth", "REPLACE-NESTED-NTH", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "nreplace_nested_nth", "NREPLACE-NESTED-NTH", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "remove_nested_nth", "REMOVE-NESTED-NTH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "delete_nested_nth", "DELETE-NESTED-NTH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "delete_nested_nth_internal", "DELETE-NESTED-NTH-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "tree_positions_int", "TREE-POSITIONS-INT", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "tree_positions_dfs", "TREE-POSITIONS-DFS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "tree_positions_bfs", "TREE-POSITIONS-BFS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "containing_subtrees", "CONTAINING-SUBTREES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "tree_positions_if_dfs", "TREE-POSITIONS-IF-DFS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "tree_positions_if_bfs", "TREE-POSITIONS-IF-BFS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "tree_positions_if_dfs_int", "TREE-POSITIONS-IF-DFS-INT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "tree_position_if_bfs", "TREE-POSITION-IF-BFS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "tree_position_if_dfs", "TREE-POSITION-IF-DFS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "count_if_not", "COUNT-IF-NOT", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "subst_if_not", "SUBST-IF-NOT", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "nsubst_if_not", "NSUBST-IF-NOT", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "member_if_not", "MEMBER-IF-NOT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "assoc_if_not", "ASSOC-IF-NOT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "rassoc_if_not", "RASSOC-IF-NOT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "assoc_all", "ASSOC-ALL", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "assoc_push", "ASSOC-PUSH", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "assoc_pushnew", "ASSOC-PUSHNEW", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "dotted_assoc_push", "DOTTED-ASSOC-PUSH", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "assoc_equal", "ASSOC-EQUAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "assoc_subsumedP", "ASSOC-SUBSUMED?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "alist_extend", "ALIST-EXTEND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "make_alist", "MAKE-ALIST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "make_alist_from_keys_and_values", "MAKE-ALIST-FROM-KEYS-AND-VALUES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "make_pair_list", "MAKE-PAIR-LIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "make_paired_lists", "MAKE-PAIRED-LISTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "first_safe_for_atoms", "FIRST-SAFE-FOR-ATOMS", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.list_utilities", "first_of", "FIRST-OF");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "recons", "RECONS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "ncons", "NCONS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "delete_first", "DELETE-FIRST", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "remove_first", "REMOVE-FIRST", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "remove_duplicates_equal", "REMOVE-DUPLICATES-EQUAL", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "nmapcar", "NMAPCAR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "mapcar_multiple", "MAPCAR-MULTIPLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "mapappend", "MAPAPPEND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "mapunion", "MAPUNION", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "mapnunion", "MAPNUNION", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "mapcar_product", "MAPCAR-PRODUCT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "mapcar_unique", "MAPCAR-UNIQUE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "last1", "LAST1", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "add_to_end", "ADD-TO-END", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "nadd_to_end", "NADD-TO-END", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "adjoin_to_end", "ADJOIN-TO-END", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "nadjoin_to_end", "NADJOIN-TO-END", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "add_to_end_if", "ADD-TO-END-IF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "nadd_to_end_if", "NADD-TO-END-IF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "nth_from_end", "NTH-FROM-END", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "remove_from_end", "REMOVE-FROM-END", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "remove_objects_from_list", "REMOVE-OBJECTS-FROM-LIST", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "partition_list", "PARTITION-LIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "npartition_list", "NPARTITION-LIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "partition_list_by_equality", "PARTITION-LIST-BY-EQUALITY", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "partition_list_n_ways", "PARTITION-LIST-N-WAYS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "randomly_partition_list_n_ways", "RANDOMLY-PARTITION-LIST-N-WAYS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "split_list", "SPLIT-LIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "random_element", "RANDOM-ELEMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "random_aref", "RANDOM-AREF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "random_n", "RANDOM-N", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "random_remove_n", "RANDOM-REMOVE-N", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "random_delete", "RANDOM-DELETE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "randomize_list", "RANDOMIZE-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "randomize_vector", "RANDOMIZE-VECTOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "randomize_vector_int", "RANDOMIZE-VECTOR-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "random_compare", "RANDOM-COMPARE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "thirdL", "THIRD<", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "gather_all", "GATHER-ALL", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "find_all", "FIND-ALL", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "find_all_if", "FIND-ALL-IF", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "find_all_if_not", "FIND-ALL-IF-NOT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "all_positions", "ALL-POSITIONS", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "only_one", "ONLY-ONE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "last_one", "LAST-ONE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "penultimate_one", "PENULTIMATE-ONE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "cons_if", "CONS-IF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "list_if", "LIST-IF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "adjoin_if", "ADJOIN-IF", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "flatten", "FLATTEN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "insert_between_each", "INSERT-BETWEEN-EACH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "safe_nth", "SAFE-NTH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "nths", "NTHS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "every_nth", "EVERY-NTH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "first_n", "FIRST-N", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "first_n_percent", "FIRST-N-PERCENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "first_n_if", "FIRST-N-IF", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "first_2", "FIRST-2", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "first_10", "FIRST-10", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "last_n", "LAST-N", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "nth_chunk_of_k", "NTH-CHUNK-OF-K", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "delete_nth", "DELETE-NTH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "remove_nth", "REMOVE-NTH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "remove_last", "REMOVE-LAST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "remove_nths", "REMOVE-NTHS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "nreplace_last", "NREPLACE-LAST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "nreplace_nth", "NREPLACE-NTH", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "find_and_replace", "FIND-AND-REPLACE", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "find_and_nreplace", "FIND-AND-NREPLACE", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "find_first_and_nreplace", "FIND-FIRST-AND-NREPLACE", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "ncollapse_n_from_pos", "NCOLLAPSE-N-FROM-POS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "ninsert_by_position", "NINSERT-BY-POSITION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "ninsert_randomly", "NINSERT-RANDOMLY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "ninsert_somewhere_before_and_after", "NINSERT-SOMEWHERE-BEFORE-AND-AFTER", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "ninsert_somewhere_before", "NINSERT-SOMEWHERE-BEFORE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "ninsert_somewhere_before_or_at", "NINSERT-SOMEWHERE-BEFORE-OR-AT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "ninsert_somewhere_after", "NINSERT-SOMEWHERE-AFTER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "move_nth_to_front", "MOVE-NTH-TO-FRONT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "move_nth_to_position", "MOVE-NTH-TO-POSITION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "nmove_to_front", "NMOVE-TO-FRONT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "move_to_front", "MOVE-TO-FRONT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "nmove_to_end", "NMOVE-TO-END", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "move_to_end", "MOVE-TO-END", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "replace_nth", "REPLACE-NTH", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "replace_last", "REPLACE-LAST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "remove_duplicates_from_end", "REMOVE-DUPLICATES-FROM-END", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "remove_duplicates_from_start", "REMOVE-DUPLICATES-FROM-START", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "delete_duplicates_from_end", "DELETE-DUPLICATES-FROM-END", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "delete_duplicates_from_start", "DELETE-DUPLICATES-FROM-START", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "remove_null", "REMOVE-NULL", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "remove_from_end_duplicates_and_those_wXkey", "REMOVE-FROM-END-DUPLICATES-AND-THOSE-W/KEY", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "skipping_positions", "SKIPPING-POSITIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "num_list", "NUM-LIST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "new_num_list", "NEW-NUM-LIST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "verify_num_list", "VERIFY-NUM-LIST", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "clear_num_list_cached", "CLEAR-NUM-LIST-CACHED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "remove_num_list_cached", "REMOVE-NUM-LIST-CACHED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "num_list_cached_internal", "NUM-LIST-CACHED-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "num_list_cached", "NUM-LIST-CACHED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "numlist", "NUMLIST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "tree_ancestor", "TREE-ANCESTOR", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "member_eqP", "MEMBER-EQ?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "member_kbeqP", "MEMBER-KBEQ?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "member_equalP", "MEMBER-EQUAL?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "has_member_equalP", "HAS-MEMBER-EQUAL?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "not_has_member_equalP", "NOT-HAS-MEMBER-EQUAL?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "member_equalpP", "MEMBER-EQUALP?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "nmemberP", "NMEMBER?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "nmember_eqP", "NMEMBER-EQ?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "nmember_eqlP", "NMEMBER-EQL?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "nmember_equalP", "NMEMBER-EQUAL?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "nmember_equalpP", "NMEMBER-EQUALP?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "nmember_funcallP", "NMEMBER-FUNCALL?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "nmember_success", "NMEMBER-SUCCESS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "intersectP", "INTERSECT?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "intersect_sortedP", "INTERSECT-SORTED?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "which_intersect_element_sorted", "WHICH-INTERSECT-ELEMENT-SORTED", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "sorted_subsetp", "SORTED-SUBSETP", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "sortedP", "SORTED?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "occurs_onceP", "OCCURS-ONCE?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "not_only_elementP", "NOT-ONLY-ELEMENT?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "occurs_at_least_n_timesP", "OCCURS-AT-LEAST-N-TIMES?", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "occurs_exactly_n_timesP", "OCCURS-EXACTLY-N-TIMES?", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "occurs_at_most_n_timesP", "OCCURS-AT-MOST-N-TIMES?", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "singletonP", "SINGLETON?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "doubletonP", "DOUBLETON?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "tripleP", "TRIPLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "list_of_length_p", "LIST-OF-LENGTH-P", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "list_of_doubletonP", "LIST-OF-DOUBLETON?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "exactly_one_distinct_memberP", "EXACTLY-ONE-DISTINCT-MEMBER?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "duplicatesP", "DUPLICATES?", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "equal_duplicatesP", "EQUAL-DUPLICATES?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "duplicates", "DUPLICATES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "duplicate_memberP", "DUPLICATE-MEMBER?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "list_starts_with_repeating_sequenceP", "LIST-STARTS-WITH-REPEATING-SEQUENCE?", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "update_repeating_sequence", "UPDATE-REPEATING-SEQUENCE", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "multisets_equalP", "MULTISETS-EQUAL?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "sets_equalP", "SETS-EQUAL?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "member_via_sets_equalP", "MEMBER-VIA-SETS-EQUAL?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "list_has_member_via_sets_equalP", "LIST-HAS-MEMBER-VIA-SETS-EQUAL?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "sets_equalp", "SETS-EQUALP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "fast_sets_equalP", "FAST-SETS-EQUAL?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "fast_subsetP", "FAST-SUBSET?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "fast_subset_equalP", "FAST-SUBSET-EQUAL?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "fast_supersetP", "FAST-SUPERSET?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "fast_superset_equalP", "FAST-SUPERSET-EQUAL?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "sets_equal_equalP", "SETS-EQUAL-EQUAL?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "subsetp_equalP", "SUBSETP-EQUAL?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "supersetp", "SUPERSETP", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "set_differenceP", "SET-DIFFERENCE?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "tree_set_equalP", "TREE-SET-EQUAL?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "ordered_merge", "ORDERED-MERGE", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "ordered_union", "ORDERED-UNION", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "union_all", "UNION-ALL", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "ordered_set_difference", "ORDERED-SET-DIFFERENCE", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "hash_set_difference", "HASH-SET-DIFFERENCE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "fast_set_difference", "FAST-SET-DIFFERENCE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "partial_order_sort", "PARTIAL-ORDER-SORT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "list2vector", "LIST2VECTOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "vector2list", "VECTOR2LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "vector2list_reversible", "VECTOR2LIST-REVERSIBLE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "listified_vector2vector", "LISTIFIED-VECTOR2VECTOR", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "list_without_repetition_p", "LIST-WITHOUT-REPETITION-P", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "sequence_elements", "SEQUENCE-ELEMENTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "set_difference_forts", "SET-DIFFERENCE-FORTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "ordered_intersection", "ORDERED-INTERSECTION", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "intersect_all", "INTERSECT-ALL", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "fast_intersect_all", "FAST-INTERSECT-ALL", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "safe_pairlis", "SAFE-PAIRLIS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "flip_alist", "FLIP-ALIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "flip_cons", "FLIP-CONS", 1, 0, false);
        new $flip_cons$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "flip_doubleton", "FLIP-DOUBLETON", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "substitute_sequence", "SUBSTITUTE-SEQUENCE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "substitute_sequence_1", "SUBSTITUTE-SEQUENCE-1", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "compare_lists", "COMPARE-LISTS", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "unique_difference_among_lists", "UNIQUE-DIFFERENCE-AMONG-LISTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "unique_difference_between_lists", "UNIQUE-DIFFERENCE-BETWEEN-LISTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "list_subst", "LIST-SUBST", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "list_subst_all_in_tree", "LIST-SUBST-ALL-IN-TREE", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "subseq_subst", "SUBSEQ-SUBST", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "self_evaluating_form_p", "SELF-EVALUATING-FORM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "quote_form_p", "QUOTE-FORM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "non_side_effecting_form_p", "NON-SIDE-EFFECTING-FORM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "quotify", "QUOTIFY", 1, 0, false);
        new $quotify$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "unquotify", "UNQUOTIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "sort_adjoin", "SORT-ADJOIN", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "sorted_add_to_list", "SORTED-ADD-TO-LIST", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "splice_into_sorted_list", "SPLICE-INTO-SORTED-LIST", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "safe_splice_into_sorted_list", "SAFE-SPLICE-INTO-SORTED-LIST", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "element_precedes_specified_othersP", "ELEMENT-PRECEDES-SPECIFIED-OTHERS?", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "function_arglist_max_args", "FUNCTION-ARGLIST-MAX-ARGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "function_arglist_min_args", "FUNCTION-ARGLIST-MIN-ARGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "remove_self_binds", "REMOVE-SELF-BINDS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "self_bindP", "SELF-BIND?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "bind_for_var", "BIND-FOR-VAR", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "remove_bind", "REMOVE-BIND", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "extract_bindings", "EXTRACT-BINDINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "car_is_el_varP", "CAR-IS-EL-VAR?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "extract_binding_strings", "EXTRACT-BINDING-STRINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "tree_funcall_if", "TREE-FUNCALL-IF", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "tree_find_all_if", "TREE-FIND-ALL-IF", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "tree_remove_all_if", "TREE-REMOVE-ALL-IF", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "nswap_tree", "NSWAP-TREE", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "swap_tree", "SWAP-TREE", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "tree_find_all_nested_if", "TREE-FIND-ALL-NESTED-IF", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "tree_find_all_nested_if_int", "TREE-FIND-ALL-NESTED-IF-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "hash_delete_duplicates", "HASH-DELETE-DUPLICATES", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "hash_delete_duplicates_int", "HASH-DELETE-DUPLICATES-INT", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "hash_remove_duplicates", "HASH-REMOVE-DUPLICATES", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "fast_delete_duplicates_hashtable", "FAST-DELETE-DUPLICATES-HASHTABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "fast_delete_duplicates", "FAST-DELETE-DUPLICATES", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "fast_remove_duplicates", "FAST-REMOVE-DUPLICATES", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "fast_remove_duplicates_preserving_first", "FAST-REMOVE-DUPLICATES-PRESERVING-FIRST", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "remove_duplicates_preserving_order", "REMOVE-DUPLICATES-PRESERVING-ORDER", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "remove_duplicate_forts", "REMOVE-DUPLICATE-FORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "delete_duplicate_forts", "DELETE-DUPLICATE-FORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "hash_unique_elements", "HASH-UNIQUE-ELEMENTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "unique_elements", "UNIQUE-ELEMENTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "remove_all_n_icates", "REMOVE-ALL-N-ICATES", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "nsort_intersection", "NSORT-INTERSECTION", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "intersect_sorted_all", "INTERSECT-SORTED-ALL", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "intersect_sorted", "INTERSECT-SORTED", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "nintersect_sorted", "NINTERSECT-SORTED", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "nintersect_sorted_destroy_first_only", "NINTERSECT-SORTED-DESTROY-FIRST-ONLY", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "nintersect_sorted_int", "NINTERSECT-SORTED-INT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "sort_intersection", "SORT-INTERSECTION", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "union_sorted", "UNION-SORTED", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "nunion_sorted", "NUNION-SORTED", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "union_sorted_int", "UNION-SORTED-INT", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "union_of_intersecting_sorted_lists", "UNION-OF-INTERSECTING-SORTED-LISTS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "union_of_intersecting_sorted_lists_recursive", "UNION-OF-INTERSECTING-SORTED-LISTS-RECURSIVE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "delete_duplicates_sorted", "DELETE-DUPLICATES-SORTED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "remove_duplicates_sorted", "REMOVE-DUPLICATES-SORTED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "position_wrt", "POSITION-WRT", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "difference_sorted", "DIFFERENCE-SORTED", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "alist_p", "ALIST-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "alist_lookup", "ALIST-LOOKUP", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "alist_lookup_without_values", "ALIST-LOOKUP-WITHOUT-VALUES", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "alist_nlookup_without_values", "ALIST-NLOOKUP-WITHOUT-VALUES", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "alist_nlookup_eq", "ALIST-NLOOKUP-EQ", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "alist_nlookup_eql", "ALIST-NLOOKUP-EQL", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "alist_nlookup_equal", "ALIST-NLOOKUP-EQUAL", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "alist_nlookup_equalp", "ALIST-NLOOKUP-EQUALP", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "alist_nlookup_funcall", "ALIST-NLOOKUP-FUNCALL", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "alist_nlookup_success", "ALIST-NLOOKUP-SUCCESS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "alist_has_keyP", "ALIST-HAS-KEY?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "alist_has_valueP", "ALIST-HAS-VALUE?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "alist_reverse_lookup", "ALIST-REVERSE-LOOKUP", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "alist_reverse_lookup_without_values", "ALIST-REVERSE-LOOKUP-WITHOUT-VALUES", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "alist_enter", "ALIST-ENTER", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "alist_enter_without_values", "ALIST-ENTER-WITHOUT-VALUES", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "alist_capacity_enter_without_values", "ALIST-CAPACITY-ENTER-WITHOUT-VALUES", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "alist_promote", "ALIST-PROMOTE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "alist_delete", "ALIST-DELETE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "alist_delete_without_values", "ALIST-DELETE-WITHOUT-VALUES", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "alist_remove", "ALIST-REMOVE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "alist_remove_without_values", "ALIST-REMOVE-WITHOUT-VALUES", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "alist_push", "ALIST-PUSH", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "alist_pushnew", "ALIST-PUSHNEW", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "alist_remove_from_value", "ALIST-REMOVE-FROM-VALUE", 3, 2, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.list_utilities", "pushnew_onto_alist", "PUSHNEW-ONTO-ALIST");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.list_utilities", "push_onto_alist", "PUSH-ONTO-ALIST");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.list_utilities", "enter_into_alist", "ENTER-INTO-ALIST");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "alist_keys", "ALIST-KEYS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "alist_values", "ALIST-VALUES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "alist_optimize", "ALIST-OPTIMIZE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "alist_E", "ALIST-=", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "alist_subsumesP", "ALIST-SUBSUMES?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "alist_to_hash_table", "ALIST-TO-HASH-TABLE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "alist_to_reverse_hash_table", "ALIST-TO-REVERSE-HASH-TABLE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "sort_alist_by_keys", "SORT-ALIST-BY-KEYS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "sort_alist_by_values", "SORT-ALIST-BY-VALUES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "cons_to_tuple", "CONS-TO-TUPLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "tuple_to_cons", "TUPLE-TO-CONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "alist_to_tuples", "ALIST-TO-TUPLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "property_list_p", "PROPERTY-LIST-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "non_empty_property_list_p", "NON-EMPTY-PROPERTY-LIST-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "filter_plist", "FILTER-PLIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "prune_plist", "PRUNE-PLIST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "plist_of_type_p", "PLIST-OF-TYPE-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "plist_of_value_type_p", "PLIST-OF-VALUE-TYPE-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "make_plist", "MAKE-PLIST", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.list_utilities", "plist_enter", "PLIST-ENTER");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "plist_lookup", "PLIST-LOOKUP", 2, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.list_utilities", "plist_increment", "PLIST-INCREMENT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.list_utilities", "plist_push", "PLIST-PUSH");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.list_utilities", "plist_remove", "PLIST-REMOVE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "alist_to_plist", "ALIST-TO-PLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "plist_to_alist", "PLIST-TO-ALIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "nmerge_plist", "NMERGE-PLIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "merge_plist", "MERGE-PLIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "sort_plist_by_properties", "SORT-PLIST-BY-PROPERTIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "sort_plist_by_values", "SORT-PLIST-BY-VALUES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "sort_plist_via_position", "SORT-PLIST-VIA-POSITION", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "indicator_presentP", "INDICATOR-PRESENT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "plist_has_keyP", "PLIST-HAS-KEY?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "plist_has_keysP", "PLIST-HAS-KEYS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "member_plist_key_p", "MEMBER-PLIST-KEY-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "non_nil_plist_valueP", "NON-NIL-PLIST-VALUE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "get_property_with_defaults", "GET-PROPERTY-WITH-DEFAULTS", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "augment_plist_with_defaults", "AUGMENT-PLIST-WITH-DEFAULTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "plist_restricted_to_indicatorsP", "PLIST-RESTRICTED-TO-INDICATORS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "maybe_putf", "MAYBE-PUTF", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "plist_properties", "PLIST-PROPERTIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "plist_keys", "PLIST-KEYS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "plist_values", "PLIST-VALUES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "plist_restricted_to_indicators", "PLIST-RESTRICTED-TO-INDICATORS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "plist_except", "PLIST-EXCEPT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "plistlist_if_getf", "PLISTLIST-IF-GETF", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "plistlist_sort", "PLISTLIST-SORT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "plistlist_sort_key", "PLISTLIST-SORT-KEY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "sub_plistP", "SUB-PLIST?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "slow_plists_equalP", "SLOW-PLISTS-EQUAL?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "format_item_list", "FORMAT-ITEM-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "print_plist_readably", "PRINT-PLIST-READABLY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "pretty_print_plist", "PRETTY-PRINT-PLIST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "pretty_prin1_plist", "PRETTY-PRIN1-PLIST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "pretty_print_alist", "PRETTY-PRINT-ALIST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "print_list_of_lists_as_table", "PRINT-LIST-OF-LISTS-AS-TABLE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "print_list_as_delimited_line", "PRINT-LIST-AS-DELIMITED-LINE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "any_in_list", "ANY-IN-LIST", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "every_in_list", "EVERY-IN-LIST", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "not_any_in_list", "NOT-ANY-IN-LIST", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "not_every_in_list", "NOT-EVERY-IN-LIST", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "plist_difference", "PLIST-DIFFERENCE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "list_subseq_subst_combos", "LIST-SUBSEQ-SUBST-COMBOS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "list_subseq_subst_combos_internal", "LIST-SUBSEQ-SUBST-COMBOS-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "greedy_list_subseq_subst", "GREEDY-LIST-SUBSEQ-SUBST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "greedy_list_subseq_subst_internal", "GREEDY-LIST-SUBSEQ-SUBST-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "extremal", "EXTREMAL", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "extremals", "EXTREMALS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "nth_rank_items", "NTH-RANK-ITEMS", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "rerank", "RERANK", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "powerset", "POWERSET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "subsets_of_size", "SUBSETS-OF-SIZE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "subsets_of_size_int", "SUBSETS-OF-SIZE-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "position_L", "POSITION-<", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "sort_via_position", "SORT-VIA-POSITION", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "stable_sort_via_position", "STABLE-SORT-VIA-POSITION", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "sort_via_position_earlier", "SORT-VIA-POSITION-EARLIER", 2, 0, false);
        new $sort_via_position_earlier$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "sort_via_test", "SORT-VIA-TEST", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "stable_sort_via_test", "STABLE-SORT-VIA-TEST", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "sort_via_test_earlier", "SORT-VIA-TEST-EARLIER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "sort_L", "SORT-<", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "sort_G", "SORT->", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "safe_sort_L", "SAFE-SORT-<", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "safe_sort_G", "SAFE-SORT->", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "sets_of_sets_L", "SETS-OF-SETS-<", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "sets_L", "SETS-<", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "set_L", "SET-<", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "list_structure", "LIST-STRUCTURE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "list_structure_min", "LIST-STRUCTURE-MIN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "list_structure_L", "LIST-STRUCTURE-<", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "tree_min", "TREE-MIN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "safe_tree_L", "SAFE-TREE-<", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "safe_L", "SAFE-<", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "safe_G", "SAFE->", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "safe_GE", "SAFE->=", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "safe_LE", "SAFE-<=", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "safe_max", "SAFE-MAX", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "safe_difference", "SAFE-DIFFERENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "safe_quotient", "SAFE-QUOTIENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "safe_product", "SAFE-PRODUCT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "safe_sum", "SAFE-SUM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "safe_E", "SAFE-=", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "absL", "ABS<", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "absG", "ABS>", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "equalE", "EQUAL=", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "tree_L", "TREE-<", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "tree_lt_intP", "TREE-LT-INT?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "parametrized_median", "PARAMETRIZED-MEDIAN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "shortest", "SHORTEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "longest", "LONGEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "cons_count", "CONS-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "tree_delete", "TREE-DELETE", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "tree_map", "TREE-MAP", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "tree_ntransform_if", "TREE-NTRANSFORM-IF", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "tree_transform_if", "TREE-TRANSFORM-IF", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "cons_tree_find", "CONS-TREE-FIND", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "tree_find", "TREE-FIND", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "tree_find_int", "TREE-FIND-INT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "tree_find_without_values_int", "TREE-FIND-WITHOUT-VALUES-INT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "simple_tree_findP", "SIMPLE-TREE-FIND?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "simple_tree_find", "SIMPLE-TREE-FIND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "simple_tree_find_via_eqlP", "SIMPLE-TREE-FIND-VIA-EQL?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "simple_tree_find_via_eql", "SIMPLE-TREE-FIND-VIA-EQL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "simple_tree_find_via_equalP", "SIMPLE-TREE-FIND-VIA-EQUAL?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "simple_tree_find_via_equal", "SIMPLE-TREE-FIND-VIA-EQUAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "tree_find_any", "TREE-FIND-ANY", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "cons_tree_find_if", "CONS-TREE-FIND-IF", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "tree_find_if", "TREE-FIND-IF", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "cons_tree_count", "CONS-TREE-COUNT", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "tree_count", "TREE-COUNT", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "tree_countG", "TREE-COUNT>", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "tree_countGE", "TREE-COUNT>=", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "tree_countL", "TREE-COUNT<", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "tree_countLE", "TREE-COUNT<=", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "tree_countE", "TREE-COUNT=", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "tree_count_internal", "TREE-COUNT-INTERNAL", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "simple_tree_count", "SIMPLE-TREE-COUNT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "simple_tree_count_recursive", "SIMPLE-TREE-COUNT-RECURSIVE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "cons_tree_count_if", "CONS-TREE-COUNT-IF", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "tree_count_if", "TREE-COUNT-IF", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "tree_count_if_unique", "TREE-COUNT-IF-UNIQUE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "cons_tree_gather", "CONS-TREE-GATHER", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "tree_gather", "TREE-GATHER", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "tree_gather_internal", "TREE-GATHER-INTERNAL", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "tree_gather_ordered", "TREE-GATHER-ORDERED", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "tree_gather_ordered_subs", "TREE-GATHER-ORDERED-SUBS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "tree_gather_ordered_no_subs", "TREE-GATHER-ORDERED-NO-SUBS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "tree_substitute", "TREE-SUBSTITUTE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "tree_substitute_using_dictionary", "TREE-SUBSTITUTE-USING-DICTIONARY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "tree_splice", "TREE-SPLICE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "tree_gather_transformations", "TREE-GATHER-TRANSFORMATIONS", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "remove_if_doesnt_include", "REMOVE-IF-DOESNT-INCLUDE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "delete_subsumed_items", "DELETE-SUBSUMED-ITEMS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "delete_subsumed_items_internal", "DELETE-SUBSUMED-ITEMS-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "subsumedP", "SUBSUMED?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "subsumesP", "SUBSUMES?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "subsumesP_internal", "SUBSUMES?-INTERNAL", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "remove_subsumed_items", "REMOVE-SUBSUMED-ITEMS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "cross_products", "CROSS-PRODUCTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "map_pairs", "MAP-PAIRS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "fn_with_each", "FN-WITH-EACH", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "indexed_products", "INDEXED-PRODUCTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "explicate_permutations", "EXPLICATE-PERMUTATIONS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "untranslate_elements_from_tagged_sets", "UNTRANSLATE-ELEMENTS-FROM-TAGGED-SETS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "translate_elements_to_tagged_sets", "TRANSLATE-ELEMENTS-TO-TAGGED-SETS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "permute_list", "PERMUTE-LIST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "permute_list_int", "PERMUTE-LIST-INT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "all_permutations", "ALL-PERMUTATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "nsublis_permute", "NSUBLIS-PERMUTE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "sublis_permute", "SUBLIS-PERMUTE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "permute", "PERMUTE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "random_permutation", "RANDOM-PERMUTATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "choose_n_between", "CHOOSE-N-BETWEEN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "trigram_transform", "TRIGRAM-TRANSFORM", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "chunk", "CHUNK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "get_arglist", "GET-ARGLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "get_documentation", "GET-DOCUMENTATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "push_on_car", "PUSH-ON-CAR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "pop_and_reverse_car_and_push_on_cadr", "POP-AND-REVERSE-CAR-AND-PUSH-ON-CADR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "cartesian_product", "CARTESIAN-PRODUCT", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "cartesian_product_cardinality", "CARTESIAN-PRODUCT-CARDINALITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "cartesian_helper", "CARTESIAN-HELPER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "cartesian_helper_with_test", "CARTESIAN-HELPER-WITH-TEST", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "pick_two", "PICK-TWO", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.list_utilities", "mapexp", "MAPEXP");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "recursive_member", "RECURSIVE-MEMBER", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "list_of_type_p", "LIST-OF-TYPE-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "non_empty_list_of_type_p", "NON-EMPTY-LIST-OF-TYPE-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "list_of_list_p", "LIST-OF-LIST-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "list_of_keyword_p", "LIST-OF-KEYWORD-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "string_list_p", "STRING-LIST-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "symbol_list_p", "SYMBOL-LIST-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "function_symbol_list_p", "FUNCTION-SYMBOL-LIST-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "form_with_operator_p", "FORM-WITH-OPERATOR-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "verify_operator", "VERIFY-OPERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "verify_form_with_operator", "VERIFY-FORM-WITH-OPERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "functor_in_expression_p", "FUNCTOR-IN-EXPRESSION-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "functor_in_body_p", "FUNCTOR-IN-BODY-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "variable_value_used_in_body_p", "VARIABLE-VALUE-USED-IN-BODY-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "variable_value_used_in_expression_p", "VARIABLE-VALUE-USED-IN-EXPRESSION-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "object_in_expression_p", "OBJECT-IN-EXPRESSION-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "parse_to_list_of_strings", "PARSE-TO-LIST-OF-STRINGS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "tree_substitute_by_association", "TREE-SUBSTITUTE-BY-ASSOCIATION", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "safe_read_delimited_list", "SAFE-READ-DELIMITED-LIST", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "multi_sublis", "MULTI-SUBLIS", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "multi_assoc", "MULTI-ASSOC", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "valid_and_conformant_alist_p", "VALID-AND-CONFORMANT-ALIST-P", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "histogram", "HISTOGRAM", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "histogram_as_plist", "HISTOGRAM-AS-PLIST", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "pretty_print_histogram", "PRETTY-PRINT-HISTOGRAM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "n_within", "N-WITHIN", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "middle_sublist", "MIDDLE-SUBLIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "categorize_list_elements", "CATEGORIZE-LIST-ELEMENTS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "rank_tuples", "RANK-TUPLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "collate", "COLLATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "list_with_first_p", "LIST-WITH-FIRST-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "elements_incompatibleP", "ELEMENTS-INCOMPATIBLE?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "element_incompatible_with_any_of", "ELEMENT-INCOMPATIBLE-WITH-ANY-OF", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "compute_all_compatible_sublists", "COMPUTE-ALL-COMPATIBLE-SUBLISTS", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "test_compute_all_compatible_sublists", "TEST-COMPUTE-ALL-COMPATIBLE-SUBLISTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "gather_nodes_and_incompatible_pairs_from_graph_txt", "GATHER-NODES-AND-INCOMPATIBLE-PAIRS-FROM-GRAPH-TXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "test_find_maximum_independent_set", "TEST-FIND-MAXIMUM-INDEPENDENT-SET", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "comparator_compare_internal", "COMPARATOR-COMPARE-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "comparator_compare", "COMPARATOR-COMPARE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "sort_preferred_list_to_front", "SORT-PREFERRED-LIST-TO-FRONT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "sort_preferred_to_front", "SORT-PREFERRED-TO-FRONT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "a_preferred_over_b", "A-PREFERRED-OVER-B", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "debug_comparison_method_violates_its_general_contract", "DEBUG-COMPARISON-METHOD-VIOLATES-ITS-GENERAL-CONTRACT", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.list_utilities", "find_first_and_nreplace_test", "FIND-FIRST-AND-NREPLACE-TEST", 3, 1, false);
        return (SubLObject)list_utilities.NIL;
    }
    
    public static SubLObject init_list_utilities_file() {
        list_utilities.$magic_hashing_cutoff$ = SubLFiles.defparameter("*MAGIC-HASHING-CUTOFF*", (SubLObject)list_utilities.$int0$80);
        list_utilities.$negated_test_func$ = SubLFiles.defparameter("*NEGATED-TEST-FUNC*", (SubLObject)list_utilities.NIL);
        list_utilities.$position_if_binary_lambda_func$ = SubLFiles.defparameter("*POSITION-IF-BINARY-LAMBDA-FUNC*", (SubLObject)list_utilities.NIL);
        list_utilities.$position_if_binary_lambda_arg2$ = SubLFiles.defparameter("*POSITION-IF-BINARY-LAMBDA-ARG2*", (SubLObject)list_utilities.NIL);
        list_utilities.$num_list_cached_caching_state$ = SubLFiles.deflexical("*NUM-LIST-CACHED-CACHING-STATE*", (SubLObject)list_utilities.NIL);
        list_utilities.$listified_vector_marker$ = SubLFiles.defparameter("*LISTIFIED-VECTOR-MARKER*", (SubLObject)list_utilities.$kw105$LISTIFIED_VECTOR);
        list_utilities.$remove_duplicates_eq_table$ = SubLFiles.deflexical("*REMOVE-DUPLICATES-EQ-TABLE*", Hashtables.make_hash_table((SubLObject)list_utilities.$int127$500, Symbols.symbol_function((SubLObject)list_utilities.EQ), (SubLObject)list_utilities.UNPROVIDED));
        list_utilities.$remove_duplicates_eql_table$ = SubLFiles.deflexical("*REMOVE-DUPLICATES-EQL-TABLE*", Hashtables.make_hash_table((SubLObject)list_utilities.$int127$500, Symbols.symbol_function((SubLObject)list_utilities.EQL), (SubLObject)list_utilities.UNPROVIDED));
        list_utilities.$remove_duplicates_equal_table$ = SubLFiles.deflexical("*REMOVE-DUPLICATES-EQUAL-TABLE*", Hashtables.make_hash_table((SubLObject)list_utilities.$int127$500, Symbols.symbol_function((SubLObject)list_utilities.EQUAL), (SubLObject)list_utilities.UNPROVIDED));
        list_utilities.$remove_duplicates_equalp_table$ = SubLFiles.deflexical("*REMOVE-DUPLICATES-EQUALP-TABLE*", Hashtables.make_hash_table((SubLObject)list_utilities.$int127$500, Symbols.symbol_function((SubLObject)list_utilities.EQUALP), (SubLObject)list_utilities.UNPROVIDED));
        list_utilities.$remove_duplicates_eq_table_lock$ = SubLFiles.deflexical("*REMOVE-DUPLICATES-EQ-TABLE-LOCK*", Locks.make_lock((SubLObject)list_utilities.$str128$remove_duplicates_eq_table_lock));
        list_utilities.$remove_duplicates_eql_table_lock$ = SubLFiles.deflexical("*REMOVE-DUPLICATES-EQL-TABLE-LOCK*", Locks.make_lock((SubLObject)list_utilities.$str129$remove_duplicates_eql_table_lock));
        list_utilities.$remove_duplicates_equal_table_lock$ = SubLFiles.deflexical("*REMOVE-DUPLICATES-EQUAL-TABLE-LOCK*", Locks.make_lock((SubLObject)list_utilities.$str130$remove_duplicates_equal_table_loc));
        list_utilities.$remove_duplicates_equalp_table_lock$ = SubLFiles.deflexical("*REMOVE-DUPLICATES-EQUALP-TABLE-LOCK*", Locks.make_lock((SubLObject)list_utilities.$str131$remove_duplicates_equalp_table_lo));
        list_utilities.$plistlist_sort_indicator$ = SubLFiles.defparameter("*PLISTLIST-SORT-INDICATOR*", (SubLObject)list_utilities.NIL);
        list_utilities.$subseq_subst_recursive_answers$ = SubLFiles.defparameter("*SUBSEQ-SUBST-RECURSIVE-ANSWERS*", (SubLObject)list_utilities.NIL);
        list_utilities.$sort_via_position_guide$ = SubLFiles.defparameter("*SORT-VIA-POSITION-GUIDE*", (SubLObject)list_utilities.NIL);
        list_utilities.$sort_via_position_test$ = SubLFiles.defparameter("*SORT-VIA-POSITION-TEST*", (SubLObject)list_utilities.NIL);
        list_utilities.$sort_via_test_function$ = SubLFiles.defparameter("*SORT-VIA-TEST-FUNCTION*", (SubLObject)list_utilities.NIL);
        list_utilities.$preferred_term_set$ = SubLFiles.defparameter("*PREFERRED-TERM-SET*", (SubLObject)list_utilities.NIL);
        return (SubLObject)list_utilities.NIL;
    }
    
    public static SubLObject setup_list_utilities_file() {
        memoization_state.note_globally_cached_function((SubLObject)list_utilities.$sym93$NUM_LIST_CACHED);
        generic_testing.define_test_case_table_int((SubLObject)list_utilities.$sym112$SAFE_SPLICE_INTO_SORTED_LIST, (SubLObject)ConsesLow.list(new SubLObject[] { list_utilities.$kw113$TEST, Symbols.symbol_function((SubLObject)list_utilities.EQUAL), list_utilities.$kw114$OWNER, list_utilities.NIL, list_utilities.$kw115$CLASSES, list_utilities.NIL, list_utilities.$kw116$KB, list_utilities.$kw117$TINY, list_utilities.$kw118$WORKING_, list_utilities.T }), (SubLObject)list_utilities.$list119);
        access_macros.define_obsolete_register((SubLObject)list_utilities.$sym192$GET_ARGLIST, (SubLObject)list_utilities.$list193);
        generic_testing.define_test_case_table_int((SubLObject)list_utilities.$sym215$TEST_COMPUTE_ALL_COMPATIBLE_SUBLISTS, (SubLObject)ConsesLow.list(new SubLObject[] { list_utilities.$kw113$TEST, list_utilities.NIL, list_utilities.$kw114$OWNER, list_utilities.NIL, list_utilities.$kw115$CLASSES, list_utilities.NIL, list_utilities.$kw116$KB, list_utilities.$kw216$BOTH, list_utilities.$kw118$WORKING_, list_utilities.T }), list_utilities.$list217);
        generic_testing.define_test_case_table_int((SubLObject)list_utilities.$sym224$TEST_FIND_MAXIMUM_INDEPENDENT_SET, (SubLObject)ConsesLow.list(new SubLObject[] { list_utilities.$kw113$TEST, list_utilities.NIL, list_utilities.$kw114$OWNER, list_utilities.NIL, list_utilities.$kw115$CLASSES, list_utilities.NIL, list_utilities.$kw116$KB, list_utilities.$kw216$BOTH, list_utilities.$kw118$WORKING_, list_utilities.T }), (SubLObject)list_utilities.$list225);
        memoization_state.note_memoized_function((SubLObject)list_utilities.$sym226$COMPARATOR_COMPARE);
        generic_testing.define_test_case_table_int((SubLObject)list_utilities.$sym232$NINTERSECT_SORTED, (SubLObject)ConsesLow.list(new SubLObject[] { list_utilities.$kw113$TEST, list_utilities.NIL, list_utilities.$kw114$OWNER, list_utilities.NIL, list_utilities.$kw115$CLASSES, list_utilities.NIL, list_utilities.$kw116$KB, list_utilities.$kw117$TINY, list_utilities.$kw118$WORKING_, list_utilities.T }), list_utilities.$list233);
        generic_testing.define_test_case_table_int((SubLObject)list_utilities.$sym234$REMOVE_SUBSUMED_ITEMS, (SubLObject)ConsesLow.list(new SubLObject[] { list_utilities.$kw113$TEST, Symbols.symbol_function((SubLObject)list_utilities.$sym214$SETS_EQUAL_), list_utilities.$kw114$OWNER, list_utilities.NIL, list_utilities.$kw115$CLASSES, list_utilities.NIL, list_utilities.$kw116$KB, list_utilities.$kw117$TINY, list_utilities.$kw118$WORKING_, list_utilities.T }), (SubLObject)list_utilities.$list235);
        generic_testing.define_test_case_table_int((SubLObject)list_utilities.$sym236$REMOVE_NTH, (SubLObject)ConsesLow.list(new SubLObject[] { list_utilities.$kw113$TEST, list_utilities.NIL, list_utilities.$kw114$OWNER, list_utilities.NIL, list_utilities.$kw115$CLASSES, list_utilities.NIL, list_utilities.$kw116$KB, list_utilities.$kw117$TINY, list_utilities.$kw118$WORKING_, list_utilities.T }), (SubLObject)list_utilities.$list237);
        generic_testing.define_test_case_table_int((SubLObject)list_utilities.$sym238$FIND_FIRST_AND_NREPLACE_TEST, (SubLObject)ConsesLow.list(new SubLObject[] { list_utilities.$kw113$TEST, list_utilities.NIL, list_utilities.$kw114$OWNER, list_utilities.NIL, list_utilities.$kw115$CLASSES, list_utilities.NIL, list_utilities.$kw116$KB, list_utilities.$kw117$TINY, list_utilities.$kw118$WORKING_, list_utilities.T }), (SubLObject)list_utilities.$list239);
        generic_testing.define_test_case_table_int((SubLObject)list_utilities.$sym240$REMOVE_NESTED_NTH, (SubLObject)ConsesLow.list(new SubLObject[] { list_utilities.$kw113$TEST, list_utilities.NIL, list_utilities.$kw114$OWNER, list_utilities.NIL, list_utilities.$kw115$CLASSES, list_utilities.NIL, list_utilities.$kw116$KB, list_utilities.$kw117$TINY, list_utilities.$kw118$WORKING_, list_utilities.T }), (SubLObject)list_utilities.$list241);
        generic_testing.define_test_case_table_int((SubLObject)list_utilities.$sym242$POSITION_FROM_END, (SubLObject)ConsesLow.list(new SubLObject[] { list_utilities.$kw113$TEST, list_utilities.NIL, list_utilities.$kw114$OWNER, list_utilities.NIL, list_utilities.$kw115$CLASSES, list_utilities.NIL, list_utilities.$kw116$KB, list_utilities.$kw117$TINY, list_utilities.$kw118$WORKING_, list_utilities.T }), (SubLObject)list_utilities.$list243);
        generic_testing.define_test_case_table_int((SubLObject)list_utilities.$sym244$FIND_AND_REPLACE, (SubLObject)ConsesLow.list(new SubLObject[] { list_utilities.$kw113$TEST, list_utilities.NIL, list_utilities.$kw114$OWNER, list_utilities.NIL, list_utilities.$kw115$CLASSES, list_utilities.NIL, list_utilities.$kw116$KB, list_utilities.$kw117$TINY, list_utilities.$kw118$WORKING_, list_utilities.T }), (SubLObject)list_utilities.$list245);
        generic_testing.define_test_case_table_int((SubLObject)list_utilities.$sym246$FIRST_N_IF, (SubLObject)ConsesLow.list(new SubLObject[] { list_utilities.$kw113$TEST, list_utilities.NIL, list_utilities.$kw114$OWNER, list_utilities.NIL, list_utilities.$kw115$CLASSES, list_utilities.NIL, list_utilities.$kw116$KB, list_utilities.$kw117$TINY, list_utilities.$kw118$WORKING_, list_utilities.T }), (SubLObject)list_utilities.$list247);
        generic_testing.define_test_case_table_int((SubLObject)list_utilities.$sym248$TREE_POSITION_IF_BFS, (SubLObject)ConsesLow.list(new SubLObject[] { list_utilities.$kw113$TEST, list_utilities.NIL, list_utilities.$kw114$OWNER, list_utilities.NIL, list_utilities.$kw115$CLASSES, list_utilities.$list249, list_utilities.$kw116$KB, list_utilities.$kw117$TINY, list_utilities.$kw118$WORKING_, list_utilities.T }), (SubLObject)list_utilities.$list250);
        generic_testing.define_test_case_table_int((SubLObject)list_utilities.$sym251$TREE_POSITION_IF_DFS, (SubLObject)ConsesLow.list(new SubLObject[] { list_utilities.$kw113$TEST, list_utilities.NIL, list_utilities.$kw114$OWNER, list_utilities.NIL, list_utilities.$kw115$CLASSES, list_utilities.$list249, list_utilities.$kw116$KB, list_utilities.$kw117$TINY, list_utilities.$kw118$WORKING_, list_utilities.T }), (SubLObject)list_utilities.$list252);
        generic_testing.define_test_case_table_int((SubLObject)list_utilities.$sym253$ARG_POSITIONS_DFS, (SubLObject)ConsesLow.list(new SubLObject[] { list_utilities.$kw113$TEST, list_utilities.NIL, list_utilities.$kw114$OWNER, list_utilities.NIL, list_utilities.$kw115$CLASSES, list_utilities.NIL, list_utilities.$kw116$KB, list_utilities.$kw117$TINY, list_utilities.$kw118$WORKING_, list_utilities.T }), (SubLObject)list_utilities.$list254);
        generic_testing.define_test_case_table_int((SubLObject)list_utilities.$sym255$ARG_POSITIONS_BFS, (SubLObject)ConsesLow.list(new SubLObject[] { list_utilities.$kw113$TEST, list_utilities.NIL, list_utilities.$kw114$OWNER, list_utilities.NIL, list_utilities.$kw115$CLASSES, list_utilities.NIL, list_utilities.$kw116$KB, list_utilities.$kw117$TINY, list_utilities.$kw118$WORKING_, list_utilities.T }), (SubLObject)list_utilities.$list254);
        generic_testing.define_test_case_table_int((SubLObject)list_utilities.$sym256$RANK_TUPLES, (SubLObject)ConsesLow.list(new SubLObject[] { list_utilities.$kw113$TEST, list_utilities.NIL, list_utilities.$kw114$OWNER, list_utilities.NIL, list_utilities.$kw115$CLASSES, list_utilities.NIL, list_utilities.$kw116$KB, list_utilities.$kw117$TINY, list_utilities.$kw118$WORKING_, list_utilities.T }), (SubLObject)list_utilities.$list257);
        generic_testing.define_test_case_table_int((SubLObject)list_utilities.$sym258$NMEMBER_, (SubLObject)ConsesLow.list(new SubLObject[] { list_utilities.$kw113$TEST, list_utilities.NIL, list_utilities.$kw114$OWNER, list_utilities.NIL, list_utilities.$kw115$CLASSES, list_utilities.NIL, list_utilities.$kw116$KB, list_utilities.$kw117$TINY, list_utilities.$kw118$WORKING_, list_utilities.T }), (SubLObject)list_utilities.$list259);
        generic_testing.define_test_case_table_int((SubLObject)list_utilities.$sym260$ALIST_NLOOKUP_WITHOUT_VALUES, (SubLObject)ConsesLow.list(new SubLObject[] { list_utilities.$kw113$TEST, list_utilities.NIL, list_utilities.$kw114$OWNER, list_utilities.NIL, list_utilities.$kw115$CLASSES, list_utilities.NIL, list_utilities.$kw116$KB, list_utilities.$kw117$TINY, list_utilities.$kw118$WORKING_, list_utilities.T }), (SubLObject)list_utilities.$list261);
        generic_testing.define_test_case_table_int((SubLObject)list_utilities.$sym262$EXACTLY_ONE_DISTINCT_MEMBER_, (SubLObject)ConsesLow.list(new SubLObject[] { list_utilities.$kw113$TEST, list_utilities.NIL, list_utilities.$kw114$OWNER, list_utilities.NIL, list_utilities.$kw115$CLASSES, list_utilities.NIL, list_utilities.$kw116$KB, list_utilities.$kw117$TINY, list_utilities.$kw118$WORKING_, list_utilities.T }), (SubLObject)list_utilities.$list263);
        generic_testing.define_test_case_table_int((SubLObject)list_utilities.$sym264$SORT_PREFERRED_LIST_TO_FRONT, (SubLObject)ConsesLow.list(new SubLObject[] { list_utilities.$kw113$TEST, list_utilities.NIL, list_utilities.$kw114$OWNER, list_utilities.NIL, list_utilities.$kw115$CLASSES, list_utilities.NIL, list_utilities.$kw116$KB, list_utilities.$kw216$BOTH, list_utilities.$kw118$WORKING_, list_utilities.T }), (SubLObject)list_utilities.$list265);
        sunit_external.define_test_category((SubLObject)list_utilities.$str266$List_Utilities_Module_Supercatego, (SubLObject)list_utilities.UNPROVIDED);
        sunit_external.define_test_category((SubLObject)list_utilities.$str267$Utility_Subcategory, (SubLObject)ConsesLow.list((SubLObject)list_utilities.$str266$List_Utilities_Module_Supercatego));
        sunit_external.define_test_suite((SubLObject)list_utilities.$str268$nadd_to_end_Testing_Suite, (SubLObject)ConsesLow.list((SubLObject)list_utilities.$str267$Utility_Subcategory), (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED);
        sunit_external.define_test_suite((SubLObject)list_utilities.$str269$last1_Testing_Suite, (SubLObject)ConsesLow.list((SubLObject)list_utilities.$str267$Utility_Subcategory), (SubLObject)list_utilities.UNPROVIDED, (SubLObject)list_utilities.UNPROVIDED);
        return (SubLObject)list_utilities.NIL;
    }
    
    private static SubLObject _constant_217_initializer() {
        return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeString("II"), (SubLObject)list_utilities.THREE_INTEGER, (SubLObject)SubLObjectFactory.makeString("three"), (SubLObject)SubLObjectFactory.makeString("III"), (SubLObject)list_utilities.FOUR_INTEGER), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeString("II")), (SubLObject)ConsesLow.list((SubLObject)list_utilities.THREE_INTEGER, (SubLObject)SubLObjectFactory.makeString("III")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("three"), (SubLObject)SubLObjectFactory.makeString("III"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.THREE_INTEGER, (SubLObject)SubLObjectFactory.makeString("three"), (SubLObject)list_utilities.FOUR_INTEGER), (SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeString("III"), (SubLObject)list_utilities.FOUR_INTEGER), (SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeString("II"), (SubLObject)list_utilities.THREE_INTEGER, (SubLObject)SubLObjectFactory.makeString("three"), (SubLObject)list_utilities.FOUR_INTEGER), (SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeString("II"), (SubLObject)SubLObjectFactory.makeString("III"), (SubLObject)list_utilities.FOUR_INTEGER))), (SubLObject)list_utilities.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { list_utilities.ONE_INTEGER, list_utilities.TWO_INTEGER, SubLObjectFactory.makeString("II"), list_utilities.THREE_INTEGER, list_utilities.FOUR_INTEGER, SubLObjectFactory.makeString("four"), SubLObjectFactory.makeString("IV"), list_utilities.SIX_INTEGER, list_utilities.SEVEN_INTEGER, SubLObjectFactory.makeString("VII"), list_utilities.EIGHT_INTEGER, SubLObjectFactory.makeString("eight"), SubLObjectFactory.makeString("Successor(7)"), SubLObjectFactory.makeString("VIII"), list_utilities.NINE_INTEGER, SubLObjectFactory.makeString("nine"), SubLObjectFactory.makeString("Successor(9)"), list_utilities.TEN_INTEGER, SubLObjectFactory.makeString("IX"), list_utilities.ELEVEN_INTEGER, SubLObjectFactory.makeString("twelve") }), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeString("II")), (SubLObject)ConsesLow.list((SubLObject)list_utilities.FOUR_INTEGER, (SubLObject)SubLObjectFactory.makeString("IV")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("four"), (SubLObject)SubLObjectFactory.makeString("IV")), (SubLObject)ConsesLow.list((SubLObject)list_utilities.SEVEN_INTEGER, (SubLObject)SubLObjectFactory.makeString("VII")), (SubLObject)ConsesLow.list((SubLObject)list_utilities.EIGHT_INTEGER, (SubLObject)SubLObjectFactory.makeString("VIII")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("eight"), (SubLObject)SubLObjectFactory.makeString("VIII")), (SubLObject)ConsesLow.list((SubLObject)list_utilities.EIGHT_INTEGER, (SubLObject)SubLObjectFactory.makeString("Successor(7)")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Successor(9)"), (SubLObject)list_utilities.TEN_INTEGER)), (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list(new SubLObject[] { list_utilities.ONE_INTEGER, list_utilities.TWO_INTEGER, list_utilities.THREE_INTEGER, SubLObjectFactory.makeString("IV"), list_utilities.SIX_INTEGER, SubLObjectFactory.makeString("VII"), SubLObjectFactory.makeString("eight"), SubLObjectFactory.makeString("Successor(7)"), list_utilities.NINE_INTEGER, SubLObjectFactory.makeString("nine"), list_utilities.TEN_INTEGER, SubLObjectFactory.makeString("IX"), list_utilities.ELEVEN_INTEGER, SubLObjectFactory.makeString("twelve") }), ConsesLow.list(new SubLObject[] { list_utilities.ONE_INTEGER, list_utilities.TWO_INTEGER, list_utilities.THREE_INTEGER, SubLObjectFactory.makeString("IV"), list_utilities.SIX_INTEGER, SubLObjectFactory.makeString("VII"), SubLObjectFactory.makeString("eight"), SubLObjectFactory.makeString("Successor(7)"), list_utilities.NINE_INTEGER, SubLObjectFactory.makeString("nine"), SubLObjectFactory.makeString("Successor(9)"), SubLObjectFactory.makeString("IX"), list_utilities.ELEVEN_INTEGER, SubLObjectFactory.makeString("twelve") }), ConsesLow.list(new SubLObject[] { list_utilities.ONE_INTEGER, list_utilities.TWO_INTEGER, list_utilities.THREE_INTEGER, SubLObjectFactory.makeString("IV"), list_utilities.SIX_INTEGER, SubLObjectFactory.makeString("VII"), SubLObjectFactory.makeString("Successor(7)"), SubLObjectFactory.makeString("VIII"), list_utilities.NINE_INTEGER, SubLObjectFactory.makeString("nine"), list_utilities.TEN_INTEGER, SubLObjectFactory.makeString("IX"), list_utilities.ELEVEN_INTEGER, SubLObjectFactory.makeString("twelve") }), ConsesLow.list(new SubLObject[] { list_utilities.ONE_INTEGER, list_utilities.TWO_INTEGER, list_utilities.THREE_INTEGER, SubLObjectFactory.makeString("IV"), list_utilities.SIX_INTEGER, SubLObjectFactory.makeString("VII"), SubLObjectFactory.makeString("Successor(7)"), SubLObjectFactory.makeString("VIII"), list_utilities.NINE_INTEGER, SubLObjectFactory.makeString("nine"), SubLObjectFactory.makeString("Successor(9)"), SubLObjectFactory.makeString("IX"), list_utilities.ELEVEN_INTEGER, SubLObjectFactory.makeString("twelve") }), ConsesLow.list(new SubLObject[] { list_utilities.ONE_INTEGER, list_utilities.TWO_INTEGER, list_utilities.THREE_INTEGER, SubLObjectFactory.makeString("IV"), list_utilities.SIX_INTEGER, SubLObjectFactory.makeString("VII"), list_utilities.EIGHT_INTEGER, SubLObjectFactory.makeString("eight"), list_utilities.NINE_INTEGER, SubLObjectFactory.makeString("nine"), list_utilities.TEN_INTEGER, SubLObjectFactory.makeString("IX"), list_utilities.ELEVEN_INTEGER, SubLObjectFactory.makeString("twelve") }), ConsesLow.list(new SubLObject[] { list_utilities.ONE_INTEGER, list_utilities.TWO_INTEGER, list_utilities.THREE_INTEGER, SubLObjectFactory.makeString("IV"), list_utilities.SIX_INTEGER, SubLObjectFactory.makeString("VII"), list_utilities.EIGHT_INTEGER, SubLObjectFactory.makeString("eight"), list_utilities.NINE_INTEGER, SubLObjectFactory.makeString("nine"), SubLObjectFactory.makeString("Successor(9)"), SubLObjectFactory.makeString("IX"), list_utilities.ELEVEN_INTEGER, SubLObjectFactory.makeString("twelve") }), ConsesLow.list(new SubLObject[] { list_utilities.ONE_INTEGER, list_utilities.TWO_INTEGER, list_utilities.THREE_INTEGER, SubLObjectFactory.makeString("IV"), list_utilities.SIX_INTEGER, list_utilities.SEVEN_INTEGER, SubLObjectFactory.makeString("eight"), SubLObjectFactory.makeString("Successor(7)"), list_utilities.NINE_INTEGER, SubLObjectFactory.makeString("nine"), list_utilities.TEN_INTEGER, SubLObjectFactory.makeString("IX"), list_utilities.ELEVEN_INTEGER, SubLObjectFactory.makeString("twelve") }), ConsesLow.list(new SubLObject[] { list_utilities.ONE_INTEGER, list_utilities.TWO_INTEGER, list_utilities.THREE_INTEGER, SubLObjectFactory.makeString("IV"), list_utilities.SIX_INTEGER, list_utilities.SEVEN_INTEGER, SubLObjectFactory.makeString("eight"), SubLObjectFactory.makeString("Successor(7)"), list_utilities.NINE_INTEGER, SubLObjectFactory.makeString("nine"), SubLObjectFactory.makeString("Successor(9)"), SubLObjectFactory.makeString("IX"), list_utilities.ELEVEN_INTEGER, SubLObjectFactory.makeString("twelve") }), ConsesLow.list(new SubLObject[] { list_utilities.ONE_INTEGER, list_utilities.TWO_INTEGER, list_utilities.THREE_INTEGER, SubLObjectFactory.makeString("IV"), list_utilities.SIX_INTEGER, list_utilities.SEVEN_INTEGER, SubLObjectFactory.makeString("Successor(7)"), SubLObjectFactory.makeString("VIII"), list_utilities.NINE_INTEGER, SubLObjectFactory.makeString("nine"), list_utilities.TEN_INTEGER, SubLObjectFactory.makeString("IX"), list_utilities.ELEVEN_INTEGER, SubLObjectFactory.makeString("twelve") }), ConsesLow.list(new SubLObject[] { list_utilities.ONE_INTEGER, list_utilities.TWO_INTEGER, list_utilities.THREE_INTEGER, SubLObjectFactory.makeString("IV"), list_utilities.SIX_INTEGER, list_utilities.SEVEN_INTEGER, SubLObjectFactory.makeString("Successor(7)"), SubLObjectFactory.makeString("VIII"), list_utilities.NINE_INTEGER, SubLObjectFactory.makeString("nine"), SubLObjectFactory.makeString("Successor(9)"), SubLObjectFactory.makeString("IX"), list_utilities.ELEVEN_INTEGER, SubLObjectFactory.makeString("twelve") }), ConsesLow.list(new SubLObject[] { list_utilities.ONE_INTEGER, list_utilities.TWO_INTEGER, list_utilities.THREE_INTEGER, SubLObjectFactory.makeString("IV"), list_utilities.SIX_INTEGER, list_utilities.SEVEN_INTEGER, list_utilities.EIGHT_INTEGER, SubLObjectFactory.makeString("eight"), list_utilities.NINE_INTEGER, SubLObjectFactory.makeString("nine"), list_utilities.TEN_INTEGER, SubLObjectFactory.makeString("IX"), list_utilities.ELEVEN_INTEGER, SubLObjectFactory.makeString("twelve") }), ConsesLow.list(new SubLObject[] { list_utilities.ONE_INTEGER, list_utilities.TWO_INTEGER, list_utilities.THREE_INTEGER, SubLObjectFactory.makeString("IV"), list_utilities.SIX_INTEGER, list_utilities.SEVEN_INTEGER, list_utilities.EIGHT_INTEGER, SubLObjectFactory.makeString("eight"), list_utilities.NINE_INTEGER, SubLObjectFactory.makeString("nine"), SubLObjectFactory.makeString("Successor(9)"), SubLObjectFactory.makeString("IX"), list_utilities.ELEVEN_INTEGER, SubLObjectFactory.makeString("twelve") }), ConsesLow.list(new SubLObject[] { list_utilities.ONE_INTEGER, list_utilities.TWO_INTEGER, list_utilities.THREE_INTEGER, list_utilities.FOUR_INTEGER, SubLObjectFactory.makeString("four"), list_utilities.SIX_INTEGER, SubLObjectFactory.makeString("VII"), SubLObjectFactory.makeString("eight"), SubLObjectFactory.makeString("Successor(7)"), list_utilities.NINE_INTEGER, SubLObjectFactory.makeString("nine"), list_utilities.TEN_INTEGER, SubLObjectFactory.makeString("IX"), list_utilities.ELEVEN_INTEGER, SubLObjectFactory.makeString("twelve") }), ConsesLow.list(new SubLObject[] { list_utilities.ONE_INTEGER, list_utilities.TWO_INTEGER, list_utilities.THREE_INTEGER, list_utilities.FOUR_INTEGER, SubLObjectFactory.makeString("four"), list_utilities.SIX_INTEGER, SubLObjectFactory.makeString("VII"), SubLObjectFactory.makeString("eight"), SubLObjectFactory.makeString("Successor(7)"), list_utilities.NINE_INTEGER, SubLObjectFactory.makeString("nine"), SubLObjectFactory.makeString("Successor(9)"), SubLObjectFactory.makeString("IX"), list_utilities.ELEVEN_INTEGER, SubLObjectFactory.makeString("twelve") }), ConsesLow.list(new SubLObject[] { list_utilities.ONE_INTEGER, list_utilities.TWO_INTEGER, list_utilities.THREE_INTEGER, list_utilities.FOUR_INTEGER, SubLObjectFactory.makeString("four"), list_utilities.SIX_INTEGER, SubLObjectFactory.makeString("VII"), SubLObjectFactory.makeString("Successor(7)"), SubLObjectFactory.makeString("VIII"), list_utilities.NINE_INTEGER, SubLObjectFactory.makeString("nine"), list_utilities.TEN_INTEGER, SubLObjectFactory.makeString("IX"), list_utilities.ELEVEN_INTEGER, SubLObjectFactory.makeString("twelve") }), ConsesLow.list(new SubLObject[] { list_utilities.ONE_INTEGER, list_utilities.TWO_INTEGER, list_utilities.THREE_INTEGER, list_utilities.FOUR_INTEGER, SubLObjectFactory.makeString("four"), list_utilities.SIX_INTEGER, SubLObjectFactory.makeString("VII"), SubLObjectFactory.makeString("Successor(7)"), SubLObjectFactory.makeString("VIII"), list_utilities.NINE_INTEGER, SubLObjectFactory.makeString("nine"), SubLObjectFactory.makeString("Successor(9)"), SubLObjectFactory.makeString("IX"), list_utilities.ELEVEN_INTEGER, SubLObjectFactory.makeString("twelve") }), ConsesLow.list(new SubLObject[] { list_utilities.ONE_INTEGER, list_utilities.TWO_INTEGER, list_utilities.THREE_INTEGER, list_utilities.FOUR_INTEGER, SubLObjectFactory.makeString("four"), list_utilities.SIX_INTEGER, SubLObjectFactory.makeString("VII"), list_utilities.EIGHT_INTEGER, SubLObjectFactory.makeString("eight"), list_utilities.NINE_INTEGER, SubLObjectFactory.makeString("nine"), list_utilities.TEN_INTEGER, SubLObjectFactory.makeString("IX"), list_utilities.ELEVEN_INTEGER, SubLObjectFactory.makeString("twelve") }), ConsesLow.list(new SubLObject[] { list_utilities.ONE_INTEGER, list_utilities.TWO_INTEGER, list_utilities.THREE_INTEGER, list_utilities.FOUR_INTEGER, SubLObjectFactory.makeString("four"), list_utilities.SIX_INTEGER, SubLObjectFactory.makeString("VII"), list_utilities.EIGHT_INTEGER, SubLObjectFactory.makeString("eight"), list_utilities.NINE_INTEGER, SubLObjectFactory.makeString("nine"), SubLObjectFactory.makeString("Successor(9)"), SubLObjectFactory.makeString("IX"), list_utilities.ELEVEN_INTEGER, SubLObjectFactory.makeString("twelve") }), ConsesLow.list(new SubLObject[] { list_utilities.ONE_INTEGER, list_utilities.TWO_INTEGER, list_utilities.THREE_INTEGER, list_utilities.FOUR_INTEGER, SubLObjectFactory.makeString("four"), list_utilities.SIX_INTEGER, list_utilities.SEVEN_INTEGER, SubLObjectFactory.makeString("eight"), SubLObjectFactory.makeString("Successor(7)"), list_utilities.NINE_INTEGER, SubLObjectFactory.makeString("nine"), list_utilities.TEN_INTEGER, SubLObjectFactory.makeString("IX"), list_utilities.ELEVEN_INTEGER, SubLObjectFactory.makeString("twelve") }), ConsesLow.list(new SubLObject[] { list_utilities.ONE_INTEGER, list_utilities.TWO_INTEGER, list_utilities.THREE_INTEGER, list_utilities.FOUR_INTEGER, SubLObjectFactory.makeString("four"), list_utilities.SIX_INTEGER, list_utilities.SEVEN_INTEGER, SubLObjectFactory.makeString("eight"), SubLObjectFactory.makeString("Successor(7)"), list_utilities.NINE_INTEGER, SubLObjectFactory.makeString("nine"), SubLObjectFactory.makeString("Successor(9)"), SubLObjectFactory.makeString("IX"), list_utilities.ELEVEN_INTEGER, SubLObjectFactory.makeString("twelve") }), ConsesLow.list(new SubLObject[] { list_utilities.ONE_INTEGER, list_utilities.TWO_INTEGER, list_utilities.THREE_INTEGER, list_utilities.FOUR_INTEGER, SubLObjectFactory.makeString("four"), list_utilities.SIX_INTEGER, list_utilities.SEVEN_INTEGER, SubLObjectFactory.makeString("Successor(7)"), SubLObjectFactory.makeString("VIII"), list_utilities.NINE_INTEGER, SubLObjectFactory.makeString("nine"), list_utilities.TEN_INTEGER, SubLObjectFactory.makeString("IX"), list_utilities.ELEVEN_INTEGER, SubLObjectFactory.makeString("twelve") }), ConsesLow.list(new SubLObject[] { list_utilities.ONE_INTEGER, list_utilities.TWO_INTEGER, list_utilities.THREE_INTEGER, list_utilities.FOUR_INTEGER, SubLObjectFactory.makeString("four"), list_utilities.SIX_INTEGER, list_utilities.SEVEN_INTEGER, SubLObjectFactory.makeString("Successor(7)"), SubLObjectFactory.makeString("VIII"), list_utilities.NINE_INTEGER, SubLObjectFactory.makeString("nine"), SubLObjectFactory.makeString("Successor(9)"), SubLObjectFactory.makeString("IX"), list_utilities.ELEVEN_INTEGER, SubLObjectFactory.makeString("twelve") }), ConsesLow.list(new SubLObject[] { list_utilities.ONE_INTEGER, list_utilities.TWO_INTEGER, list_utilities.THREE_INTEGER, list_utilities.FOUR_INTEGER, SubLObjectFactory.makeString("four"), list_utilities.SIX_INTEGER, list_utilities.SEVEN_INTEGER, list_utilities.EIGHT_INTEGER, SubLObjectFactory.makeString("eight"), list_utilities.NINE_INTEGER, SubLObjectFactory.makeString("nine"), list_utilities.TEN_INTEGER, SubLObjectFactory.makeString("IX"), list_utilities.ELEVEN_INTEGER, SubLObjectFactory.makeString("twelve") }), ConsesLow.list(new SubLObject[] { list_utilities.ONE_INTEGER, list_utilities.TWO_INTEGER, list_utilities.THREE_INTEGER, list_utilities.FOUR_INTEGER, SubLObjectFactory.makeString("four"), list_utilities.SIX_INTEGER, list_utilities.SEVEN_INTEGER, list_utilities.EIGHT_INTEGER, SubLObjectFactory.makeString("eight"), list_utilities.NINE_INTEGER, SubLObjectFactory.makeString("nine"), SubLObjectFactory.makeString("Successor(9)"), SubLObjectFactory.makeString("IX"), list_utilities.ELEVEN_INTEGER, SubLObjectFactory.makeString("twelve") }), ConsesLow.list(new SubLObject[] { list_utilities.ONE_INTEGER, SubLObjectFactory.makeString("II"), list_utilities.THREE_INTEGER, SubLObjectFactory.makeString("IV"), list_utilities.SIX_INTEGER, SubLObjectFactory.makeString("VII"), SubLObjectFactory.makeString("eight"), SubLObjectFactory.makeString("Successor(7)"), list_utilities.NINE_INTEGER, SubLObjectFactory.makeString("nine"), list_utilities.TEN_INTEGER, SubLObjectFactory.makeString("IX"), list_utilities.ELEVEN_INTEGER, SubLObjectFactory.makeString("twelve") }), ConsesLow.list(new SubLObject[] { list_utilities.ONE_INTEGER, SubLObjectFactory.makeString("II"), list_utilities.THREE_INTEGER, SubLObjectFactory.makeString("IV"), list_utilities.SIX_INTEGER, SubLObjectFactory.makeString("VII"), SubLObjectFactory.makeString("eight"), SubLObjectFactory.makeString("Successor(7)"), list_utilities.NINE_INTEGER, SubLObjectFactory.makeString("nine"), SubLObjectFactory.makeString("Successor(9)"), SubLObjectFactory.makeString("IX"), list_utilities.ELEVEN_INTEGER, SubLObjectFactory.makeString("twelve") }), ConsesLow.list(new SubLObject[] { list_utilities.ONE_INTEGER, SubLObjectFactory.makeString("II"), list_utilities.THREE_INTEGER, SubLObjectFactory.makeString("IV"), list_utilities.SIX_INTEGER, SubLObjectFactory.makeString("VII"), SubLObjectFactory.makeString("Successor(7)"), SubLObjectFactory.makeString("VIII"), list_utilities.NINE_INTEGER, SubLObjectFactory.makeString("nine"), list_utilities.TEN_INTEGER, SubLObjectFactory.makeString("IX"), list_utilities.ELEVEN_INTEGER, SubLObjectFactory.makeString("twelve") }), ConsesLow.list(new SubLObject[] { list_utilities.ONE_INTEGER, SubLObjectFactory.makeString("II"), list_utilities.THREE_INTEGER, SubLObjectFactory.makeString("IV"), list_utilities.SIX_INTEGER, SubLObjectFactory.makeString("VII"), SubLObjectFactory.makeString("Successor(7)"), SubLObjectFactory.makeString("VIII"), list_utilities.NINE_INTEGER, SubLObjectFactory.makeString("nine"), SubLObjectFactory.makeString("Successor(9)"), SubLObjectFactory.makeString("IX"), list_utilities.ELEVEN_INTEGER, SubLObjectFactory.makeString("twelve") }), ConsesLow.list(new SubLObject[] { list_utilities.ONE_INTEGER, SubLObjectFactory.makeString("II"), list_utilities.THREE_INTEGER, SubLObjectFactory.makeString("IV"), list_utilities.SIX_INTEGER, SubLObjectFactory.makeString("VII"), list_utilities.EIGHT_INTEGER, SubLObjectFactory.makeString("eight"), list_utilities.NINE_INTEGER, SubLObjectFactory.makeString("nine"), list_utilities.TEN_INTEGER, SubLObjectFactory.makeString("IX"), list_utilities.ELEVEN_INTEGER, SubLObjectFactory.makeString("twelve") }), ConsesLow.list(new SubLObject[] { list_utilities.ONE_INTEGER, SubLObjectFactory.makeString("II"), list_utilities.THREE_INTEGER, SubLObjectFactory.makeString("IV"), list_utilities.SIX_INTEGER, SubLObjectFactory.makeString("VII"), list_utilities.EIGHT_INTEGER, SubLObjectFactory.makeString("eight"), list_utilities.NINE_INTEGER, SubLObjectFactory.makeString("nine"), SubLObjectFactory.makeString("Successor(9)"), SubLObjectFactory.makeString("IX"), list_utilities.ELEVEN_INTEGER, SubLObjectFactory.makeString("twelve") }), ConsesLow.list(new SubLObject[] { list_utilities.ONE_INTEGER, SubLObjectFactory.makeString("II"), list_utilities.THREE_INTEGER, SubLObjectFactory.makeString("IV"), list_utilities.SIX_INTEGER, list_utilities.SEVEN_INTEGER, SubLObjectFactory.makeString("eight"), SubLObjectFactory.makeString("Successor(7)"), list_utilities.NINE_INTEGER, SubLObjectFactory.makeString("nine"), list_utilities.TEN_INTEGER, SubLObjectFactory.makeString("IX"), list_utilities.ELEVEN_INTEGER, SubLObjectFactory.makeString("twelve") }), ConsesLow.list(new SubLObject[] { list_utilities.ONE_INTEGER, SubLObjectFactory.makeString("II"), list_utilities.THREE_INTEGER, SubLObjectFactory.makeString("IV"), list_utilities.SIX_INTEGER, list_utilities.SEVEN_INTEGER, SubLObjectFactory.makeString("eight"), SubLObjectFactory.makeString("Successor(7)"), list_utilities.NINE_INTEGER, SubLObjectFactory.makeString("nine"), SubLObjectFactory.makeString("Successor(9)"), SubLObjectFactory.makeString("IX"), list_utilities.ELEVEN_INTEGER, SubLObjectFactory.makeString("twelve") }), ConsesLow.list(new SubLObject[] { list_utilities.ONE_INTEGER, SubLObjectFactory.makeString("II"), list_utilities.THREE_INTEGER, SubLObjectFactory.makeString("IV"), list_utilities.SIX_INTEGER, list_utilities.SEVEN_INTEGER, SubLObjectFactory.makeString("Successor(7)"), SubLObjectFactory.makeString("VIII"), list_utilities.NINE_INTEGER, SubLObjectFactory.makeString("nine"), list_utilities.TEN_INTEGER, SubLObjectFactory.makeString("IX"), list_utilities.ELEVEN_INTEGER, SubLObjectFactory.makeString("twelve") }), ConsesLow.list(new SubLObject[] { list_utilities.ONE_INTEGER, SubLObjectFactory.makeString("II"), list_utilities.THREE_INTEGER, SubLObjectFactory.makeString("IV"), list_utilities.SIX_INTEGER, list_utilities.SEVEN_INTEGER, SubLObjectFactory.makeString("Successor(7)"), SubLObjectFactory.makeString("VIII"), list_utilities.NINE_INTEGER, SubLObjectFactory.makeString("nine"), SubLObjectFactory.makeString("Successor(9)"), SubLObjectFactory.makeString("IX"), list_utilities.ELEVEN_INTEGER, SubLObjectFactory.makeString("twelve") }), ConsesLow.list(new SubLObject[] { list_utilities.ONE_INTEGER, SubLObjectFactory.makeString("II"), list_utilities.THREE_INTEGER, SubLObjectFactory.makeString("IV"), list_utilities.SIX_INTEGER, list_utilities.SEVEN_INTEGER, list_utilities.EIGHT_INTEGER, SubLObjectFactory.makeString("eight"), list_utilities.NINE_INTEGER, SubLObjectFactory.makeString("nine"), list_utilities.TEN_INTEGER, SubLObjectFactory.makeString("IX"), list_utilities.ELEVEN_INTEGER, SubLObjectFactory.makeString("twelve") }), ConsesLow.list(new SubLObject[] { list_utilities.ONE_INTEGER, SubLObjectFactory.makeString("II"), list_utilities.THREE_INTEGER, SubLObjectFactory.makeString("IV"), list_utilities.SIX_INTEGER, list_utilities.SEVEN_INTEGER, list_utilities.EIGHT_INTEGER, SubLObjectFactory.makeString("eight"), list_utilities.NINE_INTEGER, SubLObjectFactory.makeString("nine"), SubLObjectFactory.makeString("Successor(9)"), SubLObjectFactory.makeString("IX"), list_utilities.ELEVEN_INTEGER, SubLObjectFactory.makeString("twelve") }), ConsesLow.list(new SubLObject[] { list_utilities.ONE_INTEGER, SubLObjectFactory.makeString("II"), list_utilities.THREE_INTEGER, list_utilities.FOUR_INTEGER, SubLObjectFactory.makeString("four"), list_utilities.SIX_INTEGER, SubLObjectFactory.makeString("VII"), SubLObjectFactory.makeString("eight"), SubLObjectFactory.makeString("Successor(7)"), list_utilities.NINE_INTEGER, SubLObjectFactory.makeString("nine"), list_utilities.TEN_INTEGER, SubLObjectFactory.makeString("IX"), list_utilities.ELEVEN_INTEGER, SubLObjectFactory.makeString("twelve") }), ConsesLow.list(new SubLObject[] { list_utilities.ONE_INTEGER, SubLObjectFactory.makeString("II"), list_utilities.THREE_INTEGER, list_utilities.FOUR_INTEGER, SubLObjectFactory.makeString("four"), list_utilities.SIX_INTEGER, SubLObjectFactory.makeString("VII"), SubLObjectFactory.makeString("eight"), SubLObjectFactory.makeString("Successor(7)"), list_utilities.NINE_INTEGER, SubLObjectFactory.makeString("nine"), SubLObjectFactory.makeString("Successor(9)"), SubLObjectFactory.makeString("IX"), list_utilities.ELEVEN_INTEGER, SubLObjectFactory.makeString("twelve") }), ConsesLow.list(new SubLObject[] { list_utilities.ONE_INTEGER, SubLObjectFactory.makeString("II"), list_utilities.THREE_INTEGER, list_utilities.FOUR_INTEGER, SubLObjectFactory.makeString("four"), list_utilities.SIX_INTEGER, SubLObjectFactory.makeString("VII"), SubLObjectFactory.makeString("Successor(7)"), SubLObjectFactory.makeString("VIII"), list_utilities.NINE_INTEGER, SubLObjectFactory.makeString("nine"), list_utilities.TEN_INTEGER, SubLObjectFactory.makeString("IX"), list_utilities.ELEVEN_INTEGER, SubLObjectFactory.makeString("twelve") }), ConsesLow.list(new SubLObject[] { list_utilities.ONE_INTEGER, SubLObjectFactory.makeString("II"), list_utilities.THREE_INTEGER, list_utilities.FOUR_INTEGER, SubLObjectFactory.makeString("four"), list_utilities.SIX_INTEGER, SubLObjectFactory.makeString("VII"), SubLObjectFactory.makeString("Successor(7)"), SubLObjectFactory.makeString("VIII"), list_utilities.NINE_INTEGER, SubLObjectFactory.makeString("nine"), SubLObjectFactory.makeString("Successor(9)"), SubLObjectFactory.makeString("IX"), list_utilities.ELEVEN_INTEGER, SubLObjectFactory.makeString("twelve") }), ConsesLow.list(new SubLObject[] { list_utilities.ONE_INTEGER, SubLObjectFactory.makeString("II"), list_utilities.THREE_INTEGER, list_utilities.FOUR_INTEGER, SubLObjectFactory.makeString("four"), list_utilities.SIX_INTEGER, SubLObjectFactory.makeString("VII"), list_utilities.EIGHT_INTEGER, SubLObjectFactory.makeString("eight"), list_utilities.NINE_INTEGER, SubLObjectFactory.makeString("nine"), list_utilities.TEN_INTEGER, SubLObjectFactory.makeString("IX"), list_utilities.ELEVEN_INTEGER, SubLObjectFactory.makeString("twelve") }), ConsesLow.list(new SubLObject[] { list_utilities.ONE_INTEGER, SubLObjectFactory.makeString("II"), list_utilities.THREE_INTEGER, list_utilities.FOUR_INTEGER, SubLObjectFactory.makeString("four"), list_utilities.SIX_INTEGER, SubLObjectFactory.makeString("VII"), list_utilities.EIGHT_INTEGER, SubLObjectFactory.makeString("eight"), list_utilities.NINE_INTEGER, SubLObjectFactory.makeString("nine"), SubLObjectFactory.makeString("Successor(9)"), SubLObjectFactory.makeString("IX"), list_utilities.ELEVEN_INTEGER, SubLObjectFactory.makeString("twelve") }), ConsesLow.list(new SubLObject[] { list_utilities.ONE_INTEGER, SubLObjectFactory.makeString("II"), list_utilities.THREE_INTEGER, list_utilities.FOUR_INTEGER, SubLObjectFactory.makeString("four"), list_utilities.SIX_INTEGER, list_utilities.SEVEN_INTEGER, SubLObjectFactory.makeString("eight"), SubLObjectFactory.makeString("Successor(7)"), list_utilities.NINE_INTEGER, SubLObjectFactory.makeString("nine"), list_utilities.TEN_INTEGER, SubLObjectFactory.makeString("IX"), list_utilities.ELEVEN_INTEGER, SubLObjectFactory.makeString("twelve") }), ConsesLow.list(new SubLObject[] { list_utilities.ONE_INTEGER, SubLObjectFactory.makeString("II"), list_utilities.THREE_INTEGER, list_utilities.FOUR_INTEGER, SubLObjectFactory.makeString("four"), list_utilities.SIX_INTEGER, list_utilities.SEVEN_INTEGER, SubLObjectFactory.makeString("eight"), SubLObjectFactory.makeString("Successor(7)"), list_utilities.NINE_INTEGER, SubLObjectFactory.makeString("nine"), SubLObjectFactory.makeString("Successor(9)"), SubLObjectFactory.makeString("IX"), list_utilities.ELEVEN_INTEGER, SubLObjectFactory.makeString("twelve") }), ConsesLow.list(new SubLObject[] { list_utilities.ONE_INTEGER, SubLObjectFactory.makeString("II"), list_utilities.THREE_INTEGER, list_utilities.FOUR_INTEGER, SubLObjectFactory.makeString("four"), list_utilities.SIX_INTEGER, list_utilities.SEVEN_INTEGER, SubLObjectFactory.makeString("Successor(7)"), SubLObjectFactory.makeString("VIII"), list_utilities.NINE_INTEGER, SubLObjectFactory.makeString("nine"), list_utilities.TEN_INTEGER, SubLObjectFactory.makeString("IX"), list_utilities.ELEVEN_INTEGER, SubLObjectFactory.makeString("twelve") }), ConsesLow.list(new SubLObject[] { list_utilities.ONE_INTEGER, SubLObjectFactory.makeString("II"), list_utilities.THREE_INTEGER, list_utilities.FOUR_INTEGER, SubLObjectFactory.makeString("four"), list_utilities.SIX_INTEGER, list_utilities.SEVEN_INTEGER, SubLObjectFactory.makeString("Successor(7)"), SubLObjectFactory.makeString("VIII"), list_utilities.NINE_INTEGER, SubLObjectFactory.makeString("nine"), SubLObjectFactory.makeString("Successor(9)"), SubLObjectFactory.makeString("IX"), list_utilities.ELEVEN_INTEGER, SubLObjectFactory.makeString("twelve") }), ConsesLow.list(new SubLObject[] { list_utilities.ONE_INTEGER, SubLObjectFactory.makeString("II"), list_utilities.THREE_INTEGER, list_utilities.FOUR_INTEGER, SubLObjectFactory.makeString("four"), list_utilities.SIX_INTEGER, list_utilities.SEVEN_INTEGER, list_utilities.EIGHT_INTEGER, SubLObjectFactory.makeString("eight"), list_utilities.NINE_INTEGER, SubLObjectFactory.makeString("nine"), list_utilities.TEN_INTEGER, SubLObjectFactory.makeString("IX"), list_utilities.ELEVEN_INTEGER, SubLObjectFactory.makeString("twelve") }), ConsesLow.list(new SubLObject[] { list_utilities.ONE_INTEGER, SubLObjectFactory.makeString("II"), list_utilities.THREE_INTEGER, list_utilities.FOUR_INTEGER, SubLObjectFactory.makeString("four"), list_utilities.SIX_INTEGER, list_utilities.SEVEN_INTEGER, list_utilities.EIGHT_INTEGER, SubLObjectFactory.makeString("eight"), list_utilities.NINE_INTEGER, SubLObjectFactory.makeString("nine"), SubLObjectFactory.makeString("Successor(9)"), SubLObjectFactory.makeString("IX"), list_utilities.ELEVEN_INTEGER, SubLObjectFactory.makeString("twelve") }) })), (SubLObject)list_utilities.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { list_utilities.ZERO_INTEGER, list_utilities.ONE_INTEGER, list_utilities.TWO_INTEGER, list_utilities.THREE_INTEGER, list_utilities.FOUR_INTEGER, list_utilities.FIVE_INTEGER, list_utilities.SIX_INTEGER, list_utilities.SEVEN_INTEGER, list_utilities.EIGHT_INTEGER, list_utilities.NINE_INTEGER, list_utilities.TEN_INTEGER, list_utilities.ELEVEN_INTEGER }), (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)list_utilities.ZERO_INTEGER, (SubLObject)list_utilities.ONE_INTEGER), ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.TWO_INTEGER), ConsesLow.list((SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.THREE_INTEGER), ConsesLow.list((SubLObject)list_utilities.THREE_INTEGER, (SubLObject)list_utilities.FOUR_INTEGER), ConsesLow.list((SubLObject)list_utilities.FOUR_INTEGER, (SubLObject)list_utilities.FIVE_INTEGER), ConsesLow.list((SubLObject)list_utilities.FIVE_INTEGER, (SubLObject)list_utilities.SIX_INTEGER), ConsesLow.list((SubLObject)list_utilities.SIX_INTEGER, (SubLObject)list_utilities.ZERO_INTEGER), ConsesLow.list((SubLObject)list_utilities.ZERO_INTEGER, (SubLObject)list_utilities.SEVEN_INTEGER), ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.EIGHT_INTEGER), ConsesLow.list((SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.EIGHT_INTEGER), ConsesLow.list((SubLObject)list_utilities.THREE_INTEGER, (SubLObject)list_utilities.NINE_INTEGER), ConsesLow.list((SubLObject)list_utilities.FOUR_INTEGER, (SubLObject)list_utilities.NINE_INTEGER), ConsesLow.list((SubLObject)list_utilities.FIVE_INTEGER, (SubLObject)list_utilities.TEN_INTEGER), ConsesLow.list((SubLObject)list_utilities.SIX_INTEGER, (SubLObject)list_utilities.TEN_INTEGER), ConsesLow.list((SubLObject)list_utilities.SEVEN_INTEGER, (SubLObject)list_utilities.EIGHT_INTEGER), ConsesLow.list((SubLObject)list_utilities.SEVEN_INTEGER, (SubLObject)list_utilities.ELEVEN_INTEGER), ConsesLow.list((SubLObject)list_utilities.NINE_INTEGER, (SubLObject)list_utilities.ELEVEN_INTEGER), ConsesLow.list((SubLObject)list_utilities.TEN_INTEGER, (SubLObject)list_utilities.ELEVEN_INTEGER) }), (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.THREE_INTEGER, (SubLObject)list_utilities.FIVE_INTEGER, (SubLObject)list_utilities.SEVEN_INTEGER), ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.THREE_INTEGER, (SubLObject)list_utilities.FIVE_INTEGER, (SubLObject)list_utilities.ELEVEN_INTEGER), ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.THREE_INTEGER, (SubLObject)list_utilities.SEVEN_INTEGER, (SubLObject)list_utilities.TEN_INTEGER), ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.THREE_INTEGER, (SubLObject)list_utilities.SIX_INTEGER, (SubLObject)list_utilities.SEVEN_INTEGER), ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.THREE_INTEGER, (SubLObject)list_utilities.SIX_INTEGER, (SubLObject)list_utilities.ELEVEN_INTEGER), ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.FIVE_INTEGER, (SubLObject)list_utilities.SEVEN_INTEGER, (SubLObject)list_utilities.NINE_INTEGER), ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.SEVEN_INTEGER, (SubLObject)list_utilities.NINE_INTEGER, (SubLObject)list_utilities.TEN_INTEGER), ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.SIX_INTEGER, (SubLObject)list_utilities.SEVEN_INTEGER, (SubLObject)list_utilities.NINE_INTEGER), ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.FOUR_INTEGER, (SubLObject)list_utilities.SEVEN_INTEGER, (SubLObject)list_utilities.TEN_INTEGER), ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.FOUR_INTEGER, (SubLObject)list_utilities.SIX_INTEGER, (SubLObject)list_utilities.SEVEN_INTEGER), ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.FOUR_INTEGER, (SubLObject)list_utilities.SIX_INTEGER, (SubLObject)list_utilities.ELEVEN_INTEGER), ConsesLow.list((SubLObject)list_utilities.THREE_INTEGER, (SubLObject)list_utilities.SIX_INTEGER, (SubLObject)list_utilities.EIGHT_INTEGER, (SubLObject)list_utilities.ELEVEN_INTEGER), ConsesLow.list((SubLObject)list_utilities.SIX_INTEGER, (SubLObject)list_utilities.EIGHT_INTEGER, (SubLObject)list_utilities.NINE_INTEGER), ConsesLow.list((SubLObject)list_utilities.FOUR_INTEGER, (SubLObject)list_utilities.SIX_INTEGER, (SubLObject)list_utilities.EIGHT_INTEGER, (SubLObject)list_utilities.ELEVEN_INTEGER), ConsesLow.list((SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.FIVE_INTEGER, (SubLObject)list_utilities.SEVEN_INTEGER, (SubLObject)list_utilities.NINE_INTEGER), ConsesLow.list((SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.SEVEN_INTEGER, (SubLObject)list_utilities.NINE_INTEGER, (SubLObject)list_utilities.TEN_INTEGER), ConsesLow.list((SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.SIX_INTEGER, (SubLObject)list_utilities.SEVEN_INTEGER, (SubLObject)list_utilities.NINE_INTEGER), ConsesLow.list((SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.FOUR_INTEGER, (SubLObject)list_utilities.SEVEN_INTEGER, (SubLObject)list_utilities.TEN_INTEGER), ConsesLow.list((SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.FOUR_INTEGER, (SubLObject)list_utilities.SIX_INTEGER, (SubLObject)list_utilities.SEVEN_INTEGER), ConsesLow.list((SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.FOUR_INTEGER, (SubLObject)list_utilities.SIX_INTEGER, (SubLObject)list_utilities.ELEVEN_INTEGER), ConsesLow.list((SubLObject)list_utilities.ZERO_INTEGER, (SubLObject)list_utilities.THREE_INTEGER, (SubLObject)list_utilities.FIVE_INTEGER, (SubLObject)list_utilities.EIGHT_INTEGER, (SubLObject)list_utilities.ELEVEN_INTEGER), ConsesLow.list((SubLObject)list_utilities.ZERO_INTEGER, (SubLObject)list_utilities.THREE_INTEGER, (SubLObject)list_utilities.EIGHT_INTEGER, (SubLObject)list_utilities.TEN_INTEGER), ConsesLow.list((SubLObject)list_utilities.ZERO_INTEGER, (SubLObject)list_utilities.FIVE_INTEGER, (SubLObject)list_utilities.EIGHT_INTEGER, (SubLObject)list_utilities.NINE_INTEGER), ConsesLow.list((SubLObject)list_utilities.ZERO_INTEGER, (SubLObject)list_utilities.EIGHT_INTEGER, (SubLObject)list_utilities.NINE_INTEGER, (SubLObject)list_utilities.TEN_INTEGER), ConsesLow.list((SubLObject)list_utilities.ZERO_INTEGER, (SubLObject)list_utilities.FOUR_INTEGER, (SubLObject)list_utilities.EIGHT_INTEGER, (SubLObject)list_utilities.ELEVEN_INTEGER), ConsesLow.list((SubLObject)list_utilities.ZERO_INTEGER, (SubLObject)list_utilities.FOUR_INTEGER, (SubLObject)list_utilities.EIGHT_INTEGER, (SubLObject)list_utilities.TEN_INTEGER), ConsesLow.list((SubLObject)list_utilities.ZERO_INTEGER, (SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.FIVE_INTEGER, (SubLObject)list_utilities.NINE_INTEGER), ConsesLow.list((SubLObject)list_utilities.ZERO_INTEGER, (SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.FIVE_INTEGER, (SubLObject)list_utilities.ELEVEN_INTEGER), ConsesLow.list((SubLObject)list_utilities.ZERO_INTEGER, (SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.NINE_INTEGER, (SubLObject)list_utilities.TEN_INTEGER), ConsesLow.list((SubLObject)list_utilities.ZERO_INTEGER, (SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.FOUR_INTEGER, (SubLObject)list_utilities.ELEVEN_INTEGER), ConsesLow.list((SubLObject)list_utilities.ZERO_INTEGER, (SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.FOUR_INTEGER, (SubLObject)list_utilities.TEN_INTEGER) })), (SubLObject)list_utilities.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.ZERO_INTEGER, (SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.THREE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.ZERO_INTEGER, (SubLObject)list_utilities.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)list_utilities.ZERO_INTEGER, (SubLObject)list_utilities.THREE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.THREE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.THREE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)list_utilities.THREE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)list_utilities.TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)list_utilities.ZERO_INTEGER))), (SubLObject)list_utilities.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.ZERO_INTEGER, (SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.THREE_INTEGER, (SubLObject)list_utilities.FOUR_INTEGER, (SubLObject)list_utilities.FIVE_INTEGER), (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)list_utilities.ZERO_INTEGER, (SubLObject)list_utilities.THREE_INTEGER), ConsesLow.list((SubLObject)list_utilities.ZERO_INTEGER, (SubLObject)list_utilities.FOUR_INTEGER), ConsesLow.list((SubLObject)list_utilities.ZERO_INTEGER, (SubLObject)list_utilities.FIVE_INTEGER), ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.THREE_INTEGER), ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.FOUR_INTEGER), ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.FIVE_INTEGER), ConsesLow.list((SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.THREE_INTEGER), ConsesLow.list((SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.FOUR_INTEGER), ConsesLow.list((SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.FIVE_INTEGER) }), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.THREE_INTEGER, (SubLObject)list_utilities.FOUR_INTEGER, (SubLObject)list_utilities.FIVE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)list_utilities.ZERO_INTEGER, (SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.TWO_INTEGER))), (SubLObject)list_utilities.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.ZERO_INTEGER, (SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.THREE_INTEGER, (SubLObject)list_utilities.FOUR_INTEGER, (SubLObject)list_utilities.FIVE_INTEGER), (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)list_utilities.ZERO_INTEGER, (SubLObject)list_utilities.ONE_INTEGER), ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.TWO_INTEGER), ConsesLow.list((SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.ZERO_INTEGER), ConsesLow.list((SubLObject)list_utilities.ZERO_INTEGER, (SubLObject)list_utilities.THREE_INTEGER), ConsesLow.list((SubLObject)list_utilities.ZERO_INTEGER, (SubLObject)list_utilities.FIVE_INTEGER), ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.THREE_INTEGER), ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.FOUR_INTEGER), ConsesLow.list((SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.FOUR_INTEGER), ConsesLow.list((SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.FIVE_INTEGER), ConsesLow.list((SubLObject)list_utilities.THREE_INTEGER, (SubLObject)list_utilities.FOUR_INTEGER), ConsesLow.list((SubLObject)list_utilities.FOUR_INTEGER, (SubLObject)list_utilities.FIVE_INTEGER), ConsesLow.list((SubLObject)list_utilities.FIVE_INTEGER, (SubLObject)list_utilities.THREE_INTEGER) }), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.FIVE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.THREE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)list_utilities.FOUR_INTEGER, (SubLObject)list_utilities.ZERO_INTEGER))), (SubLObject)list_utilities.T));
    }
    
    private static SubLObject _constant_233_initializer() {
        return (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER)), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.NIL, (SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER)), (SubLObject)list_utilities.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER), (SubLObject)list_utilities.NIL), (SubLObject)list_utilities.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)list_utilities.TWO_INTEGER)), (SubLObject)list_utilities.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.THREE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.FOUR_INTEGER)), (SubLObject)list_utilities.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.FOUR_INTEGER), (SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.THREE_INTEGER)), (SubLObject)list_utilities.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)list_utilities.THREE_INTEGER, (SubLObject)list_utilities.FOUR_INTEGER)), (SubLObject)list_utilities.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.THREE_INTEGER, (SubLObject)list_utilities.FOUR_INTEGER), (SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.TWO_INTEGER)), (SubLObject)list_utilities.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.THREE_INTEGER)), (SubLObject)list_utilities.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.THREE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)list_utilities.ZERO_INTEGER)), (SubLObject)list_utilities.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.THREE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER)), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.THREE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER)), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.THREE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)list_utilities.TWO_INTEGER)), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.THREE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)list_utilities.TWO_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)list_utilities.TWO_INTEGER)), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.THREE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.THREE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)list_utilities.THREE_INTEGER)), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.THREE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)list_utilities.THREE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)list_utilities.THREE_INTEGER)), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.FOUR_INTEGER), (SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.THREE_INTEGER)), (SubLObject)list_utilities.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.THREE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)list_utilities.FOUR_INTEGER)), (SubLObject)list_utilities.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.THREE_INTEGER, (SubLObject)list_utilities.FIVE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.FOUR_INTEGER, (SubLObject)list_utilities.SIX_INTEGER)), (SubLObject)list_utilities.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.FOUR_INTEGER, (SubLObject)list_utilities.SIX_INTEGER), (SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.THREE_INTEGER, (SubLObject)list_utilities.FIVE_INTEGER)), (SubLObject)list_utilities.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.THREE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.EIGHT_INTEGER, (SubLObject)list_utilities.NINE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER)), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.EIGHT_INTEGER, (SubLObject)list_utilities.NINE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.THREE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER)), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.THREE_INTEGER, (SubLObject)list_utilities.FOUR_INTEGER, (SubLObject)list_utilities.FIVE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.FOUR_INTEGER, (SubLObject)list_utilities.SIX_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)list_utilities.FOUR_INTEGER)), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.FOUR_INTEGER, (SubLObject)list_utilities.SIX_INTEGER), (SubLObject)ConsesLow.list((SubLObject)list_utilities.THREE_INTEGER, (SubLObject)list_utilities.FOUR_INTEGER, (SubLObject)list_utilities.FIVE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)list_utilities.FOUR_INTEGER)), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.FIVE_INTEGER, (SubLObject)list_utilities.SEVEN_INTEGER, (SubLObject)list_utilities.NINE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.EIGHT_INTEGER, (SubLObject)list_utilities.NINE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)list_utilities.NINE_INTEGER)), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.EIGHT_INTEGER, (SubLObject)list_utilities.NINE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)list_utilities.FIVE_INTEGER, (SubLObject)list_utilities.SEVEN_INTEGER, (SubLObject)list_utilities.NINE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)list_utilities.NINE_INTEGER)), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.THREE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)list_utilities.FOUR_INTEGER, (SubLObject)list_utilities.FIVE_INTEGER, (SubLObject)list_utilities.SIX_INTEGER)), (SubLObject)list_utilities.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.FOUR_INTEGER, (SubLObject)list_utilities.FIVE_INTEGER, (SubLObject)list_utilities.SIX_INTEGER), (SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.THREE_INTEGER)), (SubLObject)list_utilities.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.THREE_INTEGER, (SubLObject)list_utilities.FOUR_INTEGER), (SubLObject)ConsesLow.list((SubLObject)list_utilities.FOUR_INTEGER, (SubLObject)list_utilities.FIVE_INTEGER, (SubLObject)list_utilities.SIX_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)list_utilities.FOUR_INTEGER)), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.FOUR_INTEGER, (SubLObject)list_utilities.FIVE_INTEGER, (SubLObject)list_utilities.SIX_INTEGER), (SubLObject)ConsesLow.list((SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.THREE_INTEGER, (SubLObject)list_utilities.FOUR_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)list_utilities.FOUR_INTEGER)), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.ZERO_INTEGER, (SubLObject)list_utilities.NINE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.THREE_INTEGER)), (SubLObject)list_utilities.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.THREE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)list_utilities.ZERO_INTEGER, (SubLObject)list_utilities.NINE_INTEGER)), (SubLObject)list_utilities.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.NINE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.THREE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER)), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.THREE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.NINE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER)), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.NINE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.THREE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)list_utilities.TWO_INTEGER)), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.THREE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.NINE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)list_utilities.TWO_INTEGER)), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.THREE_INTEGER, (SubLObject)list_utilities.NINE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.THREE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)list_utilities.THREE_INTEGER)), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.THREE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)list_utilities.THREE_INTEGER, (SubLObject)list_utilities.NINE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)list_utilities.THREE_INTEGER)), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.FOUR_INTEGER, (SubLObject)list_utilities.NINE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.THREE_INTEGER)), (SubLObject)list_utilities.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.THREE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)list_utilities.FOUR_INTEGER, (SubLObject)list_utilities.NINE_INTEGER)), (SubLObject)list_utilities.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.THREE_INTEGER, (SubLObject)list_utilities.FIVE_INTEGER, (SubLObject)list_utilities.SEVEN_INTEGER, (SubLObject)list_utilities.NINE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.THREE_INTEGER, (SubLObject)list_utilities.SIX_INTEGER, (SubLObject)list_utilities.SEVEN_INTEGER, (SubLObject)list_utilities.EIGHT_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)list_utilities.THREE_INTEGER, (SubLObject)list_utilities.SEVEN_INTEGER)), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.THREE_INTEGER, (SubLObject)list_utilities.FIVE_INTEGER, (SubLObject)list_utilities.SEVEN_INTEGER, (SubLObject)list_utilities.NINE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.THREE_INTEGER, (SubLObject)list_utilities.SIX_INTEGER, (SubLObject)list_utilities.SEVEN_INTEGER, (SubLObject)list_utilities.EIGHT_INTEGER, (SubLObject)list_utilities.NINE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)list_utilities.THREE_INTEGER, (SubLObject)list_utilities.SEVEN_INTEGER, (SubLObject)list_utilities.NINE_INTEGER)), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.THREE_INTEGER, (SubLObject)list_utilities.FIVE_INTEGER, (SubLObject)list_utilities.SEVEN_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(99)), (SubLObject)ConsesLow.list((SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.THREE_INTEGER, (SubLObject)list_utilities.SIX_INTEGER, (SubLObject)list_utilities.SEVEN_INTEGER, (SubLObject)list_utilities.EIGHT_INTEGER, (SubLObject)list_utilities.NINE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)list_utilities.THREE_INTEGER, (SubLObject)list_utilities.SEVEN_INTEGER)) });
    }
    
    public void declareFunctions() {
        declare_list_utilities_file();
    }
    
    public void initializeVariables() {
        init_list_utilities_file();
    }
    
    public void runTopLevelForms() {
        setup_list_utilities_file();
    }
    
    static {
        me = (SubLFile)new list_utilities();
        list_utilities.$magic_hashing_cutoff$ = null;
        list_utilities.$negated_test_func$ = null;
        list_utilities.$position_if_binary_lambda_func$ = null;
        list_utilities.$position_if_binary_lambda_arg2$ = null;
        list_utilities.$num_list_cached_caching_state$ = null;
        list_utilities.$listified_vector_marker$ = null;
        list_utilities.$remove_duplicates_eq_table$ = null;
        list_utilities.$remove_duplicates_eql_table$ = null;
        list_utilities.$remove_duplicates_equal_table$ = null;
        list_utilities.$remove_duplicates_equalp_table$ = null;
        list_utilities.$remove_duplicates_eq_table_lock$ = null;
        list_utilities.$remove_duplicates_eql_table_lock$ = null;
        list_utilities.$remove_duplicates_equal_table_lock$ = null;
        list_utilities.$remove_duplicates_equalp_table_lock$ = null;
        list_utilities.$plistlist_sort_indicator$ = null;
        list_utilities.$subseq_subst_recursive_answers$ = null;
        list_utilities.$sort_via_position_guide$ = null;
        list_utilities.$sort_via_position_test$ = null;
        list_utilities.$sort_via_test_function$ = null;
        list_utilities.$preferred_term_set$ = null;
        $int0$80 = SubLObjectFactory.makeInteger(80);
        $str1$nth_cycling__width_must_be_greate = SubLObjectFactory.makeString("nth-cycling: width must be greater than zero");
        $str2$nth_cycling__width_must_be_less_t = SubLObjectFactory.makeString("nth-cycling: width must be less than or equal to list length");
        $str3$nth_cycling__width_overruns_offse = SubLObjectFactory.makeString("nth-cycling: width overruns offset");
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("PLACE"));
        $sym5$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym6$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $sym7$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $sym8$CPOP = SubLObjectFactory.makeSymbol("CPOP");
        $list9 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("PLACE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym10$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list11 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ITEM"), (SubLObject)SubLObjectFactory.makeSymbol("PLACE"), (SubLObject)SubLObjectFactory.makeSymbol("MAX-LENGTH"));
        $sym12$CSETF = SubLObjectFactory.makeSymbol("CSETF");
        $sym13$CONS = SubLObjectFactory.makeSymbol("CONS");
        $sym14$FIRST_N = SubLObjectFactory.makeSymbol("FIRST-N");
        $sym15$_ = SubLObjectFactory.makeSymbol("-");
        $list16 = ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER);
        $list17 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("VAR-LIST-FORMS")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list18 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("LISTFORM"));
        $sym19$CDR = SubLObjectFactory.makeSymbol("CDR");
        $sym20$CAR = SubLObjectFactory.makeSymbol("CAR");
        $sym21$NULL = SubLObjectFactory.makeSymbol("NULL");
        $sym22$CDO = SubLObjectFactory.makeSymbol("CDO");
        $sym23$CAND = SubLObjectFactory.makeSymbol("CAND");
        $list24 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUMBER-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("VAR-LIST-FORMS")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list25 = ConsesLow.list((SubLObject)list_utilities.ZERO_INTEGER);
        $sym26$CDOLIST_MULTIPLE = SubLObjectFactory.makeSymbol("CDOLIST-MULTIPLE");
        $sym27$CINC = SubLObjectFactory.makeSymbol("CINC");
        $list28 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENDVAR"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("VAR-LIST-FORMS")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $str29$Malformed_csome_multiple_____S_wa = SubLObjectFactory.makeString("Malformed csome-multiple -- ~S was not a variable");
        $sym30$PUNLESS = SubLObjectFactory.makeSymbol("PUNLESS");
        $sym31$COR = SubLObjectFactory.makeSymbol("COR");
        $list32 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELEM-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBER-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("LISTFORM")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym33$LIST_VAR = SubLObjectFactory.makeUninternedSymbol("LIST-VAR");
        $sym34$_ = SubLObjectFactory.makeSymbol("+");
        $list35 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("LISTFORM")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym36$CDOLIST = SubLObjectFactory.makeSymbol("CDOLIST");
        $sym37$REVERSE = SubLObjectFactory.makeSymbol("REVERSE");
        $sym38$LIST_VAR = SubLObjectFactory.makeUninternedSymbol("LIST-VAR");
        $sym39$1_ = SubLObjectFactory.makeSymbol("1-");
        $sym40$LENGTH = SubLObjectFactory.makeSymbol("LENGTH");
        $list41 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELEM-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBER-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("LISTFORM"), (SubLObject)SubLObjectFactory.makeSymbol("ENDVAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym42$LIST_VAR = SubLObjectFactory.makeUninternedSymbol("LIST-VAR");
        $sym43$CDOLIST_CYCLING_COMPLEX = SubLObjectFactory.makeSymbol("CDOLIST-CYCLING-COMPLEX");
        $list44 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR-LIST-FORMS"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SECONDARY-LISTS"), (SubLObject)list_utilities.NIL)), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $str45$COUNTER = SubLObjectFactory.makeString("COUNTER");
        $str46$_orig = SubLObjectFactory.makeString("-orig");
        $str47$_cdr = SubLObjectFactory.makeString("-cdr");
        $sym48$NTH_CYCLING = SubLObjectFactory.makeSymbol("NTH-CYCLING");
        $list49 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEAF-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST-TYPE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP"))), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list50 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LIST-TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw51$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw52$LIST_TYPE = SubLObjectFactory.makeKeyword("LIST-TYPE");
        $sym53$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $kw54$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym55$SUBTREE_LIST_VAR = SubLObjectFactory.makeUninternedSymbol("SUBTREE-LIST-VAR");
        $sym56$CURRENT_SUBTREE_VAR = SubLObjectFactory.makeUninternedSymbol("CURRENT-SUBTREE-VAR");
        $sym57$NODE_VAR = SubLObjectFactory.makeUninternedSymbol("NODE-VAR");
        $sym58$LIST = SubLObjectFactory.makeSymbol("LIST");
        $sym59$DO_LIST = SubLObjectFactory.makeSymbol("DO-LIST");
        $sym60$PIF = SubLObjectFactory.makeSymbol("PIF");
        $sym61$CPUSH = SubLObjectFactory.makeSymbol("CPUSH");
        $sym62$_OPTIONAL = SubLObjectFactory.makeSymbol("&OPTIONAL");
        $sym63$SEQUENCEP = SubLObjectFactory.makeSymbol("SEQUENCEP");
        $str64$ = SubLObjectFactory.makeString("");
        $kw65$DOT_FOR_DOTTED_LIST = SubLObjectFactory.makeKeyword("DOT-FOR-DOTTED-LIST");
        $sym66$NEGATED_TEST_FUNC = SubLObjectFactory.makeSymbol("NEGATED-TEST-FUNC");
        $sym67$POSITION_IF_BINARY_LAMBDA = SubLObjectFactory.makeSymbol("POSITION-IF-BINARY-LAMBDA");
        $sym68$PROPER_LIST_P = SubLObjectFactory.makeSymbol("PROPER-LIST-P");
        $sym69$NON_DOTTED_LIST_P = SubLObjectFactory.makeSymbol("NON-DOTTED-LIST-P");
        $sym70$NON_NEGATIVE_INTEGER_P = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $kw71$DELETED = SubLObjectFactory.makeKeyword("DELETED");
        $list72 = ConsesLow.list((SubLObject)list_utilities.NIL);
        $kw73$DUMMY = SubLObjectFactory.makeKeyword("DUMMY");
        $sym74$TREE_POSITION_DFS = SubLObjectFactory.makeSymbol("TREE-POSITION-DFS");
        $sym75$TREE_POSITION_BFS = SubLObjectFactory.makeSymbol("TREE-POSITION-BFS");
        $sym76$LESSER_LENGTH_P = SubLObjectFactory.makeSymbol("LESSER-LENGTH-P");
        $list77 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE1"));
        $str78$The_lists_of_keys_and_data_are_of = SubLObjectFactory.makeString("The lists of keys and data are of unequal length.");
        $sym79$DOUBLETON_ = SubLObjectFactory.makeSymbol("DOUBLETON?");
        $list80 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("THING-ONE"), (SubLObject)SubLObjectFactory.makeSymbol("THING-TWO"));
        $str81$FIRST_OF_will_multiply_evaluate__ = SubLObjectFactory.makeString("FIRST-OF will multiply evaluate ~s");
        $sym82$FIF = SubLObjectFactory.makeSymbol("FIF");
        $sym83$FUNCTION_SPEC_P = SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P");
        $sym84$POSITIVE_INTEGER_P = SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P");
        $sym85$NREVERSE = SubLObjectFactory.makeSymbol("NREVERSE");
        $sym86$VECTORP = SubLObjectFactory.makeSymbol("VECTORP");
        $str87$_s_was_not_a_singleton = SubLObjectFactory.makeString("~s was not a singleton");
        $kw88$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym89$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $float90$0_01 = (SubLFloat)SubLObjectFactory.makeDouble(0.01);
        $sym91$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $str92$Position_is_not_valid_for_the_siz = SubLObjectFactory.makeString("Position is not valid for the size of list.");
        $sym93$NUM_LIST_CACHED = SubLObjectFactory.makeSymbol("NUM-LIST-CACHED");
        $sym94$_NUM_LIST_CACHED_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*NUM-LIST-CACHED-CACHING-STATE*");
        $int95$100 = SubLObjectFactory.makeInteger(100);
        $sym96$KBEQ = SubLObjectFactory.makeSymbol("KBEQ");
        $sym97$_ = SubLObjectFactory.makeSymbol("<");
        $sym98$__ = SubLObjectFactory.makeSymbol("<=");
        $str99$Number_of_repetitions_must_be_gre = SubLObjectFactory.makeString("Number of repetitions must be greater than 1. Got ~S");
        $kw100$FAILED = SubLObjectFactory.makeKeyword("FAILED");
        $kw101$SUCCEEDED = SubLObjectFactory.makeKeyword("SUCCEEDED");
        $kw102$UPDATED = SubLObjectFactory.makeKeyword("UPDATED");
        $sym103$TREE_SET_EQUAL_ = SubLObjectFactory.makeSymbol("TREE-SET-EQUAL?");
        $sym104$FUNCTION_SYMBOL_P = SubLObjectFactory.makeSymbol("FUNCTION-SYMBOL-P");
        $kw105$LISTIFIED_VECTOR = SubLObjectFactory.makeKeyword("LISTIFIED-VECTOR");
        $str106$_S_is_not_a_listified_vector_mark = SubLObjectFactory.makeString("~S is not a listified vector marked with ~S");
        $sym107$FLIP_CONS = SubLObjectFactory.makeSymbol("FLIP-CONS");
        $sym108$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $sym109$STRING_ = SubLObjectFactory.makeSymbol("STRING=");
        $sym110$STRING_ = SubLObjectFactory.makeSymbol("STRING<");
        $sym111$SYMBOL_NAME = SubLObjectFactory.makeSymbol("SYMBOL-NAME");
        $sym112$SAFE_SPLICE_INTO_SORTED_LIST = SubLObjectFactory.makeSymbol("SAFE-SPLICE-INTO-SORTED-LIST");
        $kw113$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw114$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw115$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw116$KB = SubLObjectFactory.makeKeyword("KB");
        $kw117$TINY = SubLObjectFactory.makeKeyword("TINY");
        $kw118$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list119 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.NIL, (SubLObject)SubLObjectFactory.makeSymbol("<")), (SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)list_utilities.TWO_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("<")), (SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.TWO_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.TWO_INTEGER, (SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("<")), (SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.TWO_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.THREE_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("<")), (SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.THREE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.TWO_INTEGER, (SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.THREE_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("<")), (SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.THREE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.THREE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.TWO_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("<")), (SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.THREE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("xxx"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("x"), (SubLObject)SubLObjectFactory.makeString("xxxx")), (SubLObject)SubLObjectFactory.makeSymbol("<"), (SubLObject)SubLObjectFactory.makeSymbol("LENGTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("x"), (SubLObject)SubLObjectFactory.makeString("xxx"), (SubLObject)SubLObjectFactory.makeString("xxxx"))));
        $sym120$_REST = SubLObjectFactory.makeSymbol("&REST");
        $list121 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"));
        $list122 = (SubLList)ConsesLow.cons((SubLObject)list_utilities.T, (SubLObject)list_utilities.T);
        $sym123$CAR_IS_EL_VAR_ = SubLObjectFactory.makeSymbol("CAR-IS-EL-VAR?");
        $str124$_s____s = SubLObjectFactory.makeString("~s = ~s");
        $list125 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("ELEMENT"), (SubLObject)SubLObjectFactory.makeSymbol("REST"));
        $kw126$TEMP = SubLObjectFactory.makeKeyword("TEMP");
        $int127$500 = SubLObjectFactory.makeInteger(500);
        $str128$remove_duplicates_eq_table_lock = SubLObjectFactory.makeString("remove-duplicates eq table lock");
        $str129$remove_duplicates_eql_table_lock = SubLObjectFactory.makeString("remove-duplicates eql table lock");
        $str130$remove_duplicates_equal_table_loc = SubLObjectFactory.makeString("remove-duplicates equal table lock");
        $str131$remove_duplicates_equalp_table_lo = SubLObjectFactory.makeString("remove-duplicates equalp table lock");
        $sym132$HASH_TABLE_P = SubLObjectFactory.makeSymbol("HASH-TABLE-P");
        $kw133$NOT_UNIQUE = SubLObjectFactory.makeKeyword("NOT-UNIQUE");
        $kw134$UNIQUE = SubLObjectFactory.makeKeyword("UNIQUE");
        $sym135$TERM__ = SubLObjectFactory.makeSymbol("TERM-<");
        $sym136$SAFE__ = SubLObjectFactory.makeSymbol("SAFE-<");
        $sym137$ALIST_P = SubLObjectFactory.makeSymbol("ALIST-P");
        $list138 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ALIST-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY-TEST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)list_utilities.EQL))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALUE-TEST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)list_utilities.EQL))));
        $list139 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)list_utilities.EQL);
        $sym140$ALIST_PUSHNEW = SubLObjectFactory.makeSymbol("ALIST-PUSHNEW");
        $list141 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ALIST-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY-TEST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)list_utilities.EQL))));
        $sym142$ALIST_PUSH = SubLObjectFactory.makeSymbol("ALIST-PUSH");
        $list143 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ALIST-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)list_utilities.EQL))));
        $sym144$ALIST_ENTER = SubLObjectFactory.makeSymbol("ALIST-ENTER");
        $list145 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $list146 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("CAR"), (SubLObject)SubLObjectFactory.makeSymbol("CDR"));
        $list147 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("SECOND"));
        $sym148$CONS_TO_TUPLE = SubLObjectFactory.makeSymbol("CONS-TO-TUPLE");
        $list149 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PLIST"), (SubLObject)SubLObjectFactory.makeSymbol("INDICATOR"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $sym150$PUTF = SubLObjectFactory.makeSymbol("PUTF");
        $list151 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PLIST"), (SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INCREMENT"), (SubLObject)list_utilities.ONE_INTEGER));
        $list152 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INCREMENT"));
        $kw153$INCREMENT = SubLObjectFactory.makeKeyword("INCREMENT");
        $sym154$PLIST_ENTER = SubLObjectFactory.makeSymbol("PLIST-ENTER");
        $sym155$PLIST_LOOKUP = SubLObjectFactory.makeSymbol("PLIST-LOOKUP");
        $list156 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PLIST"), (SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $list157 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PLIST"), (SubLObject)SubLObjectFactory.makeSymbol("INDICATOR-TO-REMOVE"));
        $sym158$PLIST_EXCEPT = SubLObjectFactory.makeSymbol("PLIST-EXCEPT");
        $sym159$PROPERTY_LIST_P = SubLObjectFactory.makeSymbol("PROPERTY-LIST-P");
        $kw160$NO_VALUE = SubLObjectFactory.makeKeyword("NO-VALUE");
        $sym161$PLISTLIST_SORT_KEY = SubLObjectFactory.makeSymbol("PLISTLIST-SORT-KEY");
        $str162$_A_and__A = SubLObjectFactory.makeString("~A and ~A");
        $sym163$PRINC_TO_STRING = SubLObjectFactory.makeSymbol("PRINC-TO-STRING");
        $str164$__ = SubLObjectFactory.makeString(", ");
        $str165$__and_ = SubLObjectFactory.makeString(", and ");
        $str166$_a_____a__ = SubLObjectFactory.makeString("~a -> ~a~%");
        $sym167$DOUBLE_FLOAT = SubLObjectFactory.makeSymbol("DOUBLE-FLOAT");
        $sym168$STR = SubLObjectFactory.makeSymbol("STR");
        $str169$_a___4_2f__ = SubLObjectFactory.makeString("~a  ~4,2f~%");
        $str170$_a___a__ = SubLObjectFactory.makeString("~a  ~a~%");
        $str171$_a___s__ = SubLObjectFactory.makeString("~a  ~s~%");
        $sym172$TO_STRING = SubLObjectFactory.makeSymbol("TO-STRING");
        $str173$___ = SubLObjectFactory.makeString(" | ");
        $list174 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBST-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("SUBST-LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("SUBST-ITEM"));
        $sym175$PLUSP = SubLObjectFactory.makeSymbol("PLUSP");
        $float176$0_5 = (SubLFloat)SubLObjectFactory.makeDouble(0.5);
        $sym177$SORT_VIA_POSITION_EARLIER = SubLObjectFactory.makeSymbol("SORT-VIA-POSITION-EARLIER");
        $sym178$SORT_VIA_TEST_EARLIER = SubLObjectFactory.makeSymbol("SORT-VIA-TEST-EARLIER");
        $sym179$_ = SubLObjectFactory.makeSymbol(">");
        $sym180$SAFE__ = SubLObjectFactory.makeSymbol("SAFE->");
        $sym181$SAFE_TREE__ = SubLObjectFactory.makeSymbol("SAFE-TREE-<");
        $sym182$SET__ = SubLObjectFactory.makeSymbol("SET-<");
        $sym183$NOT_CONSP = SubLObjectFactory.makeSymbol("NOT-CONSP");
        $sym184$LIST_STRUCTURE__ = SubLObjectFactory.makeSymbol("LIST-STRUCTURE-<");
        $sym185$FALSE = SubLObjectFactory.makeSymbol("FALSE");
        $sym186$_ = SubLObjectFactory.makeSymbol("=");
        $kw187$LESS = SubLObjectFactory.makeKeyword("LESS");
        $kw188$EQUAL = SubLObjectFactory.makeKeyword("EQUAL");
        $kw189$GREATER = SubLObjectFactory.makeKeyword("GREATER");
        $sym190$MAPCAR = SubLObjectFactory.makeSymbol("MAPCAR");
        $list191 = ConsesLow.listS((SubLObject)SubLObjectFactory.makeSymbol("ONE"), (SubLObject)SubLObjectFactory.makeSymbol("TWO"), (SubLObject)SubLObjectFactory.makeSymbol("THREE"), (SubLObject)SubLObjectFactory.makeSymbol("REST"));
        $sym192$GET_ARGLIST = SubLObjectFactory.makeSymbol("GET-ARGLIST");
        $list193 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION-SYMBOL-ARGLIST"));
        $kw194$DOCUMENTATION = SubLObjectFactory.makeKeyword("DOCUMENTATION");
        $sym195$_ = SubLObjectFactory.makeSymbol("*");
        $list196 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("LIST")), (SubLObject)SubLObjectFactory.makeSymbol("EXP"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym197$KEYWORDP = SubLObjectFactory.makeSymbol("KEYWORDP");
        $sym198$SYMBOLP = SubLObjectFactory.makeSymbol("SYMBOLP");
        $str199$Expected__S__got__S = SubLObjectFactory.makeString("Expected ~S, got ~S");
        $str200$_S_was_not_a_form_with_operator__ = SubLObjectFactory.makeString("~S was not a form with operator ~S");
        $sym201$ATOM = SubLObjectFactory.makeSymbol("ATOM");
        $sym202$ASSOC = SubLObjectFactory.makeSymbol("ASSOC");
        $sym203$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym204$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $sym205$NEW_DICTIONARY = SubLObjectFactory.makeSymbol("NEW-DICTIONARY");
        $list206 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("FIRST"), SubLObjectFactory.makeSymbol("SECOND"), SubLObjectFactory.makeSymbol("THIRD"), SubLObjectFactory.makeSymbol("FOURTH"), SubLObjectFactory.makeSymbol("FIFTH"), SubLObjectFactory.makeSymbol("SIXTH"), SubLObjectFactory.makeSymbol("SEVENTH"), SubLObjectFactory.makeSymbol("EIGHTH"), SubLObjectFactory.makeSymbol("NINTH"), SubLObjectFactory.makeSymbol("TENTH") });
        $str207$choose__S__default___ = SubLObjectFactory.makeString("choose ~S (default)~%");
        $sym208$FAST_SUPERSET_ = SubLObjectFactory.makeSymbol("FAST-SUPERSET?");
        $str209$can_t_choose__S_since_incompatibl = SubLObjectFactory.makeString("can't choose ~S since incompatible with previous skip reasons ~S~%");
        $str210$past_incompatible___S__ = SubLObjectFactory.makeString("past-incompatible: ~S~%");
        $str211$future_incompatible_choosable___S = SubLObjectFactory.makeString("future-incompatible-choosable: ~S~%");
        $str212$choose__S__not_past_incompatible_ = SubLObjectFactory.makeString("choose ~S (not past incompatible)~%");
        $str213$skip__S__past_incompatible_or_fut = SubLObjectFactory.makeString("skip ~S (past incompatible or future incompatible choosable)~%");
        $sym214$SETS_EQUAL_ = SubLObjectFactory.makeSymbol("SETS-EQUAL?");
        $sym215$TEST_COMPUTE_ALL_COMPATIBLE_SUBLISTS = SubLObjectFactory.makeSymbol("TEST-COMPUTE-ALL-COMPATIBLE-SUBLISTS");
        $kw216$BOTH = SubLObjectFactory.makeKeyword("BOTH");
        $list217 = _constant_217_initializer();
        $list218 = ConsesLow.list((SubLObject)Characters.CHAR_newline);
        $str219$Invalid_graph_txt_specification_r = SubLObjectFactory.makeString("Invalid graph.txt specification row ~S needs ~A elems");
        $str220$1 = SubLObjectFactory.makeString("1");
        $str221$Expected___S__ = SubLObjectFactory.makeString("Expected: ~S~%");
        $str222$Got___ = SubLObjectFactory.makeString("Got:~%");
        $str223$___S__ = SubLObjectFactory.makeString("  ~S~%");
        $sym224$TEST_FIND_MAXIMUM_INDEPENDENT_SET = SubLObjectFactory.makeSymbol("TEST-FIND-MAXIMUM-INDEPENDENT-SET");
        $list225 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("0 1 1 1 \n1 0 1 1 \n1 1 0 1 \n1 1 1 0"), (SubLObject)list_utilities.ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.TWO_INTEGER))), (SubLObject)list_utilities.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("0 0 0 1 1 1  \n0 0 0 1 1 1  \n0 0 0 1 1 1  \n1 1 1 0 0 0  \n1 1 1 0 0 0  \n1 1 1 0 0 0"), (SubLObject)list_utilities.THREE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.THREE_INTEGER))), (SubLObject)list_utilities.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("0 1 1 0 1 1 \n1 0 1 1 0 1 \n1 1 0 1 1 0 \n0 1 1 0 1 1 \n1 0 1 1 0 1 \n1 1 0 1 1 0"), (SubLObject)list_utilities.TWO_INTEGER, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.FOUR_INTEGER))), (SubLObject)list_utilities.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("0 1 1 0 1 1 0  \n1 0 1 1 0 1 0  \n1 1 0 1 1 0 0  \n0 1 1 0 0 0 1  \n1 0 1 0 0 0 1  \n1 1 0 0 0 0 1  \n0 0 0 1 1 1 0"), (SubLObject)list_utilities.THREE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.FOUR_INTEGER, (SubLObject)list_utilities.FIVE_INTEGER, (SubLObject)list_utilities.SIX_INTEGER))), (SubLObject)list_utilities.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("0 1 0 0 0 0 1 1  \n1 0 1 0 0 0 0 1 \n0 1 0 1 0 0 0 1  \n0 0 1 0 1 0 0 1  \n0 0 0 1 0 1 0 1  \n0 0 0 0 1 0 1 1  \n1 0 0 0 0 1 0 1  \n1 1 1 1 1 1 1 0"), (SubLObject)list_utilities.THREE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.FOUR_INTEGER, (SubLObject)list_utilities.SIX_INTEGER))), (SubLObject)list_utilities.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("0 1 0 1 0 1 0 0 \n1 0 1 0 0 0 1 0 \n0 1 0 1 0 0 0 1 \n1 0 1 0 1 0 0 0 \n0 0 0 1 0 1 0 1 \n1 0 0 0 1 0 1 0 \n0 1 0 0 0 1 0 1 \n0 0 1 0 1 0 1 0"), (SubLObject)list_utilities.FOUR_INTEGER, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.THREE_INTEGER, (SubLObject)list_utilities.FIVE_INTEGER, (SubLObject)list_utilities.SEVEN_INTEGER))), (SubLObject)list_utilities.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("0 1 0 0 1 0 1 0 0 0  \n1 0 1 0 0 0 0 1 0 0  \n0 1 0 1 0 0 0 0 1 0  \n0 0 1 0 1 0 0 0 0 1  \n1 0 0 1 0 1 0 0 0 0  \n0 0 0 0 1 0 0 1 1 0  \n1 0 0 0 0 0 0 0 1 1  \n0 1 0 0 0 1 0 0 0 1  \n0 0 1 0 0 1 1 0 0 0  \n0 0 0 1 0 0 1 1 0 0"), (SubLObject)list_utilities.FOUR_INTEGER, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.THREE_INTEGER, (SubLObject)list_utilities.SIX_INTEGER, (SubLObject)list_utilities.TEN_INTEGER))), (SubLObject)list_utilities.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("0 0 1 1 1 1 0 1 1 1 1  \n0 0 1 1 1 1 0 1 1 1 1  \n1 1 0 1 0 0 1 0 0 0 0  \n1 1 1 0 0 0 1 0 0 0 0  \n1 1 0 0 0 1 1 0 0 0 0  \n1 1 0 0 1 0 1 0 0 0 0  \n0 0 1 1 1 1 0 1 1 1 1  \n1 1 0 0 0 0 1 0 1 0 0  \n1 1 0 0 0 0 1 1 0 0 0  \n1 1 0 0 0 0 1 0 0 0 1  \n1 1 0 0 0 0 1 0 0 1 0"), (SubLObject)list_utilities.FOUR_INTEGER, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.THREE_INTEGER, (SubLObject)list_utilities.SIX_INTEGER, (SubLObject)list_utilities.EIGHT_INTEGER, (SubLObject)list_utilities.ELEVEN_INTEGER), (SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.SEVEN_INTEGER))), (SubLObject)list_utilities.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("0 1 1 1 1 1 0 0 0 0 0  \n1 0 0 0 0 0 1 0 1 0 0  \n1 0 0 0 0 0 0 1 0 1 0  \n1 0 0 0 0 0 0 0 1 0 1  \n1 0 0 0 0 0 1 0 0 1 0  \n1 0 0 0 0 0 0 1 0 0 1  \n0 1 0 0 1 0 0 1 0 0 1  \n0 0 1 0 0 1 1 0 1 0 0  \n0 1 0 1 0 0 0 1 0 1 0  \n0 0 1 0 1 0 0 0 1 0 1 \n0 0 0 1 0 1 1 0 0 1 0"), (SubLObject)list_utilities.FIVE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.THREE_INTEGER, (SubLObject)list_utilities.FOUR_INTEGER, (SubLObject)list_utilities.FIVE_INTEGER, (SubLObject)list_utilities.SIX_INTEGER))), (SubLObject)list_utilities.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("0 1 0 1 1 0 1 0 0 0 0  \n1 0 1 0 0 0 0 1 0 0 0  \n0 1 0 1 0 0 0 0 1 0 0  \n1 0 1 0 0 0 0 0 0 1 0  \n1 0 0 0 0 1 0 0 0 1 0  \n0 0 0 0 1 0 1 0 0 0 1  \n1 0 0 0 0 1 0 1 0 0 0  \n0 1 0 0 0 0 1 0 1 0 1  \n0 0 1 0 0 0 0 1 0 1 0  \n0 0 0 1 1 0 0 0 1 0 1  \n0 0 0 0 0 1 0 1 0 1 0"), (SubLObject)list_utilities.SIX_INTEGER, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.FOUR_INTEGER, (SubLObject)list_utilities.FIVE_INTEGER, (SubLObject)list_utilities.SEVEN_INTEGER, (SubLObject)list_utilities.NINE_INTEGER, (SubLObject)list_utilities.ELEVEN_INTEGER), (SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.THREE_INTEGER, (SubLObject)list_utilities.SIX_INTEGER, (SubLObject)list_utilities.EIGHT_INTEGER, (SubLObject)list_utilities.TEN_INTEGER))), (SubLObject)list_utilities.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("0 1 1 0 0 1 1 1 0 0 0 0 \n 1 0 1 1 1 1 0 0 0 0 0 0 \n 1 1 0 1 0 0 0 1 1 0 0 0 \n 0 1 1 0 1 0 0 0 1 1 0 0 \n 0 1 0 1 0 1 0 0 0 1 1 0 \n 1 1 0 0 1 0 1 0 0 0 1 0 \n 1 0 0 0 0 1 0 1 0 0 1 1 \n 1 0 1 0 0 0 1 0 1 0 0 1 \n 0 0 1 1 0 0 0 1 0 1 0 1 \n 0 0 0 1 1 0 0 0 1 0 1 1 \n 0 0 0 0 1 1 1 0 0 1 0 1 \n 0 0 0 0 0 0 1 1 1 1 1 0"), (SubLObject)list_utilities.THREE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.FOUR_INTEGER, (SubLObject)list_utilities.EIGHT_INTEGER, (SubLObject)list_utilities.ELEVEN_INTEGER))), (SubLObject)list_utilities.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("0 0 0 1 0 0 0 1 0 0 0 1 0 0  \n0 0 1 0 0 0 1 0 0 0 1 0 0 0  \n0 1 0 1 0 0 0 0 0 0 0 0 0 1 \n1 0 1 0 1 0 0 0 0 0 0 0 0 0  \n0 0 0 1 0 1 0 0 0 1 0 0 0 0  \n0 0 0 0 1 0 1 0 0 0 0 0 1 0  \n0 1 0 0 0 1 0 1 0 0 0 0 0 0  \n1 0 0 0 0 0 1 0 1 0 0 0 0 0 \n0 0 0 0 0 0 0 1 0 1 0 0 0 1  \n0 0 0 0 1 0 0 0 1 0 1 0 0 0  \n0 1 0 0 0 0 0 0 0 1 0 1 0 0  \n1 0 0 0 0 0 0 0 0 0 1 0 1 0  \n0 0 0 0 0 1 0 0 0 0 0 1 0 1  \n0 0 1 0 0 0 0 0 1 0 0 0 1 0"), (SubLObject)list_utilities.SEVEN_INTEGER, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.THREE_INTEGER, (SubLObject)list_utilities.FIVE_INTEGER, (SubLObject)list_utilities.SEVEN_INTEGER, (SubLObject)list_utilities.NINE_INTEGER, (SubLObject)list_utilities.ELEVEN_INTEGER, (SubLObject)list_utilities.THIRTEEN_INTEGER))), (SubLObject)list_utilities.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("0 0 0 0 0 1 0 0 0 0 0 0 1 0 0 0  \n0 0 0 0 0 0 1 0 0 1 0 0 0 0 0 0  \n0 0 0 0 0 1 0 0 0 0 0 0 1 0 0 0  \n0 0 0 0 0 0 0 0 0 0 1 0 0 0 0 0  \n0 0 0 0 0 0 0 1 0 0 0 0 0 0 0 0  \n1 0 1 0 0 0 0 0 0 0 1 0 0 0 0 0  \n0 1 0 0 0 0 0 0 1 0 0 0 0 0 0 0  \n0 0 0 0 1 0 0 0 0 0 0 1 0 1 0 0  \n0 0 0 0 0 0 1 0 0 0 0 0 0 0 1 0  \n0 1 0 0 0 0 0 0 0 0 0 0 0 0 1 0  \n0 0 0 1 0 1 0 0 0 0 0 0 0 0 0 0  \n0 0 0 0 0 0 0 1 0 0 0 0 0 0 0 0  \n1 0 1 0 0 0 0 0 0 0 0 0 0 0 0 0  \n0 0 0 0 0 0 0 1 0 0 0 0 0 0 0 0  \n0 0 0 0 0 0 0 0 1 1 0 0 0 0 0 1  \n0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 "), (SubLObject)list_utilities.NINE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { list_utilities.ONE_INTEGER, list_utilities.THREE_INTEGER, list_utilities.FOUR_INTEGER, list_utilities.FIVE_INTEGER, list_utilities.NINE_INTEGER, list_utilities.TEN_INTEGER, list_utilities.TWELVE_INTEGER, list_utilities.FOURTEEN_INTEGER, list_utilities.SIXTEEN_INTEGER }))), (SubLObject)list_utilities.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("0 1 1 0 1 0 0 0 1 1 0 0 0 1 0 1 1  \n1 0 1 1 0 1 0 0 0 1 1 0 0 0 1 0 1  \n1 1 0 1 1 0 1 0 0 0 1 1 0 0 0 1 0  \n0 1 1 0 1 1 0 1 0 0 0 1 1 0 0 0 1  \n1 0 1 1 0 1 1 0 1 0 0 0 1 1 0 0 0  \n0 1 0 1 1 0 1 1 0 1 0 0 0 1 1 0 0  \n0 0 1 0 1 1 0 1 1 0 1 0 0 0 1 1 0  \n0 0 0 1 0 1 1 0 1 1 0 1 0 0 0 1 1  \n1 0 0 0 1 0 1 1 0 1 1 0 1 0 0 0 1  \n1 1 0 0 0 1 0 1 1 0 1 1 0 1 0 0 0  \n0 1 1 0 0 0 1 0 1 1 0 1 1 0 1 0 0  \n0 0 1 1 0 0 0 1 0 1 1 0 1 1 0 1 0  \n0 0 0 1 1 0 0 0 1 0 1 1 0 1 1 0 1  \n1 0 0 0 1 1 0 0 0 1 0 1 1 0 1 1 0  \n0 1 0 0 0 1 1 0 0 0 1 0 1 1 0 1 1  \n1 0 1 0 0 0 1 1 0 0 0 1 0 1 1 0 1  \n1 1 0 1 0 0 0 1 1 0 0 0 1 0 1 1 0"), (SubLObject)list_utilities.THREE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.ELEVEN_INTEGER, (SubLObject)list_utilities.FOURTEEN_INTEGER, (SubLObject)list_utilities.SEVENTEEN_INTEGER))), (SubLObject)list_utilities.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("0 0 0 0 0 0 0 0 0 0 1 0 1 0 0 0 0 0 1 1  \n0 0 0 0 0 0 0 0 0 0 0 1 0 1 0 0 0 1 1 0  \n0 0 0 0 0 0 0 0 0 0 0 0 1 0 1 0 1 1 0 0  \n0 0 0 0 0 0 0 0 0 0 1 0 0 1 0 1 1 0 0 0  \n0 0 0 0 0 0 0 0 0 0 0 1 0 0 1 1 0 0 0 1  \n0 0 0 0 0 0 0 0 0 0 0 1 0 0 1 1 0 0 0 1  \n0 0 0 0 0 0 0 0 0 0 1 0 0 1 0 1 1 0 0 0  \n0 0 0 0 0 0 0 0 0 0 0 0 1 0 1 0 1 1 0 0  \n0 0 0 0 0 0 0 0 0 0 0 1 0 1 0 0 0 1 1 0  \n0 0 0 0 0 0 0 0 0 0 1 0 1 0 0 0 0 0 1 1  \n1 0 0 1 0 0 1 0 0 1 0 0 0 0 0 0 0 0 0 0  \n0 1 0 0 1 1 0 0 1 0 0 0 0 0 0 0 0 0 0 0  \n1 0 1 0 0 0 0 1 0 1 0 0 0 0 0 0 0 0 0 0  \n0 1 0 1 0 0 1 0 1 0 0 0 0 0 0 0 0 0 0 0  \n0 0 1 0 1 1 0 1 0 0 0 0 0 0 0 0 0 0 0 0  \n0 0 0 1 1 1 1 0 0 0 0 0 0 0 0 0 0 0 0 0 \n0 0 1 1 0 0 1 1 0 0 0 0 0 0 0 0 0 0 0 0  \n0 1 1 0 0 0 0 1 1 0 0 0 0 0 0 0 0 0 0 0  \n1 1 0 0 0 0 0 0 1 1 0 0 0 0 0 0 0 0 0 0  \n1 0 0 0 1 1 0 0 0 1 0 0 0 0 0 0 0 0 0 0"), (SubLObject)list_utilities.TEN_INTEGER, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { list_utilities.ONE_INTEGER, list_utilities.TWO_INTEGER, list_utilities.THREE_INTEGER, list_utilities.FOUR_INTEGER, list_utilities.FIVE_INTEGER, list_utilities.SIX_INTEGER, list_utilities.SEVEN_INTEGER, list_utilities.EIGHT_INTEGER, list_utilities.NINE_INTEGER, list_utilities.TEN_INTEGER }))), (SubLObject)list_utilities.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("0 1 0 0 1 0 0 0 0 0 0 0 0 1 0 0 0 0 0 0 \n1 0 1 0 0 0 0 0 0 0 0 1 0 0 0 0 0 0 0 0 \n0 1 0 1 0 0 0 0 0 1 0 0 0 0 0 0 0 0 0 0 \n0 0 1 0 1 0 0 1 0 0 0 0 0 0 0 0 0 0 0 0 \n1 0 0 1 0 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 \n0 0 0 0 1 0 1 0 0 0 0 0 0 0 1 0 0 0 0 0 \n0 0 0 0 0 1 0 1 0 0 0 0 0 0 0 0 1 0 0 0 \n0 0 0 1 0 0 1 0 1 0 0 0 0 0 0 0 0 0 0 0 \n0 0 0 0 0 0 0 1 0 1 0 0 0 0 0 0 0 1 0 0 \n0 0 1 0 0 0 0 0 1 0 1 0 0 0 0 0 0 0 0 0 \n0 0 0 0 0 0 0 0 0 1 0 1 0 0 0 0 0 0 1 0 \n0 1 0 0 0 0 0 0 0 0 1 0 1 0 0 0 0 0 0 0 \n0 0 0 0 0 0 0 0 0 0 0 1 0 1 0 0 0 0 0 1 \n1 0 0 0 0 0 0 0 0 0 0 0 1 0 1 0 0 0 0 0 \n0 0 0 0 0 1 0 0 0 0 0 0 0 1 0 1 0 0 0 0 \n0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 1 0 0 1 \n0 0 0 0 0 0 1 0 0 0 0 0 0 0 0 1 0 1 0 0 \n0 0 0 0 0 0 0 0 1 0 0 0 0 0 0 0 1 0 1 0 \n0 0 0 0 0 0 0 0 0 0 1 0 0 0 0 0 0 1 0 1 \n0 0 0 0 0 0 0 0 0 0 0 0 1 0 0 1 0 0 1 0"), (SubLObject)list_utilities.EIGHT_INTEGER, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.THREE_INTEGER, (SubLObject)list_utilities.SIX_INTEGER, (SubLObject)list_utilities.EIGHT_INTEGER, (SubLObject)list_utilities.ELEVEN_INTEGER, (SubLObject)list_utilities.THIRTEEN_INTEGER, (SubLObject)list_utilities.SIXTEEN_INTEGER, (SubLObject)list_utilities.EIGHTEEN_INTEGER))), (SubLObject)list_utilities.T) });
        $sym226$COMPARATOR_COMPARE = SubLObjectFactory.makeSymbol("COMPARATOR-COMPARE");
        $sym227$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $sym228$A_PREFERRED_OVER_B = SubLObjectFactory.makeSymbol("A-PREFERRED-OVER-B");
        $str229$__The_implementer_must_ensure_tha = SubLObjectFactory.makeString("~&The implementer must ensure that sgn(compare(x, y)) == -sgn(compare(y, x)) for all x and y, but for\n x=~S\n y=~S\ncompare(x, y)==~S ;; (comparator-compare '~A ~S ~S)\ncompare(y, x)==~S ;; (comparator-compare '~A ~S ~S)");
        $str230$__The_implementer_must_ensure_tha = SubLObjectFactory.makeString("~&The implementer must ensure that the relation is transitive: ((compare(x, y)>0) && (compare(y, z)>0)) implies compare(x, z)>0, but for\n x=~S\n y=~S\n z=~S\ncompare(x, y)==~S ;; (comparator-compare '~A ~S ~S)\ncompare(y, z)==~S ;; (comparator-compare '~A ~S ~S)\ncompare(x, z)==~S ;; (comparator-compare '~A ~S ~S)~%");
        $str231$__The_implementer_must_ensure_tha = SubLObjectFactory.makeString("~&The implementer must ensure that compare(x, y)==0 implies that sgn(compare(x, z))==sgn(compare(y, z)) for all z, but for:\n x=~S\n y=~S\n z=~S\ncompare(x, y)==~S ;; (comparator-compare '~A ~S ~S)\ncompare(x, z)==~S ;; (comparator-compare '~A ~S ~S)\n which is not equal to \ncompare(y, z)==~S ;; (comparator-compare '~A ~S ~S)~%");
        $sym232$NINTERSECT_SORTED = SubLObjectFactory.makeSymbol("NINTERSECT-SORTED");
        $list233 = _constant_233_initializer();
        $sym234$REMOVE_SUBSUMED_ITEMS = SubLObjectFactory.makeSymbol("REMOVE-SUBSUMED-ITEMS");
        $list235 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("foo"), (SubLObject)SubLObjectFactory.makeString("food"), (SubLObject)SubLObjectFactory.makeString("bar")), (SubLObject)SubLObjectFactory.makeSymbol("SUBSTRING?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("foo"), (SubLObject)SubLObjectFactory.makeString("bar"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("foo"), (SubLObject)SubLObjectFactory.makeString("food"), (SubLObject)SubLObjectFactory.makeString("bart"), (SubLObject)SubLObjectFactory.makeString("bar")), (SubLObject)SubLObjectFactory.makeSymbol("SUBSTRING?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("foo"), (SubLObject)SubLObjectFactory.makeString("bar"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("bar")), (SubLObject)SubLObjectFactory.makeSymbol("SUBSTRING?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("bar"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.NIL, (SubLObject)SubLObjectFactory.makeSymbol("SUBSTRING?")), (SubLObject)list_utilities.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.ONE_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("<=")), (SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.ONE_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("<=")), (SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.ONE_INTEGER)));
        $sym236$REMOVE_NTH = SubLObjectFactory.makeSymbol("REMOVE-NTH");
        $list237 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.ZERO_INTEGER, (SubLObject)ConsesLow.list((SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.ONE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.ZERO_INTEGER, (SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER)), (SubLObject)list_utilities.NIL));
        $sym238$FIND_FIRST_AND_NREPLACE_TEST = SubLObjectFactory.makeSymbol("FIND-FIRST-AND-NREPLACE-TEST");
        $list239 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.TWO_INTEGER, (SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.ONE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.ONE_INTEGER)));
        $sym240$REMOVE_NESTED_NTH = SubLObjectFactory.makeSymbol("REMOVE-NESTED-NTH");
        $list241 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.ONE_INTEGER), (SubLObject)list_utilities.THREE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)list_utilities.ZERO_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.ONE_INTEGER), (SubLObject)list_utilities.THREE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.ONE_INTEGER), (SubLObject)list_utilities.THREE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.ZERO_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER), (SubLObject)list_utilities.THREE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.ONE_INTEGER), (SubLObject)list_utilities.THREE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.ONE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)list_utilities.TWO_INTEGER), (SubLObject)list_utilities.THREE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.THREE_INTEGER, (SubLObject)list_utilities.ONE_INTEGER), (SubLObject)list_utilities.THREE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.ONE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.ONE_INTEGER), (SubLObject)list_utilities.THREE_INTEGER)));
        $sym242$POSITION_FROM_END = SubLObjectFactory.makeSymbol("POSITION-FROM-END");
        $list243 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)Characters.CHAR_a, (SubLObject)SubLObjectFactory.makeString("abc")), (SubLObject)list_utilities.ZERO_INTEGER), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)Characters.CHAR_a, (SubLObject)SubLObjectFactory.makeString("bcd")), (SubLObject)list_utilities.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)Characters.CHAR_a, (SubLObject)SubLObjectFactory.makeString("aba")), (SubLObject)list_utilities.TWO_INTEGER), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("A"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("A"), (SubLObject)SubLObjectFactory.makeSymbol("B"), (SubLObject)SubLObjectFactory.makeSymbol("A"))), (SubLObject)list_utilities.TWO_INTEGER), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("A"), Vectors.vector(new SubLObject[] { SubLObjectFactory.makeSymbol("A"), SubLObjectFactory.makeSymbol("B"), SubLObjectFactory.makeSymbol("A") })), (SubLObject)list_utilities.TWO_INTEGER), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)Characters.CHAR_a, (SubLObject)SubLObjectFactory.makeString("abA"), (SubLObject)list_utilities.EQL), (SubLObject)list_utilities.ZERO_INTEGER), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)Characters.CHAR_a, (SubLObject)SubLObjectFactory.makeString("abA"), (SubLObject)list_utilities.EQUALP), (SubLObject)list_utilities.TWO_INTEGER), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)Characters.CHAR_a, (SubLObject)SubLObjectFactory.makeString("abA"), (SubLObject)list_utilities.EQUALP, (SubLObject)list_utilities.IDENTITY, (SubLObject)list_utilities.ONE_INTEGER), (SubLObject)list_utilities.ONE_INTEGER), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)Characters.CHAR_a, (SubLObject)SubLObjectFactory.makeString("abA"), (SubLObject)list_utilities.EQUALP, (SubLObject)list_utilities.IDENTITY, (SubLObject)list_utilities.ZERO_INTEGER, (SubLObject)list_utilities.ONE_INTEGER), (SubLObject)list_utilities.ZERO_INTEGER) });
        $sym244$FIND_AND_REPLACE = SubLObjectFactory.makeSymbol("FIND-AND-REPLACE");
        $list245 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.TWO_INTEGER, (SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.THREE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.THREE_INTEGER)));
        $sym246$FIRST_N_IF = SubLObjectFactory.makeSymbol("FIRST-N-IF");
        $list247 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.THREE_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("NUMBERP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("A"), (SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("B"), (SubLObject)list_utilities.THREE_INTEGER, (SubLObject)list_utilities.FOUR_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("C"))), (SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.THREE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.NINE_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("SYMBOLP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("A"), (SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("B"), (SubLObject)list_utilities.THREE_INTEGER, (SubLObject)list_utilities.FOUR_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("C"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("A"), (SubLObject)SubLObjectFactory.makeSymbol("B"), (SubLObject)SubLObjectFactory.makeSymbol("C"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("SYMBOLP"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("A"), (SubLObject)list_utilities.THREE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("B"), (SubLObject)SubLObjectFactory.makeSymbol("C")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("D"), (SubLObject)list_utilities.FOUR_INTEGER), (SubLObject)ConsesLow.list((SubLObject)list_utilities.FIVE_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("E"))), (SubLObject)SubLObjectFactory.makeSymbol("FIRST")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("A"), (SubLObject)list_utilities.THREE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("B"), (SubLObject)SubLObjectFactory.makeSymbol("C")))));
        $sym248$TREE_POSITION_IF_BFS = SubLObjectFactory.makeSymbol("TREE-POSITION-IF-BFS");
        $list249 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TREE-POSITION-TEST-CASE-TABLES"));
        $list250 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRIME-NUMBER?"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.ZERO_INTEGER, (SubLObject)list_utilities.ZERO_INTEGER, (SubLObject)ConsesLow.list((SubLObject)list_utilities.ZERO_INTEGER, (SubLObject)list_utilities.SEVEN_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)list_utilities.THREE_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.ZERO_INTEGER)));
        $sym251$TREE_POSITION_IF_DFS = SubLObjectFactory.makeSymbol("TREE-POSITION-IF-DFS");
        $list252 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRIME-NUMBER?"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.ZERO_INTEGER, (SubLObject)list_utilities.ZERO_INTEGER, (SubLObject)ConsesLow.list((SubLObject)list_utilities.ZERO_INTEGER, (SubLObject)list_utilities.SEVEN_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)list_utilities.THREE_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)list_utilities.ZERO_INTEGER, (SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.ONE_INTEGER)));
        $sym253$ARG_POSITIONS_DFS = SubLObjectFactory.makeSymbol("ARG-POSITIONS-DFS");
        $list254 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.TWO_INTEGER, (SubLObject)ConsesLow.list((SubLObject)list_utilities.TWO_INTEGER), (SubLObject)list_utilities.EQUAL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.ZERO_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)list_utilities.TWO_INTEGER), (SubLObject)list_utilities.EQUAL), (SubLObject)ConsesLow.list((SubLObject)list_utilities.NIL)));
        $sym255$ARG_POSITIONS_BFS = SubLObjectFactory.makeSymbol("ARG-POSITIONS-BFS");
        $sym256$RANK_TUPLES = SubLObjectFactory.makeSymbol("RANK-TUPLES");
        $list257 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.THREE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)list_utilities.THREE_INTEGER, (SubLObject)list_utilities.FOUR_INTEGER, (SubLObject)list_utilities.FIVE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.THREE_INTEGER, (SubLObject)list_utilities.ONE_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.ZERO_INTEGER, (SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.ZERO_INTEGER, (SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.THREE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.THREE_INTEGER, (SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.FOUR_INTEGER, (SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.FIVE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.TWO_INTEGER, (SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.THREE_INTEGER, (SubLObject)list_utilities.ZERO_INTEGER, (SubLObject)list_utilities.ONE_INTEGER))));
        $sym258$NMEMBER_ = SubLObjectFactory.makeSymbol("NMEMBER?");
        $list259 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("C"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("A"), (SubLObject)SubLObjectFactory.makeSymbol("B"), (SubLObject)SubLObjectFactory.makeSymbol("C"))), (SubLObject)list_utilities.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("B"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("A"), (SubLObject)SubLObjectFactory.makeSymbol("B"), (SubLObject)SubLObjectFactory.makeSymbol("C"))), (SubLObject)list_utilities.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("A"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("A"), (SubLObject)SubLObjectFactory.makeSymbol("B"), (SubLObject)SubLObjectFactory.makeSymbol("C"))), (SubLObject)list_utilities.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("Z"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("A"), (SubLObject)SubLObjectFactory.makeSymbol("B"), (SubLObject)SubLObjectFactory.makeSymbol("C"))), (SubLObject)list_utilities.NIL));
        $sym260$ALIST_NLOOKUP_WITHOUT_VALUES = SubLObjectFactory.makeSymbol("ALIST-NLOOKUP-WITHOUT-VALUES");
        $list261 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("A")), (SubLObject)ConsesLow.cons((SubLObject)list_utilities.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("B")), (SubLObject)ConsesLow.cons((SubLObject)list_utilities.THREE_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("C"))), (SubLObject)list_utilities.THREE_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("C")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("A")), (SubLObject)ConsesLow.cons((SubLObject)list_utilities.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("B")), (SubLObject)ConsesLow.cons((SubLObject)list_utilities.THREE_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("C"))), (SubLObject)list_utilities.TWO_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("B")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("A")), (SubLObject)ConsesLow.cons((SubLObject)list_utilities.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("B")), (SubLObject)ConsesLow.cons((SubLObject)list_utilities.THREE_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("C"))), (SubLObject)list_utilities.ONE_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("A")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("A")), (SubLObject)ConsesLow.cons((SubLObject)list_utilities.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("B")), (SubLObject)ConsesLow.cons((SubLObject)list_utilities.THREE_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("C"))), (SubLObject)list_utilities.ZERO_INTEGER), (SubLObject)list_utilities.NIL));
        $sym262$EXACTLY_ONE_DISTINCT_MEMBER_ = SubLObjectFactory.makeSymbol("EXACTLY-ONE-DISTINCT-MEMBER?");
        $list263 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.NIL), (SubLObject)list_utilities.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER)), (SubLObject)list_utilities.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.ONE_INTEGER)), (SubLObject)list_utilities.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.ONE_INTEGER)), (SubLObject)list_utilities.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.ONE_INTEGER, (SubLObject)list_utilities.TWO_INTEGER)), (SubLObject)list_utilities.NIL));
        $sym264$SORT_PREFERRED_LIST_TO_FRONT = SubLObjectFactory.makeSymbol("SORT-PREFERRED-LIST-TO-FRONT");
        $list265 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("A"), (SubLObject)SubLObjectFactory.makeSymbol("B"), (SubLObject)SubLObjectFactory.makeSymbol("C")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("C"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("C"), (SubLObject)SubLObjectFactory.makeSymbol("A"), (SubLObject)SubLObjectFactory.makeSymbol("B"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("A"), (SubLObject)SubLObjectFactory.makeSymbol("B")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("C"), (SubLObject)SubLObjectFactory.makeSymbol("D")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("E"), (SubLObject)SubLObjectFactory.makeSymbol("F"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("E")), (SubLObject)SubLObjectFactory.makeSymbol("FIRST")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("E"), (SubLObject)SubLObjectFactory.makeSymbol("F")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("A"), (SubLObject)SubLObjectFactory.makeSymbol("B")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("C"), (SubLObject)SubLObjectFactory.makeSymbol("D")))));
        $str266$List_Utilities_Module_Supercatego = SubLObjectFactory.makeString("List Utilities Module Supercategory");
        $str267$Utility_Subcategory = SubLObjectFactory.makeString("Utility Subcategory");
        $str268$nadd_to_end_Testing_Suite = SubLObjectFactory.makeString("nadd-to-end Testing Suite");
        $str269$last1_Testing_Suite = SubLObjectFactory.makeString("last1 Testing Suite");
    }
    
    public static final class $cadar$UnaryFunction extends UnaryFunction
    {
        public $cadar$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CADAR"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return list_utilities.cadar(arg1);
        }
    }
    
    public static final class $dotted_list_p$UnaryFunction extends UnaryFunction
    {
        public $dotted_list_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("DOTTED-LIST-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return list_utilities.dotted_list_p(arg1);
        }
    }
    
    public static final class $negated_test_func$UnaryFunction extends UnaryFunction
    {
        public $negated_test_func$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("NEGATED-TEST-FUNC"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return list_utilities.negated_test_func(arg1);
        }
    }
    
    public static final class $flip_cons$UnaryFunction extends UnaryFunction
    {
        public $flip_cons$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("FLIP-CONS"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return list_utilities.flip_cons(arg1);
        }
    }
    
    public static final class $quotify$UnaryFunction extends UnaryFunction
    {
        public $quotify$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("QUOTIFY"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return list_utilities.quotify(arg1);
        }
    }
    
    public static final class $sort_via_position_earlier$BinaryFunction extends BinaryFunction
    {
        public $sort_via_position_earlier$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SORT-VIA-POSITION-EARLIER"));
        }
        
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return list_utilities.sort_via_position_earlier(arg1, arg2);
        }
    }
}

/*

	Total time: 4417 ms
	
*/