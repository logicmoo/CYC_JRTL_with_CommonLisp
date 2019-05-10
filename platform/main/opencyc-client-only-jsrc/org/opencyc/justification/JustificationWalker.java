package org.opencyc.justification;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import org.opencyc.justification.Justification.Node;

/**
 * A depth-first iterator over the nodes of a justification.
 * @author baxter
 */
public class JustificationWalker implements Iterator<Node> {
  final Deque<Justification.Node> queue = new ArrayDeque<Justification.Node>();

  public JustificationWalker(final Justification justification) {
    queue.add(justification.getRoot());
  }

  @Override
  public boolean hasNext() {
    return !queue.isEmpty();
  }

  @Override
  public Node next() {
    final Justification.Node node = queue.remove();
    final List<? extends Node> children = node.getChildren();
    //Add children to front of queue for depth-first traversal:
    for (final Iterator<Justification.Node> it = new ArrayDeque<Justification.Node>(children).descendingIterator(); it.hasNext();) {
      queue.addFirst(it.next());
    }
    return node;
  }

  @Override
  public void remove() {
    throw new UnsupportedOperationException("Not supported.");
  }
  
}
