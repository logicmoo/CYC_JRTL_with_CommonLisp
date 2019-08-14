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

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public  final class cdestructuring_bind extends SubLTranslatedFile {

  //// Constructor

  private cdestructuring_bind() {}
  public static final SubLFile me = new cdestructuring_bind();
  public static final String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind";

  //// Definitions

  @SubL(source = "sublisp/cdestructuring-bind.lisp", position = 992) 
  public static final SubLObject cdestructuring_bind(SubLObject macroform, SubLObject environment) {
    {
      SubLObject datum = macroform.rest();
      SubLObject current = datum;
      SubLObject pattern = NIL;
      SubLObject datum_1 = NIL;
      destructuring_bind_must_consp(current, datum, $list0);
      pattern = current.first();
      current = current.rest();
      destructuring_bind_must_consp(current, datum, $list0);
      datum_1 = current.first();
      current = current.rest();
      {
        SubLObject body = current;
        if ((NIL == pattern)) {
          {
            SubLObject datum_var = Symbols.make_symbol($str1$DATUM);
            return listS($sym2$CLET, list(list(datum_var, datum_1)), list($sym3$PUNLESS, list($sym4$NULL, datum_var), listS($sym5$CDESTRUCTURING_BIND_ERROR, datum_var, $list6)), ConsesLow.append(body, NIL));
          }
        } else {
          {
            SubLObject original = Symbols.make_symbol($str1$DATUM);
            SubLObject datum_var = Symbols.make_symbol($str7$CURRENT);
            return listS($sym2$CLET, list(list(original, datum_1), list(datum_var, original)), ConsesLow.append(destructuring_bind_Xwhole(pattern, datum_var, list($sym5$CDESTRUCTURING_BIND_ERROR, original, list($sym8$QUOTE, pattern)), body), NIL));
          }
        }
      }
    }
  }

  @SubL(source = "sublisp/cdestructuring-bind.lisp", position = 1600) 
  public static final SubLObject cdestructuring_bind_error(SubLObject original, SubLObject pattern) {
    return Errors.error($str9$The_value__S_failed_to_match_the_, original, $sym10$CDESTRUCTURING_BIND, pattern);
  }

  @SubL(source = "sublisp/cdestructuring-bind.lisp", position = 1784) 
  public static final SubLObject destructuring_bind_must_consp(SubLObject object, SubLObject original, SubLObject pattern) {
    if ((!(object.isCons()))) {
      return cdestructuring_bind_error(original, pattern);
    }
    return NIL;
  }

  @SubL(source = "sublisp/cdestructuring-bind.lisp", position = 1950) 
  public static final SubLObject destructuring_bind_must_listp(SubLObject object, SubLObject original, SubLObject pattern) {
    if ((!(object.isList()))) {
      return cdestructuring_bind_error(original, pattern);
    }
    return NIL;
  }

  @SubL(source = "sublisp/cdestructuring-bind.lisp", position = 2116) 
  public static final SubLObject property_list_member(SubLObject property, SubLObject plist) {
    {
      SubLObject rest = NIL;
      for (rest = plist; (NIL != rest); rest = conses_high.cddr(rest)) {
        {
          SubLObject candidate_property = rest.first();
          if ((property == candidate_property)) {
            return rest;
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "sublisp/cdestructuring-bind.lisp", position = 2361) 
  public static final SubLObject bogus_unless(SubLObject macroform, SubLObject environment) {
    {
      SubLObject datum = macroform.rest();
      SubLObject current = datum;
      SubLObject form = NIL;
      destructuring_bind_must_consp(current, datum, $list11);
      form = current.first();
      current = current.rest();
      if ((NIL == current)) {
        return listS($sym3$PUNLESS, form, $list12);
      } else {
        cdestructuring_bind_error(datum, $list11);
      }
    }
    return NIL;
  }

  @SubL(source = "sublisp/cdestructuring-bind.lisp", position = 2461) 
  public static final SubLObject destructuring_bind_Xwhole(SubLObject pattern, SubLObject datum, SubLObject error, SubLObject body) {
    if ((!(pattern.isCons()))) {
      Errors.error($str13$Malformed_pattern__S_, pattern);
    }
    if ((pattern.first() == $sym14$_WHOLE)) {
      pattern = pattern.rest();
      {
        SubLObject var = pattern.first();
        if ((!(var.isSymbol()))) {
          Errors.error($str13$Malformed_pattern__S_, pattern);
        }
        pattern = pattern.rest();
        return list(listS($sym2$CLET, list(list(var, datum)), ConsesLow.append(((NIL != pattern) ? ((SubLObject) destructuring_bind_required_args(pattern, datum, error, body)) : body), NIL)));
      }
    } else {
      return destructuring_bind_required_args(pattern, datum, error, body);
    }
  }

  @SubL(source = "sublisp/cdestructuring-bind.lisp", position = 2927) 
  public static final SubLObject destructuring_bind_required_args(SubLObject pattern, SubLObject datum, SubLObject error, SubLObject body) {
    {
      SubLObject vars = NIL;
      SubLObject setqs = NIL;
      SubLObject done = NIL;
      for (; (!(((NIL != done)
            || (!(pattern.isCons()))))); ) {
        {
          SubLObject current = pattern.first();
          if ((NIL != conses_high.member(current, $list15, UNPROVIDED, UNPROVIDED))) {
            done = T;
          } else if (current.isSymbol()) {
            vars = cons(current, vars);
            setqs = cons(list($sym16$PROGN, listS($sym17$DESTRUCTURING_BIND_MUST_CONSP, datum, ConsesLow.append(error.rest(), NIL)), list($sym18$CSETQ, current, list($sym19$FIRST, datum)), list($sym20$CPOP, datum)), setqs);
            pattern = pattern.rest();
          } else {
            {
              SubLObject temp = Symbols.make_symbol($str21$TEMP);
              return list(listS($sym2$CLET, Sequences.nreverse(vars), ConsesLow.append(Sequences.nreverse(setqs), list(listS($sym17$DESTRUCTURING_BIND_MUST_CONSP, datum, ConsesLow.append(error.rest(), NIL)), listS($sym2$CLET, list(list(temp, list($sym22$REST, datum))), list($sym18$CSETQ, datum, list($sym19$FIRST, datum)), ConsesLow.append(destructuring_bind_Xwhole(pattern.first(), datum, error, reader.bq_cons(list($sym18$CSETQ, datum, temp), ConsesLow.append(destructuring_bind_required_args(pattern.rest(), datum, error, body), NIL))), NIL))))));
            }
          }
        }
      }
      vars = Sequences.nreverse(vars);
      setqs = Sequences.nreverse(setqs);
      if ((NIL == vars)) {
        return destructuring_bind_Xoptional(pattern, datum, error, body);
      } else if (pattern.isList()) {
        return list(listS($sym2$CLET, vars, ConsesLow.append(setqs, destructuring_bind_Xoptional(pattern, datum, error, body), NIL)));
      } else if (pattern.isSymbol()) {
        return list(listS($sym2$CLET, ConsesLow.append(vars, list(pattern)), ConsesLow.append(setqs, reader.bq_cons(list($sym18$CSETQ, pattern, datum), ConsesLow.append(body, NIL)))));
      } else {
        Errors.error($str13$Malformed_pattern__S_, pattern);
      }
    }
    return NIL;
  }

  @SubL(source = "sublisp/cdestructuring-bind.lisp", position = 4380) 
  public static final SubLObject destructuring_bind_Xoptional(SubLObject pattern, SubLObject datum, SubLObject error, SubLObject body) {
    if ((NIL == pattern)) {
      return destructuring_bind_end_of_the_line(datum, error, body);
    } else if (pattern.isCons()) {
      if ((pattern.first() == $sym23$_OPTIONAL)) {
        pattern = pattern.rest();
        if ((!(pattern.isCons()))) {
          Errors.error($str13$Malformed_pattern__S_, pattern);
        }
        return destructuring_bind_more_Xoptional(pattern, datum, error, body);
      } else {
        return destructuring_bind_Xrest(pattern, datum, error, body);
      }
    } else if (pattern.isSymbol()) {
      return list(listS($sym2$CLET, list(list(pattern, datum)), ConsesLow.append(body, NIL)));
    } else {
      Errors.error($str13$Malformed_pattern__S_, pattern);
    }
    return NIL;
  }

  @SubL(source = "sublisp/cdestructuring-bind.lisp", position = 4918) 
  public static final SubLObject destructuring_bind_end_of_the_line(SubLObject datum, SubLObject error, SubLObject body) {
    return list(list($sym24$PCOND, reader.bq_cons(list($sym4$NULL, datum), ConsesLow.append(body, NIL)), list(T, error)));
  }

  @SubL(source = "sublisp/cdestructuring-bind.lisp", position = 5045) 
  public static final SubLObject destructuring_bind_more_Xoptional(SubLObject pattern, SubLObject datum, SubLObject error, SubLObject body) {
    if ((NIL == pattern)) {
      return destructuring_bind_end_of_the_line(datum, error, body);
    } else if (pattern.isCons()) {
      {
        SubLObject current = pattern.first();
        if ((NIL != conses_high.member(current, $list25, UNPROVIDED, UNPROVIDED))) {
          return destructuring_bind_Xrest(pattern, datum, error, body);
        } else {
          {
            SubLObject var = NIL;
            SubLObject v_default = NIL;
            SubLObject suppliedp = NIL;
            if (current.isCons()) {
              var = current.first();
              current = current.rest();
              if ((NIL != current)) {
                if ((!(current.isCons()))) {
                  Errors.error($str13$Malformed_pattern__S_, pattern);
                }
                v_default = current.first();
                current = current.rest();
                if ((NIL != current)) {
                  if ((!(current.isCons()))) {
                    Errors.error($str13$Malformed_pattern__S_, pattern);
                  }
                  suppliedp = current.first();
                  if ((!(suppliedp.isSymbol()))) {
                    Errors.error($str13$Malformed_pattern__S_, pattern);
                  }
                }
              }
            } else {
              var = current;
            }
            if ((!(var.isSymbol()))) {
              Errors.error($str13$Malformed_pattern__S_, pattern);
            }
            return list(listS($sym2$CLET, reader.bq_cons(list(var, list($sym26$FIF, list($sym27$CONSP, datum), list($sym19$FIRST, datum), v_default)), ConsesLow.append(((NIL != suppliedp) ? ((SubLObject) list(list(suppliedp, list($sym27$CONSP, datum)))) : NIL), NIL)), listS($sym28$DESTRUCTURING_BIND_MUST_LISTP, datum, ConsesLow.append(error.rest(), NIL)), list($sym20$CPOP, datum), ConsesLow.append(destructuring_bind_more_Xoptional(pattern.rest(), datum, error, body), NIL)));
          }
        }
      }
    } else if (pattern.isSymbol()) {
      return list(listS($sym2$CLET, list(list(pattern, datum)), ConsesLow.append(body, NIL)));
    } else {
      Errors.error($str13$Malformed_pattern__S_, pattern);
    }
    return NIL;
  }

  @SubL(source = "sublisp/cdestructuring-bind.lisp", position = 6285) 
  public static final SubLObject destructuring_bind_Xrest(SubLObject pattern, SubLObject datum, SubLObject error, SubLObject body) {
    if ((NIL == pattern)) {
      return destructuring_bind_end_of_the_line(datum, error, body);
    } else if (pattern.isCons()) {
      if ((NIL != conses_high.member(pattern.first(), $list29, UNPROVIDED, UNPROVIDED))) {
        pattern = pattern.rest();
        if ((!(pattern.isCons()))) {
          Errors.error($str13$Malformed_pattern__S_, pattern);
        }
        return list(listS($sym2$CLET, list(list(pattern.first(), datum)), ConsesLow.append(((NIL != pattern.rest()) ? ((SubLObject) destructuring_bind_Xkey(pattern.rest(), datum, error, body)) : body), NIL)));
      } else {
        return destructuring_bind_Xkey(pattern, datum, error, body);
      }
    } else {
      Errors.error($str13$Malformed_pattern__S_, pattern);
    }
    return NIL;
  }

  @SubL(source = "sublisp/cdestructuring-bind.lisp", position = 6837) 
  public static final SubLObject destructuring_bind_Xkey(SubLObject pattern, SubLObject datum, SubLObject error, SubLObject body) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == pattern)) {
        return destructuring_bind_end_of_the_line(datum, error, body);
      } else if (pattern.isCons()) {
        if ((pattern.first() == $sym30$_KEY)) {
          pattern = pattern.rest();
          if ((!(pattern.isCons()))) {
            Errors.error($str13$Malformed_pattern__S_, pattern);
          }
          {
            SubLObject allow_other_keys_p = NIL;
            {
              SubLObject done = NIL;
              SubLObject rest = NIL;
              for (rest = pattern; (!(((NIL != done)
                    || (NIL != allow_other_keys_p)
                    || (NIL == rest)))); rest = rest.rest()) {
                if ((!(rest.isCons()))) {
                  Errors.error($str13$Malformed_pattern__S_, pattern);
                }
                if ((rest.first() == $sym31$_ALLOW_OTHER_KEYS)) {
                  allow_other_keys_p = T;
                }
                if ((rest.first() == $sym32$_AUX)) {
                  done = T;
                }
              }
            }
            if ((NIL != allow_other_keys_p)) {
              return destructuring_bind_more_Xkey(Sequences.remove($sym31$_ALLOW_OTHER_KEYS, pattern, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), datum, error, body);
            } else {
              thread.resetMultipleValues();
              {
                SubLObject form = destructuring_bind_more_Xkey(pattern, datum, error, body);
                SubLObject keywords = thread.secondMultipleValue();
                thread.resetMultipleValues();
                {
                  SubLObject allow_other_keys_var = Symbols.make_symbol($str33$ALLOW_OTHER_KEYS_P);
                  SubLObject rest = Symbols.make_symbol($str34$REST);
                  SubLObject bad = Symbols.make_symbol($str35$BAD);
                  SubLObject current = Symbols.make_symbol($str7$CURRENT);
                  return list(listS($sym2$CLET, list(reader.bq_cons(allow_other_keys_var, $list6)), list($sym2$CLET, list(list(rest, datum), reader.bq_cons(bad, $list6), current), list(new SubLObject[] {$sym36$CDO, NIL, list(list($sym4$NULL, rest)), listS($sym17$DESTRUCTURING_BIND_MUST_CONSP, rest, ConsesLow.append(error.rest(), NIL)), list($sym18$CSETQ, current, list($sym19$FIRST, rest)), list($sym20$CPOP, rest), listS($sym17$DESTRUCTURING_BIND_MUST_CONSP, rest, ConsesLow.append(error.rest(), NIL)), list($sym3$PUNLESS, list($sym37$MEMBER, current, list($sym8$QUOTE, keywords)), listS($sym18$CSETQ, bad, $list38)), list($sym39$PWHEN, listS(EQ, current, $list40), list($sym18$CSETQ, allow_other_keys_var, list($sym19$FIRST, rest))), list($sym20$CPOP, rest)}), list($sym39$PWHEN, list($sym41$CAND, bad, list($sym42$CNOT, allow_other_keys_var)), error)), ConsesLow.append(form, NIL)));
                }
              }
            }
          }
        } else {
          return destructuring_bind_Xaux(pattern, datum, error, body);
        }
      } else {
        Errors.error($str13$Malformed_pattern__S_, pattern);
      }
      return NIL;
    }
  }

  @SubL(source = "sublisp/cdestructuring-bind.lisp", position = 8659) 
  public static final SubLObject destructuring_bind_more_Xkey(SubLObject pattern, SubLObject datum, SubLObject error, SubLObject body) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == pattern)) {
        return Values.values(body, NIL);
      } else if (pattern.isCons()) {
        {
          SubLObject current = pattern.first();
          if ((NIL != conses_high.member(current, $list43, UNPROVIDED, UNPROVIDED))) {
            return destructuring_bind_Xaux(pattern, datum, error, body);
          } else {
            {
              SubLObject var = NIL;
              SubLObject v_default = NIL;
              SubLObject keyword = NIL;
              SubLObject suppliedp = NIL;
              pattern = pattern.rest();
              if (current.isCons()) {
                var = current.first();
                if (var.isCons()) {
                  keyword = var.first();
                  if ((!(keyword.isSymbol()))) {
                    Errors.error($str13$Malformed_pattern__S_, pattern);
                  }
                  if ((!(var.rest().isCons()))) {
                    Errors.error($str13$Malformed_pattern__S_, pattern);
                  }
                  var = conses_high.second(var);
                } else {
                  keyword = Symbols.make_keyword(var);
                }
                current = current.rest();
                if ((NIL != current)) {
                  if ((!(current.isCons()))) {
                    Errors.error($str13$Malformed_pattern__S_, pattern);
                  }
                  v_default = current.first();
                  current = current.rest();
                  if ((NIL != current)) {
                    if ((!(current.isCons()))) {
                      Errors.error($str13$Malformed_pattern__S_, pattern);
                    }
                    suppliedp = current.first();
                    if ((!(suppliedp.isSymbol()))) {
                      Errors.error($str13$Malformed_pattern__S_, pattern);
                    }
                  }
                }
              } else {
                var = current;
                keyword = Symbols.make_keyword(var);
              }
              if ((!(var.isSymbol()))) {
                Errors.error($str13$Malformed_pattern__S_, pattern);
              }
              thread.resetMultipleValues();
              {
                SubLObject form = destructuring_bind_more_Xkey(pattern, datum, error, body);
                SubLObject keywords = thread.secondMultipleValue();
                thread.resetMultipleValues();
                {
                  SubLObject var_tail = Symbols.make_symbol(Sequences.cconcatenate(Symbols.symbol_name(var), $str44$_TAIL));
                  if ((NIL != suppliedp)) {
                    {
                      SubLObject temp = Symbols.make_symbol($str21$TEMP);
                      return Values.values(list(list($sym2$CLET, list(list(var_tail, list($sym45$PROPERTY_LIST_MEMBER, list($sym8$QUOTE, keyword), datum)), list(var, list($sym26$FIF, var_tail, list($sym46$CADR, var_tail), v_default)), list(temp, var_tail)), listS($sym2$CLET, list(list(suppliedp, listS($sym26$FIF, temp, $list47))), ConsesLow.append(form, NIL)))), cons(keyword, keywords));
                    }
                  } else {
                    return Values.values(list(listS($sym2$CLET, list(list(var_tail, list($sym45$PROPERTY_LIST_MEMBER, list($sym8$QUOTE, keyword), datum)), list(var, list($sym26$FIF, var_tail, list($sym46$CADR, var_tail), v_default))), ConsesLow.append(form, NIL))), cons(keyword, keywords));
                  }
                }
              }
            }
          }
        }
      } else {
        Errors.error($str13$Malformed_pattern__S_, pattern);
      }
      return NIL;
    }
  }

  @SubL(source = "sublisp/cdestructuring-bind.lisp", position = 10581) 
  public static final SubLObject destructuring_bind_Xaux(SubLObject pattern, SubLObject datum, SubLObject error, SubLObject body) {
    if ((NIL == pattern)) {
      return body;
    } else if (pattern.isCons()) {
      if ((pattern.first() == $sym32$_AUX)) {
        pattern = pattern.rest();
        if ((!(pattern.isCons()))) {
          Errors.error($str13$Malformed_pattern__S_, pattern);
        }
        return destructuring_bind_more_Xaux(pattern, datum, error, body);
      } else {
        Errors.error($str13$Malformed_pattern__S_, pattern);
      }
    } else {
      Errors.error($str13$Malformed_pattern__S_, pattern);
    }
    return NIL;
  }

  @SubL(source = "sublisp/cdestructuring-bind.lisp", position = 10940) 
  public static final SubLObject destructuring_bind_more_Xaux(SubLObject pattern, SubLObject datum, SubLObject error, SubLObject body) {
    if ((NIL == pattern)) {
      return body;
    } else if (pattern.isCons()) {
      {
        SubLObject current = pattern.first();
        SubLObject var = NIL;
        SubLObject init = NIL;
        if (current.isCons()) {
          var = current.first();
          current = current.rest();
          if ((NIL != current)) {
            if ((!(current.isCons()))) {
              Errors.error($str13$Malformed_pattern__S_, pattern);
            }
            init = current.first();
            if ((NIL != current.rest())) {
              Errors.error($str13$Malformed_pattern__S_, pattern);
            }
          }
        } else {
          var = current;
        }
        if ((!(var.isSymbol()))) {
          Errors.error($str13$Malformed_pattern__S_, pattern);
        }
        return list(listS($sym2$CLET, list(list(var, init)), ConsesLow.append(destructuring_bind_more_Xaux(pattern.rest(), datum, error, body), NIL)));
      }
    } else {
      Errors.error($str13$Malformed_pattern__S_, pattern);
    }
    return NIL;
  }

  public static final SubLObject declare_cdestructuring_bind_file() {
    declareMacro("cdestructuring_bind", "CDESTRUCTURING-BIND");
    declareFunction("cdestructuring_bind_error", "CDESTRUCTURING-BIND-ERROR", 2, 0, false);
    declareFunction("destructuring_bind_must_consp", "DESTRUCTURING-BIND-MUST-CONSP", 3, 0, false);
    declareFunction("destructuring_bind_must_listp", "DESTRUCTURING-BIND-MUST-LISTP", 3, 0, false);
    declareFunction("property_list_member", "PROPERTY-LIST-MEMBER", 2, 0, false);
    declareMacro("bogus_unless", "BOGUS-UNLESS");
    declareFunction("destructuring_bind_Xwhole", "DESTRUCTURING-BIND-&WHOLE", 4, 0, false);
    declareFunction("destructuring_bind_required_args", "DESTRUCTURING-BIND-REQUIRED-ARGS", 4, 0, false);
    declareFunction("destructuring_bind_Xoptional", "DESTRUCTURING-BIND-&OPTIONAL", 4, 0, false);
    declareFunction("destructuring_bind_end_of_the_line", "DESTRUCTURING-BIND-END-OF-THE-LINE", 3, 0, false);
    declareFunction("destructuring_bind_more_Xoptional", "DESTRUCTURING-BIND-MORE-&OPTIONAL", 4, 0, false);
    declareFunction("destructuring_bind_Xrest", "DESTRUCTURING-BIND-&REST", 4, 0, false);
    declareFunction("destructuring_bind_Xkey", "DESTRUCTURING-BIND-&KEY", 4, 0, false);
    declareFunction("destructuring_bind_more_Xkey", "DESTRUCTURING-BIND-MORE-&KEY", 4, 0, false);
    declareFunction("destructuring_bind_Xaux", "DESTRUCTURING-BIND-&AUX", 4, 0, false);
    declareFunction("destructuring_bind_more_Xaux", "DESTRUCTURING-BIND-MORE-&AUX", 4, 0, false);
    return NIL;
  }

  public static final SubLObject init_cdestructuring_bind_file() {
    return NIL;
  }

  public static final SubLObject setup_cdestructuring_bind_file() {
        return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(makeSymbol("PATTERN"), makeSymbol("DATUM"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLString $str1$DATUM = makeString("DATUM");
  public static final SubLSymbol $sym2$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym3$PUNLESS = makeSymbol("PUNLESS");
  public static final SubLSymbol $sym4$NULL = makeSymbol("NULL");
  public static final SubLSymbol $sym5$CDESTRUCTURING_BIND_ERROR = makeSymbol("CDESTRUCTURING-BIND-ERROR");
  public static final SubLList $list6 = list(NIL);
  public static final SubLString $str7$CURRENT = makeString("CURRENT");
  public static final SubLSymbol $sym8$QUOTE = makeSymbol("QUOTE");
  public static final SubLString $str9$The_value__S_failed_to_match_the_ = makeString("The value ~S failed to match the ~S pattern ~S.");
  public static final SubLSymbol $sym10$CDESTRUCTURING_BIND = makeSymbol("CDESTRUCTURING-BIND");
  public static final SubLList $list11 = list(makeSymbol("FORM"));
  public static final SubLList $list12 = list(list(makeSymbol("ERROR"), makeString("Malformed pattern ~S."), makeSymbol("PATTERN")));
  public static final SubLString $str13$Malformed_pattern__S_ = makeString("Malformed pattern ~S.");
  public static final SubLSymbol $sym14$_WHOLE = makeSymbol("&WHOLE");
  public static final SubLList $list15 = list(makeSymbol("&OPTIONAL"), makeSymbol("&REST"), makeSymbol("&BODY"), makeSymbol("&KEY"), makeSymbol("&AUX"));
  public static final SubLSymbol $sym16$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $sym17$DESTRUCTURING_BIND_MUST_CONSP = makeSymbol("DESTRUCTURING-BIND-MUST-CONSP");
  public static final SubLSymbol $sym18$CSETQ = makeSymbol("CSETQ");
  public static final SubLSymbol $sym19$FIRST = makeSymbol("FIRST");
  public static final SubLSymbol $sym20$CPOP = makeSymbol("CPOP");
  public static final SubLString $str21$TEMP = makeString("TEMP");
  public static final SubLSymbol $sym22$REST = makeSymbol("REST");
  public static final SubLSymbol $sym23$_OPTIONAL = makeSymbol("&OPTIONAL");
  public static final SubLSymbol $sym24$PCOND = makeSymbol("PCOND");
  public static final SubLList $list25 = list(makeSymbol("&REST"), makeSymbol("&BODY"), makeSymbol("&KEY"), makeSymbol("&AUX"));
  public static final SubLSymbol $sym26$FIF = makeSymbol("FIF");
  public static final SubLSymbol $sym27$CONSP = makeSymbol("CONSP");
  public static final SubLSymbol $sym28$DESTRUCTURING_BIND_MUST_LISTP = makeSymbol("DESTRUCTURING-BIND-MUST-LISTP");
  public static final SubLList $list29 = list(makeSymbol("&REST"), makeSymbol("&BODY"));
  public static final SubLSymbol $sym30$_KEY = makeSymbol("&KEY");
  public static final SubLSymbol $sym31$_ALLOW_OTHER_KEYS = makeSymbol("&ALLOW-OTHER-KEYS");
  public static final SubLSymbol $sym32$_AUX = makeSymbol("&AUX");
  public static final SubLString $str33$ALLOW_OTHER_KEYS_P = makeString("ALLOW-OTHER-KEYS-P");
  public static final SubLString $str34$REST = makeString("REST");
  public static final SubLString $str35$BAD = makeString("BAD");
  public static final SubLSymbol $sym36$CDO = makeSymbol("CDO");
  public static final SubLSymbol $sym37$MEMBER = makeSymbol("MEMBER");
  public static final SubLList $list38 = list(T);
  public static final SubLSymbol $sym39$PWHEN = makeSymbol("PWHEN");
  public static final SubLList $list40 = list(makeKeyword("ALLOW-OTHER-KEYS"));
  public static final SubLSymbol $sym41$CAND = makeSymbol("CAND");
  public static final SubLSymbol $sym42$CNOT = makeSymbol("CNOT");
  public static final SubLList $list43 = list(makeSymbol("&AUX"));
  public static final SubLString $str44$_TAIL = makeString("-TAIL");
  public static final SubLSymbol $sym45$PROPERTY_LIST_MEMBER = makeSymbol("PROPERTY-LIST-MEMBER");
  public static final SubLSymbol $sym46$CADR = makeSymbol("CADR");
  public static final SubLList $list47 = list(T, NIL);

  //// Initializers

  public void declareFunctions() {
    declare_cdestructuring_bind_file();
  }

  public void initializeVariables() {
    init_cdestructuring_bind_file();
  }

  public void runTopLevelForms() {
    setup_cdestructuring_bind_file();
  }

}
