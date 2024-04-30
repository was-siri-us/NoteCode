package codes;
import java.util.*;


class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int x = sc.nextInt();
        int index = linearSearch(arr, x);
        if(index == -1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index "+index);
        }
    }
}