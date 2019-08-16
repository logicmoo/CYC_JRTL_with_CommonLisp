package org.logicmoo.translate.spoon;

import static java.nio.file.FileVisitResult.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.armedbear.lisp.Interpreter;
import org.armedbear.lisp.Lisp;
import org.logicmoo.system.BeanShellCntrl;
import org.logicmoo.system.IOUtils;

import com.cyc.cycjava.cycl.access_macros;
import com.cyc.cycjava.cycl.cb_parameters;
import com.cyc.cycjava.cycl.cb_utilities;
import com.cyc.cycjava.cycl.cfasl;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.html_utilities;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.kb_indexing_datastructures;
import com.cyc.cycjava.cycl.kb_macros;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.cycjava.cycl.sbhl.sbhl_iteration;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols_CYC;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols_KW;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols_SYM;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import spoon.Launcher;
import spoon.SpoonException;
import spoon.compiler.Environment;
import spoon.processing.AbstractProcessor;
import spoon.refactoring.CtRenameLocalVariableRefactoring;
import spoon.refactoring.RefactoringException;
import spoon.reflect.code.CtAssignment;
import spoon.reflect.code.CtBlock;
import spoon.reflect.code.CtCodeSnippetStatement;
import spoon.reflect.code.CtComment;
import spoon.reflect.code.CtComment.CommentType;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtFieldWrite;
import spoon.reflect.code.CtIf;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.code.CtLiteral;
import spoon.reflect.code.CtLocalVariable;
import spoon.reflect.code.CtReturn;
import spoon.reflect.code.CtStatement;
import spoon.reflect.declaration.CtAnnotation;
import spoon.reflect.declaration.CtAnonymousExecutable;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtExecutable;
import spoon.reflect.declaration.CtField;
import spoon.reflect.declaration.CtImport;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtParameter;
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.CtTypeMember;
import spoon.reflect.declaration.ModifierKind;
import spoon.reflect.declaration.ParentNotInitializedException;
import spoon.reflect.factory.CodeFactory;
import spoon.reflect.factory.Factory;
import spoon.reflect.reference.CtExecutableReference;
import spoon.reflect.reference.CtFieldReference;
import spoon.reflect.reference.CtTypeMemberWildcardImportReference;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.CtScanner;
import spoon.reflect.visitor.DefaultJavaPrettyPrinter;
import spoon.reflect.visitor.ImportScanner;
import spoon.reflect.visitor.Query;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.compiler.jdt.JDTBasedSpoonCompiler;

public class TestSpooner {

	public static void main(String[] args) throws IOException {

		dest = new File("../eclipse-workspace/cycjava_new/server-out/");
		dest.mkdirs();
		readySubLisp();

		int matches = 0;

		while (true) {

			launcher = new Launcher();
			final Environment environment = launcher.getEnvironment();
			launcher.setSourceOutputDirectory(dest);
			environment.setIgnoreDuplicateDeclarations(true);

			if (true) {
				DefaultJavaPrettyPrinter.factoryDJPP = new DefaultJavaPrettyPrinter.JavaPrettyPrinterFactory() {

					@Override
					public DefaultJavaPrettyPrinter createPrettyPrinter(Environment env) {
						if (false && reusedMOP != null)
							return reusedMOP;
						return reusedMOP = new MyOutputPrinter(env);
					}
				};
			}

			if (SMALL_SANITY_CHECK) {
				// launcher.addInputResource("main/server-4q/com/cyc/cycjava/cycl/system_parameters.java");
				// launcher.addInputResource("main/server-4q/com/cyc/cycjava/cycl/assertion_utilities.java");
				// launcher.addInputResource("main/server-4q/com/cyc/cycjava/cycl/arity.java");
				launcher.addInputResource("main/server-4q/com/cyc/cycjava/cycl/kb_action_to_uia_trampolines.java");
				launcher.addInputResource("main/server-4q/com/cyc/");
				// launcher.addInputResource("main/server-4q/com/cyc/cycjava/cycl/utilities_macros.java");
				// launcher.addInputResource("main/server-4q/com/cyc/cycjava/cycl/date_utilities.java");
				// launcher.addInputResource("main/server-4q/com/cyc/cycjava/cycl/system_parameters.java");
				// launcher.addInputResource("main/server-4q/com/cyc/cycjava/cycl/assertion_utilities.java");
				// addInputResourceMask("main/server-4q/com/cyc/", "*vars.java", 4099999, true);
				// addInputResourceMask("main/server-4q/com/cyc/", "mt*.java", 4099999, true);
				// addInputResourceMask("main/server-4q/com/cyc/", "cb*.java", 4099999, true);
				// addInputResourceMask("main/server-4q/com/cyc/", "*test*.java", 4099999,
				// true);
				// addInputResourceMask("main/server-4q/com/cyc/", "*param*.java", 4099999,
				// true);
			} else {

				/*
				 * addInputResourceMask("main/server-4q/com/cyc/cycjava/cycl/", "a*.java",
				 * 4099999, false); addInputResourceMask("main/server-4q/com/cyc/cycjava/cycl/",
				 * "cl*.java", 4099999, false);
				 * addInputResourceMask("main/server-4q/com/cyc/cycjava/cycl/", "con*.java",
				 * 4099999, false); addInputResourceMask("main/server-4q/com/cyc/cycjava/cycl/",
				 * "obj*.java", 4099999, false); //
				 * addInputResourceMask("main/server-4q/com/cyc/cycjava/cycl/", "method*.java",
				 * 4099999, false);
				 * launcher.addInputResource("main/server-4q/com/cyc/cycjava/cycl/inference/");
				 */
				//
				// launcher.addInputResource("main/server-4q/com/cyc/cycjava/cycl/inference/harness/inference_datastructures_problem_store.java");
				// launcher.addInputResource("main/server-4q/com/cyc/cycjava_2/cycl/inference/harness/inference_datastructures_problem_store.java");

				// launcher.addInputResource("main/server-4q/com/cyc/cycjava_2/cycl/arity.java");
				// launcher.addInputResource("main/server-4q/com/cyc/cycjava/cycl/agenda.java");
				// launcher.addInputResource("main/server-4q/com/cyc/cycjava_2/cycl/agenda.java");
				// launcher.addInputResource("main/server-4q/com/cyc/cycjava/cycl/inference/harness/");
				// launcher.addInputResource("main/server-4q/com/cyc/cycjava_2/cycl/inference/harness/");

				// launcher.addInputResource("main/server-4q/com/cyc/");
				// launcher.addInputResource("main/server-4q-works-2/com/cyc/cycjava/cycl/agenda.java");
				// launcher.addInputResource("main/server-4t/com/cyc/cycjava_3/cycl/agenda.java");
				// launcher.addInputResource("main/server-4q-works-2/com/cyc/cycjava/cycl/");
				// launcher.addInputResource("main/server-4t/com/cyc/cycjava_3/cycl/");
				// launcher.addInputResource("main/server-4q/com/cyc/cycjava_2/cycl/");
				// launcher.addInputResource("main/server-4q/com/cyc/cycjava/cycl/");
				// addInputResourceMask("main/server-4q-works-2/", "*.java", 4099999);

				// main\server-4q\com\cyc\cycjava\cycl\cyclifier.java
				// launcher.addInputResource("main/server-4u/com/cyc/cycjava_0/cycl/");
				// launcher.addInputResource("main/server-4v/com/cyc/cycjava/cycl/");

				matches = addInputResourceMask("main/server-4q/com/cyc/cycjava/cycl/", "*.java", 10, true);

			}
			if (matches == 0)
				System.exit(0);

			if (true) {
				environment.setPrettyPrinterCreator(() -> {
					return new MyOutputPrinter(environment);
				});
			}

			// purgeDirectoryButKeepSubDirectories(dest);

			// environment.setInputClassLoader(ClassLoader.getSystemClassLoader());
			if (true) {
				launcher.addProcessor(new MergingCodeProcessor());
			}

			// if true, the pretty-printed code is readable without fully-qualified names
			environment.setAutoImports(true);
			boolean completed = false;
			try {
				while (!completed) {
					try {
						launcher.run();
						completed = true;
					} catch (Error e) {
						e.printStackTrace();
						continue;
					} catch (Exception e) {
						e.printStackTrace();
						break;
					}
				}
			} finally {
				// TODO: handle finally clause
				// launcher.run();
				if (SMALL_SANITY_CHECK)
					System.exit(0);
			}

		}
	}

	static String andOneDot(String qualifiedName) {
		final int lastDot = qualifiedName.lastIndexOf('.');
		if (lastDot <= 0)
			return qualifiedName;
		return qualifiedName.substring(qualifiedName.lastIndexOf('.', lastDot - 1) + 1);
	}

	/**
	 * TODO Describe the purpose of this method.
	 * 
	 * @param expression
	 * @return
	 */
	static CtElement asStatement(final CtElement expression) {
		CtElement p = expression;

		if (p instanceof CtAssignment) {
			return p;
		}
		CtElement p2 = getParent(p);
		if (p2 == null) {
			return p;
		}

		while (true) {
			if (p2 == null) {
				return p;
			}
			if (p instanceof CtAssignment) {
				return p;
			}
			if (p2 instanceof CtAssignment) {
				return p2;
			}
			if (p2 instanceof CtBlock) {
				return p;
			}
			p = getParent(p);
			p2 = getParent(p);
		}
	}

	/**
	 * TODO Describe the purpose of this method.
	 * 
	 * @param oldName
	 * @param newName
	 * @return
	 */
	static boolean betterNameThan(String oldName, String newName) {
		if (oldName.contains("str_alt") || oldName.contains("list_alt"))
			return false;
		if (newName.contains("str_alt") || newName.contains("list_alt"))
			return true;
		if (oldName.endsWith("$"))
			return true;
		if (!newName.endsWith("$"))
			return true;
		return false;
	}

	/**
	 * TODO Describe the purpose of this method.
	 */
	static void breakPoint() {
		try {
			atBP++;
			"".toString();
		} finally {
			atBP--;
		}
	}

	/**
	 * Changes name of a {@link CtLocalVariable}.
	 *
	 * @param localVariable to be renamed {@link CtLocalVariable} in the AST.
	 * @param newName       New name of the element.
	 * @throws RefactoringException when rename to newName would cause model
	 *                              inconsistency, like ambiguity, shadowing of
	 *                              other variables, etc.
	 */
	static void changeLocalVariableName(CtLocalVariable<?> localVariable, String newName) throws RefactoringException {
		new CtRenameLocalVariableRefactoring().setTarget(localVariable).setNewName(newName).refactor();
	}

