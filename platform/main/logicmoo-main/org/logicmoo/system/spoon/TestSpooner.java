package org.logicmoo.system.spoon;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.MalformedURLException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.*;
import java.util.*;

import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;
import static java.nio.file.FileVisitResult.*;
import static java.nio.file.FileVisitOption.*;
import java.util.*;

import org.armedbear.lisp.Interpreter;
import org.armedbear.lisp.Keyword;
import org.armedbear.lisp.Lisp;
import org.eclipse.jdt.internal.compiler.batch.Main;
import org.logicmoo.system.BeanShellCntrl;
import org.logicmoo.system.IOUtils;
import org.logicmoo.system.spoon.TestSpooner.SpoonInfo;

import com.cyc.cycjava.cycl.access_macros;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.kb_macros;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.util.SubLTranslatedFile;
import com.cyc.tool.subl.util.SubLTranslatedFile.SubL;

import pddl4j.exp.fexp.FExp;
import spoon.Launcher;
import spoon.OutputType;
import spoon.SpoonAPI;
import spoon.SpoonException;
import spoon.SpoonModelBuilder;
import spoon.compiler.Environment;
import spoon.experimental.CtUnresolvedImport;
import spoon.processing.AbstractProcessor;
import spoon.processing.Processor;
import spoon.refactoring.CtRenameLocalVariableRefactoring;
import spoon.refactoring.RefactoringException;
import spoon.reflect.CtModel;
import spoon.reflect.code.*;
import spoon.reflect.code.CtComment.CommentType;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.*;
import spoon.reflect.factory.Factory;
import spoon.reflect.factory.FactoryImpl;
import spoon.reflect.reference.*;
import spoon.reflect.visitor.*;
import spoon.reflect.visitor.PrintingContext.Writable;
import spoon.reflect.visitor.filter.PotentialVariableDeclarationFunction;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.reflect.visitor.printer.CommentOffset;
import spoon.support.DefaultCoreFactory;
import spoon.support.StandardEnvironment;
import spoon.support.compiler.jdt.JDTBasedSpoonCompiler;
import spoon.template.Local;
import spoon.template.Parameter;
import spoon.template.Template;

/**
 * Created by nicolas on 18/11/2014.
 */
public class TestSpooner {
    static boolean SMALL_SANITY_CHECK = false;
    static int DEBUG_LEVEL = 1;
    public static final Map<String, String> NO_RENAMES = new HashMap<String, String>();
    static SpoonModelBuilder compiler;
    private static Launcher launcher;
    private static File dest;

    /**
     * A {@code FileVisitor} that finds
     * all files that match the
     * specified pattern.
     */
    public static class Finder extends SimpleFileVisitor<Path> {

	private final PathMatcher matcher;
	private int max;
	private int numMatches = 0;
	private String pattern2;

	Finder(String pattern, String pattern2, int max) {
	    this.max = max;
	    this.pattern2 = pattern2;
	    matcher = FileSystems.getDefault().getPathMatcher("glob:" + pattern);

	}

