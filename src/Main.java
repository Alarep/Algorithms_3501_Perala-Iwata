import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
/*
                String programmerPreference[][] = new String[][] {
                        {"E","A","D","B","C"}, // Programmer 1
                        {"E","E","B","A","C"}, // Programmer 2
                        {"D","B","C","E","A"}, // Programmer 3
                        {"C","B","D","A","E"}, // Programmer 4
                        {"A","D","B","C","E"}  // Programmer 5
                };
                int companyPreference[][] = new int[][] {
                        {2,5,1,3,4,}, // Company A
                        {1,2,3,4,5,}, // Company B
                        {5,3,2,1,4,}, // Company C
                        {1,3,2,4,5,}, // Company D
                        {2,3,5,4,1,}  // Company E
                };

                // Or use scan to get programmers and companies preference */

    }

    static void linkAndMatch(int n){

        Scanner scan = new Scanner(System.in);

        // User input to determine the number of companies and programmers.
        System.out.println("Please enter the number of companies and programmers to be paired.");
        n = scan.nextInt();

        ArrayList<Character> companies = new ArrayList<>();
        ArrayList<Integer> programmers = new ArrayList<>();

        char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        for(int i = 0; i < n; i++ ) {
            companies.add(i, alphabet[i]);
        }
    }
}
