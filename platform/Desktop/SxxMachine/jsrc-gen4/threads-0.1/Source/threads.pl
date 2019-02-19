%  Preprocessor for Prolog programs using Logical State Threads.
%  Version: Winter 96/97
%
%  ----------------------------------------------------------------------------
%  Copyright (C) 1989 1996 Peter Van Roy and Regents of the University
%  of California and Andreas Kagedal. 
%
%  This library is free software; you can redistribute it and/or
%  modify it under the terms of the GNU Library General Public
%  License as published by the Free Software Foundation; either
%  version 2 of the License, or (at your option) any later version.
%
%  This library is distributed in the hope that it will be useful,
%  but WITHOUT ANY WARRANTY; without even the implied warranty of
%  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
%  Library General Public License for more details.
%
%  You should have received a copy of the GNU Library General Public
%  License along with this library; if not, write to the Free
%  Software Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
%  You can also look for it on its  official Gnu WWW page:
%  http://www.gnu.ai.mit.edu/copyleft/lgpl.html
%  ----------------------------------------------------------------------------
%
%  Comments, suggestions, flames, manifestos, and bug reports are 
%  most welcome. Please send to:
%
%       Andreas Kagedal <andka@ida.liu.se>
%   or        
%       Peter Van Roy <pvr@info.ucl.ac.be>


:- module( threads, [] ).

:- use_module(library(versions)).

:- op(1200, xfx, ['-->>']).   % Same as ':-'.
:- op(1200, xfx, [':--' ]).   % Same as ':-'.
:- op( 850, xfx, ['::'  ]).   % Slightly tighter than ',' and '\+'.
:- op( 850, xfy, [ with ]).   % Slightly tighter than ',' and '\+'.
:- op( 500, xfy, [ =>   ]).
:- op( 500, xfy, [ :=   ]).



%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% Expanding clauses and declarations.

% The predicate term_expansion/2 implements the extended translation.
% If loaded into Prolog along with the appropriate declarations
% it will be used automatically when consulting programs.

