#!/usr/bin/env swipl

:- load_files(library(prolog_stack)).
prolog_stack:stack_guard(none).

dmiles_machine:- gethostname('gitlab.logicmoo.org').

:- dmiles_machine -> (getenv('DISPLAY',_)->true;setenv('DISPLAY','10.0.0.122:0.0')) ; true.
%:- ignore(shell('killall -9 xterm')).

:- multifile user:file_search_path/2.
:- dynamic   user:file_search_path/2.
:- asserta((user:file_search_path(jar, ('.')))).
user:file_search_path(runtime, ('.')).

:- use_module(library(logicmoo_utils_all)).
:- use_module(library(dictoo)).

po(O):- atomic(O), format(user_error,'~N% LO: ~w ;; ~w~n',[O.toString,O.getClass.getSimpleName]),!.
po(O):- format(user_error,'~N% PO: ~q ~n',[O]),!.

dwq(Q):- format(user_error,'~N% DWQ: ~q~n',[Q]).

:- meta_predicate dwq_call(0).
dwq_call(Q):- Q *-> dwq(success:Q); (dwq(failed:Q),!,fail).

/*  -*- Prolog -*-

    SWI-Prolog personalization file
*/
sys :- set_prolog_flag(access_level,system).
usys :- set_prolog_flag(access_level,user).
mp_test:- sys, meta_predicate(system: write(7)), meta_predicate(system: writeq(7)), meta_predicate(system:is(7,7)),meta_predicate(system: =:=(7,7)),usys.

:- use_module(library(base32)).

:- set_prolog_flag(access_level,system).
:- set_prolog_flag(report_error,true).
:- set_prolog_flag(fileerrors,false).
:- set_prolog_flag(debug_on_error,true).
:- set_prolog_flag(debug,true).
:- set_prolog_flag(optimise,false).
:- set_prolog_flag(last_call_optimisation,false).
:- set_prolog_flag(generate_debug_info, true).
% :- set_prolog_flag(logicmoo_include,fail).



cl_eval(L):- cl_eval(L, O),po(O).
cyc_eval(L):- cl_cyc_eval(L, O),po(O).
cl_read_lisp(L):- cl_read_lisp(L, O),po(O).
cl_eval_string(L):- cl_eval_string(L, O),po(O).
% cl_eval(L,O):-cl_lisp_eval(L,O).

call_ctrl(Head):- call_ctrl(Head,_).
call_ctrl(Head,O):- strip_module(Head,M,H),oo_deref(M,H,HeadE),dwq_call(call_crtl(call_ctrl,[{HeadE}],O)).
call_crtl(Name,Args,O):-jpl_call('org.logicmoo.system.BeanShellCntrl',Name,Args,O).


/*
:- use_module(library(prolog_history)).
% :- '$toplevel':'$clean_history'.
% :- '$toplevel':setup_history.

 ps -ef | grep  pts\/1 | grep -v grep | awk '{print "sudo kill -9", $2}' | h
*/

:- debug.
:- nodebug(_).
%:- Six = 6, set_prolog_stack(global, limit(Six*10**9)),set_prolog_stack(local, limit(Six*10**9)),set_prolog_stack(trail, limit(Six*10**9)).
%:- set_prolog_flag(gc,false).
:- set_prolog_flag(gc,true).
% user:file_search_path(pack,'/devel/LogicmooDeveloperFramework/PrologMUD/pack' ).

:- if(exists_directory('D:/workspace')).
%:- asserta(user:file_search_path(pack,'D:/workspace')).
%:- asserta(user:file_search_path(library,'D:/workspace/logicmoo_base/prolog')).
%:- asserta(user:file_search_path(runtime,'D:/workspace/runtime')).
:- else.
%:- asserta(user:file_search_path(pack,'/mnt/dddd/workspace')).
%:- asserta(user:file_search_path(library,'/mnt/dddd/workspace/logicmoo_base/prolog')).
%:- asserta(user:file_search_path(runtime,'/mnt/dddd/workspace/runtime')).
:- endif.

:- attach_packs.


:-if(\+ exists_source(library(gui_tracer))).
:-asserta(guitracer).
:-asserta(noguitracer).
:-endif.



%lmv:-lm,call(call,use_listing_vars).
%lm :- use_module(system:library(logicmoo_utils)).
lmb :- use_module(library(pfc)).
lmu :- ensure_loaded(library(logicmoo_user)).

lmp:-
   attach_packs,pack_list_installed.

lmcd:- !.
lmcd:- user:file_search_path(runtime,DIR),cd(DIR).

ss:-lmcd,ensure_loaded(init_mud_server).

lm_repl :-lmcd,system:ensure_loaded(logicmoo_repl),qsave_program(lm_repl).

lms:-lmp,lmcd,call(call,swicli).

%:- lmcd.
:- lmp.


%:- user:use_module(library(lists)).
%:- user:use_module(library(make)).





        /*******************************
         *     PLDOC SETUP
        *******************************/

% :- set_prolog_flag(access_level,system).
% :- set_prolog_flag(gc,false).

%:- user:use_module(library(lists)).

mw:- use_module(library(prolog_modewalk)).

:- dynamic(user:type_modes/3).


nopt :- (initialization((set_prolog_flag(optimise,false),
         set_prolog_flag(last_call_optimisation,false))),
  use_module(library(pce)),
  use_module(library(prolog_xref)),
  use_module(library(pldoc/doc_access)),
  assert((doc_access:can_edit(X):-nonvar(X))),
  assert((doc_access:allow_from(X):-nonvar(X)))).


sf:- forall(source_file(SF), call(call,load_all(SF))).

ds:-
   doc_server(8020,[allow(ip(_,_,_,_)),can_edit(true),workers(8)]),
   use_module(library(pldoc/doc_library)),
   call(call,doc_load_library),
   use_module(library(pldoc/doc_access)),
   assert((doc_access:can_edit(X):-nonvar(X))),
   assert((doc_access:allow_from(X):-nonvar(X))).


