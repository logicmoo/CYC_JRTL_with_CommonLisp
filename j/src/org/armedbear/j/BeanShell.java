/*
 * BeanShell.java
 *
 * Copyright (C) 2002 Peter Graves
 * $Id: BeanShell.java,v 1.1.1.1 2002-09-24 16:08:39 piso Exp $
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

package org.armedbear.j;

import bsh.Interpreter;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public final class BeanShell
{
    public static void runStartupScript()
    {
        File file = Editor.getStartupScript();
        if (file != null && file.isFile()) {
            Interpreter interpreter = getInterpreter();
            try {
                Log.info("loading ".concat(file.canonicalPath()));
                interpreter.source(file.canonicalPath());
            }
            catch (Throwable t) {
                Log.error(t);
            }
        }
    }

    public static void evalBuffer()
    {
        long start = System.currentTimeMillis();
        final Editor editor = Editor.currentEditor();
        final Buffer buffer = editor.getBuffer();
        final File file = buffer.getFile();
        if (file != null && file.getName().toLowerCase().endsWith(".bsh")) {
            final Frame frame = editor.getFrame();
            frame.setWaitCursor();
            final String title = "evalBuffer ".concat(file.getName());
            Buffer outputBuffer = null;
            // Re-use existing output buffer if any for same parent buffer.
            for (BufferIterator it = new BufferIterator(); it.hasNext();) {
                Buffer buf = it.nextBuffer();
                if (buf instanceof OutputBuffer && title.equals(buf.getTitle())) {
                    outputBuffer = buf;
                    break;
                }
            }
            Interpreter interpreter = getInterpreter();
            String output = null;
            try {
                interpreter.eval(buffer.getText());
                long elapsed = System.currentTimeMillis() - start;
                // Success.
                FastStringBuffer sb = new FastStringBuffer();
                sb.append("\nEvaluation completed successfully (");
                sb.append(elapsed);
                sb.append(" milliseconds)\n\n");
                output = sb.toString();
            }
            catch (Throwable t) {
                output = t.getMessage();
            }
            finally {
                frame.setDefaultCursor();
            }
            if (output != null && output.length() > 0) {
                output = Utilities.wrap(output, 80, 8);
                if (outputBuffer != null) {
                    outputBuffer.setText(output);
                } else {
                    outputBuffer = OutputBuffer.getOutputBuffer(output);
                    outputBuffer.setTitle(title);
                }
                editor.makeNext(outputBuffer);
                Editor ed = editor.displayInOtherWindow(outputBuffer);
                ed.eob();
                ed.updateDisplay();
            }
        }
    }

    private static Interpreter getInterpreter()
    {
        Interpreter interpreter = new Interpreter();
        InputStream inputStream =
            BeanShell.class.getResourceAsStream("api.bsh");
        if (inputStream != null) {
            BufferedReader reader =
                new BufferedReader(new InputStreamReader(inputStream));
            try {
                interpreter.eval(reader);
            }
            catch (Throwable t){
                Log.error(t);
            }
        }
        return interpreter;
    }
}
