/*
 * dolist.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: dolist.java,v 1.7 2004-05-29 18:40:56 piso Exp $
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

// ### dolist
public final class dolist extends SpecialOperator
{
    private dolist()
    {
        super("dolist");
    }

    public LispObject execute(LispObject args, Environment env)
        throws ConditionThrowable
    {
        LispObject bodyForm = args.cdr();
        args = args.car();
        Symbol var = checkSymbol(args.car());
        LispObject listForm = args.cadr();
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
            LispObject list = checkList(eval(listForm, env, thread));
            final Environment ext = new Environment(env);
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
            // Establish a reusable binding.
            final Binding binding;
            if (var.isSpecialVariable() || (specials != NIL && memq(var, specials))) {
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
            while (list != NIL) {
                binding.value = list.car();
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
                list = list.cdr();
                if (interrupted)
                    handleInterrupt();
            }
            binding.value = NIL;
            LispObject result = eval(resultForm, ext, thread);
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

    private static final dolist DOLIST = new dolist();
}
