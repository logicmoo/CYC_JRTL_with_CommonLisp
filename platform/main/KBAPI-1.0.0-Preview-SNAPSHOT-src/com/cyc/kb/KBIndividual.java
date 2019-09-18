package com.cyc.kb;

import java.util.Collection;

import com.cyc.kb.config.KBAPIDefaultContext;

public interface KBIndividual extends KBTerm {

  /**
   * finds the types this KBIndividual is asserted to be an instance of, from
   * the default context specified by {@link KBAPIDefaultContext#forQuery()}. Essentially, 
   * this returns the asserted bindings for
   * <code>?X</code> from
   * <code>(#$isa this ?X)</code>.
   *
   * @return	the <code>KBCollection</code>s this <code>KBIndividual</code>
   * belongs to
   */
  public Collection<KBCollection> instanceOf();

  /**
   * finds the types this KBIndividual is an instance of to, from a context.
   * Essentially, this returns the asserted bindings for
   * <code>?X</code> from
   * <code>(#$isa this ?X)</code>.
   *
   * @param ctxStr	the string representing the context 
   *
   * @return	the <code>KBCollection</code>s this <code>KBIndividual</code> belongs
   * to
   */
  public Collection<KBCollection> instanceOf(String ctxStr);

}