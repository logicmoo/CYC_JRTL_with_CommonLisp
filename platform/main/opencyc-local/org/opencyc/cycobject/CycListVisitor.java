package org.opencyc.cycobject;

import org.opencyc.api.CycObjectFactory;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;
import java.util.Enumeration;

public class CycListVisitor implements Enumeration {
	protected Object nextElement;
	protected Stack iterators;

	public CycListVisitor(final CycList cycList) {
		this.nextElement = null;
		(this.iterators = new Stack()).push(cycList.iterator());
		this.getNextElement();
	}

	@Override
	public boolean hasMoreElements() {
		return this.nextElement != null;
	}

	@Override
	public Object nextElement() {
		if (this.nextElement == null) {
			throw new NoSuchElementException();
		}
		final Object answer = this.nextElement;
		this.getNextElement();
		return answer;
	}

	protected void getNextElement() {
		this.nextElement = null;
		while (!this.iterators.empty()) {
			final Iterator iterator = (Iterator) this.iterators.peek();
			if (!iterator.hasNext()) {
				this.iterators.pop();
			} else {
				final Object element = iterator.next();
				if (element.equals(CycObjectFactory.nil)) {
					continue;
				}
				if (!(element instanceof CycList)) {
					this.nextElement = element;
					return;
				}
				this.iterators.push(((CycList) element).iterator());
			}
		}
	}
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 39 ms
	
	Decompiled with Procyon 0.5.32.
*/