import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//============ Star Pattern 1 ==========================

//                                  * * * *
//                                  * * * *
//                                  * * * *
//                                  * * * *

//        int rows = 4;
//        int i,j;
//        for (i = 1; i <= rows; i++) {
//            for (j = 1; j <= rows; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


//============= Star Pattern 2 ===========================

//                                  *
//                                  * *
//                                  * * *
//                                  * * * *

//        int rows = 4;
//        for (int i = 1; i <= rows; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


//============== Star Pattern 3 ======================================

//                                  * * * *
//                                  * * *
//                                  * *
//                                  *

//        int rows = 4;
//        for (int i = rows; i >= 1; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


//=========== Star pattern 4(2+3) ======================================

//                                  *
//                                  * *
//                                  * * *
//                                  * * * *
//                                  * * * *
//                                  * * *
//                                  * *
//                                  *

//        int rows = 4;
//        for (int i = 1; i <= rows; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for (int i = 1; i <= rows; i++) {
//            for (int j = rows; j >= i; j--) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


//============= Star Pattern 5 (same 4) ===============================

//                                  *
//                                  * *
//                                  * * *
//                                  * * * *
//                                  * * *
//                                  * *
//                                  *

//        int rows = 4;
//        for (int i = 1; i <= rows; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for (int i = 1; i <= rows; i++) {
//            for (int j = 3; j >= i; j--) {
//                System.out.print("* ");
//            }
//            System.out.println();
//      }

//------------- using only 2 for loops -----------------------
//        int rows = 7;
//        int mid = (rows + 1) / 2;
//        int a;
//        for (int i = 1; i<= rows; i++){
//            if (i <= mid){
//               a = i;
//            }
//            else{
//                a = (rows - i) + 1;
//            }
//            for(int j = 1; j <= a; j++){
//                System.out.print("*  ");
//            }
//            System.out.println();
//        }


//================ Pattern 6 ======================
//                                1 2 3 4 5
//                                1 2 3 4 5
//                                1 2 3 4 5
//                                1 2 3 4 5
//                                1 2 3 4 5

//        int rows = 5;
//        for (int i = 1; i <= rows; i++){
//            for (int j = 1; j <= rows; j++){
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }


//================ Pattern 7 ======================

//                                1 1 1 1 1
//                                2 2 2 2 2
//                                3 3 3 3 3
//                                4 4 4 4 4
//                                5 5 5 5 5

//        int rows = 5;
//        for (int i = 1; i <= rows; i++){
//            for (int j = 1; j <= 4; j++){
//                System.out.print(i + "  ");
//            }
//            System.out.println();
//        }


//================ Pattern 8 ======================

//                                5 4 3 2 1
//                                5 4 3 2 1
//                                5 4 3 2 1
//                                5 4 3 2 1
//                                5 4 3 2 1

//        int rows = 5;
//        for (int i = 1; i <= rows; i++){
//            for (int j = rows; j >= 1; j--){
//                System.out.print(j + "  ");
//            }
//            System.out.println();
//        }


//================ Pattern 9 ======================

//                                5 5 5 5 5
//                                4 4 4 4 4
//                                3 3 3 3 3
//                                2 2 2 2 2
//                                1 1 1 1 1

//        int rows = 5;
//        for (int i = rows; i >= 1; i--){
//            for (int j = 1; j <= rows; j++){
//                System.out.print(i + "  ");
//            }
//            System.out.println();
//        }


//================ Pattern 10 ======================

//                                1
//                                1 2
//                                1 2 3
//                                1 2 3 4

//        int rows = 4;
//        for (int i = 1; i <= rows; i++){
//            for (int j = 1; j <= i; j++){
//                System.out.print(j + "  ");
//            }
//            System.out.println();
//        }


//================ Pattern 11 ======================

//                             1
//                             2 2
//                             3 3 3
//                             4 4 4 4

//        int rows = 4;
//        for (int i = 1; i <= rows; i++){
//            for (int j = 1; j <= i; j++){
//                System.out.print(i + "  ");
//            }
//            System.out.println();
//        }


//================ Pattern 12 ======================

//                         1  2  3  4
//                         5  6  7  8
//                         9  10 11 12
//                         13 14 15 16

//        int a = 1;
//        for (int i = 1; i <= 4; i++){
//            for (int j = 1; j <= 4; j++) {
//                System.out.print(a + "  ");
//                a++;
//            }
//            System.out.println();
//        }


