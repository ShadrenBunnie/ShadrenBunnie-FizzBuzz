
public class Lab {
    /**
     * Return "Fizz" if a number n is divisible by 3, "Buzz" if divisible by 5, and "FizzBuzz" if divisible by both.
     *
     * This is coding problem that will make use of the modulus (%) operator, which can help us calculate if a number
     * is perfectly divisible by another number.
     * The modulus operator returns the remainder after a division (eg 8%3=2).
     *
     * If you try to copy answers from the internet, you will probably get this challenge wrong. The premise is
     * slightly simpler than the classic fizzbuzz problem.
     *
     * @param n the number that will determine the fizzbuzz result.
     * @return if a number is divisible by 3, return 'Fizz'. if a number is divisible by 5, return 'Buzz'. If
     * divisible by both, return 'FizzBuzz'. If none of these are true, return a blank string "".
     */

     /** The goal of this challenge is to determine which string line to be printed based upon
      * the divisible number
      * if n %3 = 0
      *     return "Fizz"
      * if n %5 = 0
      *      return "Buzz"
      * if n %3 = 0 & n %5 = 0
      *    return "FizzBuzz"
      *else
      *     return ""
      * 
      * @param n
      * @return
      */
    public String FizzBuzzGen(int n){
        if (n%3==0 && n%5 ==0){
            return "FizzBuzz";
        }else if(n%3==0){
            return "Fizz";
        }else if(n%5==0){
            return "Buzz";
        }else{
            return "";
        }
    }
}
