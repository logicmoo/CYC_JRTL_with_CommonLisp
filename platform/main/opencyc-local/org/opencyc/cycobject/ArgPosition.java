package org.opencyc.cycobject;

import java.util.Collections;
import java.util.Arrays;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

public class ArgPosition extends DefaultCycObject
{
    protected final List<Integer> path;
    public static final ArgPosition TOP;
    public static final ArgPosition ARG0;
    public static final ArgPosition ARG1;
    public static final ArgPosition ARG2;
    public static final ArgPosition ARG3;
    public static final ArgPosition ARG4;
    public static final ArgPosition ARG5;
    public static final ArgPosition ARG6;
    
    public ArgPosition(final List<Integer> path) {
        (this.path = new ArrayList<Integer>()).addAll(path);
    }
    
    public ArgPosition(final Integer... argNums) {
        this(Arrays.asList(argNums));
    }
    
    public List<Integer> getPath() {
        return Collections.unmodifiableList((List<? extends Integer>)this.path);
    }
    
    public ArgPosition extend(final ArgPosition otherArgPos) {
        this.path.addAll(otherArgPos.getPath());
        return this;
    }
    
    public ArgPosition extend(final Integer argnum) {
        this.path.add(argnum);
        return this;
    }
    
    public Integer first() {
        return this.getPath().get(0);
    }
    
    public Integer last() {
        final List<Integer> myPath = this.getPath();
        return myPath.get(myPath.size() - 1);
    }
    
    public int depth() {
        return this.getPath().size();
    }
    
    public String toString() {
        return this.path.toString();
    }
    
    public boolean equals(final Object obj) {
        return obj instanceof ArgPosition && this.path.equals(((ArgPosition)obj).getPath());
    }
    
    public int hashCode() {
        return this.path.hashCode();
    }
    
    public ArgPosition toParent() {
        this.path.remove(this.path.size() - 1);
        return this;
    }
    
    public ArgPosition deepCopy() {
        return new ArgPosition(this.path);
    }
    
    public boolean isPrefixOf(final ArgPosition otherArgPosition) {
        return otherArgPosition != null && otherArgPosition.depth() >= this.depth() && this.path.equals(otherArgPosition.getPath().subList(0, this.path.size()));
    }
    
    public String stringApiValue() {
        return new CycList((Collection)this.getPath()).stringApiValue();
    }
    
    public boolean matchingArgPosition(final ArgPosition candidate, final boolean matchEmpty) {
        if (candidate == null) {
            return matchEmpty;
        }
        return this.isPrefixOf(candidate);
    }
    
    public int compareTo(final Object o) {
        if (!(o instanceof ArgPosition)) {
            return 0;
        }
        ArgPosition other;
        int i;
        int result;
        for (other = (ArgPosition)o, i = 0; this.path.size() > i && other.path.size() > i; ++i) {
            result = this.path.get(i).compareTo(other.path.get(i));
            if (result != 0) {
                return result;
            }
        }
        if (this.path.size() <= i) {
            return -1;
        }
        if (other.path.size() <= i) {
            return 1;
        }
        return 0;
    }
    
    static {
        TOP = new UnmodifiableArgPosition("TOP", new Integer[0]);
        ARG0 = new UnmodifiableArgPosition(new Integer[] { 0 });
        ARG1 = new UnmodifiableArgPosition(new Integer[] { 1 });
        ARG2 = new UnmodifiableArgPosition(new Integer[] { 2 });
        ARG3 = new UnmodifiableArgPosition(new Integer[] { 3 });
        ARG4 = new UnmodifiableArgPosition(new Integer[] { 4 });
        ARG5 = new UnmodifiableArgPosition(new Integer[] { 5 });
        ARG6 = new UnmodifiableArgPosition(new Integer[] { 6 });
    }
    
    private static class UnmodifiableArgPosition extends ArgPosition
    {
        private final String name;
        
        public UnmodifiableArgPosition(final String name, final Integer... argNums) {
            super(argNums);
            this.name = name;
        }
        
        public UnmodifiableArgPosition(final Integer... argNums) {
            this((String)null, argNums);
        }
        
        @Override
        public String toString() {
            if (this.name == null) {
                return super.toString();
            }
            return this.name;
        }
        
        @Override
        public ArgPosition extend(final ArgPosition otherArgPos) {
            throw new UnsupportedOperationException();
        }
        
        @Override
        public ArgPosition extend(final Integer argnum) {
            throw new UnsupportedOperationException();
        }
        
        @Override
        public ArgPosition toParent() {
            throw new UnsupportedOperationException();
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 75 ms
	
	Decompiled with Procyon 0.5.32.
*/