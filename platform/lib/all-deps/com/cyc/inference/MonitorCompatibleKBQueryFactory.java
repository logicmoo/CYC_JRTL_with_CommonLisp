package com.cyc.inference;

/*
 * #%L
 * Query API
 * %%
 * Copyright (C) 1995 - 2014 Cycorp, Inc
 * %%
 * This software is the proprietary information of Cycorp, Inc.
 * Use is subject to license terms.
 * #L%
 */





import com.cyc.base.CycAccess;
import com.cyc.base.CycApiException;
import com.cyc.base.CycConnectionException;
import com.cyc.base.cycobject.CycList;
import com.cyc.base.cycobject.CycSymbolI;
import com.cyc.base.cycobject.DenotationalTerm;
import com.cyc.base.inference.InferenceParameters;
import com.cyc.baseclient.cycobject.CycArrayList;
import com.cyc.baseclient.cycobject.CycSymbol;
import com.cyc.baseclient.inference.KBQueryFactory;



/**
 * Factory to create inference workers for KBQs appropriate for use with inference monitor.
 * 
 * @author baxter
 */
class MonitorCompatibleKBQueryFactory extends KBQueryFactory {

  static private final MonitorCompatibleKBQueryFactory MONITOR_COMPATIBLE_INSTANCE = new MonitorCompatibleKBQueryFactory();

  static KBQueryFactory getMonitorCompatibleInstance() {
    return MONITOR_COMPATIBLE_INSTANCE;
  }

  /** Override to introduce parameter values necessary for monitoring inference progress. 
 * @throws CycConnectionException **/
  @Override
  protected InferenceParameters loadKBQProperties(CycAccess access, DenotationalTerm kbq)
          throws CycApiException, CycConnectionException {
    final InferenceParameters params = super.loadKBQProperties(access, kbq);
    CycSymbolI metrics = new CycSymbol(":METRICS");
    CycSymbolI sipd = new CycSymbol(":STEP-INDEXED-PROGRESS-DATA");
    CycList<CycSymbolI> value = new CycArrayList<CycSymbolI>(sipd);
    params.put(metrics, value);
    return params;
  }
}
