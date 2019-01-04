package org.appdapter.api.trigger;

import javax.swing.JPanel;

public interface UserResult
{
    public static final UserResult SUCCESS = new UserResult() {
        @Override
        public String toString() {
            return "SUCCESS";
        }
        
        @Override
        public JPanel getPropertiesPanel() {
            return null;
        }
    };
    
    JPanel getPropertiesPanel();
}

/*

	Total time: 40 ms
	
*/