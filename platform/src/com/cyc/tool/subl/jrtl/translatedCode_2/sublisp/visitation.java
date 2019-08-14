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

package  com.cyc.tool.subl.jrtl.translatedCode_2.sublisp;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public  final class visitation extends SubLTranslatedFile {

  //// Constructor

  private visitation() {}
  public static final SubLFile me = new visitation();
  public static final String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation";

  //// Definitions

  /** The entry point into the type-dispatched visitation methods. */
  @SubL(source = "sublisp/visitation.lisp", position = 283) 
  public static final SubLObject visit_defstruct(SubLObject obj, SubLObject visitor_fn) {
    return visit_defstruct_object(obj, visitor_fn);
  }

  @SubL(source = "sublisp/visitation.lisp", position = 492) 
  public static SubLSymbol $visit_defstruct_object_method_table$ = null;

  /** The per-type implementation of the defstruct visitor. */
  @SubL(source = "sublisp/visitation.lisp", position = 492) 
  public static final SubLObject visit_defstruct_object(SubLObject obj, SubLObject visitor_fn) {
    {
      SubLObject method_function = Structures.method_func(obj, $visit_defstruct_object_method_table$.getGlobalValue());
      if ((NIL != method_function)) {
        return funcall(method_function, obj, visitor_fn);
      }
      return Errors.error($str1$No_visitation_function_defined_fo, Types.type_of(obj));
    }
  }

  /** Default method called by all non defstructs in the common system. */
  @SubL(source = "sublisp/visitation.lisp", position = 700) 
  public static final SubLObject visit_defstruct_noop(SubLObject obj, SubLObject visitor_fn) {
    return obj;
  }

  @SubL(source = "sublisp/visitation.lisp", position = 853) 
  public static final SubLObject visit_defstruct_object_integer_method(SubLObject obj, SubLObject visitor_fn) {
    return visit_defstruct_noop(obj, visitor_fn);
  }

  @SubL(source = "sublisp/visitation.lisp", position = 967) 
  public static final SubLObject visit_defstruct_object_float_method(SubLObject obj, SubLObject visitor_fn) {
    return visit_defstruct_noop(obj, visitor_fn);
  }

  @SubL(source = "sublisp/visitation.lisp", position = 1078) 
  public static final SubLObject visit_defstruct_object_string_method(SubLObject obj, SubLObject visitor_fn) {
    return visit_defstruct_noop(obj, visitor_fn);
  }

  @SubL(source = "sublisp/visitation.lisp", position = 1190) 
  public static final SubLObject visit_defstruct_object_character_method(SubLObject obj, SubLObject visitor_fn) {
    return visit_defstruct_noop(obj, visitor_fn);
  }

  @SubL(source = "sublisp/visitation.lisp", position = 1305) 
  public static final SubLObject visit_defstruct_object_symbol_method(SubLObject obj, SubLObject visitor_fn) {
    return visit_defstruct_noop(obj, visitor_fn);
  }

  @SubL(source = "sublisp/visitation.lisp", position = 1417) 
  public static final SubLObject visit_defstruct_object_vector_method(SubLObject obj, SubLObject visitor_fn) {
    return visit_defstruct_noop(obj, visitor_fn);
  }

  @SubL(source = "sublisp/visitation.lisp", position = 1529) 
  public static final SubLObject visit_defstruct_object_cons_method(SubLObject obj, SubLObject visitor_fn) {
    return visit_defstruct_noop(obj, visitor_fn);
  }

  @SubL(source = "sublisp/visitation.lisp", position = 1639) 
  public static final SubLObject visit_defstruct_object_hash_table_method(SubLObject obj, SubLObject visitor_fn) {
    return visit_defstruct_noop(obj, visitor_fn);
  }

  /** @stub implementation */
  @SubL(source = "sublisp/visitation.lisp", position = 1755) 
  public static final SubLObject print_visitor(SubLObject obj, SubLObject phase, SubLObject slot, SubLObject value) {
    return PrintLow.format(T, $str10$_A__A__A___A__, new SubLObject[] {phase, obj, slot, value});
  }

  public static final SubLObject declare_visitation_file() {
    declareFunction("visit_defstruct", "VISIT-DEFSTRUCT", 2, 0, false);
    declareFunction("visit_defstruct_object", "VISIT-DEFSTRUCT-OBJECT", 2, 0, false);
    declareFunction("visit_defstruct_noop", "VISIT-DEFSTRUCT-NOOP", 2, 0, false);
    declareFunction("visit_defstruct_object_integer_method", "VISIT-DEFSTRUCT-OBJECT-INTEGER-METHOD", 2, 0, false);
    declareFunction("visit_defstruct_object_float_method", "VISIT-DEFSTRUCT-OBJECT-FLOAT-METHOD", 2, 0, false);
    declareFunction("visit_defstruct_object_string_method", "VISIT-DEFSTRUCT-OBJECT-STRING-METHOD", 2, 0, false);
    declareFunction("visit_defstruct_object_character_method", "VISIT-DEFSTRUCT-OBJECT-CHARACTER-METHOD", 2, 0, false);
    declareFunction("visit_defstruct_object_symbol_method", "VISIT-DEFSTRUCT-OBJECT-SYMBOL-METHOD", 2, 0, false);
    declareFunction("visit_defstruct_object_vector_method", "VISIT-DEFSTRUCT-OBJECT-VECTOR-METHOD", 2, 0, false);
    declareFunction("visit_defstruct_object_cons_method", "VISIT-DEFSTRUCT-OBJECT-CONS-METHOD", 2, 0, false);
    declareFunction("visit_defstruct_object_hash_table_method", "VISIT-DEFSTRUCT-OBJECT-HASH-TABLE-METHOD", 2, 0, false);
    declareFunction("print_visitor", "PRINT-VISITOR", 4, 0, false);
    return NIL;
  }

  public static final SubLObject init_visitation_file() {
    $visit_defstruct_object_method_table$ = deflexical("*VISIT-DEFSTRUCT-OBJECT-METHOD-TABLE*", Vectors.make_vector($int0$256, NIL));
    return NIL;
  }

  public static final SubLObject setup_visitation_file() {
        Structures.register_method($visit_defstruct_object_method_table$.getGlobalValue(), Types.$dtp_bignum$.getGlobalValue(), Symbols.symbol_function($sym2$VISIT_DEFSTRUCT_OBJECT_INTEGER_METHOD));
    Structures.register_method($visit_defstruct_object_method_table$.getGlobalValue(), Types.$dtp_fixnum$.getGlobalValue(), Symbols.symbol_function($sym2$VISIT_DEFSTRUCT_OBJECT_INTEGER_METHOD));
    Structures.register_method($visit_defstruct_object_method_table$.getGlobalValue(), Types.$dtp_float$.getGlobalValue(), Symbols.symbol_function($sym3$VISIT_DEFSTRUCT_OBJECT_FLOAT_METHOD));
    Structures.register_method($visit_defstruct_object_method_table$.getGlobalValue(), Types.$dtp_string$.getGlobalValue(), Symbols.symbol_function($sym4$VISIT_DEFSTRUCT_OBJECT_STRING_METHOD));
    Structures.register_method($visit_defstruct_object_method_table$.getGlobalValue(), Types.$dtp_character$.getGlobalValue(), Symbols.symbol_function($sym5$VISIT_DEFSTRUCT_OBJECT_CHARACTER_METHOD));
    Structures.register_method($visit_defstruct_object_method_table$.getGlobalValue(), Types.$dtp_symbol$.getGlobalValue(), Symbols.symbol_function($sym6$VISIT_DEFSTRUCT_OBJECT_SYMBOL_METHOD));
    Structures.register_method($visit_defstruct_object_method_table$.getGlobalValue(), Types.$dtp_vector$.getGlobalValue(), Symbols.symbol_function($sym7$VISIT_DEFSTRUCT_OBJECT_VECTOR_METHOD));
    Structures.register_method($visit_defstruct_object_method_table$.getGlobalValue(), Types.$dtp_cons$.getGlobalValue(), Symbols.symbol_function($sym8$VISIT_DEFSTRUCT_OBJECT_CONS_METHOD));
    Structures.register_method($visit_defstruct_object_method_table$.getGlobalValue(), Types.$dtp_hash_table$.getGlobalValue(), Symbols.symbol_function($sym9$VISIT_DEFSTRUCT_OBJECT_HASH_TABLE_METHOD));
    return NIL;
  }

  //// Internal Constants

  public static final SubLInteger $int0$256 = makeInteger(256);
  public static final SubLString $str1$No_visitation_function_defined_fo = makeString("No visitation function defined for ~A.");
  public static final SubLSymbol $sym2$VISIT_DEFSTRUCT_OBJECT_INTEGER_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-INTEGER-METHOD");
  public static final SubLSymbol $sym3$VISIT_DEFSTRUCT_OBJECT_FLOAT_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-FLOAT-METHOD");
  public static final SubLSymbol $sym4$VISIT_DEFSTRUCT_OBJECT_STRING_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-STRING-METHOD");
  public static final SubLSymbol $sym5$VISIT_DEFSTRUCT_OBJECT_CHARACTER_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-CHARACTER-METHOD");
  public static final SubLSymbol $sym6$VISIT_DEFSTRUCT_OBJECT_SYMBOL_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SYMBOL-METHOD");
  public static final SubLSymbol $sym7$VISIT_DEFSTRUCT_OBJECT_VECTOR_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-VECTOR-METHOD");
  public static final SubLSymbol $sym8$VISIT_DEFSTRUCT_OBJECT_CONS_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-CONS-METHOD");
  public static final SubLSymbol $sym9$VISIT_DEFSTRUCT_OBJECT_HASH_TABLE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-HASH-TABLE-METHOD");
  public static final SubLString $str10$_A__A__A___A__ = makeString("~A ~A ~A: ~A~%");

  //// Initializers

  public void declareFunctions() {
    declare_visitation_file();
  }

  public void initializeVariables() {
    init_visitation_file();
  }

  public void runTopLevelForms() {
    setup_visitation_file();
  }

}
