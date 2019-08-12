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

public  final class print_high extends SubLTranslatedFile {

  //// Constructor

  private print_high() {}
  public static final SubLFile me = new print_high();
  public static final String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high";

  //// Definitions

  @SubL(source = "sublisp/print-high.lisp", position = 570) 
  public static SubLSymbol $print_array$ = null;

  @SubL(source = "sublisp/print-high.lisp", position = 1786) 
  public static SubLSymbol $print_base$ = null;

  @SubL(source = "sublisp/print-high.lisp", position = 1812) 
  public static SubLSymbol $print_case$ = null;

  @SubL(source = "sublisp/print-high.lisp", position = 1842) 
  public static SubLSymbol $print_circle$ = null;

  @SubL(source = "sublisp/print-high.lisp", position = 1870) 
  public static SubLSymbol $print_escape$ = null;

  @SubL(source = "sublisp/print-high.lisp", position = 1896) 
  public static SubLSymbol $print_gensym$ = null;

  @SubL(source = "sublisp/print-high.lisp", position = 1922) 
  public static SubLSymbol $print_length$ = null;

  @SubL(source = "sublisp/print-high.lisp", position = 1950) 
  public static SubLSymbol $print_level$ = null;

  @SubL(source = "sublisp/print-high.lisp", position = 1977) 
  public static SubLSymbol $print_lines$ = null;

  @SubL(source = "sublisp/print-high.lisp", position = 2004) 
  public static SubLSymbol $print_miser_width$ = null;

  @SubL(source = "sublisp/print-high.lisp", position = 2037) 
  public static SubLSymbol $print_pprint_dispatch$ = null;

  @SubL(source = "sublisp/print-high.lisp", position = 2074) 
  public static SubLSymbol $print_pretty$ = null;

  @SubL(source = "sublisp/print-high.lisp", position = 2100) 
  public static SubLSymbol $print_radix$ = null;

  @SubL(source = "sublisp/print-high.lisp", position = 2127) 
  public static SubLSymbol $print_readably$ = null;

  @SubL(source = "sublisp/print-high.lisp", position = 2157) 
  public static SubLSymbol $print_right_margin$ = null;

  @SubL(source = "sublisp/print-high.lisp", position = 2191) 
  private static SubLSymbol $print_error$ = null;

  @SubL(source = "sublisp/print-high.lisp", position = 2272) 
  private static SubLSymbol $print_circularities$ = null;

  @SubL(source = "sublisp/print-high.lisp", position = 3286) 
  private static SubLSymbol $print_circle_table_size$ = null;

  /** T of objects whose printed representation reads as EQ to the object. */
  @SubL(source = "sublisp/print-high.lisp", position = 3331) 
  public static final SubLObject read_print_eq(SubLObject object) {
    return makeBoolean((object.isSymbol()
          || object.isFixnum()
          || object.isChar()));
  }

  @SubL(source = "sublisp/print-high.lisp", position = 3588) 
  public static final SubLObject print_error(SubLObject object, SubLObject stream) {
    PrintLow.format(stream, $str2$__Error_printing__S_, Types.type_of(object));
    return NIL;
  }

