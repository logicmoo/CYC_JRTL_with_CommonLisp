/* Prints the number of bits in a pointer.
 * Copyright (c) 2006 Kevin Rosenberg
 */

#include <stdio.h>

int main() {
  char *p;
  printf ("%d\n", 8*sizeof(p));
  return (0);
}
