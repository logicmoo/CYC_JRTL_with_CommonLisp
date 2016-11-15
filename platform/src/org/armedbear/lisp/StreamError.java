/*
 * StreamError.java
 *
 * Copyright (C) 2002-2005 Peter Graves
 * $Id: StreamError.java 12320 2010-01-01 15:38:33Z ehuelsmann $
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

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;

public class StreamError extends LispError {
	// ### stream-error-stream
	private static Primitive STREAM_ERROR_STREAM = new JavaPrimitive("stream-error-stream", "condition") {

		public SubLObject execute(SubLObject arg) {
			if (arg instanceof StreamError)
				return ((StreamError) arg).getStream();
			return Lisp.error(new TypeError(arg, LispSymbols.STREAM_ERROR));
		}
	};

	private Throwable cause;

	protected StreamError(LispClass cls) {
		super(cls);
		this.cause = null;
	}

	public StreamError(LispStream stream) {
		super(StandardClass.STREAM_ERROR);
		this.setStream(stream != null ? stream : Lisp.NIL);
		this.cause = null;
	}

	public StreamError(LispStream stream, String message) {
		super(StandardClass.STREAM_ERROR);
		this.setFormatControl(message);
		this.setFormatArguments(Lisp.NIL);
		this.setStream(stream != null ? stream : Lisp.NIL);
		this.cause = null;
	}

	public StreamError(LispStream stream, Throwable cause) {
		super(StandardClass.STREAM_ERROR);
		this.setStream(stream != null ? stream : Lisp.NIL);
		this.setFormatControl(cause.getMessage());
		this.setFormatArguments(Lisp.NIL);
		this.cause = cause;
	}

	public StreamError(String message) {
		super(StandardClass.STREAM_ERROR);
		this.setFormatControl(message);
		this.setFormatArguments(Lisp.NIL);
		this.setStream(Lisp.NIL);
		this.cause = null;
	}

	public StreamError(String message, LispStream stream) {
		super(StandardClass.STREAM_ERROR);
		this.setFormatControl(message);
		this.setFormatArguments(Lisp.NIL);
		this.setStream(stream != null ? stream : Lisp.NIL);
		this.cause = null;
	}

	public StreamError(SubLObject initArgs) {
		super(StandardClass.STREAM_ERROR);
		this.initialize(initArgs);
		this.cause = null;
	}

	public SubLObject classOf() {
		return StandardClass.STREAM_ERROR;
	}

	public String getMessage() {
		if (this.cause != null) {
			String s = this.cause.getMessage();
			if (s != null && s.length() > 0)
				return s;
		}
		return null;
	}

	public SubLObject getStream() {
		return this.getInstanceSlotValue(LispSymbols.STREAM);
	}

	protected void initialize(SubLObject initArgs) {
		super.initialize(initArgs);
		while (initArgs != Lisp.NIL) {
			SubLObject first = initArgs.first();
			initArgs = initArgs.rest();
			if (first == Keyword.STREAM) {
				this.setStream(initArgs.first());
				break;
			}
			initArgs = initArgs.rest();
		}
	}

	protected void setStream(SubLObject stream) {
		this.setInstanceSlotValue(LispSymbols.STREAM, stream);
	}

	public SubLObject typeOf() {
		return LispSymbols.STREAM_ERROR;
	}

	public SubLObject typep(SubLObject type) {
		if (type == LispSymbols.STREAM_ERROR)
			return Lisp.T;
		if (type == StandardClass.STREAM_ERROR)
			return Lisp.T;
		return super.typep(type);
	}
}
