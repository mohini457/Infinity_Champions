package ICP_REVISION_PHASE_4.Week_1.Revision_Phase_Questions;

import java.util.*;

public class Count_Primes {
    public static void main(String[] args) {
        int n=10;
        // System.out.println(bruteforce(n));
        System.out.println(CountPrime(n));
    }

    // --------------------Brute Force approach--------------------------

    // In this approach we 

    public static int bruteforce(int n){
        int count=0;
        for(int i=2;i<n;i++){
            if(isPrime(i)){
                count++;
            }
        }
        return count;
    }
    public static boolean isPrime(int nums){
        for(int i=2;i*i<=nums;i++){
            if(nums%i==0){
                return false;
            }
        }
        return true;
    }

    // ------------------------------------------------------------------------------
    // Optimal approach :- using Sieve of Erathosthenes

    // In this approach we will create a boolean array and mark all the multiples of prime numbers as false.//

    // traversing from 2 to sqrt(n) because any composite number n 

    public static int CountPrime(int n){
        boolean isPrime[]=new boolean[n];
        Arrays.fill(isPrime,true); // initially marking all numbers as prime
        for(int i=2;i*i<n;i++){ // traversing from 2 to sqrt(n)
            if(isPrime[i]){
                for(int j=i*i;j<n;j+=i){
                    isPrime[j]=false;
                }
            }
        }
        int count=0;
        for(int i=2;i<n;i++){
            if(isPrime[i]){
                count++;
            }
        }
        return count;
    }

    
}
