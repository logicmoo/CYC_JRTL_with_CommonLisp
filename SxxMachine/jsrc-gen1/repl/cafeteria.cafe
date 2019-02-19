%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% Interactive interpreter of Prolog Cafe
%
% Mutsunori Banbara (banbara@kobe-u.ac.jp)
% Naoyuki Tamura (tamura@kobe-u.ac.jp)
% Kobe University
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

:- package 'com.googlecode.prolog_cafe.builtin'.
:- public cafeteria/0.
:- public consult/1.
:- public trace/0, notrace/0.
:- public debug/0, nodebug/0.
:- public leash/1.
:- public spy/1, nospy/1, nospyall/0.
:- public listing/0.
:- public listing/1.


%%% Main
cafeteria :-
	'$cafeteria_init',
	repeat,
	    '$toplvel_loop',
	    on_exception(Msg, '$cafeteria'(Goal), print_message(error, Msg)),
	    Goal == end_of_file,
	    !,
	nl, '$fast_write'(bye), nl.

'$cafeteria_init' :-
	retractall('$leap_flag'(_)),
	retractall('$current_leash'(_)),
	retractall('$current_spypoint'(_,_,_)),
	retractall('$consulted_file'(_)),
	retractall('$consulted_package'(_)),
	retractall('$consulted_predicate'(_,_,_)),
	assertz('$leap_flag'(no)),
	assertz('$current_leash'(call)),
	assertz('$current_leash'(exit)),
	assertz('$current_leash'(redo)),
	assertz('$current_leash'(fail)),
	!.

'$toplvel_loop' :-
	current_prolog_flag(debug, Mode),
	(Mode == off -> true ; print_message(info,[debug])),
	'$fast_write'('| ?- '),
	flush_output.

'$cafeteria'(Goal) :-
	read_with_variables(Goal, Vars),
	'$process_order'(Goal, Vars).

'$process_order'(G,               _) :- var(G), !, illarg(var, (?- G), 1).
'$process_order'(end_of_file,     _) :- !.
'$process_order'([File|Files],    _) :- !, consult([File|Files]).
'$process_order'(G,            Vars) :-
	current_prolog_flag(debug, Mode),
	(   Mode == off -> call(user:G) ; '$trace_goal'(user:G)   ), nl,
	'$rm_redundant_vars'(Vars, Vars1),
	'$give_answers_with_prompt'(Vars1),
	!,
	'$fast_write'(yes), nl.
'$process_order'(_, _) :- nl, '$fast_write'(no), nl.

'$rm_redundant_vars'([], []) :- !.
'$rm_redundant_vars'(['_'=_|Xs], Vs)  :- !,
	'$rm_redundant_vars'(Xs, Vs).
'$rm_redundant_vars'([X|Xs], [X|Vs]) :-
	'$rm_redundant_vars'(Xs, Vs).

'$give_answers_with_prompt'([]) :- !.
'$give_answers_with_prompt'(Vs) :-
	'$give_an_answer'(Vs),
	'$fast_write'(' ? '), flush_output,
	read_line(Str),
	Str \== ";",
	nl.

'$give_an_answer'([])  :- !, '$fast_write'(true).
'$give_an_answer'([X]) :- !, '$print_an answer'(X).
'$give_an_answer'([X|Xs]) :-
	'$print_an answer'(X), '$fast_write'(','), nl,
	'$give_an_answer'(Xs).

'$print_an answer'(N = V) :-
	write(N), '$fast_write'(' = '), writeq(V).


%%% Read Program

consult(Files) :- var(Files), !, illarg(var, consult(Files), 1).
consult([]) :- !.
consult([File|Files]) :- !, consult(File), consult(Files).
consult(File) :- atom(File), !, '$consult'(File).

'$consult'(F) :-
	'$prolog_file_name'(F, PF),
	open(PF, read, In),
	stream_property(In, file_name(File)),
	print_message(info, [consulting,File,'...']),
	statistics(runtime, _),
	consult_stream(File, In),
	statistics(runtime, [_,T]),
	print_message(info, [File,consulted,T,msec]),
	close(In).

