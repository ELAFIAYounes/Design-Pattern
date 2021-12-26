package Observer;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("studentName1");
        Student student2 = new Student("studentName2");
        Student student3 = new Student("studentName3");
        Student student4 = new Student("studentName4");
        Student student5 = new Student("studentName5");

        Course course1 = new Course("courseName1");
        Course course2 = new Course("courseName2");

        course1.subscribe(student1);
        course1.subscribe(student2);
        course1.subscribe(student2);

        course2.subscribe(student3);
        course2.subscribe(student5);

        course1.setAvailability(true);
        course2.setAvailability(false);
        course2.setAvailability(true);
        course1.setAvailability(false);


    }
}
