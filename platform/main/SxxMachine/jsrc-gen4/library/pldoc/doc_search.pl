/*  Part of SWI-Prolog

    Author:        Jan Wielemaker
    E-mail:        J.Wielemaker@vu.nl
    WWW:           http://www.swi-prolog.org
    Copyright (c)  2006-2015, University of Amsterdam
    All rights reserved.

    Redistribution and use in source and binary forms, with or without
    modification, are permitted provided that the following conditions
    are met:

    1. Redistributions of source code must retain the above copyright
       notice, this list of conditions and the following disclaimer.

    2. Redistributions in binary form must reproduce the above copyright
       notice, this list of conditions and the following disclaimer in
       the documentation and/or other materials provided with the
       distribution.

    THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
    "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
    LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS
    FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE
    COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
    INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
    BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
    LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
    CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
    LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN
    ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
    POSSIBILITY OF SUCH DAMAGE.
*/

:- module(pldoc_search,
          [ search_form//1,             % +Options, //
            search_reply//2,            % +Search, +Options, //
            matching_object_table//2    % +Objects, +Options, //
          ]).
:- use_module(library(http/html_write)).
:- use_module(library(http/html_head)).
:- use_module(library(dcg/basics)).
:- use_module(library(occurs)).
:- use_module(library(option)).
:- use_module(library(pairs)).
:- use_module(doc_process).
:- use_module(doc_html).
:- use_module(doc_index).
:- use_module(doc_util).
:- include(hooks).

/** <module> Search form and reply

@tbd    Advanced search field

                * Limit to a directory
                * Whole-word search
*/

:- predicate_options(search_form//1, 1,
                     [ for(atom),
                       search_in(oneof([all,noapp,app,man])),
                       search_match(oneof([name,summary])),
                       search_options(boolean)
                     ]).
