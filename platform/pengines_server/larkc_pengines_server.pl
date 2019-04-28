:- module(larkc_pengines_server, [start_larkc_pengine_server/0]).

/** <module> The web server that serves the
 * larkc_client (which runs remotely)
 * The welcome handler
 *
 *      *:9880/
 *
 * is just to give a 200 OK
 *
 * actual work happens at
 *
 *    *:9880/pengines
 */

:- use_module(library(http/thread_httpd)).
:- use_module(library(http/http_dispatch)).
:- use_module(library(http/http_session)).
:- use_module(library(http/html_write)).
:- use_module(library(http/http_parameters)).
:- use_module(library(http/html_head)).
:- use_module(library(http/http_files)).
:- use_module(library(pengines)).

%:- use_module(game_interact).

:- use_module(library(sandbox)).
%:- use_module(pengine_sandbox:game_interact).

:- pengine_application(larkc_pengine_app).
:- use_module(larkc_pengine_app:larkc_api).

%% :- multifile pengines:authentication_hook/3.

%% pengines:authentication_hook(Request, larkc_pengine_app, _) :-
%% 	true. %% member(peer(ip(127,0,0,1)), Request).
%% pengines:authentication_hook(Request, larkc_pengine_app, _) :-
%% 	throw(http_reply(forbidden(/))).

%% :- multifile pengines:not_sandboxed/2.
%% pengines:not_sandboxed(_User, larkc_pengine_app).

%% :- multifile sandbox:safe_primitive/1.
%% :- multifile sandbox:safe_predicate/1.
%% sandbox:safe_predicate(user:cl_eval(_,_)).
%% sandbox:safe_predicate(cl_eval(_,_)).
%% sandbox:safe_primitive(user:cl_eval(_,_)).
%% sandbox:safe_primitive(cl_eval(_,_)).

:- multifile http:location/3.
:- dynamic   http:location/3.


http:location(js, '/js', []).
http:location(css, '/css', []).
http:location(img, '/img', []).
user:file_search_path(css, './css').
user:file_search_path(js, './js').
user:file_search_path(icons, './icons').

:- html_resource(style, [virtual(true), requires([css('style.css')]), mime_type(text/css)]).
:- html_resource(script, [virtual(true), requires([js('interact.js')]), mime_type(text/javascript)]).
:- html_resource(jquery, [virtual(true), requires([js('jquery.js')]), mime_type(text/javascript)]).
:- html_resource(pengines_script, [virtual(true), requires([root('pengine/pengines.js')]), mime_type(text/javascript)]).

start_larkc_pengine_server :-
	http_set_session_options([timeout(1800), create(auto), enabled(true)]),
	http_server(http_dispatch, [port(9880), timeout(180)]).

:- http_handler(/, larkc_pengines_welcome_handler, []).

:- http_handler(js(.), http_reply_from_files('js/', []),
		[priority(1000), prefix]).
:- http_handler(css(.), http_reply_from_files('css/', []),
                [priority(1000), prefix]).
:- http_handler(img(.), http_reply_from_files('icons/', []),
                [priority(1000), prefix]).

larkc_pengines_welcome_handler(_Request) :-
	reply_html_page(
			[title('LarKC_CL Pengines Server'),
			 link([href('https://fonts.googleapis.com/css?family=IBM+Plex+Mono|VT323'), rel(stylesheet)], [])
			]
		       ,
			\larkc_query).

larkc_query -->
	html([div(id(codeliketext),
		  [\html_requires(style),
		   \html_requires(jquery),
		   \html_requires(pengines_script),
		   \html_requires(script),
		   code(b('***************  LarKC_CL Pengines Server  ******************')),
		   pre(a(href('http://logicmoo.org:3602/cgi-bin/cg?cb-start'),'Click here if human'))

		  ])
	     ]).

:- start_larkc_pengine_server.
