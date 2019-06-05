/*
 * Closure.java
 *
 * Copyright (C) 2002-2008 Peter Graves
 * Copyright (C) 2008 Ville Voutilainen
 * $Id$
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 *
 * As a special exception, the copyright holders of this library give you
 * permission to link this library with independent modules to produce an
 * executable, regardless of the license terms of these independent
 * modules, and to copy and distribute the resulting executable under
 * terms of your choice, provided that you also meet, for each linked
 * independent module, the terms and conditions of the license of that
 * module.  An independent module is a module which is not derived from
 * or based on this library.  If you modify this library, you may extend
 * this exception to your version of the library, but you are not
 * obligated to do so.  If you do not wish to do so, delete this
 * exception statement from your version.
 */

package org.armedbear.lisp;

import static org.armedbear.lisp.Lisp.*;

abstract public class Closure extends Function
{
    // Parameter types.
    public static final int REQUIRED = 0;
    public static final int OPTIONAL = 1;
    public static final int KEYWORD = 2;
    public static final int REST = 3;
    public static final int AUX = 4;

    private final LispObject body;
    private final LispObject executionBody;
    protected final Environment environment;

    LispObject lambdaConstruct;

    private final Symbol[] freeSpecials;
    private final ArgumentListProcessor arglistProc;

    /** Construct a closure object with a lambda-list described
     * by these parameters.
     *
     *
     * @param required Required parameters or an empty array for none
     * @param optional Optional parameters or an empty array for none
     * @param keyword Keyword parameters or an empty array for none
     * @param keys NIL if the lambda-list doesn't contain &amp;key, T otherwise
     * @param rest the &amp;rest parameter, or NIL if none
     * @param moreKeys NIL if &amp;allow-other-keys not present, T otherwise
     */
    public Closure(ArgumentListProcessor arglist) {
        // stuff we don't need: we're a compiled function
        body = null;
        executionBody = null;
        environment = null;
        this.arglistProc = arglist;
        this.lambdaConstruct = null;
        freeSpecials = new Symbol[0];
    }

    public Closure(LispObject lambdaExpression, Environment env) {
        this(null, lambdaExpression, env);
    }

    public Closure(final LispObject name, final LispObject lambdaExpression, final Environment env)

    {
        super(name, lambdaExpression.cadr());

        lambdaConstruct = lambdaExpression;
        final LispObject lambdaList = getLambdaList();

        if (!(lambdaList == NIL || lambdaList instanceof Cons))
            program_error("The lambda list " + lambdaList.princToString() + " is invalid.");

        this.body = lambdaExpression.cddr();
        LispObject bodyAndDecls = parseBody(this.body, false);
        this.executionBody = bodyAndDecls.car();
        LispObject specials = parseSpecials(bodyAndDecls.NTH(1));

        this.environment = env;

        /* In the bootstrapping process, functions with MACRO LAMBDA LIST
         * lambda list types are being generated using the MACRO_FUNCTION instead
         * of the LAMBDA or NAMED_LAMBDA keys.
         *
         * Use that to perform argument list lambda list keyword checking.
         */
        arglistProc = new ArgumentListProcessor(this, lambdaList, specials,
                (lambdaExpression.car() == Symbol.MACRO_FUNCTION) ? ArgumentListProcessor.LambdaListType.MACRO
                        : ArgumentListProcessor.LambdaListType.ORDINARY);
        freeSpecials = arglistProc.freeSpecials(specials);
    }

    abstract public boolean isClosureSubclass();

    @Override
    final public LispObject typep(LispObject typeSpecifier) {
        boolean isClosureSubclass = isClosureSubclass();
        LispObject typeOf = typeOf();
        if (typeSpecifier == Symbol.COMPILED_FUNCTION) {
            if (!isClosureSubclass) {
                return NIL;
            }
            boolean wasGeneric = typep(Symbol.STANDARD_GENERIC_FUNCTION) != NIL;
            if (wasGeneric) {
                return NIL;
            }
            if (typeOf == typeSpecifier)
                return T;
            return T;
        }
        return super.typep(typeSpecifier);
    }

    public final LispObject getVariableList() {
        Symbol[] variables = arglistProc.getVariables();
        LispObject result = NIL;
        for (int i = variables.length; i-- > 0;)
            result = new Cons(variables[i], result);
        return result;
    }

    // Returns body as a list.
    public final LispObject getBody() {
        return body;
    }

    public final Environment getEnvironment() {
        return environment;
    }

    @Override
    public LispObject arrayify(LispObject... args) {
        return execute(args);
    }

    @Override
    final public String printObject() {
        LispObject name = getLambdaName();
        StringBuilder sb = new StringBuilder(getDotName(getClass()) + " ");
        final LispThread thread = LispThread.currentThread();
        final SpecialBindingsMark mark = thread.markSpecialBindings();
        thread.bindSpecial(Symbol.PRINT_LENGTH, Fixnum.THIRTY_TWO);// Fixnum.THREE);
        try {

            if (name != null && name != NIL) {
                sb.append(name.princToString());
                sb.append(' ');
            }

            if (lambdaConstruct != null) {
                sb.append("%lambdaConstruct= ");
                sb.append(toString1(this.lambdaConstruct));
            } else {

                int closeBrace = 0;
                LispObject lambdaList = getLambdaList();
                // name.
                if (name == null || name == NIL) {
                    sb.append("(LAMBDA ");
                    closeBrace++;
                }

                if (lambdaList != null) {
                    // args
                    if (lambdaList == NIL) {
                        sb.append("()");
                    } else {
                        sb.append(lambdaList.printObject());
                    }
                }

                while (closeBrace-- > 0)
                    sb.append(")");
            }
            sb.append("  ");
            sb.append(toString1(new Cons("%BODY= ", this.executionBody)));
            extraInfo(sb);

        } finally {
            thread.resetSpecialBindings(mark);
        }
        return unreadableString(sb.toString());
    }

    @Override
    public LispObject execute(LispObject[] args) {
        final LispThread thread = LispThread.currentThread();
        final SpecialBindingsMark mark = thread.markSpecialBindings();
        Environment ext = new Environment(environment);
        args = arglistProc.match(args, environment, ext, thread);
        arglistProc.bindVars(args, ext, thread);
        for (Symbol special : freeSpecials) {
            ext.declareSpecial(special);
        }
        try {
            return progn(executionBody, ext, thread);
        } finally {
            thread.resetSpecialBindings(mark);
        }
    }

    protected final LispObject[] processArgs(LispObject[] args, LispThread thread) {
        return arglistProc.match(args, environment, environment, thread);
    }
}
