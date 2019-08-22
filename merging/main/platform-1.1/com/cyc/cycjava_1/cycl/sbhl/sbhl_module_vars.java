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

package com.cyc.cycjava_1.cycl.sbhl;
 import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.dictionary;
//dm import com.cyc.cycjava_1.cycl.dictionary_contents;
//dm import com.cyc.cycjava_1.cycl.forts;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.meta_macros;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_utilities;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_paranoia;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class sbhl_module_vars extends SubLTranslatedFile {

  //// Constructor

  private sbhl_module_vars() {}
  public static final SubLFile me = new sbhl_module_vars();
  public static final String myName = "com.cyc.cycjava_1.cycl.sbhl.sbhl_module_vars";

  //// Definitions

  public static final class $sbhl_module_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $link_pred; }
    public SubLObject getField3() { return $accessible_link_preds; }
    public SubLObject getField4() { return $graph; }
    public SubLObject getField5() { return $link_style; }
    public SubLObject getField6() { return $index_arg; }
    public SubLObject getField7() { return $module_type; }
    public SubLObject getField8() { return $type_test; }
    public SubLObject getField9() { return $path_terminating_mark_fn; }
    public SubLObject getField10() { return $marking_fn; }
    public SubLObject getField11() { return $unmarking_fn; }
    public SubLObject getField12() { return $var_bindings; }
    public SubLObject getField13() { return $misc_properties; }
    public SubLObject setField2(SubLObject value) { return $link_pred = value; }
    public SubLObject setField3(SubLObject value) { return $accessible_link_preds = value; }
    public SubLObject setField4(SubLObject value) { return $graph = value; }
    public SubLObject setField5(SubLObject value) { return $link_style = value; }
    public SubLObject setField6(SubLObject value) { return $index_arg = value; }
    public SubLObject setField7(SubLObject value) { return $module_type = value; }
    public SubLObject setField8(SubLObject value) { return $type_test = value; }
    public SubLObject setField9(SubLObject value) { return $path_terminating_mark_fn = value; }
    public SubLObject setField10(SubLObject value) { return $marking_fn = value; }
    public SubLObject setField11(SubLObject value) { return $unmarking_fn = value; }
    public SubLObject setField12(SubLObject value) { return $var_bindings = value; }
    public SubLObject setField13(SubLObject value) { return $misc_properties = value; }
    public SubLObject $link_pred = NIL;
    public SubLObject $accessible_link_preds = NIL;
    public SubLObject $graph = NIL;
    public SubLObject $link_style = NIL;
    public SubLObject $index_arg = NIL;
    public SubLObject $module_type = NIL;
    public SubLObject $type_test = NIL;
    public SubLObject $path_terminating_mark_fn = NIL;
    public SubLObject $marking_fn = NIL;
    public SubLObject $unmarking_fn = NIL;
    public SubLObject $var_bindings = NIL;
    public SubLObject $misc_properties = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($sbhl_module_native.class, $sym0$SBHL_MODULE, $sym1$SBHL_MODULE_P, $list2, $list3, new String[] {"$link_pred", "$accessible_link_preds", "$graph", "$link_style", "$index_arg", "$module_type", "$type_test", "$path_terminating_mark_fn", "$marking_fn", "$unmarking_fn", "$var_bindings", "$misc_properties"}, $list4, $list5, $sym6$PRINT_SBHL_MODULE);
  }

  @SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 1257) 
  public static SubLSymbol $dtp_sbhl_module$ = null;

  @SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 1257) 
  public static final SubLObject sbhl_module_p(SubLObject object) {
    return ((object.getClass() == $sbhl_module_native.class) ? ((SubLObject) T) : NIL);
  }

  public static final class $sbhl_module_p$UnaryFunction extends UnaryFunction {
    public $sbhl_module_p$UnaryFunction() { super(extractFunctionNamed("SBHL-MODULE-P")); }
    public SubLObject processItem(SubLObject arg1) { return sbhl_module_p(arg1); }
  }

  @SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 1257) 
  public static final SubLObject sbhl_mod_link_pred(SubLObject object) {
    checkType(object, $sym1$SBHL_MODULE_P);
    return object.getField2();
  }

  @SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 1257) 
  public static final SubLObject sbhl_mod_accessible_link_preds(SubLObject object) {
    checkType(object, $sym1$SBHL_MODULE_P);
    return object.getField3();
  }

  @SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 1257) 
  public static final SubLObject sbhl_mod_graph(SubLObject object) {
    checkType(object, $sym1$SBHL_MODULE_P);
    return object.getField4();
  }

  @SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 1257) 
  public static final SubLObject sbhl_mod_link_style(SubLObject object) {
    checkType(object, $sym1$SBHL_MODULE_P);
    return object.getField5();
  }

  @SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 1257) 
  public static final SubLObject sbhl_mod_index_arg(SubLObject object) {
    checkType(object, $sym1$SBHL_MODULE_P);
    return object.getField6();
  }

  @SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 1257) 
  public static final SubLObject sbhl_mod_module_type(SubLObject object) {
    checkType(object, $sym1$SBHL_MODULE_P);
    return object.getField7();
  }

  @SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 1257) 
  public static final SubLObject sbhl_mod_type_test(SubLObject object) {
    checkType(object, $sym1$SBHL_MODULE_P);
    return object.getField8();
  }

  @SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 1257) 
  public static final SubLObject sbhl_mod_path_terminating_mark_fn(SubLObject object) {
    checkType(object, $sym1$SBHL_MODULE_P);
    return object.getField9();
  }

  @SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 1257) 
  public static final SubLObject sbhl_mod_marking_fn(SubLObject object) {
    checkType(object, $sym1$SBHL_MODULE_P);
    return object.getField10();
  }

  @SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 1257) 
  public static final SubLObject sbhl_mod_unmarking_fn(SubLObject object) {
    checkType(object, $sym1$SBHL_MODULE_P);
    return object.getField11();
  }

  @SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 1257) 
  public static final SubLObject sbhl_mod_misc_properties(SubLObject object) {
    checkType(object, $sym1$SBHL_MODULE_P);
    return object.getField13();
  }

  @SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 1257) 
  public static final SubLObject _csetf_sbhl_mod_link_pred(SubLObject object, SubLObject value) {
    checkType(object, $sym1$SBHL_MODULE_P);
    return object.setField2(value);
  }

  @SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 1257) 
  public static final SubLObject _csetf_sbhl_mod_accessible_link_preds(SubLObject object, SubLObject value) {
    checkType(object, $sym1$SBHL_MODULE_P);
    return object.setField3(value);
  }

  @SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 1257) 
  public static final SubLObject _csetf_sbhl_mod_graph(SubLObject object, SubLObject value) {
    checkType(object, $sym1$SBHL_MODULE_P);
    return object.setField4(value);
  }

  @SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 1257) 
  public static final SubLObject _csetf_sbhl_mod_link_style(SubLObject object, SubLObject value) {
    checkType(object, $sym1$SBHL_MODULE_P);
    return object.setField5(value);
  }

  @SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 1257) 
  public static final SubLObject _csetf_sbhl_mod_index_arg(SubLObject object, SubLObject value) {
    checkType(object, $sym1$SBHL_MODULE_P);
    return object.setField6(value);
  }

  @SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 1257) 
  public static final SubLObject _csetf_sbhl_mod_module_type(SubLObject object, SubLObject value) {
    checkType(object, $sym1$SBHL_MODULE_P);
    return object.setField7(value);
  }

  @SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 1257) 
  public static final SubLObject _csetf_sbhl_mod_type_test(SubLObject object, SubLObject value) {
    checkType(object, $sym1$SBHL_MODULE_P);
    return object.setField8(value);
  }

  @SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 1257) 
  public static final SubLObject _csetf_sbhl_mod_path_terminating_mark_fn(SubLObject object, SubLObject value) {
    checkType(object, $sym1$SBHL_MODULE_P);
    return object.setField9(value);
  }

  @SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 1257) 
  public static final SubLObject _csetf_sbhl_mod_marking_fn(SubLObject object, SubLObject value) {
    checkType(object, $sym1$SBHL_MODULE_P);
    return object.setField10(value);
  }

  @SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 1257) 
  public static final SubLObject _csetf_sbhl_mod_unmarking_fn(SubLObject object, SubLObject value) {
    checkType(object, $sym1$SBHL_MODULE_P);
    return object.setField11(value);
  }

  @SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 1257) 
  public static final SubLObject _csetf_sbhl_mod_misc_properties(SubLObject object, SubLObject value) {
    checkType(object, $sym1$SBHL_MODULE_P);
    return object.setField13(value);
  }

  @SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 1257) 
  public static final SubLObject make_sbhl_module(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $sbhl_module_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw32$LINK_PRED)) {
            _csetf_sbhl_mod_link_pred(v_new, current_value);
          } else if (pcase_var.eql($kw33$ACCESSIBLE_LINK_PREDS)) {
            _csetf_sbhl_mod_accessible_link_preds(v_new, current_value);
          } else if (pcase_var.eql($kw34$GRAPH)) {
            _csetf_sbhl_mod_graph(v_new, current_value);
          } else if (pcase_var.eql($kw35$LINK_STYLE)) {
            _csetf_sbhl_mod_link_style(v_new, current_value);
          } else if (pcase_var.eql($kw36$INDEX_ARG)) {
            _csetf_sbhl_mod_index_arg(v_new, current_value);
          } else if (pcase_var.eql($kw37$MODULE_TYPE)) {
            _csetf_sbhl_mod_module_type(v_new, current_value);
          } else if (pcase_var.eql($kw38$TYPE_TEST)) {
            _csetf_sbhl_mod_type_test(v_new, current_value);
          } else if (pcase_var.eql($kw39$PATH_TERMINATING_MARK_FN)) {
            _csetf_sbhl_mod_path_terminating_mark_fn(v_new, current_value);
          } else if (pcase_var.eql($kw40$MARKING_FN)) {
            _csetf_sbhl_mod_marking_fn(v_new, current_value);
          } else if (pcase_var.eql($kw41$UNMARKING_FN)) {
            _csetf_sbhl_mod_unmarking_fn(v_new, current_value);
          } else if (pcase_var.eql($kw42$VAR_BINDINGS)) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2753");
          } else if (pcase_var.eql($kw43$MISC_PROPERTIES)) {
            _csetf_sbhl_mod_misc_properties(v_new, current_value);
          } else {
            Errors.error($str44$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  @SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 2630) 
  public static final SubLObject new_sbhl_module(SubLObject pred) {
    checkType(pred, $sym47$FORT_P);
    {
      SubLObject module = make_sbhl_module(UNPROVIDED);
      _csetf_sbhl_mod_link_pred(module, pred);
      _csetf_sbhl_mod_misc_properties(module, dictionary.new_dictionary(EQ, ZERO_INTEGER));
      return module;
    }
  }

  @SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 2870) 
  public static final SubLObject set_sbhl_module_property(SubLObject module, SubLObject property, SubLObject value) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
        if ((NIL == sbhl_module_property_p(property))) {
          {
            SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($kw48$ERROR)) {
              sbhl_paranoia.sbhl_error(ONE_INTEGER, $str49$_A_is_not_a__A, property, $sym50$SBHL_MODULE_PROPERTY_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else if (pcase_var.eql($kw51$CERROR)) {
              Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2198");
            } else if (pcase_var.eql($kw53$WARN)) {
              Errors.warn($str49$_A_is_not_a__A, property, $sym50$SBHL_MODULE_PROPERTY_P);
            } else {
              Errors.warn($str54$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
              Errors.cerror($str52$continue_anyway, $str49$_A_is_not_a__A, property, $sym50$SBHL_MODULE_PROPERTY_P);
            }
          }
        }
      }
      if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
        if ((NIL == sbhl_module_p(module))) {
          {
            SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($kw48$ERROR)) {
              sbhl_paranoia.sbhl_error(ONE_INTEGER, $str49$_A_is_not_a__A, module, $sym1$SBHL_MODULE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else if (pcase_var.eql($kw51$CERROR)) {
              Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2199");
            } else if (pcase_var.eql($kw53$WARN)) {
              Errors.warn($str49$_A_is_not_a__A, module, $sym1$SBHL_MODULE_P);
            } else {
              Errors.warn($str54$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
              Errors.cerror($str52$continue_anyway, $str49$_A_is_not_a__A, module, $sym1$SBHL_MODULE_P);
            }
          }
        }
      }
      {
        SubLObject pcase_var = property;
        if (pcase_var.eql($kw32$LINK_PRED)) {
          _csetf_sbhl_mod_link_pred(module, value);
        } else if (pcase_var.eql($kw33$ACCESSIBLE_LINK_PREDS)) {
          _csetf_sbhl_mod_accessible_link_preds(module, value);
        } else if (pcase_var.eql($kw34$GRAPH)) {
          _csetf_sbhl_mod_graph(module, value);
        } else if (pcase_var.eql($kw35$LINK_STYLE)) {
          _csetf_sbhl_mod_link_style(module, value);
        } else if (pcase_var.eql($kw36$INDEX_ARG)) {
          _csetf_sbhl_mod_index_arg(module, value);
        } else if (pcase_var.eql($kw37$MODULE_TYPE)) {
          _csetf_sbhl_mod_module_type(module, value);
        } else if (pcase_var.eql($kw38$TYPE_TEST)) {
          _csetf_sbhl_mod_type_test(module, value);
        } else if (pcase_var.eql($kw55$PATH_TERMINATING_MARK__FN)) {
          _csetf_sbhl_mod_path_terminating_mark_fn(module, value);
        } else if (pcase_var.eql($kw40$MARKING_FN)) {
          _csetf_sbhl_mod_marking_fn(module, value);
        } else if (pcase_var.eql($kw41$UNMARKING_FN)) {
          _csetf_sbhl_mod_unmarking_fn(module, value);
        } else {
          dictionary.dictionary_enter(sbhl_mod_misc_properties(module), property, value);
        }
      }
      return module;
    }
  }

  @SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 3996) 
  public static final SubLObject get_sbhl_module_property(SubLObject module, SubLObject property) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
        if ((NIL == sbhl_module_p(module))) {
          {
            SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($kw48$ERROR)) {
              sbhl_paranoia.sbhl_error(ONE_INTEGER, $str49$_A_is_not_a__A, module, $sym1$SBHL_MODULE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else if (pcase_var.eql($kw51$CERROR)) {
              Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2200");
            } else if (pcase_var.eql($kw53$WARN)) {
              Errors.warn($str49$_A_is_not_a__A, module, $sym1$SBHL_MODULE_P);
            } else {
              Errors.warn($str54$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
              Errors.cerror($str52$continue_anyway, $str49$_A_is_not_a__A, module, $sym1$SBHL_MODULE_P);
            }
          }
        }
      }
      {
        SubLObject pcase_var = property;
        if (pcase_var.eql($kw32$LINK_PRED)) {
          return sbhl_mod_link_pred(module);
        } else if (pcase_var.eql($kw33$ACCESSIBLE_LINK_PREDS)) {
          return sbhl_mod_accessible_link_preds(module);
        } else if (pcase_var.eql($kw34$GRAPH)) {
          return sbhl_mod_graph(module);
        } else if (pcase_var.eql($kw35$LINK_STYLE)) {
          return sbhl_mod_link_style(module);
        } else if (pcase_var.eql($kw36$INDEX_ARG)) {
          return sbhl_mod_index_arg(module);
        } else if (pcase_var.eql($kw37$MODULE_TYPE)) {
          return sbhl_mod_module_type(module);
        } else if (pcase_var.eql($kw38$TYPE_TEST)) {
          return sbhl_mod_type_test(module);
        } else if (pcase_var.eql($kw55$PATH_TERMINATING_MARK__FN)) {
          return sbhl_mod_path_terminating_mark_fn(module);
        } else if (pcase_var.eql($kw40$MARKING_FN)) {
          return sbhl_mod_marking_fn(module);
        } else if (pcase_var.eql($kw41$UNMARKING_FN)) {
          return sbhl_mod_unmarking_fn(module);
        } else {
          return dictionary.dictionary_lookup_without_values(sbhl_mod_misc_properties(module), property, UNPROVIDED);
        }
      }
    }
  }

  /** Accessor. @return  . Returns the  associated with MODULE. */
  @SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 5038) 
  public static final SubLObject get_sbhl_module_link_pred(SubLObject module) {
    checkType(module, $sym1$SBHL_MODULE_P);
    return sbhl_mod_link_pred(module);
  }

  /** Accessor. @return  . Returns the  associated with MODULE. */
  @SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 5227) 
  public static final SubLObject get_sbhl_module_accessible_link_preds(SubLObject module) {
    checkType(module, $sym1$SBHL_MODULE_P);
    return sbhl_mod_accessible_link_preds(module);
  }

  /** Accessor. @return  . Returns the  associated with MODULE. */
  @SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 5440) 
  public static final SubLObject get_sbhl_module_graph(SubLObject module) {
    checkType(module, $sym1$SBHL_MODULE_P);
    return sbhl_mod_graph(module);
  }

  /** Accessor. @return  . Returns the  associated with MODULE. */
  @SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 5621) 
  public static final SubLObject get_sbhl_module_link_style(SubLObject module) {
    checkType(module, $sym1$SBHL_MODULE_P);
    return sbhl_mod_link_style(module);
  }

  /** Accessor. @return  . Returns the  associated with MODULE. */
  @SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 5812) 
  public static final SubLObject get_sbhl_module_index_arg(SubLObject module) {
    checkType(module, $sym1$SBHL_MODULE_P);
    return sbhl_mod_index_arg(module);
  }

  /** Accessor. @return  . Returns the  associated with MODULE. */
  @SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 6001) 
  public static final SubLObject get_sbhl_module_module_type(SubLObject module) {
    checkType(module, $sym1$SBHL_MODULE_P);
    return sbhl_mod_module_type(module);
  }

  /** Accessor. @return  . Returns the  associated with MODULE. */
  @SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 6194) 
  public static final SubLObject get_sbhl_module_type_test(SubLObject module) {
    checkType(module, $sym1$SBHL_MODULE_P);
    return sbhl_mod_type_test(module);
  }

  /** Accessor. @return  . Returns the  associated with MODULE. */
  @SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 6383) 
  public static final SubLObject get_sbhl_module_path_terminating_mark(SubLObject module) {
    checkType(module, $sym1$SBHL_MODULE_P);
    return sbhl_mod_path_terminating_mark_fn(module);
  }

  /** Accessor. @return  . Returns the  associated with MODULE. */
  @SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 6599) 
  public static final SubLObject get_sbhl_module_marking_fn(SubLObject module) {
    checkType(module, $sym1$SBHL_MODULE_P);
    return sbhl_mod_marking_fn(module);
  }

  /** Accessor. @return  . Returns the  associated with MODULE. */
  @SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 6790) 
  public static final SubLObject get_sbhl_module_unmarking_fn(SubLObject module) {
    checkType(module, $sym1$SBHL_MODULE_P);
    return sbhl_mod_unmarking_fn(module);
  }

  @SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 6985) 
  private static SubLSymbol $sbhl_module_key_test$ = null;

  /** dictionary of sbhl modules, built up by module declaration */
  @SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 7179) 
  public static SubLSymbol $sbhl_modules$ = null;

  /** @return booleanp; whether OBJECT is a @see dictionary-p. */
  @SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 7357) 
  public static final SubLObject sbhl_module_object_p(SubLObject object) {
    return sbhl_module_p(object);
  }

  @SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 7499) 
  public static final SubLObject reset_sbhl_modules() {
    $sbhl_modules$.setGlobalValue(dictionary.new_dictionary($sbhl_module_key_test$.getGlobalValue(), UNPROVIDED));
    return NIL;
  }

  /** @return dictionary-p; the defined sbhl modules, which each correspond directly to link a link table. @see *sbhl-modules* */
  @SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 7710) 
  public static final SubLObject get_sbhl_modules() {
    return $sbhl_modules$.getGlobalValue();
  }

  /** modifier. enters MODULE into *sbhl-modules*. assumes *sbhl-modules* is a dictionary. checks that MODULE-KEY is a fort-p, and MODULE-DATA is a dictionary-p */
  @SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 7898) 
  public static final SubLObject add_sbhl_module(SubLObject predicate, SubLObject module) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
        if ((NIL == sbhl_predicate_object_p(predicate))) {
          {
            SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($kw48$ERROR)) {
              sbhl_paranoia.sbhl_error(ONE_INTEGER, $str49$_A_is_not_a__A, predicate, $sym57$SBHL_PREDICATE_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else if (pcase_var.eql($kw51$CERROR)) {
              Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2201");
            } else if (pcase_var.eql($kw53$WARN)) {
              Errors.warn($str49$_A_is_not_a__A, predicate, $sym57$SBHL_PREDICATE_OBJECT_P);
            } else {
              Errors.warn($str54$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
              Errors.cerror($str52$continue_anyway, $str49$_A_is_not_a__A, predicate, $sym57$SBHL_PREDICATE_OBJECT_P);
            }
          }
        }
      }
      if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
        if ((NIL == sbhl_module_object_p(module))) {
          {
            SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($kw48$ERROR)) {
              sbhl_paranoia.sbhl_error(ONE_INTEGER, $str49$_A_is_not_a__A, module, $sym58$SBHL_MODULE_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else if (pcase_var.eql($kw51$CERROR)) {
              Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2202");
            } else if (pcase_var.eql($kw53$WARN)) {
              Errors.warn($str49$_A_is_not_a__A, module, $sym58$SBHL_MODULE_OBJECT_P);
            } else {
              Errors.warn($str54$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
              Errors.cerror($str52$continue_anyway, $str49$_A_is_not_a__A, module, $sym58$SBHL_MODULE_OBJECT_P);
            }
          }
        }
      }
      dictionary.dictionary_enter($sbhl_modules$.getGlobalValue(), predicate, module);
      sbhl_module_utilities.clear_get_sbhl_predicates();
      return NIL;
    }
  }

  /** @return listp; the defined sbhl predicates. @see *sbhl-modules* */
  @SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 8801) 
  public static final SubLObject get_sbhl_predicates_int() {
    return dictionary.dictionary_keys(get_sbhl_modules());
  }

  /** Return what the sbhl module structures that the predicates point to. */
  @SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 8961) 
  public static final SubLObject get_sbhl_module_list() {
    return dictionary.dictionary_values(get_sbhl_modules());
  }

  /** Type test for candidate sbhl-predicates. */
  @SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 9125) 
  public static final SubLObject sbhl_predicate_object_p(SubLObject object) {
    return forts.fort_p(object);
  }

  /** Roles that sbhl modules play in the grand SBHL scheme. */
  @SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 9247) 
  public static SubLSymbol $sbhl_module_types$ = null;

  /** @return booleanp; whether MODULE-TYPE is of the simple transitive and reflexive variety. */
  @SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 9450) 
  public static final SubLObject sbhl_simple_reflexive_module_type_p(SubLObject module_type) {
    return Equality.eq(module_type, $kw65$SIMPLE_REFLEXIVE);
  }

  /** @return booleanp; whether MODULE-TYPE is of the simple transitive but irreflexive variety. */
  @SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 9656) 
  public static final SubLObject sbhl_simple_non_reflexive_module_type_p(SubLObject module_type) {
    return Equality.eq(module_type, $kw66$SIMPLE_NON_REFLEXIVE);
  }

  /** @return booleanp; whether MODULE-TYPE is the keyword for transfers-through sbhl modules. */
  @SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 9872) 
  public static final SubLObject sbhl_transfers_through_module_type_p(SubLObject module_type) {
    return Equality.eq(module_type, $kw67$TRANSFERS_THROUGH);
  }

  /** @return booleanp; whether MODULE-TYPE is the keyword for disjoins sbhl modules. */
  @SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 10082) 
  public static final SubLObject sbhl_disjoins_module_type_p(SubLObject module_type) {
    return Equality.eq(module_type, $kw68$DISJOINS);
  }

  /** @return booleanp; whether MODULE-TYPE is the keyword for sbhl time modules. */
  @SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 10263) 
  public static final SubLObject sbhl_time_module_type_p(SubLObject module_type) {
    return Equality.eq(module_type, $kw69$TIME);
  }

  /** @return booleanp; whether MODULE-TYPE is the keyword for simple sbhl modules, or for sbhl time modules. */
  @SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 10432) 
  public static final SubLObject sbhl_transitive_module_type_p(SubLObject module_type) {
    return makeBoolean(((module_type == $kw65$SIMPLE_REFLEXIVE)
          || (module_type == $kw66$SIMPLE_NON_REFLEXIVE)
          || (module_type == $kw69$TIME)));
  }

  /** the list of properties availible for each of the @see *sbhl-modules*.  Each key is a keyword. Each value field should be a functionp, corresponding for the test function for the sbhl module property associated with the key. */
  @SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 11891) 
  private static SubLSymbol $sbhl_module_properties$ = null;

  /** Modifier. used to store initial values for the @see *sbhl-module-properties* */
  @SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 12258) 
  public static final SubLObject init_sbhl_module_properties(SubLObject property_list) {
    {
      SubLObject cdolist_list_var = property_list;
      SubLObject property_test_pair = NIL;
      for (property_test_pair = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), property_test_pair = cdolist_list_var.first()) {
        {
          SubLObject property = property_test_pair.first();
          SubLObject test_fn = conses_high.second(property_test_pair);
          dictionary.dictionary_enter($sbhl_module_properties$.getGlobalValue(), property, test_fn);
        }
      }
    }
    return NIL;
  }

  /** @return booleanp; whether PROPERTY is a member of *sbhl-module-properties* */
  @SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 15806) 
  public static final SubLObject sbhl_module_property_p(SubLObject property) {
    return dictionary.dictionary_lookup_without_values($sbhl_module_properties$.getGlobalValue(), property, UNPROVIDED);
  }

  /** the list of required properties for each of the @see *sbhl-modules* */
  @SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 16260) 
  private static SubLSymbol $sbhl_module_required_properties$ = null;

  /** the current sbhl-module in use for link traversal */
  @SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 17175) 
  public static SubLSymbol $sbhl_module$ = null;

  /** Accessor: @return sbhl-module-p; the sbhl module for PREDICATE / defaults to *sbhl-module* */
  @SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 17400) 
  public static final SubLObject get_sbhl_module(SubLObject predicate) {
    if ((predicate == UNPROVIDED)) {
      predicate = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == predicate)) {
        return $sbhl_module$.getDynamicValue(thread);
      } else if (((NIL != sbhl_module_p($sbhl_module$.getDynamicValue(thread)))
           && (predicate == sbhl_module_utilities.get_sbhl_link_pred($sbhl_module$.getDynamicValue(thread))))) {
        return $sbhl_module$.getDynamicValue(thread);
      } else {
        {
          SubLObject module = dictionary.dictionary_lookup_without_values(get_sbhl_modules(), predicate, UNPROVIDED);
          if ((NIL == module)) {
            return sbhl_paranoia.sbhl_warn(ZERO_INTEGER, $str111$_A_is_not_a_valid_sbhl_predicate_, predicate, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
          } else {
            return module;
          }
        }
      }
    }
  }

  public static final class $get_sbhl_module$ZeroArityFunction extends ZeroArityFunction {
    public $get_sbhl_module$ZeroArityFunction() { super(extractFunctionNamed("GET-SBHL-MODULE")); }
    public SubLObject processItem() { return get_sbhl_module(UNPROVIDED); }
  }

  public static final class $get_sbhl_module$UnaryFunction extends UnaryFunction {
    public $get_sbhl_module$UnaryFunction() { super(extractFunctionNamed("GET-SBHL-MODULE")); }
    public SubLObject processItem(SubLObject arg1) { return get_sbhl_module(arg1); }
  }

  /** The parameters bound with each sbhl module. */
  @SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 18586) 
  public static SubLSymbol $sbhl_module_vars$ = null;

  /** the fort which is used to determine whether a predicate has directed links */
  @SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 18675) 
  public static SubLSymbol $fort_denoting_sbhl_directed_graph$ = null;

  /** the fort which is used to determine whether a predicate has undirected links */
  @SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 18912) 
  public static SubLSymbol $fort_denoting_sbhl_undirected_graph$ = null;

  /** Accessor: @return booleanp; whether FORT indicates a directed or undirected graph */
  @SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 19068) 
  public static final SubLObject fort_denotes_sbhl_directed_graph_p(SubLObject fort) {
    if ((fort == $fort_denoting_sbhl_directed_graph$.getGlobalValue())) {
      return T;
    } else if ((fort == $fort_denoting_sbhl_undirected_graph$.getGlobalValue())) {
      return NIL;
    } else if ((NIL != sbhl_paranoia.sbhl_error(ONE_INTEGER, $str118$Term___a__is_not_used_to_specify_, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
    }
    return NIL;
  }

  /** Assumption made for a collection, predicate, etc. that has no known
extent.   The two possible values are t (assume nonempty) and nil (assume nothing) */
  @SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 19731) 
  public static SubLSymbol $assume_sbhl_extensions_nonempty$ = null;

  @SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 20008) 
  public static final SubLObject clean_sbhl_modules() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(get_sbhl_modules()));
        while ((NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state))) {
          thread.resetMultipleValues();
          {
            SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            SubLObject module = thread.secondMultipleValue();
            thread.resetMultipleValues();
            {
              SubLObject predicate = sbhl_module_utilities.get_sbhl_link_pred(module);
              if ((NIL == forts.valid_fortP(predicate))) {
                Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2755");
              }
            }
            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
          }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
      }
      optimize_sbhl_modules();
      return NIL;
    }
  }

  @SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 20289) 
  private static SubLSymbol $sbhl_module_link_pred_preference_order$ = null;

  /** Optimize SBHL modules for access. */
  @SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 20357) 
  public static final SubLObject optimize_sbhl_modules() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject _prev_bind_0 = $sbhl_module_link_pred_preference_order$.currentBinding(thread);
        try {
          $sbhl_module_link_pred_preference_order$.bind(sbhl_module_link_pred_preference_order(), thread);
          dictionary.dictionary_optimize(get_sbhl_modules(), Symbols.symbol_function($sym119$SBHL_MODULES_LINK_PRED__));
        } finally {
          $sbhl_module_link_pred_preference_order$.rebind(_prev_bind_0, thread);
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 20620) 
  public static final SubLObject sbhl_modules_link_pred_L(SubLObject pred1, SubLObject pred2) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return list_utilities.position_L(pred1, pred2, $sbhl_module_link_pred_preference_order$.getDynamicValue(thread), Symbols.symbol_function(EQ), UNPROVIDED);
    }
  }

  @SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 20764) 
  public static final SubLObject sbhl_module_link_pred_preference_order() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject tuples = NIL;
        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(get_sbhl_modules()));
        while ((NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state))) {
          thread.resetMultipleValues();
          {
            SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            SubLObject module = thread.secondMultipleValue();
            thread.resetMultipleValues();
            {
              SubLObject link_pred = sbhl_module_utilities.get_sbhl_link_pred(module);
              SubLObject graph = sbhl_module_utilities.get_sbhl_graph(module);
              SubLObject graph_size = Hashtables.hash_table_size(graph);
              tuples = cons(list(link_pred, graph_size), tuples);
            }
            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
          }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        tuples = Sort.stable_sort(tuples, Symbols.symbol_function($sym120$_), Symbols.symbol_function($sym121$SECOND));
        {
          SubLObject link_preds = list_utilities.nmapcar(Symbols.symbol_function($sym122$FIRST), tuples);
          link_preds = cons($const123$genls, Sequences.delete($const123$genls, link_preds, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
          return link_preds;
        }
      }
    }
  }

  public static final SubLObject declare_sbhl_module_vars_file() {
    declareFunction("sbhl_module_print_function_trampoline", "SBHL-MODULE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction("sbhl_module_p", "SBHL-MODULE-P", 1, 0, false); new $sbhl_module_p$UnaryFunction();
    declareFunction("sbhl_mod_link_pred", "SBHL-MOD-LINK-PRED", 1, 0, false);
    declareFunction("sbhl_mod_accessible_link_preds", "SBHL-MOD-ACCESSIBLE-LINK-PREDS", 1, 0, false);
    declareFunction("sbhl_mod_graph", "SBHL-MOD-GRAPH", 1, 0, false);
    declareFunction("sbhl_mod_link_style", "SBHL-MOD-LINK-STYLE", 1, 0, false);
    declareFunction("sbhl_mod_index_arg", "SBHL-MOD-INDEX-ARG", 1, 0, false);
    declareFunction("sbhl_mod_module_type", "SBHL-MOD-MODULE-TYPE", 1, 0, false);
    declareFunction("sbhl_mod_type_test", "SBHL-MOD-TYPE-TEST", 1, 0, false);
    declareFunction("sbhl_mod_path_terminating_mark_fn", "SBHL-MOD-PATH-TERMINATING-MARK-FN", 1, 0, false);
    declareFunction("sbhl_mod_marking_fn", "SBHL-MOD-MARKING-FN", 1, 0, false);
    declareFunction("sbhl_mod_unmarking_fn", "SBHL-MOD-UNMARKING-FN", 1, 0, false);
    //declareFunction("sbhl_mod_var_bindings", "SBHL-MOD-VAR-BINDINGS", 1, 0, false);
    declareFunction("sbhl_mod_misc_properties", "SBHL-MOD-MISC-PROPERTIES", 1, 0, false);
    declareFunction("_csetf_sbhl_mod_link_pred", "_CSETF-SBHL-MOD-LINK-PRED", 2, 0, false);
    declareFunction("_csetf_sbhl_mod_accessible_link_preds", "_CSETF-SBHL-MOD-ACCESSIBLE-LINK-PREDS", 2, 0, false);
    declareFunction("_csetf_sbhl_mod_graph", "_CSETF-SBHL-MOD-GRAPH", 2, 0, false);
    declareFunction("_csetf_sbhl_mod_link_style", "_CSETF-SBHL-MOD-LINK-STYLE", 2, 0, false);
    declareFunction("_csetf_sbhl_mod_index_arg", "_CSETF-SBHL-MOD-INDEX-ARG", 2, 0, false);
    declareFunction("_csetf_sbhl_mod_module_type", "_CSETF-SBHL-MOD-MODULE-TYPE", 2, 0, false);
    declareFunction("_csetf_sbhl_mod_type_test", "_CSETF-SBHL-MOD-TYPE-TEST", 2, 0, false);
    declareFunction("_csetf_sbhl_mod_path_terminating_mark_fn", "_CSETF-SBHL-MOD-PATH-TERMINATING-MARK-FN", 2, 0, false);
    declareFunction("_csetf_sbhl_mod_marking_fn", "_CSETF-SBHL-MOD-MARKING-FN", 2, 0, false);
    declareFunction("_csetf_sbhl_mod_unmarking_fn", "_CSETF-SBHL-MOD-UNMARKING-FN", 2, 0, false);
    //declareFunction("_csetf_sbhl_mod_var_bindings", "_CSETF-SBHL-MOD-VAR-BINDINGS", 2, 0, false);
    declareFunction("_csetf_sbhl_mod_misc_properties", "_CSETF-SBHL-MOD-MISC-PROPERTIES", 2, 0, false);
    declareFunction("make_sbhl_module", "MAKE-SBHL-MODULE", 0, 1, false);
    //declareFunction("print_sbhl_module", "PRINT-SBHL-MODULE", 3, 0, false);
    declareFunction("new_sbhl_module", "NEW-SBHL-MODULE", 1, 0, false);
    declareFunction("set_sbhl_module_property", "SET-SBHL-MODULE-PROPERTY", 3, 0, false);
    declareFunction("get_sbhl_module_property", "GET-SBHL-MODULE-PROPERTY", 2, 0, false);
    declareFunction("get_sbhl_module_link_pred", "GET-SBHL-MODULE-LINK-PRED", 1, 0, false);
    declareFunction("get_sbhl_module_accessible_link_preds", "GET-SBHL-MODULE-ACCESSIBLE-LINK-PREDS", 1, 0, false);
    declareFunction("get_sbhl_module_graph", "GET-SBHL-MODULE-GRAPH", 1, 0, false);
    declareFunction("get_sbhl_module_link_style", "GET-SBHL-MODULE-LINK-STYLE", 1, 0, false);
    declareFunction("get_sbhl_module_index_arg", "GET-SBHL-MODULE-INDEX-ARG", 1, 0, false);
    declareFunction("get_sbhl_module_module_type", "GET-SBHL-MODULE-MODULE-TYPE", 1, 0, false);
    declareFunction("get_sbhl_module_type_test", "GET-SBHL-MODULE-TYPE-TEST", 1, 0, false);
    declareFunction("get_sbhl_module_path_terminating_mark", "GET-SBHL-MODULE-PATH-TERMINATING-MARK", 1, 0, false);
    declareFunction("get_sbhl_module_marking_fn", "GET-SBHL-MODULE-MARKING-FN", 1, 0, false);
    declareFunction("get_sbhl_module_unmarking_fn", "GET-SBHL-MODULE-UNMARKING-FN", 1, 0, false);
    declareFunction("sbhl_module_object_p", "SBHL-MODULE-OBJECT-P", 1, 0, false);
    declareFunction("reset_sbhl_modules", "RESET-SBHL-MODULES", 0, 0, false);
    //declareFunction("rebuild_sbhl_modules", "REBUILD-SBHL-MODULES", 0, 0, false);
    declareFunction("get_sbhl_modules", "GET-SBHL-MODULES", 0, 0, false);
    declareFunction("add_sbhl_module", "ADD-SBHL-MODULE", 2, 0, false);
    //declareFunction("remove_sbhl_module", "REMOVE-SBHL-MODULE", 1, 0, false);
    //declareMacro("do_sbhl_modules", "DO-SBHL-MODULES");
    declareFunction("get_sbhl_predicates_int", "GET-SBHL-PREDICATES-INT", 0, 0, false);
    declareFunction("get_sbhl_module_list", "GET-SBHL-MODULE-LIST", 0, 0, false);
    declareFunction("sbhl_predicate_object_p", "SBHL-PREDICATE-OBJECT-P", 1, 0, false);
    declareFunction("sbhl_simple_reflexive_module_type_p", "SBHL-SIMPLE-REFLEXIVE-MODULE-TYPE-P", 1, 0, false);
    declareFunction("sbhl_simple_non_reflexive_module_type_p", "SBHL-SIMPLE-NON-REFLEXIVE-MODULE-TYPE-P", 1, 0, false);
    declareFunction("sbhl_transfers_through_module_type_p", "SBHL-TRANSFERS-THROUGH-MODULE-TYPE-P", 1, 0, false);
    declareFunction("sbhl_disjoins_module_type_p", "SBHL-DISJOINS-MODULE-TYPE-P", 1, 0, false);
    declareFunction("sbhl_time_module_type_p", "SBHL-TIME-MODULE-TYPE-P", 1, 0, false);
    declareFunction("sbhl_transitive_module_type_p", "SBHL-TRANSITIVE-MODULE-TYPE-P", 1, 0, false);
    //declareFunction("sbhl_module_type_p", "SBHL-MODULE-TYPE-P", 1, 0, false);
    //declareMacro("do_sbhl_simple_modules", "DO-SBHL-SIMPLE-MODULES");
    //declareMacro("do_sbhl_time_modules", "DO-SBHL-TIME-MODULES");
    //declareMacro("do_sbhl_time_predicates", "DO-SBHL-TIME-PREDICATES");
    declareFunction("init_sbhl_module_properties", "INIT-SBHL-MODULE-PROPERTIES", 1, 0, false);
    //declareFunction("get_sbhl_module_properties", "GET-SBHL-MODULE-PROPERTIES", 0, 0, false);
    //declareFunction("add_sbhl_module_property", "ADD-SBHL-MODULE-PROPERTY", 2, 0, false);
    declareFunction("sbhl_module_property_p", "SBHL-MODULE-PROPERTY-P", 1, 0, false);
    //declareMacro("do_sbhl_module_properties", "DO-SBHL-MODULE-PROPERTIES");
    //declareFunction("get_sbhl_module_required_properties", "GET-SBHL-MODULE-REQUIRED-PROPERTIES", 0, 0, false);
    //declareFunction("sbhl_module_required_property_p", "SBHL-MODULE-REQUIRED-PROPERTY-P", 1, 0, false);
    //declareMacro("do_sbhl_module_required_properties", "DO-SBHL-MODULE-REQUIRED-PROPERTIES");
    declareFunction("get_sbhl_module", "GET-SBHL-MODULE", 0, 1, false); new $get_sbhl_module$ZeroArityFunction(); new $get_sbhl_module$UnaryFunction();
    //declareMacro("with_sbhl_module", "WITH-SBHL-MODULE");
    //declareMacro("possibly_with_sbhl_module", "POSSIBLY-WITH-SBHL-MODULE");
    declareFunction("fort_denotes_sbhl_directed_graph_p", "FORT-DENOTES-SBHL-DIRECTED-GRAPH-P", 1, 0, false);
    //declareFunction("sbhl_link_style_specifier_p", "SBHL-LINK-STYLE-SPECIFIER-P", 1, 0, false);
    declareFunction("clean_sbhl_modules", "CLEAN-SBHL-MODULES", 0, 0, false);
    declareFunction("optimize_sbhl_modules", "OPTIMIZE-SBHL-MODULES", 0, 0, false);
    declareFunction("sbhl_modules_link_pred_L", "SBHL-MODULES-LINK-PRED-<", 2, 0, false);
    declareFunction("sbhl_module_link_pred_preference_order", "SBHL-MODULE-LINK-PRED-PREFERENCE-ORDER", 0, 0, false);
    return NIL;
  }

  public static final SubLObject init_sbhl_module_vars_file() {
    $dtp_sbhl_module$ = defconstant("*DTP-SBHL-MODULE*", $sym0$SBHL_MODULE);
    $sbhl_module_key_test$ = deflexical("*SBHL-MODULE-KEY-TEST*", Symbols.symbol_function(EQ));
    $sbhl_modules$ = deflexical("*SBHL-MODULES*", maybeDefault( $sym56$_SBHL_MODULES_, $sbhl_modules$, ()-> (dictionary.new_dictionary($sbhl_module_key_test$.getGlobalValue(), UNPROVIDED))));
    $sbhl_module_types$ = deflexical("*SBHL-MODULE-TYPES*", $list64);
    $sbhl_module_properties$ = deflexical("*SBHL-MODULE-PROPERTIES*", maybeDefault( $sym80$_SBHL_MODULE_PROPERTIES_, $sbhl_module_properties$, ()-> (dictionary.new_dictionary(Symbols.symbol_function(EQ), UNPROVIDED))));
    $sbhl_module_required_properties$ = deflexical("*SBHL-MODULE-REQUIRED-PROPERTIES*", $list107);
    $sbhl_module$ = defparameter("*SBHL-MODULE*", NIL);
    $sbhl_module_vars$ = defvar("*SBHL-MODULE-VARS*", NIL);
    $fort_denoting_sbhl_directed_graph$ = deflexical("*FORT-DENOTING-SBHL-DIRECTED-GRAPH*", $const116$DirectedMultigraph);
    $fort_denoting_sbhl_undirected_graph$ = deflexical("*FORT-DENOTING-SBHL-UNDIRECTED-GRAPH*", $const117$Multigraph);
    $assume_sbhl_extensions_nonempty$ = defparameter("*ASSUME-SBHL-EXTENSIONS-NONEMPTY*", T);
    $sbhl_module_link_pred_preference_order$ = defparameter("*SBHL-MODULE-LINK-PRED-PREFERENCE-ORDER*", NIL);
    return NIL;
  }

  public static final SubLObject setup_sbhl_module_vars_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_sbhl_module$.getGlobalValue(), Symbols.symbol_function($sym7$SBHL_MODULE_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym8$SBHL_MOD_LINK_PRED, $sym9$_CSETF_SBHL_MOD_LINK_PRED);
    Structures.def_csetf($sym10$SBHL_MOD_ACCESSIBLE_LINK_PREDS, $sym11$_CSETF_SBHL_MOD_ACCESSIBLE_LINK_PREDS);
    Structures.def_csetf($sym12$SBHL_MOD_GRAPH, $sym13$_CSETF_SBHL_MOD_GRAPH);
    Structures.def_csetf($sym14$SBHL_MOD_LINK_STYLE, $sym15$_CSETF_SBHL_MOD_LINK_STYLE);
    Structures.def_csetf($sym16$SBHL_MOD_INDEX_ARG, $sym17$_CSETF_SBHL_MOD_INDEX_ARG);
    Structures.def_csetf($sym18$SBHL_MOD_MODULE_TYPE, $sym19$_CSETF_SBHL_MOD_MODULE_TYPE);
    Structures.def_csetf($sym20$SBHL_MOD_TYPE_TEST, $sym21$_CSETF_SBHL_MOD_TYPE_TEST);
    Structures.def_csetf($sym22$SBHL_MOD_PATH_TERMINATING_MARK_FN, $sym23$_CSETF_SBHL_MOD_PATH_TERMINATING_MARK_FN);
    Structures.def_csetf($sym24$SBHL_MOD_MARKING_FN, $sym25$_CSETF_SBHL_MOD_MARKING_FN);
    Structures.def_csetf($sym26$SBHL_MOD_UNMARKING_FN, $sym27$_CSETF_SBHL_MOD_UNMARKING_FN);
    Structures.def_csetf($sym28$SBHL_MOD_VAR_BINDINGS, $sym29$_CSETF_SBHL_MOD_VAR_BINDINGS);
    Structures.def_csetf($sym30$SBHL_MOD_MISC_PROPERTIES, $sym31$_CSETF_SBHL_MOD_MISC_PROPERTIES);
    Equality.identity($sym0$SBHL_MODULE);
    subl_macro_promotions.declare_defglobal($sym56$_SBHL_MODULES_);
    subl_macro_promotions.declare_defglobal($sym80$_SBHL_MODULE_PROPERTIES_);
    init_sbhl_module_properties(list(new SubLObject[] {list($kw32$LINK_PRED, $sym57$SBHL_PREDICATE_OBJECT_P), list($kw35$LINK_STYLE, $sym81$SBHL_LINK_STYLE_SPECIFIER_P), list($kw82$NAUT_FORWARD_TRUE_GENERATORS, $sym83$FUNCTION_SYMBOL_LIST_P), list($kw37$MODULE_TYPE, $sym84$SBHL_MODULE_TYPE_P), list($kw38$TYPE_TEST, $sym85$FUNCTION_SYMBOL_P), list($kw86$MODULE_INVERTS_ARGUMENTS, $sym87$SBHL_MODULE_OR_PREDICATE_P), list($kw88$INVERTS_ARGUMENTS_OF_MODULE, $sym87$SBHL_MODULE_OR_PREDICATE_P), list($kw89$DISJOINS_MODULE, $sym87$SBHL_MODULE_OR_PREDICATE_P), list($kw55$PATH_TERMINATING_MARK__FN, $sym85$FUNCTION_SYMBOL_P), list($kw40$MARKING_FN, $sym85$FUNCTION_SYMBOL_P), list($kw41$UNMARKING_FN, $sym85$FUNCTION_SYMBOL_P), list($kw90$MARKING_INCREMENT, $sym91$INTEGERP), list($kw33$ACCESSIBLE_LINK_PREDS, $sym92$LISTP), list($kw93$TRANSFERS_THROUGH_MODULE, $sym87$SBHL_MODULE_OR_PREDICATE_P), list($kw94$TRANSFERS_VIA_ARG, $sym91$INTEGERP), list($kw95$ADD_NODE_TO_RESULT_TEST, $sym85$FUNCTION_SYMBOL_P), list($kw96$ADD_UNMARKED_NODE_TO_RESULT_TEST, $sym85$FUNCTION_SYMBOL_P), list($kw97$PREDICATE_SEARCH_P, $sym98$BOOLEANP), list($kw99$MODULE_TAG, $sym100$KEYWORDP), list($kw36$INDEX_ARG, $sym91$INTEGERP), list($kw101$ROOT, $sym102$SBHL_NODE_OBJECT_P), list($kw34$GRAPH, $sym103$HASH_TABLE_P), list($kw104$SBHL_MARKING_PARAMETERS, $sym92$LISTP)}));
    utilities_macros.note_funcall_helper_function($sym119$SBHL_MODULES_LINK_PRED__);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$SBHL_MODULE = makeSymbol("SBHL-MODULE");
  public static final SubLSymbol $sym1$SBHL_MODULE_P = makeSymbol("SBHL-MODULE-P");
  public static final SubLList $list2 = list(new SubLObject[] {makeSymbol("LINK-PRED"), makeSymbol("ACCESSIBLE-LINK-PREDS"), makeSymbol("GRAPH"), makeSymbol("LINK-STYLE"), makeSymbol("INDEX-ARG"), makeSymbol("MODULE-TYPE"), makeSymbol("TYPE-TEST"), makeSymbol("PATH-TERMINATING-MARK-FN"), makeSymbol("MARKING-FN"), makeSymbol("UNMARKING-FN"), makeSymbol("VAR-BINDINGS"), makeSymbol("MISC-PROPERTIES")});
  public static final SubLList $list3 = list(new SubLObject[] {makeKeyword("LINK-PRED"), makeKeyword("ACCESSIBLE-LINK-PREDS"), makeKeyword("GRAPH"), makeKeyword("LINK-STYLE"), makeKeyword("INDEX-ARG"), makeKeyword("MODULE-TYPE"), makeKeyword("TYPE-TEST"), makeKeyword("PATH-TERMINATING-MARK-FN"), makeKeyword("MARKING-FN"), makeKeyword("UNMARKING-FN"), makeKeyword("VAR-BINDINGS"), makeKeyword("MISC-PROPERTIES")});
  public static final SubLList $list4 = list(new SubLObject[] {makeSymbol("SBHL-MOD-LINK-PRED"), makeSymbol("SBHL-MOD-ACCESSIBLE-LINK-PREDS"), makeSymbol("SBHL-MOD-GRAPH"), makeSymbol("SBHL-MOD-LINK-STYLE"), makeSymbol("SBHL-MOD-INDEX-ARG"), makeSymbol("SBHL-MOD-MODULE-TYPE"), makeSymbol("SBHL-MOD-TYPE-TEST"), makeSymbol("SBHL-MOD-PATH-TERMINATING-MARK-FN"), makeSymbol("SBHL-MOD-MARKING-FN"), makeSymbol("SBHL-MOD-UNMARKING-FN"), makeSymbol("SBHL-MOD-VAR-BINDINGS"), makeSymbol("SBHL-MOD-MISC-PROPERTIES")});
  public static final SubLList $list5 = list(new SubLObject[] {makeSymbol("_CSETF-SBHL-MOD-LINK-PRED"), makeSymbol("_CSETF-SBHL-MOD-ACCESSIBLE-LINK-PREDS"), makeSymbol("_CSETF-SBHL-MOD-GRAPH"), makeSymbol("_CSETF-SBHL-MOD-LINK-STYLE"), makeSymbol("_CSETF-SBHL-MOD-INDEX-ARG"), makeSymbol("_CSETF-SBHL-MOD-MODULE-TYPE"), makeSymbol("_CSETF-SBHL-MOD-TYPE-TEST"), makeSymbol("_CSETF-SBHL-MOD-PATH-TERMINATING-MARK-FN"), makeSymbol("_CSETF-SBHL-MOD-MARKING-FN"), makeSymbol("_CSETF-SBHL-MOD-UNMARKING-FN"), makeSymbol("_CSETF-SBHL-MOD-VAR-BINDINGS"), makeSymbol("_CSETF-SBHL-MOD-MISC-PROPERTIES")});
  public static final SubLSymbol $sym6$PRINT_SBHL_MODULE = makeSymbol("PRINT-SBHL-MODULE");
  public static final SubLSymbol $sym7$SBHL_MODULE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SBHL-MODULE-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym8$SBHL_MOD_LINK_PRED = makeSymbol("SBHL-MOD-LINK-PRED");
  public static final SubLSymbol $sym9$_CSETF_SBHL_MOD_LINK_PRED = makeSymbol("_CSETF-SBHL-MOD-LINK-PRED");
  public static final SubLSymbol $sym10$SBHL_MOD_ACCESSIBLE_LINK_PREDS = makeSymbol("SBHL-MOD-ACCESSIBLE-LINK-PREDS");
  public static final SubLSymbol $sym11$_CSETF_SBHL_MOD_ACCESSIBLE_LINK_PREDS = makeSymbol("_CSETF-SBHL-MOD-ACCESSIBLE-LINK-PREDS");
  public static final SubLSymbol $sym12$SBHL_MOD_GRAPH = makeSymbol("SBHL-MOD-GRAPH");
  public static final SubLSymbol $sym13$_CSETF_SBHL_MOD_GRAPH = makeSymbol("_CSETF-SBHL-MOD-GRAPH");
  public static final SubLSymbol $sym14$SBHL_MOD_LINK_STYLE = makeSymbol("SBHL-MOD-LINK-STYLE");
  public static final SubLSymbol $sym15$_CSETF_SBHL_MOD_LINK_STYLE = makeSymbol("_CSETF-SBHL-MOD-LINK-STYLE");
  public static final SubLSymbol $sym16$SBHL_MOD_INDEX_ARG = makeSymbol("SBHL-MOD-INDEX-ARG");
  public static final SubLSymbol $sym17$_CSETF_SBHL_MOD_INDEX_ARG = makeSymbol("_CSETF-SBHL-MOD-INDEX-ARG");
  public static final SubLSymbol $sym18$SBHL_MOD_MODULE_TYPE = makeSymbol("SBHL-MOD-MODULE-TYPE");
  public static final SubLSymbol $sym19$_CSETF_SBHL_MOD_MODULE_TYPE = makeSymbol("_CSETF-SBHL-MOD-MODULE-TYPE");
  public static final SubLSymbol $sym20$SBHL_MOD_TYPE_TEST = makeSymbol("SBHL-MOD-TYPE-TEST");
  public static final SubLSymbol $sym21$_CSETF_SBHL_MOD_TYPE_TEST = makeSymbol("_CSETF-SBHL-MOD-TYPE-TEST");
  public static final SubLSymbol $sym22$SBHL_MOD_PATH_TERMINATING_MARK_FN = makeSymbol("SBHL-MOD-PATH-TERMINATING-MARK-FN");
  public static final SubLSymbol $sym23$_CSETF_SBHL_MOD_PATH_TERMINATING_MARK_FN = makeSymbol("_CSETF-SBHL-MOD-PATH-TERMINATING-MARK-FN");
  public static final SubLSymbol $sym24$SBHL_MOD_MARKING_FN = makeSymbol("SBHL-MOD-MARKING-FN");
  public static final SubLSymbol $sym25$_CSETF_SBHL_MOD_MARKING_FN = makeSymbol("_CSETF-SBHL-MOD-MARKING-FN");
  public static final SubLSymbol $sym26$SBHL_MOD_UNMARKING_FN = makeSymbol("SBHL-MOD-UNMARKING-FN");
  public static final SubLSymbol $sym27$_CSETF_SBHL_MOD_UNMARKING_FN = makeSymbol("_CSETF-SBHL-MOD-UNMARKING-FN");
  public static final SubLSymbol $sym28$SBHL_MOD_VAR_BINDINGS = makeSymbol("SBHL-MOD-VAR-BINDINGS");
  public static final SubLSymbol $sym29$_CSETF_SBHL_MOD_VAR_BINDINGS = makeSymbol("_CSETF-SBHL-MOD-VAR-BINDINGS");
  public static final SubLSymbol $sym30$SBHL_MOD_MISC_PROPERTIES = makeSymbol("SBHL-MOD-MISC-PROPERTIES");
  public static final SubLSymbol $sym31$_CSETF_SBHL_MOD_MISC_PROPERTIES = makeSymbol("_CSETF-SBHL-MOD-MISC-PROPERTIES");
  public static final SubLSymbol $kw32$LINK_PRED = makeKeyword("LINK-PRED");
  public static final SubLSymbol $kw33$ACCESSIBLE_LINK_PREDS = makeKeyword("ACCESSIBLE-LINK-PREDS");
  public static final SubLSymbol $kw34$GRAPH = makeKeyword("GRAPH");
  public static final SubLSymbol $kw35$LINK_STYLE = makeKeyword("LINK-STYLE");
  public static final SubLSymbol $kw36$INDEX_ARG = makeKeyword("INDEX-ARG");
  public static final SubLSymbol $kw37$MODULE_TYPE = makeKeyword("MODULE-TYPE");
  public static final SubLSymbol $kw38$TYPE_TEST = makeKeyword("TYPE-TEST");
  public static final SubLSymbol $kw39$PATH_TERMINATING_MARK_FN = makeKeyword("PATH-TERMINATING-MARK-FN");
  public static final SubLSymbol $kw40$MARKING_FN = makeKeyword("MARKING-FN");
  public static final SubLSymbol $kw41$UNMARKING_FN = makeKeyword("UNMARKING-FN");
  public static final SubLSymbol $kw42$VAR_BINDINGS = makeKeyword("VAR-BINDINGS");
  public static final SubLSymbol $kw43$MISC_PROPERTIES = makeKeyword("MISC-PROPERTIES");
  public static final SubLString $str44$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str45$__SBHL_MODULE__ = makeString("#<SBHL-MODULE: ");
  public static final SubLString $str46$_ = makeString(">");
  public static final SubLSymbol $sym47$FORT_P = makeSymbol("FORT-P");
  public static final SubLSymbol $kw48$ERROR = makeKeyword("ERROR");
  public static final SubLString $str49$_A_is_not_a__A = makeString("~A is not a ~A");
  public static final SubLSymbol $sym50$SBHL_MODULE_PROPERTY_P = makeSymbol("SBHL-MODULE-PROPERTY-P");
  public static final SubLSymbol $kw51$CERROR = makeKeyword("CERROR");
  public static final SubLString $str52$continue_anyway = makeString("continue anyway");
  public static final SubLSymbol $kw53$WARN = makeKeyword("WARN");
  public static final SubLString $str54$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");
  public static final SubLSymbol $kw55$PATH_TERMINATING_MARK__FN = makeKeyword("PATH-TERMINATING-MARK?-FN");
  public static final SubLSymbol $sym56$_SBHL_MODULES_ = makeSymbol("*SBHL-MODULES*");
  public static final SubLSymbol $sym57$SBHL_PREDICATE_OBJECT_P = makeSymbol("SBHL-PREDICATE-OBJECT-P");
  public static final SubLSymbol $sym58$SBHL_MODULE_OBJECT_P = makeSymbol("SBHL-MODULE-OBJECT-P");
  public static final SubLList $list59 = list(list(makeSymbol("MODULE-VAR"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym60$KEY = makeUninternedSymbol("KEY");
  public static final SubLSymbol $sym61$DO_DICTIONARY = makeSymbol("DO-DICTIONARY");
  public static final SubLList $list62 = list(makeSymbol("GET-SBHL-MODULES"));
  public static final SubLSymbol $sym63$IGNORE = makeSymbol("IGNORE");
  public static final SubLList $list64 = list(makeKeyword("SIMPLE-REFLEXIVE"), makeKeyword("SIMPLE-NON-REFLEXIVE"), makeKeyword("TRANSFERS-THROUGH"), makeKeyword("DISJOINS"), makeKeyword("TIME"));
  public static final SubLSymbol $kw65$SIMPLE_REFLEXIVE = makeKeyword("SIMPLE-REFLEXIVE");
  public static final SubLSymbol $kw66$SIMPLE_NON_REFLEXIVE = makeKeyword("SIMPLE-NON-REFLEXIVE");
  public static final SubLSymbol $kw67$TRANSFERS_THROUGH = makeKeyword("TRANSFERS-THROUGH");
  public static final SubLSymbol $kw68$DISJOINS = makeKeyword("DISJOINS");
  public static final SubLSymbol $kw69$TIME = makeKeyword("TIME");
  public static final SubLSymbol $sym70$MODULE = makeUninternedSymbol("MODULE");
  public static final SubLSymbol $sym71$DO_SBHL_MODULES = makeSymbol("DO-SBHL-MODULES");
  public static final SubLSymbol $sym72$PWHEN = makeSymbol("PWHEN");
  public static final SubLSymbol $sym73$SBHL_SIMPLE_MODULE_P = makeSymbol("SBHL-SIMPLE-MODULE-P");
  public static final SubLSymbol $sym74$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym75$GET_SBHL_LINK_PRED = makeSymbol("GET-SBHL-LINK-PRED");
  public static final SubLSymbol $sym76$MODULE = makeUninternedSymbol("MODULE");
  public static final SubLSymbol $sym77$SBHL_TIME_MODULE_P = makeSymbol("SBHL-TIME-MODULE-P");
  public static final SubLList $list78 = list(list(makeSymbol("PRED-VAR"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym79$MODULE = makeUninternedSymbol("MODULE");
  public static final SubLSymbol $sym80$_SBHL_MODULE_PROPERTIES_ = makeSymbol("*SBHL-MODULE-PROPERTIES*");
  public static final SubLSymbol $sym81$SBHL_LINK_STYLE_SPECIFIER_P = makeSymbol("SBHL-LINK-STYLE-SPECIFIER-P");
  public static final SubLSymbol $kw82$NAUT_FORWARD_TRUE_GENERATORS = makeKeyword("NAUT-FORWARD-TRUE-GENERATORS");
  public static final SubLSymbol $sym83$FUNCTION_SYMBOL_LIST_P = makeSymbol("FUNCTION-SYMBOL-LIST-P");
  public static final SubLSymbol $sym84$SBHL_MODULE_TYPE_P = makeSymbol("SBHL-MODULE-TYPE-P");
  public static final SubLSymbol $sym85$FUNCTION_SYMBOL_P = makeSymbol("FUNCTION-SYMBOL-P");
  public static final SubLSymbol $kw86$MODULE_INVERTS_ARGUMENTS = makeKeyword("MODULE-INVERTS-ARGUMENTS");
  public static final SubLSymbol $sym87$SBHL_MODULE_OR_PREDICATE_P = makeSymbol("SBHL-MODULE-OR-PREDICATE-P");
  public static final SubLSymbol $kw88$INVERTS_ARGUMENTS_OF_MODULE = makeKeyword("INVERTS-ARGUMENTS-OF-MODULE");
  public static final SubLSymbol $kw89$DISJOINS_MODULE = makeKeyword("DISJOINS-MODULE");
  public static final SubLSymbol $kw90$MARKING_INCREMENT = makeKeyword("MARKING-INCREMENT");
  public static final SubLSymbol $sym91$INTEGERP = makeSymbol("INTEGERP");
  public static final SubLSymbol $sym92$LISTP = makeSymbol("LISTP");
  public static final SubLSymbol $kw93$TRANSFERS_THROUGH_MODULE = makeKeyword("TRANSFERS-THROUGH-MODULE");
  public static final SubLSymbol $kw94$TRANSFERS_VIA_ARG = makeKeyword("TRANSFERS-VIA-ARG");
  public static final SubLSymbol $kw95$ADD_NODE_TO_RESULT_TEST = makeKeyword("ADD-NODE-TO-RESULT-TEST");
  public static final SubLSymbol $kw96$ADD_UNMARKED_NODE_TO_RESULT_TEST = makeKeyword("ADD-UNMARKED-NODE-TO-RESULT-TEST");
  public static final SubLSymbol $kw97$PREDICATE_SEARCH_P = makeKeyword("PREDICATE-SEARCH-P");
  public static final SubLSymbol $sym98$BOOLEANP = makeSymbol("BOOLEANP");
  public static final SubLSymbol $kw99$MODULE_TAG = makeKeyword("MODULE-TAG");
  public static final SubLSymbol $sym100$KEYWORDP = makeSymbol("KEYWORDP");
  public static final SubLSymbol $kw101$ROOT = makeKeyword("ROOT");
  public static final SubLSymbol $sym102$SBHL_NODE_OBJECT_P = makeSymbol("SBHL-NODE-OBJECT-P");
  public static final SubLSymbol $sym103$HASH_TABLE_P = makeSymbol("HASH-TABLE-P");
  public static final SubLSymbol $kw104$SBHL_MARKING_PARAMETERS = makeKeyword("SBHL-MARKING-PARAMETERS");
  public static final SubLList $list105 = list(list(makeSymbol("PROPERTY-VAR"), makeSymbol("TEST-VAR"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list106 = list(makeSymbol("GET-SBHL-MODULE-PROPERTIES"));
  public static final SubLList $list107 = list(makeKeyword("LINK-PRED"), makeKeyword("LINK-STYLE"), makeKeyword("MODULE-TYPE"), makeKeyword("PATH-TERMINATING-MARK?-FN"), makeKeyword("MARKING-FN"), makeKeyword("UNMARKING-FN"), makeKeyword("INDEX-ARG"), makeKeyword("GRAPH"));
  public static final SubLList $list108 = list(list(makeSymbol("PROPERTY-VAR"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym109$SMART_CSOME = makeSymbol("SMART-CSOME");
  public static final SubLList $list110 = list(makeSymbol("GET-SBHL-MODULE-REQUIRED-PROPERTIES"));
  public static final SubLString $str111$_A_is_not_a_valid_sbhl_predicate_ = makeString("~A is not a valid sbhl-predicate-p");
  public static final SubLList $list112 = list(makeSymbol("MODULE"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym113$_SBHL_MODULE_ = makeSymbol("*SBHL-MODULE*");
  public static final SubLSymbol $sym114$FIF = makeSymbol("FIF");
  public static final SubLList $list115 = list(makeSymbol("*SBHL-MODULE*"));
  public static final SubLObject $const116$DirectedMultigraph = constant_handles.reader_make_constant_shell(makeString("DirectedMultigraph"));
  public static final SubLObject $const117$Multigraph = constant_handles.reader_make_constant_shell(makeString("Multigraph"));
  public static final SubLString $str118$Term___a__is_not_used_to_specify_ = makeString("Term, ~a, is not used to specify directed nor undirected graphs");
  public static final SubLSymbol $sym119$SBHL_MODULES_LINK_PRED__ = makeSymbol("SBHL-MODULES-LINK-PRED-<");
  public static final SubLSymbol $sym120$_ = makeSymbol(">");
  public static final SubLSymbol $sym121$SECOND = makeSymbol("SECOND");
  public static final SubLSymbol $sym122$FIRST = makeSymbol("FIRST");
  public static final SubLObject $const123$genls = constant_handles.reader_make_constant_shell(makeString("genls"));

  //// Initializers

  public void declareFunctions() {
    declare_sbhl_module_vars_file();
  }

  public void initializeVariables() {
    init_sbhl_module_vars_file();
  }

  public void runTopLevelForms() {
    setup_sbhl_module_vars_file();
  }

}
