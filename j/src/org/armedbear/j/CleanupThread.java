/*
 * CleanupThread.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: CleanupThread.java,v 1.1 2003-05-19 14:29:33 piso Exp $
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

package org.armedbear.j;

import javax.swing.SwingUtilities;

public final class CleanupThread extends Thread
{
    private final Runnable runnable;
    private boolean cancelled;

    public CleanupThread(Runnable r)
    {
        super("cleanup");
        runnable = r;
    }

    public void run()
    {
        while (true) {
            try {
                Thread.sleep(60000); // 60 seconds
            }
            catch (InterruptedException e) {
                Log.debug("cleanup thread interrupted");
            }
            if (cancelled) {
                Log.debug("CleanupThread.run() exiting");
                return;
            }
            SwingUtilities.invokeLater(runnable);
        }
    }

    public void cancel()
    {
        Log.debug("CleanupThread.cancel()");
        cancelled = true;
        interrupt();
    }
}
