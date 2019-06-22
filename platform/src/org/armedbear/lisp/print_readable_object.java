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
package org.armedbear.lisp;

/**
 * TODO Describe this type briefly. 
 * If necessary include a longer description and/or an example.
 * 
 * @author Administrator
 *
 */
public class print_readable_object extends Primitive {

	/**
	 * TODO Describe this constructor.
	 * @param name
	 * @param pkg
	 * @param exported
	 * @param arglist
	 */
	public print_readable_object() {
		super("%PRINT-READABLE-OBJECT", Lisp.PACKAGE_SYS,  true, "obj str &key :type t");
	}
	/* (non-Javadoc)
	 * @see org.armedbear.lisp.Function#execute(org.armedbear.lisp.LispObject[])
	 */
	@Override
	public LispObject execute(LispObject[] args) {
		String s = args[1].toString();
		checkStream(args[0]).write(s);
		return T;
	}

}
