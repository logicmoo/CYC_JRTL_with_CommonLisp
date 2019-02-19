/*  Part of SWI-Prolog

    Author:        Jan Wielemaker
    E-mail:        J.Wielemaker@vu.nl
    WWW:           http://www.swi-prolog.org
    Copyright (c)  2007-2018, University of Amsterdam
                              VU University Amsterdam
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

:- module(http_ssl_plugin, []).
:- use_module(library(ssl)).
:- use_module(library(socket)).
:- use_module(library(debug)).
:- use_module(library(option)).
:- use_module(library(http/thread_httpd)).
:- use_module(library(http/http_header)).

/** <module> SSL plugin for HTTP libraries

This  module  can  be   loaded    next   to   library(thread_httpd)  and
library(http_open) to provide secure HTTP   (HTTPS)  services and client
access.

An example secure server using self-signed  certificates can be found in
the <plbase>/doc/packages/examples/ssl/https.pl, where <plbase>   is the
SWI-Prolog installation directory.
*/

:- multifile
    thread_httpd:make_socket_hook/3,
    thread_httpd:accept_hook/2,
    thread_httpd:open_client_hook/6,
    http:http_protocol_hook/5,
    http:open_options/2,
    http:http_connection_over_proxy/6,
    http:ssl_server_create_hook/3,
    http:ssl_server_open_client_hook/3.


                 /*******************************
                 *          SERVER HOOKS        *
                 *******************************/

%!  thread_httpd:make_socket_hook(?Port, :OptionsIn, -OptionsOut)
%!                                                          is semidet.
%
%   Hook into http_server/2 to create an   SSL  server if the option
%   ssl(SSLOptions) is provided.
%
%   @see thread_httpd:accept_hook/2 handles the corresponding accept

thread_httpd:make_socket_hook(Port, M:Options0, Options) :-
    select(ssl(SSLOptions0), Options0, Options1),
    !,
    add_secure_ciphers(SSLOptions0, SSLOptions1),
    disable_sslv3(SSLOptions1, SSLOptions),
    make_socket(Port, Socket, Options1),
    ssl_context(server, SSL0, M:SSLOptions),
    (   http:ssl_server_create_hook(SSL0, SSL, Options1)
    ->  true
    ;   SSL = SSL0
    ),
    atom_concat('httpsd', Port, Queue),
    Options = [ queue(Queue),
                tcp_socket(Socket),
                ssl_instance(SSL)
              | Options1
              ].

%!  add_secure_ciphers(+SSLOptions0, -SSLOptions)
%
%   Add ciphers from ssl_secure_ciphers/1 if no ciphers are provided.

add_secure_ciphers(SSLOptions0, SSLOptions) :-
    (   option(cipher_list(_), SSLOptions0)
    ->  SSLOptions = SSLOptions0
    ;   ssl_secure_ciphers(Ciphers),
        SSLOptions = [cipher_list(Ciphers)|SSLOptions0]
    ).

%!  disable_sslv3(+SSLOptions0, -SSLOptions)
%
%   Disable SSLv3, which  is  considered   insecure  unless  the  caller
%   specifies the allowed versions explicitly, so   we assume s/he knows
%   what s/he is doing.

disable_sslv3(SSLOptions0, SSLOptions) :-
    (   option(min_protocol_version(_), SSLOptions0)
    ;   option(disable_ssl_methods(_), SSLOptions0)
    ),
    !,
    SSLOptions = SSLOptions0.
disable_sslv3(SSLOptions0,
              [ disable_ssl_methods([sslv3,sslv23]), % old OpenSSL versions
                min_protocol_version(tlsv1)          % OpenSSL 1.1.0 and later
              | SSLOptions0
              ]).


make_socket(_Port, Socket, Options) :-
    option(tcp_socket(Socket), Options),
    !.
make_socket(Port, Socket, _Options) :-
    tcp_socket(Socket),
    tcp_setopt(Socket, reuseaddr),
    tcp_bind(Socket, Port),
    tcp_listen(Socket, 5).


%!  thread_httpd:accept_hook(:Goal, +Options) is semidet.
%
%   Implement the accept for HTTPS connections.

thread_httpd:accept_hook(Goal, Options) :-
    memberchk(ssl_instance(SSL), Options),
    !,
    memberchk(queue(Queue), Options),
    memberchk(tcp_socket(Socket), Options),
    tcp_accept(Socket, Client, Peer),
    debug(http(connection), 'New HTTPS connection from ~p', [Peer]),
    http_enough_workers(Queue, accept, Peer),
    thread_send_message(Queue, ssl_client(SSL, Client, Goal, Peer)).

