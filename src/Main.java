public class Main {

    public static void main(String[] args) {

    Student student1 = new Student();
    student1.setFirstName("Ceyhun");
    student1.setLastName("ONAC");
    student1.setStudentId(1);
    student1.setPurchasedCourses(2);

    Student student2 = new Student();
    student2.setFirstName("Sefa");
    student2.setLastName("ONAC");
    student2.setStudentId(2);
    student2.setPurchasedCourses(3);
    Student[] students = new Student[]{student1,student2};

    System.out.println("---------------------------------------------------------------");

    Instructor instructor1 = new Instructor();
    instructor1.setFirstName("Engin");
    instructor1.setLastName("DEMİROG");
    instructor1.setInstructorId(1);
    instructor1.setInstructorRate(10);
    instructor1.setCourses(13);


    Instructor instructor2 = new Instructor();
    instructor2.setFirstName("Mustafa Murat");
    instructor2.setLastName("COSKUN");
    instructor2.setInstructorId(2);
    instructor2.setInstructorRate(10);
    instructor2.setCourses(10);
    Instructor[] instructors  = new Instructor[]{instructor1,instructor2};

    System.out.println("---------------------------------------------------------------");

    StudentManager studentManager= new StudentManager();

    studentManager.add(student1);
    studentManager.delete(student1);
    studentManager.update(student1);

    studentManager.add(student2);
    studentManager.delete(student2);
    studentManager.update(student2);

    System.out.println("---------------------------------------------------------------");

    studentManager.getAll(students);

    System.out.println("---------------------------------------------------------------");

    InstructorManager instructorManager = new InstructorManager();
    instructorManager.add(instructor1);
    instructorManager.delete(instructor1);
    instructorManager.update(instructor1);

    instructorManager.add(instructor2);
    instructorManager.delete(instructor2);
    instructorManager.update(instructor2);

    System.out.println("---------------------------------------------------------------");

    instructorManager.getAll(instructors);



    }
}
