import java.lang.reflect.AnnotatedArrayType;
import java.time.LocalDate;
import java.util.Date;

public class Estudiante{
    private String nombre;
    private Date fechaNacimiento;
    private double materia1;
    private double materia2;
    private double materia3;

    public Estudiante(String nombre, Date fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.materia1 = 4.0;
        this.materia2 = 3.0;
        this.materia3 = 4.5;
    }

    public int getEdad(){
        LocalDate hoy = LocalDate.now();
        int edad= fechaNacimiento - LocalDate hoy;
        return  edad ;
    }

    public double getPromedio(){
        double suma = (materia1+materia2+materia3);
        double promedio = suma /3;
return promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public double getMateria1() {
        return materia1;
    }

    public double getMateria2() {
        return materia2;
    }

    public double getMateria3() {
        return materia3;
    }

    public void setMateria1(double materia1) {
        this.materia1 = materia1;
    }

    public void setMateria2(double materia2) {
        this.materia2 = materia2;
    }

    public void setMateria3(double materia3) {
        this.materia3 = materia3;
    }
}
