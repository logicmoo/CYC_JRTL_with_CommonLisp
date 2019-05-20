package jasko.tim.lisp.util;
//basically i only added abstract class and isEnd.

/*******************************************************************************
 * Copyright (c) 2000, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
import org.eclipse.core.runtime.Assert;
import org.eclipse.jface.text.rules.*;



/**
 * A specific single line rule which stipulates that the start
 * and end sequence occur within a single word, as defined by a word detector.
 *
 * @see IWordDetector
 */
public class ExactWordPatternRule extends PatternRule {
	String word;
	public ExactWordPatternRule(String word,IToken token) {
		super(word,"",token,(char)0,true);
		this.word = word;
	}
	
	@Override
	protected boolean endSequenceDetected(ICharacterScanner scanner) {
		return true;
	}
}