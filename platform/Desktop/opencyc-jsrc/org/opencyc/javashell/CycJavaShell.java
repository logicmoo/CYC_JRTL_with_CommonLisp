package org.opencyc.javashell;

/**
 * Description TODO
 *
 * @version $Id$
 * @author Douglas R. Miles
 *
 * <p>Copyright 2001 Cycorp, Inc., license is open source GNU LGPL.
 * <p><a href="http://www.opencyc.org/license.txt">the license</a>
 * <p><a href="http://www.opencyc.org">www.opencyc.org</a>
 * <p><a href="http://www.sourceforge.net/projects/opencyc">OpenCyc at SourceForge</a>
 * <p>
 * THIS SOFTWARE AND KNOWLEDGE BASE CONTENT ARE PROVIDED ``AS IS'' AND
 * ANY EXPRESSED OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A
 * PARTICULAR PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE OPENCYC
 * ORGANIZATION OR ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT,
 * INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT,
 * STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE AND KNOWLEDGE
 * BASE CONTENT, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

import org.opencyc.api.CycAccess;
import org.opencyc.api.CycApiException;
import org.opencyc.cyclobject.CycLTerm;
import org.opencyc.cycobject.CycConstant;
import org.opencyc.cycobject.CycFort;
import org.opencyc.cycobject.CycList;
import org.opencyc.cycobject.CycListParser;
import org.opencyc.cycobject.CycNart;
import org.opencyc.cycobject.CycObject;
import org.opencyc.cycobject.CycSymbol;
import org.opencyc.cycobject.CycVariable;
import org.opencyc.inferencesupport.QueryLiteral;

import ViolinStrings.Strings;

public class CycJavaShell
{

	/* once started = true */
	public boolean m_isInitialized = false;

	/* Introspections version of a String.getClass() */
	public Class<? extends String> stringClass;

	/*
	 * Introspections version of the String Class in a 1-D array containing a
	 * Class[0]=String.getClass()
	 */
	public Class[] stringClassArrayOfOne;

	/* Debug=0 (None), Debug=1 (Minor), Debug=2 (Extreme) */
	public int debug = 2;

	/* Dictionary of All objects available to Scripting engine */
	public static Hashtable<Object, Object> mapFortToObject = new Hashtable<Object, Object>();

	public static Hashtable<Object, Object> mapObjectToFort = new Hashtable<Object, Object>();

	public Hashtable mapStringToConstant = new Hashtable();

	// CycConstant & Class -> CycConstant key of Fields | DataMethod | Method
	public static Hashtable<Serializable, Hashtable<CycFort, AccessibleObject>> thisClassTemplates = new Hashtable<Serializable, Hashtable<CycFort, AccessibleObject>>();

	// CycConstant || Class -> Class || CycConstant
	public Hashtable<Class, CycFort> mapClassToFort = new Hashtable<Class, CycFort>();

	public Hashtable<CycFort, Class> mapFortToClass = new Hashtable<CycFort, Class>();

	public CycAccess cycAccess = null;

	public CycSymbol CYC_NIL = null;

	public CycSymbol CYC_TRUE = null;

	public CycSymbol cycFalse = null;

	public CycSymbol cycTrue = null;

	public CycSymbol cycVoid = null;

	public CycSymbol cycNull = null;

	public CycConstant cycCreateObject = null;

	public CycConstant cycCreateObjectNamed = null;

	public CycConstant cycDestroyObject = null;

	public CycConstant cycForgetObject = null;

	public CycConstant cycInvokeObject = null;

	public CycConstant cycSetObjectField = null;

	public CycConstant cycGetObjectField = null;

	public CycConstant cycadministrator = null;

	public CycConstant opencycproject = null;

	public CycConstant functionalRelation = null;

	public CycConstant cycHasArrayMember = null;

	public CycConstant cycHasMethod = null;

	public CycConstant cycHasSlot = null;

	public CycConstant cycClassInstance = null;

	public CycConstant cycHasSlotValue = null;

	public CycConstant makeCycConstantError = null;

	public CycConstant cycArrayOfClass = null;

	public CycConstant cycNameOFClass;

	public CycConstant cycJavaFeild;

	public CycConstant cycJavaObject = null;

	public CycConstant cycJavaObjectFn = null;

	public CycFort dataMt;

	public CycFort vocabMt;

	public CycFort mappingMt;

	public CycFort theoryMt;

	/* Creates a non-started Server */
	public CycJavaShell()
	{
		stringClass = (new String()).getClass();
		try
		{
			stringClassArrayOfOne = (Class[]) (Array.newInstance(Class.forName("java.lang.Class"), 1));
		} catch (Exception e)
		{
			System.out.println("invokeConstructor: " + e);
			e.printStackTrace(System.out);
		}
		Array.set(stringClassArrayOfOne, 0, stringClass);
		mapFortToObject.put("CycJavaShell", this);
		mapFortToObject.put("System", System.class);
	}

	public void ensureClientSupportsShell(CycAccess cycA, CycFort dataMtA, CycFort vocabMtA, CycFort mappingMtA, CycFort theoryMtA) throws UnknownHostException, IOException, CycApiException
	{
		cycAccess = cycA;
		dataMt = dataMtA;
		vocabMt = vocabMtA;
		mappingMt = mappingMtA;
		theoryMt = theoryMtA;

		cycAccess.assertIsa(dataMtA.cyclify(), "#$Microtheory");
		cycAccess.assertIsa(vocabMt.cyclify(), "#$Microtheory");
		cycAccess.assertIsa(mappingMtA.cyclify(), "#$Microtheory");
		cycAccess.assertIsa(theoryMt.cyclify(), "#$Microtheory");

		cycAccess.assertIsa(dataMtA.cyclify(), "#$DataMicrotheory");
		cycAccess.assertIsa(vocabMt.cyclify(), "#$VocabularyMicrotheory");
		cycAccess.assertIsa(mappingMtA.cyclify(), "#$ParaphraseMicrotheory");
		cycAccess.assertIsa(theoryMt.cyclify(), "#$TheoryMicrotheory");
		cycAccess.assertIsa(theoryMt.cyclify(), "#$GeneralMicrotheory");
		cycAccess.assertGenlMt(vocabMtA.cyclify(), "#$ComputerSoftwareVocabularyMt");
		cycAccess.assertGenlMt(dataMt, theoryMt);
		cycAccess.assertGenlMt(theoryMt, vocabMtA);
		cycAccess.assertGenlMt(theoryMt, mappingMtA);
		cycAccess.assertGenlMt(vocabMtA.cyclify(), "#$ComputerSoftwareVocabularyMt");

		cycAccess.assertGenlMt(mappingMtA, vocabMtA);

		if (cycCreateObject == null)
		{
			CYC_TRUE = new CycSymbol("T");
			CYC_NIL = new CycSymbol("NIL");
			cycVoid = CYC_TRUE; // cycAccess.makeCycConstant("voidValue");
			cycNull = CYC_NIL; // cycAccess.makeCycConstant("nullValue");
			cycTrue = CYC_TRUE; // cycAccess.makeCycConstant("True");
			cycFalse = CYC_NIL; // cycAccess.makeCycConstant("False");
			cycCreateObject = cycAccess.makeCycConstant("javaCreate");
			cycCreateObjectNamed = cycAccess.makeCycConstant("javaCreateNamed");
			cycDestroyObject = cycAccess.makeCycConstant("javaDestroy");
			cycForgetObject = cycAccess.makeCycConstant("javaForget");
			cycInvokeObject = cycAccess.makeCycConstant("javaInvoke");
			cycSetObjectField = cycAccess.makeCycConstant("javaSetField");
			cycGetObjectField = cycAccess.makeCycConstant("javaGetField");
			cycNameOFClass = cycAccess.makeCycConstant("properNameStrings");
			cycHasArrayMember = cycAccess.makeCycConstant("javaArrayContains");
			cycHasMethod = cycAccess.makeCycConstant("hasJavaMethod");
			cycAccess.assertIsa(cycHasMethod, cycAccess.makeCycConstant("TernaryPredicate"));
			cycHasSlot = cycAccess.makeCycConstant("relationAllExists");
			cycClassInstance = cycAccess.makeCycConstant("ComputerDataType");
			cycHasSlotValue = cycAccess.makeCycConstant("hasSlotValue");
			cycArrayOfClass = cycAccess.makeCycConstant("ArrayOfTypeFn");
			cycAccess.assertIsa(cycArrayOfClass, cycAccess.makeCycConstant("UnaryFunction"));
			cycAccess.assertResultIsa(cycArrayOfClass, cycAccess.makeCycConstant("Collection"));
			cycJavaFeild = cycAccess.makeCycConstant("JavaFeild");
			cycAccess.assertIsa(cycJavaFeild, cycAccess.makeCycConstant("Collection"));
			cycAccess.assertIsa(cycJavaFeild, cycAccess.makeCycConstant("PredicateCategory"));
			cycAccess.assertGenls(cycJavaFeild, cycAccess.makeCycConstant("BinaryPredicate"));

			makeCycConstantError = cycAccess.makeCycConstant("MakeCycConstantErrorFn");
			cycJavaObject = cycAccess.makeCycConstant("javaInstance");
			cycJavaObjectFn = cycAccess.makeCycConstant("JavaInstanceFn");
		}
	}

	public Object invoke(CycList query) throws Exception
	{

		CycFort pred = (CycFort) query.first();
		if (pred.equals(cycInvokeObject))
			return invokeObject(query.second(), query.third(), (CycList) query.fourth());

		else if (pred.equals(cycCreateObject))
			return createObject(query.second());

		else if (pred.equals(cycCreateObjectNamed))
			return createObjectNamed(query.second(), query.third());

		else if (pred.equals(cycForgetObject))
			return forgetObject((CycFort) query.second());

		else if (pred.equals(cycDestroyObject))
			return destroyObject((CycFort) query.second());

		else if (pred.equals(cycSetObjectField))
			return setObjectField(query.second(), query.third(), query.fourth());

		else if (pred.equals(cycGetObjectField)) return getObjectField(query.second(), query.third());

		return CYC_NIL;
	}

	/* OpenCyc Will call these */

	public CycList getObjects(CycAccess cycAccess)
	{
		return new CycList(mapFortToObject.keys());
	}

	public Object createObject(Object classnameObj) throws Exception
	{
		return toCycObject(initObject(classnameObj));
	}

	public CycSymbol createObjectNamed(Object classnameObj, Object objref) throws Exception
	{
		Object innerInstance = initObject(classnameObj);
		Object prevobjref = toCycObject(innerInstance);
		mapFortToObject.remove(prevobjref.toString());
		mapFortToObject.put(objref, innerInstance);
		mapObjectToFort.put(innerInstance, objref);
		return CYC_TRUE;
	}

	public CycSymbol forgetObject(Object cycobj) throws Exception
	{
		Object innerInstance = selectObjectForName(cycobj);
		if (innerInstance == null) return CYC_TRUE;
		mapFortToObject.remove(innerInstance);
		mapFortToObject.remove(cycobj);
		return CYC_TRUE;
	}

	public CycSymbol destroyObject(Object cycobj) throws Exception
	{
		Object innerInstance = selectObjectForName(cycobj);
		if (innerInstance == null) return CYC_NIL;
		mapFortToObject.remove(innerInstance);
		mapFortToObject.remove(cycobj);
		if (cycobj instanceof CycConstant) cycAccess.kill((CycConstant) cycobj);
		return CYC_TRUE;
	}

	public synchronized CycSymbol setObjectField(Object cycobj, Object fieldref, Object value) throws Exception
	{
		Object innerInstance = selectObjectForName(cycobj);
		Field field = objectField(innerInstance, fieldref);
		field.set(innerInstance, recastObject(field.getType(), value));
		return CYC_TRUE;
	}

	public synchronized Object getObjectField(Object cycobj, Object fieldref) throws Exception
	{
		Object innerInstance = selectObjectForName(cycobj);
		Field field = objectField(innerInstance, fieldref);
		return toCycObject(field.get(innerInstance));
	}

	public Field objectField(Object innerInstance, Object fieldref) throws Exception
	{
		return innerInstance.getClass().getField(fieldref.toString());
	}

	private Method getMethodForObject(Object obj, String methodName, Class[] argClasses) throws Exception
	{
		return classFromInstance(obj).getMethod(methodName, argClasses);
	}

	private Class classFromInstance(Object obj) throws Exception
	{
		if (obj instanceof Class) return (Class) obj;
		return obj.getClass();
	}

	public synchronized Object invokeObject(Object cycobj, Object methodName, CycList params) throws Exception
	{
		Object innerInstance = selectObjectForName(cycobj);
		Method[] meth = classFromInstance(innerInstance).getMethods();
		int len = params.size();
		for (int i = 0; i < meth.length; i++)
		{
			if (meth[i].getName().equals(methodName))
			{
				Class[] pt = meth[i].getParameterTypes();
				if (pt.length == len)
				{
					Object[] args = recastVector(len, pt, params);
					if (args != null) return toCycObject(meth[i].invoke(innerInstance, args));
				}
			}
		}
		throw new NoSuchMethodException("Method '" + methodName + "' not found in " + cycobj);
	}

	/* Find an instance in mapFortToObject based on HashCode */
	public Object selectObjectForName(Object name) throws InstantiationException
	{
		Object innerInstance = mapFortToObject.get(name);
		if (debug > 1) System.out.println("searching for: " + name + " -> " + innerInstance);
		if (innerInstance != null) return innerInstance;
		if (!(name instanceof CycObject)) return name;
		throw new InstantiationException("Object not found in catalog in selectObjectForName: " + name);
	}

	/* Creates a new Object for a className */
	public synchronized Object initObject(Object theInit) throws InstantiationException, ClassNotFoundException, IllegalAccessException, InvocationTargetException
	{
		Class newClass = null;
		if (!(theInit instanceof CycList || theInit instanceof CycNart))
		{
			newClass = findClass(theInit);
			return newClass.newInstance();
		}
		Object[] theParams = null;
		CycList theCycParams = null;
		try
		{
			newClass = findClass(((CycList) theInit).first());
			theCycParams = (CycList) ((CycList) theInit).second();
		} catch (Exception e)
		{
			newClass = findClass(((CycList) theInit).second());
			theCycParams = (CycList) ((CycList) theInit).third();
		}
		Constructor[] call = newClass.getConstructors();
		for (int i = 0; i < call.length; i++)
		{
			Class[] proto = call[i].getParameterTypes();
			try
			{
				theParams = recastVector(proto.length, proto, theCycParams);
			} catch (Exception e)
			{
				// Missed
			}
			if (theParams != null) return call[i].newInstance(theParams);
		}
		throw new InstantiationException("initObject: " + theInit);
	}

	public synchronized Class findClass(Object theInit) throws ClassNotFoundException
	{
		if (theInit instanceof Class) return (Class) theInit;
		Class newClass = mapFortToClass.get(theInit);
		if (newClass != null) return newClass;
		try
		{
			newClass = Class.forName("java.lang." + theInit);
		} catch (ClassNotFoundException e)
		{
			newClass = Class.forName(theInit.toString());
		}
		toCycClass(newClass);
		return newClass;
	}

	public Object[] recastVector(int len, Class[] pt, CycList params) throws Exception
	{
		Object[] arg = new Object[len + 1];
		for (int i = 0; i < len; i++)
		{
			arg[i] = recastObject(pt[i], params.get(i));
		}
		return arg;
	}

	public Object recastObject(Class oclass, Object o) throws Exception
	{
		Class[] coclass = oclass.getClasses();
		for (int i = 0, l = coclass.length; i < l; i++)
		{
			if (coclass[i] == CycObject.class) return o;
		}
		// //if( oclass==CycObject.class || oclass==Object.class ||
		// oclass==CycList.class || oclass==CycFort.class ||
		// oclass==CycConstant.class || oclass==CycNart.class) return o;
		Object derefed = mapFortToObject.get(o);
		if (derefed != null) if (oclass.isInstance(derefed)) return derefed;
		if (o != null) if (oclass.isInstance(o)) return o;
		if (o instanceof CycObject) return recastObject(oclass, o.toString());

		if (oclass.isArray())
		{
			if (o instanceof ArrayList)
			{
				Class elementClass = oclass;
				int len = ((ArrayList) o).size();
				Object[] arg = (Object[]) Array.newInstance(elementClass, len);
				for (int i = 0; i < len; i++)
					arg[i] = recastObject(elementClass, ((ArrayList) o).get(i));
				return arg;
			}
			throw new ClassCastException("trying convert " + o + " (" + o.getClass() + ") to " + oclass);
		}

		// From here we have 'null' or a non CycObject

		if (oclass.isPrimitive())
		{
			if (oclass == int.class)
			{
				if (o == null) return new Integer(0);
				return new Integer(o.toString());
			}
			if (oclass == float.class)
			{
				if (o == null) return new Float(0);
				return new Float(o.toString());
			}
			if (oclass == byte.class)
			{
				if (o == null) return new Byte((byte) 0);
				if (o instanceof String) if (((String) o).length() == 1) o = new Byte((byte) (((String) o).charAt(0)));
				int r = (o instanceof Number) ? ((Number) o).intValue() : (o instanceof Boolean) ? (((Boolean) o).booleanValue() ? 1 : 0) : Integer.parseInt(o.toString());
				return new Byte((byte) r);
			}
			if (oclass == char.class)
			{
				if (o == null) return new Character((char) 0);
				if (o instanceof String) if (((String) o).length() == 1) o = new Character(((String) o).charAt(0));
				int r = (o instanceof Number) ? ((Number) o).intValue() : (o instanceof Boolean) ? (((Boolean) o).booleanValue() ? 1 : 0) : Integer.parseInt(o.toString());
				return new Character((char) r);
			}
			if (oclass == boolean.class) { return new Boolean(toBool(o)); }
		}

		if (oclass == String.class)
		{
			if (o == null) return "";
			if (o instanceof String)
				return o;
			else
				return null;
		}

		if (oclass == Integer.class) return new java.lang.Integer(o.toString());
		if (oclass == Float.class) return new java.lang.Float(o.toString());
		if (oclass == Boolean.class) return new Boolean(toBool(o));
		throw new ClassCastException("trying convert " + o + " (" + o.getClass() + ") to " + oclass);
	}

	/***************************************************************************
	 * Java To Cyc
	 * 
	 **************************************************************************/
	public CycList toCycClassList(Class jclass[])
	{
		CycList cdefs = new CycList();
		for (int i = 0; i < jclass.length; i++)
			cdefs.add(toCycClass(jclass[i]));
		return cdefs;
	}

	public synchronized CycFort toCycClass(Class jclass)
	{
		CycFort cycjclass = mapClassToFort.get(jclass);
		if (cycjclass != null) return cycjclass;
		String classname = jclass.getName();
		if (classname.startsWith("[L")) classname = classname.substring(2);
		if (classname.startsWith("[")) classname = classname.substring(1);
		if (classname.endsWith(";")) classname = classname.substring(0, classname.length() - 1);
		// String packagename = jclass.getPackage().getName();
		String classextension = "Object";
		if (jclass.isInterface()) classextension = "Interface";
		if (jclass.isPrimitive())
		{
			// jboolean z; jbyte b; jchar c; jshort s; jint i; jlong j; jfloat
			// f; jdouble d; jobject l;
			if (jclass.isArray())
			{
				switch (classname.charAt(0))
				{
					case 'Z':
						classname = "Boolean";
					case 'B':
						classname = "Byte";
					case 'C':
						classname = "Character";
					case 'S':
						classname = "ShortInteger";
					case 'I':
						classname = "Integer";
					case 'J':
						classname = "Long";
					case 'F':
						classname = "Float";
					case 'D':
						classname = "Double";
				}
				classextension = "Array";
			}
			else
			{
				classextension = "Value";
			}
		}
		else
		{
			try
			{
				if (jclass.isArray()) return new CycNart((CycFort) (cycArrayOfClass), (Object) toCycClass(Class.forName(classname)));
			} catch (Exception e)
			{
				e.printStackTrace();
			}
			if (classname.startsWith("org") || classname.startsWith("com") || classname.startsWith("net") || classname.startsWith("mil"))
			{
				int lp = classname.indexOf(".");
				if (lp > 2) classname = classname.substring(lp + 1);
				lp = classname.lastIndexOf(".");
				if (lp > 2)
				{
					if (!classname.substring(lp + 1).endsWith("Interface"))
					{
						if (jclass.isInterface())
							classname = classname.substring(lp + 1) + "_Interface_" + classname.substring(0, lp);
						else
							classname = classname.substring(lp + 1) + "_" + classname.substring(0, lp);
					}
				}
				classextension = "";
			}
			if (classname.startsWith("java"))
			{
				int lp = classname.lastIndexOf(".");
				if (lp > 2) classname = classname.substring(lp + 1);
			}
		}

		classname = Strings.change(classname, ".", "_");
		classname = Strings.change(classname, "$", "_");
		classname = classname.substring(0, 1).toUpperCase() + classname.substring(1);

		String cycclassname = classname + classextension;
		try
		{
			cycjclass = cycAccess.makeCycConstant(cycclassname);
			System.out.println("cycclassname = " + cycjclass.cyclify());
			// assertGaf(mappingMt,cycNameOFClass,cycjclass,jclass.toString());
			assertGaf(mappingMt, cycAccess.comment, cycjclass, jclass.toString());
		} catch (Exception e)
		{
			System.out.println("cycAccess.makeCycConstant: " + cycclassname + " " + e);
			e.printStackTrace(System.err);
		}
		// Save Isa
		try
		{
			cycAccess.assertIsa(cycjclass, cycAccess.collection, vocabMt);
			cycAccess.assertIsa(cycjclass, cycClassInstance, vocabMt);
		} catch (Exception e)
		{
			// e.printStackTrace(System.err);
		}
		mapClassToFort.put(jclass, cycjclass);
		mapFortToClass.put(cycjclass, jclass);
		try
		{
			// Make super classes
			Class superjclass = jclass.getSuperclass();
			if (superjclass != null) cycAccess.assertGenls(cycjclass, toCycClass(superjclass), vocabMt);
		} catch (Exception e)
		{
			e.printStackTrace(System.err);
		}

		Class[] interfce = jclass.getInterfaces();
		for (int i = 0; i < interfce.length; i++)
		{
			try
			{
				cycAccess.assertGenls(cycjclass, toCycClass(interfce[i]), vocabMt);
			} catch (Exception e)
			{
				e.printStackTrace(System.err);
			}
		}

		// Decide if we should make a template
		String classstring = jclass.toString();
		if (classstring.startsWith("class java.lang") || classstring.startsWith("class java.io") || classstring.startsWith("class logicmoo.") || classstring.startsWith("class com.logicmoo") || jclass.isPrimitive()) return cycjclass;

		Hashtable<CycFort, AccessibleObject> template = new Hashtable<CycFort, AccessibleObject>();

		Method[] methods = jclass.getMethods();
		for (int i = 0; i < methods.length; i++)
		{
			Method method = methods[i];
			String methodname = method.getName();
			CycFort cycmethod = makeTypedCycFort("JavaMethod", methodname + "_method");
			String methComment = "" + method;
			CycFort returntype = toCycClass(method.getReturnType());
			CycList params = toCycClassList(method.getParameterTypes());
			template.put(cycmethod, method);
			if (isMethodInert(method))
			{
				assertWithTranscriptNoWffCheckJava("(#$isa " + cycmethod.cyclify() + " #$BinaryPredicate )", vocabMt);
				assertWithTranscriptNoWffCheckJava("(#$isa " + cycjclass.cyclify() + " #$Collection )", vocabMt);
				assertWithTranscriptNoWffCheckJava("(#$isa " + returntype.cyclify() + " #$Collection )", vocabMt);
				assertWithTranscriptNoWffCheckJava("(#$relationAllExists " + " " + cycmethod.cyclify() + " " + cycjclass.cyclify() + "  " + returntype.cyclify() + " )", (CycFort) theoryMt);
			}
			else
			{
				assertWithTranscriptNoWffCheckJava("(#$hasJavaMethod " + cycjclass.cyclify() + " (#$JavaMethodFn " + cycmethod.cyclify() + " " + params.cyclify() + " ) " + "  " + returntype.cyclify() + " )", theoryMt);
			}
			try
			{
				// cycAccess.assertComment(cycmethod,methComment,theoryMt);
			} catch (Exception e)
			{
				e.printStackTrace(System.err);
			}

		}

		Field[] fields = jclass.getFields();
		for (int i = 0; i < fields.length; i++)
		{
			Field field = fields[i];
			CycFort cycfieldjclass = toCycClass(field.getType());
			CycFort cycfield = makeTypedCycFort(cycJavaFeild.toString(), field.getName() + "_field");
			template.put(cycfield, field);
			assertWithTranscriptNoWffCheckJava("(#$isa " + cycfield.cyclify() + " #$BinaryPredicate )", vocabMt);
			assertWithTranscriptNoWffCheckJava("(#$isa " + cycjclass.cyclify() + " #$Collection )", vocabMt);
			assertWithTranscriptNoWffCheckJava("(#$isa " + cycfieldjclass.cyclify() + " #$Collection )", vocabMt);
			assertWithTranscriptNoWffCheckJava("(#$relationAllExists " + " " + cycfield.cyclify() + " " + cycjclass.cyclify() + "  " + cycfieldjclass.cyclify() + " )", (CycFort) theoryMt);
		}

		thisClassTemplates.put(jclass, template);
		thisClassTemplates.put(cycjclass, template);
		return cycjclass;
	}

	public boolean isMethodInert(Method mthod)
	{
		if (mthod.getParameterTypes().length != 0) return false;
		String methodname = mthod.getName();
		return (methodname.startsWith("get") || methodname.startsWith("equals") || methodname.startsWith("is") || methodname.startsWith("checkF") || methodname.startsWith("to") || methodname.startsWith("hashCode") || methodname.startsWith("constains") || methodname.startsWith("size"));
	}

	public CycFort makeTypedCycFort(String type, String name)
	{
		CycConstant nameC = makeCycConstantError;
		CycConstant typeC = makeCycConstantError;
		try
		{
			nameC = cycAccess.makeCycConstant(name);
			typeC = cycAccess.makeCycConstant(type);
			cycAccess.assertIsa(typeC, cycAccess.collection, vocabMt);
		} catch (Exception e)
		{
			e.printStackTrace(System.err);
		}
		try
		{
			cycAccess.assertIsa(nameC, typeC, vocabMt);
		} catch (Exception e)
		{
			e.printStackTrace(System.err);
		}
		return nameC;
	}

	public Object toCycObject(Object object)
	{
		return toCycObject(object, false);
	}

	public Object toCycObject(Object object, boolean assertobj)
	{

		if (object == null) return cycNull;
		if (object instanceof Void) return cycVoid;
		if (object instanceof Boolean) if (object.equals(Boolean.TRUE))
			return cycTrue;
		else
			return cycFalse;
		if (object instanceof Number) return object;
		if (object instanceof Float) return object;
		if (object instanceof Byte) return (Integer) object;
		if (object instanceof Integer) return object;
		if (object instanceof Long) return object;
		if (object instanceof Double) return object;
		if (object instanceof Character) return object;

		Class jclass = object.getClass();
		if (!(jclass.isArray()))
		{
			if (jclass.isPrimitive())
			{

				System.out.println("\n\n PRIMITIVE!!!!\n\n PRIMITIVE!!!!\n\n PRIMITIVE!!!! " + object);
				if (jclass == java.lang.Boolean.TYPE) if (object.equals(Boolean.TRUE))
					return cycTrue;
				else
					return cycFalse;
				if (jclass == java.lang.Integer.TYPE) return new Integer("" + object);
				if (jclass == java.lang.Byte.TYPE) return new Integer("" + object);
				if (jclass == java.lang.Void.TYPE) return cycVoid;
				if (jclass == java.lang.Long.TYPE) return new Long("" + object);
				if (jclass == java.lang.Character.TYPE) return new String("`" + object);
				if (jclass == java.lang.Double.TYPE) return new Double("" + object);
				if (jclass == java.lang.Float.TYPE) return new Float("" + object);
			}
		}
		else
		{
			// is array
			return arrayToCycList((Object[]) object, assertobj);

		}

		CycFort cycobject = (CycFort) mapObjectToFort.get(object);
		if (cycobject != null) return cycobject;
		if (mapFortToObject.containsKey(object.toString())) return object;
		if (object instanceof String) return object;
		if (object instanceof CycObject) return object;
		if (object instanceof CycLTerm) return object;

		try
		{
			cycobject = cycAccess.makeCycConstant("Inst-" + jclass.getName() + "-" + object.hashCode());
		} catch (Exception e)
		{

		}
		mapFortToObject.put(cycobject, object);
		mapObjectToFort.put(object, cycobject);

		CycFort cycclass = toCycClass(jclass);

		try
		{
			cycAccess.assertIsa((CycFort) cycobject, (CycFort) cycclass, dataMt);
		} catch (Exception e)
		{
			e.printStackTrace(System.out);
		}

		// Only make this constant for object
		if (assertobj) assertObjectData(object, cycobject);
		return cycobject;
	}

	/* Serializes Array into OpenCyc List */
	public CycList arrayToCycList(Object[] pMembs, boolean assertobj)
	{
		CycList newCycList = new CycList();
		int len = pMembs.length;
		for (int nMemb = 0; nMemb < len; nMemb++)
			newCycList.add(toCycObject(pMembs[nMemb], assertobj));
		return newCycList;
	}

	/* Serializes Iterator into OpenCyc List */
	public synchronized Object iteratorToCycList(Iterator pMembs)
	{
		CycList args = new CycList();
		while (pMembs.hasNext())
			args.add(toCycObject(pMembs.next()));
		return args;
	}

	/**
	 * Preforms query in mt with parameters then unasserts the insanciated gafs
	 * derived from the query
	 * 
	 * NOTE: Only if they exist in the same microtheory as the query is in. see
	 * queryMatch for how these insanciated gafs are produced
	 * 
	 */

	public ArrayList<CycList> deleteMatchGaf(CycList query, CycFort mt, int maxBackchains, int maxAnswers, int maxSeconds)
	{
		ArrayList<CycList> al = queryMatch(query, mt, maxBackchains, maxAnswers, maxSeconds);
		Iterator<CycList> its = al.iterator();
		while (its.hasNext())
		{
			try
			{
				cycAccess.unassertGaf(its.next(), mt);
			} catch (Exception e)
			{
			}
		}
		return al;
	}

	/**
	 * Preforms query in mt with parameters returns the insanciated gafs derived
	 * from the query
	 * 
	 * a query of (#$isa ?X #$Dog) in #$BiologyMt will return a ArrayList with a
	 * single CycList formula containing: (#$isa (#$GenericInstanceFn #$Dog)
	 * #$Dog)
	 * 
	 */

	public ArrayList<CycList> queryMatch(CycList query, CycFort mt, int maxBackchains, int maxAnswers, int maxSeconds)
	{

		ArrayList<CycList> match = new CycList();
		try
		{
			CycList results = queryWithMaximums(query, mt, maxBackchains, maxAnswers, maxSeconds);
			Iterator its = results.iterator();
			while (its.hasNext())
			{
				try
				{
					CycList bindingset = (CycList) its.next();
					CycList result = replaceVarsWithBindingSet(query, bindingset).getFormula();
					System.out.println(result);
					match.add(result);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		} catch (Exception ee)
		{
			ee.printStackTrace();
		}
		return match;
	}

	public CycList queryWithMaximums(CycList query, CycFort mt, int maxBackchains, int maxAnswers, int maxSeconds) throws IOException, CycApiException
	{
		CycList queryBuffer = new CycList();
		queryBuffer.add("(clet ((*cache-inference-results* nil) ");
		queryBuffer.add("       (*compute-inference-results* nil) ");
		queryBuffer.add("       (*unique-inference-result-bindings* t) ");
		queryBuffer.add("       (*generate-readable-fi-results* nil)) ");
		queryBuffer.add("  (without-wff-semantics ");
		queryBuffer.add("    (cyc-query '" + query.cyclify() + " ");
		queryBuffer.add("                  " + mt.cyclify() + " ");
		queryBuffer.add("                  '(:backchain " + maxBackchains + " :number " + maxAnswers + " :time " + maxSeconds + "))))");
		return cycAccess.converseList(queryBuffer.toString());
	}

	public QueryLiteral replaceVarsWithBindingSet(CycList query, ArrayList bindingset)
	{
		QueryLiteral querylit = new QueryLiteral(query);
		Iterator bindings = bindingset.iterator();
		while (bindings.hasNext())
		{
			CycList binding = (CycList) bindings.next();
			CycVariable variable = (CycVariable) binding.first();
			Object value = binding.rest();
			querylit.substituteVariable(variable, value);
		}
		return querylit;
	}

	/***************************************************************************
	 * Java Editing
	 * 
	 **************************************************************************/

	public synchronized String findNamedProperty(Object target, String property)
	{
		// Normally more deeper analysis then string concatination (that is why
		// the target object is here)
		return "set" + toProperCase(property);
	}

	public synchronized boolean attemptJavaSetMethod(Object target, String property, Object value)
	{
		if (value == null)
		{
			try
			{
				target.getClass().getMethod(findNamedProperty(target, property)).invoke(target);
				return true;
			} catch (Exception e)
			{
				return false;
			}

		}
		else
		{

			Class[] sc = { value.getClass() };
			//Object[] sa = { value };

			try
			{
				target.getClass().getMethod(findNamedProperty(target, property), sc).invoke(target, value);
				return true;
			} catch (Exception e)
			{
				return false;
			}
		}
	}

	public synchronized Method findJavaMethod(Class oclass, String methodname) throws NoSuchMethodError
	{
		Method[] meths = oclass.getMethods();
		int len = meths.length;
		for (int i = 0; i < len; i++)
			if (meths[i].getName().equals(methodname)) return meths[i];

		throw new NoSuchMethodError(methodname + " for " + oclass.getName());
	}

	/***************************************************************************
	 * Strings
	 * 
	 **************************************************************************/

	public synchronized String toProperCase(String property)
	{
		return property.substring(0, 0).toUpperCase() + property.substring(1).toLowerCase();
	}

	public void assertObjectData(Object object, CycFort cycobject)
	{
		System.out.println("assertObjectData " + object);

		if (object instanceof CycList)
		{
			assertWithTranscriptNoWffCheckJava(((CycList) object).cyclify(), dataMt);
			return;
		}

		Class jclass = object.getClass();
		if (jclass.isArray())
		{
			assertArrayData(object, cycobject);
			return;
		}

		if (object instanceof Iterator)
		{
			assertIteratorData((Iterator) object, cycobject);
			return;
		}

		assertObjectDataFromTemplate(jclass, object, cycobject);

	}

	public void assertObjectDataFromTemplate(Class jclass, Object object, CycFort cycobject)
	{
		Hashtable template = thisClassTemplates.get(jclass);
		Iterator it = template.keySet().iterator();
		while (it.hasNext())
		{
			Object cycdataaccess = it.next();
			if (cycdataaccess instanceof CycConstant)
			{
				Object accessmember = template.get(cycdataaccess);
				if (accessmember instanceof Field) assertFieldValue(cycobject, object, (CycConstant) cycdataaccess, (Field) accessmember);
			}

		}
	}

	public void assertArrayData(Object object, CycFort cycobject)
	{
		System.out.println("assertArrayData " + object);
		CycList assertme = new CycList(cycHasArrayMember);
		assertme.add(cycobject);
		assertme.add(null);
		assertme.add(null);
		for (int i = 0; i < ((Object[]) object).length; i++)
		{
			Object submember = toCycObject(((Object[]) object)[i], true);
			try
			{
				assertme.set(2, new Integer(i));
				assertme.set(3, submember);
				assertWithTranscriptNoWffCheckJava(assertme, dataMt);
			} catch (Exception e)
			{
				e.printStackTrace(System.err);
			}
		}
	}

	public void assertIteratorData(Iterator object, CycFort cycobject)
	{
		System.out.println("assertIteratorData " + object);
		CycList assertme = new CycList(cycHasArrayMember);
		assertme.add(cycobject);
		assertme.add(3, new Integer(0));
		assertme.add(null);
		while (object.hasNext())
		{
			Object submember = toCycObject(object.next(), true);
			try
			{
				assertme.set(3, submember);
				assertWithTranscriptNoWffCheckJava(assertme, dataMt);
			} catch (Exception e)
			{
				e.printStackTrace(System.err);
			}
		}
	}

	public void assertSlotValue(CycFort cycobject, Object slot, Object value, boolean singlevalued)
	{
		assertSlotValue(cycobject, slot, value, null, singlevalued);
	}

	public void assertSlotValue(CycFort cycobject, Object slot, Object value, Object type, boolean singlevalued)
	{
		CycFort cycslot = null;
		if (cycobject == null)
		{
			System.out.println("assertSlotValue(CycFort " + dataMt + ",CycConstant " + cycobject + ", Object " + slot + ", Object " + value + ", boolean " + singlevalued + ")");
			return;
		}

		if (slot instanceof CycConstant)
		{
			cycslot = (CycConstant) slot;
		}
		else
		{
			if (slot instanceof String)
			{
				cycslot = makeTypedCycFort(cycJavaFeild.toString(), (String) slot);
			}
		}

		if (singlevalued) clearSlot(cycobject, cycslot);

		if (value == null) return;

		if (value instanceof Iterator)
		{
			while (((Iterator) value).hasNext())
				assertSlotValue(cycobject, cycslot, ((Iterator) value).next(), type, false);
			return;
		}
		if (value instanceof Enumeration)
		{
			while (((Enumeration) value).hasMoreElements())
				assertSlotValue(cycobject, cycslot, ((Enumeration) value).nextElement(), type, false);
			return;
		}

		if (value.getClass().isArray())
		{
			assertSlotValue(cycobject, cycslot, Arrays.asList((Object[]) value).iterator(), type, false);
			return;
		}
		Object cycvalue = toCycObject(value, false);

		try
		{
			if (type != null)
			{
				if (cycvalue instanceof CycFort)
				{
					cycAccess.assertIsa((CycFort) cycvalue, (CycFort) toCycObject(type), dataMt);
				}
				if (cycvalue instanceof CycList)
				{
					cycAccess.assertIsa(((CycFort) new CycNart((CycList) cycvalue)), (CycFort) toCycObject(type), dataMt);
				}
			}

			if (cycvalue != null) assertGaf(dataMt, cycslot, cycobject, cycvalue);
		} catch (Exception e)
		{
			e.printStackTrace(System.out);
			System.out.println("assertSlotValue(CycFort " + dataMt + ",CycConstant " + cycobject + ", Object " + slot + ", Object " + value + ", boolean " + singlevalued + ")");
		}
	}

	public void assertGaf(CycFort mt, CycFort pred, CycFort object, Object value) throws Exception
	{
		CycList assertme = new CycList(pred); // "#$hasFieldValue"
		assertme.add(object);
		assertme.add(value);
		assertWithTranscriptNoWffCheckJava(assertme, mt);
	}

	public void assertFieldValue(CycFort cycobject, Object object, CycConstant cycaccess, Field accessmember)
	{
		CycList assertme = new CycList(cycHasSlotValue); // "#$hasFieldValue"
		assertme.add(cycobject);
		assertme.add(cycaccess);
		try
		{
			assertme.add(toCycObject(accessmember.get(object)));
			assertWithTranscriptNoWffCheckJava(assertme, dataMt);
		} catch (Exception e)
		{
			e.printStackTrace(System.out);
		}
	}

	public synchronized void clearSlot(CycFort cycobject, Object cycslot)
	{
		// Delete all previous
		CycList query = new CycList(cycslot);
		query.add(cycobject);
		CycVariable cv = new CycVariable("Prev");
		query.add(cv);

		try
		{
			Iterator result = cycAccess.askWithVariable(query, cv, dataMt).iterator();
			while (result.hasNext())
			{
				query.set(2, result.next());
				cycAccess.unassertGaf(query, dataMt);
			}
		} catch (Exception e)
		{
			e.printStackTrace(System.out);
		}

	}

	public void assertWithTranscriptNoWffCheckJava(CycList sentence, CycFort mt)
	{
		try
		{
			System.out.println(sentence + " " + mt);
			cycAccess.assertWithTranscript(sentence, mt);
		} catch (Exception e)
		{
			e.printStackTrace(System.err);
		}
	}

	public void assertWithTranscriptNoWffCheckJava(String sentence, CycFort mt)
	{
		try
		{
			assertWithTranscriptNoWffCheckJava(toCycList(sentence), mt);
		} catch (Exception e)
		{
			e.printStackTrace(System.err);
		}
	}

	/**
	 * Cyclifys a sentence a string
	 */
	public CycList toCycList(String sentence) throws Exception
	{
		return (((CycList) ((new CycListParser(cycAccess)).read(sentence))));
	}

	/**
	 * Cyclifys a sentence to a string
	 */
	public String toCycListString(String sentence) throws Exception
	{
		return toCycList(sentence).cyclify();
	}

	// toCycObject(type)
	/*
	 * 
	 * 
	 * CycL
	 * 
	 * 
	 * (#$implies (#$and (#$remoteCycServer ?Server ?Host ?Port) (#$evaluate
	 * ?Result (#$EvaluateSubLFn (cyc-api-remote-eval ?SUBL ?Host ?Port))))
	 * (#$evaluate ?Result (#$EvaluateRemoteSubLFn ?Server ?SUBL))
	 * 
	 * 
	 * 
	 * 
	 * (ExpandSubLFn (?X) (+ 1 ?X))
	 * 
	 * (evaluate ??RESULT
	 * 
	 * 
	 */

	public String cleanString(String name)
	{
		if (name == null) return "null";
		String tryName = name;
		if (name.startsWith("#$")) tryName = name.substring(2);
		tryName = Strings.change(tryName, '$', '_');
		tryName = Strings.change(tryName, ')', '_');
		tryName = Strings.change(tryName, '(', '_');
		tryName = Strings.change(tryName, ' ', '_');
		tryName = Strings.change(tryName, '.', '_');
		return Strings.change(tryName, '@', '_');
	}

	public boolean toBool(Object o) throws Exception
	{
		switch (o.toString().charAt(0))
		{
			case 'T':
				return true;
			case 'N':
				return false;
			case 'F':
				return false;
		}
		throw new Exception("toBool " + o);
	}

	public void warnEvent(Exception e)
	{
		e.printStackTrace();
	}

}
