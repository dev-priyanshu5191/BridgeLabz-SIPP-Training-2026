class Course {
    protected String courseName;
    protected int duration;

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void displayCourse() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration);
    }
}

class OnlineCourse extends Course {
    protected String platform;
    protected boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {

        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    public void displayCourse() {
        super.displayCourse();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + isRecorded);
    }
}

class PaidOnlineCourse extends OnlineCourse {

    int fee;
    double discount;

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, int fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    public void displayCourse() {
        super.displayCourse();
        System.out.println("Fee: " + fee);
        System.out.println("Discount: " + discount);
    }
}

public class EducationalCourse {

    public static void main(String[] args) {

        PaidOnlineCourse p = new PaidOnlineCourse("Java Programming",6,"Udemy",true,5000,15);
        p.displayCourse();
    }
}