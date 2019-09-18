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

import com.cyc.baseclient.xml.CycJAXBMarshaller;
import com.cyc.xml.QueryResult;

import javax.xml.bind.JAXBException;

/**
 * A class for marshalling query results to XML.
 * Uses the XML format in {@link com.cyc.xml.QueryResult}.
 * @author baxter
 */
public class QueryResultMarshaller extends CycJAXBMarshaller<QueryResult> {

    public QueryResultMarshaller() throws JAXBException {
        super(QueryResult.class);
    }
    
}
