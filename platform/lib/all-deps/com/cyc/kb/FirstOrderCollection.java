package com.cyc.kb;

import java.util.Collection;

import com.cyc.kb.exception.CreateException;
import com.cyc.kb.exception.KBTypeException;

public interface FirstOrderCollection extends KBCollection {

  /**
   * {@inheritDoc}
   * 
   * The only difference is that it is know that the generalizations of <code>FirstOrderCollection</code>
   * is a collection of <code>FirstOrderCollection</code> s
   */
  public Collection<FirstOrderCollection> getGeneralizations();

  /**
   * {@inheritDoc}
   * 
   * The only difference is that it is know that the generalizations of <code>FirstOrderCollection</code>
   * is a collection of <code>FirstOrderCollection</code> s
   */
  public Collection<FirstOrderCollection> getGeneralizations(String ctxStr);

  /**
   * {@inheritDoc}
   */
  public FirstOrderCollection addGeneralization(String moreGeneralStr,
      String ctxStr) throws KBTypeException, CreateException;

  /**
   * {@inheritDoc}
   */
  public FirstOrderCollection addGeneralization(KBCollection moreGeneral,
      Context ctx) throws KBTypeException, CreateException;

}