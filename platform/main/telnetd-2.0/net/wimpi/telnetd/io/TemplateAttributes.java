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
package net.wimpi.telnetd.io;

/**
 * Interface defining the contract for
 * template attribute instances.
 * <p/>
 *
 * @author Dieter Wimberger (wimpi)
 * @version @version@ (@date@)
 */
public interface TemplateAttributes {

  /**
   * Adds an attribute to this <tt>TemplateAttributes</tt>.
   * Note that duplicate name references will automatically
   * be translated into a multivalue attribute (iterateable),
   * in a guaranteed FIFO sequence.
   *
   * @param name  the name of the attribute.
   * @param value the value.
   */
  public void add(String name, String value);

  /**
   * Adds an aggregate attribute to this <tt>TemplateAttributes</tt>.
   * Notes:
   * <ul>
   * <li>Aggregates require a composite key value e.g.<tt>names.{first,last}</tt>.</li>
   * <li>Each duplicate key will be translated automatically into a
   * multivalue attribute (iterateable), in a guaranteed FIFO sequence.</li>
   * <li>A maximum of 5 aggregated values can be handled at the moment.</li>
   * </ul>
   * <p/>
   *
   * @param aggrname the name of the aggregate value.
   * @param values   the values (max 5).
   */
  public void add(String aggrname, String[] values);

}//interface TemplateAttributes
