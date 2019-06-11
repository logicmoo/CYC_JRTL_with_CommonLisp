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
 * TODO Describe this type briefly. If necessary include a longer description
 * and/or an example.
 * 
 * @author Administrator
 *
 */
public interface StackFrameHolder {
	/**
	 * TODO Describe the purpose of this method.
	 * 
	 * @param function
	 */
	void pushLispStackFrame(LispObject function);

	/**
	 * TODO Describe the purpose of this method.
	 * 
	 * @param function
	 * @param first
	 */
	void pushLispStackFrame(LispObject function, LispObject first);

	/**
	 * TODO Describe the purpose of this method.
	 * 
	 * @param function
	 * @param first
	 * @param second
	 */
	void pushLispStackFrame(LispObject function, LispObject first, LispObject second);

	/**
	 * TODO Describe the purpose of this method.
	 * 
	 * @param function
	 * @param first
	 * @param second
	 * @param third
	 */
	void pushLispStackFrame(LispObject function, LispObject first, LispObject second, LispObject third);

	/**
	 * TODO Describe the purpose of this method.
	 * 
	 * @param function
	 * @param first
	 * @param second
	 * @param third
	 * @param fourth
	 */
	void pushLispStackFrame(LispObject function, LispObject first, LispObject second, LispObject third,
			LispObject fourth);

	/**
	 * TODO Describe the purpose of this method.
	 * 
	 * @param function
	 * @param first
	 * @param second
	 * @param third
	 * @param fourth
	 * @param fifth
	 */
	void pushLispStackFrame(LispObject function, LispObject first, LispObject second, LispObject third,
			LispObject fourth, LispObject fifth);

	/**
	 * TODO Describe the purpose of this method.
	 * 
	 * @param function
	 * @param first
	 * @param second
	 * @param third
	 * @param fourth
	 * @param fifth
	 * @param sixth
	 */
	void pushLispStackFrame(LispObject function, LispObject first, LispObject second, LispObject third,
			LispObject fourth, LispObject fifth, LispObject sixth);

	/**
	 * TODO Describe the purpose of this method.
	 * 
	 * @param function
	 * @param first
	 * @param second
	 * @param third
	 * @param fourth
	 * @param fifth
	 * @param sixth
	 * @param seventh
	 */
	void pushLispStackFrame(LispObject function, LispObject first, LispObject second, LispObject third,
			LispObject fourth, LispObject fifth, LispObject sixth, LispObject seventh);

	/**
	 * TODO Describe the purpose of this method.
	 * 
	 * @param function
	 * @param first
	 * @param second
	 * @param third
	 * @param fourth
	 * @param fifth
	 * @param sixth
	 * @param seventh
	 * @param eighth
	 */
	void pushLispStackFrame(LispObject function, LispObject first, LispObject second, LispObject third,
			LispObject fourth, LispObject fifth, LispObject sixth, LispObject seventh, LispObject eighth);

	/**
	 * TODO Describe the purpose of this method.
	 * 
	 * @param function
	 * @param args
	 */
	void pushLispStackFrame(LispObject function, LispObject[] args);

	/**
	 * TODO Describe the purpose of this method.
	 * 
	 * @param numArgs
	 */
	void popStackFrame(int numArgs);

	/**
	 * TODO Describe the purpose of this method.
	 */
	void incrementCallCounts();

	/**
	 * TODO Describe the purpose of this method.
	 * 
	 * @return
	 */
	StackFrame getStackTop();

	/**
	 * TODO Describe the purpose of this method.
	 * 
	 * @param javaStackFrame
	 */
	void pushStackFrame(JavaStackFrame javaStackFrame);

	/**
	 * TODO Describe the purpose of this method.
	 */
	void resetStack();

	/**
	 * TODO Describe the purpose of this method.
	 * 
	 * @param i
	 */
	void printBacktrace(int i);

	/**
	 * TODO Describe the purpose of this method.
	 * 
	 * @return
	 */
	int getDepth();

}
