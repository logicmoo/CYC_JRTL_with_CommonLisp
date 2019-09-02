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


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.pointer;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.write;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.make_symbol;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.type_of;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_char;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public class print_macros extends SubLTranslatedFile {
    public static SubLObject declare_print_macros_file() {
        declareMacro("print_unreadable_object", "PRINT-UNREADABLE-OBJECT");
        declareFunction("print_unreadable_object_internal", "PRINT-UNREADABLE-OBJECT-INTERNAL", 5, 0, false);
        declareFunction("print_unreadable_object_preamble", "PRINT-UNREADABLE-OBJECT-PREAMBLE", 4, 0, false);
        declareFunction("print_unreadable_object_postamble", "PRINT-UNREADABLE-OBJECT-POSTAMBLE", 4, 0, false);
        return SubLNil.NIL;
    }

    public static SubLObject init_print_macros_file() {
        return SubLNil.NIL;
    }

    public static SubLObject print_unreadable_object(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject object = SubLNil.NIL;
        SubLObject stream = SubLNil.NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        object = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        stream = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = SubLNil.NIL;
        SubLObject rest = current;
        SubLObject bad = SubLNil.NIL;
        SubLObject current_$1 = SubLNil.NIL;
        while (SubLNil.NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list0);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list0);
            if (SubLNil.NIL == member(current_$1, $list1, UNPROVIDED, UNPROVIDED))
                bad = T;

            if (current_$1 == $ALLOW_OTHER_KEYS)
                allow_other_keys_p = rest.first();

            rest = rest.rest();
        } 
        if ((SubLNil.NIL != bad) && (SubLNil.NIL == allow_other_keys_p))
            cdestructuring_bind_error(datum, $list0);

        SubLObject type_tail = property_list_member($TYPE, current);
        SubLObject type = (SubLNil.NIL != type_tail) ? cadr(type_tail) : SubLNil.NIL;
        SubLObject identity_tail = property_list_member($IDENTITY, current);
        SubLObject identity = (SubLNil.NIL != identity_tail) ? cadr(identity_tail) : SubLNil.NIL;
        SubLObject body;
        current = body = temp;
        return print_unreadable_object_internal(object, stream, type, identity, body);
    }

    public static SubLObject print_unreadable_object_internal(SubLObject object, SubLObject stream, SubLObject type, SubLObject identity, SubLObject body) {
        if (!object.isAtom()) {
            SubLObject object_var = make_symbol($$$OBJECT);
            return list(CLET, list(list(object_var, object)), print_unreadable_object_internal(object_var, stream, type, identity, body));
        }
        if (!stream.isAtom()) {
            SubLObject stream_var = make_symbol($$$STREAM);
            return list(CLET, list(list(stream_var, stream)), print_unreadable_object_internal(object, stream_var, type, identity, body));
        }
        SubLObject preamble_spaceP = makeBoolean((SubLNil.NIL != type) && (SubLNil.NIL != body));
        SubLObject postamble_spaceP = makeBoolean((SubLNil.NIL != identity) && ((SubLNil.NIL != type) || (SubLNil.NIL != body)));
        return list(PIF, $print_readably$, list(PRINT_NOT_READABLE, object, stream), listS(PROGN, list(PRINT_UNREADABLE_OBJECT_PREAMBLE, stream, object, type, preamble_spaceP), append(body, list(list(PRINT_UNREADABLE_OBJECT_POSTAMBLE, stream, object, postamble_spaceP, identity)))));
    }

    public static SubLObject print_unreadable_object_postamble(SubLObject stream, SubLObject object, SubLObject spaceP, SubLObject identityP) {
        if (SubLNil.NIL != identityP) {
            if (SubLNil.NIL != spaceP)
                write_char(CHAR_space, stream);

            write(pointer(object), new SubLObject[]{ $STREAM, stream, $BASE, SIXTEEN_INTEGER });
        }
        write_char(CHAR_greater, stream);
        return object;
    }

    public static SubLObject print_unreadable_object_preamble(SubLObject stream, SubLObject object, SubLObject typeP, SubLObject spaceP) {
        write_string($str14$__, stream, UNPROVIDED, UNPROVIDED);
        if (SubLNil.NIL != typeP) {
            write(type_of(object), new SubLObject[]{ $STREAM, stream });
            if (SubLNil.NIL != spaceP)
                write_char(CHAR_space, stream);

        }
        return object;
    }

    public static SubLObject setup_print_macros_file() {
        return SubLNil.NIL;
    }

    public static final SubLFile me = new print_macros();

    public static final String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros";

    public static final SubLList $list0 = list(list(makeSymbol("OBJECT"), makeSymbol("STREAM"), makeSymbol("&KEY"), makeSymbol("TYPE"), IDENTITY), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list1 = list(makeKeyword("TYPE"), makeKeyword("IDENTITY"));

    public static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");





    public static final SubLString $$$OBJECT = makeString("OBJECT");



    private static final SubLString $$$STREAM = makeString("STREAM");



    private static final SubLSymbol $print_readably$ = makeSymbol("*PRINT-READABLY*");

    private static final SubLSymbol PRINT_NOT_READABLE = makeSymbol("PRINT-NOT-READABLE");



    private static final SubLSymbol PRINT_UNREADABLE_OBJECT_PREAMBLE = makeSymbol("PRINT-UNREADABLE-OBJECT-PREAMBLE");

    private static final SubLSymbol PRINT_UNREADABLE_OBJECT_POSTAMBLE = makeSymbol("PRINT-UNREADABLE-OBJECT-POSTAMBLE");

    private static final SubLString $str14$__ = makeString("#<");





    static {


















    }

    @Override
    public void declareFunctions() {
        declare_print_macros_file();
    }

    @Override
    public void initializeVariables() {
        init_print_macros_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_print_macros_file();
    }
}

