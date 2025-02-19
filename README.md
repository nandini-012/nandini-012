import java.util.*;
public class Closest {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int closest = findClosest(arr);
        System.out.println(closest);
        sc.close();

    }
    public static int findClosest(int arr[]){
        int closest = arr[0];
        for(int i =1; i<arr.length;i++){
            if(Math.abs(arr[i])< Math.abs(closest)){
                closest =arr[i];
            }else if(Math.abs(arr[i]) == Math.abs(closest)){
                closest = Math.max(closest,arr[i]);
            }
        }
        return closest;
    }

    
}
