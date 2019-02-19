/*****************************************************************
Time-stamp: <2008-10-29 10:42:42 banbara>

NAME
       am2j: Translating WAM-based Intermediate Code into Java

USAGE
       # sicstus
       ?- [am2j].
       ?- am2j([File]).

       # sicstus
       ?- [am2j].
       ?- am2j([File, Dir]).

PARAMETERS
       File is an input WAM-based Intermediate file name.

DESCRIPTION
       This program translates WAM-based intermediate codes into Java.
       For each predicate p/n, the file named "PRED_p_n.java" is generated.
       Generated files can be compiled and executed by usual
       java utilities (ex. javac) with the Prolog Cafe runtime system.

COPYRIGHT
       am2j (Translating WAM-based Intermediate Code into Java)
       Copyright (C) 1997-2008 by
          Mutsunori Banbara (banbara@kobe-u.ac.jp) and
          Naoyuki Tamura (tamura@kobe-u.ac.jp)

SEE ALSO
       http://kaminari.istc.kobe-u.ac.jp/PrologCafe/
*****************************************************************/
%:- module('SxxMachine.am2j', [main/0,am2j/1]).
legacy_functor(P,'.',A):- functor(P,'[|]',A),!.
legacy_functor(P,F,A):- functor(P,F,A),!.

:- if(false).
:- use_module(library(logicmoo_common)).
:- else.
must(G):- call(G)*->true;throw(fail_must(G)).
nop(_).

fresh_line(S):- format(S,'~N',[]).
:- endif.


am2j_subst(I,F,R,O):- I == F,!,R=O.
am2j_subst(I,_,_,O):- \+ compound(I),I=O.
am2j_subst([I|IL],F,R,[O|OL]):- !,am2j_subst(I,F,R,O),am2j_subst(IL,F,R,OL).
am2j_subst(I,F,R,O):- I=..IL,am2j_subst(IL,F,R,OL),O=..OL.

:- set_prolog_flag(access_level,system). % allow system redefination

/*****************************************************************
  Declarations
*****************************************************************/
:- op(1170, xfx, (:-)).
:- op(1170, xfx, (-->)).
:- op(1170,  fx, (:-)).
:- op(1170,  fx, (?-)).
:- op(1150,  fx, (public)).
:- op(1150,  fx, (package)).  % Prolog Cafe specific

:- dynamic dest_dir/1.
:- dynamic current_arity/1.
:- dynamic current_functor/1.
:- dynamic current_package/1.
:- dynamic domain_definition/1.
:- dynamic inlined/2.


:- set_prolog_flag(double_quote,codes).
:- ensure_loaded(pl2am).

%package(_).
%long(X):- integer(X),(X>2147483647; X < - 2147483647).
atom_or_nil_am2j(A):- atom(A);A==[].

:- package 'SxxMachine.am2j'.
:- public main/0, am2j/1.

/*****************************************************************
  Main
*****************************************************************/
:- if(\+ current_predicate(main/0)).
main :-
    catch(read_term(X, [double_quotes(codes),module('SxxMachine.pl2am')]),E,(wd(E),trace)),
	am2j(X).
:- endif.

am2j_flag(istype).
am2j_flag(no_switch_on_term_inline).
am2j_flag(unused).
am2j_flag(arrays).

pl2j(File0):-                          
   prolog_file_name(File0,File),
   pl2am(File),!,                            
   atom_concat(File,'.am',AMFile),
   am2j(AMFile),!.

am2j([File]) :- !, am2j([File, '.']).
am2j([File,Dir]) :-
	retractall(dest_dir(_)),
	assert(dest_dir(Dir)),
        clear_buffer(File),
	open(File, read, In),
	repeat,
	  catch(read_term(In, X, [double_quotes(codes),module('SxxMachine.pl2am')]),E,(wd(E),trace)),
	  once(must(buffer(File,write_java(X, In)))),
          X == end_of_file,!,
	close(In),
        optimize_buffer(File),!,
        write_buffer(File),!,
	write_domains,!.
am2j(File):-am2j([File]),!.


:- dynamic(is_remembered/2).
%is_remembered(0,_).
%is_remembered(1,_).
%is_remembered([],_).

check_if_remembered(X,Y):-!,var(X),var(Y),!,fail.
check_if_remembered(X,Y):-var(X),var(Y),!,fail.
check_if_remembered(X,Y):-is_remembered(X,Y).


:- dynamic(aliased_to/2).
is_aliased(R1,R2):- dif(R1,R2),is_aliased0(R1,R2),R1 @> R2.

is_aliased0(R1,R2):- nonvar(R1),aliased_to(R1,R2),!.
is_aliased0(R1,R2):- nonvar(R1),dif(Val,R1),check_if_remembered(Val,R1),nonvar(Val),dif(Val,R2),
  is_remembered(Val,R2),nonvar(R2),R1 @> R2,assertz(aliased_to(R1,R2)).

write_domains:-
	clause(dest_dir(Dir),_),
	findall(D,domain_definition(D),LD),
	% on some platforms (like SWI prolog) predicate write_domain_definitions might be not available
	% so wrap it with catch and produce warning message
	call(call,catch('SxxMachine':call('system':write_domain_definitions(Dir,LD)),_,
	  nop(am2j_message([domain,definitions,are,not,supported,and,skipped])))).

write_java(X, _) :- var(X), !,
	am2j_error([unbound,variable,is,found]),
	fail.
write_java(end_of_file, _) :- !.
write_java((:- G), _) :- !, catch(must(call(G)),E,dmsg(E)).
write_java(begin_predicate(P00, F/A), In) :- !,
  ((
	%clause(dest_dir(Dir), _),        
        P = bootpreds,
	retractall(current_package(_)),
	retractall(current_arity(_)),
	
        retractall(aliased_to(_,_)),
        retractall(is_remembered(_,_)),
        clear_buffer(F/A),
        once(must(buffer(F/A,nop(write_java(begin_predicate(P00, F/A), In))))),

	retractall(current_functor(_)),
	retractall(inlined(_,_)),
	assert(current_package(P)),
	assert(current_arity(A)),
	assert(current_functor(F)),
	%predicate_encoding(F, F1),
	%package_encoding(P, PDir),
        %list_to_string_am2j([Dir,'/',PDir], SrcDir),
	%list_to_string_am2j([SrcDir,'/','PRED_',F1,'_',A,'.java'], SrcFile),
	%mkdirs(SrcDir),
       % open(SrcFile, w),
	nop((w(' public class '),write_package(P),w(' extends CompiledFile {'),
	  nl)))),!,
       call((repeat,
	  catch(read_term(In, X, [double_quotes(codes),module('SxxMachine.pl2am')]),E,(wd(E),trace)),
	  once(must(buffer(F/A,write_java0(X, In)))),
          %X == end_of_file,
	  X = end_predicate(_, F/A),!)),!,   
          optimize_buffer(F/A),
          write_buffer(F/A),
       % close(Out),
	!.
write_java(X, _) :-
	am2j_error([X,is,an,invalid,argument,in,write_java/2]),
	fail.

w(_,_):- told,trace.

clear_buffer(FA):- retractall(buff(FA,_)),!.

buffer(_File,write_java(begin_predicate(P00, F/A), In)):-!,write_java(begin_predicate(P00, F/A), In),!.
buffer(FA,write_java0(get_list(X), In)) :- !,	
	read_instructions(2, In, Us),
        buffer(FA,write_java0(after_get_list(X,Us), In)).
buffer(FA,write_java0(get_str(F/A,Xi,Xj), In)) :- !,        
        read_instructions(A, In, Us),
        buffer(FA,write_java0(after_get_str(F/A,Xi,Xj,Us), In)).

buffer(FA,write_java0(X, _In)):- !,buffer(FA,bwj(X)).
buffer(FA,X):- ignore(forall(gleaned(X),true)),assertz(buff(FA,X)),!.

optimize_buffer(FA):-findall(D,buff(FA,bwj(D)),L),nop(wd(optimize_buffer(FA,L))),optimize_buffer_list(FA,L,L2),
 (L==L2->true;resave_buffer(FA,L2)).
optimize_buffer(FA):-!,wd(optimize_buffer(FA)), nop(with_output_to(user_error,listing(user:buff/2))).
write_buffer(FA):- forall(retract(buff(FA,X)),must(X)).

resave_buffer(FA,L2):- retractall(buff(FA,_)),re_buffer(FA,L2),% shell(cls),
   nop(with_output_to(user_error,listing(user:buff/2))).

re_buffer(FA,[I|L2]):-!,assertz(buff(FA,bwj(I))),re_buffer(FA,L2).
re_buffer(_,[]).

optimize_buffer_list(FA,L1,L2):- combine3_1l(L1,List)->List\==L1,!,optimize_buffer_list(FA,List,L2).
optimize_buffer_list(FA,[X|L1],[X|L2]):- optimize_buffer_list(FA,L1,L2),!.
optimize_buffer_list(_,L1,L1).



'C'(Xi,Xs):-
  w('S('),
   write_reg(Xi),   
   w(', '),
   write_reg_args(Xs),
   w(');'), nl.
                 
combine3_1l([put_str_args(Xs,(Y)),put_str(Xi,(Y),Xj)|More],[(comment(((put_str_args(Xs,(Y)),put_str(Xi,(Y),Xj))))),
   set('@'('C'(Xi,Xs)),Xj)|More]):-
   Xj \= s(_),  Y = y(_), !.
% combine3_1l([put_list(A,@('Prolog.Nil'),s(N))|More],List):- am2j_subst(More,s(N),'@'('Prolog.Nil'),List),!.

%combine3_1l([decl_pred_vars(PV1)|More],[decl_pred_vars(PV2)|More]):- apply:exclude(=('#'(_)),PV1,PV2)->PV1\==PV2,!.
%combine3_1l([put_cont(W,p(N)),X|More],List):- am2j_subst(More,p(N),'#'(execute(W)),List),!.
combine3_1l([main(F/A,P):Inst|More],[main(F/A,P):comment(main(F/A,P)),Inst|More]):- Inst\=comment(_), !.
combine3_1l([put_cont(W,p(N)),X|More],[Y|More]):- am2j_subst(X,p(N),'#'(execute(W)),Y)->X\==Y,!.
combine3_1l([put_con([],INTO)|More],List):- am2j_subst(More,INTO,'@'('Prolog.Nil'),List),!.
combine3_1l([put_con(true,INTO)|More],List):- am2j_subst(More,INTO,'@'('Prolog.True'),List),!.
combine3_1l([put_con(S,INTO)|More],[inline('@'(DECL))|List]):- atom(S),symbol_to_name(S,Var),
  am2j_subst(More,INTO,'@'(Var),List),!,
  constant_encoding(S,SC),format(atom(DECL),'final static Functor ~w = SYM("~s");',[Var,SC]),!.

combine3_1l([put_con(F/A,INTO)|More],[inline('@'(DECL))|List]):- atom(F),integer(A),symbol_to_name(F/A,Var),
  am2j_subst(More,INTO,'@'(Var),List),!,
  constant_encoding(F,SC),format(atom(DECL),'final static Functor ~w = F("~s",~w);',[Var,SC,A]),!.

