Type the following
C program in a text editor and save it in the folder C:\Code with the filename sort1.c:

/* This program sorts a given list of integers in an increasing order
using bubble sort. */
/* BL */
#include <stdio.h>                                                                      /* L1 */
                                                                                        /* BL */
int intStorage[100];                                                                      /* L2 */
int kount = 0;                                                                           /* L3 */
                                                                                         /* BL */
void bubbleSort()                                                                        /* L4 */
{                                                                                        /* L5 */
int intTemp;                                                                             /* L6 */
int i,j;                                                                                  /* L7 */
int intSwap = 0;                                                   /* 0-false & 1-true */ /* L8 */
for(i = 0; i < kount-1; i++) 
{                                                             /* outer for loop begins */ /* L9 */
intSwap = 0;                                                                              /* L10 */
for(j = 0; j < kount-1-i; j++)
{                                                              /* inner for loop begins */ /* L11 */
if(intStorage[j] > intStorage[j+1]) 
{                                                                  /* if statement begins */ /* L12 */
intTemp = intStorage[j];                                                                     /* L13 */
intStorage[j] = intStorage[j+1];                                                            /* L14 */
intStorage[j+1] = intTemp;                                                                  /* L15 */
intSwap = 1;                                                                                /* L16 */
}                                                                     /* if statement ends */ /* L17 */
}                                                                      /* inner for loop ends */ /* L18 */
if(!intSwap)                                                               
{                                                                                               /* L19 */
break;                                                                                           /* L20 */
}                                                                                                 /* L21 */
}                                                                       /* outer for loop ends */ /* L22 */
}                                                                                               /* L23 */
                                                                                               /* BL */
void main()                                                                                     /* L24 */
{                                                                                                /* L25 */
int i;                                                                                           /* L26 */
printf("Enter the number of items in the list, N (2 <= N <= 100): ");                             /* L27 */
scanf("%d", &kount);                                                                             /* L28 */
printf("Enter the %d integers I (0 <= I <= 30000) ", kount);                                    /* L29 */
printf("separated by white spaces: \n");                                                         /* L30 */
for (i=0; i < kount; i++)                                                                       /* L31 */
scanf("%d", &intStorage[i]);                                                                     /* L32 */
fflush(stdin);                                                                                    /* L33 */
bubbleSort();                                                                                     /* L34 */
printf("Sorted List: ");                                                                          /* L35 */
for(i = 0; i < kount; i++)                                                                        /* L36 *
printf("%d ", intStorage[i]);                                                                      /* L37 */
printf("\nThank you.\n");                                                                          /* L38 */
}
