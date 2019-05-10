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
package eu.larkc.core.pluginManager.local;

import java.util.Properties;
import eu.larkc.plugin.Contract;

/**
 * A simple contract object that is serialisable and *NOT* declared
 * as an anonymous inner class of some plug-in manager (which requires
 * all the wrapping classes to be serialisable as well).
 */
public class SimpleContract extends Properties implements Contract {
}