//================ Pattern 13 ======================

//                             2   4   6   8   10
//                             12  14  16  18  20
//                             22  24  26  28  30
//                             32  34  36  38  40
//                             42  44  46  48  50

//        int a = 2;
//        for (int i = 1; i <= 5; i++){
//            for (int j = 1; j <= 5; j++) {
//                System.out.print(a + "  ");
//                a+=2;
//            }
//            System.out.println();
//        }


//================ Pattern 14 =====================================================

//                                 0 1 0 1 0
//                                 1 0 1 0 1
//                                 0 1 0 1 0
//                                 1 0 1 0 1

//        int rows = 4;
//        for (int i = 0; i < rows; i++){
//            for(int j = 0; j <= rows; j++){
//              if((i + j) % 2 == 0){
//                  System.out.print("0 ");
//              }
//              else {
//                  System.out.print("1 ");
//              }
//            }
//            System.out.println();
//        }


//================ Pattern 15 ============================================================

//                                 1 0 1 0 1
//                                 0 1 0 1 0
//                                 1 0 1 0 1
//                                 0 1 0 1 0

//        int rows = 4;
//        for (int i = 1; i <= rows; i++){
//            for(int j = 0; j <= rows; j++){
//                if((i + j) % 2 == 0){
//                    System.out.print("0 ");
//                }
//                else {
//                    System.out.print("1 ");
//                }
//            }
//            System.out.println();
//        }


//=============== Pattern 16 =========================================================

//                                 1  2  3  4  5
//                                 2  4  6  8  10
//                                 3  6  9  12 15
//                                 4  8  12 16 20
//                                 5  10 15 20 25

//        int rows = 5;
//        for (int i = 1; i <= rows; i++) {
//            for (int j = 1; j <= rows; j++) {
//                int mult = i * j;
//                System.out.print(mult + " ");
//            }
//            System.out.println();
//        }


//=============== Pattern 17 ====================================================================

//                                   0 0 0 0
//                                   1 1 1 1
//                                   0 0 0 0
//                                   1 1 1 1

//        int rows = 4;
//        for (int i = 1; i <= rows; i++) {
//            for (int j = 1; j <= rows; j++) {
//                if (i % 2 == 0) {
//                    System.out.print("1 ");
//                } else {
//                    System.out.print("0 ");
//                }
//            }
//            System.out.println();
//        }


//=============== Pattern 18 ===============================================================

//                                   1 1 1 1
//                                   0 0 0 0
//                                   1 1 1 1
//                                   0 0 0 0

//        int rows = 4;
//        for (int i = 1; i <= rows; i++) {
//            for (int j = 1; j <= rows; j++) {
//                if (i % 2 == 0) {
//                    System.out.print("0 ");
//                } else {
//                    System.out.print("1 ");
//                }
//            }
//            System.out.println();
//        }


//=============== Pattern 19 ========================================================

//                                   *
//                                 *   *
//                               *   *   *
//                             *   *   *   *
//                           *   *   *   *   *

//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= 5-i; j++) {
//                    System.out.print(" ");
//            }
//            for (int k = 1; k <= i; k++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//=============== Pattern 20 ======================================================

//                             # # # # *
//                             # # # * *
//                             # # * * *
//                             # * * * *
//                             * * * * *

//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= 5-i; j++) {
//                    System.out.print("# ");
//            }
//            for (int k = 1; k <= i; k++) {
//                System.out.print(" *");
//            }
//            System.out.println();
//        }


//=============== Pattern 21 =============================================================

//                                  *
//                                * *
//                              * * *

//        for(int i = 1; i <= 3; i++) {
//            for (int j = 1; j <= 3-i; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= i; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//=============== Pattern 22 ==================================================================

//                            1  6  11  16
//                            2  7  12  17
//                            3  8  13  18
//                            4  9  14  19
//                            5  10 15  20

//        int rows = 5;
//        int a;
//        for(int i=1; i <= rows; i++){
//            a = i;
//            for(int j= 1; j <= rows; j++) {
//                System.out.print(a + " ");
//                a = a + rows;
//            }
//            System.out.println();
//        }
//--------------------------------------------------------------------------------------
//        int rows = 5;
//        int columns = 4;
//        int a = 1;
//
//        for (int i = 1; i <= rows; i++) {
//            for (int j = 0; j < columns; j++) {
//                System.out.print((a + (j * rows)) + " ");
//            }
//            System.out.println();
//            a++;
//        }


