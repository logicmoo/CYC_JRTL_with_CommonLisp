/*
 * JdbCommands.java
 *
 * Copyright (C) 2002-2003 Peter Graves
 * $Id: JdbCommands.java,v 1.5 2003-05-17 17:36:50 piso Exp $
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

package org.armedbear.j.jdb;

public final class JdbCommands implements JdbConstants
{
    public static int findCommand(String cmd)
    {
        // Single-letter abbreviations for the most common commands.
        if (cmd.equals("b"))
            return JDB_BREAK;
        if (cmd.equals("c"))
            return JDB_CONTINUE;
        if (cmd.equals("n"))
            return JDB_NEXT;
        if (cmd.equals("s"))
            return JDB_STEP;
        if (cmd.equals("p"))
            return JDB_PRINT;

        if ("break".startsWith(cmd))
            return JDB_BREAK;
        if ("clear".startsWith(cmd))
            return JDB_CLEAR;
        if ("continue".startsWith(cmd))
            return JDB_CONTINUE;
        if ("finish".startsWith(cmd))
            return JDB_FINISH;
        if ("go".startsWith(cmd))
            return JDB_CONTINUE;
        if ("locals".startsWith(cmd))
            return JDB_LOCALS;
        if ("next".startsWith(cmd))
            return JDB_NEXT;
        if ("print".startsWith(cmd))
            return JDB_PRINT;
        if ("quit".startsWith(cmd))
            return JDB_QUIT;
        if ("restart".startsWith(cmd))
            return JDB_RESTART;
        if ("resume".startsWith(cmd))
            return JDB_CONTINUE;
        if ("step".startsWith(cmd))
            return JDB_STEP;
        if ("stop".startsWith(cmd))
            return JDB_BREAK;
        if ("suspend".startsWith(cmd))
            return JDB_SUSPEND;

        if (cmd.equals("stdin"))
            return JDB_STDIN;

        return -1;
    }

    public static void jdbContinue()
    {
        command("continue");
    }

    public static void jdbFinish()
    {
        command("finish");
    }

    public static void jdbLocals()
    {
        command("locals");
    }

    public static void jdbNext()
    {
        command("next");
    }

    public static void jdbQuit()
    {
        command("quit");
    }

    public static void jdbRestart()
    {
        command("restart");
    }

    public static void jdbStep()
    {
        command("step");
    }

    public static void jdbSuspend()
    {
        command("suspend");
    }

    public static void command(String s)
    {
        Jdb jdb = Jdb.findJdb();
        if (jdb != null)
            jdb.doCommand(s);
    }
}
