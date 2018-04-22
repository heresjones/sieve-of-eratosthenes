/* The Sieve of Eratosthenes (in Java)

    By Christopher Jones

    To run this code,

    1. please visit

    https://www.jdoodle.com/online-java-compiler



    2. Copy and Paste all of this file into the textbox "Your code..."
    NOTE: delete anything already in the textbox



    3. Enter a number N into the textbox "Stdin Inputs"



    4. Click execute



    5. Repeat steps 3 and 4



    SUMMARY:

        => To remain true to the algorithm, a Boolean (true/false)

    array is used where the indices of the array are the main number set.

        => This array has all elements set to true.

        => The algorithm begins by traversing this array and marks off non-prime values

    by setting elements to false.

        => At the end of algorithm execution, the Boolean array shall have true values

    remaining at the indices where prime numbers are. There shall be false values at non-primes.

        => The final step of the program consists of reading the boolean array, and where

    a true value is still present, the program shall output a corresponding index.



    PLAN OF EXECUTION:

            A. INPUT:

                ex: 6

            B. Initial array:

                ex:  { true, true, true, true, true, true }

               ALGORITHM:

            C.          Compute Sq root of 6, and nearest integer rounded down

            D.          Count up primes starting at two and ending at the sq root integer

            E.          At each prime value check if each number from 2 to N are divisible

                        by each element of N, for this we use the modulus operator.

                        If the remainder is zero, we have a non-prime.

            F.          We mark off that location on the boolean array as "false"



               ex: Resulting example array after the algorithm:

                    { true, true, true, false, true, false }

            G. OUTPUT:

                ex:

                    1

                    2

                    3

                    5

 */

import java.util.Arrays;

import java.util.Scanner;



public class Main { /* IGNORE more java things*/

    public static void main(String[] args) { /* IGNORE more java requirement*/

        Scanner input = new Scanner(System.in); /* IGNORE more java requirement*/

        /*

          BEGIN THE SIEVE!!!

          STEP A

         */

        int N = input.nextInt();



        /*

          STEP B

          Create an array of true/false values the length of N

          NOTE: "True" locations will eventually only mark primes

          Start with all true

         */

        Boolean[] primeArray = new Boolean[N];

        Arrays.fill(primeArray, true);



        /*

         STEP C

         Find the Square root of N

         NOTE: casting(int) rounds down to the closest int

         */

        int integerN = (int)Math.sqrt(N);



        /*

         STEP D

         start the loop at 2 and end at intergN

         */

        for (int i = 2; i <= integerN; i++){



            /*

            STEP E

            value i is the prime integer

            we will now hold on to that value of i and compare it to every number up to N

            which is labelled as j

            NOTE: j starts at i, the current prime integer, and ends at N,

            per the rules of the Sieve

             */



            for (int j = i; j < N; j++) {

                if (j != i) { //NOTE: save primes from elimination

                        /*

                        STEP F

                        If the modulus operator has a remainder of zero, it is divisible by i

                        and therefore non-prime so, we cross it off

                         */

                    if (j % i == 0) {

                        primeArray[j] = false;

                    }

                }

            }

        }

        /*

        STEP G

        output the array

         */

        for(int k = 1; k < N; k++) {

            if (primeArray[k]) {

                System.out.println(k);

            }

        }

    }

}
