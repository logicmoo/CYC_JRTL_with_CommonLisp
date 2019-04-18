package org.opencyc.constraintsolver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.opencyc.cycobject.CycList;
import org.opencyc.cycobject.CycVariable;
import org.opencyc.inferencesupport.Binding;
import org.opencyc.inferencesupport.UnitTest;

/**
 * <tt>ValueDomains</tt> object to model the attributes and behavior of
 * value domains of variables during forward checking search for one or
 * more solutions to the <tt>ConstraintProblem</tt>.<p>
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
 * @see UnitTest#testConstraintProblem
 */
public class ValueDomains {

    /**
     * Sets verbosity of the constraint solver output.  0 --> quiet ... 9 -> maximum
     * diagnostic input.
     */
    protected int verbosity = ConstraintProblem.DEFAULT_VERBOSITY;

    /**
     * Dictionary of variable --> domain value <tt>ArrayList</tt>.
     */
    protected HashMap varsDictionary = new HashMap();

    /**
     * Dictionary of dictionaries of objects used to mark domain values
     * during search.  The purpose of marking is to eliminate values from
     * the solution.  First key indexes by constraint variable, second key
     * indexes by domain value for the variable, and the object represents
     * the integer search level at which the variable domain value was marked,
     * or the boolean <tt>true</tt> during a complement operation, or <tt>null</tt>
     * if the value is unmarked.
     */
    protected HashMap domains = new HashMap();

    /**
     * Reference to the parent <tt>ConstraintProblem</tt> object.
     */
    protected ConstraintProblem constraintProblem;

    /**
     * Constructs a new <tt>ValueDomains</tt> object.
     *
     * @param constraintProblem the parent constraint problem
     */
    public ValueDomains(ConstraintProblem constraintProblem) {
        this.constraintProblem = constraintProblem;
    }

    /**
     * Displays the variables and their value domains.
     */
    public void displayVariablesAndDomains() {
        System.out.println("Variables and value domains");
        CycList orderedVariables = new CycList(constraintProblem.variables);
        orderedVariables = orderedVariables.sort();
        for (int i = 0; i < orderedVariables.size(); i++) {
            CycVariable cycVariable = (CycVariable) orderedVariables.get(i);
            ArrayList domainValues = getDomainValues(cycVariable);
            System.out.println("  " + cycVariable + "\t" + domainValues);
        }
    }

    /**
     * Initializes the domain value marking structure.
     */
    public void initializeDomainValueMarking() {
        int nbrOfVariables = constraintProblem.variables.size();
        domains = new HashMap(nbrOfVariables);
        for (int i = 0; i < nbrOfVariables; i++) {
            CycVariable cycVariable = (CycVariable) constraintProblem.variables.get(i);
            ArrayList domainValues = getDomainValues(cycVariable);
            int nbrOfValues = domainValues.size();
            HashMap domainValueMarks = new HashMap(nbrOfValues);
            domains.put(cycVariable, domainValueMarks);
            for (int j = 0; j < nbrOfValues; j++)
                domainValueMarks.put(domainValues.get(j), null);
        }
    }

    /**
     * Returns the <tt>ArrayList</tt> of domain values for a variable.
     *
     * @param cycVariable the variable for domain values are sought
     * @return the <tt>ArrayList</tt> of domain values for a variable
     */
    public ArrayList getDomainValues(CycVariable cycVariable) {
        return (ArrayList) varsDictionary.get(cycVariable);
    }

    /**
     * Sets the <tt>ArrayList</tt> of domain values for a variable.
     *
     * @param cycVariable the variable
     * @param domainValues the <tt>ArrayList</tt> of domain values for the variable
     */
    public void setDomainValues(CycVariable cycVariable, ArrayList domainValues) {
        varsDictionary.put(cycVariable, domainValues);
    }

    /**
     * Adds an <tt>Object</tt> value to the domain for a variable.
     *
     * @param cycVariable the variable
     * @param value the <tt>Object</tt> value which is added to the domain for the variable
     */
    public void addDomainValue(CycVariable cycVariable, Object value) {
        ArrayList domainValues = this.getDomainValues(cycVariable);
        domainValues.add(value);
        setDomainValues(cycVariable, domainValues);
    }

    /**
     * Returns <tt>true</tt> if the variable has value in its domain.
     *
     * @param cycVariable the variable under consideration
     * @param value the value for comparison with the variable's value domain.
     * @return <tt>true</tt> if the variable has value in its domain.
     */
    public boolean domainHasValue(CycVariable cycVariable, Object value) {
        ArrayList domainValues = (ArrayList) varsDictionary.get(cycVariable);
        return domainValues.contains(value);
    }

    /**
     * Removes the given value from the given variable's value domain.
     *
     * @param cycVariable the variable under consideration
     * @param value the <tt>Object</tt> to be removed from the variable's value domain
     */
    public void removeFromValue(CycVariable cycVariable, Object value) {
        ArrayList domainValues = (ArrayList) varsDictionary.get(cycVariable);
        domainValues.remove(value);
    }

