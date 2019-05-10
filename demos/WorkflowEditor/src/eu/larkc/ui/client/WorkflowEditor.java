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
package eu.larkc.ui.client;

import java.util.List;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TabLayoutPanel;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import eu.larkc.ui.shared.PluginType;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class WorkflowEditor implements EntryPoint {
  /**
   * The message displayed to the user when the server cannot be reached or
   * returns an error.
   */
  private static final String SERVER_ERROR = "An error occurred while attempting to contact the server: ";

  /**
   * Create a remote service proxy to talk to the server-side WorkflowEditor service.
   */
  private final WorkflowEditorServiceAsync mWorkflowEditorService = GWT.create(WorkflowEditorService.class);

	public void onModuleLoad() {
		loadResources();
		setupStartPage();
//		createMainMenu();
	}

	private void loadResources() {
	}

	private void setupStartPage() {
		
		Label lblMessage = new Label( "Looking up registered plug-ins, please wait..." );

		VerticalPanel vPanel = new VerticalPanel();
		vPanel.setWidth( "100%" );
		vPanel.setHorizontalAlignment( VerticalPanel.ALIGN_LEFT );
		vPanel.add( lblMessage );

	    RootPanel.get().clear();
		RootPanel.get().add( createPageHeading( "Start!" ) );
		RootPanel.get().add( vPanel );

		AsyncCallback<List<String>> callback = new AsyncCallback<List<String>>() {
			public void onFailure( Throwable caught ) {
				new MessageBox( SERVER_ERROR + caught.getMessage() );
			}

			public void onSuccess( List<String> plugins ) {
				setupPluginsPage( plugins );
			}
		};
		
		try {
	        mWorkflowEditorService.getPlugins( callback );
        }
        catch( Exception e ) {
	        new MessageBox( "An error occurred on the server when retrieving the list of registered plug-ins: " + e.getMessage() );
        }
	}
	
	private void addPlugin( String url ) {
		AsyncCallback<Boolean> callback = new AsyncCallback<Boolean>() {
			public void onFailure( Throwable caught ) {
				new MessageBox( "Sorry, an error occurred when saving the plugin details to the server: " + caught.getMessage() );
			}

			public void onSuccess( Boolean result ) {
				setupStartPage();
			}
		};
		try {
	        mWorkflowEditorService.addPlugin( url, callback );
        }
        catch( Exception e ) {
	        new MessageBox( "There was an error saving the plugin URL on the server: " + e.getMessage() );
        }
	}
	
	private void removePlugin( String url ) {
		
		AsyncCallback<Boolean> callback = new AsyncCallback<Boolean>() {
			public void onFailure( Throwable caught ) {
				new MessageBox( "Sorry, an error occurred when deleting the plugin URL on the server: " + caught.getMessage() );
			}

			public void onSuccess( Boolean result ) {
				setupStartPage();
			}
		};
		try {
	        mWorkflowEditorService.removePlugin( url, callback );
        }
        catch( Exception e ) {
	        new MessageBox( "There was an error removing the plugin URL from the server: " + e.getMessage() );
        }
	}

	private void setupPluginsPage( final List<String> plugins ) {

		final FlexTable flexTable = new FlexTable();
		for( int p = 0; p < plugins.size(); ++p ) {
			Button delete = createDeleteButton( p );
			String pluginUrl = plugins.get( p );
			
			flexTable.setText( p, 0, plugins.get( p ) );
			flexTable.setWidget( p, 1, new HTML( "<a href=\"" + pluginUrl + "\">test</a>" ) );
			flexTable.setWidget( p, 2, delete );
			
			delete.addClickHandler(new ClickHandler() {
				public void onClick( ClickEvent event ) {
					IdButton btn = (IdButton) event.getSource();
					final String url = flexTable.getText( btn.getId(), 0 );

					QuestionBox.confirm( "Are you sure you want to delete '" + url + "'?",
									new Command() {
										public void execute() {
											removePlugin( url );
                                        }} );
				}
			} );

		}

	    final Button addButton = new Button("Add plugin URL...");
	    final Button workflowButton = new Button("Execute a workflow...");
	    
	    HTML explanatoryText = new HTML(
	    				"<p>" +
	    				"The following list shows all the <a href=\"www.larkc.eu\">LarKC</a> plug-in containers registered with this application server. " +
	    				"The list is global and shared between all users." +
	    				"</p>" +
	    				"<p>" +
	    				"Each URL should point to a LarKC plugin container that was created using the LarKC JEE extensions converter utility " +
	    				"and deployed to an application server (e.g. tomcat)." +
	    				"</p>" +
	    				"<p>" +
	    				"Click the <b>Add plugin URL</b> button to register a deployed plug-in container with this instance " +
	    				"and click the 'X' button next to one of the plugin URLs to unregister it. " +
	    				"Clicking on <b>test</b> next to a plug-in container will perform a rudimentary test by issuing an HTTP GET request " +
	    				"with thsi URL. The correct behaviour of a LarKC plugin container is to return the unique ID of a newly instantiated plug-in instance." +
	    				"</p>"
	    );
	    
		VerticalPanel vPanel = new VerticalPanel();
		vPanel.setWidth( "100%" );
		vPanel.setHorizontalAlignment( VerticalPanel.ALIGN_LEFT );
		vPanel.add( explanatoryText );
		vPanel.add( workflowButton );
		vPanel.add( flexTable );
		vPanel.add( addButton );

	    RootPanel.get().clear();
		RootPanel.get().add( createPageHeading( "Registered Plug-ins" ) );
//	    RootPanel.get().add(mMainMenu);
		RootPanel.get().add( vPanel );
		
		addButton.addClickHandler(new ClickHandler() {
			public void onClick( ClickEvent event ) {
				InputBox input = new InputBox( "", new InputBox.Command() {
					public void execute( List<Widget> widgets ) {
						String url = ( (TextBox) widgets.get( 0 ) ).getValue().trim();
						if( url == null ) {
							MessageBox.show( "The URL must be entered" );
						}
						else {
							addPlugin( url );
						}
		            }} );
				TextBox editUrl = new TextBox();
				input.addInputItem( "Enter the URL of the plugin", editUrl );
				input.show();
			}
		}
		);

		workflowButton.addClickHandler(new ClickHandler() {
			public void onClick( ClickEvent event ) {
				runWorkflow( plugins );
			}
		}
		);
	}
	
	private void runWorkflow( List<String> plugins ) {
		
		final TextArea textQuery = new TextArea();
	    final ListBox lbQueryTransformers = new ListBox();
	    final ListBox lbIdentifiers = new ListBox();
	    final ListBox lbDataTransformers = new ListBox();
	    final ListBox lbSelecters = new ListBox();
	    final ListBox lbReasoners = new ListBox();
	    final ListBox lbDeciders = new ListBox();
	    
		final Button btnOk = createOkButton();
		final Button btnCancel = createCancelButton();

		textQuery.setText( mLastQuery );
		textQuery.setVisibleLines( 12 );
		textQuery.setWidth( "40em" );
		
	    for( String plugin : plugins ) {
	    	switch( PluginType.stringToPluginType( plugin ) ) {
	    	case QUERY_TRANSFORMER:
	    		lbQueryTransformers.addItem( plugin );
	    		break;
	    	case IDENTIFIER:
	    		lbIdentifiers.addItem( plugin );
	    		break;
	    	case DATA_TRANSFORMER:
	    		lbDataTransformers.addItem( plugin );
	    		break;
	    	case SELECTER:
	    		lbSelecters.addItem( plugin );
	    		break;
	    	case REASONER:
	    		lbReasoners.addItem( plugin );
	    		break;
	    	case DECIDER:
	    		lbDeciders.addItem( plugin );
	    		break;
	    	}
	    }

	    lbQueryTransformers.setVisibleItemCount(1);
	    lbIdentifiers.setVisibleItemCount(1);
	    lbDataTransformers.setVisibleItemCount(1);
	    lbSelecters.setVisibleItemCount(1);
	    lbReasoners.setVisibleItemCount(1);
	    lbDeciders.setVisibleItemCount(1);
	    
		setIfPossible( lbQueryTransformers, mLastQueryTransformer );
		setIfPossible( lbIdentifiers, mLastIdentifier );
		setIfPossible( lbDataTransformers, mLastDataTransformer );
		setIfPossible( lbSelecters, mLastSelecter );
		setIfPossible( lbReasoners, mLastReasoner );
		
	    ChangeHandler okEnableHandler = new ChangeHandler() {
			@Override
			public void onChange( ChangeEvent event ) {
				if( lbQueryTransformers.getSelectedIndex() >= 0 &&
					lbIdentifiers.getSelectedIndex() >= 0 &&
				    lbDataTransformers.getSelectedIndex() >= 0 &&
				    lbSelecters.getSelectedIndex() >= 0 &&
				    lbReasoners.getSelectedIndex() >= 0 ) {
					btnOk.setEnabled( true );
				}
				else {
					btnOk.setEnabled( false );
				}
			}
		};
		
	    lbQueryTransformers.addChangeHandler( okEnableHandler );
	    lbIdentifiers.addChangeHandler( okEnableHandler );
	    lbDataTransformers.addChangeHandler( okEnableHandler );
	    lbSelecters.addChangeHandler( okEnableHandler );
	    lbReasoners.addChangeHandler( okEnableHandler );
//	    lbDeciders.addChangeHandler( okEnableHandler );

		FlexTable flexTable = new FlexTable();

		flexTable.setText( 0, 0, "Query" );
		flexTable.setWidget( 0, 1, textQuery );
		flexTable.setText( 1, 0, "Query transformer" );
		flexTable.setWidget( 1, 1, lbQueryTransformers );
		flexTable.setText( 2, 0, "Identifier" );
		flexTable.setWidget( 2, 1, lbIdentifiers );
		flexTable.setText( 3, 0, "Data transformer" );
		flexTable.setWidget( 3, 1, lbDataTransformers );
		flexTable.setText( 4, 0, "Selecter" );
		flexTable.setWidget( 4, 1, lbSelecters );
		flexTable.setText( 5, 0, "Reasoner" );
		flexTable.setWidget( 5, 1, lbReasoners );

		HorizontalPanel okCancelPanel = new HorizontalPanel();
		okCancelPanel.add( btnOk );
		okCancelPanel.add( btnCancel );

		VerticalPanel vPanel = new VerticalPanel();
		vPanel.setWidth( "100%" );
		vPanel.setHorizontalAlignment( VerticalPanel.ALIGN_LEFT );
		vPanel.add( flexTable );
		vPanel.add( okCancelPanel );

		final DialogBox dialogBox = new DialogBox();

		dialogBox.setText( "Select plug-ins for linear workflow" );
		
		dialogBox.setWidget( vPanel );
		dialogBox.center();

		btnOk.addClickHandler(new ClickHandler() {
			public void onClick( ClickEvent event ) {
				// Remember the query for next time
				mLastQuery = textQuery.getText();
				
				// Remember the indexes for next time
				mLastQueryTransformer = lbQueryTransformers.getSelectedIndex();
				mLastIdentifier = lbIdentifiers.getSelectedIndex();
				mLastDataTransformer = lbDataTransformers.getSelectedIndex();
				mLastSelecter = lbSelecters.getSelectedIndex();
				mLastReasoner = lbReasoners.getSelectedIndex();
				
				String query = textQuery.getText();
				String qt = getSelectedText( lbQueryTransformers );
				String i = getSelectedText( lbIdentifiers );
				String dt = getSelectedText( lbDataTransformers );
				String s = getSelectedText( lbSelecters );
				String r = getSelectedText( lbReasoners );
				
				executeWorkflow( query, qt, i, dt, s, r );

//				dialogBox.hide();
			}
		} );

		btnCancel.addClickHandler(new ClickHandler() {
			public void onClick( ClickEvent event ) {
				dialogBox.hide();
			}
		} );

	}
	
	private void executeWorkflow( String query, String qt, String i, String dt, String s, String r ) {
		// Setup and show a dialog box with tabs
		
		FlexTable tempTable = new FlexTable();
		tempTable.setText( 0, 0, "Blah" );
		tempTable.setText( 0, 1, "Longer piece of text" );
		tempTable.setText( 1, 0, "Musch longer pieve of text indeed" );
		tempTable.setText( 1, 1, "Something short again" );
		
		
//	    final TabLayoutPanel tabPanel = new TabLayoutPanel(5, Unit.EM);
//		tabPanel.setHeight( "100%" );
//		tabPanel.setWidth( "100%" );
//	    tabPanel.add(tempTable, "Result set 1");

	    final Button btnClose = new Button( "Ok" );
	    
		HorizontalPanel buttonPanel = new HorizontalPanel();
		buttonPanel.add( btnClose );

		VerticalPanel vPanel = new VerticalPanel();
		vPanel.setWidth( "100%" );
		vPanel.setHorizontalAlignment( VerticalPanel.ALIGN_LEFT );
		vPanel.add( tempTable );
		vPanel.add( buttonPanel );

		final DialogBox dialogBox = new DialogBox();

		dialogBox.setText( "Executing workflow" );
		
		dialogBox.setWidget( vPanel );
		dialogBox.center();

		btnClose.addClickHandler(new ClickHandler() {
			public void onClick( ClickEvent event ) {
				dialogBox.hide();
			}
		} );

		// Start the server process
		// Set up a polling timer
		// On each poll check for results
		// On close: stop timer, close dialog
		
    }

	private String getSelectedText( ListBox listbox ) {
		return listbox.getItemText( listbox.getSelectedIndex() );
	}
	
	private void setIfPossible( ListBox listBox, int index ) {
		if( index >= 0 && index < listBox.getItemCount() )
			listBox.setSelectedIndex( index );
	}

	private Widget createPageHeading( String text ) {
		Label lblHeading = new Label( text );
		lblHeading.setStyleName( "page-heading" );
		return lblHeading;
	}
	
	private Button createDeleteButton( int id ) {
		return new IdButton( "X", id );
	}

	private Button createOkButton() {
		return new Button( "Ok" );
	}

	private Button createCancelButton() {
		return new Button( "Cancel" );
	}
	
//	private static final String NEWLINE = System.getProperty( "line.separator" );
	private static final String NEWLINE = "\n";

	private static final String PREFIXES = "PREFIX foaf: <http://xmlns.com/foaf/0.1/> " + NEWLINE +
		"PREFIX owl: <http://www.w3.org/2002/07/owl/>" + NEWLINE +
		"PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>" + NEWLINE +
		"PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns/>" + NEWLINE +
		"PREFIX sti: <http://sti2.at/>"  + NEWLINE;
	
	private static final String DEFAULT_QUERY =
		"SELECT DISTINCT ?name where {\n" + 
		"?person rdf:type foaf:Person .\n" + 
		"?person foaf:name \"Frank van Harmelen\" .\n" +
		"?person2 rdf:type foaf:Person .\n" + 
		"?person2 foaf:knows ?person .\n" +
		"?person2 foaf:name ?name .\n" +
		"}";

	private String mLastQuery = PREFIXES + NEWLINE + DEFAULT_QUERY;
	private int mLastQueryTransformer = -1;
	private int mLastIdentifier = -1;
	private int mLastDataTransformer = -1;
	private int mLastSelecter = -1;
	private int mLastReasoner = -1;
}
