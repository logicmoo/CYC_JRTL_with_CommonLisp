// jpty.c
//
// Copyright (C) 2000-2009 Peter Graves <peter@armedbear.org>
//
// This program is free software; you can redistribute it and/or
// modify it under the terms of the GNU General Public License
// as published by the Free Software Foundation; either version 2
// of the License, or (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with this program; if not, write to the Free Software
// Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.

#include <fcntl.h>
#include <grp.h>
#include <sys/ioctl.h>
#include <sys/stat.h>
#include <termios.h>
#define __USE_XOPEN

#include <signal.h>
#include <stdlib.h>
#include <unistd.h>
#include <string.h>

#ifdef __FreeBSD__
#include <errno.h>
#include <libutil.h>
#endif

static void set_noecho(int fd)
{
  struct termios t;
  if (tcgetattr(fd, &t) < 0)
    exit(1);
  t.c_lflag &= ~(ECHO | ECHOCTL | ECHOE | ECHOK | ECHOKE | ECHONL | ECHOPRT);
  t.c_oflag &= ~(ONLCR);
  if (tcsetattr(fd, TCSANOW, &t) < 0)
    exit(1);
}

// copy stdin to fd, copy fd to stdout
static void loop(int fd)
{
  char buf[1024];
  fd_set fdset;
  int done = 0;
  while (!done)
    {
      FD_ZERO(&fdset);
      FD_SET(STDIN_FILENO, &fdset);
      FD_SET(fd, &fdset);
      select(fd + 1, &fdset, NULL, NULL, NULL);
      if (FD_ISSET(fd, &fdset))
        {
          int i = read(fd, buf, sizeof(buf));
          if (i > 0)
            {
              if (!write(STDOUT_FILENO, buf, i))
                return;
            }
          else
            done = 1;
        }
      if (FD_ISSET(STDIN_FILENO, &fdset))
        {
          int i = read(STDIN_FILENO, buf, sizeof(buf));
          if (i > 0)
            {
              if (!write(fd, buf, i))
                return;
            }
          else
            done = 1;
        }
    }
}

#ifdef __FreeBSD__
int main(int argc, char *argv[])
{
  pid_t pid;
  int master, slave;
  int i = 1;
  if (argc < 2)
    exit(1);
  // check for -cd option
  if (!strcmp("-cd", argv[i]))
    {
      // next arg is directory to change to
      if (++i < argc) {
        if (chdir(argv[i]) < 0)
          exit(1);
        ++i;
      }
    }
  // we should not be out of args here!
  if (i >= argc)
    exit(1);
  if (openpty (&master, &slave, NULL, NULL, NULL) < 0)
    {
      errno = ENOENT;
      exit(1);
    }
  if (master < 0)
    exit(1);
  pid = fork();
  if (pid < 0)
    exit(1);
  if (pid == 0)
    {
      // child
      close(master);
      if (setsid() < 0)
        exit(1);
      if (slave < 0)
        exit(1);
      if (ioctl(slave, TIOCSCTTY, NULL) < 0)
        exit(1);
      if (dup2(slave, STDIN_FILENO) != STDIN_FILENO)
        exit(1);
      if (dup2(slave, STDOUT_FILENO) != STDOUT_FILENO)
        exit(1);
      if (dup2(slave, STDERR_FILENO) != STDERR_FILENO)
        exit(1);
      if (slave > STDERR_FILENO)
        close(slave);
      set_noecho(STDIN_FILENO);
      putenv("TERM=dumb");
      execvp(argv[i], &argv[i]);
      // not reached
      exit(1);
    }
  else
    {
      // parent
      loop(master);
      exit(0);
    }
}
#else
// not FreeBSD
static int open_master_pty(char *namebuf, size_t bufsize)
{
  int fdm;
  char *sname;
  fdm = open("/dev/ptmx", O_RDWR);
  if (fdm < 0)
    return -1;
  unlockpt(fdm);
  grantpt(fdm);
  sname = ptsname(fdm);
  if (strlen(sname) >= bufsize)
    return -1;
  strcpy(namebuf, sname);
  return fdm;
}

int main(int argc, char *argv[])
{
  char slave_name[256];
  pid_t pid;
  int fdm;
  int i = 1;
  if (argc < 2)
    exit(1);
  // check for -cd option
  if (!strcmp("-cd", argv[i]))
    {
      // next arg is directory to change to
      if (++i < argc)
        {
          if (chdir(argv[i]) < 0)
            exit(1);
          ++i;
        }
    }
  // we should not be out of args here!
  if (i >= argc)
    exit(1);
  fdm = open_master_pty(slave_name, sizeof(slave_name));
  if (fdm < 0)
    exit(1);
  pid = fork();
  if (pid < 0)
    exit(1);
  if (pid == 0)
    {
      // child
      int slave;
      close(fdm);
      if (setsid() < 0)
        exit(1);
      slave = open(slave_name, O_RDWR);
      if (slave < 0)
        exit(1);
#ifdef __linux__
      if (ioctl(slave, TIOCSCTTY, NULL) < 0)
        exit(1);
#endif
      if (dup2(slave, STDIN_FILENO) != STDIN_FILENO)
        exit(1);
      if (dup2(slave, STDOUT_FILENO) != STDOUT_FILENO)
        exit(1);
      if (dup2(slave, STDERR_FILENO) != STDERR_FILENO)
        exit(1);
      if (slave > STDERR_FILENO)
        close(slave);
      set_noecho(STDIN_FILENO);
      putenv("TERM=dumb");
#ifdef __linux__
      // ignore SIGHUP to work around Linux kernel bug (2.6.9)
      // http://lkml.org/lkml/2004/10/21/119
      signal(SIGHUP, SIG_IGN);
#endif
      execvp(argv[i], &argv[i]);
      // not reached
      exit(1);
    }
  else
    {
      // parent
      loop(fdm);
      exit(0);
    }
}
#endif
