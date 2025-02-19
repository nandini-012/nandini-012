import java.util.Scanner;
public class AreaCircle {
    public static void main (String args[]){
        System.out.print("Enter radius:");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        System.out.println("Area of Circle is:" + areaCircle(r));

        System.out.print("Enter base side:");

        int a = sc.nextInt();

        System.out.print("Enter height:");
        int h =sc.nextInt();
        System.out.println("Area of Triangle is:" + areaTri(a,h));
        System.out.println("Area of Rectangle is:" + areaRect(a,h));
        

        
        
        


    }
    public static float areaCircle(int r){
        float pi  = 31.14159f;
        float area_Circle = pi*r*r;
        return area_Circle;


    }

    public static double areaTri(int a, int h){
        double area_Tri = 0.5*a*h;
        return area_Tri;

    
}

public static int areaRect(int a, int h){
    int area_rect = a*h;
    return area_rect;
}
}
