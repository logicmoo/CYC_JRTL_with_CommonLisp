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
package org.logicmoo.translate.spoon;

import static org.logicmoo.translate.spoon.TestSpooner.*;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.poi.ss.formula.functions.T;
import org.logicmoo.translate.spoon.TestSpooner.SpoonInfo;

import spoon.compiler.Environment;
import spoon.reflect.code.CtAssert;
import spoon.reflect.code.CtAssignment;
import spoon.reflect.code.CtBlock;
import spoon.reflect.code.CtComment;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtFieldAccess;
import spoon.reflect.code.CtFieldRead;
import spoon.reflect.code.CtFieldWrite;
import spoon.reflect.code.CtFor;
import spoon.reflect.code.CtForEach;
import spoon.reflect.code.CtIf;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.code.CtLiteral;
import spoon.reflect.code.CtNewArray;
import spoon.reflect.code.CtReturn;
import spoon.reflect.code.CtStatement;
import spoon.reflect.code.CtSwitch;
import spoon.reflect.code.CtSynchronized;
import spoon.reflect.code.CtTry;
import spoon.reflect.code.CtTypeAccess;
import spoon.reflect.code.CtVariableAccess;
import spoon.reflect.code.CtVariableRead;
import spoon.reflect.code.CtVariableWrite;
import spoon.reflect.code.CtWhile;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtCompilationUnit;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtField;
import spoon.reflect.declaration.CtImport;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtNamedElement;
import spoon.reflect.declaration.CtParameter;
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.CtVariable;
import spoon.reflect.declaration.ParentNotInitializedException;
import spoon.reflect.factory.Factory;
import spoon.reflect.reference.CtArrayTypeReference;
import spoon.reflect.reference.CtExecutableReference;
import spoon.reflect.reference.CtFieldReference;
import spoon.reflect.reference.CtReference;
import spoon.reflect.reference.CtTypeMemberWildcardImportReference;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.CtVisitor;
import spoon.reflect.visitor.DefaultJavaPrettyPrinter;
import spoon.reflect.visitor.DefaultTokenWriter;
import spoon.reflect.visitor.ImportScannerImpl;
import spoon.reflect.visitor.MinimalImportScanner;
import spoon.reflect.visitor.PrettyPrinter;
import spoon.reflect.visitor.PrinterHelper;
import spoon.reflect.visitor.PrintingContext;
import spoon.reflect.visitor.PrintingContext.Writable;
import spoon.reflect.visitor.printer.CommentOffset;
import spoon.support.util.ModelList;

public class MyOutputPrinter extends DefaultJavaPrettyPrinter implements CtVisitor, PrettyPrinter {

	/**
	 * TODO Describe this constructor.
	 * 
	 * @param environment
	 */
	public MyOutputPrinter(Environment environment) {
		super(environment);
		this.env = environment;
		imports = new HashSet<>();
		this.imports.addAll(getDefaultImports(launcher.getFactory()));
		setPrinterTokenWriter(new DefaultTokenWriter(new PrinterHelper(environment)));
		resetImportsContext();
	}

	/**
	 * TODO Describe the purpose of this method.
	 * 
	 * @param environment
	 */
	private void resetImportsContext() {
		if (env.isAutoImports()) {
			importsContext = new ImportScannerImpl();
		} else {
			importsContext = new MinimalImportScanner();

		}
	}

	/**
	 * TODO Describe the purpose of this method.
	 * 
	 * @param fieldReference
	 * @return
	 */
	static boolean isLocalVar(CtElement fieldReference) {
		return fieldReference instanceof CtVariableAccess && !(fieldReference instanceof CtFieldAccess);
	}

	// CtTypeReference currentOutterType;
	// CtTypeReference currentType;

	private SpoonInfo classSpooner;

	private String qualifiedPackageName;

	CtStatement currentStatement;

	CtStatement lastStatement = null;