'$prolog_file_name'(File,  File) :- sub_atom(File, _, _, After, '.'), After > 0, !.
'$prolog_file_name'(File0, File) :- atom_concat(File0, '.pl', File).

%%% Trace

trace :- current_prolog_flag(debug, on), !.
trace :-
	set_prolog_flag(debug, on),
	'$trace_init',
	'$fast_write'('{Small debugger is switch on}'),
	nl, !.

'$trace_init' :-
	retractall('$leap_flag'(_)),
	retractall('$current_leash'(_)),
	retractall('$current_spypoint'(_,_,_)),
	assertz('$leap_flag'(no)),
	assertz('$current_leash'(call)),
	assertz('$current_leash'(exit)),
	assertz('$current_leash'(redo)),
	assertz('$current_leash'(fail)),
	!.

notrace :- current_prolog_flag(debug, off), !.
notrace :-
	set_prolog_flag(debug, off),
	'$fast_write'('{Small debugger is switch off}'),
	nl, !.

debug :- trace.
nodebug :- notrace.

%%% Trace a Goal
'$trace_goal'(Term) :-
	'$set_debug_flag'(leap, no),
	'$get_current_B'(Cut),
	'$meta_call'(Term, user, Cut, 0, trace).

'$trace_goal'(X, P, FA, Depth) :-
	print_procedure_box(call, X, P, FA, Depth),
	'$call_internal'(X, P, FA, Depth, trace),
	print_procedure_box(exit, X, P, FA, Depth),
	redo_procedure_box(X, P, FA, Depth).
'$trace_goal'(X, P, FA, Depth) :-
	print_procedure_box(fail, X, P, FA, Depth),
	fail.

print_procedure_box(Mode, G, P, F/A, Depth) :-
	clause('$current_spypoint'(P, F, A), _),
	!,
	'$builtin_message'(['+',Depth,Mode,':',P:G]),
	'$read_blocked'(print_procedure_box(Mode,G,P,F/A,Depth)).
print_procedure_box(Mode, G, P, FA, Depth) :-
	clause('$leap_flag'(no), _),
	!,
	'$builtin_message'([' ',Depth,Mode,':',P:G]),
	(    clause('$current_leash'(Mode), _)
             ->
	     '$read_blocked'(print_procedure_box(Mode,G,P,FA,Depth))
	     ;
	     nl
	 ).
print_procedure_box(_, _, _, _, _).

redo_procedure_box(_, _, _, _).
redo_procedure_box(X, P, FA, Depth) :-
	print_procedure_box(redo, X, P, FA, Depth),
	fail.

'$read_blocked'(G) :-
	'$fast_write'(' ? '),
	flush_output,
	read_line(C),
	(C == [] -> DOP = 99 ; C = [DOP|_]),
	'$debug_option'(DOP, G).

'$debug_option'(97,  _) :- !, notrace, abort.               % a for abort
'$debug_option'(99,  _) :- !, '$set_debug_flag'(leap, no).  % c for creep
'$debug_option'(108, _) :- !, '$set_debug_flag'(leap, yes). % l for leap
'$debug_option'(43,  print_procedure_box(Mode,G,P,FA,Depth)) :- !, % + for spy this
	spy(P:FA),
	call(print_procedure_box(Mode,G,P,FA,Depth)).
'$debug_option'(45,  print_procedure_box(Mode,G,P,FA,Depth)) :- !, % - for nospy this
	nospy(P:FA),
	call(print_procedure_box(Mode,G,P,FA,Depth)).
'$debug_option'(63,  G) :- !, '$show_debug_option', call(G).
'$debug_option'(104, G) :- !, '$show_debug_option', call(G).
'$debug_option'(_, _).

'$show_debug_option' :-
	tab(4), '$fast_write'('Debugging options:'), nl,
	tab(4), '$fast_write'('a      abort'), nl,
	tab(4), '$fast_write'('RET    creep'), nl,
	tab(4), '$fast_write'('c      creep'), nl,
	tab(4), '$fast_write'('l      leap'), nl,
	tab(4), '$fast_write'('+      spy this'), nl,
	tab(4), '$fast_write'('-      nospy this'), nl,
	tab(4), '$fast_write'('?      help'), nl,
	tab(4), '$fast_write'('h      help'), nl.

