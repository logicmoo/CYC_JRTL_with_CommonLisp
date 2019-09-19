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
package net.wimpi.telnetd.service;


import java.util.Dictionary;

import org.osgi.service.cm.ConfigurationException;

import net.wimpi.telnetd.io.Templates;


/**
 * Service providing template based and internationalized output.
 * <p/>
 * An implementation of this service should load template bundles
 * with the given prefix for all available languages. Failure of
 * the reloadTemplates should not affect the running configuration.
 *
 * @author Dieter Wimberger (wimpi)
 * @version @version@ (@date@)
 */
public interface TemplatesService {

  /**
   * Creates a {@link Templates} instance with the given configuration
   * dictionary.
   * <p>
   * The configuration dictionary should hold the following attributes:
   * <ul>
   * <li>identifier (String;for log messages)</li>
   * <li>styles.file (String)</li>
   * <li>templates.path (String)</li>
   * <li>templates.basename (String)</li>
   * <li>templates.languages (String, comma separated list of ISO 631 Langs)</li>
   * <li>attributes.pool.maxactive (int)</li>
   * <li>attributes.pool.maxidle (int)</li>
   * <li>attributes.pool.minidle (int)</li>
   * <li>attributes.pool.maxwait (int)</li>
   * <li>attributes.pool.exhaustaction (grow|fail|block)</li>
   * <li>templates.pool.maxactive (int)</li>
   * <li>templates.pool.maxidle (int)</li>
   * <li>templates.pool.minidle (int)</li>
   * <li>templates.pool.maxwait (int)</li>
   * <li>templates.pool.exhaustaction (grow|fail|block)</li>
   * </ul>
   * </p>
   *
   * @return a {@link Templates} instance
   */
  public Templates createTemplates(Dictionary conf) throws ConfigurationException;

}//interface TemplatesService

/*
 <AD name="%styles.file" description="%styles.file.description" id="styles.file" type="String" default="styles.xml"/>
    <AD name="%templates.path" description="%templates.path.description" id="templates.path" type="String" default=""/>
    <AD name="%templates.basename" description="%templates.basename.description" id="templates.basename" type="String"
        default="templates"/>
    <AD name="%templates.languages" description="%templates.languages.description" id="templates.languages"
        type="String" default=""/>

    <AD name="%attributes.pool.maxactive" description="%attributes.pool.maxactive.description"
        id="attributes.pool.maxactive" type="Integer" cardinality="0"
        default="25"/>
    <AD name="%attributes.pool.maxidle" description="%attributes.pool.maxidle.description" id="attributes.pool.maxidle"
        type="Integer" cardinality="0"
        default="10"/>
    <AD name="%attributes.pool.minidle" description="%attributes.pool.minidle.description" id="attributes.pool.minidle"
        type="Integer" cardinality="0"
        default="5"/>
    <AD name="%attributes.pool.maxwait" description="%attributes.pool.maxwait.description" id="attributes.pool.maxwait"
        type="Integer" cardinality="0"
        default="-1"/>
    <AD name="%attributes.pool.exhaustaction" description="%attributes.pool.exhaustaction"
        id="attributes.pool.exhaustaction"
        type="String" default="grow">
      <Option label="%pool.exhaustaction.grow" value="grow"/>
      <Option label="%pool.exhaustaction.fail" value="fail"/>
      <Option label="%pool.exhaustaction.block" value="block"/>
    </AD>


    <AD name="%templates.pool.maxactive" description="%templates.pool.maxactive.description"
        id="templates.pool.maxactive" type="Integer" cardinality="0"
        default="25"/>
    <AD name="%templates.pool.maxidle" description="%templates.pool.maxidle.description" id="templates.pool.maxidle"
        type="Integer" cardinality="0"
        default="10"/>
    <AD name="%templates.pool.minidle" description="%templates.pool.minidle.description" id="templates.pool.minidle"
        type="Integer" cardinality="0"
        default="5"/>
    <AD name="%templates.pool.maxwait" description="%templates.pool.maxwait.description" id="templates.pool.maxwait"
        type="Integer" cardinality="0"
        default="-1"/>
    <AD name="%templates.pool.exhaustaction" description="%templates.pool.exhaustaction"
        id="templates.pool.exhaustaction"
        type="String" default="grow">
      <Option label="%pool.exhaustaction.grow" value="grow"/>
      <Option label="%pool.exhaustaction.fail" value="fail"/>
      <Option label="%pool.exhaustaction.block" value="block"/>
    </AD>


styles.file=Styles File
styles.file.description=The file that contains the style configuration.
templates.path=Templates Path
templates.path.description=The path to the template files.
templates.basename=Templates Basename
templates.basename.description=The basename of the template files [<basename>_<language>.xml].
templates.languages=Avail. Template Languages
templates.languages.description=A comma separated list of ISO 2-Letter language codes for all available templates.

attributes.pool.maxactive=Max. Active Attributes
attributes.pool.maxactive.description=The maximum number of active attributes instances in the pool.
attributes.pool.maxidle=Max. Idle Attributes
attributes.pool.maxidle.description=The maximum number of idle attributes instances in the pool.
attributes.pool.minidle=Min. Idle Attributes
attributes.pool.minidle.description=The minimum number of idle attributes instances in the pool.
attributes.pool.maxwait=Max. Attribute Wait Time
attributes.pool.maxwait.description=The maximum time to wait for an attributes instance from the pool.
attributes.pool.exhaustaction=Attribute Pool Exhaustaction
attributes.pool.exhaustaction.description=The action when the attributes instance pool is exhausted.

templates.pool.maxactive=Max. Active Templates
templates.pool.maxactive.description=The maximum number of active template instances in the pool.
templates.pool.maxidle=Max. Idle Templates
templates.pool.maxidle.description=The maximum number of idle template instances in the pool.
templates.pool.minidle=Min. Idle Templates
templates.pool.minidle.description=The minimum number of idle template instances in the pool.
templates.pool.maxwait=Max. Template Wait Time
templates.pool.maxwait.description=The maximum time to wait for an template instance from the pool.
templates.pool.exhaustaction=Template Pool Exhaustaction
templates.pool.exhaustaction.description=The action when the template instance pool is exhausted.


pool.exhaustaction.grow=Grow
pool.exhaustaction.fail=Fail (Max.Active)
pool.exhaustaction.block=Block (Max.Wait)

*/