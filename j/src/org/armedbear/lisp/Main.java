/*
 * Main.java
 *
 * Copyright (C) 2002-2004 Peter Graves
 * $Id: Main.java,v 1.4 2004-03-25 01:20:46 piso Exp $
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

    public static void main(String[] args)
    {
        Interpreter interpreter = Interpreter.createInstance();

        boolean print = true;

        // check for command-line args
        if (args.length > 0) {
            interpreter.initializeLisp(false);

            for (int i = 0; i < args.length; ++i) {
                if (args[i].equals("--noprint")) {
                    print = false;
                } else if (args[i].equals("--eval")) {
                    if (i+1 < args.length) {
                        LispObject result = null;
                        try {
                            result = interpreter.evaluate(args[i+1]);
                        }
                        catch (ConditionThrowable c) {
                            System.err.println("Caught condition: " +
                                               c.getCondition().toString() +
                                               " while evaluating: " +
                                               args[i+1]);
                            System.exit(2);
                        }
                        ++i;
                        if (print)
                            System.out.println(String.valueOf(result)); // TODO: multiple values
                    } else {
                        System.err.println("No argument supplied to --eval");
                        System.exit(1);
                    }
                } else if (args[i].equals("--load")) {
                    if (i+1 < args.length) {
                        LispObject result = null;
                        try {
                            // String loadStr = "(load \"" + String.valueOf(args[i+1]) + "\")";
                            result = Load.load(args[i+1], false, false, true);
                        }
                        catch (ConditionThrowable c) {
                            System.err.println("Caught condition: " +
                                               c.getCondition().toString() +
                                               " while loading: " +
                                               args[i+1]);
                            System.exit(2);
                        }
                        ++i;
                        if (print)
                            System.out.println(String.valueOf(result));
                    } else {
                        System.err.println("No argument supplied to --load");
                        System.exit(1);
                    }
                }
            }
        }
        // Now the toplevel will run unless we got an error or the user called
        // EXTENSIONS:EXIT.
        if (interpreter != null)
            interpreter.run();
    }
}
