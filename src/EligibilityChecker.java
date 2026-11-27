
// Applies all eligibility rules to a candidate for a job.
public class EligibilityChecker {

    // Stores the rules that every candidate must pass.
    private final EligibilityRule rules[];

    // Creates the checker and prepares the eligibility rules.
    public EligibilityChecker() {
        // Sets up the percentage, backlog, and graduation-year checks.
        rules = new EligibilityRule[]{new PercentageRule(), new BacklogRule(), new GraduationYearRule()};
    // Marks the end of the checker constructor.
    }

    // Runs every rule and reports whether the candidate passes them all.
    public boolean evaluate(Candidate candidate, Job job) {
        // Assumes the candidate is eligible until a rule fails.
        boolean eligible = true;
        // Checks each rule in the configured list.
        for (EligibilityRule rule1 : rules) {
            // Runs the current rule for this candidate and job.
            boolean pass = rule1.check(candidate, job);
            // Handles a rule that the candidate passes.
            if (pass) {
                // Prints the name of the rule and its passing result.
                System.out.println(rule1.getRuleName() + ": PASS");
            // Handles a rule that the candidate does not pass.
            } else {
                // Prints the name of the rule and its failing result.
                System.out.println(rule1.getRuleName() + ": FAIL");
                // Records that the candidate did not meet every requirement.
                eligible = false;
            // Marks the end of the current rule's result choice.
            }
        // Marks the end of the loop through all rules.
        }
        // Returns whether every eligibility rule passed.
        return eligible;
    // Marks the end of the evaluation method.
    }
// Marks the end of the eligibility checker.
}
