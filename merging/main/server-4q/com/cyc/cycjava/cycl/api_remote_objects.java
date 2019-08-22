/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.make_symbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class api_remote_objects extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new api_remote_objects();

 public static final String myName = "com.cyc.cycjava.cycl.api_remote_objects";


    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    public static final SubLSymbol $remo_session_map$ = makeSymbol("*REMO-SESSION-MAP*");

    public static final SubLSymbol $remo_session_id_generator$ = makeSymbol("*REMO-SESSION-ID-GENERATOR*");

    public static final SubLSymbol $remo_object_not_found$ = makeSymbol("*REMO-OBJECT-NOT-FOUND*");

    static private final SubLString $$$Remote_Object_Not_Found = makeString("Remote Object Not Found");

    // Definitions
    public static final SubLObject new_remote_object_session_alt(SubLObject lease) {
        if (lease == UNPROVIDED) {
            lease = NIL;
        }
        {
            SubLObject id = com.cyc.cycjava.cycl.api_remote_objects.get_next_remo_session_id();
            com.cyc.cycjava.cycl.api_remote_objects.allocate_new_remo_session_object(lease, id);
            return id;
        }
    }

    // Definitions
    public static SubLObject new_remote_object_session(SubLObject lease) {
        if (lease == UNPROVIDED) {
            lease = NIL;
        }
        final SubLObject id = get_next_remo_session_id();
        allocate_new_remo_session_object(lease, id);
        return id;
    }

    public static final SubLObject valid_remote_object_session_p_alt(SubLObject session_id) {
        return com.cyc.cycjava.cycl.api_remote_objects.valid_remo_session_object_p(com.cyc.cycjava.cycl.api_remote_objects.find_remo_session_object(session_id, UNPROVIDED));
    }

    public static SubLObject valid_remote_object_session_p(final SubLObject session_id) {
        return valid_remo_session_object_p(find_remo_session_object(session_id, UNPROVIDED));
    }

    public static final SubLObject delete_remote_object_session_alt(SubLObject session_id) {
        com.cyc.cycjava.cycl.api_remote_objects.drop_remo_session_object(session_id);
        return T;
    }

    public static SubLObject delete_remote_object_session(final SubLObject session_id) {
        drop_remo_session_object(session_id);
        return T;
    }

    public static final SubLObject clear_remo_session_id_generator_alt() {
        return integer_sequence_generator.integer_sequence_generator_reset($remo_session_id_generator$.getGlobalValue());
    }

    public static SubLObject clear_remo_session_id_generator() {
        return integer_sequence_generator.integer_sequence_generator_reset($remo_session_id_generator$.getGlobalValue());
    }

    public static final SubLObject get_next_remo_session_id_alt() {
        return integer_sequence_generator.integer_sequence_generator_next($remo_session_id_generator$.getGlobalValue());
    }

    public static SubLObject get_next_remo_session_id() {
        return integer_sequence_generator.integer_sequence_generator_next($remo_session_id_generator$.getGlobalValue());
    }

    public static final SubLObject valid_remo_session_object_p_alt(SubLObject v_object) {
        return dictionary.dictionary_p(v_object);
    }

    public static SubLObject valid_remo_session_object_p(final SubLObject v_object) {
        return dictionary.dictionary_p(v_object);
    }

    public static final SubLObject allocate_new_remo_session_object_alt(SubLObject lease, SubLObject id) {
        {
            SubLObject session = com.cyc.cycjava.cycl.api_remote_objects.get_new_remo_session_object(lease);
            dictionary.dictionary_enter($remo_session_map$.getGlobalValue(), id, session);
            return id;
        }
    }

    public static SubLObject allocate_new_remo_session_object(final SubLObject lease, final SubLObject id) {
        final SubLObject session = get_new_remo_session_object(lease);
        dictionary.dictionary_enter($remo_session_map$.getGlobalValue(), id, session);
        return id;
    }

    public static final SubLObject get_new_remo_session_object_alt(SubLObject lease) {
        {
            SubLObject id_generator = integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject session_information = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
            dictionary.dictionary_enter(session_information, $ID_GENERATOR, id_generator);
            dictionary.dictionary_enter(session_information, $LEASE, lease);
            return session_information;
        }
    }

    public static SubLObject get_new_remo_session_object(final SubLObject lease) {
        final SubLObject id_generator = integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject session_information = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        dictionary.dictionary_enter(session_information, $ID_GENERATOR, id_generator);
        dictionary.dictionary_enter(session_information, $LEASE, lease);
        return session_information;
    }

    public static final SubLObject find_remo_session_object_alt(SubLObject id, SubLObject not_found_value) {
        if (not_found_value == UNPROVIDED) {
            not_found_value = NIL;
        }
        return dictionary.dictionary_lookup($remo_session_map$.getGlobalValue(), id, not_found_value);
    }

    public static SubLObject find_remo_session_object(final SubLObject id, SubLObject not_found_value) {
        if (not_found_value == UNPROVIDED) {
            not_found_value = NIL;
        }
        return dictionary.dictionary_lookup($remo_session_map$.getGlobalValue(), id, not_found_value);
    }

    public static final SubLObject drop_remo_session_object_alt(SubLObject id) {
        return dictionary.dictionary_remove($remo_session_map$.getGlobalValue(), id);
    }

    public static SubLObject drop_remo_session_object(final SubLObject id) {
        return dictionary.dictionary_remove($remo_session_map$.getGlobalValue(), id);
    }

    public static final SubLObject valid_remote_object_p_alt(SubLObject session_id, SubLObject object_id) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.api_remote_objects.valid_remote_object_session_p(session_id)) && (NIL != com.cyc.cycjava.cycl.api_remote_objects.valid_remote_object_in_session_p(session_id, object_id)));
    }

    public static SubLObject valid_remote_object_p(final SubLObject session_id, final SubLObject object_id) {
        return makeBoolean((NIL != valid_remote_object_session_p(session_id)) && (NIL != valid_remote_object_in_session_p(session_id, object_id)));
    }

    public static final SubLObject create_remote_object_id_alt(SubLObject session_id) {
        {
            SubLObject session_information = com.cyc.cycjava.cycl.api_remote_objects.find_remo_session_object(session_id, UNPROVIDED);
            return com.cyc.cycjava.cycl.api_remote_objects.allocate_remo_in_session(session_information);
        }
    }

    public static SubLObject create_remote_object_id(final SubLObject session_id) {
        final SubLObject session_information = find_remo_session_object(session_id, UNPROVIDED);
        return allocate_remo_in_session(session_information);
    }

    public static final SubLObject get_remote_object_value_alt(SubLObject session_id, SubLObject object_id) {
        {
            SubLObject session_information = com.cyc.cycjava.cycl.api_remote_objects.find_remo_session_object(session_id, UNPROVIDED);
            SubLObject v_object = com.cyc.cycjava.cycl.api_remote_objects.find_remo_in_session(session_information, object_id);
            return v_object;
        }
    }

    public static SubLObject get_remote_object_value(final SubLObject session_id, final SubLObject object_id) {
        final SubLObject session_information = find_remo_session_object(session_id, UNPROVIDED);
        final SubLObject v_object = find_remo_in_session(session_information, object_id);
        return v_object;
    }

    public static final SubLObject set_remote_object_value_alt(SubLObject session_id, SubLObject object_id, SubLObject value) {
        {
            SubLObject session_information = com.cyc.cycjava.cycl.api_remote_objects.find_remo_session_object(session_id, UNPROVIDED);
            com.cyc.cycjava.cycl.api_remote_objects.set_remo_in_session_value(session_information, object_id, value);
        }
        return session_id;
    }

    public static SubLObject set_remote_object_value(final SubLObject session_id, final SubLObject object_id, final SubLObject value) {
        final SubLObject session_information = find_remo_session_object(session_id, UNPROVIDED);
        set_remo_in_session_value(session_information, object_id, value);
        return session_id;
    }

    public static final SubLObject delete_remote_object_id_alt(SubLObject session_id, SubLObject object_id) {
        {
            SubLObject session_information = com.cyc.cycjava.cycl.api_remote_objects.find_remo_session_object(session_id, UNPROVIDED);
            com.cyc.cycjava.cycl.api_remote_objects.clear_remo_in_session(session_information, object_id);
        }
        return session_id;
    }

    public static SubLObject delete_remote_object_id(final SubLObject session_id, final SubLObject object_id) {
        final SubLObject session_information = find_remo_session_object(session_id, UNPROVIDED);
        clear_remo_in_session(session_information, object_id);
        return session_id;
    }

    public static final SubLObject valid_remote_object_in_session_p_alt(SubLObject session_id, SubLObject object_id) {
        {
            SubLObject session_information = com.cyc.cycjava.cycl.api_remote_objects.find_remo_session_object(session_id, UNPROVIDED);
            if (NIL != com.cyc.cycjava.cycl.api_remote_objects.valid_remo_session_object_p(session_information)) {
                return makeBoolean(dictionary.dictionary_lookup(session_information, object_id, $remo_object_not_found$.getGlobalValue()) != $remo_object_not_found$.getGlobalValue());
            }
        }
        return NIL;
    }

    public static SubLObject valid_remote_object_in_session_p(final SubLObject session_id, final SubLObject object_id) {
        final SubLObject session_information = find_remo_session_object(session_id, UNPROVIDED);
        if (NIL != valid_remo_session_object_p(session_information)) {
            return makeBoolean(!dictionary.dictionary_lookup(session_information, object_id, $remo_object_not_found$.getGlobalValue()).eql($remo_object_not_found$.getGlobalValue()));
        }
        return NIL;
    }

    public static final SubLObject find_remo_in_session_alt(SubLObject session_information, SubLObject object_id) {
        if (NIL != com.cyc.cycjava.cycl.api_remote_objects.valid_remo_session_object_p(session_information)) {
            return dictionary.dictionary_lookup(session_information, object_id, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject find_remo_in_session(final SubLObject session_information, final SubLObject object_id) {
        if (NIL != valid_remo_session_object_p(session_information)) {
            return dictionary.dictionary_lookup(session_information, object_id, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject set_remo_in_session_value_alt(SubLObject session_information, SubLObject object_id, SubLObject value) {
        if (NIL != com.cyc.cycjava.cycl.api_remote_objects.valid_remo_session_object_p(session_information)) {
            return dictionary.dictionary_enter(session_information, object_id, value);
        }
        return NIL;
    }

    public static SubLObject set_remo_in_session_value(final SubLObject session_information, final SubLObject object_id, final SubLObject value) {
        if (NIL != valid_remo_session_object_p(session_information)) {
            return dictionary.dictionary_enter(session_information, object_id, value);
        }
        return NIL;
    }

    public static final SubLObject allocate_remo_in_session_alt(SubLObject session_information) {
        if (NIL != com.cyc.cycjava.cycl.api_remote_objects.valid_remo_session_object_p(session_information)) {
            {
                SubLObject id_isg = dictionary.dictionary_lookup(session_information, $ID_GENERATOR, UNPROVIDED);
                if (NIL != integer_sequence_generator.integer_sequence_generator_p(id_isg)) {
                    {
                        SubLObject new_id = integer_sequence_generator.integer_sequence_generator_next(id_isg);
                        return new_id;
                    }
                }
            }
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

    public static final SubLObject clear_remo_in_session_alt(SubLObject session_information, SubLObject object_id) {
        if (NIL != dictionary.dictionary_p(session_information)) {
            return dictionary.dictionary_remove(session_information, object_id);
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
        declareFunction("new_remote_object_session", "NEW-REMOTE-OBJECT-SESSION", 0, 1, false);
        declareFunction("valid_remote_object_session_p", "VALID-REMOTE-OBJECT-SESSION-P", 1, 0, false);
        declareFunction("delete_remote_object_session", "DELETE-REMOTE-OBJECT-SESSION", 1, 0, false);
        declareFunction("clear_remo_session_id_generator", "CLEAR-REMO-SESSION-ID-GENERATOR", 0, 0, false);
        declareFunction("get_next_remo_session_id", "GET-NEXT-REMO-SESSION-ID", 0, 0, false);
        declareFunction("valid_remo_session_object_p", "VALID-REMO-SESSION-OBJECT-P", 1, 0, false);
        declareFunction("allocate_new_remo_session_object", "ALLOCATE-NEW-REMO-SESSION-OBJECT", 2, 0, false);
        declareFunction("get_new_remo_session_object", "GET-NEW-REMO-SESSION-OBJECT", 1, 0, false);
        declareFunction("find_remo_session_object", "FIND-REMO-SESSION-OBJECT", 1, 1, false);
        declareFunction("drop_remo_session_object", "DROP-REMO-SESSION-OBJECT", 1, 0, false);
        declareFunction("valid_remote_object_p", "VALID-REMOTE-OBJECT-P", 2, 0, false);
        declareFunction("create_remote_object_id", "CREATE-REMOTE-OBJECT-ID", 1, 0, false);
        declareFunction("get_remote_object_value", "GET-REMOTE-OBJECT-VALUE", 2, 0, false);
        declareFunction("set_remote_object_value", "SET-REMOTE-OBJECT-VALUE", 3, 0, false);
        declareFunction("delete_remote_object_id", "DELETE-REMOTE-OBJECT-ID", 2, 0, false);
        declareFunction("valid_remote_object_in_session_p", "VALID-REMOTE-OBJECT-IN-SESSION-P", 2, 0, false);
        declareFunction("find_remo_in_session", "FIND-REMO-IN-SESSION", 2, 0, false);
        declareFunction("set_remo_in_session_value", "SET-REMO-IN-SESSION-VALUE", 3, 0, false);
        declareFunction("allocate_remo_in_session", "ALLOCATE-REMO-IN-SESSION", 1, 0, false);
        declareFunction("clear_remo_in_session", "CLEAR-REMO-IN-SESSION", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_api_remote_objects_file_alt() {
        deflexical("*REMO-SESSION-MAP*", NIL != boundp($remo_session_map$) ? ((SubLObject) ($remo_session_map$.getGlobalValue())) : dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        deflexical("*REMO-SESSION-ID-GENERATOR*", NIL != boundp($remo_session_id_generator$) ? ((SubLObject) ($remo_session_id_generator$.getGlobalValue())) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED));
        deflexical("*REMO-OBJECT-NOT-FOUND*", NIL != boundp($remo_object_not_found$) ? ((SubLObject) ($remo_object_not_found$.getGlobalValue())) : make_symbol($$$Remote_Object_Not_Found));
        return NIL;
    }

    public static SubLObject init_api_remote_objects_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*REMO-SESSION-MAP*", SubLTrampolineFile.maybeDefault($remo_session_map$, $remo_session_map$, () -> dictionary.new_dictionary(UNPROVIDED, UNPROVIDED)));
            deflexical("*REMO-SESSION-ID-GENERATOR*", SubLTrampolineFile.maybeDefault($remo_session_id_generator$, $remo_session_id_generator$, () -> integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED)));
            deflexical("*REMO-OBJECT-NOT-FOUND*", SubLTrampolineFile.maybeDefault($remo_object_not_found$, $remo_object_not_found$, () -> make_symbol($$$Remote_Object_Not_Found)));
        }
        if (SubLFiles.USE_V2) {
            deflexical("*REMO-SESSION-MAP*", NIL != boundp($remo_session_map$) ? ((SubLObject) ($remo_session_map$.getGlobalValue())) : dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
            deflexical("*REMO-SESSION-ID-GENERATOR*", NIL != boundp($remo_session_id_generator$) ? ((SubLObject) ($remo_session_id_generator$.getGlobalValue())) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED));
            deflexical("*REMO-OBJECT-NOT-FOUND*", NIL != boundp($remo_object_not_found$) ? ((SubLObject) ($remo_object_not_found$.getGlobalValue())) : make_symbol($$$Remote_Object_Not_Found));
        }
        return NIL;
    }

    public static SubLObject init_api_remote_objects_file_Previous() {
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

    
}

/**
 * Total time: 35 ms
 */
