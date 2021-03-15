import java.util.Scanner;

class Program8 {
    public static void main(String[] args){
        // 1.8 Write a program to read two values using Scanner class object and print the greatest.
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value 1: ");
        String str1 = sc.nextLine();
        System.out.println("Enter value 2: ");
        String str2 = sc.nextLine();

        int val1 = Integer.parseInt(str1);
        int val2 = Integer.parseInt(str2);

        int greatest;
        
        if(val1 > val2) greatest = val1;
        else greatest = val2;

        System.out.println("Greatest is: " + greatest);
    }
}