//=============== Pattern 20 ==================================================

//                           5  10 15  20  25
//                           4  9  14  19  24
//                           3  8  13  18  23
//                           2  7  12  17  22
//                           1  6  11  16  21

//        int rows = 5;
//        int a;
//        for(int i=rows; i >= 1; i--){
//            a = i;
//            for(int j= rows; j >= 1; j--) {
//                System.out.print(a + " ");
//                a = a + rows;
//            }
//            System.out.println();
//        }


//=============== Pattern 30 ==================================================

//                            * * * *
//                            *     *
//                            *     *
//                            * * * *

//        for (int i = 1; i <= 4; i++) {
//            for (int j = 1; j <= 4; j++) {
//                if (i == 1 || j == 1 || i == 4 || j == 4) {
//                    System.out.print("* ");
//                } else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }


//=============== Pattern 31 ==================================================

//                           * * * *
//                           *     *
//                           *     *
//                           * * * *
//                           *     *

//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= 5; j++) {
//                if (i == 1 || j == 1 || i == 4 || j == 4) {
//                    System.out.print("* ");
//                } else {
//                    System.out.print("   ");
//                }
//            }
//            System.out.println();
//        }


//=============== Pattern 32 ========================================================

//                               *   *   *   *   *
//                                 *   *   *   *
//                                   *   *   *
//                                     *   *
//                                       *

//        for (int i = 5; i >= 1; i--) {
//            for (int j = 5-i; j >= 1; j--) {
//                System.out.print("  ");
//            }
//            for (int k = 1; k <= i; k++) {
//                System.out.print(" *  ");
//            }
//            System.out.println();
//        }


// =============== Pattern 33 ========================================================

//                                       *
//                                     *   *
//                                   *   *   *
//                                 *   *   *   *
//                               *   *   *   *   *
//                               *   *   *   *   *
//                                 *   *   *   *
//                                   *   *   *
//                                     *   *
//                                       *

//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= 5-i; j++) {
//                    System.out.print("  ");
//            }
//            for (int k = 1; k <= i; k++) {
//                System.out.print(" *  ");
//            }
//            System.out.println();
//        }
//        for (int i = 5; i >= 1; i--) {
//            for (int j = 5-i; j >= 1; j--) {
//                System.out.print("  ");
//            }
//            for (int k = 1; k <= i; k++) {
//                System.out.print(" *  ");
//            }
//            System.out.println();
//        }


// =============== Pattern 34 ========================================================

//        1 * * * *
//        2 2 * * *
//        3 3 3 * *
//        4 4 4 4 *
//        5 5 5 5 5

//        int rows = 5;
//        for (int i = 1; i <= rows; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(i + " ");
//            }
//
//            for (int k = i; k < rows; k++) {
//                System.out.print("* ");
//            }
//
//            System.out.println();
//        }


// =============== Pattern 35 ========================================================

//        1 * * * *
//        1 2 * * *
//        1 2 3 * *
//        1 2 3 4 *
//        1 2 3 4 5

//        int rows = 5;
//        for (int i = 1; i <= rows; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j + " ");
//            }
//            for (int k = i + 1; k <= rows; k++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


// =============== Pattern 35 ========================================================

//                          *
//                          * *
//                          *   *
//                          *     *
//                          * * * * *


//        int rows = 5;
//        for (int i = 1; i <= rows; i++) {
//            for (int j = 1; j <= i; j++) {
//                if (j == 1 || i == rows || j == i) {
//                    System.out.print("* ");
//                } else {
//                    System.out.print("  ");
//                }
//            }
//
//            System.out.println();
//        }


// =============== Pattern 36 ========================================================

//                               * * * * *
//                               * *     *
//                               *   *   *
//                               *     * *
//                               * * * * *

//        int rows = 5;
//        for (int i = 1; i <= rows; i++) {
//            for (int j = 1; j <= rows; j++) {
//                if (i == 1 || i == rows || j == 1 || j == rows || i == j) {
//                    System.out.print("* ");
//                } else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }


// =============== Pattern 37 ========================================================

//        1
//        4 9
//        16 25 36

