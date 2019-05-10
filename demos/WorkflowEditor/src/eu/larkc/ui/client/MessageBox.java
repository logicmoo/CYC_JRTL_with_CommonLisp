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
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

public class MessageBox {
	
	public static void show( String message ) {
		new MessageBox( message );
	}
	
	public MessageBox( String message ) {
		Label lblMessage = new Label( message );
		final DialogBox dialogBox = new DialogBox();

		dialogBox.setAnimationEnabled(true);

  	    Button closeButton = new Button("close");
  	    VerticalPanel dialogVPanel = new VerticalPanel();
  	    dialogVPanel.setWidth("100%");
  	    dialogVPanel.setHorizontalAlignment(VerticalPanel.ALIGN_LEFT);
  	    dialogVPanel.add(lblMessage);
  	    dialogVPanel.add(closeButton);
  	    dialogBox.setWidget(dialogVPanel);
  	
  	    dialogBox.setText( Configuration.TITLE_BAR_TEXT );
  		lblMessage.setText( message );
		dialogBox.center();
		dialogBox.show();

		closeButton.addClickHandler(new ClickHandler() {
  	      public void onClick(ClickEvent event) {
  	        dialogBox.hide();
  	      }
  	    });
	}
}
