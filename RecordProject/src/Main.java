public class Main {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            //public Student(String id, String name, String dateOfBirth, String classList)
            LPAStudent student = switch (i) {
                case 1 -> new LPAStudent("54871", "Mary", "05/03/1998", "Java Basics");
                case 2 -> new LPAStudent("54872", "Nelly", "02/01/1997", "Java Basics");
                case 3 -> new LPAStudent("54873", "Peter", "12/02/1999", "Java Basics");
                case 4 -> new LPAStudent("54874", "Ron", "03/09/1998", "Java Basics");
                case 5 -> new LPAStudent("54875", "Olaf", "05/05/2006", "Java Basics");
                default -> new LPAStudent("Unknown", "Unknown", "Unknown", "Unknown");
            };
            System.out.println(student);
        }
    }
}
