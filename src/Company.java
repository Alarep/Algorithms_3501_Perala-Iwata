public class Company {

    // The parameter for what programmer is preferred by the company.
    private char preferred;

    // The parameter to check if the company has a programmer assigned.
    private boolean isFree;

    Company(char desired, boolean openPos){
        this.preferred = desired;
        this.isFree = openPos;
    }
}