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

import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.cyc_revision_extraction;
//dm import com.cyc.cycjava_1.cycl.modules;

public  final class system_version extends SubLTranslatedFile {

  //// Constructor

  private system_version() {}
  public static final SubLFile me = new system_version();
  public static final String myName = "com.cyc.cycjava_1.cycl.system_version";

  //// Definitions

  @SubL(source = "cycl/system-version.lisp", position = 554) 
  public static SubLSymbol $cyc_raw_revision_string$ = null;

  @SubL(source = "cycl/system-version.lisp", position = 693) 
  public static SubLSymbol $cyc_major_version_number$ = null;

  @SubL(source = "cycl/system-version.lisp", position = 739) 
  public static SubLSymbol $cyc_revision_numbers$ = null;

  @SubL(source = "cycl/system-version.lisp", position = 909) 
  public static SubLSymbol $cyc_revision_string$ = null;

  @SubL(source = "cycl/system-version.lisp", position = 1217) 
  public static SubLSymbol $cycl_common_revision$ = null;

  @SubL(source = "cycl/system-version.lisp", position = 1342) 
  public static SubLSymbol $cycl_crtl_revision$ = null;

  @SubL(source = "cycl/system-version.lisp", position = 1386) 
  public static SubLSymbol $cycl_translator_revision$ = null;

  @SubL(source = "cycl/system-version.lisp", position = 1435) 
  public static SubLSymbol $cycl_opencyc_revision$ = null;

  @SubL(source = "cycl/system-version.lisp", position = 1482) 
  public static SubLSymbol $cycl_framework_revision$ = null;

  @SubL(source = "cycl/system-version.lisp", position = 1532) 
  public static SubLSymbol $cycl_sublisp_revision$ = null;

  @SubL(source = "cycl/system-version.lisp", position = 1579) 
  public static SubLSymbol $cycl_tests_revision$ = null;

  @SubL(source = "cycl/system-version.lisp", position = 1624) 
  public static SubLSymbol $cycl_mysentient_revision$ = null;

  @SubL(source = "cycl/system-version.lisp", position = 1674) 
  public static SubLSymbol $cycl_butler_revision$ = null;

  @SubL(source = "cycl/system-version.lisp", position = 1720) 
  public static SubLSymbol $cycl_tool_revision$ = null;

  @SubL(source = "cycl/system-version.lisp", position = 1764) 
  public static SubLSymbol $cycl_EEEEEEE_revision$ = null;

  public static final SubLObject declare_system_version_file() {
    return NIL;
  }

  public static final SubLObject init_system_version_file() {
    $cyc_raw_revision_string$ = defparameter("*CYC-RAW-REVISION-STRING*", $str0$_Revision__128948__);
    $cyc_major_version_number$ = defparameter("*CYC-MAJOR-VERSION-NUMBER*", TEN_INTEGER);
    $cyc_revision_numbers$ = defparameter("*CYC-REVISION-NUMBERS*", cyc_revision_extraction.extract_cyc_revision_numbers(cyc_revision_extraction.extract_cyc_revision_string($cyc_raw_revision_string$.getDynamicValue()), $cyc_major_version_number$.getDynamicValue()));
    $cyc_revision_string$ = defparameter("*CYC-REVISION-STRING*", cyc_revision_extraction.construct_cyc_revision_string_from_numbers($cyc_revision_numbers$.getDynamicValue()));
    $cycl_common_revision$ = defparameter("*CYCL-COMMON-REVISION*", $str3$1_269);
    $cycl_crtl_revision$ = defparameter("*CYCL-CRTL-REVISION*", $str4$1_555);
    $cycl_translator_revision$ = defparameter("*CYCL-TRANSLATOR-REVISION*", $str5$1_69);
    $cycl_opencyc_revision$ = defparameter("*CYCL-OPENCYC-REVISION*", $str6$1_391);
    $cycl_framework_revision$ = defparameter("*CYCL-FRAMEWORK-REVISION*", $str7$1_1767);
    $cycl_sublisp_revision$ = defparameter("*CYCL-SUBLISP-REVISION*", $str8$1_319);
    $cycl_tests_revision$ = defparameter("*CYCL-TESTS-REVISION*", $str9$1_907);
    $cycl_mysentient_revision$ = defparameter("*CYCL-MYSENTIENT-REVISION*", $str10$1_437);
    $cycl_butler_revision$ = defparameter("*CYCL-BUTLER-REVISION*", $str11$1_277);
    $cycl_tool_revision$ = defparameter("*CYCL-TOOL-REVISION*", $str12$1_652);
    $cycl_EEEEEEE_revision$ = defparameter("*CYCL-=======-REVISION*", $str13$);
    return NIL;
  }

