package com.cyc.kb.client;

/*
 * #%L
 * KBAPI
 * %%
 * Copyright (C) 1995 - 2014 Cycorp, Inc
 * %%
 * This software is the proprietary information of Cycorp, Inc.
 * Use is subject to license terms.
 * #L%
 */


import com.cyc.base.CycAccess;
import com.cyc.base.CycAccessManager;
import com.cyc.base.cycobject.Guid;
import com.cyc.baseclient.cycobject.CycConstant;
import com.cyc.kb.BinaryPredicate;
import com.cyc.kb.Context;
import com.cyc.kb.KBCollection;
import com.cyc.kb.KBPredicate;
import com.cyc.kb.exception.KBApiException;
import com.cyc.kb.exception.KBApiRuntimeException;

/**
 * A convenience class for frequently accessed Cyc constants. It should be rare
 * to use this class in application making use of the KB API.
 * 
 * @author Vijay Raj
 * @version $Id: Constants.java 151340 2014-05-19 15:55:29Z vijay $
 * @since 1.0
 */
public class Constants {

  private static Constants instance;
  
  private final CycConstant RETAIN_TERM = new CycConstant("retainTerm",
      new Guid("c0a6d5f5-9c29-11b1-9dad-c379636f7270"));
  private final KBCollection DATA_MT = new KBCollectionImpl(new CycConstant(
      "DataMicrotheory", new Guid("be5275a8-9c29-11b1-9dad-c379636f7270")));
  private final Context BASE_KB_CTX = new ContextImpl("BaseKB");
  private final Context UV_MT_CTX = new ContextImpl("UniversalVocabularyMt");
  private final Context INFERENCE_PSC_CTX = new ContextImpl("InferencePSC");
  private final Context EVERYTHING_PSC_CTX = new ContextImpl("EverythingPSC");

  @SuppressWarnings("deprecation")
  private final KBPredicate ISA_PRED  = KBPredicateImpl.get("isa");
  @SuppressWarnings("deprecation")
  private final KBPredicate GENLS_PRED = KBPredicateImpl.get("genls");
  @SuppressWarnings("deprecation")
  private final KBPredicate GENLMT_PRED = KBPredicateImpl.get("genlMt");
  private final KBPredicate GENLPREDS_PRED = KBPredicateImpl.get("genlPreds");
  private final KBPredicate QUOTEDISA_PRED = KBPredicateImpl.get("quotedIsa");
  private final KBPredicate ARGISA_PRED = KBPredicateImpl.get("argIsa");
  private final KBPredicate ARGGENL_PRED = KBPredicateImpl.get("argGenl");
  private final BinaryPredicate ARITY_PRED = BinaryPredicateImpl.get("arity");
  private final KBPredicate RESULTISA_PRED = KBPredicateImpl.get("resultIsa");
  private final KBPredicate RESULTGENL_PRED = KBPredicateImpl.get("resultGenl");
  
  private Constants() throws KBApiException {
    super();
    CycAccessManager.get().getCurrentAccess();
  }

  /**
   * This is not part of the KB API
   * 
   * @return a instance of Constants class which instantiates the following commonly used
   * KB terms.
   * 
   * Contexts:
   * #$UniversalVocabularyMt
   * #$BaseKB
   * #$EverythingPSC
   * #$InferencePSC
   * 
   * Predicates
   * #$isa
   * #$genls
   * #$genlMt
   * #$genlPreds
   * #$quotedIsa
   * 
   * @throws KBApiRuntimeException
   */
  private static Constants getInstance() throws KBApiRuntimeException {
    try {
      if (instance == null) {
        instance = new Constants();
      }
      return instance;
    } catch (Exception e) {
      throw new KBApiRuntimeException(
          "Once of the private final fields in com.cyc.kb.Constants could not be instantiated, can not proceed further.",
          e);
    }
  }

  // Main contexts
  /**
   * @return Collection.get("DataMicrotheory")
   */
  public static KBCollection dataMt() {
    return getInstance().DATA_MT;
  }

  protected static CycConstant retainTerm() {
    return getInstance().RETAIN_TERM;
  }

  /**
   * @return Context.get("BaseKB")
   */
  public static Context baseKbMt() {
    return getInstance().BASE_KB_CTX;
  }

  /**
   * @return Context.get("EverythingPSC")
   */
  public static Context everythingPSCMt() {
    return getInstance().EVERYTHING_PSC_CTX;
  }

  /**
   * @return Context.get("InferencePSC")
   */
  public static Context inferencePSCMt() {
    return getInstance().INFERENCE_PSC_CTX;
  }

  /**
   * @return Context.get("UniversalVocabularyMt")
   */
  public static Context uvMt() {
    return getInstance().UV_MT_CTX;
  }

  // Main predicates
  /**
   * @return Predicate.get("isa")
   */
  public static KBPredicate isa() {
    return getInstance().ISA_PRED;
  }
  
  /**
   * @return Predicate.get("genls")
   */
  public static KBPredicate genls() {
    return getInstance().GENLS_PRED;
  }

  /**
   * @return Predicate.get("genlMt")
   */
  public static KBPredicate genlMt() {
    return getInstance().GENLMT_PRED;
  }

  /**
   * @return Predicate.get("genlPreds")
   */
  public static KBPredicate genlPreds() {
    return getInstance().GENLPREDS_PRED;
  }
  
  /**
   * @return Predicate.get("quotedIsa")
   */
  public static KBPredicate quotedIsa() {
    return getInstance().QUOTEDISA_PRED;
  }
  
  /**
   * @return Predicate.get("argIsa")
   */
  public static KBPredicate argIsa() {
    return getInstance().ARGISA_PRED;
  }

  /**
   * @return Predicate.get("argGenl")
   */
  public static KBPredicate argGenl() {
    return getInstance().ARGGENL_PRED;
  }

  /**
   * @return BinaryPredicate.get("arity")
   */
  public static BinaryPredicate arity() {
    return getInstance().ARITY_PRED;
  }

  /**
   * @return Predicate.get("resultIsa")
   */
  public static KBPredicate resultIsa() {
    return getInstance().RESULTISA_PRED;
  }

  /**
   * @return Predicate.get("resultGenl")
   */
  public static KBPredicate resultGenl() {
    return getInstance().RESULTGENL_PRED;
  }

  // Main collections

}
