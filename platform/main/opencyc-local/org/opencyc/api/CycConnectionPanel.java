package org.opencyc.api;

import javax.swing.Icon;
import javax.swing.JOptionPane;
import java.awt.event.ComponentListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentAdapter;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JPanel;

public class CycConnectionPanel extends JPanel {
	private final JTextField hostField;
	private final JComboBox portField;

	public CycConnectionPanel(final CycServer server) {
		this.hostField = new JTextField(server.getHostName(), 20);
		this.portField = new JComboBox((Object[]) this.getBasePorts());
		if (server.getBasePort() != null) {
			this.portField.setSelectedItem(server.getBasePort());
		}
		this.add(new JLabel("Cyc host and base port:"));
		this.add(this.hostField);
		this.add(this.portField);
		this.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(final ComponentEvent ce) {
				CycConnectionPanel.this.hostField.requestFocusInWindow();
			}
		});
	}

	public CycConnectionPanel(final String defaultHost, final Integer defaultPort) {
		this(new CycServer(defaultHost, (int) defaultPort));
	}

	public CycConnectionPanel() {
		this(CycConnection.DEFAULT_HOSTNAME, Integer.valueOf(3600));
	}

	public CycServer getCycServer() {
		return new CycServer(this.getHostName(), (int) this.getBasePort());
	}

	protected Integer[] getBasePorts() {
		return new Integer[] { 3600, 3620, 3640, 3660, 3680 };
	}

	protected String getHostName() {
		return this.hostField.getText();
	}

	protected Integer getBasePort() {
		if (this.portField.getSelectedItem() != null) {
			return Integer.parseInt(this.portField.getSelectedItem().toString());
		}
		return null;
	}

	private static CycServer wrapInJOptionPane(final CycConnectionPanel panel) {
		final Object[] options = { "OK", "Cancel" };
		final int result = JOptionPane.showOptionDialog(null, panel, "Set Cyc Connection", 2, 3, null, options, null);
		if (result == 0) {
			return panel.getCycServer();
		}
		return null;
	}

	public static CycServer promptUser(final CycServer server) {
		return wrapInJOptionPane(new CycConnectionPanel(server));
	}

	public static CycServer promptUser(final String defaultHost, final Integer defaultPort) {
		return wrapInJOptionPane(new CycConnectionPanel(defaultHost, defaultPort));
	}

	public static CycServer promptUser() {
		return wrapInJOptionPane(new CycConnectionPanel());
	}

	public static void main(final String[] args) {
		try {
			final CycServer result = promptUser();
			if (result != null) {
				System.out.println("Server: " + result.toString());
			} else {
				System.out.println("Cancelled!");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			System.exit(0);
		}
	}
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 107 ms
	
	Decompiled with Procyon 0.5.32.
*/