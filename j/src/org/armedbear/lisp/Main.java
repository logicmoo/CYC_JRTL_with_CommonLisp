/*
 * Main.java
 *
 * Copyright (C) 2002-2006 Peter Graves
 * $Id: Main.java,v 1.8 2006-01-19 19:42:09 piso Exp $
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

public final class Main
{
  public static final long startTimeMillis = System.currentTimeMillis();

  public static void main(final String[] args)
  {
    // Run the interpreter in a secondary thread so we can control the stack
    // size.
    Runnable r = new Runnable()
      {
        public void run()
        {
          Interpreter interpreter = Interpreter.createDefaultInstance(args);
          if (interpreter != null)
          interpreter.run();
        }
      };
    new Thread(null, r, "interpreter", 4194304L).start();
  }
}
