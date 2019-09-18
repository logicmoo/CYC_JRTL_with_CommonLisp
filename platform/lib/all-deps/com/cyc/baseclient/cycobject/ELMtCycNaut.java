package com.cyc.baseclient.cycobject;

import com.cyc.base.cycobject.ELMt;
import java.util.List;

/**
 * Provides the container for the ELMt NAUT (Epistemlogical Level Microtheory
 * Non Atomic Un-reified Term).<p>
 *
 * @version $Id: ELMtCycNaut.java 150787 2014-04-26 01:55:03Z nwinant $
 * @author Tony Brusseau
 */

public class ELMtCycNaut extends CycNaut implements ELMt {
  
  /** Creates a new instance of ELMtCycNaut */
  private ELMtCycNaut(List terms) {
    super(terms);
  }
  
  /**
   * Returns a new ELMtCycNaut.  Note, use the
   * factory method in the CycAccess to create these.
   */
  public static ELMtCycNaut makeELMtCycNaut(List terms) {
    return new ELMtCycNaut(terms);
  }
  /**
   * Returns this object in a form suitable for use as an <tt>String</tt> api expression value.
   *
   * @return this object in a form suitable for use as an <tt>String</tt> api expression value
   */
  //@ToDo uncomment this when (list* issues has been resolved in cyclify() of CycList
  /*public String stringApiValue() {
    return "'" + super.stringApiValue();
  }*/

}
