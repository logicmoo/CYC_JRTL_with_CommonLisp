/*
 * ImageLine.java
 *
 * Copyright (C) 2000-2002 Peter Graves
 * $Id: ImageLine.java,v 1.2 2002/11/27 23:57:31 piso Exp $
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

import java.awt.Image;
import java.awt.Rectangle;

public final class ImageLine extends AbstractLine implements Line
{
    private Image image;
    private final int imageHeight;
    private final int imageWidth;
    private final int height;
    private final Rectangle rect;

    public ImageLine(Image image, Rectangle r)
    {
        this.image = image;
        rect = new Rectangle(r);
        height = Math.max(r.height, Display.getCharHeight());;
        imageHeight = r.height;
        imageWidth = r.width;
    }

    public final Image getImage()
    {
        return image;
    }

    public final Rectangle getRect()
    {
        return rect;
    }

    public final int getImageHeight()
    {
        return imageHeight;

    }

    public final int getImageWidth()
    {
        return imageWidth;
    }

    @Override
	public final int getHeight()
    {
        return height;
    }

    @Override
	public final int getWidth()
    {
        return getImageWidth();
    }

    @Override
	public final int flags()
    {
        return 0;
    }

    @Override
	public final void setFlags(int flags)
    {
    }

    @Override
	public String getText()
    {
        return null;
    }

    @Override
	public final void setText(String s)
    {
    }

    @Override
	public final char charAt(int i)
    {
        return '\0';
    }

    @Override
	public final String substring(int beginIndex)
    {
        return null;
    }

    @Override
	public final String substring(int beginIndex, int endIndex)
    {
        return null;
    }

    @Override
	public final String trim()
    {
        return null;
    }

    @Override
	public final int length()
    {
        return 0;
    }

    @Override
	public final byte[] getBytes(String encoding)
    {
        return null;
    }

    @Override
	public final boolean isBlank()
    {
        return false;
    }
    
    public final void flushImage()
    {
        if (image != null) {
            image.flush();
            image = null;
        }        
    }
    
    @Override
	protected void finalize() throws Throwable
    {
        flushImage();
        super.finalize();
    }
}
