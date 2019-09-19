/***
 * Java TelnetD library (embeddable telnet daemon)
 * Copyright (c) Dieter Wimberger
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 * Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 *
 * Neither the name of the author nor the names of its contributors
 * may be used to endorse or promote products derived from this software
 * without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDER AND CONTRIBUTORS ``AS
 * IS'' AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE REGENTS OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 ***/
package net.wimpi.telnetd.io.micro;

import java.util.ListResourceBundle;

import net.wimpi.telnetd.io.TerminalIO;

/**
 * Provides i18n Resources for {@link Micro} and {@link MicroEd}.
 * <p/>
 *
 * @author Dieter Wimberger (wimpi)
 * @version @version@ (@date@)
 */
public final class Resources extends ListResourceBundle {

  public Object[][] getContents() {
    return contents;
  }//getContents

  static final Object[][] contents = {
      // LOCALIZE THIS
      {Micro.PREV_PAGE_KEY, "Prev Page"},
      {Micro.NEXT_PAGE_KEY, "Next Page"},
      {Micro.TO_TOP_KEY, "To Top"},
      {Micro.TO_BOTTOM_KEY, "To Bottom"},
      {Micro.CUT_TEXT_KEY, "Cut Text"},
      {Micro.UNCUT_TEXT_KEY, "Uncut Txt"},
      {Micro.PASTE_MODE_KEY, "Paste Mde"},
      {Micro.CLEAR_BUFFER_KEY, "Clear Txt"},
      {Micro.EXIT_KEY, "Exit"},
      {"pastemode.flag", "    ** PASTE MODE **"},
      {MicroEd.CLEAR_BUFFER, "Buffer cleared!"},
      {MicroEd.DELETE_LINE, "Line deleted!"},
      {MicroEd.DELETE_LINE_FAIL, "Failed to delete line."},
      {MicroEd.INSERT_LINE, "Line inserted!"},
      {MicroEd.INSERT_LINE_FAIL, "Failed to insert line."},
      {MicroEd.REPLACE_LINE, "Line replaced!"},
      {MicroEd.REPLACE_LINE_FAIL, "Failed to replace line."},
      {MicroEd.SHOW_BUFFER, "Buffer Content:"},
      {MicroEd.PASTE_MODE_START, "Paste Mode (end and display pasted with CTRL-p)" + TerminalIO.CRLF},
      {MicroEd.PASTE_MODE_END, "End Paste Mode."},
      {MicroEd.HELP, "\001CMicroEd v1.0 Commands \001W(enter as line):" + TerminalIO.CRLF +
          "\001G!DL[#] \001W(deletes the last line or the line of the optionally given index)" + TerminalIO.CRLF +
          "\001G!IL<#> \001Y<your text> \001W(inserts a new line at the given index)" + TerminalIO.CRLF +
          "\001G!RL<#> \001Y<your text> \001W(replaces the line at the given index)" + TerminalIO.CRLF +
          "\001G!PM    \001W(switches to paste mode)" + TerminalIO.CRLF +
          "\001G!CB    \001W(clears the buffer content)" + TerminalIO.CRLF +
          "\001G!SB    \001W(shows the current buffer contents)" + TerminalIO.CRLF +
          "\001G!AB    \001W(aborts editing)" + TerminalIO.CRLF +
          "\001G!ED    \001W(switch to Micro)" + TerminalIO.CRLF
      }
      // END OF MATERIAL TO LOCALIZE
  };

}//class Resources
