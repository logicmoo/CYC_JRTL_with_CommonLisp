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

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import com.cyc.base.CycAccess;
import com.cyc.base.CycAccessManager;
import com.cyc.base.CycApiException;
import com.cyc.base.CycConnectionException;
import com.cyc.base.cycobject.CycAssertion;
import com.cyc.base.cycobject.CycList;
import com.cyc.base.cycobject.CycObject;
import com.cyc.base.cycobject.CycSymbolI;
import com.cyc.base.cycobject.ELMt;
import com.cyc.base.cycobject.FormulaSentence;
import com.cyc.baseclient.CycObjectFactory;
import com.cyc.baseclient.cycobject.CycFormulaSentence;
import com.cyc.baseclient.cycobject.CycSymbol;
import com.cyc.baseclient.cycobject.DefaultCycObject;
import com.cyc.kb.Assertion;
import com.cyc.kb.Context;
import com.cyc.kb.KBAPIEnums;
import com.cyc.kb.KBAPIEnums.Direction;
import com.cyc.kb.KBAPIEnums.Strength;
import com.cyc.kb.Sentence;
import com.cyc.kb.config.KBAPIConfiguration;
import com.cyc.kb.exception.CreateException;
import com.cyc.kb.exception.DeleteException;
import com.cyc.kb.exception.InvalidFormulaInContextException;
import com.cyc.kb.exception.KBApiRuntimeException;
import com.cyc.kb.exception.KBObjectNotFoundException;
import com.cyc.kb.exception.KBTypeException;

/**
 * An Assertion object is a facade for a
 * <code>#$CycLAssertion</code> in Cyc KB. An assertion is a semantically well
 * formed Sentence, in a specific Context.
 * <p>
 * Sub-classes include Fact and Rule.
 *
 * @author Vijay Raj
 * @version $Id: AssertionImpl.java 151340 2014-05-19 15:55:29Z vijay $
 * @since 1.0
 */
public class AssertionImpl extends StandardKBObject implements Assertion {

	
  /**
   * This is not part of the KB API. default constructor, calls the default
   * super constructor
   *
   * @throws KBApiRuntimeException if there is a problem connecting to Cyc
   */
  AssertionImpl() {
    super();
  }
  
  /**
   * This is not part of the KB API. an implementation-dependent constructor
   * <p>
   * Return a new
   * <code>Assertion</code> based on the existing CycAssertion object
   * <code>cycAssert</code>. The KB assertion underlying
   * <code>cycAssert</code> must already be a #$CycLAssertion.
   * 
   * It is used when the result of query is a CycObject and is known to be or
   * requested to be cast as an Assertion.
   *
   * @param cycAssert	the CycObject wrapped by Assertion. The constructor
   * verifies that the CycObject is an #$CycLAssertion.
   * 
   * @throws KBTypeException  if cycAssert (which already exists) is not 
   * a #$CycLAssertion
   */
  // We have made this public for the reflection mechanism to see this class.
  // If made package private, reflection of getConstructor(CycObject.class) fails
  @Deprecated
  AssertionImpl(CycObject cycAssert) throws KBTypeException {
    super(cycAssert);
  }
  
  /*
   * This is not part of the KB API. an implementation-dependent constructor
   * <p>
   * This constructor retrieves the an assertion based on the id <code>hlid</code>
   * and verifies that it matches <code>cycAssertStr</code>.
   * 
   * @param cycAssertStr  the string representation of the assertion
   * @param hlid          the id of the assertion
   * @throws KBApiException 
   * @todo The cycAssertStr has to match exactly to the object.toString(), probably
   * we need to relax string matching, by ignoring white-spaces.
   */
  // We will have a constructor with just hlid
  /*
  public Assertion(String cycAssertStr, String hlid) throws KBApiException {
    super(cycAssertStr, hlid);
  }
  */ 
 
  
  /**
   * Get the <code>Assertion</code> object that corresponds to
   * <code>cycAssert</code>. Throws exceptions if the object isn't in the KB, or if
   * it's not already an assertion. (Currently cycAssert is only checked to be an 
   * instance of CycAssertion. )
   * 
   * @param cycAssert candidate assertion object
   * 
   * @return an Assertion based on cycAssert
   * 
   * @throws KBTypeException if the cycAssert is not an instance of assertion
   * @throws CreateException 
   */
  @Deprecated
  public static AssertionImpl get(CycObject cycAssert) throws KBTypeException, CreateException {
    return KBObjectFactory.get(cycAssert, AssertionImpl.class);
  }

