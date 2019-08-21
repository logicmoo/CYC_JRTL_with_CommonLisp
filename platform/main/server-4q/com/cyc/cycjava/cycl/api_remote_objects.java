package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.api_remote_objects;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
import java.util.function.Supplier;

import static com.cyc.cycjava.cycl.api_remote_objects.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class api_remote_objects extends SubLTranslatedFile {
    public static final SubLFile me = new api_remote_objects();

    public static final String myName = "com.cyc.cycjava.cycl.api_remote_objects";

    public static final String myFingerPrint = "553d504365e3375bba738135a9573b02e8693634cb17582c334dda80a3e71003";







    // Internal Constants
    public static final SubLSymbol $remo_session_map$ = makeSymbol("*REMO-SESSION-MAP*");

    public static final SubLSymbol $remo_session_id_generator$ = makeSymbol("*REMO-SESSION-ID-GENERATOR*");





    public static final SubLSymbol $remo_object_not_found$ = makeSymbol("*REMO-OBJECT-NOT-FOUND*");

    public static final SubLString $$$Remote_Object_Not_Found = makeString("Remote Object Not Found");

    public static SubLObject new_remote_object_session(SubLObject lease) {
        if (lease == UNPROVIDED) {
            lease = NIL;
        }
        final SubLObject id = get_next_remo_session_id();
        allocate_new_remo_session_object(lease, id);
        return id;
    }

    public static SubLObject valid_remote_object_session_p(final SubLObject session_id) {
        return valid_remo_session_object_p(find_remo_session_object(session_id, UNPROVIDED));
    }

    public static SubLObject delete_remote_object_session(final SubLObject session_id) {
        drop_remo_session_object(session_id);
        return T;
    }

    public static SubLObject clear_remo_session_id_generator() {
        return integer_sequence_generator.integer_sequence_generator_reset($remo_session_id_generator$.getGlobalValue());
    }

    public static SubLObject get_next_remo_session_id() {
        return integer_sequence_generator.integer_sequence_generator_next($remo_session_id_generator$.getGlobalValue());
    }

    public static SubLObject valid_remo_session_object_p(final SubLObject v_object) {
        return dictionary.dictionary_p(v_object);
    }

    public static SubLObject allocate_new_remo_session_object(final SubLObject lease, final SubLObject id) {
        final SubLObject session = get_new_remo_session_object(lease);
        dictionary.dictionary_enter($remo_session_map$.getGlobalValue(), id, session);
        return id;
    }

    public static SubLObject get_new_remo_session_object(final SubLObject lease) {
        final SubLObject id_generator = integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject session_information = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        dictionary.dictionary_enter(session_information, $ID_GENERATOR, id_generator);
        dictionary.dictionary_enter(session_information, $LEASE, lease);
        return session_information;
    }

    public static SubLObject find_remo_session_object(final SubLObject id, SubLObject not_found_value) {
        if (not_found_value == UNPROVIDED) {
            not_found_value = NIL;
        }
        return dictionary.dictionary_lookup($remo_session_map$.getGlobalValue(), id, not_found_value);
    }

    public static SubLObject drop_remo_session_object(final SubLObject id) {
        return dictionary.dictionary_remove($remo_session_map$.getGlobalValue(), id);
    }

    public static SubLObject valid_remote_object_p(final SubLObject session_id, final SubLObject object_id) {
        return makeBoolean((NIL != valid_remote_object_session_p(session_id)) && (NIL != valid_remote_object_in_session_p(session_id, object_id)));
    }

    public static SubLObject create_remote_object_id(final SubLObject session_id) {
        final SubLObject session_information = find_remo_session_object(session_id, UNPROVIDED);
        return allocate_remo_in_session(session_information);
    }

    public static SubLObject get_remote_object_value(final SubLObject session_id, final SubLObject object_id) {
        final SubLObject session_information = find_remo_session_object(session_id, UNPROVIDED);
        final SubLObject v_object = find_remo_in_session(session_information, object_id);
        return v_object;
    }

    public static SubLObject set_remote_object_value(final SubLObject session_id, final SubLObject object_id, final SubLObject value) {
        final SubLObject session_information = find_remo_session_object(session_id, UNPROVIDED);
        set_remo_in_session_value(session_information, object_id, value);
        return session_id;
    }

    public static SubLObject delete_remote_object_id(final SubLObject session_id, final SubLObject object_id) {
        final SubLObject session_information = find_remo_session_object(session_id, UNPROVIDED);
        clear_remo_in_session(session_information, object_id);
        return session_id;
    }

    public static SubLObject valid_remote_object_in_session_p(final SubLObject session_id, final SubLObject object_id) {
        final SubLObject session_information = find_remo_session_object(session_id, UNPROVIDED);
        if (NIL != valid_remo_session_object_p(session_information)) {
            return makeBoolean(!dictionary.dictionary_lookup(session_information, object_id, $remo_object_not_found$.getGlobalValue()).eql($remo_object_not_found$.getGlobalValue()));
        }
        return NIL;
    }

    public static SubLObject find_remo_in_session(final SubLObject session_information, final SubLObject object_id) {
        if (NIL != valid_remo_session_object_p(session_information)) {
            return dictionary.dictionary_lookup(session_information, object_id, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject set_remo_in_session_value(final SubLObject session_information, final SubLObject object_id, final SubLObject value) {
        if (NIL != valid_remo_session_object_p(session_information)) {
            return dictionary.dictionary_enter(session_information, object_id, value);
        }
        return NIL;
    }

    public static SubLObject allocate_remo_in_session(final SubLObject session_information) {
        if (NIL != valid_remo_session_object_p(session_information)) {
            final SubLObject id_isg = dictionary.dictionary_lookup(session_information, $ID_GENERATOR, UNPROVIDED);
            if (NIL != integer_sequence_generator.integer_sequence_generator_p(id_isg)) {
                final SubLObject new_id = integer_sequence_generator.integer_sequence_generator_next(id_isg);
                return new_id;
            }
        }
        return NIL;
    }

    public static SubLObject clear_remo_in_session(final SubLObject session_information, final SubLObject object_id) {
        if (NIL != dictionary.dictionary_p(session_information)) {
            return dictionary.dictionary_remove(session_information, object_id);
        }
        return NIL;
    }

    public static SubLObject declare_api_remote_objects_file() {
        declareFunction(me, "new_remote_object_session", "NEW-REMOTE-OBJECT-SESSION", 0, 1, false);
        declareFunction(me, "valid_remote_object_session_p", "VALID-REMOTE-OBJECT-SESSION-P", 1, 0, false);
        declareFunction(me, "delete_remote_object_session", "DELETE-REMOTE-OBJECT-SESSION", 1, 0, false);
        declareFunction(me, "clear_remo_session_id_generator", "CLEAR-REMO-SESSION-ID-GENERATOR", 0, 0, false);
        declareFunction(me, "get_next_remo_session_id", "GET-NEXT-REMO-SESSION-ID", 0, 0, false);
        declareFunction(me, "valid_remo_session_object_p", "VALID-REMO-SESSION-OBJECT-P", 1, 0, false);
        declareFunction(me, "allocate_new_remo_session_object", "ALLOCATE-NEW-REMO-SESSION-OBJECT", 2, 0, false);
        declareFunction(me, "get_new_remo_session_object", "GET-NEW-REMO-SESSION-OBJECT", 1, 0, false);
        declareFunction(me, "find_remo_session_object", "FIND-REMO-SESSION-OBJECT", 1, 1, false);
        declareFunction(me, "drop_remo_session_object", "DROP-REMO-SESSION-OBJECT", 1, 0, false);
        declareFunction(me, "valid_remote_object_p", "VALID-REMOTE-OBJECT-P", 2, 0, false);
        declareFunction(me, "create_remote_object_id", "CREATE-REMOTE-OBJECT-ID", 1, 0, false);
        declareFunction(me, "get_remote_object_value", "GET-REMOTE-OBJECT-VALUE", 2, 0, false);
        declareFunction(me, "set_remote_object_value", "SET-REMOTE-OBJECT-VALUE", 3, 0, false);
        declareFunction(me, "delete_remote_object_id", "DELETE-REMOTE-OBJECT-ID", 2, 0, false);
        declareFunction(me, "valid_remote_object_in_session_p", "VALID-REMOTE-OBJECT-IN-SESSION-P", 2, 0, false);
        declareFunction(me, "find_remo_in_session", "FIND-REMO-IN-SESSION", 2, 0, false);
        declareFunction(me, "set_remo_in_session_value", "SET-REMO-IN-SESSION-VALUE", 3, 0, false);
        declareFunction(me, "allocate_remo_in_session", "ALLOCATE-REMO-IN-SESSION", 1, 0, false);
        declareFunction(me, "clear_remo_in_session", "CLEAR-REMO-IN-SESSION", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_api_remote_objects_file() {
        deflexical("*REMO-SESSION-MAP*", SubLTrampolineFile.maybeDefault($remo_session_map$, $remo_session_map$, () -> dictionary.new_dictionary(UNPROVIDED, UNPROVIDED)));
        deflexical("*REMO-SESSION-ID-GENERATOR*", SubLTrampolineFile.maybeDefault($remo_session_id_generator$, $remo_session_id_generator$, () -> integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        deflexical("*REMO-OBJECT-NOT-FOUND*", SubLTrampolineFile.maybeDefault($remo_object_not_found$, $remo_object_not_found$, () -> make_symbol($$$Remote_Object_Not_Found)));
        return NIL;
    }

    public static SubLObject setup_api_remote_objects_file() {
        declare_defglobal($remo_session_map$);
        declare_defglobal($remo_session_id_generator$);
        declare_defglobal($remo_object_not_found$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_api_remote_objects_file();
    }

    @Override
    public void initializeVariables() {
        init_api_remote_objects_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_api_remote_objects_file();
    }

    static {










    }
}

/**
 * Total time: 35 ms
 */
