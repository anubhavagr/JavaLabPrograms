import java.util.Scanner;

class Program7 {
    public static void main(String[] args){
        // 1.7 Write a program to read age using Scanner class object and
        // print whether the person is child,adult or elderly.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age: ");
        String str1 = sc.nextLine();
        int age = Integer.parseInt(str1);
        
        if(age > 0 && age < 18)
            System.out.println("Child");
        else if(age > 18 && age < 50)
            System.out.println("Adult");
        else if(age > 50)
            System.out.println("Elderly");
    }
}