	/**
	 * Changes name of a method, propagates the change in the executable references
	 * of the model.
	 */
	static void changeMethodName(final CtMethod<?> method, String newName) {

		final List<CtExecutableReference<?>> references = Query.getElements(method.getFactory(),
				new TypeFilter<CtExecutableReference<?>>(CtExecutableReference.class) {
					@Override
					public boolean matches(CtExecutableReference<?> reference) {
						return reference.getDeclaration() == method;
					}
				});

		method.setSimpleName(newName);

		for (final CtExecutableReference<?> reference : references) {
			reference.setSimpleName(newName);
		}
	}

	/**
	 * Changes name of a type element.
	 *
	 * @param type Type in the AST.
	 * @param name New name of the element.
	 */
	static void changeTypeName(final CtType<?> type, String name) {

		final String typeQFN = type.getQualifiedName();
		final List<CtTypeReference<?>> references = Query.getElements(type.getFactory(),
				new TypeFilter<CtTypeReference<?>>(CtTypeReference.class) {
					@Override
					public boolean matches(CtTypeReference<?> reference) {
						final String refFQN = reference.getQualifiedName();
						return typeQFN.equals(refFQN);
					}
				});

		type.setSimpleName(name);
		for (final CtTypeReference<?> reference : references) {
			reference.setSimpleName(name);
		}
	}

	/**
	 * TODO Describe the purpose of this method.
	 * 
	 * @param field
	 */
	static void cleanupModifiers(CtField field) {
		// TODO Auto-generated method stub
		Set modifiers = field.getModifiers();
		if (modifiers.contains(ModifierKind.FINAL)) {
			modifiers.remove(ModifierKind.VOLATILE);
			field.setModifiers(modifiers);
		}
		if (modifiers.contains(ModifierKind.PUBLIC)) {
			modifiers.remove(ModifierKind.PRIVATE);
			modifiers.remove(ModifierKind.PROTECTED);
			field.setModifiers(modifiers);
		} else if (modifiers.contains(ModifierKind.PROTECTED)) {
			modifiers.remove(ModifierKind.PRIVATE);
			field.setModifiers(modifiers);
		}
	}

	/** See doc in {@link CtMethod#copyMethod()} */
	static CtMethod<?> copyMethod(final CtMethod<?> method) {
		final CtMethod<?> clone = method.clone();
		final StringBuilder tentativeTypeName = new StringBuilder(method.getSimpleName() + "_Previous");
		final CtType parent = method.getParent(CtType.class);
		while (!parent.getMethodsByName(tentativeTypeName.toString()).isEmpty()) {
			tentativeTypeName.append("X");
		}
		final String cloneMethodName = tentativeTypeName.toString();
		clone.setSimpleName(cloneMethodName);
		parent.addMethod(clone);
		new CtScanner() {
			@Override
			public <T> void visitCtExecutableReference(CtExecutableReference<T> reference) {
				final CtExecutable<T> declaration = reference.getDeclaration();
				if (declaration == null) {
					return;
				}
				if (declaration == method) {
					reference.setSimpleName(cloneMethodName);
				}
				if (reference.getDeclaration() != clone) {
					// throw new SpoonException("post condition broken " + reference);
				}
				super.visitCtExecutableReference(reference);

			}
		}.scan(clone);
		return clone;
	}

	/** See doc in {@link CtType#copyType()} */
	static CtType<?> copyType(final CtType<?> type) {
		final CtType<?> clone = type.clone();
		final StringBuilder tentativeTypeName = new StringBuilder(type.getSimpleName() + "_Type_Copy");
		while (type.getFactory().Type().get(type.getPackage().getQualifiedName() + "." + tentativeTypeName) != null) {
			tentativeTypeName.append("X");
		}
		final String cloneTypeName = tentativeTypeName.toString();
		clone.setSimpleName(cloneTypeName);
		type.getPackage().addType(clone);
		// fix cloned type name
		new CtScanner() {
			@Override
			public <T> void visitCtExecutableReference(CtExecutableReference<T> reference) {
				final CtExecutable<T> declaration = reference.getDeclaration();
				if (declaration == null) {
					return;
				}
				if (declaration.hasParent(type)) {
					reference.getDeclaringType().setSimpleName(cloneTypeName);
				}
				super.visitCtExecutableReference(reference);

			}

			@Override
			public <T> void visitCtFieldReference(CtFieldReference<T> reference) {
				final CtField<T> declaration = reference.getDeclaration();
				if (declaration == null) {
					return;
				}
				if (declaration.hasParent(type)) {
					reference.getDeclaringType().setSimpleName(cloneTypeName);
				}
				super.visitCtFieldReference(reference);
			}

			@Override
			public <T> void visitCtTypeReference(CtTypeReference<T> reference) {
				if (reference.getDeclaration() == null) {
					return;
				}
				if (reference.getDeclaration() == type) {
					reference.setSimpleName(cloneTypeName);
				}
				super.visitCtTypeReference(reference);
			}

		}.scan(clone);
		// check that everything is OK
		new CtScanner() {
			@Override
			public <T> void visitCtExecutableReference(CtExecutableReference<T> reference) {
				final CtExecutable<T> declaration = reference.getDeclaration();
				if (declaration == null) {
					return;
				}
				if (!declaration.hasParent(clone)) {
					throw new SpoonException("post condition broken " + reference);
				}
				super.visitCtExecutableReference(reference);

			}

			@Override
			public <T> void visitCtFieldReference(CtFieldReference<T> reference) {
				final CtField<T> declaration = reference.getDeclaration();
				if (declaration == null) {
					return;
				}
				if (!declaration.hasParent(clone)) {
					throw new SpoonException("post condition broken " + reference);
				}
				super.visitCtFieldReference(reference);
			}

			@Override
			public <T> void visitCtTypeReference(CtTypeReference<T> reference) {
				if (reference.getDeclaration() == null) {
					return;
				}
				if (reference.getDeclaration().getTopLevelType() != clone) {
					throw new SpoonException("post condition broken " + reference);
				}
				super.visitCtTypeReference(reference);
			}

		}.scan(clone);
		return clone;
	}

//	static SpoonInfo findSpoonInfo(String qualifiedName) {
//		String qualifiedName = t.getQualifiedName();
//		qualifiedName = andOneDot(qualifiedName);
//		return findSpoonInfo(qualifiedName);
//	}

	/**
	 * TODO Describe the purpose of this method.
	 * 
	 * @param t
	 * @param qualifiedName
	 * @return
	 */
	static SpoonInfo findSpoonInfo(String qualifiedName) {
		String simpleName = andOneDot(qualifiedName);
		SpoonInfo info = ctClasses.get(simpleName);
		if (info == null) {
			info = new SpoonInfo(simpleName, null);
			ctClasses.put(simpleName, info);
		} else {
		}
		return info;
	}

	/**
	 * TODO Describe the purpose of this method.
	 * 
	 * @param assignment
	 * @return
	 */
	static String getInvokation(CtExpression assignment) {
		if (assignment instanceof CtInvocation) {
			CtInvocation invocation = (CtInvocation) assignment;
			return "" + invocation.getExecutable().getSimpleName();
		}
		for (CtElement e : assignment.getElements(null)) {
			if (e instanceof CtInvocation) {
				CtInvocation invocation = (CtInvocation) e;
				return "" + invocation.getExecutable().getSimpleName();
			}
		}
		return null;
	}

	static CtElement getParent(CtElement p) {
		try {
			if (p == null)
				return null;
			return p.getParent();
		} catch (final ParentNotInitializedException e) {
			return null;
		}
	}

	/**
	 * TODO Describe the purpose of this method.
	 * 
	 * @param element
	 * @return
	 */
	static boolean isGone(Object o) {
		if (!deletedStatements.contains(o))
			return false;
		breakPoint();
		return true;
	}

	static Member isStaticImported(String sr, boolean method) {
		if (PROCESS_LEVEL < 2)
			return null;
		if (!method) {
			for (final Class c : STATIC_IMPORT_CLASSES) {

				try {
					final Field f = c.getField(sr);
					if (Modifier.isStatic(f.getModifiers())) {
						return f;
					}
				} catch (NoSuchFieldException | SecurityException e) {
				}
			}
		} else {
			for (final Class c : STATIC_IMPORT_CLASSES) {
				for (final Method m : c.getMethods()) {
					if (Modifier.isStatic(m.getModifiers())) {
						if (sr.equals(m.getName()))
							return m;
					}
				}

			}
		}
		return null;
	}

	/**
	 * TODO Describe the purpose of this method.
	 * 
	 * @param es
	 * @param q
	 * @param string
	 * @return
	 */
	static String replaceAll(String es, String q, String string) {
		while (es.contains(q)) {
			es = es.replace(q, string);
		}
		return es;
	}

	/**
	 * TODO Describe the purpose of this method.
	 * 
	 * @param assignment
	 * @return
	 */
	static String toAssignedLiteral(CtExpression assignment) {
		for (CtElement e : assignment.getElements(null)) {
			if (e instanceof CtLiteral) {
				Object value = ((CtLiteral) e).getValue();
				if (value != null)
					return "" + value;
			}
		}
		return null;
	}

	/**
	 * TODO Describe the purpose of this method.
	 * 
	 * @param ctComment
	 * @return
	 */
	@LispMethod(comment = "interesting stuff")
	static String toCommentString(CtComment ctComment) {
		String s = ctComment.getContent();
		if (s == null)
			return null;
		String s2 = MaybeTrim(s);
		if (s2 == null)
			return null;
		if (s2.length() != s.length() && s2.length() > 0) {
			ctComment.setContent(s2);
		}
		return s2;
	}

	/**
	 * TODO Describe the purpose of this method.
	 * 
	 * @param data
	 * @param c
	 * @return
	 */
	static String toFieldName(String data, char first, char underScore) {
		// TODO Auto-generated method stub
		if (data == null)
			return null;
		if (data.length() < 3)
			return data;
		final String replace1 = data.substring(0, 1).replace(first, '_');
		final String replace2 = data.substring(1).replace(underScore, '_');
		return replace1 + replace2;
	}