  /**
   * Get the <code>Assertion</code> object that corresponds to
   * <code>hlid</code>. Throws exceptions if the <code>hlid</code> isn't in the KB, or if
   * it's not already an assertion.
   * 
   * NOTE: The get (String ) factory methods in other classes find objects based 
   * on <code>hlid</code> or string representation of the object. They use nameOrId
   * as the string variable name. But this method finds objects based on
   * <code>hlid</code> alone. This is because it is much more common and easier
   * to find assertions based on two strings, formula and context. 
   * 
   * @param hlid  the <code>hlid</code> corresponding to the assertion in the KB
   * 
   * @return an Assertion based on <code>hlid</code>
   * 
   * @throws KBTypeException  if assertion based on <code>hlid</code> is not an instance of assertion
   * @throws CreateException 
   */
  @SuppressWarnings("deprecation")
public static Assertion get(String hlid) throws KBTypeException, CreateException {
    Object o = null;
    // NOTE: The StandardKBObject was too geared towards Term (Constant, NAT) creation
    // Did not want to overload that with assertion creation as well. 
    // Also the get method here takes only hlid. For a factory method that takes String to 
    // find an assertion, see get(String formulaStr, String ctxStr)
    try {
      o = DefaultCycObject.fromPossibleCompactExternalId(hlid, CycAccessManager.get().getCurrentAccess());
    } catch (CycConnectionException e){
      throw new KBApiRuntimeException(e.getMessage(), e);
    }
    
    if (o instanceof CycAssertion) {
      return KBObjectFactory.get((CycObject)o, AssertionImpl.class);
    } else {
      String msg = "Could not find any Assertion with hlid: " + hlid + " in the KB.";
      throw new KBObjectNotFoundException(msg);
    }
  }
  
  /**
   * Get the <code>Fact</code> object that corresponds to
   * <code>formulaStr</code> in the context corresponding to <code>ctxStr</code>. Throws exceptions 
   * if no such formula
   * is found in the specified context in the KB, or if
   * it's not already an assertion and a GAF. 
   * 
   * @param formulaStr string representation of the formula to be found
   * @param ctxStr     string representation of the context of the formula
   * 
   * @return an Fact based on <code>formulaStr</code> and <code>ctxStr</code>
   * @throws CreateException 
   * @throws KBTypeException 
   * @throws KBObjectNotFoundException if no fact with the given formula 
   * string is found in the context
   */
  
  @SuppressWarnings("deprecation")
public static Assertion get(String formulaStr, String ctxStr) throws KBTypeException, CreateException {
    CycAssertion ca = null;
    // @todo: There are two purposes of caching
    // 1. Reduce round trip to KB
    // 2. Use the same object if core is equal.
    // Since the cache key is cyclify() and hlid, we have to find the assertion
    // using formulaStr and ctxStr to get any of the cache keys. Which means we have to
    // do one trip to the KB anyways. But we still use KBObjectFactory.get to reuse the
    // same KBObject.
    // A separate KBObjectFactory method that takes the ist sentence of formula and mt,
    // could also eliminate the lookup step.
    ca = findAssertion(formulaStr, ctxStr);

    if (ca == null){
      String msg = "Could not find any Assertion with: " + formulaStr + " in context: " + ctxStr;
      throw new KBObjectNotFoundException(msg);
    }
    return KBObjectFactory.get(ca, AssertionImpl.class);
  }

