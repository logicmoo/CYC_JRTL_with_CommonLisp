package org.opencyc.util.query;

import java.util.HashSet;
import java.util.Set;

public class AbstractQuerySpecification implements QuerySpecification
{
    protected Set constraints;
    protected Object id;
    protected Object question;
    
    public AbstractQuerySpecification(final Object question, final Set constraints) {
        this.question = question;
        this.constraints = constraints;
    }
    
    public Set getConstraints() {
        return this.constraints;
    }
    
    public Set getFilteredConstraints(final Class constraintType) {
        final HashSet result = new HashSet();
        return result;
    }
    
    public String getGloss() {
        return "";
    }
    
    public Object getQuestion() {
        return null;
    }
    
    public Object clone() {
        return null;
    }
    
    public Object getId() {
        return this.id;
    }
    
    public void setId(final Object id) {
        this.id = id;
    }
    
    public void addQueryListener(final QueryListener listener) {
    }
    
    public void removeQueryListener(final QueryListener listener) {
    }
    
    public void setQueryResultSet(final QueryResultSet resultSet) {
    }
    
    public QueryResultSet getQueryResultSet() {
        return null;
    }
    
    public void setQueryStatus(final QueryStatus queryStatus) {
    }
    
    public QueryStatus getQueryStatus() {
        return null;
    }
    
    public void revertQuerySpecification() {
    }
    
    public void setQuerySpecification(final QuerySpecification querySpecification) {
    }
    
    public QuerySpecification getQuerySpecification() {
        return null;
    }
    
    public QuerySpecification getOriginalQuerySpecification() {
        return null;
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 38 ms
	
	Decompiled with Procyon 0.5.32.
*/