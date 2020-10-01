# University of Minnesota Morris Algorithms Lab 5
##### Authors: Jack Perala and Machi Iwata

- [Explanation of the Algorithm](#explanation-of-the-algorithm)
- [Why the Algorithm is Correct](#why-the-algorithm-is-correct)
- [Test Data](#test-data)
- [Efficiency of the Algorithm](#efficiency-of-the-algorithm)
- [Citations](#citations)
____


## Explanation of the Algorithm
In order to feed the algorithm data we need to change the values manually in the main block of code. The programmer and 
company arrays are we determine how many programmers/companies to match. The following two sub-arrays
(programmerPreference and companyPreference) are where we define what programmer or company preferences are. There needs
to be an even number of programmers and companies. For example if we have five companies and programmers to pair there
needs to be five sets of preferences for both companies and programmers. After determining the number of companies and
programmers as well as their preferences the algorithm runs through pairing the programmers and companies. If a 
programmer or company prefers another candidate but currently has the position filled the position is swapped with the
preferred candidate, and the freed candidate is then re-assigned to a new position.

## Why the Algorithm is Correct
The algorithm always stops and attempts to find a suitable programmer/company pair. In the case that multiple candidates
have the same preferences the algorithm will find a best fit for available programmers and companies, and an open 
position for whoever is left over.

## Test Data
This is a set of three different testing scenarios that cover the spread of three usual cases.
Included is a short and easily assignable test case, a standard randomly chosen test case, and an unideal case 
where there are multiple matching preferences.
> Short and easily assignable test data.
```
        // Programmers for hire
        String[] programmers = {"1", "2", "3"};

        // Companies hiring
        String[] companies = {"A", "B", "C"};

        // sub-arrays for choosing the preferred company of each programmer.
        String[][] programmerPreferrence = {
                {"A", "B", "C"}, // Programmer preference 1
                {"B", "C", "A"}, // Programmer preference 2
                {"C", "A", "B"}, // Programmer preference 3
        };

        // sub-arrays for choosing the preferred programmer of each company.
        String[][] companyPreferrence = {
                {"1", "2", "3"}, // Company A preference
                {"2", "3", "1"}, // Company B preference
                {"3", "1", "2"}, // Company C preference
        };
```
>> Output:
```
1 A
2 B
3 C
```
> A set of five programmers and companies with random preferences chosen by the user.
```
// Programmers for hire
        String[] programmers = {"1", "2", "3", "4", "5"};

        // Companies hiring
        String[] companies = {"A", "B", "C", "D", "E"};

        // sub-arrays for choosing the preferred company of each programmer.
        String[][] programmerPreferrence = {
                {"B", "A", "C", "D", "E"}, // Programmer preference 1
                {"E", "C", "A", "B", "D"}, // Programmer preference 2
                {"C", "B", "E", "A", "D"}, // Programmer preference 3
                {"D", "E", "B", "A", "C"}, // etc.
                {"A", "D", "E", "C", "B"}
        };

        // sub-arrays for choosing the preferred programmer of each company.
        String[][] companyPreferrence = {
                {"1", "2", "3", "4", "5"}, // Company A preference
                {"4", "2", "3", "5", "4"}, // Company B preference
                {"4", "5", "3", "2", "1"}, // Company C preference
                {"5", "2", "1", "4", "3"}, // etc.
                {"2", "1", "4", "3", "5"}
        };
```
>> Output:
```
5 A
1 B
3 C
4 D
2 E
```
> A set of five programmers and companies with matching preferences to create an unideal case.
```
        // Programmers for hire
        String[] programmers = {"1", "2", "3", "4", "5"};

        // Companies hiring
        String[] companies = {"A", "B", "C", "D", "E"};

        // sub-arrays for choosing the preferred company of each programmer.
        String[][] programmerPreferrence = {
                {"A", "B", "C", "D", "E"}, // Programmer preference 1
                {"A", "B", "C", "D", "E"}, // Programmer preference 2
                {"A", "B", "C", "D", "E"}, // Programmer preference 3
                {"C", "D", "E", "A", "B"}, // etc.
                {"C", "D", "E", "A", "B"}
        };

        // sub-arrays for choosing the preferred programmer of each company.
        String[][] companyPreferrence = {
                {"1", "2", "3", "4", "5"}, // Company A preference
                {"1", "2", "3", "4", "5"}, // Company B preference
                {"1", "2", "3", "4", "5"}, // Company C preference
                {"4", "5", "1", "2", "3"}, // etc.
                {"4", "5", "1", "2", "3"}
        };
```
>> Output:
```
1 A
2 B
3 C
4 D
5 E
```
## Efficiency of the Algorithm
Placeholder

## Citations
Here is the list of citations we used for this lab along with a brief description of their use.

> https://www.tutorialspoint.com/How-to-read-data-from-scanner-to-an-array-in-java
```
Video for visualization and concepts.
```
> https://algorithms.tutorialhorizon.com/stable-marriage-problem-gale-shapley-algorithm-java/
```
One of the websites explaining how to implement the algorithm.
```
> https://github.com/ConnorD/Gale-Shapley/blob/master/StableMatching.java
```
One of the websites explaining how to implement the algorithm.
```
> https://www.sanfoundry.com/java-program-gale-shapley-algorithm/
```
One of the websites explaining how to implement the algorithm.
```