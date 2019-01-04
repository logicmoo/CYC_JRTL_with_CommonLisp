package org.appdapter.gui.browse;

/*
 * @(#)SearchableDemo.java 2/14/2005
 *
 * Copyright 2002 - 2005 JIDE Software Inc. All rights reserved.
 */

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.JViewport;
import javax.swing.ListModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;
import javax.swing.text.Position;
import javax.swing.tree.TreePath;

import org.appdapter.api.trigger.AnyOper;
import org.appdapter.core.debug.UIAnnotations.UIHidden;
import org.appdapter.core.debug.UIAnnotations.UISalient;
import org.appdapter.core.convert.ReflectUtils;
import org.appdapter.gui.swing.VerticalLayout;

import com.jidesoft.swing.AutoCompletion;
import com.jidesoft.swing.AutoCompletionComboBox;
import com.jidesoft.swing.ComboBoxSearchable;
import com.jidesoft.swing.JideBoxLayout;
import com.jidesoft.swing.JideSplitPane;
import com.jidesoft.swing.JideTitledBorder;
import com.jidesoft.swing.ListSearchable;
import com.jidesoft.swing.PartialEtchedBorder;
import com.jidesoft.swing.PartialSide;
import com.jidesoft.swing.Searchable;
import com.jidesoft.swing.SearchableUtils;
import com.jidesoft.swing.SelectAllUtils;
import com.jidesoft.swing.TableSearchable;
import com.jidesoft.swing.TreeSearchable;

/**
 * Demoed Component: {@link com.jidesoft.swing.Searchable} <br> Required jar files: jide-common.jar
 */
public class SearchableDemo implements AnyOper.Singleton, AnyOper.Autoload {
	private static final long serialVersionUID = 1118036569637233586L;

	public SearchableDemo() {
	}

	public String getName() {
		return "Searchable Demo";
	}

	public String getProduct() {
		return "PRODUCT_NAME_COMMON";
	}

	public String getDescription() {
		return "Searchable is a collection of several classes that enable quick search feature on JList, JComboBox, JTree, JTable or JTextComponent.\n"
				+ "1. Press any letter key to start the search\n" + "2. Press up/down arrow key to navigation to next or previous matching occurrence\n"
				+ "3. Hold CTRL key while pressing up/down arrow key to to multiple selection\n" + "4. Press CTRL+A to select all matching occurrences\n"
				+ "5. Use '?' to match any character or '*' to match several characters (except in JTextComponent) \n" + "6. A lot of customization options using the API\n" + "\n"
				+ "Demoed classes:\n" + "com.jidesoft.swing.Searchable\n" + "com.jidesoft.swing.TreeSearchable\n" + "com.jidesoft.swing.ListSearchable\n" + "com.jidesoft.swing.ComboBoxSearchable\n"
				+ "com.jidesoft.swing.TableSearchable\n" + "com.jidesoft.swing.TextComponentSearchable\n" + "com.jidesoft.swing.SearchableUtils\n" + "com.jidesoft.swing.Searchable";
	}

