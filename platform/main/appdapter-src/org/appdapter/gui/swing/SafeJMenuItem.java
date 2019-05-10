package org.appdapter.gui.swing;

import java.awt.event.ActionEvent;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JMenuItem;
import javax.swing.UIManager;
import javax.swing.plaf.MenuItemUI;

import org.appdapter.gui.api.GetSetObject;

public class SafeJMenuItem extends JMenuItem implements UISwingReplacement, GetSetObject, IsReference {

	@UISalient
	public Object userObject;

	/**
	 * Resets the UI property with a value from the current look and feel.
	 *
	 * @see JComponent#updateUI
	 */
	@Override
	public void updateUI() {
		MenuItemUI itemUI = null;
		try {
			itemUI = (MenuItemUI) UIManager.getUI(this);
		} catch (Throwable t) {

		}
		if (itemUI != null) {
			setUI(itemUI);
		}
	}

	@Override
	protected void fireActionPerformed(ActionEvent event) {
		super.fireActionPerformed(event);
	}

	/**
	* Creates a <code>JMenuItem</code> with no set text or icon.
	*/
	public SafeJMenuItem(Object ctx, boolean iamObject) {
		this(ctx, iamObject, null, (Icon) null);
	}

	/**
	 * Creates a <code>JMenuItem</code> with the specified icon.
	 *
	 * @param icon the icon of the <code>JMenuItem</code>
	 */
	public SafeJMenuItem(Object ctx, boolean iamObject, Icon icon) {
		this(ctx, iamObject, null, icon);
	}

	/**
	 * Creates a <code>JMenuItem</code> with the specified text.
	 *
	 * @param text the text of the <code>JMenuItem</code>
	 */
	public SafeJMenuItem(Object ctx, boolean iamObject, String text) {
		this(ctx, iamObject, text, (Icon) null);
	}

	/**
	 * Creates a menu item whose properties are taken from the 
	 * specified <code>Action</code>.
	 *
	 * @param a the action of the <code>JMenuItem</code>
	 * @since 1.3
	 */
	public SafeJMenuItem(Object ctx, boolean iamObject, Action a) {
		super(a);
		this.userObject = ctx;
	}

	/**
	 * Creates a <code>JMenuItem</code> with the specified text and icon.
	 *
	 * @param text the text of the <code>JMenuItem</code>
	 * @param icon the icon of the <code>JMenuItem</code>
	 */
	public SafeJMenuItem(Object ctx, boolean iamObject, String text, Icon icon) {
		super(text, icon);
		this.userObject = ctx;
	}

	/**
	 * Creates a <code>JMenuItem</code> with the specified text and
	 * keyboard mnemonic.
	 *
	 * @param text the text of the <code>JMenuItem</code>
	 * @param mnemonic the keyboard mnemonic for the <code>JMenuItem</code>
	 */
	public SafeJMenuItem(Object ctx, boolean iamObject, String text, int mnemonic) {
		super(text, mnemonic);
		this.userObject = ctx;
	}

	@Override public Object getValue() {
		return userObject;
	}

	@Override public void setObject(Object object) {
		userObject = object;
	}

}
