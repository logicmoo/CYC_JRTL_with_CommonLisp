/*
 * Do.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: Do.java,v 1.3 2003-09-24 00:06:42 piso Exp $
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
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */

package org.armedbear.lisp;

public final class Do extends Lisp
{
    // ### do
    private static final SpecialOperator DO = new SpecialOperator("do") {
        public LispObject execute(LispObject args, Environment env)
            throws ConditionThrowable
        {
            return _do(args, env, false);
        }
    };

    // ### do*
    private static final SpecialOperator DO_ = new SpecialOperator("do*") {
        public LispObject execute(LispObject args, Environment env)
            throws ConditionThrowable
        {
            return _do(args, env, true);
        }
    };

    private static final LispObject _do(LispObject args, Environment env,
                                        boolean sequential)
        throws ConditionThrowable
    {
        // Process variable specifications.
        LispObject first = args.car();
        args = args.cdr();
        int length = first.length();
        Symbol[] variables = new Symbol[length];
        LispObject[] initials = new LispObject[length];
        LispObject[] updates = new LispObject[length];
        for (int i = 0; i < length; i++) {
            LispObject obj = first.car();
            if (obj instanceof Cons) {
                variables[i] = checkSymbol(obj.car());
                initials[i] = obj.cadr();
                // Is there a step form?
                if (obj.cdr().cdr() != NIL)
                    updates[i] = obj.cdr().cdr().car();
            } else {
                // Not a cons, must be a symbol.
                variables[i] = checkSymbol(obj);
                initials[i] = NIL;
            }
            first = first.cdr();
        }
        final LispThread thread = LispThread.currentThread();
        Environment oldDynEnv = thread.getDynamicEnvironment();
        Environment ext = new Environment(env);
        for (int i = 0; i < length; i++) {
            Symbol symbol = variables[i];
            LispObject value =
                eval(initials[i], (sequential ? ext : env), thread);
            bind(symbol, value, ext);
        }
        LispObject second = args.car();
        LispObject test = second.car();
        LispObject resultForms = second.cdr();
        LispObject body = args.cdr();
        final int depth = thread.getStackDepth();
        // Look for tags.
        Binding tags = null;
        LispObject remaining = body;
        while (remaining != NIL) {
            LispObject current = remaining.car();
            remaining = remaining.cdr();
            if (current instanceof Cons)
                continue;
            // It's a tag.
            tags = new Binding(current, remaining, tags);
        }
        try {
            // Implicit block.
            while (true) {
                // Execute body.
                // Test for termination.
                if (eval(test, ext, thread) != NIL)
                    break;
                remaining = body;
                while (remaining != NIL) {
                    LispObject current = remaining.car();
                    if (current instanceof Cons) {
                        try {
                            // Handle GO inline if possible.
                            if (current.car() == Symbol.GO) {
                                LispObject code = null;
                                LispObject tag = current.cadr();
                                for (Binding binding = tags; binding != null; binding = binding.next) {
                                    if (binding.symbol.eql(tag)) {
                                        code = binding.value;
                                        break;
                                    }
                                }
                                if (code != null) {
                                    remaining = code;
                                    continue;
                                }
                                throw new Go(tag);
                            }
                            eval(current, ext, thread);
                        }
                        catch (Go go) {
                            LispObject code = null;
                            LispObject tag = go.getTag();
                            for (Binding binding = tags; binding != null; binding = binding.next) {
                                if (binding.symbol.eql(tag)) {
                                    code = binding.value;
                                    break;
                                }
                            }
                            if (code != null) {
                                remaining = code;
                                thread.setStackDepth(depth);
                                continue;
                            }
                            throw go;
                        }
                    }
                    remaining = remaining.cdr();
                }
                // Update variables.
                if (sequential) {
                    for (int i = 0; i < length; i++) {
                        LispObject update = updates[i];
                        if (update != null)
                            rebind(variables[i], eval(update, ext, thread), ext);
                    }
                } else {
                    // Evaluate step forms.
                    LispObject results[] = new LispObject[length];
                    for (int i = 0; i < length; i++) {
                        LispObject update = updates[i];
                        if (update != null) {
                            LispObject result = eval(update, ext, thread);
                            results[i] = result;
                        }
                    }
                    // Update variables.
                    for (int i = 0; i < length; i++) {
                        if (results[i] != null) {
                            Symbol symbol = variables[i];
                            rebind(symbol, results[i], ext);
                        }
                    }
                }
            }
            LispObject result = progn(resultForms, ext, thread);
            return result;
        }
        catch (Return ret) {
            if (ret.getTag() == NIL) {
                thread.setStackDepth(depth);
                return ret.getResult();
            }
            throw ret;
        }
        finally {
            thread.setDynamicEnvironment(oldDynEnv);
        }
    }
}
