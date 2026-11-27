
// Checks whether a candidate's backlog count is within the job's limit.
public class BacklogRule extends EligibilityRule {

    // Marks this method as the implementation of the parent rule's method.
    @Override
    // Gives this check a readable name for the result.
    public String getRuleName() {
        // Returns the label shown for the backlog check.
        return "Backlogs";
    // Marks the end of the rule-name method.
    }

    // Marks this method as the implementation of the parent rule's check.
    @Override
    // Compares the candidate's backlog count with the job's maximum.
    public boolean check(Candidate candidate, Job job) {
        // Passes when the candidate's backlog count is at or below the limit.
        return candidate.getBacklogs() <= job.getMaximumBacklogs();
    // Marks the end of the backlog check.
    }
// Marks the end of the backlog rule.
}
