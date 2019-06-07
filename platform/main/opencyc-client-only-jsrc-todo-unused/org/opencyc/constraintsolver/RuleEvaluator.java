package org.opencyc.constraintsolver;

import java.io.IOException;

import org.opencyc.api.CycAccess;
import org.opencyc.api.CycApiException;
import org.opencyc.cycobject.CycConstant;
import org.opencyc.cycobject.CycList;
import org.opencyc.inferencesupport.ConstraintRule;
import org.opencyc.inferencesupport.UnitTest;

/**
 * <tt>RuleEvaluator</tt> object evaluates constraint rules
 * for the parent <tt>ConstraintProblem</tt> object.  Although all
 * rules may be evaluated by asking the OpenCyc KB, some rules having
 * evaluatable predicates and functions may be efficiently evaluated locally<p>
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
public class RuleEvaluator {

    /**
     * Reference to the parent <tt>ConstraintProblem</tt> object.
     */
    protected ConstraintProblem constraintProblem;

    /**
     * Sets verbosity of the constraint solver output.  0 --> quiet ... 9 -> maximum
     * diagnostic input.
     */
    protected int verbosity = ConstraintProblem.DEFAULT_VERBOSITY;

    /**
     * Cached reference to #$numericallyEqual predicate.
     */
    protected CycConstant numericallyEqual;

    /**
     * Cached reference to #$and logical operator.
     */
    protected CycConstant and;

    /**
     * Cached reference to #$or logical operator.
     */
    protected CycConstant or;

    /**
     * Cached reference to #$not logical operator.
     */
    protected CycConstant not;

    /**
     * Cached reference to #$different predicate.
     */
    protected CycConstant different;

    /**
     * Cached reference to #$PlusFn function.
     */
    protected CycConstant plusFn;

    /**
     * Constructs a new <tt>RuleEvaluator</tt> object for the parent
     * <tt>ConstraintProblem</tt>.
     *
     * @param constraintProblem the parent constraint problem
     */
    public RuleEvaluator(ConstraintProblem constraintProblem) {
        this.constraintProblem = constraintProblem;
    }

    /**
     * Initializes this instance once the parent <tt>ConstraintProblem</tt> object creates a
     * <tt>CycAccess</tt> object.
     */
    public void initialize() {
        try {
            numericallyEqual = constraintProblem.cycAccess.makeCycConstant("numericallyEqual");
            and = constraintProblem.cycAccess.makeCycConstant("and");
            or = constraintProblem.cycAccess.makeCycConstant("or");
            not = constraintProblem.cycAccess.makeCycConstant("not");
            different = constraintProblem.cycAccess.makeCycConstant("different");
            plusFn = constraintProblem.cycAccess.makeCycConstant("PlusFn");
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("Cannot access OpenCyc server " + e.getMessage());
        }
    }


    /**
     * Return <tt>true</tt> iff the instantiated constraint rule is proven true,
     * otherwise return <tt>false</tt>
     *
     * @param rule the instantiated constraint rule to be evaluated
     * @return <tt>true</tt> iff the instantiated constraint rule is proven true,
     * otherwise return <tt>false</tt>
     */
    public boolean ask(ConstraintRule rule) throws IOException, CycApiException {
        Object predicate = rule.getPredicate();
        if (predicate.equals(and)) {
            CycList arguments = (CycList) rule.getFormula().rest();
            for (int i = 0; i < arguments.size(); i++) {
                Object argument = arguments.get(i);
                if (! (argument instanceof CycList))
                    throw new RuntimeException("Invalid #$or argument: " +
                                                argument);
                if (! ask(new ConstraintRule((CycList) arguments.get(i))))
                    return false;
            }
            return true;
        }
        else if (predicate.equals(or)) {
            CycList arguments = (CycList) rule.getFormula().rest();
            for (int i = 0; i < arguments.size(); i++) {
                Object argument = arguments.get(i);
                if (! (argument instanceof CycList))
                    throw new RuntimeException("Invalid #$or argument: " +
                                                argument);
                if (ask(new ConstraintRule((CycList) arguments.get(i))))
                    return true;
            }
            return false;
        }
        else if (predicate.equals(not)) {
            CycList expression = (CycList) rule.getFormula().second();
            if (! (expression instanceof CycList) ||
                expression.size() < 2)
                throw new RuntimeException("Invalid #$not expression: " +
                                            expression);
            return ! ask(new ConstraintRule(expression));
        }
        else if (predicate.equals(numericallyEqual)) {
            Object argument1 = rule.getFormula().second();
            int argument1Integer = 0;
            if (argument1 instanceof CycList) {
                if (((CycList) argument1).first().equals(plusFn) &&
                    ((CycList) argument1).second() instanceof Integer)
                    argument1Integer = 1 + ((Integer) ((CycList) argument1).second()).intValue();
            }
            else if (argument1 instanceof Integer)
                argument1Integer = ((Integer) argument1).intValue();
            else
                // Ask OpenCyc.
                return CycAccess.current().isQueryTrue_Cached(rule.getFormula(),
                                                              constraintProblem.mt);
            Object argument2 = rule.getFormula().third();
            int argument2Integer = 0;
            if (argument2 instanceof CycList) {
                if (((CycList) argument2).first().equals(plusFn) &&
                    ((CycList) argument2).second() instanceof Integer)
                    argument2Integer = 1 + ((Integer) ((CycList) argument2).second()).intValue();
            }
            else if (argument2 instanceof Integer)
                argument2Integer = ((Integer) argument2).intValue();
            else
                // Ask OpenCyc.
                return CycAccess.current().isQueryTrue_Cached(rule.getFormula(),
                                                              constraintProblem.mt);
            return argument1Integer == argument2Integer;
        }
        else if (predicate.equals(different)) {
            CycList arguments = (CycList) rule.getFormula().rest();
            return ! arguments.containsDuplicates();
        }
        else
            // Ask OpenCyc.
            return CycAccess.current().isQueryTrue_Cached(rule.getFormula(),
                                                          constraintProblem.mt);
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