/*
 * Environment.java
 *
 * Copyright (C) 2002-2003 Peter Graves
 * $Id: Environment.java,v 1.3 2003-03-10 19:35:00 piso Exp $
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

public final class Environment extends LispObject
{
    private Binding lastBinding;
    private Binding lastFunctionalBinding;

    public Environment() {}

    public Environment(Environment parent)
    {
        if (parent != null) {
            this.lastBinding = parent.lastBinding;
            this.lastFunctionalBinding = parent.lastFunctionalBinding;
        }
    }

    public boolean isEmpty()
    {
        return (lastBinding == null && lastFunctionalBinding == null);
    }

    public void bind(Symbol symbol, LispObject value)
    {
        lastBinding = new Binding(symbol, value, lastBinding);
    }

    public void rebind(Symbol symbol, LispObject value)
    {
        Binding binding = getBinding(symbol);
        binding.value = value;
    }

    public LispObject lookup(LispObject symbol)
    {
        Binding binding = lastBinding;
        while (binding != null) {
            if (binding.symbol == symbol)
                return binding.value;
            binding = binding.next;
        }
        return null;
    }

    public Binding getBinding(LispObject symbol)
    {
        Binding binding = lastBinding;
        while (binding != null) {
            if (binding.symbol == symbol)
                return binding;
            binding = binding.next;
        }
        return null;
    }

    // Functional bindings.
    public void bindFunctional(Symbol symbol, LispObject value)
    {
        lastFunctionalBinding =
            new Binding(symbol, value, lastFunctionalBinding);
    }

    public LispObject lookupFunctional(LispObject symbol)
    {
        Binding binding = lastFunctionalBinding;
        while (binding != null) {
            if (binding.symbol == symbol)
                return binding.value;
            binding = binding.next;
        }
        return null;
    }

    public String toString()
    {
        StringBuffer sb = new StringBuffer();
        sb.append("#<ENVIRONMENT");
        Binding binding = lastBinding;
        while (binding != null) {
            sb.append(' ');
            sb.append(binding.symbol.getName());
            sb.append(" = ");
            sb.append(binding.value);
            binding = binding.next;
            if (binding != null)
                sb.append(",");
        }
        sb.append(">");
        return sb.toString();
    }
}
