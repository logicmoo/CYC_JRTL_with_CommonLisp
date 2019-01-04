package org.appdapter.core.store.dataset;

import java.util.Collections;
import java.util.List;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Map;
import com.hp.hpl.jena.graph.TransactionHandler;
import com.hp.hpl.jena.graph.GraphStatisticsHandler;
import com.hp.hpl.jena.graph.GraphEventManager;
import com.hp.hpl.jena.graph.Capabilities;
import com.hp.hpl.jena.graph.BulkUpdateHandler;
import com.hp.hpl.jena.graph.TripleMatch;
import com.hp.hpl.jena.util.iterator.ExtendedIterator;
import com.hp.hpl.jena.shared.DeleteDeniedException;
import com.hp.hpl.jena.graph.Node;
import com.hp.hpl.jena.shared.AddDeniedException;
import com.hp.hpl.jena.graph.Triple;
import org.appdapter.core.log.Debuggable;
import com.hp.hpl.jena.shared.PrefixMapping;
import com.hp.hpl.jena.graph.Graph;

public class CheckedGraph implements Graph, PrefixMapping
{
    final Graph modelGraph;
    public boolean noAdd;
    public boolean noDelete;
    public boolean nameSpaceChecked;
    private PrefixMapping prefixMap;
    public String debuggingName;

    public void setName(final String n) {
        this.debuggingName = n;
    }

    public Graph getDataGraph() {
        return this.modelGraph;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append(this.noAdd ? "-" : "+").append("A");
        sb.append(this.noDelete ? "-" : "+").append("R");
        sb.append(this.nameSpaceChecked ? "-" : "+").append("N");
        sb.append("=" + this.debuggingName);
        return sb.append(this.modelGraph.toString()).toString();
    }

    public CheckedGraph(final Graph modelGraph, final boolean makeNonAdd, final boolean makeNonDelete, final boolean makeNameSpaceChecked) {
        this.noAdd = false;
        this.noDelete = false;
        this.nameSpaceChecked = false;
        this.modelGraph = modelGraph;
        if (modelGraph instanceof CheckedGraph) {
            Debuggable.notImplemented(new Object[] { "Wrapping " + modelGraph });
        }
        this.prefixMap = modelGraph.getPrefixMapping();
        this.noAdd = makeNonAdd;
        this.noDelete = makeNonDelete;
        this.nameSpaceChecked = makeNameSpaceChecked;
    }

    public void add(final Triple t) throws AddDeniedException {
        this.checkAdd();
        final Triple t2 = this.visitURIs(t);
        this.modelGraph.add(t2);
    }

    public Triple visitURIs(final Triple t) {
        this.visitURIs(t.getSubject());
        this.visitURIs(t.getPredicate());
        this.visitURIs(t.getObject());
        return t;
    }

    private void visitURIs(final Node subject) {
        if (subject.isURI()) {
            RepoDatasetFactory.verifyURI(subject.toString());
        }
    }

    private void checkRemove() throws DeleteDeniedException {
        if (!this.noDelete) {
            return;
        }
        final DeleteDeniedException ex = new DeleteDeniedException("" + Debuggable.notImplemented(new Object[] { "cehckRemove=", this }));
        ex.printStackTrace();
        throw ex;
    }

    private void checkAdd() throws AddDeniedException {
        if (!this.noAdd) {
            return;
        }
        final AddDeniedException ex = new AddDeniedException("" + Debuggable.notImplemented(new Object[] { "AddDeniedException=", this }));
        ex.printStackTrace();
        throw ex;
    }

    public void clear() {
        this.checkRemove();
        this.modelGraph.clear();
    }

    public void close() {
        this.modelGraph.close();
    }

    public boolean contains(final Node s, final Node p, final Node o) {
        return this.modelGraph.contains(s, p, o);
    }

    public boolean contains(final Triple t) {
        return this.modelGraph.contains(t);
    }

    public void delete(final Triple t) throws DeleteDeniedException {
        this.checkRemove();
        this.modelGraph.delete(t);
    }

    public boolean dependsOn(final Graph g) {
        return this.modelGraph.dependsOn(g);
    }

    public ExtendedIterator<Triple> find(final Node s, final Node p, final Node o) {
        return (ExtendedIterator<Triple>)this.modelGraph.find(s, p, o);
    }

    public ExtendedIterator<Triple> find(final TripleMatch m) {
        return (ExtendedIterator<Triple>)this.modelGraph.find(m);
    }

    @Deprecated
    public BulkUpdateHandler getBulkUpdateHandler() {
        return this.modelGraph.getBulkUpdateHandler();
    }

    public Capabilities getCapabilities() {
        return this.modelGraph.getCapabilities();
    }

    public GraphEventManager getEventManager() {
        return this.modelGraph.getEventManager();
    }

    public PrefixMapping getPrefixMapping() {
        return (PrefixMapping)this;
    }

    public GraphStatisticsHandler getStatisticsHandler() {
        return this.modelGraph.getStatisticsHandler();
    }

    public TransactionHandler getTransactionHandler() {
        return this.modelGraph.getTransactionHandler();
    }

    public boolean isClosed() {
        return this.modelGraph.isClosed();
    }

