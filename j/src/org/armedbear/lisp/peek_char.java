/*
 * peek_char.java
 *
 * Copyright (C) 2004 Peter Graves
 * $Id: peek_char.java,v 1.2 2004-01-24 19:55:56 piso Exp $
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
 */

package org.armedbear.lisp;

// ### peek-char
public final class peek_char extends Primitive
{
    private peek_char()
    {
        super("peek-char",
              "&optional peek-type input-stream eof-error-p eof-value recursive-p");
    }

    public LispObject execute(LispObject[] args) throws ConditionThrowable
    {
        int length = args.length;
        if (length > 5)
            signal(new WrongNumberOfArgumentsException(this));
        LispObject peekType = length > 0 ? args[0] : NIL;
        Stream stream =
            length > 1 ? checkCharacterInputStream(args[1]) : getStandardInput();
        boolean eofError = length > 2 ? (args[2] != NIL) : true;
        LispObject eofValue = length > 3 ? args[3] : NIL;
        boolean recursive = length > 4 ? (args[4] != NIL) : false;
        if (peekType == NIL) {
            LispObject result = stream.readChar(eofError, eofValue);
            if (result instanceof LispCharacter)
                stream.unreadChar((LispCharacter)result);
            return result;
        }
        if (peekType == T) {
            while (true) {
                LispObject result = stream.readChar(eofError, eofValue);
                if (result instanceof LispCharacter) {
                    char c = ((LispCharacter)result).getValue();
                    if (!Character.isWhitespace(c)) {
                        stream.unreadChar((LispCharacter)result);
                        return result;
                    }
                } else
                    return result;
            }
        }
        if (peekType instanceof LispCharacter) {
            char c = ((LispCharacter)peekType).getValue();
            while (true) {
                LispObject result = stream.readChar(eofError, eofValue);
                if (result instanceof LispCharacter) {
                    if (((LispCharacter)result).getValue() == c) {
                        stream.unreadChar((LispCharacter)result);
                        return result;
                    }
                } else
                    return result;
            }
        }
        return signal(new SimpleError(String.valueOf(peekType) +
                                      " is an illegal peek-type."));
    }

    private static final Primitive PEEK_CHAR = new peek_char();
}
