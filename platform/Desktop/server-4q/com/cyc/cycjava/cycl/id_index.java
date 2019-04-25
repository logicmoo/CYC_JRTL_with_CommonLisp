package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class id_index extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.id_index";
    public static final String myFingerPrint = "2852b7796a403c18d7c80755e03d94b38080a4e917900ed85e350aa194835e0f";
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 1888L)
    public static SubLSymbol $dtp_id_index$;
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 5140L)
    private static SubLSymbol $id_index_default_scaling_factor$;
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 5308L)
    private static SubLSymbol $id_index_equality_test$;
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 7696L)
    private static SubLSymbol $id_index_empty_list$;
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 32566L)
    private static SubLSymbol $cfasl_wide_opcode_id_index$;
    private static final SubLSymbol $sym0$ID_INDEX;
    private static final SubLSymbol $sym1$ID_INDEX_P;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$PRINT_ID_INDEX;
    private static final SubLSymbol $sym7$ID_INDEX_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$IDIX_LOCK;
    private static final SubLSymbol $sym10$_CSETF_IDIX_LOCK;
    private static final SubLSymbol $sym11$IDIX_COUNT;
    private static final SubLSymbol $sym12$_CSETF_IDIX_COUNT;
    private static final SubLSymbol $sym13$IDIX_NEXT_ID;
    private static final SubLSymbol $sym14$_CSETF_IDIX_NEXT_ID;
    private static final SubLSymbol $sym15$IDIX_DENSE_OBJECTS;
    private static final SubLSymbol $sym16$_CSETF_IDIX_DENSE_OBJECTS;
    private static final SubLSymbol $sym17$IDIX_SPARSE_OBJECTS;
    private static final SubLSymbol $sym18$_CSETF_IDIX_SPARSE_OBJECTS;
    private static final SubLSymbol $kw19$LOCK;
    private static final SubLSymbol $kw20$COUNT;
    private static final SubLSymbol $kw21$NEXT_ID;
    private static final SubLSymbol $kw22$DENSE_OBJECTS;
    private static final SubLSymbol $kw23$SPARSE_OBJECTS;
    private static final SubLString $str24$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw25$BEGIN;
    private static final SubLSymbol $sym26$MAKE_ID_INDEX;
    private static final SubLSymbol $kw27$SLOT;
    private static final SubLSymbol $kw28$END;
    private static final SubLSymbol $sym29$VISIT_DEFSTRUCT_OBJECT_ID_INDEX_METHOD;
    private static final SubLString $str30$COUNT_;
    private static final SubLString $str31$_NEXT_;
    private static final SubLSymbol $sym32$INTEGERP;
    private static final SubLString $str33$_A_has_had_next_id_reduced_from__;
    private static final SubLSymbol $sym34$ID_INDEX_DENSE_OBJECTS;
    private static final SubLSymbol $sym35$DO_ID_INDEX_DENSE_OBJECTS;
    private static final SubLSymbol $sym36$ID_INDEX_SPARSE_OBJECTS;
    private static final SubLSymbol $sym37$DO_ID_INDEX_SPARSE_OBJECTS;
    private static final SubLList $list38;
    private static final SubLSymbol $sym39$ID_INDEX_LOCK;
    private static final SubLSymbol $sym40$CLET;
    private static final SubLSymbol $sym41$ID_INDEX_LOCK;
    private static final SubLSymbol $sym42$WITH_LOCK_HELD;
    private static final SubLSymbol $sym43$WITH_ID_INDEX_LOCKED;
    private static final SubLInteger $int44$100;
    private static final SubLSymbol $sym45$NON_NEGATIVE_INTEGER_P;
    private static final SubLString $str46$ID_INDEX;
    private static final SubLString $str47$THE_EMPTY_LIST;
    private static final SubLSymbol $sym48$ID_INDEX_TOMBSTONE_P;
    private static final SubLSymbol $sym49$DO_ID_INDEX;
    private static final SubLSymbol $sym50$_EXIT;
    private static final SubLString $str51$Fill_cannot_extend_into_sparse_sp;
    private static final SubLList $list52;
    private static final SubLList $list53;
    private static final SubLList $list54;
    private static final SubLSymbol $sym55$ITERATE_ID_INDEX_DENSE_OBJECTS_NECESSARY;
    private static final SubLList $list56;
    private static final SubLSymbol $sym57$BOOLEAN;
    private static final SubLSymbol $sym58$ID_INDEX_SPARSE_OBJECTS_ORDERED_ITERATOR_DONE_;
    private static final SubLSymbol $sym59$ID_INDEX_SPARSE_OBJECTS_ORDERED_ITERATOR_NEXT;
    private static final SubLSymbol $kw60$KEY;
    private static final SubLSymbol $kw61$VALUE;
    private static final SubLList $list62;
    private static final SubLList $list63;
    private static final SubLList $list64;
    private static final SubLSymbol $kw65$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw66$TOMBSTONE;
    private static final SubLSymbol $kw67$SKIP;
    private static final SubLSymbol $kw68$ORDERED;
    private static final SubLSymbol $kw69$PROGRESS_MESSAGE;
    private static final SubLSymbol $kw70$DONE;
    private static final SubLSymbol $sym71$OLD_DO_ID_INDEX;
    private static final SubLSymbol $sym72$IDX;
    private static final SubLSymbol $sym73$PUNLESS;
    private static final SubLSymbol $sym74$ID_INDEX_OBJECTS_EMPTY_P;
    private static final SubLSymbol $sym75$IDX;
    private static final SubLSymbol $sym76$MESS;
    private static final SubLSymbol $sym77$TOTAL;
    private static final SubLSymbol $sym78$SOFAR;
    private static final SubLSymbol $sym79$ID_INDEX_COUNT;
    private static final SubLList $list80;
    private static final SubLSymbol $sym81$CHECK_TYPE;
    private static final SubLList $list82;
    private static final SubLSymbol $sym83$NOTING_PERCENT_PROGRESS;
    private static final SubLSymbol $sym84$CINC;
    private static final SubLSymbol $sym85$NOTE_PERCENT_PROGRESS;
    private static final SubLList $list86;
    private static final SubLList $list87;
    private static final SubLSymbol $sym88$IDX;
    private static final SubLSymbol $sym89$ID_INDEX_DENSE_OBJECTS_EMPTY_P;
    private static final SubLSymbol $sym90$DO_VECTOR_INDEX;
    private static final SubLSymbol $sym91$CAND;
    private static final SubLSymbol $sym92$ID_INDEX_SKIP_TOMBSTONES_P;
    private static final SubLSymbol $sym93$PWHEN;
    private static final SubLSymbol $sym94$CSETQ;
    private static final SubLSymbol $sym95$IDX;
    private static final SubLSymbol $sym96$MESS;
    private static final SubLSymbol $sym97$TOTAL;
    private static final SubLSymbol $sym98$SOFAR;
    private static final SubLSymbol $sym99$ID_INDEX_DENSE_OBJECT_COUNT;
    private static final SubLList $list100;
    private static final SubLSymbol $sym101$IDX;
    private static final SubLSymbol $sym102$MESS;
    private static final SubLSymbol $sym103$TOTAL;
    private static final SubLSymbol $sym104$SOFAR;
    private static final SubLSymbol $sym105$ID_INDEX_SPARSE_OBJECT_COUNT;
    private static final SubLSymbol $sym106$IDX;
    private static final SubLSymbol $sym107$PIF;
    private static final SubLSymbol $sym108$IDX;
    private static final SubLSymbol $sym109$SPARSE;
    private static final SubLSymbol $sym110$END_ID;
    private static final SubLSymbol $sym111$DEFAULT;
    private static final SubLSymbol $sym112$ID_INDEX_SPARSE_OBJECTS_EMPTY_P;
    private static final SubLSymbol $sym113$ID_INDEX_SPARSE_ID_THRESHOLD;
    private static final SubLSymbol $sym114$ID_INDEX_NEXT_ID;
    private static final SubLSymbol $sym115$FUNLESS;
    private static final SubLSymbol $sym116$WHILE;
    private static final SubLSymbol $sym117$_;
    private static final SubLSymbol $sym118$CNOT;
    private static final SubLSymbol $sym119$GETHASH_WITHOUT_VALUES;
    private static final SubLString $str120$Setting__TOMBSTONE_to__A_requires;
    private static final SubLSymbol $sym121$IDX;
    private static final SubLSymbol $sym122$DO_HASH_TABLE;
    private static final SubLSymbol $sym123$ID_INDEX_SPARSE_OBJECT_IDS;
    private static final SubLList $list124;
    private static final SubLList $list125;
    private static final SubLSymbol $kw126$START_ID;
    private static final SubLSymbol $kw127$END_ID;
    private static final SubLSymbol $sym128$IDX;
    private static final SubLSymbol $sym129$NEW_DO_ID_INDEX;
    private static final SubLSymbol $sym130$MESS;
    private static final SubLSymbol $sym131$TOTAL;
    private static final SubLSymbol $sym132$SOFAR;
    private static final SubLSymbol $sym133$TOMB;
    private static final SubLSymbol $sym134$ORD;
    private static final SubLSymbol $sym135$LAST_ID;
    private static final SubLSymbol $sym136$STATE_VAR;
    private static final SubLSymbol $sym137$__;
    private static final SubLSymbol $sym138$FIF;
    private static final SubLSymbol $sym139$_;
    private static final SubLList $list140;
    private static final SubLList $list141;
    private static final SubLSymbol $sym142$DO_ID_INDEX_NEXT_ID;
    private static final SubLSymbol $sym143$DO_ID_INDEX_NEXT_STATE;
    private static final SubLSymbol $sym144$DO_ID_INDEX_STATE_OBJECT;
    private static final SubLSymbol $sym145$DO_ID_INDEX_OBJECT_VALID_;
    private static final SubLString $str146$unexpected_new_do_id_index_iterat;
    private static final SubLInteger $int147$128;
    private static final SubLSymbol $sym148$CFASL_INPUT_ID_INDEX;
    private static final SubLSymbol $sym149$CFASL_OUTPUT_OBJECT_ID_INDEX_METHOD;
    private static final SubLString $str150$Expected__A_dense_elements__got__;
    private static final SubLString $str151$Expected__A_sparse_elements__got_;
    private static final SubLString $str152$The_sparse_ID_index_should_have__;
    private static final SubLString $str153$The_sparse_ID_index_should_have_a;
    private static final SubLSymbol $sym154$TEST_ID_INDEX_CFASL_SERIALIZATION;
    private static final SubLSymbol $kw155$TEST;
    private static final SubLSymbol $kw156$OWNER;
    private static final SubLSymbol $kw157$CLASSES;
    private static final SubLSymbol $kw158$KB;
    private static final SubLSymbol $kw159$TINY;
    private static final SubLSymbol $kw160$WORKING_;
    private static final SubLList $list161;
    private static final SubLSymbol $sym162$TO_STRING;
    private static final SubLString $str163$We_did_not_get_an_ID_index_back__;
    private static final SubLString $str164$The_dense_ID_index__A_does_not_ha;
    private static final SubLSymbol $kw165$SUCCESS;
    private static final SubLSymbol $sym166$ID_INDEX_PESSIMIZED_P;
    private static final SubLString $str167$Compacting_ID_index;
    private static final SubLSymbol $sym168$STRINGP;
    private static final SubLSymbol $sym169$FUNCTION_SPEC_P;
    private static final SubLString $str170$Updating_object_IDs;
    private static final SubLSymbol $kw171$ALL;
    private static final SubLList $list172;
    private static final SubLString $str173$Type_must_be_one_of_____ALL__DENS;
    private static final SubLSymbol $kw174$SPARSE;
    private static final SubLList $list175;
    private static final SubLSymbol $kw176$DENSE;
    private static final SubLSymbol $sym177$TEST_ID_INDEX_MISSING_IDS;
    private static final SubLList $list178;
    private static final SubLString $str179$ID__A_is_missing__it_is__A_;
    private static final SubLString $str180$expected_to_be_present;
    private static final SubLString $str181$expected_to_be_absent;
    private static final SubLList $list182;
    private static final SubLSymbol $sym183$TEST_NEW_INDEX_FROM_REVERSE_INDEX;
    private static final SubLString $str184$The_dense_ID_index__A_is_of_a_dif;
    private static final SubLSymbol $kw185$NOT_FOUND;
    private static final SubLString $str186$The_reverse_index_for__A_does_not;
    private static final SubLString $str187$The_new_ID_index_does_not_have__A;
    private static final SubLString $str188$There_is_a_mismatch_between_the__;
    private static final SubLSymbol $sym189$TEST_DO_ID_INDEX_WITH_TOMBSTONES;
    private static final SubLSymbol $kw190$RIP;
    private static final SubLString $str191$Error__the_ID_range_is_not_truely;
    private static final SubLString $str192$Error_at_index__A__expected_tombs;
    private static final SubLString $str193$Error_at_index__A__expected_objec;
    private static final SubLString $str194$There_are_holes_that_we_did_not_s;
    private static final SubLString $str195$Error__ID__A_is_not_in_line_with_;
    private static final SubLString $str196$_DONE_should_have_taken_us_to__A_;
    private static final SubLString $str197$Hey__we_deleted_everything_and_th;
    private static final SubLString $str198$Error__an_empty_ID_index_contains;
    private static final SubLString $str199$Hey___A______A__they_did_not_show;
    private static final SubLSymbol $sym200$TEST_ID_INDEX_WITH_SWIZZLING;
    private static final SubLList $list201;
    private static final SubLString $str202$The_test_is_badly_designed__no_bi;
    private static final SubLString $str203$;
    private static final SubLString $str204$We_could_not_retrieve__S_from_the;
    private static final SubLSymbol $sym205$TEST_ID_INDEX_ORDERED_ITERATION;
    private static final SubLList $list206;
    private static final SubLString $str207$We_expected_something_larger_than;
    private static final SubLString $str208$a;
    private static final SubLString $str209$b;
    private static final SubLString $str210$c;
    private static final SubLList $list211;
    private static final SubLString $str212$d;
    private static final SubLString $str213$e;
    private static final SubLSymbol $kw214$ID_INDEX_RELOOKUP_FAILURE;
    private static final SubLSymbol $kw215$ID_INDEX_RECOUNT_FAILURE;
    private static final SubLSymbol $kw216$DO_ID_INDEX_FAILURE;
    private static final SubLSymbol $kw217$ID_INDEX_LOOKUP_FAILURE;
    private static final SubLSymbol $kw218$ID_INDEX_COUNT_FAILURE;
    private static final SubLSymbol $kw219$INITIAL_ID_INDEX_COUNT_FAILURE;
    private static final SubLSymbol $kw220$UNEXPECTED_FAILURE;
    private static final SubLSymbol $sym221$TEST_PESSIMIZE_ID_INDEX;
    private static final SubLList $list222;
    private static final SubLList $list223;
    private static final SubLInteger $int224$212;
    static  boolean assertionsDisabledSynth = true;
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 1888L)
    public static SubLObject id_index_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_id_index(v_object, stream, (SubLObject)id_index.ZERO_INTEGER);
        return (SubLObject)id_index.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 1888L)
    public static SubLObject id_index_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $id_index_native.class) ? id_index.T : id_index.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 1888L)
    public static SubLObject idix_lock(final SubLObject v_object) {
        assert id_index.NIL != id_index_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 1888L)
    public static SubLObject idix_count(final SubLObject v_object) {
        assert id_index.NIL != id_index_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 1888L)
    public static SubLObject idix_next_id(final SubLObject v_object) {
        assert id_index.NIL != id_index_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 1888L)
    public static SubLObject idix_dense_objects(final SubLObject v_object) {
        assert id_index.NIL != id_index_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 1888L)
    public static SubLObject idix_sparse_objects(final SubLObject v_object) {
        assert id_index.NIL != id_index_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 1888L)
    public static SubLObject _csetf_idix_lock(final SubLObject v_object, final SubLObject value) {
        assert id_index.NIL != id_index_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 1888L)
    public static SubLObject _csetf_idix_count(final SubLObject v_object, final SubLObject value) {
        assert id_index.NIL != id_index_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 1888L)
    public static SubLObject _csetf_idix_next_id(final SubLObject v_object, final SubLObject value) {
        assert id_index.NIL != id_index_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 1888L)
    public static SubLObject _csetf_idix_dense_objects(final SubLObject v_object, final SubLObject value) {
        assert id_index.NIL != id_index_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 1888L)
    public static SubLObject _csetf_idix_sparse_objects(final SubLObject v_object, final SubLObject value) {
        assert id_index.NIL != id_index_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 1888L)
    public static SubLObject make_id_index(SubLObject arglist) {
        if (arglist == id_index.UNPROVIDED) {
            arglist = (SubLObject)id_index.NIL;
        }
        final SubLObject v_new = (SubLObject)new $id_index_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)id_index.NIL, next = arglist; id_index.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)id_index.$kw19$LOCK)) {
                _csetf_idix_lock(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)id_index.$kw20$COUNT)) {
                _csetf_idix_count(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)id_index.$kw21$NEXT_ID)) {
                _csetf_idix_next_id(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)id_index.$kw22$DENSE_OBJECTS)) {
                _csetf_idix_dense_objects(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)id_index.$kw23$SPARSE_OBJECTS)) {
                _csetf_idix_sparse_objects(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)id_index.$str24$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 1888L)
    public static SubLObject visit_defstruct_id_index(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)id_index.$kw25$BEGIN, (SubLObject)id_index.$sym26$MAKE_ID_INDEX, (SubLObject)id_index.FIVE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)id_index.$kw27$SLOT, (SubLObject)id_index.$kw19$LOCK, idix_lock(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)id_index.$kw27$SLOT, (SubLObject)id_index.$kw20$COUNT, idix_count(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)id_index.$kw27$SLOT, (SubLObject)id_index.$kw21$NEXT_ID, idix_next_id(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)id_index.$kw27$SLOT, (SubLObject)id_index.$kw22$DENSE_OBJECTS, idix_dense_objects(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)id_index.$kw27$SLOT, (SubLObject)id_index.$kw23$SPARSE_OBJECTS, idix_sparse_objects(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)id_index.$kw28$END, (SubLObject)id_index.$sym26$MAKE_ID_INDEX, (SubLObject)id_index.FIVE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 1888L)
    public static SubLObject visit_defstruct_object_id_index_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_id_index(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 2220L)
    public static SubLObject print_id_index(final SubLObject v_id_index, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (id_index.NIL != print_high.$print_readably$.getDynamicValue(thread)) {
            print_high.print_not_readable(v_id_index, stream);
        }
        else {
            print_macros.print_unreadable_object_preamble(stream, v_id_index, (SubLObject)id_index.T, (SubLObject)id_index.T);
            streams_high.write_string((SubLObject)id_index.$str30$COUNT_, stream, (SubLObject)id_index.UNPROVIDED, (SubLObject)id_index.UNPROVIDED);
            print_high.princ(id_index_count(v_id_index), stream);
            print_high.princ((SubLObject)id_index.$str31$_NEXT_, stream);
            print_high.princ(id_index_next_id(v_id_index), stream);
            print_macros.print_unreadable_object_postamble(stream, v_id_index, (SubLObject)id_index.NIL, (SubLObject)id_index.NIL);
        }
        return v_id_index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 2521L)
    public static SubLObject id_index_count(final SubLObject v_id_index) {
        assert id_index.NIL != id_index_p(v_id_index) : v_id_index;
        return idix_count(v_id_index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 2740L)
    public static SubLObject id_index_empty_p(final SubLObject v_id_index) {
        return Numbers.numE((SubLObject)id_index.ZERO_INTEGER, id_index_count(v_id_index));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 2861L)
    public static SubLObject id_index_dense_object_count(final SubLObject v_id_index) {
        assert id_index.NIL != id_index_p(v_id_index) : v_id_index;
        return Numbers.subtract(id_index_count(v_id_index), id_index_sparse_object_count(v_id_index));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 3085L)
    public static SubLObject id_index_sparse_object_count(final SubLObject v_id_index) {
        assert id_index.NIL != id_index_p(v_id_index) : v_id_index;
        return Hashtables.hash_table_count(id_index_sparse_objects(v_id_index));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 3292L)
    public static SubLObject id_index_sparse_id_threshold(final SubLObject v_id_index) {
        assert id_index.NIL != id_index_p(v_id_index) : v_id_index;
        return Sequences.length(id_index_dense_objects(v_id_index));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 3497L)
    public static SubLObject id_index_next_id(final SubLObject v_id_index) {
        assert id_index.NIL != id_index_p(v_id_index) : v_id_index;
        return idix_next_id(v_id_index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 3674L)
    public static SubLObject set_id_index_next_id(final SubLObject v_id_index, final SubLObject next_id) {
        assert id_index.NIL != id_index_p(v_id_index) : v_id_index;
        assert id_index.NIL != Types.integerp(next_id) : next_id;
        if (next_id.numL(idix_next_id(v_id_index)) && id_index.NIL != subl_promotions.positive_integer_p(idix_count(v_id_index))) {
            Errors.warn((SubLObject)id_index.$str33$_A_has_had_next_id_reduced_from__, v_id_index, idix_next_id(v_id_index), next_id);
        }
        _csetf_idix_next_id(v_id_index, next_id);
        return next_id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 4158L)
    public static SubLObject id_index_dense_objects(final SubLObject v_id_index) {
        assert id_index.NIL != id_index_p(v_id_index) : v_id_index;
        return idix_dense_objects(v_id_index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 4404L)
    public static SubLObject id_index_sparse_objects(final SubLObject v_id_index) {
        assert id_index.NIL != id_index_p(v_id_index) : v_id_index;
        return idix_sparse_objects(v_id_index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 4657L)
    public static SubLObject with_id_index_locked(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_id_index = (SubLObject)id_index.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)id_index.$list38);
        v_id_index = current.first();
        final SubLObject body;
        current = (body = current.rest());
        final SubLObject id_index_lock = (SubLObject)id_index.$sym39$ID_INDEX_LOCK;
        return (SubLObject)ConsesLow.list((SubLObject)id_index.$sym40$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(id_index_lock, (SubLObject)ConsesLow.list((SubLObject)id_index.$sym41$ID_INDEX_LOCK, v_id_index))), (SubLObject)ConsesLow.listS((SubLObject)id_index.$sym42$WITH_LOCK_HELD, (SubLObject)ConsesLow.list(id_index_lock), ConsesLow.append(body, (SubLObject)id_index.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 4933L)
    public static SubLObject id_index_lock(final SubLObject v_id_index) {
        return idix_lock(v_id_index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 5628L)
    public static SubLObject convert_id_index_key_test(final SubLObject v_id_index, SubLObject from, SubLObject to) {
        if (from == id_index.UNPROVIDED) {
            from = (SubLObject)id_index.EQL;
        }
        if (to == id_index.UNPROVIDED) {
            to = (SubLObject)id_index.EQ;
        }
        assert id_index.NIL != id_index_p(v_id_index) : v_id_index;
        final SubLObject sparse_objects_table = id_index_sparse_objects(v_id_index);
        if (sparse_objects_table.isHashtable()) {
            final SubLObject test = hash_table_utilities.hash_test_to_symbol(Hashtables.hash_table_test(sparse_objects_table));
            final SubLObject from_test = hash_table_utilities.hash_test_to_symbol(from);
            if (from_test.eql(test)) {
                final SubLObject sparse_table = Hashtables.make_hash_table(Hashtables.hash_table_size(sparse_objects_table), to, (SubLObject)id_index.UNPROVIDED);
                SubLObject key = (SubLObject)id_index.NIL;
                SubLObject value = (SubLObject)id_index.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(sparse_objects_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        key = Hashtables.getEntryKey(cdohash_entry);
                        value = Hashtables.getEntryValue(cdohash_entry);
                        Hashtables.sethash(key, sparse_table, value);
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
                _csetf_idix_sparse_objects(v_id_index, sparse_table);
                return (SubLObject)id_index.T;
            }
        }
        return (SubLObject)id_index.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 6334L)
    public static SubLObject new_id_index(SubLObject dense_objects_size, SubLObject initial_next_id) {
        if (dense_objects_size == id_index.UNPROVIDED) {
            dense_objects_size = (SubLObject)id_index.ZERO_INTEGER;
        }
        if (initial_next_id == id_index.UNPROVIDED) {
            initial_next_id = (SubLObject)id_index.ZERO_INTEGER;
        }
        assert id_index.NIL != subl_promotions.non_negative_integer_p(initial_next_id) : initial_next_id;
        assert id_index.NIL != subl_promotions.non_negative_integer_p(dense_objects_size) : dense_objects_size;
        final SubLObject sparse_objects_size = Numbers.max((SubLObject)id_index.TEN_INTEGER, Numbers.integerDivide(dense_objects_size, id_index.$id_index_default_scaling_factor$.getGlobalValue()));
        final SubLObject v_id_index = make_id_index((SubLObject)id_index.UNPROVIDED);
        final SubLObject lock = Locks.make_lock((SubLObject)id_index.$str46$ID_INDEX);
        final SubLObject dense_objects = Vectors.make_vector(dense_objects_size, (SubLObject)id_index.NIL);
        final SubLObject sparse_objects = Hashtables.make_hash_table(sparse_objects_size, id_index.$id_index_equality_test$.getGlobalValue(), (SubLObject)id_index.UNPROVIDED);
        _csetf_idix_lock(v_id_index, lock);
        _csetf_idix_count(v_id_index, (SubLObject)id_index.ZERO_INTEGER);
        _csetf_idix_next_id(v_id_index, initial_next_id);
        _csetf_idix_dense_objects(v_id_index, dense_objects);
        _csetf_idix_sparse_objects(v_id_index, sparse_objects);
        return v_id_index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 7313L)
    public static SubLObject id_index_reserve(final SubLObject v_id_index) {
        assert id_index.NIL != id_index_p(v_id_index) : v_id_index;
        SubLObject id = (SubLObject)id_index.NIL;
        final SubLObject id_index_lock = id_index_lock(v_id_index);
        SubLObject release = (SubLObject)id_index.NIL;
        try {
            release = Locks.seize_lock(id_index_lock);
            final SubLObject next_id = id_index_next_id(v_id_index);
            _csetf_idix_next_id(v_id_index, Numbers.add(idix_next_id(v_id_index), (SubLObject)id_index.ONE_INTEGER));
            id = next_id;
        }
        finally {
            if (id_index.NIL != release) {
                Locks.release_lock(id_index_lock);
            }
        }
        return id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 7821L)
    public static SubLObject id_index_empty_list() {
        return id_index.$id_index_empty_list$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 7891L)
    public static SubLObject id_index_empty_list_p(final SubLObject v_object) {
        return uninterned_symbols_with_same_name_p(v_object, id_index_empty_list());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 8014L)
    public static SubLObject uninterned_symbols_with_same_name_p(final SubLObject symbol1, final SubLObject symbol2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(symbol1.isSymbol() && id_index.NIL == Symbols.symbol_package(symbol1) && (symbol1.eql(symbol2) || (symbol2.isSymbol() && id_index.NIL == Symbols.symbol_package(symbol2) && Symbols.symbol_name(symbol1).equal(Symbols.symbol_name(symbol2)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 8406L)
    public static SubLObject id_index_tombstone() {
        return (SubLObject)id_index.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 8492L)
    public static SubLObject id_index_tombstone_p(final SubLObject v_object) {
        return Equality.eq(v_object, id_index_tombstone());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 8608L)
    public static SubLObject id_index_lookup(final SubLObject v_id_index, final SubLObject id, SubLObject v_default) {
        if (v_default == id_index.UNPROVIDED) {
            v_default = (SubLObject)id_index.NIL;
        }
        final SubLObject result = id_index_lookup_int(v_id_index, id);
        if (id_index.NIL != id_index_tombstone_p(result)) {
            return v_default;
        }
        if (id_index.NIL != id_index_empty_list_p(result)) {
            return (SubLObject)id_index.NIL;
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 8869L)
    public static SubLObject id_index_lookup_int(final SubLObject v_id_index, final SubLObject id) {
        assert id_index.NIL != id_index_p(v_id_index) : v_id_index;
        assert id_index.NIL != Types.integerp(id) : id;
        if (id_index.NIL != id_index_dense_object_id_p(v_id_index, id)) {
            final SubLObject dense_objects = id_index_dense_objects(v_id_index);
            return Vectors.aref(dense_objects, id);
        }
        final SubLObject sparse_objects = id_index_sparse_objects(v_id_index);
        return Hashtables.gethash_without_values(id, sparse_objects, (SubLObject)id_index.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 9307L)
    public static SubLObject id_index_enter(final SubLObject v_id_index, final SubLObject id, final SubLObject v_object) {
        final SubLObject id_index_lock = id_index_lock(v_id_index);
        SubLObject release = (SubLObject)id_index.NIL;
        try {
            release = Locks.seize_lock(id_index_lock);
            id_index_enter_unlocked(v_id_index, id, v_object);
        }
        finally {
            if (id_index.NIL != release) {
                Locks.release_lock(id_index_lock);
            }
        }
        return v_id_index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 9578L)
    public static SubLObject id_index_enter_unlocked(final SubLObject v_id_index, final SubLObject id, final SubLObject v_object) {
        assert id_index.NIL != id_index_p(v_id_index) : v_id_index;
        assert id_index.NIL != Types.integerp(id) : id;
        final SubLObject existing = id_index_lookup_int(v_id_index, id);
        final SubLObject dwimmed_object = (id_index.NIL != v_object) ? v_object : id_index_empty_list();
        if (id_index.NIL != id_index_dense_object_id_p(v_id_index, id)) {
            final SubLObject dense_objects = id_index_dense_objects(v_id_index);
            Vectors.set_aref(dense_objects, id, dwimmed_object);
        }
        else {
            final SubLObject sparse_objects = get_appropriate_id_index_sparse_objects(v_id_index, id);
            Hashtables.sethash(id, sparse_objects, dwimmed_object);
        }
        if (id_index.NIL != id_index_tombstone_p(existing)) {
            _csetf_idix_count(v_id_index, Numbers.add(idix_count(v_id_index), (SubLObject)id_index.ONE_INTEGER));
        }
        if (id.numGE(idix_next_id(v_id_index))) {
            _csetf_idix_next_id(v_id_index, Numbers.add((SubLObject)id_index.ONE_INTEGER, id));
        }
        return v_id_index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 10532L)
    public static SubLObject get_appropriate_id_index_sparse_objects(final SubLObject v_id_index, final SubLObject id) {
        SubLObject sparse_objects = id_index_sparse_objects(v_id_index);
        if (!id.isFixnum()) {
            convert_id_index_key_test(v_id_index, (SubLObject)id_index.EQ, (SubLObject)id_index.EQL);
            sparse_objects = id_index_sparse_objects(v_id_index);
        }
        return sparse_objects;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 11056L)
    public static SubLObject id_index_enter_autoextend(final SubLObject v_id_index, final SubLObject id, final SubLObject v_object, SubLObject extend_if_pessimizedP) {
        if (extend_if_pessimizedP == id_index.UNPROVIDED) {
            extend_if_pessimizedP = (SubLObject)id_index.T;
        }
        id_index_enter(v_id_index, id, v_object);
        return id_index_possibly_autoextend(v_id_index, id, extend_if_pessimizedP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 11532L)
    public static SubLObject id_index_enter_unlocked_autoextend(final SubLObject v_id_index, final SubLObject id, final SubLObject v_object, SubLObject extend_if_pessimizedP) {
        if (extend_if_pessimizedP == id_index.UNPROVIDED) {
            extend_if_pessimizedP = (SubLObject)id_index.T;
        }
        id_index_enter_unlocked(v_id_index, id, v_object);
        return id_index_possibly_autoextend(v_id_index, id, extend_if_pessimizedP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 12041L)
    public static SubLObject id_index_possibly_autoextend(final SubLObject v_id_index, final SubLObject id, final SubLObject extend_if_pessimizedP) {
        if (id_index.NIL == extend_if_pessimizedP && id_index.NIL != id_index_pessimized_p(v_id_index)) {
            return v_id_index;
        }
        final SubLObject threshold = id_index_sparse_id_threshold(v_id_index);
        if (number_utilities.f_1X(id).numGE(threshold)) {
            optimize_id_index(v_id_index, number_utilities.f_2X(Numbers.max(threshold, id)));
        }
        return v_id_index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 12582L)
    public static SubLObject id_index_remove(final SubLObject v_id_index, final SubLObject id) {
        assert id_index.NIL != id_index_p(v_id_index) : v_id_index;
        assert id_index.NIL != Types.integerp(id) : id;
        final SubLObject id_index_lock = id_index_lock(v_id_index);
        SubLObject release = (SubLObject)id_index.NIL;
        try {
            release = Locks.seize_lock(id_index_lock);
            final SubLObject existing = id_index_lookup_int(v_id_index, id);
            if (id_index.NIL != id_index_dense_object_id_p(v_id_index, id)) {
                final SubLObject dense_objects = id_index_dense_objects(v_id_index);
                Vectors.set_aref(dense_objects, id, id_index_tombstone());
            }
            else {
                final SubLObject sparse_objects = id_index_sparse_objects(v_id_index);
                Hashtables.remhash(id, sparse_objects);
            }
            if (id_index.NIL == id_index_tombstone_p(existing)) {
                _csetf_idix_count(v_id_index, Numbers.subtract(idix_count(v_id_index), (SubLObject)id_index.ONE_INTEGER));
            }
        }
        finally {
            if (id_index.NIL != release) {
                Locks.release_lock(id_index_lock);
            }
        }
        return v_id_index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 13251L)
    public static SubLObject clear_id_index(final SubLObject v_id_index) {
        assert id_index.NIL != id_index_p(v_id_index) : v_id_index;
        final SubLObject id_index_lock = id_index_lock(v_id_index);
        SubLObject release = (SubLObject)id_index.NIL;
        try {
            release = Locks.seize_lock(id_index_lock);
            _csetf_idix_count(v_id_index, (SubLObject)id_index.ZERO_INTEGER);
            Sequences.fill(id_index_dense_objects(v_id_index), (SubLObject)id_index.NIL, (SubLObject)id_index.UNPROVIDED, (SubLObject)id_index.UNPROVIDED);
            Hashtables.clrhash(id_index_sparse_objects(v_id_index));
        }
        finally {
            if (id_index.NIL != release) {
                Locks.release_lock(id_index_lock);
            }
        }
        return v_id_index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 13558L)
    public static SubLObject fill_id_index_dense_space(final SubLObject v_id_index, final SubLObject value, SubLObject end) {
        if (end == id_index.UNPROVIDED) {
            end = (SubLObject)id_index.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert id_index.NIL != id_index_p(v_id_index) : v_id_index;
        final SubLObject id_index_lock = id_index_lock(v_id_index);
        SubLObject release = (SubLObject)id_index.NIL;
        try {
            release = Locks.seize_lock(id_index_lock);
            if (id_index.NIL == end) {
                end = Sequences.length(id_index_dense_objects(v_id_index));
            }
            if (end.isZero()) {
                return v_id_index;
            }
            if (id_index.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && id_index.NIL == id_index_dense_object_id_p(v_id_index, Numbers.subtract(end, (SubLObject)id_index.ONE_INTEGER))) {
                Errors.error((SubLObject)id_index.$str51$Fill_cannot_extend_into_sparse_sp);
            }
            Sequences.fill(id_index_dense_objects(v_id_index), value, (SubLObject)id_index.ZERO_INTEGER, end);
            if (id_index_next_id(v_id_index).numL(end)) {
                set_id_index_next_id(v_id_index, end);
            }
            if (id_index_count(v_id_index).numL(end)) {
                _csetf_idix_count(v_id_index, end);
            }
        }
        finally {
            if (id_index.NIL != release) {
                Locks.release_lock(id_index_lock);
            }
        }
        return v_id_index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 14313L)
    public static SubLObject id_index_dense_object_id_p(final SubLObject v_id_index, final SubLObject id) {
        return (SubLObject)SubLObjectFactory.makeBoolean(!id.isNegative() && id.numL(id_index_sparse_id_threshold(v_id_index)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 14473L)
    public static SubLObject new_id_index_iterator(final SubLObject v_id_index) {
        assert id_index.NIL != id_index_p(v_id_index) : v_id_index;
        return iteration.new_factory_iterator((SubLObject)id_index.$list52, (SubLObject)ConsesLow.list(v_id_index), (SubLObject)id_index.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 14820L)
    public static SubLObject new_id_index_values_iterator(final SubLObject v_id_index) {
        assert id_index.NIL != id_index_p(v_id_index) : v_id_index;
        return iteration.new_factory_iterator((SubLObject)id_index.$list53, (SubLObject)ConsesLow.list(v_id_index), (SubLObject)id_index.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 15103L)
    public static SubLObject new_id_index_ordered_iterator(final SubLObject v_id_index) {
        assert id_index.NIL != id_index_p(v_id_index) : v_id_index;
        return iteration.new_factory_iterator((SubLObject)id_index.$list54, (SubLObject)ConsesLow.list(v_id_index), (SubLObject)id_index.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 15464L)
    public static SubLObject new_id_index_dense_objects_iterator(final SubLObject v_id_index) {
        assert id_index.NIL != id_index_p(v_id_index) : v_id_index;
        final SubLObject dense_objects = id_index_dense_objects(v_id_index);
        final SubLObject subiterator = iteration.new_vector_index_iterator(dense_objects);
        return iteration.new_filter_iterator(subiterator, (SubLObject)id_index.$sym55$ITERATE_ID_INDEX_DENSE_OBJECTS_NECESSARY, (SubLObject)id_index.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 16029L)
    public static SubLObject iterate_id_index_dense_objects_necessary(final SubLObject entry) {
        SubLObject id = (SubLObject)id_index.NIL;
        SubLObject value = (SubLObject)id_index.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(entry, entry, (SubLObject)id_index.$list56);
        id = entry.first();
        SubLObject current = entry.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, entry, (SubLObject)id_index.$list56);
        value = current.first();
        current = current.rest();
        if (id_index.NIL == current) {
            return (SubLObject)SubLObjectFactory.makeBoolean(id_index.NIL == id_index_tombstone_p(value));
        }
        cdestructuring_bind.cdestructuring_bind_error(entry, (SubLObject)id_index.$list56);
        return (SubLObject)id_index.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 16199L)
    public static SubLObject new_id_index_dense_objects_values_iterator(final SubLObject v_id_index) {
        assert id_index.NIL != id_index_p(v_id_index) : v_id_index;
        final SubLObject dense_objects = id_index_dense_objects(v_id_index);
        final SubLObject subiterator = iteration.new_vector_iterator(dense_objects);
        return iteration.new_filter_iterator(subiterator, (SubLObject)id_index.$sym57$BOOLEAN, (SubLObject)id_index.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 16548L)
    public static SubLObject new_id_index_sparse_objects_iterator(final SubLObject v_id_index) {
        assert id_index.NIL != id_index_p(v_id_index) : v_id_index;
        final SubLObject sparse_objects = id_index_sparse_objects(v_id_index);
        return iteration.new_hash_table_iterator(sparse_objects);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 16829L)
    public static SubLObject new_id_index_sparse_objects_values_iterator(final SubLObject v_id_index) {
        assert id_index.NIL != id_index_p(v_id_index) : v_id_index;
        final SubLObject sparse_objects = id_index_sparse_objects(v_id_index);
        return iteration.new_hash_table_values_iterator(sparse_objects);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 17121L)
    public static SubLObject new_id_index_sparse_objects_ordered_iterator(final SubLObject v_id_index) {
        assert id_index.NIL != id_index_p(v_id_index) : v_id_index;
        if (id_index.NIL != id_index_sparse_objects_empty_p(v_id_index)) {
            return iteration.new_null_iterator();
        }
        return iteration.new_iterator(make_id_index_sparse_objects_ordered_iterator_state(v_id_index), (SubLObject)id_index.$sym58$ID_INDEX_SPARSE_OBJECTS_ORDERED_ITERATOR_DONE_, (SubLObject)id_index.$sym59$ID_INDEX_SPARSE_OBJECTS_ORDERED_ITERATOR_NEXT, (SubLObject)id_index.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 17751L)
    public static SubLObject make_id_index_sparse_objects_ordered_iterator_state(final SubLObject v_id_index) {
        final SubLObject id = id_index_sparse_id_threshold(v_id_index);
        final SubLObject sparse_objects = id_index_sparse_objects(v_id_index);
        final SubLObject end_id = id_index_next_id(v_id_index);
        final SubLObject key_value_tuple = (SubLObject)ConsesLow.list((SubLObject)id_index.$kw60$KEY, (SubLObject)id_index.$kw61$VALUE);
        return (SubLObject)ConsesLow.list(id, sparse_objects, end_id, key_value_tuple);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 18147L)
    public static SubLObject id_index_sparse_objects_ordered_iterator_doneP(final SubLObject state) {
        SubLObject id = (SubLObject)id_index.NIL;
        SubLObject sparse_objects = (SubLObject)id_index.NIL;
        SubLObject end_id = (SubLObject)id_index.NIL;
        SubLObject key_value_tuple = (SubLObject)id_index.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)id_index.$list62);
        id = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)id_index.$list62);
        sparse_objects = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)id_index.$list62);
        end_id = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)id_index.$list62);
        key_value_tuple = current.first();
        current = current.rest();
        if (id_index.NIL == current) {
            return (SubLObject)SubLObjectFactory.makeBoolean(!id.numL(end_id));
        }
        cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)id_index.$list62);
        return (SubLObject)id_index.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 18383L)
    public static SubLObject id_index_sparse_objects_ordered_iterator_next(final SubLObject state) {
        SubLObject id = (SubLObject)id_index.NIL;
        SubLObject sparse_objects = (SubLObject)id_index.NIL;
        SubLObject end_id = (SubLObject)id_index.NIL;
        SubLObject key_value_tuple = (SubLObject)id_index.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)id_index.$list62);
        id = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)id_index.$list62);
        sparse_objects = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)id_index.$list62);
        end_id = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)id_index.$list62);
        key_value_tuple = current.first();
        current = current.rest();
        if (id_index.NIL == current) {
            SubLObject v_object = id_index_tombstone();
            SubLObject spot = id;
            while (id.numL(end_id) && id_index.NIL != id_index_tombstone_p(v_object)) {
                v_object = Hashtables.gethash_without_values(id, sparse_objects, id_index_tombstone());
                spot = id;
                id = Numbers.add(id, (SubLObject)id_index.ONE_INTEGER);
            }
            ConsesLow.set_nth((SubLObject)id_index.ZERO_INTEGER, state, id);
            ConsesLow.set_nth((SubLObject)id_index.ZERO_INTEGER, key_value_tuple, spot);
            ConsesLow.set_nth((SubLObject)id_index.ONE_INTEGER, key_value_tuple, v_object);
            return Values.values(key_value_tuple, state, id_index_sparse_objects_ordered_iterator_doneP(state));
        }
        cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)id_index.$list62);
        return (SubLObject)id_index.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 19080L)
    public static SubLObject do_id_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)id_index.$list63);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject id = (SubLObject)id_index.NIL;
        SubLObject v_object = (SubLObject)id_index.NIL;
        SubLObject v_id_index = (SubLObject)id_index.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)id_index.$list63);
        id = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)id_index.$list63);
        v_object = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)id_index.$list63);
        v_id_index = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)id_index.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)id_index.NIL;
        SubLObject current_$1 = (SubLObject)id_index.NIL;
        while (id_index.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)id_index.$list63);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)id_index.$list63);
            if (id_index.NIL == conses_high.member(current_$1, (SubLObject)id_index.$list64, (SubLObject)id_index.UNPROVIDED, (SubLObject)id_index.UNPROVIDED)) {
                bad = (SubLObject)id_index.T;
            }
            if (current_$1 == id_index.$kw65$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (id_index.NIL != bad && id_index.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)id_index.$list63);
        }
        final SubLObject tombstone_tail = cdestructuring_bind.property_list_member((SubLObject)id_index.$kw66$TOMBSTONE, current);
        final SubLObject tombstone = (SubLObject)((id_index.NIL != tombstone_tail) ? conses_high.cadr(tombstone_tail) : id_index.$kw67$SKIP);
        final SubLObject ordered_tail = cdestructuring_bind.property_list_member((SubLObject)id_index.$kw68$ORDERED, current);
        final SubLObject ordered = (SubLObject)((id_index.NIL != ordered_tail) ? conses_high.cadr(ordered_tail) : id_index.NIL);
        final SubLObject progress_message_tail = cdestructuring_bind.property_list_member((SubLObject)id_index.$kw69$PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (SubLObject)((id_index.NIL != progress_message_tail) ? conses_high.cadr(progress_message_tail) : id_index.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)id_index.$kw70$DONE, current);
        final SubLObject done = (SubLObject)((id_index.NIL != done_tail) ? conses_high.cadr(done_tail) : id_index.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)id_index.$sym71$OLD_DO_ID_INDEX, (SubLObject)ConsesLow.list(new SubLObject[] { id, v_object, v_id_index, id_index.$kw66$TOMBSTONE, tombstone, id_index.$kw68$ORDERED, ordered, id_index.$kw69$PROGRESS_MESSAGE, progress_message, id_index.$kw70$DONE, done }), ConsesLow.append(body, (SubLObject)id_index.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 19888L)
    public static SubLObject old_do_id_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)id_index.$list63);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject id = (SubLObject)id_index.NIL;
        SubLObject v_object = (SubLObject)id_index.NIL;
        SubLObject v_id_index = (SubLObject)id_index.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)id_index.$list63);
        id = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)id_index.$list63);
        v_object = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)id_index.$list63);
        v_id_index = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)id_index.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)id_index.NIL;
        SubLObject current_$2 = (SubLObject)id_index.NIL;
        while (id_index.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)id_index.$list63);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)id_index.$list63);
            if (id_index.NIL == conses_high.member(current_$2, (SubLObject)id_index.$list64, (SubLObject)id_index.UNPROVIDED, (SubLObject)id_index.UNPROVIDED)) {
                bad = (SubLObject)id_index.T;
            }
            if (current_$2 == id_index.$kw65$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (id_index.NIL != bad && id_index.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)id_index.$list63);
        }
        final SubLObject tombstone_tail = cdestructuring_bind.property_list_member((SubLObject)id_index.$kw66$TOMBSTONE, current);
        final SubLObject tombstone = (SubLObject)((id_index.NIL != tombstone_tail) ? conses_high.cadr(tombstone_tail) : id_index.$kw67$SKIP);
        final SubLObject ordered_tail = cdestructuring_bind.property_list_member((SubLObject)id_index.$kw68$ORDERED, current);
        final SubLObject ordered = (SubLObject)((id_index.NIL != ordered_tail) ? conses_high.cadr(ordered_tail) : id_index.NIL);
        final SubLObject progress_message_tail = cdestructuring_bind.property_list_member((SubLObject)id_index.$kw69$PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (SubLObject)((id_index.NIL != progress_message_tail) ? conses_high.cadr(progress_message_tail) : id_index.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)id_index.$kw70$DONE, current);
        final SubLObject done = (SubLObject)((id_index.NIL != done_tail) ? conses_high.cadr(done_tail) : id_index.NIL);
        final SubLObject body;
        current = (body = temp);
        if (id_index.NIL == progress_message) {
            final SubLObject idx = (SubLObject)id_index.$sym72$IDX;
            return (SubLObject)ConsesLow.list((SubLObject)id_index.$sym40$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(idx, v_id_index)), (SubLObject)ConsesLow.list((SubLObject)id_index.$sym73$PUNLESS, (SubLObject)ConsesLow.list((SubLObject)id_index.$sym74$ID_INDEX_OBJECTS_EMPTY_P, idx, tombstone), (SubLObject)ConsesLow.listS((SubLObject)id_index.$sym35$DO_ID_INDEX_DENSE_OBJECTS, (SubLObject)ConsesLow.list(id, v_object, idx, (SubLObject)id_index.$kw70$DONE, done, (SubLObject)id_index.$kw66$TOMBSTONE, tombstone), ConsesLow.append(body, (SubLObject)id_index.NIL)), (SubLObject)ConsesLow.listS((SubLObject)id_index.$sym37$DO_ID_INDEX_SPARSE_OBJECTS, (SubLObject)ConsesLow.list(new SubLObject[] { id, v_object, idx, id_index.$kw68$ORDERED, ordered, id_index.$kw66$TOMBSTONE, tombstone, id_index.$kw70$DONE, done }), ConsesLow.append(body, (SubLObject)id_index.NIL))));
        }
        final SubLObject idx = (SubLObject)id_index.$sym75$IDX;
        final SubLObject mess = (SubLObject)id_index.$sym76$MESS;
        final SubLObject total = (SubLObject)id_index.$sym77$TOTAL;
        final SubLObject sofar = (SubLObject)id_index.$sym78$SOFAR;
        return (SubLObject)ConsesLow.list((SubLObject)id_index.$sym40$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(idx, v_id_index), (SubLObject)ConsesLow.list(mess, progress_message), (SubLObject)ConsesLow.list(total, (SubLObject)ConsesLow.list((SubLObject)id_index.$sym79$ID_INDEX_COUNT, idx)), reader.bq_cons(sofar, (SubLObject)id_index.$list80)), (SubLObject)ConsesLow.listS((SubLObject)id_index.$sym81$CHECK_TYPE, mess, (SubLObject)id_index.$list82), (SubLObject)ConsesLow.list((SubLObject)id_index.$sym83$NOTING_PERCENT_PROGRESS, mess, (SubLObject)ConsesLow.listS((SubLObject)id_index.$sym49$DO_ID_INDEX, (SubLObject)ConsesLow.list(id, v_object, idx, (SubLObject)id_index.$kw70$DONE, done, (SubLObject)id_index.$kw68$ORDERED, ordered), ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)id_index.$sym84$CINC, sofar), (SubLObject)ConsesLow.list((SubLObject)id_index.$sym85$NOTE_PERCENT_PROGRESS, sofar, total))))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 21245L)
    public static SubLObject id_index_objects_empty_p(final SubLObject v_id_index, final SubLObject tombstone) {
        if (id_index.NIL != id_index_skip_tombstones_p(tombstone)) {
            return id_index_empty_p(v_id_index);
        }
        return (SubLObject)id_index.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 21437L)
    public static SubLObject do_id_index_dense_objects(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)id_index.$list86);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject id = (SubLObject)id_index.NIL;
        SubLObject v_object = (SubLObject)id_index.NIL;
        SubLObject v_id_index = (SubLObject)id_index.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)id_index.$list86);
        id = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)id_index.$list86);
        v_object = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)id_index.$list86);
        v_id_index = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)id_index.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)id_index.NIL;
        SubLObject current_$3 = (SubLObject)id_index.NIL;
        while (id_index.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)id_index.$list86);
            current_$3 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)id_index.$list86);
            if (id_index.NIL == conses_high.member(current_$3, (SubLObject)id_index.$list87, (SubLObject)id_index.UNPROVIDED, (SubLObject)id_index.UNPROVIDED)) {
                bad = (SubLObject)id_index.T;
            }
            if (current_$3 == id_index.$kw65$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (id_index.NIL != bad && id_index.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)id_index.$list86);
        }
        final SubLObject tombstone_tail = cdestructuring_bind.property_list_member((SubLObject)id_index.$kw66$TOMBSTONE, current);
        final SubLObject tombstone = (SubLObject)((id_index.NIL != tombstone_tail) ? conses_high.cadr(tombstone_tail) : id_index.$kw67$SKIP);
        final SubLObject progress_message_tail = cdestructuring_bind.property_list_member((SubLObject)id_index.$kw69$PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (SubLObject)((id_index.NIL != progress_message_tail) ? conses_high.cadr(progress_message_tail) : id_index.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)id_index.$kw70$DONE, current);
        final SubLObject done = (SubLObject)((id_index.NIL != done_tail) ? conses_high.cadr(done_tail) : id_index.NIL);
        final SubLObject body;
        current = (body = temp);
        if (id_index.NIL == progress_message) {
            final SubLObject idx = (SubLObject)id_index.$sym88$IDX;
            return (SubLObject)ConsesLow.list((SubLObject)id_index.$sym40$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(idx, v_id_index)), (SubLObject)ConsesLow.list((SubLObject)id_index.$sym73$PUNLESS, (SubLObject)ConsesLow.list((SubLObject)id_index.$sym89$ID_INDEX_DENSE_OBJECTS_EMPTY_P, idx, tombstone), (SubLObject)ConsesLow.list((SubLObject)id_index.$sym90$DO_VECTOR_INDEX, (SubLObject)ConsesLow.list(id, v_object, (SubLObject)ConsesLow.list((SubLObject)id_index.$sym34$ID_INDEX_DENSE_OBJECTS, idx), (SubLObject)id_index.$kw70$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)id_index.$sym73$PUNLESS, (SubLObject)ConsesLow.list((SubLObject)id_index.$sym91$CAND, (SubLObject)ConsesLow.list((SubLObject)id_index.$sym48$ID_INDEX_TOMBSTONE_P, v_object), (SubLObject)ConsesLow.list((SubLObject)id_index.$sym92$ID_INDEX_SKIP_TOMBSTONES_P, tombstone)), (SubLObject)ConsesLow.list((SubLObject)id_index.$sym93$PWHEN, (SubLObject)ConsesLow.list((SubLObject)id_index.$sym48$ID_INDEX_TOMBSTONE_P, v_object), (SubLObject)ConsesLow.list((SubLObject)id_index.$sym94$CSETQ, v_object, tombstone)), ConsesLow.append(body, (SubLObject)id_index.NIL)))));
        }
        final SubLObject idx = (SubLObject)id_index.$sym95$IDX;
        final SubLObject mess = (SubLObject)id_index.$sym96$MESS;
        final SubLObject total = (SubLObject)id_index.$sym97$TOTAL;
        final SubLObject sofar = (SubLObject)id_index.$sym98$SOFAR;
        return (SubLObject)ConsesLow.list((SubLObject)id_index.$sym40$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(idx, v_id_index), (SubLObject)ConsesLow.list(mess, progress_message), (SubLObject)ConsesLow.list(total, (SubLObject)ConsesLow.list((SubLObject)id_index.$sym99$ID_INDEX_DENSE_OBJECT_COUNT, idx)), reader.bq_cons(sofar, (SubLObject)id_index.$list80)), (SubLObject)ConsesLow.listS((SubLObject)id_index.$sym81$CHECK_TYPE, mess, (SubLObject)id_index.$list82), (SubLObject)ConsesLow.list((SubLObject)id_index.$sym83$NOTING_PERCENT_PROGRESS, mess, (SubLObject)ConsesLow.listS((SubLObject)id_index.$sym35$DO_ID_INDEX_DENSE_OBJECTS, (SubLObject)ConsesLow.list(id, v_object, idx, (SubLObject)id_index.$kw70$DONE, done), ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)id_index.$sym84$CINC, sofar), (SubLObject)ConsesLow.list((SubLObject)id_index.$sym85$NOTE_PERCENT_PROGRESS, sofar, total))))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 22894L)
    public static SubLObject id_index_dense_objects_empty_p(final SubLObject v_id_index, final SubLObject tombstone) {
        if (id_index.NIL != id_index_skip_tombstones_p(tombstone)) {
            return Numbers.numE((SubLObject)id_index.ZERO_INTEGER, id_index_dense_object_count(v_id_index));
        }
        return (SubLObject)id_index.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 23122L)
    public static SubLObject id_index_skip_tombstones_p(final SubLObject tombstone) {
        return Equality.eq((SubLObject)id_index.$kw67$SKIP, tombstone);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 23280L)
    public static SubLObject do_id_index_sparse_objects(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)id_index.$list63);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject id = (SubLObject)id_index.NIL;
        SubLObject v_object = (SubLObject)id_index.NIL;
        SubLObject v_id_index = (SubLObject)id_index.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)id_index.$list63);
        id = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)id_index.$list63);
        v_object = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)id_index.$list63);
        v_id_index = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)id_index.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)id_index.NIL;
        SubLObject current_$4 = (SubLObject)id_index.NIL;
        while (id_index.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)id_index.$list63);
            current_$4 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)id_index.$list63);
            if (id_index.NIL == conses_high.member(current_$4, (SubLObject)id_index.$list64, (SubLObject)id_index.UNPROVIDED, (SubLObject)id_index.UNPROVIDED)) {
                bad = (SubLObject)id_index.T;
            }
            if (current_$4 == id_index.$kw65$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (id_index.NIL != bad && id_index.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)id_index.$list63);
        }
        final SubLObject tombstone_tail = cdestructuring_bind.property_list_member((SubLObject)id_index.$kw66$TOMBSTONE, current);
        final SubLObject tombstone = (SubLObject)((id_index.NIL != tombstone_tail) ? conses_high.cadr(tombstone_tail) : id_index.$kw67$SKIP);
        final SubLObject ordered_tail = cdestructuring_bind.property_list_member((SubLObject)id_index.$kw68$ORDERED, current);
        final SubLObject ordered = (SubLObject)((id_index.NIL != ordered_tail) ? conses_high.cadr(ordered_tail) : id_index.NIL);
        final SubLObject progress_message_tail = cdestructuring_bind.property_list_member((SubLObject)id_index.$kw69$PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (SubLObject)((id_index.NIL != progress_message_tail) ? conses_high.cadr(progress_message_tail) : id_index.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)id_index.$kw70$DONE, current);
        final SubLObject done = (SubLObject)((id_index.NIL != done_tail) ? conses_high.cadr(done_tail) : id_index.NIL);
        final SubLObject body;
        current = (body = temp);
        if (id_index.NIL != progress_message) {
            final SubLObject idx = (SubLObject)id_index.$sym101$IDX;
            final SubLObject mess = (SubLObject)id_index.$sym102$MESS;
            final SubLObject total = (SubLObject)id_index.$sym103$TOTAL;
            final SubLObject sofar = (SubLObject)id_index.$sym104$SOFAR;
            return (SubLObject)ConsesLow.list((SubLObject)id_index.$sym40$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(idx, v_id_index), (SubLObject)ConsesLow.list(mess, progress_message), (SubLObject)ConsesLow.list(total, (SubLObject)ConsesLow.list((SubLObject)id_index.$sym105$ID_INDEX_SPARSE_OBJECT_COUNT, idx)), reader.bq_cons(sofar, (SubLObject)id_index.$list80)), (SubLObject)ConsesLow.listS((SubLObject)id_index.$sym81$CHECK_TYPE, mess, (SubLObject)id_index.$list82), (SubLObject)ConsesLow.list((SubLObject)id_index.$sym83$NOTING_PERCENT_PROGRESS, mess, (SubLObject)ConsesLow.listS((SubLObject)id_index.$sym37$DO_ID_INDEX_SPARSE_OBJECTS, (SubLObject)ConsesLow.list(id, v_object, idx, (SubLObject)id_index.$kw68$ORDERED, ordered, (SubLObject)id_index.$kw70$DONE, done), ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)id_index.$sym84$CINC, sofar), (SubLObject)ConsesLow.list((SubLObject)id_index.$sym85$NOTE_PERCENT_PROGRESS, sofar, total))))));
        }
        if (id_index.NIL != ordered && id_index.T != ordered && id_index.NIL != ordered) {
            final SubLObject idx = (SubLObject)id_index.$sym106$IDX;
            return (SubLObject)ConsesLow.list((SubLObject)id_index.$sym40$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(idx, v_id_index)), (SubLObject)ConsesLow.list((SubLObject)id_index.$sym107$PIF, ordered, (SubLObject)ConsesLow.listS((SubLObject)id_index.$sym37$DO_ID_INDEX_SPARSE_OBJECTS, (SubLObject)ConsesLow.list(id, v_object, idx, (SubLObject)id_index.$kw68$ORDERED, (SubLObject)id_index.T, (SubLObject)id_index.$kw70$DONE, done), ConsesLow.append(body, (SubLObject)id_index.NIL)), (SubLObject)ConsesLow.listS((SubLObject)id_index.$sym37$DO_ID_INDEX_SPARSE_OBJECTS, (SubLObject)ConsesLow.list(id, v_object, idx, (SubLObject)id_index.$kw68$ORDERED, (SubLObject)id_index.NIL, (SubLObject)id_index.$kw70$DONE, done), ConsesLow.append(body, (SubLObject)id_index.NIL))));
        }
        if (id_index.T == ordered) {
            final SubLObject idx = (SubLObject)id_index.$sym108$IDX;
            final SubLObject sparse = (SubLObject)id_index.$sym109$SPARSE;
            final SubLObject end_id = (SubLObject)id_index.$sym110$END_ID;
            final SubLObject v_default = (SubLObject)id_index.$sym111$DEFAULT;
            return (SubLObject)ConsesLow.list((SubLObject)id_index.$sym40$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(idx, v_id_index)), (SubLObject)ConsesLow.list((SubLObject)id_index.$sym73$PUNLESS, (SubLObject)ConsesLow.list((SubLObject)id_index.$sym91$CAND, (SubLObject)ConsesLow.list((SubLObject)id_index.$sym112$ID_INDEX_SPARSE_OBJECTS_EMPTY_P, idx), (SubLObject)ConsesLow.list((SubLObject)id_index.$sym92$ID_INDEX_SKIP_TOMBSTONES_P, tombstone)), (SubLObject)ConsesLow.list((SubLObject)id_index.$sym40$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(sparse, (SubLObject)ConsesLow.list((SubLObject)id_index.$sym36$ID_INDEX_SPARSE_OBJECTS, idx)), (SubLObject)ConsesLow.list(id, (SubLObject)ConsesLow.list((SubLObject)id_index.$sym113$ID_INDEX_SPARSE_ID_THRESHOLD, idx)), (SubLObject)ConsesLow.list(end_id, (SubLObject)ConsesLow.list((SubLObject)id_index.$sym114$ID_INDEX_NEXT_ID, idx)), (SubLObject)ConsesLow.list(v_default, (SubLObject)ConsesLow.list((SubLObject)id_index.$sym115$FUNLESS, (SubLObject)ConsesLow.list((SubLObject)id_index.$sym92$ID_INDEX_SKIP_TOMBSTONES_P, tombstone), tombstone))), (SubLObject)ConsesLow.list((SubLObject)id_index.$sym116$WHILE, (SubLObject)ConsesLow.list((SubLObject)id_index.$sym91$CAND, (SubLObject)ConsesLow.list((SubLObject)id_index.$sym117$_, id, end_id), (SubLObject)ConsesLow.list((SubLObject)id_index.$sym118$CNOT, done)), (SubLObject)ConsesLow.list((SubLObject)id_index.$sym40$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(v_object, (SubLObject)ConsesLow.list((SubLObject)id_index.$sym119$GETHASH_WITHOUT_VALUES, id, sparse, v_default))), (SubLObject)ConsesLow.listS((SubLObject)id_index.$sym73$PUNLESS, (SubLObject)ConsesLow.list((SubLObject)id_index.$sym91$CAND, (SubLObject)ConsesLow.list((SubLObject)id_index.$sym92$ID_INDEX_SKIP_TOMBSTONES_P, tombstone), (SubLObject)ConsesLow.list((SubLObject)id_index.$sym48$ID_INDEX_TOMBSTONE_P, v_object)), ConsesLow.append(body, (SubLObject)id_index.NIL))), (SubLObject)ConsesLow.list((SubLObject)id_index.$sym84$CINC, id)))));
        }
        if (id_index.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && id_index.$kw67$SKIP != tombstone) {
            Errors.error((SubLObject)id_index.$str120$Setting__TOMBSTONE_to__A_requires, tombstone);
        }
        final SubLObject idx = (SubLObject)id_index.$sym121$IDX;
        return (SubLObject)ConsesLow.list((SubLObject)id_index.$sym40$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(idx, v_id_index)), (SubLObject)ConsesLow.list((SubLObject)id_index.$sym73$PUNLESS, (SubLObject)ConsesLow.list((SubLObject)id_index.$sym112$ID_INDEX_SPARSE_OBJECTS_EMPTY_P, idx), (SubLObject)ConsesLow.listS((SubLObject)id_index.$sym122$DO_HASH_TABLE, (SubLObject)ConsesLow.list(id, v_object, (SubLObject)ConsesLow.list((SubLObject)id_index.$sym36$ID_INDEX_SPARSE_OBJECTS, idx), (SubLObject)id_index.$kw70$DONE, done), ConsesLow.append(body, (SubLObject)id_index.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 26170L)
    public static SubLObject id_index_sparse_objects_empty_p(final SubLObject v_id_index) {
        return Numbers.numE((SubLObject)id_index.ZERO_INTEGER, id_index_sparse_object_count(v_id_index));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 26328L)
    public static SubLObject id_index_sparse_object_ids(final SubLObject v_id_index) {
        final SubLObject sparse_objects = id_index_sparse_objects(v_id_index);
        final SubLObject ids = hash_table_utilities.hash_table_keys(sparse_objects);
        return Sort.sort(ids, Symbols.symbol_function((SubLObject)id_index.$sym117$_), (SubLObject)id_index.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 26592L)
    public static SubLObject new_do_id_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)id_index.$list124);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject id = (SubLObject)id_index.NIL;
        SubLObject v_object = (SubLObject)id_index.NIL;
        SubLObject v_id_index = (SubLObject)id_index.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)id_index.$list124);
        id = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)id_index.$list124);
        v_object = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)id_index.$list124);
        v_id_index = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)id_index.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)id_index.NIL;
        SubLObject current_$5 = (SubLObject)id_index.NIL;
        while (id_index.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)id_index.$list124);
            current_$5 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)id_index.$list124);
            if (id_index.NIL == conses_high.member(current_$5, (SubLObject)id_index.$list125, (SubLObject)id_index.UNPROVIDED, (SubLObject)id_index.UNPROVIDED)) {
                bad = (SubLObject)id_index.T;
            }
            if (current_$5 == id_index.$kw65$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (id_index.NIL != bad && id_index.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)id_index.$list124);
        }
        final SubLObject start_id_tail = cdestructuring_bind.property_list_member((SubLObject)id_index.$kw126$START_ID, current);
        final SubLObject start_id = (SubLObject)((id_index.NIL != start_id_tail) ? conses_high.cadr(start_id_tail) : id_index.NIL);
        final SubLObject end_id_tail = cdestructuring_bind.property_list_member((SubLObject)id_index.$kw127$END_ID, current);
        final SubLObject end_id = (SubLObject)((id_index.NIL != end_id_tail) ? conses_high.cadr(end_id_tail) : id_index.NIL);
        final SubLObject tombstone_tail = cdestructuring_bind.property_list_member((SubLObject)id_index.$kw66$TOMBSTONE, current);
        final SubLObject tombstone = (SubLObject)((id_index.NIL != tombstone_tail) ? conses_high.cadr(tombstone_tail) : id_index.$kw67$SKIP);
        final SubLObject ordered_tail = cdestructuring_bind.property_list_member((SubLObject)id_index.$kw68$ORDERED, current);
        final SubLObject ordered = (SubLObject)((id_index.NIL != ordered_tail) ? conses_high.cadr(ordered_tail) : id_index.NIL);
        final SubLObject progress_message_tail = cdestructuring_bind.property_list_member((SubLObject)id_index.$kw69$PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (SubLObject)((id_index.NIL != progress_message_tail) ? conses_high.cadr(progress_message_tail) : id_index.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)id_index.$kw70$DONE, current);
        final SubLObject done = (SubLObject)((id_index.NIL != done_tail) ? conses_high.cadr(done_tail) : id_index.NIL);
        final SubLObject body;
        current = (body = temp);
        if (!v_id_index.isAtom()) {
            final SubLObject idx = (SubLObject)id_index.$sym128$IDX;
            return (SubLObject)ConsesLow.list((SubLObject)id_index.$sym40$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(idx, v_id_index)), (SubLObject)ConsesLow.listS((SubLObject)id_index.$sym129$NEW_DO_ID_INDEX, (SubLObject)ConsesLow.list(new SubLObject[] { id, v_object, idx, id_index.$kw126$START_ID, start_id, id_index.$kw127$END_ID, end_id, id_index.$kw66$TOMBSTONE, tombstone, id_index.$kw68$ORDERED, ordered, id_index.$kw69$PROGRESS_MESSAGE, progress_message, id_index.$kw70$DONE, done }), ConsesLow.append(body, (SubLObject)id_index.NIL)));
        }
        if (!progress_message.isAtom()) {
            final SubLObject mess = (SubLObject)id_index.$sym130$MESS;
            return (SubLObject)ConsesLow.list((SubLObject)id_index.$sym40$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(mess, progress_message)), (SubLObject)ConsesLow.listS((SubLObject)id_index.$sym129$NEW_DO_ID_INDEX, (SubLObject)ConsesLow.list(new SubLObject[] { id, v_object, v_id_index, id_index.$kw126$START_ID, start_id, id_index.$kw127$END_ID, end_id, id_index.$kw66$TOMBSTONE, tombstone, id_index.$kw68$ORDERED, ordered, id_index.$kw69$PROGRESS_MESSAGE, mess, id_index.$kw70$DONE, done }), ConsesLow.append(body, (SubLObject)id_index.NIL)));
        }
        if (id_index.NIL != progress_message) {
            final SubLObject total = (SubLObject)id_index.$sym131$TOTAL;
            final SubLObject sofar = (SubLObject)id_index.$sym132$SOFAR;
            return (SubLObject)ConsesLow.list((SubLObject)id_index.$sym40$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(total, (SubLObject)ConsesLow.list((SubLObject)id_index.$sym79$ID_INDEX_COUNT, v_id_index)), reader.bq_cons(sofar, (SubLObject)id_index.$list80)), (SubLObject)ConsesLow.listS((SubLObject)id_index.$sym81$CHECK_TYPE, progress_message, (SubLObject)id_index.$list82), (SubLObject)ConsesLow.list((SubLObject)id_index.$sym83$NOTING_PERCENT_PROGRESS, progress_message, (SubLObject)ConsesLow.listS((SubLObject)id_index.$sym129$NEW_DO_ID_INDEX, (SubLObject)ConsesLow.list(new SubLObject[] { id, v_object, v_id_index, id_index.$kw126$START_ID, start_id, id_index.$kw127$END_ID, end_id, id_index.$kw66$TOMBSTONE, tombstone, id_index.$kw68$ORDERED, ordered, id_index.$kw70$DONE, done }), ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)id_index.$sym84$CINC, sofar), (SubLObject)ConsesLow.list((SubLObject)id_index.$sym85$NOTE_PERCENT_PROGRESS, sofar, total))))));
        }
        if (!tombstone.isAtom()) {
            final SubLObject tomb = (SubLObject)id_index.$sym133$TOMB;
            return (SubLObject)ConsesLow.list((SubLObject)id_index.$sym40$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(tomb, tombstone)), (SubLObject)ConsesLow.listS((SubLObject)id_index.$sym129$NEW_DO_ID_INDEX, (SubLObject)ConsesLow.list(new SubLObject[] { id, v_object, v_id_index, id_index.$kw126$START_ID, start_id, id_index.$kw127$END_ID, end_id, id_index.$kw66$TOMBSTONE, tomb, id_index.$kw68$ORDERED, ordered, id_index.$kw70$DONE, done }), ConsesLow.append(body, (SubLObject)id_index.NIL)));
        }
        if (!ordered.isAtom()) {
            final SubLObject ord = (SubLObject)id_index.$sym134$ORD;
            return (SubLObject)ConsesLow.list((SubLObject)id_index.$sym40$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(ord, ordered)), (SubLObject)ConsesLow.listS((SubLObject)id_index.$sym129$NEW_DO_ID_INDEX, (SubLObject)ConsesLow.list(new SubLObject[] { id, v_object, v_id_index, id_index.$kw126$START_ID, start_id, id_index.$kw127$END_ID, end_id, id_index.$kw66$TOMBSTONE, tombstone, id_index.$kw68$ORDERED, ord, id_index.$kw70$DONE, done }), ConsesLow.append(body, (SubLObject)id_index.NIL)));
        }
        final SubLObject last_id = (SubLObject)id_index.$sym135$LAST_ID;
        final SubLObject state_var = (SubLObject)id_index.$sym136$STATE_VAR;
        SubLObject loop_form = id;
        if (id_index.NIL != done) {
            loop_form = (SubLObject)ConsesLow.list((SubLObject)id_index.$sym91$CAND, loop_form, (SubLObject)ConsesLow.list((SubLObject)id_index.$sym118$CNOT, done));
        }
        if (id_index.NIL != subl_promotions.non_negative_integer_p(end_id)) {
            loop_form = (SubLObject)ConsesLow.list((SubLObject)id_index.$sym91$CAND, loop_form, (SubLObject)ConsesLow.list((SubLObject)id_index.$sym137$__, id, end_id));
        }
        return (SubLObject)ConsesLow.list((SubLObject)id_index.$sym73$PUNLESS, (SubLObject)ConsesLow.list((SubLObject)id_index.$sym74$ID_INDEX_OBJECTS_EMPTY_P, v_id_index, tombstone), (SubLObject)ConsesLow.list((SubLObject)id_index.$sym40$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(last_id, (SubLObject)ConsesLow.listS((SubLObject)id_index.$sym138$FIF, (SubLObject)ConsesLow.list((SubLObject)id_index.$sym45$NON_NEGATIVE_INTEGER_P, start_id), (SubLObject)ConsesLow.listS((SubLObject)id_index.$sym139$_, start_id, (SubLObject)id_index.$list140), (SubLObject)id_index.$list141)), (SubLObject)ConsesLow.list(id, (SubLObject)ConsesLow.listS((SubLObject)id_index.$sym142$DO_ID_INDEX_NEXT_ID, v_id_index, ordered, last_id, (SubLObject)id_index.$list141)), (SubLObject)ConsesLow.list(state_var, (SubLObject)ConsesLow.listS((SubLObject)id_index.$sym143$DO_ID_INDEX_NEXT_STATE, v_id_index, ordered, id, (SubLObject)id_index.$list141)), v_object), (SubLObject)ConsesLow.list((SubLObject)id_index.$sym116$WHILE, loop_form, (SubLObject)ConsesLow.list((SubLObject)id_index.$sym94$CSETQ, v_object, (SubLObject)ConsesLow.list((SubLObject)id_index.$sym144$DO_ID_INDEX_STATE_OBJECT, v_id_index, tombstone, id, state_var)), (SubLObject)ConsesLow.listS((SubLObject)id_index.$sym93$PWHEN, (SubLObject)ConsesLow.list((SubLObject)id_index.$sym145$DO_ID_INDEX_OBJECT_VALID_, v_object, tombstone), ConsesLow.append(body, (SubLObject)id_index.NIL)), (SubLObject)ConsesLow.list((SubLObject)id_index.$sym94$CSETQ, id, (SubLObject)ConsesLow.list((SubLObject)id_index.$sym142$DO_ID_INDEX_NEXT_ID, v_id_index, ordered, id, state_var)), (SubLObject)ConsesLow.list((SubLObject)id_index.$sym94$CSETQ, state_var, (SubLObject)ConsesLow.list((SubLObject)id_index.$sym143$DO_ID_INDEX_NEXT_STATE, v_id_index, ordered, id, state_var)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 29605L)
    public static SubLObject do_id_index_next_id(final SubLObject v_id_index, final SubLObject orderedP, final SubLObject last_id, final SubLObject state) {
        if (id_index.NIL == state) {
            return (SubLObject)id_index.ZERO_INTEGER;
        }
        if (id_index.NIL == last_id) {
            return (SubLObject)id_index.NIL;
        }
        final SubLObject next_id = number_utilities.f_1X(last_id);
        if (next_id.numGE(id_index_next_id(v_id_index))) {
            return (SubLObject)id_index.NIL;
        }
        return next_id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 30094L)
    public static SubLObject do_id_index_next_state(final SubLObject v_id_index, final SubLObject orderedP, final SubLObject id, final SubLObject state) {
        if (id_index.NIL == id) {
            return (SubLObject)id_index.NIL;
        }
        if (id_index.NIL == state) {
            return (id_index.NIL != id_index_dense_object_id_p(v_id_index, id)) ? id_index_dense_objects(v_id_index) : id_index_sparse_objects(v_id_index);
        }
        if (id_index.NIL != id_index_dense_object_id_p(v_id_index, id)) {
            return state.isVector() ? state : id_index_dense_objects(v_id_index);
        }
        if (state.isVector()) {
            return id_index_sparse_objects(v_id_index);
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 30781L)
    public static SubLObject do_id_index_state_object(final SubLObject v_id_index, final SubLObject tombstone, final SubLObject id, final SubLObject state) {
        SubLObject v_object = (SubLObject)id_index.NIL;
        if (state.isVector()) {
            v_object = Vectors.aref(state, id);
        }
        else if (state.isHashtable()) {
            v_object = Hashtables.gethash_without_values(id, state, id_index_tombstone());
        }
        else {
            Errors.error((SubLObject)id_index.$str146$unexpected_new_do_id_index_iterat, state);
        }
        if (id_index.NIL != id_index_tombstone_p(v_object)) {
            v_object = tombstone;
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 31270L)
    public static SubLObject do_id_index_object_validP(final SubLObject v_object, final SubLObject tombstone) {
        return (SubLObject)SubLObjectFactory.makeBoolean(id_index.NIL == id_index_skip_tombstones_p(tombstone) || !v_object.eql(tombstone));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 31459L)
    public static SubLObject id_index_old_and_new_object_counts(final SubLObject v_id_index, SubLObject new_id_threshhold) {
        if (new_id_threshhold == id_index.UNPROVIDED) {
            new_id_threshhold = (SubLObject)id_index.NIL;
        }
        final SubLObject sparse_id_threshold = id_index_sparse_id_threshold(v_id_index);
        SubLObject new_count = (SubLObject)id_index.ZERO_INTEGER;
        SubLObject old_count = (SubLObject)id_index.NIL;
        if (id_index.NIL == new_id_threshhold) {
            new_id_threshhold = sparse_id_threshold;
        }
        if (new_id_threshhold.numL(sparse_id_threshold)) {
            final SubLObject dense_objects = id_index_dense_objects(v_id_index);
            SubLObject end_var;
            SubLObject dense_id;
            SubLObject v_object;
            for (end_var = id_index_sparse_id_threshold(v_id_index), dense_id = (SubLObject)id_index.NIL, dense_id = new_id_threshhold; !dense_id.numGE(end_var); dense_id = number_utilities.f_1X(dense_id)) {
                v_object = Vectors.aref(dense_objects, dense_id);
                if (id_index.NIL != v_object) {
                    new_count = Numbers.add(new_count, (SubLObject)id_index.ONE_INTEGER);
                }
            }
        }
        new_count = Numbers.add(new_count, id_index_sparse_object_count(v_id_index));
        old_count = Numbers.subtract(id_index_count(v_id_index), new_count);
        return Values.values(old_count, new_count);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 32669L)
    public static SubLObject cfasl_output_object_id_index_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_wide_output_id_index(v_object, stream);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 32785L)
    public static SubLObject cfasl_wide_output_id_index(final SubLObject v_id_index, final SubLObject stream) {
        cfasl.cfasl_output_wide_opcode(id_index.$cfasl_wide_opcode_id_index$.getGlobalValue(), stream);
        cfasl_output_id_index_internal(v_id_index, stream);
        return v_id_index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 32982L)
    public static SubLObject cfasl_output_id_index_internal(final SubLObject v_id_index, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject id_index_lock = id_index_lock(v_id_index);
        SubLObject release = (SubLObject)id_index.NIL;
        try {
            release = Locks.seize_lock(id_index_lock);
            final SubLObject dense_object_count = id_index_dense_object_count(v_id_index);
            final SubLObject sparse_object_count = id_index_sparse_object_count(v_id_index);
            SubLObject counter = (SubLObject)id_index.NIL;
            cfasl.cfasl_output(id_index_count(v_id_index), stream);
            cfasl.cfasl_output(id_index_sparse_id_threshold(v_id_index), stream);
            cfasl.cfasl_output(dense_object_count, stream);
            cfasl.cfasl_output(sparse_object_count, stream);
            counter = (SubLObject)id_index.ZERO_INTEGER;
            if (id_index.NIL == id_index_dense_objects_empty_p(v_id_index, (SubLObject)id_index.$kw67$SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(v_id_index);
                final SubLObject backwardP_var = (SubLObject)id_index.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject v_object;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)id_index.NIL, v_iteration = (SubLObject)id_index.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)id_index.ONE_INTEGER)) {
                    id = ((id_index.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)id_index.ONE_INTEGER) : v_iteration);
                    v_object = Vectors.aref(vector_var, id);
                    if (id_index.NIL == id_index_tombstone_p(v_object) || id_index.NIL == id_index_skip_tombstones_p((SubLObject)id_index.$kw67$SKIP)) {
                        if (id_index.NIL != id_index_tombstone_p(v_object)) {
                            v_object = (SubLObject)id_index.$kw67$SKIP;
                        }
                        cfasl.cfasl_output(id, stream);
                        cfasl.cfasl_output(v_object, stream);
                        counter = Numbers.add(counter, (SubLObject)id_index.ONE_INTEGER);
                    }
                }
            }
            if (id_index.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !counter.numE(dense_object_count)) {
                Errors.error((SubLObject)id_index.$str150$Expected__A_dense_elements__got__, dense_object_count, counter);
            }
            counter = (SubLObject)id_index.ZERO_INTEGER;
            if (id_index.NIL == id_index_sparse_objects_empty_p(v_id_index)) {
                final SubLObject cdohash_table = id_index_sparse_objects(v_id_index);
                SubLObject id2 = (SubLObject)id_index.NIL;
                SubLObject v_object2 = (SubLObject)id_index.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        v_object2 = Hashtables.getEntryValue(cdohash_entry);
                        cfasl.cfasl_output(id2, stream);
                        cfasl.cfasl_output(v_object2, stream);
                        counter = Numbers.add(counter, (SubLObject)id_index.ONE_INTEGER);
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
            if (id_index.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !counter.numE(sparse_object_count)) {
                Errors.error((SubLObject)id_index.$str151$Expected__A_sparse_elements__got_, sparse_object_count, counter);
            }
        }
        finally {
            if (id_index.NIL != release) {
                Locks.release_lock(id_index_lock);
            }
        }
        return v_id_index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 34216L)
    public static SubLObject cfasl_input_id_index(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject count = cfasl.cfasl_input(stream, (SubLObject)id_index.UNPROVIDED, (SubLObject)id_index.UNPROVIDED);
        final SubLObject dense_objects_size = cfasl.cfasl_input(stream, (SubLObject)id_index.UNPROVIDED, (SubLObject)id_index.UNPROVIDED);
        final SubLObject dense_count = cfasl.cfasl_input(stream, (SubLObject)id_index.UNPROVIDED, (SubLObject)id_index.UNPROVIDED);
        final SubLObject sparse_count = cfasl.cfasl_input(stream, (SubLObject)id_index.UNPROVIDED, (SubLObject)id_index.UNPROVIDED);
        final SubLObject v_id_index = new_id_index(dense_objects_size, (SubLObject)id_index.UNPROVIDED);
        SubLObject i;
        SubLObject id;
        SubLObject v_object;
        for (i = (SubLObject)id_index.NIL, i = (SubLObject)id_index.ZERO_INTEGER; i.numL(dense_count); i = Numbers.add(i, (SubLObject)id_index.ONE_INTEGER)) {
            id = cfasl.cfasl_input(stream, (SubLObject)id_index.UNPROVIDED, (SubLObject)id_index.UNPROVIDED);
            v_object = cfasl.cfasl_input(stream, (SubLObject)id_index.UNPROVIDED, (SubLObject)id_index.UNPROVIDED);
            id_index_enter(v_id_index, id, v_object);
        }
        for (i = (SubLObject)id_index.NIL, i = (SubLObject)id_index.ZERO_INTEGER; i.numL(sparse_count); i = Numbers.add(i, (SubLObject)id_index.ONE_INTEGER)) {
            id = cfasl.cfasl_input(stream, (SubLObject)id_index.UNPROVIDED, (SubLObject)id_index.UNPROVIDED);
            v_object = cfasl.cfasl_input(stream, (SubLObject)id_index.UNPROVIDED, (SubLObject)id_index.UNPROVIDED);
            id_index_enter(v_id_index, id, v_object);
        }
        if (id_index.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !count.numE(id_index_count(v_id_index))) {
            Errors.error((SubLObject)id_index.$str152$The_sparse_ID_index_should_have__, count, id_index_count(v_id_index));
        }
        return v_id_index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 35565L)
    public static SubLObject test_id_index_cfasl_serialization(final SubLObject num_of_dense, final SubLObject num_of_sparse, SubLObject id_to_value_fn, SubLObject testfn) {
        if (id_to_value_fn == id_index.UNPROVIDED) {
            id_to_value_fn = (SubLObject)id_index.$sym162$TO_STRING;
        }
        if (testfn == id_index.UNPROVIDED) {
            testfn = Symbols.symbol_function((SubLObject)id_index.EQUAL);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_id_index = new_id_index_for_testing_purposes(num_of_dense, num_of_sparse, id_to_value_fn);
        SubLObject new_id_index = (SubLObject)id_index.NIL;
        SubLObject tombs;
        SubLObject i;
        for (tombs = Numbers.max((SubLObject)id_index.FIVE_INTEGER, Numbers.integerDivide(num_of_dense, (SubLObject)id_index.TWENTY_INTEGER)), i = (SubLObject)id_index.NIL, i = (SubLObject)id_index.ZERO_INTEGER; i.numL(tombs); i = Numbers.add(i, (SubLObject)id_index.ONE_INTEGER)) {
            id_index_remove(v_id_index, random.random(num_of_dense));
        }
        new_id_index = cfasl_utilities.cfasl_copy_object(v_id_index);
        if (id_index.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && id_index.NIL == id_index_p(new_id_index)) {
            Errors.error((SubLObject)id_index.$str163$We_did_not_get_an_ID_index_back__, new_id_index);
        }
        if (id_index.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !id_index_count(v_id_index).numE(id_index_count(new_id_index))) {
            Errors.error((SubLObject)id_index.$str164$The_dense_ID_index__A_does_not_ha, v_id_index, new_id_index);
        }
        return (SubLObject)id_index.$kw165$SUCCESS;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 36718L)
    public static SubLObject id_index_optimized_p(final SubLObject v_id_index) {
        return Numbers.numLE(id_index_next_id(v_id_index), id_index_sparse_id_threshold(v_id_index));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 37248L)
    public static SubLObject optimize_id_index(final SubLObject v_id_index, SubLObject size) {
        if (size == id_index.UNPROVIDED) {
            size = (SubLObject)id_index.NIL;
        }
        assert id_index.NIL != id_index_p(v_id_index) : v_id_index;
        if (id_index.NIL != size && !id_index.assertionsDisabledSynth && id_index.NIL == subl_promotions.non_negative_integer_p(size)) {
            throw new AssertionError(size);
        }
        final SubLObject id_index_lock = id_index_lock(v_id_index);
        SubLObject release = (SubLObject)id_index.NIL;
        try {
            release = Locks.seize_lock(id_index_lock);
            final SubLObject next_id = id_index_next_id(v_id_index);
            final SubLObject sparse_size = (id_index.NIL != size) ? Numbers.max(size, next_id) : next_id;
            final SubLObject sparse_objects = id_index_sparse_objects(v_id_index);
            final SubLObject dense_objects = id_index_dense_objects(v_id_index);
            final SubLObject dense_object_limit = Sequences.length(dense_objects);
            if (sparse_size.numG(dense_object_limit)) {
                final SubLObject optimized_dense_objects = Vectors.make_vector(sparse_size, (SubLObject)id_index.NIL);
                Sequences.replace(optimized_dense_objects, dense_objects, (SubLObject)id_index.ZERO_INTEGER, Numbers.min(sparse_size, dense_object_limit), (SubLObject)id_index.ZERO_INTEGER, Numbers.min(sparse_size, dense_object_limit));
                SubLObject id = (SubLObject)id_index.NIL;
                SubLObject v_object = (SubLObject)id_index.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(sparse_objects);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id = Hashtables.getEntryKey(cdohash_entry);
                        v_object = Hashtables.getEntryValue(cdohash_entry);
                        Vectors.set_aref(optimized_dense_objects, id, v_object);
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
                _csetf_idix_dense_objects(v_id_index, optimized_dense_objects);
                Hashtables.clrhash(sparse_objects);
            }
        }
        finally {
            if (id_index.NIL != release) {
                Locks.release_lock(id_index_lock);
            }
        }
        return v_id_index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 38425L)
    public static SubLObject id_index_pessimized_p(final SubLObject v_id_index) {
        return Numbers.zerop(Sequences.length(id_index_dense_objects(v_id_index)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 38779L)
    public static SubLObject pessimize_id_index(final SubLObject v_id_index) {
        assert id_index.NIL != id_index_p(v_id_index) : v_id_index;
        final SubLObject id_index_lock = id_index_lock(v_id_index);
        SubLObject release = (SubLObject)id_index.NIL;
        try {
            release = Locks.seize_lock(id_index_lock);
            final SubLObject sparse_objects = id_index_sparse_objects(v_id_index);
            if (id_index.NIL == id_index_dense_objects_empty_p(v_id_index, (SubLObject)id_index.$kw67$SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(v_id_index);
                final SubLObject backwardP_var = (SubLObject)id_index.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject v_object;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)id_index.NIL, v_iteration = (SubLObject)id_index.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)id_index.ONE_INTEGER)) {
                    id = ((id_index.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)id_index.ONE_INTEGER) : v_iteration);
                    v_object = Vectors.aref(vector_var, id);
                    if (id_index.NIL == id_index_tombstone_p(v_object) || id_index.NIL == id_index_skip_tombstones_p((SubLObject)id_index.$kw67$SKIP)) {
                        if (id_index.NIL != id_index_tombstone_p(v_object)) {
                            v_object = (SubLObject)id_index.$kw67$SKIP;
                        }
                        Hashtables.sethash(id, sparse_objects, v_object);
                    }
                }
            }
            _csetf_idix_dense_objects(v_id_index, Vectors.make_vector((SubLObject)id_index.ZERO_INTEGER, (SubLObject)id_index.UNPROVIDED));
        }
        finally {
            if (id_index.NIL != release) {
                Locks.release_lock(id_index_lock);
            }
        }
        assert id_index.NIL != id_index_pessimized_p(v_id_index) : v_id_index;
        return v_id_index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 39267L)
    public static SubLObject id_index_compact_p(final SubLObject v_id_index) {
        return Numbers.numE(id_index_next_id(v_id_index), id_index_count(v_id_index));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 39679L)
    public static SubLObject compact_id_index(final SubLObject v_id_index, SubLObject new_id_notification_function) {
        if (new_id_notification_function == id_index.UNPROVIDED) {
            new_id_notification_function = (SubLObject)id_index.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert id_index.NIL != id_index_p(v_id_index) : v_id_index;
        if (id_index.NIL != id_index_compact_p(v_id_index)) {
            return v_id_index;
        }
        final SubLObject id_index_lock = id_index_lock(v_id_index);
        SubLObject release = (SubLObject)id_index.NIL;
        try {
            release = Locks.seize_lock(id_index_lock);
            final SubLObject dense_total = id_index_count(v_id_index);
            final SubLObject compact_dense_objects = Vectors.make_vector(dense_total, (SubLObject)id_index.NIL);
            SubLObject next_id = (SubLObject)id_index.ZERO_INTEGER;
            final SubLObject mess = (SubLObject)id_index.$str167$Compacting_ID_index;
            final SubLObject total = id_index_count(v_id_index);
            SubLObject sofar = (SubLObject)id_index.ZERO_INTEGER;
            assert id_index.NIL != Types.stringp(mess) : mess;
            final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)id_index.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)id_index.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)id_index.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(mess);
                    if (id_index.NIL == id_index_objects_empty_p(v_id_index, (SubLObject)id_index.$kw67$SKIP)) {
                        if (id_index.NIL == id_index_dense_objects_empty_p(v_id_index, (SubLObject)id_index.$kw67$SKIP)) {
                            final SubLObject vector_var = id_index_dense_objects(v_id_index);
                            final SubLObject backwardP_var = (SubLObject)id_index.NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject dense_id;
                            SubLObject v_object;
                            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)id_index.NIL, v_iteration = (SubLObject)id_index.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)id_index.ONE_INTEGER)) {
                                dense_id = ((id_index.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)id_index.ONE_INTEGER) : v_iteration);
                                v_object = Vectors.aref(vector_var, dense_id);
                                if (id_index.NIL == id_index_tombstone_p(v_object) || id_index.NIL == id_index_skip_tombstones_p((SubLObject)id_index.$kw67$SKIP)) {
                                    if (id_index.NIL != id_index_tombstone_p(v_object)) {
                                        v_object = (SubLObject)id_index.$kw67$SKIP;
                                    }
                                    Vectors.set_aref(compact_dense_objects, next_id, v_object);
                                    next_id = Numbers.add(next_id, (SubLObject)id_index.ONE_INTEGER);
                                    sofar = Numbers.add(sofar, (SubLObject)id_index.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                }
                            }
                        }
                        if (id_index.NIL == id_index_sparse_objects_empty_p(v_id_index)) {
                            final SubLObject cdohash_table = id_index_sparse_objects(v_id_index);
                            SubLObject dense_id2 = (SubLObject)id_index.NIL;
                            SubLObject v_object2 = (SubLObject)id_index.NIL;
                            final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                            try {
                                while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                                    final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                                    dense_id2 = Hashtables.getEntryKey(cdohash_entry);
                                    v_object2 = Hashtables.getEntryValue(cdohash_entry);
                                    Vectors.set_aref(compact_dense_objects, next_id, v_object2);
                                    next_id = Numbers.add(next_id, (SubLObject)id_index.ONE_INTEGER);
                                    sofar = Numbers.add(sofar, (SubLObject)id_index.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                }
                            }
                            finally {
                                Hashtables.releaseEntrySetIterator(cdohash_iterator);
                            }
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$9 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)id_index.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
            }
            _csetf_idix_next_id(v_id_index, next_id);
            _csetf_idix_dense_objects(v_id_index, compact_dense_objects);
            Hashtables.clrhash(id_index_sparse_objects(v_id_index));
            if (id_index.NIL != new_id_notification_function) {
                assert id_index.NIL != Types.function_spec_p(new_id_notification_function) : new_id_notification_function;
                final SubLObject mess2 = (SubLObject)id_index.$str170$Updating_object_IDs;
                final SubLObject total2 = id_index_count(v_id_index);
                SubLObject sofar2 = (SubLObject)id_index.ZERO_INTEGER;
                assert id_index.NIL != Types.stringp(mess2) : mess2;
                final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                try {
                    utilities_macros.$last_percent_progress_index$.bind((SubLObject)id_index.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)id_index.NIL, thread);
                    utilities_macros.$within_noting_percent_progress$.bind((SubLObject)id_index.T, thread);
                    utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                    try {
                        utilities_macros.noting_percent_progress_preamble(mess2);
                        if (id_index.NIL == id_index_objects_empty_p(v_id_index, (SubLObject)id_index.$kw67$SKIP)) {
                            if (id_index.NIL == id_index_dense_objects_empty_p(v_id_index, (SubLObject)id_index.$kw67$SKIP)) {
                                final SubLObject vector_var2 = id_index_dense_objects(v_id_index);
                                final SubLObject backwardP_var2 = (SubLObject)id_index.NIL;
                                SubLObject v_object2;
                                SubLObject length2;
                                SubLObject v_iteration2;
                                SubLObject sparse_id;
                                for (length2 = Sequences.length(vector_var2), v_iteration2 = (SubLObject)id_index.NIL, v_iteration2 = (SubLObject)id_index.ZERO_INTEGER; v_iteration2.numL(length2); v_iteration2 = Numbers.add(v_iteration2, (SubLObject)id_index.ONE_INTEGER)) {
                                    sparse_id = ((id_index.NIL != backwardP_var2) ? Numbers.subtract(length2, v_iteration2, (SubLObject)id_index.ONE_INTEGER) : v_iteration2);
                                    v_object2 = Vectors.aref(vector_var2, sparse_id);
                                    if (id_index.NIL == id_index_tombstone_p(v_object2) || id_index.NIL == id_index_skip_tombstones_p((SubLObject)id_index.$kw67$SKIP)) {
                                        if (id_index.NIL != id_index_tombstone_p(v_object2)) {
                                            v_object2 = (SubLObject)id_index.$kw67$SKIP;
                                        }
                                        Functions.funcall(new_id_notification_function, v_object2, sparse_id);
                                        sofar2 = Numbers.add(sofar2, (SubLObject)id_index.ONE_INTEGER);
                                        utilities_macros.note_percent_progress(sofar2, total2);
                                    }
                                }
                            }
                            if (id_index.NIL == id_index_sparse_objects_empty_p(v_id_index)) {
                                final SubLObject cdohash_table2 = id_index_sparse_objects(v_id_index);
                                SubLObject sparse_id2 = (SubLObject)id_index.NIL;
                                SubLObject v_object3 = (SubLObject)id_index.NIL;
                                final Iterator cdohash_iterator2 = Hashtables.getEntrySetIterator(cdohash_table2);
                                try {
                                    while (Hashtables.iteratorHasNext(cdohash_iterator2)) {
                                        final Map.Entry cdohash_entry2 = Hashtables.iteratorNextEntry(cdohash_iterator2);
                                        sparse_id2 = Hashtables.getEntryKey(cdohash_entry2);
                                        v_object3 = Hashtables.getEntryValue(cdohash_entry2);
                                        Functions.funcall(new_id_notification_function, v_object3, sparse_id2);
                                        sofar2 = Numbers.add(sofar2, (SubLObject)id_index.ONE_INTEGER);
                                        utilities_macros.note_percent_progress(sofar2, total2);
                                    }
                                }
                                finally {
                                    Hashtables.releaseEntrySetIterator(cdohash_iterator2);
                                }
                            }
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)id_index.T, thread);
                            final SubLObject _values2 = Values.getValuesAsVector();
                            utilities_macros.noting_percent_progress_postamble();
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                        }
                    }
                }
                finally {
                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
                }
            }
        }
        finally {
            if (id_index.NIL != release) {
                Locks.release_lock(id_index_lock);
            }
        }
        return v_id_index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 41022L)
    public static SubLObject new_indirect_compact_id_index(final SubLObject v_id_index) {
        assert id_index.NIL != id_index_p(v_id_index) : v_id_index;
        SubLObject compact_id = (SubLObject)id_index.ZERO_INTEGER;
        SubLObject new_id_index = (SubLObject)id_index.NIL;
        final SubLObject id_index_lock = id_index_lock(v_id_index);
        SubLObject release = (SubLObject)id_index.NIL;
        try {
            release = Locks.seize_lock(id_index_lock);
            final SubLObject dense_objects = id_index_dense_objects(v_id_index);
            final SubLObject dense_objects_size = Sequences.length(dense_objects);
            final SubLObject initial_next_id = id_index_next_id(v_id_index);
            new_id_index = new_id_index(dense_objects_size, initial_next_id);
            SubLObject dense_id;
            SubLObject v_object;
            for (dense_id = (SubLObject)id_index.NIL, dense_id = (SubLObject)id_index.ZERO_INTEGER; dense_id.numL(dense_objects_size); dense_id = Numbers.add(dense_id, (SubLObject)id_index.ONE_INTEGER)) {
                v_object = Vectors.aref(dense_objects, dense_id);
                if (id_index.NIL != v_object) {
                    id_index_enter(new_id_index, dense_id, compact_id);
                    compact_id = Numbers.add(compact_id, (SubLObject)id_index.ONE_INTEGER);
                }
            }
            final SubLObject sparse_objects = id_index_sparse_objects(v_id_index);
            final SubLObject sparse_objects_size = Hashtables.hash_table_count(sparse_objects);
            SubLObject sparse_object_id_store = Vectors.make_vector(sparse_objects_size, (SubLObject)id_index.NIL);
            SubLObject sparse_object_id_position = (SubLObject)id_index.ZERO_INTEGER;
            SubLObject dense_id2 = (SubLObject)id_index.NIL;
            SubLObject v_object2 = (SubLObject)id_index.NIL;
            final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(sparse_objects);
            try {
                while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                    final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                    dense_id2 = Hashtables.getEntryKey(cdohash_entry);
                    v_object2 = Hashtables.getEntryValue(cdohash_entry);
                    if (id_index.NIL != v_object2) {
                        Vectors.set_aref(sparse_object_id_store, sparse_object_id_position, dense_id2);
                        sparse_object_id_position = Numbers.add(sparse_object_id_position, (SubLObject)id_index.ONE_INTEGER);
                    }
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(cdohash_iterator);
            }
            final SubLObject vector_var;
            sparse_object_id_store = (vector_var = Sort.sort(sparse_object_id_store, Symbols.symbol_function((SubLObject)id_index.$sym117$_), (SubLObject)id_index.UNPROVIDED));
            final SubLObject backwardP_var = (SubLObject)id_index.NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject dense_id3;
            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)id_index.NIL, v_iteration = (SubLObject)id_index.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)id_index.ONE_INTEGER)) {
                element_num = ((id_index.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)id_index.ONE_INTEGER) : v_iteration);
                dense_id3 = Vectors.aref(vector_var, element_num);
                id_index_enter(new_id_index, dense_id3, compact_id);
                compact_id = Numbers.add(compact_id, (SubLObject)id_index.ONE_INTEGER);
            }
        }
        finally {
            if (id_index.NIL != release) {
                Locks.release_lock(id_index_lock);
            }
        }
        return new_id_index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 42875L)
    public static SubLObject id_index_ids(final SubLObject v_id_index) {
        assert id_index.NIL != id_index_p(v_id_index) : v_id_index;
        SubLObject ids = (SubLObject)id_index.NIL;
        if (id_index.NIL == id_index_objects_empty_p(v_id_index, (SubLObject)id_index.$kw67$SKIP)) {
            if (id_index.NIL == id_index_dense_objects_empty_p(v_id_index, (SubLObject)id_index.$kw67$SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(v_id_index);
                final SubLObject backwardP_var = (SubLObject)id_index.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject v_object;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)id_index.NIL, v_iteration = (SubLObject)id_index.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)id_index.ONE_INTEGER)) {
                    id = ((id_index.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)id_index.ONE_INTEGER) : v_iteration);
                    v_object = Vectors.aref(vector_var, id);
                    if (id_index.NIL == id_index_tombstone_p(v_object) || id_index.NIL == id_index_skip_tombstones_p((SubLObject)id_index.$kw67$SKIP)) {
                        if (id_index.NIL != id_index_tombstone_p(v_object)) {
                            v_object = (SubLObject)id_index.$kw67$SKIP;
                        }
                        ids = (SubLObject)ConsesLow.cons(id, ids);
                    }
                }
            }
            if (id_index.NIL == id_index_sparse_objects_empty_p(v_id_index)) {
                final SubLObject cdohash_table = id_index_sparse_objects(v_id_index);
                SubLObject id2 = (SubLObject)id_index.NIL;
                SubLObject v_object2 = (SubLObject)id_index.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        v_object2 = Hashtables.getEntryValue(cdohash_entry);
                        ids = (SubLObject)ConsesLow.cons(id2, ids);
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return Sequences.nreverse(ids);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 43142L)
    public static SubLObject id_index_values(final SubLObject v_id_index) {
        assert id_index.NIL != id_index_p(v_id_index) : v_id_index;
        SubLObject values = (SubLObject)id_index.NIL;
        if (id_index.NIL == id_index_objects_empty_p(v_id_index, (SubLObject)id_index.$kw67$SKIP)) {
            if (id_index.NIL == id_index_dense_objects_empty_p(v_id_index, (SubLObject)id_index.$kw67$SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(v_id_index);
                final SubLObject backwardP_var = (SubLObject)id_index.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject v_object;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)id_index.NIL, v_iteration = (SubLObject)id_index.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)id_index.ONE_INTEGER)) {
                    id = ((id_index.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)id_index.ONE_INTEGER) : v_iteration);
                    v_object = Vectors.aref(vector_var, id);
                    if (id_index.NIL == id_index_tombstone_p(v_object) || id_index.NIL == id_index_skip_tombstones_p((SubLObject)id_index.$kw67$SKIP)) {
                        if (id_index.NIL != id_index_tombstone_p(v_object)) {
                            v_object = (SubLObject)id_index.$kw67$SKIP;
                        }
                        values = (SubLObject)ConsesLow.cons(v_object, values);
                    }
                }
            }
            if (id_index.NIL == id_index_sparse_objects_empty_p(v_id_index)) {
                final SubLObject cdohash_table = id_index_sparse_objects(v_id_index);
                SubLObject id2 = (SubLObject)id_index.NIL;
                SubLObject v_object2 = (SubLObject)id_index.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        v_object2 = Hashtables.getEntryValue(cdohash_entry);
                        values = (SubLObject)ConsesLow.cons(v_object2, values);
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return Sequences.nreverse(values);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 43410L)
    public static SubLObject clone_id_index(final SubLObject v_id_index) {
        final SubLObject dense_objects_size = id_index_sparse_id_threshold(v_id_index);
        final SubLObject initial_next_id = id_index_next_id(v_id_index);
        return new_id_index(dense_objects_size, initial_next_id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 43707L)
    public static SubLObject copy_id_index(final SubLObject v_id_index, SubLObject optimizeP) {
        if (optimizeP == id_index.UNPROVIDED) {
            optimizeP = (SubLObject)id_index.NIL;
        }
        final SubLObject next_id = id_index_next_id(v_id_index);
        final SubLObject new_id_index = (id_index.NIL != optimizeP) ? new_id_index(next_id, (SubLObject)id_index.UNPROVIDED) : clone_id_index(v_id_index);
        if (id_index.NIL == id_index_objects_empty_p(v_id_index, (SubLObject)id_index.$kw67$SKIP)) {
            if (id_index.NIL == id_index_dense_objects_empty_p(v_id_index, (SubLObject)id_index.$kw67$SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(v_id_index);
                final SubLObject backwardP_var = (SubLObject)id_index.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject v_object;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)id_index.NIL, v_iteration = (SubLObject)id_index.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)id_index.ONE_INTEGER)) {
                    id = ((id_index.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)id_index.ONE_INTEGER) : v_iteration);
                    v_object = Vectors.aref(vector_var, id);
                    if (id_index.NIL == id_index_tombstone_p(v_object) || id_index.NIL == id_index_skip_tombstones_p((SubLObject)id_index.$kw67$SKIP)) {
                        if (id_index.NIL != id_index_tombstone_p(v_object)) {
                            v_object = (SubLObject)id_index.$kw67$SKIP;
                        }
                        id_index_enter(new_id_index, id, v_object);
                    }
                }
            }
            if (id_index.NIL == id_index_sparse_objects_empty_p(v_id_index)) {
                final SubLObject cdohash_table = id_index_sparse_objects(v_id_index);
                SubLObject id2 = (SubLObject)id_index.NIL;
                SubLObject v_object2 = (SubLObject)id_index.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        v_object2 = Hashtables.getEntryValue(cdohash_entry);
                        id_index_enter(new_id_index, id2, v_object2);
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return new_id_index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 44095L)
    public static SubLObject id_index_missing_ids(final SubLObject v_id_index, SubLObject type, SubLObject before_id) {
        if (type == id_index.UNPROVIDED) {
            type = (SubLObject)id_index.$kw171$ALL;
        }
        if (before_id == id_index.UNPROVIDED) {
            before_id = (SubLObject)id_index.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert id_index.NIL != id_index_p(v_id_index) : v_id_index;
        if (id_index.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && id_index.NIL == conses_high.member(type, (SubLObject)id_index.$list172, (SubLObject)id_index.UNPROVIDED, (SubLObject)id_index.UNPROVIDED)) {
            Errors.error((SubLObject)id_index.$str173$Type_must_be_one_of_____ALL__DENS);
        }
        if (id_index.NIL == before_id) {
            before_id = id_index_next_id(v_id_index);
        }
        SubLObject missing_ids = (SubLObject)id_index.NIL;
        if (id_index.$kw174$SPARSE != type) {
            final SubLObject dense_objects = id_index_dense_objects(v_id_index);
            SubLObject doneP = (SubLObject)id_index.NIL;
            final SubLObject vector_var = dense_objects;
            final SubLObject backwardP_var = (SubLObject)id_index.NIL;
            final SubLObject length = Sequences.length(vector_var);
            SubLObject current;
            final SubLObject datum = current = (SubLObject)((id_index.NIL != backwardP_var) ? ConsesLow.list(Numbers.subtract(length, (SubLObject)id_index.ONE_INTEGER), (SubLObject)id_index.MINUS_ONE_INTEGER, (SubLObject)id_index.MINUS_ONE_INTEGER) : ConsesLow.list((SubLObject)id_index.ZERO_INTEGER, length, (SubLObject)id_index.ONE_INTEGER));
            SubLObject start = (SubLObject)id_index.NIL;
            SubLObject end = (SubLObject)id_index.NIL;
            SubLObject delta = (SubLObject)id_index.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)id_index.$list175);
            start = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)id_index.$list175);
            end = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)id_index.$list175);
            delta = current.first();
            current = current.rest();
            if (id_index.NIL == current) {
                if (id_index.NIL == doneP) {
                    SubLObject end_var;
                    SubLObject id;
                    SubLObject v_object;
                    for (end_var = end, id = (SubLObject)id_index.NIL, id = start; id_index.NIL == doneP && id_index.NIL == subl_macros.do_numbers_endtest(id, delta, end_var); id = Numbers.add(id, delta)) {
                        v_object = Vectors.aref(vector_var, id);
                        if (id_index.NIL == v_object) {
                            if (before_id.numLE(id)) {
                                doneP = (SubLObject)id_index.T;
                            }
                            else {
                                missing_ids = (SubLObject)ConsesLow.cons(id, missing_ids);
                            }
                        }
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)id_index.$list175);
            }
        }
        if (id_index.$kw176$DENSE != type) {
            final SubLObject sparse_objects = id_index_sparse_objects(v_id_index);
            final SubLObject sparse_id_start = id_index_sparse_id_threshold(v_id_index);
            final SubLObject max_id_end = id_index_next_id(v_id_index);
            SubLObject end_var2;
            SubLObject sparse_id_end;
            SubLObject id2;
            SubLObject v_object2;
            for (sparse_id_end = (end_var2 = Numbers.min(before_id, max_id_end)), id2 = (SubLObject)id_index.NIL, id2 = sparse_id_start; !id2.numGE(end_var2); id2 = number_utilities.f_1X(id2)) {
                v_object2 = Hashtables.gethash_without_values(id2, sparse_objects, (SubLObject)id_index.UNPROVIDED);
                if (id_index.NIL == v_object2) {
                    missing_ids = (SubLObject)ConsesLow.cons(id2, missing_ids);
                }
            }
        }
        return Sequences.nreverse(missing_ids);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 45969L)
    public static SubLObject test_id_index_missing_ids(final SubLObject dense, final SubLObject sparse, final SubLObject holes) {
        final SubLObject v_id_index = new_id_index_for_testing_purposes_with_random_holes(dense, sparse, holes, (SubLObject)id_index.UNPROVIDED);
        final SubLObject max_id = id_index_next_id(v_id_index);
        final SubLObject present_ids = set_utilities.construct_set_from_list(id_index_ids(v_id_index), (SubLObject)id_index.UNPROVIDED, (SubLObject)id_index.UNPROVIDED);
        final SubLObject absent_ids = set_utilities.construct_set_from_list(id_index_missing_ids(v_id_index, (SubLObject)id_index.$kw171$ALL, (SubLObject)id_index.UNPROVIDED), (SubLObject)id_index.UNPROVIDED, (SubLObject)id_index.UNPROVIDED);
        SubLObject id;
        SubLObject expected;
        for (id = (SubLObject)id_index.NIL, id = (SubLObject)id_index.ZERO_INTEGER; id.numL(max_id); id = Numbers.add(id, (SubLObject)id_index.ONE_INTEGER)) {
            if (id_index.NIL == set.set_memberP(id, present_ids) && id_index.NIL == set.set_memberP(id, absent_ids)) {
                expected = Types.stringp(id_index_lookup(v_id_index, id, (SubLObject)id_index.UNPROVIDED));
                Errors.error((SubLObject)id_index.$str179$ID__A_is_missing__it_is__A_, (SubLObject)((id_index.NIL != expected) ? id_index.$str180$expected_to_be_present : id_index.$str181$expected_to_be_absent));
            }
        }
        return (SubLObject)id_index.$kw165$SUCCESS;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 46740L)
    public static SubLObject build_reverse_index_for_id_index(final SubLObject v_id_index, final SubLObject map, SubLObject collate_duplicatesP) {
        if (collate_duplicatesP == id_index.UNPROVIDED) {
            collate_duplicatesP = (SubLObject)id_index.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (id_index.NIL == id_index_objects_empty_p(v_id_index, (SubLObject)id_index.$kw67$SKIP)) {
            if (id_index.NIL == id_index_dense_objects_empty_p(v_id_index, (SubLObject)id_index.$kw67$SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(v_id_index);
                final SubLObject backwardP_var = (SubLObject)id_index.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject value;
                SubLObject ids;
                SubLObject foundp;
                SubLObject prev_id;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)id_index.NIL, v_iteration = (SubLObject)id_index.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)id_index.ONE_INTEGER)) {
                    id = ((id_index.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)id_index.ONE_INTEGER) : v_iteration);
                    value = Vectors.aref(vector_var, id);
                    if (id_index.NIL == id_index_tombstone_p(value) || id_index.NIL == id_index_skip_tombstones_p((SubLObject)id_index.$kw67$SKIP)) {
                        if (id_index.NIL != id_index_tombstone_p(value)) {
                            value = (SubLObject)id_index.$kw67$SKIP;
                        }
                        if (id_index.NIL != collate_duplicatesP) {
                            thread.resetMultipleValues();
                            ids = map_utilities.map_get(map, value, (SubLObject)id_index.UNPROVIDED);
                            foundp = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (id_index.NIL != foundp) {
                                if (ids.isList()) {
                                    ids = (SubLObject)ConsesLow.cons(id, ids);
                                    map_utilities.map_put(map, value, ids);
                                }
                                else {
                                    prev_id = ids;
                                    map_utilities.map_put(map, value, (SubLObject)ConsesLow.list(id, prev_id));
                                }
                            }
                            else {
                                map_utilities.map_put(map, value, id);
                            }
                        }
                        else {
                            map_utilities.map_put(map, value, id);
                        }
                    }
                }
            }
            if (id_index.NIL == id_index_sparse_objects_empty_p(v_id_index)) {
                final SubLObject cdohash_table = id_index_sparse_objects(v_id_index);
                SubLObject id2 = (SubLObject)id_index.NIL;
                SubLObject value2 = (SubLObject)id_index.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        value2 = Hashtables.getEntryValue(cdohash_entry);
                        if (id_index.NIL != collate_duplicatesP) {
                            thread.resetMultipleValues();
                            SubLObject ids2 = map_utilities.map_get(map, value2, (SubLObject)id_index.UNPROVIDED);
                            final SubLObject foundp2 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (id_index.NIL != foundp2) {
                                if (ids2.isList()) {
                                    ids2 = (SubLObject)ConsesLow.cons(id2, ids2);
                                    map_utilities.map_put(map, value2, ids2);
                                }
                                else {
                                    final SubLObject prev_id2 = ids2;
                                    map_utilities.map_put(map, value2, (SubLObject)ConsesLow.list(id2, prev_id2));
                                }
                            }
                            else {
                                map_utilities.map_put(map, value2, id2);
                            }
                        }
                        else {
                            map_utilities.map_put(map, value2, id2);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return map;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 47603L)
    public static SubLObject new_id_index_from_reverse_index(final SubLObject map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject max_id = find_max_index_id_in_reverse_index(map);
        final SubLObject new_id_index = new_id_index(max_id, (SubLObject)id_index.UNPROVIDED);
        final SubLObject iterator = map_utilities.new_map_iterator(map);
        SubLObject valid;
        for (SubLObject done_var = (SubLObject)id_index.NIL; id_index.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(id_index.NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject entry = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (id_index.NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = entry;
                SubLObject key = (SubLObject)id_index.NIL;
                SubLObject id = (SubLObject)id_index.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)id_index.$list182);
                key = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)id_index.$list182);
                id = current.first();
                current = current.rest();
                if (id_index.NIL == current) {
                    id_index_enter(new_id_index, id, key);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)id_index.$list182);
                }
            }
        }
        return new_id_index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 48337L)
    public static SubLObject find_max_index_id_in_reverse_index(final SubLObject map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject max = (SubLObject)id_index.MINUS_ONE_INTEGER;
        SubLObject max_key = (SubLObject)id_index.NIL;
        final SubLObject iterator = map_utilities.new_map_iterator(map);
        SubLObject valid;
        for (SubLObject done_var = (SubLObject)id_index.NIL; id_index.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(id_index.NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject entry = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (id_index.NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = entry;
                SubLObject key = (SubLObject)id_index.NIL;
                SubLObject id = (SubLObject)id_index.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)id_index.$list182);
                key = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)id_index.$list182);
                id = current.first();
                current = current.rest();
                if (id_index.NIL == current) {
                    if (max.numL(id)) {
                        max = id;
                        max_key = key;
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)id_index.$list182);
                }
            }
        }
        return Values.values(max, max_key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 49058L)
    public static SubLObject test_new_index_from_reverse_index(final SubLObject num_of_dense, final SubLObject num_of_sparse, SubLObject id_to_value_fn, SubLObject testfn) {
        if (id_to_value_fn == id_index.UNPROVIDED) {
            id_to_value_fn = (SubLObject)id_index.$sym162$TO_STRING;
        }
        if (testfn == id_index.UNPROVIDED) {
            testfn = Symbols.symbol_function((SubLObject)id_index.EQUAL);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_id_index = new_id_index_for_testing_purposes(num_of_dense, num_of_sparse, id_to_value_fn);
        final SubLObject reverse_index = populate_reverse_index_for_id_index(v_id_index, testfn);
        final SubLObject new_id_index = new_id_index_from_reverse_index(reverse_index);
        if (id_index.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !id_index_count(new_id_index).numE(id_index_count(v_id_index))) {
            Errors.error((SubLObject)id_index.$str184$The_dense_ID_index__A_is_of_a_dif, v_id_index, new_id_index);
        }
        final SubLObject idx = v_id_index;
        if (id_index.NIL == id_index_objects_empty_p(idx, (SubLObject)id_index.$kw67$SKIP)) {
            final SubLObject idx_$22 = idx;
            if (id_index.NIL == id_index_dense_objects_empty_p(idx_$22, (SubLObject)id_index.$kw67$SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(idx_$22);
                final SubLObject backwardP_var = (SubLObject)id_index.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject value;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)id_index.NIL, v_iteration = (SubLObject)id_index.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)id_index.ONE_INTEGER)) {
                    id = ((id_index.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)id_index.ONE_INTEGER) : v_iteration);
                    value = Vectors.aref(vector_var, id);
                    if (id_index.NIL == id_index_tombstone_p(value) || id_index.NIL == id_index_skip_tombstones_p((SubLObject)id_index.$kw67$SKIP)) {
                        if (id_index.NIL != id_index_tombstone_p(value)) {
                            value = (SubLObject)id_index.$kw67$SKIP;
                        }
                        if (id_index.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !id.numE(map_utilities.map_get(reverse_index, value, (SubLObject)id_index.$kw185$NOT_FOUND))) {
                            Errors.error((SubLObject)id_index.$str186$The_reverse_index_for__A_does_not, value, id);
                        }
                        if (id_index.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && id_index.NIL == Functions.funcall(testfn, value, id_index_lookup(new_id_index, id, (SubLObject)id_index.UNPROVIDED))) {
                            Errors.error((SubLObject)id_index.$str187$The_new_ID_index_does_not_have__A, value, id);
                        }
                    }
                }
            }
            final SubLObject idx_$23 = idx;
            if (id_index.NIL == id_index_sparse_objects_empty_p(idx_$23)) {
                final SubLObject cdohash_table = id_index_sparse_objects(idx_$23);
                SubLObject id2 = (SubLObject)id_index.NIL;
                SubLObject value2 = (SubLObject)id_index.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        value2 = Hashtables.getEntryValue(cdohash_entry);
                        if (id_index.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !id2.numE(map_utilities.map_get(reverse_index, value2, (SubLObject)id_index.$kw185$NOT_FOUND))) {
                            Errors.error((SubLObject)id_index.$str186$The_reverse_index_for__A_does_not, value2, id2);
                        }
                        if (id_index.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && id_index.NIL == Functions.funcall(testfn, value2, id_index_lookup(new_id_index, id2, (SubLObject)id_index.UNPROVIDED))) {
                            Errors.error((SubLObject)id_index.$str187$The_new_ID_index_does_not_have__A, value2, id2);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return (SubLObject)id_index.$kw165$SUCCESS;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 50354L)
    public static SubLObject new_id_index_for_testing_purposes(final SubLObject num_of_dense, final SubLObject num_of_sparse, SubLObject id_to_value_fn) {
        if (id_to_value_fn == id_index.UNPROVIDED) {
            id_to_value_fn = (SubLObject)id_index.$sym162$TO_STRING;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_id_index = new_id_index(num_of_dense, (SubLObject)id_index.UNPROVIDED);
        SubLObject i;
        for (i = (SubLObject)id_index.NIL, i = (SubLObject)id_index.ZERO_INTEGER; i.numL(num_of_dense); i = Numbers.add(i, (SubLObject)id_index.ONE_INTEGER)) {
            id_index_enter(v_id_index, i, Functions.funcall(id_to_value_fn, i));
        }
        SubLObject j;
        SubLObject expected;
        SubLObject suggested;
        SubLObject value;
        for (j = (SubLObject)id_index.NIL, j = (SubLObject)id_index.ZERO_INTEGER; j.numL(num_of_sparse); j = Numbers.add(j, (SubLObject)id_index.ONE_INTEGER)) {
            expected = Numbers.add(j, num_of_dense);
            suggested = id_index_reserve(v_id_index);
            if (id_index.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !expected.numE(suggested)) {
                Errors.error((SubLObject)id_index.$str188$There_is_a_mismatch_between_the__, j, expected, suggested);
            }
            value = Functions.funcall(id_to_value_fn, suggested);
            id_index_enter(v_id_index, suggested, value);
        }
        return v_id_index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 51365L)
    public static SubLObject test_do_id_index_with_tombstones(final SubLObject num_of_dense, final SubLObject num_of_sparse, final SubLObject hole_count) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_id_index = new_id_index_for_testing_purposes_with_random_holes(num_of_dense, num_of_sparse, hole_count, (SubLObject)id_index.UNPROVIDED);
        final SubLObject hole_list = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject holes = set_utilities.construct_set_from_list(hole_list, (SubLObject)id_index.UNPROVIDED, (SubLObject)id_index.UNPROVIDED);
        final SubLObject seen_holes = set.new_set((SubLObject)id_index.UNPROVIDED, (SubLObject)id_index.UNPROVIDED);
        SubLObject last_id = (SubLObject)id_index.MINUS_ONE_INTEGER;
        final SubLObject idx = v_id_index;
        if (id_index.NIL == id_index_objects_empty_p(idx, (SubLObject)id_index.$kw190$RIP)) {
            final SubLObject idx_$24 = idx;
            if (id_index.NIL == id_index_dense_objects_empty_p(idx_$24, (SubLObject)id_index.$kw190$RIP)) {
                final SubLObject vector_var = id_index_dense_objects(idx_$24);
                final SubLObject backwardP_var = (SubLObject)id_index.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject v_object;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)id_index.NIL, v_iteration = (SubLObject)id_index.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)id_index.ONE_INTEGER)) {
                    id = ((id_index.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)id_index.ONE_INTEGER) : v_iteration);
                    v_object = Vectors.aref(vector_var, id);
                    if (id_index.NIL == id_index_tombstone_p(v_object) || id_index.NIL == id_index_skip_tombstones_p((SubLObject)id_index.$kw190$RIP)) {
                        if (id_index.NIL != id_index_tombstone_p(v_object)) {
                            v_object = (SubLObject)id_index.$kw190$RIP;
                        }
                        if (id_index.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !id_index.ONE_INTEGER.numE(Numbers.subtract(id, last_id))) {
                            Errors.error((SubLObject)id_index.$str191$Error__the_ID_range_is_not_truely, Numbers.add(last_id, (SubLObject)id_index.ONE_INTEGER), id);
                        }
                        if (id_index.NIL != set.set_memberP(id, holes)) {
                            if (id_index.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && id_index.$kw190$RIP != v_object) {
                                Errors.error((SubLObject)id_index.$str192$Error_at_index__A__expected_tombs, id, v_object);
                            }
                            set.set_add(id, seen_holes);
                        }
                        else if (id_index.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && id_index.$kw190$RIP == v_object) {
                            Errors.error((SubLObject)id_index.$str193$Error_at_index__A__expected_objec, id);
                        }
                        last_id = id;
                    }
                }
            }
            final SubLObject idx_$25 = idx;
            if (id_index.NIL == id_index_sparse_objects_empty_p(idx_$25) || id_index.NIL == id_index_skip_tombstones_p((SubLObject)id_index.$kw190$RIP)) {
                final SubLObject sparse = id_index_sparse_objects(idx_$25);
                SubLObject id2 = id_index_sparse_id_threshold(idx_$25);
                final SubLObject end_id = id_index_next_id(idx_$25);
                final SubLObject v_default = (SubLObject)((id_index.NIL != id_index_skip_tombstones_p((SubLObject)id_index.$kw190$RIP)) ? id_index.NIL : id_index.$kw190$RIP);
                while (id2.numL(end_id)) {
                    final SubLObject v_object2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                    if (id_index.NIL == id_index_skip_tombstones_p((SubLObject)id_index.$kw190$RIP) || id_index.NIL == id_index_tombstone_p(v_object2)) {
                        if (id_index.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !id_index.ONE_INTEGER.numE(Numbers.subtract(id2, last_id))) {
                            Errors.error((SubLObject)id_index.$str191$Error__the_ID_range_is_not_truely, Numbers.add(last_id, (SubLObject)id_index.ONE_INTEGER), id2);
                        }
                        if (id_index.NIL != set.set_memberP(id2, holes)) {
                            if (id_index.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && id_index.$kw190$RIP != v_object2) {
                                Errors.error((SubLObject)id_index.$str192$Error_at_index__A__expected_tombs, id2, v_object2);
                            }
                            set.set_add(id2, seen_holes);
                        }
                        else if (id_index.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && id_index.$kw190$RIP == v_object2) {
                            Errors.error((SubLObject)id_index.$str193$Error_at_index__A__expected_objec, id2);
                        }
                        last_id = id2;
                    }
                    id2 = Numbers.add(id2, (SubLObject)id_index.ONE_INTEGER);
                }
            }
        }
        if (id_index.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && id_index.NIL == set_utilities.sets_coextensionalP(holes, seen_holes)) {
            Errors.error((SubLObject)id_index.$str194$There_are_holes_that_we_did_not_s, set.set_element_list(set_utilities.set_prune(holes, seen_holes)));
        }
        final SubLObject last_index;
        final SubLObject somewhere_in_sparsespace = last_index = Numbers.add(num_of_dense, Numbers.integerDivide(num_of_sparse, (SubLObject)id_index.TWO_INTEGER));
        final SubLObject last_object = id_index_lookup(v_id_index, last_index, (SubLObject)id_index.$kw190$RIP);
        SubLObject counter = (SubLObject)id_index.ZERO_INTEGER;
        SubLObject curr_object = (SubLObject)id_index.NIL;
        SubLObject finishedP = (SubLObject)id_index.NIL;
        final SubLObject idx2 = v_id_index;
        if (id_index.NIL == id_index_objects_empty_p(idx2, (SubLObject)id_index.$kw190$RIP)) {
            final SubLObject idx_$26 = idx2;
            if (id_index.NIL == id_index_dense_objects_empty_p(idx_$26, (SubLObject)id_index.$kw190$RIP)) {
                final SubLObject vector_var2 = id_index_dense_objects(idx_$26);
                final SubLObject backwardP_var2 = (SubLObject)id_index.NIL;
                final SubLObject length2 = Sequences.length(vector_var2);
                SubLObject current;
                final SubLObject datum = current = (SubLObject)((id_index.NIL != backwardP_var2) ? ConsesLow.list(Numbers.subtract(length2, (SubLObject)id_index.ONE_INTEGER), (SubLObject)id_index.MINUS_ONE_INTEGER, (SubLObject)id_index.MINUS_ONE_INTEGER) : ConsesLow.list((SubLObject)id_index.ZERO_INTEGER, length2, (SubLObject)id_index.ONE_INTEGER));
                SubLObject start = (SubLObject)id_index.NIL;
                SubLObject end = (SubLObject)id_index.NIL;
                SubLObject delta = (SubLObject)id_index.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)id_index.$list175);
                start = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)id_index.$list175);
                end = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)id_index.$list175);
                delta = current.first();
                current = current.rest();
                if (id_index.NIL == current) {
                    if (id_index.NIL == finishedP) {
                        SubLObject end_var;
                        SubLObject id3;
                        SubLObject v_object3;
                        for (end_var = end, id3 = (SubLObject)id_index.NIL, id3 = start; id_index.NIL == finishedP && id_index.NIL == subl_macros.do_numbers_endtest(id3, delta, end_var); id3 = Numbers.add(id3, delta)) {
                            v_object3 = Vectors.aref(vector_var2, id3);
                            if (id_index.NIL == id_index_tombstone_p(v_object3) || id_index.NIL == id_index_skip_tombstones_p((SubLObject)id_index.$kw190$RIP)) {
                                if (id_index.NIL != id_index_tombstone_p(v_object3)) {
                                    v_object3 = (SubLObject)id_index.$kw190$RIP;
                                }
                                if (id_index.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !id3.numE(counter)) {
                                    Errors.error((SubLObject)id_index.$str195$Error__ID__A_is_not_in_line_with_, id3, counter);
                                }
                                counter = Numbers.add(counter, (SubLObject)id_index.ONE_INTEGER);
                                curr_object = v_object3;
                                finishedP = Numbers.numL(last_index, counter);
                            }
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)id_index.$list175);
                }
            }
            final SubLObject idx_$27 = idx2;
            if (id_index.NIL == id_index_sparse_objects_empty_p(idx_$27) || id_index.NIL == id_index_skip_tombstones_p((SubLObject)id_index.$kw190$RIP)) {
                final SubLObject sparse2 = id_index_sparse_objects(idx_$27);
                SubLObject id4 = id_index_sparse_id_threshold(idx_$27);
                final SubLObject end_id2 = id_index_next_id(idx_$27);
                final SubLObject v_default2 = (SubLObject)((id_index.NIL != id_index_skip_tombstones_p((SubLObject)id_index.$kw190$RIP)) ? id_index.NIL : id_index.$kw190$RIP);
                while (id4.numL(end_id2) && id_index.NIL == finishedP) {
                    final SubLObject v_object4 = Hashtables.gethash_without_values(id4, sparse2, v_default2);
                    if (id_index.NIL == id_index_skip_tombstones_p((SubLObject)id_index.$kw190$RIP) || id_index.NIL == id_index_tombstone_p(v_object4)) {
                        if (id_index.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !id4.numE(counter)) {
                            Errors.error((SubLObject)id_index.$str195$Error__ID__A_is_not_in_line_with_, id4, counter);
                        }
                        counter = Numbers.add(counter, (SubLObject)id_index.ONE_INTEGER);
                        curr_object = v_object4;
                        finishedP = Numbers.numL(last_index, counter);
                    }
                    id4 = Numbers.add(id4, (SubLObject)id_index.ONE_INTEGER);
                }
            }
        }
        if (id_index.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !curr_object.eql(last_object)) {
            Errors.error((SubLObject)id_index.$str196$_DONE_should_have_taken_us_to__A_, last_object, curr_object);
        }
        SubLObject limit;
        SubLObject i;
        for (limit = Numbers.add(num_of_dense, num_of_sparse), i = (SubLObject)id_index.NIL, i = (SubLObject)id_index.ZERO_INTEGER; i.numL(limit); i = Numbers.add(i, (SubLObject)id_index.ONE_INTEGER)) {
            id_index_remove(v_id_index, i);
        }
        if (id_index.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && id_index.NIL == id_index_empty_p(v_id_index)) {
            Errors.error((SubLObject)id_index.$str197$Hey__we_deleted_everything_and_th);
        }
        SubLObject counter2 = (SubLObject)id_index.ZERO_INTEGER;
        final SubLObject idx3 = v_id_index;
        if (id_index.NIL == id_index_objects_empty_p(idx3, (SubLObject)id_index.$kw190$RIP)) {
            final SubLObject idx_$28 = idx3;
            if (id_index.NIL == id_index_dense_objects_empty_p(idx_$28, (SubLObject)id_index.$kw190$RIP)) {
                final SubLObject vector_var3 = id_index_dense_objects(idx_$28);
                final SubLObject backwardP_var3 = (SubLObject)id_index.NIL;
                SubLObject id4;
                SubLObject length3;
                SubLObject v_iteration2;
                SubLObject v_object5;
                for (length3 = Sequences.length(vector_var3), v_iteration2 = (SubLObject)id_index.NIL, v_iteration2 = (SubLObject)id_index.ZERO_INTEGER; v_iteration2.numL(length3); v_iteration2 = Numbers.add(v_iteration2, (SubLObject)id_index.ONE_INTEGER)) {
                    id4 = ((id_index.NIL != backwardP_var3) ? Numbers.subtract(length3, v_iteration2, (SubLObject)id_index.ONE_INTEGER) : v_iteration2);
                    v_object5 = Vectors.aref(vector_var3, id4);
                    if (id_index.NIL == id_index_tombstone_p(v_object5) || id_index.NIL == id_index_skip_tombstones_p((SubLObject)id_index.$kw190$RIP)) {
                        if (id_index.NIL != id_index_tombstone_p(v_object5)) {
                            v_object5 = (SubLObject)id_index.$kw190$RIP;
                        }
                        if (id_index.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !counter2.numE(id4)) {
                            Errors.error((SubLObject)id_index.$str195$Error__ID__A_is_not_in_line_with_, id4, counter2);
                        }
                        if (id_index.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && id_index.$kw190$RIP != v_object5) {
                            Errors.error((SubLObject)id_index.$str198$Error__an_empty_ID_index_contains, v_object5);
                        }
                        counter2 = Numbers.add(counter2, (SubLObject)id_index.ONE_INTEGER);
                    }
                }
            }
            final SubLObject idx_$29 = idx3;
            if (id_index.NIL == id_index_sparse_objects_empty_p(idx_$29) || id_index.NIL == id_index_skip_tombstones_p((SubLObject)id_index.$kw190$RIP)) {
                final SubLObject sparse3 = id_index_sparse_objects(idx_$29);
                SubLObject id = id_index_sparse_id_threshold(idx_$29);
                final SubLObject end_id3 = id_index_next_id(idx_$29);
                final SubLObject v_default3 = (SubLObject)((id_index.NIL != id_index_skip_tombstones_p((SubLObject)id_index.$kw190$RIP)) ? id_index.NIL : id_index.$kw190$RIP);
                while (id.numL(end_id3)) {
                    final SubLObject v_object6 = Hashtables.gethash_without_values(id, sparse3, v_default3);
                    if (id_index.NIL == id_index_skip_tombstones_p((SubLObject)id_index.$kw190$RIP) || id_index.NIL == id_index_tombstone_p(v_object6)) {
                        if (id_index.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !counter2.numE(id)) {
                            Errors.error((SubLObject)id_index.$str195$Error__ID__A_is_not_in_line_with_, id, counter2);
                        }
                        if (id_index.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && id_index.$kw190$RIP != v_object6) {
                            Errors.error((SubLObject)id_index.$str198$Error__an_empty_ID_index_contains, v_object6);
                        }
                        counter2 = Numbers.add(counter2, (SubLObject)id_index.ONE_INTEGER);
                    }
                    id = Numbers.add(id, (SubLObject)id_index.ONE_INTEGER);
                }
            }
        }
        if (id_index.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !counter2.numE(limit)) {
            Errors.error((SubLObject)id_index.$str199$Hey___A______A__they_did_not_show, counter2, limit);
        }
        return (SubLObject)id_index.$kw165$SUCCESS;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 54353L)
    public static SubLObject new_id_index_for_testing_purposes_with_random_holes(final SubLObject num_of_dense, final SubLObject num_of_sparse, final SubLObject hole_count, SubLObject id_to_value_fn) {
        if (id_to_value_fn == id_index.UNPROVIDED) {
            id_to_value_fn = (SubLObject)id_index.$sym162$TO_STRING;
        }
        final SubLObject v_id_index = new_id_index_for_testing_purposes(num_of_dense, num_of_sparse, id_to_value_fn);
        final SubLObject hole_range = Numbers.add(num_of_sparse, num_of_dense);
        final SubLObject holes = set.new_set((SubLObject)id_index.UNPROVIDED, (SubLObject)id_index.UNPROVIDED);
        SubLObject cdolist_list_var = (SubLObject)ConsesLow.list((SubLObject)id_index.ZERO_INTEGER, Numbers.subtract(num_of_dense, (SubLObject)id_index.ONE_INTEGER));
        SubLObject id = (SubLObject)id_index.NIL;
        id = cdolist_list_var.first();
        while (id_index.NIL != cdolist_list_var) {
            id_index_remove(v_id_index, id);
            set.set_add(id, holes);
            cdolist_list_var = cdolist_list_var.rest();
            id = cdolist_list_var.first();
        }
        while (set.set_size(holes).numL(hole_count)) {
            final SubLObject index = random.random(hole_range);
            if (id_index.NIL == set.set_memberP(index, holes)) {
                id_index_remove(v_id_index, index);
                set.set_add(index, holes);
            }
        }
        return Values.values(v_id_index, set.set_element_list(holes));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 55216L)
    public static SubLObject populate_reverse_index_for_id_index(final SubLObject v_id_index, final SubLObject testfn) {
        final SubLObject map = dictionary.new_dictionary(testfn, (SubLObject)id_index.UNPROVIDED);
        return build_reverse_index_for_id_index(v_id_index, map, (SubLObject)id_index.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 55614L)
    public static SubLObject test_id_index_with_swizzling(final SubLObject dense, final SubLObject sparse) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject idx = new_id_index(dense, Numbers.$most_positive_fixnum$.getGlobalValue());
        final SubLObject side_cache = dictionary.new_dictionary((SubLObject)id_index.EQL, (SubLObject)id_index.UNPROVIDED);
        final SubLObject bignums = set.new_set((SubLObject)id_index.EQL, (SubLObject)id_index.UNPROVIDED);
        SubLObject i;
        SubLObject value;
        SubLObject id;
        for (i = (SubLObject)id_index.NIL, i = (SubLObject)id_index.ZERO_INTEGER; i.numL(sparse); i = Numbers.add(i, (SubLObject)id_index.ONE_INTEGER)) {
            value = string_utilities.to_string(i);
            id = id_index_reserve(idx);
            if (!id.isFixnum()) {
                set.set_add(id, bignums);
            }
            id_index_enter(idx, id, value);
            map_utilities.map_put(side_cache, id, value);
        }
        if (id_index.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && id_index.NIL != set.set_emptyP(bignums)) {
            Errors.error((SubLObject)id_index.$str202$The_test_is_badly_designed__no_bi);
        }
        SubLObject id2;
        SubLObject value2;
        SubLObject id_value;
        for (i = (SubLObject)id_index.NIL, i = (SubLObject)id_index.ZERO_INTEGER; i.numL(sparse); i = Numbers.add(i, (SubLObject)id_index.ONE_INTEGER)) {
            id2 = Numbers.add(Numbers.$most_positive_fixnum$.getGlobalValue(), i);
            value2 = map_utilities.map_get(side_cache, id2, (SubLObject)id_index.UNPROVIDED);
            id_value = id_index_lookup(idx, id2, (SubLObject)id_index.$str203$);
            if (id_index.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && id_index.NIL == Strings.stringE(value2, id_value, (SubLObject)id_index.UNPROVIDED, (SubLObject)id_index.UNPROVIDED, (SubLObject)id_index.UNPROVIDED, (SubLObject)id_index.UNPROVIDED)) {
                Errors.error((SubLObject)id_index.$str204$We_could_not_retrieve__S_from_the, value2, id2);
            }
        }
        return (SubLObject)id_index.$kw165$SUCCESS;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 56623L)
    public static SubLObject test_id_index_ordered_iteration(final SubLObject dense, final SubLObject sparse) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject idx = new_id_index(dense, (SubLObject)id_index.UNPROVIDED);
        SubLObject cdotimes_end_var;
        SubLObject i;
        SubLObject value;
        SubLObject id;
        for (cdotimes_end_var = Numbers.add(dense, sparse), i = (SubLObject)id_index.NIL, i = (SubLObject)id_index.ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject)id_index.ONE_INTEGER)) {
            value = string_utilities.to_string(i);
            id = id_index_reserve(idx);
            id_index_enter(idx, id, value);
        }
        SubLObject previous = (SubLObject)id_index.MINUS_ONE_INTEGER;
        final SubLObject iterator_var = new_id_index_ordered_iterator(idx);
        SubLObject valid;
        for (SubLObject done_var = (SubLObject)id_index.NIL; id_index.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(id_index.NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject entry = iteration.iteration_next(iterator_var);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (id_index.NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = entry;
                SubLObject id2 = (SubLObject)id_index.NIL;
                SubLObject value2 = (SubLObject)id_index.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)id_index.$list56);
                id2 = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)id_index.$list56);
                value2 = current.first();
                current = current.rest();
                if (id_index.NIL == current) {
                    if (id_index.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !previous.numL(id2)) {
                        Errors.error((SubLObject)id_index.$str207$We_expected_something_larger_than, previous, id2);
                    }
                    previous = id2;
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)id_index.$list56);
                }
            }
        }
        return (SubLObject)id_index.$kw165$SUCCESS;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 57233L)
    public static SubLObject test_pessimize_id_index() {
        final SubLObject v_id_index = new_id_index((SubLObject)id_index.THREE_INTEGER, (SubLObject)id_index.ZERO_INTEGER);
        final SubLObject id_a = id_index_reserve(v_id_index);
        final SubLObject id_b = id_index_reserve(v_id_index);
        final SubLObject id_c = id_index_reserve(v_id_index);
        final SubLObject id_d = id_index_reserve(v_id_index);
        id_index_enter(v_id_index, id_a, (SubLObject)id_index.$str208$a);
        id_index_enter(v_id_index, id_b, (SubLObject)id_index.$str209$b);
        id_index_enter(v_id_index, id_c, (SubLObject)id_index.$str210$c);
        if (id_index.NIL != id_index_pessimized_p(v_id_index) || !id_index.THREE_INTEGER.numE(id_index_count(v_id_index)) || !id_index.THREE_INTEGER.numE(id_index_dense_object_count(v_id_index)) || !id_index.ZERO_INTEGER.numE(id_index_sparse_object_count(v_id_index))) {
            return (SubLObject)id_index.$kw219$INITIAL_ID_INDEX_COUNT_FAILURE;
        }
        pessimize_id_index(v_id_index);
        if (id_index.NIL == id_index_pessimized_p(v_id_index) || !id_index.THREE_INTEGER.numE(id_index_count(v_id_index)) || !id_index.ZERO_INTEGER.numE(id_index_dense_object_count(v_id_index)) || !id_index.THREE_INTEGER.numE(id_index_sparse_object_count(v_id_index))) {
            return (SubLObject)id_index.$kw218$ID_INDEX_COUNT_FAILURE;
        }
        if (!id_index.$str208$a.equal(id_index_lookup(v_id_index, id_a, (SubLObject)id_index.UNPROVIDED)) || !id_index.$str209$b.equal(id_index_lookup(v_id_index, id_b, (SubLObject)id_index.UNPROVIDED)) || !id_index.$str210$c.equal(id_index_lookup(v_id_index, id_c, (SubLObject)id_index.UNPROVIDED))) {
            return (SubLObject)id_index.$kw217$ID_INDEX_LOOKUP_FAILURE;
        }
        SubLObject values = (SubLObject)id_index.NIL;
        final SubLObject idx = v_id_index;
        if (id_index.NIL == id_index_objects_empty_p(idx, (SubLObject)id_index.$kw67$SKIP)) {
            final SubLObject idx_$30 = idx;
            if (id_index.NIL == id_index_dense_objects_empty_p(idx_$30, (SubLObject)id_index.$kw67$SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(idx_$30);
                final SubLObject backwardP_var = (SubLObject)id_index.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject v_object;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)id_index.NIL, v_iteration = (SubLObject)id_index.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)id_index.ONE_INTEGER)) {
                    id = ((id_index.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)id_index.ONE_INTEGER) : v_iteration);
                    v_object = Vectors.aref(vector_var, id);
                    if (id_index.NIL == id_index_tombstone_p(v_object) || id_index.NIL == id_index_skip_tombstones_p((SubLObject)id_index.$kw67$SKIP)) {
                        if (id_index.NIL != id_index_tombstone_p(v_object)) {
                            v_object = (SubLObject)id_index.$kw67$SKIP;
                        }
                        values = (SubLObject)ConsesLow.cons(v_object, values);
                    }
                }
            }
            final SubLObject idx_$31 = idx;
            if (id_index.NIL == id_index_sparse_objects_empty_p(idx_$31)) {
                final SubLObject cdohash_table = id_index_sparse_objects(idx_$31);
                SubLObject id2 = (SubLObject)id_index.NIL;
                SubLObject v_object2 = (SubLObject)id_index.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        v_object2 = Hashtables.getEntryValue(cdohash_entry);
                        values = (SubLObject)ConsesLow.cons(v_object2, values);
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        if (id_index.NIL == list_utilities.sets_equal_equalP(values, (SubLObject)id_index.$list211)) {
            return (SubLObject)id_index.$kw216$DO_ID_INDEX_FAILURE;
        }
        final SubLObject id_e = id_index_reserve(v_id_index);
        id_index_enter(v_id_index, id_d, (SubLObject)id_index.$str212$d);
        id_index_enter(v_id_index, id_e, (SubLObject)id_index.$str213$e);
        if (id_index.NIL == id_index_pessimized_p(v_id_index) || !id_index.FIVE_INTEGER.numE(id_index_count(v_id_index)) || !id_index.ZERO_INTEGER.numE(id_index_dense_object_count(v_id_index)) || !id_index.FIVE_INTEGER.numE(id_index_sparse_object_count(v_id_index))) {
            return (SubLObject)id_index.$kw215$ID_INDEX_RECOUNT_FAILURE;
        }
        if (id_index.$str208$a.equal(id_index_lookup(v_id_index, id_a, (SubLObject)id_index.UNPROVIDED)) && id_index.$str209$b.equal(id_index_lookup(v_id_index, id_b, (SubLObject)id_index.UNPROVIDED)) && id_index.$str210$c.equal(id_index_lookup(v_id_index, id_c, (SubLObject)id_index.UNPROVIDED)) && id_index.$str212$d.equal(id_index_lookup(v_id_index, id_d, (SubLObject)id_index.UNPROVIDED)) && id_index.$str213$e.equal(id_index_lookup(v_id_index, id_e, (SubLObject)id_index.UNPROVIDED))) {
            return (SubLObject)id_index.$kw165$SUCCESS;
        }
        return (SubLObject)id_index.$kw214$ID_INDEX_RELOOKUP_FAILURE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 57233L)
    public static SubLObject benchmark_id_index_iteration() {
        return benchmark_id_index_iteration_int((SubLObject)id_index.$list223, (SubLObject)id_index.$int224$212);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/id-index.lisp", position = 57233L)
    public static SubLObject benchmark_id_index_iteration_int(final SubLObject size_list, final SubLObject multiplier) {
        SubLObject result = (SubLObject)id_index.NIL;
        SubLObject cdolist_list_var = size_list;
        SubLObject size = (SubLObject)id_index.NIL;
        size = cdolist_list_var.first();
        while (id_index.NIL != cdolist_list_var) {
            SubLObject id_index_time = (SubLObject)id_index.NIL;
            SubLObject hash_time = (SubLObject)id_index.NIL;
            final SubLObject v_id_index = new_id_index(size, (SubLObject)id_index.ZERO_INTEGER);
            SubLObject time_var = Time.get_internal_real_time();
            SubLObject i;
            SubLObject idx;
            SubLObject idx_$32;
            SubLObject vector_var;
            SubLObject backwardP_var;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject id;
            SubLObject v_object;
            SubLObject idx_$33;
            SubLObject cdohash_table;
            SubLObject id2;
            SubLObject v_object2;
            Iterator cdohash_iterator;
            Map.Entry cdohash_entry;
            for (i = (SubLObject)id_index.NIL, i = (SubLObject)id_index.ZERO_INTEGER; i.numL(multiplier); i = Numbers.add(i, (SubLObject)id_index.ONE_INTEGER)) {
                idx = v_id_index;
                if (id_index.NIL == id_index_objects_empty_p(idx, (SubLObject)id_index.$kw67$SKIP)) {
                    idx_$32 = idx;
                    if (id_index.NIL == id_index_dense_objects_empty_p(idx_$32, (SubLObject)id_index.$kw67$SKIP)) {
                        vector_var = id_index_dense_objects(idx_$32);
                        backwardP_var = (SubLObject)id_index.NIL;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)id_index.NIL, v_iteration = (SubLObject)id_index.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)id_index.ONE_INTEGER)) {
                            id = ((id_index.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)id_index.ONE_INTEGER) : v_iteration);
                            v_object = Vectors.aref(vector_var, id);
                            if (id_index.NIL == id_index_tombstone_p(v_object) || id_index.NIL == id_index_skip_tombstones_p((SubLObject)id_index.$kw67$SKIP)) {
                                if (id_index.NIL != id_index_tombstone_p(v_object)) {
                                    v_object = (SubLObject)id_index.$kw67$SKIP;
                                }
                                Types.sublisp_false(id, v_object);
                            }
                        }
                    }
                    idx_$33 = idx;
                    if (id_index.NIL == id_index_sparse_objects_empty_p(idx_$33)) {
                        cdohash_table = id_index_sparse_objects(idx_$33);
                        id2 = (SubLObject)id_index.NIL;
                        v_object2 = (SubLObject)id_index.NIL;
                        cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                        try {
                            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                                cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                                id2 = Hashtables.getEntryKey(cdohash_entry);
                                v_object2 = Hashtables.getEntryValue(cdohash_entry);
                                Types.sublisp_false(id2, v_object2);
                            }
                        }
                        finally {
                            Hashtables.releaseEntrySetIterator(cdohash_iterator);
                        }
                    }
                }
            }
            id_index_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            final SubLObject hash = Hashtables.make_hash_table(size, (SubLObject)id_index.UNPROVIDED, (SubLObject)id_index.UNPROVIDED);
            time_var = Time.get_internal_real_time();
            SubLObject key;
            SubLObject val;
            Iterator cdohash_iterator2;
            Map.Entry cdohash_entry2;
            for (i = (SubLObject)id_index.NIL, i = (SubLObject)id_index.ZERO_INTEGER; i.numL(multiplier); i = Numbers.add(i, (SubLObject)id_index.ONE_INTEGER)) {
                key = (SubLObject)id_index.NIL;
                val = (SubLObject)id_index.NIL;
                cdohash_iterator2 = Hashtables.getEntrySetIterator(hash);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator2)) {
                        cdohash_entry2 = Hashtables.iteratorNextEntry(cdohash_iterator2);
                        key = Hashtables.getEntryKey(cdohash_entry2);
                        val = Hashtables.getEntryValue(cdohash_entry2);
                        Types.sublisp_false(key, val);
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator2);
                }
            }
            hash_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(size, id_index_time, hash_time), result);
            cdolist_list_var = cdolist_list_var.rest();
            size = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    public static SubLObject declare_id_index_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "id_index_print_function_trampoline", "ID-INDEX-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "id_index_p", "ID-INDEX-P", 1, 0, false);
        new $id_index_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "idix_lock", "IDIX-LOCK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "idix_count", "IDIX-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "idix_next_id", "IDIX-NEXT-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "idix_dense_objects", "IDIX-DENSE-OBJECTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "idix_sparse_objects", "IDIX-SPARSE-OBJECTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "_csetf_idix_lock", "_CSETF-IDIX-LOCK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "_csetf_idix_count", "_CSETF-IDIX-COUNT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "_csetf_idix_next_id", "_CSETF-IDIX-NEXT-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "_csetf_idix_dense_objects", "_CSETF-IDIX-DENSE-OBJECTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "_csetf_idix_sparse_objects", "_CSETF-IDIX-SPARSE-OBJECTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "make_id_index", "MAKE-ID-INDEX", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "visit_defstruct_id_index", "VISIT-DEFSTRUCT-ID-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "visit_defstruct_object_id_index_method", "VISIT-DEFSTRUCT-OBJECT-ID-INDEX-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "print_id_index", "PRINT-ID-INDEX", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "id_index_count", "ID-INDEX-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "id_index_empty_p", "ID-INDEX-EMPTY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "id_index_dense_object_count", "ID-INDEX-DENSE-OBJECT-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "id_index_sparse_object_count", "ID-INDEX-SPARSE-OBJECT-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "id_index_sparse_id_threshold", "ID-INDEX-SPARSE-ID-THRESHOLD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "id_index_next_id", "ID-INDEX-NEXT-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "set_id_index_next_id", "SET-ID-INDEX-NEXT-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "id_index_dense_objects", "ID-INDEX-DENSE-OBJECTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "id_index_sparse_objects", "ID-INDEX-SPARSE-OBJECTS", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.id_index", "with_id_index_locked", "WITH-ID-INDEX-LOCKED");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "id_index_lock", "ID-INDEX-LOCK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "convert_id_index_key_test", "CONVERT-ID-INDEX-KEY-TEST", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "new_id_index", "NEW-ID-INDEX", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "id_index_reserve", "ID-INDEX-RESERVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "id_index_empty_list", "ID-INDEX-EMPTY-LIST", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "id_index_empty_list_p", "ID-INDEX-EMPTY-LIST-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "uninterned_symbols_with_same_name_p", "UNINTERNED-SYMBOLS-WITH-SAME-NAME-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "id_index_tombstone", "ID-INDEX-TOMBSTONE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "id_index_tombstone_p", "ID-INDEX-TOMBSTONE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "id_index_lookup", "ID-INDEX-LOOKUP", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "id_index_lookup_int", "ID-INDEX-LOOKUP-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "id_index_enter", "ID-INDEX-ENTER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "id_index_enter_unlocked", "ID-INDEX-ENTER-UNLOCKED", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "get_appropriate_id_index_sparse_objects", "GET-APPROPRIATE-ID-INDEX-SPARSE-OBJECTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "id_index_enter_autoextend", "ID-INDEX-ENTER-AUTOEXTEND", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "id_index_enter_unlocked_autoextend", "ID-INDEX-ENTER-UNLOCKED-AUTOEXTEND", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "id_index_possibly_autoextend", "ID-INDEX-POSSIBLY-AUTOEXTEND", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "id_index_remove", "ID-INDEX-REMOVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "clear_id_index", "CLEAR-ID-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "fill_id_index_dense_space", "FILL-ID-INDEX-DENSE-SPACE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "id_index_dense_object_id_p", "ID-INDEX-DENSE-OBJECT-ID-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "new_id_index_iterator", "NEW-ID-INDEX-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "new_id_index_values_iterator", "NEW-ID-INDEX-VALUES-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "new_id_index_ordered_iterator", "NEW-ID-INDEX-ORDERED-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "new_id_index_dense_objects_iterator", "NEW-ID-INDEX-DENSE-OBJECTS-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "iterate_id_index_dense_objects_necessary", "ITERATE-ID-INDEX-DENSE-OBJECTS-NECESSARY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "new_id_index_dense_objects_values_iterator", "NEW-ID-INDEX-DENSE-OBJECTS-VALUES-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "new_id_index_sparse_objects_iterator", "NEW-ID-INDEX-SPARSE-OBJECTS-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "new_id_index_sparse_objects_values_iterator", "NEW-ID-INDEX-SPARSE-OBJECTS-VALUES-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "new_id_index_sparse_objects_ordered_iterator", "NEW-ID-INDEX-SPARSE-OBJECTS-ORDERED-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "make_id_index_sparse_objects_ordered_iterator_state", "MAKE-ID-INDEX-SPARSE-OBJECTS-ORDERED-ITERATOR-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "id_index_sparse_objects_ordered_iterator_doneP", "ID-INDEX-SPARSE-OBJECTS-ORDERED-ITERATOR-DONE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "id_index_sparse_objects_ordered_iterator_next", "ID-INDEX-SPARSE-OBJECTS-ORDERED-ITERATOR-NEXT", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.id_index", "do_id_index", "DO-ID-INDEX");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.id_index", "old_do_id_index", "OLD-DO-ID-INDEX");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "id_index_objects_empty_p", "ID-INDEX-OBJECTS-EMPTY-P", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.id_index", "do_id_index_dense_objects", "DO-ID-INDEX-DENSE-OBJECTS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "id_index_dense_objects_empty_p", "ID-INDEX-DENSE-OBJECTS-EMPTY-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "id_index_skip_tombstones_p", "ID-INDEX-SKIP-TOMBSTONES-P", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.id_index", "do_id_index_sparse_objects", "DO-ID-INDEX-SPARSE-OBJECTS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "id_index_sparse_objects_empty_p", "ID-INDEX-SPARSE-OBJECTS-EMPTY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "id_index_sparse_object_ids", "ID-INDEX-SPARSE-OBJECT-IDS", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.id_index", "new_do_id_index", "NEW-DO-ID-INDEX");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "do_id_index_next_id", "DO-ID-INDEX-NEXT-ID", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "do_id_index_next_state", "DO-ID-INDEX-NEXT-STATE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "do_id_index_state_object", "DO-ID-INDEX-STATE-OBJECT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "do_id_index_object_validP", "DO-ID-INDEX-OBJECT-VALID?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "id_index_old_and_new_object_counts", "ID-INDEX-OLD-AND-NEW-OBJECT-COUNTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "cfasl_output_object_id_index_method", "CFASL-OUTPUT-OBJECT-ID-INDEX-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "cfasl_wide_output_id_index", "CFASL-WIDE-OUTPUT-ID-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "cfasl_output_id_index_internal", "CFASL-OUTPUT-ID-INDEX-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "cfasl_input_id_index", "CFASL-INPUT-ID-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "test_id_index_cfasl_serialization", "TEST-ID-INDEX-CFASL-SERIALIZATION", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "id_index_optimized_p", "ID-INDEX-OPTIMIZED-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "optimize_id_index", "OPTIMIZE-ID-INDEX", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "id_index_pessimized_p", "ID-INDEX-PESSIMIZED-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "pessimize_id_index", "PESSIMIZE-ID-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "id_index_compact_p", "ID-INDEX-COMPACT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "compact_id_index", "COMPACT-ID-INDEX", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "new_indirect_compact_id_index", "NEW-INDIRECT-COMPACT-ID-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "id_index_ids", "ID-INDEX-IDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "id_index_values", "ID-INDEX-VALUES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "clone_id_index", "CLONE-ID-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "copy_id_index", "COPY-ID-INDEX", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "id_index_missing_ids", "ID-INDEX-MISSING-IDS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "test_id_index_missing_ids", "TEST-ID-INDEX-MISSING-IDS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "build_reverse_index_for_id_index", "BUILD-REVERSE-INDEX-FOR-ID-INDEX", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "new_id_index_from_reverse_index", "NEW-ID-INDEX-FROM-REVERSE-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "find_max_index_id_in_reverse_index", "FIND-MAX-INDEX-ID-IN-REVERSE-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "test_new_index_from_reverse_index", "TEST-NEW-INDEX-FROM-REVERSE-INDEX", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "new_id_index_for_testing_purposes", "NEW-ID-INDEX-FOR-TESTING-PURPOSES", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "test_do_id_index_with_tombstones", "TEST-DO-ID-INDEX-WITH-TOMBSTONES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "new_id_index_for_testing_purposes_with_random_holes", "NEW-ID-INDEX-FOR-TESTING-PURPOSES-WITH-RANDOM-HOLES", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "populate_reverse_index_for_id_index", "POPULATE-REVERSE-INDEX-FOR-ID-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "test_id_index_with_swizzling", "TEST-ID-INDEX-WITH-SWIZZLING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "test_id_index_ordered_iteration", "TEST-ID-INDEX-ORDERED-ITERATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "test_pessimize_id_index", "TEST-PESSIMIZE-ID-INDEX", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "benchmark_id_index_iteration", "BENCHMARK-ID-INDEX-ITERATION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.id_index", "benchmark_id_index_iteration_int", "BENCHMARK-ID-INDEX-ITERATION-INT", 2, 0, false);
        return (SubLObject)id_index.NIL;
    }
    
    public static SubLObject init_id_index_file() {
        id_index.$dtp_id_index$ = SubLFiles.defconstant("*DTP-ID-INDEX*", (SubLObject)id_index.$sym0$ID_INDEX);
        id_index.$id_index_default_scaling_factor$ = SubLFiles.deflexical("*ID-INDEX-DEFAULT-SCALING-FACTOR*", (SubLObject)id_index.$int44$100);
        id_index.$id_index_equality_test$ = SubLFiles.deflexical("*ID-INDEX-EQUALITY-TEST*", (SubLObject)id_index.EQL);
        id_index.$id_index_empty_list$ = SubLFiles.defconstant("*ID-INDEX-EMPTY-LIST*", Symbols.make_symbol((SubLObject)id_index.$str47$THE_EMPTY_LIST));
        id_index.$cfasl_wide_opcode_id_index$ = SubLFiles.defconstant("*CFASL-WIDE-OPCODE-ID-INDEX*", (SubLObject)id_index.$int147$128);
        return (SubLObject)id_index.NIL;
    }
    
    public static SubLObject setup_id_index_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), id_index.$dtp_id_index$.getGlobalValue(), Symbols.symbol_function((SubLObject)id_index.$sym7$ID_INDEX_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)id_index.$list8);
        Structures.def_csetf((SubLObject)id_index.$sym9$IDIX_LOCK, (SubLObject)id_index.$sym10$_CSETF_IDIX_LOCK);
        Structures.def_csetf((SubLObject)id_index.$sym11$IDIX_COUNT, (SubLObject)id_index.$sym12$_CSETF_IDIX_COUNT);
        Structures.def_csetf((SubLObject)id_index.$sym13$IDIX_NEXT_ID, (SubLObject)id_index.$sym14$_CSETF_IDIX_NEXT_ID);
        Structures.def_csetf((SubLObject)id_index.$sym15$IDIX_DENSE_OBJECTS, (SubLObject)id_index.$sym16$_CSETF_IDIX_DENSE_OBJECTS);
        Structures.def_csetf((SubLObject)id_index.$sym17$IDIX_SPARSE_OBJECTS, (SubLObject)id_index.$sym18$_CSETF_IDIX_SPARSE_OBJECTS);
        Equality.identity((SubLObject)id_index.$sym0$ID_INDEX);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), id_index.$dtp_id_index$.getGlobalValue(), Symbols.symbol_function((SubLObject)id_index.$sym29$VISIT_DEFSTRUCT_OBJECT_ID_INDEX_METHOD));
        access_macros.register_macro_helper((SubLObject)id_index.$sym34$ID_INDEX_DENSE_OBJECTS, (SubLObject)id_index.$sym35$DO_ID_INDEX_DENSE_OBJECTS);
        access_macros.register_macro_helper((SubLObject)id_index.$sym36$ID_INDEX_SPARSE_OBJECTS, (SubLObject)id_index.$sym37$DO_ID_INDEX_SPARSE_OBJECTS);
        access_macros.register_macro_helper((SubLObject)id_index.$sym41$ID_INDEX_LOCK, (SubLObject)id_index.$sym43$WITH_ID_INDEX_LOCKED);
        access_macros.register_macro_helper((SubLObject)id_index.$sym48$ID_INDEX_TOMBSTONE_P, (SubLObject)id_index.$sym49$DO_ID_INDEX);
        utilities_macros.note_funcall_helper_function((SubLObject)id_index.$sym58$ID_INDEX_SPARSE_OBJECTS_ORDERED_ITERATOR_DONE_);
        utilities_macros.note_funcall_helper_function((SubLObject)id_index.$sym59$ID_INDEX_SPARSE_OBJECTS_ORDERED_ITERATOR_NEXT);
        access_macros.register_macro_helper((SubLObject)id_index.$sym74$ID_INDEX_OBJECTS_EMPTY_P, (SubLObject)id_index.$sym49$DO_ID_INDEX);
        access_macros.register_macro_helper((SubLObject)id_index.$sym35$DO_ID_INDEX_DENSE_OBJECTS, (SubLObject)id_index.$sym49$DO_ID_INDEX);
        access_macros.register_macro_helper((SubLObject)id_index.$sym89$ID_INDEX_DENSE_OBJECTS_EMPTY_P, (SubLObject)id_index.$sym35$DO_ID_INDEX_DENSE_OBJECTS);
        access_macros.register_macro_helper((SubLObject)id_index.$sym92$ID_INDEX_SKIP_TOMBSTONES_P, (SubLObject)id_index.$list100);
        access_macros.register_macro_helper((SubLObject)id_index.$sym37$DO_ID_INDEX_SPARSE_OBJECTS, (SubLObject)id_index.$sym49$DO_ID_INDEX);
        access_macros.register_macro_helper((SubLObject)id_index.$sym112$ID_INDEX_SPARSE_OBJECTS_EMPTY_P, (SubLObject)id_index.$sym37$DO_ID_INDEX_SPARSE_OBJECTS);
        access_macros.register_macro_helper((SubLObject)id_index.$sym123$ID_INDEX_SPARSE_OBJECT_IDS, (SubLObject)id_index.$sym37$DO_ID_INDEX_SPARSE_OBJECTS);
        access_macros.register_macro_helper((SubLObject)id_index.$sym142$DO_ID_INDEX_NEXT_ID, (SubLObject)id_index.$sym129$NEW_DO_ID_INDEX);
        access_macros.register_macro_helper((SubLObject)id_index.$sym143$DO_ID_INDEX_NEXT_STATE, (SubLObject)id_index.$sym129$NEW_DO_ID_INDEX);
        access_macros.register_macro_helper((SubLObject)id_index.$sym144$DO_ID_INDEX_STATE_OBJECT, (SubLObject)id_index.$sym129$NEW_DO_ID_INDEX);
        access_macros.register_macro_helper((SubLObject)id_index.$sym145$DO_ID_INDEX_OBJECT_VALID_, (SubLObject)id_index.$sym129$NEW_DO_ID_INDEX);
        cfasl.register_wide_cfasl_opcode_input_function(id_index.$cfasl_wide_opcode_id_index$.getGlobalValue(), (SubLObject)id_index.$sym148$CFASL_INPUT_ID_INDEX);
        Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), id_index.$dtp_id_index$.getGlobalValue(), Symbols.symbol_function((SubLObject)id_index.$sym149$CFASL_OUTPUT_OBJECT_ID_INDEX_METHOD));
        generic_testing.define_test_case_table_int((SubLObject)id_index.$sym154$TEST_ID_INDEX_CFASL_SERIALIZATION, (SubLObject)ConsesLow.list(new SubLObject[] { id_index.$kw155$TEST, id_index.NIL, id_index.$kw156$OWNER, id_index.NIL, id_index.$kw157$CLASSES, id_index.NIL, id_index.$kw158$KB, id_index.$kw159$TINY, id_index.$kw160$WORKING_, id_index.T }), (SubLObject)id_index.$list161);
        generic_testing.define_test_case_table_int((SubLObject)id_index.$sym177$TEST_ID_INDEX_MISSING_IDS, (SubLObject)ConsesLow.list(new SubLObject[] { id_index.$kw155$TEST, id_index.NIL, id_index.$kw156$OWNER, id_index.NIL, id_index.$kw157$CLASSES, id_index.NIL, id_index.$kw158$KB, id_index.$kw159$TINY, id_index.$kw160$WORKING_, id_index.T }), (SubLObject)id_index.$list178);
        generic_testing.define_test_case_table_int((SubLObject)id_index.$sym183$TEST_NEW_INDEX_FROM_REVERSE_INDEX, (SubLObject)ConsesLow.list(new SubLObject[] { id_index.$kw155$TEST, id_index.NIL, id_index.$kw156$OWNER, id_index.NIL, id_index.$kw157$CLASSES, id_index.NIL, id_index.$kw158$KB, id_index.$kw159$TINY, id_index.$kw160$WORKING_, id_index.T }), (SubLObject)id_index.$list161);
        generic_testing.define_test_case_table_int((SubLObject)id_index.$sym189$TEST_DO_ID_INDEX_WITH_TOMBSTONES, (SubLObject)ConsesLow.list(new SubLObject[] { id_index.$kw155$TEST, id_index.NIL, id_index.$kw156$OWNER, id_index.NIL, id_index.$kw157$CLASSES, id_index.NIL, id_index.$kw158$KB, id_index.$kw159$TINY, id_index.$kw160$WORKING_, id_index.NIL }), (SubLObject)id_index.$list178);
        generic_testing.define_test_case_table_int((SubLObject)id_index.$sym200$TEST_ID_INDEX_WITH_SWIZZLING, (SubLObject)ConsesLow.list(new SubLObject[] { id_index.$kw155$TEST, id_index.NIL, id_index.$kw156$OWNER, id_index.NIL, id_index.$kw157$CLASSES, id_index.NIL, id_index.$kw158$KB, id_index.$kw159$TINY, id_index.$kw160$WORKING_, id_index.T }), (SubLObject)id_index.$list201);
        generic_testing.define_test_case_table_int((SubLObject)id_index.$sym205$TEST_ID_INDEX_ORDERED_ITERATION, (SubLObject)ConsesLow.list(new SubLObject[] { id_index.$kw155$TEST, id_index.NIL, id_index.$kw156$OWNER, id_index.NIL, id_index.$kw157$CLASSES, id_index.NIL, id_index.$kw158$KB, id_index.$kw159$TINY, id_index.$kw160$WORKING_, id_index.T }), (SubLObject)id_index.$list206);
        generic_testing.define_test_case_table_int((SubLObject)id_index.$sym221$TEST_PESSIMIZE_ID_INDEX, (SubLObject)ConsesLow.list(new SubLObject[] { id_index.$kw155$TEST, id_index.NIL, id_index.$kw156$OWNER, id_index.NIL, id_index.$kw157$CLASSES, id_index.NIL, id_index.$kw158$KB, id_index.$kw159$TINY, id_index.$kw160$WORKING_, id_index.T }), (SubLObject)id_index.$list222);
        return (SubLObject)id_index.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_id_index_file();
    }
    
    @Override
	public void initializeVariables() {
        init_id_index_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_id_index_file();
    }
    
    static {
        me = (SubLFile)new id_index();
        id_index.$dtp_id_index$ = null;
        id_index.$id_index_default_scaling_factor$ = null;
        id_index.$id_index_equality_test$ = null;
        id_index.$id_index_empty_list$ = null;
        id_index.$cfasl_wide_opcode_id_index$ = null;
        $sym0$ID_INDEX = SubLObjectFactory.makeSymbol("ID-INDEX");
        $sym1$ID_INDEX_P = SubLObjectFactory.makeSymbol("ID-INDEX-P");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOCK"), (SubLObject)SubLObjectFactory.makeSymbol("COUNT"), (SubLObject)SubLObjectFactory.makeSymbol("NEXT-ID"), (SubLObject)SubLObjectFactory.makeSymbol("DENSE-OBJECTS"), (SubLObject)SubLObjectFactory.makeSymbol("SPARSE-OBJECTS"));
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LOCK"), (SubLObject)SubLObjectFactory.makeKeyword("COUNT"), (SubLObject)SubLObjectFactory.makeKeyword("NEXT-ID"), (SubLObject)SubLObjectFactory.makeKeyword("DENSE-OBJECTS"), (SubLObject)SubLObjectFactory.makeKeyword("SPARSE-OBJECTS"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IDIX-LOCK"), (SubLObject)SubLObjectFactory.makeSymbol("IDIX-COUNT"), (SubLObject)SubLObjectFactory.makeSymbol("IDIX-NEXT-ID"), (SubLObject)SubLObjectFactory.makeSymbol("IDIX-DENSE-OBJECTS"), (SubLObject)SubLObjectFactory.makeSymbol("IDIX-SPARSE-OBJECTS"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-IDIX-LOCK"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-IDIX-COUNT"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-IDIX-NEXT-ID"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-IDIX-DENSE-OBJECTS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-IDIX-SPARSE-OBJECTS"));
        $sym6$PRINT_ID_INDEX = SubLObjectFactory.makeSymbol("PRINT-ID-INDEX");
        $sym7$ID_INDEX_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("ID-INDEX-PRINT-FUNCTION-TRAMPOLINE");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("ID-INDEX-P"));
        $sym9$IDIX_LOCK = SubLObjectFactory.makeSymbol("IDIX-LOCK");
        $sym10$_CSETF_IDIX_LOCK = SubLObjectFactory.makeSymbol("_CSETF-IDIX-LOCK");
        $sym11$IDIX_COUNT = SubLObjectFactory.makeSymbol("IDIX-COUNT");
        $sym12$_CSETF_IDIX_COUNT = SubLObjectFactory.makeSymbol("_CSETF-IDIX-COUNT");
        $sym13$IDIX_NEXT_ID = SubLObjectFactory.makeSymbol("IDIX-NEXT-ID");
        $sym14$_CSETF_IDIX_NEXT_ID = SubLObjectFactory.makeSymbol("_CSETF-IDIX-NEXT-ID");
        $sym15$IDIX_DENSE_OBJECTS = SubLObjectFactory.makeSymbol("IDIX-DENSE-OBJECTS");
        $sym16$_CSETF_IDIX_DENSE_OBJECTS = SubLObjectFactory.makeSymbol("_CSETF-IDIX-DENSE-OBJECTS");
        $sym17$IDIX_SPARSE_OBJECTS = SubLObjectFactory.makeSymbol("IDIX-SPARSE-OBJECTS");
        $sym18$_CSETF_IDIX_SPARSE_OBJECTS = SubLObjectFactory.makeSymbol("_CSETF-IDIX-SPARSE-OBJECTS");
        $kw19$LOCK = SubLObjectFactory.makeKeyword("LOCK");
        $kw20$COUNT = SubLObjectFactory.makeKeyword("COUNT");
        $kw21$NEXT_ID = SubLObjectFactory.makeKeyword("NEXT-ID");
        $kw22$DENSE_OBJECTS = SubLObjectFactory.makeKeyword("DENSE-OBJECTS");
        $kw23$SPARSE_OBJECTS = SubLObjectFactory.makeKeyword("SPARSE-OBJECTS");
        $str24$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw25$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym26$MAKE_ID_INDEX = SubLObjectFactory.makeSymbol("MAKE-ID-INDEX");
        $kw27$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw28$END = SubLObjectFactory.makeKeyword("END");
        $sym29$VISIT_DEFSTRUCT_OBJECT_ID_INDEX_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-ID-INDEX-METHOD");
        $str30$COUNT_ = SubLObjectFactory.makeString("COUNT=");
        $str31$_NEXT_ = SubLObjectFactory.makeString(" NEXT=");
        $sym32$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $str33$_A_has_had_next_id_reduced_from__ = SubLObjectFactory.makeString("~A has had next-id reduced from ~A to ~A.  This may result in errors.");
        $sym34$ID_INDEX_DENSE_OBJECTS = SubLObjectFactory.makeSymbol("ID-INDEX-DENSE-OBJECTS");
        $sym35$DO_ID_INDEX_DENSE_OBJECTS = SubLObjectFactory.makeSymbol("DO-ID-INDEX-DENSE-OBJECTS");
        $sym36$ID_INDEX_SPARSE_OBJECTS = SubLObjectFactory.makeSymbol("ID-INDEX-SPARSE-OBJECTS");
        $sym37$DO_ID_INDEX_SPARSE_OBJECTS = SubLObjectFactory.makeSymbol("DO-ID-INDEX-SPARSE-OBJECTS");
        $list38 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym39$ID_INDEX_LOCK = SubLObjectFactory.makeUninternedSymbol("ID-INDEX-LOCK");
        $sym40$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym41$ID_INDEX_LOCK = SubLObjectFactory.makeSymbol("ID-INDEX-LOCK");
        $sym42$WITH_LOCK_HELD = SubLObjectFactory.makeSymbol("WITH-LOCK-HELD");
        $sym43$WITH_ID_INDEX_LOCKED = SubLObjectFactory.makeSymbol("WITH-ID-INDEX-LOCKED");
        $int44$100 = SubLObjectFactory.makeInteger(100);
        $sym45$NON_NEGATIVE_INTEGER_P = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $str46$ID_INDEX = SubLObjectFactory.makeString("ID-INDEX");
        $str47$THE_EMPTY_LIST = SubLObjectFactory.makeString("THE-EMPTY-LIST");
        $sym48$ID_INDEX_TOMBSTONE_P = SubLObjectFactory.makeSymbol("ID-INDEX-TOMBSTONE-P");
        $sym49$DO_ID_INDEX = SubLObjectFactory.makeSymbol("DO-ID-INDEX");
        $sym50$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $str51$Fill_cannot_extend_into_sparse_sp = SubLObjectFactory.makeString("Fill cannot extend into sparse space.~%");
        $list52 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-ID-INDEX-DENSE-OBJECTS-ITERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ID-INDEX-SPARSE-OBJECTS-ITERATOR"));
        $list53 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-ID-INDEX-DENSE-OBJECTS-VALUES-ITERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ID-INDEX-SPARSE-OBJECTS-VALUES-ITERATOR"));
        $list54 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-ID-INDEX-DENSE-OBJECTS-ITERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ID-INDEX-SPARSE-OBJECTS-ORDERED-ITERATOR"));
        $sym55$ITERATE_ID_INDEX_DENSE_OBJECTS_NECESSARY = SubLObjectFactory.makeSymbol("ITERATE-ID-INDEX-DENSE-OBJECTS-NECESSARY");
        $list56 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $sym57$BOOLEAN = SubLObjectFactory.makeSymbol("BOOLEAN");
        $sym58$ID_INDEX_SPARSE_OBJECTS_ORDERED_ITERATOR_DONE_ = SubLObjectFactory.makeSymbol("ID-INDEX-SPARSE-OBJECTS-ORDERED-ITERATOR-DONE?");
        $sym59$ID_INDEX_SPARSE_OBJECTS_ORDERED_ITERATOR_NEXT = SubLObjectFactory.makeSymbol("ID-INDEX-SPARSE-OBJECTS-ORDERED-ITERATOR-NEXT");
        $kw60$KEY = SubLObjectFactory.makeKeyword("KEY");
        $kw61$VALUE = SubLObjectFactory.makeKeyword("VALUE");
        $list62 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)SubLObjectFactory.makeSymbol("SPARSE-OBJECTS"), (SubLObject)SubLObjectFactory.makeSymbol("END-ID"), (SubLObject)SubLObjectFactory.makeSymbol("KEY-VALUE-TUPLE"));
        $list63 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("ID-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TOMBSTONE"), (SubLObject)SubLObjectFactory.makeKeyword("SKIP")), (SubLObject)SubLObjectFactory.makeSymbol("ORDERED"), (SubLObject)SubLObjectFactory.makeSymbol("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list64 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TOMBSTONE"), (SubLObject)SubLObjectFactory.makeKeyword("ORDERED"), (SubLObject)SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw65$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw66$TOMBSTONE = SubLObjectFactory.makeKeyword("TOMBSTONE");
        $kw67$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $kw68$ORDERED = SubLObjectFactory.makeKeyword("ORDERED");
        $kw69$PROGRESS_MESSAGE = SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE");
        $kw70$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym71$OLD_DO_ID_INDEX = SubLObjectFactory.makeSymbol("OLD-DO-ID-INDEX");
        $sym72$IDX = SubLObjectFactory.makeUninternedSymbol("IDX");
        $sym73$PUNLESS = SubLObjectFactory.makeSymbol("PUNLESS");
        $sym74$ID_INDEX_OBJECTS_EMPTY_P = SubLObjectFactory.makeSymbol("ID-INDEX-OBJECTS-EMPTY-P");
        $sym75$IDX = SubLObjectFactory.makeUninternedSymbol("IDX");
        $sym76$MESS = SubLObjectFactory.makeUninternedSymbol("MESS");
        $sym77$TOTAL = SubLObjectFactory.makeUninternedSymbol("TOTAL");
        $sym78$SOFAR = SubLObjectFactory.makeUninternedSymbol("SOFAR");
        $sym79$ID_INDEX_COUNT = SubLObjectFactory.makeSymbol("ID-INDEX-COUNT");
        $list80 = ConsesLow.list((SubLObject)id_index.ZERO_INTEGER);
        $sym81$CHECK_TYPE = SubLObjectFactory.makeSymbol("CHECK-TYPE");
        $list82 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRINGP"));
        $sym83$NOTING_PERCENT_PROGRESS = SubLObjectFactory.makeSymbol("NOTING-PERCENT-PROGRESS");
        $sym84$CINC = SubLObjectFactory.makeSymbol("CINC");
        $sym85$NOTE_PERCENT_PROGRESS = SubLObjectFactory.makeSymbol("NOTE-PERCENT-PROGRESS");
        $list86 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("ID-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TOMBSTONE"), (SubLObject)SubLObjectFactory.makeKeyword("SKIP")), (SubLObject)SubLObjectFactory.makeSymbol("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list87 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TOMBSTONE"), (SubLObject)SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $sym88$IDX = SubLObjectFactory.makeUninternedSymbol("IDX");
        $sym89$ID_INDEX_DENSE_OBJECTS_EMPTY_P = SubLObjectFactory.makeSymbol("ID-INDEX-DENSE-OBJECTS-EMPTY-P");
        $sym90$DO_VECTOR_INDEX = SubLObjectFactory.makeSymbol("DO-VECTOR-INDEX");
        $sym91$CAND = SubLObjectFactory.makeSymbol("CAND");
        $sym92$ID_INDEX_SKIP_TOMBSTONES_P = SubLObjectFactory.makeSymbol("ID-INDEX-SKIP-TOMBSTONES-P");
        $sym93$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym94$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $sym95$IDX = SubLObjectFactory.makeUninternedSymbol("IDX");
        $sym96$MESS = SubLObjectFactory.makeUninternedSymbol("MESS");
        $sym97$TOTAL = SubLObjectFactory.makeUninternedSymbol("TOTAL");
        $sym98$SOFAR = SubLObjectFactory.makeUninternedSymbol("SOFAR");
        $sym99$ID_INDEX_DENSE_OBJECT_COUNT = SubLObjectFactory.makeSymbol("ID-INDEX-DENSE-OBJECT-COUNT");
        $list100 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DO-ID-INDEX-DENSE-OBJECTS"), (SubLObject)SubLObjectFactory.makeSymbol("DO-ID-INDEX-SPARSE-OBJECTS"));
        $sym101$IDX = SubLObjectFactory.makeUninternedSymbol("IDX");
        $sym102$MESS = SubLObjectFactory.makeUninternedSymbol("MESS");
        $sym103$TOTAL = SubLObjectFactory.makeUninternedSymbol("TOTAL");
        $sym104$SOFAR = SubLObjectFactory.makeUninternedSymbol("SOFAR");
        $sym105$ID_INDEX_SPARSE_OBJECT_COUNT = SubLObjectFactory.makeSymbol("ID-INDEX-SPARSE-OBJECT-COUNT");
        $sym106$IDX = SubLObjectFactory.makeUninternedSymbol("IDX");
        $sym107$PIF = SubLObjectFactory.makeSymbol("PIF");
        $sym108$IDX = SubLObjectFactory.makeUninternedSymbol("IDX");
        $sym109$SPARSE = SubLObjectFactory.makeUninternedSymbol("SPARSE");
        $sym110$END_ID = SubLObjectFactory.makeUninternedSymbol("END-ID");
        $sym111$DEFAULT = SubLObjectFactory.makeUninternedSymbol("DEFAULT");
        $sym112$ID_INDEX_SPARSE_OBJECTS_EMPTY_P = SubLObjectFactory.makeSymbol("ID-INDEX-SPARSE-OBJECTS-EMPTY-P");
        $sym113$ID_INDEX_SPARSE_ID_THRESHOLD = SubLObjectFactory.makeSymbol("ID-INDEX-SPARSE-ID-THRESHOLD");
        $sym114$ID_INDEX_NEXT_ID = SubLObjectFactory.makeSymbol("ID-INDEX-NEXT-ID");
        $sym115$FUNLESS = SubLObjectFactory.makeSymbol("FUNLESS");
        $sym116$WHILE = SubLObjectFactory.makeSymbol("WHILE");
        $sym117$_ = SubLObjectFactory.makeSymbol("<");
        $sym118$CNOT = SubLObjectFactory.makeSymbol("CNOT");
        $sym119$GETHASH_WITHOUT_VALUES = SubLObjectFactory.makeSymbol("GETHASH-WITHOUT-VALUES");
        $str120$Setting__TOMBSTONE_to__A_requires = SubLObjectFactory.makeString("Setting :TOMBSTONE to ~A requires that :ORDERED be set to T");
        $sym121$IDX = SubLObjectFactory.makeUninternedSymbol("IDX");
        $sym122$DO_HASH_TABLE = SubLObjectFactory.makeSymbol("DO-HASH-TABLE");
        $sym123$ID_INDEX_SPARSE_OBJECT_IDS = SubLObjectFactory.makeSymbol("ID-INDEX-SPARSE-OBJECT-IDS");
        $list124 = ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("ID"), SubLObjectFactory.makeSymbol("OBJECT"), SubLObjectFactory.makeSymbol("ID-INDEX"), SubLObjectFactory.makeSymbol("&KEY"), SubLObjectFactory.makeSymbol("START-ID"), SubLObjectFactory.makeSymbol("END-ID"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TOMBSTONE"), (SubLObject)SubLObjectFactory.makeKeyword("SKIP")), SubLObjectFactory.makeSymbol("ORDERED"), SubLObjectFactory.makeSymbol("PROGRESS-MESSAGE"), SubLObjectFactory.makeSymbol("DONE") }), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list125 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("START-ID"), (SubLObject)SubLObjectFactory.makeKeyword("END-ID"), (SubLObject)SubLObjectFactory.makeKeyword("TOMBSTONE"), (SubLObject)SubLObjectFactory.makeKeyword("ORDERED"), (SubLObject)SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw126$START_ID = SubLObjectFactory.makeKeyword("START-ID");
        $kw127$END_ID = SubLObjectFactory.makeKeyword("END-ID");
        $sym128$IDX = SubLObjectFactory.makeUninternedSymbol("IDX");
        $sym129$NEW_DO_ID_INDEX = SubLObjectFactory.makeSymbol("NEW-DO-ID-INDEX");
        $sym130$MESS = SubLObjectFactory.makeUninternedSymbol("MESS");
        $sym131$TOTAL = SubLObjectFactory.makeUninternedSymbol("TOTAL");
        $sym132$SOFAR = SubLObjectFactory.makeUninternedSymbol("SOFAR");
        $sym133$TOMB = SubLObjectFactory.makeUninternedSymbol("TOMB");
        $sym134$ORD = SubLObjectFactory.makeUninternedSymbol("ORD");
        $sym135$LAST_ID = SubLObjectFactory.makeUninternedSymbol("LAST-ID");
        $sym136$STATE_VAR = SubLObjectFactory.makeUninternedSymbol("STATE-VAR");
        $sym137$__ = SubLObjectFactory.makeSymbol("<=");
        $sym138$FIF = SubLObjectFactory.makeSymbol("FIF");
        $sym139$_ = SubLObjectFactory.makeSymbol("-");
        $list140 = ConsesLow.list((SubLObject)id_index.ONE_INTEGER);
        $list141 = ConsesLow.list((SubLObject)id_index.NIL);
        $sym142$DO_ID_INDEX_NEXT_ID = SubLObjectFactory.makeSymbol("DO-ID-INDEX-NEXT-ID");
        $sym143$DO_ID_INDEX_NEXT_STATE = SubLObjectFactory.makeSymbol("DO-ID-INDEX-NEXT-STATE");
        $sym144$DO_ID_INDEX_STATE_OBJECT = SubLObjectFactory.makeSymbol("DO-ID-INDEX-STATE-OBJECT");
        $sym145$DO_ID_INDEX_OBJECT_VALID_ = SubLObjectFactory.makeSymbol("DO-ID-INDEX-OBJECT-VALID?");
        $str146$unexpected_new_do_id_index_iterat = SubLObjectFactory.makeString("unexpected new-do-id-index iteration state ~S");
        $int147$128 = SubLObjectFactory.makeInteger(128);
        $sym148$CFASL_INPUT_ID_INDEX = SubLObjectFactory.makeSymbol("CFASL-INPUT-ID-INDEX");
        $sym149$CFASL_OUTPUT_OBJECT_ID_INDEX_METHOD = SubLObjectFactory.makeSymbol("CFASL-OUTPUT-OBJECT-ID-INDEX-METHOD");
        $str150$Expected__A_dense_elements__got__ = SubLObjectFactory.makeString("Expected ~A dense elements, got ~A instead.");
        $str151$Expected__A_sparse_elements__got_ = SubLObjectFactory.makeString("Expected ~A sparse elements, got ~A instead.");
        $str152$The_sparse_ID_index_should_have__ = SubLObjectFactory.makeString("The sparse ID index should have ~A entries, but it has ~A.");
        $str153$The_sparse_ID_index_should_have_a = SubLObjectFactory.makeString("The sparse ID index should have a dense space size of ~A, not ~A.");
        $sym154$TEST_ID_INDEX_CFASL_SERIALIZATION = SubLObjectFactory.makeSymbol("TEST-ID-INDEX-CFASL-SERIALIZATION");
        $kw155$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw156$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw157$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw158$KB = SubLObjectFactory.makeKeyword("KB");
        $kw159$TINY = SubLObjectFactory.makeKeyword("TINY");
        $kw160$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list161 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(100), (SubLObject)id_index.TWENTY_INTEGER), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(100), (SubLObject)id_index.TWENTY_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("TO-HEX-STRING"), (SubLObject)id_index.EQUAL), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")));
        $sym162$TO_STRING = SubLObjectFactory.makeSymbol("TO-STRING");
        $str163$We_did_not_get_an_ID_index_back__ = SubLObjectFactory.makeString("We did not get an ID index back, but got ~A instead.");
        $str164$The_dense_ID_index__A_does_not_ha = SubLObjectFactory.makeString("The dense ID index ~A does not have the same number of elements as the new ID index ~A.");
        $kw165$SUCCESS = SubLObjectFactory.makeKeyword("SUCCESS");
        $sym166$ID_INDEX_PESSIMIZED_P = SubLObjectFactory.makeSymbol("ID-INDEX-PESSIMIZED-P");
        $str167$Compacting_ID_index = SubLObjectFactory.makeString("Compacting ID index");
        $sym168$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym169$FUNCTION_SPEC_P = SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P");
        $str170$Updating_object_IDs = SubLObjectFactory.makeString("Updating object IDs");
        $kw171$ALL = SubLObjectFactory.makeKeyword("ALL");
        $list172 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALL"), (SubLObject)SubLObjectFactory.makeKeyword("DENSE"), (SubLObject)SubLObjectFactory.makeKeyword("SPARSE"));
        $str173$Type_must_be_one_of_____ALL__DENS = SubLObjectFactory.makeString("Type must be one of -- :ALL :DENSE :SPARSE");
        $kw174$SPARSE = SubLObjectFactory.makeKeyword("SPARSE");
        $list175 = ConsesLow.list((SubLObject)SubLObjectFactory.makeUninternedSymbol("START"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("END"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("DELTA"));
        $kw176$DENSE = SubLObjectFactory.makeKeyword("DENSE");
        $sym177$TEST_ID_INDEX_MISSING_IDS = SubLObjectFactory.makeSymbol("TEST-ID-INDEX-MISSING-IDS");
        $list178 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(100), (SubLObject)id_index.TWENTY_INTEGER, (SubLObject)id_index.TWENTY_INTEGER), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(1000), (SubLObject)SubLObjectFactory.makeInteger(200), (SubLObject)SubLObjectFactory.makeInteger(200)), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(255), (SubLObject)id_index.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(40)), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")));
        $str179$ID__A_is_missing__it_is__A_ = SubLObjectFactory.makeString("ID ~A is missing; it is ~A.");
        $str180$expected_to_be_present = SubLObjectFactory.makeString("expected to be present");
        $str181$expected_to_be_absent = SubLObjectFactory.makeString("expected to be absent");
        $list182 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("ID"));
        $sym183$TEST_NEW_INDEX_FROM_REVERSE_INDEX = SubLObjectFactory.makeSymbol("TEST-NEW-INDEX-FROM-REVERSE-INDEX");
        $str184$The_dense_ID_index__A_is_of_a_dif = SubLObjectFactory.makeString("The dense ID index ~A is of a different size than the new ID index ~A.");
        $kw185$NOT_FOUND = SubLObjectFactory.makeKeyword("NOT-FOUND");
        $str186$The_reverse_index_for__A_does_not = SubLObjectFactory.makeString("The reverse index for ~A does not contain ~A.");
        $str187$The_new_ID_index_does_not_have__A = SubLObjectFactory.makeString("The new ID index does not have ~A at location ~A.");
        $str188$There_is_a_mismatch_between_the__ = SubLObjectFactory.makeString("There is a mismatch between the ~A-nth expected next ID, ~A and the actual ID suggested ~A.");
        $sym189$TEST_DO_ID_INDEX_WITH_TOMBSTONES = SubLObjectFactory.makeSymbol("TEST-DO-ID-INDEX-WITH-TOMBSTONES");
        $kw190$RIP = SubLObjectFactory.makeKeyword("RIP");
        $str191$Error__the_ID_range_is_not_truely = SubLObjectFactory.makeString("Error, the ID range is not truely consecutive; expected ~A got ~A.");
        $str192$Error_at_index__A__expected_tombs = SubLObjectFactory.makeString("Error at index ~A, expected tombstone, got ~A.");
        $str193$Error_at_index__A__expected_objec = SubLObjectFactory.makeString("Error at index ~A, expected object, got tombstone.");
        $str194$There_are_holes_that_we_did_not_s = SubLObjectFactory.makeString("There are holes that we did not see: ~A were missing.");
        $str195$Error__ID__A_is_not_in_line_with_ = SubLObjectFactory.makeString("Error, ID ~A is not in line with counter ~A.");
        $str196$_DONE_should_have_taken_us_to__A_ = SubLObjectFactory.makeString(":DONE should have taken us to ~A but it got us to ~A.");
        $str197$Hey__we_deleted_everything_and_th = SubLObjectFactory.makeString("Hey, we deleted everything and the ID index is not empty?");
        $str198$Error__an_empty_ID_index_contains = SubLObjectFactory.makeString("Error, an empty ID index contains non-tombstone ~A???");
        $str199$Hey___A______A__they_did_not_show = SubLObjectFactory.makeString("Hey, ~A =/= ~A; they did not show us all the tombstones ...!");
        $sym200$TEST_ID_INDEX_WITH_SWIZZLING = SubLObjectFactory.makeSymbol("TEST-ID-INDEX-WITH-SWIZZLING");
        $list201 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(100), (SubLObject)id_index.TWENTY_INTEGER), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(100), (SubLObject)SubLObjectFactory.makeInteger(200)), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")));
        $str202$The_test_is_badly_designed__no_bi = SubLObjectFactory.makeString("The test is badly designed, no bignum IDs were produced.~%");
        $str203$ = SubLObjectFactory.makeString("");
        $str204$We_could_not_retrieve__S_from_the = SubLObjectFactory.makeString("We could not retrieve ~S from the ID index using ~A.");
        $sym205$TEST_ID_INDEX_ORDERED_ITERATION = SubLObjectFactory.makeSymbol("TEST-ID-INDEX-ORDERED-ITERATION");
        $list206 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)id_index.TEN_INTEGER, (SubLObject)id_index.TWENTY_INTEGER), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(100), (SubLObject)SubLObjectFactory.makeInteger(200)), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")));
        $str207$We_expected_something_larger_than = SubLObjectFactory.makeString("We expected something larger than ~A, but got ~A.~%");
        $str208$a = SubLObjectFactory.makeString("a");
        $str209$b = SubLObjectFactory.makeString("b");
        $str210$c = SubLObjectFactory.makeString("c");
        $list211 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("a"), (SubLObject)SubLObjectFactory.makeString("b"), (SubLObject)SubLObjectFactory.makeString("c"));
        $str212$d = SubLObjectFactory.makeString("d");
        $str213$e = SubLObjectFactory.makeString("e");
        $kw214$ID_INDEX_RELOOKUP_FAILURE = SubLObjectFactory.makeKeyword("ID-INDEX-RELOOKUP-FAILURE");
        $kw215$ID_INDEX_RECOUNT_FAILURE = SubLObjectFactory.makeKeyword("ID-INDEX-RECOUNT-FAILURE");
        $kw216$DO_ID_INDEX_FAILURE = SubLObjectFactory.makeKeyword("DO-ID-INDEX-FAILURE");
        $kw217$ID_INDEX_LOOKUP_FAILURE = SubLObjectFactory.makeKeyword("ID-INDEX-LOOKUP-FAILURE");
        $kw218$ID_INDEX_COUNT_FAILURE = SubLObjectFactory.makeKeyword("ID-INDEX-COUNT-FAILURE");
        $kw219$INITIAL_ID_INDEX_COUNT_FAILURE = SubLObjectFactory.makeKeyword("INITIAL-ID-INDEX-COUNT-FAILURE");
        $kw220$UNEXPECTED_FAILURE = SubLObjectFactory.makeKeyword("UNEXPECTED-FAILURE");
        $sym221$TEST_PESSIMIZE_ID_INDEX = SubLObjectFactory.makeSymbol("TEST-PESSIMIZE-ID-INDEX");
        $list222 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)id_index.NIL, (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")));
        $list223 = ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(100), (SubLObject)SubLObjectFactory.makeInteger(1000), (SubLObject)SubLObjectFactory.makeInteger(10000), (SubLObject)SubLObjectFactory.makeInteger(100000), (SubLObject)SubLObjectFactory.makeInteger(1000000));
        $int224$212 = SubLObjectFactory.makeInteger(212);
    }
    
    public static final class $id_index_native extends SubLStructNative
    {
        public SubLObject $lock;
        public SubLObject $count;
        public SubLObject $next_id;
        public SubLObject $dense_objects;
        public SubLObject $sparse_objects;
        private static final SubLStructDeclNative structDecl;
        
        public $id_index_native() {
            this.$lock = (SubLObject)CommonSymbols.NIL;
            this.$count = (SubLObject)CommonSymbols.NIL;
            this.$next_id = (SubLObject)CommonSymbols.NIL;
            this.$dense_objects = (SubLObject)CommonSymbols.NIL;
            this.$sparse_objects = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$id_index_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$lock;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$count;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$next_id;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$dense_objects;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$sparse_objects;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$lock = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$count = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$next_id = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$dense_objects = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$sparse_objects = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$id_index_native.class, id_index.$sym0$ID_INDEX, id_index.$sym1$ID_INDEX_P, id_index.$list2, id_index.$list3, new String[] { "$lock", "$count", "$next_id", "$dense_objects", "$sparse_objects" }, id_index.$list4, id_index.$list5, id_index.$sym6$PRINT_ID_INDEX);
        }
    }
    
    public static final class $id_index_p$UnaryFunction extends UnaryFunction
    {
        public $id_index_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("ID-INDEX-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return id_index.id_index_p(arg1);
        }
    }
}

/*

	Total time: 1086 ms
	 synthetic 
*/