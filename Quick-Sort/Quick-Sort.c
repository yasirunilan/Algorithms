Type the following
C program in a text editor and save it in the folder C:\Code with the filename Quicksort.c:

#include<stdio.h>                                                                                                   /* L1 */
                                                                                                                    /* BL */
int intStorage[20];                                                                                                 /* L2 */
int kount = 0;                                                                                                      /* L3 */
                                                                                                                    /* BL */
void swap(int n1, int n2)                                                                                           /* L4 */
{                                                                                                                   /* L5 */
int intTemp = intStorage[n1];                                                                                       /* L6 */
intStorage[n1] = intStorage[n2];                                                                                    /* L7 */
intStorage[n2] = intTemp;                                                                                           /* L8 */
}                                                                                                                   /* L9 */
                                                                                                                    /* BL */
int partition(int left, int right, int pivot)                                                                       /* L10 */
{                                                                                                                   /* L11 */
int lPtr = left -1;                                                                                                 /* L12 */
int rPtr = right;                                                                                                   /* L13 */
while(1) {                                                                                                          /* L14 */
while(intStorage[++lPtr] < pivot) {                                                                                 /* L15 */
}                                                                                                                   /* L16 */
while(rPtr > 0 && intStorage[--rPtr] > pivot) {                                                                     /* L17 */
}                                                                                                                   /* L18 */
if(lPtr >= rPtr)                                                                                                     /* L19 */
break;                                                                                                               /* L20 */
else                                                                                                                 /* L21 */
swap(lPtr, rPtr);                                                                                                    /* L22 */
}                                                                                                                     /* L23 */
swap(lPtr,right);                                                                                                     /* L24 */
return lPtr;                                                                                                         /* L25 */
}                                                                                                                    /* L26 */
                                                                                                                     /* BL */
void quickSort(int left, int right)                                                                                    /* L27 */
{                                                                                                                       /* L28 */
int pivot, partPt;                                                                                                      /* L29 */
if(right - left <= 0) {                                                                                               /* L30 */
return;                                                                                                                 /*L31*/                    /* L31 */
}                                                                                                                      /* L32
else {                                                                                                                /* L33 */
pivot = intStorage[right];                                                                                            /* L34 */
partPt = partition(left, right, pivot);                                                                               /* L35 */
quickSort(left, partPt - 1);                                                                                              /* L36 */
quickSort(partPt + 1,right);                                                                                              /* L37 */
}                                                                                                                         /* L38 */
}                                                                                                                        /* L39 */
                                                                                                                        /* BL */
void main()                                                                                                              /* L40 */
{                                                                                                                        /* L41 */
int i;                                                                                                                    /* L42 */
printf("Enter the number of items in the list, N (2 <= N <= 20): ");                                                      /* L43 */
scanf("%d", &kount);                                                                                                      /* L44 */
printf("Enter the %d integers I (0 <= I <= 30000) ", kount);                                                             /* L45 */
printf("separated by white spaces: \n");                                                                                 /* L46 */
for (i=0; i < kount; i++)                                                                                                  /* L47 */
scanf("%d", &intStorage[i]);                                                                                              /* L48 */
fflush(stdin);                                                                                                            /* L49 */
quickSort(0, kount - 1);                                                                                                  /* L50 */
printf("Sorted List: ");                                                                                                  /* L51 */
for(i = 0; i < kount; i++)                                                                                                 /* L52 */
printf("%d ", intStorage[i]);                                                                                               /* L53 */
printf("\nThank you.\n");                                                                                                   /* L54 */
}                                                                                                                           /* L55 */
