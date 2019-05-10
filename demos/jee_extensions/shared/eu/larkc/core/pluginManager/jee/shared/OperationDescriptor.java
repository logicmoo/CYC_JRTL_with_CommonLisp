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
package eu.larkc.core.pluginManager.jee.shared;

/**
 * Convenient class which holds the possible operation constants.
 */
public class OperationDescriptor {
	
	/** Identifies an operation */
	public static final String OPERATION = "operation";
	
	/** Operation "get QoS information". */
	public static final String OP_GET_QOS_INFO		= "get_qos_info";
	
	/** Operation "get identifier" */
	public static final String OP_GET_IDENTIFIER	= "get_identifier";
	
	/** Operation "create context" */
	public static final String OP_CREATE_CONTEXT	= "create_context";
	
	/** Operation "invoke" */
	public static final String OP_INVOKE			= "invoke";
}