combine3_1l([put_int(S,INTO)|More],List):- S> -19,S<26, must(symbol_to_name(S,Var)),
  am2j_subst(More,INTO,'@'(Var),List),!.


combine3_1l([put_int(S,INTO)|More],[inline('@'(DECL))|List]):- integer(S), big_int(S), symbol_to_name(S,Var),
  am2j_subst(More,INTO,'@'(Var),List),!,
  format(atom(DECL),'final static NumberTerm ~w = Long("~w");',[Var,S]),!.

combine3_1l([put_int(S,INTO)|More],[inline('@'(DECL))|List]):- integer(S), long(S), symbol_to_name(S,Var),
  am2j_subst(More,INTO,'@'(Var),List),!,
  format(atom(DECL),'final static NumberTerm ~w = Long(~wL);',[Var,S]),!.

combine3_1l([put_int(S,INTO)|More],[inline('@'(DECL))|List]):-  must(symbol_to_name(S,Var)),
  am2j_subst(More,INTO,'@'(Var),List),!,
  format(atom(DECL),'final static NumberTerm ~w = Integer(~w);',[Var,S]),!.

combine3_1l([deref(Ri,Rj)|Rest],RestO):-
  until_end_of_proc(Rest,RealRest,Next),  
  occurrences_of_var(RealRest,Rj,N),!,N==1,
  am2j_subst(RealRest,Rj,'@'(dref(Ri)),List),
  append(List,Next,RestO),!.

%until_end_of_proc([execute(W)|More],[execute(W)],More).
until_end_of_proc(Rest,RealRest,Next):- append(Left,[execute(W)|Next],Rest),!,append(Left,[execute(W)],RealRest),!.
   
%combine3_1l([put_int(1,INTO)|More],List):- am2j_subst(More,INTO,'@'(int_1),List),!.
%combine3_1l([put_int(N,INTO)|More],List):- N < 31, N > -31, symbol_to_name(N,Var),format(atom(A),'~w',[Var]),am2j_subst(More,INTO,'@'(A),List),!.
%combine3_1l(_ABC,_List):- fail.

big_int(X):- X>9223372036854775808; X < -9223372036854775807.

bwj(X):- write_java0(X,errr).

gleaned_away(NC):- var(NC),!,fail.
gleaned_away(end_of_file).
gleaned_away(X):- gleaned(X),fail.

gleaned(NC):- var(NC),!,fail.
gleaned(NC):- \+ compound(NC),!.
gleaned(write_java(X,_)):-!,gleaned(X).
gleaned(nop(X)):-!,gleaned(X).
gleaned(write_java0(X,_)):-!,gleaned(X).
gleaned(PUT):- PUT=..[PUT,I,X],atom_concat(put_,What,PUT),gleaned(put(What,I,X)).
gleaned(put(What,I,X)):-wd(put(What,I,X)). 

wd(G):- format(user_error,'~N% ~p ~n',[G]),flush_output(user_error).

/*****************************************************************
  Write Java
*****************************************************************/
write_java0(X, _) :- var(X), !,
	am2j_error([unbound,variable,is,found]),
	fail.
write_java0([], _) :- !.
write_java0([X|Xs], In) :- !,
	write_java0(X, In),
	write_java0(Xs, In).
write_java0(end_predicate(_, _), _) :- !,
	tab(4),
	nop((w('}'), nl)),
	w('}'), nl,
        !.
write_java0(comment(Comment), _) :- !,
	numbervars(Comment, 0, _),
	tab(4),
	w('// '),
	writeq( Comment), nl.
write_java0(debug(Comment), _) :- !,
	numbervars(Comment, 0, _),
	w('// '),
	writeq( Comment), nl.
write_java0(info([FA,File|_]), _) :- !,
        wl(['/** PREDICATE: ',wr(FA),'\nfrom: ',wr(File),'\n*/']),nl.
write_java0(import_package(P), _) :- !,
	nop((w('// import '),maybe_write_package(P,''), w('.*;'), nl)).
write_java0(import_static(P,F), _) :- !,
	w('// import static '),
	write_package(P),
	w('.'),
	w(F),
    w(';'), nl.
write_java0(import_package(P,FA), _) :- !,
	nop((w('// import '), write_package(P), w('.'), 
	(FA = _/_ ->
	    write_class_name(FA)
	    ;
	    write_package(FA)
	),
	w(';'))), nl.
write_java0((Label: Instruction), In) :- !,
	write_label(Label),
	write_java0(Instruction, In).
write_java0(label(fail/0), _) :- !,
       nop(( tab(4),
	w('private static final Operation '),
	write_index(fail/0),
	w(' = SxxMachine.Failure.FAIL_0'),
	w(';'), nl)).
write_java0(label(_L), _) :- !.
%	tab(4),
%	w('static final Operation '),
%	write_index(L),
%	w(' = new '),
%	write_class_name(L),
%	w('();'), nl.
write_java0(goto(L), _) :- !,
	tab(8),
	w('return '),
	write_index(L),
	w('(m);'), nl.
write_java0(setB0, _) :- !,
	tab(8),
	w('m.setB0();'), nl.
write_java0(deref(_,void), _) :- !.
write_java0(deref(_,Rj), _):- Rj='@'(Atom),atom(Atom),!.
write_java0(deref(Ri,Rj), _) :- !,
	tab(8),                            
	write_reg(Rj),
	w(' = '),
	write_reg(Ri),
	w('.dref();'), nl.
write_java0(set(_,void), _) :- !.
write_java0(set(cont,econt),_):- !, w('m.cont = cont;'), nl.
write_java0(set(arg(1),ea(1)), _) :- !, nop((w('m.AREGS = LARG;'), nl)).
% BAD write_java0(set(ea(1),a(1)), _) :- !, w('LARG = m.AREGS;'), nl.
write_java0(set(arg(N),ea(N)), _) :- !, nop((w('// m.AREGS = LARG;'+N), nl)).

write_java0(set(Ri,Rj), _) :- !,
	tab(8),
	write_reg(Rj),
	w(' = '),
	write_reg(Ri),
	w(';'), nl.
write_java0(decl_term_vars([]), _) :- !.
write_java0(decl_term_vars(L), _) :- !,
	tab(8),
	w(' Term '), write_reg_args(L), w(';'), nl.
write_java0(decl_pred_vars([]), _) :- !.
write_java0(decl_pred_vars(L), _) :- !,
	tab(8),
	w('Operation '),
	write_reg_args(L),
	w(';'), nl.
write_java0(put_cont(BinG,C), _) :- !,
	(BinG = P:G -> true ; BinG = G),
	functor(G, F, A0),
	A is A0-1,
	G =.. [F|Args],
	tab(8),
	write_reg(C),
	w(' = '),
	while_inside(put_cont,create_call_op(P,F/A,Args)),
        w(';'), nl.

write_java0(execute(cont), _) :- !,
	tab(8),
	w('return cont;'), nl.

write_java0(execute(BinG), _) :- !,
	((BinG = P:G) -> true ; BinG = G),
	functor(G, F, A0),
	A is A0-1,
	G =.. [F|Args],
	tab(8),
	w('return '),
        while_inside(exec_bin,create_call_op(P,F/A,Args)),
	w(';'), nl.
write_java0(inline(G), In) :- !,
	write_inline(G, In),
	!.
write_java0(new_hash(Tag,I), _) :- !,
	tab(4),
	w('private static final java.util.HashMap<Term, Operation> '),
	(Tag == int -> w('Int') ; w(Tag)),
	w(' = new java.util.HashMap<Term, Operation>('),
	w(I),
	w(');'), nl.
write_java0(put_hash(X,L,Tag), _) :- !,
	must((tab(8),
	(Tag == int -> w('Int') ; w(Tag)),
	w('.put('),
	(clause(inlined(X,F/A),_) ->
	    w('SYM('), write_constant_string(F), w(','), w(A), w(')')
	    ;
	    write_reg(X)
	),
	w(', '),
	write_method_ref(L),
	w(');'))), nl.
write_java0(static(Instrs), In) :- !,
	tab(4),
	w('static {'), nl,
	write_java0(Instrs, In),
	tab(4),
	w('}'), nl.
%%% Put Instructions
write_java0(put_var(X), _) :- !,
	tab(8),
	write_reg(X),
	w(' = m.mkvar1();'), nl.

write_java0(G, _) :- once(gleaned_away(G)),!.


write_java0(put_int(I,X), _) :-
	long(I),
	!,
	tab(4),
	w('private static final NumberTerm '),	
        write_as_field_value(I),
        assertz(is_remembered(I,X)),
	w(' = Long('),
	w(I),
	w('L);'),
	nl.

write_java0(put_int(I,X), _) :- !,
	tab(4),
	w('private static final /**/ NumberTerm '),
   %write_as_field_value(I),
        write_reg(X),
         assertz(is_remembered(I,X)),
	w(' = Integer('),
	(java_integer(I) -> true; w('new java.math.BigInteger("')),
	w(I),
	(java_integer(I) -> true; w('")')),
	w(');'), nl.
write_java0(put_float(F,X), _) :- !,
	tab(4),
	w('private static final NumberTerm '),
	write_reg(X),
	w(' = Float('),
	w(F),
	w(');'), nl.
write_java0(put_con(F/A,X), _) :- must(integer(A)),!,assert(inlined(X,F/A)).
%write_java0(put_con(C,X), _) :- is_remembered(C,XX),X==XX,!.
%write_java0(put_con(C,X), _) :- is_remembered(C,XX),nonvar(XX),assertz(aliased_to(X,XX)).
%write_java0(put_con(_,X), _) :- is_aliased(X,_R2),!.

write_java0(put_con(C,X), _) :- atomic(C),must((declare_symbol(X,C))),!.
write_java0(put_con(C,X), _) :- !, must((declare_symbol(X,C))),!.
write_java0(put_list(Xi,Xj,Xk), _) :- !,
	(Xk = s(_) ->
	    tab(4), w('private static final Compound ')
	    ;
	    tab(8)
	),
	write_reg(Xk),
	w(' = CONS('),
	while_inside(unify(c),write_reg(Xi)),
	w(', '),
	write_reg(Xj),
	w(');'), nl.
write_java0(put_str(Xi,Y,Xj), _) :- !,
	((Xj = s(_) ->
	    (tab(4), w('private static final Compound '))
	    ;
	    tab(8)
	)),
	write_reg(Xj),
	w(' = S('),
	(clause(inlined(Xi,F/_A),_) ->
	    (write_constant_string(F))
	    ;
	    write_reg(Xi)
	),
	w(', '),
	write_reg(Y),
	w(');'), nl.
write_java0(put_str_args(Xs,s(Y)), _) :- !,
    assert(inlined(s(Y),str_args(Xs))).
write_java0(put_str_args(Xs,Y), _) :- 
	(Y = s(_) ->
	    tab(4), w('private static final ')
	    ;
	    tab(8)
	),
	w('Term[] '),
	write_reg(Y),
	w(' = VA('),
	write_reg_args(Xs),
	w(');'), nl.
