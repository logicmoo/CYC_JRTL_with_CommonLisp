package eu.larkc.sparqlclient.gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.HierarchyEvent;
import java.awt.event.HierarchyListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JEditorPane;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.plaf.basic.BasicSplitPaneDivider;
import javax.swing.plaf.basic.BasicSplitPaneUI;

import org.jdesktop.application.SingleFrameApplication;

import eu.larkc.sparqlclient.SPARQLClient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
/**
 * 
 */
public class SPARQLFrame extends SingleFrameApplication {
    private JPanel topPanel;
    private JButton SendQueryButton;
    private JScrollPane mainJscrollPane;
    private JEditorPane queryEntry;
    private JScrollPane resultsJscrollPane;
    private JEditorPane resultsEntry;
    private JSplitPane mainSplit;
    private JTextField urlTextField;

    @Override
    protected void startup() {
    	{
    		topPanel = new JPanel();
    		BorderLayout topPanelLayout = new BorderLayout();
    		topPanel.setLayout(topPanelLayout);
    		getMainFrame().getContentPane().add(topPanel, BorderLayout.CENTER);
    		topPanel.setPreferredSize(new java.awt.Dimension(559, 324));
    		{
    			urlTextField = new JTextField();
    			topPanel.add(urlTextField, BorderLayout.NORTH);
    			urlTextField.setName("urlTextField");
    			urlTextField.setPreferredSize(new java.awt.Dimension(320, 20));
    		}
    		{
    			SendQueryButton = new JButton();
    			topPanel.add(SendQueryButton, BorderLayout.SOUTH);
    			SendQueryButton.setName("SendQueryButton");
    			SendQueryButton.setPreferredSize(new java.awt.Dimension(559, 23));
    			SendQueryButton.addActionListener(new ActionListener() {
    				public void actionPerformed(ActionEvent evt) {
    					Logger log = LoggerFactory.getLogger(SPARQLFrame.class);
    					log.info("SendQueryButton.actionPerformed, event="+evt);
    					SPARQLClient client = new SPARQLClient(urlTextField.getText());
    					
    					String sresult = client.askQuery(queryEntry.getText());
    					
    					if (sresult != null && sresult != ""){
    						mainSplit.setDividerLocation(150);//HACK
    						resultsEntry.setText(sresult);
    					}
    					
    					//System.out.println(client.askQuery(queryEntry.getText()));
    				}
    			});
    		}
    		{
    			mainSplit = new JSplitPane();
    			mainSplit.setOneTouchExpandable(true);
    			mainSplit.setOrientation(JSplitPane.VERTICAL_SPLIT);
    			
    			topPanel.add(mainSplit, BorderLayout.CENTER);
    			mainSplit.setName("mainSplit");
    			{
    				mainJscrollPane = new JScrollPane();
    				mainSplit.add(mainJscrollPane, JSplitPane.TOP);
    				mainJscrollPane.setPreferredSize(new java.awt.Dimension(557, 110));
    				//mainJscrollPane.setPreferredSize(new java.awt.Dimension(557, 108));
    				{
    					queryEntry = new JEditorPane();
    					mainJscrollPane.setViewportView(queryEntry);
    					//queryEntry.setPreferredSize(new java.awt.Dimension(557,235));
    					queryEntry.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
    					queryEntry.setName("queryEntry");
    				}
    				
    				resultsJscrollPane = new JScrollPane();
    				mainSplit.add(resultsJscrollPane, JSplitPane.BOTTOM);
    				
    				{
    					resultsEntry = new JEditorPane();
    					resultsJscrollPane.setViewportView(resultsEntry);
    					//queryEntry.setPreferredSize(new java.awt.Dimension(557,235));
    					resultsEntry.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
    					resultsEntry.setName("resultsEntry");
    				}
    				//mainSplit.setDividerLocation(0);//HACK
    				//mainSplit.setDividerLocation(1.0);
    				mainSplit.addHierarchyListener(new HierarchyListener()
    				{
    				    public void hierarchyChanged(HierarchyEvent e)
    				    {
    				        if ((e.getChangeFlags() & HierarchyEvent.SHOWING_CHANGED) != 0)
    				        {
    				            BasicSplitPaneUI ui = (BasicSplitPaneUI) mainSplit.getUI();
    				            BasicSplitPaneDivider divider = ui.getDivider();
    				            JButton button = (JButton) divider.getComponent(1);
    				            button.doClick();
    				        }
    				    }
    				});
    			}
    		}

    	}
        show(topPanel);
    }

    public static void main(String[] args) {
        launch(SPARQLFrame.class, args);
    }

}