'$set_debug_flag'(leap, Flag) :-
	clause('$leap_flag'(Flag), _),
	!.
'$set_debug_flag'(leap, Flag) :-
	retractall('$leap_flag'(_)),
	assertz('$leap_flag'(Flag)).

%%% Spy-Points

spy(T) :-
	'$term_to_predicateindicator'(T, PI, spy(T)),
	trace,
	'$assert_spypoint'(PI),
	'$set_debug_flag'(leap, yes),
	!.

'$assert_spypoint'(P:F/A) :-
	clause('$current_spypoint'(P,F,A), _),
	print_message(info, [spypoint,P:F/A,is,already,added]),
	!.
'$assert_spypoint'(P:F/A) :-
	clause('$consulted_predicate'(P,F/A,_), _),
	assertz('$current_spypoint'(P,F,A)),
	print_message(info, [spypoint,P:F/A,is,added]),
	!.
'$assert_spypoint'(P:F/A) :-
	print_message(warning, [no,matching,predicate,for,spy,P:F/A]).

nospy(T) :-
	'$term_to_predicateindicator'(T, PI, nospy(T)),
	'$retract_spypoint'(PI),
	'$set_debug_flag'(leap, no),
	!.

'$retract_spypoint'(P:F/A) :-
	retract('$current_spypoint'(P,F,A)),
	print_message(info, [spypoint,P:F/A,is,removed]),
	!.
'$retract_spypoint'(_).

nospyall :-
	retractall('$current_spypoint'(_,_,_)),
	'$set_debug_flag'(leap, no).

%%% Leash

leash(L) :- nonvar(L), '$leash'(L), !.
leash(L) :- illarg(type('leash_specifier'), leash(L), 1).

'$leash'([]) :- !,
	retractall('$current_leash'(_)),
	print_message(info, [no,leashing]).
'$leash'(Ms) :-
	retractall('$current_leash'(_)),
	'$assert_leash'(Ms),
	print_message(info,[leashing,stopping,on,Ms]).

'$assert_leash'([]) :- !.
'$assert_leash'([X|Xs]) :-
	'$leash_specifier'(X),
	assertz('$current_leash'(X)),
	'$assert_leash'(Xs).

'$leash_specifier'(call).
'$leash_specifier'(exit).
'$leash_specifier'(redo).
'$leash_specifier'(fail).
%'$leash_specifier'(exception).

%%% Listing
listing :- '$listing'(_, user).

listing(T) :- var(T), !, illarg(var, listing(T), 1).
listing(P) :- atom(P), !, '$listing'(_, P).
listing(F/A) :- !, '$listing'(F/A, user).
listing(P:PI) :- atom(P), !, '$listing'(PI, P).
listing(T) :- illarg(type(predicate_indicator), listing(T), 1).

'$listing'(PI, P) :- var(PI), !,
	'$listing_dynamic_clause'(P, _).
'$listing'(F/A, P) :- atom(F), integer(A), !,
	'$listing_dynamic_clause'(P, F/A).
'$listing'(PI, P) :- illarg(type(predicate_indicator), listing(P:PI), 1).

'$listing_dynamic_clause'(P, PI) :-
	'$new_internal_database'(P),
	hash_keys(P, Keys),
	'$builtin_member'(PI, Keys),
	PI = F/A,
	functor(H, F, A),
	'$clause_internal'(P, PI, H, Cl, _),
	'$write_dynamic_clause'(P, Cl),
	fail.
'$listing_dynamic_clause'(_, _).

'$write_dynamic_clause'(_, Cl) :- var(Cl), !, fail.
'$write_dynamic_clause'(P, (H :- true)) :- !,
	numbervars(H, 0, _),
	'$write_dynamic_head'(P, H),
	write('.'), nl.
'$write_dynamic_clause'(P, (H :- B)) :- !,
	numbervars((H :- B), 0, _),
	'$write_dynamic_head'(P, H),
	write(' :-'), nl,
	'$write_dynamic_body'(B, 8),
	write('.'), nl.

'$write_dynamic_head'(user, H) :- !, writeq(H).
'$write_dynamic_head'(P, H) :-
	write(P), write(':'), writeq(H).

