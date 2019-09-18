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

import com.cyc.base.CycAccessManager;
import com.cyc.base.CycConnectionException;
import com.cyc.base.cycobject.CycObject;
import com.cyc.base.cycobject.FormulaSentence;
import com.cyc.base.cycobject.Naut;
import com.cyc.baseclient.cycobject.CycFormulaSentence;
import com.cyc.baseclient.cycobject.CycNaut;
import com.cyc.baseclient.datatype.DateConverter;
import com.cyc.kb.Assertion;
import com.cyc.kb.Context;
import com.cyc.kb.KBObject;
import com.cyc.kb.KBPredicate;
import com.cyc.kb.Sentence;
import com.cyc.kb.exception.KBApiException;
import com.cyc.kb.exception.KBApiRuntimeException;
import com.cyc.kb.exception.KBTypeException;
import com.cyc.kb.quant.QuantifiedRestrictedVariable;
import com.cyc.kb.quant.RestrictedVariable;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Set;


/**
 * A <code>Sentence</code> object is a facade for a <code>#$CycLSentence</code> 
 * in Cyc KB.
 * 
 * This is a collection of all syntactically well formed sentences. The sentence
 * does not include denotational terms, that is, the terms formed by Functions. To
 * be syntactically well formed, the sentence has to just consist of a relation
 * followed by terms. It does not have to even obey arity constraints. 
 * 
 * @author Vijay Raj
 * @version $Id: SentenceImpl.java 151340 2014-05-19 15:55:29Z vijay $
 */
// @todo DaveS review documentation
public class SentenceImpl extends StandardKBObject implements Sentence {

  // The list of KBObject or Primitive datatypes
  // This is to preserve all the KBObjects passed in to construct the sentence.
  // This is expected to be useful when Sentence has to be reconstructed when
  // handling RestrictedVariable, since the RVs have a restriction within, that
  // gets added to the sentence. 
  /**
   * NOT PART OF KB API 1.0
   */  
  private List<Object> arguments;

  /**
   * Return a new
   * <code>Sentence</code> based on the existing CycFormulaSentence
   * <code>cycObject</code>. CycFormulaSentences are not indexed in the KB. 
   * These objects may not have anything corresponding in the KB. The sentences
   * do not even have to be well formed, semantically or even syntactically. 
   *
   * @param cycObject	the CycObject wrapped by Sentence. The
   * constructor verifies that the CycObject is a #$CycLSentence
   * 
   * @throws KBTypeException is thrown in cycObject is not an instance of 
   * CycFormulaSentence 
   */
  public SentenceImpl(CycObject cycObject) throws KBTypeException {
    super(cycObject);
  }

  /**
   * Builds a sentence based on <code>pred</code> and other <code>args</code>. 
   * Note that <code>args</code> should either be KBObjects or Java classes,
   * String, Number or Date. This constructor also handles java.util.List and java.util.Set
   * of other supported KB API or Java objects. It even supports, List of List etc.
   * 
   * @param pred  the first argument of the formula
   * @param args  the other arguments of the formula in the order they appear in the
   * list
   * 
   * @throws KBTypeException never thrown
   */
  public SentenceImpl (KBPredicate pred, Object... args) throws KBTypeException {
    this(combineParams(pred, args));
  }
  
  /**
   * Returns a new list of objects based on <code>pred</code> and other <code>args</code>. 
   * Note that <code>args</code> should either be KBObjects or Java classes,
   * String, Number or Date.
   * 
   * @param pred  the first argument of the formula
   * @param args  the other arguments of the formula in the order they appear in the
   * list
   * 
   * @return a new list with the supplied arguments
   */
  private static Object[] combineParams(KBPredicate pred, Object... args){
    List<Object> l = new ArrayList<Object>();
    l.addAll(Arrays.asList(args));
    l.add(0, pred);
    return l.toArray();
  }
  
  
  /**
   * Builds an arbitrary sentence based on the <code>args</code> provided. 
   * Note that <code>args</code> should either be KBObjects or Java classes,
   * String, Number or Date. This constructor also handles java.util.List and java.util.Set
   * of other supported KB API or Java objects. It even supports, List of List etc.
   * 
   * @param args  the arguments of the formula in the order they appear in the
   * list
   * 
   * @throws KBTypeException never thrown
   */
  //NEW type of KBObject constructor!! Takes other KBObjects
  public SentenceImpl (Object... args) throws KBTypeException {
    this(convertKBObjectArrayToCycFormulaSentence(args));
    arguments = Arrays.asList(args);
  }
  
