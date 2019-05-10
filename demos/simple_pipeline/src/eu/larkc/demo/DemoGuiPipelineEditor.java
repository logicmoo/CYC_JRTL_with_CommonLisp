/*
   This file is part of the LarKC platform 
   http://www.larkc.eu/

   Copyright 2010 LarKC project consortium

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */

package eu.larkc.demo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.openrdf.model.Statement;
import org.openrdf.model.URI;
import eu.larkc.core.data.BooleanInformationSet;
import eu.larkc.core.data.CloseableIterator;
import eu.larkc.core.data.DataFactoryImpl;
import eu.larkc.core.data.InformationSet;
import eu.larkc.core.data.RdfStoreConnection;
import eu.larkc.core.data.SetOfStatements;
import eu.larkc.core.data.VariableBinding;
import eu.larkc.core.qos.QoSInformation;
import eu.larkc.core.query.Query;
import eu.larkc.core.query.SPARQLQuery;
import eu.larkc.core.query.SPARQLQueryImpl;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.Contract;
import eu.larkc.plugin.Plugin;
import eu.larkc.plugin.decider.simpleanytimedecider.SimpleAnytimeDecider;
import eu.larkc.plugin.identify.Identifier;
import eu.larkc.plugin.identify.filereader.SimpleFileReaderIdentifier;
import eu.larkc.plugin.identify.sindice.SindiceTriplePatternIdentifier;
import eu.larkc.plugin.reason.Reasoner;
import eu.larkc.plugin.reason.irisrulereasoner.IrisRuleBasedReasoner;
import eu.larkc.plugin.reason.simple.SparqlQueryEvaluationReasoner;
import eu.larkc.plugin.select.Selecter;
import eu.larkc.plugin.select.simple.GrowingDataSetSelecter;
import eu.larkc.plugin.transform.InformationSetTransformer;
import eu.larkc.plugin.transform.QueryTransformer;
import eu.larkc.plugin.transform.nulldatatransformer.NullDataTransformer;
import eu.larkc.plugin.transform.passitontransformer.PassItOnTransformer;
import eu.larkc.plugin.transform.sparqltotriplepatternquerytransformer.SPARQLToTriplePatternQueryTransformer;


/**
 * A GUI version of the Demo application.
 */
public class DemoGuiPipelineEditor
{
	private static Dimension WINDOW_SIZE = new Dimension(1024, 768);
	
	public static final Font font_plain = new Font("Arial", Font.PLAIN,  12);
	public static final Font font_bold = new Font("Arial", Font.BOLD,  12);
	public static final String NEW_LINE = System.getProperty( "line.separator" );
	
	public static final Color BACKGROUND_COLOR = new Color(32, 63, 103);
	
	private static boolean LOGGING = true;

