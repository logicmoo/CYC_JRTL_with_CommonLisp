package org.opencyc.inferencesupport;

import org.opencyc.cycobject.*;
import org.opencyc.api.*;
import java.util.*;
import java.io.*;

/**
 * <tt>BindingSet</tt> object to contain bindings for query literals.<p>
 *
 * @version $Id$
 * @author Stephen L. Reed
 *
 * <p>Copyright 2001 Cycorp, Inc., license is open source GNU LGPL.
 * <p><a href="http://www.opencyc.org/license.txt">the license</a>
 * <p><a href="http://www.opencyc.org">www.opencyc.org</a>
 * <p><a href="http://www.sourceforge.net/projects/opencyc">OpenCyc at SourceForge</a>
 * <p>
 * THIS SOFTWARE AND KNOWLEDGE BASE CONTENT ARE PROVIDED ``AS IS'' AND
 * ANY EXPRESSED OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A
 * PARTICULAR PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE OPENCYC
 * ORGANIZATION OR ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT,
 * INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT,
 * STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE AND KNOWLEDGE
 * BASE CONTENT, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 */
public class BindingSet implements Comparable {
    /**
     * The literal for which these bindings were obtained.
     */
    protected QueryLiteral queryLiteral;

    /**
     * The microtheory in which the variable bindings were obtained
     */
    protected CycFort mt;

    /**
     * The set of binding sets comprising a cartesian product join, which is not actually
     * instantiatiated to save space.
     */
    protected ArrayList cartesianProductBindingSets;

    /**
     * The list of binding value lists associated with each variable, which is not used for
     * cartesian product joins.
     */
    protected ArrayList bindingValues;

    /**
     * Constructs a new <tt>BindingSet</tt> object with the given <tt>QueryLiteral</tt>.
     *
     * @param queryLiteral the literal for which bindings are obtained
     * @param mt the microtheory in which the variable bindings are obtained
     */
    public BindingSet(QueryLiteral queryLiteral, CycFort mt) throws IOException, CycApiException {
        this.queryLiteral = queryLiteral;
        this.mt = mt;
        if (queryLiteral.nbrFormulaInstances == -1) {
            CycList formula;
            if (queryLiteral.formula.first().equals(CycAccess.current().getKnownConstantByName("assertedSentence")) ||
                queryLiteral.formula.first().equals(CycAccess.current().getKnownConstantByName("knownSentence")))
                formula = (CycList) queryLiteral.formula.second();
            else
                formula = formula = queryLiteral.formula;
            if (formula.first() instanceof CycVariable)
                queryLiteral.nbrFormulaInstances = Integer.MAX_VALUE;
            else
                queryLiteral.nbrFormulaInstances =
                    CycAccess.current().countUsingBestIndex(formula, mt);
        }
    }

    /**
     * Returns the literal for this binding set.
     *
     * @return the <tt>QueryLiteral</tt> for this binding set
     */
    public QueryLiteral getQueryLiteral() {
        return queryLiteral;
    }

    /**
     * Gets the binding values for this binding set.
     *
     * @return the list of binding value lists associated with each variable,
     */
    public ArrayList getBindingValues() {
        return bindingValues;
    }

    /**
     * Sets the binding values for this binding set.
     *
     * @param bindingValues the list of binding value lists associated with each variable,
     */
    public void setBindingValues(ArrayList bindingValues) {
        this.bindingValues = bindingValues;
    }

    /**
     * Adds a binding value list to the binding set.
     *
     * @param bindingValueList the list of values to be added to the binding set.  The values are
     * ordered to correspond with the order of the variables for this binding set's query literal.
     */
    public void add(CycList bindingValueList) {
        if (bindingValues == null)
            bindingValues = new ArrayList();
        bindingValues.add(bindingValueList);
    }

    /**
     * Adds a list of binding value lists to the binding set.
     *
     * @param bindingValueLists the list of binding value lists to be added to the binding set
     */
    public void addAll(ArrayList bindingValueLists) {
        for (int i = 0; i < bindingValueLists.size(); i++)
            this.add((CycList) bindingValueLists.get(i));
    }

    /**
     * Sets the number of instances of this literal in the KB.
     *
     * @param nbrFormulaInstances the number of instances of this literal in the KB
     */
    public void setNbrInstances(int nbrFormulaInstances) {
        queryLiteral.nbrFormulaInstances = nbrFormulaInstances;
    }

    /**
     * Gets the number of instances of this literal in the KB.
     *
     * @return the number of instances matching this literal formula in the KB. Value of -1
     * indicates the variable is not yet set
     */
    public int getNbrInstances() {
        return queryLiteral.nbrFormulaInstances;
    }

