/*
 *  Copyright (c) 1995 - 2014 Cycorp, Inc.  All rights reserved.
 */

package org.logicmoo.system;

import static com.cyc.cycjava.cycl.utilities_macros.*;
//// 
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.HashMap;

import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

/**
 * Copyright (c) 1995 - 2014 Cycorp, Inc. All rights reserved. module: EXPORT
 */
public final class export extends SubLTranslatedFile {

  //// Constructor

  private export() {
  }

  public static final SubLFile me = new export();

  public static final String myName = me.getClass().getName();

  //// Definitions

  @SubL(source = "sublisp/export.lisp", position = 1569)
  public static SubLObject force_print(SubLObject string) {
    print_high.print(string, UNPROVIDED);
    streams_high.force_output(UNPROVIDED);
    return NIL;
  }
  //
  // @SubL(source = "sublisp/export.lisp", position = 1634)
  // public static SubLObject trans() {
  // Eval.load($str13$_opt_cyc_e2c_export_lisp);
  // {
  // SubLObject ts_file =
  // Functions.funcall(makeFunctionSymbol("TRANSLATE-FILE"), $str14$JavaTest,
  // $str13$_opt_cyc_e2c_export_lisp);
  // SubLObject fout =
  // compatibility.open_text($str15$_opt_cyc_e2c_export_trans, $kw16$OUTPUT);
  // Functions.funcall(makeFunctionSymbol("SHOW-TRANS-SUBL-FILE"), ts_file,
  // fout);
  // streams_high.close(fout, UNPROVIDED);
  // Functions.funcall(makeFunctionSymbol("JAVA-BACKEND-OUTPUT-FILE"),
  // ts_file, $str17$_opt_cyc_e2c_export_java);
  // return ts_file;
  // }
  // }

  @SubL(source = "sublisp/export.lisp", position = 2073)
  public static SubLSymbol $a$ = null;

  @SubL(source = "sublisp/export.lisp", position = 2092)
  public static SubLSymbol $assrtid$ = null;

  @SubL(source = "sublisp/export.lisp", position = 2115)
  public static SubLSymbol $assrtform$ = null;

  @SubL(source = "sublisp/export.lisp", position = 2301)
  public static SubLSymbol $ded$ = null;

  @SubL(source = "sublisp/export.lisp", position = 2320)
  public static SubLSymbol $every1000$ = null;

  @SubL(source = "sublisp/export.lisp", position = 2344)
  public static SubLSymbol $renames$ = null;

  @SubL(source = "sublisp/export.lisp", position = 2427)
  public static SubLSymbol $kbnum$ = null;

  @SubL(source = "sublisp/export.lisp", position = 2588)
  public static SubLObject plw_str(SubLObject p) {
    print_high.princ(p, UNPROVIDED);
    return NIL;
  }

  @SubL(source = "sublisp/export.lisp", position = 2588)
  public static SubLObject plw_str(String p) {
    print_high.princ(makeString(p), UNPROVIDED);
    return NIL;
  }

  @SubL(source = "sublisp/export.lisp", position = 2622)
  public static SubLObject plw_nl() {
    PrintLow.format(T, $str21$__);
    return NIL;
  }

  @SubL(source = "sublisp/export.lisp", position = 2662)
  public static SubLObject prolog_no_need_quote(SubLObject str) {
    return NIL;
  }

  @SubL(source = "sublisp/export.lisp", position = 2706)
  public static SubLObject prolog_need_quote(SubLObject str) {
    if ((!(Sequences.substitute(Characters.CHAR_underbar, Characters.CHAR_hyphen, str, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED).equal(str)))) {
      return T;
    }
    {
      SubLObject ch = Strings.sublisp_char(str, ZERO_INTEGER);
      if ((NIL != conses_high.member(ch, $list22, Symbols.symbol_function($sym23$CHAR_), UNPROVIDED))) {
        return NIL;
      }
      return makeBoolean(((NIL == Characters.lower_case_p(ch)) || (NIL != Sequences.find(Characters.CHAR_colon, str, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))));
    }
  }

  @SubL(source = "sublisp/export.lisp", position = 2994)
  public static SubLObject plw_list(SubLObject trm0, SubLObject begstr, SubLObject endstr, SubLObject nullstr) {
    if ((begstr == UNPROVIDED)) {
      begstr = $str24$;
    }
    if ((endstr == UNPROVIDED)) {
      endstr = $str24$;
    }
    if ((nullstr == UNPROVIDED)) {
      nullstr = $str24$;
    }
    if ((NIL == trm0)) {
      plw_str(begstr);
      plw_str(endstr);
    } else if (trm0.isAtom()) {
      plw_term(trm0, UNPROVIDED);
    } else if ((NIL == trm0.rest())) {
      plw_str(begstr);
      plw_term(trm0.first(), UNPROVIDED);
      plw_str(endstr);
    } else if ((!(trm0.rest().isCons()))) {
      plw_str(begstr);
      plw_term(trm0.first(), UNPROVIDED);
      plw_str($str25$_______);
      plw_term(trm0.rest(), UNPROVIDED);
      plw_str(endstr);
    } else {
      plw_str(begstr);
      plw_term(trm0.first(), UNPROVIDED);
      plw_cdr(trm0.rest(), $str26$_, $str27$_, nullstr);
      plw_str(endstr);
    }
    return NIL;
  }

  @SubL(source = "sublisp/export.lisp", position = 3534)
  public static SubLObject plw_cdr(SubLObject trm, SubLObject commastr, SubLObject barstr, SubLObject nullstr) {
    if ((commastr == UNPROVIDED)) {
      commastr = $str26$_;
    }
    if ((barstr == UNPROVIDED)) {
      barstr = $str27$_;
    }
    if ((nullstr == UNPROVIDED)) {
      nullstr = $str24$;
    }
    if ((NIL == trm)) {
      plw_str(nullstr);
    } else if ((!(trm.isCons()))) {
      plw_str(barstr);
      plw_term(trm, UNPROVIDED);
    } else if ((NIL == trm.rest())) {
      plw_str(commastr);
      plw_term(trm.first(), UNPROVIDED);
    } else if ((!(trm.rest().isCons()))) {
      plw_str(commastr);
      plw_term(trm.first(), UNPROVIDED);
      plw_str(barstr);
      plw_term(trm.rest(), UNPROVIDED);
    } else {
      plw_str(commastr);
      plw_term(trm.first(), UNPROVIDED);
      plw_cdr(trm.rest(), commastr, barstr, nullstr);
    }
    return NIL;
  }

  @SubL(source = "sublisp/export.lisp", position = 4046)
  public static SubLObject plw_atom(SubLObject trm, SubLObject out) {
    if ((out == UNPROVIDED)) {
      out = StreamsLow.$standard_output$.getDynamicValue();
    }
    if ((NIL != Functions.funcall(makeFunctionSymbol("CONSTANT-P"), trm))) {
      plw_atom(constant_prolog_name(trm), UNPROVIDED);
    } else {
      trm = Strings.string(trm);
      if ((NIL == prolog_no_need_quote(trm))) {
        plw_str($str28$_);
        plw_str(trm);
        plw_str($str28$_);
      } else {
        plw_str(trm);
      }
    }
    return NIL;
  }

  @SubL(source = "sublisp/export.lisp", position = 4331)
  public static SubLObject simple_name(SubLObject trm) {
    if ((NIL != Functions.funcall(makeFunctionSymbol("CONSTANT-P"), trm))) {
      return Functions.funcall(makeFunctionSymbol("CONSTANT-NAME"), trm);
    }
    if (trm.isString()) {
      return trm;
    }
    return Strings.string(trm);
  }

  @SubL(source = "sublisp/export.lisp", position = 4471)
  public static SubLObject plw_naut(SubLObject str, SubLObject trm) {
    if ((!(trm.isCons()))) {
      print_high.princ(str, UNPROVIDED);
      print_high.princ($str29$0_, UNPROVIDED);
      plw_term(trm, UNPROVIDED);
      print_high.princ($str30$_, UNPROVIDED);
    } else {
      {
        SubLObject pred = Sequences.elt(trm, ZERO_INTEGER);
        SubLObject cdrtrm = trm.rest();
        SubLObject va = Functions.funcall(makeFunctionSymbol("ISA?"), pred, $const31$VariableArityRelation);
        if ((NIL != Functions.funcall(makeFunctionSymbol("FUNCTION?"), pred))) {
          if ((NIL != Functions.funcall(makeFunctionSymbol("ISA?"), pred, $const32$UnreifiableFunction))) {
            plw_str(str);
            plw_str($str33$U_);
            plw_term(pred, UNPROVIDED);
            plw_argz(va, cdrtrm);
            plw_str($str30$_);
          } else if ((NIL != Functions.funcall(makeFunctionSymbol("ISA?"), pred, $const34$ReifiableFunction))) {
            plw_str(str);
            plw_str($str35$R_);
            plw_term(pred, UNPROVIDED);
            plw_argz(va, cdrtrm);
            plw_str($str30$_);
          } else {
            plw_str(str);
            plw_str($str36$D_);
            plw_term(pred, UNPROVIDED);
            plw_argz(va, cdrtrm);
            plw_str($str30$_);
          }
        } else if (Sequences.length(trm).equal(ONE_INTEGER)) {
          plw_str(str);
          plw_str($str37$1_);
          plw_term(trm.first(), UNPROVIDED);
          plw_str($str30$_);
        } else if (Sequences.length(trm).equal(TWO_INTEGER)) {
          plw_str(str);
          plw_str($str38$2_);
          plw_term(trm.first(), UNPROVIDED);
          plw_str($str26$_);
          plw_term(conses_high.second(trm), UNPROVIDED);
          plw_str($str30$_);
        } else if (Sequences.length(trm).equal(THREE_INTEGER)) {
          plw_str(str);
          plw_str($str39$3_);
          plw_term(trm.first(), UNPROVIDED);
          plw_str($str26$_);
          plw_term(conses_high.second(trm), UNPROVIDED);
          plw_str($str26$_);
          plw_term(conses_high.third(trm), UNPROVIDED);
          plw_str($str30$_);
        } else if (conses_high.second(trm).isString()) {
          plw_str(str);
          plw_str($str40$S_);
          plw_term(trm.first(), UNPROVIDED);
          plw_argz(T, trm.rest());
          plw_str($str30$_);
        } else {
          plw_str(str);
          plw_str($str41$N_);
          plw_term(trm.first(), UNPROVIDED);
          plw_argz(T, trm.rest());
          plw_str($str30$_);
        }
      }
    }
    return NIL;
  }

