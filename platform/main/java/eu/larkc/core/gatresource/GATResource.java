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
package eu.larkc.core.gatresource;

import eu.larkc.core.Resource;

/**
 * The class represents remote resource's properties 
 * for the remote execution with GAT
 * 
 * @author Alexey Cheptsov
 * 
 */


public class GATResource implements Resource {
	public String URI;
	public String FileAdaptor;
	public String Broker;
	public String LarKCDir;
	public String WorkDir;
	public String JavaDir;
	public String JavaArgs;
	public int NumMPIProcesses;

	/**
	 * Constructor of the class.
	 *
	 * @param URI
	 *		Resource URI in the GAT format, i.e. any://localhost
	 */
	public GATResource(String URI, String FileAdaptor, String Broker, String LarKCDir, String WorkDir, String JavaDir, String JavaArgs) {		
		this.URI = URI;
		this.FileAdaptor = FileAdaptor;
		this.Broker = Broker;
		this.LarKCDir = LarKCDir;
		this.WorkDir = WorkDir;
		this.JavaDir = JavaDir;
		this.JavaArgs = JavaArgs;
	}
	
	public GATResource(String URI, String FileAdaptor, String Broker, String LarKCDir, String WorkDir, String JavaDir, String JavaArgs, int NumMPIProcesses) {
		this.URI = URI;
		this.FileAdaptor = FileAdaptor;
		this.Broker = Broker;
		this.LarKCDir = LarKCDir;
		this.WorkDir = WorkDir;
		this.JavaDir = JavaDir;
		this.JavaArgs = JavaArgs;
		this.NumMPIProcesses = NumMPIProcesses;
	}
}