  /**
   * Get the <code>Assertion</code> object that corresponds to
   * <code>formula</code> in the context <code>ctx</code>. Throws exceptions if no such formula
   * is found in the specified context in the KB, or if
   * it's not already an assertion.
   * 
   * @param formula formula to be found
   * @param ctx     context of the formula
   * 
   * @return an Assertion based on formula and context
   * @throws CreateException 
   * @throws KBTypeException 
   * @throws KBObjectNotFoundException if no assertion with the given formula 
   * is found in the context
   */
  @SuppressWarnings("deprecation")
public static AssertionImpl get(SentenceImpl formula, Context ctx) throws KBTypeException, CreateException {
    CycAssertion ca = null;
    //@todo: There are two purposes of caching
    // 1. Reduce round trip to KB
    // 2. Use the same object if core is equal.
    // Since the cache key is cyclify() and hlid, we have to find the assertion
    // using formulaStr and ctxStr to get any of the cache keys. Which means we have to
    // do one trip to the KB anyways. But we still use KBObjectFactory.get to reuse the
    // same KBObject.       
    // A separate KBObjectFactory method that takes the ist sentence of formula and mt,
    // could also eliminate the lookup step.
    ca = findAssertion(FormulaSentence.class.cast(formula.getCore()), ctx.asELMt());
    
    if (ca == null){
      String msg = "Could not find the assertion: " + formula + " in context: " + ctx;
      throw new KBObjectNotFoundException(msg);
    }
    return KBObjectFactory.get(ca, AssertionImpl.class);
  }
  
  /**
   * Finds or creates the <code>Assertion</code> object that corresponds to
   * <code>formulaStr</code> in the default assertion context. Tries to assert if no such formula
   * is found in the specified context in the KB. Throws an exception if it is unable
   * to make such an assertion.
   * 
   * Strength is set to Strength.DEFAULT by default
   * Direction is set to Direction.FORWARD by default 
   *  
   * @param formulaStr the string representation of the formula to be found or created
   * 
   * @return an Assertion based on <code>formulaStr</code> and the default assertion context
   * 
   * @throws CreateException 
   * @throws KBTypeException 
   * @throws InvalidFormulaInContextException if no assertion with the given formula 
   * string is found or created in the context
   */
  public static Assertion findOrCreate(String formulaStr) throws KBTypeException, CreateException {
	  return AssertionImpl.findOrCreate(formulaStr, KBAPIConfiguration.getDefaultContext().forAssertion().toString());
  }
  
  /**
   * Finds or creates the <code>Assertion</code> object that corresponds to
   * <code>formulaStr</code> in the context corresponding to <code>ctxStr</code>. Tries to assert if no such formula
   * is found in the specified context in the KB. Throws an exception if it is unable
   * to make such an assertion.
   * 
   * Strength is set to Strength.DEFAULT by default
   * Direction is set to Direction.FORWARD by default 
   *  
   * @param formulaStr the string representation of the formula to be found or created
   * @param ctxStr     the string representation of the context of the formula
   * 
   * @return an Assertion based on <code>formulaStr</code> and <code>ctxStr</code>
   * 
   * @throws CreateException 
   * @throws KBTypeException 
   * @throws InvalidFormulaInContextException if no assertion with the given formula 
   * string is found or created in the context
   */
  public static Assertion findOrCreate(String formulaStr, String ctxStr) 
      throws KBTypeException, CreateException {
	  return AssertionImpl.findOrCreate(formulaStr, ctxStr, Strength.AUTO, Direction.AUTO);
  }
  
  /**
   * Finds or creates the <code>Assertion</code> object that corresponds to
   * <code>formulaStr</code> in the context corresponding to <code>ctxStr</code>. Tries to assert if no such formula
   * is found in the specified context in the KB. Throws an exception if it is unable
   * to make such an assertion.
   * 
   * @param formulaStr the string representation of the formula to be found or created
   * @param ctxStr     the string representation of the context of the formula
   * @param s		   the strength of the assertion
   * @param d          the direction of the assertion  
   * 
   * @return an Assertion based on formula and context
   * 
   * @throws CreateException 
   * @throws KBTypeException 
   * @throws InvalidFormulaInContextException if no assertion with the given formula 
   * string is found or created in the context
   */
  
