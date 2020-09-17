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
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the length of the array for companies:");
        int length = scan.nextInt();
        int [] compPreferenceA = new int[length];
        int [] compPreferenceB = new int[length];

        System.out.println("Enter the elements of the array for company A's preference:");

        for(int i=0; i<length; i++ ) {
            compPreferenceA[i] = scan.nextInt();
        }

        System.out.println("Enter the elements of the array for company B's preference:");

        for(int i=0; i<length; i++ ) {
            compPreferenceB[i] = scan.nextInt();
        }
        String CompanyA = Arrays.toString(compPreferenceA);
        String CompanyB = Arrays.toString(compPreferenceB);

        System.out.println(CompanyA);
        System.out.println(CompanyB);






        // preference(companyPreference, programmerPreference);



    }

    static void linkAndMatch(){
        Scanner sc = new Scanner(System.in);
    }
}
