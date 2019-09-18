package com.cyc.baseclient.cycobject;

import com.cyc.base.cycobject.Nart;
import com.cyc.base.cycobject.ELMt;
import com.cyc.baseclient.CycObjectFactory;

/**
 * Provides the container for the ELMt NART (Epistemlogical Level Microtheory
 * Non Atomic Reified Term).<p>
 *
 * @version $Id: ELMtNart.java 150787 2014-04-26 01:55:03Z nwinant $
 * @author Tony Brusseau
 */
public class ELMtNart extends CycNart implements ELMt {
  
  /** Creates a new instance of ELMtNart */
  private ELMtNart(Nart nart) {
    super(nart.toCycList());
  }
  
  /**
   * Returns a new ELMtNart given a CycNart.  Note, use the
   * factory method in the CycAccess to create these.
   */
  public static ELMtNart makeELMtNart(Nart nart) {
    return new ELMtNart(nart);
  }
}
