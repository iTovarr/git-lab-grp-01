import java.util.ArrayList;
import java.util.List;

public class StudentController {

    public List<String> getStudents() {
        List<String> students = new ArrayList<>();
        // Lógica agregada por el Responsable
        students.add("Admin - Sistema Inicializado");
        System.out.println("Listando estudiantes desde el controlador...");
        return students;
    }

    public static void main(String[] args) {
        StudentController controller = new StudentController();
        System.out.println(controller.getStudents());
    }
}

//
//