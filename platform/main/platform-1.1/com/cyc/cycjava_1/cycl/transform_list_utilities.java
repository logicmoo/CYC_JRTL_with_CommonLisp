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

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.eval_in_api;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;

public  final class transform_list_utilities extends SubLTranslatedFile {

  //// Constructor

  private transform_list_utilities() {}
  public static final SubLFile me = new transform_list_utilities();
  public static final String myName = "com.cyc.cycjava_1.cycl.transform_list_utilities";

  //// Definitions

  @SubL(source = "cycl/transform-list-utilities.lisp", position = 1490) 
  public static SubLSymbol $default_recursion_limit$ = null;

  @SubL(source = "cycl/transform-list-utilities.lisp", position = 1546) 
  public static SubLSymbol $default_transformation_max$ = null;

  @SubL(source = "cycl/transform-list-utilities.lisp", position = 1601) 
  public static SubLSymbol $default_quiescent_transformation_max$ = null;

  @SubL(source = "cycl/transform-list-utilities.lisp", position = 1667) 
  public static final SubLObject transform_pred_funcall(SubLObject pred, SubLObject object) {
    return eval_in_api.possibly_cyc_api_funcall_1(pred, object);
  }

  @SubL(source = "cycl/transform-list-utilities.lisp", position = 1930) 
  public static final SubLObject transform_transform_funcall(SubLObject transform, SubLObject object) {
    return eval_in_api.possibly_cyc_api_funcall_1(transform, object);
  }

  /** Recursively descends through OBJECT, destructively applying TRANSFORM when PRED succeeds.
   Make sure that the result of TRANSFORM will not succeed on PRED, otherwise it may 'infinitely' recurse.
   example: (transform '(1 "2" (3 4 "5")) #'stringp 'read-from-string) -> (1 2 (3 4 5))
   @throws :transformation-limit-exceeded
   @owner pace */
  @SubL(source = "cycl/transform-list-utilities.lisp", position = 2183) 
  public static final SubLObject transform(SubLObject object, SubLObject pred, SubLObject transform, SubLObject key) {
    if ((key == UNPROVIDED)) {
      key = Symbols.symbol_function(IDENTITY);
    }
    return ntransform(conses_high.copy_tree(object), pred, transform, key, UNPROVIDED, UNPROVIDED);
  }

