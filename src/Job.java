
public class Job {

    private final String company;
    private final String role;
    private final double minimumPercentage;
    private final int maximumBacklogs;
    private final int requiredGraduationYear;

    public Job(String role, String company, double minimumPercentage, int maximumBacklogs, int requiredGraduationYear) {
        this.role = role;
        this.company = company;
        this.minimumPercentage = minimumPercentage;
        this.maximumBacklogs = maximumBacklogs;
        this.requiredGraduationYear = requiredGraduationYear;
    }

    public String getRole() {
        return role;
    }

    public String getCompany() {
        return company;
    }

    public double getMinimumPercentage() {
        return minimumPercentage;
    }

    public int getMaximumBacklogs() {
        return maximumBacklogs;
    }

    public int getRequiredGraduationYear() {
        return requiredGraduationYear;
    }
}