  @SubL(source = "sublisp/print-high.lisp", position = 3696) 
  public static final SubLObject with_printer_state(SubLObject macroform, SubLObject environment) {
    {
      SubLObject datum = macroform.rest();
      SubLObject current = datum;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list3);
      {
        SubLObject temp = current.rest();
        current = current.first();
        {
          SubLObject stream_var = NIL;
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list3);
          stream_var = current.first();
          current = current.rest();
          {
            SubLObject allow_other_keys_p = NIL;
            SubLObject rest = current;
            SubLObject bad = NIL;
            SubLObject current_1 = NIL;
            for (; (NIL != rest); ) {
              cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list3);
              current_1 = rest.first();
              rest = rest.rest();
              cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list3);
              if ((NIL == conses_high.member(current_1, $list4, UNPROVIDED, UNPROVIDED))) {
                bad = T;
              }
              if ((current_1 == $kw5$ALLOW_OTHER_KEYS)) {
                allow_other_keys_p = rest.first();
              }
              rest = rest.rest();
            }
            if (((NIL != bad)
                 && (NIL == allow_other_keys_p))) {
              cdestructuring_bind.cdestructuring_bind_error(datum, $list3);
            }
            {
              SubLObject newp_tail = cdestructuring_bind.property_list_member($kw6$NEWP, current);
              SubLObject newp = ((NIL != newp_tail) ? ((SubLObject) conses_high.cadr(newp_tail)) : NIL);
              current = temp;
              {
                SubLObject body = current;
                SubLObject temp_stream = Symbols.make_symbol($str7$TEMP_STREAM);
                SubLObject saved_stream = Symbols.make_symbol($str8$SAVED_STREAM);
                SubLObject table = Symbols.make_symbol($str9$TABLE);
                SubLObject info = Symbols.make_symbol($str10$INFO);
                return list($sym11$PROGN, list($sym12$CSETF, stream_var, list($sym13$OUTPUT_STREAM_DESIGNATOR_STREAM, stream_var)), list($sym14$PIF, $sym15$_PRINT_CIRCLE_, list($sym16$CLET, list(list(info, list($sym17$CDR, listS($sym18$ASSOC, stream_var, $list19)))), list($sym14$PIF, list($sym20$CAND, info, list($sym21$CNOT, newp)), reader.bq_cons($sym11$PROGN, ConsesLow.append(body, NIL)), list($sym16$CLET, list(reader.bq_cons(table, $list22), list(saved_stream, stream_var), reader.bq_cons(temp_stream, $list23)), list($sym16$CLET, list(list($sym24$_PRINT_CIRCULARITIES_, listS($sym25$CONS, list($sym26$LIST, temp_stream, table), $list19))), list($sym27$CUNWIND_PROTECT, listS($sym11$PROGN, list($sym12$CSETF, stream_var, temp_stream), ConsesLow.append(body, NIL)), list($sym12$CSETF, stream_var, saved_stream))), listS($sym16$CLET, list(list($sym24$_PRINT_CIRCULARITIES_, listS($sym25$CONS, listS($sym28$LIST_, stream_var, table, $list29), $list19))), ConsesLow.append(body, NIL))))), reader.bq_cons($sym11$PROGN, ConsesLow.append(body, NIL))));
              }
            }
          }
        }
      }
    }
  }

  @SubL(source = "sublisp/print-high.lisp", position = 4858) 
  public static final SubLObject handle_circularity(SubLObject object, SubLObject stream) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject info = conses_high.assoc(stream, $print_circularities$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED).rest();
        if ((NIL != info)) {
          {
            SubLObject datum = info;
            SubLObject current = datum;
            SubLObject table = NIL;
            SubLObject counter = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list30);
            table = current.first();
            current = current.rest();
            counter = current;
            if ((NIL != counter)) {
              {
                SubLObject state = Hashtables.gethash(object, table, UNPROVIDED);
                if ((state == $sym31$REFERENCED)) {
                  counter = Numbers.add(counter, ONE_INTEGER);
                  ConsesLow.rplacd(info, counter);
                  PrintLow.format(stream, $str32$__D_, counter);
                } else if (state.isNumber()) {
                  PrintLow.format(stream, $str33$__D__, state);
                  return NIL;
                }
              }
            } else {
              return NIL;
            }
          }
        }
      }
      print_object(object, stream);
      return NIL;
    }
  }

  @SubL(source = "sublisp/print-high.lisp", position = 5851) 
  public static final SubLObject circular_reference_p(SubLObject object, SubLObject stream) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (((NIL != $print_circle$.getDynamicValue(thread))
           && (NIL == read_print_eq(object)))) {
        {
          SubLObject info = conses_high.assoc(stream, $print_circularities$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED).rest();
          if ((NIL != info)) {
            {
              SubLObject datum = info;
              SubLObject current = datum;
              SubLObject table = NIL;
              SubLObject counter = NIL;
              cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list30);
              table = current.first();
              current = current.rest();
              counter = current;
              {
                SubLObject state = Hashtables.gethash(object, table, UNPROVIDED);
                if (((state == $sym31$REFERENCED)
                    || state.isNumber())) {
                  return T;
                } else if ((state == $sym34$DETECTED)) {
                  Hashtables.sethash(object, table, $sym31$REFERENCED);
                  return T;
                } else if ((NIL == counter)) {
                  Hashtables.sethash(object, table, $sym34$DETECTED);
                }
              }
            }
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "sublisp/print-high.lisp", position = 6793) 
  public static SubLSymbol $print_object_method_table$ = null;

  @SubL(source = "sublisp/print-high.lisp", position = 6793) 
  public static final SubLObject print_object(SubLObject object, SubLObject stream) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject method_function = Structures.method_func(object, $print_object_method_table$.getGlobalValue());
        if ((NIL != method_function)) {
          return Functions.funcall(method_function, object, stream);
        }
        if ((NIL != $print_readably$.getDynamicValue(thread))) {
          print_not_readable(object, stream);
        } else {
          {
            SubLObject object_2 = object;
            SubLObject stream_3 = stream;
            streams_high.write_string($str36$__, stream_3, UNPROVIDED, UNPROVIDED);
            PrintLow.write(Types.type_of(object_2), new SubLObject[] {$kw37$STREAM, stream_3});
            streams_high.write_char(Characters.CHAR_space, stream_3);
            PrintLow.write(Equality.pointer(object_2), new SubLObject[] {$kw37$STREAM, stream_3, $kw38$BASE, SIXTEEN_INTEGER});
            streams_high.write_char(Characters.CHAR_greater, stream_3);
          }
        }
        return object;
      }
    }
  }

  @SubL(source = "sublisp/print-high.lisp", position = 6978) 
  public static final SubLObject print_object_wrapper(SubLObject object, SubLObject stream) {
    if (object.isString()) {
      print_functions.print_string(object, stream);
    } else if (object.isChar()) {
      print_functions.print_character(object, stream);
    } else if (object.isSymbol()) {
      print_functions.print_symbol(object, stream);
    } else if (object.isCons()) {
      print_functions.print_cons_cells(object, stream);
    } else if (object.isInteger()) {
      print_functions.print_integer(object, stream);
    } else if (object.isVector()) {
      print_functions.print_vector(object, stream);
    } else if (object.isHashtable()) {
      print_functions.print_hashtable(object, stream);
    } else if (object.isFunction()) {
      Functions.print_function(object, stream);
    } else if (object.isDouble()) {
      print_functions.print_flonum(object, stream);
    } else {
      print_object(object, stream);
    }
    return object;
  }

  @SubL(source = "sublisp/print-high.lisp", position = 7842) 
  public static final SubLObject really_write(SubLObject object, SubLObject keys) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject datum = keys;
        SubLObject current = datum;
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_4 = NIL;
        for (; (NIL != rest); ) {
          cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list39);
          current_4 = rest.first();
          rest = rest.rest();
          cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list39);
          if ((NIL == conses_high.member(current_4, $list40, UNPROVIDED, UNPROVIDED))) {
            bad = T;
          }
          if ((current_4 == $kw5$ALLOW_OTHER_KEYS)) {
            allow_other_keys_p = rest.first();
          }
          rest = rest.rest();
        }
        if (((NIL != bad)
             && (NIL == allow_other_keys_p))) {
          cdestructuring_bind.cdestructuring_bind_error(datum, $list39);
        }
        {
          SubLObject stream_tail = cdestructuring_bind.property_list_member($kw37$STREAM, current);
          SubLObject stream = ((NIL != stream_tail) ? ((SubLObject) conses_high.cadr(stream_tail)) : StreamsLow.$standard_output$.getDynamicValue(thread));
          SubLObject print_arrayX_tail = cdestructuring_bind.property_list_member($kw41$ARRAY, current);
          {
            SubLObject _prev_bind_0 = $print_array$.currentBinding(thread);
            try {
              $print_array$.bind(((NIL != print_arrayX_tail) ? ((SubLObject) conses_high.cadr(print_arrayX_tail)) : $print_array$.getDynamicValue(thread)), thread);
              {
                SubLObject print_baseX_tail = cdestructuring_bind.property_list_member($kw38$BASE, current);
                {
                  SubLObject _prev_bind_0_5 = $print_base$.currentBinding(thread);
                  try {
                    $print_base$.bind(((NIL != print_baseX_tail) ? ((SubLObject) conses_high.cadr(print_baseX_tail)) : $print_base$.getDynamicValue(thread)), thread);
                    {
                      SubLObject print_caseX_tail = cdestructuring_bind.property_list_member($kw42$CASE, current);
                      {
                        SubLObject _prev_bind_0_6 = $print_case$.currentBinding(thread);
                        try {
                          $print_case$.bind(((NIL != print_caseX_tail) ? ((SubLObject) conses_high.cadr(print_caseX_tail)) : $print_case$.getDynamicValue(thread)), thread);
                          {
                            SubLObject print_circleX_tail = cdestructuring_bind.property_list_member($kw43$CIRCLE, current);
                            {
                              SubLObject _prev_bind_0_7 = $print_circle$.currentBinding(thread);
                              try {
                                $print_circle$.bind(((NIL != print_circleX_tail) ? ((SubLObject) conses_high.cadr(print_circleX_tail)) : $print_circle$.getDynamicValue(thread)), thread);
                                {
                                  SubLObject print_escapeX_tail = cdestructuring_bind.property_list_member($kw44$ESCAPE, current);
                                  {
                                    SubLObject _prev_bind_0_8 = $print_escape$.currentBinding(thread);
                                    try {
                                      $print_escape$.bind(((NIL != print_escapeX_tail) ? ((SubLObject) conses_high.cadr(print_escapeX_tail)) : $print_escape$.getDynamicValue(thread)), thread);
                                      {
                                        SubLObject print_gensymX_tail = cdestructuring_bind.property_list_member($kw45$GENSYM, current);
                                        {
                                          SubLObject _prev_bind_0_9 = $print_gensym$.currentBinding(thread);
                                          try {
                                            $print_gensym$.bind(((NIL != print_gensymX_tail) ? ((SubLObject) conses_high.cadr(print_gensymX_tail)) : $print_gensym$.getDynamicValue(thread)), thread);
                                            {
                                              SubLObject print_lengthX_tail = cdestructuring_bind.property_list_member($kw46$LENGTH, current);
                                              {
                                                SubLObject _prev_bind_0_10 = $print_length$.currentBinding(thread);
                                                try {
                                                  $print_length$.bind(((NIL != print_lengthX_tail) ? ((SubLObject) conses_high.cadr(print_lengthX_tail)) : $print_length$.getDynamicValue(thread)), thread);
                                                  {
                                                    SubLObject print_levelX_tail = cdestructuring_bind.property_list_member($kw47$LEVEL, current);
                                                    {
                                                      SubLObject _prev_bind_0_11 = $print_level$.currentBinding(thread);
                                                      try {
                                                        $print_level$.bind(((NIL != print_levelX_tail) ? ((SubLObject) conses_high.cadr(print_levelX_tail)) : $print_level$.getDynamicValue(thread)), thread);
                                                        {
                                                          SubLObject print_linesX_tail = cdestructuring_bind.property_list_member($kw48$LINES, current);
                                                          {
                                                            SubLObject _prev_bind_0_12 = $print_lines$.currentBinding(thread);
                                                            try {
                                                              $print_lines$.bind(((NIL != print_linesX_tail) ? ((SubLObject) conses_high.cadr(print_linesX_tail)) : $print_lines$.getDynamicValue(thread)), thread);
                                                              {
                                                                SubLObject print_miser_widthX_tail = cdestructuring_bind.property_list_member($kw49$MISER_WIDTH, current);
                                                                {
                                                                  SubLObject _prev_bind_0_13 = $print_miser_width$.currentBinding(thread);
                                                                  try {
                                                                    $print_miser_width$.bind(((NIL != print_miser_widthX_tail) ? ((SubLObject) conses_high.cadr(print_miser_widthX_tail)) : $print_miser_width$.getDynamicValue(thread)), thread);
                                                                    {
                                                                      SubLObject print_pprint_dispatchX_tail = cdestructuring_bind.property_list_member($kw50$PPRINT_DISPATCH, current);
                                                                      {
                                                                        SubLObject _prev_bind_0_14 = $print_pprint_dispatch$.currentBinding(thread);
                                                                        try {
                                                                          $print_pprint_dispatch$.bind(((NIL != print_pprint_dispatchX_tail) ? ((SubLObject) conses_high.cadr(print_pprint_dispatchX_tail)) : $print_pprint_dispatch$.getDynamicValue(thread)), thread);
                                                                          {
                                                                            SubLObject print_prettyX_tail = cdestructuring_bind.property_list_member($kw51$PRETTY, current);
                                                                            {
                                                                              SubLObject _prev_bind_0_15 = $print_pretty$.currentBinding(thread);
                                                                              try {
                                                                                $print_pretty$.bind(((NIL != print_prettyX_tail) ? ((SubLObject) conses_high.cadr(print_prettyX_tail)) : $print_pretty$.getDynamicValue(thread)), thread);
                                                                                {
                                                                                  SubLObject print_radixX_tail = cdestructuring_bind.property_list_member($kw52$RADIX, current);
                                                                                  {
                                                                                    SubLObject _prev_bind_0_16 = $print_radix$.currentBinding(thread);
                                                                                    try {
                                                                                      $print_radix$.bind(((NIL != print_radixX_tail) ? ((SubLObject) conses_high.cadr(print_radixX_tail)) : $print_radix$.getDynamicValue(thread)), thread);
                                                                                      {
                                                                                        SubLObject print_readablyX_tail = cdestructuring_bind.property_list_member($kw53$READABLY, current);
                                                                                        {
                                                                                          SubLObject _prev_bind_0_17 = $print_readably$.currentBinding(thread);
                                                                                          try {
                                                                                            $print_readably$.bind(((NIL != print_readablyX_tail) ? ((SubLObject) conses_high.cadr(print_readablyX_tail)) : $print_readably$.getDynamicValue(thread)), thread);
                                                                                            {
                                                                                              SubLObject print_right_marginX_tail = cdestructuring_bind.property_list_member($kw54$RIGHT_MARGIN, current);
                                                                                              {
                                                                                                SubLObject _prev_bind_0_18 = $print_right_margin$.currentBinding(thread);
                                                                                                try {
                                                                                                  $print_right_margin$.bind(((NIL != print_right_marginX_tail) ? ((SubLObject) conses_high.cadr(print_right_marginX_tail)) : $print_right_margin$.getDynamicValue(thread)), thread);
                                                                                                  print_object_wrapper(object, stream);
                                                                                                } finally {
                                                                                                  $print_right_margin$.rebind(_prev_bind_0_18, thread);
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                          } finally {
                                                                                            $print_readably$.rebind(_prev_bind_0_17, thread);
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    } finally {
                                                                                      $print_radix$.rebind(_prev_bind_0_16, thread);
                                                                                    }
                                                                                  }
                                                                                }
                                                                              } finally {
                                                                                $print_pretty$.rebind(_prev_bind_0_15, thread);
                                                                              }
                                                                            }
                                                                          }
                                                                        } finally {
                                                                          $print_pprint_dispatch$.rebind(_prev_bind_0_14, thread);
                                                                        }
                                                                      }
                                                                    }
                                                                  } finally {
                                                                    $print_miser_width$.rebind(_prev_bind_0_13, thread);
                                                                  }
                                                                }
                                                              }
                                                            } finally {
                                                              $print_lines$.rebind(_prev_bind_0_12, thread);
                                                            }
                                                          }
                                                        }
                                                      } finally {
                                                        $print_level$.rebind(_prev_bind_0_11, thread);
                                                      }
                                                    }
                                                  }
                                                } finally {
                                                  $print_length$.rebind(_prev_bind_0_10, thread);
                                                }
                                              }
                                            }
                                          } finally {
                                            $print_gensym$.rebind(_prev_bind_0_9, thread);
                                          }
                                        }
                                      }
                                    } finally {
                                      $print_escape$.rebind(_prev_bind_0_8, thread);
                                    }
                                  }
                                }
                              } finally {
                                $print_circle$.rebind(_prev_bind_0_7, thread);
                              }
                            }
                          }
                        } finally {
                          $print_case$.rebind(_prev_bind_0_6, thread);
                        }
                      }
                    }
                  } finally {
                    $print_base$.rebind(_prev_bind_0_5, thread);
                  }
                }
              }
            } finally {
              $print_array$.rebind(_prev_bind_0, thread);
            }
          }
        }
      }
      return object;
    }
  }

  @SubL(source = "sublisp/print-high.lisp", position = 9070) 
  public static final SubLObject prin1(SubLObject object, SubLObject stream) {
    if ((stream == UNPROVIDED)) {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject _prev_bind_0 = $print_escape$.currentBinding(thread);
        try {
          $print_escape$.bind(T, thread);
          print_object_wrapper(object, stream);
        } finally {
          $print_escape$.rebind(_prev_bind_0, thread);
        }
      }
      return object;
    }
  }

  @SubL(source = "sublisp/print-high.lisp", position = 9219) 
  public static final SubLObject print(SubLObject object, SubLObject stream) {
    if ((stream == UNPROVIDED)) {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    streams_high.write_char(Characters.CHAR_newline, stream);
    prin1(object, stream);
    streams_high.write_char(Characters.CHAR_space, stream);
    return object;
  }

  @SubL(source = "sublisp/print-high.lisp", position = 9383) 
  public static final SubLObject princ(SubLObject object, SubLObject stream) {
    if ((stream == UNPROVIDED)) {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject _prev_bind_0 = $print_escape$.currentBinding(thread);
        SubLObject _prev_bind_1 = $print_readably$.currentBinding(thread);
        try {
          $print_escape$.bind(NIL, thread);
          $print_readably$.bind(NIL, thread);
          if (object.isString()) {
            streams_high.write_string(object, stream, UNPROVIDED, UNPROVIDED);
          } else if (object.isChar()) {
            streams_high.write_char(object, stream);
          } else {
            print_object_wrapper(object, stream);
          }
        } finally {
          $print_readably$.rebind(_prev_bind_1, thread);
          $print_escape$.rebind(_prev_bind_0, thread);
        }
      }
      return object;
    }
  }

  @SubL(source = "sublisp/print-high.lisp", position = 9798) 
  public static final SubLObject really_write_to_string(SubLObject object, SubLObject keys) {
    {
      SubLObject result = NIL;
      SubLObject key_set = NIL;
      SubLObject stream = NIL;
      try {
        stream = streams_high.make_private_string_output_stream();
        key_set = cons(stream, keys);
        key_set = cons($kw37$STREAM, key_set);
        really_write(object, key_set);
        result = streams_high.get_output_stream_string(stream);
      } finally {
        {
          SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
          try {
            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, T);
            streams_high.close(stream, UNPROVIDED);
          } finally {
            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
          }
        }
      }
      return result;
    }
  }

  @SubL(source = "sublisp/print-high.lisp", position = 10123) 
  public static final SubLObject prin1_to_string(SubLObject object) {
    {
      SubLObject result = NIL;
      SubLObject stream = NIL;
      try {
        stream = streams_high.make_private_string_output_stream();
        prin1(object, stream);
        result = streams_high.get_output_stream_string(stream);
      } finally {
        {
          SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
          try {
            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, T);
            streams_high.close(stream, UNPROVIDED);
          } finally {
            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
          }
        }
      }
      return result;
    }
  }

  @SubL(source = "sublisp/print-high.lisp", position = 10266) 
  public static final SubLObject princ_to_string(SubLObject object) {
    {
      SubLObject result = NIL;
      SubLObject stream = NIL;
      try {
        stream = streams_high.make_private_string_output_stream();
        princ(object, stream);
        result = streams_high.get_output_stream_string(stream);
      } finally {
        {
          SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
          try {
            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, T);
            streams_high.close(stream, UNPROVIDED);
          } finally {
            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
          }
        }
      }
      return result;
    }
  }

  @SubL(source = "sublisp/print-high.lisp", position = 10409) 
  public static final SubLObject print_not_readable(SubLObject object, SubLObject stream) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject _prev_bind_0 = $print_readably$.currentBinding(thread);
        try {
          $print_readably$.bind(NIL, thread);
          Errors.error($str55$_S_cannot_be_printed_readably_, object);
        } finally {
          $print_readably$.rebind(_prev_bind_0, thread);
        }
      }
      return NIL;
    }
  }

  public static final SubLObject declare_print_high_file() {
    declareFunction("read_print_eq", "READ-PRINT-EQ", 1, 0, false);
    declareFunction("print_error", "PRINT-ERROR", 2, 0, false);
    declareMacro("with_printer_state", "WITH-PRINTER-STATE");
    declareFunction("handle_circularity", "HANDLE-CIRCULARITY", 2, 0, false);
    declareFunction("circular_reference_p", "CIRCULAR-REFERENCE-P", 2, 0, false);
    declareFunction("print_object", "PRINT-OBJECT", 2, 0, false);
    declareFunction("print_object_wrapper", "PRINT-OBJECT-WRAPPER", 2, 0, false);
    declareFunction("really_write", "REALLY-WRITE", 2, 0, false);
    declareFunction("prin1", "PRIN1", 1, 1, false);
    declareFunction("print", "PRINT", 1, 1, false);
    declareFunction("princ", "PRINC", 1, 1, false);
    declareFunction("really_write_to_string", "REALLY-WRITE-TO-STRING", 2, 0, false);
    declareFunction("prin1_to_string", "PRIN1-TO-STRING", 1, 0, false);
    declareFunction("princ_to_string", "PRINC-TO-STRING", 1, 0, false);
    declareFunction("print_not_readable", "PRINT-NOT-READABLE", 2, 0, false);
    return NIL;
  }

  public static final SubLObject init_print_high_file() {
    $print_array$ = defvar("*PRINT-ARRAY*", T);
    $print_base$ = defvar("*PRINT-BASE*", TEN_INTEGER);
    $print_case$ = defvar("*PRINT-CASE*", $kw0$UPCASE);
    $print_circle$ = defvar("*PRINT-CIRCLE*", NIL);
    $print_escape$ = defvar("*PRINT-ESCAPE*", T);
    $print_gensym$ = defvar("*PRINT-GENSYM*", T);
    $print_length$ = defvar("*PRINT-LENGTH*", NIL);
    $print_level$ = defvar("*PRINT-LEVEL*", NIL);
    $print_lines$ = defvar("*PRINT-LINES*", NIL);
    $print_miser_width$ = defvar("*PRINT-MISER-WIDTH*", NIL);
    $print_pprint_dispatch$ = defvar("*PRINT-PPRINT-DISPATCH*", NIL);
    $print_pretty$ = defvar("*PRINT-PRETTY*", T);
    $print_radix$ = defvar("*PRINT-RADIX*", NIL);
    $print_readably$ = defvar("*PRINT-READABLY*", NIL);
    $print_right_margin$ = defvar("*PRINT-RIGHT-MARGIN*", NIL);
    $print_error$ = defvar("*PRINT-ERROR*", NIL);
    $print_circularities$ = defvar("*PRINT-CIRCULARITIES*", NIL);
    $print_circle_table_size$ = defparameter("*PRINT-CIRCLE-TABLE-SIZE*", $int1$64);
    $print_object_method_table$ = deflexical("*PRINT-OBJECT-METHOD-TABLE*", Vectors.make_vector($int35$256, NIL));
    return NIL;
  }

  public static final SubLObject setup_print_high_file() {
        return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $kw0$UPCASE = makeKeyword("UPCASE");
  public static final SubLInteger $int1$64 = makeInteger(64);
  public static final SubLString $str2$__Error_printing__S_ = makeString("#<Error printing ~S>");
  public static final SubLList $list3 = list(list(makeSymbol("STREAM-VAR"), makeSymbol("&KEY"), makeSymbol("NEWP")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list4 = list(makeKeyword("NEWP"));
  public static final SubLSymbol $kw5$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw6$NEWP = makeKeyword("NEWP");
  public static final SubLString $str7$TEMP_STREAM = makeString("TEMP-STREAM");
  public static final SubLString $str8$SAVED_STREAM = makeString("SAVED-STREAM");
  public static final SubLString $str9$TABLE = makeString("TABLE");
  public static final SubLString $str10$INFO = makeString("INFO");
  public static final SubLSymbol $sym11$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $sym12$CSETF = makeSymbol("CSETF");
  public static final SubLSymbol $sym13$OUTPUT_STREAM_DESIGNATOR_STREAM = makeSymbol("OUTPUT-STREAM-DESIGNATOR-STREAM");
  public static final SubLSymbol $sym14$PIF = makeSymbol("PIF");
  public static final SubLSymbol $sym15$_PRINT_CIRCLE_ = makeSymbol("*PRINT-CIRCLE*");
  public static final SubLSymbol $sym16$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym17$CDR = makeSymbol("CDR");
  public static final SubLSymbol $sym18$ASSOC = makeSymbol("ASSOC");
  public static final SubLList $list19 = list(makeSymbol("*PRINT-CIRCULARITIES*"));
  public static final SubLSymbol $sym20$CAND = makeSymbol("CAND");
  public static final SubLSymbol $sym21$CNOT = makeSymbol("CNOT");
  public static final SubLList $list22 = list(list(makeSymbol("MAKE-HASH-TABLE"), makeSymbol("*PRINT-CIRCLE-TABLE-SIZE*"), list(makeSymbol("FUNCTION"), EQ)));
  public static final SubLList $list23 = list(list(makeSymbol("MAKE-BROADCAST-STREAM"), NIL));
  public static final SubLSymbol $sym24$_PRINT_CIRCULARITIES_ = makeSymbol("*PRINT-CIRCULARITIES*");
  public static final SubLSymbol $sym25$CONS = makeSymbol("CONS");
  public static final SubLSymbol $sym26$LIST = makeSymbol("LIST");
  public static final SubLSymbol $sym27$CUNWIND_PROTECT = makeSymbol("CUNWIND-PROTECT");
  public static final SubLSymbol $sym28$LIST_ = makeSymbol("LIST*");
  public static final SubLList $list29 = list(ZERO_INTEGER);
  public static final SubLList $list30 = cons(makeSymbol("TABLE"), makeSymbol("COUNTER"));
  public static final SubLSymbol $sym31$REFERENCED = makeSymbol("REFERENCED");
  public static final SubLString $str32$__D_ = makeString("#~D=");
  public static final SubLString $str33$__D__ = makeString("#~D# ");
  public static final SubLSymbol $sym34$DETECTED = makeSymbol("DETECTED");
  public static final SubLInteger $int35$256 = makeInteger(256);
  public static final SubLString $str36$__ = makeString("#<");
  public static final SubLSymbol $kw37$STREAM = makeKeyword("STREAM");
  public static final SubLSymbol $kw38$BASE = makeKeyword("BASE");
  public static final SubLList $list39 = list(new SubLObject[] {makeSymbol("&KEY"), list(makeSymbol("STREAM"), makeSymbol("*STANDARD-OUTPUT*")), list(list(makeKeyword("ARRAY"), makeSymbol("*PRINT-ARRAY*")), makeSymbol("*PRINT-ARRAY*")), list(list(makeKeyword("BASE"), makeSymbol("*PRINT-BASE*")), makeSymbol("*PRINT-BASE*")), list(list(makeKeyword("CASE"), makeSymbol("*PRINT-CASE*")), makeSymbol("*PRINT-CASE*")), list(list(makeKeyword("CIRCLE"), makeSymbol("*PRINT-CIRCLE*")), makeSymbol("*PRINT-CIRCLE*")), list(list(makeKeyword("ESCAPE"), makeSymbol("*PRINT-ESCAPE*")), makeSymbol("*PRINT-ESCAPE*")), list(list(makeKeyword("GENSYM"), makeSymbol("*PRINT-GENSYM*")), makeSymbol("*PRINT-GENSYM*")), list(list(makeKeyword("LENGTH"), makeSymbol("*PRINT-LENGTH*")), makeSymbol("*PRINT-LENGTH*")), list(list(makeKeyword("LEVEL"), makeSymbol("*PRINT-LEVEL*")), makeSymbol("*PRINT-LEVEL*")), list(list(makeKeyword("LINES"), makeSymbol("*PRINT-LINES*")), makeSymbol("*PRINT-LINES*")), list(list(makeKeyword("MISER-WIDTH"), makeSymbol("*PRINT-MISER-WIDTH*")), makeSymbol("*PRINT-MISER-WIDTH*")), list(list(makeKeyword("PPRINT-DISPATCH"), makeSymbol("*PRINT-PPRINT-DISPATCH*")), makeSymbol("*PRINT-PPRINT-DISPATCH*")), list(list(makeKeyword("PRETTY"), makeSymbol("*PRINT-PRETTY*")), makeSymbol("*PRINT-PRETTY*")), list(list(makeKeyword("RADIX"), makeSymbol("*PRINT-RADIX*")), makeSymbol("*PRINT-RADIX*")), list(list(makeKeyword("READABLY"), makeSymbol("*PRINT-READABLY*")), makeSymbol("*PRINT-READABLY*")), list(list(makeKeyword("RIGHT-MARGIN"), makeSymbol("*PRINT-RIGHT-MARGIN*")), makeSymbol("*PRINT-RIGHT-MARGIN*"))});
  public static final SubLList $list40 = list(new SubLObject[] {makeKeyword("STREAM"), makeKeyword("ARRAY"), makeKeyword("BASE"), makeKeyword("CASE"), makeKeyword("CIRCLE"), makeKeyword("ESCAPE"), makeKeyword("GENSYM"), makeKeyword("LENGTH"), makeKeyword("LEVEL"), makeKeyword("LINES"), makeKeyword("MISER-WIDTH"), makeKeyword("PPRINT-DISPATCH"), makeKeyword("PRETTY"), makeKeyword("RADIX"), makeKeyword("READABLY"), makeKeyword("RIGHT-MARGIN")});
  public static final SubLSymbol $kw41$ARRAY = makeKeyword("ARRAY");
  public static final SubLSymbol $kw42$CASE = makeKeyword("CASE");
  public static final SubLSymbol $kw43$CIRCLE = makeKeyword("CIRCLE");
  public static final SubLSymbol $kw44$ESCAPE = makeKeyword("ESCAPE");
  public static final SubLSymbol $kw45$GENSYM = makeKeyword("GENSYM");
  public static final SubLSymbol $kw46$LENGTH = makeKeyword("LENGTH");
  public static final SubLSymbol $kw47$LEVEL = makeKeyword("LEVEL");
  public static final SubLSymbol $kw48$LINES = makeKeyword("LINES");
  public static final SubLSymbol $kw49$MISER_WIDTH = makeKeyword("MISER-WIDTH");
  public static final SubLSymbol $kw50$PPRINT_DISPATCH = makeKeyword("PPRINT-DISPATCH");
  public static final SubLSymbol $kw51$PRETTY = makeKeyword("PRETTY");
  public static final SubLSymbol $kw52$RADIX = makeKeyword("RADIX");
  public static final SubLSymbol $kw53$READABLY = makeKeyword("READABLY");
  public static final SubLSymbol $kw54$RIGHT_MARGIN = makeKeyword("RIGHT-MARGIN");
  public static final SubLString $str55$_S_cannot_be_printed_readably_ = makeString("~S cannot be printed readably.");

  //// Initializers

  public void declareFunctions() {
    declare_print_high_file();
  }

  public void initializeVariables() {
    init_print_high_file();
  }

  public void runTopLevelForms() {
    setup_print_high_file();
  }

}
