public class MVCPatternDemo {
    public static void main(String[] args) {
        Student model = new Student("Alice", "S001", "A");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        controller.updateView();

        System.out.println("\nUpdating student details...\n");
        controller.setStudentName("Bob");
        controller.setStudentGrade("B+");
        controller.updateView();
    }
}