import java.util.*;
import java.io.*;
public class randomCase {
    public static void main(String[] args) throws IOException {
        //Generates a random integer with specified range. Made by Ian
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("random.txt")));
        Scanner br = new Scanner(System.in);
        System.out.println("What is your min value?");
        int start = Integer.parseInt(br.nextLine());
        System.out.println("What is your max value?");
        int end = Integer.parseInt(br.nextLine());
        System.out.println("How many times would you like to repeat the randomness?");
        int iter = Integer.parseInt(br.nextLine());
        System.out.println("Would you like to print to output? 1 for YES, 0 for NO");
        int res = Integer.parseInt(br.nextLine());
        Random generate = new Random();
        for(int i = 0; i < iter; i++){
            int num = generate.nextInt(end - start + 1) + start;
            if(res == 1)
                out.println(num);
            System.out.println(num);
        }
        out.close();
    }
}
