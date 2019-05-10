/*
 *  Copyright 2011 by The Appdapter Project (www.appdapter.org).
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.appdapter.core.debug;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


import org.appdapter.core.convert.OptionalArg;



/**
 * @author logicmoo
 * @author Stu B. <www.texpedient.com>
 * 
 * Contains annotations used at the debug layer, and out.
 */

public interface UIAnnotations {

	public interface UtilClass {

	}

	public interface Singleton {

	}

	public interface Autoload {

	}

	/**
		 * @author Administrator
		 *
		 */
	@UISalient
	public static interface Reloadable {

		void reload();

	}


	/**
		 * @author Administrator
		 *
		 */
	@Retention(RetentionPolicy.RUNTIME)
	public @interface UIHidden {

	}

	@Retention(RetentionPolicy.RUNTIME)
	static public @interface UISalient {
		/**
		 * "" == do nothing to the result
		 * "toString" .. call the toString method on Result
		 * Before return the result call the method name
		 * @return
		 */
		public String ToValueMethod() default "";

		/**
		 *  "" = use the splitted of camelcase for Menu Item Name
		 * @return
		 */
		public String MenuName() default "";

		/**
		 *  true if the last argument is the dropped/pasted item
		 * @return
		 */
		public boolean PasteDropTarget() default false;

		/**
		 *  How the missing (rest of the) arguments (beyond the first) is pulled from App's optional Arg space
		 * @return
		 */
		public short UseOptionalArgs() default OptionalArg.OPTIONAL_FROM_DEFAULTS;

		/**
		 *  true if member when called produces an App Singleton (as well as a Result)
		 * @return
		 */
		public boolean ResultIsSingleton() default false;


		/**
		 *  "" = use the splitted of camelcase for methodname
		 * @return
		 */
		public String CastingMethod() default "";

		/**
		 *  true if the first argument into target method will be the menuSourceItem
		 * @return
		 */
		public boolean TreatLikeStatic() default false;

		/**
		 *  "" = use the splitted of camelcase for methodname
		 * @return
		 */
		public String ApplyToClass() default "";

		public boolean NonPublicMethods() default true;

		public boolean IsSideEffectSafe() default false;

		public boolean IsPanel() default false;

		boolean IsNotSideEffectSafe() default false;

		boolean IsFactoryMethod() default false;

		String Tooltip() default "";

		String Editor() default "";

		String Description() default "";

		String HelpText() default "";

	}

	static interface ApplyToClassInterfaces {

	}

	// Used by Don'tAdd, which is used in ReflectUtils
	public interface OntoPriority extends UIAnnotations { // AnyOper {
	}

	// Used in ReflectUTils.	
	public interface HRKRefinement extends  UIAnnotations {  // AnyOper {
	}


/*
	public interface NamedClassObservable extends AnyOper {

	}

	public interface NamedClassService extends AnyOper {
	}

	public interface NamedClassValue extends AnyOper {

	}
*/

/*
	public interface NamedClassServiceFactory extends NamedClassService {

	}

	public interface LegacyClass extends AnyOper {

	}

	public interface UseLast extends OntoPriority {
	}

	public interface UseFirst extends OntoPriority {
	}
*/
	public interface DontAdd extends OntoPriority {
	}

	public interface AskIfEqual {
		public boolean same(Object obj);
	}
}
