package org.appdapter.core.remote.sparql;

import org.apache.commons.logging.LogFactory;
import org.apache.commons.lang.StringUtils;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Comparator;
import java.util.Collections;
import java.util.Iterator;
import com.hp.hpl.jena.util.iterator.WrappedIterator;
import java.util.ArrayList;
import com.hp.hpl.jena.graph.Node;
import com.hp.hpl.jena.util.iterator.ExtendedIterator;
import com.hp.hpl.jena.graph.TripleMatch;
import com.hp.hpl.jena.shared.AddDeniedException;
import com.hp.hpl.jena.graph.Triple;
import java.util.List;
import org.apache.commons.logging.Log;
import com.hp.hpl.jena.graph.impl.GraphWithPerform;

public class SparqlGraphMultilingual extends SparqlGraph implements GraphWithPerform
{
    private static final Log log;
    protected List<String> langs;
    
    public SparqlGraphMultilingual(final String endpointURI, final List<String> languages) {
        super(endpointURI);
        this.langs = languages;
    }
    
    public void add(final Triple arg0) throws AddDeniedException {
        this.performAdd(arg0);
    }
    
    public void performAdd(final Triple t) {
        super.performAdd(t);
    }
    
    public ExtendedIterator<Triple> find(final TripleMatch arg0) {
        final Triple t = arg0.asTriple();
        return this.find(t.getSubject(), t.getPredicate(), t.getObject());
    }
    
    public ExtendedIterator<Triple> find(final Node subject, final Node predicate, final Node object) {
        final long startTime = System.currentTimeMillis();
        final ExtendedIterator<Triple> rawResults = (ExtendedIterator<Triple>)super.find(subject, predicate, object);
        final long rawTime = System.currentTimeMillis() - startTime;
        final List<Triple> tripList = new ArrayList<Triple>();
        while (rawResults.hasNext()) {
            tripList.add((Triple)rawResults.next());
        }
        if (tripList.size() == 0) {
            return (ExtendedIterator<Triple>)WrappedIterator.create((Iterator)tripList.iterator());
        }
        if (subject.isConcrete() && predicate.isConcrete() && !object.isConcrete()) {
            Collections.sort(tripList, new TripleSortByLang());
            final LinkedList<Triple> tripl = new LinkedList<Triple>();
            if (!tripList.get(0).getObject().isLiteral()) {
                tripl.addAll(tripList);
            }
            else if (StringUtils.isEmpty(tripList.get(0).getObject().getLiteralLanguage())) {
                tripl.addAll(tripList);
            }
            else {
                final String lang = tripList.get(0).getObject().getLiteralLanguage();
                for (final Triple t : tripList) {
                    if (!lang.equals(t.getObject().getLiteralLanguage())) {
                        break;
                    }
                    tripl.add(t);
                }
            }
            final long filterTime = System.currentTimeMillis() - rawTime - startTime;
            if (filterTime > 1L) {
                SparqlGraphMultilingual.log.info((Object)("raw time " + rawTime + " ; filter time " + filterTime));
            }
            return (ExtendedIterator<Triple>)WrappedIterator.create((Iterator)tripl.iterator());
        }
        if (rawTime > 9L) {
            SparqlGraphMultilingual.log.info((Object)("raw time " + rawTime));
            SparqlGraphMultilingual.log.info((Object)("^ " + subject + " : " + predicate + " : " + object));
        }
        return (ExtendedIterator<Triple>)WrappedIterator.create((Iterator)tripList.iterator());
    }
    
    static {
        log = LogFactory.getLog((Class)SparqlGraphMultilingual.class);
    }
    
    private class TripleSortByLang implements Comparator<Triple>
    {
        @Override
        public int compare(final Triple t1, final Triple t2) {
            if (t1 == null || t2 == null) {
                return 0;
            }
            if (!t1.getObject().isLiteral() || !t2.getObject().isLiteral()) {
                return 0;
            }
            final String t1lang = t1.getObject().getLiteral().language();
            final String t2lang = t2.getObject().getLiteral().language();
            if (t1lang == null && t2lang == null) {
                return 0;
            }
            if (t1lang == null) {
                return 1;
            }
            if (t2lang == null) {
                return -1;
            }
            int t1langPref = SparqlGraphMultilingual.this.langs.indexOf(t1.getObject().getLiteral().language());
            if (t1langPref == -1) {
                t1langPref = Integer.MAX_VALUE;
            }
            int t2langPref = SparqlGraphMultilingual.this.langs.indexOf(t2.getObject().getLiteral().language());
            if (t2langPref == -1) {
                t2langPref = Integer.MAX_VALUE;
            }
            return t1langPref - t2langPref;
        }
    }
}

/*

	Total time: 79 ms
	
*/