/*
 * ComponentAdapter.java
 *
 * Copyright (C) 2003 Peter Graves
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

package com.cyc.tool.subl.jrtl.nativeCode.commonLisp.java.awt;

import java.awt.Component;
import java.awt.event.ComponentEvent;

import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.JHandler;

public class ComponentAdapter extends java.awt.event.ComponentAdapter {

	public static synchronized void addTo(Component component) {
		component.addComponentListener(new ComponentAdapter());
	}

	private void call(String s, ComponentEvent componentevent) {
		JHandler.callLisp(s, componentevent.getComponent(), componentevent.paramString());
	}

	public void componentHidden(ComponentEvent componentevent) {
		this.call("COMPONENTHIDDEN", componentevent);
	}

	public void componentMoved(ComponentEvent componentevent) {
		this.call("COMPONENTMOVED", componentevent);
	}

	public void componentResized(ComponentEvent componentevent) {
		this.call("COMPONENTRESIZED", componentevent);
	}

	public void componentShown(ComponentEvent componentevent) {
		this.call("COMPONENTSHOWN", componentevent);
	}
}