    public boolean isEmpty() {
        return this.modelGraph.isEmpty();
    }

    public boolean isIsomorphicWith(final Graph n) {
        return this.modelGraph.isIsomorphicWith(n);
    }

    public void remove(final Node s, final Node p, final Node o) {
        if (s == null) {
            this.checkRemove();
        }
        else {
            this.checkRemove();
        }
        this.modelGraph.remove(s, p, o);
    }

    public int size() {
        return this.modelGraph.size();
    }

    public void setNoDelete(final boolean b) {
        this.noDelete = b;
    }

    public void setReadOnly(final boolean b) {
        this.noDelete = b;
        this.noAdd = b;
    }

    public void checkPrefixChanged(final String prevURI, final String uri) {
        if (prevURI != null && !prevURI.equals(uri)) {
            Debuggable.notImplemented(new Object[] { "Prefix change: " + prevURI + " -> " + uri });
        }
    }

    public void checkPrefix(final String prefix) {
        if (prefix == null || prefix.equals("")) {
            throw new UnsupportedOperationException("Bad Prefix: " + prefix);
        }
        if (prefix.equals("cc")) {
            return;
        }
    }

    public PrefixMapping setNsPrefix(final String prefix, final String uri) {
        this.checkPrefix(prefix);
        final String prevURI = this.prefixMap.getNsPrefixURI(prefix);
        final String prevPrefix = this.prefixMap.getNsURIPrefix(uri);
        this.checkPrefixChanged(prevURI, uri);
        this.checkPrefixChanged(prevPrefix, prefix);
        this.prefixMap.setNsPrefix(prefix, uri);
        return (PrefixMapping)this;
    }

    public PrefixMapping removeNsPrefix(final String prefix) {
        this.prefixMap.removeNsPrefix(prefix);
        return (PrefixMapping)this;
    }

    public PrefixMapping setNsPrefixes(final PrefixMapping other) {
        return this.setNsPrefixes(other.getNsPrefixMap());
    }

    public PrefixMapping setNsPrefixes(final Map<String, String> map) {
        final Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        final List<String> removedPrefixes = new ArrayList<String>(this.getNsPrefixMap().keySet());
        while (it.hasNext()) {
            final Map.Entry<String, String> e = it.next();
            final String prefix = e.getKey();
            final String uri = e.getValue();
            removedPrefixes.remove(prefix);
            this.setNsPrefix(prefix, uri);
        }
        if (removedPrefixes.size() > 0) {
            final StringBuffer sb = new StringBuffer("Removed " + removedPrefixes.size() + " prefix(s):");
            for (final String prefix2 : removedPrefixes) {
                sb.append('\n');
                sb.append(prefix2);
                sb.append("->");
                sb.append(this.getNsPrefixURI(prefix2));
            }
            Debuggable.notImplemented(new Object[] { sb.toString() });
        }
        return (PrefixMapping)this;
    }

    public PrefixMapping withDefaultMappings(final PrefixMapping map) {
        for (final Map.Entry<String, String> e : map.getNsPrefixMap().entrySet()) {
            final String prefix = e.getKey();
            final String uri = e.getValue();
            if (this.getNsPrefixURI(prefix) == null && this.getNsURIPrefix(uri) == null) {
                this.setNsPrefix(prefix, uri);
            }
        }
        return (PrefixMapping)this;
    }

    public String getNsPrefixURI(final String prefix) {
        return this.prefixMap.getNsPrefixURI(prefix);
    }

    public String getNsURIPrefix(final String uri) {
        return this.prefixMap.getNsURIPrefix(uri);
    }

    public Map<String, String> getNsPrefixMap() {
        return Collections.unmodifiableMap((Map<? extends String, ? extends String>)this.prefixMap.getNsPrefixMap());
    }

    public String expandPrefix(final String prefixed) {
        return this.prefixMap.expandPrefix(prefixed);
    }

    public String shortForm(final String uri) {
        return this.prefixMap.shortForm(uri);
    }

    public String qnameFor(final String uri) {
        return this.prefixMap.qnameFor(uri);
    }

    public PrefixMapping lock() {
        return (PrefixMapping)this;
    }

    public boolean samePrefixMappingAs(final PrefixMapping other) {
        return this.prefixMap.samePrefixMappingAs(other);
    }

    public void setPrefixCheck(final boolean b) {
        this.nameSpaceChecked = b;
    }

    public void setNoAdd(final boolean b) {
        this.noAdd = b;
    }

    public static CheckedGraph ensure(final Graph modelGraph2, final boolean makeNonAdd, final boolean makeNonDelete, final boolean makeNameSpaceChecked) {
        CheckedGraph gnr;
        if (!(modelGraph2 instanceof CheckedGraph)) {
            gnr = new CheckedGraph(modelGraph2, makeNonAdd, makeNonDelete, makeNameSpaceChecked);
        }
        else {
            gnr = (CheckedGraph)modelGraph2;
            gnr.setNoAdd(makeNonAdd);
            gnr.setNoDelete(makeNonDelete);
            gnr.setPrefixCheck(makeNameSpaceChecked);
        }
        return gnr;
    }
}

/*

	Total time: 72 ms

*/