	/**
	 * TODO Describe the purpose of this method.
	 * 
	 * @param sas
	 * @return
	 */
	static String toSymbolFieldName(String sas) {
		String fn = toFieldName(sas, '_', '-');
		final int length = sas.length();
		if (length > 3 && fn.startsWith("*") && fn.endsWith("?*")) {
			fn = "$" + fn.toLowerCase().substring(1, fn.length() - 2) + "P$";
		}
		if (length > 2 && fn.startsWith("*") && fn.endsWith("*")) {
			fn = "$" + fn.toLowerCase().substring(1, fn.length() - 1) + "$";
		}
		if (length > 1 && fn.endsWith("?")) {
			fn = fn.substring(0, fn.length() - 1) + "_";
		}
		return fn;
	}

	/**
	 * TODO Describe the purpose of this method.
	 * 
	 * @param string
	 * @throws IOException
	 */
	static void addInputResourceMask(String string) throws IOException {
		final int indexOf = string.indexOf("*");
		String startingDirStr = string.substring(0, indexOf + 1);
		final int endIndex = startingDirStr.lastIndexOf('/') + 1;
		startingDirStr = startingDirStr.substring(0, endIndex);
		final String pattern = string.substring(endIndex);
		addInputResourceMask(startingDirStr, pattern, Integer.MAX_VALUE, true);
	}

	static int addInputResourceMask(String startingDirStr, String pattern, int max, boolean recurse)
			throws IOException {
		final Path startingDir = Paths.get(startingDirStr);
		final Finder finder = new Finder(pattern, startingDirStr, max, recurse);
		Files.walkFileTree(startingDir, finder);
		return finder.done();
	}

	/**
	 * TODO Describe the purpose of this method.
	 * 
	 * @param lastWord
	 * @return
	 * @throws NoSuchFieldException
	 */
	static Field getDeclared(Class c, String lastWord) {
		try {
			return c.getField(lastWord);
		} catch (NoSuchFieldException | SecurityException e) {
			try {
				return c.getDeclaredField(lastWord);
			} catch (NoSuchFieldException | SecurityException e1) {
				for (Class fc : c.getInterfaces()) {
					Field f = getDeclared(fc, lastWord);
					if (f != null)
						return f;
				}
				c = c.getSuperclass();
				if (c != null && c != Object.class) {
					return getDeclared(c, lastWord);
				}
			}
			return null;
		}
	}

	/**
	 * TODO Describe the purpose of this method.
	 * 
	 * @param s
	 * @return
	 */
	static String MaybeTrim(String s) {
		if (s != null) {
			s = s.trim();
			if (s.startsWith("/")) {
				return MaybeTrim(s.substring(1));
			}
			if (s.length() == 0)
				return null;
		}
		return s;
	}

	/**
	 * TODO Describe the purpose of this method.
	 */
	static void populateImportedClasses() {
		for (Class class1 : STATIC_IMPORT_CLASSES_ARRAY) {
			STATIC_IMPORT_CLASSES.add(class1);
			String cn = class1.getName();
			if (cn.startsWith("com.cyc.cycjava.")) {
				cn = cn.replace(".cycjava.", ".cycjava_2.");
				try {
					Class class2 = Class.forName(cn);
					STATIC_IMPORT_CLASSES.add(class2);
				} catch (ClassNotFoundException e) {
				}
			}

		}

		for (Class class1 : IMPORT_CLASSES_ARRAY) {
			IMPORT_CLASSES.add(class1);
			String cn = class1.getName();
			if (cn.startsWith("com.cyc.cycjava.")) {
				cn = cn.replace(".cycjava.", ".cycjava_2.");
				try {
					Class class2 = Class.forName(cn);
					IMPORT_CLASSES.add(class2);
					STATIC_IMPORT_CLASSES.remove(class2);
				} catch (ClassNotFoundException e) {
				}
			}

		}
	}

	/**
	 * TODO Describe the purpose of this method.
	 */
	public static void readySubLisp() {
		Lisp.initLisp();
		Interpreter.createBasicInstance();
		BeanShellCntrl.init_subl();
		BeanShellCntrl.init_cyc();
		populateImportedClasses();
	}

	public static CtMethod findMethod(CtType best, String mn, int len) {
		for (Object o : best.getMethodsByName(mn)) {
			if (o instanceof CtMethod) {
				final CtMethod ctMethod = (CtMethod) o;
				if (len > -1)
					if (ctMethod.getParameters().size() != len)
						continue;
				if (ctMethod.getSimpleName().equals(mn))
					return (CtMethod<Object>) o;
			}
		}
		if (len >= 0) {
			CtMethod rm = findMethod(best, mn, -1);
			if (rm != null) {
				// return rm;
			}
		}
		return null;
	}

	/**
	 * TODO Describe the purpose of this method.
	 * 
	 * @param element
	 * @param x
	 */
	public static void printNode(String header, String x, int len) {
		if (len > 0) {
			if (x.length() > len - 2)
				x = x.substring(0, len) + "\n    .... \n";
		}
		if (x.contains("\n")) {
			x = "\n" + x + "\n";
		}
		System.err.println(header + ": " + x);
	}

	public static void purgeDirectoryButKeepSubDirectories(File dir) {
		for (File file : dir.listFiles()) {
			if (!file.isDirectory()) {
				file.delete();
			} else {
				purgeDirectoryButKeepSubDirectories(file);
			}
		}
	}

	static final boolean justRewrite = true;

	static final Map<String, String> NO_RENAMES = new HashMap<String, String>();

