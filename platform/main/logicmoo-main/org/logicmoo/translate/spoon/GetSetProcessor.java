package org.logicmoo.translate.spoon;


import spoon.processing.AbstractProcessor;
import spoon.reflect.code.CtBlock;
import spoon.reflect.code.CtCodeSnippetStatement;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtReturn;
import spoon.reflect.declaration.*;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.filter.AnnotationFilter;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.logicmoo.system.annotation.*;

/**
 * Created by Erwin on 11/12/2016.
 */
public class GetSetProcessor extends AbstractProcessor<CtClass<?>> {

    @Override
    public void process(CtClass<?> ctClass) {
        for (CtElement ctElement : ctClass.getElements(new AnnotationFilter<>(GetSet.class))) {
            if (ctElement instanceof CtField) {
                CtField ctField = (CtField) ctElement;
                generateGetter(ctClass, ctField);
                generateSetter(ctClass, ctField);
            }
        }
    }

    private void generateGetter(CtClass<?> ctClass, CtField<?> ctField) {
        CtReturn returnStatement = getFactory().Core().createReturn();
        CtExpression returnExpression = getFactory().Code().createCodeSnippetExpression(ctField.getSimpleName());
        returnStatement.setReturnedExpression(returnExpression);
        CtBlock body = getFactory().Code().createCtBlock(returnStatement);
        CtMethod getter = getFactory().Method().create(ctClass, new HashSet<ModifierKind>(Arrays.asList(ModifierKind.PUBLIC)), ctField.getType(), "get"+capitalize(ctField.getSimpleName()), null, null, body);
        ctClass.addMethod(getter);
    }

    private void generateSetter(CtClass<?> ctClass, CtField ctField) {
        CtTypeReference voidReference = getFactory().Code().createCtTypeReference(void.class);

        CtParameter<?> parameter = getFactory().Core().createParameter();
        parameter.setType(ctField.getType());
        parameter.setSimpleName(ctField.getSimpleName());
        List<CtParameter<?>> parameterList = Arrays.asList(parameter);

        CtCodeSnippetStatement assignment = getFactory().Code().createCodeSnippetStatement("this."+ctField.getSimpleName()+" = "+ctField.getSimpleName());
        CtBlock body = getFactory().Code().createCtBlock(assignment);

        CtMethod setter = getFactory().Method().create(ctClass, new HashSet<ModifierKind>(Arrays.asList(ModifierKind.PUBLIC)),voidReference, "set"+capitalize(ctField.getSimpleName()), parameterList, null, body);
        ctClass.addMethod(setter);
    }

    private String capitalize(String original){
        return  original.substring(0, 1).toUpperCase() + original.substring(1);
    }

}
