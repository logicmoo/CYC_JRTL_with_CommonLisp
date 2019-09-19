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
 * Provides i18n Resources for Micro.
 * <p/>
 *
 * @author Dieter Wimberger (wimpi)
 * @version @version@ (@date@)
 */
public final class Resources_de extends ListResourceBundle {

  public Object[][] getContents() {
    return contents;
  }//getContents

  static final Object[][] contents = {
      // LOCALIZE THIS
      {Micro.PREV_PAGE_KEY, "Seite Zur"},
      {Micro.NEXT_PAGE_KEY, "Seite Vor"},
      {Micro.TO_TOP_KEY, "Zum Anfng"},
      {Micro.TO_BOTTOM_KEY, "Zum Ende"},
      {Micro.CUT_TEXT_KEY, "Zeile kop"},
      {Micro.UNCUT_TEXT_KEY, "Zeile ein"},
      {Micro.PASTE_MODE_KEY, "EinfModus"},
      {Micro.CLEAR_BUFFER_KEY, "BufferNeu"},
      {Micro.EXIT_KEY, "Beenden"},
      {"pastemode.flag", "    ** Einfuege Modus **"},
      {MicroEd.CLEAR_BUFFER, "Buffer geloescht!"},
      {MicroEd.DELETE_LINE, "Zeile geloescht!"},
      {MicroEd.DELETE_LINE_FAIL, "Die Zeile konnte nicht geloescht werden."},
      {MicroEd.INSERT_LINE, "Zeile eingefuegt!"},
      {MicroEd.INSERT_LINE_FAIL, "Zeile konnte nicht eingefuegt werden."},
      {MicroEd.REPLACE_LINE, "Zeile ersetzt!"},
      {MicroEd.REPLACE_LINE_FAIL, "Zeile konnte nicht ersetzt werden."},
      {MicroEd.SHOW_BUFFER, "Bufferinhalt:"},
      {MicroEd.PASTE_MODE_START, "Einfuege Modus (beenden und anzeigen des Buffers mit STRG-p)" + TerminalIO.CRLF},
      {MicroEd.PASTE_MODE_END, "Einfuege Modus beendet."},
      {MicroEd.HELP, "\001CMicroEd v1.0 Kommandos \001W(in einer Zeile):" + TerminalIO.CRLF +
          "\001G!DL[#] \001W(loescht die letzte Zeile oder die Zeile mit dem optional angegebenen Index)" + TerminalIO.CRLF +
          "\001G!IL<#> \001Y<dein Text> \001W(fuegt eine neue Zeile am angegeben Index ein)" + TerminalIO.CRLF +
          "\001G!RL<#> \001Y<dein Text> \001W(ersetzt die Zeile am angebenen Index)" + TerminalIO.CRLF +
          "\001G!PM    \001W(Wechselt in den Einfuegemodus)" + TerminalIO.CRLF +
          "\001G!CB    \001W(loescht den gesamten Bufferinhalt)" + TerminalIO.CRLF +
          "\001G!SB    \001W(zeigt den gesamten Bufferinhalt an)" + TerminalIO.CRLF +
          "\001G!AB    \001W(bricht editieren ab)" + TerminalIO.CRLF +
          "\001G!ED    \001W(switch to Micro)" + TerminalIO.CRLF}
      // END OF MATERIAL TO LOCALIZE
  };

}//class Resources
