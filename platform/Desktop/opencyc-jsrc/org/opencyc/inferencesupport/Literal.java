package org.opencyc.inferencesupport;

import java.util.*;
import org.opencyc.cycobject.*;
import org.opencyc.api.*;
import java.io.IOException;

/**
 * An abstract parent class for <tt>QueryLiteral</tt> and <tt>ConstraintRule</tt> classes.<p>
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
 * @see UnitTest#testQueryLiteral
 */
public class Literal  implements Comparable{

    /**
     * The number of instances matching this literal formula in the KB. Value of -1
     * indicates the variable is not yet set.
     */
    public int nbrFormulaInstances = -1;

    /**
     * The literal formula as an OpenCyc query.
     */
    protected CycList formula;

    /**
     * The collection of <tt>CycVariables</tt> used in the literal.  There should
     * be at least one, because if there are no variables, then the literal is
     * either always true or always false and has no effect on the solution.
     */
    protected ArrayList variables;

    /**
     * Value which indicates that a given literal subsumes another given literal.
     */
    public static final int SUBSUMES = 1;

    /**
     * Value which indicates that a given literal is subsumed by another given literal.
     */
    public static final int SUBSUMED_BY = 2;

    /**
     * Value which indicates that a given literal neither subsumes another given literal or is
     * subsumed by another given literal.
     */
    public static final int NO_SUBSUMPTION = 3;

    /**
     * Gathers the unique variables from the literal's formula.
     */
    protected void gatherVariables() {
        variables = new ArrayList();
        Enumeration e = formula.cycListVisitor();
        while (true) {
            if (! e.hasMoreElements())
                break;
            Object element = e.nextElement();
            if ((element instanceof CycVariable) &&
               (! (variables.contains(element))))
                variables.add(element);
        }
    }

    /**
     * Gets the literal's formula.
     *
     * @return a <tt>CycList</tt> which is the literal's formula.
     */
    public CycList getFormula() {
        return formula;
    }

    /**
     * Returns the literal's variables.
     *
     * @return the <tt>ArrayList</tt> which lists the unique <tt>CycVariables</tt> that are
     * used in the literal's formula.
     */
    public ArrayList getVariables() {
        return variables;
    }

    /**
     * Returns the literal's arity which is defined to be the number of variables, not
     * necessarily equalling the arity of the literal's first predicate.
     *
     * @return literal's arity which is defined to be the number of variables, not
     * necessarily equalling the arity of the literal's first predicate
     */
    public int getArity() {
        return variables.size();
    }

    /**
     * Returns <tt>true</tt> if the object equals this object.
     *
     * @param object the object for comparison
     * @return <tt>boolean</tt> indicating equality of an object with this object.
     */
    public boolean equals(Object object) {
        if (! (object instanceof Literal))
            return false;
        Literal thatLiteral = (Literal) object;
        return this.formula.equals(thatLiteral.getFormula());
    }

