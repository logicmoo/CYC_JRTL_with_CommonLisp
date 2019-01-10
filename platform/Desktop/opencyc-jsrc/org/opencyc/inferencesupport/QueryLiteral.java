package org.opencyc.inferencesupport;

import java.util.*;
import org.opencyc.cycobject.*;
import org.opencyc.api.*;
import java.io.IOException;

/**
 * <tt>QueryLiteral</tt> object to model the attributes and behavior of a query literal.<p>
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
public class QueryLiteral extends Literal implements Comparable{

    /**
     * Constructs a new <tt>QueryLiteral</tt> object from a <tt>CycList</tt> <tt>String</tt>
     * representation.<p>
     *
     * @param formulaString the query literal's formula <tt>String</tt>, which must be a well formed OpenCyc
     * query represented by a <tt>CycList</tt>.
     */
    public QueryLiteral (String formulaString) throws CycApiException {
        formula = CycAccess.current().makeCycList(formulaString);
        gatherVariables();
    }

    /**
     * Constructs a new <tt>QueryLiteral</tt> object from a <tt>CycList</tt>.<p>
     *
    * @param formula the query literal's formula, which must be a well formed OpenCyc
     * query represented by a <tt>CycList</tt>.
     */
    public QueryLiteral(CycList formula) {
        this.formula = formula;
        gatherVariables();
    }

    /**
     * Simplifies a query literal expression.<p>
     * (#$and (<query literal1> <query literal2> ... <query literalN>)
     * becomes <query literal1> <query literal2> ... <query literalN>
     *
     * @param cycList the query literal expression that is simplified
     * @return an <tt>ArrayList</tt> of <tt>QueryLiteral</tt> objects.
     * @see UnitTest#testQueryLiteral
     */
    public static ArrayList simplifyQueryLiteralExpression(CycList cycList) throws IOException {
        ArrayList queryLiterals = new ArrayList();
        if (cycList.size() < 2)
            throw new RuntimeException("Invalid query literal: " + cycList);
        Object object = cycList.first();
        if (object instanceof CycConstant &&
            ((CycConstant) object).equals(CycAccess.and))
            for (int i = 1; i < cycList.size(); i++)
                queryLiterals.add(new QueryLiteral((CycList) cycList.get(i)));
        else
            queryLiterals.add(new QueryLiteral(cycList));
        return queryLiterals;
    }

    /**
     * Creates and returns a copy of this <tt>QueryLiteral</tt>.
     *
     * @return a clone of this instance
     */
    public Object clone() {
        return new QueryLiteral((CycList) this.formula.clone());
    }

    /**
     * Returns a new <tt>QueryLiteral</tt> which is the result of substituting the given
     * <tt>Object</tt> value for the given <tt>CycVariable</tt>.
     *
     * @param cycVariable the variable for substitution
     * @param value the value which is substituted for each occurrance of the variable
     * @return a new <tt>QueryLiteral</tt> which is the result of substituting the given
     * <tt>Object</tt> value for the given <tt>CycVariable</tt>
     */
    public QueryLiteral instantiate(CycVariable cycVariable, Object value) {
        if (! variables.contains(cycVariable))
            throw new RuntimeException("Cannot instantiate " + cycVariable +
                                       " in query literal " + this);
        CycList newQueryLiteral = formula.subst(value, cycVariable);
        return new QueryLiteral(newQueryLiteral);
    }

    public static QueryLiteral conjoin (QueryLiteral queryLiteral1, QueryLiteral queryLiteral2) {
        CycList formula1 = queryLiteral1.getFormula();
        CycList formula2 = queryLiteral2.getFormula();
        CycList conjoinedFormula;
        if (formula1.first().equals(CycAccess.and)) {
            conjoinedFormula = (CycList) formula1.clone();
            conjoinedFormula.add(formula2);
        }
        else if (formula2.first().equals(CycAccess.and)) {
            conjoinedFormula = (CycList) formula2.clone();
            conjoinedFormula.add(formula1);
        }
        else {
            conjoinedFormula = new CycList();
            conjoinedFormula.add(CycAccess.and);
            conjoinedFormula.add(formula1);
            conjoinedFormula.add(formula2);
        }
        return new QueryLiteral(conjoinedFormula);
    }
}