package org.opencyc.constraintsolver;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import org.apache.commons.collections.CollectionUtils;
import org.opencyc.api.CycAccess;
import org.opencyc.api.CycApiException;
import org.opencyc.cycobject.CycList;
import org.opencyc.cycobject.CycVariable;
import org.opencyc.inferencesupport.Binding;
import org.opencyc.inferencesupport.ConstraintRule;
import org.opencyc.inferencesupport.Solution;
import org.opencyc.inferencesupport.UnitTest;

/**
 * The <tt>ForwardCheckingSearcher</tt> object to perform forward checking search for one or
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
public class ForwardCheckingSearcher {

    /**
     * Sets verbosity of the constraint solver output.  0 --> quiet ... 9 -> maximum
     * diagnostic input.
     */
    protected int verbosity = ConstraintProblem.DEFAULT_VERBOSITY;

    /**
     * Reference to the parent <tt>ConstraintProblem</tt> object.
     */
    protected ConstraintProblem constraintProblem;

    /**
     * Reference to the collection of the constraint rules used in the search for
     * solution(s).
     */
    protected ArrayList constraintRules;

    /**
     * Reference to the <tt>Solution</tt> for the parent <tt>ConstraintProblem</tt> object.
     */
    protected Solution solution;

    /**
     * Reference to the <tt>ValueDomains</tt> object for the parent <tt>ConstraintProblem</tt>
     * object.
     */
    protected ValueDomains valueDomains;

    /**
     * When instantiating a rule having one variable left to instantiate for subsequent
     * asking the KB, this parameter sets the threshold beyond which a variable is used in the ask
     *  -- returning what bindings are known (or proven) in the KB.
     * Under this threshold, the rule is fully instantiated for the of each variable binding in
     * the unmarked value domain and the KB ask is performed on each of these.
     */
    protected static final int ASK_ALL_OR_INDIV_THRESHOLD = 10;

    /**
     * Number of search steps performed during the search for solution(s).
     */
    protected int nbrSteps = 0;

    /**
     * Constructs a new <tt>FowardCheckingSearcher</tt> object.
     *
     * @param constraintProblem the parent constraint problem
     */
    public ForwardCheckingSearcher(ConstraintProblem constraintProblem) {
        // Set direct references to collaborating objects.
        this.constraintProblem = constraintProblem;
        constraintRules = constraintProblem.constraintRules;
        solution = constraintProblem.solution;
        valueDomains = constraintProblem.valueDomains;
        verbosity = constraintProblem.verbosity;
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

    /**
     * Performs a depth-first search of the solution space, using forward checking
     * to prune alternatives.  Employs recursion to search subtrees.
     *
     * @param variables is the <tt>ArrayList</tt> of remaining variables to solve
     * @param level is the current depth of the search
     * @return <tt>true</tt> when done with the search
     */
    public boolean search(ArrayList variables, int level)
        throws IOException, CycApiException {
        CycVariable selectedVariable = selectVariable(variables);
        ArrayList remainingDomain = valueDomains.getUnmarkedDomainValues(selectedVariable);
        ArrayList remainingVariables = (ArrayList) variables.clone();
        remainingVariables.remove(selectedVariable);
        if (verbosity > 2) {
            System.out.println("\nSearching level   " + level);
            System.out.println("  variable         " + selectedVariable.cyclify());
            System.out.println("  remaining domain " + remainingDomain);
            System.out.println("  remaining vars   " + remainingVariables);
        }
        // Iterate through the unmarked domain values, solving the subtree recursively,
        // backtracking when required.
        for (int i = 0; i < remainingDomain.size(); i++) {
            Object selectedValue = remainingDomain.get(i);
            Binding currentBinding = new Binding(selectedVariable,
                                                 selectedValue);
            solution.addBindingToCurrentSolution(currentBinding);
            nbrSteps++;
            if (verbosity > 2)
                System.out.println("  trial solution " +
                                   solution.getCurrentSolution());
            if (variables.size() == 1) {
                // Trivial case where the last variable is under consideration.
                solution.setNbrSolutionsFound(solution. getNbrSolutionsFound() + 1);
                if (verbosity > 0) {
                    if (solution.getNbrSolutionsFound() == 1)
                        System.out.println("\nFound a solution\n");
                    else
                        System.out.println("\nFound solution " +
                                           solution.getNbrSolutionsFound() + "\n");
                    solution.displaySolution(solution.getCurrentSolution());
                    System.out.println();
                }
                // The last variable is solved, have all the solutions requested been found?
                if (constraintProblem.nbrSolutionsRequested != null)
                    if (constraintProblem.nbrSolutionsRequested.intValue() == solution.getNbrSolutionsFound())
                        // Done and stop the search.
                        return true;
                // More solutions are needed, record this solution.
                solution.recordNewSolution(currentBinding);
            }
            else {
                // Try to achieve partial arc-consistency in the subtree.
                if (checkForwardRules(remainingVariables,
                                      level,
                                      currentBinding) &&
                    search(remainingVariables, level + 1))
                    // Requested solution(s) found in the subtree.
                    return true;
                // Otherwise backtrack, selecting next unmarked domain value.
                solution.removeBindingFromCurrentSolution(currentBinding);
                if (verbosity > 2) {
                    System.out.println("  backtracking from " + currentBinding);
                    System.out.println("  trial solution " +
                                       solution.getCurrentSolution());
                }
                restore(remainingVariables, level);
            }
        }
        // Done with this branch of the search tree, and keep searching.
        return false;
    }

    /**
     * From the list of variables, heuristically chooses the one most likely to
     * narrow the remaining search space.
     *
     * @param variables the <tt>ArrayList</tt> of variables from which the choice is made
     * @return the variable most likely to narrow the remaining search space
     */
    protected CycVariable selectVariable (ArrayList variables) {
        if (variables.size() == 1)
            return (CycVariable) variables.get(0);
        ArrayList annotatedVariables = new ArrayList();
        Integer remainingDomainSize = null;
        Integer degree = null;
        for (int i = 0; i < variables.size(); i++) {
            CycVariable variable = (CycVariable) variables.get(i);
            remainingDomainSize = new Integer(valueDomains.getUnmarkedDomainSize(variable));
            degree = new Integer(constraintDegree(variable, variables));
            annotatedVariables.add(new VariableSelectionAttributes(variable,
                                                                   remainingDomainSize,
                                                                   degree));
        }
        Collections.sort(annotatedVariables);
        if (verbosity > 7) {
            System.out.println("\nHeuristic selection order");
            for (int i = 0; i < annotatedVariables.size(); i++) {
                System.out.println("  " + (VariableSelectionAttributes) annotatedVariables.get(i));
            }
        }
        return ((VariableSelectionAttributes) annotatedVariables.get(0)).cycVariable;
    }

    /**
     * Performs forward checking of applicable rules to restrict the domains of remaining
     * variables.  Returns <tt>true</tt> iff no remaining variable domains are wiped out.
     *
     * @param remainingVariables the <tt>ArrayList</tt> of variables for which no domain
     * values have yet been bound
     * @param currentBinding the current variable and bound value
     * @return <tt>true</tt> iff no remaining variable domains are wiped out
     */
    protected boolean checkForwardRules(ArrayList remainingVariables,
                                        int level,
                                        Binding currentBinding)
        throws IOException, CycApiException {
        if (verbosity > 8)
            System.out.println("check forward rules applicable to binding " + currentBinding);
        for (int i = 0; i < constraintRules.size(); i++) {
            ConstraintRule rule = (ConstraintRule) constraintRules.get(i);
            ArrayList ruleVariables = rule.getVariables();
            if (verbosity > 8)
                System.out.println("check forward rule \n  " + rule.cyclify() +
                                   "  with variables " + ruleVariables);
            if ((rule.getArity() > 1) &&
                ruleVariables.contains(currentBinding.getCycVariable())) {
                // ConstraintRule applies to the selected variable.
                ArrayList remainingRuleVariables =
                    (ArrayList) CollectionUtils.intersection(remainingVariables,
                                                             ruleVariables);
                if (remainingRuleVariables.size() > 0) {
                    // It can rule out remaining variable values.

                    if (verbosity > 4)
                        System.out.println("Applicable rule \n  " + rule.cyclify() +
                                           "  for " + currentBinding.getCycVariable().cyclify());
                    if (! checkForwardRule(rule,
                                           remainingRuleVariables,
                                           level,
                                           currentBinding))
                        // found a forward rule which wipes out a domain
                        return false;
                }
            }
        }
    return true;
    }

    /**
     * Performs forward checking of the given rule to restrict the domains of remaining
     * variables.  Returns <tt>true</tt> iff no remaining variable domains are wiped out.
     * Delegates forward checking to specific methods for all-different constraint,
     * evaluatable constraint, non-evaluatable constraint.  Non-evaluatable constraints
     * are asked in the knowledge base rather than evaluated in the constraint solver
     * object.
     *
     * @param rule the constraint rule
     * @param remainingRuleVariables the <tt>ArrayList</tt> of rule variables for which no domain
     * values have yet been bound
     * @param level the current level of solution search depth
     * @param currentBinding the current variable and bound value
     * @return <tt>true</tt> iff no remaining variable domains are wiped out
     */
    protected boolean checkForwardRule(ConstraintRule rule,
                                       ArrayList remainingRuleVariables,
                                       int level,
                                       Binding currentBinding)
        throws IOException, CycApiException {
        CycList instantiatedRule = rule.getFormula().subst(currentBinding.getValue(),
                                                        currentBinding.getCycVariable());
        if (verbosity > 2) {
            System.out.println("Forward checking constraint\n  " + instantiatedRule.cyclify());
        }
        if (rule.isAllDifferent()) {
            if (verbosity > 2)
                System.out.println("all-different rule\n  " + rule.getFormula().cyclify() +
                                   "  for binding " + currentBinding.cyclify());
            return checkForwardDifferentRule(rule,
                                             remainingRuleVariables,
                                             level,
                                             currentBinding);
        }
        else if (rule.isEvaluatable()) {
            if (verbosity > 2)
                System.out.println("Evaluatable rule\n  " + rule.getFormula() +
                                   "  for binding " + currentBinding.cyclify());
            ArrayList bindings = new ArrayList();
            bindings.add(currentBinding);
            return checkForwardInstantiatedRule(instantiatedRule,
                                                remainingRuleVariables,
                                                bindings,
                                                level,
                                                currentBinding);
        }
        else {
            if (verbosity > 2)
                System.out.println("Non-evaluatable rule " + rule.getFormula().cyclify() +
                                   "\n  for binding " + currentBinding.cyclify());
            return checkForwardNonEvaluatableRule(rule,
                                                  level,
                                                  currentBinding);
        }
    }

    /**
     * Performs forward checking of the given non-evaluatable rule to restrict the
     * domains of remaining variables.  Returns <tt>true</tt> iff no remaining variable
     * domains are wiped out. Non-evaluatable constraints are asked in the knowledge base
     * rather than evaluated in the constraint solver object.
     *
     * @param rule the constraint rule
     * @param level the current level of solution search depth
     * @param currentBinding the current variable and bound value
     * @return <tt>true</tt> iff no remaining variable domains are wiped out
     */
    protected boolean checkForwardNonEvaluatableRule(ConstraintRule rule,
                                                     int level,
                                                     Binding currentBinding)
        throws IOException, CycApiException {
        // Order the remaining variables by ascending domain size.
        ArrayList remainingRuleVariables = (ArrayList) rule.getVariables().clone();
        remainingRuleVariables.remove(currentBinding.getCycVariable());
        Collections.sort(remainingRuleVariables,
                         new VariablesByAscendingDomainSizeComparator(valueDomains));
        CycList instantiatedRule = rule.getFormula().subst(currentBinding.getValue(),
                                                        currentBinding.getCycVariable());
        ArrayList bindingList = new ArrayList();
        bindingList.add(currentBinding);
        markPermittedRemainingBindings(instantiatedRule,
                                       remainingRuleVariables,
                                       bindingList,
                                       currentBinding,
                                       rule);
        for (int i = 0; i < remainingRuleVariables.size(); i++) {
            CycVariable remainingRuleVariable = (CycVariable) remainingRuleVariables.get(i);
            valueDomains.complementDomainValues(remainingRuleVariable,
                                                new Integer(level),
                                                currentBinding);
            if (valueDomains.isDomainWipedOut(remainingRuleVariable))
                return false;
        }
        return true;
    }

    /**
     * Recurses to instantiate the constraint rule in the constraint problem KB microtheory with
     * all remaining variables as bindings, marking the domain values as permitted with
     * <tt>Boolean</tt> <tt>true</tt>.
     *
     * @param instantiatedRule the constraint rule
     * @param remainingVariables the variables left to instantiate in the constraint rule
     * @param bindings the instantiated values for variables already instantiated in the
     * constraint rule
     */
    protected void markPermittedRemainingBindings(CycList instantiatedRule,
                                                  ArrayList remainingVariables,
                                                  ArrayList bindings,
                                                  Binding currentBinding,
                                                  ConstraintRule currentRule)
        throws IOException, CycApiException {
        CycVariable selectedVariable = currentBinding.getCycVariable();
        if (remainingVariables.size() == 0) {
            // This is the terminating recursion case, with no more variables left to instantiate.
            boolean instantiatedRuleResult =
                CycAccess.current().isQueryTrue_Cached(instantiatedRule,
                                                       constraintProblem.mt);
            if (verbosity > 2) {
                System.out.println("Bindings " + bindings);
                System.out.println(instantiatedRule.cyclify() + " --> " + instantiatedRuleResult);
            }
            if (instantiatedRuleResult) {
                CycVariable variable;
                Object value;
                for (int i = 0; i < bindings.size(); i++) {
                    Binding binding = (Binding) bindings.get(i);
                    variable = binding.getCycVariable();
                    if (! variable.equals(selectedVariable)) {
                        value = binding.getValue();
                        if (valueDomains.domainHasValue(variable, value)) {
                            if (verbosity > 2)
                                System.out.println("  " + binding.cyclify() + " is permitted by " +
                                                   currentBinding.cyclify());
                            valueDomains.markDomain(variable, value, Boolean.TRUE);
                        }
                    }
                }
            }
            return;
        }
        else if (remainingVariables.size() == 1) {
            // One variable left, handle the special cases where individual value
            // instantiation is not efficient.
            CycVariable variable = (CycVariable) remainingVariables.get(0);
            if (valueDomains.getUnmarkedDomainSize(variable) > ASK_ALL_OR_INDIV_THRESHOLD) {
                // Special case it is more efficient to ask for all the bindings and mark
                // them rather than to ask for them individually.
                if (verbosity > 2)
                    System.out.println("Variable exceeds ask-all threshold " + variable);
                ArrayList domainValues = this.askWithVariable(instantiatedRule, variable);
                for (int i = 0; i < domainValues.size(); i++) {
                    Object value = domainValues.get(i);
                    if (valueDomains.domainHasValue(variable, value)) {
                        if (verbosity > 2)
                            System.out.println("  " + (new Binding(variable, value)).cyclify() +
                                               " is permitted by " + currentBinding.cyclify());
                        valueDomains.markDomain(variable, value, Boolean.TRUE);
                    }

                }
            }
            return;
        }
        else {
            // Recurse to instantiate the remaining variables.
            CycVariable variable = (CycVariable) remainingVariables.get(0);
            ArrayList domainValues = valueDomains.getUnmarkedDomainValues(variable);
            int limit = valueDomains.getUnmarkedDomainSize(variable);
            if (verbosity > 4) {
                System.out.println("variable " + variable);
                System.out.println("  domain " + domainValues);
                System.out.println("  limit  " + limit);
            }
            Object value;
            CycList newInstantiatedRule;
            ArrayList newBindings = new ArrayList();
            for (int i = 0; i < limit; i++) {
                value = domainValues.get(i);
                Binding newCurrentBinding = new Binding(variable, value);
                newBindings.addAll(bindings);
                newBindings.add(new Binding(variable, value));
                newInstantiatedRule = instantiatedRule.subst(value, variable);
                if (verbosity > 4)
                    System.out.println("  instantiated rule " + newInstantiatedRule.cyclify());
                ArrayList newRemainingVariables = (ArrayList) remainingVariables.clone();
                newRemainingVariables.remove(0);
                this.markPermittedRemainingBindings(newInstantiatedRule,
                                                    newRemainingVariables,
                                                    newBindings,
                                                    newCurrentBinding,
                                                    currentRule);
            }
        }
    }

    /**
     * Returns a list of bindings for single unbound variable left in the rule.
     *
     * @param instantiatedRule the rule in <tt>CycList</tt> form which has a single
     * unbound variable
     * @param variable the variable for which bindings are sought
     * @return a <tt>ArrayList</tt> of bindings for single unbound variable left in the rule
     */
    protected ArrayList askWithVariable(CycList instantiatedRule, CycVariable variable)
        throws IOException, CycApiException {
        ArrayList result = new ArrayList();
        CycList kbValues = constraintProblem.cycAccess.askWithVariable(instantiatedRule,
                                                                       variable,
                                                                       constraintProblem.mt);
        result.addAll(kbValues);
        if (verbosity > 3)
            System.out.println("Bindings for " + variable +
                               "\n" + instantiatedRule.cyclify() +
                               "\n  in mt " + constraintProblem.mt.cyclify() +
                               "\n  --> " + kbValues.cyclify());
        return result;
    }

    /**
     * Applies the all-different constraint rule to the remaining domains and returns <tt>true</tt>
     * iff no domains are wiped out.
     *
     * @param rule the all-different constraint rule
     * @param remainingRuleVariables the variables left to instantiate in the constraint rule
     * @param level the current level of solution search depth
     * @param currentBinding the current variable and bound value
     * @return <tt>true</tt> iff no remaining variable domains are wiped out
     */
    protected boolean checkForwardDifferentRule(ConstraintRule rule,
                                                ArrayList remainingRuleVariables,
                                                int level,
                                                Binding currentBinding) {
        Object value = currentBinding.getValue();
        ArrayList differentVariables = (ArrayList) remainingRuleVariables.clone();
        differentVariables.remove(currentBinding.getCycVariable());
        for (int i = 0; i < differentVariables.size(); i++) {
            CycVariable differentVariable = (CycVariable) differentVariables.get(i);
            if (valueDomains.getUnmarkedDomainValues(differentVariable).contains(value) &&
                ! valueDomains.isDomainMarked(differentVariable, value)) {
                if (verbosity > 6)
                    System.out.println("  " + (new Binding(differentVariable, value)).cyclify() +
                                       " is ruled out by " + currentBinding.cyclify());
                valueDomains.markDomain(differentVariable, value, new Integer(level));
                if (valueDomains.isDomainWipedOut(differentVariable)) {
                    if (verbosity > 6)
                        System.out.println("  domain wiped out for " + differentVariable.cyclify());
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Recurses to instantiate the rule in the constraint problem microtheory with all
     * remaining variables as bindings. Returns <tt>true</tt> iff no domains are wiped out.
     *
     * @param rule the instantiated constraint rule
     * @param remainingRuleVariables the variables left to instantiate in the constraint rule
     * @param bindings the list of bindings instantiated so far
     * @param level the current level of solution search depth
     * @param currentBinding the current variable and bound value
     * @return <tt>true</tt> iff no remaining variable domains are wiped out
     */
    protected boolean checkForwardInstantiatedRule(CycList instantiatedRule,
                                                   ArrayList remainingRuleVariables,
                                                   ArrayList bindings,
                                                   int level,
                                                   Binding currentBinding) throws IOException {
        CycVariable selectedVariable = currentBinding.getCycVariable();
        if (remainingRuleVariables.size() == 0) {
            // This is the terminating recursion case, with no more variables left to instantiate.
            boolean instantiatedRuleResult = ConstraintRule.evaluateConstraintRule(instantiatedRule);
            if (verbosity > 2) {
                System.out.println("  bindings " + bindings);
                System.out.println("  " + instantiatedRule.cyclify() + " --> " +
                                   instantiatedRuleResult);
            }
            if (! instantiatedRuleResult) {
                CycVariable variable;
                Object value;
                for (int i = 0; i < bindings.size(); i++) {
                    Binding binding = (Binding) bindings.get(i);
                    variable = binding.getCycVariable();
                    if (! variable.equals(selectedVariable)) {
                        value = binding.getValue();
                        if (verbosity > 6)
                            System.out.println("  " + binding.cyclify() + " is ruled out by " +
                                               currentBinding.cyclify());
                        valueDomains.markDomain(variable, value, new Integer(level));
                        if (valueDomains.isDomainWipedOut(variable)) {
                            if (verbosity > 6)
                                System.out.println("  domain wiped out for " + variable);
                            return false;
                            }
                        }
                }
            }
            return true;
        }
        else {
            // Recurse to instantiate the remaining variables.
            CycVariable variable = (CycVariable) remainingRuleVariables.get(0);
            ArrayList domainValues = valueDomains.getUnmarkedDomainValues(variable);
            int limit = valueDomains.getUnmarkedDomainSize(variable);
            if (verbosity > 4) {
                System.out.println("variable " + variable);
                System.out.println("  domain " + domainValues);
                System.out.println("  limit  " + limit);
            }
            Object value;
            CycList newInstantiatedRule;
            for (int i = 0; i < limit; i++) {
                value = domainValues.get(i);
                Binding newCurrentBinding = new Binding(variable, value);
                ArrayList newBindings = new ArrayList();
                newBindings.addAll(bindings);
                newBindings.add(new Binding(variable, value));
                newInstantiatedRule = instantiatedRule.subst(value, variable);
                if (verbosity > 4)
                    System.out.println("  instantiated rule\n  " + newInstantiatedRule.cyclify());
                ArrayList newRemainingRuleVariables = (ArrayList) remainingRuleVariables.clone();
                newRemainingRuleVariables.remove(0);
                if (! checkForwardInstantiatedRule(newInstantiatedRule,
                                                   newRemainingRuleVariables,
                                                   newBindings,
                                                   level,
                                                   currentBinding)) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Restores the eliminated value choices for constraint variables due to a backtrack in
     * the search.
     */
    protected void restore(ArrayList remainingVariables, int level) {
        Integer intLevel = new Integer(level);
        for (int i = 0; i < remainingVariables.size(); i++) {
            CycVariable cycVariable = (CycVariable) remainingVariables.get(i);
            ArrayList domainValues = valueDomains.getDomainValues(cycVariable);
            for (int j = 0; j < domainValues.size(); j++) {
                Object value = domainValues.get(j);
                if (valueDomains.isDomainMarkedAtLevel(cycVariable, value, intLevel)) {
                    if (verbosity > 2)
                        System.out.println("  restoring " +
                                           (new Binding(cycVariable, value)).cyclify());
                    valueDomains.unmarkDomain(cycVariable, value);
                }
            }
        }
    }

    /**
     * Returns the number of constraint rules applicable to variable and one or more
     * of the other variables.
     *
     * @param variable the variable which must be used in the counted constraint rules
     * @param variables the counted constraint rules must use only these variables and no others.
     * @return the number of constraint rules applicable to variable and one or more
     * of the other variables
     */
    protected int constraintDegree(CycVariable variable, ArrayList variables) {
        int degree = 0;
        ArrayList ruleVariables = null;
        for (int i = 0; i < constraintProblem.constraintRules.size(); i++) {
            ConstraintRule rule = (ConstraintRule) constraintProblem.constraintRules.get(i);
            ruleVariables = rule.getVariables();
            if (ruleVariables.contains(variable) &&
                variables.containsAll(ruleVariables)) {
                degree++;
                if (verbosity > 8) {
                    ArrayList candidateVariables = (ArrayList) variables.clone();
                    candidateVariables.remove(variable);
                    System.out.println("ConstraintRule " + rule.cyclify() + "\n  between " +
                                       variable + " and candidate variables " +
                                       candidateVariables);
                }
            }
        }
        if (verbosity > 8)
            System.out.println("Constraint degree for " + variable + " is " + degree);
        return degree;
    }
}