package org.opencyc.queryprocessor;

import java.util.*;
import java.io.*;

import org.opencyc.cycobject.*;
import org.opencyc.inferencesupport.*;
import org.opencyc.api.*;

/**
 * <tt>LiteralAsker</tt> object to obtain bindings for query literals by asking the
 * KB.  Literals whose number of estimated instances exceed a user-controlled threshold,
 * have a postponed query binding set.<p>
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
public class LiteralAsker {

    /**
     * The default verbosity of the solution output.  0 --> quiet ... 9 -> maximum
     * diagnostic input.
     */
    public static final int DEFAULT_VERBOSITY = 3;

    /**
     * Sets verbosity of the constraint solver output.  0 --> quiet ... 9 -> maximum
     * diagnostic input.
     */
    protected int verbosity = DEFAULT_VERBOSITY;

    /**
     * The default value of the estimated number of instances beyond which the binding values are not
     * all fetched from the KB.
     */
    public static final int DEFAULT_FORMULA_INSTANCES_THRESHOLD = 200;

    /**
     * The default value of the estimated number of instances beyond which the binding values are not
     * all fetched from the KB.
     */
    public int formulaInstancesThreshold = DEFAULT_FORMULA_INSTANCES_THRESHOLD;

    /**
     * Constructs a new <tt>LiteralAsker</tt> object.
     */
    public LiteralAsker() {
    }

    /**
     * Asks the KB about each of the given query literals on the condition that their estimated
     * number of instances do not exceed the user-controlled threshold.
     *
     * @param queryLiterals the query literals which are asked in the KB
     * @param mt the KB microtheory in which the query literals are asked
     * @return a list of variable binding sets for each literal.
     */
    public ArrayList ask(ArrayList queryLiterals, CycFort mt) throws IOException {
        ArrayList result = new ArrayList();
        for (int i = 0; i < queryLiterals.size(); i++) {
            QueryLiteral queryLiteral = (QueryLiteral) queryLiterals.get(i);
            BindingSet bindingSet = new BindingSet(queryLiteral, mt);
            if (bindingSet.isUnary() &&
                (bindingSet.getNbrInstances() < formulaInstancesThreshold ||
                neverPostponeAskingForPredicate(queryLiteral.getPredicate()))) {
                if (verbosity > 3)
                    System.out.println("Asking " + queryLiteral.cyclify());
                bindingSet.setBindingValues(CycAccess.current().askWithVariables(bindingSet.getQueryLiteral().getFormula(),
                                                                                 bindingSet.getVariables(),
                                                                                 bindingSet.getMt()));
            }
            else {
                if (verbosity > 3)
                    System.out.println("Postponed asking " + queryLiteral.cyclify());
            }
            if (verbosity > 8)
                bindingSet.displayBindingSet();
            result.add(bindingSet);
        }
        return result;
    }

    /**
     * Asks the KB about the query literal contained in the given binding set.
     *
     * @param bindingSet the query literals which are asked in the KB
     * @param mt the KB microtheory in which the query literals are asked
     */
    public void ask(BindingSet bindingSet) throws IOException {
        QueryLiteral queryLiteral = bindingSet.getQueryLiteral();
        CycFort mt = bindingSet.getMt();
        if (verbosity > 3)
            System.out.println("Asking " + queryLiteral.cyclify());
        bindingSet.setBindingValues(CycAccess.current().askWithVariables(bindingSet.getQueryLiteral().getFormula(),
                                                                         bindingSet.getVariables(),
                                                                         bindingSet.getMt()));
        if (verbosity > 8)
            bindingSet.displayBindingSet();
    }

    /**
     * Asks the KB about a partially instantiated query literal and if bindings are found, returns
     * a list of value binding lists for all the variables in the given query literal, otherwise if
     * no bindings are found, returns an empty list.
     *
     * @param joinedQueryLiteral the joined query literal which contains the uninstantiated query literal
     * @param uninstantiatedQueryLiteral the literal which will be partially instantiated and asked
     * @param variables the list of instantiated variables
     * @param valueBindingList the list of values corresponding in position to the variables
     * @return a list of value binding lists for all the variables in the given joined query literal, otherwise if
     * no bindings are found, returns an empty list
     */
    public ArrayList ask(QueryLiteral joinedQueryLiteral,
                         QueryLiteral uninstantiatedQueryLiteral,
                         ArrayList variables,
                         ArrayList bindingValues,
                         CycFort mt)  throws IOException {
        if (verbosity > 3)
            System.out.println("Asking about " + uninstantiatedQueryLiteral.cyclify() +
                               "\n  with bound variables " + variables +
                               "\n  with bound values " + bindingValues);
        CycList partiallyInstantiatedFormula = (CycList) uninstantiatedQueryLiteral.getFormula().clone();
        for (int i = 0; i < variables.size(); i++) {
            partiallyInstantiatedFormula =
                partiallyInstantiatedFormula.subst(bindingValues.get(i), variables.get(i));
        }
        QueryLiteral partiallyInstantiatedQueryLiteral = new QueryLiteral(partiallyInstantiatedFormula);
        if (verbosity > 5)
            System.out.println("  partially instantiated " + partiallyInstantiatedQueryLiteral.cyclify());
        ArrayList bindingLists =
            CycAccess.current().askWithVariables(partiallyInstantiatedFormula,
                                                 partiallyInstantiatedQueryLiteral.getVariables(),
                                                 mt);
        if (verbosity > 5)
            System.out.println("  --> " + bindingLists);
        CycList result = new CycList();
        boolean foundValue;
        Object bindingValue;
        for (int i = 0; i < bindingLists.size(); i++) {
            CycList partiallyInstantiatedBindingValues = (CycList) bindingLists.get(i);
            CycList joinedBindingValueList = new CycList();
            for (int j = 0; j < joinedQueryLiteral.getVariables().size(); j++) {
                CycVariable queryLiteralVariable = (CycVariable) joinedQueryLiteral.getVariables().get(j);
                if (verbosity > 5)
                    System.out.print("    binding for " + queryLiteralVariable);
                foundValue = false;
                for (int k = 0; k < variables.size(); k++) {
                    if (queryLiteralVariable.equals(variables.get(k))) {
                        // found in the input variables
                        foundValue = true;
                        bindingValue = bindingValues.get(k);
                        joinedBindingValueList.add(bindingValue);
                        if (verbosity > 5)
                            System.out.println(" [input] --> " + bindingValue);
                        break;
                    }
                }
                if (! foundValue) {
                    for (int k = 0; k < partiallyInstantiatedQueryLiteral.getVariables().size(); k++) {
                        if (queryLiteralVariable.equals(partiallyInstantiatedQueryLiteral.getVariables().get(k))) {
                            // found in the asked variables
                            foundValue = true;
                            bindingValue = partiallyInstantiatedBindingValues.get(k);
                            joinedBindingValueList.add(bindingValue);
                            if (verbosity > 5)
                                System.out.println(" [asked] --> " + bindingValue);
                            break;
                        }
                    }
                }
                if (! foundValue)
                    throw new RuntimeException("Expected variable not found in " + joinedQueryLiteral.cyclify());
            }
            if (verbosity > 3)
                System.out.println("  joined binding list " + joinedBindingValueList);
            result.add(joinedBindingValueList);
        }
         return result;
    }

    /**
     * Returns <tt>true</tt> iff the predicate in the query literal indicates that the ask should
     * never be postponed.
     *
     * @param predicate the predicate in the query literal
     * @return <tt>true</tt> iff the predicate in the query literal indicates that the ask should
     * never be postponed
     */
    public boolean neverPostponeAskingForPredicate(CycConstant predicate) throws IOException {
        if (predicate.equals(CycAccess.current().getKnownConstantByName("#$holdsIn")))
            return true;
        else
            return false;
    }

    /**
     * Sets verbosity of the diagnostic output.  0 --> quiet ... 9 -> maximum
     * diagnostic input.
     *
     * @param verbosity 0 --> quiet ... 9 -> maximum diagnostic input
     */
    public void setVerbosity(int verbosity) {
        this.verbosity = verbosity;
    }
}