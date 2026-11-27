
// Checks whether a candidate's graduation year matches the job requirement.
public class GraduationYearRule extends EligibilityRule {

    // Marks this method as the implementation of the parent rule's method.
    @Override
    // Gives this check a readable name for the result.
    public String getRuleName() {
        // Returns the label shown for the graduation-year check.
        return "Graduation Year";
    // Marks the end of the rule-name method.
    }

    // Marks this method as the implementation of the parent rule's check.
    @Override
    // Compares the candidate's graduation year with the required year.
    public boolean check(Candidate candidate, Job job) {
        // Passes only when both graduation years are the same.
        return candidate.getGraduationYear() == job.getRequiredGraduationYear();
    // Marks the end of the graduation-year check.
    }
// Marks the end of the graduation-year rule.
}
