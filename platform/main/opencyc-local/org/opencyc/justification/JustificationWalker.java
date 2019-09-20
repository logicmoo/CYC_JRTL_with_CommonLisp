package org.opencyc.justification;

import java.util.List;
import java.util.Collection;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class JustificationWalker implements Iterator<Justification.Node>
{
    final Deque<Justification.Node> queue;
    
    public JustificationWalker(final Justification justification) {
        (this.queue = new ArrayDeque<Justification.Node>()).add(justification.getRoot());
    }
    
    @Override
    public boolean hasNext() {
        return !this.queue.isEmpty();
    }
    
    @Override
    public Justification.Node next() {
        final Justification.Node node = this.queue.remove();
        final List<? extends Justification.Node> children = (List<? extends Justification.Node>)node.getChildren();
        final Iterator<Justification.Node> it = new ArrayDeque<Justification.Node>(children).descendingIterator();
        while (it.hasNext()) {
            this.queue.addFirst(it.next());
        }
        return node;
    }
    
    @Override
    public void remove() {
        throw new UnsupportedOperationException("Not supported.");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 17 ms
	
	Decompiled with Procyon 0.5.32.
*/