% There are some additional clause for term_expansion/2 at the end of 
% the file. (if they were defined at this point in the file they would
% start expanding the clauses of this file before it was completely
% loaded, thus using predicates that has still not been definied.


% Reinitializing the DB.
% When recompiling a module which contains accumulator declarations, 
% old information concerning this module must be removed from the 
% data base. This is accomplished by calling threads:reinitialize_db/1
% when a `:-ensure_loaded(edcg)' or similar directive is found in 
% the compiled module.

term_expansion( (:- EDCG_UseDecl), [] ) :-
         edcg_use_decl( EDCG_UseDecl ),
	 loading_module_and_file( Module, FileName ),
	 reinitialize_db( Module, FileName ).


% Test. It seems it is possible to do some things when a file has
%       been loaded completely (like checking if all declared predicates
%       were actually used).
% term_expansion(end_of_file, _) :-
% 	loading_module_and_file( Module, File ),
% 	format( "End of file ~w in module ~w reached!~n", [File, Module] ),
%	fail.


% ------------------------
% Expanding The Declarations.

term_expansion( (:- thread(Acc,Methods)), [] ) :-
        edcg_acc( Acc, Methods, forward, no_init_value ).
term_expansion( (:- thread(Acc,Methods,Init)), [] ) :-
        edcg_acc( Acc, Methods, forward, init_value(Init) ).


term_expansion( (:- thread_bwd(Acc,Methods)),[] ) :-
        edcg_acc( Acc, Methods, backward, no_init_value ).
term_expansion( (:- thread_bwd(Acc,Methods,Init)), [] ) :-
        edcg_acc( Acc, Methods, backward, init_value(Init) ).


term_expansion( (:- thread_pass(Pass)), [] ) :-
	edcg_pass(Pass, no_init_value).
term_expansion( (:- thread_pass(Pass,Init)), [] ) :-
	edcg_pass(Pass,init_value(Init)).

term_expansion( (:- thread_method(Method,Old,New,Joiner)), [] ) :-
	edcg_method( Method, Old, New, Joiner ).


term_expansion( (:- thread_pred(PredArity,Accs)), [] ) :-
        edcg_pred(PredArity,Accs).


% ------------------------
% Expanding Clauses:

term_expansion((H-->>B), Clause) :-
	term_expansion_edcg_clause(H, B, Clause).

term_expansion((H:--B), Clause) :-
	term_expansion_edcg_clause(H, B, Clause).

% Expanding a EDCG clause with head H and body B.
term_expansion_edcg_clause(H, B, (TH:-TB)) :-
        functor(H, Na, Ar),
        '_has_hidden'(H, HList),
	new_head(H, HList, TH, Acc, Pass),
        '_expand_goal'(B, TB, Acc, NewAcc, Pass, Na/Ar),
        finish_acc(NewAcc), !.
term_expansion_edcg_clause(H, B, (H:-B)) :-
  fue( "~N%%%%%% The EDCG system failed to expand the clause:~n"        ),
  fue( "%%%%%%~n"                                                       ),
  fue( "%%%%%%    ~w :-- ~w.~n",                                 [H, B] ),
  fue( "%%%%%%~n"                                                       ),
  fue( "%%%%%% This should not happen and is bug in the EDCG system.~n" ),
  fue( "%%%%%% Please send a bug report to andka@ida.liu.se~n"          ),
  fue( "%%%%%% [...]~n~n"                                                   ).

fue( Str ) :- format(user_error, Str, [] ).

fue( Str, L ) :- format(user_error, Str, L ).


% Used with a non-ISO prolog (like SICStus 2.x) this 'multifile' 
% declaration does not allway work properly. (In SICStus 2.x a 
% 'multifile' declaration for a predicate can only be made in one
% file, which means that if this file is loaded with some other file
% that also defines clauses for user:term_expansion/2 then both of them 
% cannot contain a 'multifile' declaration.  With an ISO Prolog, like 
% SICStus 3, it works fine.

:- begin_version(sicstus3).
% in SICStus 2 the multifile decl in versions.pl is enough.
:- multifile user:term_expansion/2.

:- end_version(sicstus3).

user:term_expansion(X,Y) :- threads:term_expansion(X,Y).


% ------------------------

% Describing how the usage of this package can be declared by the
% programmer. e.g. `:- use_module(library(edcg))'.

edcg_use_decl( ensure_loaded(EDCG_ModFile) ) :-
	edcg_module_filenam( EDCG_ModFile ).
edcg_use_decl( use_module(EDCG_ModFile) ) :-
	edcg_module_filenam( EDCG_ModFile ).

edcg_module_filenam( threads ).
edcg_module_filenam( library(threads) ).


% Expand a goal:
%
'_expand_goal'(G, G, Acc, Acc, _Pass, _Cntxt) :-
	var( G ),
	!.
'_expand_goal'((G1,G2), (TG1,TG2), Acc, NewAcc, Pass, Cntxt) :-
        '_expand_goal'(G1, TG1, Acc,    MidAcc, Pass, Cntxt),
        '_expand_goal'(G2, TG2, MidAcc, NewAcc, Pass, Cntxt).
'_expand_goal'((G1->G2;G3), (TG1->TG2;TG3), Acc, NewAcc, Pass, Cntxt) :-
        '_expand_goal'(G1, TG1, Acc,    MidAcc, Pass, Cntxt),
        '_expand_goal'(G2, MG2, MidAcc, Acc1,   Pass, Cntxt),
        '_expand_goal'(G3, MG3, Acc,    Acc2,   Pass, Cntxt),
        merge_acc(Acc, Acc1, MG2, TG2, Acc2, MG3, TG3, NewAcc).
'_expand_goal'((G1;G2), (TG1;TG2), Acc, NewAcc, Pass, Cntxt) :-
        '_expand_goal'(G1, MG1, Acc, Acc1, Pass, Cntxt),
        '_expand_goal'(G2, MG2, Acc, Acc2, Pass, Cntxt),
        merge_acc(Acc, Acc1, MG1, TG1, Acc2, MG2, TG2, NewAcc).
'_expand_goal'((G1->G2), (TG1->TG2), Acc, NewAcc, Pass, Cntxt) :-
        '_expand_goal'(G1, TG1, Acc, MidAcc, Pass, Cntxt),
        '_expand_goal'(G2, TG2, MidAcc, NewAcc, Pass, Cntxt).

'_expand_goal'({G}, G, Acc, Acc, _, _Cntxt) :- !.
%'_expand_goal'(thread_insert(X,Y), Exp, Acc, NewAcc, _, _Cntxt) :-
%	acc_insert( dcg, X, Y, Exp, Acc, NewAcc ).
%'_expand_goal'(thread_insert(A,X,Y), Exp, Acc, NewAcc, _, _Cntxt) :-
%	acc_insert( A, X, Y, Exp, Acc, NewAcc ).
%% Force hidden arguments in L to be appended to G:
%'_expand_goal'((G::A), TG, _, Acc, NewAcc, Pass) :-
%        \+'_list'(G),
%        '_has_hidden'(G, []), !,
%        '_make_list'(A, AList),
%        '_new_goal'(G, AList, GArity, TG),
%        '_use_acc_pass'(AList, GArity, TG, Acc, NewAcc, Pass).
'_expand_goal'((G with A), TG, Acc, NewAcc, Pass, Cntxt) :-
	extend_acc_pass_env( Acc, Pass, A, AccExt, PassExt ),
	'_expand_goal'(G, TG, AccExt, NewAccExt, PassExt, Cntxt),
	reduce_acc_env( NewAccExt, NewAcc ).
'_expand_goal'(L, Joiner, Acc, NewAcc, Pass, Cntxt) :-
        '_list'(L), !,
        '_expand_goal'(dcg::L, Joiner, Acc, NewAcc, Pass, Cntxt).
'_expand_goal'((A::L), Updater, Acc, NewAcc, _, Cntxt) :-
        '_list'(L), !,
	default_update_acc( L, A, Cntxt, Updater, Acc, NewAcc ).
'_expand_goal'((A::Method), Updater, Acc, NewAcc, _, Cntxt) :-
        update_acc( named(Method), A, Cntxt, Updater, Acc, NewAcc ).
'_expand_goal'(thread_val(A,X), Exp, Acc, Acc, Pass, _Cntxt) :-
	arg_val( A, X, Exp, Acc, Pass ).

% Defaulty cases:
'_expand_goal'(G, TG, Acc, NewAcc, Pass, Cntxt) :-
        '_has_hidden'(G, GList), !,
        new_goal(G, GList, TG, Acc, NewAcc, Pass, Cntxt).

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% Accessing the value of a hidden argument.


%acc_insert( A, X, Y, Exp, Acc, NewAcc ) :-
% 	is_acc_name( A ),
% 	!,
%         ( insert_acc(A, Left, Right, Acc, NewAcc)
% 	  -> acc_direction( A, Dir ),
%              ( Dir = forward   -> Old = Left, New = Right
%              ; Dir = backward  -> New = Left, Old = Right
%              ),
%              ( var(X)
% 	       -> X = Old,
% 	          ExpX = true
% 	       ;  ExpX = (Old=X)
% 	     ),
% 	     ( var(Y)
% 	       -> Y = New,
% 	          ExpY = true
% 	       ;  ExpY = (New=Y)
% 	     ),
% 	     Exp = (ExpX,ExpY)
%           ;  ( A = dcg
% 	       -> edcg_error("thread_insert(~w, ~w), accumulator `dcg' is not defined in this context!",
% 	                [X,Y] )
% 	       ;  edcg_error("thread_insert(~w, ~w, ~w), accumulator `~w` is not defined in this context!",
% 	                [A,X,Y,A] )
% 	     ),
%              Exp = true
% 	).
% acc_insert( A, X, Y, true, Acc, Acc ) :-
%         \+ is_acc_name( A ),
% 	edcg_error("thread_insert(~w, ~w, ~w), `~w` is not an accumulator!",
% 	           [A,X,Y,A] ).


arg_val( P, X, Exp, _Acc, Pass ) :-
	is_pass_name( P ),
	!,
	( pass_lookup(P, Pass, X1)
	  -> ( var(X)
	       -> X = X1, Exp = true
	       ;  Exp = (X = X1)
	     )
	  ;  edcg_error("thread_val(~w, ~w), passed arg. `~w' is not defined in this context!",
	                     [P,X,P] ),
	          Exp = true
	).
arg_val( A, X, true, _Acc, _Pass ) :-
	\+ is_pass_name( A ),
	!,
	edcg_error("thread_val(~w, ~w), `~w' is not a passed argument!",
	           [A,X,A] ).


%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% Acc and Pass Environments
%-----------------------------------------------------------------------------
%
% Acc is a term of the form:
%
%    acc_env(Frames,BlockFrames)
%
%    where
%
%      Frames  is a list of "frames" where each frame is a list of terms
%              of the form:
%
%                 acc(A,LeftA,RightA,Used)
%
%        where
%
%         A       is an accumulator name
%         LeftA   is the "current" variable holding the value of A.
%         RightA  is the last variable in the transformed clause that will 
%                 hold the value of A.
%         Used    has the value 'used' if A has been used to expand a goal
%                 and has the value 'unused' otherwise. Accumulators used in
%                 the head of the clause are always 'used'.
%
%      BlockFrames  is a list of "blockframes" where each blockframe
%                   is a list of accumulator names.
%
%      Frames and BlockFrames always contain the same number of frames.
%
%      An accumulator A has the "left" value L and the "right" value R in
%      an environment acc_env(Frames,BlockFrames) iff
%
%       -  A is not a member of the first blockframe in BlockFrames, and
%       -  In the first frame in Frames where a term of the form
%          acc(A,L1,R1,Used) occurs, L1 = L and R1 = R.
%
%      BlockFrames is thus a way of "blocking" the access of an
%      accumulator which is otherwise defined in Frames. This is because
%      in the scope of `glob(a)' the accumulator `a' should be
%      undefined.
%
%
% Pass term of the form:
%
%    pass_env(Frames,BlockFrames)
%
%    where
%
%      Frames  is a list of "frames" where each frame is a list
%              of terms of the form:
%
%               pass(A,Arg) 
%
%        where A is the name of a passed argument, and Arg is the
%              variable holding the value of this argument.
%
%      BlockFrames  is a list of "blockframes" where each blockframe
%                   is a list of passed argument names.
%
%
%  NOTE: Acc and Pass should be renamed AccEnv and PassEnv!
%
%-----------------------------------------------------------------------------
% Operations on the Acc and Pass data structures:
%-----------------------------------------------------------------------------

% Create the Acc and Pass environments:

create_acc_pass( AList, Index, TGoal,
	         acc_env([AccFrame],[[]]), pass_env([PassFrame],[]), Cntxt) :-
	'_create_acc_pass'( AList, Index, TGoal, AccFrame, PassFrame, Cntxt).

'_create_acc_pass'([], _, _, [], [], _).
'_create_acc_pass'([A|AList], Index, TGoal, [acc(A,LeftA,RightA,used)|Acc], Pass, Cntxt) :-
        is_acc_name(A),
	!,
        Index1 is Index+1,
        arg(Index1, TGoal, LeftA),
        Index2 is Index+2,
        arg(Index2, TGoal, RightA),
        '_create_acc_pass'(AList, Index2, TGoal, Acc, Pass, Cntxt).
'_create_acc_pass'([A|AList], Index, TGoal, Acc, [pass(A,Arg)|Pass], Cntxt) :-
        is_pass_name(A),
	!,
        Index1 is Index+1,
        arg(Index1, TGoal, Arg),
        '_create_acc_pass'(AList, Index1, TGoal, Acc, Pass, Cntxt).
'_create_acc_pass'([A|AList], Index, TGoal, Acc, Pass, Cntxt) :-
        \+ is_acc_name(A),
        \+ is_pass_name(A),
        %
	% The warning message below will be repeated for every clause of
        % the predicate. Perhaps a check of this should instead be done
        % when the file has been completely loaded.
        %
	Cntxt = context(HNaAr),
	edcg_warning( "Hidden arg. `~w' used by ~w does not exist.", [A,HNaAr] ),
        %
        %   A can safely be skipped  here since it was
        %   skipped by '_number_args'/3 as well:
        %
	'_create_acc_pass'(AList, Index, TGoal, Acc, Pass, Cntxt).


% Use the Acc and Pass data structures to create the arguments of a body goal:
% Add the hidden parameters named in GList to the goal.
use_acc_pass([], _, _, Acc, Acc, _, _).
% 1a. The accumulator A is defined in the Acc environment:
use_acc_pass([A|GList], Index, TGoal, Acc, NewAcc, Pass, Cntxt) :-
        insert_acc(A, LeftA, MidA, Acc, MidAcc),
	!,
        Index1 is Index+1,
        arg(Index1, TGoal, LeftA),
        Index2 is Index+2,
        arg(Index2, TGoal, MidA),
        use_acc_pass(GList, Index2, TGoal, MidAcc, NewAcc, Pass, Cntxt).
% 1b. The accumulator A is not defined in the Acc environment:
use_acc_pass([A|GList], Index, TGoal, Acc, NewAcc, Pass, Cntxt) :-
        is_acc_name( A ),
	!,
	Cntxt = context(HeadNaAr,GNaAr),
	edcg_warning( "In a clause of ~w accumulator `~w' implicitly initialized for call to ~p.",
	             [HeadNaAr,A,GNaAr] ),
        % Initiate it with two fresh variables, i.e. do nothing.
        % Index1 is Index+1,
        % arg(Index1, TGoal, LStart),
        Index2 is Index+2,
        % arg(Index2, TGoal, RStart),
        use_acc_pass(GList, Index2, TGoal, Acc, NewAcc, Pass, Cntxt).
% 2a. The passed argument A is defined in the Pass environment:
use_acc_pass([A|GList], Index, TGoal, Acc, NewAcc, Pass, Cntxt) :-
        is_pass_name(A),
	pass_lookup(A, Pass, Arg),
	!,
        Index1 is Index+1,
        arg(Index1, TGoal, Arg),
        use_acc_pass(GList, Index1, TGoal, Acc, NewAcc, Pass, Cntxt).
% 2b. The passed argument A is not defined in the Pass environment:
use_acc_pass([A|GList], Index, TGoal, Acc, NewAcc, Pass, Cntxt) :-
	is_pass_name( A ),
	!,
	Cntxt = context(HeadNaAr,GNaAr),
	edcg_warning( "In a clause of ~w passed arg. `~w' implicitly initialized for call to ~p.",
	             [HeadNaAr,A,GNaAr] ),
        % Initiate it to a fresh variable, i.e. do nothing.
	Index1 is Index+1,
	% arg(Index1, TGoal, AStart),
	use_acc_pass(GList, Index1, TGoal, Acc, NewAcc, Pass, Cntxt).
% 3. Defaulty case when A does not exist:
use_acc_pass([A|GList], Index, TGoal, Acc, NewAcc, Pass, Cntxt) :-
	Cntxt = context(_HeadNaAr,GNaAr),
        %
	% The warning message below will be repeated for every call of
        % the predicate. Perhaps a check of this should instead be done
        % when the file has been completely loaded.
        %
	edcg_warning( "Hidden arg. `~w' used by ~w does not exist.", [A,GNaAr] ),
	use_acc_pass(GList, Index, TGoal, Acc, NewAcc, Pass, Cntxt).



% Extend the accumulator environment
% 
% AccPass is an expression occuring to the right of a 'with', i.e. as
%
%             <goal> with AccPass
%
% extend_acc_pass_env/5 extends the acc and pass environments with the 
% accumulators initiatated in AccPass by
%
%    first parsing the AccPass term using acc_pass/5
%
%          This yeilds a new acc frame NewAccsFrame 
%          and a new pass frame NewPassFrame.
%
%    then construct a new acc block frame using new_acc_block/4
%         and a new pass block fram using new_acc_block/4.

extend_acc_pass_env( Accs, Pass, AccPass, NewAccs, NewPass ) :-
	acc_pass( AccPass,
	          Accs, TmpAccs, [], AGlobs,
                  Pass, [], PGlobs,
		  NewAccsFrame, NewPassFrame ),
	TmpAccs = acc_env(  AccFrames,  [ABlock|ABB] ),
	Pass    = pass_env( PassFrames, PBlock ),
	new_acc_block( ABlock,  AGlobs, NewAccsFrame, NewABlock ),
	new_pass_block( PBlock, PGlobs, NewPassFrame, NewPBlock ),
	NewAccs = acc_env(  [NewAccsFrame|AccFrames ], [NewABlock,ABlock|ABB] ),
	NewPass = pass_env( [NewPassFrame|PassFrames], NewPBlock ).


% Construct a new acc block frame.
%
% first  blocking any accumulator `a' that occurs in  a
%        `glob(a)' in AccPass, using block_new_aglobs, and
%
% then   make sure that any accumulator which is 
%        initiated in AccPass is unblocked, 
%        using unblock_defined_accs.
%
% The order (first block then unblock) is important since an
% accumulator `a' that both occurs in a `glob(a)' and is initiated,
% as in
%
%                 <goal> with (a,b=glob(a))
%
% shold remain unblocked when expanding <goal>.
%
% Arguments:
%
% new_acc_block( ABlock, AGlobs, NewAccsFrame, NewABlock )
%
%    ABlock  is the previous block frame.
%
%    AGlobs  is a list of terms of the form glob(AccName,_,_), where
%            glob(AccName) occured to the right of a 'with', i.e. in
%            the 'AccPass' structure.
%
%    NewAccsFrame  is an acc frame defining all accumulators initiated 
%                  to the right of a 'with', i.e. in the 'AccPass'
%                  structure.
%
%    NewABlock  is the new block frame.

new_acc_block( ABlock, AGlobs, NewAccsFrame, NewABlock ) :-
	block_new_aglobs( AGlobs, ABlock, TmpABlock ),
	unblock_defined_accs( TmpABlock, NewAccsFrame, NewABlock ).


block_new_aglobs( [], ABlock, ABlock ).
block_new_aglobs( [glob(AccName,_,_)|AGlobs], ABlock, NewABlock ) :-
	memberchk( AccName, ABlock ), 
	!,
	% This is most likely never the case. But anyway...
	%
	block_new_aglobs( AGlobs, ABlock, NewABlock ).
block_new_aglobs( [glob(AccName,_,_)|AGlobs], ABlock, [AccName|NewABlock] ) :-
	block_new_aglobs( AGlobs, ABlock, NewABlock ).
	

unblock_defined_accs( [], _NewAccsFrame, [] ).
unblock_defined_accs( [BlockedAcc|ABlock], NewAccsFrame, NewABlock ) :-
	memberchk( acc(BlockedAcc,_,_,_), NewAccsFrame ),
	!,
	unblock_defined_accs( ABlock, NewAccsFrame, NewABlock ).
unblock_defined_accs( [BlockedAcc|ABlock], NewAccsFrame,
	              [BlockedAcc|NewABlock] ) :-
	unblock_defined_accs( ABlock, NewAccsFrame, NewABlock ).


% Construct a new pass block frame.
%
% first  blocking any passed arg `a' that occurs in  a
%        `glob(a)' in AccPass, using block_new_pglobs, and
%
% then   make sure that any passed arg which is 
%        initiated in AccPass is unblocked, 
%        using unblock_defined_pass.
%
% The order (first block then unblock) is important since a passed
% arg `a' that both occurs in a `glob(a)' and is initiated,
% as in
%
%                 <goal> with (a,b=glob(a))
%
% shold remain unblocked when expanding <goal>.
%
% Arguments:
%
% new_pass_block( PBlock, PGlobs, NewPassFrame, NewPBlock )
%
%    PBlock  is the previous block frame.
%
%    PGlobs  is a list of passed arg names PassName, where
%            glob(PassName) occured to the right of a 'with', i.e. in
%            the 'AccPass' structure.
%
%    NewPassFrame  is a pass frame defining all passed args initiated 
%                  to the right of a 'with', i.e. in the 'AccPass'
%                  structure.
%
%    NewPBlock  is the new block frame.

new_pass_block( PBlock, PGlobs, NewPassFrame, NewPBlock ) :-
	block_new_pglobs( PGlobs, PBlock, TmpPBlock ),
	unblock_defined_pass( TmpPBlock, NewPassFrame, NewPBlock ).


block_new_pglobs( [], PBlock, PBlock ).
block_new_pglobs( [PassName|PGlobs], PBlock, NewPBlock ) :-
	memberchk( PassName, PBlock ), 
	!,
	% This is most likely never the case. But anyway...
	%
	block_new_pglobs( PGlobs, PBlock, NewPBlock ).
block_new_pglobs( [PassName|PGlobs], PBlock, [PassName|NewPBlock] ) :-
	block_new_pglobs( PGlobs, PBlock, NewPBlock ).
	

unblock_defined_pass( [], _NewPassFrame, [] ).
unblock_defined_pass( [BlockedPass|PBlock], NewPassFrame, NewPBlock ) :-
	memberchk( pass(BlockedPass,_), NewPassFrame ),
	!,
	unblock_defined_pass( PBlock, NewPassFrame, NewPBlock ).
unblock_defined_pass( [BlockedPass|PBlock], NewPassFrame,
	              [BlockedPass|NewPBlock] ) :-
	unblock_defined_pass( PBlock, NewPassFrame, NewPBlock ).



% Reduce the accumulator environment
% 
% Finish the first/"topmost" frame in the Acc environment:
%  -  Link its Left and Right accumulation variables together in pairs,
%     or, if an accumulator has not been used to expand any goal, 
%     output a warning,
%  -  remove/"pop" it.

reduce_acc_env( acc_env([AccsFrame|Accs],[_B|BB]), acc_env(Accs,BB) ) :-
	finish_acc_frame( AccsFrame ).

finish_acc( acc_env([AccFrame],_Block) ) :-
	finish_acc_frame( AccFrame ).

finish_acc_frame([]).
finish_acc_frame([acc(AccName,L,R,Used)|Acc]) :-
	finish_acc_frame_2(Used,L,R,AccName,Acc).

finish_acc_frame_2(used,   Link, Link, _AccName, Acc) :-
	finish_acc_frame(Acc).
finish_acc_frame_2(unused, _, _, AccName, Acc) :-
	edcg_warning( "Initialized accumulator `~w' not used.", [AccName] ),
	finish_acc_frame(Acc).


% The Accumulator environment  --------------------------------------------

insert_acc( A, L, R, Acc, NewAcc ) :-
	replace_acc(A, L, Final, R, Final, Acc, NewAcc).


% Replace elements in the Acc data structure:
% Succeeds iff replacement is successful.

replace_acc(A, L1, R1, L2, R2, Acc, NewAcc) :-
	Acc = acc_env(AccFrames,[Block|BB]),
	\+ memberchk( A, Block ),
	replace_acc_in_frames( AccFrames, A, L1, R1, L2, R2, NewAccFrames),
	NewAcc = acc_env(NewAccFrames,[Block|BB]).


replace_acc_in_frames([Frame|Acc], A, L1, R1, L2, R2, [NewFrame|Acc]) :-
	replace_acc_in_frame(A, L1, R1, L2, R2, Frame, NewFrame),
	!.
replace_acc_in_frames([Frame|Acc], A, L1, R1, L2, R2, [Frame|NewAcc]) :-
	replace_acc_in_frames(Acc, A, L1, R1, L2, R2, NewAcc).	


replace_acc_in_frame(A, L1, R1, L2, R2, AccFrame, NewAccFrame) :-
        memberchk(acc(A,L1,R1,_), AccFrame),
        '_replace'(acc(A,_,_,_), acc(A,L2,R2,used), AccFrame, NewAccFrame).


% [ The definition of merge_acc should be moved somewhere else, and also ]
% [ renamed to something better.                                         ]
% [ Perhaps join_acc_envs, unify_acc_envs, or acc_envs_disj.             ]
%
% merge_acc( Accs, Accs1, G1, NG1, Accs2, G2, NG2, Accs ).
%
% Combine two accumulator environments Accs1 and Accs2
% ('or'ing their values), and cobine the result with the
% original environment Accs.

merge_acc( acc_env(AccFrames    ,Block), 
           acc_env(AccFrames1   ,Block), G1, NG1, 
           acc_env(AccFrames2   ,Block), G2, NG2, 
           acc_env(NewAccFrames ,Block) ) :-
        merge_acc_frames( AccFrames, 
                          AccFrames1, G1, NG1, 
                          AccFrames2, G2, NG2, 
                          NewAccFrames ).

merge_acc_frames( [], 
                  [], G1, G1, 
                  [], G2, G2, 
                  [] ).
merge_acc_frames( [AccsFrame   |Accs    ], 
                  [Accs1Frame  |Accs1   ], G1, NG1, 
                  [Accs2Frame  |Accs2   ], G2, NG2, 
                  [NewAccsFrame|NewAccs ] ) :-
        merge_acc_frame( AccsFrame, 
                         Accs1Frame, G1, TG1, 
                         Accs2Frame, G2, TG2,
                         NewAccsFrame ),
	merge_acc_frames( Accs, 
                          Accs1, TG1, NG1,
			  Accs2, TG2, NG2, 
			  NewAccs ).

% Combine two accumulator lists ('or'ing their values)
merge_acc_frame([], [], G1, G1, [], G2, G2, []) :- !.
merge_acc_frame([acc(Acc,OL,R,_)|Accs],
	        [acc(Acc,L1,R,T1)|Accs1], G1, NG1,
                [acc(Acc,L2,R,T2)|Accs2], G2, NG2,
		[acc(Acc,NL,R,T)|NewAccs]) :- !,
        ( ( OL == L1, OL \== L2 ) -> 
          U1 = (L1=L2), U2 = true, NL = L2
        ; ( OL == L2, OL \== L1 ) ->
          U1 = true, U2 = (L2=L1), NL = L1
        ; U1 = true, U2 = true, L1 = L2, L2 = NL
	),
	( ( T1 = unused ; U1 = true )
	  -> MG1 = G1
	  ;  MG1 = (G1,U1)
	),
	( ( T2 = unused ; U2 = true )
	  -> MG2 = G2
	  ;  MG2 = (G2,U2)
	),
	( ( T1 = unused, T2 = unused )
	  -> T = unused
          ;  T = used
        ),
        merge_acc_frame(Accs, Accs1, MG1, NG1, Accs2, MG2, NG2, NewAccs).



make_accs_frame( AccName, InitialVal, FinalVal, AccsFrame ) :-
        acc_direction( AccName, Dir ),
        ( Dir = forward   -> L = InitialVal, R = FinalVal
        ; Dir = backward  -> R = InitialVal, L = FinalVal
        ),
        AccsFrame = [acc(AccName,L,R,unused)].



merge_new_acc_frames( [], AccsFrame, AccsFrame ).
merge_new_acc_frames( [Acc|AccsFrame1], AccsFrame2, AccsFrame ) :-
	merge_new_acc_frames( AccsFrame1, AccsFrame2, TmpAccsFrame ),
	Acc = acc(AccName,L1,R1,T),
	( memberchk( acc(AccName,L2,R2,T), TmpAccsFrame)
	  -> AccsFrame = TmpAccsFrame,
             ( L1 = L2, R1 = R2
	       -> true 
               ;  edcg_error( "Accumulator `~w' initialized with incompatible values.", 
                              [AccName] )
             )
          ;  AccsFrame = [Acc|TmpAccsFrame]
        ).
	
acc_lookup( AccName, acc_env(AccFrames,[Block|_]), L,  R ) :-
	\+ memberchk( AccName, Block ),
	acc_lookup_in_frames( AccFrames, AccName, L, R ).

acc_lookup_in_frames([AccFrame|_Accs], AccName, L, R ) :-
	memberchk( acc(AccName,L,R,_), AccFrame ),
	!.
acc_lookup_in_frames([_AccFrame|Accs], AccName, L, R ) :-
	acc_lookup_in_frames( Accs, AccName, L, R ).



make_pass_frame( PassName, V, PassFrame ) :-
	PassFrame = [pass(PassName,V)].


merge_new_pass_frames( [], PassFrame, PassFrame ).
merge_new_pass_frames( [Pass|PassFrame1], PassFrame2, PassFrame ) :-
	merge_new_pass_frames( PassFrame1, PassFrame2, TmpPassFrame ),
	Pass = pass(PassName,V1),
	( memberchk( pass(PassName, V2), TmpPassFrame)
	  -> PassFrame = TmpPassFrame,
             ( V1 = V2
	       -> true 
               ;  edcg_error( "Passed arg. `~w' initialized with incompatible values.", 
                              [PassName] )
             )
          ;  PassFrame = [Pass|TmpPassFrame]
        ).


pass_lookup( PassName, pass_env(PassFrames,Block), V ) :-
	\+ memberchk( PassName, Block ),
	pass_lookup_in_frames( PassFrames, PassName, V ).

pass_lookup_in_frames([PassFrame|_Pass], PassName, V ) :-
	memberchk( pass(PassName, V), PassFrame ),
	!.
pass_lookup_in_frames([_PassFrame|Pass], PassName, V ) :-
	pass_lookup_in_frames( Pass, PassName, V ).


%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

% Specialized utilities:

% Given a goal Goal and a list of hidden parameters GList
% create a new goal TGoal with the correct number of arguments.
% initiated with the information in Acc and Pass.

new_goal(Goal, GList, TGoal, Acc, NewAcc, Pass, NaAr) :-
        functor(Goal, Name, GArity),
        '_number_args'(GList, GArity, TArity),
        functor(TGoal, Name, TArity),
        '_match'(1, GArity, Goal, TGoal),
	use_acc_pass( GList, GArity, TGoal, Acc, NewAcc, Pass,
	              context(NaAr,Name/GArity) ).

new_head(Head, HList, THead, Acc, Pass) :-
	functor(Head, Name, HArity),
        '_number_args'(HList, HArity, TArity),
        functor(THead, Name, TArity),
        '_match'(1, HArity, Head, THead),
	create_acc_pass(HList, HArity, THead, Acc, Pass, context(Name/HArity)).
	


% Add the number of arguments needed for the hidden parameters:
'_number_args'([], N, N).
'_number_args'([A|List], N, M) :-
        is_acc_name(A), !,
        N2 is N+2,
        '_number_args'(List, N2, M).
'_number_args'([A|List], N, M) :-
        is_pass_name(A), !,
        N1 is N+1,
        '_number_args'(List, N1, M).
'_number_args'([A|List], N, M) :-
        \+ is_acc_name(A),
        \+ is_pass_name(A),
        % 
        % This is an error of course, but it is also discovered in 
        % use_acc_pass and '_create_acc_pass' where it is reported
        % to the programmer.
        %
        '_number_args'(List, N, M).


% Calculate the joiner for an accumulator A:
'_joiner'([], _, _, true, Acc, Acc).
'_joiner'([Term|List], A, NaAr, (Joiner,LJoiner), Acc, NewAcc) :-
        insert_acc(A, LeftA, RightA, Acc, MidAcc),
        '_acc_info'(A, Term, Old, New, Joiner1), 
        !,
	( nonvar( Joiner1 )
	  -> Joiner = Joiner1
          ;  Joiner = true,
	     edcg_warning("No accumulation method seems to be defined for `~w'.", [A] )
	),
        acc_direction( A, Dir ),
	( Dir = forward   -> LeftA = Old, RightA = New
        ; Dir = backward  -> LeftA = New, RightA = Old
        ),
        '_joiner'(List, A, NaAr, LJoiner, MidAcc, NewAcc).
% Defaulty case:
'_joiner'([_Term|List], A, NaAr, Joiner, Acc, NewAcc) :-
	edcg_warning("in ~w the accumulator ~w does not exist.", [NaAr,A] ),
        '_joiner'(List, A, NaAr, Joiner, Acc, NewAcc).


default_update_acc( [], _A, _NaAr, true, Acc, Acc ).
default_update_acc( [X|L], A, NaAr, Updater, Acc, NewAcc ) :-
	update_acc( default(A,X), A, NaAr, Updater1, Acc, TmpAcc ),
	default_update_acc( L, A, NaAr, Updater2, TmpAcc, NewAcc ),
	Updater = (Updater1,Updater2).


% There should be a check that the method is defined for A:

update_acc( MethodTerm, A, _NaAr, Updater, Acc, NewAcc ) :-
	insert_acc(A, LeftA, RightA, Acc, NewAcc),
	!,
        acc_direction( A, Dir ),
	( Dir = forward   -> LeftA = Old, RightA = New
        ; Dir = backward  -> LeftA = New, RightA = Old
        ),
        apply_method( MethodTerm, Old, New, Updater ).
update_acc( _, A, NaAr, true, Acc, Acc ) :-
	edcg_warning("The accumulator ~w is not available in ~w.", [A,NaAr] ).


apply_method( default(A,Term), Old, New, Updater ) :-
	default_acc_method( A, Term, Old, New, Updater ),
        !.
apply_method( default(A,_Term), Old, New, true ) :-
	edcg_error("No default method defined for accumulator `~w'.", [A]),
	Old = New.
apply_method( named(MethodTerm), Old, New, Updater ) :-
	acc_method( MethodTerm, Old, New, Updater ),
	!.
apply_method( named(MethodTerm), Old, New, true ) :-
	functor( MethodTerm, MethodName, UsedArity ),
	( acc_method_arity( MethodName, RealArity ) 
           -> edcg_error( "Wrong number of arguments to method `~w' (~w instead of ~w).", [MethodName,UsedArity,RealArity] )
	   ;  edcg_error( "Using an undefined method `~w'.", [MethodName] )
	),
	Old = New.





%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% In a `p with <AccPass>' construct the structure of <AccPass>
% is definied by this CFG:
%
% -----
%
% AccPass       --> (AccPass,AccPass)
%                 | AccTop
%                 | PassTop
%                 | Pass => Acc
%                 | Acc => Pass
%
% AccTop        --> AccBasic
%
% Acc           --> AccBasic
%      <removed!> | inv(Acc)
%                 | glob(AccName)
%                 | @(Initial,Final)
%
% AccBasic      --> Acc => Acc
%                 | Acc := Acc
%                 | Acc = Acc
%                 | AccSpec
%
% AccSpec       --> AccName
%                 | acc(Initial,Final)
%                 | acc(Final)
%
% AccName       --> acc
%
% PassTop       --> PassBasic
%
% Pass          --> PassBasic
%                 | glob(PassName)
%                 | @(V)
%
% PassBasic     --> Pass := Pass
%                 | Pass = Pass
%                 | PassSpec
%
% PassSpec      --> PassName
%                 | pass(V)
%
% PassName      --> pass
%
% -----

% This should really be written using the EDCG package! :-)

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% AccPass

acc_pass( AccPass, 
          Accs, NewAccs, AGlobs, NewAGlobs,
	  _Pass, PGlobs, NewPGlobs,
	  AccsFrame, PassFrame ) :-
	var( AccPass ),
	!,
	edcg_error("A variable occuring in the wrong place to the right of a `with'.", [] ),
	AccsFrame = [],
	PassFrame = [],
	NewAccs   = Accs,
	NewAGlobs = AGlobs,
	NewPGlobs = PGlobs.
      

% AccPass --> (AccPass,AccPass)               -----------------------------

acc_pass( (AccPass1,AccPass2),
	  Accs, NewAccs, AGlobs, NewAGlobs,
	  Pass, PGlobs, NewPGlobs,
	  AccsFrame, PassFrame ) :-
	!,
	acc_pass( AccPass1, Accs,    TmpAccs, AGlobs,    TmpAGlobs, Pass, PGlobs,    TmpPGlobs, AccsFrame1, PassFrame1 ),
	acc_pass( AccPass2, TmpAccs, NewAccs, TmpAGlobs, NewAGlobs, Pass, TmpPGlobs, NewPGlobs, AccsFrame2, PassFrame2 ),
	merge_new_acc_frames( AccsFrame1, AccsFrame2, AccsFrame ),
	merge_new_pass_frames( PassFrame1, PassFrame2, PassFrame ).

% AccPass --> AccTop                       --------------------------------

acc_pass( AccPass,
	  Accs, NewAccs, AGlobs, NewAGlobs,
	  _Pass, PGlobs, NewPGlobs,
	  AccsFrame, PassFrame ) :-
	acc_top( AccPass, init, Accs, NewAccs, AGlobs, NewAGlobs, AccsFrame, _L,  _R ),
	!,
	PassFrame = [],
	NewPGlobs = PGlobs.

% AccPass --> PassTop                     --------------------------------

acc_pass( AccPass,
	Accs, NewAccs, AGlobs, NewAGlobs,
	Pass, PGlobs, NewPGlobs,
	AccsFrame, PassFrame ) :-
	pass_top( AccPass, init, Pass, PGlobs, NewPGlobs, PassFrame, _V ),
	!,
	AccsFrame = [],
	NewAccs   = Accs,
	NewAGlobs = AGlobs.

% AccPass -->  Pass => Acc                --------------------------------

acc_pass( Pass1 => Acc2,
	  Accs, NewAccs, AGlobs, NewAGlobs,
	  Pass, PGlobs, NewPGlobs,
	  AccsFrame, PassFrame ) :-
	pass( Pass1, var, Pass, PGlobs, NewPGlobs, PassFrame, V1 ),
	acc( Acc2, var, Accs, NewAccs, AGlobs, NewAGlobs, AccsFrame, L2, _R2 ),
	!,
	( V1 = L2
	  -> true
          ;  edcg_error("`~w => ~w'. Initialization failed.", [Pass1, Acc2])
        ).

% AccPass --> Acc => Pass                 --------------------------------

acc_pass( Acc1 => Pass2,
	  Accs, NewAccs, AGlobs, NewAGlobs,
	  Pass, PGlobs, NewPGlobs,
	  AccsFrame, PassFrame ) :-
	acc( Acc1, init, Accs, NewAccs, AGlobs, NewAGlobs, AccsFrame, _L1, R1 ),
	pass( Pass2, var, Pass, PGlobs, NewPGlobs, PassFrame,  V2 ),
	!,
	( R1 = V2
	  -> true
          ;  edcg_error("`~w => ~w'. Initialization failed.", [Acc1, Pass2])
        ).

% AccPass --> <error>                     --------------------------------

acc_pass( Pass1 => Pass2,
	  Accs, NewAccs, AGlobs, NewAGlobs,
	  _Pass, PGlobs, NewPGlobs,
	  AccsFrame, PassFrame ) :-
	!,
	edcg_error( "~w => ~w, either both `~w' and `~w' are passed arguments, or at least one  of them is niether an accumulator nor a passed argument.", 
                    [Pass1,Pass2,Pass1,Pass2] ),
	AccsFrame = [],
	PassFrame = [],
	NewAccs   = Accs,
	NewAGlobs = AGlobs,
	NewPGlobs = PGlobs.

acc_pass( AP1 = AP2,
	  Accs, NewAccs, AGlobs, NewAGlobs,
	  _Pass, PGlobs, NewPGlobs,
	  AccsFrame, PassFrame ) :-
	!, % Either AP1 is passed and AP2 is an acc.
           % Or,    AP1 is an acc and AP2 is passed.
           % Or,    either AP1 or AP2 is niether passed nor an acc.
	edcg_error( "Initialization: `~w = ~w'.",
                    [AP1,AP2] ),
        AccsFrame = [],
	PassFrame = [],
	NewAccs   = Accs,
	NewAGlobs = AGlobs,
	NewPGlobs = PGlobs.


acc_pass( inv(Acc),
	  Accs, NewAccs, AGlobs, NewAGlobs,
	  _Pass, PGlobs, NewPGlobs,
	  AccsFrame, PassFrame ) :-
	!,
	edcg_error("`inv(~w)', Not a legal initialization.", [Acc]),
	AccsFrame = [],
	PassFrame = [],
	NewAccs   = Accs,
	NewAGlobs = AGlobs,
	NewPGlobs = PGlobs.


acc_pass( glob(AccPass),
	  Accs, NewAccs, AGlobs, NewAGlobs,
	  _Pass, PGlobs, NewPGlobs,
	  AccsFrame, PassFrame ) :-
	!,
	edcg_error("`glob(~w)', Not a legal initialization.", [AccPass]),
	AccsFrame = [],
	PassFrame = [],
	NewAccs   = Accs,
	NewAGlobs = AGlobs,
	NewPGlobs = PGlobs.
	
% This could probably be more informative!

acc_pass( AccPass,
	  Accs, NewAccs, AGlobs, NewAGlobs,
	  _Pass, PGlobs, NewPGlobs,
	  AccsFrame, PassFrame ) :-
	!,
	edcg_error("`~w', Not a legal initialization.", [AccPass]),
	AccsFrame = [],
	PassFrame = [],
	NewAccs   = Accs,
	NewAGlobs = AGlobs,
	NewPGlobs = PGlobs.

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% Arguments of the acc-parsing predicates.
%
% Some of arguments are common of all predicates that parse accumulator
% initialzations.  Their names have been kept short for typgraphical
% reasons.  Here is an explanation:
%
%  Name   Better Name
%
%  UI     UnifiedInitial       This is a flag that says how the
%                              accumulator should be initialized.  If it
%                              has the value 'init' it is initialized
%                              with its declared default value, if it
%                              has one, or otherwise a fresh variable.
%                              If it has the value 'var' it is always
%                              initialized initialized with a fresh
%                              variable.
%
%  Ini     InitaialValue       The term that the parsed accumulator should
%                              be initialized with.
%
%  Fin     FinalValue          the term that the final value of the
%                              accumulator should be unified with.

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% AccTop

acc_top( AccTop, _UI, Accs, NewAccs, Globs, NewGlobs, AccsFrame,_Ini,_Fin) :-
	var( AccTop ),
	!,
	edcg_error("A variable occuring in the wrong place to the right of a `with'.", [] ),
	AccsFrame = [],
	NewAccs   = Accs,
	NewGlobs  = Globs.

% AccTop --> AccBasic                      --------------------------------

acc_top( AccTop, UI, Accs, NewAccs, Globs, NewGlobs, AccsFrame, Ini,  Fin ) :-
	acc_basic( AccTop, UI, Accs, NewAccs, Globs, NewGlobs, AccsFrame,
                   Ini,  Fin ).


%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% Acc

acc( Acc, _UI, Accs, NewAccs, Globs, NewGlobs, AccsFrame, _Ini,  _Fin ) :-
	var( Acc ),
	!,
	edcg_error("A variable occuring in the wrong place to the right of a `with'.", [] ),
	AccsFrame = [],
	NewAccs   = Accs,
	NewGlobs  = Globs.

% Acc --> AccBasic                         --------------------------------

acc( Acc, UI, Accs, NewAccs, Globs, NewGlobs, AccsFrame, Ini,  Fin ) :-
	acc_basic( Acc, UI, Accs, NewAccs, Globs, NewGlobs, AccsFrame,
	           Ini,  Fin ),
	!.

% % Acc --> inv(Acc)                         --------------------------------
% 
% acc( inv(Acc), UI, Accs, NewAccs, Globs, NewGlobs, AccsFrame, Ini,  Fin ) :-
% 	acc( Acc, UI, Accs, NewAccs, Globs, NewGlobs, AccsFrame, Ini1,  Fin1 ),
% 	!,
% 	L = Fin1, Fin = Ini1.
% 
% acc( inv(Acc), _UI, Accs, NewAccs, Globs, NewGlobs, AccsFrame, _Ini,  _Fin ) :-
% 	edcg_error( "`inv(~w)', ~w cannot be inverted.", [Acc,Acc] ),
% 	AccsFrame = [],
% 	NewAccs   = Accs,
% 	NewGlobs  = Globs.

% Acc -->  glob(AccName)                   --------------------------------

acc( glob(AccName), UI, Accs, NewAccs, Globs, NewGlobs, AccsFrame,
     Ini,  Fin ) :-
        ( UI = var
	  ->  edcg_warning("Trying to initialize a global reference glob(~w)", [AccName] )
          ; true
	),
        is_acc_name( AccName ),
	!,
	( memberchk( glob(AccName,Ini,Fin), Globs )
          -> NewGlobs = Globs,
	     NewAccs = Accs
          ;  insert_acc( AccName, L, R, Accs, NewAccs )
	  -> acc_direction( AccName, Dir ),
	     ( Dir = forward   -> Ini = L, Fin = R
             ; Dir = backward  -> Ini = R, Fin = L
             ),
             NewGlobs = [glob(AccName,Ini,Fin)|Globs]
	  ;  edcg_error( "glob(~w), The accumulator ~w is not defined in the enclosing environment.",
                         [AccName,AccName])
        ),
	AccsFrame = [].


% Acc -->  @(Ini,Fin)                          --------------------------------

acc( @(Ini,Fin), _UI, Accs, NewAccs, Globs, NewGlobs, AccsFrame, Ini,  Fin ) :-
	AccsFrame = [],
	NewAccs   = Accs,
	NewGlobs  = Globs.


%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% AccBasic

acc_basic( AccBasic, _UI, Accs, NewAccs, Globs, NewGlobs, AccsFrame,
	   _Ini,  _Fin ) :-
	var( AccBasic ),
	!,
	edcg_error("A variable occuring in the wrong place to the right of a `with'.", [] ),
	AccsFrame = [],
	NewAccs   = Accs,
	NewGlobs  = Globs.

% AccBasic --> Acc => Acc                  --------------------------------

acc_basic( Acc1 => Acc2, UI, Accs, NewAccs, Globs, NewGlobs, AccsFrame,
	   Ini, Fin ) :-
        acc( Acc1, UI,   Accs,    TmpAccs, Globs,    TmpGlobs, AccsFrame1, 
             Ini1, Fin1 ),
	acc( Acc2, var, TmpAccs, NewAccs, TmpGlobs, NewGlobs, AccsFrame2, 
             Ini2, Fin2 ),
        !,
	( Fin1 = Ini2, Ini = Ini1, Fin = Fin2
	  -> true
          ;  edcg_error("`~w => ~w', Initialization failed.", [Acc1, Acc2])
        ),
	merge_new_acc_frames( AccsFrame1, AccsFrame2, AccsFrame ).

% AccBasic --> Acc := Acc                   --------------------------------

acc_basic( Acc1 := Acc2, UI, Accs, NewAccs, Globs, NewGlobs, AccsFrame, 
           Ini, Fin ) :-
	acc( Acc1, var, Accs,    TmpAccs, Globs,    TmpGlobs, AccsFrame1, 
             Ini1, Fin1 ),
	acc( Acc2, UI, TmpAccs, NewAccs, TmpGlobs, NewGlobs, AccsFrame2, 
             Ini2, Fin2 ),
        !,
	( Ini1 = Ini2, Ini = Ini1, Fin1 = Fin2, Fin = Fin1
	  -> true
          ;  edcg_error("`~w := ~w', Initialization failed.", [Acc1, Acc2])
        ),
	merge_new_acc_frames( AccsFrame1, AccsFrame2, AccsFrame ).

% AccBasic --> Acc = Acc                   --------------------------------

acc_basic( Acc1 = Acc2, UI, Accs, NewAccs, Globs, NewGlobs, AccsFrame, 
           Ini, Fin ) :-
	acc( Acc1, UI, Accs,    TmpAccs, Globs,    TmpGlobs, AccsFrame1, 
             Ini1, Fin1 ),
	acc( Acc2, UI, TmpAccs, NewAccs, TmpGlobs, NewGlobs, AccsFrame2, 
             Ini2, Fin2 ),
        !,
	( Ini1 = Ini2, Ini = Ini1, Fin1 = Fin2, Fin = Fin1
	  -> true
          ;  edcg_error("`~w = ~w', Initialization failed.", [Acc1, Acc2])
        ),
	merge_new_acc_frames( AccsFrame1, AccsFrame2, AccsFrame ).

% AccBasic --> AccSpec                     --------------------------------

acc_basic( Acc, UI, Accs, NewAccs, Globs, NewGlobs, AccsFrame, Ini, Fin ) :-
        \+ Acc = (_=_),
	\+ Acc = (_=>_),
	NewAccs   = Accs,
	NewGlobs  = Globs,
	acc_spec( Acc, UI, AccsFrame, Ini, Fin ).


%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% AccSpec

acc_spec( AccSpec, _UI, AccsFrame, _Ini,  _Fin ) :-
	var( AccSpec ),
	!,
	edcg_error("A variable occuring in the wrong place to the right of a `with'.", [] ),
	AccsFrame = [].

% AccSpec  --> AccName                     --------------------------------

acc_spec( AccName, UI, AccsFrame, Ini, Fin ) :-
	acc_name( AccName, UI, AccsFrame, Ini, Fin ),
        !.

% AccSpec  --> acc(Ini,Fin)                --------------------------------

acc_spec( AccIF, _UI, AccsFrame, Ini, Fin ) :-
	functor( AccIF, AccName, 2 ),
	acc_name( AccName, var, AccsFrame, Ini, Fin ),
	!,                                      % Ini & Fin will be two fresh 
	arg( 1, AccIF, Ini ),                   % vars. Unifying them with
	arg( 2, AccIF, Fin ).                   % the given values is OK.


% AccSpec  --> acc(Fin)                    --------------------------------

acc_spec( AccFin, UI, AccsFrame, Ini, Fin ) :-
	functor( AccFin, AccName, 1 ),
	acc_name( AccName, UI, AccsFrame, Ini, Fin ),
	!,                                      % Ini & Fin will be two fresh 
	arg( 1, AccFin, Fin ).                  % vars. Unifying them with
	                                        % the given values is OK.


%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% AccName

acc_name( AccName, _UI, _AccsFrame, _Ini, _Fin ) :-
	var( AccName ),
	!,
	edcg_error("A variable occuring in the wrong place to the right of a `with'.", [] ),
	fail.

% AccName  --> acc                         --------------------------------

acc_name( AccName, UI, AccsFrame, Ini, Fin ) :-
	is_acc_name( AccName ),
	( UI == init  -> acc_default_init_value( AccName, DefInit ),
                         ( DefInit = no_init_value 
                           -> edcg_error( "Thread `~w' does not have a default initial value!", [AccName] )
                           ; DefInit = init_value(Ini)
                         )
	; UI == var  -> true % I.e. Ini is left uninstantiated.
	),
	make_accs_frame( AccName, Ini, Fin, AccsFrame ).


%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% PassTop

pass_top( PassTop, _I, _Pass, Globs, NewGlobs, PassFrame, _V ) :-
	var( PassTop ),
	!,
	edcg_error("A variable occuring in the wrong place to the right of a `with'.", [] ),
	PassFrame = [],
	NewGlobs  = Globs.

% PassTop --> PassBasic                    --------------------------------

pass_top( PassTop, I, Pass, Globs, NewGlobs, PassFrame, V ) :-
	pass_basic( PassTop, I, Pass, Globs, NewGlobs, PassFrame, V ).


%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% Pass

pass( PassArg, _I, _Pass, Globs, NewGlobs, PassFrame, _V ) :-
	var( PassArg ),
	!,
	edcg_error("A variable occuring in the wrong place to the right of a `with'.", [] ),
	PassFrame = [],
	NewGlobs  = Globs.

% Pass --> PassBasic                       --------------------------------

pass( PassArg, I, _Pass, Globs, NewGlobs, PassFrame, V ) :-
	pass_basic( PassArg, I, _Pass, Globs, NewGlobs, PassFrame, V ),
	!.

% Pass --> glob(PassName)                  --------------------------------

pass( glob(PassName), I, Pass, Globs, NewGlobs, PassFrame, V ) :-
        ( I = var
	  ->  edcg_warning("Trying to initialize a global reference glob(~w)", [PassName] )
          ; true
	),
	is_pass_name( PassName ),
	!,
	( pass_lookup( PassName, Pass, V )
          -> ( memberchk( PassName, Globs )
               -> NewGlobs  = Globs
               ;  NewGlobs  = [PassName|Globs]
             )
          ;  edcg_error( "`glob(~w)', There is no global passed arg ~w",
                         [PassName,PassName]),
             NewGlobs  = Globs
        ),
	PassFrame = [].

pass( @(V), _I, __Pass, Globs, NewGlobs, PassFrame, V ) :-
	PassFrame = [],
	NewGlobs  = Globs.

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% PassBasic

pass_basic( PassBasic, _I, __Pass, Globs, NewGlobs, PassFrame, _V ) :-
	var( PassBasic ),
	!,
	edcg_error("A variable occuring in the wrong place to the right of a `with'.", [] ),
	PassFrame = [],
	NewGlobs  = Globs.

% PassBasic --> Pass := Pass                --------------------------------

pass_basic( Pass1 := Pass2, _I, _Pass, Globs, NewGlobs, PassFrame, V ) :-
	pass( Pass1, var, Pass, Globs,    TmpGlobs, PassFrame1, V1 ),
	pass( Pass2, init, Pass, TmpGlobs, NewGlobs, PassFrame2, V2 ),
	!,
	( V1 = V2
	  -> true
          ;  edcg_error("`~w := ~w', Initialization failed.", [Pass1, Pass2])
        ),
	V = V1,
	merge_new_pass_frames( PassFrame1, PassFrame2, PassFrame ).

% PassBasic --> Pass = Pass                --------------------------------

pass_basic( Pass1 = Pass2, _I, _Pass, Globs, NewGlobs, PassFrame, V ) :-
	pass( Pass1, init, Pass, Globs,    TmpGlobs, PassFrame1, V1 ),
	pass( Pass2, init, Pass, TmpGlobs, NewGlobs, PassFrame2, V2 ),
	!,
	( V1 = V2
	  -> true
          ;  edcg_error("`~w = ~w', Initialization failed.", [Pass1, Pass2])
        ),
	V = V1,
	merge_new_pass_frames( PassFrame1, PassFrame2, PassFrame ).

% PassBasic --> PassSpec                   --------------------------------

pass_basic( PassSpec, I, __Pass, Globs, NewGlobs, PassFrame, V ) :-
	\+ PassSpec = (_=_),
	!,
	NewGlobs  = Globs,
	pass_spec( PassSpec, I, PassFrame, V ).


%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% PassSpec

pass_spec( PassSpec, _I, __Pass, PassFrame, _V ) :-
	var( PassSpec ),
	!,
	edcg_error("A variable occuring in the wrong place to the right of a `with'.", [] ),
	PassFrame = [].

% PassSpec  --> PassName                   --------------------------------

pass_spec( PassName, I, PassFrame, V ) :-
	pass_name( PassName, I, PassFrame, V ),
	!.


% PassSpec  --> pass(V)                    --------------------------------

pass_spec( PassV, _I, PassFrame, V ) :-
	functor( PassV, PassName, 1 ),
	pass_name( PassName, var, PassFrame, V ), % V will be a fresh var.
	!,                                         % Unifying it with the
	arg( 1, PassV, V ).                        % given value is OK.

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% PassName

ass_name( PassName, _I, _Pass, _PassFrame, _V ) :-
	var( PassName ),
	!,
	edcg_error("A variable occuring in the wrong place to the right of a `with'.", [] ),
	fail.

% PassName  --> pass                       --------------------------------

pass_name( PassName, I, PassFrame, V ) :-
	is_pass_name( PassName ),
	( I == init  -> pass_default_init_value( PassName, DefInit ),
                        ( DefInit = no_init_value 
                          -> edcg_error( "`~w' does not have a default initial value!", [PassName] )
			  ; DefInit = init_value(V)
			)
        ; I == var  -> true % I.e. V is left uninstantiated.
	),
	make_pass_frame( PassName, V, PassFrame ).


%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%


% Generic utilities:

% Match arguments L, L+1, ..., H of the predicates P and Q:
'_match'(L, H, _, _) :- L >  H, !.
'_match'(L, H, P, Q) :- L =< H, !,
        arg(L, P, A),
        arg(L, Q, A),
        L1 is L+1,
        '_match'(L1, H, P, Q).

% This is not used at the moment:
% Flatten a conjunction and terminate it with 'true':
'_flat_conj'(Conj, FConj) :- '_flat_conj'(Conj, FConj, true).

'_flat_conj'(true, X, X).
'_flat_conj'((A,B), X1, X3) :-
        '_flat_conj'(A, X1, X2),
        '_flat_conj'(B, X2, X3).
'_flat_conj'(G, (G,X), X) :-
        \+G=true,
        \+G=(_,_).
% Untested idea:
% Replace the last clause with
%   '_flat_conj'(G, Conj, X) :-
%         \+G=true,
%         \+G=(_,_),
%         ( X == true
%           -> Conj = G
%           ;  Conj = (G,X)
%         ).
% to get rid of the last 'true' if possible.

% memberchk/2 and append/3 exists in library(lists).

memberchk(X, [X|_]) :- !.
memberchk(X, [_|L]) :- memberchk(X, L).

'_append'([], L, L).
'_append'([X|L1], L2, [X|L3]) :- '_append'(L1, L2, L3).

'_list'(L) :- nonvar(L), L=[_|_], !.
'_list'(L) :- L==[], !.

'_make_list'(A, [A]) :- \+'_list'(A), !.
'_make_list'(L,   L) :-   '_list'(L), !.

% replace/4 exists in library(lists) under the name substitute/4:
% replace(E, RepE, List, RepList) == substitute(E, List, RepE, RepList)

% replace(Elem, RepElem, List, RepList)
'_replace'(_, _, [], []).
'_replace'(A, B, [A|L], [B|R]) :- !,
        '_replace'(A, B, L, R).
'_replace'(A, B, [C|L], [C|R]) :-
        \+C=A, !,
        '_replace'(A, B, L, R).


% Returns the module being loaded at the time when 
% term_expansion/2 is called, or in case the module 
% being loaded is 'user' then a term `file(Filename)' 
% is returned instead.
/* This is now not used:
loading_module_or_file(ModuleOrFile) :-
        (prolog_load_context(module, Module)
	  -> ( Module = user
	       -> ( prolog_load_context(file, Filename)
                    -> ModuleOrFile = file(Filename)
                    ;  ModuleOrFile = file('$terminal')
		  )
	       ;  ModuleOrFile = Module
	     )
	  ;  ModuleOrFile = debugging
        ).
*/

loading_module_and_file( Module, FileName ) :-
        ( prolog_load_context( module, Module   ),
	  prolog_load_context( file,   FileName )
        ; % This proably means we're debugging.
          Module = user,
	  FileName = _
	),
	!. % prolog_load_context/2 backtracks over all files 
           % currently beein loaded.  We only want the most current 
           % one, and fail it that was not good enough. Thus the cut.

loading_module( Module ) :-
        ( prolog_load_context( module, Module )
        ; % This proably means we're debugging.
          Module = user
	),
	!. % prolog_load_context/2 backtracks over all files 
           % currently beein loaded.  We only want the most current 
           % one, and fail it that was not good enough. Thus the cut.

:- begin_version(sicstus3).

loading_file_position( LineNo ) :-
	prolog_load_context( stream, Stream ),
	line_count( Stream, LineNo ).

:- end_version(sicstus3).


%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% Declarations.
%
% A programmer can define hidden arguments and associate them
% with predicates using the following declarations:
%
% :- thread(Acc, Term, Old, New, Joiner).
% :- thread(Acc, Term, Old, New, Joiner, Init).
%
% :- thread_bwd(Acc, Term, Old, New, Joiner).
% :- thread_bwd(Acc, Term, Old, New, Joiner, Init).
%
% :- thread_pass(Pass).
% :- thread_pass(Pass, PStart).
%
% :- thread_method(Method, Old, New, Joiner).
%
% :- thread_pred(Pred/Arity,Accs).



edcg_acc( Acc, Methods, Dir, Init ) :-
  (    \+ atomic( Acc )
    -> edcg_error("thread(~w...): `~w' is not a name", [Acc,Acc])
    ;  is_acc_name(Acc)
    -> edcg_warning("Accumlator `~w' defined more than once!", [Acc])
    ;  is_pass_name(Acc)
    -> edcg_warning("`~w' defined both as passed argument and accumulator!", 
                    [Acc])
    ;  fix_methods( Methods, DefaultMethod, MethodList ),

       loading_module_and_file(Mod,File),
       assert( acc_info(Acc,Mod,File,Dir,DefaultMethod,MethodList,Init) )
  ).