  /**
   * Build a CycFormulaSentence from the given KBObjects arguments <code>args</code>.
   * Note that <code>args</code> should either be KBObjects or Java classes,
   * String, Number or Date. This method also handles java.util.List and java.util.Set
   * of other supported KB API or Java objects. It even supports, List of List etc.
   * 
   * @param args 
   * 
   * @return a CycFormulaSentence corresponding to the arguments <code>args</code>.
   */
  private static FormulaSentence convertKBObjectArrayToCycFormulaSentence(Object... args) {
    List<Object> outargs = new ArrayList<Object>();
    List<Object> tempoutargs = new ArrayList<Object>();
    try {
    for (Object arg : args ){
      if (arg instanceof RestrictedVariable) {
        tempoutargs.add(((RestrictedVariable) arg).getVariable().getCore());
        if (outargs.isEmpty()) {
          outargs.add(CycFormulaSentence.AND);
        }
        outargs.add(convertKBObjectArrayToCycFormulaSentence(((RestrictedVariable) arg).getSentenceArguments().toArray()));
      } else if (arg instanceof QuantifiedRestrictedVariable) {
        
      } else if(arg instanceof KBObject){
        tempoutargs.add(((KBObject)arg).getCore());
      } else if (arg instanceof List) {
        
        FormulaSentence cfs = convertKBObjectArrayToCycFormulaSentence(((List<?>) arg).toArray());
        Naut cn = new CycNaut(CycAccessManager.get().getCurrentAccess().getLookupTool().getKnownFortByName(
            "TheList"), cfs.toCycList().toArray());
        tempoutargs.add(cn);
      } else if (arg instanceof Set) {
        FormulaSentence cfs = convertKBObjectArrayToCycFormulaSentence(((Set<?>) arg).toArray());
        Naut cn = new CycNaut(CycAccessManager.get().getCurrentAccess().getLookupTool().getKnownFortByName(
            "TheSet"), cfs.toCycList().toArray());
        tempoutargs.add(cn);
      } else if (arg instanceof Date) {
          DateConverter.getInstance();
          CycObject co = DateConverter.toCycDate((Date) arg);
          tempoutargs.add(co);
      } else {
        tempoutargs.add(arg);
      }
    }
    } catch (CycConnectionException e){
      // Low level connection exception
    	throw new KBApiRuntimeException(e.getMessage(), e);
    } 
    
    if (outargs.isEmpty()) {
      outargs.addAll(tempoutargs);
    } else {
      outargs.add(CycFormulaSentence.makeCycFormulaSentence(tempoutargs.toArray()));
    }
    
    return CycFormulaSentence.makeCycFormulaSentence(outargs.toArray());
  }
 
  
  /*
   * finds or creates a Sentence represented by sentHlid in the
   * underlying KB
   * <p>
   *
   * @param sentStr	the string representing a Sentence in the KB
   *
   * @throws KBApiException	if the Sentence represented by predStr
   * is not found and could not be created
   */
  @Deprecated //deprecated in the sense of broken, not in the sense that it shouldn't be here
  public SentenceImpl(String sentStr) throws KBApiException {
    super(sentStr);
    this.arguments = new ArrayList<Object> ();
    throw new UnsupportedOperationException("Stub method. Not tested.");
  }

  /*
   * Creates a
   * <code>Sentence</code> based on the pre-existing term in the Cyc KB
   * with HL ID sentHlid and the name sentHlid.
   * <p>
   * See {@link Sentence#Sentence(String)} for a way to make a new
   * predicate.
   *
   * @param sentStr	the string representing a Sentence in the KB
   * @param	sentHlid	the HLID of the implementation-dependent object
   *
   * @throws KBApiException	if the Sentence represented by
   * sentHlid and having an HLID sentHlid is not found
   * @todo what happens if the hlid and the predStr don't match? Is that also an
   * Exception, or is one or the other preferred?
   */

