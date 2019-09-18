package com.cyc.kb;

import java.util.Collection;

import com.cyc.base.cycobject.ELMt;
import com.cyc.baseclient.datatype.TimeInterval;
import com.cyc.kb.exception.CreateException;
import com.cyc.kb.exception.KBApiException;
import com.cyc.kb.exception.KBTypeException;

public interface Context extends KBIndividual {

  /**
   * finds the contexts that are asserted to extend this context. Effectively,
   * this returns the asserted bindings for
   * <code>?CONTEXT</code> from
   * <code>(#$genlMt ?CONTEXT this)</code>
   *
   * @return  the contexts that are extensions of this context (i.e. the 
   * specializations of this context)
   */
  public Collection<Context> getExtensions();

  /**
   * creates a new <code>Fact</code> stating that the <code>#$Microtheory</code> 
   * represented by moreSpecificStr is a specialization (an extension)
   * of this context. 
   * Essentially, this asserts <code>(#$genlMt moreSpecific this)</code>
   * <p>
   * The <code>moreSpecific</code> context has access to all knowledge (assertions) asserted in
   * <code>this</code> context.
   * <p>
   * The new fact is added in #$BaseKB. 
   * 
   *  
   * @param moreSpecificStr the string representing the new extension of this
   * context
   *
   * @return	this
   * 
   * @throws CreateException 
   * @throws KBTypeException 
   */
  public Context addExtension(String moreSpecificStr)
      throws KBTypeException, CreateException;

  /**
   * creates a new
   * <code>Fact</code> stating that the
   * <code>#$Microtheory</code> represented by
   * <code>moreSpecific</code> is a specialization (i.e. an extension) of this
   * context. Essentially, this asserts
   * <code>(#$genlMt moreSpecific this)</code>
   * <p>
   * The <code>moreSpecific</code> context has access to all knowledge (assertions) asserted in
   * <code>this</code> context.
   * <p>
   * The new fact is added in #$BaseKB
   * 
   * @param moreSpecific	the new extension of this context
   *
   * @return	this
   * 
   * @throws CreateException 
   * @throws KBTypeException 
   */
  public Context addExtension(Context moreSpecific)
      throws KBTypeException, CreateException;

  /**
   * finds the contexts that this context is asserted to inherit from.
   * Effectively, this returns all asserted values for ?CONTEXT from
   * <code>(#$genlMt this ?CONTEXT)</code>
   *
   * @return	the contexts that this context inherits from (i.e. those
   * that are generalizations of this context)
   */
  public Collection<Context> getInheritsFrom();

  /**
   * creates a new Fact stating that this context inherits from
   * <code>moreGeneral</code>. Effectively, this asserts
   * <code>(#$genlMt this moreGeneral)</code>
   * <p>
   * The <code>this</code> context has access to all knowledge (assertions) asserted in
   * <code>moreGeneral</code> context.
   * <p>
   * The new fact is added in #$BaseKB
   *  
   * @param moreGeneralStr	the string representing the generalized (context) of
   * this context
   *
   * @return	this
   * 
   * @throws CreateException 
   * @throws KBTypeException 
   */
  public Context addInheritsFrom(String moreGeneralStr)
      throws KBTypeException, CreateException;

  /**
   * creates a new Fact stating that this context inherits from
   * <code>moreGeneral</code>. Effectively, this asserts
   * <code>(#$genlMt this moreGeneral)</code>
   * <p>
   * The <code>this</code> context has access to all knowledge (assertions) asserted in
   * <code>moreGeneral</code> context.
   * <p>
   * The new fact is added in #$BaseKB
   * 
   * @param moreGeneral	the generalized (context) of this context
   *
   * @return	this
   * 
   * @throws CreateException 
   * @throws KBTypeException 
   */
  public Context addInheritsFrom(Context moreGeneral)
      throws KBTypeException, CreateException;

  /**
   * Returns the monad of this context.
   * 
   * A context monad specifies the "dimension" of the Context. The monad of the Context
   * is the base context without additional context dimensional constraints. 
   * 
   * The TimeInterval is one of the main context constraints supported. 
   * 
   * See #$mtMonad for more details
   *
   * @return the monad of this context.
   */
  public Context getMonad() throws KBApiException;

  /**
   * Gets the time interval of this context.
   * 
   * The time interval during which the assertions in the context are true
   * unless specified otherwise.
   *
   * @return the time interval of this context.
   */
  public TimeInterval getTimeInterval() throws KBApiException;

  /**
   * Returns this context as an
   * <code>ELMt</code>.
   *
   * @return this context as an ELMt
   */
  public ELMt asELMt();

}