%!  http:ssl_server_create_hook(+SSL0, -SSL, +Options) is semidet.
%
%   Extensible predicate that is called  once   after  creating an HTTPS
%   server. If this predicate succeeds, SSL is  the context that is used
%   for negotiating new connections. Otherwise, SSL0   is used, which is
%   the context that was created with the given options.
%
%   @see ssl_context/3 for creating an SSL context


%!  http:ssl_server_open_client_hook(+SSL0, -SSL, +Options) is semidet.
%
%   Extensible predicate that is called before  each connection that the
%   server negotiates with a client. If  this predicate succeeds, SSL is
%   the context that is used for the  new connection. Otherwise, SSL0 is
%   used, which is the  context  that   was  created  when launching the
%   server.
%
%   @see ssl_context/3 for creating an SSL context


thread_httpd:open_client_hook(ssl_client(SSL0, Client, Goal, Peer),
                              Goal, In, Out,
                              [peer(Peer), protocol(https)],
                              Options) :-
    (   http:ssl_server_open_client_hook(SSL0, SSL1, Options)
    ->  true
    ;   SSL1 = SSL0
    ),
    option(timeout(TMO), Options, 60),
    tcp_open_socket(Client, Read, Write),
    set_stream(Read, timeout(TMO)),
    set_stream(Write, timeout(TMO)),
    ssl_set_options(SSL1, SSL, [close_parent(true)]),
    catch(ssl_negotiate(SSL, Read, Write, In, Out),
          E,
          ssl_failed(Read, Write, E)).

ssl_failed(Read, Write, E) :-
    close(Write, [force(true)]),
    close(Read,  [force(true)]),
    throw(E).


                 /*******************************
                 *         CLIENT HOOKS         *
                 *******************************/

%!  http:http_protocol_hook(+Scheme, +Parts, +PlainStreamPair,
%!                          -StreamPair, +Options) is semidet.
%
%   Hook for http_open/3 to connect  to   an  HTTPS (SSL-based HTTP)
%   server.   This   plugin   also   passes   the   default   option
%   `cacert_file(system(root_certificates))` to ssl_context/3.

http:http_protocol_hook(https, Parts, PlainStreamPair, StreamPair, Options) :-
    ssl_protocol_hook(Parts, PlainStreamPair, StreamPair, Options).
http:http_protocol_hook(wss, Parts, PlainStreamPair, StreamPair, Options) :-
    ssl_protocol_hook(Parts, PlainStreamPair, StreamPair, Options).

ssl_protocol_hook(Parts, PlainStreamPair, StreamPair, Options) :-
    memberchk(host(Host), Parts),
    ssl_context(client, SSL, [ host(Host),
                               close_parent(true)
                             | Options
                             ]),
    stream_pair(PlainStreamPair, PlainIn, PlainOut),
    % if an exception arises, http_open/3 closes the stream for us
    ssl_negotiate(SSL, PlainIn, PlainOut, In, Out),
    stream_pair(StreamPair, In, Out).

%!  http:open_options(Parts, Options) is nondet.
%
%   Implementation of the multifile hook http:open_options/2 used by
%   library(http/http_open). By default, we use   the system trusted
%   root certificate database for validating an SSL certificate.

http:open_options(Parts, Options) :-
    memberchk(scheme(S), Parts),
    ssl_scheme(S),
    Options = [cacert_file(system(root_certificates))].

ssl_scheme(https).
ssl_scheme(wss).

%!  http:http_connection_over_proxy(+Proxy, +Parts, +HostPort, -StreamPair,
%!                                  +OptionsIn, -OptionsOut)
%
%   Facilitate an HTTPS connection via a   proxy using HTTP CONNECT.
%   Note that most proxies will only  support this for connecting on
%   port 443

http:http_connection_over_proxy(proxy(ProxyHost, ProxyPort), Parts,
                                Host:Port, StreamPair, Options, Options) :-
    memberchk(scheme(https), Parts),
    !,
    tcp_connect(ProxyHost:ProxyPort, StreamPair, [bypass_proxy(true)]),
    catch(negotiate_http_connect(StreamPair, Host:Port),
          Error,
          ( close(StreamPair, [force(true)]),
            throw(Error)
          )).

negotiate_http_connect(StreamPair, Address):-
    format(StreamPair, 'CONNECT ~w HTTP/1.1\r\n\r\n', [Address]),
    flush_output(StreamPair),
    http_read_reply_header(StreamPair, Header),
    memberchk(status(_, Status, Message), Header),
    (   Status == ok
    ->  true
    ;   throw(error(proxy_rejection(Message), _))
    ).


