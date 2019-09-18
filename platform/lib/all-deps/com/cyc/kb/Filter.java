package com.cyc.kb;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

import org.opencyc.api.CycAccess;
import org.opencyc.api.CycApiException;
import org.opencyc.api.CycObjectFactory;
import org.opencyc.cycobject.CycList;
import org.opencyc.cycobject.CycObject;
import org.opencyc.cycobject.CycSymbol;

/**
 * @todo DaveS review documentation
 * @author Vijay Raj
 */
public class Filter {

    protected CycAccess cyc;
    static final Logger log = Logger.getLogger(Filter.class.getName());
    private List<List<KBObject>> results = new ArrayList<List<KBObject>>();

    /**
     * gets a connection to implementation-specific KB
     * <p>
     *
     * @throws UnknownHostException
     * @throws CycApiException
     * @throws IOException
     */
    public Filter() throws Exception {
        cyc = CycAccess.getCurrent();
        if (cyc == null) {
            CycAccess.setCurrent(org.opencyc.api.CycConnection.DEFAULT_HOSTNAME, org.opencyc.api.CycConnection.DEFAULT_BASE_PORT);
        }
    }

    public Filter(String searchStr, String specFilterStr) throws Exception {
        this();
        results.add(searchSpecsOf(searchStr, specFilterStr));
    }

    public Filter(List<String> searchStrs, String specFilterStr) throws Exception {
        this();
        KBCollection specFilter = new KBCollection(specFilterStr);
        for (String str : searchStrs) {
            results.add(searchSpecsOf(str, specFilter));
        }
    }

    public Filter(List<String> searchStrs, List<KBCollection> specFilters) throws Exception {
        this();
        for (String str : searchStrs) {
            results.add(searchSpecsOf(str, specFilters));
        }
    }

    public List<KBObject> searchSpecsOf(String searchStr, List<KBCollection> specFilters)
            throws UnknownHostException, IOException, Exception {

        Set<KBObject> cl = new HashSet<KBObject>();
        for (KBCollection filter : specFilters) {
            cl.addAll(searchSpecsOf(searchStr, filter));
        }

        return new ArrayList<KBObject>(cl);
    }

    public List<KBObject> searchSpecsOf(String searchStr, String specFilterStr)
            throws UnknownHostException, IOException, Exception {
        KBCollection specFilter = new KBCollection(specFilterStr);
        return searchSpecsOf(searchStr, specFilter);
    }

    public List<KBObject> searchSpecsOf(String searchStr, KBCollection specFilter)
            throws UnknownHostException, IOException, Exception {

        String command = "(typed-denots-of-string \"" + searchStr + "\" '(#$SpecsFn " + specFilter.stringApiValue() + "))";

        log.fine("Command: " + command);
        Object res = cyc.converseObject(command);
        log.fine("Response: " + res);

        List<KBObject> concepts = new ArrayList<KBObject>();
        if (!CycObjectFactory.nil.equals(res)) {
            @SuppressWarnings("unchecked")
            CycList<CycObject> resList = (CycList<CycObject>) res;
            for (Object o : resList) {
                if (o instanceof CycObject) {
                    concepts.add(new KBObject((CycObject) o));
                }
            }
        }

        return concepts;
    }

    public List<KBObject> searchInstancesOf(String searchStr, List<KBCollection> instanceFilters) throws Exception {
        Set<KBObject> cl = new HashSet<KBObject>();
        for (KBCollection filter : instanceFilters) {
            cl.addAll(searchInstancesOf(searchStr, filter));
        }
        return new ArrayList<KBObject>(cl);
    }

    public List<KBObject> searchInstancesOf(String searchStr, KBCollection instanceFilter)
            throws UnknownHostException, IOException, Exception {

        String command = "(typed-denots-of-string \"" + searchStr + "\" " + instanceFilter.stringApiValue() + ")";

        log.fine("Command: " + command);
        Object res = cyc.converseObject(command);
        log.fine("Response: " + res);

        List<KBObject> concepts = new ArrayList<KBObject>();
        if (!CycObjectFactory.nil.equals(res)) {
            @SuppressWarnings("unchecked")
            CycList<CycObject> resList = (CycList<CycObject>) res;
            for (Object o : resList) {
                if (o instanceof CycObject) {
                    concepts.add(new KBObject((CycObject) o));
                }
            }
        }

        return concepts;
    }

    public List<KBObject> slurpDbpedia(String searchStr)
            throws UnknownHostException, IOException, Exception {

        String command = "(slurp-dbpedia-term-from-string \"" + searchStr + "\")";

        log.fine("Command: " + command);
        Object res = cyc.converseObject(command);
        log.fine("Response: " + res);


        List<KBObject> concepts = new ArrayList<KBObject>();
        if (!CycObjectFactory.nil.equals(res) && !(res instanceof CycSymbol)) {
            @SuppressWarnings("unchecked")
            CycList<CycObject> resList = (CycList<CycObject>) res;
            for (Object o : resList) {
                if (o instanceof CycObject) {
                    concepts.add(new KBObject((CycObject) o));
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
    public List<List<KBObject>> getResults() {
        return results;
    }
}
