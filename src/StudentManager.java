public class StudentManager extends UserManager{
    @Override
    public void add(User user) {
        System.out.println("Öğrenci : "+ user.getFirstName() +" "+ user.getLastName() + ". Eklenmiştir");

    }

    @Override
    public void delete(User user) {
        System.out.println("Öğrenci : "+ user.getFirstName() +" "+ user.getLastName() + ". Silinmiştir");
    }

    @Override
    public void update(User user) {
        System.out.println("Öğrenci : "+ user.getFirstName() +" "+ user.getLastName() + ". Güncellenmiştir");

    }
    public void getAll(Student[] students){
        for (Student student:students){
            System.out.println(student.getFirstName()+" "+ student.getLastName());
        }
    }
}