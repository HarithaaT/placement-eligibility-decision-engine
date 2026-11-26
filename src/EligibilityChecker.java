
public class EligibilityChecker {

    private final EligibilityRule rules[];

    public EligibilityChecker() {
        rules = new EligibilityRule[]{new PercentageRule(), new BacklogRule(), new GraduationYearRule()};
    }

    public boolean evaluate(Candidate candidate, Job job) {
        boolean eligible = true;
        for (EligibilityRule rule1 : rules) {
            boolean pass = rule1.check(candidate, job);
            if (pass) {
                System.out.println(rule1.getRuleName() + ": PASS");
            } else {
                System.out.println(rule1.getRuleName() + ": FAIL");
                eligible = false;
            }
        }
        return eligible;
    }
}
