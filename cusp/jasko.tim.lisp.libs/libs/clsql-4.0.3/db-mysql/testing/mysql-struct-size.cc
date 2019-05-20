#include <stdio.h>
#include "/usr/include/mysql/mysql.h"

int main (int argc, char** argv)
{
  printf ("Size of MYSQL struct: %ld\n", sizeof (MYSQL));
  printf("Sizeof MYSQL_BIND: %d\n", sizeof(MYSQL_BIND));
  printf("Sizeof MYSQL_FIELD: %d\n", sizeof(MYSQL_FIELD));
  printf("Sizeof MYSQL_TIME: %d\n", sizeof(MYSQL_TIME));
}
