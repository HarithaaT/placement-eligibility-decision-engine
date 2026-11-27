
// Imports Java utility classes, including Scanner for reading input.
import java.util.*;

// Starts the application and displays the candidate's eligibility result.
public class Main {

    // Tells the compiler to ignore the warning about how Scanner is closed.
    @SuppressWarnings("ConvertToTryWithResources")
    // The program begins running from this method.
    public static void main(String[] args) {
        // Creates a reader for input entered in the console.
        Scanner scanner = new Scanner(System.in);

        // Reads the candidate's name.
        String name = scanner.next();
        // Reads the candidate's percentage.
        double percentage = scanner.nextDouble();
        // Reads how many backlogs the candidate has.
        int backlogs = scanner.nextInt();
        // Reads the candidate's graduation year.
        int graduationYear = scanner.nextInt();

        int skillCount = scanner.nextInt();
        String[] skills = new String[skillCount];
        for (int i = 0; i < skillCount; i++) {
            skills[i] = scanner.next();
        }

        // Builds a candidate record from the details entered above.
        Candidate candidate = new Candidate(name, percentage, backlogs, graduationYear, skills);
        // Sets the job opening and the requirements used for this eligibility check.

        String[] requiredSkills = {"Java", "SQL"};
        Job job = new Job("Infosys", "Java Developer", 65.0, 0, 2026, requiredSkills);

        // Creates the checker that will apply the eligibility rules.
        EligibilityChecker eligible = new EligibilityChecker();

        // Prints a line to separate the report from other console output.
        System.out.println("================================");
        // Prints the report heading.
        System.out.println("PLACEMENT ELIGIBILITY RESULT");
        // Prints another line beneath the report heading.
        System.out.println("================================");
        // Adds a blank line for readability.
        System.out.println();
        // Shows the candidate's name in the report.
        System.out.println("Candidate : " + candidate.getName());
        // Shows the company's name in the report.
        System.out.println("Company   : " + job.getCompany());
        // Shows the job role in the report.
        System.out.println("Role      : " + job.getRole());
        // Adds space before the final eligibility result.
        System.out.println();
        // Checks whether the candidate passes all of the job's rules.
        if (eligible.evaluate(candidate, job)) {
            // Displays this result when all checks pass.
            System.out.println("Final Result : ELIGIBLE");
            // Handles the case where at least one check does not pass.
        } else {
            // Displays this result when one or more checks fail.
            System.out.println("Final Result : NOT ELIGIBLE");
            // Marks the end of the eligibility result choice.
        }
        // Prints a closing line beneath the report.
        System.out.println("================================");

        // Closes the console input reader when the program is finished.
        scanner.close();
        // Marks the end of the program's main method.
    }
// Marks the end of the Main class.
}
