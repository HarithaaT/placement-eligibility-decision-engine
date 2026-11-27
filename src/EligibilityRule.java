
// Defines the common methods that every eligibility rule must provide.
public abstract class EligibilityRule {

    // Requires each rule to provide a name for display.
    public abstract String getRuleName();

    // Requires each rule to check a candidate against a job.
    public abstract boolean check(Candidate candidate, Job job);

// Marks the end of the shared eligibility-rule definition.
}