  @SubL(source = "sublisp/export.lisp", position = 5762)
  public static SubLObject assertion_varnames(SubLObject assrt) {
    {
      SubLObject varnames = NIL;
      SubLObject cdolist_list_var = Functions.funcall(makeFunctionSymbol("ASSERTION-EL-VARIABLES"), assrt);
      SubLObject v = NIL;
      for (v = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), v = cdolist_list_var.first()) {
        varnames = ConsesLow.append(varnames, list(Sequences.substitute(Characters.CHAR_underbar, Characters.CHAR_hyphen, Functions.funcall(makeFunctionSymbol("EL-VAR-NAME-WITHOUT-PREFIX"), v), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
      }
      return varnames;
    }
  }

  @SubL(source = "sublisp/export.lisp", position = 6001)
  public static SubLObject plw_dotl(SubLObject cdrtrm) {
    plw_list(cdrtrm, $str42$_, $str43$_, UNPROVIDED);
    return NIL;
  }

  @SubL(source = "sublisp/export.lisp", position = 6060)
  public static SubLObject plw_argz(SubLObject va, SubLObject cdrtrm) {
    if ((NIL != va)) {
      if ((NIL == cdrtrm)) {
        plw_str($str44$_____);
      } else {
        plw_str($str26$_);
        plw_dotl(cdrtrm);
      }
    } else {
      if ((NIL != cdrtrm)) {
        plw_str($str26$_);
        plw_list(cdrtrm, UNPROVIDED, UNPROVIDED, UNPROVIDED);
      }
    }
    return NIL;
  }

  @SubL(source = "sublisp/export.lisp", position = 6255)
  public static SubLObject plw_string(SubLObject trm) {
    if ((!(((NIL != Sequences.search($str45$_, trm, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && THREE_INTEGER.numL(Sequences.length(trm)))))) {
      print_high.princ(PrintLow.write_to_string(trm, EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED);
    } else {
      {
        SubLObject b = split(trm);
        SubLObject a = b.first();
        SubLObject d = b.rest();
        if ((NIL == d)) {
          print_high.princ(PrintLow.write_to_string(trm, EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED);
        } else {
          print_high.princ($str46$s_, UNPROVIDED);
          print_high.princ(PrintLow.write_to_string(a, EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED);
          {
            SubLObject cdolist_list_var = d;
            SubLObject c = NIL;
            for (c = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), c = cdolist_list_var.first()) {
              print_high.princ($str26$_, UNPROVIDED);
              print_high.princ(PrintLow.write_to_string(c, EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED);
            }
          }
          print_high.princ($str30$_, UNPROVIDED);
        }
      }
    }
    return NIL;
  }

  @SubL(source = "sublisp/export.lisp", position = 6640)
  public static SubLObject rsw(SubLObject str) {
    return str;
  }

  @SubL(source = "sublisp/export.lisp", position = 6672)
  public static SubLObject split(SubLObject str) {
    {
      SubLObject word = NIL;
      SubLObject prev = Characters.CHAR_space;
      SubLObject tokens = NIL;
      SubLObject split_ignore_punctuationP = NIL;
      SubLObject slen = Sequences.length(str);
      SubLObject index = NIL;
      for (index = ZERO_INTEGER; index.numL(slen); index = Numbers.add(index, ONE_INTEGER)) {
        {
          SubLObject curr = Strings.sublisp_char(str, index);
          if (curr.eql(Characters.CHAR_space)) {
            if ((NIL != word)) {
              tokens = cons(rsw(word), tokens);
              word = NIL;
            }
          } else if ((NIL != conses_high.member(curr, $list47, UNPROVIDED, UNPROVIDED))) {
            if ((NIL != word)) {
              tokens = cons(rsw(word), tokens);
              word = NIL;
            }
            tokens = cons(Strings.string(curr), tokens);
          } else if ((NIL != conses_high.member(curr, $list48, UNPROVIDED, UNPROVIDED))) {
            if ((NIL != word)) {
              tokens = cons(rsw(word), tokens);
            }
            word = Strings.string(curr);
          } else if ((NIL != conses_high.member(curr, $list49, UNPROVIDED, UNPROVIDED))) {
            if ((NIL != word)) {
              word = PrintLow.format(NIL, $str50$_A_C, word, curr);
              tokens = cons(rsw(word), tokens);
              word = NIL;
            } else {
              tokens = cons(Strings.string(curr), tokens);
            }
          } else if ((curr.eql(Characters.CHAR_period) && (index.eql(Numbers.subtract(slen, ONE_INTEGER)) || Strings.sublisp_char(str, Numbers.add(index, ONE_INTEGER)).eql(Characters.CHAR_space)))) {
            if ((NIL != word)) {
              tokens = cons(rsw(word), tokens);
              word = NIL;
              tokens = cons($str51$_, tokens);
            }
          } else if (((NIL != Characters.alphanumericp(curr)) || (NIL != conses_high.member(curr, $list52, UNPROVIDED, UNPROVIDED)))) {
            if ((NIL != word)) {
              word = PrintLow.format(NIL, $str50$_A_C, word, curr);
            } else {
              word = PrintLow.format(NIL, $str53$_C, curr);
            }
          } else {
            if ((NIL != word)) {
              tokens = cons(rsw(word), tokens);
            }
            word = NIL;
            tokens = cons(Strings.string(curr), tokens);
          }
          prev = curr;
        }
      }
      if ((NIL != word)) {
        tokens = cons(rsw(word), tokens);
      }
      return Sequences.nreverse(tokens);
    }
  }

  @SubL(source = "sublisp/export.lisp", position = 8366)
  public static SubLObject unescape(SubLObject str) {
    str = Sequences.substitute(Characters.CHAR_vertical, Characters.CHAR_return, Sequences.substitute(Characters.CHAR_vertical, Characters.CHAR_newline, str, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    return (Sequences.length(str).numL(THREE_INTEGER) ? ((SubLObject) str) : Strings.string_trim($list54, str));
  }

  @SubL(source = "sublisp/export.lisp", position = 8541)
  public static SubLObject plw_term(SubLObject trm, SubLObject is_pred) {
    if ((is_pred == UNPROVIDED)) {
      is_pred = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != Functions.funcall(makeFunctionSymbol("NART-P"), trm))) {
        plw_naut($str55$nart, Functions.funcall(makeFunctionSymbol("NART-HL-FORMULA"), trm));
      } else if ((NIL != Functions.funcall(makeFunctionSymbol("ASSERTION-P"), trm))) {
        return plw_str(plw_aid(trm));
      } else if (trm.equal($str56$__)) {
        plw_str($str57$____);
      } else if ((NIL == trm)) {
        plw_str($str57$____);
      } else if ((NIL != Functions.funcall(makeFunctionSymbol("HL-VARIABLE-P"), trm))) {
        plw_term(ConsesLow.nth(Functions.funcall(makeFunctionSymbol("VARIABLE-ID"), trm), Functions.funcall(makeFunctionSymbol("ASSERTION-EL-VARIABLES"), $a$.getDynamicValue(thread))), UNPROVIDED);
      } else if ((NIL != Functions.funcall(makeFunctionSymbol("EL-VARIABLE-P"), trm))) {
        plw_str(Sequences.substitute(Characters.CHAR_underbar, Characters.CHAR_hyphen, Functions.funcall(makeFunctionSymbol("EL-VAR-NAME-WITHOUT-PREFIX"), trm), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
      } else if ((NIL != Functions.funcall(makeFunctionSymbol("CONSTANT-P"), trm))) {
        plw_atom(trm, UNPROVIDED);
      } else if (trm.isKeyword()) {
        plw_atom(Symbols.symbol_name(trm), UNPROVIDED);
      } else if (trm.isSymbol()) {
        plw_str($str28$_);
        plw_str(Packages.package_name(Symbols.symbol_package(trm)));
        plw_str($str58$_);
        plw_str(Symbols.symbol_name(trm));
        plw_str($str28$_);
      } else if (trm.isString()) {
        plw_string(unescape(trm));
      } else if ((!(trm.isCons()))) {
        plw_str(PrintLow.write_to_string(trm, EMPTY_SUBL_OBJECT_ARRAY));
      } else {
        plw_term_cons(trm, is_pred);
      }
      return NIL;
    }
  }

  /**
   * @param trm
   * @return
   */
  private static String plw_aid(SubLObject trm) {

    long id = Functions.funcall(makeSymbol("ASSERTION-ID"), trm).longValue();
    String kbi = "a7166_" + id;

    SubLObject elvars = Functions.funcall(makeFunctionSymbol("ASSERTION-EL-VARIABLES"), trm);
    if ((NIL == elvars))
      return kbi;
    kbi += "(";
    SubLObject v = elvars.first();
    kbi += plw_varstring(v);
    SubLObject cdolist_list_var = elvars.rest();
    if (cdolist_list_var == NIL) {
      for (v = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), v = cdolist_list_var.first()) {
        kbi += ",";
        kbi += plw_varstring(v);
      }
    }
    return kbi + ")";
  }

  /**
   * @param v
   */
  private static String plw_varstring(SubLObject v) {
    return Functions.funcall(makeFunctionSymbol("EL-VAR-NAME-WITHOUT-PREFIX"), v).getString().replace('-', '_');
  }

  @SubL(source = "sublisp/export.lisp", position = 9622)
  public static SubLObject plw_term_cons(SubLObject trm, SubLObject is_pred) {
    if ((is_pred == UNPROVIDED)) {
      is_pred = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject pred = trm.first();
        SubLObject wtrm = trm;
        SubLObject cdrtrm = trm.rest();
        if ((NIL != Functions.funcall(makeFunctionSymbol("FUNCTION?"), pred))) {
          plw_naut($str59$u, wtrm);
        } else if (((NIL != conses_high.member(pred, $no_tify$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) || ((NIL != Functions.funcall(makeFunctionSymbol("CONSTANT-P"), pred)) && (NIL != Functions.funcall(makeFunctionSymbol("PREDICATE?"), pred))))) {
          plw_atom(pred, UNPROVIDED);
          plw_list(cdrtrm, $str60$_, $str30$_, UNPROVIDED);
        } else if ((!(((NIL != is_pred) || (NIL != Functions.funcall(makeFunctionSymbol("PREDICATE?"), pred)))))) {
          plw_naut($str59$u, wtrm);
        } else if ((NIL != Functions.funcall(makeFunctionSymbol("CONSTANT-P"), pred))) {
          plw_str($str61$t_);
          plw_atom(pred, UNPROVIDED);
          if ((NIL != cdrtrm)) {
            plw_list(cdrtrm, $str26$_, $str45$_, UNPROVIDED);
          }
          plw_str($str30$_);
        } else {
          plw_list(wtrm, $str61$t_, $str30$_, UNPROVIDED);
        }
      }
      return NIL;
    }
  }

  @SubL(source = "sublisp/export.lisp", position = 10383)
  public static SubLSymbol $no_tify$ = null;

  @SubL(source = "sublisp/export.lisp", position = 10508)
  public static SubLObject pre_export() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject cdolist_list_var = Functions.funcall(makeFunctionSymbol("ALL-INSTANCES"), $const63$Quantifier);
        SubLObject s = NIL;
        for (s = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), s = cdolist_list_var.first()) {
          {
            SubLObject item_var = s;
            if ((NIL == conses_high.member(item_var, $no_tify$.getDynamicValue(thread), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
              $no_tify$.setDynamicValue(cons(item_var, $no_tify$.getDynamicValue(thread)), thread);
            }
          }
        }
      }
      {
        SubLObject cdolist_list_var = Functions.funcall(makeFunctionSymbol("ALL-INSTANCES"), $const64$HLPredicate);
        SubLObject s = NIL;
        for (s = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), s = cdolist_list_var.first()) {
          {
            SubLObject item_var = s;
            if ((NIL == conses_high.member(item_var, $no_tify$.getDynamicValue(thread), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
              $no_tify$.setDynamicValue(cons(item_var, $no_tify$.getDynamicValue(thread)), thread);
            }
          }
        }
      }
      {
        SubLObject cdolist_list_var = Functions.funcall(makeFunctionSymbol("ALL-INSTANCES"), $const65$MicrotheoryDesignatingPredicate);
        SubLObject s = NIL;
        for (s = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), s = cdolist_list_var.first()) {
          {
            SubLObject item_var = s;
            if ((NIL == conses_high.member(item_var, $no_tify$.getDynamicValue(thread), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
              $no_tify$.setDynamicValue(cons(item_var, $no_tify$.getDynamicValue(thread)), thread);
            }
          }
        }
      }
      {
        SubLObject cdolist_list_var = Functions.funcall(makeFunctionSymbol("ALL-INSTANCES"), $const66$LogicalConnective);
        SubLObject s = NIL;
        for (s = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), s = cdolist_list_var.first()) {
          {
            SubLObject item_var = s;
            if ((NIL == conses_high.member(item_var, $no_tify$.getDynamicValue(thread), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
              $no_tify$.setDynamicValue(cons(item_var, $no_tify$.getDynamicValue(thread)), thread);
            }
          }
        }
      }
      {
        SubLObject cdolist_list_var = Functions.funcall(makeFunctionSymbol("ALL-INSTANCES"), $const67$KBDependentRelation);
        SubLObject s = NIL;
        for (s = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), s = cdolist_list_var.first()) {
          {
            SubLObject item_var = s;
            if ((NIL == conses_high.member(item_var, $no_tify$.getDynamicValue(thread), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
              $no_tify$.setDynamicValue(cons(item_var, $no_tify$.getDynamicValue(thread)), thread);
            }
          }
        }
      }
      {
        SubLObject cdolist_list_var = Functions.funcall(makeFunctionSymbol("ALL-INSTANCES"), $const68$ModalPredicate);
        SubLObject s = NIL;
        for (s = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), s = cdolist_list_var.first()) {
          {
            SubLObject item_var = s;
            if ((NIL == conses_high.member(item_var, $no_tify$.getDynamicValue(thread), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
              $no_tify$.setDynamicValue(cons(item_var, $no_tify$.getDynamicValue(thread)), thread);
            }
          }
        }
      }
      {
        SubLObject item_var = $const69$trueRule;
        if ((NIL == conses_high.member(item_var, $no_tify$.getDynamicValue(thread), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
          $no_tify$.setDynamicValue(cons(item_var, $no_tify$.getDynamicValue(thread)), thread);
        }
      }
      return NIL;
    }
  }

  @SubL(source = "sublisp/export.lisp", position = 11059)
  public static SubLObject constant_prolog_name(SubLObject trm) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject found = Hashtables.gethash(trm, $renames$.getDynamicValue(thread), UNPROVIDED);
        if (found.isString()) {
          return found;
        }
        return Functions.funcall(makeFunctionSymbol("CONSTANT-NAME"), trm);
      }
    }
  }

  @SubL(source = "sublisp/export.lisp", position = 11210)
  public static SubLObject plw_writel(SubLObject assrt) {
    {
      SubLObject carform = assrt.first();
      SubLObject cdrform = assrt.rest();
      plw_term(assrt.first(), UNPROVIDED);
      if ((NIL != cdrform)) {
        plw_list(cdrform, $str26$_, $str45$_, UNPROVIDED);
      }
    }
    return NIL;
  }

  @SubL(source = "sublisp/export.lisp", position = 11378)
  public static SubLObject showa(SubLObject assrt, SubLObject out) {

    if ((out == UNPROVIDED)) {
      out = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject elvars = NIL;
        SubLObject found = NIL;
        {
          SubLObject _prev_bind_0 = StreamsLow.$standard_output$.currentBinding(thread);
          try {
            StreamsLow.$standard_output$.bind(((NIL != out) ? ((SubLObject) out) : StreamsLow.$standard_output$.getDynamicValue(thread)), thread);
            if (assrt.isInteger()) {
              found = Functions.funcall(makeFunctionSymbol("FIND-ASSERTION-BY-ID"), assrt);
              if ((NIL != found)) {
                assrt = found;
              }
            }
            if (assrt.isCons()) {
              found = Functions.funcall(makeFunctionSymbol("FIND-ASSERTION-ANY-MT"), assrt);
              if ((NIL != found)) {
                assrt = found;
              }
            }

            $assrtform$.setDynamicValue(Functions.funcall(makeFunctionSymbol("ASSERTION-FORMULA"), assrt), thread);
            if ((NIL != $assrtform$.getDynamicValue(thread))) {
              if ((!($assrtform$.getDynamicValue(thread).first().equal($const70$termOfUnit)))) {
                $a$.setDynamicValue(assrt, thread);
                String idstr = plw_aid(assrt);
                if (!idstr.contains("("))
                  return NIL;
                $assrtid$.setDynamicValue(makeString(idstr), thread);
                if (true) {
                  SubLObject varinfo = assertion_variable_guard(assrt);
                  try {
                    if (varinfo != NIL) {
                      plw_str("assertion_variable_guard(");
                      plw_str(idstr);
                      plw_str(",");
                      plw_term(varinfo, UNPROVIDED);
                      plw_str(").\n");
                    }
                  } catch (Exception e) {

                  }
                  return NIL;
                }
                plw_str($str73$assertion_content_);
                plw_list($assrtform$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                plw_str($str26$_);
                plw_str($assrtid$.getDynamicValue(thread));
                plw_str($str74$__);
                plw_nl();
                ruleinfo(assrt, $sym75$ASSERTION_MT, UNPROVIDED);
                if ((NIL != elvars)) {
                  plw_str($str76$assertion_varnames_);
                  plw_str($assrtid$.getDynamicValue(thread));
                  plw_str($str77$__);
                  plw_list(assertion_varnames($a$.getDynamicValue(thread)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                  plw_str($str78$___);
                  plw_nl();
                }
                plw_ruleinfo(((NIL != Functions.funcall(makeFunctionSymbol("RULE-ASSERTION?"), assrt)) ? ((SubLObject) $str79$rule) : $str80$fact), UNPROVIDED);
                plw_ruleinfo(Strings.string_downcase(Symbols.symbol_name(Functions.funcall(makeFunctionSymbol("ASSERTION-STRENGTH"), assrt)), UNPROVIDED, UNPROVIDED), UNPROVIDED);
                plw_ruleinfo(Strings.string_downcase(Symbols.symbol_name(Functions.funcall(makeFunctionSymbol("ASSERTION-DIRECTION"), assrt)), UNPROVIDED, UNPROVIDED), UNPROVIDED);
                ruleinfo_not(assrt, $sym81$ASSERTION_P, $str82$assertion);
                mruleinfo(assrt);
              }
            }
          } finally {
            StreamsLow.$standard_output$.rebind(_prev_bind_0, thread);
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "sublisp/export.lisp", position = 13026)
  public static SubLObject plw_ruleinfo(SubLObject str, SubLObject value) {
    if ((value == UNPROVIDED)) {
      value = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      plw_str($str83$assertion_);
      plw_str(str);
      plw_str($str60$_);
      plw_str($assrtid$.getDynamicValue(thread));
      if ((NIL == Types.booleanp(value))) {
        plw_str($str26$_);
        if (value.isSymbol())
          plw_str(Strings.string_downcase(Symbols.symbol_name(value), UNPROVIDED, UNPROVIDED));
        else
          plw_term(value, UNPROVIDED);
      }
      plw_str($str74$__);
      plw_nl();
      return NIL;
    }
  }

  @SubL(source = "sublisp/export.lisp", position = 13393)
  public static SubLObject assertion_variable_guard(SubLObject assrt) {
    if (assrt.isInteger()) {
      assrt = Functions.funcall(makeFunctionSymbol("FIND-ASSERTION-BY-ID"), assrt);
    }
    return Functions.funcall(makeFunctionSymbol("FORMULA-VARIABLES-ARG-CONSTRAINTS"), Functions.funcall(makeFunctionSymbol("ASSERTION-FORMULA"), assrt), Functions.funcall(makeFunctionSymbol("ASSERTION-MT"), assrt));
  }

  @SubL(source = "sublisp/export.lisp", position = 13603)
  public static SubLObject ri() {
    {
      SubLObject anum = NIL;
      for (anum = $int$990000; (!(anum.numE(Numbers.add($int$990000, $int$500)))); anum = Functions.funcall(makeFunctionSymbol("1+"), anum)) {
        {
          SubLObject assrt = Functions.funcall(makeFunctionSymbol("FIND-ASSERTION-BY-ID"), anum);
          showa(assrt, UNPROVIDED);
        }
      }
    }
    return NIL;
  }

  @SubL(source = "sublisp/export.lisp", position = 13795)
  public static SubLObject ruleinfo(SubLObject assrt, SubLObject type, SubLObject str) {
    if ((str == UNPROVIDED)) {
      str = NIL;
    }
    if (type.isCons()) {
      {
        SubLObject cdolist_list_var = type;
        SubLObject tipe = NIL;
        for (tipe = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), tipe = cdolist_list_var.first()) {
          ruleinfo(assrt, tipe, UNPROVIDED);
        }
      }
    } else {
      if ((NIL != Symbols.fboundp(type))) {
        {
          SubLObject value = Functions.funcall(type, assrt);
          if ((NIL != value)) {
            if ((NIL == str)) {
              str = simple_type_str(type);
            }
            plw_ruleinfo(str, value);
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "sublisp/export.lisp", position = 14097)
  public static SubLSymbol $error_message$ = null;

  @SubL(source = "sublisp/export.lisp", position = 14141)
  public static SubLObject no_errors(SubLObject macroform, SubLObject environment) {
    {
      SubLObject datum = macroform.rest();
      SubLObject current = datum;
      SubLObject err = NIL;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list86);
      err = current.first();
      current = current.rest();
      {
        SubLObject code = current;
        return list($sym87$CLET, $list88, list($sym89$WITH_ERROR_HANDLER, $list90, list($sym91$CSETQ, $sym92$LASTVAL, listS($sym93$PROGN, $list94, $list95, ConsesLow.append(code, NIL)))), listS($sym96$FIF, $sym97$HADERROR, list($sym93$PROGN, $list98, list($sym99$QUOTE, err)), $list100));
      }
    }
  }

  // @SubL(source = "sublisp/export.lisp", position = 14590)
  // public static SubLObject my_funcall(SubLObject type, SubLObject assrt,
  // SubLObject err) {
  // return {
  // SubLObject haderror = NIL;
  // SubLObject lastval = NIL;
  // {
  // SubLObject _prev_bind_0 = Dynamic.currentBinding(Errors.$error_handler$);
  // try {
  // Dynamic.bind(Errors.$error_handler$, Symbols.symbol_function($list101));
  // try {
  // lastval = {
  // lastval = NIL;
  // haderror = NIL;
  // Functions.funcall(type, assrt);
  // };
  // } catch (Throwable catch_var) {
  // Errors.handleThrowable(catch_var, NIL);
  // }
  // } finally {
  // Dynamic.rebind(Errors.$error_handler$, _prev_bind_0);
  // }
  // }
  // ((NIL != haderror) ? ((SubLObject) {
  // print_high.print(haderror, UNPROVIDED);
  // $sym102$ERR
  // }) : lastval)
  // };
  // }

  @SubL(source = "sublisp/export.lisp", position = 14674)
  public static SubLObject ruleinfo_not(SubLObject assrt, SubLObject type, SubLObject str) {
    if ((str == UNPROVIDED)) {
      str = NIL;
    }
    if (type.isCons()) {
      {
        SubLObject cdolist_list_var = type;
        SubLObject tipe = NIL;
        for (tipe = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), tipe = cdolist_list_var.first()) {
          ruleinfo_not(assrt, tipe, UNPROVIDED);
        }
      }
    } else {
      if ((NIL != Symbols.fboundp(type))) {
        if ((NIL == Functions.funcall(type, assrt))) {
          if ((NIL == str)) {
            str = simple_type_str(type);
          }
          plw_ruleinfo(Sequences.cconcatenate($str103$not_, str), UNPROVIDED);
        }
      }
    }
    return NIL;
  }

  @SubL(source = "sublisp/export.lisp", position = 14976)
  public static SubLObject mruleinfo(SubLObject assrt) {
    if ((NIL != Functions.funcall(makeFunctionSymbol("RULE-ASSERTION?"), assrt))) {
      ruleinfo(assrt, $list104, UNPROVIDED);
      ruleinfo(assrt, $list105, UNPROVIDED);
    } else {
      ruleinfo_not(assrt, $list105, UNPROVIDED);
      ruleinfo(assrt, $list106, UNPROVIDED);
    }

    ruleinfo_not(assrt, $list107, UNPROVIDED);
    ruleinfo(assrt, $list108, UNPROVIDED);
    return NIL;
  }

  @SubL(source = "sublisp/export.lisp", position = 18272)
  public static SubLObject simple_type_str(SubLObject type) {
    String s = type.toSymbol().getName().replace('-', '_').toLowerCase();
    if (s.startsWith("assertion_")) {
      s = s.substring(10);
      type = null;
    }
    int len = s.length();
    if (s.endsWith("_p")) {
      len -= 2;
      s = s.substring(0, len);
      type = null;
    }
    if (s.endsWith("?")) {
      len -= 1;
      s = s.substring(0, len);
      type = null;
    }
    if (s.endsWith("_assertions")) {
      len -= 11;
      s = s.substring(0, len);
      type = null;
    }
    if (s.endsWith("_assertion")) {
      len -= 10;
      s = s.substring(0, len);
      type = null;
    }
    if (s.endsWith("_rule")) {
      len -= 5;
      s = s.substring(0, len);
      type = null;
    }
    if (type != null)
      return type;
    return makeString(s);
  }
  //
  // @SubL(source = "sublisp/export.lisp", position = 18788)
  // public static SubLObject rana(SubLObject a) {
  // if ((a == UNPROVIDED)) {
  // a = NIL;
  // }
  // {
  // final SubLThread thread = SubLProcess.currentSubLThread();
  // a = Functions.funcall(makeFunctionSymbol("FIND-ASSERTION-BY-ID"),
  // random.random(Functions.funcall(makeFunctionSymbol("ASSERTION-COUNT"))));
  // if (Numbers.rem(
  // $every1000$.setDynamicValue(Numbers.add($every1000$.getDynamicValue(thread),
  // ONE_INTEGER), thread),
  // TWO_INTEGER).equal(ONE_INTEGER)) {
  // {
  // SubLObject anum = NIL;
  // for (anum = ONE_INTEGER; (!(anum.numE($int$500))); anum =
  // Functions.funcall(makeFunctionSymbol("1+"),
  // anum)) {
  // if ((NIL != Functions.funcall(makeFunctionSymbol("RULE-ASSERTION?"), a)))
  // {
  // return a;
  // }
  // a = Functions.funcall(makeFunctionSymbol("FIND-ASSERTION-BY-ID"),
  // random.random(Functions.funcall(makeFunctionSymbol("ASSERTION-COUNT"))));
  // }
  // }
  // }
  // return a;
  // }
  // }

  // @SubL(source = "sublisp/export.lisp", position = 19310)
  // public static SubLObject w(SubLObject start) {
  // if ((start == UNPROVIDED)) {
  // start = ZERO_INTEGER;
  // }
  // Eval.load($str115$e2c_export_lisp);
  // w0(start);
  // return NIL;
  // }
  ////
  // @SubL(source = "sublisp/export.lisp", position = 19419)
  // public static SubLObject w0(SubLObject start) {
  // if ((start == UNPROVIDED)) {
  // start = ZERO_INTEGER;
  // }
  // {
  // final SubLThread thread = SubLProcess.currentSubLThread();
  // {
  // SubLObject anum = NIL;
  // for (anum = Numbers.add(start, $int$250); (!(anum.numL(start))); anum
  // = Functions
  // .funcall(makeFunctionSymbol("1-"), anum)) {
  // $a$.setDynamicValue((start.eql(ZERO_INTEGER) ? ((SubLObject)
  // rana(UNPROVIDED))
  // : Functions.funcall(makeFunctionSymbol("FIND-ASSERTION-BY-ID"), anum)),
  // thread);
  // PrintLow.format(T, $str117$_____);
  // print_high.princ($str118$____w_, UNPROVIDED);
  // print_high.princ(Functions.funcall(makeFunctionSymbol("ASSERTION-ID"),
  // $a$.getDynamicValue(thread)),
  // UNPROVIDED);
  // print_high.princ($str119$____, UNPROVIDED);
  // streams_high.force_output(UNPROVIDED);
  // showa($a$.getDynamicValue(thread), UNPROVIDED);
  // streams_high.force_output(UNPROVIDED);
  // }
  // }
  // print_high.print(list($sym120$W, start), UNPROVIDED);
  // streams_high.force_output(UNPROVIDED);
  // return NIL;
  // }
  // }

  @SubL(source = "sublisp/export.lisp", position = 19756)
  public static SubLObject plw_support(SubLObject d) {
    plw_term(list(Functions.funcall(makeFunctionSymbol("SUPPORT-MT"), d), Functions.funcall(makeFunctionSymbol("SUPPORT-SENTENCE"), d), Symbols.symbol_name(Functions.funcall(makeFunctionSymbol("SUPPORT-TRUTH"), d)), Symbols.symbol_name(Functions.funcall(makeFunctionSymbol("SUPPORT-STRENGTH"), d)), Symbols.symbol_name(Functions.funcall(makeFunctionSymbol("SUPPORT-MODULE"), d))), UNPROVIDED);
    return NIL;
  }

  @SubL(source = "sublisp/export.lisp", position = 19943)
  public static SubLObject plw_id(SubLObject str, SubLObject v_int) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      plw_str(str);
      plw_str($kbnum$.getDynamicValue(thread));
      plw_str(v_int);
      return NIL;
    }
  }

  @SubL(source = "sublisp/export.lisp", position = 20029)
  public static SubLObject plw_deduction(SubLObject ded) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      $ded$.setDynamicValue(ded, thread);
      $a$.setDynamicValue(Functions.funcall(makeFunctionSymbol("DEDUCTION-ASSERTION"), ded), thread);
      {
        SubLObject cdolist_list_var = Functions.funcall(makeFunctionSymbol("KB-DEDUCTION-SUPPORTS"), ded);
        SubLObject d = NIL;
        for (d = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), d = cdolist_list_var.first()) {
          plw_str($str121$deduction_);
          plw_id($str122$d, Functions.funcall(makeFunctionSymbol("DEDUCTION-ID"), ded));
          plw_str($str26$_);
          if ((NIL != Functions.funcall(makeFunctionSymbol("ASSERTION-P"), $a$.getDynamicValue(thread)))) {
            plw_id($str71$a, Functions.funcall(makeFunctionSymbol("ASSERTION-ID"), $a$.getDynamicValue(thread)));
          } else {
            plw_term($a$.getDynamicValue(thread), UNPROVIDED);
          }
          plw_str($str26$_);
          if ((NIL != Functions.funcall(makeFunctionSymbol("ASSERTION-P"), d))) {
            plw_id($str71$a, Functions.funcall(makeFunctionSymbol("ASSERTION-ID"), d));
          } else if ((NIL != Functions.funcall(makeFunctionSymbol("HL-SUPPORT-P"), d))) {
            plw_support(d);
          } else if ((NIL != Functions.funcall(makeFunctionSymbol("SUPPORT-P"), d))) {
            plw_support(d);
          } else {
            plw_id(Types.type_of(d), d);
          }
          plw_str($str74$__);
          plw_nl();
          plw_nl();
        }
      }
      return NIL;
    }
  }

  @SubL(source = "sublisp/export.lisp", position = 20759)
  public static SubLObject foc(SubLObject trm) {
    return Functions.funcall(makeFunctionSymbol("FIND-OR-CREATE-CONSTANT"), trm);
  }
  //
  // @SubL(source = "sublisp/export.lisp", position = 20819)
  // public static SubLObject ds() {
  // ds1(foc($str123$denotationAndString));
  // return NIL;
  // }

  @SubL(source = "sublisp/export.lisp", position = 21163)
  public static SubLObject dt() {
    Eval.load($str130$e2c_prologmud_lisp);
    {
      SubLObject file_output = compatibility.open_text($str131$supports_pl, $kw16$OUTPUT);
      SubLObject anum = NIL;
      for (anum = ZERO_INTEGER; (!(anum.numE(Functions.funcall(makeFunctionSymbol("DEDUCTION-COUNT"))))); anum = Functions.funcall(makeFunctionSymbol("1+"), anum)) {
        plw_deduction(Functions.funcall(makeFunctionSymbol("FIND-DEDUCTION-BY-ID"), anum));
      }
      streams_high.close(file_output, UNPROVIDED);
    }
    return NIL;
  }

  @SubL(source = "sublisp/export.lisp", position = 21467)
  public static SubLObject dumpt(SubLObject anum, SubLObject total, SubLObject filename) {
    {
      if (UNPROVIDED == total || NIL == total)
        total = Functions.funcall(makeFunctionSymbol("ASSERTION-COUNT"));
      if (UNPROVIDED == anum || NIL == anum)
        anum = ZERO_INTEGER;
      if (filename == UNPROVIDED)
        filename = $str133$dump4_txt;
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject file_output = compatibility.open_text(filename, $kw16$OUTPUT);
        print_high.princ($str134$_____style_check__discontiguous__, file_output);
        {
          SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
          SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
          SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
          SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
          try {
            utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind(T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
              Functions.funcall(makeFunctionSymbol("NOTING-PERCENT-PROGRESS-PREAMBLE"), $str135$exporting_KB___);
              {
                //$int$415542

                for (

                ; (!(anum.numE(total))); anum = anum.inc()) {
                  {
                    SubLObject assrt = Functions.funcall(makeFunctionSymbol("FIND-ASSERTION-BY-ID"), anum);
                    try {
                      showa(assrt, file_output);
                    } catch (Throwable t) {
                      t.printStackTrace();
                      System.err.print("PRoblem with " + anum);
                    }
                  }
                  Functions.funcall(makeFunctionSymbol("NOTE-PERCENT-PROGRESS"), anum, total);
                }
              }
            } finally {
              {
                SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                  Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                  {
                    SubLObject _values = Values.getValuesAsVector();
                    Functions.funcall(makeFunctionSymbol("NOTING-PERCENT-PROGRESS-POSTAMBLE"));
                    Values.restoreValuesFromVector(_values);
                  }
                } finally {
                  Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                }
              }
            }
          } finally {
            $percent_progress_start_time$.rebind(_prev_bind_3, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
            streams_high.close(file_output, UNPROVIDED);
          }
        }

      }
      return NIL;
    }
  }

  @SubL(source = "sublisp/export.lisp", position = 22133)
  public static SubLObject et() {
    $no_tify$ = defvar("*NO-TIFY*", Functions.funcall(makeFunctionSymbol("ALL-INSTANCES"), $const62$WFFConstraintPredicate));
    pre_export();

    // ((NIL != Filesys.probe_file($str115$e2c_export_lisp)) ? ((SubLObject)
    // Eval.load($str115$e2c_export_lisp)) :
    // Eval.load($str13$_opt_cyc_e2c_export_lisp))
    //Eval.load(makeString("e2c/renames-fixed.lisp"));
    //Eval.eval("(safely-rename-now)");
    // Eval.load(makeString("e2c/dump_consts.lisp"));
    //dumpt(ZERO_INTEGER, $int$415542,makeString("part0.txt"));
    //dumpt(makeInteger(8318452), UNPROVIDED,makeString("part2.txt"));
    //dumpt(makeInteger(8317872),makeInteger(8318452),makeString("part1a.txt"));
    //dumpt(makeInteger(8111648), UNPROVIDED,makeString("part2.txt"));
    //dumpt(makeInteger(8169952), UNPROVIDED,makeString("part2.txt"));

    //dumpt(UNPROVIDED, UNPROVIDED,makeString("varguard.txt"));

    return NIL;
  }

  @SubL(source = "sublisp/export.lisp", position = 22338)
  public static SubLObject save_constsl() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject file_output = compatibility.open_text($str139$dump_consts_lisp, $kw16$OUTPUT);
        SubLObject x = NIL;
        for (x = ZERO_INTEGER; (!(x.numE(Functions.funcall(makeFunctionSymbol("CONSTANT-COUNT"))))); x = Numbers.add(x, ONE_INTEGER)) {
          {
            SubLObject v_const = Functions.funcall(makeFunctionSymbol("FIND-CONSTANT-BY-INTERNAL-ID"), x);
            SubLObject found = Hashtables.gethash(v_const, $renames$.getDynamicValue(thread), UNPROVIDED);
            if ((NIL != found)) {
              {
                SubLObject name = Functions.funcall(makeFunctionSymbol("CONSTANT-NAME"), v_const);
                PrintLow.format(file_output, $str140$_safely_rename_or_merge__S__S____, name, found);
              }
            }
          }
        }
        streams_high.close(file_output, UNPROVIDED);
      }
      return NIL;
    }
  }

  @SubL(source = "sublisp/export.lisp", position = 22848)
  public static SubLObject save_consts2() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject file_output = compatibility.open_text($str141$dump_consts_pl, $kw16$OUTPUT);
        SubLObject x = NIL;
        for (x = ZERO_INTEGER; (!(x.numE(Functions.funcall(makeFunctionSymbol("CONSTANT-COUNT"))))); x = Numbers.add(x, ONE_INTEGER)) {
          {
            SubLObject v_const = Functions.funcall(makeFunctionSymbol("FIND-CONSTANT-BY-INTERNAL-ID"), x);
            SubLObject found = Hashtables.gethash(v_const, $renames$.getDynamicValue(thread), UNPROVIDED);
            if ((NIL != found)) {
              {
                SubLObject name = Functions.funcall(makeFunctionSymbol("CONSTANT-NAME"), v_const);
                PrintLow.format(file_output, $str142$rnc___A____A______, name, found);
              }
            }
          }
        }
        streams_high.close(file_output, UNPROVIDED);
      }
      return NIL;
    }
  }

  @SubL(source = "sublisp/export.lisp", position = 23302)
  public static SubLObject check_consts() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject x = NIL;
        for (x = ZERO_INTEGER; (!(x.numE(Functions.funcall(makeFunctionSymbol("CONSTANT-COUNT"))))); x = Numbers.add(x, ONE_INTEGER)) {
          {
            SubLObject v_const = Functions.funcall(makeFunctionSymbol("FIND-CONSTANT-BY-INTERNAL-ID"), x);
            SubLObject found = Hashtables.gethash(v_const, $renames$.getDynamicValue(thread), UNPROVIDED);
            if ((NIL == found)) {
              {
                SubLObject name = Functions.funcall(makeFunctionSymbol("CONSTANT-NAME"), v_const);
                if ((NIL != prolog_need_quote(name))) {
                  PrintLow.format(T, $str140$_safely_rename_or_merge__S__S____, name, Sequences.cconcatenate($str143$cyc, name));
                }
              }
            }
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "sublisp/export.lisp", position = 23683)
  public static SubLObject check_consts2() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject x = NIL;
        for (x = ZERO_INTEGER; (!(x.numE(Functions.funcall(makeFunctionSymbol("CONSTANT-COUNT"))))); x = Numbers.add(x, ONE_INTEGER)) {
          {
            SubLObject v_const = Functions.funcall(makeFunctionSymbol("FIND-CONSTANT-BY-INTERNAL-ID"), x);
            SubLObject found = Hashtables.gethash(v_const, $renames$.getDynamicValue(thread), UNPROVIDED);
            if ((NIL != found)) {
              if ((NIL != prolog_need_quote(found))) {
                {
                  SubLObject name = Functions.funcall(makeFunctionSymbol("CONSTANT-NAME"), v_const);
                  SubLObject newname = simplrename(found);
                  PrintLow.format(T, $str140$_safely_rename_or_merge__S__S____, name, newname);
                  Hashtables.sethash(v_const, $renames$.getDynamicValue(thread), newname);
                }
              }
            }
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "sublisp/export.lisp", position = 24107)
  public static SubLObject simplrename(SubLObject found) {
    {
      SubLObject nfound = Sequences.substitute(Characters.CHAR_underbar, Characters.CHAR_hyphen, Sequences.substitute(Characters.CHAR_underbar, Characters.CHAR_colon, found, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
      SubLObject ch = Strings.sublisp_char(nfound, ZERO_INTEGER);
      SubLObject ch1 = Strings.sublisp_char(nfound, ONE_INTEGER);
      if ((NIL == Characters.lower_case_p(ch))) {
        return Sequences.cconcatenate($str144$i, nfound);
      }
      if ((ch.eql(Characters.CHAR_t) && (NIL != Characters.lower_case_p(ch1)))) {
        return Sequences.cconcatenate($str145$t, new SubLObject[] { Strings.string_upcase(Strings.string(ch1), UNPROVIDED, UNPROVIDED), Functions.funcall(makeFunctionSymbol("SUBSTRING"), nfound, TWO_INTEGER) });
      }
      return nfound;
    }
  }

  public static SubLObject declare_export_file() {
    // declareFunction(myName, "te2c", "TE2C", 0, 0, false);
    declareFunction(myName, "force_print", "FORCE-PRINT", 1, 0, false);
    // declareFunction(myName, "trans", "TRANS", 0, 0, false);
    declareFunction(myName, "plw_str", "PLW-STR", 1, 0, false);
    declareFunction(myName, "plw_nl", "PLW-NL", 0, 0, false);
    declareFunction(myName, "prolog_no_need_quote", "PROLOG-NO-NEED-QUOTE", 1, 0, false);
    declareFunction(myName, "prolog_need_quote", "PROLOG-NEED-QUOTE", 1, 0, false);
    declareFunction(myName, "plw_list", "PLW-LIST", 1, 3, false);
    declareFunction(myName, "plw_cdr", "PLW-CDR", 1, 3, false);
    declareFunction(myName, "plw_atom", "PLW-ATOM", 1, 1, false);
    declareFunction(myName, "simple_name", "SIMPLE-NAME", 1, 0, false);
    declareFunction(myName, "plw_naut", "PLW-NAUT", 2, 0, false);
    declareFunction(myName, "assertion_varnames", "ASSERTION-VARNAMES", 1, 0, false);
    declareFunction(myName, "plw_dotl", "PLW-DOTL", 1, 0, false);
    declareFunction(myName, "plw_argz", "PLW-ARGZ", 2, 0, false);
    declareFunction(myName, "plw_string", "PLW-STRING", 1, 0, false);
    declareFunction(myName, "rsw", "RSW", 1, 0, false);
    declareFunction(myName, "split", "SPLIT", 1, 0, false);
    declareFunction(myName, "unescape", "UNESCAPE", 1, 0, false);
    declareFunction(myName, "plw_term", "PLW-TERM", 1, 1, false);
    // declareFunction(myName, "plw_term_cons", "PLW-TERM-CONS", 1, 1,
    // false);
    // declareFunction(myName, "pre_export", "PRE-EXPORT", 0, 0, false);
    // declareFunction(myName, "constant_prolog_name",
    // "CONSTANT-PROLOG-NAME", 1, 0, false);
    // declareFunction(myName, "plw_writel", "PLW-WRITEL", 1, 0, false);
    declareFunction(myName, "showa", "SHOWA", 1, 1, false);
    // declareFunction(myName, "plw_ruleinfo", "PLW-RULEINFO", 1, 1, false);
    declareFunction(myName, "assertion_variable_guard", "ASSERTION-VARIABLE-GUARD", 1, 0, false);
    // declareFunction(myName, "ri", "RI", 0, 0, false);
    // declareFunction(myName, "ruleinfo", "RULEINFO", 2, 1, false);
    // //declareMacro(myName, "no_errors", "NO-ERRORS");
    // //declareFunction(myName, "my_funcall", "MY-FUNCALL", 3, 0, false);
    // declareFunction(myName, "ruleinfo_not", "RULEINFO-NOT", 2, 1, false);
    // declareFunction(myName, "mruleinfo", "MRULEINFO", 1, 0, false);
    // declareFunction(myName, "remove_string_ending",
    // "REMOVE-STRING-ENDING", 2, 0, false);
    // declareFunction(myName, "remove_string_starting",
    // "REMOVE-STRING-STARTING", 2, 0, false);
    // declareFunction(myName, "simple_type_str", "SIMPLE-TYPE-STR", 1, 0,
    // false);
    // declareFunction(myName, "rana", "RANA", 0, 1, false);
    // declareFunction(myName, "w", "W", 0, 1, false);
    // declareFunction(myName, "w0", "W0", 0, 1, false);
    // declareFunction(myName, "plw_support", "PLW-SUPPORT", 1, 0, false);
    // declareFunction(myName, "plw_id", "PLW-ID", 2, 0, false);
    // declareFunction(myName, "plw_deduction", "PLW-DEDUCTION", 1, 0,
    // false);
    // declareFunction(myName, "foc", "FOC", 1, 0, false);
    // declareFunction(myName, "ds", "DS", 0, 0, false);
    // declareFunction(myName, "ds1", "DS1", 1, 0, false);
    // declareFunction(myName, "dt", "DT", 0, 0, false);
    declareFunction(myName, "dumpt", "DUMPT", 0, 3, false);
    declareFunction(myName, "et", "ET", 0, 0, false);
    declareFunction(myName, "save_constsl", "SAVE-CONSTSL", 0, 0, false);
    declareFunction(myName, "save_consts2", "SAVE-CONSTS2", 0, 0, false);
    declareFunction(myName, "check_consts", "CHECK-CONSTS", 0, 0, false);
    declareFunction(myName, "check_consts2", "CHECK-CONSTS2", 0, 0, false);
    declareFunction(myName, "simplrename", "SIMPLRENAME", 1, 0, false);
    return NIL;
  }

  public static SubLObject init_export_file() {
    $a$ = defvar("*A*", NIL);
    $assrtid$ = defvar("*ASSRTID*", NIL);
    $assrtform$ = defvar("*ASSRTFORM*", NIL);
    $ded$ = defvar("*DED*", NIL);
    $every1000$ = defvar("*EVERY1000*", ONE_INTEGER);
    $renames$ = defvar("*RENAMES*", Hashtables.make_hash_table($int$336790, UNPROVIDED, UNPROVIDED));
    $kbnum$ = defvar("*KBNUM*", $str19$7166);
    Errors.$error_message$ = defvar("*ERROR-MESSAGE*", StreamsLow.$terminal_io$.getDynamicValue());
    return NIL;
  }

  public static SubLObject setup_export_file() {
    // CVS_ID("Id: export-prolog.lisp 129084 2009-10-30 21:09:07Z rck ");
    // $cb_default_index_view$.setDynamicValue($kw0$LEGACY);
    //force_print($str20$loading_export_lisp___);
    return NIL;
  }

  static HashMap<String, SubLSymbol> foundSymbols = new HashMap();

  //// Internal Constants

  private static final SubLSymbol $kw0$LEGACY = makeKeyword("LEGACY");
  private static final SubLSymbol $kw1$SYSTEM = makeKeyword("SYSTEM");
  private static final SubLString $str2$SUBLISP = makeString("SUBLISP");
  private static final SubLSymbol $kw3$BACKEND = makeKeyword("BACKEND");
  private static final SubLSymbol $kw4$SL2JAVA = makeKeyword("SL2JAVA");
  private static final SubLSymbol $kw5$FEATURES = makeKeyword("FEATURES");
  private static final SubLList $list6 = list(makeKeyword("CYC-DATE"), makeKeyword("CYC-TIME"), makeKeyword("CYC-QUANT"), makeKeyword("CYC-HTML"), makeKeyword("CYC-BROWSER"), makeKeyword("CYC-EXTERNAL"), makeKeyword("CYC-EVENT"), makeKeyword("COMMON-LISP"));
  private static final SubLSymbol $kw7$INPUT_DIRECTORY = makeKeyword("INPUT-DIRECTORY");
  private static final SubLString $str8$_opt_cyc_e2c_ = makeString("/opt/cyc/e2c/");
  private static final SubLSymbol $kw9$OUTPUT_DIRECTORY = makeKeyword("OUTPUT-DIRECTORY");
  private static final SubLString $str10$_opt_cyc_e2c_translatedCode_ = makeString("/opt/cyc/e2c/translatedCode/");
  private static final SubLSymbol $kw11$SYSTEM_MANIFEST = makeKeyword("SYSTEM-MANIFEST");
  private static final SubLString $str12$_opt_cyc_e2c_system_manifest_lisp = makeString("/opt/cyc/e2c/system-manifest.lisp");
  // private static final SubLString $str13$_opt_cyc_e2c_export_lisp =
  // makeString("/opt/cyc/e2c/export.lisp");
  private static final SubLString $str14$JavaTest = makeString("JavaTest");
  private static final SubLString $str15$_opt_cyc_e2c_export_trans = makeString("/opt/cyc/e2c/export.trans");
  private static final SubLSymbol $kw16$OUTPUT = makeKeyword("OUTPUT");
  private static final SubLString $str17$_opt_cyc_e2c_export_java = makeString("/opt/cyc/e2c/export.java");
  private static final SubLInteger $int$336790 = makeInteger(336790);
  private static final SubLString $str19$7166 = makeString("7166");
  private static final SubLString $str20$loading_export_lisp___ = makeString("loading export.lisp...");
  private static final SubLString $str21$__ = makeString("~%");
  private static final SubLList $list22 = list(Characters.CHAR_colon, Characters.CHAR_quote, Characters.CHAR_backquote, Characters.CHAR_hash);
  private static final SubLSymbol $sym23$CHAR_ = makeSymbol("CHAR=");
  private static final SubLString $str24$ = makeString("");
  private static final SubLString $str25$_______ = makeString(" |/**/ ");
  private static final SubLString $str26$_ = makeString(",");
  private static final SubLString $str27$_ = makeString("|");
  private static final SubLString $str28$_ = makeString("'");
  private static final SubLString $str29$0_ = makeString("0(");
  private static final SubLString $str30$_ = makeString(")");
  private static final SubLObject $const31$VariableArityRelation = Functions.funcall(makeFunctionSymbol("READER-MAKE-CONSTANT-SHELL"), makeString("VariableArityRelation"));
  private static final SubLObject $const32$UnreifiableFunction = Functions.funcall(makeFunctionSymbol("READER-MAKE-CONSTANT-SHELL"), makeString("UnreifiableFunction"));
  private static final SubLString $str33$U_ = makeString("U(");
  private static final SubLObject $const34$ReifiableFunction = Functions.funcall(makeFunctionSymbol("READER-MAKE-CONSTANT-SHELL"), makeString("ReifiableFunction"));
  private static final SubLString $str35$R_ = makeString("R(");
  private static final SubLString $str36$D_ = makeString("D(");
  private static final SubLString $str37$1_ = makeString("1(");
  private static final SubLString $str38$2_ = makeString("2(");
  private static final SubLString $str39$3_ = makeString("3(");
  private static final SubLString $str40$S_ = makeString("S(");
  private static final SubLString $str41$N_ = makeString("N(");
  private static final SubLString $str42$_ = makeString("[");
  private static final SubLString $str43$_ = makeString("]");
  private static final SubLString $str44$_____ = makeString(",'[]'");
  private static final SubLString $str45$_ = makeString(" ");
  private static final SubLString $str46$s_ = makeString("s(");
  private static final SubLList $list47 = list(new SubLObject[] { Characters.CHAR_quote, Characters.CHAR_quotation, Characters.CHAR_semicolon, Characters.CHAR_question, Characters.CHAR_percent, Characters.CHAR_comma, Characters.CHAR_ampersand, Characters.CHAR_lparen, Characters.CHAR_rparen });
  private static final SubLList $list48 = list(Characters.CHAR_less, Characters.CHAR_hash);
  private static final SubLList $list49 = list(Characters.CHAR_greater, Characters.CHAR_dollar);
  private static final SubLString $str50$_A_C = makeString("~A~C");
  private static final SubLString $str51$_ = makeString(".");
  private static final SubLList $list52 = list(Characters.CHAR_underbar, Characters.CHAR_period, Characters.CHAR_hash, Characters.CHAR_hyphen, Characters.CHAR_slash, Characters.CHAR_less);
  private static final SubLString $str53$_C = makeString("~C");
  private static final SubLList $list54 = list(Characters.CHAR_space, Characters.CHAR_vertical);
  private static final SubLString $str55$nart = makeString("nart");
  private static final SubLString $str56$__ = makeString("[]");
  private static final SubLString $str57$____ = makeString("'[]'");
  private static final SubLString $str58$_ = makeString(":");
  private static final SubLString $str59$u = makeString("u");
  private static final SubLString $str60$_ = makeString("(");
  private static final SubLString $str61$t_ = makeString("t(");
  private static final SubLObject $const62$WFFConstraintPredicate = Functions.funcall(makeFunctionSymbol("READER-MAKE-CONSTANT-SHELL"), makeString("WFFConstraintPredicate"));
  private static final SubLObject $const63$Quantifier = Functions.funcall(makeFunctionSymbol("READER-MAKE-CONSTANT-SHELL"), makeString("Quantifier"));
  private static final SubLObject $const64$HLPredicate = Functions.funcall(makeFunctionSymbol("READER-MAKE-CONSTANT-SHELL"), makeString("HLPredicate"));
  private static final SubLObject $const65$MicrotheoryDesignatingPredicate = Functions.funcall(makeFunctionSymbol("READER-MAKE-CONSTANT-SHELL"), makeString("MicrotheoryDesignatingPredicate"));
  private static final SubLObject $const66$LogicalConnective = Functions.funcall(makeFunctionSymbol("READER-MAKE-CONSTANT-SHELL"), makeString("LogicalConnective"));
  private static final SubLObject $const67$KBDependentRelation = Functions.funcall(makeFunctionSymbol("READER-MAKE-CONSTANT-SHELL"), makeString("KBDependentRelation"));
  private static final SubLObject $const68$ModalPredicate = Functions.funcall(makeFunctionSymbol("READER-MAKE-CONSTANT-SHELL"), makeString("ModalPredicate"));
  private static final SubLObject $const69$trueRule = Functions.funcall(makeFunctionSymbol("READER-MAKE-CONSTANT-SHELL"), makeString("trueRule"));
  private static final SubLObject $const70$termOfUnit = Functions.funcall(makeFunctionSymbol("READER-MAKE-CONSTANT-SHELL"), makeString("termOfUnit"));
  private static final SubLString $str71$a = makeString("a");
  private static final SubLString $str72$_ = makeString("_");
  private static final SubLString $str73$assertion_content_ = makeString("assertion_content(");
  private static final SubLString $str74$__ = makeString(").");
  private static final SubLSymbol $sym75$ASSERTION_MT = makeSymbol("ASSERTION-MT");
  private static final SubLString $str76$assertion_varnames_ = makeString("assertion_varnames(");
  private static final SubLString $str77$__ = makeString(",[");
  private static final SubLString $str78$___ = makeString("]).");
  private static final SubLString $str79$rule = makeString("rule");
  private static final SubLString $str80$fact = makeString("fact");
  private static final SubLSymbol $sym81$ASSERTION_P = makeSymbol("ASSERTION-P");
  private static final SubLString $str82$assertion = makeString("assertion");
  private static final SubLString $str83$assertion_ = makeString("assertion_");
  private static final SubLInteger $int$990000 = makeInteger(990000);
  private static final SubLInteger $int$500 = makeInteger(500);
  private static final SubLList $list86 = list(makeSymbol("ERR"), makeSymbol("&REST"), makeSymbol("CODE"));
  private static final SubLSymbol $sym87$CLET = makeSymbol("CLET");
  private static final SubLList $list88 = list(list(makeSymbol("HADERROR"), NIL), list(makeSymbol("LASTVAL"), NIL));
  private static final SubLSymbol $sym89$WITH_ERROR_HANDLER = makeSymbol("WITH-ERROR-HANDLER");
  private static final SubLList $list90 = list(makeSymbol("FUNCTION"), list(makeSymbol("LAMBDA"), list(makeSymbol("&REST"), makeSymbol("WHATEVAH")), list(makeSymbol("CSETQ"), makeSymbol("HADERROR"), makeSymbol("*ERROR-MESSAGE*")), list(makeSymbol("FORMAT"), makeSymbol("*TERMINAL-IO*"), makeString("~&~&~&~&;; made-handler ~S durring: ~S ~S ~&"), makeSymbol("*ERROR-MESSAGE*"), makeSymbol("WHATEVAH"), makeSymbol("CODE")), list(makeSymbol("RET"), makeSymbol("HADERROR"))));
  private static final SubLSymbol $sym91$CSETQ = makeSymbol("CSETQ");
  private static final SubLSymbol $sym92$LASTVAL = makeSymbol("LASTVAL");
  private static final SubLSymbol $sym93$PROGN = makeSymbol("PROGN");
  private static final SubLList $list94 = list(makeSymbol("CSETQ"), makeSymbol("LASTVAL"), NIL);
  private static final SubLList $list95 = list(makeSymbol("CSETQ"), makeSymbol("HADERROR"), NIL);
  private static final SubLSymbol $sym96$FIF = makeSymbol("FIF");
  private static final SubLSymbol $sym97$HADERROR = makeSymbol("HADERROR");
  private static final SubLList $list98 = list(makeSymbol("PRINT"), makeSymbol("HADERROR"));
  private static final SubLSymbol $sym99$QUOTE = makeSymbol("QUOTE");
  private static final SubLList $list100 = list(makeSymbol("LASTVAL"));
  private static final SubLList $list101 = list(makeSymbol("LAMBDA"), list(makeSymbol("&REST"), makeSymbol("WHATEVAH")), list(makeSymbol("CSETQ"), makeSymbol("HADERROR"), makeSymbol("*ERROR-MESSAGE*")), list(makeSymbol("FORMAT"), makeSymbol("*TERMINAL-IO*"), makeString("~&~&~&~&;; made-handler ~S durring: ~S ~S ~&"), makeSymbol("*ERROR-MESSAGE*"), makeSymbol("WHATEVAH"), makeSymbol("CODE")), list(makeSymbol("RET"), makeSymbol("HADERROR")));
  private static final SubLSymbol $sym102$ERR = makeSymbol("ERR");
  private static final SubLString $str103$not_ = makeString("not_");
  private static final SubLList $list104 = list(new SubLObject[] { makeSymbol("SELF-LOOPING-RULE?"), makeSymbol("PROOF-VIEW-PRUNING-RULE?"), makeSymbol("SELF-EXPANDING-RULE?"), makeSymbol("INERT-RULE?"), makeSymbol("LOOKS-LIKE-KAPPA-REPHRASE-RULE?"), makeSymbol("EXPANSION-RULE?"), makeSymbol("APPEARS-IN-FORWARD-REIFICATION-RULE?"), makeSymbol("PSP-TRACED-RULE?"),
      makeSymbol("UNIVERSAL-LIFTING-RULE?"), makeSymbol("DECONTEXTUALIZED-RULE?"), makeSymbol("SOME-SUGGESTED-PRAGMA-SENTENCES-FOR-RULE?"), makeSymbol("CURRENT-NC-RULE?"), makeSymbol("SINGLE-LITERAL-ANTECEDENT-RULE?"), makeSymbol("CONSIDERED-BUT-NOT-SUCCESSFUL-RULE?"), makeSymbol("CONSTRAINT-RULE?"), makeSymbol("LIFTING-CONSEQUENT-RULE?"), makeSymbol("ASSERTIVE-WFF-RULE?"),
      makeSymbol("TWO-LITERAL-ANTECEDENT-RULE?"), makeSymbol("REWRITE-RULE?"), makeSymbol("SINGLE-LITERAL-RULE?"), makeSymbol("OBSOLETE-RULE?"), makeSymbol("SKOLEM-RULE?"), makeSymbol("FORWARD-TMS-RULE?"), makeSymbol("CYCL-REFORMULATION-RULE?"), makeSymbol("IS-KNOWN-ILP-EXPORT-RULE?"), makeSymbol("VERBOSIFIED-EL-RULE?"), makeSymbol("PPH-REQUIRED-RULE?"), makeSymbol("NON-ABDUCIBLE-RULE?"),
      makeSymbol("CYCL-REFORMULATOR-RULE?"), makeSymbol("LIFTING-RULE?") });
  private static final SubLList $list105 = list(makeSymbol("ATOMIC-ASSERTION?"), makeSymbol("GROUND-ASSERTION?"));
  private static final SubLList $list106 = list(makeSymbol("CONSIDERED-RULE?"));
  private static final SubLList $list107 = list(makeSymbol("VALID-PPH-BLACKLIST-ASSERTION?"), makeSymbol("WHY-KBS-ASSERTION?"), // makeSymbol("EXPORTABLE-ASSERTION?"), 
      makeSymbol("TRUE-ASSERTION?"), makeSymbol("HL-ASSERTION-P"), makeSymbol("NON-TVA-GAF-ASSERTION-P"), makeSymbol("STR-META-ASSERTION-P"), makeSymbol("FIRST-ORDER-ASSERTION-P"));
  private static final SubLList $list108 = list(new SubLObject[] { makeSymbol("ASSERTED-ASSERTION?"), makeSymbol("DEDUCED-ASSERTION?"), makeSymbol("CODE-ASSERTION?"), makeSymbol("ASSERTION-HAS-DEPENDENTS-P"), makeSymbol("ASSERTION-VARIABLE-GUARD"), makeSymbol("ASSERTED-BY"), makeSymbol("ASSERTED-WHEN"), makeSymbol("ASSERTION-HAS-META-ASSERTIONS?"),
      makeSymbol("SYNTACTICALLY-ILL-FORMED-ASSERTION?"), makeSymbol("SOME-CONSERVATIVE-VIA-ARG-ASSERTION?"), makeSymbol("RELEVANT-ASSERTION?"), makeSymbol("REFORMULATOR-RELEVANT-ASSERTION?"), makeSymbol("PPH-HL-SUPPORT-WITH-ISOMORPHIC-ASSERTION?"), makeSymbol("OWL-EXPORTABLE-RULE-ASSERTION?"), makeSymbol("NL-TRIE-SYNTACTIC-ASSERTION?"), makeSymbol("IST-SENTENCE-DESIGNATING-ASSERTION?"),
      makeSymbol("INVALID-ASSERTION?"), makeSymbol("INFERENCE-RELEVANT-ASSERTION?"), makeSymbol("INFERENCE-IRRELEVANT-ASSERTION?"), makeSymbol("INDIRECT-LEXICAL-ASSERTION?"), makeSymbol("IMPLEMENTATION-ASSERTION?"), makeSymbol("HAS-GENSTRING-ASSERTION?"), makeSymbol("FALSE-ASSERTION?"), makeSymbol("CURRENTLY-FORWARD-PROPAGATING-ASSERTION?"), makeSymbol("CONTEXTUALLY-DEPENDENT-LEXICAL-ASSERTION?"),
      makeSymbol("COMPUTED-SKOLEM-ASSERTION?"), makeSymbol("CHECK-FOR-ISOMORPHIC-ASSERTION?"), makeSymbol("BACKWARD-RULE-REQUIRED-FOR-ASSERTION?"), makeSymbol("NOT-ASSERTIBLE-ASSERTION-P"), makeSymbol("GEN-TEMPLATE-QUERY-SENTENCE-ASSERTION-P"), makeSymbol("RULE-META-ASSERTION-P"), makeSymbol("FTEMPLATE-POLYCANONICALIZED-ASSERTION-P"), makeSymbol("UNBOUND-RULE-ASSERTION-P"),
      makeSymbol("LIFTING-ASSERTION-P"), makeSymbol("ASSERTION-PRODUCED-BY-TEMPORAL-PROJECTION?"), makeSymbol("ABNORMAL-ASSERTION-P"), makeSymbol("ABBREVIATION-ASSERTION-P"), makeSymbol("TVA-ASSERTION-P"), makeSymbol("TERM-OF-UNIT-ASSERTION-P"), makeSymbol("LIST-OF-RULE-ASSERTION-P"), makeSymbol("DOCUMENTATION-ASSERTION-P"), makeSymbol("BOOKKEEPING-ASSERTION-P"), makeSymbol("META-ASSERTION-P"),
      makeSymbol("HIGHER-ORDER-ASSERTION-P"), makeSymbol("GTQS-ASSERTION-P"), makeSymbol("CVA-ASSERTION-P"), makeSymbol("ASSERTION-NEEDS-REVIEW-P"), makeSymbol("ASSERTION-USES-NON-EXTENSIONAL-SET?"), makeSymbol("ASSERTION-SYNTACTICALLY-ILLFORMED?") });
  // private static final SubLString $str115$e2c_export_lisp =
  // makeString("e2c/export.lisp");
  private static final SubLInteger $int$250 = makeInteger(250);
  private static final SubLString $str117$_____ = makeString("~%~% ");
  private static final SubLString $str118$____w_ = makeString("/* (w ");
  private static final SubLString $str119$____ = makeString(") */");
  private static final SubLSymbol $sym120$W = makeSymbol("W");
  private static final SubLString $str121$deduction_ = makeString("deduction(");
  private static final SubLString $str122$d = makeString("d");
  private static final SubLString $str123$denotationAndString = makeString("denotationAndString");
  private static final SubLString $str124$_pl = makeString(".pl");
  private static final SubLSymbol $sym125$RELEVANT_MT_IS_ANY_MT = makeSymbol("RELEVANT-MT-IS-ANY-MT");
  private static final SubLObject $const126$InferencePSC = Functions.funcall(makeFunctionSymbol("READER-MAKE-CONSTANT-SHELL"), makeString("InferencePSC"));
  private static final SubLSymbol $sym127$RELEVANT_MT_IS_EVERYTHING = makeSymbol("RELEVANT-MT-IS-EVERYTHING");
  private static final SubLObject $const128$EverythingPSC = Functions.funcall(makeFunctionSymbol("READER-MAKE-CONSTANT-SHELL"), makeString("EverythingPSC"));
  private static final SubLSymbol $sym129$SHOWA = makeSymbol("SHOWA");
  private static final SubLString $str130$e2c_prologmud_lisp = makeString("e2c/prologmud.lisp");
  private static final SubLString $str131$supports_pl = makeString("supports.pl");
  private static final SubLString $str132$hi0 = makeString("hi0");
  private static final SubLString $str133$dump4_txt = makeString("dump4.txt");
  private static final SubLString $str134$_____style_check__discontiguous__ = makeString("\r\n:- style_check(-discontiguous). \r\n:- style_check(-singleton).\r\n:- include('dir.header').\r\n");
  private static final SubLString $str135$exporting_KB___ = makeString("exporting KB...");
  private static final SubLInteger $int$415542 = makeInteger(415542);
  private static final SubLInteger $int$10000 = makeInteger(10000);
  private static final SubLString $str138$hi1 = makeString("hi1");
  private static final SubLString $str139$dump_consts_lisp = makeString("dump_consts.lisp");
  private static final SubLString $str140$_safely_rename_or_merge__S__S____ = makeString("(safely-rename-or-merge ~S ~S) ~%");
  private static final SubLString $str141$dump_consts_pl = makeString("dump_consts.pl");
  private static final SubLString $str142$rnc___A____A______ = makeString("rnc('~A','~A'). ~%");
  private static final SubLString $str143$cyc = makeString("cyc");
  private static final SubLString $str144$i = makeString("i");
  private static final SubLString $str145$t = makeString("t");

  //// Initializers

  @Override
  public void declareFunctions() {
    declare_export_file();
  }

  private static SubLSymbol makeFunctionSymbol(String string) {
    SubLSymbol sym = foundSymbols.get(string);
    if (sym == null) {
      sym = makeSymbol(string);
      foundSymbols.put(string, sym);
      if (sym.getFunction() == null) {
        BeanShellCntrl.bp();
      }
    }
    return sym;
  }

  @Override
  public void initializeVariables() {
    init_export_file();
  }

  @Override
  public void runTopLevelForms() {
    setup_export_file();
  }

}