write_java0(put_clo(G0, X), _) :- !,
	(G0 = P:G -> true ; G0 = G),
	functor(G, F, A),
	G =.. [F|Args0],
	am2j_append(Args0, ['null'], Args),
	tab(8),
	write_reg(X),
	w(' = Closure( '),
        while_inside(put_clo,create_call_op(P,F/A,Args)),
	w(');'), nl.
%%% Get Instructions
write_java0(get_val(Xi,Xj), _) :- !,
	tab(8),
	w('if (! '), write_reg(Xi), w('.unify('),
	write_reg(Xj), w(', m.trail))'), nl,
	tab(12),
	w('return m.fail();'), nl.
write_java0(get_int(_,Xi,Xj), In) :- !,
	write_java0(get_val(Xi, Xj), In).
/*
write_java0(get_int(N,Xi,Xj), In) :- !,
	write_java0(deref(Xj,Xj), In),
	% read mode
	tab(8),
	w('if ('), write_reg(Xj), w(' .isInteger() || '), write_reg(Xj), w(' .isLong()){'), nl,
	tab(12),
	w('if (((NumberTerm) '), write_reg(Xj), w(').intValue() != '),
	w(N), w(')'), nl,
	tab(16),
 	w('return m.fail();'), nl,
	% w mode
	tab(8),
	w('} else if ('), write_reg(Xj), w('.isVar()){'), nl,
	tab(12),
	w('((Var) '), write_reg(Xj), w(').bind('),
	write_reg(Xi), w(', m.trail);'), nl,
	tab(8),
	% otherwise fail
 	w('} else {'), nl,
	tab(12),
 	w('return m.fail();'), nl,
	tab(8),
 	w('}'), nl.
*/
write_java0(get_float(_,Xi,Xj), In) :- !,
	write_java0(get_val(Xi, Xj), In).
/*
write_java0(get_float(N,Xi,Xj), In) :- !,
	write_java0(deref(Xj,Xj), In),
	% read mode
	tab(8),
	w('if ('), write_reg(Xj), w(' .isDouble()){'), nl,
	tab(12),
	w('if (((NumberTerm) '), write_reg(Xj), w(').doubleValue() != '),
	w(N), w(')'), nl,
	tab(16),
 	w('return m.fail();'), nl,
	% w mode
	tab(8),
	w('} else if ('), write_reg(Xj), w('.isVar()){'), nl,
	tab(12),
	w('((Var) '), write_reg(Xj), w(').bind('),
	write_reg(Xi), w(', m.trail);'), nl,
	tab(8),
	% otherwise fail
 	w('} else {'), nl,
	tab(12),
 	w('return m.fail();'), nl,
	tab(8),
 	w('}'), nl.
*/
write_java0(get_con(_,Xi,Xj), In) :- !,
	write_java0(get_val(Xi, Xj), In).

/*
write_java0(get_con(_,Xi,Xj), In) :- !,
	write_java0(deref(Xj,Xj), In),
	% read mode
	tab(8),
	w('if ('), write_reg(Xj), w(' .isAtom()){'), nl,
	tab(12),
	w('if (! '),
	write_reg(Xj), w('.equals('), write_reg(Xi),
	w('))'), nl,
	tab(16),
 	w('return m.fail();'), nl,
	% w mode
	tab(8),
	w('} else if ('), write_reg(Xj), w('.isVar()){'), nl,
	tab(12),
	w('((Var) '), write_reg(Xj), w(').bind('),
	write_reg(Xi), w(', m.trail);'), nl,
	tab(8),
	% otherwise fail
 	w('} else {'), nl,
	tab(12),
 	w('return m.fail();'), nl,
	tab(8),
 	w('}'), nl.
 */
write_java0(get_ground(_,Xi,Xj), In) :- !,
	write_java0(get_val(Xi, Xj), In).
write_java0(get_list(X), In) :- !,	
	read_instructions(2, In, Us),
        write_java0(after_get_list(X,Us), In),!.

write_java0(after_get_list(X,Us), In) :- !,
        write_java0(deref(X,X), In),
	% read mode
	tab(8),
	w('if ('), write_reg(X), w(' .isCons()){'), nl,
	tab(12),
 /*
	w('Term[] argz = VA('),
	write_reg(X), w('.car(), '),
	write_reg(X), w('.cdr());'), nl, 
*/
	while_inside(cons(X),write_unify_read(Us, 0)),
	% w mode
	tab(8),
	w('} else if ('), write_reg(X), w('.isVar()){'), nl,
	write_unify_write(Us, Rs),
	tab(12),
	w(' '), write_reg(X), w('.bind(CONS('),
	write_reg_args(Rs), w('), m.trail);'), nl,
	% otherwise fail
	tab(8),
 	w('} else {'), nl,
	tab(12),
 	w('return m.fail();'), nl,
	tab(8),
 	w('}'), nl.
write_java0(get_str(F/A,Xi,Xj), In) :- !,        
	read_instructions(A, In, Us),
        write_java0(after_get_str(F/A,Xi,Xj,Us), In).

write_java0(after_get_str(_F/_A,Xi,Xj,Us), In) :- !,
        write_java0(deref(Xj,Xj), In),
	% simple unify
	write_unify_write(Us, Rs),
        tab(12),
    	w('if (!'), write_reg(Xj), w('.unifyS('),
    	write_reg(Xi), w(', m.trail, '),  while_inside(unify(s),write_reg_args(Rs)), w(')){'), nl,
	    tab(16),
 	    w('return m.fail();'), nl,                 
	    tab(12),
 	    w('}'), nl.



%%% Choice Instructions
write_java0(try(Li,Lj), _) :- !,
	clause(current_arity(A), _),
	tab(8),
	w('m.jtry'),
	( A =< 8 ->
		w(A), w('(')
		;
		w('('), w(A), w(', ')
	),
	w('null, '),
	write_method_ref(Lj),
	w(');'), nl,
	tab(8),
	w('return '), write_index(Li), w('(m);'), nl.
write_java0(retry(Li,Lj), _) :- !,
	tab(8),
	w('m.retry(null, '),
	write_method_ref(Lj),
	w(');'), nl,
	tab(8),
	w('return '), write_index(Li), w('(m);'), nl.
write_java0(trust(L), _) :- !,
	tab(8),
	w('m.trust(null);'), nl,
	tab(8),
	w('return '), write_index(L), w('(m);'), nl.
%%% Indexing Instructions
write_java0(switch_on_term(Lv,Li,Lf,Lc,Ls,Ll), _) :- am2j_flag(no_switch_on_term_inline),!,
   tab(8),
   w('return m.switch_on_term('),
      write_method_ref(Lv),w(', '),
      write_method_ref(Li),w(', '),
      write_method_ref(Lf),w(', '),
      write_method_ref(Lc),w(', '),
      write_method_ref(Ls),w(', '),
      write_method_ref(Ll),w('); '),
      nl.
% unless no_switch_on_term_inline 
write_java0(switch_on_term(Lv,Li,Lf,Lc,Ls,Ll), _) :- !,
	tab(8),
	w('{'), write_inline_start('switch_on_term'), nl,
	tab(12),
	w('Term x = m.areg1.dref();'),nl,
    write_if_method_call('x .isVar()', Lv),
    write_if_method_call('x .isCons()', Ll),
    write_if_method_call('x .isStructure()', Ls),
    write_if_method_call('x .isAtom()', Lc),
    write_if_method_call('x .isInteger()', Li),
    write_if_method_call('x .isConst()', Lf),   
    tab(12),
    w('return '), write_index(Lv), w('(m);'), nl,
	tab(8),
	w('}'), write_inline_end('switch_on_term'), nl.

write_java0(switch_on_hash(Tag,_,L, _), _) :- !,
	tab(8),
	w('return m.switch_on_hash('),
	(Tag == int -> w('Int') ; w(Tag)),
	w(', '),
	write_method_ref(L), w(').exec(m);'), nl.
write_java0(Instruction, _) :-
	am2j_error([Instruction,is,an,invalid,instruction0]),
	fail.

:- dynamic(inside_params/1).
while_inside(In,Goal):-
  setup_call_cleanup(
   asserta(inside_params(In),AH), call(Goal),  erase(AH)).

is_sys_pred(call/1).
is_sys_pred(nl/0).
is_sys_pred(integer/1).
is_sys_pred(compound/1).
is_sys_pred(copy_term/2).


is_sys_pred(copy_term_nat/2,sxxtensions).
is_sys_pred(copy_term_att/2,sxxtensions).
is_sys_pred(copy_term/3,sxxtensions).
is_sys_pred(F/_,sxxtensions):- atom_concat('nb_',_,F),!.
is_sys_pred(freeze/2,sxxtensions).
is_sys_pred(frozen/2,sxxtensions).
%is_sys_pred(call/N,'FILE_callN'):- N>1.
is_sys_pred(compare/3,'FILE_builtins').
is_sys_pred(is/2,'FILE_builtins').
is_sys_pred(catch/3,'FILE_builtins').



is_file_pred(F/_):- atom_concat('$dummy',_,F),!.
is_file_pred(FA):- is_sys_pred(FA),!,fail.
is_file_pred(F/_):- atom_concat('$',_,F),!,fail.
is_file_pred(_).

create_call_op(_P,fail/0,_Args):- 
  w('fail_0'),!.
create_call_op(_P,true/0,_Args):- 
  w('cont'),!.

create_call_op(_P,fail/0,Args):- 
  w('//\n Op(fail_0, VA('),write_reg_args_last_paren(Args),w(')'),!.


create_call_op(_P,(':')/2,[M,Call]):- functor(Call,F,A),Call=..[_|Args],!,create_call_op(M,F/A,Args).

create_call_op(_P,F/A,Args):- is_sys_pred(F/A,Where),!,
  w('//\n Op('),
  w('"'),w(F),w('", '),
  maybe_write_package(Where,'::'),
  write_class_name(F/A),
  w('_static_exec, VA('),
  write_reg_args_last_paren(Args),w(')'),!.

create_call_op(_P,F/A,Args):-
  w('//\n Op('),
  w('"'),w(F),w('", '),
  write_invoke_from_classname(F/A),w('::'),
  write_class_name(F/A), 
  w('_static_exec, VA('),
  write_reg_args_last_paren(Args),w(')'),!.


create_call_op(P,F/A,Args):- !,
  w('//\n Op('),maybe_write_package(P,'.'),write_file_classname(F/A),w('::'),write_class_name(F/A),
  w('_static_exec'),w(', VA('),write_reg_args_last_paren(Args),w(')'),!.

create_call_op(P,F/A,Args):- is_file_pred(F/A),!,
  w('//\n Op('),maybe_write_package(P,'.'),write_file_classname(F/A),w('::'),write_class_name(F/A),
  w('_static_exec'),w(', VA('),write_reg_args_last_paren(Args),w(')'),!.

create_call_op(P,F/A,Args):- 
  w('//\n Op('),maybe_write_package(P,'.'),write_class_name(F/A),
  w('::static_exec'),w(', VA('),write_reg_args_last_paren(Args),w(')'),!.

