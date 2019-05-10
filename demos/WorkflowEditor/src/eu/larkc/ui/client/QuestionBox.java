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

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

public class QuestionBox {
	
	public static void confirm( String message, Command yesAction ) {
		new QuestionBox( message, ButtonType.YES_NO, yesAction, null );
	}
	
	enum ButtonType {
		YES_NO,
		OK_CANCEL
	}
	
	public QuestionBox( String message, ButtonType buttonType, final Command cmdYes, final Command cmdNo ) {

  	    Button btnYes;
  	    Button btnNo;
  	    
  	    if( buttonType == ButtonType.YES_NO ) {
  	    	btnYes = new Button( "Yes" );
  	    	btnNo = new Button( "No" );
  	    }
  	    else {
  	    	btnYes = new Button( "Ok" );
	    	btnNo = new Button( "Cancel" );
  	    }
  	    
  	    HorizontalPanel buttonPanel = new HorizontalPanel();
  	    buttonPanel.add( btnYes );
  	    buttonPanel.add( btnNo );

  	    VerticalPanel messagePanel = new VerticalPanel();
  	    messagePanel.setWidth("100%");
  	    messagePanel.setHorizontalAlignment(VerticalPanel.ALIGN_LEFT);
  		Label lblMessage = new Label( message );
  	    messagePanel.add(lblMessage);
  	    messagePanel.add(buttonPanel);
  	    
  		final DialogBox dialogBox = new DialogBox();
  	    dialogBox.setAnimationEnabled(true);
  		dialogBox.setWidget(messagePanel);
  	    dialogBox.setText( Configuration.TITLE_BAR_TEXT );
		dialogBox.center();

		btnYes.addClickHandler(new ClickHandler() {
  	      public void onClick(ClickEvent event) {
  	        dialogBox.hide();
  	        if( cmdYes != null )
  	        	cmdYes.execute();
  	      }
  	    });

		btnNo.addClickHandler(new ClickHandler() {
	  	      public void onClick(ClickEvent event) {
	  	        dialogBox.hide();
	  	        if( cmdNo != null )
	  	        	cmdNo.execute();
	  	      }
	  	    });

		dialogBox.show();
	}
}
