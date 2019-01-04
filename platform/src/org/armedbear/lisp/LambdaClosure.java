package org.armedbear.lisp;

public class LambdaClosure extends Closure {

	public LambdaClosure(LispObject lambdaExpression, Environment newEnvironment) {
		super(lambdaExpression, newEnvironment);

	}

	public LambdaClosure(LispObject name, LispObject lambda_expression, Environment env) {
		super(name , lambda_expression, env);

	}

	@Override
	public boolean isClosureSubclass() {
		return false;
	}

}
