/*
 * dotimes.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: dotimes.java,v 1.3 2003-11-19 17:04:09 piso Exp $
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

public final class dotimes extends SpecialOperator
{
    private dotimes()
    {
        super("dotimes");
    }

    public LispObject execute(LispObject args, Environment env)
        throws ConditionThrowable
    {
        LispObject bodyForm = args.cdr();
        args = args.car();
        Symbol var = checkSymbol(args.car());
        LispObject countForm = args.cadr();
        final LispThread thread = LispThread.currentThread();
        LispObject resultForm = args.cdr().cdr().car();
        Environment oldDynEnv = thread.getDynamicEnvironment();
        int depth = thread.getStackDepth();
        // Process declarations.
        LispObject specials = NIL;
        while (bodyForm != NIL) {
            LispObject obj = bodyForm.car();
            if (obj instanceof Cons && obj.car() == Symbol.DECLARE) {
                LispObject decls = obj.cdr();
                while (decls != NIL) {
                    LispObject decl = decls.car();
                    if (decl instanceof Cons && decl.car() == Symbol.SPECIAL) {
                        LispObject vars = decl.cdr();
                        while (vars != NIL) {
                            specials = new Cons(vars.car(), specials);
                            vars = vars.cdr();
                        }
                    }
                    decls = decls.cdr();
                }
                bodyForm = bodyForm.cdr();
            } else
                break;
        }
        try {
            LispObject limit = eval(countForm, env, thread);
            // Look for tags.
            Binding tags = null;
            LispObject remaining = bodyForm;
            while (remaining != NIL) {
                LispObject current = remaining.car();
                remaining = remaining.cdr();
                if (current instanceof Cons)
                    continue;
                // It's a tag.
                tags = new Binding(current, remaining, tags);
            }
            LispObject result;
            if (limit instanceof Fixnum) {
                int count = ((Fixnum)limit).getValue();
                int i;
                for (i = 0; i < count; i++) {
                    Environment ext = new Environment(env);
                    if (specials != NIL && memq(var, specials)) {
                        thread.bindSpecial(var, new Fixnum(i));
                        ext.declareSpecial(var);
                    } else if (var.isSpecialVariable()) {
                        thread.bindSpecial(var, new Fixnum(i));
                    } else
                        ext.bind(var, new Fixnum(i));
                    LispObject body = bodyForm;
                    while (body != NIL) {
                        LispObject current = body.car();
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
                                        body = code;
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
                                    body = code;
                                    thread.setStackDepth(depth);
                                    continue;
                                }
                                throw go;
                            }
                        }
                        body = body.cdr();
                    }
                }
                Environment ext = new Environment(env);
                bind(var, new Fixnum(i), ext);
                result = eval(resultForm, ext, thread);
            } else if (limit instanceof Bignum) {
                LispObject i = Fixnum.ZERO;
                while (i.isLessThan(limit)) {
                    Environment ext = new Environment(env);
                    bind(var, i, ext);
                    LispObject body = bodyForm;
                    while (body != NIL) {
                        LispObject current = body.car();
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
                                        body = code;
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
                                    body = code;
                                    thread.setStackDepth(depth);
                                    continue;
                                }
                                throw go;
                            }
                        }
                        body = body.cdr();
                    }
                    i = i.incr();
                }
                Environment ext = new Environment(env);
                bind(var, i, ext);
                result = eval(resultForm, ext, thread);
            } else
                throw new ConditionThrowable(new TypeError(limit, "integer"));
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

    private static final dotimes DOTIMES = new dotimes();
}