:- predicate_options(search_reply//2, 2,
                     [ resultFormat(oneof([summary,long])),
                       search_in(oneof([all,noapp,app,man])),
                       search_match(oneof([name,summary])),
                       header(boolean),
                       edit(boolean),
                       pass_to(pldoc_index:doc_links//2, 2)
                     ]).

%!  search_form(+Options)//
%
%   Create  a  search  input  field.  The   input  field  points  to
%   =|/search?for=String|= on the current server.  Options:
%
%           * title(Title)

search_form(Options) -->
    { (   option(for(Value), Options)
      ->  Extra = [value(Value)]
      ;   Extra = []
      ),
      option(search_in(In), Options, all),
      option(search_match(Match), Options, summary)
    },
    html(form([ id('search-form'),
                action(location_by_id(pldoc_search))
              ],
              [ div([ \search_field([ name(for),
                                      id(for)
                                    | Extra
                                    ])
                    ]),
                \search_options(In, Match, Options)
              ])).

search_options(In, Match, Options) -->
    { option(search_options(false), Options) },
    !,
    hidden(in, In),
    hidden(match, Match).
search_options(In, Match, _Options) -->
    html(div(class('search-options'),
             [ span(class('search-in'),
                    [ \radio(in, all, 'All', In),
                      \radio(in, app, 'Application', In),
                      \radio(in, man, 'Manual', In)
                    ]),
               span(class('search-match'),
                    [ \radio(match, name, 'Name', Match),
                      \radio(match, summary, 'Summary', Match)
                    ]),
               span(class('search-help'),
                    [ a(href(location_by_id(pldoc_package)+'pldoc.html#sec:browser'),
                        'Help')
                    ])
             ])).


%!  search_field(+Options)// is det.
%
%   Hookable predicate to display the   search field. Hookability is
%   provided  to  experiment  with    auto-completion  outside  this
%   package.

search_field(Options) -->
    prolog:doc_search_field(Options),
    !.
search_field(Options) -->
    html([ input(Options, []),
           input([ id('submit-for'),
                   type(submit),
                   value('Search')
                 ])
         ]).

radio(Radio, Field, Label, In) -->
    {   Field == In
    ->  Extra = [checked]
    ;   Extra = []
    },
    html([ input([ type(radio),
                   name(Radio),
                   value(Field)
                 | Extra
                 ]),
           Label
         ]).

hidden(Name, Value) -->
    html(input([type(hidden), name(Name), value(Value)])).

%!  search_reply(+For, +Options)// is det.
%
%   Generate a reply searching for For.  Options include
%
%           * resultFormat(Format)
%           If =summary= (default), produce a summary-table.  If
%           =long=, produce full object descriptions.
%
%           * search_in(In)
%           Determine which databases to search.  One of
%           =all=, =app=, =man=
%
%           * search_match(Match)
%           What part of the object to match. One of =name=,
%           =summary=
%
%           * header(+Boolean)
%           If =false=, suppress the header.

:- html_meta
    search_header(+, html, +, ?, ?).

search_reply(For, Options) -->
    { var(For) ; For == '' },
    !,
    search_header('', 'Using PlDoc search', Options),
    html([ ul( class('search-help'),
               [ li([ 'If you pause typing, the search box will display ',
                      'an auto completion list.  Selecting an object jumps ',
                      'immediately to the corresponding documentation.'
                    ]),
                 li([ 'Searching for ', i('Name/Arity'), ', ',
                      i('Name//Arity'), ', ', i('Name'), ' or ',
                      i('C-function()'), ' ensures that ',
                      'matching definitions appear first in the search ',
                      'results'
                    ]),
                 li([ 'Other searches search through the name and summary ',
                      'descriptions in the manual.'
                    ])
               ])
         ]).
search_reply(For, Options) -->
    { search_doc(For, PerCategory, Options),
      PerCategory \== [],
      option(resultFormat(Format), Options, summary)
    },
    !,
    search_header(For, [ 'Search results for ',
                         span(class(for), ['"', For, '"'])
                       ],
                  Options),
    indexed_matches(Format, PerCategory, Options).
search_reply(For, Options) -->
    search_header(For, 'No matches', Options).


search_header(_For, _Title, Options) -->
    { option(header(false), Options) },
    !,
    html_requires(pldoc).
search_header(For, Title, Options) -->
    html_requires(pldoc),
    doc_links('', [for(For)|Options]),
    html(h1(class('search-results'), Title)).

%!  matching_object_table(+Objects, +Options)// is det.
%
%   Show a list of matching objects,   similar  to a result-set from
%   search.

matching_object_table(Objects, Options) -->
    { maplist(obj_cat_sec, Objects, Pairs),
      group_hits(Pairs, Organized),
      option(format(Format), Options, summary)
    },
    indexed_matches(Format, Organized, Options).

obj_cat_sec(Object, Cat-(Section-Object)) :-
    prolog:doc_object_summary(Object, Cat, Section, _Summary).


indexed_matches(Format, PerCategory, Options) -->
    { count_matches(PerCategory, Matches)
    },
    html([ div(class('search-counts'),
               [ Matches, ' matches; ',
                 \count_by_category(PerCategory)
               ])
         | \matches(Format, PerCategory, Options)
         ]).

count_by_category([]) -->
    [].
count_by_category([Cat-PerFile|T]) -->
    { count_category(PerFile, Count),
      atom_concat(#, Cat, HREF)
    },
    html([ a(href(HREF), \category_title(Cat)),
           ': ',
           Count
         ]),
    (   {T == []}
    ->  []
    ;   html(', '),
        count_by_category(T)
    ).

count_matches([], 0).
count_matches([_-Cat|T], Count) :-
    count_matches(T, Count0),
    count_category(Cat, N),
    Count is Count0 + N.

count_category([], 0).
count_category([_-Objs|T], Count) :-
    count_category(T, Count0),
    length(Objs, N),
    Count is Count0 + N.

%!  matches(+Format, +PerCategory, +Options)// is det
%
%   Display search matches according to Format.
%
%   @param PerCategory List of File-Objects

matches(long, PerCategory, Options) -->
    long_matches_by_type(PerCategory, Options).
matches(summary, PerCategory, Options) -->
    html(table(class(summary),
               \short_matches_by_type(PerCategory, 1, Options))).


long_matches_by_type([], _) -->
    [].
long_matches_by_type([Category-PerFile|T], Options) -->
    category_header(Category, Options),
    long_matches(PerFile, Options),
    long_matches_by_type(T, Options).


long_matches([], _) -->
    [].
long_matches([File-Objs|T], Options) -->
    file_header(File, Options),
    objects(Objs, Options),
    long_matches(T, Options).

category_header(Category, _Options) -->
    html(h1(class(category), \category_title(Category))).

short_matches_by_type([], _, _) -->
    [].
short_matches_by_type([Category-PerFile|T], Nth, Options) -->
    category_index_header(Category, Nth, Options),
    short_matches(PerFile, Options),
    { succ(Nth, Nth1) },
    short_matches_by_type(T, Nth1, Options).

short_matches([], _) -->
    [].
short_matches([File-Objs|T], Options) -->
    file_index_header(File, Options),
    object_summaries(Objs, File, Options),
    short_matches(T, Options).


category_index_header(Category, Nth, _Options) -->
    (   { Nth > 1 }
    ->  category_sep('category-top-sep')
    ;   []
    ),
    html(tr(th([class(category), colspan(3)],
               a(name(Category), \category_title(Category))))),
    category_sep('category-bottom-sep').

category_sep(Which) -->
    html(tr(th([class(Which), colspan(3)],
               &(nbsp)))).


category_title(Category) -->
    {   prolog:doc_category(Category, _Order, Title)
    ->  true
    ;   Title = Category
    },
    html(Title).

%!  search_doc(+SearchString, -PerType:list, +Options) is det.
%
%   Return matches of SearchString  as   Type-PerFile  tuples, where
%   PerFile is a list File-ListOfObjects.

search_doc(Search, PerType, Options) :-
    findall(Tuples, matching_object(Search, Tuples, Options), Tuples0),
    sort(Tuples0, Tuples),
    group_hits(Tuples, PerType).

group_hits(Tuples, PerType) :-
    group_pairs_by_key(Tuples, PerCat0),
    key_sort_order(PerCat0, PerCat1),
    keysort(PerCat1, PerCat2),
    pairs_values(PerCat2, PerCat),
    group_by_file(PerCat, PerType).

key_sort_order([], []).
key_sort_order([Cat-ByCat|T0], [Order-(Cat-ByCat)|T]) :-
    (   prolog:doc_category(Cat, Order, _Title)
    ->  true
    ;   Order = 99
    ),
    key_sort_order(T0, T).


group_by_file([], []).
group_by_file([Type-Tuples0|T0], [Type-ByFile|T]) :-
    keysort(Tuples0, Tuples),
    group_pairs_by_key(Tuples, ByFile),
    group_by_file(T0, T).


%!  matching_object(+SearchString, -Object, +Options) is nondet.
%
%   Object matches SearchString.  Options include
%
%           * search_in(In)
%           One of =all=, =app=, =man=.
%
%           * search_match(Match)
%           One of =name=, =summary=
%
%   @param Object   Term of the form File-Item
%   @tbd Deal with search syntax

matching_object(Search, Type-(Section-Obj), Options) :-
    atom_concat(Function, '()', Search),
    Obj = c(Function),
    option(search_in(In), Options, all),
    prolog:doc_object_summary(Obj, Type, Section, _),
    matching_category(In, Type).
matching_object(Search, Type-(Section-Obj), Options) :-
    (   atom_pi(Search, Obj0),
        qualify(Obj0, Obj)
    ;   catch(atom_to_term(Search, Obj, _), _, fail)
    ),
    nonvar(Obj),
    option(search_in(In), Options, all),
    prolog:doc_object_summary(Obj, Type, Section, _),
    matching_category(In, Type).
matching_object(Search, Match, Options) :-
    atom_length(Search, Len), Len > 1,
    atom_codes(Search, Codes),
    phrase(search_spec(For0), Codes),
    (   For0 = not(_)
    ->  throw(error(bad_search(only_not), _))
    ;   optimise_search(For0, For),
        exec_search(For, Match, Options)
    ).

qualify(Obj0, Obj) :-
    Obj0 = _:_,
    !,
    Obj = Obj0.
qualify(Obj, _:Obj).


%!  optimise_search(+Spec, -Optimised)
%
%   Optimise a search specification. Currently   only deals with the
%   simple case of  first  searching  for   a  negation  and  then a
%   positive term.

optimise_search(and(not(A0), B0), and(B, not(A))) :-
    !,
    optimise_search(A0, A),
    optimise_search(B0, B).
optimise_search(A, A).


%!  exec_search(+Spec, -Match, +Options) is nondet.
%
%   Spec is one of
%
%           * and(Spec, Spec)
%           Intersection of the specification
%
%           * not(Spec)
%           Negation of the specification

exec_search(and(A, B), Match, Options) :-
    !,
    exec_search(A, Match, Options),
    exec_search(B, Match, Options).
exec_search(Search, Type-(Section-Obj), Options) :-
    option(search_in(In), Options, all),
    option(search_match(Match), Options, summary),
    prolog:doc_object_summary(Obj, Type, Section, Summary),
    matching_category(In, Type),
    (   Search = not(For)
    ->  \+ (   Match == summary,
               apropos_match(For, Summary)
           ->  true
           ;   sub_term(S, Obj),
               atom(S),
               apropos_match(For, S)
           )
    ;   (   Match == summary,
            apropos_match(Search, Summary)
        ->  true
        ;   sub_term(S, Obj),
            atom(S),
            apropos_match(Search, S)
        )
    ).


matching_category(all, _).
matching_category(noapp, Category) :-
    !,
    Category \== application.
matching_category(app, application).
matching_category(man, manual).

%!  search_spec(-Search)// is det.
%
%   Break a search string from the user into a logical expression.

search_spec(Spec) -->
    blanks,
    prim_search_spec(A),
    blanks,
    (   eos
    ->  { Spec = A }
    ;   search_spec(B)
    ->  { Spec = and(A,B) }
    ).

prim_search_spec(Quoted) -->
    "\"", string(Codes), "\"",
    !,
    { atom_codes(Quoted, Codes)
    }.
prim_search_spec(Spec) -->
    nonblanks(Codes),
    {   Codes = [0'-,C0|Rest],
        code_type(C0, csym)
    ->  atom_codes(Word, [C0|Rest]),
        Spec = not(Word)
    ;   Codes \== [],
        atom_codes(Spec, Codes)
    }.


%!  object_summary(?Object, ?Category, ?Section, ?Summary) is nondet.
%
%   True  if  Object  is  summarised   by  Summary.  This  multifile
%   predicate can be extended  with   other  search  mechanisms. The
%   returned objects must be  handled   by  object_summaries//2  and
%   objects//2.
%
%   @param Category Atom describing the source.
%   @param Section  Reference to the context of Object.

prolog:doc_object_summary(Obj, Category, File, Summary) :-
    once(prolog_object(Obj)),
    current_prolog_flag(home, SWI),
    doc_comment(Obj0, File:_Line, Summary, _Comment),
    (   is_list(Obj0)
    ->  member(Obj, Obj0)
    ;   Obj = Obj0
    ),
    Obj \= _:module(_Title),                % HACK.  See ref_object//1
    (   sub_atom(File, 0, _, _, SWI)
    ->  Category = library
    ;   Category = application
    ).

prolog_object(Var) :- var(Var), !.
prolog_object(_/_).
prolog_object(_//_).
prolog_object(_:_/_).
prolog_object(_:_//_).
prolog_object(module(_)).


%!  doc_category(Name, SortOrder, Description) is nondet.
%
%   Describe the various  categories  of   search  results.  Used to
%   create the category headers  as  well   as  the  advanced search
%   dialog.
%
%   @param SortOrder        Ranges 0..100.  Lower values come first

prolog:doc_category(application, 20, 'Application').
prolog:doc_category(library,     80, 'System Libraries').


                 /*******************************
                 *             UTIL             *
                 *******************************/

%!  apropos_match(+Needle, +Haystick) is semidet.
%
%   True if Needle can be found   as a case-insensitive substring in
%   Haystick.

apropos_match(Needle, Haystack) :-
    sub_atom_icasechk(Haystack, _, Needle).
