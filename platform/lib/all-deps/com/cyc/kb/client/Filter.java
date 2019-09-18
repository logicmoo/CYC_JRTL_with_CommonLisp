package com.cyc.kb.client;

/*
 * #%L
 * KBAPI
 * %%
 * Copyright (C) 1995 - 2014 Cycorp, Inc
 * %%
 * This software is the proprietary information of Cycorp, Inc.
 * Use is subject to license terms.
 * #L%
 */

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

import com.cyc.base.CycAccess;
import com.cyc.base.CycAccessManager;
import com.cyc.base.cycobject.CycList;
import com.cyc.base.cycobject.CycObject;
import com.cyc.base.cycobject.CycSymbolI;
import com.cyc.baseclient.CycObjectFactory;
import com.cyc.baseclient.api.CycConnection;
import com.cyc.baseclient.cycobject.CycArrayList;


/**
 * @author Vijay Raj
 * @version $Id: Filter.java 151340 2014-05-19 15:55:29Z vijay $
 * @since 1.0
 */
// @todo DaveS review documentation
public class Filter {

    protected CycAccess cyc;
    static final Logger log = Logger.getLogger(Filter.class.getName());
    private List<List<KBObjectImpl>> results = new ArrayList<List<KBObjectImpl>>();

    /**
     * gets a connection to implementation-specific KB
     * <p>
     *
     * @throws UnknownHostException
     * @throws CycApiException
     * @throws IOException
     */
    public Filter() throws Exception {
        cyc = CycAccessManager.get().getCurrentAccess();
        if (cyc == null) {
            CycAccessManager.get().setCurrentAccess(CycConnection.DEFAULT_HOSTNAME, CycConnection.DEFAULT_BASE_PORT);
        }
    }

    public Filter(String searchStr, String specFilterStr) throws Exception {
        this();
        results.add(searchSpecsOf(searchStr, specFilterStr));
    }

    public Filter(List<String> searchStrs, String specFilterStr) throws Exception {
        this();
        KBCollectionImpl specFilter = new KBCollectionImpl(specFilterStr);
        for (String str : searchStrs) {
            results.add(searchSpecsOf(str, specFilter));
        }
    }

    public Filter(List<String> searchStrs, List<KBCollectionImpl> specFilters) throws Exception {
        this();
        for (String str : searchStrs) {
            results.add(searchSpecsOf(str, specFilters));
        }
    }

    public List<KBObjectImpl> searchSpecsOf(String searchStr, List<KBCollectionImpl> specFilters)
            throws UnknownHostException, IOException, Exception {

        Set<KBObjectImpl> cl = new HashSet<KBObjectImpl>();
        for (KBCollectionImpl filter : specFilters) {
            cl.addAll(searchSpecsOf(searchStr, filter));
        }

        return new ArrayList<KBObjectImpl>(cl);
    }

    public List<KBObjectImpl> searchSpecsOf(String searchStr, String specFilterStr)
            throws UnknownHostException, IOException, Exception {
        KBCollectionImpl specFilter = new KBCollectionImpl(specFilterStr);
        return searchSpecsOf(searchStr, specFilter);
    }

    @SuppressWarnings("deprecation")
	public List<KBObjectImpl> searchSpecsOf(String searchStr, KBCollectionImpl specFilter)
            throws UnknownHostException, IOException, Exception {

        String command = "(typed-denots-of-string \"" + searchStr + "\" '(#$SpecsFn " + specFilter.stringApiValue() + "))";

        log.fine("Command: " + command);
        Object res = cyc.converse().converseObject(command);
        log.fine("Response: " + res);

        List<KBObjectImpl> concepts = new ArrayList<KBObjectImpl>();
        if (!CycObjectFactory.nil.equals(res)) {
            @SuppressWarnings("unchecked")
            CycList<CycObject> resList = (CycArrayList<CycObject>) res;
            for (Object o : resList) {
                if (o instanceof CycObject) {
                    concepts.add(new KBObjectImpl((CycObject) o));
                }
            }
        }

        return concepts;
    }

    public List<KBObjectImpl> searchInstancesOf(String searchStr, List<KBCollectionImpl> instanceFilters) throws Exception {
        Set<KBObjectImpl> cl = new HashSet<KBObjectImpl>();
        for (KBCollectionImpl filter : instanceFilters) {
            cl.addAll(searchInstancesOf(searchStr, filter));
        }
        return new ArrayList<KBObjectImpl>(cl);
    }

    @SuppressWarnings("deprecation")
	public List<KBObjectImpl> searchInstancesOf(String searchStr, KBCollectionImpl instanceFilter)
            throws UnknownHostException, IOException, Exception {

        String command = "(typed-denots-of-string \"" + searchStr + "\" " + instanceFilter.stringApiValue() + ")";

        log.fine("Command: " + command);
        Object res = cyc.converse().converseObject(command);
        log.fine("Response: " + res);

        List<KBObjectImpl> concepts = new ArrayList<KBObjectImpl>();
        if (!CycObjectFactory.nil.equals(res)) {
            @SuppressWarnings("unchecked")
            CycList<CycObject> resList = (CycList<CycObject>) res;
            for (Object o : resList) {
                if (o instanceof CycObject) {
                    concepts.add(new KBObjectImpl((CycObject) o));
                }
            }
        }

        return concepts;
    }

    @SuppressWarnings("deprecation")
	public List<KBObjectImpl> slurpDbpedia(String searchStr)
            throws UnknownHostException, IOException, Exception {

        String command = "(slurp-dbpedia-term-from-string \"" + searchStr + "\")";

        log.fine("Command: " + command);
        Object res = cyc.converse().converseObject(command);
        log.fine("Response: " + res);


        List<KBObjectImpl> concepts = new ArrayList<KBObjectImpl>();
        if (!CycObjectFactory.nil.equals(res) && !(res instanceof CycSymbolI)) {
            @SuppressWarnings("unchecked")
            CycList<CycObject> resList = (CycList<CycObject>) res;
            for (Object o : resList) {
                if (o instanceof CycObject) {
                    concepts.add(new KBObjectImpl((CycObject) o));
                }
            }
        }
        return concepts;
    }

    /*
     (define-external get-constrained-cycl-for-string (str
     constraining-collection
     domain-mt
     &optional
     (generation-mt *pph-language-mt*)
     (parsing-mt #$EnglishMt)
     (quietly-create-unknown-getInstances t)
     (force-creation-of-unknown-getInstances nil)
     (possibly-strip-extraneous-punctuation? t)
     (force :none)
     (nl-preds (list #$nonPlural-Generic))
     (sentence nil)
     (arg-pos nil)
     (string-match-options
     '(:case-insensitive :true
     :regular-expressions :false))
     (instance-limit 10))

     or

     (ps-get-cycls-for-phrase "str")
     */
    public List<List<KBObjectImpl>> getResults() {
        return results;
    }
}
