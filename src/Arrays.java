import java.util.Scanner;

public class Arrays {
    //Write a program to read n integers to the array and print them
    public void printArrays() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] b = new int[a];
        for (int i = 0; i < a; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < a; i++) {
            System.out.println(b[i]);

        }

    }

    //Write a program to calculate the sum of all elements in an integer array
    public void sumOfElementsInArray() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        int[] b = new int[a];
        for (int i = 0; i < a; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < a; i++) {
            sum += b[i]; // compoundArithmeticOperators
        }
        System.out.println(sum);

    }

    //Max and min element of a array
    public void maxAndMinOfArray() {
        int[] a = {1, 2, 3, 4, 5};
        int max = a[0];
        int min = a[0];
        for (int i = 0; i <= a.length - 1; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println(max);
        System.out.println(min);

    }

    //Write a program to reverse the elements of an array and print the reversed array.
    public void reverseElements() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the input: ");
            a[i] = sc.nextInt();
        }

//        int[] a = {1, 2, 3, 4, 5};
        int[] b = new int[a.length];
        for (int i = a.length - 1; i >= 0; i--) {
            b[(b.length - 1) - i] = a[i];

        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }


    }

    //Print index of array
    public void arrayIndex() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        int b = sc.nextInt();
        System.out.println("Find the index of " + b);
        for (int i = 0; i < size; i++) {
            if (a[i] == b) {
                System.out.println(i);
                //break;
            }

        }

    }

    //Write a program to count how many even and odd numbers are in an array.
    public void evenOddInArray() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] a = new int[size];
        int count = 0, count1 = 0;
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            if (a[i] % 2 == 0) {
                System.out.println("Number is even" + a[i]);
                count++;
            } else {
                System.out.println("Number is odd" + a[i]);
                count1++;
            }
        }
        System.out.println("Even count " + count);
        System.out.println("Odd count " + count1);

    }

    //Array in ascending order
    public void ascendingOrder() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] a = new int[size];
        int temp = 0;
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;

                }
            }

        }
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }

    }

    //   Write a program to insert a new element at a given position in an array
    public void insertNewElemt() {
        Scanner sc = new Scanner(System.in);
        System.out.println("size");
        int size = sc.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.println("\nindex to be changed");
        int b = sc.nextInt();
        System.out.println("value to be changed");
        int temp = sc.nextInt();
        a[b] = temp;
        for (int i = 0; i < size; i++) {
            System.out.print(" " + a[i]);
        }


    }


    public static void main(String[] args) {
        Arrays c = new Arrays();
//        c.printArrays();
//        c.sumOfElementsInArray();
//        c.maxAndMinOfArray();
        //c.reverseElements();
//        c.arrayIndex();
//        c.evenOddInArray();
        c.ascendingOrder();
//        c.insertNewElemt();
    }
}
