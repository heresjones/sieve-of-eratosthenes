# sieve-of-eratosthenes-java
Sieve of Eratosthenes in Java

by Christopher Jones

=> This is a version of the legendary Number Theory algorithm with heavy commenting for non-programmers and math geeks. 


https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes

## To run this code,
    
    1. please visit
    
    https://www.jdoodle.com/online-java-compiler
    
    2. Copy and Paste all of this file into the textbox "Your code..."
    NOTE: delete anything already in the textbox
    
    3. Enter a number N into the textbox "Stdin Inputs"
    
    4. Click execute
    
    5. Repeat steps 3 and 4
    
## SUMMARY:
    
        => To remain true to the algorithm, a Boolean (true/false)
    array is used where the indices of the array are the main number set.
    
        => This array has all elements set to true.
        
        => The algorithm begins by traversing this array and marks off non-prime values
    by setting elements to false.
    
        => At the end of algorithm execution, the Boolean array shall have true values
    remaining at the indices where prime numbers are. There shall be false values at non-primes.
    
        => The final step of the program consists of reading the boolean array, and where
    a true value is still present, the program shall output a corresponding index.
    
## PLAN OF EXECUTION:
            A. INPUT:
            
                ex: 6
                
            B. Initial array:
            
                ex:  { true, true, true, true, true, true }
           
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
