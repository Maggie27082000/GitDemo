import java.util.Scanner;

public class ForLoops {
    public void forLoop() {
        for (int i = 5; i <= 10; i++) {
            //initialization, condition, increment
            System.out.println(i);
        }
    }

    //Print primeNumbers -- invalid
    public void primeNumbers() {
        Scanner sc = new Scanner(System.in); // Used to give an input
        int number = sc.nextInt();
        if (number % 2 == 1 || number == 2) {
            System.out.println("PrimeNbr");

        } else {
            System.out.println("NotPrimeNbr");

        }

    }

    //Print primeNumbers between 1 to 100
    public void primeNbrs() {
        // Scanner sc=new Scanner(System.in);
//        int number=sc.nextInt();

        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= i / 2; j++) {//2,3,4
                if (i % j == 0) { //99
                    isPrime = false;
                    break;

                }

            }
            if (isPrime == true) {
                System.out.println(i + " is prime");
            }


        }

    }

    //Palindrome - Ex : 121
    public void palindrome() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int nbr1 = 0;
        int originalNbr = a;
        // reminder, / - quo
        while (a != 0) {
            int rem = a % 10;
            nbr1 = nbr1 * 10 + rem;
            a = a / 10;

        }
        if (originalNbr == nbr1) {
            System.out.println("Palindrome");
        }
    }

    //Reverse a string
    public void reverseString() {
        String originalString = "Hi friends";
        String reversedString = "";
        for (int i = originalString.length() - 1; i >= 0; i--) {
            reversedString = reversedString + originalString.charAt(i);
        }
        System.out.println(reversedString);
        System.out.println(originalString);
    }

    //Fibonacci series
    public void fibonacciSeries() {
        int first = 0;
        int second = 1;
        for (int i = 0; i < 10; i++) {
            System.out.println(first);
            int nxt = first + second;
            first = second;
            second = nxt;

        }
    }
    //Print 1 to 100 odd numbers

    public void oddNbrs() {
        for (int i = 2; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i + "is not odd");
            }
        }

    }

    // Print factorial -- Factorial of 6 -- 6*5*4*3*2*1
    public void factorial() {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int factorial1 = 1;

        for (int i = num; i >= 1; i--) {
            factorial1 =factorial1* i; // or fact*=i;
        }
        System.out.println(factorial1);
    }
    //

    //Print sum of 1 to 100 natural num
    public void naturalNum(){
        int sum=0;
        for(int i=1;i<=100;i++){
            sum+=i;
        }
        System.out.println(sum);

    }
    //Find the sum of all even and odd digits of a given number separately using loops - 13476
    public void sumOfOddAndEvenDigits(){
        Scanner sc=new Scanner(System.in);
        String num=sc.next();
        int oddSum=0,evenSum=0;

        for(int i=0;i<num.length();i++){
         char c= num.charAt(i);
         int d= Character.getNumericValue(c);
         if(d%2==0){
             evenSum+=d;
         }
         else{
             oddSum+=d;
         }

        }
        System.out.println("Even sum : " +  evenSum  + " Odd sum : " + oddSum);

    }
//Print multiplication tables.
    public void printMultiplicationTables(){
        
    }

    public static void main(String[] args) {
        ForLoops f = new ForLoops();
        //f.forLoop();
        //f.primeNumbers();
//        f.primeNbrs();
//        f.fibonacciSeries();
//        f.palindrome();
        //f.oddNbrs();
//        f.factorial();
//        f.naturalNum();
//        f.sumOfOddAndEvenDigits();
        f.printMultiplicationTables();
    }
}
