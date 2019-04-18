package org.opencyc.inferencesupport;

import java.util.*;
import java.io.*;
import org.opencyc.cycobject.*;
import org.opencyc.api.*;
import org.opencyc.util.*;

/**
 * Provides attribute and behavior for a formula unifier, used during backchaining.<p>
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
 */
public class Unifier {

    /**
     * The default verbosity of the query processor output.  0 --> quiet ... 9 -> maximum
     * diagnostic input.
     */
    public static final int DEFAULT_VERBOSITY = 3;

    /**
     * Sets verbosity of the constraint solver output.  0 --> quiet ... 9 -> maximum
     * diagnostic input.
     */
    protected int verbosity = DEFAULT_VERBOSITY;

    /**
     * Reference to the parent <tt>Backchainer</tt> object.
     */
    protected Backchainer backchainer;

    /**
     * Constructs a new <tt>Unifier</tt> object given the parent
     * <tt>Backchainer</tt> object.
     *
     * @param backchainer the parent <tt>Backchainer</tt> ojbect
     */
    public Unifier(Backchainer backchainer) {
        this.backchainer = backchainer;
    }

    /**
     * Unifies a constraint rule with the consequent of a horn clause and returns a list of
     * the antecedants with the required variable renamings and substitutions, or returns
     * <tt>null</tt> if no unification is possible.
     *
     * @param rule the constraint rule which is the subject of the backchaining operation
     * @param hornClause the horn clause whose consequent is to be unified with the constraint
     * rule
     * @return an <tt>ArrayList</tt> of the antecedants with the required variable renamings and
     * substitutions if unification succeeds otherwise return <tt>null</tt>
     */
    public ArrayList semanticallyUnify(Literal literal, HornClause hornClause) throws IOException {
        if (verbosity > 3)
            System.out.println("Attempting to unify \n" + literal + "\n" + hornClause);
        if (! (literal.getPredicate().equals(hornClause.getConsequent().getPredicate()))) {
            if (verbosity > 3)
                System.out.println("predicates not equal \n" + literal.getPredicate() +
                " " + hornClause.getConsequent().getPredicate());
            return null;
        }
        // Clone a new horn clause having no variables in common with those variable which
        // are already included in the constraint problem.
        HornClause unifiedHornClause = (HornClause) hornClause.clone();
        unifiedHornClause.renameVariables(backchainer.variables, verbosity);

        // Visit each corresponding argument position in the literal and in the horn clause
        // consequent.
        CycList consequentArguments = unifiedHornClause.getConsequent().getArguments();
        CycList literalArguments = literal.getArguments();

        for (int i = 0; i < literalArguments.size(); i++) {
            Object literalArgument = literalArguments.get(i);
            Object consequentArgument = consequentArguments.get(i);
            if (literalArgument instanceof CycVariable) {
                if (consequentArgument instanceof CycVariable) {
                    // Unify a literal variable.
                    unifiedHornClause.substituteVariable((CycVariable) consequentArgument,
                                                         literalArgument,
                                                         verbosity);
                if (verbosity > 3)
                    System.out.println("at argument position " + (i + 1) +
                                       ". " + ((CycVariable) literalArgument).cyclify() +
                                       " substituted for " +
                                       ((CycVariable) consequentArgument).cyclify());
                }
                else {
                    if (verbosity > 3)
                        System.out.println("at argument position " + (i + 1) +
                                           ", " + literalArgument + " is a variable " +
                                           " but " + consequentArgument + " is not a variable");
                    return null;
                }

            }
            else if (consequentArgument instanceof CycVariable) {
                // Unify a horn clause consequent variable with a literal term.
                if (unifiedHornClause.substituteVariable((CycVariable) consequentArgument,
                                                         literalArgument,
                                                         verbosity)) {
                    if (verbosity > 3)
                        System.out.println("at argument position " + (i + 1) +
                                           ". " + literalArgument + " substituted for " +
                                           ((CycVariable) consequentArgument).cyclify());
                }
                else {
                    if (verbosity > 3)
                        System.out.println("  unification abandoned because formula not wff");
                    return null;
                }
            }
            else if (! (literalArgument.equals(consequentArgument))) {
                // Otherwise respective terms in the literal and horn clause consequent must be
                // equal for unification to succeed.
                if (verbosity > 3)
                    System.out.println("at argument position " + (i + 1) +
                                       ", " + literalArgument + " does not equal " +
                                       consequentArgument);
                return null;
            }
        }
        if (anyFalseViaKbLookup(unifiedHornClause.getAntecedantConjuncts()))
            return null;
        else if (anyFalseViaIrreflexsivity(unifiedHornClause.getAntecedantConjuncts()))
            return null;
        else
            return unifiedHornClause.getAntecedantConjuncts();
    }

