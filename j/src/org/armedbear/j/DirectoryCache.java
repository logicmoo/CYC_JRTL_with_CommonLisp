/*
 * DirectoryCache.java
 *
 * Copyright (C) 2002 Peter Graves
 * $Id: DirectoryCache.java,v 1.1.1.1 2002-09-24 16:08:19 piso Exp $
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

import java.util.Vector;

public final class DirectoryCache
{
    private static final int timeout = 1800000; // 30 minutes

    private static DirectoryCache cache;

    private Vector entries = new Vector();

    public static DirectoryCache getDirectoryCache()
    {
        if (cache == null)
            cache = new DirectoryCache();
        return cache;
    }

    public synchronized String getListing(File file)
    {
        String netPath = file.netPath();
        for (int i = entries.size()-1; i >= 0; i--) {
            DirectoryCacheEntry entry = (DirectoryCacheEntry) entries.get(i);
            if (entry.getFile().netPath().equals(netPath)) {
                if (entry.getWhen() + timeout < System.currentTimeMillis()) {
                    Log.debug("removing cache entry for " + entry.getFile().netPath());
                    entries.remove(i);
                    return null;
                }
                return entry.getListing();
            }
        }
        return null;
    }

    public synchronized void put(File file, String listing)
    {
        entries.add(new DirectoryCacheEntry(file, listing, System.currentTimeMillis()));
    }

    public synchronized void purge(String hostname)
    {
        for (int i = entries.size()-1; i >= 0; i--) {
            DirectoryCacheEntry entry = (DirectoryCacheEntry) entries.get(i);
            if (entry.getFile().getHostName().equals(hostname)) {
                Log.debug("removing cache entry for " + entry.getFile().netPath());
                entries.remove(i);
            }
        }
    }

    public synchronized void purge(File file)
    {
        String netPath = file.netPath();
        for (int i = entries.size()-1; i >= 0; i--) {
            DirectoryCacheEntry entry = (DirectoryCacheEntry) entries.get(i);
            if (entry.getFile().netPath().equals(netPath)) {
                Log.debug("removing cache entry for " + netPath);
                entries.remove(i);
            }
        }
    }
}
