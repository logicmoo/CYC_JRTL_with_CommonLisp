/*
 * Do.java
 *
 * Copyright (C) 2003-2006 Peter Graves
 * $Id: Do.java,v 1.14 2006-01-20 13:43:19 piso Exp $
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
  private static final SpecialOperator DO =
    new SpecialOperator(Symbol.DO, "varlist endlist &body body")
    {
      public LispObject execute(LispObject args, Environment env)
        throws ConditionThrowable
      {
        return _do(args, env, false);
      }
    };

  // ### do*
  private static final SpecialOperator DO_STAR =
    new SpecialOperator(Symbol.DO_STAR, "varlist endlist &body body")
    {
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
    LispObject varList = args.car();
    LispObject second = args.cadr();
    LispObject endTestForm = second.car();
    LispObject resultForms = second.cdr();
    LispObject body = args.cddr();
    // Process variable specifications.
    int length = varList.length();
    Symbol[] variables = new Symbol[length];
    LispObject[] initials = new LispObject[length];
    LispObject[] updates = new LispObject[length];
    for (int i = 0; i < length; i++)
      {
        LispObject obj = varList.car();
        if (obj instanceof Cons)
          {
            variables[i] = checkSymbol(obj.car());
            initials[i] = obj.cadr();
            // Is there a step form?
            if (obj.cdr().cdr() != NIL)
              updates[i] = obj.cdr().cdr().car();
          }
        else
          {
            // Not a cons, must be a symbol.
            variables[i] = checkSymbol(obj);
            initials[i] = NIL;
          }
        varList = varList.cdr();
      }
    final LispThread thread = LispThread.currentThread();
    SpecialBinding lastSpecialBinding = thread.lastSpecialBinding;
    // Process declarations.
    LispObject specials = NIL;
    while (body != NIL)
      {
        LispObject obj = body.car();
        if (obj instanceof Cons && obj.car() == Symbol.DECLARE)
          {
            LispObject decls = obj.cdr();
            while (decls != NIL)
              {
                LispObject decl = decls.car();
                if (decl instanceof Cons && decl.car() == Symbol.SPECIAL)
                  {
                    LispObject vars = decl.cdr();
                    while (vars != NIL)
                      {
                        specials = new Cons(vars.car(), specials);
                        vars = vars.cdr();
                      }
                  }
                decls = decls.cdr();
              }
            body = body.cdr();
          }
        else
          break;
      }
    final Environment ext = new Environment(env);
    for (int i = 0; i < length; i++)
      {
        Symbol symbol = variables[i];
        LispObject value =
          eval(initials[i], (sequential ? ext : env), thread);
        if (specials != NIL && memq(symbol, specials))
          {
            thread.bindSpecial(symbol, value);
            ext.declareSpecial(symbol);
          }
        else if (symbol.isSpecialVariable())
          {
            thread.bindSpecial(symbol, value);
          }
        else
          ext.bind(symbol, value);
      }
    final LispObject stack = thread.getStack();
    // Look for tags.
    LispObject remaining = body;
    while (remaining != NIL)
      {
        LispObject current = remaining.car();
        remaining = remaining.cdr();
        if (current instanceof Cons)
          continue;
        // It's a tag.
        ext.addTagBinding(current, remaining);
      }
    try
      {
        // Implicit block.
        ext.addBlock(NIL, new LispObject());
        while (true)
          {
            // Execute body.
            // Test for termination.
            if (eval(endTestForm, ext, thread) != NIL)
              break;
            remaining = body;
            while (remaining != NIL)
              {
                LispObject current = remaining.car();
                if (current instanceof Cons)
                  {
                    try
                      {
                        // Handle GO inline if possible.
                        if (current.car() == Symbol.GO)
                          {
                            LispObject tag = current.cadr();
                            Binding binding = ext.getTagBinding(tag);
                            if (binding != null && binding.value != null)
                              {
                                remaining = binding.value;
                                continue;
                              }
                            throw new Go(tag);
                          }
                        eval(current, ext, thread);
                      }
                    catch (Go go)
                      {
                        LispObject tag = go.getTag();
                        Binding binding = ext.getTagBinding(tag);
                        if (binding != null && binding.value != null)
                          {
                            remaining = binding.value;
                            thread.setStack(stack);
                            continue;
                          }
                        throw go;
                      }
                  }
                remaining = remaining.cdr();
              }
            // Update variables.
            if (sequential)
              {
                for (int i = 0; i < length; i++)
                  {
                    LispObject update = updates[i];
                    if (update != null)
                      {
                        Symbol symbol = variables[i];
                        LispObject value = eval(update, ext, thread);
                        if (symbol.isSpecialVariable() ||
                            (specials != NIL && memq(symbol, specials)))
                          thread.rebindSpecial(symbol, value);
                        else
                          ext.rebind(symbol, value);
                      }
                  }
              }
            else
              {
                // Evaluate step forms.
                LispObject results[] = new LispObject[length];
                for (int i = 0; i < length; i++)
                  {
                    LispObject update = updates[i];
                    if (update != null)
                      {
                        LispObject result = eval(update, ext, thread);
                        results[i] = result;
                      }
                  }
                // Update variables.
                for (int i = 0; i < length; i++)
                  {
                    if (results[i] != null)
                      {
                        Symbol symbol = variables[i];
                        LispObject value = results[i];
                        if (symbol.isSpecialVariable() ||
                            (specials != NIL && memq(symbol, specials)))
                          thread.rebindSpecial(symbol, value);
                        else
                          ext.rebind(symbol, value);
                      }
                  }
              }
            if (interrupted)
              handleInterrupt();
          }
        LispObject result = progn(resultForms, ext, thread);
        return result;
      }
    catch (Return ret)
      {
        if (ret.getTag() == NIL)
          {
            thread.setStack(stack);
            return ret.getResult();
          }
        throw ret;
      }
    finally
      {
        thread.lastSpecialBinding = lastSpecialBinding;
      }
  }
}
