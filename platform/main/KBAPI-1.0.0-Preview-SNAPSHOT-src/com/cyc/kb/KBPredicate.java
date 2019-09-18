package com.cyc.kb;

import java.util.Collection;

import com.cyc.kb.config.KBAPIDefaultContext;
import com.cyc.kb.exception.CreateException;
import com.cyc.kb.exception.KBApiException;
import com.cyc.kb.exception.KBTypeException;

public interface KBPredicate extends Relation {

  /**
   * finds the asserted specializations of
   * <code>this</code> <code>Predicate</code>, from the default context specified by
   * {@link KBAPIDefaultContext#forQuery()}.
   *
   * @return the <code>KBPredicate</code>s that are specialization of 
   * <code>this</code> <code>KBPredicate</code>
   */
  public java.util.Collection<KBPredicate> getSpecializations();

  /**
   * finds the asserted specializations of
   * <code>this</code> <code>KBPredicate</code>, from the context <code>ctx</code>.
   *
   * @param ctxStr the string representing the context of query
   *
   * @return the <code>KBPredicate</code>s that are specializations of 
   * <code>this</code> <code>KBPredicate</code>
   */
  public java.util.Collection<KBPredicate> getSpecializations(String ctxStr);

  /**
   * finds the asserted specializations of <code>this</code> <code>KBPredicate</code>, 
   * from the context <code>ctx</code>
   *
   * @param ctx the context of query
   *
   * @return the <code>KBPredicate</code>s that are specializations of 
   * <code>this</code> <code>KBPredicate</code>
   */
  public java.util.Collection<KBPredicate> getSpecializations(
      Context ctx);

  /**
   * creates a new
   * <code>Fact</code> stating that
   * <code>this</code> is a more specific predicate than
   * <code>moreSpecific</code> in the specified context. Essentially, it asserts
   * <code>(#$genlPreds moreSpecific this)</code>
   * <p>
   * genlPreds relates a predicate to its generalization. Any sentence that
   * is true with a given predicate in argument position zero, is also true
   * with the predicate replaced by its generalization.
   *
   * @param moreSpecificStr the string representing the specialization (predicate)
   * of this KBPredicate
   * @param ctxStr  the string representing the context where the fact is asserted
   * 
   * @return this
   * 
   * @throws CreateException 
   * @throws KBTypeException 
   */
  public KBPredicate addSpecialization(String moreSpecificStr, String ctxStr)
      throws KBTypeException, CreateException;

  /**
   * creates a new
   * <code>Fact</code> stating that
   * <code>this</code> is a more specific predicate than
   * <code>moreSpecific</code> in the specified context. Essentially, it asserts
   * <code>(#$genlPreds moreSpecific this)</code>
   * <p>
   * genlPreds relates a predicate to its generalization. Any sentence that
   * is true with a given predicate in argument position zero, is also true
   * with the predicate replaced by its generalization.
   *
   * @param ctx the context where the fact is asserted
   * @param moreSpecific	the specialization (predicate) of this KBPredicate
   *
   * @return this
   * 
   * @throws CreateException 
   * @throws KBTypeException 
   */
  public KBPredicate addSpecialization(KBPredicate moreSpecific,
      Context ctx) throws KBTypeException, CreateException;

  /**
   * finds the asserted generalizations of
   * <code>this</code>, from the default context specified by
   * {@link KBAPIDefaultContext#forQuery()}
   *
   * @return the <code>KBPredicate</code>s that are generalizations of
   * this <code>KBPredicate</code>
   */
  public Collection<KBPredicate> getGeneralizations() throws KBApiException;

  /**
   * finds the asserted generalizations of
   * <code>this</code>, from a context <code>ctx</code>.
   *
   * @param ctxStr the string representing the context
   *
   * @return the <code>KBPredicate</code>s that are generalizations of 
   * this <code>KBPredicate</code>
   */
  public Collection<KBPredicate> getGeneralizations(String ctxStr);

  /**
   * finds the asserted generalizations of
   * <code>this</code>, from the context <code>ctx</code>.
   *
   * @param ctxStr the string representing the context
   *
   * @return the <code>KBPredicate</code>s that are generalizations of 
   * this <code>KBPredicate</code>
   */
  public Collection<KBPredicate> getGeneralizations(Context ctx);

  /**
   *  creates a new
   * <code>Fact</code> stating that
   * <code>moreGeneral</code> is a more general predicate than
   * <code>this</code> in the context <code>ctx</code>. Essentially, this asserts
   * <code>(genlPreds this moreGeneral)</code>
   * <p>
   * genlPreds relates a predicate to its generalization. Any sentence that
   * is true with a given predicate in argument position zero, is also true
   * with the predicate replaced by its generalization.
   * 
   * @param moreGeneralStr  the string representing the <code>KBPredicate</code> that
   * is to become more general than this <code>KBPredicate</code>
   * @param ctxStr  the string representing the context where the fact is asserted
   * 
   * @return this
   * 
   * @throws CreateException 
   * @throws KBTypeException 
   */
  public KBPredicate addGeneralization(String moreGeneralStr, String ctxStr)
      throws KBTypeException, CreateException;

  /**
   * creates a new
   * <code>Fact</code> stating that
   * <code>moreGeneral</code> is a more general predicate than
   * <code>this</code> in the context. Essentially, this asserts
   * <code>(genlPreds this moreGeneral)</code>
   * <p>
   *
   * @param moreGeneral the <code>KBPredicate</code> that is to become more
   * general than this
   * @param ctx the context where the fact is asserted
   *
   * @return this
   * 
   * @throws CreateException 
   * @throws KBTypeException 
   */
  public KBPredicate addGeneralization(KBPredicate moreGeneral,
      Context ctx) throws KBTypeException, CreateException;

  /**
   * Determine whether
   * <code>this</code> is a generalization of
   * <code>moreSpecific</code> in the context <code>ctx</code>. Essentially, this amounts to
   * determining whether
   * <code>(#$genlPreds moreSpecific this)</code> is true. Note that
   * <code>(#$genlPreds moreSpecific this)</code> need not be asserted to be true.
   *
   * @param moreSpecific the possibly more specific predicate
   * @param ctx the context of query
   * 
   * @return
   * 
   */
  public boolean isGeneralizationOf(KBPredicate moreSpecific,
      Context ctx);

}