	@UISalient public Component getDemoPanel() {
		JTree tree = new JTree() {
			@Override public TreePath getNextMatch(String prefix, int startingRow, Position.Bias bias) {
				return null;
			}
		};
		tree.setVisibleRowCount(15);
		final TreeSearchable treeSearchable = SearchableUtils.installSearchable(tree);

		JList list = new JList(getCountryNames()) {
			@Override public int getNextMatch(String prefix, int startIndex, Position.Bias bias) {
				return -1;
			}
		};
		list.setVisibleRowCount(15);
		SearchableUtils.installSearchable(list);

		JComboBox comboBox = new JComboBox(getCountryNames());
		comboBox.setEditable(false); // combobox searchable only works when combobox is not editable.
		SearchableUtils.installSearchable(comboBox);

		/*ListComboBox listComboBox = new ListComboBox(getCountryNames());
		listComboBox.setEditable(false); // combobox searchable only works when combobox is not editable.
		new ListComboBoxSearchable(listComboBox);

		TreeComboBox treeComboBox = new TreeComboBox();
		treeComboBox.setEditable(false); // combobox searchable only works when combobox is not editable.
		TreeComboBoxSearchable treeComboBoxSearchable = new JideTreeComboBoxSearchable(treeComboBox);
		treeComboBoxSearchable.setRecursive(true);

		TableComboBox tableComboBox = new TableComboBox(new QuoteTableModel());
		tableComboBox.setEditable(false); // combobox searchable only works when combobox is not editable.
		new TableComboBoxSearchable(tableComboBox);
		*/
		JTable table = new JTable(new QuoteTableModel());
		table.setPreferredScrollableViewportSize(new Dimension(200, 100));
		table.setColumnSelectionAllowed(false);
		table.setRowSelectionAllowed(true);
		TableSearchable tableSearchable = SearchableUtils.installSearchable(table);
		tableSearchable.setMainIndex(-1); // search for all columns

		JTextArea textArea = new JTextArea();
		textArea.setRows(15);
		String[] countryNames = getCountryNames();
		StringBuffer buf = new StringBuffer();
		for (String name : countryNames) {
			buf.append(name);
			buf.append("\n");
		}
		textArea.setText(buf.toString());
		SearchableUtils.installSearchable(textArea);

		JPanel treePanel = createTitledPanel(new JLabel("Searchable JTree"), 'E', new JScrollPane(tree));
		JCheckBox checkbox = new JCheckBox("Recursive");
		checkbox.setMnemonic('R');
		checkbox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					treeSearchable.setRecursive(true);
				} else {
					treeSearchable.setRecursive(false);
				}
			}
		});
		checkbox.setSelected(treeSearchable.isRecursive());
		treePanel.add(checkbox, BorderLayout.AFTER_LAST_LINE);

		JPanel listPanel = new JPanel();
		listPanel.setLayout(new JideBoxLayout(listPanel, JideBoxLayout.Y_AXIS, 6));
		listPanel.add(createTitledPanel(new JLabel("Searchable JList"), 'L', new JScrollPane(list)), JideBoxLayout.VARY);
		listPanel.add(createTitledPanel(new JLabel("Searchable JComboBox"), 'C', comboBox), JideBoxLayout.FIX);
		///listPanel.add(createTitledPanel(new JLabel("Searchable ListComboBox (in JIDE Grids)"), 'I', listComboBox), JideBoxLayout.FIX);
		///listPanel.add(createTitledPanel(new JLabel("Searchable TreeComboBox (in JIDE Grids)"), 'R', treeComboBox), JideBoxLayout.FIX);
		///listPanel.add(createTitledPanel(new JLabel("Searchable TableComboBox (in JIDE Grids)"), 'T', tableComboBox), JideBoxLayout.FIX);

		// add to the parent panel
		JPanel panel = new JPanel(new GridLayout(2, 1, 10, 10));
		JideSplitPane pane1 = new JideSplitPane(JideSplitPane.HORIZONTAL_SPLIT);
		JideSplitPane pane2 = new JideSplitPane(JideSplitPane.HORIZONTAL_SPLIT);
		panel.add(pane1);
		panel.add(pane2);

		pane1.add(treePanel);
		pane2.add(listPanel);
		pane1.add(createTitledPanel(new JLabel("Searchable JTable (Configured to search for all columns.)"), 'T', new JScrollPane(table)));
		pane2.add(createTitledPanel(new JLabel("Searchable JTextArea (CTRL+F to start searching)"), 'S', new JScrollPane(textArea)));

		return panel;
	}

	public static JPanel createTitledPanel(String text, char mnemonic, JComponent component) {
		return createTitledPanel(new JLabel(text), mnemonic, component);
	}

	public static JPanel createTitledPanel(JLabel label, char mnemonic, JComponent component) {
		JPanel panel = new JPanel(new BorderLayout(2, 2));
		panel.add(label, BorderLayout.BEFORE_FIRST_LINE);
		label.setDisplayedMnemonic(mnemonic);
		if (component instanceof JScrollPane) {
			label.setLabelFor(((JScrollPane) component).getViewport().getView());
		} else {
			label.setLabelFor(component);
		}
		panel.add(component, BorderLayout.CENTER);
		return panel;
	}

	public static String[] getCountryNames() {
		return new String[] { "Andorra", "United Arab Emirates", "Afghanistan", "Antigua And Barbuda", "Anguilla", "Albania", "Armenia", "Netherlands Antilles", "Angola", "Antarctica", "Argentina",
				"American Samoa", "Austria", "Australia", "Aruba", "Azerbaijan", "Bosnia And Herzegovina", "Barbados", "Bangladesh", "Belgium", "Burkina Faso", "Bulgaria", "Bahrain", "Burundi",
				"Benin", "Bermuda", "Brunei Darussalam", "Bolivia", "Brazil", "Bahamas", "Bhutan", "Bouvet Island", "Botswana", "Belarus", "Belize", "Canada", "Cocos (Keeling) Islands",
				"Congo, The Democratic Republic Of The", "Central African Republic", "Congo", "Switzerland", "Cook Islands", "Chile", "Cameroon", "China", "Colombia", "Costa Rica", "Cuba",
				"Cape Verde", "Christmas Island", "Cyprus", "Czech Republic", "Germany", "Djibouti", "Denmark", "Dominica", "Dominican Republic", "Algeria", "Ecuador", "Estonia", "Egypt",
				"Western Sarara", "Eritrea", "Spain", "Ethiopia", "Finland", "Fiji", "Falkland Islands (Malvinas)", "Micronesia, Federated States Of", "Faroe Islands", "France", "Gabon",
				"United Kingdom", "Grenada", "Georgia", "French Guiana", "Ghana", "Gibraltar", "Greenland", "Gambia", "Guinea", "Guadeloupe", "Equatorial Guinea", "Greece",
				"South Georgia And The South Sandwich Islands", "Guatemala", "Guam", "Guinea-bissau", "Guyana", "Hong Kong", "Heard Island And Mcdonald Islands", "Honduras", "Croatia", "Haiti",
				"Hungary", "Indonesia", "Ireland", "Israel", "India", "British Indian Ocean Territory", "Iraq", "Iran, Islamic Republic Of", "Iceland", "Italy", "Jamaica", "Jordan", "Japan", "Kenya",
				"Kyrgyzstan", "Cambodia", "Kiribati", "Comoros", "Saint Kitts And Nevis", "Korea, Democratic People'S Republic Of", "Korea, Republic Of", "Kuwait", "Cayman Islands", "Kazakhstan",
				"Lao People'S Democratic Republic", "Lebanon", "Saint Lucia", "Liechtenstein", "Sri Lanka", "Liberia", "Lesotho", "Lithuania", "Luxembourg", "Latvia", "Libyan Arab Jamabiriya",
				"Morocco", "Monaco", "Moldova, Republic Of", "Madagascar", "Marshall Islands", "Macedonia, The Former Yugoslav Repu8lic Of", "Mali", "Myanmar", "Mongolia", "Macau",
				"Northern Mariana Islands", "Martinique", "Mauritania", "Montserrat", "Malta", "Mauritius", "Maldives", "Malawi", "Mexico", "Malaysia", "Mozambique", "Namibia", "New Caledonia",
				"Niger", "Norfolk Island", "Nigeria", "Nicaragua", "Netherlands", "Norway", "Nepal", "Niue", "New Zealand", "Oman", "Panama", "Peru", "French Polynesia", "Papua New Guinea",
				"Philippines", "Pakistan", "Poland", "Saint Pierre And Miquelon", "Pitcairn", "Puerto Rico", "Portugal", "Palau", "Paraguay", "Qatar", "Romania", "Russian Federation", "Rwanda",
				"Saudi Arabia", "Solomon Islands", "Seychelles", "Sudan", "Sweden", "Singapore", "Saint Helena", "Slovenia", "Svalbard And Jan Mayen", "Slovakia", "Sierra Leone", "San Marino",
				"Senegal", "Somalia", "Suriname", "Sao Tome And Principe", "El Salvador", "Syrian Arab Republic", "Swaziland", "Turks And Caicos Islands", "Chad", "French Southern Territories",
				"Togo", "Thailand", "Tajikistan", "Tokelau", "Turkmenistan", "Tunisia", "Tonga", "East Timor", "Turkey", "Trinidad And Tobago", "Tuvalu", "Taiwan, Province Of China",
				"Tanzania, United Republic Of", "Ukraine", "Uganda", "United States Minor Outlying Islands", "United States", "Uruguay", "Uzbekistan", "Venezuela", "Virgin Islands, British",
				"Virgin Islands, U.S.", "Viet Nam", "Vanuatu", "Wallis And Futuna", "Samoa", "Yemen", "Mayotte", "Yugoslavia", "South Africa", "Zambia", "Zimbabwe" };
	}

	static String[] QUOTE_COLUMNS = new String[] { "Symbol", "Name", "Last", "Change", "Volume" };

	static Object[][] QUOTES = new Object[][] { new Object[] { "AA", "ALCOA INC", "32.88", "+0.53 (1.64%)", "4156200" },
			new Object[] { "AIG", "AMER INTL GROUP", "69.53", "-0.58 (0.83%)", "4369200" }, new Object[] { "AXP", "AMER EXPRESS CO", "48.90", "-0.35 (0.71%)", "4103600" },
			new Object[] { "BA", "BOEING CO", "49.14", "-0.18 (0.36%)", "3573700" }, new Object[] { "C", "CITIGROUP", "44.21", "-0.89 (1.97%)", "28594900" },
			new Object[] { "CAT", "CATERPILLAR INC", "79.40", "+0.62 (0.79%)", "1458200" }, new Object[] { "DD", "DU PONT CO", "42.62", "-0.14 (0.33%)", "1832700" },
			new Object[] { "DIS", "WALT DISNEY CO", "23.87", "-0.32 (1.32%)", "4443600" }, new Object[] { "GE", "GENERAL ELEC CO", "33.37", "+0.24 (0.72%)", "31429500" },
			new Object[] { "GM", "GENERAL MOTORS", "43.94", "-0.20 (0.45%)", "3722100" }, new Object[] { "HD", "HOME DEPOT INC", "34.33", "-0.18 (0.52%)", "5367900" },
			new Object[] { "HON", "HONEYWELL INTL", "35.70", "+0.23 (0.65%)", "4092100" }, new Object[] { "HPQ", "HEWLETT-PACKARD", "19.65", "-0.25 (1.26%)", "11003000" },
			new Object[] { "IBM", "INTL BUS MACHINE", "84.02", "-0.11 (0.13%)", "6880500" }, new Object[] { "INTC", "INTEL CORP", "23.15", "-0.23 (0.98%)", "95177008" },
			new Object[] { "JNJ", "JOHNSON&JOHNSON", "55.35", "-0.57 (1.02%)", "5428000" }, new Object[] { "JPM", "JP MORGAN CHASE", "36.00", "-0.45 (1.23%)", "12135300" },
			new Object[] { "KO", "COCA COLA CO", "50.84", "-0.32 (0.63%)", "4143600" }, new Object[] { "MCD", "MCDONALDS CORP", "27.91", "+0.12 (0.43%)", "6110800" },
			new Object[] { "MMM", "3M COMPANY", "88.62", "+0.43 (0.49%)", "2073800" }, new Object[] { "MO", "ALTRIA GROUP", "48.20", "-0.80 (1.63%)", "6005500" },
			new Object[] { "MRK", "MERCK & CO", "44.71", "-0.97 (2.12%)", "5472100" }, new Object[] { "MSFT", "MICROSOFT CP", "27.87", "-0.26 (0.92%)", "46717716" },
			new Object[] { "PFE", "PFIZER INC", "32.58", "-1.43 (4.20%)", "28783200" }, new Object[] { "PG", "PROCTER & GAMBLE", "55.01", "-0.07 (0.13%)", "5538400" },
			new Object[] { "SBC", "SBC COMMS", "23.00", "-0.54 (2.29%)", "6423400" }, new Object[] { "UTX", "UNITED TECH CP", "91.00", "+1.16 (1.29%)", "1868600" },
			new Object[] { "VZ", "VERIZON COMMS", "34.81", "-0.35 (1.00%)", "4182600" }, new Object[] { "WMT", "WAL-MART STORES", "52.33", "-0.25 (0.48%)", "6776700" },
			new Object[] { "XOM", "EXXON MOBIL", "45.32", "-0.14 (0.31%)", "7838100" } };

	static class QuoteTableModel extends DefaultTableModel {
		private static final long serialVersionUID = 6238626555049175438L;

		public QuoteTableModel() {
			super(QUOTES, QUOTE_COLUMNS);
		}

		@Override public boolean isCellEditable(int row, int column) {
			return false;
		}
	}

	public static void installSearchable(JTable table) {
		table.setPreferredScrollableViewportSize(new Dimension(200, 24));
		table.setColumnSelectionAllowed(false);
		table.setRowSelectionAllowed(true);
		TableSearchable tSearchable = SearchableUtils.installSearchable(table);
		setSearchableParams(tSearchable);
		tSearchable.setMainIndex(-1); // search for all columns
		//installTitledPanel("Search: ", 'T', table);
	}

	static public JPanel createAutoCompleteForTree(JTree tree, boolean addTree) {
		JPanel panel = new JPanel();
		if (true) {
			panel.setLayout(new JideBoxLayout(panel, JideBoxLayout.Y_AXIS));
			panel.setBorder(BorderFactory.createCompoundBorder(new JideTitledBorder(new PartialEtchedBorder(PartialEtchedBorder.LOWERED, PartialSide.NORTH), "Object List by Class",
					JideTitledBorder.LEADING, JideTitledBorder.ABOVE_TOP), BorderFactory.createEmptyBorder(0, 0, 0, 0)));
		} else {
			panel.setLayout(new VerticalLayout(VerticalLayout.LEFT, true));
		}

		// create tree combobox
		final JTextArea treeTextField = new JTextArea();
		SelectAllUtils.install(treeTextField);
		Dimension dim = treeTextField.getSize();
		dim.height = 24;
		treeTextField.setSize(dim);
		treeTextField.setPreferredSize(dim);
		treeTextField.setMinimumSize(dim);
		treeTextField.setMaximumSize(new Dimension(Integer.MAX_VALUE, treeTextField.getPreferredSize().height));
		//treeTextField.setName("AutoCompletion JTextField with JTree");

		tree.setVisibleRowCount(25);
		final TreeSearchable searchable = SearchableUtils.installSearchable(tree);
		AutoCompletion autoCompletion = new AutoCompletion(treeTextField, searchable);
		setSearchableParams(searchable);
		autoCompletion.setStrict(false);
		autoCompletion.setStrictCompletion(false);
		searchable.setRecursive(true);
		panel.add(Box.createVerticalStrut(1), JideBoxLayout.FIX);
		if (true) {
			Box box = Box.createVerticalBox();
			box.add(Box.createVerticalGlue());
			box.add(treeTextField);
			box.add(Box.createVerticalGlue());
			panel.add(Box.createVerticalGlue());
			panel.add(box);
			panel.add(Box.createVerticalGlue());
		} else {
			panel.add(treeTextField);
		}
		//panel.add(Box.createVerticalStrut(12), JideBoxLayout.FIX);
		if (addTree)
			panel.add(new JScrollPane(tree));
		//panel.add(Box.createVerticalStrut(12), JideBoxLayout.FIX);
		return panel;
	}

	public static void installSearchable(JTree tree) {
		Container cont = getParentPanel(tree, false);
		int index = getComponentIndex(cont, tree);
		replaceComponent(cont, cont.getComponent(index), createAutoCompleteForTree(tree, true));
		return;
	}

	private static Container getParentPanel(Component child, boolean remove) {
		Container parent = child.getParent();
		Container gparent = null;
		if (parent != null) {
			gparent = parent.getParent();
		}
		if (parent instanceof JPanel) {
			remove = false;
		}
		if (parent instanceof JSplitPane) {
			remove = false;
		}
		if (parent instanceof JFrame) {
			remove = false;
			parent = ((JFrame) parent).getContentPane();
		}
		boolean needRemove = (parent instanceof JViewport || parent instanceof JScrollPane);
		if (needRemove) {
			if (remove) {
				replaceComponent(gparent, parent, child);
				parent = gparent;
			}
			return getParentPanel(parent, remove);
		}
		if (remove) {
			replaceComponent(gparent, parent, child);
			parent = gparent;
		}
		return (Container) parent;
	}

	private static void replaceComponent(Container gparent, Component f, Component r) {
		int i = getComponentIndex(gparent, f);
		gparent.remove(i);
		gparent.add(r, i);
	}

	public static int getComponentIndex(Container gparent, Component child) {
		int len = gparent.getComponentCount();
		for (int i = 0; i < len; i++) {
			Component other = gparent.getComponent(i);
			if (other == child)
				return i;
			if (other instanceof Container) {
				int sc = getComponentIndex((Container) other, child);
				if (sc != -1)
					return i;
			}
		}
		return -1;
	}

	public static AutoCompletion installSearchable(final JComboBox combo) {
		boolean wasEditable = combo.isEditable();
		combo.setEditable(false);
		ComboBoxSearchable searchable = SearchableUtils.installSearchable(combo);
		searchable.setCaseSensitive(false);
		searchable.setWildcardEnabled(true);
		searchable.setCountMatch(true);
		searchable.setShowPopupDuringSearching(true);
		searchable.setRefreshPopupDuringSearching(true);
		AutoCompletion autoCompletion = new AutoCompletion(combo, searchable) {
			@Override protected AutoCompletionDocument createDocument() {
				return super.createDocument();
			}
		};
		autoCompletion.setStrict(false);
		autoCompletion.setStrictCompletion(false);
		autoCompletion.installListeners();
		combo.setEditable(wasEditable);
		return autoCompletion;

	}

	private static void setSearchableParams(Searchable searchable) {
		searchable.setCaseSensitive(false);
		searchable.setWildcardEnabled(true);
		searchable.setRepeats(true);
	}

	public static void installTitledPanel(String text, char mnemonic, JComponent onto) {
		Container parent = onto.getParent();
		if (parent == null) {
			return;
		}
		if (onto instanceof JScrollPane) {
			parent.remove(onto);
			parent.add(createTitledPanel(text, mnemonic, onto));
			return;
		}
		if (onto instanceof JTree) {
			parent.remove(onto);
			parent.add(createTitledPanel(text, mnemonic, onto));
			return;
		}

		if (parent instanceof JViewport) {
			installTitledPanel(text, mnemonic, (JViewport) parent);
			return;
		}
		if (parent instanceof JScrollPane) {
			installTitledPanel(text, mnemonic, (JScrollPane) parent);
			return;
		}
		parent.remove(onto);
		parent.add(createTitledPanel(text, mnemonic, onto));
	}

	static protected String[] _fontNames;
	static protected List<String> _fontList;

	@UIHidden private JPanel createPanel1() {
		JPanel panel = new JPanel();
		panel.setLayout(new JideBoxLayout(panel, JideBoxLayout.Y_AXIS));
		panel.setBorder(BorderFactory.createCompoundBorder(new JideTitledBorder(new PartialEtchedBorder(PartialEtchedBorder.LOWERED, PartialSide.NORTH), "AutoCompletion combo box and text field",
				JideTitledBorder.LEADING, JideTitledBorder.ABOVE_TOP), BorderFactory.createEmptyBorder(0, 0, 0, 0)));

		JComboBox autoCompletionComboBox = new AutoCompletionComboBox(_fontNames);
		autoCompletionComboBox.setName("AutoCompletion JComboBox (Strict)");
		autoCompletionComboBox.setToolTipText("AutoCompletion JComboBox (Strict)");
		panel.add(new JLabel("AutoCompletion JComboBox (Strict)"));
		panel.add(Box.createVerticalStrut(3), JideBoxLayout.FIX);
		panel.add(autoCompletionComboBox);
		panel.add(Box.createVerticalStrut(12), JideBoxLayout.FIX);

		AutoCompletionComboBox autoCompletionComboBoxNotStrict = new AutoCompletionComboBox(_fontNames);
		autoCompletionComboBoxNotStrict.setStrict(false);
		autoCompletionComboBoxNotStrict.setName("AutoCompletion JComboBox (Not strict)");
		autoCompletionComboBoxNotStrict.setToolTipText("AutoCompletion JComboBox (Not strict)");
		panel.add(new JLabel("AutoCompletion JComboBox (Not strict)"));
		panel.add(Box.createVerticalStrut(3), JideBoxLayout.FIX);
		panel.add(autoCompletionComboBoxNotStrict);
		panel.add(Box.createVerticalStrut(12), JideBoxLayout.FIX);

		// create tree combobox
		final JTextField textField = new JTextField();
		textField.setName("AutoCompletion JTextField with a hidden data");
		SelectAllUtils.install(textField);
		new AutoCompletion(textField, _fontList);
		panel.add(new JLabel("AutoCompletion JTextField with a hidden data"));
		panel.add(Box.createVerticalStrut(3), JideBoxLayout.FIX);
		panel.add(textField);
		panel.add(Box.createVerticalStrut(12), JideBoxLayout.FIX);

		//        panel.add(Box.createVerticalStrut(24), JideBoxLayout.FIX);
		//        panel.add(new JLabel("As comparisons:"));
		//        panel.add(Box.createVerticalStrut(6), JideBoxLayout.FIX);
		//
		//        JComboBox searchableComboBox = new JComboBox(_fontNames);
		//        searchableComboBox.setEditable(false);
		//        SearchableUtils.installSearchable(searchableComboBox);
		//        searchableComboBox.setToolTipText("Searchable JComboBox");
		//        panel.add(new JLabel("Searchable JComboBox"));
		//        panel.add(Box.createVerticalStrut(3), JideBoxLayout.FIX);
		//        panel.add(searchableComboBox);
		//        panel.add(Box.createVerticalStrut(12), JideBoxLayout.FIX);
		//
		//        JTextField completionTextField = new JTextField();
		//        new ListCompletion(completionTextField, _fontNames);
		//        completionTextField.setToolTipText("Completion JTextField (not auto-complete)");
		//        panel.add(new JLabel("Completion JTextField (not auto-complete)"));
		//        panel.add(Box.createVerticalStrut(3), JideBoxLayout.FIX);
		//        panel.add(completionTextField);
		//        panel.add(Box.createVerticalStrut(12), JideBoxLayout.FIX);

		return panel;
	}

	static public JPanel createAutoCompleteForTree() {
		JPanel panel = new JPanel();
		JTree tree = new JTree();
		panel.setLayout(new JideBoxLayout(panel, JideBoxLayout.Y_AXIS));
		/*panel.setBorder(BorderFactory.createCompoundBorder(new JideTitledBorder(new PartialEtchedBorder(PartialEtchedBorder.LOWERED, PartialSide.NORTH), "AutoCompletion with list and tree",
				JideTitledBorder.LEADING, JideTitledBorder.ABOVE_TOP), BorderFactory.createEmptyBorder(0, 0, 0, 0)));
		*/
		// create tree combobox
		final JTextField treeTextField = new JTextField();
		treeTextField.setName("AutoCompletion JTextField with JTree");
		SelectAllUtils.install(treeTextField);
		tree.setVisibleRowCount(10);
		final TreeSearchable searchable = new TreeSearchable(tree);
		searchable.setRecursive(true);
		new AutoCompletion(treeTextField, searchable);
		panel.add(new JLabel("AutoCompletion JTextField with JTree"));
		panel.add(Box.createVerticalStrut(3), JideBoxLayout.FIX);
		panel.add(treeTextField);
		panel.add(Box.createVerticalStrut(2), JideBoxLayout.FIX);
		panel.add(new JScrollPane(tree));
		panel.add(Box.createVerticalStrut(12), JideBoxLayout.FIX);

		initFontNames();

		if (true)
			return panel;

		// create font name combobox
		final JTextField fontNameTextField = new JTextField();
		fontNameTextField.setName("AutoCompletion JTextField with JList");
		SelectAllUtils.install(fontNameTextField);
		final JList fontNameList = new JList(_fontNames);
		fontNameList.setVisibleRowCount(10);
		new AutoCompletion(fontNameTextField, new ListSearchable(fontNameList));
		panel.add(new JLabel("AutoCompletion JTextField with JList"));
		panel.add(Box.createVerticalStrut(3), JideBoxLayout.FIX);
		panel.add(fontNameTextField);
		panel.add(Box.createVerticalStrut(2), JideBoxLayout.FIX);
		panel.add(new JScrollPane(fontNameList));
		panel.add(Box.createVerticalStrut(12), JideBoxLayout.FIX);

		return panel;
	}

	@UISalient public Component getOtherDemoPanel() {
		initFontNames();

		JPanel panel1 = createPanel1();
		JPanel panel2 = createAutoCompleteForTree();

		JPanel panel = new JPanel(new BorderLayout(6, 6));
		panel.add(panel1, BorderLayout.BEFORE_FIRST_LINE);
		panel.add(panel2);
		return panel;
	}

	static public void initFontNames() {
		_fontNames = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		_fontList = ReflectUtils.asList(_fontNames);
	}

	public static AutoCompletion createAutoCompleteForText(JTextComponent txtBox, ListModel col) {
		SelectAllUtils.install(txtBox);
		AutoCompletion ac = new AutoCompletion(txtBox, new ListSearchable(new JList(col)));
		ac.setStrict(false);
		ac.setStrictCompletion(false);
		return ac;

	}
}