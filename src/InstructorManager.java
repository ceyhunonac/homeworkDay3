public class InstructorManager extends UserManager {
    @Override
    public void add(User user) {
        System.out.println("Eğitmen : "+ user.getFirstName() +" "+ user.getLastName() + ". Eklenmiştir");

    }

    @Override
    public void delete(User user) {
        System.out.println("Eğitmen : "+ user.getFirstName() +" "+ user.getLastName() + ". Silinmiştir");
    }

    @Override
    public void update(User user) {
        System.out.println("Eğitmen : "+ user.getFirstName() +" "+ user.getLastName() + ". Güncellenmiştir");

    }
    public void getAll(Instructor[] instructors){
        for (Instructor instructor:instructors){
            System.out.println(instructor.getFirstName() +" "+ instructor.getLastName());
        }
    }
}