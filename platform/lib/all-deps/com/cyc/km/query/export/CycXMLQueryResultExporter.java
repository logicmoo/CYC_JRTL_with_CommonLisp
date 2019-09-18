/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cyc.km.query.export;

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

import com.cyc.base.CycAccessManager;
import com.cyc.base.inference.InferenceIdentifier;
import com.cyc.baseclient.api.SubLAPIHelper;
import com.cyc.baseclient.export.ExportException;
import com.cyc.baseclient.export.PrintStreamExporter;
import com.cyc.kb.Query;

import java.io.PrintStream;


//import org.opencyc.api.CycAccess;
//import org.opencyc.api.SubLAPIHelper;
//import org.opencyc.export.ExportException;
//import org.opencyc.export.PrintStreamExporter;
//import org.opencyc.inference.InferenceIdentifier;

/**
 * Exports the results of a query in XML to the specified string builder.
 * Delegates the XML generation to Cyc.
 */
class CycXMLQueryResultExporter extends PrintStreamExporter<Query> {

  CycXMLQueryResultExporter() {
    super();
  }

  CycXMLQueryResultExporter(PrintStream printStream) {
    super(printStream);
  }

  @Override
  protected void doExport() throws ExportException {
    final Query query = object;
    try {
    final InferenceIdentifier inferenceIdentifier = query.getInferenceIdentifier();
    final String command = SubLAPIHelper.makeSubLStmt("get-suggested-query-results-in-xml",
            inferenceIdentifier.getProblemStoreID(),
            inferenceIdentifier.getInferenceID());
      append(CycAccessManager.get().getCurrentAccess().converse().converseString(command));
    } catch (Exception ex) {
      throw new ExportException("Got exception exporting results for " + query,
              ex);
    }
  }
  
}
