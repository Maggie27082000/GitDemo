import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArraysPractice {
    Scanner sc = new Scanner(System.in);
    int length,i;
    int[] a,b,c;
    public void PrintElementsInArray() {
        System.out.println("Enter size");
         length = sc.nextInt();
        a = new int[length];
        for ( i = 0; i < length; i++) {
            a[i] = sc.nextInt();
            System.out.println(a[i]);
        }
    }
   // Find the maximum and minimum element in an array
    //Logic - Consider mix and max as first elements, iterate th
   // rough the loop and compare with next elements and update the min/max
    public void MaxAndMinElementOfArray(){
        int[] a={3,6,4,2,8};
        int size=a.length;
        int max=a[0];
        int min=a[0];
        for(i=1;i<size;i++){
            if(max<a[i]){
                max=a[i];
            }
            if(min>a[i]){
                min=a[i];
            }
        }
        System.out.println(max);
        System.out.println(min);

    }
    //Sum all elements in an array
   public void sumOfElementsInArray(){
        int[] a={1,2,3,4};
        int sum=0;
       int size=a.length;
       for(i=0;i<size;i++){
           sum+=a[i];//sum=sum+a[i];
       }
       System.out.println(sum);

    }
    //Find the frequency of a given element.
    public void FrequencyOfElement(){
        int[] a={1,1,1,2,2,3,3,3,3};
        int count=0;
        int size=a.length;
        for(i=0;i<size;i++){
            int b=sc.nextInt();
            if(b==a[i]){
                count++;
            }
        }
        System.out.println(count);

    }
    //Print only unique elements.
    public void UniqueElementsInArray() {
        int[] a = { 5, 2, 2, 3, 4, 5 };

        for (i = 0; i < a.length; i++) {
            int count = 0;
            for (int j =0; j < a.length ; j++) {
                if (i!=j && a[i] == a[j]) {
                    count++;
                }

            }
            if(count==0){
                System.out.println(a[i]);
            }

        }
    }
    //Insert an element at a given position
    public void InsertAnElementAtGivenPosition(){
        int[] a={1,2,3,4};
        int position=sc.nextInt();
        int element=sc.nextInt();
        a[position]=element;
        for(i=0;i<a.length;i++) {
            System.out.println(a[i]);
        }
    }
    //Delete an element from the array.
    public void DeleteElement(){
        int[] a={1,2,3,4};
        int position=sc.nextInt();
        int element=sc.nextInt();




    }
    //Search for a value in an array.
    public void SearchForValue(){
        int[] a={1,2,3,4,5};
        int b=sc.nextInt();
        int count=0;
        for(i=0;i<a.length;i++){
            if(b==a[i]){
                System.out.println("Element Found");
                count++;
            }
        }
        if(count==0){
            System.out.println("Element Not Found");
        }


    }
    //Check if an array is sorted
    public void CheckIfArrayIsSorted(){
        int[] a={1,2,5,4};
        int count=0;
        int size=a.length;
        int[] d=new int[size];
        d[i]=a[i];
        int temp;
        for(i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            int[] c=new int[size];
            c[i]=a[i];
            System.out.println(c[i]);
            if(d[i]==c[i]){

                System.out.println("Array is sorted");
            }

        }
        for(i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            int[] b=new int[size];
            b[i]=a[i];
            System.out.println(b[i]);
            if(d[i]==b[i]){

                System.out.println("Array is sorted");
            }
        }

    }
    //Delete an element from the array.\
    public void DeleteAnArrayElement(){
        int[] a={1,2,3,4,5};
        System.out.println("Index of element to be deleted");
        int b=sc.nextInt();
        for(i=b;i<a.length-1;i++){
            a[i]=a[i+1];
        }
        for(i=0;i<a.length-1;i++){
            System.out.println(a[i]);
        }


    }
    //Merge two arrays into one
    public void MergeTwoArrays(){
        int[] a={1,2,3,4,5};
        int[] b={6,7,8,9,10,11};
        int size=a.length;
        int size1=b.length;
        int originalSize=size+size1;
        int[] c = new int[originalSize];
        for(i=0;i<a.length;i++){
            c[i]=a[i];
        }
        for(i=0;i<b.length;i++){
            c[a.length+i]=b[i];
        }
        for(i=0;i<c.length;i++){
           System.out.println(c[i]+"");
        }

    }
    //Copy elements from one array to another.
    public void copyElementsFromOneArrayToAnother(){
       int[] a={1,2,3,4,5};
       int[] b=new int[a.length];
        for(i=0;i<a.length;i++){
            b[i]=a[i];
            System.out.println(b[i]);
        }
//        System.out.println(b[i]); if we are printing outside loop we will get index ou of bound exception


    }
    //Find second largest or smallest number.
    public void secondLargestNumber(){
        int[] a={2,3,5,4,1};
        int temp=0;
        int[] b=new int[a.length];
        for(i=0;i<a.length;i++){
            for(int j=0;j<a.length-1;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }

            }

        }
        System.out.println(a[a.length-2]);


    }
    //Print 2D/multidimensional array
    public void printMultidimensionalArray(){
      int[][] a=new int[2][3];
      a[0][0]=1;
      a[0][1]=2;
      a[0][2]=3;
      a[1][0]=4;
      a[1][1]=5;
      a[1][2]=6;
      for(i=0;i<a.length;i++){
      for(int j=0;j<3;j++){
          System.out.println(a[i][j]);
      }

      }

    }

    public static void main(String[] args) {
        ArraysPractice c = new ArraysPractice();
        //c.PrintElementsInArray();
//        c.MaxAndMinElementOfArray();
//        c.sumOfElementsInArray();
//        c.FrequencyOfElement();
//         c.UniqueElementsInArray();
//        c.InsertAnElementAtGivenPosition();
//        c.SearchForValue();
//        c.CheckIfArrayIsSorted();
//        c.DeleteAnArrayElement();
//        c.MergeTwoArrays();
//        c.copyElementsFromOneArrayToAnother();
//        c.secondLargestNumber();
        c.printMultidimensionalArray();
    }
}
