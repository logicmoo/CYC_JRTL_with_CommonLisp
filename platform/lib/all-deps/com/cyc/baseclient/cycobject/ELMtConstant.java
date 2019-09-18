package com.cyc.baseclient.cycobject;

import com.cyc.base.cycobject.CycConstantI;
import com.cyc.base.cycobject.ELMt;
import com.cyc.baseclient.CycObjectFactory;

/**
 * Provides the container for the ELMt CycConstant (Epistemlogical Level Microtheory
 * Constant).<p>
 *
 * @version $Id: ELMtConstant.java 150783 2014-04-26 00:53:01Z nwinant $
 * @author Tony Brusseau
 */
public class ELMtConstant extends CycConstant implements ELMt {
  
  static final long serialVersionUID = -2405506745680227189L;
  
  /** Privately creates a new instance of ELMtConstant 
   * deprecated
   */
  private ELMtConstant(CycConstantI cycConstant) {
    super(cycConstant.getName(), cycConstant.getGuid());
  }
    
  /**
   * Returns a new ELMtConstant given a CycConstant.  Note, use the
 factory method in the CycClient to create these.
   */
  public static ELMtConstant makeELMtConstant(CycConstantI cycConstant) {
    CycObjectFactory.removeCaches(cycConstant);
    ELMtConstant elmtConstant = new ELMtConstant(cycConstant);
    CycObjectFactory.addCycConstantCache(cycConstant);
    return elmtConstant;
  }
}
