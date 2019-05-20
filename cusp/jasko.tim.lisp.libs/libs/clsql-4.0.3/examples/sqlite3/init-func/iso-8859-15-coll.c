/****************************************************************************
 * FILE IDENTIFICATION
 *
 *   Name:          iso-8859-15-coll.c
 *   Purpose:       SQLite 3 initialization function for
 *                  ISO-8859-15 collating sequence.
 *   Programmer:    Aurelio Bignoli
 *   Date Started:  Oct 2004
 *
 * $Id$
 *
 * This file, part of CLSQL, is Copyright (c) 2004 by Aurelio Bignoli
 *
 * CLSQL users are granted the rights to distribute and use this software
 * as governed by the terms of the Lisp Lesser GNU Public License
 * (http://opensource.franz.com/preamble.html), also known as the LLGPL.
 ***************************************************************************/


/* Collating sequence name. CI = Case Insensitive */
#define ISO_8859_15_CI_NAME "ISO_8859_15_CI"

/* Conversion table. */
const unsigned char iso_8859_15_ci [] = {
  /* 0 */ 0x00, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, 0x0E, 0x0F,
  /* 1 */ 0x10, 0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1A, 0x1B, 0x1C, 0x1D, 0x1E, 0x1F,
  /* 2 */ 0x20, 0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, 0x2A, 0x2B, 0x2C, 0x2D, 0x2E, 0x2F,
  /* 3 */ 0x30, 0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39, 0x3A, 0x3B, 0x3C, 0x3D, 0x3E, 0x3F,
  /* 4 */ 0x40, 0x61, 0x62, 0x63, 0x64, 0x65, 0x66, 0x67, 0x68, 0x69, 0x6A, 0x6B, 0x6C, 0x6D, 0x6E, 0x6F,
  /* 5 */ 0x70, 0x71, 0x72, 0x73, 0x74, 0x75, 0x76, 0x77, 0x78, 0x79, 0x7A, 0x5B, 0x5C, 0x5D, 0x5E, 0x5F,
  /* 6 */ 0x60, 0x61, 0x62, 0x63, 0x64, 0x65, 0x66, 0x67, 0x68, 0x69, 0x6A, 0x6B, 0x6C, 0x6D, 0x6E, 0x6F,
  /* 7 */ 0x70, 0x71, 0x72, 0x73, 0x74, 0x75, 0x76, 0x77, 0x78, 0x79, 0x7A, 0x7B, 0x7C, 0x7D, 0x7E, 0x7F,
  /* 8 */ 0x80, 0x81, 0x82, 0x83, 0x84, 0x85, 0x86, 0x87, 0x88, 0x89, 0x73, 0x8B, 0x6F, 0x8D, 0x7A, 0x79,
  /* 9 */ 0x90, 0x91, 0x92, 0x93, 0x94, 0x95, 0x96, 0x97, 0x98, 0x99, 0x73, 0x9B, 0x6F, 0x9D, 0x7A, 0x79,
  /* A */ 0xA0, 0xA1, 0xA2, 0xA3, 0xA4, 0xA5, 0x73, 0xA7, 0x73, 0xA9, 0xAA, 0xAB, 0xAC, 0xAD, 0xAE, 0xAF,
  /* B */ 0xB0, 0xB1, 0xB2, 0xB3, 0x7A, 0xB5, 0xB6, 0xB7, 0x7A, 0xB9, 0xBA, 0xBB, 0x6F, 0xBD, 0x79, 0xBF,
  /* C */ 0x61, 0x61, 0x61, 0x61, 0x61, 0x61, 0x65, 0x63, 0x65, 0x65, 0x65, 0x65, 0x69, 0x69, 0x69, 0x69,
  /* D */ 0x64, 0x6E, 0x6F, 0x6F, 0x6F, 0x6F, 0x6F, 0xD7, 0x6F, 0x75, 0x75, 0x75, 0x75, 0x79, 0xDE, 0x73,
  /* E */ 0x61, 0x61, 0x61, 0x61, 0x61, 0x61, 0x65, 0x63, 0x65, 0x65, 0x65, 0x65, 0x69, 0x69, 0x69, 0x69,
  /* F */ 0x64, 0x6E, 0x6F, 0x6F, 0x6F, 0x6F, 0x6F, 0xF7, 0x6F, 0x75, 0x75, 0x75, 0x75, 0x79, 0xFE, 0x73
};

/*
 * A modified version of sqlite3StrNICmp in sqlite/src/util.c
 */
int iso_8859_15_ci_StrCmp(const char *zLeft, const char *zRight, int N){
  register unsigned char *a, *b;
  a = (unsigned char *)zLeft;
  b = (unsigned char *)zRight;
  while( N-- > 0 && *a!=0 && iso_8859_15_ci[*a]==iso_8859_15_ci[*b]){ a++; b++; }
  return N<0 ? 0 : iso_8859_15_ci[*a] - iso_8859_15_ci[*b];
}

/*
 * A modified version of nocaseCollatinFunc in sqlite/src/main.c.
 */
int iso_8859_15_ci_CollatingFunc(
  void *NotUsed,
  int nKey1, const void *pKey1,
  int nKey2, const void *pKey2
){
  int r = iso_8859_15_ci_StrCmp(
      (const char *)pKey1, (const char *)pKey2, (nKey1<nKey2)?nKey1:nKey2);
  if( 0==r ){
    r = nKey1-nKey2;
  }
  return r;
}

/*
 * Set the ISO_8859_15_CI collating sequence for a db.
 */
#include "sqlite3.h"

int create_iso_8859_15_ci_collation (sqlite3 *db)
{
  return sqlite3_create_collation (db, ISO_8859_15_CI_NAME, SQLITE_UTF8, 0,
                                   iso_8859_15_ci_CollatingFunc);
}
