/*
 * dolist.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: dolist.java,v 1.1 2003-09-23 15:42:41 piso Exp $
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
        try {
            LispObject list = checkList(eval(listForm, env, thread));
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
            while (list != NIL) {
                Environment ext = new Environment(env);
                bind(var, list.car(), ext);
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
                list = list.cdr();
            }
            Environment ext = new Environment(env);
            bind(var, NIL, ext);
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