'$write_dynamic_body'((G1,G2), N) :- !,
	'$write_dynamic_body'(G1, N), write(','), nl,
	'$write_dynamic_body'(G2, N).
'$write_dynamic_body'((G1;G2), N) :- !,
	N1 is N+4,
	tab(N), write('('), nl,
	'$write_dynamic_body'(G1, N1), nl,
	tab(N), write(';'), nl,
	'$write_dynamic_body'(G2, N1), nl,
	tab(N), write(')').
'$write_dynamic_body'((G1->G2), N) :- !,
	N1 is N+4,
	tab(N), write('('), nl,
	'$write_dynamic_body'(G1, N1), nl,
	tab(N), write('->'), nl,
	'$write_dynamic_body'(G2, N1), nl,
	tab(N), write(')').
'$write_dynamic_body'(B, N) :-
	tab(N), writeq(B).


print_message(Type, Message) :- var(Type), !,
	illarg(var, print_message(Type,Message), 1).
print_message(error, Message) :- !,
	'$error_message'(Message).
print_message(info,  Message) :- !,
	'$fast_write'('{'),
	'$builtin_message'(Message),
	'$fast_write'('}'), nl.
print_message(warning, Message) :- !,
	'$fast_write'('{WARNING: '),
	'$builtin_message'(Message),
	'$fast_write'('}'), nl.

write(M)  :- write('user_output', M).
writeq(M) :- writeq('user_output', M).
tab(S)    :- tab('user_output', S).
nl        :- nl('user_output').
flush_output :- flush_output('user_output').
'$fast_write'(M) :- '$fast_write'('user_output', M).

'$builtin_message'([]) :- !.
'$builtin_message'([M]) :- !, write(M).
'$builtin_message'([M|Ms]) :-
	write(M),
	'$fast_write'(' '),
	'$builtin_message'(Ms).

'$error_message'(instantiation_error(Goal,0)) :- !,
	'$fast_write'(user_error,'{INSTANTIATION ERROR: '),
	'$write_goal'(user_error,Goal),
	'$fast_write'(user_error,'}'), nl(user_error),flush_output(user_error).
'$error_message'(instantiation_error(Goal,ArgNo)) :- !,
	'$fast_write'(user_error,'{INSTANTIATION ERROR: '),
	'$write_goal'(user_error,Goal),
	'$fast_write'(user_error,' - arg '), '$fast_write'(user_error,ArgNo),
	'$fast_write'(user_error,'}'), nl(user_error),flush_output(user_error).
'$error_message'(type_error(Goal,ArgNo,Type,Culprit)) :- !,
	'$fast_write'(user_error,'{TYPE ERROR: '),
	'$write_goal'(user_error,Goal),
	'$fast_write'(user_error,' - arg '), '$fast_write'(user_error,ArgNo),
	'$fast_write'(user_error,': expected '), '$fast_write'(user_error,Type),
	'$fast_write'(user_error,', found '), write(user_error,Culprit),
	'$fast_write'(user_error,'}'), nl(user_error),flush_output(user_error).
'$error_message'(domain_error(Goal,ArgNo,Domain,Culprit)) :- !,
	'$fast_write'(user_error,'{DOMAIN ERROR: '),
	'$write_goal'(user_error,Goal),
	'$fast_write'(user_error,' - arg '), '$fast_write'(user_error,ArgNo),
	'$fast_write'(user_error,': expected '), '$fast_write'(user_error,Domain),
	'$fast_write'(user_error,', found '), write(user_error,Culprit),
	'$fast_write'(user_error,'}'), nl(user_error),flush_output(user_error).
'$error_message'(existence_error(_Goal,0,ObjType,Culprit,_Message)) :- !,
	'$fast_write'(user_error,'{EXISTENCE ERROR: '),
	'$fast_write'(user_error,ObjType), '$fast_write'(user_error,' '), write(user_error,Culprit), '$fast_write'(user_error,' does not exist'),
	'$fast_write'(user_error,'}'), nl(user_error),flush_output(user_error).