     /**
     * Resets the entry for the variable / domain value marking.
     */
    public void unmarkDomain(CycVariable cycVariable, Object value) {
        markDomain(cycVariable, value, null);
    }

    /**
     * Marks the entry for the variable / domain value with an <tt>Integer</tt> level number,
     * or a <tt>Boolean</tt> <tt>True</tt>, or <tt>null</tt>.
     */
    public void markDomain(CycVariable cycVariable, Object value, Object level) {
        HashMap domainValueMarks = (HashMap) domains.get(cycVariable);
        domainValueMarks.put(value, level);
    }

    /**
     * Returns the number of unmarked (eligible for the solution) domain values
     * for the given variable.
     */
    public int getUnmarkedDomainSize(CycVariable cycVariable) {
        int unmarkedDomainSize = 0;
        HashMap domainValueMarks = (HashMap) domains.get(cycVariable);
        Iterator levels = domainValueMarks.values().iterator();
        while (true) {
            if (! levels.hasNext())
                break;
            Object level = levels.next();
            if (level == null)
                unmarkedDomainSize++;
        }
        return unmarkedDomainSize;
    }

    /**
     * Returns the <tt>ArrayList</tt> of unmarked (eligible for the solution) domain
     * values for the given variable.
     */
    public ArrayList getUnmarkedDomainValues(CycVariable cycVariable) {
        ArrayList unmarkedDomainValues = new ArrayList();
        HashMap domainValueMarks = (HashMap) domains.get(cycVariable);
        Iterator values = domainValueMarks.keySet().iterator();
        while (true) {
            if (! values.hasNext())
                break;
            Object keyValue = values.next();
            Object level = domainValueMarks.get(keyValue);
            if (level == null)
                unmarkedDomainValues.add(keyValue);
        }
        return unmarkedDomainValues;
    }

    /**
     * Iterates over the domain values for the given variable, changing any
     * entries marked <tt>true</tt> to <tt>Integer</tt> level.
     *
     * @param cycVariable the variable for domain value complementation
     * @param newLevel the new search level for the variable's domain
     * @param selectedBinding a variable binding for optional diagnostic display
     */
    public void complementDomainValues(CycVariable cycVariable,
                                          Integer newLevel,
                                          Binding selectedBinding) {
        HashMap domainValueMarks = (HashMap) domains.get(cycVariable);
        Iterator values = domainValueMarks.keySet().iterator();
        while (true) {
            if (! values.hasNext())
                break;
            Object keyValue = values.next();
            Object level = domainValueMarks.get(keyValue);
            if (level == null) {
                domainValueMarks.put(keyValue, newLevel);
                if (verbosity > 2)
                    System.out.println("\n" + (new Binding(cycVariable, keyValue)) +
                                       " is ruled out by " +
                                       selectedBinding);
            }
            else if (level.equals(Boolean.TRUE))
                domainValueMarks.put(keyValue, null);
        }
    }

    /**
     * Returns <tt>true</tt> iff all the domain values of the variable have been marked
     * and thus eliminated from consideration as a solution.
     *
     * @return <tt>true</tt> if and only if all the domain values of the variable have been marked
     * and thus eliminated from consideration as a solution
     */
    public boolean isDomainWipedOut(CycVariable cycVariable) {
        HashMap domainValueMarks = (HashMap) domains.get(cycVariable);
        Iterator values = domainValueMarks.keySet().iterator();
        while (true) {
            if (! values.hasNext())
                return true;
            Object value = values.next();
            if (! isDomainMarked(cycVariable, value))
                return false;
        }
    }

    /**
     * Returns <tt>true</tt> iff the variable / value combination is marked
     * with any level number.
     *
     * @return <tt>true</tt> iff the variable / value combination is marked
     * with aany level number
     */
    public boolean isDomainMarked(CycVariable cycVariable, Object value) {
        HashMap domainValueMarks = (HashMap) domains.get(cycVariable);
        return (domainValueMarks.get(value)) instanceof Integer;
    }

    /**
     * Returns <tt>true</tt> iff the variable / value combination is marked
     * with a given level number.
     *
     * @return <tt>true</tt> iff the variable / value combination is marked
     * with a given level number
     */
    public boolean isDomainMarkedAtLevel(CycVariable cycVariable,
                                            Object value,
                                            Integer level) {
        HashMap domainValueMarks = (HashMap) domains.get(cycVariable);
        Object mark = domainValueMarks.get(value);
        if (mark == null)
            return false;
        else
            return mark.equals(level);
    }

    /**
     * Sets verbosity of the constraint solver output.  0 --> quiet ... 9 -> maximum
     * diagnostic input.
     *
     * @param verbosity 0 --> quiet ... 9 -> maximum diagnostic input
     */
    public void setVerbosity(int verbosity) {
        this.verbosity = verbosity;
    }
}