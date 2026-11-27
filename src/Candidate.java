
// Stores the details needed to check a person's placement eligibility.
public class Candidate {

    // Keeps the candidate's name fixed after creation.
    private final String name;
    // Keeps the candidate's percentage fixed after creation.
    private final double percentage;
    // Keeps the candidate's backlog count fixed after creation.
    private final int backlogs;
    // Keeps the candidate's graduation year fixed after creation.
    private final int graduationYear;

    private final String[] skills;

    // Creates a candidate record from their name and eligibility details.
    public Candidate(String name, double percentage, int backlogs, int graduationYear, String[] skills) {
        // Saves the candidate's name.
        this.name = name;
        // Saves the candidate's percentage.
        this.percentage = percentage;
        // Saves the candidate's backlog count.
        this.backlogs = backlogs;
        // Saves the candidate's graduation year.
        this.graduationYear = graduationYear;
        // Marks the end of the candidate constructor.
        this.skills = skills;
    }

    // Provides access to the candidate's name.
    public String getName() {
        // Returns the name stored in this candidate record.
        return name;
        // Marks the end of the name getter.
    }

    // Provides access to the candidate's percentage.
    public double getPercentage() {
        // Returns the percentage stored in this candidate record.
        return percentage;
        // Marks the end of the percentage getter.
    }

    // Provides access to the candidate's backlog count.
    public int getBacklogs() {
        // Returns the backlog count stored in this candidate record.
        return backlogs;
        // Marks the end of the backlogs getter.
    }

    // Provides access to the candidate's graduation year.
    public int getGraduationYear() {
        // Returns the graduation year stored in this candidate record.
        return graduationYear;
        // Marks the end of the graduation-year getter.
    }

    public boolean hasSkill(String requiredSkill) {
        for (String skill : skills) {
            if (skill.equalsIgnoreCase(requiredSkill)) {
                return true;
            }
        }
        return false;
    }
// Marks the end of the candidate class.
}