//        int rows = 3;
//        int num = 1;
//
//        for (int i = 1; i <= rows; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(num * num + " ");
//                num++;
//            }
//
//            System.out.println();
//        }


// =============== Pattern 38 ========================================================

//                          1
//                          4  4
//                          9  9  9
//                          16 16 16 16

//        int rows = 4;
//        for (int i = 1; i <= rows; i++) {
//            for (int j = 1; j <= i; j++) {
//                int num = i * i;
//                System.out.print(num + " ");
//            }
//            System.out.println();
//        }


// =============== Pattern 39 ========================================================

//                              * * * *
//                              *
//                              *
//                              *

//        int rows = 4;
//
//        for (int i = 1; i <= rows; i++) {
//            if (i == 1) {
//                for (int j = 1; j <= rows; j++) {
//                    System.out.print("* ");
//                }
//            } else {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


// =============== Pattern 40 ========================================================

//                                  * * * *
//                                        *
//                                        *
//                                        *

//        int rows = 4;
//        for (int i = 1; i <= rows; i++) {
//            for (int j = 1; j <= rows; j++) {
//                if (i == 1  ||  j == 4) {
//                    System.out.print("* ");
//                } else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }


// =============== Pattern 40 ========================================================

//                             *
//                              *
//                               *
//                                *
//                                 *

//        int rows = 5;
//
//        for (int i = 1; i <= rows; i++) {
//            for (int j = 1; j <= rows; j++) {
//                if (j == i) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }


// =============== Pattern 41 ========================================================

//                                    *
//                                   *
//                                  *
//                                 *
//                                *

//        int rows = 5;
//
//        for (int i = rows; i >= 1; i--) {
//            for (int j = 1; j <= rows; j++) {
//                if (j == i) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }


//=============== Pattern 42 ========================================================

//                                    * * * * *
//         WRONG                                 * *
//                                        *   *
//                                      *     *
//                                    *       *
//
//
//        int rows = 5;
//
//        for (int i = 1; i <= rows; i++) {
//        for (int j = 1; j <= rows; j++) {
//        if (j > rows - i) {
//        System.out.print("* ");
//        } else {
//        System.out.print("  ");
//        }
//        }
//
//        System.out.println();
//        }


//=============== Pattern 43 ========================================================

//        1
//        0 0
//        1 1 1
//        0 0 0 0
//        1 1 1 1 1

//        for (int i=1; i<=5; i++){
//            for(int j=1; j<=i; j++){
//                if (i%2==0){
//                    System.out.print("0 ");
//                }
//                else {
//                    System.out.print("1 ");
//                }
//            }
//            System.out.println();
//        }


//=============== Pattern 44 ========================================================

//        1
//        1 0
//        1 0 1
//        1 0 1 0
//        1 0 1 0 1

//        for (int i=1; i<=5; i++){
//            for(int j=1; j<=i; j++){
//                if (j%2==0){
//                    System.out.print("0 ");
//                }
//                else {
//                    System.out.print("1 ");
//                }
//            }
//            System.out.println();
//        }

//=============== Pattern 45 ========================================================

//        0 1 0 1 0
//        0 1 0 1 0
//        0 1 0 1 0
//        0 1 0 1 0
//        0 1 0 1 0

//        for (int i=1; i<=5; i++){
//            for (int j=1; j<=5; j++){
//                if(j%2==0){
//                    System.out.print("1 ");
//                }
//                else{
//                    System.out.print("0 ");
//                }
//            }
//            System.out.println();
//        }


//=============== Pattern 46 ========================================================

//        1 0 1 0 1
//        1 0 1 0 1
//        1 0 1 0 1
//        1 0 1 0 1
//        1 0 1 0 1

//        for (int i=1; i<=5; i++){
//            for (int j=1; j<=5; j++){
//                if(j%2==0){
//                    System.out.print("0 ");
//                }
//                else{
//                    System.out.print("1 ");
//                }
//            }
//            System.out.println();
//        }

//=============== Pattern 47 ========================================================

//        1 0 1 0 1
//        0 0 0 0 0
//        1 0 1 0 1
//        0 0 0 0 0
//        1 0 1 0 1

//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= 5; j++) {
//                if (i % 2 == 0 || j % 2 == 0){
//                    System.out.print("0 ");
//                } else {
//                    System.out.print("1 ");
//                }
//            }
//            System.out.println();
//        }