'$error_message'(existence_error(Goal,ArgNo,ObjType,Culprit,_Message)) :- !,
	'$fast_write'(user_error,'{EXISTENCE ERROR: '),
	'$write_goal'(user_error,Goal),
	'$fast_write'(user_error,' - arg '), '$fast_write'(user_error,ArgNo),
	'$fast_write'(user_error,': '),
	'$fast_write'(user_error,ObjType), '$fast_write'(user_error,' '), write(user_error,Culprit), '$fast_write'(user_error,' does not exist'),
	'$fast_write'(user_error,'}'), nl(user_error),flush_output(user_error).
'$error_message'(permission_error(Goal,Operation,ObjType,Culprit,Message)) :- !,
	'$fast_write'(user_error,'{PERMISSION ERROR: '),
	'$write_goal'(user_error,Goal),
	'$fast_write'(user_error,' - can not '), '$fast_write'(user_error,Operation), '$fast_write'(user_error,' '),
	'$fast_write'(user_error,ObjType), '$fast_write'(user_error,' '), write(user_error,Culprit),
	'$fast_write'(user_error,': '), '$fast_write'(user_error,Message),
	'$fast_write'(user_error,'}'), nl(user_error),flush_output(user_error).
'$error_message'(representation_error(Goal,ArgNo,Flag)) :- !,
	'$fast_write'(user_error,'{REPRESENTATION ERROR: '),
	'$write_goal'(user_error,Goal),
	'$fast_write'(user_error,' - arg '), '$fast_write'(user_error,ArgNo),
	'$fast_write'(user_error,': limit of '), '$fast_write'(user_error,Flag), '$fast_write'(user_error,' is breached'),
	'$fast_write'(user_error,'}'), nl(user_error),flush_output(user_error).
'$error_message'(evaluation_error(Goal,ArgNo,Type)) :- !,
	'$fast_write'(user_error,'{EVALUATION ERROR: '),
	'$write_goal'(user_error,Goal),
	'$fast_write'(user_error,' - arg '), '$fast_write'(user_error,ArgNo),
	'$fast_write'(user_error,', found '), '$fast_write'(user_error,Type),
	'$fast_write'(user_error,'}'), nl(user_error),flush_output(user_error).
'$error_message'(syntax_error(Goal,ArgNo,Type,Culprit,_Message)) :- !,
	'$fast_write'(user_error,'{SYNTAX ERROR: '),
	'$write_goal'(user_error,Goal),
	'$fast_write'(user_error,' - arg '), '$fast_write'(user_error,ArgNo),
	'$fast_write'(user_error,': expected '), '$fast_write'(user_error,Type),
	'$fast_write'(user_error,', found '), write(user_error,Culprit),
	'$fast_write'(user_error,'}'), nl(user_error),flush_output(user_error).
'$error_message'(system_error(Message)) :- !,
	'$fast_write'(user_error,'{SYSTEM ERROR: '), write(user_error,Message), '$fast_write'(user_error,'}'), nl(user_error),flush_output(user_error).
'$error_message'(internal_error(Message)) :- !,
	'$fast_write'(user_error,'{INTERNAL ERROR: '), write(user_error,Message), '$fast_write'(user_error,'}'), nl(user_error),flush_output(user_error).
'$error_message'(java_error(Goal,ArgNo,Exception)) :- !,
	'$fast_write'(user_error,'{JAVA ERROR: '),
	'$write_goal'(user_error,Goal),
	'$fast_write'(user_error,' - arg '), '$fast_write'(user_error,ArgNo),
	'$fast_write'(user_error,', found '), '$write_goal'(user_error,Exception),
	'$fast_write'(user_error,'}'), nl(user_error),
	'$print_stack_trace'(Exception),flush_output(user_error).
'$error_message'(Message) :-
	'$fast_write'(user_error,'{'), write(user_error,Message), '$fast_write'(user_error,'}'), nl(user_error),flush_output(user_error).
'$write_goal'(Goal) :- java(Goal), !, '$write_toString'('user_error', Goal).
'$write_goal'(Goal) :- write(Goal).

'$write_goal'(S,Goal) :- java(Goal), !, '$write_toString'(S, Goal).
'$write_goal'(S,Goal) :- write(S,Goal).