  @SuppressWarnings("deprecation")
public static Assertion findOrCreate(String formulaStr, String ctxStr, Strength s, Direction d) 
      throws KBTypeException, CreateException {
    CycAssertion ca = null;
          
    // @todo: There are two purposes of caching
    // 1. Reduce round trip to KB
    // 2. Use the same object if core is equal.
    // Since the cache key is cyclify() and hlid, we have to find the assertion
    // using formulaStr and ctxStr to get any of the cache keys. Which means we have to
    // do one trip to the KB anyways. But we still use KBObjectFactory.get to reuse the
    // same KBObject.
    // A separate KBObjectFactory method that takes the ist sentence of formula and mt,
    // could also eliminate the lookup step.

    // The assertSentence tries to find the assertion anyways, before actually trying
    // to assert.
    ca = assertSentence(formulaStr, ctxStr, s, d);

    if (ca == null){
      String msg = "Could not find or create the assertion: " + formulaStr + " in context: " + ctxStr;
      throw new InvalidFormulaInContextException(msg);
    }
    return KBObjectFactory.get(ca, AssertionImpl.class);
  }

  /**
   * Finds or creates the <code>Assertion</code> object that corresponds to
   * <code>formula</code> in <code>ctx</code>. Tries to assert if no such formula
   * is found in the specified context in the KB. Throws an exception if it is unable
   * to make such an assertion.
   * 
   * NOTE: All findOrCreate factory methods that take CycObject do not eventually create 
   * any new object in the assertion because (most of) the CycObjects can only be built 
   * based on objects in the KB. Some exceptions are Sentences, Variables and Symbols.
   * NAUTs are also not in the KB, but in the API they are effectively treated as being in 
   * the KB. 
   * 
   * Strength is set to Strength.DEFAULT by default
   * Direction is set to Direction.FORWARD by default 
   *  
   * @param formula the formula to be found or created
   * @param ctx     the context of the formula
   * 
   * @return an Assertion based on formula and context
   * @throws CreateException 
   * @throws KBTypeException 
   * 
   * @throws InvalidFormulaInContextException if no assertion with the given formula 
   * string is found or created in the context
   */
  public static Assertion findOrCreate(Sentence formula, Context ctx) throws KBTypeException, CreateException 
       {
	  return AssertionImpl.findOrCreate(formula, ctx, Strength.AUTO, Direction.AUTO);
  }
  
  /**
   * Find or creates the <code>Assertion</code> object that corresponds to 
   * <code>formula</code> in the default assertion context (@link KBAPIConfiguration}.
   * Tries to assert if no such formula is found in the KB.  Throws an exception
   * if it is unable to make such an assertion.
   * 
   * NOTE: All findOrCreate factory methods that take CycObject do not eventually create 
   * any new object in the assertion because (most of) the CycObjects can only be built 
   * based on objects in the KB. Some exceptions are Sentences, Variables and Symbols.
   * NAUTs are also not in the KB, but in the API they are effectively treated as being in 
   * the KB. 
   * 
   * Strength is set to Strength.DEFAULT by default
   * Direction is set to Direction.FORWARD by default
   * 
   * @param formula the formula to be found or created
   * 
   * @return an Assertion based on the formula in the default assertion context
   * 
   * @throws KBTypeException
   * @throws CreateException
   */
  public static Assertion findOrCreate(Sentence formula) throws KBTypeException, CreateException
  {
	  return AssertionImpl.findOrCreate(formula, KBAPIConfiguration.getDefaultContext().forAssertion());
  }
  