//=============== Pattern 48 ========================================================

//                0 1 0 1 0
//                0 0 0 0 0
//                0 1 0 1 0
//                0 0 0 0 0
//                0 1 0 1 0

//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= 5; j++) {
//                if (i % 2 == 0 || j % 2 != 0){
//                    System.out.print("0 ");
//                } else {
//                    System.out.print("1 ");
//                }
//            }
//            System.out.println();
//        }


//=============== Pattern 49 ========================================================

//                1
//                2 4
//                3 6 9
//                4 8 12 16
//                5 10 15 20 25
//
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= i; j++) {
//                int mult = i * j;
//                System.out.print(mult + " ");
//            }
//            System.out.println();
//        }


//=============== Pattern 50 ========================================================

//        1 3 5 7 9
//        3 5 7 9 11
//        5 7 9 11 13
//        7 9 11 13 15
//        9 11 13 15 17

//        int num = 1;
//        for (int i = 1; i <= 9; i+=2) {
//            num = i;
//            for (int j = 1; j <= 5; j++) {
//                System.out.print(num + " ");
//                num+=2;
//            }
//            System.out.println();
//        }


//=============== Pattern 51 ========================================================

//        a b c d
//        e f g h
//        i j k l
//        m n o p

//        char a = 'a';
//        for (int i=1; i<=4; i++){
//            for (int j=1; j<=4; j++){
//                System.out.print(a +" ");
//                a++;
//            }
//            System.out.println();
//        }


//=============== Pattern 52 ========================================================

//        a
//        a b
//        a b c
//        a b c d


//        for (int i=1; i<=4; i++){
//            char a = 'a';
//            for(int j=1; j<=i; j++){
//                System.out.print(a + " ");
//                a++;
//            }
//            System.out.println();
//        }


//=============== Pattern 53 ========================================================

//        a
//        b b
//        c c c
//        d d d d

//        char a = 'a';
//        for (int i=1; i<=4; i++){
//            for(int j=1; j<=i; j++){
//                System.out.print(a + " ");
//            }
//            a++;
//            System.out.println();
//        }


//=============== Pattern 54 ========================================================

//                       *  2  3  4  5
//                       6  *  8  9  10
//                       11 12 *  14 15
//                       16 17 18 *  20
//                       21 22 23 24 *

//        int num = 1;
//        for (int i=1; i<=5; i++){
//            for(int j=1; j<=5; j++){
//                if(j==i){
//                    System.out.print("* ");
//                }
//                else{
//                    System.out.print(num + " ");
//                }
//                num++;
//            }
//            System.out.println();
//        }



//=============== Pattern 54 ========================================================

//        1 2 3 4 *
//        1 2 3 * 5
//        1 2 * 4 5
//        1 * 3 4 5
//        * 2 3 4 5

//        int num = 1;
//        for (int i=1; i<=5; i++){
//            int a =num;
//            for(int j=5; j>=1; j--){
//                if(j==i){
//                    System.out.print("* ");
//                }
//                else{
//                    System.out.print(a+ " ");
//                }
//                a++;
//            }
//            System.out.println();
//        }



//============================ Pattern 55 =============================================
//    int rows = 4;
//    for (int i = 1; i <= rows; i++) {
//        for (int j = 1; j <= i; j++) {
//            System.out.print(j);
//            if (j != i) {
//                System.out.print(" * ");
//            }
//        }
//        System.out.println();
//        }


//============================ Pattern 56 =============================================
//                1
//              1   1
//            1   2   1
//          1   3   3   1
//        1   4   6   4   1

//        int rows = sc.nextInt();
//
//        for (int i = 0; i < rows; i++) {
//            // Print spaces
//            for (int j = 0; j < rows - i; j++) {
//                System.out.print("  ");
//            }
//            int num = 1;
//            for (int j = 0; j <= i; j++) {
//                System.out.print(num + "   ");
//                num = num * (i - j) / (j + 1);
//            }
//            System.out.println();
//        }


//===================== Pattern 57 ====================================

//int rows = sc.nextInt();
//for (int i = 1; i<= rows; i++){
//    for (int j = 1; j <=rows-i; j++){
//        System.out.print("  ");
//    }
//    for (int k = 1; k <= (2*i)-1; k++){
//        System.out.print("* ");
//    }
//    System.out.println();
//}
    }
}