edcg_pass(Pass, PStart) :-
   (    \+ atomic( Pass )
     -> edcg_error("thread_pass(~w...): ~w is not a name", [Pass,Pass])
     ;  is_pass_name(Pass)
     -> edcg_warning("Passed arg. '~w' defined more than once!", [Pass])
     ;  is_acc_name(Pass)
     -> edcg_warning("'~w' defined both as accumulator and passed argument!", 
                     [Pass])
     ;  loading_module_and_file(Mod,File),
	assert( pass_info(Pass,Mod,File,PStart) )
    ).


edcg_pred( PredArity, Accs ) :-
	( PredArity = Pred/Arity,
	  atomic( Pred )
          -> ( \+ is_edcg_pred( Pred, Arity )
	        -> loading_module_and_file( Mod, File ),
	           assert( pred_info(Pred,Arity,Mod,File,Accs) )
                ;  edcg_error("Hidden args. for predicate '~w/~w' declared more than once!", [Pred,Arity])
	     )
	  ;  edcg_error("thread_pred(~w, ~w): `~w' does not have the form '<name>/<arity>'.", [PredArity,Accs,PredArity])
	).



edcg_method( MethodTerm, Old, New, Joiner ) :-
	( nonvar( MethodTerm ),
          distinct_var_args( MethodTerm )
             ->
                loading_module_and_file( Mod, File ),
	        functor( MethodTerm, MName, MArity ),
                ( acc_method_arity( MName, _ )
                  -> edcg_error( "thread_method(~w, ~w, ~w, ~w): Method `~w' defined more than once.", [MethodTerm,Old,New,Joiner,MName] )
                  ;  assert( method_info(MethodTerm,MName,MArity,Mod,File,Old,New,Joiner) )
		)
        ; var( MethodTerm )
             -> edcg_error( "thread_method(~w, ~w, ~w, ~w): The first argument must be a method name (with args).", [MethodTerm,Old,New,Joiner] )
	; % else
                edcg_error( "thread_method(~w, ~w, ~w, ~w): The arguments of the method must be distinct variables.", [MethodTerm,Old,New,Joiner] )
        ).