	/**
	 * Application entry point.
	 * @param args
	 */
	public static void main( String[] args )
	{
		// Set up the native look and feel
		try
		{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch(Exception e)
		{
		}

		new MainFrame();
	}
	
	/*private static String SELECT_ALL_TRIPLES = "SELECT ?s ?p ?o " + NEW_LINE +
		"WHERE { ?s  ?p  ?o }";*/

	private static String WHO_KNOWS_X = "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>" +NEW_LINE +  
	"PREFIX foaf: <http://xmlns.com/foaf/0.1/>" + NEW_LINE + 
	"SELECT DISTINCT ?name where {" +  NEW_LINE +
	"?person rdf:type foaf:Person." +  NEW_LINE +
	"?person foaf:name \"Tim Berners-Lee\"." + NEW_LINE +
	"?person2 rdf:type foaf:Person. " +  NEW_LINE +
	"?person2 foaf:knows ?person." + NEW_LINE +
	"?person2 foaf:name ?name." + NEW_LINE +
	"}";

	private static String SUBCLASS_QUERY =
		"PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>" + NEW_LINE +
		"PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>" +  NEW_LINE +
		"SELECT DISTINCT ?class ?label where {" +  NEW_LINE +
		"?class rdfs:subClassOf <http://purl.uniprot.org/unipathway/402>." + NEW_LINE +
		"?class rdfs:label ?label." + NEW_LINE +
		"} ORDER BY ?label";
		
	private static String SUBCLASS_OF_SELF =
		"PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>" + NEW_LINE +
		"PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>" +  NEW_LINE +
		"SELECT ?concept where{" +  NEW_LINE +
		"?concept rdfs:subClassOf ?concept." +  NEW_LINE +
		"}";
	
	private static String WHO_KNOWS_WHO =
		"PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>" + NEW_LINE +
		"PREFIX foaf: <http://xmlns.com/foaf/0.1/>" + NEW_LINE +
		"SELECT DISTINCT ?name1 ?name2 where {" + NEW_LINE +
		"?person rdf:type foaf:Person." + NEW_LINE +
		"?person foaf:name ?name1." + NEW_LINE +
		"?person2 rdf:type foaf:Person." + NEW_LINE +
		"?person2 foaf:knows ?person." + NEW_LINE +
		"?person2 foaf:name ?name2." + NEW_LINE +
		"} LIMIT 10000";
	
	 /*private static String WHO_IS_FEMALE =
		"PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>" + NEW_LINE +
		"PREFIX foaf: <http://xmlns.com/foaf/0.1/>" + NEW_LINE +
		"SELECT DISTINCT ?name where {" + NEW_LINE +
		"?person rdf:type foaf:Person." + NEW_LINE +
		"?person foaf:gender \"female\"." + NEW_LINE +
		"?person foaf:name ?name." + NEW_LINE +
		"} ORDER BY ?name LIMIT 50";*/

	/*private static String CHINOOK =
		"SELECT ?s ?p2 ?o2 "  + NEW_LINE +
		"WHERE {" + NEW_LINE +
		"    ?s  ?p  \"Chinook\"." + NEW_LINE +
		"    ?s ?p2 ?o2." + NEW_LINE +
		"}";
	
	private static String EMPTY_OUTPUT =  NEW_LINE + NEW_LINE + NEW_LINE + NEW_LINE + NEW_LINE + NEW_LINE + NEW_LINE + NEW_LINE + NEW_LINE;*/
	
	/**
	 * The main application window
	 */
	public static class MainFrame extends JFrame implements ActionListener, ComponentListener
	{
		/** The serialisation ID. */
        private static final long serialVersionUID = 1L;
        
        private JPanel northPanel;
        private JPanel centerPanel;
        private JPanel southPanel;
        
        private final JTextArea mQuery = new JTextArea();
		private JTabbedPane mOutputTabs = null;

		private JComboBox mQueryTransformer;
		private JComboBox mIdentifier;
		private JComboBox mDataTransformer;
		private JComboBox mSelecter;
		private JComboBox mReasoner;
		
		private final JButton mRun = new JButton( "Execute" );
		private final JButton mAbort = new JButton( "Cancel" );
		private final JButton mReset = new JButton( "Reset" );
		
		private JButton backward;
		private JButton forward;
		
        private final ImageIcon _larkcIcon = new ImageIcon("files/icons/larkc_logo.png");
        private final ImageIcon _forwardIcon = new ImageIcon("files/icons/icon_forward.gif");
        private final ImageIcon _backwardIcon = new ImageIcon("files/icons/icon_back.gif");
        
        private Thread mExecutionThread;
        
        private JLabel progressLabel;
        
        private int workflowCount = 0;
        
        private boolean addNewTab = false;
        
        /**
         * Constructor
         */
		public MainFrame()
		{
			super( "LarKC Workflow Demonstrator" );
			
			this.setSize( WINDOW_SIZE );
			this.setBackground(BACKGROUND_COLOR);
			this.addComponentListener(this);
			
			setupPlugins();
			setup();
			
			makeFrame();
		}
		
		private void makeFrame()
		{
			this.pack();
			
			//Center window
			Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
			
			int w = WINDOW_SIZE.width;
			int h = WINDOW_SIZE.height;
					
			int x = (dim.width - w) / 2;
			int y = (dim.height - h) / 2;
			
			this.setResizable(true);
			
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setLocation(x, y);
			this.setVisible(true);
		}

		private void setupWebPipeline() {
			mQueryTransformer.setSelectedItem( "SPARQL->triple pattern" );
			mIdentifier.setSelectedItem( "Sindice (triple pattern)" );
			mDataTransformer.setSelectedItem( "None" );
			mSelecter.setSelectedItem( "Growing data set" );
			mReasoner.setSelectedItem( "SPARQL only" );
		}
		
		private void setupRulePipeline() {
			mQueryTransformer.setSelectedItem( "None" );
			mIdentifier.setSelectedItem( "UniProt (core+pathways)" );
			mDataTransformer.setSelectedItem( "None" );
			mSelecter.setSelectedItem( "Growing data set" );
			mReasoner.setSelectedItem( "IRIS (RDFS)" );
		}
		
		private void setupDefaultPipeline() {
			mQueryTransformer.setSelectedItem( "None" );
			mIdentifier.setSelectedItem( "None" );
			mDataTransformer.setSelectedItem( "None" );
			mSelecter.setSelectedItem( "None" );
			mReasoner.setSelectedItem( "None" );
		}

		/**
		 * Create all the widgets, lay them out and create listeners.
		 */
		private void setup()
		{
			getContentPane().setBackground(BACKGROUND_COLOR);
			
			setLayout( new BorderLayout() );
			
			mQuery.setText( WHO_KNOWS_X );
			mQuery.setRows(3);
			mQuery.setLineWrap(true);
			mQuery.setWrapStyleWord(true);
			mQuery.setEditable(true);
			mQuery.setCaretPosition(WHO_KNOWS_X.length());
							
			mRun.addActionListener( this );
			mReset.addActionListener( this );
			mAbort.addActionListener( this );
			mAbort.setEnabled( false );
			
			JScrollPane queryScroller = new JScrollPane( mQuery );
			
			northPanel = new JPanel(new BorderLayout());
			northPanel.setBackground(BACKGROUND_COLOR);
			northPanel.setPreferredSize(new Dimension(WINDOW_SIZE.width, 200));
			
			TitledBorder queryTitle = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.WHITE), "Query");
			queryTitle.setTitleColor(Color.WHITE);
			queryTitle.setTitleFont(font_bold);
			
			northPanel.setBorder(queryTitle);
			
			northPanel.add(queryScroller, "Center");

			JPanel buttonsPanel = new JPanel(new GridLayout(6, 1));
			buttonsPanel.setBackground(BACKGROUND_COLOR);
			buttonsPanel.setPreferredSize(new Dimension(100, 200));
			
			forward = new JButton();
			forward.setBackground(BACKGROUND_COLOR);
			forward.setIcon(_forwardIcon);
			forward.setMargin(new Insets(0, 0, 0, 0));
			forward.setBorder(BorderFactory.createEmptyBorder());
			forward.addActionListener(this);
			forward.setToolTipText("Next Demo Query / Workflow");
			
			backward = new JButton();
			backward.setBackground(BACKGROUND_COLOR);
			backward.setIcon(_backwardIcon);
			backward.setMargin(new Insets(0, 0, 0, 0));
			backward.setBorder(BorderFactory.createEmptyBorder());
			backward.addActionListener(this);
			backward.setToolTipText("Previous Demo Query / Workflow");
			backward.setEnabled(false);
			
			JPanel naviPanel = new JPanel();
			naviPanel.setPreferredSize(new Dimension(100, 20));
			naviPanel.setBackground(BACKGROUND_COLOR);
			
			naviPanel.add(backward);
			naviPanel.add(new JLabel());
			naviPanel.add(new JLabel());
			naviPanel.add(new JLabel());
			naviPanel.add(new JLabel());
			naviPanel.add(new JLabel());
			naviPanel.add(new JLabel());
			naviPanel.add(forward);
			
			buttonsPanel.add( mRun );
			buttonsPanel.add( mAbort );
			buttonsPanel.add( mReset );
			buttonsPanel.add(  new JLabel() );
			buttonsPanel.add( new JLabel() );
			buttonsPanel.add(  naviPanel );
			
			northPanel.add(buttonsPanel, "East");

			getContentPane().add( northPanel, BorderLayout.NORTH );
			
			centerPanel = new JPanel();
			
			GridBagLayout gbl = new GridBagLayout();
			
			centerPanel.setLayout(gbl);
			centerPanel.setBackground(BACKGROUND_COLOR);
			centerPanel.setPreferredSize(new Dimension(WINDOW_SIZE.width, (int)(WINDOW_SIZE.height * 0.10)));
			
			TitledBorder workflowTitle = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.WHITE), "Plug-ins");
			workflowTitle.setTitleColor(Color.WHITE);
			workflowTitle.setTitleFont(font_bold);
			
			centerPanel.setBorder(workflowTitle);
			
			JLabel transformerLabel = new JLabel("           Query Transformer");
			transformerLabel.setPreferredSize(new Dimension((centerPanel.getPreferredSize().width/5)-5, 20));
			transformerLabel.setForeground(Color.WHITE);
			transformerLabel.setBackground(BACKGROUND_COLOR);
			
			JLabel identifierLabel = new JLabel("                 Identifier");
			identifierLabel.setPreferredSize(new Dimension((centerPanel.getPreferredSize().width/5)-5, 20));
			identifierLabel.setForeground(Color.WHITE);
			identifierLabel.setBackground(BACKGROUND_COLOR);
			
			JLabel transformerLabel1 = new JLabel("           Data Transformer");
			transformerLabel1.setPreferredSize(new Dimension((centerPanel.getPreferredSize().width/5)-5, 20));
			transformerLabel1.setForeground(Color.WHITE);
			transformerLabel1.setBackground(BACKGROUND_COLOR);
			
			JLabel selecterLabel = new JLabel("                  Selecter");
			selecterLabel.setPreferredSize(new Dimension((centerPanel.getPreferredSize().width/5)-5, 20));
			selecterLabel.setForeground(Color.WHITE);
			selecterLabel.setBackground(BACKGROUND_COLOR);
			
			JLabel reasonerLabel = new JLabel("                  Reasoner");
			reasonerLabel.setPreferredSize(new Dimension((centerPanel.getPreferredSize().width/5)-5, 20));
			reasonerLabel.setForeground(Color.WHITE);
			reasonerLabel.setBackground(BACKGROUND_COLOR);
			
			mQueryTransformer = new JComboBox( mQueryTransformerFactory.getNames() );
			mQueryTransformer.setPreferredSize(transformerLabel.getPreferredSize());
			
			mIdentifier = new JComboBox( mIdentifierFactory.getNames() );
			mIdentifier.setPreferredSize(identifierLabel.getPreferredSize());			
			
			mDataTransformer = new JComboBox( mInformationSetTransformerFactory.getNames() );
			mDataTransformer.setPreferredSize(transformerLabel1.getPreferredSize());
			
			mSelecter = new JComboBox( mSelecterFactory.getNames() );
			mSelecter.setPreferredSize(selecterLabel.getPreferredSize());
			
			mReasoner = new JComboBox( mReasonerFactory.getNames() );
			mReasoner.setPreferredSize(reasonerLabel.getPreferredSize());
			
			GridBagConstraints gbc = new GridBagConstraints();
			
			buildConstraints(gbc, 0, 0, 1, 1, 10, 0, GridBagConstraints.HORIZONTAL,  GridBagConstraints.CENTER);
			gbl.setConstraints(transformerLabel, gbc);
			centerPanel.add(transformerLabel);
			buildConstraints(gbc, 0, 1, 1, 1, 10, 0,GridBagConstraints.HORIZONTAL,  GridBagConstraints.CENTER);
			gbl.setConstraints(mQueryTransformer, gbc);
			centerPanel.add(mQueryTransformer); 
			
			buildConstraints(gbc, 1, 0, 1, 1, 10, 0, GridBagConstraints.HORIZONTAL,  GridBagConstraints.CENTER);
			gbl.setConstraints(identifierLabel, gbc);
			centerPanel.add(identifierLabel);
			buildConstraints(gbc, 1, 1, 1, 1, 10, 0, GridBagConstraints.HORIZONTAL,  GridBagConstraints.CENTER);
			gbl.setConstraints(mIdentifier, gbc);
			centerPanel.add(mIdentifier); 
			
			buildConstraints(gbc, 2, 0, 1, 1, 10, 0, GridBagConstraints.HORIZONTAL,  GridBagConstraints.CENTER);
			gbl.setConstraints(transformerLabel1, gbc);
			centerPanel.add(transformerLabel1);
			buildConstraints(gbc, 2, 1, 1, 1, 10, 0,GridBagConstraints.HORIZONTAL,  GridBagConstraints.CENTER);
			gbl.setConstraints(mDataTransformer, gbc);
			centerPanel.add(mDataTransformer);
			
			buildConstraints(gbc, 3, 0, 1, 1, 10, 0, GridBagConstraints.HORIZONTAL,  GridBagConstraints.CENTER);
			gbl.setConstraints(selecterLabel, gbc);
			centerPanel.add(selecterLabel);
			buildConstraints(gbc, 3, 1, 1, 1, 10, 0, GridBagConstraints.HORIZONTAL,  GridBagConstraints.CENTER);
			gbl.setConstraints(mSelecter, gbc);
			centerPanel.add(mSelecter);
			
			buildConstraints(gbc, 4, 0, 1, 1, 10, 0, GridBagConstraints.HORIZONTAL,  GridBagConstraints.CENTER);
			gbl.setConstraints(reasonerLabel, gbc);
			centerPanel.add(reasonerLabel);		
			buildConstraints(gbc, 4, 1, 1, 1, 10, 0, GridBagConstraints.HORIZONTAL,  GridBagConstraints.CENTER);
			gbl.setConstraints(mReasoner, gbc);
			centerPanel.add(mReasoner);
			
			setupWebPipeline();
			
			getContentPane().add( centerPanel, BorderLayout.CENTER );
			
			southPanel = new JPanel(new BorderLayout()) 
			{
				/**
				 * 
				 */
				private static final long serialVersionUID = 1L;

					public void paintComponent(Graphics g)			
					{	
						int x = (WINDOW_SIZE.width - _larkcIcon.getIconWidth()) / 2;
						int y = ((int)(WINDOW_SIZE.height * 0.609375) - _larkcIcon.getIconHeight()) / 2;
						
						g.drawImage(_larkcIcon.getImage(), x, y, null);					
						setOpaque( false );				
						super.paintComponent(g);	
					}
			};
			
			TitledBorder resultsTitle = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.WHITE), "Results");
			resultsTitle.setTitleColor(Color.WHITE);
			resultsTitle.setTitleFont(font_bold);
			
			southPanel.setBorder(resultsTitle);
			
			southPanel.setBackground(BACKGROUND_COLOR);
			southPanel.setPreferredSize(new Dimension(WINDOW_SIZE.width , (int)(WINDOW_SIZE.height * 0.60)));
			
			JPanel progressPanel = new JPanel();
			progressPanel.setBackground(BACKGROUND_COLOR);
			
			progressLabel = new JLabel();
			progressLabel.setForeground(Color.WHITE);
			progressLabel.setText("LarKC is idle...");
			
			progressPanel.add(progressLabel);
			
			southPanel.add(progressPanel, "South");
	        
			getContentPane().add( southPanel, BorderLayout.SOUTH );
		}
		
		 private void buildConstraints(GridBagConstraints gbc,int x, int y, int w, int h, int wx, int wy, int fill, int anchor)
		 {
			 gbc.gridx = x; // start cell in a row
			 gbc.gridy = y; // start cell in a column
			 gbc.gridwidth = w; // how many column does the control occupy in the row
			 gbc.gridheight = h; // how many column does the control occupy in the column
			 gbc.weightx = wx; // relative horizontal size
			 gbc.weighty = wy; // relative vertical size
			 gbc.fill = fill; // the way how the control fills cells
			 gbc.anchor = anchor; // alignment
		 }
		
		public void actionPerformed( ActionEvent e )
        {
			Logger log = LoggerFactory.getLogger(DemoGuiPipelineEditor.class);
	        if( e.getSource() == mRun )
	        	run();
	        else if( e.getSource() == mAbort )
	        	abort();
	        else if( e.getSource() == mReset )
	        	reset();
	        
	        if(e.getSource() instanceof JButton)
			{
				Object button =  e.getSource();
				
				if(button == forward)
				{
					if(workflowCount == 0)
					{
						//Query 2
						workflowCount += 1;
						backward.setEnabled(true);
						
						mQuery.setText(WHO_KNOWS_WHO);
						setupWebPipeline();
					}
					/*else if (workflowCount == 1)
					{
						//Query 3
						workflowCount += 1;
						backward.setEnabled(true);
						forward.setEnabled(true);
						
						mQuery.setText(WHO_IS_FEMALE);
						setupWebPipeline();
					}*/
					/*else if (workflowCount == 2)
					{
						//Query 4
						workflowCount += 1;
						backward.setEnabled(true);
						forward.setEnabled(true);
						
						mQuery.setText(SELECT_ALL_TRIPLES);
						setupWebPipeline();
					}*/
					else if (workflowCount == 1)
					{
						//Query 5
						workflowCount += 1;
						backward.setEnabled(true);
						forward.setEnabled(true);
						
						mQuery.setText(SUBCLASS_QUERY);
						setupRulePipeline();
					}
					else if(workflowCount == 2)
					{
						//Query 6
						workflowCount += 1;
						backward.setEnabled(true);
						forward.setEnabled(false);
						
						mQuery.setText(SUBCLASS_OF_SELF);
						setupRulePipeline();
					}
					
					repaint();
					//log.info("Clicked Forward: "+workflowCount);
				}
				
				if(button == backward)
				{
					if(workflowCount == 1)
					{
						//Query 1
						workflowCount -= 1;
						backward.setEnabled(false);
						forward.setEnabled(true);
						
						mQuery.setText(WHO_KNOWS_X);
						setupWebPipeline();
					}
					else if (workflowCount == 2)
					{
						//Query 2
						workflowCount -= 1;
						backward.setEnabled(true);
						forward.setEnabled(true);
						
						mQuery.setText(WHO_KNOWS_WHO);
						setupWebPipeline();
					}
					/*else if (workflowCount == 3)
					{
						//Query 3
						workflowCount -= 1;
						backward.setEnabled(true);
						forward.setEnabled(true);
						
						mQuery.setText(WHO_IS_FEMALE);
						setupWebPipeline();
					}*/
					/*else if (workflowCount == 4)
					{
						//Query 4
						workflowCount -= 1;
						backward.setEnabled(true);
						forward.setEnabled(true);
						
						mQuery.setText(SELECT_ALL_TRIPLES);
						setupWebPipeline();
					}*/
					else if(workflowCount == 3)
					{
						//Query 5
						workflowCount -= 1;
						backward.setEnabled(true);
						forward.setEnabled(true);
						
						mQuery.setText(SUBCLASS_QUERY);
						setupRulePipeline();
					}
					
					repaintView();
					
					//log.info("Clicked Backward: "+workflowCount);
				}
	        }
        }

		private void repaintView()
	    {
			northPanel.repaint();
			northPanel.invalidate();
			northPanel.revalidate();
			
			centerPanel.repaint();
			centerPanel.invalidate();
			centerPanel.revalidate();
			
			southPanel.repaint();
			southPanel.invalidate();
			southPanel.revalidate();
			
			repaint();
			invalidate();
	    }
		
		/**
		 * Called when evaluation has finished.
		 * @param output The evaluation output 
		 */
		synchronized void setOutput( List<List<String>> output )
		{
			if(mOutputTabs == null)
			{
				mOutputTabs = new JTabbedPane();
				southPanel.add(mOutputTabs, "Center");
			}
			
			if(!addNewTab)
			{
				int count = mOutputTabs.getTabCount();
				
				QueryResultTable results = new QueryResultTable(output);
				JTable table = new JTable(results);
	            mOutputTabs.addTab( "Query"+(count+1)+" (" + Integer.toString( output.size() - 1 ) + ")", new JScrollPane( table ) );
	            mOutputTabs.setSelectedIndex( mOutputTabs.getComponentCount() - 1 );
	            
	            addNewTab = true;
			}
			else
			{
				int count = mOutputTabs.getTabCount();
				
				//remove and set again
				mOutputTabs.removeTabAt(count - 1);
				
				QueryResultTable results = new QueryResultTable(output);
				JTable table = new JTable(results);
	            mOutputTabs.addTab( "Query"+(count)+" (" + Integer.toString( output.size() - 1 ) + ")", new JScrollPane( table ) );
	            mOutputTabs.setSelectedIndex( mOutputTabs.getComponentCount() - 1 );
			}
		}
		
		synchronized void setError( String header , String message )
		{
            mOutputTabs.addTab( header, new JScrollPane( new JTextArea( message ) ) );
            
            mRun.setEnabled( false );
			mAbort.setEnabled( false );
			mReset.setEnabled( true );
			
			progressLabel.setText("LarKC is idle...");
			
			addNewTab = false;
		}
		
		synchronized void finished()
		{
			mRun.setEnabled( true );
			mAbort.setEnabled( false );
			mReset.setEnabled( true );
			
			backward.setEnabled(true);
			forward.setEnabled(true);
			
			progressLabel.setText("LarKC is idle...");
			
			addNewTab = false;
		}
		
		class NotifyOutput implements Runnable {
			NotifyOutput( List<List<String>> output ) {
				mOutput = output;
			}
			
			public void run() {
	            setOutput( mOutput );
            }
			
			final List<List<String>> mOutput;
		}
		
		class NotifyError implements Runnable {
			NotifyError( String message ) {
				mMessage = message;
			}
			
			public void run() {
	            setError( "Error", mMessage );
            }
			
			final String mMessage;
		}
		
		class NotifyFinished implements Runnable {
			public void run() {
	            finished();
            }
		}
		
		/**
		 * Starts the evaluation.
		 */
		synchronized void run()
		{
			mRun.setEnabled( false );
			mAbort.setEnabled( true );
			mReset.setEnabled( false );
			backward.setEnabled(false);
			forward.setEnabled(false);
			
			progressLabel.setText("LarKC is processing the query...");
			
			String query = mQuery.getText().trim();
			
			try {
				new SPARQLQueryImpl( query );
			}
			catch( Exception e ) {
				setError( "Error", "Syntax error in query\n" + e.getMessage() );
				
				return;
			}
			
			if((((String) mQueryTransformer.getSelectedItem()).equals("None")) &&
			(((String) mIdentifier.getSelectedItem()).equals("None")) &&
			(((String) mDataTransformer.getSelectedItem()).equals("None")) && 
			(((String) mSelecter.getSelectedItem()).equals("None")) &&
			(((String) mReasoner.getSelectedItem()).equals("None")))
			{
				setError( "Note", "Please select at least one plug-in." );
				
				return;
			}
			
			QueryTransformer qt = mQueryTransformerFactory.create( (String) mQueryTransformer.getSelectedItem() );
			Identifier i = mIdentifierFactory.create( (String) mIdentifier.getSelectedItem() );
			InformationSetTransformer t = mInformationSetTransformerFactory.create( (String) mDataTransformer.getSelectedItem() );
			Selecter s = mSelecterFactory.create( (String) mSelecter.getSelectedItem() );
			Reasoner r = mReasonerFactory.create( (String) mReasoner.getSelectedItem() );
			
			if( t != null ) {
				i = new IdentifierTransformer( i, t );
			}
			
			SimpleAnytimeDecider decider = new SimpleAnytimeDecider( qt, i, s, r );

			mExecutionThread = new Thread( new ExecutionTask( query, decider ), "Evaluation task" );

			mExecutionThread.setPriority( Thread.MIN_PRIORITY );
			mExecutionThread.start();
		}
		
		/**
		 * Aborts the evaluation.
		 */
		synchronized void abort()
		{
			mRun.setEnabled( true );
			mAbort.setEnabled( false );
			mReset.setEnabled( true );
			
			backward.setEnabled(true);
			forward.setEnabled(true);

			// Not very nice, but hey, that's life.
			if(mExecutionThread != null &&
			   mExecutionThread.isAlive())
			{
				mExecutionThread.stop();
				mExecutionThread = null;
			}
			
			progressLabel.setText("LarKC is idle...");
			
			addNewTab = false;
		}
		
		synchronized void reset() {
			
			setCursor(Cursor.WAIT_CURSOR);
			
    		// Delete any persisted data.
			deleteTemporaryData();
    		
			if(mOutputTabs != null)
			{				
				mOutputTabs.removeAll();
				southPanel.remove(mOutputTabs);
				mOutputTabs = null;
			}
			
    		mRun.setEnabled( true );
			mAbort.setEnabled( false );
			mReset.setEnabled( true );
			
			setCursor(Cursor.getDefaultCursor());
			progressLabel.setText("LarKC is idle...");
			
			addNewTab = false;
			
			int result = JOptionPane.showConfirmDialog(this, "Do you also want to reset the query and the workflow?", "Resetting inputs", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			
			switch(result)
			{
				case JOptionPane.NO_OPTION: 
					break;
				case JOptionPane.YES_OPTION:
					mQuery.setText("");
					setupDefaultPipeline();
					mQuery.requestFocus();
	
					forward.setEnabled(true);
					backward.setEnabled(false);
					
					workflowCount = 0;
					break;
				default: 
					break;
			}			
			
			repaintView();
		}
		
		synchronized void deleteTemporaryData() {
    		// Delete any persisted data.
    		RdfStoreConnection con =DataFactoryImpl.getInstance().createRdfStoreConnection();
    		con.removeStatement(null, null, null, null);
    		con.close();
		}
		
		/**
		 * Runnable task for performing the evaluation.
		 */
		class ExecutionTask implements Runnable
		{
			ExecutionTask( String query, SimpleAnytimeDecider decider )
			{
				this.query = query;
				this.decider = decider;
			}
			
//			@Override
	        public void run()
	        {
	        	Logger log = LoggerFactory.getLogger(DemoGuiPipelineEditor.class);
	        	try {
	        		SPARQLQuery query = new SPARQLQueryImpl( this.query );
		    		if (query.isSelect()) {
		    			decider.startASyncSparqlSelect(query, null);
		    		} 
		    		else if (query.isConstruct()) {
		    			decider.startASyncSparqlConstruct(query, null);
		    		} 
		    		else if (query.isDescribe()) {
		    			decider.startASyncSparqlDescribe(query, null);
		    		} 
		    		else if (query.isAsk()) {
		    			decider.startASyncSparqlAsk(query, null);
		    		}
		    		
		    		for(;;) {
		    			if (query.isSelect()) {
		    				VariableBinding result = decider.getNextSparqlSelectResult();
		    				if(result == null){
		    					break;
		    				}
		    				printVariableBindings(result);
		    			} 
		    			else if (query.isConstruct()) {
		    				SetOfStatements result = decider.getNextSparqlConstructResult();
		    				if(result == null){
		    					break;
		    				}
		    				printSetOfStatements(result);
		    			} 
		    			else if (query.isDescribe()) {
		    				SetOfStatements result = decider.getNextSparqlDescribeResult();
		    				if(result == null){
		    					break;
		    				}
		    				printSetOfStatements(result);
		    			} 
		    			else if (query.isAsk()) {
		    				BooleanInformationSet result = decider.getNextSparqlAskResult();
		    				if(result == null){
		    					break;
		    				}
		    				printBoolean(result);
		    			}
		    		}
		    		
		    		if( LOGGING )
		    			log.info( "**** FINISHED ****" );
		    		
					SwingUtilities.invokeLater( new NotifyFinished() );
	        	}
	        	catch( Exception e ) {
					SwingUtilities.invokeLater( new NotifyError( "Incomplete workflow. Please make sure that your workflow contains all necessary plug-ins" ) );
					SwingUtilities.invokeLater( new NotifyFinished() );
	        	}
	        }
	        
	    	private void printVariableBindings(VariableBinding bindings) {
	    		List<List<String>> results = new ArrayList<List<String>>();
	    		
	    		results.add( bindings.getVariables() );

	    		CloseableIterator<VariableBinding.Binding> bindingIterator = bindings.iterator();
	    		while (bindingIterator.hasNext()) {
	    			VariableBinding.Binding binding = bindingIterator.next();
	    			List<String> result = new ArrayList<String>();

	    			for (int col = 0; col < binding.getValues().size(); ++col) {
	    				String value = binding.getValues().get(col).toString();
	    				result.add( value );
	    			}
	    			
	    			results.add( result );
	    		}
	    		bindingIterator.close();
	    		
	    		SwingUtilities.invokeLater( new NotifyOutput( results ) );
	    	}
	    	
	    	private void printSetOfStatements(SetOfStatements theSetOfStatements) {
	    		final String subject = "Subject";
	    		final String predicate = "Predicate";
	    		final String object = "Object";
	    		
	    		List<List<String>> results = new ArrayList<List<String>>();
	    		
	    		List<String> headings = new ArrayList<String>();
	    		headings.add( subject );
	    		headings.add( predicate );
	    		headings.add( object );
	    		results.add( headings );
	    		
	    		CloseableIterator<Statement> s = theSetOfStatements.getStatements();
	    		while (s.hasNext()){
	    			Statement st = s.next();
	    			if (st != null){
	    				List<String> result = new ArrayList<String>();
	    				result.add( st.getSubject().toString() );
	    				result.add( st.getPredicate().toString() );
	    				result.add( st.getObject().toString() );

	    				results.add( result );
	    			}
	    		}
	    		s.close();

				SwingUtilities.invokeLater( new NotifyOutput( results ) );
	    	}
	    	
	    	private void printBoolean(BooleanInformationSet value) {
	    		List<List<String>> results = new ArrayList<List<String>>();
	    		
	    		List<String> headings = new ArrayList<String>();
	    		headings.add( "Boolean" );

	    		List<String> values = new ArrayList<String>();
	    		values.add( value.getValue() ? "TRUE" : "FALSE" );

	    		SwingUtilities.invokeLater( new NotifyOutput( results ) );
	    	}
			
			private final String query;
			private final SimpleAnytimeDecider decider;
		}
		
		public static class Factory<E extends Plugin> {
			public interface PluginFactory {
				Plugin create();
			}
			
			public String[] getNames() {
				String[] results = mPlugins.keySet().toArray( new String[ mPlugins.keySet().size() ] );
				Arrays.sort( results );
				return results;
			}

			public void add( String name, PluginFactory factory ) {
				mPlugins.put( name, factory );
			}
			
			@SuppressWarnings("unchecked")
            public E create( String name ) {
				return (E) mPlugins.get( name ).create();
			}

			private Map<String, PluginFactory> mPlugins = new HashMap<String, PluginFactory>();
		}
		
		private Factory<QueryTransformer> mQueryTransformerFactory = new Factory<QueryTransformer>();
		private Factory<Identifier> mIdentifierFactory = new Factory<Identifier>();
		private Factory<InformationSetTransformer> mInformationSetTransformerFactory = new Factory<InformationSetTransformer>();
		private Factory<Selecter> mSelecterFactory = new Factory<Selecter>();
		private Factory<Reasoner> mReasonerFactory = new Factory<Reasoner>();
		
		private void setupPlugins() {
//			mQueryTransformerFactory.add( 
//							"SPARQL->keyword", new Factory.PluginFactory() { public Plugin create() {
//								return new SPARQLToKeywordQueryTransformer();
//							} } );
			mQueryTransformerFactory.add(
							"SPARQL->triple pattern", new Factory.PluginFactory() { public Plugin create() {
								return new SPARQLToTriplePatternQueryTransformer();
							} } );
			mQueryTransformerFactory.add(
							"None", new Factory.PluginFactory() { public Plugin create() {
								return new PassItOnTransformer();
							} } );
			
//			mIdentifierFactory.add(
//							"Sindice (keyword)", new Factory.PluginFactory() { public Plugin create() {
//								return new SindiceKeywordIdentifier();
//							} } );
			mIdentifierFactory.add(
							"Sindice (triple pattern)", new Factory.PluginFactory() { public Plugin create() {
								return new SindiceTriplePatternIdentifier();
							} } );
//			mIdentifierFactory.add(
//							"Swoogle (document)", new Factory.PluginFactory() { public Plugin create() {
//								return new SwoogleDocumentSearchIdentifier();
//							} } );
//			mIdentifierFactory.add(
//							"Swoogle (ontology)", new Factory.PluginFactory() { public Plugin create() {
//								return new SwoogleOntologySearchIdentifier();
//							} } );
//			mIdentifierFactory.add(
//							"Swoogle (term)", new Factory.PluginFactory() { public Plugin create() {
//								return new SwoogleTermSearchIdentifier();
//							} } );
			mIdentifierFactory.add(
					"None", new Factory.PluginFactory() { public Plugin create() {
						return null;
					} } );
			mIdentifierFactory.add(
							"UniProt (core)", new Factory.PluginFactory() { public Plugin create() {
								return new SimpleFileReaderIdentifier("files/data/core.owl");
							} } );
			mIdentifierFactory.add(
							"UniProt (core+pathways)", new Factory.PluginFactory() { public Plugin create() {
								return new SimpleFileReaderIdentifier("files/data/core.owl", "files/data/pathways.rdf");
							} } );
			mIdentifierFactory.add(
							"Beer", new Factory.PluginFactory() { public Plugin create() {
								return new SimpleFileReaderIdentifier("files/data/beer.owl");
							} } );
//			mIdentifierFactory.add(
//							"News item 1", new Factory.PluginFactory() { public Plugin create() {
//								return new SimpleTextFileIdentifier("files/data/news1.txt");
//							} } );
//			mIdentifierFactory.add(
//							"News item 2", new Factory.PluginFactory() { public Plugin create() {
//								return new SimpleTextFileIdentifier("files/data/news2.txt");
//							} } );
//			mIdentifierFactory.add(
//							"Yahoo", new Factory.PluginFactory() { public Plugin create() {
//								return new YahooKeywordIdentifier();
//							} } );

			mInformationSetTransformerFactory.add(
							"None", new Factory.PluginFactory() { public Plugin create() {
								return new NullDataTransformer();
							} } );
//			mInformationSetTransformerFactory.add(
//							"Open Calais", new Factory.PluginFactory() { public Plugin create() {
//								return new OpenCalaisTransformer();
//							} } );
			
			mSelecterFactory.add(
					"None", new Factory.PluginFactory() { public Plugin create() {
						return null;
					} } );
			mSelecterFactory.add(
							"Growing data set", new Factory.PluginFactory() { public Plugin create() {
								return new GrowingDataSetSelecter();
							} } );
//			mSelecterFactory.add(
//							"First only", new Factory.PluginFactory() { public Plugin create() {
//								return new SingleGraphSelecter();
//							} } );

			mReasonerFactory.add(
					"None", new Factory.PluginFactory() { public Plugin create() {
						return null;
					} } );
			mReasonerFactory.add(
							"SPARQL only", new Factory.PluginFactory() { public Plugin create() {
								return new SparqlQueryEvaluationReasoner();
							} } );
			mReasonerFactory.add(
							"IRIS (RDF)", new Factory.PluginFactory() { public Plugin create() {
								return new IrisRuleBasedReasoner("files/RDF_entailment.rules");
							} } );
			mReasonerFactory.add(
							"IRIS (L2)", new Factory.PluginFactory() { public Plugin create() {
								return new IrisRuleBasedReasoner("files/L2_entailment.rules");
							} } );
			mReasonerFactory.add(
							"IRIS (RDFS)", new Factory.PluginFactory() { public Plugin create() {
								return new IrisRuleBasedReasoner("files/RDFS_entailment.rules");
							} } );
		}

		@Override
		public void componentHidden(ComponentEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void componentMoved(ComponentEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void componentResized(ComponentEvent e) {
			
			WINDOW_SIZE = new Dimension(this.getWidth(), this.getHeight());
			
			northPanel.setPreferredSize(new Dimension(this.getWidth(), 200));
			centerPanel.setPreferredSize(new Dimension(this.getWidth(), (int)(this.getHeight() * 0.10)));
			southPanel.setPreferredSize(new Dimension(this.getWidth(), (int)(this.getHeight() * 0.60)));
			
			repaintView();
		}

		@Override
		public void componentShown(ComponentEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	
	static class IdentifierTransformer implements Identifier {
		public IdentifierTransformer( Identifier identifier, InformationSetTransformer transformer ) {
			mIdentifier = identifier;
			mTransformer = transformer;
		}
		
		private final Identifier mIdentifier;
		private final InformationSetTransformer mTransformer;
		
		public Collection<InformationSet> identify(Query theQuery,
						Contract contract, Context context) {
			
			Collection<InformationSet> sets = mIdentifier.identify( theQuery, contract, context );
			
			if( sets == null )
				return null;
			
			List<InformationSet> transformed = new ArrayList<InformationSet>();
			
			for( InformationSet i1 : sets ) {
				InformationSet i2 = mTransformer.transform( i1, contract, context );
				transformed.add( i2 );
			}
			
			return transformed;
		}

		@Override
        public URI getIdentifier() {
	        return null;
        }

		@Override
        public QoSInformation getQoSInformation() {
	        return null;
        }

		@Override
        public Context createContext() {
	        return null;
        }

		@Override
        public void initialise() {
        }

		@Override
        public void shutdown() {
        }
	}
}
