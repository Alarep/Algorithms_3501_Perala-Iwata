import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Test");

        // Create arrays of companies and programmers' preferences
        linkAndMatch();
    }

    static void linkAndMatch(){
       Scanner scan = new Scanner(System.in);

        System.out.println("Enter the length of the array for companies:");
        int length = scan.nextInt();
        int [] compPreferenceA = new int[length];
        int [] compPreferenceB = new int[length];
        int [] compPreferenceC = new int[length];
        int [] compPreferenceD = new int[length];
        int [] compPreferenceE = new int[length];


        System.out.println("Enter the elements of the array for company A's preference:");

        for(int i=0; i<length; i++ ) {
            compPreferenceA[i] = scan.nextInt();
        }

        System.out.println("Enter the elements of the array for company B's preference:");

        for(int i=0; i<length; i++ ) {
            compPreferenceB[i] = scan.nextInt();
        }
        System.out.println("Enter the elements of the array for company C's preference:");

        for(int i=0; i<length; i++ ) {
            compPreferenceC[i] = scan.nextInt();
        }

        System.out.println("Enter the elements of the array for company D's preference:");

        for(int i=0; i<length; i++ ) {
            compPreferenceD[i] = scan.nextInt();
        }

        System.out.println("Enter the elements of the array for company E's preference:");

        for(int i=0; i<length; i++ ) {
            compPreferenceE[i] = scan.nextInt();
        }
////////////////////////////
        ///////////////////////////////

        Scanner scan2 = new Scanner(System.in);

        System.out.println("Enter the length of the array for programmers:");
        int length2 = scan2.nextInt();

        String [] proPreference1 = new String [length2];
        String [] proPreference2 = new String [length2];
        String [] proPreference3 = new String [length2];
        String [] proPreference4 = new String [length2];
        String [] proPreference5 = new String [length2];



        System.out.println("Enter the elements of the array for Programmer 1's preference:");

        for(int i=0; i<length; i++ ) {
            proPreference1[i] = scan.next();
        }

        System.out.println("Enter the elements of the array for Programmer 2's preference:");

        for(int i=0; i<length; i++ ) {
            proPreference2[i] = scan.next();
        }

        System.out.println("Enter the elements of the array for Programmer 3's preference:");

        for(int i=0; i<length; i++ ) {
            proPreference3[i] = scan.next();
        }

        System.out.println("Enter the elements of the array for Programmer 4's preference:");

        for(int i=0; i<length; i++ ) {
            proPreference4[i] = scan.next();
        }

        System.out.println("Enter the elements of the array for Programmer 5's preference:");

        for(int i=0; i<length; i++ ) {
            proPreference5[i] = scan.next();
        }

        String CompanyA = Arrays.toString(compPreferenceA);
        String CompanyB = Arrays.toString(compPreferenceB);
        String CompanyC = Arrays.toString(compPreferenceC);
        String CompanyD = Arrays.toString(compPreferenceD);
        String CompanyE = Arrays.toString(compPreferenceE);


        System.out.println("Preference of Company A: " + CompanyA);
        System.out.println("Preference of Company B: " + CompanyB);
        System.out.println("Preference of Company C: " + CompanyC);
        System.out.println("Preference of Company D: " + CompanyD);
        System.out.println("Preference of Company E: " + CompanyE);


        String Programmer1 = Arrays.toString(proPreference1);
        String Programmer2 = Arrays.toString(proPreference2);
        String Programmer3 = Arrays.toString(proPreference3);
        String Programmer4 = Arrays.toString(proPreference4);
        String Programmer5 = Arrays.toString(proPreference5);

        System.out.println("Preference of Programmer 1: " + Programmer1);
        System.out.println("Preference of Programmer 2: " + Programmer2);
        System.out.println("Preference of Programmer 3: " + Programmer3);
        System.out.println("Preference of Programmer 4: " + Programmer4);
        System.out.println("Preference of Programmer 5: " + Programmer5);


    }
}