  //  We will either use HLID or cycObjString. There is no point using both.
  @Deprecated //deprecated in the sense of broken, not in the sense that it shouldn't be here
  /*
  public Sentence(String sentStr, String sentHlid) throws KBApiException {
    super(sentStr, sentHlid);
    this.arguments = new ArrayList<Object> ();
    throw new UnsupportedOperationException("Stub method. Not tested.");
  }
  */

  /*
   * @todo The wff constraint check creates scholem terms, may be we should not use it
   * @todo If we do wff check, determine appropriate Mt to do it in.
   */
  
  /**
   * This is not part of the KB API. Check that the candidate core
   * object is valid CycFormulaSentence. In the CycKB the object would be
   * valid #$CycLSentence
   * 
   * @see {@link StandardKBObject#isValidCore(CycObject)} for more comments
   */
  // NOTE: We might want to do a lenient WFF check here. But it could be very expensive
  // and unnecessary. 

  @Override
  protected boolean isValidCore(CycObject cycObject) {
    if (cycObject instanceof CycFormulaSentence) {
      return true;
      // return !((CycFormulaSentence) tempCore).hasWffConstraintViolations(CycAccess.getCurrent(), CycAccess.universalVocabularyMt);
    } else {
      return false;
    }
  }
  
  /**
   * Conjoin sentences. Creates a new sentence with #$and as the relation
   * and all other sentences as the arguments.
   * 
   * @param sentences list of sentences to be conjoined 
   * 
   * @return a new conjunction sentence
   */
  public static Sentence and (Iterable<SentenceImpl> sentences) throws KBTypeException {
    List<FormulaSentence> cfsList = new ArrayList<FormulaSentence> ();
    for(SentenceImpl s : sentences){
      cfsList.add(((CycFormulaSentence)s.getCore()));
    }
    final FormulaSentence cfs = CycFormulaSentence.makeConjunction(cfsList);
    // TODO: Can we catch KBTypeException. We know all components are Sentences.
    // combination should be a Sentence
    return new SentenceImpl(cfs);
  } 
  
  /**
   * Disjoin sentences. Creates a new sentence with #$and as the relation
   * and all other sentences as the arguments.
   * 
   * @param sentences list of sentences to be disjoined 
   * 
   * @return a new disjunction sentence
   */
  public static Sentence or (Iterable<SentenceImpl> sentences) throws KBTypeException {
    List<FormulaSentence> cfsList = new ArrayList<FormulaSentence> ();
    for(SentenceImpl s : sentences){
      cfsList.add(((CycFormulaSentence)s.getCore()));
    }
    final FormulaSentence cfs = CycFormulaSentence.makeDisjunction(cfsList);
    // TODO: Can we catch KBTypeException. We know all components are Sentences.
    // combination should be a Sentence    
    return new SentenceImpl(cfs);
  } 
    
  /* (non-Javadoc)
   * @see com.cyc.kb.Sentence#assertIn(com.cyc.kb.ContextImpl)
   */
  @Override
  public Assertion assertIn(Context ctx) throws KBApiException {
    return FactImpl.findOrCreate(this, ctx);
    // return new Fact(ctx, this);
  }
  
  /*
  public Query askIn(Context ctx) {
    return null;
  }
  */
    
  @Override
  protected String getTypeString() {
    return "#$CycLSentence";
  }
  
  /* (non-Javadoc)
   * @see com.cyc.kb.Sentence#getArguments()
   */
  @Override
  public List<Object> getArguments() {
    return arguments;
  }

  /* (non-Javadoc)
   * @see com.cyc.kb.Sentence#setArguments(java.util.List)
   */
  @Override
  public void setArguments(List<Object> arguments) {
    this.arguments = arguments;
  }
  
  /* (non-Javadoc)
   * @see com.cyc.kb.Sentence#addArguments(java.lang.Object)
   */  
  @Override
  public void addArguments(Object arguments) {
    this.arguments.add(arguments);
  }
}