% move these somewhere else!

distinct_var_args( Term ) :-
	Term =.. [_|Args],
        distinct_vars( Args, [] ).

distinct_vars( [], _ ).
distinct_vars( [Term|Terms], Vars ) :-
	var( Term ),
        non_literally_member( Term, Vars ),
	distinct_vars( Terms, [Term|Vars] ).

non_literally_member( X, L ) :-
	non_literally_member1( L, X ).

non_literally_member1( [], _ ).
non_literally_member1( [Y|L], X ) :- 
	X \== Y,
	non_literally_member1( L, X ).

% fix_methods( Methods, DefaultMethod, MethodList )
%
% Methods is the term used by the programmer to declare which methods 
% should be used with an accumulator. It can be either

fix_methods( Methods, DefaultMethod, MethodList ) :-
	var( Methods ),
	!,
	DefaultMethod = no_default_method,
	MethodList = [].
fix_methods( [], DefaultMethod, MethodList ) :-
	!,
	DefaultMethod = no_default_method,
	MethodList = [].
fix_methods( [DefMethod|Methods], DefaultMethod, MethodList ) :-
	!,
        %
        % First we fix the default method:
        %
	( atom(DefMethod)
          ->  DefaultMethod = named_method( DefMethod ),
              MethodList = [DefMethod|Methods]
        ; DefMethod = method(T,Old,New,Updater)
          ->  DefaultMethod = anon_method(T,Old,New,Updater),
	      MethodList = Methods
        ; % else ->
	      edcg_error("`~w' does not describe a default method!", [DefMethod] ),
	      DefaultMethod = no_default_method,
	      MethodList = Methods
        ),
        %
        % Then we check the rest of the methods:
        %
	check_method_list( MethodList ).
