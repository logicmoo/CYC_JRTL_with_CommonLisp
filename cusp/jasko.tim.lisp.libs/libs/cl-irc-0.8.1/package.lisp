;;;; $Id: package.lisp 179 2007-04-18 18:57:32Z ehuelsmann $
;;;; $URL: svn+ssh://ehuelsmann@common-lisp.net/project/cl-irc/svn/trunk/package.lisp $

;;;; See the LICENSE file for licensing information.

(in-package :cl-user)

;; the exports list needs some cleanup/clarification/categorization
(eval-when (:execute :load-toplevel :compile-toplevel)
  (defpackage :cl-irc
      (:use :cl)
    (:nicknames :irc)
    (:export :read-message-loop
             :read-message
             :irc-message-event
             :start-background-message-handler
             :stop-background-message-handler
             :destructuring-arguments
             :&req
             :socket-connect
             :server-name
             :server-port
             :no-such-reply
             :irc-mode
             :boolean-value-mode
             :single-value-mode
             :list-value-mode
             :add-mode
             :remove-mode
             :has-mode-p
             :has-mode-value-p
             :get-mode
             :set-mode
             :unset-mode
             :parse-mode-arguments
             :parse-raw-message
             :normalize-nickname
             :normalize-channel-name
             :name
             :normalized-name
             :topic
             :modes
             :visibility
             :user-count
             :users
             :network-stream
             :output-stream
             :client-stream
             :channels
             :add-hook
             :remove-hook
             :remove-hooks
             :remove-all-hooks
             :add-default-hooks
             :get-hooks
             :make-user
             :nickname
             :normalized-nickname
             :username
             :hostname
             :realname
             :change-nickname
             :irc-message
             :source
             :user
             :password
             :host
             :command
             :arguments
             :trailing-argument
             :connection
             :received-time
             :raw-message-string
             :make-connection
             :make-channel
             :channel
             :client-log
             :find-channel
             :find-reply-name
             :remove-channel
             :remove-all-channels
             :add-channel
             :find-user
             :add-user
             :remove-all-users
             :remove-user
             :self-message-p
             :user-eq-me-p
             :pass
             :nick
             :user-
             :oper
             :mode
             :op
             :deop
             :voice
             :devoice
             :ban
             :unban
             :service
             :quit
             :squit
             :join
             :part
             :part-all
             :topic-
             :names
             :list-
             :invite
             :kick
             :privmsg
             :notice
             :motd-
             :lusers
             :version
             :stats
             :links
             :time-
             :connect
             :trace-
             :admin
             :info
             :servlist
             :squery
             :who
             :whois
             :whowas
             :kill
             :ping
             :pong
             :error-
             :away
             :rehash
             :die
             :restart-
             :summon
             :users-
             :wallops
             :userhost
             :ison)))

