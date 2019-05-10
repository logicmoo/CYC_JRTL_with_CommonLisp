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

import java.util.ArrayList;
import java.util.List;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class InputBox {
	
//	public static void inputString( String message, String label, Command cmd ) {
//		InputBox input = new InputBox( message, cmd );
//		input.addInputItem( label, new TextBox() );
//		input.show();
//	}
	
	public interface Command {
		void execute( List<Widget> widgets );
	}
	
	public InputBox( String message, final Command cmdAction ) {

    	Button btnYes = new Button( "Ok" );
    	Button btnNo = new Button( "Cancel" );
  	    
  	    HorizontalPanel buttonPanel = new HorizontalPanel();
  	    buttonPanel.add( btnYes );
  	    buttonPanel.add( btnNo );

  	    VerticalPanel messagePanel = new VerticalPanel();
  	    messagePanel.setWidth("100%");
  	    messagePanel.setHorizontalAlignment(VerticalPanel.ALIGN_LEFT);
  		Label lblMessage = new Label( message );
  	    messagePanel.add(lblMessage);
  	    messagePanel.add( mTable );
  	    messagePanel.add(buttonPanel);
  	    
  	    mDialogBox.setAnimationEnabled(true);
  		mDialogBox.setWidget(messagePanel);
  	    mDialogBox.setText( Configuration.TITLE_BAR_TEXT );
		mDialogBox.center();

		btnYes.addClickHandler(new ClickHandler() {
  	      public void onClick(ClickEvent event) {
  	        mDialogBox.hide();
  	        if( cmdAction != null )
  	        	cmdAction.execute( mWidgets );
  	      }
  	    });

		btnNo.addClickHandler(new ClickHandler() {
  	      public void onClick(ClickEvent event) {
  	        mDialogBox.hide();
  	      }
  	    });
	}

	public void addInputItem( String label, Widget widget ) {
		int row = mTable.getRowCount();
		
		mTable.setText( row, 0, label );
		mTable.setWidget( row, 1, widget );
		
		mWidgets.add( widget );
	}
	
	public void show() {
		mDialogBox.show();
	}
	
	private final DialogBox mDialogBox = new DialogBox();
	private final FlexTable mTable = new FlexTable();
	private final List<Widget> mWidgets = new ArrayList<Widget>();
}