fix_methods( DefMethod, DefaultMethod, MethodList ) :-
      % nonvar(DefMethod),
	( atom(DefMethod)
          ->  DefaultMethod = named_method( DefMethod ),
	      MethodList = [DefMethod]
        ; DefMethod = method(T,Old,New,Updater)
          ->  DefaultMethod = anon_method(T,Old,New,Updater),
	      MethodList = []
        ; % else ->
	      edcg_error("`~w' does not describe a default method!", [DefMethod] ),
	      DefaultMethod = no_default_method,
	      MethodList = []
        ).



check_method_list( [] ).
check_method_list( [Method|Methods] ) :-
	atom( Method ),
	!,
	check_method_list( Methods ).
check_method_list( [Method|Methods] ) :-
	edcg_warning( "`~w' is not a valid method specification.", [Method] ),
	check_method_list( Methods ).




%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% The database for information about hidden args.
% ----------------------------------------------------------------------
% The DB format
%
% The database is located in this module (edcg) and contains facts 
% of the following form:
%
%   acc_info(Acc,Module,File,Direction,DefaultMethod,MethodList,Init).
%   pass_info(Pass,Module,File,PStart).
%   pred_info(Pred,Arity,Module,File,Accs)
%   method_info(MethodTerm,MethodName,MethodArity,Mod,File,Old,New,Joiner)
%
% (For the moment the meaning of the arguments are not revealed here, 
%  but perhaps it should?)
%
% The pass_info/4 and pred_info/5 relations are initially empty, but
% the acc_info/7 relation should always contain a rule for the `dcg'
% accumulator. 

:- dynamic acc_info/7, pass_info/4, pred_info/5, method_info/8.


add_dcg_rule :-
   assert( acc_info(dcg,_Mod,_File,backward,anon_method(Term,Old,New,New=[Term|Old]),[],init_value([])) ).

:- add_dcg_rule.

add_builtin_methods :-
   assert(method_info(value(V),value,1,_Mod,_File,Thread,Thread,V=Thread)).

:- add_builtin_methods.

% When recompiling a module which contains accumulator declarations, 
% old information concerning this module must be removed from the 
% data base.

reinitialize_db( Module, FileName ) :-

	retractall( acc_info(_,Module,FileName,_,_,_,_)      ),
	retractall( pass_info(_,Module,FileName,_)           ),
	retractall( pred_info(_,_,Module,FileName,_)         ),
	retractall( method_info(_,_,_,Module,FileName,_,_,_) ),
	add_dcg_rule,
	add_builtin_methods.

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% DB primitives

% Accumulators.

is_acc_name( AccName ) :-
	atomic(AccName),
	loading_module( Module ),
	acc_info(AccName, Module, _, _, _, _, _).
	

acc_default_init_value( AccName, Init ) :-
	loading_module( Module ),
	acc_info(AccName, Module, _, _, _, _, Init).
	

acc_direction( AccName, Dir ) :-
	loading_module( Module ),
	acc_info(AccName, Module, _, Dir, _, _, _).


% Passed Args.

is_pass_name( PassName ) :-
	atomic( PassName ),
	loading_module( Module ),
	pass_info( PassName, Module, _, _).


pass_default_init_value( PassName, PStart ) :-
	loading_module( Module ),
	pass_info(PassName, Module, _File, PStart).
	

% Predicates.

% Give a list of G's hidden parameters.
%  Always succeeds (possibly after emiting an error message).
%  An explicit module is OK if the predicate does not have hidden params.

'_has_hidden'(G, GList) :-
	loading_module( GModule ),
	'_has_hidden'(G, GModule, GList).


'_has_hidden'(G, GModule, GList) :-
	\+ G = _:_,
        functor(G, GName, GArity),
        pred_info(GName, GArity, GModule, _File, GList).
'_has_hidden'(G, GModule, []) :-
	\+ G = _:_,
        functor(G, GName, GArity),
        \+pred_info(GName, GArity, GModule, _File, _).
'_has_hidden'(GModule1:G, GModule2, GList) :-
	GModule1 = GModule2,
        '_has_hidden'(G, GModule2, GList).
'_has_hidden'(GModule1:G, GModule2, []) :-
	\+ GModule1 = GModule2,
        functor(G, GName, GArity),
        ( pred_info(GName, GArity, GModule1, _File, []), !
        ; \+ pred_info(GName, GArity, GModule1, _File, _)
        ).
'_has_hidden'(Module1:G, Module2, GList) :-
	\+ Module1 = Module2,
        functor(G, GName, GArity),
        pred_info(GName, GArity, Module1, _File, GList),
	edcg_error("Trying to use ~w:~w/~w, which has hidden arguments, in an EDCG-clause in module ~w.",
                   [Module1,GName,GArity,Module2]).


is_edcg_pred(Pred, Arity) :-
	loading_module( Module ),
	pred_info(Pred,Arity,Module,_File,_).


% Methods

acc_method( MethodTerm, Old, New, Joiner ) :-
	loading_module( Mod ),
	method_info(MethodTerm,_,_,Mod,_,Old,New,Joiner).

acc_method_arity( MethodName, MethodArity ) :-
	loading_module( Mod ),
	method_info(_,MethodName,MethodArity,Mod,_,_,_,_).
	
default_acc_method( A, Term, Old, New, Updater ) :-
	loading_module( Module ),
	acc_info(A,Module,_File,_Dir,DefMethod,_,_),
	( DefMethod = named_method( MethodName )
            -> method_info(MethodTerm,MethodName,MethodArity,Module,_,Old,New,Updater),
	       ( MethodArity = 1
                   -> arg(1,MethodTerm,Term)
                   ;  edcg_error("The default method of accumulator `~w' must take exactly one argument (the current default method `~w' takes ~w arguments).",
                                 [A,MethodName,MethodArity] )
               )
	    ;  DefMethod = anon_method(Term,Old,New,Updater)
        ).


