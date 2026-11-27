
// Defines the details of a job opening.
public class Job {

    // Keeps the company name fixed after this job is created.
    private final String company;
    // Keeps the job title fixed after this job is created.
    private final String role;
    // Stores the minimum percentage a candidate needs.
    private final double minimumPercentage;
    // Stores the most backlogs a candidate may have.
    private final int maximumBacklogs;
    // Stores the graduation year required for this job.
    private final int requiredGraduationYear;

    private final String[] requiredSkills;

    // Creates a job using its role, company, and eligibility requirements.
    public Job(String company, String role, double minimumPercentage, int maximumBacklogs, int requiredGraduationYear, String[] requiredSkills) {
        // Saves the provided company in this job.
        this.company = company;
        // Saves the provided role in this job.
        this.role = role;
        // Saves the required minimum percentage.
        this.minimumPercentage = minimumPercentage;
        // Saves the allowed maximum number of backlogs.
        this.maximumBacklogs = maximumBacklogs;
        // Saves the required graduation year.
        this.requiredGraduationYear = requiredGraduationYear;

        this.requiredSkills = requiredSkills;
        // Marks the end of the job constructor.
    }

    // Provides access to this job's role.
    public String getRole() {
        // Returns the role stored in this job.
        return role;
        // Marks the end of the role getter.
    }

    // Provides access to this job's company.
    public String getCompany() {
        // Returns the company stored in this job.
        return company;
        // Marks the end of the company getter.
    }

    // Provides access to the minimum percentage requirement.
    public double getMinimumPercentage() {
        // Returns the minimum percentage stored in this job.
        return minimumPercentage;
        // Marks the end of the minimum percentage getter.
    }

    // Provides access to the maximum backlog allowance.
    public int getMaximumBacklogs() {
        // Returns the maximum backlog count stored in this job.
        return maximumBacklogs;
        // Marks the end of the maximum backlogs getter.
    }

    // Provides access to the required graduation year.
    public int getRequiredGraduationYear() {
        // Returns the graduation year stored in this job.
        return requiredGraduationYear;
        // Marks the end of the graduation year getter.
    }

    public String[] getRequiredSkills() {
        return requiredSkills;
    }
// Marks the end of the Job class.
}
