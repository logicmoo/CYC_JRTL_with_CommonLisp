:- module(larkc_api, [foo/1, my_cl_eval/2]).

:- use_module(library(hostname)).

:- set_setting(pengines:slave_limit, -1).
%% :- set_setting(pengines:allow_from, ['127.0.0.1', localhost]).
:- (hostname(ai) -> set_setting(pengines:allow_from, ['127.0.0.1', localhost]) ; set_setting(pengines:allow_from, [*])).

foo(X) :-
	writeln(X).

my_cl_eval(Item,Result) :-
	system:cl_eval(Item,Result).

:- multifile sandbox:safe_primitive/1.

sandbox:safe_primitive(larkc_api:my_cl_eval(_, _)).
sandbox:safe_primitive(system:cl_eval(_, _)).
