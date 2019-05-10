package org.appdapter.bind.rdf.jena.model;

import org.slf4j.LoggerFactory;
import java.util.Iterator;
import java.util.List;
import com.hp.hpl.jena.graph.Triple;
import com.hp.hpl.jena.graph.Graph;
import com.hp.hpl.jena.sparql.util.Timer;
import org.slf4j.Logger;
import com.hp.hpl.jena.graph.GraphListener;

public class GraphUploadMonitor implements GraphListener
{
    static Logger theLogger;
    private Timer myTimer;
    private int myAddNotePoint;
    private boolean myDisplayMemoryFlag;
    private long myAddCount;
    private int myOutputCount;
    private long myLastEventTime;

    public GraphUploadMonitor(final int addNotePoint, final boolean displayMemory) {
        this.myTimer = null;
        this.myDisplayMemoryFlag = false;
        this.myAddCount = 0L;
        this.myOutputCount = 0;
        this.myLastEventTime = 0L;
        this.myAddNotePoint = addNotePoint;
        this.myDisplayMemoryFlag = displayMemory;
        (this.myTimer = new Timer()).startTimer();
    }

    @Override
	public void notifyAddTriple(final Graph g, final Triple t) {
        this.addEvent(t);
    }

    @Override
	public void notifyAddArray(final Graph g, final Triple[] triples) {
        for (final Triple t : triples) {
            this.addEvent(t);
        }
    }

    @Override
	public void notifyAddList(final Graph g, final List triples) {
        this.notifyAddIterator(g, triples.iterator());
    }

    @Override
	public void notifyAddIterator(final Graph g, final Iterator it) {
        while (it.hasNext()) {
            this.addEvent((Triple) it.next());
        }
    }

    @Override
	public void notifyAddGraph(final Graph g, final Graph added) {
    }

    @Override
	public void notifyDeleteTriple(final Graph g, final Triple t) {
    }

    @Override
	public void notifyDeleteList(final Graph g, final List L) {
    }

    @Override
	public void notifyDeleteArray(final Graph g, final Triple[] triples) {
    }

    @Override
	public void notifyDeleteIterator(final Graph g, final Iterator it) {
    }

    @Override
	public void notifyDeleteGraph(final Graph g, final Graph removed) {
    }

    @Override
	public void notifyEvent(final Graph source, final Object value) {
    }

    private void addEvent(final Triple t) {
        ++this.myAddCount;
        if (this.myAddNotePoint > 0 && this.myAddCount % this.myAddNotePoint == 0L) {
            ++this.myOutputCount;
            final long soFar = this.myTimer.readTimer();
            final long thisTime = soFar - this.myLastEventTime;
            final long tpsBatch = this.myAddNotePoint * 1000L / thisTime;
            final long tpsAvg = this.myAddCount * 1000L / soFar;
            String msg = String.format("Add: %,d triples  (Batch: %d / Run: %d)", this.myAddCount, tpsBatch, tpsAvg);
            if (this.myDisplayMemoryFlag) {
                final long mem = Runtime.getRuntime().totalMemory();
                final long free = Runtime.getRuntime().freeMemory();
                msg += String.format("   [M:%,d/F:%,d]", mem, free);
            }
            System.out.println(msg);
            if (this.myOutputCount > 0 && this.myOutputCount % 10 == 0) {
                System.out.printf("  Elapsed: %.1f seconds\n", soFar / 1000.0f);
            }
            this.myLastEventTime = soFar;
        }
    }

    public long getAddCount() {
        return this.myAddCount;
    }

    public int getAddNotePoint() {
        return this.myAddNotePoint;
    }

    public long getLastTime() {
        return this.myLastEventTime;
    }

    public int getOutputCount() {
        return this.myOutputCount;
    }

    static {
        GraphUploadMonitor.theLogger = LoggerFactory.getLogger((Class)GraphUploadMonitor.class);
    }
}

/*

	Total time: 46 ms

*/