  /**
   * Finds or creates the <code>Assertion</code> object that corresponds to
   * <code>formula</code> in <code>ctx</code>. Tries to assert if no such formula
   * is found in the specified context in the KB. Throws an exception if it is unable
   * to make such an assertion.
   * 
   * NOTE: All findOrCreate factory methods that take CycObject do not eventually create 
   * any new object in the assertion because (most of) the CycObjects can only be built 
   * based on objects in the KB. Some exceptions are Sentences, Variables and Symbols.
   * NAUTs are also not in the KB, but in the API they are effectively treated as being in 
   * the KB. 
   * 
   * @param formula the formula to be found or created
   * @param ctx     the context of the formula
   * @param s		the strength of the assertion
   * @param d       the direction of the assertion  
   * 
   * @return an Assertion based on formula and context
   * @throws CreateException 
   * @throws KBTypeException 
   * 
   * @throws InvalidFormulaInContextException   if no assertion with the given formula 
   * string is found or created in the context
   * 
   */
  @SuppressWarnings("deprecation")
public static AssertionImpl findOrCreate(Sentence formula, Context ctx, Strength s, Direction d) 
      throws KBTypeException, CreateException {
    CycAssertion ca = null;
        
    //@todo: There are two purposes of caching
    // 1. Reduce round trip to KB
    // 2. Use the same object if core is equal.
    // Since the cache key is cyclify() and hlid, we have to find the assertion
    // using formulaStr and ctxStr to get any of the cache keys. Which means we have to
    // do one trip to the KB anyways. But we still use KBObjectFactory.get to reuse the
    // same KBObject.       
    // A separate KBObjectFactory method that takes the ist sentence of formula and mt,
    // could also eliminate the lookup step.
    
    // The assertSentence tries to find the assertion anyways, before actually trying
    // to assert.
    ca = assertSentence(FormulaSentence.class.cast(formula.getCore()), ctx, s, d);
       
    if (ca == null){
      String msg = "Could not find or create the assertion: " + formula + " in context: " + ctx;
      throw new InvalidFormulaInContextException(msg);
    }
    return KBObjectFactory.get(ca, AssertionImpl.class);  
  }

  /* (non-Javadoc)
   * @see com.cyc.kb.Assertion#context()
   */
  @Override
  @SuppressWarnings("deprecation")
public ContextImpl context() {
    CycAssertion ca = (CycAssertion) core;
    ContextImpl ctx;
    try {
      ctx = ContextImpl.get(ca.getMt());
    } catch (Exception te){
      // The assertion is already created, that means the context should
      // already be there. 
      throw new KBApiRuntimeException(te.getMessage(), te);
    } 
    return ctx;
  }

  /* (non-Javadoc)
   * @see com.cyc.kb.Assertion#getSupportingAssertions()
   */
  @Override
  public Collection<Assertion> getSupportingAssertions() throws KBTypeException, CreateException {
    try {

      String command = "(assertion-asserted-assertion-supports " + this.getCore().stringApiValue() + ")";
      CycList<?> result = CycAccessManager.get().getCurrentAccess().converse().converseList(command);
      Collection<Assertion> asserts = new ArrayList<Assertion>();
      for (Object o : result) {
        asserts.add(AssertionImpl.get((CycObject) o));
      }
      return asserts;
    } catch (CycConnectionException e) {
      throw new KBApiRuntimeException(e);
    }
  }

  /*
   *
   * @return the collection of all assertions that directly or indirectly
   * support this assertion. Effectively this is a transitive version of
   * {@link getSupportingAssertions}.
   */
  /*  this needs to be completed, and it should be basically the same as getSupportingAssertions with a high depth limit.
   public Collection<Assertion> getAllSupportingAssertions () {
   throw new UnsupportedOperationException();
   }
   */
  
  /* (non-Javadoc)
   * @see com.cyc.kb.Assertion#isDeducedAssertion()
   */
  @Override
  public boolean isDeducedAssertion() {
    try {
      String command = "(deduced-assertion? " + this.getCore().stringApiValue() + ")";
      return CycAccessManager.get().getCurrentAccess().converse().converseBoolean(command);
    } catch (CycConnectionException e) {
      throw new KBApiRuntimeException(e);
    }
  }
  
  /* (non-Javadoc)
   * @see com.cyc.kb.Assertion#isGroundAtomicFormula()
   */
  @Override
  public boolean isGroundAtomicFormula() {
	 return ((CycAssertion) this.getCore()).isGaf();
  }

  /* (non-Javadoc)
   * @see com.cyc.kb.Assertion#isAssertedAssertion()
   */
  @Override
  public boolean isAssertedAssertion() {
    try {
      String command = "(asserted-assertion? " + this.getCore().stringApiValue() + ")";
      return CycAccessManager.get().getCurrentAccess().converse().converseBoolean(command);
    } catch (CycConnectionException e) {
      throw new KBApiRuntimeException(e);
    }
  }
  
