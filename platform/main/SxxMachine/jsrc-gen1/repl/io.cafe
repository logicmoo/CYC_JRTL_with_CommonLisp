
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% Stream selection and control
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
%:- public current_input/1  (written in Java)
%:- public current_output/1 (written in Java)
%:- public set_input/1, set_output/1. (written in Java)
%:- public open/4 (written in Java)
:- public open/3.
%:- public close/2 (written in Java)
:- public close/1.
%:- public flush_output/1.(written in Java)
:- public flush_output/0.
:- public stream_property/2.

open(Source_sink, Mode, Stream) :- open(Source_sink, Mode, Stream, []).

close(S_or_a) :- close(S_or_a, []).

flush_output :-
    current_output(S),
    flush_output(S).

stream_property(Stream, Stream_property) :-
	var(Stream_property),
	!,
	'$stream_property'(Stream, Stream_property).
stream_property(Stream, Stream_property) :-
	'$stream_property_specifier'(Stream_property),
	!,
	'$stream_property'(Stream, Stream_property).
stream_property(Stream, Stream_property) :-
	illarg(domain(term,stream_property), stream_property(Stream, Stream_property), 2).

'$stream_property'(Stream, Stream_property) :-
	var(Stream),
	!,
	'$get_stream_manager'(SM),
	hash_map(SM, Map),
	'$builtin_member'((Stream,Vs), Map),
	java(Stream),
	'$builtin_member'(Stream_property, Vs).
'$stream_property'(Stream, Stream_property) :-
	java(Stream),
	!,
	'$get_stream_manager'(SM),
	hash_get(SM, Stream, Vs),
	'$builtin_member'(Stream_property, Vs).
'$stream_property'(Stream, Stream_property) :-
	illarg(domain(stream,stream), stream_property(Stream, Stream_property), 1).

'$stream_property_specifier'(input).
'$stream_property_specifier'(output).
'$stream_property_specifier'(alias(_)).
'$stream_property_specifier'(mode(_)).
'$stream_property_specifier'(type(_)).
'$stream_property_specifier'(file_name(_)).

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% Character input/output
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
%:- public get_char/2, get_code/2.   (written in Java)
%:- public peek_char/2, peek_code/2. (written in Java)
%:- public put_char/2, put_code/2.   (written in Java)
%:- public nl/0.                     (written in Java)

:- public get_char/1, get_code/1.
:- public peek_char/1, peek_code/1.
:- public put_char/1, put_code/1.
:- public nl/1.

get_char(Char)  :- current_input(S), get_char(S, Char).
get_code(Code)  :- current_input(S), get_code(S, Code).

peek_char(Char) :- current_input(S), peek_char(S, Char).
peek_code(Code) :- current_input(S), peek_code(S, Code).

put_char(Char)  :- current_output(S), put_char(S, Char).
put_code(Code)  :- current_output(S), put_code(S, Code).

nl        :- current_output(S), nl(S).
nl(S) :- put_char(S, '\n').

:- public get0/1, get0/2.
:- public get/1.
%:- public get/2.  (written in Java)
:- public put/1, put/2.
:- public tab/1.
%:- public tab/2.  (written in Java)
:- public skip/1.
%:- public skip/2. (written in Java)

get0(Code)  :- current_input(S), get_code(S, Code).
get0(S_or_a, Code)  :- get_code(S_or_a, Code).

get(Code)  :- current_input(S), get(S, Code).

put(Exp)  :- current_output(S), put(S, Exp).
put(S_or_a, Exp)  :- Code is Exp, put_code(S_or_a, Code).

tab(N) :- current_output(S), tab(S, N).

skip(N) :- current_input(S), skip(S, N).

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% Byte input/output
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
:- public get_byte/1, peek_byte/1, put_byte/1.
%:- public get_byte/2.  % written in java
%:- public peek_byte/2. % written in java
%:- public put_byte/2.  % written in java

get_byte(Byte) :-
    current_input(S),
    get_byte(S, Byte).

peek_byte(Byte) :-
    current_input(S),
    peek_byte(S, Byte).

put_byte(Byte) :-
    current_output(S),
    put_byte(S, Byte).