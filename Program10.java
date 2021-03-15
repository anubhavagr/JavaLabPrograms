import java.io.*;

class Program10 {
    public static void main(String[] args){
        // 1.10 Write a program to create a function for adding two numbers. Take input using InputStreamReader and          
        // BufferedReader class object.

        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader reader = new BufferedReader(isr);

            System.out.println("Enter value 1: ");
            String str1 = reader.readLine();
            System.out.println("Enter value 2: ");
            String str2 = reader.readLine();

            int sum = Integer.parseInt(str1) + Integer.parseInt(str2);

            System.out.println("Sum is: " + sum);
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}