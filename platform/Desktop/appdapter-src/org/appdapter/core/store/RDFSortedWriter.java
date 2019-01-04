package org.appdapter.core.store;

import com.hp.hpl.jena.n3.N3JenaWriter;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.util.iterator.ClosableIterator;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.graph.Graph;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import com.hp.hpl.jena.mem.GraphMem;
import org.appdapter.core.store.dataset.CheckedGraph;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import com.hp.hpl.jena.rdf.model.ResIterator;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.n3.N3JenaWriterPP;

public final class RDFSortedWriter extends N3JenaWriterPP
{
    private boolean skipWritingPrefixes;
    
    public RDFSortedWriter(final boolean writePfxs) {
        this.skipWritingPrefixes = false;
        this.useWellKnownPropertySymbols = false;
        this.skipWritingPrefixes = !writePfxs;
    }
    
    protected ResIterator listSubjects(final Model model) {
        return model.listSubjects();
    }
    
    protected void processModel(final Model model) {
        this.prefixMap = model.getNsPrefixMap();
        this.bNodesMap = new HashMap();
        final String base2 = this.prefixMap.get("");
        final Iterator<Map.Entry<String, String>> iter = this.prefixMap.entrySet().iterator();
        while (iter.hasNext()) {
            final Map.Entry<String, String> e = iter.next();
            final String prefix = e.getKey();
            final String uri = e.getValue();
            if (!checkPrefixPart(prefix)) {
                iter.remove();
            }
            else {
                if (!checkPrefixPart(prefix)) {
                    continue;
                }
                this.reversePrefixMap.put(uri, prefix);
            }
        }
        this.startWriting();
        this.prepare(model);
        this.writeHeader(model);
        this.writePrefixes(model);
        if (this.prefixMap.size() != 0) {
            this.out.println();
        }
        this.writeModel(model);
        this.finishWriting();
        this.bNodesMap = null;
    }
    
    protected void writeHeader(final Model model) {
        final String baseURIref = this.prefixMap.get("");
        if (baseURIref != null && !baseURIref.equals("")) {
            this.out.println("# Base: " + baseURIref);
        }
    }
    
    protected void writePrefixes(final Model model) {
        Graph graph;
        for (graph = model.getGraph(); graph instanceof CheckedGraph; graph = ((CheckedGraph)graph).getDataGraph()) {}
        if (!(graph instanceof GraphMem)) {
            this.out.println("# " + graph.getClass());
        }
        final ArrayList<String> keyBases = new ArrayList<String>(this.prefixMap.keySet());
        Collections.sort(keyBases, NumericStringComparitor.stringComparator);
        if (!this.skipWritingPrefixes) {
            for (final String p : keyBases) {
                final String u = this.prefixMap.get(p);
                final String tmp = "@prefix " + p + ": ";
                this.out.print(tmp);
                this.out.print(pad(16 - tmp.length()));
                this.out.println(" <" + u + "> .");
            }
        }
    }
    
    protected void writeOneGraphNode(final Resource subject) {
        this.out.incIndent(this.indentProperty);
        this.writeSubject(subject);
        final ClosableIterator<Property> iter = (ClosableIterator<Property>)this.preparePropertiesForSubject(subject);
        this.writePropertiesForSubject(subject, iter);
        this.out.decIndent(this.indentProperty);
        this.out.println(" .");
    }
    
    protected void writePropertiesForSubject(final Resource subj, final ClosableIterator<Property> iter0) {
        final List<Property> sortMe = new ArrayList<Property>();
        while (iter0.hasNext()) {
            final Property property = (Property)iter0.next();
            sortMe.add(property);
        }
        iter0.close();
        Collections.sort(sortMe, NumericStringComparitor.resourceComparator);
        final Iterator<Property> iter = sortMe.iterator();
        while (iter.hasNext()) {
            final Property property2 = iter.next();
            this.writeObjectList(subj, property2);
            if (iter.hasNext()) {
                this.out.println(" ;");
            }
        }
    }
    
    protected void writeModel(final Model model) {
        final List<Resource> sortMe = new ArrayList<Resource>();
        boolean doingFirst = true;
        final ResIterator rIter = this.listSubjects(model);
        while (rIter.hasNext()) {
            final Resource subject = (Resource)rIter.next();
            sortMe.add(subject);
        }
        rIter.close();
        Collections.sort(sortMe, NumericStringComparitor.resourceComparator);
        for (final Resource subject2 : sortMe) {
            if (this.skipThisSubject(subject2)) {
                if (!N3JenaWriter.DEBUG) {
                    continue;
                }
                this.out.println("# Skipping: " + this.formatResource(subject2));
            }
            else {
                if (doingFirst) {
                    doingFirst = false;
                }
                else {
                    this.out.println();
                }
                this.writeOneGraphNode(subject2);
            }
        }
    }
}

/*

	Total time: 60 ms
	
*/