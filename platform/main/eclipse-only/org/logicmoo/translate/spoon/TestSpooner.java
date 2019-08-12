package org.logicmoo.translate.spoon;

import static java.nio.file.FileVisitResult.*;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.MalformedURLException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.armedbear.lisp.Interpreter;
import org.armedbear.lisp.Lisp;
import org.logicmoo.system.BeanShellCntrl;
import org.logicmoo.system.IOUtils;

import com.cyc.cycjava.cycl.*;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.cycjava.cycl.sbhl.sbhl_iteration;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import spoon.Launcher;
import spoon.SpoonException;
import spoon.compiler.Environment;
import spoon.processing.AbstractProcessor;
import spoon.refactoring.CtRenameLocalVariableRefactoring;
import spoon.refactoring.RefactoringException;
import spoon.reflect.code.*;
import spoon.reflect.code.CtComment.CommentType;
import spoon.reflect.declaration.*;
import spoon.reflect.factory.CodeFactory;
import spoon.reflect.factory.Factory;
import spoon.reflect.reference.CtExecutableReference;
import spoon.reflect.reference.CtFieldReference;
import spoon.reflect.reference.CtReference;
import spoon.reflect.reference.CtTypeMemberWildcardImportReference;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.*;
import spoon.reflect.visitor.PrintingContext.Writable;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.reflect.visitor.printer.CommentOffset;
import spoon.support.compiler.jdt.JDTBasedSpoonCompiler;
import spoon.template.Local;
import spoon.template.Parameter;
import spoon.template.Template;

/**
 * Created by nicolas on 18/11/2014.
 */
public class TestSpooner {