  /* (non-Javadoc)
   * @see com.cyc.kb.Assertion#getDirection()
   */
  @Override
  public Direction getDirection() {
	    try {
	      String command = "(assertion-direction " + this.getCore().stringApiValue() + ")";
	      CycObject co = CycAccessManager.get().getCurrentAccess().converse().converseCycObject(command);
	      if (co instanceof CycSymbolI){
	    	  CycSymbolI cs = (CycSymbolI) co;
	    	  if (cs.equals(new CycSymbol(":BACKWARD"))){
	    		  return Direction.BACKWARD;
	    	  } else if (cs.equals(new CycSymbol(":FORWARD"))){
	    		  return Direction.FORWARD;
	    	  } else {
	    	    // This should never happen for CycAssertion, so a runtime exception
	    		  throw new KBApiRuntimeException("Unknown or :CODE Direction");
	    	  }
	      } else {
	    	  throw new KBApiRuntimeException("Unknown Direction");
	      }
	    } catch (CycConnectionException e) {
	      throw new KBApiRuntimeException(e.getMessage(), e);
	    }
	  }

  /* (non-Javadoc)
   * @see com.cyc.kb.Assertion#delete()
   */
  @Override
  public void delete() throws DeleteException {
    CycAssertion ca = (CycAssertion) core;
    try {
      CycAccessManager.get().getCurrentAccess().getUnassertTool().unassertAssertion(ca, true, KBAPIConfiguration.getShouldTranscriptOperations());
      setIsValid(false);
    } catch (CycConnectionException ex) {
      throw new KBApiRuntimeException(
              "Couldn't delete the fact: " + core.toString(), ex);
    }
    try {
      if (findAssertion(ca.getELFormula(CycAccessManager.get().getCurrentAccess()), 
          CycAccessManager.get().getCurrentAccess().getObjectTool().makeELMt(ca.getMt())) instanceof CycAssertion) {
        throw new DeleteException("Unable to delete Assertion " + ca);
      }
    } catch (CycConnectionException ex) {
      throw new KBApiRuntimeException("Couldn't delete the fact: " + core.toString(), ex);
    } 
  }

    
  /**
   * This is not part of the KB API. Check that the candidate core
   * object is valid CycAssertion. In the CycKB the object would be
   * valid #$CycLAssertion
   * 
   * @see {@link StandardKBObject#isValidCore(CycObject)} for more comments
   */
  @Override
  protected boolean isValidCore(CycObject cycObject) {
    if (cycObject instanceof CycAssertion) {
      return true;
    } else {
      return false;
    }
  }
    
  /**
   * returns string "#$CycLAssertion"
   */
  @Override
  String getTypeString() {
    return "#$CycLAssertion";
  }
  
  
    /**
   * find or create an assertion using
   * <code>factSentence</code> in the context
   * <code>ctx</code>
   * <p>
   *
   * @param fact	the CycL sentence to be asserted
   * @param ctx		the context where the fact will be asserted
   * @param s   	the strength of the assertion if asserted
   * @param d		the strength of the assertion if asserted
   */
  // @TODO: Clarify the strength and direction if "found". See SEMAPI-43
  @SuppressWarnings("deprecation")
static CycAssertion assertSentence(FormulaSentence factSentence, Context ctx, Strength s, Direction d) {
	  try {
      CycAssertion ca = findAssertion(factSentence, ctx.asELMt());
      if (d == null || d.equals(Direction.AUTO)){
    	  d = Direction.FORWARD;
      }
      if (s == null || s.equals(Strength.AUTO)){
    	  s = Strength.DEFAULT;
      }
      if (ca == null) {
        CycAccessManager.get().getCurrentAccess().getAssertTool().assertSentence(
            factSentence.stringApiValue(), 
            CycAccessManager.get().getCurrentAccess().getObjectTool().makeELMt(ctx.getCore()),
        		":"+s.name(), ":"+d.name(), true, KBAPIConfiguration.getShouldTranscriptOperations());
        ca = findAssertion(factSentence, ctx.asELMt());
      }
      return ca;
    } catch (CycConnectionException ex) {
      throw new KBApiRuntimeException(ex.getMessage(), ex);
    } 
  }

