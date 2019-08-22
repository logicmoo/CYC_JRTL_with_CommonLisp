/*
 * Copyright 2012 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.logicmoo.translate.roaster;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Hashtable;
import java.util.List;
import java.util.Properties;

import javax.naming.spi.InitialContextFactory;

import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.ToolFactory;
import org.eclipse.jdt.core.dom.BodyDeclaration;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.*;
import org.eclipse.jdt.core.dom.ExpressionStatement;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.ImportDeclaration;
import org.eclipse.jdt.core.dom.Initializer;
import org.eclipse.jdt.core.dom.Statement;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.formatter.CodeFormatter;
import org.eclipse.jdt.core.formatter.DefaultCodeFormatterConstants;
import org.eclipse.jdt.internal.compiler.ast.Block;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.Document;
import org.eclipse.text.edits.TextEdit;
import org.jboss.forge.roaster.Roaster;
import org.jboss.forge.roaster.model.impl.JavaClassImpl;
import org.jboss.forge.roaster.model.source.FieldSource;
import org.jboss.forge.roaster.model.source.JavaClassSource;
import org.jboss.forge.roaster.model.source.MethodSource;
import org.jboss.forge.roaster.model.util.FormatterException;
import org.jboss.forge.roaster.model.util.FormatterProfileReader;
import org.jboss.forge.roaster.model.util.JDTOptions;
import org.logicmoo.translate.spoon.TestSpooner;
import org.eclipse.jdt.internal.corext.refactoring.rename.*;

/**
 * Formatter for java source code.
 *
 * @author <a href="mailto:lincolnbaxter@gmail.com">Lincoln Baxter, III</a>
 */
public abstract class ClassRebuilder {
    private static Hashtable<Object, JavaClassImpl> classBases = new Hashtable<Object, JavaClassImpl>();
    private static String debug;

    /**
    * Format the given Java source {@link File}, using the built in code outputSource style.
    *
    * @param source the file which contains the source to outputSource
    * @throws FormatterException if the source coudn't be formatted
    * @throws IOException        When the file cannot be read or written
    */
    public static void mergeSingle(File source) throws IOException {
	mergeSingle(null, source);
    }

    /**
    * Format the given Java source {@link File} using the given Eclipse code outputSource properties {@link File}.
    *
    * @param prefs  the outputSource properties file
    * @param source the file which contains the source to outputSource
    * @throws FormatterException if the source coudn't be formatted
    * @throws IOException        When the file cannot be read or written, or the preferences cannot be read.
    */
    public static void mergeSingle(File prefs, File source) throws IOException {
	Properties options = readConfig(prefs);
	if (options == null)
	    options = readConfigInternal();

	final Path path = source.toPath();
	String classBase = path.toString();
	classBase = classBase.replace('\\', '/');
	final String javaFile = classBase;
	if (classBase.endsWith(".java")) {
	    classBase = classBase.substring(0, classBase.lastIndexOf('.'));
	    classBase = classBase.replace('/', '.');
	}
	classBase = classBase.substring(classBase.indexOf("cycjava") + 1);
	final String classBase2 = TestSpooner.andOneDot(classBase);
	final String[] dotted = classBase2.split("[.]");
	final String className = dotted[1];
	final String packageName = "merge." + dotted[0];
	JavaClassImpl target = classBases.get(classBase2);
	if (target == null) {
	    //target = (JavaClassImpl) Roaster.parse("public class " + className + " extends com.cyc.tool.subl.util.SubLTranslatedReadyFile { }");
	    target = (JavaClassImpl) Roaster.parse(new File("src/com/cyc/tool/subl/util/SubLTranslatedReadyFile.java"));
	    target.setPackage(packageName);
	    target.setName(className);
	    classBases.put(classBase2, target);
	    debug = target.toString();
	}

	final String content = new String(Files.readAllBytes(path));
	final JavaClassImpl unit = (JavaClassImpl) Roaster.parse(content.toCharArray());
	mergeUnitInto(unit, target);

	final File file = new File("./main/output/" + (packageName + //
		"." + className.replace('.', '$')).replace('.', '/') + ".java");
	file.getParentFile().mkdirs();
	final String pathname = file.getAbsolutePath();
	final String formatted = outputSource(options, target);
	Files.write(new File(pathname).toPath(), formatted.getBytes());
	return;
    }

