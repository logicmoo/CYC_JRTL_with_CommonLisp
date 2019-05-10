:- module( versions, [] ).

:- dynamic skipping/0, system_version/1.


:- assert( current_version(any) ).

term_expansion( (:-begin_version(Version)), [] ) :-
	( skipping ->
            version_error("Trying to start new version specific code segment (~w) in another version specific code segment.",
                           [Version])
	; system_version( Version )
            -> true
        ; % else
	   assert(skipping)
        ),
	assert( current_version(Version) ).
term_expansion( (:-end_version(Version)), [] ) :-
	( current_version(Version)
            -> true
	    ;  version_error("Found the end of a code specific version for '~w' that was not started.",
	                      [Version] )
	),
	retractall( current_version(_) ),
	assert( current_version(any) ),
	( skipping -> retractall( skipping ) ; true ).
term_expansion( _X, [] ) :-
	skipping.


system_version( Version ) :-
	( Version = sicstus2 ->
	    prolog_flag( version,SystemVersionAtom ),
	    atom_chars( SystemVersionAtom, SystemVersionString ),
	    SystemVersionString = [0'S,0'I,0'C,0'S,0't,0'u,0's,32,0'2|_]
	; Version = sicstus21 ->
	    prolog_flag( version,SysVersionAtom ),
	    atom_chars( SysVersionAtom, SysVersionString ),
	    SysVersionString = [0'S,0'I,0'C,0'S,0't,0'u,0's,32,0'2,0'.,0'1|_]
	; Version = sicstus3 ->
	    prolog_flag( version,SystemVersionAtom ),
	    atom_chars( SystemVersionAtom, SystemVersionString ),
	    SystemVersionString = [0'S,0'I,0'C,0'S,0't,0'u,0's,32,0'3|_]
	).




version_error(ErrorMsg, Args) :-
	format(user_error, "~N{Version Error: ", [] ),
	format(user_error, ErrorMsg,             Args     ),
	format(user_error, "}~n",                []       ).

% If you use a SICStus 2.1 and want to be able to load other files
% before this one that contains definitions of user:term_expansion/2 you
% should comment out the following line.
:- multifile user:term_expansion/2.

user:term_expansion(X,Y) :- versions:term_expansion(X,Y).
