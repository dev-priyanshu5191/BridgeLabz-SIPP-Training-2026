// Superclass
class LibraryMember {

    String memberName;
    String memberId;

    public LibraryMember(String memberName, String memberId) {
        this.memberName = memberName;
        this.memberId = memberId;
    }

    // Method to calculate fine
    public double calculateFine(int overdueDays) {
        return 0;
    }

    // Method to print details
    public void printDetails() {
        System.out.println("Member Name : " + memberName);
        System.out.println("Member ID   : " + memberId);
    }
}

// Student Member
class StudentMember extends LibraryMember {

    public StudentMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    @Override
    public double calculateFine(int overdueDays) {
        return overdueDays * 2;      // ₹2 per day
    }
}

// Faculty Member
class FacultyMember extends LibraryMember {

    public FacultyMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    @Override
    public double calculateFine(int overdueDays) {
        return overdueDays * 1;      // ₹1 per day
    }
}

// Guest Member
class GuestMember extends LibraryMember {

    public GuestMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    @Override
    public double calculateFine(int overdueDays) {
        return overdueDays * 5;    
    }
}

public class SmartLibrary {

    public static void searchMember(LibraryMember[] members, String id) {

        boolean found = false;

        for (LibraryMember m : members) {
            if (m.memberId.equals(id)) {
                System.out.println("\nMember Found");
                m.printDetails();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nMember not found.");
        }
    }

    public static void main(String[] args) {

        LibraryMember[] members = {
                new StudentMember("Priyanshu", "S101"),
                new FacultyMember("Rahul", "F201"),
                new GuestMember("Ankit", "G301"),
                new StudentMember("Neha", "S102")
        };

        int overdueDays = 5;

        System.out.println("----- Library Members -----\n");


        for (LibraryMember m : members) {

            m.printDetails();

            System.out.println("Fine = Rs. " + m.calculateFine(overdueDays));
            System.out.println("--------------------------");
        }


        searchMember(members, "F201");
    }
}