  public static final SubLObject setup_system_version_file() {
    // CVS_ID("Id: system-version.lisp 128948 2009-10-14 04:00:30Z rck ");
    modules.create_system($str1$cycl);
    {
      SubLObject cdolist_list_var = $list2;
      SubLObject name = NIL;
      for (name = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), name = cdolist_list_var.first()) {
        modules.create_module(name, $str1$cycl);
      }
    }
    return NIL;
  }

  //// Internal Constants

  public static final SubLString $str0$_Revision__128948__ = makeString("$Revision: 128948 $");
  public static final SubLString $str1$cycl = makeString("cycl");
  public static final SubLObject $list2 = _constant_2_initializer();
  public static final SubLString $str3$1_269 = makeString("1.269");
  public static final SubLString $str4$1_555 = makeString("1.555");
  public static final SubLString $str5$1_69 = makeString("1.69");
  public static final SubLString $str6$1_391 = makeString("1.391");
  public static final SubLString $str7$1_1767 = makeString("1.1767");
  public static final SubLString $str8$1_319 = makeString("1.319");
  public static final SubLString $str9$1_907 = makeString("1.907");
  public static final SubLString $str10$1_437 = makeString("1.437");
  public static final SubLString $str11$1_277 = makeString("1.277");
  public static final SubLString $str12$1_652 = makeString("1.652");
  public static final SubLString $str13$ = makeString("");

  //// Internal Constant Initializer Methods

  private static final SubLObject _constant_2_initializer() {
    return list(new SubLObject[] {makeString("cyc-cvs-id"), makeString("meta-macros"), makeString("access-macros"), makeString("subl-macro-promotions"), makeString("subl-promotions"), makeString("subl-macros"), makeString("format-nil"), makeString("modules"), makeString("cyc-revision-extraction"), makeString("system-parameters"), makeString("system-version"), makeString("system-info"), makeString("utilities-macros"), makeString("timing"), makeString("cyc-file-dependencies"), makeString("cycml-macros"), makeString("control-vars"), makeString("sunit-macros"), makeString("sunit-external"), makeString("cfasl"), makeString("sxhash-external"), makeString("red-implementation"), makeString("red-api"), makeString("cyc-testing-initialization"), makeString("cyc-testing"), makeString("generic-testing"), makeString("hash-table-utilities"), makeString("keyhash"), makeString("set-contents"), makeString("reader-writer-locks"), makeString("memoization-state"), makeString("list-utilities"), makeString("transform-list-utilities"), makeString("vector-utilities"), makeString("string-utilities"), makeString("unicode-strings"), makeString("unicode-subsets"), makeString("unicode-support"), makeString("unicode-streams"), makeString("defstruct-sequence"), makeString("visitation-utilities"), makeString("mail-utilities"), makeString("mail-message"), makeString("number-utilities"), makeString("fraction-utilities"), makeString("matrix-utilities"), makeString("numeric-date-utilities"), makeString("iteration"), makeString("binary-tree"), makeString("stacks"), makeString("queues"), makeString("deck"), makeString("integer-sequence-generator"), makeString("semaphores"), makeString("process-utilities"), makeString("os-process-utilities"), makeString("tcp-server-utilities"), makeString("pattern-match"), makeString("tries"), makeString("shelfs"), makeString("id-index"), makeString("dictionary-contents"), makeString("dictionary"), makeString("cfasl-compression"), makeString("cfasl-utilities"), makeString("bijection"), makeString("glob"), makeString("keyhash-utilities"), makeString("set"), makeString("set-utilities"), makeString("dictionary-utilities"), makeString("map-utilities"), makeString("bag"), makeString("accumulation"), makeString("red-infrastructure"), makeString("red-infrastructure-macros"), makeString("red-utilities"), makeString("file-utilities"), makeString("stream-buffer"), makeString("hierarchical-visitor"), makeString("strie"), makeString("finite-state-transducer"), makeString("cache"), makeString("cache-utilities"), makeString("special-variable-state"), makeString("simple-lru-cache-strategy"), makeString("file-hash-table"), makeString("file-hash-table-utilities"), makeString("file-vector"), makeString("file-vector-utilities"), makeString("generic-table-utilities"), makeString("sdbc-macros"), makeString("sdbc"), makeString("graph-utilities"), makeString("sparse-vector"), makeString("sparse-matrix"), makeString("remote-image"), makeString("cyc-testing-utilities"), makeString("heap"), makeString("decision-tree"), makeString("misc-utilities"), makeString("web-utilities"), makeString("timing-by-category"), makeString("api-control-vars"), makeString("eval-in-api"), makeString("eval-in-api-registrations"), makeString("api-kernel"), makeString("cfasl-kernel"), makeString("guardian"), makeString("hl-interface-infrastructure"), makeString("kb-macros"), makeString("constant-completion-low"), makeString("constant-completion-interface"), makeString("constant-completion-high"), makeString("constant-completion"), makeString("constant-handles"), makeString("constant-reader"), makeString("enumeration-types"), makeString("kb-control-vars"), makeString("mt-vars"), makeString("graphl-search-vars"), makeString("ghl-search-vars"), makeString("sbhl-iteration"), makeString("sbhl-paranoia"), makeString("sbhl-module-vars"), makeString("sbhl-link-vars"), makeString("sbhl-marking-vars"), makeString("sbhl-search-datastructures"), makeString("sbhl-search-vars"), makeString("sbhl-time-vars"), makeString("sbhl-link-iterators"), makeString("at-vars"), makeString("gt-vars"), makeString("czer-vars"), makeString("mt-relevance-macros"), makeString("pred-relevance-macros"), makeString("at-macros"), makeString("czer-macros"), makeString("wff-macros"), makeString("wff-vars"), makeString("gt-macros"), makeString("hl-macros"), makeString("obsolete"), makeString("obsolete-macros"), makeString("kb-mapping-macros"), makeString("kb-access-metering"), makeString("kb-object-manager"), makeString("hlmt"), makeString("hlmt-czer"), makeString("constants-interface"), makeString("constant-index-manager"), makeString("constants-low"), makeString("constants-high"), makeString("nart-handles"), makeString("narts-interface"), makeString("nart-index-manager"), makeString("nart-hl-formula-manager"), makeString("narts-low"), makeString("narts-high"), makeString("forts"), makeString("assertion-handles"), makeString("assertions-interface"), makeString("assertion-manager"), makeString("assertions-low"), makeString("assertions-high"), makeString("kb-hl-support-manager"), makeString("kb-hl-supports"), makeString("deduction-handles"), makeString("deductions-interface"), makeString("deduction-manager"), makeString("deductions-low"), makeString("deductions-high"), makeString("unrepresented-term-index-manager"), makeString("unrepresented-terms"), makeString("arguments"), makeString("clause-strucs"), makeString("variables"), makeString("format-cycl-expression"), makeString("hl-storage-modules"), makeString("hl-modifiers"), makeString("sxhash-external-kb"), makeString("el-macros"), makeString("sbhl-macros"), makeString("cycl-variables"), makeString("el-utilities"), makeString("clause-utilities"), makeString("cycl-utilities"), makeString("cycl-grammar"), makeString("el-grammar"), makeString("unicode-nauts"), makeString("term"), makeString("kb-indexing-datastructures"), makeString("kb-utilities"), makeString("simple-indexing"), makeString("kb-indexing-declarations"), makeString("kb-indexing-macros"), makeString("kb-indexing"), makeString("virtual-indexing"), makeString("kb-mapping"), makeString("kb-mapping-utilities"), makeString("kb-gp-mapping"), makeString("somewhere-cache"), makeString("auxiliary-indexing"), makeString("inferred-indexing"), makeString("arity"), makeString("kb-accessors"), makeString("kb-iterators"), makeString("function-terms"), makeString("relation-evaluation"), makeString("assertion-utilities"), makeString("parameter-specification-utilities"), makeString("clauses"), makeString("bindings"), makeString("unification"), makeString("unification-utilities"), makeString("file-backed-cache"), makeString("graphl-graph-utilities"), makeString("ghl-graph-utilities"), makeString("ghl-link-iterators"), makeString("ghl-marking-utilities"), makeString("ghl-search-utilities"), makeString("sbhl-graphs"), makeString("sbhl-caching-policies"), makeString("sbhl-module-utilities"), makeString("sbhl-links"), makeString("sbhl-nat-utilities"), makeString("sbhl-link-utilities"), makeString("sbhl-link-methods"), makeString("sbhl-marking-utilities"), makeString("sbhl-search-utilities"), makeString("sbhl-marking-methods"), makeString("sbhl-search-methods"), makeString("sbhl-search-what-mts"), makeString("sbhl-search-implied-relations"), makeString("sbhl-module-declarations"), makeString("genls"), makeString("disjoint-with"), makeString("sdc"), makeString("isa"), makeString("genl-predicates"), makeString("negation-predicate"), makeString("genl-mts"), makeString("mt-relevance-cache"), makeString("predicate-relevance-cache"), makeString("negation-mt"), makeString("ghl-search-methods"), makeString("sbhl-cache"), makeString("fort-types-interface"), makeString("czer-trampolines"), makeString("wff-utilities"), makeString("wff-module-datastructures"), makeString("wff-modules"), makeString("wff"), makeString("wff-suggest"), makeString("simplifier"), makeString("tersifier"), makeString("verbosifier"), makeString("czer-utilities"), makeString("precanonicalizer"), makeString("postcanonicalizer"), makeString("clausifier"), makeString("prop-sentence-clausifier"), makeString("czer-graph"), makeString("czer-main"), makeString("rule-macros"), makeString("skolems"), makeString("czer-meta"), makeString("uncanonicalizer"), makeString("canon-tl"), makeString("at-routines"), makeString("at-utilities"), makeString("at-admitted"), makeString("at-defns"), makeString("defns"), makeString("at-var-types"), makeString("at-cache"), makeString("arg-type"), makeString("applicable-relations"), makeString("sksi-macros"), makeString("janus-macros"), makeString("gt-utilities"), makeString("gt-search"), makeString("gt-methods"), makeString("transitivity"), makeString("transfers-through"), makeString("tva-utilities"), makeString("tva-tactic"), makeString("tva-strategy"), makeString("tva-inference"), makeString("tva-cache"), makeString("equality-store"), makeString("equals"), makeString("rewrite-of-propagation"), makeString("hl-supports"), makeString("conflicts"), makeString("ebl"), makeString("preserves-genls-in-arg"), makeString("formula-pattern-match"), makeString("cfasl-kb-methods"), makeString("inference-macros"), makeString("inference-modules"), makeString("search"), makeString("tms"), makeString("after-adding"), makeString("rule-after-adding"), makeString("after-adding-modules"), makeString("argumentation"), makeString("backward"), makeString("psc"), makeString("inference-trampolines"), makeString("inference-completeness-utilities"), makeString("backward-utilities"), makeString("backward-results"), makeString("transformation-heuristics"), makeString("inference-pad-data"), makeString("preference-modules"), makeString("preference-module-declarations"), makeString("inference-datastructures-enumerated-types"), makeString("inference-datastructures-problem-store"), makeString("inference-datastructures-problem-query"), makeString("inference-datastructures-problem"), makeString("inference-datastructures-problem-link"), makeString("inference-datastructures-tactic"), makeString("inference-datastructures-proof"), makeString("inference-datastructures-strategy"), makeString("inference-datastructures-forward-propagate"), makeString("inference-datastructures-inference"), makeString("inference-czer"), makeString("inference-proof-spec"), makeString("inference-proof-spec-store"), makeString("inference-worker"), makeString("inference-worker-answer"), makeString("inference-worker-restriction"), makeString("inference-worker-removal"), makeString("inference-worker-transformation"), makeString("inference-worker-residual-transformation"), makeString("inference-worker-rewrite"), makeString("inference-worker-split"), makeString("inference-worker-join-ordered"), makeString("inference-worker-join"), makeString("inference-worker-union"), makeString("inference-tactician-strategic-uninterestingness"), makeString("inference-lookahead-productivity"), makeString("inference-min-transformation-depth"), makeString("inference-tactician"), makeString("inference-tactician-utilities"), makeString("inference-strategic-heuristics"), makeString("inference-balanced-tactician-datastructures"), makeString("inference-balanced-tactician-strategic-uninterestingness"), makeString("inference-balanced-tactician-motivation"), makeString("inference-balanced-tactician-execution"), makeString("inference-heuristic-balanced-tactician"), makeString("balancing-tactician"), makeString("removal-tactician-datastructures"), makeString("removal-tactician-uninterestingness"), makeString("removal-tactician-motivation"), makeString("removal-tactician-execution"), makeString("removal-tactician"), makeString("transformation-tactician-datastructures"), makeString("transformation-tactician-uninterestingness"), makeString("transformation-tactician-motivation"), makeString("transformation-tactician-execution"), makeString("transformation-tactician"), makeString("new-root-tactician-datastructures"), makeString("new-root-tactician-motivation"), makeString("new-root-tactician-execution"), makeString("new-root-tactician"), makeString("neural-net"), makeString("inference-strategist"), makeString("inference-kernel"), makeString("inference-trivial"), makeString("inference-utilities"), makeString("inference-parameters"), makeString("inference-metrics"), makeString("inference-analysis"), makeString("inference-serialization"), makeString("inference-unit-tests"), makeString("removal-module-tests"), makeString("transformation-module-tests"), makeString("evaluatable-relation-tests"), makeString("inference-testing-helpers"), makeString("inference-testing"), makeString("removal-module-cost-tests"), makeString("kb-query"), makeString("kbq-query-run"), makeString("arete"), makeString("janus"), makeString("leviathan"), makeString("deep-inference-generator"), makeString("lilliput"), makeString("lilliput-caches"), makeString("ask-utilities"), makeString("removal-module-utilities"), makeString("removal-modules-lookup"), makeString("removal-modules-minimization"), makeString("removal-modules-evaluation"), makeString("removal-modules-symmetry"), makeString("removal-modules-transitivity"), makeString("removal-modules-reflexivity"), makeString("removal-modules-reflexive-on"), makeString("removal-modules-genlpreds-lookup"), makeString("removal-modules-relation-all"), makeString("removal-modules-relation-all-instance"), makeString("removal-modules-relation-all-exists"), makeString("removal-modules-relation-instance-exists"), makeString("removal-modules-term-external-id-string"), makeString("removal-modules-backchain-required"), makeString("removal-modules-abduction"), makeString("meta-removal-modules"), makeString("removal-modules-non-wff"), makeString("removal-modules-isa"), makeString("removal-modules-genls"), makeString("removal-modules-denotes"), makeString("removal-modules-classification"), makeString("removal-modules-subset-of"), makeString("removal-modules-nearest-isa"), makeString("removal-modules-disjointwith"), makeString("removal-modules-termofunit"), makeString("removal-modules-natfunction"), makeString("removal-modules-formula-arg-n"), makeString("removal-modules-equals"), makeString("removal-modules-evaluate"), makeString("removal-modules-different"), makeString("removal-modules-genlmt"), makeString("removal-modules-genlpreds"), makeString("removal-modules-genlinverse"), makeString("removal-modules-negationpreds"), makeString("removal-modules-negationinverse"), makeString("removal-modules-ist"), makeString("removal-modules-consistent"), makeString("removal-modules-admitted-formula"), makeString("removal-modules-asserted-formula"), makeString("removal-modules-asserted-arg1-binary-preds"), makeString("removal-modules-function-corresponding-predicate"), makeString("removal-modules-start-offset"), makeString("removal-modules-true-sentence"), makeString("removal-modules-formula-implies"), makeString("removal-modules-asserted-more-specifically"), makeString("removal-modules-isomorphic-sentences"), makeString("removal-modules-conceptually-related"), makeString("removal-modules-integer-between"), makeString("removal-modules-indexical-referent"), makeString("removal-modules-constant-name"), makeString("removal-modules-assertion-mt"), makeString("removal-modules-term-strings"), makeString("removal-modules-perform-subl"), makeString("removal-modules-term-chosen"), makeString("removal-modules-tva-lookup"), makeString("removal-modules-bookkeeping"), makeString("removal-modules-rtv"), makeString("removal-modules-member-of-list"), makeString("removal-modules-assertion-arguments"), makeString("removal-modules-deduction-supports"), makeString("removal-modules-assertion-deductions"), makeString("removal-modules-assertion-hl-asserted-argument-keyword"), makeString("removal-modules-inference-reflection"), makeString("removal-modules-known-antecedent-rule"), makeString("removal-modules-distance-between"), makeString("removal-modules-lat-long"), makeString("removal-modules-country-of-city"), makeString("removal-modules-kappa"), makeString("removal-modules-interval-range"), makeString("removal-modules-ke-useless-precision-value"), makeString("removal-modules-kb-indexing"), makeString("removal-modules-concatenate-strings"), makeString("removal-modules-query-answers"), makeString("removal-modules-set-of-list-with-same-member-in-pos"), makeString("removal-modules-conjunctive-pruning"), makeString("removal-modules-kb-sentence"), makeString("removal-modules-source-sentence"), makeString("transformation-modules"), makeString("simplification-modules"), makeString("rewrite-modules"), makeString("forward"), makeString("forward-modules"), makeString("forward-propagate-assertions"), makeString("abnormal"), makeString("hl-prototypes"), makeString("collection-intersection"), makeString("inference-abduction-utilities"), makeString("abduction"), makeString("fi"), makeString("cyc-bookkeeping"), makeString("cyc-kernel"), makeString("prove"), makeString("inference-iterators"), makeString("ke"), makeString("api-remote-objects"), makeString("batch-ke"), makeString("inference-viewer"), makeString("plot-generation"), makeString("cardinality-estimates"), makeString("relationship-generality-estimates"), makeString("evaluation-defns"), makeString("collection-defns"), makeString("ke-utilities"), makeString("ke-text"), makeString("kb-ontology-utilities"), makeString("ontology-layers"), makeString("system-benchmarks"), makeString("object-similarity"), makeString("partitions"), makeString("convert-partitions"), makeString("core"), makeString("kbs-utilities"), makeString("kbs-identification"), makeString("kbs-add-redundant"), makeString("kbs-partition"), makeString("kbs-cleanup"), makeString("kbs-compare"), makeString("kb-cleanup"), makeString("genls-hierarchy-problems"), makeString("encapsulation"), makeString("transcript-utilities"), makeString("transcript-server"), makeString("operation-communication"), makeString("operation-queues"), makeString("remote-operation-filters"), makeString("user-actions"), makeString("formula-template-vars"), makeString("xml-vars"), makeString("xml-macros"), makeString("agenda"), makeString("subl-identifier"), makeString("query-utilities"), makeString("kb-compare"), makeString("kb-paths"), makeString("ke-coherence"), makeString("ke-tools"), makeString("kb-filtering"), makeString("xml-utilities"), makeString("misc-kb-utilities"), makeString("scientific-numbers"), makeString("scientific-number-utilities"), makeString("extended-numbers"), makeString("arithmetic"), makeString("hl-storage-module-declarations"), makeString("bookkeeping-store"), makeString("dumper"), makeString("builder-utilities"), makeString("gt-modules"), makeString("task-processor"), makeString("java-api-kernel"), makeString("connection-guarding"), makeString("open-cyc-simple-inference-api"), makeString("term-classification-tree"), makeString("ctest-macros"), makeString("ctest-utils"), makeString("kct-variables"), makeString("kct-utils"), makeString("kct-cyc-testing"), makeString("kct-thinking"), makeString("cycl-query-specification"), makeString("new-cycl-query-specification"), makeString("formula-templates"), makeString("graphic-library-format"), makeString("value-tables"), makeString("script-instance-editor-api"), makeString("similarity"), makeString("constrained-term-finder"), makeString("constraint-filters"), makeString("test-query-suite"), makeString("nl-api-datastructures"), makeString("morphology"), makeString("file-backed-cache-setup"), makeString("standard-tokenization"), makeString("interval-span"), makeString("removal-modules-relevant-similar-queries"), makeString("removal-modules-semantically-related"), makeString("folification"), makeString("thcl"), makeString("cycml"), makeString("cycml-generator"), makeString("concept-filter"), makeString("lucene-session"), makeString("quirk-trampolines"), makeString("nlp-tests"), makeString("properties"), makeString("webcache"), makeString("xref-database"), makeString("secure-translation"), makeString("form-translation"), makeString("file-translation"), makeString("system-translation"), makeString("common-optimization"), makeString("c-name-translation"), makeString("c-backend"), makeString("optimized-funcall-declarations"), makeString("java-name-translation"), makeString("java-backend"), makeString("translator-utilities")});
  }

  //// Initializers

  public void declareFunctions() {
    declare_system_version_file();
  }

  public void initializeVariables() {
    init_system_version_file();
  }

  public void runTopLevelForms() {
    setup_system_version_file();
  }

}
