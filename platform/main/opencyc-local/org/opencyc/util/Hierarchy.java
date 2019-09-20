package org.opencyc.util;

import java.util.TreeSet;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.HashSet;
import java.util.Collections;
import java.util.Set;
import org.opencyc.cycobject.CycDenotationalTerm;
import org.opencyc.nl.Paraphrase;
import java.io.PrintStream;

public class Hierarchy<T>
{
    protected Node<T> root;
    
    public Hierarchy(final T rootContent) {
        this.root = new Node<T>(rootContent);
    }
    
    public Node<T> getRoot() {
        return this.root;
    }
    
    public void insertAbove(final T content, final Node<T> child) {
        final Node<T> newNode = new Node<T>((T)content);
        ((Node<Object>)newNode).add((Node<Object>)child);
        synchronized (this) {
            final Node<T> oldParent = (Node<T>)((Node<Object>)child).setParent((Node<Object>)newNode);
            if (oldParent == null) {
                this.root = newNode;
            }
            else {
                ((Node<Object>)newNode).setParent((Node<Object>)oldParent);
            }
        }
    }
    
    public void insertBelow(final T content, final Node<T> parent) {
        final Node<T> newNode = new Node<T>((T)content);
        synchronized (this) {
            ((Node<Object>)newNode).setParent((Node<Object>)parent);
            ((Node<Object>)parent).add((Node<Object>)newNode);
        }
    }
    
    public void printIndented(final PrintStream stream) {
        String indentString = "";
        final SortedWalker walker = new SortedWalker((Hierarchy<T>)this, Walker.Mode.DEPTHFIRST);
        while (walker.hasNext()) {
            final Node<Paraphrase<CycDenotationalTerm>> node = (Node<Paraphrase<CycDenotationalTerm>>)walker.next();
            final int depth = node.getDepth();
            if (indentString.length() > depth) {
                indentString = indentString.substring(0, depth);
            }
            else {
                while (indentString.length() < depth) {
                    indentString += " ";
                }
            }
            stream.println(indentString + node.getContent());
        }
    }
    
    public static class Node<T>
    {
        private Node<T> parent;
        private T content;
        private final Set<Node<T>> children;
        
        public Node<T> getParent() {
            return this.parent;
        }
        
        private Node<T> setParent(final Node<T> newParent) {
            final Node<T> oldParent = this.getParent();
            this.parent = newParent;
            return oldParent;
        }
        
        public Set<Node<T>> getChildren() {
            return Collections.unmodifiableSet((Set<? extends Node<T>>)this.children);
        }
        
        @Override
        public String toString() {
            return "[N: " + this.content + "]";
        }
        
        public int getDepth() {
            int depth = 0;
            for (Node<T> parent = this.getParent(); parent != null; parent = parent.getParent()) {
                ++depth;
            }
            return depth;
        }
        
        private boolean add(final Node<T> child) {
            return this.children.add(child);
        }
        
        public T getContent() {
            return this.content;
        }
        
        private Node(final T content) {
            this.children = new HashSet<Node<T>>();
            this.content = content;
        }
    }
    
    public static class Walker<T> implements Iterator<Node<T>>
    {
        private final Mode mode;
        protected final Deque<Node<T>> queue;
        
        public Walker(final Hierarchy<T> hierarchy) {
            this(hierarchy, Mode.BREADTHFIRST);
        }
        
        public Walker(final Hierarchy<T> hierarchy, final Mode mode) {
            (this.queue = new ArrayDeque<Node<T>>()).add(hierarchy.getRoot());
            this.mode = mode;
        }
        
        @Override
        public boolean hasNext() {
            return !this.queue.isEmpty();
        }
        
        @Override
        public synchronized Node<T> next() {
            final Node<T> next = this.queue.remove();
            Collection<Node<T>> children = this.orderSiblingNodes(next.getChildren());
            switch (this.mode) {
                case BREADTHFIRST: {
                    this.queue.addAll(children);
                    break;
                }
                case DEPTHFIRST: {
                    children = new ArrayList<Node<T>>(children);
                    Collections.reverse((List)children);
                    for (final Node<T> child : children) {
                        this.queue.addFirst(child);
                    }
                    break;
                }
            }
            return next;
        }
        
        @Override
        public void remove() {
            throw new UnsupportedOperationException("Not supported.");
        }
        
        protected Collection<Node<T>> orderSiblingNodes(final Collection<Node<T>> nodes) {
            return nodes;
        }
        
        public enum Mode
        {
            BREADTHFIRST, 
            DEPTHFIRST;
        }
    }
    
