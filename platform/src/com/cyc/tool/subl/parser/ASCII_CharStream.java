/* For LarKC */
package com.cyc.tool.subl.parser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class ASCII_CharStream {
	public ASCII_CharStream(InputStream dstream, int startline, int startcolumn) {
		this(dstream, startline, startcolumn, 4096);
	}

	public ASCII_CharStream(InputStream dstream, int startline, int startcolumn, int buffersize) {
		this(new InputStreamReader(dstream), startline, startcolumn, 4096);
	}

	public ASCII_CharStream(Reader dstream, int startline, int startcolumn) {
		this(dstream, startline, startcolumn, 4096);
	}

	public ASCII_CharStream(Reader dstream, int startline, int startcolumn, int buffersize) {
		bufpos = -1;
		column = 0;
		line = 1;
		prevCharIsCR = false;
		prevCharIsLF = false;
		maxNextCharInd = 0;
		inBuf = 0;
		inputStream = dstream;
		line = startline;
		column = startcolumn - 1;
		bufsize = buffersize;
		available = buffersize;
		buffer = new char[buffersize];
		bufline = new int[buffersize];
		bufcolumn = new int[buffersize];
	}

	int bufsize;
	int available;
	int tokenBegin;
	public int bufpos;
	private int[] bufline;
	private int[] bufcolumn;
	private int column;
	private int line;
	private boolean prevCharIsCR;
	private boolean prevCharIsLF;
	private Reader inputStream;
	private char[] buffer;
	private int maxNextCharInd;
	private int inBuf;
	public static boolean staticFlag = false;

	private void ExpandBuff(boolean wrapAround) {
		char[] newbuffer = new char[bufsize + 2048];
		int[] newbufline = new int[bufsize + 2048];
		int[] newbufcolumn = new int[bufsize + 2048];
		try {
			if (wrapAround) {
				System.arraycopy(buffer, tokenBegin, newbuffer, 0, bufsize - tokenBegin);
				System.arraycopy(buffer, 0, newbuffer, bufsize - tokenBegin, bufpos);
				buffer = newbuffer;
				System.arraycopy(bufline, tokenBegin, newbufline, 0, bufsize - tokenBegin);
				System.arraycopy(bufline, 0, newbufline, bufsize - tokenBegin, bufpos);
				bufline = newbufline;
				System.arraycopy(bufcolumn, tokenBegin, newbufcolumn, 0, bufsize - tokenBegin);
				System.arraycopy(bufcolumn, 0, newbufcolumn, bufsize - tokenBegin, bufpos);
				bufcolumn = newbufcolumn;
				int n = bufpos + bufsize - tokenBegin;
				bufpos = n;
				maxNextCharInd = n;
			} else {
				System.arraycopy(buffer, tokenBegin, newbuffer, 0, bufsize - tokenBegin);
				buffer = newbuffer;
				System.arraycopy(bufline, tokenBegin, newbufline, 0, bufsize - tokenBegin);
				bufline = newbufline;
				System.arraycopy(bufcolumn, tokenBegin, newbufcolumn, 0, bufsize - tokenBegin);
				bufcolumn = newbufcolumn;
				int n2 = bufpos - tokenBegin;
				bufpos = n2;
				maxNextCharInd = n2;
			}
		} catch (Throwable t) {
			throw new Error(t.getMessage());
		}
		bufsize += 2048;
		available = bufsize;
		tokenBegin = 0;
	}

	private void FillBuff() throws IOException {
		if (maxNextCharInd == available)
			if (available == bufsize) {
				if (tokenBegin > 2048) {
					boolean b = false;
					maxNextCharInd = b ? 1 : 0;
					bufpos = b ? 1 : 0;
					available = tokenBegin;
				} else if (tokenBegin < 0) {
					boolean b2 = false;
					maxNextCharInd = b2 ? 1 : 0;
					bufpos = b2 ? 1 : 0;
				} else
					ExpandBuff(false);
			} else if (available > tokenBegin)
				available = bufsize;
			else if (tokenBegin - available < 2048)
				ExpandBuff(true);
			else
				available = tokenBegin;
		try {
			int i;
			if ((i = inputStream.read(buffer, maxNextCharInd, available - maxNextCharInd)) == -1) {
				inputStream.close();
				throw new IOException();
			}
			maxNextCharInd += i;
		} catch (IOException e) {
			--bufpos;
			backup(0);
			if (tokenBegin == -1)
				tokenBegin = bufpos;
			throw e;
		}
	}

	private void UpdateLineColumn(char c) {
		++column;
		if (prevCharIsLF) {
			prevCharIsLF = false;
			int line = this.line;
			int column = 1;
			this.column = column;
			this.line = line + column;
		} else if (prevCharIsCR) {
			prevCharIsCR = false;
			if (c == '\n')
				prevCharIsLF = true;
			else {
				int line2 = line;
				int column2 = 1;
				column = column2;
				line = line2 + column2;
			}
		}
		switch (c) {
		case '\r':
			prevCharIsCR = true;
			break;
		case '\n':
			prevCharIsLF = true;
			break;
		case '\t':
			--column;
			column += 8 - (column & 0x7);
			break;
		}
		bufline[bufpos] = line;
		bufcolumn[bufpos] = column;
	}

	public void adjustBeginLineColumn(int newLine, int newCol) {
		int start = tokenBegin;
		int len;
		if (bufpos >= tokenBegin)
			len = bufpos - tokenBegin + inBuf + 1;
		else
			len = bufsize - tokenBegin + bufpos + 1 + inBuf;
		int i = 0;
		int j = 0;
		int k = 0;
		int nextColDiff = 0;
		int columnDiff = 0;
		while (i < len && bufline[j = start % bufsize] == bufline[k = ++start % bufsize]) {
			bufline[j] = newLine;
			nextColDiff = columnDiff + bufcolumn[k] - bufcolumn[j];
			bufcolumn[j] = newCol + columnDiff;
			columnDiff = nextColDiff;
			++i;
		}
		if (i < len) {
			bufline[j] = newLine++;
			bufcolumn[j] = newCol + columnDiff;
			while (i++ < len)
				if (bufline[j = start % bufsize] != bufline[++start % bufsize])
					bufline[j] = newLine++;
				else
					bufline[j] = newLine;
		}
		line = bufline[j];
		column = bufcolumn[j];
	}

	public void backup(int amount) {
		inBuf += amount;
		int bufpos = this.bufpos - amount;
		this.bufpos = bufpos;
		if (bufpos < 0)
			this.bufpos += bufsize;
	}

	public char BeginToken() throws IOException {
		tokenBegin = -1;
		char c = readChar();
		tokenBegin = bufpos;
		return c;
	}

	public void Done() {
		buffer = null;
		bufline = null;
		bufcolumn = null;
	}

	public int getBeginColumn() {
		return bufcolumn[tokenBegin];
	}

	public int getBeginLine() {
		return bufline[tokenBegin];
	}

	public int getColumn() {
		return bufcolumn[bufpos];
	}

	public int getEndColumn() {
		return bufcolumn[bufpos];
	}

	public int getEndLine() {
		return bufline[bufpos];
	}

	public String GetImage() {
		if (bufpos >= tokenBegin)
			return new String(buffer, tokenBegin, bufpos - tokenBegin + 1);
		return new String(buffer, tokenBegin, bufsize - tokenBegin) + new String(buffer, 0, bufpos + 1);
	}

	public int getLine() {
		return bufline[bufpos];
	}

	public char[] GetSuffix(int len) {
		char[] ret = new char[len];
		if (bufpos + 1 >= len)
			System.arraycopy(buffer, bufpos - len + 1, ret, 0, len);
		else {
			System.arraycopy(buffer, bufsize - (len - bufpos - 1), ret, 0, len - bufpos - 1);
			System.arraycopy(buffer, 0, ret, len - bufpos - 1, bufpos + 1);
		}
		return ret;
	}

	public char readChar() throws IOException {
		if (inBuf > 0) {
			--inBuf;
			return (char) ('\u00ff' & buffer[bufpos == bufsize - 1 ? (bufpos = 0) : ++bufpos]);
		}
		if (++bufpos >= maxNextCharInd)
			FillBuff();
		char c = (char) ('\u00ff' & buffer[bufpos]);
		UpdateLineColumn(c);
		return c;
	}

	public void ReInit(InputStream dstream, int startline, int startcolumn) {
		this.ReInit(dstream, startline, startcolumn, 4096);
	}

	public void ReInit(InputStream dstream, int startline, int startcolumn, int buffersize) {
		this.ReInit(new InputStreamReader(dstream), startline, startcolumn, 4096);
	}

	public void ReInit(Reader dstream, int startline, int startcolumn) {
		this.ReInit(dstream, startline, startcolumn, 4096);
	}

	public void ReInit(Reader dstream, int startline, int startcolumn, int buffersize) {
		inputStream = dstream;
		line = startline;
		column = startcolumn - 1;
		if (buffer == null || buffersize != buffer.length) {
			bufsize = buffersize;
			available = buffersize;
			buffer = new char[buffersize];
			bufline = new int[buffersize];
			bufcolumn = new int[buffersize];
		}
		boolean b = false;
		prevCharIsCR = b;
		prevCharIsLF = b;
		boolean tokenBegin = false;
		maxNextCharInd = tokenBegin ? 1 : 0;
		inBuf = tokenBegin ? 1 : 0;
		this.tokenBegin = tokenBegin ? 1 : 0;
		bufpos = -1;
	}
}
