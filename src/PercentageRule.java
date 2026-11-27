
// Checks whether a candidate meets a job's percentage requirement.
public class PercentageRule extends EligibilityRule {

    // Marks this method as the implementation of the parent rule's method.
    @Override
    // Gives this check a readable name for the result.
    public String getRuleName() {
        // Returns the label shown for the percentage check.
        return "Percentage";
    // Marks the end of the rule-name method.
    }

    // Marks this method as the implementation of the parent rule's check.
    @Override
    // Compares the candidate's percentage with the job's minimum.
    public boolean check(Candidate candidate, Job job) {
        // Passes when the candidate meets or exceeds the required percentage.
        return candidate.getPercentage() >= job.getMinimumPercentage();
    // Marks the end of the percentage check.
    }
// Marks the end of the percentage rule.
}