  /** A destructive version of @xref transform.
   @param object; The object to be transformed.
   @param pred; A predicate that returns true if an object is to be transformed by transform.
   @param transform; A function that returns the result of transforming an object.
   @param key; A function that maps an object to a value that is to be transformed.
   @param recursion-limit; The maximum depth that the algorithm is allowed to recurse.
          Once this limit is exceeded, the transformation continues by means of an
          iterative algorithm.
   @param transformation-max; The maximum number of transformations to be performed before
          throwing :transformation-limit-exceeded.  If this parameter is given NIL as a value,
          no limit is imposed on the number of transformations.
   @throws :transformation-limit-exceeded
   @owner sdevoy */
  @SubL(source = "cycl/transform-list-utilities.lisp", position = 2728) 
  public static final SubLObject ntransform(SubLObject object, SubLObject pred, SubLObject transform, SubLObject key, SubLObject recursion_limit, SubLObject transformation_max) {
    if ((key == UNPROVIDED)) {
      key = Symbols.symbol_function(IDENTITY);
    }
    if ((recursion_limit == UNPROVIDED)) {
      recursion_limit = $default_recursion_limit$.getDynamicValue();
    }
    if ((transformation_max == UNPROVIDED)) {
      transformation_max = $default_transformation_max$.getDynamicValue();
    }
    return ((NIL != transformation_max) ? ((SubLObject) Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 7713")) : ntransform_recursive(object, pred, transform, key, recursion_limit, ZERO_INTEGER));
  }

  /** A destructive recursive version of $xref transform.
   This function transforms as it iterates down the cdr of transformations and recurses as it
   transforms their cars.  When the recusion limit is reached, it switches to a purely iterative
   algorithm by calling ntransform-iterative.
   @owner sdevoy */
  @SubL(source = "cycl/transform-list-utilities.lisp", position = 3986) 
  public static final SubLObject ntransform_recursive(SubLObject object, SubLObject pred, SubLObject transform, SubLObject key, SubLObject recursion_limit, SubLObject recursion_level) {
    if (recursion_level.numGE(recursion_limit)) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 7700");
    } else {
      {
        SubLObject initial_transformed_object = ntransform_perform_transform(object, pred, transform, key);
        SubLObject transformed_list_tail = initial_transformed_object;
        for (; (!(transformed_list_tail.isAtom())); ) {
          ConsesLow.rplaca(transformed_list_tail, ntransform_recursive(transformed_list_tail.first(), pred, transform, key, recursion_limit, Numbers.add(recursion_level, ONE_INTEGER)));
          ConsesLow.rplacd(transformed_list_tail, ntransform_perform_transform(transformed_list_tail.rest(), pred, transform, key));
          transformed_list_tail = transformed_list_tail.rest();
        }
        return initial_transformed_object;
      }
    }
  }

  @SubL(source = "cycl/transform-list-utilities.lisp", position = 7909) 
  public static final SubLObject ntransform_perform_transform(SubLObject object, SubLObject pred, SubLObject transform, SubLObject key) {
    if ((key.eql(Symbols.symbol_function(IDENTITY))
        || key.eql(IDENTITY))) {
      {
        SubLObject previous_transformation = object;
        SubLObject transformation = NIL;
        for (transformation = ((NIL != transform_pred_funcall(pred, object)) ? ((SubLObject) conses_high.copy_tree(transform_transform_funcall(transform, object))) : object); (previous_transformation != transformation); transformation = ((NIL != transform_pred_funcall(pred, transformation)) ? ((SubLObject) conses_high.copy_tree(transform_transform_funcall(transform, transformation))) : transformation)) {
          previous_transformation = transformation;
        }
        return transformation;
      }
    } else {
      {
        SubLObject previous_transformation = object;
        SubLObject transformation = NIL;
        for (transformation = ((NIL != transform_pred_funcall(pred, object)) ? ((SubLObject) conses_high.copy_tree(transform_transform_funcall(transform, Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 7716")))) : object); (previous_transformation != transformation); transformation = ((NIL != transform_pred_funcall(pred, transformation)) ? ((SubLObject) conses_high.copy_tree(transform_transform_funcall(transform, Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 7717")))) : transformation)) {
          previous_transformation = transformation;
        }
        return transformation;
      }
    }
  }

  @SubL(source = "cycl/transform-list-utilities.lisp", position = 15762) 
  public static final SubLObject quiescent_transform(SubLObject object, SubLObject pred, SubLObject transform, SubLObject key, SubLObject quiescence) {
    if ((key == UNPROVIDED)) {
      key = Symbols.symbol_function(IDENTITY);
    }
    if ((quiescence == UNPROVIDED)) {
      quiescence = Symbols.symbol_function(EQUAL);
    }
    return quiescent_ntransform(conses_high.copy_tree(object), pred, transform, key, quiescence, UNPROVIDED, UNPROVIDED);
  }

