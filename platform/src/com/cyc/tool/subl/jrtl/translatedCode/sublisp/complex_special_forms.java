/***
 *   Copyright (c) 1995-2009 Cycorp Inc.
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *   
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *  Substantial portions of this code were developed by the Cyc project
 *  and by Cycorp Inc, whose contribution is gratefully acknowledged.
*/

package  com.cyc.tool.subl.jrtl.translatedCode.sublisp;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.ArrayList;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeChar;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeGuid;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;

public  final class complex_special_forms extends SubLTranslatedFile {

  //// Constructor

  private complex_special_forms() {}
  public static final SubLFile me = new complex_special_forms();
  public static final String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.complex_special_forms";

  //// Definitions

  @SubL(source = "sublisp/complex-special-forms.lisp", position = 971) 
  public static final SubLObject intern_accessor(SubLObject string) {
    return Packages.intern(string, UNPROVIDED);
  }

  /** Defines a new polymorphic function that dispatches on the type of its first argument.  <body> defines a default method. The function define-method can be used to define additional methods. For example:

  (defpolymorphic test (a b)
    (list a b))
      
  (define-method test ((a cons) b)
    (cons b a))
      
  (define-method test ((a fixnum) b)
    (+ a b))
     
  The defpolymorphic form defines the function TEST with a default method.
  The two define-method forms specialize the behavior of TEST for lists and fixnums.
sin
  (test 'foo 'bar) => (FOO BAR)
  (test '(foo) 'bar) => (BAR FOO)
  (test 2 3) => 5
   */
  @SubL(source = "sublisp/complex-special-forms.lisp", position = 1167) 
  public static final SubLObject defpolymorphic(SubLObject macroform, SubLObject environment) {
    {
      SubLObject datum = macroform.rest();
      SubLObject current = datum;
      SubLObject name = NIL;
      SubLObject lambda_list = NIL;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list0);
      name = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list0);
      lambda_list = current.first();
      current = current.rest();
      {
        SubLObject body = current;
        return defpolymorphic_internal(name, lambda_list, body);
      }
    }
  }

  /** Defines a method for the polymorphic function <name> that runs if
<dispatch-arg> is of type <type>. The lambda list must have the same
structure as in the DEFPOLYMORPHIC call. */
  @SubL(source = "sublisp/complex-special-forms.lisp", position = 2821) 
  public static final SubLObject define_method(SubLObject macroform, SubLObject environment) {
    {
      SubLObject datum = macroform.rest();
      SubLObject current = datum;
      SubLObject name = NIL;
      SubLObject lambda_list = NIL;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list0);
      name = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list0);
      lambda_list = current.first();
      current = current.rest();
      {
        SubLObject body = current;
        return define_method_internal(name, lambda_list, body);
      }
    }
  }

  @SubL(source = "sublisp/complex-special-forms.lisp", position = 4758) 
  public static final SubLObject defpolymorphic_internal(SubLObject name, SubLObject arglist, SubLObject body) {
    {
      SubLObject method_table_var = method_table_var(name);
      SubLObject method_function_var = Symbols.make_symbol($str1$METHOD_FUNCTION);
      SubLObject doc_string = NIL;
      if (body.first().isString()) {
        doc_string = list(body.first());
        body = body.rest();
      }
      return list($sym2$PROGN, listS($sym3$DEFLEXICAL, method_table_var, $list4), listS($sym5$DEFINE, name, arglist, ConsesLow.append(doc_string, list(listS($sym6$CLET, list(list(method_function_var, list($sym7$_METHOD, arglist.first(), method_table_var))), list($sym8$PWHEN, method_function_var, list($sym9$RET, listS($sym10$FUNCALL, method_function_var, ConsesLow.append(full_formal_parameter_list(arglist), NIL)))), ConsesLow.append(body, NIL))))));
    }
  }

  @SubL(source = "sublisp/complex-special-forms.lisp", position = 5546) 
  public static final SubLObject define_method_internal(SubLObject name, SubLObject arglist, SubLObject body) {
    {
      SubLObject type = conses_high.second(arglist.first());
      SubLObject plain_args = reader.bq_cons(arglist.first().first(), ConsesLow.append(arglist.rest(), NIL));
      SubLObject method_table_var = method_table_var(name);
      SubLObject method_function = method_function_var(name, type);
      SubLObject regmethod_list = build_regmethod_list(type, method_table_var, method_function);
      return listS($sym2$PROGN, list($sym11$DECLAIM, list($sym12$OPTIMIZE_FUNCALL, method_function)), listS($sym5$DEFINE, method_function, plain_args, ConsesLow.append(body, NIL)), ConsesLow.append(regmethod_list, NIL));
    }
  }

  @SubL(source = "sublisp/complex-special-forms.lisp", position = 6028) 
  public static SubLSymbol $polymorphic_type_hierarchy$ = null;

  /** Given one type, this method builds the right call to register-method. */
  @SubL(source = "sublisp/complex-special-forms.lisp", position = 6392) 
  public static final SubLObject build_regmethod_call(SubLObject type, SubLObject method_table, SubLObject method_function) {
    {
      SubLObject dtp_var = dtp_var(type);
      return list($sym14$_REGISTER_METHOD, method_table, dtp_var, list($sym15$FUNCTION, method_function));
    }
  }

  /** This function builds a list of _register-method calls, as appropriate for the type. */
  @SubL(source = "sublisp/complex-special-forms.lisp", position = 6646) 
  public static final SubLObject build_regmethod_list(SubLObject type, SubLObject method_table, SubLObject method_function) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject reglist = NIL;
        SubLObject alias_list = conses_high.second(conses_high.assoc(Symbols.symbol_name(type), $polymorphic_type_hierarchy$.getDynamicValue(thread), Symbols.symbol_function($sym16$STRING_), UNPROVIDED));
        if ((NIL != alias_list)) {
          {
            SubLObject cdolist_list_var = alias_list;
            SubLObject curr = NIL;
            for (curr = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), curr = cdolist_list_var.first()) {
              reglist = cons(build_regmethod_call(curr, method_table, method_function), reglist);
            }
          }
        } else {
          reglist = list(build_regmethod_call(type, method_table, method_function));
        }
        return reglist;
      }
    }
  }

  @SubL(source = "sublisp/complex-special-forms.lisp", position = 7172) 
  public static final SubLObject method_table_var(SubLObject name) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject symbol = NIL;
        {
          SubLObject _prev_bind_0 = Packages.$package$.currentBinding(thread);
          try {
            Packages.$package$.bind(accessor_package(name), thread);
            symbol = intern_accessor(Sequences.cconcatenate($str17$_, new SubLObject[] {Symbols.symbol_name(name), $str18$_METHOD_TABLE_}));
          } finally {
            Packages.$package$.rebind(_prev_bind_0, thread);
          }
        }
        return symbol;
      }
    }
  }

  @SubL(source = "sublisp/complex-special-forms.lisp", position = 7432) 
  public static final SubLObject method_function_var(SubLObject name, SubLObject type) {
    return intern_accessor(Sequences.cconcatenate(Symbols.symbol_name(name), new SubLObject[] {$str19$_, Symbols.symbol_name(type), $str20$_METHOD}));
  }

  @SubL(source = "sublisp/complex-special-forms.lisp", position = 7569) 
  public static final SubLObject dtp_var(SubLObject name) {
    {
      SubLObject symbol = intern_accessor(Sequences.cconcatenate($str21$_DTP_, new SubLObject[] {Symbols.symbol_name(name), $str17$_}));
      return symbol;
    }
  }

  /** Given a function ARGLIST, return a list of all the formal parameters */
  @SubL(source = "sublisp/complex-special-forms.lisp", position = 7762) 
  public static final SubLObject full_formal_parameter_list(SubLObject arglist) {
    {
      SubLObject answer = NIL;
      SubLObject cdolist_list_var = arglist;
      SubLObject arg = NIL;
      for (arg = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), arg = cdolist_list_var.first()) {
        if (arg.isCons()) {
          answer = cons(arg.first(), answer);
        } else if (((arg == $sym22$_OPTIONAL)
            || (arg == $sym23$_REST))) {
        } else {
          answer = cons(arg, answer);
        }
      }
      return Sequences.nreverse(answer);
    }
  }

  /** Like Common Lisp defstruct except:
 (1) slot initializations are not allowed.

 (2) there is an option: (:c-structure-tag val), where
 val is an integer between 128-255.  If you add a new defstruct, and you want efficient 
 C code support,
 you must have the person who maintains the Sublisp Run-Time Library
 (RTL) add the tag by hand.

 (3) the only other options: 
 (:conc-name whatever)
 (:print-function #'whatever) 
 (:generate-visit-function? T-or-NIL)

 the default structure print function is
 default-struct-print-function : object stream depth

 (4) The make constructor takes an argument list, which is expected to have 
 the keyword/value pairs, i.e. (make-foo :a 1 :b 2) in common lisp is 
 (make-foo '(:a 1 :b 2)) for us.

 (5) Reading of structures is not supported by the reader. */
  @SubL(source = "sublisp/complex-special-forms.lisp", position = 8093) 
  public static final SubLObject defstruct(SubLObject macroform, SubLObject environment) {
    {
      SubLObject datum = macroform.rest();
      SubLObject current = datum;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list24);
      {
        SubLObject temp = current.rest();
        current = current.first();
        {
          SubLObject name = NIL;
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list24);
          name = current.first();
          current = current.rest();
          {
            SubLObject options = current;
            current = temp;
            {
              SubLObject slots = current;
              SubLObject analysis = defstruct_analyze(name, options, slots);
              return defstruct_expand(analysis);
            }
          }
        }
      }
    }
  }

  @SubL(source = "sublisp/complex-special-forms.lisp", position = 9599) 
  public static final SubLObject defstruct_analyze(SubLObject name, SubLObject options, SubLObject slots) {
    checkType(name, $sym25$SYMBOLP);
    {
      SubLObject conc_name = conses_high.second(conses_high.assoc($kw26$CONC_NAME, options, UNPROVIDED, UNPROVIDED));
      SubLObject print_function = conses_high.second(conses_high.assoc($kw27$PRINT_FUNCTION, options, UNPROVIDED, UNPROVIDED));
      SubLObject c_structure_tag = conses_high.second(conses_high.assoc($kw28$C_STRUCTURE_TAG, options, UNPROVIDED, UNPROVIDED));
      SubLObject make_visit_fnP = conses_high.second(conses_high.assoc($kw29$GENERATE_VISIT_FUNCTION_, options, UNPROVIDED, UNPROVIDED));
      conc_name = defstruct_conc_name(name, conc_name);
      {
        SubLObject predicate = defstruct_predicate(name);
        SubLObject constructor = defstruct_constructor(name);
        SubLObject type_var = defstruct_type_var(name);
        SubLObject slot_keywords = defstruct_slot_keywords(slots);
        SubLObject getters = defstruct_getters(conc_name, slots);
        SubLObject setters = defstruct_setters(getters);
        SubLObject host_fn_name = defstruct_host_fn_name(name);
        return listS($kw30$NAME, name, ConsesLow.append(new SubLObject[] {((NIL != conc_name) ? ((SubLObject) list($kw26$CONC_NAME, conc_name)) : NIL), ((NIL != print_function) ? ((SubLObject) list($kw27$PRINT_FUNCTION, print_function)) : NIL), ((NIL != c_structure_tag) ? ((SubLObject) list($kw28$C_STRUCTURE_TAG, c_structure_tag)) : NIL), ((NIL != make_visit_fnP) ? ((SubLObject) list($kw29$GENERATE_VISIT_FUNCTION_, make_visit_fnP, $kw31$HOST_FN_NAME, host_fn_name)) : NIL), list(new SubLObject[] {$kw32$PREDICATE, predicate, $kw33$CONSTRUCTOR, constructor, $kw34$TYPE_VAR, type_var, $kw35$SLOTS, slots, $kw36$SLOT_KEYWORDS, slot_keywords, $kw37$GETTERS, getters, $kw38$SETTERS, setters})}));
      }
    }
  }

  @SubL(source = "sublisp/complex-special-forms.lisp", position = 10983) 
  public static final SubLObject defstruct_conc_name(SubLObject name, SubLObject conc_name) {
    if ((NIL != conc_name)) {
      return conc_name;
    }
    return intern_accessor(Sequences.cconcatenate(Symbols.symbol_name(name), $str19$_));
  }

  @SubL(source = "sublisp/complex-special-forms.lisp", position = 11130) 
  public static final SubLObject defstruct_predicate(SubLObject name) {
    return intern_accessor(Sequences.cconcatenate(Symbols.symbol_name(name), $str39$_P));
  }

  @SubL(source = "sublisp/complex-special-forms.lisp", position = 11232) 
  public static final SubLObject defstruct_constructor(SubLObject name) {
    return intern_accessor(Sequences.cconcatenate($str40$MAKE_, Symbols.symbol_name(name)));
  }

  @SubL(source = "sublisp/complex-special-forms.lisp", position = 11339) 
  public static final SubLObject defstruct_host_fn_name(SubLObject name) {
    return intern_accessor(Sequences.cconcatenate($str41$VISIT_DEFSTRUCT_, Symbols.symbol_name(name)));
  }

  @SubL(source = "sublisp/complex-special-forms.lisp", position = 11458) 
  public static final SubLObject defstruct_type_var(SubLObject name) {
    return intern_accessor(Sequences.cconcatenate($str21$_DTP_, new SubLObject[] {Symbols.symbol_name(name), $str17$_}));
  }

  @SubL(source = "sublisp/complex-special-forms.lisp", position = 11566) 
  public static final SubLObject defstruct_slot_keywords(SubLObject slots) {
    {
      SubLObject slot_keywords = NIL;
      SubLObject cdolist_list_var = slots;
      SubLObject slot = NIL;
      for (slot = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), slot = cdolist_list_var.first()) {
        {
          SubLObject slot_keyword = Symbols.make_keyword(Symbols.symbol_name(slot));
          slot_keywords = cons(slot_keyword, slot_keywords);
        }
      }
      return Sequences.nreverse(slot_keywords);
    }
  }

  @SubL(source = "sublisp/complex-special-forms.lisp", position = 11800) 
  public static final SubLObject defstruct_getters(SubLObject conc_name, SubLObject slots) {
    {
      SubLObject getters = NIL;
      SubLObject cdolist_list_var = slots;
      SubLObject slot = NIL;
      for (slot = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), slot = cdolist_list_var.first()) {
        {
          SubLObject getter = defstruct_getter(conc_name, slot);
          getters = cons(getter, getters);
        }
      }
      return Sequences.nreverse(getters);
    }
  }

  @SubL(source = "sublisp/complex-special-forms.lisp", position = 12011) 
  public static final SubLObject defstruct_getter(SubLObject conc_name, SubLObject slot) {
    return intern_accessor(Strings.string_upcase(Sequences.cconcatenate(Symbols.symbol_name(conc_name), Symbols.symbol_name(slot)), UNPROVIDED, UNPROVIDED));
  }

  @SubL(source = "sublisp/complex-special-forms.lisp", position = 12155) 
  public static final SubLObject defstruct_setters(SubLObject getters) {
    {
      SubLObject setters = NIL;
      SubLObject cdolist_list_var = getters;
      SubLObject getter = NIL;
      for (getter = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), getter = cdolist_list_var.first()) {
        {
          SubLObject setter = defstruct_setter(getter);
          setters = cons(setter, setters);
        }
      }
      return Sequences.nreverse(setters);
    }
  }

  @SubL(source = "sublisp/complex-special-forms.lisp", position = 12354) 
  public static final SubLObject defstruct_setter(SubLObject getter) {
    {
      SubLObject getter_name = Symbols.symbol_name(getter);
      SubLObject getter_package = getter_package(getter);
      SubLObject setter_name = Sequences.cconcatenate($str42$_CSETF_, getter_name);
      SubLObject setter_package = getter_package;
      return Packages.intern(setter_name, setter_package);
    }
  }

  @SubL(source = "sublisp/complex-special-forms.lisp", position = 12621) 
  public static final SubLObject getter_package(SubLObject getter) {
    {
      SubLObject v_package = Symbols.symbol_package(getter);
      if ((!(Packages.package_name(v_package).equal($str43$CYC)))) {
        v_package = Packages.find_package($str44$SUBLISP);
      }
      return v_package;
    }
  }

  @SubL(source = "sublisp/complex-special-forms.lisp", position = 12816) 
  public static final SubLObject accessor_package(SubLObject accessor) {
    return getter_package(accessor);
  }

  @SubL(source = "sublisp/complex-special-forms.lisp", position = 12921) 
  public static final SubLObject setter_from_accessor(SubLObject accessor) {
    return defstruct_setter(accessor);
  }

  @SubL(source = "sublisp/complex-special-forms.lisp", position = 13045) 
  public static final SubLObject defstruct_lisp_constructor(SubLObject constructor) {
    return intern_accessor(Sequences.cconcatenate(Symbols.symbol_name(constructor), $str45$_1));
  }

  @SubL(source = "sublisp/complex-special-forms.lisp", position = 14988) 
  public static final SubLObject defstruct_expand(SubLObject analysis) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject datum = analysis;
        SubLObject current = datum;
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_1 = NIL;
        for (; (NIL != rest); ) {
          cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list46);
          current_1 = rest.first();
          rest = rest.rest();
          cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list46);
          if ((NIL == conses_high.member(current_1, $list47, UNPROVIDED, UNPROVIDED))) {
            bad = T;
          }
          if ((current_1 == $kw48$ALLOW_OTHER_KEYS)) {
            allow_other_keys_p = rest.first();
          }
          rest = rest.rest();
        }
        if (((NIL != bad)
             && (NIL == allow_other_keys_p))) {
          cdestructuring_bind.cdestructuring_bind_error(datum, $list46);
        }
        {
          SubLObject name_tail = cdestructuring_bind.property_list_member($kw30$NAME, current);
          SubLObject name = ((NIL != name_tail) ? ((SubLObject) conses_high.cadr(name_tail)) : NIL);
          SubLObject conc_name_tail = cdestructuring_bind.property_list_member($kw26$CONC_NAME, current);
          SubLObject conc_name = ((NIL != conc_name_tail) ? ((SubLObject) conses_high.cadr(conc_name_tail)) : NIL);
          SubLObject print_function_tail = cdestructuring_bind.property_list_member($kw27$PRINT_FUNCTION, current);
          SubLObject print_function = ((NIL != print_function_tail) ? ((SubLObject) conses_high.cadr(print_function_tail)) : NIL);
          SubLObject c_structure_tag_tail = cdestructuring_bind.property_list_member($kw28$C_STRUCTURE_TAG, current);
          SubLObject c_structure_tag = ((NIL != c_structure_tag_tail) ? ((SubLObject) conses_high.cadr(c_structure_tag_tail)) : NIL);
          SubLObject generate_visit_functionP_tail = cdestructuring_bind.property_list_member($kw29$GENERATE_VISIT_FUNCTION_, current);
          SubLObject generate_visit_functionP = ((NIL != generate_visit_functionP_tail) ? ((SubLObject) conses_high.cadr(generate_visit_functionP_tail)) : NIL);
          SubLObject predicate_tail = cdestructuring_bind.property_list_member($kw32$PREDICATE, current);
          SubLObject predicate = ((NIL != predicate_tail) ? ((SubLObject) conses_high.cadr(predicate_tail)) : NIL);
          SubLObject constructor_tail = cdestructuring_bind.property_list_member($kw33$CONSTRUCTOR, current);
          SubLObject constructor = ((NIL != constructor_tail) ? ((SubLObject) conses_high.cadr(constructor_tail)) : NIL);
          SubLObject host_fn_name_tail = cdestructuring_bind.property_list_member($kw31$HOST_FN_NAME, current);
          SubLObject host_fn_name = ((NIL != host_fn_name_tail) ? ((SubLObject) conses_high.cadr(host_fn_name_tail)) : NIL);
          SubLObject type_var_tail = cdestructuring_bind.property_list_member($kw34$TYPE_VAR, current);
          SubLObject type_var = ((NIL != type_var_tail) ? ((SubLObject) conses_high.cadr(type_var_tail)) : NIL);
          SubLObject slots_tail = cdestructuring_bind.property_list_member($kw35$SLOTS, current);
          SubLObject slots = ((NIL != slots_tail) ? ((SubLObject) conses_high.cadr(slots_tail)) : NIL);
          SubLObject slot_keywords_tail = cdestructuring_bind.property_list_member($kw36$SLOT_KEYWORDS, current);
          SubLObject slot_keywords = ((NIL != slot_keywords_tail) ? ((SubLObject) conses_high.cadr(slot_keywords_tail)) : NIL);
          SubLObject getters_tail = cdestructuring_bind.property_list_member($kw37$GETTERS, current);
          SubLObject getters = ((NIL != getters_tail) ? ((SubLObject) conses_high.cadr(getters_tail)) : NIL);
          SubLObject setters_tail = cdestructuring_bind.property_list_member($kw38$SETTERS, current);
          SubLObject setters = ((NIL != setters_tail) ? ((SubLObject) conses_high.cadr(setters_tail)) : NIL);
          if ((NIL != Sequences.find($kw49$SL2JAVA, reader.$features$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            c_structure_tag = NIL;
          }
          {
            SubLObject type_var_form = defstruct_type_var_form(type_var, name, c_structure_tag);
            SubLObject print_method = defstruct_print_method(name, print_function);
            SubLObject print_forms = defstruct_print_forms(c_structure_tag, type_var, print_function, print_method);
            SubLObject register_form = defstruct_register_form(name, c_structure_tag, slots, print_method);
            SubLObject predicate_form = defstruct_predicate_form(name, predicate, c_structure_tag, type_var);
            SubLObject getter_forms = defstruct_getter_forms(name, c_structure_tag, predicate, slots, getters);
            SubLObject setter_forms = defstruct_setter_forms(name, c_structure_tag, predicate, slots, setters);
            SubLObject def_csetf_forms = defstruct_def_csetf_forms(getters, setters);
            SubLObject host_fn_form = ((NIL != generate_visit_functionP) ? ((SubLObject) defstruct_host_function(name, host_fn_name, constructor, slot_keywords, getters)) : NIL);
            SubLObject constructor_form = defstruct_constructor_form(name, constructor, c_structure_tag, type_var, slot_keywords, setters);
            return listS($sym2$PROGN, type_var_form, ConsesLow.append(print_forms, ((NIL != register_form) ? ((SubLObject) list(register_form)) : NIL), listS(list($sym11$DECLAIM, list($sym12$OPTIMIZE_FUNCALL, predicate)), predicate_form, ConsesLow.append(getter_forms, setter_forms, def_csetf_forms, list(constructor_form, list(IDENTITY, list($sym50$QUOTE, name)), ((NIL != generate_visit_functionP) ? ((SubLObject) host_fn_form) : $list51))))));
          }
        }
      }
    }
  }

  @SubL(source = "sublisp/complex-special-forms.lisp", position = 17030) 
  public static final SubLObject _defstruct_object_p(SubLObject macroform, SubLObject environment) {
    {
      SubLObject datum = macroform.rest();
      SubLObject current = datum;
      SubLObject object = NIL;
      SubLObject c_structure_tag = NIL;
      SubLObject type_var = NIL;
      SubLObject type = NIL;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list52);
      object = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list52);
      c_structure_tag = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list52);
      type_var = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list52);
      type = current.first();
      current = current.rest();
      if ((NIL == current)) {
        if ((NIL != c_structure_tag)) {
          return list($sym53$_STRUCTURE_TYPE, object, c_structure_tag);
        } else {
          return list($sym54$CAND, list($sym55$_STRUCTURES_BAG_P, object), list(EQ, listS($sym56$_STRUCTURE_SLOT, object, $list57), type_var));
        }
      } else {
        cdestructuring_bind.cdestructuring_bind_error(datum, $list52);
      }
    }
    return NIL;
  }

  @SubL(source = "sublisp/complex-special-forms.lisp", position = 17340) 
  public static final SubLObject _defstruct_get_slot(SubLObject macroform, SubLObject environment) {
    {
      SubLObject datum = macroform.rest();
      SubLObject current = datum;
      SubLObject object = NIL;
      SubLObject index = NIL;
      SubLObject type = NIL;
      SubLObject slot = NIL;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list58);
      object = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list58);
      index = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list58);
      type = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list58);
      slot = current.first();
      current = current.rest();
      if ((NIL == current)) {
        return list($sym56$_STRUCTURE_SLOT, object, index);
      } else {
        cdestructuring_bind.cdestructuring_bind_error(datum, $list58);
      }
    }
    return NIL;
  }

  @SubL(source = "sublisp/complex-special-forms.lisp", position = 17487) 
  public static final SubLObject _defstruct_set_slot(SubLObject macroform, SubLObject environment) {
    {
      SubLObject datum = macroform.rest();
      SubLObject current = datum;
      SubLObject object = NIL;
      SubLObject index = NIL;
      SubLObject value = NIL;
      SubLObject type = NIL;
      SubLObject slot = NIL;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list59);
      object = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list59);
      index = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list59);
      value = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list59);
      type = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list59);
      slot = current.first();
      current = current.rest();
      if ((NIL == current)) {
        return list($sym60$_SET_STRUCTURE_SLOT, object, index, value);
      } else {
        cdestructuring_bind.cdestructuring_bind_error(datum, $list59);
      }
    }
    return NIL;
  }

  @SubL(source = "sublisp/complex-special-forms.lisp", position = 17651) 
  public static final SubLObject _defstruct_construct(SubLObject macroform, SubLObject environment) {
    {
      SubLObject datum = macroform.rest();
      SubLObject current = datum;
      SubLObject c_structure_tag = NIL;
      SubLObject size = NIL;
      SubLObject type_var = NIL;
      SubLObject type = NIL;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list61);
      c_structure_tag = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list61);
      size = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list61);
      type_var = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list61);
      type = current.first();
      current = current.rest();
      if ((NIL == current)) {
        if ((NIL != c_structure_tag)) {
          return list($sym62$_CLEAR_STRUCTURE, list($sym63$_NEW_STRUCTURE, c_structure_tag, size), size);
        } else {
          return list($sym64$_CLEAR_SUB_STRUCTURE, list($sym63$_NEW_STRUCTURE, $sym65$_DTP_STRUCTURES_BAG_, size), size, type_var);
        }
      } else {
        cdestructuring_bind.cdestructuring_bind_error(datum, $list61);
      }
    }
    return NIL;
  }

  @SubL(source = "sublisp/complex-special-forms.lisp", position = 17972) 
  public static final SubLObject defstruct_type_var_form(SubLObject type_var, SubLObject name, SubLObject c_structure_tag) {
    return list($sym66$DEFCONSTANT, type_var, ((NIL != c_structure_tag) ? ((SubLObject) c_structure_tag) : list($sym50$QUOTE, name)));
  }

  @SubL(source = "sublisp/complex-special-forms.lisp", position = 18392) 
  public static final SubLObject defstruct_print_method(SubLObject name, SubLObject print_function) {
    return intern_accessor(Sequences.cconcatenate(Symbols.symbol_name(name), $str67$_PRINT_FUNCTION_TRAMPOLINE));
  }

  @SubL(source = "sublisp/complex-special-forms.lisp", position = 18562) 
  public static final SubLObject defstruct_print_forms(SubLObject c_structure_tag, SubLObject tag_var, SubLObject print_function, SubLObject print_method) {
    if ((NIL == print_function)) {
      print_function = $sym68$DEFAULT_STRUCT_PRINT_FUNCTION;
    }
    return listS(list($sym11$DECLAIM, list($sym69$FACCESS, $sym70$PRIVATE, print_method)), list($sym5$DEFINE, print_method, $list71, reader.bq_cons(print_function, $list72)), ConsesLow.append(((NIL != c_structure_tag) ? ((SubLObject) NIL) : list(list($sym14$_REGISTER_METHOD, $sym73$_PRINT_OBJECT_METHOD_TABLE_, tag_var, list($sym15$FUNCTION, print_method)))), NIL));
  }

  @SubL(source = "sublisp/complex-special-forms.lisp", position = 19045) 
  public static final SubLObject defstruct_register_form(SubLObject name, SubLObject c_structure_tag, SubLObject slots, SubLObject print_method) {
    if ((NIL != c_structure_tag)) {
      return list($sym74$_REGISTER_DEFSTRUCT, Symbols.symbol_name(name), c_structure_tag, Sequences.length(slots), list($sym50$QUOTE, print_method), list($sym50$QUOTE, slots));
    }
    return NIL;
  }

  @SubL(source = "sublisp/complex-special-forms.lisp", position = 19301) 
  public static final SubLObject defstruct_predicate_form(SubLObject type, SubLObject predicate, SubLObject c_structure_tag, SubLObject type_var) {
    {
      SubLObject arglist = defstruct_predicate_arglist(predicate);
      SubLObject predicate_var = arglist.first();
      return list($sym5$DEFINE, predicate, arglist, list($sym9$RET, list($sym75$_DEFSTRUCT_OBJECT_P, predicate_var, c_structure_tag, type_var, type)));
    }
  }

  @SubL(source = "sublisp/complex-special-forms.lisp", position = 19601) 
  public static final SubLObject defstruct_predicate_arglist(SubLObject predicate) {
    return list(defstruct_predicate_variable(predicate));
  }

  @SubL(source = "sublisp/complex-special-forms.lisp", position = 19706) 
  public static final SubLObject defstruct_predicate_variable(SubLObject predicate) {
    return defstruct_first_function_variable(predicate, $sym76$OBJECT);
  }

  /** return a symbol to use as the first variable in the arglist of FUNCTION */
  @SubL(source = "sublisp/complex-special-forms.lisp", position = 19819) 
  public static final SubLObject defstruct_first_function_variable(SubLObject function, SubLObject v_default) {
    return v_default;
  }

  @SubL(source = "sublisp/complex-special-forms.lisp", position = 20131) 
  public static final SubLObject defstruct_getter_forms(SubLObject type, SubLObject c_structure_tag, SubLObject predicate, SubLObject slots, SubLObject getters) {
    {
      SubLObject forms = NIL;
      SubLObject cdotimes_end_var = Sequences.length(getters);
      SubLObject i = NIL;
      for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, ONE_INTEGER)) {
        {
          SubLObject slot = ConsesLow.nth(i, slots);
          SubLObject getter = ConsesLow.nth(i, getters);
          SubLObject index = ((NIL != c_structure_tag) ? ((SubLObject) i) : Numbers.add(i, TWO_INTEGER));
          forms = cons(defstruct_getter_form(getter, index, predicate, type, slot), forms);
        }
      }
      return Sequences.nreverse(forms);
    }
  }

  @SubL(source = "sublisp/complex-special-forms.lisp", position = 20544) 
  public static final SubLObject defstruct_getter_form(SubLObject getter, SubLObject index, SubLObject predicate, SubLObject type, SubLObject slot) {
    {
      SubLObject arglist = defstruct_getter_arglist(getter);
      SubLObject getter_var = arglist.first();
      return list($sym5$DEFINE, getter, arglist, list($sym77$CHECK_TYPE, getter_var, predicate), list($sym9$RET, list($sym78$_DEFSTRUCT_GET_SLOT, getter_var, index, type, slot)));
    }
  }

  @SubL(source = "sublisp/complex-special-forms.lisp", position = 20842) 
  public static final SubLObject defstruct_getter_arglist(SubLObject getter) {
    return list(defstruct_getter_variable(getter));
  }

  @SubL(source = "sublisp/complex-special-forms.lisp", position = 20933) 
  public static final SubLObject defstruct_getter_variable(SubLObject getter) {
    return defstruct_first_function_variable(getter, $sym76$OBJECT);
  }

  @SubL(source = "sublisp/complex-special-forms.lisp", position = 21037) 
  public static final SubLObject defstruct_setter_forms(SubLObject type, SubLObject c_structure_tag, SubLObject predicate, SubLObject slots, SubLObject setters) {
    {
      SubLObject forms = NIL;
      SubLObject cdotimes_end_var = Sequences.length(setters);
      SubLObject i = NIL;
      for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, ONE_INTEGER)) {
        {
          SubLObject slot = ConsesLow.nth(i, slots);
          SubLObject setter = ConsesLow.nth(i, setters);
          SubLObject index = ((NIL != c_structure_tag) ? ((SubLObject) i) : Numbers.add(i, TWO_INTEGER));
          forms = cons(defstruct_setter_form(setter, index, predicate, type, slot), forms);
        }
      }
      return Sequences.nreverse(forms);
    }
  }

  @SubL(source = "sublisp/complex-special-forms.lisp", position = 21449) 
  public static final SubLObject defstruct_setter_form(SubLObject setter, SubLObject index, SubLObject predicate, SubLObject type, SubLObject slot) {
    {
      SubLObject arglist = defstruct_setter_arglist(setter);
      SubLObject object_var = arglist.first();
      SubLObject value_var = conses_high.second(arglist);
      return list($sym5$DEFINE, setter, arglist, list($sym77$CHECK_TYPE, object_var, predicate), list($sym9$RET, list($sym79$_DEFSTRUCT_SET_SLOT, object_var, index, value_var, type, slot)));
    }
  }

  @SubL(source = "sublisp/complex-special-forms.lisp", position = 21791) 
  public static final SubLObject defstruct_setter_arglist(SubLObject setter) {
    return $list80;
  }

  @SubL(source = "sublisp/complex-special-forms.lisp", position = 21877) 
  public static final SubLObject defstruct_def_csetf_forms(SubLObject getters, SubLObject setters) {
    {
      SubLObject forms = NIL;
      SubLObject rest_getters = NIL;
      SubLObject rest_setters = NIL;
      SubLObject getter = NIL;
      SubLObject setter = NIL;
      for (rest_getters = getters, rest_setters = setters, getter = rest_getters.first(), setter = rest_setters.first(); (NIL != rest_getters); rest_getters = rest_getters.rest(), rest_setters = rest_setters.rest(), getter = rest_getters.first(), setter = rest_setters.first()) {
        forms = cons(list($sym81$_DEF_CSETF, list($sym50$QUOTE, getter), list($sym50$QUOTE, setter)), forms);
      }
      return Sequences.nreverse(forms);
    }
  }

  @SubL(source = "sublisp/complex-special-forms.lisp", position = 22263) 
  public static final SubLObject defstruct_constructor_form(SubLObject type, SubLObject constructor, SubLObject c_structure_tag, SubLObject type_var, SubLObject slot_keywords, SubLObject setters) {
    {
      SubLObject arglist = defstruct_constructor_arglist(constructor);
      SubLObject arglist_var = conses_high.second(arglist);
      SubLObject new_var = $sym82$NEW;
      SubLObject size = Sequences.length(slot_keywords);
      SubLObject arglist_handler = defstruct_constructor_arglist_handler(arglist_var, new_var, slot_keywords, setters);
      return list($sym5$DEFINE, constructor, arglist, list($sym6$CLET, list(list(new_var, list($sym83$_DEFSTRUCT_CONSTRUCT, c_structure_tag, size, type_var, type))), arglist_handler, list($sym9$RET, new_var)));
    }
  }

  @SubL(source = "sublisp/complex-special-forms.lisp", position = 22894) 
  public static final SubLObject defstruct_constructor_arglist(SubLObject constructor) {
    return $list84;
  }

  @SubL(source = "sublisp/complex-special-forms.lisp", position = 23000) 
  public static final SubLObject defstruct_constructor_arglist_handler(SubLObject arglist_var, SubLObject new_var, SubLObject slot_keywords, SubLObject setters) {
    {
      SubLObject current_value = Symbols.make_symbol($str85$CURRENT_VALUE);
      SubLObject current_arg = Symbols.make_symbol($str86$CURRENT_ARG);
      SubLObject next = Symbols.make_symbol($str87$NEXT);
      SubLObject gencaseslots = NIL;
      SubLObject cdotimes_end_var = Sequences.length(slot_keywords);
      SubLObject n = NIL;
      for (n = ZERO_INTEGER; n.numL(cdotimes_end_var); n = Numbers.add(n, ONE_INTEGER)) {
        {
          SubLObject slot_keyword = ConsesLow.nth(n, slot_keywords);
          SubLObject setter = ConsesLow.nth(n, setters);
          gencaseslots = cons(list(slot_keyword, list(setter, new_var, current_value)), gencaseslots);
        }
      }
      gencaseslots = cons(list($sym88$OTHERWISE, list($sym89$ERROR, $str90$Invalid_slot__S_for_construction_, current_arg)), gencaseslots);
      return list($sym91$CDO, list(list(next, arglist_var, list($sym92$CDDR, next))), list(list($sym93$NULL, next)), list($sym6$CLET, list(list(current_arg, list($sym94$CAR, next)), list(current_value, list($sym95$CADR, next))), listS($sym96$PCASE, current_arg, ConsesLow.append(Sequences.nreverse(gencaseslots), NIL))));
    }
  }

  /** Returns the form for the visitation of a structure object. */
  @SubL(source = "sublisp/complex-special-forms.lisp", position = 23810) 
  public static final SubLObject defstruct_host_function(SubLObject type_name, SubLObject host_fn, SubLObject constructor_fn, SubLObject slot_keywords, SubLObject getters) {
    {
      SubLObject arglist = defstruct_host_arglist();
      SubLObject object_arg = arglist.first();
      SubLObject visitor_fn_arg = conses_high.second(arglist);
      SubLObject size = Sequences.length(slot_keywords);
      SubLObject statements = NIL;
      statements = cons(list($sym10$FUNCALL, visitor_fn_arg, object_arg, $kw97$BEGIN, list($sym50$QUOTE, constructor_fn), size), statements);
      {
        SubLObject index = NIL;
        for (index = ZERO_INTEGER; index.numL(size); index = Numbers.add(index, ONE_INTEGER)) {
          {
            SubLObject slot_keyword = ConsesLow.nth(index, slot_keywords);
            SubLObject slot_getter = ConsesLow.nth(index, getters);
            statements = cons(list($sym10$FUNCALL, visitor_fn_arg, object_arg, $kw98$SLOT, slot_keyword, list(slot_getter, object_arg)), statements);
          }
        }
      }
      statements = cons(list($sym10$FUNCALL, visitor_fn_arg, object_arg, $kw99$END, list($sym50$QUOTE, constructor_fn), size), statements);
      statements = Sequences.nreverse(statements);
      return list($sym2$PROGN, list($sym5$DEFINE, host_fn, arglist, reader.bq_cons($sym2$PROGN, ConsesLow.append(statements, NIL)), list($sym9$RET, object_arg)), list($sym100$DEFINE_METHOD, $sym101$VISIT_DEFSTRUCT_OBJECT, reader.bq_cons(list($sym102$OBJ, type_name), $list103), list($sym9$RET, reader.bq_cons(host_fn, $list104))));
    }
  }

  @SubL(source = "sublisp/complex-special-forms.lisp", position = 24929) 
  public static final SubLObject defstruct_host_arglist() {
    return $list104;
  }

  @SubL(source = "sublisp/complex-special-forms.lisp", position = 24991) 
  public static SubLSymbol $call_profiling_enabledP$ = null;

  @SubL(source = "sublisp/complex-special-forms.lisp", position = 25183) 
  public static SubLSymbol $call_profiling_table$ = null;

  /** Execute BODY with call profiling enabled.
   On exit PLACE will be set to an alist of (FUNCTION . COUNT) pairs. */
  @SubL(source = "sublisp/complex-special-forms.lisp", position = 25292) 
  public static final SubLObject with_call_profiling(SubLObject macroform, SubLObject environment) {
    {
      SubLObject datum = macroform.rest();
      SubLObject current = datum;
      SubLObject place = NIL;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list105);
      place = current.first();
      current = current.rest();
      {
        SubLObject body = current;
        return list($sym6$CLET, $list106, list($sym107$CUNWIND_PROTECT, reader.bq_cons($sym2$PROGN, ConsesLow.append(body, NIL)), listS($sym108$CSETF, place, $list109)));
      }
    }
  }

  @SubL(source = "sublisp/complex-special-forms.lisp", position = 25697) 
  public static final SubLObject possibly_note_function_entry(SubLObject name) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (((NIL != $call_profiling_enabledP$.getDynamicValue(thread))
           && (NIL != $call_profiling_table$.getDynamicValue(thread)))) {
        Hashtables.sethash(name, $call_profiling_table$.getDynamicValue(thread), Numbers.add(Hashtables.gethash_without_values(name, $call_profiling_table$.getDynamicValue(thread), ZERO_INTEGER), ONE_INTEGER));
      }
      return NIL;
    }
  }

  @SubL(source = "sublisp/complex-special-forms.lisp", position = 25895) 
  public static final SubLObject initialize_call_profiling_table() {
    return Hashtables.make_hash_table($int110$1000, Symbols.symbol_function(EQ), UNPROVIDED);
  }

  @SubL(source = "sublisp/complex-special-forms.lisp", position = 25990) 
  public static final SubLObject finalize_call_profiling_table(SubLObject table) {
    {
      SubLObject pairs = NIL;
      SubLObject function = NIL;
      SubLObject count = NIL;
      {
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(table);
        try {
          while (Hashtables.iteratorHasNext(cdohash_iterator)) {
            final Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
            function = Hashtables.getEntryKey(cdohash_entry);
            count = Hashtables.getEntryValue(cdohash_entry);
            pairs = cons(cons(function, count), pairs);
          }
        } finally {
          Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
      }
      pairs = Sort.sort(pairs, Symbols.symbol_function($sym111$_), Symbols.symbol_function($sym112$CDR));
      return pairs;
    }
  }

  public static final SubLObject declare_complex_special_forms_file() {
    declareFunction(myName, "intern_accessor", "INTERN-ACCESSOR", 1, 0, false);
    declareMacro(myName, "defpolymorphic", "DEFPOLYMORPHIC");
    declareMacro(myName, "define_method", "DEFINE-METHOD");
    declareFunction(myName, "defpolymorphic_internal", "DEFPOLYMORPHIC-INTERNAL", 3, 0, false);
    declareFunction(myName, "define_method_internal", "DEFINE-METHOD-INTERNAL", 3, 0, false);
    declareFunction(myName, "build_regmethod_call", "BUILD-REGMETHOD-CALL", 3, 0, false);
    declareFunction(myName, "build_regmethod_list", "BUILD-REGMETHOD-LIST", 3, 0, false);
    declareFunction(myName, "method_table_var", "METHOD-TABLE-VAR", 1, 0, false);
    declareFunction(myName, "method_function_var", "METHOD-FUNCTION-VAR", 2, 0, false);
    declareFunction(myName, "dtp_var", "DTP-VAR", 1, 0, false);
    declareFunction(myName, "full_formal_parameter_list", "FULL-FORMAL-PARAMETER-LIST", 1, 0, false);
    declareMacro(myName, "defstruct", "DEFSTRUCT");
    declareFunction(myName, "defstruct_analyze", "DEFSTRUCT-ANALYZE", 3, 0, false);
    declareFunction(myName, "defstruct_conc_name", "DEFSTRUCT-CONC-NAME", 2, 0, false);
    declareFunction(myName, "defstruct_predicate", "DEFSTRUCT-PREDICATE", 1, 0, false);
    declareFunction(myName, "defstruct_constructor", "DEFSTRUCT-CONSTRUCTOR", 1, 0, false);
    declareFunction(myName, "defstruct_host_fn_name", "DEFSTRUCT-HOST-FN-NAME", 1, 0, false);
    declareFunction(myName, "defstruct_type_var", "DEFSTRUCT-TYPE-VAR", 1, 0, false);
    declareFunction(myName, "defstruct_slot_keywords", "DEFSTRUCT-SLOT-KEYWORDS", 1, 0, false);
    declareFunction(myName, "defstruct_getters", "DEFSTRUCT-GETTERS", 2, 0, false);
    declareFunction(myName, "defstruct_getter", "DEFSTRUCT-GETTER", 2, 0, false);
    declareFunction(myName, "defstruct_setters", "DEFSTRUCT-SETTERS", 1, 0, false);
    declareFunction(myName, "defstruct_setter", "DEFSTRUCT-SETTER", 1, 0, false);
    declareFunction(myName, "getter_package", "GETTER-PACKAGE", 1, 0, false);
    declareFunction(myName, "accessor_package", "ACCESSOR-PACKAGE", 1, 0, false);
    declareFunction(myName, "setter_from_accessor", "SETTER-FROM-ACCESSOR", 1, 0, false);
    declareFunction(myName, "defstruct_lisp_constructor", "DEFSTRUCT-LISP-CONSTRUCTOR", 1, 0, false);
    declareFunction(myName, "defstruct_expand", "DEFSTRUCT-EXPAND", 1, 0, false);
    declareMacro(myName, "_defstruct_object_p", "_DEFSTRUCT-OBJECT-P");
    declareMacro(myName, "_defstruct_get_slot", "_DEFSTRUCT-GET-SLOT");
    declareMacro(myName, "_defstruct_set_slot", "_DEFSTRUCT-SET-SLOT");
    declareMacro(myName, "_defstruct_construct", "_DEFSTRUCT-CONSTRUCT");
    declareFunction(myName, "defstruct_type_var_form", "DEFSTRUCT-TYPE-VAR-FORM", 3, 0, false);
    declareFunction(myName, "defstruct_print_method", "DEFSTRUCT-PRINT-METHOD", 2, 0, false);
    declareFunction(myName, "defstruct_print_forms", "DEFSTRUCT-PRINT-FORMS", 4, 0, false);
    declareFunction(myName, "defstruct_register_form", "DEFSTRUCT-REGISTER-FORM", 4, 0, false);
    declareFunction(myName, "defstruct_predicate_form", "DEFSTRUCT-PREDICATE-FORM", 4, 0, false);
    declareFunction(myName, "defstruct_predicate_arglist", "DEFSTRUCT-PREDICATE-ARGLIST", 1, 0, false);
    declareFunction(myName, "defstruct_predicate_variable", "DEFSTRUCT-PREDICATE-VARIABLE", 1, 0, false);
    declareFunction(myName, "defstruct_first_function_variable", "DEFSTRUCT-FIRST-FUNCTION-VARIABLE", 2, 0, false);
    declareFunction(myName, "defstruct_getter_forms", "DEFSTRUCT-GETTER-FORMS", 5, 0, false);
    declareFunction(myName, "defstruct_getter_form", "DEFSTRUCT-GETTER-FORM", 5, 0, false);
    declareFunction(myName, "defstruct_getter_arglist", "DEFSTRUCT-GETTER-ARGLIST", 1, 0, false);
    declareFunction(myName, "defstruct_getter_variable", "DEFSTRUCT-GETTER-VARIABLE", 1, 0, false);
    declareFunction(myName, "defstruct_setter_forms", "DEFSTRUCT-SETTER-FORMS", 5, 0, false);
    declareFunction(myName, "defstruct_setter_form", "DEFSTRUCT-SETTER-FORM", 5, 0, false);
    declareFunction(myName, "defstruct_setter_arglist", "DEFSTRUCT-SETTER-ARGLIST", 1, 0, false);
    declareFunction(myName, "defstruct_def_csetf_forms", "DEFSTRUCT-DEF-CSETF-FORMS", 2, 0, false);
    declareFunction(myName, "defstruct_constructor_form", "DEFSTRUCT-CONSTRUCTOR-FORM", 6, 0, false);
    declareFunction(myName, "defstruct_constructor_arglist", "DEFSTRUCT-CONSTRUCTOR-ARGLIST", 1, 0, false);
    declareFunction(myName, "defstruct_constructor_arglist_handler", "DEFSTRUCT-CONSTRUCTOR-ARGLIST-HANDLER", 4, 0, false);
    declareFunction(myName, "defstruct_host_function", "DEFSTRUCT-HOST-FUNCTION", 5, 0, false);
    declareFunction(myName, "defstruct_host_arglist", "DEFSTRUCT-HOST-ARGLIST", 0, 0, false);
    declareMacro(myName, "with_call_profiling", "WITH-CALL-PROFILING");
    declareFunction(myName, "possibly_note_function_entry", "POSSIBLY-NOTE-FUNCTION-ENTRY", 1, 0, false);
    declareFunction(myName, "initialize_call_profiling_table", "INITIALIZE-CALL-PROFILING-TABLE", 0, 0, false);
    declareFunction(myName, "finalize_call_profiling_table", "FINALIZE-CALL-PROFILING-TABLE", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_complex_special_forms_file() {
    $polymorphic_type_hierarchy$ = defparameter("*POLYMORPHIC-TYPE-HIERARCHY*", $list13);
    $call_profiling_enabledP$ = defvar("*CALL-PROFILING-ENABLED?*", NIL);
    $call_profiling_table$ = defvar("*CALL-PROFILING-TABLE*", NIL);
    return NIL;
  }

  public static final SubLObject setup_complex_special_forms_file() {
    // CVS_ID("Id");
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(makeSymbol("NAME"), makeSymbol("LAMBDA-LIST"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLString $str1$METHOD_FUNCTION = makeString("METHOD-FUNCTION");
  public static final SubLSymbol $sym2$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $sym3$DEFLEXICAL = makeSymbol("DEFLEXICAL");
  public static final SubLList $list4 = list(list(makeSymbol("MAKE-VECTOR"), makeInteger(256), NIL));
  public static final SubLSymbol $sym5$DEFINE = makeSymbol("DEFINE");
  public static final SubLSymbol $sym6$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym7$_METHOD = makeSymbol("_METHOD");
  public static final SubLSymbol $sym8$PWHEN = makeSymbol("PWHEN");
  public static final SubLSymbol $sym9$RET = makeSymbol("RET");
  public static final SubLSymbol $sym10$FUNCALL = makeSymbol("FUNCALL");
  public static final SubLSymbol $sym11$DECLAIM = makeSymbol("DECLAIM");
  public static final SubLSymbol $sym12$OPTIMIZE_FUNCALL = makeSymbol("OPTIMIZE-FUNCALL");
  public static final SubLList $list13 = list(list(makeString("INTEGER"), list(makeSymbol("FIXNUM"), makeSymbol("BIGNUM"))), list(makeString("NUMBER"), list(makeSymbol("FIXNUM"), makeSymbol("BIGNUM"), makeSymbol("FLOAT"))), list(makeString("SEQUENCE"), list(makeSymbol("CONS"), makeSymbol("VECTOR"), makeSymbol("STRING"))));
  public static final SubLSymbol $sym14$_REGISTER_METHOD = makeSymbol("_REGISTER-METHOD");
  public static final SubLSymbol $sym15$FUNCTION = makeSymbol("FUNCTION");
  public static final SubLSymbol $sym16$STRING_ = makeSymbol("STRING=");
  public static final SubLString $str17$_ = makeString("*");
  public static final SubLString $str18$_METHOD_TABLE_ = makeString("-METHOD-TABLE*");
  public static final SubLString $str19$_ = makeString("-");
  public static final SubLString $str20$_METHOD = makeString("-METHOD");
  public static final SubLString $str21$_DTP_ = makeString("*DTP-");
  public static final SubLSymbol $sym22$_OPTIONAL = makeSymbol("&OPTIONAL");
  public static final SubLSymbol $sym23$_REST = makeSymbol("&REST");
  public static final SubLList $list24 = list(list(makeSymbol("NAME"), makeSymbol("&REST"), makeSymbol("OPTIONS")), makeSymbol("&BODY"), makeSymbol("SLOTS"));
  public static final SubLSymbol $sym25$SYMBOLP = makeSymbol("SYMBOLP");
  public static final SubLSymbol $kw26$CONC_NAME = makeKeyword("CONC-NAME");
  public static final SubLSymbol $kw27$PRINT_FUNCTION = makeKeyword("PRINT-FUNCTION");
  public static final SubLSymbol $kw28$C_STRUCTURE_TAG = makeKeyword("C-STRUCTURE-TAG");
  public static final SubLSymbol $kw29$GENERATE_VISIT_FUNCTION_ = makeKeyword("GENERATE-VISIT-FUNCTION?");
  public static final SubLSymbol $kw30$NAME = makeKeyword("NAME");
  public static final SubLSymbol $kw31$HOST_FN_NAME = makeKeyword("HOST-FN-NAME");
  public static final SubLSymbol $kw32$PREDICATE = makeKeyword("PREDICATE");
  public static final SubLSymbol $kw33$CONSTRUCTOR = makeKeyword("CONSTRUCTOR");
  public static final SubLSymbol $kw34$TYPE_VAR = makeKeyword("TYPE-VAR");
  public static final SubLSymbol $kw35$SLOTS = makeKeyword("SLOTS");
  public static final SubLSymbol $kw36$SLOT_KEYWORDS = makeKeyword("SLOT-KEYWORDS");
  public static final SubLSymbol $kw37$GETTERS = makeKeyword("GETTERS");
  public static final SubLSymbol $kw38$SETTERS = makeKeyword("SETTERS");
  public static final SubLString $str39$_P = makeString("-P");
  public static final SubLString $str40$MAKE_ = makeString("MAKE-");
  public static final SubLString $str41$VISIT_DEFSTRUCT_ = makeString("VISIT-DEFSTRUCT-");
  public static final SubLString $str42$_CSETF_ = makeString("_CSETF-");
  public static final SubLString $str43$CYC = makeString("CYC");
  public static final SubLString $str44$SUBLISP = makeString("SUBLISP");
  public static final SubLString $str45$_1 = makeString("-1");
  public static final SubLList $list46 = list(new SubLObject[] {makeSymbol("&KEY"), makeSymbol("NAME"), makeSymbol("CONC-NAME"), makeSymbol("PRINT-FUNCTION"), makeSymbol("C-STRUCTURE-TAG"), makeSymbol("GENERATE-VISIT-FUNCTION?"), makeSymbol("PREDICATE"), makeSymbol("CONSTRUCTOR"), makeSymbol("HOST-FN-NAME"), makeSymbol("TYPE-VAR"), makeSymbol("SLOTS"), makeSymbol("SLOT-KEYWORDS"), makeSymbol("GETTERS"), makeSymbol("SETTERS")});
  public static final SubLList $list47 = list(new SubLObject[] {makeKeyword("NAME"), makeKeyword("CONC-NAME"), makeKeyword("PRINT-FUNCTION"), makeKeyword("C-STRUCTURE-TAG"), makeKeyword("GENERATE-VISIT-FUNCTION?"), makeKeyword("PREDICATE"), makeKeyword("CONSTRUCTOR"), makeKeyword("HOST-FN-NAME"), makeKeyword("TYPE-VAR"), makeKeyword("SLOTS"), makeKeyword("SLOT-KEYWORDS"), makeKeyword("GETTERS"), makeKeyword("SETTERS")});
  public static final SubLSymbol $kw48$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw49$SL2JAVA = makeKeyword("SL2JAVA");
  public static final SubLSymbol $sym50$QUOTE = makeSymbol("QUOTE");
  public static final SubLList $list51 = list(makeSymbol("PROGN"));
  public static final SubLList $list52 = list(makeSymbol("OBJECT"), makeSymbol("C-STRUCTURE-TAG"), makeSymbol("TYPE-VAR"), makeSymbol("TYPE"));
  public static final SubLSymbol $sym53$_STRUCTURE_TYPE = makeSymbol("_STRUCTURE-TYPE");
  public static final SubLSymbol $sym54$CAND = makeSymbol("CAND");
  public static final SubLSymbol $sym55$_STRUCTURES_BAG_P = makeSymbol("_STRUCTURES-BAG-P");
  public static final SubLSymbol $sym56$_STRUCTURE_SLOT = makeSymbol("_STRUCTURE-SLOT");
  public static final SubLList $list57 = list(ONE_INTEGER);
  public static final SubLList $list58 = list(makeSymbol("OBJECT"), makeSymbol("INDEX"), makeSymbol("TYPE"), makeSymbol("SLOT"));
  public static final SubLList $list59 = list(makeSymbol("OBJECT"), makeSymbol("INDEX"), makeSymbol("VALUE"), makeSymbol("TYPE"), makeSymbol("SLOT"));
  public static final SubLSymbol $sym60$_SET_STRUCTURE_SLOT = makeSymbol("_SET-STRUCTURE-SLOT");
  public static final SubLList $list61 = list(makeSymbol("C-STRUCTURE-TAG"), makeSymbol("SIZE"), makeSymbol("TYPE-VAR"), makeSymbol("TYPE"));
  public static final SubLSymbol $sym62$_CLEAR_STRUCTURE = makeSymbol("_CLEAR-STRUCTURE");
  public static final SubLSymbol $sym63$_NEW_STRUCTURE = makeSymbol("_NEW-STRUCTURE");
  public static final SubLSymbol $sym64$_CLEAR_SUB_STRUCTURE = makeSymbol("_CLEAR-SUB-STRUCTURE");
  public static final SubLSymbol $sym65$_DTP_STRUCTURES_BAG_ = makeSymbol("*DTP-STRUCTURES-BAG*");
  public static final SubLSymbol $sym66$DEFCONSTANT = makeSymbol("DEFCONSTANT");
  public static final SubLString $str67$_PRINT_FUNCTION_TRAMPOLINE = makeString("-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym68$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
  public static final SubLSymbol $sym69$FACCESS = makeSymbol("FACCESS");
  public static final SubLSymbol $sym70$PRIVATE = makeSymbol("PRIVATE");
  public static final SubLList $list71 = list(makeSymbol("OBJECT"), makeSymbol("STREAM"));
  public static final SubLList $list72 = list(makeSymbol("OBJECT"), makeSymbol("STREAM"), ZERO_INTEGER);
  public static final SubLSymbol $sym73$_PRINT_OBJECT_METHOD_TABLE_ = makeSymbol("*PRINT-OBJECT-METHOD-TABLE*");
  public static final SubLSymbol $sym74$_REGISTER_DEFSTRUCT = makeSymbol("_REGISTER-DEFSTRUCT");
  public static final SubLSymbol $sym75$_DEFSTRUCT_OBJECT_P = makeSymbol("_DEFSTRUCT-OBJECT-P");
  public static final SubLSymbol $sym76$OBJECT = makeSymbol("OBJECT");
  public static final SubLSymbol $sym77$CHECK_TYPE = makeSymbol("CHECK-TYPE");
  public static final SubLSymbol $sym78$_DEFSTRUCT_GET_SLOT = makeSymbol("_DEFSTRUCT-GET-SLOT");
  public static final SubLSymbol $sym79$_DEFSTRUCT_SET_SLOT = makeSymbol("_DEFSTRUCT-SET-SLOT");
  public static final SubLList $list80 = list(makeSymbol("OBJECT"), makeSymbol("VALUE"));
  public static final SubLSymbol $sym81$_DEF_CSETF = makeSymbol("_DEF-CSETF");
  public static final SubLSymbol $sym82$NEW = makeSymbol("NEW");
  public static final SubLSymbol $sym83$_DEFSTRUCT_CONSTRUCT = makeSymbol("_DEFSTRUCT-CONSTRUCT");
  public static final SubLList $list84 = list(makeSymbol("&OPTIONAL"), makeSymbol("ARGLIST"));
  public static final SubLString $str85$CURRENT_VALUE = makeString("CURRENT-VALUE");
  public static final SubLString $str86$CURRENT_ARG = makeString("CURRENT-ARG");
  public static final SubLString $str87$NEXT = makeString("NEXT");
  public static final SubLSymbol $sym88$OTHERWISE = makeSymbol("OTHERWISE");
  public static final SubLSymbol $sym89$ERROR = makeSymbol("ERROR");
  public static final SubLString $str90$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLSymbol $sym91$CDO = makeSymbol("CDO");
  public static final SubLSymbol $sym92$CDDR = makeSymbol("CDDR");
  public static final SubLSymbol $sym93$NULL = makeSymbol("NULL");
  public static final SubLSymbol $sym94$CAR = makeSymbol("CAR");
  public static final SubLSymbol $sym95$CADR = makeSymbol("CADR");
  public static final SubLSymbol $sym96$PCASE = makeSymbol("PCASE");
  public static final SubLSymbol $kw97$BEGIN = makeKeyword("BEGIN");
  public static final SubLSymbol $kw98$SLOT = makeKeyword("SLOT");
  public static final SubLSymbol $kw99$END = makeKeyword("END");
  public static final SubLSymbol $sym100$DEFINE_METHOD = makeSymbol("DEFINE-METHOD");
  public static final SubLSymbol $sym101$VISIT_DEFSTRUCT_OBJECT = makeSymbol("VISIT-DEFSTRUCT-OBJECT");
  public static final SubLSymbol $sym102$OBJ = makeSymbol("OBJ");
  public static final SubLList $list103 = list(makeSymbol("VISITOR-FN"));
  public static final SubLList $list104 = list(makeSymbol("OBJ"), makeSymbol("VISITOR-FN"));
  public static final SubLList $list105 = list(makeSymbol("PLACE"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list106 = list(list(makeSymbol("*CALL-PROFILING-TABLE*"), list(makeSymbol("INITIALIZE-CALL-PROFILING-TABLE"))), list(makeSymbol("*CALL-PROFILING-ENABLED?*"), T));
  public static final SubLSymbol $sym107$CUNWIND_PROTECT = makeSymbol("CUNWIND-PROTECT");
  public static final SubLSymbol $sym108$CSETF = makeSymbol("CSETF");
  public static final SubLList $list109 = list(list(makeSymbol("FINALIZE-CALL-PROFILING-TABLE"), makeSymbol("*CALL-PROFILING-TABLE*")));
  public static final SubLInteger $int110$1000 = makeInteger(1000);
  public static final SubLSymbol $sym111$_ = makeSymbol(">");
  public static final SubLSymbol $sym112$CDR = makeSymbol("CDR");

  //// Initializers

  public void declareFunctions() {
    declare_complex_special_forms_file();
  }

  public void initializeVariables() {
    init_complex_special_forms_file();
  }

  public void runTopLevelForms() {
    setup_complex_special_forms_file();
  }

}