%------------------

% check if hidden args declared for the predicate of P (DefAccNames)
% are consistent with currently "active" hidden args (Accs, Pass),
% and with hidden args explicitly initialized for a goal G (InitAccs) 

% This predicate is currently not used.

check_init_accs(DefAccNames, Accs, Pass, InitAccs, G) :-
	acc_names(InitAccs, InitAccNames),
	check_implicit_init(DefAccNames, Accs, Pass, InitAccNames, G),
	check_init_def(InitAccNames, DefAccNames, G).

acc_names([], []).
acc_names([Acc|Accs], [AccName|AccNames]) :-
	functor(Acc, AccName, _),
	acc_names(Accs, AccNames).

check_implicit_init([], _, _, _, _).
check_implicit_init([AN|DefAccNames], Accs, Pass, InitAccNames, G) :-
	memberchk(AN, InitAccNames),
	!,
	check_implicit_init(DefAccNames, Accs, Pass, InitAccNames, G).
check_implicit_init([AN|DefAccNames], Accs, Pass, InitAccNames, G) :-
	memberchk(acc(AN,_,_), Accs),
	!,
	check_implicit_init(DefAccNames, Accs, Pass, InitAccNames, G).
check_implicit_init([AN|DefAccNames], Accs, Pass, InitAccNames, G) :-
	memberchk(pass(AN,_), Pass),
	!,
	check_implicit_init(DefAccNames, Accs, Pass, InitAccNames, G).