	static final Object NOT_USED = new Object() {/*
													 * (non-Javadoc)
													 * 
													 * @see java.lang.Object#toString()
													 */
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "NOT USED";
		}
	};
	static File dest;

	static Class[] IMPORT_CLASSES_ARRAY = new Class[] { //
			SubLTranslatedFile.class, //
			LispMethod.class, //
			SubLFile.class, SubLObject.class, //
			SubLProcess.class, };

	static Launcher launcher;

	/**
	 * 
	 */
	static Class[] STATIC_IMPORT_CLASSES_ARRAY = new Class[] { //
			subl_macro_promotions.class, cb_utilities.class,
			com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.class, //
			com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.class, //
			com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.class, //
			com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.class, //
			com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.class, //
			com.cyc.tool.subl.jrtl.translatedCode.sublisp.format.class, //
			SubLTrampolineFile.class, //
			id_index.class, constant_handles.class, cb_parameters.class, cdestructuring_bind.class,
			com.cyc.tool.subl.util.SubLFiles.class, //
			list_utilities.class, SubLTranslatedFile.class, //
			CommonSymbols.class, //
			kb_indexing_datastructures.class, sbhl_iteration.class, cfasl.class, html_utilities.class, //
			CommonSymbols_KW.class, //
			CommonSymbols_CYC.class, //
			CommonSymbols_SYM.class, //
			PrintLow.class, ConsesLow.class, //
			Hashtables.class, Values.class, Types.class, //
			Characters.class, //
			Numbers.class, Sequences.class, Functions.class, //
			Dynamic.class, com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment.class, Equality.class, Eval.class, //
			Locks.class, Packages.class, Structures.class, //
			Symbols.class, Threads.class, //
			Time.class, Vectors.class, //
			com.cyc.cycjava.cycl.el_utilities.class, generic_testing.class, kb_macros.class, //
			control_vars.class, utilities_macros.class, access_macros.class };

	protected static DefaultJavaPrettyPrinter reusedMOP;

	static int atBP = 0;

	static Map<String, SpoonInfo> ctClasses = new HashMap<String, SpoonInfo>();

	static int DEBUG_LEVEL = 1;

	final static IdentitySet delayedStatements = new IdentitySet();

	final static IdentitySet deletedStatements = new IdentitySet();

	static final List<Class> IMPORT_CLASSES = new ArrayList<Class>();

	static int PROCESS_LEVEL = 2;

	static int SAFETY_LEVEL = 1;

	static boolean SMALL_SANITY_CHECK = false;

	static final List<Class> STATIC_IMPORT_CLASSES = new ArrayList<Class>();

	static Object writingEle = NOT_USED;

	public class TestSpoonCompiler extends JDTBasedSpoonCompiler {

		public TestSpoonCompiler(Factory factory) {
			super(factory);
		}

		@Override
		protected void generateProcessedSourceFilesUsingCUs() {

			try {
				getFactory().getEnvironment().debugMessage("Generating source using compilation units...");
				// Check output directory
				if (getSourceOutputDirectory() == null) {
					throw new RuntimeException("You should set output directory before generating source files");
				}
				// Create spooned dir
				if (getSourceOutputDirectory().isFile()) {
					throw new RuntimeException("Output must be a directory");
				}
				if (!getSourceOutputDirectory().exists()) {
					if (!getSourceOutputDirectory().mkdirs()) {
						throw new RuntimeException("Error creating output directory");
					}
				}
				getFactory().getEnvironment().debugMessage("Generating source files to: " + getSourceOutputDirectory());

				final List<File> printedFiles = new ArrayList<>();
				printing: for (final spoon.reflect.cu.CompilationUnit cu : getFactory().CompilationUnit().getMap()
						.values()) {

					getFactory().getEnvironment()
							.debugMessage("Generating source for compilation unit: " + cu.getFile());

					final CtType<?> element = cu.getMainType();

					final CtPackage pack = element.getPackage();

					// create package directory
					File packageDir;
					if (pack.getQualifiedName().equals(CtPackage.TOP_LEVEL_PACKAGE_NAME)) {
						packageDir = new File(getSourceOutputDirectory().getAbsolutePath());
					} else {
						final char dot = '.';
						// Create current package dir
						packageDir = new File(getSourceOutputDirectory().getAbsolutePath() + File.separatorChar
								+ pack.getQualifiedName().replace(dot, File.separatorChar));
					}
					if (!packageDir.exists()) {
						if (!packageDir.mkdirs()) {
							throw new RuntimeException("Error creating output directory");
						}
					}

					final File file = new File(packageDir.getAbsolutePath() + File.separatorChar
							+ element.getSimpleName() + DefaultJavaPrettyPrinter.JAVA_FILE_EXTENSION);
					file.createNewFile();

					// the path must be given relatively to to the working directory
					final InputStream is = getCompilationUnitInputStream(cu.getFile().getPath());

					IOUtils.copy(is, new FileOutputStream(file));

					if (!printedFiles.contains(file)) {
						printedFiles.add(file);
					}
				} // end for
			} catch (final IOException e) {
				throw new RuntimeException(e);
			}
		}

	}

	/**
	 * A {@code FileVisitor} that finds all files that match the specified pattern.
	 */
	static class Finder extends SimpleFileVisitor<Path> {

		Finder(String pattern, String pattern2, int max, boolean recurse) {
			this.max = max;
			this.pattern2 = pattern2;
			doRecurse = recurse;
			matcher = FileSystems.getDefault().getPathMatcher("glob:" + pattern);

		}

		final PathMatcher matcher;
		final int max;
		int numMatches = 0;
		final String pattern2;

		final boolean doRecurse;

		// Invoke the pattern matching
		// method on each directory.
		@Override
		public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
			find(dir);
			if (noMore())
				return TERMINATE;
			return CONTINUE;
		}

		// Invoke the pattern matching
		// method on each file.
		@Override
		public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
			find(file);
			if (noMore())
				return TERMINATE;
			return CONTINUE;
		}

		@Override
		public FileVisitResult visitFileFailed(Path file, IOException exc) {
			System.err.println(exc);
			return CONTINUE;
		}

		/**
		 * TODO Describe the purpose of this method.
		 * 
		 * @return
		 */
		boolean noMore() {
			return numMatches >= max;
		}

		// Prints the total number of
		// matches to standard out.
		int done() {
			System.out.println("Matched: " + numMatches);
			return numMatches;
		}

		// Compares the glob pattern against
		// the file or directory name.
		void find(Path file) {
			final Path name = file.getFileName();
			final String string = file.toString();
			String stem = string;
			stem = stem.substring(Math.min(pattern2.length(), stem.length()));
			String classStem = string.substring(pattern2.indexOf("com"));
			if (name != null && matcher.matches(name)) {
				final File target = new File(dest, classStem);
				if (target.exists()) {
					if (PROCESS_LEVEL > 1) {
						try {
							System.out.println("skipping: " + target.getCanonicalPath());
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						return;
					}
				}

				if (!doRecurse) {
					if (stem.contains("/") || stem.contains("\\")) {
						return;
					}
				}
				if (noMore())
					return;
				System.out.println(file);

				numMatches++;
				launcher.addInputResource(string);
			}
		}
	}

	static final class MergingCodeProcessor extends AbstractProcessor<CtType<?>> {

		/*
		 * (non-Javadoc)
		 * 
		 * @see spoon.processing.Processor#process(spoon.reflect.declaration.CtElement)
		 */
		@Override
		public void process(CtType<?> ti) {
			CtType t = ti.getTopLevelType();
			String qualifiedName = t.getQualifiedName();
			final SpoonInfo info = findSpoonInfo(qualifiedName);
			printNode("MergingCodeProcessor: ", qualifiedName, 1000);
			info.processClass(ti);
			info.processClass(t);
		}

		@Override
		public void processingDone() {
			if (PROCESS_LEVEL < 2)
				return;
			for (final SpoonInfo info : ctClasses.values()) {
				info.processingDone();
			}

		}
	}

	public static class SpoonInfo {

		ImportScanner importsContext;
		Set<CtImport> imports;
		Factory factory;
		String myName;

		/**
		 * TODO Describe this constructor.
		 * 
		 * @param ctClass2
		 */
		public SpoonInfo(String baseName, Factory f) {
			myName = baseName;
			factory = f;
			MyNil = null;// f.Code().createCodeSnippetExpression("NIL");
		}

		/**
		 * TODO Describe the purpose of this method.
		 * 
		 * @param toC   the current comment
		 * @param fromC the new possibly new info
		 * @return
		 */
		static boolean containsInfo(String toC, String fromC) {
			if (fromC == null || fromC.length() == 0)
				return true;
			if (toC == null || toC.length() == 0)
				return false;
			return localComparable(toC).contains(localComparable(fromC));
		}

		/**
		 * TODO Describe the purpose of this method.
		 * 
		 * @param fromC
		 * @return
		 */
		static String localComparable(String fromCI) {
			String fromC = fromCI.replaceAll("[ \r\n\t]+", " ").trim();
			String newS = replaceAll(
					replaceAll(replaceAll(replaceAll(fromC, "= NIL;", ";"), "final ", ""), "list_alt", ""), "str_alt",
					"").replaceAll("[A-z][a-z][A-z_]+\\.", " ");
			if (newS.length() < 5) {
				return fromC;
			}
			newS = newS.replaceAll("[ \r\n\t]+", " ").trim();
			while (((newS.startsWith("{") && newS.endsWith("}"))) || (newS.startsWith("(") && newS.endsWith(")"))
					|| (newS.startsWith("\"") && newS.endsWith("\""))) {
				newS = newS.substring(0, newS.length() - 1);
				newS = newS.replaceAll("[ \r\n\t]+", " ").trim();
			}
			fromC = newS.replaceAll("[^A-z0-9]", "");
			return fromC;
		}

		/**
		 * TODO Describe the purpose of this method.
		 * 
		 * @param field
		 * @param annotation
		 */
		static void transferComments(CtElement from, CtElement to) {
			if (justRewrite)
				return;
			List<CtComment> already = to.getComments();
			for (CtComment comment : from.getComments()) {
				String fromC1 = toCommentString(comment);
				for (CtComment c : already) {
					String toC1 = toCommentString(c);
					if (containsInfo(toC1, fromC1)) {
						comment = null;
						break;
					}
				}
				if (comment != null) {
					CtComment cmt = comment.clone();
					String rawContent = toCommentString(cmt);
					if (rawContent != null && rawContent.length() > 0) {
						// if (rawContent.contains("\n")) {
						// cmt.setCommentType(CommentType.JAVADOC);
						// } else {
						// cmt.setCommentType(CommentType.INLINE);
						// }
						to.addComment(cmt);
					}
				}
			}
			String fromC = MaybeTrim(from.getDocComment());
			if (fromC != null && fromC.length() > 0) {
				from.setDocComment(fromC);
				String toC = to.getDocComment();
				if (toC == null) {
					to.setDocComment(fromC);
				} else {
					if (!containsInfo(toC, fromC)) {
						to.setDocComment(toC + "\n\n" + fromC);
					}
				}
			}

		}

		public Set<String> deleted = new HashSet<String>();

		public Map<String, String> inlinedName = new HashMap<String, String>();

		public Map<String, String> renames = new HashMap<String, String>();

		HashMap<String, String> betterNames = new HashMap<String, String>();

		// final Factory factory;
		HashMap<String, String> fieldValue2FieldName = new HashMap<String, String>();
		List<CtStatement> initialStatements = new ArrayList<CtStatement>();
		Set<CtType> innerTypes = new IdentitySet();
		CtType mainType;
		final IdentitySet<CtField> classFields = new IdentitySet<CtField>();

		// final HashMap<CtMethod, Collection<CtElement>> methods = new
		// HashMap<CtMethod, Collection<CtElement>>();
		// final HashMap<String, Collection<CtField>> fields = new HashMap<String,
		// Collection<CtField>>();
		final HashMap<String, Collection<CtExecutable>> classMethods = new HashMap<String, Collection<CtExecutable>>();

		// CtType copyOf;
		HashSet<CtImport> extraImports = new HashSet();
		HashMap<String, SpoonFieldInfo> fieldData = new HashMap<String, TestSpooner.SpoonInfo.SpoonFieldInfo>();

		CtExpression MyNil = null;
		final HashSet<String> noAssignBody = new HashSet<String>();
		final HashSet<String> noAssignFields = new HashSet<String>();

		// private CtType ctClass;
		final IdentitySet<CtType> seenTypes = new IdentitySet<CtType>();

		public void generateGetter(CtClass<?> ctClass, CtField<?> ctField) {
			final CtReturn returnStatement = getFactory().Core().createReturn();
			final CtExpression returnExpression = getFactory().Code()
					.createCodeSnippetExpression(ctField.getSimpleName());
			returnStatement.setReturnedExpression(returnExpression);
			final CtBlock body = getFactory().Code().createCtBlock(returnStatement);
			final CtMethod getter = getFactory().Method().create(ctClass,
					new HashSet<ModifierKind>(Arrays.asList(ModifierKind.PUBLIC)), ctField.getType(),
					"get" + toProperCase(ctField.getSimpleName()), null, null, body);
			ctClass.addMethod(getter);
		}

		public void generateSetter(CtClass<?> ctClass, CtField ctField) {
			final CtTypeReference voidReference = getFactory().Code().createCtTypeReference(void.class);

			final CtParameter<?> parameter = getFactory().Core().createParameter();
			parameter.setType(ctField.getType());
			parameter.setSimpleName(ctField.getSimpleName());
			final List<CtParameter<?>> parameterList = Arrays.asList(parameter);

			final CtCodeSnippetStatement assignment = getFactory().Code()
					.createCodeSnippetStatement("this." + ctField.getSimpleName() + " = " + ctField.getSimpleName());
			final CtBlock body = getFactory().Code().createCtBlock(assignment);

			final CtMethod setter = getFactory().Method().create(ctClass,
					new HashSet<ModifierKind>(Arrays.asList(ModifierKind.PUBLIC)), voidReference,
					"set" + toProperCase(ctField.getSimpleName()), parameterList, null, body);
			ctClass.addMethod(setter);
		}

		/**
		 * TODO Describe the purpose of this method.
		 * 
		 * @return
		 */
		public Factory getFactory() {
			if (this.factory == null) {
				this.factory = launcher.getFactory();
			}
			return this.factory;
		}

		public void processClass(CtType<?> t) {
			offerFactory(t.getFactory());
			final boolean isTopLevel = t.isTopLevel();
			if (!isTopLevel) {
				((Set) innerTypes).add(t);
				return;
			}
			if (seenTypes.add(t)) {
				System.err.println("processClass: " + t.getQualifiedName());
				final Set<CtType<?>> nestedTypes = t.getNestedTypes();
				innerTypes.addAll(nestedTypes);
			}
		}

		/**
		 * TODO Describe the purpose of this method.
		 * 
		 * @param t
		 */
		public void offerFactory(Factory f) {
			if (this.factory == null && f != null)
				this.factory = f;
		}

		public void processGoto(Object e) {
			int processed = 0;
			for (final Class c : e.getClass().getInterfaces()) {
				if (c == CtElement.class)
					continue;
				Method m;
				try {
					m = this.getClass().getMethod("process", c);
				} catch (NoSuchMethodException | SecurityException e1) {
					continue;
				}
				processed++;
				try {
					m.invoke(this, e);
				} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					continue;
				}
			}
			if (processed == 0) {
				System.err.println("no processor for: " + e);
			}

		}

		/**
		 * TODO Describe the purpose of this method.
		 */
		public void processingDone() {
			guessMainType();
			chooseInnerTypes();
			transferMembers();
			scanClass(mainType);
			scanElements(mainType);
			collectFields();
			renameFields();
			mergeEquivalentFields();
			for (CtType t : seenTypes) {
				if (mainType != t) {
					transferMethodsFrom(t);
				}
			}
			mergeEquivalentMethods();
			// commentsToAnnotations();
		}

		public void renameFields() {

			for (final CtField field : classFields) {
				final String oldName = field.getSimpleName();
				if (!oldName.startsWith("$")) {
					continue;
				}
				Field declaredField;
				String newName = oldName;
				declaredField = getDeclared(SubLTranslatedFile.class, newName);
				if (declaredField != null) {
					noAssignFields.add(oldName);
					deleted.add(oldName);
					continue;
				}
				if (oldName.endsWith("$")) {
					continue;
				}
				if (oldName.startsWith("$$")) {
					continue;
				}
				final String s[] = oldName.substring(1).split("[$]");
				String firstWord = s[0];
				if (firstWord.equals(""))
					firstWord = s[1];
				String lastWord = s[s.length - 1];
				if (lastWord.endsWith("_alt")) {
					// lastWord = lastWord.substring(0, lastWord.length() - 4);
				}
				final char ch = firstWord.charAt(firstWord.length() - 1);
				if (lastWord.endsWith("GAF")) {
					lastWord = lastWord.toString();
				}
				if (firstWord.startsWith("int")) {
					newName = "$int$" + lastWord;
					declaredField = getDeclared(SubLTranslatedFile.class, newName);
					if (declaredField != null) {
						noAssignFields.add(oldName);
						noAssignFields.add(newName);
						renames.put(oldName, newName);
						deleted.add(oldName);
						continue;
					}
					renames.put(oldName, newName);
					continue;
				}
				if (firstWord.startsWith("float")) {
					newName = "$float$" + lastWord;
					declaredField = getDeclared(SubLTranslatedFile.class, newName);
					if (declaredField != null) {
						noAssignFields.add(oldName);
						noAssignFields.add(newName);
						renames.put(oldName, newName);
						deleted.add(oldName);
						continue;
					}
					renames.put(oldName, newName);
					continue;
				}
				if (firstWord.startsWith("str")) {
					if (lastWord.contains("__"))
						continue;
					if (lastWord.endsWith("_") || lastWord.startsWith("_"))
						continue;
					newName = "$$$" + lastWord;
					declaredField = getDeclared(SubLTranslatedFile.class, newName);
					if (declaredField != null) {
						noAssignFields.add(oldName);
						noAssignFields.add(newName);
						renames.put(oldName, newName);
						deleted.add(oldName);
						continue;
						// field.delete();
					}
					CtExpression assignment = field.getAssignment();
					if (assignment != null) {
						String assignmentS = withoutRenames(assignment);
						String litteralMatch = "\"" + lastWord.replace('_', ' ') + "\"";
						if (assignmentS.contains(litteralMatch)) {
							renames.put(oldName, newName);
							declaredField = getDeclared(SubLTranslatedFile.class, newName);
							if (declaredField != null) {
								noAssignFields.add(oldName);
								noAssignFields.add(newName);
								renames.put(oldName, newName);
								deleted.add(oldName);
								continue;
								// field.delete();
							}
						}
					}
					continue;
				}
				if (firstWord.startsWith("const")) {
					newName = "$$" + lastWord;
					declaredField = getDeclared(SubLTranslatedFile.class, newName);
					if (declaredField != null) {
						noAssignFields.add(oldName);
						noAssignFields.add(newName);
						renames.put(oldName, newName);
						deleted.add(oldName);
						continue;
						// field.delete();
					}
					CtExpression assignment = field.getAssignment();
					if (assignment != null) {
						String assignmentS = withoutRenames(assignment);
						String litteralMatch = "\"" + lastWord.replace('_', '-') + "\"";
						if (assignmentS.contains(litteralMatch)) {
							renames.put(oldName, newName);
							declaredField = getDeclared(SubLTranslatedFile.class, newName);
							if (declaredField != null) {
								noAssignFields.add(oldName);
								noAssignFields.add(newName);
								renames.put(oldName, newName);
								deleted.add(oldName);
								continue;
								// field.delete();
							}
						}
					}
					continue;
				}

				if (firstWord.startsWith("kw")) {
					newName = "$" + lastWord;
					if (newName.equals("$TINY")) {
						newName = newName.toString();
					}
					declaredField = getDeclared(SubLTranslatedFile.class, newName);
					if (declaredField != null) {
						noAssignFields.add(oldName);
						noAssignFields.add(newName);
						renames.put(oldName, newName);
						deleted.add(oldName);
						continue;
						// field.delete();
					}
					CtExpression assignment = field.getAssignment();
					if (assignment != null) {
						String assignmentS = withoutRenames(assignment);
						String litteralMatch = "\"" + lastWord.replace('_', '-') + "\"";
						if (assignmentS.contains(litteralMatch)) {
							declaredField = getDeclared(SubLTranslatedFile.class, newName);
							if (declaredField != null) {
								noAssignFields.add(oldName);
								noAssignFields.add(newName);
								renames.put(oldName, newName);
								deleted.add(oldName);
								continue;
								// field.delete();
							}
							renames.put(oldName, newName);
						}
					}
					continue;
				}

				if (firstWord.startsWith("sym")) {
					CtExpression assignment = field.getAssignment();
					if (assignment != null) {
						String assignmentS0 = withoutRenames(assignment);
						if (assignmentS0.contains("UninternedSymbol"))
							continue;
					}
					newName = "" + lastWord;
					if (Character.isDigit(newName.charAt(0))) {
						continue;
					}
					declaredField = getDeclared(SubLTranslatedFile.class, newName);
					if (declaredField != null) {
						noAssignFields.add(oldName);
						noAssignFields.add(newName);
						renames.put(oldName, newName);
						deleted.add(oldName);
						continue;
						// field.delete();
					}
					if (assignment != null) {
						String assignmentS = withoutRenames(assignment);
						final String firstLit = lastWord.substring(0, 1);
						final String litString = firstLit + lastWord.substring(1).replace('_', '-');
						String litteralMatch = "\"" + litString + "\"";
						if (assignmentS.contains(litteralMatch)) {
							renames.put(oldName, newName);
							continue;
						}
						if ("_DTP_STRUCTURES_BAG_".equals(lastWord)) {
							lastWord = lastWord.toString();
						}
						String sas = toAssignedLiteral(assignment);
						if (sas != null) {
							if (sas.matches("[A-Z][A-Z-]*[A-Z?]")) {
								newName = toSymbolFieldName(sas);
								SpoonFieldInfo info = fieldData.get(newName);
								if (info != null) {
									Set<ModifierKind> public1 = info.isPublic();
									if (public1.contains(ModifierKind.PUBLIC)) {
										Set newM = field.getModifiers();
										newM.add(ModifierKind.PUBLIC);
										field.setModifiers(newM);
										cleanupModifiers(field);
									}
									deleted.add(newName);
									renames.put(oldName, newName);
									noAssignFields.add(newName);
									noAssignFields.add(oldName);
								} else {
									renames.put(oldName, newName);
									declaredField = getDeclared(SubLTranslatedFile.class, newName);
									if (declaredField != null) {
										noAssignFields.add(oldName);
										noAssignFields.add(newName);
										renames.put(oldName, newName);
										deleted.add(oldName);
										continue;
										// field.delete();
									}
									continue;
								}
								// renameF(ctClass, field, newName, ctClass.getReference());

							}

						}
					}
					continue;
				}
			}
		}

		public String toProperCase(String original) {
			return original.substring(0, 1).toUpperCase() + original.substring(1);
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			String s = myName;
			if (mainType != null) {
				s += " package " + mainType.getPackage() + ";\n";
			}
			return s;
		}

		/**
		 * TODO Describe the purpose of this method.
		 * 
		 * @param p
		 * @return
		 */
		public String withoutRenames(CtElement p) {
			final Map<String, String> wasRenames = renames;
			renames = NO_RENAMES;
			atBP++;
			try {
				return p.toString();
			} finally {
				atBP--;
				renames = wasRenames;
			}
		}

		/**
		 * TODO Describe the purpose of this method.
		 * 
		 * @param t
		 * @param declaration
		 * @return
		 */
		boolean checkDeclaredHere(CtType t, CtTypeMember declaration) {
			if (declaration.getDeclaringType() == t)
				return true;
			return true;
		}

		/**
		 * TODO Describe the purpose of this method.
		 */
		void chooseInnerTypes() {
			final CtType[] innerTypes2 = innerTypes.toArray(new CtType[innerTypes.size()]);
			IdentitySet<CtType> innerTypesChecked = new IdentitySet<CtType>();
			IdentitySet<CtType> innerTypesUse = new IdentitySet<CtType>();
			for (CtType t1 : innerTypes2) {
				if (innerTypesChecked.contains(t1))
					continue;
				if (t1.getFields().size() == 0) {
					continue;
				}
				for (CtType t2 : innerTypes2) {
					if (innerTypesChecked.contains(t2))
						continue;
					if (t1 == t2)
						continue;
					String s1 = t1.getSimpleName();
					String s2 = t2.getSimpleName();
					String simpleClassName = s1;
					if (s1.contains(s2) || s2.contains(s1)) {
						if (s1.contains(s2)) {
							simpleClassName = s2;
						}
						// if (s1.endsWith("_HIDE")) {
						// CtType swap = t1;
						// t1 = t2;
						// t2 = swap;
						// s1 = t1.getSimpleName();
						// s2 = t2.getSimpleName();
						// }
						CtType withNil = null;
						int startAt = 2;

						List<String> fnames1 = new ArrayList<String>();
						List<String> fnames2new = new ArrayList<String>();
						for (CtFieldReference f : t1.getDeclaredFields()) {
							if (f.isStatic()) {
								continue;
							}
							final String simpleName = f.getSimpleName();
							fnames1.add(simpleName);
							if (t2.getField(simpleName) == null) {
								fnames2new.add(simpleName);
							}
							if (MyNil == null) {
								CtField rf = t1.getField(simpleName);
								final CtExpression assignment = rf.getAssignment();
								if (assignment != null) {
									MyNil = assignment;
									withNil = t1;
								}
							}
						}

						List<String> fnames2 = new ArrayList<String>();
						List<String> fnames1new = new ArrayList<String>();
						for (CtFieldReference f : t2.getDeclaredFields()) {
							if (f.isStatic()) {
								f.setImplicit(true);
								continue;
							}
							f.setImplicit(true);
							final String simpleName = f.getSimpleName();
							fnames2.add(simpleName);
							if (t1.getField(simpleName) == null) {
								fnames1new.add(simpleName);
							}
							if (MyNil == null) {
								CtField rf = t2.getField(simpleName);
								final CtExpression assignment = rf.getAssignment();
								if (assignment != null) {
									MyNil = assignment;
									withNil = t2;
								}
							}
						}

						if (fnames1new.size() == 0 && fnames2new.size() == 0) {
							t1.setSimpleName(simpleClassName);
							t2.setSimpleName(simpleClassName);
							deletedStatements.add(t2);
							t2.getDeclaringType().removeNestedType(t2);
							t2.delete();
							innerTypesChecked.add(t2);
							continue;
						}

						CtType best = t1;
						List<String> use = fnames1;
						List<String> useNew = fnames1new;

						CtType nonbest = t2;
						List<String> dontuse = fnames2;
						List<String> dontuseNew = fnames2new;

						if (fnames1new.size() > fnames2new.size()) {
							best = t2;
							use = fnames2;
							useNew = fnames2new;

							nonbest = t1;
							dontuse = fnames1;
							dontuseNew = fnames1new;

							t2.setSimpleName(simpleClassName);
							t1.setSimpleName(simpleClassName);
							deletedStatements.add(t1);
						}

						for (String s : useNew) {
							final CtField clone = nonbest.getField(s).clone();
							if (clone.getAssignment() == null) {
								clone.setAssignment(MyNil);
							}
							best.addField(clone);

						}

						deletedStatements.add(nonbest);
						String cn = s1;
						if (cn.startsWith("$")) {
							cn = cn.substring(1);
						}
						if (cn.endsWith("_HIDE")) {
							cn = cn.substring(0, cn.length() - 5);
						}
						if (cn.endsWith("_native")) {
							cn = cn.substring(0, cn.length() - 7);
						}
						int killCount = 0;
						CtType killRefs = nonbest.getDeclaringType();
						for (Object o : killRefs.getMethods()) {
							if (!(o instanceof CtMethod))
								continue;
							final CtMethod m = (CtMethod) o;
							String s = withoutRenames(m.getBody());
							if (!s.contains("setField") && !s.contains("getField")) {
								continue;
							}

							int fn = -1;
							Pattern pattern = Pattern.compile("(.*Field)(\\d+)([^0-9].*)");
							Matcher matcher = pattern.matcher(s);
							while (matcher.find()) {
								try {
									fn = Integer.parseInt(matcher.group(2));
								} catch (Exception e) {
									// TODO: handle exception
								}
							}

							String prefix = null;
							String mn = m.getSimpleName();
							String fname = null;

							boolean matches = false;

							int fndontuse = startAt;
							for (String sn : dontuse) {
								final String suffix = "_" + sn.substring(1);
								if (mn.endsWith(suffix)) {
									matches = true;
									prefix = mn.substring(0, suffix.length());
									fname = sn;
									break;
								}
								fndontuse++;
							}

							if (!matches)
								continue;

							final String s3 = cn.toUpperCase() + "_P";
							final String s4 = s3.replace("_", "-");
							final String s5 = "$" + cn + "_native";
							matches = s.contains(s3) || s.contains(s4) || s.contains(s5);
							if (!matches) {
								matches = mn.startsWith(cn + "_");
							}
							if (!matches) {
								matches = prefix.endsWith(cn);
							}
							if (matches) {

								final String replaceFN = fname.replace("$", "\\$");
								if (!useNew.contains(fname.toString())) {
									final List<CtStatement> statements = m.getBody().getStatements();
									final List<CtStatement> cstatements = m.getBody().clone().getStatements();
									statements.clear();
									String p1 = "v_object";
									p1 = "" + ((CtParameter) m.getParameters().get(0)).getSimpleName();
									for (CtStatement cs : cstatements) {
										s = "" + cs;
										String methodBody = s.replaceAll("getField([0-9]+)[(][)]", replaceFN);
										methodBody = methodBody.replaceAll("setField([0-9]+)[(]", replaceFN + " = (");
										methodBody = methodBody.replace("return " + p1 + ".",
												"return ((" + s5 + ")" + p1 + ").");
										final CtCodeSnippetStatement cds = codeFactory()
												.createCodeSnippetStatement(methodBody);
										statements.add(cds);
									}
									// final CtBlock<?> createCtBlock =
									// codeFactory().createCtBlock(createCodeSnippetStatement);
									// createCtBlock.setImplicit(true);
									// m.setBody(createCtBlock);
									printNode("NOkill " + cn, "" + o, 0);
									continue;
								}
								deletedStatements.add(m);
								printNode(best.getDeclaringType().getQualifiedName() + " kill " + cn, "" + o, 0);
							}
						}
					}
				}
			}
		}

		/**
		 * TODO Describe the purpose of this method.
		 * 
		 * @return
		 */
		CodeFactory codeFactory() {
			Factory factory = getFactory();
			return factory.Code();
		}

		/**
		 * TODO Describe the purpose of this method.
		 */
		void collectFields() {
			for (final String name : fieldData.keySet()) {
				getSpoonField(name).collectFieldAssignments();
			}
		}

		/**
		 * TODO Describe the purpose of this method.
		 */
		void commentsToAnnotations() {
			CtType t = mainType;

			for (CtTypeMember declaration : (List<CtTypeMember>) t.getTypeMembers()) {
				if (!checkDeclaredHere(t, declaration)) {
					declaration.setParent(t);
					if (!checkDeclaredHere(t, declaration))
						declaration.setParent(t);
				}
				if (isGone(declaration))
					continue;

				commentsToAnnotations(declaration);
			}
		}

		/**
		 * TODO Describe the purpose of this method.
		 * 
		 * @param declaration
		 */
		void commentsToAnnotations(CtElement declaration) {
			// TODO Auto-generated method stub
			List<String> comments = new ArrayList<String>();
			for (CtComment cmt : declaration.getComments()) {
				final String content = toCommentString(cmt);
				if (content == null || content.length() == 0)
					continue;
				comments.add(content);
			}
			String mnul = MaybeTrim(declaration.getDocComment());
			if (mnul != null) {
				comments.add(0, mnul);
			}

			if (comments.size() > 0) {
				String buffer = "";
				for (Iterator iterator = comments.iterator(); iterator.hasNext();) {
					String string = (String) iterator.next();
					if (string.toLowerCase().contentEquals("definitions"))
						continue;
					if (buffer.contains(string))
						continue;
					buffer += "\n" + string;
				}
				if (buffer.length() == 0)
					return;
				buffer = buffer.substring(1).trim();
				if (buffer.length() == 0)
					return;
				final CtAnnotation createAnnotation = codeFactory()
						.createAnnotation(codeFactory().createCtTypeReference(LispMethod.class));
				createAnnotation.addValue("comment", buffer);
				declaration.addAnnotation(createAnnotation);
			}

		}

		/**
		 * TODO Describe the purpose of this method.
		 * 
		 * @param body
		 * @param s
		 * @return
		 */
		boolean containsStatement(CtType t, final List<CtStatement> body, CtStatement s) {
			if (body.contains(s))
				return true;
			String from = "" + body;
			from = removePacakges(t, from);
			String es = "" + s;
			es = removePacakges(t, es);
			if (from.contains(es))
				return true;
			return false;
		}

		/**
		 * TODO Describe the purpose of this method.
		 * 
		 * @param mainType2
		 * @param findMethod
		 * @return
		 */
		int getMemberIndex(CtType t, CtTypeMember findMethod) {
			if (findMethod == null)
				return 0;
			int index = 0;
			for (CtTypeMember m : (List<CtTypeMember>) t.getTypeMembers()) {
				if (findMethod == m) {
					return index;
				}
				index++;
			}
			return -1;
		}

		/**
		 * TODO Describe the purpose of this method.
		 * 
		 * @param field
		 * @return
		 */
		SpoonFieldInfo getSpoonField(String field) {
			SpoonFieldInfo o = fieldData.get(field);
			if (o == null) {
				o = new SpoonFieldInfo();
				fieldData.put(field, o);
			}
			return o;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see spoon.processing.Processor#process(spoon.reflect.declaration.CtElement)
		 */

		/**
		 * TODO Describe the purpose of this method.
		 */
		void guessMainType() {
			int sz = seenTypes.size();
			for (CtType t : seenTypes) {
				mainType = t;
			}
			for (CtType t : seenTypes) {
				if (!t.getQualifiedName().contains("cycjava_"))
					mainType = t;
			}
			mainType.getQualifiedName();
		}

		/**
		 * TODO Describe the purpose of this method.
		 */
		void mergeEquivalentFields() {
			if (true)
				return;
			for (final CtField field : classFields) {
				CtExpression e = field.getAssignment();
				if (e == null)
					continue;
				String oldName = field.getSimpleName();
				String s = withoutRenames(e);
				String newName = fieldValue2FieldName.get(s);
				if (newName == null) {
					fieldValue2FieldName.put(s, oldName);
				} else {
					if (betterNameThan(oldName, newName)) {
						fieldValue2FieldName.put(s, oldName);
						String on = oldName;
						oldName = newName;
						newName = on;
					}
					if (false) {
						if (noAssignFields.contains(oldName))
							noAssignFields.add(newName);
						deleted.add(oldName);
						renames.put(oldName, newName);
					}
					betterNames.put(oldName, newName);
				}
			}
		}

		/**
		 * TODO Describe the purpose of this method.
		 */
		void mergeEquivalentMethods() {
			for (CtMethod m : ((Set<CtMethod<?>>) mainType.getMethods())) {
				String name = m.getSimpleName();
				if (name.endsWith("_alt")) {
					String unalt = name.substring(0, name.length() - 4);
					List m2 = mainType.getMethodsByName(name);
					if (m2.size() != 1) {
						continue;
					}
					CtMethod m3 = (CtMethod) m2.get(0);
					String msrc1 = localComparable(withoutRenames(m.getBody()));
					String msrc3 = localComparable(withoutRenames(m3.getBody()));
					if (msrc1.contentEquals(msrc3)) {
						deletedStatements.add(m);
						m.delete();
						// breakPoint();
					}
				}
			}
			// TODO Auto-generated method stub

		}

		/**
		 * TODO Describe the purpose of this method.
		 * 
		 * @param t
		 * @param es
		 * @return
		 */
		static String removePacakges(CtType t, String es) {
			es = es.replace(".cycjava_2.", ".cycjava.");
			es = replaceAll(es, t.getQualifiedName() + ".", "");
			final String qualifiedName = t.getPackage().getQualifiedName().replace(".cycjava_2.", ".cycjava.");
			es = replaceAll(es, qualifiedName + ".", "");
			es = replaceAll(es, "_alt", "");
			es = replaceAll(es, t.getSimpleName() + ".", "");
			es = replaceAll(es, ".", "");
			return es;
		}

		/**
		 * TODO Describe the purpose of this method.
		 * 
		 * @param ctClass
		 */
		void scanClass(final CtType<?> ctClass) {
			// if (copyOf == null)
			// copyOf = copyType(ctClass.getTopLevelType());

			for (final CtFieldReference<?> o : ctClass.getDeclaredFields()) {
				CtField<?> declaration = o.getDeclaration();
				if (declaration.isStatic()) {
					if (declaration.getDeclaringType() == ctClass) {
						putField(declaration.getSimpleName(), declaration, declaration.getAssignment());
					}
				}
			}
			new CtScanner() {

				@Override
				public void visitCtAssignment(CtAssignment assignement) {

					final CtElement refType = assignement.getAssigned();
					if (refType instanceof CtFieldWrite) {
						CtFieldReference reference = ((CtFieldWrite) refType).getVariable();
						final CtField declaration = reference.getFieldDeclaration();
						if (declaration != null && declaration.getDeclaringType() == ctClass
								&& declaration.isStatic()) {
							String name = declaration.getSimpleName();
							putField(name, declaration, assignement.getAssignment());
						}
					}
					super.visitCtAssignment(assignement);
				}

//				@Override
//				public <R> void visitCtBlock(CtBlock<R> block) {
//					// TODO Auto-generated method stub
//					super.visitCtBlock(block);
//					int blockz = 0;
//					int all = 0;
//					for (CtStatement ct : block.getStatements()) {
//						if (ct instanceof CtBlock) {
//							blockz++;
//							// ct.setImplicit(true);
//						}
//						all++;
//					}
//					if (all == 1 && blockz == 1) {
//						// block.setImplicit(true);
//					}
//				}

				@Override
				public <T extends Object> void visitCtField(spoon.reflect.declaration.CtField<T> f) {
					final CtField<T> declaration = f;
					if (declaration != null) {
						if (declaration.isStatic()) {
							CtType declaringType = declaration.getDeclaringType();
							if (declaringType == ctClass) {
								if (declaringType.isTopLevel()) {
									classFields.add(f);
									putField(f.getSimpleName(), f, f.getAssignment());
								}
							}
						}
					}
					super.visitCtField(f);
				}

				@Override
				public <T> void visitCtExecutableReference(CtExecutableReference<T> reference) {
					if (reference.isStatic()) {
						CtTypeReference<?> imported = reference.getDeclaringType();
						if (imported != null && imported != ctClass) {
							Factory factory = getFactory();
							final CtTypeMemberWildcardImportReference e = factory
									.createTypeMemberWildcardImportReference(imported);
							final CtImport ctImportImpl = factory.createImport(e);
							extraImports.add(ctImportImpl);
						}
					}
					super.visitCtExecutableReference(reference);
				}

				@Override
				public <T> void visitCtFieldReference(CtFieldReference<T> reference) {
					final CtField<T> declaration = reference.getFieldDeclaration();
					if (declaration != null) {
						if (declaration.isStatic()) {
							CtType declaringType = declaration.getDeclaringType();
							if (declaringType != null) {
								if (declaringType.isTopLevel()) {
									CtTypeReference imported = declaringType.getReference();
									if (imported != null && imported != ctClass) {
										Factory factory = getFactory();
										final CtTypeMemberWildcardImportReference e = factory
												.createTypeMemberWildcardImportReference(imported);
										final CtImport ctImportImpl = factory.createImport(e);
										extraImports.add(ctImportImpl);
									}
									// extraImports.add(factory.createImport(imported));
								}
							}
						}
					}
					super.visitCtFieldReference(reference);
				}

				// @Override
//				public void visitCtAnonymousExecutable(CtAnonymousExecutable anonymousExec) {
//					if (anonymousExec.isStatic()) {
//						if (anonymousExec.getDeclaringType() == ctClass) {
//							initialStatements.addAll(anonymousExec.getBody().getStatements());
//						}
//					}
//					super.visitCtAnonymousExecutable(anonymousExec);
//				};
				@Override
				public <T> void visitCtInvocation(CtInvocation<T> invocation) {
					super.visitCtInvocation(invocation);
					final CtExecutableReference<T> executable = invocation.getExecutable();
					if (!executable.isStatic())
						return;
					CtTypeReference<?> imported = executable.getDeclaringType();
					Factory factory = getFactory();
					if (imported != null) {
						final CtTypeMemberWildcardImportReference e = factory
								.createTypeMemberWildcardImportReference(imported);
						final CtImport ctImportImpl = factory.createImport(e);
						extraImports.add(ctImportImpl);
					}
				}

				@Override
				public <T> void visitCtMethod(spoon.reflect.declaration.CtMethod<T> m) {
					for (final Object o : m.getAnnotations().toArray()) {
						final CtAnnotation annotation = (CtAnnotation) o;
						if (annotation.getType().getSimpleName().equals("SubL")) {
							transferComments(annotation, m);
							m.removeAnnotation(annotation);
						}
					}
					super.visitCtMethod(m);
				}

			}.scan(ctClass);

		}

		/**
		 * TODO Describe the purpose of this method.
		 * 
		 * @param ctClass
		 */
		void scanElements(CtType<?> ctClass) {
			if (seenTypes.add(ctClass)) {
				for (final CtFieldReference<?> o : ctClass.getDeclaredFields()) {
					CtField<?> declaration = o.getDeclaration();
					if (declaration.isStatic()) {
						if (declaration.getDeclaringType() == ctClass) {
							classFields.add(declaration);
							for (final Object a : declaration.getAnnotations().toArray()) {
								final CtAnnotation annotation = (CtAnnotation) a;
								if (annotation.getType().getSimpleName().equals("SubL")) {
									transferComments(annotation, declaration);
									declaration.removeAnnotation(annotation);
								}
							}
						}
					}
				}
				for (final CtExecutableReference<?> o : ctClass.getDeclaredExecutables()) {
					CtExecutable<?> declaration = o.getDeclaration();
					if (o.isStatic()) {
						if (o.getDeclaringType() == ctClass) {
							Collection c = classMethods.get(declaration.getSimpleName());
							if (c == null) {
								classMethods.put(declaration.getSimpleName(), c);
							}
							c.add(declaration);
							for (final Object a : declaration.getAnnotations().toArray()) {
								final CtAnnotation annotation = (CtAnnotation) a;
								if (annotation.getType().getSimpleName().equals("SubL")) {
									transferComments(annotation, declaration);
									declaration.removeAnnotation(annotation);
								}
							}

						}
					}
				}
			}
		}

		/**
		 * TODO Describe the purpose of this method.
		 * 
		 * @param t
		 */
		void transferFieldsFrom(CtType t) {
			for (CtField<?> declaration : (Collection<CtField<?>>) t.getFields()) {
				if (declaration.isStatic()) {
					if (declaration.getDeclaringType() != t)
						continue;
					final String simpleName = declaration.getSimpleName();
					final CtField findCtField = mainType.getField(simpleName);
					if (findCtField == null) {
						if (isGone(declaration))
							continue;
						final CtField<?> clone = declaration.clone();
						if (simpleName.endsWith("$")) {
							mainType.addFieldAtTop(clone);
						} else {
							mainType.addField(clone);
						}
					} else {
						transferComments(declaration, findCtField);
						deletedStatements.add(declaration);
						this.classFields.remove(declaration);
					}
				}
			}
		}

		/**
		 * TODO Describe the purpose of this method.
		 * 
		 * @param t
		 */
		void transferInnerClasses(CtType t) {
			for (CtType<?> declaration : (Collection<CtType<?>>) t.getNestedTypes()) {
				if (declaration.isStatic()) {
					if (isGone(declaration))
						continue;
					final CtType findCtField = mainType.getNestedType(declaration.getSimpleName());
					if (findCtField == null) {
						mainType.addTypeMemberAt(0, declaration.clone());
					} else {
						transferComments(declaration, findCtField);
					}
				}
			}
		}

		/**
		 * TODO Describe the purpose of this method.
		 */
		void transferMembers() {
			for (CtType t : seenTypes) {
				if (mainType != t) {
					transferComments(t, mainType);
					transferInnerClasses(t);
					transferFieldsFrom(t);
				}
			}
		}

		/**
		 * TODO Describe the purpose of this method.
		 * 
		 * @param t
		 */
		void transferMethodsFrom(CtType t) {
			String tsn = "_" + t.getSimpleName() + "_file";

			for (CtMethod<?> declaration : (Set<CtMethod<?>>) t.getMethods()) {
				if (!declaration.isStatic())
					continue;
				if (isGone(declaration))
					continue;

				final String simpleName = declaration.getSimpleName();
				final int paramLen = declaration.getParameters().size();

				int insertAt = -1;
				final CtMethod<Object> findMethod = findMethod(mainType, simpleName, paramLen);

				boolean doRename = true;
				if (findMethod == null) {
					doRename = false;
					final CtMethod findMethod2 = findMethod(mainType, simpleName, -1);
					insertAt = getMemberIndex(mainType, findMethod2);
				} else {
					if (paramLen == 0) {
						Factory factory = getFactory();
						if (simpleName.endsWith(tsn)) {
							CtReturn ret1 = null;
							CtReturn ret2 = null;
							CtBlock oldBody = findMethod.getBody();
							final List<CtStatement> body = oldBody.getStatements();
							for (CtStatement s : body) {
								if (s instanceof CtReturn) {
									ret1 = (CtReturn) s;
									continue;
								}
							}
							List<CtStatement> changes = new ArrayList<CtStatement>();
							final CtBlock<?> body2 = declaration.getBody();
							for (CtStatement s : body2.getStatements()) {
								if (s instanceof CtReturn) {
									ret2 = (CtReturn) s;
									continue;
								}
								if (!containsStatement(t, body, s)) {
									changes.add(s);
								}
							}
							if (changes.size() == 0) {
								// deletedStatements.add(declaration);
								continue;
							}
							CtMethod copy = copyMethod(findMethod);

							CtIf ifs = factory.createIf();
							ifs.setThenStatement(oldBody);
							ifs.setCondition(codeFactory().createCodeSnippetExpression("SubLFiles.USE_V1"));
							CtBlock nextBody = factory.createBlock();
							for (CtStatement s : changes) {
								nextBody.addStatement(s.clone());
							}
							CtIf ifs2 = factory.createIf();
							ifs2.setThenStatement(nextBody);
							ifs2.setCondition(codeFactory().createCodeSnippetExpression("SubLFiles.USE_V2"));

							CtBlock fullBody = factory.createBlock();
							fullBody.addStatement(ifs);
							fullBody.addStatement(ifs2);
							CtReturn ret = null;
							if (ret1 != null) {
								ret = ret1.clone();
								ret1.delete();
								deletedStatements.add(ret1);
							}
							if (ret2 != null && ret == null) {
								ret = ret2.clone();
							}
							if (ret != null) {
								fullBody.addStatement(ret);
							}
							findMethod.setBody(fullBody);
							printNode("" + tsn, "" + fullBody, 0);
							doRename = true;
						}
					}
					insertAt = getMemberIndex(mainType, findMethod);
					transferComments(findMethod, declaration);
					transferComments(declaration, findMethod);
					if (isGone(findMethod)) {
						mainType.removeMethod(findMethod);
						doRename = false;
					}
				}
				declaration = declaration.clone();
				if (doRename)
					declaration.setSimpleName(simpleName + "_alt");

				if (insertAt == -1) {
					mainType.addTypeMember(declaration);
				} else {
					mainType.addTypeMemberAt(insertAt, declaration);

				}
			}
		}

		/**
		 * TODO Describe the purpose of this method.
		 * 
		 * @param name
		 * @param declaration
		 * @param assignment
		 */
		protected void putField(String name, CtField declaration, CtExpression assignment) {
			SpoonFieldInfo info = getSpoonField(name);
			info.mergedFields.add(declaration);
			info.addAssignment(assignment);

		}

		public class SpoonFieldInfo {
			HashSet allAssignments2;
			Set<CtField> mergedFields = new HashSet<CtField>();
			final HashSet<CtExpression> allAssignments = new HashSet<CtExpression>(40);

			/**
			 * TODO Describe the purpose of this method.
			 * 
			 * @param assignment
			 */
			public void addAssignment(CtExpression assignment) {
				if (assignment != null) {
					if (assignment instanceof CtLiteral) {
						if (((CtLiteral) assignment).getValue() == null) {
							return;
						}
					}
					allAssignments.add(assignment);
				}

			}

			/**
			 * TODO Describe the purpose of this method.
			 * 
			 * @param field
			 * @return
			 */
			public void collectFieldAssignments() {
				for (CtField field : mergedFields) {
					for (final Object o : field.getAnnotations().toArray()) {
						final CtAnnotation annotation = (CtAnnotation) o;
						if (annotation.getType().getSimpleName().equals("SubL")) {
							transferComments(annotation, field);
							field.removeAnnotation(annotation);
						}
					}
				}
				allAssignments2 = new HashSet();
				allAssignments2.addAll(allAssignments);
				final Object[] expressionArray = allAssignments.toArray();
				for (Object o : expressionArray) {
					final CtExpression fassignment = (CtExpression) o;
					boolean seenSelf = false;
					for (Object o2 : expressionArray) {
						if (o == o2) {
							seenSelf = true;
						} else if (seenSelf) {
							final CtExpression fassignment2 = (CtExpression) o;
							String fassignmentS = "" + fassignment;
							String fassignmen2S = "" + fassignment2;
							if (fassignmen2S.contentEquals(fassignmentS)) {
								allAssignments.remove(o2);
							}
						}
					}
				}
				for (CtField field : mergedFields) {
					final CtExpression fassignment = field.getAssignment();
					final Set<ModifierKind> modifiers = field.getModifiers();
					final String simpleName = field.getSimpleName();
					final int assignPaths = allAssignments.size();
					if (assignPaths == 1) {
						final CtExpression expression = allAssignments.iterator().next();
						final CtElement parent = expression.getParent();
						final CtElement e = asStatement(parent);
						final CtElement eparent = getParent(e);
						final CtElement egrandparent = getParent(eparent);
						if (fassignment == null) {
							if (egrandparent != null && egrandparent instanceof CtAnonymousExecutable) {
								final CtExpression clone = expression.clone();
								// if (DEBUG_LEVEL > 2) {
								// final String ps = withoutRenames(egrandparent);
								// e.delete();
								// final String ps2 = withoutRenames(egrandparent);
								// if (ps2.equals(ps)) {
								// new RuntimeException("Unchanged").printStackTrace();
								// printNode("BUG/OLD: " + field, ps, 1000);
								// printNode("BUG/NEW: " + field, ps2, 1000);
								// }
								// } else {
								// e.delete();
								// }
								field.setDefaultExpression(clone);
								deletedStatements.add(e);

								modifiers.add(ModifierKind.FINAL);
								field.setModifiers(modifiers);
								noAssignFields.add(simpleName);
								// noAssignBody.add(simpleName);
								continue;
							} else {
								if (modifiers.add(ModifierKind.VOLATILE)) {
									field.setModifiers(modifiers);
								}
							}
						} else {

							// modifiers.add(ModifierKind.FINAL);
						}
						noAssignFields.remove(simpleName);
						if (!modifiers.contains(ModifierKind.VOLATILE)) {
							modifiers.add(ModifierKind.FINAL);
						}
						field.setModifiers(modifiers);
						final CtField fieldDeclaration = field;
						CtExpression expr = fieldDeclaration.getAssignment();
						String method = getInvokation(expression);
						String lit = toAssignedLiteral(expression);
						if (expr == null) {
							expr = fieldDeclaration.getDefaultExpression();
						}
						boolean isNull = (expr == null);
						if (expr instanceof CtLiteral) {
							Object o = ((CtLiteral) expr).getValue();
							isNull = (o == null);
						}

						if (isNull) {
							Factory factory = getFactory();
							if (method == null) {
								field.setAssignment(expression);
							} else if (method.startsWith("def")) {
								CtExpression cte = factory.Code()
										.createCodeSnippetExpression("makeSymbol(\"" + lit + "\")");
								field.setAssignment(cte);
								noAssignFields.add(simpleName);
								field.addComment(factory.Code().createComment(method, CommentType.INLINE));
								if (modifiers.add(ModifierKind.FINAL)) {
									modifiers.remove(ModifierKind.VOLATILE);
									field.setModifiers(modifiers);
								}
							}
						}

						continue;

					} else if (assignPaths == 0) {
						Factory factory = getFactory();
						field.addComment(factory.Code().createComment("@TODO assignPaths == 0 ??", CommentType.INLINE));
						if (modifiers.add(ModifierKind.TRANSIENT)) {
							field.setModifiers(modifiers);
						}
						if (fassignment == null) {
							// field.setAssignment(field.getFactory().createCodeSnippetExpression("null"));
						} else {
							// field.setAssignment(fassignment);
						}
						if (modifiers.add(ModifierKind.FINAL)) {
							field.setModifiers(modifiers);
						}
					} else {
						if (modifiers.add(ModifierKind.VOLATILE)) {
							field.setModifiers(modifiers);
						}
						Factory factory = getFactory();
						if (assignPaths != 2)
							field.addComment(factory.createComment("AssignPaths == " + assignPaths, CommentType.FILE));
						if (fassignment == null) {
							for (final CtExpression expression : allAssignments) {
								final CtElement parent = expression.getParent();
								final CtElement e = asStatement(parent);
								final CtElement eparent = getParent(e);
								final CtElement egrandparent = getParent(eparent);
								if (egrandparent != null && egrandparent instanceof CtAnonymousExecutable) {
									final CtExpression clone = expression.clone();
									if (DEBUG_LEVEL > 2) {
										final String ps = withoutRenames(egrandparent);
										e.delete();
										final String ps2 = withoutRenames(egrandparent);
										if (ps2.equals(ps)) {
											new RuntimeException("Unchanged").printStackTrace();
											printNode("BUG/OLD: " + field, ps, 1000);
											printNode("BUG/NEW: " + field, ps2, 1000);
										}
									} else {
										e.delete();
									}
									field.setDefaultExpression(clone);
									if (modifiers.add(ModifierKind.TRANSIENT)) {
										field.setModifiers(modifiers);
									}
								} else {
									String content = "" + expression;
									content = content.replaceAll("[,\")(.]+", " ");
									field.addComment(factory.createComment(content, CommentType.FILE));
									continue;
								}
							}
							// field.setAssignment(field.getFactory().createCodeSnippetExpression("null"));
						} else {
							// field.setAssignment(fassignment);
						}
					}
				}
				for (CtField field : mergedFields) {
					for (CtField field2 : mergedFields) {
						if (field != field2) {
							transferComments(field2, field);
							Set m = field.getModifiers();
							Set m2 = field2.getModifiers();
							m.addAll(m2);
							field.setModifiers(m);
						}
					}
				}
				for (CtField field : mergedFields) {
					cleanupModifiers(field);
				}
			}

			/**
			 * TODO Describe the purpose of this method.
			 * 
			 * @return
			 */
			public Set<ModifierKind> isPublic() {
				CtField some = null;
				for (CtField ctField : mergedFields) {
					if (ctField.isPublic())
						return ctField.getModifiers();
					some = ctField;
				}
				if (some != null)
					return some.getModifiers();
				return null;

			}

		}

	}

}
