alias f="find . -name "
alias fa="find /c -name "
alias ..="cd ..;ll"
alias la="ls -altr"
alias jr="cd ~/Dropbox/Solbon\ stuff/study/java/javarush/JavaRushHomeWork"
alias gs='git status '
alias gss='git status -s'
alias ga='git add '
alias gb='git branch -vv'
alias gbb='gb -vv | grep -e behind -e ahead '
alias gc='git commit'
alias gd='git diff'
alias go='git checkout '
alias gf='git fetch'
alias gff='echo Running git fetch...; gf; echo; echo; echo Running git branch -vv; gb -vv|grep -e behind -e ahead'
alias gk='gitk --all&'
alias gm='git merge'
alias gdel='git br -D '
alias hist='git hist'
alias gh='git hist -n 15'
alias ghs='git hist --stat'
alias gha='git hist --all '
alias gl='git log'
alias gm='git co master'
alias j='jconsole.exe &'
alias vb='vi ~/.bashrc'
alias w='cd ~/workspace/csshi'
alias ww='cd ~/Dropbox/Solbon\ stuff/study/java/workspace; ll'
alias s='source ~/.bashrc; w'

cd ~/workspace

export PS1='\[\033[01;32m\]\u@\h\[\033[33m\] \w\[\033[36m\]`__git_ps1`\n\[\e[00m\]$ '
#export PS1='\[\033[01;32m\]\u@\h\[\033[33m\] \w\[\033[01;37m\]$(__git_ps1)\[\033[00m\]> '
export GIT_PS1_SHOWDIRTYSTATE=1
export GIT_PS1_SHOWUPSTREAM="verbose"
export GIT_PS1_SHOWCOLORHINTS=1
#source /mingw64/share/git/completion/git-prompt.sh

export HISTCONTROL=ignoredups:erasedups  # no duplicate entries
export HISTSIZE=100000                   # big big history
export HISTFILESIZE=100000               # big big history
shopt -s histappend                      # append to history, don't overwrite it

# Save and reload the history after each command finishes
export PROMPT_COMMAND="history -a; history -c; history -r; $PROMPT_COMMAND"

# After each command, append to the history file and reread it
#export PROMPT_COMMAND="${PROMPT_COMMAND:+$PROMPT_COMMAND$'\n'}history -a; history -c; history -r"
export PATH=$PATH:~/workspace/scripts
