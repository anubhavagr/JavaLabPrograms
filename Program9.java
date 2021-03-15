import java.io.*;

class Program9 {
    public static void main(String[] args){
        // 1.9 Write a program to read any number of values using
        // InputStreamReader and BufferedReader class object and print the average.
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(isr);

        try {
            int totalSum = 0;
            int enteredNumbers = 0;

            while(true) {
                System.out.println("Enter a value or 'no' to stop: ");
                String val = reader.readLine();
                if(val.equals("no")) {
                    break;
                } else {
                    totalSum += Integer.parseInt(val);
                    enteredNumbers++;
                }
            }

            System.out.println("Average is: " + (totalSum/enteredNumbers));
        } catch(Exception e) {
          System.out.println(e.toString());
        }
    }
}