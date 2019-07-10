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

package com.cyc.cycjava_1.cycl;

import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.cycl_grammar;
//dm import com.cyc.cycjava_1.cycl.el_utilities;

public  final class el_grammar extends SubLTranslatedFile {

  //// Constructor

  private el_grammar() {}
  public static final SubLFile me = new el_grammar();
  public static final String myName = "com.cyc.cycjava_1.cycl.el_grammar";

  //// Definitions

  /** returns t iff SENTENCE is an EL sentence, but not an EL formula.
   currently (11/9/99) the only such animals are #$True, #$False, and EL variables. */
  @SubL(source = "cycl/el-grammar.lisp", position = 1407) 
  public static final SubLObject el_non_formula_sentence_p(SubLObject sentence) {
    return makeBoolean(((NIL == el_utilities.el_formula_p(sentence))
           && (NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 6562"))));
  }

  /** Like @xref cycl-literal-p except it only permits EL constructs. */
  @SubL(source = "cycl/el-grammar.lisp", position = 4596) 
  public static final SubLObject el_literal_p(SubLObject object) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = cycl_grammar.$grammar_permits_hlP$.currentBinding(thread);
          try {
            cycl_grammar.$grammar_permits_hlP$.bind(NIL, thread);
            result = cycl_grammar.cycl_literal_p(object);
          } finally {
            cycl_grammar.$grammar_permits_hlP$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  public static final SubLObject declare_el_grammar_file() {
    //declareFunction(myName, "why_not_el_sentence", "WHY-NOT-EL-SENTENCE", 1, 0, false);
    //declareFunction(myName, "el_sentence_p", "EL-SENTENCE-P", 1, 0, false);
    declareFunction(myName, "el_non_formula_sentence_p", "EL-NON-FORMULA-SENTENCE-P", 1, 0, false);
    //declareFunction(myName, "non_el_formula_sentence_p", "NON-EL-FORMULA-SENTENCE-P", 1, 0, false);
    //declareFunction(myName, "el_sentence_sequence_p", "EL-SENTENCE-SEQUENCE-P", 1, 0, false);
    //declareFunction(myName, "el_unary_sentence_p", "EL-UNARY-SENTENCE-P", 1, 0, false);
    //declareFunction(myName, "el_binary_sentence_p", "EL-BINARY-SENTENCE-P", 1, 0, false);
    //declareFunction(myName, "el_ternary_sentence_p", "EL-TERNARY-SENTENCE-P", 1, 0, false);
    //declareFunction(myName, "el_quaternary_sentence_p", "EL-QUATERNARY-SENTENCE-P", 1, 0, false);
    //declareFunction(myName, "el_quintary_sentence_p", "EL-QUINTARY-SENTENCE-P", 1, 0, false);
    //declareFunction(myName, "el_variable_arity_sentence_p", "EL-VARIABLE-ARITY-SENTENCE-P", 1, 0, false);
    //declareFunction(myName, "el_regularly_quantified_sentence_p", "EL-REGULARLY-QUANTIFIED-SENTENCE-P", 1, 0, false);
    //declareFunction(myName, "el_bounded_existential_sentence_p", "EL-BOUNDED-EXISTENTIAL-SENTENCE-P", 1, 0, false);
    //declareFunction(myName, "el_quantified_sentence_p", "EL-QUANTIFIED-SENTENCE-P", 1, 0, false);
    declareFunction(myName, "el_literal_p", "EL-LITERAL-P", 1, 0, false);
    //declareFunction(myName, "el_atomic_sentence_p", "EL-ATOMIC-SENTENCE-P", 1, 0, false);
    //declareFunction(myName, "el_argument_sequence_p", "EL-ARGUMENT-SEQUENCE-P", 1, 0, false);
    //declareFunction(myName, "el_predicate_syntax_p", "EL-PREDICATE-SYNTAX-P", 1, 0, false);
    //declareFunction(myName, "el_nat_p", "EL-NAT-P", 1, 0, false);
    //declareFunction(myName, "el_function_p", "EL-FUNCTION-P", 1, 0, false);
    //declareFunction(myName, "el_expression_p", "EL-EXPRESSION-P", 1, 0, false);
    //declareFunction(myName, "el_term_p", "EL-TERM-P", 1, 0, false);
    //declareFunction(myName, "el_denotational_term_p", "EL-DENOTATIONAL-TERM-P", 1, 0, false);
    //declareFunction(myName, "el_represented_term_p", "EL-REPRESENTED-TERM-P", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_el_grammar_file() {
    return NIL;
  }

  public static final SubLObject setup_el_grammar_file() {
    // CVS_ID("Id: el-grammar.lisp 126640 2008-12-04 13:39:36Z builder ");
    return NIL;
  }

  //// Initializers

  public void declareFunctions() {
    declare_el_grammar_file();
  }

  public void initializeVariables() {
    init_el_grammar_file();
  }

  public void runTopLevelForms() {
    setup_el_grammar_file();
  }

}