    /**
     * Checks any ground antecedant conjuncts (having no variables) for truthfullness via KB
     * lookup, returning <tt>false</tt> iff any ground conjunct is false.  This check is not
     * performed if subsequent backchaining could prove the ground fact true.
     *
     * @param antecedantConjuncts
     * @return <tt>false</tt> iff any ground conjunct is false
     */
    protected boolean anyFalseViaKbLookup(ArrayList antecedantConjuncts) throws IOException {
        if (backchainer.backchainDepth < backchainer.maxBackchainDepth)
            return false;
        for (int i = 0; i < antecedantConjuncts.size(); i++) {
            Literal antecedantConjunct = (Literal) antecedantConjuncts.get(i);
            if (antecedantConjunct.isGround()) {
                boolean isAntecedantConjunctTrue =
                    CycAccess.current().isQueryTrue(antecedantConjunct.getFormula(),
                                                    backchainer.mt);
                    if (verbosity > 8)
                        System.out.println("asking KB about antecedant conjunct\n" +
                                           antecedantConjunct + "\n  --> " + isAntecedantConjunctTrue);
                if (! isAntecedantConjunctTrue) {
                    if (verbosity > 3)
                        System.out.println("  unification abandoned because antecedant conjunct is not true\n" +
                                           antecedantConjunct);
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Checks antecedant conjuncts for use of binary irreflexive predicates in a reflexsive situation, such as
     * (#$father ?X ?X) or other irreflexive predicates such as (#$different ?X ?X), returning <tt>false</tt> iff
     * any conjunct contains an invalid reflexsive usage.
     *
     * @param antecedantConjuncts
     * @return <tt>false</tt> iff any conjunct contains an invalid reflexsive usage
     */
    protected boolean anyFalseViaIrreflexsivity(ArrayList antecedantConjuncts) throws IOException {
        for (int i = 0; i < antecedantConjuncts.size(); i++) {
            Literal antecedantConjunct = (Literal) antecedantConjuncts.get(i);
            if (verbosity > 8) {
                System.out.println("  Screening irreflexivity usage\n  " +
                                   antecedantConjunct);
                System.out.println("    isIrreflexive " +
                                   antecedantConjunct.isIrreflexive(backchainer.mt));
                System.out.println("    isAllDifferent " +
                                   antecedantConjunct.isAllDifferent());
                System.out.println("    arguments size " +
                                   antecedantConjunct.getArguments().size());
                System.out.println("    arity " +
                                   antecedantConjunct.getArity());
            }
            if (antecedantConjunct.isIrreflexive(backchainer.mt) &&
                antecedantConjunct.getArguments().get(0).equals(antecedantConjunct.getArguments().get(1))) {
                if (verbosity > 1)
                    System.out.println("  unification abandoned because antecedant conjunct " +
                                       "contains invalid reflexive usage\n  " +
                                       antecedantConjunct);
                return true;
            }
            if (antecedantConjunct.isAllDifferent() &&
                antecedantConjunct.getArguments().containsDuplicates()) {
                if (verbosity > 1)
                    System.out.println("  unification abandoned because antecedant conjunct " +
                                       "contains invalid #$different usage\n  " +
                                       antecedantConjunct);
                return true;
            }
        }
        return false;
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