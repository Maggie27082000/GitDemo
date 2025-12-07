import java.util.ArrayList;
import java.util.Scanner;

public class PracticePrograms {
    int temp;
    int max=0;
    int min=0;
    //add a new element in an existing array at a particular index
    public void addNewElement() {
        int[] arr=new int[5];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;

        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }

        arr[1]=3;
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }

    }
    //delete an element from array
    //shift elements to left , remove that index element
    public void deleteElement() {
        int[] arr= {1,2,3,4,5};
        int index=2;
        int size=arr.length;
        for(int i=index;i<arr.length-1;i++) {
            arr[i]=arr[i+1];
        }

        arr[size - 1] = 0; // for int; use null for reference types
        size--;

        for(int i=0;i<arr.length-1;i++) {
            System.out.println(arr[i]);
        }

    }
    //Reverse an array
    public void reverseAnArray() {
        int[] arr= {1,2,3,4,5};
        int[] reverseArray=new int[arr.length];

        for(int i=0;i<arr.length;i++) {
            reverseArray[arr.length-i-1]=arr[i];
        }
        for(int k=0;k<arr.length;k++) {
            System.out.println(reverseArray[k]);
        }


    }
    //find the maximum and minimum element in an array
    public void maxAndMinElementOfArray(){
        int[] arr={2,6,3,1,5};
//        Scanner sc=new Scanner(System.in);
//        int size=sc.nextInt();
//        int[] arr=new int[size];
//        for(int i=0;i<arr.length;i++){
//            arr[i]=sc.nextInt();
//        }
        //print array
        for(int a:arr){
            System.out.println("Print Array: "+a);
        }
        for(int i=0;i<arr.length-1;i++){
            for(int j=i;j<arr.length-i-1;j++){
            if(arr[j]<arr[j+1]) {
                temp = arr[j];
                arr[j] = arr[j+ 1];
                arr[j + 1] = temp;
            }
            }
        }

    }

    public static void main(String[] args) {
        PracticePrograms a=new PracticePrograms();
//		a.addNewElement();
//		a.deleteElement();
//        a.reverseAnArray();
        a.maxAndMinElementOfArray();
    }


}