    /**
     * Provides the hash code appropriate for the <tt>Literal</tt>.
     *
     * @return the hash code for the <tt>Literal</tt>
     */
    public int hashCode() {
        return this.formula.hashCode();
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
     public int compareTo (Object object) {
        if (! (object instanceof Literal))
            throw new ClassCastException("Must be a Literal object");
        return (new Integer(this.getArity())).compareTo(new Integer(((Literal) object).getArity()));
     }

    /**
     * Returns a value indicating the subsumption relationship, or lack of subsumption
     * relationship between this literal and another literal.
     *
     * @param literal the literal for subsumption determination
     * @return <tt>Literal.SUBSUMES</tt> if this literal subsumes the given literal,
     * <tt>Literal.SUBSUMED_BY</tt> if this literal is subsumed by the given literal,
     * <tt>Literal.NO_SUBSUMPTION</tt> if this literal is neither subsumed by the given literal, nor
     * subsumes the given literal
     */
    public int determineSubsumption(Literal literal) throws IOException, CycApiException {
        if (this.equals(literal))
            return SUBSUMES;
        if (! (this.getPredicate().equals(literal.getPredicate())))
            return NO_SUBSUMPTION;
        if (this.getArity() != literal.getArity())
            return NO_SUBSUMPTION;
        int answer = 0;
        for (int i = 0; i < this.getArguments().size(); i++) {
            Object thisArgument = this.getArguments().get(i);
            Object thatArgument = literal.getArguments().get(i);
            if (thisArgument.equals(thatArgument))
                continue;
            if (thisArgument instanceof CycVariable) {
                if (thatArgument instanceof CycVariable) {
                    if (! (thisArgument.equals(thatArgument)))
                        return NO_SUBSUMPTION;
                }
                else if (answer == SUBSUMED_BY)
                    return NO_SUBSUMPTION;
                else if (answer == 0) {
                    answer = SUBSUMES;
                    continue;
                }
            }
            if (thatArgument instanceof CycVariable) {
                if (answer == SUBSUMES)
                    return NO_SUBSUMPTION;
                else
                    answer = SUBSUMED_BY;
            }
            if (! (thisArgument instanceof CycConstant) ||
                ! (thatArgument instanceof CycConstant))
                return NO_SUBSUMPTION;
            if (! (CycAccess.current().isCollection_Cached((CycConstant) thisArgument)))
                return NO_SUBSUMPTION;
            if (! (CycAccess.current().isCollection_Cached((CycConstant) thatArgument)))
                return NO_SUBSUMPTION;
            if (CycAccess.current().isGenlOf_Cached((CycConstant) thisArgument,
                                                    (CycConstant) thatArgument)) {
                if (answer == SUBSUMED_BY)
                    return NO_SUBSUMPTION;
                else if (answer == 0) {
                    answer = SUBSUMES;
                    continue;
                }
            }
            if (CycAccess.current().isGenlOf_Cached((CycConstant) thatArgument,
                                                    (CycConstant) thisArgument)) {
                if (answer == SUBSUMES)
                    return NO_SUBSUMPTION;
                else if (answer == 0) {
                    answer = SUBSUMED_BY;
                    continue;
                }
            }
            return NO_SUBSUMPTION;
        }
        if (answer == 0)
            return SUBSUMES;
        else
            return answer;
    }

    /**
     * Returns whether this literal is subsumed by the given literal.
     *
     * @param literal the given literal for subsumption determination.
     * @return <tt>true</tt> iff this literal is subsumed by the given <tt>Literal</tt> object.
     */
    public boolean isSubsumedBy(Literal literal) throws IOException, CycApiException {
        if (this.equals(literal))
            return true;
        else
            return this.determineSubsumption(literal) == Literal.SUBSUMED_BY;
    }

    /**
     * Returns whether this literal subsumes the given literal.
     *
     * @param literal the given literal for subsumption determination.
     * @return <tt>true</tt> iff this literal subsumes the given <tt>Literal</tt> object.
     */
    public boolean subsumes(Literal literal) throws IOException, CycApiException {
        return this.determineSubsumption(literal) == Literal.SUBSUMES;
    }

    /**
     * Returns the predicate of this <tt>Literal</tt> object.
     *
     * @return the predicate <tt>CycConstant</tt> or <tt>CycSymbol</tt>
     * of this <tt>Literal</tt> object
     */
    public CycConstant getPredicate() {
        return (CycConstant) formula.first();
    }

    /**
     * Returns the arguments of this <tt>Literal</tt> object.
     *
     * @return the arguments of this <tt>Literal</tt> object
     */
    public CycList getArguments() {
        return (CycList) formula.rest();
    }

    /**
     * Substitutes an object for a variable.
     *
     * @param oldVariable the variable to replaced
     * @parma newObject the <tt>Object</tt> to be substituted for the variable
     */
    public void substituteVariable(CycVariable variable, Object newObject) {
        if (! (variables.contains(variable)))
            throw new RuntimeException(variable + " is not a variable of " + this);
        variables.remove(variable);
        if (newObject instanceof CycVariable)
            variables.add(newObject);
        formula = formula.subst(newObject, variable);
    }

    /**
     * Returns <tt>true</tt> if this <tt>Literal</tt> is a #$different literal.
     *
     * @return <tt>boolean</tt> indicating if this <tt>Literal</tt> is a #$different
     * literal
     */
    public boolean isAllDifferent() throws IOException{
        if (this.getArity() < 2)
            return false;
        if (this.getPredicate().equals(CycAccess.different))
            return true;
        else
            return false;
    }

    /**
     * Returns <tt>true</tt> if this <tt>Literal</tt> is a simple evaluatable literal,
     * which can be answered without KB lookup.  Typically an evaluatable constraint
     * literal is a relational operator applied to a primitive data type.
     *
     *
     * @return <tt>true</tt> if this <tt>Literal</tt> is a simple evaluatable literal,
     * which can be answered without KB lookup
     */
    public boolean isEvaluatable() throws IOException {
        if (this.getArguments().size() < 2)
            return false;
        if (this.getPredicate().equals(CycAccess.different))
            return true;
        if (this.getPredicate().equals(CycAccess.numericallyEqual))
            return hasEvaluatableNumericalArgs();

        if (this.getPredicate().toString().equals("or") ||
             this.getPredicate().toString().equals("and")) {
            for (int i = 0; i < this.getArguments().size(); i++) {
                Literal orArgument = new QueryLiteral((CycList) this.getArguments().get(i));
                if (! orArgument.isEvaluatable())
                    return false;
            }
            return true;
        }
        else
            return false;
    }

    /**
     * Returns <tt>true</tt> if this <tt>Literal</tt> has simple evaluatable numerical arguments.
     * Numbers and variables return <tt>true</tt> and functional expressions return
     * <tt>true</tt> iff their arguments are simple numerical expressions.
     *
     *
     * @return <tt>true</tt> if this <tt>Literal</tt> has simple evaluatable numerical arguments
     */
    public boolean hasEvaluatableNumericalArgs() throws IOException {
        CycList args = (CycList) this.getFormula().rest();
        for (int i = 0; i < args.size(); i++) {
            Object arg = args.get(i);
            if (arg instanceof CycVariable)
                continue;
            else if (arg instanceof Integer)
                continue;
            else if (arg instanceof CycNart) {
                CycNart cycNart = (CycNart) arg;
                if (cycNart.getFunctor().equals(CycAccess.plusFn)) {
                    Object plusFnArg = cycNart.getArguments().get(0);
                    if (plusFnArg instanceof CycVariable)
                        continue;
                    if (plusFnArg instanceof Integer)
                        continue;
                }
            }
            else if (arg instanceof CycList) {
                CycList cycList = (CycList) arg;
                if (cycList.first().equals(CycAccess.plusFn)) {
                    Object plusFnArg = cycList.second();
                    if (plusFnArg instanceof CycVariable)
                        continue;
                    if (plusFnArg instanceof Integer)
                        continue;
                }
            }
            else
                return false;
        }
        return true;
    }

    /**
     * Returns <tt>true</tt> iff this is a ground formula having no variables.
     *
     * @return <tt>true</tt> iff this is a ground formula having no variables
     */
    public boolean isGround() {
        return this.getArity() == 0;
    }

    /**
     * Returns <tt>true</tt> iff this is a formula having one variable.
     *
     * @return <tt>true</tt> iff this is a formula having one variable
     */
    public boolean isUnary() {
        return this.getArity() == 1;
    }

    /**
     * Returns <tt>true</tt> iff the predicate has the irreflexive property:
     * (#$isa ?PRED #$IrreflexsiveBinaryPredicate).
     *
     * @param mt the microtheory in which the irreflexive property is sought
     * @return <tt>true</tt> iff the predicate has the irreflexive property:
     * (#$isa ?PRED #$IrreflexsiveBinaryPredicate)
     */
    public boolean isIrreflexive(CycFort mt) throws IOException, CycApiException {
        return CycAccess.current().isIrreflexivePredicate(this.getPredicate(), mt);
    }

    /**
     * Returns a string representation of the <tt>Literal</tt>.
     *
     * @return the literal's formula formated as a <tt>String</tt>.
     */
    public String toString() {
        return formula.toString();
    }

    /**
     * Returns a cyclified string representation of the literal's formula.
     * Embedded constants are prefixed with ""#$".
     *
     * @return a cyclified <tt>String</tt>.
     */
    public String cyclify() {
        return formula.cyclify();
    }

    /**
     * Returns <tt>true</tt> iff the given <tt>CycList</tt> is a valid representation of a constraint
     * rule.  Specifically, an expression is not a valid constraint rule if its predicate is not a
     * <tt>CycConstant</tt> object.
     *
     * @param cycListConstraintRule the representation of a constraint rule to be validated
     * @return <tt>true</tt> iff the given <tt>CycList</tt> is a valid representation of a constraint
     * rule
     */
    public static boolean isValidConstraintRuleExpression(CycList cycListConstraintRule) {
        if (cycListConstraintRule.size() < 2)
            return false;
        return cycListConstraintRule.first() instanceof CycConstant;
    }

}