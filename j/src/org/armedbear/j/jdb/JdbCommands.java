/*
 * JdbCommands.java
 *
 * Copyright (C) 2002-2003 Peter Graves
 * $Id: JdbCommands.java,v 1.4 2003-05-16 02:48:32 piso Exp $
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

public final class JdbCommands
{
    public static String findCommand(String cmd)
    {
        // Single-letter abbreviations for the most common commands.
        if (cmd.equals("b"))
            return "stop";
        if (cmd.equals("c"))
            return "resume";
        if (cmd.equals("n"))
            return "next";
        if (cmd.equals("s"))
            return "step";
        if (cmd.equals("p"))
            return "print";

        if ("break".startsWith(cmd))
            return "stop";
        if ("clear".startsWith(cmd))
            return "clear";
        if ("continue".startsWith(cmd))
            return "resume";
        if ("finish".startsWith(cmd))
            return "finish";
        if ("go".startsWith(cmd))
            return "resume";
        if ("locals".startsWith(cmd))
            return "locals";
        if ("next".startsWith(cmd))
            return "next";
        if ("print".startsWith(cmd))
            return "print";
        if ("quit".startsWith(cmd))
            return "quit";
        if ("restart".startsWith(cmd))
            return "restart";
        if ("resume".startsWith(cmd))
            return "resume";
        if ("step".startsWith(cmd))
            return "step";
        if ("stop".startsWith(cmd))
            return "stop";
        if ("suspend".startsWith(cmd))
            return "suspend";

        if (cmd.equals("stdin"))
            return "stdin";

        return null;
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

    public static void jdbResume()
    {
        command("resume");
    }

    public static void jdbStep()
    {
        command("step");
    }

    public static void jdbStepOut()
    {
        command("step out");
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
