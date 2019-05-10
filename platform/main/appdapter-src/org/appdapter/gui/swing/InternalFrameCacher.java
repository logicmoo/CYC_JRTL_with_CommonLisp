package org.appdapter.gui.swing;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.swing.JInternalFrame;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;

public class InternalFrameCacher {
	private HashMap map = new HashMap();
	private Listener listener = new Listener();

	public InternalFrameCacher() {
	}

	public synchronized void add(Object key, JInternalFrame frame) {
		map.put(key, frame);
		frame.addInternalFrameListener(listener);
	}

	public synchronized JInternalFrame get(Object key) {
		return (JInternalFrame) map.get(key);
	}

	public synchronized void remove(Object key) {
		map.remove(key);
	}

	public boolean show(Object key) {
		JInternalFrame f = get(key);
		if (f == null) {
			return false;
		} else {
			f.show();
			return true;
		}
	}

	public synchronized void removeFrame(JInternalFrame f) {
		Iterator it = map.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry) it.next();
			if (entry.getValue().equals(f)) {
				map.remove(entry.getKey());
				f.removeInternalFrameListener(listener);
				return;
			}
		}
	}

	class Listener implements InternalFrameListener {
		@Override
		public void internalFrameOpened(InternalFrameEvent e) {
		}

		@Override
		public void internalFrameClosing(InternalFrameEvent e) {
		}

		@Override
		public void internalFrameClosed(InternalFrameEvent e) {
			removeFrame((JInternalFrame) e.getSource());
		}

		@Override
		public void internalFrameIconified(InternalFrameEvent e) {
		}

		@Override
		public void internalFrameDeiconified(InternalFrameEvent e) {
		}

		@Override
		public void internalFrameActivated(InternalFrameEvent e) {
		}

		@Override
		public void internalFrameDeactivated(InternalFrameEvent e) {
		}
	}
}