public class Main {

    public static void main(String[] args) {

        char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

        // Programmers for hire
        String[] programmers = {"1", "2", "3", "4", "5"};

        // Companies hiring
        String[] companies = {"A", "B", "C", "D", "E"};

        // Programmer preferences
        String[][] programmerPreferrence = {
                {"B", "A", "C", "D", "E"}, // Programmer preference 1
                {"E", "C", "A", "B", "D"}, // Programmer preference 2
                {"C", "B", "E", "A", "D"}, // Programmer preference 3
                {"D", "E", "B", "A", "C"}, // etc.
                {"A", "D", "E", "C", "B"}
        };

        // Company preference
        String[][] companyPreferrence = {
                {"1", "2", "3", "4", "5"}, // Company A preference
                {"4", "2", "3", "5", "4"}, // Company B preference
                {"4", "5", "3", "2", "1"}, // Company C preference
                {"5", "2", "1", "4", "3"}, // etc.
                {"2", "1", "4", "3", "5"}
        };

        new Main(programmers, companies, programmerPreferrence, companyPreferrence);
    }

    private int N, engagedCount;
    final private String[][] programmerPreference;
    final private String[][] companyPreference;
    final private String[] programmers;
    final private String[] companies;
    final private String[] companyMatch;
    final private boolean[] programmerMatch;

    /** Constructor **/
    public Main(String[] programmer, String[] company, String[][] programmerPreferrence, String[][] companyPreferrence){
        N = programmerPreferrence.length;
        engagedCount = 0;
        programmers = programmer;
        companies = company;
        programmerPreference = programmerPreferrence;
        companyPreference = companyPreferrence;
        programmerMatch = new boolean[N];
        companyMatch = new String[N];
        linkAndMatch();
    }

    private void linkAndMatch() {
        while (engagedCount < N) {
            int free;
            for (free = 0; free < N; free++)
                if (!programmerMatch[free])
                    break;

            for (int i = 0; i < N && !programmerMatch[free]; i++) {
                int index = womenIndexOf(programmerPreference[free][i]);
                if (companyMatch[index] == null) {
                    companyMatch[index] = programmers[free];
                    programmerMatch[free] = true;
                    engagedCount++;
                } else {
                    String currentPartner = companyMatch[index];
                    if (morePreference(currentPartner, programmers[free], index)) {
                        companyMatch[index] = programmers[free];
                        programmerMatch[free] = true;
                        programmerMatch[menIndexOf(currentPartner)] = false;
                    }
                }
            }
        }
        System.out.println("Company Programmer matches are: ");
        for (int i = 0; i < N; i++) {
            System.out.println(companyMatch[i] +" "+ companies[i]);
        }
    }
    /** function to check if women prefers new partner over old assigned partner **/
    private boolean morePreference(String curPartner, String newPartner, int index) {
        for (int i = 0; i < N; i++) {
            if (companyPreference[index][i].equals(newPartner))
                return true;
            if (companyPreference[index][i].equals(curPartner))
                return false;
        }
        return false;
    }
    /** get men index **/
    private int menIndexOf(String str) {
        for (int i = 0; i < N; i++)
            if (programmers[i].equals(str))
                return i;
        return -1;
    }
    /** get women index **/
    private int womenIndexOf(String str) {
        for (int i = 0; i < N; i++)
            if (companies[i].equals(str))
                return i;
        return -1;
    }
}