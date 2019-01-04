unset DISPLAY

alias abcl='/mnt/dddd/workspace/runtime/abcl.sh '
alias cant='rm -rf build dist ~/.cache/ ;  ant ; ant ; LCD=$PWD ; cd ../old-ansi-tests ; $LCD/abcl --load doit.lsp ; cd -'
alias gdbexec='gdb -return-child-result -ex "set pagination off" -ex run -ex quit --args '
alias gdbexec0='gdb -return-child-result  -ex "set pagination off" -ex "handle SIGXCPU SIG33 SIG35 SIGPWR SIGINT SIGALRM SIGWINCH SIG2 SIGCHILD pass nostop noprint" -ex run -ex "thread apply all bt all" -ex "quit" --args '
alias sss='killall -9 swipl xterm prolicyd perl ; gdbexec swipl --nopce'
alias ss0='cls ; sss -g "[logicmoo_repl]"'
alias ss1='cls ; sss -g "[logicmoo_repl],halt(0)"'
alias ss2='sss -x lm_repl '
alias ss3='ss2 -g "[init_mud_server]"'

makeRepl() {
   ss1
   ss3
}

export -f makeRepl

makeRepl
