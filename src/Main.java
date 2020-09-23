import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

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
