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

    static void linkAndMatch(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the length of the array for companies:");
        int length = scan.nextInt();
        ArrayList<Company> companies = new ArrayList<>();
        ArrayList<Programmer> programmers = new ArrayList<>();

        System.out.println("Enter the elements of the array for company A's preference:");

        for(int i=0; i<length; i++ ) {
            int companyPreference = scan.nextInt();
            companies.add(i, companyPreference);
        }

        System.out.println("Enter the elements of the array for company B's preference:");

        for(int i=0; i<length; i++ ) {
            compPreferenceB[i] = scan.nextInt();
        }
        String CompanyA = Arrays.toString(compPreferenceA);
        String CompanyB = Arrays.toString(compPreferenceB);

        System.out.println(CompanyA);
        System.out.println(CompanyB);
    }
}