create_call_op(P,F/A,Args):- 
  w('new '),
  (nonvar(P) -> write_package(P), w('.') ; true),
  write_class_name(F/A),
  w('('),write_reg_args(Args),w(')'),!.


maybe_write_package(P,With):- (nonvar(P) -> (write_package(P), w(With)) ; true),!.

:- dynamic(declared_class_name/1).


write_repeat(A,Atom):- forall(between(1,A,_),w(Atom)).
/*****************************************************************
  Write Label
*****************************************************************/
write_label(main(F/A, Modifier)) :- !,
	% Import class constants within translation unit
     %  nop(( clause(current_package(_P), _), nl)),
%	w('import static '), write_package(P), w('.'),
%	write_class_name(F/A), w('.*;'),
%	nl,
   % Class premptive loader
        %wl(['static { ',write_system_predicate(F/A),'}']),
	% Class definition
	
        assert(declared_class_name(F/A)),
	nop( (((Modifier == (public) -> w('public ') ; true),w('final static class '),write_class_name(F/A), w(' extends '), write_predicate_base_class(A), 
           w(' {'), nl))).
write_label(F/A) :- !,
	% instance variable declaration
	(A > 4 ->
	    nl,
	    write_enum('// private final Term ', arg, 5, A, ', ', ';', 4), nl
	    ;
	    true
	),
	% constructor
	nl,
	% toString method
	nl,
	write_to_string(F/A), nl,	
	% exec method
	nl,	
	nop((tab(4), w('@Override'), nl,tab(4), w('public Operation exec(Prolog m) {               
        push_to_machine(m);
        return static_exec(m);
    }'),nl)),
    tab(4),
    wl(['public static Operation ',(write_class_name(F/A)),'_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  ']), nl.
write_label(L) :-
	tab(4),
	w('}'), nl,
	nl,
	% method for control instructions and clauses
	tab(4),
	w('private final static Operation '),
    write_index(L),
	w('(Prolog m) { '), nl, !.
write_label(Instruction) :-
	am2j_error([Instruction,is,an,invalid,instruction,label]),
	fail.

/*****************************************************************
  Write Constructor
*****************************************************************/
write_constructors_and_all(F/A):-
   write_constructor1(F/A),nl,
   write_constructor2(F/A),nl,
   %write_constructor3(F/A),nl,
   !.
write_constructor1(F/A) :-
	tab(4), w('public '),
	write_class_name(F/A), w('(Term[] az, Operation cont) {'), nl,
	tab(8), w('this.LARG = az;'), nl,
        tab(8), w('this.cont = cont;'), nl,
	tab(4),
	w('}'),nl,

	/*tab(4), w('public '),
	write_class_name(F/A), w('(Operation cont, Term... az) {'), nl,
	tab(8), w('this.LARG = az;'), nl,
        tab(8), w('this.cont = cont;'), nl,
	tab(4),
	w('}').*/
        !.

write_constructor2(F/A) :-
	tab(4), w('public '),
	write_class_name(F/A), w('('),
	(A > 0 ->
	    write_enum('', 'Term a', 1, A, ', ', ', ', 0)
	    ;
	    true
	),
	w('Operation cont) {'), nl,
        (A > 0 -> 
          (tab(8), w('this(VA('),write_enum('', 'a', 1, A, ', ', '/**/ ', 0), w('),cont);'), nl);
          (tab(8), w('this(VA(),cont);'), nl)),
        tab(4), w('}').


write_constructor3(F/A) :-
	tab(4), w('public '),
	write_class_name(F/A), w('('),
	(A > 0 ->
	    write_enum('', 'Term a', 1, A, ', ', ', ', 0)
	    ;
	    true
	),
	w('Operation cont) {'), nl,
	A > 0,
	for(I, 1, A),
	    tab(8),
	    w('this.'), w(arg), w(I),
	    w(' = '),
	    w(a), w(I),
	    w(';'),  nl,
	fail.
write_constructor3(_) :-
	tab(8),
	w('this.cont = cont;'), nl,
	tab(4),
	w('}').

write_enum(Head, Sym, SN, EN, Delim, _, Tab) :-
	SN =< EN,
	tab(Tab),
	w(Head),
	for(I, SN, EN),
	    w(Sym),
	    w(I),
	    (I < EN -> w(Delim) ; true),
	fail.
write_enum(_, _, SN, EN, _, Tail, _) :-
	SN =< EN,
	w(Tail).

/*****************************************************************
  Write Unify Instructions
*****************************************************************/
%%% Read Mode
write_unify_read([], _) :- !.
write_unify_read([unify_void(I)|Xs], N) :- !,
	N1 is N+I,
	write_unify_read(Xs, N1).
write_unify_read([X|Xs], N) :-
	write_unify_r(X, N),
	N1 is N+1,
	write_unify_read(Xs, N1).

write_unify_r(X, _) :- var(X), !,
	am2j_error([unbound,variable,is,found]),
	fail.
write_unify_r(unify_var(X), N) :- !,
	tab(12),
	write_reg(X),
	w(' = '),
	write_reg(argz(N)),
	w(';'), nl.
write_unify_r(unify_val(X), N) :- !,
	tab(12),
	w('if (! '),
	write_reg(X),
	w('.unify('),
	write_reg(argz(N)),
	w(', m.trail))'), nl,
	tab(16),
	w('return m.fail();'), nl.
write_unify_r(unify_int(_,X), N) :- !,   %???
	write_unify_r(unify_val(X), N).
write_unify_r(unify_float(_,X), N) :- !, %???
	write_unify_r(unify_val(X), N).
write_unify_r(unify_con(_,X), N) :- !,   %???
	write_unify_r(unify_val(X), N).
write_unify_r(unify_ground(_,X), N) :- !,
	write_unify_r(unify_val(X), N).
write_unify_r(X, _) :-
	am2j_error([X,is,an,invalid,instruction_r]),
	fail.

%%% Write Mode
write_unify_write([], []) :- !.
write_unify_write([unify_void(0)|Xs], Rs) :- !,
	write_unify_write(Xs, Rs).
write_unify_write([unify_void(I)|Xs], [void|Rs]) :-
	I > 0,
	!,
	I1 is I-1,
	write_unify_write([unify_void(I1)|Xs], Rs).
write_unify_write([X|Xs], [R|Rs]) :-
	write_unify_w(X, R),
	write_unify_write(Xs, Rs).

write_unify_w(X, _) :- var(X), !,
	am2j_error([unbound,variable,is,found]),
	fail.
write_unify_w(unify_var(X), X) :- !,
	tab(12),
	write_reg(X),
	w(' = m.mkvar2();'), nl.
write_unify_w(unify_val(X), X) :- !.
write_unify_w(unify_int(_,X), X) :- !.
write_unify_w(unify_float(_,X), X) :- !.
write_unify_w(unify_con(_,X), X) :- !.
write_unify_w(unify_ground(_,X), X) :- !.
write_unify_w(X,_) :-
	am2j_error([X,is,an,invalid,instruction_w]),
	fail.

/*****************************************************************
  Write Inline
*****************************************************************/
:- dynamic(has_inlined/1).

write_inline('@'(X), _In) :- has_inlined('@'(X)),!.
write_inline(X, In) :- asserta(has_inlined(X)),
	write_inline_start(X),
	must(write_inline0(X, In)),
	write_inline_end(X),!.

write_inline_start(@(_Goal)) :- !.
write_inline_start(Goal) :-
	tab(8),
	w('//START inline expansion of '), w(Goal), nl.
write_inline_end(@(_Goal)) :- !.
write_inline_end(_) :-
	tab(8),
	w('//END inline expansion'), nl.

% Control constructs
write_inline0(fail, _) :- !,
	tab(8), w('return m.fail();'), nl.
write_inline0('@'(X), _) :- tab(8),w(X),nl,!.
write_inline0('$get_level'(X), _) :- !,
	write_if_fail(op('!',unifyInt(X,'m.B0')), [], 8).
write_inline0('$neck_cut', _)     :- !,
	tab(8), w('m.neckCut();'), nl.
write_inline0('$cut'(X), _)       :- !,
	write_deref_args([X]),
	tab(8),
       nop(( w('if ('), write_reg(X), w(' .isInteger()) {'), nl)),
	tab(10), % intValue will throw IllegalTypeException on its own if not an Integer
	wl(['m.cut( ', write_reg(X), '.intValue());\n']),
        nop((tab(8),w('} else {'), nl,
         tab(12),w('throw new IllegalTypeException("integer", '),write_reg(X), w(');'), nl,
	tab(8),w('}'), nl)).
% Term unification
write_inline0('$unify'(X,Y), _)         :- !, write_if_fail(op('!', unify(X,Y)), [], 8).
write_inline0('$not_unifiable'(X,Y), _) :- !,must( write_if_fail(unify(X,Y), [], 8)).
% Type testing
write_inline0(var(X), _)     :- !, write_if_fail(op('!', instanceof(X, 'VariableTerm')), [X], 8).
write_inline0(atom(X), _)    :- !, write_if_fail(op('!', instanceof(X, 'AtomTerm')), [X], 8).
write_inline0(integer(X), _) :- !, write_if_fail(op('!', instanceof(X, 'IntegerTerm')), [X], 8).
write_inline0(long(X), _)    :- !, write_if_fail(op('!', instanceof(X, 'LongTerm')), [X], 8).
write_inline0(float(X), _)   :- !, write_if_fail(op('!', instanceof(X, 'DoubleTerm')), [X], 8).
write_inline0(nonvar(X), _)  :- !, write_if_fail(instanceof(X, 'VariableTerm'), [X], 8).
write_inline0(nonvar(X), _)  :- !, write_if_fail(op('!', instanceof(X, 'Nonvar')), [X], 8).
write_inline0(number(X), _) :- !, write_if_fail(op('!', @('isNumber'(X))), [X], 8).
% unused
write_inline0(number(X), _)  :- !,
	NI = op('!', instanceof(X, 'IntegerTerm')),
	NL = op('!', instanceof(X, 'LongTerm')),
	ND = op('!', instanceof(X, 'DoubleTerm')),
	write_if_fail(op('&&', op('&&', NI, ND), NL) , [X], 8).
write_inline0(java(X), _)    :- !, write_if_fail(op('!', instanceof(X, 'JavaObjectTerm')), [X], 8).
write_inline0(closure(X), _) :- !, write_if_fail(op('!', instanceof(X, 'ClosureTerm')), [X], 8).

write_inline0(cons(X), _) :- !, write_if_fail(op('!', @('isCons'(X))), [X], 8).
write_inline0(string(X), _) :- !, write_if_fail(op('!', @('isString'(X))), [X], 8).
write_inline0(atomic(X), _) :- !, write_if_fail(op('!', @('isAtomicValue'(X))), [X], 8).
% unused
write_inline0(atomic(X), _) :- !,
	NS = op('!', instanceof(X, 'AtomTerm')),
	NI = op('!', instanceof(X, 'IntegerTerm')),
	NL = op('!', instanceof(X, 'LongTerm')),
	ND = op('!', instanceof(X, 'ConstTerm')),
	write_if_fail(op('&&', NL, op('&&', NS, op('&&', NI, ND))) , [X], 8).

write_inline0(java(X,Y), _) :- !,       
	write_if_fail(op('!', instanceof(X, 'JavaObjectTerm')), [X], 8),
	EXP = '#'('SYM'(@(getName(@(getClass(@(object(cast('JavaObjectTerm',X))))))))),
	write_if_fail(op('!', unify(Y,EXP)), [], 8).
write_inline0(jinstanceof(X,Y), In) :- !, write_inline0(java(X,Y), In).
write_inline0(ground(X), _) :- !, write_if_fail(op('!', @('isGround'(X))), [X], 8).
% Term comparison
write_inline0('$equality_of_term'(X,Y), _)   :- !, write_if_fail(op('!',@('equalsTerm'(X,Y))), [X,Y], 8).
write_inline0('$inequality_of_term'(X,Y), _) :- !, write_if_fail(@('equalsTerm'(X,Y)), [X,Y], 8).
write_inline0('$after'(X,Y), _)              :- !, write_if_fail(op('<=',@('compareTo'(X,Y)),0), [X,Y], 8).
write_inline0('$before'(X,Y), _)             :- !, write_if_fail(op('>=',@('compareTo'(X,Y)),0), [X,Y], 8).
write_inline0('$not_after'(X,Y), _)          :- !, write_if_fail(op('>', @('compareTo'(X,Y)),0), [X,Y], 8).
write_inline0('$not_before'(X,Y), _)         :- !, write_if_fail(op('<', @('compareTo'(X,Y)),0), [X,Y], 8).
write_inline0('$identical_or_cannot_unify'(X,Y), _) :- !,
	write_if_fail(op('&&', op('!',@('equalsIdentical'(X,Y))), unify(X,Y)), [X,Y], 8).
% Term creation and decomposition
write_inline0(copy_term(X,Y), _) :- nonvar(X), nonvar(Y), !,
	write_if_fail(op('!', unify(Y, '#'('m.copy'(X)))), [X], 8).
% Arithmetic evaluation
write_inline0(is(X,Y), _)                        :- !, write_arith(_,           Y, X, 8).
write_inline0('$abs'(X,Y),  _)                   :- !, write_arith('abs',       X, Y, 8).
write_inline0('$asin'(X,Y), _)                   :- !, write_arith('asin',      X, Y, 8).
write_inline0('$acos'(X,Y), _)                   :- !, write_arith('acos',      X, Y, 8).
write_inline0('$atan'(X,Y), _)                   :- !, write_arith('atan',      X, Y, 8).
write_inline0('$bitwise_conj'(X,Y,Z), _)         :- !, write_arith('and',       X, Y, Z, 8).
write_inline0('$bitwise_disj'(X,Y,Z), _)         :- !, write_arith('or',        X, Y, Z, 8).
write_inline0('$bitwise_exclusive_or'(X,Y,Z), _) :- !, write_arith('xor',       X, Y, Z, 8).
write_inline0('$bitwise_neg'(X,Y), _)            :- !, write_arith('not',       X, Y, 8).
write_inline0('$ceil'(X,Y), _)                   :- !, write_arith('ceil',      X, Y, 8).
write_inline0('$cos'(X,Y), _)                    :- !, write_arith('cos',       X, Y, 8).
write_inline0('$degrees'(X,Y), _)                :- !, write_arith('toDegrees', X, Y, 8).
write_inline0('$exp'(X,Y), _)                    :- !, write_arith('exp',       X, Y, 8).
write_inline0('$float'(X,Y), _)                  :- !, write_arith('toFloat',   X, Y, 8).
write_inline0('$float_integer_part'(X,Y), _)     :- !, write_arith('floatIntPart',   X, Y, 8).
write_inline0('$float_fractional_part'(X,Y), _)  :- !, write_arith('floatFractPart', X, Y, 8).
write_inline0('$float_quotient'(X,Y,Z), _)       :- !, write_arith('divide',    X, Y, Z, 8).
write_inline0('$floor'(X,Y), _)                  :- !, write_arith('floor',     X, Y, 8).
write_inline0('$int_quotient'(X,Y,Z), _)         :- !, write_arith('intDivide', X, Y, Z, 8).
write_inline0('$log'(X,Y), _)                    :- !, write_arith('log',       X, Y, 8).
write_inline0('$max'(X,Y,Z), _)                  :- !, write_arith('max',       X, Y, Z, 8).
write_inline0('$min'(X,Y,Z), _)                  :- !, write_arith('min',       X, Y, Z, 8).
write_inline0('$minus'(X,Y,Z), _)                :- !, write_arith('subtract',  X, Y, Z, 8).
write_inline0('$mod'(X,Y,Z), _)                  :- !, write_arith('mod',       X, Y, Z, 8).
write_inline0('$multi'(X,Y,Z), _)                :- !, write_arith('multiply',  X, Y, Z, 8).
write_inline0('$plus'(X,Y,Z), _)                 :- !, write_arith('add',       X, Y, Z, 8).
write_inline0('$pow'(X,Y,Z), _)                  :- !, write_arith('pow',       X, Y, Z, 8).
write_inline0('$radians'(X,Y), _)                :- !, write_arith('toRadians', X, Y, 8).
write_inline0('$rint'(X,Y), _)                   :- !, write_arith('rint',      X, Y, 8).
write_inline0('$round'(X,Y), _)                  :- !, write_arith('round',     X, Y, 8).
write_inline0('$shift_left'(X,Y,Z), _)           :- !, write_arith('shiftLeft', X, Y, Z, 8).
write_inline0('$shift_right'(X,Y,Z), _)          :- !, write_arith('shiftRight', X, Y, Z, 8).
write_inline0('$sign'(X,Y), _)                   :- !, write_arith('signum',    X, Y, 8).
write_inline0('$sin'(X,Y), _)                    :- !, write_arith('sin',       X, Y, 8).
write_inline0('$sqrt'(X,Y), _)                   :- !, write_arith('sqrt',      X, Y, 8).
write_inline0('$tan'(X,Y), _)                    :- !, write_arith('tan',       X, Y, 8).
write_inline0('$truncate'(X,Y), _)               :- !, write_arith('truncate',  X, Y, 8).
% Arithmetic comparison
write_inline0('$arith_equal'(X,Y), _)      :- !, write_arith_compare('!=', X, Y, 8).
write_inline0('$arith_not_equal'(X,Y), _)  :- !, write_arith_compare('==', X, Y, 8).
write_inline0('$greater_or_equal'(X,Y), _) :- !, write_arith_compare('<',  X, Y, 8).
write_inline0('$greater_than'(X,Y), _)     :- !, write_arith_compare('<=', X, Y, 8).
write_inline0('$less_or_equal'(X,Y), _)    :- !, write_arith_compare('>',  X, Y, 8).
write_inline0('$less_than'(X,Y), _)        :- !, write_arith_compare('>=', X, Y, 8).

write_deref_args([]) :- !.
write_deref_args([s(_)|Xs]) :- !,
	write_deref_args(Xs).
write_deref_args([si(_)|Xs]) :- !, % ???
	write_deref_args(Xs).
write_deref_args([sf(_)|Xs]) :- !, % ???
	write_deref_args(Xs).
write_deref_args([X|Xs]) :-
	write_java0(deref(X,X), _),
	write_deref_args(Xs).

write_if_fail(Cond, Args, Tab) :- must((nonvar(Cond), ground(Args))), !,
	EXP  = if_then(Cond, 'return m.fail()'),
       must(( write_deref_args(Args),
	write_inline_java(EXP, Tab))).

make_arith_arg(E, _) :- var(E), !, fail.
make_arith_arg(E, E) :- E = si(_), !.
make_arith_arg(E, E) :- E = sf(_), !.
%make_arith_arg(E, cast('NumberTerm',E)) :- E = a(_), !. %???
make_arith_arg(E, '#'('Arithmetic.evaluate'(E))).

write_arith(M, E, V, Tab) :-
	make_arith_arg(E, A1),
	nonvar(V),
	(    nonvar(M) -> A0 =.. [M,A1], A = @(A0)
             ;    A = A1
	),
	%EXP  = try_catch(SENT, 'BuiltinException', ['e.goal = this','throw e']),
	EXP = if_then(op('!', unify(V,A)), 'return m.fail()'),
	%write_deref_args([E]),
	write_inline_java(EXP, Tab).

write_arith(M, E1, E2, V, Tab) :-
	nonvar(M),
	make_arith_arg(E1, A1),
	make_arith_arg(E2, A2),
	nonvar(V),
	A0 =.. [M,A1,A2],
	A = @(A0),
	%EXP = try_catch(SENT, 'BuiltinException', ['e.goal = this','throw e']),
	EXP = if_then(op('!', unify(V,A)), 'return m.fail()'),
	%write_deref_args([E1,E2]),
	write_inline_java(EXP, Tab).

write_arith_compare(M, E1, E2, Tab) :-
	nonvar(M),
	make_arith_arg(E1, A1),
	make_arith_arg(E2, A2),
	A0 =.. ['arithCompareTo',A1,A2],
	A = @(A0),
	%EXP = try_catch(SENT, 'BuiltinException', ['e.goal = this','throw e']),
	EXP = if_then(op(M, A, 0), 'return m.fail()'),
	%write_deref_args([E1,E2]),
	write_inline_java(EXP, Tab).

write_inline_java(X, _) :- var(X), !, fail.
write_inline_java([], _) :- !.
write_inline_java([X|Xs], Tab) :- !,
	write_inline_java(X, Tab),
	write_inline_java(Xs, Tab).
write_inline_java(try_catch(TRY,EXCEPT,CATCH), Tab) :- !,
	tab(Tab),
	w('try {'), nl,
	Tab1 is Tab + 4,
	write_inline_java(TRY, Tab1),
	tab(Tab),
	w('} catch ('), w(EXCEPT), w(' e) {'), nl,
	write_inline_java(CATCH, Tab1),
	tab(Tab),
	w('}'), nl.
write_inline_java(if_then(IF, THEN), Tab) :- !,
	tab(Tab),
	w('if ('), write_inline_exp(IF, 0), w(') {'), nl,
	Tab1 is Tab + 4,
	write_inline_java(THEN, Tab1),
	tab(Tab),
	w('}'), nl.
write_inline_java(if_then_else(IF, THEN, ELSE), Tab) :- !,
	tab(Tab),
	w('if ('), write_inline_exp(IF, 0), w(') {'), nl,
	Tab1 is Tab + 4,
	write_inline_java(THEN, Tab1),
	tab(Tab),
	w('} else {'), nl,
	write_inline_java(ELSE, Tab1),
	tab(Tab),
	w('}'), nl.
write_inline_java(X, Tab) :-
	tab(Tab),
	w(X), w(';'), nl.

write_inline_exp(X, _) :- var(X), !, fail.
write_inline_exp([], _) :- !.
write_inline_exp([X], Tab) :- !,
	write_inline_exp(X, Tab).
write_inline_exp([X|Xs], Tab) :- !,
	write_inline_exp(X, Tab),
	w(','),
	write_inline_exp(Xs, 0).
write_inline_exp(bracket(Exp), Tab) :- !,
	tab(Tab),
	w('('),
	write_inline_exp(Exp, 0),
	w(')').
write_inline_exp(op(Op, Exp), Tab) :- !,
	tab(Tab),
	w(Op), w(' '), write_inline_exp(Exp, 0).
write_inline_exp(op(Op, Exp1, Exp2), Tab) :- !,
	tab(Tab),
	write_inline_exp(Exp1, 0),
	w(' '),
	w(Op),
	w(' '),
	write_inline_exp(Exp2, 0).
write_inline_exp(instanceof(Exp,Class), Tab) :-  am2j_flag(istype),
    atom_or_nil_am2j(Class),
    (atom_concat(ShortClass,'Term',Class)->
            true;ShortClass = Class), !,
	tab(Tab),
	w('('),
	write_inline_exp(Exp, 0),
	w(' .is'), w(ShortClass), w('()'),
	w(')').
write_inline_exp(instanceof(Exp,Class), Tab) :- !,
	tab(Tab),
	w('('),
	write_inline_exp(Exp, 0),
	w(' instanceof '), w(Class),
	w(')').
write_inline_exp(cast(Class,Exp), Tab) :- !,
	tab(Tab),
	w('(('), w(Class), w(') '),
	write_inline_exp(Exp, 0), w(')').
write_inline_exp(unifyInt(X,Y), Tab) :- !,
	tab(Tab),
	write_inline_exp(X, 0),
	w('.unifyInt('),
	write_inline_exp(Y, 0),
	w(', m.trail)').
write_inline_exp(unify(X,Y), Tab) :- !,
	tab(Tab),
	write_inline_exp(X, 0),
	w('.unify('),
	write_inline_exp(Y, 0),
	w(', m.trail)').
write_inline_exp('#'(X), Tab) :- !,
	X =.. [F|As],
	tab(Tab),
	w(F), w('('),
	write_inline_exp(As, 0),
	w(')').
write_inline_exp(@(X), _Tab) :- atomic(X),!, w(X).
write_inline_exp(@(X), Tab) :- !,
	X =.. [F|As],
	write_inline_method(F, As, Tab).
write_inline_exp(X, Tab) :- X = s(_), !,
	tab(Tab), write_reg(X).
write_inline_exp(X, Tab) :- X = si(_), !,  % ???
	tab(Tab), write_reg(X).
write_inline_exp(X, Tab) :- X = sf(_), !,  % ???
	tab(Tab), write_reg(X).
write_inline_exp(X, Tab) :- X = a(_), !,
	tab(Tab), write_reg(X).
write_inline_exp(X, Tab) :- X == void, !,  % ???
	tab(Tab), write_reg(X).
write_inline_exp(X, Tab) :-
	tab(Tab), w(X).

write_inline_method(F, _, _) :- var(F), !, fail.
write_inline_method(_, A, _) :- var(A), !, fail.
write_inline_method(F, [A], Tab) :- !,
	tab(Tab),
	write_inline_exp(A, 0),
	w('.'), w(F), w('()').
write_inline_method(F, [A,B], Tab) :-
	tab(Tab),
	write_inline_exp(A, 0),
	w('.'), w(F), w('('),
	write_inline_exp(B, 0), w(')').


/*****************************************************************
  Write Insert
*****************************************************************/
write_insert(X, _) :- var(X), !, fail.
write_insert([], _) :- !.
write_insert([X|Xs], _) :-
	atom_or_nil_am2j(X),
	w(X), nl,
	write_insert(Xs, _).

/*****************************************************************
  Write toString(StringBuilder sb)
*****************************************************************/
write_to_string(_F/_A):- % write_to_string_SB(F/A),
        %tab(4), constant_encoding(F,FC),w('public String predName() { return '),write_constant_string(FC),w(';}'), nl,!,
       % (A>4 -> (tab(4), w('public int predArity() { return '),w(A),w(';}'), nl) ; true),
        %tab(4), predicate_encoding(F, F1),w('public String predNameEnc() { return '),write_constant_string(F1),w(';}'), nl,
        !.

write_to_string_SB(F/A):-
	tab(4), w('@Override'), nl,
	tab(4), w('public void toString(StringBuilder sb) {'), nl,
	%predicate_encoding(F, F1),
        constant_encoding(F,FC),
	tab(8), w('sb.append("'), w(FC),                                            
	( A>0 -> 
		w('(");'), nl,
		write_enum('','arg',1,A,'.toString(sb); sb.append(", "); ','.toString(sb);',8), nl,
		tab(8), w('sb.append(")");'), nl
		;
		w('");'), nl
	),
	tab(4), w('}'), nl.

/*****************************************************************
  Auxiliaries
*****************************************************************/

% Create a directory if missing
mkdirs(Dir) :- exists_directory(Dir), !.
mkdirs(Dir) :-
  file_directory_name(Dir, Parent),
  mkdirs(Parent),
  catch(make_directory(Dir),_,exists_directory(Dir)). % it is ok if we failed to create a directory, because it is already exist

% int
java_integer(X) :- integer(X), -2147483648 =< X, X =< 2147483647.

% Read Instructions
read_instructions(0, _, []) :- !.
read_instructions(N, In, [X|Xs]) :-
	N > 0,
	catch(read_term(In, X, [double_quotes(codes),module('SxxMachine.pl2am')]),E,(wd(E),trace)),
	N1 is N-1,
	read_instructions(N1, In, Xs).

% Write package name
write_package(P) :- !, 
	w(P).

% Write class name
write_class_name(L) :-
	w('PRED_'), write_index(L).

% Write out base class name
write_predicate_base_class(0) :- !, w('Predicate.P0').
write_predicate_base_class(1) :- !, w('Predicate.P1').
write_predicate_base_class(2) :- !, w('Predicate.P2').
write_predicate_base_class(3) :- !, w('Predicate.P3').
write_predicate_base_class(4) :- !, w('Predicate.P4').
write_predicate_base_class(5) :- !, w('Predicate.P5').
write_predicate_base_class(_) :- !, w('Predicate').

% Write method reference
write_method_ref(fail/0):- !,
    write_index(fail/0).
write_method_ref(R):-    
    clause(current_arity(A), _),
    clause(current_functor(F), _),
    ((write_file_classname(F/A),w('::'))),%write_class_name(F/A),
  %  w('_'),
    write_index(R).

% Write if method call for switch_on_term
write_if_method_call(Cond, fail/0):-
    !,
    tab(12),
    w('if ('), w(Cond), w(') {'), nl,
    tab(16),
    w('return m.fail();'), nl,
    tab(12),
    w('}'), nl.

write_if_method_call(Cond, Method):-
    tab(12),
    w('if ('), w(Cond), w(') {'), nl,
    tab(16),
    w('return '), write_index(Method), w('(m);'), nl,
    tab(12),
    w('}'), nl.

% Write label
write_index(F/A) :- !,
	write_pred_spec(F/A).
write_index(L+I) :-
	write_index(L), w('_'), w(I).

% Write constant name
write_constant(X):- is_dict(X), !, w(X).
write_constant(X) :-
	constant_encoding(X, Y),
	w(Y).

% Write predicate specification
write_pred_spec(F/A) :-
	predicate_encoding(F, F1),
	w(F1), w('_'), w(A).

atom_codes_nil_ok(A,C):- A==[],!,C=[91, 93].
atom_codes_nil_ok(A,C):- C == [],!,A=''.
atom_codes_nil_ok(A,C):- A=='',C=[].
atom_codes_nil_ok(A,C):- catch(atom_codes(A,C),_,fail),!.
atom_codes_nil_ok(A,C):- catch(string_codes(A,C),_,fail),!.
atom_codes_nil_ok(A,C):- trace,string_codes(A,C).

% Package name as directory
package_encoding(P, Dir) :-
  atom_codes_nil_ok(P, Chs0),
  package_encoding(Chs0, Chs, []),
  atom_codes_nil_ok(Dir, Chs).

package_encoding([]) --> !.
package_encoding([46|Xs]) --> !, [47], package_encoding(Xs).
package_encoding([X|Xs])  --> !, [X] , package_encoding(Xs).

% Predicate Encoding
predicate_encoding(X, Y) :-
	atom_codes_nil_ok(X, Chs0),
	pred_encoding(Chs0, Chs, []),
	atom_codes_nil_ok(Y, Chs).

pred_encoding([]) --> !.
pred_encoding([X|Xs]) -->
	pred_encoding_char(X),
	pred_encoding(Xs).

pred_encoding_char(X) --> {97 =< X, X =< 122}, !, [X]. % a..z
pred_encoding_char(X) --> {65 =< X, X =<  90}, !, [X]. % A..Z
pred_encoding_char(X) --> {48 =< X, X =<  57}, !, [X]. % 0..9
pred_encoding_char(95) --> !, [95].                    % '_'
pred_encoding_char(36) --> !, [36].                    % '$' ???
pred_encoding_char(X) --> {0 =< X, X =< 65535}, !,
	[36],  % '$'
	pred_encoding_hex(X).
pred_encoding_char(X) -->
	{am2j_error([X,is,an,invalid,character,code]), fail}.

pred_encoding_hex(X) -->
	{int_to_hex(X, [], H)},
	pred_encoding_hex_char(H).

pred_encoding_hex_char([])        --> !, [48,48,48,48]. % 0000
pred_encoding_hex_char([X])       --> !, [48,48,48, X]. % 000X
pred_encoding_hex_char([X,Y])     --> !, [48,48, X, Y]. % 00XY
pred_encoding_hex_char([X,Y,Z])   --> !, [48, X, Y, Z]. % 0XYZ
pred_encoding_hex_char([X,Y,Z,W]) --> !, [ X, Y, Z, W]. % XYZW

int_to_hex(0, H, H) :- !.
int_to_hex(D, H0, H) :-
	R is D mod 16,
	D1 is D//16,
	hex_map(R, R1),
	int_to_hex(D1, [R1|H0], H).

hex_map(10, 65) :- !. % 'A'
hex_map(11, 66) :- !. % 'B'
hex_map(12, 67) :- !. % 'C'
hex_map(13, 68) :- !. % 'D'
hex_map(14, 69) :- !. % 'E'
hex_map(15, 70) :- !. % 'F'
hex_map(X, Y) :- 0 =< X, X =<  9, number_codes(X, [Y]).

% Constant Encoding (especially, escape sequence)
constant_encoding(X, Y) :-
	atom_codes_nil_ok(X, Chs0),
	con_encoding(Chs0, Chs),  %???
	atom_codes_nil_ok(Y, Chs).

con_encoding([], []) :- !.
con_encoding([ 7|Xs], [92, 97|Ys]):- !, con_encoding(Xs, Ys). % \a
con_encoding([ 8|Xs], [92, 98|Ys]):- !, con_encoding(Xs, Ys). % \b
con_encoding([ 9|Xs], [92,116|Ys]):- !, con_encoding(Xs, Ys). % \t
con_encoding([10|Xs], [92,110|Ys]):- !, con_encoding(Xs, Ys). % \n
con_encoding([11|Xs], [92,118|Ys]):- !, con_encoding(Xs, Ys). % \v
con_encoding([12|Xs], [92,102|Ys]):- !, con_encoding(Xs, Ys). % \f
con_encoding([13|Xs], [92,114|Ys]):- !, con_encoding(Xs, Ys). % \r
con_encoding([34|Xs], [92, 34|Ys]):- !, con_encoding(Xs, Ys). % \"
con_encoding([39|Xs], [92, 39|Ys]):- !, con_encoding(Xs, Ys). % \'
con_encoding([92|Xs], [92, 92|Ys]):- !, con_encoding(Xs, Ys). % \\
con_encoding([X|Xs], [X|Ys]):- con_encoding(Xs, Ys).


write_pred_prefix(_):- current_functor(F),current_arity(A),write('L_'),write_index('/'(F,A)),w('_').

write_reg_remembered(X,C):- must((nonvar(C);nonvar(X))),!, write_reg(X),assertz(is_remembered(C,X)).


% Write Register name
write_reg(X) :- var(X), !,
	am2j_error([register,expression,must,not,be,unbound,variable]),
	fail.

write_reg(void) :- inside_params(unify(_)), !, wl(['m.DONT_CARE1()']).
write_reg(void) :- inside_params(exec_bin), !, wl(['m.DONT_CARE2()']).
write_reg(void) :- inside_params(F), !, wl(['m.DONTCARE("',call(w(F)),'")']).
write_reg(void) :- !, w('m.mkvar3()').
write_reg(arg(X)) :- !, w('LARG['), Y is X - 1, w(Y), w(']').
% write_reg(a(X)) :- am2j_flag(arrays), !, w('LARG['), Y is X - 1, w(Y), w(']').
write_reg(ea(X)) :- !, w('m.AREGS['), Y is X - 1, w(Y), w(']').
/*
write_reg(ea(1)) :- !, w('m.areg1').
write_reg(ea(2)) :- !, w('m.areg2').
write_reg(ea(3)) :- !, w('m.areg3').
write_reg(ea(4)) :- !, w('m.areg4').
write_reg(ea(5)) :- !, w('m.areg5').                            \
write_reg(ea(6)) :- !, w('m.areg6').
write_reg(ea(7)) :- !, w('m.areg7').
write_reg(ea(8)) :- !, w('m.areg8').
write_reg(ea(X)) :- !, w('m.aregs['), Y is X - 9, w(Y), w(']').
*/

write_reg(@(X)) :- must(ground(X)),!, wl([' ',X,' ']).
write_reg('#'(execute(M:P))) :- !, functor(P,F,A),A1 is A-1,P=..[_|Args],while_inside(execute,create_call_op(M,F/A1,Args)).
write_reg('#'(execute(P))) :- !, functor(P,F,A),A1 is A-1,P=..[_|Args],while_inside(execute,create_call_op(_M,F/A1,Args)).
write_reg(s(X)) :- not_slash(X),aliased_to(s(X),Val),wl([' ',Val,' ']).%must(write_as_field_value(Val)),!.
write_reg(si(X)) :- not_slash(X),aliased_to(si(X),Val),wl([' ',Val,' ']).%must(write_as_field_value(Val)),!.
write_reg(s(X)) :- clause(inlined(s(X),F/_A),_), !, write_constant_string(F).
write_reg(s(X)) :- clause(inlined(s(X),str_args(Xs)),_), !, must(write_reg_args(Xs)).
write_reg(s(X)) :- !,  write_pred_prefix(_),wl(['s',X]).
write_reg(si(X)) :- !,  write_pred_prefix(_),wl(['s',X]).
%write_reg(si(X)) :- check_if_remembered(Val,si(X)),nonvar(Val),!,must(write_as_field_value(Val)),!.
write_reg(si(X)) :- !, wl(['si',X]). % ???
write_reg(sf(X)) :- !, wl(['sf',X]). % ???
write_reg(y(X)) :- !, wl(['y',X]). % ???
write_reg(p(X)) :- !, wl(['p',X]). % ???
write_reg(a(X)) :- !, wl(['a',X]).

write_reg(econt) :- !, w('m.cont').
write_reg(arg(X)) :- !, wl(['arg',X]).
write_reg(cont) :- !, w(cont).
write_reg(null) :- !, w(null).
% am2j only
write_reg(argz(0)) :- inside_params(cons(From)),!,write_reg(From), w('.car()').
write_reg(argz(1)) :- inside_params(cons(From)),!,write_reg(From), w('.cdr()').
write_reg(args(0)) :- inside_params(cons(From)),!,write_reg(From), w('.car()').
write_reg(args(1)) :- inside_params(cons(From)),!,write_reg(From), w('.cdr()').

write_reg(argz(X)) :- !, w('argz['), w(X), w(']').
write_reg(X) :-
	am2j_error([X,is,an,invalid,register,expression]),
	fail.

not_slash(X):- \+ ground(X),!,fail.
not_slash(X):- compound(X),!,functor(X,'/',2),!,fail.
not_slash(_).

write_as_field_value(X) :- var(X), !,
	am2j_error([write_as_field_value,must,not,be,unbound,variable]),
	fail.
write_as_field_value(s(X)):- !, write_reg(s(X)).
write_as_field_value(a(X)):- !, write_reg(a(X)).
write_as_field_value(si(X)):- !, write_reg(si(X)).
write_as_field_value(sf(X)):- !, write_reg(sf(X)).
write_as_field_value(@(X)):- !, w(X).
write_as_field_value(X):- atom(X),atom_concat('ATOM_',_,X),!, w(X).
write_as_field_value(I):- integer(I),!, (I<0-> (NI is 0-I,wl(['int_neg',NI])); wl(['int_',I])).
write_as_field_value([]):- !, w('Prolog.Nil').


write_reg_args([], _) :- !.
write_reg_args([X]) :- !,
	write_reg(X).
write_reg_args([X|Xs]) :-
	write_reg(X),
	w(', '),
	write_reg_args(Xs).

write_reg_args_last_paren([], _) :- !.
write_reg_args_last_paren([X]) :- !,
	w('), '), write_reg(X).
write_reg_args_last_paren([X,Last]) :- !,
	write_reg(X), w('), '),write_reg(Last).
write_reg_args_last_paren([X|Xs]) :-
	write_reg(X),
	w(', '),
	write_reg_args_last_paren(Xs).

/*****************************************************************
             WAM-BASED INTERMEDIATE INSTRUCTIONS

Put Instructions
================
+  put_var(X)
+  put_int(i, X)
+  put_float(f, X)
+  put_con(f/n, X)
+  put_con(c, X),
+  put_list(Xi, Xj, Xk)
+  put_str(Xi, Y, Xj)
+  put_str_args([Xi,..,Xn], Y)
+  put_clo(p:G, X)

Get Instructions
================
+  get_val(Xi, Xj)
+  get_int(i, Xi, Xj)
+  get_float(f, Xi, Xj)
+  get_con(c, Xi, Xj)
+  get_ground(g, Xi, Xj)
+  get_list(X)
+  get_str(f/n, Xi, Xj)

Unify Instructions
==================
+  unify_var(X)
+  unify_val(X)
+  unify_int(i, X)
+  unify_float(f, X)
+  unify_con(c, X)
+  unify_ground(g, X)
+  unify_void(i)

Choice Instructions
===================
+  try(Li, Lj)
+  retry(Li, Lj)
+  trust(L)

Indexing Instructions
=====================
+  switch_on_term(Lv, Li, Lf, Lc, Ls, Ll)
+  switch_on_hash(TAG, i, L, hashtable)

Other Instructions
==================
+  comment(Message)
+  debug(Message)

+  begin_predicate(p, f/n)
+  end_predicate(p, f/n)

+  import_package(p)
+  import_static(p, f/n)
+  import_package(p, f/n)

+  main(f/n, public): [Instructions]
+  main(f/n, non-public): [Instructions]
+  L: [Instructions]

+  label(L)
+  setB0
+  goto(L)
+  deref(Ri, Rj)
+  set(Ri, Rj)

+  decl_term_vars([R1,...,Rn])
+  decl_pred_vars([R1,...,Rn])

+  put_cont(p:BinG, C)
+  put_cont(BinG, C)
+  execute(p:BinG)
+  execute(BinG)
+  inline(G)

+  new_hash(TAG, i)
+  put_hash(X, L, TAG)

+  static([Instructions])

Notation
********
  X ::= a(i) | S
  Y ::= y(i) | S
  S ::= s(i) | si(i) | sf(i)
  L ::= f/n | f/n+i | f/n+TAG | f/n+TAG+i | f/n+TAG+i+i
  TAG ::= var | int | flo | con | str | lis | top | sub | nil
  BinG ::= C | f(A1,..,An, C)
  G ::= f(A1,..,An)
  A ::= void | X
  C ::= cont | p(N)
  R ::= cont | econt | a(i) | arg(i) | ea(i)

*****************************************************************/

/*****************************************************************
  Utilities
*****************************************************************/
for(M, M, N) :- M =< N.
for(I, M, N) :- M =< N, M1 is M + 1, for(I, M1, N).

%%% print
am2j_error(M) :- am2j_message(user_error, ['***','AM2JAVA','ERROR'|M]),trace.

am2j_message(M) :- am2j_message(user_error, M),am2j_message(user_output, M).


am2j_message(Stream,M):- fresh_line(Stream),must(am2j_message0(Stream,M)).

am2j_message0(Stream,M):- \+ is_list(M),!,format(Stream,'~N% ~p ~n',[M]),flush_output(Stream).
am2j_message0(Stream,[]) :-  nl(Stream), flush_output(Stream).
am2j_message0(Stream,[M|Ms]) :- wd(Stream, M), write(Stream, ' '), am2j_message0(Stream, Ms).

wd(Stream, M):- (atom(M);string(M)),!,write(Stream,M).
wd(Stream, M):- format(Stream,'~p',[M]).

%%% list
am2j_append([], Zs, Zs).
am2j_append([X|Xs], Ys, [X|Zs]) :- am2j_append(Xs, Ys, Zs).

flatten_list_am2j([]) --> !.
flatten_list_am2j([L1|L2]) --> !, flatten_list_am2j(L1), flatten_list_am2j(L2).
flatten_list_am2j(L) --> [L].

list_to_string_am2j(List, String) :-
	list_to_chars_am2j(List, Chars0),
	flatten_list_am2j(Chars0, Chars, []),
	atom_codes_nil_ok(String, Chars).

list_to_chars_am2j([], []) :- !.
list_to_chars_am2j([L|Ls], [C|Cs]) :- atom_or_nil_am2j(L), !,
	atom_codes_nil_ok(L, C),
	list_to_chars_am2j(Ls, Cs).
list_to_chars_am2j([L|Ls], [C|Cs]) :- number(L), !,
	number_codes(L, C),
	list_to_chars_am2j(Ls, Cs).

% END
% written by SICStus Prolog 3.12.8
:- dynamic(wrote_system_predicate/2).
wrote_system_predicate(('/'), 2).

write_system_predicate(F/A):- wrote_system_predicate(F,A),!.
write_system_predicate(F/A):- !,
 constant_encoding(F,FC), predicate_encoding(F, F1),
     assert(wrote_system_predicate(F,A)),
     w('   PredTable.registerBuiltin('),
     write_constant_string(FC),w(','),
     ( F1\==FC -> ((write_constant_string(F1),w(',')));true),
     w(A),w(','),
     ((write_file_classname(F/A),w('::'))),write_class_name(F/A), w('_static_exec);'),nl,!.   

write_system_predicate(P):- functor(P,F,A),write_system_predicate(F/A).


write_invoke_from_classname(F/A):- 
   input_file_name(Name),
   file_base_name(Name,BaseExt),
   file_name_extension(Base,_Ext,BaseExt),
   file_to_base_class(Base,Sxx),
   (Sxx=='FILE_system' -> write_file_classname(F/A); w('FILE_system')).

write_file_classname(_F/_A):- input_file_name(Name),w('FILE_'),
 file_base_name(Name,BaseExt),file_name_extension(Base,_Ext,BaseExt),
  w(Base).
write_file_classname(_).

sp :- 
  w(' static { '),
  forall(system_predicate(P);builtin_inline_predicates(P),write_system_predicate(P)),
  forall(builtin_local_predicates(F,A,_);builtin_meta_predicates(F,A,_),write_system_predicate(F/A)),
  w(' } ').
/*
:- 

assert((member(X,[X|_]))), assert((member(X,[Y|T]) :- member(X,T))).

member(X,[1,2,3,4]).

*/

wl([]) .
wl([X|R]) :- !, wl(X) , wl(R) .
wl(X) :- wr(X),!.

wln(X):- wl(X),nl.

wl(X,Y):-wl(X),wl(Y).
wl(X,Y,Z):-wl(X),wl(Y),wl(Z).
wl(C,X,Y,Z):-wl(C),wl(X),wl(Y),wl(Z).
wl(B,C,X,Y,Z):-wl(B),wl(C),wl(X),wl(Y),wl(Z).
wl(A,B,C,X,Y,Z):-wl(A),wl(B),wl(C),wl(X),wl(Y),wl(Z).

w(W):- write(W).

wr(Var):- var(Var),!,throw(var_wr(Var)).
wr(@(Atom)) :- ! , w(Atom).
wr(wr(nl)) :- ! , nl .
wr(wr(Atom)) :- ! , w(Atom).
wr(getval(Var)) :- must((nb_current(Var,Value), w(Value))).
wr(Goal) :- \+ callable(Goal),!, w(Goal) .
wr(Atom) :- atomic(Atom) , !, w(Atom) .
wr(VAR) :-  legacy_functor(VAR,'$VAR',_) , ! , w(VAR) .
wr(Goal) :- must(call(Goal)),! .

wrargs(N,T) :- wrargs(N,T,_) .

wrargs(N,_,_) :- N = 0 , ! .
wrargs(N,T,Komma) :- 
		(var(Komma) -> Komma = yes ; w(',') ) ,
		wl([T,a,N]) ,
		M is N - 1 , 
		wrargs(M,T,Komma) .


declare_symbol(X,C):-
	tab(4),
	w('private static final Functor '),        
	write_reg_remembered(X,C),
	w(' = SYM('),
	(C = F/A ->
	    write_constant_string(F), w(', '), w(A), w(');')
	    ;
	    write_constant_string(C), w(');')
	),
	nl.

   symbol_to_name(NIL,'Prolog.Nil'):- NIL == [],!.
   symbol_to_name(Atom/A,Out):- atom(Atom),integer(A),!,symbol_to_name_A(Atom,SName),!,atomic_list_concat(['FUNCTOR_',SName,'_',A],Out).
   symbol_to_name(Atom,Out):- atom(Atom),symbol_to_name_A(Atom,SName),!,atom_concat('ATOM_',SName,Out).
   symbol_to_name(I,Var):- integer(I),!, (I<0-> (NI is 0-I,atom_concat('int_neg',NI,Var)); atom_concat('int_',I,Var)).

   symbol_to_name_A(Atom,Out):- symbol_to_name1(Atom,Out),!.
   symbol_to_name_A(Name,Name).

   /*
   symbol_to_name1((':-'),'system_neck').
   symbol_to_name1(('=..'),'system_univ').
   symbol_to_name1(('=@='),'system_variant').
   symbol_to_name1(('\\+'),'system_not').
   symbol_to_name1(('\\='),'system_notequals').
   symbol_to_name1(('='),'system_equals').
   symbol_to_name1(('=='),'strict_eq').
   symbol_to_name1(('\\=='),'strict_noteq').
   symbol_to_name1(('-->'),'dcg_arrow').
   symbol_to_name1(('->'),'if_then_arrow').
   symbol_to_name1(('*->'),'with_each_arrow').
   symbol_to_name1((','),'system_comma').
   symbol_to_name1(('^'),'system_carrot').
   symbol_to_name1(('|'),'system_bar').
   symbol_to_name1((':'),'system_colon').





   */
 
   symbol_to_name1((';'),'or'):-!.
   symbol_to_name1((':'),'module_colon'):-!.
   symbol_to_name1(('[]'),'Nil'):-!.
   symbol_to_name1(S,O):- functor(P,S,2),specialgoal(P,PP),functor(PP,O,_),!.
   symbol_to_name1(S,O):- functor(P,S,1),specialgoal(P,PP),functor(PP,O,_),!.
   symbol_to_name1(A,B):- symbol_to_name2(A,B),!.

   symbol_to_name2('',''):-!.

   symbol_to_name2(Atom,Out):- name(Atom,[36, 48, 48, A,B|Rest]),name(Mid1,[36, 48, 48, A,B]),!,
      name(NAtom,Rest),symbol_to_name2(NAtom,Mid2),atom_concat(Mid1,Mid2,Out).

   symbol_to_name2(Atom,Out):- name(Atom,[C|Rest]), \+ code_type(C,alnum), C\==95,!,
      format(atom(Mid1),'$~|~`0t~16R~4+', [C]), 
      name(NAtom,Rest),symbol_to_name2(NAtom,Mid2),atom_concat(Mid1,Mid2,Out).

   symbol_to_name2(Atom,Out):- name(Atom,[C|Rest]),name(Mid1,[C]),name(NAtom,Rest),
     symbol_to_name2(NAtom,Mid2),atom_concat(Mid1,Mid2,Out).



   % the following are also in someprolog at the moment
   specialgoal((X;Y) , or(X,Y)) :- ! .
/*
   specialgoal(X < Y , smallerthan(X,Y)) :- ! .
   specialgoal(X =< Y , smallerorequal(X,Y)) :- ! .
      specialgoal(X > Y , greaterthan(Y,X)) :- ! .
      specialgoal(X >= Y , greaterorequal(Y,X)) :- ! .
   specialgoal(X =:= Y , arithequal(Y,X)) :- ! .
   specialgoal(X = Y , unify(Y,X)) :- ! .
   specialgoal(X @< Y , termsmallerthan(X,Y)) :- ! .
   specialgoal(X @> Y , termgreaterthan(X,Y)) :- ! .
   specialgoal(X @=< Y , termsmallerequal(X,Y)) :- ! .
   specialgoal(X @>= Y , termgreaterequal(X,Y)) :- ! .
   specialgoal(X == Y , termequal(X,Y)) :- ! .
   %specialgoal(\+(X) , not(X)) :- ! .
*/

write_constant_string(F):- must((w('"'), write_constant(F), w('"'))).

input_file_name(File):- arg_flag('--plfile',X),prolog_file_name(X,File).

arg_flag(F,X):- current_prolog_flag(argv,List),append(_,[F,X|_],List),!.
arg_flag(F,X):- current_prolog_flag(os_argv,List),append(_,[F,X|_],List),!.

prolog_file_name(File,X):-
    expand_file_search_path(File,XX),absolute_file_name(XX,X,[expand(true),access(read),file_type(prolog)]).

file_package_name(File,Dir):- file_directory_name(File, DirAll),directory_file_path(_,Dir,DirAll).
bi:- 
   told,
   input_file_name(Name),
   arg_flag('--dir',Dir),
   file_base_name(Name,BaseExt),
   file_name_extension(Base,_Ext,BaseExt),
   file_package_name(Name,P),
   file_to_base_class(Base,Sxx),!,
   atomic_list_concat([Dir,'/',P,'/SxxMachine/'],'',ToDir),
   make_directory_path(ToDir),
   wln(make_directory_path(ToDir)),
   atomic_list_concat([ToDir,'FILE_',Base,'.java'],'',ToFile),
   tell(ToFile),
   wln(['package SxxMachine;']),
   wln(' '),
   wln('import java.io.*;'),
   wln('import java.lang.reflect.*;'),
   wln('import java.nio.charset.Charset;'),
   wln('import java.util.*;'),
   wln('import java.util.concurrent.locks.*;'),
   wln('import java.util.logging.*;'),
   %wln('import java.util.regex.*;'),
   wln('import static SxxMachine.bootpreds.*;'),
   wln('import static SxxMachine.bootpreds.LEVELS;'),
   wln('import static SxxMachine.FILE_builtins.*;'),
   wln('import static SxxMachine.FILE_cafeteria.*;'),
   wln('import static SxxMachine.FILE_io.*;'),
   wln('import static SxxMachine.FILE_swi_supp.*;'),
   wln('import static SxxMachine.FILE_system.*;'),
   wln('import static SxxMachine.sxxtensions.*;'),
   wln('import static SxxMachine.Failure.*;'),
   wln('import static SxxMachine.Predicate.*;'),
   wln('import static SxxMachine.Prolog.*;'),
   wln('import static SxxMachine.Success.*;'),
   wln('import static SxxMachine.pterm.TermData.*;'),
   wln('import SxxMachine.*;'),
   wln('import SxxMachine.pterm.*;'),
   wln('import SxxMachine.bootpreds.*;'),
   wln('import SxxMachine.bootpreds.PRED_$begin_exception_1;'),
   wln('import SxxMachine.bootpreds.PRED_$begin_sync_2;'),
   wln('import SxxMachine.bootpreds.PRED_$builtin_member_2;'),
   wln('import SxxMachine.FILE_builtins.*;'),
   wln('import SxxMachine.sxxtensions.*;'),
   wln('@SuppressWarnings("unused")'),
  wln(['public class FILE_',Base,' extends ',Sxx,' {']),
  pl2j(Name),
  wln('static { loadPreds(); }\nstatic public void loadPreds() {'),
  forall(declared_class_name(F/A),write_system_predicate(F/A)),
  wln('}'),wln('}'),
  told,halt.

file_to_base_class('system','FILE_swi_supp').
file_to_base_class('swi_supp','FILE_io').
file_to_base_class('io','FILE_cafeteria').
file_to_base_class('cafeteria','FILE_builtins').
file_to_base_class('builtins','bootpreds').
file_to_base_class('bootpreds', 'sxxtensions').
file_to_base_class(I,B):- atom_concat('FILE_',BASE,I),!,file_to_base_class(BASE,B).
file_to_base_class(_, 'FILE_system').

:- bi.

