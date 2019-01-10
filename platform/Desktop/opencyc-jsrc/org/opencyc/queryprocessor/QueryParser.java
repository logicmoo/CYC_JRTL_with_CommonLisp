package org.opencyc.queryprocessor;

import java.util.*;
import java.io.IOException;

import org.opencyc.cycobject.*;
import org.opencyc.api.*;
import org.opencyc.inferencesupport.*;

/**
 * <tt>QueryParser</tt> object to model the attributes and behavior of
 * a parser which inputs the query representation and sets up
 * the parent <tt>QueryProcessor</tt> object.<p>
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
 * @see UnitTest#testQueryProcessor
 */
public class QueryParser {
    /**
     * Reference to the parent <tt>QueryProcessor</tt> object.
     */
    protected QueryProcessor queryProcessor;

    /**
     * Reference to the parent list of query literals.
     */
    protected ArrayList queryLiterals;

    /**
     * Reference to the parent list of constraint rules.
     */
    protected ArrayList constraintRules;

    /**
     * Sets verbosity of the constraint solver output.  0 --> quiet ... 9 -> maximum
     * diagnostic input.
     */
    protected int verbosity = QueryProcessor.DEFAULT_VERBOSITY;

    /**
     * Constructs a new <tt>QueryParser</tt> object for the parent
     * <tt>QueryProcessor</tt>.
     *
     * @param queryProcessor the parent constraint problem
     */
    public QueryParser(QueryProcessor queryProcessor) {
        this.queryProcessor = queryProcessor;
        queryLiterals = new ArrayList();
        queryProcessor.queryLiterals = this.queryLiterals;
        constraintRules = new ArrayList();
        queryProcessor.constraintRules = this.constraintRules;
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
     * Simplifies the input problem into its constituent <tt>QueryLiteral</tt> and
     * <tt>ConstraintRule</tt> objects,
     * If a ground fact discovered among the query literals is proven false, then immediately
     * return the value false.  If a query literal has no bindings, then immediately return the value false
     *
     * @return <tt>false</tt> if no further backchaining is possible and a query literal cannot be satisfied,
     * otherwise return <tt>true</tt>
     */
    public boolean extractQueryLiterals() throws IOException {
        ArrayList literals = QueryLiteral.simplifyQueryLiteralExpression(queryProcessor.query);
        for (int i = 0; i < literals.size(); i++) {
            Literal literal = (Literal) literals.get(i);
            if (literal.isEvaluatable()) {
                ConstraintRule constraintRule = new ConstraintRule(literal.getFormula());
                constraintRules.add(constraintRule);
            }
            else {
                queryLiterals.add((QueryLiteral) literal);
            }

        }
        // Sort by ascending arity to find likely unsatisfiable facts first.
        Collections.sort(queryLiterals);
        for (int i = 0; i < queryLiterals.size(); i++) {
            QueryLiteral queryLiteral = (QueryLiteral) queryLiterals.get(i);
            if ((queryProcessor.backchainer.backchainDepth ==
                 queryProcessor.backchainer.maxBackchainDepth) &&
                (! isQueryLiteralSatisfiable(queryLiteral)))
                return false;
        }
        if (verbosity > 1) {
            queryProcessor.displayQueryLiterals();
            queryProcessor.displayConstraintRules();
        }
        return true;
    }

    /**
     * Returns <tt>true</tt> iff the queryLiteral cannot be satisfied.
     *
     * @param queryLiteral the query literal to check in the KB
     * @return <tt>true</tt> iff the queryLiteral cannot be satisfied
     */
    protected boolean isQueryLiteralSatisfiable(QueryLiteral queryLiteral) throws IOException {
        if (queryLiteral.isGround()) {
            if (verbosity > 3)
                System.out.println("Ground fact with no backchaining possible\n" + queryLiteral);
            boolean isTrueFact = CycAccess.current().isQueryTrue(queryLiteral.getFormula(), queryProcessor.mt);
            if (verbosity > 3)
                System.out.println("  --> " + isTrueFact);
            if (! isTrueFact)
                return false;
        }
        CycConstant term = null;
        Integer argumentPostion = null;
        for (int j = 0; j < queryLiteral.getArguments().size(); j++) {
            Object argument = queryLiteral.getArguments().get(j);
            if (argument instanceof CycConstant) {
                term = (CycConstant) argument;
                argumentPostion = new Integer(j + 1);
                break;
            }
        }
        if (term != null) {
            boolean someInstancesExist =
                CycAccess.current().hasSomePredicateUsingTerm(queryLiteral.getPredicate(),
                                                              term,
                                                              argumentPostion,
                                                              queryProcessor.mt);
            if (! someInstancesExist) {
                if (verbosity > 3)
                    System.out.println("No instances exist and with no backchaining possible\n" + queryLiteral);
                return false;
            }
        }
        return true;
    }

    /**
     * Gathers the unique variables used in this constraint problem.
     */
    public void gatherVariables() {
        HashSet uniqueVariables = new HashSet();
        for (int i = 0; i < queryProcessor.queryLiterals.size(); i++) {
            QueryLiteral queryLiteral = (QueryLiteral) queryProcessor.queryLiterals.get(i);
            uniqueVariables.addAll(queryLiteral.getVariables());
        }
        queryProcessor.variables.addAll(uniqueVariables);
    }


}