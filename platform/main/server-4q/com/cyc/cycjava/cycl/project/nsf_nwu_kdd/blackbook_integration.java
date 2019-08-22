/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.project.nsf_nwu_kdd;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.cycml;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.operation_communication;
import com.cyc.cycjava.cycl.pph_main;
import com.cyc.cycjava.cycl.system_info;
import com.cyc.cycjava.cycl.xml_utilities;
import com.cyc.cycjava.cycl.xml_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      BLACKBOOK-INTEGRATION
 *  source file: /cyc/top/cycl/project/nsf-nwu-kdd/blackbook-integration.lisp
 *  created:     2019/07/03 17:39:05
 */
public final class blackbook_integration extends SubLTranslatedFile implements V02 {
    // // Constructor
    private blackbook_integration() {
    }

    public static final SubLFile me = new blackbook_integration();


    // // Definitions
    /**
     * The test case for the metadata description
     */
    // deflexical
    private static final SubLSymbol $default_stt_metadata_description$ = makeSymbol("*DEFAULT-STT-METADATA-DESCRIPTION*");

    public static final SubLObject generate_stt_metadata_description_file(SubLObject filename, SubLObject metadata_description) {
        if (metadata_description == UNPROVIDED) {
            metadata_description = $default_stt_metadata_description$.getGlobalValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject stream = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream = compatibility.open_text(filename, $OUTPUT, NIL);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (!stream.isStream()) {
                        Errors.error($str_alt2$Unable_to_open__S, filename);
                    }
                    {
                        SubLObject s = stream;
                        {
                            SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
                            try {
                                xml_vars.$xml_stream$.bind(s, thread);
                                generate_metadata_description_header();
                                {
                                    SubLObject attrib_list = list($$$version, system_info.cyc_revision_string(), $$$kb, operation_communication.kb_version_string(), $$$timestamp, numeric_date_utilities.timestring(UNPROVIDED));
                                    {
                                        SubLObject _prev_bind_0_1 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                        try {
                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                            xml_utilities.xml_start_tag_internal($$$sttMetaData, attrib_list, NIL);
                                            {
                                                SubLObject remainder = NIL;
                                                for (remainder = metadata_description; NIL != remainder; remainder = cddr(remainder)) {
                                                    {
                                                        SubLObject property = remainder.first();
                                                        SubLObject value = cadr(remainder);
                                                        SubLObject pcase_var = property;
                                                        if (pcase_var.eql($ENTITYTYPES)) {
                                                            generate_metadata_description_for_entities(value);
                                                        } else
                                                            if (pcase_var.eql($ASSOCIATIONTYPES)) {
                                                                generate_metadata_description_for_associations(value);
                                                            }

                                                    }
                                                }
                                            }
                                        } finally {
                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1, thread);
                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_1, thread);
                                        }
                                    }
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal($$$sttMetaData);
                                }
                            } finally {
                                xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return filename;
        }
    }

    public static final SubLObject generate_metadata_description_header() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject stream = xml_vars.$xml_stream$.getDynamicValue(thread);
                xml_utilities.generate_valid_xml_header(stream);
                xml_utilities.generate_xml_header_entry_for_dtd($$$sttMetaData, $str_alt9$http___www_cyc_com_xml_sttMetaDat, stream);
                xml_utilities.xml_terpri();
            }
            return T;
        }
    }

    public static final SubLObject generate_metadata_description_for_entities(SubLObject entity_descriptions) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                SubLObject _prev_bind_1 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal($$$entityTypes, NIL, NIL, UNPROVIDED_SYM, UNPROVIDED_SYM);
                    {
                        SubLObject cdolist_list_var = entity_descriptions;
                        SubLObject entity_description = NIL;
                        for (entity_description = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , entity_description = cdolist_list_var.first()) {
                            {
                                SubLObject cyc_term = list_utilities.plist_lookup(entity_description, $ENTITYTYPE, UNPROVIDED);
                                generate_metadata_description_for_entity(cyc_term);
                            }
                        }
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
                }
            }
            xml_utilities.xml_terpri();
            xml_utilities.xml_end_tag_internal($$$entityTypes);
            return entity_descriptions;
        }
    }

    public static final SubLObject generate_metadata_description_for_associations(SubLObject association_descriptions) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                SubLObject _prev_bind_1 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal($$$associationTypes, NIL, NIL);
                    {
                        SubLObject cdolist_list_var = association_descriptions;
                        SubLObject association_description = NIL;
                        for (association_description = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , association_description = cdolist_list_var.first()) {
                            {
                                SubLObject v_term = list_utilities.plist_lookup(association_description, $ASSOCIATIONTYPE, UNPROVIDED);
                                SubLObject from = list_utilities.plist_lookup(association_description, $FROM, UNPROVIDED);
                                SubLObject to = list_utilities.plist_lookup(association_description, $TO, UNPROVIDED);
                                generate_metadata_description_for_association(v_term, from, to);
                            }
                        }
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
                }
            }
            xml_utilities.xml_terpri();
            xml_utilities.xml_end_tag_internal($$$associationTypes);
            return association_descriptions;
        }
    }

    public static final SubLObject generate_metadata_description_for_entity(SubLObject entity) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject id = get_metadata_description_id_for_entity(entity);
                SubLObject attrib_list = list($$$id, id);
                {
                    SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                    SubLObject _prev_bind_1 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                        xml_utilities.xml_start_tag_internal($$$entityType, attrib_list, NIL);
                        {
                            SubLObject _prev_bind_0_2 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            SubLObject _prev_bind_1_3 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$semantics, NIL, NIL);
                                cycml.cycml_serialize_term(entity);
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_3, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_2, thread);
                            }
                        }
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal($$$semantics);
                        {
                            SubLObject _prev_bind_0_4 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            SubLObject _prev_bind_1_5 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$attributes, NIL, NIL);
                                {
                                    SubLObject attrib_list_6 = list($$$name, $$$name, $$$value, pph_main.generate_phrase(entity, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                    {
                                        SubLObject _prev_bind_0_7 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                        SubLObject _prev_bind_1_8 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                        try {
                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                            xml_utilities.xml_start_tag_internal($$$attribute, attrib_list_6, T);
                                        } finally {
                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_8, thread);
                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_7, thread);
                                        }
                                    }
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_5, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_4, thread);
                            }
                        }
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal($$$attributes);
                    } finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1, thread);
                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
                    }
                }
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal($$$entityType);
            }
            return entity;
        }
    }

    public static final SubLObject generate_metadata_description_for_association(SubLObject association, SubLObject from, SubLObject to) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject id = get_metadata_description_id_for_association(association);
                SubLObject from_id = get_metadata_description_id_for_entity(from);
                SubLObject to_id = get_metadata_description_id_for_entity(to);
                SubLObject attrib_list = list($$$id, id, $str_alt23$from_id, from_id, $str_alt24$to_id, to_id);
                {
                    SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                    SubLObject _prev_bind_1 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                        xml_utilities.xml_start_tag_internal($$$associationType, attrib_list, NIL);
                        {
                            SubLObject _prev_bind_0_9 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            SubLObject _prev_bind_1_10 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$semantics, NIL, NIL);
                                cycml.cycml_serialize_term(association);
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_10, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_9, thread);
                            }
                        }
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal($$$semantics);
                        {
                            SubLObject _prev_bind_0_11 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            SubLObject _prev_bind_1_12 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$attributes, NIL, NIL);
                                {
                                    SubLObject generation = pph_main.generate_phrase(association, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    SubLObject attrib_list_13 = list($$$name, $$$name, $$$value, generation);
                                    {
                                        SubLObject _prev_bind_0_14 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                        SubLObject _prev_bind_1_15 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                        try {
                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                            xml_utilities.xml_start_tag_internal($$$attribute, attrib_list_13, T);
                                        } finally {
                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_15, thread);
                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_14, thread);
                                        }
                                    }
                                    attrib_list_13 = list($$$name, $$$inverseName, $$$value, generation);
                                    {
                                        SubLObject _prev_bind_0_16 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                        SubLObject _prev_bind_1_17 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                        try {
                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                            xml_utilities.xml_start_tag_internal($$$attribute, attrib_list_13, T);
                                        } finally {
                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_17, thread);
                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_16, thread);
                                        }
                                    }
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_12, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_11, thread);
                            }
                        }
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal($$$attributes);
                    } finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1, thread);
                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
                    }
                }
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal($$$associationType);
            }
            return association;
        }
    }

    public static final SubLObject get_metadata_description_id_for_association(SubLObject association) {
        return get_metadata_description_id_for_entity(association);
    }

    public static final SubLObject get_metadata_description_id_for_entity(SubLObject entity) {
        return constant_handles.constant_suid(entity);
    }

    public static final SubLObject declare_blackbook_integration_file() {
        declareFunction("generate_stt_metadata_description_file", "GENERATE-STT-METADATA-DESCRIPTION-FILE", 1, 1, false);
        declareFunction("generate_metadata_description_header", "GENERATE-METADATA-DESCRIPTION-HEADER", 0, 0, false);
        declareFunction("generate_metadata_description_for_entities", "GENERATE-METADATA-DESCRIPTION-FOR-ENTITIES", 1, 0, false);
        declareFunction("generate_metadata_description_for_associations", "GENERATE-METADATA-DESCRIPTION-FOR-ASSOCIATIONS", 1, 0, false);
        declareFunction("generate_metadata_description_for_entity", "GENERATE-METADATA-DESCRIPTION-FOR-ENTITY", 1, 0, false);
        declareFunction("generate_metadata_description_for_association", "GENERATE-METADATA-DESCRIPTION-FOR-ASSOCIATION", 3, 0, false);
        declareFunction("get_metadata_description_id_for_association", "GET-METADATA-DESCRIPTION-ID-FOR-ASSOCIATION", 1, 0, false);
        declareFunction("get_metadata_description_id_for_entity", "GET-METADATA-DESCRIPTION-ID-FOR-ENTITY", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_blackbook_integration_file() {
        deflexical("*DEFAULT-STT-METADATA-DESCRIPTION*", $list_alt0);
        return NIL;
    }

    public static final SubLObject setup_blackbook_integration_file() {
                return NIL;
    }

    // // Internal Constants
    static private final SubLList $list_alt0 = list(makeKeyword("CONTEXT"), constant_handles.reader_make_constant_shell(makeString("TKBSpindleCollectorMt")), makeKeyword("ENTITYTYPES"), list(list(makeKeyword("ENTITYTYPE"), constant_handles.reader_make_constant_shell(makeString("Person"))), list(makeKeyword("ENTITYTYPE"), constant_handles.reader_make_constant_shell(makeString("Place"))), list(makeKeyword("ENTITYTYPE"), constant_handles.reader_make_constant_shell(makeString("Event"))), list(makeKeyword("ENTITYTYPE"), constant_handles.reader_make_constant_shell(makeString("Date"))), list(makeKeyword("ENTITYTYPE"), constant_handles.reader_make_constant_shell(makeString("Organization"))), list(makeKeyword("ENTITYTYPE"), constant_handles.reader_make_constant_shell(makeString("PersonTypeByOccupation")))), makeKeyword("ASSOCIATIONTYPES"), list(list(makeKeyword("ASSOCIATIONTYPE"), constant_handles.reader_make_constant_shell(makeString("eventOccursAt")), $FROM, constant_handles.reader_make_constant_shell(makeString("Event")), makeKeyword("TO"), constant_handles.reader_make_constant_shell(makeString("Place"))), list(makeKeyword("ASSOCIATIONTYPE"), constant_handles.reader_make_constant_shell(makeString("properSubEvents")), $FROM, constant_handles.reader_make_constant_shell(makeString("Event")), makeKeyword("TO"), constant_handles.reader_make_constant_shell(makeString("Event"))), list(makeKeyword("ASSOCIATIONTYPE"), constant_handles.reader_make_constant_shell(makeString("employer")), $FROM, constant_handles.reader_make_constant_shell(makeString("Person")), makeKeyword("TO"), constant_handles.reader_make_constant_shell(makeString("Organization"))), list(makeKeyword("ASSOCIATIONTYPE"), constant_handles.reader_make_constant_shell(makeString("occupation")), $FROM, constant_handles.reader_make_constant_shell(makeString("Person")), makeKeyword("TO"), constant_handles.reader_make_constant_shell(makeString("PersonTypeByOccupation"))), list(makeKeyword("ASSOCIATIONTYPE"), constant_handles.reader_make_constant_shell(makeString("dateOfEvent")), $FROM, constant_handles.reader_make_constant_shell(makeString("Event")), makeKeyword("TO"), constant_handles.reader_make_constant_shell(makeString("Date"))), list(makeKeyword("ASSOCIATIONTYPE"), constant_handles.reader_make_constant_shell(makeString("maleficiary")), $FROM, constant_handles.reader_make_constant_shell(makeString("Event")), makeKeyword("TO"), constant_handles.reader_make_constant_shell(makeString("Person"))), list(makeKeyword("ASSOCIATIONTYPE"), constant_handles.reader_make_constant_shell(makeString("warnee")), $FROM, constant_handles.reader_make_constant_shell(makeString("Event")), makeKeyword("TO"), constant_handles.reader_make_constant_shell(makeString("Person")))));



    static private final SubLString $str_alt2$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $$$version = makeString("version");

    static private final SubLString $$$kb = makeString("kb");

    static private final SubLString $$$timestamp = makeString("timestamp");

    static private final SubLString $$$sttMetaData = makeString("sttMetaData");

    private static final SubLSymbol $ENTITYTYPES = makeKeyword("ENTITYTYPES");

    private static final SubLSymbol $ASSOCIATIONTYPES = makeKeyword("ASSOCIATIONTYPES");

    static private final SubLString $str_alt9$http___www_cyc_com_xml_sttMetaDat = makeString("http://www.cyc.com/xml/sttMetaData.dtd");

    static private final SubLString $$$entityTypes = makeString("entityTypes");

    private static final SubLSymbol $ENTITYTYPE = makeKeyword("ENTITYTYPE");

    static private final SubLString $$$associationTypes = makeString("associationTypes");

    private static final SubLSymbol $ASSOCIATIONTYPE = makeKeyword("ASSOCIATIONTYPE");





    static private final SubLString $$$id = makeString("id");

    static private final SubLString $$$entityType = makeString("entityType");

    static private final SubLString $$$semantics = makeString("semantics");

    static private final SubLString $$$attributes = makeString("attributes");

    static private final SubLString $$$name = makeString("name");

    static private final SubLString $$$value = makeString("value");

    static private final SubLString $$$attribute = makeString("attribute");

    static private final SubLString $str_alt23$from_id = makeString("from_id");

    static private final SubLString $str_alt24$to_id = makeString("to_id");

    static private final SubLString $$$associationType = makeString("associationType");

    static private final SubLString $$$inverseName = makeString("inverseName");

    // // Initializers
    public void declareFunctions() {
        declare_blackbook_integration_file();
    }

    public void initializeVariables() {
        init_blackbook_integration_file();
    }

    public void runTopLevelForms() {
        setup_blackbook_integration_file();
    }
}

