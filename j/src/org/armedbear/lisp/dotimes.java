/*
 * dotimes.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: dotimes.java,v 1.7 2004-03-16 02:41:25 piso Exp $
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
            Environment ext = new Environment(env);
            // Look for tags.
            LispObject remaining = bodyForm;
            while (remaining != NIL) {
                LispObject current = remaining.car();
                remaining = remaining.cdr();
                if (current instanceof Cons)
                    continue;
                // It's a tag.
                ext.addTagBinding(current, remaining);
            }
            // Implicit block.
            ext.addBlock(NIL, new Block());
            LispObject result;
            // Establish a reusable binding.
            final Binding binding;
            if (specials != NIL && memq(var, specials)) {
                thread.bindSpecial(var, null);
                binding = thread.getDynamicEnvironment().getBinding(var);
                ext.declareSpecial(var);
            } else if (var.isSpecialVariable()) {
                thread.bindSpecial(var, null);
                binding = thread.getDynamicEnvironment().getBinding(var);
            } else {
                ext.bind(var, null);
                binding = ext.getBinding(var);
            }
            if (limit instanceof Fixnum) {
                int count = ((Fixnum)limit).getValue();
                int i;
                for (i = 0; i < count; i++) {
                    binding.value = new Fixnum(i);
                    LispObject body = bodyForm;
                    while (body != NIL) {
                        LispObject current = body.car();
                        if (current instanceof Cons) {
                            try {
                                // Handle GO inline if possible.
                                if (current.car() == Symbol.GO) {
                                    LispObject tag = current.cadr();
                                    Binding b = ext.getTagBinding(tag);
                                    if (b != null && b.value != null) {
                                        body = b.value;
                                        continue;
                                    }
                                    throw new Go(tag);
                                }
                                eval(current, ext, thread);
                            }
                            catch (Go go) {
                                LispObject tag = go.getTag();
                                Binding b = ext.getTagBinding(tag);
                                if (b != null && b.value != null) {
                                    body = b.value;
                                    thread.setStackDepth(depth);
                                    continue;
                                }
                                throw go;
                            }
                        }
                        body = body.cdr();
                    }
                }
                binding.value = new Fixnum(i);
                result = eval(resultForm, ext, thread);
            } else if (limit instanceof Bignum) {
                LispObject i = Fixnum.ZERO;
                while (i.isLessThan(limit)) {
                    binding.value = i;
                    LispObject body = bodyForm;
                    while (body != NIL) {
                        LispObject current = body.car();
                        if (current instanceof Cons) {
                            try {
                                // Handle GO inline if possible.
                                if (current.car() == Symbol.GO) {
                                    LispObject tag = current.cadr();
                                    Binding b = ext.getTagBinding(tag);
                                    if (b != null && b.value != null) {
                                        body = b.value;
                                        continue;
                                    }
                                    throw new Go(tag);
                                }
                                eval(current, ext, thread);
                            }
                            catch (Go go) {
                                LispObject code = null;
                                LispObject tag = go.getTag();
                                Binding b = ext.getTagBinding(tag);
                                if (b != null && b.value != null) {
                                    body = b.value;
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
                binding.value = i;
                result = eval(resultForm, ext, thread);
            } else
                return signal(new TypeError(limit, Symbol.INTEGER));
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
