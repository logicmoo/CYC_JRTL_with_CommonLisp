package com.cyc.cycjava.cycl.sbhl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.vector_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sbhl_search_datastructures extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures";
    public static final String myFingerPrint = "d0651ac8108cd8d2844706d1f99a2bea4c3002cc7e7f267b790da09a5ca352bd";
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-datastructures.lisp", position = 1074L)
    public static SubLSymbol $dtp_sbhl_stack$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-datastructures.lisp", position = 3677L)
    public static SubLSymbol $dtp_sbhl_link_node_search_state$;
    private static final SubLSymbol $sym0$SBHL_STACK;
    private static final SubLSymbol $sym1$SBHL_STACK_P;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$PRINT_SBHL_STACK;
    private static final SubLSymbol $sym7$SBHL_STACK_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$SBHL_STACK_NUM;
    private static final SubLSymbol $sym10$_CSETF_SBHL_STACK_NUM;
    private static final SubLSymbol $sym11$SBHL_STACK_ELEMENTS;
    private static final SubLSymbol $sym12$_CSETF_SBHL_STACK_ELEMENTS;
    private static final SubLSymbol $kw13$NUM;
    private static final SubLSymbol $kw14$ELEMENTS;
    private static final SubLString $str15$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw16$BEGIN;
    private static final SubLSymbol $sym17$MAKE_SBHL_STACK;
    private static final SubLSymbol $kw18$SLOT;
    private static final SubLSymbol $kw19$END;
    private static final SubLSymbol $sym20$VISIT_DEFSTRUCT_OBJECT_SBHL_STACK_METHOD;
    private static final SubLString $str21$size_;
    private static final SubLSymbol $sym22$POSITIVE_INTEGER_P;
    private static final SubLSymbol $sym23$SBHL_LINK_NODE_SEARCH_STATE;
    private static final SubLSymbol $sym24$SBHL_LINK_NODE_SEARCH_STATE_P;
    private static final SubLList $list25;
    private static final SubLList $list26;
    private static final SubLList $list27;
    private static final SubLList $list28;
    private static final SubLSymbol $sym29$PRINT_SBHL_LINK_NODE_SEARCH_STATE;
    private static final SubLSymbol $sym30$SBHL_LINK_NODE_SEARCH_STATE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list31;
    private static final SubLSymbol $sym32$SBHL_LINK_NODE_SEARCH_STATE_NODE;
    private static final SubLSymbol $sym33$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_NODE;
    private static final SubLSymbol $sym34$SBHL_LINK_NODE_SEARCH_STATE_MODULE;
    private static final SubLSymbol $sym35$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_MODULE;
    private static final SubLSymbol $sym36$SBHL_LINK_NODE_SEARCH_STATE_DIRECTION;
    private static final SubLSymbol $sym37$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_DIRECTION;
    private static final SubLSymbol $sym38$SBHL_LINK_NODE_SEARCH_STATE_MT;
    private static final SubLSymbol $sym39$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_MT;
    private static final SubLSymbol $sym40$SBHL_LINK_NODE_SEARCH_STATE_TV;
    private static final SubLSymbol $sym41$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_TV;
    private static final SubLSymbol $sym42$SBHL_LINK_NODE_SEARCH_STATE_PARENT_NODE;
    private static final SubLSymbol $sym43$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_PARENT_NODE;
    private static final SubLSymbol $sym44$SBHL_LINK_NODE_SEARCH_STATE_GENL_INVERSE_MODE_;
    private static final SubLSymbol $sym45$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_GENL_INVERSE_MODE_;
    private static final SubLSymbol $sym46$SBHL_LINK_NODE_SEARCH_STATE_LINK_GENERATOR;
    private static final SubLSymbol $sym47$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_LINK_GENERATOR;
    private static final SubLSymbol $kw48$NODE;
    private static final SubLSymbol $kw49$MODULE;
    private static final SubLSymbol $kw50$DIRECTION;
    private static final SubLSymbol $kw51$MT;
    private static final SubLSymbol $kw52$TV;
    private static final SubLSymbol $kw53$PARENT_NODE;
    private static final SubLSymbol $kw54$GENL_INVERSE_MODE_;
    private static final SubLSymbol $kw55$LINK_GENERATOR;
    private static final SubLSymbol $sym56$MAKE_SBHL_LINK_NODE_SEARCH_STATE;
    private static final SubLSymbol $sym57$VISIT_DEFSTRUCT_OBJECT_SBHL_LINK_NODE_SEARCH_STATE_METHOD;
    private static final SubLString $str58$__a____a_;
    private static final SubLString $str59$Node_______________a__;
    private static final SubLString $str60$Module_____________a__;
    private static final SubLString $str61$Direction__________a__;
    private static final SubLString $str62$Mt_________________a__;
    private static final SubLString $str63$TV_________________a__;
    private static final SubLString $str64$Parent_Node________a__;
    private static final SubLString $str65$genlInverse_mode___a__;
    private static final SubLString $str66$Link_Generator_____a__;
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-datastructures.lisp", position = 1074L)
    public static SubLObject sbhl_stack_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_sbhl_stack(v_object, stream, (SubLObject)sbhl_search_datastructures.ZERO_INTEGER);
        return (SubLObject)sbhl_search_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-datastructures.lisp", position = 1074L)
    public static SubLObject sbhl_stack_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $sbhl_stack_native.class) ? sbhl_search_datastructures.T : sbhl_search_datastructures.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-datastructures.lisp", position = 1074L)
    public static SubLObject sbhl_stack_num(final SubLObject v_object) {
        assert sbhl_search_datastructures.NIL != sbhl_stack_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-datastructures.lisp", position = 1074L)
    public static SubLObject sbhl_stack_elements(final SubLObject v_object) {
        assert sbhl_search_datastructures.NIL != sbhl_stack_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-datastructures.lisp", position = 1074L)
    public static SubLObject _csetf_sbhl_stack_num(final SubLObject v_object, final SubLObject value) {
        assert sbhl_search_datastructures.NIL != sbhl_stack_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-datastructures.lisp", position = 1074L)
    public static SubLObject _csetf_sbhl_stack_elements(final SubLObject v_object, final SubLObject value) {
        assert sbhl_search_datastructures.NIL != sbhl_stack_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-datastructures.lisp", position = 1074L)
    public static SubLObject make_sbhl_stack(SubLObject arglist) {
        if (arglist == sbhl_search_datastructures.UNPROVIDED) {
            arglist = (SubLObject)sbhl_search_datastructures.NIL;
        }
        final SubLObject v_new = (SubLObject)new $sbhl_stack_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)sbhl_search_datastructures.NIL, next = arglist; sbhl_search_datastructures.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)sbhl_search_datastructures.$kw13$NUM)) {
                _csetf_sbhl_stack_num(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)sbhl_search_datastructures.$kw14$ELEMENTS)) {
                _csetf_sbhl_stack_elements(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)sbhl_search_datastructures.$str15$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-datastructures.lisp", position = 1074L)
    public static SubLObject visit_defstruct_sbhl_stack(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)sbhl_search_datastructures.$kw16$BEGIN, (SubLObject)sbhl_search_datastructures.$sym17$MAKE_SBHL_STACK, (SubLObject)sbhl_search_datastructures.TWO_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)sbhl_search_datastructures.$kw18$SLOT, (SubLObject)sbhl_search_datastructures.$kw13$NUM, sbhl_stack_num(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sbhl_search_datastructures.$kw18$SLOT, (SubLObject)sbhl_search_datastructures.$kw14$ELEMENTS, sbhl_stack_elements(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sbhl_search_datastructures.$kw19$END, (SubLObject)sbhl_search_datastructures.$sym17$MAKE_SBHL_STACK, (SubLObject)sbhl_search_datastructures.TWO_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-datastructures.lisp", position = 1074L)
    public static SubLObject visit_defstruct_object_sbhl_stack_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sbhl_stack(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-datastructures.lisp", position = 1197L)
    public static SubLObject print_sbhl_stack(final SubLObject sbhl_stack, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sbhl_search_datastructures.NIL != print_high.$print_readably$.getDynamicValue(thread)) {
            print_high.print_not_readable(sbhl_stack, stream);
        }
        else {
            print_macros.print_unreadable_object_preamble(stream, sbhl_stack, (SubLObject)sbhl_search_datastructures.T, (SubLObject)sbhl_search_datastructures.T);
            streams_high.write_string((SubLObject)sbhl_search_datastructures.$str21$size_, stream, (SubLObject)sbhl_search_datastructures.UNPROVIDED, (SubLObject)sbhl_search_datastructures.UNPROVIDED);
            print_high.princ(sbhl_stack_size(sbhl_stack), stream);
            print_macros.print_unreadable_object_postamble(stream, sbhl_stack, (SubLObject)sbhl_search_datastructures.T, (SubLObject)sbhl_search_datastructures.T);
        }
        return sbhl_stack;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-datastructures.lisp", position = 1446L)
    public static SubLObject new_sbhl_stack(SubLObject size) {
        if (size == sbhl_search_datastructures.UNPROVIDED) {
            size = (SubLObject)sbhl_search_datastructures.THIRTEEN_INTEGER;
        }
        assert sbhl_search_datastructures.NIL != subl_promotions.positive_integer_p(size) : size;
        final SubLObject stack = make_sbhl_stack((SubLObject)sbhl_search_datastructures.UNPROVIDED);
        _csetf_sbhl_stack_num(stack, (SubLObject)sbhl_search_datastructures.ZERO_INTEGER);
        _csetf_sbhl_stack_elements(stack, Vectors.make_vector(size, (SubLObject)sbhl_search_datastructures.UNPROVIDED));
        return stack;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-datastructures.lisp", position = 1737L)
    public static SubLObject sbhl_stack_size(final SubLObject sbhl_stack) {
        return sbhl_stack_num(sbhl_stack);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-datastructures.lisp", position = 1880L)
    public static SubLObject sbhl_stack_emptyP(final SubLObject sbhl_stack) {
        return Numbers.zerop(sbhl_stack_num(sbhl_stack));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-datastructures.lisp", position = 1975L)
    public static SubLObject sbhl_stack_push(final SubLObject item, final SubLObject sbhl_stack) {
        if (sbhl_stack_num(sbhl_stack).numGE(Sequences.length(sbhl_stack_elements(sbhl_stack)))) {
            _csetf_sbhl_stack_elements(sbhl_stack, vector_utilities.grow_vector(sbhl_stack_elements(sbhl_stack), (SubLObject)sbhl_search_datastructures.NIL, (SubLObject)sbhl_search_datastructures.TWO_INTEGER));
        }
        Vectors.set_aref(sbhl_stack_elements(sbhl_stack), sbhl_stack_num(sbhl_stack), item);
        _csetf_sbhl_stack_num(sbhl_stack, Numbers.add(sbhl_stack_num(sbhl_stack), (SubLObject)sbhl_search_datastructures.ONE_INTEGER));
        return sbhl_stack;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-datastructures.lisp", position = 2410L)
    public static SubLObject sbhl_stack_pop(final SubLObject sbhl_stack) {
        SubLObject item = (SubLObject)sbhl_search_datastructures.NIL;
        if (sbhl_search_datastructures.NIL == sbhl_stack_emptyP(sbhl_stack)) {
            _csetf_sbhl_stack_num(sbhl_stack, Numbers.subtract(sbhl_stack_num(sbhl_stack), (SubLObject)sbhl_search_datastructures.ONE_INTEGER));
            item = Vectors.aref(sbhl_stack_elements(sbhl_stack), sbhl_stack_num(sbhl_stack));
            Vectors.set_aref(sbhl_stack_elements(sbhl_stack), sbhl_stack_num(sbhl_stack), (SubLObject)sbhl_search_datastructures.NIL);
        }
        return item;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-datastructures.lisp", position = 2750L)
    public static SubLObject sbhl_stack_peek(final SubLObject sbhl_stack) {
        SubLObject item = (SubLObject)sbhl_search_datastructures.NIL;
        if (sbhl_search_datastructures.NIL == sbhl_stack_emptyP(sbhl_stack)) {
            item = Vectors.aref(sbhl_stack_elements(sbhl_stack), Numbers.subtract(sbhl_stack_num(sbhl_stack), (SubLObject)sbhl_search_datastructures.ONE_INTEGER));
        }
        return item;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-datastructures.lisp", position = 2968L)
    public static SubLObject clear_sbhl_stack(final SubLObject sbhl_stack) {
        _csetf_sbhl_stack_num(sbhl_stack, (SubLObject)sbhl_search_datastructures.ZERO_INTEGER);
        vector_utilities.reset_vector(sbhl_stack_elements(sbhl_stack), (SubLObject)sbhl_search_datastructures.NIL);
        return sbhl_stack;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-datastructures.lisp", position = 3677L)
    public static SubLObject sbhl_link_node_search_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_sbhl_link_node_search_state(v_object, stream, (SubLObject)sbhl_search_datastructures.ZERO_INTEGER);
        return (SubLObject)sbhl_search_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-datastructures.lisp", position = 3677L)
    public static SubLObject sbhl_link_node_search_state_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $sbhl_link_node_search_state_native.class) ? sbhl_search_datastructures.T : sbhl_search_datastructures.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-datastructures.lisp", position = 3677L)
    public static SubLObject sbhl_link_node_search_state_node(final SubLObject v_object) {
        assert sbhl_search_datastructures.NIL != sbhl_link_node_search_state_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-datastructures.lisp", position = 3677L)
    public static SubLObject sbhl_link_node_search_state_module(final SubLObject v_object) {
        assert sbhl_search_datastructures.NIL != sbhl_link_node_search_state_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-datastructures.lisp", position = 3677L)
    public static SubLObject sbhl_link_node_search_state_direction(final SubLObject v_object) {
        assert sbhl_search_datastructures.NIL != sbhl_link_node_search_state_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-datastructures.lisp", position = 3677L)
    public static SubLObject sbhl_link_node_search_state_mt(final SubLObject v_object) {
        assert sbhl_search_datastructures.NIL != sbhl_link_node_search_state_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-datastructures.lisp", position = 3677L)
    public static SubLObject sbhl_link_node_search_state_tv(final SubLObject v_object) {
        assert sbhl_search_datastructures.NIL != sbhl_link_node_search_state_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-datastructures.lisp", position = 3677L)
    public static SubLObject sbhl_link_node_search_state_parent_node(final SubLObject v_object) {
        assert sbhl_search_datastructures.NIL != sbhl_link_node_search_state_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-datastructures.lisp", position = 3677L)
    public static SubLObject sbhl_link_node_search_state_genl_inverse_modeP(final SubLObject v_object) {
        assert sbhl_search_datastructures.NIL != sbhl_link_node_search_state_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-datastructures.lisp", position = 3677L)
    public static SubLObject sbhl_link_node_search_state_link_generator(final SubLObject v_object) {
        assert sbhl_search_datastructures.NIL != sbhl_link_node_search_state_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-datastructures.lisp", position = 3677L)
    public static SubLObject _csetf_sbhl_link_node_search_state_node(final SubLObject v_object, final SubLObject value) {
        assert sbhl_search_datastructures.NIL != sbhl_link_node_search_state_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-datastructures.lisp", position = 3677L)
    public static SubLObject _csetf_sbhl_link_node_search_state_module(final SubLObject v_object, final SubLObject value) {
        assert sbhl_search_datastructures.NIL != sbhl_link_node_search_state_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-datastructures.lisp", position = 3677L)
    public static SubLObject _csetf_sbhl_link_node_search_state_direction(final SubLObject v_object, final SubLObject value) {
        assert sbhl_search_datastructures.NIL != sbhl_link_node_search_state_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-datastructures.lisp", position = 3677L)
    public static SubLObject _csetf_sbhl_link_node_search_state_mt(final SubLObject v_object, final SubLObject value) {
        assert sbhl_search_datastructures.NIL != sbhl_link_node_search_state_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-datastructures.lisp", position = 3677L)
    public static SubLObject _csetf_sbhl_link_node_search_state_tv(final SubLObject v_object, final SubLObject value) {
        assert sbhl_search_datastructures.NIL != sbhl_link_node_search_state_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-datastructures.lisp", position = 3677L)
    public static SubLObject _csetf_sbhl_link_node_search_state_parent_node(final SubLObject v_object, final SubLObject value) {
        assert sbhl_search_datastructures.NIL != sbhl_link_node_search_state_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-datastructures.lisp", position = 3677L)
    public static SubLObject _csetf_sbhl_link_node_search_state_genl_inverse_modeP(final SubLObject v_object, final SubLObject value) {
        assert sbhl_search_datastructures.NIL != sbhl_link_node_search_state_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-datastructures.lisp", position = 3677L)
    public static SubLObject _csetf_sbhl_link_node_search_state_link_generator(final SubLObject v_object, final SubLObject value) {
        assert sbhl_search_datastructures.NIL != sbhl_link_node_search_state_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-datastructures.lisp", position = 3677L)
    public static SubLObject make_sbhl_link_node_search_state(SubLObject arglist) {
        if (arglist == sbhl_search_datastructures.UNPROVIDED) {
            arglist = (SubLObject)sbhl_search_datastructures.NIL;
        }
        final SubLObject v_new = (SubLObject)new $sbhl_link_node_search_state_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)sbhl_search_datastructures.NIL, next = arglist; sbhl_search_datastructures.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)sbhl_search_datastructures.$kw48$NODE)) {
                _csetf_sbhl_link_node_search_state_node(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)sbhl_search_datastructures.$kw49$MODULE)) {
                _csetf_sbhl_link_node_search_state_module(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)sbhl_search_datastructures.$kw50$DIRECTION)) {
                _csetf_sbhl_link_node_search_state_direction(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)sbhl_search_datastructures.$kw51$MT)) {
                _csetf_sbhl_link_node_search_state_mt(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)sbhl_search_datastructures.$kw52$TV)) {
                _csetf_sbhl_link_node_search_state_tv(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)sbhl_search_datastructures.$kw53$PARENT_NODE)) {
                _csetf_sbhl_link_node_search_state_parent_node(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)sbhl_search_datastructures.$kw54$GENL_INVERSE_MODE_)) {
                _csetf_sbhl_link_node_search_state_genl_inverse_modeP(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)sbhl_search_datastructures.$kw55$LINK_GENERATOR)) {
                _csetf_sbhl_link_node_search_state_link_generator(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)sbhl_search_datastructures.$str15$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-datastructures.lisp", position = 3677L)
    public static SubLObject visit_defstruct_sbhl_link_node_search_state(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)sbhl_search_datastructures.$kw16$BEGIN, (SubLObject)sbhl_search_datastructures.$sym56$MAKE_SBHL_LINK_NODE_SEARCH_STATE, (SubLObject)sbhl_search_datastructures.EIGHT_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)sbhl_search_datastructures.$kw18$SLOT, (SubLObject)sbhl_search_datastructures.$kw48$NODE, sbhl_link_node_search_state_node(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sbhl_search_datastructures.$kw18$SLOT, (SubLObject)sbhl_search_datastructures.$kw49$MODULE, sbhl_link_node_search_state_module(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sbhl_search_datastructures.$kw18$SLOT, (SubLObject)sbhl_search_datastructures.$kw50$DIRECTION, sbhl_link_node_search_state_direction(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sbhl_search_datastructures.$kw18$SLOT, (SubLObject)sbhl_search_datastructures.$kw51$MT, sbhl_link_node_search_state_mt(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sbhl_search_datastructures.$kw18$SLOT, (SubLObject)sbhl_search_datastructures.$kw52$TV, sbhl_link_node_search_state_tv(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sbhl_search_datastructures.$kw18$SLOT, (SubLObject)sbhl_search_datastructures.$kw53$PARENT_NODE, sbhl_link_node_search_state_parent_node(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sbhl_search_datastructures.$kw18$SLOT, (SubLObject)sbhl_search_datastructures.$kw54$GENL_INVERSE_MODE_, sbhl_link_node_search_state_genl_inverse_modeP(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sbhl_search_datastructures.$kw18$SLOT, (SubLObject)sbhl_search_datastructures.$kw55$LINK_GENERATOR, sbhl_link_node_search_state_link_generator(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sbhl_search_datastructures.$kw19$END, (SubLObject)sbhl_search_datastructures.$sym56$MAKE_SBHL_LINK_NODE_SEARCH_STATE, (SubLObject)sbhl_search_datastructures.EIGHT_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-datastructures.lisp", position = 3677L)
    public static SubLObject visit_defstruct_object_sbhl_link_node_search_state_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sbhl_link_node_search_state(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-datastructures.lisp", position = 4400L)
    public static SubLObject print_sbhl_link_node_search_state(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sbhl_search_datastructures.NIL != print_high.$print_readably$.getDynamicValue(thread)) {
            print_high.print_not_readable(v_object, stream);
        }
        else {
            print_macros.print_unreadable_object_preamble(stream, v_object, (SubLObject)sbhl_search_datastructures.T, (SubLObject)sbhl_search_datastructures.T);
            PrintLow.format(stream, (SubLObject)sbhl_search_datastructures.$str58$__a____a_, sbhl_module_vars.get_sbhl_module_link_pred(sbhl_link_node_search_state_module(v_object)), sbhl_link_node_search_state_node(v_object));
            print_macros.print_unreadable_object_postamble(stream, v_object, (SubLObject)sbhl_search_datastructures.T, (SubLObject)sbhl_search_datastructures.T);
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-datastructures.lisp", position = 4718L)
    public static SubLObject new_sbhl_link_node_search_state(final SubLObject node, final SubLObject module, final SubLObject direction, final SubLObject mt, final SubLObject tv, final SubLObject parent_node, final SubLObject genl_inverse_modeP, SubLObject link_generator) {
        if (link_generator == sbhl_search_datastructures.UNPROVIDED) {
            link_generator = (SubLObject)sbhl_search_datastructures.NIL;
        }
        final SubLObject search_state = make_sbhl_link_node_search_state((SubLObject)sbhl_search_datastructures.UNPROVIDED);
        _csetf_sbhl_link_node_search_state_node(search_state, node);
        _csetf_sbhl_link_node_search_state_module(search_state, module);
        _csetf_sbhl_link_node_search_state_direction(search_state, direction);
        _csetf_sbhl_link_node_search_state_mt(search_state, mt);
        _csetf_sbhl_link_node_search_state_tv(search_state, tv);
        _csetf_sbhl_link_node_search_state_parent_node(search_state, parent_node);
        _csetf_sbhl_link_node_search_state_genl_inverse_modeP(search_state, genl_inverse_modeP);
        _csetf_sbhl_link_node_search_state_link_generator(search_state, link_generator);
        return search_state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-datastructures.lisp", position = 5575L)
    public static SubLObject get_sbhl_link_node_search_state_node(final SubLObject sbhl_link_node_search_state) {
        return sbhl_link_node_search_state_node(sbhl_link_node_search_state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-datastructures.lisp", position = 5774L)
    public static SubLObject get_sbhl_link_node_search_state_module(final SubLObject sbhl_link_node_search_state) {
        return sbhl_link_node_search_state_module(sbhl_link_node_search_state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-datastructures.lisp", position = 5936L)
    public static SubLObject get_sbhl_link_node_search_state_direction(final SubLObject sbhl_link_node_search_state) {
        return sbhl_link_node_search_state_direction(sbhl_link_node_search_state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-datastructures.lisp", position = 6104L)
    public static SubLObject get_sbhl_link_node_search_state_mt(final SubLObject sbhl_link_node_search_state) {
        return sbhl_link_node_search_state_mt(sbhl_link_node_search_state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-datastructures.lisp", position = 6258L)
    public static SubLObject get_sbhl_link_node_search_state_tv(final SubLObject sbhl_link_node_search_state) {
        return sbhl_link_node_search_state_tv(sbhl_link_node_search_state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-datastructures.lisp", position = 6412L)
    public static SubLObject get_sbhl_link_node_search_state_parent_node(final SubLObject sbhl_link_node_search_state) {
        return sbhl_link_node_search_state_parent_node(sbhl_link_node_search_state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-datastructures.lisp", position = 6584L)
    public static SubLObject get_sbhl_link_node_search_state_genl_inverse_modeP(final SubLObject sbhl_link_node_search_state) {
        return sbhl_link_node_search_state_genl_inverse_modeP(sbhl_link_node_search_state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-datastructures.lisp", position = 6770L)
    public static SubLObject get_sbhl_link_node_search_state_link_generator(final SubLObject sbhl_link_node_search_state) {
        return sbhl_link_node_search_state_link_generator(sbhl_link_node_search_state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-datastructures.lisp", position = 6948L)
    public static SubLObject print_sbhl_link_node_search_state_contents(final SubLObject sbhl_link_node_search_state, SubLObject stream) {
        if (stream == sbhl_search_datastructures.UNPROVIDED) {
            stream = (SubLObject)sbhl_search_datastructures.T;
        }
        PrintLow.format(stream, (SubLObject)sbhl_search_datastructures.$str59$Node_______________a__, sbhl_link_node_search_state_node(sbhl_link_node_search_state));
        PrintLow.format(stream, (SubLObject)sbhl_search_datastructures.$str60$Module_____________a__, sbhl_link_node_search_state_module(sbhl_link_node_search_state));
        PrintLow.format(stream, (SubLObject)sbhl_search_datastructures.$str61$Direction__________a__, sbhl_link_node_search_state_direction(sbhl_link_node_search_state));
        PrintLow.format(stream, (SubLObject)sbhl_search_datastructures.$str62$Mt_________________a__, sbhl_link_node_search_state_mt(sbhl_link_node_search_state));
        PrintLow.format(stream, (SubLObject)sbhl_search_datastructures.$str63$TV_________________a__, sbhl_link_node_search_state_tv(sbhl_link_node_search_state));
        PrintLow.format(stream, (SubLObject)sbhl_search_datastructures.$str64$Parent_Node________a__, sbhl_link_node_search_state_parent_node(sbhl_link_node_search_state));
        PrintLow.format(stream, (SubLObject)sbhl_search_datastructures.$str65$genlInverse_mode___a__, sbhl_link_node_search_state_genl_inverse_modeP(sbhl_link_node_search_state));
        PrintLow.format(stream, (SubLObject)sbhl_search_datastructures.$str66$Link_Generator_____a__, sbhl_link_node_search_state_link_generator(sbhl_link_node_search_state));
        return (SubLObject)sbhl_search_datastructures.NIL;
    }
    
    public static SubLObject declare_sbhl_search_datastructures_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures", "sbhl_stack_print_function_trampoline", "SBHL-STACK-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures", "sbhl_stack_p", "SBHL-STACK-P", 1, 0, false);
        new $sbhl_stack_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures", "sbhl_stack_num", "SBHL-STACK-NUM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures", "sbhl_stack_elements", "SBHL-STACK-ELEMENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures", "_csetf_sbhl_stack_num", "_CSETF-SBHL-STACK-NUM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures", "_csetf_sbhl_stack_elements", "_CSETF-SBHL-STACK-ELEMENTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures", "make_sbhl_stack", "MAKE-SBHL-STACK", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures", "visit_defstruct_sbhl_stack", "VISIT-DEFSTRUCT-SBHL-STACK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures", "visit_defstruct_object_sbhl_stack_method", "VISIT-DEFSTRUCT-OBJECT-SBHL-STACK-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures", "print_sbhl_stack", "PRINT-SBHL-STACK", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures", "new_sbhl_stack", "NEW-SBHL-STACK", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures", "sbhl_stack_size", "SBHL-STACK-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures", "sbhl_stack_emptyP", "SBHL-STACK-EMPTY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures", "sbhl_stack_push", "SBHL-STACK-PUSH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures", "sbhl_stack_pop", "SBHL-STACK-POP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures", "sbhl_stack_peek", "SBHL-STACK-PEEK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures", "clear_sbhl_stack", "CLEAR-SBHL-STACK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures", "sbhl_link_node_search_state_print_function_trampoline", "SBHL-LINK-NODE-SEARCH-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures", "sbhl_link_node_search_state_p", "SBHL-LINK-NODE-SEARCH-STATE-P", 1, 0, false);
        new $sbhl_link_node_search_state_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures", "sbhl_link_node_search_state_node", "SBHL-LINK-NODE-SEARCH-STATE-NODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures", "sbhl_link_node_search_state_module", "SBHL-LINK-NODE-SEARCH-STATE-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures", "sbhl_link_node_search_state_direction", "SBHL-LINK-NODE-SEARCH-STATE-DIRECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures", "sbhl_link_node_search_state_mt", "SBHL-LINK-NODE-SEARCH-STATE-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures", "sbhl_link_node_search_state_tv", "SBHL-LINK-NODE-SEARCH-STATE-TV", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures", "sbhl_link_node_search_state_parent_node", "SBHL-LINK-NODE-SEARCH-STATE-PARENT-NODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures", "sbhl_link_node_search_state_genl_inverse_modeP", "SBHL-LINK-NODE-SEARCH-STATE-GENL-INVERSE-MODE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures", "sbhl_link_node_search_state_link_generator", "SBHL-LINK-NODE-SEARCH-STATE-LINK-GENERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures", "_csetf_sbhl_link_node_search_state_node", "_CSETF-SBHL-LINK-NODE-SEARCH-STATE-NODE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures", "_csetf_sbhl_link_node_search_state_module", "_CSETF-SBHL-LINK-NODE-SEARCH-STATE-MODULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures", "_csetf_sbhl_link_node_search_state_direction", "_CSETF-SBHL-LINK-NODE-SEARCH-STATE-DIRECTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures", "_csetf_sbhl_link_node_search_state_mt", "_CSETF-SBHL-LINK-NODE-SEARCH-STATE-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures", "_csetf_sbhl_link_node_search_state_tv", "_CSETF-SBHL-LINK-NODE-SEARCH-STATE-TV", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures", "_csetf_sbhl_link_node_search_state_parent_node", "_CSETF-SBHL-LINK-NODE-SEARCH-STATE-PARENT-NODE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures", "_csetf_sbhl_link_node_search_state_genl_inverse_modeP", "_CSETF-SBHL-LINK-NODE-SEARCH-STATE-GENL-INVERSE-MODE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures", "_csetf_sbhl_link_node_search_state_link_generator", "_CSETF-SBHL-LINK-NODE-SEARCH-STATE-LINK-GENERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures", "make_sbhl_link_node_search_state", "MAKE-SBHL-LINK-NODE-SEARCH-STATE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures", "visit_defstruct_sbhl_link_node_search_state", "VISIT-DEFSTRUCT-SBHL-LINK-NODE-SEARCH-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures", "visit_defstruct_object_sbhl_link_node_search_state_method", "VISIT-DEFSTRUCT-OBJECT-SBHL-LINK-NODE-SEARCH-STATE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures", "print_sbhl_link_node_search_state", "PRINT-SBHL-LINK-NODE-SEARCH-STATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures", "new_sbhl_link_node_search_state", "NEW-SBHL-LINK-NODE-SEARCH-STATE", 7, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures", "get_sbhl_link_node_search_state_node", "GET-SBHL-LINK-NODE-SEARCH-STATE-NODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures", "get_sbhl_link_node_search_state_module", "GET-SBHL-LINK-NODE-SEARCH-STATE-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures", "get_sbhl_link_node_search_state_direction", "GET-SBHL-LINK-NODE-SEARCH-STATE-DIRECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures", "get_sbhl_link_node_search_state_mt", "GET-SBHL-LINK-NODE-SEARCH-STATE-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures", "get_sbhl_link_node_search_state_tv", "GET-SBHL-LINK-NODE-SEARCH-STATE-TV", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures", "get_sbhl_link_node_search_state_parent_node", "GET-SBHL-LINK-NODE-SEARCH-STATE-PARENT-NODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures", "get_sbhl_link_node_search_state_genl_inverse_modeP", "GET-SBHL-LINK-NODE-SEARCH-STATE-GENL-INVERSE-MODE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures", "get_sbhl_link_node_search_state_link_generator", "GET-SBHL-LINK-NODE-SEARCH-STATE-LINK-GENERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_datastructures", "print_sbhl_link_node_search_state_contents", "PRINT-SBHL-LINK-NODE-SEARCH-STATE-CONTENTS", 1, 1, false);
        return (SubLObject)sbhl_search_datastructures.NIL;
    }
    
    public static SubLObject init_sbhl_search_datastructures_file() {
        sbhl_search_datastructures.$dtp_sbhl_stack$ = SubLFiles.defconstant("*DTP-SBHL-STACK*", (SubLObject)sbhl_search_datastructures.$sym0$SBHL_STACK);
        sbhl_search_datastructures.$dtp_sbhl_link_node_search_state$ = SubLFiles.defconstant("*DTP-SBHL-LINK-NODE-SEARCH-STATE*", (SubLObject)sbhl_search_datastructures.$sym23$SBHL_LINK_NODE_SEARCH_STATE);
        return (SubLObject)sbhl_search_datastructures.NIL;
    }
    
    public static SubLObject setup_sbhl_search_datastructures_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), sbhl_search_datastructures.$dtp_sbhl_stack$.getGlobalValue(), Symbols.symbol_function((SubLObject)sbhl_search_datastructures.$sym7$SBHL_STACK_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)sbhl_search_datastructures.$list8);
        Structures.def_csetf((SubLObject)sbhl_search_datastructures.$sym9$SBHL_STACK_NUM, (SubLObject)sbhl_search_datastructures.$sym10$_CSETF_SBHL_STACK_NUM);
        Structures.def_csetf((SubLObject)sbhl_search_datastructures.$sym11$SBHL_STACK_ELEMENTS, (SubLObject)sbhl_search_datastructures.$sym12$_CSETF_SBHL_STACK_ELEMENTS);
        Equality.identity((SubLObject)sbhl_search_datastructures.$sym0$SBHL_STACK);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), sbhl_search_datastructures.$dtp_sbhl_stack$.getGlobalValue(), Symbols.symbol_function((SubLObject)sbhl_search_datastructures.$sym20$VISIT_DEFSTRUCT_OBJECT_SBHL_STACK_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), sbhl_search_datastructures.$dtp_sbhl_link_node_search_state$.getGlobalValue(), Symbols.symbol_function((SubLObject)sbhl_search_datastructures.$sym30$SBHL_LINK_NODE_SEARCH_STATE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)sbhl_search_datastructures.$list31);
        Structures.def_csetf((SubLObject)sbhl_search_datastructures.$sym32$SBHL_LINK_NODE_SEARCH_STATE_NODE, (SubLObject)sbhl_search_datastructures.$sym33$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_NODE);
        Structures.def_csetf((SubLObject)sbhl_search_datastructures.$sym34$SBHL_LINK_NODE_SEARCH_STATE_MODULE, (SubLObject)sbhl_search_datastructures.$sym35$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_MODULE);
        Structures.def_csetf((SubLObject)sbhl_search_datastructures.$sym36$SBHL_LINK_NODE_SEARCH_STATE_DIRECTION, (SubLObject)sbhl_search_datastructures.$sym37$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_DIRECTION);
        Structures.def_csetf((SubLObject)sbhl_search_datastructures.$sym38$SBHL_LINK_NODE_SEARCH_STATE_MT, (SubLObject)sbhl_search_datastructures.$sym39$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_MT);
        Structures.def_csetf((SubLObject)sbhl_search_datastructures.$sym40$SBHL_LINK_NODE_SEARCH_STATE_TV, (SubLObject)sbhl_search_datastructures.$sym41$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_TV);
        Structures.def_csetf((SubLObject)sbhl_search_datastructures.$sym42$SBHL_LINK_NODE_SEARCH_STATE_PARENT_NODE, (SubLObject)sbhl_search_datastructures.$sym43$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_PARENT_NODE);
        Structures.def_csetf((SubLObject)sbhl_search_datastructures.$sym44$SBHL_LINK_NODE_SEARCH_STATE_GENL_INVERSE_MODE_, (SubLObject)sbhl_search_datastructures.$sym45$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_GENL_INVERSE_MODE_);
        Structures.def_csetf((SubLObject)sbhl_search_datastructures.$sym46$SBHL_LINK_NODE_SEARCH_STATE_LINK_GENERATOR, (SubLObject)sbhl_search_datastructures.$sym47$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_LINK_GENERATOR);
        Equality.identity((SubLObject)sbhl_search_datastructures.$sym23$SBHL_LINK_NODE_SEARCH_STATE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), sbhl_search_datastructures.$dtp_sbhl_link_node_search_state$.getGlobalValue(), Symbols.symbol_function((SubLObject)sbhl_search_datastructures.$sym57$VISIT_DEFSTRUCT_OBJECT_SBHL_LINK_NODE_SEARCH_STATE_METHOD));
        return (SubLObject)sbhl_search_datastructures.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_sbhl_search_datastructures_file();
    }
    
    @Override
	public void initializeVariables() {
        init_sbhl_search_datastructures_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_sbhl_search_datastructures_file();
    }
    
    static {
        me = (SubLFile)new sbhl_search_datastructures();
        sbhl_search_datastructures.$dtp_sbhl_stack$ = null;
        sbhl_search_datastructures.$dtp_sbhl_link_node_search_state$ = null;
        $sym0$SBHL_STACK = SubLObjectFactory.makeSymbol("SBHL-STACK");
        $sym1$SBHL_STACK_P = SubLObjectFactory.makeSymbol("SBHL-STACK-P");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUM"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENTS"));
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NUM"), (SubLObject)SubLObjectFactory.makeKeyword("ELEMENTS"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SBHL-STACK-NUM"), (SubLObject)SubLObjectFactory.makeSymbol("SBHL-STACK-ELEMENTS"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SBHL-STACK-NUM"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SBHL-STACK-ELEMENTS"));
        $sym6$PRINT_SBHL_STACK = SubLObjectFactory.makeSymbol("PRINT-SBHL-STACK");
        $sym7$SBHL_STACK_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("SBHL-STACK-PRINT-FUNCTION-TRAMPOLINE");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("SBHL-STACK-P"));
        $sym9$SBHL_STACK_NUM = SubLObjectFactory.makeSymbol("SBHL-STACK-NUM");
        $sym10$_CSETF_SBHL_STACK_NUM = SubLObjectFactory.makeSymbol("_CSETF-SBHL-STACK-NUM");
        $sym11$SBHL_STACK_ELEMENTS = SubLObjectFactory.makeSymbol("SBHL-STACK-ELEMENTS");
        $sym12$_CSETF_SBHL_STACK_ELEMENTS = SubLObjectFactory.makeSymbol("_CSETF-SBHL-STACK-ELEMENTS");
        $kw13$NUM = SubLObjectFactory.makeKeyword("NUM");
        $kw14$ELEMENTS = SubLObjectFactory.makeKeyword("ELEMENTS");
        $str15$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw16$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym17$MAKE_SBHL_STACK = SubLObjectFactory.makeSymbol("MAKE-SBHL-STACK");
        $kw18$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw19$END = SubLObjectFactory.makeKeyword("END");
        $sym20$VISIT_DEFSTRUCT_OBJECT_SBHL_STACK_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-SBHL-STACK-METHOD");
        $str21$size_ = SubLObjectFactory.makeString("size=");
        $sym22$POSITIVE_INTEGER_P = SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P");
        $sym23$SBHL_LINK_NODE_SEARCH_STATE = SubLObjectFactory.makeSymbol("SBHL-LINK-NODE-SEARCH-STATE");
        $sym24$SBHL_LINK_NODE_SEARCH_STATE_P = SubLObjectFactory.makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-P");
        $list25 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NODE"), (SubLObject)SubLObjectFactory.makeSymbol("MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"), (SubLObject)SubLObjectFactory.makeSymbol("PARENT-NODE"), (SubLObject)SubLObjectFactory.makeSymbol("GENL-INVERSE-MODE?"), (SubLObject)SubLObjectFactory.makeSymbol("LINK-GENERATOR"));
        $list26 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NODE"), (SubLObject)SubLObjectFactory.makeKeyword("MODULE"), (SubLObject)SubLObjectFactory.makeKeyword("DIRECTION"), (SubLObject)SubLObjectFactory.makeKeyword("MT"), (SubLObject)SubLObjectFactory.makeKeyword("TV"), (SubLObject)SubLObjectFactory.makeKeyword("PARENT-NODE"), (SubLObject)SubLObjectFactory.makeKeyword("GENL-INVERSE-MODE?"), (SubLObject)SubLObjectFactory.makeKeyword("LINK-GENERATOR"));
        $list27 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-NODE"), (SubLObject)SubLObjectFactory.makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-DIRECTION"), (SubLObject)SubLObjectFactory.makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-MT"), (SubLObject)SubLObjectFactory.makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-TV"), (SubLObject)SubLObjectFactory.makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-PARENT-NODE"), (SubLObject)SubLObjectFactory.makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-GENL-INVERSE-MODE?"), (SubLObject)SubLObjectFactory.makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-LINK-GENERATOR"));
        $list28 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-NODE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-DIRECTION"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-MT"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-TV"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-PARENT-NODE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-GENL-INVERSE-MODE?"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-LINK-GENERATOR"));
        $sym29$PRINT_SBHL_LINK_NODE_SEARCH_STATE = SubLObjectFactory.makeSymbol("PRINT-SBHL-LINK-NODE-SEARCH-STATE");
        $sym30$SBHL_LINK_NODE_SEARCH_STATE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-PRINT-FUNCTION-TRAMPOLINE");
        $list31 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-P"));
        $sym32$SBHL_LINK_NODE_SEARCH_STATE_NODE = SubLObjectFactory.makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-NODE");
        $sym33$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_NODE = SubLObjectFactory.makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-NODE");
        $sym34$SBHL_LINK_NODE_SEARCH_STATE_MODULE = SubLObjectFactory.makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-MODULE");
        $sym35$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_MODULE = SubLObjectFactory.makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-MODULE");
        $sym36$SBHL_LINK_NODE_SEARCH_STATE_DIRECTION = SubLObjectFactory.makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-DIRECTION");
        $sym37$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_DIRECTION = SubLObjectFactory.makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-DIRECTION");
        $sym38$SBHL_LINK_NODE_SEARCH_STATE_MT = SubLObjectFactory.makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-MT");
        $sym39$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_MT = SubLObjectFactory.makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-MT");
        $sym40$SBHL_LINK_NODE_SEARCH_STATE_TV = SubLObjectFactory.makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-TV");
        $sym41$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_TV = SubLObjectFactory.makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-TV");
        $sym42$SBHL_LINK_NODE_SEARCH_STATE_PARENT_NODE = SubLObjectFactory.makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-PARENT-NODE");
        $sym43$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_PARENT_NODE = SubLObjectFactory.makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-PARENT-NODE");
        $sym44$SBHL_LINK_NODE_SEARCH_STATE_GENL_INVERSE_MODE_ = SubLObjectFactory.makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-GENL-INVERSE-MODE?");
        $sym45$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_GENL_INVERSE_MODE_ = SubLObjectFactory.makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-GENL-INVERSE-MODE?");
        $sym46$SBHL_LINK_NODE_SEARCH_STATE_LINK_GENERATOR = SubLObjectFactory.makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-LINK-GENERATOR");
        $sym47$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_LINK_GENERATOR = SubLObjectFactory.makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-LINK-GENERATOR");
        $kw48$NODE = SubLObjectFactory.makeKeyword("NODE");
        $kw49$MODULE = SubLObjectFactory.makeKeyword("MODULE");
        $kw50$DIRECTION = SubLObjectFactory.makeKeyword("DIRECTION");
        $kw51$MT = SubLObjectFactory.makeKeyword("MT");
        $kw52$TV = SubLObjectFactory.makeKeyword("TV");
        $kw53$PARENT_NODE = SubLObjectFactory.makeKeyword("PARENT-NODE");
        $kw54$GENL_INVERSE_MODE_ = SubLObjectFactory.makeKeyword("GENL-INVERSE-MODE?");
        $kw55$LINK_GENERATOR = SubLObjectFactory.makeKeyword("LINK-GENERATOR");
        $sym56$MAKE_SBHL_LINK_NODE_SEARCH_STATE = SubLObjectFactory.makeSymbol("MAKE-SBHL-LINK-NODE-SEARCH-STATE");
        $sym57$VISIT_DEFSTRUCT_OBJECT_SBHL_LINK_NODE_SEARCH_STATE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-SBHL-LINK-NODE-SEARCH-STATE-METHOD");
        $str58$__a____a_ = SubLObjectFactory.makeString("(~a : ~a)");
        $str59$Node_______________a__ = SubLObjectFactory.makeString("Node:             ~a~%");
        $str60$Module_____________a__ = SubLObjectFactory.makeString("Module:           ~a~%");
        $str61$Direction__________a__ = SubLObjectFactory.makeString("Direction:        ~a~%");
        $str62$Mt_________________a__ = SubLObjectFactory.makeString("Mt:               ~a~%");
        $str63$TV_________________a__ = SubLObjectFactory.makeString("TV:               ~a~%");
        $str64$Parent_Node________a__ = SubLObjectFactory.makeString("Parent Node:      ~a~%");
        $str65$genlInverse_mode___a__ = SubLObjectFactory.makeString("genlInverse mode: ~a~%");
        $str66$Link_Generator_____a__ = SubLObjectFactory.makeString("Link Generator:   ~a~%");
    }
    
    public static final class $sbhl_stack_native extends SubLStructNative
    {
        public SubLObject $num;
        public SubLObject $elements;
        private static final SubLStructDeclNative structDecl;
        
        public $sbhl_stack_native() {
            this.$num = (SubLObject)CommonSymbols.NIL;
            this.$elements = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sbhl_stack_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$num;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$elements;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$num = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$elements = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sbhl_stack_native.class, sbhl_search_datastructures.$sym0$SBHL_STACK, sbhl_search_datastructures.$sym1$SBHL_STACK_P, sbhl_search_datastructures.$list2, sbhl_search_datastructures.$list3, new String[] { "$num", "$elements" }, sbhl_search_datastructures.$list4, sbhl_search_datastructures.$list5, sbhl_search_datastructures.$sym6$PRINT_SBHL_STACK);
        }
    }
    
    public static final class $sbhl_stack_p$UnaryFunction extends UnaryFunction
    {
        public $sbhl_stack_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SBHL-STACK-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return sbhl_search_datastructures.sbhl_stack_p(arg1);
        }
    }
    
    public static final class $sbhl_link_node_search_state_native extends SubLStructNative
    {
        public SubLObject $node;
        public SubLObject $module;
        public SubLObject $direction;
        public SubLObject $mt;
        public SubLObject $tv;
        public SubLObject $parent_node;
        public SubLObject $genl_inverse_modeP;
        public SubLObject $link_generator;
        private static final SubLStructDeclNative structDecl;
        
        public $sbhl_link_node_search_state_native() {
            this.$node = (SubLObject)CommonSymbols.NIL;
            this.$module = (SubLObject)CommonSymbols.NIL;
            this.$direction = (SubLObject)CommonSymbols.NIL;
            this.$mt = (SubLObject)CommonSymbols.NIL;
            this.$tv = (SubLObject)CommonSymbols.NIL;
            this.$parent_node = (SubLObject)CommonSymbols.NIL;
            this.$genl_inverse_modeP = (SubLObject)CommonSymbols.NIL;
            this.$link_generator = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sbhl_link_node_search_state_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$node;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$module;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$direction;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$mt;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$tv;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$parent_node;
        }
        
        @Override
		public SubLObject getField8() {
            return this.$genl_inverse_modeP;
        }
        
        @Override
		public SubLObject getField9() {
            return this.$link_generator;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$node = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$module = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$direction = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$mt = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$tv = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$parent_node = value;
        }
        
        @Override
		public SubLObject setField8(final SubLObject value) {
            return this.$genl_inverse_modeP = value;
        }
        
        @Override
		public SubLObject setField9(final SubLObject value) {
            return this.$link_generator = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sbhl_link_node_search_state_native.class, sbhl_search_datastructures.$sym23$SBHL_LINK_NODE_SEARCH_STATE, sbhl_search_datastructures.$sym24$SBHL_LINK_NODE_SEARCH_STATE_P, sbhl_search_datastructures.$list25, sbhl_search_datastructures.$list26, new String[] { "$node", "$module", "$direction", "$mt", "$tv", "$parent_node", "$genl_inverse_modeP", "$link_generator" }, sbhl_search_datastructures.$list27, sbhl_search_datastructures.$list28, sbhl_search_datastructures.$sym29$PRINT_SBHL_LINK_NODE_SEARCH_STATE);
        }
    }
    
    public static final class $sbhl_link_node_search_state_p$UnaryFunction extends UnaryFunction
    {
        public $sbhl_link_node_search_state_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SBHL-LINK-NODE-SEARCH-STATE-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return sbhl_search_datastructures.sbhl_link_node_search_state_p(arg1);
        }
    }
}

/*

	Total time: 120 ms
	
*/