check_implicit_init([AN|DefAccNames], Accs, Pass, InitAccNames, G) :-
        %
	% This is a very uninfomative warning message. There should
        % be an indication of *where*  the problem occurs.
        %
	edcg_warning("Hidden arg. ~w implicitly initialized for goal ~p.",
                     [AN,G]),
	check_implicit_init(DefAccNames, Accs, Pass, InitAccNames, G).

check_init_def([],_,_).
check_init_def([InitAcc|InitAccs], DefAccs, G) :-
	memberchk(InitAcc, DefAccs),
	!,
	check_init_def(InitAccs, DefAccs, G).
check_init_def([InitAcc|InitAccs], DefAccs, G) :-
        %
	% This is a very uninfomative warning message. There should
        % be an indication of *where*  the problem occurs.
        %
	edcg_warning("Explicitly initializing a hidden arg. ~q for goal ~p not defined for predicate.", [InitAcc,G]),
	check_init_def(InitAccs, DefAccs, G).


%------------------

:- begin_version(sicstus3). 

edcg_error(ErrorMsg, Args) :-
	loading_file_position( LineNo ),
	format(user_error, "~N{Threads Error (line: ~w): ", [LineNo] ),
	format(user_error, ErrorMsg,                     Args     ),
	format(user_error, "}~n",                        []       ).