  /**
   * find or create a fact using factStr in the context represented by ctxStr
   * <p>
   *
   * @param factStr	the CycL string of the fact to be asserted
   * @param ctxStr	the string representing the context where the fact will be
   * asserted
   * @param s   	the strength of the assertion if asserted
   * @param d		the strength of the assertion if asserted
   *
   * @throws CreateException 
   * @throws KBTypeException 
   * 
   * @TODO: Clarify the strength and direction if "found". See SEMAPI-43
   */
  static CycAssertion assertSentence(String factStr, String ctxStr, Strength s, Direction d) 
      throws KBTypeException, CreateException {
    try {
      FormulaSentence factSentence = CycFormulaSentence.makeCycSentence(factStr);
      Context ctx = ContextImpl.get(ctxStr);
      
      return assertSentence(factSentence, ctx, s, d);
    } catch (CycConnectionException exception) {
      throw new KBApiRuntimeException(exception.getMessage(), exception);
    }
  }

  //TODO preserve this and make it work
  /*
   * private CycAssertion findAssertion(Context ctx, Object...argList) throws Exception {
   * List<Object> argListArray = new ArrayList<Object> (Arrays.asList(argList));
   *
   * // TODO: handle all types of arguments in the constructAssertion
   * // It could be anything from String, or CycL in string form, or SemanticObjects
   * String factString = constructFact(argListArray);
   * String cyclifiedFactString = cyc.cyclifyString(factString);
   *
   * return findAssertion(ctx.stringApiValue(), cyclifiedFactString);
   * }
   */
  /**
   * finds an assertion with
   * <code>factSentence</code> in the context
   * <code>ctx</code>. In contrast to many other methods, this method requires
   * that the assertion be found in the specified context, not merely in some
   * context visible from the specified context.
   * <p>
   *
   * @param factSentenceStr	the CycL string of the sentence to be asserted
   * @param ctxStr	the string representing the context
   * 
   * @return the assertion, if it exists. Returns null if the assertion isn't in the KB.
   *
   */
  static CycAssertion findAssertion(String factSentenceStr, String ctxStr) {
    try {
      FormulaSentence factFormulaSentence = CycFormulaSentence.makeCycSentence(factSentenceStr);
      CycAccess cyc = CycAccessManager.get().getCurrentAccess();
      return findAssertion(factFormulaSentence, cyc.getObjectTool().makeELMt(cyc.cyclifyString(ctxStr)));
    } catch (CycApiException ex) {
      // throw new KBApiException(ex);
      return null;
    } catch (CycConnectionException ex) {
      throw new KBApiRuntimeException(ex.getMessage(), ex);
    }
  }

  /**
   * finds an assertion with
   * <code>factSentence</code> in the context
   * <code>ctx</code>. In contrast to many other methods, this method requires
   * that the assertion be found in the specified context, not merely in some
   * context visible from the specified context.
   * <p>
   *
   * 
   * @param factSentence	the CycL string of the fact to be asserted
   * @param ctx				the string representing the context
   * 
   * @return the assertion, if it exists. Returns null if the assertion isn't in the KB.
   * 
   * @TODO Major issues.
   * 1. This asks with-inference-mt-relevance : which means the returned assertions are visible in ctx
   * not necessarily asserted in ctx
   * 2. This calls find-assertion-cycl which returns some assertion if multiple assertions with the same
   * formula and same visibility are found
   * Need to decide what we want to do
   */
  static CycAssertion findAssertion(FormulaSentence factSentence, ELMt ctx) {
          String command;
      command = "(WITH-INFERENCE-MT-RELEVANCE " + ctx.stringApiValue() + " (FIND-ASSERTION-CYCL " + factSentence.stringApiValue() + " ))";

    log.fine("Find Fact: " + command);
    Object res;
    try {
      res = CycAccessManager.get().getCurrentAccess().converse().converseObject(command);
    } catch (Exception ex) {
      throw new KBApiRuntimeException(ex.getMessage(), ex);
    }
    log.fine("Fact response: " + res);
    
    if (res instanceof CycAssertion) {
      return (CycAssertion) res;
    } else if (res.equals(CycObjectFactory.nil)) {
      String msg = "Couldn't find fact: '" + factSentence + "' in Context: '" + ctx + "'";
      log.fine(msg);
      // throw new KBObjectNotFoundException(msg);
      return null;
    } else {
      throw new KBApiRuntimeException(
          "Unknown error in converseObject result parsing.");
    }
   
  }
}