    /**
     * Returns <tt>true</tt> iff the asking of the binding values has been postponed (due to the
     * estimated number of KB instances exceeding a user-controlled threshold).
     *
     * @return  <tt>true</tt> iff the asking of the binding values has been postponed (due to the
     * estimated number of KB instances exceeding a user-controlled threshold)
     */
    public boolean isBindingPostponed() {
        return bindingValues == null;
    }

    /**
     * Returns the size of the binding set for this literal.
     *
     * @return the size of the binding set for this literal
     */
    public int size() {
        if (this.isCartesianProduct()) {
            int maxSize = 0;
            for (int i = 0; i < cartesianProductBindingSets.size(); i++) {
                int size = ((BindingSet) cartesianProductBindingSets.get(i)).size();
                if (maxSize < size)
                    maxSize = size;
            }
            return maxSize;
        }
        if (bindingValues == null)
            return this.getNbrInstances();
        else
            return bindingValues.size();
    }

    /**
     * Returns the variables in this binding set.
     *
     * @return the variables in this binding set
     */
    public ArrayList getVariables() {
        return queryLiteral.getVariables();
    }

    /**
     * Returns the microtheory in which the variable bindings were obtained.
     *
     * @return the microtheory in which the variable bindings were obtained
     */
    public CycFort getMt() {
        return mt;
    }

    /**
     * Displays the binding set.
     */
    public void displayBindingSet() {
        System.out.println("Binding Set for " + this.getQueryLiteral().cyclify() +
                            " in " + mt.cyclify());
        System.out.println("  variables " + this.getVariables());
        if (bindingValues != null) {
            for (int i = 0; i < this.getBindingValues().size(); i++) {
                CycList bindingList = (CycList) getBindingValues().get(i);
                System.out.println("  " + bindingList.cyclify());
            }
        }
        else
            System.out.println("  binding is postponed");
    }

    /**
     * Returns <tt>true</tt> if the object equals this object.
     *
     * @param object the object for comparison
     * @return <tt>boolean</tt> indicating equality of an object with this object.
     */
    @Override
	public boolean equals(Object object) {
        if (! (object instanceof BindingSet))
            return false;
        QueryLiteral thatQueryLiteral = ((BindingSet) object).getQueryLiteral();
        return this.queryLiteral.equals(thatQueryLiteral);
    }

    /**
     * Compares this object with the specified object for order.
     * Returns a negative integer, zero, or a positive integer as this
     * object is less than, equal to, or greater than the specified object.
     *
     * @param object the reference object with which to compare.
     * @return a negative integer, zero, or a positive integer as this
     * object is less than, equal to, or greater than the specified object
     */
     @Override
	public int compareTo (Object object) {
        if (! (object instanceof BindingSet))
            throw new ClassCastException("Must be a BindingSet object");
        return (new Integer(this.size())).compareTo(new Integer(((BindingSet) object).size()));
     }

    /**
     * Returns a <tt>String</tt> representation of the <tt>BindingSet</tt> object.
     *
     * @return a <tt>String</tt> representation of the <tt>BindingSet</tt> object.
     */
    @Override
	public String toString() {
        if (bindingValues != null)
            return queryLiteral.cyclify() + " with estimated size " + this.getNbrInstances() +
                " and actual size " + this.size();
        else
            return queryLiteral.cyclify() + " with estimated size " + this.getNbrInstances();
    }

    /**
     * Returns <tt>true</tt> iff this is a formula having one variable.
     *
     * @return <tt>true</tt> iff this is a formula having one variable
     */
    public boolean isUnary() {
        return queryLiteral.isUnary();
    }

    /**
     * Returns <tt>true</tt> iff the binding set has the form of an uninstantiated cartesian
     * product.
     *
     * @return  <tt>true</tt> iff the binding set has the form of an uninstantiated cartesian
     * product
     */
    public boolean isCartesianProduct() {
        return cartesianProductBindingSets != null;
    }

    /**
     * Returns the set of binding sets comprising a cartesian product join, which is not actually
     * instantiatiated to save space.
     *
     * @return the set of binding sets comprising a cartesian product join
     */
    public ArrayList getCartesianProductBindingSets() {
        return cartesianProductBindingSets;
    }

    /**
     * Sets the set of binding sets comprising a cartesian product join.
     *
     * @param cartesianProductBindingSets the set of binding sets comprising a cartesian product join
     */
    public void setCartesianProductBindingSets(ArrayList cartesianProductBindingSets) {
        this.cartesianProductBindingSets = cartesianProductBindingSets;
    }

}