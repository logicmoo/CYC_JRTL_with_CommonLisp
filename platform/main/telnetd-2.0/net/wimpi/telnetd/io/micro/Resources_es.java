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
public final class Resources_es extends ListResourceBundle {

  public Object[][] getContents() {
    return contents;
  }//getContents

  static final Object[][] contents = {
      // LOCALIZE THIS
      {Micro.PREV_PAGE_KEY, "Anterior"},
      {Micro.NEXT_PAGE_KEY, "Siguiente"},
      {Micro.TO_TOP_KEY, "Inicio"},
      {Micro.TO_BOTTOM_KEY, "Final"},
      {Micro.CUT_TEXT_KEY, "Cortar"},
      {Micro.UNCUT_TEXT_KEY, "Pegar"},
      {Micro.PASTE_MODE_KEY, "Modo Pega"},
      {Micro.CLEAR_BUFFER_KEY, "BorrarBuf"},
      {Micro.EXIT_KEY, "Salir"},
      {"pastemode.flag", "    ** Modo de Pegar **"},
      {MicroEd.CLEAR_BUFFER, "Búfer borrado!"},
      {MicroEd.DELETE_LINE, "Línea borrada!"},
      {MicroEd.DELETE_LINE_FAIL, "No se pudo borrar la línea."},
      {MicroEd.INSERT_LINE, "Línea añadida!"},
      {MicroEd.INSERT_LINE_FAIL, "No se pudo añadir la línea."},
      {MicroEd.REPLACE_LINE, "Línea reemplazada!"},
      {MicroEd.REPLACE_LINE_FAIL, "No se pudo reemplazar la línea."},
      {MicroEd.SHOW_BUFFER, "Contenido del búfer:"},
      {MicroEd.PASTE_MODE_START, "Modo de pegar (acabar y mostrar búfer con CTRL-p)" + TerminalIO.CRLF},
      {MicroEd.PASTE_MODE_END, "Fin de Modo de pegar."},
      {MicroEd.HELP, "\001CMicroEd v1.0 Comandos \001W(en una línea):" + TerminalIO.CRLF +
          "\001G!DL[#] \001W(borra la última línea o la línea con el indice opcionalmente dado)" + TerminalIO.CRLF +
          "\001G!IL<#> \001Y<tu texto> \001W(añade una nueva línea con el indice dado)" + TerminalIO.CRLF +
          "\001G!RL<#> \001Y<tu texto> \001W(reemplaza la línea con el indice dado)" + TerminalIO.CRLF +
          "\001G!PM    \001W(cambiar a modo de pegar)" + TerminalIO.CRLF +
          "\001G!CB    \001W(borra el contenido del búfer)" + TerminalIO.CRLF +
          "\001G!SB    \001W(muestra el contenido del búfer)" + TerminalIO.CRLF +
          "\001G!AB    \001W(dejar y salir)" + TerminalIO.CRLF +
          "\001G!ED    \001W(cambiar a Micro)" + TerminalIO.CRLF      
      }
      // END OF MATERIAL TO LOCALIZE
  };

}//class Resources
