package org.opencyc.nl;

public class Paraphrase<E> implements Comparable<Paraphrase<?>>
{
    protected final String nl;
    protected final E term;
    
    public Paraphrase(final String nl, final E term) {
        this.nl = nl;
        this.term = term;
    }
    
    @Override
    public boolean equals(final Object obj) {
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        final Paraphrase other = (Paraphrase)obj;
        if (this.nl == null) {
            if (other.nl == null) {
                return this.term == other.term || (this.term != null && this.term.equals(other.term));
            }
        }
        else if (this.nl.equals(other.nl)) {
            return this.term == other.term || (this.term != null && this.term.equals(other.term));
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + ((this.nl != null) ? this.nl.hashCode() : 0);
        hash = 89 * hash + ((this.term != null) ? this.term.hashCode() : 0);
        return hash;
    }
    
    @Override
    public int compareTo(final Paraphrase<?> o) {
        final String thisString = (this.nl == null) ? "" : this.nl;
        final String oString = (o == null || o.nl == null) ? "" : o.nl;
        return thisString.compareTo(oString);
    }
    
    public String getString() {
        return this.nl;
    }
    
    @Override
    public String toString() {
        return this.getString();
    }
    
    public E getCycL() {
        return this.term;
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 40 ms
	
	Decompiled with Procyon 0.5.32.
*/