    /**
     * TODO Describe the purpose of this method.
     * @param source
     * @param target
     */
    private static void mergeUnitInto(JavaClassImpl source, JavaClassImpl target) {
	new Class[] { org.eclipse.jdt.core.dom.FieldDeclaration.class, org.eclipse.jdt.core.dom.MethodDeclaration.class, org.eclipse.jdt.core.dom.Initializer.class, org.eclipse.jdt.core.dom.TypeDeclaration.class, }.clone();

	final TypeDeclaration bodyDeclarationS = (TypeDeclaration) source.getDeclaration();
	final TypeDeclaration bodyDeclarationT = (TypeDeclaration) target.getDeclaration();
	final CompilationUnit parentS = (CompilationUnit) bodyDeclarationS.getParent();
	final CompilationUnit parentT = (CompilationUnit) bodyDeclarationT.getParent();
	final ImportDeclaration targetNode = (ImportDeclaration) parentT.imports().iterator().next();
	for (final Object e : parentS.imports()) {
	    final ImportDeclaration en = (ImportDeclaration) e;
	    setField(en, "parent", null);
	    setField(en, "ast", targetNode.getAST());
	    parentT.imports().add(en);
	}
	RenameFieldProcessor fieldProcessor = null;
	final List bodyDeclarations2 = bodyDeclarationS.bodyDeclarations();
	Initializer initializer = null;
	List block = null;
	for (final BodyDeclaration f : (List<BodyDeclaration>) bodyDeclarations2) {
	    if (f instanceof Initializer) {
		initializer = (Initializer) f;
		block = initializer.getBody().statements();
		for (Object i : block) {
		    if (i instanceof ExpressionStatement) {
			Expression statement = ((ExpressionStatement) i).getExpression();
			if (statement instanceof Assignment) {
			    Assignment assignment = (Assignment) statement;
			    Expression left = assignment.getLeftHandSide();
			    String ls = left.toString();

			    Expression rightExpression = assignment.getRightHandSide();
			}
		    }
		    System.out.println(i);
		}
	    }
	}
	for (final FieldSource f : source.getFields()) {
	    String init = f.getLiteralInitializer();
	    if (init == null) {

	    }
	}
    }

    /**
     * TODO Describe the purpose of this method.
     * @param en
     * @param string
     * @param ast
     */
    private static void setField(Object en, String string, Object ast) {
	Field f;
	NoSuchFieldException nfe = null;
	Class<? extends Object> class1 = en.getClass();
	while (class1 != Object.class && class1 != null) {
	    try {
		f = class1.getDeclaredField(string);
		f.setAccessible(true);
		f.set(en, ast);
		return;
	    } catch (final NoSuchFieldException e) {
		if (nfe == null)
		    nfe = e;
		class1 = class1.getSuperclass();
		continue;
	    } catch (IllegalArgumentException | IllegalAccessException e) {
		e.printStackTrace();
		throw new RuntimeException(e);
	    }
	}
	if (nfe != null)
	    nfe.printStackTrace();
	throw new RuntimeException(nfe);
    }

    /**
     * TODO Describe the purpose of this method.
     * @param string
     */
    private static void println(Object x) {
	System.out.println(x);
    }

    /**
    * Format the given {@link JavaClassSource}, using the built in code outputSource style.
    *
    * @param javaClass the class to outputSource
    * @return the formatted source code
    * @throws FormatterException if the source coudn't be formatted
    */
    public static String outputSource(JavaClassSource javaClass) {
	return outputSource(javaClass.toString());
    }

    /**
    * Format the given {@link JavaClassSource}, using the given Eclipse code outputSource {@link Properties}.
    *
    * @param prefs     the outputSource properties
    * @param javaClass the class to outputSource
    * @return the formatted source code
    * @throws FormatterException if the source coudn't be formatted
    */
    public static String outputSource(Properties prefs, JavaClassSource javaClass) {
	return outputSource(prefs, javaClass.toString());
    }

