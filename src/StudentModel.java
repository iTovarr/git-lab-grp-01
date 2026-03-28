public class StudentModel {
    private int id;
    private String nombre;
    private String apellido;

    // Constructor
    public StudentModel(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Getters
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }

    @Override
    public String toString() {
        return "ID: " + id + " | Nombre: " + nombre + " " + apellido;
    }
}