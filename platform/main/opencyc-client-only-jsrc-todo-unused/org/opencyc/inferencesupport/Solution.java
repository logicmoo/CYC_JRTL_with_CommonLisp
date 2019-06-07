package org.opencyc.inferencesupport;

import org.opencyc.cycobject.*;
import java.util.*;

/**
 * <tt>Solution</tt> object to model the attributes and behavior of
 * solutions to the <tt>ConstraintProblem</tt>.<p>
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
public class Solution {

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
     * The number of solutions requested in the parent object.
     */
    protected Integer nbrSolutionsRequested;

    /**
     * Number of solutions found by the search.  Will not be more than the
     * number requested if <tt>nbrSolutionsRequested</tt> is not <tt>null</tt>.
     */
    protected int nbrSolutionsFound = 0;

    /**
     * List of solutions where each solution is a list of constraint variable -
     * domain value bindings which satisfy all the constraint rules.  Newest
     * solution is at the end of the list.
     */
    protected ArrayList solutions = new ArrayList();

    /**
     * Constructs a new <tt>Solution</tt> object given the parent <tt>ConstraintProblem</tt>
     * object.  Initializes the solutions to a single empty solution.
     *
     * @param parent the parent <tt>ConstraintProblem</tt> or <tt>QueryProcessor</tt> object
     */
    public Solution(Integer nbrSolutionsRequested, int verbosity) {
        this.nbrSolutionsRequested = nbrSolutionsRequested;
        solutions = new ArrayList();
        addSolution(new ArrayList());
        this.verbosity = verbosity;
    }

    /**
     * Adds the solutions contained in the given binding set.
     *
     * @param bindingSet the binding set whose variable value bindings are to be added to the solution
     */
    public void addBindingSet(BindingSet bindingSet) {
        for (int i = 0; i < bindingSet.size(); i++) {
            ArrayList solution = new ArrayList();
            CycList bindingValueList = (CycList) bindingSet.getBindingValues().get(i);
            for (int j = 0; j < bindingSet.getVariables().size(); j++) {
                CycVariable cycVariable = (CycVariable) bindingSet.getVariables().get(j);
                Object value = bindingValueList.get(j);
                Binding binding = new Binding(cycVariable, value);
                solution.add(binding);
            }
            this.addSolution(solution);
        }
    }

    /**
     * Adds the variable / value binding to the current solution.
     *
     * @param binding the variable / value binding to be added
     */
    public void addBindingToCurrentSolution(Binding binding) {
        getCurrentSolution().add(binding);
    }

    /**
     * Removes the variable / value binding from the current solution.
     *
     * @param binding the variable / value binding to be removed
     */
    public void removeBindingFromCurrentSolution(Binding binding) {
        getCurrentSolution().remove(binding);
    }

    /**
     * Adds a new solution to the solution set.  The added
     * solution becomes the current solution.
     *
     * @param the new solution <tt>ArrayList</tt> of <tt>Binding</tt> objects
     * to be added to the solution set
     */
    public void addSolution(ArrayList solution) {
        solutions.add(solution);
    }

    /**
     * Returns the current solution.
     *
     * @return the current solution
     */
    public ArrayList getCurrentSolution() {
        return (ArrayList) solutions.get(solutions.size() - 1);
    }

    /**
     * Sets the number of solutions found.
     *
     * @param nbrSolutionsFound the new value for the number of solutions found
     */
    public void setNbrSolutionsFound(int nbrSolutionsFound) {
        this.nbrSolutionsFound = nbrSolutionsFound;
    }

    /**
     * Returns the number of solutions found.
     *
     * @return the number of solutions found
     */
    public int getNbrSolutionsFound() {
        return this.nbrSolutionsFound;
    }

    /**
     * Returns all solutions.
     *
     * @return the <tt>ArrayList</tt> of solutions, each solution is an <tt>ArrayList</tt>
     * of <tt>Binding</tt> objects
     */
    public ArrayList getSolutions() {
        return solutions;
    }

    /**
     * Sets solutions to the given list of solutions.
     *
     * @param solutions the list of solutions
     */
    public void setSolutions(ArrayList solutions) {
        this.solutions = solutions;
    }

    /**
     * Records the current solution state by copying the current solution into a new
     * partial solution without including the given binding, which is already part of
     * a prior solution.
     *
     * @param binding the variable / value binding, which is not to be included in the
     * new partial solution
     */
    public void recordNewSolution(Binding binding) {
        ArrayList currentSolution = getCurrentSolution();
        ArrayList partialSolution = new ArrayList();
        for (int i = 0; i < currentSolution.size(); i++) {
            Binding solutionBinding = (Binding) currentSolution.get(i);
            partialSolution.add(solutionBinding.clone());
        }
        partialSolution.remove(binding);
        addSolution(partialSolution);
    }

    /**
     * Displays the bindings in a given solution to the constraint problem.
     */
    public void displaySolution(ArrayList solution) {
        System.out.println("Variables and solution value:");
        ArrayList orderedSolution = (ArrayList) solution.clone();
        Collections.sort(orderedSolution);
        for (int i = 0; i < orderedSolution.size(); i++)
            System.out.println(orderedSolution.get(i));
    }

    /**
     * Displays the bindings in all solutions to the constraint problem.
     */
    public void displaySolutions() {
        for (int i = 0; i < solutions.size(); i++) {
            displaySolution((ArrayList) solutions.get(i));
            System.out.println();
        }
    }

    /**
     * Removes the current empty solution in the special case where all solutions
     * were requested and where all solutions were found.
     */
    public void finalizeAllSolutions() {
        if (nbrSolutionsRequested == null &&
            nbrSolutionsFound > 0)
            solutions.remove(solutions.size() - 1);
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