  /** Calls 'quiescent-ntransform-recursive' to iteratively transform object and then its transformation
   using 'transform' so long as 'pred' succeeds and the application of 'quiescence' to the transformation
   of the object fails.  Upon finishing a series of transformations, 'quiescent-ntransform-recursive'
   is then recursively applied to the 'car' of the transformation while successive 'cdrs' of the transformation
   are transformed according to the same algorithm.  If, in the process of transformation, the recursion
   limit 'recusion-limit' is reached, then 'quiescent-ntransform-iterative' is called to solve the
   subtransformation without recursion.
   @param recursion-limit; The maximum depth that the algorithm is allowed to recurse.
          Once this limit is exceeded, the transformation continues by means of an
          iterative algorithm.
   @param transformation-max; The maximum number of transformations to be performed before
          throwing :transformation-limit-exceeded.  If this parameter is given NIL as a value,
          no limit is imposed on the number of transformations.
   @throws :transformation-limit-exceeded
   @owner sdevoy */
  @SubL(source = "cycl/transform-list-utilities.lisp", position = 16049) 
  public static final SubLObject quiescent_ntransform(SubLObject object, SubLObject pred, SubLObject transform, SubLObject key, SubLObject quiescence, SubLObject recursion_limit, SubLObject transformation_max) {
    if ((key == UNPROVIDED)) {
      key = Symbols.symbol_function(IDENTITY);
    }
    if ((quiescence == UNPROVIDED)) {
      quiescence = Symbols.symbol_function(EQUAL);
    }
    if ((recursion_limit == UNPROVIDED)) {
      recursion_limit = $default_recursion_limit$.getDynamicValue();
    }
    if ((transformation_max == UNPROVIDED)) {
      transformation_max = $default_quiescent_transformation_max$.getDynamicValue();
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != transformation_max)) {
        thread.resetMultipleValues();
        {
          SubLObject transformed_object = shy_quiescent_ntransform_recursive(object, pred, transform, key, quiescence, recursion_limit, ZERO_INTEGER, transformation_max, ZERO_INTEGER);
          SubLObject transformation_count = thread.secondMultipleValue();
          thread.resetMultipleValues();
          return transformed_object;
        }
      } else {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 7706");
      }
    }
  }

  /** See documentation for quiescent-ntransform.
   @owner sdevoy */
  @SubL(source = "cycl/transform-list-utilities.lisp", position = 19749) 
  public static final SubLObject shy_quiescent_ntransform_recursive(SubLObject object, SubLObject pred, SubLObject transform, SubLObject key, SubLObject quiescence, SubLObject recursion_limit, SubLObject recursion_level, SubLObject transformation_max, SubLObject transformation_count) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (recursion_level.numGE(recursion_limit)) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 7715");
      } else {
        thread.resetMultipleValues();
        {
          SubLObject initial_transformed_object = shy_ntransform_perform_quiescent_transform(object, pred, transform, key, quiescence, transformation_max, transformation_count);
          SubLObject new_transformation_count = thread.secondMultipleValue();
          thread.resetMultipleValues();
          {
            SubLObject transformed_list_tail = initial_transformed_object;
            SubLObject transformed_object = NIL;
            for (; (!(transformed_list_tail.isAtom())); ) {
              thread.resetMultipleValues();
              {
                SubLObject transformed_object_7 = shy_quiescent_ntransform_recursive(transformed_list_tail.first(), pred, transform, key, quiescence, recursion_limit, Numbers.add(recursion_level, ONE_INTEGER), transformation_max, new_transformation_count);
                SubLObject new_transformation_count_8 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                transformed_object = transformed_object_7;
                new_transformation_count = new_transformation_count_8;
              }
              ConsesLow.rplaca(transformed_list_tail, transformed_object);
              thread.resetMultipleValues();
              {
                SubLObject transformed_object_9 = shy_ntransform_perform_quiescent_transform(transformed_list_tail.rest(), pred, transform, key, quiescence, transformation_max, new_transformation_count);
                SubLObject new_transformation_count_10 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                transformed_object = transformed_object_9;
                new_transformation_count = new_transformation_count_10;
              }
              ConsesLow.rplacd(transformed_list_tail, transformed_object);
              transformed_list_tail = transformed_list_tail.rest();
            }
            return Values.values(initial_transformed_object, new_transformation_count);
          }
        }
      }
    }
  }

  @SubL(source = "cycl/transform-list-utilities.lisp", position = 27679) 
  public static final SubLObject shy_ntransform_perform_quiescent_transform(SubLObject object, SubLObject pred, SubLObject transform, SubLObject key, SubLObject quiescence, SubLObject transformation_max, SubLObject transformation_count) {
    if ((key.eql(Symbols.symbol_function(IDENTITY))
        || key.eql(IDENTITY))) {
      if ((quiescence.eql(Symbols.symbol_function(EQUAL))
          || quiescence.equal(EQUAL))) {
        {
          SubLObject previous_transformation = object;
          SubLObject transformation = NIL;
          for (transformation = ((NIL != transform_pred_funcall(pred, object)) ? ((SubLObject) conses_high.copy_tree(transform_transform_funcall(transform, object))) : object); (!(((previous_transformation == transformation)
                || previous_transformation.equal(transformation)))); transformation = ((NIL != transform_pred_funcall(pred, transformation)) ? ((SubLObject) conses_high.copy_tree(transform_transform_funcall(transform, transformation))) : transformation)) {
            if (transformation_count.numGE(transformation_max)) {
              Dynamic.sublisp_throw($kw4$TRANSFORMATION_LIMIT_EXCEEDED, list($kw4$TRANSFORMATION_LIMIT_EXCEEDED, transformation_count, transformation_max));
            }
            transformation_count = Numbers.add(transformation_count, ONE_INTEGER);
            previous_transformation = transformation;
          }
          return Values.values(transformation, transformation_count);
        }
      } else {
        {
          SubLObject previous_transformation = object;
          SubLObject transformation = NIL;
          for (transformation = ((NIL != transform_pred_funcall(pred, object)) ? ((SubLObject) conses_high.copy_tree(transform_transform_funcall(transform, object))) : object); (!(((previous_transformation == transformation)
                || (NIL != Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 7722"))))); transformation = ((NIL != transform_pred_funcall(pred, transformation)) ? ((SubLObject) conses_high.copy_tree(transform_transform_funcall(transform, transformation))) : transformation)) {
            if (transformation_count.numGE(transformation_max)) {
              Dynamic.sublisp_throw($kw4$TRANSFORMATION_LIMIT_EXCEEDED, list($kw4$TRANSFORMATION_LIMIT_EXCEEDED, transformation_count, transformation_max));
            }
            transformation_count = Numbers.add(transformation_count, ONE_INTEGER);
            previous_transformation = transformation;
          }
          return Values.values(transformation, transformation_count);
        }
      }
    } else {
      if ((quiescence.eql(Symbols.symbol_function(EQUAL))
          || quiescence.equal(EQUAL))) {
        {
          SubLObject previous_transformation = object;
          SubLObject transformation = NIL;
          for (transformation = ((NIL != transform_pred_funcall(pred, object)) ? ((SubLObject) conses_high.copy_tree(transform_transform_funcall(transform, Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 7718")))) : object); (!(((previous_transformation == transformation)
                || previous_transformation.equal(transformation)))); transformation = ((NIL != transform_pred_funcall(pred, transformation)) ? ((SubLObject) conses_high.copy_tree(transform_transform_funcall(transform, Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 7719")))) : transformation)) {
            if (transformation_count.numGE(transformation_max)) {
              Dynamic.sublisp_throw($kw4$TRANSFORMATION_LIMIT_EXCEEDED, list($kw4$TRANSFORMATION_LIMIT_EXCEEDED, transformation_count, transformation_max));
            }
            transformation_count = Numbers.add(transformation_count, ONE_INTEGER);
            previous_transformation = transformation;
          }
          return Values.values(transformation, transformation_count);
        }
      } else {
        {
          SubLObject previous_transformation = object;
          SubLObject transformation = NIL;
          for (transformation = ((NIL != transform_pred_funcall(pred, object)) ? ((SubLObject) conses_high.copy_tree(transform_transform_funcall(transform, Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 7720")))) : object); (!(((previous_transformation == transformation)
                || (NIL != Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 7723"))))); transformation = ((NIL != transform_pred_funcall(pred, transformation)) ? ((SubLObject) conses_high.copy_tree(transform_transform_funcall(transform, Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 7721")))) : transformation)) {
            if (transformation_count.numGE(transformation_max)) {
              Dynamic.sublisp_throw($kw4$TRANSFORMATION_LIMIT_EXCEEDED, list($kw4$TRANSFORMATION_LIMIT_EXCEEDED, transformation_count, transformation_max));
            }
            transformation_count = Numbers.add(transformation_count, ONE_INTEGER);
            previous_transformation = transformation;
          }
          return Values.values(transformation, transformation_count);
        }
      }
    }
  }

  public static final SubLObject declare_transform_list_utilities_file() {
    declareFunction(myName, "transform_pred_funcall", "TRANSFORM-PRED-FUNCALL", 2, 0, false);
    //declareFunction(myName, "transform_key_funcall", "TRANSFORM-KEY-FUNCALL", 2, 0, false);
    declareFunction(myName, "transform_transform_funcall", "TRANSFORM-TRANSFORM-FUNCALL", 2, 0, false);
    //declareFunction(myName, "transform_quiescence_funcall", "TRANSFORM-QUIESCENCE-FUNCALL", 3, 0, false);
    declareFunction(myName, "transform", "TRANSFORM", 3, 1, false);
    declareFunction(myName, "ntransform", "NTRANSFORM", 3, 3, false);
    declareFunction(myName, "ntransform_recursive", "NTRANSFORM-RECURSIVE", 6, 0, false);
    //declareFunction(myName, "shy_ntransform_recursive", "SHY-NTRANSFORM-RECURSIVE", 8, 0, false);
    declareFunction(myName, "ntransform_perform_transform", "NTRANSFORM-PERFORM-TRANSFORM", 4, 0, false);
    //declareFunction(myName, "shy_ntransform_perform_transform", "SHY-NTRANSFORM-PERFORM-TRANSFORM", 6, 0, false);
    //declareFunction(myName, "make_ntransform_info", "MAKE-NTRANSFORM-INFO", 3, 0, false);
    //declareFunction(myName, "reuse_ntransform_info", "REUSE-NTRANSFORM-INFO", 4, 0, false);
    //declareMacro(myName, "get_ntransform_info_parent_cons", "GET-NTRANSFORM-INFO-PARENT-CONS");
    //declareMacro(myName, "get_ntransform_info_set_op", "GET-NTRANSFORM-INFO-SET-OP");
    //declareMacro(myName, "get_ntransform_info_value", "GET-NTRANSFORM-INFO-VALUE");
    //declareMacro(myName, "set_ntransform_info_parent_cons", "SET-NTRANSFORM-INFO-PARENT-CONS");
    //declareMacro(myName, "set_ntransform_info_set_op", "SET-NTRANSFORM-INFO-SET-OP");
    //declareMacro(myName, "set_ntransform_info_value", "SET-NTRANSFORM-INFO-VALUE");
    //declareFunction(myName, "ntransform_iterative", "NTRANSFORM-ITERATIVE", 3, 1, false);
    //declareFunction(myName, "shy_ntransform_iterative", "SHY-NTRANSFORM-ITERATIVE", 3, 3, false);
    declareFunction(myName, "quiescent_transform", "QUIESCENT-TRANSFORM", 3, 2, false);
    declareFunction(myName, "quiescent_ntransform", "QUIESCENT-NTRANSFORM", 3, 4, false);
    //declareFunction(myName, "quiescent_ntransform_recursive", "QUIESCENT-NTRANSFORM-RECURSIVE", 7, 0, false);
    declareFunction(myName, "shy_quiescent_ntransform_recursive", "SHY-QUIESCENT-NTRANSFORM-RECURSIVE", 9, 0, false);
    //declareFunction(myName, "quiescent_ntransform_iterative", "QUIESCENT-NTRANSFORM-ITERATIVE", 3, 2, false);
    //declareFunction(myName, "shy_quiescent_ntransform_iterative", "SHY-QUIESCENT-NTRANSFORM-ITERATIVE", 3, 4, false);
    //declareFunction(myName, "ntransform_perform_quiescent_transform", "NTRANSFORM-PERFORM-QUIESCENT-TRANSFORM", 5, 0, false);
    declareFunction(myName, "shy_ntransform_perform_quiescent_transform", "SHY-NTRANSFORM-PERFORM-QUIESCENT-TRANSFORM", 7, 0, false);
    return NIL;
  }

  public static final SubLObject init_transform_list_utilities_file() {
    $default_recursion_limit$ = defparameter("*DEFAULT-RECURSION-LIMIT*", $int0$212);
    $default_transformation_max$ = defparameter("*DEFAULT-TRANSFORMATION-MAX*", NIL);
    $default_quiescent_transformation_max$ = defparameter("*DEFAULT-QUIESCENT-TRANSFORMATION-MAX*", $int1$1024);
    return NIL;
  }

  public static final SubLObject setup_transform_list_utilities_file() {
    // CVS_ID("Id: transform-list-utilities.lisp 126640 2008-12-04 13:39:36Z builder ");
    access_macros.register_external_symbol($sym2$TRANSFORM);
    access_macros.register_external_symbol($sym3$NTRANSFORM);
    access_macros.register_external_symbol($sym15$QUIESCENT_TRANSFORM);
    access_macros.register_external_symbol($sym16$QUIESCENT_NTRANSFORM);
    return NIL;
  }

  //// Internal Constants

  public static final SubLInteger $int0$212 = makeInteger(212);
  public static final SubLInteger $int1$1024 = makeInteger(1024);
  public static final SubLSymbol $sym2$TRANSFORM = makeSymbol("TRANSFORM");
  public static final SubLSymbol $sym3$NTRANSFORM = makeSymbol("NTRANSFORM");
  public static final SubLSymbol $kw4$TRANSFORMATION_LIMIT_EXCEEDED = makeKeyword("TRANSFORMATION-LIMIT-EXCEEDED");
  public static final SubLList $list5 = list(makeSymbol("NTRANSFORM-INFO"));
  public static final SubLSymbol $sym6$CAR = makeSymbol("CAR");
  public static final SubLSymbol $sym7$CADR = makeSymbol("CADR");
  public static final SubLSymbol $sym8$CDDR = makeSymbol("CDDR");
  public static final SubLList $list9 = list(makeSymbol("NTRANSFORM-INFO"), makeSymbol("NEW-PARENT-CONS"));
  public static final SubLSymbol $sym10$RPLACA = makeSymbol("RPLACA");
  public static final SubLList $list11 = list(makeSymbol("NTRANSFORM-INFO"), makeSymbol("NEW-SET-OP"));
  public static final SubLSymbol $sym12$CDR = makeSymbol("CDR");
  public static final SubLList $list13 = list(makeSymbol("NTRANSFORM-INFO"), makeSymbol("NEW-VALUE"));
  public static final SubLSymbol $sym14$RPLACD = makeSymbol("RPLACD");
  public static final SubLSymbol $sym15$QUIESCENT_TRANSFORM = makeSymbol("QUIESCENT-TRANSFORM");
  public static final SubLSymbol $sym16$QUIESCENT_NTRANSFORM = makeSymbol("QUIESCENT-NTRANSFORM");

  //// Initializers

  public void declareFunctions() {
    declare_transform_list_utilities_file();
  }

  public void initializeVariables() {
    init_transform_list_utilities_file();
  }

  public void runTopLevelForms() {
    setup_transform_list_utilities_file();
  }

}
