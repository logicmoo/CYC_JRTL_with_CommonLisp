#!/usr/bin/env swipl
/*  
  LogicMOO initial paths

*/

:- if(current_prolog_flag(dialect,yap)).
:-  expects_dialect(swi).
@(C,M) :- M:call(C).
user:file_search_path(library, '../logicmoo_base/prolog').
user:file_search_path(library, '../logicmoo_nlu/prolog').
user:file_search_path(library, '../logicmoo_packages/prolog').
user:file_search_path(library, '../logicmoo_planner/prolog').

:- else.


:- multifile(mpred_online:semweb_startup/0).

:- multifile(in_logicmoo_repl_source_file/0).

in_logicmoo_repl_source_file.

:- if( \+ (exists_source(library(prolog_slack)))).

:- endif.
% ==============================
% Link up to our local packs
% ==============================
:- attach_packs.
:- initialization(attach_packs).

:- if((exists_source(library(logicmoo_utils)))).
:- ensure_loaded(system:library(logicmoo_utils)).
%USER :- ensure_loaded(library(logicmoo_user)).

:- else.

fix_pwd :- (exists_directory(runtime) -> working_directory(_,runtime);(exists_directory('../runtime')->working_directory(_,'../runtime');true)), pwd.
:- fix_pwd.
:- initialization(fix_pwd).

:- dynamic   user:file_search_path/2.
:- multifile user:file_search_path/2.

:- dynamic   user:library_directory/1.
:- multifile user:library_directory/1.

:- working_directory(X,X),call(call,asserta(lmcache666:restore_working_directory(X))).

:- source_location(F,_),file_directory_name(F, D),asserta(lmcache777:pmrt(D)),cd(D).


user:file_search_path(weblog, '/usr/lib/swi-prolog/pack/weblog/prolog'):-current_prolog_flag(unix,true).
user:file_search_path(weblog, 'C:/docs/Prolog/weblog/development/weblog/prolog').
user:file_search_path(weblog, 'C:/Users/Administrator/AppData/Roaming/SWI-Prolog/pack/weblog').

prmtc2:efsp_e(pack, '..').
prmtc2:efsp_e(cliopatria,pack('ClioPatria')). % :- current_prolog_flag(unix,true).
prmtc2:efsp_e(user, pack('ClioPatria/user')).
prmtc2:efsp_e(user, pack('swish')).
prmtc2:efsp_e(prologmud, library(prologmud)).


prmtc2:efsp_e(games, pack(prologmud_worlds)).
prmtc2:efsp_e(library, LIB):- prmtc2:efsp_lib(LIB).

prmtc2:efsp_lib(pack('logicmoo_base/prolog')).
prmtc2:efsp_lib(pack('logicmoo_nlu/prolog')):-exists_source(pack('logicmoo_nlu/pack.pl')).
prmtc2:efsp_lib(pack('logicmoo_packages/prolog')):-exists_source(pack('logicmoo_packages/pack.pl')).
prmtc2:efsp_lib(pack('logicmoo_planner/prolog')):-exists_source(pack('logicmoo_planner/pack.pl')).
% prmtc2:efsp_lib(pack('MUD_ircbot/prolog')).

:- export(prmtc:efsp/2).
:- dynamic(prmtc:efsp/2).
prmtc:efsp(T,O):-  prmtc2:efsp_e(T,A), once((lmcache777:pmrt(D),absolute_file_name(A,R,[relative_to(D),file_type(directory),access(exist)]))),R=O.

:-asserta((user:file_search_path(T,R):- prmtc:efsp(T,R))).
:-asserta((user:library_directory(R):- lmcache777:pmrt(R))).
:-asserta((user:library_directory(R):- prmtc:efsp(library,R))).

:- attach_packs.
:- ensure_loaded(system:library(logicmoo_utils)).
:- call(call,retract(lmcache666:restore_working_directory(X))),working_directory(_,X).
:- endif.

:- attach_packs.
:- initialization(attach_packs).

:- endif.   % SWI-Prolog