    /**
    * Format the given {@link String} as a Java source file, using the built in code outputSource style.
    *
    * @param source the source to outputSource
    * @return the formatted source code
    * @throws FormatterException if the source coudn't be formatted
    */
    public static String outputSource(String source) {
	final Properties options = readConfigInternal();
	return outputSource(options, source);
    }

    /**
    * Format the given {@link String} as a Java source type, using the given Eclipse code outputSource {@link Properties}.
    *
    * @param prefs  the outputSource properties
    * @param source the source to outputSource
    * @return the formatted source code
    * @throws FormatterException if the source coudn't be formatted
    */
    public static String outputSource(Properties prefs, String source) {
	final CodeFormatter codeFormatter = ToolFactory.createCodeFormatter(prefs);

	final Document doc = new Document(source);
	try {

	    final TextEdit edit = codeFormatter.format(CodeFormatter.K_COMPILATION_UNIT | CodeFormatter.F_INCLUDE_COMMENTS, source, 0, source.length(), 0, System.lineSeparator());
	    if (edit != null) {
		edit.apply(doc);
	    } else {
		throw new FormatterException(source, null);
	    }
	} catch (final BadLocationException e) {
	    throw new FormatterException(source, e);
	}
	return doc.get();
    }

    private static Properties readConfig(File prefs) throws IOException {
	if (prefs != null) {
	    try (InputStream stream = new BufferedInputStream(new FileInputStream(prefs))) {
		Properties config;
		if (prefs.getName().toLowerCase().endsWith(".xml")) {
		    config = parseXmlConfig(stream);
		} else {
		    config = parseConfig(stream);
		}
		return applyShadedPackageName(config);
	    } catch (final IOException e) {
		throw new IOException("Error reading preferences file: [" + prefs.getAbsolutePath() + "]", e);
	    }
	}

	return null;
    }

    public static Properties applyShadedPackageName(final Properties config) {
	final Properties modified = new Properties();
	final String shadePackage = JavaCore.class.getPackage().getName().replaceAll("org\\.eclipse.*$", "");
	for (final String property : config.stringPropertyNames()) {
	    if (property.startsWith(shadePackage)) {
		modified.put(property, config.getProperty(property));
	    } else {
		modified.put(shadePackage + property, config.getProperty(property));
	    }
	}
	return modified;
    }

    /**
    * The given options should at least provide the source level (JavaCore.COMPILER_SOURCE), the compiler compliance
    * level (JavaCore.COMPILER_COMPLIANCE) and the target platform (JavaCore.COMPILER_CODEGEN_TARGET_PLATFORM).
    *
    * Without these options, it is not possible for the code formatter to know what kind of source it needs to outputSource.
    */
    private static Properties readConfigInternal() {
	final Properties properties = new Properties();

	properties.setProperty(JavaCore.COMPILER_SOURCE, JDTOptions.getOption(JavaCore.COMPILER_SOURCE));
	properties.setProperty(JavaCore.COMPILER_COMPLIANCE, JDTOptions.getOption(JavaCore.COMPILER_COMPLIANCE));
	properties.setProperty(JavaCore.COMPILER_CODEGEN_TARGET_PLATFORM, JDTOptions.getOption(JavaCore.COMPILER_CODEGEN_TARGET_PLATFORM));
	// ROASTER-96: Add a blank line after imports. "1" is equivalent to TRUE in the formatter XML file
	properties.setProperty(DefaultCodeFormatterConstants.FORMATTER_BLANK_LINES_AFTER_IMPORTS, "1");
	return properties;
    }

    private static Properties parseConfig(InputStream stream) throws IOException {
	final Properties formatterOptions = readConfigInternal();
	formatterOptions.load(stream);
	return formatterOptions;
    }

    private static Properties parseXmlConfig(InputStream stream) throws IOException {
	final Properties properties = readConfigInternal();
	final Properties defaultProperties = FormatterProfileReader.fromEclipseXml(stream).getDefaultProperties();
	properties.putAll(defaultProperties);
	return properties;
    }
}