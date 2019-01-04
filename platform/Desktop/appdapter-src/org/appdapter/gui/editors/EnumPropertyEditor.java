/** DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
*
* Copyright 1997-2007 Sun Microsystems, Inc. All rights reserved.
*
* The contents of this file are subject to the terms of either the GNU
* General Public License Version 2 only ("GPL") or the Common
* Development and Distribution License("CDDL") (collectively, the
* "License"). You may not use this file except in compliance with the
* License. You can obtain a copy of the License at
* http://www.netbeans.org/cddl-gplv2.html
* or nbbuild/licenses/CDDL-GPL-2-CP. See the License for the
* specific language governing permissions and limitations under the
* License.  When distributing the software, include this License Header
* Notice in each file and include the License file at
* nbbuild/licenses/CDDL-GPL-2-CP.  Sun designates this
* particular file as subject to the "Classpath" exception as provided
* by Sun in the GPL Version 2 section of the License file that
* accompanied this code. If applicable, add the following below the
* License Header, with the fields enclosed by brackets [] replaced by
* your own identifying information:
* "Portions Copyrighted [year] [name of copyright owner]"
*
* Contributor(s):
*
* The Original Software is NetBeans. The Initial Developer of the Original
* Software is Sun Microsystems, Inc. Portions Copyright 1997-2006 Sun
* Microsystems, Inc. All Rights Reserved.
*
* If you wish your version of this file to be governed by only the CDDL
* or only the GPL Version 2, indicate your decision by adding
* "[Contributor] elects to include this software in this distribution
* under the [CDDL or GPL Version 2] license." If you do not indicate a
* single choice of license, a recipient has the option to distribute
* your version of this file under either the CDDL, the GPL Version 2 or
* to extend the choice of license to its licensees as provided above.
* However, if you add GPL Version 2 code and therefore, elected the GPL
* Version 2 license, then the option applies only if the new code is
* made subject to such option by the copyright holder.
*/

//package org.openide.explorer.propertysheet;
package org.appdapter.gui.editors;

import java.awt.Component;
import java.lang.reflect.Type;
import java.util.Vector;

import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;

import org.appdapter.core.log.Debuggable;
import org.appdapter.gui.util.PairTable;

/**
 * Property editor for enumeration types.
 * @author Jesse Glick
 */
public final class EnumPropertyEditor extends GoodPropertyEditorSupport {

	private final Class<? extends Enum> c;
	GUI gui = null;
	final ComboModel model;

	public static Type[] EDITTYPE = new Type[] { Enum.class };

	public EnumPropertyEditor(Class<? extends Enum> c) {
		this.c = c;
		model = new ComboModel();
	}

	public String[] getTags() {
		try {
			Object[] values = (Object[]) c.getMethod("values").invoke(null); // NOI18N
			String[] tags = new String[values.length];
			for (int i = 0; i < values.length; i++) {
				tags[i] = values[i].toString();
			}
			return tags;
		} catch (Exception x) {
			throw new AssertionError(x);
		}
	}

	@SuppressWarnings("unchecked") public void setAsText(String text) throws IllegalArgumentException {
		if (false)
			setValue(model.getEnum(text));

		if (text.length() > 0) {
			setValue(Enum.valueOf(c, text));
		} else {
			setValue(null);
		}
	}

	public String getJavaInitializationString() {
		Enum e = (Enum) getValue();
		return e != null ? c.getName().replace('$', '.') + '.' + e.name() : "null"; // NOI18N
	}

	@Override public String getAsText() {
		if (false) {
			Object o = getValue();
			return o != null ? o.toString() : "";
		}
		return model.getEnumName(model.getSelectedEnum());
	}

	@Override public void setValue(Object value) {
		if (value instanceof Enum) {
			super.setValue(value);
			if (gui != null)
				gui.setSelectedItem(getEnumValue());
		}
	}

	public Enum getEnumValue() {
		try {
			return (Enum) getValue();
		} catch (Exception err) {
			return null;
		}
	}

	@Override public Component getCustomEditor() {
		if (gui == null) {
			gui = new GUI(model);
		}
		return gui;
	}

	@Override public boolean supportsCustomEditor() {
		return true;
	}

	class GUI extends JComboBox {
		public GUI(ComboModel model0) {
			super(model0);
		}
	}

	class ComboModel extends AbstractListModel implements ComboBoxModel {
		Enum selected = null;
		PairTable table = new PairTable();
		Vector names = new Vector();

		public ComboModel() {
			Object[] values;
			try {
				values = (Object[]) c.getMethod("values").invoke(null);
				String[] tags = new String[values.length];
				for (int i = 0; i < values.length; i++) {
					Object v = values[i];
					String n = v.toString();
					table.add(v, n);
					names.addElement(n);
				}
			} catch (Throwable e) {
				Debuggable.printStackTrace(e);
			} // NOI18N

		}

		@Override public synchronized void setSelectedItem(Object anItem) {
			Enum old = selected;
			if (anItem == null) {
				selected = null;
			} else if (anItem instanceof Enum) {
				selected = (Enum) anItem;
			} else if (anItem instanceof String) {
				selected = (Enum) table.findBrother(anItem);
			}

			fireContentsChanged(this, -1, -1);
			if (selected != old) {
				setValue(selected);
			}
		}

		@Override public Object getSelectedItem() {
			return table.findBrother(selected);
		}

		public Enum getSelectedEnum() {
			return selected;
		}

		public Enum getEnum(String name) {
			return (Enum) table.findBrother(name);
		}

		public String getEnumName(Enum enumc) {
			return (String) table.findBrother(enumc);
		}

		@Override public int getSize() {
			return names.size();
		}

		@Override public Object getElementAt(int index) {
			try {
				return names.elementAt(index);
			} catch (Exception err) {
				return null;
			}
		}
	}
}