    /**
     * TODO Describe the purpose of this method.
     * @param ctComment
     * @return
     */
    @LispMethod(comment = "interesting stuff")
    public static String getContent(CtComment ctComment) {
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
     * @param s
     * @return
     */
    private static String MaybeTrim(String s) {
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

    static int DEBUG_LEVEL = 1;
    static int PROCESS_LEVEL = 2;
    static int SAFETY_LEVEL = 1;
    public static final Map<String, String> NO_RENAMES = new HashMap<String, String>();
    private static Launcher launcher;
    private static File dest;

    /**
     * A {@code FileVisitor} that finds
     * all files that match the
     * specified pattern.
     */
    public static class Finder extends SimpleFileVisitor<Path> {

	private final PathMatcher matcher;
	private final int max;
	private int numMatches = 0;
	private final String pattern2;
	final boolean doRecurse;

	Finder(String pattern, String pattern2, int max, boolean recurse) {
	    this.max = max;
	    this.pattern2 = pattern2;
	    doRecurse = recurse;
	    matcher = FileSystems.getDefault().getPathMatcher("glob:" + pattern);

	}

	// Compares the glob pattern against
	// the file or directory name.
	void find(Path file) {
	    final Path name = file.getFileName();
	    final String string = file.toString();
	    String stem = string;
	    stem = stem.substring(Math.min(pattern2.length(), stem.length()));
	    if (name != null && matcher.matches(name)) {
		if (new File(dest, stem).exists()) {
		    if (PROCESS_LEVEL > 2)
			return;
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

	/**
	 * TODO Describe the purpose of this method.
	 * @return
	 */
	private boolean noMore() {
	    return numMatches >= max;
	}

	// Prints the total number of
	// matches to standard out.
	void done() {
	    System.out.println("Matched: " + numMatches);
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

	// Invoke the pattern matching
	// method on each directory.
	@Override
	public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
	    find(dir);
	    if (noMore())
		return TERMINATE;
	    return CONTINUE;
	}

	@Override
	public FileVisitResult visitFileFailed(Path file, IOException exc) {
	    System.err.println(exc);
	    return CONTINUE;
	}
    }

    static boolean SMALL_SANITY_CHECK = false;

    public static void main(String[] args) throws IOException {

	launcher = new Launcher();
	final Environment environment = launcher.getEnvironment();
	dest = new File("../eclipse-workspace/cycjava_new/server-out/");
	dest.mkdirs();
	launcher.setSourceOutputDirectory(dest);

	launcher.addInputResource("main/logicmoo-main/org/logicmoo/translate/spoon/spoon_test.java");

	if (SMALL_SANITY_CHECK) {
	    // launcher.addInputResource("main/logicmoo-main/org/logicmoo/translate/spoon/spoon_test.java");
	} else {
	    environment.setIgnoreDuplicateDeclarations(true);
	    // launcher.addInputResource("src/com/cyc/tool/subl/jrtl/translatedCode/sublisp/");
	    //launcher.addInputResource("src/com/cyc/tool/subl/jrtl/translatedCode_2/sublisp/");
	}

	if (SMALL_SANITY_CHECK) {
	    launcher.addInputResource("main/server-4q/com/cyc/cycjava_2/cycl/arity.java");
	    launcher.addInputResource("main/server-4q-works-2/com/cyc/cycjava/cycl/arity.java");
	} else {
	    environment.setIgnoreDuplicateDeclarations(true);
	    launcher.addInputResource("main/server-4q/com/cyc/cycjava/cycl/system_parameters.java");
	    launcher.addInputResource("main/server-4q/com/cyc/cycjava_2/cycl/system_parameters.java");
	    launcher.addInputResource("main/server-4q/com/cyc/cycjava/cycl/assertion_utilities.java");
	    launcher.addInputResource("main/server-4q/com/cyc/cycjava_2/cycl/assertion_utilities.java");
	    addInputResourceMask("main/server-4q/com/cyc/", "*vars.java", 4099999, true);
	    addInputResourceMask("main/server-4q/com/cyc/", "mt*.java", 4099999, true);
	    addInputResourceMask("main/server-4q/com/cyc/", "*test*.java", 4099999, true);
	    addInputResourceMask("main/server-4q/com/cyc/", "*param*.java", 4099999, true);
	    addInputResourceMask("main/server-4q/com/cyc/cycjava_2/cycl/", "a*.java", 4099999, false);
	    addInputResourceMask("main/server-4q/com/cyc/cycjava/cycl/", "cl*.java", 4099999, false);
	    addInputResourceMask("main/server-4q/com/cyc/cycjava_2/cycl/", "cl*.java", 4099999, false);
	    addInputResourceMask("main/server-4q/com/cyc/cycjava/cycl/", "con*.java", 4099999, false);
	    addInputResourceMask("main/server-4q/com/cyc/cycjava_2/cycl/", "con*.java", 4099999, false);
	    addInputResourceMask("main/server-4q/com/cyc/cycjava/cycl/", "obj*.java", 4099999, false);
	    addInputResourceMask("main/server-4q/com/cyc/cycjava_2/cycl/", "obj*.java", 4099999, false);
	    //
	    addInputResourceMask("main/server-4q/com/cyc/cycjava/cycl/", "method*.java", 4099999, false);
	    addInputResourceMask("main/server-4q/com/cyc/cycjava_2/cycl/", "method*.java", 4099999, false);
	    //
	    launcher.addInputResource("main/server-4q/com/cyc/cycjava/cycl/inference/");
	    launcher.addInputResource("main/server-4q/com/cyc/cycjava_2/cycl/inference/");
	    //
	    //	    launcher.addInputResource("main/server-4q/com/cyc/cycjava/cycl/inference/harness/inference_datastructures_problem_store.java");
	    //	    launcher.addInputResource("main/server-4q/com/cyc/cycjava_2/cycl/inference/harness/inference_datastructures_problem_store.java");
	    //	    launcher.addInputResource("main/server-4q/com/cyc/cycjava/cycl/arity.java");
	    //	    launcher.addInputResource("main/server-4q/com/cyc/cycjava_2/cycl/arity.java");
	    //	    launcher.addInputResource("main/server-4q/com/cyc/cycjava/cycl/agenda.java");
	    //	    launcher.addInputResource("main/server-4q/com/cyc/cycjava_2/cycl/agenda.java");
	    //	    launcher.addInputResource("main/server-4q/com/cyc/cycjava/cycl/inference/harness/");
	    //	    launcher.addInputResource("main/server-4q/com/cyc/cycjava_2/cycl/inference/harness/");

	    launcher.addInputResource("main/server-4q/com/cyc/");
	    //launcher.addInputResource("main/server-4q-works-2/com/cyc/cycjava/cycl/agenda.java");
	    // launcher.addInputResource("main/server-4t/com/cyc/cycjava_3/cycl/agenda.java");
	    //launcher.addInputResource("main/server-4q-works-2/com/cyc/cycjava/cycl/");
	    // launcher.addInputResource("main/server-4t/com/cyc/cycjava_3/cycl/");
	    // launcher.addInputResource("main/server-4q/com/cyc/cycjava_2/cycl/");
	    //  launcher.addInputResource("main/server-4q/com/cyc/cycjava/cycl/");
	    // addInputResourceMask("main/server-4q-works-2/", "*.java", 4099999);

	    //main\server-4q\com\cyc\cycjava\cycl\cyclifier.java
	    //launcher.addInputResource("main/server-4u/com/cyc/cycjava_0/cycl/");
	    //launcher.addInputResource("main/server-4v/com/cyc/cycjava/cycl/");
	}

	if (true) {
	    DefaultJavaPrettyPrinter.factoryDJPP = new DefaultJavaPrettyPrinter.JavaPrettyPrinterFactory() {

		@Override
		public DefaultJavaPrettyPrinter createPrettyPrinter(Environment env) {
		    return new MyOutputPrinter(env);
		}
	    };
	}

	// if true, the pretty-printed code is readable without fully-qualified names
	environment.setAutoImports(true);

	readySubLisp();

	if (true) {
	    environment.setPrettyPrinterCreator(() -> {
		return new MyOutputPrinter(environment);
	    });
	}

	//purgeDirectoryButKeepSubDirectories(dest);

	//environment.setInputClassLoader(ClassLoader.getSystemClassLoader());
	launcher.addProcessor(new MergingCodeProcessor());

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
	    //launcher.run();
	    System.exit(0);
	}

    }

    /**
     * TODO Describe the purpose of this method.
     */
    private static void readySubLisp() {
	Lisp.initLisp();
	Interpreter.createBasicInstance();
	BeanShellCntrl.init_subl();
	BeanShellCntrl.init_cyc();
	populateImportedClasses();
    }

    static void purgeDirectoryButKeepSubDirectories(File dir) {
	for (File file : dir.listFiles()) {
	    if (!file.isDirectory()) {
		file.delete();
	    } else {
		purgeDirectoryButKeepSubDirectories(file);
	    }
	}
    }

    /**
     * TODO Describe the purpose of this method.
     * @param string
     * @throws IOException 
     */
    private static void addInputResourceMask(String string) throws IOException {
	final int indexOf = string.indexOf("*");
	String startingDirStr = string.substring(0, indexOf + 1);
	final int endIndex = startingDirStr.lastIndexOf('/') + 1;
	startingDirStr = startingDirStr.substring(0, endIndex);
	final String pattern = string.substring(endIndex);
	addInputResourceMask(startingDirStr, pattern, Integer.MAX_VALUE, true);
    }

    private static void addInputResourceMask(String startingDirStr, String pattern, int max, boolean recurse) throws IOException {
	final Path startingDir = Paths.get(startingDirStr);
	final Finder finder = new Finder(pattern, startingDirStr, max, recurse);
	Files.walkFileTree(startingDir, finder);
	finder.done();
    }

    /**
     * TODO Describe the purpose of this method.
     * @param element
     * @param x
     */
    static void printNode(String header, String x, int len) {
	if (len > 0) {
	    if (x.length() > len - 2)
		x = x.substring(0, len) + "\n    .... \n";
	}
	if (x.contains("\n")) {
	    x = "\n" + x + "\n";
	}
	System.err.println(header + ": " + x);
    }

    static Map<String, SpoonInfo> ctClasses = new HashMap<String, SpoonInfo>();

    public static SpoonInfo findSpoonInfo(CtType<?> t) {
	String qualifiedName = t.getQualifiedName();
	qualifiedName = andOneDot(qualifiedName);
	SpoonInfo info = ctClasses.get(qualifiedName);
	if (info == null) {
	    info = new SpoonInfo(t.getFactory());
	    ctClasses.put(qualifiedName, info);
	} else {
	}
	return info;
    }

    final static IdentitySet deletedStatements = new IdentitySet();

    public static final class MergingCodeProcessor extends AbstractProcessor<CtType<?>> {

	/* (non-Javadoc)
	 * @see spoon.processing.Processor#process(spoon.reflect.declaration.CtElement)
	 */
	@Override
	public void process(CtType<?> ti) {
	    CtType t = ti.getTopLevelType();
	    final SpoonInfo info = findSpoonInfo(t);
	    String qualifiedName = ti.getQualifiedName();
	    printNode("MergingCodeProcessor: ", qualifiedName, 1000);
	    info.processClass(ti);
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

    /**
     * TODO Describe the purpose of this method.
     * @param expression
     * @return
     */
    public static CtElement asStatement(final CtElement expression) {
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

    static CtMethod findMethod(CtType best, String mn, int len) {
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

    static public class SpoonInfo {

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
	    if (mainType != null) {
		String s = "";
		s = "package " + mainType.getPackage() + ";\n";
		return s + mainType.toString();
	    }
	    return super.toString();
	}

	CtExpression MyNil = null;
	HashMap<String, SpoonFieldInfo> fieldData = new HashMap<String, TestSpooner.SpoonInfo.SpoonFieldInfo>();

	/**
	 * TODO Describe the purpose of this method.
	 * @param field
	 * @param annotation
	 */
	static void transferComments(CtElement from, CtElement to) {
	    List<CtComment> already = to.getComments();
	    for (CtComment comment : from.getComments()) {
		String fromC1 = getContent(comment);
		for (CtComment c : already) {
		    String toC1 = getContent(c);
		    if (containsInfo(toC1, fromC1)) {
			comment = null;
			break;
		    }
		}
		if (comment != null) {
		    CtComment cmt = comment.clone();
		    String rawContent = getContent(cmt);
		    if (rawContent != null && rawContent.length() > 0) {
			//			if (rawContent.contains("\n")) {
			//			    cmt.setCommentType(CommentType.JAVADOC);
			//			} else {
			//			    cmt.setCommentType(CommentType.INLINE);
			//			}
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

	/**
	 * TODO Describe the purpose of this method.
	 * @param toC the current comment
	 * @param fromC the new possibly new info
	 * @return
	 */
	private static boolean containsInfo(String toC, String fromC) {
	    if (fromC == null || fromC.length() == 0)
		return true;
	    if (toC == null || toC.length() == 0)
		return false;
	    return toC.replaceAll("[^A-z0-9]", "").contains(fromC.replaceAll("[^A-z0-9]", ""));
	}

	public class SpoonFieldInfo {
	    final HashSet<CtExpression> allAssignments = new HashSet<CtExpression>(40);
	    private Set<CtField> mergedFields = new HashSet<CtField>();
	    private HashSet allAssignments2;

	    /**
	     * TODO Describe the purpose of this method.
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
				//			    if (DEBUG_LEVEL > 2) {
				//				final String ps = withoutRenames(egrandparent);
				//				e.delete();
				//				final String ps2 = withoutRenames(egrandparent);
				//				if (ps2.equals(ps)) {
				//				    new RuntimeException("Unchanged").printStackTrace();
				//				    printNode("BUG/OLD: " + field, ps, 1000);
				//				    printNode("BUG/NEW: " + field, ps2, 1000);
				//				}
				//			    } else {
				//				e.delete();
				//			    }
				field.setDefaultExpression(clone);
				deletedStatements.add(e);

				modifiers.add(ModifierKind.FINAL);
				field.setModifiers(modifiers);
				noAssignFields.add(simpleName);
				//noAssignBody.add(simpleName);
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
			String lit = getAssignmentLiteral(expression);
			if (expr == null) {
			    expr = fieldDeclaration.getDefaultExpression();
			}
			boolean isNull = (expr == null);
			if (expr instanceof CtLiteral) {
			    Object o = ((CtLiteral) expr).getValue();
			    isNull = (o == null);
			}

			if (isNull) {
			    if (method == null) {
				field.setAssignment(expression);
			    } else if (method.startsWith("def")) {
				CtExpression cte = factory.Code().createCodeSnippetExpression("makeSymbol(\"" + lit + "\")");
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
			    //field.setAssignment(field.getFactory().createCodeSnippetExpression("null"));
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

	/**
	 * TODO Describe the purpose of this method.
	 * @param field
	 * @return 
	 */
	private SpoonFieldInfo getSpoonField(String field) {
	    SpoonFieldInfo o = fieldData.get(field);
	    if (o == null) {
		o = new SpoonFieldInfo();
		fieldData.put(field, o);
	    }
	    return o;
	}

	//private CtType ctClass; 
	final IdentitySet<CtType> seenTypes = new IdentitySet<CtType>();
	//final HashMap<CtMethod, Collection<CtElement>> methods = new HashMap<CtMethod, Collection<CtElement>>();
	//final HashMap<String, Collection<CtField>> fields = new HashMap<String, Collection<CtField>>();
	final HashMap<String, Collection<CtExecutable>> classMethods = new HashMap<String, Collection<CtExecutable>>();
	final HashSet<String> noAssignFields = new HashSet<String>();
	final HashSet<String> noAssignBody = new HashSet<String>();
	final IdentitySet<CtField> classFields = new IdentitySet<CtField>();
	public Set<String> deleted = new HashSet<String>();

	private final Factory factory;

	public Map<String, String> renames = new HashMap<String, String>();
	public Map<String, String> inlinedName = new HashMap<String, String>();

	//CtType copyOf;
	HashSet<CtImport> extraImports = new HashSet();
	private Set<CtType> innerTypes = new IdentitySet();
	private CtType mainType;

	/**
	 * TODO Describe this constructor.
	 * @param ctClass2
	 */
	public SpoonInfo(Factory f) {
	    factory = f;
	    MyNil = null;//f.Code().createCodeSnippetExpression("NIL");
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
	    commentsToAnnotations();
	}

	/**
	 * TODO Describe the purpose of this method.
	 */
	private void commentsToAnnotations() {
	    CtType t = mainType;

	    for (CtTypeMember declaration : (List<CtTypeMember>) t.getTypeMembers()) {
		if (!checkDeclaredHere(t, declaration)) {
		    declaration.setParent(t);
		    if (!checkDeclaredHere(t, declaration))
			declaration.setParent(t);
		}
		if (deletedStatements.contains(declaration))
		    continue;

		commentsToAnnotations(declaration);
	    }
	}

	/**
	 * TODO Describe the purpose of this method.
	 * @param declaration
	 */
	private void commentsToAnnotations(CtElement declaration) {
	    // TODO Auto-generated method stub
	    List<String> comments = new ArrayList<String>();
	    for (CtComment cmt : declaration.getComments()) {
		final String content = getContent(cmt);
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
		final CtAnnotation createAnnotation = codeFactory().createAnnotation(codeFactory().createCtTypeReference(LispMethod.class));
		createAnnotation.addValue("comment", buffer);
		declaration.addAnnotation(createAnnotation);
	    }

	}

	/**
	 * TODO Describe the purpose of this method.
	 * @return
	 */
	private CodeFactory codeFactory() {
	    return factory.Code();
	}

	/**
	 * TODO Describe the purpose of this method.
	 * @param t
	 * @param declaration
	 * @return
	 */
	private boolean checkDeclaredHere(CtType t, CtTypeMember declaration) {
	    if (declaration.getDeclaringType() == t)
		return true;
	    return true;
	}

	/**
	 * TODO Describe the purpose of this method.
	 */
	private void transferMembers() {
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
	 * @param t
	 */
	private void transferInnerClasses(CtType t) {
	    for (CtType<?> declaration : (Collection<CtType<?>>) t.getNestedTypes()) {
		if (declaration.isStatic()) {
		    if (deletedStatements.contains(declaration))
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
	 * @param t
	 */
	private void transferFieldsFrom(CtType t) {
	    for (CtField<?> declaration : (Collection<CtField<?>>) t.getFields()) {
		if (declaration.isStatic()) {
		    if (declaration.getDeclaringType() != t)
			continue;
		    final String simpleName = declaration.getSimpleName();
		    final CtField findCtField = mainType.getField(simpleName);
		    if (findCtField == null) {
			if (deletedStatements.contains(declaration))
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
	 * @param t
	 */
	private void transferMethodsFrom(CtType t) {
	    String tsn = "_" + t.getSimpleName() + "_file";

	    for (CtMethod<?> declaration : (Set<CtMethod<?>>) t.getMethods()) {
		if (!declaration.isStatic())
		    continue;
		if (deletedStatements.contains(declaration))
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
				//deletedStatements.add(declaration);
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
		    if (deletedStatements.contains(findMethod)) {
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
	 * @param body
	 * @param s
	 * @return
	 */
	private boolean containsStatement(CtType t, final List<CtStatement> body, CtStatement s) {
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
	 * @param t 
	 * @param es
	 * @return
	 */
	private String removePacakges(CtType t, String es) {
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
	 * @param mainType2
	 * @param findMethod
	 * @return
	 */
	private int getMemberIndex(CtType t, CtTypeMember findMethod) {
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
	 */
	private void chooseInnerTypes() {
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
			//			if (s1.endsWith("_HIDE")) {
			//			    CtType swap = t1;
			//			    t1 = t2;
			//			    t2 = swap;
			//			    s1 = t1.getSimpleName();
			//			    s2 = t2.getSimpleName();
			//			}
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
					methodBody = methodBody.replace("return " + p1 + ".", "return ((" + s5 + ")" + p1 + ").");
					final CtCodeSnippetStatement cds = codeFactory().createCodeSnippetStatement(methodBody);
					statements.add(cds);
				    }
				    //final CtBlock<?> createCtBlock = codeFactory().createCtBlock(createCodeSnippetStatement);
				    //createCtBlock.setImplicit(true);
				    //m.setBody(createCtBlock);
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
	 */
	private void guessMainType() {
	    for (CtType t : seenTypes) {
		mainType = t;
	    }
	    for (CtType t : seenTypes) {
		if (!t.getQualifiedName().contains("cycjava_"))
		    mainType = t;
	    }
	}

	public String capitalize(String original) {
	    return original.substring(0, 1).toUpperCase() + original.substring(1);
	}

	public void generateGetter(CtClass<?> ctClass, CtField<?> ctField) {
	    final CtReturn returnStatement = getFactory().Core().createReturn();
	    final CtExpression returnExpression = getFactory().Code().createCodeSnippetExpression(ctField.getSimpleName());
	    returnStatement.setReturnedExpression(returnExpression);
	    final CtBlock body = getFactory().Code().createCtBlock(returnStatement);
	    final CtMethod getter = getFactory().Method().create(ctClass, new HashSet<ModifierKind>(Arrays.asList(ModifierKind.PUBLIC)), ctField.getType(), "get" + capitalize(ctField.getSimpleName()), null, null, body);
	    ctClass.addMethod(getter);
	}

	/**
	 * TODO Describe the purpose of this method.
	 * @return
	 */
	public Factory getFactory() {
	    return this.factory;
	}

	public void generateSetter(CtClass<?> ctClass, CtField ctField) {
	    final CtTypeReference voidReference = getFactory().Code().createCtTypeReference(void.class);

	    final CtParameter<?> parameter = getFactory().Core().createParameter();
	    parameter.setType(ctField.getType());
	    parameter.setSimpleName(ctField.getSimpleName());
	    final List<CtParameter<?>> parameterList = Arrays.asList(parameter);

	    final CtCodeSnippetStatement assignment = getFactory().Code().createCodeSnippetStatement("this." + ctField.getSimpleName() + " = " + ctField.getSimpleName());
	    final CtBlock body = getFactory().Code().createCtBlock(assignment);

	    final CtMethod setter = getFactory().Method().create(ctClass, new HashSet<ModifierKind>(Arrays.asList(ModifierKind.PUBLIC)), voidReference, "set" + capitalize(ctField.getSimpleName()), parameterList, null, body);
	    ctClass.addMethod(setter);
	}

	/* (non-Javadoc)
	 * @see spoon.processing.Processor#process(spoon.reflect.declaration.CtElement)
	 */

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

	public void processClass(CtType<?> t) {
	    if (!t.isTopLevel()) {
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
	 * @param ctClass
	 */
	private void scanElements(CtType<?> ctClass) {
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

	private List<CtStatement> initialStatements = new ArrayList<CtStatement>();
	private HashMap<String, String> fieldValue2FieldName = new HashMap<String, String>();
	private HashMap<String, String> betterNames = new HashMap<String, String>();

	/**
	 * TODO Describe the purpose of this method.
	 * @param ctClass
	 */
	private void scanClass(final CtType<?> ctClass) {
	    //	    if (copyOf == null)
	    //		copyOf = copyType(ctClass.getTopLevelType());

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

		@Override
		public void visitCtAnonymousExecutable(CtAnonymousExecutable anonymousExec) {
		    if (anonymousExec.isStatic()) {
			if (anonymousExec.getDeclaringType() == ctClass) {
			    initialStatements.addAll(anonymousExec.getBody().getStatements());
			}
		    }
		    super.visitCtAnonymousExecutable(anonymousExec);
		};

		@Override
		public <T> void visitCtExecutableReference(CtExecutableReference<T> reference) {
		    if (reference.isStatic()) {
			CtTypeReference<?> imported = reference.getDeclaringType();
			if (imported != null && imported != ctClass) {
			    final CtTypeMemberWildcardImportReference e = factory.createTypeMemberWildcardImportReference(imported);
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
					final CtTypeMemberWildcardImportReference e = factory.createTypeMemberWildcardImportReference(imported);
					final CtImport ctImportImpl = factory.createImport(e);
					extraImports.add(ctImportImpl);
				    }
				    //extraImports.add(factory.createImport(imported));
				}
			    }
			}
		    }
		    super.visitCtFieldReference(reference);
		}

		@Override
		public void visitCtAssignment(CtAssignment assignement) {

		    final CtElement refType = assignement.getAssigned();
		    if (refType instanceof CtFieldWrite) {
			CtFieldReference reference = ((CtFieldWrite) refType).getVariable();
			final CtField declaration = reference.getFieldDeclaration();
			if (declaration != null && declaration.getDeclaringType() == ctClass && declaration.isStatic()) {
			    String name = declaration.getSimpleName();
			    putField(name, declaration, assignement.getAssignment());
			}
		    }
		    super.visitCtAssignment(assignement);
		}

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

	    }.scan(ctClass);

	}

	/**
	 * TODO Describe the purpose of this method.
	 * @param name
	 * @param declaration
	 * @param assignment
	 */
	protected void putField(String name, CtField declaration, CtExpression assignment) {
	    SpoonFieldInfo info = getSpoonField(name);
	    info.mergedFields.add(declaration);
	    info.addAssignment(assignment);

	}

	/**
	 * TODO Describe the purpose of this method.
	 */
	private void collectFields() {
	    for (final String name : fieldData.keySet()) {
		getSpoonField(name).collectFieldAssignments();
	    }
	}

	/**
	 * TODO Describe the purpose of this method.
	 * @param p
	 * @return
	 */
	private String withoutRenames(CtElement p) {
	    final Map<String, String> wasRenames = renames;
	    renames = NO_RENAMES;
	    try {
		return "" + p;
	    } finally {
		renames = wasRenames;
	    }
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
		    //  lastWord = lastWord.substring(0, lastWord.length() - 4);
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
			//field.delete();
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
				//field.delete();
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
			//field.delete();
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
				//field.delete();
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
			//field.delete();
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
				//field.delete();
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
			if (assignmentS0.contains("makeUninternedSymbol"))
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
			//field.delete();
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
			String sas = getAssignmentLiteral(assignment);
			if (sas != null) {
			    int len = sas.length() - 1;

			    if (len > 3 && sas.charAt(0) == '*' && sas.charAt(len) == '*') {
				sas = sas.substring(1, len);
				if (sas.matches("[A-Z][A-Z-]*[A-Z?]")) {
				    newName = "$" + sas.toLowerCase().replace('-', '_').replace('?', 'P') + "$";
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
					    //field.delete();
					}
					continue;
				    }
				    //				    renameF(ctClass, field, newName, ctClass.getReference());
				}
			    }

			}
		    }
		    continue;
		}
	    }
	}
	//
	//	/**
	//	 * TODO Describe the purpose of this method.
	//	 * @param field
	//	 * @param simpleName
	//	 * @param newName
	//	 */
	//	private void renameF(CtType ctClass, CtField field, final Field declaredField) {
	//	    final CtTypeReference newRef = field.getFactory().createCtTypeReference(declaredField.getDeclaringClass());
	//	    final String newName = declaredField.getName();
	//	    renameF(ctClass, field, newName, newRef);
	//	}
	//
	//	private void renameF(CtType ctClass, CtField field, final String newName, CtTypeReference newRef) {
	//	    final String oldName = field.getSimpleName();
	//	    final CtFieldReference fref = field.getReference();
	//	    final CtTypeReference fdtype = fref.getDeclaringType();
	//	    boolean sameClass = fdtype.getSimpleName().equals(newRef.getSimpleName());
	//	    // field.setSimpleName(newName);
	//	    final Set<CtElement> collection = fields.get(field.getSimpleName());
	//	    try {
	//		if (true) {
	//		    for (final CtElement ref : collection) {
	//			if (ref instanceof CtFieldReference) {
	//			    final CtElement oldStatement = asStatement(ref);
	//			    String ps = null;
	//
	//			    if (DEBUG_LEVEL > 2) {
	//				ps = withoutRenames(oldStatement);
	//			    }
	//			    final CtFieldReference new_name = (CtFieldReference) ref;
	//
	//			    if (fref == ref) {
	//				continue;
	//			    }
	//			    new_name.setSimpleName(newName);
	//			    new_name.setDeclaringType(newRef);
	//
	//			    if (ps != null) {
	//				final String ps2 = withoutRenames(oldStatement);
	//				//CtElement p = asStatement(new_name);			
	//				System.out.println(oldName + ": " + ps2);
	//				if (!newName.equals(oldName) && ps2.equals(ps)) {
	//				    new RuntimeException("Unchanged").printStackTrace();
	//				    printNode("OLD: " + oldName, ps, 400);
	//				    printNode("NEW: " + newName, ps2, 400);
	//
	//				}
	//			    }
	//			    new_name.getDeclaration();
	//			    new_name.getDeclaringType();
	//			}
	//		    }
	//		}
	//	    } catch (Exception e) {
	//		e.printStackTrace();
	//		// TODO: handle exception
	//	    }
	//
	//	    if (!newName.equals(oldName))
	//
	//	    {
	//		printNode("RENAME: " + oldName, "" + newName, 400);
	//		renames.put(oldName, newName);
	//	    }
	//
	//	    if (!sameClass) {
	//		noAssignFields.add(oldName);
	//		if (newName.equals(oldName)) {
	//		    printNode("REUSE: " + newName, "" + oldName, 400);
	//		    field.delete();
	//		    deleted.add(oldName);
	//		} else {
	//		    deleted.add(newName);
	//		    deleted.add(oldName);
	//		    printNode("DELETE: " + newName, "" + oldName, 400);
	//		    // fields.remove(field);
	//		    field.setSimpleName("DELTETED_ " + oldName);
	//		    field.delete();
	//		    fref.delete();
	//		}
	//	    }
	//
	//	}

	/**
	 * TODO Describe the purpose of this method.
	 */
	private void mergeEquivalentFields() {
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

    }

    /**
     * 
     */
    private static Class[] STATIC_IMPORT_CLASSES_ARRAY = new Class[] { //
	    subl_macro_promotions.class, cb_utilities.class, com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.class, // 
	    com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.class, // 
	    com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.class, //
	    com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.class, // 
	    com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.class, //
	    com.cyc.tool.subl.jrtl.translatedCode.sublisp.format.class, //
	    id_index.class, constant_handles.class, cb_parameters.class, cdestructuring_bind.class, com.cyc.tool.subl.util.SubLFiles.class, //
	    SubLTranslatedFile.class, //
	    CommonSymbols.class, //
	    kb_indexing_datastructures.class, sbhl_iteration.class, cfasl.class, html_utilities.class, //
	    CommonSymbols_KW.class, //
	    CommonSymbols_CYC.class, //
	    CommonSymbols_SYM.class, //
	    PrintLow.class, ConsesLow.class, // 
	    Hashtables.class, Values.class, Types.class, //
	    Characters.class, //
	    Numbers.class, Sequences.class, Functions.class, //
	    Dynamic.class, Environment.class, Equality.class, Eval.class, //
	    Locks.class, Packages.class, Structures.class, //
	    Symbols.class, Threads.class, //
	    Time.class, Vectors.class, //
	    com.cyc.cycjava.cycl.el_utilities.class, generic_testing.class, kb_macros.class, //
	    control_vars.class, utilities_macros.class, access_macros.class };
    private static final List<Class> STATIC_IMPORT_CLASSES = new ArrayList<Class>();

    /**
     * TODO Describe the purpose of this method.
     */
    private static void populateImportedClasses() {
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
    }

    /**
     * TODO Describe the purpose of this method.
     * @param es
     * @param q
     * @param string
     * @return
     */
    public static String replaceAll(String es, String q, String string) {
	while (es.contains(q)) {
	    es = es.replace(q, string);
	}
	return es;
    }

    public static Member isStaticImported(String sr, boolean method) {
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
     * @param oldName
     * @param newName
     * @return
     */
    static public boolean betterNameThan(String oldName, String newName) {
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
     * @param field
     */
    static public void cleanupModifiers(CtField field) {
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

    /**
     * TODO Describe the purpose of this method.
     * @param assignment
     * @return
     */
    public static String getAssignmentLiteral(CtExpression assignment) {
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
     * @param assignment
     * @return
     */
    public static String getInvokation(CtExpression assignment) {
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

    public static String andOneDot(String qualifiedName) {
	final int lastDot = qualifiedName.lastIndexOf('.');
	if (lastDot <= 0)
	    return qualifiedName;
	return qualifiedName.substring(qualifiedName.lastIndexOf('.', lastDot - 1) + 1);
    }

    static public class MyOutputPrinter extends DefaultJavaPrettyPrinter implements CtVisitor, PrettyPrinter {

	CtTypeReference currentOutterType;

	CtStatement currentStatement;

	CtTypeReference currentType;

	CtStatement lastStatement = null;

	private String qualifiedPackageName;

	private SpoonInfo classSpooner;

	/**
	 * TODO Describe this constructor.
	 * @param environment
	 */
	public MyOutputPrinter(Environment environment) {
	    super(environment);
	    this.env = environment;
	    imports = new HashSet<>();
	    setPrinterTokenWriter(new DefaultTokenWriter(new PrinterHelper(environment)));
	    if (environment.isAutoImports()) {
		importsContext = new ImportScannerImpl();
	    } else {
		importsContext = new MinimalImportScanner();
	    }
	}

	@Override
	public void calculate(CtCompilationUnit cu, List<CtType<?>> types) {
	    final HashSet<CtImport> newImports = new HashSet<CtImport>();
	    newImports.addAll(cu.getImports());

	    System.out.println("sourceCompilationUnit: " + cu.getFile().toString());
	    final CtType<?> topLevel = types.iterator().next().getTopLevelType();
	    currentOutterType = topLevel.getReference();

	    classSpooner = findSpoonInfo(topLevel);

	    final Factory factory = cu.getFactory();

	    if (true) {
		for (final Class c : STATIC_IMPORT_CLASSES) {
		    final CtTypeReference t = factory.createCtTypeReference(c);
		    if (t.getQualifiedName().equals(currentOutterType.getQualifiedName()))
			continue;
		    final CtTypeMemberWildcardImportReference e = factory.createTypeMemberWildcardImportReference(t);
		    final CtImport ctImportImpl = t.getFactory().createImport(e);
		    newImports.add(ctImportImpl);
		}
	    }
	    if (true)
		for (final CtImport c0 : classSpooner.extraImports) {
		    //newImports.add(c0);
		}

	    if (false) {
		System.err.println("import self statically: " + currentOutterType.getTopLevelType());
		final CtTypeMemberWildcardImportReference e = factory.createTypeMemberWildcardImportReference(currentOutterType);
		final CtImport ctImportImpl = factory.createImport(e);
		newImports.add(ctImportImpl);
	    }
	    cu.setImports(newImports);
	    super.calculate(cu, types);
	}

	/**
	 * Write the compilation unit header.
	 */
	@Override
	public DefaultJavaPrettyPrinter writeHeader(List<CtType<?>> types, Collection<CtImport> imports) {
	    elementPrinterHelper.writeHeader(types, imports);
	    return this;
	}

	@Override
	public List<String> filterImports(List<String> setStaticImports, boolean areStatic) {
	    List<String> sortedStaticImports = new ArrayList<>();
	    String coc = currentOutterType == null ? "unknown" : currentOutterType.getQualifiedName();
	    for (String imported : setStaticImports) {
		imported = imported.replace(".cycjava_2.", ".cycjava.");
		if (areStatic || true) {
		    if (imported.startsWith(coc + "."))
			continue;
		}
		sortedStaticImports.add(imported);
	    }
	    Collections.sort(sortedStaticImports);
	    return sortedStaticImports;
	}

	@Override
	public <T> void visitCtVariableRead(CtVariableRead<T> variableRead) {
	    enterCtExpression(variableRead);
	    printer.writeIdentifier(variableRead.getVariable().getSimpleName());
	    exitCtExpression(variableRead);
	}

	@Override
	public <T> void visitCtVariableWrite(CtVariableWrite<T> variableWrite) {
	    enterCtExpression(variableWrite);
	    printer.writeIdentifier(variableWrite.getVariable().getSimpleName());
	    exitCtExpression(variableWrite);
	}

	@Override
	public void reset() {
	    printer.reset();
	    context = new PrintingContext();
	    if (env.isAutoImports()) {
		importsContext = new ImportScannerImpl();
	    } else {
		importsContext = new MinimalImportScanner();
	    }
	}

	/**
	 * Make the imports for a given type.
	*
	 */
	@Override
	public Collection<CtImport> computeImports(CtType<?> type) {
	    context.currentTopLevel = type;
	    try {
		importsContext.computeImports(context.currentTopLevel);
	    } catch (final ParentNotInitializedException e) {

	    }
	    return importsContext.getAllImports();
	}

	@Override
	public boolean isImported(CtExecutableReference executableReference) {
	    if (isLocalVar(executableReference))
		return false;

	    if (executableReference.getDeclaringType() == null) {
		return false;
	    }
	    final CtImport executableImport = executableReference.getFactory().createImport(executableReference);
	    if (imports.contains(executableImport)) {
		return true;
	    } else {
		if (executableReference.getDeclaringType() == null) {
		    return false;
		}
		final CtTypeMemberWildcardImportReference staticTypeMemberReference = executableReference.getFactory().Type().createTypeMemberWildcardImportReference(executableReference.getDeclaringType());
		final CtImport staticClassImport = executableReference.getFactory().createImport(staticTypeMemberReference);
		return imports.contains(staticClassImport);
	    }
	}

	/**
	 * TODO Describe the purpose of this method.
	 * @param fieldReference
	 * @return
	 */
	static boolean isLocalVar(CtElement fieldReference) {
	    return fieldReference instanceof CtVariableAccess && !(fieldReference instanceof CtFieldAccess);
	}

	@Override
	public boolean isImported(CtFieldReference fieldReference) {
	    if (isLocalVar(fieldReference))
		return false;

	    if (fieldReference.getDeclaringType() == null) {
		return false;
	    }
	    final CtImport fieldImport = fieldReference.getFactory().createImport(fieldReference);
	    if (imports.contains(fieldImport)) {
		return true;
	    } else {
		if (fieldReference.getDeclaringType() == null) {
		    return false;
		}
		final CtTypeMemberWildcardImportReference staticTypeMemberReference = fieldReference.getFactory().Type().createTypeMemberWildcardImportReference(fieldReference.getDeclaringType());
		final CtImport staticClassImport = fieldReference.getFactory().createImport(staticTypeMemberReference);
		return imports.contains(staticClassImport);
	    }
	}

	/**
	 * TODO Describe the purpose of this method.
	 * @param sr
	 * @throws NoSuchFieldException
	 */
	private boolean isInherited(CtReference refr, String sr) {
	    if (true)
		return false;
	    if (PROCESS_LEVEL < 2)
		return false;
	    if (isLocalVar(refr))
		return false;
	    if (sr != null) {
		if (sr.equals("NIL") || sr.equals("me") || sr.equals("myName"))
		    return true;
		if (isStaticImported(sr, false) != null) {
		    return true;
		}
		if (refr instanceof CtFieldReference) {

		    final CtTypeReference v = ((CtFieldReference) refr).getDeclaringType();
		    if (v != null && v.equals(currentType)) {
			return true;
		    }
		    return !isImported((CtFieldReference) refr);
		}
	    }
	    return false;
	}

	@Override
	public <T> void visitCtAssert(CtAssert<T> asserted) {
	    enterCtStatement(asserted);
	    printer.writeKeyword("assert").writeSpace();
	    final CtExpression<Boolean> assertExpression = asserted.getAssertExpression();

	    String s = "" + assertExpression;
	    final CtExpression<T> error = asserted.getExpression();
	    final String stringE = "" + error;
	    if (true || !stringE.contains("\"")) {
		s = replaceAll(s, "(" + error + ")", " ");
		s = replaceAll(s, "CommonSymbols.NIL", " ");
		s = replaceAll(s, "CommonSymbols", " ");
		s = replaceAll(s, "Types.", " ");
		s = replaceAll(s, "!=", " ");
		s = replaceAll(s, "==", " ");
		s = replaceAll(s, "  ", " ");

		scan(assertExpression);
		if (error != null) {
		    printer.writeSpace().writeSeparator(":").writeSpace();
		    printer.writeSeparator("\"!" + LiteralHelper.getStringLiteral(s, true) + " \" + ");
		    scan(error);
		}
	    } else {
		this.scan(assertExpression);
		if (error != null) {
		    this.printer.writeSpace().writeSeparator(":").writeSpace();
		    this.scan(error);
		}
	    }
	    exitCtStatement(asserted);
	}

	/**
	 * Enters an expression.
	 */
	@Override
	protected void enterCtExpression(CtExpression<?> e) {
	    if (deletedStatements.contains(e)) {
		printNode("warn", e.getShortRepresentation(), 0);
	    }
	    if (!(e instanceof CtStatement)) {
		elementPrinterHelper.writeComment(e, CommentOffset.BEFORE);
	    }
	    getPrinterHelper().mapLine(e, sourceCompilationUnit);
	    if (shouldSetBracket(e)) {
		context.parenthesedExpression.push(e);
		printer.writeSeparator("(");
	    }
	    if (!e.getTypeCasts().isEmpty()) {
		for (CtTypeReference<?> r : e.getTypeCasts()) {
		    printer.writeSeparator("(");
		    scan(r);
		    printer.writeSeparator(")").writeSpace();
		    printer.writeSeparator("(");
		    context.parenthesedExpression.push(e);
		}
	    }
	}

	/**
	 * Enters a statement.
	 */
	@Override
	protected void enterCtStatement(CtStatement s) {
	    elementPrinterHelper.writeComment(s, CommentOffset.BEFORE);
	    getPrinterHelper().mapLine(s, sourceCompilationUnit);
	    if (!context.isNextForVariable()) {
		//TODO AnnotationLoopTest#testAnnotationDeclaredInForInit expects that annotations of next for variables are not printed
		//but may be correct is that the next variables are not annotated, because they might have different annotation then first param!
		elementPrinterHelper.writeAnnotations(s);
	    }
	    if (!context.isFirstForVariable() && !context.isNextForVariable()) {
		if (s.getLabel() != null) {
		    printer.writeIdentifier(s.getLabel()).writeSpace().writeSeparator(":").writeSpace();
		}
	    }
	}

	/**
	 * Exits a statement.
	 */
	@Override
	protected void exitCtStatement(CtStatement statement) {
	    if (classSpooner == null || !deletedStatements.contains(statement)) {

		if (!(statement instanceof CtBlock || statement instanceof CtIf || statement instanceof CtFor || statement instanceof CtForEach || statement instanceof CtWhile || statement instanceof CtTry || statement instanceof CtSwitch || statement instanceof CtSynchronized
			|| statement instanceof CtClass || statement instanceof CtComment)) {
		    if (context.isStatement(statement) && //
			    !context.isFirstForVariable() && !context.isNextForVariable()) {
			printer.writeSeparator(";");
		    }
		}
	    }
	    elementPrinterHelper.writeComment(statement, CommentOffset.AFTER);
	}

	@Override
	public <R> void visitCtBlock(CtBlock<R> block) {
	    enterCtStatement(block);
	    if (!block.isImplicit()) {
		printer.writeSeparator("{");
	    }
	    printer.incTab();
	    for (CtStatement statement : block.getStatements()) {
		if (!statement.isImplicit()) {
		    printer.writeln();
		    elementPrinterHelper.writeStatement(statement);
		}
	    }
	    printer.decTab();
	    getPrinterHelper().adjustEndPosition(block);
	    if (env.isPreserveLineNumbers()) {
		if (!block.isImplicit()) {
		    printer.writeSeparator("}");
		}
	    } else {
		printer.writeln();
		if (!block.isImplicit()) {
		    printer.writeSeparator("}");
		}
	    }
	    exitCtStatement(block);
	}

	/**
	 * Exits an expression.
	 */
	@Override
	protected void exitCtExpression(CtExpression<?> e) {
	    while ((!context.parenthesedExpression.isEmpty()) && e == context.parenthesedExpression.peek()) {
		CtExpression<?> exper = context.parenthesedExpression.pop();
		if (classSpooner == null || !deletedStatements.contains(exper)) {
		    printer.writeSeparator(")");
		}
	    }
	    if (!(e instanceof CtStatement)) {
		elementPrinterHelper.writeComment(e, CommentOffset.AFTER);
	    }
	}

	/**
	 * The generic scan method for an element.
	 */
	@Override
	public DefaultJavaPrettyPrinter scan(CtElement e) {
	    if (e != null) {
		if (classSpooner != null && deletedStatements.contains(e))
		    return this;
		enter(e);
		context.elementStack.push(e);
		if (env.isPreserveLineNumbers()) {
		    if (!(e instanceof CtNamedElement)) {
			getPrinterHelper().adjustStartPosition(e);
		    }
		}
		reallWriteEle(e);
		context.elementStack.pop();
		exit(e);
	    }
	    return this;
	}

	/**
	 * TODO Describe the purpose of this method. 
	 * @param e
	 */
	protected void reallWriteEle(CtElement e) {
	    if (e instanceof CtVariable && classSpooner != null) {
		if (e instanceof CtFieldReference) {
		    final String ss = ((CtFieldReference) e).getSimpleName();
		    final String rr = classSpooner.renames.get(ss);
		    if (rr != null) {
			printer.writeIdentifier(rr);
			return;
		    }
		}
	    }
	    e.accept(this);
	}

	@Override
	public <T, A extends T> void visitCtAssignment(CtAssignment<T, A> assignement) {
	    enterCtStatement(assignement);
	    enterCtExpression(assignement);

	    final CtExpression<T> assigned = assignement.getAssigned();
	    try {
		final CtExpression<A> expression = assignement.getAssignment();
		if (assigned instanceof CtFieldAccess) {
		    final CtFieldReference variable = ((CtFieldAccess) assigned).getVariable();
		    final String simpleName = variable.getSimpleName();
		    //printNode("FIELD " + variable, "" + assigned, -1);
		    //.assigned. || (isStaticImported(simpleName, false) instanceof Field)
		    if ((classSpooner != null && classSpooner.noAssignFields.contains(simpleName))) {

			//			if (classSpooner.noAssignBody.contains(simpleName)) {
			//			    classSpooner.deletedStatements.add(assignement);
			//			    return;
			//			}
			if (!(expression instanceof CtLiteral)) {
			    scan(expression);
			} else {
			    deletedStatements.add(assignement);
			}
			return;
		    }
		} else {
		    //printNode("VAR", "" + assigned, -1);
		}
		scan(assigned);
		printer.writeSpace().writeOperator("=").writeSpace();
		scan(expression);
	    } finally {

		exitCtExpression(assignement);
		exitCtStatement(assignement);
	    }
	}

	@Override
	public <T> void visitCtField(CtField<T> f) {
	    String simpleName = f.getSimpleName();
	    if (classSpooner != null) {
		Set<String> deleted = classSpooner.deleted;
		if (deleted.contains(simpleName)) {
		    //		    elementPrinterHelper.writeComment(f, CommentOffset.BEFORE);
		    //		    //elementPrinterHelper.visitCtNamedElement(f, sourceCompilationUnit);
		    //		    elementPrinterHelper.writeComment(f, CommentOffset.AFTER);
		    return;
		}
		Map<String, String> renames = classSpooner.renames;
		if (renames.containsKey(simpleName)) {
		    simpleName = renames.get(simpleName);
		}
		Map<String, String> inlinedName = classSpooner.inlinedName;
		if (inlinedName.containsKey(simpleName)) {
		    return;
		}
	    }
	    elementPrinterHelper.writeComment(f, CommentOffset.BEFORE);
	    elementPrinterHelper.visitCtNamedElement(f, sourceCompilationUnit);
	    elementPrinterHelper.writeComment(f, CommentOffset.AFTER);

	    elementPrinterHelper.writeModifiers(f);
	    scan(f.getType());
	    printer.writeSpace();
	    printer.writeIdentifier(simpleName);

	    CtExpression<T> defaultExpression = f.getDefaultExpression();
	    if (defaultExpression != null) {
		printer.writeSpace().writeOperator("=").writeSpace();
		scan(defaultExpression);
	    } else {

	    }
	    printer.writeSeparator(";");

	}

	@Override
	public boolean skips(CtType<?> element) {
	    if (deletedStatements.contains(element))
		return true;
	    return element.getQualifiedName().contains("cycjava_2");
	}

	@Override
	public <T> void visitCtFieldRead(CtFieldRead<T> fieldRead) {
	    printCtFieldAccess(fieldRead);
	}

	@Override
	public <T> void visitCtFieldWrite(CtFieldWrite<T> fieldWrite) {
	    printCtFieldAccess(fieldWrite);
	}

	@Override

	public <T> void visitCtFieldReference(CtFieldReference<T> reference) {
	    String simpleName = reference.getSimpleName();
	    boolean isClass = "class".equals(simpleName);
	    if (simpleName.equals("structDecl")) {
		this.printer.writeIdentifier(simpleName);
		return;
	    }
	    boolean isStatic = isClass || !"super".equals(simpleName) && reference.isStatic();
	    boolean printType = true;
	    CtTypeReference<?> declaringType = reference.getDeclaringType();
	    if (reference.isFinal() && reference.isStatic()) {
		if (declaringType.isAnonymous()) {
		    printType = false;
		} else if (this.context.isInCurrentScope(declaringType)) {
		    printType = false;
		}
	    }
	    if (isStatic && printType && !this.context.ignoreStaticAccess()) {
		try (Writable _context = context.modify().ignoreGenerics(true)) {
		    scan(declaringType);
		}
		printer.writeSeparator(".");
	    }
	    if (isClass) {
		this.printer.writeKeyword("class");
	    } else {
		if (classSpooner != null) {
		    final String rr = classSpooner.renames.get(simpleName);
		    if (rr != null) {
			this.printer.writeIdentifier(rr);
			return;
		    }
		}
		this.printer.writeIdentifier(simpleName);
	    }
	}

    }

    public class SpoonClassLoader extends ClassLoader {
	public final File directory;

	public SpoonClassLoader(ClassLoader classLoader, File directory) {
	    super(classLoader);
	    this.directory = directory;
	}

	public SpoonClassLoader(File directory) {
	    this.directory = directory;
	}

	@Override
	public Class loadClass(String name) throws ClassNotFoundException {
	    try {
		final File file = new File(directory, name.replaceAll("\\.", "/") + ".class");

		if (!file.exists()) {
		    return super.loadClass(name);
		}

		ByteArrayOutputStream buffer;
		try (InputStream input = new FileInputStream(file)) {
		    buffer = new ByteArrayOutputStream();
		    int data = input.read();
		    while (data != -1) {
			buffer.write(data);
			data = input.read();
		    }
		}
		final byte[] classData = buffer.toByteArray();

		return defineClass(name, classData, 0, classData.length);
	    } catch (final MalformedURLException e) {
		e.printStackTrace();
	    } catch (final IOException e) {
		e.printStackTrace();
	    }

	    return null;
	}
    }

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
		printing: for (final spoon.reflect.cu.CompilationUnit cu : getFactory().CompilationUnit().getMap().values()) {

		    getFactory().getEnvironment().debugMessage("Generating source for compilation unit: " + cu.getFile());

		    final CtType<?> element = cu.getMainType();

		    final CtPackage pack = element.getPackage();

		    // create package directory
		    File packageDir;
		    if (pack.getQualifiedName().equals(CtPackage.TOP_LEVEL_PACKAGE_NAME)) {
			packageDir = new File(getSourceOutputDirectory().getAbsolutePath());
		    } else {
			final char dot = '.';
			// Create current package dir
			packageDir = new File(getSourceOutputDirectory().getAbsolutePath() + File.separatorChar + pack.getQualifiedName().replace(dot, File.separatorChar));
		    }
		    if (!packageDir.exists()) {
			if (!packageDir.mkdirs()) {
			    throw new RuntimeException("Error creating output directory");
			}
		    }

		    final File file = new File(packageDir.getAbsolutePath() + File.separatorChar + element.getSimpleName() + DefaultJavaPrettyPrinter.JAVA_FILE_EXTENSION);
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
     *
     */

    //    /**
    //     * TODO Describe the purpose of this method.
    //     * @param field
    //     * @return
    //     */
    //    public static IdentitySet<CtElement> getRefs(final CtField field, IdentitySet<CtFieldReference> feildRefs, IdentitySet<CtElement> statements, IdentitySet<CtExpression> allAssignments) {
    //	final IdentitySet<CtElement> refers = new IdentitySet<CtElement>();
    //
    //	final CtExpression fassignment = field.getAssignment();
    //	if (fassignment != null)
    //	    allAssignments.add(fassignment);
    //
    //	for (final CtElement e : feildRefs) {
    //	    if (e instanceof CtReference) {
    //		final CtReference reference = (CtReference) e;
    //		if (reference.getDeclaration() == field) {
    //		    final CtElement refType = reference.getParent();
    //		    refers.add(reference);
    //		    final CtElement parent = asStatement(refType);
    //		    //if (fassignment == null) {
    //		    if (refType instanceof CtFieldWrite) {
    //			final CtAssignment assignment = (CtAssignment) parent;
    //			//			CtExpression to = assignment.getAssigned();
    //			final CtExpression from = assignment.getAssignment();
    //			allAssignments.add(from);
    //			statements.add(parent);
    //		    } else if (refType instanceof CtFieldRead) {
    //			statements.add(parent);
    //		    } else {
    //			if (parent instanceof CtStatement) {
    //			    statements.add(parent);
    //			} else {
    //			    statements.add(parent);
    //			}
    //		    }
    //
    //		}
    //	    }
    //	}
    //	for (final Object key : refers) {
    //	    feildRefs.remove(key);
    //	}
    //	return refers;
    //
    //    }

    /**
     * TODO Describe the purpose of this method.
     * @param p
     * @return
     */
    public static CtElement getParent(CtElement p) {
	try {
	    if (p == null)
		return null;
	    return p.getParent();
	} catch (final ParentNotInitializedException e) {
	    return null;
	}
    }
    //
    //    /**
    //     * TODO Describe the purpose of this method.
    //     * @param lastWord
    //     * @return
    //     */
    //    public static Field getDeclared(String lastWord, boolean chKeyword) {
    //	Field f = null;
    //	if (chKeyword) {
    //	    f = getDeclared(CommonSymbols_KW.class, "$" + lastWord);
    //	    if (true)
    //		return null;
    //	    return f != null ? f : getDeclared(Keyword.class, lastWord);
    //	} else {
    //	    f = getDeclared(CommonSymbols.class, lastWord);
    //	    if (true)
    //		return null;
    //	    return f != null ? f : getDeclared(org.armedbear.lisp.Symbol.class, lastWord);
    //	}
    //    }

    /**
     * TODO Describe the purpose of this method.
     * @param lastWord
     * @return
     * @throws NoSuchFieldException
     */
    private static Field getDeclared(Class c, String lastWord) {
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
     * Changes name of a {@link CtLocalVariable}.
     *
     * @param localVariable
     * 		to be renamed {@link CtLocalVariable} in the AST.
     * @param newName
     * 		New name of the element.
     * @throws RefactoringException when rename to newName would cause model inconsistency, like ambiguity, shadowing of other variables, etc.
     */
    public static void changeLocalVariableName(CtLocalVariable<?> localVariable, String newName) throws RefactoringException {
	new CtRenameLocalVariableRefactoring().setTarget(localVariable).setNewName(newName).refactor();
    }

    /**
     * Changes name of a method, propagates the change in the executable references of the model.
     */
    public static void changeMethodName(final CtMethod<?> method, String newName) {

	final List<CtExecutableReference<?>> references = Query.getElements(method.getFactory(), new TypeFilter<CtExecutableReference<?>>(CtExecutableReference.class) {
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
     * @param type
     * 		Type in the AST.
     * @param name
     * 		New name of the element.
     */
    public static void changeTypeName(final CtType<?> type, String name) {

	final String typeQFN = type.getQualifiedName();
	final List<CtTypeReference<?>> references = Query.getElements(type.getFactory(), new TypeFilter<CtTypeReference<?>>(CtTypeReference.class) {
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

    /** See doc in {@link CtMethod#copyMethod()} */
    public static CtMethod<?> copyMethod(final CtMethod<?> method) {
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
    public static CtType<?> copyType(final CtType<?> type) {
	final CtType<?> clone = type.clone();
	final StringBuilder tentativeTypeName = new StringBuilder(type.getSimpleName() + "_Type_Copy");
	while (type.getFactory().Type().get(type.getPackage().getQualifiedName() + "." + tentativeTypeName) != null) {
	    tentativeTypeName.append("X");
	}
	final String cloneTypeName = tentativeTypeName.toString();
	clone.setSimpleName(cloneTypeName);
	type.getPackage().addType(clone);
	//fix cloned type name
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
	//check that everything is OK
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

    /**
     * This template defines the needed template code for matching and/or generating
     * field accesses through getters and setters:
     */
    public class FieldAccessTemplate<_FieldType_> implements Template {

	@Parameter("_field_")
	String __field_;

	@Local
	_FieldType_ _field_;

	@Parameter
	String _Field_;

	@Parameter
	CtTypeReference<?> _FieldType_;

	@Parameter
	CtExpression<_FieldType_> _setExpression_;

	@Parameter
	CtExpression<FieldAccessTemplate<_FieldType_>> _target_;

	@SuppressWarnings("unchecked")
	@Local
	public FieldAccessTemplate(CtTypeReference<?> type, String field, CtFieldAccess<_FieldType_> fieldAccess, CtExpression<_FieldType_> setExpression) {
	    _FieldType_ = type;
	    __field_ = field;
	    final char[] chars = field.toCharArray();
	    chars[0] = Character.toUpperCase(chars[0]);
	    _Field_ = new String(chars);
	    if (fieldAccess != null) {
		_target_ = (CtExpression<FieldAccessTemplate<_FieldType_>>) fieldAccess.getTarget();
		if (!fieldAccess.getVariable().isStatic() && _target_ == null) {
		    _target_ = (CtExpression<FieldAccessTemplate<_FieldType_>>) fieldAccess.getFactory().Code().createThisAccess(fieldAccess.getVariable().getDeclaringType());
		}
	    }
	    _setExpression_ = setExpression;
	}

	/* (non-Javadoc)
	 * @see spoon.template.Template#apply(spoon.reflect.declaration.CtType)
	 */
	@Override
	public CtElement apply(CtType targetType) {
	    // TODO Auto-generated method stub
	    return null;
	}

	/**
	 * This template code defines the getter of a field {@link #_field_}. Note
	 * the template parameter {@link #_FieldType_} that contains the field's
	 * type (also defined as a type parameter) and the {@link #_Field_} that
	 * contains the name of the field with the first letter uppercased.
	 */

	public _FieldType_ get_Field_() {
	    return _field_;
	}

	/**
	 * This template code defines the invocation of a getter for a field
	 * {@link #_field_}. The {@link #_target_} can be null:
	 */
	@Local
	void getterInvocation() {
	    _target_.S().get_Field_();
	}

	/**
	 * This template code defines the setter of a field {@link #_field_}. Note
	 * the template parameter {@link #_FieldType_} that contains the field's
	 * type (also defined as a type parameter) and the {@link #_Field_} that
	 * contains the name of the field with the first letter uppercased.
	 */

	public void set_Field_(_FieldType_ _field_) {
	    this._field_ = _field_;
	}

	/**
	 * This template code defines the invocation of a setter for a field
	 * {@link #_field_}. The set expression is stored in the
	 * {@link #_setExpression_} template parameter. The {@link #_target_} can be
	 * null:
	 */
	@Local
	void setterInvocation() {
	    _target_.S().set_Field_(_setExpression_.S());
	}

    }

    /**
     * Set that compares object by identity rather than equality. Wraps around a <code>IdentityHashMap</code>
     *
     */
    static public class IdentitySet<E> implements Set<E> {
	final private Map<E, Object> map;
	final private Object CONTAINS = new Object();

	public IdentitySet() {
	    this(10);
	}

	public IdentitySet(int size) {
	    this.map = new IdentityHashMap<E, Object>(size);
	}

	public IdentitySet(Collection<E> size) {
	    this.map = new IdentityHashMap<E, Object>(size.size());
	    addAll(size);
	}

	@Override
	public int size() {
	    return map.size();
	}

	@Override
	public boolean isEmpty() {
	    return map.isEmpty();
	}

	@Override
	public boolean contains(Object o) {
	    return map.containsKey(o);
	}

	@Override
	public Iterator<E> iterator() {
	    return map.keySet().iterator();
	}

	@Override
	public Object[] toArray() {
	    return map.keySet().toArray();
	}

	@Override
	public boolean add(E o) {
	    return map.put(o, CONTAINS) == null;
	}

	@Override
	public boolean remove(Object o) {
	    return map.remove(o) == CONTAINS;
	}

	@Override
	public boolean addAll(Collection c) {
	    boolean doThing = false;
	    for (Object o : c) {
		doThing = doThing || add((E) o);
	    }
	    return doThing;
	}

	@Override
	public void clear() {
	    map.clear();
	}

	@Override
	public boolean removeAll(Collection c) {
	    boolean remove = false;
	    for (Object o : c) {
		remove = remove || remove(o);
	    }
	    return remove;
	}

	@Override
	public boolean retainAll(Collection c) {
	    throw new UnsupportedOperationException();
	}

	@Override
	public boolean containsAll(Collection c) {
	    for (Object o : c) {
		if (!contains(o)) {
		    return false;
		}
	    }
	    return true;
	}

	@Override
	public Object[] toArray(Object[] a) {
	    return map.keySet().toArray(a);
	}

	@Override
	public String toString() {
	    return "IdentitySet{" + "map=" + map + '}';
	}

    }
}
