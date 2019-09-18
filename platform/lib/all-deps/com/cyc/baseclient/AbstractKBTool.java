package com.cyc.baseclient;

import com.cyc.base.CommandTool;
import com.cyc.base.CycAccess;
import com.cyc.base.CycConnectionException;
import com.cyc.base.cycobject.CycObject;
import com.cyc.base.cycobject.ELMt;
import com.cyc.base.CycApiException;
import com.cyc.base.cycobject.CycList;
import com.cyc.baseclient.cycobject.CycConstant;
import com.cyc.baseclient.cycobject.CycSymbol;
import static com.cyc.baseclient.CycObjectFactory.makeCycSymbol;

/**
 *
 * @author nwinant
 */
public class AbstractKBTool {
  
  protected AbstractKBTool(CycAccess client) {
    this.client = client;
  }
  
  protected AbstractKBTool() {
    this.client = null;
  }
  
  
  // Protected
    
  protected Object[] converse_inner(Object command) throws CycConnectionException, CycApiException {
    return getCycClient().converse(command);
  }
  
  protected CycConstant find_inner(String constantName) throws CycConnectionException {
    return (CycConstant) getCyc().getLookupTool().find(constantName);
  }
  
  protected CycConstant findOrCreate_inner(String constantName) throws CycConnectionException {
    return (CycConstant) getCyc().getLookupTool().findOrCreate(constantName);
  }
  
  protected CycConstant getKnownConstantByName_inner(String name) throws CycConnectionException, CycConnectionException, CycConnectionException, CycConnectionException {
    return (CycConstant) getCyc().getLookupTool().getKnownConstantByName(name);
  } 
  
  protected CycConstant getKnownConstantByGuid_inner(String guidString) throws CycConnectionException {
    return (CycConstant) getCyc().getLookupTool().getKnownConstantByGuid(guidString);
  }
  
  protected CycConstant getConstantByName_inner(String name) throws CycConnectionException {
    return (CycConstant) getCyc().getLookupTool().getConstantByName(name);
  }
  
  public CycList<Object> makeCycList_inner(String string) throws CycApiException {
    return getCyc().getObjectTool().makeCycList(string);
  }
  protected ELMt makeELMt_inner(CycObject mt) throws CycConnectionException {
    return getCyc().getObjectTool().makeELMt(mt);
  }
  
  protected void verifyPossibleDenotationalTerm_inner(CycObject cycObject) throws IllegalArgumentException {
    getCycClient().verifyPossibleDenotationalTerm(cycObject);
  }
  
  protected static KBTransaction getCurrentTransaction() {
    return CycClient.getCurrentTransaction();
  }
  
  protected CycAccess getCyc() {
    if (client == null) {
      return CycClientManager.get().getCurrentAccess();
    }
    return this.client;
  }
  
  protected CommandTool getConverse() {
    return getCyc().converse();
  }
  
  
  // Private
  
  private CycClient getCycClient() {
    return CycClientManager.get().fromCycAccess(getCyc());
  }
  
  
  // Internal
  
  protected static final CycSymbol WITH_ALL_MTS = makeCycSymbol("with-all-mts");

  final private CycAccess client;
}
