/**
 *
 */
/**
 * For LarKC
 */
/**
 *
 */
package com.cyc.tool.subl.jrtl.translatedCode.sublisp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;



import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.make_symbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_readably$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print_not_readable;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.file_position;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public class compatibility extends SubLTranslatedFile {
    public static SubLObject declare_compatibility_file() {
        declareFunction("open_text", "OPEN-TEXT", 2, 0, false);
        declareFunction("open_binary", "OPEN-BINARY", 2, 0, false);
        declareMacro("with_streamed_file_internal", "WITH-STREAMED-FILE-INTERNAL");
        declareMacro("with_text_file", "WITH-TEXT-FILE");
        declareMacro("with_private_text_file", "WITH-PRIVATE-TEXT-FILE");
        declareMacro("with_binary_file", "WITH-BINARY-FILE");
        declareMacro("with_private_binary_file", "WITH-PRIVATE-BINARY-FILE");
        declareFunction("get_file_position", "GET-FILE-POSITION", 1, 0, false);
        declareFunction("set_file_position", "SET-FILE-POSITION", 2, 0, false);
        declareFunction("default_struct_print_function", "DEFAULT-STRUCT-PRINT-FUNCTION", 3, 0, false);
        return SubLNil.NIL;
    }

    public static SubLObject default_struct_print_function(SubLObject object, SubLObject stream, SubLObject depth) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (SubLNil.NIL != $print_readably$.getDynamicValue(thread))
            print_not_readable(object, stream);
        else {
            print_macros.print_unreadable_object_preamble(stream, object, T, SubLNil.NIL);
            print_macros.print_unreadable_object_postamble(stream, object, T, T);
        }
        return object;
    }

    public static SubLObject get_file_position(SubLObject stream) {
        return file_position(stream, UNPROVIDED);
    }

    public static SubLObject init_compatibility_file() {
        return SubLNil.NIL;
    }

    public static SubLObject open_binary(SubLObject filename, SubLObject direction) {
        if (direction == $INPUT)
            return StreamsLow.open(filename, new SubLObject[]{ $DIRECTION, $INPUT, $IF_DOES_NOT_EXIST, SubLNil.NIL, $ELEMENT_TYPE, $BINARY });

        if ((direction == $OUTPUT) || (direction == $IO))
            return StreamsLow.open(filename, new SubLObject[]{ $DIRECTION, direction, $IF_EXISTS, $NEW_VERSION, $IF_DOES_NOT_EXIST, $CREATE, $ELEMENT_TYPE, $BINARY });

        if (direction == $APPEND)
            return StreamsLow.open(filename, new SubLObject[]{ $DIRECTION, $OUTPUT, $IF_EXISTS, $APPEND, $IF_DOES_NOT_EXIST, $CREATE, $ELEMENT_TYPE, $BINARY });

        Errors.error($str14$_S_called_with_invalid_direction_, OPEN_BINARY, direction);
        return SubLNil.NIL;
    }

    public static SubLObject open_text(SubLObject filename, SubLObject direction) {
        if (direction == $INPUT)
            return StreamsLow.open(filename, new SubLObject[]{ $DIRECTION, $INPUT, $IF_DOES_NOT_EXIST, SubLNil.NIL, $ELEMENT_TYPE, $TEXT });

        if (direction == $OUTPUT)
            return StreamsLow.open(filename, new SubLObject[]{ $DIRECTION, $OUTPUT, $IF_EXISTS, $NEW_VERSION, $IF_DOES_NOT_EXIST, $CREATE, $ELEMENT_TYPE, $TEXT });

        if (direction == $APPEND)
            return StreamsLow.open(filename, new SubLObject[]{ $DIRECTION, $OUTPUT, $IF_EXISTS, $APPEND, $IF_DOES_NOT_EXIST, $CREATE, $ELEMENT_TYPE, $TEXT });

        Errors.error($str10$_S_called_with_invalid_direction_, OPEN_TEXT, direction);
        return SubLNil.NIL;
    }

    public static SubLObject set_file_position(SubLObject stream, SubLObject n) {
        return file_position(stream, n);
    }

    public static SubLObject setup_compatibility_file() {
        return SubLNil.NIL;
    }

    public static SubLObject with_binary_file(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list34);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject stream = SubLNil.NIL;
        SubLObject filename = SubLNil.NIL;
        SubLObject direction = SubLNil.NIL;
        destructuring_bind_must_consp(current, datum, $list34);
        stream = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list34);
        filename = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list34);
        direction = current.first();
        current = current.rest();
        if (SubLNil.NIL == current) {
            SubLObject body;
            current = body = temp;
            return listS(WITH_STREAMED_FILE_INTERNAL, listS(stream, filename, direction, $list37), append(body, SubLNil.NIL));
        }
        cdestructuring_bind_error(datum, $list34);
        return SubLNil.NIL;
    }

    public static SubLObject with_private_binary_file(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list34);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject stream = SubLNil.NIL;
        SubLObject filename = SubLNil.NIL;
        SubLObject direction = SubLNil.NIL;
        destructuring_bind_must_consp(current, datum, $list34);
        stream = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list34);
        filename = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list34);
        direction = current.first();
        current = current.rest();
        if (SubLNil.NIL == current) {
            SubLObject body;
            current = body = temp;
            return listS(WITH_STREAMED_FILE_INTERNAL, listS(stream, filename, direction, $list38), append(body, SubLNil.NIL));
        }
        cdestructuring_bind_error(datum, $list34);
        return SubLNil.NIL;
    }

    public static SubLObject with_private_text_file(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list34);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject stream = SubLNil.NIL;
        SubLObject filename = SubLNil.NIL;
        SubLObject direction = SubLNil.NIL;
        destructuring_bind_must_consp(current, datum, $list34);
        stream = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list34);
        filename = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list34);
        direction = current.first();
        current = current.rest();
        if (SubLNil.NIL == current) {
            SubLObject body;
            current = body = temp;
            return listS(WITH_STREAMED_FILE_INTERNAL, listS(stream, filename, direction, $list36), append(body, SubLNil.NIL));
        }
        cdestructuring_bind_error(datum, $list34);
        return SubLNil.NIL;
    }

    public static SubLObject with_streamed_file_internal(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list16);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject stream = SubLNil.NIL;
        SubLObject filename = SubLNil.NIL;
        SubLObject direction = SubLNil.NIL;
        SubLObject access = SubLNil.NIL;
        SubLObject type = SubLNil.NIL;
        destructuring_bind_must_consp(current, datum, $list16);
        stream = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list16);
        filename = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list16);
        direction = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list16);
        access = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list16);
        type = current.first();
        current = current.rest();
        if (SubLNil.NIL == current) {
            SubLObject body;
            current = body = temp;
            SubLObject stream_var = make_symbol($$$STREAM);
            SubLObject open_func = SubLNil.NIL;
            SubLObject open_clause = SubLNil.NIL;
            if (type == $BINARY)
                open_func = OPEN_BINARY;
            else
                if (type == $TEXT)
                    open_func = OPEN_TEXT;
                else
                    Errors.error($str18$_S_invoked_with_invalid_file_type, WITH_STREAMED_FILE_INTERNAL, type);


            open_clause = list(CSETQ, stream_var, list(open_func, filename, direction));
            if (access == $PRIVATE)
                open_clause = list(ENSURE_PRIVATE_STREAM, open_clause);
            else
                if (access != $PUBLIC)
                    Errors.error($str24$_S_invoked_with_invalid_access_se, WITH_STREAMED_FILE_INTERNAL, access);


            return list(CLET, list(stream_var), list(CUNWIND_PROTECT, list(PROGN, open_clause, list(PUNLESS, list(STREAMP, stream_var), list(ERROR, $str31$Unable_to_open__S, filename)), listS(CLET, list(list(stream, stream_var)), append(body, SubLNil.NIL))), list(PWHEN, list(STREAMP, stream_var), list(CLOSE, stream_var))));
        }
        cdestructuring_bind_error(datum, $list16);
        return SubLNil.NIL;
    }

    public static SubLObject with_text_file(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list34);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject stream = SubLNil.NIL;
        SubLObject filename = SubLNil.NIL;
        SubLObject direction = SubLNil.NIL;
        destructuring_bind_must_consp(current, datum, $list34);
        stream = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list34);
        filename = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list34);
        direction = current.first();
        current = current.rest();
        if (SubLNil.NIL == current) {
            SubLObject body;
            current = body = temp;
            return listS(WITH_STREAMED_FILE_INTERNAL, listS(stream, filename, direction, $list35), append(body, SubLNil.NIL));
        }
        cdestructuring_bind_error(datum, $list34);
        return SubLNil.NIL;
    }

    public static final SubLFile me = new compatibility();

    public static final String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility";





    public static final SubLSymbol $IF_DOES_NOT_EXIST = makeKeyword("IF-DOES-NOT-EXIST");









    public static final SubLSymbol $NEW_VERSION = makeKeyword("NEW-VERSION");





    public static final SubLString $str10$_S_called_with_invalid_direction_ = makeString("~S called with invalid direction argument of ~S.");







    public static final SubLString $str14$_S_called_with_invalid_direction_ = makeString("~S called with invalid direction argument of ~A");

    public static final SubLSymbol OPEN_BINARY = makeSymbol("OPEN-BINARY");

    public static final SubLList $list16 = list(list(makeSymbol("STREAM"), makeSymbol("FILENAME"), makeSymbol("DIRECTION"), makeSymbol("ACCESS"), makeSymbol("TYPE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLString $$$STREAM = makeString("STREAM");

    public static final SubLString $str18$_S_invoked_with_invalid_file_type = makeString("~S invoked with invalid file type ~S specified.");

    public static final SubLSymbol WITH_STREAMED_FILE_INTERNAL = makeSymbol("WITH-STREAMED-FILE-INTERNAL");





    public static final SubLSymbol ENSURE_PRIVATE_STREAM = makeSymbol("ENSURE-PRIVATE-STREAM");



    public static final SubLString $str24$_S_invoked_with_invalid_access_se = makeString("~S invoked with invalid access setting ~S.");













    public static final SubLString $str31$Unable_to_open__S = makeString("Unable to open ~S");





    public static final SubLList $list34 = list(list(makeSymbol("STREAM"), makeSymbol("FILENAME"), makeSymbol("DIRECTION")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list35 = list(makeKeyword("PUBLIC"), makeKeyword("TEXT"));

    public static final SubLList $list36 = list(makeKeyword("PRIVATE"), makeKeyword("TEXT"));

    public static final SubLList $list37 = list(makeKeyword("PUBLIC"), makeKeyword("BINARY"));

    public static final SubLList $list38 = list(makeKeyword("PRIVATE"), makeKeyword("BINARY"));

    static {








































    }

    @Override
    public void declareFunctions() {
        declare_compatibility_file();
    }

    @Override
    public void initializeVariables() {
        init_compatibility_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_compatibility_file();
    }

    public static SubLObject open_text(SubLObject filename, SubLObject direction, SubLObject unprovided) {
        return open_text(filename, direction);
    }

    public static SubLObject open_binary(SubLObject filename, SubLObject direction, SubLObject unprovided) {
        return open_binary(filename, direction);
    }
}