edcg_warning(WarningMsg, Args) :-
	loading_file_position( LineNo ),
	format(user_error, "~N{Threads Warning (line: ~w): ", [LineNo]   ),
	format(user_error, WarningMsg,                     Args ),
	format(user_error, "}~n",                          []   ).

:- end_version(sicstus3). 

:- begin_version(sicstus2).

edcg_error(ErrorMsg, Args) :-
	format(user_error, "~N{Threads Error: ", [] ),
	format(user_error, ErrorMsg,             Args     ),
	format(user_error, "}~n",                []       ).

edcg_warning(WarningMsg, Args) :-
	format(user_error, "~N{Threads Warning: ", []   ),
	format(user_error, WarningMsg,             Args ),
	format(user_error, "}~n",                  []   ).

:- end_version(sicstus2).


%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% prolog_load_context/2 is a builtin in SICStus 3. 
% If this file is used with SICStus 2.1 uncomment the follwing:

:- begin_version(sicstus2). %-------------------------------------------

prolog_load_context(file, Filename) :-
	current_stream(Filename,read,_Stream).
prolog_load_context(module, Module) :-
	prolog_flag(typein_module, Module).

:- end_version(sicstus2). %---------------------------------------------



%-------
% These clauses must be the last one in this file, or at least after
% any of the predicates that it (indirectly) uses.

term_expansion((H:-_), _) :-
	'_has_hidden'(H,[_|_]),
	functor(H,P,A),
	edcg_warning("~w/~w defined by a ':-' clause although it has hidden args.", [P,A]),
	fail.

term_expansion(Fact, _) :-
	\+ Fact = (_:-_),
	'_has_hidden'(Fact,[_|_]),
	functor(Fact,P,A),
	edcg_warning("~w/~w defined by a 'fact clause' although it has hidden args.", [P,A]),
	fail.

