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

package  com.cyc.cycjava_1.cycl.sbhl;

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


import com.cyc.cycjava_1.cycl.access_macros;
import com.cyc.cycjava_1.cycl.constant_handles;
import com.cyc.cycjava_1.cycl.dictionary;
import com.cyc.cycjava_1.cycl.dictionary_contents;
import com.cyc.cycjava_1.cycl.dictionary_utilities;
import com.cyc.cycjava_1.cycl.list_utilities;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava_1.cycl.subl_macros;
import com.cyc.cycjava_1.cycl.subl_promotions;

public  final class sbhl_links extends SubLTranslatedFile {

  //// Constructor

  private sbhl_links() {}
  public static final SubLFile me = new sbhl_links();
  public static final String myName = "com.cyc.cycjava_1.cycl.sbhl.sbhl_links";

  //// Definitions

  public static final class $sbhl_directed_link_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $predicate_links; }
    public SubLObject getField3() { return $inverse_links; }
    public SubLObject setField2(SubLObject value) { return $predicate_links = value; }
    public SubLObject setField3(SubLObject value) { return $inverse_links = value; }
    public SubLObject $predicate_links = NIL;
    public SubLObject $inverse_links = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($sbhl_directed_link_native.class, $sym0$SBHL_DIRECTED_LINK, $sym1$SBHL_DIRECTED_LINK_P, $list3, $list4, new String[] {"$predicate_links", "$inverse_links"}, $list5, $list6, $sym7$PRINT_LINK);
  }

  @SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 846) 
  public static SubLSymbol $dtp_sbhl_directed_link$ = null;

  @SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 846) 
  public static final SubLObject sbhl_directed_link_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2047");
    return NIL;
  }

  @SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 846) 
  public static final SubLObject sbhl_directed_link_p(SubLObject object) {
    return ((object.getClass() == $sbhl_directed_link_native.class) ? ((SubLObject) T) : NIL);
  }

  public static final class $sbhl_directed_link_p$UnaryFunction extends UnaryFunction {
    public $sbhl_directed_link_p$UnaryFunction() { super(extractFunctionNamed("SBHL-DIRECTED-LINK-P")); }
    public SubLObject processItem(SubLObject arg1) { return sbhl_directed_link_p(arg1); }
  }

  @SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 846) 
  public static final SubLObject sbhl_directed_link_predicate_links(SubLObject object) {
    checkType(object, $sym1$SBHL_DIRECTED_LINK_P);
    return object.getField2();
  }

  @SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 846) 
  public static final SubLObject sbhl_directed_link_inverse_links(SubLObject object) {
    checkType(object, $sym1$SBHL_DIRECTED_LINK_P);
    return object.getField3();
  }

  @SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 846) 
  public static final SubLObject _csetf_sbhl_directed_link_predicate_links(SubLObject object, SubLObject value) {
    checkType(object, $sym1$SBHL_DIRECTED_LINK_P);
    return object.setField2(value);
  }

  @SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 846) 
  public static final SubLObject _csetf_sbhl_directed_link_inverse_links(SubLObject object, SubLObject value) {
    checkType(object, $sym1$SBHL_DIRECTED_LINK_P);
    return object.setField3(value);
  }

  @SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 846) 
  public static final SubLObject make_sbhl_directed_link(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $sbhl_directed_link_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw13$PREDICATE_LINKS)) {
            _csetf_sbhl_directed_link_predicate_links(v_new, current_value);
          } else if (pcase_var.eql($kw14$INVERSE_LINKS)) {
            _csetf_sbhl_directed_link_inverse_links(v_new, current_value);
          } else {
            Errors.error($str15$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  public static final class $sbhl_undirected_link_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $links; }
    public SubLObject setField2(SubLObject value) { return $links = value; }
    public SubLObject $links = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($sbhl_undirected_link_native.class, $sym16$SBHL_UNDIRECTED_LINK, $sym17$SBHL_UNDIRECTED_LINK_P, $list19, $list20, new String[] {"$links"}, $list21, $list22, $sym7$PRINT_LINK);
  }

  @SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 1706) 
  public static SubLSymbol $dtp_sbhl_undirected_link$ = null;

  @SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 1706) 
  public static final SubLObject sbhl_undirected_link_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2048");
    return NIL;
  }

  @SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 1706) 
  public static final SubLObject sbhl_undirected_link_p(SubLObject object) {
    return ((object.getClass() == $sbhl_undirected_link_native.class) ? ((SubLObject) T) : NIL);
  }

  public static final class $sbhl_undirected_link_p$UnaryFunction extends UnaryFunction {
    public $sbhl_undirected_link_p$UnaryFunction() { super(extractFunctionNamed("SBHL-UNDIRECTED-LINK-P")); }
    public SubLObject processItem(SubLObject arg1) { return sbhl_undirected_link_p(arg1); }
  }

  @SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 1706) 
  public static final SubLObject sbhl_undirected_link_links(SubLObject object) {
    checkType(object, $sym17$SBHL_UNDIRECTED_LINK_P);
    return object.getField2();
  }

  @SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 1706) 
  public static final SubLObject _csetf_sbhl_undirected_link_links(SubLObject object, SubLObject value) {
    checkType(object, $sym17$SBHL_UNDIRECTED_LINK_P);
    return object.setField2(value);
  }

  @SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 1706) 
  public static final SubLObject make_sbhl_undirected_link(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $sbhl_undirected_link_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw26$LINKS)) {
            _csetf_sbhl_undirected_link_links(v_new, current_value);
          } else {
            Errors.error($str15$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  /** Constructor: @return sbhl-directed-link-p; with MT-LINKS in the DIRECTION field */
  @SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 1948) 
  public static final SubLObject create_sbhl_directed_link(SubLObject direction, SubLObject mt_links) {
    {
      SubLObject direction_link = make_sbhl_directed_link(UNPROVIDED);
      set_sbhl_directed_link(direction_link, direction, mt_links);
      return direction_link;
    }
  }

  /** Constructor: @return sbhl-undirected-link-p; with MT-LINKS in the links field */
  @SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 2674) 
  public static final SubLObject create_sbhl_undirected_link(SubLObject mt_links) {
    {
      SubLObject direction_link = make_sbhl_undirected_link(UNPROVIDED);
      set_sbhl_undirected_link(direction_link, mt_links);
      return direction_link;
    }
  }

  /** Constructor: @return sbhl-direction-link-p; with direction field DIRECTION filled with MT-LINKS. uses MODULE / *sbhl-module* to assess whether links are directed */
  @SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 2949) 
  public static final SubLObject create_sbhl_direction_link(SubLObject direction, SubLObject mt_links, SubLObject module) {
    checkType(module, $sym30$SBHL_MODULE_P);
    {
      SubLObject direction_link = NIL;
      direction_link = ((NIL != sbhl_module_utilities.sbhl_module_directed_linksP(module)) ? ((SubLObject) create_sbhl_directed_link(direction, mt_links)) : create_sbhl_undirected_link(mt_links));
      return direction_link;
    }
  }

  /** Accessor: @return booleanp; is D-LINK either an sbhl-directed-link or sbhl-undirected-link, or neither. */
  @SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 3453) 
  public static final SubLObject sbhl_direction_link_p(SubLObject d_link) {
    return makeBoolean(((NIL != sbhl_directed_link_p(d_link))
          || (NIL != sbhl_undirected_link_p(d_link))));
  }

  /** Accessor: @return booleanp; whether NODE has any forward sbhl links in PRED / *sbhl-module* */
  @SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 4278) 
  public static final SubLObject any_sbhl_predicate_links_p(SubLObject node, SubLObject pred) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
        if ((NIL == sbhl_module_utilities.sbhl_predicate_p(pred))) {
          {
            SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($kw31$ERROR)) {
              sbhl_paranoia.sbhl_error(ONE_INTEGER, $str32$_A_is_not_a__A, pred, $sym33$SBHL_PREDICATE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else if (pcase_var.eql($kw34$CERROR)) {
              Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2173");
            } else if (pcase_var.eql($kw36$WARN)) {
              Errors.warn($str32$_A_is_not_a__A, pred, $sym33$SBHL_PREDICATE_P);
            } else {
              Errors.warn($str37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
              Errors.cerror($str35$continue_anyway, $str32$_A_is_not_a__A, pred, $sym33$SBHL_PREDICATE_P);
            }
          }
        }
      }
      {
        SubLObject module = sbhl_module_vars.get_sbhl_module(pred);
        SubLObject direction_link = sbhl_graphs.get_sbhl_graph_link(node, module);
        if ((NIL != direction_link)) {
          if ((NIL != sbhl_module_utilities.sbhl_module_directed_linksP(module))) {
            return list_utilities.sublisp_boolean(sbhl_directed_link_predicate_links(direction_link));
          } else {
            return list_utilities.sublisp_boolean(sbhl_undirected_link_links(direction_link));
          }
        }
      }
      return NIL;
    }
  }

  /** Accessor: @return sbhl-mt-links-object-p; the mt-links in the DIRECTION field of DIRECTED-LINK */
  @SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 4795) 
  public static final SubLObject get_sbhl_directed_mt_links(SubLObject directed_link, SubLObject direction) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((direction == sbhl_link_vars.get_sbhl_forward_directed_direction())) {
        return sbhl_directed_link_predicate_links(directed_link);
      } else if ((direction == sbhl_link_vars.get_sbhl_backward_directed_direction())) {
        return sbhl_directed_link_inverse_links(directed_link);
      } else {
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
          if ((NIL == sbhl_link_vars.sbhl_directed_direction_p(direction))) {
            {
              SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
              if (pcase_var.eql($kw31$ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str32$_A_is_not_a__A, direction, $sym38$SBHL_DIRECTED_DIRECTION_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
              } else if (pcase_var.eql($kw34$CERROR)) {
                Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2174");
              } else if (pcase_var.eql($kw36$WARN)) {
                Errors.warn($str32$_A_is_not_a__A, direction, $sym38$SBHL_DIRECTED_DIRECTION_P);
              } else {
                Errors.warn($str37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                Errors.cerror($str35$continue_anyway, $str32$_A_is_not_a__A, direction, $sym38$SBHL_DIRECTED_DIRECTION_P);
              }
            }
          }
        }
      }
      return NIL;
    }
  }

  /** Accessor: @return sbhl-mt-links-object-p; the mt-links in the DIRECTION field of UNDIRECTED-LINK */
  @SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 5302) 
  public static final SubLObject get_sbhl_undirected_mt_links(SubLObject undirected_link) {
    return sbhl_undirected_link_links(undirected_link);
  }

  /** Accessor: @return the sbhl-mt-links in the DIRECTION field of DIRECTION-LINK. uses MODULE / *sbhl-module* to assess whether links are directed. */
  @SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 5523) 
  public static final SubLObject get_sbhl_mt_links(SubLObject direction_link, SubLObject direction, SubLObject module) {
    checkType(module, $sym30$SBHL_MODULE_P);
    {
      SubLObject mt_links = NIL;
      mt_links = ((NIL != sbhl_module_utilities.sbhl_module_directed_linksP(module)) ? ((SubLObject) get_sbhl_directed_mt_links(direction_link, direction)) : get_sbhl_undirected_mt_links(direction_link));
      return mt_links;
    }
  }

  /** Modifier: Sets the DIRECTION field of DIRECTED-LINK to be VALUE */
  @SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 5990) 
  public static final SubLObject set_sbhl_directed_link(SubLObject directed_link, SubLObject direction, SubLObject value) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
        if ((NIL == sbhl_directed_link_p(directed_link))) {
          {
            SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($kw31$ERROR)) {
              sbhl_paranoia.sbhl_error(ONE_INTEGER, $str32$_A_is_not_a__A, directed_link, $sym1$SBHL_DIRECTED_LINK_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else if (pcase_var.eql($kw34$CERROR)) {
              Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2175");
            } else if (pcase_var.eql($kw36$WARN)) {
              Errors.warn($str32$_A_is_not_a__A, directed_link, $sym1$SBHL_DIRECTED_LINK_P);
            } else {
              Errors.warn($str37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
              Errors.cerror($str35$continue_anyway, $str32$_A_is_not_a__A, directed_link, $sym1$SBHL_DIRECTED_LINK_P);
            }
          }
        }
      }
      if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
        if ((NIL == sbhl_link_vars.sbhl_directed_direction_p(direction))) {
          {
            SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($kw31$ERROR)) {
              sbhl_paranoia.sbhl_error(ONE_INTEGER, $str32$_A_is_not_a__A, direction, $sym38$SBHL_DIRECTED_DIRECTION_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else if (pcase_var.eql($kw34$CERROR)) {
              Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2176");
            } else if (pcase_var.eql($kw36$WARN)) {
              Errors.warn($str32$_A_is_not_a__A, direction, $sym38$SBHL_DIRECTED_DIRECTION_P);
            } else {
              Errors.warn($str37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
              Errors.cerror($str35$continue_anyway, $str32$_A_is_not_a__A, direction, $sym38$SBHL_DIRECTED_DIRECTION_P);
            }
          }
        }
      }
      if ((NIL != value)) {
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
          if ((NIL == sbhl_mt_links_object_p(value))) {
            {
              SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
              if (pcase_var.eql($kw31$ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str32$_A_is_not_a__A, value, $sym39$SBHL_MT_LINKS_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
              } else if (pcase_var.eql($kw34$CERROR)) {
                Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2177");
              } else if (pcase_var.eql($kw36$WARN)) {
                Errors.warn($str32$_A_is_not_a__A, value, $sym39$SBHL_MT_LINKS_OBJECT_P);
              } else {
                Errors.warn($str37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                Errors.cerror($str35$continue_anyway, $str32$_A_is_not_a__A, value, $sym39$SBHL_MT_LINKS_OBJECT_P);
              }
            }
          }
        }
      }
      if ((direction == sbhl_link_vars.get_sbhl_forward_directed_direction())) {
        _csetf_sbhl_directed_link_predicate_links(directed_link, value);
      } else if ((direction == sbhl_link_vars.get_sbhl_backward_directed_direction())) {
        _csetf_sbhl_directed_link_inverse_links(directed_link, value);
      }
      return NIL;
    }
  }

  /** Modifier: Sets the links field of UNDIRECTED-LINK to be VALUE. ensures DIRECTION is :link */
  @SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 6874) 
  public static final SubLObject set_sbhl_undirected_link(SubLObject undirected_link, SubLObject value) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
        if ((NIL == sbhl_undirected_link_p(undirected_link))) {
          {
            SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($kw31$ERROR)) {
              sbhl_paranoia.sbhl_error(ONE_INTEGER, $str32$_A_is_not_a__A, undirected_link, $sym17$SBHL_UNDIRECTED_LINK_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else if (pcase_var.eql($kw34$CERROR)) {
              Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2178");
            } else if (pcase_var.eql($kw36$WARN)) {
              Errors.warn($str32$_A_is_not_a__A, undirected_link, $sym17$SBHL_UNDIRECTED_LINK_P);
            } else {
              Errors.warn($str37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
              Errors.cerror($str35$continue_anyway, $str32$_A_is_not_a__A, undirected_link, $sym17$SBHL_UNDIRECTED_LINK_P);
            }
          }
        }
      }
      if ((NIL != value)) {
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
          if ((NIL == sbhl_mt_links_object_p(value))) {
            {
              SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
              if (pcase_var.eql($kw31$ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str32$_A_is_not_a__A, value, $sym39$SBHL_MT_LINKS_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
              } else if (pcase_var.eql($kw34$CERROR)) {
                Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2179");
              } else if (pcase_var.eql($kw36$WARN)) {
                Errors.warn($str32$_A_is_not_a__A, value, $sym39$SBHL_MT_LINKS_OBJECT_P);
              } else {
                Errors.warn($str37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                Errors.cerror($str35$continue_anyway, $str32$_A_is_not_a__A, value, $sym39$SBHL_MT_LINKS_OBJECT_P);
              }
            }
          }
        }
      }
      _csetf_sbhl_undirected_link_links(undirected_link, value);
      return NIL;
    }
  }

  /** Modifier: Sets the DIRECTION field of DIRECTION-LINK to be VALUE. uses MODULE / *sbhl-module* to assess whether links are directed. */
  @SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 7234) 
  public static final SubLObject set_sbhl_direction_link(SubLObject direction_link, SubLObject direction, SubLObject value, SubLObject module) {
    checkType(module, $sym30$SBHL_MODULE_P);
    if ((NIL != sbhl_module_utilities.sbhl_module_directed_linksP(module))) {
      set_sbhl_directed_link(direction_link, direction, value);
    } else {
      set_sbhl_undirected_link(direction_link, value);
    }
    return NIL;
  }

  /** Modifier: Sets the DIRECTION field of DIRECTION-LINK to NIL. @see set-sbhl-direction-link. */
  @SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 7665) 
  public static final SubLObject remove_sbhl_direction_link(SubLObject direction_link, SubLObject direction, SubLObject module) {
    checkType(module, $sym30$SBHL_MODULE_P);
    set_sbhl_direction_link(direction_link, direction, NIL, module);
    return NIL;
  }

  /** Constructor: @return sbhl-mt-links; with an entry with key MT and value TV-LINKS */
  @SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 7953) 
  public static final SubLObject create_sbhl_mt_links(SubLObject mt, SubLObject tv_links) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
        if ((NIL == sbhl_tv_links_object_p(tv_links))) {
          {
            SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($kw31$ERROR)) {
              sbhl_paranoia.sbhl_error(ONE_INTEGER, $str32$_A_is_not_a__A, tv_links, $sym40$SBHL_TV_LINKS_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else if (pcase_var.eql($kw34$CERROR)) {
              Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2180");
            } else if (pcase_var.eql($kw36$WARN)) {
              Errors.warn($str32$_A_is_not_a__A, tv_links, $sym40$SBHL_TV_LINKS_OBJECT_P);
            } else {
              Errors.warn($str37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
              Errors.cerror($str35$continue_anyway, $str32$_A_is_not_a__A, tv_links, $sym40$SBHL_TV_LINKS_OBJECT_P);
            }
          }
        }
      }
      if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
        if ((NIL == sbhl_link_vars.sbhl_mt_object_p(mt))) {
          {
            SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($kw31$ERROR)) {
              sbhl_paranoia.sbhl_error(ONE_INTEGER, $str32$_A_is_not_a__A, mt, $sym41$SBHL_MT_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else if (pcase_var.eql($kw34$CERROR)) {
              Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2181");
            } else if (pcase_var.eql($kw36$WARN)) {
              Errors.warn($str32$_A_is_not_a__A, mt, $sym41$SBHL_MT_OBJECT_P);
            } else {
              Errors.warn($str37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
              Errors.cerror($str35$continue_anyway, $str32$_A_is_not_a__A, mt, $sym41$SBHL_MT_OBJECT_P);
            }
          }
        }
      }
      {
        SubLObject mt_links = dictionary.new_dictionary(Symbols.symbol_function(EQUAL), UNPROVIDED);
        dictionary.dictionary_enter(mt_links, mt, tv_links);
        return mt_links;
      }
    }
  }

  /** Accessor: @return booleanp; whether OBJECT is a dictionary. */
  @SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 8507) 
  public static final SubLObject sbhl_mt_links_object_p(SubLObject object) {
    return dictionary.dictionary_p(object);
  }

  /** Accessor: @return sbhl-tv-links-p; the tv-links stucture after hashing on MT within MT-LINKS */
  @SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 10006) 
  public static final SubLObject get_sbhl_tv_links(SubLObject mt_links, SubLObject mt) {
    return dictionary.dictionary_lookup_without_values(mt_links, mt, UNPROVIDED);
  }

  /** Modifier: sets the value corresponding to key MT in MT-LINKS to be TV-LINKS */
  @SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 10210) 
  public static final SubLObject set_sbhl_mt_links(SubLObject mt_links, SubLObject mt, SubLObject tv_links) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != tv_links)) {
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
          if ((NIL == sbhl_tv_links_object_p(tv_links))) {
            {
              SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
              if (pcase_var.eql($kw31$ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str32$_A_is_not_a__A, tv_links, $sym40$SBHL_TV_LINKS_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
              } else if (pcase_var.eql($kw34$CERROR)) {
                Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2182");
              } else if (pcase_var.eql($kw36$WARN)) {
                Errors.warn($str32$_A_is_not_a__A, tv_links, $sym40$SBHL_TV_LINKS_OBJECT_P);
              } else {
                Errors.warn($str37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                Errors.cerror($str35$continue_anyway, $str32$_A_is_not_a__A, tv_links, $sym40$SBHL_TV_LINKS_OBJECT_P);
              }
            }
          }
        }
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
          if ((NIL == sbhl_link_vars.sbhl_mt_object_p(mt))) {
            {
              SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
              if (pcase_var.eql($kw31$ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str32$_A_is_not_a__A, mt, $sym41$SBHL_MT_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
              } else if (pcase_var.eql($kw34$CERROR)) {
                Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2183");
              } else if (pcase_var.eql($kw36$WARN)) {
                Errors.warn($str32$_A_is_not_a__A, mt, $sym41$SBHL_MT_OBJECT_P);
              } else {
                Errors.warn($str37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                Errors.cerror($str35$continue_anyway, $str32$_A_is_not_a__A, mt, $sym41$SBHL_MT_OBJECT_P);
              }
            }
          }
        }
        dictionary.dictionary_enter(mt_links, mt, tv_links);
      } else {
        dictionary.dictionary_remove(mt_links, mt);
      }
      return NIL;
    }
  }

  /** Modifier: removes data from the MT slot of MT-LINKS. */
  @SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 11950) 
  public static final SubLObject remove_sbhl_mt_link(SubLObject mt_links, SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
        if ((NIL == sbhl_mt_links_object_p(mt_links))) {
          {
            SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($kw31$ERROR)) {
              sbhl_paranoia.sbhl_error(ONE_INTEGER, $str32$_A_is_not_a__A, mt_links, $sym39$SBHL_MT_LINKS_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else if (pcase_var.eql($kw34$CERROR)) {
              Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2184");
            } else if (pcase_var.eql($kw36$WARN)) {
              Errors.warn($str32$_A_is_not_a__A, mt_links, $sym39$SBHL_MT_LINKS_OBJECT_P);
            } else {
              Errors.warn($str37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
              Errors.cerror($str35$continue_anyway, $str32$_A_is_not_a__A, mt_links, $sym39$SBHL_MT_LINKS_OBJECT_P);
            }
          }
        }
      }
      if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
        if ((NIL == sbhl_link_vars.sbhl_mt_object_p(mt))) {
          {
            SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($kw31$ERROR)) {
              sbhl_paranoia.sbhl_error(ONE_INTEGER, $str32$_A_is_not_a__A, mt, $sym41$SBHL_MT_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else if (pcase_var.eql($kw34$CERROR)) {
              Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2185");
            } else if (pcase_var.eql($kw36$WARN)) {
              Errors.warn($str32$_A_is_not_a__A, mt, $sym41$SBHL_MT_OBJECT_P);
            } else {
              Errors.warn($str37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
              Errors.cerror($str35$continue_anyway, $str32$_A_is_not_a__A, mt, $sym41$SBHL_MT_OBJECT_P);
            }
          }
        }
      }
      dictionary.dictionary_remove(mt_links, mt);
      return NIL;
    }
  }

  /** Constructor: returns new sbhl-truth-value-link with value at TRUTH set to '(NODE) */
  @SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 12205) 
  public static final SubLObject create_sbhl_tv_links(SubLObject truth, SubLObject node) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
        if ((NIL == sbhl_link_vars.sbhl_link_truth_value_p(truth))) {
          {
            SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($kw31$ERROR)) {
              sbhl_paranoia.sbhl_error(ONE_INTEGER, $str32$_A_is_not_a__A, truth, $sym42$SBHL_LINK_TRUTH_VALUE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else if (pcase_var.eql($kw34$CERROR)) {
              Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2186");
            } else if (pcase_var.eql($kw36$WARN)) {
              Errors.warn($str32$_A_is_not_a__A, truth, $sym42$SBHL_LINK_TRUTH_VALUE_P);
            } else {
              Errors.warn($str37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
              Errors.cerror($str35$continue_anyway, $str32$_A_is_not_a__A, truth, $sym42$SBHL_LINK_TRUTH_VALUE_P);
            }
          }
        }
      }
      if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
        if ((NIL == sbhl_link_vars.sbhl_node_object_p(node))) {
          {
            SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($kw31$ERROR)) {
              sbhl_paranoia.sbhl_error(ONE_INTEGER, $str32$_A_is_not_a__A, node, $sym43$SBHL_NODE_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else if (pcase_var.eql($kw34$CERROR)) {
              Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2187");
            } else if (pcase_var.eql($kw36$WARN)) {
              Errors.warn($str32$_A_is_not_a__A, node, $sym43$SBHL_NODE_OBJECT_P);
            } else {
              Errors.warn($str37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
              Errors.cerror($str35$continue_anyway, $str32$_A_is_not_a__A, node, $sym43$SBHL_NODE_OBJECT_P);
            }
          }
        }
      }
      {
        SubLObject tv_links = dictionary.new_dictionary(Symbols.symbol_function(EQ), UNPROVIDED);
        push_onto_sbhl_tv_links(tv_links, truth, node);
        return tv_links;
      }
    }
  }

  /** Accessor: @return booleanp; whether OBJECT is a @see dictionary-p */
  @SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 12747) 
  public static final SubLObject sbhl_tv_links_object_p(SubLObject object) {
    return dictionary.dictionary_p(object);
  }

  /** Accessor: @return listp; within the value at TRUTH in TV-LINKS */
  @SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 14251) 
  public static final SubLObject get_sbhl_link_nodes(SubLObject tv_links, SubLObject truth) {
    return dictionary.dictionary_lookup(tv_links, truth, UNPROVIDED);
  }

  /** Accessor: @return booleanp; whether NODE is a member of TV-LINKS corresponding to TRUTH. @see get-sbhl-link-nodes. @see member? */
  @SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 14418) 
  public static final SubLObject member_of_tv_linksP(SubLObject node, SubLObject truth, SubLObject tv_links) {
    if ((NIL != dictionary.dictionary_p(tv_links))) {
      return subl_promotions.memberP(node, get_sbhl_link_nodes(tv_links, truth), UNPROVIDED, UNPROVIDED);
    } else {
      return NIL;
    }
  }

  /** Modifier: pushes NODE onto head of value at TRUTH in TV-LINKS. @return sbhl-tv-links-p */
  @SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 15608) 
  public static final SubLObject push_onto_sbhl_tv_links(SubLObject tv_links, SubLObject truth, SubLObject node) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
        if ((NIL == sbhl_tv_links_object_p(tv_links))) {
          {
            SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($kw31$ERROR)) {
              sbhl_paranoia.sbhl_error(ONE_INTEGER, $str32$_A_is_not_a__A, tv_links, $sym40$SBHL_TV_LINKS_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else if (pcase_var.eql($kw34$CERROR)) {
              Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2188");
            } else if (pcase_var.eql($kw36$WARN)) {
              Errors.warn($str32$_A_is_not_a__A, tv_links, $sym40$SBHL_TV_LINKS_OBJECT_P);
            } else {
              Errors.warn($str37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
              Errors.cerror($str35$continue_anyway, $str32$_A_is_not_a__A, tv_links, $sym40$SBHL_TV_LINKS_OBJECT_P);
            }
          }
        }
      }
      if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
        if ((NIL == sbhl_link_vars.sbhl_link_truth_value_p(truth))) {
          {
            SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($kw31$ERROR)) {
              sbhl_paranoia.sbhl_error(ONE_INTEGER, $str32$_A_is_not_a__A, truth, $sym42$SBHL_LINK_TRUTH_VALUE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else if (pcase_var.eql($kw34$CERROR)) {
              Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2189");
            } else if (pcase_var.eql($kw36$WARN)) {
              Errors.warn($str32$_A_is_not_a__A, truth, $sym42$SBHL_LINK_TRUTH_VALUE_P);
            } else {
              Errors.warn($str37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
              Errors.cerror($str35$continue_anyway, $str32$_A_is_not_a__A, truth, $sym42$SBHL_LINK_TRUTH_VALUE_P);
            }
          }
        }
      }
      if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
        if ((NIL == sbhl_link_vars.sbhl_node_object_p(node))) {
          {
            SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($kw31$ERROR)) {
              sbhl_paranoia.sbhl_error(ONE_INTEGER, $str32$_A_is_not_a__A, node, $sym43$SBHL_NODE_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else if (pcase_var.eql($kw34$CERROR)) {
              Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2190");
            } else if (pcase_var.eql($kw36$WARN)) {
              Errors.warn($str32$_A_is_not_a__A, node, $sym43$SBHL_NODE_OBJECT_P);
            } else {
              Errors.warn($str37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
              Errors.cerror($str35$continue_anyway, $str32$_A_is_not_a__A, node, $sym43$SBHL_NODE_OBJECT_P);
            }
          }
        }
      }
      dictionary_utilities.dictionary_push(tv_links, truth, node);
      return tv_links;
    }
  }

  /** Modifier: removes NODE from the links corresponding to TRUTH within TV-LINKS. @return sbhl-tv-links-p */
  @SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 15975) 
  public static final SubLObject remove_sbhl_tv_link_node(SubLObject tv_links, SubLObject truth, SubLObject node) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
        if ((NIL == sbhl_tv_links_object_p(tv_links))) {
          {
            SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($kw31$ERROR)) {
              sbhl_paranoia.sbhl_error(ONE_INTEGER, $str32$_A_is_not_a__A, tv_links, $sym40$SBHL_TV_LINKS_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else if (pcase_var.eql($kw34$CERROR)) {
              Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2191");
            } else if (pcase_var.eql($kw36$WARN)) {
              Errors.warn($str32$_A_is_not_a__A, tv_links, $sym40$SBHL_TV_LINKS_OBJECT_P);
            } else {
              Errors.warn($str37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
              Errors.cerror($str35$continue_anyway, $str32$_A_is_not_a__A, tv_links, $sym40$SBHL_TV_LINKS_OBJECT_P);
            }
          }
        }
      }
      if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
        if ((NIL == sbhl_link_vars.sbhl_link_truth_value_p(truth))) {
          {
            SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($kw31$ERROR)) {
              sbhl_paranoia.sbhl_error(ONE_INTEGER, $str32$_A_is_not_a__A, truth, $sym42$SBHL_LINK_TRUTH_VALUE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else if (pcase_var.eql($kw34$CERROR)) {
              Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2192");
            } else if (pcase_var.eql($kw36$WARN)) {
              Errors.warn($str32$_A_is_not_a__A, truth, $sym42$SBHL_LINK_TRUTH_VALUE_P);
            } else {
              Errors.warn($str37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
              Errors.cerror($str35$continue_anyway, $str32$_A_is_not_a__A, truth, $sym42$SBHL_LINK_TRUTH_VALUE_P);
            }
          }
        }
      }
      if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
        if ((NIL == sbhl_link_vars.sbhl_node_object_p(node))) {
          {
            SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($kw31$ERROR)) {
              sbhl_paranoia.sbhl_error(ONE_INTEGER, $str32$_A_is_not_a__A, node, $sym43$SBHL_NODE_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else if (pcase_var.eql($kw34$CERROR)) {
              Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2193");
            } else if (pcase_var.eql($kw36$WARN)) {
              Errors.warn($str32$_A_is_not_a__A, node, $sym43$SBHL_NODE_OBJECT_P);
            } else {
              Errors.warn($str37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
              Errors.cerror($str35$continue_anyway, $str32$_A_is_not_a__A, node, $sym43$SBHL_NODE_OBJECT_P);
            }
          }
        }
      }
      dictionary_utilities.dictionary_delete_first_from_value(tv_links, truth, node, UNPROVIDED);
      return tv_links;
    }
  }

  /** Modifier: removes data corresponding to TRUTH within TV-LINKS. */
  @SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 16427) 
  public static final SubLObject remove_sbhl_tv_link(SubLObject tv_links, SubLObject truth) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
        if ((NIL == sbhl_tv_links_object_p(tv_links))) {
          {
            SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($kw31$ERROR)) {
              sbhl_paranoia.sbhl_error(ONE_INTEGER, $str32$_A_is_not_a__A, tv_links, $sym40$SBHL_TV_LINKS_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else if (pcase_var.eql($kw34$CERROR)) {
              Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2194");
            } else if (pcase_var.eql($kw36$WARN)) {
              Errors.warn($str32$_A_is_not_a__A, tv_links, $sym40$SBHL_TV_LINKS_OBJECT_P);
            } else {
              Errors.warn($str37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
              Errors.cerror($str35$continue_anyway, $str32$_A_is_not_a__A, tv_links, $sym40$SBHL_TV_LINKS_OBJECT_P);
            }
          }
        }
      }
      if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
        if ((NIL == sbhl_link_vars.sbhl_link_truth_value_p(truth))) {
          {
            SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($kw31$ERROR)) {
              sbhl_paranoia.sbhl_error(ONE_INTEGER, $str32$_A_is_not_a__A, truth, $sym42$SBHL_LINK_TRUTH_VALUE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else if (pcase_var.eql($kw34$CERROR)) {
              Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2195");
            } else if (pcase_var.eql($kw36$WARN)) {
              Errors.warn($str32$_A_is_not_a__A, truth, $sym42$SBHL_LINK_TRUTH_VALUE_P);
            } else {
              Errors.warn($str37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
              Errors.cerror($str35$continue_anyway, $str32$_A_is_not_a__A, truth, $sym42$SBHL_LINK_TRUTH_VALUE_P);
            }
          }
        }
      }
      dictionary.dictionary_remove(tv_links, truth);
      return NIL;
    }
  }

  public static final SubLObject declare_sbhl_links_file() {
    declareFunction(myName, "sbhl_directed_link_print_function_trampoline", "SBHL-DIRECTED-LINK-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "sbhl_directed_link_p", "SBHL-DIRECTED-LINK-P", 1, 0, false); new $sbhl_directed_link_p$UnaryFunction();
    declareFunction(myName, "sbhl_directed_link_predicate_links", "SBHL-DIRECTED-LINK-PREDICATE-LINKS", 1, 0, false);
    declareFunction(myName, "sbhl_directed_link_inverse_links", "SBHL-DIRECTED-LINK-INVERSE-LINKS", 1, 0, false);
    declareFunction(myName, "_csetf_sbhl_directed_link_predicate_links", "_CSETF-SBHL-DIRECTED-LINK-PREDICATE-LINKS", 2, 0, false);
    declareFunction(myName, "_csetf_sbhl_directed_link_inverse_links", "_CSETF-SBHL-DIRECTED-LINK-INVERSE-LINKS", 2, 0, false);
    declareFunction(myName, "make_sbhl_directed_link", "MAKE-SBHL-DIRECTED-LINK", 0, 1, false);
    declareFunction(myName, "sbhl_undirected_link_print_function_trampoline", "SBHL-UNDIRECTED-LINK-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "sbhl_undirected_link_p", "SBHL-UNDIRECTED-LINK-P", 1, 0, false); new $sbhl_undirected_link_p$UnaryFunction();
    declareFunction(myName, "sbhl_undirected_link_links", "SBHL-UNDIRECTED-LINK-LINKS", 1, 0, false);
    declareFunction(myName, "_csetf_sbhl_undirected_link_links", "_CSETF-SBHL-UNDIRECTED-LINK-LINKS", 2, 0, false);
    declareFunction(myName, "make_sbhl_undirected_link", "MAKE-SBHL-UNDIRECTED-LINK", 0, 1, false);
    //declareFunction(myName, "print_link", "PRINT-LINK", 3, 0, false);
    declareFunction(myName, "create_sbhl_directed_link", "CREATE-SBHL-DIRECTED-LINK", 2, 0, false);
    declareFunction(myName, "create_sbhl_undirected_link", "CREATE-SBHL-UNDIRECTED-LINK", 1, 0, false);
    declareFunction(myName, "create_sbhl_direction_link", "CREATE-SBHL-DIRECTION-LINK", 3, 0, false);
    declareFunction(myName, "sbhl_direction_link_p", "SBHL-DIRECTION-LINK-P", 1, 0, false);
    //declareFunction(myName, "any_sbhl_links_p", "ANY-SBHL-LINKS-P", 2, 0, false);
    declareFunction(myName, "any_sbhl_predicate_links_p", "ANY-SBHL-PREDICATE-LINKS-P", 2, 0, false);
    declareFunction(myName, "get_sbhl_directed_mt_links", "GET-SBHL-DIRECTED-MT-LINKS", 2, 0, false);
    declareFunction(myName, "get_sbhl_undirected_mt_links", "GET-SBHL-UNDIRECTED-MT-LINKS", 1, 0, false);
    declareFunction(myName, "get_sbhl_mt_links", "GET-SBHL-MT-LINKS", 3, 0, false);
    declareFunction(myName, "set_sbhl_directed_link", "SET-SBHL-DIRECTED-LINK", 3, 0, false);
    declareFunction(myName, "set_sbhl_undirected_link", "SET-SBHL-UNDIRECTED-LINK", 2, 0, false);
    declareFunction(myName, "set_sbhl_direction_link", "SET-SBHL-DIRECTION-LINK", 4, 0, false);
    declareFunction(myName, "remove_sbhl_direction_link", "REMOVE-SBHL-DIRECTION-LINK", 3, 0, false);
    declareFunction(myName, "create_sbhl_mt_links", "CREATE-SBHL-MT-LINKS", 2, 0, false);
    declareFunction(myName, "sbhl_mt_links_object_p", "SBHL-MT-LINKS-OBJECT-P", 1, 0, false);
    //declareFunction(myName, "sbhl_wf_mt_links_p", "SBHL-WF-MT-LINKS-P", 1, 0, false);
    //declareFunction(myName, "get_sbhl_graph_mt_links", "GET-SBHL-GRAPH-MT-LINKS", 3, 0, false);
    //declareFunction(myName, "get_sbhl_graph_link_mts", "GET-SBHL-GRAPH-LINK-MTS", 3, 0, false);
    declareFunction(myName, "get_sbhl_tv_links", "GET-SBHL-TV-LINKS", 2, 0, false);
    declareFunction(myName, "set_sbhl_mt_links", "SET-SBHL-MT-LINKS", 3, 0, false);
    //declareFunction(myName, "remove_sbhl_mt_link_from_graph", "REMOVE-SBHL-MT-LINK-FROM-GRAPH", 4, 0, false);
    //declareFunction(myName, "remove_sbhl_mt_link_from_relevant_directions", "REMOVE-SBHL-MT-LINK-FROM-RELEVANT-DIRECTIONS", 3, 0, false);
    declareFunction(myName, "remove_sbhl_mt_link", "REMOVE-SBHL-MT-LINK", 2, 0, false);
    declareFunction(myName, "create_sbhl_tv_links", "CREATE-SBHL-TV-LINKS", 2, 0, false);
    declareFunction(myName, "sbhl_tv_links_object_p", "SBHL-TV-LINKS-OBJECT-P", 1, 0, false);
    //declareFunction(myName, "sbhl_wf_tv_links_p", "SBHL-WF-TV-LINKS-P", 1, 0, false);
    //declareFunction(myName, "get_sbhl_graph_tv_links", "GET-SBHL-GRAPH-TV-LINKS", 4, 0, false);
    declareFunction(myName, "get_sbhl_link_nodes", "GET-SBHL-LINK-NODES", 2, 0, false);
    declareFunction(myName, "member_of_tv_linksP", "MEMBER-OF-TV-LINKS?", 3, 0, false);
    //declareFunction(myName, "any_sbhl_true_link_nodes_p", "ANY-SBHL-TRUE-LINK-NODES-P", 1, 0, false);
    //declareFunction(myName, "set_sbhl_tv_links", "SET-SBHL-TV-LINKS", 3, 0, false);
    declareFunction(myName, "push_onto_sbhl_tv_links", "PUSH-ONTO-SBHL-TV-LINKS", 3, 0, false);
    declareFunction(myName, "remove_sbhl_tv_link_node", "REMOVE-SBHL-TV-LINK-NODE", 3, 0, false);
    declareFunction(myName, "remove_sbhl_tv_link", "REMOVE-SBHL-TV-LINK", 2, 0, false);
    return NIL;
  }

  public static final SubLObject init_sbhl_links_file() {
    $dtp_sbhl_directed_link$ = defconstant("*DTP-SBHL-DIRECTED-LINK*", $sym0$SBHL_DIRECTED_LINK);
    $dtp_sbhl_undirected_link$ = defconstant("*DTP-SBHL-UNDIRECTED-LINK*", $sym16$SBHL_UNDIRECTED_LINK);
    return NIL;
  }

  public static final SubLObject setup_sbhl_links_file() {
    // CVS_ID("Id: sbhl-links.lisp 126640 2008-12-04 13:39:36Z builder ");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_sbhl_directed_link$.getGlobalValue(), Symbols.symbol_function($sym8$SBHL_DIRECTED_LINK_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym9$SBHL_DIRECTED_LINK_PREDICATE_LINKS, $sym10$_CSETF_SBHL_DIRECTED_LINK_PREDICATE_LINKS);
    Structures.def_csetf($sym11$SBHL_DIRECTED_LINK_INVERSE_LINKS, $sym12$_CSETF_SBHL_DIRECTED_LINK_INVERSE_LINKS);
    Equality.identity($sym0$SBHL_DIRECTED_LINK);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_sbhl_undirected_link$.getGlobalValue(), Symbols.symbol_function($sym23$SBHL_UNDIRECTED_LINK_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym24$SBHL_UNDIRECTED_LINK_LINKS, $sym25$_CSETF_SBHL_UNDIRECTED_LINK_LINKS);
    Equality.identity($sym16$SBHL_UNDIRECTED_LINK);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$SBHL_DIRECTED_LINK = makeSymbol("SBHL-DIRECTED-LINK");
  public static final SubLSymbol $sym1$SBHL_DIRECTED_LINK_P = makeSymbol("SBHL-DIRECTED-LINK-P");
  public static final SubLInteger $int2$220 = makeInteger(220);
  public static final SubLList $list3 = list(makeSymbol("PREDICATE-LINKS"), makeSymbol("INVERSE-LINKS"));
  public static final SubLList $list4 = list(makeKeyword("PREDICATE-LINKS"), makeKeyword("INVERSE-LINKS"));
  public static final SubLList $list5 = list(makeSymbol("SBHL-DIRECTED-LINK-PREDICATE-LINKS"), makeSymbol("SBHL-DIRECTED-LINK-INVERSE-LINKS"));
  public static final SubLList $list6 = list(makeSymbol("_CSETF-SBHL-DIRECTED-LINK-PREDICATE-LINKS"), makeSymbol("_CSETF-SBHL-DIRECTED-LINK-INVERSE-LINKS"));
  public static final SubLSymbol $sym7$PRINT_LINK = makeSymbol("PRINT-LINK");
  public static final SubLSymbol $sym8$SBHL_DIRECTED_LINK_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SBHL-DIRECTED-LINK-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym9$SBHL_DIRECTED_LINK_PREDICATE_LINKS = makeSymbol("SBHL-DIRECTED-LINK-PREDICATE-LINKS");
  public static final SubLSymbol $sym10$_CSETF_SBHL_DIRECTED_LINK_PREDICATE_LINKS = makeSymbol("_CSETF-SBHL-DIRECTED-LINK-PREDICATE-LINKS");
  public static final SubLSymbol $sym11$SBHL_DIRECTED_LINK_INVERSE_LINKS = makeSymbol("SBHL-DIRECTED-LINK-INVERSE-LINKS");
  public static final SubLSymbol $sym12$_CSETF_SBHL_DIRECTED_LINK_INVERSE_LINKS = makeSymbol("_CSETF-SBHL-DIRECTED-LINK-INVERSE-LINKS");
  public static final SubLSymbol $kw13$PREDICATE_LINKS = makeKeyword("PREDICATE-LINKS");
  public static final SubLSymbol $kw14$INVERSE_LINKS = makeKeyword("INVERSE-LINKS");
  public static final SubLString $str15$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLSymbol $sym16$SBHL_UNDIRECTED_LINK = makeSymbol("SBHL-UNDIRECTED-LINK");
  public static final SubLSymbol $sym17$SBHL_UNDIRECTED_LINK_P = makeSymbol("SBHL-UNDIRECTED-LINK-P");
  public static final SubLInteger $int18$221 = makeInteger(221);
  public static final SubLList $list19 = list(makeSymbol("LINKS"));
  public static final SubLList $list20 = list(makeKeyword("LINKS"));
  public static final SubLList $list21 = list(makeSymbol("SBHL-UNDIRECTED-LINK-LINKS"));
  public static final SubLList $list22 = list(makeSymbol("_CSETF-SBHL-UNDIRECTED-LINK-LINKS"));
  public static final SubLSymbol $sym23$SBHL_UNDIRECTED_LINK_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SBHL-UNDIRECTED-LINK-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym24$SBHL_UNDIRECTED_LINK_LINKS = makeSymbol("SBHL-UNDIRECTED-LINK-LINKS");
  public static final SubLSymbol $sym25$_CSETF_SBHL_UNDIRECTED_LINK_LINKS = makeSymbol("_CSETF-SBHL-UNDIRECTED-LINK-LINKS");
  public static final SubLSymbol $kw26$LINKS = makeKeyword("LINKS");
  public static final SubLString $str27$__ = makeString("#<");
  public static final SubLSymbol $kw28$STREAM = makeKeyword("STREAM");
  public static final SubLSymbol $kw29$BASE = makeKeyword("BASE");
  public static final SubLSymbol $sym30$SBHL_MODULE_P = makeSymbol("SBHL-MODULE-P");
  public static final SubLSymbol $kw31$ERROR = makeKeyword("ERROR");
  public static final SubLString $str32$_A_is_not_a__A = makeString("~A is not a ~A");
  public static final SubLSymbol $sym33$SBHL_PREDICATE_P = makeSymbol("SBHL-PREDICATE-P");
  public static final SubLSymbol $kw34$CERROR = makeKeyword("CERROR");
  public static final SubLString $str35$continue_anyway = makeString("continue anyway");
  public static final SubLSymbol $kw36$WARN = makeKeyword("WARN");
  public static final SubLString $str37$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");
  public static final SubLSymbol $sym38$SBHL_DIRECTED_DIRECTION_P = makeSymbol("SBHL-DIRECTED-DIRECTION-P");
  public static final SubLSymbol $sym39$SBHL_MT_LINKS_OBJECT_P = makeSymbol("SBHL-MT-LINKS-OBJECT-P");
  public static final SubLSymbol $sym40$SBHL_TV_LINKS_OBJECT_P = makeSymbol("SBHL-TV-LINKS-OBJECT-P");
  public static final SubLSymbol $sym41$SBHL_MT_OBJECT_P = makeSymbol("SBHL-MT-OBJECT-P");
  public static final SubLSymbol $sym42$SBHL_LINK_TRUTH_VALUE_P = makeSymbol("SBHL-LINK-TRUTH-VALUE-P");
  public static final SubLSymbol $sym43$SBHL_NODE_OBJECT_P = makeSymbol("SBHL-NODE-OBJECT-P");
  public static final SubLSymbol $sym44$SBHL_LINK_NODES_OBJECT_P = makeSymbol("SBHL-LINK-NODES-OBJECT-P");

  //// Initializers

  public void declareFunctions() {
    declare_sbhl_links_file();
  }

  public void initializeVariables() {
    init_sbhl_links_file();
  }

  public void runTopLevelForms() {
    setup_sbhl_links_file();
  }

}