% current_module(M),catch(M:'$pldoc'(F//A, Det,O,I),_,fail),format('~q.~n',[M:'$pldoc'(F//A, Det,I)]),fail.
% current_module(M),catch(M:'$mode'(Head, Det),_,fail),format('~q.~n',[M:'$mode'(Head, Det)]),fail.


gm:-
   current_module(M),catch(M:'$pldoc'(F/A, Loc,Text,_),_,fail),
   functor(Head,F,A),
   \+ catch(M:'$mode'(Head,_Det1),_,fail),
   format('~q.~n',[M:'$pldoc'(F/A, Loc,Text)]),
   format('~q.~n',[M:'$mode'(Head, _Det2)]).

sm:-
   current_module(M),
   catch(M:'$mode'(Head, Det),_,fail),
   \+ user:type_modes(M,Head,Det),
   asserta(user:type_modes(M,Head,Det)),fail.

sm:-
   current_module(M),catch(M:'$pldoc'(F/A, _,_,Sum),_,fail), functor(Head,F,A),
   \+ user:type_modes(M,Head,_Det),\+ user:type_modes(M,_:Head,_Det2),
   format('~q.~n',[parse_modes(M:Head, Sum)]),fail.


sm:-
   current_module(M),catch(M:'$pldoc'(F//Am2, _,_,Sum),_,fail), A is Am2+2, functor(Head,F,A),
   \+ user:type_modes(M,Head,_Det),\+ user:type_modes(M,_:Head,_Det2),
   format('~q.~n',[parse_modes(M:Head, Sum)]),fail.

% :- ds.

      /*******************************
       *     XREF SETUP
      *******************************/


:- multifile(check:predicate_name/2).
:- multifile prolog_xref:xref_source_file/3.
:- use_module(library(check)).
check:predicate_name(A, D):- prolog_clause:predicate_name(A, D).
%:- gxref.
%:- check.
:- set_prolog_flag(access_level,user).

:- if(current_predicate(prolog_ide/1)).
:- prolog_ide(debug_monitor).
:- endif.

%

:- set_prolog_flag(access_level,user).




% :- set_prolog_flag(scce,pure).
% :- set_prolog_flag(scce,scce_orig).
% :- set_prolog_flag(scce,setup_call_cleanup).


        /*******************************
         ****     JPL SETUP        *****
        *******************************/

% :- exists_source(runtime('jpl.jar'))-> true ; shell('touch jpl.jar').
 
clean_bad_chars(PATH,Path10):-name(PATH,Chars),delete(Chars,0,Chars0),delete(Chars0,1,Chars1),delete(Chars1,10,Chars10),name(Path10,Chars10).

clean_path:-
  getenv('PATH',PATH),clean_bad_chars(PATH,Path10),setenv('PATH',Path10).

:- clean_path.

:- if( \+ getenv('CLASSPATH',_)).
:- if(current_prolog_flag(shared_object_extension,'so')).
%:-  setenv('CLASSPATH', '/usr/share/ant/lib/ant.jar:/mnt/dddd/workspace/phase02-jrtl/AppdapterGUI/bin-eclipse:/mnt/dddd/workspace/phase02-jrtl/CycJava/bin-eclipse:/mnt/dddd/workspace/phase02-jrtl/platform/bin-eclipse:/mnt/dddd/workspace/phase02-jrtl/platform-deps/bin-eclipse:/mnt/dddd/workspace/phase02-jrtl/platform/dist/abcl-contrib.jar:/cp/ZorillaAdaptor.jar:/cp/zoni.jar:/cp/xstream-1.1.1-patched.jar:/cp/xpp3-1.1.3.4d_b4_min.jar:/cp/xmlsec.jar:/cp/xmlParserAPIs.jar:/cp/xml-apis.jar:/cp/xml-apis-1.4.01.jar:/cp/xml4j.jar:/cp/xercesImpl.jar:/cp/xbean-2.1.0.jar:/cp/xalan.jar:/cp/wstx-asl-3.2.9.jar:/cp/wss4j.jar:/cp/wss4j-1.5.0-itinnov-2.jar:/cp/wsrf_tools.jar:/cp/wsrf_provider_jce.jar:/cp/wsrf_mds_usefulrp_schema_stubs.jar:/cp/wsrf_mds_index_stubs.jar:/cp/wsrf_core_stubs.jar:/cp/wsrf_core.jar:/cp/wsdl4j.jar:/cp/wms3.1.jar:/cp/unicode_panel.jar:/cp/ublsupport.jar:/cp/trilead-ssh2-build213-RK.jar:/cp/tcljava-1.2.6.jar:/cp/syntax.jar:/cp/swingx-1.6.jar:/cp/stax-api-1.0.1.jar:/cp/SshTrileadAdaptor.jar:/cp/srm.jar:/cp/smartsockets-1.51.jar:/cp/slf4j-log4j12-1.7.5.jar:/cp/slf4j-api-1.7.5.jar:/cp/SgeAdaptor.jar:/cp/SftpTrileadAdaptor.jar:/cp/SftpGanymedAdaptor.jar:/cp/SftpAdaptor.jar:/cp/servlet.jar:/cp/servlet-api-3.0.20100224.jar:/cp/services_IndexServiceProxyService_stubs.jar:/cp/services_AdvertServiceEntry_stubs.jar:/cp/scala-reflect-2.10.2.jar:/cp/scala-library-2.10.2.jar:/cp/scala-compiler-2.10.2.jar:/cp/saaj.jar:/cp/runnersFramework-2.0.jar:/cp/rhino-1.7.7.1.jar:/cp/reflections-0.9.8.jar:/cp/puretls.jar:/cp/procyon-core-0.5.33-enigma.jar:/cp/procyon-compilertools-0.5.33-enigma.jar:/cp/postgresql-9.1-901.jdbc4.jar:/cp/pddl4j.jar:/cp/owlsyntax.jar:/cp/owlim-big-3.1.a7.jar:/cp/owlapi-osgidistribution-4.1.4.jar:/cp/owlapi-distribution-4.1.4.jar:/cp/orphanNodesAlg.jar:/cp/org.osgi.core-4.2.0.jar:/cp/org.osgi.core-1.4.0.jar:/cp/org.osgi.compendium-4.2.0.jar:/cp/org.openl.lib.poi.dev-5.9.4.1.jar:/cp/org.appdapter.lib.remote-1.2.4-20160803.212630-10.jar:/cp/org.appdapter.lib.core-1.1.6-SNAPSHOT.jar:/cp/org.appdapter.lib.bind.jena-1.2.3.jar:/cp/org.appdapter.bundle.xload-1.2.4-20160803.212610-8.jar:/cp/org.appdapter.bundle.fileconv-1.1.6-SNAPSHOT.jar:/cp/org.appdapter.bundle.debug-1.1.6-SNAPSHOT.jar:/cp/org.appdapter.bundle.core-1.1.6-SNAPSHOT.jar:/cp/org.apache.servicemix.specs.activation-api-1.1-1.8.0.jar:/cp/org.apache.servicemix.bundles.xmlresolver-1.2_3.jar:/cp/org.apache.servicemix.bundles.xerces-2.11.0_1.jar:/cp/org.apache.servicemix.bundles.lucene-3.0.3_2.jar:/cp/org.apache.servicemix.bundles.junit-4.7_3.jar:/cp/org.apache.servicemix.bundles.javax.mail-1.4.1_4.jar:/cp/ordi-trree-adapter-3.1.a6.jar:/cp/ordi-model-0.5.jar:/cp/opensaml.jar:/cp/openrdf-sesame-2.2.4-onejar.jar:/cp/openrdf-rio-ntriples-2.0.1.jar:/cp/openrdf-rio-api-2.0.1.jar:/cp/openrdf-model-2.0.1.jar:/cp/omii-security-utils-1.1.jar:/cp/naming-resources.jar:/cp/naming-java.jar:/cp/naming-factory.jar:/cp/naming-common.jar:/cp/mysql-connector-java-5.1.6-bin.jar:/cp/monetdb-1.7-jdbc.jar:/cp/miglayout-swing-4.2.jar:/cp/miglayout-core-4.2.jar:/cp/MercuryAdaptor.jar:/cp/mail.jar:/cp/looks.jar:/cp/log4jdbc3-1.1alpha2.jar:/cp/log4j-1.2.12.jar:/cp/LocalAdaptor.jar:/cp/lb.jar:/cp/kshared-2.0.jar:/cp/KoalaAdaptor.jar:/cp/kazuki.jar:/cp/kaon2.plain.jar:/cp/kaon2.jar:/cp/junit-4.10.jar:/cp/jsr305-1.3.9.jar:/cp/jsp-api-2.1-glassfish-2.1.v20100127.jar:/cp/jsp-2.1-glassfish-2.1.v20100127.jar:/cp/json.jar:/cp/jide-oss-3.5.5.jar:/cp/jgss.jar:/cp/jgraph.jar:/cp/JGoWeb.jar:/cp/JGoSVG.jar:/cp/JGoLayout.jar:/cp/JGo.jar:/cp/JGoInstruments.jar:/cp/jfreechart-1.0.13.jar:/cp/jfreechart-1.0.0.jar:/cp/JFlex.jar:/cp/jetty-xml-8.0.4.v20111024.jar:/cp/jetty-webapp-8.0.4.v20111024.jar:/cp/jetty-util-8.0.4.v20111024.jar:/cp/jetty-servlet-8.0.4.v20111024.jar:/cp/jetty-server-8.0.4.v20111024.jar:/cp/jetty-security-8.0.4.v20111024.jar:/cp/jetty-io-8.0.4.v20111024.jar:/cp/jetty-http-8.0.4.v20111024.jar:/cp/jetty-continuation-8.0.4.v20111024.jar:/cp/jep-2.4.1.jar:/cp/jena-dig.jar:/cp/jdom.jar:/cp/jcommon-1.0.16.jar:/cp/jce-jdk13-131.jar:/cp/jcalendar.jar:/cp/jaxrpc.jar:/cp/jaxen-1.1.1.jar:/cp/java_websocket.jar:/cp/javassist-3.12.1.GA.jar:/cp/java-json.jar:/cp/javaff_lrta_bounded_children_heap-0.0.1-SNAPSHOT.jar:/cp/jakarta-slide-webdavlib-2.0.jar:/cp/jakarta-regexp-1.2.jar:/cp/jacl-1.2.6.jar:/cp/jaas.jar:/cp/j2ssh-core-0.2.9.jar:/cp/j2ssh-common-0.2.2.jar:/cp/itinnov-grid-utils-omii1.jar:/cp/itinnov-grid-types-omii1.jar:/cp/itinnov-gridservit-0.3.0.jar:/cp/itinnov-grid-service-utils-omii1.jar:/cp/itinnov-grid-service-types-omii1.jar:/cp/itinnov-grid-comms-omii1.1.jar:/cp/itinnov-grid-client-swing-omii1.jar:/cp/itinnov-grid-client-staterepos-omii1.1.jar:/cp/itinnov-grid-client-helpers-omii1.jar:/cp/itinnov-grid-client-echo-omii1.jar:/cp/itinnov-grid-client-cli-omii1.1.jar:/cp/iri.jar:/cp/icu4j_3.4.4.jar:/cp/httpcore-osgi-4.3.jar:/cp/httpclient-osgi-4.3.1.jar:/cp/hivemind-lib-1.1.1.jar:/cp/hivemind-jmx-1.1.1.jar:/cp/hivemind-1.1.1.jar:/cp/hamcrest-core-1.1.jar:/cp/h2-1.3.157.jar:/cp/guava-12.0-sources.jar:/cp/guava-12.0.jar:/cp/gson-2.3.1.jar:/cp/gridsam-schema-2.0.1.jar:/cp/gridsam-core-2.0.1.jar:/cp/gridsam-client.jar:/cp/GridsamAdaptor.jar:/cp/graphlayout-1.2.1.jar:/cp/gram-utils.jar:/cp/gram-stubs.jar:/cp/gram-client.jar:/cp/globus_wsrf_rft_stubs.jar:/cp/globus_wsrf_rft.jar:/cp/globus_wsrf_rft_client.jar:/cp/globus_wsrf_rendezvous_stubs.jar:/cp/globus_wsrf_rendezvous_service.jar:/cp/globus_wsrf_mds_aggregator_stubs.jar:/cp/globus_delegation_stubs.jar:/cp/globus_delegation_service.jar:/cp/GlobusAdaptor.jar:/cp/glite-security-util-java.jar:/cp/glite-security-trustmanager.jar:/cp/glite-security-delegation-java.jar:/cp/glite-jdl-api-java.jar:/cp/GliteAdaptor.jar:/cp/GenericAdaptor.jar:/cp/GAT-engine.jar:/cp/GAT-API.jar:/cp/ganymed-ssh2-build211beta4.jar:/cp/forms-1.3.0.jar:/cp/ext.bundle.xml.xerces-1.1.6-SNAPSHOT.jar:/cp/ext.bundle.xml.dom4j_161-1.1.6-SNAPSHOT.jar:/cp/ext.bundle.osgi.common-1.1.6-SNAPSHOT.jar:/cp/ext.bundle.openconverters-1.1.6-SNAPSHOT.jar:/cp/ext.bundle.math.jscience_50SNAP-1.0.9.jar:/cp/ext.bundle.jena_all_2_10_1-1.1.6-SNAPSHOT.jar:/cp/ext.bundle.apache_httpclient-1.1.6-SNAPSHOT.jar:/cp/ekitspell.jar:/cp/edtftpj-1.5.2.jar:/cp/ecj-3.5.1.jar:/cp/drmaa.jar:/cp/dom4j-1.6.1.jar:/cp/docking-frames-core.jar:/cp/docking-frames-common.jar:/cp/cycSparqlEndpoint.jar:/cp/customSysParam.jar:/cp/cryptix.jar:/cp/cryptix-asn1.jar:/cp/cryptix32.jar:/cp/concurrent.jar:/cp/com.springsource.org.apache.log4j-1.2.16.jar:/cp/com.springsource.com.ibm.icu-3.4.5.jar:/cp/commons-vfs2-2.1.jar:/cp/commons-vfs-1.0.jar:/cp/commons-math-3.0-SNAPSHOT.jar:/cp/commons-logging-1.1.3.jar:/cp/commons-lang3-3.1.jar:/cp/commons-lang-2.4.jar:/cp/commons-httpclient-3.1.jar:/cp/commons-discovery-0.4.jar:/cp/commons-digester.jar:/cp/commons-collections-3.0.jar:/cp/commons-codec-1.6.jar:/cp/commons-cli-1.0.jar:/cp/commons-beanutils.jar:/cp/commonj.jar:/cp/CommandlineSshAdaptor.jar:/cp/cog-util-0.91.jar:/cp/cog-url.jar:/cp/cog-trap-1.0.jar:/cp/cog-setup-0.91.jar:/cp/cog-resources-1.0.jar:/cp/cog-provider-webdav-1.0.jar:/cp/cog-provider-ssh-2.1.jar:/cp/cog-provider-local-2.0.jar:/cp/cog-provider-gt4_0_0-2.3.jar:/cp/cog-provider-gt3_2_1-2.0.jar:/cp/cog-provider-gt2ft-1.0.jar:/cp/cog-provider-gt2-2.2.jar:/cp/cog-provider-condor-2.0.jar:/cp/cog-provider-clref-gt4_0_0.jar:/cp/cog-provider-clref-gt3_2_1.jar:/cp/cog-karajan-0.33.jar:/cp/cog-jobmanager.jar:/cp/cog-jglobus.jar:/cp/cog-gridshell-1.0.jar:/cp/cog-gridfaces-1.0.jar:/cp/cog-grapheditor-0.47.jar:/cp/cog-certrequest-1.0.jar:/cp/cog-certmanagement-1.0.jar:/cp/cog-axis.jar:/cp/cog-abstraction-examples-2.1.jar:/cp/cog-abstraction-common-2.1.jar:/cp/castor-1.1.1-xml.jar:/cp/castor-0.9.6.jar:/cp/bsf-utils-3.1.jar:/cp/bsf.jar:/cp/bsf-api-3.1.jar:/cp/bsf-all-3.1.jar:/cp/BrowserLauncher2-1_3.jar:/cp/bcprov-jdk15-133.jar:/cp/backport-util-concurrent.jar:/cp/axis-jaxrpc-1.4.jar:/cp/axis-1.4.jar:/cp/arq-extra.jar:/cp/antlr-2.7.5.jar:/cp/ant-1.6.5.jar:/cp/addressing-1.0.jar:/cp/activation.jar:/cp/2p.jar:/usr/lib/jvm/java-8-oracle/lib/tools.jar').
:- else.
%:-  setenv('CLASSPATH', 'd:\\workspace\\phase02-jrtl\\AppdapterGUI\\bin-eclipse;d:\\workspace\\phase02-jrtl\\CycJava\\bin-eclipse;d:\\workspace\\phase02-jrtl\\platform\\bin-eclipse;d:\\workspace\\phase02-jrtl\\platform-deps\\bin-eclipse;d:\\workspace\\phase02-jrtl\\platform\\dist\\abcl-contrib.jar;g:\\cp\\ZorillaAdaptor.jar;g:\\cp\\zoni.jar;g:\\cp\\xstream-1.1.1-patched.jar;g:\\cp\\xpp3-1.1.3.4d_b4_min.jar;g:\\cp\\xmlsec.jar;g:\\cp\\xmlParserAPIs.jar;g:\\cp\\xml-apis.jar;g:\\cp\\xml-apis-1.4.01.jar;g:\\cp\\xml4j.jar;g:\\cp\\xercesImpl.jar;g:\\cp\\xbean-2.1.0.jar;g:\\cp\\xalan.jar;g:\\cp\\wstx-asl-3.2.9.jar;g:\\cp\\wss4j.jar;g:\\cp\\wss4j-1.5.0-itinnov-2.jar;g:\\cp\\wsrf_tools.jar;g:\\cp\\wsrf_provider_jce.jar;g:\\cp\\wsrf_mds_usefulrp_schema_stubs.jar;g:\\cp\\wsrf_mds_index_stubs.jar;g:\\cp\\wsrf_core_stubs.jar;g:\\cp\\wsrf_core.jar;g:\\cp\\wsdl4j.jar;g:\\cp\\wms3.1.jar;g:\\cp\\unicode_panel.jar;g:\\cp\\ublsupport.jar;g:\\cp\\trilead-ssh2-build213-RK.jar;g:\\cp\\tcljava-1.2.6.jar;g:\\cp\\syntax.jar;g:\\cp\\swingx-1.6.jar;g:\\cp\\stax-api-1.0.1.jar;g:\\cp\\SshTrileadAdaptor.jar;g:\\cp\\srm.jar;g:\\cp\\smartsockets-1.51.jar;g:\\cp\\slf4j-log4j12-1.7.5.jar;g:\\cp\\slf4j-api-1.7.5.jar;g:\\cp\\SgeAdaptor.jar;g:\\cp\\SftpTrileadAdaptor.jar;g:\\cp\\SftpGanymedAdaptor.jar;g:\\cp\\SftpAdaptor.jar;g:\\cp\\servlet.jar;g:\\cp\\servlet-api-3.0.20100224.jar;g:\\cp\\services_IndexServiceProxyService_stubs.jar;g:\\cp\\services_AdvertServiceEntry_stubs.jar;g:\\cp\\scala-reflect-2.10.2.jar;g:\\cp\\scala-library-2.10.2.jar;g:\\cp\\scala-compiler-2.10.2.jar;g:\\cp\\saaj.jar;g:\\cp\\runnersFramework-2.0.jar;g:\\cp\\rhino-1.7.7.1.jar;g:\\cp\\reflections-0.9.8.jar;g:\\cp\\puretls.jar;g:\\cp\\procyon-core-0.5.33-enigma.jar;g:\\cp\\procyon-compilertools-0.5.33-enigma.jar;g:\\cp\\postgresql-9.1-901.jdbc4.jar;g:\\cp\\pddl4j.jar;g:\\cp\\owlsyntax.jar;g:\\cp\\owlim-big-3.1.a7.jar;g:\\cp\\owlapi-osgidistribution-4.1.4.jar;g:\\cp\\owlapi-distribution-4.1.4.jar;g:\\cp\\orphanNodesAlg.jar;g:\\cp\\org.osgi.core-4.2.0.jar;g:\\cp\\org.osgi.core-1.4.0.jar;g:\\cp\\org.osgi.compendium-4.2.0.jar;g:\\cp\\org.openl.lib.poi.dev-5.9.4.1.jar;g:\\cp\\org.appdapter.lib.remote-1.2.4-20160803.212630-10.jar;g:\\cp\\org.appdapter.lib.core-1.1.6-SNAPSHOT.jar;g:\\cp\\org.appdapter.lib.bind.jena-1.2.3.jar;g:\\cp\\org.appdapter.bundle.xload-1.2.4-20160803.212610-8.jar;g:\\cp\\org.appdapter.bundle.fileconv-1.1.6-SNAPSHOT.jar;g:\\cp\\org.appdapter.bundle.debug-1.1.6-SNAPSHOT.jar;g:\\cp\\org.appdapter.bundle.core-1.1.6-SNAPSHOT.jar;g:\\cp\\org.apache.servicemix.specs.activation-api-1.1-1.8.0.jar;g:\\cp\\org.apache.servicemix.bundles.xmlresolver-1.2_3.jar;g:\\cp\\org.apache.servicemix.bundles.xerces-2.11.0_1.jar;g:\\cp\\org.apache.servicemix.bundles.lucene-3.0.3_2.jar;g:\\cp\\org.apache.servicemix.bundles.junit-4.7_3.jar;g:\\cp\\org.apache.servicemix.bundles.javax.mail-1.4.1_4.jar;g:\\cp\\ordi-trree-adapter-3.1.a6.jar;g:\\cp\\ordi-model-0.5.jar;g:\\cp\\opensaml.jar;g:\\cp\\openrdf-sesame-2.2.4-onejar.jar;g:\\cp\\openrdf-rio-ntriples-2.0.1.jar;g:\\cp\\openrdf-rio-api-2.0.1.jar;g:\\cp\\openrdf-model-2.0.1.jar;g:\\cp\\omii-security-utils-1.1.jar;g:\\cp\\naming-resources.jar;g:\\cp\\naming-java.jar;g:\\cp\\naming-factory.jar;g:\\cp\\naming-common.jar;g:\\cp\\mysql-connector-java-5.1.6-bin.jar;g:\\cp\\monetdb-1.7-jdbc.jar;g:\\cp\\miglayout-swing-4.2.jar;g:\\cp\\miglayout-core-4.2.jar;g:\\cp\\MercuryAdaptor.jar;g:\\cp\\mail.jar;g:\\cp\\looks.jar;g:\\cp\\log4jdbc3-1.1alpha2.jar;g:\\cp\\log4j-1.2.12.jar;g:\\cp\\LocalAdaptor.jar;g:\\cp\\lb.jar;g:\\cp\\kshared-2.0.jar;g:\\cp\\KoalaAdaptor.jar;g:\\cp\\kazuki.jar;g:\\cp\\kaon2.plain.jar;g:\\cp\\kaon2.jar;g:\\cp\\junit-4.10.jar;g:\\cp\\jsr305-1.3.9.jar;g:\\cp\\jsp-api-2.1-glassfish-2.1.v20100127.jar;g:\\cp\\jsp-2.1-glassfish-2.1.v20100127.jar;g:\\cp\\json.jar;g:\\cp\\jide-oss-3.5.5.jar;g:\\cp\\jgss.jar;g:\\cp\\jgraph.jar;g:\\cp\\JGoWeb.jar;g:\\cp\\JGoSVG.jar;g:\\cp\\JGoLayout.jar;g:\\cp\\JGo.jar;g:\\cp\\JGoInstruments.jar;g:\\cp\\jfreechart-1.0.13.jar;g:\\cp\\jfreechart-1.0.0.jar;g:\\cp\\JFlex.jar;g:\\cp\\jetty-xml-8.0.4.v20111024.jar;g:\\cp\\jetty-webapp-8.0.4.v20111024.jar;g:\\cp\\jetty-util-8.0.4.v20111024.jar;g:\\cp\\jetty-servlet-8.0.4.v20111024.jar;g:\\cp\\jetty-server-8.0.4.v20111024.jar;g:\\cp\\jetty-security-8.0.4.v20111024.jar;g:\\cp\\jetty-io-8.0.4.v20111024.jar;g:\\cp\\jetty-http-8.0.4.v20111024.jar;g:\\cp\\jetty-continuation-8.0.4.v20111024.jar;g:\\cp\\jep-2.4.1.jar;g:\\cp\\jena-dig.jar;g:\\cp\\jdom.jar;g:\\cp\\jcommon-1.0.16.jar;g:\\cp\\jce-jdk13-131.jar;g:\\cp\\jcalendar.jar;g:\\cp\\jaxrpc.jar;g:\\cp\\jaxen-1.1.1.jar;g:\\cp\\java_websocket.jar;g:\\cp\\javassist-3.12.1.GA.jar;g:\\cp\\java-json.jar;g:\\cp\\javaff_lrta_bounded_children_heap-0.0.1-SNAPSHOT.jar;g:\\cp\\jakarta-slide-webdavlib-2.0.jar;g:\\cp\\jakarta-regexp-1.2.jar;g:\\cp\\jacl-1.2.6.jar;g:\\cp\\jaas.jar;g:\\cp\\j2ssh-core-0.2.9.jar;g:\\cp\\j2ssh-common-0.2.2.jar;g:\\cp\\itinnov-grid-utils-omii1.jar;g:\\cp\\itinnov-grid-types-omii1.jar;g:\\cp\\itinnov-gridservit-0.3.0.jar;g:\\cp\\itinnov-grid-service-utils-omii1.jar;g:\\cp\\itinnov-grid-service-types-omii1.jar;g:\\cp\\itinnov-grid-comms-omii1.1.jar;g:\\cp\\itinnov-grid-client-swing-omii1.jar;g:\\cp\\itinnov-grid-client-staterepos-omii1.1.jar;g:\\cp\\itinnov-grid-client-helpers-omii1.jar;g:\\cp\\itinnov-grid-client-echo-omii1.jar;g:\\cp\\itinnov-grid-client-cli-omii1.1.jar;g:\\cp\\iri.jar;g:\\cp\\icu4j_3.4.4.jar;g:\\cp\\httpcore-osgi-4.3.jar;g:\\cp\\httpclient-osgi-4.3.1.jar;g:\\cp\\hivemind-lib-1.1.1.jar;g:\\cp\\hivemind-jmx-1.1.1.jar;g:\\cp\\hivemind-1.1.1.jar;g:\\cp\\hamcrest-core-1.1.jar;g:\\cp\\h2-1.3.157.jar;g:\\cp\\guava-12.0-sources.jar;g:\\cp\\guava-12.0.jar;g:\\cp\\gson-2.3.1.jar;g:\\cp\\gridsam-schema-2.0.1.jar;g:\\cp\\gridsam-core-2.0.1.jar;g:\\cp\\gridsam-client.jar;g:\\cp\\GridsamAdaptor.jar;g:\\cp\\graphlayout-1.2.1.jar;g:\\cp\\gram-utils.jar;g:\\cp\\gram-stubs.jar;g:\\cp\\gram-client.jar;g:\\cp\\globus_wsrf_rft_stubs.jar;g:\\cp\\globus_wsrf_rft.jar;g:\\cp\\globus_wsrf_rft_client.jar;g:\\cp\\globus_wsrf_rendezvous_stubs.jar;g:\\cp\\globus_wsrf_rendezvous_service.jar;g:\\cp\\globus_wsrf_mds_aggregator_stubs.jar;g:\\cp\\globus_delegation_stubs.jar;g:\\cp\\globus_delegation_service.jar;g:\\cp\\GlobusAdaptor.jar;g:\\cp\\glite-security-util-java.jar;g:\\cp\\glite-security-trustmanager.jar;g:\\cp\\glite-security-delegation-java.jar;g:\\cp\\glite-jdl-api-java.jar;g:\\cp\\GliteAdaptor.jar;g:\\cp\\GenericAdaptor.jar;g:\\cp\\GAT-engine.jar;g:\\cp\\GAT-API.jar;g:\\cp\\ganymed-ssh2-build211beta4.jar;g:\\cp\\forms-1.3.0.jar;g:\\cp\\ext.bundle.xml.xerces-1.1.6-SNAPSHOT.jar;g:\\cp\\ext.bundle.xml.dom4j_161-1.1.6-SNAPSHOT.jar;g:\\cp\\ext.bundle.osgi.common-1.1.6-SNAPSHOT.jar;g:\\cp\\ext.bundle.openconverters-1.1.6-SNAPSHOT.jar;g:\\cp\\ext.bundle.math.jscience_50SNAP-1.0.9.jar;g:\\cp\\ext.bundle.jena_all_2_10_1-1.1.6-SNAPSHOT.jar;g:\\cp\\ext.bundle.apache_httpclient-1.1.6-SNAPSHOT.jar;g:\\cp\\ekitspell.jar;g:\\cp\\edtftpj-1.5.2.jar;g:\\cp\\ecj-3.5.1.jar;g:\\cp\\drmaa.jar;g:\\cp\\dom4j-1.6.1.jar;g:\\cp\\docking-frames-core.jar;g:\\cp\\docking-frames-common.jar;g:\\cp\\cycSparqlEndpoint.jar;g:\\cp\\customSysParam.jar;g:\\cp\\cryptix.jar;g:\\cp\\cryptix-asn1.jar;g:\\cp\\cryptix32.jar;g:\\cp\\concurrent.jar;g:\\cp\\com.springsource.org.apache.log4j-1.2.16.jar;g:\\cp\\com.springsource.com.ibm.icu-3.4.5.jar;g:\\cp\\commons-vfs2-2.1.jar;g:\\cp\\commons-vfs-1.0.jar;g:\\cp\\commons-math-3.0-SNAPSHOT.jar;g:\\cp\\commons-logging-1.1.3.jar;g:\\cp\\commons-lang3-3.1.jar;g:\\cp\\commons-lang-2.4.jar;g:\\cp\\commons-httpclient-3.1.jar;g:\\cp\\commons-discovery-0.4.jar;g:\\cp\\commons-digester.jar;g:\\cp\\commons-collections-3.0.jar;g:\\cp\\commons-codec-1.6.jar;g:\\cp\\commons-cli-1.0.jar;g:\\cp\\commons-beanutils.jar;g:\\cp\\commonj.jar;g:\\cp\\CommandlineSshAdaptor.jar;g:\\cp\\cog-util-0.91.jar;g:\\cp\\cog-url.jar;g:\\cp\\cog-trap-1.0.jar;g:\\cp\\cog-setup-0.91.jar;g:\\cp\\cog-resources-1.0.jar;g:\\cp\\cog-provider-webdav-1.0.jar;g:\\cp\\cog-provider-ssh-2.1.jar;g:\\cp\\cog-provider-local-2.0.jar;g:\\cp\\cog-provider-gt4_0_0-2.3.jar;g:\\cp\\cog-provider-gt3_2_1-2.0.jar;g:\\cp\\cog-provider-gt2ft-1.0.jar;g:\\cp\\cog-provider-gt2-2.2.jar;g:\\cp\\cog-provider-condor-2.0.jar;g:\\cp\\cog-provider-clref-gt4_0_0.jar;g:\\cp\\cog-provider-clref-gt3_2_1.jar;g:\\cp\\cog-karajan-0.33.jar;g:\\cp\\cog-jobmanager.jar;g:\\cp\\cog-jglobus.jar;g:\\cp\\cog-gridshell-1.0.jar;g:\\cp\\cog-gridfaces-1.0.jar;g:\\cp\\cog-grapheditor-0.47.jar;g:\\cp\\cog-certrequest-1.0.jar;g:\\cp\\cog-certmanagement-1.0.jar;g:\\cp\\cog-axis.jar;g:\\cp\\cog-abstraction-examples-2.1.jar;g:\\cp\\cog-abstraction-common-2.1.jar;g:\\cp\\castor-1.1.1-xml.jar;g:\\cp\\castor-0.9.6.jar;g:\\cp\\bsf-utils-3.1.jar;g:\\cp\\bsf.jar;g:\\cp\\bsf-api-3.1.jar;g:\\cp\\bsf-all-3.1.jar;g:\\cp\\BrowserLauncher2-1_3.jar;g:\\cp\\bcprov-jdk15-133.jar;g:\\cp\\backport-util-concurrent.jar;g:\\cp\\axis-jaxrpc-1.4.jar;g:\\cp\\axis-1.4.jar;g:\\cp\\arq-extra.jar;g:\\cp\\antlr-2.7.5.jar;g:\\cp\\ant-1.6.5.jar;g:\\cp\\addressing-1.0.jar;g:\\cp\\activation.jar;g:\\cp\\2p.jar').
:- endif.
:- endif.

append_to_classpath(WildCard):-
  expand_file_name(WildCard,O),
  maplist(prolog_to_os_filename,O,Fs),

  (       current_prolog_flag(windows, true)
    ->      Separator = ';'
    ;       Separator = ':'
    ),
   atomic_list_concat([''|Fs],Separator,Extra),
   getenv('CLASSPATH',WAS),
   atom_concat(WAS,Extra,NEW),
   setenv('CLASSPATH',NEW),!.

% :- append_to_classpath('G:/cp/*.jar').

% :- call(call,swi_cli:jpl_start_dbg(5005)).

cmd_option_value(Name,Value):- current_prolog_flag(os_argv, L), member(E,L), 
  cmd_option_value(E,Name,Value).
cmd_option_value(E,Name,Value):- atom_concat('--no',Name,E),!, opt_value(no,Value).
cmd_option_value(E,Name,Value):- atom_concat('--',NameValue,E),!,cmd_option_value(NameValue,Name,Value).
cmd_option_value(E,Name,Value):- atomic_list_concat([Name,Val],'=',E),!,opt_value(Val,Value).
cmd_option_value(E,Name,Value):- atom(E),Name=E,opt_value(yes,Value).

opt_value(Val,HP):- compound(HP),H:PN=HP,atom(Val),atomic_list_concat([H,P],':',Val),!,atom_number(P,PN).  
opt_value(y,true). opt_value(yes,true). opt_value(true,true). opt_value(t,true). opt_value(1,true).
opt_value(n,false). opt_value(no,false). opt_value(false,false). opt_value(f,false). opt_value(0,false).
  

:- dynamic(jdwp_available/0).
% '--jdwp=10.0.0.122:5005'
jdwp_remote(Host:Port):- cmd_option_value(jdwp,Host:Port),!.
jdwp_remote(Port):- cmd_option_value(jdwp,WPort),!,WPort=Port.
jdwp_remote('10.0.0.122':5005):- dmiles_machine, jdwp_available, !.
jdwp_remote(5005).

:-ignore((jdwp_remote(Host:Port), 
  catch((  tcp_connect(Host:Port, StreamPair, []),close(StreamPair),asserta(jdwp_available)),_,true))).

jdwp_suspend(y):- dmiles_machine, !.
jdwp_suspend(n).



% jdwp_available. 
jdwp_opts(JDWPOpt):- jdwp_remote(Host:Port), jdwp_suspend(YN),
   format(atom(JDWPOpt),'-agentlib:jdwp=transport=dt_socket,suspend=~w,address=~w:~w,server=n',[YN, Host,Port]),!.
jdwp_opts(JDWPOpt):- jdwp_remote(Port), jdwp_suspend(YN),
   format(atom(JDWPOpt),'-agentlib:jdwp=transport=dt_socket,suspend=~w,address=~w,server=y',[YN, Port]).
jdwp_opts('').

:- current_prolog_flag(os_argv, Y), dwq(Y).


jvm_opts(
    [JDWPOpt, %'-XX:PermSize=512m','-XX:MaxPermSize=4g','-Xmx26g',
     '-server','-d64','-Xms5000m','-Xmx8000m','-XX:ReservedCodeCacheSize=96m','-XX:+DoEscapeAnalysis','-XX:+UseCompressedOops','-XX:+UseConcMarkSweepGC','-XshowSettings:vm',
     '-Djava.util.Arrays.useLegacyMergeSort=true',
     '-Dsun.java2d.d3d=false' 
     % ,'-Dfile.encoding=Cp1252',
     %,'-Xbootclasspath:C:\\pf\\java\\jdk\\jre\\lib\\resources.jar;C:\\pf\\java\\jdk\\jre\\lib\\rt.jar;C:\\pf\\java\\jdk\\jre\\lib\\jsse.jar;C:\\pf\\java\\jdk\\jre\\lib\\jce.jar;C:\\pf\\java\\jdk\\jre\\lib\\charsets.jar;C:\\pf\\java\\jdk\\jre\\lib\\jfr.jar;C:\\pf\\java\\jdk\\lib\\tools.jar;C:\\pf\\java\\jdk\\lib\\sa-jdi.jar'
     ]):- dwq_call(jdwp_opts(JDWPOpt)).


       %  /var/lib/myfrdcsa/codebases/minor/3t-frdcsa/planner/ 

:- multifile(oo_started/0).
:- dynamic(oo_started/0).
jpl:- current_module(swicli),!, swicli.
jpl:- oo_started,!.
jpl:-
  must_det_l((
  asserta((oo_started)),
  retractall((user:file_search_path(jar, _))),
  asserta((user:file_search_path(jar, ('.')))),
  ensure_loaded(library(jpl)),  
  getenv('PATH',PATH),getenv('JAVA_HOME',JH),current_prolog_flag(home,HOME),atomic_list_concat([JH,HOME],';',NEWPATH),
  setenv('PATH',NEWPATH),
  use_module(library(jpl)),
  setenv('PATH',PATH),
  jvm_opts(Opts),
  jpl_set_default_jvm_opts(Opts),
  % getenv('CLASSPATH',WAS), format('CLASSPATH=~q~n',[WAS]),
  listing(jdwp_available),
  jpl:setup_jvm,
  jpl_classname_to_class('java.lang.Class', _CC))).


% :- jpl.
% :- set_prolog_flag(verbose_load, silent).





     /*******************************
      ****     SWICLI SETUP      *****
     *******************************/

swicli:- oo_started,!.
swicli:- 
  must_det_l((lmp,ensure_loaded(library(swicli)),
   cli_type_to_classname('java.lang.Class', _CC),
   cli_ensure_classpath)).



main_args_to_jref(Args, JRef):- 
  maplist(atom_string,ArgList,Args),
  jpl_new(array(class([java,lang],['String'])), ArgList, JRef).


call_jmain(Class,Args):- jpl,
  main_args_to_jref(Args, JRef),
  jpl_call(Class,main,[JRef],_Out).

call_main(Args):- !, call_jmain('org.logicmoo.system.BeanShellCntrl',['--load','abclc-rc.lisp'| Args]).
call_main(Args):- call_jmain('org.armedbear.lisp.Main',['--load','abclc-rc.lisp'| Args]).
call_main(Args):- call_jmain('com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLMain',['--load','abclc-rc.lisp'| Args]).

/*
*/
bshwc:-  
  must_det_l(( cli_type_to_classname('org.slf4j.LoggerFactory',Found1),
   writeln([found,Found1]),
   cli_type_to_classname('org.logicmoo.system.BeanShellCntrl',Found),
   writeln([found,Found]),
   call_crtl(start_from_prolog_ikvm,[],_O))).

% Just Vanila ABCL compiler/interpretor with all LarKC features not getting get in it way (compiler and ANSI-Lisp testing)
jabcl:- call_main(['--nocyc','--noprolog','--noprologsync','--nogui','--nobsh']).

% Used for emulating AlegroCL while porting code code into CYC
uabcl:- call_main(['--prologsync','--eval','(init-cyc-server)']).

% used for emulating LarKC or RCYC 
labcl:- call_main(['--prologsync','--eval','(init-cyc-server)','--eval','(cyc-repl)']).

bg_abcl:- call_main(['--prologsync','--eval','(init-cyc-server)','--eval','(bg-repl)']).

start_bsh:- dwq_call(jpl_call('org.logicmoo.system.BeanShellCntrl',start_from_prolog,[],_O)).

startBG:- start_in_bg(bg_abcl).


start_in_bg(Goal):-  
  format(atom(Alias),'~w',[Goal]),   
  ((thread_property(Some,alias(Alias)),thread_property(Some,status(running))) -> true; 
    thread_create(Goal,_,[detached(true),debug(false),alias(Alias)])),
  threads.
%:- set_prolog_flag(access_level,system).                         
%:- debug.

do_rn:- ensure_loaded(rs), forall(rn(B,A),do_rn(B,A)).
p_rn:- ensure_loaded(rs), forall(rn(B,A),p_rn(B,A)).

p_rn(B,A):- atom_string(B,BS),atom_string(A,AS),format('(safely-rename-or-merge ~q ~q).~n',[BS,AS]).
do_rn(B,A):- atom_string(B,BS),atom_string(A,AS),cl_eval(['safely-rename-or-merge',BS,AS], _O),!.


test_e:- cl_eval('*package*').
test_e:- cl_eval([+,1,2], O),po(O).
test_e:- cl_eval_string("(+ 1 2)", O),po(O.toString).
test_e:- cl_read_lisp("(+ 1 2)", O), po(O.cdr.toString).

test_x:- jpl:jpl_class_to_methods('org.logicmoo.system.BeanShellCntrl',C),dmsg(C).

% :- sleep(1), writeln('?-').
% :- interactor.

lmmud :-
  cd('/home/prologmud_server/'),
  ensure_loaded(run_mud_server).
  
on_bg_repl:- must(thread_signal(main, lmmud)).

:- initialization(startBG, program).

end_of_file.




cl_eval(['cyc:safely-rename-or-merge',"Rebelliousness","vtRebelliousnessFeeling"]).
cl_eval(['cyc-rename-fast',"Rebelliousness","vtRebelliousnessFeeling"]).

do_rn('Rebelliousness', vtRebelliousnessFeeling).

bsh % org.jpl7.Query.oneSolution("thread_self(ID)");

Target exception: org.jpl7.JPLException: unknown term type=8

(gdb)
(gdb)
(gdb) help all


import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Platform;

