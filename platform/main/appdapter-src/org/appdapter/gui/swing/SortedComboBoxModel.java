package org.appdapter.gui.swing;

import java.util.Comparator;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;

import org.appdapter.gui.trigger.TriggerMenuFactory.TriggerSorter;

public class SortedComboBoxModel<E> extends DefaultComboBoxModel {
	private Comparator<E> comparator = new TriggerSorter();
	private Vector<E> superItems;

	/*
	Vector objects;
	Object selectedObject;*/
	/*
	 *  Create an empty model that will use the natural sort order of the item
	 */
	public SortedComboBoxModel() {
		this(new Vector<E>());
	}

	/*
	 *  Create an empty model that will use the specified Comparator
	 */
	public SortedComboBoxModel(Comparator<E> comparator) {
		this();
		this.comparator = comparator;
	}

	/*
	 *	Create a model with data and use the nature sort order of the items
	 */
	public SortedComboBoxModel(E items[]) {
		this(items, null);
	}

	/*
	 *  Create a model with data and use the specified Comparator
	 */
	public SortedComboBoxModel(E items[], Comparator comparator) {
		this();
		this.comparator = comparator;

		for (E item : items) {
			addElement(item);
		}
	}

	/*
	 *	Create a model with data and use the nature sort order of the items
	 */
	public SortedComboBoxModel(Vector<E> items) {
		this(items, items, null);
	}

	/*
	 *  Create a model with data and use the specified Comparator
	 */
	public SortedComboBoxModel(Vector<E> items, Vector<E> itemsForSuper, Comparator<E> comparator) {
		super(items);
		this.comparator = comparator;
		this.superItems = items;
		if (items != itemsForSuper && itemsForSuper != null) {
			for (E item : itemsForSuper) {
				addElement(item);
			}
		}
	}

	public SortedComboBoxModel(Vector<E> items, Comparator<E> comparator) {
		this(items, items, comparator);
	}

	@Override public void addElement(Object element) {
		insertElementAt(element, 0);
	}

	@SuppressWarnings("unchecked") @Override public void insertElementAt(Object element, int index) {
		int size = getSize();

		//  Determine where to insert element to keep model in sorted order

		for (index = 0; index < size; index++) {
			if (comparator != null) {
				Object o = getElementAt(index);

				if (comparator.compare((E) o, (E) element) > 0)
					break;
			} else {
				Comparable c = (Comparable) getElementAt(index);

				if (c.compareTo(element) > 0)
					break;
			}
		}

		super.insertElementAt(element, index);

		//  Select an element when it is added to the beginning of the model

		if (index == 0 && element != null) {
			setSelectedItem(element);
		}
	}

	// implements javax.swing.MutableComboBoxModel
	@Override
	protected void fireIntervalAdded(Object source, int index0, int index1) {
		//if (true) return;
		Object[] listeners = listenerList.getListenerList();
		ListDataEvent e = null;

		for (int i = listeners.length - 2; i >= 0; i -= 2) {
			if (listeners[i] == ListDataListener.class) {
				if (e == null) {
					e = new ListDataEvent(source, ListDataEvent.INTERVAL_ADDED, index0, index1);
				}
				((ListDataListener) listeners[i + 1]).intervalAdded(e);
			}
		}
	}
}