	final List<CtType> types = new ArrayList<CtType>() {
		@Override
		public boolean add(CtType e) {
			if (!contains(e)) {
				return super.add(e);
			}
			return false;
		}

		@Override
		public boolean addAll(java.util.Collection c) {
			super.removeAll(c);
			return super.addAll(c);
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.util.ArrayList#addAll(int, java.util.Collection)
		 */
		@Override
		public boolean addAll(int index, Collection<? extends CtType> c) {
			super.removeAll(c);
			return super.addAll(index, c);
		}
	};

	@Override
	public void calculate(CtCompilationUnit cu, List<CtType<?>> types) {
		if (false) {
			super.calculate(cu, types);
			return;
		}
		this.types.addAll(types);
		try {

			calcCU(cu);
			// final CtType<?> topLevel = types.iterator().next().getTopLevelType();

		} finally {
			this.writeHeader(types, imports);
			printTypes(types);
		}

		// }
	}

	/**
	 * TODO Describe the purpose of this method.
	 * 
	 * @param cu
	 */
	private void calcCU(CtCompilationUnit cu) {

		if (this.sourceCompilationUnit == cu) {
			return;
		}
		this.sourceCompilationUnit = cu;

		final ModelList<CtImport> cuImports = cu.getImports();
		int sizeBefore = cuImports.size();
		this.imports.addAll(cuImports);

		final CtType<?> mainType = cu.getMainType();
		setCurrentType(mainType.getReference());

		cu.setImports(this.imports);
		System.out.println("sourceCompilationUnit: " + cu.getFile().toString() + " imports=" + sizeBefore + " -> "
				+ this.imports.size());
	}

	/**
	 * TODO Describe the purpose of this method.
	 * 
	 * @param ctTypeReference
	 * 
	 * @param ct
	 */
	private void setCurrentType(CtTypeReference ctTypeReference) {
		CtType ct = ctTypeReference.getTypeDeclaration();
		if (ct == null) {
			ct = ctTypeReference.getTypeDeclaration();
		}
		// CtType<?> c = context.currentTopLevel;
		printer.reset();
		context = new PrintingContext();
		if (ct != null) {
			context.currentTopLevel = ctTypeReference;
		}
		// CtType<?> currentOutterType = context.currentTopLevel;
		classSpooner = findSpoonInfo(ct.getQualifiedName());
		// currentOutterType = ct.getTopLevelType().getReference();
		// currentType = ct.getReference();
		// if (sourceCompilationUnit == cu)
		// return;

		final Set<CtImport> imports2 = classSpooner.imports;
		if (imports2 != null)
			this.imports.addAll(imports2);
		classSpooner.imports = this.imports;
		if (classSpooner.importsContext != null) {
			importsContext = classSpooner.importsContext;
		} else {
			if (atBP < 1) {
				resetImportsContext();
			}
			classSpooner.importsContext = this.importsContext;
		}
		if (types.add(ct)) {

		}

		// if (size < 30 && freshCU) {

		// cu.setImports(newImports);
		// reset the importsContext to avoid errors with multiple CU

		if (atBP < 1) {
			if (sourceCompilationUnit != null) {
				this.importsContext.initWithImports(imports);
			}

			for (CtType<?> t : types) {
				imports.addAll(computeImports(t));
			}
		}

	}

	/**
	 * Make the imports for a given type.
	 *
	 */
	@Override
	public Collection<CtImport> computeImports(CtType<?> type) {

		// final CtType<?> currentTopLevel = context.currentTopLevel = type;
		try {
			importsContext.computeImports(type);
		} catch (final ParentNotInitializedException e) {

		}
		return importsContext.getAllImports();
	}

	@Override
	public List<String> filterImports(List<String> setStaticImports, boolean areStatic) {
		// if (true)
		// return setStaticImports;
		List<String> sortedStaticImports = new ArrayList<>();

		String coc = getQName();
		for (String qualifiedName : setStaticImports) {
			qualifiedName = qualifiedName.replace(".cycjava_1.", ".cycjava.");
			if (qualifiedName.contains("..")) {
				continue;
			}
			if (areStatic || true) {
				if (qualifiedName.startsWith(coc + "."))
					continue;
			}
			sortedStaticImports.add(qualifiedName);
		}
		Collections.sort(sortedStaticImports);
		return sortedStaticImports;
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
			final CtTypeMemberWildcardImportReference staticTypeMemberReference = executableReference.getFactory()
					.Type().createTypeMemberWildcardImportReference(executableReference.getDeclaringType());
			final CtImport staticClassImport = executableReference.getFactory().createImport(staticTypeMemberReference);
			return imports.contains(staticClassImport);
		}
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
			final CtTypeMemberWildcardImportReference staticTypeMemberReference = fieldReference.getFactory().Type()
					.createTypeMemberWildcardImportReference(fieldReference.getDeclaringType());
			final CtImport staticClassImport = fieldReference.getFactory().createImport(staticTypeMemberReference);
			return imports.contains(staticClassImport);
		}
	}

	@Override
	public void reset() {
		printer.reset();
		context = new PrintingContext();
		resetImportsContext();
	}

	/**
	 * The generic scan method for an element.
	 */
	@Override
	public DefaultJavaPrettyPrinter scan(CtElement e) {
		if (classSpooner == null) {
			final CtTypeReference declaringType = getDeclaringType(e);
			setCurrentType(declaringType);
		}
		if (e != null) {
			enter(e);
			context.elementStack.push(e);
			try {
				if (!isGone(e)) {
					if (env.isPreserveLineNumbers()) {
						if (!(e instanceof CtNamedElement)) {
							getPrinterHelper().adjustStartPosition(e);
						}
					}
					reallWriteEle(e);
				}

			} finally {
				context.elementStack.pop();
				exit(e);
			}
		}
		return this;
	}

	@Override
	public boolean skips(CtType<?> element) {
		if (isGone(element))
			return true;
		return element.getQualifiedName().contains("cycjava_2");
	}

	public <T> void super_visitCtInvocation(CtInvocation<T> invocation) {
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
			if (parentType != null && parentType.getQualifiedName() != null && parentType.getQualifiedName()
					.equals(invocation.getExecutable().getDeclaringType().getQualifiedName())) {
				printer.writeKeyword("this");
			} else {
				if (invocation.getTarget() != null && !invocation.getTarget().isImplicit()) {
					scan(invocation.getTarget());
					printer.writeSeparator(".");
				}
				printer.writeKeyword("super");
			}
		} else {
			// It's a method invocation
			boolean isImported = this.isImported(invocation.getExecutable());
			if (!isImported) {
				try (Writable _context = context.modify()) {
					if (invocation.getTarget() instanceof CtTypeAccess) {
						_context.ignoreGenerics(true);
					}
					if (invocation.getTarget() != null && !invocation.getTarget().isImplicit()) {
						scan(invocation.getTarget());
						printer.writeSeparator(".");
					}
				}
			}

			elementPrinterHelper.writeActualTypeArguments(invocation);
			if (env.isPreserveLineNumbers()) {
				getPrinterHelper().adjustStartPosition(invocation);
			}
			printer.writeIdentifier(invocation.getExecutable().getSimpleName());
		}
		elementPrinterHelper.printList(invocation.getArguments(), null, false, "(", false, false, ",", true, false, ")",
				e -> scan(e));
		exitCtExpression(invocation);
		exitCtStatement(invocation);
	}

	@Override
	public <T> void visitCtAssert(CtAssert<T> asserted) {
		if (true) {
			super.visitCtAssert(asserted);
			return;
		}

		enterCtStatement(asserted);
		printer.writeKeyword("assert").writeSpace();
		final CtExpression<Boolean> assertExpression = asserted.getAssertExpression();

		String s = "" + assertExpression;
		final CtExpression<T> error = asserted.getExpression();

		this.scan(assertExpression);
		if (error != null) {
			this.printer.writeSpace().writeSeparator(":").writeSpace();
			this.scan(error);
		}
		exitCtStatement(asserted);
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
				// printNode("FIELD " + variable, "" + assigned, -1);
				// .assigned. || (isStaticImported(simpleName, false) instanceof Field)
				if ((classSpooner != null && classSpooner.noAssignFields.contains(simpleName))) {

					// if (classSpooner.noAssignBody.contains(simpleName)) {
					// classSpooner.deletedStatements.add(assignement);
					// return;
					// }
					if (!(expression instanceof CtLiteral)) {
						scan(expression);
					} else {
						deletedStatements.add(assignement);
					}
					return;
				}
			} else {
				// printNode("VAR", "" + assigned, -1);
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
	public <R> void visitCtBlock(CtBlock<R> block) {
		if (delayedStatements.contains(block)) {
			super.visitCtBlock(block);
			return;
		}
		boolean skipBrackets = block.isImplicit();
		enterCtStatement(block);
		final List<CtStatement> statements = block.getStatements();
		int all = 0;
		int innerblocks = 0;
		for (CtStatement statement : statements) {
			if (!statement.isImplicit()) {
				all++;
				if (statement instanceof CtBlock) {
					innerblocks++;
				}
			}
		}
		if (innerblocks == all && innerblocks == 1) {
			// skipBrackets = true;
		} else if (innerblocks == all) {
			if (innerblocks > 0) {
				// skipBrackets = true;
				breakPoint();
			}
		} else // if (innerblocks != 0)
		{
			CtElement parent = block.getParent();
			if (parent instanceof CtBlock) {
				skipBrackets = true;
			}
			// breakPoint();
		}
		if (!skipBrackets) {
			printer.writeSeparator("{");
			printer.incTab();
		}

		for (CtStatement statement : statements) {
			if (!statement.isImplicit()) {
				printer.writeln();
				elementPrinterHelper.writeStatement(statement);
			}
		}

		getPrinterHelper().adjustEndPosition(block);
		if (!env.isPreserveLineNumbers()) {
			printer.writeln();
		}

		if (!skipBrackets) {
			printer.decTab();
			printer.writeSeparator("}");
		}
		exitCtStatement(block);
	}

	@Override
	public <T> void visitCtField(CtField<T> f) {

		String simpleName = f.getSimpleName();
		if (classSpooner != null) {
			Set<String> deleted = classSpooner.deleted;
			if (deleted.contains(simpleName)) {
				// elementPrinterHelper.writeComment(f, CommentOffset.BEFORE);
				// //elementPrinterHelper.visitCtNamedElement(f, sourceCompilationUnit);
				// elementPrinterHelper.writeComment(f, CommentOffset.AFTER);
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
			delayedStatements.add(defaultExpression);
			try {
				scan(defaultExpression);
			} finally {
				delayedStatements.remove(defaultExpression);
			}
		} else {

		}
		printer.writeSeparator(";");

	}

	@Override
	public <T> void visitCtFieldRead(CtFieldRead<T> fieldRead) {
		printCtFieldAccess(fieldRead);
	}

	@Override

	public <T> void visitCtFieldReference(CtFieldReference<T> reference) {

		// final String outerqualifiedName = currentOutterType != null ?
		// currentOutterType.getQualifiedName() : "";

		String simpleName = reference.getSimpleName();

		CtTypeReference declaringType = reference.getDeclaringType();
		boolean isClass = "class".equals(simpleName);
		if (!isClass) {
			if (isImportedSimple(simpleName)) {
				this.printer.writeCodeSnippet(simpleName);
				return;
			}
			Member staticImported = isStaticImported(simpleName, false);
			if (staticImported != null) {
				if (false) {
					CtTypeReference currentMType = reference.getFactory().Code()
							.createCtTypeReference(staticImported.getDeclaringClass());
					reference.setDeclaringType(currentMType);
				}
				this.printer.writeCodeSnippet(simpleName);
				return;
			}
//			String outerqualifiedName = getQName();
//			CtTypeReference declaringType2 = getDeclaringType(reference);
//			if ((declaringType != null && declaringType2.getQualifiedName().contentEquals(outerqualifiedName))) {
//				this.printer.writeCodeSnippet(simpleName);
//				return;
//			}
		}
		boolean isStatic = isClass || !"super".equals(simpleName) && reference.isStatic();
		boolean printType = false;

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

	@Override
	public <T> void visitCtFieldWrite(CtFieldWrite<T> fieldWrite) {
		printCtFieldAccess(fieldWrite);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see spoon.reflect.visitor.DefaultJavaPrettyPrinter#visitCtInvocation(spoon.
	 * reflect.code.CtInvocation)
	 */
	@Override
	public <T> void visitCtInvocation(CtInvocation<T> invocation) {
		if (delayedStatements.contains(invocation)) {
			super_visitCtInvocation(invocation);
			return;
		}
		final CtExecutableReference<T> executable = invocation.getExecutable();
		if (!executable.isStatic()) {
			super_visitCtInvocation(invocation);
			return;
		}

		final String t = executable.getSimpleName();
		if (t.contains("Uninterned")) {
			super_visitCtInvocation(invocation);
			return;
		}

		final List<CtExpression<?>> arguments = invocation.getArguments();
		if (arguments.size() == 1) {
			final CtExpression<?> ctExpressionIn = arguments.get(0);
			if (visitOverride(t, ctExpressionIn)) {
				// breakPoint();
				return;
			}
		}

		super_visitCtInvocation(invocation);
		return;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * spoon.reflect.visitor.DefaultJavaPrettyPrinter#visitCtMethod(spoon.reflect.
	 * declaration.CtMethod)
	 */
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
			scan(m.getType());
		}
		printer.writeSpace();
		printer.writeIdentifier(m.getSimpleName());
		List<CtParameter<?>> parameters = new ArrayList();
		final List<CtParameter<?>> origParams = m.getParameters();
		int argNum = 0;
		int len = origParams.size();
		for (CtParameter parameter : origParams) {
			argNum++;
			if (argNum == len) {
				if (parameter.getType().isArray()) {
					if (!parameter.isVarArgs()) {
						parameter.setVarArgs(true);
					}
				}
			}
			parameters.add(parameter);
		}
		m.setParameters(parameters);
		elementPrinterHelper.printList(parameters, null, false, "(", false, false, ",", true, false, ")",
				(p) -> this.scan(p));
		elementPrinterHelper.writeThrowsClause(m);
		if (m.getBody() != null) {
			printer.writeSpace();
			scan(m.getBody());
			if (m.getBody().getPosition().isValidPosition()) {
				if (m.getBody().getPosition().getCompilationUnit() == sourceCompilationUnit) {
					if (m.getBody().getStatements().isEmpty() || !(m.getBody().getStatements()
							.get(m.getBody().getStatements().size() - 1) instanceof CtReturn)) {
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
	@SuppressWarnings("rawtypes")
	public <T> void visitCtNewArray(CtNewArray<T> newArray) {
		CtElement parent0 = newArray.getParent();
		if (parent0 instanceof CtInvocation) {
			final CtInvocation parent = (CtInvocation) parent0;
			List ar = parent.getArguments();
			int sz = ar.size() - 1;
			final Object object = ar.get(sz);
			if (object == newArray) {
				CtArrayTypeReference atr = (CtArrayTypeReference) newArray.getType();
				final CtTypeReference componentType = atr.getComponentType();
				if (componentType.getSimpleName().contentEquals("SubLObject")) {
					if (false) {
						// @TODO confirm last arg is varargs
						final CtExecutableReference executable = parent.getExecutable();
						ar = executable.getParameters();
						CtTypeReference argType = (CtTypeReference) ar.get(sz);
						if (argType != null) {
							if (argType.isArray()) {

							}
						}
					}
					elementPrinterHelper.printList(newArray.getElements(), null, false, "", true, false, ",", true,
							true, "", e -> scan(e));
					elementPrinterHelper.writeComment(newArray, CommentOffset.INSIDE);
					elementPrinterHelper.writeComment(newArray, CommentOffset.AFTER);
					// breakPoint();
					return;
				}
			}

		}
		super.visitCtNewArray(newArray);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see spoon.reflect.visitor.DefaultJavaPrettyPrinter#visitCtTypeAccess(spoon.
	 * reflect.code.CtTypeAccess)
	 */
	@Override
	public <T> void visitCtTypeAccess(CtTypeAccess<T> typeAccess) {
		final CtTypeReference<T> type = typeAccess.getAccessedType();
		String typeAS = type.getSimpleName();
		if (true || isStaticImported(typeAS, false) != null) {
			printer.writeCodeSnippet(typeAS);
		} else {
			super.visitCtTypeAccess(typeAccess);
		}
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

	/**
	 * TODO Describe the purpose of this method.
	 * 
	 * @param t
	 * @param assignedLiteral
	 * @return
	 */
	public boolean visitOverride(String t, CtExpression<?> ctExpressionIn) {

		if (ctExpressionIn == null)
			return false;
		if (t.equals("reader_make_constant_shell")) {
			return visitOverride("makeCycConstant", ctExpressionIn);
		}
		String ctExpression = toAssignedLiteral(ctExpressionIn);

		if (t.equals("makeSymbol")) {
			String fn = toSymbolFieldName(ctExpression);
			if (visitCommonSymbols(fn))
				return true;
		} else if (t.equals("makeKeyword")) {
			String fn = "$" + toFieldName(ctExpression, '_', '-');
			if (visitCommonSymbols(fn))
				return true;
		} else if (t.equals("makeCycConstant")) {
			String fn = "$$" + toFieldName(ctExpression, '_', '-');
			if (visitCommonSymbols(fn))
				return true;
		} else if (t.equals("makeString")) {
			String fn = "$$$" + toFieldName(ctExpression, ' ', ' ');
			if (visitCommonSymbols(fn))
				return true;
		}
		return false;
	}

	/**
	 * Write the compilation unit header.
	 */
	@Override
	public DefaultJavaPrettyPrinter writeHeader(List<CtType<?>> types, Collection<CtImport> imports) {
		elementPrinterHelper.writeHeader(types, imports);
		return this;
	}

	/**
	 * TODO Describe the purpose of this method.
	 * 
	 * @param <T>
	 * @param reference
	 * @return
	 */
	private <T> CtTypeReference getDeclaringType(CtElement e) {
		CtTypeReference declaringType = null;
		if (e instanceof CtFieldReference) {
			CtFieldReference<T> reference = (CtFieldReference<T>) e;
			declaringType = reference.getDeclaringType();
			if (declaringType == null) {
				CtField ctfld = reference.getDeclaration();
				if (ctfld != null) {
					CtType df = ctfld.getDeclaringType();
					if (df != null) {
						declaringType = df.getReference();
						if (declaringType != null)
							return declaringType;
					}
				}
			}
		}
		CtType foo = e.getParent(CtType.class);
		// Throws on purpose
		declaringType = foo.getReference();
		final String qualifiedName = declaringType.getQualifiedName();
		final String simpleName = declaringType.getSimpleName();
		qualifiedName.contains(simpleName);
		return declaringType;
	}

	/**
	 * TODO Describe the purpose of this method.
	 * 
	 * @param factory
	 * @param newImports
	 * @return
	 */
	private Collection<? extends CtImport> getDefaultImports(final Factory factory) {
		final HashSet<CtImport> newImports = new HashSet<CtImport>();
		if (classSpooner != null) {
			final HashSet<CtImport> extraImports = classSpooner.extraImports;
			for (final CtImport c0 : extraImports) {
				newImports.add(c0);
			}
		}

		CtTypeReference<?> currentOutterType = context.currentTopLevel;
		if (false && currentOutterType != null) {
			System.err.println("import self statically: " + currentOutterType.getTopLevelType());
			final CtTypeMemberWildcardImportReference e = factory
					.createTypeMemberWildcardImportReference(currentOutterType);
			final CtImport ctImportImpl = factory.createImport(e);
			newImports.add(ctImportImpl);
		}
		String outterQualifiedName = getQName();

		if (true) {
			for (final Class c : STATIC_IMPORT_CLASSES) {
				final CtTypeReference t = factory.createCtTypeReference(c);
				if (t.getQualifiedName().equals(outterQualifiedName))
					continue;
				final CtTypeMemberWildcardImportReference e = factory.createTypeMemberWildcardImportReference(t);
				final CtImport ctImportImpl = t.getFactory().createImport(e);
				newImports.add(ctImportImpl);
			}
		}
		if (true) {
			for (final Class c : IMPORT_CLASSES) {
				final CtTypeReference t = factory.createCtTypeReference(c);
				if (t.getQualifiedName().equals(outterQualifiedName))
					continue;
				final CtImport ctImportImpl = t.getFactory().createImport(t);
				newImports.add(ctImportImpl);
			}
		}
		return newImports;
	}

	/**
	 * TODO Describe the purpose of this method.
	 * 
	 * @param currentOutterType
	 * @return
	 */
	private String getQName() {
		CtTypeReference<?> currentOutterType = context.currentTopLevel;
		String outterQualifiedName = "unknonw";
		if (currentOutterType != null)
			outterQualifiedName = currentOutterType.getQualifiedName();
		return outterQualifiedName;
	}

	/**
	 * TODO Describe the purpose of this method.
	 * 
	 * @param simpleName
	 * @return
	 */
	private boolean isImportedSimple(String simpleName) {
		if (simpleName == null)
			return false;
		if (simpleName.equals("structDecl") || simpleName.equals("NIL") || simpleName.equals("T"))
			return true;
		if (simpleName.equals("UNPROVIDED"))
			return true;
		return false;

	}

	/**
	 * TODO Describe the purpose of this method.
	 * 
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

				final CtTypeReference v = getDeclaringType((CtFieldReference<T>) refr);
				String currentType = context.currentTopLevel.getQualifiedName();
				if (currentType == null || (v != null && v.getQualifiedName().equals(currentType))) {
					return true;
				}
				return !isImported((CtFieldReference) refr);
			}
		}
		return false;
	}

	/**
	 * Enters an expression.
	 */
	@Override
	protected void enterCtExpression(CtExpression<?> e) {
		if (isGone(e)) {
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
			// TODO AnnotationLoopTest#testAnnotationDeclaredInForInit expects that
			// annotations of next for variables are not printed
			// but may be correct is that the next variables are not annotated, because they
			// might have different annotation then first param!
			elementPrinterHelper.writeAnnotations(s);
		}
		if (!context.isFirstForVariable() && !context.isNextForVariable()) {
			if (s.getLabel() != null) {
				printer.writeIdentifier(s.getLabel()).writeSpace().writeSeparator(":").writeSpace();
			}
		}
	}

	/**
	 * Exits an expression.
	 */
	@Override
	protected void exitCtExpression(CtExpression<?> e) {
		while ((!context.parenthesedExpression.isEmpty()) && e == context.parenthesedExpression.peek()) {
			CtExpression<?> exper = context.parenthesedExpression.pop();
			if (classSpooner == null || !isGone(exper)) {
				printer.writeSeparator(")");
			}
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
		if (classSpooner == null || !isGone(statement)) {

			if (!(statement instanceof CtBlock || statement instanceof CtIf || statement instanceof CtFor
					|| statement instanceof CtForEach || statement instanceof CtWhile || statement instanceof CtTry
					|| statement instanceof CtSwitch || statement instanceof CtSynchronized
					|| statement instanceof CtClass || statement instanceof CtComment)) {
				if (context.isStatement(statement) && //
						!context.isFirstForVariable() && !context.isNextForVariable()) {
					printer.writeSeparator(";");
				}
			}
		}
		elementPrinterHelper.writeComment(statement, CommentOffset.AFTER);
	}

	/**
	 * TODO Describe the purpose of this method.
	 * 
	 * @param e
	 */
	protected void reallWriteEle(CtElement e) {
		final Object waswritingEle = writingEle;
		try {

			if (classSpooner != null) {
				if (e instanceof CtVariable) {
					if (e instanceof CtFieldReference) {
						final String ss = ((CtFieldReference) e).getSimpleName();
						final String rr = classSpooner.renames.get(ss);
						if (rr != null) {
							printer.writeIdentifier(rr);
							return;
						}
					}
				}
			}
			e.accept(this);

		} finally {

			writingEle = waswritingEle;

			// TODO: handle finally clause
		}
	}

	/**
	 * TODO Describe the purpose of this method.
	 * 
	 * @param fn
	 */
	boolean visitCommonSymbols(String fn) {
		if (fn == null)
			return false;
		if (isStaticImported(fn, false) != null) {
			printer.writeIdentifier(fn);
			return true;
		}
		return false;
	}

}