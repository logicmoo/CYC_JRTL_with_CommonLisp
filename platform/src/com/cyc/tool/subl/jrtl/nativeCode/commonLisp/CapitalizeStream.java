/*
 * CapitalizeStream.java
 *
 * Copyright (C) 2004-2005 Peter Graves
 * $Id: CapitalizeStream.java 12254 2009-11-06 20:07:54Z ehuelsmann $
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 *
 * As a special exception, the copyright holders of this library give you
 * permission to link this library with independent modules to produce an
 * executable, regardless of the license terms of these independent
 * modules, and to copy and distribute the resulting executable under
 * terms of your choice, provided that you also meet, for each linked
 * independent module, the terms and conditions of the license of that
 * module.  An independent module is a module which is not derived from
 * or based on this library.  If you modify this library, you may extend
 * this exception to your version of the library, but you are not
 * obligated to do so.  If you do not wish to do so, delete this
 * exception statement from your version.
 */

package com.cyc.tool.subl.jrtl.nativeCode.commonLisp;

public class CapitalizeStream extends CaseFrobStream {
	private boolean inWord;

	public CapitalizeStream(LispStream target) {
		super(target);
	}

	public void _writeChar(char c) {
		if (this.inWord) {
			if (Character.isUpperCase(c))
				c = CharacterFunctions.toLowerCase(c);
			else if (!Character.isLowerCase(c) && !Character.isDigit(c))
				this.inWord = false;
		} else // Not in a word.
		if (Character.isUpperCase(c))
			this.inWord = true;
		else if (Character.isLowerCase(c)) {
			c = CharacterFunctions.toUpperCase(c);
			this.inWord = true;
		} else if (Character.isDigit(c))
			this.inWord = true;
		this.target._writeChar(c);
	}

	public void _writeLine(String s) {
		this.target._writeString(s);
		this.target._writeChar('\n');
	}

	public void _writeString(String s) {
		int limit = s.length();
		for (int i = 0; i < limit; i++)
			this._writeChar(s.charAt(i));
	}
}