    public static class HierarchyComparator<T> implements Comparator<Hierarchy<T>>
    {
        @Override
        public int compare(final Hierarchy<T> h1, final Hierarchy<T> h2) {
            return ((Comparable)h1.getRoot().getContent()).compareTo(h2.getRoot().getContent());
        }
    }
    
    public static class SortedWalker<T> extends Walker<T>
    {
        public SortedWalker(final Hierarchy<T> hierarchy) {
            super(hierarchy);
        }
        
        public SortedWalker(final Hierarchy<T> hierarchy, final Mode mode) {
            super(hierarchy, mode);
        }
        
        @Override
        protected Collection<Node<T>> orderSiblingNodes(final Collection<Node<T>> nodes) {
            final Comparator<Node<T>> comparator = new Comparator<Node<T>>() {
                @Override
                public int compare(final Node<T> node1, final Node<T> node2) {
                    return ((Comparable)node1.getContent()).compareTo(node2.getContent());
                }
            };
            final TreeSet<Node<T>> ordered = new TreeSet<Node<T>>(comparator);
            ordered.addAll(nodes);
            return ordered;
        }
    }
    
    public abstract static class Builder<T>
    {
        private boolean debug;
        
        public Collection<Hierarchy<T>> organize(final Collection<T> objects) {
            final Set<Hierarchy<T>> hierarchies = new HashSet<Hierarchy<T>>();
            for (final T obj : objects) {
                this.addItem(obj, hierarchies);
            }
            return hierarchies;
        }
        
        private void addItem(final T item, final Set<Hierarchy<T>> hierarchies) {
            this.debug = false;
            if (this.debug) {
                System.out.println("Adding " + item);
            }
            final Set<Hierarchy> toMerge = new HashSet<Hierarchy>();
            if (!this.placeInExistingHierarchies(hierarchies, item, toMerge)) {
                hierarchies.add(new Hierarchy<T>(item));
            }
            else {
                this.mergeHierarchies(toMerge, hierarchies);
            }
        }
        
        private boolean tryToAddItem(final T item, final Hierarchy<T> hierarchy) {
            final Set<Node<T>> superiors = new HashSet<Node<T>>();
            final Walker<T> walker = new Walker<T>(hierarchy);
            while (walker.hasNext()) {
                final Node<T> node = walker.next();
                final T other = node.getContent();
                if (this.debug) {
                    System.out.println("Comparing " + item + " to " + other);
                }
                if (this.isSuperior(item, other)) {
                    if (this.debug) {
                        System.out.println("Inserting " + item + " above " + other);
                    }
                    hierarchy.insertAbove(item, node);
                    return true;
                }
                if (!this.isSuperior(other, item)) {
                    continue;
                }
                superiors.add(node);
            }
            if (superiors.isEmpty()) {
                return false;
            }
            for (final Node<T> superior : superiors) {
                if (this.debug) {
                    System.out.println("Inserting " + item + " below " + superior.getContent());
                }
                hierarchy.insertBelow(item, superior);
            }
            return true;
        }
        
        private boolean placeInExistingHierarchies(final Set<Hierarchy<T>> hierarchies, final T item, final Set<Hierarchy> toRemove) {
            boolean placed = false;
            Hierarchy hierarchyRootedByItem = null;
            for (final Hierarchy<T> hierarchy : hierarchies) {
                if (this.tryToAddItem(item, hierarchy)) {
                    placed = true;
                    if (hierarchyRootedByItem != null) {
                        toRemove.add(hierarchyRootedByItem);
                    }
                    final T rootItem = hierarchy.getRoot().getContent();
                    if (!item.equals(rootItem)) {
                        continue;
                    }
                    hierarchyRootedByItem = hierarchy;
                }
            }
            return placed;
        }
        
        private void mergeHierarchies(final Set<Hierarchy> toMerge, final Set<Hierarchy<T>> hierarchies) {
            final Set<T> relocated = new HashSet<T>();
            hierarchies.removeAll(toMerge);
            for (final Hierarchy hierarchy : toMerge) {
                final Walker<T> walker = new Walker<T>(hierarchy);
                while (walker.hasNext()) {
                    final Node<T> node = walker.next();
                    if (!node.equals(hierarchy.getRoot())) {
                        final T childItem = node.getContent();
                        if (!relocated.add(childItem)) {
                            continue;
                        }
                        this.addItem(childItem, hierarchies);
                    }
                }
            }
        }
        
        protected abstract boolean isSuperior(final T p0, final T p1);
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 173 ms
	
	Decompiled with Procyon 0.5.32.
*/