	// Compares the glob pattern against
	// the file or directory name.
	void find(Path file) {
	    Path name = file.getFileName();
	    String stem = file.toString();
	    stem = stem.substring(Math.min(pattern2.length(), stem.length()));
	    if (name != null && matcher.matches(name)) {
		if (new File(dest, stem).exists())
		    return;
		numMatches++;
		if (noMore())
		    return;
		System.out.println(file);
		launcher.addInputResource(file.toString());
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

    public static void main(String[] args) throws IOException {

	launcher = new Launcher();

	if (SMALL_SANITY_CHECK) {
	    launcher.addInputResource("main/logicmoo-main/org/logicmoo/system/spoon/spoon_test.java");
	} else {
	    //launcher.addInputResource("src/com/cyc/tool/subl/jrtl/translatedCode/sublisp/");
	    launcher.addInputResource("main/logicmoo-main/org/logicmoo/system/spoon/spoon_test.java");
	}

	if (SMALL_SANITY_CHECK) {
	    launcher.addInputResource("main/server-4q/com/cyc/cycjava_2/cycl/arity.java");
	    launcher.addInputResource("main/server-4q/com/cyc/cycjava/cycl/arity.java");
	} else {
	    //launcher.addInputResource("main/server-4q/com/cyc/cycjava_2/cycl/");
	    addInputResourceMask("main/server-4q/", "*.java", 100);
	    //launcher.addInputResource("main/server-4u/com/cyc/cycjava_0/cycl/");
	    //launcher.addInputResource("main/server-4v/com/cyc/cycjava/cycl/");
	}

	dest = new File("main/logicmoo-main/org/logicmoo/system/spoon/gen/");
	launcher.setSourceOutputDirectory(dest);
	final Environment environment = launcher.getEnvironment();

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

	if (true) {
	    environment.setPrettyPrinterCreator(() -> {
		return new MyOutputPrinter(environment);
	    });
	}
	dest.mkdirs();
	for (File file : dest.listFiles()) {
	    file.delete();
	}
	//environment.setInputClassLoader(ClassLoader.getSystemClassLoader());
	launcher.addProcessor(new MergeFieldProcessoer());

	Lisp.initLisp();
	Interpreter.createBasicInstance();
	BeanShellCntrl.init_subl();

	launcher.run();
	System.exit(0);
    }

    /**
     * TODO Describe the purpose of this method.
     * @param string
     * @throws IOException 
     */
    private static void addInputResourceMask(String string) throws IOException {
	int indexOf = string.indexOf("*");
	String startingDirStr = string.substring(0, indexOf + 1);
	int endIndex = startingDirStr.lastIndexOf('/') + 1;
	startingDirStr = startingDirStr.substring(0, endIndex);
	String pattern = string.substring(endIndex);
	addInputResourceMask(startingDirStr, pattern, Integer.MAX_VALUE);
    }

    private static void addInputResourceMask(String startingDirStr, String pattern, int max) throws IOException {
	Path startingDir = Paths.get(startingDirStr);
	Finder finder = new Finder(pattern, startingDirStr, max);
	Files.walkFileTree(startingDir, finder);
	finder.done();
    }

    /**
     * TODO Describe the purpose of this method.
     * @param element
     * @param x
     */
    static void printNode(String header, String x, int len) {
	if (len >= 0) {
	    if (x.length() > len - 2)
		x = x.substring(0, len) + "\n    .... \n";
	}
	if (x.contains("\n")) {
	    x = "\n" + x + "\n";
	}
	System.err.println(header + ": " + x);
    }

    public TestSpooner() throws Exception {
	compiler = new TestSpoonCompiler(new FactoryImpl(new DefaultCoreFactory(), new StandardEnvironment()));
    }

    public TestSpooner addSource(Object... files) throws Exception {
	for (Object file : files) {
	    if (!(file instanceof File)) {
		file = new File("" + file);
	    }
	    compiler.addInputSource((File) file);
	}
	return this;
    }

    public TestSpooner addTemplate(File... files) throws Exception {
	for (File file : files) {
	    compiler.addTemplateSource(file);
	}
	return this;
    }

    public boolean compile() {
	File target = compiler.getSourceOutputDirectory();
	final boolean compile = Main.compile(new String[] { "-proc:none", target.toString() }, new PrintWriter(System.out), new PrintWriter(System.out), null);
	return compile;
    }

    public Class getSpoonedClass(String classname) throws ClassNotFoundException {
	File target = compiler.getSourceOutputDirectory();

	ClassLoader classLoader = new SpoonClassLoader(getClass().getClassLoader(), target);
	return classLoader.loadClass(classname);
    }

    public TestSpooner printOutput(File dest) throws Exception {
	dest.mkdirs();
	for (File file : dest.listFiles()) {
	    file.delete();
	}

	//   compiler.getFactory().getEnvironment().setPreserveLineNumbers(true);
	compiler.getFactory().getEnvironment().setSourceOutputDirectory(dest);

	compiler.generateProcessedSourceFiles(OutputType.COMPILATION_UNITS);
	return this;
    }

    public TestSpooner processClass(Class<? extends Processor>... processors) throws Exception {
	// Build spoon model

	List<Processor<?>> processorsNames = new ArrayList<>();
	for (Class<? extends Processor> processor : processors) {
	    processorsNames.add(processor.newInstance());
	}
	compiler.build();
	compiler.process(processorsNames);

	return this;
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

    public static final class MergeFieldProcessoer extends AbstractProcessor<CtType<?>> {

	/* (non-Javadoc)
	 * @see spoon.processing.Processor#process(spoon.reflect.declaration.CtElement)
	 */
	@Override
	public void process(CtType<?> t) {
	    SpoonInfo info = findSpoonInfo(t);
	    info.mergeClass(t);
	}

	@Override
	public void processingDone() {
	    for (SpoonInfo info : ctClasses.values()) {
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

    static public class SpoonInfo {
	//private CtType ctClass;
	final HashSet<CtType> seenTypes = new HashSet<CtType>();

	final HashMap<CtMethod, Collection<CtElement>> methods = new HashMap<CtMethod, Collection<CtElement>>();
	final HashMap<CtField, IdentityHashMap<CtElement, CtElement>> fields = new HashMap<CtField, IdentityHashMap<CtElement, CtElement>>();
	final HashSet<String> noAssignFields = new HashSet<String>();
	final HashSet<CtField> classFields = new HashSet<CtField>();
	final IdentityHashMap<CtElement, CtElement> feildRefs = new IdentityHashMap<CtElement, CtElement>();
	final HashSet<Object> elseOs = new HashSet<Object>();

	private Factory factory;

	public Map<String, String> renames = new HashMap<String, String>();

	/**
	 * TODO Describe this constructor.
	 * @param ctClass2
	 */
	public SpoonInfo(Factory f) {
	    factory = f;
	}

	/**
	 * TODO Describe the purpose of this method.
	 */
	public void processingDone() {
	    // TODO Auto-generated method stub

	}

	public String capitalize(String original) {
	    return original.substring(0, 1).toUpperCase() + original.substring(1);
	}

	public void generateGetter(CtClass<?> ctClass, CtField<?> ctField) {
	    CtReturn returnStatement = getFactory().Core().createReturn();
	    CtExpression returnExpression = getFactory().Code().createCodeSnippetExpression(ctField.getSimpleName());
	    returnStatement.setReturnedExpression(returnExpression);
	    CtBlock body = getFactory().Code().createCtBlock(returnStatement);
	    CtMethod getter = getFactory().Method().create(ctClass, new HashSet<ModifierKind>(Arrays.asList(ModifierKind.PUBLIC)), ctField.getType(), "get" + capitalize(ctField.getSimpleName()), null, null, body);
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
	    CtTypeReference voidReference = getFactory().Code().createCtTypeReference(void.class);

	    CtParameter<?> parameter = getFactory().Core().createParameter();
	    parameter.setType(ctField.getType());
	    parameter.setSimpleName(ctField.getSimpleName());
	    List<CtParameter<?>> parameterList = Arrays.asList(parameter);

	    CtCodeSnippetStatement assignment = getFactory().Code().createCodeSnippetStatement("this." + ctField.getSimpleName() + " = " + ctField.getSimpleName());
	    CtBlock body = getFactory().Code().createCtBlock(assignment);

	    CtMethod setter = getFactory().Method().create(ctClass, new HashSet<ModifierKind>(Arrays.asList(ModifierKind.PUBLIC)), voidReference, "set" + capitalize(ctField.getSimpleName()), parameterList, null, body);
	    ctClass.addMethod(setter);
	}

	/* (non-Javadoc)
	 * @see spoon.processing.Processor#process(spoon.reflect.declaration.CtElement)
	 */

	public void processGoto(Object e) {
	    int processed = 0;
	    for (Class c : e.getClass().getInterfaces()) {
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
	private String getExe(CtExpression expression) {
	    return "" + expression;

	}

	/**
	 * TODO Describe the purpose of this method.
	 * @param ctClass2
	 */
	public void mergeClass(CtType<?> t) {
	    if (seenTypes.size() == 0) {
		processClass(t);
		return;
	    }
	    if (!t.isTopLevel())
		return; //throw new ClassCastException("not topLevel" + ctClass);
	    System.err.println("mergeClass: " + t.getQualifiedName());
	    scanClass(t);
	    scanElements(t);
	    finalizeFields();
	    renameFields(t);
	}

	public void processClass(CtType<?> t) {
	    if (!t.isTopLevel())
		return; //throw new ClassCastException("not topLevel" + ctClass);
	    //	    if (seenTypes.size() != 0) {
	    //		mergeClass(t);
	    //		return;
	    //	    }

	    System.err.println("processClass: " + t.getQualifiedName());

	    scanElements(t);
	    scanClass(t);
	    finalizeFields();
	    renameFields(t);
	}

	/**
	 * TODO Describe the purpose of this method.
	 * @param ctClass
	 */
	private void scanElements(CtType<?> ctClass) {
	    for (Object o : ctClass.getElements(null)) {
		CtElement ctElement = (CtElement) o;
		if (ctElement instanceof CtField) {
		    final CtField memb = (CtField) ctElement;
		    final CtType<?> declaringType = memb.getDeclaringType();
		    if (declaringType == ctClass) {
			classFields.add(memb);
			//feildRefs.add(memb.getReference());
		    }
		} else if (ctElement instanceof CtFieldReference) {
		    feildRefs.put(ctElement, ctElement);
		} else if (false) {
		    if (ctElement instanceof CtMethod) {
			final CtMethod memb = (CtMethod) ctElement;
			final CtType<?> declaringType = memb.getDeclaringType();
			if (declaringType == ctClass) {
			    feildRefs.put((CtExecutableReference) memb.getReference(), memb);
			}
		    } else if (ctElement instanceof CtExecutableReference) {
			feildRefs.put(ctElement, ctElement);
		    }
		    elseOs.add(o);
		}
	    }
	    for (CtFieldReference<?> o : ctClass.getDeclaredFields()) {
		classFields.add(o.getDeclaration());
	    }
	}

	/**
	 * TODO Describe the purpose of this method.
	 * @param ctClass
	 */
	private void scanClass(CtType<?> ctClass) {
	    //Collection<? extends CtElement> clone = null;
	    final String cloneTypeName = null;
	    final CtType type = ctClass.getTopLevelType();
	    new CtScanner() {

		@Override
		public <T> void visitCtExecutableReference(CtExecutableReference<T> reference) {
		    CtExecutable<T> declaration = reference.getDeclaration();
		    if (declaration != null && cloneTypeName != null) {
			if (declaration.hasParent(type)) {
			    reference.getDeclaringType().setSimpleName(cloneTypeName);
			}
		    }
		    super.visitCtExecutableReference(reference);

		}

		@Override
		public <T> void visitCtFieldReference(CtFieldReference<T> reference) {
		    feildRefs.put(reference, reference);
		    CtField<T> declaration = reference.getDeclaration();
		    if (declaration != null && cloneTypeName != null) {
			if (declaration.hasParent(type)) {
			    reference.getDeclaringType().setSimpleName(cloneTypeName);
			}
		    }
		    super.visitCtFieldReference(reference);
		}

		public <T extends Object> void visitCtField(spoon.reflect.declaration.CtField<T> f) {
		    classFields.add(f);
		    super.visitCtField(f);
		};

		@Override
		public <T> void visitCtTypeReference(CtTypeReference<T> reference) {
		    final CtType<T> declaration = reference.getDeclaration();
		    if (declaration != null && cloneTypeName != null && declaration == type) {

			reference.setSimpleName(cloneTypeName);
		    }
		    super.visitCtTypeReference(reference);
		}

	    }.scan(type);
	}

	/**
	 * TODO Describe the purpose of this method.
	 */
	private void finalizeFields() {
	    for (CtField field : classFields) {
		checkField(field);
	    }

	}

	/**
	 * TODO Describe the purpose of this method.
	 * @param field
	 */
	private void checkField(CtField field) {
	    Set<CtElement> statements = new HashSet<CtElement>(40);

	    final Set<CtExpression> allAssignments = new HashSet<CtExpression>(40);
	    final IdentityHashMap<CtElement, CtElement> frefs = getRefs(field, feildRefs, statements, allAssignments);
	    fields.put(field, frefs);
	    for (Object o : field.getAnnotations().toArray()) {
		CtAnnotation annotation = (CtAnnotation) o;
		if (annotation.getType().getSimpleName().equals("SubL")) {
		    field.removeAnnotation(annotation);
		}
	    }
	    CtExpression fassignment = field.getAssignment();
	    final Set<ModifierKind> modifiers = field.getModifiers();

	    int assignPaths = allAssignments.size();
	    if (assignPaths == 1) {
		final CtExpression expression = allAssignments.iterator().next();
		final CtElement parent = expression.getParent();
		final CtElement e = asStatement(parent);
		final CtElement eparent = getParent(e);
		final CtElement egrandparent = getParent(eparent);
		if (fassignment == null) {
		    if (egrandparent != null && egrandparent instanceof CtAnonymousExecutable) {
			final CtExpression clone = expression.clone();
			String ps = withoutRenames(egrandparent);
			e.delete();
			String ps2 = withoutRenames(egrandparent);
			if (ps2.equals(ps)) {
			    (new RuntimeException("Unchanged")).printStackTrace();
			    printNode("BUG/OLD: " + field, ps, 1000);
			    printNode("BUG/NEW: " + field, ps2, 1000);
			}
			field.setDefaultExpression(clone);
			modifiers.add(ModifierKind.FINAL);
			field.setModifiers(modifiers);
		    } else {
			if (modifiers.add(ModifierKind.VOLATILE)) {
			    field.setModifiers(modifiers);
			}
		    }
		} else {
		    if (modifiers.add(ModifierKind.FINAL)) {
			field.setModifiers(modifiers);
		    }
		}
	    } else if (assignPaths == 0) {
		field.addComment(factory.createComment("@TODO assignPaths == 0 ??", CommentType.FILE));
		if (modifiers.add(ModifierKind.TRANSIENT)) {
		    field.setModifiers(modifiers);
		}
		if (fassignment == null) {
		    field.setAssignment(field.getFactory().createCodeSnippetExpression("null"));
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
			    String ps = withoutRenames(egrandparent);
			    e.delete();
			    String ps2 = withoutRenames(egrandparent);
			    if (ps2.equals(ps)) {
				(new RuntimeException("Unchanged")).printStackTrace();
				printNode("BUG/OLD: " + field, ps, 1000);
				printNode("BUG/NEW: " + field, ps2, 1000);
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
		    field.setAssignment(field.getFactory().createCodeSnippetExpression("null"));
		} else {
		    // field.setAssignment(fassignment);
		}
	    }
	}

	/**
	 * TODO Describe the purpose of this method.
	 * @param p
	 * @return
	 */
	private String withoutRenames(CtElement p) {
	    Map<String, String> wasRenames = renames;
	    renames = NO_RENAMES;
	    try {
		return "" + p;
	    } finally {
		renames = wasRenames;
	    }
	}

	public void renameFields(CtType ctClass) {
	    for (CtField field : classFields) {
		final String simpleName = field.getSimpleName();
		if (!simpleName.startsWith("$")) {
		    continue;
		}
		if (simpleName.endsWith("$")) {
		    continue;
		}
		String newSimpleName = simpleName;
		String s[] = simpleName.substring(1).split("[$]");
		String firstWord = s[0];
		if (firstWord.equals(""))
		    firstWord = s[1];
		if (firstWord.startsWith("list"))
		    continue;
		if (firstWord.startsWith("str"))
		    continue;
		String lastWord = s[s.length - 1];
		char ch = firstWord.charAt(firstWord.length() - 1);
		Field declaredField;

		if (firstWord.startsWith("int")) {
		    declaredField = getDeclared(SubLTranslatedFile.class, "$int$" + lastWord);
		    if (declaredField != null) {
			renameF(ctClass, field, declaredField);
			//field.delete();
		    }
		    continue;
		}
		if (firstWord.startsWith("const")) {
		    declaredField = getDeclared(SubLTranslatedFile.class, "$$" + lastWord);
		    if (declaredField != null) {
			renameF(ctClass, field, declaredField);
		    }
		    continue;
		}

		final boolean startsWithKW = firstWord.startsWith("kw");
		if (((firstWord.startsWith("sym") || startsWithKW)) && Character.isDigit(ch)) {

		    declaredField = getDeclared(lastWord, startsWithKW);

		    if (declaredField != null) {
			final Class actualClass = field.getType().getActualClass();
			if (actualClass.isAssignableFrom(declaredField.getType())) {
			    try {
				Object object = declaredField.get(null);
				if (object == null)
				    continue;
				if (object instanceof SubLSymbol) {
				    SubLSymbol symbol = (SubLSymbol) object;
				    if (startsWithKW != symbol.isKeyword())
					continue;
				}
				renameF(ctClass, field, declaredField);
			    } catch (IllegalArgumentException | IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			    }
			    continue;
			}
		    }

		}
		if (newSimpleName.equals(simpleName))
		    continue;
		renameF(ctClass, field, newSimpleName, field.getDeclaringType().getReference());
		continue;
	    }
	}

	/**
	 * TODO Describe the purpose of this method.
	 * @param field
	 * @param simpleName
	 * @param newSimpleName
	 */
	private void renameF(CtType ctClass, CtField field, final Field declaredField) {
	    CtTypeReference newRef = field.getFactory().createCtTypeReference(declaredField.getDeclaringClass());
	    final String newSimpleName = declaredField.getName();
	    renameF(ctClass, field, newSimpleName, newRef);
	}

	private void renameF(CtType ctClass, CtField field, final String newSimpleName, CtTypeReference newRef) {
	    String oldName = field.getSimpleName();
	    CtFieldReference fref = field.getReference();
	    final CtTypeReference fdtype = fref.getDeclaringType();
	    CtField nfield = null;
	    CtTypeReference nfdtype = null;
	    // field.setSimpleName(newSimpleName);
	    final IdentityHashMap<CtElement, CtElement> collection = fields.get(field);

	    if (true) {
		for (CtElement ref : collection.keySet()) {
		    if (ref instanceof CtFieldReference) {
			CtElement oldStatement = asStatement(ref);
			String ps = withoutRenames(oldStatement);
			CtFieldReference new_name = (CtFieldReference) ref;

			if (fref == ref) {
			    continue;
			}
			new_name.setSimpleName(newSimpleName);
			new_name.setDeclaringType(newRef);

			String ps2 = withoutRenames(oldStatement);
			//CtElement p = asStatement(new_name);
			System.out.println(oldName + ": " + ps2);
			if (!newSimpleName.equals(oldName) && ps2.equals(ps)) {
			    (new RuntimeException("Unchanged")).printStackTrace();
			    printNode("OLD: " + oldName, ps, 400);
			    printNode("NEW: " + newSimpleName, ps2, 400);

			}
			nfield = new_name.getDeclaration();
			nfdtype = new_name.getDeclaringType();

		    }
		}
	    }

	    if (!newSimpleName.equals(oldName)) {
		printNode("RENAME: " + oldName, "" + newSimpleName, 400);
		renames.put(oldName, newSimpleName);
	    }

	    if (!fdtype.getSimpleName().equals(newRef.getSimpleName())) {
		noAssignFields.add(oldName);
		if (newSimpleName.equals(oldName)) {
		    printNode("REUSE: " + oldName, "" + newRef, 400);
		    printNode("DELETE: " + oldName, "" + field, 400);
		    field.delete();
		} else {
		    printNode("DELETE: " + newSimpleName, "" + field, 400);
		    fields.remove(field);
		    field.setSimpleName("DELTETED_ " + oldName);
		    field.delete();
		    fref.delete();
		}
	    }

	}

    }

    /**
     * 
     */
    private static final Class[] STATIC_IMPORT_CLASSES = new Class[] { //
	    com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.class, // 
	    com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.class, // 
	    com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.class, //
	    com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.class, // 
	    com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.class, //
	    com.cyc.tool.subl.jrtl.translatedCode.sublisp.format.class, //
	    com.cyc.tool.subl.util.SubLFiles.class, //
	    SubLTranslatedFile.class, //
	    CommonSymbols.class, //
	    CommonSymbolKWs.class, //
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

    public static Member isStaticImported(String sr) {
	for (Class c : STATIC_IMPORT_CLASSES) {
	    try {
		Field f = c.getField(sr);
		if (Modifier.isStatic(f.getModifiers())) {
		    return f;
		}
	    } catch (NoSuchFieldException | SecurityException e) {
	    }
	}
	for (Class c : STATIC_IMPORT_CLASSES) {
	    for (Method m : c.getMethods()) {
		if (Modifier.isStatic(m.getModifiers())) {
		    if (sr.equals(m.getName()))
			return m;
		}
	    }
	}
	return null;
    }

    public static String andOneDot(String qualifiedName) {
	if (true)
	    return qualifiedName;
	int lastDot = qualifiedName.lastIndexOf('.');
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
	public void calculate(CtCompilationUnit sourceCompilationUnit, List<CtType<?>> types) {
	    HashSet<CtImport> newImports = new HashSet<CtImport>();

	    CtType<?> topLevel = types.iterator().next().getTopLevelType();
	    currentOutterType = topLevel.getReference();

	    classSpooner = findSpoonInfo(topLevel);

	    final Factory factory = sourceCompilationUnit.getFactory();

	    if (true) {
		for (Class c : STATIC_IMPORT_CLASSES) {

		    CtTypeReference t = factory.createCtTypeReference(c);
		    CtTypeMemberWildcardImportReference e = factory.createTypeMemberWildcardImportReference(t);
		    CtImport ctImportImpl = t.getFactory().createImport(e);
		    newImports.add(ctImportImpl);
		}
	    }

	    if (true) {
		// import self statically
		CtTypeMemberWildcardImportReference e = factory.createTypeMemberWildcardImportReference(currentOutterType);
		CtImport ctImportImpl = factory.createImport(e);
		newImports.add(ctImportImpl);
	    }

	    sourceCompilationUnit.setImports(newImports);
	    // reset the importsContext to avoid errors with multiple CU
	    reset();

	    this.sourceCompilationUnit = sourceCompilationUnit;
	    this.imports = new HashSet<>();
	    if (sourceCompilationUnit != null) {
		this.importsContext.initWithImports(sourceCompilationUnit.getImports());
	    }

	    for (CtType<?> t : types) {
		imports.addAll(computeImports(t));
	    }
	    this.writeHeader(types, imports);
	    printTypes(types);
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
	    } catch (ParentNotInitializedException e) {

	    }
	    return importsContext.getAllImports();
	}

	/**
	 * This method is called by {@link #writeEle(CtElement)} when entering a scanned element.
	 * To be overridden to implement specific behavior.
	 *
	 * Same KISS design as for {@link CtScanner}.
	 */
	@Override
	protected void enter(CtElement e) {
	}

	/**
	 * Enters an expression.
	 */
	@Override
	protected void enterCtExpression(CtExpression<?> e) {
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
		    writeEle(r);
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
	 * This method is called by {@link #writeEle(CtElement)} when entering a scanned element.
	 * To be overridden to implement specific behavior.
	 */
	@Override
	protected void exit(CtElement e) {
	}

	/**
	 * Exits an expression.
	 */
	@Override
	protected void exitCtExpression(CtExpression<?> e) {
	    while ((!context.parenthesedExpression.isEmpty()) && e == context.parenthesedExpression.peek()) {
		context.parenthesedExpression.pop();
		printer.writeSeparator(")");
	    }
	    if (!(e instanceof CtStatement)) {
		elementPrinterHelper.writeComment(e, CommentOffset.AFTER);
	    }
	}

	/**
	 * Exits a statement.
	 */
	@Override
	protected void exitCtStatement(CtStatement statement) {
	    boolean noSemicolon = statement instanceof CtBlock || statement instanceof CtIf || //
		    statement instanceof CtFor || statement instanceof CtForEach || statement instanceof CtWhile || statement instanceof CtTry || statement instanceof CtSwitch || statement instanceof CtSynchronized || statement instanceof CtClass || statement instanceof CtComment;
	    if (!noSemicolon) {
		if (context.isStatement(statement) && !context.isFirstForVariable() && !context.isNextForVariable()) {
		    printer.writeSeparator(";");
		}
	    }
	    elementPrinterHelper.writeComment(statement, CommentOffset.AFTER);
	}

	@Override
	public PrintingContext getContext() {
	    return context;
	}

	@Override
	public ElementPrinterHelper getElementPrinterHelper() {
	    return elementPrinterHelper;
	}

	@Override
	public Map<Integer, Integer> getLineNumberMapping() {
	    return getPrinterHelper().getLineNumberMapping();
	}

	/**
	 * @return current line separator. By default there is CR LF, LF or CR depending on the Operation system
	 * defined by System.getProperty("line.separator")
	 */
	@Override
	public String getLineSeparator() {
	    return getPrinterHelper().getLineSeparator();
	}

	/**
	 * Getter. Retrieves the printer.
	 * @return the printer
	 */
	TokenWriter getPrinter() {
	    return getPrinterTokenWriter();
	}

	@Override
	public PrinterHelper getPrinterHelper() {
	    return printer.getPrinterHelper();
	}

	/**
	 * @return current {@link TokenWriter}, so the subclasses of {@link DefaultJavaPrettyPrinter} can print tokens too
	 */
	@Override
	protected TokenWriter getPrinterTokenWriter() {
	    return printer;
	}

	@Override
	public String getResult() {
	    return printer.getPrinterHelper().toString();
	}

	/**
	 * JDT doesn't support <code>new Foo<K>.Bar()</code>. To avoid reprinting this kind of type reference,
	 * we check that the reference has a declaring type with generics.
	 * See https://bugs.eclipse.org/bugs/show_bug.cgi?id=474593
	 *
	 * @param reference Type reference concerned by the bug.
	 * @return true if a declaring type has generic types.
	 */
	@Override
	public <T> boolean hasDeclaringTypeWithGenerics(CtTypeReference<T> reference) {
	    // We don't have a declaring type, it can't have generics.
	    if (reference == null) {
		return false;
	    }
	    // If the declaring type isn't a type, we don't need this hack.
	    if (reference.getDeclaringType() == null) {
		return false;
	    }
	    // If current reference is a class declared in a method, we don't need this hack.
	    if (reference.isLocalType()) {
		return false;
	    }
	    // If declaring type have generics, we return true.
	    if (!reference.getDeclaringType().getActualTypeArguments().isEmpty()) {
		return true;
	    }
	    // Checks if the declaring type has generic types.
	    return hasDeclaringTypeWithGenerics(reference.getDeclaringType());
	}

	@Override
	public boolean isImported(CtExecutableReference executableReference) {
	    if (isLocalVar(executableReference))
		return false;

	    if (executableReference.getDeclaringType() == null) {
		return false;
	    }
	    CtImport executableImport = executableReference.getFactory().createImport(executableReference);
	    if (imports.contains(executableImport)) {
		return true;
	    } else {
		if (executableReference.getDeclaringType() == null) {
		    return false;
		}
		CtTypeMemberWildcardImportReference staticTypeMemberReference = executableReference.getFactory().Type().createTypeMemberWildcardImportReference(executableReference.getDeclaringType());
		CtImport staticClassImport = executableReference.getFactory().createImport(staticTypeMemberReference);
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
	    CtImport fieldImport = fieldReference.getFactory().createImport(fieldReference);
	    if (imports.contains(fieldImport)) {
		return true;
	    } else {
		if (fieldReference.getDeclaringType() == null) {
		    return false;
		}
		CtTypeMemberWildcardImportReference staticTypeMemberReference = fieldReference.getFactory().Type().createTypeMemberWildcardImportReference(fieldReference.getDeclaringType());
		CtImport staticClassImport = fieldReference.getFactory().createImport(staticTypeMemberReference);
		return imports.contains(staticClassImport);
	    }
	}

	/**
	 * TODO Describe the purpose of this method.
	 * @param sr
	 * @throws NoSuchFieldException
	 */
	private boolean isInherited(CtReference refr, String sr) {
	    if (isLocalVar(refr))
		return false;
	    if (sr != null) {
		if (sr.equals("NIL") || sr.equals("me") || sr.equals("myName"))
		    return true;
		if (isStaticImported(sr) != null) {
		    return true;
		}
		if (refr instanceof CtFieldReference) {

		    CtTypeReference v = ((CtFieldReference) refr).getDeclaringType();
		    if (v != null && v.equals(currentType)) {
			return true;
		    }
		    return !isImported((CtFieldReference) refr);
		}
	    }
	    return false;
	}

	/**
	 * Check if the target expression is a static final field initialized in a static anonymous block.
	 */
	@Override
	public <T> boolean isInitializeStaticFinalField(CtExpression<T> targetExp) {
	    final CtElement parent;
	    final CtAnonymousExecutable anonymousParent;
	    try {
		parent = targetExp.getParent();
		anonymousParent = targetExp.getParent(CtAnonymousExecutable.class);
	    } catch (ParentNotInitializedException e) {
		return false;
	    }
	    return parent instanceof CtFieldWrite && targetExp.equals(((CtFieldWrite) parent).getTarget()) && anonymousParent != null && ((CtFieldWrite) parent).getVariable() != null && ((CtFieldWrite) parent).getVariable().getModifiers().contains(ModifierKind.STATIC)
		    && ((CtFieldWrite) parent).getVariable().getModifiers().contains(ModifierKind.FINAL);
	}

	@Override
	public <T> void printConstructorCall(CtConstructorCall<T> ctConstructorCall) {
	    try (Writable _context = context.modify()) {
		final CtExpression<?> target = ctConstructorCall.getTarget();
		if (target != null) {
		    if (!target.isImplicit()) {
			if (!isInherited(ctConstructorCall.getExecutable(), "" + target)) {
			    writeTarget(target);
			    printer.writeSeparator(".");
			} else {
			    printer.writeSeparator("/*");
			    writeTarget(target);
			    printer.writeSeparator(" printConstructorCall */");
			}
		    }
		    _context.ignoreEnclosingClass(true);
		}

		if (hasDeclaringTypeWithGenerics(ctConstructorCall.getType())) {
		    _context.ignoreEnclosingClass(true);
		}

		printer.writeKeyword("new").writeSpace();

		if (!ctConstructorCall.getActualTypeArguments().isEmpty()) {
		    elementPrinterHelper.writeActualTypeArguments(ctConstructorCall);
		}

		writeEle(ctConstructorCall.getType());
	    }

	    elementPrinterHelper.printList(ctConstructorCall.getArguments(), null, false, "(", false, false, ",", true, false, ")", exp -> writeEle(exp));
	}

	@Override
	public <T, E extends CtExpression<?>> void printCtArrayAccess(CtArrayAccess<T, E> arrayAccess) {
	    enterCtExpression(arrayAccess);
	    writeEle(arrayAccess.getTarget());
	    printer.writeSeparator("[");
	    writeEle(arrayAccess.getIndexExpression());
	    printer.writeSeparator("]");
	    exitCtExpression(arrayAccess);
	}

	@Override
	public <T> void printCtFieldAccess(CtFieldAccess<T> f) {
	    enterCtExpression(f);
	    try (Writable _context = context.modify()) {
		if ((f.getVariable().isStatic() || "class".equals(f.getVariable().getSimpleName())) && f.getTarget() instanceof CtTypeAccess) {
		    _context.ignoreGenerics(true);
		}
		CtExpression<?> target = f.getTarget();
		final CtFieldReference<T> variable = f.getVariable();
		if (target != null) {
		    boolean isInitializeStaticFinalField = isInitializeStaticFinalField(target);
		    boolean isStaticField = f.getVariable().isStatic();
		    boolean isImportedField = this.isImported(f.getVariable());

		    if (!isInitializeStaticFinalField && !(isStaticField && isImportedField)) {
			if (target.isImplicit() && !(f.getVariable().getFieldDeclaration() == null && this.env.getNoClasspath())) {
			    /*
			     * target is implicit, check whether there is no conflict with an local variable, catch variable or parameter
			     * in case of conflict make it explicit, otherwise the field access is shadowed by that variable.
			     * Search for potential variable declaration until we found a class which declares or inherits this field
			     */
			    final CtField<?> field = f.getVariable().getFieldDeclaration();
			    if (field != null) {
				final String fieldName = field.getSimpleName();
				CtVariable<?> var = f.getVariable().map(new PotentialVariableDeclarationFunction(fieldName)).first();
				if (var != field) {
				    //another variable declaration was found which is hiding the field declaration for this field access. Make the field access explicit
				    target.setImplicit(false);
				}
			    } else {
				//There is a model inconsistency
				printer.writeComment(f.getFactory().createComment("ERROR: Missing field \"" + variable.getSimpleName() + "\", please check your model. The code may not compile.", CommentType.BLOCK)).writeSpace();
			    }
			}
			// the implicit drives the separator
			final boolean wasNotImplicit = !target.isImplicit();
			if (wasNotImplicit) {
			    if (!isInherited(variable, variable.getSimpleName())) {
				writeTarget(target);
				printer.writeSeparator(".");
			    } else {
				if (false) {
				    printer.writeSeparator("/*");
				    writeTarget(target);
				    printer.writeSeparator(" printCtFieldAccess */");
				}
			    }
			} else {
			    if (false) {
				printer.writeSeparator("/*");
				writeTarget(target);
				printer.writeSeparator(" printCtFieldAccess2 */");
			    }

			}
		    }
		    _context.ignoreStaticAccess(true);
		}
		writeEle(variable);
	    }
	    exitCtExpression(f);
	}

	@Override
	public String printModuleInfo(CtModule module) {
	    reset();
	    writeEle(module);
	    return this.getResult();
	}

	@Override
	public String printPackageInfo(CtPackage pack) {
	    reset();
	    elementPrinterHelper.writeComment(pack);

	    // we need to compute imports only for annotations
	    // we don't want to get all imports coming from content of package
	    for (CtAnnotation annotation : pack.getAnnotations()) {
		importsContext.computeImports(annotation);
	    }
	    elementPrinterHelper.writeAnnotations(pack);

	    if (!pack.isUnnamedPackage()) {
		elementPrinterHelper.writePackageLine(pack.getQualifiedName());
	    }
	    elementPrinterHelper.writeImports(importsContext.getAllImports());
	    return printer.getPrinterHelper().toString();
	}

	@Override
	public boolean printQualified(CtTypeReference<?> ref) {
	    if (!isLocalVar(ref) && importsContext.isImported(ref) // If my.pkg.Something is imported
		    || (this.env.isAutoImports() && ref.getPackage() != null && "java.lang".equals(ref.getPackage().getSimpleName())) // or that we are in java.lang
	    ) {
		for (CacheBasedConflictFinder typeContext : context.currentThis) {
		    //A) we are in the context of a class which is also called "Something",
		    if (typeContext.getSimpleName().equals(ref.getSimpleName()) && !Objects.equals(typeContext.getPackage(), ref.getPackage())) {
			return true;
		    }
		    //B) we are in the context of a class which defines field which is also called "Something",
		    //	we should still use qualified version my.pkg.Something
		    if (typeContext.hasFieldConflict(ref.getSimpleName()) || typeContext.hasNestedTypeConflict(ref.getSimpleName()) // fix of #2369
		    ) {
			return true;
		    }
		}
		return false;
	    } else {
		return true;
	    }
	}

	@Override
	protected void printTypes(List<CtType<?>> types) {
	    for (CtType<?> t : types) {
		writeType(t);
		if (!env.isPreserveLineNumbers()) {
		    // saving lines and chars
		    printer.writeln().writeln();
		} else {
		    getPrinterHelper().adjustEndPosition(t);
		}
	    }
	    this.writeFooter(types);
	}

	/**
	 * TODO Describe the purpose of this method.
	 * @param t
	 */
	private void writeType(CtType<?> t) {
	    classSpooner = findSpoonInfo(t);
	    writeEle(t);
	}

	/**
	 * TODO Describe the purpose of this method. 
	 * @param e
	 */
	private void reallWriteEle(CtElement e) {
	    if (classSpooner != null)
		if (e instanceof CtFieldReference) {
		    String ss = ((CtFieldReference) e).getSimpleName();
		    String rr = ((Map<String, String>) classSpooner.renames).get(ss);
		    if (rr != null) {
			printer.writeCodeSnippet(rr);
			return;
		    }

		}
	    e.accept(this);
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

	@Override
	public DefaultJavaPrettyPrinter scan(CtElement e) {
	    return writeEle(e);
	}

	/**
	 * Creates a new code generator visitor.
	 */
	public void setDefaultJavaPrettyPrinter(Environment env) {
	    this.env = env;
	    imports = new HashSet<>();
	    setPrinterTokenWriter(new DefaultTokenWriter(new PrinterHelper(env)));
	    if (env.isAutoImports()) {
		importsContext = new ImportScannerImpl();
	    } else {
		importsContext = new MinimalImportScanner();
	    }
	}

	/**
	 * @param lineSeparator characters which will be printed as End of line.
	 * By default there is System.getProperty("line.separator")
	 */
	@Override
	public DefaultJavaPrettyPrinter setLineSeparator(String lineSeparator) {
	    getPrinterHelper().setLineSeparator(lineSeparator);
	    return this;
	}

	/**
	 * Set {@link TokenWriter}, which has to be used to print tokens
	 */
	@Override
	public DefaultJavaPrettyPrinter setPrinterTokenWriter(TokenWriter tokenWriter) {
	    elementPrinterHelper = new ElementPrinterHelper(tokenWriter, this, env);
	    printer = tokenWriter;
	    return this;
	}

	@Override
	public boolean shouldSetBracket(CtExpression<?> e) {
	    if (!e.getTypeCasts().isEmpty()) {
		return true;
	    }
	    try {
		if ((e.getParent() instanceof CtBinaryOperator) || (e.getParent() instanceof CtUnaryOperator)) {
		    return (e instanceof CtAssignment) || (e instanceof CtConditional) || (e instanceof CtUnaryOperator) || e instanceof CtBinaryOperator;
		}
		if (e.getParent() instanceof CtTargetedExpression && ((CtTargetedExpression) e.getParent()).getTarget() == e) {
		    return (e instanceof CtBinaryOperator) || (e instanceof CtAssignment) || (e instanceof CtConditional) || (e instanceof CtUnaryOperator);
		}
	    } catch (ParentNotInitializedException ex) {
		// nothing we accept not to have a parent
	    }
	    return false;
	}

	/**
	 * Gets the currently pretty-printed string.
	 */
	@Override
	public String toString() {
	    return printer.getPrinterHelper().toString();
	}

	@Override
	public <A extends Annotation> void visitCtAnnotation(CtAnnotation<A> annotation) {
	    elementPrinterHelper.writeAnnotations(annotation);
	    printer.writeSeparator("@");
	    writeEle(annotation.getAnnotationType());
	    if (!annotation.getValues().isEmpty()) {
		elementPrinterHelper.printList(annotation.getValues().entrySet(), null, false, "(", false, false, ",", true, false, ")", e -> {
		    if ((annotation.getValues().size() == 1 && "value".equals(e.getKey())) == false) {
			//it is not a default value attribute. We must print a attribute name too.
			printer.writeIdentifier(e.getKey()).writeSpace().writeOperator("=").writeSpace();
		    }
		    elementPrinterHelper.writeAnnotationElement(annotation.getFactory(), e.getValue());
		});
	    }
	}

	@Override
	public <T> void visitCtAnnotationFieldAccess(CtAnnotationFieldAccess<T> annotationFieldAccess) {
	    enterCtExpression(annotationFieldAccess);
	    try (Writable _context = context.modify()) {
		if (annotationFieldAccess.getTarget() != null) {
		    writeEle(annotationFieldAccess.getTarget());
		    printer.writeSeparator(".");
		    _context.ignoreStaticAccess(true);
		}
		_context.ignoreGenerics(true);
		writeEle(annotationFieldAccess.getVariable());
		printer.writeSeparator("(").writeSeparator(")");
	    }
	    exitCtExpression(annotationFieldAccess);
	}

	@Override
	public <T> void visitCtAnnotationMethod(CtAnnotationMethod<T> annotationMethod) {
	    elementPrinterHelper.writeComment(annotationMethod);
	    elementPrinterHelper.visitCtNamedElement(annotationMethod, sourceCompilationUnit);
	    elementPrinterHelper.writeModifiers(annotationMethod);
	    writeEle(annotationMethod.getType());
	    printer.writeSpace();
	    printer.writeIdentifier(annotationMethod.getSimpleName());

	    printer.writeSeparator("(").writeSeparator(")");
	    if (annotationMethod.getDefaultExpression() != null) {
		printer.writeSpace().writeKeyword("default").writeSpace();
		writeEle(annotationMethod.getDefaultExpression());
	    }
	    printer.writeSeparator(";");
	}

	@Override
	public <A extends Annotation> void visitCtAnnotationType(CtAnnotationType<A> annotationType) {
	    visitCtType(annotationType);
	    printer.writeSeparator("@").writeKeyword("interface").writeSpace().writeIdentifier(annotationType.getSimpleName()).writeSpace().writeSeparator("{").incTab();

	    elementPrinterHelper.writeElementList(annotationType.getTypeMembers());
	    printer.decTab().writeSeparator("}");
	}

	@Override
	public void visitCtAnonymousExecutable(CtAnonymousExecutable impl) {
	    elementPrinterHelper.writeComment(impl);
	    elementPrinterHelper.writeAnnotations(impl);
	    elementPrinterHelper.writeModifiers(impl);
	    writeEle(impl.getBody());
	}

	@Override
	public <T> void visitCtArrayRead(CtArrayRead<T> arrayRead) {
	    printCtArrayAccess(arrayRead);
	}

	@Override
	public <T> void visitCtArrayTypeReference(CtArrayTypeReference<T> reference) {
	    if (reference.isImplicit()) {
		return;
	    }
	    writeEle(reference.getComponentType());
	    if (!context.skipArray()) {
		printer.writeSeparator("[").writeSeparator("]");
	    }
	}

	@Override
	public <T> void visitCtArrayWrite(CtArrayWrite<T> arrayWrite) {
	    printCtArrayAccess(arrayWrite);
	}

	@Override
	public <T> void visitCtAssert(CtAssert<T> asserted) {
	    enterCtStatement(asserted);
	    printer.writeKeyword("assert").writeSpace();
	    final CtExpression<Boolean> assertExpression = asserted.getAssertExpression();
	    String s = "" + assertExpression;
	    writeEle(assertExpression);
	    if (asserted.getExpression() != null) {
		printer.writeSpace().writeSeparator(":").writeSpace();
		printer.writeSeparator("\"" + LiteralHelper.getStringLiteral((String) s, true) + " \" + ");
		writeEle(asserted.getExpression());
	    }
	    exitCtStatement(asserted);
	}

	@Override
	public <T, A extends T> void visitCtAssignment(CtAssignment<T, A> assignement) {
	    enterCtStatement(assignement);
	    enterCtExpression(assignement);
	    final CtExpression<T> assigned = assignement.getAssigned();
	    if (assigned instanceof CtFieldWrite) {
		CtFieldReference variable = ((CtFieldWrite) assigned).getVariable();
		String simpleName = variable.getSimpleName();
		if (classSpooner != null && classSpooner.noAssignFields.contains(simpleName)) {
		    return;
		}
		if (isStaticImported(simpleName) instanceof Field) {
		    return;
		}
	    }
	    writeEle(assigned);
	    printer.writeSpace().writeOperator("=").writeSpace();
	    writeEle(assignement.getAssignment());
	    exitCtExpression(assignement);
	    exitCtStatement(assignement);
	}

	@Override
	public <T> void visitCtBinaryOperator(CtBinaryOperator<T> operator) {
	    enterCtExpression(operator);
	    writeEle(operator.getLeftHandOperand());
	    printer.writeSpace();
	    printer.writeOperator(OperatorHelper.getOperatorText(operator.getKind()));
	    printer.writeSpace();
	    try (Writable _context = context.modify()) {
		if (operator.getKind() == BinaryOperatorKind.INSTANCEOF) {
		    _context.forceWildcardGenerics(true);
		}
		writeEle(operator.getRightHandOperand());
	    }
	    exitCtExpression(operator);
	}

	@Override
	public <R> void visitCtBlock(CtBlock<R> block) {
	    enterCtStatement(block);
	    if (!block.isImplicit()) {
		printer.writeSeparator("{");
	    }
	    printer.incTab();

	    for (CtStatement statement : block.getStatements()) {
		currentStatement = statement;
		if (!statement.isImplicit()) {
		    printer.writeln();
		    if (statement instanceof CtAssignment && lastStatement instanceof CtAssignment) {
			elementPrinterHelper.writeStatement(statement);
		    } else {
			elementPrinterHelper.writeStatement(statement);
		    }
		    lastStatement = statement;
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

	@Override
	public void visitCtBreak(CtBreak breakStatement) {
	    enterCtStatement(breakStatement);
	    printer.writeKeyword("break");
	    if (breakStatement.getTargetLabel() != null) {
		printer.writeSpace().writeKeyword(breakStatement.getTargetLabel());
	    }
	    exitCtStatement(breakStatement);
	}

	@Override
	@SuppressWarnings("rawtypes")
	public <E> void visitCtCase(CtCase<E> caseStatement) {
	    enterCtStatement(caseStatement);
	    if (caseStatement.getCaseExpression() != null) {
		printer.writeKeyword("case").writeSpace();
		// writing enum case expression
		if (caseStatement.getCaseExpression() instanceof CtFieldAccess) {
		    final CtFieldReference variable = ((CtFieldAccess) caseStatement.getCaseExpression()).getVariable();
		    // In noclasspath mode, we don't have always the type of the declaring type.
		    if (variable.getType() != null && variable.getDeclaringType() != null && variable.getType().getQualifiedName().equals(variable.getDeclaringType().getQualifiedName())) {
			printer.writeIdentifier(variable.getSimpleName());
		    } else {
			writeEle(caseStatement.getCaseExpression());
		    }
		} else {
		    writeEle(caseStatement.getCaseExpression());
		}
	    } else {
		printer.writeKeyword("default");
	    }
	    printer.writeSpace().writeSeparator(":").incTab();

	    for (CtStatement statement : caseStatement.getStatements()) {
		printer.writeln();
		elementPrinterHelper.writeStatement(statement);
	    }
	    printer.decTab();
	    exitCtStatement(caseStatement);
	}

	@Override
	public void visitCtCatch(CtCatch catchBlock) {
	    elementPrinterHelper.writeComment(catchBlock, CommentOffset.BEFORE);
	    printer.writeSpace().writeKeyword("catch").writeSpace().writeSeparator("(");
	    CtCatchVariable<? extends Throwable> parameter = catchBlock.getParameter();
	    if (parameter != null && parameter.getMultiTypes().size() > 1) {
		elementPrinterHelper.printList(parameter.getMultiTypes(), null, false, null, false, true, "|", true, false, null, type -> writeEle(type));
		printer.writeSpace().writeIdentifier(parameter.getSimpleName());
	    } else {
		writeEle(parameter);
	    }
	    printer.writeSeparator(")").writeSpace();
	    writeEle(catchBlock.getBody());
	}

	@Override
	public <T> void visitCtCatchVariable(CtCatchVariable<T> catchVariable) {
	    if (env.isPreserveLineNumbers()) {
		getPrinterHelper().adjustStartPosition(catchVariable);
	    }
	    elementPrinterHelper.writeModifiers(catchVariable);
	    writeEle(catchVariable.getType());
	    printer.writeSpace();
	    printer.writeIdentifier(catchVariable.getSimpleName());
	}

	@Override
	public <T> void visitCtCatchVariableReference(CtCatchVariableReference<T> reference) {
	    printer.writeIdentifier(reference.getSimpleName());
	}

	@Override
	public <T> void visitCtClass(CtClass<T> ctClass) {
	    context.pushCurrentThis(ctClass);
	    currentType = ctClass.getReference();//.getDeclaringType();
	    CtType decCtClass = ctClass.getDeclaringType();
	    if (decCtClass == null) {
		currentOutterType = ctClass.getReference();//.getDeclaringType();
	    }

	    String simpleName = ctClass.getSimpleName();
	    if (simpleName != null && !CtType.NAME_UNKNOWN.equals(simpleName) && !ctClass.isAnonymous()) {
		visitCtType(ctClass);
		String simpleName2 = ctClass.getSimpleName();
		if (ctClass.isLocalType()) {
		    printer.writeKeyword("class").writeSpace().writeIdentifier(simpleName2.replaceAll("^[0-9]*", ""));
		} else {
		    printer.writeKeyword("class").writeSpace().writeIdentifier(simpleName2);
		}

		elementPrinterHelper.writeFormalTypeParameters(ctClass);
		elementPrinterHelper.writeExtendsClause(ctClass);
		elementPrinterHelper.writeImplementsClause(ctClass);
	    }
	    printer.writeSpace().writeSeparator("{").incTab();
	    elementPrinterHelper.writeElementList(ctClass.getTypeMembers());
	    getPrinterHelper().adjustEndPosition(ctClass);
	    printer.decTab().writeSeparator("}");
	    context.popCurrentThis();
	}

	@Override
	public <T> void visitCtCodeSnippetExpression(CtCodeSnippetExpression<T> expression) {
	    elementPrinterHelper.writeComment(expression);
	    final String value = expression.getValue();
	    printer.writeCodeSnippet(value);
	}

	@Override
	public void visitCtCodeSnippetStatement(CtCodeSnippetStatement statement) {
	    enterCtStatement(statement);
	    printer.writeCodeSnippet(statement.getValue());
	    exitCtStatement(statement);
	}

	@Override
	public void visitCtComment(CtComment comment) {
	    if (!env.isCommentsEnabled() && context.elementStack.size() > 1) {
		return;
	    }
	    printer.writeComment(comment);
	}

	@Override
	public void visitCtCompilationUnit(CtCompilationUnit compilationUnit) {
	    switch (compilationUnit.getUnitType()) {
		case MODULE_DECLARATION:
		    //TODO print module declaration
		    break;
		case PACKAGE_DECLARATION:
		    //TODO print package declaration
		    break;
		case TYPE_DECLARATION:
		    calculate(compilationUnit, compilationUnit.getDeclaredTypes());
		    break;
		default:
		    throw new SpoonException("Cannot print compilation unit of type " + compilationUnit.getUnitType());
	    }
	}

	@Override
	public <T> void visitCtConditional(CtConditional<T> conditional) {
	    enterCtExpression(conditional);
	    CtExpression<Boolean> condition = conditional.getCondition();
	    boolean parent;
	    try {
		parent = conditional.getParent() instanceof CtAssignment || conditional.getParent() instanceof CtVariable;
	    } catch (ParentNotInitializedException ex) {
		// nothing if we have no parent
		parent = false;
	    }
	    if (parent) {
		printer.writeSeparator("(");
	    }
	    writeEle(condition);
	    if (parent) {
		printer.writeSeparator(")");
	    }
	    printer.writeSpace().writeOperator("?").writeSpace();
	    CtExpression<T> thenExpression = conditional.getThenExpression();
	    writeEle(thenExpression);
	    printer.writeSpace().writeOperator(":").writeSpace();

	    CtExpression<T> elseExpression = conditional.getElseExpression();
	    boolean isAssign = (elseExpression instanceof CtAssignment);

	    if (isAssign) {
		printer.writeSeparator("(");
	    }
	    writeEle(elseExpression);
	    if (isAssign) {
		printer.writeSeparator(")");
	    }
	    exitCtExpression(conditional);
	}

	@Override
	public <T> void visitCtConstructor(CtConstructor<T> constructor) {
	    elementPrinterHelper.writeComment(constructor);
	    elementPrinterHelper.visitCtNamedElement(constructor, sourceCompilationUnit);
	    elementPrinterHelper.writeModifiers(constructor);
	    elementPrinterHelper.writeFormalTypeParameters(constructor);
	    if (!constructor.getFormalCtTypeParameters().isEmpty()) {
		printer.writeSpace();
	    }
	    if (constructor.getDeclaringType() != null) {
		if (constructor.getDeclaringType().isLocalType()) {
		    printer.writeIdentifier(constructor.getDeclaringType().getSimpleName().replaceAll("^[0-9]*", ""));
		} else {
		    printer.writeIdentifier(constructor.getDeclaringType().getSimpleName());
		}
	    }
	    elementPrinterHelper.writeExecutableParameters(constructor);
	    elementPrinterHelper.writeThrowsClause(constructor);
	    printer.writeSpace();
	    writeEle(constructor.getBody());
	}

	@Override
	public <T> void visitCtConstructorCall(CtConstructorCall<T> ctConstructorCall) {
	    enterCtStatement(ctConstructorCall);
	    enterCtExpression(ctConstructorCall);

	    printConstructorCall(ctConstructorCall);

	    exitCtExpression(ctConstructorCall);
	    exitCtStatement(ctConstructorCall);
	}

	@Override
	public void visitCtContinue(CtContinue continueStatement) {
	    enterCtStatement(continueStatement);
	    printer.writeKeyword("continue");
	    if (continueStatement.getTargetLabel() != null) {
		printer.writeSpace().writeIdentifier(continueStatement.getTargetLabel());
	    }
	    exitCtStatement(continueStatement);
	}

	@Override
	public void visitCtDo(CtDo doLoop) {
	    enterCtStatement(doLoop);
	    printer.writeKeyword("do");
	    elementPrinterHelper.writeIfOrLoopBlock(doLoop.getBody());
	    printer.writeKeyword("while").writeSpace().writeSeparator("(");
	    writeEle(doLoop.getLoopingExpression());
	    printer.writeSpace().writeSeparator(")");
	    exitCtStatement(doLoop);
	}

	@Override
	public <T extends Enum<?>> void visitCtEnum(CtEnum<T> ctEnum) {
	    visitCtType(ctEnum);
	    printer.writeKeyword("enum").writeSpace().writeIdentifier(ctEnum.getSimpleName());
	    elementPrinterHelper.writeImplementsClause(ctEnum);
	    context.pushCurrentThis(ctEnum);
	    printer.writeSpace().writeSeparator("{").incTab().writeln();

	    if (ctEnum.getEnumValues().isEmpty()) {
		printer.writeSeparator(";").writeln();
	    } else {
		elementPrinterHelper.printList(ctEnum.getEnumValues(), null, false, null, false, false, ",", false, false, ";", enumValue -> {
		    printer.writeln();
		    writeEle(enumValue);
		});
	    }

	    elementPrinterHelper.writeElementList(ctEnum.getTypeMembers());
	    printer.decTab().writeSeparator("}");
	    context.popCurrentThis();
	}

	@Override
	public <T> void visitCtEnumValue(CtEnumValue<T> enumValue) {
	    elementPrinterHelper.visitCtNamedElement(enumValue, sourceCompilationUnit);
	    elementPrinterHelper.writeComment(enumValue, CommentOffset.BEFORE);
	    printer.writeIdentifier(enumValue.getSimpleName());
	    if (enumValue.getDefaultExpression() != null) {
		CtConstructorCall<?> constructorCall = (CtConstructorCall<?>) enumValue.getDefaultExpression();
		if (!constructorCall.isImplicit()) {
		    elementPrinterHelper.printList(constructorCall.getArguments(), null, false, "(", false, false, ",", true, false, ")", expr -> writeEle(expr));
		}
		if (constructorCall instanceof CtNewClass) {
		    writeEle(((CtNewClass<?>) constructorCall).getAnonymousClass());
		}
	    }
	}

	@Override
	public <T> void visitCtExecutableReference(CtExecutableReference<T> reference) {
	    //it is not called during printing of sources. Use shortcut and print directly to PrinterHelper
	    printer.getPrinterHelper().write(reference.getSignature());
	}

	@Override
	public <T, E extends CtExpression<?>> void visitCtExecutableReferenceExpression(CtExecutableReferenceExpression<T, E> expression) {
	    enterCtExpression(expression);
	    try (Writable _context = context.modify()) {
		if (expression.getExecutable().isStatic()) {
		    _context.ignoreGenerics(true);
		}
		writeEle(expression.getTarget());
	    }
	    printer.writeSeparator("::");
	    if (expression.getExecutable().isConstructor()) {
		printer.writeKeyword("new");
	    } else {
		printer.writeIdentifier(expression.getExecutable().getSimpleName());
	    }
	    exitCtExpression(expression);
	}

	@Override
	public <T> void visitCtField(CtField<T> f) {
	    elementPrinterHelper.writeComment(f, CommentOffset.BEFORE);
	    elementPrinterHelper.visitCtNamedElement(f, sourceCompilationUnit);
	    elementPrinterHelper.writeModifiers(f);
	    writeEle(f.getType());
	    printer.writeSpace();
	    printer.writeIdentifier(f.getSimpleName());

	    if (f.getDefaultExpression() != null) {
		printer.writeSpace().writeOperator("=").writeSpace();
		writeEle(f.getDefaultExpression());
	    } else {

	    }
	    printer.writeSeparator(";");
	    elementPrinterHelper.writeComment(f, CommentOffset.AFTER);
	}

	@Override
	public <T> void visitCtFieldRead(CtFieldRead<T> fieldRead) {
	    printCtFieldAccess(fieldRead);
	}

	@Override
	public <T> void visitCtFieldReference(CtFieldReference<T> reference) {
	    String simpleName = reference.getSimpleName();
	    final boolean isClass = "class".equals(simpleName);
	    boolean isStatic = isClass || !"super".equals(simpleName) && reference.isStatic();

	    boolean printType = true;

	    final CtTypeReference<?> declaringType = reference.getDeclaringType();
	    final CtField<T> declaration = reference.getDeclaration();
	    if (declaration != null) {
		String simpleNameF = declaration.getSimpleName();
		if (!simpleName.equals(simpleNameF)) {
		    reference.setSimpleName(simpleNameF);
		}
	    }

	    if (reference.isFinal() && reference.isStatic()) {
		CtTypeReference<?> declTypeRef = declaringType;
		if (declTypeRef.isAnonymous()) {
		    //never print anonymous class ref
		    printType = false;
		} else {
		    if (context.isInCurrentScope(declTypeRef)) {
			//do not printType if we are in scope of that type
			printType = false;
		    }
		}
	    } else {
		CtTypeReference<?> declTypeRef = declaringType;
		if (declTypeRef.isAnonymous()) {
		    //never print anonymous class ref
		    printType = false;
		} else {
		    if (context.isInCurrentScope(declTypeRef)) {
			//do not printType if we are in scope of that type
			printType = false;
		    }
		}
	    }

	    final boolean reallyPrintType = isStatic && printType && !context.ignoreStaticAccess();

	    final boolean inherited = isInherited(reference, "" + simpleName);

	    if (reallyPrintType && !inherited && !isClass) {
		try (Writable _context = context.modify().ignoreGenerics(true)) {
		    writeEle(declaringType);
		}
		printer.writeSeparator(".");
	    } else {
		if (isClass) {
		    printer.writeSeparator("/*class*/");
		    try (Writable _context = context.modify().ignoreGenerics(true)) {
			writeEle(declaringType);
		    }
		    printer.writeSeparator(".");
		} else {
		    //printer.writeSeparator("/**/");
		    ///writeTarget(declaringType);
		    ///printer.writeSeparator(" visitCtFieldReference */");
		}

	    }
	    if (isClass) {
		printer.writeKeyword("class");
	    } else {
		printer.writeIdentifier(simpleName);
	    }
	}

	@Override
	public <T> void visitCtFieldWrite(CtFieldWrite<T> fieldWrite) {
	    printCtFieldAccess(fieldWrite);
	}

	@Override
	public void visitCtFor(CtFor forLoop) {
	    enterCtStatement(forLoop);
	    printer.writeKeyword("for").writeSpace().writeSeparator("(");
	    List<CtStatement> st = forLoop.getForInit();
	    if (!st.isEmpty()) {
		try (Writable _context = context.modify().isFirstForVariable(true)) {
		    writeEle(st.get(0));
		}
	    }
	    if (st.size() > 1) {
		try (Writable _context = context.modify().isNextForVariable(true)) {
		    for (int i = 1; i < st.size(); i++) {
			printer.writeSeparator(",").writeSpace();
			writeEle(st.get(i));
		    }
		}
	    }
	    printer.writeSeparator(";").writeSpace();
	    writeEle(forLoop.getExpression());
	    printer.writeSeparator(";");
	    if (!forLoop.getForUpdate().isEmpty()) {
		printer.writeSpace();
	    }
	    elementPrinterHelper.printList(forLoop.getForUpdate(), null, false, null, false, true, ",", true, false, null, s -> writeEle(s));
	    printer.writeSeparator(")");
	    elementPrinterHelper.writeIfOrLoopBlock(forLoop.getBody());
	    exitCtStatement(forLoop);
	}

	@Override
	public void visitCtForEach(CtForEach foreach) {
	    enterCtStatement(foreach);
	    printer.writeKeyword("for").writeSpace().writeSeparator("(");
	    writeEle(foreach.getVariable());
	    printer.writeSpace().writeSeparator(":").writeSpace();
	    writeEle(foreach.getExpression());
	    printer.writeSeparator(")");
	    elementPrinterHelper.writeIfOrLoopBlock(foreach.getBody());
	    exitCtStatement(foreach);
	}

	@Override
	public void visitCtIf(CtIf ifElement) {
	    enterCtStatement(ifElement);
	    printer.writeKeyword("if").writeSpace().writeSeparator("(");
	    writeEle(ifElement.getCondition());
	    printer.writeSeparator(")");
	    CtStatement thenStmt = ifElement.getThenStatement();
	    CtStatement elseStmt = ifElement.getElseStatement();
	    elementPrinterHelper.writeIfOrLoopBlock(thenStmt);
	    if (elseStmt != null) {
		List<CtComment> comments = elementPrinterHelper.getComments(ifElement, CommentOffset.INSIDE);
		if (thenStmt != null) {
		    SourcePosition thenPosition = thenStmt.getPosition();
		    if (!thenPosition.isValidPosition() && thenStmt instanceof CtBlock) {
			CtStatement thenExpression = ((CtBlock) thenStmt).getStatement(0);
			thenPosition = thenExpression.getPosition();
		    }
		    for (CtComment comment : comments) {
			if (comment.getPosition().getSourceStart() > thenPosition.getSourceEnd()) {
			    elementPrinterHelper.writeComment(comment);
			}
		    }
		}
		if (thenStmt instanceof CtBlock && !thenStmt.isImplicit()) {
		    //add space after non implicit block
		    printer.writeSpace();
		}
		printer.writeKeyword("else");
		elementPrinterHelper.writeIfOrLoopBlock(elseStmt);
	    }
	    exitCtStatement(ifElement);
	}

	@Override
	public void visitCtImport(CtImport ctImport) {
	    if (ctImport.getImportKind() != null) {
		printer.writeKeyword("import");
		printer.writeSpace();

		switch (ctImport.getImportKind()) {
		    case TYPE:
			visitCtTypeReference((CtTypeReference) ctImport.getReference());
			break;

		    case METHOD:
			printer.writeKeyword("static");
			printer.writeSpace();
			visitCtExecutableReference((CtExecutableReference) ctImport.getReference());
			break;

		    case FIELD:
			printer.writeKeyword("static");
			printer.writeSpace();
			visitCtFieldReference((CtFieldReference) ctImport.getReference());
			break;

		    case ALL_TYPES:
			visitCtPackageReference((CtPackageReference) ctImport.getReference());
			printer.writeSeparator(".");
			printer.writeIdentifier("*");
			break;

		    case ALL_STATIC_MEMBERS:
			printer.writeKeyword("static");
			printer.writeSpace();
			visitCtTypeReference(((CtTypeMemberWildcardImportReference) ctImport.getReference()).getTypeReference());
			printer.writeSeparator(".");
			printer.writeIdentifier("*");
			break;
		    case UNRESOLVED:
			CtUnresolvedImport ctUnresolvedImport = (CtUnresolvedImport) ctImport;
			if (ctUnresolvedImport.isStatic()) {
			    printer.writeKeyword("static");
			    printer.writeSpace();
			}
			printer.writeCodeSnippet(ctUnresolvedImport.getUnresolvedReference());
		}
		printer.writeSeparator(";");
		printer.writeln();
	    }
	}

	@Override
	public <T> void visitCtInterface(CtInterface<T> intrface) {
	    visitCtType(intrface);
	    printer.writeKeyword("interface").writeSpace().writeIdentifier(intrface.getSimpleName());
	    if (intrface.getFormalCtTypeParameters() != null) {
		elementPrinterHelper.writeFormalTypeParameters(intrface);
	    }

	    if (!intrface.getSuperInterfaces().isEmpty()) {
		elementPrinterHelper.printList(intrface.getSuperInterfaces(), "extends", false, null, false, true, ",", true, false, null, ref -> writeEle(ref));
	    }
	    context.pushCurrentThis(intrface);
	    printer.writeSpace().writeSeparator("{").incTab();
	    // Content
	    elementPrinterHelper.writeElementList(intrface.getTypeMembers());
	    printer.decTab().writeSeparator("}");
	    context.popCurrentThis();
	}

	@Override
	public <T> void visitCtIntersectionTypeReference(CtIntersectionTypeReference<T> reference) {
	    if (reference.isImplicit()) {
		return;
	    }
	    elementPrinterHelper.printList(reference.getBounds(), null, false, null, false, true, "&", true, false, null, bound -> writeEle(bound));
	}

	@Override
	public <T> void visitCtInvocation(CtInvocation<T> invocation) {
	    enterCtStatement(invocation);
	    enterCtExpression(invocation);
	    if (invocation.getExecutable().isConstructor()) {
		// It's a constructor (super or this)
		elementPrinterHelper.writeActualTypeArguments(invocation.getExecutable());
		CtType<?> parentType;
		try {
		    parentType = invocation.getParent(CtType.class);
		} catch (ParentNotInitializedException e) {
		    parentType = null;
		}
		if (parentType != null && parentType.getQualifiedName() != null && parentType.getQualifiedName().equals(invocation.getExecutable().getDeclaringType().getQualifiedName())) {
		    printer.writeKeyword("this");
		} else {
		    final CtExpression<?> target = invocation.getTarget();
		    if (target != null && !target.isImplicit()) {
			final boolean inherited = isInherited(invocation.getExecutable(), "" + target);
			if (!inherited) {
			    writeTarget(target);
			    printer.writeSeparator(".");
			} else {
			    printer.writeSeparator("/* inherited ");
			    writeTarget(target);
			    printer.writeSeparator(". */");
			}
		    }
		    printer.writeKeyword("super");
		}
	    } else {
		// It's a method invocation
		final CtExecutableReference<T> executable = invocation.getExecutable();
		boolean isImported = this.isImported(executable);
		if (!isImported) {
		    try (Writable _context = context.modify()) {
			final CtExpression<?> target = invocation.getTarget();
			if (target instanceof CtTypeAccess) {
			    _context.ignoreGenerics(true);
			}
			if (target != null && !target.isImplicit()) {
			    final boolean qualiy = !isInherited(executable, executable.getSimpleName());
			    if (qualiy || true) {
				writeTarget(target);
				printer.writeSeparator(".");
			    } else {
				printer.writeSeparator("/* ");
				writeTarget(target);
				printer.writeSeparator(". invokexec */");
			    }
			}
		    }
		}

		elementPrinterHelper.writeActualTypeArguments(invocation);
		if (env.isPreserveLineNumbers()) {
		    getPrinterHelper().adjustStartPosition(invocation);
		}
		printer.writeIdentifier(invocation.getExecutable().getSimpleName());
	    }
	    elementPrinterHelper.printList(invocation.getArguments(), null, false, "(", false, false, ",", true, false, ")", e -> writeEle(e));
	    exitCtExpression(invocation);
	    exitCtStatement(invocation);
	}

	@Override
	public void visitCtJavaDoc(CtJavaDoc comment) {
	    visitCtComment(comment);
	}

	@Override
	public void visitCtJavaDocTag(CtJavaDocTag docTag) {
	    /*
	     * is not called during normal printing of java sources.
	     * It can be called only when CtJavaDocTag has to be printed directly.
	     * E.g. from CtJavaDocTag#toString
	     * Write directly to PrinterHelper, because java doc tag is not a java token. Normally it is part of COMMENT token.
	     */
	    CommentHelper.printJavaDocTag(printer.getPrinterHelper(), docTag, x -> {
		return x;
	    });
	}

	@Override
	public <T> void visitCtLambda(CtLambda<T> lambda) {
	    enterCtExpression(lambda);

	    elementPrinterHelper.printList(lambda.getParameters(), null, false, "(", false, false, ",", false, false, ")", parameter -> writeEle(parameter));
	    printer.writeSpace();
	    printer.writeSeparator("->");
	    printer.writeSpace();

	    if (lambda.getBody() != null) {
		writeEle(lambda.getBody());
	    } else {
		writeEle(lambda.getExpression());
	    }
	    exitCtExpression(lambda);
	}

	@Override
	public <T> void visitCtLiteral(CtLiteral<T> literal) {
	    enterCtExpression(literal);
	    printer.writeLiteral(LiteralHelper.getLiteralToken(literal));
	    exitCtExpression(literal);
	}

	@Override
	public <T> void visitCtLocalVariable(CtLocalVariable<T> localVariable) {
	    enterCtStatement(localVariable);
	    if (env.isPreserveLineNumbers()) {
		getPrinterHelper().adjustStartPosition(localVariable);
	    }
	    if (!context.isNextForVariable()) {
		elementPrinterHelper.writeModifiers(localVariable);
		if (localVariable.isInferred() && this.env.getComplianceLevel() >= 10) {
		    getPrinterTokenWriter().writeKeyword("var");
		} else {
		    writeEle(localVariable.getType());
		}
		printer.writeSpace();
	    }
	    printer.writeIdentifier(localVariable.getSimpleName());
	    if (localVariable.getDefaultExpression() != null) {
		printer.writeSpace().writeOperator("=").writeSpace();
		writeEle(localVariable.getDefaultExpression());
	    }
	    exitCtStatement(localVariable);
	}

	@Override
	public <T> void visitCtLocalVariableReference(CtLocalVariableReference<T> reference) {
	    printer.writeIdentifier(reference.getSimpleName());
	}

	@Override
	public <T> void visitCtMethod(CtMethod<T> m) {
	    elementPrinterHelper.writeComment(m, CommentOffset.BEFORE);
	    elementPrinterHelper.visitCtNamedElement(m, sourceCompilationUnit);
	    elementPrinterHelper.writeModifiers(m);
	    elementPrinterHelper.writeFormalTypeParameters(m);
	    if (!m.getFormalCtTypeParameters().isEmpty()) {
		printer.writeSpace();
	    }
	    try (Writable _context = context.modify().ignoreGenerics(false)) {
		writeEle(m.getType());
	    }
	    printer.writeSpace();
	    printer.writeIdentifier(m.getSimpleName());
	    elementPrinterHelper.writeExecutableParameters(m);
	    elementPrinterHelper.writeThrowsClause(m);
	    if (m.getBody() != null) {
		printer.writeSpace();
		writeEle(m.getBody());
		if (m.getBody().getPosition().isValidPosition()) {
		    if (m.getBody().getPosition().getCompilationUnit() == sourceCompilationUnit) {
			if (m.getBody().getStatements().isEmpty() || !(m.getBody().getStatements().get(m.getBody().getStatements().size() - 1) instanceof CtReturn)) {
			    getPrinterHelper().putLineNumberMapping(m.getBody().getPosition().getEndLine());
			}
		    } else {
			getPrinterHelper().undefineLine();
		    }
		} else {
		    getPrinterHelper().undefineLine();
		}
	    } else {
		printer.writeSeparator(";");
	    }
	    elementPrinterHelper.writeComment(m, CommentOffset.AFTER);
	}

	@Override
	public void visitCtModule(CtModule module) {
	    enter(module);
	    if (module.isOpenModule()) {
		printer.writeKeyword("open").writeSpace();
	    }
	    printer.writeKeyword("module").writeSpace().writeIdentifier(module.getSimpleName());
	    printer.writeSpace().writeSeparator("{").incTab().writeln();

	    for (CtModuleDirective moduleDirective : module.getModuleDirectives()) {
		writeEle(moduleDirective);
	    }

	    printer.decTab().writeSeparator("}");
	    exit(module);
	}

	@Override
	public void visitCtModuleReference(CtModuleReference moduleReference) {
	    printer.writeIdentifier(moduleReference.getSimpleName());
	}

	@Override
	public void visitCtModuleRequirement(CtModuleRequirement moduleRequirement) {
	    printer.writeKeyword("requires").writeSpace();

	    if (!moduleRequirement.getRequiresModifiers().isEmpty()) {
		this.elementPrinterHelper.printList(moduleRequirement.getRequiresModifiers(), null, false, null, false, false, " ", false, false, " ", modifier -> printer.writeKeyword(modifier.name().toLowerCase()));
	    }

	    writeEle(moduleRequirement.getModuleReference());
	    printer.writeSeparator(";").writeln();
	}

	@Override
	@SuppressWarnings("rawtypes")
	public <T> void visitCtNewArray(CtNewArray<T> newArray) {
	    enterCtExpression(newArray);
	    boolean isNotInAnnotation;
	    try {
		isNotInAnnotation = (newArray.getParent(CtAnnotationType.class) == null) && (newArray.getParent(CtAnnotation.class) == null);
	    } catch (ParentNotInitializedException e) {
		isNotInAnnotation = true;
	    }

	    if (isNotInAnnotation) {
		CtTypeReference<?> ref = newArray.getType();

		if (ref != null) {
		    printer.writeKeyword("new").writeSpace();
		}

		try (Writable _context = context.modify().skipArray(true)) {
		    writeEle(ref);
		}
		for (int i = 0; ref instanceof CtArrayTypeReference; i++) {
		    printer.writeSeparator("[");
		    if (newArray.getDimensionExpressions().size() > i) {
			CtExpression<Integer> e = newArray.getDimensionExpressions().get(i);
			writeEle(e);
		    }
		    printer.writeSeparator("]");
		    ref = ((CtArrayTypeReference) ref).getComponentType();
		}
	    }
	    if (newArray.getDimensionExpressions().isEmpty()) {
		elementPrinterHelper.printList(newArray.getElements(), null, false, "{", true, false, ",", true, true, "}", e -> writeEle(e));
		elementPrinterHelper.writeComment(newArray, CommentOffset.INSIDE);
	    }
	    elementPrinterHelper.writeComment(newArray, CommentOffset.AFTER);
	    exitCtExpression(newArray);
	}

	@Override
	public <T> void visitCtNewClass(CtNewClass<T> newClass) {
	    enterCtStatement(newClass);
	    enterCtExpression(newClass);

	    printConstructorCall(newClass);

	    writeEle(newClass.getAnonymousClass());
	    exitCtExpression(newClass);
	    exitCtStatement(newClass);
	}

	@Override
	public <T, A extends T> void visitCtOperatorAssignment(CtOperatorAssignment<T, A> assignment) {
	    enterCtStatement(assignment);
	    enterCtExpression(assignment);
	    writeEle(assignment.getAssigned());
	    printer.writeSpace();
	    // the operators like +=, *= are sent as one operator token
	    printer.writeOperator(OperatorHelper.getOperatorText(assignment.getKind()) + "=");
	    printer.writeSpace();
	    writeEle(assignment.getAssignment());
	    exitCtExpression(assignment);
	    exitCtStatement(assignment);
	}

	@Override
	public void visitCtPackage(CtPackage ctPackage) {
	    if (!ctPackage.isUnnamedPackage()) {
		elementPrinterHelper.writePackageLine(ctPackage.getQualifiedName());
	    } else {
		printer.writeComment(ctPackage.getFactory().createComment("default package (CtPackage.TOP_LEVEL_PACKAGE_NAME in Spoon= unnamed package)", CommentType.INLINE)).writeln();
	    }
	}

	@Override
	public void visitCtPackageDeclaration(CtPackageDeclaration packageDeclaration) {
	    elementPrinterHelper.writePackageLine("gen." + packageDeclaration.getReference().getQualifiedName());
	    String snippet = "import static " + conses_high.class.getName() + ".*; \n";
	    snippet += "import static " + Values.class.getName() + ".*;";
	    snippet += "import static " + packageDeclaration.getReference().getQualifiedName() //
		    + "." + currentType + ".*;";
	    printer.writeCodeSnippet(snippet);
	}

	@Override
	public void visitCtPackageExport(CtPackageExport moduleExport) {
	    if (moduleExport.isOpenedPackage()) {
		printer.writeKeyword("opens");
	    } else {
		printer.writeKeyword("exports");
	    }
	    printer.writeSpace();

	    visitCtPackageReference(moduleExport.getPackageReference());
	    if (!moduleExport.getTargetExport().isEmpty()) {
		this.elementPrinterHelper.printList(moduleExport.getTargetExport(), null, false, " to", true, false, ",", true, false, null, moduleReference -> writeEle(moduleReference));
	    }
	    printer.writeSeparator(";").writeln();
	}

	@Override
	public void visitCtPackageReference(CtPackageReference reference) {
	    elementPrinterHelper.writeQualifiedName(reference.getSimpleName());
	}

	@Override
	public <T> void visitCtParameter(CtParameter<T> parameter) {
	    elementPrinterHelper.writeComment(parameter);
	    elementPrinterHelper.writeAnnotations(parameter);
	    elementPrinterHelper.writeModifiers(parameter);
	    if (parameter.isVarArgs()) {
		writeEle(((CtArrayTypeReference<T>) parameter.getType()).getComponentType());
		printer.writeSeparator("...");
	    } else if (parameter.isInferred() && this.env.getComplianceLevel() >= 11) {
		getPrinterTokenWriter().writeKeyword("var");
	    } else {
		writeEle(parameter.getType());
	    }
	    printer.writeSpace();
	    printer.writeIdentifier(parameter.getSimpleName());
	}

	@Override
	public <T> void visitCtParameterReference(CtParameterReference<T> reference) {
	    printer.writeIdentifier(reference.getSimpleName());
	}

	@Override
	public void visitCtProvidedService(CtProvidedService moduleProvidedService) {
	    printer.writeKeyword("provides").writeSpace();
	    writeEle(moduleProvidedService.getServiceType());
	    this.elementPrinterHelper.printList(moduleProvidedService.getImplementationTypes(), null, false, " with", true, false, ",", true, false, null, implementations -> writeEle(implementations));
	    printer.writeSeparator(";").writeln();
	}

	@Override
	public <R> void visitCtReturn(CtReturn<R> returnStatement) {
	    enterCtStatement(returnStatement);
	    printer.writeKeyword("return");
	    // checkstyle wants "return;" and not "return ;"
	    if (returnStatement.getReturnedExpression() != null) {
		printer.writeSpace();
	    }
	    writeEle(returnStatement.getReturnedExpression());
	    exitCtStatement(returnStatement);
	}

	@Override
	public void visitCtStatementList(CtStatementList statements) {
	    for (CtStatement s : statements.getStatements()) {
		writeEle(s);
	    }
	}

	@Override
	public <T> void visitCtSuperAccess(CtSuperAccess<T> f) {
	    enterCtExpression(f);
	    final CtExpression<?> target = f.getTarget();
	    if (target != null) {
		writeTarget(target);

		printer.writeSeparator(".");
	    }
	    printer.writeKeyword("super");

	    exitCtExpression(f);
	}

	@Override
	public <E> void visitCtSwitch(CtSwitch<E> switchStatement) {
	    enterCtStatement(switchStatement);
	    printer.writeKeyword("switch").writeSpace().writeSeparator("(");
	    writeEle(switchStatement.getSelector());
	    printer.writeSeparator(")").writeSpace().writeSeparator("{").incTab();
	    for (CtCase<?> c : switchStatement.getCases()) {
		printer.writeln();
		writeEle(c);
	    }
	    if (env.isPreserveLineNumbers()) {
		printer.decTab().writeSeparator("}");
	    } else {
		printer.decTab().writeln().writeSeparator("}");
	    }
	    exitCtStatement(switchStatement);
	}

	@Override
	public void visitCtSynchronized(CtSynchronized synchro) {
	    enterCtStatement(synchro);
	    printer.writeKeyword("synchronized");
	    if (synchro.getExpression() != null) {
		printer.writeSeparator("(");
		writeEle(synchro.getExpression());
		printer.writeSeparator(")").writeSpace();
	    }
	    writeEle(synchro.getBlock());
	    exitCtStatement(synchro);
	}

	@Override
	public <T> void visitCtThisAccess(CtThisAccess<T> thisAccess) {
	    try {
		enterCtExpression(thisAccess);

		// we only write qualified this when this is required
		// this is good both in fully-qualified mode and in readable (with-imports) mode
		// the implicit information is used for analysis (e.g. is visibility caused by implicit bugs?) but
		// not for pretty-printing
		CtTypeAccess target = (CtTypeAccess) thisAccess.getTarget();
		CtTypeReference targetType = target.getAccessedType();

		// readable mode as close as possible to the original code
		if (thisAccess.isImplicit()) {
		    // write nothing, "this" is implicit and we unfortunately cannot always know
		    // what the good target is in JDTTreeBuilder
		    return;
		}

		// the simplest case: we always print "this" if we're in the top-level class,
		// this is shorter (no qualified this), explicit, and less fragile wrt transformation
		if (targetType == null || (thisAccess.getParent(CtType.class) != null && thisAccess.getParent(CtType.class).isTopLevel())) {
		    printer.writeKeyword("this");
		    return; // still go through finally block below
		}

		// we cannot have fully-qualified this in anonymous classes
		// we simply print "this" and it always works
		// this has to come after the implicit test just before
		if (targetType.isAnonymous()) {
		    printer.writeKeyword("this");
		    return;
		}

		// complex case of qualified this
		if (!context.currentThis.isEmpty()) {

		    CtType lastType = context.currentThis.peekFirst().type;
		    String lastTypeQualifiedName = lastType.getQualifiedName();
		    String targetTypeQualifiedName = targetType.getQualifiedName();

		    if (!lastTypeQualifiedName.equals(targetTypeQualifiedName)) {
			if (!targetType.isImplicit()) {
			    final boolean inherited = isInherited(targetType, "" + target);
			    visitCtTypeReferenceWithoutGenerics(targetType);
			    printer.writeSeparator(".");
			}
			printer.writeKeyword("this");
			return;
		    }
		}

		// the default super simple case only comes at the end
		printer.writeKeyword("this");
	    } finally {
		exitCtExpression(thisAccess);
	    }
	}

	@Override
	public void visitCtThrow(CtThrow throwStatement) {
	    enterCtStatement(throwStatement);
	    printer.writeKeyword("throw").writeSpace();
	    writeEle(throwStatement.getThrownExpression());
	    exitCtStatement(throwStatement);
	}

	@Override
	public void visitCtTry(CtTry tryBlock) {
	    enterCtStatement(tryBlock);
	    printer.writeKeyword("try").writeSpace();
	    writeEle(tryBlock.getBody());
	    for (CtCatch c : tryBlock.getCatchers()) {
		writeEle(c);
	    }

	    if (tryBlock.getFinalizer() != null) {
		printer.writeSpace().writeKeyword("finally").writeSpace();
		writeEle(tryBlock.getFinalizer());
	    }
	    exitCtStatement(tryBlock);
	}

	@Override
	public void visitCtTryWithResource(CtTryWithResource tryWithResource) {
	    enterCtStatement(tryWithResource);
	    printer.writeKeyword("try").writeSpace();
	    if (tryWithResource.getResources() != null && !tryWithResource.getResources().isEmpty()) {
		elementPrinterHelper.printList(tryWithResource.getResources(), null, false, "(", false, false, ";", false, false, ")", r -> writeEle(r));
	    }
	    printer.writeSpace();
	    writeEle(tryWithResource.getBody());
	    for (CtCatch c : tryWithResource.getCatchers()) {
		writeEle(c);
	    }

	    if (tryWithResource.getFinalizer() != null) {
		printer.writeSpace().writeKeyword("finally").writeSpace();
		writeEle(tryWithResource.getFinalizer());
	    }
	    exitCtStatement(tryWithResource);
	}

	@Override
	public <T> void visitCtType(CtType<T> type) {
	    elementPrinterHelper.writeComment(type, CommentOffset.BEFORE);
	    getPrinterHelper().mapLine(type, sourceCompilationUnit);
	    if (type.isTopLevel()) {
		context.currentTopLevel = type;
	    }
	    elementPrinterHelper.visitCtNamedElement(type, sourceCompilationUnit);
	    elementPrinterHelper.writeModifiers(type);
	}

	@Override
	public <T> void visitCtTypeAccess(CtTypeAccess<T> typeAccess) {
	    if (typeAccess.isImplicit()) {
		return;
	    }
	    enterCtExpression(typeAccess);
	    writeEle(typeAccess.getAccessedType());
	    exitCtExpression(typeAccess);
	}

	@Override
	public void visitCtTypeMemberWildcardImportReference(CtTypeMemberWildcardImportReference wildcardReference) {
	    writeEle(wildcardReference.getTypeReference());
	    printer.writeSeparator(".").writeSeparator("*");
	}

	@Override
	public void visitCtTypeParameter(CtTypeParameter typeParameter) {
	    elementPrinterHelper.writeAnnotations(typeParameter);
	    printer.writeIdentifier(typeParameter.getSimpleName());
	    if (typeParameter.getSuperclass() != null && typeParameter.getSuperclass().isImplicit() == false) {
		printer.writeSpace().writeKeyword("extends").writeSpace();
		writeEle(typeParameter.getSuperclass());
	    }
	}

	@Override
	public void visitCtTypeParameterReference(CtTypeParameterReference ref) {
	    if (ref.isImplicit()) {
		return;
	    }
	    elementPrinterHelper.writeAnnotations(ref);
	    if (printQualified(ref)) {
		elementPrinterHelper.writeQualifiedName(ref.getQualifiedName());
	    } else {
		printer.writeIdentifier(ref.getSimpleName());
	    }
	}

	@Override
	public void visitCtTypeReference(CtTypeReference<?> ref, boolean withGenerics) {
	    if (ref.isImplicit()) {
		return;
	    }
	    if (ref.isPrimitive()) {
		elementPrinterHelper.writeAnnotations(ref);
		printer.writeKeyword(ref.getSimpleName());
		return;
	    }
	    boolean isInner = ref.getDeclaringType() != null;
	    if (isInner) {
		if (!context.ignoreEnclosingClass() && !ref.isLocalType()) {
		    //compute visible type which can be used to print access path to ref
		    CtTypeReference<?> accessType = ref.getAccessType();
		    if (!accessType.isAnonymous()) {
			try (Writable _context = context.modify()) {
			    if (!withGenerics) {
				_context.ignoreGenerics(true);
			    }
			    writeEle(accessType);
			}
			printer.writeSeparator(".");
		    }
		}
		//?? are these annotations on correct place ??
		elementPrinterHelper.writeAnnotations(ref);
		if (ref.isLocalType()) {
		    printer.writeIdentifier(ref.getSimpleName().replaceAll("^[0-9]*", ""));
		} else {
		    printer.writeIdentifier(ref.getSimpleName());
		}
	    } else {
		if (ref.getPackage() != null && printQualified(ref)) {
		    if (!ref.getPackage().isUnnamedPackage()) {
			writeEle(ref.getPackage());
			printer.writeSeparator(CtPackage.PACKAGE_SEPARATOR);
		    }
		}
		elementPrinterHelper.writeAnnotations(ref);
		printer.writeIdentifier(ref.getSimpleName());
	    }
	    if (withGenerics && !context.ignoreGenerics()) {
		try (Writable _context = context.modify().ignoreEnclosingClass(false)) {
		    elementPrinterHelper.writeActualTypeArguments(ref);
		}
	    }
	}

	@Override
	public <T> void visitCtTypeReference(CtTypeReference<T> ref) {
	    visitCtTypeReference(ref, true);
	}

	@Override
	public void visitCtTypeReferenceWithoutGenerics(CtTypeReference<?> ref) {
	    visitCtTypeReference(ref, false);
	}

	@Override
	public <T> void visitCtUnaryOperator(CtUnaryOperator<T> operator) {
	    enterCtStatement(operator);
	    enterCtExpression(operator);
	    UnaryOperatorKind op = operator.getKind();
	    if (OperatorHelper.isPrefixOperator(op)) {
		printer.writeOperator(OperatorHelper.getOperatorText(op));
	    }
	    writeEle(operator.getOperand());
	    if (OperatorHelper.isSufixOperator(op)) {
		printer.writeOperator(OperatorHelper.getOperatorText(op));
	    }
	    exitCtExpression(operator);
	    exitCtStatement(operator);
	}

	@Override
	public <T> void visitCtUnboundVariableReference(CtUnboundVariableReference<T> reference) {
	    printer.writeIdentifier(reference.getSimpleName());
	}

	@Override
	public void visitCtUsedService(CtUsedService usedService) {
	    printer.writeKeyword("uses").writeSpace();
	    writeEle(usedService.getServiceType());
	    printer.writeSeparator(";").writeln();
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
	public void visitCtWhile(CtWhile whileLoop) {
	    enterCtStatement(whileLoop);
	    printer.writeKeyword("while").writeSpace().writeSeparator("(");
	    writeEle(whileLoop.getLoopingExpression());
	    printer.writeSeparator(")");

	    elementPrinterHelper.writeIfOrLoopBlock(whileLoop.getBody());
	    exitCtStatement(whileLoop);
	}

	@Override
	public void visitCtWildcardReference(CtWildcardReference wildcardReference) {
	    if (wildcardReference.isImplicit()) {
		return;
	    }
	    elementPrinterHelper.writeAnnotations(wildcardReference);
	    printer.writeSeparator("?");
	    // we ignore printing "extends Object" except if it's explicit
	    if (!wildcardReference.isDefaultBoundingType() || !wildcardReference.getBoundingType().isImplicit()) {
		if (wildcardReference.isUpper()) {
		    printer.writeSpace().writeKeyword("extends").writeSpace();
		} else {
		    printer.writeSpace().writeKeyword("super").writeSpace();
		}
		writeEle(wildcardReference.getBoundingType());
	    }
	}

	/**
	 * The generic writeEle method for an element.
	 */
	public DefaultJavaPrettyPrinter writeEle(CtElement e) {
	    if (e != null) {
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
	 * Write the compilation unit footer.
	 */
	@Override
	public DefaultJavaPrettyPrinter writeFooter(List<CtType<?>> types) {
	    elementPrinterHelper.writeFooter(types);
	    return this;
	}

	/**
	 * Write the compilation unit header.
	 * @return 
	 */
	@Override
	public DefaultJavaPrettyPrinter writeHeader(List<CtType<?>> types, Collection<CtImport> defImports) {
	    if (!types.isEmpty()) {
		for (CtType<?> ctType : types) {
		    elementPrinterHelper.writeComment(ctType, CommentOffset.TOP_FILE);
		}
		// writing the header package
		if (!types.get(0).getPackage().isUnnamedPackage()) {
		    qualifiedPackageName = types.get(0).getPackage().getQualifiedName();
		    elementPrinterHelper.writePackageLine(qualifiedPackageName);
		}
		Set<String> setImports = new HashSet<>();
		Set<String> setStaticImports = new HashSet<>();

		for (CtImport ctImport : defImports) {
		    String importTypeStr;

		    switch (ctImport.getImportKind()) {
			case TYPE:
			    CtTypeReference typeRef = (CtTypeReference) ctImport.getReference();
			    importTypeStr = typeRef.getQualifiedName();
			    if (!elementPrinterHelper.isJavaLangClasses(importTypeStr)) {
				setImports.add(elementPrinterHelper.removeInnerTypeSeparator(importTypeStr));
			    }
			    break;

			case ALL_TYPES:
			    CtPackageReference packageRef = (CtPackageReference) ctImport.getReference();
			    importTypeStr = packageRef.getQualifiedName() + ".*";
			    if (!elementPrinterHelper.isJavaLangClasses(importTypeStr)) {
				setImports.add(elementPrinterHelper.removeInnerTypeSeparator(importTypeStr));
			    }
			    break;

			case METHOD:
			    CtExecutableReference execRef = (CtExecutableReference) ctImport.getReference();
			    if (execRef.getDeclaringType() != null) {
				setStaticImports.add(elementPrinterHelper.removeInnerTypeSeparator(execRef.getDeclaringType().getQualifiedName()) + "." + execRef.getSimpleName());
			    }
			    break;

			case FIELD:
			    CtFieldReference fieldRef = (CtFieldReference) ctImport.getReference();
			    setStaticImports.add(elementPrinterHelper.removeInnerTypeSeparator(fieldRef.getDeclaringType().getQualifiedName()) + "." + fieldRef.getSimpleName());
			    break;

			case ALL_STATIC_MEMBERS:
			    CtTypeMemberWildcardImportReference typeStarRef = (CtTypeMemberWildcardImportReference) ctImport.getReference();
			    importTypeStr = typeStarRef.getTypeReference().getQualifiedName();
			    if (!elementPrinterHelper.isJavaLangClasses(importTypeStr)) {
				setStaticImports.add(elementPrinterHelper.removeInnerTypeSeparator(importTypeStr) + ".*");
			    }
			    break;

			case UNRESOLVED:
			    CtUnresolvedImport unresolvedImport = (CtUnresolvedImport) ctImport;
			    importTypeStr = unresolvedImport.getUnresolvedReference();
			    if (!elementPrinterHelper.isJavaLangClasses(importTypeStr)) {
				if (unresolvedImport.isStatic()) {
				    setStaticImports.add(importTypeStr);
				} else {
				    setImports.add(importTypeStr);
				}
			    }
			    break;
		    }
		}

		List<String> sortedImports = new ArrayList<>(setImports);
		Collections.sort(sortedImports);
		boolean isFirst = true;
		for (String importLine : sortedImports) {
		    if (isFirst) {
			elementPrinterHelper.printer.writeln();
			elementPrinterHelper.printer.writeln();
			isFirst = false;
		    }
		    elementPrinterHelper.printer.writeKeyword("import").writeSpace();
		    elementPrinterHelper.writeQualifiedName(importLine).writeSeparator(";").writeln();
		}
		if (!setStaticImports.isEmpty()) {
		    if (isFirst) {
			elementPrinterHelper.printer.writeln();
		    }
		    elementPrinterHelper.printer.writeln();
		    List<String> sortedStaticImports = new ArrayList<>(setStaticImports);
		    Collections.sort(sortedStaticImports);
		    for (String importLine : sortedStaticImports) {
			elementPrinterHelper.printer.writeKeyword("import").writeSpace().writeKeyword("static").writeSpace();
			elementPrinterHelper.writeQualifiedName(importLine).writeSeparator(";").writeln();
		    }
		}
		printer.writeln();
		printer.writeln();
	    }
	    return this;
	}

	/**
	 * TODO Describe the purpose of this method.
	 */
	public DefaultJavaPrettyPrinter writeTarget(CtElement e) {
	    return writeEle(e);
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
		File file = new File(directory, name.replaceAll("\\.", "/") + ".class");

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
		byte[] classData = buffer.toByteArray();

		return defineClass(name, classData, 0, classData.length);
	    } catch (MalformedURLException e) {
		e.printStackTrace();
	    } catch (IOException e) {
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

		List<File> printedFiles = new ArrayList<>();
		printing: for (spoon.reflect.cu.CompilationUnit cu : getFactory().CompilationUnit().getMap().values()) {

		    getFactory().getEnvironment().debugMessage("Generating source for compilation unit: " + cu.getFile());

		    CtType<?> element = cu.getMainType();

		    CtPackage pack = element.getPackage();

		    // create package directory
		    File packageDir;
		    if (pack.getQualifiedName().equals(CtPackage.TOP_LEVEL_PACKAGE_NAME)) {
			packageDir = new File(getSourceOutputDirectory().getAbsolutePath());
		    } else {
			char dot = '.';
			// Create current package dir
			packageDir = new File(getSourceOutputDirectory().getAbsolutePath() + File.separatorChar + pack.getQualifiedName().replace(dot, File.separatorChar));
		    }
		    if (!packageDir.exists()) {
			if (!packageDir.mkdirs()) {
			    throw new RuntimeException("Error creating output directory");
			}
		    }

		    File file = new File(packageDir.getAbsolutePath() + File.separatorChar + element.getSimpleName() + DefaultJavaPrettyPrinter.JAVA_FILE_EXTENSION);
		    file.createNewFile();

		    // the path must be given relatively to to the working directory
		    InputStream is = getCompilationUnitInputStream(cu.getFile().getPath());

		    IOUtils.copy(is, new FileOutputStream(file));

		    if (!printedFiles.contains(file)) {
			printedFiles.add(file);
		    }
		} // end for
	    } catch (IOException e) {
		throw new RuntimeException(e);
	    }
	}
    }

    /**
     *
     */

    /**
     * TODO Describe the purpose of this method.
     * @param field
     * @return
     */
    public static IdentityHashMap<CtElement, CtElement> getRefs(final CtField field, IdentityHashMap<CtElement, CtElement> all, Set<CtElement> statements, Set<CtExpression> allAssignments) {
	IdentityHashMap<CtElement, CtElement> refers = new IdentityHashMap<CtElement, CtElement>();
	final CtType<?> decl = field.getDeclaringType();
	final CtFieldReference ref = field.getReference();

	CtExpression fassignment = field.getAssignment();
	if (fassignment != null)
	    allAssignments.add(fassignment);

	for (CtElement e : all.keySet()) {
	    if (e instanceof CtReference) {
		CtReference reference = (CtReference) e;
		if (((CtReference) reference).getDeclaration() == field) {
		    CtElement refType = reference.getParent();
		    refers.put(reference, refType);
		    CtElement parent = asStatement(refType);
		    //if (fassignment == null) {
		    if (refType instanceof CtFieldWrite) {
			CtAssignment assignment = (CtAssignment) parent;
			//			CtExpression to = assignment.getAssigned();
			CtExpression from = assignment.getAssignment();
			allAssignments.add(from);
			statements.add(parent);
		    } else if (refType instanceof CtFieldRead) {
			statements.add(parent);
		    } else {
			if (parent instanceof CtStatement) {
			    statements.add(parent);
			} else {
			    statements.add(parent);
			}
		    }

		}
	    }
	}
	for (Object key : refers.keySet()) {
	    all.remove(key);
	}
	return refers;

    }

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
	} catch (ParentNotInitializedException e) {
	    return null;
	}
    }

    /**
     * TODO Describe the purpose of this method.
     * @param lastWord
     * @return
     */
    public static Field getDeclared(String lastWord, boolean chKeyword) {
	// TODO Auto-generated method stub
	Field f = null;

	if (chKeyword) {
	    f = getDeclared(CommonSymbolKWs.class, "$" + lastWord);
	    return (f != null ? f : getDeclared(Keyword.class, lastWord));
	}
	f = getDeclared(CommonSymbols.class, lastWord);
	return (f != null ? f : getDeclared(org.armedbear.lisp.Symbol.class, lastWord));
    }

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
	    // TODO Auto-generated catch block
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

	for (CtExecutableReference<?> reference : references) {
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
		String refFQN = reference.getQualifiedName();
		return typeQFN.equals(refFQN);
	    }
	});

	type.setSimpleName(name);
	for (CtTypeReference<?> reference : references) {
	    reference.setSimpleName(name);
	}
    }

    /** See doc in {@link CtMethod#copyMethod()} */
    public static CtMethod<?> copyMethod(final CtMethod<?> method) {
	CtMethod<?> clone = method.clone();
	StringBuilder tentativeTypeName = new StringBuilder(method.getSimpleName() + "Copy");
	CtType parent = method.getParent(CtType.class);
	while (!parent.getMethodsByName(tentativeTypeName.toString()).isEmpty()) {
	    tentativeTypeName.append("X");
	}
	final String cloneMethodName = tentativeTypeName.toString();
	clone.setSimpleName(cloneMethodName);
	parent.addMethod(clone);
	new CtScanner() {
	    @Override
	    public <T> void visitCtExecutableReference(CtExecutableReference<T> reference) {
		CtExecutable<T> declaration = reference.getDeclaration();
		if (declaration == null) {
		    return;
		}
		if (declaration == method) {
		    reference.setSimpleName(cloneMethodName);
		}
		if (reference.getDeclaration() != clone) {
		    throw new SpoonException("post condition broken " + reference);
		}
		super.visitCtExecutableReference(reference);

	    }
	}.scan(clone);
	return clone;
    }

    /** See doc in {@link CtType#copyType()} */
    public static CtType<?> copyType(final CtType<?> type) {
	CtType<?> clone = type.clone();
	StringBuilder tentativeTypeName = new StringBuilder(type.getSimpleName() + "Copy");
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
		CtExecutable<T> declaration = reference.getDeclaration();
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
		CtField<T> declaration = reference.getDeclaration();
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
		CtExecutable<T> declaration = reference.getDeclaration();
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
		CtField<T> declaration = reference.getDeclaration();
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
	    char[] chars = field.toCharArray();
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
}
